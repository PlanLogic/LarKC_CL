/*
 * BasicVector_UnsignedByte16.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: BasicVector_UnsignedByte16.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

// A basic vector is a specialized vector that is not displaced to another
// array, has no fill pointer, and is not expressly adjustable.
public class BasicVector_UnsignedByte16 extends AbstractSubLVector
{
    private int capacity;
    private int[] elements;

    public BasicVector_UnsignedByte16(int capacity)
    {
        elements = new int[capacity];
        this.capacity = capacity;
    }

    private BasicVector_UnsignedByte16(SubLObject[] array)

    {
        capacity = array.length;
        elements = new int[capacity];
        for (int i = array.length; i-- > 0;)
            elements[i] = array[i].intValue();
    }

    public SubLObject typeOf()
    {
        return list(LispSymbols.SIMPLE_ARRAY, UNSIGNED_BYTE_16,
                     makeCons(LispObjectFactory.makeInteger(capacity)));
    }

    public SubLObject classOf()
    {
        return BuiltInClass.VECTOR;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.SIMPLE_ARRAY)
            return T;
        if (type == BuiltInClass.SIMPLE_ARRAY)
            return T;
        return super.typep(type);
    }

    public SubLObject getElementType()
    {
        return UNSIGNED_BYTE_16;
    }

    public boolean isSimpleVector()
    {
        return false;
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
        try {
            return LispObjectFactory.makeInteger(elements[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
            return NIL; // Not reached.
        }
    }

    // Ignores fill pointer.
    public int aref(int index)
    {
        try {
            return elements[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
            // Not reached.
            return 0;
        }
    }

    // Ignores fill pointer.
    public SubLObject AREF(int index)
    {
        try {
            return LispObjectFactory.makeInteger(elements[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, elements.length);
            return NIL; // Not reached.
        }
    }

    // Ignores fill pointer.
    public SubLObject AREF(SubLObject index)
    {
        try {
            return LispObjectFactory.makeInteger(elements[index.intValue()]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index.intValue(), elements.length);
            return NIL; // Not reached.
        }
    }

    public void aset(int index, int n)
    {
        try {
            elements[index] = n;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
    }

    public void aset(int index, SubLObject obj)
    {
        if (obj instanceof Fixnum) {
                try {
            elements[index] = ((Fixnum)obj).value;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, capacity);
        }
        }
        else {
            error(new TypeError(obj, UNSIGNED_BYTE_16));
        }
    }

    public SubLObject subseq(int start, int end)
    {
        BasicVector_UnsignedByte16 v = new BasicVector_UnsignedByte16(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                v.elements[j++] = elements[i++];
            return v;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return error(new TypeError("Array index out of bounds: " + i + "."));
        }
    }

    public void fillVoid(SubLObject obj)
    {
        int n = obj.intValue();
        for (int i = capacity; i-- > 0;)
            elements[i] = n;
    }

    public void shrink(int n)
    {
        if (n < capacity) {
            int[] newArray = new int[n];
            System.arraycopy(elements, 0, newArray, 0, n);
            elements = newArray;
            capacity = n;
            return;
        }
        if (n == capacity)
            return;
        error(new LispError());
    }

    public SubLObject reverse()
    {
        BasicVector_UnsignedByte16 result = new BasicVector_UnsignedByte16(capacity);
        int i, j;
        for (i = 0, j = capacity - 1; i < capacity; i++, j--)
            result.elements[i] = elements[j];
        return result;
    }

    public SubLObject nreverse()
    {
        int i = 0;
        int j = capacity - 1;
        while (i < j) {
            int temp = elements[i];
            elements[i] = elements[j];
            elements[j] = temp;
            ++i;
            --j;
        }
        return this;
    }

    public AbstractVector adjustArray(int newCapacity,
                                       SubLObject initialElement,
                                       SubLObject initialContents)

    {
        if (initialContents != null) {
            SubLObject[] newElements = makeLispObjectArray(newCapacity);
            if (initialContents.isList()) {
                SubLObject list = initialContents;
                for (int i = 0; i < newCapacity; i++) {
                    newElements[i] = list.first();
                    list = list.rest();
                }
            } else if (initialContents.isVector()) {
                for (int i = 0; i < newCapacity; i++)
                    newElements[i] = initialContents.elt(i);
            } else
                error(new TypeError(initialContents, LispSymbols.SEQUENCE));
            return new BasicVector_UnsignedByte16(newElements);
        }
        if (capacity != newCapacity) {
            SubLObject[] newElements = makeLispObjectArray(newCapacity);
            System.arraycopy(elements, 0, newElements, 0,
                             Math.min(capacity, newCapacity));
            if (initialElement != null)
                for (int i = capacity; i < newCapacity; i++)
                    newElements[i] = initialElement;
            return new BasicVector_UnsignedByte16(newElements);
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
}
