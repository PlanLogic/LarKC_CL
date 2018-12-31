/*
 * Main.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Main.java 11391 2008-11-15 22:38:34Z vvoutilainen $
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

import junit.textui.TestRunner;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;

public class Main
{
  public static long startTimeMillis = System.currentTimeMillis();

  public static void main(final String[] args)
  {
    // Run the interpreter in a secondary thread so we can control the stack
    // size.
    try {
      SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {
        public void safeRun() {
          Main.isSubLisp = true;
          SubLMain.me.initializeSubL(args);
          SubLMain.me.initializeTranslatedSystems();
          SubLMain.setMainReader(null);
          //SubLFiles.initialize(Keyhashes.me);
          SSS.setDynamicValue(SubLObjectFactory.makeInteger(212));
          SubLMain.setIsInitialized();
          Main.isSubLisp = false;
          Interpreter interpreter = Interpreter.createDefaultInstance(args);
          if (interpreter != null) interpreter.run();
          System.exit(0);
        }
      };
      SubLThreadPool.getDefaultPool().execute(subLProcess);
    } catch (Exception e) {
      e.printStackTrace();
    }
//    Thread t = new Thread(null, r, "interpreter", 4194304L);
//    LispThread lt = new LispThread(t);
//    t.start();
  }

	public static boolean isSubLisp = true;
}
