package dmiles.transform.sublisp;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;

import kawa.standard.Scheme;

import gnu.bytecode.*;
import gnu.math.IntNum;
import gnu.math.DFloNum;
import gnu.expr.*;
import gnu.text.Char;
import gnu.mapping.Procedure;
import gnu.mapping.Values;

/** Use to implement some special types that convert differently. */

public class LangWiddeningType extends ClassType implements TypeValue {
    static Language                       language     = new SubLispScheme();
    PrimType                              primitiveImplementationType;
    Set<Type>                             typesCovered = new HashSet<Type>();

    public static final LangWiddeningType byteType     = new LangWiddeningType(Type.byte_type);

    public static final LangWiddeningType shortType    = new LangWiddeningType(Type.short_type);
    public static final LangWiddeningType intType      = new LangWiddeningType(Type.int_type);
    public static final LangWiddeningType longType     = new LangWiddeningType(Type.long_type);
    public static final LangWiddeningType floatType    = new LangWiddeningType(Type.float_type);
    public static final LangWiddeningType doubleType   = new LangWiddeningType(Type.double_type);
    public static final LangWiddeningType charType     = new LangWiddeningType(Type.char_type);
    public static final LangWiddeningType voidType     = new LangWiddeningType(Type.void_type);

    public LangWiddeningType(PrimType type) {
        this(type.getName(), type.getSignature(), type.getSize(), type.getReflectClass());
        this.primitiveImplementationType = type;
    }

    public LangWiddeningType(String nam, String sig, int siz, Class reflectClass) {
        super(nam);
        this.signature = sig;
        this.size = siz;
        this.reflectClass = reflectClass;

    }

    public LangWiddeningType(String nam, String sig, int siz, Class reflectClass, Language language) {
        this(nam, sig, siz, reflectClass);
        primitiveImplementationType = Type.signatureToPrimitive(sig.charAt(0));
        this.language = language;
    }

    public Type getImplementationType() {
        return primitiveImplementationType;
    }

    public Object coerceFromObject(Object obj) {
        if (obj.getClass() == reflectClass) return obj;
        char sig1 = getSignature().charAt(0);
        switch (sig1) {
            case 'Z':
                return language.isTrue(obj) ? Boolean.TRUE : Boolean.FALSE;
            case 'C':
                return new Character(((Char) obj).charValue());
            case 'V':
                return Values.empty;
        }
        return super.coerceFromObject(obj);
    }

    public char charValue(Object value) {
        if (value instanceof Character) return ((Character) value).charValue();
        return ((Char) value).charValue();
    }

    public void emitIsInstance(CodeAttr code) {
        char sig1 = getSignature().charAt(0);
        switch (sig1) {
            case 'Z':
                code.emitPop(1);
                code.emitPushInt(1);
                break;
            case 'C':
                ObjectType scmCharType = ObjectType.make("gnu.text.Char");
                code.emitInstanceof(scmCharType);
                break;
            default:
                super.emitIsInstance(code);
        }
    }

    public void emitCoerceFromObject(CodeAttr code) {
        char sig1 = getSignature().charAt(0);
        switch (sig1) {
            case 'Z':
                language.emitCoerceToBoolean(code);
                break;
            case 'C':
                // We handle char specially, because Kawa does not use standard
                // java.lang.Character type.
                ObjectType scmCharType = ObjectType.make("gnu.text.Char");
                Method charValueMethod = scmCharType.getDeclaredMethod("charValue", 0);
                code.emitCheckcast(scmCharType);
                code.emitInvokeVirtual(charValueMethod);
                break;
            default:
                super.emitCoerceFromObject(code);
        }
    }

    public Object coerceToObject(Object obj) {
        char sig1 = getSignature().charAt(0);
        switch (sig1) {
            case 'Z':
                return language.booleanObject(((Boolean) obj).booleanValue());
            case 'C':
                if (obj instanceof Char) return obj;
                return Char.make(((Character) obj).charValue());
            case 'B':
            case 'S':
            case 'I':
                return IntNum.make(((Number) obj).intValue());
            case 'J':
                return IntNum.make(((Number) obj).longValue());
            case 'D':
            case 'F':
                return DFloNum.make(((Number) obj).doubleValue());
            case 'V':
                // Perhaps we should return Language.noValue() instead?
                return gnu.mapping.Values.empty;
        }
        return super.coerceToObject(obj);
    }

    public void emitCoerceToObject(CodeAttr code) {
        char sig1 = getSignature().charAt(0);
        Type argType = null;
        String cname = null;
        switch (sig1) {
            case 'Z':
                code.emitIfIntNotZero();
                language.emitPushBoolean(true, code);
                code.emitElse();
                language.emitPushBoolean(false, code);
                code.emitFi();
                break;
            case 'C':
                ObjectType scmCharType = ObjectType.make("gnu.text.Char");
                Method makeCharMethod = scmCharType.getDeclaredMethod("make", 1);
                code.emitInvokeStatic(makeCharMethod);
                break;
            case 'B':
            case 'S':
            case 'I':
                cname = "gnu.math.IntNum";
                argType = Type.int_type;
                break;
            case 'J':
                cname = "gnu.math.IntNum";
                argType = Type.long_type;
                break;
            case 'F':
                code.emitConvert(Type.float_type, Type.double_type);
                // ... fall through ...
            case 'D':
                cname = "gnu.math.DFloNum";
                argType = Type.double_type;
                break;
            default:
                super.emitCoerceToObject(code);
        }
        if (cname != null) {
            ObjectType clas = ObjectType.make(cname);
            Type[] args = { argType };
            code.emitInvokeStatic(clas.getDeclaredMethod("make", args));
        }
    }

    public int compare(Type other) {
        // Anything (except void) can be converted to boolean.
        char sig1 = getSignature().charAt(0);
        if (other instanceof PrimType) {
            char sig2 = other.getSignature().charAt(0);
            if (sig1 == sig2) return 0;
            if (sig1 == 'V') return 1;
            if (sig2 == 'V' || sig2 == 'Z') return -1;
        }
        if (sig1 == 'V' || sig1 == 'Z') return 1;
        return super.compare(other);
    }

    public void emitTestIf(Variable incoming, Declaration decl, Compilation comp) {
        char sig1 = getSignature().charAt(0);
        /*
        switch (sig1)
          {
          case 'Z':
          }
        */
        CodeAttr code = comp.getCode();
        if (incoming != null) code.emitLoad(incoming);
        if (decl != null) {
            code.emitDup();
            decl.compileStore(comp);
        }
        emitIsInstance(code);
        code.emitIfIntNotZero();
    }

    public void emitIsInstance(Variable incoming, Compilation comp, Target target) {
        gnu.kawa.reflect.InstanceOf.emitIsInstance(this, incoming, comp, target);
    }

    public Procedure getConstructor() {
        return null;
    }

    /* (non-Javadoc)
     * @see gnu.bytecode.PrimType#getObjectType()
     */
    public ObjectType getTop() {
        // TODO Auto-generated method stub
        return primitiveImplementationType.getTop();
    }
}
