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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

/**
 *
 * @author Tony Brusseau
 */
public interface CommonSymbols {

	// Booleans
	public static SubLT T = SubLT.T;
	public static SubLObject RET_T = CommonSymbols.T;
	public static SubLNil NIL = SubLNil.NIL;
	public static SubLObject RET_NIL = CommonSymbols.NIL;

	// Equality
	public static SubLSymbol EQ = SubLObjectFactory.makeSublispSymbol("EQ");
	public static SubLSymbol EQL = SubLObjectFactory.makeSublispSymbol("EQL");
	public static SubLSymbol EQUAL = SubLObjectFactory.makeSublispSymbol("EQUAL");
	public static SubLSymbol EQUALP = SubLObjectFactory.makeSublispSymbol("EQUALP");

	// Numbers
	public static SubLFixnum MINUS_ONE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(-1);
	public static SubLDoubleFloat ZERO_DOUBLE = SubLObjectFactory.makeDouble(0.0);
	public static SubLFixnum ZERO_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(0);
	public static SubLFixnum ONE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(1);
	public static SubLFixnum TWO_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(2);
	public static SubLFixnum THREE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(3);
	public static SubLFixnum FOUR_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(4);
	public static SubLFixnum FIVE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(5);
	public static SubLFixnum SIX_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(6);
	public static SubLFixnum SEVEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(7);
	public static SubLFixnum EIGHT_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(8);
	public static SubLFixnum NINE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(9);
	public static SubLFixnum TEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(10);
	public static SubLFixnum ELEVEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(11);
	public static SubLFixnum TWELVE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(12);
	public static SubLFixnum THIRTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(13);
	public static SubLFixnum FOURTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(14);
	public static SubLFixnum FIFTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(15);
	public static SubLFixnum SIXTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(16);
	public static SubLFixnum SEVENTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(17);
	public static SubLFixnum EIGHTEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(18);
	public static SubLFixnum NINETEEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(19);
	public static SubLFixnum TWENTY_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(20);
	public static SubLFixnum THIRTY_TWO_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(32);
	public static SubLFixnum THIRTY_THREE_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(33);
	public static SubLFixnum THIRTY_FOUR_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(34);
	public static SubLFixnum SIXTY_FOUR_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(64);
	public static SubLFixnum ONE_HUNDRED_TWENTY_SEVEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(127);
	public static SubLFixnum ONE_HUNDRED_THIRTY_SEVEN_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(137);
	public static SubLFixnum TWO_HUNDRED_FORTY_FOUR_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(244);
	public static SubLFixnum TWO_HUNDRED_FIFTY_FOUR_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(254);
	public static SubLFixnum ONE_THOUSAND_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(1000);

	//// Misc
	public static SubLSymbol BINDING_TYPE = SubLObjectFactory.makeKeyword("BINDING-TYPE");
	public static SubLSymbol LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
	public static SubLSymbol CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
	public static SubLSymbol DYNAMIC = SubLObjectFactory.makeKeyword("DYNAMIC");
	public static SubLSymbol UNDECLARED = SubLObjectFactory.makeKeyword("UNDECLARED");
	public static SubLSymbol INITIALIZATION_TYPE = SubLObjectFactory.makeKeyword("INITIALIZATION-TYPE");
	public static SubLSymbol INITIALIZER = SubLObjectFactory.makeKeyword("INITIALIZER");
	public static SubLSymbol WORLD = SubLObjectFactory.makeKeyword("WORLD");
	public static SubLSymbol UNPROVIDED = SubLObjectFactory.makeSublispSymbol("&UNPROVIDED-SUBLISP-ARGUMENT&");
	public static SubLSymbol OPTIONAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("&OPTIONAL");
	public static SubLSymbol REST_SYMBOL = SubLObjectFactory.makeSublispSymbol("&REST");
	public static SubLSymbol RETURN_TAG = SubLObjectFactory.makeSublispSymbol("%RET");
	public static SubLSymbol ANSWER_TAG = SubLObjectFactory.makeSublispSymbol("%ANSWER");
	public static SubLSymbol SUSPEND_TYPE_CHECKING = SubLObjectFactory.makeSublispSymbol("*SUSPEND-TYPE-CHECKING?*");
	public static SubLSymbol OTHERWISE = SubLObjectFactory.makeSublispSymbol("OTHERWISE");
	public static SubLSymbol CDESTRUCTURING_BIND = SubLObjectFactory.makeSublispSymbol("CDESTRUCTURING-BIND");
	public static SubLSymbol MACRO_FORM = SubLObjectFactory.makeSublispSymbol("%MACRO-FORM");
	public static SubLSymbol MACRO_ENV = SubLObjectFactory.makeSublispSymbol("%ENV");
	public static SubLSymbol SHOW_STACK_TRACES = SubLObjectFactory.makeSublispSymbol("*SHOW-STACK-TRACES?*");
	public static SubLSymbol APPEND_STACK_TRACES_TO_ERROR_MESSAGES = SubLObjectFactory
			.makeSublispSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
	public static SubLSymbol FORCE_ERROR_MESSAGE_OUTPUT = SubLObjectFactory
			.makeSublispSymbol("*FORCE-ERROR-MESSAGE-OUTPUT?*");
	public static SubLSymbol EXTERNAL_KEYWORD = SubLObjectFactory.makeKeyword("EXTERNAL");
	public static SubLSymbol INTERNAL_KEYWORD = SubLObjectFactory.makeKeyword("INTERNAL");
	public static SubLSymbol INHERITED_KEYWORD = SubLObjectFactory.makeKeyword("INHERITED");
	public static SubLSymbol ERROR = SubLObjectFactory.makeSublispSymbol("ERROR");
	public static SubLSymbol NCONC = SubLObjectFactory.makeSublispSymbol("NCONC");
	public static SubLSymbol CAAR = SubLObjectFactory.makeSublispSymbol("CAAR");
	public static SubLSymbol CADR = SubLObjectFactory.makeSublispSymbol("CADR");
	public static SubLSymbol VALUES = SubLObjectFactory.makeSublispSymbol("VALUES");
	public static SubLSymbol TRUE = SubLObjectFactory.makeSublispSymbol("TRUE");
	public static SubLSymbol KILL_KEYWORD = SubLObjectFactory.makeKeyword("KILL");
	public static SubLSymbol LIST = SubLObjectFactory.makeSublispSymbol("LIST");
	public static SubLSymbol LISTS = SubLObjectFactory.makeSublispSymbol("LIST*");

	//// Reader Symbol
	public static SubLSymbol SSS = SubLObjectFactory.makeSublispSymbol("***");

	//// Operator Symbols
	public static SubLSymbol IDENTITY = SubLObjectFactory.makeSublispSymbol("IDENTITY");
	public static SubLSymbol MEMBER = SubLObjectFactory.makeSublispSymbol("MEMBER");
	public static SubLSymbol SYMBOL_FUNCTION = SubLObjectFactory.makeSublispSymbol("SYMBOL-FUNCTION");
	public static SubLSymbol LAMBDA_SYMBOL = SubLObjectFactory.makeSublispSymbol("LAMBDA");
	public static SubLSymbol NUM_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("=");
	public static SubLSymbol NUM_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("/=");
	public static SubLSymbol NUM_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol(">");
	public static SubLSymbol NUM_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("<");
	public static SubLSymbol NUM_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol(">=");
	public static SubLSymbol NUM_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("<=");
	public static SubLSymbol STRING_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING=");
	public static SubLSymbol STRING_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING/=");
	public static SubLSymbol STRING_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING>");
	public static SubLSymbol STRING_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING<");
	public static SubLSymbol STRING_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING>=");
	public static SubLSymbol STRING_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING<=");
	public static SubLSymbol STRING_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-EQUAL");
	public static SubLSymbol STRING_NOT_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-NOT-EQUAL");
	public static SubLSymbol STRING_GREATER_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-GREATERP");
	public static SubLSymbol STRING_LESS_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-LESSP");
	public static SubLSymbol STRING_GREATER_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory
			.makeSublispSymbol("STRING-NOT-LESSP");
	public static SubLSymbol STRING_LESS_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory
			.makeSublispSymbol("STRING-NOT-GREATERP");
	public static SubLSymbol CHAR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-EQUAL");
	public static SubLSymbol CHAR_NOT_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-EQUAL");
	public static SubLSymbol CHAR_GREATER_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-GREATERP");
	public static SubLSymbol CHAR_LESS_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-LESSP");
	public static SubLSymbol CHAR_GREATER_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-LESSP");
	public static SubLSymbol CHAR_LESS_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-GREATERP");
	public static SubLSymbol CHAR_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR=");
	public static SubLSymbol CHAR_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR/=");
	public static SubLSymbol CHAR_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR>");
	public static SubLSymbol CHAR_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR<");
	public static SubLSymbol CHAR_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR>=");
	public static SubLSymbol CHAR_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR<=");
	public static SubLSymbol CAR = SubLObjectFactory.makeSublispSymbol("CAR");
	public static SubLSymbol CDR = SubLObjectFactory.makeSublispSymbol("CDR");
	public static SubLSymbol NTH = SubLObjectFactory.makeSublispSymbol("NTH");
	public static SubLSymbol GETHASH = SubLObjectFactory.makeSublispSymbol("GETHASH");
	public static SubLSymbol GETHASH_WITHOUT_VALUES = SubLObjectFactory.makeSublispSymbol("GETHASH-WITHOUT-VALUES");
	public static SubLSymbol FIRST = SubLObjectFactory.makeSublispSymbol("FIRST");
	public static SubLSymbol SECOND = SubLObjectFactory.makeSublispSymbol("SECOND");
	public static SubLSymbol REVERSE = SubLObjectFactory.makeSublispSymbol("REVERSE");
	public static SubLSymbol NREVERSE = SubLObjectFactory.makeSublispSymbol("NREVERSE");
	public static SubLSymbol EVAL = SubLObjectFactory.makeSublispSymbol("EVAL");
	public static SubLSymbol CONS = SubLObjectFactory.makeSublispSymbol("CONS");
	public static SubLSymbol CHAR = SubLObjectFactory.makeSublispSymbol("CHAR");
	public static SubLSymbol AREF = SubLObjectFactory.makeSublispSymbol("AREF");
	public static SubLSymbol GET = SubLObjectFactory.makeSublispSymbol("GET");
	public static SubLSymbol VECTOR = SubLObjectFactory.makeSublispSymbol("VECTOR");
	public static SubLSymbol SYMBOL_VALUE = SubLObjectFactory.makeSublispSymbol("SYMBOL-VALUE");
	public static SubLSymbol ASSEMBLE_FIXNUMS_TO_INTEGER = SubLObjectFactory
			.makeSublispSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER");
	public static SubLSymbol SORT = SubLObjectFactory.makeSublispSymbol("SORT");

	// Special operators

	public static SubLSymbol DEFINE = SubLObjectFactory.makeSublispSymbol("DEFINE");
	public static SubLSymbol DEFMACRO = SubLObjectFactory.makeSublispSymbol("DEFMACRO");
	public static SubLSymbol DEFCONSTANT = SubLObjectFactory.makeSublispSymbol("DEFCONSTANT");
	public static SubLSymbol DEFPARAMETER = SubLObjectFactory.makeSublispSymbol("DEFPARAMETER");
	public static SubLSymbol DEFVAR = SubLObjectFactory.makeSublispSymbol("DEFVAR");
	public static SubLSymbol DEFLEXICAL = SubLObjectFactory.makeSublispSymbol("DEFLEXICAL");
	public static SubLSymbol PROGN = SubLObjectFactory.makeSublispSymbol("PROGN");
	public static SubLSymbol PIF = SubLObjectFactory.makeSublispSymbol("PIF");
	public static SubLSymbol PWHEN = SubLObjectFactory.makeSublispSymbol("PWHEN");
	public static SubLSymbol PUNLESS = SubLObjectFactory.makeSublispSymbol("PUNLESS");
	public static SubLSymbol PCOND = SubLObjectFactory.makeSublispSymbol("PCOND");
	public static SubLSymbol PCASE = SubLObjectFactory.makeSublispSymbol("PCASE");
	public static SubLSymbol CSETQ = SubLObjectFactory.makeSublispSymbol("CSETQ");
	public static SubLSymbol CSETF = SubLObjectFactory.makeSublispSymbol("CSETF");
	public static SubLSymbol CINC = SubLObjectFactory.makeSublispSymbol("CINC");
	public static SubLSymbol CDEC = SubLObjectFactory.makeSublispSymbol("CDEC");
	public static SubLSymbol CPUSH = SubLObjectFactory.makeSublispSymbol("CPUSH");
	public static SubLSymbol CPUSHNEW = SubLObjectFactory.makeSublispSymbol("CPUSHNEW");
	public static SubLSymbol CPOP = SubLObjectFactory.makeSublispSymbol("CPOP");
	public static SubLSymbol CLET = SubLObjectFactory.makeSublispSymbol("CLET");
	public static SubLSymbol CPROGV = SubLObjectFactory.makeSublispSymbol("CPROGV");
	public static SubLSymbol CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSublispSymbol("CMULTIPLE-VALUE-BIND");
	public static SubLSymbol MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSublispSymbol("MULTIPLE-VALUE-LIST");
	public static SubLSymbol NTH_VALUE = SubLObjectFactory.makeSublispSymbol("NTH-VALUE");
	public static SubLSymbol CDO = SubLObjectFactory.makeSublispSymbol("CDO");
	public static SubLSymbol CDOTIMES = SubLObjectFactory.makeSublispSymbol("CDOTIMES");
	public static SubLSymbol CDOLIST = SubLObjectFactory.makeSublispSymbol("CDOLIST");
	public static SubLSymbol CSOME = SubLObjectFactory.makeSublispSymbol("CSOME");
	public static SubLSymbol CDOHASH = SubLObjectFactory.makeSublispSymbol("CDOHASH");
	public static SubLSymbol CDO_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-SYMBOLS");
	public static SubLSymbol CDO_ALL_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-ALL-SYMBOLS");
	public static SubLSymbol CDO_EXTERNAL_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-EXTERNAL-SYMBOLS");
	public static SubLSymbol CCATCH = SubLObjectFactory.makeSublispSymbol("CCATCH");
	public static SubLSymbol CUNWIND_PROTECT = SubLObjectFactory.makeSublispSymbol("CUNWIND-PROTECT");
	public static SubLSymbol CTIME = SubLObjectFactory.makeSublispSymbol("CTIME");
	public static SubLSymbol RET = SubLObjectFactory.makeSublispSymbol("RET");
	public static SubLSymbol ENFORCE_TYPE = SubLObjectFactory.makeSublispSymbol("ENFORCE-TYPE");
	public static SubLSymbol CHECK_TYPE = SubLObjectFactory.makeSublispSymbol("CHECK-TYPE");
	public static SubLSymbol ENFORCE_MUST = SubLObjectFactory.makeSublispSymbol("ENFORCE-MUST");
	public static SubLSymbol MUST = SubLObjectFactory.makeSublispSymbol("MUST");
	public static SubLSymbol CNOT = SubLObjectFactory.makeSublispSymbol("CNOT");
	public static SubLSymbol CAND = SubLObjectFactory.makeSublispSymbol("CAND");
	public static SubLSymbol COR = SubLObjectFactory.makeSublispSymbol("COR");
	public static SubLSymbol FIF = SubLObjectFactory.makeSublispSymbol("FIF");
	public static SubLSymbol FWHEN = SubLObjectFactory.makeSublispSymbol("FWHEN");
	public static SubLSymbol FUNLESS = SubLObjectFactory.makeSublispSymbol("FUNLESS");
	public static SubLSymbol IGNORE = SubLObjectFactory.makeSublispSymbol("IGNORE");
	public static SubLSymbol CVS_ID = SubLObjectFactory.makeSublispSymbol("CVS-ID");
	public static SubLSymbol DECLARE = SubLObjectFactory.makeSublispSymbol("DECLARE");
	public static SubLSymbol DECLAIM = SubLObjectFactory.makeSublispSymbol("DECLAIM");
	public static SubLSymbol PROCLAIM = SubLObjectFactory.makeSublispSymbol("PROCLAIM");
	public static SubLSymbol QUOTE = SubLObjectFactory.makeSublispSymbol("QUOTE");
	public static SubLSymbol FUNCTION = SubLObjectFactory.makeSublispSymbol("FUNCTION");
	public static SubLSymbol WITH_ERROR_HANDLER = SubLObjectFactory.makeSublispSymbol("WITH-ERROR-HANDLER");
	public static SubLSymbol WITH_STATIC_AREA = SubLObjectFactory.makeSublispSymbol("WITH-STATIC-AREA");
	public static SubLSymbol WITH_THREAD_PRIVATE_AREA = SubLObjectFactory.makeSublispSymbol("WITH-THREAD-PRIVATE-AREA");
	public static SubLSymbol WITH_WORKING_AREA = SubLObjectFactory.makeSublispSymbol("WITH-WORKING-AREA");
	public static SubLSymbol QUIT = SubLObjectFactory.makeSublispSymbol("QUIT");

	// @todo go through and explicitly put all SubL functions/macros/special
	// forms as symbols here -APB

	//// Predicates
	public static SubLSymbol NULL = SubLObjectFactory.makeSublispSymbol("NULL");
	public static SubLSymbol BOOLEANP = SubLObjectFactory.makeCycSymbol("BOOLEANP"); // @hack
																						// Cyc
																						// package
																						// hack
																						// to
																						// be
																						// consistent
																						// with
																						// Allegro/C
	public static SubLSymbol SYMBOLP = SubLObjectFactory.makeSublispSymbol("SYMBOLP");
	public static SubLSymbol ATOM = SubLObjectFactory.makeSublispSymbol("ATOM");
	public static SubLSymbol CONSP = SubLObjectFactory.makeSublispSymbol("CONSP");
	public static SubLSymbol LISTP = SubLObjectFactory.makeSublispSymbol("LISTP");
	public static SubLSymbol SEQUENCEP = SubLObjectFactory.makeSublispSymbol("SEQUENCEP");
	public static SubLSymbol NUMBERP = SubLObjectFactory.makeSublispSymbol("NUMBERP");
	public static SubLSymbol FIXNUMP = SubLObjectFactory.makeSublispSymbol("FIXNUMP");
	public static SubLSymbol BIGNUMP = SubLObjectFactory.makeSublispSymbol("BIGNUMP");
	public static SubLSymbol SHORT_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("SHORT-BIGNUM-P");
	public static SubLSymbol MEDIUM_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("MEDIUM-BIGNUM-P");
	public static SubLSymbol LONG_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("LONG-BIGNUM-P");
	public static SubLSymbol INTEGERP = SubLObjectFactory.makeSublispSymbol("INTEGERP");
	public static SubLSymbol FLOATP = SubLObjectFactory.makeSublispSymbol("FLOATP");
	public static SubLSymbol CHARACTERP = SubLObjectFactory.makeSublispSymbol("CHARACTERP");
	public static SubLSymbol STRINGP = SubLObjectFactory.makeSublispSymbol("STRINGP");
	public static SubLSymbol VECTORP = SubLObjectFactory.makeSublispSymbol("VECTORP");
	public static SubLSymbol FUNCTIONP = SubLObjectFactory.makeSublispSymbol("FUNCTIONP");
	public static SubLSymbol FUNCTION_SPEC_P = SubLObjectFactory.makeSublispSymbol("FUNCTION-SPEC-P");
	public static SubLSymbol PROCESSP = SubLObjectFactory.makeSublispSymbol("PROCESSP");
	public static SubLSymbol LOCK_P = SubLObjectFactory.makeSublispSymbol("LOCK-P");
	public static SubLSymbol RW_LOCK_P = SubLObjectFactory.makeSublispSymbol("RW-LOCK-P");
	public static SubLSymbol HASH_TABLE_P = SubLObjectFactory.makeSublispSymbol("HASH-TABLE-P");
	public static SubLSymbol STRUCTURE_P = SubLObjectFactory.makeSublispSymbol("STRUCTURE-P");
	public static SubLSymbol PACKAGEP = SubLObjectFactory.makeSublispSymbol("PACKAGEP");
	public static SubLSymbol GUID_P = SubLObjectFactory.makeSublispSymbol("GUID-P");
	public static SubLSymbol HASH_TABLE_ITERATOR_P = SubLObjectFactory.makeSublispSymbol("HASH-TABLE-ITERATOR-P");
	public static SubLSymbol PACKAGE_ITERATOR_P = SubLObjectFactory.makeSublispSymbol("PACKAGE-ITERATOR-P");
	public static SubLSymbol STREAMP = SubLObjectFactory.makeSublispSymbol("STREAMP");
	public static SubLSymbol INPUT_STREAM_P = SubLObjectFactory.makeSublispSymbol("INPUT-STREAM-P");
	public static SubLSymbol OUTPUT_STREAM_P = SubLObjectFactory.makeSublispSymbol("OUTPUT-STREAM-P");
	public static SubLSymbol KEYWORDP = SubLObjectFactory.makeSublispSymbol("KEYWORDP");
	public static SubLSymbol NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeCycSymbol("NON-NEGATIVE-NUMBER-P");

	// Stream IO Types
	public static SubLSymbol ELEMENT_TYPE_KEYWORD = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
	public static SubLSymbol TEXT_KEYWORD = SubLObjectFactory.makeKeyword("TEXT");
	public static SubLSymbol BINARY_KEYWORD = SubLObjectFactory.makeKeyword("BINARY");

	// Stream Direction
	public static SubLSymbol DIRECTION_KEYWORD = SubLObjectFactory.makeKeyword("DIRECTION");
	public static SubLSymbol INPUT_KEYWORD = SubLObjectFactory.makeKeyword("INPUT");
	public static SubLSymbol OUTPUT_KEYWORD = SubLObjectFactory.makeKeyword("OUTPUT");
	public static SubLSymbol IO_KEYWORD = SubLObjectFactory.makeKeyword("IO");
	public static SubLSymbol PROBE_KEYWORD = SubLObjectFactory.makeKeyword("PROBE");

	// Stream existentials
	public static SubLSymbol IF_EXISTS_KEYWORD = SubLObjectFactory.makeKeyword("IF-EXISTS");
	public static SubLSymbol IF_DOES_NOT_EXIST_KEYWORD = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
	public static SubLSymbol ERROR_KEYWORD = SubLObjectFactory.makeKeyword("ERROR");
	public static SubLSymbol NEW_VERSION_KEYWORD = SubLObjectFactory.makeKeyword("NEW-VERSION");
	public static SubLSymbol RENAME_AND_DELETE_KEYWORD = SubLObjectFactory.makeKeyword("RENAME-AND-DELETE");
	public static SubLSymbol OVERWRITE_KEYWORD = SubLObjectFactory.makeKeyword("OVERWRITE");
	public static SubLSymbol APPEND_KEYWORD = SubLObjectFactory.makeKeyword("APPEND");
	public static SubLSymbol SUPERSEDE_KEYWORD = SubLObjectFactory.makeKeyword("SUPERSEDE");
	public static SubLSymbol CREATE_KEYWORD = SubLObjectFactory.makeKeyword("CREATE");
	public static SubLSymbol EXTERNAL_FORMAT_KEYWORD = SubLObjectFactory.makeKeyword("EXTERNAL-FORMAT");

	// File Positions
	public static SubLSymbol START_KEYWORD = SubLObjectFactory.makeKeyword("START");
	public static SubLSymbol END_KEYWORD = SubLObjectFactory.makeKeyword("END");

	// IO
	public static SubLSymbol TERMINAL_IO = SubLObjectFactory.makeSublispSymbol("*TERMINAL-IO*");
	public static SubLSymbol STANDARD_INPUT = SubLObjectFactory.makeSublispSymbol("*STANDARD-INPUT*");
	public static SubLSymbol STANDARD_OUTPUT = SubLObjectFactory.makeSublispSymbol("*STANDARD-OUTPUT*");
	public static SubLSymbol ERROR_OUTPUT = SubLObjectFactory.makeSublispSymbol("*ERROR-OUTPUT*");
	public static SubLSymbol DEBUG_IO = SubLObjectFactory.makeSublispSymbol("*DEBUG-IO*");
	public static SubLSymbol NULL_INPUT = SubLObjectFactory.makeSublispSymbol("*NULL-INPUT*");
	public static SubLSymbol NULL_OUTPUT = SubLObjectFactory.makeSublispSymbol("*NULL-OUTPUT*");
	public static SubLSymbol QUERY_IO = SubLObjectFactory.makeSublispSymbol("*QUERY-IO*");
	public static SubLSymbol TRACE_OUTPUT = SubLObjectFactory.makeSublispSymbol("*TRACE-OUTPUT*");

	//// NON SYMBOLS

	public static int PROCESS_TO_END = Integer.MAX_VALUE;
}
