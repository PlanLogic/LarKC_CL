//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public abstract class AbstractSubLInteger extends AbstractSubLNumber
		implements SubLInteger, SubLNumber, SubLObject, Comparable {

	public SubLInteger and(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.and");
		return null;
	}

	public SubLInteger ceiling() {
		return this;
	}

	public SubLInteger floor() {
		return this;
	}

	public SubLInteger greatestCommonDivisor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.greatestCommonDivisor");
		return null;
	}

	public SubLInteger integerDivide(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.integerDivide");
		return null;
	}

	public SubLInteger integerLength() {
		Errors.unimplementedMethod("AbstractSubLInteger.integerLength");
		return null;
	}

	public boolean isEven() {
		return (this.intValue() & 0x1) == 0x0;
	}

	public boolean isOdd() {
		return (this.intValue() & 0x1) == 0x1;
	}

	public SubLInteger leastCommonMultiple(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.leastCommonMultiple");
		return null;
	}

	public SubLInteger nand(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nand");
		return null;
	}

	public SubLInteger nor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nor");
		return null;
	}

	public SubLInteger not(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.not");
		return null;
	}

	public SubLInteger or(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.or");
		return null;
	}

	public SubLInteger random() {
		Errors.unimplementedMethod("AbstractSubLInteger.random");
		return null;
	}

	public SubLInteger round() {
		return this;
	}

	public SubLDoubleFloat toDouble() {
		Errors.error(this + " is not of type: FLOAT.");
		return null;
	}

	public SubLInteger toInteger() {
		return this;
	}

	public SubLInteger truncate() {
		return this;
	}

	public SubLInteger xnor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xnor");
		return null;
	}

	public SubLInteger xor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xor");
		return null;
	}
}
