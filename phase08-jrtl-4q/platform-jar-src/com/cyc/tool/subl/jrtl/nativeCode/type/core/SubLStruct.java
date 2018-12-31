//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLStruct extends SubLObject {
	void clear();

	SubLObject getField(int p0);

	SubLObject getField(SubLSymbol p0);

	int getFieldCount();

	SubLSymbol getName();

	SubLStructDecl getStructDecl();

	int id();

	void setField(int p0, SubLObject p1);

	void setField(SubLSymbol p0, SubLObject p1);

	void setName(SubLSymbol p0);
}
