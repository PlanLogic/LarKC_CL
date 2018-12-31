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

package  com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFiles.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;

public  class SubLSymbolImpl extends AbstractSubLSymbol implements SubLSymbol {
  //// Constructors
  /** Creates a new instance of SubLSymbol. 
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  SubLSymbolImpl(SubLString symbolName, SubLPackage thePackage) {
    super(symbolName, thePackage);
  }
  /** Creates a new instance of SubLSymbol. 
   * symbolName must already be canonicalized before calling this constructor
   * SubLPackage are allowed to use this constructor.
   */
  SubLSymbolImpl(String symbolName, SubLPackage thePackage) {
    super(SubLObjectFactory.makeString(symbolName), thePackage);
  }
  //// Public Area 
  /** Method created to avoid casting */
  public SubLSymbol toSymbol() {
    return this;
  }
  public SubLObject getValue() {
    if (accessModeVar == VariableAccessMode.UNDECLARED) {
      return getUndeclaredValue();
    } else if (accessModeVar == VariableAccessMode.DYNAMIC) {
      return getDynamicValue();
    } else {
      return getGlobalValue();
    }
  }
  public void setValue(SubLObject value) {
    if (accessModeVar == VariableAccessMode.DYNAMIC) {
      setDynamicValue(value);
    } else if (accessModeVar == VariableAccessMode.LEXICAL) {
      setGlobalValue(value);
    } else if (accessModeVar == VariableAccessMode.CONSTANT) {
      Errors.error("Can't set the value of constant symbol: " + this);
    } else if (accessModeVar == VariableAccessMode.UNDECLARED) {
      setUndeclaredValue(value);
    } else {
      Errors.error("Don't know about access mode: " + accessModeVar);
    }
  }
  public boolean isDynamic() {
    return (accessModeVar == VariableAccessMode.DYNAMIC);
  }
  public boolean isGlobal() {
    return (accessModeVar == VariableAccessMode.LEXICAL) || (accessModeVar == VariableAccessMode.CONSTANT);
  }
  public boolean isUndeclared() {
    return (accessModeVar == VariableAccessMode.UNDECLARED);
  }
  public boolean isConstantSymbol() {
    return (accessModeVar == VariableAccessMode.CONSTANT);
  }

  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return getValue();
  }
  public static String SYMBOL_TYPE_NAME = "SYMBOL";
  public String toTypeName() {
    return SYMBOL_TYPE_NAME;
  }
  public synchronized void setAccessMode(VariableAccessMode accessMode) {
    if (accessMode == null) {
      Errors.error("Cannot set symbol access mode to null on symbol: " + this);
    }
    // this is to protect idCounter and to ensure that accessModeVar gets set after id
    synchronized (SubLSymbolImpl.class) { 
      if (accessMode == VariableAccessMode.DYNAMIC) {
        if (id == INVALID_BINDING_INDEX) {
          id = idCounter++;
        }
      } else {
        id = INVALID_BINDING_INDEX;
      }
    }
    accessModeVar = accessMode;
  }
  public int getBindingId() {
    return id;
  }
  public SubLObject currentBinding(SubLObject[] bindings) {
    return bindings[id];
  }
  public void bind(SubLObject newValue, SubLObject[] bindings) {
    bindings[id] = newValue;
  }
  public void rebind(SubLObject oldValue, SubLObject[] bindings) {
    bindings[id] = oldValue;
  }
  public SubLObject currentBinding(SubLThread thread) {
    return thread.bindingsList[id];
  }
  public void bind(SubLObject newValue, SubLThread thread) {
    thread.bindingsList[id] = newValue;
  }
  public void rebind(SubLObject oldValue, SubLThread thread) {
    thread.bindingsList[id] = oldValue;
  }
  public SubLObject getDynamicValue(SubLObject[] bindings) {
    SubLObject result = bindings[id];
    if (result != UNBOUND) { return result; }
    result = value; //avoid multiple references to value since it is volatile
    return (result != UNBOUND) ? result : Errors.error(this + " is not bound.");
  }
  public SubLObject getDynamicValue(SubLThread thread) {
    SubLObject result = thread.bindingsList[id];
    if (result != UNBOUND) { return result; }
    result = value; //avoid multiple references to value since it is volatile
    return (result != UNBOUND) ? result : Errors.error(this + " is not bound.");
  }
  public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    if (bindings[id] != UNBOUND) {     
      bindings[id] = newValue;
    } else {
      value = newValue;
    }
  }
  public void setDynamicValue(SubLObject newValue, SubLThread thread) {
    SubLObject[] bindings = thread.bindingsList;
    if (bindings[id] != UNBOUND) {     
      bindings[id] = newValue;
    } else {
      value = newValue;
    }
  }

  public SubLObject getDynamicValue() {
	Thread th = Thread.currentThread();
	  
    SubLObject result = ((SubLThread)th).bindingsList[id];
    if (result != UNBOUND) { return result; }
    result = value; //avoid multiple references to value since it is volatile
    return (result != UNBOUND) ? result : Errors.error(this + " is not bound.");
  }

  public void forceGlobalValue(SubLObject newValue) {
    if (isConstantSymbol()) {
      constantValue = newValue;
    } else {
      value = newValue;
    }
  }
  public void setDynamicValue(SubLObject newValue) {
    SubLObject[] bindings =  ((SubLThread)Thread.currentThread()).bindingsList;
    if (bindings[id] != UNBOUND) {     
      bindings[id] = newValue;
    } else {
      value = newValue;
    }
  }
  public SubLObject getGlobalValue() {
    SubLObject result = isConstantSymbol() ? constantValue : value;
    return (result != UNBOUND) ? result : Errors.error(this + " is not bound.");
  }
  public void setGlobalValue(SubLObject newValue) {
    // @todo consider uncommenting the following
    //if (isConstantSymbol()) {
    //  Errors.error("Can't set the value of constant symbol: " + this);
    //}
    value = newValue;
  }
  public SubLObject getUndeclaredValue() {
    SubLObject result = SubLEnvironment.currentEnvironment().lookupBinding(this);
    if (result != UNBOUND)  { return result; }
    result = value; //avoid multiple references to value since it is volatile
    return (result != UNBOUND) ? result : Errors.error(this + " is not bound.");
  }
  public void setUndeclaredValue(SubLObject newValue) {
    SubLEnvironment env = SubLEnvironment.currentEnvironment();
    env.setBinding(this, newValue);
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return true; }
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
  public boolean isFunctionSpec() { 
    return (operator != null) && (operator.isFunction());
  }
  public boolean isMacroOperator() { 
    return (operator != null) && (operator.isMacroOperator());
  }
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
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  protected SubLSymbol getBindingType() {
    return accessModeVar.toSymbol();
  }
  //// Private Area
  //// Internal Rep
  private int id = INVALID_BINDING_INDEX; //this should probably be volatile -APB

  private VariableAccessMode accessModeVar = VariableAccessMode.UNDECLARED; // this should probably be volatile -APB
  private static int idCounter = 0;

  private SubLObject constantValue = UNBOUND;
}
