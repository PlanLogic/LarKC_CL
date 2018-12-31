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
	private void structFieldError(int fieldNum) {
		if (!(this instanceof SubLStruct))
			Errors.error(this + " is not of type STRUCTURE.");
		else
			Errors.error(this + " does not have a slot: " + fieldNum + ".");
	}

	@Override
	public SubLNumber abs() {
		Errors.unimplementedMethod("AbstractSubLNumber.abs");
		return null;
	}

	@Override
	public SubLNumber add(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.add");
		return null;
	}

	@Override
	public void addKey(SubLObject key) {
		Errors.error(this + " is not of type: KEYHASH.");
	}

	@Override
	public SubLNumber arcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcCosine");
		return null;
	}

	@Override
	public SubLNumber arcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcSine");
		return null;
	}

	@Override
	public SubLNumber arcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.arcTangent");
		return null;
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
		return new BigInteger(toString());
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public SubLInteger ceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.ceiling");
		return null;
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
		return this;
	}

	@Override
	public int compareTo(Object o) {
		SubLNumber num = (SubLNumber) o;
		if (num.isBigIntegerBignum() || isBigIntegerBignum())
			return bigIntegerValue().compareTo(num.bigIntegerValue());
		if (num.isDouble() || isDouble()) {
			double a = doubleValue();
			double b = num.doubleValue();
			return a < b ? -1 : a > b ? 1 : 0;
		}
		if (num.isLongBignum() || isLongBignum()) {
			long a2 = longValue();
			long b2 = num.longValue();
			return a2 < b2 ? -1 : a2 > b2 ? 1 : 0;
		}
		int a3 = intValue();
		int b3 = num.intValue();
		return a3 < b3 ? -1 : a3 > b3 ? 1 : 0;
	}

	@Override
	public SubLNumber cosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.cosine");
		return null;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	@Override
	public SubLNumber decrement() {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	@Override
	public SubLNumber decrement(SubLNumber decrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.decrement");
		return null;
	}

	@Override
	public SubLNumber divide(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.divide");
		return null;
	}

	@Override
	public SubLObject eighth() {
		return this.get(7);
	}

	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(
					"Got invalid type for object: " + this + "." + "\nWanted: " + predicate + "\nGot: " + toTypeName());
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return obj.isNumber() && numE(obj);
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof SubLObject && eql((SubLObject) obj);
	}

	@Override
	public SubLObject eval(SubLEnvironment env) {
		return this;
	}

	@Override
	public SubLFloat fceiling() {
		Errors.unimplementedMethod("AbstractSubLNumber.fceiling");
		return null;
	}

	@Override
	public SubLFloat ffloor() {
		Errors.unimplementedMethod("AbstractSubLNumber.ffloor");
		return null;
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
	public SubLInteger floor() {
		Errors.unimplementedMethod("AbstractSubLNumber.floor");
		return null;
	}

	@Override
	public SubLObject fourth() {
		return this.get(3);
	}

	@Override
	public SubLFloat fround() {
		Errors.unimplementedMethod("AbstractSubLNumber.fround");
		return null;
	}

	@Override
	public SubLFloat ftruncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.ftruncate");
		return null;
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
		structFieldError(0);
		return null;
	}

	@Override
	public SubLObject getField1() {
		structFieldError(1);
		return null;
	}

	@Override
	public SubLObject getField10() {
		structFieldError(10);
		return null;
	}

	@Override
	public SubLObject getField11() {
		structFieldError(11);
		return null;
	}

	@Override
	public SubLObject getField12() {
		structFieldError(12);
		return null;
	}

	@Override
	public SubLObject getField13() {
		structFieldError(13);
		return null;
	}

	@Override
	public SubLObject getField14() {
		structFieldError(14);
		return null;
	}

	@Override
	public SubLObject getField15() {
		structFieldError(15);
		return null;
	}

	@Override
	public SubLObject getField16() {
		structFieldError(16);
		return null;
	}

	@Override
	public SubLObject getField17() {
		structFieldError(17);
		return null;
	}

	@Override
	public SubLObject getField18() {
		structFieldError(18);
		return null;
	}

	@Override
	public SubLObject getField19() {
		structFieldError(19);
		return null;
	}

	@Override
	public SubLObject getField2() {
		structFieldError(2);
		return null;
	}

	@Override
	public SubLObject getField20() {
		structFieldError(20);
		return null;
	}

	@Override
	public SubLObject getField3() {
		structFieldError(3);
		return null;
	}

	@Override
	public SubLObject getField4() {
		structFieldError(4);
		return null;
	}

	@Override
	public SubLObject getField5() {
		structFieldError(5);
		return null;
	}

	@Override
	public SubLObject getField6() {
		structFieldError(6);
		return null;
	}

	@Override
	public SubLObject getField7() {
		structFieldError(7);
		return null;
	}

	@Override
	public SubLObject getField8() {
		structFieldError(8);
		return null;
	}

	@Override
	public SubLObject getField9() {
		structFieldError(9);
		return null;
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
	public int hashCode() {
		return this.hashCode(0);
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return getNativeNumber().hashCode();
		return 0;
	}

	@Override
	public boolean hasKey(SubLObject obj) {
		Errors.error(this + " is not of type: KEYHASH.");
		return false;
	}

	@Override
	public SubLNumber hyperbolicArcCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcCosine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicArcSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcSine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicArcTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicArcTangent");
		return null;
	}

	@Override
	public SubLNumber hyperbolicCosine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicCosine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicSine() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicSine");
		return null;
	}

	@Override
	public SubLNumber hyperbolicTangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.hyperbolicTangent");
		return null;
	}

	@Override
	public SubLNumber increment() {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	@Override
	public SubLNumber increment(SubLNumber incrementSize) {
		Errors.unimplementedMethod("AbstractSubLNumber.increment");
		return null;
	}

	@Override
	public boolean isArrayBased() {
		Errors.error(this + " is not of type: LIST.");
		return true;
	}

	@Override
	public SubLObject last(int i) {
		Errors.error(this + " is not of type: LIST.");
		return this;
	}

	@Override
	public SubLNumber log() {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	@Override
	public SubLNumber log(SubLNumber base) {
		Errors.unimplementedMethod("AbstractSubLNumber.log");
		return null;
	}

	@Override
	public SubLObject makeCopy() {
		return this;
	}

	@Override
	public SubLObject makeDeepCopy() {
		return this;
	}

	@Override
	public SubLNumber max(SubLNumber num) {
		return numL(num) ? num : this;
	}

	@Override
	public SubLNumber min(SubLNumber num) {
		return numL(num) ? this : num;
	}

	@Override
	public SubLInteger mod(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.mod");
		return null;
	}

	@Override
	public SubLNumber multiply(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.multiply");
		return null;
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
	public boolean numE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return numericallyEqualInternal(num);
		return num.toNumber().numericallyEqualInternal(this);
	}

	@Override
	public boolean numG(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return greaterThanInternal(num);
		return num.toNumber().lessThanInternal(this);
	}

	@Override
	public boolean numGE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return greaterThanOrEqualInternal(num);
		return num.toNumber().lessThanOrEqualInternal(this);
	}

	@Override
	public boolean numL(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return lessThanInternal(num);
		return num.toNumber().greaterThanInternal(this);
	}

	@Override
	public boolean numLE(SubLObject num) {
		if (getNumSize() >= num.getNumSize())
			return lessThanOrEqualInternal(num);
		return num.toNumber().greaterThanOrEqualInternal(this);
	}

	@Override
	public SubLNumber pow(SubLNumber power) {
		Errors.unimplementedMethod("AbstractSubLNumber.pow");
		return null;
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
	public SubLInteger remainder(SubLNumber divisor) {
		Errors.unimplementedMethod("AbstractSubLNumber.remainder");
		return null;
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
	public SubLInteger round() {
		Errors.unimplementedMethod("AbstractSubLNumber.round");
		return null;
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
		structFieldError(0);
		return null;
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		structFieldError(1);
		return null;
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		structFieldError(10);
		return null;
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		structFieldError(11);
		return null;
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		structFieldError(12);
		return null;
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		structFieldError(13);
		return null;
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		structFieldError(14);
		return null;
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		structFieldError(15);
		return null;
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		structFieldError(16);
		return null;
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		structFieldError(17);
		return null;
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		structFieldError(18);
		return null;
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		structFieldError(19);
		return null;
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		structFieldError(2);
		return null;
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		structFieldError(20);
		return null;
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		structFieldError(3);
		return null;
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		structFieldError(4);
		return null;
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		structFieldError(5);
		return null;
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		structFieldError(6);
		return null;
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		structFieldError(7);
		return null;
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		structFieldError(8);
		return null;
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		structFieldError(9);
		return null;
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
	public SubLNumber sigNum() {
		Errors.unimplementedMethod("AbstractSubLNumber.sigNum");
		return null;
	}

	@Override
	public SubLNumber sine() {
		Errors.unimplementedMethod("AbstractSubLNumber.sine");
		return null;
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
	public SubLNumber sqrt(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.sqrt");
		return null;
	}

	@Override
	public SubLNumber subtract(SubLNumber num) {
		Errors.unimplementedMethod("AbstractSubLNumber.subtract");
		return null;
	}

	@Override
	public int superHash() {
		return super.hashCode();
	}

	@Override
	public SubLNumber tangent() {
		Errors.unimplementedMethod("AbstractSubLNumber.tangent");
		return null;
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
	public SubLEnvironment toEnv() {
		Errors.error(this + " is not of type: ENVIRONMENT.");
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
		return this;
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
		Errors.error(this + " is not of type: PACKAGE-ITERATOR.");
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
	public String toString() {
		return getNativeNumber().toString();
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
	public SubLVector toVect() {
		Errors.error(this + " is not of type: VECTOR.");
		return null;
	}

	@Override
	public SubLInteger truncate() {
		Errors.unimplementedMethod("AbstractSubLNumber.truncate");
		return null;
	}
}
