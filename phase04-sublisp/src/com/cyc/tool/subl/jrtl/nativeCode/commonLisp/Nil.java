/*
 * Nil.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: Nil.java 12400 2010-01-25 06:58:48Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Nil extends LispSymbolImpl implements LispSequence,SubLList
{
  public static SubLSymbol NIL = new Nil(PACKAGE_CL);

	// SubLList
  public SubLObject get(int index) {
  	return this;
  }

	public SubLObject rest() {
		return this;
		}
	public SubLObject first() {
		return this;
		}
	 
	public SubLList toList() {
		// TODO Auto-generated method stub
		return this;
	}

	 
	public SubLSequence toSeq() {
		return this;
	}
	 
    private Nil(SubLPackage pkg)
    {
        super("NIL", pkg);
        pkg.addSymbol(this);
        initializeConstant(this);
    }

    public SubLSymbol typeOf()
    {
        return LispSymbols.NULL;
    }

    public SubLObject classOf()
    {
        return BuiltInClass.NULL;
    }

    public SubLObject getDescription()
    {
        return makeString("The symbol NIL");
    }

    public boolean getBooleanValue()
    {
        return false;
    }

    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.NULL)
            return T;
        if (typeSpecifier == LispSymbols.LIST)
            return T;
        if (typeSpecifier == LispSymbols.SEQUENCE)
            return T;
        if (typeSpecifier == LispSymbols.SYMBOL)
            return T;
        if (typeSpecifier == LispSymbols.BOOLEAN)
            return T;
        if (typeSpecifier == BuiltInClass.NULL)
            return T;
        if (typeSpecifier == BuiltInClass.LIST)
            return T;
        if (typeSpecifier == BuiltInClass.SEQUENCE)
            return T;
        if (typeSpecifier == BuiltInClass.SYMBOL)
            return T;
        return super.typep(typeSpecifier);
    }

    public boolean constantp()
    {
        return true;
    }

    public SubLObject getSymbolValue()
    {
        return this;
    }
    
    public SubLObject second()
    {
        return this;
    }

    public SubLObject cddr()
    {
        return this;
    }

    public SubLObject third()
    {
        return this;
    }

    public SubLObject nthCdr(int n)
    {
        if (n < 0)
            return type_error(LispObjectFactory.makeInteger(n),
                                   list(LispSymbols.INTEGER, Fixnum.ZERO));
        return this;
    }

    public int cl_length()
    {
        return 0;
    }

    public SubLObject NTH(int index)
    {
        if (index < 0)
            error(new TypeError(String.valueOf(index) +
                                 " is not of type UNSIGNED-BYTE."));
        return NIL;
    }

    public SubLObject NTH(SubLObject arg)
    {
        int index;
                if (arg instanceof Fixnum) {
                        index = ((Fixnum) arg).value;
                } else if (arg instanceof Bignum) {
                        if (arg.isNegative())
                                return error(new TypeError(arg, LispSymbols.UNSIGNED_BYTE));
                        return NIL;
                } else
                        return error(new TypeError(arg, LispSymbols.UNSIGNED_BYTE));
                if (index < 0)
                        error(new TypeError(arg, LispSymbols.UNSIGNED_BYTE));
                return NIL;
    }

    public SubLObject elt(int index)
    {
        return error(new TypeError("ELT: invalid index " + index + " for " + this + "."));
    }

    public SubLObject reverse()
    {
        return this;
    }

    public SubLObject nreverse()
    {
        return this;
    }

    public SubLObject[] copyToArray()
    {
        return makeLispObjectArray(0);
    }

    public boolean isList()
    {
        return true;
    }

    public boolean endp()
    {
        return true;
    }

    public SubLObject NOT()
    {
        return T;
    }

    public SubLObject getSymbolFunction()
    {
        return null;
    }

    public String toString()
    {
        if (LispSymbols.PRINT_READABLY.symbolValueNoThrow() != NIL)
            return "|COMMON-LISP|::|NIL|";
        return "NIL";
    }
		public void fillVoid(SubLObject obj) {
			Debug.trace("attempto to fill NIL with " + obj.writeToString());			
		}
}
