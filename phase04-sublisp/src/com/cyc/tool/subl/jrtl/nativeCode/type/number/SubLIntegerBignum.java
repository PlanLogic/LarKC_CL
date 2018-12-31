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

public  class SubLIntegerBignum extends AbstractSubLIntegerBignum implements SubLBignum, SubLNumber, SubLObject {
  //// Constructors
  /**
   * Creates a new instance of SubLIntegerBignum.
   */
  SubLIntegerBignum(Integer theInteger) {
    super(theInteger);
  }
  SubLIntegerBignum(int theInteger) {
    super(theInteger);
  }
  //// Public Area
  public int getNumSize() { return FOUR_BYTE_INTEGER; }
  public SubLObject add(SubLObject num) {
    if (num.getNumSize() <= FOUR_BYTE_INTEGER) {
      return SubLNumberFactory.makeInteger((long)value + (long)num.intValue());
    }
      return num.add(this);
  }
  public SubLObject sub(SubLObject num) {
    if (num.getNumSize() <= FOUR_BYTE_INTEGER) {
      return SubLNumberFactory.makeInteger((long)value - (long)num.intValue());
    }
    return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
  }
  // @ToDo think of better names -APB
  public static String INTEGER_TYPE_NAME = "MARGINALLY-BIG-BIGNUM";
  public String toTypeName() {
    return INTEGER_TYPE_NAME;
  }
  public boolean eql(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  public boolean equal(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  public boolean equalp(SubLObject obj) {
    if (!obj.isIntBignum()) { return false; }
    return (value == obj.intValue());
  }
  public int hashCode(int currentDepth) {
    return value;
  }
  /** @Note This should only ever by used by caching */
  /*public static class MutableSubLIntegerBignum extends SubLIntegerBignum {
    // @Note This should only ever by used by caching 
    public MutableSubLIntegerBignum(Integer theInteger) {
      super(theInteger);
    }
    // @Note This should only ever by used by caching 
    public MutableSubLIntegerBignum(int theInteger) {
      super(theInteger);
    }
    public void setValue(int newValue) {
      value = newValue;
    }
  } */
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
  public SubLSymbol getType() { 
    return Types.$dtp_bignum$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.THIRTY_FOUR_INTEGER;
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
  public boolean isBignum() { return true; }
  public boolean isIntBignum() { return true; }
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
