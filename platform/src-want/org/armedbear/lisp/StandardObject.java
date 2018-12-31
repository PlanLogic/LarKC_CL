/*
 * StandardObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves
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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class StandardObject extends LispObject  implements SubLStruct
{

	  abstract public LispObject[] getSlots();
	  abstract public  void setSlots(LispObject[] tempSlots);

	  public abstract LispObject getLispClass();
	  public abstract Layout updateLayout();

	  abstract public LispObject getSlotArrayElement(int index) ;
	  public abstract LispObject setSlotArray(int index, LispObject newValue);
	  @Override
	  abstract public LispObject typeOf() ;
	  @Override
	  abstract public LispObject classOf();
	  @Override
	  abstract public SubLSymbol getName();

		/**
		 * @param slotName
		 * @return
		 */
		abstract public int getInstanceSlotIndex(LispObject slotName) ;

		abstract public LispObject getSharedSlotLocation(LispObject slotName);

	public LispObject getSlotValue(int index) {
		return type_error(this, Symbol.STRUCTURE_OBJECT);
	}

	public void setSlotValue(int index, LispObject value)

	{
		type_error(this, Symbol.STRUCTURE_OBJECT);
	}
	protected LispObject badIndex(int n)
	{
		StringBuilder sb = new StringBuilder("Invalid slot index ");
		sb.append(Fixnum.getInstance(n).princToString());
		sb.append(" for ");
		sb.append(princToString());
		return error(new LispError(sb.toString()));
	}

//  private StandardObject()
//  {
//    this(new Layout(StandardClass.STANDARD_OBJECT, NIL, NIL));
//  }
//
//
//  protected StandardObject(Layout layout)
//  {
//    this(layout, layout.getLength());
//  }
//
//  protected StandardObject(Layout layout, int length)
//  {
//    this.setLayout(layout);
//    slotsF = new LispObject[length];
//    for (int i = length; i-- > 0;)
//    	slotsF[i] = UNBOUND_VALUE;
//  }
//
//
//  protected StandardObject(LispClass cls, int length)
//  {
//    setLayout(cls == null ? null : cls.getClassLayout());
//    unboundSlots(length);
//  }
//
//
///**
// * @param length
// */
//  static public void unboundSlots(int length) {
//	slots = new LispObject[length];
//    for (int i = slots.length; i-- > 0;)
//      slots[i] = UNBOUND_VALUE;
//  }
//
//  protected StandardObject(LispClass cls)
//  {
//    setLayout(cls == null ? null : cls.getClassLayout());
//    LispObject[] slots = new LispObject[layout == null ? 0 : layout.getLength()];
//    for (int i = slots.length; i-- > 0;)
//      slots[i] = UNBOUND_VALUE;
//  }

  public LispObject getParts()
  {
    LispObject parts = NIL;
    final Layout layout = updateLayout();

    parts = parts.push(new Cons("LAYOUT", layout));
    if (layout != null)
      {
    	final LispObject[] slots = getSlots();
    	LispObject[] slotNames = layout.getSlotNames();
        if (slotNames != null)
          {
            for (int i = 0; i < slotNames.length; i++)
              {
                parts = parts.push(new Cons(slotNames[i], slots[i]));
              }
          }
      }
    return parts.nreverse();
  }

  private LispObject helperGetClassName()
  {
	//    final Layout layout = getLayout();
	  final LispObject c1 = classOf();
    if (c1 instanceof LispClass)
        return ((LispClass)c1).getLispClassName();
    else
        return LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);
  }

  private LispObject helperGetCPL()
  {
	   // final Layout layout = getLayout();
	final LispObject c1 = classOf();
    //final LispObject c1 = layout.getLispClass();
    if (c1 instanceof LispClass)
        return ((LispClass)c1).getCPL();
    else
        return LispThread.currentThread().execute(Symbol.CLASS_PRECEDENCE_LIST, c1);
  }

  public LispObject typep(LispObject type)
  {
    if (type == Symbol.STANDARD_OBJECT)
      return T;
    if (type == StandardClass.STANDARD_OBJECT)
      return T;

    LispObject cls = classOf();
    if (cls != null)
      {
        if (type == cls)
          return T;
        if (type == helperGetClassName())
          return T;
        LispObject cpl = helperGetCPL();
        while (cpl != NIL)
          {
            if (type == cpl.car())
              return T;

            LispObject otherName;
            LispObject otherClass = cpl.car();
            if (otherClass instanceof LispClass) {
              if (type == ((LispClass)otherClass).getLispClassName())
                return T;
            }
            else
            if (type == LispThread
                .currentThread().execute(Symbol.CLASS_NAME, otherClass))
                return T;

            cpl = cpl.cdr();
          }
      }
    return super.typep(type);
  }

  public String printObjectImplSlotBased()
  {
    final LispThread thread = LispThread.currentThread();
    int maxLevel = Integer.MAX_VALUE;
    LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
    if (printLevel instanceof Fixnum)
      maxLevel = ((Fixnum)printLevel).value;
    LispObject currentPrintLevel =
      _CURRENT_PRINT_LEVEL_.symbolValue(thread);
    int currentLevel = Fixnum.getValue(currentPrintLevel);
    if (currentLevel >= maxLevel)
      return "#";
    final LispObject[] slots = getSlots();
    return unreadableString(typeOf().printObject() + " "+ SubLObjectFactory.makeList(slots));
  }


	/**
	 * @param index
	 * @return
	 */
	public LispObject boundsError(int index) {
		int instanceslotslength = getFieldCount();
		if (instanceslotslength > 0)
			return type_error(Fixnum.getInstance(index),
		                    list(Symbol.INTEGER, Fixnum.ZERO,
		                         Fixnum.getInstance(instanceslotslength - 1)));
		else
			return program_error("The object " + princToString()
		                       + " has no slots.");
	}

  // Only handles instance slots (not shared slots).
  public LispObject getInstanceSlotValue(LispObject slotName)

  {


	// this wil call the update
    int index = getInstanceSlotIndex(slotName);
    if (index < 0) {
      // Not found.
      final LispThread thread = LispThread.currentThread();
      // If the operation is slot-value, only the primary value [of
      // slot-missing] will be used by the caller, and all other values
      // will be ignored.
      LispObject value = thread.execute(Symbol.SLOT_MISSING,
                                        this.getLispClass(), this,
                                        slotName, Symbol.SLOT_VALUE);
      thread._values = null;
      return value;
    }
    final LispObject[] slots = getSlots();
    return slots[index];
  }

  // Only handles instance slots (not shared slots).
  public void setInstanceSlotValue(LispObject slotName, LispObject newValue)

  {
    // this will call the updateLayout
    int index = getInstanceSlotIndex(slotName);
    if (index < 0) {
      // Not found.
      final LispThread thread = LispThread.currentThread();
      // If the operation is setf or slot-makunbound, any values
      // [returned by slot-missing] will be ignored by the caller.
      thread.execute(Symbol.SLOT_MISSING, this.getLispClass(), this,
                     slotName, Symbol.SETF, newValue);
      thread._values = null;
    }
    setSlotArray(index,newValue);
  }



  private static final Primitive SWAP_SLOTS
    = new pf_swap_slots();
  @DocString(name="swap-slots",
             args="instance-1 instance-2",
             returns="nil")
  private static final class pf_swap_slots extends Primitive
  {
    pf_swap_slots()
    {
      super("swap-slots", PACKAGE_SYS, true, "instance-1 instance-2");
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      final StandardObject obj1 = checkStandardObject(first);
      final StandardObject obj2 = checkStandardObject(second);
      LispObject[] temp = obj1.getSlots();
      obj1.setSlots(obj2.getSlots());
      obj2.setSlots( temp);
      return NIL;
    }
  };

  private static final Primitive STD_INSTANCE_LAYOUT
    = new pf_std_instance_layout();
  @DocString(name="std-instance-layout")
  private static final class pf_std_instance_layout extends Primitive
  {
    pf_std_instance_layout()
    {
      super("std-instance-layout", PACKAGE_SYS, true);
    }
    public LispObject execute(LispObject arg)
    {
      final StandardObject instance = checkStandardObject(arg);
      return instance.updateLayout();
    }
  };

  private static final Primitive _SET_STD_INSTANCE_LAYOUT
    = new pf__set_std_instance_layout();
  @DocString(name="%set-std-instance-layout")
  private static final class pf__set_std_instance_layout extends Primitive
  {
    pf__set_std_instance_layout()
    {
      super("%set-std-instance-layout", PACKAGE_SYS, true);
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      ((StandardObjectImpl) checkStandardObject(first)).setLayout(checkLayout(second));
      return second;
    }
  };

  private static final Primitive STD_INSTANCE_CLASS
    = new pf_std_instance_class();
  @DocString(name="std-instance-class")
  private static final class pf_std_instance_class extends Primitive
  {
    pf_std_instance_class()
    {
      super("std-instance-class", PACKAGE_SYS, true);
    }
    public LispObject execute(LispObject arg)
    {

      return checkStandardObject(arg).classOf(); //getLayout().getLispClass();
    }
  };

  private static final Primitive STANDARD_INSTANCE_ACCESS
    = new pf_standard_instance_access();
  @DocString(name="standard-instance-access",
             args="instance location",
             returns="value")
  private static final class pf_standard_instance_access extends Primitive
  {
    pf_standard_instance_access()
    {
      super("standard-instance-access", PACKAGE_SYS, true,
            "instance location");
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      final StandardObject instance = checkStandardObject(first);
      instance.updateLayout();

      LispObject value;

      try {
        value = instance.getSlotArrayElement(instance.intValue());
      } catch (ArrayIndexOutOfBoundsException e) {
    	  int instanceslotslength = instance.getSlots().length;
        if (instanceslotslength > 0)
          return type_error(second,
                            list(Symbol.INTEGER, Fixnum.ZERO,
                                 Fixnum.getInstance(instanceslotslength - 1)));
        else
          return program_error("The object " + instance.princToString()
                               + " has no slots.");

      }
      // We let UNBOUND_VALUE escape here, since invoking
      // standard-instance-access on an unbound slot has undefined
      // consequences (AMOP pg. 239), and we use this behavior to
      // implement slot-boundp-using-class.
      return value;
    }
  };

  private static final Primitive _SET_STANDARD_INSTANCE_ACCESS
    = new pf__set_standard_instance_access();
  @DocString(name="%set-standard-instance-access",
             args="instance location new-value",
             returns="new-value")
  private static final class pf__set_standard_instance_access extends Primitive
  {
    pf__set_standard_instance_access()
    {
      super("%set-standard-instance-access", PACKAGE_SYS, true);
    }
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
    {
      final StandardObject instance = checkStandardObject(first);
      instance.updateLayout();

      try {
        return instance.setSlotArray(second.intValue(), third);
      } catch (ArrayIndexOutOfBoundsException e) {
    	  int instanceslotslength = instance.getSlots().length;
        if (instanceslotslength > 0)
          return type_error(second,
                            list(Symbol.INTEGER, Fixnum.ZERO,
                                 Fixnum.getInstance(instanceslotslength - 1)));
        else
          return program_error("The object " + instance.princToString()
                               + " has no slots.");
      }
    }
  };

  private static final Primitive STD_SLOT_BOUNDP
    = new pf_std_slot_boundp();
  @DocString(name="std-slot-boundp")
  private static final class pf_std_slot_boundp extends Primitive
  {
    pf_std_slot_boundp()
    {
      super(Symbol.STD_SLOT_BOUNDP, "instance slot-name");
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      final StandardObject instance = checkStandardObject(first);
      // this wil call the update
      final int index = instance.getInstanceSlotIndex(second);
      if (index >= 0)
        {
          // Found instance slot.
          return instance.getSlotArrayElement(index) != UNBOUND_VALUE ? T : NIL;
        }
      // Check for shared slot.

      final LispObject location = instance.getSharedSlotLocation(second);
      if (location != null)
        return location.cdr() != UNBOUND_VALUE ? T : NIL;
      // Not found.
      final LispThread thread = LispThread.currentThread();
      LispObject value =
        thread.execute(Symbol.SLOT_MISSING, instance.getLispClass(),
                       instance, second, Symbol.SLOT_BOUNDP);
      // "If SLOT-MISSING is invoked and returns a value, a boolean
      // equivalent to its primary value is returned by SLOT-BOUNDP."
      thread._values = null;
      return value != NIL ? T : NIL;
    }
  };

  public LispObject SLOT_VALUE(LispObject slotName)
  {

    LispObject value;
    final int index = getInstanceSlotIndex(slotName);
    if (index >= 0)
      {
        // Found instance slot.
        value = getSlotArrayElement(index);
      }
    else
      {
        // Check for shared slot.
        LispObject location = getSharedSlotLocation(slotName);
        if (location == null)
          return Symbol.SLOT_MISSING.execute(getLispClass(), this, slotName,
                                             Symbol.SLOT_VALUE);
        value = location.cdr();
      }
    if (value == UNBOUND_VALUE)
      {
        value = Symbol.SLOT_UNBOUND.execute(getLispClass(), this, slotName);
        LispThread.currentThread()._values = null;
      }
    return value;
  }




private static final Primitive STD_SLOT_VALUE
    = new pf_std_slot_value();
  @DocString(name="std-slot-value")
  private static final class pf_std_slot_value extends Primitive
  {
    pf_std_slot_value()
    {
      super(Symbol.STD_SLOT_VALUE, "instance slot-name");
    }
    public LispObject execute(LispObject first, LispObject second)
    {
      return first.SLOT_VALUE(second);
    }
  };

  public void setSlotValue(LispObject slotName, LispObject newValue)
  {
    final int index = getInstanceSlotIndex(slotName);
    if (index >= 0 )
      {
    	setSlotArray(index, newValue);
        return;
      }
    // Check for shared slot.
    LispObject location = getSharedSlotLocation(slotName);
    if (location != null)
      {
        location.setCdr(newValue);
        return;
      }
    LispObject[] args = new LispObject[5];
    args[0] = getLispClass();
    args[1] = this;
    args[2] = slotName;
    args[3] = Symbol.SETF;
    args[4] = newValue;
    Symbol.SLOT_MISSING.execute(args);
  }


private static final Primitive SET_STD_SLOT_VALUE
    = new pf_set_std_slot_value();
  @DocString(name="set-std-slot-value")
  private static final class pf_set_std_slot_value extends Primitive
  {
    pf_set_std_slot_value()
    {
      super(Symbol.SET_STD_SLOT_VALUE, "instance slot-name new-value");
    }
    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
    {
      first.setSlotValue(second, third);
      return third;
    }
  };

  private static final Primitive _STD_ALLOCATE_INSTANCE
    = new pf__std_allocate_instance();
  @DocString(name="%std-allocate-instance",
             args="class",
             returns="instance")
  private static final class pf__std_allocate_instance extends Primitive
  {
    pf__std_allocate_instance()
    {
      super("%std-allocate-instance", PACKAGE_SYS, true, "class");
    }
    public LispObject execute(LispObject arg)
    {
      if (arg == StandardClass.FUNCALLABLE_STANDARD_CLASS) {
        return new FuncallableStandardClass();
      } else if (arg == StandardClass.STANDARD_CLASS) {
        return new StandardClass();
      } else if (arg instanceof StandardClass) {
        StandardClass cls = (StandardClass)arg;
        Layout layout = cls.getClassLayout();
        if (layout == null) {
          program_error("No layout for class " + cls.princToString() + ".");
        }
        return new StandardObjectImpl(cls, layout.getLength());
      } else if (arg.typep(StandardClass.STANDARD_CLASS) != NIL) {
        LispObject l = Symbol.CLASS_LAYOUT.execute(arg);
        if (! (l instanceof Layout)) {
          program_error("Invalid standard class layout for class "
                        + arg.princToString() + ".");
        }
        return new StandardObjectImpl((Layout)l);
      } else {
        return type_error(arg, Symbol.STANDARD_CLASS);
      }
    }
  }
}