/*
 * LispClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: LispClass.java 12481 2010-02-14 21:29:58Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class LispClass extends StandardObject
{
  
  public String toString() {
  	try {
  	return writeToString();
  	} catch (Throwable e) {
    	return super.toString();
		}
	}
  private static EqHashTable map = new EqHashTable(256, NIL, NIL);

	private static boolean debugClassLayout = false;

  public static LispClass addClass(SubLSymbol symbol, LispClass c)
  {
    synchronized (map)
      {
        map.putVoid(symbol, c);
      }
    return c;
  }

  public static void removeClass(SubLSymbol symbol)
  {
    synchronized (map)
      {
        map.removeHT(symbol);
      }
  }

  public static LispClass findClass(SubLSymbol symbol)
  {
    synchronized (map)
      {
        return (LispClass) map.getHT(symbol);
      }
  }

  public static SubLObject findClass(SubLObject name, boolean errorp)

  {
    SubLSymbol symbol = checkSymbol(name);
    LispClass c;
    synchronized (map)
      {
        c = (LispClass) map.getHT(symbol);
      }
    if (c != null)
      return c;
    if (errorp)
      {
        StringBuilder sb =
          new StringBuilder("There is no class named ");
        sb.append(name.writeToString());
        sb.append('.');
        return error(new LispError(sb.toString()));
      }
    return NIL;
  }

  private int sxhash;

  private SubLObject name;
  private SubLObject propertyList;
  private Layout classLayout;
  private SubLObject directSuperclasses = NIL;
  private SubLObject directSubclasses = NIL;
  private SubLObject classPrecedenceList = NIL;
  private SubLObject directMethods = NIL;
  private SubLObject documentation = NIL;
  private boolean finalized;

  protected LispClass(Layout layout)
  {
    super(layout, layout == null ? 0 : layout.getLength());
    sxhash = hashCodeLisp() & 0x7fffffff;
    //classLayout = layout;
  }

  protected LispClass(SubLSymbol symbol)
  {
    this(null, symbol);
  }

  protected LispClass(Layout layout, SubLSymbol symbol)
  {
    super(layout, layout == null ? 0 : layout.getLength());
    setLispClassName(symbol);
    sxhash = hashCodeLisp() & 0x7fffffff;
  }

  protected LispClass(Layout layout,
                      SubLSymbol symbol, SubLObject directSuperclasses)
  {
    super(layout, layout == null ? 0 : layout.getLength());
    sxhash = hashCodeLisp() & 0x7fffffff;
    setLispClassName(symbol);
    setDirectSuperclasses(directSuperclasses);
  }

  public SubLObject getParts()
  {
    SubLObject result = NIL;
    result = result.push(makeCons("NAME", name != null ? name : NIL));
    result = result.push(makeCons("LAYOUT",
                                  getClassLayout() != null
                                  ? getClassLayout() : NIL));
    result = result.push(makeCons("DIRECT-SUPERCLASSES",
                                  getDirectSuperclasses()));
    result = result.push(makeCons("DIRECT-SUBCLASSES", getDirectSubclasses()));
    result = result.push(makeCons("CLASS-PRECEDENCE-LIST", getCPL()));
    result = result.push(makeCons("DIRECT-METHODS", getDirectMethods()));
    result = result.push(makeCons("DOCUMENTATION", getDocumentation()));
    return result.nreverse();
  }

  public SubLObject getDebugParts()
  {
    SubLObject result = NIL;
    result = result.push(makeCons("NAME", name != null ? name : NIL));
    result = result.push(makeCons("LAYOUT",
                                  classLayout != null
                                  ? classLayout : NIL));
    result = result.push(makeCons("DIRECT-SUPERCLASSES",
                                  getDirectSuperclasses()));
    result = result.push(makeCons("DIRECT-SUBCLASSES", getDirectSubclasses()));
    result = result.push(makeCons("CLASS-PRECEDENCE-LIST", getCPL()));
    result = result.push(makeCons("DIRECT-METHODS", getDirectMethods()));
    result = result.push(makeCons("DOCUMENTATION", getDocumentation()));
    return result.nreverse();
  }
  
  public int sxhash()
  {
    return sxhash;
  }

  public SubLObject getLispClassName()
  {
    return name;
  }

  public void setLispClassName(SubLObject name)
  {
    this.name = name;
  }

  public SubLObject getPropertyList()
  {
    if (propertyList == null)
      propertyList = NIL;
    return propertyList;
  }

  public void setPropertyList(SubLObject obj)
  {
    if (obj == null)
      throw new NullPointerException();
    propertyList = obj;
  }

  public Layout getClassLayout()
  {
  	//Layout classLayout = layout;
  	if (classLayout==null && debugClassLayout) {
  		String str = this.writeToString() + this.getDebugParts().writeToString();
  		Debug.trace(";; WARNING NULL CLASSLAYOUT "+str);
      return classLayout;  		
  	}
    return classLayout;
  }

  public void setClassLayout(Layout layout)
  {
  	classLayout = layout;
  	//this.layout = layout;
  }

  public int getLayoutLength()
  {
    if (layout == null)
      return 0;
    return layout.getLength();
  }

  public SubLObject getDirectSuperclasses()
  {
    return directSuperclasses;
  }

  public void setDirectSuperclasses(SubLObject directSuperclasses)
  {
    this.directSuperclasses = directSuperclasses;
  }

  public boolean isFinalized()
  {
    return finalized;
  }

  public void setFinalized(boolean b)
  {
    finalized = b;
  }

  // When there's only one direct superclass...
  public void setDirectSuperclass(SubLObject superclass)
  {
    setDirectSuperclasses(makeCons(superclass));
  }

  public SubLObject getDirectSubclasses()
  {
    return directSubclasses;
  }

  public void setDirectSubclasses(SubLObject directSubclasses)
  {
    this.directSubclasses = directSubclasses;
  }

  public SubLObject getCPL()
  {
    return classPrecedenceList;
  }

  public void setCPL(SubLObject... cpl)
  {
    SubLObject obj1 = cpl[0];
    if (obj1 instanceof SubLCons && cpl.length == 1)
      classPrecedenceList = obj1;
    else
      {
        Debug.assertTrue(obj1 == this);
        SubLObject l = NIL;
        for (int i = cpl.length; i-- > 0;)
            l = makeCons(cpl[i], l);
        classPrecedenceList = l;
      }
  }

  public SubLObject getDirectMethods()
  {
    return directMethods;
  }

  public void setDirectMethods(SubLObject methods)
  {
    directMethods = methods;
  }

  public SubLObject getDocumentation()
  {
    return documentation;
  }

  public void setDocumentation(SubLObject doc)
  {
    documentation = doc;
  }

  public SubLObject typeOf()
  {
    return LispSymbols.CLASS;
  }

  public SubLObject classOf()
  {
    return StandardClass.CLASS;
  }

  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.CLASS)
      return T;
    if (type == StandardClass.CLASS)
      return T;
    return super.typep(type);
  }

  public boolean subclassp(SubLObject obj)
  {
    SubLObject cpl = getCPL();
    while (cpl != NIL)
      {
        if (cpl.first() == obj)
          return true;
        cpl = ((SubLCons)cpl).rest();
      }
    return false;
  }

  // ### find-class symbol &optional errorp environment => class
  private static Primitive FIND_CLASS =
    new JavaPrimitive(LispSymbols.FIND_CLASS, "symbol &optional errorp environment")
    {
      
      public SubLObject execute(SubLObject arg)
      {
        return findClass(arg, true);
      }
      
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        return findClass(first, second != NIL);
      }
      
      public SubLObject execute(SubLObject first, SubLObject second,
                                SubLObject third)

      {
        // FIXME Use environment!
        return findClass(first, second != NIL);
      }
    };

  // ### %set-find-class
  private static Primitive _SET_FIND_CLASS =
    new JavaPrimitive("%set-find-class", PACKAGE_SYS, true)
    {
      
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        SubLSymbol name = checkSymbol(first);
        if (second == NIL)
          {
            removeClass(name);
            return second;
          }
        LispClass c = checkClass(second);
        addClass(name, c);
        return second;
      }
    };

  // ### subclassp
  private static Primitive SUBCLASSP =
    new JavaPrimitive(LispSymbols.SUBCLASSP, "class")
    {
      
      public SubLObject execute(SubLObject first, SubLObject second)

      {
        LispClass c = checkClass(first);
        return c.subclassp(second) ? T : NIL;
      }
    };
}
