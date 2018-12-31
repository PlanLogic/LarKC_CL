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

public  class environment extends SubLTranslatedFile {

  //// Constructor

  private environment() {}
  public static SubLFile me = new environment();
  public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment";

  //// Definitions

  /** Return the value for INDICATOR in PLIST, or DEFAULT if not present */
  @SubL(source = "sublisp/environment.lisp", position = 432) 
  public static SubLObject my_getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject next = NIL;
      SubLObject key = NIL;
      for (next = plist, key = next.first(); (NIL != next); next = conses_high.cddr(next), key = next.first()) {
        if ((indicator == key)) {
          return conses_high.cadr(next);
        }
      }
      return v_default;
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 801) 
  public static SubLObject lisp_implementation_type() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw0$LISP_IMPLEMENTATION_TYPE, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 897) 
  public static SubLObject lisp_implementation_version() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw1$LISP_IMPLEMENTATION_VERSION, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 999) 
  public static SubLObject short_site_name() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw2$SHORT_SITE_NAME, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1077) 
  public static SubLObject long_site_name() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw3$LONG_SITE_NAME, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1153) 
  public static SubLObject machine_instance() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw4$MACHINE_INSTANCE, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1233) 
  public static SubLObject machine_type() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw5$MACHINE_TYPE, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1305) 
  public static SubLObject machine_version() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw6$MACHINE_VERSION, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1383) 
  public static SubLObject software_type() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw7$SOFTWARE_TYPE, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1457) 
  public static SubLObject software_version() {
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw8$SOFTWARE_VERSION, UNPROVIDED);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1537) 
  public static SubLObject get_user_name(SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw9$USER, v_default);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1651) 
  public static SubLObject get_process_id(SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw10$PROCESS_ID, v_default);
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1748) 
  public static SubLObject get_network_name(SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject network_name = my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw11$NETWORK_NAME, UNPROVIDED);
        if ((NIL != network_name)) {
          return network_name;
        } else {
          return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw4$MACHINE_INSTANCE, v_default);
        }
      }
    }
  }

  @SubL(source = "sublisp/environment.lisp", position = 1975) 
  public static SubLObject get_machine_name(SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject machine_name = my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw4$MACHINE_INSTANCE, UNPROVIDED);
        if ((NIL != machine_name)) {
          return machine_name;
        } else {
          return my_getf(SystemInfo.$system_info$.getDynamicValue(thread), $kw11$NETWORK_NAME, v_default);
        }
      }
    }
  }

  public static SubLObject declare_environment_file() {
    declareFunction(myName, "my_getf", "MY-GETF", 2, 1, false);
    /*
    declareFunction(myName, "lisp_implementation_type", "LISP-IMPLEMENTATION-TYPE", 0, 0, false);
    declareFunction(myName, "lisp_implementation_version", "LISP-IMPLEMENTATION-VERSION", 0, 0, false);
    declareFunction(myName, "short_site_name", "SHORT-SITE-NAME", 0, 0, false);
    declareFunction(myName, "long_site_name", "LONG-SITE-NAME", 0, 0, false);
    declareFunction(myName, "machine_instance", "MACHINE-INSTANCE", 0, 0, false);
    declareFunction(myName, "machine_type", "MACHINE-TYPE", 0, 0, false);
    declareFunction(myName, "machine_version", "MACHINE-VERSION", 0, 0, false);
    declareFunction(myName, "software_type", "SOFTWARE-TYPE", 0, 0, false);
    declareFunction(myName, "software_version", "SOFTWARE-VERSION", 0, 0, false);
    declareFunction(myName, "get_user_name", "GET-USER-NAME", 0, 1, false);
    declareFunction(myName, "get_process_id", "GET-PROCESS-ID", 0, 1, false);
    declareFunction(myName, "get_network_name", "GET-NETWORK-NAME", 0, 1, false);
    declareFunction(myName, "get_machine_name", "GET-MACHINE-NAME", 0, 1, false);
    */
    return NIL;
  }

  public static SubLObject init_environment_file() {
    return NIL;
  }

  public static SubLObject setup_environment_file() {
    // CVS_ID("Id: environment.lisp,v 1.8 2006/03/10 20:02:57 goolsbey Exp ");
    return NIL;
  }

  //// Internal Constants

  public static SubLSymbol $kw0$LISP_IMPLEMENTATION_TYPE = makeKeyword("LISP-IMPLEMENTATION-TYPE");
  public static SubLSymbol $kw1$LISP_IMPLEMENTATION_VERSION = makeKeyword("LISP-IMPLEMENTATION-VERSION");
  public static SubLSymbol $kw2$SHORT_SITE_NAME = makeKeyword("SHORT-SITE-NAME");
  public static SubLSymbol $kw3$LONG_SITE_NAME = makeKeyword("LONG-SITE-NAME");
  public static SubLSymbol $kw4$MACHINE_INSTANCE = makeKeyword("MACHINE-INSTANCE");
  public static SubLSymbol $kw5$MACHINE_TYPE = makeKeyword("MACHINE-TYPE");
  public static SubLSymbol $kw6$MACHINE_VERSION = makeKeyword("MACHINE-VERSION");
  public static SubLSymbol $kw7$SOFTWARE_TYPE = makeKeyword("SOFTWARE-TYPE");
  public static SubLSymbol $kw8$SOFTWARE_VERSION = makeKeyword("SOFTWARE-VERSION");
  public static SubLSymbol $kw9$USER = makeKeyword("USER");
  public static SubLSymbol $kw10$PROCESS_ID = makeKeyword("PROCESS-ID");
  public static SubLSymbol $kw11$NETWORK_NAME = makeKeyword("NETWORK-NAME");

  //// Initializers

  public void declareFunctions() {
    declare_environment_file();
  }

  public void initializeVariables() {
    init_environment_file();
  }

  public void runTopLevelForms() {
    setup_environment_file();
  }

}
