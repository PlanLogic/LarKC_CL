//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SubLHashtableIterator extends AbstractSubLObject {
	public static String HASHTABLE_ITERATOR_TYPE_NAME = "HASHTABLE-ITERATOR";

	private Iterator iter;
	private Map.Entry entry;

	SubLHashtableIterator(SubLHashtable hashTable) {
		this.iter = hashTable.getEntrySetIterator();
		this.next();
	}

	public boolean canFastHash() {
		return true;
	}

	public void clear() {
		this.iter = null;
		this.entry = null;
	}

	public SubLObject getCurrentKey() {
		return (SubLObject) this.entry.getKey();
	}

	public SubLObject getCurrentValue() {
		return (SubLObject) this.entry.getValue();
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return this.iter.hashCode();
		return 0;
	}

	public boolean hasNext() {
		return this.entry != null;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return true;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public Object next() {
		if (this.iter.hasNext())
			this.entry = (Entry) this.iter.next();
		else
			this.entry = null;
		return this.entry;
	}

	public SubLHashtableIterator toHashtableIterator() {
		return this;
	}

	public String toString() {
		return "#<" + this.toTypeName() + " @ " + super.toString() + ">";
	}

	public String toTypeName() {
		return "HASHTABLE-ITERATOR";
	}
}
