//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public interface SubLOutputTextStream extends SubLOutputStream, SubLOutputBinaryStream, CommonSymbols {
	boolean freshLine();

	void writeChar(char p0);

	void writeChar(char[] p0);

	void writeChar(char[] p0, int p1, int p2);

	void writeNewline();

	void writeString(String p0);

	void writeString(String p0, int p1, int p2);
}
