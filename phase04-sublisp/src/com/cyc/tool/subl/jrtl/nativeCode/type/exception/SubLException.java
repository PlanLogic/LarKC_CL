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

package  com.cyc.tool.subl.jrtl.nativeCode.type.exception;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractString;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import java.io.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.math.BigInteger;
import java.util.Date;
import java.text.*;

/**
 * <P>CycLVariable is designed to...
 * @Note: consider keeping track of dynamic bindings at time of error
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 10, 2005, 7:24 PM
 * @version $Id: SubLException.java 126764 2009-01-07 22:27:23Z tbrussea $
 */
// @todo consider changing SubLException to not implement SubLObject.
// You can't get a hold of these things, what do eval and eq mean on them?
public class SubLException extends RuntimeException implements SubLObject {
  //// Constructors
  /** Constructs a new runtime exception with <code>null</code> as its
   * detail message.  The cause is not initialized, and may subsequently be
   * initialized by a call to {@link #initCause}.
   */
  SubLException() {
    super();
    init();
  }
  /** Constructs a new runtime exception with the specified detail message.
   * The cause is not initialized, and may subsequently be initialized by a
   * call to {@link #initCause}.
   *
   * @param   message   the detail message. The detail message is saved for
   *          later retrieval by the {@link #getMessage()} method.
   */
  SubLException(String message) {
    super(message);
    init();
  }
  /**
   * Constructs a new runtime exception with the specified detail message and
   * cause.  <p>Note that the detail message associated with
   * <code>cause</code> is <i>not</i> automatically incorporated in
   * this runtime exception's detail message.
   *
   * @param  message the detail message (which is saved for later retrieval
   *         by the {@link #getMessage()} method).
   * @param  cause the cause (which is saved for later retrieval by the
   *         {@link #getCause()} method).  (A <tt>null</tt> value is
   *         permitted, and indicates that the cause is nonexistent or
   *         unknown.)
   * @since  1.4
   */
  SubLException(String message, Throwable cause) {
    super(message, cause);
    init();
  }
  /** Constructs a new runtime exception with the specified cause and a
   * detail message of <tt>(cause==null ? null : cause.toString())</tt>
   * (which typically contains the class and detail message of
   * <tt>cause</tt>).  This constructor is useful for runtime exceptions
   * that are little more than wrappers for other throwables.
   *
   * @param  cause the cause (which is saved for later retrieval by the
   *         {@link #getCause()} method).  (A <tt>null</tt> value is
   *         permitted, and indicates that the cause is nonexistent or
   *         unknown.)
   * @since  1.4
   */
  SubLException(Throwable cause) {
    super(cause);
    init();
  }
  //// Public Area

  private synchronized void init() {
    Throwable t = getCause();
    if ((t != null) && (t instanceof Unhandleable)) {
      if (t instanceof RuntimeException) {
        throw (RuntimeException)t;
      }
      t.printStackTrace();
      Errors.error("Unexpected situation.");
    }
    if (SubLMain.isInitialized()) {
      restarts = conses_high.copy_list(Errors.$restarts$.getValue().toList()).toList();
    } else {
      restarts = SubLNil.NIL;
    }
  }

  public SubLList getRestarts() {
    return restarts;
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
    return "    " + super.toString();
  }
  public String toDetailedString() {
    StringWriter writer = new StringWriter();
    PrintWriter out = new PrintWriter(new BufferedWriter(writer));
    out.println("#<" + toTypeName() +  "\n    Message: " + getMessage()
    + "\n    Thread: " + threadName +  "\n    Time: " +
      formatter.format(date));
    if ((description != null) && (!"".equals(description))) {
      out.println("    Description: " + description + "\n    Trace:");
    }
    super.printStackTrace(out);
    out.print(">");
    out.flush();
    return writer.getBuffer().toString();
  }
  public void printStackTrace() {
    System.out.println(toDetailedString());
  }
  /** Returns the String representation of an Throwable, including
   * short message and stack trace.
   * @param e The throwable item to get the String rep.
   * @return The String representation of the Throwable passed.
   * @note This should be moved somewhere better -APB
   * @note This is a copy of a function in org.opencyc.util.StringUtils.java -APB
   */
  public static String getStringForException(Throwable e) {
    if (e == null) { return "<no exception>"; }
    StringWriter writer = new StringWriter();
    PrintWriter out = new PrintWriter(new BufferedWriter(writer));
    e.printStackTrace(out);
    out.flush();
    return writer.getBuffer().toString();
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public int hashCode() {
    return hashCode(0);
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return super.hashCode();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public int superHash() {
    return super.hashCode();
  }
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    throw new InvalidSubLExpressionException("Error: Attempt to take the "
      + "value of an exception \'" + this + "'.");
  }
  public boolean equals(Object obj) {
    if (obj == this) { return true; }
    if (obj == null) { return false; }
    SubLException other = (SubLException)obj;
    return super.equals(other);
  }
  // This class doesn't extend AbstractSubLObject, so it needs to implement
  // all the SubLObject methods explicitly.  How odd.
  public boolean eql(SubLObject obj) {
    return equals(obj);
  }
  public boolean equal(SubLObject obj) {
    return eql(obj);
  }
  public boolean equalp(SubLObject obj) {
    return equal(obj);
  }
  public static String EXCPETION_TYPE_NAME = "Error";
  public String toTypeName() {
    return EXCPETION_TYPE_NAME;
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
      throw new SubLException("Got invalid type for object: " + this + "."
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
        throw new SubLException("Got invalid type for object: " + this + "."
          + "\nWanted: " + predicate + "\nGot: " + toTypeName());
      }
    }
  }
  public boolean canFastHash() {
    return true;
  }
  
  /** Method created to avoid casting */
  public int getNumSize() { //SubLNumber
    Errors.error("Not a number: " + this + ".");
    return -1;
  }
  public SubLObject inc() { //SubLNumber
    return Errors.error("Not a number: " + this + ".");
  }
  public SubLObject dec() { //SubLNumber
    return Errors.error("Not a number: " + this + ".");
  }
  public SubLObject add(SubLObject num) { //SubLNumber
    return Errors.error("Not a number: " + this + ".");
  }
  public SubLObject sub(SubLObject num) { //SubLNumber
    return Errors.error("Not a number: " + this + ".");
  }
  public SubLObject mult(SubLObject num) { //SubLNumber
    return Errors.error("Not a number: " + this + ".");
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
  public boolean numL(SubLObject x) { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numLE(SubLObject x) { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numG(SubLObject x) { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numGE(SubLObject x) { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean numE(SubLObject x) { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isPositive() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isNegative() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public boolean isZero() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return false;
  }
  /** Method created to avoid casting */
  public int intValue() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return Integer.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public long longValue() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return Long.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public double doubleValue() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return Double.MIN_VALUE;
  }
  /** Method created to avoid casting */
  public BigInteger bigIntegerValue() { // SubLNumber
    Errors.error(this + " is not of type: NUMBER.");
    return BigInteger.ZERO;
  }
  /** Method created to avoid casting */
  public SubLObject rest() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return SubLNil.NIL;
  }
  /** Method created to avoid casting */
  public SubLObject first() { // SubLList
    Errors.error(this + " is not of type: LIST.");
    return null;
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
  /** Method created to avoid casting */
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
    Errors.error(this + " is not of type: NUMBER.");
    return null;
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
  public SubLInteger toInteger() { // SubLInteger
    Errors.error(this + " is not of type: INTEGER.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLFixnum toFixnum() { // SubLFixnum
    Errors.error(this + " is not of type: FIXNUM.");
    return null;
  }
  /** Method created to avoid casting */
  public SubLDoubleFloat toDouble() { // SubLDoubleFloat
    Errors.error(this + " is not of type: FLOAT.");
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
  public SubLSymbol getType(){ 
    Errors.error(this + " does not have a type defined.");
    return null;
  }
  public SubLFixnum getTypeCode() {
    Errors.error(this + " does not have a typecode defined.");
    return null;
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
  public boolean isError() { return true; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  public SubLObject second() { return get(1); }
  public SubLObject third() { return get(2); }
  public SubLObject fourth() { return get(3); }
  public SubLObject fifth() { return get(4); }
  public SubLObject sixth() { return get(5); }
  public SubLObject seventh() { return get(6); }
  public SubLObject eighth() { return get(7); }
  public SubLObject ninth() { return get(8); }
  public SubLObject tenth() { return get(9); }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private Date date = new Date();
  private SubLList restarts = SubLNil.NIL;
  private String threadName = Thread.currentThread().getName();
  private String description = null;
  private static DateFormat formatter =
    DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG);

	public SubLObject ABS() {
		unimplimentedLispFunction();
		return null;
	}

	private void unimplimentedLispFunction() {
		// TODO Auto-generated method stub
		
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

	public float floatValue() {
		unimplimentedLispFunction();
		return 0;
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
		// TODO Auto-generated method stub
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
		  
}
