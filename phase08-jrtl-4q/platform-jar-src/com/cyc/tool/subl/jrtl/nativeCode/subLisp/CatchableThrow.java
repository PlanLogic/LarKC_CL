//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Deque;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

public class CatchableThrow extends RuntimeException implements CommonSymbols {
	public static boolean dequeContains(Deque<SubLObject> deque, SubLObject elem) {
		for (Object cur : deque)
			if (cur == elem)
				return true;
		return false;
	}

	public static void throwToCatch(SubLObject target, SubLObject result, boolean errorIfCantThrow)
			throws CatchableThrow {
		Deque<SubLObject> stack = SubLProcess.currentSubLThread().throwStack;
		if (CatchableThrow.dequeContains(stack, target))
			throw new CatchableThrow(target, result);
		if (errorIfCantThrow)
			Errors.error("Invalid attempt to throw to the uncaught target: " + target + "\n expecting one of: "
					+ SubLProcess.currentSubLThread().throwStack);
	}

	private SubLObject target;

	private SubLObject result;

	private CatchableThrow(SubLObject target, SubLObject result) {
		this.target = target;
		this.result = result;
	}

	public String getMessage() {
		return "Attempt to throw to the non-existent tag " + this.target + "\n expecting one of: "
				+ SubLProcess.currentSubLThread().throwStack + "\nError handled by: "
				+ SubLException.getStringForException(new Exception());
	}

	public SubLObject getResult() {
		return this.result;
	}

	public SubLObject getTarget() {
		return this.target;
	}
}
