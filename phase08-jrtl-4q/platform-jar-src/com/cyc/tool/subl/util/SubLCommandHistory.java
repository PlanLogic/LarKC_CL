//
//
package com.cyc.tool.subl.util;

import java.util.Deque;
import java.util.LinkedList;

public class SubLCommandHistory {
	private static int MAX_HISTORY = 250;

	public static void main(String[] args) {
	}

	private Deque<SubLCommandHistoryItem> history;

	public SubLCommandHistory() {
		this.history = new LinkedList<SubLCommandHistoryItem>();
	}

	public synchronized void add(SubLCommandHistoryItem item) {
		this.history.addFirst(item);
		if (this.history.size() > 250)
			this.history.removeLast();
	}

	public synchronized void clearHistory() {
		this.history.clear();
	}

	public synchronized int size() {
		return this.history.size();
	}
}
