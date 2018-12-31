/*
 * Return.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id$
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

package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class Return extends CatchableThrow
{
    public final LispObject tag;
    public final LispObject block;
    public final LispObject result;

    public Return(LispObject tag, LispObject block, LispObject result)
    {
        this.tag = tag;
        this.block = block;
        this.result = result;
    }

    @Override
    public SubLObject getTarget() {
    	// TODO Auto-generated method stub
    	if(true) Errors.unimplementedMethod("Auto-generated method stub:  Return.getTarget");
    	return null;
    }

    public Return(LispObject tag, LispObject result)
    {
        this.tag = tag;
        this.block = null;
        this.result = result;
    }

    public LispObject getTag()
    {
        return tag;
    }

    public LispObject getBlock()
    {
        return block;
    }

    public LispObject getResult()
    {
        return result;
    }

    @Override
    public LispObject getCondition()
    {
        StringBuilder sb = new StringBuilder("No block named ");
        sb.append(tag.princToString());
        sb.append(" is currently visible.");
        return new ControlError(sb.toString());
    }
}