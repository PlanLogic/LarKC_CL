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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public  class SubLHashtableIterator extends AbstractSubLObject {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  /** Creates a new instance of SubLHashtableIterator. */
  SubLHashtableIterator(SubLHashtable hashTable) {
    iter = hashTable.getEntrySetIterator();
    next();
  }
  //// Public Area
  public static String HASHTABLE_ITERATOR_TYPE_NAME = "HASHTABLE-ITERATOR";
  public String toTypeName() {
    return HASHTABLE_ITERATOR_TYPE_NAME;
  }
  public String toString() {
    return "#<" + toTypeName() + " @ " + super.toString() + ">";
  }
  public boolean hasNext() {
    return entry != null;
  }
  public Object next() {
    if (iter.hasNext()) {
      entry = (Map.Entry)iter.next();
    } else {
      entry = null;
    }
    return entry;
  }
  public SubLObject getCurrentKey() {
    return (SubLObject)entry.getKey();
  }
  public SubLObject getCurrentValue() {
    return (SubLObject)entry.getValue();
  }
  public void clear() {
    iter = null;
    entry = null;
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return iter.hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public boolean canFastHash() {
    return true;
  }
  /** Method created to avoid casting */
  public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
    return this;
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
  public boolean isLock() { return false; }
  public boolean isReadWriteLock() { return false; }
  public boolean isStructure() { return false; }
  public boolean isStream() { return false; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return true; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private Iterator iter;
  private Map.Entry entry;
  //// Main
}
