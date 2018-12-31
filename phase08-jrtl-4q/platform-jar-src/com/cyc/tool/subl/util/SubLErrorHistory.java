//
//
package com.cyc.tool.subl.util;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

public class SubLErrorHistory {
	private static int MAX_HISTORY = 100;

	public static SubLErrorHistory me;

	static {
		SubLErrorHistory.me = new SubLErrorHistory();
	}

	public static void main(String[] args) {
	}

	private Deque<SubLException> history;

	SubLErrorHistory() {
		this.history = new LinkedList<SubLException>();
	}

	public synchronized void add(SubLException item) {
		this.history.addFirst(item);
		if (this.history.size() > 100)
			this.history.removeLast();
	}

	public synchronized void clearHistory() {
		this.history.clear();
	}

	public synchronized ArrayList<SubLString> getAllErrors() {
		ArrayList<SubLString> result = new ArrayList<SubLString>(this.history.size());
		for (SubLException e : this.history)
			result.add(SubLObjectFactory.makeString(SubLException.getStringForException(e)));
		return result;
	}

	public synchronized int size() {
		return this.history.size();
	}
}
