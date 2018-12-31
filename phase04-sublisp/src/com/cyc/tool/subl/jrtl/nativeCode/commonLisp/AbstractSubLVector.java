/*
 * AbstractVector.java
 *
 * Copyright (C) 2003-2006 Peter Graves
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

public abstract class AbstractSubLVector extends AbstractSubLArray implements AbstractVector
{
	
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.VECTOR)
      return T;
    if (type == BuiltInClass.VECTOR)
      return T;
    if (type == LispSymbols.SEQUENCE)
      return T;
    if (type == BuiltInClass.SEQUENCE)
      return T;
    return super.typep(type);
  }

  public boolean isVector()
  {
    return true;
  }

  public boolean equalp(SubLObject obj)
  {
    if (obj instanceof AbstractVector)
      {
        if (cl_length() != obj.cl_length())
          return false;
        AbstractVector v = (AbstractVector) obj;
        for (int i = cl_length(); i-- > 0;)
          if (!AREF(i).equalp(v.AREF(i)))
            return false;
        return true;
      }
    return false;
  }

  public int getRank()
  {
    return 1;
  }

  public SubLObject getDimensions()
  {
    return makeCons(LispObjectFactory.makeInteger(capacity()));
  }

  public int getDimension(int n)
  {
    if (n != 0)
      {
        error(new TypeError("bad dimension for vector"));
        // Not reached.
        return 0;
      }
    return capacity();
  }

  public int getTotalSize()
  {
    return capacity();
  }

  public abstract int capacity();

  public abstract SubLObject subseq(int start, int end);

  public SubLObject deleteEq(SubLObject item)
  {
    int limit = cl_length();
    int i = 0;
    int j = 0;
    while (i < limit)
      {
        SubLObject obj = AREF(i++);
        if (obj != item)
          aset(j++, obj);
      }
    int newLength = j;
    if (newLength < capacity())
      shrink(newLength);
    return this;
  }

  public SubLObject deleteEql(SubLObject item)
  {
    int limit = cl_length();
    int i = 0;
    int j = 0;
    while (i < limit)
      {
        SubLObject obj = AREF(i++);
        if (!obj.eql(item))
          aset(j++, obj);
      }
    int newLength = j;
    if (newLength < capacity())
      shrink(newLength);
    return this;
  }

  public abstract void shrink(int n);

  public int checkIndex(int index)
  {
    if (index < 0 || index >= capacity())
      badIndex(index, capacity());
    return index;
  }

  protected void badIndex(int index, int limit)
  {
    StringBuilder sb = new StringBuilder("Invalid array index ");
    sb.append(index);
    sb.append(" for ");
    sb.append(writeToString());
    if (limit > 0)
      {
        sb.append(" (should be >= 0 and < ");
        sb.append(limit);
        sb.append(").");
      }
    error(new TypeError(sb.toString(),
                         LispObjectFactory.makeInteger(index),
                         list(LispSymbols.INTEGER,
                               Fixnum.ZERO,
                               LispObjectFactory.makeInteger(limit - 1))));

  }

  public void setFillPointer(int n)
  {
    noFillPointer();
  }

  public void setFillPointer(SubLObject obj)
  {
    noFillPointer();
  }

  public boolean isSimpleVector()
  {
    return false;
  }

  public abstract SubLObject reverse();

  public SubLObject nreverse()
  {
    int i = 0;
    int j = cl_length() - 1;
    while (i < j)
      {
        SubLObject temp = AREF(i);
        aset(i, AREF(j));
        aset(j, temp);
        ++i;
        --j;
      }
    return this;
  }

  public String writeToString()
  {
    LispThread thread = LispThread.currentThread();
    if (LispSymbols.PRINT_READABLY.symbolValue(thread) != NIL)
      {
        StringBuilder sb = new StringBuilder("#(");
        int limit = cl_length();
        for (int i = 0; i < limit; i++)
          {
            if (i > 0)
              sb.append(' ');
            sb.append(AREF(i).writeToString());
          }
        sb.append(')');
        return sb.toString();
      }
    else if (LispSymbols.PRINT_ARRAY.symbolValue(thread) != NIL)
      {
        int maxLevel = Integer.MAX_VALUE;
        SubLObject printLevel =
          LispSymbols.PRINT_LEVEL.symbolValue(thread);
        if (printLevel instanceof Fixnum)
          maxLevel = ((Fixnum)printLevel).value;
        SubLObject currentPrintLevel =
          _CURRENT_PRINT_LEVEL_.symbolValue(thread);
        int currentLevel = currentPrintLevel.intValue();
        if (currentLevel < maxLevel)
          {
            StringBuffer sb = new StringBuffer("#(");
            int maxLength = Integer.MAX_VALUE;
            SubLObject printLength =
              LispSymbols.PRINT_LENGTH.symbolValue(thread);
            if (printLength instanceof Fixnum)
              maxLength = ((Fixnum)printLength).value;
            int length = cl_length();
            int limit = Math.min(length, maxLength);
            SpecialBindingsMark mark = thread.markSpecialBindings();
            thread.bindSpecial(_CURRENT_PRINT_LEVEL_, currentPrintLevel.inc());
            try
              {
                for (int i = 0; i < limit; i++)
                  {
                    if (i > 0)
                      sb.append(' ');
                    sb.append(AREF(i).writeToString());
                  }
              }
            finally
              {
                thread.resetSpecialBindings(mark);
              }
            if (limit < length)
              sb.append(limit > 0 ? " ..." : "...");
            sb.append(')');
            return sb.toString();
          }
        else
          return "#";
      }
    else
      {
        StringBuffer sb = new StringBuffer();
        sb.append(isSimpleVector() ? "SIMPLE-VECTOR " : "VECTOR ");
        sb.append(capacity());
        return unreadableString(sb.toString());
      }
  }

  // For EQUALP hash tables.
  public int psxhash()
  {
    int length = cl_length();
    int limit = length < 4 ? length : 4;
    long result = 48920713; // Chosen at random.
    for (int i = 0; i < limit; i++)
      result = mix(result, AREF(i).psxhash());
    return (int) (result & 0x7fffffff);
  }

  public abstract AbstractArray adjustArray(int size,
                                              SubLObject initialElement,
                                              SubLObject initialContents)
   ;
  public abstract AbstractArray adjustArray(int size,
                                              AbstractArray displacedTo,
                                              int displacement)
   ;


  public AbstractArray adjustArray(int[] dims,
                                              SubLObject initialElement,
                                              SubLObject initialContents)
    {
      return adjustArray(dims[0], initialElement, initialContents);
  }

  public AbstractArray adjustArray(int[] dims,
                                              AbstractArray displacedTo,
                                              int displacement)
    {
      return adjustArray(dims[0], displacedTo, displacement);
  }
}
