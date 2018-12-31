//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SystemInfo;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class environment extends SubLTranslatedFile {
	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment";

	public static SubLSymbol $kw0$LISP_IMPLEMENTATION_TYPE;

	public static SubLSymbol $kw1$LISP_IMPLEMENTATION_VERSION;

	public static SubLSymbol $kw2$SHORT_SITE_NAME;

	public static SubLSymbol $kw3$LONG_SITE_NAME;

	public static SubLSymbol $kw4$MACHINE_INSTANCE;

	public static SubLSymbol $kw5$MACHINE_TYPE;

	public static SubLSymbol $kw6$MACHINE_VERSION;

	public static SubLSymbol $kw7$SOFTWARE_TYPE;

	public static SubLSymbol $kw8$SOFTWARE_VERSION;

	public static SubLSymbol $kw9$USER;

	public static SubLSymbol $kw10$PROCESS_ID;

	public static SubLSymbol $kw11$NETWORK_NAME;

	static {
		environment.me = new environment();
		environment.$kw0$LISP_IMPLEMENTATION_TYPE = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-TYPE");
		environment.$kw1$LISP_IMPLEMENTATION_VERSION = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-VERSION");
		environment.$kw2$SHORT_SITE_NAME = SubLObjectFactory.makeKeyword("SHORT-SITE-NAME");
		environment.$kw3$LONG_SITE_NAME = SubLObjectFactory.makeKeyword("LONG-SITE-NAME");
		environment.$kw4$MACHINE_INSTANCE = SubLObjectFactory.makeKeyword("MACHINE-INSTANCE");
		environment.$kw5$MACHINE_TYPE = SubLObjectFactory.makeKeyword("MACHINE-TYPE");
		environment.$kw6$MACHINE_VERSION = SubLObjectFactory.makeKeyword("MACHINE-VERSION");
		environment.$kw7$SOFTWARE_TYPE = SubLObjectFactory.makeKeyword("SOFTWARE-TYPE");
		environment.$kw8$SOFTWARE_VERSION = SubLObjectFactory.makeKeyword("SOFTWARE-VERSION");
		environment.$kw9$USER = SubLObjectFactory.makeKeyword("USER");
		environment.$kw10$PROCESS_ID = SubLObjectFactory.makeKeyword("PROCESS-ID");
		environment.$kw11$NETWORK_NAME = SubLObjectFactory.makeKeyword("NETWORK-NAME");
	}

	public static SubLObject declare_environment_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment", "my_getf", "MY-GETF", 2,
				1, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/environment.lisp", position = 1975L)
	public static SubLObject get_machine_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject machine_name = environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
				environment.$kw4$MACHINE_INSTANCE, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != machine_name)
			return machine_name;
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw11$NETWORK_NAME,
				v_default);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1748L)
	public static SubLObject get_network_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject network_name = environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
				environment.$kw11$NETWORK_NAME, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != network_name)
			return network_name;
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw4$MACHINE_INSTANCE,
				v_default);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1651L)
	public static SubLObject get_process_id(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw10$PROCESS_ID,
				v_default);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1537L)
	public static SubLObject get_user_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw9$USER, v_default);
	}

	public static SubLObject init_environment_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/environment.lisp", position = 801L)
	public static SubLObject lisp_implementation_type() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
				environment.$kw0$LISP_IMPLEMENTATION_TYPE, CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 897L)
	public static SubLObject lisp_implementation_version() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
				environment.$kw1$LISP_IMPLEMENTATION_VERSION, CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1077L)
	public static SubLObject long_site_name() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw3$LONG_SITE_NAME,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1153L)
	public static SubLObject machine_instance() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw4$MACHINE_INSTANCE,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1233L)
	public static SubLObject machine_type() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw5$MACHINE_TYPE,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1305L)
	public static SubLObject machine_version() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw6$MACHINE_VERSION,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 432L)
	public static SubLObject my_getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLObject next = CommonSymbols.NIL;
		SubLObject key = CommonSymbols.NIL;
		next = plist;
		key = next.first();
		while (CommonSymbols.NIL != next) {
			if (indicator == key)
				return conses_high.cadr(next);
			next = conses_high.cddr(next);
			key = next.first();
		}
		return v_default;
	}

	public static SubLObject setup_environment_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/environment.lisp", position = 999L)
	public static SubLObject short_site_name() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw2$SHORT_SITE_NAME,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1383L)
	public static SubLObject software_type() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw7$SOFTWARE_TYPE,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/environment.lisp", position = 1457L)
	public static SubLObject software_version() {
		SubLThread thread = SubLProcess.currentSubLThread();
		return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw8$SOFTWARE_VERSION,
				CommonSymbols.UNPROVIDED);
	}

	public void declareFunctions() {
		environment.declare_environment_file();
	}

	public void initializeVariables() {
		environment.init_environment_file();
	}

	public void runTopLevelForms() {
		environment.setup_environment_file();
	}
}
