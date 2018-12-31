//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;

public interface SubLOutputBinaryStream extends SubLOutputStream, CommonSymbols {
	void write(byte[] p0);

	void write(byte[] p0, int p1, int p2);

	void write(int p0);

	void writePositiveIntegerAsByteSequence(long p0, int p1, boolean p2);
}
