//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLBigIntBignum extends AbstractSubLInteger implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
	public static BigInteger ZERO_BIGINT;

	public static BigInteger ONE_BIGINT;
	public static String BIG_INT_TYPE_NAME;
	static {
		SubLBigIntBignum.ZERO_BIGINT = new BigInteger("0");
		SubLBigIntBignum.ONE_BIGINT = new BigInteger("1");
		SubLBigIntBignum.BIG_INT_TYPE_NAME = "REALLY-BIG-BIGNUM";
	}
	private BigInteger theBigInt;

	SubLBigIntBignum(BigInteger theBigInt) {
		this.theBigInt = theBigInt;
	}

	public SubLNumber abs() {
		BigInteger result = this.theBigInt.abs();
		return SubLObjectFactory.makeInteger(result);
	}

	public SubLObject add(SubLObject num) {
		if (num.getNumSize() > 2)
			return num.add(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.add(num.bigIntegerValue()));
	}

	public SubLObject dec() {
		return SubLNumberFactory.makeInteger(this.theBigInt.subtract(SubLBigIntBignum.ONE_BIGINT));
	}

	public double doubleValue() {
		return this.theBigInt.doubleValue();
	}

	public boolean eql(SubLObject obj) {
		return obj.isBigIntegerBignum() && this.theBigInt.equals(obj.bigIntegerValue());
	}

	public boolean equal(SubLObject obj) {
		return obj.isBigIntegerBignum() && this.theBigInt.equals(obj.bigIntegerValue());
	}

	public float floatValue() {
		return this.theBigInt.floatValue();
	}

	public BigInteger getBigInt() {
		return this.theBigInt;
	}

	public Number getNativeNumber() {
		return this.theBigInt;
	}

	public int getNumSize() {
		return 2;
	}

	public SubLSymbol getType() {
		return Types.$dtp_bignum$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_FOUR_INTEGER;
	}

	public boolean greaterThanInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) > 0;
	}

	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) >= 0;
	}

	public SubLObject inc() {
		return SubLNumberFactory.makeInteger(this.theBigInt.add(SubLBigIntBignum.ONE_BIGINT));
	}

	public int intValue() {
		return this.theBigInt.intValue();
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return true;
	}

	public boolean isBignum() {
		return true;
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
		return false;
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
		return true;
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

	public boolean isNegative() {
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) < 0;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isPositive() {
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) > 0;
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

	public boolean isZero() {
		return this.theBigInt.compareTo(SubLBigIntBignum.ZERO_BIGINT) == 0;
	}

	public boolean lessThanInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) < 0;
	}

	public boolean lessThanOrEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) <= 0;
	}

	public long longValue() {
		return this.theBigInt.longValue();
	}

	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > 2)
			return num.mult(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.multiply(num.bigIntegerValue()));
	}

	public boolean numericallyEqualInternal(SubLObject num) {
		return this.theBigInt.compareTo(num.bigIntegerValue()) == 0;
	}

	public SubLObject sub(SubLObject num) {
		if (num.getNumSize() > 2)
			return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
		return SubLNumberFactory.makeInteger(this.theBigInt.subtract(num.bigIntegerValue()));
	}

	public SubLFixnum toFixnum() {
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	public String toTypeName() {
		return SubLBigIntBignum.BIG_INT_TYPE_NAME;
	}
}
