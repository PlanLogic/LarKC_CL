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

package  com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractString;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import java.math.*;

//// External Imports

public  abstract class AbstractSubLNumber
    extends Number
    implements SubLNumber, SubLObject, Comparable, CommonSymbols, LispObject {
  //// Constructors
  /** Creates a new instance of SubLInteger. */
  AbstractSubLNumber() {}
  //// Public Area
  public int hashCode() {
    return hashCode(0);
  }
  public int superHash() {
    return super.hashCode();
  }
  public Object clone() {
    return this;
  }
  public SubLObject makeCopy() {
    return this;
  }
  public SubLObject makeDeepCopy() {
    return this;
  }
  public String toString() {
    return getNativeNumber().toString();
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return getNativeNumber().hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public BigInteger bigIntegerValue() {
    return new BigInteger(toString());
  }
  public SubLObject eval(SubLEnvironment env) {
    return this;
  }
  public boolean equals(Object obj) {
    if (!(obj instanceof SubLObject)) { return false; }
    return eql((SubLObject)obj);
  }
  public boolean eql(SubLObject obj) {
    if (!obj.isNumber()) { return false; }
    if (isFixnum() && obj.isFixnum()) {
      return intValue() == obj.intValue();
    } else if (isDouble() || obj.isDouble()) {
      return doubleValue() == obj.doubleValue();
    } else if (isBigIntegerBignum()) {
      return equals(obj);
    } else if (obj.isBigIntegerBignum()) {
      return ((SubLBigIntBignum)obj).equals(this);
    } else if (isLongBignum() || obj.isLongBignum()) {
      return longValue() == obj.longValue();
    }
    return this.intValue() == obj.intValue();
  }
  public int compareTo(Object o) {
    SubLNumber num = (SubLNumber)o;
    if (num.isBigIntegerBignum() || isBigIntegerBignum()) {
      return bigIntegerValue().compareTo(num.bigIntegerValue());
    }  else if (num.isDouble() || isDouble()){
      double a = doubleValue();
      double b = num.doubleValue();
      return a < b ? -1 : (a > b ? 1 : 0);
    } else if (num.isLongBignum() || isLongBignum()) {
      long a = longValue();
      long b = num.longValue();
      return a < b ? -1 : (a > b ? 1 : 0);
    } else {
      int a = intValue();
      int b = num.intValue();
      return a < b ? -1 : (a > b ? 1 : 0);      
    }
  }
  // @todo add NumericCompareDesc idiom here
  
  /** Method created to avoid casting */
  public boolean numL(SubLObject num) { // SubLNumber
    if (getNumSize() >= num.getNumSize()) {
      return lessThanInternal(num);
    } else {
      return num.toNumber().greaterThanInternal(this);
    }
  }
  /** Method created to avoid casting */
  public boolean numLE(SubLObject num) { // SubLNumber
    if (getNumSize() >= num.getNumSize()) {
      return lessThanOrEqualInternal(num);
    } else {
      return num.toNumber().greaterThanOrEqualInternal(this);
    }
  }
  /** Method created to avoid casting */
  public boolean numG(SubLObject num) { // SubLNumber
    if (getNumSize() >= num.getNumSize()) {
      return greaterThanInternal(num);
    } else {
      return num.toNumber().lessThanInternal(this);
    }
  }
  /** Method created to avoid casting */
  public boolean numGE(SubLObject num) { // SubLNumber
    if (getNumSize() >= num.getNumSize()) {
      return greaterThanOrEqualInternal(num);
    } else {
      return num.toNumber().lessThanOrEqualInternal(this);
    }
  }
  /** Method created to avoid casting */
  public boolean numE(SubLObject num) { // SubLNumber
    if (getNumSize() >= num.getNumSize()) {
      return numericallyEqualInternal(num);
    } else {
      return num.toNumber().numericallyEqualInternal(this);
    }
  }
  public SubLNumber max(SubLNumber num) {
    return numL(num) ? num : this;
  }
  public SubLNumber min(SubLNumber num) {
    return numL(num) ? this : num;
  }
  public SubLNumber add(SubLNumber num) {
    Errors.unimplementedMethod("AbstractSubLNumber.add");
    return null;
  }
  public SubLNumber subtract(SubLNumber num) {
    Errors.unimplementedMethod("AbstractSubLNumber.subtract");
    return null;
  }
  public SubLNumber multiply(SubLNumber num) {
    Errors.unimplementedMethod("AbstractSubLNumber.multiply");
    return null;
  }
  public SubLNumber divide(SubLNumber num) {
    Errors.unimplementedMethod("AbstractSubLNumber.divide");
    return null;
  }
  public SubLNumber increment() {
    Errors.unimplementedMethod("AbstractSubLNumber.increment");
    return null;
  }
  public SubLNumber increment(SubLNumber incrementSize) {
    Errors.unimplementedMethod("AbstractSubLNumber.increment");
    return null;
  }
  public SubLNumber decrement() {
    Errors.unimplementedMethod("AbstractSubLNumber.decrement");
    return null;
  }
  public SubLNumber decrement(SubLNumber decrementSize) {
    Errors.unimplementedMethod("AbstractSubLNumber.decrement");
    return null;
  }
  public SubLNumber pow(SubLNumber power) {
    Errors.unimplementedMethod("AbstractSubLNumber.pow");
    return null;
  }
  public SubLNumber log() {
    Errors.unimplementedMethod("AbstractSubLNumber.log");
    return null;
  }
  public SubLNumber log(SubLNumber base) {
    Errors.unimplementedMethod("AbstractSubLNumber.log");
    return null;
  }
  public SubLNumber sqrt(SubLNumber num) {
    Errors.unimplementedMethod("AbstractSubLNumber.sqrt");
    return null;
  }
  public SubLNumber abs() {
    Errors.unimplementedMethod("AbstractSubLNumber.abs");
    return null;
  }
  public SubLNumber sigNum() {
    Errors.unimplementedMethod("AbstractSubLNumber.sigNum");
    return null;
  }
  public SubLNumber sine() {
    Errors.unimplementedMethod("AbstractSubLNumber.sine");
    return null;
  }
  public SubLNumber cosine() {
    Errors.unimplementedMethod("AbstractSubLNumber.cosine");
    return null;
  }
  public SubLNumber tangent() {
    Errors.unimplementedMethod("AbstractSubLNumber.tangent");
    return null;
  }
  public SubLNumber arcSine() {
    Errors.unimplementedMethod("AbstractSubLNumber.arcSine");
    return null;
  }
  public SubLNumber arcCosine() {
    Errors.unimplementedMethod("AbstractSubLNumber.arcCosine");
    return null;
  }
  public SubLNumber arcTangent() {
    Errors.unimplementedMethod("AbstractSubLNumber.arcTangent");
    return null;
  }
  public SubLNumber hyperbolicSine() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicSine");
    return null;
  }
  public SubLNumber hyperbolicCosine() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicCosine");
    return null;
  }
  public SubLNumber hyperbolicTangent() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicTangent");
    return null;
  }
  public SubLNumber hyperbolicArcSine() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcSine");
    return null;
  }
  public SubLNumber hyperbolicArcCosine() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcCosine");
    return null;
  }
  public SubLNumber hyperbolicArcTangent() {
    Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcTangent");
    return null;
  }
  public SubLInteger floor() {
    Errors.unimplementedMethod("AbstractSubLNumber.floor");
    return null;
  }
  public SubLInteger ceiling() {
    Errors.unimplementedMethod("AbstractSubLNumber.ceiling");
    return null;
  }
  public SubLInteger truncate() {
    Errors.unimplementedMethod("AbstractSubLNumber.truncate");
    return null;
  }
  public SubLInteger round() {
    Errors.unimplementedMethod("AbstractSubLNumber.round");
    return null;
  }
  public SubLFloat ffloor() {
    Errors.unimplementedMethod("AbstractSubLNumber.ffloor");
    return null;
  }
  public SubLFloat fceiling() {
    Errors.unimplementedMethod("AbstractSubLNumber.fceiling");
    return null;
  }
  public SubLFloat ftruncate() {
    Errors.unimplementedMethod("AbstractSubLNumber.ftruncate");
    return null;
  }
  public SubLFloat fround() {
    Errors.unimplementedMethod("AbstractSubLNumber.fround");
    return null;
  }
  public SubLInteger mod(SubLNumber divisor) {
    Errors.unimplementedMethod("AbstractSubLNumber.mod");
    return null;
  }
  public SubLInteger remainder(SubLNumber divisor) {
    Errors.unimplementedMethod("AbstractSubLNumber.remainder");
    return null;
  }
  // @todo get rid of duplication with AbstractSubLObject -APB
  public void checkType(SubLSymbol predicate) throws SubLException {
    // @todo make this the same as SubL -- problably should look up a symbol value -APB
    if (SubLObject.DO_CHECK_TYPES) {
      enforceType(predicate);
    }
  }
  // @todo get rid of duplication with AbstractSubLObject -APB
  public void enforceType(SubLSymbol predicate) throws SubLException {
    // @todo make special case unary filter functions for SubL predicates
    // They should be created and initialized in UnaryFunction -APB
    UnaryFunction Function = UnaryFunction.makeInstance(predicate);
    if (SubLNil.NIL == Function.processItem(this)) {
      Errors.error("Got invalid type for object: " + this + "."
          + "\nWanted: " + predicate + "\nGot: " + toTypeName());
    }
  }
  
  public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
    if (SubLObject.DO_PARANOID_TYPE_CHECKING && SubLObject.DO_CHECK_TYPES) {
      enforceType(predicate);
    }
  }
  public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
    if (SubLObject.DO_PARANOID_TYPE_CHECKING) {
      UnaryFunction Function = UnaryFunction.makeInstance(predicate);
      if (SubLNil.NIL == Function.processItem(this)) {
        Errors.error("Got invalid type for object: " + this + "."
          + "\nWanted: " + predicate + "\nGot: " + toTypeName());
      }
    }
  }
  public boolean canFastHash() {
    return true;
  }
  /** Method created to avoid casting */
  public SubLObject currentBinding(SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
    return SubLNil.NIL;
  }
  public void bind(SubLObject newValue, SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to bind non symbol: " + this + ".");
  }
  public void rebind(SubLObject oldValue, SubLObject[] bindings) { //SubLSymbol
    Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
  }
  public SubLObject get(SubLObject obj) { // SubLHashTable
    Errors.error(this + " is not of type: HASHTABLE.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLCharacter getCharacter(int index) { // SubLString
    Errors.error(this + " is not of type: STRING.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject put(SubLObject key, SubLObject value) { // SubLHashTable
    Errors.error(this + " is not of type: HASHTABLE.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject remove(SubLObject obj) { // SubLHashTable
    Errors.error(this + " is not of type: HASHTABLE.");
    return SubLNil.NIL;
  }
  public boolean hasKey(SubLObject obj) { // SubLKeyhash
    Errors.error(this + " is not of type: KEYHASH.");
    return false;
  }
  /** Method created to avoid casting */
  public void addKey(SubLObject key) { // SubLKeyhash
    Errors.error(this + " is not of type: KEYHASH.");
  }
  /** Method created to avoid casting */
  public boolean remKey(SubLObject obj) { // SubLKeyhash
    Errors.error(this + " is not of type: HASHTABLE.");
    return false;
  }
  /** Method created to avoid casting */
  public int size() { // SubLSequence
    Errors.error(this + " is not of type: SEQUENCE.");
    return -1;
  }
  /** Method created to avoid casting */
  public SubLObject get(int index) { // SubLSequence
    Errors.error(this + " is not of type: SEQUENCE.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public void set(int index, SubLObject val) { // SubLSequence
    Errors.error(this + " is not of type: SEQUENCE.");
  }
  /** Method created to avoid casting */
  public SubLSequence reverse(boolean isDestructive) { // SubLSequence
    Errors.error(this + " is not of type: SEQUENCE.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject rest() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject first() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLCons setFirst(SubLObject first) { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCons setRest(SubLObject rest) { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  public SubLList asConsList() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  public SubLList asArrayList() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  public boolean isArrayBased() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return true;
  }
  public SubLObject last(int i) { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return this;
  }
  public SubLObject nthCdr(int index) { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  /** Method created to avoid casting */
  public String getString() { // SubLString
    Errors.error(this + " is not of type: STRING.");
    return "";
  }
  /** Method created to avoid casting */
  public SubLObject getField(int fieldNum) { // SubLStruct
    Errors.error(this + " is not of type: STRUCT.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public void setField(int fieldNum, SubLObject value) { // SubLStruct
    Errors.error(this + " is not of type: STRUCT.");
  }
  public SubLStream getStream(boolean followSynonymStream) { // SubLStream
    Errors.error(this + " is not of type: STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputStream toInputStream() { // SubLStream
    Errors.error(this + " is not of type: INPUT-STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputTextStream toInputTextStream() { // SubLStream
    Errors.error(this + " is not of type: INPUT-TEXT-STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
    Errors.error(this + " is not of type: INPUT-BINARY-STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputStream toOutputStream() { // SubLStream
    Errors.error(this + " is not of type: OUTPUT-STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputTextStream toOutputTextStream() { // SubLStream
    Errors.error(this + " is not of type: OUTPUT-TEXT-STREAM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
    Errors.error(this + " is not of type: OUTPUT-BINARY-STREAM.");
    return null;
  }
  public SubLFunction getFunc() { // SubLFunction
    Errors.error(this + " is not of type: FUNCTION.");
    return null;
  }
  public SubLPackage toPackage() { // SubLPackage
    Errors.error(this + " is not of type: PACKAGE.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLStruct toStruct() { // SubLStruct
    Errors.error(this + " is not of type: STRUCTURE.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLVector toVect() { // SubLVector
    Errors.error(this + " is not of type: VECTOR.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLSymbol toSymbol() { // SubLSymbol
    Errors.error(this + " is not of type: SYMBOL.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLList toList() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLSequence toSeq() { // SubLSequence
    Errors.error(this + " is not of type: SEQUENCE.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCharacter toChar() { // SubLCharacter
    Errors.error(this + " is not of type: CHAR.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLGuid toGuid() { // SubLGuid
    Errors.error(this + " is not of type: GUID.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLSemaphore toSemaphore() { // SubLSemaphore
    Errors.error(this + " is not of type: SEMAPHORE.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLString toStr() { // SubLString
    Errors.error(this + " is not of type: STRING.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLMacro toMacro() { // SubLMacro
    Errors.error(this + " is not of type: MACRO.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLEnvironment toEnv() { // SubLEnvironment
    Errors.error(this + " is not of type: ENVIRONMENT.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLCons toCons() { // SubLCons
    Errors.error(this + " is not of type: CONS.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLNumber toNumber() { // SubLNumber
    return this;
  }
  /** Method created to avoid casting */
  public SubLProcess toProcess() { // SubLProcess
    Errors.error(this + " is not of type: PROCESS.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLLock toLock() { // SubLLock
    Errors.error(this + " is not of type: LOCK.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLReadWriteLock toReadWriteLock() { // SubLReadWriteLock
    Errors.error(this + " is not of type: READ-WRITE-LOCK.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLHashtable toHashtable() { // SubLHashtable
    Errors.error(this + " is not of type: HASHTABLE.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
    Errors.error(this + " is not of type: HASHTABLE-ITERATOR.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLKeyhash toKeyhash() { // SubLKeyhash
    Errors.error(this + " is not of type: KEYHASH.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLKeyhashIterator toKeyhashIterator() { // SubLKeyhashIterator
    Errors.error(this + " is not of type: KEYHASH-ITERATOR.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLRegexPattern toRegexPattern() { // SubLHashtableIterator
    Errors.error(this + " is not of type: REGEX-PATTERN.");
    return null;
  }
  /** Method created to avoid casting */
  public char charValue() { // SubLCharacter
    Errors.error(this + " is not of type: CHAR.");
    return 0;
  }
  /** Method created to avoid instanceof tests */
  public String getFileDesignator() {
    Errors.error(this + " is not a file name designator.");
    return null;
  }
  private void structFieldError(int fieldNum) {
    if (!(this instanceof SubLStruct)) {
      Errors.error(this + " is not of type STRUCTURE.");
    } else {
      Errors.error(this + " does not have a slot: " + fieldNum + ".");
    }
  }
  /** Method created to avoid casting */
  public SubLObject getField0()  {
    structFieldError(0);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField0(SubLObject newVal) {
    structFieldError(0);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField1()  {
    structFieldError(1);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField1(SubLObject newVal) {
    structFieldError(1);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField2() {
    structFieldError(2);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField2(SubLObject newVal) {
    structFieldError(2);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField3() {
    structFieldError(3);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField3(SubLObject newVal) {
    structFieldError(3);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField4() {
    structFieldError(4);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField4(SubLObject newVal) {
    structFieldError(4);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField5() {
    structFieldError(5);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField5(SubLObject newVal) {
    structFieldError(5);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField6() {
    structFieldError(6);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField6(SubLObject newVal) {
    structFieldError(6);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField7() {
    structFieldError(7);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField7(SubLObject newVal) {
    structFieldError(7);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField8() {
    structFieldError(8);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField8(SubLObject newVal) {
    structFieldError(8);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField9() {
    structFieldError(9);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField9(SubLObject newVal) {
    structFieldError(9);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField10() {
    structFieldError(10);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField10(SubLObject newVal) {
    structFieldError(10);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField11() {
    structFieldError(11);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField11(SubLObject newVal) {
    structFieldError(11);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField12() {
    structFieldError(12);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField12(SubLObject newVal) {
    structFieldError(12);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField13() {
    structFieldError(13);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField13(SubLObject newVal) {
    structFieldError(13);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField14() {
    structFieldError(14);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField14(SubLObject newVal) {
    structFieldError(14);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField15() {
    structFieldError(15);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField15(SubLObject newVal) {
    structFieldError(15);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField16() {
    structFieldError(16);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField16(SubLObject newVal) {
    structFieldError(16);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField17() {
    structFieldError(17);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField17(SubLObject newVal) {
    structFieldError(17);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField18() {
    structFieldError(18);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField18(SubLObject newVal) {
    structFieldError(18);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField19() {
    structFieldError(19);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField19(SubLObject newVal) {
    structFieldError(19);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject getField20() {
    structFieldError(20);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField20(SubLObject newVal) {
    structFieldError(20);
    return null;
  }
  public SubLObject second() { return get(1); }
  public SubLObject third() { return get(2); }
  public SubLObject fourth() { return get(3); }
  public SubLObject fifth() { return get(4); }
  public SubLObject sixth() { return get(5); }
  public SubLObject seventh() { return get(6); }
  public SubLObject eighth() { return get(7); }
  public SubLObject ninth() { return get(8); }
  public SubLObject tenth() { return get(9); }
	private void unimplimentedLispFunction() {
		// TODO Auto-generated method stub
		
	}
	
	public SubLObject ABS() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject AREF(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject AREF(SubLObject index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject ATOM() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject CHAR(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject CHARACTERP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject COMPLEXP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject CONSTANTP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject DENOMINATOR() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject ENDP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject EQ(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject EQL(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject EQUAL(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject EQUALP(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject EVENP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject FLOATP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject INTEGERP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_E(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_GE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_GT(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_LE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_LT(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject IS_NE(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LDB(int size, int position) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LENGTH() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LISTP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGAND(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGAND(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGIOR(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGIOR(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGNOT() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGXOR(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject LOGXOR(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject MINUSP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject MOD(SubLObject divisor) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject MOD(int divisor) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject NOT() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject NTH(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject NTH(SubLObject arg) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject NUMBERP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject NUMERATOR() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject ODDP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject PLUSP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject RATIONALP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject REALP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject SCHAR(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject SIMPLE_STRING_P() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject SLOT_VALUE(SubLObject slotName) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject STRING() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject STRINGP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject SVREF(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject SYMBOLP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTORP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject ZEROP() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject add(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public int aref(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	public long aref_long(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	public void aset(int index, int n) {
		unimplimentedLispFunction();
		
	}

	public void aset(int index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	public void aset(SubLObject index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	public SubLObject ash(int shift) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject ash(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject car() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject cddr() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject cdr() {
		unimplimentedLispFunction();
		return null;
	}

	public char[] charsOld() {
		unimplimentedLispFunction();
		return null;
	}

	public int cl_length() {
		unimplimentedLispFunction();
		return 0;
	}

	public SubLObject classOf() {
		unimplimentedLispFunction();
		return null;
	}

	public boolean constantp() {
		unimplimentedLispFunction();
		return false;
	}

	public SubLObject[] copyToArray() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject dispatch(SubLObject[] args) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject divideBy(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject elt(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public boolean endp() {
		unimplimentedLispFunction();
		return false;
	}

	public boolean eql(char c) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean eql(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean equal(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean equalp(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public SubLObject execute(SubLObject args, Environment env) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject arg) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth, SubLObject seventh) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth, SubLObject fifth,
			SubLObject sixth, SubLObject seventh, SubLObject eighth) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject execute(SubLObject[] args) {
		unimplimentedLispFunction();
		return null;
	}

	public boolean getBooleanValue() {
		unimplimentedLispFunction();
		return false;
	}

	public SubLObject getCallCount() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getDescription() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getDocumentation(SubLObject docType) {
		unimplimentedLispFunction();
		return null;
	}

	public int getFixnumSlotValue(int index) {
		unimplimentedLispFunction();
		return 0;
	}

	public int getHotCount() {
		unimplimentedLispFunction();
		return 0;
	}

	public SubLObject getParts() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getPropertyList() {
		unimplimentedLispFunction();
		return null;
	}


	public SubLObject getSlotValue(int index) {
		unimplimentedLispFunction();
		return null;
	}

	public boolean getSlotValueAsBoolean(int index) {
		unimplimentedLispFunction();
		return false;
	}

	public SubLObject getSlotValue_0() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_1() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_2() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSlotValue_3() {
		unimplimentedLispFunction();
		return null;
	}

	public char[] getStringChars() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolFunction() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject getSymbolFunctionOrDie() {
		unimplimentedLispFunction();
		return null;
	}


	public SubLObject getSymbolValue() {
		unimplimentedLispFunction();
		return null;
	}

	public void incrementCallCount(int arity) {
		unimplimentedLispFunction();
		
	}

	public void incrementHotCount() {
		unimplimentedLispFunction();
		
	}

	public boolean isCharacter() {
		unimplimentedLispFunction();
		return false;
	}


	public boolean isEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isEven() {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isGreaterThan(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isGreaterThanOrEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isLessThan(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isLessThanOrEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isNotEqualTo(int n) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isNotEqualTo(SubLObject obj) {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isOdd() {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isSpecialOperator() {
		unimplimentedLispFunction();
		return false;
	}

	public boolean isSpecialVariable() {
		unimplimentedLispFunction();
		return false;
	}

	public Object javaInstance() {
		unimplimentedLispFunction();
		return null;
	}

	public <T> Object javaInstance(Class<T> c) {
		unimplimentedLispFunction();
		return null;
	}

	public Object lockableInstance() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject multiplyBy(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject negate() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject noFillPointer() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject nreverse() {
		unimplimentedLispFunction();
		return null;
	}

	public int psxhash() {
		unimplimentedLispFunction();
		return 0;
	}

	public int psxhash(int depth) {
		unimplimentedLispFunction();
		return 0;
	}

	public SubLObject push(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public boolean rationalp() {
		unimplimentedLispFunction();
		return false;
	}

	public boolean realp() {
		unimplimentedLispFunction();
		return false;
	}

	public SubLObject resolve() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject reverse() {
		unimplimentedLispFunction();
		return null;
	}

	public void setCallCount(int n) {
		unimplimentedLispFunction();
		
	}

	public void setCar(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	public void setCdr(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	public void setDocumentation(SubLObject docType, SubLObject documentation) {
		unimplimentedLispFunction();
		
	}

	public void setHotCount(int n) {
		unimplimentedLispFunction();
		
	}

	public void setPropertyList(SubLObject obj) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue(int index, SubLObject value) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue(SubLObject slotName, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue_0(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue_1(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue_2(SubLObject value) {
		unimplimentedLispFunction();
		
	}

	public void setSlotValue_3(SubLObject value) {
		unimplimentedLispFunction();
		
	}


	public SubLObject subtract(int n) {
		unimplimentedLispFunction();
		return null;
	}

	public void svset(int index, SubLObject newValue) {
		unimplimentedLispFunction();
		
	}

	public int sxhash() {
		unimplimentedLispFunction();
		return 0;
	}


	public SubLObject toSubLFunction() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject truncate(SubLObject obj) {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject typeOf() {
		unimplimentedLispFunction();
		return null;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(String s) {
		unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(SubLSymbol sym) {
		unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(String s, boolean identity) {
		unimplimentedLispFunction();
		return null;
	}

	public String unreadableString(SubLSymbol symbol, boolean identity) {
		unimplimentedLispFunction();
		return null;
	}

	public void vectorPushExtend(SubLObject element) {
		unimplimentedLispFunction();
		
	}

	public String writeToString() {
		unimplimentedLispFunction();
		return null;
	}

	public int hashCodeLisp() {
		return hashCode();
	}
	  public boolean isPackageIterator() {
			// TODO Auto-generated method stub
			return false;
		}
	  public boolean isAlien() {
			// TODO Auto-generated method stub
			return false;
		}
		  
  //// Protected Area
  //// Private Area
  //// Internal Rep
}
