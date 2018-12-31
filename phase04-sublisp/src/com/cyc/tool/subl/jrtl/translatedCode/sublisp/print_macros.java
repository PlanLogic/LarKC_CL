/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

public  class print_macros extends SubLTranslatedFile {

  //// Constructor

  private print_macros() {}
  public static SubLFile me = new print_macros();
  public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros";

  //// Definitions

  @SubL(source = "sublisp/print-macros.lisp", position = 596) 
  public static SubLObject print_unreadable_object(SubLObject macroform, SubLObject environment) {
    {
      SubLObject datum = macroform.rest();
      SubLObject current = datum;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
      {
        SubLObject temp = current.rest();
        current = current.first();
        {
          SubLObject object = NIL;
          SubLObject stream = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          object = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
          stream = current.first();
          current = current.rest();
          {
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; (NIL != rest); ) {
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
              current_1 = rest.first();
              rest = rest.rest();
              cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
              if ((NIL == conses_high.member(current_1, $list1, UNPROVIDED, UNPROVIDED))) {
                bad = T;
              }
              if ((current_1 == $kw2$ALLOW_OTHER_KEYS)) {
                allow_other_keys_p = rest.first();
              }
              rest = rest.rest();
            }
            if (((NIL != bad)
                 && (NIL == allow_other_keys_p))) {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
            }
            {
              SubLObject type_tail = cdestructuring_bind.property_list_member($kw3$TYPE, current);
              SubLObject type = ((NIL != type_tail) ? ((SubLObject) conses_high.cadr(type_tail)) : NIL);
              SubLObject identity_tail = cdestructuring_bind.property_list_member($kw4$IDENTITY, current);
              SubLObject identity = ((NIL != identity_tail) ? ((SubLObject) conses_high.cadr(identity_tail)) : NIL);
              current = temp;
              {
                SubLObject body = current;
                return print_unreadable_object_internal(object, stream, type, identity, body);
              }
            }
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/print-macros.lisp", position = 1441) 
  public static SubLObject print_unreadable_object_internal(SubLObject object, SubLObject stream, SubLObject type, SubLObject identity, SubLObject body) {
    {
      SubLObject object_var = Symbols.make_symbol($str5$OBJECT);
      SubLObject stream_var = Symbols.make_symbol($str6$STREAM);
      return list($sym7$PIF, $sym8$_PRINT_READABLY_, list($sym9$PRINT_NOT_READABLE, object, stream), listS($sym10$CLET, list(list(object_var, object), list(stream_var, stream)), list($sym11$WRITE_STRING, $str12$__, stream_var), list($sym13$PWHEN, type, list($sym14$WRITE, list($sym15$TYPE_OF, object_var), $kw16$STREAM, stream_var)), ConsesLow.append(((NIL != body) ? ((SubLObject) list(list($sym17$WRITE_CHAR, Characters.CHAR_space, stream_var))) : NIL), body, list(list($sym13$PWHEN, identity, list($sym17$WRITE_CHAR, Characters.CHAR_space, stream_var), listS($sym14$WRITE, list($sym18$POINTER, object_var), $kw16$STREAM, stream_var, $list19)), list($sym17$WRITE_CHAR, Characters.CHAR_greater, stream_var)))));
    }
  }

  public static SubLObject declare_print_macros_file() {
    declareMacro(myName, "print_unreadable_object", "PRINT-UNREADABLE-OBJECT");
    declareFunction(myName, "print_unreadable_object_internal", "PRINT-UNREADABLE-OBJECT-INTERNAL", 5, 0, false);
    return NIL;
  }

  public static SubLObject init_print_macros_file() {
    return NIL;
  }

  public static SubLObject setup_print_macros_file() {
    // CVS_ID("Id: print-macros.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static SubLList $list0 = list(list(makeSymbol("OBJECT"), makeSymbol("STREAM"), makeSymbol("&KEY"), makeSymbol("TYPE"), IDENTITY), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static SubLList $list1 = list(makeKeyword("TYPE"), makeKeyword("IDENTITY"));
  public static SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static SubLSymbol $kw3$TYPE = makeKeyword("TYPE");
  public static SubLSymbol $kw4$IDENTITY = makeKeyword("IDENTITY");
  public static SubLString $str5$OBJECT = makeString("OBJECT");
  public static SubLString $str6$STREAM = makeString("STREAM");
  public static SubLSymbol $sym7$PIF = makeSymbol("PIF");
  public static SubLSymbol $sym8$_PRINT_READABLY_ = makeSymbol("*PRINT-READABLY*");
  public static SubLSymbol $sym9$PRINT_NOT_READABLE = makeSymbol("PRINT-NOT-READABLE");
  public static SubLSymbol $sym10$CLET = makeSymbol("CLET");
  public static SubLSymbol $sym11$WRITE_STRING = makeSymbol("WRITE-STRING");
  public static SubLString $str12$__ = makeString("#<");
  public static SubLSymbol $sym13$PWHEN = makeSymbol("PWHEN");
  public static SubLSymbol $sym14$WRITE = makeSymbol("WRITE");
  public static SubLSymbol $sym15$TYPE_OF = makeSymbol("TYPE-OF");
  public static SubLSymbol $kw16$STREAM = makeKeyword("STREAM");
  public static SubLSymbol $sym17$WRITE_CHAR = makeSymbol("WRITE-CHAR");
  public static SubLSymbol $sym18$POINTER = makeSymbol("POINTER");
  public static SubLList $list19 = list(makeKeyword("BASE"), SIXTEEN_INTEGER);

  //// Initializers

  public void declareFunctions() {
    declare_print_macros_file();
  }

  public void initializeVariables() {
    init_print_macros_file();
  }

  public void runTopLevelForms() {
    setup_print_macros_file();
  }

}
