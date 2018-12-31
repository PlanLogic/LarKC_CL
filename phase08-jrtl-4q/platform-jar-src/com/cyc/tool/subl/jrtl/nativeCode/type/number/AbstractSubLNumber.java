//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
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

public abstract class AbstractSubLNumber extends Number implements SubLNumber, SubLObject, Comparable, CommonSymbols {

	public SubLNumber abs() {
		Errors.unimplementedMethod("AbstractSubLNumber.abs");
		return null;
	}

	public SubLNumber add(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.add");
		return null;
	}

	public void addKey(SubLObject key) {
		Errors.error(this + " is not of type: KEYHASH.");
	}

	public SubLNumber arcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcCosine");
		return null;
	}

	public SubLNumber arcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcSine");
		return null;
	}

	public SubLNumber arcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcTangent");
		return null;
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
		return new BigInteger(this.toString());
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLInteger ceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.ceiling");
		return null;
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

	public int compareTo(Object o) {
		SubLNumber num = (SubLNumber) o;
		if (num.isBigIntegerBignum() || this.isBigIntegerBignum())
			return this.bigIntegerValue().compareTo(num.bigIntegerValue());
		if (num.isDouble() || this.isDouble()) {
			double a = this.doubleValue();
			double b = num.doubleValue();
			return a < b ? -1 : a > b ? 1 : 0;
		}
		if (num.isLongBignum() || this.isLongBignum()) {
			long a2 = this.longValue();
			long b2 = num.longValue();
			return a2 < b2 ? -1 : a2 > b2 ? 1 : 0;
		}
		int a3 = this.intValue();
		int b3 = num.intValue();
		return a3 < b3 ? -1 : a3 > b3 ? 1 : 0;
	}

	public SubLNumber cosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.cosine");
		return null;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	public SubLNumber decrement() {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	public SubLNumber decrement(SubLNumber decrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	public SubLNumber divide(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.divide");
		return null;
	}

	public SubLObject eighth() {
		return this.get(7);
	}

	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error("Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: "
					+ this.toTypeName());
	}

	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	public boolean equalp(SubLObject obj) {
		return obj.isNumber() && this.numE(obj);
	}

	public boolean equals(Object obj) {
		return obj instanceof SubLObject && this.eql((SubLObject) obj);
	}

	public SubLObject eval(SubLEnvironment env) {
		return this;
	}

	public SubLFloat fceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.fceiling");
		return null;
	}

	public SubLFloat ffloor() {
		Errors.unimplementedMethod("AbstractSubLNumber.ffloor");
		return null;
	}

	public SubLObject fifth() {
		return this.get(4);
	}

	public SubLObject first() {
		Errors.error(this + " is not of type: LIST.");
		return SubLNil.NIL;
	}

	public SubLInteger floor() {
		Errors.unimplementedMethod("AbstractSubLNumber.floor");
		return null;
	}

	public SubLObject fourth() {
		return this.get(3);
	}

	public SubLFloat fround() {
		Errors.unimplementedMethod("AbstractSubLNumber.fround");
		return null;
	}

	public SubLFloat ftruncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.ftruncate");
		return null;
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

	public SubLStream getStream(boolean followSynonymStream) {
		Errors.error(this + " is not of type: STREAM.");
		return null;
	}

	public String getString() {
		Errors.error(this + " is not of type: STRING.");
		return "";
	}

	public int hashCode() {
		return this.hashCode(0);
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return this.getNativeNumber().hashCode();
		return 0;
	}

	public boolean hasKey(SubLObject obj) {
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	public SubLNumber hyperbolicArcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcCosine");
		return null;
	}

	public SubLNumber hyperbolicArcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcSine");
		return null;
	}

	public SubLNumber hyperbolicArcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcTangent");
		return null;
	}

	public SubLNumber hyperbolicCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicCosine");
		return null;
	}

	public SubLNumber hyperbolicSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicSine");
		return null;
	}

	public SubLNumber hyperbolicTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicTangent");
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

	public boolean isArrayBased() {
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	public SubLObject last(int i) {
		Errors.error(this + " is not of type: LIST.");
		return this;
	}

	public SubLNumber log() {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	public SubLNumber log(SubLNumber base) {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public SubLNumber max(SubLNumber num) {
		return this.numL(num) ? num : this;
	}

	public SubLNumber min(SubLNumber num) {
		return this.numL(num) ? this : num;
	}

	public SubLInteger mod(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.mod");
		return null;
	}

	public SubLNumber multiply(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.multiply");
		return null;
	}

	public SubLObject ninth() {
		return this.get(8);
	}

	public SubLObject nthCdr(int index) {
		Errors.error(this + " is not of type: LIST.");
		return null;
	}

	public boolean numE(SubLObject num) {
		if (this.getNumSize() >= num.getNumSize())
			return this.numericallyEqualInternal(num);
		return num.toNumber().numericallyEqualInternal(this);
	}

	public boolean numG(SubLObject num) {
		if (this.getNumSize() >= num.getNumSize())
			return this.greaterThanInternal(num);
		return num.toNumber().lessThanInternal(this);
	}

	public boolean numGE(SubLObject num) {
		if (this.getNumSize() >= num.getNumSize())
			return this.greaterThanOrEqualInternal(num);
		return num.toNumber().lessThanOrEqualInternal(this);
	}

	public boolean numL(SubLObject num) {
		if (this.getNumSize() >= num.getNumSize())
			return this.lessThanInternal(num);
		return num.toNumber().greaterThanInternal(this);
	}

	public boolean numLE(SubLObject num) {
		if (this.getNumSize() >= num.getNumSize())
			return this.lessThanOrEqualInternal(num);
		return num.toNumber().greaterThanOrEqualInternal(this);
	}

	public SubLNumber pow(SubLNumber power) {
		Errors.unimplementedMethod("AbstractSubLNumber.pow");
		return null;
	}

	public SubLObject put(SubLObject key, SubLObject value) {
		Errors.error(this + " is not of type: HASHTABLE.");
		return SubLNil.NIL;
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	public SubLInteger remainder(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.remainder");
		return null;
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

	public SubLInteger round() {
		Errors.unimplementedMethod("AbstractSubLNumber.round");
		return null;
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

	public SubLNumber sigNum() {
		Errors.unimplementedMethod("AbstractSubLNumber.sigNum");
		return null;
	}

	public SubLNumber sine() {
		Errors.unimplementedMethod("AbstractSubLNumber.sine");
		return null;
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

	public SubLNumber sqrt(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.sqrt");
		return null;
	}

	private void structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
	}

	public SubLNumber subtract(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.subtract");
		return null;
	}

	public int superHash() {
		return super.hashCode();
	}

	public SubLNumber tangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.tangent");
		return null;
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

	public SubLEnvironment toEnv() {
		Errors.error(this + " is not of type: ENVIRONMENT.");
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
		return this;
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
		return this.getNativeNumber().toString();
	}

	public SubLStruct toStruct() {
		Errors.error(this + " is not of type: STRUCTURE.");
		return null;
	}

	public SubLSymbol toSymbol() {
		Errors.error(this + " is not of type: SYMBOL.");
		return null;
	}

	public SubLVector toVect() {
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}

	public SubLInteger truncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.truncate");
		return null;
	}
}
