//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.ObjectPool;

public class Resourcer extends RuntimeException implements CommonSymbols {
	private static class ArrayListPool extends ObjectPool {
		public static int DEFAULT_SIZE = 8192;

		ArrayListPool() {
			super(16);
		}

		public Object makePoolItem() {
			return new ArrayList(8192);
		}

		public void resetPoolItem(Object item) {
			((ArrayList) item).clear();
		}
	}

	private static class HashtableKeyEntryPool extends ObjectPool {
		HashtableKeyEntryPool() {
			super(16);
		}

		public Object makePoolItem() {
			return new SubLHashtable.SubLHashtableKeyEntryImpl();
		}

		public void resetPoolItem(Object item) {
			((SubLHashtable.SubLHashtableKeyEntry) item).clear();
		}
	}

	static class ObjectArrayObjectPool extends ObjectPool {
		public static int MAX_ARRAY_SIZE = 24;

		private int arraySize;

		ObjectArrayObjectPool(int size) {
			super(32);
			this.arraySize = size;
		}

		public Object makePoolItem() {
			return new Object[this.arraySize];
		}

		public void resetPoolItem(Object item) {
			Arrays.fill((Object[]) item, (Object) null);
		}
	}

	private static class StringBuilderPool extends ObjectPool {
		public static int DEFAULT_SIZE = 8192;

		StringBuilderPool(int size) {
			super(16);
		}

		public Object makePoolItem() {
			return new StringBuilder(8192);
		}

		public void resetPoolItem(Object item) {
			((StringBuilder) item).setLength(0);
		}
	}

	private static class SubLArrayListListIteratorObjectPool extends ObjectPool {

		public Object makePoolItem() {
			return new SubLArrayListListIterator();
		}

		public void resetPoolItem(Object item) {
			((SubLListListIterator) item).reset();
		}
	}

	private static class SubLConsListListIteratorObjectPool extends ObjectPool {

		public Object makePoolItem() {
			return new SubLConsListListIterator();
		}

		public void resetPoolItem(Object item) {
			((SubLListListIterator) item).reset();
		}
	}

	static class SubLObjectArrayObjectPool extends ObjectPool {
		public static int MAX_ARRAY_SIZE = 24;

		private int arraySize;

		SubLObjectArrayObjectPool(int size) {
			super(32);
			this.arraySize = size;
		}

		public Object makePoolItem() {
			return new SubLObject[this.arraySize];
		}

		public void resetPoolItem(Object item) {
			Arrays.fill((Object[]) item, (Object) null);
		}
	}

	public static Object[] EMPTY_OBJECT_ARRAY;

	public static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;

	static {
		Resourcer.EMPTY_OBJECT_ARRAY = new Object[0];
		Resourcer.EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
	}

	public static Resourcer getInstance() {
		return SubLProcess.currentSubLThread().getResourcer();
	}

	private ObjectPool sublArrayListListIteratorPool;
	private ObjectPool sublConsListListIteratorPool;
	private ObjectPool hashtableKeyEntryPool;
	private ObjectPool[] objectArrayObjectPools;
	private ObjectPool[] sublObjectArrayObjectPools;

	public Resourcer() {
		this.sublArrayListListIteratorPool = new SubLArrayListListIteratorObjectPool().init();
		this.sublConsListListIteratorPool = new SubLConsListListIteratorObjectPool().init();
		this.hashtableKeyEntryPool = new HashtableKeyEntryPool().init();
		this.objectArrayObjectPools = new ObjectArrayObjectPool[24];
		this.sublObjectArrayObjectPools = new SubLObjectArrayObjectPool[24];
		for (int i = 0, size = 24; i < size; ++i)
			this.objectArrayObjectPools[i] = new ObjectArrayObjectPool(i).init();
		for (int i = 0, size = 24; i < size; ++i)
			this.sublObjectArrayObjectPools[i] = new SubLObjectArrayObjectPool(i).init();
	}

	public SubLHashtable.SubLHashtableKeyEntryImpl acquireHashtableKeyEntry() {
		SubLHashtable.SubLHashtableKeyEntryImpl keyEntry = (SubLHashtable.SubLHashtableKeyEntryImpl) this.hashtableKeyEntryPool
				.acquire();
		return keyEntry;
	}

	public Object[] acquireObjectArray(int size) {
		if (size >= 24)
			return new Object[size];
		return (Object[]) this.objectArrayObjectPools[size].acquire();
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list) {
		return this.acquireSubLListListIterator(list, 0, -1);
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list, int start) {
		return this.acquireSubLListListIterator(list, start, list == null ? 0 : -1);
	}

	public SubLListListIterator acquireSubLListListIterator(SubLList list, int start, int end) {
		SubLListListIterator iter = null;
		if (list.isArrayBased())
			iter = (SubLListListIterator) this.sublArrayListListIteratorPool.acquire();
		else
			iter = (SubLListListIterator) this.sublConsListListIteratorPool.acquire();
		iter.init(list, start, end);
		return iter;
	}

	public SubLObject[] acquireSubLObjectArray(ArrayList<SubLObject> list) {
		if (list == null || list.size() <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		int size = list.size();
		SubLObject[] result;
		if (size >= 24)
			result = new SubLObject[size];
		else
			result = (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
		return list.toArray(result);
	}

	public SubLObject[] acquireSubLObjectArray(int size) {
		if (size <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		if (size >= 24)
			return new SubLObject[size];
		return (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
	}

	public SubLObject[] acquireSubLObjectArray(SubLList list) {
		if (list == null || list.size() <= 0)
			return Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
		int size = list.size();
		SubLObject[] result;
		if (size >= 24)
			result = new SubLObject[size];
		else
			result = (SubLObject[]) this.sublObjectArrayObjectPools[size].acquire();
		return (SubLObject[]) list.toArray(result);
	}

	public void releaseHashtableKeyEntry(SubLHashtable.SubLHashtableKeyEntry keyEntry) {
		if (keyEntry != null)
			this.hashtableKeyEntryPool.release(keyEntry);
	}

	public void releaseObjectArray(Object[] array) {
		if (array == null)
			return;
		if (array.length >= 24)
			return;
		this.objectArrayObjectPools[array.length].release(array);
	}

	public void releaseSubLListListIterator(SubLListListIterator iter) {
		if (iter == null)
			return;
		if (iter.isArrayBased())
			this.sublArrayListListIteratorPool.release(iter);
		else
			this.sublConsListListIteratorPool.release(iter);
	}

	public void releaseSubLObjectArray(SubLObject[] array) {
		if (array == null)
			return;
		if (array.length == 0)
			return;
		if (array.length >= 24)
			return;
		this.sublObjectArrayObjectPools[array.length].release(array);
	}
}
