//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLFixnum extends AbstractSubLIntegerBignum implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
	public static String FIXNUM_TYPE_NAME = "FIXNUM";

	SubLFixnum(int theInteger) {
		super(theInteger);
	}

	SubLFixnum(Integer theInteger) {
		super(theInteger);
	}

	public SubLObject add(SubLObject num) {
		if (num.isFixnum())
			return SubLNumberFactory.makeInteger(this.value + num.intValue());
		return num.add(this);
	}

	public boolean eql(SubLObject obj) {
		return this == obj;
	}

	public boolean equal(SubLObject obj) {
		return this == obj;
	}

	public int getNumSize() {
		return 0;
	}

	public SubLSymbol getType() {
		return Types.$dtp_fixnum$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.SIX_INTEGER;
	}

	public boolean greaterThanInternal(SubLObject num) {
		return this.value > num.intValue();
	}

	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return this.value >= num.intValue();
	}

	public int hashCode(int currentDepth) {
		return this.value;
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
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return true;
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

	public boolean lessThanInternal(SubLObject num) {
		return this.value < num.intValue();
	}

	public boolean lessThanOrEqualInternal(SubLObject num) {
		return this.value <= num.intValue();
	}

	public boolean numericallyEqualInternal(SubLObject num) {
		return this.value == num.intValue();
	}

	public SubLObject sub(SubLObject num) {
		if (num.isFixnum())
			return SubLNumberFactory.makeInteger(this.value - num.intValue());
		return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
	}

	public SubLFixnum toFixnum() {
		return this;
	}

	public String toTypeName() {
		return "FIXNUM";
	}
}
