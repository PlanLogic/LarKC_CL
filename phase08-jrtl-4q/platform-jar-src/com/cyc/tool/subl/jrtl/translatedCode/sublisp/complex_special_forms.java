//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class complex_special_forms extends SubLTranslatedFile {
	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms";

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6149L)
	public static SubLSymbol $polymorphic_type_hierarchy$;

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 9720L)
	public static SubLSymbol $default_generate_visit_functionP$;

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25661L)
	public static SubLSymbol $call_profiling_enabledP$;

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25853L)
	public static SubLSymbol $call_profiling_table$;

	private static SubLList $list0;

	private static SubLString $str1$METHOD_FUNCTION;

	private static SubLSymbol $sym2$PROGN;

	private static SubLSymbol $sym3$DEFLEXICAL;

	private static SubLList $list4;

	private static SubLSymbol $sym5$DEFINE;

	private static SubLSymbol $sym6$CLET;

	private static SubLSymbol $sym7$_METHOD;

	private static SubLSymbol $sym8$PWHEN;

	private static SubLSymbol $sym9$RET;

	private static SubLSymbol $sym10$FUNCALL;

	private static SubLList $list11;

	private static SubLSymbol $sym12$_REGISTER_METHOD;

	private static SubLSymbol $sym13$FUNCTION;

	private static SubLSymbol $sym14$STRING_;

	private static SubLString $str15$_;

	private static SubLString $str16$_METHOD_TABLE_;

	private static SubLString $str17$_;

	private static SubLString $str18$_METHOD;

	private static SubLString $str19$_DTP_;

	private static SubLSymbol $sym20$_OPTIONAL;

	private static SubLSymbol $sym21$_REST;

	private static SubLList $list22;

	private static SubLSymbol $sym23$SYMBOLP;

	private static SubLSymbol $kw24$CONC_NAME;

	private static SubLSymbol $kw25$PRINT_FUNCTION;

	private static SubLSymbol $kw26$C_STRUCTURE_TAG;

	private static SubLSymbol $kw27$GENERATE_VISIT_FUNCTION_;

	private static SubLSymbol $kw28$NAME;

	private static SubLSymbol $kw29$HOST_FN_NAME;

	private static SubLSymbol $kw30$PREDICATE;

	private static SubLSymbol $kw31$CONSTRUCTOR;

	private static SubLSymbol $kw32$TYPE_VAR;

	private static SubLSymbol $kw33$SLOTS;

	private static SubLSymbol $kw34$SLOT_KEYWORDS;

	private static SubLSymbol $kw35$GETTERS;

	private static SubLSymbol $kw36$SETTERS;

	private static SubLString $str37$_P;

	private static SubLString $str38$MAKE_;

	private static SubLString $str39$VISIT_DEFSTRUCT_;

	private static SubLString $str40$_CSETF_;

	private static SubLString $str41$CYC;

	private static SubLString $str42$SUBLISP;

	private static SubLString $str43$_1;

	private static SubLList $list44;

	private static SubLList $list45;

	private static SubLSymbol $kw46$ALLOW_OTHER_KEYS;

	private static SubLSymbol $kw47$SL2JAVA;

	private static SubLSymbol $sym48$DECLAIM;

	private static SubLSymbol $sym49$OPTIMIZE_FUNCALL;

	private static SubLSymbol $sym50$QUOTE;

	private static SubLList $list51;

	private static SubLList $list52;

	private static SubLSymbol $sym53$_STRUCTURE_TYPE;

	private static SubLSymbol $sym54$CAND;
	private static SubLSymbol $sym55$_STRUCTURES_BAG_P;
	private static SubLSymbol $sym56$_STRUCTURE_SLOT;
	private static SubLList $list57;
	private static SubLList $list58;
	private static SubLList $list59;
	private static SubLSymbol $sym60$_SET_STRUCTURE_SLOT;
	private static SubLList $list61;
	private static SubLSymbol $sym62$_CLEAR_STRUCTURE;
	private static SubLSymbol $sym63$_NEW_STRUCTURE;
	private static SubLSymbol $sym64$_CLEAR_SUB_STRUCTURE;
	private static SubLSymbol $sym65$_DTP_STRUCTURES_BAG_;
	private static SubLSymbol $sym66$DEFCONSTANT;
	private static SubLString $str67$_PRINT_FUNCTION_TRAMPOLINE;
	private static SubLSymbol $sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
	private static SubLSymbol $sym69$FACCESS;
	private static SubLSymbol $sym70$PRIVATE;
	private static SubLList $list71;
	private static SubLList $list72;
	private static SubLSymbol $sym73$_PRINT_OBJECT_METHOD_TABLE_;
	private static SubLSymbol $sym74$_REGISTER_DEFSTRUCT;
	private static SubLSymbol $sym75$_DEFSTRUCT_OBJECT_P;
	private static SubLSymbol $sym76$OBJECT;
	private static SubLSymbol $sym77$CHECK_TYPE;
	private static SubLSymbol $sym78$_DEFSTRUCT_GET_SLOT;
	private static SubLSymbol $sym79$_DEFSTRUCT_SET_SLOT;
	private static SubLList $list80;
	private static SubLSymbol $sym81$_DEF_CSETF;
	private static SubLSymbol $sym82$NEW;
	private static SubLSymbol $sym83$_DEFSTRUCT_CONSTRUCT;
	private static SubLList $list84;
	private static SubLString $str85$CURRENT_VALUE;
	private static SubLString $str86$CURRENT_ARG;
	private static SubLString $str87$NEXT;
	private static SubLSymbol $sym88$OTHERWISE;
	private static SubLSymbol $sym89$ERROR;
	private static SubLString $str90$Invalid_slot__S_for_construction_;
	private static SubLSymbol $sym91$CDO;
	private static SubLSymbol $sym92$CDDR;
	private static SubLSymbol $sym93$NULL;
	private static SubLSymbol $sym94$CAR;
	private static SubLSymbol $sym95$CADR;
	private static SubLSymbol $sym96$PCASE;
	private static SubLSymbol $kw97$BEGIN;
	private static SubLSymbol $kw98$SLOT;
	private static SubLSymbol $kw99$END;
	private static SubLSymbol $sym100$DEFINE_METHOD;
	private static SubLSymbol $sym101$VISIT_DEFSTRUCT_OBJECT;
	private static SubLSymbol $sym102$OBJ;
	private static SubLList $list103;
	private static SubLList $list104;
	private static SubLList $list105;
	private static SubLList $list106;
	private static SubLSymbol $sym107$CUNWIND_PROTECT;
	private static SubLSymbol $sym108$CSETF;
	private static SubLList $list109;
	private static SubLInteger $int110$1000;
	private static SubLSymbol $sym111$_;
	private static SubLSymbol $sym112$CDR;
	static {
		complex_special_forms.me = new complex_special_forms();
		complex_special_forms.$polymorphic_type_hierarchy$ = null;
		complex_special_forms.$default_generate_visit_functionP$ = null;
		complex_special_forms.$call_profiling_enabledP$ = null;
		complex_special_forms.$call_profiling_table$ = null;
		complex_special_forms.$list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"),
				SubLObjectFactory.makeSymbol("LAMBDA-LIST"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		complex_special_forms.$str1$METHOD_FUNCTION = SubLObjectFactory.makeString("METHOD-FUNCTION");
		complex_special_forms.$sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		complex_special_forms.$sym3$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
		complex_special_forms.$list4 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-VECTOR"),
				SubLObjectFactory.makeInteger(256), CommonSymbols.NIL));
		complex_special_forms.$sym5$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
		complex_special_forms.$sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
		complex_special_forms.$sym7$_METHOD = SubLObjectFactory.makeSymbol("_METHOD");
		complex_special_forms.$sym8$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		complex_special_forms.$sym9$RET = SubLObjectFactory.makeSymbol("RET");
		complex_special_forms.$sym10$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
		complex_special_forms.$list11 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeString("INTEGER"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"))),
				ConsesLow.list(SubLObjectFactory.makeString("NUMBER"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("FIXNUM"), SubLObjectFactory.makeSymbol("BIGNUM"),
								SubLObjectFactory.makeSymbol("FLOAT"))),
				ConsesLow.list(SubLObjectFactory.makeString("SEQUENCE"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("VECTOR"),
								SubLObjectFactory.makeSymbol("STRING"))));
		complex_special_forms.$sym12$_REGISTER_METHOD = SubLObjectFactory.makeSymbol("_REGISTER-METHOD");
		complex_special_forms.$sym13$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
		complex_special_forms.$sym14$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
		complex_special_forms.$str15$_ = SubLObjectFactory.makeString("*");
		complex_special_forms.$str16$_METHOD_TABLE_ = SubLObjectFactory.makeString("-METHOD-TABLE*");
		complex_special_forms.$str17$_ = SubLObjectFactory.makeString("-");
		complex_special_forms.$str18$_METHOD = SubLObjectFactory.makeString("-METHOD");
		complex_special_forms.$str19$_DTP_ = SubLObjectFactory.makeString("*DTP-");
		complex_special_forms.$sym20$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
		complex_special_forms.$sym21$_REST = SubLObjectFactory.makeSymbol("&REST");
		complex_special_forms.$list22 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("&REST"),
						SubLObjectFactory.makeSymbol("OPTIONS")),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("SLOTS"));
		complex_special_forms.$sym23$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
		complex_special_forms.$kw24$CONC_NAME = SubLObjectFactory.makeKeyword("CONC-NAME");
		complex_special_forms.$kw25$PRINT_FUNCTION = SubLObjectFactory.makeKeyword("PRINT-FUNCTION");
		complex_special_forms.$kw26$C_STRUCTURE_TAG = SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG");
		complex_special_forms.$kw27$GENERATE_VISIT_FUNCTION_ = SubLObjectFactory
				.makeKeyword("GENERATE-VISIT-FUNCTION?");
		complex_special_forms.$kw28$NAME = SubLObjectFactory.makeKeyword("NAME");
		complex_special_forms.$kw29$HOST_FN_NAME = SubLObjectFactory.makeKeyword("HOST-FN-NAME");
		complex_special_forms.$kw30$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
		complex_special_forms.$kw31$CONSTRUCTOR = SubLObjectFactory.makeKeyword("CONSTRUCTOR");
		complex_special_forms.$kw32$TYPE_VAR = SubLObjectFactory.makeKeyword("TYPE-VAR");
		complex_special_forms.$kw33$SLOTS = SubLObjectFactory.makeKeyword("SLOTS");
		complex_special_forms.$kw34$SLOT_KEYWORDS = SubLObjectFactory.makeKeyword("SLOT-KEYWORDS");
		complex_special_forms.$kw35$GETTERS = SubLObjectFactory.makeKeyword("GETTERS");
		complex_special_forms.$kw36$SETTERS = SubLObjectFactory.makeKeyword("SETTERS");
		complex_special_forms.$str37$_P = SubLObjectFactory.makeString("-P");
		complex_special_forms.$str38$MAKE_ = SubLObjectFactory.makeString("MAKE-");
		complex_special_forms.$str39$VISIT_DEFSTRUCT_ = SubLObjectFactory.makeString("VISIT-DEFSTRUCT-");
		complex_special_forms.$str40$_CSETF_ = SubLObjectFactory.makeString("_CSETF-");
		complex_special_forms.$str41$CYC = SubLObjectFactory.makeString("CYC");
		complex_special_forms.$str42$SUBLISP = SubLObjectFactory.makeString("SUBLISP");
		complex_special_forms.$str43$_1 = SubLObjectFactory.makeString("-1");
		complex_special_forms.$list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"),
				SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("CONC-NAME"),
				SubLObjectFactory.makeSymbol("PRINT-FUNCTION"), SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"),
				SubLObjectFactory.makeSymbol("GENERATE-VISIT-FUNCTION?"), SubLObjectFactory.makeSymbol("PREDICATE"),
				SubLObjectFactory.makeSymbol("CONSTRUCTOR"), SubLObjectFactory.makeSymbol("HOST-FN-NAME"),
				SubLObjectFactory.makeSymbol("TYPE-VAR"), SubLObjectFactory.makeSymbol("SLOTS"),
				SubLObjectFactory.makeSymbol("SLOT-KEYWORDS"), SubLObjectFactory.makeSymbol("GETTERS"),
				SubLObjectFactory.makeSymbol("SETTERS") });
		complex_special_forms.$list45 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"),
				SubLObjectFactory.makeKeyword("CONC-NAME"), SubLObjectFactory.makeKeyword("PRINT-FUNCTION"),
				SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG"),
				SubLObjectFactory.makeKeyword("GENERATE-VISIT-FUNCTION?"), SubLObjectFactory.makeKeyword("PREDICATE"),
				SubLObjectFactory.makeKeyword("CONSTRUCTOR"), SubLObjectFactory.makeKeyword("HOST-FN-NAME"),
				SubLObjectFactory.makeKeyword("TYPE-VAR"), SubLObjectFactory.makeKeyword("SLOTS"),
				SubLObjectFactory.makeKeyword("SLOT-KEYWORDS"), SubLObjectFactory.makeKeyword("GETTERS"),
				SubLObjectFactory.makeKeyword("SETTERS") });
		complex_special_forms.$kw46$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		complex_special_forms.$kw47$SL2JAVA = SubLObjectFactory.makeKeyword("SL2JAVA");
		complex_special_forms.$sym48$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
		complex_special_forms.$sym49$OPTIMIZE_FUNCALL = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");
		complex_special_forms.$sym50$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		complex_special_forms.$list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("PROGN"));
		complex_special_forms.$list52 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), SubLObjectFactory.makeSymbol("TYPE-VAR"),
				SubLObjectFactory.makeSymbol("TYPE"));
		complex_special_forms.$sym53$_STRUCTURE_TYPE = SubLObjectFactory.makeSymbol("_STRUCTURE-TYPE");
		complex_special_forms.$sym54$CAND = SubLObjectFactory.makeSymbol("CAND");
		complex_special_forms.$sym55$_STRUCTURES_BAG_P = SubLObjectFactory.makeSymbol("_STRUCTURES-BAG-P");
		complex_special_forms.$sym56$_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_STRUCTURE-SLOT");
		complex_special_forms.$list57 = ConsesLow.list(CommonSymbols.ONE_INTEGER);
		complex_special_forms.$list58 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("TYPE"),
				SubLObjectFactory.makeSymbol("SLOT"));
		complex_special_forms.$list59 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("VALUE"),
				SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("SLOT"));
		complex_special_forms.$sym60$_SET_STRUCTURE_SLOT = SubLObjectFactory.makeSymbol("_SET-STRUCTURE-SLOT");
		complex_special_forms.$list61 = ConsesLow.list(SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"),
				SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("TYPE-VAR"),
				SubLObjectFactory.makeSymbol("TYPE"));
		complex_special_forms.$sym62$_CLEAR_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-STRUCTURE");
		complex_special_forms.$sym63$_NEW_STRUCTURE = SubLObjectFactory.makeSymbol("_NEW-STRUCTURE");
		complex_special_forms.$sym64$_CLEAR_SUB_STRUCTURE = SubLObjectFactory.makeSymbol("_CLEAR-SUB-STRUCTURE");
		complex_special_forms.$sym65$_DTP_STRUCTURES_BAG_ = SubLObjectFactory.makeSymbol("*DTP-STRUCTURES-BAG*");
		complex_special_forms.$sym66$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
		complex_special_forms.$str67$_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeString("-PRINT-FUNCTION-TRAMPOLINE");
		complex_special_forms.$sym68$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory
				.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		complex_special_forms.$sym69$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
		complex_special_forms.$sym70$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
		complex_special_forms.$list71 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("STREAM"));
		complex_special_forms.$list72 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("STREAM"), CommonSymbols.ZERO_INTEGER);
		complex_special_forms.$sym73$_PRINT_OBJECT_METHOD_TABLE_ = SubLObjectFactory
				.makeSymbol("*PRINT-OBJECT-METHOD-TABLE*");
		complex_special_forms.$sym74$_REGISTER_DEFSTRUCT = SubLObjectFactory.makeSymbol("_REGISTER-DEFSTRUCT");
		complex_special_forms.$sym75$_DEFSTRUCT_OBJECT_P = SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P");
		complex_special_forms.$sym76$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
		complex_special_forms.$sym77$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
		complex_special_forms.$sym78$_DEFSTRUCT_GET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT");
		complex_special_forms.$sym79$_DEFSTRUCT_SET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT");
		complex_special_forms.$list80 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJECT"),
				SubLObjectFactory.makeSymbol("VALUE"));
		complex_special_forms.$sym81$_DEF_CSETF = SubLObjectFactory.makeSymbol("_DEF-CSETF");
		complex_special_forms.$sym82$NEW = SubLObjectFactory.makeSymbol("NEW");
		complex_special_forms.$sym83$_DEFSTRUCT_CONSTRUCT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT");
		complex_special_forms.$list84 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"),
				SubLObjectFactory.makeSymbol("ARGLIST"));
		complex_special_forms.$str85$CURRENT_VALUE = SubLObjectFactory.makeString("CURRENT-VALUE");
		complex_special_forms.$str86$CURRENT_ARG = SubLObjectFactory.makeString("CURRENT-ARG");
		complex_special_forms.$str87$NEXT = SubLObjectFactory.makeString("NEXT");
		complex_special_forms.$sym88$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
		complex_special_forms.$sym89$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		complex_special_forms.$str90$Invalid_slot__S_for_construction_ = SubLObjectFactory
				.makeString("Invalid slot ~S for construction function");
		complex_special_forms.$sym91$CDO = SubLObjectFactory.makeSymbol("CDO");
		complex_special_forms.$sym92$CDDR = SubLObjectFactory.makeSymbol("CDDR");
		complex_special_forms.$sym93$NULL = SubLObjectFactory.makeSymbol("NULL");
		complex_special_forms.$sym94$CAR = SubLObjectFactory.makeSymbol("CAR");
		complex_special_forms.$sym95$CADR = SubLObjectFactory.makeSymbol("CADR");
		complex_special_forms.$sym96$PCASE = SubLObjectFactory.makeSymbol("PCASE");
		complex_special_forms.$kw97$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
		complex_special_forms.$kw98$SLOT = SubLObjectFactory.makeKeyword("SLOT");
		complex_special_forms.$kw99$END = SubLObjectFactory.makeKeyword("END");
		complex_special_forms.$sym100$DEFINE_METHOD = SubLObjectFactory.makeSymbol("DEFINE-METHOD");
		complex_special_forms.$sym101$VISIT_DEFSTRUCT_OBJECT = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT");
		complex_special_forms.$sym102$OBJ = SubLObjectFactory.makeSymbol("OBJ");
		complex_special_forms.$list103 = ConsesLow.list(SubLObjectFactory.makeSymbol("VISITOR-FN"));
		complex_special_forms.$list104 = ConsesLow.list(SubLObjectFactory.makeSymbol("OBJ"),
				SubLObjectFactory.makeSymbol("VISITOR-FN"));
		complex_special_forms.$list105 = ConsesLow.list(SubLObjectFactory.makeSymbol("PLACE"),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		complex_special_forms.$list106 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZE-CALL-PROFILING-TABLE"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*CALL-PROFILING-ENABLED?*"), CommonSymbols.T));
		complex_special_forms.$sym107$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		complex_special_forms.$sym108$CSETF = SubLObjectFactory.makeSymbol("CSETF");
		complex_special_forms.$list109 = ConsesLow
				.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FINALIZE-CALL-PROFILING-TABLE"),
						SubLObjectFactory.makeSymbol("*CALL-PROFILING-TABLE*")));
		complex_special_forms.$int110$1000 = SubLObjectFactory.makeInteger(1000);
		complex_special_forms.$sym111$_ = SubLObjectFactory.makeSymbol(">");
		complex_special_forms.$sym112$CDR = SubLObjectFactory.makeSymbol("CDR");
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18321L)
	public static SubLObject _defstruct_construct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject c_structure_tag = CommonSymbols.NIL;
		SubLObject size = CommonSymbols.NIL;
		SubLObject type_var = CommonSymbols.NIL;
		SubLObject type = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
		c_structure_tag = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
		size = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
		type_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list61);
		type = current.first();
		current = current.rest();
		if (CommonSymbols.NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list61);
			return CommonSymbols.NIL;
		}
		if (CommonSymbols.NIL != c_structure_tag)
			return ConsesLow.list(complex_special_forms.$sym62$_CLEAR_STRUCTURE,
					ConsesLow.list(complex_special_forms.$sym63$_NEW_STRUCTURE, c_structure_tag, size), size);
		return ConsesLow.list(complex_special_forms.$sym64$_CLEAR_SUB_STRUCTURE,
				ConsesLow.list(complex_special_forms.$sym63$_NEW_STRUCTURE,
						complex_special_forms.$sym65$_DTP_STRUCTURES_BAG_, size),
				size, type_var);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18010L)
	public static SubLObject _defstruct_get_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = CommonSymbols.NIL;
		SubLObject index = CommonSymbols.NIL;
		SubLObject type = CommonSymbols.NIL;
		SubLObject slot = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
		index = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
		type = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list58);
		slot = current.first();
		current = current.rest();
		if (CommonSymbols.NIL == current)
			return ConsesLow.list(complex_special_forms.$sym56$_STRUCTURE_SLOT, object, index);
		cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list58);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 17700L)
	public static SubLObject _defstruct_object_p(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = CommonSymbols.NIL;
		SubLObject c_structure_tag = CommonSymbols.NIL;
		SubLObject type_var = CommonSymbols.NIL;
		SubLObject type = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
		c_structure_tag = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
		type_var = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list52);
		type = current.first();
		current = current.rest();
		if (CommonSymbols.NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list52);
			return CommonSymbols.NIL;
		}
		if (CommonSymbols.NIL != c_structure_tag)
			return ConsesLow.list(complex_special_forms.$sym53$_STRUCTURE_TYPE, object, c_structure_tag);
		return ConsesLow.list(complex_special_forms.$sym54$CAND,
				ConsesLow.list(complex_special_forms.$sym55$_STRUCTURES_BAG_P, object),
				ConsesLow.list(CommonSymbols.EQ, ConsesLow.listS(complex_special_forms.$sym56$_STRUCTURE_SLOT, object,
						complex_special_forms.$list57), type_var));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18157L)
	public static SubLObject _defstruct_set_slot(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject object = CommonSymbols.NIL;
		SubLObject index = CommonSymbols.NIL;
		SubLObject value = CommonSymbols.NIL;
		SubLObject type = CommonSymbols.NIL;
		SubLObject slot = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
		object = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
		index = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
		value = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
		type = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list59);
		slot = current.first();
		current = current.rest();
		if (CommonSymbols.NIL == current)
			return ConsesLow.list(complex_special_forms.$sym60$_SET_STRUCTURE_SLOT, object, index, value);
		cdestructuring_bind.cdestructuring_bind_error(datum, complex_special_forms.$list59);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13226L)
	public static SubLObject accessor_package(SubLObject accessor) {
		return complex_special_forms.getter_package(accessor);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6513L)
	public static SubLObject build_regmethod_call(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		SubLObject dtp_var = complex_special_forms.dtp_var(type);
		return ConsesLow.list(complex_special_forms.$sym12$_REGISTER_METHOD, method_table, dtp_var,
				ConsesLow.list(complex_special_forms.$sym13$FUNCTION, method_function));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 6767L)
	public static SubLObject build_regmethod_list(SubLObject type, SubLObject method_table,
			SubLObject method_function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject reglist = CommonSymbols.NIL;
		SubLObject alias_list = conses_high.second(conses_high.assoc(Symbols.symbol_name(type),
				complex_special_forms.$polymorphic_type_hierarchy$.getDynamicValue(thread),
				Symbols.symbol_function(complex_special_forms.$sym14$STRING_), CommonSymbols.UNPROVIDED));
		if (CommonSymbols.NIL != alias_list) {
			SubLObject cdolist_list_var = alias_list;
			SubLObject curr = CommonSymbols.NIL;
			curr = cdolist_list_var.first();
			while (CommonSymbols.NIL != cdolist_list_var) {
				reglist = ConsesLow
						.cons(complex_special_forms.build_regmethod_call(curr, method_table, method_function), reglist);
				cdolist_list_var = cdolist_list_var.rest();
				curr = cdolist_list_var.first();
			}
		} else
			reglist = ConsesLow.list(complex_special_forms.build_regmethod_call(type, method_table, method_function));
		return reglist;
	}

	public static SubLObject declare_complex_special_forms_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"intern_accessor", "INTERN-ACCESSOR", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms", "defpolymorphic",
				"DEFPOLYMORPHIC");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms", "define_method",
				"DEFINE-METHOD");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defpolymorphic_internal", "DEFPOLYMORPHIC-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"define_method_internal", "DEFINE-METHOD-INTERNAL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"build_regmethod_call", "BUILD-REGMETHOD-CALL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"build_regmethod_list", "BUILD-REGMETHOD-LIST", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"method_table_var", "METHOD-TABLE-VAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"method_function_var", "METHOD-FUNCTION-VAR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms", "dtp_var",
				"DTP-VAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"full_formal_parameter_list", "FULL-FORMAL-PARAMETER-LIST", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms", "defstruct",
				"DEFSTRUCT");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_analyze", "DEFSTRUCT-ANALYZE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_conc_name", "DEFSTRUCT-CONC-NAME", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_predicate", "DEFSTRUCT-PREDICATE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_constructor", "DEFSTRUCT-CONSTRUCTOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_host_fn_name", "DEFSTRUCT-HOST-FN-NAME", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_type_var", "DEFSTRUCT-TYPE-VAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_slot_keywords", "DEFSTRUCT-SLOT-KEYWORDS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getters", "DEFSTRUCT-GETTERS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getter", "DEFSTRUCT-GETTER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_setters", "DEFSTRUCT-SETTERS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_setter", "DEFSTRUCT-SETTER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"getter_package", "GETTER-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"accessor_package", "ACCESSOR-PACKAGE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"setter_from_accessor", "SETTER-FROM-ACCESSOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_lisp_constructor", "DEFSTRUCT-LISP-CONSTRUCTOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_expand", "DEFSTRUCT-EXPAND", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"_defstruct_object_p", "_DEFSTRUCT-OBJECT-P");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"_defstruct_get_slot", "_DEFSTRUCT-GET-SLOT");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"_defstruct_set_slot", "_DEFSTRUCT-SET-SLOT");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"_defstruct_construct", "_DEFSTRUCT-CONSTRUCT");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_type_var_form", "DEFSTRUCT-TYPE-VAR-FORM", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_print_method", "DEFSTRUCT-PRINT-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_print_forms", "DEFSTRUCT-PRINT-FORMS", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_register_form", "DEFSTRUCT-REGISTER-FORM", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_predicate_form", "DEFSTRUCT-PREDICATE-FORM", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_predicate_arglist", "DEFSTRUCT-PREDICATE-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_predicate_variable", "DEFSTRUCT-PREDICATE-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_first_function_variable", "DEFSTRUCT-FIRST-FUNCTION-VARIABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getter_forms", "DEFSTRUCT-GETTER-FORMS", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getter_form", "DEFSTRUCT-GETTER-FORM", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getter_arglist", "DEFSTRUCT-GETTER-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_getter_variable", "DEFSTRUCT-GETTER-VARIABLE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_setter_forms", "DEFSTRUCT-SETTER-FORMS", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_setter_form", "DEFSTRUCT-SETTER-FORM", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_setter_arglist", "DEFSTRUCT-SETTER-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_def_csetf_forms", "DEFSTRUCT-DEF-CSETF-FORMS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_constructor_form", "DEFSTRUCT-CONSTRUCTOR-FORM", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_constructor_arglist", "DEFSTRUCT-CONSTRUCTOR-ARGLIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_constructor_arglist_handler", "DEFSTRUCT-CONSTRUCTOR-ARGLIST-HANDLER", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_host_function", "DEFSTRUCT-HOST-FUNCTION", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"defstruct_host_arglist", "DEFSTRUCT-HOST-ARGLIST", 0, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"with_call_profiling", "WITH-CALL-PROFILING");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"possibly_note_function_entry", "POSSIBLY-NOTE-FUNCTION-ENTRY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"initialize_call_profiling_table", "INITIALIZE-CALL-PROFILING-TABLE", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms",
				"finalize_call_profiling_table", "FINALIZE-CALL-PROFILING-TABLE", 1, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 2882L)
	public static SubLObject define_method(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = CommonSymbols.NIL;
		SubLObject lambda_list = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return complex_special_forms.define_method_internal(name, lambda_list, body);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 5718L)
	public static SubLObject define_method_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject type = conses_high.second(arglist.first());
		SubLObject plain_args = reader.bq_cons(arglist.first().first(),
				ConsesLow.append(arglist.rest(), CommonSymbols.NIL));
		SubLObject method_table_var = complex_special_forms.method_table_var(name);
		SubLObject method_function = complex_special_forms.method_function_var(name, type);
		SubLObject regmethod_list = complex_special_forms.build_regmethod_list(type, method_table_var, method_function);
		return ConsesLow.listS(complex_special_forms.$sym2$PROGN,
				ConsesLow.listS(complex_special_forms.$sym5$DEFINE, method_function, plain_args,
						ConsesLow.append(body, CommonSymbols.NIL)),
				ConsesLow.append(regmethod_list, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 1228L)
	public static SubLObject defpolymorphic(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = CommonSymbols.NIL;
		SubLObject lambda_list = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list0);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return complex_special_forms.defpolymorphic_internal(name, lambda_list, body);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 4930L)
	public static SubLObject defpolymorphic_internal(SubLObject name, SubLObject arglist, SubLObject body) {
		SubLObject method_table_var = complex_special_forms.method_table_var(name);
		SubLObject method_function_var = Symbols.make_symbol(complex_special_forms.$str1$METHOD_FUNCTION);
		SubLObject doc_string = CommonSymbols.NIL;
		if (body.first().isString()) {
			doc_string = ConsesLow.list(body.first());
			body = body.rest();
		}
		return ConsesLow.list(complex_special_forms.$sym2$PROGN,
				ConsesLow.listS(complex_special_forms.$sym3$DEFLEXICAL, method_table_var, complex_special_forms.$list4),
				ConsesLow.listS(complex_special_forms.$sym5$DEFINE, name, arglist,
						ConsesLow.append(doc_string,
								ConsesLow.list(ConsesLow.listS(complex_special_forms.$sym6$CLET,
										ConsesLow.list(ConsesLow.list(method_function_var,
												ConsesLow.list(complex_special_forms.$sym7$_METHOD, arglist.first(),
														method_table_var))),
										ConsesLow
												.list(complex_special_forms.$sym8$PWHEN, method_function_var,
														ConsesLow.list(complex_special_forms.$sym9$RET,
																ConsesLow.listS(complex_special_forms.$sym10$FUNCALL,
																		method_function_var,
																		ConsesLow.append(complex_special_forms
																				.full_formal_parameter_list(arglist),
																				CommonSymbols.NIL)))),
										ConsesLow.append(body, CommonSymbols.NIL))))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 8214L)
	public static SubLObject defstruct(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list22);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject name = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list22);
		name = current.first();
		SubLObject options;
		current = options = current.rest();
		SubLObject slots;
		current = slots = temp;
		SubLObject analysis = complex_special_forms.defstruct_analyze(name, options, slots);
		return complex_special_forms.defstruct_expand(analysis);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 9867L)
	public static SubLObject defstruct_analyze(SubLObject name, SubLObject options, SubLObject slots) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.symbolp(name) : name;
		SubLObject conc_name = conses_high.second(conses_high.assoc(complex_special_forms.$kw24$CONC_NAME, options,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		SubLObject print_function = conses_high.second(conses_high.assoc(complex_special_forms.$kw25$PRINT_FUNCTION,
				options, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		SubLObject c_structure_tag = conses_high.second(conses_high.assoc(complex_special_forms.$kw26$C_STRUCTURE_TAG,
				options, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		SubLObject raw_make_visit_fnP = conses_high.assoc(complex_special_forms.$kw27$GENERATE_VISIT_FUNCTION_, options,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		SubLObject make_visit_fnP = CommonSymbols.NIL == raw_make_visit_fnP
				? complex_special_forms.$default_generate_visit_functionP$.getDynamicValue(thread)
				: conses_high.second(raw_make_visit_fnP);
		conc_name = complex_special_forms.defstruct_conc_name(name, conc_name);
		SubLObject predicate = complex_special_forms.defstruct_predicate(name);
		SubLObject constructor = complex_special_forms.defstruct_constructor(name);
		SubLObject type_var = complex_special_forms.defstruct_type_var(name);
		SubLObject slot_keywords = complex_special_forms.defstruct_slot_keywords(slots);
		SubLObject getters = complex_special_forms.defstruct_getters(conc_name, slots);
		SubLObject setters = complex_special_forms.defstruct_setters(getters);
		SubLObject host_fn_name = complex_special_forms.defstruct_host_fn_name(name);
		return ConsesLow
				.listS(complex_special_forms.$kw28$NAME, name,
						ConsesLow.append(new SubLObject[] { CommonSymbols.NIL != conc_name
								? ConsesLow.list(complex_special_forms.$kw24$CONC_NAME, conc_name) : CommonSymbols.NIL,
								CommonSymbols.NIL != print_function
										? ConsesLow.list(complex_special_forms.$kw25$PRINT_FUNCTION, print_function)
										: CommonSymbols.NIL,
								CommonSymbols.NIL != c_structure_tag
										? ConsesLow.list(complex_special_forms.$kw26$C_STRUCTURE_TAG, c_structure_tag)
										: CommonSymbols.NIL,
								CommonSymbols.NIL != make_visit_fnP
										? ConsesLow.list(complex_special_forms.$kw27$GENERATE_VISIT_FUNCTION_,
												make_visit_fnP, complex_special_forms.$kw29$HOST_FN_NAME, host_fn_name)
										: CommonSymbols.NIL,
								ConsesLow.list(new SubLObject[] { complex_special_forms.$kw30$PREDICATE, predicate,
										complex_special_forms.$kw31$CONSTRUCTOR, constructor,
										complex_special_forms.$kw32$TYPE_VAR, type_var,
										complex_special_forms.$kw33$SLOTS, slots,
										complex_special_forms.$kw34$SLOT_KEYWORDS, slot_keywords,
										complex_special_forms.$kw35$GETTERS, getters,
										complex_special_forms.$kw36$SETTERS, setters }) }));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11393L)
	public static SubLObject defstruct_conc_name(SubLObject name, SubLObject conc_name) {
		if (CommonSymbols.NIL != conc_name)
			return conc_name;
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), complex_special_forms.$str17$_));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11642L)
	public static SubLObject defstruct_constructor(SubLObject name) {
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str38$MAKE_, Symbols.symbol_name(name)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23564L)
	public static SubLObject defstruct_constructor_arglist(SubLObject constructor) {
		return complex_special_forms.$list84;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 23670L)
	public static SubLObject defstruct_constructor_arglist_handler(SubLObject arglist_var, SubLObject new_var,
			SubLObject slot_keywords, SubLObject setters) {
		SubLObject current_value = Symbols.make_symbol(complex_special_forms.$str85$CURRENT_VALUE);
		SubLObject current_arg = Symbols.make_symbol(complex_special_forms.$str86$CURRENT_ARG);
		SubLObject next = Symbols.make_symbol(complex_special_forms.$str87$NEXT);
		SubLObject gencaseslots = CommonSymbols.NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		SubLObject slot_keyword;
		SubLObject setter;
		for (cdotimes_end_var = Sequences
				.length(slot_keywords), n = CommonSymbols.NIL, n = CommonSymbols.ZERO_INTEGER; n
						.numL(cdotimes_end_var); n = Numbers.add(n, CommonSymbols.ONE_INTEGER)) {
			slot_keyword = ConsesLow.nth(n, slot_keywords);
			setter = ConsesLow.nth(n, setters);
			gencaseslots = ConsesLow.cons(ConsesLow.list(slot_keyword, ConsesLow.list(setter, new_var, current_value)),
					gencaseslots);
		}
		gencaseslots = ConsesLow.cons(
				ConsesLow.list(complex_special_forms.$sym88$OTHERWISE,
						ConsesLow.list(complex_special_forms.$sym89$ERROR,
								complex_special_forms.$str90$Invalid_slot__S_for_construction_, current_arg)),
				gencaseslots);
		return ConsesLow.list(complex_special_forms.$sym91$CDO,
				ConsesLow.list(
						ConsesLow.list(next, arglist_var, ConsesLow.list(complex_special_forms.$sym92$CDDR, next))),
				ConsesLow.list(ConsesLow.list(complex_special_forms.$sym93$NULL, next)),
				ConsesLow.list(complex_special_forms.$sym6$CLET,
						ConsesLow.list(
								ConsesLow.list(current_arg, ConsesLow.list(complex_special_forms.$sym94$CAR, next)),
								ConsesLow.list(current_value, ConsesLow.list(complex_special_forms.$sym95$CADR, next))),
						ConsesLow.listS(complex_special_forms.$sym96$PCASE, current_arg,
								ConsesLow.append(Sequences.nreverse(gencaseslots), CommonSymbols.NIL))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22933L)
	public static SubLObject defstruct_constructor_form(SubLObject type, SubLObject constructor,
			SubLObject c_structure_tag, SubLObject type_var, SubLObject slot_keywords, SubLObject setters) {
		SubLObject arglist = complex_special_forms.defstruct_constructor_arglist(constructor);
		SubLObject arglist_var = conses_high.second(arglist);
		SubLObject new_var = complex_special_forms.$sym82$NEW;
		SubLObject size = Sequences.length(slot_keywords);
		SubLObject arglist_handler = complex_special_forms.defstruct_constructor_arglist_handler(arglist_var, new_var,
				slot_keywords, setters);
		return ConsesLow.list(complex_special_forms.$sym5$DEFINE, constructor, arglist,
				ConsesLow.list(complex_special_forms.$sym6$CLET,
						ConsesLow.list(ConsesLow.list(new_var,
								ConsesLow.list(complex_special_forms.$sym83$_DEFSTRUCT_CONSTRUCT, c_structure_tag, size,
										type_var, type))),
						arglist_handler, ConsesLow.list(complex_special_forms.$sym9$RET, new_var)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22547L)
	public static SubLObject defstruct_def_csetf_forms(SubLObject getters, SubLObject setters) {
		SubLObject forms = CommonSymbols.NIL;
		SubLObject rest_getters = CommonSymbols.NIL;
		SubLObject rest_setters = CommonSymbols.NIL;
		SubLObject getter = CommonSymbols.NIL;
		SubLObject setter = CommonSymbols.NIL;
		rest_getters = getters;
		rest_setters = setters;
		getter = rest_getters.first();
		setter = rest_setters.first();
		while (CommonSymbols.NIL != rest_getters) {
			forms = ConsesLow.cons(ConsesLow.list(complex_special_forms.$sym81$_DEF_CSETF,
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, getter),
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, setter)), forms);
			rest_getters = rest_getters.rest();
			rest_setters = rest_setters.rest();
			getter = rest_getters.first();
			setter = rest_setters.first();
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 15527L)
	public static SubLObject defstruct_expand(SubLObject analysis) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject allow_other_keys_p = CommonSymbols.NIL;
		SubLObject rest = analysis;
		SubLObject bad = CommonSymbols.NIL;
		SubLObject current_$1 = CommonSymbols.NIL;
		while (CommonSymbols.NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, analysis, complex_special_forms.$list44);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, analysis, complex_special_forms.$list44);
			if (CommonSymbols.NIL == conses_high.member(current_$1, complex_special_forms.$list45,
					CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
				bad = CommonSymbols.T;
			if (current_$1 == complex_special_forms.$kw46$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(analysis, complex_special_forms.$list44);
		SubLObject name_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw28$NAME, analysis);
		SubLObject name = CommonSymbols.NIL != name_tail ? conses_high.cadr(name_tail) : CommonSymbols.NIL;
		SubLObject conc_name_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw24$CONC_NAME,
				analysis);
		SubLObject conc_name = CommonSymbols.NIL != conc_name_tail ? conses_high.cadr(conc_name_tail)
				: CommonSymbols.NIL;
		SubLObject print_function_tail = cdestructuring_bind
				.property_list_member(complex_special_forms.$kw25$PRINT_FUNCTION, analysis);
		SubLObject print_function = CommonSymbols.NIL != print_function_tail ? conses_high.cadr(print_function_tail)
				: CommonSymbols.NIL;
		SubLObject c_structure_tag_tail = cdestructuring_bind
				.property_list_member(complex_special_forms.$kw26$C_STRUCTURE_TAG, analysis);
		SubLObject c_structure_tag = CommonSymbols.NIL != c_structure_tag_tail ? conses_high.cadr(c_structure_tag_tail)
				: CommonSymbols.NIL;
		SubLObject generate_visit_functionP_tail = cdestructuring_bind
				.property_list_member(complex_special_forms.$kw27$GENERATE_VISIT_FUNCTION_, analysis);
		SubLObject generate_visit_functionP = CommonSymbols.NIL != generate_visit_functionP_tail
				? conses_high.cadr(generate_visit_functionP_tail) : CommonSymbols.NIL;
		SubLObject predicate_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw30$PREDICATE,
				analysis);
		SubLObject predicate = CommonSymbols.NIL != predicate_tail ? conses_high.cadr(predicate_tail)
				: CommonSymbols.NIL;
		SubLObject constructor_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw31$CONSTRUCTOR,
				analysis);
		SubLObject constructor = CommonSymbols.NIL != constructor_tail ? conses_high.cadr(constructor_tail)
				: CommonSymbols.NIL;
		SubLObject host_fn_name_tail = cdestructuring_bind
				.property_list_member(complex_special_forms.$kw29$HOST_FN_NAME, analysis);
		SubLObject host_fn_name = CommonSymbols.NIL != host_fn_name_tail ? conses_high.cadr(host_fn_name_tail)
				: CommonSymbols.NIL;
		SubLObject type_var_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw32$TYPE_VAR,
				analysis);
		SubLObject type_var = CommonSymbols.NIL != type_var_tail ? conses_high.cadr(type_var_tail) : CommonSymbols.NIL;
		SubLObject slots_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw33$SLOTS, analysis);
		SubLObject slots = CommonSymbols.NIL != slots_tail ? conses_high.cadr(slots_tail) : CommonSymbols.NIL;
		SubLObject slot_keywords_tail = cdestructuring_bind
				.property_list_member(complex_special_forms.$kw34$SLOT_KEYWORDS, analysis);
		SubLObject slot_keywords = CommonSymbols.NIL != slot_keywords_tail ? conses_high.cadr(slot_keywords_tail)
				: CommonSymbols.NIL;
		SubLObject getters_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw35$GETTERS,
				analysis);
		SubLObject getters = CommonSymbols.NIL != getters_tail ? conses_high.cadr(getters_tail) : CommonSymbols.NIL;
		SubLObject setters_tail = cdestructuring_bind.property_list_member(complex_special_forms.$kw36$SETTERS,
				analysis);
		SubLObject setters = CommonSymbols.NIL != setters_tail ? conses_high.cadr(setters_tail) : CommonSymbols.NIL;
		if (CommonSymbols.NIL != Sequences.find(complex_special_forms.$kw47$SL2JAVA,
				reader.$features$.getDynamicValue(thread), CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
			c_structure_tag = CommonSymbols.NIL;
		SubLObject type_var_form = complex_special_forms.defstruct_type_var_form(type_var, name, c_structure_tag);
		SubLObject print_method = complex_special_forms.defstruct_print_method(name, print_function);
		SubLObject print_forms = complex_special_forms.defstruct_print_forms(c_structure_tag, type_var, print_function,
				print_method);
		SubLObject register_form = complex_special_forms.defstruct_register_form(name, c_structure_tag, slots,
				print_method);
		SubLObject predicate_form = complex_special_forms.defstruct_predicate_form(name, predicate, c_structure_tag,
				type_var);
		SubLObject getter_forms = complex_special_forms.defstruct_getter_forms(name, c_structure_tag, predicate, slots,
				getters);
		SubLObject setter_forms = complex_special_forms.defstruct_setter_forms(name, c_structure_tag, predicate, slots,
				setters);
		SubLObject def_csetf_forms = complex_special_forms.defstruct_def_csetf_forms(getters, setters);
		SubLObject host_fn_form = CommonSymbols.NIL != generate_visit_functionP
				? complex_special_forms.defstruct_host_function(name, host_fn_name, constructor, slot_keywords, getters)
				: CommonSymbols.NIL;
		SubLObject constructor_form = complex_special_forms.defstruct_constructor_form(name, constructor,
				c_structure_tag, type_var, slot_keywords, setters);
		return ConsesLow
				.listS(complex_special_forms.$sym2$PROGN, type_var_form,
						ConsesLow.append(print_forms,
								CommonSymbols.NIL != register_form ? ConsesLow.list(register_form) : CommonSymbols.NIL,
								ConsesLow.listS(
										ConsesLow
												.list(complex_special_forms.$sym48$DECLAIM,
														ConsesLow.list(complex_special_forms.$sym49$OPTIMIZE_FUNCALL,
																predicate)),
										predicate_form,
										ConsesLow.append(getter_forms, setter_forms, def_csetf_forms,
												ConsesLow.list(constructor_form,
														ConsesLow.list(CommonSymbols.IDENTITY,
																ConsesLow.list(complex_special_forms.$sym50$QUOTE,
																		name)),
														CommonSymbols.NIL != generate_visit_functionP ? host_fn_form
																: complex_special_forms.$list51)))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20489L)
	public static SubLObject defstruct_first_function_variable(SubLObject function, SubLObject v_default) {
		return v_default;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12421L)
	public static SubLObject defstruct_getter(SubLObject conc_name, SubLObject slot) {
		return complex_special_forms.intern_accessor(
				Strings.string_upcase(Sequences.cconcatenate(Symbols.symbol_name(conc_name), Symbols.symbol_name(slot)),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21512L)
	public static SubLObject defstruct_getter_arglist(SubLObject getter) {
		return ConsesLow.list(complex_special_forms.defstruct_getter_variable(getter));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21214L)
	public static SubLObject defstruct_getter_form(SubLObject getter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		SubLObject arglist = complex_special_forms.defstruct_getter_arglist(getter);
		SubLObject getter_var = arglist.first();
		return ConsesLow.list(complex_special_forms.$sym5$DEFINE, getter, arglist,
				ConsesLow.list(complex_special_forms.$sym77$CHECK_TYPE, getter_var, predicate),
				ConsesLow.list(complex_special_forms.$sym9$RET, ConsesLow
						.list(complex_special_forms.$sym78$_DEFSTRUCT_GET_SLOT, getter_var, index, type, slot)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20801L)
	public static SubLObject defstruct_getter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject getters) {
		SubLObject forms = CommonSymbols.NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject getter;
		SubLObject index;
		for (cdotimes_end_var = Sequences.length(getters), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			slot = ConsesLow.nth(i, slots);
			getter = ConsesLow.nth(i, getters);
			index = CommonSymbols.NIL != c_structure_tag ? i : Numbers.add(i, CommonSymbols.TWO_INTEGER);
			forms = ConsesLow.cons(complex_special_forms.defstruct_getter_form(getter, index, predicate, type, slot),
					forms);
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21603L)
	public static SubLObject defstruct_getter_variable(SubLObject getter) {
		return complex_special_forms.defstruct_first_function_variable(getter, complex_special_forms.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12210L)
	public static SubLObject defstruct_getters(SubLObject conc_name, SubLObject slots) {
		SubLObject getters = CommonSymbols.NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = CommonSymbols.NIL;
		slot = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			SubLObject getter = complex_special_forms.defstruct_getter(conc_name, slot);
			getters = ConsesLow.cons(getter, getters);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return Sequences.nreverse(getters);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25599L)
	public static SubLObject defstruct_host_arglist() {
		return complex_special_forms.$list104;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11749L)
	public static SubLObject defstruct_host_fn_name(SubLObject name) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(complex_special_forms.$str39$VISIT_DEFSTRUCT_, Symbols.symbol_name(name)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 24480L)
	public static SubLObject defstruct_host_function(SubLObject type_name, SubLObject host_fn,
			SubLObject constructor_fn, SubLObject slot_keywords, SubLObject getters) {
		SubLObject arglist = complex_special_forms.defstruct_host_arglist();
		SubLObject object_arg = arglist.first();
		SubLObject visitor_fn_arg = conses_high.second(arglist);
		SubLObject size = Sequences.length(slot_keywords);
		SubLObject statements = CommonSymbols.NIL;
		statements = ConsesLow.cons(ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg, object_arg,
				complex_special_forms.$kw97$BEGIN, ConsesLow.list(complex_special_forms.$sym50$QUOTE, constructor_fn),
				size), statements);
		SubLObject index;
		SubLObject slot_keyword;
		SubLObject slot_getter;
		for (index = CommonSymbols.NIL, index = CommonSymbols.ZERO_INTEGER; index
				.numL(size); index = Numbers.add(index, CommonSymbols.ONE_INTEGER)) {
			slot_keyword = ConsesLow.nth(index, slot_keywords);
			slot_getter = ConsesLow.nth(index, getters);
			statements = ConsesLow.cons(
					ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg, object_arg,
							complex_special_forms.$kw98$SLOT, slot_keyword, ConsesLow.list(slot_getter, object_arg)),
					statements);
		}
		statements = ConsesLow.cons(ConsesLow.list(complex_special_forms.$sym10$FUNCALL, visitor_fn_arg, object_arg,
				complex_special_forms.$kw99$END, ConsesLow.list(complex_special_forms.$sym50$QUOTE, constructor_fn),
				size), statements);
		statements = Sequences.nreverse(statements);
		return ConsesLow.list(complex_special_forms.$sym2$PROGN,
				ConsesLow.list(complex_special_forms.$sym5$DEFINE, host_fn, arglist,
						reader.bq_cons(complex_special_forms.$sym2$PROGN,
								ConsesLow.append(statements, CommonSymbols.NIL)),
						ConsesLow.list(complex_special_forms.$sym9$RET, object_arg)),
				ConsesLow.list(complex_special_forms.$sym100$DEFINE_METHOD,
						complex_special_forms.$sym101$VISIT_DEFSTRUCT_OBJECT,
						reader.bq_cons(ConsesLow.list(complex_special_forms.$sym102$OBJ, type_name),
								complex_special_forms.$list103),
						ConsesLow.list(complex_special_forms.$sym9$RET,
								reader.bq_cons(host_fn, complex_special_forms.$list104))));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13455L)
	public static SubLObject defstruct_lisp_constructor(SubLObject constructor) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(Symbols.symbol_name(constructor), complex_special_forms.$str43$_1));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11540L)
	public static SubLObject defstruct_predicate(SubLObject name) {
		return complex_special_forms
				.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name), complex_special_forms.$str37$_P));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20271L)
	public static SubLObject defstruct_predicate_arglist(SubLObject predicate) {
		return ConsesLow.list(complex_special_forms.defstruct_predicate_variable(predicate));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19971L)
	public static SubLObject defstruct_predicate_form(SubLObject type, SubLObject predicate, SubLObject c_structure_tag,
			SubLObject type_var) {
		SubLObject arglist = complex_special_forms.defstruct_predicate_arglist(predicate);
		SubLObject predicate_var = arglist.first();
		return ConsesLow.list(complex_special_forms.$sym5$DEFINE, predicate, arglist,
				ConsesLow.list(complex_special_forms.$sym9$RET,
						ConsesLow.list(complex_special_forms.$sym75$_DEFSTRUCT_OBJECT_P, predicate_var, c_structure_tag,
								type_var, type)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 20376L)
	public static SubLObject defstruct_predicate_variable(SubLObject predicate) {
		return complex_special_forms.defstruct_first_function_variable(predicate, complex_special_forms.$sym76$OBJECT);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19232L)
	public static SubLObject defstruct_print_forms(SubLObject c_structure_tag, SubLObject tag_var,
			SubLObject print_function, SubLObject print_method) {
		if (CommonSymbols.NIL == print_function)
			print_function = complex_special_forms.$sym68$DEFAULT_STRUCT_PRINT_FUNCTION;
		return ConsesLow
				.listS(ConsesLow.list(complex_special_forms.$sym48$DECLAIM, ConsesLow.list(
						complex_special_forms.$sym69$FACCESS, complex_special_forms.$sym70$PRIVATE, print_method)),
						ConsesLow.list(complex_special_forms.$sym5$DEFINE, print_method, complex_special_forms.$list71,
								reader.bq_cons(print_function, complex_special_forms.$list72)),
						ConsesLow.append(
								CommonSymbols.NIL != c_structure_tag ? CommonSymbols.NIL
										: ConsesLow.list(ConsesLow.list(complex_special_forms.$sym12$_REGISTER_METHOD,
												complex_special_forms.$sym73$_PRINT_OBJECT_METHOD_TABLE_, tag_var,
												ConsesLow.list(complex_special_forms.$sym13$FUNCTION, print_method))),
								CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19062L)
	public static SubLObject defstruct_print_method(SubLObject name, SubLObject print_function) {
		return complex_special_forms.intern_accessor(Sequences.cconcatenate(Symbols.symbol_name(name),
				complex_special_forms.$str67$_PRINT_FUNCTION_TRAMPOLINE));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 19715L)
	public static SubLObject defstruct_register_form(SubLObject name, SubLObject c_structure_tag, SubLObject slots,
			SubLObject print_method) {
		if (CommonSymbols.NIL != c_structure_tag)
			return ConsesLow.list(complex_special_forms.$sym74$_REGISTER_DEFSTRUCT, Symbols.symbol_name(name),
					c_structure_tag, Sequences.length(slots),
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, print_method),
					ConsesLow.list(complex_special_forms.$sym50$QUOTE, slots));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12764L)
	public static SubLObject defstruct_setter(SubLObject getter) {
		SubLObject getter_name = Symbols.symbol_name(getter);
		SubLObject getter_package = complex_special_forms.getter_package(getter);
		SubLObject setter_name = Sequences.cconcatenate(complex_special_forms.$str40$_CSETF_, getter_name);
		SubLObject setter_package = getter_package;
		return Packages.intern(setter_name, setter_package);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22461L)
	public static SubLObject defstruct_setter_arglist(SubLObject setter) {
		return complex_special_forms.$list80;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 22119L)
	public static SubLObject defstruct_setter_form(SubLObject setter, SubLObject index, SubLObject predicate,
			SubLObject type, SubLObject slot) {
		SubLObject arglist = complex_special_forms.defstruct_setter_arglist(setter);
		SubLObject object_var = arglist.first();
		SubLObject value_var = conses_high.second(arglist);
		return ConsesLow.list(complex_special_forms.$sym5$DEFINE, setter, arglist,
				ConsesLow.list(complex_special_forms.$sym77$CHECK_TYPE, object_var, predicate),
				ConsesLow.list(complex_special_forms.$sym9$RET, ConsesLow.list(
						complex_special_forms.$sym79$_DEFSTRUCT_SET_SLOT, object_var, index, value_var, type, slot)));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 21707L)
	public static SubLObject defstruct_setter_forms(SubLObject type, SubLObject c_structure_tag, SubLObject predicate,
			SubLObject slots, SubLObject setters) {
		SubLObject forms = CommonSymbols.NIL;
		SubLObject cdotimes_end_var;
		SubLObject i;
		SubLObject slot;
		SubLObject setter;
		SubLObject index;
		for (cdotimes_end_var = Sequences.length(setters), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			slot = ConsesLow.nth(i, slots);
			setter = ConsesLow.nth(i, setters);
			index = CommonSymbols.NIL != c_structure_tag ? i : Numbers.add(i, CommonSymbols.TWO_INTEGER);
			forms = ConsesLow.cons(complex_special_forms.defstruct_setter_form(setter, index, predicate, type, slot),
					forms);
		}
		return Sequences.nreverse(forms);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 12565L)
	public static SubLObject defstruct_setters(SubLObject getters) {
		SubLObject setters = CommonSymbols.NIL;
		SubLObject cdolist_list_var = getters;
		SubLObject getter = CommonSymbols.NIL;
		getter = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			SubLObject setter = complex_special_forms.defstruct_setter(getter);
			setters = ConsesLow.cons(setter, setters);
			cdolist_list_var = cdolist_list_var.rest();
			getter = cdolist_list_var.first();
		}
		return Sequences.nreverse(setters);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11976L)
	public static SubLObject defstruct_slot_keywords(SubLObject slots) {
		SubLObject slot_keywords = CommonSymbols.NIL;
		SubLObject cdolist_list_var = slots;
		SubLObject slot = CommonSymbols.NIL;
		slot = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			SubLObject slot_keyword = Symbols.make_keyword(Symbols.symbol_name(slot));
			slot_keywords = ConsesLow.cons(slot_keyword, slot_keywords);
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return Sequences.nreverse(slot_keywords);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 11868L)
	public static SubLObject defstruct_type_var(SubLObject name) {
		return complex_special_forms.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str19$_DTP_,
				new SubLObject[] { Symbols.symbol_name(name), complex_special_forms.$str15$_ }));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 18642L)
	public static SubLObject defstruct_type_var_form(SubLObject type_var, SubLObject name, SubLObject c_structure_tag) {
		return ConsesLow.list(complex_special_forms.$sym66$DEFCONSTANT, type_var, CommonSymbols.NIL != c_structure_tag
				? c_structure_tag : ConsesLow.list(complex_special_forms.$sym50$QUOTE, name));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7690L)
	public static SubLObject dtp_var(SubLObject name) {
		SubLObject symbol = complex_special_forms
				.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str19$_DTP_,
						new SubLObject[] { Symbols.symbol_name(name), complex_special_forms.$str15$_ }));
		return symbol;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26660L)
	public static SubLObject finalize_call_profiling_table(SubLObject table) {
		SubLObject pairs = CommonSymbols.NIL;
		SubLObject function = CommonSymbols.NIL;
		SubLObject count = CommonSymbols.NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(table);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				function = Hashtables.getEntryKey(cdohash_entry);
				count = Hashtables.getEntryValue(cdohash_entry);
				pairs = ConsesLow.cons(ConsesLow.cons(function, count), pairs);
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		pairs = Sort.sort(pairs, Symbols.symbol_function(complex_special_forms.$sym111$_),
				Symbols.symbol_function(complex_special_forms.$sym112$CDR));
		return pairs;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7883L)
	public static SubLObject full_formal_parameter_list(SubLObject arglist) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = arglist;
		SubLObject arg = CommonSymbols.NIL;
		arg = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (arg.isCons())
				answer = ConsesLow.cons(arg.first(), answer);
			else if (arg != complex_special_forms.$sym20$_OPTIONAL)
				if (arg != complex_special_forms.$sym21$_REST)
					answer = ConsesLow.cons(arg, answer);
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		return Sequences.nreverse(answer);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13031L)
	public static SubLObject getter_package(SubLObject getter) {
		SubLObject v_package = Symbols.symbol_package(getter);
		if (!Packages.package_name(v_package).equal(complex_special_forms.$str41$CYC))
			v_package = Packages.find_package(complex_special_forms.$str42$SUBLISP);
		return v_package;
	}

	public static SubLObject init_complex_special_forms_file() {
		complex_special_forms.$polymorphic_type_hierarchy$ = SubLFiles.defparameter("*POLYMORPHIC-TYPE-HIERARCHY*",
				complex_special_forms.$list11);
		complex_special_forms.$default_generate_visit_functionP$ = SubLFiles
				.defparameter("*DEFAULT-GENERATE-VISIT-FUNCTION?*", CommonSymbols.T);
		complex_special_forms.$call_profiling_enabledP$ = SubLFiles.defvar("*CALL-PROFILING-ENABLED?*",
				CommonSymbols.NIL);
		complex_special_forms.$call_profiling_table$ = SubLFiles.defvar("*CALL-PROFILING-TABLE*", CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26565L)
	public static SubLObject initialize_call_profiling_table() {
		return Hashtables.make_hash_table(complex_special_forms.$int110$1000, Symbols.symbol_function(CommonSymbols.EQ),
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 1032L)
	public static SubLObject intern_accessor(SubLObject string) {
		return Packages.intern(string, CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7553L)
	public static SubLObject method_function_var(SubLObject name, SubLObject type) {
		return complex_special_forms.intern_accessor(
				Sequences.cconcatenate(Symbols.symbol_name(name), new SubLObject[] { complex_special_forms.$str17$_,
						Symbols.symbol_name(type), complex_special_forms.$str18$_METHOD }));
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 7293L)
	public static SubLObject method_table_var(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject symbol = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
		try {
			Packages.$package$.bind(complex_special_forms.accessor_package(name), thread);
			symbol = complex_special_forms.intern_accessor(Sequences.cconcatenate(complex_special_forms.$str15$_,
					new SubLObject[] { Symbols.symbol_name(name), complex_special_forms.$str16$_METHOD_TABLE_ }));
		} finally {
			Packages.$package$.rebind(_prev_bind_0, thread);
		}
		return symbol;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 26367L)
	public static SubLObject possibly_note_function_entry(SubLObject name) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(thread)
				&& CommonSymbols.NIL != complex_special_forms.$call_profiling_table$.getDynamicValue(thread))
			Hashtables
					.sethash(name,
							complex_special_forms.$call_profiling_table$
									.getDynamicValue(thread),
							Numbers.add(Hashtables.gethash_without_values(name,
									complex_special_forms.$call_profiling_table$.getDynamicValue(thread),
									CommonSymbols.ZERO_INTEGER), CommonSymbols.ONE_INTEGER));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 13331L)
	public static SubLObject setter_from_accessor(SubLObject accessor) {
		return complex_special_forms.defstruct_setter(accessor);
	}

	public static SubLObject setup_complex_special_forms_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/complex-special-forms.lisp", position = 25962L)
	public static SubLObject with_call_profiling(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject place = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, complex_special_forms.$list105);
		place = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.list(complex_special_forms.$sym6$CLET, complex_special_forms.$list106,
				ConsesLow.list(complex_special_forms.$sym107$CUNWIND_PROTECT,
						reader.bq_cons(complex_special_forms.$sym2$PROGN, ConsesLow.append(body, CommonSymbols.NIL)),
						ConsesLow.listS(complex_special_forms.$sym108$CSETF, place, complex_special_forms.$list109)));
	}

	public void declareFunctions() {
		complex_special_forms.declare_complex_special_forms_file();
	}

	public void initializeVariables() {
		complex_special_forms.init_complex_special_forms_file();
	}

	public void runTopLevelForms() {
		complex_special_forms.setup_complex_special_forms_file();
	}
}
