//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.PatchFileLoader;

public class SubLCompiledFunction extends AbstractSubLFunction implements SubLFunction {
	public class FuncallCounts {
		public int[] counts;

		FuncallCounts() {
			Arrays.fill(this.counts = new int[51], 0);
			SubLCompiledFunction.funcallCountsArray.add(this);
		}

		public String getMethodName() {
			return SubLCompiledFunction.this.method.getName();
		}

		synchronized void incCount(int arity) {
			if (arity > 50)
				return;
			int[] counts = this.counts;
			++counts[arity];
		}
	}

	public static String FUNCTION_TYPE_NAME;

	public static boolean SHOULD_MAINTAIN_FUNCALL_COUNTS = true;

	public static int MAX_ARITY_TO_MAINTAIN_COUNTS_FOR = 50;
	public static int MIN_FUNCALL_COUNTS_TO_CARE_ABOUT = 100;
	public static ArrayList<FuncallCounts> funcallCountsArray;
	public static boolean USE_DIRECT_CALLING_MECHANISM = false;
	static {
		SubLCompiledFunction.FUNCTION_TYPE_NAME = "FUNCTION";
		SubLCompiledFunction.funcallCountsArray = new ArrayList<FuncallCounts>();
	}
	private Method method;
	private Class methodClass;
	private Class returnType;
	private String methodClassStr;
	private String methodName;
	private Class[] methodParameters;
	private SubLList arglist;
	public volatile FuncallCounts funcallCounts;

	SubLCompiledFunction(Method method, SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount,
			boolean allowsRest) {
		super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		this.arglist = null;
		this.funcallCounts = new FuncallCounts();
		if (method == null)
			Errors.error("Got null native method for: " + functionSymbol);
		this.setMethod(method);
		functionSymbol.setFunction(this);
	}

	SubLCompiledFunction(String methodClassStr, String methodName, Class[] methodParameters, Class returnType,
			SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
		super(functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		this.arglist = null;
		this.funcallCounts = new FuncallCounts();
		this.methodClassStr = methodClassStr;
		this.methodName = methodName;
		this.methodParameters = methodParameters;
		this.returnType = returnType;
		functionSymbol.setFunction(this);
	}

	public SubLObject apply(Object[] args) {
		int arity = 0;
		for (int i = 0, size = args.length; i < size; ++i)
			if (args[i] != CommonSymbols.UNPROVIDED)
				if (args[i] instanceof SubLObject[])
					arity += ((SubLObject[]) args[i]).length;
				else
					++arity;
		this.funcallCounts.incCount(arity);
		SubLObject result = null;
		try {
			result = (SubLObject) this.getMethod().invoke(null, args);
			return Values.setFirstMultipleValue(result);
		} catch (InvocationTargetException ite) {
			Throwable e = ite.getCause();
			if (e instanceof Unhandleable)
				throw (Unhandleable) e;
			if (e instanceof CatchableThrow)
				throw (CatchableThrow) e;
			if (e instanceof Error)
				throw (Error) e;
			Errors.error("Error calling " + this.methodName + ".", e);
		} catch (Throwable e2) {
			if (e2 instanceof Unhandleable)
				throw (Unhandleable) e2;
			if (e2 instanceof CatchableThrow)
				throw (CatchableThrow) e2;
			if (e2 instanceof Error)
				throw (Error) e2;
			Errors.error("Error calling " + this.methodName + ".", e2);
		}
		return CommonSymbols.NIL;
	}

	public int applyArity() {
		return this.getRequiredArgCount() + this.getOptionalArgCount();
	}

	public SubLList getArglist() {
		SubLList existing = this.arglist;
		if (existing != null)
			return existing;
		int required = this.getRequiredArgCount();
		int optional = this.getOptionalArgCount();
		boolean rest = this.allowsRest();
		int size = required + (optional > 0 ? optional + 1 : 0) + (rest ? 2 : 0);
		SubLObject current;
		SubLList arglist = (SubLList) (current = SubLObjectFactory.makeList(size, CommonSymbols.NIL));
		SubLPackage sublispPackage = SubLPackage.findPackageNamed("SUBLISP");
		int i;
		for (i = 0; i < required; ++i, current = current.rest()) {
			SubLSymbol sym = SubLObjectFactory.makeSymbol("REQ-" + i, sublispPackage);
			current.setFirst(sym);
		}
		if (optional > 0) {
			current.setFirst(CommonSymbols.OPTIONAL_SYMBOL);
			for (current = current.rest(); i < required + optional; ++i, current = current.rest()) {
				SubLSymbol sym = SubLObjectFactory.makeSymbol("OPT-" + i, sublispPackage);
				current.setFirst(sym);
			}
		}
		if (rest) {
			current.setFirst(CommonSymbols.REST_SYMBOL);
			current = current.rest();
			SubLSymbol sym = SubLObjectFactory.makeSymbol("REST-LIST", sublispPackage);
			current.setFirst(sym);
		}
		return arglist;
	}

	public Method getMethod() {
		if (this.method == null)
			try {
				Class theClass = PatchFileLoader.PATCH_FILE_LOADER.loadClass(this.methodClassStr);
				this.method = theClass.getMethod(this.methodName, this.methodParameters);
			} catch (Exception e) {
				Errors.error("Problem initializing function: " + this.methodClassStr + "." + this.methodName);
			}
		return this.method;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return this.getMethod().hashCode();
		return 0;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return true;
	}

	public boolean isFunctionSpec() {
		return true;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isInterpreted() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	/*
	 * @todo potential future optimization -- not needed atm because of better
	 * optimization elsewhere private synchronized GenMethod makeInstance() { if
	 * (staticMethodInstance == null) { SingleMethodClass mc = new
	 * SingleMethodClass(); try { staticMethodInstance = mc.genGenMethod(); }
	 * catch (Exception e) { Errors.error("Problem initializing function: " +
	 * this.methodClassStr + "." + this.methodName, e); } catch (Throwable t) {
	 * t.printStackTrace(); Errors.error("Problem initializing function: " +
	 * this.methodClassStr + "." + this.methodName, new SubLException(t)); } }
	 * return staticMethodInstance; }
	 *
	 * public interface GenMethod {
	 *
	 * SubLObject invoke(Object[] args);// throws InvocationTargetException; }
	 *
	 * public byte[] byteCode() {
	 *
	 * ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES |
	 * ClassWriter.COMPUTE_FRAMES); MethodVisitor mv;
	 *
	 * cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER,
	 * "com/cyc/tool/subl/jrtl/nativeCode/type/operator/GenMethod$" + serial,
	 * null, "java/lang/Object", new String[]{
	 * "com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction$GenMethod"
	 * });
	 *
	 * cw.visitSource("SubLCompiledFunction_gen.java", null);
	 *
	 * cw.visitInnerClass(
	 * "com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction$GenMethod",
	 * "com/cyc/tool/subl/jrtl/nativeCode/type/operator/SubLCompiledFunction",
	 * "GenMethod", ACC_PUBLIC + ACC_STATIC + ACC_ABSTRACT + ACC_INTERFACE); {
	 * mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
	 * mv.visitCode(); mv.visitVarInsn(ALOAD, 0);
	 * mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
	 * mv.visitInsn(RETURN); mv.visitMaxs(1, 1); mv.visitEnd(); } /// Class[]
	 * ptypes = methodParameters;// method.getParameterTypes(); { mv =
	 * cw.visitMethod(ACC_PUBLIC, "invoke",
	 * "([Ljava/lang/Object;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;",
	 * null, null); mv.visitCode(); Type[] ptypes = new
	 * Type[SubLCompiledFunction.this.methodParameters == null ? 0 :
	 * SubLCompiledFunction.this.methodParameters.length]; for (int i = 0; i <
	 * ptypes.length; i++) { ptypes[i] = Type.getType(methodParameters[i]);
	 * mv.visitVarInsn(ALOAD, 1); switch (i) { case 0: mv.visitInsn(ICONST_0);
	 * break; case 1: mv.visitInsn(ICONST_1); break; case 2:
	 * mv.visitInsn(ICONST_2); break; case 3: mv.visitInsn(ICONST_3); break;
	 * case 4: mv.visitInsn(ICONST_4); break; case 5: mv.visitInsn(ICONST_5);
	 * break; default: mv.visitIntInsn(BIPUSH, i); } mv.visitInsn(AALOAD);
	 * mv.visitTypeInsn(CHECKCAST, Type.getInternalName(methodParameters[i])); }
	 * mv.visitMethodInsn(INVOKESTATIC, methodClassStr.replace(".", "/"),
	 * methodName, Type.getMethodDescriptor(Type.getType(returnType), ptypes));
	 * mv.visitInsn(ARETURN); mv.visitMaxs(ptypes.length + 2, 2); mv.visitEnd();
	 * } cw.visitEnd(); return cw.toByteArray(); }
	 *
	 * public Object coerce(Class t) { if (t.isInstance(this)) { return this; }
	 * if (CharSequence.class.isAssignableFrom(t)) { return "(" +
	 * getFunctionSymbol() + " " + this.getArglist() + ")"; // if
	 * (Number.class.isAssignableFrom(t)) return t.cast(this.hashCode()); }
	 * return this;//.getMethod(); }
	 *
	 * private class SingleMethodClass extends ClassLoader {
	 *
	 * public GenMethod genGenMethod() throws InstantiationException,
	 * IllegalAccessException { byte[] data = byteCode(); Class<GenMethod>
	 * mgenClass; mgenClass = (Class<GenMethod>) this.defineClass(data, 0,
	 * data.length); this.resolveClass(mgenClass); staticMethodInstance =
	 * mgenClass.newInstance(); return staticMethodInstance; }
	 *
	 * public synchronized Class loadClass(String name, boolean resolve) throws
	 * ClassNotFoundException { Class c = (Class) classLoaderCache.get(name); if
	 * (c == null) { c = this.findSystemClass(name); classLoaderCache.put(name,
	 * c); } if (resolve) { this.resolveClass(c); } return c; // *;// } }
	 */

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isSpecial() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	private void setMethod(Method method) {
		if (method == null)
			Errors.error("Got null native method for: " + this);
		this.methodClassStr = method.getDeclaringClass().getName();
		this.methodName = method.getName();
		this.methodParameters = method.getParameterTypes();
		this.returnType = method.getReturnType();
	}

	public String toTypeName() {
		return SubLCompiledFunction.FUNCTION_TYPE_NAME;
	}
}
