/*
 * ReaderError.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ReaderError.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class ReaderError extends StreamError
{
    public ReaderError(String message)
    {
        super(StandardClass.READER_ERROR);
        setFormatControl(message);
        setFormatArguments(NIL);
    }

    public ReaderError(String message, LispStream stream)
    {
        super(StandardClass.READER_ERROR);
        setFormatControl(message);
        setFormatArguments(NIL);
        setStream(stream);
    }

    public ReaderError(SubLObject initArgs)
    {
        super(StandardClass.READER_ERROR);
        initialize(initArgs);
    }

    public SubLObject typeOf()
    {
        return LispSymbols.READER_ERROR;
    }

    public SubLObject classOf()
    {
        return StandardClass.READER_ERROR;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.READER_ERROR)
            return T;
        if (type == StandardClass.READER_ERROR)
            return T;
        if (type == LispSymbols.PARSE_ERROR)
            return T;
        if (type == StandardClass.PARSE_ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        return message;
    }
}
