/*
 * AbstractArray.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: AbstractArray.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface AbstractArray extends SubLObject, LispSequence {

	/**
	 *
	 * @param dims
	 * @param displacedTo
	 * @param displacement
	 * @return
	 */
	public abstract AbstractArray adjustArray(int[] dims, AbstractArray displacedTo, int displacement);

	/**
	 * Returns a newly allocated array or the current array with adjusted
	 * dimensions.
	 *
	 * @param dims
	 * @param initialElement
	 * @c null if none
	 * @param initialContents
	 * @c null if none
	 * @return @c this or a new array
	 */
	public abstract AbstractArray adjustArray(int[] dims, SubLObject initialElement, SubLObject initialContents);

	abstract public SubLObject arrayDisplacement();

	public abstract void aset(int index, SubLObject newValue);

	abstract public boolean equalp(SubLObject obj);

	public abstract void fillVoid(SubLObject obj);

	abstract public SubLObject get(int[] subscripts);

	public abstract int getDimension(int n);

	public abstract SubLObject getDimensions();

	public abstract SubLObject getElementType();

	abstract public int getFillPointer();

	public abstract int getRank();

	abstract public int getRowMajorIndex(int[] subscripts);

	abstract public int getRowMajorIndex(SubLObject[] subscripts);

	public abstract int getTotalSize();

	// // FIXME Detect overflow!
	// abstract protected static int computeTotalSize(int[] dimensions);

	abstract public boolean hasFillPointer();

	abstract public boolean isAdjustable();

	abstract public boolean isDisplaced();

	// For EQUALP hash tables.
	public abstract int psxhash();

	abstract public void set(int[] subscripts, SubLObject newValue);

	abstract public void setFillPointer(int fillPointer);

	abstract public void setFillPointer(SubLObject fillPointer);

	abstract public SubLObject typep(SubLObject type);

	abstract public String writeToString(int[] dimv);
}
