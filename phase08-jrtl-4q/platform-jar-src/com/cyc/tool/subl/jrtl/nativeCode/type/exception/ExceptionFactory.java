//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.exception;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class ExceptionFactory {
	public static SubLException makeException() {
		return new SubLException();
	}

	public static SubLException makeException(String str) {
		return new SubLException(str);
	}

	public static SubLException makeException(String str, Throwable t) {
		ExceptionFactory.verifyHandleable(t);
		return new SubLException(str, t);
	}

	public static SubLException makeException(SubLString str) {
		return ExceptionFactory.makeException(str.getString());
	}

	public static SubLException makeException(SubLString str, Throwable t) {
		ExceptionFactory.verifyHandleable(t);
		return ExceptionFactory.makeException(str.getString(), t);
	}

	private static void verifyHandleable(Throwable t) {
		if (t != null && t instanceof Unhandleable)
			throw (Unhandleable) t;
	}
}
