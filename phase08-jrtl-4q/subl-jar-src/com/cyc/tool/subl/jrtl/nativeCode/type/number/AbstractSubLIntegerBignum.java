//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

public abstract class AbstractSubLIntegerBignum extends AbstractSubLInteger implements SubLNumber, SubLObject {
	AbstractSubLIntegerBignum(int value) {
		this.value = value;
	}

	protected int value;

	@Override
	public SubLNumber abs() {
		if (value == Integer.MIN_VALUE)
			return SubLObjectFactory.makeInteger(2147483648L);
		int result = Math.abs(value);
		return SubLObjectFactory.makeInteger(result);
	}

	@Override
	public SubLObject dec() {
		return SubLNumberFactory.makeInteger(value - (value == Integer.MIN_VALUE ? 1L : 1L));
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	public Integer getInteger() {
		return new Integer(value);
	}

	@Override
	public Number getNativeNumber() {
		return getInteger();
	}

	@Override
	public SubLObject inc() {
		return SubLNumberFactory.makeInteger(value + (value == Integer.MAX_VALUE ? 1L : 1L));
	}

	public int integerDivide(int num) {
		int remainder = value % num;
		int quotient = (value - remainder) / num;
		return quotient;
	}

	@Override
	public SubLInteger integerDivide(SubLInteger num) {
		int numTyped = num.intValue();
		return SubLNumberFactory.makeInteger(this.integerDivide(numTyped));
	}

	@Override
	public int intValue() {
		return value;
	}

	@Override
	public boolean isEven() {
		return value % 2 == 0;
	}

	@Override
	public boolean isNegative() {
		return value < 0;
	}

	@Override
	public boolean isOdd() {
		return value % 2 != 0;
	}

	@Override
	public boolean isPositive() {
		return value > 0;
	}

	@Override
	public boolean isZero() {
		return value == 0;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > 0)
			return num.mult(this);
		return SubLNumberFactory.makeInteger((long) value * (long) num.intValue());
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
