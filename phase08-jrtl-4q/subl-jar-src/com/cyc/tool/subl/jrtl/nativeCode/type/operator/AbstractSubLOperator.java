//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLOperator extends AbstractSubLObject implements SubLOperator {
	AbstractSubLOperator() {
		this(null);
	}

	AbstractSubLOperator(SubLSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
		if (functionSymbol != null)
			functionSymbol.setFunction(this);
	}

	private SubLSymbol functionSymbol;
	public static String SPECIAL_OPERATOR_NAME;
	static {
		AbstractSubLOperator.SPECIAL_OPERATOR_NAME = "SPECIAL-OPERATOR";
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public SubLSymbol getFunctionSymbol() {
		return functionSymbol;
	}

	@Override
	public SubLSpecialOperator toSpecialOperator() {
		Errors.error(this + " is not of type: SPECIAL-OPERATOR.");
		return null;
	}

	@Override
	public String toTypeName() {
		return AbstractSubLOperator.SPECIAL_OPERATOR_NAME;
	}
}
