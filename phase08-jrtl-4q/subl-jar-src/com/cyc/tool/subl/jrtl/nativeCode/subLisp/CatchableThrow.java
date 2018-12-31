//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.Deque;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

public class CatchableThrow extends RuntimeException implements CommonSymbols {
	private CatchableThrow(SubLObject target, SubLObject result) {
		this.target = target;
		this.result = result;
	}

	public static boolean dequeContains(Deque<SubLObject> deque, SubLObject elem) {
		for (Object cur : deque)
			if (cur == elem)
				return true;
		return false;
	}

	public static void throwToCatch(SubLObject target, SubLObject result, boolean errorIfCantThrow)
			throws CatchableThrow {
		Deque<SubLObject> stack = SubLProcess.currentSubLThread().throwStack;
		if (dequeContains(stack, target))
			throw new CatchableThrow(target, result);
		if (errorIfCantThrow)
			Errors.error("Invalid attempt to throw to the uncaught target: " + target + "\n expecting one of: "
					+ SubLProcess.currentSubLThread().throwStack);
	}

	private SubLObject target;
	private SubLObject result;

	@Override
	public String getMessage() {
		return "Attempt to throw to the non-existent tag " + target + "\n expecting one of: "
				+ SubLProcess.currentSubLThread().throwStack + "\nError handled by: "
				+ SubLException.getStringForException(new Exception());
	}

	public SubLObject getResult() {
		return result;
	}

	public SubLObject getTarget() {
		return target;
	}
}
