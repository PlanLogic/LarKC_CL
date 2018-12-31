/*
 * disassemble_class_bytes.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: disassemble_class_bytes.java 12518 2010-03-04 14:52:35Z mevenson $
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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

// ### disassemble-class-bytes
public class disassemble_class_bytes extends JavaPrimitive {
	private static Primitive DISASSEMBLE_CLASS_BYTES = new disassemble_class_bytes();

	private disassemble_class_bytes() {
		super("disassemble-class-bytes", Lisp.PACKAGE_SYS, true, "java-object");
	}

	public SubLObject execute(SubLObject arg) {
		if (arg instanceof JavaObject) {
			byte[] bytes = (byte[]) ((JavaObject) arg).getObject();
			try {
				File file = File.createTempFile("abcl", ".class", null);
				FileOutputStream out = new FileOutputStream(file);
				out.write(bytes);
				out.close();
				SubLObject disassembler = Lisp._DISASSEMBLER_.symbolValue();
				StringBuffer command = new StringBuffer();
				if (disassembler instanceof SubLString) {
					command.append(disassembler.getString());
					command.append(" ");
					command.append(file.getPath());
				} else if (disassembler instanceof Operator) {
					Pathname p = Pathname.makePathname(file);
					SubLObject commandResult = disassembler.execute(p);
					command.append(commandResult.getString());
				} else
					return LispObjectFactory.makeString("No disassembler is available.");
				ShellCommand sc = new ShellCommand(command.toString(), null, null);
				sc.run();
				file.delete();
				return LispObjectFactory.makeString(sc.getOutput());
			} catch (IOException e) {
				Debug.trace(e);
			}
		}
		return Lisp.NIL;
	}
}
