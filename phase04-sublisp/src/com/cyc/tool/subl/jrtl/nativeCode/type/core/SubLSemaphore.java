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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

//// Internal Imports

//// External Imports

public  class SubLSemaphore extends AbstractSubLObject implements SubLObject {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  /** Creates a new instance of SubLSemaphore. */
  SubLSemaphore(SubLString name) {
    this(name, 1);
  }
  /** Creates a new instance of SubLSemaphore. */
  SubLSemaphore(SubLString name, int count) {
    sem = new Semaphore(count);
    this.name = name;
  }
  //// Public Area
  public boolean canFastHash() {
    return true;
  }
  public int hashCode(int depth) {
    return sem.hashCode();
  }
  public static String SEMAPHORE_TYPE_NAME = "SEMAPHORE";
  public static SubLSymbol SEMAPHORE_TYPE_SYMBOL = 
    SubLSymbolFactory.makeSymbol(SEMAPHORE_TYPE_NAME, SubLPackage.SUBLISP_PACKAGE);
  public String toTypeName() {
    return SEMAPHORE_TYPE_NAME;
  }
  public SubLSymbol getType(){
    return SEMAPHORE_TYPE_SYMBOL;
  }
  public SubLFixnum getTypeCode() {
    // @todo we need to define a *DTP* number for these objects
    Errors.unimplementedMethod("SubLSemaphore.getTypeCode()");
    return CommonSymbols.ZERO_INTEGER;
  }
  public String toString() {
    return "#<" + toTypeName() + " \"" + getName() + "\" Permits(" + sem.availablePermits() + ") @ " + hashCode(0) + ">";
  }
  public String getName() {
    return name.getString();
  }
  public SubLString getSubLName() {
    return name;
  }
 
  public int getCount() {
    return sem.availablePermits();
  }
  public void acquire() {
    acquire(1);
  }
  public void acquire(int count) {
    while (true) {
      try {
        sem.acquire(count);
        break;
      } catch (InterruptedException e) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }

  public boolean acquireWithTimeout(long msecs) {
    return acquireWithTimeout(1, msecs);
  }

  public boolean acquireWithTimeout(int count, long msecs) {
    while (true) {
      try {
        return sem.tryAcquire(count, msecs, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }
  public boolean acquireNonBlocking() {
    return acquireNonBlocking(1);
  }
  public boolean acquireNonBlocking(int count) {
    return sem.tryAcquire(count);
  }

  public int drain() {
    return sem.drainPermits();
  }
  public void release() {
    release(1);
  }
  public void release(int count) {
    sem.release(count);
  }
  public SubLSemaphore toSemaphore() { return this; }
 
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
  public boolean isLock() { return false; }
  public boolean isReadWriteLock() { return false; }
  public boolean isStructure() { return false; }
  public boolean isStream() { return false; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return true; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  //// Protected Area
  //// Private Area
  private Semaphore sem;
  private SubLString name;

  //// Internal Rep
}
