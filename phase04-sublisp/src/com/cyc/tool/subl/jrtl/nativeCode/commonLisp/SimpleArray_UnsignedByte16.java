/*
 * SimpleArray_UnsignedByte16.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SimpleArray_UnsignedByte16.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class SimpleArray_UnsignedByte16 extends AbstractSimpleArray
{
    private int[] dimv;
    private int totalSize;
    private int[] data;

    public SimpleArray_UnsignedByte16(int[] dimv)
    {
        this.dimv = dimv;
        totalSize = computeTotalSize(dimv);
        data = new int[totalSize];
    }

    public SimpleArray_UnsignedByte16(int[] dimv, SubLObject initialContents)

    {
        this.dimv = dimv;
        int rank = dimv.length;
        SubLObject rest = initialContents;
        for (int i = 0; i < rank; i++) {
            dimv[i] = rest.cl_length();
            rest = rest.elt(0);
        }
        totalSize = computeTotalSize(dimv);
        data = new int[totalSize];
        setInitialContents(0, dimv, initialContents, 0);
    }

    public SimpleArray_UnsignedByte16(int rank, SubLObject initialContents)

    {
        if (rank < 2)
            Debug.assertTrue(false);
        dimv = new int[rank];
        SubLObject rest = initialContents;
        for (int i = 0; i < rank; i++) {
            dimv[i] = rest.cl_length();
            if (rest == NIL || rest.cl_length() == 0)
                break;
            rest = rest.elt(0);
        }
        totalSize = computeTotalSize(dimv);
        data = new int[totalSize];
        setInitialContents(0, dimv, initialContents, 0);
    }

    private int setInitialContents(int axis, int[] dims, SubLObject contents,
                                   int index)

    {
        if (dims.length == 0) {
            try {
                data[index] = coerceLispObjectToJavaByte(contents);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                error(new LispError("Bad initial contents for array."));
                return -1;
            }
            ++index;
        } else {
            int dim = dims[0];
            if (dim != contents.cl_length()) {
                error(new LispError("Bad initial contents for array."));
                return -1;
            }
            int[] newDims = new int[dims.length-1];
            for (int i = 1; i < dims.length; i++)
                newDims[i-1] = dims[i];
            if (contents.isList()) {
                for (int i = contents.cl_length();i-- > 0;) {
                    SubLObject content = contents.first();
                    index =
                        setInitialContents(axis + 1, newDims, content, index);
                    contents = contents.rest();
                }
            } else {
                AbstractVector v = checkVector(contents);
                int length = v.cl_length();
                for (int i = 0; i < length; i++) {
                    SubLObject content = v.AREF(i);
                    index =
                        setInitialContents(axis + 1, newDims, content, index);
                }
            }
        }
        return index;
    }

    public SubLObject typeOf()
    {
        return list(LispSymbols.SIMPLE_ARRAY, UNSIGNED_BYTE_16, getDimensions());
    }

    public SubLObject classOf()
    {
        return BuiltInClass.SIMPLE_ARRAY;
    }

    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.SIMPLE_ARRAY)
            return T;
        if (typeSpecifier == BuiltInClass.SIMPLE_ARRAY)
            return T;
        return super.typep(typeSpecifier);
    }

    public int getRank()
    {
        return dimv.length;
    }

    public SubLObject getDimensions()
    {
        SubLObject result = NIL;
        for (int i = dimv.length; i-- > 0;)
            result = makeCons(LispObjectFactory.makeInteger(dimv[i]), result);
        return result;
    }

    public int getDimension(int n)
    {
        try {
            return dimv[n];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error(new TypeError("Bad array dimension " + n + "."));
            return -1;
        }
    }

    public SubLObject getElementType()
    {
        return UNSIGNED_BYTE_16;
    }

    public int getTotalSize()
    {
        return totalSize;
    }

    public boolean isAdjustable()
    {
        return false;
    }

    public int aref(int index)
    {
        try {
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error(new TypeError("Bad row major index " + index + "."));
            // Not reached.
            return 0;
        }
    }

    public SubLObject AREF(int index)
    {
        try {
            return LispObjectFactory.makeInteger(data[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return error(new TypeError("Bad row major index " + index + "."));
        }
    }

    public void aset(int index, SubLObject obj)
    {
        try {
            data[index] = obj.intValue();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error(new TypeError("Bad row major index " + index + "."));
        }
    }

    public int getRowMajorIndex(int[] subscripts)
    {
        int rank = dimv.length;
        if (rank != subscripts.length) {
            StringBuffer sb = new StringBuffer("Wrong number of subscripts (");
            sb.append(subscripts.length);
            sb.append(") for array of rank ");
            sb.append(rank);
            sb.append('.');
            error(new ProgramError(sb.toString()));
        }
        int sum = 0;
        int size = 1;
        for (int i = rank; i-- > 0;) {
            int dim = dimv[i];
            int lastSize = size;
            size *= dim;
            int n = subscripts[i];
            if (n < 0 || n >= dim) {
                StringBuffer sb = new StringBuffer("Invalid index ");
                sb.append(n);
                sb.append(" for array ");
                sb.append(this);
                sb.append('.');
                error(new ProgramError(sb.toString()));
            }
            sum += n * lastSize;
        }
        return sum;
    }

    public SubLObject get(int[] subscripts)
    {
        try {
            return LispObjectFactory.makeInteger(data[getRowMajorIndex(subscripts)]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return error(new TypeError("Bad row major index " +
                                        getRowMajorIndex(subscripts) + "."));
        }
    }

    public void set(int[] subscripts, SubLObject obj)

    {
        try {
            data[getRowMajorIndex(subscripts)] = obj.intValue();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error(new TypeError("Bad row major index " +
                                 getRowMajorIndex(subscripts) + "."));
        }
    }

    public void fillVoid(SubLObject obj)
    {
        int n = obj.intValue();
        for (int i = totalSize; i-- > 0;)
            data[i] = n;
    }

    public String writeToString()
    {
        if (LispSymbols.PRINT_READABLY.symbolValue() != NIL) {
            error(new PrintNotReadable(list(Keyword.OBJECT, this)));
            // Not reached.
            return null;
        }
        return writeToString(dimv);
    }

    public AbstractArray adjustArray(int[] dimv, SubLObject initialElement,
                                     SubLObject initialContents)

    {
        if (initialContents != null)
            return new SimpleArray_UnsignedByte16(dimv, initialContents);
        for (int i = 0; i < dimv.length; i++) {
            if (dimv[i] != this.dimv[i]) {
                SimpleArray_UnsignedByte16 newArray =
                    new SimpleArray_UnsignedByte16(dimv);
                if (initialElement != null)
                    newArray.fillVoid(initialElement);
                copyArray(this, newArray);
                return newArray;
            }
        }
        // New dimensions are identical to old dimensions.
        return this;
    }

    // Copy a1 to a2 for index tuples that are valid for both arrays.
    private static void copyArray(AbstractArray a1, AbstractArray a2)

    {
        Debug.assertTrue(a1.getRank() == a2.getRank());
        int[] subscripts = new int[a1.getRank()];
        int axis = 0;
        copySubArray(a1, a2, subscripts, axis);
    }

    private static void copySubArray(AbstractArray a1, AbstractArray a2,
                                     int[] subscripts, int axis)

    {
        if (axis < subscripts.length) {
            int limit =
                Math.min(a1.getDimension(axis), a2.getDimension(axis));
            for (int i = 0; i < limit; i++) {
                subscripts[axis] = i;
                copySubArray(a1, a2, subscripts, axis + 1);
            }
        } else {
            int i1 = a1.getRowMajorIndex(subscripts);
            int i2 = a2.getRowMajorIndex(subscripts);
            a2.aset(i2, a1.AREF(i1));
        }
    }

    public AbstractArray adjustArray(int[] dimv, AbstractArray displacedTo,
                                     int displacement)
    {
        return new ComplexArray(dimv, displacedTo, displacement);
    }
}