//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Locks implements SubLFile {
	public static SubLFile me;

	static {
		Locks.me = new Locks();
	}

	public static SubLObject lock_idle_p(SubLObject lock) {
		if (lock.toLock().isIdle())
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject lock_locker(SubLObject lock) {
		SubLObject locker = lock.toLock().getLocker();
		if (locker == null)
			return CommonSymbols.NIL;
		return locker;
	}

	public static SubLObject lock_name(SubLObject lock) {
		return lock.toLock().getName();
	}

	public static SubLObject make_lock(SubLObject name) {
		return SubLObjectFactory.makeLock(name.toStr());
	}

	public static SubLObject release_lock(SubLObject lock) {
		lock.toLock().releaseLock();
		return lock;
	}

	public static SubLObject seize_lock(SubLObject lock) {
		lock.toLock().seizeLock();
		return lock;
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Locks.me, "make_lock", "MAKE-LOCK", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_name", "LOCK-NAME", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_locker", "LOCK-LOCKER", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "lock_idle_p", "LOCK-IDLE-P", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "seize_lock", "SEIZE-LOCK", 1, 0, false);
		SubLFiles.declareFunction(Locks.me, "release_lock", "RELEASE-LOCK", 1, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}
