/*
 * StandardGenericFunctionClass.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: StandardGenericFunctionClass.java 12288 2009-11-29 22:00:12Z vvoutilainen $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public class StandardGenericFunctionClass extends StandardClass {
	public static int SLOT_INDEX_NAME = 0;
	public static int SLOT_INDEX_LAMBDA_LIST = 1;
	public static int SLOT_INDEX_REQUIRED_ARGS = 2;
	public static int SLOT_INDEX_INITIAL_METHODS = 3;
	public static int SLOT_INDEX_METHODS = 4;
	public static int SLOT_INDEX_METHOD_CLASS = 5;
	public static int SLOT_INDEX_METHOD_COMBINATION = 6;
	public static int SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER = 7;
	public static int SLOT_INDEX_CLASSES_TO_EMF_TABLE = 8;
	public static int SLOT_INDEX_DOCUMENTATION = 9;

	public StandardGenericFunctionClass() {
		super(LispSymbols.STANDARD_GENERIC_FUNCTION, Lisp.list(StandardClass.GENERIC_FUNCTION));
		SubLPackage pkg = Lisp.PACKAGE_SYS;
		SubLObject[] instanceSlotNames = { pkg.intern("NAME"), pkg.intern("LAMBDA-LIST"), pkg.intern("REQUIRED-ARGS"),
				pkg.intern("INITIAL-METHODS"), pkg.intern("METHODS"), pkg.intern("METHOD-CLASS"),
				pkg.intern("METHOD-COMBINATION"), pkg.intern("ARGUMENT-PRECEDENCE-ORDER"),
				pkg.intern("CLASSES-TO-EMF-TABLE"), LispSymbols.DOCUMENTATION };
		this.setClassLayout(new Layout(this, instanceSlotNames, Lisp.NIL));
		this.setFinalized(true);
	}

	public SubLObject allocateInstance() {
		return new StandardGenericFunction();
	}
}
