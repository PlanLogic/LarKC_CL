//
//
package com.cyc.tool.subl.util;

import java.util.logging.Level;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public abstract class SafeRunnable implements Runnable {
	@Override
	public void run() {
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			safeRun();
		} catch (SubLProcess.TerminationRequest tr) {
		} catch (Exception e) {
			try {
				Errors.handleError(e);
			} catch (CatchableThrow t) {
				t.printStackTrace();
			}
		}
	}

	public abstract void safeRun();

	protected String getErrorMessage(Exception e) {
		return e.getMessage();
	}

	protected Level getLogLevel(Exception e) {
		return Level.WARNING;
	}
}
