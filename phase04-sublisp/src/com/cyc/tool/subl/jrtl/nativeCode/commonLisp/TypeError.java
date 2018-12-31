/*
 * TypeError.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: TypeError.java 12431 2010-02-08 08:05:15Z mevenson $
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

public class TypeError extends LispError
{
    public TypeError()
    {
        super(StandardClass.TYPE_ERROR);
    }

    protected TypeError(LispClass cls)
    {
        super(cls);
    }

    public TypeError(SubLObject datum, SubLObject expectedType)

    {
        super(StandardClass.TYPE_ERROR);
        setDatum(datum);
        setExpectedType(expectedType);
    }

    public TypeError(SubLObject initArgs)
    {
        super(StandardClass.TYPE_ERROR);
        initialize(initArgs);
    }

    protected void initialize(SubLObject initArgs)
    {
        super.initialize(initArgs);
        SubLObject datum = null;
        SubLObject expectedType = null;
        SubLObject first, second;
        while (initArgs != NIL) {
            first = initArgs.first();
            initArgs = initArgs.rest();
            second = initArgs.first();
            initArgs = initArgs.rest();
            if (first == Keyword.DATUM) {
                if (datum == null)
                    datum = second;
            } else if (first == Keyword.EXPECTED_TYPE) {
                if (expectedType == null)
                    expectedType = second;
            }
        }
        if (datum != null)
            setDatum(datum);
        if (expectedType != null)
            setExpectedType(expectedType);
    }

    public TypeError(String message)
    {
        super(StandardClass.TYPE_ERROR);
        setFormatControl(message);
        setDatum(NIL);
        setExpectedType(NIL);
    }

    public TypeError(String message, SubLObject datum, SubLObject expectedType)

    {
        super(StandardClass.TYPE_ERROR);
        setFormatControl(message);
        setDatum(datum);
        setExpectedType(expectedType);
    }

    public SubLObject typeOf()
    {
        return LispSymbols.TYPE_ERROR;
    }

    public SubLObject classOf()
    {
        return StandardClass.TYPE_ERROR;
    }

    public SubLObject typep(SubLObject type)
    {
        if (type == LispSymbols.TYPE_ERROR)
            return T;
        if (type == StandardClass.TYPE_ERROR)
            return T;
        return super.typep(type);
    }

    public String getMessage()
    {
        LispThread thread = LispThread.currentThread();
        SpecialBindingsMark mark = thread.markSpecialBindings();
        thread.bindSpecial(LispSymbols.PRINT_ESCAPE, T);
        try {
            String s = super.getMessage();
            if (s != null)
                return s;
            SubLObject datum = getDatum();
            SubLObject expectedType = getExpectedType();
            StringBuilder sb = new StringBuilder();
            String name = datum != null ? datum.writeToString() : null;
            String type = null;
            if (expectedType != null)
                type = expectedType.writeToString();
            if (type != null) {
                if (name != null) {
                    sb.append("The value ");
                    sb.append(name);
                } else
                    sb.append("Value");
                sb.append(" is not of type ");
                sb.append(type);
            } else if (name != null) {
                sb.append("Wrong type: ");
                sb.append(name);
            }
            sb.append('.');
            return sb.toString();
        }
        finally {
            thread.resetSpecialBindings(mark);
        }
    }

    public SubLObject getDatum()
    {
        return getInstanceSlotValue(LispSymbols.DATUM);
    }

    private void setDatum(SubLObject datum)
    {
        setInstanceSlotValue(LispSymbols.DATUM, datum);
    }

    public SubLObject getExpectedType()
    {
        return getInstanceSlotValue(LispSymbols.EXPECTED_TYPE);
    }

    private void setExpectedType(SubLObject expectedType)

    {
        setInstanceSlotValue(LispSymbols.EXPECTED_TYPE, expectedType);
    }

    // ### type-error-datum
    private static Primitive TYPE_ERROR_DATUM =
        new JavaPrimitive(LispSymbols.TYPE_ERROR_DATUM, "condition")
    {
        
        public SubLObject execute(SubLObject arg)
        {
            StandardObject obj;
            if (arg instanceof StandardObject) {
                obj = (StandardObject) arg;
            }
            else {
                return type_error(arg, LispSymbols.STANDARD_OBJECT);
            }
            return obj.getInstanceSlotValue(LispSymbols.DATUM);
        }
    };

    // ### type-error-expected-type
    private static Primitive TYPE_ERROR_EXPECTED_TYPE =
        new JavaPrimitive(LispSymbols.TYPE_ERROR_EXPECTED_TYPE, "condition")
    {
        
        public SubLObject execute(SubLObject arg)
        {
            StandardObject obj;
            if (arg instanceof StandardObject) {
                obj = (StandardObject) arg;
            }
            else {
                return type_error(arg, LispSymbols.STANDARD_OBJECT);
            }
            return obj.getInstanceSlotValue(LispSymbols.EXPECTED_TYPE);
        }
    };
}
