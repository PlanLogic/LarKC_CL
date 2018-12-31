/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLOperator extends AbstractSubLObject implements SubLOperator {

	public static String SPECIAL_OPERATOR_NAME = "SPECIAL-OPERATOR";

	private SubLSymbol functionSymbol;

	//// Constructors

	/** Creates a new instance of AbstractSubLOperator. */
	AbstractSubLOperator() {
		this(null);
	}

	AbstractSubLOperator(SubLSymbol functionSymbol) {
		this.functionSymbol = functionSymbol;
		if (functionSymbol != null)
			functionSymbol.setFunction(this);
	}

	//// Public Area

	public boolean canFastHash() {
		return true;
	}

	public SubLSymbol getFunctionSymbol() {
		return this.functionSymbol;
	}

	public SubLSpecialOperator toSpecialOperator() {
		Errors.error(this + " is not of type: SPECIAL-OPERATOR.");
		return null;
	}

	// todo make abstract - prefers to be overriden
	// public String toString() {
	// if (this.functionSymbol == null) return
	// this.unreadableString(this.getClass().getSimpleName());
	// return this.unreadableString(this.getClass().getSimpleName() + " " +
	// this.functionSymbol.writeToString());

	// }

	public String toTypeName() {
		return AbstractSubLOperator.SPECIAL_OPERATOR_NAME;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Main

}
