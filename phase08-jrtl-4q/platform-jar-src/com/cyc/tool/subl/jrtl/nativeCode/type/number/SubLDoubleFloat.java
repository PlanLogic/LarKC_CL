//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLDoubleFloat extends AbstractSubLFloat implements SubLFloat, SubLNumber, SubLObject {
	public static String NUMBER_TYPE_NAME;

	private static int SXHASH_TYPE_FLOAT = 89;

	static {
		SubLDoubleFloat.NUMBER_TYPE_NAME = "LONG-FLOAT";
	}
	private Double doubleValue;
	private double value;

	SubLDoubleFloat(double value) {
		this.value = value;
	}

	SubLDoubleFloat(Double theDouble) {
		this.doubleValue = theDouble;
		this.value = theDouble;
	}

	public SubLObject add(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value + num.doubleValue());
	}

	public SubLObject dec() {
		return SubLNumberFactory.makeDouble(this.value - 1.0);
	}

	public double doubleValue() {
		return this.value;
	}

	public boolean eql(SubLObject obj) {
		return obj.isDouble() && this.value == obj.doubleValue();
	}

	public boolean equal(SubLObject obj) {
		return obj.isDouble() && this.value == obj.doubleValue();
	}

	public float floatValue() {
		return (float) this.value;
	}

	public Double getDouble() {
		return (Double) this.getNativeNumber();
	}

	public Number getNativeNumber() {
		if (this.doubleValue == null)
			this.doubleValue = new Double(this.value);
		return this.doubleValue;
	}

	public int getNumSize() {
		return 3;
	}

	public SubLSymbol getType() {
		return Types.$dtp_float$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.SEVEN_INTEGER;
	}

	public boolean greaterThanInternal(SubLObject num) {
		return this.value > num.doubleValue();
	}

	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return this.value >= num.doubleValue();
	}

	public SubLObject inc() {
		return SubLNumberFactory.makeDouble(this.value + 1.0);
	}

	public int intValue() {
		return (int) this.value;
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
		return true;
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

	public boolean isNegative() {
		return this.value < 0.0;
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
		return this.value > 0.0;
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
		return this.value == 0.0;
	}

	public boolean lessThanInternal(SubLObject num) {
		return this.value < num.doubleValue();
	}

	public boolean lessThanOrEqualInternal(SubLObject num) {
		return this.value <= num.doubleValue();
	}

	public long longValue() {
		return (long) this.value;
	}

	public SubLObject mult(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value * num.doubleValue());
	}

	public boolean numericallyEqualInternal(SubLObject num) {
		return this.value == num.doubleValue();
	}

	public SubLObject sub(SubLObject num) {
		return SubLNumberFactory.makeDouble(this.value - num.doubleValue());
	}

	public int sxhash() {
		return this.doubleValue.hashCode();
	}

	public SubLDoubleFloat toDouble() {
		return this;
	}

	public SubLFixnum toFixnum() {
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	public String toString() {
		return "" + this.value;
	}

	public String toTypeName() {
		return SubLDoubleFloat.NUMBER_TYPE_NAME;
	}
}
