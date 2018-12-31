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

package  com.cyc.tool.subl.jrtl.nativeCode.type.number;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  class SubLDoubleFloat 
extends AbstractSubLFloat 
implements SubLFloat, SubLNumber, SubLObject {
  //// Constructors
  /** Creates a new instance of SubLFloat. */
  SubLDoubleFloat(Double theDouble) {
    this.doubleValue = theDouble;
    this.value = theDouble.doubleValue();
  }
  SubLDoubleFloat(double value) {
    this.value = value;
  }
  //// Public Area
  public boolean isPositive() { // SubLNumber
    return value > 0.0;
  }
  public boolean isNegative() {
    return value < 0.0;
  }
  public boolean isZero() {
    return value == 0.0;
  }
  
  public int getNumSize() { return FLOATING_POINT; }
  public SubLObject inc() {
    return SubLNumberFactory.makeDouble(value + 1.0);
  }
  public SubLObject dec() {
    return SubLNumberFactory.makeDouble(value - 1.0);
  }
  public SubLObject add(SubLObject num) {
    return SubLNumberFactory.makeDouble(value + num.doubleValue());
  }
  public SubLObject sub(SubLObject num) {
    return SubLNumberFactory.makeDouble(value - num.doubleValue());
  }
  public SubLObject mult(SubLObject num) {
    return SubLNumberFactory.makeDouble(value * num.doubleValue());
  }
  public String toString() {
    return "" + value;
  }
  public Double getDouble() {
    return (Double)getNativeNumber();
  }
  public static String NUMBER_TYPE_NAME = "LONG-FLOAT";
  public String toTypeName() {
    return NUMBER_TYPE_NAME;
  }
  private static int SXHASH_TYPE_FLOAT = 89;
  public int sxhash() {
    return doubleValue.hashCode();// + SXHASH_TYPE_FLOAT;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean numericallyEqualInternal(SubLObject num) {
    return value == num.doubleValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanInternal(SubLObject num) {
    return value < num.doubleValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanOrEqualInternal(SubLObject num) {
    return value <= num.doubleValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanInternal(SubLObject num) {
    return value > num.doubleValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanOrEqualInternal(SubLObject num) {
    return value >= num.doubleValue();
  }
  public Number getNativeNumber() {
    if (doubleValue == null) {
      doubleValue = new Double(value);
    }
    return doubleValue;
  }
   
  public double doubleValue() {
    return value;
  }
  public float floatValue() {
    return (float)value;
  }
  public int intValue() {
    return (int)value;
  }
  public long longValue() {
    return (long)value;
  }
  public boolean eql(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  public boolean equal(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  public boolean equalp(SubLObject obj) {
    if (!obj.isDouble()) { return false; }
    return (value == obj.doubleValue());
  }
  public SubLSymbol getType(){ 
    return Types.$dtp_float$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.SEVEN_INTEGER;
  }
  /** Method created to avoid casting */
  public SubLDoubleFloat toDouble() { // SubLDoubleFloat
    return this;
  }
  /** Method created to avoid casting */
  public SubLFixnum toFixnum() { // SubLFixnum
    Errors.error(this + " is not of type: FIXNUM.");
    return null;
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return false; }
  public boolean isKeyword() { return false; }
  public boolean isAtom() { return true; }
  public boolean isCons() { return false; }
  public boolean isList() { return false; }
  public boolean isSequence() { return false; }
  public boolean isNumber() { return true; }
  public boolean isFixnum() { return false; }
  public boolean isBignum() { return false; }
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return false; }
  public boolean isInteger() { return false; }
  public boolean isDouble() { return true; }
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
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private Double doubleValue;
  private double value;
}
