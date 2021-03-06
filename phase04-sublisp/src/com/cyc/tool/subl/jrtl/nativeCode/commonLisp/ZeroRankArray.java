/*
 * ZeroRankArray.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ZeroRankArray.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class ZeroRankArray extends AbstractSubLArray
{
    private SubLObject elementType;
    private boolean adjustable;

    private SubLObject data;

    public ZeroRankArray(SubLObject elementType, SubLObject data,
                         boolean adjustable)
    {
        this.elementType = elementType;
        this.data = data;
        this.adjustable = adjustable;
    }

    public SubLObject typeOf()
    {
        if (adjustable)
            return list(LispSymbols.ARRAY, elementType, NIL);
        else
            return list(LispSymbols.SIMPLE_ARRAY, elementType, NIL);
    }

    public SubLObject classOf()
    {
        return BuiltInClass.ARRAY;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.SIMPLE_ARRAY)
            return adjustable ? NIL : T;
        return super.typep(type);
    }

    public int getRank()
    {
        return 0;
    }

    public SubLObject getDimensions()
    {
        return NIL;
    }

    public int getDimension(int n)
    {
        error(new TypeError("Bad array dimension (" + n + ") for array of rank 0."));
        // Not reached.
        return -1;
    }

    public SubLObject getElementType()
    {
        return elementType;
    }

    public int getTotalSize()
    {
        return 1;
    }

    public SubLObject AREF(int index)
    {
        if (index == 0)
            return data;
        else
            return error(new TypeError("Bad row major index " + index + "."));
    }

    public void aset(int index, SubLObject obj)
    {
        if (obj.typep(elementType) == NIL)
            error(new TypeError(obj, elementType));
        if (index == 0)
            data = obj;
        else
            error(new TypeError("Bad row major index " + index + "."));
    }

    public void fillVoid(SubLObject obj)
    {
        if (obj.typep(elementType) == NIL)
            error(new TypeError(obj, elementType));
        data = obj;
    }

    public String writeToString()
    {
        LispThread thread = LispThread.currentThread();
        boolean printReadably = (LispSymbols.PRINT_READABLY.symbolValue(thread) != NIL);
        if (printReadably) {
            if (elementType != T) {
                error(new PrintNotReadable(list(Keyword.OBJECT, this)));
                // Not reached.
                return null;
            }
        }
        if (printReadably || LispSymbols.PRINT_ARRAY.symbolValue(thread) != NIL) {
            StringBuffer sb = new StringBuffer("#0A");
            if (data == this && LispSymbols.PRINT_CIRCLE.symbolValue(thread) != NIL) {
                StringOutputStream stream = new StringOutputStream();
                thread.execute(LispSymbols.OUTPUT_OBJECT.getSymbolFunction(),
                               data, stream);
                sb.append(stream.getOutputString().getString());
            } else
                sb.append(data.writeToString());
            return sb.toString();
        }
        StringBuffer sb = new StringBuffer();
        if (!adjustable)
            sb.append("SIMPLE-");
        sb.append("ARRAY ");
        sb.append(elementType.writeToString());
        sb.append(" NIL");
        return unreadableString(sb.toString());
    }

  public AbstractArray adjustArray(int[] dims,
                                              SubLObject initialElement,
                                              SubLObject initialContents)
    {
      if (isAdjustable()) {
          // initial element doesn't matter:
          // we're not creating new elements
          if (initialContents != null)
              data = initialContents;
          return this;
      } else {
          return new ZeroRankArray(elementType,
                  initialContents != null ? initialContents :
                      initialElement != null ? initialElement : data, false);
      }
  }

  public AbstractArray adjustArray(int[] dims,
                                              AbstractArray displacedTo,
                                              int displacement)
    {
      error(new TypeError("Displacement not supported for array of rank 0."));
      return null;
  }
}
