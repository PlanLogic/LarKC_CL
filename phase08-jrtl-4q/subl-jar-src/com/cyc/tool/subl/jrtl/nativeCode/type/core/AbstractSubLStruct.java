//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public abstract class AbstractSubLStruct extends AbstractSubLObject implements SubLStruct {
	public static String STRUCT_TYPE_NAME = "STRUCT";

	@Override
	public boolean equalp(SubLObject obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!obj.isStructure())
			return false;
		SubLStruct otherStuct = obj.toStruct();
		SubLStructDecl decl = getStructDecl();
		SubLStructDecl otherDecl = otherStuct.getStructDecl();
		if (decl != null && otherDecl != null) {
			if (decl.isInterned || decl != otherDecl)
				return false;
		} else if (!getField0().equalp(otherStuct.getField0()) || !getField1().equalp(otherStuct.getField1()))
			return false;
		int fieldCount = getFieldCount();
		switch (fieldCount) {
		case 19:
			if (!getField20().equalp(otherStuct.getField20()))
				return false;
		case 18:
			if (!getField19().equalp(otherStuct.getField19()))
				return false;
		case 17:
			if (!getField18().equalp(otherStuct.getField18()))
				return false;
		case 16:
			if (!getField17().equalp(otherStuct.getField17()))
				return false;
		case 15:
			if (!getField16().equalp(otherStuct.getField16()))
				return false;
		case 14:
			if (!getField15().equalp(otherStuct.getField15()))
				return false;
		case 13:
			if (!getField14().equalp(otherStuct.getField14()))
				return false;
		case 12:
			if (!getField13().equalp(otherStuct.getField13()))
				return false;
		case 11:
			if (!getField12().equalp(otherStuct.getField12()))
				return false;
		case 10:
			if (!getField11().equalp(otherStuct.getField11()))
				return false;
		case 9:
			if (!getField10().equalp(otherStuct.getField10()))
				return false;
		case 8:
			if (!getField9().equalp(otherStuct.getField9()))
				return false;
		case 7:
			if (!getField8().equalp(otherStuct.getField8()))
				return false;
		case 6:
			if (!getField7().equalp(otherStuct.getField7()))
				return false;
		case 5:
			if (!getField6().equalp(otherStuct.getField6()))
				return false;
		case 4:
			if (!getField5().equalp(otherStuct.getField5()))
				return false;
		case 3:
			if (!getField4().equalp(otherStuct.getField4()))
				return false;
		case 2:
			if (!getField3().equalp(otherStuct.getField3()))
				return false;
		case 1:
			if (!getField2().equalp(otherStuct.getField2()))
				return false;
			break;
		}
		if (fieldCount >= 20)
			for (int i = 19; i < fieldCount; ++i) {
				int index = i + 1;
				if (!this.getField(index).equalp(otherStuct.getField(index)))
					return false;
			}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isStructure())
			return false;
		SubLStruct other = sublObj.toStruct();
		if (getName() != other.getName())
			return false;
		if (getFieldCount() != other.getFieldCount())
			return false;
		for (int i = 0, size = getFieldCount(); i < size; ++i) {
			int index = i + 2;
			if (!this.getField(index).equals(other.getField(index)))
				return false;
		}
		return true;
	}

	@Override
	public SubLObject getField(SubLSymbol fieldName) {
		int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
		return this.getField(fieldNum);
	}

	@Override
	public int getFieldCount() {
		SubLStructDecl decl = getStructDecl();
		if (decl == null)
			return 0;
		return decl.getFieldCount();
	}

	@Override
	public SubLSymbol getName() {
		return getStructDecl().getStructName();
	}

	@Override
	public SubLSymbol getType() {
		return getName();
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FIFTY_FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		return Sxhash.sxhash(this).intValue();
	}

	@Override
	public int id() {
		return getStructDecl().getId();
	}

	public void init(int size) {
	}

	@Override
	public void setField(SubLSymbol fieldName, SubLObject value) {
		int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
		this.setField(fieldNum, value);
	}

	@Override
	public String toString() {
		try {
			return print_high.princ_to_string(this).getString();
		} catch (Exception e) {
			return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
		}
	}

	@Override
	public SubLStruct toStruct() {
		return this;
	}

	@Override
	public String toTypeName() {
		return "STRUCT";
	}
}
