//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
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

public class format extends SubLTranslatedFile {
	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.format";

	@SubL(source = "sublisp/format.lisp", position = 1375L)
	private static SubLSymbol $format_directives$;

	@SubL(source = "sublisp/format.lisp", position = 1426L)
	private static SubLSymbol $matching_brackets$;

	@SubL(source = "sublisp/format.lisp", position = 37249L)
	private static SubLSymbol $remaining_args$;

	private static SubLInteger $int0$50;

	private static SubLList $list1;

	private static SubLSymbol $sym2$PROGN;

	private static SubLSymbol $sym3$DECLAIM;

	private static SubLSymbol $sym4$FACCESS;

	private static SubLSymbol $sym5$PRIVATE;

	private static SubLSymbol $sym6$DEFINE;

	private static SubLSymbol $sym7$SETHASH;

	private static SubLSymbol $sym8$_FORMAT_DIRECTIVES_;

	private static SubLSymbol $sym9$FUNCTION;

	private static SubLList $list10;

	private static SubLSymbol $sym11$_MATCHING_BRACKETS_;

	private static SubLString $str12$The__A_format_directive_is_not_ye;

	private static SubLString $str13$The____C_format_directive_does_no;

	private static SubLString $str14$The____C_format_directive_does_no;

	private static SubLString $str15$The____C_format_directive_does_no;

	private static SubLSymbol $sym16$OR;

	private static SubLSymbol $sym17$INTEGER;

	private static SubLList $list18;

	private static SubLString $str19$Unrecognized_type_specifier__S_;

	private static SubLSymbol $sym20$CHARACTER;

	private static SubLSymbol $sym21$NULL;

	private static SubLList $list22;

	private static SubLString $str23$TAIL;

	private static SubLList $list24;

	private static SubLSymbol $sym25$CSETF;

	private static SubLSymbol $sym26$CAR;

	private static SubLSymbol $sym27$CPOP;

	private static SubLSymbol $sym28$PUNLESS;

	private static SubLSymbol $sym29$FORMAT_TYPEP;

	private static SubLSymbol $sym30$QUOTE;

	private static SubLSymbol $sym31$ERROR;

	private static SubLString $str32$The__S_parameter__S_is_not_of_typ;

	private static SubLList $list33;

	private static SubLSymbol $sym34$CLET;

	private static SubLSymbol $sym35$PWHEN;

	private static SubLList $list36;

	private static SubLString $str37$Stray____C_directive_in__S_string;

	private static SubLSymbol $sym38$FORMAT;

	private static SubLString $str39$_S_is_not_a_recognized__S_control;

	private static SubLString $str40$_S_directive__S_ran_out_of_argume;

	private static SubLString $str41$No_matching__S_found_for__S_in__S;

	private static SubLString $str42$The__S__S_directive_takes_a_list_;

	private static SubLString $str43$_S_is_not_a_valid__S_control_;

	private static SubLString $str44$_S_is_not_a_valid__S_repitition_s;

	private static SubLString $str45$Too_many__S_parameters_;

	private static SubLSymbol $sym46$CHARACTERP;

	private static SubLString $str47$__;

	private static SubLSymbol $sym48$FORMAT_C_DIRECTIVE;

	private static SubLList $list49;

	private static SubLSymbol $sym50$FORMAT_PERCENT_DIRECTIVE;

	private static SubLSymbol $sym51$FORMAT_AMPERSAND_DIRECTIVE;

	private static SubLSymbol $sym52$FORMAT_VERTICAL_BAR_DIRECTIVE;

	private static SubLSymbol $sym53$FORMAT_TILDE_DIRECTIVE;

	private static SubLList $list54;

	private static SubLList $list55;

	private static SubLString $str56$_;

	private static SubLString $str57$_;

	private static SubLSymbol $sym58$INTEGERP;

	private static SubLObject $ic59;

	private static SubLString $str60$_times_ten_to_the_;

	private static SubLString $str61$_power;

	private static SubLString $str62$_plus;

	private static SubLInteger $int63$1000;

	private static SubLInteger $int64$100;

	private static SubLObject $ic65;

	private static SubLString $str66$_hundred;

	private static SubLObject $ic67;

	private static SubLObject $ic68;

	private static SubLObject $ic69;
	private static SubLString $str70$zero;
	private static SubLString $str71$minus_;
	private static SubLString $str72$zeroth;
	private static SubLObject $ic73;
	private static SubLObject $ic74;
	private static SubLObject $ic75;
	private static SubLString $str76$th;
	private static SubLInteger $int77$36;
	private static SubLString $str78$_S_is_not_a_valid_radix_;
	private static SubLList $list79;
	private static SubLList $list80;
	private static SubLList $list81;
	private static SubLList $list82;
	private static SubLSymbol $sym83$FORMAT_R_DIRECTIVE;
	private static SubLSymbol $sym84$FORMAT_D_DIRECTIVE;
	private static SubLSymbol $sym85$FORMAT_B_DIRECTIVE;
	private static SubLSymbol $sym86$FORMAT_O_DIRECTIVE;
	private static SubLSymbol $sym87$FORMAT_X_DIRECTIVE;
	private static SubLList $list88;
	private static SubLSymbol $sym89$FORMAT_F_DIRECTIVE;
	private static SubLSymbol $sym90$FORMAT_E_DIRECTIVE;
	private static SubLSymbol $sym91$FORMAT_G_DIRECTIVE;
	private static SubLSymbol $sym92$FORMAT_DOLLARSIGN_DIRECTIVE;
	private static SubLString $str93$__;
	private static SubLSymbol $sym94$FORMAT_PADDED;
	private static SubLSymbol $sym95$FORMAT_A_DIRECTIVE;
	private static SubLSymbol $sym96$FORMAT_S_DIRECTIVE;
	private static SubLSymbol $kw97$STREAM;
	private static SubLSymbol $sym98$FORMAT_W_DIRECTIVE;
	private static SubLSymbol $sym99$FORMAT_UNDERSCORE_DIRECTIVE;
	private static SubLSymbol $sym100$FORMAT_I_DIRECTIVE;
	private static SubLSymbol $sym101$CHAR_;
	private static SubLSymbol $sym102$FORMAT_SLASH_DIRECTIVE;
	private static SubLSymbol $sym103$FORMAT_T_DIRECTIVE;
	private static SubLSymbol $sym104$FORMAT_LESS_THAN_DIRECTIVE;
	private static SubLSymbol $sym105$FORMAT_GREATER_THAN_DIRECTIVE;
	private static SubLSymbol $sym106$FORMAT_ASTERISK_DIRECTIVE;
	private static SubLString $str107$No_clause_marker_found_for__S__S_;
	private static SubLList $list108;
	private static SubLSymbol $sym109$FORMAT_LEFT_BRACKET_DIRECTIVE;
	private static SubLSymbol $sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE;
	private static SubLSymbol $sym111$UP_AND_ALL_THE_WAY_OUT;
	private static SubLSymbol $sym112$UP_AND_OUT;
	private static SubLSymbol $sym113$FORMAT_LEFT_BRACE_DIRECTIVE;
	private static SubLSymbol $sym114$FORMAT_RIGHT_BRACE_DIRECTIVE;
	private static SubLSymbol $sym115$STRINGP;
	private static SubLSymbol $sym116$LISTP;
	private static SubLSymbol $sym117$FORMAT_QUESTION_MARK_DIRECTIVE;
	private static SubLSymbol $sym118$FORMAT_LEFT_PAREN_DIRECTIVE;
	private static SubLSymbol $sym119$FORMAT_RIGHT_PAREN_DIRECTIVE;
	private static SubLString $str120$ies;
	private static SubLSymbol $sym121$FORMAT_P_DIRECTIVE;
	private static SubLSymbol $sym122$FORMAT_SEMICOLON_DIRECTIVE;
	private static SubLSymbol $sym123$FORMAT_CIRCUMFLEX_DIRECTIVE;
	private static SubLSymbol $sym124$FORMAT_NEWLINE_DIRECTIVE;
	private static SubLString $str125$_S_does_not_support_string_destin;
	private static SubLString $str126$_S_is_not_a_valid__S_destination_;
	private static SubLString $str127$No_matching__A_found_for__A_in__S;
	private static SubLSymbol $kw128$NORMAL;
	private static SubLSymbol $kw129$TILDE;
	private static SubLSymbol $kw130$PARAM;
	private static SubLString $str131$_S_parameter__S_is_not_a_characte;
	private static SubLSymbol $kw132$QUOTE;
	private static SubLSymbol $kw133$COLON;
	private static SubLSymbol $kw134$AT_SIGN;
	private static SubLSymbol $kw135$SIGN;
	private static SubLSymbol $kw136$NUMBER;
	private static SubLString $str137$Bad__S_parameter_;
	private static SubLSymbol $kw138$COLON_AT;
	private static SubLString $str139$Unterminated__S_control_;
	static {
		format.me = new format();
		format.$format_directives$ = null;
		format.$matching_brackets$ = null;
		format.$remaining_args$ = null;
		format.$int0$50 = SubLObjectFactory.makeInteger(50);
		format.$list1 = ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("CHARACTER"),
				SubLObjectFactory.makeSymbol("LAMBDA-LIST"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		format.$sym2$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		format.$sym3$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
		format.$sym4$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
		format.$sym5$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
		format.$sym6$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
		format.$sym7$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
		format.$sym8$_FORMAT_DIRECTIVES_ = SubLObjectFactory.makeSymbol("*FORMAT-DIRECTIVES*");
		format.$sym9$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
		format.$list10 = ConsesLow.list(SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("LEFT"),
				SubLObjectFactory.makeSymbol("RIGHT"), SubLObjectFactory.makeSymbol("LAMBDA-LIST"),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		format.$sym11$_MATCHING_BRACKETS_ = SubLObjectFactory.makeSymbol("*MATCHING-BRACKETS*");
		format.$str12$The__A_format_directive_is_not_ye = SubLObjectFactory
				.makeString("The ~A format directive is not yet ~@[fully ~]implemented.");
		format.$str13$The____C_format_directive_does_no = SubLObjectFactory
				.makeString("The ~~~C format directive does not take an at-sign modifier.");
		format.$str14$The____C_format_directive_does_no = SubLObjectFactory
				.makeString("The ~~~C format directive does not take an colon modifier.");
		format.$str15$The____C_format_directive_does_no = SubLObjectFactory
				.makeString("The ~~~C format directive does not take both an at-sign and colon modifier.");
		format.$sym16$OR = SubLObjectFactory.makeSymbol("OR");
		format.$sym17$INTEGER = SubLObjectFactory.makeSymbol("INTEGER");
		format.$list18 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"),
				SubLObjectFactory.makeSymbol("START"), SubLObjectFactory.makeSymbol("END"));
		format.$str19$Unrecognized_type_specifier__S_ = SubLObjectFactory.makeString("Unrecognized type specifier ~S.");
		format.$sym20$CHARACTER = SubLObjectFactory.makeSymbol("CHARACTER");
		format.$sym21$NULL = SubLObjectFactory.makeSymbol("NULL");
		format.$list22 = ConsesLow.list(SubLObjectFactory.makeSymbol("PATTERN"),
				SubLObjectFactory.makeSymbol("PARAMETERS"), SubLObjectFactory.makeSymbol("&BODY"),
				SubLObjectFactory.makeSymbol("BODY"));
		format.$str23$TAIL = SubLObjectFactory.makeString("TAIL");
		format.$list24 = ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("INIT"),
				SubLObjectFactory.makeSymbol("TYPE"));
		format.$sym25$CSETF = SubLObjectFactory.makeSymbol("CSETF");
		format.$sym26$CAR = SubLObjectFactory.makeSymbol("CAR");
		format.$sym27$CPOP = SubLObjectFactory.makeSymbol("CPOP");
		format.$sym28$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
		format.$sym29$FORMAT_TYPEP = SubLObjectFactory.makeSymbol("FORMAT-TYPEP");
		format.$sym30$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
		format.$sym31$ERROR = SubLObjectFactory.makeSymbol("ERROR");
		format.$str32$The__S_parameter__S_is_not_of_typ = SubLObjectFactory
				.makeString("The ~S parameter ~S is not of type ~S.");
		format.$list33 = ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FORMAT"));
		format.$sym34$CLET = SubLObjectFactory.makeSymbol("CLET");
		format.$sym35$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		format.$list36 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("ERROR"),
				SubLObjectFactory.makeString("Too many ~S parameters."),
				ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FORMAT"))));
		format.$str37$Stray____C_directive_in__S_string = SubLObjectFactory
				.makeString("Stray ~~~C directive in ~S string ~S.");
		format.$sym38$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
		format.$str39$_S_is_not_a_recognized__S_control = SubLObjectFactory
				.makeString("~S is not a recognized ~S control.");
		format.$str40$_S_directive__S_ran_out_of_argume = SubLObjectFactory
				.makeString("~S directive ~S ran out of arguments.");
		format.$str41$No_matching__S_found_for__S_in__S = SubLObjectFactory
				.makeString("No matching ~S found for ~S in ~S.");
		format.$str42$The__S__S_directive_takes_a_list_ = SubLObjectFactory
				.makeString("The ~S ~S directive takes a list as an argument.");
		format.$str43$_S_is_not_a_valid__S_control_ = SubLObjectFactory.makeString("~S is not a valid ~S control.");
		format.$str44$_S_is_not_a_valid__S_repitition_s = SubLObjectFactory
				.makeString("~S is not a valid ~S repitition specifier.");
		format.$str45$Too_many__S_parameters_ = SubLObjectFactory.makeString("Too many ~S parameters.");
		format.$sym46$CHARACTERP = SubLObjectFactory.makeSymbol("CHARACTERP");
		format.$str47$__ = SubLObjectFactory.makeString("#\\");
		format.$sym48$FORMAT_C_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-C-DIRECTIVE");
		format.$list49 = ConsesLow.list(SubLObjectFactory.makeSymbol("OR"), SubLObjectFactory.makeSymbol("NULL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("INTEGER"), CommonSymbols.ZERO_INTEGER));
		format.$sym50$FORMAT_PERCENT_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-PERCENT-DIRECTIVE");
		format.$sym51$FORMAT_AMPERSAND_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-AMPERSAND-DIRECTIVE");
		format.$sym52$FORMAT_VERTICAL_BAR_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-VERTICAL-BAR-DIRECTIVE");
		format.$sym53$FORMAT_TILDE_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-TILDE-DIRECTIVE");
		format.$list54 = ConsesLow.list(SubLObjectFactory.makeSymbol("INTEGER"), CommonSymbols.ZERO_INTEGER);
		format.$list55 = ConsesLow.list(SubLObjectFactory.makeSymbol("INTEGER"), CommonSymbols.ONE_INTEGER);
		format.$str56$_ = SubLObjectFactory.makeString("-");
		format.$str57$_ = SubLObjectFactory.makeString("+");
		format.$sym58$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
		format.$ic59 = Vectors.vector(new SubLObject[] { SubLObjectFactory.makeString(""),
				SubLObjectFactory.makeString(" thousand"), SubLObjectFactory.makeString(" million"),
				SubLObjectFactory.makeString(" billion"), SubLObjectFactory.makeString(" trillion"),
				SubLObjectFactory.makeString(" quadrillion"), SubLObjectFactory.makeString(" quintillion"),
				SubLObjectFactory.makeString(" sextillion"), SubLObjectFactory.makeString(" septillion"),
				SubLObjectFactory.makeString(" octillion"), SubLObjectFactory.makeString(" nonillion"),
				SubLObjectFactory.makeString(" decillion"), SubLObjectFactory.makeString(" undecillion"),
				SubLObjectFactory.makeString(" duodecillion"), SubLObjectFactory.makeString(" tredecillion"),
				SubLObjectFactory.makeString(" quattuordecillion"), SubLObjectFactory.makeString(" quindecillion"),
				SubLObjectFactory.makeString(" sexdecillion"), SubLObjectFactory.makeString(" septendecillion"),
				SubLObjectFactory.makeString(" octodecillion"), SubLObjectFactory.makeString(" novemdecillion"),
				SubLObjectFactory.makeString(" vigintillion") });
		format.$str60$_times_ten_to_the_ = SubLObjectFactory.makeString(" times ten to the ");
		format.$str61$_power = SubLObjectFactory.makeString(" power");
		format.$str62$_plus = SubLObjectFactory.makeString(" plus");
		format.$int63$1000 = SubLObjectFactory.makeInteger(1000);
		format.$int64$100 = SubLObjectFactory.makeInteger(100);
		format.$ic65 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, SubLObjectFactory.makeString("one"),
				SubLObjectFactory.makeString("two"), SubLObjectFactory.makeString("three"),
				SubLObjectFactory.makeString("four"), SubLObjectFactory.makeString("five"),
				SubLObjectFactory.makeString("six"), SubLObjectFactory.makeString("seven"),
				SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("nine") });
		format.$str66$_hundred = SubLObjectFactory.makeString(" hundred");
		format.$ic67 = Vectors
				.vector(new SubLObject[] { SubLObjectFactory.makeString("ten"), SubLObjectFactory.makeString("eleven"),
						SubLObjectFactory.makeString("twelve"), SubLObjectFactory.makeString("thirteen"),
						SubLObjectFactory.makeString("fourteen"), SubLObjectFactory.makeString("fifteen"),
						SubLObjectFactory.makeString("sixteen"), SubLObjectFactory.makeString("seventeen"),
						SubLObjectFactory.makeString("eighteen"), SubLObjectFactory.makeString("nineteen") });
		format.$ic68 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, CommonSymbols.NIL,
				SubLObjectFactory.makeString("twenty"), SubLObjectFactory.makeString("thirty"),
				SubLObjectFactory.makeString("forty"), SubLObjectFactory.makeString("fifty"),
				SubLObjectFactory.makeString("sixty"), SubLObjectFactory.makeString("seventy"),
				SubLObjectFactory.makeString("eighty"), SubLObjectFactory.makeString("ninety") });
		format.$ic69 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, SubLObjectFactory.makeString("one"),
				SubLObjectFactory.makeString("two"), SubLObjectFactory.makeString("three"),
				SubLObjectFactory.makeString("four"), SubLObjectFactory.makeString("five"),
				SubLObjectFactory.makeString("six"), SubLObjectFactory.makeString("seven"),
				SubLObjectFactory.makeString("eight"), SubLObjectFactory.makeString("nine") });
		format.$str70$zero = SubLObjectFactory.makeString("zero");
		format.$str71$minus_ = SubLObjectFactory.makeString("minus ");
		format.$str72$zeroth = SubLObjectFactory.makeString("zeroth");
		format.$ic73 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, SubLObjectFactory.makeString("tenth"),
				SubLObjectFactory.makeString("twentieth"), SubLObjectFactory.makeString("thirtieth"),
				SubLObjectFactory.makeString("fortieth"), SubLObjectFactory.makeString("fiftieth"),
				SubLObjectFactory.makeString("sixtieth"), SubLObjectFactory.makeString("seventieth"),
				SubLObjectFactory.makeString("eightieth"), SubLObjectFactory.makeString("ninetieth") });
		format.$ic74 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, SubLObjectFactory.makeString("eleventh"),
				SubLObjectFactory.makeString("twelfth"), SubLObjectFactory.makeString("thirteenth"),
				SubLObjectFactory.makeString("fourteenth"), SubLObjectFactory.makeString("fifteenth"),
				SubLObjectFactory.makeString("sixteenth"), SubLObjectFactory.makeString("seventeenth"),
				SubLObjectFactory.makeString("eighteenth"), SubLObjectFactory.makeString("nineteenth") });
		format.$ic75 = Vectors.vector(new SubLObject[] { CommonSymbols.NIL, SubLObjectFactory.makeString("first"),
				SubLObjectFactory.makeString("second"), SubLObjectFactory.makeString("third"),
				SubLObjectFactory.makeString("fourth"), SubLObjectFactory.makeString("fifth"),
				SubLObjectFactory.makeString("sixth"), SubLObjectFactory.makeString("seventh"),
				SubLObjectFactory.makeString("eighth"), SubLObjectFactory.makeString("ninth") });
		format.$str76$th = SubLObjectFactory.makeString("th");
		format.$int77$36 = SubLObjectFactory.makeInteger(36);
		format.$str78$_S_is_not_a_valid_radix_ = SubLObjectFactory.makeString("~S is not a valid radix.");
		format.$list79 = ConsesLow.list(Characters.CHAR_M, Characters.CHAR_D, Characters.CHAR_C, Characters.CHAR_L,
				Characters.CHAR_X, Characters.CHAR_V, Characters.CHAR_I);
		format.$list80 = ConsesLow.list(SubLObjectFactory.makeInteger(1000), SubLObjectFactory.makeInteger(500),
				SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(50), CommonSymbols.TEN_INTEGER,
				CommonSymbols.FIVE_INTEGER, CommonSymbols.ONE_INTEGER);
		format.$list81 = ConsesLow.list(SubLObjectFactory.makeInteger(900), SubLObjectFactory.makeInteger(400),
				SubLObjectFactory.makeInteger(90), SubLObjectFactory.makeInteger(40), CommonSymbols.NINE_INTEGER,
				CommonSymbols.FOUR_INTEGER);
		format.$list82 = ConsesLow.list(Characters.CHAR_C, Characters.CHAR_C, Characters.CHAR_X, Characters.CHAR_X,
				Characters.CHAR_I, Characters.CHAR_I);
		format.$sym83$FORMAT_R_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-R-DIRECTIVE");
		format.$sym84$FORMAT_D_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-D-DIRECTIVE");
		format.$sym85$FORMAT_B_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-B-DIRECTIVE");
		format.$sym86$FORMAT_O_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-O-DIRECTIVE");
		format.$sym87$FORMAT_X_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-X-DIRECTIVE");
		format.$list88 = ConsesLow.list(SubLObjectFactory.makeSymbol("OR"), SubLObjectFactory.makeSymbol("NULL"),
				SubLObjectFactory.makeSymbol("CHARACTER"));
		format.$sym89$FORMAT_F_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-F-DIRECTIVE");
		format.$sym90$FORMAT_E_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-E-DIRECTIVE");
		format.$sym91$FORMAT_G_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-G-DIRECTIVE");
		format.$sym92$FORMAT_DOLLARSIGN_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-DOLLARSIGN-DIRECTIVE");
		format.$str93$__ = SubLObjectFactory.makeString("()");
		format.$sym94$FORMAT_PADDED = SubLObjectFactory.makeSymbol("FORMAT-PADDED");
		format.$sym95$FORMAT_A_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-A-DIRECTIVE");
		format.$sym96$FORMAT_S_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-S-DIRECTIVE");
		format.$kw97$STREAM = SubLObjectFactory.makeKeyword("STREAM");
		format.$sym98$FORMAT_W_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-W-DIRECTIVE");
		format.$sym99$FORMAT_UNDERSCORE_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-UNDERSCORE-DIRECTIVE");
		format.$sym100$FORMAT_I_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-I-DIRECTIVE");
		format.$sym101$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
		format.$sym102$FORMAT_SLASH_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-SLASH-DIRECTIVE");
		format.$sym103$FORMAT_T_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-T-DIRECTIVE");
		format.$sym104$FORMAT_LESS_THAN_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-LESS-THAN-DIRECTIVE");
		format.$sym105$FORMAT_GREATER_THAN_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-GREATER-THAN-DIRECTIVE");
		format.$sym106$FORMAT_ASTERISK_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-ASTERISK-DIRECTIVE");
		format.$str107$No_clause_marker_found_for__S__S_ = SubLObjectFactory
				.makeString("No clause marker found for ~S ~S directive.");
		format.$list108 = ConsesLow.list(SubLObjectFactory.makeSymbol("OR"), SubLObjectFactory.makeSymbol("NULL"),
				SubLObjectFactory.makeSymbol("INTEGER"));
		format.$sym109$FORMAT_LEFT_BRACKET_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-LEFT-BRACKET-DIRECTIVE");
		format.$sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-RIGHT-BRACKET-DIRECTIVE");
		format.$sym111$UP_AND_ALL_THE_WAY_OUT = SubLObjectFactory.makeSymbol("UP-AND-ALL-THE-WAY-OUT");
		format.$sym112$UP_AND_OUT = SubLObjectFactory.makeSymbol("UP-AND-OUT");
		format.$sym113$FORMAT_LEFT_BRACE_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-LEFT-BRACE-DIRECTIVE");
		format.$sym114$FORMAT_RIGHT_BRACE_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-RIGHT-BRACE-DIRECTIVE");
		format.$sym115$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
		format.$sym116$LISTP = SubLObjectFactory.makeSymbol("LISTP");
		format.$sym117$FORMAT_QUESTION_MARK_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-QUESTION-MARK-DIRECTIVE");
		format.$sym118$FORMAT_LEFT_PAREN_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-LEFT-PAREN-DIRECTIVE");
		format.$sym119$FORMAT_RIGHT_PAREN_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-RIGHT-PAREN-DIRECTIVE");
		format.$str120$ies = SubLObjectFactory.makeString("ies");
		format.$sym121$FORMAT_P_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-P-DIRECTIVE");
		format.$sym122$FORMAT_SEMICOLON_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-SEMICOLON-DIRECTIVE");
		format.$sym123$FORMAT_CIRCUMFLEX_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-CIRCUMFLEX-DIRECTIVE");
		format.$sym124$FORMAT_NEWLINE_DIRECTIVE = SubLObjectFactory.makeSymbol("FORMAT-NEWLINE-DIRECTIVE");
		format.$str125$_S_does_not_support_string_destin = SubLObjectFactory
				.makeString("~S does not support string destinations.");
		format.$str126$_S_is_not_a_valid__S_destination_ = SubLObjectFactory
				.makeString("~S is not a valid ~S destination.");
		format.$str127$No_matching__A_found_for__A_in__S = SubLObjectFactory
				.makeString("No matching ~A found for ~A in ~S.");
		format.$kw128$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
		format.$kw129$TILDE = SubLObjectFactory.makeKeyword("TILDE");
		format.$kw130$PARAM = SubLObjectFactory.makeKeyword("PARAM");
		format.$str131$_S_parameter__S_is_not_a_characte = SubLObjectFactory
				.makeString("~S parameter ~S is not a character, integer, or NIL.");
		format.$kw132$QUOTE = SubLObjectFactory.makeKeyword("QUOTE");
		format.$kw133$COLON = SubLObjectFactory.makeKeyword("COLON");
		format.$kw134$AT_SIGN = SubLObjectFactory.makeKeyword("AT-SIGN");
		format.$kw135$SIGN = SubLObjectFactory.makeKeyword("SIGN");
		format.$kw136$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
		format.$str137$Bad__S_parameter_ = SubLObjectFactory.makeString("Bad ~S parameter.");
		format.$kw138$COLON_AT = SubLObjectFactory.makeKeyword("COLON-AT");
		format.$str139$Unterminated__S_control_ = SubLObjectFactory.makeString("Unterminated ~S control.");
	}

	@SubL(source = "sublisp/format.lisp", position = 32453L)
	public static SubLObject backup_args(SubLObject args, SubLObject all_args, SubLObject count) {
		SubLObject offset = CommonSymbols.ZERO_INTEGER;
		SubLObject tail;
		for (tail = CommonSymbols.NIL, tail = all_args; !tail.eql(args); tail = tail.rest())
			offset = Numbers.add(offset, CommonSymbols.ONE_INTEGER);
		if (count.numG(offset))
			format.not_enough_format_arguments(Characters.CHAR_asterisk);
		return conses_high.nthcdr(Numbers.subtract(offset, count), all_args);
	}

	@SubL(source = "sublisp/format.lisp", position = 5407L)
	public static SubLObject bad_format_directive(SubLObject string, SubLObject index) {
		Errors.error(format.$str39$_S_is_not_a_recognized__S_control, Strings.sublisp_char(string, index),
				format.$sym38$FORMAT);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 1624L)
	public static SubLObject call_format_directive(SubLObject ch, SubLObject stream, SubLObject string,
			SubLObject start, SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters,
			SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject new_args = Functions.funcall(
				Hashtables.gethash(ch, format.$format_directives$.getDynamicValue(thread), CommonSymbols.UNPROVIDED),
				new SubLObject[] { stream, string, start, end, args, all_args, parameters, at_sign_p, colonp });
		SubLObject new_start = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return Values.values(new_args, new_start);
	}

	@SubL(source = "sublisp/format.lisp", position = 3242L)
	public static SubLObject check_flags(SubLObject directive, SubLObject at_sign_p, SubLObject at_sign_ok_p,
			SubLObject colonp, SubLObject colon_ok_p) {
		if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL == at_sign_ok_p)
			Errors.error(format.$str13$The____C_format_directive_does_no, directive);
		if (CommonSymbols.NIL != colonp && CommonSymbols.NIL == colon_ok_p)
			Errors.error(format.$str14$The____C_format_directive_does_no, directive);
		if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL != colonp)
			Errors.error(format.$str15$The____C_format_directive_does_no, directive);
		return CommonSymbols.NIL;
	}

	public static SubLObject declare_format_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_directive_p",
				"FORMAT-DIRECTIVE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "matching_bracket",
				"MATCHING-BRACKET", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "call_format_directive",
				"CALL-FORMAT-DIRECTIVE", 10, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "defformat", "DEFFORMAT");
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "defformat_bracketed",
				"DEFFORMAT-BRACKETED");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"unimplemented_format_directive", "UNIMPLEMENTED-FORMAT-DIRECTIVE", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "check_flags", "CHECK-FLAGS",
				5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_typep",
				"FORMAT-TYPEP", 2, 0, false);
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "with_format_parameters",
				"WITH-FORMAT-PARAMETERS");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "illegal_directive",
				"ILLEGAL-DIRECTIVE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "bad_format_directive",
				"BAD-FORMAT-DIRECTIVE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_enough_format_arguments",
				"NOT-ENOUGH-FORMAT-ARGUMENTS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "matching_bracket_not_found",
				"MATCHING-BRACKET-NOT-FOUND", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_a_list_argument",
				"NOT-A-LIST-ARGUMENT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "not_a_format_control",
				"NOT-A-FORMAT-CONTROL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "repitition_designator_value",
				"REPITITION-DESIGNATOR-VALUE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_repeat",
				"FORMAT-REPEAT", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_padded",
				"FORMAT-PADDED", 7, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_c_directive",
				"FORMAT-C-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_percent_directive",
				"FORMAT-PERCENT-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_ampersand_directive",
				"FORMAT-AMPERSAND-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_vertical_bar_directive", "FORMAT-VERTICAL-BAR-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_tilde_directive",
				"FORMAT-TILDE-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_integer_internal",
				"FORMAT-INTEGER-INTERNAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_integer",
				"FORMAT-INTEGER", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "integer_truncate",
				"INTEGER-TRUNCATE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_cardinal_internal",
				"FORMAT-CARDINAL-INTERNAL", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_cardinal",
				"FORMAT-CARDINAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_ordinal",
				"FORMAT-ORDINAL", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_r_directive",
				"FORMAT-R-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_d_directive",
				"FORMAT-D-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_b_directive",
				"FORMAT-B-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_o_directive",
				"FORMAT-O-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_x_directive",
				"FORMAT-X-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "split_flonum_digits",
				"SPLIT-FLONUM-DIGITS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "round_digits",
				"ROUND-DIGITS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "digits_add_1_int",
				"DIGITS-ADD-1-INT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "digits_add_1",
				"DIGITS-ADD-1", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "round_decimal_digits",
				"ROUND-DECIMAL-DIGITS", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_f_directive",
				"FORMAT-F-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_e_directive",
				"FORMAT-E-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_g_directive",
				"FORMAT-G-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_dollarsign_directive",
				"FORMAT-DOLLARSIGN-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_a_directive",
				"FORMAT-A-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_s_directive",
				"FORMAT-S-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_w_directive",
				"FORMAT-W-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_underscore_directive",
				"FORMAT-UNDERSCORE-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_i_directive",
				"FORMAT-I-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_slash_directive",
				"FORMAT-SLASH-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_t_directive",
				"FORMAT-T-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_less_than_directive",
				"FORMAT-LESS-THAN-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_greater_than_directive", "FORMAT-GREATER-THAN-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "backup_args", "BACKUP-ARGS",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_asterisk_directive",
				"FORMAT-ASTERISK-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_left_bracket_directive", "FORMAT-LEFT-BRACKET-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_right_bracket_directive", "FORMAT-RIGHT-BRACKET-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_sublist_iteration",
				"FORMAT-SUBLIST-ITERATION", 7, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_iteration",
				"FORMAT-ITERATION", 7, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_left_brace_directive",
				"FORMAT-LEFT-BRACE-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_right_brace_directive", "FORMAT-RIGHT-BRACE-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_question_mark_directive", "FORMAT-QUESTION-MARK-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_left_paren_directive",
				"FORMAT-LEFT-PAREN-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format",
				"format_right_paren_directive", "FORMAT-RIGHT-PAREN-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_p_directive",
				"FORMAT-P-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_semicolon_directive",
				"FORMAT-SEMICOLON-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_circumflex_directive",
				"FORMAT-CIRCUMFLEX-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_newline_directive",
				"FORMAT-NEWLINE-DIRECTIVE", 9, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "really_format",
				"REALLY-FORMAT", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "format_internal",
				"FORMAT-INTERNAL", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "find_directive",
				"FIND-DIRECTIVE", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.format", "parse_format_command",
				"PARSE-FORMAT-COMMAND", 3, 2, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 2449L)
	public static SubLObject defformat(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = CommonSymbols.NIL;
		SubLObject character = CommonSymbols.NIL;
		SubLObject lambda_list = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list1);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list1);
		character = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list1);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.list(format.$sym2$PROGN,
				ConsesLow.list(format.$sym3$DECLAIM, ConsesLow.list(format.$sym4$FACCESS, format.$sym5$PRIVATE, name)),
				ConsesLow.listS(format.$sym6$DEFINE, name, lambda_list, ConsesLow.append(body, CommonSymbols.NIL)),
				ConsesLow.list(format.$sym7$SETHASH, Characters.char_downcase(character),
						format.$sym8$_FORMAT_DIRECTIVES_, ConsesLow.list(format.$sym9$FUNCTION, name)),
				ConsesLow.list(format.$sym7$SETHASH, Characters.char_upcase(character),
						format.$sym8$_FORMAT_DIRECTIVES_, ConsesLow.list(format.$sym9$FUNCTION, name)));
	}

	@SubL(source = "sublisp/format.lisp", position = 2748L)
	public static SubLObject defformat_bracketed(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject name = CommonSymbols.NIL;
		SubLObject left = CommonSymbols.NIL;
		SubLObject right = CommonSymbols.NIL;
		SubLObject lambda_list = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list10);
		name = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list10);
		left = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list10);
		right = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list10);
		lambda_list = current.first();
		SubLObject body;
		current = body = current.rest();
		return ConsesLow.list(format.$sym2$PROGN,
				ConsesLow.list(format.$sym3$DECLAIM, ConsesLow.list(format.$sym4$FACCESS, format.$sym5$PRIVATE, name)),
				ConsesLow.listS(format.$sym6$DEFINE, name, lambda_list, ConsesLow.append(body, CommonSymbols.NIL)),
				ConsesLow.list(format.$sym7$SETHASH, left, format.$sym8$_FORMAT_DIRECTIVES_,
						ConsesLow.list(format.$sym9$FUNCTION, name)),
				ConsesLow.list(format.$sym7$SETHASH, left, format.$sym11$_MATCHING_BRACKETS_, right));
	}

	@SubL(source = "sublisp/format.lisp", position = 21257L)
	public static SubLObject digits_add_1(SubLObject digits) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject new_digits = format.digits_add_1_int(digits);
		SubLObject carry = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL != carry)
			return ConsesLow.cons(CommonSymbols.ONE_INTEGER, new_digits);
		return new_digits;
	}

	@SubL(source = "sublisp/format.lisp", position = 20705L)
	public static SubLObject digits_add_1_int(SubLObject digits) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject digit = digits.first();
		if (CommonSymbols.NIL == digits)
			return Values.values(CommonSymbols.NIL, CommonSymbols.NIL);
		if (CommonSymbols.NIL == digits.rest()) {
			if (CommonSymbols.NINE_INTEGER.eql(digit))
				return Values.values(ConsesLow.list(CommonSymbols.ZERO_INTEGER), CommonSymbols.T);
			return Values.values(ConsesLow.list(Numbers.add(CommonSymbols.ONE_INTEGER, digit)), CommonSymbols.NIL);
		} else {
			thread.resetMultipleValues();
			SubLObject new_rest_digits = format.digits_add_1_int(digits.rest());
			SubLObject carry = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (CommonSymbols.NIL == carry)
				return Values.values(ConsesLow.cons(digit, new_rest_digits), CommonSymbols.NIL);
			if (digit.numE(CommonSymbols.NINE_INTEGER))
				return Values.values(ConsesLow.cons(CommonSymbols.ZERO_INTEGER, new_rest_digits), CommonSymbols.T);
			return Values.values(ConsesLow.cons(Numbers.add(CommonSymbols.ONE_INTEGER, digit), new_rest_digits),
					CommonSymbols.NIL);
		}
	}

	@SubL(source = "sublisp/format.lisp", position = 48276L)
	public static SubLObject find_directive(SubLObject directive, SubLObject string, SubLObject start, SubLObject end) {
		SubLThread thread = SubLProcess.currentSubLThread();
		while (true) {
			thread.resetMultipleValues();
			SubLObject ch = format.parse_format_command(string, start, end, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
			SubLObject directive_start = thread.secondMultipleValue();
			SubLObject directive_end = thread.thirdMultipleValue();
			SubLObject at_sign_p = thread.fourthMultipleValue();
			SubLObject colonp = thread.fifthMultipleValue();
			SubLObject parameters = thread.sixthMultipleValue();
			SubLObject args = thread.seventhMultipleValue();
			thread.resetMultipleValues();
			if (CommonSymbols.NIL == ch)
				return Values.values(CommonSymbols.NIL, CommonSymbols.NIL, CommonSymbols.NIL);
			if (CommonSymbols.NIL != Characters.charE(ch, directive))
				return Values.values(directive_start, directive_end, at_sign_p, colonp);
			SubLObject matching = format.matching_bracket(ch);
			if (CommonSymbols.NIL != matching) {
				thread.resetMultipleValues();
				SubLObject matching_start = format.find_directive(matching, string, directive_end, end);
				SubLObject matching_end = thread.secondMultipleValue();
				SubLObject matching_colonp = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				if (CommonSymbols.NIL != matching_end)
					start = matching_end;
				else
					Errors.error(format.$str127$No_matching__A_found_for__A_in__S, matching, directive, string);
			} else
				start = directive_end;
		}
	}

	@SubL(source = "sublisp/format.lisp", position = 26826L)
	public static SubLObject format_a_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
		SubLObject _prev_bind_2 = print_high.$print_readably$.currentBinding(thread);
		try {
			print_high.$print_escape$.bind(CommonSymbols.NIL, thread);
			print_high.$print_readably$.bind(CommonSymbols.NIL, thread);
			SubLObject arg = args.first();
			if (CommonSymbols.NIL != colonp && CommonSymbols.NIL == arg)
				arg = format.$str93$__;
			if (CommonSymbols.NIL != parameters) {
				SubLObject padchar = CommonSymbols.NIL;
				SubLObject minpad = CommonSymbols.NIL;
				SubLObject colinc = CommonSymbols.NIL;
				SubLObject mincol = CommonSymbols.NIL;
				mincol = parameters.first();
				SubLObject tail = parameters.rest();
				if (CommonSymbols.NIL == mincol)
					mincol = CommonSymbols.ZERO_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(mincol, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, mincol,
							format.$list54);
				colinc = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == colinc)
					colinc = CommonSymbols.ONE_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(colinc, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, colinc,
							format.$list54);
				minpad = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == minpad)
					minpad = CommonSymbols.ZERO_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(minpad, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, minpad,
							format.$list54);
				padchar = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == padchar)
					padchar = Characters.CHAR_space;
				if (CommonSymbols.NIL == format.format_typep(padchar, format.$sym20$CHARACTER))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, padchar,
							format.$sym20$CHARACTER);
				if (CommonSymbols.NIL != tail)
					Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
				Functions.funcall(Symbols.symbol_function(format.$sym94$FORMAT_PADDED),
						new SubLObject[] { stream,
								PrintLow.write_to_string(arg, SubLTranslatedFile.EMPTY_SUBL_OBJECT_ARRAY), at_sign_p,
								mincol, colinc, minpad, padchar });
			} else
				print_high.princ(arg, stream);
		} finally {
			print_high.$print_readably$.rebind(_prev_bind_2, thread);
			print_high.$print_escape$.rebind(_prev_bind_0, thread);
		}
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 7961L)
	public static SubLObject format_ampersand_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_ampersand, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.NIL);
		SubLObject n = CommonSymbols.NIL;
		n = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == n)
			n = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(n, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, n, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		SubLObject repeat = format.repitition_designator_value(n);
		if (repeat.isPositive()) {
			streams_high.fresh_line(stream);
			SubLObject cdotimes_end_var;
			SubLObject i;
			for (cdotimes_end_var = Numbers.subtract(repeat,
					CommonSymbols.ONE_INTEGER), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
							.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
				streams_high.terpri(stream);
		}
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 33029L)
	public static SubLObject format_asterisk_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_asterisk, at_sign_p, CommonSymbols.T, colonp, CommonSymbols.T);
		SubLObject count = CommonSymbols.NIL;
		count = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == count)
			count = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(count, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, count, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		if (CommonSymbols.NIL != at_sign_p) {
			if (CommonSymbols.NIL == count)
				count = CommonSymbols.ZERO_INTEGER;
			if (count.numG(Sequences.length(all_args)))
				format.not_enough_format_arguments(Characters.CHAR_asterisk);
			return Values.values(conses_high.nthcdr(count, all_args), start);
		}
		if (CommonSymbols.NIL != colonp)
			return Values.values(
					format.backup_args(args, all_args, CommonSymbols.NIL != count ? count : CommonSymbols.ONE_INTEGER),
					start);
		if (CommonSymbols.NIL == count)
			count = CommonSymbols.ONE_INTEGER;
		if (count.numG(Sequences.length(args)))
			format.not_enough_format_arguments(Characters.CHAR_asterisk);
		return Values.values(conses_high.nthcdr(count, args), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 18525L)
	public static SubLObject format_b_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.format_integer(stream, args.first(), CommonSymbols.TWO_INTEGER, parameters, at_sign_p, colonp);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 6875L)
	public static SubLObject format_c_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		SubLObject arg = args.first();
		assert CommonSymbols.NIL != Types.characterp(arg) : arg;
		if (CommonSymbols.NIL != colonp)
			streams_high.write_string(character_names.character_names(arg).first(), stream, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED);
		else if (CommonSymbols.NIL != at_sign_p) {
			SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
			try {
				print_high.$print_escape$.bind(CommonSymbols.T, thread);
				streams_high.write_string(format.$str47$__, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				streams_high.write_string(character_names.character_names(arg).first(), stream,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			} finally {
				print_high.$print_escape$.rebind(_prev_bind_0, thread);
			}
		} else
			streams_high.write_char(arg, stream);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 14685L)
	public static SubLObject format_cardinal(SubLObject stream, SubLObject integer) {
		assert CommonSymbols.NIL != Types.integerp(integer) : integer;
		if (integer.isZero())
			streams_high.write_string(format.$str70$zero, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else if (integer.isNegative()) {
			streams_high.write_string(format.$str71$minus_, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			format.format_cardinal(stream, Numbers.minus(integer));
		} else
			format.format_cardinal_internal(stream, integer, CommonSymbols.ZERO_INTEGER, CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 12158L)
	public static SubLObject format_cardinal_internal(SubLObject stream, SubLObject integer, SubLObject group,
			SubLObject more) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject groups = format.$ic59;
		SubLObject length = Sequences.length(groups);
		if (integer.isZero())
			return CommonSymbols.NIL;
		if (group.numGE(length)) {
			thread.resetMultipleValues();
			SubLObject zillions = format.integer_truncate(integer,
					Numbers.expt(CommonSymbols.TEN_INTEGER, Numbers.multiply(length, CommonSymbols.THREE_INTEGER)));
			SubLObject remainder = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (zillions.isPositive()) {
				format.format_cardinal_internal(stream, zillions, Numbers.add(group, length),
						SubLObjectFactory.makeBoolean(CommonSymbols.NIL != more || remainder.isPositive()));
				if (remainder.isPositive())
					streams_high.write_char(Characters.CHAR_space, stream);
			}
			if (remainder.isPositive()) {
				format.format_cardinal(stream, remainder);
				streams_high.write_string(format.$str60$_times_ten_to_the_, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				format.format_ordinal(stream, Numbers.multiply(group, CommonSymbols.THREE_INTEGER));
				streams_high.write_string(format.$str61$_power, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != more)
					streams_high.write_string(format.$str62$_plus, stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
			}
		} else {
			thread.resetMultipleValues();
			SubLObject thousands = Numbers.truncate(integer, format.$int63$1000);
			SubLObject L1000 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (thousands.isPositive()) {
				format.format_cardinal_internal(stream, thousands, Numbers.add(group, CommonSymbols.ONE_INTEGER),
						SubLObjectFactory.makeBoolean(CommonSymbols.NIL != more || L1000.isPositive()));
				if (L1000.isPositive())
					streams_high.write_char(Characters.CHAR_space, stream);
			}
			if (L1000.isPositive()) {
				thread.resetMultipleValues();
				SubLObject hundreds = Numbers.truncate(L1000, format.$int64$100);
				SubLObject L1001 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				thread.resetMultipleValues();
				SubLObject tens = Numbers.truncate(L1001, CommonSymbols.TEN_INTEGER);
				SubLObject L1002 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (hundreds.isPositive()) {
					streams_high.write_string(Vectors.aref(format.$ic65, hundreds), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
					streams_high.write_string(format.$str66$_hundred, stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				}
				if (tens.numE(CommonSymbols.ONE_INTEGER)) {
					if (hundreds.isPositive())
						streams_high.write_char(Characters.CHAR_space, stream);
					streams_high.write_string(Vectors.aref(format.$ic67, L1002), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				} else {
					if (tens.isPositive()) {
						if (hundreds.isPositive())
							streams_high.write_char(Characters.CHAR_space, stream);
						streams_high.write_string(Vectors.aref(format.$ic68, tens), stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED);
					}
					if (L1002.isPositive()) {
						if (tens.isPositive())
							streams_high.write_char(Characters.CHAR_hyphen, stream);
						else if (hundreds.isPositive())
							streams_high.write_char(Characters.CHAR_space, stream);
						streams_high.write_string(Vectors.aref(format.$ic69, L1002), stream, CommonSymbols.UNPROVIDED,
								CommonSymbols.UNPROVIDED);
					}
				}
				streams_high.write_string(Vectors.aref(groups, group), stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
			}
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 44890L)
	public static SubLObject format_circumflex_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		format.check_flags(Characters.CHAR_caret, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.T);
		SubLObject pcase_var = Sequences.length(parameters);
		if (pcase_var.eql(CommonSymbols.ZERO_INTEGER)) {
			if (CommonSymbols.NIL != args && CommonSymbols.NIL == colonp)
				return Values.values(args, start);
		} else if (pcase_var.eql(CommonSymbols.ONE_INTEGER)) {
			SubLObject x = CommonSymbols.NIL;
			x = parameters.first();
			SubLObject tail = parameters.rest();
			if (CommonSymbols.NIL == x)
				x = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(x, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, x,
						format.$sym17$INTEGER);
			if (CommonSymbols.NIL != tail)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (!x.isZero())
				return Values.values(args, start);
		} else if (pcase_var.eql(CommonSymbols.TWO_INTEGER)) {
			SubLObject y = CommonSymbols.NIL;
			SubLObject x2 = CommonSymbols.NIL;
			x2 = parameters.first();
			SubLObject tail = parameters.rest();
			if (CommonSymbols.NIL == x2)
				x2 = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(x2, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, x2,
						format.$sym17$INTEGER);
			y = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == y)
				y = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(y, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, y,
						format.$sym17$INTEGER);
			if (CommonSymbols.NIL != tail)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (!x2.numE(y))
				return Values.values(args, start);
		} else if (pcase_var.eql(CommonSymbols.THREE_INTEGER)) {
			SubLObject z = CommonSymbols.NIL;
			SubLObject y2 = CommonSymbols.NIL;
			SubLObject x3 = CommonSymbols.NIL;
			x3 = parameters.first();
			SubLObject tail = parameters.rest();
			if (CommonSymbols.NIL == x3)
				x3 = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(x3, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, x3,
						format.$sym17$INTEGER);
			y2 = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == y2)
				y2 = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(y2, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, y2,
						format.$sym17$INTEGER);
			z = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == z)
				z = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(z, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, z,
						format.$sym17$INTEGER);
			if (CommonSymbols.NIL != tail)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (!x3.numLE(y2) || !y2.numLE(z))
				return Values.values(args, start);
		}
		if (CommonSymbols.NIL != colonp && CommonSymbols.NIL == format.$remaining_args$.getDynamicValue(thread))
			Dynamic.sublisp_throw(format.$sym111$UP_AND_ALL_THE_WAY_OUT, args);
		else
			Dynamic.sublisp_throw(format.$sym112$UP_AND_OUT, args);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 18255L)
	public static SubLObject format_d_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.format_integer(stream, args.first(), CommonSymbols.TEN_INTEGER, parameters, at_sign_p, colonp);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 1476L)
	public static SubLObject format_directive_p(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Hashtables.gethash(ch, format.$format_directives$.getDynamicValue(thread), CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/format.lisp", position = 26507L)
	public static SubLObject format_dollarsign_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.unimplemented_format_directive(Characters.CHAR_dollar, CommonSymbols.UNPROVIDED);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 25072L)
	public static SubLObject format_e_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.unimplemented_format_directive(Characters.CHAR_E, CommonSymbols.UNPROVIDED);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 21758L)
	public static SubLObject format_f_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		format.check_flags(Characters.CHAR_F, at_sign_p, CommonSymbols.T, colonp, CommonSymbols.NIL);
		SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
		SubLObject _prev_bind_2 = print_high.$print_readably$.currentBinding(thread);
		try {
			print_high.$print_escape$.bind(CommonSymbols.NIL, thread);
			print_high.$print_readably$.bind(CommonSymbols.NIL, thread);
			SubLObject arg = args.first();
			SubLObject padchar = CommonSymbols.NIL;
			SubLObject overflowchar = CommonSymbols.NIL;
			SubLObject k = CommonSymbols.NIL;
			SubLObject d = CommonSymbols.NIL;
			SubLObject w = CommonSymbols.NIL;
			w = parameters.first();
			SubLObject tail = parameters.rest();
			if (CommonSymbols.NIL == w)
				w = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(w, format.$list49))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, w, format.$list49);
			d = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == d)
				d = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(d, format.$list49))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, d, format.$list49);
			k = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == k)
				k = CommonSymbols.ZERO_INTEGER;
			if (CommonSymbols.NIL == format.format_typep(k, format.$sym17$INTEGER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, k,
						format.$sym17$INTEGER);
			overflowchar = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == overflowchar)
				overflowchar = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(overflowchar, format.$list88))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, overflowchar,
						format.$list88);
			padchar = tail.first();
			tail = tail.rest();
			if (CommonSymbols.NIL == padchar)
				padchar = Characters.CHAR_space;
			if (CommonSymbols.NIL == format.format_typep(padchar, format.$sym20$CHARACTER))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, padchar,
						format.$sym20$CHARACTER);
			if (CommonSymbols.NIL != tail)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (arg.isInteger() || arg.isDouble()) {
				thread.resetMultipleValues();
				SubLObject left = format.split_flonum_digits(Numbers.sublisp_float(arg, CommonSymbols.UNPROVIDED), k);
				SubLObject right = thread.secondMultipleValue();
				thread.resetMultipleValues();
				SubLObject left_size = CommonSymbols.NIL;
				SubLObject right_size = CommonSymbols.NIL;
				SubLObject padding = CommonSymbols.NIL;
				if (CommonSymbols.NIL != left)
					left_size = Sequences.length(left);
				else if (CommonSymbols.NIL == left && CommonSymbols.NIL != w && CommonSymbols.NIL != d
						&& w.numE(Numbers.add(d, CommonSymbols.ONE_INTEGER)))
					left_size = CommonSymbols.ZERO_INTEGER;
				else if (CommonSymbols.NIL == left && CommonSymbols.NIL == d)
					left_size = CommonSymbols.ZERO_INTEGER;
				else
					left_size = CommonSymbols.ONE_INTEGER;
				SubLObject except_for_right_size = Numbers.add(arg.isNegative() || CommonSymbols.NIL != at_sign_p
						? CommonSymbols.ONE_INTEGER : CommonSymbols.ZERO_INTEGER, left_size, CommonSymbols.ONE_INTEGER);
				if (CommonSymbols.NIL != d)
					right_size = d;
				else if (CommonSymbols.NIL != w) {
					SubLObject remaining = Numbers.subtract(w, except_for_right_size);
					if (remaining.isPositive())
						right_size = Numbers.max(Numbers.min(remaining, Sequences.length(right)),
								CommonSymbols.ONE_INTEGER);
					else
						right_size = CommonSymbols.ZERO_INTEGER;
				} else
					right_size = Numbers.max(Sequences.length(right), CommonSymbols.ONE_INTEGER);
				padding = CommonSymbols.NIL != w ? Numbers.subtract(w, Numbers.add(except_for_right_size, right_size))
						: CommonSymbols.ZERO_INTEGER;
				if (!right_size.eql(Sequences.length(right))) {
					thread.resetMultipleValues();
					SubLObject new_left = format.round_decimal_digits(left, right, right_size);
					SubLObject new_right = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (Sequences.length(new_left).numG(Sequences.length(left)))
						if (padding.numG(CommonSymbols.ZERO_INTEGER))
							padding = Numbers.subtract(padding, CommonSymbols.ONE_INTEGER);
						else if (CommonSymbols.NIL == d)
							right_size = Numbers.subtract(right_size, CommonSymbols.ONE_INTEGER);
					left = new_left;
					right = new_right;
				}
				if (CommonSymbols.NIL == d) {
					SubLObject index = right_size;
					SubLObject doneP = CommonSymbols.NIL;
					if (CommonSymbols.NIL == doneP) {
						SubLObject csome_list_var = right;
						SubLObject dummy = CommonSymbols.NIL;
						dummy = csome_list_var.first();
						while (CommonSymbols.NIL == doneP && CommonSymbols.NIL != csome_list_var) {
							index = Numbers.subtract(index, CommonSymbols.ONE_INTEGER);
							if (index.eql(CommonSymbols.ZERO_INTEGER))
								doneP = CommonSymbols.T;
							else if (ConsesLow.nth(index, right).eql(CommonSymbols.ZERO_INTEGER)) {
								padding = Numbers.add(padding, CommonSymbols.ONE_INTEGER);
								right_size = Numbers.subtract(right_size, CommonSymbols.ONE_INTEGER);
							} else
								doneP = CommonSymbols.T;
							csome_list_var = csome_list_var.rest();
							dummy = csome_list_var.first();
						}
					}
				}
				if (padding.isNegative() && CommonSymbols.NIL != overflowchar)
					format.format_repeat(stream, overflowchar, w);
				else {
					if (!padding.isNegative())
						format.format_repeat(stream, padchar, padding);
					if (arg.isNegative())
						streams_high.write_char(Characters.CHAR_hyphen, stream);
					else if (CommonSymbols.NIL != at_sign_p)
						streams_high.write_char(Characters.CHAR_plus, stream);
					if (CommonSymbols.NIL != left) {
						SubLObject cdolist_list_var = left;
						SubLObject digit = CommonSymbols.NIL;
						digit = cdolist_list_var.first();
						while (CommonSymbols.NIL != cdolist_list_var) {
							streams_high.write_char(Characters.digit_char(digit), stream);
							cdolist_list_var = cdolist_list_var.rest();
							digit = cdolist_list_var.first();
						}
					} else if (left_size.isPositive())
						streams_high.write_char(Characters.CHAR_0, stream);
					streams_high.write_char(Characters.CHAR_period, stream);
					SubLObject count = CommonSymbols.ZERO_INTEGER;
					SubLObject doneP = CommonSymbols.NIL;
					if (CommonSymbols.NIL == doneP) {
						SubLObject csome_list_var = right;
						SubLObject digit2 = CommonSymbols.NIL;
						digit2 = csome_list_var.first();
						while (CommonSymbols.NIL == doneP && CommonSymbols.NIL != csome_list_var) {
							count = Numbers.add(count, CommonSymbols.ONE_INTEGER);
							if (count.numGE(right_size))
								doneP = CommonSymbols.T;
							streams_high.write_char(Characters.digit_char(digit2), stream);
							csome_list_var = csome_list_var.rest();
							digit2 = csome_list_var.first();
						}
					}
				}
			} else
				format.format_integer(stream, arg, CommonSymbols.TEN_INTEGER, ConsesLow.list(w), at_sign_p,
						CommonSymbols.NIL);
		} finally {
			print_high.$print_readably$.rebind(_prev_bind_2, thread);
			print_high.$print_escape$.rebind(_prev_bind_0, thread);
		}
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 26207L)
	public static SubLObject format_g_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.unimplemented_format_directive(Characters.CHAR_G, CommonSymbols.UNPROVIDED);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 32155L)
	public static SubLObject format_greater_than_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.illegal_directive(string, start);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 29427L)
	public static SubLObject format_i_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLObject n = CommonSymbols.NIL;
		n = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == n)
			n = CommonSymbols.ZERO_INTEGER;
		if (CommonSymbols.NIL == format.format_typep(n, format.$list54))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, n, format.$list54);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		format.check_flags(Characters.CHAR_I, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.T);
		format.unimplemented_format_directive(Characters.CHAR_I, CommonSymbols.UNPROVIDED);
		return Values.values(args, end);
	}

	@SubL(source = "sublisp/format.lisp", position = 9556L)
	public static SubLObject format_integer(SubLObject stream, SubLObject integer, SubLObject radix,
			SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
		SubLObject _prev_bind_2 = print_high.$print_radix$.currentBinding(thread);
		SubLObject _prev_bind_3 = print_high.$print_base$.currentBinding(thread);
		SubLObject _prev_bind_4 = print_high.$print_readably$.currentBinding(thread);
		try {
			print_high.$print_escape$.bind(CommonSymbols.NIL, thread);
			print_high.$print_radix$.bind(CommonSymbols.NIL, thread);
			print_high.$print_base$.bind(radix, thread);
			print_high.$print_readably$.bind(CommonSymbols.NIL, thread);
			if (CommonSymbols.NIL != parameters || CommonSymbols.NIL != colonp) {
				SubLObject comma_interval = CommonSymbols.NIL;
				SubLObject commachar = CommonSymbols.NIL;
				SubLObject padchar = CommonSymbols.NIL;
				SubLObject mincol = CommonSymbols.NIL;
				mincol = parameters.first();
				SubLObject tail = parameters.rest();
				if (CommonSymbols.NIL == mincol)
					mincol = CommonSymbols.ZERO_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(mincol, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, mincol,
							format.$list54);
				padchar = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == padchar)
					padchar = Characters.CHAR_space;
				if (CommonSymbols.NIL == format.format_typep(padchar, format.$sym20$CHARACTER))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, padchar,
							format.$sym20$CHARACTER);
				commachar = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == commachar)
					commachar = Characters.CHAR_comma;
				if (CommonSymbols.NIL == format.format_typep(commachar, format.$sym20$CHARACTER))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, commachar,
							format.$sym20$CHARACTER);
				comma_interval = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == comma_interval)
					comma_interval = CommonSymbols.THREE_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(comma_interval, format.$list55))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, comma_interval,
							format.$list55);
				if (CommonSymbols.NIL != tail)
					Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
				if (integer.isInteger()) {
					SubLObject output = CommonSymbols.NIL;
					SubLObject temp_stream = CommonSymbols.NIL;
					try {
						temp_stream = streams_high.make_private_string_output_stream();
						format.format_integer_internal(temp_stream, integer);
						output = streams_high.get_output_stream_string(temp_stream);
					} finally {
						SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, thread);
							SubLObject _values = Values.getValuesAsVector();
							streams_high.close(temp_stream, CommonSymbols.UNPROVIDED);
							Values.restoreValuesFromVector(_values);
						} finally {
							Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
						}
					}
					if (CommonSymbols.NIL != colonp) {
						SubLObject length = Sequences.length(output);
						thread.resetMultipleValues();
						SubLObject segments = Numbers.truncate(length, comma_interval);
						SubLObject extras = thread.secondMultipleValue();
						thread.resetMultipleValues();
						SubLObject new_output = Strings.make_string(
								Numbers.add(length, extras.isZero()
										? Numbers.subtract(segments, CommonSymbols.ONE_INTEGER) : segments),
								CommonSymbols.UNPROVIDED);
						Sequences.replace(new_output, output, CommonSymbols.ZERO_INTEGER, extras,
								CommonSymbols.ZERO_INTEGER, CommonSymbols.UNPROVIDED);
						SubLObject idx = extras;
						SubLObject new_idx = extras;
						SubLObject i;
						for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
								.numL(segments); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
							if (!new_idx.isZero()) {
								Strings.set_char(new_output, new_idx, commachar);
								new_idx = Numbers.add(new_idx, CommonSymbols.ONE_INTEGER);
							}
							Sequences.replace(new_output, output, new_idx, Numbers.add(new_idx, comma_interval), idx,
									CommonSymbols.UNPROVIDED);
							idx = Numbers.add(idx, comma_interval);
							new_idx = Numbers.add(new_idx, comma_interval);
						}
						output = new_output;
					}
					if (integer.isNegative())
						output = Sequences.cconcatenate(format.$str56$_, output);
					else if (CommonSymbols.NIL != at_sign_p)
						output = Sequences.cconcatenate(format.$str57$_, output);
					format.format_padded(stream, output, CommonSymbols.T, mincol, CommonSymbols.ONE_INTEGER,
							CommonSymbols.ZERO_INTEGER, padchar);
				} else
					format.format_padded(stream,
							PrintLow.write_to_string(integer, SubLTranslatedFile.EMPTY_SUBL_OBJECT_ARRAY),
							CommonSymbols.T, mincol, CommonSymbols.ONE_INTEGER, CommonSymbols.ZERO_INTEGER, padchar);
			} else {
				if (integer.isNegative())
					streams_high.write_char(Characters.CHAR_hyphen, stream);
				else if (CommonSymbols.NIL != at_sign_p)
					streams_high.write_char(Characters.CHAR_plus, stream);
				format.format_integer_internal(stream, integer);
			}
		} finally {
			print_high.$print_readably$.rebind(_prev_bind_4, thread);
			print_high.$print_base$.rebind(_prev_bind_3, thread);
			print_high.$print_radix$.rebind(_prev_bind_2, thread);
			print_high.$print_escape$.rebind(_prev_bind_0, thread);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 9204L)
	public static SubLObject format_integer_internal(SubLObject stream, SubLObject integer) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject quotient = Numbers.truncate(integer, print_high.$print_base$.getDynamicValue(thread));
		SubLObject remainder = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (!quotient.isZero())
			format.format_integer_internal(stream, quotient);
		streams_high.write_char(Characters.digit_char(Numbers.abs(remainder)), stream);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 47474L)
	public static SubLObject format_internal(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		while (!start.numGE(end)) {
			thread.resetMultipleValues();
			SubLObject ch = format.parse_format_command(string, start, end, CommonSymbols.T, args);
			SubLObject directive_start = thread.secondMultipleValue();
			SubLObject directive_end = thread.thirdMultipleValue();
			SubLObject at_sign_p = thread.fourthMultipleValue();
			SubLObject colonp = thread.fifthMultipleValue();
			SubLObject parameters = thread.sixthMultipleValue();
			SubLObject new_args = thread.seventhMultipleValue();
			thread.resetMultipleValues();
			args = new_args;
			if (CommonSymbols.NIL == ch) {
				if (start.numL(end))
					streams_high.write_string(string, stream, start, end);
				return args;
			}
			if (start.numL(directive_start))
				streams_high.write_string(string, stream, start, directive_start);
			thread.resetMultipleValues();
			SubLObject newer_args = format.call_format_directive(ch, stream, string, directive_end, end, new_args,
					all_args, parameters, at_sign_p, colonp);
			SubLObject new_start = thread.secondMultipleValue();
			thread.resetMultipleValues();
			args = newer_args;
			start = new_start;
		}
		return args;
	}

	@SubL(source = "sublisp/format.lisp", position = 38028L)
	public static SubLObject format_iteration(SubLObject stream, SubLObject format_control, SubLObject start,
			SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		try {
			thread.throwStack.push(format.$sym112$UP_AND_OUT);
			SubLObject count;
			for (count = CommonSymbols.NIL, count = CommonSymbols.ZERO_INTEGER; (CommonSymbols.NIL == max
					|| !count.numGE(max))
					&& (CommonSymbols.NIL != args || !count.numGE(min)); args = format_control.isFunction()
							? Functions.apply(format_control, stream, args)
							: format.format_internal(stream, format_control, start, end, args, args), count = Numbers
									.add(count, CommonSymbols.ONE_INTEGER)) {
			}
		} catch (Throwable ccatch_env_var) {
			args = Errors.handleThrowable(ccatch_env_var, format.$sym112$UP_AND_OUT);
		} finally {
			thread.throwStack.pop();
		}
		return args;
	}

	@SubL(source = "sublisp/format.lisp", position = 38423L)
	public static SubLObject format_left_brace_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject max = CommonSymbols.NIL;
		max = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == max)
			max = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(max, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, max, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		thread.resetMultipleValues();
		SubLObject expr_end = format.find_directive(Characters.CHAR_rbrace, string, start, end);
		SubLObject new_start = thread.secondMultipleValue();
		SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
		SubLObject expr_end_colonp = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL == expr_end)
			format.matching_bracket_not_found(Characters.CHAR_lbrace, Characters.CHAR_rbrace, string);
		format.check_flags(Characters.CHAR_lbrace, expr_end_at_sign_p, CommonSymbols.NIL, expr_end_colonp,
				CommonSymbols.T);
		SubLObject min = CommonSymbols.NIL != expr_end_colonp ? CommonSymbols.ONE_INTEGER : CommonSymbols.ZERO_INTEGER;
		SubLObject format_control = CommonSymbols.NIL;
		SubLObject format_args = args;
		if (start.numE(expr_end)) {
			format_control = format_args.first();
			format_args = format_args.rest();
			if (format_control.isString()) {
				start = CommonSymbols.ZERO_INTEGER;
				expr_end = Sequences.length(format_control);
			} else if (!format_control.isFunction())
				format.not_a_format_control(format_control);
		} else
			format_control = string;
		if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL != colonp)
			return Values.values(
					format.format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args),
					new_start);
		if (CommonSymbols.NIL != at_sign_p)
			return Values.values(
					format.format_iteration(stream, format_control, start, expr_end, min, max, format_args), new_start);
		if (CommonSymbols.NIL != colonp) {
			if (!format_args.first().isList())
				format.not_a_list_argument(Characters.CHAR_lbrace);
			format.format_sublist_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
			return Values.values(format_args.rest(), new_start);
		}
		if (!format_args.first().isList())
			format.not_a_list_argument(Characters.CHAR_lbrace);
		format.format_iteration(stream, format_control, start, expr_end, min, max, format_args.first());
		return Values.values(format_args.rest(), new_start);
	}

	@SubL(source = "sublisp/format.lisp", position = 33777L)
	public static SubLObject format_left_bracket_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		format.check_flags(Characters.CHAR_lbracket, at_sign_p, CommonSymbols.T, colonp, CommonSymbols.T);
		thread.resetMultipleValues();
		SubLObject expr_end = format.find_directive(Characters.CHAR_rbracket, string, start, end);
		SubLObject new_start = thread.secondMultipleValue();
		SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
		SubLObject expr_end_colonp = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL == expr_end)
			format.matching_bracket_not_found(Characters.CHAR_lbracket, Characters.CHAR_rbracket, string);
		format.check_flags(Characters.CHAR_rbracket, expr_end_at_sign_p, CommonSymbols.NIL, expr_end_colonp,
				CommonSymbols.NIL);
		if (CommonSymbols.NIL != at_sign_p) {
			if (CommonSymbols.NIL != parameters)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (CommonSymbols.NIL != args.first())
				return Values.values(format.format_internal(stream, string, start, expr_end, args, all_args),
						new_start);
			return Values.values(args.rest(), new_start);
		} else if (CommonSymbols.NIL != colonp) {
			if (CommonSymbols.NIL != parameters)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			thread.resetMultipleValues();
			SubLObject separator_start = format.find_directive(Characters.CHAR_semicolon, string, start, expr_end);
			SubLObject separator_end = thread.secondMultipleValue();
			SubLObject separator_at_sign_p = thread.thirdMultipleValue();
			SubLObject separator_colonp = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			if (CommonSymbols.NIL == separator_start)
				Errors.error(format.$str107$No_clause_marker_found_for__S__S_, Characters.CHAR_lbracket,
						format.$sym38$FORMAT);
			format.check_flags(Characters.CHAR_semicolon, separator_at_sign_p, CommonSymbols.NIL, separator_colonp,
					CommonSymbols.NIL);
			if (CommonSymbols.NIL != args.first())
				return Values.values(
						format.format_internal(stream, string, separator_end, expr_end, args.rest(), all_args),
						new_start);
			return Values.values(format.format_internal(stream, string, start, separator_start, args.rest(), all_args),
					new_start);
		} else {
			SubLObject index = CommonSymbols.NIL;
			index = parameters.first();
			SubLObject tail = parameters.rest();
			if (CommonSymbols.NIL == index)
				index = CommonSymbols.NIL;
			if (CommonSymbols.NIL == format.format_typep(index, format.$list108))
				Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, index,
						format.$list108);
			if (CommonSymbols.NIL != tail)
				Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
			if (CommonSymbols.NIL == index) {
				index = args.first();
				args = args.rest();
			}
			assert CommonSymbols.NIL != Types.integerp(index) : index;
			SubLObject default_start = CommonSymbols.NIL;
			SubLObject count = CommonSymbols.ZERO_INTEGER;
			SubLObject donep = CommonSymbols.NIL;
			SubLObject clause_start = start;
			while (CommonSymbols.NIL == donep && CommonSymbols.NIL == default_start) {
				thread.resetMultipleValues();
				SubLObject separator_start2 = format.find_directive(Characters.CHAR_semicolon, string, clause_start,
						expr_end);
				SubLObject separator_end2 = thread.secondMultipleValue();
				SubLObject separator_at_sign_p2 = thread.thirdMultipleValue();
				SubLObject separator_colonp2 = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				format.check_flags(Characters.CHAR_semicolon, separator_at_sign_p2, CommonSymbols.NIL,
						separator_colonp2, CommonSymbols.T);
				if (count.numE(index))
					return Values.values(format.format_internal(stream, string, clause_start,
							CommonSymbols.NIL != separator_start2 ? separator_start2 : expr_end, args, all_args),
							new_start);
				count = Numbers.add(count, CommonSymbols.ONE_INTEGER);
				if (CommonSymbols.NIL != separator_start2) {
					if (CommonSymbols.NIL != separator_colonp2)
						default_start = separator_end2;
					else
						clause_start = separator_end2;
				} else
					donep = CommonSymbols.T;
			}
			if (CommonSymbols.NIL != default_start)
				return Values.values(format.format_internal(stream, string, default_start, expr_end, args, all_args),
						new_start);
			return Values.values(args, new_start);
		}
	}

	@SubL(source = "sublisp/format.lisp", position = 41910L)
	public static SubLObject format_left_paren_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		thread.resetMultipleValues();
		SubLObject expr_end = format.find_directive(Characters.CHAR_rparen, string, start, end);
		SubLObject new_start = thread.secondMultipleValue();
		SubLObject expr_end_at_sign_p = thread.thirdMultipleValue();
		SubLObject expr_end_colonp = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL == expr_end)
			format.matching_bracket_not_found(Characters.CHAR_lbrace, Characters.CHAR_rbrace, string);
		format.check_flags(Characters.CHAR_rparen, expr_end_at_sign_p, CommonSymbols.NIL, expr_end_colonp,
				CommonSymbols.NIL);
		SubLObject continue_throw = CommonSymbols.T;
		SubLObject new_args = CommonSymbols.NIL;
		SubLObject output = CommonSymbols.NIL;
		SubLObject string_stream = CommonSymbols.NIL;
		try {
			string_stream = streams_high.make_private_string_output_stream();
			try {
				thread.throwStack.push(format.$sym112$UP_AND_OUT);
				new_args = format.format_internal(string_stream, string, start, expr_end, args, all_args);
				continue_throw = CommonSymbols.NIL;
			} catch (Throwable ccatch_env_var) {
				new_args = Errors.handleThrowable(ccatch_env_var, format.$sym112$UP_AND_OUT);
			} finally {
				thread.throwStack.pop();
			}
			output = streams_high.get_output_stream_string(string_stream);
		} finally {
			SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind(CommonSymbols.T, thread);
				SubLObject _values = Values.getValuesAsVector();
				streams_high.close(string_stream, CommonSymbols.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		}
		if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL != colonp)
			output = Strings.nstring_upcase(output, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else if (CommonSymbols.NIL != at_sign_p) {
			output = Strings.nstring_downcase(output, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			SubLObject length;
			SubLObject done;
			SubLObject i;
			for (length = Sequences
					.length(output), done = CommonSymbols.NIL, i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; CommonSymbols.NIL == done
							&& !i.numE(length); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
				if (CommonSymbols.NIL != Characters.alpha_char_p(Strings.sublisp_char(output, i))) {
					Strings.set_char(output, i, Characters.char_upcase(Strings.sublisp_char(output, i)));
					done = CommonSymbols.T;
				}
		} else if (CommonSymbols.NIL != colonp)
			output = Strings.nstring_capitalize(output, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else
			output = Strings.nstring_downcase(output, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		streams_high.write_string(output, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL != continue_throw) {
			Dynamic.sublisp_throw(format.$sym112$UP_AND_OUT, new_args);
			return CommonSymbols.NIL;
		}
		return Values.values(new_args, new_start);
	}

	@SubL(source = "sublisp/format.lisp", position = 31818L)
	public static SubLObject format_less_than_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.unimplemented_format_directive(Characters.CHAR_less, CommonSymbols.UNPROVIDED);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 45875L)
	public static SubLObject format_newline_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		if (CommonSymbols.NIL != colonp)
			return Values.values(args, start);
		if (CommonSymbols.NIL != at_sign_p)
			streams_high.write_char(Characters.CHAR_newline, stream);
		while (!start.numG(end) && CommonSymbols.NIL != reader.whitespace_1_char_p(Strings.sublisp_char(string, start)))
			start = Numbers.add(start, CommonSymbols.ONE_INTEGER);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 18793L)
	public static SubLObject format_o_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.format_integer(stream, args.first(), CommonSymbols.EIGHT_INTEGER, parameters, at_sign_p, colonp);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 15001L)
	public static SubLObject format_ordinal(SubLObject stream, SubLObject integer) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.integerp(integer) : integer;
		if (integer.isZero())
			streams_high.write_string(format.$str72$zeroth, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		else if (integer.isNegative()) {
			streams_high.write_string(format.$str71$minus_, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
			format.format_ordinal(stream, Numbers.minus(integer));
		} else {
			thread.resetMultipleValues();
			SubLObject hundreds = Numbers.truncate(integer, format.$int64$100);
			SubLObject remainder = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (!hundreds.isZero())
				format.format_cardinal(stream, Numbers.subtract(integer, remainder));
			if (remainder.isPositive()) {
				thread.resetMultipleValues();
				SubLObject tens = Numbers.truncate(remainder, CommonSymbols.TEN_INTEGER);
				SubLObject zeros = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (hundreds.isPositive())
					streams_high.write_char(Characters.CHAR_space, stream);
				if (zeros.isZero())
					streams_high.write_string(Vectors.aref(format.$ic73, tens), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				else if (tens.numE(CommonSymbols.ONE_INTEGER))
					streams_high.write_string(Vectors.aref(format.$ic74, zeros), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				else {
					if (tens.isPositive()) {
						format.format_cardinal(stream, Numbers.subtract(remainder, zeros));
						streams_high.write_char(Characters.CHAR_hyphen, stream);
					}
					streams_high.write_string(Vectors.aref(format.$ic75, zeros), stream, CommonSymbols.UNPROVIDED,
							CommonSymbols.UNPROVIDED);
				}
			} else
				streams_high.write_string(format.$str76$th, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 43927L)
	public static SubLObject format_p_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		SubLObject arg = CommonSymbols.NIL;
		if (CommonSymbols.NIL != colonp)
			arg = format.backup_args(args, all_args, CommonSymbols.ONE_INTEGER).first();
		else {
			arg = args.first();
			args = args.rest();
		}
		if (CommonSymbols.NIL != at_sign_p) {
			if (arg.eql(CommonSymbols.ONE_INTEGER))
				streams_high.write_char(Characters.CHAR_y, stream);
			else
				streams_high.write_string(format.$str120$ies, stream, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED);
		} else if (!arg.eql(CommonSymbols.ONE_INTEGER))
			streams_high.write_char(Characters.CHAR_s, stream);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 6453L)
	public static SubLObject format_padded(SubLObject stream, SubLObject string, SubLObject pad_left_p,
			SubLObject mincol, SubLObject colinc, SubLObject minpad, SubLObject padchar) {
		SubLObject length = Numbers.add(Sequences.length(string), minpad);
		SubLObject padding = Numbers.add(minpad,
				length.numL(mincol)
						? Numbers.multiply(Numbers.ceiling(Numbers.subtract(mincol, length), colinc), colinc)
						: CommonSymbols.ZERO_INTEGER);
		if (CommonSymbols.NIL != pad_left_p)
			format.format_repeat(stream, padchar, padding);
		streams_high.write_string(string, stream, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		if (CommonSymbols.NIL == pad_left_p)
			format.format_repeat(stream, padchar, padding);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 7557L)
	public static SubLObject format_percent_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_percent, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.NIL);
		SubLObject n = CommonSymbols.NIL;
		n = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == n)
			n = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(n, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, n, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		SubLObject cdotimes_end_var;
		SubLObject i;
		for (cdotimes_end_var = format
				.repitition_designator_value(n), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
						.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
			streams_high.terpri(stream);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 40673L)
	public static SubLObject format_question_mark_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		format.check_flags(Characters.CHAR_question, at_sign_p, CommonSymbols.T, colonp, CommonSymbols.NIL);
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		if (CommonSymbols.NIL != at_sign_p) {
			SubLObject string_$4 = args.first();
			SubLObject new_args = CommonSymbols.NIL;
			assert CommonSymbols.NIL != Types.stringp(string_$4) : string_$4;
			try {
				thread.throwStack.push(format.$sym112$UP_AND_OUT);
				new_args = format.format_internal(stream, string_$4, CommonSymbols.ZERO_INTEGER,
						Sequences.length(string_$4), args.rest(), all_args);
			} catch (Throwable ccatch_env_var) {
				new_args = Errors.handleThrowable(ccatch_env_var, format.$sym112$UP_AND_OUT);
			} finally {
				thread.throwStack.pop();
			}
			return Values.values(new_args, start);
		} else {
			SubLObject format_control = args.first();
			SubLObject sub_args = conses_high.cadr(args);
			SubLObject dummy = CommonSymbols.NIL;
			assert CommonSymbols.NIL != Types.listp(sub_args) : sub_args;
			try {
				thread.throwStack.push(format.$sym112$UP_AND_OUT);
				if (format_control.isString())
					format.format_internal(stream, format_control, CommonSymbols.ZERO_INTEGER,
							Sequences.length(format_control), sub_args, sub_args);
				else if (format_control.isFunction())
					Functions.apply(format_control, stream, sub_args);
				else
					format.not_a_format_control(format_control);
			} catch (Throwable ccatch_env_var2) {
				dummy = Errors.handleThrowable(ccatch_env_var2, format.$sym112$UP_AND_OUT);
			} finally {
				thread.throwStack.pop();
			}
			return Values.values(conses_high.cddr(args), start);
		}
	}

	@SubL(source = "sublisp/format.lisp", position = 16256L)
	public static SubLObject format_r_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != parameters) {
			SubLObject radix = parameters.first();
			if (!radix.isInteger() || !radix.numGE(CommonSymbols.TWO_INTEGER) || !radix.numLE(format.$int77$36))
				Errors.error(format.$str78$_S_is_not_a_valid_radix_, radix);
			format.format_integer(stream, args.first(), radix, parameters.rest(), at_sign_p, colonp);
		} else {
			SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
			try {
				print_high.$print_base$.bind(CommonSymbols.TEN_INTEGER, thread);
				SubLObject arg = args.first();
				assert CommonSymbols.NIL != Types.integerp(arg) : arg;
				if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL != colonp) {
					if (arg.isPositive()) {
						SubLObject chars;
						SubLObject vals;
						for (chars = CommonSymbols.NIL, vals = CommonSymbols.NIL, chars = format.$list79, vals = format.$list80; !arg
								.isZero(); arg = Numbers.rem(arg,
										vals.first()), chars = chars.rest(), vals = vals.rest())
							format.format_repeat(stream, chars.first(), Numbers.truncate(arg, vals.first()));
					} else
						format.format_integer(stream, arg, CommonSymbols.TEN_INTEGER, CommonSymbols.NIL,
								CommonSymbols.NIL, CommonSymbols.NIL);
				} else if (CommonSymbols.NIL != at_sign_p) {
					if (arg.isPositive()) {
						SubLObject chars = CommonSymbols.NIL;
						SubLObject vals = CommonSymbols.NIL;
						SubLObject sub_vals = CommonSymbols.NIL;
						SubLObject sub_chars = CommonSymbols.NIL;
						chars = format.$list79;
						vals = format.$list80;
						sub_vals = format.$list81;
						sub_chars = format.$list82;
						while (!arg.isZero()) {
							format.format_repeat(stream, chars.first(), Numbers.integerDivide(arg, vals.first()));
							arg = Numbers.rem(arg, vals.first());
							if (CommonSymbols.NIL != sub_vals && arg.numGE(sub_vals.first())) {
								streams_high.write_char(sub_chars.first(), stream);
								streams_high.write_char(chars.first(), stream);
								arg = Numbers.subtract(arg, sub_vals.first());
							}
							chars = chars.rest();
							vals = vals.rest();
							sub_vals = sub_vals.rest();
							sub_chars = sub_chars.rest();
						}
					} else
						format.format_integer(stream, arg, CommonSymbols.TEN_INTEGER, CommonSymbols.NIL,
								CommonSymbols.NIL, CommonSymbols.NIL);
				} else if (CommonSymbols.NIL != colonp)
					format.format_ordinal(stream, arg);
				else
					format.format_cardinal(stream, arg);
			} finally {
				print_high.$print_base$.rebind(_prev_bind_0, thread);
			}
		}
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 6319L)
	public static SubLObject format_repeat(SubLObject stream, SubLObject ch, SubLObject count) {
		SubLObject cdotimes_end_var;
		SubLObject i;
		for (cdotimes_end_var = format
				.repitition_designator_value(count), i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
						.numL(cdotimes_end_var); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
			streams_high.write_char(ch, stream);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 40386L)
	public static SubLObject format_right_brace_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.illegal_directive(string, start);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 36945L)
	public static SubLObject format_right_bracket_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.illegal_directive(string, start);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 43636L)
	public static SubLObject format_right_paren_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.illegal_directive(string, start);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 27591L)
	public static SubLObject format_s_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = print_high.$print_escape$.currentBinding(thread);
		try {
			print_high.$print_escape$.bind(CommonSymbols.T, thread);
			SubLObject arg = args.first();
			if (CommonSymbols.NIL != colonp && CommonSymbols.NIL == arg)
				arg = format.$str93$__;
			if (CommonSymbols.NIL != parameters) {
				SubLObject padchar = CommonSymbols.NIL;
				SubLObject minpad = CommonSymbols.NIL;
				SubLObject colinc = CommonSymbols.NIL;
				SubLObject mincol = CommonSymbols.NIL;
				mincol = parameters.first();
				SubLObject tail = parameters.rest();
				if (CommonSymbols.NIL == mincol)
					mincol = CommonSymbols.ZERO_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(mincol, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, mincol,
							format.$list54);
				colinc = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == colinc)
					colinc = CommonSymbols.ONE_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(colinc, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, colinc,
							format.$list54);
				minpad = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == minpad)
					minpad = CommonSymbols.ZERO_INTEGER;
				if (CommonSymbols.NIL == format.format_typep(minpad, format.$list54))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, minpad,
							format.$list54);
				padchar = tail.first();
				tail = tail.rest();
				if (CommonSymbols.NIL == padchar)
					padchar = Characters.CHAR_space;
				if (CommonSymbols.NIL == format.format_typep(padchar, format.$sym20$CHARACTER))
					Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, padchar,
							format.$sym20$CHARACTER);
				if (CommonSymbols.NIL != tail)
					Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
				Functions.funcall(Symbols.symbol_function(format.$sym94$FORMAT_PADDED),
						new SubLObject[] { stream,
								PrintLow.write_to_string(arg, SubLTranslatedFile.EMPTY_SUBL_OBJECT_ARRAY), at_sign_p,
								mincol, colinc, minpad, padchar });
			} else
				print_high.prin1(arg, stream);
		} finally {
			print_high.$print_escape$.rebind(_prev_bind_0, thread);
		}
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 44546L)
	public static SubLObject format_semicolon_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.illegal_directive(string, start);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 29981L)
	public static SubLObject format_slash_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_slash, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.T);
		SubLObject slash_idx = Sequences.position(Characters.CHAR_slash, string,
				Symbols.symbol_function(format.$sym101$CHAR_), Symbols.symbol_function(CommonSymbols.IDENTITY), start,
				end);
		if (CommonSymbols.NIL == slash_idx)
			format.matching_bracket_not_found(Characters.CHAR_slash, Characters.CHAR_slash, string);
		SubLObject symbol = Packages.intern(Strings.string_upcase(string, start, slash_idx), CommonSymbols.UNPROVIDED);
		Functions.apply(symbol, stream, new SubLObject[] { args.first(), colonp, at_sign_p, parameters });
		return Values.values(args.rest(), Numbers.add(slash_idx, CommonSymbols.ONE_INTEGER));
	}

	@SubL(source = "sublisp/format.lisp", position = 37410L)
	public static SubLObject format_sublist_iteration(SubLObject stream, SubLObject format_control, SubLObject start,
			SubLObject end, SubLObject min, SubLObject max, SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		try {
			thread.throwStack.push(format.$sym111$UP_AND_ALL_THE_WAY_OUT);
			SubLObject count = CommonSymbols.NIL;
			SubLObject sub_args = CommonSymbols.NIL;
			count = CommonSymbols.ZERO_INTEGER;
			sub_args = args.first();
			while ((CommonSymbols.NIL == max || !count.numGE(max))
					&& (CommonSymbols.NIL != args || !count.numGE(min))) {
				if (!sub_args.isList())
					format.not_a_list_argument(Characters.CHAR_lbrace);
				args = args.rest();
				SubLObject _prev_bind_0 = format.$remaining_args$.currentBinding(thread);
				try {
					format.$remaining_args$.bind(args, thread);
					SubLObject dummy = CommonSymbols.NIL;
					try {
						thread.throwStack.push(format.$sym112$UP_AND_OUT);
						if (format_control.isFunction())
							Functions.apply(format_control, stream, sub_args);
						else
							format.format_internal(stream, format_control, start, end, sub_args, sub_args);
					} catch (Throwable ccatch_env_var) {
						dummy = Errors.handleThrowable(ccatch_env_var, format.$sym112$UP_AND_OUT);
					} finally {
						thread.throwStack.pop();
					}
				} finally {
					format.$remaining_args$.rebind(_prev_bind_0, thread);
				}
				count = Numbers.add(count, CommonSymbols.ONE_INTEGER);
				sub_args = args.first();
			}
		} catch (Throwable ccatch_env_var2) {
			args = Errors.handleThrowable(ccatch_env_var2, format.$sym111$UP_AND_ALL_THE_WAY_OUT);
		} finally {
			thread.throwStack.pop();
		}
		return args;
	}

	@SubL(source = "sublisp/format.lisp", position = 30602L)
	public static SubLObject format_t_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLObject colinc = CommonSymbols.NIL;
		SubLObject colnum = CommonSymbols.NIL;
		colnum = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == colnum)
			colnum = CommonSymbols.ONE_INTEGER;
		if (CommonSymbols.NIL == format.format_typep(colnum, format.$list54))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, colnum, format.$list54);
		colinc = tail.first();
		tail = tail.rest();
		if (CommonSymbols.NIL == colinc)
			colinc = CommonSymbols.ONE_INTEGER;
		if (CommonSymbols.NIL == format.format_typep(colinc, format.$list54))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, colinc, format.$list54);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		if (CommonSymbols.NIL != at_sign_p && CommonSymbols.NIL != colonp)
			format.unimplemented_format_directive(Characters.CHAR_T, CommonSymbols.T);
		else if (CommonSymbols.NIL != at_sign_p)
			format.format_repeat(stream, Characters.CHAR_space, colnum);
		else if (CommonSymbols.NIL != colonp)
			format.unimplemented_format_directive(Characters.CHAR_T, CommonSymbols.T);
		else {
			SubLObject current = streams_high.stream_line_column(stream);
			if (CommonSymbols.NIL == current)
				current = CommonSymbols.ZERO_INTEGER;
			if (current.numL(colnum))
				format.format_repeat(stream, Characters.CHAR_space, Numbers.subtract(colnum, current));
			else if (!colinc.isZero())
				format.format_repeat(stream, Characters.CHAR_space,
						Numbers.subtract(colinc, Numbers.mod(Numbers.subtract(current, colnum), colinc)));
		}
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 8846L)
	public static SubLObject format_tilde_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_tilde, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.NIL);
		SubLObject n = CommonSymbols.NIL;
		n = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == n)
			n = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(n, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, n, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		format.format_repeat(stream, Characters.CHAR_tilde, n);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 3776L)
	public static SubLObject format_typep(SubLObject object, SubLObject type) {
		if (type.isCons()) {
			SubLObject pcase_var = type.first();
			if (pcase_var.eql(format.$sym16$OR)) {
				SubLObject cdolist_list_var = type.rest();
				SubLObject distype = CommonSymbols.NIL;
				distype = cdolist_list_var.first();
				while (CommonSymbols.NIL != cdolist_list_var) {
					if (CommonSymbols.NIL != format.format_typep(object, distype))
						return CommonSymbols.T;
					cdolist_list_var = cdolist_list_var.rest();
					distype = cdolist_list_var.first();
				}
				return CommonSymbols.NIL;
			}
			if (pcase_var.eql(format.$sym17$INTEGER)) {
				SubLObject current;
				SubLObject datum = current = type.rest();
				SubLObject start = current.isCons() ? current.first() : CommonSymbols.NIL;
				cdestructuring_bind.destructuring_bind_must_listp(current, datum, format.$list18);
				current = current.rest();
				SubLObject end = current.isCons() ? current.first() : CommonSymbols.NIL;
				cdestructuring_bind.destructuring_bind_must_listp(current, datum, format.$list18);
				current = current.rest();
				if (CommonSymbols.NIL == current) {
					if (CommonSymbols.NIL != start && object.numL(start))
						return CommonSymbols.NIL;
					if (CommonSymbols.NIL != end && object.numG(end))
						return CommonSymbols.NIL;
					return CommonSymbols.T;
				} else
					cdestructuring_bind.cdestructuring_bind_error(datum, format.$list18);
			} else
				Errors.error(format.$str19$Unrecognized_type_specifier__S_, type);
		} else {
			if (type == format.$sym17$INTEGER)
				return Types.integerp(object);
			if (type == format.$sym20$CHARACTER)
				return Types.characterp(object);
			if (type == format.$sym21$NULL)
				return Types.sublisp_null(object);
			Errors.error(format.$str19$Unrecognized_type_specifier__S_, type);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 28738L)
	public static SubLObject format_underscore_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.unimplemented_format_directive(Characters.CHAR_underbar, CommonSymbols.UNPROVIDED);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 8472L)
	public static SubLObject format_vertical_bar_directive(SubLObject stream, SubLObject string, SubLObject start,
			SubLObject end, SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p,
			SubLObject colonp) {
		format.check_flags(Characters.CHAR_vertical, at_sign_p, CommonSymbols.NIL, colonp, CommonSymbols.NIL);
		SubLObject n = CommonSymbols.NIL;
		n = parameters.first();
		SubLObject tail = parameters.rest();
		if (CommonSymbols.NIL == n)
			n = CommonSymbols.NIL;
		if (CommonSymbols.NIL == format.format_typep(n, format.$list49))
			Errors.error(format.$str32$The__S_parameter__S_is_not_of_typ, format.$sym38$FORMAT, n, format.$list49);
		if (CommonSymbols.NIL != tail)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		format.format_repeat(stream, Characters.CHAR_page, n);
		return Values.values(args, start);
	}

	@SubL(source = "sublisp/format.lisp", position = 28282L)
	public static SubLObject format_w_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL != parameters)
			Errors.error(format.$str45$Too_many__S_parameters_, format.$sym38$FORMAT);
		SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
		SubLObject _prev_bind_2 = print_high.$print_level$.currentBinding(thread);
		SubLObject _prev_bind_3 = print_high.$print_length$.currentBinding(thread);
		try {
			print_high.$print_pretty$.bind(
					CommonSymbols.NIL != colonp ? CommonSymbols.T : print_high.$print_pretty$.getDynamicValue(thread),
					thread);
			print_high.$print_level$.bind(CommonSymbols.NIL != at_sign_p ? CommonSymbols.NIL
					: print_high.$print_level$.getDynamicValue(thread), thread);
			print_high.$print_length$.bind(CommonSymbols.NIL != at_sign_p ? CommonSymbols.NIL
					: print_high.$print_length$.getDynamicValue(thread), thread);
			PrintLow.write(args.first(), new SubLObject[] { format.$kw97$STREAM, stream });
		} finally {
			print_high.$print_length$.rebind(_prev_bind_3, thread);
			print_high.$print_level$.rebind(_prev_bind_2, thread);
			print_high.$print_pretty$.rebind(_prev_bind_0, thread);
		}
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 19060L)
	public static SubLObject format_x_directive(SubLObject stream, SubLObject string, SubLObject start, SubLObject end,
			SubLObject args, SubLObject all_args, SubLObject parameters, SubLObject at_sign_p, SubLObject colonp) {
		format.format_integer(stream, args.first(), CommonSymbols.SIXTEEN_INTEGER, parameters, at_sign_p, colonp);
		return Values.values(args.rest(), start);
	}

	@SubL(source = "sublisp/format.lisp", position = 5218L)
	public static SubLObject illegal_directive(SubLObject string, SubLObject index) {
		Errors.error(format.$str37$Stray____C_directive_in__S_string,
				Strings.sublisp_char(string, Numbers.subtract(index, CommonSymbols.ONE_INTEGER)), format.$sym38$FORMAT,
				string);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_format_file() {
		format.$format_directives$ = SubLFiles.defvar("*FORMAT-DIRECTIVES*",
				Hashtables.make_hash_table(format.$int0$50, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		format.$matching_brackets$ = SubLFiles.defvar("*MATCHING-BRACKETS*", Hashtables
				.make_hash_table(CommonSymbols.TEN_INTEGER, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED));
		format.$remaining_args$ = SubLFiles.defvar("*REMAINING-ARGS*", CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 11767L)
	public static SubLObject integer_truncate(SubLObject numerator, SubLObject denominator) {
		assert CommonSymbols.NIL != Types.integerp(numerator) : numerator;
		assert CommonSymbols.NIL != Types.integerp(denominator) : denominator;
		SubLObject result = Numbers.integerDivide(numerator, denominator);
		SubLObject remainder = Numbers.subtract(numerator, Numbers.multiply(result, denominator));
		return Values.values(result, remainder);
	}

	@SubL(source = "sublisp/format.lisp", position = 1551L)
	public static SubLObject matching_bracket(SubLObject ch) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return Hashtables.gethash(ch, format.$matching_brackets$.getDynamicValue(thread), CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/format.lisp", position = 5670L)
	public static SubLObject matching_bracket_not_found(SubLObject left, SubLObject right, SubLObject string) {
		Errors.error(format.$str41$No_matching__S_found_for__S_in__S, right, left, string);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 5937L)
	public static SubLObject not_a_format_control(SubLObject thing) {
		Errors.error(format.$str43$_S_is_not_a_valid__S_control_, thing, format.$sym38$FORMAT);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 5804L)
	public static SubLObject not_a_list_argument(SubLObject directive) {
		Errors.error(format.$str42$The__S__S_directive_takes_a_list_, directive, format.$sym38$FORMAT);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 5540L)
	public static SubLObject not_enough_format_arguments(SubLObject directive) {
		Errors.error(format.$str40$_S_directive__S_ran_out_of_argume, format.$sym38$FORMAT, directive);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 49265L)
	public static SubLObject parse_format_command(SubLObject string, SubLObject start, SubLObject end,
			SubLObject for_effect_p, SubLObject args) {
		if (for_effect_p == CommonSymbols.UNPROVIDED)
			for_effect_p = CommonSymbols.NIL;
		if (args == CommonSymbols.UNPROVIDED)
			args = CommonSymbols.NIL;
		SubLObject state = format.$kw128$NORMAL;
		SubLObject parameters = CommonSymbols.NIL;
		SubLObject at_sign_p = CommonSymbols.NIL;
		SubLObject colonp = CommonSymbols.NIL;
		SubLObject minusp = CommonSymbols.NIL;
		SubLObject number = CommonSymbols.ZERO_INTEGER;
		SubLObject tilde_idx = CommonSymbols.NIL;
		SubLObject i;
		for (i = start; !i.numGE(end); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			SubLObject ch = Strings.sublisp_char(string, i);
			SubLObject pcase_var = state;
			if (pcase_var.eql(format.$kw128$NORMAL)) {
				if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_tilde)) {
					tilde_idx = i;
					state = format.$kw129$TILDE;
				}
			} else if (pcase_var.eql(format.$kw129$TILDE)) {
				if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_hash)) {
					if (CommonSymbols.NIL != for_effect_p)
						parameters = ConsesLow.cons(Sequences.length(args), parameters);
					state = format.$kw130$PARAM;
				} else if (CommonSymbols.NIL != Characters.char_equal(ch, Characters.CHAR_V)) {
					if (CommonSymbols.NIL != for_effect_p) {
						SubLObject parameter = args.first();
						if (!parameter.isChar() && !parameter.isInteger() && CommonSymbols.NIL != parameter)
							Errors.error(format.$str131$_S_parameter__S_is_not_a_characte, format.$sym38$FORMAT,
									parameter);
						if (CommonSymbols.NIL != parameter)
							parameters = ConsesLow.cons(parameter, parameters);
						args = args.rest();
					}
					state = format.$kw130$PARAM;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_quote))
					state = format.$kw132$QUOTE;
				else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_comma)) {
					if (CommonSymbols.NIL != for_effect_p)
						parameters = ConsesLow.cons(CommonSymbols.NIL, parameters);
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_colon)) {
					colonp = CommonSymbols.T;
					state = format.$kw133$COLON;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_at)) {
					at_sign_p = CommonSymbols.T;
					state = format.$kw134$AT_SIGN;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_hyphen)) {
					if (CommonSymbols.NIL != for_effect_p) {
						minusp = CommonSymbols.T;
						number = CommonSymbols.ZERO_INTEGER;
					}
					state = format.$kw135$SIGN;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_plus)) {
					if (CommonSymbols.NIL != for_effect_p) {
						minusp = CommonSymbols.NIL;
						number = CommonSymbols.ZERO_INTEGER;
					}
					state = format.$kw135$SIGN;
				} else if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					if (CommonSymbols.NIL != for_effect_p) {
						minusp = CommonSymbols.NIL;
						number = Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER);
					}
					state = format.$kw136$NUMBER;
				} else {
					if (CommonSymbols.NIL != format.format_directive_p(ch))
						return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p,
								colonp, Sequences.nreverse(parameters), args);
					format.bad_format_directive(string, i);
				}
			} else if (pcase_var.eql(format.$kw132$QUOTE)) {
				if (CommonSymbols.NIL != for_effect_p)
					parameters = ConsesLow.cons(ch, parameters);
				state = format.$kw130$PARAM;
			} else if (pcase_var.eql(format.$kw130$PARAM)) {
				if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_comma))
					state = format.$kw129$TILDE;
				else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_colon)) {
					colonp = CommonSymbols.T;
					state = format.$kw133$COLON;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_at)) {
					at_sign_p = CommonSymbols.T;
					state = format.$kw134$AT_SIGN;
				} else {
					if (CommonSymbols.NIL != format.format_directive_p(ch))
						return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p,
								colonp, Sequences.nreverse(parameters), args);
					Errors.error(format.$str137$Bad__S_parameter_, format.$sym38$FORMAT);
				}
			} else if (pcase_var.eql(format.$kw135$SIGN)) {
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					if (CommonSymbols.NIL != for_effect_p)
						number = Numbers.add(Numbers.multiply(number, CommonSymbols.TEN_INTEGER),
								Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER));
					state = format.$kw136$NUMBER;
				} else
					Errors.error(format.$str137$Bad__S_parameter_, format.$sym38$FORMAT);
			} else if (pcase_var.eql(format.$kw133$COLON)) {
				if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_at)) {
					at_sign_p = CommonSymbols.T;
					state = format.$kw138$COLON_AT;
				} else {
					if (CommonSymbols.NIL != format.format_directive_p(ch))
						return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p,
								colonp, Sequences.nreverse(parameters), args);
					format.bad_format_directive(string, i);
				}
			} else if (pcase_var.eql(format.$kw134$AT_SIGN)) {
				if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_colon)) {
					colonp = CommonSymbols.T;
					state = format.$kw138$COLON_AT;
				} else {
					if (CommonSymbols.NIL != format.format_directive_p(ch))
						return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p,
								colonp, Sequences.nreverse(parameters), args);
					format.bad_format_directive(string, i);
				}
			} else if (pcase_var.eql(format.$kw138$COLON_AT)) {
				if (CommonSymbols.NIL != format.format_directive_p(ch))
					return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p, colonp,
							Sequences.nreverse(parameters), args);
				format.bad_format_directive(string, i);
			} else if (pcase_var.eql(format.$kw136$NUMBER))
				if (CommonSymbols.NIL != Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER)) {
					if (CommonSymbols.NIL != for_effect_p)
						number = Numbers.add(Numbers.multiply(number, CommonSymbols.TEN_INTEGER),
								Characters.digit_char_p(ch, CommonSymbols.TEN_INTEGER));
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_comma)) {
					if (CommonSymbols.NIL != for_effect_p) {
						if (CommonSymbols.NIL != minusp)
							number = Numbers.minus(number);
						parameters = ConsesLow.cons(number, parameters);
					}
					state = format.$kw129$TILDE;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_colon)) {
					colonp = CommonSymbols.T;
					if (CommonSymbols.NIL != for_effect_p) {
						if (CommonSymbols.NIL != minusp)
							number = Numbers.minus(number);
						parameters = ConsesLow.cons(number, parameters);
					}
					state = format.$kw133$COLON;
				} else if (CommonSymbols.NIL != Characters.charE(ch, Characters.CHAR_at)) {
					at_sign_p = CommonSymbols.T;
					if (CommonSymbols.NIL != for_effect_p) {
						if (CommonSymbols.NIL != minusp)
							number = Numbers.minus(number);
						parameters = ConsesLow.cons(number, parameters);
					}
					state = format.$kw134$AT_SIGN;
				} else {
					if (CommonSymbols.NIL != format.format_directive_p(ch)) {
						if (CommonSymbols.NIL != for_effect_p) {
							if (CommonSymbols.NIL != minusp)
								number = Numbers.minus(number);
							parameters = ConsesLow.cons(number, parameters);
						}
						return Values.values(ch, tilde_idx, Numbers.add(i, CommonSymbols.ONE_INTEGER), at_sign_p,
								colonp, Sequences.nreverse(parameters), args);
					}
					format.bad_format_directive(string, i);
				}
		}
		if (state != format.$kw128$NORMAL)
			Errors.error(format.$str139$Unterminated__S_control_, format.$sym38$FORMAT);
		return Values.values(CommonSymbols.NIL, CommonSymbols.NIL, i, CommonSymbols.NIL, CommonSymbols.NIL,
				CommonSymbols.NIL, args);
	}

	@SubL(source = "sublisp/format.lisp", position = 46437L)
	public static SubLObject really_format(SubLObject destination, SubLObject format_control, SubLObject args) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject stream = CommonSymbols.NIL;
		if (destination.isStream())
			stream = destination;
		else if (CommonSymbols.NIL == destination)
			stream = streams_high.make_private_string_output_stream();
		else if (destination == CommonSymbols.T)
			stream = StreamsLow.$standard_output$.getDynamicValue(thread);
		else if (destination.isString())
			Errors.error(format.$str125$_S_does_not_support_string_destin, format.$sym38$FORMAT);
		else
			Errors.error(format.$str126$_S_is_not_a_valid__S_destination_, destination, format.$sym38$FORMAT);
		SubLObject dummy = CommonSymbols.NIL;
		try {
			thread.throwStack.push(format.$sym112$UP_AND_OUT);
			try {
				thread.throwStack.push(format.$sym111$UP_AND_ALL_THE_WAY_OUT);
				if (format_control.isString())
					format.format_internal(stream, format_control, CommonSymbols.ZERO_INTEGER,
							Sequences.length(format_control), args, args);
				else if (format_control.isFunction())
					Functions.apply(format_control, stream, args);
				else
					format.not_a_format_control(format_control);
			} catch (Throwable ccatch_env_var) {
				dummy = Errors.handleThrowable(ccatch_env_var, format.$sym111$UP_AND_ALL_THE_WAY_OUT);
			} finally {
				thread.throwStack.pop();
			}
		} catch (Throwable ccatch_env_var) {
			dummy = Errors.handleThrowable(ccatch_env_var, format.$sym112$UP_AND_OUT);
		} finally {
			thread.throwStack.pop();
		}
		if (CommonSymbols.NIL != destination)
			return CommonSymbols.NIL;
		return streams_high.get_output_stream_string(stream);
	}

	@SubL(source = "sublisp/format.lisp", position = 6044L)
	public static SubLObject repitition_designator_value(SubLObject count) {
		if (CommonSymbols.NIL == count)
			return CommonSymbols.ONE_INTEGER;
		if (count.isInteger() && !count.isNegative())
			return count;
		Errors.error(format.$str44$_S_is_not_a_valid__S_repitition_s, count, format.$sym38$FORMAT);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 21428L)
	public static SubLObject round_decimal_digits(SubLObject left, SubLObject right, SubLObject places) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == places)
			places = CommonSymbols.ZERO_INTEGER;
		SubLObject rounded_left = CommonSymbols.NIL;
		thread.resetMultipleValues();
		SubLObject rounded_right = format.round_digits(right, places);
		SubLObject carry = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (CommonSymbols.NIL != carry)
			rounded_left = format.digits_add_1(left);
		else
			rounded_left = left;
		return Values.values(rounded_left, rounded_right);
	}

	@SubL(source = "sublisp/format.lisp", position = 20225L)
	public static SubLObject round_digits(SubLObject digits, SubLObject places) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (places.isZero())
			return Values.values(CommonSymbols.NIL, SubLObjectFactory
					.makeBoolean(CommonSymbols.NIL != digits && digits.first().numGE(CommonSymbols.FIVE_INTEGER)));
		thread.resetMultipleValues();
		SubLObject new_digits = format.round_digits(digits.rest(), Numbers.subtract(places, CommonSymbols.ONE_INTEGER));
		SubLObject carry = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject digit = digits.first();
		if (CommonSymbols.NIL == digits)
			digit = CommonSymbols.ZERO_INTEGER;
		if (CommonSymbols.NIL == carry)
			return Values.values(ConsesLow.cons(digit, new_digits), CommonSymbols.NIL);
		if (digit.numE(CommonSymbols.NINE_INTEGER))
			return Values.values(ConsesLow.cons(CommonSymbols.ZERO_INTEGER, new_digits), CommonSymbols.T);
		return Values.values(ConsesLow.cons(Numbers.add(digit, CommonSymbols.ONE_INTEGER), new_digits),
				CommonSymbols.NIL);
	}

	public static SubLObject setup_format_file() {
		Hashtables.sethash(Characters.CHAR_c, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym48$FORMAT_C_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_C, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym48$FORMAT_C_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_percent, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym50$FORMAT_PERCENT_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_percent, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym50$FORMAT_PERCENT_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_ampersand, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym51$FORMAT_AMPERSAND_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_ampersand, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym51$FORMAT_AMPERSAND_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_vertical, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym52$FORMAT_VERTICAL_BAR_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_vertical, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym52$FORMAT_VERTICAL_BAR_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_tilde, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym53$FORMAT_TILDE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_tilde, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym53$FORMAT_TILDE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_r, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym83$FORMAT_R_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_R, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym83$FORMAT_R_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_d, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym84$FORMAT_D_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_D, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym84$FORMAT_D_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_b, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym85$FORMAT_B_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_B, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym85$FORMAT_B_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_o, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym86$FORMAT_O_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_O, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym86$FORMAT_O_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_x, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym87$FORMAT_X_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_X, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym87$FORMAT_X_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_f, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym89$FORMAT_F_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_F, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym89$FORMAT_F_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_e, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym90$FORMAT_E_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_E, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym90$FORMAT_E_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_g, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym91$FORMAT_G_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_G, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym91$FORMAT_G_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_dollar, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym92$FORMAT_DOLLARSIGN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_dollar, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym92$FORMAT_DOLLARSIGN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_a, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym95$FORMAT_A_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_A, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym95$FORMAT_A_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_s, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym96$FORMAT_S_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_S, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym96$FORMAT_S_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_w, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym98$FORMAT_W_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_W, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym98$FORMAT_W_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_underbar, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym99$FORMAT_UNDERSCORE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_underbar, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym99$FORMAT_UNDERSCORE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_i, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym100$FORMAT_I_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_I, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym100$FORMAT_I_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_slash, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym102$FORMAT_SLASH_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_slash, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym102$FORMAT_SLASH_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_t, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym103$FORMAT_T_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_T, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym103$FORMAT_T_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_less, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym104$FORMAT_LESS_THAN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_less, format.$matching_brackets$.getDynamicValue(), Characters.CHAR_greater);
		Hashtables.sethash(Characters.CHAR_greater, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym105$FORMAT_GREATER_THAN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_greater, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym105$FORMAT_GREATER_THAN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_asterisk, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym106$FORMAT_ASTERISK_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_asterisk, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym106$FORMAT_ASTERISK_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lbracket, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym109$FORMAT_LEFT_BRACKET_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lbracket, format.$matching_brackets$.getDynamicValue(),
				Characters.CHAR_rbracket);
		Hashtables.sethash(Characters.CHAR_rbracket, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_rbracket, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym110$FORMAT_RIGHT_BRACKET_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lbrace, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym113$FORMAT_LEFT_BRACE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lbrace, format.$matching_brackets$.getDynamicValue(),
				Characters.CHAR_rbrace);
		Hashtables.sethash(Characters.CHAR_rbrace, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym114$FORMAT_RIGHT_BRACE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_rbrace, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym114$FORMAT_RIGHT_BRACE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_question, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym117$FORMAT_QUESTION_MARK_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_question, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym117$FORMAT_QUESTION_MARK_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lparen, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym118$FORMAT_LEFT_PAREN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_lparen, format.$matching_brackets$.getDynamicValue(),
				Characters.CHAR_rparen);
		Hashtables.sethash(Characters.CHAR_rparen, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym119$FORMAT_RIGHT_PAREN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_rparen, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym119$FORMAT_RIGHT_PAREN_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_p, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym121$FORMAT_P_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_P, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym121$FORMAT_P_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_semicolon, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym122$FORMAT_SEMICOLON_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_semicolon, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym122$FORMAT_SEMICOLON_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_caret, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym123$FORMAT_CIRCUMFLEX_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_caret, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym123$FORMAT_CIRCUMFLEX_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_newline, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym124$FORMAT_NEWLINE_DIRECTIVE));
		Hashtables.sethash(Characters.CHAR_newline, format.$format_directives$.getDynamicValue(),
				Symbols.symbol_function(format.$sym124$FORMAT_NEWLINE_DIRECTIVE));
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 19334L)
	public static SubLObject split_flonum_digits(SubLObject flonum, SubLObject scale) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject digits = math_utilities.flonum_digit_list(flonum);
		SubLObject real_scale = thread.secondMultipleValue();
		thread.resetMultipleValues();
		scale = Numbers.add(scale, real_scale);
		SubLObject left = CommonSymbols.NIL;
		SubLObject right = CommonSymbols.NIL;
		if (scale.isPositive()) {
			SubLObject i;
			SubLObject digit;
			for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
					.numL(scale); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
				digit = digits.first();
				if (CommonSymbols.NIL != digit) {
					left = ConsesLow.cons(digit, left);
					digits = digits.rest();
				} else
					left = ConsesLow.cons(CommonSymbols.ZERO_INTEGER, left);
			}
			left = Sequences.nreverse(left);
			right = digits;
		} else {
			SubLObject cdotimes_end_var;
			SubLObject j;
			for (cdotimes_end_var = Numbers.minus(scale), j = CommonSymbols.NIL, j = CommonSymbols.ZERO_INTEGER; j
					.numL(cdotimes_end_var); j = Numbers.add(j, CommonSymbols.ONE_INTEGER))
				right = ConsesLow.cons(CommonSymbols.ZERO_INTEGER, right);
			right = ConsesLow.nconc(right, digits);
		}
		return Values.values(left, right);
	}

	@SubL(source = "sublisp/format.lisp", position = 3017L)
	public static SubLObject unimplemented_format_directive(SubLObject directive, SubLObject fullyp) {
		if (fullyp == CommonSymbols.UNPROVIDED)
			fullyp = CommonSymbols.NIL;
		Errors.error(format.$str12$The__A_format_directive_is_not_ye, directive, fullyp);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/format.lisp", position = 4551L)
	public static SubLObject with_format_parameters(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		SubLObject pattern = CommonSymbols.NIL;
		SubLObject parameters = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list22);
		pattern = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, format.$list22);
		parameters = current.first();
		SubLObject body;
		current = body = current.rest();
		SubLObject vars = CommonSymbols.NIL;
		SubLObject code = CommonSymbols.NIL;
		SubLObject tail = Symbols.make_symbol(format.$str23$TAIL);
		SubLObject cdolist_list_var = pattern;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			SubLObject current_$2;
			SubLObject datum_$1 = current_$2 = item;
			SubLObject var = CommonSymbols.NIL;
			SubLObject init = CommonSymbols.NIL;
			SubLObject type = CommonSymbols.NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, format.$list24);
			var = current_$2.first();
			current_$2 = current_$2.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, format.$list24);
			init = current_$2.first();
			current_$2 = current_$2.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, format.$list24);
			type = current_$2.first();
			current_$2 = current_$2.rest();
			if (CommonSymbols.NIL == current_$2) {
				vars = ConsesLow.cons(var, vars);
				code = ConsesLow.cons(
						ConsesLow
								.list(format.$sym2$PROGN,
										ConsesLow.list(format.$sym25$CSETF, var,
												ConsesLow.list(format.$sym26$CAR, tail)),
										ConsesLow.list(format.$sym27$CPOP, tail),
										ConsesLow.list(
												format.$sym28$PUNLESS, var, ConsesLow.list(format.$sym25$CSETF, var,
														init)),
										ConsesLow.list(format.$sym28$PUNLESS,
												ConsesLow.list(format.$sym29$FORMAT_TYPEP, var,
														ConsesLow.list(format.$sym30$QUOTE, type)),
												ConsesLow.list(format.$sym31$ERROR,
														format.$str32$The__S_parameter__S_is_not_of_typ, format.$list33,
														var, ConsesLow.list(format.$sym30$QUOTE, type)))),
						code);
			} else
				cdestructuring_bind.cdestructuring_bind_error(datum_$1, format.$list24);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return ConsesLow.listS(format.$sym34$CLET,
				reader.bq_cons(ConsesLow.list(tail, parameters), ConsesLow.append(vars, CommonSymbols.NIL)),
				ConsesLow.append(Sequences.nreverse(code),
						reader.bq_cons(ConsesLow.listS(format.$sym35$PWHEN, tail, format.$list36),
								ConsesLow.append(body, CommonSymbols.NIL))));
	}

	public void declareFunctions() {
		format.declare_format_file();
	}

	public void initializeVariables() {
		format.init_format_file();
	}

	public void runTopLevelForms() {
		format.setup_format_file();
	}
}
