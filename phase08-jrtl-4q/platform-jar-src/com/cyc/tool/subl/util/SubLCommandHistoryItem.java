//
//
package com.cyc.tool.subl.util;

import java.text.DecimalFormat;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public class SubLCommandHistoryItem {
	private static boolean SHOW_TIMES = true;

	public static void main(String[] args) {
	}

	private String command;
	private String results;
	private int historyNum;
	private String packageName;
	private long evalTimeNanos;
	private DecimalFormat evalTimeFormat;

	public SubLCommandHistoryItem(int historyNum, String packageName) {
		this.command = "";
		this.results = "";
		this.evalTimeFormat = new DecimalFormat("#.###");
		this.historyNum = historyNum;
		this.packageName = packageName;
	}

	public String getCommand() {
		return this.command;
	}

	public String getCommandPrompt() {
		return this.packageName + "(" + this.historyNum + "): ";
	}

	public String getResultsString() {
		StringBuilder buf = new StringBuilder();
		if (this.evalTimeNanos >= 0L) {
			double millis = this.evalTimeNanos / 1000000.0;
			if (millis >= 1.0) {
				String secsStr = this.evalTimeFormat.format(millis / 1000.0);
				if ("1".equals(secsStr))
					buf.append("[Time: ").append(secsStr).append(" sec]\n");
				else
					buf.append("[Time: ").append(secsStr).append(" secs]\n");
			} else {
				String µsecsStr = this.evalTimeFormat.format(millis * 1000.0);
				if ("1".equals(µsecsStr))
					buf.append("[Time: ").append(µsecsStr).append(" µsec]\n");
				else
					buf.append("[Time: ").append(µsecsStr).append(" µsecs]\n");
			}
		}
		buf.append(this.results);
		return buf.toString();
	}

	public void setCommand(String command) {
		if (command == null)
			command = "";
		if (!command.endsWith("\n"))
			command += "\n";
		this.command = command;
	}

	public void setResults(String results, long evalTimeNanos) {
		if (results == null)
			results = "";
		this.results = results;
		this.evalTimeNanos = evalTimeNanos;
	}

	public void setResultValues(SubLList resultValues, long evalTimeNanos) {
		if (resultValues == null)
			resultValues = SubLNil.NIL;
		StringBuilder buf = new StringBuilder();
		SubLObject val = SubLNil.NIL;
		int i = 0;
		val = conses_high.first(resultValues);
		while (SubLNil.NIL == Types.sublisp_null(resultValues)) {
			if (i > 0)
				buf.append("\n");
			buf.append(print_high.prin1_to_string(val).getString());
			resultValues = (SubLList) conses_high.rest(resultValues);
			val = conses_high.first(resultValues);
			++i;
		}
		this.setResults(buf.toString(), evalTimeNanos);
	}

	public String toString() {
		String commandPrompt = this.getCommandPrompt();
		return commandPrompt + this.getCommand() + this.getResultsString();
	}
}
