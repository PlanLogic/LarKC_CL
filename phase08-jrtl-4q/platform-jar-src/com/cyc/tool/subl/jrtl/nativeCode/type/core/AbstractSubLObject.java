//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
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

public abstract class AbstractSubLObject implements SubLObject {

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

	public char charValue() {
		Errors.error(this + " is not of type: CHAR.");
		return '\0';
	}

	public void checkType(SubLSymbol predicate) throws SubLException {
	}

	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	public Object clone() {
		Errors.unimplementedMethod("clone()");
		return null;
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
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + this.toTypeName()));
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	public boolean eql(SubLObject obj) {
		return obj == this;
	}

	public boolean equal(SubLObject obj) {
		return this.eql(obj);
	}

	public boolean equalp(SubLObject obj) {
		return this.equal(obj);
	}

	public boolean equals(Object obj) {
		return obj == this;
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	public SubLObject fifth() {
		return this.get(4);
	}

	public SubLObject first() {
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
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
		return this.structFieldError(0);
	}

	public SubLObject getField1() {
		return this.structFieldError(1);
	}

	public SubLObject getField10() {
		return this.structFieldError(10);
	}

	public SubLObject getField11() {
		return this.structFieldError(11);
	}

	public SubLObject getField12() {
		return this.structFieldError(12);
	}

	public SubLObject getField13() {
		return this.structFieldError(13);
	}

	public SubLObject getField14() {
		return this.structFieldError(14);
	}

	public SubLObject getField15() {
		return this.structFieldError(15);
	}

	public SubLObject getField16() {
		return this.structFieldError(16);
	}

	public SubLObject getField17() {
		return this.structFieldError(17);
	}

	public SubLObject getField18() {
		return this.structFieldError(18);
	}

	public SubLObject getField19() {
		return this.structFieldError(19);
	}

	public SubLObject getField2() {
		return this.structFieldError(2);
	}

	public SubLObject getField20() {
		return this.structFieldError(20);
	}

	public SubLObject getField3() {
		return this.structFieldError(3);
	}

	public SubLObject getField4() {
		return this.structFieldError(4);
	}

	public SubLObject getField5() {
		return this.structFieldError(5);
	}

	public SubLObject getField6() {
		return this.structFieldError(6);
	}

	public SubLObject getField7() {
		return this.structFieldError(7);
	}

	public SubLObject getField8() {
		return this.structFieldError(8);
	}

	public SubLObject getField9() {
		return this.structFieldError(9);
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

	public boolean hasKey(SubLObject obj) {
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	public SubLObject inc() {
		return Errors.error("Not a number: " + this + ".");
	}

	public int intValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Integer.MIN_VALUE;
	}

	public boolean isArrayBased() {
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	public boolean isNegative() {
		return false;
	}

	public boolean isPositive() {
		return false;
	}

	public boolean isZero() {
		return false;
	}

	public SubLObject last(int i) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public long longValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Long.MIN_VALUE;
	}

	public SubLObject makeCopy() {
		Errors.unimplementedMethod("makeCopy()");
		return null;
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("makeDeepCopy()");
		return null;
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

	public void setField(int fieldNum, SubLObject value) {
		Errors.error(this + " is not of type: STRUCT.");
	}

	public SubLObject setField0(SubLObject newVal) {
		return this.structFieldError(0);
	}

	public SubLObject setField1(SubLObject newVal) {
		return this.structFieldError(1);
	}

	public SubLObject setField10(SubLObject newVal) {
		return this.structFieldError(10);
	}

	public SubLObject setField11(SubLObject newVal) {
		return this.structFieldError(11);
	}

	public SubLObject setField12(SubLObject newVal) {
		return this.structFieldError(12);
	}

	public SubLObject setField13(SubLObject newVal) {
		return this.structFieldError(13);
	}

	public SubLObject setField14(SubLObject newVal) {
		return this.structFieldError(14);
	}

	public SubLObject setField15(SubLObject newVal) {
		return this.structFieldError(15);
	}

	public SubLObject setField16(SubLObject newVal) {
		return this.structFieldError(16);
	}

	public SubLObject setField17(SubLObject newVal) {
		return this.structFieldError(17);
	}

	public SubLObject setField18(SubLObject newVal) {
		return this.structFieldError(18);
	}

	public SubLObject setField19(SubLObject newVal) {
		return this.structFieldError(19);
	}

	public SubLObject setField2(SubLObject newVal) {
		return this.structFieldError(2);
	}

	public SubLObject setField20(SubLObject newVal) {
		return this.structFieldError(20);
	}

	public SubLObject setField3(SubLObject newVal) {
		return this.structFieldError(3);
	}

	public SubLObject setField4(SubLObject newVal) {
		return this.structFieldError(4);
	}

	public SubLObject setField5(SubLObject newVal) {
		return this.structFieldError(5);
	}

	public SubLObject setField6(SubLObject newVal) {
		return this.structFieldError(6);
	}

	public SubLObject setField7(SubLObject newVal) {
		return this.structFieldError(7);
	}

	public SubLObject setField8(SubLObject newVal) {
		return this.structFieldError(8);
	}

	public SubLObject setField9(SubLObject newVal) {
		return this.structFieldError(9);
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

	private SubLObject structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
		return SubLNil.NIL;
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

	public SubLDoubleFloat toDouble() {
		Errors.error(this + " is not of type: FLOAT.");
		return null;
	}

	public SubLEnvironment toEnv() {
		Errors.error(this + " is not of type: ENVIRONMENT.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLFixnum toFixnum() { // SubLFixnum
		this.type_error(this, "FIXNUM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLGuid toGuid() { // SubLGuid
		this.type_error(this, "GUID");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtable toHashtable() { // SubLHashtable
		this.type_error(this, "HASHTABLE");
		return null;
	}

	/** Method created to avoid casting */
	public SubLHashtableIterator toHashtableIterator() { // SubLHashtableIterator
		this.type_error(this, "HASHTABLE-ITERATOR");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
		this.type_error(this, "INPUT-BINARY-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputStream toInputStream() { // SubLStream
		this.type_error(this, "INPUT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInputTextStream toInputTextStream() { // SubLStream
		this.type_error(this, "INPUT-TEXT-STREAM");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInteger toInteger() { // SubLInteger
		this.type_error(this, "INTEGER");
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
		Errors.error(this + " is not of type: PACKAGE.");
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

	public SubLStruct toStruct() {
		Errors.error(this + " is not of type: STRUCTURE.");
		return null;
	}

	public SubLSymbol toSymbol() {
		Errors.error(this + " is not of type: SYMBOL.");
		return null;
	}

	public String toTypeName() {
		return "OBJECT";
	}

	public SubLVector toVect() {
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}
}
