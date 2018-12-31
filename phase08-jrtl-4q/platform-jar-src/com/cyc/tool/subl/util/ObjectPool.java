//
//
package com.cyc.tool.subl.util;

import java.util.ArrayList;

public abstract class ObjectPool {
	private static int DEFAULT_POOL_SIZE = 64;

	private ArrayList<Object> pool;

	private int currentCapacity;
	private boolean isInitialized;

	public ObjectPool() {
		this(64);
	}

	public ObjectPool(int initialSize) {
		this.pool = new ArrayList<Object>();
		this.isInitialized = false;
		this.pool = new ArrayList<Object>(initialSize);
		this.currentCapacity = initialSize;
	}

	public Object acquire() {
		this.init();
		int size = this.pool.size();
		if (size == 0) {
			int previousCapacity = this.currentCapacity;
			this.currentCapacity = this.currentCapacity * 3 / 2 + 1;
			this.pool.ensureCapacity(this.currentCapacity);
			for (int i = 0, curSize = this.currentCapacity - previousCapacity; i < curSize; ++i) {
				Object obj = this.makePoolItem();
				this.pool.add(obj);
			}
			size = this.pool.size();
		}
		Object result = this.pool.remove(size - 1);
		return result;
	}

	public ObjectPool init() {
		if (!this.isInitialized) {
			for (int i = 0; i < this.currentCapacity; ++i) {
				Object obj = this.makePoolItem();
				this.pool.add(obj);
			}
			this.isInitialized = true;
		}
		return this;
	}

	public abstract Object makePoolItem();

	public void release(Object item) {
		this.resetPoolItem(item);
		this.pool.add(item);
	}

	public abstract void resetPoolItem(Object p0);
}
