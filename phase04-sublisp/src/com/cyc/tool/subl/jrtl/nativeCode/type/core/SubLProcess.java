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

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  abstract class SubLProcess extends SafeRunnable implements Runnable, SubLObject, CommonSymbols {
  //// Constructors
  /** Creates a new instance of SubLProcess. */
  public SubLProcess(SubLString name) {
    setState(INITIALIZING_STATE);
    setWhoState(Threads.INITIALIZING_STRING);
    priority = DEFAULT_PRIORITY;
    this.name = name;
  }
  public SubLProcess(String name) {
    this(SubLObjectFactory.makeString(name));
  }
  //// Public Area
  /** @todo remove me...use Values.nthMultipleValue instead
   *  */
  public static SubLObject nthMultipleValue(SubLObject nth) {
    int n = nth.intValue();
    SubLThread thread = (SubLThread)Thread.currentThread();
    switch (n) {
      case 0:
        return thread.value1;
      case 1:
        return thread.value2;
      case 2:
        return thread.value3;
      case 3:
        return thread.value4;
      case 4:
        return thread.value5;
      case 5:
        return thread.value6;
      case 6:
        return thread.value7;
      case 7:
        return thread.value8;
      default:
        if (n >= thread.valuesCount) { return NIL; }
        return (SubLObject)thread.valuesArray.get(n - 8);
    }
  }
  abstract public void safeRun();
  public String toString() {
    return "#<PROCESS " + name + ">";
  }
  public SubLString getName() {
    return name;
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return superHash();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public int superHash() {
    return super.superHash();
  }
  public void run() {
    try {
      runThread = (SubLThread)Thread.currentThread();
      runThread.clearBindings();
      synchronized (currentProcesses) { currentProcesses.add(this); }
      runThread.setSubLProcess(this);
      setPriority(getPriority());
      setState(RUN_STATE);
      setWhoState(Threads.RUN_STRING);
      Threads.possiblyHandleInterrupts(false);
      safeRun();
    } catch (TerminationRequest terminate) {
      // this is a legal request to stop
    } catch (Exception e) {
      try {
        Errors.handleError(e);
      } catch (Throwable t) {
        //t.printStackTrace(); // @note is this the correct thing to do?
      }
    } finally {
      setState(DEAD_STATE);
      setWhoState(Threads.DEAD_STRING);
      runThread.setSubLProcess(null);
      runThread.interrupted(); //clear interrupted status
      runThread.reset();
      runThread = null;
      synchronized (currentProcesses) { currentProcesses.remove(this); }
    }
  }
  public void interrupt() {
    waitUntilInitializationHasFinished();
    try {
      synchronized (runThread.getInterruptLock()) {
        runThread.interrupt();
      }
    } catch (NullPointerException npe) {} //ignore
  }
  public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
    return this; // process objects are self-evaluating
  }
  public static SubLProcess currentProcess() {
    return currentSubLThread().getSubLProcess();
  }
  public static SubLThread currentSubLThread() {
    return ((SubLThread) Thread.currentThread());
  }
  public SubLFixnum getPriority() {
    return priority;
  }
  public synchronized SubLFixnum setPriority(SubLFixnum newPriority) {
    SubLFixnum oldPriority = priority;
    priority = newPriority;
    if (runThread != null) {
      try {
        runThread.setPriority(subLPriorityToJavaPriority(newPriority));
      } catch (NullPointerException npe) {} //ignore
    }
    return oldPriority;
  }
  public static SubLProcess[] currentProcesses() {
    synchronized (currentProcesses) {
      SubLProcess[] result = new SubLProcess[currentProcesses.size()];
      return (SubLProcess[])currentProcesses.toArray(result);
    }
  }
  private static void sleep(long msecs) throws InterruptedException {
    Thread currentThread = Thread.currentThread();
    currentThread.sleep(msecs);
  }
  public boolean canFastHash() {
    return true;
  }
  // This class doesn't extend AbstractSubLObject, so it needs to implement
  // all the SubLObject methods explicitly.
  public boolean equals(Object obj) {
    return this == obj;
  }
  public boolean eql(SubLObject obj) {
    return equals(obj);
  }
  public boolean equal(SubLObject obj) {
    return eql(obj);
  }
  public boolean equalp(SubLObject obj) {
    return equal(obj);
  }
  public static String PROCESS_TYPE_NAME = "PROCESS";
  public String toTypeName() {
    return PROCESS_TYPE_NAME;
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
  public synchronized SubLProcessState setState(SubLProcessState newState) {
    if (state == null) {
      Errors.error("Invalid null state attempted to be assigned to process: " + this);
    }
    SubLProcessState oldState = state;
    this.state = newState;
    return oldState;
  }
  public synchronized SubLProcessState getState() {
    return state;
  }
  public synchronized SubLSymbol getStateSymbol() {
    return state.toSymbol();
  }
  public synchronized SubLString setWhoState(SubLString newState) {
    SubLString oldState = whoState;
    whoState = newState;
    return oldState;
  }
  public synchronized SubLString getWhoState() {
    return whoState;
  }
  public boolean isRunning() {
    return isRunning;
  }
  public void setIsRunning(boolean newVal) {
    isRunning = newVal;
  }
  public boolean hasWatingInterrupts() {
    return !interrupts.isEmpty();
  }
  public Thunk nextInterrupt() {
    Thunk interruptRequest = null;
    if (!interrupts.isEmpty()) {
      interruptRequest = (Thunk)interrupts.remove(0);
    }
    return interruptRequest;
  }
  public void addInterrupt(SubLObject function) {
    addInterrupt(new DefaultThunk(function));
  }
  public void addInterrupt(Thunk thunk) {
    interrupts.add(thunk);
    interrupt();
  }
  public void killProcess() {
    addInterrupt(DefaultThunk.requestTermination());
  }
  public void processInterrupts() {
    if (runThread != null) {
      runThread.interrupted(); // clear interrupts by side-effect
    }
    if (isNotInterruptible()) { return; }
    while (hasWatingInterrupts()) {
      Thunk current = nextInterrupt();
      if (current != null) {
        if (current.isTerminationRequest()) {
          throw new TerminationRequest();
        } else {
          current.invoke();
        }
      }
    }
  }
  public void waitUntilInitializationHasFinished() {
    if (Thread.currentThread() == runThread) { return; } // @hack to avoid infinite loop
    while (state == INITIALIZING_STATE) {
      Thread.currentThread().yield();
    }
  }
  public SubLObject processWait(SubLObject whostate, SubLObject predicate, TimeOut timeOut) {
    SubLString whoStateTyped = whostate.toStr();
    SubLFunction pred = predicate.getFunc();
    SubLNumber waitTimeRaw = Threads.$process_wait_sleep_time$.getValue().toNumber();
    long waitTime_usecs = waitTimeRaw.longValue();
    boolean done = (Functions.funcall(pred) != NIL);
    if (!done) {
      SubLProcessState oldState = setState(SubLProcess.WAIT_STATE);
      SubLString oldWhoState = setWhoState(whoStateTyped);
      try {
        do {
          sleepForMicroSeconds(waitTime_usecs);
          done = (Functions.funcall(pred) != NIL);
        } while ((!done) && (!timeOut.hasTimeoutArrived()));
      } finally {
        setState(oldState);
        setWhoState(oldWhoState);
      }
    }
    return T;
  }
  public void sleepForMicroSeconds(long usecs) {
    long msecs = (long)(usecs / 1000L);
    // @todo loop until done sleeping
    try {
      SubLProcess.sleep(msecs);
    } catch (InterruptedException ie) {
      processInterrupts();
    }
  }
  public synchronized void block() {
    SubLProcessState prevState = getState();
    SubLString prevWhoState = getWhoState();   
    try {
      setState(SubLProcess.BLOCKED_STATE);
      setWhoState(Threads.BLOCKED_STRING);
      boolean waitFinished = false;
      while (!waitFinished) {
        try {
          wait();
          waitFinished = true;
        } catch (InterruptedException xcpt) {
          processInterrupts();
        }
      }
    } finally {
      setState(prevState);
      setWhoState(prevWhoState);
    }
  }
  public synchronized void unblock() {
    notify();
  }
  public boolean isActive() {
    return state == RUN_STATE;
  }
  public boolean isNotInterruptible() {
    return ((Threads.$is_thread_performing_cleanupP$ == null) || (Threads.$is_thread_performing_cleanupP$.getDynamicValue() != NIL));
  }
  static public class TerminationRequest extends Unhandleable {
    public TerminationRequest() {
      super();
    }
  }
  
  static public interface Thunk {
    SubLObject invoke();
    boolean isTerminationRequest();
  }

  static public class DefaultThunk implements Thunk {
    public DefaultThunk( SubLObject function, SubLObject[] arguments) {
      this.function = function;
      this.arguments = arguments;
      sender = Thread.currentThread();
    }
    public DefaultThunk( SubLObject function) {
      this(function, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
    }

    static public Thunk requestTermination() {
      return new DefaultThunk(KILL_KEYWORD);
    }

    static public Thunk requestTaskTermination() {
      return new InterruptReadLoopThunk();
    }
    public boolean isTerminationRequest() {
      return function.eql(KILL_KEYWORD);
    }
    public SubLObject invoke() {
      SubLFunction func = function.getFunc();
      SubLObject result = Functions.funcall(func, arguments);
      return result;
    }
    public Thread getSender() {
      return sender;
    }
    
    private SubLObject function;
    private SubLObject[] arguments;
    private Thread sender;
  }

  public static class InterruptReadLoopThunk implements Thunk {

    public boolean isTerminationRequest() {
      return false;
    }
    public SubLObject invoke() {
      throw new ResumeException();
    }
  }

  public static Thunk READ_LOOP_INTERRUPT_THUNK = new InterruptReadLoopThunk();
  public Object clone() {
    return this;
  }
  public SubLObject makeCopy() {
    return this;
  }
  public SubLObject makeDeepCopy() {
    return this;
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
  public SubLCharacter getCharacter(int index) { // SubLString
    Errors.error(this + " is not of type: STRING.");
    return null;
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
  /** Method created to avoid casting */
  public SubLFunction getFunc() { // SubLFunction
    Errors.error(this + " is not of type: FUNCTION.");
    return null;
  }
  /** Method created to avoid casting */
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
    return this;
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
  private SubLObject structFieldError(int fieldNum) {
    if (!(this instanceof SubLStruct)) {
      Errors.error(this + " is not of type STRUCTURE.");
    } else {
      Errors.error(this + " does not have a slot: " + fieldNum + ".");
    }
    return NIL;
  }
  /** Method created to avoid casting */
  public SubLObject getField0()  {
    structFieldError(0);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField0(SubLObject newVal) {
    return structFieldError(0);
  }
  /** Method created to avoid casting */
  public SubLObject getField1()  {
    structFieldError(1);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField1(SubLObject newVal) {
    return structFieldError(1);
  }
  /** Method created to avoid casting */
  public SubLObject getField2() {
    structFieldError(2);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField2(SubLObject newVal) {
    return structFieldError(2);
  }
  /** Method created to avoid casting */
  public SubLObject getField3() {
    structFieldError(3);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField3(SubLObject newVal) {
    return structFieldError(3);
  }
  /** Method created to avoid casting */
  public SubLObject getField4() {
    structFieldError(4);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField4(SubLObject newVal) {
    return structFieldError(4);
  }
  /** Method created to avoid casting */
  public SubLObject getField5() {
    structFieldError(5);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField5(SubLObject newVal) {
    return structFieldError(5);
  }
  /** Method created to avoid casting */
  public SubLObject getField6() {
    structFieldError(6);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField6(SubLObject newVal) {
    return structFieldError(6);
  }
  /** Method created to avoid casting */
  public SubLObject getField7() {
    structFieldError(7);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField7(SubLObject newVal) {
    return structFieldError(7);
  }
  /** Method created to avoid casting */
  public SubLObject getField8() {
    structFieldError(8);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField8(SubLObject newVal) {
    return structFieldError(8);
  }
  /** Method created to avoid casting */
  public SubLObject getField9() {
    structFieldError(9);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField9(SubLObject newVal) {
    return structFieldError(9);
  }
  /** Method created to avoid casting */
  public SubLObject getField10() {
    structFieldError(10);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField10(SubLObject newVal) {
    return structFieldError(10);
  }
  /** Method created to avoid casting */
  public SubLObject getField11() {
    structFieldError(11);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField11(SubLObject newVal) {
    return structFieldError(11);
  }
  /** Method created to avoid casting */
  public SubLObject getField12() {
    structFieldError(12);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField12(SubLObject newVal) {
    return structFieldError(12);
  }
  /** Method created to avoid casting */
  public SubLObject getField13() {
    structFieldError(13);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField13(SubLObject newVal) {
    return structFieldError(13);
  }
  /** Method created to avoid casting */
  public SubLObject getField14() {
    structFieldError(14);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField14(SubLObject newVal) {
    return structFieldError(14);
  }
  /** Method created to avoid casting */
  public SubLObject getField15() {
    structFieldError(15);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField15(SubLObject newVal) {
    return structFieldError(15);
  }
  /** Method created to avoid casting */
  public SubLObject getField16() {
    structFieldError(16);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField16(SubLObject newVal) {
    return structFieldError(16);
  }
  /** Method created to avoid casting */
  public SubLObject getField17() {
    structFieldError(17);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField17(SubLObject newVal) {
    return structFieldError(17);
  }
  /** Method created to avoid casting */
  public SubLObject getField18() {
    structFieldError(18);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField18(SubLObject newVal) {
    return structFieldError(18);
  }
  /** Method created to avoid casting */
  public SubLObject getField19() {
    structFieldError(19);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField19(SubLObject newVal) {
    return structFieldError(19);
  }
  /** Method created to avoid casting */
  public SubLObject getField20() {
    structFieldError(20);
    return null;
  }
  /** Method created to avoid casting */
  public SubLObject setField20(SubLObject newVal) {
    return structFieldError(20);
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
  public SubLSymbol getType(){
    return Types.$dtp_process$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.FOURTEEN_INTEGER;
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
  public boolean isProcess() { return true; }
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
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  public static class SubLProcessState {
    private SubLProcessState(String name) {
      state = SubLObjectFactory.makeString(name);
    }
    public String toString() {
      return state.toString();
    }
    public SubLString toSubLString() {
      return state;
    }
    public SubLSymbol toSymbol() {
      if (stateSymbol == null) {
        stateSymbol = SubLObjectFactory.makeSublispSymbol(toString());
      }
      return stateSymbol;
    }
    public SubLString state;
    public SubLSymbol stateSymbol;
  }
  public static SubLProcessState INITIALIZING_STATE = new SubLProcessState("INITIALIZING");
  public static SubLProcessState RUN_STATE = new SubLProcessState("RUN");
  public static SubLProcessState WAIT_STATE = new SubLProcessState("WAIT");
  public static SubLProcessState DEAD_STATE = new SubLProcessState("DEAD");
  public static SubLProcessState BLOCKED_STATE = new SubLProcessState("BLOCKED");
  public interface TimeOut {
    public boolean hasTimeoutArrived();
  }
  public static class NeverTimesOut implements TimeOut {
    private NeverTimesOut() {}
    public boolean hasTimeoutArrived() {
      return false;
    }
    public static TimeOut NO_TIMEOUT = new NeverTimesOut();
  }
  public static class TimesOutAfter implements TimeOut {
    public TimesOutAfter(SubLNumber microseconds) {
      endTime = Numbers.add(Time.get_internal_real_time(), microseconds).toNumber();
      timeHasArrived = false;
    }
    public boolean hasTimeoutArrived() {
      if (timeHasArrived) {
        return true;
      }
      SubLObject result = Numbers.numL(endTime,Time.get_internal_real_time());
      timeHasArrived = (result != NIL);
      return timeHasArrived;
    }
    private SubLNumber endTime;
    private boolean timeHasArrived;
  }
  
  //// Protected Area
  static protected int subLPriorityToJavaPriority( SubLFixnum priority) {
    // @stub
    return priority.intValue();
  }
  //// Private Area
  //// Internal Rep
  
  private volatile boolean isPossiblyStillborn = false;
  private volatile SubLThread runThread = null;
  private SubLString name;
  // @todo use this instead : $process_normal_priority$.getValue();
  private SubLFixnum priority = DEFAULT_PRIORITY;
  private static SubLFixnum DEFAULT_PRIORITY = (SubLFixnum)SubLObjectFactory.makeInteger(5);// (SubLFixnum)FIVE_INTEGER;
  private volatile SubLString whoState = Threads.UNSET_STRING;
  private volatile SubLProcessState state = DEAD_STATE;
  private List<Thunk> interrupts = Collections.synchronizedList(new ArrayList<Thunk>());
  private static Set<SubLProcess> currentProcesses = new HashSet<SubLProcess>(128);
  private boolean isRunning = false;
}
