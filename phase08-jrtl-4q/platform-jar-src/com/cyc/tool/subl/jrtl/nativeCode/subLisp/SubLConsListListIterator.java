//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class SubLConsListListIterator implements SubLListListIterator, ListIterator {
	private int cursor;

	private SubLObject cursorCdr;

	private int start;

	private int lastRet;

	private SubLObject lastRetCdr;
	private int modCount;
	private int expectedModCount;
	private SubLList list;
	private int end;

	SubLConsListListIterator() {
		this.cursor = 0;
		this.cursorCdr = null;
		this.start = 0;
		this.lastRet = -1;
		this.lastRetCdr = SubLNil.NIL;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.end = -1;
	}

	SubLConsListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLConsListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLConsListListIterator(SubLList list, int start, int end) {
		this.cursor = 0;
		this.cursorCdr = null;
		this.start = 0;
		this.lastRet = -1;
		this.lastRetCdr = SubLNil.NIL;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.end = -1;
		this.init(list, start, end);
	}

	public void add(Object o) {
		Errors.error("Unimplemented.");
	}

	void checkForComodification() {
		if (this.modCount != this.expectedModCount)
			throw new ConcurrentModificationException();
	}

	public SubLObject currentSubSeq() {
		if (this.end == -1)
			return this.cursorCdr;
		return this.list.subSeq(this.cursor, this.end);
	}

	public SubLObject getDottedElement() {
		if (this.cursorCdr.isList())
			Errors.error("Attempt to get dotted element from an iterator that isn't at the end of the list.");
		return this.cursorCdr;
	}

	public boolean hasNext() {
		return (this.end == -1 || this.cursor < this.end) && this.cursorCdr != SubLNil.NIL;
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
		return false;
	}

	public boolean isNextImproperElement() {
		return !this.cursorCdr.isList();
	}

	public int itemsRemaining() {
		if (this.cursorCdr.isCons())
			return this.cursorCdr.size();
		return 0;
	}

	public Object next() {
		if (!this.cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + this.cursorCdr);
		SubLObject next = this.cursorCdr.first();
		this.lastRet = this.cursor++;
		this.lastRetCdr = this.cursorCdr;
		this.cursorCdr = this.cursorCdr.rest();
		return next;
	}

	public int nextIndex() {
		return this.cursor;
	}

	public SubLObject nextSubLObject() {
		if (!this.cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + this.cursorCdr);
		SubLObject next = this.cursorCdr.first();
		this.lastRet = this.cursor++;
		this.lastRetCdr = this.cursorCdr;
		this.cursorCdr = this.cursorCdr.rest();
		return next;
	}

	public Object previous() {
		return Errors.error("Can't iterate backwards on a cons list.");
	}

	public int previousIndex() {
		return this.cursor - 1;
	}

	public SubLObject previousSubSeq() {
		if (this.end == -1)
			return this.lastRetCdr;
		if (this.lastRet < 0)
			return SubLNil.NIL;
		return this.list.subSeq(this.lastRet, this.end);
	}

	public void remove() {
		Errors.error("Unimplemented.");
	}

	public void reset() {
		this.cursor = 0;
		this.lastRet = -1;
		this.modCount = 0;
		this.expectedModCount = this.modCount;
		this.list = null;
		this.cursorCdr = null;
		this.lastRetCdr = SubLNil.NIL;
		this.end = 0;
	}

	public void set(Object o) {
		if (this.lastRet == -1)
			throw new IllegalStateException();
		this.lastRetCdr.setFirst((SubLObject) o);
	}

	void setEnd(int end) {
		if (this.list == null)
			end = 0;
		else
			this.end = end;
	}

	void setList(SubLList list) {
		if (list != null && list.isArrayBased())
			Errors.error("Can't create a cons iterator for an array list.");
		this.list = list;
	}

	void setStart(int start) {
		if (start < 0)
			this.cursor = 0;
		else
			this.cursor = start;
		this.start = start;
		this.cursorCdr = this.list.nthCdr(start);
	}
}
