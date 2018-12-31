/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;

//// External Imports
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;


public  class SubLEnvironment extends AbstractSubLObject {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}	
  //// Constructors
  /**
   * Creates a new instance of SubLEnvironment.
   */
  private SubLEnvironment() {
    this(SubLEnvironment.defaultEnvironment);
  }
  private SubLEnvironment(SubLEnvironment outerEnv) {
    outerEnvironment = outerEnv;
  }
  //// Public Area
  public String toTypeName() {
    return "ENVIRONMENT";
  }
  public static SubLEnvironment currentEnvironment() {
    SubLThread thread = SubLProcess.currentSubLThread();
    if (thread.env != null) {
      return thread.env;
    }
    return defaultEnvironment;
  }
  public static void setCurrentEnvironment(SubLEnvironment env) {
    SubLThread thread = SubLProcess.currentSubLThread();
    thread.env = env;
  }
  public static SubLEnvironment getDefaultEnvironment() {
    return defaultEnvironment;
  }
  public SubLPackage getCurrentPackage() {
    return SubLPackage.getCurrentPackage();
  }
  public SubLEnvironment getOuterEnvironment() {
    return outerEnvironment;
  }
  public SubLEnvironment extend() {
    SubLEnvironment extendedEnv = new SubLEnvironment(this);
    SubLProcess.currentSubLThread().env = extendedEnv;
    return extendedEnv;
  }
  public void unextend() {
    if (outerEnvironment != null) {
      SubLThread thread = SubLProcess.currentSubLThread();
      thread.env = outerEnvironment;
    } else {
      Errors.error("Illegal attempt to reclaim base enviroment.");
    }
  }
  public SubLObject noteBinding(SubLSymbol var, SubLObject newValue) {
    if (var.isDynamic()) {
      SubLObject oldValue = var.currentBinding(SubLProcess.currentSubLThread().bindingsList);
      var.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
      return oldValue;
    } else if (var.isGlobal()) {
      return Errors.error("Illegal attempt to dynamically bind a global symbol: " + var);
    } else {
      if (this == defaultEnvironment) {
        // The outermost environment must be immutable or we have to worry about synchronization issues. -APB
        Errors.error("Illegal ttempt to modify ther outermost environment.");
      }
      EnvironmentBinding varBinding = new EnvironmentBinding(var, newValue); // @todo resource these!!!!!!!!!! -APB
      bindingStack.add(varBinding);
      return null;
    }
  }
  public SubLObject lookupBinding(SubLSymbol var) {
    if (!var.isUndeclared()) {
      Errors.error("Illegal call of lookupBinding on declared symbol: " + var);
    }
    // first try scanning through this environment
    for (int i = 0, size = bindingStack.size(); i < size; i++) {
      EnvironmentBinding currentBinding = bindingStack.get(i);
      if (currentBinding.getVar() == var) {
        return currentBinding.getValue();
      }
    }
    // then try scanning the outer environments
    if (outerEnvironment == null) {
      return var.getGlobalValue();
    } else {
      return outerEnvironment.lookupBinding(var);
    }
  }
  public void setBinding(SubLSymbol var, SubLObject value) {
    if (var.isDynamic()) {
      var.setDynamicValue(value);
      return;
    } else if (var.isGlobal()) {
      var.setGlobalValue(value);
      return;
    }
    // first try scanning through this environment
    for (int i = 0, size = bindingStack.size(); i < size; i++) {
      EnvironmentBinding currentBinding = bindingStack.get(i);
      if (currentBinding.getVar() == var) {
        currentBinding.setValue(value);
        return;
      }
    }

    // then try scanning the outer environments
    if (outerEnvironment == null) {
      if (var.isConstantSymbol()) {
        Errors.error("Can't set the value of constant symbol: " + this);
      } 
      var.forceGlobalValue(value);
    } else {
      outerEnvironment.setBinding(var, value);
    }
  }
  public int hashCode(int currentDepth) {
    return super.superHash();
  }
  public boolean canFastHash() {
    return true;
  }
  /** Method created to avoid casting */
  public SubLEnvironment toEnv() { // SubLEnvironment
    return this;
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return false; }
  public boolean isKeyword() { return false; }
  public boolean isAtom() { return true; }
  public boolean isCons() { return false; }
  public boolean isList() { return false; }
  public boolean isSequence() { return false; }
  public boolean isNumber() { return false; }
  public boolean isFixnum() { return false; }
  public boolean isBignum() { return false; }
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return false; }
  public boolean isInteger() { return false; }
  public boolean isDouble() { return false; }
  public boolean isChar() { return false; }
  public boolean isString() { return false; }
  public boolean isVector() { return false; }
  public boolean isFunction() { return false; }
  public boolean isFunctionSpec() { return false; }
  public boolean isMacroOperator() { return false; }
  public boolean isHashtable() { return false; }
  public boolean isProcess() { return false; }
  public boolean isLock() { return false; }
  public boolean isReadWriteLock() { return false; }
  public boolean isStructure() { return false; }
  public boolean isStream() { return false; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return true; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  //// Protected Area
  //// Private Area
  private static void noteDefaultBindings() {
  }
  private static class EnvironmentBinding {
    // @todo consider merging with BindingState.Binding
    EnvironmentBinding(SubLSymbol var, SubLObject value) {
      this.var = var;
      this.value = value;
    }
    SubLSymbol getVar() {
      return var;
    }
    SubLObject getValue() {
      return value;
    }
    void setValue(SubLObject value) {
      this.value = value;
    }
    private SubLSymbol var;
    private SubLObject value;
  }
  //// Internal Rep
  private SubLEnvironment outerEnvironment;
  private ArrayList<EnvironmentBinding> bindingStack = new ArrayList<EnvironmentBinding>();
  private static SubLEnvironment defaultEnvironment = new SubLEnvironment(null);
  static { noteDefaultBindings(); }
}
