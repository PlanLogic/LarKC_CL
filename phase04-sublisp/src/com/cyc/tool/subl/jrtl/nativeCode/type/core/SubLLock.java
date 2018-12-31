/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.concurrent.locks.ReentrantLock;

//// Internal Imports

//// External Imports

public  class SubLLock extends AbstractSubLObject implements SubLObject {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  /** Creates a new instance of SubLLock. */
  SubLLock(SubLString name) {
    this.name = name;
  }
  //// Public Area
  /** Method created to avoid casting */
  public SubLLock toLock() { // SubLLock
    return this;
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return lock.hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public boolean canFastHash() {
    return true;
  }
  public String toString() {
    return "#<" + LOCK_TYPE_NAME + " " + getName() + " @ " + hashCode(0) + ">";
  }
  public static String LOCK_TYPE_NAME = "LOCK";
  public String toTypeName() {
    return LOCK_TYPE_NAME;
  }
  public SubLString getName() {
    return name;
  }
  public boolean isIdle() {
    return !lock.isLocked();
  }
  public SubLProcess getLocker() {
    Thread thread = lock.getLockOwner();
    if (thread == null) {
      return null;
    }
    if (!(thread instanceof SubLThread)) {
      Errors.error("SubLLock " + toString() + " held by non-SubLThread " + thread);
    }
    return ((SubLThread)thread).getSubLProcess();
  }

  public void seizeLock() {
    while (true) {
      try {
        lock.lockInterruptibly();
        break;
      } catch (InterruptedException ie) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }

  public void releaseLock() {
    lock.unlock();
  }
  public SubLSymbol getType(){
    return Types.$dtp_lock$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.FIFTEEN_INTEGER;
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return false; }
  public boolean isKeyword() { return false; }
  public boolean isAtom() { return true; }
  public boolean isCons() { return false; }
  public boolean isList() { return false; }
  public boolean isSequence() { return false; }
  public boolean isNumber() { return false; }
  public boolean isFixnum() { return false; }
  public boolean isBignum() { return false; }
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return false; }
  public boolean isInteger() { return false; }
  public boolean isDouble() { return false; }
  public boolean isChar() { return false; }
  public boolean isString() { return false; }
  public boolean isVector() { return false; }
  public boolean isFunction() { return false; }
  public boolean isFunctionSpec() { return false; }
  public boolean isMacroOperator() { return false; }
  public boolean isHashtable() { return false; }
  public boolean isProcess() { return false; }
  public boolean isLock() { return true; }
  public boolean isReadWriteLock() { return false; }
  public boolean isStructure() { return false; }
  public boolean isStream() { return false; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private SubLString name;
  private MyReentrantLock lock = new MyReentrantLock();

  public static class MyReentrantLock extends ReentrantLock {
    public Thread getLockOwner() {
      return getOwner();
    };
  }

  private static boolean DO_LOCKING_CHECKS = false;
}
