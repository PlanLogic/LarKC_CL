//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class SubLArrayListListIterator implements SubLListListIterator, ListIterator {
	private int cursor;

	private int start;

	private int lastRet;

	private int modCount;

	private int expectedModCount;
	private SubLList list;
	private int end;

	SubLArrayListListIterator() {
		this.cursor = 0;
		this.start = 0;
		this.lastRet = -1;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.end = -1;
	}

	SubLArrayListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start, int end) {
		this.cursor = 0;
		this.start = 0;
		this.lastRet = -1;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.end = -1;
		this.init(list, start, end);
	}

	public void add(Object o) {
		Errors.unimplementedMethod("SubLArrayListListIterator.add()");
	}

	void checkForComodification() {
		if (this.modCount != this.expectedModCount)
			throw new ConcurrentModificationException();
	}

	public SubLObject currentSubSeq() {
		return this.list.subSeq(this.cursor, this.end);
	}

	public SubLObject getDottedElement() {
		return this.list.getDottedElement();
	}

	public boolean hasNext() {
		return this.cursor < this.end;
	}

	public boolean hasPrevious() {
		return this.cursor > this.start;
	}

	public void init(SubLList list) {
		this.init(list, 0, -1);
	}

	public void init(SubLList list, int start) {
		this.init(list, start, -1);
	}

	public void init(SubLList list, int start, int end) {
		this.setList(list);
		this.setStart(start);
		this.setEnd(end);
	}

	public boolean isArrayBased() {
		return true;
	}

	public boolean isNextImproperElement() {
		return !this.list.isProper() && this.cursor >= this.list.size();
	}

	public int itemsRemaining() {
		return this.list.size() - this.cursor;
	}

	public Object next() {
		this.checkForComodification();
		try {
			Object next = this.list.get(this.cursor);
			this.lastRet = this.cursor++;
			return next;
		} catch (IndexOutOfBoundsException e) {
			this.checkForComodification();
			throw new NoSuchElementException();
		}
	}

	public int nextIndex() {
		return this.cursor;
	}

	public SubLObject nextSubLObject() {
		return (SubLObject) this.next();
	}

	public Object previous() {
		this.checkForComodification();
		try {
			int i = this.cursor - 1;
			Object previous = this.list.get(i);
			int n = i;
			this.cursor = n;
			this.lastRet = n;
			return previous;
		} catch (IndexOutOfBoundsException e) {
			this.checkForComodification();
			throw new NoSuchElementException();
		}
	}

	public int previousIndex() {
		return this.cursor - 1;
	}

	public SubLObject previousSubSeq() {
		if (this.lastRet < 0)
			return SubLNil.NIL;
		return this.list.subSeq(this.lastRet, this.end);
	}

	public void remove() {
		Errors.unimplementedMethod("SubLArrayListListIterator.remove()");
	}

	public void reset() {
		this.cursor = 0;
		this.lastRet = -1;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.end = 0;
	}

	public void set(Object o) {
		if (this.lastRet == -1)
			throw new IllegalStateException();
		this.checkForComodification();
		try {
			this.list.set(this.lastRet, (SubLObject) o);
			this.expectedModCount = this.modCount;
		} catch (IndexOutOfBoundsException e) {
			throw new ConcurrentModificationException();
		}
	}

	void setEnd(int end) {
		if (this.list == null)
			end = 0;
		else if (end > this.list.size() || end == -1)
			this.end = this.list.size() + (this.list != null && !this.list.isProper() ? 1 : 0);
		else
			this.end = end;
	}

	void setList(SubLList list) {
		if (list != null && !list.isArrayBased())
			Errors.error("Can't create an array iterator for a cons list.");
		this.list = list;
	}

	void setStart(int start) {
		if (start < 0)
			this.cursor = 0;
		else
			this.cursor = start;
		this.start = start;
	}
}
