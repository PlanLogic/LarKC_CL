//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLEnvironment extends AbstractSubLObject {
	private static class EnvironmentBinding {
		EnvironmentBinding(SubLSymbol var, SubLObject value) {
			this.var = var;
			this.value = value;
		}

		private SubLSymbol var;
		private SubLObject value;

		SubLObject getValue() {
			return value;
		}

		SubLSymbol getVar() {
			return var;
		}

		void setValue(SubLObject value) {
			this.value = value;
		}
	}

	private SubLEnvironment() {
		this(SubLEnvironment.defaultEnvironment);
	}

	private SubLEnvironment(SubLEnvironment outerEnv) {
		bindingStack = new ArrayList<EnvironmentBinding>();
		outerEnvironment = outerEnv;
	}

	private static void noteDefaultBindings() {
	}

	public static SubLEnvironment currentEnvironment() {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (thread.env != null)
			return thread.env;
		return SubLEnvironment.defaultEnvironment;
	}

	public static SubLEnvironment getDefaultEnvironment() {
		return SubLEnvironment.defaultEnvironment;
	}

	public static void setCurrentEnvironment(SubLEnvironment env) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.env = env;
	}

	private SubLEnvironment outerEnvironment;
	private ArrayList<EnvironmentBinding> bindingStack;
	private static SubLEnvironment defaultEnvironment;
	static {
		defaultEnvironment = new SubLEnvironment(null);
		noteDefaultBindings();
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	public SubLEnvironment extend() {
		SubLEnvironment extendedEnv = new SubLEnvironment(this);
		return SubLProcess.currentSubLThread().env = extendedEnv;
	}

	public SubLPackage getCurrentPackage() {
		return SubLPackage.getCurrentPackage();
	}

	public SubLEnvironment getOuterEnvironment() {
		return outerEnvironment;
	}

	@Override
	public int hashCode(int currentDepth) {
		return super.superHash();
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return true;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	public SubLObject lookupBinding(SubLSymbol var) {
		if (!var.isUndeclared())
			Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
		for (int i = 0, size = bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = bindingStack.get(i);
			if (currentBinding.getVar() == var)
				return currentBinding.getValue();
		}
		if (outerEnvironment == null)
			return var.getGlobalValue();
		return outerEnvironment.lookupBinding(var);
	}

	public SubLObject noteBinding(SubLSymbol var, SubLObject newValue) {
		if (var.isDynamic()) {
			SubLObject oldValue = var.currentBinding(SubLProcess.currentSubLThread().bindingsList);
			var.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
			return oldValue;
		}
		if (var.isGlobal())
			return Errors.error("Illegal attempt to dynamically bind a global symbol: " + var);
		if (this == SubLEnvironment.defaultEnvironment)
			Errors.error("Illegal ttempt to modify ther outermost environment.");
		EnvironmentBinding varBinding = new EnvironmentBinding(var, newValue);
		bindingStack.add(varBinding);
		return null;
	}

	public void setBinding(SubLSymbol var, SubLObject value) {
		if (var.isDynamic()) {
			var.setDynamicValue(value);
			return;
		}
		if (var.isGlobal()) {
			var.setGlobalValue(value);
			return;
		}
		for (int i = 0, size = bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = bindingStack.get(i);
			if (currentBinding.getVar() == var) {
				currentBinding.setValue(value);
				return;
			}
		}
		if (outerEnvironment == null) {
			if (var.isConstantSymbol())
				Errors.error("Can't set the value of constant symbol: " + this);
			var.forceGlobalValue(value);
		} else
			outerEnvironment.setBinding(var, value);
	}

	@Override
	public SubLEnvironment toEnv() {
		return this;
	}

	@Override
	public String toTypeName() {
		return "ENVIRONMENT";
	}

	public void unextend() {
		if (outerEnvironment != null) {
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.env = outerEnvironment;
		} else
			Errors.error("Illegal attempt to reclaim base enviroment.");
	}
}
