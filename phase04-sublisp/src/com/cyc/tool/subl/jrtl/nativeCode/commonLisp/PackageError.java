/*
 * PackageError.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: PackageError.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class PackageError extends LispError
{
    public PackageError(SubLObject initArgs)
    {
        super(StandardClass.PACKAGE_ERROR);
        initialize(initArgs);
    }

    protected void initialize(SubLObject initArgs)
    {
        super.initialize(initArgs);

        if (initArgs.isList() && initArgs.first().isString()) {
           setFormatControl(initArgs.first().getString());
           // When printing an error string, presumably, if the string contains
           // a symbol, we'll want to complain about its full name, not the accessible
           // name, because it may omit an (important) package name part.
           // Two problems: (1) symbols can be contained in sublists
           //               (2) symbols may not be printed, but used otherwise.
           for (SubLObject arg = initArgs.rest(); arg != NIL; arg = arg.rest()) {
              if (arg.first() instanceof SubLSymbol)
                 arg.setCar(makeString(((SubLSymbol)arg.first()).getQualifiedName()));
           }
           setFormatArguments(initArgs.rest());
           setPackage(NIL);

           return;
        }

        SubLObject pkg = NIL;
        SubLObject first, second;
        while (initArgs != NIL) {
            first = initArgs.first();
            initArgs = initArgs.rest();
            second = initArgs.first();
            initArgs = initArgs.rest();
            if (first == Keyword.PACKAGE)
                pkg = second;
        }
        setPackage(pkg);
    }

    public PackageError(String message)
    {
        super(StandardClass.PACKAGE_ERROR);
        setFormatControl(message);
    }

    public SubLObject typeOf()
    {
        return LispSymbols.PACKAGE_ERROR;
    }

    public SubLObject classOf()
    {
        return StandardClass.PACKAGE_ERROR;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.PACKAGE_ERROR)
            return T;
        if (type == StandardClass.PACKAGE_ERROR)
            return T;
        return super.typep(type);
    }

    public SubLObject getLispPackage()
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(LispSymbols.PACKAGE);
        Debug.assertTrue(index >= 0);
        return slots[index];
    }

    public void setPackage(SubLObject pkg)
    {
        Debug.assertTrue(layout != null);
        int index = layout.getSlotIndex(LispSymbols.PACKAGE);
        Debug.assertTrue(index >= 0);
        slots[index] = pkg;
    }
}
