//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLTextStream extends AbstractRandomAccessSubLStream {
	AbstractSubLTextStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(fileName, elementType, direction, ifExists, ifNotExists);
		if (elementType != CommonSymbols.TEXT_KEYWORD)
			Errors.error("Got bad stream element type: " + elementType);
	}

	AbstractSubLTextStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		if (elementType != CommonSymbols.TEXT_KEYWORD)
			Errors.error("Got bad stream element type: " + elementType);
	}
}
