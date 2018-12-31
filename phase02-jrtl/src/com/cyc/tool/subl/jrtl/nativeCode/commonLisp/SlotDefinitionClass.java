/*
 * SlotDefinitionClass.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: SlotDefinitionClass.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class SlotDefinitionClass extends StandardClass {
	public static int SLOT_INDEX_NAME = 0;
	public static int SLOT_INDEX_INITFUNCTION = 1;
	public static int SLOT_INDEX_INITFORM = 2;
	public static int SLOT_INDEX_INITARGS = 3;
	public static int SLOT_INDEX_READERS = 4;
	public static int SLOT_INDEX_WRITERS = 5;
	public static int SLOT_INDEX_ALLOCATION = 6;
	public static int SLOT_INDEX_ALLOCATION_CLASS = 7;
	public static int SLOT_INDEX_LOCATION = 8;

	public SlotDefinitionClass() {
		super(LispSymbols.SLOT_DEFINITION, Lisp.list(StandardClass.STANDARD_OBJECT));
		SubLPackage pkg = Lisp.PACKAGE_SYS;
		SubLObject[] instanceSlotNames = { pkg.intern("NAME"), pkg.intern("INITFUNCTION"), pkg.intern("INITFORM"),
				pkg.intern("INITARGS"), pkg.intern("READERS"), pkg.intern("WRITERS"), pkg.intern("ALLOCATION"),
				pkg.intern("ALLOCATION-CLASS"), pkg.intern("LOCATION") };
		this.setClassLayout(new Layout(this, instanceSlotNames, Lisp.NIL));
		this.setFinalized(true);
	}
}
