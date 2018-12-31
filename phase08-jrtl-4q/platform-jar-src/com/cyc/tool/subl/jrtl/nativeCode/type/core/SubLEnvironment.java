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
		private SubLSymbol var;

		private SubLObject value;

		EnvironmentBinding(SubLSymbol var, SubLObject value) {
			this.var = var;
			this.value = value;
		}

		SubLObject getValue() {
			return this.value;
		}

		SubLSymbol getVar() {
			return this.var;
		}

		void setValue(SubLObject value) {
			this.value = value;
		}
	}

	private static SubLEnvironment defaultEnvironment;

	static {
		SubLEnvironment.defaultEnvironment = new SubLEnvironment(null);
		SubLEnvironment.noteDefaultBindings();
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

	private static void noteDefaultBindings() {
	}

	public static void setCurrentEnvironment(SubLEnvironment env) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.env = env;
	}

	private SubLEnvironment outerEnvironment;
	private ArrayList<EnvironmentBinding> bindingStack;

	private SubLEnvironment() {
		this(SubLEnvironment.defaultEnvironment);
	}

	private SubLEnvironment(SubLEnvironment outerEnv) {
		this.bindingStack = new ArrayList<EnvironmentBinding>();
		this.outerEnvironment = outerEnv;
	}

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
		return this.outerEnvironment;
	}

	public int hashCode(int currentDepth) {
		return super.superHash();
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
		return true;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
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

	public SubLObject lookupBinding(SubLSymbol var) {
		if (!var.isUndeclared())
			Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
		for (int i = 0, size = this.bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = this.bindingStack.get(i);
			if (currentBinding.getVar() == var)
				return currentBinding.getValue();
		}
		if (this.outerEnvironment == null)
			return var.getGlobalValue();
		return this.outerEnvironment.lookupBinding(var);
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
		this.bindingStack.add(varBinding);
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
		for (int i = 0, size = this.bindingStack.size(); i < size; ++i) {
			EnvironmentBinding currentBinding = this.bindingStack.get(i);
			if (currentBinding.getVar() == var) {
				currentBinding.setValue(value);
				return;
			}
		}
		if (this.outerEnvironment == null) {
			if (var.isConstantSymbol())
				Errors.error("Can't set the value of constant symbol: " + this);
			var.forceGlobalValue(value);
		} else
			this.outerEnvironment.setBinding(var, value);
	}

	public SubLEnvironment toEnv() {
		return this;
	}

	public String toTypeName() {
		return "ENVIRONMENT";
	}

	public void unextend() {
		if (this.outerEnvironment != null) {
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.env = this.outerEnvironment;
		} else
			Errors.error("Illegal attempt to reclaim base enviroment.");
	}
}
