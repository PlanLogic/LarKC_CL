/**
 * 
 */
package dmiles.transform.sublisp;

import gnu.bytecode.ArrayType;
import gnu.bytecode.ObjectType;
import gnu.bytecode.Type;
import gnu.expr.ApplyExp;
import gnu.expr.Compilation;
import gnu.expr.Declaration;
import gnu.expr.Expression;
import gnu.expr.LambdaExp;
import gnu.expr.Language;
import gnu.expr.QuoteExp;
import gnu.expr.ReferenceExp;
import gnu.expr.Special;
import gnu.kawa.functions.ApplyToArgs;
import gnu.kawa.functions.DisplayFormat;
import gnu.kawa.functions.MultiplyOp;
import gnu.kawa.functions.NumberCompare;
import gnu.kawa.lispexpr.LangObjType;
import gnu.kawa.lispexpr.LangPrimType;
import gnu.kawa.lispexpr.LispLanguage;
import gnu.kawa.lispexpr.LispReader;
import gnu.kawa.lispexpr.ReadTable;
import gnu.kawa.lispexpr.ReaderDispatch;
import gnu.kawa.lispexpr.ReaderDispatchMisc;
import gnu.kawa.lispexpr.ReaderParens;
import gnu.kawa.lispexpr.ReaderQuote;
import gnu.kawa.xml.XmlNamespace;
import gnu.lists.AbstractFormat;
import gnu.mapping.CharArrayInPort;
import gnu.mapping.Environment;
import gnu.mapping.InPort;
import gnu.mapping.Namespace;
import gnu.mapping.SimpleEnvironment;
import gnu.mapping.Symbol;
import gnu.mapping.WrappedException;
import gnu.math.DFloNum;
import gnu.math.IntNum;
import gnu.math.Unit;
import gnu.text.SourceMessages;

import java.util.Hashtable;
import java.util.Vector;

import kawa.lang.Eval;
import kawa.lang.Lambda;
import kawa.lang.Translator;
import kawa.standard.expt;
import kawa.standard.map;
import kawa.standard.not;

public class SubScheme extends LispLanguage {
    public SubScheme() {
        this.environ = SubScheme.kawaEnvironment;
        this.userEnv = this.getNewEnvironment();
    }

    protected SubScheme(Environment env) {
        this.environ = env;
    }

    /**
     * @param kawaEnvironment2
     */
    public SubScheme(SimpleEnvironment kawaEnvironment2) {
        // TODO Auto-generated constructor stub
    }

    public Symbol asSymbol(String ident) {
        return Namespace.EmptyNamespace.getSymbol(ident);
    }

    /** If a symbol is lexically unbound, look for a default binding.
     * If the symbol is the name of an existing Java type/class,
     * return that Class.
     * Handles both with and without (semi-deprecated) angle-brackets:
     * {@code <java.lang.Integer>} and {@code java.lang.Integer}.
     * Also handles arrays, such as {@code java.lang.String[]}.
     */
    public Expression checkDefaultBinding(Symbol symbol, Translator tr) {
        final Namespace namespace = symbol.getNamespace();
        final String local = symbol.getLocalPart();
        if (namespace instanceof XmlNamespace) return QuoteExp.getInstance(((XmlNamespace) namespace).get(local));
        if (namespace.getName() == SubScheme.unitNamespace.getName()) {
            final Object val = Unit.lookup(local);
            if (val != null) return QuoteExp.getInstance(val);
        }
        String name = symbol.toString();
        int len = name.length();
        if (len == 0) return null;
        if ((len > 1) && (name.charAt(len - 1) == '?')) {
            final int llen = local.length();
            if (llen > 1) {
                final String tlocal = local.substring(0, llen - 1).intern();
                final Symbol tsymbol = namespace.getSymbol(tlocal);
                Expression texp = tr.rewrite(tsymbol, false);
                if (texp instanceof ReferenceExp) {
                    final Declaration decl = ((ReferenceExp) texp).getBinding();
                    if ((decl == null) || decl.getFlag(Declaration.IS_UNKNOWN)) texp = null;
                } else if (!(texp instanceof QuoteExp)) texp = null;
                if (texp != null) {
                    final LambdaExp lexp = new LambdaExp(1);
                    lexp.setSymbol(symbol);
                    final Declaration param = lexp.addDeclaration((Object) null);
                    lexp.body = new ApplyExp(SubScheme.instanceOf, new Expression[] { new ReferenceExp(param), texp, });
                    return lexp;
                }
            }
        }
        final char ch0 = name.charAt(0);
        if ((ch0 == '-') || (ch0 == '+') || (Character.digit(ch0, 10) >= 0)) {
            // 1: initial + or -1 seen.
            // 2: digits seen
            // 3: '.' seen
            // 4: fraction seen
            // 5: [eE][=+]?[0-9]+ seen
            int state = 0;
            int i = 0;
            for (; i < len; i++) {
                final char ch = name.charAt(i);
                if (Character.digit(ch, 10) >= 0)
                    state = state < 3 ? 2 : state < 5 ? 4 : 5;
                else if (((ch == '+') || (ch == '-')) && (state == 0))
                    state = 1;
                else if ((ch == '.') && (state < 3))
                    state = 3;
                else if (((ch == 'e') || (ch == 'E')) && ((state == 2) || (state == 4)) && (i + 1 < len)) {
                    int j = i + 1;
                    char next = name.charAt(j);
                    if (((next == '-') || (next == '+')) && (++j < len)) next = name.charAt(j);
                    if (Character.digit(next, 10) < 0) break;
                    state = 5;
                    i = j + 1;
                } else
                    break;
            }
            tryQuantity: if ((i < len) && (state > 1)) {
                final DFloNum num = new DFloNum(name.substring(0, i));
                boolean div = false;
                final Vector vec = new Vector();
                for (; i < len;) {
                    char ch = name.charAt(i++);
                    if (ch == '*') {
                        if (i == len) break tryQuantity;
                        ch = name.charAt(i++);
                    } else if (ch == '/') {
                        if ((i == len) || div) break tryQuantity;
                        div = true;
                        ch = name.charAt(i++);
                    }
                    final int unitStart = i - 1;
                    int unitEnd;
                    for (;;) {
                        if (!Character.isLetter(ch)) {
                            unitEnd = i - 1;
                            if (unitEnd == unitStart) break tryQuantity;
                            break;
                        }
                        if (i == len) {
                            unitEnd = i;
                            ch = '1';
                            break;
                        }
                        ch = name.charAt(i++);
                    }
                    vec.addElement(name.substring(unitStart, unitEnd));
                    boolean expRequired = false;
                    if (ch == '^') {
                        expRequired = true;
                        if (i == len) break tryQuantity;
                        ch = name.charAt(i++);
                    }
                    boolean neg = div;
                    if (ch == '+') {
                        expRequired = true;
                        if (i == len) break tryQuantity;
                        ch = name.charAt(i++);
                    } else if (ch == '-') {
                        expRequired = true;
                        if (i == len) break tryQuantity;
                        ch = name.charAt(i++);
                        neg = !neg;
                    }
                    int nexp = 0;
                    int exp = 0;
                    for (;;) {
                        final int dig = Character.digit(ch, 10);
                        if (dig <= 0) {
                            i--;
                            break;
                        }
                        exp = 10 * exp + dig;
                        nexp++;
                        if (i == len) break;
                        ch = name.charAt(i++);
                    }
                    if (nexp == 0) {
                        exp = 1;
                        if (expRequired) break tryQuantity;
                    }
                    if (neg) exp = -exp;
                    vec.addElement(IntNum.make(exp));
                }
                if (i == len) {
                    final int nunits = vec.size() >> 1;
                    final Expression[] units = new Expression[nunits];
                    for (i = 0; i < nunits; i++) {
                        final String uname = (String) vec.elementAt(2 * i);
                        final Symbol usym = SubScheme.unitNamespace.getSymbol(uname.intern());
                        Expression uref = tr.rewrite(usym);
                        final IntNum uexp = (IntNum) vec.elementAt(2 * i + 1);
                        if (uexp.longValue() != 1) uref = new ApplyExp(expt.expt, new Expression[] { uref, QuoteExp.getInstance(uexp) });
                        units[i] = uref;
                    }
                    Expression unit;
                    if (nunits == 1)
                        unit = units[0];
                    else
                        unit = new ApplyExp(MultiplyOp.$St, units);
                    return new ApplyExp(MultiplyOp.$St, new Expression[] { QuoteExp.getInstance(num), unit });
                }
            }
        }
        if ((len > 2) && (ch0 == '<') && (name.charAt(len - 1) == '>')) {
            name = name.substring(1, len - 1);
            len -= 2;
        }
        int rank = 0;
        while ((len > 2) && (name.charAt(len - 2) == '[') && (name.charAt(len - 1) == ']')) {
            len -= 2;
            rank++;
        }

        String cname = name;
        if (rank != 0) cname = name.substring(0, len);
        try {
            Class clas;
            Type type = SubScheme.getNamedType(cname);
            if (type != null) {
                // Somewhat inconsistent: Types named by getNamedType are Type,
                // while standard type/classes are Class.  FIXME.
                while (--rank >= 0)
                    type = gnu.bytecode.ArrayType.make(type);
                return QuoteExp.getInstance(type);
            } else {
                type = Type.lookupType(cname);
                if (type instanceof gnu.bytecode.PrimType)
                    clas = type.getReflectClass();
                else {
                    if (cname.indexOf('.') < 0) cname = (tr.classPrefix + Compilation.mangleNameIfNeeded(cname));
                    clas = ObjectType.getContextClass(cname);
                }
            }
            if (clas != null) {
                if (rank > 0) {
                    type = Type.make(clas);
                    while (--rank >= 0)
                        type = gnu.bytecode.ArrayType.make(type);
                    clas = type.getReflectClass();
                }
                return QuoteExp.getInstance(clas);
            }
        } catch (final ClassNotFoundException ex) {
            final Package pack = gnu.bytecode.ArrayClassLoader.getContextPackage(name);
            if (pack != null) return QuoteExp.getInstance(pack);
        } catch (final Throwable ex) {
        }
        return null;
    }

    public ReadTable createReadTable() {
        final ReadTable tab = ReadTable.createInitial();
        tab.postfixLookupOperator = ':';
        final ReaderDispatch dispatchTable = (ReaderDispatch) tab.lookup('#');
        dispatchTable.set('\'', new ReaderQuote(this.asSymbol("syntax")));
        dispatchTable.set('`', new ReaderQuote(this.asSymbol("quasisyntax")));
        dispatchTable.set(',', ReaderDispatchMisc.getInstance());
        tab.putReaderCtorFld("path", "gnu.kawa.lispexpr.LangObjType", "pathType");
        tab.putReaderCtorFld("filepath", "gnu.kawa.lispexpr.LangObjType", "filepathType");
        tab.putReaderCtorFld("URI", "gnu.kawa.lispexpr.LangObjType", "URIType");
        tab.putReaderCtorFld("namespace", "kawa.lib.misc", "namespace");
        tab.putReaderCtorFld("duration", "kawa.lib.numbers", "duration");
        return tab;
    }

    public AbstractFormat getFormat(boolean readable) {
        return readable ? SubScheme.writeFormat : SubScheme.displayFormat;
    }

    public String getName() {
        return "SubScheme";
    }

    public int getNamespaceOf(Declaration decl) {
        return Language.FUNCTION_NAMESPACE + Language.VALUE_NAMESPACE;
    }

    public Type getTypeFor(Class clas) {
        final String name = clas.getName();
        if (clas.isPrimitive()) return SubScheme.getNamedType(name);
        if ("java.lang.String".equals(name)) return Type.tostring_type;
        if ("gnu.text.Path".equals(name)) return LangObjType.pathType;
        if ("gnu.text.URIPath".equals(name)) return LangObjType.URIType;
        if ("gnu.text.FilePath".equals(name)) return LangObjType.filepathType;
        if ("java.lang.Class".equals(name)) return LangObjType.typeClass;
        if ("gnu.bytecode.Type".equals(name)) return LangObjType.typeType;
        if ("gnu.bytecode.ClassType".equals(name)) return LangObjType.typeClassType;
        return Type.make(clas);
    }

    public Type getTypeFor(String name) {
        return SubScheme.string2Type(name);
    }

    protected void initScheme() {
        this.environ = SubScheme.nullEnvironment;

        this.defSntxStFld("lambda", "kawa.standard.SubScheme", "lambda");

        //-- Section 4.1  -- complete
        this.defSntxStFld(LispLanguage.quote_sym, "kawa.lang.Quote", "plainQuote");
        this.defSntxStFld("%define", "kawa.standard.define", "defineRaw");
        this.defSntxStFld("define", "kawa.lib.prim_syntax");

        this.defSntxStFld("if", "kawa.lib.prim_syntax");
        this.defSntxStFld("set!", "kawa.standard.set_b", "set");

        // Section 4.2  -- complete
        this.defSntxStFld("cond", "kawa.lib.std_syntax");
        this.defSntxStFld("case", "kawa.lib.std_syntax");
        this.defSntxStFld("and", "kawa.lib.std_syntax");
        this.defSntxStFld("or", "kawa.lib.std_syntax");
        this.defSntxStFld("%let", "kawa.standard.let", "let");
        this.defSntxStFld("let", "kawa.lib.std_syntax");
        this.defSntxStFld("let*", "kawa.lib.std_syntax");
        this.defSntxStFld("letrec", "kawa.lib.std_syntax");

        this.defSntxStFld("begin", "kawa.standard.begin", "begin");
        this.defSntxStFld("do", "kawa.lib.std_syntax");
        this.defSntxStFld("delay", "kawa.lib.std_syntax");
        this.defProcStFld("%make-promise", "kawa.lib.std_syntax");
        this.defSntxStFld("quasiquote", "kawa.lang.Quote", "quasiQuote");

        //-- Section 5  -- complete [except for internal definitions]

        // Appendix (and R5RS)
        this.defSntxStFld("define-syntax", "kawa.lib.prim_syntax");
        this.defSntxStFld("let-syntax", "kawa.standard.let_syntax", "let_syntax");
        this.defSntxStFld("letrec-syntax", "kawa.standard.let_syntax", "letrec_syntax");
        this.defSntxStFld("syntax-rules", "kawa.standard.syntax_rules", "syntax_rules");

        SubScheme.nullEnvironment.setLocked();
        this.environ = SubScheme.r4Environment;

        //-- Section 6.1  -- complete
        this.defProcStFld("not", "kawa.standard.SubScheme");
        this.defProcStFld("boolean?", "kawa.lib.misc");

        //-- Section 6.2  -- complete
        this.defProcStFld("eq?", "kawa.standard.SubScheme", "isEq");
        this.defProcStFld("eqv?", "kawa.standard.SubScheme", "isEqv");
        this.defProcStFld("equal?", "kawa.standard.SubScheme", "isEqual");

        //-- Section 6.3  -- complete
        this.defProcStFld("pair?", "kawa.lib.lists");
        this.defProcStFld("cons", "kawa.lib.lists");
        this.defProcStFld("car", "kawa.lib.lists");
        this.defProcStFld("cdr", "kawa.lib.lists");
        this.defProcStFld("set-car!", "kawa.lib.lists");
        this.defProcStFld("set-cdr!", "kawa.lib.lists");

        this.defProcStFld("caar", "kawa.lib.lists");
        this.defProcStFld("cadr", "kawa.lib.lists");
        this.defProcStFld("cdar", "kawa.lib.lists");
        this.defProcStFld("cddr", "kawa.lib.lists");
        this.defProcStFld("caaar", "kawa.lib.lists");
        this.defProcStFld("caadr", "kawa.lib.lists");
        this.defProcStFld("cadar", "kawa.lib.lists");
        this.defProcStFld("caddr", "kawa.lib.lists");
        this.defProcStFld("cdaar", "kawa.lib.lists");
        this.defProcStFld("cdadr", "kawa.lib.lists");
        this.defProcStFld("cddar", "kawa.lib.lists");
        this.defProcStFld("cdddr", "kawa.lib.lists");
        this.defProcStFld("caaaar", "kawa.lib.lists");
        this.defProcStFld("caaadr", "kawa.lib.lists");
        this.defProcStFld("caadar", "kawa.lib.lists");
        this.defProcStFld("caaddr", "kawa.lib.lists");
        this.defProcStFld("cadaar", "kawa.lib.lists");
        this.defProcStFld("cadadr", "kawa.lib.lists");
        this.defProcStFld("caddar", "kawa.lib.lists");
        this.defProcStFld("cadddr", "kawa.lib.lists");
        this.defProcStFld("cdaaar", "kawa.lib.lists");
        this.defProcStFld("cdaadr", "kawa.lib.lists");
        this.defProcStFld("cdadar", "kawa.lib.lists");
        this.defProcStFld("cdaddr", "kawa.lib.lists");
        this.defProcStFld("cddaar", "kawa.lib.lists");
        this.defProcStFld("cddadr", "kawa.lib.lists");
        this.defProcStFld("cdddar", "kawa.lib.lists");
        this.defProcStFld("cddddr", "kawa.lib.lists");
        this.defProcStFld("null?", "kawa.lib.lists");
        this.defProcStFld("list?", "kawa.lib.lists");
        this.defProcStFld("list", "gnu.kawa.functions.MakeList");
        this.defProcStFld("length", "kawa.lib.lists");
        this.defProcStFld("append", "kawa.standard.append", "append");
        this.defProcStFld("reverse", "kawa.lib.lists");
        this.defProcStFld("reverse!", "kawa.lib.lists"); // Not R5RS.
        this.defProcStFld("list-tail", "kawa.lib.lists");
        this.defProcStFld("list-ref", "kawa.lib.lists");

        this.defProcStFld("memq", "kawa.lib.lists");
        this.defProcStFld("memv", "kawa.lib.lists");
        this.defProcStFld("member", "kawa.lib.lists");
        this.defProcStFld("assq", "kawa.lib.lists");
        this.defProcStFld("assv", "kawa.lib.lists");
        this.defProcStFld("assoc", "kawa.lib.lists");

        //-- Section 6.4  -- complete, including slashified read/write

        this.defProcStFld("symbol?", "kawa.lib.misc");
        this.defProcStFld("symbol->string", "kawa.lib.misc");
        this.defProcStFld("string->symbol", "kawa.lib.misc");

        //-- Section 6.5
        this.defProcStFld("number?", "kawa.lib.numbers");
        this.defProcStFld("quantity?", "kawa.lib.numbers");
        this.defProcStFld("complex?", "kawa.lib.numbers");
        this.defProcStFld("real?", "kawa.lib.numbers");
        this.defProcStFld("rational?", "kawa.lib.numbers");
        this.defProcStFld("integer?", "kawa.lib.numbers");
        this.defProcStFld("exact?", "kawa.lib.numbers");
        this.defProcStFld("inexact?", "kawa.lib.numbers");
        this.defProcStFld("=", "kawa.standard.SubScheme", "numEqu");
        this.defProcStFld("<", "kawa.standard.SubScheme", "numLss");
        this.defProcStFld(">", "kawa.standard.SubScheme", "numGrt");
        this.defProcStFld("<=", "kawa.standard.SubScheme", "numLEq");
        this.defProcStFld(">=", "kawa.standard.SubScheme", "numGEq");
        this.defProcStFld("zero?", "kawa.lib.numbers");
        this.defProcStFld("positive?", "kawa.lib.numbers");
        this.defProcStFld("negative?", "kawa.lib.numbers");
        this.defProcStFld("odd?", "kawa.lib.numbers");
        this.defProcStFld("even?", "kawa.lib.numbers");
        this.defProcStFld("max", "kawa.lib.numbers");
        this.defProcStFld("min", "kawa.lib.numbers");
        this.defProcStFld("+", "gnu.kawa.functions.AddOp", "$Pl");
        this.defProcStFld("-", "gnu.kawa.functions.AddOp", "$Mn");
        this.defProcStFld("*", "gnu.kawa.functions.MultiplyOp", "$St");
        this.defProcStFld("/", "gnu.kawa.functions.DivideOp", "$Sl");
        this.defProcStFld("abs", "kawa.lib.numbers");
        this.defProcStFld("quotient", "kawa.lib.numbers");
        this.defProcStFld("remainder", "kawa.lib.numbers");
        this.defProcStFld("modulo", "kawa.lib.numbers");
        this.defProcStFld("gcd", "kawa.lib.numbers");
        this.defProcStFld("lcm", "kawa.lib.numbers");
        this.defProcStFld("numerator", "kawa.lib.numbers");
        this.defProcStFld("denominator", "kawa.lib.numbers");
        this.defProcStFld("floor", "kawa.lib.numbers");
        this.defProcStFld("ceiling", "kawa.lib.numbers");
        this.defProcStFld("truncate", "kawa.lib.numbers");
        this.defProcStFld("round", "kawa.lib.numbers");
        this.defProcStFld("rationalize", "kawa.lib.numbers");
        this.defProcStFld("exp", "kawa.lib.numbers");
        this.defProcStFld("log", "kawa.lib.numbers");
        this.defProcStFld("sin", "kawa.lib.numbers");
        this.defProcStFld("cos", "kawa.lib.numbers");
        this.defProcStFld("tan", "kawa.lib.numbers");
        this.defProcStFld("asin", "kawa.lib.numbers");
        this.defProcStFld("acos", "kawa.lib.numbers");
        this.defProcStFld("atan", "kawa.lib.numbers");
        this.defProcStFld("sqrt", "kawa.lib.numbers");
        this.defProcStFld("expt", "kawa.standard.expt");
        this.defProcStFld("make-rectangular", "kawa.lib.numbers");
        this.defProcStFld("make-polar", "kawa.lib.numbers");
        this.defProcStFld("real-part", "kawa.lib.numbers");
        this.defProcStFld("imag-part", "kawa.lib.numbers");
        this.defProcStFld("magnitude", "kawa.lib.numbers");
        this.defProcStFld("angle", "kawa.lib.numbers");
        this.defProcStFld("exact->inexact", "kawa.lib.numbers");
        this.defProcStFld("inexact->exact", "kawa.lib.numbers");
        this.defProcStFld("number->string", "kawa.lib.numbers");
        this.defProcStFld("string->number", "kawa.lib.numbers");

        //-- Section 6.6  -- complete
        this.defProcStFld("char?", "kawa.lib.characters");
        this.defProcStFld("char=?", "kawa.lib.characters");
        this.defProcStFld("char<?", "kawa.lib.characters");
        this.defProcStFld("char>?", "kawa.lib.characters");
        this.defProcStFld("char<=?", "kawa.lib.characters");
        this.defProcStFld("char>=?", "kawa.lib.characters");
        this.defProcStFld("char-ci=?", "kawa.lib.characters");
        this.defProcStFld("char-ci<?", "kawa.lib.characters");
        this.defProcStFld("char-ci>?", "kawa.lib.characters");
        this.defProcStFld("char-ci<=?", "kawa.lib.characters");
        this.defProcStFld("char-ci>=?", "kawa.lib.characters");
        this.defProcStFld("char-alphabetic?", "kawa.lib.characters");
        this.defProcStFld("char-numeric?", "kawa.lib.characters");
        this.defProcStFld("char-whitespace?", "kawa.lib.characters");
        this.defProcStFld("char-upper-case?", "kawa.lib.characters");
        this.defProcStFld("char-lower-case?", "kawa.lib.characters");
        this.defProcStFld("char->integer", "kawa.lib.characters");
        this.defProcStFld("integer->char", "kawa.lib.characters");
        this.defProcStFld("char-upcase", "kawa.lib.characters");
        this.defProcStFld("char-downcase", "kawa.lib.characters");

        //-- Section 6.7  -- complete
        this.defProcStFld("string?", "kawa.lib.strings");
        this.defProcStFld("make-string", "kawa.lib.strings");
        this.defProcStFld("string", "kawa.lib.strings");
        this.defProcStFld("string-length", "kawa.lib.strings");
        this.defProcStFld("string-ref", "kawa.lib.strings");
        this.defProcStFld("string-set!", "kawa.lib.strings");

        this.defProcStFld("string=?", "kawa.lib.strings");
        this.defProcStFld("string-ci=?", "kawa.lib.strings");
        this.defProcStFld("string<?", "kawa.lib.strings");
        this.defProcStFld("string>?", "kawa.lib.strings");
        this.defProcStFld("string<=?", "kawa.lib.strings");
        this.defProcStFld("string>=?", "kawa.lib.strings");

        this.defProcStFld("string-ci<?", "kawa.lib.strings");
        this.defProcStFld("string-ci>?", "kawa.lib.strings");
        this.defProcStFld("string-ci<=?", "kawa.lib.strings");
        this.defProcStFld("string-ci>=?", "kawa.lib.strings");

        this.defProcStFld("substring", "kawa.lib.strings");
        this.defProcStFld("string-append", "kawa.lib.strings");
        this.defProcStFld("string-append/shared", "kawa.lib.strings");
        this.defProcStFld("string->list", "kawa.lib.strings");
        this.defProcStFld("list->string", "kawa.lib.strings");
        this.defProcStFld("string-copy", "kawa.lib.strings");
        this.defProcStFld("string-fill!", "kawa.lib.strings");

        //-- Section 6.8  -- complete
        this.defProcStFld("vector?", "kawa.lib.vectors");
        this.defProcStFld("make-vector", "kawa.lib.vectors");
        this.defProcStFld("vector", "kawa.lib.vectors");
        this.defProcStFld("vector-length", "kawa.lib.vectors");
        this.defProcStFld("vector-ref", "kawa.lib.vectors");
        this.defProcStFld("vector-set!", "kawa.lib.vectors");
        this.defProcStFld("list->vector", "kawa.lib.vectors");
        this.defProcStFld("vector->list", "kawa.lib.vectors");
        this.defProcStFld("vector-fill!", "kawa.lib.vectors");
        // Extension:
        this.defProcStFld("vector-append", "kawa.standard.vector_append", "vectorAppend");
        this.defProcStFld("values-append", "gnu.kawa.functions.AppendValues", "appendValues");

        //-- Section 6.9  -- complete [except restricted call/cc]
        this.defProcStFld("procedure?", "kawa.lib.misc");
        this.defProcStFld("apply", "gnu.kawa.functions.Apply", "apply");
        this.defProcStFld("map", "kawa.standard.SubScheme", "map");
        this.defProcStFld("for-each", "kawa.standard.SubScheme", "forEach");
        this.defProcStFld("call-with-current-continuation", "kawa.standard.callcc", "callcc");
        this.defProcStFld("call/cc", "kawa.standard.callcc", "callcc");
        this.defProcStFld("force", "kawa.lib.misc");

        //-- Section 6.10  -- complete
        this.defProcStFld("call-with-input-file", "kawa.lib.ports");
        this.defProcStFld("call-with-output-file", "kawa.lib.ports");
        this.defProcStFld("input-port?", "kawa.lib.ports");
        this.defProcStFld("output-port?", "kawa.lib.ports");
        this.defProcStFld("current-input-port", "kawa.lib.ports");
        this.defProcStFld("current-output-port", "kawa.lib.ports");
        this.defProcStFld("with-input-from-file", "kawa.lib.ports");
        this.defProcStFld("with-output-to-file", "kawa.lib.ports");
        this.defProcStFld("open-input-file", "kawa.lib.ports");
        this.defProcStFld("open-output-file", "kawa.lib.ports");
        this.defProcStFld("close-input-port", "kawa.lib.ports");
        this.defProcStFld("close-output-port", "kawa.lib.ports");
        this.defProcStFld("read", "kawa.lib.ports");
        this.defProcStFld("read-line", "kawa.lib.ports");
        this.defProcStFld("read-char", "kawa.standard.readchar", "readChar");
        this.defProcStFld("peek-char", "kawa.standard.readchar", "peekChar");
        this.defProcStFld("eof-object?", "kawa.lib.ports");
        this.defProcStFld("char-ready?", "kawa.lib.ports");
        this.defProcStFld("write", "kawa.lib.ports");
        this.defProcStFld("display", "kawa.lib.ports");
        this.defProcStFld("print-as-xml", "gnu.xquery.lang.XQuery", "writeFormat");
        this.defProcStFld("write-char", "kawa.lib.ports");
        this.defProcStFld("newline", "kawa.lib.ports");
        this.defProcStFld("load", "kawa.standard.load", "load");
        this.defProcStFld("load-relative", "kawa.standard.load", "loadRelative");
        this.defProcStFld("transcript-off", "kawa.lib.ports");
        this.defProcStFld("transcript-on", "kawa.lib.ports");
        this.defProcStFld("call-with-input-string", "kawa.lib.ports"); // Extension
        this.defProcStFld("open-input-string", "kawa.lib.ports"); // SRFI-6
        this.defProcStFld("open-output-string", "kawa.lib.ports"); // SRFI-6
        this.defProcStFld("get-output-string", "kawa.lib.ports"); // SRFI-6
        this.defProcStFld("call-with-output-string", "kawa.lib.ports"); // Extension
        this.defProcStFld("force-output", "kawa.lib.ports"); // Extension

        this.defProcStFld("port-line", "kawa.lib.ports");
        this.defProcStFld("set-port-line!", "kawa.lib.ports");
        this.defProcStFld("port-column", "kawa.lib.ports");
        this.defProcStFld("current-error-port", "kawa.lib.ports");
        this.defProcStFld("input-port-line-number", "kawa.lib.ports"); // Extension
        this.defProcStFld("set-input-port-line-number!", "kawa.lib.ports");
        this.defProcStFld("input-port-column-number", "kawa.lib.ports");
        this.defProcStFld("input-port-read-state", "kawa.lib.ports");
        this.defProcStFld("default-prompter", "kawa.lib.ports");
        this.defProcStFld("input-port-prompter", "kawa.lib.ports");
        this.defProcStFld("set-input-port-prompter!", "kawa.lib.ports");
        this.defProcStFld("base-uri", "kawa.lib.misc");

        this.defProcStFld("%syntax-error", "kawa.standard.syntax_error", "syntax_error");
        this.defProcStFld("syntax-error", "kawa.lib.prim_syntax");

        SubScheme.r4Environment.setLocked();
        this.environ = SubScheme.r5Environment;

        this.defProcStFld("values", "kawa.lib.misc");
        this.defProcStFld("call-with-values", "kawa.standard.call_with_values", "callWithValues");
        this.defSntxStFld("let-values", "kawa.lib.syntax");
        this.defSntxStFld("let*-values", "kawa.lib.syntax");
        this.defSntxStFld("case-lambda", "kawa.lib.syntax");
        this.defSntxStFld("receive", "kawa.lib.syntax");
        this.defProcStFld("eval", "kawa.lang.Eval");
        this.defProcStFld("repl", "kawa.standard.SubScheme", "repl");
        this.defProcStFld("scheme-report-environment", "kawa.lib.misc");
        this.defProcStFld("null-environment", "kawa.lib.misc");
        this.defProcStFld("interaction-environment", "kawa.lib.misc");
        this.defProcStFld("dynamic-wind", "kawa.lib.misc");

        SubScheme.r5Environment.setLocked();
        this.environ = SubScheme.kawaEnvironment;

        this.defSntxStFld("define-private", "kawa.lib.prim_syntax");
        this.defSntxStFld("define-constant", "kawa.lib.prim_syntax");

        this.defSntxStFld("define-autoload", "kawa.standard.define_autoload", "define_autoload");
        this.defSntxStFld("define-autoloads-from-file", "kawa.standard.define_autoload", "define_autoloads_from_file");

        this.defProcStFld("exit", "kawa.lib.thread");

        this.defProcStFld("arithmetic-shift", "kawa.lib.numbers");
        this.defProcStFld("ash", "kawa.lib.numbers", "arithmetic$Mnshift");
        this.defProcStFld("logand", "kawa.lib.numbers");
        this.defProcStFld("logior", "kawa.lib.numbers");
        this.defProcStFld("logxor", "kawa.lib.numbers");
        this.defProcStFld("lognot", "kawa.lib.numbers");
        this.defProcStFld("logop", "kawa.lib.numbers");
        this.defProcStFld("logbit?", "kawa.lib.numbers");
        this.defProcStFld("logtest", "kawa.lib.numbers");
        this.defProcStFld("logcount", "kawa.lib.numbers");
        this.defProcStFld("bit-extract", "kawa.lib.numbers");
        this.defProcStFld("integer-length", "kawa.lib.numbers");

        // These are from SLIB.
        this.defProcStFld("string-upcase!", "kawa.lib.strings");
        this.defProcStFld("string-downcase!", "kawa.lib.strings");
        this.defProcStFld("string-capitalize!", "kawa.lib.strings");
        this.defProcStFld("string-upcase", "kawa.lib.strings");
        this.defProcStFld("string-downcase", "kawa.lib.strings");
        this.defProcStFld("string-capitalize", "kawa.lib.strings");
        this.defSntxStFld("primitive-virtual-method", "kawa.standard.prim_method", "virtual_method");
        this.defSntxStFld("primitive-static-method", "kawa.standard.prim_method", "static_method");
        this.defSntxStFld("primitive-interface-method", "kawa.standard.prim_method", "interface_method");
        this.defSntxStFld("primitive-constructor", "kawa.lib.reflection");
        this.defSntxStFld("primitive-op1", "kawa.standard.prim_method", "op1");
        this.defSntxStFld("primitive-get-field", "kawa.lib.reflection");
        this.defSntxStFld("primitive-set-field", "kawa.lib.reflection");
        this.defSntxStFld("primitive-get-static", "kawa.lib.reflection");
        this.defSntxStFld("primitive-set-static", "kawa.lib.reflection");
        this.defSntxStFld("primitive-array-new", "kawa.lib.reflection");
        this.defSntxStFld("primitive-array-get", "kawa.lib.reflection");
        this.defSntxStFld("primitive-array-set", "kawa.lib.reflection");
        this.defSntxStFld("primitive-array-length", "kawa.lib.reflection");
        this.defProcStFld("subtype?", "kawa.lib.reflection");
        this.defProcStFld("primitive-throw", "kawa.standard.prim_throw", "primitiveThrow");
        this.defSntxStFld("try-finally", "kawa.lib.syntax");
        this.defSntxStFld("try-catch", "kawa.lib.prim_syntax");
        this.defProcStFld("throw", "kawa.standard.throw_name", "throwName");
        this.defProcStFld("catch", "kawa.lib.syntax");
        this.defProcStFld("error", "kawa.lib.misc");
        this.defProcStFld("as", "gnu.kawa.functions.Convert", "as");
        this.defProcStFld("instance?", "kawa.standard.SubScheme", "instanceOf");
        this.defSntxStFld("synchronized", "kawa.lib.syntax");
        this.defSntxStFld("object", "kawa.standard.object", "objectSyntax");
        this.defSntxStFld("define-class", "kawa.standard.define_class", "define_class");
        this.defSntxStFld("define-simple-class", "kawa.standard.define_class", "define_simple_class");
        this.defSntxStFld("this", "kawa.standard.thisRef", "thisSyntax");
        this.defProcStFld("make", "gnu.kawa.reflect.Invoke", "make");
        this.defProcStFld("slot-ref", "gnu.kawa.reflect.SlotGet", "slotRef");
        this.defProcStFld("slot-set!", "gnu.kawa.reflect.SlotSet", "set$Mnfield$Ex");
        this.defProcStFld("field", "gnu.kawa.reflect.SlotGet");
        this.defProcStFld("class-methods", "gnu.kawa.reflect.ClassMethods", "classMethods");
        this.defProcStFld("static-field", "gnu.kawa.reflect.SlotGet", "staticField");
        this.defProcStFld("invoke", "gnu.kawa.reflect.Invoke", "invoke");

        this.defProcStFld("invoke-static", "gnu.kawa.reflect.Invoke", "invokeStatic");
        this.defProcStFld("invoke-special", "gnu.kawa.reflect.Invoke", "invokeSpecial");

        this.defSntxStFld("define-macro", "kawa.lib.syntax");
        this.defSntxStFld("%define-macro", "kawa.standard.define_syntax", "define_macro");
        this.defSntxStFld("define-syntax-case", "kawa.lib.syntax");
        this.defSntxStFld("syntax-case", "kawa.standard.syntax_case", "syntax_case");
        this.defSntxStFld("%define-syntax", "kawa.standard.define_syntax", "define_syntax");
        this.defSntxStFld("syntax", "kawa.standard.syntax", "syntax");
        this.defSntxStFld("quasisyntax", "kawa.standard.syntax", "quasiSyntax");
        this.defProcStFld("syntax-object->datum", "kawa.lib.std_syntax");
        this.defProcStFld("datum->syntax-object", "kawa.lib.std_syntax");
        this.defProcStFld("syntax->expression", "kawa.lib.prim_syntax");
        this.defProcStFld("syntax-body->expression", "kawa.lib.prim_syntax");
        this.defProcStFld("generate-temporaries", "kawa.lib.std_syntax");
        this.defSntxStFld("with-syntax", "kawa.lib.std_syntax");
        this.defProcStFld("syntax-source", "kawa.lib.syntax");
        this.defProcStFld("syntax-line", "kawa.lib.syntax");
        this.defProcStFld("syntax-column", "kawa.lib.syntax");
        this.defSntxStFld("define-for-syntax", "kawa.lib.prim_syntax");
        this.defSntxStFld("include", "kawa.lib.files");
        this.defSntxStFld("include-relative", "kawa.lib.files");

        this.defProcStFld("file-exists?", "kawa.lib.files");
        this.defProcStFld("file-directory?", "kawa.lib.files");
        this.defProcStFld("file-readable?", "kawa.lib.files");
        this.defProcStFld("file-writable?", "kawa.lib.files");
        this.defProcStFld("delete-file", "kawa.lib.files");
        this.defProcStFld("system-tmpdir", "kawa.lib.files");
        this.defProcStFld("make-temporary-file", "kawa.lib.files");
        this.defProcStFld("rename-file", "kawa.lib.files");
        this.defProcStFld("copy-file", "kawa.lib.files");
        this.defProcStFld("create-directory", "kawa.lib.files");
        this.defProcStFld("->pathname", "kawa.lib.files");
        this.define("port-char-encoding", Boolean.TRUE);
        this.define("symbol-read-case", "P");

        this.defProcStFld("system", "kawa.lib.system");
        this.defProcStFld("make-process", "kawa.lib.system");
        this.defProcStFld("tokenize-string-to-string-array", "kawa.lib.system");
        this.defProcStFld("tokenize-string-using-shell", "kawa.lib.system");
        this.defProcStFld("command-parse", "kawa.lib.system");

        this.defProcStFld("record-accessor", "kawa.lib.reflection");
        this.defProcStFld("record-modifier", "kawa.lib.reflection");
        this.defProcStFld("record-predicate", "kawa.lib.reflection");
        this.defProcStFld("record-constructor", "kawa.lib.reflection");
        this.defProcStFld("make-record-type", "kawa.lib.reflection");
        this.defProcStFld("record-type-descriptor", "kawa.lib.reflection");
        this.defProcStFld("record-type-name", "kawa.lib.reflection");
        this.defProcStFld("record-type-field-names", "kawa.lib.reflection");
        this.defProcStFld("record?", "kawa.lib.reflection");
        this.defSntxStFld("define-record-type", "gnu.kawa.slib.DefineRecordType");

        this.defSntxStFld("when", "kawa.lib.syntax"); //-- (when cond exp ...)
        this.defSntxStFld("unless", "kawa.lib.syntax"); //-- (unless cond exp ...)
        this.defSntxStFld("fluid-let", "kawa.standard.fluid_let", "fluid_let");
        this.defSntxStFld("constant-fold", "kawa.standard.constant_fold", "constant_fold");
        this.defProcStFld("make-parameter", "kawa.lib.parameters");
        this.defSntxStFld("parameterize", "kawa.lib.parameters");

        this.defProcStFld("compile-file", "kawa.lib.system");
        this.defProcStFld("environment-bound?", "kawa.lib.misc");
        this.defProcStFld("scheme-implementation-version", "kawa.lib.misc");
        this.defProcStFld("scheme-window", "kawa.lib.windows");
        this.defSntxStFld("define-procedure", "kawa.lib.syntax");
        this.defProcStFld("add-procedure-properties", "kawa.lib.syntax");
        this.defProcStFld("make-procedure", "gnu.kawa.functions.MakeProcedure", "makeProcedure");
        this.defProcStFld("procedure-property", "kawa.lib.misc");
        this.defProcStFld("set-procedure-property!", "kawa.lib.misc");
        this.defSntxStFld("provide", "kawa.lib.misc");
        this.defSntxStFld("test-begin", "kawa.lib.misc");
        this.defProcStFld("namespace", "kawa.lib.misc");

        this.defProcStFld("quantity->number", "kawa.lib.numbers");
        this.defProcStFld("quantity->unit", "kawa.lib.numbers");
        this.defProcStFld("make-quantity", "kawa.lib.numbers");
        this.defSntxStFld("define-namespace", "gnu.kawa.lispexpr.DefineNamespace", "define_namespace");
        this.defSntxStFld("define-xml-namespace", "gnu.kawa.lispexpr.DefineNamespace", "define_xml_namespace");
        this.defSntxStFld("define-private-namespace", "gnu.kawa.lispexpr.DefineNamespace", "define_private_namespace");
        this.defSntxStFld("define-unit", "kawa.standard.define_unit", "define_unit");
        this.defSntxStFld("define-base-unit", "kawa.standard.define_unit", "define_base_unit");
        this.defProcStFld("duration", "kawa.lib.numbers");

        this.defProcStFld("gentemp", "kawa.lib.syntax");
        this.defSntxStFld("defmacro", "kawa.lib.syntax");
        this.defProcStFld("setter", "gnu.kawa.functions.Setter", "setter");
        this.defSntxStFld("resource-uri", "kawa.lib.files");

        this.defProcStFld("resolve-uri", "kawa.lib.files");
        this.defSntxStFld("module-uri", "kawa.lib.files");

        this.defSntxStFld("future", "kawa.lib.thread");
        this.defProcStFld("sleep", "kawa.lib.thread");
        this.defProcStFld("runnable", "kawa.lib.thread");

        this.defSntxStFld("trace", "kawa.lib.trace");
        this.defSntxStFld("untrace", "kawa.lib.trace");

        this.defProcStFld("format", "gnu.kawa.functions.Format");
        this.defProcStFld("parse-format", "gnu.kawa.functions.ParseFormat", "parseFormat");

        this.defProcStFld("make-element", "gnu.kawa.xml.MakeElement", "makeElement");
        this.defProcStFld("make-attribute", "gnu.kawa.xml.MakeAttribute", "makeAttribute");
        this.defProcStFld("map-values", "gnu.kawa.functions.ValuesMap", "valuesMap");
        this.defProcStFld("children", "gnu.kawa.xml.Children", "children");
        this.defProcStFld("attributes", "gnu.kawa.xml.Attributes");
        this.defProcStFld("unescaped-data", "gnu.kawa.xml.MakeUnescapedData", "unescapedData");
        this.defProcStFld("keyword?", "kawa.lib.keywords");
        this.defProcStFld("keyword->string", "kawa.lib.keywords");
        this.defProcStFld("string->keyword", "kawa.lib.keywords");
        this.defSntxStFld("location", "kawa.standard.location", "location");
        this.defSntxStFld("define-alias", "kawa.standard.define_alias", "define_alias");
        this.defSntxStFld("define-variable", "kawa.standard.define_variable", "define_variable");
        this.defSntxStFld("define-member-alias", "kawa.standard.define_member_alias", "define_member_alias");
        this.defSntxStFld("require", "kawa.standard.require", "require");
        this.defSntxStFld("module-name", "kawa.standard.module_name", "module_name");
        this.defSntxStFld("module-extends", "kawa.standard.module_extends", "module_extends");
        this.defSntxStFld("module-implements", "kawa.standard.module_implements", "module_implements");
        this.defSntxStFld("module-static", "kawa.standard.module_static", "module_static");
        this.defSntxStFld("module-export", "kawa.standard.export", "module_export");
        this.defSntxStFld("module-compile-options", "kawa.standard.module_compile_options", "module_compile_options");
        this.defSntxStFld("with-compile-options", "kawa.standard.with_compile_options", "with_compile_options");

        this.defProcStFld("array?", "kawa.lib.arrays");
        this.defProcStFld("array-rank", "kawa.lib.arrays");
        this.defProcStFld("make-array", "kawa.lib.arrays");
        this.defProcStFld("array", "kawa.lib.arrays");
        this.defProcStFld("array-start", "kawa.lib.arrays");
        this.defProcStFld("array-end", "kawa.lib.arrays");
        this.defProcStFld("shape", "kawa.lib.arrays");
        this.defProcStFld("array-ref", "gnu.kawa.functions.ArrayRef", "arrayRef");
        this.defProcStFld("array-set!", "gnu.kawa.functions.ArraySet", "arraySet");
        this.defProcStFld("share-array", "kawa.lib.arrays");

        this.defProcStFld("s8vector?", "kawa.lib.uniform");
        this.defProcStFld("make-s8vector", "kawa.lib.uniform");
        this.defProcStFld("s8vector", "kawa.lib.uniform");
        this.defProcStFld("s8vector-length", "kawa.lib.uniform");
        this.defProcStFld("s8vector-ref", "kawa.lib.uniform");
        this.defProcStFld("s8vector-set!", "kawa.lib.uniform");
        this.defProcStFld("s8vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->s8vector", "kawa.lib.uniform");
        this.defProcStFld("u8vector?", "kawa.lib.uniform");
        this.defProcStFld("make-u8vector", "kawa.lib.uniform");
        this.defProcStFld("u8vector", "kawa.lib.uniform");
        this.defProcStFld("u8vector-length", "kawa.lib.uniform");
        this.defProcStFld("u8vector-ref", "kawa.lib.uniform");
        this.defProcStFld("u8vector-set!", "kawa.lib.uniform");
        this.defProcStFld("u8vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->u8vector", "kawa.lib.uniform");

        this.defProcStFld("s16vector?", "kawa.lib.uniform");
        this.defProcStFld("make-s16vector", "kawa.lib.uniform");
        this.defProcStFld("s16vector", "kawa.lib.uniform");
        this.defProcStFld("s16vector-length", "kawa.lib.uniform");
        this.defProcStFld("s16vector-ref", "kawa.lib.uniform");
        this.defProcStFld("s16vector-set!", "kawa.lib.uniform");
        this.defProcStFld("s16vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->s16vector", "kawa.lib.uniform");
        this.defProcStFld("u16vector?", "kawa.lib.uniform");
        this.defProcStFld("make-u16vector", "kawa.lib.uniform");
        this.defProcStFld("u16vector", "kawa.lib.uniform");
        this.defProcStFld("u16vector-length", "kawa.lib.uniform");
        this.defProcStFld("u16vector-ref", "kawa.lib.uniform");
        this.defProcStFld("u16vector-set!", "kawa.lib.uniform");
        this.defProcStFld("u16vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->u16vector", "kawa.lib.uniform");

        this.defProcStFld("s32vector?", "kawa.lib.uniform");
        this.defProcStFld("make-s32vector", "kawa.lib.uniform");
        this.defProcStFld("s32vector", "kawa.lib.uniform");
        this.defProcStFld("s32vector-length", "kawa.lib.uniform");
        this.defProcStFld("s32vector-ref", "kawa.lib.uniform");
        this.defProcStFld("s32vector-set!", "kawa.lib.uniform");
        this.defProcStFld("s32vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->s32vector", "kawa.lib.uniform");
        this.defProcStFld("u32vector?", "kawa.lib.uniform");
        this.defProcStFld("make-u32vector", "kawa.lib.uniform");
        this.defProcStFld("u32vector", "kawa.lib.uniform");
        this.defProcStFld("u32vector-length", "kawa.lib.uniform");
        this.defProcStFld("u32vector-ref", "kawa.lib.uniform");
        this.defProcStFld("u32vector-set!", "kawa.lib.uniform");
        this.defProcStFld("u32vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->u32vector", "kawa.lib.uniform");

        this.defProcStFld("s64vector?", "kawa.lib.uniform");
        this.defProcStFld("make-s64vector", "kawa.lib.uniform");
        this.defProcStFld("s64vector", "kawa.lib.uniform");
        this.defProcStFld("s64vector-length", "kawa.lib.uniform");
        this.defProcStFld("s64vector-ref", "kawa.lib.uniform");
        this.defProcStFld("s64vector-set!", "kawa.lib.uniform");
        this.defProcStFld("s64vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->s64vector", "kawa.lib.uniform");
        this.defProcStFld("u64vector?", "kawa.lib.uniform");
        this.defProcStFld("make-u64vector", "kawa.lib.uniform");
        this.defProcStFld("u64vector", "kawa.lib.uniform");
        this.defProcStFld("u64vector-length", "kawa.lib.uniform");
        this.defProcStFld("u64vector-ref", "kawa.lib.uniform");
        this.defProcStFld("u64vector-set!", "kawa.lib.uniform");
        this.defProcStFld("u64vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->u64vector", "kawa.lib.uniform");

        this.defProcStFld("f32vector?", "kawa.lib.uniform");
        this.defProcStFld("make-f32vector", "kawa.lib.uniform");
        this.defProcStFld("f32vector", "kawa.lib.uniform");
        this.defProcStFld("f32vector-length", "kawa.lib.uniform");
        this.defProcStFld("f32vector-ref", "kawa.lib.uniform");
        this.defProcStFld("f32vector-set!", "kawa.lib.uniform");
        this.defProcStFld("f32vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->f32vector", "kawa.lib.uniform");
        this.defProcStFld("f64vector?", "kawa.lib.uniform");
        this.defProcStFld("make-f64vector", "kawa.lib.uniform");
        this.defProcStFld("f64vector", "kawa.lib.uniform");
        this.defProcStFld("f64vector-length", "kawa.lib.uniform");
        this.defProcStFld("f64vector-ref", "kawa.lib.uniform");
        this.defProcStFld("f64vector-set!", "kawa.lib.uniform");
        this.defProcStFld("f64vector->list", "kawa.lib.uniform");
        this.defProcStFld("list->f64vector", "kawa.lib.uniform");

        this.defSntxStFld("cut", "gnu.kawa.slib.cut");
        this.defSntxStFld("cute", "gnu.kawa.slib.cut");

        this.defSntxStFld("cond-expand", "kawa.lib.syntax");
        this.defSntxStFld("%cond-expand", "kawa.lib.syntax");

        this.defAliasStFld("*print-base*", "gnu.kawa.functions.DisplayFormat", "outBase");
        this.defAliasStFld("*print-radix*", "gnu.kawa.functions.DisplayFormat", "outRadix");
        this.defAliasStFld("*print-right-margin*", "gnu.text.PrettyWriter", "lineLengthLoc");
        this.defAliasStFld("*print-miser-width*", "gnu.text.PrettyWriter", "miserWidthLoc");
        this.defAliasStFld("html", "gnu.kawa.xml.XmlNamespace", "HTML");
        this.defAliasStFld("unit", "kawa.standard.SubScheme", "unitNamespace");

        this.defAliasStFld("path", "gnu.kawa.lispexpr.LangObjType", "pathType");
        this.defAliasStFld("filepath", "gnu.kawa.lispexpr.LangObjType", "filepathType");
        this.defAliasStFld("URI", "gnu.kawa.lispexpr.LangObjType", "URIType");
        this.defProcStFld("path?", "kawa.lib.files");
        this.defProcStFld("filepath?", "kawa.lib.files");
        this.defProcStFld("URI?", "kawa.lib.files");
        this.defProcStFld("absolute-path?", "kawa.lib.files");
        this.defProcStFld("path-scheme", "kawa.lib.files");
        this.defProcStFld("path-authority", "kawa.lib.files");
        this.defProcStFld("path-user-info", "kawa.lib.files");
        this.defProcStFld("path-host", "kawa.lib.files");
        this.defProcStFld("path-port", "kawa.lib.files");
        this.defProcStFld("path-file", "kawa.lib.files");
        this.defProcStFld("path-parent", "kawa.lib.files");
        this.defProcStFld("path-directory", "kawa.lib.files");
        this.defProcStFld("path-last", "kawa.lib.files");
        this.defProcStFld("path-extension", "kawa.lib.files");
        this.defProcStFld("path-fragment", "kawa.lib.files");
        this.defProcStFld("path-query", "kawa.lib.files");

        SubScheme.kawaEnvironment.setLocked();
    }

    public Expression makeApply(Expression func, Expression[] args) {
        final Expression[] exps = new Expression[args.length + 1];
        exps[0] = func;
        System.arraycopy(args, 0, exps, 1, args.length);
        return new ApplyExp(new ReferenceExp(SubScheme.applyFieldDecl), exps);
    }
    public static final Environment                 nullEnvironment;

    public static final Environment                 r4Environment;
    public static final Environment                 r5Environment;
    protected static final SimpleEnvironment        kawaEnvironment;
    public static LangPrimType                      booleanType;
    public static final SubLispScheme               instance;

    public static final gnu.kawa.reflect.InstanceOf instanceOf;
    public static final not                         not;

    public static final kawa.standard.map           map;

    public static final kawa.standard.map           forEach;

    public static final gnu.kawa.functions.IsEq     isEq;

    public static final gnu.kawa.functions.IsEqv    isEqv;

    public static final gnu.kawa.functions.IsEqual  isEqual;
    public static final kawa.repl                   repl;

    public static final NumberCompare               numEqu;

    public static final NumberCompare               numGrt;

    public static final NumberCompare               numGEq;

    public static final NumberCompare               numLss;

    public static final NumberCompare               numLEq;

    public static final ApplyToArgs                 applyToArgs;

    static final Declaration                        applyFieldDecl;

    public static final Lambda                      lambda        = new kawa.lang.Lambda();
    public static final AbstractFormat              writeFormat   = new DisplayFormat(true, 'S');

    public static final AbstractFormat              displayFormat = new DisplayFormat(false, 'S');

    static Hashtable                                types;

    public static final Namespace                   unitNamespace = Namespace.make("http://kawa.gnu.org/unit", "unit");

    static {
        // (null-environment)
        nullEnvironment = Environment.make("null-environment");
        r4Environment = Environment.make("r4rs-environment", SubScheme.nullEnvironment);
        r5Environment = Environment.make("r5rs-environment", SubScheme.r4Environment);
        kawaEnvironment = Environment.make("kawa-environment", SubScheme.r5Environment);

        instance = new SubLispScheme(SubScheme.kawaEnvironment);
        instanceOf = new gnu.kawa.reflect.InstanceOf(SubScheme.instance, "instance?");
        not = new not(SubScheme.instance, "not");
        map = new map(true);
        forEach = new map(false);
        applyToArgs = new ApplyToArgs("apply-to-args", SubScheme.instance);
        applyFieldDecl = Declaration.getDeclarationFromStatic("kawa.standard.SubScheme", "applyToArgs");
        isEq = new gnu.kawa.functions.IsEq(SubScheme.instance, "eq?");
        isEqv = new gnu.kawa.functions.IsEqv(SubScheme.instance, "eqv?", SubScheme.isEq);
        isEqual = new gnu.kawa.functions.IsEqual(SubScheme.instance, "equal?");
        numEqu = NumberCompare.make(SubScheme.instance, "=", NumberCompare.TRUE_IF_EQU);
        numGrt = NumberCompare.make(SubScheme.instance, ">", NumberCompare.TRUE_IF_GRT);
        numGEq = NumberCompare.make(SubScheme.instance, ">=", NumberCompare.TRUE_IF_GRT | NumberCompare.TRUE_IF_EQU);
        numLss = NumberCompare.make(SubScheme.instance, "<", NumberCompare.TRUE_IF_LSS);
        numLEq = NumberCompare.make(SubScheme.instance, "<=", NumberCompare.TRUE_IF_LSS | NumberCompare.TRUE_IF_EQU);

        // Declare the special symbol $lookup$ (from the reader)
        // and bind it to getNamedPartDecl.
        SubScheme.instance.environ.addLocation(LispLanguage.lookup_sym, null, Translator.getNamedPartLocation);

        repl = new kawa.repl(SubScheme.instance);
        SubScheme.instance.initScheme();
    }

    static {
        SubScheme.lambda.setKeywords(Special.optional, Special.rest, Special.key);
    }

    public static Environment builtin() {
        return SubScheme.kawaEnvironment;
    }

    /** Evalutate SubScheme expressions from stream.
     * @param port the port to read SubScheme expressions from
     * @param env the Environment to evaluate the string in
     * @return result of last expression, or Language.voidObject if none. */
    public static Object eval(InPort port, Environment env) {
        final SourceMessages messages = new SourceMessages();
        try {
            final LispReader lexer = (LispReader) Language.getDefaultLanguage().getLexer(port, messages);
            final Object body = ReaderParens.readList(lexer, 0, 1, -1);
            if (messages.seenErrors()) throw new gnu.text.SyntaxException(messages);
            return Eval.evalBody(body, env, messages);
        } catch (final gnu.text.SyntaxException e) {
            // The '\n' is because a SyntaxException includes a line number,
            // and it is better if that starts the line.  FIXME OBSOLETE
            throw new RuntimeException("eval: errors while compiling:\n" + e.getMessages().toString(20));
        } catch (final java.io.IOException e) {
            throw new RuntimeException("eval: I/O exception: " + e.toString());
        } catch (final RuntimeException ex) {
            throw ex;
        } catch (final Error ex) {
            throw ex;
        } catch (final Throwable ex) {
            throw new WrappedException(ex);
        }
    }

    /** Evalutate SubScheme expressions from an "S expression."
     * @param sexpr the S expression to evaluate
     * @param env the Environment to evaluate the string in
     * @return result of the expression. */
    public static Object eval(Object sexpr, Environment env) {
        try {
            return Eval.eval(sexpr, env);
        } catch (final RuntimeException ex) {
            throw ex;
        } catch (final Error ex) {
            throw ex;
        } catch (final Throwable ex) {
            throw new WrappedException(ex);
        }
    }

    /** Evalutate SubScheme expressions from string.
     * @param string the string constaining SubScheme expressions
     * @param env the Environment to evaluate the string in
     * @return result of last expression, or Language.voidObject if none. */
    public static Object eval(String string, Environment env) {
        return SubScheme.eval(new CharArrayInPort(string), env);
    }

    /** Convert expression to a Type.
     * Allow "TYPE" or 'TYPE or <TYPE>.
     */
    public static Type exp2Type(Expression exp) {
        return SubScheme.getInstance().getTypeFor(exp);
    }

    public static SubScheme getInstance() {
        return SubScheme.instance;
    }

    public static Type getNamedType(String name) {
        if (SubScheme.types == null) {
            SubScheme.booleanType = new LangPrimType(Type.boolean_type, SubScheme.getInstance());
            SubScheme.types = new Hashtable();
            SubScheme.types.put("void", LangPrimType.voidType);
            SubScheme.types.put("int", LangPrimType.intType);
            SubScheme.types.put("char", LangPrimType.charType);
            SubScheme.types.put("boolean", SubScheme.booleanType);
            SubScheme.types.put("byte", LangPrimType.byteType);
            SubScheme.types.put("short", LangPrimType.shortType);
            SubScheme.types.put("long", LangPrimType.longType);
            SubScheme.types.put("float", LangPrimType.floatType);
            SubScheme.types.put("double", LangPrimType.doubleType);
            SubScheme.types.put("never-returns", Type.neverReturnsType);

            SubScheme.types.put("Object", Type.pointer_type);
            SubScheme.types.put("String", Type.tostring_type);

            SubScheme.types.put("object", Type.pointer_type);
            SubScheme.types.put("number", ObjectType.make("gnu.math.Numeric"));
            SubScheme.types.put("quantity", ObjectType.make("gnu.math.Quantity"));
            SubScheme.types.put("complex", ObjectType.make("gnu.math.Complex"));
            SubScheme.types.put("real", ObjectType.make("gnu.math.RealNum"));
            SubScheme.types.put("rational", ObjectType.make("gnu.math.RatNum"));
            SubScheme.types.put("integer", ObjectType.make("gnu.math.IntNum"));
            SubScheme.types.put("symbol", ObjectType.make("gnu.mapping.Symbol"));
            SubScheme.types.put("keyword", ObjectType.make("gnu.expr.Keyword"));
            SubScheme.types.put("list", ObjectType.make("gnu.lists.LList"));
            SubScheme.types.put("pair", ObjectType.make("gnu.lists.Pair"));
            SubScheme.types.put("pair-with-position", ObjectType.make("gnu.lists.PairWithPosition"));
            /* #ifdef use:java.lang.CharSequence */
            SubScheme.types.put("string", ObjectType.make("java.lang.CharSequence"));
            /* #else */
            // /* better would be a union of CharSeq and java.lang.String. */
            // types.put ("string", ClassType.make("gnu.lists.FString"));
            /* #endif */
            SubScheme.types.put("constant-string", ObjectType.make("java.lang.String"));
            SubScheme.types.put("abstract-string", ObjectType.make("gnu.lists.CharSeq"));
            SubScheme.types.put("character", ObjectType.make("gnu.text.Char"));
            SubScheme.types.put("vector", ObjectType.make("gnu.lists.FVector"));
            SubScheme.types.put("function", ObjectType.make("gnu.mapping.Procedure"));
            SubScheme.types.put("procedure", ObjectType.make("gnu.mapping.Procedure"));
            SubScheme.types.put("input-port", ObjectType.make("gnu.mapping.InPort"));
            SubScheme.types.put("output-port", ObjectType.make("gnu.mapping.OutPort"));
            SubScheme.types.put("string-output-port", ObjectType.make("gnu.mapping.CharArrayOutPort"));
            SubScheme.types.put("record", ObjectType.make("kawa.lang.Record"));
            SubScheme.types.put("type", LangObjType.typeType);
            SubScheme.types.put("class-type", LangObjType.typeClassType);
            SubScheme.types.put("class", LangObjType.typeClass);

            SubScheme.types.put("s8vector", ObjectType.make("gnu.lists.S8Vector"));
            SubScheme.types.put("u8vector", ObjectType.make("gnu.lists.U8Vector"));
            SubScheme.types.put("s16vector", ObjectType.make("gnu.lists.S16Vector"));
            SubScheme.types.put("u16vector", ObjectType.make("gnu.lists.U16Vector"));
            SubScheme.types.put("s32vector", ObjectType.make("gnu.lists.S32Vector"));
            SubScheme.types.put("u32vector", ObjectType.make("gnu.lists.U32Vector"));
            SubScheme.types.put("s64vector", ObjectType.make("gnu.lists.S64Vector"));
            SubScheme.types.put("u64vector", ObjectType.make("gnu.lists.U64Vector"));
            SubScheme.types.put("f32vector", ObjectType.make("gnu.lists.F32Vector"));
            SubScheme.types.put("f64vector", ObjectType.make("gnu.lists.F64Vector"));
            SubScheme.types.put("document", ObjectType.make("gnu.lists.TreeList"));
            SubScheme.types.put("readtable", ObjectType.make("gnu.kawa.lispexpr.ReadTable"));
        }
        Type type = (Type) SubScheme.types.get(name);
        if ((type == null) && (name.startsWith("elisp:") || name.startsWith("clisp:"))) {
            final int colon = name.indexOf(':');
            final Class clas = SubScheme.getNamedType(name.substring(colon + 1)).getReflectClass();
            final String lang = name.substring(0, colon);
            final Language interp = Language.getInstance(lang);
            if (interp == null) throw new RuntimeException("unknown type '" + name + "' - unknown language '" + lang + '\'');
            type = interp.getTypeFor(clas);
            if (type != null) SubScheme.types.put(name, type);
        }
        return type;
    }

    /** If exp is a "constant" Type, return that type, otherwise return null. */
    public static Type getTypeValue(Expression exp) {
        return SubScheme.getInstance().getTypeFor(exp);
    }

    /** The compiler insert calls to this method for applications and applets. */
    public static void registerEnvironment() {
        Language.setDefaults(SubScheme.getInstance());
    }

    public static Type string2Type(String name) {
        Type t;
        if (name.endsWith("[]")) {
            t = SubScheme.string2Type(name.substring(0, name.length() - 2));
            if (t != null) t = ArrayType.make(t);
        } else
            t = SubScheme.getNamedType(name);
        if (t != null) return t;
        t = Language.string2Type(name);
        if (t != null) SubScheme.types.put(name, t);
        return t;
    }
}
