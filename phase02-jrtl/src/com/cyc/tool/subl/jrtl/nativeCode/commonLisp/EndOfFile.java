/*
 * EndOfFile.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: EndOfFile.java 12512 2010-02-28 15:54:17Z vvoutilainen $
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

public class EndOfFile extends StreamError {
	public EndOfFile(LispStream stream) {
		super(StandardClass.END_OF_FILE);
		this.setStream(stream);
	}

	public EndOfFile(SubLObject initArgs) {
		super(StandardClass.END_OF_FILE);
		this.initialize(initArgs);
	}

	public SubLObject classOf() {
		return StandardClass.END_OF_FILE;
	}

	public String getMessage() {
		return this.unreadableString(LispSymbols.END_OF_FILE);
	}

	public SubLObject typeOf() {
		return LispSymbols.END_OF_FILE;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.END_OF_FILE)
			return Lisp.T;
		if (type == StandardClass.END_OF_FILE)
			return Lisp.T;
		return super.typep(type);
	}
}
