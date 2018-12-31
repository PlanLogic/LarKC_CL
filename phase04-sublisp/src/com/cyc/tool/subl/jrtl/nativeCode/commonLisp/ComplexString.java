/*
 * ComplexString.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: ComplexString.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public class ComplexString extends SubLString
{
  //private int size;
  private int fillPointer = -1; // -1 indicates no fill pointer.
  private boolean isDisplaced;

  // For non-displaced arrays.
  //private char[] buf;

  // For displaced arrays.
  private AbstractArray array;
  private int displacement;

  public ComplexString(int capacity)
  {
    this.size = capacity;
    buf = new char[capacity];
    isDisplaced = false;
  }

  public ComplexString(int capacity, AbstractArray array, int displacement)
  {
    this.size = capacity;
    this.array = array;
    this.displacement = displacement;
    isDisplaced = true;
  }

  public SubLObject typeOf()
  {
    return list(LispSymbols.STRING, number(capacity()));
  }

  public SubLObject classOf()
  {
    return BuiltInClass.STRING;
  }

//TODO
  public boolean hasFillPointer()
  {
    return fillPointer >= 0;
  }

//TODO 
  public int getFillPointer()
  {
    return fillPointer;
  }

//TODO 
  public void setFillPointer(int n)
  {
    fillPointer = n;
  }

  public void setFillPointer(SubLObject obj)
  {
    if (obj == T)
      fillPointer = capacity();
    else
      {
        int n = obj.intValue();
        if (n > capacity())
          {
            StringBuffer sb = new StringBuffer("The new fill pointer (");
            sb.append(n);
            sb.append(") exceeds the capacity of the vector (");
            sb.append(capacity());
            sb.append(").");
            error(new LispError(sb.toString()));
          }
        else if (n < 0)
          {
            StringBuffer sb = new StringBuffer("The new fill pointer (");
            sb.append(n);
            sb.append(") is negative.");
            error(new LispError(sb.toString()));
          }
        else
          fillPointer = n;
      }
  }

//TODO 
  public boolean isDisplaced()
  {
    return isDisplaced;
  }

//TODO 
  public SubLObject arrayDisplacement()
  {
    SubLObject value1, value2;
    if (array != null)
      {
        value1 = array;
        value2 = LispObjectFactory.makeInteger(displacement);
      }
    else
      {
        value1 = NIL;
        value2 = Fixnum.ZERO;
      }
    return LispThread.currentThread().setValues(value1, value2);
  }

  public char[] charsOld()
  {
    if (buf != null)
      return buf;
    Debug.assertTrue(array != null);
    char[] copy = new char[size];
    if (array instanceof SubLString)
      System.arraycopy(array.charsOld(), displacement, copy, 0, size);
    else if (array.getElementType() == LispSymbols.CHARACTER)
      {
        for (int i = 0; i < size; i++)
          {
            SubLObject obj = array.AREF(displacement + i);
            copy[i] = obj.charValue();
          }
      }
    else
      type_error(array, LispSymbols.STRING);
    return copy;
  }

  public char[] getStringChars()
  {
    if (fillPointer < 0)
      return charsOld();
    char[] ret = new char[fillPointer];
    System.arraycopy(charsOld(), 0, ret, 0, fillPointer);
    return ret;
  }

  public boolean equal(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof SubLString)
      {
        SubLString string = (SubLString) obj;
        if (string.cl_length() != cl_length())
          return false;
        for (int i = cl_length(); i-- > 0;)
          if (string.charAt(i) != charAt(i))
            return false;
        return true;
      }
    if (obj instanceof NilVector)
      return obj.equal(this);
    return false;
  }

  public boolean equalp(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof SubLString)
      {
        SubLString string = (SubLString) obj;
        if (string.cl_length() != cl_length())
          return false;
        for (int i = cl_length(); i-- > 0;)
          {
            if (string.charAt(i) != charAt(i))
              {
                if (CharacterFunctions.toLowerCase(string.charAt(i)) != CharacterFunctions.toLowerCase(charAt(i)))
                  return false;
              }
          }
        return true;
      }
    if (obj instanceof AbstractBitVector)
      return false;
    if (obj instanceof AbstractArray)
      return obj.equalp(this);
    return false;
  }

//TODO 
  public SubLObject subseq(int start, int end)
  {
    SubLString s = makeString(end - start);
    int i = start, j = 0;
    while (i < end)
      s.setChar(j++, charAt(i++));
    return s;
  }

//TODO 
  public void fillVoid(SubLObject obj)
  {
    fill(obj.charValue());
  }

  public void fill(char c)
  {
    for (int i = cl_length(); i-- > 0;)
      setChar(i, c);
  }

//TODO 
  public void shrink(int n)
  {
    if (buf != null)
      {
        if (n < size)
          {
            char[] newArray = new char[n];
            System.arraycopy(buf, 0, newArray, 0, n);
            buf = newArray;
            size = n;
            fillPointer = -1;
            return;
          }
        if (n == size)
          return;
      }
    Debug.assertTrue(buf == null);
    // Displaced array. Copy existing characters.
    buf = new char[n];
    if (array instanceof SubLString)
      {
        SubLString string = (SubLString) array;
        for (int i = 0; i < n; i++)
          {
            buf[i] = string.charAt(displacement + i);
          }
      }
    else
      {
        for (int i = 0; i < n; i++)
          {
            LispCharacter character =
              (LispCharacter) array.AREF(displacement + i);
            buf[i] = character.value;
          }
      }
    size = n;
    array = null;
    displacement = 0;
    isDisplaced = false;
    fillPointer = -1;
  }

  public SubLObject reverse()
  {
    int length = cl_length();
    SubLString result = makeString(length);
    int i, j;
    for (i = 0, j = length - 1; i < length; i++, j--)
      result.setChar(i, charAt(j));
    return result;
  }

  public SubLObject nreverse()
  {
    int i = 0;
    int j = cl_length() - 1;
    while (i < j)
      {
        char temp = charAt(i);
        setChar(i, charAt(j));
        setChar(j, temp);
        ++i;
        --j;
      }
    return this;
  }

  public String getString()
  {
    if (fillPointer >= 0)
      return new String(charsOld(), 0, fillPointer);
    else
      return new String(charsOld());
  }

  public Object javaInstance()
  {
    return new String(charsOld());
  }

  public Object javaInstance(Class c)
  {
    return javaInstance();
  }

//TODO 
  public int capacity()
  {
    return size;
  }

  public int cl_length()
  {
    return fillPointer >= 0 ? fillPointer : size;
  }

  public char charAt(int index)
  {
    if (buf != null)
      {
        try
          {
            return buf[index];
          }
        catch (ArrayIndexOutOfBoundsException e)
          {
            badIndex(index, size);
            return 0; // Not reached.
          }
      }
    else
      return array.AREF(index + displacement).charValue();
  }

  public void setChar(int index, char c)
  {
    if (buf != null)
      {
        try
          {
            buf[index] = c;
          }
        catch (ArrayIndexOutOfBoundsException e)
          {
            badIndex(index, size);
          }
      }
    else
      array.aset(index + displacement, LispCharacter.makeChar(c));
  }

  public SubLObject elt(int index)
  {
    int limit = cl_length();
    if (index < 0 || index >= limit)
      badIndex(index, limit);
    return LispCharacter.makeChar(charAt(index));
  }

  // Ignores fill pointer.
  public SubLObject CHAR(int index)
  {
    return LispCharacter.makeChar(charAt(index));
  }

  // Ignores fill pointer.
  public SubLObject AREF(int index)
  {
    return LispCharacter.makeChar(charAt(index));
  }

  // Ignores fill pointer.
  public SubLObject AREF(SubLObject index)
  {
    return LispCharacter.makeChar(charAt(index.intValue()));
  }

  public void aset(int index, SubLObject newValue)
  {
      setChar(index,newValue.charValue());
  }

  public void vectorPushExtend(SubLObject element)

  {
    if (fillPointer < 0)
      noFillPointer();
    if (fillPointer >= size)
      {
        // Need to extend vector.
        ensureCapacity(size * 2 + 1);
      }
    if (buf != null)
      {
        buf[fillPointer] = element.charValue();
      }
    else
      array.aset(fillPointer + displacement, element);
    ++fillPointer;
  }

  public SubLObject VECTOR_PUSH_EXTEND(SubLObject element)

  {
    vectorPushExtend(element);
    return LispObjectFactory.makeInteger(fillPointer - 1);
  }

  public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension)

  {
    int ext = extension.intValue();
    if (fillPointer < 0)
      noFillPointer();
    if (fillPointer >= size)
      {
        // Need to extend vector.
        ext = Math.max(ext, size + 1);
        ensureCapacity(size + ext);
      }
    if (buf != null)
      {
        buf[fillPointer] = element.charValue();
      }
    else
      array.aset(fillPointer + displacement, element);
    return LispObjectFactory.makeInteger(fillPointer++);
  }

  public void ensureCapacity(int minCapacity)
  {
    if (buf != null)
      {
        if (size < minCapacity)
          {
            char[] newArray = new char[minCapacity];
            System.arraycopy(buf, 0, newArray, 0, size);
            buf = newArray;
            size = minCapacity;
          }
      }
    else
      {
        Debug.assertTrue(array != null);
        if (size < minCapacity ||
            array.getTotalSize() - displacement < minCapacity)
          {
            // Copy array.
            buf = new char[minCapacity];
            int limit =
              Math.min(size, array.getTotalSize() - displacement);
            if (array instanceof SubLString)
              {
                SubLString string = (SubLString) array;
                for (int i = 0; i < limit; i++)
                  {
                    buf[i] = string.charAt(displacement + i);
                  }
              }
            else
              {
                for (int i = 0; i < limit; i++)
                  {
                    LispCharacter character =
                      (LispCharacter) array.AREF(displacement + i);
                    buf[i] = character.value;
                  }
              }
            size = minCapacity;
            array = null;
            displacement = 0;
            isDisplaced = false;
          }
      }
  }

  public int sxhash()
  {
    int hashCode = 0;
    int limit = cl_length();
    for (int i = 0; i < limit; i++)
      {
        hashCode += charAt(i);
        hashCode += (hashCode << 10);
        hashCode ^= (hashCode >> 6);
      }
    hashCode += (hashCode << 3);
    hashCode ^= (hashCode >> 11);
    hashCode += (hashCode << 15);
    return (hashCode & 0x7fffffff);
  }

  // For EQUALP hash tables.
  public int psxhash()
  {
    int hashCode = 0;
    int limit = cl_length();
    for (int i = 0; i < limit; i++)
      {
        hashCode += Character.toUpperCase(charAt(i));
        hashCode += (hashCode << 10);
        hashCode ^= (hashCode >> 6);
      }
    hashCode += (hashCode << 3);
    hashCode ^= (hashCode >> 11);
    hashCode += (hashCode << 15);
    return (hashCode & 0x7fffffff);
  }

  public AbstractVector adjustArray(int newCapacity,
                                     SubLObject initialElement,
                                     SubLObject initialContents)

  {
    if (initialContents != null)
      {
        // "If INITIAL-CONTENTS is supplied, it is treated as for MAKE-
        // ARRAY. In this case none of the original contents of array
        // appears in the resulting array."
        char[] newChars = new char[newCapacity];
        if (initialContents.isList())
          {
            SubLObject list = initialContents;
            for (int i = 0; i < newCapacity; i++)
              {
                newChars[i] = list.first().charValue();
                list = list.rest();
              }
          }
        else if (initialContents.isVector())
          {
            for (int i = 0; i < newCapacity; i++)
              newChars[i] = initialContents.elt(i).charValue();
          }
        else
          type_error(initialContents, LispSymbols.SEQUENCE);
        buf = newChars;
      }
    else
      {
        if (buf == null)
          {
            // Displaced array. Copy existing characters.
            buf = new char[newCapacity];
            int limit = Math.min(size, newCapacity);
            if (array instanceof SubLString)
              {
                SubLString string = (SubLString) array;
                for (int i = 0; i < limit; i++)
                  {
                    buf[i] = string.charAt(displacement + i);
                  }
              }
            else
              {
                for (int i = 0; i < limit; i++)
                  {
                    LispCharacter character =
                      (LispCharacter) array.AREF(displacement + i);
                    buf[i] = character.value;
                  }
              }
          }
        else if (size != newCapacity)
          {
            char[] newElements = new char[newCapacity];
            System.arraycopy(buf, 0, newElements, 0,
                             Math.min(size, newCapacity));
            buf = newElements;
          }
        if (initialElement != null && size < newCapacity)
          {
            // Initialize new elements.
            char c = initialElement.charValue();
            for (int i = size; i < newCapacity; i++)
              buf[i] = c;
          }
      }
    size = newCapacity;
    array = null;
    displacement = 0;
    isDisplaced = false;
    return this;
  }

  public AbstractVector adjustArray(int newCapacity,
                                     AbstractArray displacedTo,
                                     int displacement)

  {
    size = newCapacity;
    array = displacedTo;
    this.displacement = displacement;
    buf = null;
    isDisplaced = true;
    return this;
  }
}
