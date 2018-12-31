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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntry;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLHashtableKeyEntryImpl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable.SubLKeyEntryFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

//// Internal Imports

//// External Imports

public  class SubLKeyhash extends AbstractSubLObject implements SubLObject {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash() {
    this(128, BinaryFunction.EQL_TEST);
  }
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash(int size) {
    this(size, BinaryFunction.EQL_TEST);
  }
  /** Creates a new instance of SubLHashtable. */
  SubLKeyhash(int size, BinaryFunction test) {
    hash = new HashSet<SubLObject>((int)(size*1.5) + 1);
    this.test = test;
    if (test == BinaryFunction.EQ_TEST) { 
      keyFactory = SubLHashtable.EQ_KEY_FACTORY;
    } else if (test == BinaryFunction.EQL_TEST) {
      keyFactory = SubLHashtable.EQL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUAL_TEST) {
      keyFactory = SubLHashtable.EQUAL_KEY_FACTORY;
    } else if (test == BinaryFunction.EQUALP_TEST) {
      keyFactory = SubLHashtable.EQUALP_KEY_FACTORY;
    } else {
      Errors.error("Got non-equality test for hashtable: " + test);
      keyFactory = null;
    }
  }
  //// Public Area
  public SubLList toSubLList() {
    SubLList result = SubLNil.NIL;
    SubLObject[] values = (SubLObject[])hash.toArray(new SubLObject[hash.size()]);
    for (int i = 0, size = values.length; i < size; i++) {
      result = result.push(values[i]);
    }
    return SubLNil.NIL;
  }
  public SubLList toSubLVector() {
    SubLList result = SubLNil.NIL;
    SubLObject[] values = (SubLObject[])hash.toArray(new SubLObject[hash.size()]);
    for (int i = 0, size = values.length; i < size; i++) {
      result = result.push(values[i]);
    }
    return SubLNil.NIL;
  }
  public SubLSymbol getType(){ 
    return Types.$dtp_keyhash$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.ONE_HUNDRED_THIRTY_SEVEN_INTEGER;
  }
  public boolean canFastHash() {
    return false;
  }
  public static String KEYHASH_TYPE_NAME = "KEYHASH";
  public String toTypeName() {
    return KEYHASH_TYPE_NAME;
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return 0; // @hack
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public String toString() {
    return "#<" + test.getFunction().getFunctionSymbol() + " " + toTypeName() + " with " + size()
    + " entries @ " + super.toString() + ">";
  }
  public String toStringComplete() {
    return toString();
  }
  public BinaryFunction getTest() {
    return test;
  }
  public void clear() {
    hash.clear();
  }
  public boolean hasKey(SubLObject obj) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = ((SubLThread)Thread.currentThread()).hashtableEqKeyEntry;
      key.init(obj);
      return hash.contains(key);
    } else if (obj.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(obj);
      return hash.contains(key);
    } else {
      SubLHashtableKeyEntryImpl key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(obj, test);
        return hash.contains(key);
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
    }
  }
  public java.util.Set entrySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.entrySet()");
    return null;
  }
  public boolean isEmpty() {
    return hash.isEmpty();
  }
  public java.util.Set keySet() {
    // @note we'll need to unpack keys before returning them. --APB
    Errors.unimplementedMethod("SubLHashtable.keySet()");
    return null;
  }
  public void addKey(SubLObject key) {
    hash.add(key);
  }
  public void putAll(Map map) {
    // @note we'll need to box keys before storing them. --APB
    Errors.unimplementedMethod("SubLHashtable.putAll()");
  }
  public boolean remKey(SubLObject obj) {
    if (test == BinaryFunction.EQ_TEST) {
      SubLHashtableKeyEntry key = SubLProcess.currentSubLThread().hashtableEqKeyEntry;
      key.init(obj);
      return hash.remove(key);
    } else if (obj.canFastHash()) {
      SubLHashtableKeyEntry key = keyFactory.makeKeyEntry();
      key.init(obj);
      return hash.remove(key);
    } else {
      SubLHashtableKeyEntryImpl key = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        key = resourcer.acquireHashtableKeyEntry();
        key.init(obj, test);
        return hash.remove(key);
      } finally {
        resourcer.releaseHashtableKeyEntry(key);
      }
    }
  }
  public int size() {
    return hash.size();
  }
  public int getCurrentCapacity() {
    return (int)(hash.size() * 1.30) + 1; //@hack
  }
  public Iterator<SubLObject> getEntrySetIterator() {
    return hash.iterator();
  }
  /** Method created to avoid casting */
  public SubLKeyhash toKeyhash() { // SubLKeyhash
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
  public boolean isHashtableIterator() { return false; }
  public boolean isKeyhhashIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return true; }
  public boolean isKeyhashIterator() { return false; }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private BinaryFunction test;
  private HashSet<SubLObject> hash;
  private SubLKeyEntryFactory keyFactory;
}
