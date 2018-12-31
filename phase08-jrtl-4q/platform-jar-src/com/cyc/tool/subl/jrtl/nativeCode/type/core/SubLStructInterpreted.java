//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStructInterpreted extends AbstractSubLStruct implements SubLStruct, CommonSymbols {
	private int id;

	private SubLStructDecl structDecl;
	private SubLObject[] fieldValues;

	SubLStructInterpreted(int size) {
		this.fieldValues = new SubLObject[size + 2];
		this.clear();
		this.fieldValues[0] = SubLNumberFactory.makeInteger(size);
	}

	public boolean canFastHash() {
		return this.structDecl != null && this.structDecl.isInterned;
	}

	public void clear() {
		Arrays.fill(this.fieldValues, CommonSymbols.NIL);
	}

	public SubLObject getField(int slotNum) {
		return this.fieldValues[slotNum];
	}

	public SubLObject getField0() {
		return this.getField(0);
	}

	public SubLObject getField1() {
		return this.getField(1);
	}

	public SubLObject getField10() {
		return this.getField(10);
	}

	public SubLObject getField11() {
		return this.getField(11);
	}

	public SubLObject getField12() {
		return this.getField(12);
	}

	public SubLObject getField13() {
		return this.getField(13);
	}

	public SubLObject getField14() {
		return this.getField(14);
	}

	public SubLObject getField15() {
		return this.getField(15);
	}

	public SubLObject getField16() {
		return this.getField(16);
	}

	public SubLObject getField17() {
		return this.getField(17);
	}

	public SubLObject getField18() {
		return this.getField(18);
	}

	public SubLObject getField19() {
		return this.getField(19);
	}

	public SubLObject getField2() {
		return this.getField(2);
	}

	public SubLObject getField20() {
		return this.getField(20);
	}

	public SubLObject getField3() {
		return this.getField(3);
	}

	public SubLObject getField4() {
		return this.getField(4);
	}

	public SubLObject getField5() {
		return this.getField(5);
	}

	public SubLObject getField6() {
		return this.getField(6);
	}

	public SubLObject getField7() {
		return this.getField(7);
	}

	public SubLObject getField8() {
		return this.getField(8);
	}

	public SubLObject getField9() {
		return this.getField(9);
	}

	public int getFieldCount() {
		if (this.fieldValues == null)
			return 0;
		return this.fieldValues.length - 2;
	}

	public SubLSymbol getName() {
		return this.fieldValues[1].toSymbol();
	}

	public SubLStructDecl getStructDecl() {
		return this.structDecl;
	}

	public int id() {
		return this.id;
	}

	public boolean isAlien() {
		return false;
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
		return false;
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
		return true;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public void setField(int slotNum, SubLObject value) {
		if (slotNum == 0 || slotNum == 1)
			Errors.error("Can't set special slots on structs.");
		this.fieldValues[slotNum] = value;
	}

	public SubLObject setField0(SubLObject newVal) {
		return Errors.error("Can't set field 0 on structs (special).");
	}

	public SubLObject setField1(SubLObject newVal) {
		return Errors.error("Can't set field 1 on structs (special).");
	}

	public SubLObject setField10(SubLObject newVal) {
		this.setField(10, newVal);
		return newVal;
	}

	public SubLObject setField11(SubLObject newVal) {
		this.setField(11, newVal);
		return newVal;
	}

	public SubLObject setField12(SubLObject newVal) {
		this.setField(12, newVal);
		return newVal;
	}

	public SubLObject setField13(SubLObject newVal) {
		this.setField(13, newVal);
		return newVal;
	}

	public SubLObject setField14(SubLObject newVal) {
		this.setField(14, newVal);
		return newVal;
	}

	public SubLObject setField15(SubLObject newVal) {
		this.setField(15, newVal);
		return newVal;
	}

	public SubLObject setField16(SubLObject newVal) {
		this.setField(16, newVal);
		return newVal;
	}

	public SubLObject setField17(SubLObject newVal) {
		this.setField(17, newVal);
		return newVal;
	}

	public SubLObject setField18(SubLObject newVal) {
		this.setField(18, newVal);
		return newVal;
	}

	public SubLObject setField19(SubLObject newVal) {
		this.setField(19, newVal);
		return newVal;
	}

	public SubLObject setField2(SubLObject newVal) {
		this.setField(2, newVal);
		return newVal;
	}

	public SubLObject setField20(SubLObject newVal) {
		this.setField(20, newVal);
		return newVal;
	}

	public SubLObject setField3(SubLObject newVal) {
		this.setField(3, newVal);
		return newVal;
	}

	public SubLObject setField4(SubLObject newVal) {
		this.setField(4, newVal);
		return newVal;
	}

	public SubLObject setField5(SubLObject newVal) {
		this.setField(5, newVal);
		return newVal;
	}

	public SubLObject setField6(SubLObject newVal) {
		this.setField(6, newVal);
		return newVal;
	}

	public SubLObject setField7(SubLObject newVal) {
		this.setField(7, newVal);
		return newVal;
	}

	public SubLObject setField8(SubLObject newVal) {
		this.setField(8, newVal);
		return newVal;
	}

	public SubLObject setField9(SubLObject newVal) {
		this.setField(9, newVal);
		return newVal;
	}

	public void setName(SubLSymbol type) {
		this.fieldValues[1] = type;
		this.id = SubLStructDecl.getTypeID(type);
	}

	public void setStructDecl(SubLStructDecl structDecl) {
		this.structDecl = structDecl;
	}
}
