package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_object_manager extends SubLTranslatedFile {
	public static final SubLFile me;
	public static final String myName = "com.cyc.cycjava.cycl.kb_object_manager";
	public static final String myFingerPrint = "db8fd13f1e1dbb9c1fad723d80cf25bc6e83a1625c2b2b823a7fca4c1a2660de";
	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLSymbol $dtp_kb_object_manager$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5759L)
	private static SubLSymbol $min_kb_object_lru_size$;
	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5886L)
	private static SubLSymbol $kbom_id_equality_test$;
	private static final SubLList $list0;
	private static final SubLSymbol $sym1$WITH_LOCK_HELD;
	private static final SubLSymbol $sym2$KB_OBJECT_MANAGER_CONTENT_LOCK;
	private static final SubLSymbol $sym3$KB_OBJECT_MANAGER;
	private static final SubLSymbol $sym4$KB_OBJECT_MANAGER_P;
	private static final SubLList $list5;
	private static final SubLList $list6;
	private static final SubLList $list7;
	private static final SubLList $list8;
	private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
	private static final SubLSymbol $sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE;
	private static final SubLList $list11;
	private static final SubLSymbol $sym12$KBOM_NAME;
	private static final SubLSymbol $sym13$_CSETF_KBOM_NAME;
	private static final SubLSymbol $sym14$KBOM_CONTENT_LOCK;
	private static final SubLSymbol $sym15$_CSETF_KBOM_CONTENT_LOCK;
	private static final SubLSymbol $sym16$KBOM_LRU_SIZE_PERCENTAGE;
	private static final SubLSymbol $sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE;
	private static final SubLSymbol $sym18$KBOM_CONTENT_TABLE;
	private static final SubLSymbol $sym19$_CSETF_KBOM_CONTENT_TABLE;
	private static final SubLSymbol $sym20$KBOM_USAGE_TABLE;
	private static final SubLSymbol $sym21$_CSETF_KBOM_USAGE_TABLE;
	private static final SubLSymbol $sym22$KBOM_LRU_INFORMATION;
	private static final SubLSymbol $sym23$_CSETF_KBOM_LRU_INFORMATION;
	private static final SubLSymbol $sym24$KBOM_FILE_VECTOR;
	private static final SubLSymbol $sym25$_CSETF_KBOM_FILE_VECTOR;
	private static final SubLSymbol $sym26$KBOM_ID_THRESHOLD;
	private static final SubLSymbol $sym27$_CSETF_KBOM_ID_THRESHOLD;
	private static final SubLSymbol $sym28$KBOM_LOAD_FUNC;
	private static final SubLSymbol $sym29$_CSETF_KBOM_LOAD_FUNC;
	private static final SubLSymbol $sym30$KBOM_METER_SWAP_TIME_;
	private static final SubLSymbol $sym31$_CSETF_KBOM_METER_SWAP_TIME_;
	private static final SubLSymbol $sym32$KBOM_SWAP_TIME;
	private static final SubLSymbol $sym33$_CSETF_KBOM_SWAP_TIME;
	private static final SubLSymbol $sym34$KBOM_LRU_SIZE_MAX;
	private static final SubLSymbol $sym35$_CSETF_KBOM_LRU_SIZE_MAX;
	private static final SubLSymbol $sym36$KBOM_SUB_FILE_VECTOR;
	private static final SubLSymbol $sym37$_CSETF_KBOM_SUB_FILE_VECTOR;
	private static final SubLSymbol $sym38$KBOM_DUMMY3;
	private static final SubLSymbol $sym39$_CSETF_KBOM_DUMMY3;
	private static final SubLSymbol $kw40$NAME;
	private static final SubLSymbol $kw41$CONTENT_LOCK;
	private static final SubLSymbol $kw42$LRU_SIZE_PERCENTAGE;
	private static final SubLSymbol $kw43$CONTENT_TABLE;
	private static final SubLSymbol $kw44$USAGE_TABLE;
	private static final SubLSymbol $kw45$LRU_INFORMATION;
	private static final SubLSymbol $kw46$FILE_VECTOR;
	private static final SubLSymbol $kw47$ID_THRESHOLD;
	private static final SubLSymbol $kw48$LOAD_FUNC;
	private static final SubLSymbol $kw49$METER_SWAP_TIME_;
	private static final SubLSymbol $kw50$SWAP_TIME;
	private static final SubLSymbol $kw51$LRU_SIZE_MAX;
	private static final SubLSymbol $kw52$SUB_FILE_VECTOR;
	private static final SubLSymbol $kw53$DUMMY3;
	private static final SubLString $str54$Invalid_slot__S_for_construction_;
	private static final SubLSymbol $kw55$BEGIN;
	private static final SubLSymbol $sym56$MAKE_KB_OBJECT_MANAGER;
	private static final SubLSymbol $kw57$SLOT;
	private static final SubLSymbol $kw58$END;
	private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD;
	private static final SubLSymbol $sym60$STRINGP;
	private static final SubLSymbol $sym61$NON_NEGATIVE_INTEGER_P;
	private static final SubLSymbol $sym62$POSITIVE_INTEGER_P;
	private static final SubLSymbol $sym63$FBOUNDP;
	private static final SubLString $str64$_content_manager_lock;
	private static final SubLSymbol $kw65$UNINITIALIZED;
	private static final SubLInteger $int66$212;
	private static final SubLInteger $int67$100;
	private static final SubLString $str68$Got__s__expected_an_extensionless;
	private static final SubLSymbol $kw69$OLDEST;
	private static final SubLSymbol $sym70$NEW_LEGACY_KB_OBJECT_MANAGER;
	private static final SubLFloat $float71$0_05;
	private static final SubLString $str72$Failed_to_swap_in_KB_object__A_ba;
	private static final SubLString $str73$We_expected_KB_object_ID__A_from_;
	private static final SubLSymbol $sym74$SERIALIZE_KBOM_LRU_INFORMATION;
	private static final SubLSymbol $kw75$OUTPUT;
	private static final SubLString $str76$Unable_to_open__S;
	private static final SubLSymbol $sym77$PRECACHE_KBOM_BY_LRU_INFORMATION;
	private static final SubLSymbol $kw78$INPUT;
	private static final SubLSymbol $sym79$_;
	private static final SubLString $str80$_lru_info_for_;
	private static final SubLString $str81$_cfasl;
	private static final SubLSymbol $kw82$NEWEST;
	private static final SubLString $str83$Swapping_out_;
	private static final SubLString $str84$_objects;
	private static final SubLString $str85$cdolist;
	private static final SubLSymbol $sym86$IS_MUTED_KB_OBJECT_;
	private static final SubLList $list87;
	private static final SubLString $str88$Verifying_integrity_of_;
	private static final SubLString $str89$_content_table;
	private static final SubLSymbol $kw90$SKIP;
	private static final SubLString $str91$Entry__a_is_invalid___a__repairin;
	private static final SubLString $str92$Entry__a_is_invalid___a;
	private static final SubLSymbol $sym93$MANAGER;
	private static final SubLSymbol $sym94$MAINTAINING_COUNTS_;
	private static final SubLSymbol $sym95$MEMORY_MAPPED_;
	private static final SubLSymbol $sym96$CLET;
	private static final SubLSymbol $sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_;
	private static final SubLSymbol $sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_;
	private static final SubLSymbol $sym99$CUNWIND_PROTECT;
	private static final SubLSymbol $sym100$PROGN;
	private static final SubLSymbol $sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS;
	private static final SubLSymbol $sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING;
	private static final SubLSymbol $sym103$PWHEN;
	private static final SubLSymbol $sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS;
	private static final SubLSymbol $sym105$CNOT;
	private static final SubLSymbol $sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES;
	private static final SubLList $list107;

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 1696L)
	public static SubLObject with_kb_object_manager_lock_held(final SubLObject macroform,
			final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_object_manager.$list0);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject kbom = (SubLObject) kb_object_manager.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_object_manager.$list0);
		kbom = current.first();
		current = current.rest();
		if (kb_object_manager.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			return (SubLObject) ConsesLow.listS((SubLObject) kb_object_manager.$sym1$WITH_LOCK_HELD,
					(SubLObject) ConsesLow.list((SubLObject) ConsesLow
							.list((SubLObject) kb_object_manager.$sym2$KB_OBJECT_MANAGER_CONTENT_LOCK, kbom)),
					ConsesLow.append(body, (SubLObject) kb_object_manager.NIL));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_object_manager.$list0);
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kb_object_manager_print_function_trampoline(final SubLObject v_object,
			final SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, (SubLObject) kb_object_manager.ZERO_INTEGER);
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kb_object_manager_p(final SubLObject v_object) {
		return (SubLObject) ((v_object.getClass() == $kb_object_manager_native.class) ? kb_object_manager.T
				: kb_object_manager.NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_name(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField2();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_content_lock(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField3();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_lru_size_percentage(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField4();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_content_table(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField5();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_usage_table(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField6();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_lru_information(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField7();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_file_vector(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField8();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_id_threshold(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField9();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_load_func(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField10();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_meter_swap_timeP(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField11();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_swap_time(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField12();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_lru_size_max(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField13();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_sub_file_vector(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField14();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject kbom_dummy3(final SubLObject v_object) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.getField15();
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_name(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField2(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_content_lock(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField3(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_lru_size_percentage(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField4(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_content_table(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField5(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_usage_table(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField6(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_lru_information(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField7(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_file_vector(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField8(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_id_threshold(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField9(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_load_func(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField10(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_meter_swap_timeP(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField11(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_swap_time(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField12(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_lru_size_max(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField13(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_sub_file_vector(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField14(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject _csetf_kbom_dummy3(final SubLObject v_object, final SubLObject value) {
		assert kb_object_manager.NIL != kb_object_manager_p(v_object) : v_object;
		return v_object.setField15(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject make_kb_object_manager(SubLObject arglist) {
		if (arglist == kb_object_manager.UNPROVIDED) {
			arglist = (SubLObject) kb_object_manager.NIL;
		}
		final SubLObject v_new = (SubLObject) new $kb_object_manager_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = (SubLObject) kb_object_manager.NIL, next = arglist; kb_object_manager.NIL != next; next = conses_high
				.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql((SubLObject) kb_object_manager.$kw40$NAME)) {
				_csetf_kbom_name(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw41$CONTENT_LOCK)) {
				_csetf_kbom_content_lock(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw42$LRU_SIZE_PERCENTAGE)) {
				_csetf_kbom_lru_size_percentage(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw43$CONTENT_TABLE)) {
				_csetf_kbom_content_table(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw44$USAGE_TABLE)) {
				_csetf_kbom_usage_table(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw45$LRU_INFORMATION)) {
				_csetf_kbom_lru_information(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw46$FILE_VECTOR)) {
				_csetf_kbom_file_vector(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw47$ID_THRESHOLD)) {
				_csetf_kbom_id_threshold(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw48$LOAD_FUNC)) {
				_csetf_kbom_load_func(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw49$METER_SWAP_TIME_)) {
				_csetf_kbom_meter_swap_timeP(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw50$SWAP_TIME)) {
				_csetf_kbom_swap_time(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw51$LRU_SIZE_MAX)) {
				_csetf_kbom_lru_size_max(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw52$SUB_FILE_VECTOR)) {
				_csetf_kbom_sub_file_vector(v_new, current_value);
			} else if (pcase_var.eql((SubLObject) kb_object_manager.$kw53$DUMMY3)) {
				_csetf_kbom_dummy3(v_new, current_value);
			} else {
				Errors.error((SubLObject) kb_object_manager.$str54$Invalid_slot__S_for_construction_, current_arg);
			}
		}
		return v_new;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject visit_defstruct_kb_object_manager(final SubLObject obj, final SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw55$BEGIN,
				(SubLObject) kb_object_manager.$sym56$MAKE_KB_OBJECT_MANAGER,
				(SubLObject) kb_object_manager.FOURTEEN_INTEGER);
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw40$NAME, kbom_name(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw41$CONTENT_LOCK, kbom_content_lock(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw42$LRU_SIZE_PERCENTAGE, kbom_lru_size_percentage(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw43$CONTENT_TABLE, kbom_content_table(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw44$USAGE_TABLE, kbom_usage_table(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw45$LRU_INFORMATION, kbom_lru_information(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw46$FILE_VECTOR, kbom_file_vector(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw47$ID_THRESHOLD, kbom_id_threshold(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw48$LOAD_FUNC, kbom_load_func(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw49$METER_SWAP_TIME_, kbom_meter_swap_timeP(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw50$SWAP_TIME, kbom_swap_time(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw51$LRU_SIZE_MAX, kbom_lru_size_max(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw52$SUB_FILE_VECTOR, kbom_sub_file_vector(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw57$SLOT,
				(SubLObject) kb_object_manager.$kw53$DUMMY3, kbom_dummy3(obj));
		Functions.funcall(visitor_fn, obj, (SubLObject) kb_object_manager.$kw58$END,
				(SubLObject) kb_object_manager.$sym56$MAKE_KB_OBJECT_MANAGER,
				(SubLObject) kb_object_manager.FOURTEEN_INTEGER);
		return obj;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2333L)
	public static SubLObject visit_defstruct_object_kb_object_manager_method(final SubLObject obj,
			final SubLObject visitor_fn) {
		return visit_defstruct_kb_object_manager(obj, visitor_fn);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 2776L)
	public static SubLObject new_kb_object_manager(final SubLObject name, final SubLObject size,
			final SubLObject lru_size_percentage, final SubLObject lru_size_max, final SubLObject load_func,
			final SubLObject exact_sizeP) {
		assert kb_object_manager.NIL != Types.stringp(name) : name;
		assert kb_object_manager.NIL != subl_promotions.non_negative_integer_p(size) : size;
		assert kb_object_manager.NIL != subl_promotions.positive_integer_p(lru_size_percentage) : lru_size_percentage;
		assert kb_object_manager.NIL != subl_promotions.positive_integer_p(lru_size_max) : lru_size_max;
		assert kb_object_manager.NIL != Symbols.fboundp(load_func) : load_func;
		final SubLObject kbom = make_kb_object_manager((SubLObject) kb_object_manager.UNPROVIDED);
		_csetf_kbom_name(kbom, name);
		_csetf_kbom_content_lock(kbom, Locks
				.make_lock(Sequences.cconcatenate(name, (SubLObject) kb_object_manager.$str64$_content_manager_lock)));
		_csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
		_csetf_kbom_lru_size_max(kbom, lru_size_max);
		setup_kb_object_content_table(kbom, size, exact_sizeP);
		_csetf_kbom_usage_table(kbom, (SubLObject) kb_object_manager.$kw65$UNINITIALIZED);
		_csetf_kbom_file_vector(kbom, (SubLObject) kb_object_manager.NIL);
		_csetf_kbom_id_threshold(kbom, (SubLObject) kb_object_manager.ZERO_INTEGER);
		_csetf_kbom_load_func(kbom, load_func);
		_csetf_kbom_meter_swap_timeP(kbom, (SubLObject) kb_object_manager.NIL);
		_csetf_kbom_swap_time(kbom, (SubLObject) kb_object_manager.NIL);
		_csetf_kbom_sub_file_vector(kbom, (SubLObject) kb_object_manager.NIL);
		return kbom;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4003L)
	public static SubLObject kb_object_manager_change_stream_buffer_sizes(final SubLObject kbom,
			final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
		assert kb_object_manager.NIL != subl_promotions
				.positive_integer_p(data_stream_buffer_size) : data_stream_buffer_size;
		assert kb_object_manager.NIL != subl_promotions
				.positive_integer_p(index_stream_buffer_size) : index_stream_buffer_size;
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject fvector = kb_object_manager_file_vector(kbom);
			if (kb_object_manager.NIL != fvector) {
				file_vector.file_vector_change_stream_buffer_sizes(fvector, data_stream_buffer_size,
						index_stream_buffer_size);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4515L)
	public static SubLObject kb_object_manager_enable_memory_mapping(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject fvector = kb_object_manager_file_vector(kbom);
			if (kb_object_manager.NIL != fvector) {
				file_vector.file_vector_enable_memory_mapping(fvector);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 4802L)
	public static SubLObject kb_object_manager_memory_mappedP(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		SubLObject result = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject fvector = kb_object_manager_file_vector(kbom);
			result = (SubLObject) SubLObjectFactory.makeBoolean(kb_object_manager.NIL != fvector
					&& kb_object_manager.NIL != file_vector.file_vector_memory_mappedP(fvector));
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5116L)
	public static SubLObject setup_kb_object_content_table(final SubLObject kbom, final SubLObject size,
			final SubLObject exactP) {
		SubLObject did_setupP = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject content_table = kb_object_manager_content_table(kbom);
			if (kb_object_manager.NIL == id_index.id_index_p(content_table)) {
				_csetf_kbom_content_table(kbom,
						id_index.new_id_index(size, (SubLObject) kb_object_manager.ZERO_INTEGER));
				did_setupP = (SubLObject) kb_object_manager.T;
			}
			did_setupP = setup_kb_object_content_support(kbom, (SubLObject) kb_object_manager.NIL, size);
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return did_setupP;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 5937L)
	public static SubLObject setup_kb_object_content_support(final SubLObject kbom, SubLObject initialize_usage_countsP,
			SubLObject size) {
		if (initialize_usage_countsP == kb_object_manager.UNPROVIDED) {
			initialize_usage_countsP = (SubLObject) kb_object_manager.NIL;
		}
		if (size == kb_object_manager.UNPROVIDED) {
			size = (SubLObject) kb_object_manager.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (!size.isFixnum()) {
			size = id_index.id_index_sparse_id_threshold(kb_object_manager_content_table(kbom));
		}
		SubLObject did_setupP = (SubLObject) kb_object_manager.NIL;
		if (kb_object_manager.NIL != initialize_usage_countsP
				&& kb_object_manager.NIL == id_index.id_index_p(kb_object_manager_usage_table(kbom))) {
			_csetf_kbom_usage_table(kbom, id_index.new_id_index(size, (SubLObject) kb_object_manager.ZERO_INTEGER));
			did_setupP = (SubLObject) kb_object_manager.T;
		}
		if (kb_object_manager.NIL == cache.cache_p(kb_object_manager_lru_information(kbom))) {
			final SubLObject lru_size = compute_kbom_lru_size(kbom, size);
			final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
			try {
				Storage.$current_area$.bind(Storage.get_static_area(), thread);
				_csetf_kbom_lru_information(kbom, cache.new_preallocated_cache(lru_size,
						kb_object_manager.$kbom_id_equality_test$.getGlobalValue()));
			} finally {
				Storage.$current_area$.rebind(_prev_bind_0, thread);
			}
		}
		return did_setupP;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 6770L)
	public static SubLObject compute_kbom_lru_size(final SubLObject kbom, final SubLObject given_size) {
		SubLObject size = Numbers.multiply(Numbers.integerDivide(given_size, (SubLObject) kb_object_manager.$int67$100),
				kb_object_manager_lru_size_percentage(kbom));
		final SubLObject max_size = kb_object_manager_lru_size_max(kbom);
		if (kb_object_manager.NIL != max_size && size.numG(max_size)) {
			size = max_size;
		}
		if (size.numL(kb_object_manager.$min_kb_object_lru_size$.getGlobalValue())) {
			size = kb_object_manager.$min_kb_object_lru_size$.getGlobalValue();
		}
		return size;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 7150L)
	public static SubLObject initialize_kb_object_hl_store_cache(final SubLObject kbom,
			final SubLObject content_filename, final SubLObject index_filename, SubLObject sub_content_filename,
			SubLObject sub_index_filename) {
		if (sub_content_filename == kb_object_manager.UNPROVIDED) {
			sub_content_filename = (SubLObject) kb_object_manager.NIL;
		}
		if (sub_index_filename == kb_object_manager.UNPROVIDED) {
			sub_index_filename = (SubLObject) kb_object_manager.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject cdolist_list_var = (SubLObject) ConsesLow.list(content_filename, index_filename,
				sub_content_filename, sub_index_filename);
		SubLObject filename = (SubLObject) kb_object_manager.NIL;
		filename = cdolist_list_var.first();
		while (kb_object_manager.NIL != cdolist_list_var) {
			if (filename.isString() && kb_object_manager.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
					&& kb_object_manager.NIL != string_utilities.ends_with(content_filename,
							misc_utilities.$standard_hl_store_cache_file_extension$.getGlobalValue(),
							(SubLObject) kb_object_manager.UNPROVIDED)) {
				Errors.error((SubLObject) kb_object_manager.$str68$Got__s__expected_an_extensionless, filename);
			}
			cdolist_list_var = cdolist_list_var.rest();
			filename = cdolist_list_var.first();
		}
		final SubLObject mark_filename = dumper.get_wide_mark_basename_from_index_basename(index_filename);
		final SubLObject kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(content_filename,
				(SubLObject) kb_object_manager.UNPROVIDED);
		final SubLObject kb_object_index_file = misc_utilities.get_hl_store_cache_filename(index_filename,
				(SubLObject) kb_object_manager.UNPROVIDED);
		final SubLObject kb_object_mark_file = misc_utilities.get_hl_store_cache_filename(mark_filename,
				(SubLObject) kb_object_manager.UNPROVIDED);
		SubLObject result = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			if (kb_object_manager.NIL != Filesys.probe_file(kb_object_cfasl_file)
					&& kb_object_manager.NIL != Filesys.probe_file(kb_object_index_file)) {
				final SubLObject old_file_vector = kbom_file_vector(kbom);
				if (kb_object_manager.NIL != file_vector.file_vector_p(old_file_vector)) {
					file_vector.close_file_vector(old_file_vector);
				}
				final SubLObject v_file_vector = new_kb_object_content_file_vector(kb_object_cfasl_file,
						kb_object_index_file, kb_object_mark_file);
				_csetf_kbom_file_vector(kbom, v_file_vector);
				_csetf_kbom_id_threshold(kbom, file_vector.file_vector_length(v_file_vector));
				if (sub_index_filename.isString()) {
					final SubLObject sub_mark_filename = dumper
							.get_wide_mark_basename_from_index_basename(sub_index_filename);
					final SubLObject sub_kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(
							sub_content_filename, (SubLObject) kb_object_manager.UNPROVIDED);
					final SubLObject sub_kb_object_index_file = misc_utilities
							.get_hl_store_cache_filename(sub_index_filename, (SubLObject) kb_object_manager.UNPROVIDED);
					final SubLObject sub_kb_object_mark_file = misc_utilities
							.get_hl_store_cache_filename(sub_mark_filename, (SubLObject) kb_object_manager.UNPROVIDED);
					if (kb_object_manager.NIL != Filesys.probe_file(sub_kb_object_cfasl_file)
							&& kb_object_manager.NIL != Filesys.probe_file(sub_kb_object_index_file)) {
						final SubLObject old_sub_fvector = kbom_sub_file_vector(kbom);
						if (kb_object_manager.NIL != file_vector.file_vector_p(old_sub_fvector)) {
							file_vector.close_file_vector(old_sub_fvector);
						}
						final SubLObject sub_file_vector = new_kb_object_content_file_vector(sub_kb_object_cfasl_file,
								sub_kb_object_index_file, sub_kb_object_mark_file);
						set_kb_object_manager_sub_file_vector(kbom, sub_file_vector);
					}
				}
				result = kb_object_content_file_vector_p(v_file_vector);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 9781L)
	public static SubLObject resize_kbom_lru_cache_from_percentage_and_max(final SubLObject kbom,
			final SubLObject percentage, final SubLObject max) {
		_csetf_kbom_lru_size_percentage(kbom, percentage);
		_csetf_kbom_lru_size_max(kbom, max);
		final SubLObject old_size = id_index.id_index_sparse_id_threshold(kb_object_manager_content_table(kbom));
		final SubLObject new_size = compute_kbom_lru_size(kbom, old_size);
		return resize_kbom_lru_cache(kbom, new_size);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 10237L)
	public static SubLObject resize_kbom_lru_cache(final SubLObject kbom, final SubLObject new_size) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		safely_swap_out_all_pristine_kb_objects(kbom);
		final SubLObject old_cache = kbom_lru_information(kbom);
		SubLObject new_cache = (SubLObject) kb_object_manager.NIL;
		final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
		try {
			Storage.$current_area$.bind(Storage.get_static_area(), thread);
			new_cache = cache.new_preallocated_cache(new_size,
					kb_object_manager.$kbom_id_equality_test$.getGlobalValue());
		} finally {
			Storage.$current_area$.rebind(_prev_bind_0, thread);
		}
		if (kb_object_manager.NIL == cache.cache_empty_p(old_cache)) {
			final SubLObject cache_var = old_cache;
			final SubLObject order_var = (SubLObject) kb_object_manager.$kw69$OLDEST;
			SubLObject entry = cache.do_cache_first(cache_var, order_var);
			SubLObject id = (SubLObject) kb_object_manager.NIL;
			SubLObject value = (SubLObject) kb_object_manager.NIL;
			while (kb_object_manager.NIL == cache.do_cache_doneP(cache_var, entry)) {
				id = cache.do_cache_key(entry);
				value = cache.do_cache_value(entry);
				entry = cache.do_cache_next(entry, order_var);
				cache.cache_set(new_cache, id, id);
			}
		}
		_csetf_kbom_lru_information(kbom, new_cache);
		_csetf_kbom_lru_size_max(kbom, new_size);
		final SubLObject percentage = Numbers.divide(new_size,
				id_index.id_index_sparse_id_threshold(kb_object_manager_content_table(kbom)));
		_csetf_kbom_lru_size_percentage(kbom,
				Numbers.round(Numbers.multiply((SubLObject) kb_object_manager.$int67$100, percentage),
						(SubLObject) kb_object_manager.UNPROVIDED));
		return kbom;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 11108L)
	public static SubLObject new_legacy_kb_object_manager(final SubLObject name, final SubLObject lru_size_percentage,
			final SubLObject lru_size_max, final SubLObject content_table, final SubLObject lru_information,
			final SubLObject usage_table, final SubLObject load_func) {
		final SubLObject kbom = make_kb_object_manager((SubLObject) kb_object_manager.UNPROVIDED);
		_csetf_kbom_name(kbom, name);
		_csetf_kbom_content_lock(kbom, Locks
				.make_lock(Sequences.cconcatenate(name, (SubLObject) kb_object_manager.$str64$_content_manager_lock)));
		_csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
		_csetf_kbom_lru_size_max(kbom, lru_size_max);
		_csetf_kbom_content_table(kbom, content_table);
		_csetf_kbom_lru_information(kbom, lru_information);
		_csetf_kbom_usage_table(kbom, usage_table);
		_csetf_kbom_file_vector(kbom, (SubLObject) kb_object_manager.$kw65$UNINITIALIZED);
		_csetf_kbom_id_threshold(kbom, (SubLObject) kb_object_manager.ZERO_INTEGER);
		_csetf_kbom_load_func(kbom, load_func);
		_csetf_kbom_meter_swap_timeP(kbom, (SubLObject) kb_object_manager.NIL);
		_csetf_kbom_swap_time(kbom, (SubLObject) kb_object_manager.NIL);
		return kbom;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 12035L)
	public static SubLObject optimize_kb_object_content_table(final SubLObject kbom,
			final SubLObject sparse_id_threshold) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert kb_object_manager.NIL != subl_promotions
				.non_negative_integer_p(sparse_id_threshold) : sparse_id_threshold;
		final SubLObject new_size = Numbers.ceiling(
				Numbers.add(sparse_id_threshold,
						Numbers.multiply(sparse_id_threshold, (SubLObject) kb_object_manager.$float71$0_05)),
				(SubLObject) kb_object_manager.UNPROVIDED);
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject content_table = kb_object_manager_content_table(kbom);
			id_index.set_id_index_next_id(content_table, sparse_id_threshold);
			final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
			try {
				Storage.$current_area$.bind(Storage.get_static_area(), thread);
				id_index.optimize_id_index(content_table, new_size);
			} finally {
				Storage.$current_area$.rebind(_prev_bind_0, thread);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return new_size;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 12532L)
	public static SubLObject clear_kb_object_content_table(final SubLObject kbom) {
		SubLObject result = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject usage_table = kb_object_manager_usage_table(kbom);
			if (kb_object_manager.NIL != id_index.id_index_p(usage_table)) {
				id_index.clear_id_index(usage_table);
			}
			final SubLObject lru_information = kb_object_manager_lru_information(kbom);
			if (kb_object_manager.NIL != cache.cache_p(lru_information)) {
				cache.cache_clear(lru_information);
			}
			final SubLObject content_table = kb_object_manager_content_table(kbom);
			result = id_index.clear_id_index(content_table);
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13077L)
	public static SubLObject kb_object_manager_name(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_name(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13202L)
	public static SubLObject kb_object_manager_content_lock(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_content_lock(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13333L)
	public static SubLObject kb_object_manager_lru_size_percentage(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_lru_size_percentage(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13476L)
	public static SubLObject kb_object_manager_lru_size_max(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_lru_size_max(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13605L)
	public static SubLObject kb_object_manager_content_table(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_content_table(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13736L)
	public static SubLObject kb_object_manager_usage_table(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_usage_table(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13863L)
	public static SubLObject kb_object_manager_lru_information(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_lru_information(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 13998L)
	public static SubLObject kb_object_manager_file_vector(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_file_vector(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14127L)
	public static SubLObject kb_object_manager_id_threshold(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_id_threshold(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14256L)
	public static SubLObject kb_object_manager_load_func(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_load_func(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14379L)
	public static SubLObject kb_object_manager_meter_swap_timeP(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_meter_swap_timeP(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14516L)
	public static SubLObject kb_object_manager_swap_time(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_swap_time(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14641L)
	public static SubLObject kb_object_manager_sub_file_vector(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		return kbom_sub_file_vector(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14778L)
	public static SubLObject set_kb_object_manager_sub_file_vector(final SubLObject kbom, final SubLObject fvector) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		_csetf_kbom_sub_file_vector(kbom, fvector);
		return kbom;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 14962L)
	public static SubLObject kb_object_usage_counts_enabledP(final SubLObject kbom) {
		return id_index.id_index_p(kb_object_manager_usage_table(kbom));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15093L)
	public static SubLObject cached_kb_object_count(final SubLObject kbom) {
		final SubLObject content_table = kb_object_manager_content_table(kbom);
		if (kb_object_manager.NIL == id_index.id_index_p(content_table)) {
			return (SubLObject) kb_object_manager.ZERO_INTEGER;
		}
		return id_index.id_index_count(content_table);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15305L)
	public static SubLObject swappable_kb_object_count(final SubLObject kbom) {
		return cache.cache_size(kbom_lru_information(kbom));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15494L)
	public static SubLObject kb_object_id_cachedP(final SubLObject kbom, final SubLObject id) {
		return misc_utilities.initialized_p(
				id_index.id_index_lookup(kb_object_manager_content_table(kbom), id, misc_utilities.uninitialized()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15645L)
	public static SubLObject kb_object_id_cachableP(final SubLObject kbom, final SubLObject id) {
		return (SubLObject) SubLObjectFactory.makeBoolean(kb_object_manager.NIL != misc_utilities.initialized_p(
				id_index.id_index_lookup(kb_object_manager_content_table(kbom), id, misc_utilities.uninitialized()))
				|| kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 15857L)
	public static SubLObject lookup_kb_object_content(final SubLObject kbom, final SubLObject id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject content = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject content_table = kb_object_manager_content_table(kbom);
			content = id_index.id_index_lookup(content_table, id, misc_utilities.uninitialized());
			if (kb_object_manager.NIL != misc_utilities.uninitialized_p(content)) {
				if (kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
					final SubLObject _prev_bind_0 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$
							.currentBinding(thread);
					try {
						file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$
								.bind(kb_object_manager_sub_file_vector(kbom), thread);
						swap_in_kb_object_content(kbom, id);
						kb_storage_logging.maybe_kb_storage_log_load(id);
						content = id_index.id_index_lookup(content_table, id,
								(SubLObject) kb_object_manager.UNPROVIDED);
					} finally {
						file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0, thread);
					}
				} else {
					content = (SubLObject) kb_object_manager.NIL;
				}
			} else {
				update_kb_object_usage(kbom, id);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return content;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 16619L)
	public static SubLObject kb_object_manager_unbuiltP(final SubLObject kbom) {
		assert kb_object_manager.NIL != kb_object_manager_p(kbom) : kbom;
		SubLObject is_file_vectorP = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			is_file_vectorP = file_vector.file_vector_p(kb_object_manager_file_vector(kbom));
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		if (kb_object_manager.NIL != is_file_vectorP) {
			return (SubLObject) kb_object_manager.NIL;
		}
		final SubLObject v_id_index = kb_object_manager_content_table(kbom);
		if (kb_object_manager.NIL != id_index.id_index_p(v_id_index)
				&& id_index.id_index_count(v_id_index).isPositive()) {
			return (SubLObject) kb_object_manager.NIL;
		}
		return (SubLObject) kb_object_manager.T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17139L)
	public static SubLObject maintain_kb_object_usage_counts(final SubLObject kbom) {
		if (kb_object_manager.NIL == kb_object_usage_counts_enabledP(kbom)) {
			final SubLObject lock = kb_object_manager_content_lock(kbom);
			SubLObject release = (SubLObject) kb_object_manager.NIL;
			try {
				release = Locks.seize_lock(lock);
				setup_kb_object_content_support(kbom, (SubLObject) kb_object_manager.T,
						(SubLObject) kb_object_manager.UNPROVIDED);
			} finally {
				if (kb_object_manager.NIL != release) {
					Locks.release_lock(lock);
				}
			}
		}
		return (SubLObject) kb_object_manager.T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17417L)
	public static SubLObject dont_maintain_kb_object_usage_counts(final SubLObject kbom) {
		if (kb_object_manager.NIL != kb_object_usage_counts_enabledP(kbom)) {
			final SubLObject lock = kb_object_manager_content_lock(kbom);
			SubLObject release = (SubLObject) kb_object_manager.NIL;
			try {
				release = Locks.seize_lock(lock);
				_csetf_kbom_usage_table(kbom, (SubLObject) kb_object_manager.NIL);
			} finally {
				if (kb_object_manager.NIL != release) {
					Locks.release_lock(lock);
				}
			}
		}
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17682L)
	public static SubLObject register_kb_object_content(final SubLObject kbom, final SubLObject id,
			final SubLObject kb_object_content) {
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			id_index.id_index_enter(kb_object_manager_content_table(kbom), id, kb_object_content);
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return kb_object_content;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 17971L)
	public static SubLObject deregister_kb_object_content(final SubLObject kbom, final SubLObject id) {
		SubLObject deregistration = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			deregistration = id_index.id_index_remove(kb_object_manager_content_table(kbom), id);
			drop_kb_object_usage(kbom, id);
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return deregistration;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18311L)
	public static SubLObject new_kb_object_content_file_vector(final SubLObject cfasl_file, final SubLObject index_file,
			SubLObject mark_file) {
		if (mark_file == kb_object_manager.UNPROVIDED) {
			mark_file = (SubLObject) kb_object_manager.NIL;
		}
		if (kb_object_manager.NIL == list_utilities.sublisp_boolean(mark_file)) {
			return file_vector.new_file_vector(cfasl_file, index_file, (SubLObject) kb_object_manager.UNPROVIDED,
					(SubLObject) kb_object_manager.UNPROVIDED, (SubLObject) kb_object_manager.UNPROVIDED,
					(SubLObject) kb_object_manager.UNPROVIDED);
		}
		return file_vector.new_wide_input_file_vector(cfasl_file, index_file, mark_file,
				(SubLObject) kb_object_manager.UNPROVIDED, (SubLObject) kb_object_manager.UNPROVIDED,
				(SubLObject) kb_object_manager.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18689L)
	public static SubLObject kb_object_content_file_vector_cfasl_stream(final SubLObject v_file_vector) {
		return file_vector.get_file_vector_data_stream(v_file_vector);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18814L)
	public static SubLObject kb_object_content_file_vector_p(final SubLObject v_object) {
		return file_vector.file_vector_p(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 18904L)
	public static SubLObject kb_object_content_file_vector_lookup(final SubLObject kbom, final SubLObject id) {
		final SubLObject cfasl_stream = file_vector.position_file_vector(kb_object_manager_file_vector(kbom), id);
		final SubLObject kb_object_id = cfasl.cfasl_input(cfasl_stream, (SubLObject) kb_object_manager.UNPROVIDED,
				(SubLObject) kb_object_manager.UNPROVIDED);
		if (!kb_object_id.eql(id)) {
			final SubLObject index_spot = streams_high.file_position(
					file_vector.get_file_vector_index_stream(kb_object_manager_file_vector(kbom)),
					(SubLObject) kb_object_manager.UNPROVIDED);
			if (kb_object_manager.NIL != subl_promotions.non_negative_integer_p(kb_object_id)) {
				Errors.error((SubLObject) kb_object_manager.$str72$Failed_to_swap_in_KB_object__A_ba,
						new SubLObject[] { id, cfasl_stream, kb_object_id, index_spot });
			} else {
				Errors.error((SubLObject) kb_object_manager.$str73$We_expected_KB_object_ID__A_from_,
						new SubLObject[] { id, cfasl_stream, kb_object_id, Types.type_of(kb_object_id), index_spot });
			}
		}
		final SubLObject load_func = kb_object_manager_load_func(kbom);
		Functions.funcall(load_func, id, cfasl_stream);
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20016L)
	public static SubLObject wide_kb_object_managerP(final SubLObject kbom) {
		return file_vector.wide_file_vectorP(kb_object_manager_file_vector(kbom));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20132L)
	public static SubLObject wide_kb_object_sub_managerP(final SubLObject kbom) {
		final SubLObject sub_fvector = kb_object_manager_sub_file_vector(kbom);
		return (SubLObject) SubLObjectFactory
				.makeBoolean(kb_object_manager.NIL != file_vector.file_vector_p(sub_fvector)
						&& kb_object_manager.NIL != file_vector.wide_file_vectorP(sub_fvector));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20345L)
	public static SubLObject serialize_kbom_lru_information(final SubLObject kbom, final SubLObject directory) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject filename = kbom_lru_info_filename(kbom, directory);
		final SubLObject lru_information = kb_object_manager_lru_information(kbom);
		SubLObject stream = (SubLObject) kb_object_manager.NIL;
		try {
			final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
			try {
				stream_macros.$stream_requires_locking$.bind((SubLObject) kb_object_manager.NIL, thread);
				stream = compatibility.open_binary(filename, (SubLObject) kb_object_manager.$kw75$OUTPUT);
			} finally {
				stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
			}
			if (!stream.isStream()) {
				Errors.error((SubLObject) kb_object_manager.$str76$Unable_to_open__S, filename);
			}
			final SubLObject s = stream;
			if (kb_object_manager.NIL != cache.cache_p(lru_information)) {
				cfasl.cfasl_output(cache.cache_keys(lru_information), s);
			}
		} finally {
			final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_object_manager.T, thread);
				final SubLObject _values = Values.getValuesAsVector();
				if (stream.isStream()) {
					streams_high.close(stream, (SubLObject) kb_object_manager.UNPROVIDED);
				}
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return filename;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 20940L)
	public static SubLObject precache_kbom_by_lru_information(final SubLObject kbom, final SubLObject directory) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject filename = kbom_lru_info_filename(kbom, directory);
		final SubLObject lru_information = kb_object_manager_lru_information(kbom);
		if (kb_object_manager.NIL != cache.cache_p(lru_information)) {
			SubLObject stream = (SubLObject) kb_object_manager.NIL;
			try {
				final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
				try {
					stream_macros.$stream_requires_locking$.bind((SubLObject) kb_object_manager.NIL, thread);
					stream = compatibility.open_binary(filename, (SubLObject) kb_object_manager.$kw78$INPUT);
				} finally {
					stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
				}
				if (!stream.isStream()) {
					Errors.error((SubLObject) kb_object_manager.$str76$Unable_to_open__S, filename);
				}
				final SubLObject s = stream;
				final SubLObject lru_ordered_ids = cfasl.cfasl_input(s, (SubLObject) kb_object_manager.UNPROVIDED,
						(SubLObject) kb_object_manager.UNPROVIDED);
				SubLObject cdolist_list_var;
				final SubLObject page_ordered_ids = cdolist_list_var = Sort.sort(conses_high.copy_list(lru_ordered_ids),
						Symbols.symbol_function((SubLObject) kb_object_manager.$sym79$_),
						(SubLObject) kb_object_manager.UNPROVIDED);
				SubLObject id = (SubLObject) kb_object_manager.NIL;
				id = cdolist_list_var.first();
				while (kb_object_manager.NIL != cdolist_list_var) {
					lookup_kb_object_content(kbom, id);
					cdolist_list_var = cdolist_list_var.rest();
					id = cdolist_list_var.first();
				}
				cdolist_list_var = Sequences.nreverse(lru_ordered_ids);
				id = (SubLObject) kb_object_manager.NIL;
				id = cdolist_list_var.first();
				while (kb_object_manager.NIL != cdolist_list_var) {
					update_kb_object_usage(kbom, id);
					cdolist_list_var = cdolist_list_var.rest();
					id = cdolist_list_var.first();
				}
			} finally {
				final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_object_manager.T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					if (stream.isStream()) {
						streams_high.close(stream, (SubLObject) kb_object_manager.UNPROVIDED);
					}
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		}
		return filename;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 21855L)
	public static SubLObject kbom_lru_info_filename(final SubLObject kbom, final SubLObject directory) {
		return Sequences.cconcatenate(directory,
				new SubLObject[] { kbom_name(kbom), kb_object_manager.$str80$_lru_info_for_,
						operation_communication.kb_loaded_string(), kb_object_manager.$str81$_cfasl });
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22009L)
	public static SubLObject is_lru_cachable_kb_object_content_idP(final SubLObject kbom, final SubLObject id) {
		return Numbers.numL(id, kb_object_manager_id_threshold(kbom));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22129L)
	public static SubLObject update_kb_object_usage(final SubLObject kbom, final SubLObject id) {
		if (kb_object_manager.NIL != kb_object_usage_counts_enabledP(kbom)) {
			increment_kb_object_usage_count(kbom, id);
		}
		final SubLObject lru_information = kb_object_manager_lru_information(kbom);
		if (kb_object_manager.NIL != cache.cache_p(lru_information)
				&& kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
			cache.cache_get_without_values(lru_information, id, (SubLObject) kb_object_manager.UNPROVIDED);
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22532L)
	public static SubLObject drop_kb_object_usage(final SubLObject kbom, final SubLObject id) {
		final SubLObject lru_information = kb_object_manager_lru_information(kbom);
		if (kb_object_manager.NIL != cache.cache_p(lru_information)
				&& kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
			cache.cache_remove(lru_information, id);
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 22968L)
	public static SubLObject mark_kb_object_content_as_muted(final SubLObject kbom, final SubLObject id) {
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			final SubLObject lru_information = kb_object_manager_lru_information(kbom);
			if (kb_object_manager.NIL != cache.cache_p(lru_information)
					&& kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
				kb_storage_logging.maybe_kb_storage_log_mutate(id);
				cache.cache_remove(lru_information, id);
			}
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23413L)
	public static SubLObject meter_kb_object_content_swap_time(final SubLObject kbom) {
		_csetf_kbom_meter_swap_timeP(kbom, (SubLObject) kb_object_manager.T);
		return (SubLObject) kb_object_manager.T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23578L)
	public static SubLObject dont_meter_kb_object_content_swap_time(final SubLObject kbom) {
		_csetf_kbom_meter_swap_timeP(kbom, (SubLObject) kb_object_manager.NIL);
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23753L)
	public static SubLObject clear_kb_object_content_swap_time(final SubLObject kbom) {
		_csetf_kbom_swap_time(kbom, (SubLObject) kb_object_manager.ZERO_INTEGER);
		return (SubLObject) kb_object_manager.ZERO_INTEGER;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 23858L)
	public static SubLObject get_file_backed_kb_object_id_threshold(final SubLObject kbom) {
		return kb_object_manager_id_threshold(kbom);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24075L)
	public static SubLObject swap_in_kb_object_content(final SubLObject kbom, final SubLObject id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
		final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
		final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
		final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
		final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$
				.currentBinding(thread);
		final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
		try {
			api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			api_control_vars.$cfasl_deduction_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind((SubLObject) kb_object_manager.NIL, thread);
			if (kb_object_manager.NIL != kb_object_manager_meter_swap_timeP(kbom)) {
				swap_in_kb_object_content_metered(kbom, id);
			} else {
				swap_in_kb_object_content_internal(kbom, id);
			}
		} finally {
			api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
			api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
			api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
			api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
			api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
			api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24759L)
	public static SubLObject swap_in_kb_object_content_metered(final SubLObject kbom, final SubLObject id) {
		SubLObject time = (SubLObject) kb_object_manager.NIL;
		final SubLObject time_var = Time.get_internal_real_time();
		swap_in_kb_object_content_internal(kbom, id);
		time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var),
				time_high.$internal_time_units_per_second$.getGlobalValue());
		_csetf_kbom_swap_time(kbom, Numbers.add(kbom_swap_time(kbom), time));
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 24954L)
	public static SubLObject swap_in_kb_object_content_internal(final SubLObject kbom, final SubLObject id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
		try {
			cfasl.$cfasl_common_symbols$.bind((SubLObject) kb_object_manager.NIL, thread);
			cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
			kb_object_content_file_vector_lookup(kbom, id);
		} finally {
			cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
		}
		increment_kb_object_usage_count(kbom, id);
		thread.resetMultipleValues();
		final SubLObject loser = cache.cache_set_return_dropped(kb_object_manager_lru_information(kbom), id, id);
		final SubLObject oldest_value = thread.secondMultipleValue();
		final SubLObject pairP = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (loser.isFixnum()) {
			swap_out_pristine_kb_object_content(kbom, loser);
		}
		return id;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25551L)
	public static SubLObject swap_out_pristine_kb_object_content(final SubLObject kbom, final SubLObject loser) {
		id_index.id_index_remove(kb_object_manager_content_table(kbom), loser);
		kb_storage_logging.maybe_kb_storage_log_page_out(loser);
		return loser;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25771L)
	public static SubLObject safely_swap_out_all_pristine_kb_objects(final SubLObject kbom) {
		SubLObject paged_out = (SubLObject) kb_object_manager.NIL;
		final SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = (SubLObject) kb_object_manager.NIL;
		try {
			release = Locks.seize_lock(lock);
			paged_out = swap_out_all_pristine_kb_objects_int(kbom);
		} finally {
			if (kb_object_manager.NIL != release) {
				Locks.release_lock(lock);
			}
		}
		return paged_out;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 25994L)
	public static SubLObject swap_out_all_pristine_kb_objects_int(final SubLObject kbom) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pristine_ids = (SubLObject) kb_object_manager.NIL;
		final SubLObject cache_var;
		final SubLObject lru_information = cache_var = kb_object_manager_lru_information(kbom);
		final SubLObject order_var = (SubLObject) kb_object_manager.$kw82$NEWEST;
		SubLObject entry = cache.do_cache_first(cache_var, order_var);
		SubLObject id = (SubLObject) kb_object_manager.NIL;
		SubLObject value = (SubLObject) kb_object_manager.NIL;
		while (kb_object_manager.NIL == cache.do_cache_doneP(cache_var, entry)) {
			id = cache.do_cache_key(entry);
			value = cache.do_cache_value(entry);
			entry = cache.do_cache_next(entry, order_var);
			pristine_ids = (SubLObject) ConsesLow.cons(id, pristine_ids);
		}
		final SubLObject list_var;
		pristine_ids = (list_var = Sort.sort(pristine_ids,
				Symbols.symbol_function((SubLObject) kb_object_manager.$sym79$_),
				(SubLObject) kb_object_manager.UNPROVIDED));
		final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
		final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
		final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
		final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
		final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$progress_note$
					.bind((SubLObject) ((kb_object_manager.NIL != Sequences
							.cconcatenate((SubLObject) kb_object_manager.$str83$Swapping_out_,
									new SubLObject[] { kb_object_manager_name(kbom),
											kb_object_manager.$str84$_objects }))
													? Sequences.cconcatenate(
															(SubLObject) kb_object_manager.$str83$Swapping_out_,
															new SubLObject[] { kb_object_manager_name(kbom),
																	kb_object_manager.$str84$_objects })
													: kb_object_manager.$str85$cdolist),
							thread);
			utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
			utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
			utilities_macros.$progress_sofar$.bind((SubLObject) kb_object_manager.ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_object_manager.ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_object_manager.NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_object_manager.T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros
						.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
				SubLObject csome_list_var = list_var;
				SubLObject id2 = (SubLObject) kb_object_manager.NIL;
				id2 = csome_list_var.first();
				while (kb_object_manager.NIL != csome_list_var) {
					cache.cache_remove(lru_information, id2);
					swap_out_pristine_kb_object_content(kbom, id2);
					SubLObject valueSF = Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread),
							(SubLObject) kb_object_manager.ONE_INTEGER);
					utilities_macros.$progress_sofar$.setDynamicValue(valueSF, thread);
					utilities_macros.note_percent_progress(valueSF,
							utilities_macros.$progress_total$.getDynamicValue(thread));
					csome_list_var = csome_list_var.rest();
					id2 = csome_list_var.first();
				}
			} finally {
				final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_object_manager.T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
				}
			}
		} finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
			utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
			utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
			utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
			utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
		}
		return Sequences.length(pristine_ids);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 26522L)
	public static SubLObject increment_kb_object_usage_count(final SubLObject kbom, final SubLObject id) {
		if (kb_object_manager.NIL != kb_object_usage_counts_enabledP(kbom)) {
			final SubLObject usage_table = kb_object_manager_usage_table(kbom);
			final SubLObject old_counter = id_index.id_index_lookup(usage_table, id,
					(SubLObject) kb_object_manager.UNPROVIDED);
			final SubLObject new_counter = (SubLObject) ((kb_object_manager.NIL != old_counter)
					? number_utilities.f_1X(old_counter) : kb_object_manager.ONE_INTEGER);
			id_index.id_index_enter(usage_table, id, new_counter);
			return id;
		}
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 26935L)
	public static SubLObject new_muted_kb_object_iterator(final SubLObject kbom) {
		return iteration.new_filter_iterator(
				id_index.new_id_index_dense_objects_iterator(kb_object_manager_content_table(kbom)),
				(SubLObject) kb_object_manager.$sym86$IS_MUTED_KB_OBJECT_, (SubLObject) ConsesLow.list(kbom));
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 27296L)
	public static SubLObject is_muted_kb_objectP(final SubLObject tuple, final SubLObject kbom) {
		SubLObject id = (SubLObject) kb_object_manager.NIL;
		SubLObject payload = (SubLObject) kb_object_manager.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject) kb_object_manager.$list87);
		id = tuple.first();
		SubLObject current = tuple.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject) kb_object_manager.$list87);
		payload = current.first();
		current = current.rest();
		if (kb_object_manager.NIL == current) {
			return (SubLObject) SubLObjectFactory
					.makeBoolean(kb_object_manager.NIL != is_lru_cachable_kb_object_content_idP(kbom, id)
							&& kb_object_manager.NIL == cache
									.cache_contains_key_p(kb_object_manager_lru_information(kbom), id));
		}
		cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject) kb_object_manager.$list87);
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 27684L)
	public static SubLObject verify_kb_object_content_table_int(final SubLObject kbom, final SubLObject type_pred,
			SubLObject repairP) {
		if (repairP == kb_object_manager.UNPROVIDED) {
			repairP = (SubLObject) kb_object_manager.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject invalid_count = (SubLObject) kb_object_manager.ZERO_INTEGER;
		final SubLObject progress_message = Sequences.cconcatenate(
				(SubLObject) kb_object_manager.$str88$Verifying_integrity_of_,
				new SubLObject[] { kb_object_manager_name(kbom), kb_object_manager.$str89$_content_table });
		final SubLObject idx = kb_object_manager_content_table(kbom);
		final SubLObject mess = progress_message;
		final SubLObject total = id_index.id_index_count(idx);
		SubLObject sofar = (SubLObject) kb_object_manager.ZERO_INTEGER;
		assert kb_object_manager.NIL != Types.stringp(mess) : mess;
		final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$last_percent_progress_index$.bind((SubLObject) kb_object_manager.ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind((SubLObject) kb_object_manager.NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind((SubLObject) kb_object_manager.T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros.noting_percent_progress_preamble(mess);
				final SubLObject idx_$2 = idx;
				if (kb_object_manager.NIL == id_index.id_index_objects_empty_p(idx_$2,
						(SubLObject) kb_object_manager.$kw90$SKIP)) {
					final SubLObject idx_$3 = idx_$2;
					if (kb_object_manager.NIL == id_index.id_index_dense_objects_empty_p(idx_$3,
							(SubLObject) kb_object_manager.$kw90$SKIP)) {
						final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
						final SubLObject backwardP_var = (SubLObject) kb_object_manager.NIL;
						SubLObject length;
						SubLObject v_iteration;
						SubLObject id;
						SubLObject content;
						for (length = Sequences
								.length(vector_var), v_iteration = (SubLObject) kb_object_manager.NIL, v_iteration = (SubLObject) kb_object_manager.ZERO_INTEGER; v_iteration
										.numL(length); v_iteration = Numbers.add(v_iteration,
												(SubLObject) kb_object_manager.ONE_INTEGER)) {
							id = ((kb_object_manager.NIL != backwardP_var)
									? Numbers.subtract(length, v_iteration, (SubLObject) kb_object_manager.ONE_INTEGER)
									: v_iteration);
							content = Vectors.aref(vector_var, id);
							if (kb_object_manager.NIL == id_index.id_index_tombstone_p(content)
									|| kb_object_manager.NIL == id_index
											.id_index_skip_tombstones_p((SubLObject) kb_object_manager.$kw90$SKIP)) {
								if (kb_object_manager.NIL != id_index.id_index_tombstone_p(content)) {
									content = (SubLObject) kb_object_manager.$kw90$SKIP;
								}
								if (kb_object_manager.NIL != content
										&& kb_object_manager.NIL == Functions.funcall(type_pred, content)) {
									invalid_count = Numbers.add(invalid_count,
											(SubLObject) kb_object_manager.ONE_INTEGER);
									if (kb_object_manager.NIL != repairP) {
										Errors.warn(
												(SubLObject) kb_object_manager.$str91$Entry__a_is_invalid___a__repairin,
												id, content);
										swap_out_pristine_kb_object_content(kbom, id);
									} else {
										Errors.warn((SubLObject) kb_object_manager.$str92$Entry__a_is_invalid___a, id,
												content);
									}
								}
								sofar = Numbers.add(sofar, (SubLObject) kb_object_manager.ONE_INTEGER);
								utilities_macros.note_percent_progress(sofar, total);
							}
						}
					}
					final SubLObject idx_$4 = idx_$2;
					if (kb_object_manager.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)) {
						final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$4);
						SubLObject id2 = (SubLObject) kb_object_manager.NIL;
						SubLObject content2 = (SubLObject) kb_object_manager.NIL;
						final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
						try {
							while (Hashtables.iteratorHasNext(cdohash_iterator)) {
								final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
								id2 = Hashtables.getEntryKey(cdohash_entry);
								content2 = Hashtables.getEntryValue(cdohash_entry);
								if (kb_object_manager.NIL != content2
										&& kb_object_manager.NIL == Functions.funcall(type_pred, content2)) {
									invalid_count = Numbers.add(invalid_count,
											(SubLObject) kb_object_manager.ONE_INTEGER);
									if (kb_object_manager.NIL != repairP) {
										Errors.warn(
												(SubLObject) kb_object_manager.$str91$Entry__a_is_invalid___a__repairin,
												id2, content2);
										swap_out_pristine_kb_object_content(kbom, id2);
									} else {
										Errors.warn((SubLObject) kb_object_manager.$str92$Entry__a_is_invalid___a, id2,
												content2);
									}
								}
								sofar = Numbers.add(sofar, (SubLObject) kb_object_manager.ONE_INTEGER);
								utilities_macros.note_percent_progress(sofar, total);
							}
						} finally {
							Hashtables.releaseEntrySetIterator(cdohash_iterator);
						}
					}
				}
			} finally {
				final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind((SubLObject) kb_object_manager.T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
				}
			}
		} finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		return Values.values(Numbers.numE(invalid_count, (SubLObject) kb_object_manager.ZERO_INTEGER), invalid_count);
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 28736L)
	public static SubLObject with_kbom_fully_loaded(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_object_manager.$list0);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject kbom = (SubLObject) kb_object_manager.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) kb_object_manager.$list0);
		kbom = current.first();
		current = current.rest();
		if (kb_object_manager.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			final SubLObject manager = (SubLObject) kb_object_manager.$sym93$MANAGER;
			final SubLObject maintaining_countsP = (SubLObject) kb_object_manager.$sym94$MAINTAINING_COUNTS_;
			final SubLObject memory_mappedP = (SubLObject) kb_object_manager.$sym95$MEMORY_MAPPED_;
			return (SubLObject) ConsesLow.list((SubLObject) kb_object_manager.$sym96$CLET, (SubLObject) ConsesLow.list(
					(SubLObject) ConsesLow.list(manager, kbom),
					(SubLObject) ConsesLow.list(maintaining_countsP,
							(SubLObject) ConsesLow.list(
									(SubLObject) kb_object_manager.$sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_, manager)),
					(SubLObject) ConsesLow.list(memory_mappedP,
							(SubLObject) ConsesLow.list(
									(SubLObject) kb_object_manager.$sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_, manager))),
					(SubLObject) ConsesLow.list((SubLObject) kb_object_manager.$sym99$CUNWIND_PROTECT,
							(SubLObject) ConsesLow.listS((SubLObject) kb_object_manager.$sym100$PROGN,
									(SubLObject) ConsesLow.list(
											(SubLObject) kb_object_manager.$sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS,
											manager),
									(SubLObject) ConsesLow.list(
											(SubLObject) kb_object_manager.$sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING,
											manager),
									ConsesLow.append(body, (SubLObject) kb_object_manager.NIL)),
							(SubLObject) ConsesLow.list((SubLObject) kb_object_manager.$sym100$PROGN,
									(SubLObject) ConsesLow
											.list((SubLObject) kb_object_manager.$sym103$PWHEN, maintaining_countsP,
													(SubLObject) ConsesLow.list(
															(SubLObject) kb_object_manager.$sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS,
															manager)),
									(SubLObject) ConsesLow.list((SubLObject) kb_object_manager.$sym103$PWHEN,
											(SubLObject) ConsesLow.list((SubLObject) kb_object_manager.$sym105$CNOT,
													memory_mappedP),
											(SubLObject) ConsesLow.listS(
													(SubLObject) kb_object_manager.$sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES,
													manager, (SubLObject) kb_object_manager.$list107)))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) kb_object_manager.$list0);
		return (SubLObject) kb_object_manager.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 29601L)
	public static SubLObject segment_kb_object_manager_data(final SubLObject kbom, SubLObject stream,
			SubLObject include_idP) {
		if (stream == kb_object_manager.UNPROVIDED) {
			stream = StreamsLow.$standard_output$.getDynamicValue();
		}
		if (include_idP == kb_object_manager.UNPROVIDED) {
			include_idP = (SubLObject) kb_object_manager.NIL;
		}
		final SubLObject fvector = kbom_file_vector(kbom);
		file_vector_utilities.segment_file_vector_data_stream(fvector, stream, include_idP);
		return kbom;
	}

	@SubLTranslatedFile.SubL(source = "cycl/kb-object-manager.lisp", position = 30143L)
	public static SubLObject inspect_kb_object_manager_data(final SubLObject kbom, final SubLObject id) {
		final SubLObject fvector = kbom_file_vector(kbom);
		return file_vector_utilities.inspect_file_vector_data_record(fvector, id);
	}

	public static SubLObject declare_kb_object_manager_file() {
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_object_manager", "with_kb_object_manager_lock_held",
				"WITH-KB-OBJECT-MANAGER-LOCK-HELD");
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager",
				"kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_p",
				"KB-OBJECT-MANAGER-P", 1, 0, false);
		new $kb_object_manager_p$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_name", "KBOM-NAME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_content_lock", "KBOM-CONTENT-LOCK", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_lru_size_percentage",
				"KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_content_table", "KBOM-CONTENT-TABLE",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_usage_table", "KBOM-USAGE-TABLE", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_lru_information",
				"KBOM-LRU-INFORMATION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_file_vector", "KBOM-FILE-VECTOR", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_id_threshold", "KBOM-ID-THRESHOLD", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_load_func", "KBOM-LOAD-FUNC", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_meter_swap_timeP",
				"KBOM-METER-SWAP-TIME?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_swap_time", "KBOM-SWAP-TIME", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_lru_size_max", "KBOM-LRU-SIZE-MAX", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_sub_file_vector",
				"KBOM-SUB-FILE-VECTOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_dummy3", "KBOM-DUMMY3", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_name", "_CSETF-KBOM-NAME", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_content_lock",
				"_CSETF-KBOM-CONTENT-LOCK", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_lru_size_percentage",
				"_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_content_table",
				"_CSETF-KBOM-CONTENT-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_usage_table",
				"_CSETF-KBOM-USAGE-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_lru_information",
				"_CSETF-KBOM-LRU-INFORMATION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_file_vector",
				"_CSETF-KBOM-FILE-VECTOR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_id_threshold",
				"_CSETF-KBOM-ID-THRESHOLD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_load_func",
				"_CSETF-KBOM-LOAD-FUNC", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_meter_swap_timeP",
				"_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_swap_time",
				"_CSETF-KBOM-SWAP-TIME", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_lru_size_max",
				"_CSETF-KBOM-LRU-SIZE-MAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_sub_file_vector",
				"_CSETF-KBOM-SUB-FILE-VECTOR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "make_kb_object_manager",
				"MAKE-KB-OBJECT-MANAGER", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "visit_defstruct_kb_object_manager",
				"VISIT-DEFSTRUCT-KB-OBJECT-MANAGER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager",
				"visit_defstruct_object_kb_object_manager_method", "VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "new_kb_object_manager",
				"NEW-KB-OBJECT-MANAGER", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager",
				"kb_object_manager_change_stream_buffer_sizes", "KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_enable_memory_mapping",
				"KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_memory_mappedP",
				"KB-OBJECT-MANAGER-MEMORY-MAPPED?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "setup_kb_object_content_table",
				"SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "setup_kb_object_content_support",
				"SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "compute_kbom_lru_size",
				"COMPUTE-KBOM-LRU-SIZE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "initialize_kb_object_hl_store_cache",
				"INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager",
				"resize_kbom_lru_cache_from_percentage_and_max", "RESIZE-KBOM-LRU-CACHE-FROM-PERCENTAGE-AND-MAX", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "resize_kbom_lru_cache",
				"RESIZE-KBOM-LRU-CACHE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "new_legacy_kb_object_manager",
				"NEW-LEGACY-KB-OBJECT-MANAGER", 7, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "optimize_kb_object_content_table",
				"OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "clear_kb_object_content_table",
				"CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_name",
				"KB-OBJECT-MANAGER-NAME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_content_lock",
				"KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_lru_size_percentage",
				"KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_lru_size_max",
				"KB-OBJECT-MANAGER-LRU-SIZE-MAX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_content_table",
				"KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_usage_table",
				"KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_lru_information",
				"KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_file_vector",
				"KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_id_threshold",
				"KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_load_func",
				"KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_meter_swap_timeP",
				"KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_swap_time",
				"KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_sub_file_vector",
				"KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "set_kb_object_manager_sub_file_vector",
				"SET-KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_usage_counts_enabledP",
				"KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "cached_kb_object_count",
				"CACHED-KB-OBJECT-COUNT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swappable_kb_object_count",
				"SWAPPABLE-KB-OBJECT-COUNT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_id_cachedP",
				"KB-OBJECT-ID-CACHED?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_id_cachableP",
				"KB-OBJECT-ID-CACHABLE?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "lookup_kb_object_content",
				"LOOKUP-KB-OBJECT-CONTENT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_manager_unbuiltP",
				"KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "maintain_kb_object_usage_counts",
				"MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "dont_maintain_kb_object_usage_counts",
				"DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "register_kb_object_content",
				"REGISTER-KB-OBJECT-CONTENT", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "deregister_kb_object_content",
				"DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "new_kb_object_content_file_vector",
				"NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager",
				"kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_content_file_vector_p",
				"KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kb_object_content_file_vector_lookup",
				"KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "wide_kb_object_managerP",
				"WIDE-KB-OBJECT-MANAGER?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "wide_kb_object_sub_managerP",
				"WIDE-KB-OBJECT-SUB-MANAGER?", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "serialize_kbom_lru_information",
				"SERIALIZE-KBOM-LRU-INFORMATION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "precache_kbom_by_lru_information",
				"PRECACHE-KBOM-BY-LRU-INFORMATION", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "kbom_lru_info_filename",
				"KBOM-LRU-INFO-FILENAME", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "is_lru_cachable_kb_object_content_idP",
				"IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "update_kb_object_usage",
				"UPDATE-KB-OBJECT-USAGE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "drop_kb_object_usage",
				"DROP-KB-OBJECT-USAGE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "mark_kb_object_content_as_muted",
				"MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "meter_kb_object_content_swap_time",
				"METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "dont_meter_kb_object_content_swap_time",
				"DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "clear_kb_object_content_swap_time",
				"CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "get_file_backed_kb_object_id_threshold",
				"GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swap_in_kb_object_content",
				"SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swap_in_kb_object_content_metered",
				"SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swap_in_kb_object_content_internal",
				"SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swap_out_pristine_kb_object_content",
				"SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "safely_swap_out_all_pristine_kb_objects",
				"SAFELY-SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "swap_out_all_pristine_kb_objects_int",
				"SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "increment_kb_object_usage_count",
				"INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "new_muted_kb_object_iterator",
				"NEW-MUTED-KB-OBJECT-ITERATOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "is_muted_kb_objectP",
				"IS-MUTED-KB-OBJECT?", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "verify_kb_object_content_table_int",
				"VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false);
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_object_manager", "with_kbom_fully_loaded",
				"WITH-KBOM-FULLY-LOADED");
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "segment_kb_object_manager_data",
				"SEGMENT-KB-OBJECT-MANAGER-DATA", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_object_manager", "inspect_kb_object_manager_data",
				"INSPECT-KB-OBJECT-MANAGER-DATA", 2, 0, false);
		return (SubLObject) kb_object_manager.NIL;
	}

	public static SubLObject init_kb_object_manager_file() {
		kb_object_manager.$dtp_kb_object_manager$ = SubLFiles.defconstant("*DTP-KB-OBJECT-MANAGER*",
				(SubLObject) kb_object_manager.$sym3$KB_OBJECT_MANAGER);
		kb_object_manager.$min_kb_object_lru_size$ = SubLFiles.deflexical("*MIN-KB-OBJECT-LRU-SIZE*",
				(SubLObject) kb_object_manager.$int66$212);
		kb_object_manager.$kbom_id_equality_test$ = SubLFiles.deflexical("*KBOM-ID-EQUALITY-TEST*",
				Symbols.symbol_function((SubLObject) kb_object_manager.EQ));
		return (SubLObject) kb_object_manager.NIL;
	}

	public static SubLObject setup_kb_object_manager_file() {
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				kb_object_manager.$dtp_kb_object_manager$.getGlobalValue(), Symbols.symbol_function(
						(SubLObject) kb_object_manager.$sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim((SubLObject) kb_object_manager.$list11);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym12$KBOM_NAME,
				(SubLObject) kb_object_manager.$sym13$_CSETF_KBOM_NAME);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym14$KBOM_CONTENT_LOCK,
				(SubLObject) kb_object_manager.$sym15$_CSETF_KBOM_CONTENT_LOCK);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym16$KBOM_LRU_SIZE_PERCENTAGE,
				(SubLObject) kb_object_manager.$sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym18$KBOM_CONTENT_TABLE,
				(SubLObject) kb_object_manager.$sym19$_CSETF_KBOM_CONTENT_TABLE);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym20$KBOM_USAGE_TABLE,
				(SubLObject) kb_object_manager.$sym21$_CSETF_KBOM_USAGE_TABLE);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym22$KBOM_LRU_INFORMATION,
				(SubLObject) kb_object_manager.$sym23$_CSETF_KBOM_LRU_INFORMATION);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym24$KBOM_FILE_VECTOR,
				(SubLObject) kb_object_manager.$sym25$_CSETF_KBOM_FILE_VECTOR);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym26$KBOM_ID_THRESHOLD,
				(SubLObject) kb_object_manager.$sym27$_CSETF_KBOM_ID_THRESHOLD);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym28$KBOM_LOAD_FUNC,
				(SubLObject) kb_object_manager.$sym29$_CSETF_KBOM_LOAD_FUNC);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym30$KBOM_METER_SWAP_TIME_,
				(SubLObject) kb_object_manager.$sym31$_CSETF_KBOM_METER_SWAP_TIME_);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym32$KBOM_SWAP_TIME,
				(SubLObject) kb_object_manager.$sym33$_CSETF_KBOM_SWAP_TIME);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym34$KBOM_LRU_SIZE_MAX,
				(SubLObject) kb_object_manager.$sym35$_CSETF_KBOM_LRU_SIZE_MAX);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym36$KBOM_SUB_FILE_VECTOR,
				(SubLObject) kb_object_manager.$sym37$_CSETF_KBOM_SUB_FILE_VECTOR);
		Structures.def_csetf((SubLObject) kb_object_manager.$sym38$KBOM_DUMMY3,
				(SubLObject) kb_object_manager.$sym39$_CSETF_KBOM_DUMMY3);
		Equality.identity((SubLObject) kb_object_manager.$sym3$KB_OBJECT_MANAGER);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				kb_object_manager.$dtp_kb_object_manager$.getGlobalValue(), Symbols.symbol_function(
						(SubLObject) kb_object_manager.$sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD));
		access_macros.define_obsolete_register((SubLObject) kb_object_manager.$sym70$NEW_LEGACY_KB_OBJECT_MANAGER,
				(SubLObject) kb_object_manager.NIL);
		access_macros.register_external_symbol((SubLObject) kb_object_manager.$sym74$SERIALIZE_KBOM_LRU_INFORMATION);
		access_macros.register_external_symbol((SubLObject) kb_object_manager.$sym77$PRECACHE_KBOM_BY_LRU_INFORMATION);
		utilities_macros.note_funcall_helper_function((SubLObject) kb_object_manager.$sym86$IS_MUTED_KB_OBJECT_);
		return (SubLObject) kb_object_manager.NIL;
	}

	public void declareFunctions() {
		declare_kb_object_manager_file();
	}

	public void initializeVariables() {
		init_kb_object_manager_file();
	}

	public void runTopLevelForms() {
		setup_kb_object_manager_file();
	}

	static {
		me = (SubLFile) new kb_object_manager();
		kb_object_manager.$dtp_kb_object_manager$ = null;
		kb_object_manager.$min_kb_object_lru_size$ = null;
		kb_object_manager.$kbom_id_equality_test$ = null;
		$list0 = ConsesLow.list((SubLObject) ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("KBOM")),
				(SubLObject) SubLObjectFactory.makeSymbol("&BODY"), (SubLObject) SubLObjectFactory.makeSymbol("BODY"));
		$sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
		$sym2$KB_OBJECT_MANAGER_CONTENT_LOCK = SubLObjectFactory.makeSymbol("KB-OBJECT-MANAGER-CONTENT-LOCK");
		$sym3$KB_OBJECT_MANAGER = SubLObjectFactory.makeSymbol("KB-OBJECT-MANAGER");
		$sym4$KB_OBJECT_MANAGER_P = SubLObjectFactory.makeSymbol("KB-OBJECT-MANAGER-P");
		$list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"),
				SubLObjectFactory.makeSymbol("CONTENT-LOCK"), SubLObjectFactory.makeSymbol("LRU-SIZE-PERCENTAGE"),
				SubLObjectFactory.makeSymbol("CONTENT-TABLE"), SubLObjectFactory.makeSymbol("USAGE-TABLE"),
				SubLObjectFactory.makeSymbol("LRU-INFORMATION"), SubLObjectFactory.makeSymbol("FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("ID-THRESHOLD"), SubLObjectFactory.makeSymbol("LOAD-FUNC"),
				SubLObjectFactory.makeSymbol("METER-SWAP-TIME?"), SubLObjectFactory.makeSymbol("SWAP-TIME"),
				SubLObjectFactory.makeSymbol("LRU-SIZE-MAX"), SubLObjectFactory.makeSymbol("SUB-FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("DUMMY3") });
		$list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"),
				SubLObjectFactory.makeKeyword("CONTENT-LOCK"), SubLObjectFactory.makeKeyword("LRU-SIZE-PERCENTAGE"),
				SubLObjectFactory.makeKeyword("CONTENT-TABLE"), SubLObjectFactory.makeKeyword("USAGE-TABLE"),
				SubLObjectFactory.makeKeyword("LRU-INFORMATION"), SubLObjectFactory.makeKeyword("FILE-VECTOR"),
				SubLObjectFactory.makeKeyword("ID-THRESHOLD"), SubLObjectFactory.makeKeyword("LOAD-FUNC"),
				SubLObjectFactory.makeKeyword("METER-SWAP-TIME?"), SubLObjectFactory.makeKeyword("SWAP-TIME"),
				SubLObjectFactory.makeKeyword("LRU-SIZE-MAX"), SubLObjectFactory.makeKeyword("SUB-FILE-VECTOR"),
				SubLObjectFactory.makeKeyword("DUMMY3") });
		$list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("KBOM-NAME"),
				SubLObjectFactory.makeSymbol("KBOM-CONTENT-LOCK"),
				SubLObjectFactory.makeSymbol("KBOM-LRU-SIZE-PERCENTAGE"),
				SubLObjectFactory.makeSymbol("KBOM-CONTENT-TABLE"), SubLObjectFactory.makeSymbol("KBOM-USAGE-TABLE"),
				SubLObjectFactory.makeSymbol("KBOM-LRU-INFORMATION"), SubLObjectFactory.makeSymbol("KBOM-FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("KBOM-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("KBOM-LOAD-FUNC"),
				SubLObjectFactory.makeSymbol("KBOM-METER-SWAP-TIME?"), SubLObjectFactory.makeSymbol("KBOM-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("KBOM-LRU-SIZE-MAX"), SubLObjectFactory.makeSymbol("KBOM-SUB-FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("KBOM-DUMMY3") });
		$list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-KBOM-NAME"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-CONTENT-LOCK"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-CONTENT-TABLE"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-USAGE-TABLE"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-INFORMATION"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-ID-THRESHOLD"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-LOAD-FUNC"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-SIZE-MAX"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-SUB-FILE-VECTOR"),
				SubLObjectFactory.makeSymbol("_CSETF-KBOM-DUMMY3") });
		$sym9$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		$sym10$KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeSymbol("KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE");
		$list11 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"),
				(SubLObject) SubLObjectFactory.makeSymbol("KB-OBJECT-MANAGER-P"));
		$sym12$KBOM_NAME = SubLObjectFactory.makeSymbol("KBOM-NAME");
		$sym13$_CSETF_KBOM_NAME = SubLObjectFactory.makeSymbol("_CSETF-KBOM-NAME");
		$sym14$KBOM_CONTENT_LOCK = SubLObjectFactory.makeSymbol("KBOM-CONTENT-LOCK");
		$sym15$_CSETF_KBOM_CONTENT_LOCK = SubLObjectFactory.makeSymbol("_CSETF-KBOM-CONTENT-LOCK");
		$sym16$KBOM_LRU_SIZE_PERCENTAGE = SubLObjectFactory.makeSymbol("KBOM-LRU-SIZE-PERCENTAGE");
		$sym17$_CSETF_KBOM_LRU_SIZE_PERCENTAGE = SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE");
		$sym18$KBOM_CONTENT_TABLE = SubLObjectFactory.makeSymbol("KBOM-CONTENT-TABLE");
		$sym19$_CSETF_KBOM_CONTENT_TABLE = SubLObjectFactory.makeSymbol("_CSETF-KBOM-CONTENT-TABLE");
		$sym20$KBOM_USAGE_TABLE = SubLObjectFactory.makeSymbol("KBOM-USAGE-TABLE");
		$sym21$_CSETF_KBOM_USAGE_TABLE = SubLObjectFactory.makeSymbol("_CSETF-KBOM-USAGE-TABLE");
		$sym22$KBOM_LRU_INFORMATION = SubLObjectFactory.makeSymbol("KBOM-LRU-INFORMATION");
		$sym23$_CSETF_KBOM_LRU_INFORMATION = SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-INFORMATION");
		$sym24$KBOM_FILE_VECTOR = SubLObjectFactory.makeSymbol("KBOM-FILE-VECTOR");
		$sym25$_CSETF_KBOM_FILE_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-KBOM-FILE-VECTOR");
		$sym26$KBOM_ID_THRESHOLD = SubLObjectFactory.makeSymbol("KBOM-ID-THRESHOLD");
		$sym27$_CSETF_KBOM_ID_THRESHOLD = SubLObjectFactory.makeSymbol("_CSETF-KBOM-ID-THRESHOLD");
		$sym28$KBOM_LOAD_FUNC = SubLObjectFactory.makeSymbol("KBOM-LOAD-FUNC");
		$sym29$_CSETF_KBOM_LOAD_FUNC = SubLObjectFactory.makeSymbol("_CSETF-KBOM-LOAD-FUNC");
		$sym30$KBOM_METER_SWAP_TIME_ = SubLObjectFactory.makeSymbol("KBOM-METER-SWAP-TIME?");
		$sym31$_CSETF_KBOM_METER_SWAP_TIME_ = SubLObjectFactory.makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?");
		$sym32$KBOM_SWAP_TIME = SubLObjectFactory.makeSymbol("KBOM-SWAP-TIME");
		$sym33$_CSETF_KBOM_SWAP_TIME = SubLObjectFactory.makeSymbol("_CSETF-KBOM-SWAP-TIME");
		$sym34$KBOM_LRU_SIZE_MAX = SubLObjectFactory.makeSymbol("KBOM-LRU-SIZE-MAX");
		$sym35$_CSETF_KBOM_LRU_SIZE_MAX = SubLObjectFactory.makeSymbol("_CSETF-KBOM-LRU-SIZE-MAX");
		$sym36$KBOM_SUB_FILE_VECTOR = SubLObjectFactory.makeSymbol("KBOM-SUB-FILE-VECTOR");
		$sym37$_CSETF_KBOM_SUB_FILE_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-KBOM-SUB-FILE-VECTOR");
		$sym38$KBOM_DUMMY3 = SubLObjectFactory.makeSymbol("KBOM-DUMMY3");
		$sym39$_CSETF_KBOM_DUMMY3 = SubLObjectFactory.makeSymbol("_CSETF-KBOM-DUMMY3");
		$kw40$NAME = SubLObjectFactory.makeKeyword("NAME");
		$kw41$CONTENT_LOCK = SubLObjectFactory.makeKeyword("CONTENT-LOCK");
		$kw42$LRU_SIZE_PERCENTAGE = SubLObjectFactory.makeKeyword("LRU-SIZE-PERCENTAGE");
		$kw43$CONTENT_TABLE = SubLObjectFactory.makeKeyword("CONTENT-TABLE");
		$kw44$USAGE_TABLE = SubLObjectFactory.makeKeyword("USAGE-TABLE");
		$kw45$LRU_INFORMATION = SubLObjectFactory.makeKeyword("LRU-INFORMATION");
		$kw46$FILE_VECTOR = SubLObjectFactory.makeKeyword("FILE-VECTOR");
		$kw47$ID_THRESHOLD = SubLObjectFactory.makeKeyword("ID-THRESHOLD");
		$kw48$LOAD_FUNC = SubLObjectFactory.makeKeyword("LOAD-FUNC");
		$kw49$METER_SWAP_TIME_ = SubLObjectFactory.makeKeyword("METER-SWAP-TIME?");
		$kw50$SWAP_TIME = SubLObjectFactory.makeKeyword("SWAP-TIME");
		$kw51$LRU_SIZE_MAX = SubLObjectFactory.makeKeyword("LRU-SIZE-MAX");
		$kw52$SUB_FILE_VECTOR = SubLObjectFactory.makeKeyword("SUB-FILE-VECTOR");
		$kw53$DUMMY3 = SubLObjectFactory.makeKeyword("DUMMY3");
		$str54$Invalid_slot__S_for_construction_ = SubLObjectFactory
				.makeString("Invalid slot ~S for construction function");
		$kw55$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
		$sym56$MAKE_KB_OBJECT_MANAGER = SubLObjectFactory.makeSymbol("MAKE-KB-OBJECT-MANAGER");
		$kw57$SLOT = SubLObjectFactory.makeKeyword("SLOT");
		$kw58$END = SubLObjectFactory.makeKeyword("END");
		$sym59$VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD");
		$sym60$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
		$sym61$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
		$sym62$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
		$sym63$FBOUNDP = SubLObjectFactory.makeSymbol("FBOUNDP");
		$str64$_content_manager_lock = SubLObjectFactory.makeString(" content manager lock");
		$kw65$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
		$int66$212 = SubLObjectFactory.makeInteger(212);
		$int67$100 = SubLObjectFactory.makeInteger(100);
		$str68$Got__s__expected_an_extensionless = SubLObjectFactory
				.makeString("Got ~s, expected an extensionless file basename");
		$kw69$OLDEST = SubLObjectFactory.makeKeyword("OLDEST");
		$sym70$NEW_LEGACY_KB_OBJECT_MANAGER = SubLObjectFactory.makeSymbol("NEW-LEGACY-KB-OBJECT-MANAGER");
		$float71$0_05 = (SubLFloat) SubLObjectFactory.makeDouble(0.05);
		$str72$Failed_to_swap_in_KB_object__A_ba = SubLObjectFactory.makeString(
				"Failed to swap in KB object ~A back from the CFASL stream ~A; got ~A instead.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?");
		$str73$We_expected_KB_object_ID__A_from_ = SubLObjectFactory.makeString(
				"We expected KB object ID ~A from CFASL stream ~A but got object ~A of type ~A instead.~%Thus, the index and the data files for the file vector are misaligned.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?");
		$sym74$SERIALIZE_KBOM_LRU_INFORMATION = SubLObjectFactory.makeSymbol("SERIALIZE-KBOM-LRU-INFORMATION");
		$kw75$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
		$str76$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
		$sym77$PRECACHE_KBOM_BY_LRU_INFORMATION = SubLObjectFactory.makeSymbol("PRECACHE-KBOM-BY-LRU-INFORMATION");
		$kw78$INPUT = SubLObjectFactory.makeKeyword("INPUT");
		$sym79$_ = SubLObjectFactory.makeSymbol("<");
		$str80$_lru_info_for_ = SubLObjectFactory.makeString("-lru-info-for-");
		$str81$_cfasl = SubLObjectFactory.makeString(".cfasl");
		$kw82$NEWEST = SubLObjectFactory.makeKeyword("NEWEST");
		$str83$Swapping_out_ = SubLObjectFactory.makeString("Swapping out ");
		$str84$_objects = SubLObjectFactory.makeString(" objects");
		$str85$cdolist = SubLObjectFactory.makeString("cdolist");
		$sym86$IS_MUTED_KB_OBJECT_ = SubLObjectFactory.makeSymbol("IS-MUTED-KB-OBJECT?");
		$list87 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ID"),
				(SubLObject) SubLObjectFactory.makeSymbol("PAYLOAD"));
		$str88$Verifying_integrity_of_ = SubLObjectFactory.makeString("Verifying integrity of ");
		$str89$_content_table = SubLObjectFactory.makeString(" content table");
		$kw90$SKIP = SubLObjectFactory.makeKeyword("SKIP");
		$str91$Entry__a_is_invalid___a__repairin = SubLObjectFactory.makeString("Entry ~a is invalid: ~a, repairing");
		$str92$Entry__a_is_invalid___a = SubLObjectFactory.makeString("Entry ~a is invalid: ~a");
		$sym93$MANAGER = SubLObjectFactory.makeUninternedSymbol("MANAGER");
		$sym94$MAINTAINING_COUNTS_ = SubLObjectFactory.makeUninternedSymbol("MAINTAINING-COUNTS?");
		$sym95$MEMORY_MAPPED_ = SubLObjectFactory.makeUninternedSymbol("MEMORY-MAPPED?");
		$sym96$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_ = SubLObjectFactory.makeSymbol("KB-OBJECT-USAGE-COUNTS-ENABLED?");
		$sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_ = SubLObjectFactory.makeSymbol("KB-OBJECT-MANAGER-MEMORY-MAPPED?");
		$sym99$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		$sym100$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		$sym101$DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS = SubLObjectFactory
				.makeSymbol("DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS");
		$sym102$KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING = SubLObjectFactory
				.makeSymbol("KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING");
		$sym103$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		$sym104$MAINTAIN_KB_OBJECT_USAGE_COUNTS = SubLObjectFactory.makeSymbol("MAINTAIN-KB-OBJECT-USAGE-COUNTS");
		$sym105$CNOT = SubLObjectFactory.makeSymbol("CNOT");
		$sym106$KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES = SubLObjectFactory
				.makeSymbol("KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES");
		$list107 = ConsesLow.list((SubLObject) SubLObjectFactory.makeInteger(2048),
				(SubLObject) SubLObjectFactory.makeInteger(256));
	}

	public static final class $kb_object_manager_native extends SubLStructNative {
		public SubLObject $name;
		public SubLObject $content_lock;
		public SubLObject $lru_size_percentage;
		public SubLObject $content_table;
		public SubLObject $usage_table;
		public SubLObject $lru_information;
		public SubLObject $file_vector;
		public SubLObject $id_threshold;
		public SubLObject $load_func;
		public SubLObject $meter_swap_timeP;
		public SubLObject $swap_time;
		public SubLObject $lru_size_max;
		public SubLObject $sub_file_vector;
		public SubLObject $dummy3;
		private static final SubLStructDeclNative structDecl;

		public $kb_object_manager_native() {
			this.$name = (SubLObject) CommonSymbols.NIL;
			this.$content_lock = (SubLObject) CommonSymbols.NIL;
			this.$lru_size_percentage = (SubLObject) CommonSymbols.NIL;
			this.$content_table = (SubLObject) CommonSymbols.NIL;
			this.$usage_table = (SubLObject) CommonSymbols.NIL;
			this.$lru_information = (SubLObject) CommonSymbols.NIL;
			this.$file_vector = (SubLObject) CommonSymbols.NIL;
			this.$id_threshold = (SubLObject) CommonSymbols.NIL;
			this.$load_func = (SubLObject) CommonSymbols.NIL;
			this.$meter_swap_timeP = (SubLObject) CommonSymbols.NIL;
			this.$swap_time = (SubLObject) CommonSymbols.NIL;
			this.$lru_size_max = (SubLObject) CommonSymbols.NIL;
			this.$sub_file_vector = (SubLObject) CommonSymbols.NIL;
			this.$dummy3 = (SubLObject) CommonSymbols.NIL;
		}

		public SubLStructDecl getStructDecl() {
			return (SubLStructDecl) $kb_object_manager_native.structDecl;
		}

		public SubLObject getField2() {
			return this.$name;
		}

		public SubLObject getField3() {
			return this.$content_lock;
		}

		public SubLObject getField4() {
			return this.$lru_size_percentage;
		}

		public SubLObject getField5() {
			return this.$content_table;
		}

		public SubLObject getField6() {
			return this.$usage_table;
		}

		public SubLObject getField7() {
			return this.$lru_information;
		}

		public SubLObject getField8() {
			return this.$file_vector;
		}

		public SubLObject getField9() {
			return this.$id_threshold;
		}

		public SubLObject getField10() {
			return this.$load_func;
		}

		public SubLObject getField11() {
			return this.$meter_swap_timeP;
		}

		public SubLObject getField12() {
			return this.$swap_time;
		}

		public SubLObject getField13() {
			return this.$lru_size_max;
		}

		public SubLObject getField14() {
			return this.$sub_file_vector;
		}

		public SubLObject getField15() {
			return this.$dummy3;
		}

		public SubLObject setField2(final SubLObject value) {
			return this.$name = value;
		}

		public SubLObject setField3(final SubLObject value) {
			return this.$content_lock = value;
		}

		public SubLObject setField4(final SubLObject value) {
			return this.$lru_size_percentage = value;
		}

		public SubLObject setField5(final SubLObject value) {
			return this.$content_table = value;
		}

		public SubLObject setField6(final SubLObject value) {
			return this.$usage_table = value;
		}

		public SubLObject setField7(final SubLObject value) {
			return this.$lru_information = value;
		}

		public SubLObject setField8(final SubLObject value) {
			return this.$file_vector = value;
		}

		public SubLObject setField9(final SubLObject value) {
			return this.$id_threshold = value;
		}

		public SubLObject setField10(final SubLObject value) {
			return this.$load_func = value;
		}

		public SubLObject setField11(final SubLObject value) {
			return this.$meter_swap_timeP = value;
		}

		public SubLObject setField12(final SubLObject value) {
			return this.$swap_time = value;
		}

		public SubLObject setField13(final SubLObject value) {
			return this.$lru_size_max = value;
		}

		public SubLObject setField14(final SubLObject value) {
			return this.$sub_file_vector = value;
		}

		public SubLObject setField15(final SubLObject value) {
			return this.$dummy3 = value;
		}

		static {
			structDecl = Structures.makeStructDeclNative((Class) $kb_object_manager_native.class,
					kb_object_manager.$sym3$KB_OBJECT_MANAGER, kb_object_manager.$sym4$KB_OBJECT_MANAGER_P,
					kb_object_manager.$list5, kb_object_manager.$list6,
					new String[] { "$name", "$content_lock", "$lru_size_percentage", "$content_table", "$usage_table",
							"$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP",
							"$swap_time", "$lru_size_max", "$sub_file_vector", "$dummy3" },
					kb_object_manager.$list7, kb_object_manager.$list8,
					kb_object_manager.$sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
		}
	}

	public static final class $kb_object_manager_p$UnaryFunction extends UnaryFunction {
		public $kb_object_manager_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("KB-OBJECT-MANAGER-P"));
		}

		public SubLObject processItem(final SubLObject arg1) {
			return kb_object_manager.kb_object_manager_p(arg1);
		}
	}
}
