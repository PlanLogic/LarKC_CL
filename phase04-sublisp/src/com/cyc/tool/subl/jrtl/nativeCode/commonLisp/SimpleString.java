/*
 * AbstractString.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: AbstractString.java 12494 2010-02-21 14:33:12Z vvoutilainen $
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

import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.stream.IntStream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public class SimpleString extends SubLString
{
//    private int size;
//    private char[] buf;

    public SimpleString(LispCharacter c)
    {
        buf = new char[1];
        buf[0] = c.value;
        size = 1;
    }

    public SimpleString(char c)
    {
        buf = new char[1];
        buf[0] = c;
        size = 1;
    }

    public SimpleString(int capacity)
    {
        this.size = capacity;
        buf = new char[capacity];
    }

    public SimpleString(String s)
    {
    	super(s);
//        size = s.length();
//        buf = s.toCharArray();
    }

    public SimpleString(StringBuffer sb)
    {
        buf = new char[size = sb.length()];
        sb.getChars(0, size, buf, 0);
    }

    public SimpleString(StringBuilder sb)
    {
        buf = sb.toString().toCharArray();
        size = buf.length;
    }

    public SimpleString(char[] chars)
    {
			 super(chars);
//        this.buf = chars;
//        size = chars.length;
    }

    public SimpleString(int size, char defaultChar) {
			 super(size,defaultChar);
		}

		public SimpleString(char[] charArray,  int start, int end) {
			super(charArray,start,end);
		}

    public char[] charsOld()
    {
        return buf;
    }

    public char[] getStringChars()
    {
        return buf;
    }

    public SubLObject typeOf()
    {
        return list(LispSymbols.SIMPLE_BASE_STRING, LispObjectFactory.makeInteger(size));
    }

    public SubLObject classOf()
    {
        return BuiltInClass.SIMPLE_BASE_STRING;
    }

    public SubLObject getDescription()
    {
        StringBuilder sb = new StringBuilder("A simple-string (");
        sb.append(size);
        sb.append(") \"");
        sb.append(buf);
        sb.append('"');
        return makeString(sb);
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.SIMPLE_STRING)
            return T;
        if (type == LispSymbols.SIMPLE_ARRAY)
            return T;
        if (type == LispSymbols.SIMPLE_BASE_STRING)
            return T;
        if (type == BuiltInClass.SIMPLE_STRING)
            return T;
        if (type == BuiltInClass.SIMPLE_ARRAY)
            return T;
        if (type == BuiltInClass.SIMPLE_BASE_STRING)
            return T;
        return super.typep(type);
    }

    public SubLObject SIMPLE_STRING_P()
    {
        return T;
    }

    public boolean hasFillPointer()
    {
        return false;
    }

    public boolean isAdjustable()
    {
        return false;
    }

    public boolean equal(SubLObject obj)
    {
        if (this == obj)
            return true;
        if (obj instanceof SimpleString) {
            SimpleString string = (SimpleString) obj;
            if (string.size != size)
                return false;
            for (int i = size; i-- > 0;)
                if (string.buf[i] != buf[i])
                    return false;
            return true;
        }
        if (obj instanceof SubLString) {
            SubLString string = (SubLString) obj;
            if (string.cl_length() != size)
                return false;
            for (int i = cl_length(); i-- > 0;)
                if (string.charAt(i) != buf[i])
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
        if (obj instanceof SimpleString) {
            SimpleString string = (SimpleString) obj;
            if (string.size != size)
                return false;
            for (int i = size; i-- > 0;) {
                if (string.buf[i] != buf[i]) {
                    if (CharacterFunctions.toLowerCase(string.buf[i]) != CharacterFunctions.toLowerCase(buf[i]))
                        return false;
                }
            }
            return true;
        }
        if (obj instanceof SubLString) {
            SubLString string = (SubLString) obj;
            if (string.cl_length() != size)
                return false;
            for (int i = cl_length(); i-- > 0;) {
                if (string.charAt(i) != buf[i]) {
                    if (CharacterFunctions.toLowerCase(string.charAt(i)) != CharacterFunctions.toLowerCase(buf[i]))
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

    public SubLString substring(int start)
    {
        return substring(start, size);
    }

    public SubLString substring(int start, int end)

    {
    	SimpleString s = (SimpleString)makeString(end - start);
        int i = start, j = 0;
        try {
            while (i < end)
                s.buf[j++] = buf[i++];
            return s;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            error(new TypeError("Array index out of bounds: " + i));
            // Not reached.
            return null;
        }
    }

    public SubLObject subseq(int start, int end)
    {
        return substring(start, end);
    }

    public void fillVoid(SubLObject obj)
    {
        fill(obj.charValue());
    }

    public void fill(char c)
    {
    	if (size!=buf.length)  {
    		Debug.dumpStack("capacity!=chars.length " + writeToString());
    	}
      setMutated();
    	Arrays.fill(buf, c);
    }

    public void shrink(int n)
    {
        if (n < size) {
            char[] newArray = new char[n];
            System.arraycopy(buf, 0, newArray, 0, n);
            buf = newArray;
            size = n;
            setMutated();
            return;
        }
        if (n == size)
            return;
        error(new LispError());
    }

    public SubLObject reverse()
    {
    	SimpleString result = (SimpleString)makeString(size);
        int i, j;
        for (i = 0, j = size - 1; i < size; i++, j--)
            result.buf[i] = buf[j];
        setMutated();
        return result;
    }

    public SubLObject nreverse()
    {
        int i = 0;
        int j = size - 1;
        while (i < j) {
            char temp = buf[i];
            buf[i] = buf[j];
            buf[j] = temp;
            ++i;
            --j;
        }
        setMutated();
        return this;
    }

//    
//    public String getString()
//    {
//        return String.valueOf(buf);
//    }

    public Object javaInstance()
    {
        return getString();
    }

    public Object javaInstance(Class c)
    {
        return javaInstance();
    }

    public int capacity()
    {
        return size;
    }

    public int cl_length()
    {
        return size;
    }

    public char charAt(int index)
    {
        try {
            return buf[index];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
            return 0; // Not reached.
        }
    }

    public void setChar(int index, char c)
    {
        try {
            buf[index] = c;
            setMutated();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
        }
    }

    public SubLObject elt(int index)
    {
        try {
            return LispCharacter.makeChar(buf[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
            return NIL; // Not reached.
        }
    }

    public SubLObject CHAR(int index)
    {
        try {
            return LispCharacter.makeChar(buf[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
            return NIL; // Not reached.
        }
    }

    public SubLObject SCHAR(int index)
    {
        try {
            return LispCharacter.makeChar(buf[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
            return NIL; // Not reached.
        }
    }

    public SubLObject AREF(int index)
    {
        try {
            return LispCharacter.makeChar(buf[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
            return NIL; // Not reached.
        }
    }

    public SubLObject AREF(SubLObject index)
    {
        try {
            return LispCharacter.makeChar(buf[index.intValue()]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(((Fixnum)index).value, size);
            return NIL; // Not reached.
        }
    }

    public void aset(int index, SubLObject obj)
    {
        try {
            buf[index] = obj.charValue();
            setMutated();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            badIndex(index, size);
        }
    }

    public int sxhash()
    {
        int hashCode = 0;
        for (int i = 0; i < size; i++) {
            hashCode += buf[i];
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
        for (int i = 0; i < size; i++) {
            hashCode += Character.toUpperCase(buf[i]);
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
        if (initialContents != null) {
            char[] newChars = new char[newCapacity];
            if (initialContents.isList()) {
                SubLObject list = initialContents;
                for (int i = 0; i < newCapacity; i++) {
                    newChars[i] = list.first().charValue();
                    list = list.rest();
                }
            } else if (initialContents.isVector()) {
                for (int i = 0; i < newCapacity; i++)
                    newChars[i] = initialContents.elt(i).charValue();
            } else
                type_error(initialContents, LispSymbols.SEQUENCE);
            return makeString(newChars);
        }
        if (size != newCapacity) {
            char[] newChars = new char[newCapacity];
            System.arraycopy(buf, 0, newChars, 0, Math.min(newCapacity, size));
            if (initialElement != null && size < newCapacity) {
                char c = initialElement.charValue();
                for (int i = size; i < newCapacity; i++)
                    newChars[i] = c;
            }
            return makeString(newChars);
        }
        // No change.
        return this;
    }

    public AbstractVector adjustArray(int newCapacity,
                                       AbstractArray displacedTo,
                                       int displacement)

    {
        return new ComplexString(newCapacity, displacedTo, displacement);
    }
}
