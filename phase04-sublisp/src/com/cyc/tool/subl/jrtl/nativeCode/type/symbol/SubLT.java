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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.util.SubLFiles.*;

public  class SubLT extends AbstractSubLSymbol implements SubLObject, SubLBoolean, SubLSymbol {
  //// Constructors
  private SubLT() {
    super(T_SYMBOL_NAME_SUBLSTRING, SubLPackage.SUBLISP_PACKAGE);
  }
  //// Public Area
  /** Method created to avoid casting */
  public SubLSymbol toSymbol() {
    return this;
  }
  public SubLStream getStream(boolean followSynonymStream) {
    return StreamsLow.$terminal_io$.getValue().getStream(true);
  }
  public SubLInputStream toInputStream() { // SubLStream
    return getStream(false).toInputStream();
  }
  public SubLInputTextStream toInputTextStream() { // SubLStream
    return getStream(false).toInputTextStream();
  }
  public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
    return getStream(false).toInputBinaryStream();
  }
  public SubLOutputStream toOutputStream() { // SubLStream
    return getStream(false).toOutputStream();
  }
  public SubLOutputTextStream toOutputTextStream() { // SubLStream
    return getStream(false).toOutputTextStream();
  }
  public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
    return getStream(false).toOutputBinaryStream();
  }
  public int getBindingId() {
    return INVALID_BINDING_INDEX;
  }
  public SubLObject currentBinding(SubLObject[] bindings) {
    return Errors.error("T does not have a dynamic binding.");
  }
  public void bind(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't bind T.");
  }
  public void rebind(SubLObject oldValue, SubLObject[] bindings) {
    Errors.error("Can't rebind T.");
  }
  public SubLObject currentBinding(SubLThread thread) {
    return Errors.error("T does not have a dynamic binding.");
  }
  public void bind(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't bind T.");
  }
  public void rebind(SubLObject oldValue, SubLThread thread) {
    Errors.error("Can't rebind T.");
  }
   public SubLObject getValue() {
    return this;
  }
  public void setValue(SubLObject value) {
    Errors.error("Can't change the value of T.");
  }
 
  public SubLObject getDynamicValue(SubLObject[] bindings) {
    return this;
  }
  public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    Errors.error("Can't change the value of T.");
  }
 
  public SubLObject getDynamicValue(SubLThread thread) {
    return this;
  }
  public void setDynamicValue(SubLObject newValue, SubLThread thread) {
    Errors.error("Can't change the value of T.");
  }
      
  public SubLObject getDynamicValue() {
    return this;
  }
  public void setDynamicValue(SubLObject value) {
    Errors.error("Can't change the value of T.");
  }
  public SubLObject getGlobalValue() {
    return this;
  }
  public void setGlobalValue(SubLObject value) {
    Errors.error("Can't change the value of T.");
  }
 
  public boolean isDynamic() {
    return false;
  }
  public boolean isGlobal() {
    return true;
  }
  public boolean isUndeclared() {
    return false;
  }
  public boolean isConstantSymbol() {
    return true;
  }
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return this;
  }
  public static String T_TYPE_NAME = "SYMBOL";
  public String toTypeName() {
    return T_TYPE_NAME;
  }
  public static SubLBoolean toSubLBoolean(boolean val) {
    return val ? (SubLBoolean)T : (SubLBoolean)SubLNil.NIL;
  }
  public boolean toBoolean() { return true; }
  public void forceGlobalValue(SubLObject newValue) {
    Errors.error("T is immutable.");
  }
  public void setAccessMode(VariableAccessMode accessMode) {}
  public boolean isNil() { return false; }
  public boolean isBoolean() { return true; }
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
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  public static String T_SYMBOL_NAME = "T";
  public static SubLString T_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString(T_SYMBOL_NAME);
  public static SubLT T = new SubLT();
 
  //// Protected Area
  //// Private Area
  //// Internal Rep
}
