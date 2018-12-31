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
	private SubLObject structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject add(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public void addKey(SubLObject key) {
		Errors.error(this + " is not of type: KEYHASH.");
	}

	@Override
	public SubLList asArrayList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public SubLList asConsList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public BigInteger bigIntegerValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return BigInteger.ZERO;
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	@Override
	public char charValue() {
		Errors.error(this + " is not of type: CHAR.");
		return '\0';
	}

	@Override
	public void checkType(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public Object clone() {
		Errors.unimplementedMethod("clone()");
		return null;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject dec() {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public double doubleValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Double.MIN_VALUE;
	}

	@Override
	public SubLObject eighth() {
		return this.get(7);
	}

	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + toTypeName()));
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj == this;
	}

	@Override
	public boolean equal(SubLObject obj) {
		return eql(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return equal(obj);
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this;
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public SubLObject fifth() {
		return this.get(4);
	}

	@Override
	public SubLObject first() {
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject fourth() {
		return this.get(3);
	}

	@Override
	public SubLObject get(int index) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject get(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	@Override
	public SubLCharacter getCharacter(int index) {
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	@Override
	public SubLObject getField(int fieldNum) {
		Errors.error(this + " is not of type: STRUCT.");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject getField0() {
		return structFieldError(0);
	}

	@Override
	public SubLObject getField1() {
		return structFieldError(1);
	}

	@Override
	public SubLObject getField10() {
		return structFieldError(10);
	}

	@Override
	public SubLObject getField11() {
		return structFieldError(11);
	}

	@Override
	public SubLObject getField12() {
		return structFieldError(12);
	}

	@Override
	public SubLObject getField13() {
		return structFieldError(13);
	}

	@Override
	public SubLObject getField14() {
		return structFieldError(14);
	}

	@Override
	public SubLObject getField15() {
		return structFieldError(15);
	}

	@Override
	public SubLObject getField16() {
		return structFieldError(16);
	}

	@Override
	public SubLObject getField17() {
		return structFieldError(17);
	}

	@Override
	public SubLObject getField18() {
		return structFieldError(18);
	}

	@Override
	public SubLObject getField19() {
		return structFieldError(19);
	}

	@Override
	public SubLObject getField2() {
		return structFieldError(2);
	}

	@Override
	public SubLObject getField20() {
		return structFieldError(20);
	}

	@Override
	public SubLObject getField3() {
		return structFieldError(3);
	}

	@Override
	public SubLObject getField4() {
		return structFieldError(4);
	}

	@Override
	public SubLObject getField5() {
		return structFieldError(5);
	}

	@Override
	public SubLObject getField6() {
		return structFieldError(6);
	}

	@Override
	public SubLObject getField7() {
		return structFieldError(7);
	}

	@Override
	public SubLObject getField8() {
		return structFieldError(8);
	}

	@Override
	public SubLObject getField9() {
		return structFieldError(9);
	}

	@Override
	public String getFileDesignator() {
		Errors.error(this + " is not a file name designator.");
		return null;
	}

	@Override
	public SubLFunction getFunc() {
		Errors.error(this + " is not of type: FUNCTION.");
		return null;
	}

	@Override
	public int getNumSize() {
		Errors.error("Not a number: " + this + ".");
		return -1;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		Errors.error(this + " is not of type: STREAM.");
		return null;
	}

	@Override
	public String getString() {
		Errors.error(this + " is not of type: STRING.");
		return "";
	}

	@Override
	public SubLSymbol getType() {
		Errors.error(this + " does not have a type defined.");
		return null;
	}

	@Override
	public SubLFixnum getTypeCode() {
		Errors.error(this + " does not have a typecode defined.");
		return null;
	}

	@Override
	public int hashCode() {
		return this.hashCode(0);
	}

	@Override
	public boolean hasKey(SubLObject obj) {
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	@Override
	public SubLObject inc() {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public int intValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Integer.MIN_VALUE;
	}

	@Override
	public boolean isArrayBased() {
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	@Override
	public boolean isNegative() {
		return false;
	}

	@Override
	public boolean isPositive() {
		return false;
	}

	@Override
	public boolean isZero() {
		return false;
	}

	@Override
	public SubLObject last(int i) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public long longValue() {
		Errors.error(this + " is not of type: NUMBER.");
		return Long.MIN_VALUE;
	}

	@Override
	public SubLObject makeCopy() {
		Errors.unimplementedMethod("makeCopy()");
		return null;
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("makeDeepCopy()");
		return null;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public SubLObject ninth() {
		return this.get(8);
	}

	@Override
	public SubLObject nthCdr(int index) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public boolean numE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	@Override
	public boolean numG(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	@Override
	public boolean numGE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	@Override
	public boolean numL(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	@Override
	public boolean numLE(SubLObject x) {
		Errors.error(this + " is not of type: NUMBER.");
		return false;
	}

	@Override
	public SubLObject put(SubLObject key, SubLObject value) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	@Override
	public boolean remKey(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return false;
	}

	@Override
	public SubLObject remove(SubLObject obj) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject rest() {
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject second() {
		return this.get(1);
	}

	@Override
	public void set(int index, SubLObject val) {
		Errors.error(this + " is not of type: SEQUENCE.");
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		Errors.error(this + " is not of type: STRUCT.");
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		return structFieldError(0);
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		return structFieldError(1);
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		return structFieldError(10);
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		return structFieldError(11);
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		return structFieldError(12);
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		return structFieldError(13);
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		return structFieldError(14);
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		return structFieldError(15);
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		return structFieldError(16);
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		return structFieldError(17);
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		return structFieldError(18);
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		return structFieldError(19);
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		return structFieldError(2);
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		return structFieldError(20);
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		return structFieldError(3);
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		return structFieldError(4);
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		return structFieldError(5);
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		return structFieldError(6);
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		return structFieldError(7);
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		return structFieldError(8);
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		return structFieldError(9);
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public SubLObject seventh() {
		return this.get(6);
	}

	@Override
	public SubLObject sixth() {
		return this.get(5);
	}

	@Override
	public int size() {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	@Override
	public int size(int max) {
		Errors.error(this + " is not of type: SEQUENCE.");
		return -1;
	}

	@Override
	public SubLObject sub(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public int superHash() {
		return super.hashCode();
	}

	@Override
	public SubLObject tenth() {
		return this.get(9);
	}

	@Override
	public SubLObject third() {
		return this.get(2);
	}

	@Override
	public SubLCharacter toChar() {
		Errors.error(this + " is not of type: CHAR.");
		return null;
	}

	@Override
	public SubLCons toCons() {
		Errors.error(this + " is not of type: CONS.");
		return null;
	}

	@Override
	public SubLDoubleFloat toDouble() {
		Errors.error(this + " is not of type: FLOAT.");
		return null;
	}

	@Override
	public SubLEnvironment toEnv() {
		Errors.error(this + " is not of type: ENVIRONMENT.");
		return null;
	}

	@Override
	public SubLFixnum toFixnum() {
		Errors.error(this + " is not of type: FIXNUM.");
		return null;
	}

	@Override
	public SubLGuid toGuid() {
		Errors.error(this + " is not of type: GUID.");
		return null;
	}

	@Override
	public SubLHashtable toHashtable() {
		Errors.error(this + " is not of type: HASHTABLE.");
		return null;
	}

	@Override
	public SubLHashtableIterator toHashtableIterator() {
		Errors.error(this + " is not of type: HASHTABLE-ITERATOR.");
		return null;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		Errors.error(this + " is not of type: INPUT-BINARY-STREAM.");
		return null;
	}

	@Override
	public SubLInputStream toInputStream() {
		Errors.error(this + " is not of type: INPUT-STREAM.");
		return null;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		Errors.error(this + " is not of type: INPUT-TEXT-STREAM.");
		return null;
	}

	@Override
	public SubLInteger toInteger() {
		Errors.error(this + " is not of type: INTEGER.");
		return null;
	}

	@Override
	public SubLKeyhash toKeyhash() {
		Errors.error(this + " is not of type: KEYHASH.");
		return null;
	}

	@Override
	public SubLKeyhashIterator toKeyhashIterator() {
		Errors.error(this + " is not of type: KEYHASH-ITERATOR.");
		return null;
	}

	@Override
	public SubLList toList() {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	@Override
	public SubLLock toLock() {
		Errors.error(this + " is not of type: LOCK.");
		return null;
	}

	@Override
	public SubLMacro toMacro() {
		Errors.error(this + " is not of type: MACRO.");
		return null;
	}

	@Override
	public SubLNumber toNumber() {
		Errors.error(this + " is not of type: NUMBER.");
		return null;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		Errors.error(this + " is not of type: OUTPUT-BINARY-STREAM.");
		return null;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		Errors.error(this + " is not of type: OUTPUT-STREAM.");
		return null;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		Errors.error(this + " is not of type: OUTPUT-TEXT-STREAM.");
		return null;
	}

	@Override
	public SubLPackage toPackage() {
		Errors.error(this + " is not of type: PACKAGE.");
		return null;
	}

	@Override
	public SubLPackageIterator toPackageIterator() {
		Errors.error(this + " is not of type: PACKAGE.");
		return null;
	}

	@Override
	public SubLProcess toProcess() {
		Errors.error(this + " is not of type: PROCESS.");
		return null;
	}

	@Override
	public SubLReadWriteLock toReadWriteLock() {
		Errors.error(this + " is not of type: READ-WRITE-LOCK.");
		return null;
	}

	@Override
	public SubLRegexPattern toRegexPattern() {
		Errors.error(this + " is not of type: REGEX-PATTERN.");
		return null;
	}

	@Override
	public SubLSemaphore toSemaphore() {
		Errors.error(this + " is not of type: SEMAPHORE.");
		return null;
	}

	@Override
	public SubLSequence toSeq() {
		Errors.error(this + " is not of type: SEQUENCE.");
		return null;
	}

	@Override
	public SubLString toStr() {
		Errors.error(this + " is not of type: STRING.");
		return null;
	}

	@Override
	public SubLStruct toStruct() {
		Errors.error(this + " is not of type: STRUCTURE.");
		return null;
	}

	@Override
	public SubLSymbol toSymbol() {
		Errors.error(this + " is not of type: SYMBOL.");
		return null;
	}

	@Override
	public String toTypeName() {
		return "OBJECT";
	}

	@Override
	public SubLVector toVect() {
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}
}
