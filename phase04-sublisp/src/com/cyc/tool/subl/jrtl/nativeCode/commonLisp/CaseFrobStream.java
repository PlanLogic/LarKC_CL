/*
 * CaseFrobStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: CaseFrobStream.java 12362 2010-01-11 20:03:29Z vvoutilainen $
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

public abstract class CaseFrobStream extends Stream
{
    protected LispStream target;

    protected CaseFrobStream(LispStream target)

    {
        super(LispSymbols.CASE_FROB_STREAM);
        Debug.assertTrue(target.isCharacterOutputStream());
        this.target = target;
    }

    public SubLObject getElementType()
    {
        return target.getElementType();
    }

    public SubLObject typeOf()
    {
        return LispSymbols.CASE_FROB_STREAM;
    }

    public SubLObject classOf()
    {
        return BuiltInClass.CASE_FROB_STREAM;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.CASE_FROB_STREAM)
            return T;
        if (type == BuiltInClass.CASE_FROB_STREAM)
            return T;
        return super.typep(type);
    }

    public boolean isInputStream()
    {
        return false;
    }

    public boolean isOutputStream()
    {
        return true;
    }

    public boolean isCharacterInputStream()
    {
        return false;
    }

    public boolean isBinaryInputStream()
    {
        return false;
    }

    public boolean isCharacterOutputStream()
    {
        return true;
    }

    public boolean isBinaryOutputStream()
    {
        return false;
    }

    public int getCharPos()
    {
        return target.getCharPos();
    }

    public void setCharPos(int n)
    {
        target.setCharPos(n);
    }

    // Returns -1 at end of file.
		public int _readChar()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    public void _unreadChar(int n)
    {
        notSupported();
    }

    public boolean _charReady()
    {
        notSupported();
        // Not reached.
        return false;
    }

    public void _writeChars(char[] chars, int start, int end)

    {
        _writeString(new String(chars, start, end));
    }

    // Reads an 8-bit byte.
    public int _readByte()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n)
    {
        notSupported();
    }

    public void _finishOutput()
    {
        target._finishOutput();
    }

    public void _clearInput()
    {
        notSupported();
    }

    public SubLObject close(SubLObject abort)
    {
        setOpen(false);
        return T;
    }

    public SubLObject listen()
    {
        notSupported();
        // Not reached.
        return NIL;
    }

    public SubLObject terpri()
    {
        return target.terpri();
    }

    public SubLObject freshLine()
    {
        return target.freshLine();
    }

    public String writeToString()
    {
        return unreadableString("CASE-FROB-STREAM");
    }

    private void notSupported()
    {
        error(new TypeError("Operation is not supported for streams of type CASE-FROB-STREAM."));
    }


}
