/*
 * ConcatenatedStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ConcatenatedStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class ConcatenatedStream extends Stream
{
    SubLObject streams;

    ConcatenatedStream(SubLObject streams)
    {
        super(LispSymbols.CONCATENATED_STREAM);
        this.streams = streams;
        isInputStream = true;
    }

    public boolean isCharacterInputStream()
    {
        if (streams == NIL)
            return true;
        return ((LispStream)streams.first()).isCharacterInputStream();
    }

    public boolean isBinaryInputStream()
    {
        if (streams == NIL)
            return true;
        return ((LispStream)streams.first()).isBinaryInputStream();
    }

    public boolean isCharacterOutputStream()
    {
        return false;
    }

    public boolean isBinaryOutputStream()
    {
        return false;
    }

    public SubLObject typeOf()
    {
        return LispSymbols.CONCATENATED_STREAM;
    }

    public SubLObject classOf()
    {
        return BuiltInClass.CONCATENATED_STREAM;
    }

    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.CONCATENATED_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.CONCATENATED_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public SubLObject getElementType()
    {
        if (streams == NIL)
            return NIL;
        return ((LispStream)streams.first()).getElementType();
    }

    public SubLObject readCharNoHang(boolean eofError, SubLObject eofValue)

    {
        if (streams == NIL) {
            if (eofError)
                return error(new EndOfFile(this));
            else
                return eofValue;
        }
	try 
	  {
	    return _charReady() ? readChar(eofError, eofValue) : NIL;
	  }
	catch (java.io.IOException e)
	  {
	    return error(new StreamError(this, e));
	  }
    }

    public SubLObject listen()
    {
        if (unreadChar >= 0)
            return T;
        if (streams == NIL)
            return NIL;
        SubLObject obj = readCharNoHang(false, this);
        if (obj == this)
            return NIL;
        unreadChar = ((LispCharacter)obj).charValue();
        return T;
    }

    private int unreadChar = -1;

    // Returns -1 at end of file.
    public int _readChar() throws java.io.IOException
    {
        int n;
        if (unreadChar >= 0) {
            n = unreadChar;
            unreadChar = -1;
            return n;
        }
        if (streams == NIL)
            return -1;
        LispStream stream = (LispStream) streams.first();
        n = stream._readChar();
        if (n >= 0)
            return n;
        streams = streams.rest();
        return _readChar();
    }

    public void _unreadChar(int n)
    {
        if (unreadChar >= 0)
            error(new StreamError(this, "UNREAD-CHAR was invoked twice consecutively without an intervening call to READ-CHAR."));
        unreadChar = n;
    }

    public boolean _charReady() throws java.io.IOException
    {
        if (unreadChar >= 0)
            return true;
        if (streams == NIL)
            return false;
        LispStream stream = (LispStream) streams.first();
        if (stream._charReady())
            return true;
        SubLObject remainingStreams = streams.rest();
        while (remainingStreams != NIL) {
            stream = (LispStream) remainingStreams.first();
            if (stream._charReady())
                return true;
            remainingStreams = remainingStreams.rest();
        }
        return false;
    }

    public void _writeChar(char c)
    {
        outputStreamError();
    }

    public void _writeChars(char[] chars, int start, int end)

    {
        outputStreamError();
    }

    public void _writeString(String s)
    {
        outputStreamError();
    }

    public void _writeLine(String s)
    {
        outputStreamError();
    }

    // Reads an 8-bit byte.
    public int _readByte()
    {
        if (streams == NIL)
            return -1;
        LispStream stream = (LispStream) streams.first();
        int n = stream._readByte();
        if (n >= 0)
            return n;
        streams = streams.rest();
        return _readByte();
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n)
    {
        outputStreamError();
    }

    public void _finishOutput()
    {
        outputStreamError();
    }

    public void _clearInput()
    {
        // FIXME
    }

    private void outputStreamError()
    {
        error(new StreamError(this,
                               String.valueOf(this) + " is not an output stream."));
    }

   }
