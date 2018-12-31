//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.exception;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.Date;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;

public class SubLException extends RuntimeException implements SubLObject {
	public static String EXCPETION_TYPE_NAME;

	private static DateFormat formatter;

	static {
		SubLException.EXCPETION_TYPE_NAME = "Error";
		SubLException.formatter = DateFormat.getDateTimeInstance(2, 1);
	}

	public static String getStringForException(Throwable e) {
		if (e == null)
			return "<no exception>";
		StringWriter writer = new StringWriter();
		PrintWriter out = new PrintWriter(new BufferedWriter(writer));
		e.printStackTrace(out);
		out.flush();
		return writer.getBuffer().toString();
	}

	private Date date;

	private SubLList restarts;
	private String threadName;
	private String description;

	SubLException() {
		this.date = new Date();
		this.restarts = SubLNil.NIL;
		this.threadName = Thread.currentThread().getName();
		this.description = null;
		this.init();
	}

	SubLException(String message) {
		super(message);
		this.date = new Date();
		this.restarts = SubLNil.NIL;
		this.threadName = Thread.currentThread().getName();
		this.description = null;
		this.init();
	}

	SubLException(String message, Throwable cause) {
		super(message, cause);
		this.date = new Date();
		this.restarts = SubLNil.NIL;
		this.threadName = Thread.currentThread().getName();
		this.description = null;
		this.init();
	}

	SubLException(Throwable cause) {
		super(cause);
		this.date = new Date();
		this.restarts = SubLNil.NIL;
		this.threadName = Thread.currentThread().getName();
		this.description = null;
		this.init();
	}

	public SubLObject add(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	public void addKey(SubLObject key) {
		Errors.error(this + " is not of type: KEYHASH.");
	}

	public SubLList asArrayList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLList asConsList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public BigInteger bigIntegerValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return BigInteger.ZERO;
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	public boolean canFastHash() {
		return true;
	}

	public char charValue() {
		Errors.error(this + " is not of type: CHAR.");
		return '\0';
	}

	public void checkType(SubLSymbol predicate) throws SubLException {
	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	public Object clone() {
		return this;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	public SubLObject dec() {
		return Errors.error("Not a number: " + this + ".");
	}

	public double doubleValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Double.MIN_VALUE;
	}

	public SubLObject eighth() {
		return this.get(7);
	}

	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			throw new SubLException("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
					+ this.toTypeName());
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	public boolean eql(SubLObject obj) {
		return this.equals(obj);
	}

	public boolean equal(SubLObject obj) {
		return this.eql(obj);
	}

	public boolean equalp(SubLObject obj) {
		return this.equal(obj);
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		SubLException other = (SubLException) obj;
		return super.equals(other);
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		throw new InvalidSubLExpressionException("Error: Attempt to take the value of an exception '" + this + "'.");
	}

	public SubLObject fifth() {
		return this.get(4);
	}

	public SubLObject first() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLObject fourth() {
		return this.get(3);
	}

	public SubLObject get(int index) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	public SubLObject get(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public SubLCharacter getCharacter(int index) {
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	public SubLObject getField(int fieldNum) {
		Errors.error(this + " is not of type: STRUCT.");
		return SubLNil.NIL;
	}

	public SubLObject getField0() {
		this.structFieldError(0);
		return null;
	}

	public SubLObject getField1() {
		this.structFieldError(1);
		return null;
	}

	public SubLObject getField10() {
		this.structFieldError(10);
		return null;
	}

	public SubLObject getField11() {
		this.structFieldError(11);
		return null;
	}

	public SubLObject getField12() {
		this.structFieldError(12);
		return null;
	}

	public SubLObject getField13() {
		this.structFieldError(13);
		return null;
	}

	public SubLObject getField14() {
		this.structFieldError(14);
		return null;
	}

	public SubLObject getField15() {
		this.structFieldError(15);
		return null;
	}

	public SubLObject getField16() {
		this.structFieldError(16);
		return null;
	}

	public SubLObject getField17() {
		this.structFieldError(17);
		return null;
	}

	public SubLObject getField18() {
		this.structFieldError(18);
		return null;
	}

	public SubLObject getField19() {
		this.structFieldError(19);
		return null;
	}

	public SubLObject getField2() {
		this.structFieldError(2);
		return null;
	}

	public SubLObject getField20() {
		this.structFieldError(20);
		return null;
	}

	public SubLObject getField3() {
		this.structFieldError(3);
		return null;
	}

	public SubLObject getField4() {
		this.structFieldError(4);
		return null;
	}

	public SubLObject getField5() {
		this.structFieldError(5);
		return null;
	}

	public SubLObject getField6() {
		this.structFieldError(6);
		return null;
	}

	public SubLObject getField7() {
		this.structFieldError(7);
		return null;
	}

	public SubLObject getField8() {
		this.structFieldError(8);
		return null;
	}

	public SubLObject getField9() {
		this.structFieldError(9);
		return null;
	}

	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator.");
		return null;
	}

	public SubLFunction getFunc() {
		Errors.error(this + " is not of type: FUNCTION.");
		return null;
	}

	public int getNumSize() {
		Errors.error("Not a number: " + this + ".");
		return -1;
	}

	public SubLList getRestarts() {
		return this.restarts;
	}

	public SubLStream getStream(boolean followSynonymStream) {
		Errors.error(this + " is not of type: STREAM.");
		return null;
	}

	public String getString() {
		Errors.error(this + " is not of type: STRING.");
		return "";
	}

	public SubLSymbol getType() {
		Errors.error(this + " does not have a type defined.");
		return null;
	}

	public SubLFixnum getTypeCode() {
		Errors.error(this + " does not have a typecode defined.");
		return null;
	}

	public int hashCode() {
		return this.hashCode(0);
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return super.hashCode();
		return 0;
	}

	public boolean hasKey(SubLObject obj) {
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	public SubLObject inc() {
		return Errors.error("Not a number: " + this + ".");
	}

	private synchronized void init() {
		Throwable t = this.getCause();
		if (t != null && t instanceof Unhandleable) {
			if (t instanceof RuntimeException)
				throw (RuntimeException) t;
			Errors.error("Unexpected situation.", t);
		}
		if (SubLMain.isInitialized())
			this.restarts = conses_high.copy_list(Errors.$restarts$.getValue().toList()).toList();
		else
			this.restarts = SubLNil.NIL;
	}

	public int intValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Integer.MIN_VALUE;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isArrayBased() {
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return true;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNegative() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isPositive() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public boolean isZero() {
		return false;
	}

	public SubLObject last(int i) {
		Errors.error(this + " is not of type: LIST.");
		return this;
	}

	public long longValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Long.MIN_VALUE;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public SubLObject mult(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	public SubLObject ninth() {
		return this.get(8);
	}

	public SubLObject nthCdr(int index) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public boolean numE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	public boolean numG(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	public boolean numGE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	public boolean numL(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	public boolean numLE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	public void printStackTrace() {
		System.out.println(this.toDetailedString());
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	public boolean remKey(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return false;
	}

	public SubLObject remove(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public SubLObject rest() {
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	public SubLSequence reverse(boolean isDestructive) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	public SubLObject second() {
		return this.get(1);
	}

	public void set(int index, SubLObject val) {
		Errors.error(this + " is not of type: SEQUENCE.");
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setField(int fieldNum, SubLObject value) {
		Errors.error(this + " is not of type: STRUCT.");
	}

	public SubLObject setField0(SubLObject newVal) {
		this.structFieldError(0);
		return null;
	}

	public SubLObject setField1(SubLObject newVal) {
		this.structFieldError(1);
		return null;
	}

	public SubLObject setField10(SubLObject newVal) {
		this.structFieldError(10);
		return null;
	}

	public SubLObject setField11(SubLObject newVal) {
		this.structFieldError(11);
		return null;
	}

	public SubLObject setField12(SubLObject newVal) {
		this.structFieldError(12);
		return null;
	}

	public SubLObject setField13(SubLObject newVal) {
		this.structFieldError(13);
		return null;
	}

	public SubLObject setField14(SubLObject newVal) {
		this.structFieldError(14);
		return null;
	}

	public SubLObject setField15(SubLObject newVal) {
		this.structFieldError(15);
		return null;
	}

	public SubLObject setField16(SubLObject newVal) {
		this.structFieldError(16);
		return null;
	}

	public SubLObject setField17(SubLObject newVal) {
		this.structFieldError(17);
		return null;
	}

	public SubLObject setField18(SubLObject newVal) {
		this.structFieldError(18);
		return null;
	}

	public SubLObject setField19(SubLObject newVal) {
		this.structFieldError(19);
		return null;
	}

	public SubLObject setField2(SubLObject newVal) {
		this.structFieldError(2);
		return null;
	}

	public SubLObject setField20(SubLObject newVal) {
		this.structFieldError(20);
		return null;
	}

	public SubLObject setField3(SubLObject newVal) {
		this.structFieldError(3);
		return null;
	}

	public SubLObject setField4(SubLObject newVal) {
		this.structFieldError(4);
		return null;
	}

	public SubLObject setField5(SubLObject newVal) {
		this.structFieldError(5);
		return null;
	}

	public SubLObject setField6(SubLObject newVal) {
		this.structFieldError(6);
		return null;
	}

	public SubLObject setField7(SubLObject newVal) {
		this.structFieldError(7);
		return null;
	}

	public SubLObject setField8(SubLObject newVal) {
		this.structFieldError(8);
		return null;
	}

	public SubLObject setField9(SubLObject newVal) {
		this.structFieldError(9);
		return null;
	}

	public SubLCons setFirst(SubLObject first) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLCons setRest(SubLObject rest) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLObject seventh() {
		return this.get(6);
	}

	public SubLObject sixth() {
		return this.get(5);
	}

	public int size() {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	public int size(int max) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	private void structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
	}

	public SubLObject sub(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	public int superHash() {
		return super.hashCode();
	}

	public SubLObject tenth() {
		return this.get(9);
	}

	public SubLObject third() {
		return this.get(2);
	}

	public SubLCharacter toChar() {
		Errors.error(this + " is not of type: CHAR.");
		return null;
	}

	public SubLCons toCons() {
		Errors.error(this + " is not of type: CONS.");
		return null;
	}

	public String toDetailedString() {
		StringWriter writer = new StringWriter();
		PrintWriter out = new PrintWriter(new BufferedWriter(writer));
		out.println("#<" + this.toTypeName() + "\n    Message: " + this.getMessage() + "\n    Thread: "
				+ this.threadName + "\n    Time: " + SubLException.formatter.format(this.date));
		if (this.description != null && !"".equals(this.description))
			out.println("    Description: " + this.description + "\n    Trace:");
		super.printStackTrace(out);
		out.print(">");
		out.flush();
		return writer.getBuffer().toString();
	}

	public SubLDoubleFloat toDouble() {
		Errors.error(this + " is not of type: FLOAT.");
		return null;
	}

	public SubLEnvironment toEnv() {
		Errors.error(this + " is not of type: ENVIRONMENT.");
		return null;
	}

	public SubLFixnum toFixnum() {
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	public SubLGuid toGuid() {
		Errors.error(this + " is not of type: GUID.");
		return null;
	}

	public SubLHashtable toHashtable() {
		Errors.error(this + " is not of type: HASHTABLE.");
		return null;
	}

	public SubLHashtableIterator toHashtableIterator() {
		Errors.error(this + " is not of type: HASHTABLE-ITERATOR.");
		return null;
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		Errors.error(this + " is not of type: INPUT-BINARY-STREAM.");
		return null;
	}

	public SubLInputStream toInputStream() {
		Errors.error(this + " is not of type: INPUT-STREAM.");
		return null;
	}

	public SubLInputTextStream toInputTextStream() {
		Errors.error(this + " is not of type: INPUT-TEXT-STREAM.");
		return null;
	}

	public SubLInteger toInteger() {
		Errors.error(this + " is not of type: INTEGER.");
		return null;
	}

	public SubLKeyhash toKeyhash() {
		Errors.error(this + " is not of type: KEYHASH.");
		return null;
	}

	public SubLKeyhashIterator toKeyhashIterator() {
		Errors.error(this + " is not of type: KEYHASH-ITERATOR.");
		return null;
	}

	public SubLList toList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public SubLLock toLock() {
		Errors.error(this + " is not of type: LOCK.");
		return null;
	}

	public SubLMacro toMacro() {
		Errors.error(this + " is not of type: MACRO.");
		return null;
	}

	public SubLNumber toNumber() {
		Errors.error(this + " is not of type: NUMBER.");
		return null;
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		Errors.error(this + " is not of type: OUTPUT-BINARY-STREAM.");
		return null;
	}

	public SubLOutputStream toOutputStream() {
		Errors.error(this + " is not of type: OUTPUT-STREAM.");
		return null;
	}

	public SubLOutputTextStream toOutputTextStream() {
		Errors.error(this + " is not of type: OUTPUT-TEXT-STREAM.");
		return null;
	}

	public SubLPackage toPackage() {
		Errors.error(this + " is not of type: PACKAGE.");
		return null;
	}

	public SubLPackageIterator toPackageIterator() {
		Errors.error(this + " is not of type: PACKAGE-ITERATOR.");
		return null;
	}

	public SubLProcess toProcess() {
		Errors.error(this + " is not of type: PROCESS.");
		return null;
	}

	public SubLReadWriteLock toReadWriteLock() {
		Errors.error(this + " is not of type: READ-WRITE-LOCK.");
		return null;
	}

	public SubLRegexPattern toRegexPattern() {
		Errors.error(this + " is not of type: REGEX-PATTERN.");
		return null;
	}

	public SubLSemaphore toSemaphore() {
		Errors.error(this + " is not of type: SEMAPHORE.");
		return null;
	}

	public SubLSequence toSeq() {
		Errors.error(this + " is not of type: SEQUENCE.");
		return null;
	}

	public SubLString toStr() {
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	public String toString() {
		return "    " + super.toString();
	}

	public SubLStruct toStruct() {
		Errors.error(this + " is not of type: STRUCTURE.");
		return null;
	}

	public SubLSymbol toSymbol() {
		Errors.error(this + " is not of type: SYMBOL.");
		return null;
	}

	public String toTypeName() {
		return SubLException.EXCPETION_TYPE_NAME;
	}

	public SubLVector toVect() {
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}
}
