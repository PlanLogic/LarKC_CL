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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  class SubLFixnum extends AbstractSubLIntegerBignum implements  SubLBignum, SubLInteger, SubLNumber, SubLObject {
  //// Constructors
  /** Creates a new instance of SubLInteger. */
  SubLFixnum(Integer theInteger) {
    super(theInteger);
  }
  SubLFixnum(int theInteger) {
    super(theInteger);
  }
  //// Public Area
  public int hashCode(int currentDepth) {
    return value;
  }
  public int getNumSize() { return FOUR_BYTE_INTEGER; }
  public SubLObject add(SubLObject num) {
    if (num.isFixnum()) {
      return SubLNumberFactory.makeInteger(value + num.intValue());
    }
    return num.add(this);
  }
  public SubLObject sub(SubLObject num) {
    if (num.isFixnum()) {
      return SubLNumberFactory.makeInteger(value - num.intValue());
    }
    return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
  }
  public static String FIXNUM_TYPE_NAME = "FIXNUM";
  public String toTypeName() {
    return FIXNUM_TYPE_NAME;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean numericallyEqualInternal(SubLObject num) {
    return value == num.intValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanInternal(SubLObject num) {
    return value < num.intValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanOrEqualInternal(SubLObject num) {
    return value <= num.intValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanInternal(SubLObject num) {
    return value > num.intValue();
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanOrEqualInternal(SubLObject num) {
    return value >= num.intValue();
  }
  public boolean eql(SubLObject obj) {
    return (this == obj);
  } 
  public boolean equal(SubLObject obj) {
    return (this == obj);
  } 
  public boolean equalp(SubLObject obj) {
    return (this == obj);
  }
  public SubLSymbol getType(){ 
    return Types.$dtp_fixnum$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.SIX_INTEGER;
  }
  /** Method created to avoid casting */
  public SubLFixnum toFixnum() { // SubLFixnum
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
  public boolean isNumber() { return true; }
  public boolean isFixnum() { return true; }
  public boolean isBignum() { return false; }
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return false; }
  public boolean isInteger() { return true; }
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
  //// Protected Area
  //// Private Area
  //// Internal Rep
}
