//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class reader extends SubLTranslatedFile {
	public static class $read_token_native extends SubLStructNative {
		private static SubLStructDeclNative structDecl;

		static {
			$read_token_native.structDecl = Structures.makeStructDeclNative($read_token_native.class,
					reader.$sym119$READ_TOKEN, reader.$sym120$READ_TOKEN_P, reader.$list121, reader.$list122,
					new String[] { "$pointer", "$buffer", "$escapes" }, reader.$list123, reader.$list124,
					reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
		}
		public SubLObject $pointer;
		public SubLObject $buffer;
		public SubLObject $escapes;

		public $read_token_native() {
			this.$pointer = CommonSymbols.NIL;
			this.$buffer = CommonSymbols.NIL;
			this.$escapes = CommonSymbols.NIL;
		}

		public SubLObject getField2() {
			return this.$pointer;
		}

		public SubLObject getField3() {
			return this.$buffer;
		}

		public SubLObject getField4() {
			return this.$escapes;
		}

		public SubLStructDecl getStructDecl() {
			return $read_token_native.structDecl;
		}

		public SubLObject setField2(SubLObject value) {
			return this.$pointer = value;
		}

		public SubLObject setField3(SubLObject value) {
			return this.$buffer = value;
		}

		public SubLObject setField4(SubLObject value) {
			return this.$escapes = value;
		}
	}

	public static class $read_token_p$UnaryFunction extends UnaryFunction {
		public $read_token_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READ-TOKEN-P"));
		}

		public SubLObject processItem(SubLObject arg1) {
			return reader.read_token_p(arg1);
		}
	}

	public static class $readtable_native extends SubLStructNative {
		private static SubLStructDeclNative structDecl;

		static {
			$readtable_native.structDecl = Structures.makeStructDeclNative($readtable_native.class,
					reader.$sym6$READTABLE, reader.$sym7$READTABLE_P, reader.$list8, reader.$list9,
					new String[] { "$case", "$character_syntax", "$single_byte_char_syntax", "$macro_functions",
							"$single_byte_macro_functions", "$constituent_traits", "$single_byte_constit_traits",
							"$dispatch_tables" },
					reader.$list10, reader.$list11, reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION);
		}
		public SubLObject $case;
		public SubLObject $character_syntax;
		public SubLObject $single_byte_char_syntax;
		public SubLObject $macro_functions;
		public SubLObject $single_byte_macro_functions;
		public SubLObject $constituent_traits;
		public SubLObject $single_byte_constit_traits;
		public SubLObject $dispatch_tables;

		public $readtable_native() {
			this.$case = CommonSymbols.NIL;
			this.$character_syntax = CommonSymbols.NIL;
			this.$single_byte_char_syntax = CommonSymbols.NIL;
			this.$macro_functions = CommonSymbols.NIL;
			this.$single_byte_macro_functions = CommonSymbols.NIL;
			this.$constituent_traits = CommonSymbols.NIL;
			this.$single_byte_constit_traits = CommonSymbols.NIL;
			this.$dispatch_tables = CommonSymbols.NIL;
		}

		public SubLObject getField2() {
			return this.$case;
		}

		public SubLObject getField3() {
			return this.$character_syntax;
		}

		public SubLObject getField4() {
			return this.$single_byte_char_syntax;
		}

		public SubLObject getField5() {
			return this.$macro_functions;
		}

		public SubLObject getField6() {
			return this.$single_byte_macro_functions;
		}

		public SubLObject getField7() {
			return this.$constituent_traits;
		}

		public SubLObject getField8() {
			return this.$single_byte_constit_traits;
		}

		public SubLObject getField9() {
			return this.$dispatch_tables;
		}

		public SubLStructDecl getStructDecl() {
			return $readtable_native.structDecl;
		}

		public SubLObject setField2(SubLObject value) {
			return this.$case = value;
		}

		public SubLObject setField3(SubLObject value) {
			return this.$character_syntax = value;
		}

		public SubLObject setField4(SubLObject value) {
			return this.$single_byte_char_syntax = value;
		}

		public SubLObject setField5(SubLObject value) {
			return this.$macro_functions = value;
		}

		public SubLObject setField6(SubLObject value) {
			return this.$single_byte_macro_functions = value;
		}

		public SubLObject setField7(SubLObject value) {
			return this.$constituent_traits = value;
		}

		public SubLObject setField8(SubLObject value) {
			return this.$single_byte_constit_traits = value;
		}

		public SubLObject setField9(SubLObject value) {
			return this.$dispatch_tables = value;
		}
	}

	public static class $readtable_p$UnaryFunction extends UnaryFunction {
		public $readtable_p$UnaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("READTABLE-P"));
		}

		public SubLObject processItem(SubLObject arg1) {
			return reader.readtable_p(arg1);
		}
	}

	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader";

	@SubL(source = "sublisp/reader.lisp", position = 4653L)
	public static SubLSymbol $whitespace_1_chars$;

	@SubL(source = "sublisp/reader.lisp", position = 5476L)
	public static SubLSymbol $read_base$;

	@SubL(source = "sublisp/reader.lisp", position = 5623L)
	public static SubLSymbol $read_default_float_format$;

	@SubL(source = "sublisp/reader.lisp", position = 5688L)
	public static SubLSymbol $read_eval$;

	@SubL(source = "sublisp/reader.lisp", position = 5725L)
	public static SubLSymbol $read_suppress$;

	@SubL(source = "sublisp/reader.lisp", position = 5768L)
	public static SubLSymbol $features$;

	@SubL(source = "sublisp/reader.lisp", position = 5840L)
	public static SubLSymbol $readtable$;

	@SubL(source = "sublisp/reader.lisp", position = 5862L)
	private static SubLSymbol $initial_table_size$;

	@SubL(source = "sublisp/reader.lisp", position = 6222L)
	public static SubLSymbol $single_byte_max_code$;

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLSymbol $dtp_readtable$;

	@SubL(source = "sublisp/reader.lisp", position = 7471L)
	private static SubLSymbol $alphabetic$;

	@SubL(source = "sublisp/reader.lisp", position = 7626L)
	private static SubLSymbol $digit$;

	@SubL(source = "sublisp/reader.lisp", position = 7671L)
	private static SubLSymbol $package_marker$;

	@SubL(source = "sublisp/reader.lisp", position = 7716L)
	private static SubLSymbol $plus_sign$;

	@SubL(source = "sublisp/reader.lisp", position = 7761L)
	private static SubLSymbol $minus_sign$;

	@SubL(source = "sublisp/reader.lisp", position = 7806L)
	private static SubLSymbol $dot$;

	@SubL(source = "sublisp/reader.lisp", position = 7851L)
	private static SubLSymbol $decimal_point$;

	@SubL(source = "sublisp/reader.lisp", position = 7896L)
	private static SubLSymbol $ratio_marker$;

	@SubL(source = "sublisp/reader.lisp", position = 7941L)
	private static SubLSymbol $exponent_marker$;

	@SubL(source = "sublisp/reader.lisp", position = 7986L)
	private static SubLSymbol $invalid$;

	@SubL(source = "sublisp/reader.lisp", position = 8844L)
	public static SubLSymbol $standard_readtable$;

	@SubL(source = "sublisp/reader.lisp", position = 22812L)
	private static SubLSymbol $throw_reader_error_p$;

	@SubL(source = "sublisp/reader.lisp", position = 23289L)
	private static SubLSymbol $throw_end_of_file_p$;

	@SubL(source = "sublisp/reader.lisp", position = 24300L)
	private static SubLSymbol $read_lookup_table$;

	@SubL(source = "sublisp/reader.lisp", position = 31841L)
	private static SubLSymbol $initial_token_size$;

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLSymbol $dtp_read_token$;

	@SubL(source = "sublisp/reader.lisp", position = 40995L)
	private static SubLSymbol $consing_dot$;

	@SubL(source = "sublisp/reader.lisp", position = 41041L)
	public static SubLSymbol $keyword_package$;

	@SubL(source = "sublisp/reader.lisp", position = 41097L)
	private static SubLSymbol $reading_list$;

	@SubL(source = "sublisp/reader.lisp", position = 41126L)
	private static SubLSymbol $reading_fake_list$;

	@SubL(source = "sublisp/reader.lisp", position = 54191L)
	private static SubLSymbol $right_paren$;

	@SubL(source = "sublisp/reader.lisp", position = 55891L)
	public static SubLSymbol $ignore_extra_right_parens$;

	@SubL(source = "sublisp/reader.lisp", position = 58427L)
	private static SubLSymbol $bq_comma$;

	@SubL(source = "sublisp/reader.lisp", position = 59980L)
	private static SubLSymbol $bq_atsign$;

	@SubL(source = "sublisp/reader.lisp", position = 60025L)
	private static SubLSymbol $bq_dot$;

	@SubL(source = "sublisp/reader.lisp", position = 60070L)
	private static SubLSymbol $bq_vector$;

	@SubL(source = "sublisp/reader.lisp", position = 63520L)
	private static SubLSymbol $backquote_depth$;

	private static SubLSymbol $sym0$CDO;

	private static SubLList $list1;

	private static SubLSymbol $sym2$DOUBLE_FLOAT;

	private static SubLList $list3;

	private static SubLInteger $int4$32;

	private static SubLInteger $int5$128;

	private static SubLSymbol $sym6$READTABLE;

	private static SubLSymbol $sym7$READTABLE_P;

	private static SubLList $list8;

	private static SubLList $list9;

	private static SubLList $list10;

	private static SubLList $list11;

	private static SubLSymbol $sym12$DEFAULT_STRUCT_PRINT_FUNCTION;

	private static SubLSymbol $sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE;

	private static SubLList $list14;

	private static SubLSymbol $sym15$READTABLE_CASE;

	private static SubLSymbol $sym16$_CSETF_READTABLE_CASE;

	private static SubLSymbol $sym17$READTABLE_CHARACTER_SYNTAX;

	private static SubLSymbol $sym18$_CSETF_READTABLE_CHARACTER_SYNTAX;

	private static SubLSymbol $sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX;

	private static SubLSymbol $sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX;

	private static SubLSymbol $sym21$READTABLE_MACRO_FUNCTIONS;

	private static SubLSymbol $sym22$_CSETF_READTABLE_MACRO_FUNCTIONS;

	private static SubLSymbol $sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS;

	private static SubLSymbol $sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS;

	private static SubLSymbol $sym25$READTABLE_CONSTITUENT_TRAITS;

	private static SubLSymbol $sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS;

	private static SubLSymbol $sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS;

	private static SubLSymbol $sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS;

	private static SubLSymbol $sym29$READTABLE_DISPATCH_TABLES;

	private static SubLSymbol $sym30$_CSETF_READTABLE_DISPATCH_TABLES;

	private static SubLSymbol $kw31$CASE;

	private static SubLSymbol $kw32$CHARACTER_SYNTAX;

	private static SubLSymbol $kw33$SINGLE_BYTE_CHAR_SYNTAX;

	private static SubLSymbol $kw34$MACRO_FUNCTIONS;

	private static SubLSymbol $kw35$SINGLE_BYTE_MACRO_FUNCTIONS;

	private static SubLSymbol $kw36$CONSTITUENT_TRAITS;

	private static SubLSymbol $kw37$SINGLE_BYTE_CONSTIT_TRAITS;

	private static SubLSymbol $kw38$DISPATCH_TABLES;

	private static SubLString $str39$Invalid_slot__S_for_construction_;

	private static SubLSymbol $kw40$BEGIN;

	private static SubLSymbol $sym41$MAKE_READTABLE;

	private static SubLSymbol $kw42$SLOT;

	private static SubLSymbol $kw43$END;

	private static SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD;

	private static SubLInteger $int45$64;

	private static SubLInteger $int46$256;

	private static SubLInteger $int47$512;

	private static SubLSymbol $kw48$UPCASE;

	private static SubLSymbol $kw49$CONSTITUENT;

	private static SubLSymbol $sym50$CONSTITUENT_RMF;

	private static SubLList $list51;

	private static SubLSymbol $sym52$_READTABLE_;

	private static SubLSymbol $sym53$FIF;

	private static SubLSymbol $sym54$SINGLE_BYTE_P;

	private static SubLSymbol $sym55$AREF;

	private static SubLSymbol $sym56$CHAR_CODE;

	private static SubLSymbol $sym57$GETHASH;

	private static SubLList $list58;

	private static SubLSymbol $kw59$INVALID;

	private static SubLSymbol $kw60$TERMINATING_MACRO;

	private static SubLSymbol $kw61$NON_TERMINATING_MACRO;

	private static SubLSymbol $kw62$MULTIPLE_ESCAPE;

	private static SubLSymbol $kw63$SINGLE_ESCAPE;

	private static SubLSymbol $kw64$WHITESPACE;

	private static SubLList $list65;

	private static SubLSymbol $sym66$PLUSP;

	private static SubLSymbol $sym67$LOGAND;

	private static SubLSymbol $sym68$CHARACTER_TRAITS;

	private static SubLList $list69;

	private static SubLSymbol $sym70$CAR;

	private static SubLSymbol $sym71$DISPATCHING_RMF;

	private static SubLString $str72$Attempt_to_make_decimal_digit__A_;

	private static SubLString $str73$_A_is_not_a_dispatching_macro_cha;

	private static SubLSymbol $sym74$WHITESPACE_RMF;

	private static SubLSymbol $sym75$SINGLE_ESCAPE_RMF;

	private static SubLSymbol $sym76$MULTIPLE_ESCAPE_RMF;

	private static SubLSymbol $sym77$LEFT_PAREN_RMF;

	private static SubLSymbol $sym78$RIGHT_PAREN_RMF;

	private static SubLSymbol $sym79$SINGLE_QUOTE_RMF;

	private static SubLSymbol $sym80$SEMICOLON_RMF;

	private static SubLSymbol $sym81$DOUBLE_QUOTE_RMF;

	private static SubLSymbol $sym82$BACKQUOTE_RMF;

	private static SubLSymbol $sym83$COMMA_RMF;

	private static SubLSymbol $sym84$SHARPSIGN_BACKSLASH_RMF;

	private static SubLSymbol $sym85$SHARPSIGN_SINGLE_QUOTE_RMF;

	private static SubLSymbol $sym86$SHARPSIGN_LEFT_PAREN_RMF;

	private static SubLSymbol $sym87$SHARPSIGN_ASTERISK_RMF;

	private static SubLSymbol $sym88$SHARPSIGN_COLON_RMF;

	private static SubLSymbol $sym89$SHARPSIGN_DOT_RMF;

	private static SubLSymbol $sym90$SHARPSIGN_B_RMF;

	private static SubLSymbol $sym91$SHARPSIGN_O_RMF;

	private static SubLSymbol $sym92$SHARPSIGN_X_RMF;

	private static SubLSymbol $sym93$SHARPSIGN_R_RMF;

	private static SubLSymbol $sym94$SHARPSIGN_C_RMF;

	private static SubLSymbol $sym95$SHARPSIGN_A_RMF;

	private static SubLSymbol $sym96$SHARPSIGN_S_RMF;

	private static SubLSymbol $sym97$SHARPSIGN_P_RMF;

	private static SubLSymbol $sym98$SHARPSIGN_CAPITAL_G_RMF;

	private static SubLSymbol $sym99$SHARPSIGN_EQUALS_RMF;

	private static SubLSymbol $sym100$SHARPSIGN_SHARPSIGN_RMF;

	private static SubLSymbol $sym101$SHARPSIGN_PLUS_RMF;

	private static SubLSymbol $sym102$SHARPSIGN_MINUS_RMF;

	private static SubLSymbol $sym103$SHARPSIGN_VERTICAL_BAR_RMF;

	private static SubLList $list104;

	private static SubLList $list105;

	private static SubLSymbol $sym106$READER_ERROR;

	private static SubLSymbol $sym107$ERROR;

	private static SubLSymbol $sym108$END_OF_FILE;

	private static SubLString $str109$End_of_file_on_stream__S_;

	private static SubLString $str110$_S_is_invalid_token_syntax_;

	private static SubLString $str111$The__A_reader_macro_is_not_implem;

	private static SubLString $str112$The__A_reader_macro_does_not_take;

	private static SubLString $str113$Illegal_argument__D_for_the__A_re;

	private static SubLSymbol $sym114$CLET;

	private static SubLList $list115;
	private static SubLSymbol $sym116$PROGN;
	private static SubLSymbol $kw117$EOF;
	private static SubLSymbol $kw118$ERROR;
	private static SubLSymbol $sym119$READ_TOKEN;
	private static SubLSymbol $sym120$READ_TOKEN_P;
	private static SubLList $list121;
	private static SubLList $list122;
	private static SubLList $list123;
	private static SubLList $list124;
	private static SubLSymbol $sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE;
	private static SubLList $list126;
	private static SubLSymbol $sym127$READ_TOKEN_POINTER;
	private static SubLSymbol $sym128$_CSETF_READ_TOKEN_POINTER;
	private static SubLSymbol $sym129$READ_TOKEN_BUFFER;
	private static SubLSymbol $sym130$_CSETF_READ_TOKEN_BUFFER;
	private static SubLSymbol $sym131$READ_TOKEN_ESCAPES;
	private static SubLSymbol $sym132$_CSETF_READ_TOKEN_ESCAPES;
	private static SubLSymbol $kw133$POINTER;
	private static SubLSymbol $kw134$BUFFER;
	private static SubLSymbol $kw135$ESCAPES;
	private static SubLSymbol $sym136$MAKE_READ_TOKEN;
	private static SubLSymbol $sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD;
	private static SubLList $list138;
	private static SubLList $list139;
	private static SubLList $list140;
	private static SubLList $list141;
	private static SubLList $list142;
	private static SubLString $str143$_A_is_an_invalid_character_;
	private static SubLString $str144$Fell_through_character_syntax_on_;
	private static SubLSymbol $kw145$DOWNCASE;
	private static SubLString $str146$_S_is_not_a_known_package_;
	private static SubLSymbol $kw147$PRESERVE;
	private static SubLSymbol $kw148$INVERT;
	private static SubLSymbol $sym149$CONSING_DOT;
	private static SubLString $str150$KEYWORD;
	private static SubLSymbol $kw151$EXTERNAL;
	private static SubLString $str152$_S_is_not_external_in__S_;
	private static SubLFloat $float153$0_0;
	private static SubLSymbol $kw154$INITIAL;
	private static SubLSymbol $kw155$DOT1;
	private static SubLSymbol $kw156$SIGN;
	private static SubLSymbol $kw157$DECIMALS;
	private static SubLSymbol $kw158$DIGITS;
	private static SubLSymbol $kw159$EXPONENT;
	private static SubLSymbol $kw160$DOT2;
	private static SubLSymbol $kw161$SLASH;
	private static SubLSymbol $kw162$DENOMINATOR;
	private static SubLSymbol $kw163$FRACTION;
	private static SubLSymbol $kw164$DECIMALS2;
	private static SubLSymbol $kw165$EXPONENT_SIGN;
	private static SubLSymbol $kw166$EXPONENT_VALUE;
	private static SubLString $str167$Can_t_happen_;
	private static SubLSymbol $kw168$DIGIT;
	private static SubLString $str169$_S_does_not_contain_an_integer_;
	private static SubLSymbol $kw170$TRAILING_WHITESPACE;
	private static SubLString $str171$The__S_reader_macro_does_not_take;
	private static SubLString $str172$The__S_reader_macro_expected_a_st;
	private static SubLString $str173$The__S_reader_macro_could_not_int;
	private static SubLSymbol $sym174$RIGHT_PAREN;
	private static SubLString $str175$Nothing_before_consing_dot_;
	private static SubLSymbol $kw176$LIST;
	private static SubLSymbol $kw177$CONSING_DOT;
	private static SubLString $str178$Nothing_after_consing_dot_;
	private static SubLString $str179$Too_many_consing_dots_;
	private static SubLSymbol $kw180$AFTER_CONSING_DOT;
	private static SubLString $str181$Too_many_objects_after_consing_do;
	private static SubLString $str182$Ignoring_unmatched_close_parenthe;
	private static SubLString $str183$Unmatched__A_;
	private static SubLSymbol $sym184$QUOTE;
	private static SubLSymbol $kw185$NORMAL;
	private static SubLSymbol $kw186$ESCAPE;
	private static SubLSymbol $sym187$LIST;
	private static SubLSymbol $sym188$LIST_;
	private static SubLSymbol $sym189$APPEND;
	private static SubLSymbol $sym190$NCONC;
	private static SubLSymbol $sym191$VECTOR;
	private static SubLSymbol $sym192$BQ_VECTOR;
	private static SubLSymbol $sym193$BQ_APPEND;
	private static SubLString $str194$_;
	private static SubLString $str195$_;
	private static SubLString $str196$_;
	private static SubLString $str197$BQ_VECTOR;
	private static SubLString $str198$_A_after_dot_in__S_;
	private static SubLList $list199;
	private static SubLList $list200;
	private static SubLSymbol $sym201$CONS;
	private static SubLSymbol $sym202$BQ_LIST_;
	private static SubLSymbol $sym203$BQ_CONS;
	private static SubLList $list204;
	private static SubLString $str205$_A_read_after_backquote_in__S_;
	private static SubLString $str206$_S_read_outside_a_backquote_;
	private static SubLString $str207$Undefined_reader_macro__A_A_;
	private static SubLString $str208$_S_is_not_the_name_of_a_character;
	private static SubLSymbol $sym209$FUNCTION;
	private static SubLString $str210$Attempt_the_use_the__A_reader_mac;
	private static SubLSymbol $sym211$_READ_EVAL_;
	private static SubLInteger $int212$36;
	private static SubLString $str213$The_form_after__A_reader_macro_wa;
	private static SubLString $str214$Label__S_appears_more_than_once_;
	private static SubLString $str215$Label__S_has_not_been_seen_;
	private static SubLSymbol $kw216$NOT;
	private static SubLString $str217$Bogus_feature_expression__S_;
	private static SubLSymbol $kw218$AND;
	private static SubLSymbol $kw219$OR;
	private static SubLString $str220$Unknown_feature_operator__S_;
	private static SubLSymbol $kw221$HASH;
	private static SubLSymbol $kw222$VERTICAL_BAR;
	static {
		reader.me = new reader();
		reader.$whitespace_1_chars$ = null;
		reader.$read_base$ = null;
		reader.$read_default_float_format$ = null;
		reader.$read_eval$ = null;
		reader.$read_suppress$ = null;
		reader.$features$ = null;
		reader.$readtable$ = null;
		reader.$initial_table_size$ = null;
		reader.$single_byte_max_code$ = null;
		reader.$dtp_readtable$ = null;
		reader.$alphabetic$ = null;
		reader.$digit$ = null;
		reader.$package_marker$ = null;
		reader.$plus_sign$ = null;
		reader.$minus_sign$ = null;
		reader.$dot$ = null;
		reader.$decimal_point$ = null;
		reader.$ratio_marker$ = null;
		reader.$exponent_marker$ = null;
		reader.$invalid$ = null;
		reader.$standard_readtable$ = null;
		reader.$throw_reader_error_p$ = null;
		reader.$throw_end_of_file_p$ = null;
		reader.$read_lookup_table$ = null;
		reader.$initial_token_size$ = null;
		reader.$dtp_read_token$ = null;
		reader.$consing_dot$ = null;
		reader.$keyword_package$ = null;
		reader.$reading_list$ = null;
		reader.$reading_fake_list$ = null;
		reader.$right_paren$ = null;
		reader.$ignore_extra_right_parens$ = null;
		reader.$bq_comma$ = null;
		reader.$bq_atsign$ = null;
		reader.$bq_dot$ = null;
		reader.$bq_vector$ = null;
		reader.$backquote_depth$ = null;
		reader.$sym0$CDO = SubLObjectFactory.makeSymbol("CDO");
		reader.$list1 = ConsesLow.list(CommonSymbols.NIL);
		reader.$sym2$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
		reader.$list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("SL2JAVA"));
		reader.$int4$32 = SubLObjectFactory.makeInteger(32);
		reader.$int5$128 = SubLObjectFactory.makeInteger(128);
		reader.$sym6$READTABLE = SubLObjectFactory.makeSymbol("READTABLE");
		reader.$sym7$READTABLE_P = SubLObjectFactory.makeSymbol("READTABLE-P");
		reader.$list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("CASE"),
				SubLObjectFactory.makeSymbol("CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("DISPATCH-TABLES"));
		reader.$list9 = ConsesLow.list(SubLObjectFactory.makeKeyword("CASE"),
				SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeKeyword("DISPATCH-TABLES"));
		reader.$list10 = ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE-CASE"),
				SubLObjectFactory.makeSymbol("READTABLE-CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("READTABLE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("READTABLE-CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("READTABLE-DISPATCH-TABLES"));
		reader.$list11 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"),
				SubLObjectFactory.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES"));
		reader.$sym12$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		reader.$sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeSymbol("READTABLE-PRINT-FUNCTION-TRAMPOLINE");
		reader.$list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"),
				SubLObjectFactory.makeSymbol("READTABLE-P"));
		reader.$sym15$READTABLE_CASE = SubLObjectFactory.makeSymbol("READTABLE-CASE");
		reader.$sym16$_CSETF_READTABLE_CASE = SubLObjectFactory.makeSymbol("_CSETF-READTABLE-CASE");
		reader.$sym17$READTABLE_CHARACTER_SYNTAX = SubLObjectFactory.makeSymbol("READTABLE-CHARACTER-SYNTAX");
		reader.$sym18$_CSETF_READTABLE_CHARACTER_SYNTAX = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX");
		reader.$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory
				.makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
		reader.$sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX");
		reader.$sym21$READTABLE_MACRO_FUNCTIONS = SubLObjectFactory.makeSymbol("READTABLE-MACRO-FUNCTIONS");
		reader.$sym22$_CSETF_READTABLE_MACRO_FUNCTIONS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS");
		reader.$sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
				.makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
		reader.$sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");
		reader.$sym25$READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory.makeSymbol("READTABLE-CONSTITUENT-TRAITS");
		reader.$sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS");
		reader.$sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
				.makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
		reader.$sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");
		reader.$sym29$READTABLE_DISPATCH_TABLES = SubLObjectFactory.makeSymbol("READTABLE-DISPATCH-TABLES");
		reader.$sym30$_CSETF_READTABLE_DISPATCH_TABLES = SubLObjectFactory
				.makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES");
		reader.$kw31$CASE = SubLObjectFactory.makeKeyword("CASE");
		reader.$kw32$CHARACTER_SYNTAX = SubLObjectFactory.makeKeyword("CHARACTER-SYNTAX");
		reader.$kw33$SINGLE_BYTE_CHAR_SYNTAX = SubLObjectFactory.makeKeyword("SINGLE-BYTE-CHAR-SYNTAX");
		reader.$kw34$MACRO_FUNCTIONS = SubLObjectFactory.makeKeyword("MACRO-FUNCTIONS");
		reader.$kw35$SINGLE_BYTE_MACRO_FUNCTIONS = SubLObjectFactory.makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS");
		reader.$kw36$CONSTITUENT_TRAITS = SubLObjectFactory.makeKeyword("CONSTITUENT-TRAITS");
		reader.$kw37$SINGLE_BYTE_CONSTIT_TRAITS = SubLObjectFactory.makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS");
		reader.$kw38$DISPATCH_TABLES = SubLObjectFactory.makeKeyword("DISPATCH-TABLES");
		reader.$str39$Invalid_slot__S_for_construction_ = SubLObjectFactory
				.makeString("Invalid slot ~S for construction function");
		reader.$kw40$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
		reader.$sym41$MAKE_READTABLE = SubLObjectFactory.makeSymbol("MAKE-READTABLE");
		reader.$kw42$SLOT = SubLObjectFactory.makeKeyword("SLOT");
		reader.$kw43$END = SubLObjectFactory.makeKeyword("END");
		reader.$sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD");
		reader.$int45$64 = SubLObjectFactory.makeInteger(64);
		reader.$int46$256 = SubLObjectFactory.makeInteger(256);
		reader.$int47$512 = SubLObjectFactory.makeInteger(512);
		reader.$kw48$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
		reader.$kw49$CONSTITUENT = SubLObjectFactory.makeKeyword("CONSTITUENT");
		reader.$sym50$CONSTITUENT_RMF = SubLObjectFactory.makeSymbol("CONSTITUENT-RMF");
		reader.$list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
						.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));
		reader.$sym52$_READTABLE_ = SubLObjectFactory.makeSymbol("*READTABLE*");
		reader.$sym53$FIF = SubLObjectFactory.makeSymbol("FIF");
		reader.$sym54$SINGLE_BYTE_P = SubLObjectFactory.makeSymbol("SINGLE-BYTE-P");
		reader.$sym55$AREF = SubLObjectFactory.makeSymbol("AREF");
		reader.$sym56$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");
		reader.$sym57$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");
		reader.$list58 = ConsesLow.list(SubLObjectFactory.makeKeyword("CONSTITUENT"));
		reader.$kw59$INVALID = SubLObjectFactory.makeKeyword("INVALID");
		reader.$kw60$TERMINATING_MACRO = SubLObjectFactory.makeKeyword("TERMINATING-MACRO");
		reader.$kw61$NON_TERMINATING_MACRO = SubLObjectFactory.makeKeyword("NON-TERMINATING-MACRO");
		reader.$kw62$MULTIPLE_ESCAPE = SubLObjectFactory.makeKeyword("MULTIPLE-ESCAPE");
		reader.$kw63$SINGLE_ESCAPE = SubLObjectFactory.makeKeyword("SINGLE-ESCAPE");
		reader.$kw64$WHITESPACE = SubLObjectFactory.makeKeyword("WHITESPACE");
		reader.$list65 = ConsesLow.list(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("TRAIT"),
				SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READTABLE"), ConsesLow
						.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*READTABLE*"))));
		reader.$sym66$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
		reader.$sym67$LOGAND = SubLObjectFactory.makeSymbol("LOGAND");
		reader.$sym68$CHARACTER_TRAITS = SubLObjectFactory.makeSymbol("CHARACTER-TRAITS");
		reader.$list69 = ConsesLow.cons(SubLObjectFactory.makeSymbol("CH"), SubLObjectFactory.makeSymbol("TABLE"));
		reader.$sym70$CAR = SubLObjectFactory.makeSymbol("CAR");
		reader.$sym71$DISPATCHING_RMF = SubLObjectFactory.makeSymbol("DISPATCHING-RMF");
		reader.$str72$Attempt_to_make_decimal_digit__A_ = SubLObjectFactory
				.makeString("Attempt to make decimal digit ~A be a dispatching macro character.");
		reader.$str73$_A_is_not_a_dispatching_macro_cha = SubLObjectFactory
				.makeString("~A is not a dispatching macro character in ~S.");
		reader.$sym74$WHITESPACE_RMF = SubLObjectFactory.makeSymbol("WHITESPACE-RMF");
		reader.$sym75$SINGLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("SINGLE-ESCAPE-RMF");
		reader.$sym76$MULTIPLE_ESCAPE_RMF = SubLObjectFactory.makeSymbol("MULTIPLE-ESCAPE-RMF");
		reader.$sym77$LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("LEFT-PAREN-RMF");
		reader.$sym78$RIGHT_PAREN_RMF = SubLObjectFactory.makeSymbol("RIGHT-PAREN-RMF");
		reader.$sym79$SINGLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("SINGLE-QUOTE-RMF");
		reader.$sym80$SEMICOLON_RMF = SubLObjectFactory.makeSymbol("SEMICOLON-RMF");
		reader.$sym81$DOUBLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("DOUBLE-QUOTE-RMF");
		reader.$sym82$BACKQUOTE_RMF = SubLObjectFactory.makeSymbol("BACKQUOTE-RMF");
		reader.$sym83$COMMA_RMF = SubLObjectFactory.makeSymbol("COMMA-RMF");
		reader.$sym84$SHARPSIGN_BACKSLASH_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-BACKSLASH-RMF");
		reader.$sym85$SHARPSIGN_SINGLE_QUOTE_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-SINGLE-QUOTE-RMF");
		reader.$sym86$SHARPSIGN_LEFT_PAREN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-LEFT-PAREN-RMF");
		reader.$sym87$SHARPSIGN_ASTERISK_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-ASTERISK-RMF");
		reader.$sym88$SHARPSIGN_COLON_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-COLON-RMF");
		reader.$sym89$SHARPSIGN_DOT_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-DOT-RMF");
		reader.$sym90$SHARPSIGN_B_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-B-RMF");
		reader.$sym91$SHARPSIGN_O_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-O-RMF");
		reader.$sym92$SHARPSIGN_X_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-X-RMF");
		reader.$sym93$SHARPSIGN_R_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-R-RMF");
		reader.$sym94$SHARPSIGN_C_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-C-RMF");
		reader.$sym95$SHARPSIGN_A_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-A-RMF");
		reader.$sym96$SHARPSIGN_S_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-S-RMF");
		reader.$sym97$SHARPSIGN_P_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-P-RMF");
		reader.$sym98$SHARPSIGN_CAPITAL_G_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-CAPITAL-G-RMF");
		reader.$sym99$SHARPSIGN_EQUALS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-EQUALS-RMF");
		reader.$sym100$SHARPSIGN_SHARPSIGN_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-SHARPSIGN-RMF");
		reader.$sym101$SHARPSIGN_PLUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-PLUS-RMF");
		reader.$sym102$SHARPSIGN_MINUS_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-MINUS-RMF");
		reader.$sym103$SHARPSIGN_VERTICAL_BAR_RMF = SubLObjectFactory.makeSymbol("SHARPSIGN-VERTICAL-BAR-RMF");
		reader.$list104 = ConsesLow.list(Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline,
				Characters.CHAR_newline, Characters.CHAR_page, Characters.CHAR_return, Characters.CHAR_space,
				Characters.CHAR_rubout);
		reader.$list105 = ConsesLow.list(new SubLObject[] { Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2,
				Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7,
				Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c,
				Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h,
				Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m,
				Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r,
				Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w,
				Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_A, Characters.CHAR_B,
				Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F, Characters.CHAR_G,
				Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L,
				Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P, Characters.CHAR_Q,
				Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V,
				Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z });
		reader.$sym106$READER_ERROR = SubLObjectFactory.makeSymbol("READER-ERROR");
		reader.$sym107$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		reader.$sym108$END_OF_FILE = SubLObjectFactory.makeSymbol("END-OF-FILE");
		reader.$str109$End_of_file_on_stream__S_ = SubLObjectFactory.makeString("End of file on stream ~S.");
		reader.$str110$_S_is_invalid_token_syntax_ = SubLObjectFactory.makeString("~S is invalid token syntax.");
		reader.$str111$The__A_reader_macro_is_not_implem = SubLObjectFactory
				.makeString("The ~A reader macro is not implemented.");
		reader.$str112$The__A_reader_macro_does_not_take = SubLObjectFactory
				.makeString("The ~A reader macro does not take an argument.");
		reader.$str113$Illegal_argument__D_for_the__A_re = SubLObjectFactory
				.makeString("Illegal argument ~D for the ~A reader macro.");
		reader.$sym114$CLET = SubLObjectFactory.makeSymbol("CLET");
		reader.$list115 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-BASE*"), CommonSymbols.TEN_INTEGER),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"),
								SubLObjectFactory.makeSymbol("SINGLE-FLOAT"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-EVAL*"), CommonSymbols.T),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READ-SUPPRESS*"), CommonSymbols.NIL),
				ConsesLow.list(SubLObjectFactory.makeSymbol("*READTABLE*"),
						SubLObjectFactory.makeSymbol("*STANDARD-READTABLE*")));
		reader.$sym116$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		reader.$kw117$EOF = SubLObjectFactory.makeKeyword("EOF");
		reader.$kw118$ERROR = SubLObjectFactory.makeKeyword("ERROR");
		reader.$sym119$READ_TOKEN = SubLObjectFactory.makeSymbol("READ-TOKEN");
		reader.$sym120$READ_TOKEN_P = SubLObjectFactory.makeSymbol("READ-TOKEN-P");
		reader.$list121 = ConsesLow.list(SubLObjectFactory.makeSymbol("POINTER"),
				SubLObjectFactory.makeSymbol("BUFFER"), SubLObjectFactory.makeSymbol("ESCAPES"));
		reader.$list122 = ConsesLow.list(SubLObjectFactory.makeKeyword("POINTER"),
				SubLObjectFactory.makeKeyword("BUFFER"), SubLObjectFactory.makeKeyword("ESCAPES"));
		reader.$list123 = ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"),
				SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"), SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"));
		reader.$list124 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-POINTER"),
				SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-BUFFER"),
				SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-ESCAPES"));
		reader.$sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory
				.makeSymbol("READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE");
		reader.$list126 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"),
				SubLObjectFactory.makeSymbol("READ-TOKEN-P"));
		reader.$sym127$READ_TOKEN_POINTER = SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER");
		reader.$sym128$_CSETF_READ_TOKEN_POINTER = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-POINTER");
		reader.$sym129$READ_TOKEN_BUFFER = SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER");
		reader.$sym130$_CSETF_READ_TOKEN_BUFFER = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-BUFFER");
		reader.$sym131$READ_TOKEN_ESCAPES = SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES");
		reader.$sym132$_CSETF_READ_TOKEN_ESCAPES = SubLObjectFactory.makeSymbol("_CSETF-READ-TOKEN-ESCAPES");
		reader.$kw133$POINTER = SubLObjectFactory.makeKeyword("POINTER");
		reader.$kw134$BUFFER = SubLObjectFactory.makeKeyword("BUFFER");
		reader.$kw135$ESCAPES = SubLObjectFactory.makeKeyword("ESCAPES");
		reader.$sym136$MAKE_READ_TOKEN = SubLObjectFactory.makeSymbol("MAKE-READ-TOKEN");
		reader.$sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD = SubLObjectFactory
				.makeSymbol("VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD");
		reader.$list138 = ConsesLow.list(SubLObjectFactory.makeSymbol("TOKEN"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		reader.$list139 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-READ-TOKEN")));
		reader.$list140 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow
				.list(SubLObjectFactory.makeSymbol("READ-TOKEN-POINTER"), SubLObjectFactory.makeSymbol("TOKEN")),
				CommonSymbols.ZERO_INTEGER);
		reader.$list141 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-BUFFER"),
						SubLObjectFactory.makeSymbol("TOKEN")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-STRING"),
						SubLObjectFactory.makeSymbol("*INITIAL-TOKEN-SIZE*")));
		reader.$list142 = ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("READ-TOKEN-ESCAPES"),
						SubLObjectFactory.makeSymbol("TOKEN")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), CommonSymbols.NIL));
		reader.$str143$_A_is_an_invalid_character_ = SubLObjectFactory.makeString("~A is an invalid character.");
		reader.$str144$Fell_through_character_syntax_on_ = SubLObjectFactory
				.makeString("Fell through character syntax on ~A.");
		reader.$kw145$DOWNCASE = SubLObjectFactory.makeKeyword("DOWNCASE");
		reader.$str146$_S_is_not_a_known_package_ = SubLObjectFactory.makeString("~S is not a known package.");
		reader.$kw147$PRESERVE = SubLObjectFactory.makeKeyword("PRESERVE");
		reader.$kw148$INVERT = SubLObjectFactory.makeKeyword("INVERT");
		reader.$sym149$CONSING_DOT = SubLObjectFactory.makeUninternedSymbol("CONSING-DOT");
		reader.$str150$KEYWORD = SubLObjectFactory.makeString("KEYWORD");
		reader.$kw151$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
		reader.$str152$_S_is_not_external_in__S_ = SubLObjectFactory.makeString("~S is not external in ~S.");
		reader.$float153$0_0 = SubLObjectFactory.makeDouble(0.0);
		reader.$kw154$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
		reader.$kw155$DOT1 = SubLObjectFactory.makeKeyword("DOT1");
		reader.$kw156$SIGN = SubLObjectFactory.makeKeyword("SIGN");
		reader.$kw157$DECIMALS = SubLObjectFactory.makeKeyword("DECIMALS");
		reader.$kw158$DIGITS = SubLObjectFactory.makeKeyword("DIGITS");
		reader.$kw159$EXPONENT = SubLObjectFactory.makeKeyword("EXPONENT");
		reader.$kw160$DOT2 = SubLObjectFactory.makeKeyword("DOT2");
		reader.$kw161$SLASH = SubLObjectFactory.makeKeyword("SLASH");
		reader.$kw162$DENOMINATOR = SubLObjectFactory.makeKeyword("DENOMINATOR");
		reader.$kw163$FRACTION = SubLObjectFactory.makeKeyword("FRACTION");
		reader.$kw164$DECIMALS2 = SubLObjectFactory.makeKeyword("DECIMALS2");
		reader.$kw165$EXPONENT_SIGN = SubLObjectFactory.makeKeyword("EXPONENT-SIGN");
		reader.$kw166$EXPONENT_VALUE = SubLObjectFactory.makeKeyword("EXPONENT-VALUE");
		reader.$str167$Can_t_happen_ = SubLObjectFactory.makeString("Can't happen.");
		reader.$kw168$DIGIT = SubLObjectFactory.makeKeyword("DIGIT");
		reader.$str169$_S_does_not_contain_an_integer_ = SubLObjectFactory
				.makeString("~S does not contain an integer.");
		reader.$kw170$TRAILING_WHITESPACE = SubLObjectFactory.makeKeyword("TRAILING-WHITESPACE");
		reader.$str171$The__S_reader_macro_does_not_take = SubLObjectFactory
				.makeString("The ~S reader macro does not take an argument.");
		reader.$str172$The__S_reader_macro_expected_a_st = SubLObjectFactory
				.makeString("The ~S reader macro expected a string.");
		reader.$str173$The__S_reader_macro_could_not_int = SubLObjectFactory
				.makeString("The ~S reader macro could not interpret ~S as a GUID string.");
		reader.$sym174$RIGHT_PAREN = SubLObjectFactory.makeUninternedSymbol("RIGHT-PAREN");
		reader.$str175$Nothing_before_consing_dot_ = SubLObjectFactory.makeString("Nothing before consing dot.");
		reader.$kw176$LIST = SubLObjectFactory.makeKeyword("LIST");
		reader.$kw177$CONSING_DOT = SubLObjectFactory.makeKeyword("CONSING-DOT");
		reader.$str178$Nothing_after_consing_dot_ = SubLObjectFactory.makeString("Nothing after consing dot.");
		reader.$str179$Too_many_consing_dots_ = SubLObjectFactory.makeString("Too many consing dots.");
		reader.$kw180$AFTER_CONSING_DOT = SubLObjectFactory.makeKeyword("AFTER-CONSING-DOT");
		reader.$str181$Too_many_objects_after_consing_do = SubLObjectFactory
				.makeString("Too many objects after consing dot.");
		reader.$str182$Ignoring_unmatched_close_parenthe = SubLObjectFactory
				.makeString("Ignoring unmatched close parenthesis.");
		reader.$str183$Unmatched__A_ = SubLObjectFactory.makeString("Unmatched ~A.");
		reader.$sym184$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		reader.$kw185$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
		reader.$kw186$ESCAPE = SubLObjectFactory.makeKeyword("ESCAPE");
		reader.$sym187$LIST = SubLObjectFactory.makeSymbol("LIST");
		reader.$sym188$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
		reader.$sym189$APPEND = SubLObjectFactory.makeSymbol("APPEND");
		reader.$sym190$NCONC = SubLObjectFactory.makeSymbol("NCONC");
		reader.$sym191$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
		reader.$sym192$BQ_VECTOR = SubLObjectFactory.makeSymbol("BQ-VECTOR");
		reader.$sym193$BQ_APPEND = SubLObjectFactory.makeSymbol("BQ-APPEND");
		reader.$str194$_ = SubLObjectFactory.makeString(",");
		reader.$str195$_ = SubLObjectFactory.makeString("@");
		reader.$str196$_ = SubLObjectFactory.makeString(".");
		reader.$str197$BQ_VECTOR = SubLObjectFactory.makeString("BQ-VECTOR");
		reader.$str198$_A_after_dot_in__S_ = SubLObjectFactory.makeString("~A after dot in ~S.");
		reader.$list199 = ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), CommonSymbols.T, CommonSymbols.NIL);
		reader.$list200 = ConsesLow.list(SubLObjectFactory.makeSymbol("APPEND"), SubLObjectFactory.makeSymbol("LIST"),
				SubLObjectFactory.makeSymbol("LIST*"), SubLObjectFactory.makeSymbol("NCONC"));
		reader.$sym201$CONS = SubLObjectFactory.makeSymbol("CONS");
		reader.$sym202$BQ_LIST_ = SubLObjectFactory.makeSymbol("BQ-LIST*");
		reader.$sym203$BQ_CONS = SubLObjectFactory.makeSymbol("BQ-CONS");
		reader.$list204 = ConsesLow.list(
				ConsesLow.cons(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("BQ-CONS")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeSymbol("BQ-LIST")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("APPEND"), SubLObjectFactory.makeSymbol("BQ-APPEND")),
				ConsesLow.cons(SubLObjectFactory.makeSymbol("NCONC"), SubLObjectFactory.makeSymbol("BQ-NCONC")));
		reader.$str205$_A_read_after_backquote_in__S_ = SubLObjectFactory.makeString("~A read after backquote in ~S.");
		reader.$str206$_S_read_outside_a_backquote_ = SubLObjectFactory.makeString("~S read outside a backquote.");
		reader.$str207$Undefined_reader_macro__A_A_ = SubLObjectFactory.makeString("Undefined reader macro ~A~A.");
		reader.$str208$_S_is_not_the_name_of_a_character = SubLObjectFactory
				.makeString("~S is not the name of a character.");
		reader.$sym209$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
		reader.$str210$Attempt_the_use_the__A_reader_mac = SubLObjectFactory
				.makeString("Attempt the use the ~A reader macro when ~S is ~S.");
		reader.$sym211$_READ_EVAL_ = SubLObjectFactory.makeSymbol("*READ-EVAL*");
		reader.$int212$36 = SubLObjectFactory.makeInteger(36);
		reader.$str213$The_form_after__A_reader_macro_wa = SubLObjectFactory
				.makeString("The form after ~A reader macro was not a list.");
		reader.$str214$Label__S_appears_more_than_once_ = SubLObjectFactory
				.makeString("Label ~S appears more than once.");
		reader.$str215$Label__S_has_not_been_seen_ = SubLObjectFactory.makeString("Label ~S has not been seen.");
		reader.$kw216$NOT = SubLObjectFactory.makeKeyword("NOT");
		reader.$str217$Bogus_feature_expression__S_ = SubLObjectFactory.makeString("Bogus feature expression ~S.");
		reader.$kw218$AND = SubLObjectFactory.makeKeyword("AND");
		reader.$kw219$OR = SubLObjectFactory.makeKeyword("OR");
		reader.$str220$Unknown_feature_operator__S_ = SubLObjectFactory.makeString("Unknown feature operator ~S.");
		reader.$kw221$HASH = SubLObjectFactory.makeKeyword("HASH");
		reader.$kw222$VERTICAL_BAR = SubLObjectFactory.makeKeyword("VERTICAL-BAR");
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_buffer(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_escapes(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject _csetf_read_token_pointer(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_case(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField2(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_character_syntax(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField3(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_constituent_traits(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField7(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_dispatch_tables(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField9(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_macro_functions(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField5(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_char_syntax(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField4(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_constit_traits(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField8(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject _csetf_readtable_single_byte_macro_functions(SubLObject object, SubLObject value) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.setField6(value);
	}

	@SubL(source = "sublisp/reader.lisp", position = 32281L)
	public static SubLObject add_to_token(SubLObject ch, SubLObject token, SubLObject escapep) {
		SubLObject buffer = reader.read_token_buffer(token);
		SubLObject length = Sequences.length(buffer);
		if (reader.read_token_pointer(token).numGE(length)) {
			SubLObject new_buffer = Strings.make_string(Numbers.multiply(length, CommonSymbols.TWO_INTEGER),
					CommonSymbols.UNPROVIDED);
			SubLObject i;
			for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
				Strings.set_char(new_buffer, i, Strings.sublisp_char(buffer, i));
			reader._csetf_read_token_buffer(token, new_buffer);
		}
		Strings.set_char(reader.read_token_buffer(token), reader.read_token_pointer(token), ch);
		if (CommonSymbols.NIL != escapep)
			reader._csetf_read_token_escapes(token,
					ConsesLow.cons(reader.read_token_pointer(token), reader.read_token_escapes(token)));
		reader._csetf_read_token_pointer(token,
				Numbers.add(reader.read_token_pointer(token), CommonSymbols.ONE_INTEGER));
		return ch;
	}

	@SubL(source = "sublisp/reader.lisp", position = 11909L)
	public static SubLObject alphabetic_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory
				.makeBoolean(
						Numbers.logand(
								reader.$alphabetic$.getGlobalValue(), reader
										.character_traits(ch,
												reader.$readtable$
														.getDynamicValue(thread)))
								.isPositive()
								&& (!Numbers
										.logand(reader.$digit$.getGlobalValue(),
												reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
										.isPositive()
										|| CommonSymbols.NIL == Characters.digit_char_p(ch,
												reader.$read_base$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 12761L)
	public static SubLObject alphadigit_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory
				.makeBoolean(Numbers
						.logand(reader.$alphabetic$.getGlobalValue(),
								reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
						.isPositive()
						&& Numbers
								.logand(reader.$digit$.getGlobalValue(),
										reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
								.isPositive());
	}

	@SubL(source = "sublisp/reader.lisp", position = 63550L)
	public static SubLObject backquote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
		try {
			reader.$backquote_depth$.bind(
					Numbers.add(reader.$backquote_depth$.getDynamicValue(thread), CommonSymbols.ONE_INTEGER), thread);
			thread.resetMultipleValues();
			SubLObject flag = reader.backquotify(stream,
					reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
			SubLObject thing = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (flag.eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| flag.eql(reader.$bq_dot$.getDynamicValue(thread)))
				reader.simple_reader_error(reader.$str205$_A_read_after_backquote_in__S_, ConsesLow.list(flag, thing));
			result = reader.backquotify_1(flag, thing);
		} finally {
			reader.$backquote_depth$.rebind(_prev_bind_0, thread);
		}
		return Values.values(result, reader.$sym187$LIST);
	}

	@SubL(source = "sublisp/reader.lisp", position = 60123L)
	public static SubLObject backquotify(SubLObject stream, SubLObject code) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (code.isAtom()) {
			if (CommonSymbols.NIL == code)
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
			if (CommonSymbols.NIL != reader.self_evaluating_atom_p(code))
				return Values.values(CommonSymbols.T, code);
			return Values.values(reader.$sym184$QUOTE, code);
		} else {
			if (code.first().eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| code.first().eql(reader.$bq_dot$.getDynamicValue(thread)))
				return Values.values(code.first(), code.rest());
			if (code.first().eql(reader.$bq_comma$.getDynamicValue(thread))) {
				thread.resetMultipleValues();
				SubLObject flag = reader.comma(code.rest());
				SubLObject thing = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return Values.values(flag, thing);
			}
			if (code.first().eql(reader.$bq_vector$.getDynamicValue(thread))) {
				thread.resetMultipleValues();
				SubLObject dflag = reader.backquotify(stream, code.rest());
				SubLObject d = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return Values.values(reader.$sym191$VECTOR, reader.backquotify_1(dflag, d));
			}
			thread.resetMultipleValues();
			SubLObject aflag = reader.backquotify(stream, code.first());
			SubLObject a = thread.secondMultipleValue();
			thread.resetMultipleValues();
			thread.resetMultipleValues();
			SubLObject dflag2 = reader.backquotify(stream, code.rest());
			SubLObject d2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (dflag2.eql(reader.$bq_atsign$.getDynamicValue(thread))
					|| dflag2.eql(reader.$bq_dot$.getDynamicValue(thread)))
				reader.simple_reader_error(reader.$str198$_A_after_dot_in__S_, ConsesLow.list(dflag2, code));
			if (aflag.eql(reader.$bq_atsign$.getDynamicValue(thread)))
				return Values.values(reader.$sym189$APPEND, dflag2 == reader.$sym189$APPEND ? ConsesLow.cons(a, d2)
						: ConsesLow.list(a, reader.backquotify_1(dflag2, d2)));
			if (aflag.eql(reader.$bq_dot$.getDynamicValue(thread)))
				return Values.values(reader.$sym190$NCONC, dflag2 == reader.$sym190$NCONC ? ConsesLow.cons(a, d2)
						: ConsesLow.list(a, reader.backquotify_1(dflag2, d2)));
			if (CommonSymbols.NIL == dflag2) {
				if (CommonSymbols.NIL != conses_high.member(aflag, reader.$list199, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED))
					return Values.values(reader.$sym184$QUOTE, ConsesLow.list(a));
				return Values.values(reader.$sym187$LIST, ConsesLow.list(reader.backquotify_1(aflag, a)));
			} else if (dflag2 == reader.$sym184$QUOTE || dflag2 == CommonSymbols.T) {
				if (CommonSymbols.NIL != conses_high.member(aflag, reader.$list199, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED))
					return Values.values(reader.$sym184$QUOTE, ConsesLow.cons(a, d2));
				return Values.values(reader.$sym188$LIST_,
						ConsesLow.list(reader.backquotify_1(aflag, a), reader.backquotify_1(dflag2, d2)));
			} else {
				a = reader.backquotify_1(aflag, a);
				if (dflag2 == reader.$sym187$LIST || dflag2 == reader.$sym188$LIST_)
					return Values.values(dflag2, ConsesLow.cons(a, d2));
				return Values.values(reader.$sym188$LIST_, ConsesLow.list(a, reader.backquotify_1(dflag2, d2)));
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 62912L)
	public static SubLObject backquotify_1(SubLObject flag, SubLObject thing) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (flag.eql(reader.$bq_comma$.getDynamicValue(thread)) || flag == CommonSymbols.T || flag == CommonSymbols.NIL)
			return thing;
		if (flag == reader.$sym184$QUOTE)
			return ConsesLow.list(reader.$sym184$QUOTE, thing);
		if (flag == reader.$sym188$LIST_) {
			if (CommonSymbols.NIL != conses_high.cddr(thing))
				return ConsesLow.cons(reader.$sym202$BQ_LIST_, thing);
			return ConsesLow.cons(reader.$sym203$BQ_CONS, thing);
		} else {
			if (flag == reader.$sym191$VECTOR)
				return ConsesLow.list(reader.$sym192$BQ_VECTOR, thing);
			return ConsesLow.cons(
					conses_high.assoc(flag, reader.$list204, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest(),
					thing);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 58059L)
	public static SubLObject bq_append(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return reader.bq_cons(reader.$sym189$APPEND, ConsesLow.append(lists, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 57755L)
	public static SubLObject bq_cons(SubLObject car, SubLObject cdr) {
		return ConsesLow.cons(car, cdr);
	}

	@SubL(source = "sublisp/reader.lisp", position = 57935L)
	public static SubLObject bq_list(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject objects;
		SubLObject current = objects = datum;
		return reader.bq_cons(reader.$sym187$LIST, ConsesLow.append(objects, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 57996L)
	public static SubLObject bq_listX(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject objects;
		SubLObject current = objects = datum;
		return reader.bq_cons(reader.$sym188$LIST_, ConsesLow.append(objects, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 58120L)
	public static SubLObject bq_nconc(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return reader.bq_cons(reader.$sym190$NCONC, ConsesLow.append(lists, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 58179L)
	public static SubLObject bq_vector(SubLObject contents) {
		return Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), contents);
	}

	@SubL(source = "sublisp/reader.lisp", position = 58243L)
	public static SubLObject bq_vector_append(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject lists;
		SubLObject current = lists = datum;
		return ConsesLow.list(reader.$sym192$BQ_VECTOR,
				reader.bq_cons(reader.$sym193$BQ_APPEND, ConsesLow.append(lists, CommonSymbols.NIL)));
	}

	@SubL(source = "sublisp/reader.lisp", position = 10130L)
	public static SubLObject character_function(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			return Vectors.aref(reader.readtable_single_byte_macro_functions(readtable), Characters.char_code(ch));
		SubLObject func = Hashtables.gethash(ch, reader.readtable_macro_functions(readtable), CommonSymbols.UNPROVIDED);
		return CommonSymbols.NIL != func ? func : reader.$sym50$CONSTITUENT_RMF;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8992L)
	public static SubLObject character_syntax(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject ch = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list51);
		ch = current.first();
		current = current.rest();
		SubLObject readtable = current.isCons() ? current.first() : reader.$sym52$_READTABLE_;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list51);
		current = current.rest();
		if (CommonSymbols.NIL == current)
			return ConsesLow.list(reader.$sym53$FIF, ConsesLow.list(reader.$sym54$SINGLE_BYTE_P, ch),
					ConsesLow.list(reader.$sym55$AREF,
							ConsesLow.list(reader.$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX, readtable),
							ConsesLow.list(reader.$sym56$CHAR_CODE, ch)),
					ConsesLow.listS(reader.$sym57$GETHASH, ch,
							ConsesLow.list(reader.$sym17$READTABLE_CHARACTER_SYNTAX, readtable), reader.$list58));
		cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list51);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 10748L)
	public static SubLObject character_traits(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		return CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_constit_traits(readtable), Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_constituent_traits(readtable),
						reader.$alphabetic$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 62098L)
	public static SubLObject comma(SubLObject code) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (code.isAtom()) {
			if (CommonSymbols.NIL == code)
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
			if (CommonSymbols.NIL != reader.self_evaluating_atom_p(code))
				return Values.values(CommonSymbols.T, code);
			return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
		} else {
			if (code.first() == reader.$sym184$QUOTE)
				return Values.values(code.first(), conses_high.cadr(code));
			if (CommonSymbols.NIL != conses_high.member(code.first(), reader.$list200, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				return Values.values(code.first(), code.rest());
			if (code.first() == reader.$sym201$CONS)
				return Values.values(reader.$sym188$LIST_, code.rest());
			return Values.values(reader.$bq_comma$.getDynamicValue(thread), code);
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 63976L)
	public static SubLObject comma_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!reader.$backquote_depth$.getDynamicValue(thread).isZero()) {
			SubLObject peek_char = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			SubLObject result = CommonSymbols.NIL;
			SubLObject _prev_bind_0 = reader.$backquote_depth$.currentBinding(thread);
			try {
				reader.$backquote_depth$.bind(
						Numbers.subtract(reader.$backquote_depth$.getDynamicValue(thread), CommonSymbols.ONE_INTEGER),
						thread);
				SubLObject pcase_var = peek_char;
				if (pcase_var.eql(Characters.CHAR_at))
					result = ConsesLow.cons(reader.$bq_atsign$.getDynamicValue(thread),
							reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
				else if (pcase_var.eql(Characters.CHAR_period))
					result = ConsesLow.cons(reader.$bq_dot$.getDynamicValue(thread),
							reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
				else {
					streams_high.unread_char(peek_char, stream);
					result = ConsesLow.cons(reader.$bq_comma$.getDynamicValue(thread),
							reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T));
				}
			} finally {
				reader.$backquote_depth$.rebind(_prev_bind_0, thread);
			}
			return Values.values(result, reader.$sym187$LIST);
		}
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		reader.simple_reader_error(reader.$str206$_S_read_outside_a_backquote_, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 52675L)
	public static SubLObject constituent_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.add_to_token(ch, token, CommonSymbols.NIL);
		return Values.values(reader.parse_token(stream, reader.read_token(stream, token, CommonSymbols.NIL)),
				CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 10048L)
	public static SubLObject constituent_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw49$CONSTITUENT);
	}

	@SubL(source = "sublisp/reader.lisp", position = 13018L)
	public static SubLObject copy_readtable(SubLObject from_readtable, SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = reader.$readtable$.getDynamicValue();
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == from_readtable)
			from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
		if (CommonSymbols.NIL != to_readtable) {
			Hashtables.clrhash(reader.readtable_character_syntax(to_readtable));
			Hashtables.clrhash(reader.readtable_macro_functions(to_readtable));
			Hashtables.clrhash(reader.readtable_constituent_traits(to_readtable));
		} else
			to_readtable = reader.create_readtable();
		reader._csetf_readtable_case(to_readtable, reader.readtable_case(from_readtable));
		reader.Xcopy_hash_table(reader.readtable_character_syntax(from_readtable),
				reader.readtable_character_syntax(to_readtable));
		reader.Xcopy_hash_table(reader.readtable_macro_functions(from_readtable),
				reader.readtable_macro_functions(to_readtable));
		reader.Xcopy_hash_table(reader.readtable_constituent_traits(from_readtable),
				reader.readtable_constituent_traits(to_readtable));
		SubLObject i;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(reader.$single_byte_max_code$.getGlobalValue()); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			Vectors.set_aref(reader.readtable_single_byte_char_syntax(to_readtable), i,
					Vectors.aref(reader.readtable_single_byte_char_syntax(from_readtable), i));
			Vectors.set_aref(reader.readtable_single_byte_macro_functions(to_readtable), i,
					Vectors.aref(reader.readtable_single_byte_macro_functions(from_readtable), i));
			Vectors.set_aref(reader.readtable_single_byte_constit_traits(to_readtable), i,
					Vectors.aref(reader.readtable_single_byte_constit_traits(from_readtable), i));
		}
		SubLObject dispatch_table = CommonSymbols.NIL;
		SubLObject cdolist_list_var = reader.readtable_dispatch_tables(from_readtable);
		SubLObject bucket = CommonSymbols.NIL;
		bucket = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = bucket;
			SubLObject ch = CommonSymbols.NIL;
			SubLObject table = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list69);
			ch = current.first();
			current = table = current.rest();
			dispatch_table = ConsesLow.cons(
					ConsesLow
							.cons(ch,
									reader.Xcopy_hash_table(table,
											Hashtables.make_hash_table(Hashtables.hash_table_count(table),
													CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))),
					dispatch_table);
			cdolist_list_var = cdolist_list_var.rest();
			bucket = cdolist_list_var.first();
		}
		reader._csetf_readtable_dispatch_tables(to_readtable, dispatch_table);
		return to_readtable;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8031L)
	public static SubLObject create_readtable() {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject readtable = reader.make_readtable(CommonSymbols.UNPROVIDED);
		reader._csetf_readtable_case(readtable, reader.$kw48$UPCASE);
		reader._csetf_readtable_character_syntax(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		reader._csetf_readtable_single_byte_char_syntax(readtable,
				Vectors.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$kw49$CONSTITUENT));
		reader._csetf_readtable_macro_functions(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		reader._csetf_readtable_single_byte_macro_functions(readtable,
				Vectors.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$sym50$CONSTITUENT_RMF));
		reader._csetf_readtable_constituent_traits(readtable,
				Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		reader._csetf_readtable_single_byte_constit_traits(readtable, Vectors
				.make_vector(reader.$single_byte_max_code$.getGlobalValue(), reader.$alphabetic$.getGlobalValue()));
		reader._csetf_readtable_dispatch_tables(readtable, CommonSymbols.NIL);
		return readtable;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12471L)
	public static SubLObject decimal_point_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$decimal_point$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	public static SubLObject declare_reader_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "loop", "LOOP");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_1_char_p",
				"WHITESPACE-1-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_2_char_p",
				"WHITESPACE-2-CHAR-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_print_function_trampoline", "READTABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_p", "READTABLE-P",
				1, 0, false);
		new $readtable_p$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_case",
				"READTABLE-CASE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_character_syntax",
				"READTABLE-CHARACTER-SYNTAX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_char_syntax", "READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_macro_functions",
				"READTABLE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_macro_functions", "READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_constituent_traits", "READTABLE-CONSTITUENT-TRAITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"readtable_single_byte_constit_traits", "READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtable_dispatch_tables",
				"READTABLE-DISPATCH-TABLES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_readtable_case",
				"_CSETF-READTABLE-CASE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_character_syntax", "_CSETF-READTABLE-CHARACTER-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_char_syntax", "_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_macro_functions", "_CSETF-READTABLE-MACRO-FUNCTIONS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_macro_functions", "_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_constituent_traits", "_CSETF-READTABLE-CONSTITUENT-TRAITS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_single_byte_constit_traits", "_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"_csetf_readtable_dispatch_tables", "_CSETF-READTABLE-DISPATCH-TABLES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "make_readtable",
				"MAKE-READTABLE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "visit_defstruct_readtable",
				"VISIT-DEFSTRUCT-READTABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"visit_defstruct_object_readtable_method", "VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "create_readtable",
				"CREATE-READTABLE", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_byte_p",
				"SINGLE-BYTE-P", 1, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_syntax",
				"CHARACTER-SYNTAX");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_character_syntax",
				"SET-CHARACTER-SYNTAX", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_syntaxp",
				"INVALID-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "terminating_macro_syntaxp",
				"TERMINATING-MACRO-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"non_terminating_macro_syntaxp", "NON-TERMINATING-MACRO-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "multiple_escape_syntaxp",
				"MULTIPLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_escape_syntaxp",
				"SINGLE-ESCAPE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_syntaxp",
				"WHITESPACE-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "constituent_syntaxp",
				"CONSTITUENT-SYNTAXP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_function",
				"CHARACTER-FUNCTION", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_character_function",
				"SET-CHARACTER-FUNCTION", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "character_traits",
				"CHARACTER-TRAITS", 1, 1, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "has_traitp", "HAS-TRAITP");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_trait", "SET-TRAIT", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "reset_trait", "RESET-TRAIT",
				1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "alphabetic_traitp",
				"ALPHABETIC-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "digit_traitp",
				"DIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "package_marker_traitp",
				"PACKAGE-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "plus_sign_traitp",
				"PLUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "minus_sign_traitp",
				"MINUS-SIGN-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "dot_traitp", "DOT-TRAITP", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "decimal_point_traitp",
				"DECIMAL-POINT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "ratio_marker_traitp",
				"RATIO-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "exponent_marker_traitp",
				"EXPONENT-MARKER-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_traitp",
				"INVALID-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "alphadigit_traitp",
				"ALPHADIGIT-TRAITP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "Xcopy_hash_table",
				"%COPY-HASH-TABLE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "copy_readtable",
				"COPY-READTABLE", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"make_dispatch_macro_character", "MAKE-DISPATCH-MACRO-CHARACTER", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "readtablep", "READTABLEP", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"set_dispatch_macro_character", "SET-DISPATCH-MACRO-CHARACTER", 3, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"get_dispatch_macro_character", "GET-DISPATCH-MACRO-CHARACTER", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "get_macro_character",
				"GET-MACRO-CHARACTER", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_macro_character",
				"SET-MACRO-CHARACTER", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_syntax_from_char",
				"SET-SYNTAX-FROM-CHAR", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_syntax", "SET-SYNTAX", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "simple_reader_error",
				"SIMPLE-READER-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "end_of_file_error",
				"END-OF-FILE-ERROR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_token_syntax_error",
				"INVALID-TOKEN-SYNTAX-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"unimplemented_reader_macro_error", "UNIMPLEMENTED-READER-MACRO-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "unnecessary_argument_error",
				"UNNECESSARY-ARGUMENT-ERROR", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "illegal_argument_error",
				"ILLEGAL-ARGUMENT-ERROR", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_internal",
				"READ-INTERNAL", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_preserving_whitespace",
				"READ-PRESERVING-WHITESPACE", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read", "READ", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_delimited_list",
				"READ-DELIMITED-LIST", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_from_string",
				"READ-FROM-STRING", 1, 5, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "with_standard_io_syntax",
				"WITH-STANDARD-IO-SYNTAX");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"with_special_reader_error_handling", "WITH-SPECIAL-READER-ERROR-HANDLING");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_ignoring_errors",
				"READ-IGNORING-ERRORS", 0, 3, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"read_from_string_ignoring_errors", "READ-FROM-STRING-IGNORING-ERRORS", 1, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"read_token_print_function_trampoline", "READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_p",
				"READ-TOKEN-P", 1, 0, false);
		new $read_token_p$UnaryFunction();
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_pointer",
				"READ-TOKEN-POINTER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_buffer",
				"READ-TOKEN-BUFFER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_escapes",
				"READ-TOKEN-ESCAPES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_pointer",
				"_CSETF-READ-TOKEN-POINTER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_buffer",
				"_CSETF-READ-TOKEN-BUFFER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "_csetf_read_token_escapes",
				"_CSETF-READ-TOKEN-ESCAPES", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "make_read_token",
				"MAKE-READ-TOKEN", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "visit_defstruct_read_token",
				"VISIT-DEFSTRUCT-READ-TOKEN", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader",
				"visit_defstruct_object_read_token_method", "VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "with_read_token",
				"WITH-READ-TOKEN");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "add_to_token",
				"ADD-TO-TOKEN", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token_string",
				"READ-TOKEN-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_token", "READ-TOKEN", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "potential_number_p",
				"POTENTIAL-NUMBER-P", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_token", "PARSE-TOKEN",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "symbol_escapep",
				"SYMBOL-ESCAPEP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "reader_find_package",
				"READER-FIND-PACKAGE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "frob_case", "FROB-CASE", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_symbol_or_consing_dot",
				"PARSE-SYMBOL-OR-CONSING-DOT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "float_parse_integer",
				"FLOAT-PARSE-INTEGER", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_number",
				"PARSE-NUMBER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "parse_integer",
				"PARSE-INTEGER", 1, 4, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "whitespace_rmf",
				"WHITESPACE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "constituent_rmf",
				"CONSTITUENT-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "invalid_rmf", "INVALID-RMF",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_escape_rmf",
				"SINGLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "multiple_escape_rmf",
				"MULTIPLE-ESCAPE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_capital_g_rmf",
				"SHARPSIGN-CAPITAL-G-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "left_paren_rmf",
				"LEFT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "right_paren_rmf",
				"RIGHT-PAREN-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "single_quote_rmf",
				"SINGLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "semicolon_rmf",
				"SEMICOLON-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "double_quote_rmf",
				"DOUBLE-QUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_cons", "BQ-CONS", 2, 0,
				false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_list", "BQ-LIST");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_listX", "BQ-LIST*");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_append", "BQ-APPEND");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_nconc", "BQ-NCONC");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_vector", "BQ-VECTOR", 1,
				0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "bq_vector_append",
				"BQ-VECTOR-APPEND");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquotify", "BACKQUOTIFY",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "comma", "COMMA", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "self_evaluating_atom_p",
				"SELF-EVALUATING-ATOM-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquotify_1",
				"BACKQUOTIFY-1", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "backquote_rmf",
				"BACKQUOTE-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "comma_rmf", "COMMA-RMF", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "dispatching_rmf",
				"DISPATCHING-RMF", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_backslash_rmf",
				"SHARPSIGN-BACKSLASH-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_single_quote_rmf",
				"SHARPSIGN-SINGLE-QUOTE-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_left_paren_rmf",
				"SHARPSIGN-LEFT-PAREN-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_asterisk_rmf",
				"SHARPSIGN-ASTERISK-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_colon_rmf",
				"SHARPSIGN-COLON-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_dot_rmf",
				"SHARPSIGN-DOT-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_number_in_radix",
				"READ-NUMBER-IN-RADIX", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_b_rmf",
				"SHARPSIGN-B-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_o_rmf",
				"SHARPSIGN-O-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_x_rmf",
				"SHARPSIGN-X-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_r_rmf",
				"SHARPSIGN-R-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_c_rmf",
				"SHARPSIGN-C-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_a_rmf",
				"SHARPSIGN-A-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_s_rmf",
				"SHARPSIGN-S-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_p_rmf",
				"SHARPSIGN-P-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_lookup", "READ-LOOKUP",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "set_read_lookup",
				"SET-READ-LOOKUP", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_equals_rmf",
				"SHARPSIGN-EQUALS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_sharpsign_rmf",
				"SHARPSIGN-SHARPSIGN-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "features_match",
				"FEATURES-MATCH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "fix_features",
				"FIX-FEATURES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "read_features",
				"READ-FEATURES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_plus_rmf",
				"SHARPSIGN-PLUS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_minus_rmf",
				"SHARPSIGN-MINUS-RMF", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader", "sharpsign_vertical_bar_rmf",
				"SHARPSIGN-VERTICAL-BAR-RMF", 3, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12092L)
	public static SubLObject digit_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return SubLObjectFactory.makeBoolean(Numbers
				.logand(reader.$digit$.getGlobalValue(),
						reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread)))
				.isPositive()
				&& CommonSymbols.NIL != Characters.digit_char_p(ch, reader.$read_base$.getDynamicValue(thread)));
	}

	@SubL(source = "sublisp/reader.lisp", position = 64612L)
	public static SubLObject dispatching_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject arg = CommonSymbols.NIL;
		SubLObject next_ch;
		for (next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED); CommonSymbols.NIL != Characters.digit_char_p(next_ch,
						CommonSymbols.TEN_INTEGER); next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)) {
			if (CommonSymbols.NIL == arg)
				arg = CommonSymbols.ZERO_INTEGER;
			arg = Numbers.add(Numbers.multiply(arg, CommonSymbols.TEN_INTEGER),
					Characters.digit_char_p(next_ch, CommonSymbols.TEN_INTEGER));
		}
		SubLObject function = reader.get_dispatch_macro_character(ch, next_ch, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != function) {
			thread.resetMultipleValues();
			SubLObject value = Functions.funcall(function, stream, next_ch, arg);
			SubLObject goodp = thread.secondMultipleValue();
			thread.resetMultipleValues();
			return Values.values(value, goodp);
		}
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		reader.simple_reader_error(reader.$str207$Undefined_reader_macro__A_A_, ConsesLow.list(ch, next_ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12416L)
	public static SubLObject dot_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$dot$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 56839L)
	public static SubLObject double_quote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw185$NORMAL;
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
			while (true) {
				SubLObject next_ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				SubLObject pcase_var = state;
				if (pcase_var.eql(reader.$kw185$NORMAL)) {
					if (CommonSymbols.NIL != Characters.charE(next_ch, ch))
						break;
					if (CommonSymbols.NIL == reader.single_escape_syntaxp(next_ch))
						continue;
					state = reader.$kw186$ESCAPE;
				} else {
					if (!pcase_var.eql(reader.$kw186$ESCAPE))
						continue;
					state = reader.$kw185$NORMAL;
				}
			}
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		}
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		while (true) {
			SubLObject next_ch2 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			SubLObject pcase_var2 = state;
			if (pcase_var2.eql(reader.$kw185$NORMAL)) {
				if (CommonSymbols.NIL != Characters.charE(next_ch2, ch))
					break;
				if (CommonSymbols.NIL != reader.single_escape_syntaxp(next_ch2))
					state = reader.$kw186$ESCAPE;
				else
					reader.add_to_token(next_ch2, token, CommonSymbols.NIL);
			} else {
				if (!pcase_var2.eql(reader.$kw186$ESCAPE))
					continue;
				reader.add_to_token(next_ch2, token, CommonSymbols.NIL);
				state = reader.$kw185$NORMAL;
			}
		}
		return Values.values(reader.read_token_string(token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23444L)
	public static SubLObject end_of_file_error(SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread))
			Dynamic.sublisp_throw(reader.$sym108$END_OF_FILE, CommonSymbols.T);
		else
			reader.simple_reader_error(reader.$str109$End_of_file_on_stream__S_, ConsesLow.list(stream));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12619L)
	public static SubLObject exponent_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$exponent_marker$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 72418L)
	public static SubLObject features_match(SubLObject feature) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!feature.isCons())
			return conses_high.member(feature, reader.$features$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		SubLObject pcase_var = feature.first();
		if (pcase_var.eql(reader.$kw216$NOT)) {
			if (CommonSymbols.NIL != conses_high.cddr(feature))
				reader.simple_reader_error(reader.$str217$Bogus_feature_expression__S_, ConsesLow.list(feature));
			return SubLObjectFactory.makeBoolean(CommonSymbols.NIL == reader.features_match(conses_high.cadr(feature)));
		}
		if (pcase_var.eql(reader.$kw218$AND)) {
			SubLObject cdolist_list_var = feature.rest();
			SubLObject subfeature = CommonSymbols.NIL;
			subfeature = cdolist_list_var.first();
			while (CommonSymbols.NIL != cdolist_list_var) {
				if (CommonSymbols.NIL == reader.features_match(subfeature))
					return CommonSymbols.NIL;
				cdolist_list_var = cdolist_list_var.rest();
				subfeature = cdolist_list_var.first();
			}
			return CommonSymbols.T;
		}
		if (pcase_var.eql(reader.$kw219$OR)) {
			SubLObject cdolist_list_var = feature.rest();
			SubLObject subfeature = CommonSymbols.NIL;
			subfeature = cdolist_list_var.first();
			while (CommonSymbols.NIL != cdolist_list_var) {
				if (CommonSymbols.NIL != reader.features_match(subfeature))
					return CommonSymbols.T;
				cdolist_list_var = cdolist_list_var.rest();
				subfeature = cdolist_list_var.first();
			}
			return CommonSymbols.NIL;
		}
		reader.simple_reader_error(reader.$str220$Unknown_feature_operator__S_, ConsesLow.list(feature.first()));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 73066L)
	public static SubLObject fix_features(SubLObject features) {
		if (CommonSymbols.NIL == features)
			return features;
		if (features.isSymbol())
			return Symbols.make_keyword(features);
		if (features.isCons())
			return ConsesLow.cons(reader.fix_features(features.first()), reader.fix_features(features.rest()));
		return features;
	}

	@SubL(source = "sublisp/reader.lisp", position = 44896L)
	public static SubLObject float_parse_integer(SubLObject string, SubLObject start, SubLObject end,
			SubLObject radix) {
		SubLObject value = CommonSymbols.NIL;
		SubLObject i;
		SubLObject digit;
		for (i = CommonSymbols.NIL, i = start; !i.numGE(end); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			digit = Characters.digit_char_p(Strings.sublisp_char(string, i), radix);
			value = Numbers.add(Numbers.multiply(CommonSymbols.NIL != value ? value : reader.$float153$0_0, radix),
					Numbers.sublisp_float(digit, CommonSymbols.UNPROVIDED));
		}
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 39523L)
	public static SubLObject frob_case(SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject frobber = CommonSymbols.NIL;
		SubLObject pcase_var = reader.readtable_case(reader.$readtable$.getDynamicValue(thread));
		if (!pcase_var.eql(reader.$kw147$PRESERVE))
			if (pcase_var.eql(reader.$kw48$UPCASE))
				frobber = reader.$kw48$UPCASE;
			else if (pcase_var.eql(reader.$kw145$DOWNCASE))
				frobber = reader.$kw145$DOWNCASE;
			else if (pcase_var.eql(reader.$kw148$INVERT)) {
				SubLObject buffer = reader.read_token_buffer(token);
				SubLObject escapes = reader.read_token_escapes(token);
				SubLObject upcase = CommonSymbols.NIL;
				SubLObject downcase = CommonSymbols.NIL;
				SubLObject cdotimes_end_var;
				SubLObject i;
				SubLObject escape_idx;
				SubLObject ch;
				for (cdotimes_end_var = reader
						.read_token_pointer(token), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
								.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					escape_idx = escapes.first();
					if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
						escapes = escapes.rest();
					else {
						ch = Strings.sublisp_char(buffer, i);
						if (CommonSymbols.NIL == Characters.charE(ch, Characters.char_downcase(ch)))
							upcase = CommonSymbols.T;
						if (CommonSymbols.NIL == Characters.charE(ch, Characters.char_upcase(ch)))
							downcase = CommonSymbols.T;
					}
				}
				if (CommonSymbols.NIL == upcase || CommonSymbols.NIL == downcase)
					if (CommonSymbols.NIL != upcase)
						frobber = reader.$kw145$DOWNCASE;
					else if (CommonSymbols.NIL != downcase)
						frobber = reader.$kw48$UPCASE;
			}
		if (CommonSymbols.NIL != frobber) {
			SubLObject buffer = reader.read_token_buffer(token);
			SubLObject escapes = reader.read_token_escapes(token);
			SubLObject cdotimes_end_var2;
			SubLObject j;
			SubLObject escape_idx2;
			SubLObject curr;
			for (cdotimes_end_var2 = reader
					.read_token_pointer(token), j = CommonSymbols.NIL, j = CommonSymbols.ZERO_INTEGER; j
							.numL(cdotimes_end_var2); j = Numbers.add(j, CommonSymbols.ONE_INTEGER)) {
				escape_idx2 = escapes.first();
				if (CommonSymbols.NIL != escape_idx2 && escape_idx2.numE(j))
					escapes = escapes.rest();
				else {
					curr = Strings.sublisp_char(buffer, j);
					if (frobber == reader.$kw48$UPCASE)
						Strings.set_char(buffer, j, Characters.char_upcase(curr));
					else
						Strings.set_char(buffer, j, Characters.char_downcase(curr));
				}
			}
		}
		return token;
	}

	@SubL(source = "sublisp/reader.lisp", position = 15884L)
	public static SubLObject get_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLObject bucket = conses_high.assoc(disp_char, reader.readtable_dispatch_tables(readtable),
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL == bucket)
			Errors.error(reader.$str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
		return Hashtables.gethash(Characters.char_upcase(sub_char), bucket.rest(), CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/reader.lisp", position = 16229L)
	public static SubLObject get_macro_character(SubLObject v_char, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLObject syntax = CommonSymbols.NIL != reader.single_byte_p(v_char)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(readtable), Characters.char_code(v_char))
				: Hashtables.gethash(v_char, reader.readtable_character_syntax(readtable), reader.$kw49$CONSTITUENT);
		if (syntax == reader.$kw60$TERMINATING_MACRO || syntax == reader.$kw61$NON_TERMINATING_MACRO)
			return Values.values(reader.character_function(v_char, readtable),
					Equality.eq(syntax, reader.$kw61$NON_TERMINATING_MACRO));
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 11109L)
	public static SubLObject has_traitp(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject ch = CommonSymbols.NIL;
		SubLObject trait = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list65);
		ch = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list65);
		trait = current.first();
		current = current.rest();
		SubLObject readtable = current.isCons() ? current.first() : reader.$sym52$_READTABLE_;
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, reader.$list65);
		current = current.rest();
		if (CommonSymbols.NIL == current)
			return ConsesLow.list(reader.$sym66$PLUSP, ConsesLow.list(reader.$sym67$LOGAND, trait,
					ConsesLow.list(reader.$sym68$CHARACTER_TRAITS, ch, readtable)));
		cdestructuring_bind.cdestructuring_bind_error(datum, reader.$list65);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 24136L)
	public static SubLObject illegal_argument_error(SubLObject stream, SubLObject ch, SubLObject arg) {
		reader.simple_reader_error(reader.$str113$Illegal_argument__D_for_the__A_re, ConsesLow.list(arg, ch));
		return CommonSymbols.NIL;
	}

	public static SubLObject init_reader_file() {
		reader.$whitespace_1_chars$ = SubLFiles.defvar("*WHITESPACE-1-CHARS*",
				ConsesLow.list(Characters.CHAR_space, Characters.code_char(CommonSymbols.TEN_INTEGER),
						Characters.code_char(CommonSymbols.THIRTEEN_INTEGER), Characters.CHAR_tab, Characters.CHAR_page,
						Characters.CHAR_rubout));
		reader.$read_base$ = SubLFiles.defvar("*READ-BASE*", CommonSymbols.TEN_INTEGER);
		reader.$read_default_float_format$ = SubLFiles.defvar("*READ-DEFAULT-FLOAT-FORMAT*", reader.$sym2$DOUBLE_FLOAT);
		reader.$read_eval$ = SubLFiles.defvar("*READ-EVAL*", CommonSymbols.T);
		reader.$read_suppress$ = SubLFiles.defvar("*READ-SUPPRESS*", CommonSymbols.NIL);
		reader.$features$ = SubLFiles.defvar("*FEATURES*", reader.$list3);
		reader.$readtable$ = SubLFiles.defvar("*READTABLE*", CommonSymbols.NIL);
		reader.$initial_table_size$ = SubLFiles.defparameter("*INITIAL-TABLE-SIZE*", reader.$int4$32);
		reader.$single_byte_max_code$ = SubLFiles.defconstant("*SINGLE-BYTE-MAX-CODE*", reader.$int5$128);
		reader.$dtp_readtable$ = SubLFiles.defconstant("*DTP-READTABLE*", reader.$sym6$READTABLE);
		reader.$alphabetic$ = SubLFiles.defconstant("*ALPHABETIC*", CommonSymbols.ONE_INTEGER);
		reader.$digit$ = SubLFiles.defconstant("*DIGIT*", CommonSymbols.TWO_INTEGER);
		reader.$package_marker$ = SubLFiles.defconstant("*PACKAGE-MARKER*", CommonSymbols.FOUR_INTEGER);
		reader.$plus_sign$ = SubLFiles.defconstant("*PLUS-SIGN*", CommonSymbols.EIGHT_INTEGER);
		reader.$minus_sign$ = SubLFiles.defconstant("*MINUS-SIGN*", CommonSymbols.SIXTEEN_INTEGER);
		reader.$dot$ = SubLFiles.defconstant("*DOT*", reader.$int4$32);
		reader.$decimal_point$ = SubLFiles.defconstant("*DECIMAL-POINT*", reader.$int45$64);
		reader.$ratio_marker$ = SubLFiles.defconstant("*RATIO-MARKER*", reader.$int5$128);
		reader.$exponent_marker$ = SubLFiles.defconstant("*EXPONENT-MARKER*", reader.$int46$256);
		reader.$invalid$ = SubLFiles.defconstant("*INVALID*", reader.$int47$512);
		reader.$standard_readtable$ = SubLFiles.defvar("*STANDARD-READTABLE*", CommonSymbols.NIL);
		reader.$throw_reader_error_p$ = SubLFiles.defvar("*THROW-READER-ERROR-P*", CommonSymbols.NIL);
		reader.$throw_end_of_file_p$ = SubLFiles.defvar("*THROW-END-OF-FILE-P*", CommonSymbols.NIL);
		reader.$read_lookup_table$ = SubLFiles.defvar("*READ-LOOKUP-TABLE*", CommonSymbols.NIL);
		reader.$initial_token_size$ = SubLFiles.defconstant("*INITIAL-TOKEN-SIZE*", reader.$int4$32);
		reader.$dtp_read_token$ = SubLFiles.defconstant("*DTP-READ-TOKEN*", reader.$sym119$READ_TOKEN);
		reader.$consing_dot$ = SubLFiles.defparameter("*CONSING-DOT*", reader.$sym149$CONSING_DOT);
		reader.$keyword_package$ = SubLFiles.deflexical("*KEYWORD-PACKAGE*",
				Packages.find_package(reader.$str150$KEYWORD));
		reader.$reading_list$ = SubLFiles.defvar("*READING-LIST*", CommonSymbols.NIL);
		reader.$reading_fake_list$ = SubLFiles.defvar("*READING-FAKE-LIST*", CommonSymbols.NIL);
		reader.$right_paren$ = SubLFiles.defparameter("*RIGHT-PAREN*", reader.$sym174$RIGHT_PAREN);
		reader.$ignore_extra_right_parens$ = SubLFiles.defparameter("*IGNORE-EXTRA-RIGHT-PARENS*", CommonSymbols.NIL);
		reader.$bq_comma$ = SubLFiles.defparameter("*BQ-COMMA*", Symbols.make_symbol(reader.$str194$_));
		reader.$bq_atsign$ = SubLFiles.defparameter("*BQ-ATSIGN*", Symbols.make_symbol(reader.$str195$_));
		reader.$bq_dot$ = SubLFiles.defparameter("*BQ-DOT*", Symbols.make_symbol(reader.$str196$_));
		reader.$bq_vector$ = SubLFiles.defparameter("*BQ-VECTOR*", Symbols.make_symbol(reader.$str197$BQ_VECTOR));
		reader.$backquote_depth$ = SubLFiles.defvar("*BACKQUOTE-DEPTH*", CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 52843L)
	public static SubLObject invalid_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread)) {
			SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
			reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
			reader._csetf_read_token_buffer(token,
					Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
			reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
			return Values.values(reader.read_token(stream, token, CommonSymbols.NIL), CommonSymbols.T);
		}
		reader.simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 9521L)
	public static SubLObject invalid_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw59$INVALID);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23644L)
	public static SubLObject invalid_token_syntax_error(SubLObject stream, SubLObject token) {
		reader.simple_reader_error(reader.$str110$_S_is_invalid_token_syntax_,
				ConsesLow.list(reader.read_token_string(token)));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12698L)
	public static SubLObject invalid_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$invalid$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 54272L)
	public static SubLObject left_paren_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject list = CommonSymbols.NIL;
		SubLObject tail = CommonSymbols.NIL;
		SubLObject object = CommonSymbols.NIL;
		while (true) {
			SubLObject _prev_bind_0 = reader.$reading_list$.currentBinding(thread);
			try {
				reader.$reading_list$.bind(CommonSymbols.T, thread);
				object = reader.read_internal(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			} finally {
				reader.$reading_list$.rebind(_prev_bind_0, thread);
			}
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(CommonSymbols.NIL, CommonSymbols.T);
				if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					Errors.error(reader.$str175$Nothing_before_consing_dot_);
				else {
					if (CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
						list = tail = ConsesLow.cons(object, CommonSymbols.NIL);
					state = reader.$kw176$LIST;
				}
			} else if (pcase_var.eql(reader.$kw176$LIST)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(list, CommonSymbols.T);
				if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					state = reader.$kw177$CONSING_DOT;
				else {
					if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
						continue;
					ConsesLow.rplacd(tail, ConsesLow.cons(object, CommonSymbols.NIL));
					tail = tail.rest();
				}
			} else if (pcase_var.eql(reader.$kw177$CONSING_DOT)) {
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					reader.simple_reader_error(reader.$str178$Nothing_after_consing_dot_, CommonSymbols.NIL);
				else if (object.eql(reader.$consing_dot$.getDynamicValue(thread)))
					reader.simple_reader_error(reader.$str179$Too_many_consing_dots_, CommonSymbols.NIL);
				else {
					if (CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
						ConsesLow.rplacd(tail, object);
					state = reader.$kw180$AFTER_CONSING_DOT;
				}
			} else {
				if (!pcase_var.eql(reader.$kw180$AFTER_CONSING_DOT))
					continue;
				if (object.eql(reader.$right_paren$.getDynamicValue(thread)))
					return Values.values(list, CommonSymbols.T);
				reader.simple_reader_error(reader.$str181$Too_many_objects_after_consing_do, CommonSymbols.NIL);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 4562L)
	public static SubLObject loop(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ConsesLow.listS(reader.$sym0$CDO, CommonSymbols.NIL, reader.$list1,
				ConsesLow.append(body, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 14699L)
	public static SubLObject make_dispatch_macro_character(SubLObject v_char, SubLObject non_terminating_p,
			SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = CommonSymbols.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		SubLThread thread = SubLProcess.currentSubLThread();
		reader._csetf_readtable_dispatch_tables(readtable,
				Sequences.delete(v_char, reader.readtable_dispatch_tables(readtable),
						Symbols.symbol_function(CommonSymbols.EQL), Symbols.symbol_function(reader.$sym70$CAR),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		reader._csetf_readtable_dispatch_tables(readtable,
				ConsesLow.cons(
						ConsesLow.cons(v_char,
								Hashtables.make_hash_table(reader.$initial_table_size$.getDynamicValue(thread),
										CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)),
						reader.readtable_dispatch_tables(readtable)));
		reader.set_character_function(v_char, reader.$sym71$DISPATCHING_RMF, readtable);
		reader.set_character_syntax(v_char, CommonSymbols.NIL != non_terminating_p ? reader.$kw61$NON_TERMINATING_MACRO
				: reader.$kw60$TERMINATING_MACRO, readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject make_read_token(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = CommonSymbols.NIL;
		SubLObject v_new = new $read_token_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = CommonSymbols.NIL, next = arglist; CommonSymbols.NIL != next; next = conses_high.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql(reader.$kw133$POINTER))
				reader._csetf_read_token_pointer(v_new, current_value);
			else if (pcase_var.eql(reader.$kw134$BUFFER))
				reader._csetf_read_token_buffer(v_new, current_value);
			else if (pcase_var.eql(reader.$kw135$ESCAPES))
				reader._csetf_read_token_escapes(v_new, current_value);
			else
				Errors.error(reader.$str39$Invalid_slot__S_for_construction_, current_arg);
		}
		return v_new;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject make_readtable(SubLObject arglist) {
		if (arglist == CommonSymbols.UNPROVIDED)
			arglist = CommonSymbols.NIL;
		SubLObject v_new = new $readtable_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = CommonSymbols.NIL, next = arglist; CommonSymbols.NIL != next; next = conses_high.cddr(next)) {
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql(reader.$kw31$CASE))
				reader._csetf_readtable_case(v_new, current_value);
			else if (pcase_var.eql(reader.$kw32$CHARACTER_SYNTAX))
				reader._csetf_readtable_character_syntax(v_new, current_value);
			else if (pcase_var.eql(reader.$kw33$SINGLE_BYTE_CHAR_SYNTAX))
				reader._csetf_readtable_single_byte_char_syntax(v_new, current_value);
			else if (pcase_var.eql(reader.$kw34$MACRO_FUNCTIONS))
				reader._csetf_readtable_macro_functions(v_new, current_value);
			else if (pcase_var.eql(reader.$kw35$SINGLE_BYTE_MACRO_FUNCTIONS))
				reader._csetf_readtable_single_byte_macro_functions(v_new, current_value);
			else if (pcase_var.eql(reader.$kw36$CONSTITUENT_TRAITS))
				reader._csetf_readtable_constituent_traits(v_new, current_value);
			else if (pcase_var.eql(reader.$kw37$SINGLE_BYTE_CONSTIT_TRAITS))
				reader._csetf_readtable_single_byte_constit_traits(v_new, current_value);
			else if (pcase_var.eql(reader.$kw38$DISPATCH_TABLES))
				reader._csetf_readtable_dispatch_tables(v_new, current_value);
			else
				Errors.error(reader.$str39$Invalid_slot__S_for_construction_, current_arg);
		}
		return v_new;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12347L)
	public static SubLObject minus_sign_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$minus_sign$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 53325L)
	public static SubLObject multiple_escape_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.read_token(stream, token, CommonSymbols.T);
		return Values.values(reader.parse_token(stream, token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9792L)
	public static SubLObject multiple_escape_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw62$MULTIPLE_ESCAPE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9690L)
	public static SubLObject non_terminating_macro_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw61$NON_TERMINATING_MACRO);
	}

	@SubL(source = "sublisp/reader.lisp", position = 12202L)
	public static SubLObject package_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$package_marker$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 50470L)
	public static SubLObject parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix,
			SubLObject junk_allowed) {
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		if (radix == CommonSymbols.UNPROVIDED)
			radix = CommonSymbols.TEN_INTEGER;
		if (junk_allowed == CommonSymbols.UNPROVIDED)
			junk_allowed = CommonSymbols.NIL;
		if (CommonSymbols.NIL == end)
			end = Sequences.length(string);
		if (CommonSymbols.NIL == junk_allowed)
			return Numbers.jrtl_parse_integer(string, start, end, radix);
		SubLObject sign = CommonSymbols.MINUS_ONE_INTEGER;
		SubLObject i = start;
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject value = CommonSymbols.NIL;
		while (!i.numGE(end)) {
			SubLObject ch = Strings.sublisp_char(string, i);
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (CommonSymbols.NIL == reader.whitespace_1_char_p(ch))
					if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_plus))
						state = reader.$kw156$SIGN;
					else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_hyphen)) {
						sign = CommonSymbols.ONE_INTEGER;
						state = reader.$kw156$SIGN;
					} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix)) {
						value = Numbers.minus(Characters.digit_char_p(ch, radix));
						state = reader.$kw168$DIGIT;
					} else {
						if (CommonSymbols.NIL != junk_allowed)
							return Values.values(CommonSymbols.NIL, i);
						reader.simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
								ConsesLow.list(Sequences.subseq(string, start, end)));
					}
			} else if (pcase_var.eql(reader.$kw156$SIGN)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix)) {
					value = Numbers.minus(Characters.digit_char_p(ch, radix));
					state = reader.$kw168$DIGIT;
				} else {
					if (CommonSymbols.NIL != junk_allowed)
						return Values.values(CommonSymbols.NIL, i);
					reader.simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			} else if (pcase_var.eql(reader.$kw168$DIGIT)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, radix))
					value = Numbers.subtract(Numbers.multiply(value, radix), Characters.digit_char_p(ch, radix));
				else if (CommonSymbols.NIL != reader.whitespace_1_char_p(ch))
					state = reader.$kw170$TRAILING_WHITESPACE;
				else {
					if (CommonSymbols.NIL != junk_allowed)
						return Values.values(Numbers.multiply(sign, value), i);
					reader.simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			} else if (pcase_var.eql(reader.$kw170$TRAILING_WHITESPACE))
				if (CommonSymbols.NIL == reader.whitespace_1_char_p(ch)) {
					if (CommonSymbols.NIL != junk_allowed)
						return Values.values(Numbers.multiply(sign, value), i);
					reader.simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
							ConsesLow.list(Sequences.subseq(string, start, end)));
				}
			i = Numbers.add(i, CommonSymbols.ONE_INTEGER);
		}
		if (state == reader.$kw168$DIGIT || state == reader.$kw170$TRAILING_WHITESPACE)
			return Values.values(Numbers.multiply(sign, value), i);
		if (CommonSymbols.NIL != junk_allowed)
			return Values.values(CommonSymbols.NIL, i);
		reader.simple_reader_error(reader.$str169$_S_does_not_contain_an_integer_,
				ConsesLow.list(Sequences.subseq(string, start, end)));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 45222L)
	public static SubLObject parse_number(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject buffer = reader.read_token_buffer(token);
		SubLObject length = reader.read_token_pointer(token);
		SubLObject sign = CommonSymbols.ONE_INTEGER;
		SubLObject exponent_sign = CommonSymbols.ONE_INTEGER;
		SubLObject start1 = CommonSymbols.NIL;
		SubLObject end1 = CommonSymbols.NIL;
		SubLObject start2 = CommonSymbols.NIL;
		SubLObject end2 = CommonSymbols.NIL;
		SubLObject start3 = CommonSymbols.NIL;
		SubLObject i;
		SubLObject ch;
		SubLObject pcase_var;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(buffer, i);
			pcase_var = state;
			if (pcase_var.eql(reader.$kw154$INITIAL)) {
				if (CommonSymbols.NIL != reader.decimal_point_traitp(ch))
					state = reader.$kw155$DOT1;
				else if (CommonSymbols.NIL != reader.plus_sign_traitp(ch))
					state = reader.$kw156$SIGN;
				else if (CommonSymbols.NIL != reader.minus_sign_traitp(ch)) {
					sign = CommonSymbols.MINUS_ONE_INTEGER;
					state = reader.$kw156$SIGN;
				} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start1 = i;
					state = reader.$kw157$DECIMALS;
				} else if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
					start1 = i;
					state = reader.$kw158$DIGITS;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw156$SIGN)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start1 = i;
					state = reader.$kw157$DECIMALS;
				} else if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
					start1 = i;
					state = reader.$kw158$DIGITS;
				} else if (CommonSymbols.NIL != reader.decimal_point_traitp(ch))
					state = reader.$kw155$DOT1;
				else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw157$DECIMALS)) {
				if (CommonSymbols.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					if (CommonSymbols.NIL != reader.digit_traitp(ch))
						state = reader.$kw158$DIGITS;
					else if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw159$EXPONENT;
					} else if (CommonSymbols.NIL != reader.decimal_point_traitp(ch)) {
						end1 = i;
						state = reader.$kw160$DOT2;
					} else if (CommonSymbols.NIL != reader.ratio_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw161$SLASH;
					} else
						reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw158$DIGITS)) {
				if (CommonSymbols.NIL == reader.digit_traitp(ch))
					if (CommonSymbols.NIL != reader.ratio_marker_traitp(ch)) {
						end1 = i;
						state = reader.$kw161$SLASH;
					} else
						reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw161$SLASH)) {
				if (CommonSymbols.NIL != reader.digit_traitp(ch)) {
					start2 = i;
					state = reader.$kw162$DENOMINATOR;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw162$DENOMINATOR)) {
				if (CommonSymbols.NIL == reader.digit_traitp(ch))
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw155$DOT1)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start2 = i;
					state = reader.$kw163$FRACTION;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw163$FRACTION)) {
				if (CommonSymbols.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw160$DOT2)) {
				if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
					start2 = CommonSymbols.ZERO_INTEGER;
					end2 = CommonSymbols.ZERO_INTEGER;
					state = reader.$kw159$EXPONENT;
				} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start2 = i;
					state = reader.$kw164$DECIMALS2;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw164$DECIMALS2)) {
				if (CommonSymbols.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch)) {
						end2 = i;
						state = reader.$kw159$EXPONENT;
					} else
						reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw159$EXPONENT)) {
				if (CommonSymbols.NIL != reader.plus_sign_traitp(ch))
					state = reader.$kw165$EXPONENT_SIGN;
				else if (CommonSymbols.NIL != reader.minus_sign_traitp(ch)) {
					exponent_sign = CommonSymbols.MINUS_ONE_INTEGER;
					state = reader.$kw165$EXPONENT_SIGN;
				} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start3 = i;
					state = reader.$kw166$EXPONENT_VALUE;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw165$EXPONENT_SIGN)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					start3 = i;
					state = reader.$kw166$EXPONENT_VALUE;
				} else
					reader.invalid_token_syntax_error(stream, token);
			} else if (pcase_var.eql(reader.$kw166$EXPONENT_VALUE)) {
				if (CommonSymbols.NIL == Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER))
					reader.invalid_token_syntax_error(stream, token);
			} else
				reader.simple_reader_error(reader.$str167$Can_t_happen_, CommonSymbols.NIL);
		}
		SubLObject pcase_var2 = state;
		if (pcase_var2.eql(reader.$kw158$DIGITS))
			return Numbers.multiply(sign, reader.parse_integer(buffer, start1, length,
					reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw157$DECIMALS))
			return Numbers.multiply(sign, reader.parse_integer(buffer, start1, length,
					reader.$read_base$.getDynamicValue(thread), CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw160$DOT2))
			return Numbers.multiply(sign,
					reader.parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED));
		if (pcase_var2.eql(reader.$kw162$DENOMINATOR))
			return Numbers.multiply(sign,
					Numbers.divide(
							reader.parse_integer(buffer, start1, end1, reader.$read_base$.getDynamicValue(thread),
									CommonSymbols.UNPROVIDED),
							reader.parse_integer(buffer, start2, length, reader.$read_base$.getDynamicValue(thread),
									CommonSymbols.UNPROVIDED)));
		if (pcase_var2.eql(reader.$kw163$FRACTION))
			return Numbers.multiply(sign, math_utilities.bellerophon(
					reader.parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED),
					Numbers.minus(Numbers.subtract(length, start2))));
		if (pcase_var2.eql(reader.$kw164$DECIMALS2)) {
			SubLObject left = reader.parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER,
					CommonSymbols.UNPROVIDED);
			SubLObject right = reader.parse_integer(buffer, start2, length, CommonSymbols.TEN_INTEGER,
					CommonSymbols.UNPROVIDED);
			return Numbers
					.multiply(sign,
							math_utilities
									.bellerophon(
											Numbers.add(Numbers.multiply(left,
													Numbers.expt(CommonSymbols.TEN_INTEGER,
															Numbers.subtract(length, start2))),
													right),
											Numbers.minus(Numbers.subtract(length, start2))));
		}
		if (!pcase_var2.eql(reader.$kw166$EXPONENT_VALUE))
			return reader.invalid_token_syntax_error(stream, token);
		SubLObject left = CommonSymbols.NIL != start1
				? reader.parse_integer(buffer, start1, end1, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED)
				: CommonSymbols.NIL;
		SubLObject right = CommonSymbols.NIL != start2
				? reader.parse_integer(buffer, start2, end2, CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED)
				: CommonSymbols.NIL;
		SubLObject exponent = reader.parse_integer(buffer, start3, length, CommonSymbols.TEN_INTEGER,
				CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != left && CommonSymbols.NIL != right)
			return Numbers
					.multiply(sign,
							math_utilities
									.bellerophon(
											Numbers.add(Numbers.multiply(left,
													Numbers.expt(CommonSymbols.TEN_INTEGER,
															Numbers.subtract(end2, start2))),
													right),
											Numbers.subtract(Numbers.multiply(exponent_sign, exponent),
													Numbers.subtract(end2, start2))));
		if (CommonSymbols.NIL != left)
			return Numbers.multiply(sign, math_utilities.bellerophon(left, Numbers.multiply(exponent_sign, exponent)));
		if (CommonSymbols.NIL != right)
			return Numbers.multiply(sign, math_utilities.bellerophon(right,
					Numbers.subtract(Numbers.multiply(exponent_sign, exponent), Numbers.subtract(end2, start2))));
		return reader.invalid_token_syntax_error(stream, token);
	}

	@SubL(source = "sublisp/reader.lisp", position = 41275L)
	public static SubLObject parse_symbol_or_consing_dot(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		reader.frob_case(token);
		SubLObject buffer = reader.read_token_buffer(token);
		SubLObject length = reader.read_token_pointer(token);
		SubLObject escapes = reader.read_token_escapes(token);
		SubLObject pkg_idx1 = CommonSymbols.NIL;
		SubLObject pkg_idx2 = CommonSymbols.NIL;
		SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
		SubLObject i;
		SubLObject ch;
		SubLObject escape_idx;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(buffer, i);
			escape_idx = escapes.first();
			if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
				escapes = escapes.rest();
			else if (CommonSymbols.NIL != reader.package_marker_traitp(ch)) {
				if (CommonSymbols.NIL != pkg_idx2)
					reader.invalid_token_syntax_error(stream, token);
				else if (CommonSymbols.NIL != pkg_idx1)
					pkg_idx2 = i;
				else
					pkg_idx1 = i;
			} else if (CommonSymbols.NIL != reader.dot_traitp(ch))
				dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
		}
		if (dot_count.numE(length)) {
			if (length.numE(CommonSymbols.ONE_INTEGER)
					&& CommonSymbols.NIL != reader.$reading_list$.getDynamicValue(thread)
					&& CommonSymbols.NIL == reader.$reading_fake_list$.getDynamicValue(thread))
				return reader.$consing_dot$.getDynamicValue(thread);
			return reader.invalid_token_syntax_error(stream, token);
		} else {
			if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL == pkg_idx2
					&& pkg_idx1.numE(CommonSymbols.ZERO_INTEGER)) {
				if (!length.numG(CommonSymbols.ONE_INTEGER))
					reader.invalid_token_syntax_error(stream, token);
				return Symbols.make_keyword(Sequences.subseq(buffer, CommonSymbols.ONE_INTEGER, length));
			}
			if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL == pkg_idx2
					&& pkg_idx1.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER))) {
				SubLObject v_package = reader.reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1);
				SubLObject name = Sequences.subseq(buffer, Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER), length);
				thread.resetMultipleValues();
				SubLObject symbol = Packages.find_symbol(name, v_package);
				SubLObject status = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (status == reader.$kw151$EXTERNAL)
					return symbol;
				if (v_package.eql(reader.$keyword_package$.getGlobalValue()))
					return Symbols.make_keyword(name);
				reader.simple_reader_error(reader.$str152$_S_is_not_external_in__S_, ConsesLow.list(name, v_package));
				return CommonSymbols.NIL;
			} else {
				if (CommonSymbols.NIL != pkg_idx1 && CommonSymbols.NIL != pkg_idx2
						&& pkg_idx2.numE(Numbers.add(pkg_idx1, CommonSymbols.ONE_INTEGER))
						&& pkg_idx1.numG(CommonSymbols.ZERO_INTEGER)
						&& pkg_idx2.numL(Numbers.subtract(length, CommonSymbols.ONE_INTEGER)))
					return Packages.intern(
							Sequences.subseq(buffer, Numbers.add(pkg_idx2, CommonSymbols.ONE_INTEGER), length),
							reader.reader_find_package(buffer, CommonSymbols.ZERO_INTEGER, pkg_idx1));
				if (CommonSymbols.NIL == pkg_idx1 && CommonSymbols.NIL == pkg_idx2 && length.isPositive())
					return Packages.intern(Sequences.subseq(buffer, CommonSymbols.ZERO_INTEGER, length),
							Packages.$package$.getDynamicValue(thread));
				return reader.invalid_token_syntax_error(stream, token);
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 37714L)
	public static SubLObject parse_token(SubLObject stream, SubLObject token) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return CommonSymbols.NIL;
		SubLObject escapes = Sequences.nreverse(reader.read_token_escapes(token));
		reader._csetf_read_token_escapes(token, escapes);
		if (CommonSymbols.NIL == escapes && CommonSymbols.NIL != reader
				.potential_number_p(reader.read_token_buffer(token), reader.read_token_pointer(token)))
			return reader.parse_number(stream, token);
		return reader.parse_symbol_or_consing_dot(stream, token);
	}

	@SubL(source = "sublisp/reader.lisp", position = 12280L)
	public static SubLObject plus_sign_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$plus_sign$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 34594L)
	public static SubLObject potential_number_p(SubLObject string, SubLObject length) {
		SubLObject letter_seen_p = CommonSymbols.NIL;
		SubLObject i;
		SubLObject ch;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(string, i);
			if (CommonSymbols.NIL != reader.digit_traitp(ch) || CommonSymbols.NIL != reader.plus_sign_traitp(ch)
					|| CommonSymbols.NIL != reader.minus_sign_traitp(ch)
					|| CommonSymbols.NIL != reader.ratio_marker_traitp(ch)
					|| CommonSymbols.NIL != reader.decimal_point_traitp(ch)
					|| CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_caret)
					|| CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_underbar))
				letter_seen_p = CommonSymbols.NIL;
			else if (CommonSymbols.NIL != reader.exponent_marker_traitp(ch))
				letter_seen_p = CommonSymbols.T;
			else {
				if (CommonSymbols.NIL == reader.alphadigit_traitp(ch) || CommonSymbols.NIL != letter_seen_p)
					return CommonSymbols.NIL;
				letter_seen_p = CommonSymbols.T;
			}
		}
		SubLObject decimal_point_p = CommonSymbols.NIL;
		SubLObject decimal_digit_p = CommonSymbols.NIL;
		SubLObject digit_p = CommonSymbols.NIL;
		SubLObject j;
		SubLObject ch2;
		for (j = CommonSymbols.NIL, j = CommonSymbols.ZERO_INTEGER; j
				.numL(length); j = Numbers.add(j, CommonSymbols.ONE_INTEGER)) {
			ch2 = Strings.sublisp_char(string, j);
			if (CommonSymbols.NIL != reader.digit_traitp(ch2))
				digit_p = CommonSymbols.T;
			if (CommonSymbols.NIL != Characters.digit_char_p(ch2, CommonSymbols.TEN_INTEGER))
				decimal_digit_p = CommonSymbols.T;
			if (CommonSymbols.NIL != reader.decimal_point_traitp(ch2))
				decimal_point_p = CommonSymbols.T;
		}
		if (CommonSymbols.NIL != decimal_point_p && CommonSymbols.NIL == decimal_digit_p
				|| CommonSymbols.NIL == digit_p)
			return CommonSymbols.NIL;
		SubLObject first = Strings.sublisp_char(string, CommonSymbols.ZERO_INTEGER);
		if (CommonSymbols.NIL == reader.digit_traitp(first) && CommonSymbols.NIL == reader.plus_sign_traitp(first)
				&& CommonSymbols.NIL == reader.minus_sign_traitp(first)
				&& CommonSymbols.NIL == reader.decimal_point_traitp(first)
				&& CommonSymbols.NIL == Characters.charE(first, Characters.CHAR_caret)
				&& CommonSymbols.NIL == Characters.charE(first, Characters.CHAR_underbar))
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL != reader.package_marker_traitp(first))
			return CommonSymbols.NIL;
		SubLObject last = Strings.sublisp_char(string, Numbers.subtract(length, CommonSymbols.ONE_INTEGER));
		if (CommonSymbols.NIL != reader.plus_sign_traitp(last) || CommonSymbols.NIL != reader.minus_sign_traitp(last))
			return CommonSymbols.NIL;
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 12546L)
	public static SubLObject ratio_marker_traitp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Numbers.plusp(Numbers.logand(reader.$ratio_marker$.getGlobalValue(),
				reader.character_traits(ch, reader.$readtable$.getDynamicValue(thread))));
	}

	@SubL(source = "sublisp/reader.lisp", position = 28046L)
	public static SubLObject read(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		SubLObject value = reader.read_preserving_whitespace(stream, eof_error_p, eof_value, recursivep);
		SubLObject ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != ch
				&& (CommonSymbols.NIL == reader.whitespace_syntaxp(ch) || CommonSymbols.NIL != recursivep))
			streams_high.unread_char(ch, stream);
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 28443L)
	public static SubLObject read_delimited_list(SubLObject v_char, SubLObject stream, SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		SubLObject list = CommonSymbols.NIL;
		SubLObject tail = CommonSymbols.NIL;
		while (true) {
			SubLObject ch = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL != Characters.charE(ch, v_char))
				break;
			if (CommonSymbols.NIL != reader.whitespace_syntaxp(ch))
				continue;
			streams_high.unread_char(ch, stream);
			SubLObject next = ConsesLow.cons(reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T),
					CommonSymbols.NIL);
			if (CommonSymbols.NIL != list) {
				ConsesLow.rplacd(tail, next);
				tail = tail.rest();
			} else
				list = tail = next;
		}
		return list;
	}

	@SubL(source = "sublisp/reader.lisp", position = 73341L)
	public static SubLObject read_features(SubLObject stream) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject features = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
		try {
			reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
			features = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		} finally {
			reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
		}
		return reader.features_match(reader.fix_features(features));
	}

	@SubL(source = "sublisp/reader.lisp", position = 28913L)
	public static SubLObject read_from_string(SubLObject string, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject start, SubLObject end, SubLObject preserve_whitespace) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		if (preserve_whitespace == CommonSymbols.UNPROVIDED)
			preserve_whitespace = CommonSymbols.NIL;
		SubLObject result = CommonSymbols.NIL;
		SubLObject index = CommonSymbols.NIL;
		SubLObject in = CommonSymbols.NIL;
		try {
			in = streams_high.make_private_string_input_stream(string, start, end);
			if (CommonSymbols.NIL != preserve_whitespace)
				result = reader.read_preserving_whitespace(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
			else
				result = reader.read(in, eof_error_p, eof_value, CommonSymbols.UNPROVIDED);
			index = streams_high.stream_input_index(in);
		} finally {
			SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
			try {
				Dynamic.bind(Threads.$is_thread_performing_cleanupP$, CommonSymbols.T);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(in, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return Values.values(result, index);
	}

	@SubL(source = "sublisp/reader.lisp", position = 30932L)
	public static SubLObject read_from_string_ignoring_errors(SubLObject string, SubLObject eof_error_p,
			SubLObject eof_value, SubLObject start, SubLObject end) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw117$EOF;
		if (start == CommonSymbols.UNPROVIDED)
			start = CommonSymbols.ZERO_INTEGER;
		if (end == CommonSymbols.UNPROVIDED)
			end = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject index = CommonSymbols.NIL;
		SubLObject value = CommonSymbols.NIL;
		SubLObject status = CommonSymbols.NIL;
		SubLObject stream = CommonSymbols.NIL;
		try {
			stream = streams_high.make_private_string_input_stream(string, start, end);
			thread.resetMultipleValues();
			SubLObject value_1 = reader.read_ignoring_errors(stream, eof_error_p, eof_value);
			SubLObject status_1 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			value = value_1;
			status = status_1;
			index = streams_high.stream_input_index(stream);
		} finally {
			SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, thread);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(stream, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		}
		if (status == reader.$kw118$ERROR)
			return Values.values(value, status);
		return Values.values(value, index);
	}

	@SubL(source = "sublisp/reader.lisp", position = 30308L)
	public static SubLObject read_ignoring_errors(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = StreamsLow.$standard_input$.getDynamicValue();
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = reader.$kw117$EOF;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject end_of_file_p = CommonSymbols.NIL;
		SubLObject reader_error_p = CommonSymbols.NIL;
		SubLObject result = CommonSymbols.NIL;
		try {
			thread.throwStack.push(reader.$sym108$END_OF_FILE);
			try {
				thread.throwStack.push(reader.$sym106$READER_ERROR);
				SubLObject _prev_bind_0 = reader.$throw_end_of_file_p$.currentBinding(thread);
				SubLObject _prev_bind_2 = reader.$throw_reader_error_p$.currentBinding(thread);
				try {
					reader.$throw_end_of_file_p$.bind(
							CommonSymbols.NIL != reader.$throw_end_of_file_p$.getDynamicValue(thread) ? CommonSymbols.T
									: SubLObjectFactory.makeBoolean(CommonSymbols.NIL == eof_error_p),
							thread);
					reader.$throw_reader_error_p$.bind(CommonSymbols.T, thread);
					result = reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				} finally {
					reader.$throw_reader_error_p$.rebind(_prev_bind_2, thread);
					reader.$throw_end_of_file_p$.rebind(_prev_bind_0, thread);
				}
			} catch (Throwable ccatch_env_var) {
				reader_error_p = Errors.handleThrowable(ccatch_env_var, reader.$sym106$READER_ERROR);
			} finally {
				thread.throwStack.pop();
			}
		} catch (Throwable ccatch_env_var) {
			end_of_file_p = Errors.handleThrowable(ccatch_env_var, reader.$sym108$END_OF_FILE);
		} finally {
			thread.throwStack.pop();
		}
		if (CommonSymbols.NIL != reader_error_p)
			return Values.values(CommonSymbols.NIL, reader.$kw118$ERROR);
		if (CommonSymbols.NIL != end_of_file_p)
			return Values.values(eof_value, reader.$kw118$ERROR);
		return Values.values(result, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 24426L)
	public static SubLObject read_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		while (true) {
			SubLObject ch = streams_high.read_char(stream, eof_error_p, CommonSymbols.NIL, CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL == ch)
				return eof_value;
			SubLObject func = reader.character_function(ch, CommonSymbols.UNPROVIDED);
			SubLObject the_result = CommonSymbols.NIL;
			SubLObject good_p = CommonSymbols.NIL;
			if (func == reader.$sym50$CONSTITUENT_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.constituent_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym74$WHITESPACE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.whitespace_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym77$LEFT_PAREN_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.left_paren_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym78$RIGHT_PAREN_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.right_paren_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym79$SINGLE_QUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.single_quote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym81$DOUBLE_QUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.double_quote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym82$BACKQUOTE_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.backquote_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym83$COMMA_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.comma_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else if (func == reader.$sym80$SEMICOLON_RMF) {
				thread.resetMultipleValues();
				SubLObject result = reader.semicolon_rmf(stream, ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			} else {
				thread.resetMultipleValues();
				SubLObject result = Functions.funcall(reader.character_function(ch, CommonSymbols.UNPROVIDED), stream,
						ch);
				SubLObject goodp = thread.secondMultipleValue();
				thread.resetMultipleValues();
				the_result = result;
				good_p = goodp;
			}
			if (CommonSymbols.NIL != good_p)
				return the_result;
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 70892L)
	public static SubLObject read_lookup(SubLObject number) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_lookup_table$.getDynamicValue(thread)) {
			thread.resetMultipleValues();
			SubLObject value = Hashtables.gethash(number, reader.$read_lookup_table$.getDynamicValue(thread),
					CommonSymbols.UNPROVIDED);
			SubLObject valuep = thread.secondMultipleValue();
			thread.resetMultipleValues();
			return Values.values(value, valuep);
		}
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 68539L)
	public static SubLObject read_number_in_radix(SubLObject stream, SubLObject radix) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.read_token(stream, token, CommonSymbols.NIL);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return CommonSymbols.NIL;
		SubLObject number = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
		try {
			reader.$read_base$.bind(radix, thread);
			number = reader.parse_number(stream, token);
		} finally {
			reader.$read_base$.rebind(_prev_bind_0, thread);
		}
		return number;
	}

	@SubL(source = "sublisp/reader.lisp", position = 27576L)
	public static SubLObject read_preserving_whitespace(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value,
			SubLObject recursivep) {
		if (stream == CommonSymbols.UNPROVIDED)
			stream = CommonSymbols.NIL;
		if (eof_error_p == CommonSymbols.UNPROVIDED)
			eof_error_p = CommonSymbols.T;
		if (eof_value == CommonSymbols.UNPROVIDED)
			eof_value = CommonSymbols.NIL;
		if (recursivep == CommonSymbols.UNPROVIDED)
			recursivep = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == recursivep) {
			SubLObject value = CommonSymbols.NIL;
			SubLObject _prev_bind_0 = reader.$read_lookup_table$.currentBinding(thread);
			try {
				reader.$read_lookup_table$.bind(CommonSymbols.NIL, thread);
				value = reader.read_preserving_whitespace(stream, eof_error_p, eof_value, CommonSymbols.T);
			} finally {
				reader.$read_lookup_table$.rebind(_prev_bind_0, thread);
			}
			return value;
		}
		SubLObject value = reader.read_internal(stream, eof_error_p, eof_value);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return CommonSymbols.NIL;
		return value;
	}

	@SubL(source = "sublisp/reader.lisp", position = 32966L)
	public static SubLObject read_token(SubLObject stream, SubLObject token, SubLObject escapep) {
		SubLThread thread = SubLProcess.currentSubLThread();
		while (true) {
			SubLObject ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL,
					CommonSymbols.UNPROVIDED);
			if (CommonSymbols.NIL != escapep) {
				if (CommonSymbols.NIL == ch)
					reader.end_of_file_error(stream);
				else if (CommonSymbols.NIL != reader.constituent_syntaxp(ch)
						|| CommonSymbols.NIL != reader.non_terminating_macro_syntaxp(ch)
						|| CommonSymbols.NIL != reader.terminating_macro_syntaxp(ch)
						|| CommonSymbols.NIL != reader.whitespace_syntaxp(ch))
					reader.add_to_token(ch, token, CommonSymbols.T);
				else if (CommonSymbols.NIL != reader.single_escape_syntaxp(ch))
					reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				else if (CommonSymbols.NIL != reader.multiple_escape_syntaxp(ch))
					escapep = CommonSymbols.NIL;
				else if (CommonSymbols.NIL != reader.invalid_syntaxp(ch)
						&& CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
					reader.simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
				else
					reader.simple_reader_error(reader.$str144$Fell_through_character_syntax_on_, ConsesLow.list(ch));
			} else {
				if (CommonSymbols.NIL == ch)
					return token;
				if (CommonSymbols.NIL != reader.constituent_syntaxp(ch)
						|| CommonSymbols.NIL != reader.non_terminating_macro_syntaxp(ch))
					reader.add_to_token(ch, token, CommonSymbols.NIL);
				else if (CommonSymbols.NIL != reader.single_escape_syntaxp(ch))
					reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
				else if (CommonSymbols.NIL != reader.multiple_escape_syntaxp(ch))
					escapep = CommonSymbols.T;
				else if (CommonSymbols.NIL != reader.invalid_syntaxp(ch)
						&& CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
					reader.simple_reader_error(reader.$str143$_A_is_an_invalid_character_, ConsesLow.list(ch));
				else {
					if (CommonSymbols.NIL != reader.terminating_macro_syntaxp(ch)
							|| CommonSymbols.NIL != reader.whitespace_syntaxp(ch)) {
						streams_high.unread_char(ch, stream);
						return token;
					}
					reader.simple_reader_error(reader.$str144$Fell_through_character_syntax_on_, ConsesLow.list(ch));
				}
			}
		}
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_buffer(SubLObject object) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_escapes(SubLObject object) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_p(SubLObject object) {
		return object.getClass() == $read_token_native.class ? CommonSymbols.T : CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_pointer(SubLObject object) {
		assert CommonSymbols.NIL != reader.read_token_p(object) : object;
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject read_token_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 32850L)
	public static SubLObject read_token_string(SubLObject token) {
		return Sequences.subseq(reader.read_token_buffer(token), CommonSymbols.ZERO_INTEGER,
				reader.read_token_pointer(token));
	}

	@SubL(source = "sublisp/reader.lisp", position = 39263L)
	public static SubLObject reader_find_package(SubLObject string, SubLObject start, SubLObject end) {
		SubLObject v_package = Packages.find_package(Sequences.subseq(string, start, end));
		if (CommonSymbols.NIL == v_package)
			reader.simple_reader_error(reader.$str146$_S_is_not_a_known_package_,
					ConsesLow.list(Sequences.subseq(string, start, end)));
		return v_package;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_case(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField2();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_character_syntax(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField3();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_constituent_traits(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField7();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_dispatch_tables(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField9();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_macro_functions(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField5();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_p(SubLObject object) {
		return object.getClass() == $readtable_native.class ? CommonSymbols.T : CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_char_syntax(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField4();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_constit_traits(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField8();
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject readtable_single_byte_macro_functions(SubLObject object) {
		assert CommonSymbols.NIL != reader.readtable_p(object) : object;
		return object.getField6();
	}

	@SubL(source = "sublisp/reader.lisp", position = 15307L)
	public static SubLObject readtablep(SubLObject object) {
		return reader.readtable_p(object);
	}

	@SubL(source = "sublisp/reader.lisp", position = 11572L)
	public static SubLObject reset_trait(SubLObject ch, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_constit_traits(readtable), Characters.char_code(ch),
					reader.$alphabetic$.getGlobalValue());
		Hashtables.remhash(ch, reader.readtable_constituent_traits(readtable));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 55959L)
	public static SubLObject right_paren_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$reading_list$.getDynamicValue(thread))
			return Values.values(reader.$right_paren$.getDynamicValue(thread), CommonSymbols.T);
		if (CommonSymbols.NIL != reader.$ignore_extra_right_parens$.getDynamicValue(thread)) {
			Errors.warn(reader.$str182$Ignoring_unmatched_close_parenthe);
			return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		}
		reader.simple_reader_error(reader.$str183$Unmatched__A_, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 62673L)
	public static SubLObject self_evaluating_atom_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isAtom() && (CommonSymbols.NIL == object
				|| CommonSymbols.T == object || object.isKeyword() || !object.isSymbol()));
	}

	@SubL(source = "sublisp/reader.lisp", position = 56489L)
	public static SubLObject semicolon_rmf(SubLObject stream, SubLObject ch) {
		SubLObject next_ch;
		do
			next_ch = streams_high.read_char(stream, CommonSymbols.NIL, CommonSymbols.NIL, CommonSymbols.UNPROVIDED);
		while (CommonSymbols.NIL != next_ch && CommonSymbols.NIL == Characters.charE(next_ch, Characters.CHAR_return)
				&& CommonSymbols.NIL == Characters.charE(next_ch, Characters.CHAR_newline));
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 10477L)
	public static SubLObject set_character_function(SubLObject ch, SubLObject func, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, reader.readtable_macro_functions(readtable), func);
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_macro_functions(readtable), Characters.char_code(ch), func);
		return func;
	}

	@SubL(source = "sublisp/reader.lisp", position = 9244L)
	public static SubLObject set_character_syntax(SubLObject ch, SubLObject syntax, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		Hashtables.sethash(ch, reader.readtable_character_syntax(readtable), syntax);
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_char_syntax(readtable), Characters.char_code(ch), syntax);
		return syntax;
	}

	@SubL(source = "sublisp/reader.lisp", position = 15377L)
	public static SubLObject set_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char,
			SubLObject new_function, SubLObject readtable) {
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		if (CommonSymbols.NIL != Characters.digit_char_p(sub_char, CommonSymbols.UNPROVIDED))
			Errors.error(reader.$str72$Attempt_to_make_decimal_digit__A_, sub_char);
		SubLObject bucket = conses_high.assoc(disp_char, reader.readtable_dispatch_tables(readtable),
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL == bucket)
			Errors.error(reader.$str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);
		Hashtables.sethash(Characters.char_upcase(sub_char), bucket.rest(), new_function);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 16611L)
	public static SubLObject set_macro_character(SubLObject v_char, SubLObject new_function,
			SubLObject non_terminating_p, SubLObject readtable) {
		if (non_terminating_p == CommonSymbols.UNPROVIDED)
			non_terminating_p = CommonSymbols.NIL;
		if (readtable == CommonSymbols.UNPROVIDED)
			readtable = reader.$readtable$.getDynamicValue();
		reader.set_character_function(v_char, new_function, readtable);
		reader.set_character_syntax(v_char, CommonSymbols.NIL != non_terminating_p ? reader.$kw61$NON_TERMINATING_MACRO
				: reader.$kw60$TERMINATING_MACRO, readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 71141L)
	public static SubLObject set_read_lookup(SubLObject number, SubLObject object) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == reader.$read_lookup_table$.getDynamicValue(thread))
			reader.$read_lookup_table$.setDynamicValue(
					Hashtables.make_hash_table(reader.$int4$32, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED),
					thread);
		Hashtables.sethash(number, reader.$read_lookup_table$.getDynamicValue(thread), object);
		return object;
	}

	@SubL(source = "sublisp/reader.lisp", position = 18313L)
	public static SubLObject set_syntax(SubLObject ch, SubLObject syntax, SubLObject function) {
		SubLThread thread = SubLProcess.currentSubLThread();
		reader.set_macro_character(ch, function, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue(thread));
		reader.set_character_syntax(ch, syntax, reader.$standard_readtable$.getDynamicValue(thread));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 17001L)
	public static SubLObject set_syntax_from_char(SubLObject to_char, SubLObject from_char, SubLObject from_readtable,
			SubLObject to_readtable) {
		if (from_readtable == CommonSymbols.UNPROVIDED)
			from_readtable = CommonSymbols.NIL;
		if (to_readtable == CommonSymbols.UNPROVIDED)
			to_readtable = reader.$readtable$.getDynamicValue();
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == from_readtable)
			from_readtable = reader.$standard_readtable$.getDynamicValue(thread);
		SubLObject pcase_var;
		SubLObject syntax = pcase_var = CommonSymbols.NIL != reader.single_byte_p(from_char)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(from_readtable),
						Characters.char_code(from_char))
				: Hashtables.gethash(from_char, reader.readtable_character_syntax(from_readtable),
						reader.$kw49$CONSTITUENT);
		if (pcase_var.eql(reader.$kw60$TERMINATING_MACRO) || pcase_var.eql(reader.$kw61$NON_TERMINATING_MACRO)) {
			SubLObject rmf = reader.character_function(from_char, from_readtable);
			if (rmf == reader.$sym71$DISPATCHING_RMF) {
				SubLObject from_table = conses_high.assoc(from_char, reader.readtable_dispatch_tables(from_readtable),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED).rest();
				SubLObject to_table = Hashtables.make_hash_table(Hashtables.hash_table_count(from_table),
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				reader._csetf_readtable_dispatch_tables(to_readtable, ConsesLow.cons(
						ConsesLow.cons(to_char, reader.Xcopy_hash_table(from_table, to_table)),
						Sequences.delete(to_char, reader.readtable_dispatch_tables(to_readtable),
								Symbols.symbol_function(CommonSymbols.EQL), Symbols.symbol_function(reader.$sym70$CAR),
								CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)));
			}
			reader.set_character_function(to_char, rmf, to_readtable);
		} else if (pcase_var.eql(reader.$kw49$CONSTITUENT))
			reader.reset_trait(to_char, to_readtable);
		reader.set_character_syntax(to_char, syntax, to_readtable);
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/reader.lisp", position = 11245L)
	public static SubLObject set_trait(SubLObject ch, SubLObject readtable, SubLObject trait) {
		SubLObject new_traits = Numbers.logior(trait, reader.character_traits(ch, readtable));
		Hashtables.sethash(ch, reader.readtable_constituent_traits(readtable), new_traits);
		if (CommonSymbols.NIL != reader.single_byte_p(ch))
			Vectors.set_aref(reader.readtable_single_byte_constit_traits(readtable), Characters.char_code(ch),
					new_traits);
		return trait;
	}

	public static SubLObject setup_reader_file() {
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_readtable$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym13$READTABLE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(reader.$list14);
		Structures.def_csetf(reader.$sym15$READTABLE_CASE, reader.$sym16$_CSETF_READTABLE_CASE);
		Structures.def_csetf(reader.$sym17$READTABLE_CHARACTER_SYNTAX, reader.$sym18$_CSETF_READTABLE_CHARACTER_SYNTAX);
		Structures.def_csetf(reader.$sym19$READTABLE_SINGLE_BYTE_CHAR_SYNTAX,
				reader.$sym20$_CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX);
		Structures.def_csetf(reader.$sym21$READTABLE_MACRO_FUNCTIONS, reader.$sym22$_CSETF_READTABLE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym23$READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS,
				reader.$sym24$_CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS);
		Structures.def_csetf(reader.$sym25$READTABLE_CONSTITUENT_TRAITS,
				reader.$sym26$_CSETF_READTABLE_CONSTITUENT_TRAITS);
		Structures.def_csetf(reader.$sym27$READTABLE_SINGLE_BYTE_CONSTIT_TRAITS,
				reader.$sym28$_CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS);
		Structures.def_csetf(reader.$sym29$READTABLE_DISPATCH_TABLES, reader.$sym30$_CSETF_READTABLE_DISPATCH_TABLES);
		Equality.identity(reader.$sym6$READTABLE);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				reader.$dtp_readtable$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym44$VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD));
		reader.$standard_readtable$.setDynamicValue(reader.create_readtable());
		SubLObject cdolist_list_var = reader.$whitespace_1_chars$.getDynamicValue();
		SubLObject v_char = CommonSymbols.NIL;
		v_char = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			reader.set_syntax(v_char, reader.$kw64$WHITESPACE, reader.$sym74$WHITESPACE_RMF);
			cdolist_list_var = cdolist_list_var.rest();
			v_char = cdolist_list_var.first();
		}
		reader.set_syntax(Characters.CHAR_backslash, reader.$kw63$SINGLE_ESCAPE, reader.$sym75$SINGLE_ESCAPE_RMF);
		reader.set_syntax(Characters.CHAR_vertical, reader.$kw62$MULTIPLE_ESCAPE, reader.$sym76$MULTIPLE_ESCAPE_RMF);
		reader.set_macro_character(Characters.CHAR_lparen, reader.$sym77$LEFT_PAREN_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_rparen, reader.$sym78$RIGHT_PAREN_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_quote, reader.$sym79$SINGLE_QUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_semicolon, reader.$sym80$SEMICOLON_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_quotation, reader.$sym81$DOUBLE_QUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_backquote, reader.$sym82$BACKQUOTE_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_macro_character(Characters.CHAR_comma, reader.$sym83$COMMA_RMF, CommonSymbols.NIL,
				reader.$standard_readtable$.getDynamicValue());
		reader.make_dispatch_macro_character(Characters.CHAR_hash, CommonSymbols.T,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_backslash,
				reader.$sym84$SHARPSIGN_BACKSLASH_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_quote,
				reader.$sym85$SHARPSIGN_SINGLE_QUOTE_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_lparen,
				reader.$sym86$SHARPSIGN_LEFT_PAREN_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_asterisk,
				reader.$sym87$SHARPSIGN_ASTERISK_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_colon,
				reader.$sym88$SHARPSIGN_COLON_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_period,
				reader.$sym89$SHARPSIGN_DOT_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_B, reader.$sym90$SHARPSIGN_B_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_O, reader.$sym91$SHARPSIGN_O_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_X, reader.$sym92$SHARPSIGN_X_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_R, reader.$sym93$SHARPSIGN_R_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_C, reader.$sym94$SHARPSIGN_C_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_A, reader.$sym95$SHARPSIGN_A_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_S, reader.$sym96$SHARPSIGN_S_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_P, reader.$sym97$SHARPSIGN_P_RMF,
				reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_G,
				reader.$sym98$SHARPSIGN_CAPITAL_G_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_equal,
				reader.$sym99$SHARPSIGN_EQUALS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hash,
				reader.$sym100$SHARPSIGN_SHARPSIGN_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_plus,
				reader.$sym101$SHARPSIGN_PLUS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_hyphen,
				reader.$sym102$SHARPSIGN_MINUS_RMF, reader.$standard_readtable$.getDynamicValue());
		reader.set_dispatch_macro_character(Characters.CHAR_hash, Characters.CHAR_vertical,
				reader.$sym103$SHARPSIGN_VERTICAL_BAR_RMF, reader.$standard_readtable$.getDynamicValue());
		SubLObject cdolist_list_var2;
		SubLObject invalid = cdolist_list_var2 = reader.$list104;
		SubLObject ch = CommonSymbols.NIL;
		ch = cdolist_list_var2.first();
		while (CommonSymbols.NIL != cdolist_list_var2) {
			reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$invalid$.getGlobalValue());
			cdolist_list_var2 = cdolist_list_var2.rest();
			ch = cdolist_list_var2.first();
		}
		SubLObject alphadigit = cdolist_list_var2 = reader.$list105;
		ch = CommonSymbols.NIL;
		ch = cdolist_list_var2.first();
		while (CommonSymbols.NIL != cdolist_list_var2) {
			reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$alphabetic$.getGlobalValue());
			reader.set_trait(ch, reader.$standard_readtable$.getDynamicValue(), reader.$digit$.getGlobalValue());
			cdolist_list_var2 = cdolist_list_var2.rest();
			ch = cdolist_list_var2.first();
		}
		reader.set_trait(Characters.CHAR_colon, reader.$standard_readtable$.getDynamicValue(),
				reader.$package_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_plus, reader.$standard_readtable$.getDynamicValue(),
				reader.$plus_sign$.getGlobalValue());
		reader.set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_hyphen, reader.$standard_readtable$.getDynamicValue(),
				reader.$minus_sign$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$dot$.getGlobalValue());
		reader.set_trait(Characters.CHAR_period, reader.$standard_readtable$.getDynamicValue(),
				reader.$decimal_point$.getGlobalValue());
		reader.set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$alphabetic$.getGlobalValue());
		reader.set_trait(Characters.CHAR_slash, reader.$standard_readtable$.getDynamicValue(),
				reader.$ratio_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_D, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_d, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_E, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_e, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_F, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_f, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_L, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_l, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_S, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		reader.set_trait(Characters.CHAR_s, reader.$standard_readtable$.getDynamicValue(),
				reader.$exponent_marker$.getGlobalValue());
		if (CommonSymbols.NIL == Symbols.boundp(reader.$sym52$_READTABLE_)
				|| CommonSymbols.NIL == reader.$readtable$.getDynamicValue())
			reader.$readtable$.setDynamicValue(
					reader.copy_readtable(reader.$standard_readtable$.getDynamicValue(), CommonSymbols.UNPROVIDED));
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				reader.$dtp_read_token$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym125$READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim(reader.$list126);
		Structures.def_csetf(reader.$sym127$READ_TOKEN_POINTER, reader.$sym128$_CSETF_READ_TOKEN_POINTER);
		Structures.def_csetf(reader.$sym129$READ_TOKEN_BUFFER, reader.$sym130$_CSETF_READ_TOKEN_BUFFER);
		Structures.def_csetf(reader.$sym131$READ_TOKEN_ESCAPES, reader.$sym132$_CSETF_READ_TOKEN_ESCAPES);
		Equality.identity(reader.$sym119$READ_TOKEN);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(),
				reader.$dtp_read_token$.getGlobalValue(),
				Symbols.symbol_function(reader.$sym137$VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 69917L)
	public static SubLObject sharpsign_a_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (!arg.eql(CommonSymbols.ONE_INTEGER) && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unimplemented_reader_macro_error(stream, ch);
		SubLObject contents = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = reader.$reading_fake_list$.currentBinding(thread);
		try {
			reader.$reading_fake_list$.bind(CommonSymbols.T, thread);
			contents = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		} finally {
			reader.$reading_fake_list$.rebind(_prev_bind_0, thread);
		}
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		if (!contents.isList()) {
			reader.simple_reader_error(reader.$str213$The_form_after__A_reader_macro_wa, ConsesLow.list(ch));
			return CommonSymbols.NIL;
		}
		return Values.values(Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), contents),
				CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66736L)
	public static SubLObject sharpsign_asterisk_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			reader.unimplemented_reader_macro_error(stream, ch);
		return Values.values(CommonSymbols.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 68984L)
	public static SubLObject sharpsign_b_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		return Values.values(reader.read_number_in_radix(stream, CommonSymbols.TWO_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 65271L)
	public static SubLObject sharpsign_backslash_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
		reader.read_token(stream, token, CommonSymbols.NIL);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		SubLObject name = reader.read_token_string(token);
		SubLObject ch_$1 = Characters.name_character(name);
		if (CommonSymbols.NIL != ch_$1)
			return Values.values(ch_$1, CommonSymbols.T);
		reader.simple_reader_error(reader.$str208$_S_is_not_the_name_of_a_character, ConsesLow.list(name));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 69740L)
	public static SubLObject sharpsign_c_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			reader.unimplemented_reader_macro_error(stream, ch);
		return Values.values(CommonSymbols.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 53487L)
	public static SubLObject sharpsign_capital_g_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg)
			reader.simple_reader_error(reader.$str171$The__S_reader_macro_does_not_take, ConsesLow.list(ch));
		SubLObject string = reader.read(stream, CommonSymbols.NIL, CommonSymbols.NIL, CommonSymbols.T);
		if (!string.isString())
			reader.simple_reader_error(reader.$str172$The__S_reader_macro_expected_a_st, ConsesLow.list(ch));
		if (CommonSymbols.NIL == Guids.guid_string_p(string))
			reader.simple_reader_error(reader.$str173$The__S_reader_macro_could_not_int, ConsesLow.list(ch, string));
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		return Values.values(Guids.string_to_guid(string), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66920L)
	public static SubLObject sharpsign_colon_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.read_token(stream, token, CommonSymbols.NIL);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			Values.values(CommonSymbols.NIL, CommonSymbols.T);
		else {
			SubLObject escapes = Sequences.nreverse(reader.read_token_escapes(token));
			reader._csetf_read_token_escapes(token, escapes);
			if (CommonSymbols.NIL == escapes && CommonSymbols.NIL != reader
					.potential_number_p(reader.read_token_buffer(token), reader.read_token_pointer(token)))
				reader.invalid_token_syntax_error(stream, token);
			reader.frob_case(token);
			SubLObject buffer = reader.read_token_buffer(token);
			SubLObject length = reader.read_token_pointer(token);
			SubLObject escapes_$2 = reader.read_token_escapes(token);
			SubLObject dot_count = CommonSymbols.ZERO_INTEGER;
			SubLObject i;
			SubLObject ch_$3;
			SubLObject escape_idx;
			for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				ch_$3 = Strings.sublisp_char(buffer, i);
				escape_idx = escapes_$2.first();
				if (CommonSymbols.NIL != escape_idx && escape_idx.numE(i))
					escapes_$2 = escapes_$2.rest();
				else if (CommonSymbols.NIL != reader.package_marker_traitp(ch_$3))
					reader.invalid_token_syntax_error(stream, token);
				else if (CommonSymbols.NIL != reader.dot_traitp(ch_$3))
					dot_count = Numbers.add(dot_count, CommonSymbols.ONE_INTEGER);
			}
			if (!dot_count.numE(length))
				return Values.values(Symbols.make_symbol(reader.read_token_string(token)), CommonSymbols.T);
			reader.invalid_token_syntax_error(stream, token);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 68100L)
	public static SubLObject sharpsign_dot_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		if (CommonSymbols.NIL == reader.$read_eval$.getDynamicValue(thread)) {
			reader.simple_reader_error(reader.$str210$Attempt_the_use_the__A_reader_mac,
					ConsesLow.list(ch, reader.$sym211$_READ_EVAL_, reader.$read_eval$.getDynamicValue(thread)));
			return CommonSymbols.NIL;
		}
		return Values.values(Eval.eval(subform), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 71330L)
	public static SubLObject sharpsign_equals_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.illegal_argument_error(stream, ch, arg);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		thread.resetMultipleValues();
		SubLObject old = reader.read_lookup(arg);
		SubLObject oldp = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL != oldp)
			reader.simple_reader_error(reader.$str214$Label__S_appears_more_than_once_, ConsesLow.list(arg));
		else
			reader.set_read_lookup(arg, subform);
		return Values.values(subform, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 66201L)
	public static SubLObject sharpsign_left_paren_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject elts = reader.read_delimited_list(Characters.CHAR_rparen, stream, CommonSymbols.T);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		SubLObject length = Sequences.length(elts);
		if (CommonSymbols.NIL != arg)
			if (!arg.numE(length))
				if (length.numL(arg))
					elts = ConsesLow.append(elts, ConsesLow.make_list(Numbers.subtract(arg, length),
							conses_high.last(elts, CommonSymbols.UNPROVIDED).first()));
				else
					reader.illegal_argument_error(stream, ch, arg);
		return Values.values(
				reader.$backquote_depth$.getDynamicValue(thread).numG(CommonSymbols.ZERO_INTEGER)
						? ConsesLow.cons(reader.$bq_vector$.getDynamicValue(thread), elts)
						: Functions.apply(Symbols.symbol_function(reader.$sym191$VECTOR), elts),
				CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 73958L)
	public static SubLObject sharpsign_minus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		if (CommonSymbols.NIL != reader.read_features(stream)) {
			SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
			try {
				reader.$read_suppress$.bind(CommonSymbols.T, thread);
				reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
			} finally {
				reader.$read_suppress$.rebind(_prev_bind_0, thread);
			}
			return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		}
		return Values.values(reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69165L)
	public static SubLObject sharpsign_o_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		return Values.values(reader.read_number_in_radix(stream, CommonSymbols.EIGHT_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 70616L)
	public static SubLObject sharpsign_p_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		return Values.values(subform, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 73631L)
	public static SubLObject sharpsign_plus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		if (CommonSymbols.NIL != reader.read_features(stream))
			return Values.values(reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T),
					CommonSymbols.T);
		SubLObject _prev_bind_0 = reader.$read_suppress$.currentBinding(thread);
		try {
			reader.$read_suppress$.bind(CommonSymbols.T, thread);
			reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		} finally {
			reader.$read_suppress$.rebind(_prev_bind_0, thread);
		}
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69556L)
	public static SubLObject sharpsign_r_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		if (CommonSymbols.NIL == arg || !arg.numGE(CommonSymbols.TWO_INTEGER) || !arg.numLE(reader.$int212$36))
			reader.illegal_argument_error(stream, ch, arg);
		return Values.values(reader.read_number_in_radix(stream, arg), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 70424L)
	public static SubLObject sharpsign_s_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			reader.read(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			reader.unimplemented_reader_macro_error(stream, ch);
		return Values.values(CommonSymbols.NIL, CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 72044L)
	public static SubLObject sharpsign_sharpsign_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.illegal_argument_error(stream, ch, arg);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		thread.resetMultipleValues();
		SubLObject old = reader.read_lookup(arg);
		SubLObject oldp = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL != oldp)
			return Values.values(old, CommonSymbols.T);
		reader.simple_reader_error(reader.$str215$Label__S_has_not_been_seen_, ConsesLow.list(arg));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 65876L)
	public static SubLObject sharpsign_single_quote_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject subform = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		if (CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread))
			return Values.values(CommonSymbols.NIL, CommonSymbols.T);
		return Values.values(ConsesLow.list(reader.$sym209$FUNCTION, subform), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 74286L)
	public static SubLObject sharpsign_vertical_bar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		SubLObject depth = CommonSymbols.ONE_INTEGER;
		SubLObject state = reader.$kw154$INITIAL;
		SubLObject ch_$4 = CommonSymbols.NIL;
		ch_$4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
		while (true) {
			SubLObject pcase_var = state;
			if (pcase_var.eql(reader.$kw221$HASH)) {
				SubLObject pcase_var_$5 = ch_$4;
				if (pcase_var_$5.eql(Characters.CHAR_vertical)) {
					depth = Numbers.add(depth, CommonSymbols.ONE_INTEGER);
					state = reader.$kw154$INITIAL;
				} else if (!pcase_var_$5.eql(Characters.CHAR_hash))
					state = reader.$kw154$INITIAL;
			} else if (pcase_var.eql(reader.$kw222$VERTICAL_BAR)) {
				SubLObject pcase_var_$6 = ch_$4;
				if (!pcase_var_$6.eql(Characters.CHAR_vertical))
					if (pcase_var_$6.eql(Characters.CHAR_hash)) {
						depth = Numbers.subtract(depth, CommonSymbols.ONE_INTEGER);
						if (depth.isZero())
							break;
					} else
						state = reader.$kw154$INITIAL;
			} else if (pcase_var.eql(reader.$kw154$INITIAL)) {
				SubLObject pcase_var_$7 = ch_$4;
				if (pcase_var_$7.eql(Characters.CHAR_vertical))
					state = reader.$kw222$VERTICAL_BAR;
				else if (pcase_var_$7.eql(Characters.CHAR_hash))
					state = reader.$kw221$HASH;
			}
			ch_$4 = streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		}
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 69360L)
	public static SubLObject sharpsign_x_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != arg && CommonSymbols.NIL == reader.$read_suppress$.getDynamicValue(thread))
			reader.unnecessary_argument_error(stream, ch);
		return Values.values(reader.read_number_in_radix(stream, CommonSymbols.SIXTEEN_INTEGER), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23097L)
	public static SubLObject simple_reader_error(SubLObject format_control, SubLObject format_arguments) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != reader.$throw_reader_error_p$.getDynamicValue(thread))
			Dynamic.sublisp_throw(reader.$sym106$READER_ERROR, CommonSymbols.T);
		else
			Functions.apply(Symbols.symbol_function(reader.$sym107$ERROR), format_control, format_arguments);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 8876L)
	public static SubLObject single_byte_p(SubLObject ch) {
		return Numbers.numL(Characters.char_code(ch), reader.$single_byte_max_code$.getGlobalValue());
	}

	@SubL(source = "sublisp/reader.lisp", position = 53117L)
	public static SubLObject single_escape_rmf(SubLObject stream, SubLObject ch) {
		SubLObject token = reader.make_read_token(CommonSymbols.UNPROVIDED);
		reader._csetf_read_token_pointer(token, CommonSymbols.ZERO_INTEGER);
		reader._csetf_read_token_buffer(token,
				Strings.make_string(reader.$initial_token_size$.getGlobalValue(), CommonSymbols.UNPROVIDED));
		reader._csetf_read_token_escapes(token, CommonSymbols.NIL);
		reader.add_to_token(streams_high.read_char(stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED), token, CommonSymbols.T);
		reader.read_token(stream, token, CommonSymbols.NIL);
		return Values.values(reader.parse_token(stream, token), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9882L)
	public static SubLObject single_escape_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw63$SINGLE_ESCAPE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 56303L)
	public static SubLObject single_quote_rmf(SubLObject stream, SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject object = reader.read(stream, CommonSymbols.T, CommonSymbols.NIL, CommonSymbols.T);
		return Values.values(CommonSymbols.NIL != reader.$read_suppress$.getDynamicValue(thread) ? CommonSymbols.NIL
				: ConsesLow.list(reader.$sym184$QUOTE, object), CommonSymbols.T);
	}

	@SubL(source = "sublisp/reader.lisp", position = 38239L)
	public static SubLObject symbol_escapep(SubLObject symbol) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject name = Symbols.symbol_name(symbol);
		SubLObject length = Sequences.length(name);
		SubLObject escapep = CommonSymbols.NIL;
		SubLObject _prev_bind_0 = reader.$read_base$.currentBinding(thread);
		try {
			reader.$read_base$.bind(print_high.$print_base$.getDynamicValue(thread), thread);
			escapep = reader.potential_number_p(name, length);
		} finally {
			reader.$read_base$.rebind(_prev_bind_0, thread);
		}
		if (CommonSymbols.NIL != escapep)
			return CommonSymbols.T;
		SubLObject non_consing_dot = CommonSymbols.NIL;
		SubLObject v_case = reader.readtable_case(reader.$readtable$.getDynamicValue(thread));
		SubLObject i;
		SubLObject ch;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			ch = Strings.sublisp_char(name, i);
			if (!Characters.CHAR_vertical.equalp(ch) && CommonSymbols.NIL == reader.constituent_syntaxp(ch))
				return CommonSymbols.T;
			if (CommonSymbols.NIL != reader.package_marker_traitp(ch))
				return CommonSymbols.T;
			if (CommonSymbols.NIL == reader.dot_traitp(ch))
				non_consing_dot = CommonSymbols.T;
			if (CommonSymbols.NIL != Characters.both_case_p(ch)) {
				if (CommonSymbols.NIL != Characters.lower_case_p(ch) && v_case == reader.$kw48$UPCASE)
					return CommonSymbols.T;
				if (CommonSymbols.NIL != Characters.upper_case_p(ch) && v_case == reader.$kw145$DOWNCASE)
					return CommonSymbols.T;
			}
		}
		return SubLObjectFactory.makeBoolean(CommonSymbols.NIL == non_consing_dot);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9596L)
	public static SubLObject terminating_macro_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw60$TERMINATING_MACRO);
	}

	@SubL(source = "sublisp/reader.lisp", position = 23813L)
	public static SubLObject unimplemented_reader_macro_error(SubLObject stream, SubLObject ch) {
		reader.simple_reader_error(reader.$str111$The__A_reader_macro_is_not_implem, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 23974L)
	public static SubLObject unnecessary_argument_error(SubLObject stream, SubLObject ch) {
		reader.simple_reader_error(reader.$str112$The__A_reader_macro_does_not_take, ConsesLow.list(ch));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject visit_defstruct_object_read_token_method(SubLObject obj, SubLObject visitor_fn) {
		return reader.visit_defstruct_read_token(obj, visitor_fn);
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject visit_defstruct_object_readtable_method(SubLObject obj, SubLObject visitor_fn) {
		return reader.visit_defstruct_readtable(obj, visitor_fn);
	}

	@SubL(source = "sublisp/reader.lisp", position = 31900L)
	public static SubLObject visit_defstruct_read_token(SubLObject obj, SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, reader.$kw40$BEGIN, reader.$sym136$MAKE_READ_TOKEN,
				CommonSymbols.THREE_INTEGER);
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw133$POINTER, reader.read_token_pointer(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw134$BUFFER, reader.read_token_buffer(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw135$ESCAPES, reader.read_token_escapes(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw43$END, reader.$sym136$MAKE_READ_TOKEN,
				CommonSymbols.THREE_INTEGER);
		return obj;
	}

	@SubL(source = "sublisp/reader.lisp", position = 6265L)
	public static SubLObject visit_defstruct_readtable(SubLObject obj, SubLObject visitor_fn) {
		Functions.funcall(visitor_fn, obj, reader.$kw40$BEGIN, reader.$sym41$MAKE_READTABLE,
				CommonSymbols.EIGHT_INTEGER);
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw31$CASE, reader.readtable_case(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw32$CHARACTER_SYNTAX,
				reader.readtable_character_syntax(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw33$SINGLE_BYTE_CHAR_SYNTAX,
				reader.readtable_single_byte_char_syntax(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw34$MACRO_FUNCTIONS,
				reader.readtable_macro_functions(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw35$SINGLE_BYTE_MACRO_FUNCTIONS,
				reader.readtable_single_byte_macro_functions(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw36$CONSTITUENT_TRAITS,
				reader.readtable_constituent_traits(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw37$SINGLE_BYTE_CONSTIT_TRAITS,
				reader.readtable_single_byte_constit_traits(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw42$SLOT, reader.$kw38$DISPATCH_TABLES,
				reader.readtable_dispatch_tables(obj));
		Functions.funcall(visitor_fn, obj, reader.$kw43$END, reader.$sym41$MAKE_READTABLE, CommonSymbols.EIGHT_INTEGER);
		return obj;
	}

	@SubL(source = "sublisp/reader.lisp", position = 4948L)
	public static SubLObject whitespace_1_char_p(SubLObject v_char) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return conses_high.member(v_char, reader.$whitespace_1_chars$.getDynamicValue(thread), CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/reader.lisp", position = 5249L)
	public static SubLObject whitespace_2_char_p(SubLObject v_char) {
		return reader.whitespace_syntaxp(v_char);
	}

	@SubL(source = "sublisp/reader.lisp", position = 52444L)
	public static SubLObject whitespace_rmf(SubLObject stream, SubLObject ch) {
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
	}

	@SubL(source = "sublisp/reader.lisp", position = 9968L)
	public static SubLObject whitespace_syntaxp(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Equality.eq(CommonSymbols.NIL != reader.single_byte_p(ch)
				? Vectors.aref(reader.readtable_single_byte_char_syntax(reader.$readtable$.getDynamicValue(thread)),
						Characters.char_code(ch))
				: Hashtables.gethash(ch, reader.readtable_character_syntax(reader.$readtable$.getDynamicValue(thread)),
						reader.$kw49$CONSTITUENT),
				reader.$kw64$WHITESPACE);
	}

	@SubL(source = "sublisp/reader.lisp", position = 32004L)
	public static SubLObject with_read_token(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject token = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, reader.$list138);
		token = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.listS(reader.$sym114$CLET, ConsesLow.list(reader.bq_cons(token, reader.$list139)),
				reader.$list140, reader.$list141, reader.$list142, ConsesLow.append(body, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 29570L)
	public static SubLObject with_special_reader_error_handling(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return reader.bq_cons(reader.$sym116$PROGN, ConsesLow.append(body, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 29330L)
	public static SubLObject with_standard_io_syntax(SubLObject macroform, SubLObject environment) {
		SubLObject datum = macroform.rest();
		SubLObject body;
		SubLObject current = body = datum;
		return ConsesLow.listS(reader.$sym114$CLET, reader.$list115, ConsesLow.append(body, CommonSymbols.NIL));
	}

	@SubL(source = "sublisp/reader.lisp", position = 12875L)
	public static SubLObject Xcopy_hash_table(SubLObject from, SubLObject to) {
		SubLObject k = CommonSymbols.NIL;
		SubLObject v = CommonSymbols.NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(from);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				k = Hashtables.getEntryKey(cdohash_entry);
				v = Hashtables.getEntryValue(cdohash_entry);
				Hashtables.sethash(k, to, v);
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		return to;
	}

	public void declareFunctions() {
		reader.declare_reader_file();
	}

	public void initializeVariables() {
		reader.init_reader_file();
	}

	public void runTopLevelForms() {
		reader.setup_reader_file();
	}
}
