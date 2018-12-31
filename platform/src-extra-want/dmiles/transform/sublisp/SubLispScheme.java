// Copyright (c) 2001, 2004, 2005  Per M.A. Bothner.
// This is free software;  for terms and warranty disclaimer see ./COPYING.

package dmiles.transform.sublisp;

import gnu.bytecode.CodeAttr;
import gnu.bytecode.ObjectType;
import gnu.bytecode.Type;
import gnu.commonlisp.lang.defun;
import gnu.commonlisp.lang.defvar;
import gnu.commonlisp.lang.function;
import gnu.commonlisp.lang.prog1;
import gnu.commonlisp.lang.setq;
import gnu.expr.Compilation;
import gnu.expr.Declaration;
import gnu.expr.Expression;
import gnu.expr.Keyword;
import gnu.expr.Language;
import gnu.expr.QuoteExp;
import gnu.jemacs.lang.defcustom;
import gnu.jemacs.lang.defgroup;
import gnu.jemacs.lang.lambda;
import gnu.kawa.functions.DisplayFormat;
import gnu.kawa.functions.NumberCompare;
import gnu.kawa.lispexpr.LangPrimType;
import gnu.kawa.lispexpr.LispReader;
import gnu.kawa.lispexpr.ReadTable;
import gnu.kawa.lispexpr.ReaderDispatchMisc;
import gnu.kawa.lispexpr.ReaderVector;
import gnu.kawa.reflect.FieldLocation;
import gnu.lists.AbstractFormat;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.EnvironmentKey;
import gnu.mapping.Location;
import gnu.mapping.LocationEnumeration;
import gnu.mapping.Named;
import gnu.mapping.NamedLocation;
import gnu.mapping.Namespace;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleEnvironment;
import gnu.mapping.Symbol;
import gnu.text.Char;
import gnu.text.Lexer;
import gnu.text.SyntaxException;
import kawa.standard.Scheme;

public class SubLispScheme extends SubScheme {
    //  LangPrimType booleanType;

    SubLispScheme() {
        this.environ = SubLispScheme.elispEnvironment;
    }

    public SubLispScheme(SimpleEnvironment kawaEnvironment) {
        super(kawaEnvironment);
        this.environ = SubLispScheme.clispEnvironment;
    }

    public Object booleanObject(boolean b) {
        if (b)
            return SubLispScheme.TRUE;
        else
            return SubLispScheme.FALSE;
    }

    public ReadTable createReadTable() {
        //ReadTable tab = new Lisp2ReadTable();
        //tab.initialize();
        //return tab;
        final ReadTable rt = super.createReadTable();
        rt.set('[', new ReaderVector(']'));
        rt.remove(']');
        rt.set('?', new ELispReadTableEntry('?'));
        return rt;
    }

    private void defun(Procedure proc) {
        this.defun(proc.getName(), proc);
    }

    protected void defun(String name, Object value) {
        this.environ.define(this.getSymbol(name), EnvironmentKey.FUNCTION, value);
        if (value instanceof Named) {
            final Named n = (Named) value;
            if (n.getName() == null) n.setName(name);
        }
    }

    protected void defun(Symbol sym, Object value) {
        this.environ.define(sym, EnvironmentKey.FUNCTION, value);
        if (value instanceof Procedure) {
            final Procedure n = (Procedure) value;
            if (n.getSymbol() == null) n.setSymbol(sym);
        }
    }

    public void emitPushBoolean(boolean value, CodeAttr code) {
        if (value)
            code.emitGetStatic(ObjectType.make("gnu.commonlisp.lang.Lisp2").getDeclaredField("TRUE"));
        else
            code.emitGetStatic(Compilation.scmListType.getDeclaredField("Empty"));
    }

    protected Symbol fromLangSymbol(Object obj) {
        if (obj == LList.Empty) return this.environ.getSymbol("nil");
        return super.fromLangSymbol(obj);
    }

    public Object getEnvPropertyFor(java.lang.reflect.Field fld, Object value) {
        if (Compilation.typeProcedure.getReflectClass().isAssignableFrom(fld.getType()) || (value instanceof kawa.lang.Syntax)) return EnvironmentKey.FUNCTION;
        return null;
    }

    public AbstractFormat getFormat(boolean readable) {
        return readable ? SubLispScheme.writeFormat : SubLispScheme.displayFormat;
    }

    public String getName() {
        return "Emacs-SubLisp-Scheme";
    }

    public int getNamespaceOf(Declaration decl) {
        // This is a kludge because the hygiene renameing in SyntaxRules
        // (which is used for some macros that Lisp uses) doesn't distinguish
        // function and variable position.
        if (decl.isAlias()) return Language.FUNCTION_NAMESPACE + Language.VALUE_NAMESPACE;
        return decl.isProcedureDecl() ? Language.FUNCTION_NAMESPACE : Language.VALUE_NAMESPACE;
    }

    public Type getTypeFor(Class clas) {
        if (clas.isPrimitive()) {
            final String name = clas.getName();
            if (name.equals("boolean")) {
                if (SubScheme.booleanType == null) SubScheme.booleanType = new LangPrimType(Type.boolean_type, this);
                return SubScheme.booleanType;
            }
            return Scheme.getNamedType(name);
        }
        return Type.make(clas);
    }

    public Type getTypeFor(String name) {
        if (name == "t")
            name = "java.lang.Object";
        else if (name == "marker")
            name = "gnu.jemacs.buffer.Marker";
        else if (name == "buffer")
            name = "gnu.jemacs.buffer.Buffer";
        else if (name == "window") name = "gnu.jemacs.buffer.Window";
        return Scheme.string2Type(name);
    }

    //   protected Object makeSymbol(String name) {
    //     return super.makeSymbol(name);
    //}

    public boolean hasSeparateFunctionNamespace() {
        return true;
    }

    protected void importLocation(Location loc) {
        final Symbol name = ((NamedLocation) loc).getKeySymbol();
        if (this.environ.isBound(name, EnvironmentKey.FUNCTION)) return;
        Object val;
        loc = loc.getBase();
        // Disable the following, for now, if using GCJ.  It hangs when using GCJ.
        // The problem appears to be with a _Jv_Field for a static field
        // that is in a BSS segment; the address in the _Jv_Field doesn't
        // get initialized.  FIXME.
        // (We do need to use this for JEmacs.  Sigh.)
        if ((loc instanceof FieldLocation) && ((FieldLocation) loc).isProcedureOrSyntax()) {
            this.environ.addLocation(name, EnvironmentKey.FUNCTION, loc);
        } else if ((val = loc.get(null)) != null) {
            if ((val instanceof Procedure) || (val instanceof kawa.lang.Syntax))
                this.defun(name, val);
            else
                this.define(name.getName(), val);
        }
    }

    private void initELisp() {
        try {
            // Force it to be loaded now, so we can over-ride let* length etc.
            this.loadClass("gnu.commonlisp.lisp.PrimOps");
            this.loadClass("gnu.jemacs.lang.NumberOps");
            this.loadClass("gnu.jemacs.lang.MiscOps");

            this.defProcStFld("emacs", "gnu.jemacs.buffer.emacs");
        } catch (final java.lang.ClassNotFoundException ex) {
            // Ignore - happens while building this directory.
        }

        this.defSntxStFld("if", "gnu.jemacs.lang.MiscOps", "if");
        this.defProcStFld("invoke", "gnu.kawa.reflect.Invoke", "invoke");

        this.defProcStFld("+", "gnu.jemacs.lang.AddOp", "$Pl");
        this.defProcStFld("-", "gnu.jemacs.lang.AddOp", "$Mn");
        this.defProcStFld("/", "gnu.jemacs.lang.DivideOp", "$Sl");
        this.defProcStFld("=", "gnu.jemacs.lang.NumberCompare", "$Eq");
        this.defProcStFld("<", "gnu.jemacs.lang.NumberCompare", "$Ls");
        this.defProcStFld(">", "gnu.jemacs.lang.NumberCompare", "$Gr");
        this.defProcStFld("<=", "gnu.jemacs.lang.NumberCompare", "$Ls$Eq");
        this.defProcStFld(">=", "gnu.jemacs.lang.NumberCompare", "$Gr$Eq");

        this.defun("self-insert-command", new gnu.jemacs.buffer.SelfInsertCommand());

        final lambda lambda = new gnu.jemacs.lang.lambda();
        lambda.setKeywords(this.getSymbol("&optional"), this.getSymbol("&rest"), this.getSymbol("&key"));
        lambda.defaultDefault = SubLispScheme.nilExpr;
        this.defun("lambda", lambda);
        this.defun("defun", new gnu.commonlisp.lang.defun(lambda));
        this.defun("function", new gnu.commonlisp.lang.function(lambda));

        this.defun(gnu.kawa.lispexpr.LispLanguage.quote_sym, kawa.lang.Quote.plainQuote);
        this.defun("defgroup", new defgroup());
        this.defun("defcustom", new defcustom());
        this.defun("defvar", new gnu.commonlisp.lang.defvar(false));
        this.defun("defconst", new gnu.commonlisp.lang.defvar(true));
        this.defun("defsubst", new gnu.commonlisp.lang.defun(lambda));
        this.defun("setq", new gnu.commonlisp.lang.setq());
        this.defun("prog1", gnu.commonlisp.lang.prog1.prog1);
        this.defun("prog2", gnu.commonlisp.lang.prog1.prog2);
        this.defun("progn", new kawa.standard.begin());
        this.defun("while", new gnu.jemacs.lang.While());
        this.defun("unwind-protect", new gnu.commonlisp.lang.UnwindProtect());
        this.defun("save-excursion", new gnu.jemacs.lang.SaveExcursion(false));
        this.defun("save-current-buffer", new gnu.jemacs.lang.SaveExcursion(true));
        this.defun("let", new kawa.standard.fluid_let(false, SubLispScheme.nilExpr));
        this.defun("%let", kawa.standard.let.let);
        this.defun("let*", new kawa.standard.fluid_let(true, SubLispScheme.nilExpr));
        this.defProcStFld("concat", "kawa.lib.strings", "string$Mnappend");
        final Procedure not = new kawa.standard.not(this);
        this.defun("not", not);
        this.defun("null", not);
        this.defun("eq", new gnu.kawa.functions.IsEq(this, "eq"));
        this.defun("equal", new gnu.kawa.functions.IsEqual(this, "equal"));
        this.defun("typep", new gnu.kawa.reflect.InstanceOf(this));
        this.defun("princ", SubLispScheme.displayFormat);
        this.defun("prin1", SubLispScheme.writeFormat);
        final LocationEnumeration e = Scheme.builtin().enumerateAllLocations();
        while (e.hasMoreElements()) {
            this.importLocation(e.nextLocation());
        }
        try {
            this.loadClass("gnu.jemacs.lisp.primitives");
            this.loadClass("gnu.jemacs.buffer.emacs");
            this.loadClass("gnu.jemacs.lisp.simple");
            this.loadClass("gnu.jemacs.lisp.autoloads");
            this.loadClass("gnu.jemacs.lisp.keymap");
            this.loadClass("gnu.jemacs.lisp.editfns");
            this.loadClass("gnu.jemacs.lisp.keydefs");
        } catch (final java.lang.ClassNotFoundException ex) {
            // Ignore - happens while building this directory.
        }
    }

    void initLisp() {
        final LocationEnumeration e = Scheme.builtin().enumerateAllLocations();
        while (e.hasMoreElements()) {
            this.importLocation(e.nextLocation());
        }

        try {
            // Force it to be loaded now, so we can over-ride let* length etc.
            this.loadClass("kawa.lib.prim_syntax");
            this.loadClass("kawa.lib.std_syntax");
            this.loadClass("kawa.lib.lists");
            this.loadClass("kawa.lib.strings");
            this.loadClass("gnu.commonlisp.lisp.PrimOps");
        } catch (final java.lang.ClassNotFoundException ex) {
            // Ignore - happens while building this directory.
        }

        final kawa.lang.Lambda lambda = new kawa.lang.Lambda();
        lambda.setKeywords(this.asSymbol("&optional"), this.asSymbol("&rest"), this.asSymbol("&key"));
        lambda.defaultDefault = SubLispScheme.nilExpr;
        this.defun("lambda", lambda);
        this.defun("defun", new defun(lambda));

        this.defun("defvar", new defvar(false));
        this.defun("defconst", new defvar(true));
        this.defun("defsubst", new defun(lambda));
        this.defun("function", new function(lambda));
        this.defun("setq", new setq());
        this.defun("prog1", new prog1("prog1", 1));
        this.defun("prog2", prog1.prog2);
        this.defun("progn", new kawa.standard.begin());
        this.defun("unwind-protect", new gnu.commonlisp.lang.UnwindProtect());
        final Procedure not = new kawa.standard.not(this);
        this.defun("not", not);
        this.defun("null", not);
        this.defun("eq", new gnu.kawa.functions.IsEq(this, "eq"));
        this.defun("equal", new gnu.kawa.functions.IsEqual(this, "equal"));
        this.defun("typep", new gnu.kawa.reflect.InstanceOf(this));
        this.defun("princ", SubLispScheme.displayFormat);
        this.defun("prin1", SubLispScheme.writeFormat);

        this.defProcStFld("=", "gnu.commonlisp.lang.SubLispScheme", "numEqu");
        this.defProcStFld("<", "gnu.commonlisp.lang.SubLispScheme", "numLss");
        this.defProcStFld(">", "gnu.commonlisp.lang.SubLispScheme", "numGrt");
        this.defProcStFld("<=", "gnu.commonlisp.lang.SubLispScheme", "numLEq");
        this.defProcStFld(">=", "gnu.commonlisp.lang.SubLispScheme", "numGEq");

        this.defProcStFld("functionp", "gnu.commonlisp.lisp.PrimOps");
        super.registerEnvironment();
    }

    //static final SubLispScheme           instance;

    public boolean isTrue(Object value) {
        return value != SubLispScheme.FALSE;
    }

    public Object noValue() {
        return SubLispScheme.FALSE;
    }

    public boolean selfEvaluatingSymbol(Object obj) {
        return (obj instanceof Keyword) || (obj == SubLispScheme.TRUE) || (obj == SubLispScheme.FALSE);
    }

    class ELispReadTableEntry extends ReaderDispatchMisc {
        public ELispReadTableEntry(int code) {
            super(code);
        }

        public Object read(Lexer in, int ch, int count) throws java.io.IOException, SyntaxException {
            final LispReader reader = (LispReader) in;
            if (this.code >= 0) ch = this.code;
            switch (ch) {
                case '?':
                    ch = reader.read();
                    if (ch == '\\') {
                        ch = reader.read();
                        if ((ch != ' ') && (ch >= 0)) ch = reader.readEscape(ch);
                    }
                    if (ch < 0) {
                        reader.error("unexpected EOF in character literal");
                        ch = '?';
                    }
                    return SubLispScheme.getCharacter(ch);
            }
            reader.error("unexpected dispatch character");
            return null;
        }
    }

    public static final LList         FALSE            = LList.Empty;

    // FIXME - which namespace?
    public static final Symbol        TRUE             = Namespace.getDefault().getSymbol("t");

    public static final Expression    nilExpr          = new QuoteExp(SubLispScheme.FALSE);

    public static final Environment   elispEnvironment = Environment.make("elisp-environment");

    //    static final AbstractFormat       writeFormat      = new Print(true);

    //    static final AbstractFormat       displayFormat    = new Print(false);

    // This field need to be public so that the findLiteral method in
    // gnu.expr.LitTable can find it.
    //  public static final SubLispScheme instance;

    public static final Environment   clispEnvironment = Environment.make("clisp-environment");

    public static final NumberCompare numEqu;

    public static final NumberCompare numGrt;
    public static final NumberCompare numGEq;

    public static final NumberCompare numLss;

    public static final NumberCompare numLEq;

    static final AbstractFormat       writeFormat      = new DisplayFormat(true, 'C');

    static final AbstractFormat       displayFormat    = new DisplayFormat(false, 'C');

    private static boolean            charIsInt;

    static {
        // instance = new SubLispScheme();
        final SubLispScheme instance = SubLispScheme.getInstance();

        instance.define("t", SubLispScheme.TRUE);
        instance.define("nil", SubLispScheme.FALSE);
        final CallContext ctx = CallContext.getInstance();
        final Environment saveEnv = ctx.getEnvironmentRaw();
        try {
            ctx.setEnvironmentRaw(SubLispScheme.elispEnvironment);
            instance.initELisp();
        } finally {
            ctx.setEnvironmentRaw(saveEnv);
        }
    }

    static {
        SubScheme.instance.define("t", SubLispScheme.TRUE);
        SubScheme.instance.define("nil", SubLispScheme.FALSE);
        numEqu = NumberCompare.make(SubScheme.instance, "=", NumberCompare.TRUE_IF_EQU);
        numGrt = NumberCompare.make(SubScheme.instance, ">", NumberCompare.TRUE_IF_GRT);
        numGEq = NumberCompare.make(SubScheme.instance, ">=", NumberCompare.TRUE_IF_GRT | NumberCompare.TRUE_IF_EQU);
        numLss = NumberCompare.make(SubScheme.instance, "<", NumberCompare.TRUE_IF_LSS);
        numLEq = NumberCompare.make(SubScheme.instance, "<=", NumberCompare.TRUE_IF_LSS | NumberCompare.TRUE_IF_EQU);
        final CallContext ctx = CallContext.getInstance();
        final Environment saveEnv = ctx.getEnvironmentRaw();
        try {
            ctx.setEnvironmentRaw(SubLispScheme.clispEnvironment);
            SubScheme.instance.initLisp();
        } finally {
            ctx.setEnvironmentRaw(saveEnv);
        }
    }

    public static char asChar(Object x) {
        if (x instanceof Char) return ((Char) x).charValue();
        int i;
        if (x instanceof gnu.math.Numeric)
            i = ((gnu.math.Numeric) x).intValue();
        else if (x instanceof javax.swing.text.Position)
            i = ((javax.swing.text.Position) x).getOffset() + 1;
        else
            i = -1;
        if ((i < 0) || (i > 0xffff)) throw new gnu.jemacs.buffer.Signal("error", "not a character value");
        return (char) i;
    }

    public static gnu.math.Numeric asNumber(Object arg) {
        if (arg instanceof Char) return gnu.math.IntNum.make(((Char) arg).intValue());
        if (arg instanceof javax.swing.text.Position) return gnu.math.IntNum.make(1 + ((javax.swing.text.Position) arg).getOffset());
        return (gnu.math.Numeric) arg;
    }

    /** Get a symbol for a given (interned) Java string. */
    public static Object asSymbolStatically(String name) {
        if (name == "nil") return SubLispScheme.FALSE;
        return Environment.getCurrent().getSymbol(name);
        //return name;
    }

    /** Get a SubLispScheme character object. */
    public static Object getCharacter(int c) {
        if (SubLispScheme.charIsInt)
            return gnu.math.IntNum.make(c);
        else
            return Char.make((char) c);
    }

    public static SubLispScheme getInstance() {
        return SubScheme.instance;
    }

    /** Get a string for a given Java string. */
    public static Object getString(String name) {
        return new FString(name);
    }

    /** Get a string for a given symbol. */
    public static Object getString(Symbol symbol) {
        return SubLispScheme.getString(symbol.getName());
    }

    public static void main(String[] args) {
        kawa.repl.processArgs(new String[] { "--elisp" }, 0, 1);
        if (args.length == 0) args = new String[] { "-e", "(emacs)", "--" };
        kawa.repl.main(args);
    }

    public static void readableChar(char ch, StringBuffer buf, boolean quote) {
        if (quote && ((ch == '\\') || (ch == '\'') || (ch == '\"'))) {
            buf.append('\\');
            buf.append(ch);
        } else if (ch > 127) {
            buf.append("\\u");
            final String hex = Integer.toHexString(ch);
            for (int i = hex.length(); i < 4; i++)
                buf.append('0');
            buf.append(hex);
        } else if (ch >= ' ')
            buf.append(ch);
        else if (ch == '\t')
            buf.append("\\t");
        else if (ch == '\r')
            buf.append("\\r");
        else if (ch == '\n')
            buf.append("\\n");
        else {
            buf.append("\\0");
            buf.append((ch >> 3) & 7);
            buf.append(ch & 7);
        }
    }

    /**
     * Call toString, quoting characters that are not ascii graphic chars.
     * This method will probably be moved somewhere more appropriate.
     */
    public static String readableString(Object obj) {
        final String str = obj.toString();
        final StringBuffer buf = new StringBuffer(200);
        for (int i = 0; i < str.length(); i++)
            SubLispScheme.readableChar(str.charAt(i), buf, false);
        return buf.toString();
    }

    /** The compiler insert calls to this method for applications and applets. */
    public static void registerEnvironment() {
        Language.setDefaults(SubScheme.instance);
    }

}
