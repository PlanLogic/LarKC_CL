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
import java.math.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  class SubLBigIntBignum 
extends AbstractSubLInteger 
implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
  //// Constructors
  /** Creates a new instance of SubLInteger. */
  SubLBigIntBignum(BigInteger theBigInt) {
    this.theBigInt = theBigInt;
  }
  //// Public Area
  public static BigInteger ZERO_BIGINT = new BigInteger(0 + "");
  public static BigInteger ONE_BIGINT = new BigInteger(1 + "");
  public boolean isPositive() { // SubLNumber
    return theBigInt.compareTo(ZERO_BIGINT) > 0;
  }
  public boolean isNegative() {
    return theBigInt.compareTo(ZERO_BIGINT) < 0;
  }
  public boolean isZero() {
    return theBigInt.compareTo(ZERO_BIGINT) == 0;
  }
  public int getNumSize() { return BIGINT_INTEGER; }
  public SubLObject inc() {
    return SubLNumberFactory.makeInteger(theBigInt.add(ONE_BIGINT));
  }
  public SubLObject dec() {
    return SubLNumberFactory.makeInteger(theBigInt.subtract(ONE_BIGINT));
  }
  public SubLObject add(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.add(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.add(num.bigIntegerValue()));
  }
  public SubLObject sub(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.subtract(num.bigIntegerValue()));
  }
  public SubLObject mult(SubLObject num) {
    if (num.getNumSize() > BIGINT_INTEGER) {
      return num.mult(this);
    }
    return SubLNumberFactory.makeInteger(theBigInt.multiply(num.bigIntegerValue()));
  }
  public BigInteger getBigInt() {
    return theBigInt;
  }
  public static String BIG_INT_TYPE_NAME = "REALLY-BIG-BIGNUM";
  public String toTypeName() {
    return BIG_INT_TYPE_NAME;
  }
 
  public Number getNativeNumber() {
    return theBigInt;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean numericallyEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) == 0;
  }
 
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) < 0;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean lessThanOrEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) <= 0;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) > 0;
  }
  /**use this version only if the arg is of same numerical type or smaller type than 'this'*/
  public boolean greaterThanOrEqualInternal(SubLObject num) {
    return theBigInt.compareTo(num.bigIntegerValue()) >= 0;
  }
  public boolean eql(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  public boolean equal(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  public boolean equalp(SubLObject obj) {
    if (!obj.isBigIntegerBignum()) { return false; }
    return theBigInt.equals(obj.bigIntegerValue());
  }
  public double doubleValue() {
    return theBigInt.doubleValue();
  }
  public float floatValue() {
    return theBigInt.floatValue();
  }
  public int intValue() {
    return theBigInt.intValue();
  }
  public long longValue() {
    return theBigInt.longValue();
  }
  public SubLNumber abs() {
    BigInteger result = theBigInt.abs();
    return SubLObjectFactory.makeInteger(result);
  }
  public SubLSymbol getType(){ 
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
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return true; }
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
  private BigInteger theBigInt;
}
