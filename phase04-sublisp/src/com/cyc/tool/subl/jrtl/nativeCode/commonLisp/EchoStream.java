/*
 * EchoStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: EchoStream.java 12362 2010-01-11 20:03:29Z vvoutilainen $
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

public class EchoStream extends Stream
{
    private LispStream in;
    private LispStream out;

    private int unreadChar = -1;

    public EchoStream(LispStream in, LispStream out)
    {
        super(LispSymbols.ECHO_STREAM);
        this.in = in;
        this.out = out;
    }

    public EchoStream(LispStream in, LispStream out, boolean interactive)
    {
        super(LispSymbols.ECHO_STREAM);
        this.in = in;
        this.out = out;
        setInteractive(interactive);
    }

    public SubLObject getElementType()
    {
        SubLObject itype = in.getElementType();
        SubLObject otype = out.getElementType();
        if (itype.equal(otype))
            return itype;
        return LispSymbols.NULL; // FIXME
    }

    public LispStream getInputStream()
    {
        return in;
    }

    public LispStream getOutputStream()
    {
        return out;
    }

    public SubLObject typeOf()
    {
        return LispSymbols.ECHO_STREAM;
    }

    public SubLObject classOf()
    {
        return BuiltInClass.ECHO_STREAM;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.ECHO_STREAM)
            return T;
        if (type == BuiltInClass.ECHO_STREAM)
            return T;
        return super.typep(type);
    }

    public boolean isInputStream()
    {
        return true;
    }

    public boolean isOutputStream()
    {
        return true;
    }

    public boolean isCharacterInputStream()
    {
        return in.isCharacterInputStream();
    }

    public boolean isBinaryInputStream()
    {
        return in.isBinaryInputStream();
    }

    public boolean isCharacterOutputStream()
    {
        return out.isCharacterOutputStream();
    }

    public boolean isBinaryOutputStream()
    {
        return out.isBinaryOutputStream();
    }

    // Returns -1 at end of file.
    public int _readChar() throws java.io.IOException
    {
        int n = in._readChar();
        if (n >= 0) {
            // Not at end of file.
            if (unreadChar < 0)
                out._writeChar((char)n);
            else
                unreadChar = -1;
        }
        return n;
    }

    public void _unreadChar(int n) throws java.io.IOException
    {
        in._unreadChar(n);
        unreadChar = n;
    }

    public boolean _charReady() throws java.io.IOException
    {
        return in._charReady();
    }

    public void _writeChar(char c)
    {
        out._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)

    {
        out._writeChars(chars, start, end);
    }

    public void _writeString(String s)
    {
        out._writeString(s);
    }

    public void _writeLine(String s)
    {
        out._writeLine(s);
    }

    // Reads an 8-bit byte.
    public int _readByte()
    {
        int n = in._readByte();
        if (n >= 0)
            out._writeByte(n);
        return n;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n)
    {
        out._writeByte(n);
    }

    public void _finishOutput()
    {
        out._finishOutput();
    }

    public void _clearInput()
    {
        in._clearInput();
    }

    public SubLObject close(SubLObject abort)
    {
        // "The effect of CLOSE on a constructed stream is to close the
        // argument stream only. There is no effect on the constituents of
        // composite streams."
        setOpen(false);
        return T;
    }

    public SubLObject listen()
    {
        return in.listen();
    }

    public SubLObject freshLine()
    {
        return out.freshLine();
    }

    public String toString()
    {
        return unreadableString("ECHO-STREAM");
    }
}
