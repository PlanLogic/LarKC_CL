/*
 * SimpleVector.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: SimpleVector.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

// "The type of a vector that is not displaced to another array, has no fill
// pointer, is not expressly adjustable and is able to hold elements of any
// type is a subtype of type SIMPLE-VECTOR."
public class SimpleVector extends AbstractSubLVector
{
  int capacity;
  SubLObject[] data;

  public SimpleVector(int capacity)
  {
    data = makeLispObjectArray(capacity);
    for (int i = capacity; i-- > 0;)
      data[i] = Fixnum.ZERO;
    this.capacity = capacity;
  }

  public SimpleVector(SubLObject obj)
  {
    if (obj.isList())
      {
        data = obj.copyToArray();
        capacity = data.length;
      }
    else if (obj instanceof AbstractVector)
      {
        capacity = obj.cl_length();
        data = makeLispObjectArray(capacity);
        for (int i = 0; i < capacity; i++)
          data[i] = obj.elt(i);
      }
    else
      Debug.assertTrue(false);
  }

  public SimpleVector(SubLObject[] array)
  {
    data = array;
    capacity = array.length;
  }

  public SubLObject typeOf()
  {
    return list(LispSymbols.SIMPLE_VECTOR, LispObjectFactory.makeInteger(capacity));
  }

  public SubLObject classOf()
  {
    return BuiltInClass.SIMPLE_VECTOR;
  }

  public SubLObject getDescription()
  {
    StringBuffer sb = new StringBuffer("A simple vector with ");
    sb.append(capacity);
    sb.append(" elements");
    return makeString(sb);
  }

  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.SIMPLE_VECTOR)
      return T;
    if (type == LispSymbols.SIMPLE_ARRAY)
      return T;
    if (type == BuiltInClass.SIMPLE_VECTOR)
      return T;
    if (type == BuiltInClass.SIMPLE_ARRAY)
      return T;
    return super.typep(type);
  }

  public SubLObject getElementType()
  {
    return T;
  }

  public boolean isSimpleVector()
  {
    return true;
  }

  public boolean hasFillPointer()
  {
    return false;
  }

  public boolean isAdjustable()
  {
    return false;
  }

  public int capacity()
  {
    return capacity;
  }

  public int cl_length()
  {
    return capacity;
  }

  public SubLObject elt(int index)
  {
    try
      {
        return data[index];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index, capacity);
        return NIL; // Not reached.
      }
  }

  public SubLObject AREF(int index)
  {
    try
      {
        return data[index];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index, data.length);
        return NIL; // Not reached.
      }
  }

  public SubLObject AREF(SubLObject index)
  {
        int idx = index.intValue();
    try
      {
        return data[idx];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(idx, data.length);
        return NIL; // Not reached.
      }
  }

  public void aset(int index, SubLObject newValue)
  {
    try
      {
        data[index] = newValue;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index, capacity);
      }
  }

  public SubLObject SVREF(int index)
  {
    try
      {
        return data[index];
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index, data.length);
        return NIL; // Not reached.
      }
  }

  public void svset(int index, SubLObject newValue)
  {
    try
      {
        data[index] = newValue;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        badIndex(index, capacity);
      }
  }

  public SubLObject subseq(int start, int end)
  {
    SimpleVector v = makeSimpleVector(end - start);
    int i = start, j = 0;
    try
      {
        while (i < end)
          v.data[j++] = data[i++];
        return v;
      }
    catch (ArrayIndexOutOfBoundsException e)
      {
        return error(new TypeError("Array index out of bounds: " + i + "."));
      }
  }

  public void fillVoid(SubLObject obj)
  {
    for (int i = capacity; i-- > 0;)
      data[i] = obj;
  }

  public SubLObject deleteEq(SubLObject item)
  {
    int limit = capacity;
    int i = 0;
    int j = 0;
    while (i < limit)
      {
        SubLObject obj = data[i++];
        if (obj != item)
          data[j++] = obj;
      }
    if (j < limit)
      shrink(j);
    return this;
  }

  public SubLObject deleteEql(SubLObject item)
  {
    int limit = capacity;
    int i = 0;
    int j = 0;
    while (i < limit)
      {
        SubLObject obj = data[i++];
        if (!obj.eql(item))
          data[j++] = obj;
      }
    if (j < limit)
      shrink(j);
    return this;
  }

  public void shrink(int n)
  {
    if (n < capacity)
      {
        SubLObject[] newData = makeLispObjectArray(n);
        System.arraycopy(data, 0, newData, 0, n);
        data = newData;
        capacity = n;
        return;
      }
    if (n == capacity)
      return;
    error(new LispError());
  }

  public SubLObject reverse()
  {
    SimpleVector result = makeSimpleVector(capacity);
    int i, j;
    for (i = 0, j = capacity - 1; i < capacity; i++, j--)
      result.data[i] = data[j];
    return result;
  }

  public SubLObject nreverse()
  {
    int i = 0;
    int j = capacity - 1;
    while (i < j)
      {
        SubLObject temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        ++i;
        --j;
      }
    return this;
  }

  public AbstractVector adjustArray(int newCapacity,
                                     SubLObject initialElement,
                                     SubLObject initialContents)

  {
    if (initialContents != null)
      {
        SubLObject[] newData = makeLispObjectArray(newCapacity);
        if (initialContents.isList())
          {
            SubLObject list = initialContents;
            for (int i = 0; i < newCapacity; i++)
              {
                newData[i] = list.first();
                list = list.rest();
              }
          }
        else if (initialContents.isVector())
          {
            for (int i = 0; i < newCapacity; i++)
              newData[i] = initialContents.elt(i);
          }
        else
          error(new TypeError(initialContents, LispSymbols.SEQUENCE));
        return makeSimpleVector(newData);
      }
    if (capacity != newCapacity)
      {
        SubLObject[] newData = makeLispObjectArray(newCapacity);
        System.arraycopy(data, 0, newData, 0,
                         Math.min(capacity, newCapacity));
        if (initialElement != null)
            for (int i = capacity; i < newCapacity; i++)
                newData[i] = initialElement;
        return makeSimpleVector(newData);
      }
    // No change.
    return this;
  }

  public AbstractVector adjustArray(int newCapacity,
                                     AbstractArray displacedTo,
                                     int displacement)
  {
    return new ComplexVector(newCapacity, displacedTo, displacement);
  }

  // ### svref
  // svref simple-vector index => element
  private static Primitive SVREF =
    new JavaPrimitive("svref", "simple-vector index")
    {
      
      public SubLObject execute(SubLObject first, SubLObject second)

      {
                        if (first instanceof SimpleVector) {
                                SimpleVector sv = (SimpleVector)first;
                    int index = second.intValue();
                                try {
                                        return sv.data[index];
                                } catch (ArrayIndexOutOfBoundsException e) {
                                        int capacity = sv.capacity;
                                         sv.badIndex(index, capacity);
                                        // Not reached.
                                        return NIL;
                                }
                        }
                        return type_error(first, LispSymbols.SIMPLE_VECTOR);
                }
    };

  // ### svset simple-vector index new-value => new-value
  private static Primitive SVSET =
    new JavaPrimitive("svset", PACKAGE_SYS, true, "simple-vector index new-value")
    {
      
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
                        if (first instanceof SimpleVector) {
                                SimpleVector sv = (SimpleVector)first;
                    int index = second.intValue();
                                try {
                                        sv.data[index] = third;
                                        return third;
                                } catch (ArrayIndexOutOfBoundsException e) {
                                        int capacity = sv.capacity;
                                         sv.badIndex(index, capacity);
                                        // Not reached.
                                        return NIL;
                                }
                        }
                        return type_error(first, LispSymbols.SIMPLE_VECTOR);
      }
    };
}
