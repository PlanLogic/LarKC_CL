//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

public abstract class AbstractSubLFloat extends AbstractSubLNumber
		implements SubLFloat, SubLNumber, SubLObject, Comparable {

	public SubLNumber abs() {
		double result = Math.abs(this.doubleValue());
		return SubLObjectFactory.makeDouble(result);
	}

	public List decode() {
		Errors.unimplementedMethod("AbstractSubLFloat.decode");
		return null;
	}

	public SubLNumber digits() {
		Errors.unimplementedMethod("AbstractSubLFloat.digits");
		return null;
	}

	public List integerDecode() {
		Errors.unimplementedMethod("AbstractSubLFloat.integerDecode");
		return null;
	}

	public SubLNumber precision() {
		Errors.unimplementedMethod("AbstractSubLFloat.precision");
		return null;
	}

	public SubLNumber radix() {
		Errors.unimplementedMethod("AbstractSubLFloat.radix");
		return null;
	}

	public SubLFloat scale(SubLInteger val) {
		Errors.unimplementedMethod("AbstractSubLFloat.scale");
		return null;
	}

	public SubLNumber sign() {
		Errors.unimplementedMethod("AbstractSubLFloat.sign");
		return null;
	}

	public SubLInteger toInteger() {
		Errors.error(this + " is not of type: INTEGER.");
		return null;
	}
}
