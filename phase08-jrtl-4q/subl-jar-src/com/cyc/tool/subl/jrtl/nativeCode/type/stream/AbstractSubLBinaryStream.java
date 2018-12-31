//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLBinaryStream extends AbstractRandomAccessSubLStream {
	AbstractSubLBinaryStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(fileName, elementType, direction, ifExists, ifNotExists);
		if (elementType != CommonSymbols.BINARY_KEYWORD)
			Errors.error("Got bad stream element type: " + elementType);
	}

	AbstractSubLBinaryStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		if (elementType != CommonSymbols.BINARY_KEYWORD)
			Errors.error("Got bad stream element type: " + elementType);
	}
}
