/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLErrorHistory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Errors extends SubLTrampolineFile {
	public static class Restarter {
		private String choice;

		private RestartMethod restartMethod;

		public Restarter(String choice, RestartMethod restartMethod) {
			this.choice = choice;
			this.restartMethod = restartMethod;
		}

		public RestartMethod getRestartMethod() {
			return this.restartMethod;
		}

		public String toString() {
			return this.choice;
		}
	}

	public interface RestartMethod {
		boolean process(SubLReader p0, String p1, SubLException p2);
	}

	public static SubLFile me;

	public static SubLSymbol $break_on_errorP$;

	public static SubLSymbol $break_on_warnP$;

	public static SubLSymbol $continue_cerrorP$;

	public static SubLSymbol $error_abort_handler$;

	public static SubLSymbol $error_handler$;

	public static SubLSymbol $error_message$;

	public static SubLSymbol $ignore_breaksP$;

	public static SubLSymbol $ignore_mustsP$;

	public static SubLSymbol $ignore_warnsP$;

	public static SubLSymbol $suspend_type_checkingP$;

	public static SubLSymbol $restarts$;

	public static SubLSymbol $append_stack_traces_to_error_messagesP$;

	public static SubLSymbol $force_error_message_outputP$;

	public static boolean DEBUG_MODE = true;

	public static Object errorLock;

	public static Object handleErrorLock;

	public static Object handleErrorInternalLock;

	public static Object breakLock;

	public static Object cerrorLock;

	private static List<Restarter> ERROR_RESTARTS;

	private static boolean SHOW_WARNING_STACK_TRACES = false;

	static {
		Errors.me = new Errors();
		Errors.errorLock = new Object();
		Errors.handleErrorLock = new Object();
		Errors.handleErrorInternalLock = new Object();
		Errors.breakLock = new Object();
		Errors.cerrorLock = new Object();
		(Errors.ERROR_RESTARTS = new ArrayList<Restarter>(3))
				.add(new Restarter("Show stack trace.", new RestartMethod() {

					public boolean process(SubLReader reader, String message, SubLException se) {
						if (se == null)
							reader.showStackTrace(new Exception());
						else
							reader.showStackTrace(se);
						return true;
					}
				}));
		Errors.ERROR_RESTARTS.add(new Restarter("Return to top level read loop.", new RestartMethod() {

			public boolean process(SubLReader reader, String message, SubLException se) {
				throw new ResumeException(message);
			}
		}));
		Errors.ERROR_RESTARTS.add(new Restarter("Rethrow error.", new RestartMethod() {

			public boolean process(SubLReader reader, String message, SubLException se) {
				throw se;
			}
		}));
		Errors.ERROR_RESTARTS.add(new Restarter("Exit program.", new RestartMethod() {

			public boolean process(SubLReader reader, String message, SubLException se) {
				SubLMain.me.doSystemCleanupAndExit(-1);
				return false;
			}
		}));
	}

	public static SubLObject cerror(String continueString, String formatString) {
		return Errors.cerror(SubLObjectFactory.makeString(continueString), SubLObjectFactory.makeString(formatString));
	}

	public static SubLObject cerror(String continueStr, String errorStr, Throwable t) {
		if (t instanceof Error)
			throw (Error) t;
		if (errorStr != null && !"".equals(errorStr))
			errorStr = errorStr + "\n" + SubLException.getStringForException(t);
		else
			errorStr = SubLException.getStringForException(t);
		return Errors.cerror(SubLObjectFactory.makeString(continueStr), SubLObjectFactory.makeString(errorStr));
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString) {
		return Errors.cerror(continue_string, formatString, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(1);
			args[0] = arg1;
			return Errors.cerror(continue_string, formatString, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1,
			SubLObject arg2) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(2);
			args[0] = arg1;
			args[1] = arg2;
			return Errors.cerror(continue_string, formatString, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1,
			SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(3);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			return Errors.cerror(continue_string, formatString, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject[] arguments) {
		synchronized (Errors.cerrorLock) {
			if (!SubLMain.isInitialized()) {
				RuntimeException re = new RuntimeException(formatString.toString());
				re.printStackTrace();
				throw re;
			}
			if (CommonSymbols.NIL != Errors.$continue_cerrorP$.getDynamicValue())
				return CommonSymbols.NIL;
			String errorString = PrintLow.format(CommonSymbols.NIL, formatString, arguments).getString();
			errorString = Errors.possiblyCallErrorHandler(errorString, null);
			if (!Errors.isInitializedAndReaderThreadAndOriginalErrorStream())
				Errors.error(errorString);
			SubLReader reader = Errors.getReaderForCurrentThread();
			String continueString = PrintLow.format(CommonSymbols.NIL, continue_string, arguments).getString();
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Continuable error: " + errorString,
					continueString, Errors.ERROR_RESTARTS, true, SubLObjectFactory.makeException());
			if (restartMethod.process(reader, errorString, null))
				return Errors.cerror(continue_string, formatString, arguments);
			return CommonSymbols.NIL;
		}
	}

	public static SubLObject clear_all_errors() {
		SubLErrorHistory.me.clearHistory();
		return CommonSymbols.NIL;
	}

	private static SubLException createErrorException(String errorString, Throwable e) {
		SubLException se;
		if (e instanceof SubLException && errorString == null)
			se = (SubLException) e;
		else
			se = e == null ? SubLObjectFactory.makeException(errorString)
					: SubLObjectFactory.makeException(errorString + "\nBecause of nested exception: " + e.toString(),
							e);
		return se;
	}

	public static SubLObject debug() {
		return Errors.unimplementedMethod("Errors.debug()");
	}

	public static SubLObject error(Exception e) {
		Errors.error(e instanceof SubLException ? null : e.toString(), e);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(String str) {
		Errors.error(str, null);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(String errorString, Throwable e) {
		if (CommonSymbols.NIL != CommonSymbols.FORCE_ERROR_MESSAGE_OUTPUT.getDynamicValue())
			if (e != null) {
				e.printStackTrace();
				System.err.println(errorString);
				System.err.flush();
			} else {
				new Exception(errorString).printStackTrace();
				System.err.flush();
			}
		if (e instanceof Error)
			throw (Error) e;
		if (e instanceof Unhandleable)
			throw (Unhandleable) e;
		errorString = Errors.possiblyCallErrorHandler(errorString, e);
		SubLException se = Errors.createErrorException(errorString, e);
		SubLErrorHistory.me.add(se);
		if (!Errors.isInitializedAndReaderThreadAndOriginalErrorStream())
			throw se;
		SubLReader reader = Errors.getReaderForCurrentThread();
		RestartMethod restartMethod = reader.askRestartChoiceQuestion("Error: " + se.getMessage(), null,
				Errors.ERROR_RESTARTS, true, se);
		if (restartMethod.process(reader, se.getMessage(), se))
			return Errors.error(errorString, e);
		throw new ResumeException();
	}

	public static SubLObject error(SubLObject formatString) {
		String errorString = PrintLow.format(CommonSymbols.NIL, formatString).getString();
		Errors.error(errorString, null);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(SubLObject formatString, Exception e) {
		String errorString = PrintLow.format(CommonSymbols.NIL, formatString).getString();
		Errors.error(errorString, e);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(1);
			args[0] = arg1;
			Errors.error(formatString, args);
			throw SubLObjectFactory.makeException("Unexpected situation.");
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(2);
			args[0] = arg1;
			args[1] = arg2;
			Errors.error(formatString, args);
			throw SubLObjectFactory.makeException("Unexpected situation.");
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(3);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			Errors.error(formatString, args);
			throw SubLObjectFactory.makeException("Unexpected situation.");
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject error(SubLObject formatString, SubLObject[] arguments) {
		String errorString = PrintLow.format(CommonSymbols.NIL, formatString, arguments).getString();
		Errors.error(errorString, null);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject forceWarn(String formatString) {
		SubLObject oldVal = Errors.$ignore_warnsP$.getDynamicValue();
		try {
			Errors.$ignore_warnsP$.setDynamicValue(CommonSymbols.NIL);
			return Errors.warn(SubLObjectFactory.makeString(formatString));
		} finally {
			Errors.$ignore_warnsP$.setDynamicValue(oldVal);
		}
	}

	private static SubLReader getReaderForCurrentThread() {
		SubLReader reader = SubLMain.getMainReader();
		if (reader == null || !reader.isInReaderThread())
			return null;
		return reader;
	}

	public static void handleError(Exception e) {
		Errors.handleError(null, e);
	}

	public static void handleError(String description, Throwable e) {
		synchronized (Errors.handleErrorLock) {
			if (e instanceof Unhandleable)
				throw (Unhandleable) e;
			if (!(e instanceof SubLException))
				e = SubLObjectFactory.makeException(description == null || "".equals(description)
						? e instanceof SubLException ? e.getMessage() : e.toString() : description, e);
			SubLException se = (SubLException) e;
			se.setDescription(description);
			SubLErrorHistory.me.add(se);
			if (!Errors.isInitializedAndReaderThreadAndOriginalErrorStream()) {
				Errors.handleErrorInternal(se);
				return;
			}
			SubLReader reader = Errors.getReaderForCurrentThread();
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Error: " + description, null,
					Errors.ERROR_RESTARTS, true, se);
			if (restartMethod.process(reader, description, se))
				Errors.handleError(description, e);
		}
	}

	private static void handleErrorInternal(Throwable e) {
		synchronized (Errors.handleErrorInternalLock) {
			if (e instanceof Error)
				throw (Error) e;
			if (!SubLMain.isInitialized()
					|| CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getDynamicValue() != CommonSymbols.NIL)
				Errors.showErrorMessage(SubLException.getStringForException(e));
			else {
				String message = e.getMessage() == null
						? "RuntimeException of type " + e.getClass().getName() + " without much detail."
						: e.getMessage();
				Errors.showErrorMessage(message);
			}
		}
	}

	public static void handleRuntimeException(RuntimeException rte) {
		Errors.error(rte);
	}

	public static SubLObject handleThrowable(Throwable t, SubLObject catchableThrowTarget) {
		if (t instanceof CatchableThrow)
			return Dynamic.handleCatchableThrow((CatchableThrow) t, catchableThrowTarget);
		if (t instanceof Error)
			throw (Error) t;
		if (!(t instanceof RuntimeException)) {
			assert t instanceof RuntimeException;
			t = SubLObjectFactory.makeException((String) null, t);
		}
		try {
			Errors.error((Exception) t);
		} catch (CatchableThrow ct) {
			return Dynamic.handleCatchableThrow(ct, catchableThrowTarget);
		}
		return CommonSymbols.NIL;
	}

	private static boolean isInitializedAndReaderThreadAndOriginalErrorStream() {
		SubLReader reader = Errors.getReaderForCurrentThread();
		SubLOutputTextStream stream1 = StreamsLow.$error_output$.getDynamicValue().toOutputTextStream();
		SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
		return SubLMain.isInitialized() && reader != null && stream1.equals(stream2);
	}

	public static SubLObject list_of_all_errors() {
		return SubLObjectFactory.makeList(SubLErrorHistory.me.getAllErrors());
	}

	private static String possiblyCallErrorHandler(String errorMessage, Throwable e) {
		if (errorMessage != null)
			errorMessage = errorMessage.trim();
		if (errorMessage == null || "".equals(errorMessage))
			errorMessage = SubLException.getStringForException(e == null ? new Exception() : e);
		else if (CommonSymbols.NIL != CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getDynamicValue())
			errorMessage = errorMessage + "\n" + SubLException.getStringForException(e == null ? new Exception() : e);
		SubLString errorStr = SubLObjectFactory.makeString(errorMessage);
		if (CommonSymbols.NIL != Errors.$break_on_errorP$.getDynamicValue())
			Errors.sublisp_break(errorStr);
		SubLObject handler = Errors.$error_handler$.getDynamicValue();
		if (handler != CommonSymbols.NIL) {
			SubLObject oldValue = Errors.$error_message$.getDynamicValue();
			try {
				Errors.$error_message$.setDynamicValue(errorStr);
				Functions.funcall(handler);
			} finally {
				Errors.$error_message$.setDynamicValue(oldValue);
			}
			throw SubLObjectFactory.makeException(errorMessage);
		}
		return errorMessage;
	}

	private static void showErrorMessage(String str) {
		Errors.showMessageOnErrorStream("Error: ");
		Errors.showMessageOnErrorStream(SubLObjectFactory.makeString(str));
		Errors.showMessageOnErrorStream("\n");
	}

	private static void showErrorMessage(SubLString str) {
		Errors.showMessageOnErrorStream("Error: ");
		Errors.showMessageOnErrorStream(str);
		Errors.showMessageOnErrorStream("\n");
	}

	public static void showMessageOnErrorStream(String str) {
		Errors.showMessageOnErrorStream(SubLObjectFactory.makeString(str));
	}

	public static void showMessageOnErrorStream(SubLString str) {
		try {
			if (str != null) {
				StreamsLow.$error_output$.getDynamicValue().toOutputTextStream().writeString(str.getString());
				streams_high.force_output(StreamsLow.$error_output$.getDynamicValue().toOutputTextStream());
			}
		} catch (RuntimeException e) {
			System.err.println(str);
			throw e;
		}
	}

	private static void showWarnMessage(String str) {
		Errors.showMessageOnErrorStream("Warning: ");
		Errors.showMessageOnErrorStream(SubLObjectFactory.makeString(str));
		Errors.showMessageOnErrorStream("\n");
	}

	private static void showWarnMessage(SubLString str) {
		Errors.showMessageOnErrorStream("Warning: ");
		Errors.showMessageOnErrorStream(str);
		Errors.showMessageOnErrorStream("\n");
	}

	public static SubLObject sublisp_break(SubLObject format_string) {
		return Errors.sublisp_break(format_string, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject sublisp_break(SubLObject format_string, SubLObject[] arguments) {
		synchronized (Errors.breakLock) {
			if (!SubLMain.isInitialized())
				return CommonSymbols.NIL;
			if (CommonSymbols.NIL != Errors.$ignore_breaksP$.getDynamicValue())
				return CommonSymbols.NIL;
			String breakString = format_string != CommonSymbols.UNPROVIDED
					? PrintLow.format(CommonSymbols.NIL, format_string, arguments).getString() : "";
			SubLReader reader = SubLMain.getMainReader();
			SubLOutputTextStream stream1 = StreamsLow.$error_output$.getDynamicValue().toOutputTextStream();
			SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
			if (reader == null || !reader.isInReaderThread() || !stream1.equals(stream2)) {
				String breakHeaderString = "\nBreakpoint reached from background thread or from REPL with *error-output* rebound: ";
				SubLOutputTextStream stream3 = StreamsLow.$error_output$.getDynamicValue().getStream(true)
						.toOutputTextStream();
				stream3.writeString(breakHeaderString);
				stream3.writeString(breakString);
				stream3.writeString("\n");
				return CommonSymbols.NIL;
			}
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Breakpoint reached: " + breakString,
					"Continue from break: ", Errors.ERROR_RESTARTS, true, SubLObjectFactory.makeException());
			if (restartMethod.process(reader, breakString, null))
				Errors.sublisp_break(format_string, arguments);
			else
				reader.writeResults("[ Continuing from break... ]");
			return CommonSymbols.NIL;
		}
	}

	public static SubLObject unimplementedMethod(String methodName) {
		Errors.error("Unimplemented method : " + methodName + ".");
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject warn(String formatString) {
		return Errors.warn(SubLObjectFactory.makeString(formatString));
	}

	public static SubLObject warn(SubLObject formatString) {
		if (CommonSymbols.NIL != Errors.$ignore_warnsP$.getDynamicValue())
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL != Errors.$break_on_warnP$.getDynamicValue())
			return Errors.sublisp_break(formatString);
		SubLObject warnString = PrintLow.format(CommonSymbols.NIL, formatString);
		SubLString warnStringTyped = (SubLString) warnString;
		Errors.showWarnMessage(warnStringTyped);
		return CommonSymbols.NIL;
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1) {
		if (CommonSymbols.NIL == Errors.$ignore_warnsP$.getDynamicValue()) {
			SubLObject warnString = PrintLow.format(CommonSymbols.NIL, formatString, arg1);
			SubLString warnStringTyped = (SubLString) warnString;
			Errors.showWarnMessage(warnStringTyped);
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
		if (CommonSymbols.NIL == Errors.$ignore_warnsP$.getDynamicValue()) {
			SubLObject warnString = PrintLow.format(CommonSymbols.NIL, formatString, arg1, arg2);
			SubLString warnStringTyped = (SubLString) warnString;
			Errors.showWarnMessage(warnStringTyped);
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(3);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			return Errors.warn(formatString, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject warn(SubLObject formatString, SubLObject[] arguments) {
		if (CommonSymbols.NIL != Errors.$ignore_warnsP$.getDynamicValue())
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL != Errors.$break_on_warnP$.getDynamicValue())
			return Errors.sublisp_break(formatString, arguments);
		SubLObject warnString = PrintLow.format(CommonSymbols.NIL, formatString, arguments);
		SubLString warnStringTyped = (SubLString) warnString;
		Errors.showWarnMessage(warnStringTyped);
		return CommonSymbols.NIL;
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Errors.me, "sublisp_break", "BREAK", 0, 1, true);
		SubLFiles.declareFunction(Errors.me, "cerror", "CERROR", 2, 0, true);
		SubLFiles.declareFunction(Errors.me, "debug", "DEBUG", 0, 0, false);
		SubLFiles.declareFunction(Errors.me, "error", "ERROR", 1, 0, true);
		SubLFiles.declareFunction(Errors.me, "warn", "WARN", 1, 0, true);
		SubLFiles.declareFunction(Errors.me, "list_of_all_errors", "LIST-OF-ALL-ERRORS", 0, 0, false);
		SubLFiles.declareFunction(Errors.me, "clear_all_errors", "CLEAR-ALL-ERRORS", 0, 0, false);
	}

	public void initializeVariables() {
		Errors.$suspend_type_checkingP$ = SubLFiles.defvar(Errors.me, "*SUSPEND-TYPE-CHECKING?*", CommonSymbols.NIL);
		Errors.$break_on_errorP$ = SubLFiles.defvar(Errors.me, "*BREAK-ON-ERROR?*", CommonSymbols.NIL);
		Errors.$break_on_warnP$ = SubLFiles.defvar(Errors.me, "*BREAK-ON-WARN?*", CommonSymbols.NIL);
		Errors.$continue_cerrorP$ = SubLFiles.defvar(Errors.me, "*CONTINUE-CERROR?*", CommonSymbols.NIL);
		Errors.$error_abort_handler$ = SubLFiles.defvar(Errors.me, "*ERROR-ABORT-HANDLER*", CommonSymbols.NIL);
		Errors.$error_handler$ = SubLFiles.defvar(Errors.me, "*ERROR-HANDLER*", CommonSymbols.NIL);
		Errors.$error_message$ = SubLFiles.defvar(Errors.me, "*ERROR-MESSAGE*", CommonSymbols.NIL);
		Errors.$ignore_breaksP$ = SubLFiles.defvar(Errors.me, "*IGNORE-BREAKS?*", CommonSymbols.NIL);
		Errors.$ignore_mustsP$ = SubLFiles.defvar(Errors.me, "*IGNORE-MUSTS?*", CommonSymbols.NIL);
		Errors.$ignore_warnsP$ = SubLFiles.defvar(Errors.me, "*IGNORE-WARNS?*", CommonSymbols.NIL);
		Errors.$restarts$ = SubLFiles.defvar(Errors.me, "*RESTARTS*", CommonSymbols.NIL);
		Errors.$append_stack_traces_to_error_messagesP$ = SubLFiles.defvar(Errors.me,
				CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getName(), CommonSymbols.T);
		Errors.$force_error_message_outputP$ = SubLFiles.defvar(Errors.me,
				CommonSymbols.FORCE_ERROR_MESSAGE_OUTPUT.getName(), CommonSymbols.NIL);
	}

	public void runTopLevelForms() {
	}
}
