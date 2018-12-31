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
	SubLStructInterpreted(int size) {
		fieldValues = new SubLObject[size + 2];
		clear();
		fieldValues[0] = SubLNumberFactory.makeInteger(size);
	}

	private int id;
	private SubLStructDecl structDecl;
	private SubLObject[] fieldValues;

	@Override
	public boolean canFastHash() {
		return structDecl != null && structDecl.isInterned;
	}

	@Override
	public void clear() {
		Arrays.fill(fieldValues, CommonSymbols.NIL);
	}

	@Override
	public SubLObject getField(int slotNum) {
		return fieldValues[slotNum];
	}

	@Override
	public SubLObject getField0() {
		return this.getField(0);
	}

	@Override
	public SubLObject getField1() {
		return this.getField(1);
	}

	@Override
	public SubLObject getField10() {
		return this.getField(10);
	}

	@Override
	public SubLObject getField11() {
		return this.getField(11);
	}

	@Override
	public SubLObject getField12() {
		return this.getField(12);
	}

	@Override
	public SubLObject getField13() {
		return this.getField(13);
	}

	@Override
	public SubLObject getField14() {
		return this.getField(14);
	}

	@Override
	public SubLObject getField15() {
		return this.getField(15);
	}

	@Override
	public SubLObject getField16() {
		return this.getField(16);
	}

	@Override
	public SubLObject getField17() {
		return this.getField(17);
	}

	@Override
	public SubLObject getField18() {
		return this.getField(18);
	}

	@Override
	public SubLObject getField19() {
		return this.getField(19);
	}

	@Override
	public SubLObject getField2() {
		return this.getField(2);
	}

	@Override
	public SubLObject getField20() {
		return this.getField(20);
	}

	@Override
	public SubLObject getField3() {
		return this.getField(3);
	}

	@Override
	public SubLObject getField4() {
		return this.getField(4);
	}

	@Override
	public SubLObject getField5() {
		return this.getField(5);
	}

	@Override
	public SubLObject getField6() {
		return this.getField(6);
	}

	@Override
	public SubLObject getField7() {
		return this.getField(7);
	}

	@Override
	public SubLObject getField8() {
		return this.getField(8);
	}

	@Override
	public SubLObject getField9() {
		return this.getField(9);
	}

	@Override
	public int getFieldCount() {
		if (fieldValues == null)
			return 0;
		return fieldValues.length - 2;
	}

	@Override
	public SubLSymbol getName() {
		return fieldValues[1].toSymbol();
	}

	@Override
	public SubLStructDecl getStructDecl() {
		return structDecl;
	}

	@Override
	public int id() {
		return id;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return true;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public void setField(int slotNum, SubLObject value) {
		if (slotNum == 0 || slotNum == 1)
			Errors.error("Can't set special slots on structs.");
		fieldValues[slotNum] = value;
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		return Errors.error("Can't set field 0 on structs (special).");
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		return Errors.error("Can't set field 1 on structs (special).");
	}

	@Override
	public SubLObject setField10(SubLObject newVal) {
		this.setField(10, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField11(SubLObject newVal) {
		this.setField(11, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField12(SubLObject newVal) {
		this.setField(12, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField13(SubLObject newVal) {
		this.setField(13, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField14(SubLObject newVal) {
		this.setField(14, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField15(SubLObject newVal) {
		this.setField(15, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField16(SubLObject newVal) {
		this.setField(16, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField17(SubLObject newVal) {
		this.setField(17, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField18(SubLObject newVal) {
		this.setField(18, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField19(SubLObject newVal) {
		this.setField(19, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField2(SubLObject newVal) {
		this.setField(2, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField20(SubLObject newVal) {
		this.setField(20, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField3(SubLObject newVal) {
		this.setField(3, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField4(SubLObject newVal) {
		this.setField(4, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField5(SubLObject newVal) {
		this.setField(5, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField6(SubLObject newVal) {
		this.setField(6, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField7(SubLObject newVal) {
		this.setField(7, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField8(SubLObject newVal) {
		this.setField(8, newVal);
		return newVal;
	}

	@Override
	public SubLObject setField9(SubLObject newVal) {
		this.setField(9, newVal);
		return newVal;
	}

	@Override
	public void setName(SubLSymbol type) {
		fieldValues[1] = type;
		id = SubLStructDecl.getTypeID(type);
	}

	public void setStructDecl(SubLStructDecl structDecl) {
		this.structDecl = structDecl;
	}
}
