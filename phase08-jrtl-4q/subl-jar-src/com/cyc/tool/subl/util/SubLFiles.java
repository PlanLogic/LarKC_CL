//
//
package com.cyc.tool.subl.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLFiles {
	public abstract static class VariableAccessMode {
		public static VariableAccessMode CONSTANT;
		public static VariableAccessMode LEXICAL;
		public static VariableAccessMode DYNAMIC;
		public static VariableAccessMode UNDECLARED;
		static {
			CONSTANT = new VariableAccessMode() {
				@Override
				public SubLSymbol toSymbol() {
					return CommonSymbols.CONSTANT;
				}
			};
			LEXICAL = new VariableAccessMode() {
				@Override
				public SubLSymbol toSymbol() {
					return CommonSymbols.LEXICAL;
				}
			};
			DYNAMIC = new VariableAccessMode() {
				@Override
				public SubLSymbol toSymbol() {
					return CommonSymbols.DYNAMIC;
				}
			};
			UNDECLARED = new VariableAccessMode() {
				@Override
				public SubLSymbol toSymbol() {
					return CommonSymbols.UNDECLARED;
				}
			};
		}

		@Override
		public String toString() {
			return toSymbol().toString();
		}

		public abstract SubLSymbol toSymbol();
	}

	private static SubLSymbol declareGlobal(String variableName, SubLObject initialValue, VariableAccessMode accessMode,
			boolean isReinitialized) {
		return declareGlobal(variableName, initialValue, accessMode, isReinitialized,
				(SubLPackage) Packages.$package$.getDynamicValue());
	}

	private static SubLSymbol declareGlobal(String variableName, SubLObject initialValue, VariableAccessMode accessMode,
			boolean isReinitialized, SubLPackage thePackage) {
		try {
			SubLSymbol symbol = SubLObjectFactory.makeSymbol(variableName, thePackage);
			symbol.setAccessMode(accessMode);
			if (isReinitialized || !symbol.boundp())
				symbol.forceGlobalValue(initialValue);
			SubLSymbol initializationType = isReinitialized ? CommonSymbols.INITIALIZER : CommonSymbols.WORLD;
			symbol.setProperty(CommonSymbols.INITIALIZATION_TYPE, initializationType);
			symbol.setProperty(CommonSymbols.BINDING_TYPE, accessMode.toSymbol());
			synchronized (SubLFiles.symbolInitializationOrder) {
				SubLFiles.symbolInitializationOrder.add(symbol);
			}
			return symbol;
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring global: " + variableName, e);
			return null;
		}
	}

	public static void declareFunction(String className, String methodName, String functionName, int requiredArgCount,
			int optionalArgCount, boolean allowsRest) {
		try {
			List<Class> parameterTypes = new ArrayList<Class>();
			for (int i = 0; i < requiredArgCount + optionalArgCount; ++i)
				parameterTypes.add(SubLObject.class);
			if (allowsRest)
				parameterTypes.add(SubLObject[].class);
			Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			if (functionSymbol.fboundp()) {
				Errors.warn("Attempt to redefine: " + functionSymbol);
				return;
			}
			SubLFunction func = SubLObjectFactory.makeCompiledFunction(className, methodName, parameterArray,
					SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
		}
	}

	public static void declareFunction(SubLFile file, String methodName, String functionName, int requiredArgCount,
			int optionalArgCount, boolean allowsRest) {
		try {
			List<Class> parameterTypes = new ArrayList<Class>();
			for (int i = 0; i < requiredArgCount + optionalArgCount; ++i)
				parameterTypes.add(SubLObject.class);
			if (allowsRest)
				parameterTypes.add(SubLObject[].class);
			Class[] parameterArray = parameterTypes.toArray(new Class[parameterTypes.size()]);
			Method meth = file.getClass().getMethod(methodName, parameterArray);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			if (functionSymbol.fboundp()) {
				Errors.warn("Attempt to redefine: " + functionSymbol);
				return;
			}
			SubLFunction func = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, requiredArgCount,
					optionalArgCount, allowsRest);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring function: " + functionName, e);
		}
	}

	public static void declareMacro(String className, String methodName, String functionName) {
		try {
			Class[] parameterArray = { SubLObject.class, SubLObject.class };
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(className, methodName,
					parameterArray, SubLObject.class, functionSymbol, 2, 0, false);
			SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
			functionSymbol.setFunction(macro);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
		}
	}

	public static void declareMacro(SubLFile file, String methodName, String functionName) {
		try {
			Class[] parameterArray = { SubLObject.class, SubLObject.class };
			Method meth = file.getClass().getMethod(methodName, parameterArray);
			SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol(functionName);
			SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction(meth, functionSymbol, 2, 0,
					false);
			SubLMacro macro = SubLObjectFactory.makeMacro(macroExpander);
			functionSymbol.setFunction(macro);
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error while declaring macro: " + functionName, e);
		}
	}

	public static SubLSymbol defconstant(String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
	}

	public static SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true);
	}

	public static SubLSymbol defconstant(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.CONSTANT, true, thePackage);
	}

	public static SubLSymbol defglobal(String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
	}

	public static SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false);
	}

	public static SubLSymbol defglobal(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, false, thePackage);
	}

	public static SubLSymbol deflexical(String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
	}

	public static SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true);
	}

	public static SubLSymbol deflexical(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.LEXICAL, true, thePackage);
	}

	public static SubLSymbol defparameter(String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
	}

	public static SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true);
	}

	public static SubLSymbol defparameter(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, true, thePackage);
	}

	public static SubLSymbol defvar(String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
	}

	public static SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false);
	}

	public static SubLSymbol defvar(SubLFile file, String variableName, SubLObject initialValue,
			SubLPackage thePackage) {
		return declareGlobal(variableName, initialValue, VariableAccessMode.DYNAMIC, false, thePackage);
	}

	public static void handleThrowable() {
	}

	public static void initialize(String className) {
		try {
			Class clazz = PatchFileLoader.PATCH_FILE_LOADER.loadClass(className);
			ClassLoader loader = clazz.getClassLoader();
			Field meField = clazz.getDeclaredField("me");
			if (meField == null)
				throw new RuntimeException("Bad SubLFile: " + className);
			SubLFile file = (SubLFile) meField.get(null);
			file.declareFunctions();
			file.initializeVariables();
			file.runTopLevelForms();
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error initializing SubL file: " + className, e);
		}
	}

	public static void initialize(SubLFile file) {
		try {
			file.declareFunctions();
			file.initializeVariables();
			file.runTopLevelForms();
		} catch (Exception e) {
			Errors.cerror("Continue.", "Error initializing SubL file: " + file.getClass().getName(), e);
		}
	}

	public static List<SubLSymbol> symbolInitializationOrder() {
		List<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
		synchronized (SubLFiles.symbolInitializationOrder) {
			symbols.addAll(SubLFiles.symbolInitializationOrder);
		}
		return symbols;
	}

	private static LinkedHashSet<SubLSymbol> symbolInitializationOrder;
	static {
		symbolInitializationOrder = new LinkedHashSet<SubLSymbol>();
	}
}
