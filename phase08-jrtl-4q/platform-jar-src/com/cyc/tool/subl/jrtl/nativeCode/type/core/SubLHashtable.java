//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLHashtable extends AbstractSubLObject implements SubLObject {
	public static class SubLEqHashtableKeyEntryImpl extends AbstractSubLObject implements SubLHashtableKeyEntry {
		private SubLObject key;

		public boolean canFastHash() {
			return this.key.canFastHash();
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key == obj;
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode(int currentDepth) {
			return this.key.hashCode(currentDepth);
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqlHashtableKeyEntryImpl extends AbstractSubLObject implements SubLHashtableKeyEntry {
		private SubLObject key;

		public boolean canFastHash() {
			return this.key.canFastHash();
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.eql((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode(int currentDepth) {
			return this.key.hashCode(currentDepth);
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqualHashtableKeyEntryImpl extends AbstractSubLObject implements SubLHashtableKeyEntry {
		private SubLObject key;

		public boolean canFastHash() {
			return this.key.canFastHash();
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.equal((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode(int currentDepth) {
			return this.key.hashCode(currentDepth);
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public static class SubLEqualpHashtableKeyEntryImpl extends AbstractSubLObject implements SubLHashtableKeyEntry {
		private SubLObject key;

		public boolean canFastHash() {
			return this.key.canFastHash();
		}

		public void clear() {
			this.key = null;
		}

		public boolean equals(Object obj) {
			return this.key.equalp((SubLObject) obj);
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode(int currentDepth) {
			return this.key.hashCode(currentDepth);
		}

		public void init(SubLObject key) {
			this.key = key;
		}

		public void init(SubLObject key, BinaryFunction test) {
			Errors.error("Ugh.");
		}

		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	public interface SubLHashtableKeyEntry extends SubLObject {
		void clear();

		SubLObject getKey();

		void init(SubLObject p0);

		void init(SubLObject p0, BinaryFunction p1);
	}

	public static class SubLHashtableKeyEntryImpl extends AbstractSubLObject implements SubLHashtableKeyEntry {
		private SubLObject key;
		private BinaryFunction test;

		public boolean canFastHash() {
			return this.key.canFastHash();
		}

		public void clear() {
			this.key = null;
			this.test = null;
		}

		public boolean equals(Object obj) {
			boolean result = SubLNil.NIL != this.test.processItem(this.key, (SubLObject) obj);
			return result;
		}

		public SubLObject getKey() {
			return this.key;
		}

		public int hashCode(int currentDepth) {
			return this.key.hashCode(currentDepth);
		}

		public void init(SubLObject key) {
			Errors.error("Ugh.");
		}

		public void init(SubLObject key, BinaryFunction test) {
			this.key = key;
			this.test = test;
		}

		public boolean isAlien() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isAtom() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBigIntegerBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isBoolean() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isChar() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isCons() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isDouble() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isEnvironment() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isError() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFixnum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunction() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isFunctionSpec() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isGuid() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtable() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isHashtableIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isIntBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isInteger() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhash() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyhashIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isKeyword() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isList() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isLongBignum() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isMacroOperator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNil() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isNumber() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackage() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isPackageIterator() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isProcess() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isReadWriteLock() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isRegexPattern() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSemaphore() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSequence() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStream() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isString() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isStructure() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isSymbol() {
			throw new UnsupportedOperationException("Not supported yet.");
		}

		public boolean isVector() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	interface SubLKeyEntryFactory {
		SubLHashtableKeyEntry makeKeyEntry();
	}

	public static String HASHTABLE_TYPE_NAME = "HASHTABLE";

	static SubLKeyEntryFactory EQ_KEY_FACTORY;

	static SubLKeyEntryFactory EQL_KEY_FACTORY;

	static SubLKeyEntryFactory EQUAL_KEY_FACTORY;
	static SubLKeyEntryFactory EQUALP_KEY_FACTORY;
	static {
		SubLHashtable.EQ_KEY_FACTORY = new SubLKeyEntryFactory() {

			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			}
		};
		SubLHashtable.EQL_KEY_FACTORY = new SubLKeyEntryFactory() {

			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqlKeyEntry;
			}
		};
		SubLHashtable.EQUAL_KEY_FACTORY = new SubLKeyEntryFactory() {

			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqualKeyEntry;
			}
		};
		SubLHashtable.EQUALP_KEY_FACTORY = new SubLKeyEntryFactory() {

			public SubLHashtableKeyEntry makeKeyEntry() {
				return SubLProcess.currentSubLThread().hashtableEqualpKeyEntry;
			}
		};
	}
	private BinaryFunction test;
	private Map<SubLObject, SubLObject> hash;
	private SubLKeyEntryFactory keyFactory;

	SubLHashtable() {
		this(128, BinaryFunction.EQL_TEST);
	}

	SubLHashtable(int size) {
		this(size, BinaryFunction.EQL_TEST);
	}

	SubLHashtable(int size, BinaryFunction test) {
		this.hash = ConcurrentSubLHashtableFactory.factory.createMap((int) (size * 1.5) + 1);
		this.test = test;
		if (test == BinaryFunction.EQ_TEST)
			this.keyFactory = SubLHashtable.EQ_KEY_FACTORY;
		else if (test == BinaryFunction.EQL_TEST)
			this.keyFactory = SubLHashtable.EQL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUAL_TEST)
			this.keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
		else if (test == BinaryFunction.EQUALP_TEST)
			this.keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
		else {
			Errors.error("Got non-equality test for hashtable: " + test);
			this.keyFactory = null;
		}
	}

	public boolean canFastHash() {
		return false;
	}

	public void clear() {
		this.hash.clear();
	}

	public boolean containsKey(Object obj) {
		SubLHashtableKeyEntryImpl key = null;
		try {
			key = Resourcer.getInstance().acquireHashtableKeyEntry();
			key.init((SubLObject) obj, this.test);
			boolean result = this.hash.containsKey(key);
			return result;
		} finally {
			Resourcer.getInstance().releaseHashtableKeyEntry(key);
		}
	}

	public boolean containsValue(Object obj) {
		return this.hash.containsValue(obj);
	}

	public Set entrySet() {
		Errors.unimplementedMethod("SubLHashtable.entrySet()");
		return null;
	}

	public SubLObject get(SubLObject obj) {
		if (this.test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return this.hash.get(key);
		}
		if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = this.keyFactory.makeKeyEntry();
			key.init(obj);
			return this.hash.get(key);
		}
		SubLHashtableKeyEntryImpl key2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			key2 = resourcer.acquireHashtableKeyEntry();
			key2.init(obj, this.test);
			return this.hash.get(key2);
		} finally {
			resourcer.releaseHashtableKeyEntry(key2);
		}
	}

	public int getCurrentCapacity() {
		return (int) (this.hash.size() * 1.3) + 1;
	}

	public Iterator getEntrySetIterator() {
		return this.hash.entrySet().iterator();
	}

	public BinaryFunction getTest() {
		return this.test;
	}

	public SubLSymbol getType() {
		return Types.$dtp_hash_table$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.NINE_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return 0;
		return 0;
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

	public boolean isEmpty() {
		return this.hash.isEmpty();
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
		return true;
	}

	public boolean isHashtableIterator() {
		return false;
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

	public Set keySet() {
		Errors.unimplementedMethod("SubLHashtable.keySet()");
		return null;
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		if (this.test == BinaryFunction.EQUALP_TEST) {
			boolean knownKey = this.containsKey(key);
			if (knownKey)
				this.remove(key);
			return this.hash.put(key, value);
		}
		return this.hash.put(key, value);
	}

	public void putAll(Map map) {
		Errors.unimplementedMethod("SubLHashtable.putAll()");
	}

	public SubLObject remove(SubLObject obj) {
		if (this.test == BinaryFunction.EQ_TEST) {
			SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
			key.init(obj);
			return this.hash.remove(key);
		}
		if (obj.canFastHash()) {
			SubLHashtableKeyEntry key = this.keyFactory.makeKeyEntry();
			key.init(obj);
			return this.hash.remove(key);
		}
		SubLHashtableKeyEntryImpl key2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			key2 = resourcer.acquireHashtableKeyEntry();
			key2.init(obj, this.test);
			return this.hash.remove(key2);
		} finally {
			resourcer.releaseHashtableKeyEntry(key2);
		}
	}

	public int size() {
		return this.hash.size();
	}

	public SubLHashtable toHashtable() {
		return this;
	}

	public String toString() {
		return "#<HASH-TABLE " + this.test.getFunction().getFunctionSymbol() + " " + this.toTypeName() + " with "
				+ this.size() + " entries @ " + super.toString() + ">";
	}

	public String toStringComplete() {
		return this.toString();
	}

	public String toTypeName() {
		return "HASHTABLE";
	}

	public Collection values() {
		return this.hash.values();
	}
}
