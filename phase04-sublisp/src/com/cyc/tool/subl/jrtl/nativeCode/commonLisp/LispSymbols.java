package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_CL;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_EXT;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_JAVA;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_LISP;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_MOP;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_SYS;

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispSymbols {


  // External symbols in CL package.
  public static SubLSymbol AND_ALLOW_OTHER_KEYS =
    PACKAGE_CL.addExternalSymbol("&ALLOW-OTHER-KEYS");
  public static SubLSymbol AND_AUX =
    PACKAGE_CL.addExternalSymbol("&AUX");
  public static SubLSymbol AND_BODY =
    PACKAGE_CL.addExternalSymbol("&BODY");
  public static SubLSymbol AND_ENVIRONMENT =
    PACKAGE_CL.addExternalSymbol("&ENVIRONMENT");
  public static SubLSymbol AND_KEY =
    PACKAGE_CL.addExternalSymbol("&KEY");
  public static SubLSymbol AND_OPTIONAL =
    PACKAGE_CL.addExternalSymbol("&OPTIONAL");
  public static SubLSymbol AND_REST =
    PACKAGE_CL.addExternalSymbol("&REST");
  public static SubLSymbol AND_WHOLE =
    PACKAGE_CL.addExternalSymbol("&WHOLE");
  public static SubLSymbol STAR =
    PACKAGE_CL.addExternalSymbol("*");
  public static SubLSymbol STAR_STAR =
    PACKAGE_CL.addExternalSymbol("**");
  public static SubLSymbol STAR_STAR_STAR =
    PACKAGE_CL.addExternalSymbol("***");
  public static SubLSymbol BREAK_ON_SIGNALS =
    PACKAGE_CL.addExternalSymbol("*BREAK-ON-SIGNALS*");
  public static SubLSymbol _COMPILE_FILE_PATHNAME_ =
    PACKAGE_CL.addExternalSymbol("*COMPILE-FILE-PATHNAME*");
  public static SubLSymbol COMPILE_FILE_TRUENAME =
    PACKAGE_CL.addExternalSymbol("*COMPILE-FILE-TRUENAME*");
  public static SubLSymbol COMPILE_PRINT =
    PACKAGE_CL.addExternalSymbol("*COMPILE-PRINT*");
  public static SubLSymbol COMPILE_VERBOSE =
    PACKAGE_CL.addExternalSymbol("*COMPILE-VERBOSE*");
  public static SubLSymbol DEBUG_IO =
    PACKAGE_CL.addExternalSymbol("*DEBUG-IO*");
  public static SubLSymbol DEBUGGER_HOOK =
    PACKAGE_CL.addExternalSymbol("*DEBUGGER-HOOK*");
  public static SubLSymbol DEFAULT_PATHNAME_DEFAULTS =
    PACKAGE_CL.addExternalSymbol("*DEFAULT-PATHNAME-DEFAULTS*");
  public static SubLSymbol ERROR_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*ERROR-OUTPUT*");
  public static SubLSymbol FEATURES =
    PACKAGE_CL.addExternalSymbol("*FEATURES*");
  public static SubLSymbol GENSYM_COUNTER =
    PACKAGE_CL.addExternalSymbol("*GENSYM-COUNTER*");
  public static SubLSymbol LOAD_PATHNAME =
    PACKAGE_CL.addExternalSymbol("*LOAD-PATHNAME*");
  public static SubLSymbol LOAD_PRINT =
    PACKAGE_CL.addExternalSymbol("*LOAD-PRINT*");
  public static SubLSymbol LOAD_TRUENAME =
    PACKAGE_CL.addExternalSymbol("*LOAD-TRUENAME*");
  public static SubLSymbol LOAD_VERBOSE =
    PACKAGE_CL.addExternalSymbol("*LOAD-VERBOSE*");
  public static SubLSymbol MACROEXPAND_HOOK =
    PACKAGE_CL.addExternalSymbol("*MACROEXPAND-HOOK*");
  public static SubLSymbol MODULES =
    PACKAGE_CL.addExternalSymbol("*MODULES*");
  public static SubLSymbol _PACKAGE_ =
    PACKAGE_CL.addExternalSymbol("*PACKAGE*");
  public static SubLSymbol PRINT_ARRAY =
    PACKAGE_CL.addExternalSymbol("*PRINT-ARRAY*");
  public static SubLSymbol PRINT_BASE =
    PACKAGE_CL.addExternalSymbol("*PRINT-BASE*");
  public static SubLSymbol PRINT_CASE =
    PACKAGE_CL.addExternalSymbol("*PRINT-CASE*");
  public static SubLSymbol PRINT_CIRCLE =
    PACKAGE_CL.addExternalSymbol("*PRINT-CIRCLE*");
  public static SubLSymbol PRINT_ESCAPE =
    PACKAGE_CL.addExternalSymbol("*PRINT-ESCAPE*");
  public static SubLSymbol PRINT_GENSYM =
    PACKAGE_CL.addExternalSymbol("*PRINT-GENSYM*");
  public static SubLSymbol PRINT_LENGTH =
    PACKAGE_CL.addExternalSymbol("*PRINT-LENGTH*");
  public static SubLSymbol PRINT_LEVEL =
    PACKAGE_CL.addExternalSymbol("*PRINT-LEVEL*");
  public static SubLSymbol PRINT_LINES =
    PACKAGE_CL.addExternalSymbol("*PRINT-LINES*");
  public static SubLSymbol PRINT_MISER_WIDTH =
    PACKAGE_CL.addExternalSymbol("*PRINT-MISER-WIDTH*");
  public static SubLSymbol PRINT_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("*PRINT-PPRINT-DISPATCH*");
  public static SubLSymbol PRINT_PRETTY =
    PACKAGE_CL.addExternalSymbol("*PRINT-PRETTY*");
  public static SubLSymbol PRINT_RADIX =
    PACKAGE_CL.addExternalSymbol("*PRINT-RADIX*");
  public static SubLSymbol PRINT_READABLY =
    PACKAGE_CL.addExternalSymbol("*PRINT-READABLY*");
  public static SubLSymbol PRINT_RIGHT_MARGIN =
    PACKAGE_CL.addExternalSymbol("*PRINT-RIGHT-MARGIN*");
  public static SubLSymbol QUERY_IO =
    PACKAGE_CL.addExternalSymbol("*QUERY-IO*");
  public static SubLSymbol _RANDOM_STATE_ =
    PACKAGE_CL.addExternalSymbol("*RANDOM-STATE*");
  public static SubLSymbol READ_BASE =
    PACKAGE_CL.addExternalSymbol("*READ-BASE*");
  public static SubLSymbol READ_DEFAULT_FLOAT_FORMAT =
    PACKAGE_CL.addExternalSymbol("*READ-DEFAULT-FLOAT-FORMAT*");
  public static SubLSymbol READ_EVAL =
    PACKAGE_CL.addExternalSymbol("*READ-EVAL*");
  public static SubLSymbol READ_SUPPRESS =
    PACKAGE_CL.addExternalSymbol("*READ-SUPPRESS*");
  public static SubLSymbol CURRENT_READTABLE =
    PACKAGE_CL.addExternalSymbol("*READTABLE*");
  public static SubLSymbol STANDARD_INPUT =
    PACKAGE_CL.addExternalSymbol("*STANDARD-INPUT*");
  public static SubLSymbol STANDARD_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*STANDARD-OUTPUT*");
  public static SubLSymbol TERMINAL_IO =
    PACKAGE_CL.addExternalSymbol("*TERMINAL-IO*");
  public static SubLSymbol TRACE_OUTPUT =
    PACKAGE_CL.addExternalSymbol("*TRACE-OUTPUT*");
  public static SubLSymbol PLUS =
    PACKAGE_CL.addExternalSymbol("+");
  public static SubLSymbol PLUS_PLUS =
    PACKAGE_CL.addExternalSymbol("++");
  public static SubLSymbol PLUS_PLUS_PLUS =
    PACKAGE_CL.addExternalSymbol("+++");
  public static SubLSymbol MINUS =
    PACKAGE_CL.addExternalSymbol("-");
  public static SubLSymbol SLASH =
    PACKAGE_CL.addExternalSymbol("/");
  public static SubLSymbol SLASH_SLASH =
    PACKAGE_CL.addExternalSymbol("//");
  public static SubLSymbol SLASH_SLASH_SLASH =
    PACKAGE_CL.addExternalSymbol("///");
  public static SubLSymbol NOT_EQUALS =
    PACKAGE_CL.addExternalSymbol("/=");
  public static SubLSymbol ONE_PLUS =
    PACKAGE_CL.addExternalSymbol("1+");
  public static SubLSymbol ONE_MINUS =
    PACKAGE_CL.addExternalSymbol("1-");
  public static SubLSymbol LT =
    PACKAGE_CL.addExternalSymbol("<");
  public static SubLSymbol LE =
    PACKAGE_CL.addExternalSymbol("<=");
  public static SubLSymbol EQUALS =
    PACKAGE_CL.addExternalSymbol("=");
  public static SubLSymbol GT =
    PACKAGE_CL.addExternalSymbol(">");
  public static SubLSymbol GE =
    PACKAGE_CL.addExternalSymbol(">=");
  public static SubLSymbol ABORT =
    PACKAGE_CL.addExternalSymbol("ABORT");
  public static SubLSymbol ABS =
    PACKAGE_CL.addExternalSymbol("ABS");
  public static SubLSymbol ACONS =
    PACKAGE_CL.addExternalSymbol("ACONS");
  public static SubLSymbol ACOS =
    PACKAGE_CL.addExternalSymbol("ACOS");
  public static SubLSymbol ACOSH =
    PACKAGE_CL.addExternalSymbol("ACOSH");
  public static SubLSymbol ADD_METHOD =
    PACKAGE_CL.addExternalSymbol("ADD-METHOD");
  public static SubLSymbol ADJOIN =
    PACKAGE_CL.addExternalSymbol("ADJOIN");
  public static SubLSymbol ADJUST_ARRAY =
    PACKAGE_CL.addExternalSymbol("ADJUST-ARRAY");
  public static SubLSymbol ADJUSTABLE_ARRAY_P =
    PACKAGE_CL.addExternalSymbol("ADJUSTABLE-ARRAY-P");
  public static SubLSymbol ALLOCATE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("ALLOCATE-INSTANCE");
  public static SubLSymbol ALPHA_CHAR_P =
    PACKAGE_CL.addExternalSymbol("ALPHA-CHAR-P");
  public static SubLSymbol ALPHANUMERICP =
    PACKAGE_CL.addExternalSymbol("ALPHANUMERICP");
  public static SubLSymbol AND =
    PACKAGE_CL.addExternalSymbol("AND");
  public static SubLSymbol APPEND =
    PACKAGE_CL.addExternalSymbol("APPEND");
  public static SubLSymbol APPLY =
    PACKAGE_CL.addExternalSymbol("APPLY");
  public static SubLSymbol APROPOS =
    PACKAGE_CL.addExternalSymbol("APROPOS");
  public static SubLSymbol APROPOS_LIST =
    PACKAGE_CL.addExternalSymbol("APROPOS-LIST");
  public static SubLSymbol AREF =
    PACKAGE_CL.addExternalSymbol("AREF");
  public static SubLSymbol ARITHMETIC_ERROR =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR");
  public static SubLSymbol ARITHMETIC_ERROR_OPERANDS =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR-OPERANDS");
  public static SubLSymbol ARITHMETIC_ERROR_OPERATION =
    PACKAGE_CL.addExternalSymbol("ARITHMETIC-ERROR-OPERATION");
  public static SubLSymbol ARRAY =
    PACKAGE_CL.addExternalSymbol("ARRAY");
  public static SubLSymbol ARRAY_DIMENSION =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION");
  public static SubLSymbol ARRAY_DIMENSION_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSION-LIMIT");
  public static SubLSymbol ARRAY_DIMENSIONS =
    PACKAGE_CL.addExternalSymbol("ARRAY-DIMENSIONS");
  public static SubLSymbol ARRAY_DISPLACEMENT =
    PACKAGE_CL.addExternalSymbol("ARRAY-DISPLACEMENT");
  public static SubLSymbol ARRAY_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("ARRAY-ELEMENT-TYPE");
  public static SubLSymbol ARRAY_HAS_FILL_POINTER_P =
    PACKAGE_CL.addExternalSymbol("ARRAY-HAS-FILL-POINTER-P");
  public static SubLSymbol ARRAY_IN_BOUNDS_P =
    PACKAGE_CL.addExternalSymbol("ARRAY-IN-BOUNDS-P");
  public static SubLSymbol ARRAY_RANK =
    PACKAGE_CL.addExternalSymbol("ARRAY-RANK");
  public static SubLSymbol ARRAY_RANK_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-RANK-LIMIT");
  public static SubLSymbol ARRAY_ROW_MAJOR_INDEX =
    PACKAGE_CL.addExternalSymbol("ARRAY-ROW-MAJOR-INDEX");
  public static SubLSymbol ARRAY_TOTAL_SIZE =
    PACKAGE_CL.addExternalSymbol("ARRAY-TOTAL-SIZE");
  public static SubLSymbol ARRAY_TOTAL_SIZE_LIMIT =
    PACKAGE_CL.addExternalSymbol("ARRAY-TOTAL-SIZE-LIMIT");
  public static SubLSymbol ARRAYP =
    PACKAGE_CL.addExternalSymbol("ARRAYP");
  public static SubLSymbol ASH =
    PACKAGE_CL.addExternalSymbol("ASH");
  public static SubLSymbol ASIN =
    PACKAGE_CL.addExternalSymbol("ASIN");
  public static SubLSymbol ASINH =
    PACKAGE_CL.addExternalSymbol("ASINH");
  public static SubLSymbol ASSERT =
    PACKAGE_CL.addExternalSymbol("ASSERT");
  public static SubLSymbol ASSOC =
    PACKAGE_CL.addExternalSymbol("ASSOC");
  public static SubLSymbol ASSOC_IF =
    PACKAGE_CL.addExternalSymbol("ASSOC-IF");
  public static SubLSymbol ASSOC_IF_NOT =
    PACKAGE_CL.addExternalSymbol("ASSOC-IF-NOT");
  public static SubLSymbol ATAN =
    PACKAGE_CL.addExternalSymbol("ATAN");
  public static SubLSymbol ATANH =
    PACKAGE_CL.addExternalSymbol("ATANH");
  public static SubLSymbol ATOM =
    PACKAGE_CL.addExternalSymbol("ATOM");
  public static SubLSymbol BASE_CHAR =
    PACKAGE_CL.addExternalSymbol("BASE-CHAR");
  public static SubLSymbol BASE_STRING =
    PACKAGE_CL.addExternalSymbol("BASE-STRING");
  public static SubLSymbol BIGNUM =
    PACKAGE_CL.addExternalSymbol("BIGNUM");
  public static SubLSymbol BIT =
    PACKAGE_CL.addExternalSymbol("BIT");
  public static SubLSymbol BIT_AND =
    PACKAGE_CL.addExternalSymbol("BIT-AND");
  public static SubLSymbol BIT_ANDC1 =
    PACKAGE_CL.addExternalSymbol("BIT-ANDC1");
  public static SubLSymbol BIT_ANDC2 =
    PACKAGE_CL.addExternalSymbol("BIT-ANDC2");
  public static SubLSymbol BIT_EQV =
    PACKAGE_CL.addExternalSymbol("BIT-EQV");
  public static SubLSymbol BIT_IOR =
    PACKAGE_CL.addExternalSymbol("BIT-IOR");
  public static SubLSymbol BIT_NAND =
    PACKAGE_CL.addExternalSymbol("BIT-NAND");
  public static SubLSymbol BIT_NOR =
    PACKAGE_CL.addExternalSymbol("BIT-NOR");
  public static SubLSymbol BIT_NOT =
    PACKAGE_CL.addExternalSymbol("BIT-NOT");
  public static SubLSymbol BIT_ORC1 =
    PACKAGE_CL.addExternalSymbol("BIT-ORC1");
  public static SubLSymbol BIT_ORC2 =
    PACKAGE_CL.addExternalSymbol("BIT-ORC2");
  public static SubLSymbol BIT_VECTOR =
    PACKAGE_CL.addExternalSymbol("BIT-VECTOR");
  public static SubLSymbol BIT_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("BIT-VECTOR-P");
  public static SubLSymbol BIT_XOR =
    PACKAGE_CL.addExternalSymbol("BIT-XOR");
  public static SubLSymbol BLOCK =
    PACKAGE_CL.addExternalSymbol("BLOCK");
  public static SubLSymbol BOOLE =
    PACKAGE_CL.addExternalSymbol("BOOLE");
  public static SubLSymbol BOOLE_1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-1");
  public static SubLSymbol BOOLE_2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-2");
  public static SubLSymbol BOOLE_AND =
    PACKAGE_CL.addExternalSymbol("BOOLE-AND");
  public static SubLSymbol BOOLE_ANDC1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ANDC1");
  public static SubLSymbol BOOLE_ANDC2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ANDC2");
  public static SubLSymbol BOOLE_C1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-C1");
  public static SubLSymbol BOOLE_C2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-C2");
  public static SubLSymbol BOOLE_CLR =
    PACKAGE_CL.addExternalSymbol("BOOLE-CLR");
  public static SubLSymbol BOOLE_EQV =
    PACKAGE_CL.addExternalSymbol("BOOLE-EQV");
  public static SubLSymbol BOOLE_IOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-IOR");
  public static SubLSymbol BOOLE_NAND =
    PACKAGE_CL.addExternalSymbol("BOOLE-NAND");
  public static SubLSymbol BOOLE_NOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-NOR");
  public static SubLSymbol BOOLE_ORC1 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ORC1");
  public static SubLSymbol BOOLE_ORC2 =
    PACKAGE_CL.addExternalSymbol("BOOLE-ORC2");
  public static SubLSymbol BOOLE_SET =
    PACKAGE_CL.addExternalSymbol("BOOLE-SET");
  public static SubLSymbol BOOLE_XOR =
    PACKAGE_CL.addExternalSymbol("BOOLE-XOR");
  public static SubLSymbol BOOLEAN =
    PACKAGE_CL.addExternalSymbol("BOOLEAN");
  public static SubLSymbol BOTH_CASE_P =
    PACKAGE_CL.addExternalSymbol("BOTH-CASE-P");
  public static SubLSymbol BOUNDP =
    PACKAGE_CL.addExternalSymbol("BOUNDP");
  public static SubLSymbol BREAK =
    PACKAGE_CL.addExternalSymbol("BREAK");
  public static SubLSymbol BROADCAST_STREAM =
    PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM");
  public static SubLSymbol BROADCAST_STREAM_STREAMS =
    PACKAGE_CL.addExternalSymbol("BROADCAST-STREAM-STREAMS");
  public static SubLSymbol BUILT_IN_CLASS =
    PACKAGE_CL.addExternalSymbol("BUILT-IN-CLASS");
  public static SubLSymbol BUTLAST =
    PACKAGE_CL.addExternalSymbol("BUTLAST");
  public static SubLSymbol BYTE =
    PACKAGE_CL.addExternalSymbol("BYTE");
  public static SubLSymbol BYTE_POSITION =
    PACKAGE_CL.addExternalSymbol("BYTE-POSITION");
  public static SubLSymbol BYTE_SIZE =
    PACKAGE_CL.addExternalSymbol("BYTE-SIZE");
  public static SubLSymbol CAAAAR =
    PACKAGE_CL.addExternalSymbol("CAAAAR");
  public static SubLSymbol CAAADR =
    PACKAGE_CL.addExternalSymbol("CAAADR");
  public static SubLSymbol CAAAR =
    PACKAGE_CL.addExternalSymbol("CAAAR");
  public static SubLSymbol CAADAR =
    PACKAGE_CL.addExternalSymbol("CAADAR");
  public static SubLSymbol CAADDR =
    PACKAGE_CL.addExternalSymbol("CAADDR");
  public static SubLSymbol CAADR =
    PACKAGE_CL.addExternalSymbol("CAADR");
  public static SubLSymbol CAAR =
    PACKAGE_CL.addExternalSymbol("CAAR");
  public static SubLSymbol CADAAR =
    PACKAGE_CL.addExternalSymbol("CADAAR");
  public static SubLSymbol CADADR =
    PACKAGE_CL.addExternalSymbol("CADADR");
  public static SubLSymbol CADAR =
    PACKAGE_CL.addExternalSymbol("CADAR");
  public static SubLSymbol CADDAR =
    PACKAGE_CL.addExternalSymbol("CADDAR");
  public static SubLSymbol CADDDR =
    PACKAGE_CL.addExternalSymbol("CADDDR");
  public static SubLSymbol CADDR =
    PACKAGE_CL.addExternalSymbol("CADDR");
  public static SubLSymbol CADR =
    PACKAGE_CL.addExternalSymbol("CADR");
  public static SubLSymbol CALL_ARGUMENTS_LIMIT =
    PACKAGE_CL.addExternalSymbol("CALL-ARGUMENTS-LIMIT");
  public static SubLSymbol CALL_METHOD =
    PACKAGE_CL.addExternalSymbol("CALL-METHOD");
  public static SubLSymbol CALL_NEXT_METHOD =
    PACKAGE_CL.addExternalSymbol("CALL-NEXT-METHOD");
  public static SubLSymbol CAR =
    PACKAGE_CL.addExternalSymbol("CAR");
  public static SubLSymbol CASE =
    PACKAGE_CL.addExternalSymbol("CASE");
  public static SubLSymbol CATCH =
    PACKAGE_CL.addExternalSymbol("CATCH");
  public static SubLSymbol CCASE =
    PACKAGE_CL.addExternalSymbol("CCASE");
  public static SubLSymbol CDAAAR =
    PACKAGE_CL.addExternalSymbol("CDAAAR");
  public static SubLSymbol CDAADR =
    PACKAGE_CL.addExternalSymbol("CDAADR");
  public static SubLSymbol CDAAR =
    PACKAGE_CL.addExternalSymbol("CDAAR");
  public static SubLSymbol CDADAR =
    PACKAGE_CL.addExternalSymbol("CDADAR");
  public static SubLSymbol CDADDR =
    PACKAGE_CL.addExternalSymbol("CDADDR");
  public static SubLSymbol CDADR =
    PACKAGE_CL.addExternalSymbol("CDADR");
  public static SubLSymbol CDAR =
    PACKAGE_CL.addExternalSymbol("CDAR");
  public static SubLSymbol CDDAAR =
    PACKAGE_CL.addExternalSymbol("CDDAAR");
  public static SubLSymbol CDDADR =
    PACKAGE_CL.addExternalSymbol("CDDADR");
  public static SubLSymbol CDDAR =
    PACKAGE_CL.addExternalSymbol("CDDAR");
  public static SubLSymbol CDDDAR =
    PACKAGE_CL.addExternalSymbol("CDDDAR");
  public static SubLSymbol CDDDDR =
    PACKAGE_CL.addExternalSymbol("CDDDDR");
  public static SubLSymbol CDDDR =
    PACKAGE_CL.addExternalSymbol("CDDDR");
  public static SubLSymbol CDDR =
    PACKAGE_CL.addExternalSymbol("CDDR");
  public static SubLSymbol CDR =
    PACKAGE_CL.addExternalSymbol("CDR");
  public static SubLSymbol CEILING =
    PACKAGE_CL.addExternalSymbol("CEILING");
  public static SubLSymbol CELL_ERROR =
    PACKAGE_CL.addExternalSymbol("CELL-ERROR");
  public static SubLSymbol CELL_ERROR_NAME =
    PACKAGE_CL.addExternalSymbol("CELL-ERROR-NAME");
  public static SubLSymbol CERROR =
    PACKAGE_CL.addExternalSymbol("CERROR");
  public static SubLSymbol CHANGE_CLASS =
    PACKAGE_CL.addExternalSymbol("CHANGE-CLASS");
  public static SubLSymbol CHAR =
    PACKAGE_CL.addExternalSymbol("CHAR");
  public static SubLSymbol CHAR_CODE =
    PACKAGE_CL.addExternalSymbol("CHAR-CODE");
  public static SubLSymbol CHAR_CODE_LIMIT =
    PACKAGE_CL.addExternalSymbol("CHAR-CODE-LIMIT");
  public static SubLSymbol CHAR_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("CHAR-DOWNCASE");
  public static SubLSymbol CHAR_EQUAL =
    PACKAGE_CL.addExternalSymbol("CHAR-EQUAL");
  public static SubLSymbol CHAR_GREATERP =
    PACKAGE_CL.addExternalSymbol("CHAR-GREATERP");
  public static SubLSymbol CHAR_INT =
    PACKAGE_CL.addExternalSymbol("CHAR-INT");
  public static SubLSymbol CHAR_LESSP =
    PACKAGE_CL.addExternalSymbol("CHAR-LESSP");
  public static SubLSymbol CHAR_NAME =
    PACKAGE_CL.addExternalSymbol("CHAR-NAME");
  public static SubLSymbol CHAR_NOT_EQUAL =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-EQUAL");
  public static SubLSymbol CHAR_NOT_GREATERP =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-GREATERP");
  public static SubLSymbol CHAR_NOT_LESSP =
    PACKAGE_CL.addExternalSymbol("CHAR-NOT-LESSP");
  public static SubLSymbol CHAR_UPCASE =
    PACKAGE_CL.addExternalSymbol("CHAR-UPCASE");
  public static SubLSymbol CHAR_NE =
    PACKAGE_CL.addExternalSymbol("CHAR/=");
  public static SubLSymbol CHAR_LT =
    PACKAGE_CL.addExternalSymbol("CHAR<");
  public static SubLSymbol CHAR_LE =
    PACKAGE_CL.addExternalSymbol("CHAR<=");
  public static SubLSymbol CHAR_EQUALS =
    PACKAGE_CL.addExternalSymbol("CHAR=");
  public static SubLSymbol CHAR_GT =
    PACKAGE_CL.addExternalSymbol("CHAR>");
  public static SubLSymbol CHAR_GE =
    PACKAGE_CL.addExternalSymbol("CHAR>=");
  public static SubLSymbol CHARACTER =
    PACKAGE_CL.addExternalSymbol("CHARACTER");
  public static SubLSymbol CHARACTERP =
    PACKAGE_CL.addExternalSymbol("CHARACTERP");
  public static SubLSymbol CHECK_TYPE =
    PACKAGE_CL.addExternalSymbol("CHECK-TYPE");
  public static SubLSymbol CIS =
    PACKAGE_CL.addExternalSymbol("CIS");
  public static SubLSymbol CLASS =
    PACKAGE_CL.addExternalSymbol("CLASS");
  public static SubLSymbol CLASS_NAME =
    PACKAGE_CL.addExternalSymbol("CLASS-NAME");
  public static SubLSymbol CLASS_OF =
    PACKAGE_CL.addExternalSymbol("CLASS-OF");
  public static SubLSymbol CLEAR_INPUT =
    PACKAGE_CL.addExternalSymbol("CLEAR-INPUT");
  public static SubLSymbol CLEAR_OUTPUT =
    PACKAGE_CL.addExternalSymbol("CLEAR-OUTPUT");
  public static SubLSymbol CLOSE =
    PACKAGE_CL.addExternalSymbol("CLOSE");
  public static SubLSymbol CLRHASH =
    PACKAGE_CL.addExternalSymbol("CLRHASH");
  public static SubLSymbol CODE_CHAR =
    PACKAGE_CL.addExternalSymbol("CODE-CHAR");
  public static SubLSymbol COERCE =
    PACKAGE_CL.addExternalSymbol("COERCE");
  public static SubLSymbol COMPILATION_SPEED =
    PACKAGE_CL.addExternalSymbol("COMPILATION-SPEED");
  public static SubLSymbol COMPILE =
    PACKAGE_CL.addExternalSymbol("COMPILE");
  public static SubLSymbol COMPILE_FILE =
    PACKAGE_CL.addExternalSymbol("COMPILE-FILE");
  public static SubLSymbol COMPILE_FILE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("COMPILE-FILE-PATHNAME");
  public static SubLSymbol COMPILED_FUNCTION =
    PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION");
  public static SubLSymbol COMPILED_FUNCTION_P =
    PACKAGE_CL.addExternalSymbol("COMPILED-FUNCTION-P");
  public static SubLSymbol COMPILER_MACRO =
    PACKAGE_CL.addExternalSymbol("COMPILER-MACRO");
  public static SubLSymbol COMPILER_MACRO_FUNCTION =
    PACKAGE_CL.addExternalSymbol("COMPILER-MACRO-FUNCTION");
  public static SubLSymbol COMPLEMENT =
    PACKAGE_CL.addExternalSymbol("COMPLEMENT");
  public static SubLSymbol COMPLEX =
    PACKAGE_CL.addExternalSymbol("COMPLEX");
  public static SubLSymbol COMPLEXP =
    PACKAGE_CL.addExternalSymbol("COMPLEXP");
  public static SubLSymbol COMPUTE_APPLICABLE_METHODS =
    PACKAGE_CL.addExternalSymbol("COMPUTE-APPLICABLE-METHODS");
  public static SubLSymbol COMPUTE_RESTARTS =
    PACKAGE_CL.addExternalSymbol("COMPUTE-RESTARTS");
  public static SubLSymbol CONCATENATE =
    PACKAGE_CL.addExternalSymbol("CONCATENATE");
  public static SubLSymbol CONCATENATED_STREAM =
    PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM");
  public static SubLSymbol CONCATENATED_STREAM_STREAMS =
    PACKAGE_CL.addExternalSymbol("CONCATENATED-STREAM-STREAMS");
  public static SubLSymbol COND =
    PACKAGE_CL.addExternalSymbol("COND");
  public static SubLSymbol CONDITION =
    PACKAGE_CL.addExternalSymbol("CONDITION");
  public static SubLSymbol CONJUGATE =
    PACKAGE_CL.addExternalSymbol("CONJUGATE");
  public static SubLSymbol CONS =
    PACKAGE_CL.addExternalSymbol("CONS");
  public static SubLSymbol CONSP =
    PACKAGE_CL.addExternalSymbol("CONSP");
  public static SubLSymbol CONSTANTLY =
    PACKAGE_CL.addExternalSymbol("CONSTANTLY");
  public static SubLSymbol CONSTANTP =
    PACKAGE_CL.addExternalSymbol("CONSTANTP");
  public static SubLSymbol CONTINUE =
    PACKAGE_CL.addExternalSymbol("CONTINUE");
  public static SubLSymbol CONTROL_ERROR =
    PACKAGE_CL.addExternalSymbol("CONTROL-ERROR");
  public static SubLSymbol COPY_ALIST =
    PACKAGE_CL.addExternalSymbol("COPY-ALIST");
  public static SubLSymbol COPY_LIST =
    PACKAGE_CL.addExternalSymbol("COPY-LIST");
  public static SubLSymbol COPY_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("COPY-PPRINT-DISPATCH");
  public static SubLSymbol COPY_READTABLE =
    PACKAGE_CL.addExternalSymbol("COPY-READTABLE");
  public static SubLSymbol COPY_SEQ =
    PACKAGE_CL.addExternalSymbol("COPY-SEQ");
  public static SubLSymbol COPY_STRUCTURE =
    PACKAGE_CL.addExternalSymbol("COPY-STRUCTURE");
  public static SubLSymbol COPY_SYMBOL =
    PACKAGE_CL.addExternalSymbol("COPY-SYMBOL");
  public static SubLSymbol COPY_TREE =
    PACKAGE_CL.addExternalSymbol("COPY-TREE");
  public static SubLSymbol COS =
    PACKAGE_CL.addExternalSymbol("COS");
  public static SubLSymbol COSH =
    PACKAGE_CL.addExternalSymbol("COSH");
  public static SubLSymbol COUNT =
    PACKAGE_CL.addExternalSymbol("COUNT");
  public static SubLSymbol COUNT_IF =
    PACKAGE_CL.addExternalSymbol("COUNT-IF");
  public static SubLSymbol COUNT_IF_NOT =
    PACKAGE_CL.addExternalSymbol("COUNT-IF-NOT");
  public static SubLSymbol CTYPECASE =
    PACKAGE_CL.addExternalSymbol("CTYPECASE");
  public static SubLSymbol DEBUG =
    PACKAGE_CL.addExternalSymbol("DEBUG");
  public static SubLSymbol DECF =
    PACKAGE_CL.addExternalSymbol("DECF");
  public static SubLSymbol DECLAIM =
    PACKAGE_CL.addExternalSymbol("DECLAIM");
  public static SubLSymbol DECLARATION =
    PACKAGE_CL.addExternalSymbol("DECLARATION");
  public static SubLSymbol DECLARE =
    PACKAGE_CL.addExternalSymbol("DECLARE");
  public static SubLSymbol DECODE_FLOAT =
    PACKAGE_CL.addExternalSymbol("DECODE-FLOAT");
  public static SubLSymbol DECODE_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("DECODE-UNIVERSAL-TIME");
  public static SubLSymbol DEFCLASS =
    PACKAGE_CL.addExternalSymbol("DEFCLASS");
  public static SubLSymbol DEFCONSTANT =
    PACKAGE_CL.addExternalSymbol("DEFCONSTANT");
  public static SubLSymbol DEFGENERIC =
    PACKAGE_CL.addExternalSymbol("DEFGENERIC");
  public static SubLSymbol DEFINE_COMPILER_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-COMPILER-MACRO");
  public static SubLSymbol DEFINE_CONDITION =
    PACKAGE_CL.addExternalSymbol("DEFINE-CONDITION");
  public static SubLSymbol DEFINE_METHOD_COMBINATION =
    PACKAGE_CL.addExternalSymbol("DEFINE-METHOD-COMBINATION");
  public static SubLSymbol DEFINE_MODIFY_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-MODIFY-MACRO");
  public static SubLSymbol DEFINE_SETF_EXPANDER =
    PACKAGE_CL.addExternalSymbol("DEFINE-SETF-EXPANDER");
  public static SubLSymbol DEFINE_SYMBOL_MACRO =
    PACKAGE_CL.addExternalSymbol("DEFINE-SYMBOL-MACRO");
  public static SubLSymbol DEFMACRO =
    PACKAGE_CL.addExternalSymbol("DEFMACRO");
  public static SubLSymbol DEFMETHOD =
    PACKAGE_CL.addExternalSymbol("DEFMETHOD");
  public static SubLSymbol DEFPACKAGE =
    PACKAGE_CL.addExternalSymbol("DEFPACKAGE");
  public static SubLSymbol DEFPARAMETER =
    PACKAGE_CL.addExternalSymbol("DEFPARAMETER");
  public static SubLSymbol DEFSETF =
    PACKAGE_CL.addExternalSymbol("DEFSETF");
  public static SubLSymbol DEFSTRUCT =
    PACKAGE_CL.addExternalSymbol("DEFSTRUCT");
  public static SubLSymbol DEFTYPE =
    PACKAGE_CL.addExternalSymbol("DEFTYPE");
  public static SubLSymbol DEFUN =
    PACKAGE_CL.addExternalSymbol("DEFUN");
  public static SubLSymbol DEFVAR =
    PACKAGE_CL.addExternalSymbol("DEFVAR");
  public static SubLSymbol DELETE =
    PACKAGE_CL.addExternalSymbol("DELETE");
  public static SubLSymbol DELETE_DUPLICATES =
    PACKAGE_CL.addExternalSymbol("DELETE-DUPLICATES");
  public static SubLSymbol DELETE_FILE =
    PACKAGE_CL.addExternalSymbol("DELETE-FILE");
  public static SubLSymbol DELETE_IF =
    PACKAGE_CL.addExternalSymbol("DELETE-IF");
  public static SubLSymbol DELETE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("DELETE-IF-NOT");
  public static SubLSymbol DELETE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("DELETE-PACKAGE");
  public static SubLSymbol DENOMINATOR =
    PACKAGE_CL.addExternalSymbol("DENOMINATOR");
  public static SubLSymbol DEPOSIT_FIELD =
    PACKAGE_CL.addExternalSymbol("DEPOSIT-FIELD");
  public static SubLSymbol DESCRIBE =
    PACKAGE_CL.addExternalSymbol("DESCRIBE");
  public static SubLSymbol DESCRIBE_OBJECT =
    PACKAGE_CL.addExternalSymbol("DESCRIBE-OBJECT");
  public static SubLSymbol DESTRUCTURING_BIND =
    PACKAGE_CL.addExternalSymbol("DESTRUCTURING-BIND");
  public static SubLSymbol DIGIT_CHAR =
    PACKAGE_CL.addExternalSymbol("DIGIT-CHAR");
  public static SubLSymbol DIGIT_CHAR_P =
    PACKAGE_CL.addExternalSymbol("DIGIT-CHAR-P");
  public static SubLSymbol DIRECTORY =
    PACKAGE_CL.addExternalSymbol("DIRECTORY");
  public static SubLSymbol DIRECTORY_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("DIRECTORY-NAMESTRING");
  public static SubLSymbol DISASSEMBLE =
    PACKAGE_CL.addExternalSymbol("DISASSEMBLE");
  public static SubLSymbol DIVISION_BY_ZERO =
    PACKAGE_CL.addExternalSymbol("DIVISION-BY-ZERO");
  public static SubLSymbol DO =
    PACKAGE_CL.addExternalSymbol("DO");
  public static SubLSymbol DO_STAR =
    PACKAGE_CL.addExternalSymbol("DO*");
  public static SubLSymbol DO_ALL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-ALL-SYMBOLS");
  public static SubLSymbol DO_EXTERNAL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-EXTERNAL-SYMBOLS");
  public static SubLSymbol DO_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("DO-SYMBOLS");
  public static SubLSymbol DOCUMENTATION =
    PACKAGE_CL.addExternalSymbol("DOCUMENTATION");
  public static SubLSymbol DOLIST =
    PACKAGE_CL.addExternalSymbol("DOLIST");
  public static SubLSymbol DOTIMES =
    PACKAGE_CL.addExternalSymbol("DOTIMES");
  public static SubLSymbol DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT");
  public static SubLSymbol DOUBLE_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT-EPSILON");
  public static SubLSymbol DOUBLE_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-EPSILON");
  public static SubLSymbol DPB =
    PACKAGE_CL.addExternalSymbol("DPB");
  public static SubLSymbol DRIBBLE =
    PACKAGE_CL.addExternalSymbol("DRIBBLE");
  public static SubLSymbol DYNAMIC_EXTENT =
    PACKAGE_CL.addExternalSymbol("DYNAMIC-EXTENT");
  public static SubLSymbol ECASE =
    PACKAGE_CL.addExternalSymbol("ECASE");
  public static SubLSymbol ECHO_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM");
  public static SubLSymbol ECHO_STREAM_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM-INPUT-STREAM");
  public static SubLSymbol ECHO_STREAM_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("ECHO-STREAM-OUTPUT-STREAM");
  public static SubLSymbol ED =
    PACKAGE_CL.addExternalSymbol("ED");
  public static SubLSymbol EIGHTH =
    PACKAGE_CL.addExternalSymbol("EIGHTH");
  public static SubLSymbol ELT =
    PACKAGE_CL.addExternalSymbol("ELT");
  public static SubLSymbol ENCODE_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("ENCODE-UNIVERSAL-TIME");
  public static SubLSymbol END_OF_FILE =
    PACKAGE_CL.addExternalSymbol("END-OF-FILE");
  public static SubLSymbol ENDP =
    PACKAGE_CL.addExternalSymbol("ENDP");
  public static SubLSymbol ENOUGH_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("ENOUGH-NAMESTRING");
  public static SubLSymbol ENSURE_DIRECTORIES_EXIST =
    PACKAGE_CL.addExternalSymbol("ENSURE-DIRECTORIES-EXIST");
  public static SubLSymbol ENSURE_GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("ENSURE-GENERIC-FUNCTION");
  public static SubLSymbol EQ =
    PACKAGE_CL.addExternalSymbol("EQ");
  public static SubLSymbol EQL =
    PACKAGE_CL.addExternalSymbol("EQL");
  public static SubLSymbol EQUAL =
    PACKAGE_CL.addExternalSymbol("EQUAL");
  public static SubLSymbol EQUALP =
    PACKAGE_CL.addExternalSymbol("EQUALP");
  public static SubLSymbol ERROR =
    PACKAGE_CL.addExternalSymbol("ERROR");
  public static SubLSymbol ETYPECASE =
    PACKAGE_CL.addExternalSymbol("ETYPECASE");
  public static SubLSymbol EVAL =
    PACKAGE_CL.addExternalSymbol("EVAL");
  public static SubLSymbol EVAL_WHEN =
    PACKAGE_CL.addExternalSymbol("EVAL-WHEN");
  public static SubLSymbol EVENP =
    PACKAGE_CL.addExternalSymbol("EVENP");
  public static SubLSymbol EVERY =
    PACKAGE_CL.addExternalSymbol("EVERY");
  public static SubLSymbol EXP =
    PACKAGE_CL.addExternalSymbol("EXP");
  public static SubLSymbol EXPORT =
    PACKAGE_CL.addExternalSymbol("EXPORT");
  public static SubLSymbol EXPT =
    PACKAGE_CL.addExternalSymbol("EXPT");
  public static SubLSymbol EXTENDED_CHAR =
    PACKAGE_CL.addExternalSymbol("EXTENDED-CHAR");
  public static SubLSymbol FBOUNDP =
    PACKAGE_CL.addExternalSymbol("FBOUNDP");
  public static SubLSymbol FCEILING =
    PACKAGE_CL.addExternalSymbol("FCEILING");
  public static SubLSymbol FDEFINITION =
    PACKAGE_CL.addExternalSymbol("FDEFINITION");
  public static SubLSymbol FFLOOR =
    PACKAGE_CL.addExternalSymbol("FFLOOR");
  public static SubLSymbol FIFTH =
    PACKAGE_CL.addExternalSymbol("FIFTH");
  public static SubLSymbol FILE_AUTHOR =
    PACKAGE_CL.addExternalSymbol("FILE-AUTHOR");
  public static SubLSymbol FILE_ERROR =
    PACKAGE_CL.addExternalSymbol("FILE-ERROR");
  public static SubLSymbol FILE_ERROR_PATHNAME =
    PACKAGE_CL.addExternalSymbol("FILE-ERROR-PATHNAME");
  public static SubLSymbol FILE_LENGTH =
    PACKAGE_CL.addExternalSymbol("FILE-LENGTH");
  public static SubLSymbol FILE_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("FILE-NAMESTRING");
  public static SubLSymbol FILE_POSITION =
    PACKAGE_CL.addExternalSymbol("FILE-POSITION");
  public static SubLSymbol FILE_STREAM =
    PACKAGE_CL.addExternalSymbol("FILE-STREAM");
  public static SubLSymbol FILE_STRING_LENGTH =
    PACKAGE_CL.addExternalSymbol("FILE-STRING-LENGTH");
  public static SubLSymbol FILE_WRITE_DATE =
    PACKAGE_CL.addExternalSymbol("FILE-WRITE-DATE");
  public static SubLSymbol FILL =
    PACKAGE_CL.addExternalSymbol("FILL");
  public static SubLSymbol FILL_POINTER =
    PACKAGE_CL.addExternalSymbol("FILL-POINTER");
  public static SubLSymbol FIND =
    PACKAGE_CL.addExternalSymbol("FIND");
  public static SubLSymbol FIND_ALL_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("FIND-ALL-SYMBOLS");
  public static SubLSymbol FIND_CLASS =
    PACKAGE_CL.addExternalSymbol("FIND-CLASS");
  public static SubLSymbol FIND_IF =
    PACKAGE_CL.addExternalSymbol("FIND-IF");
  public static SubLSymbol FIND_IF_NOT =
    PACKAGE_CL.addExternalSymbol("FIND-IF-NOT");
  public static SubLSymbol FIND_METHOD =
    PACKAGE_CL.addExternalSymbol("FIND-METHOD");
  public static SubLSymbol FIND_PACKAGE =
    PACKAGE_CL.addExternalSymbol("FIND-PACKAGE");
  public static SubLSymbol FIND_RESTART =
    PACKAGE_CL.addExternalSymbol("FIND-RESTART");
  public static SubLSymbol FIND_SYMBOL =
    PACKAGE_CL.addExternalSymbol("FIND-SYMBOL");
  public static SubLSymbol FINISH_OUTPUT =
    PACKAGE_CL.addExternalSymbol("FINISH-OUTPUT");
  public static SubLSymbol FIRST =
    PACKAGE_CL.addExternalSymbol("FIRST");
  public static SubLSymbol FIXNUM =
    PACKAGE_CL.addExternalSymbol("FIXNUM");
  public static SubLSymbol FLET =
    PACKAGE_CL.addExternalSymbol("FLET");
  public static SubLSymbol FLOAT =
    PACKAGE_CL.addExternalSymbol("FLOAT");
  public static SubLSymbol FLOAT_DIGITS =
    PACKAGE_CL.addExternalSymbol("FLOAT-DIGITS");
  public static SubLSymbol FLOAT_PRECISION =
    PACKAGE_CL.addExternalSymbol("FLOAT-PRECISION");
  public static SubLSymbol FLOAT_RADIX =
    PACKAGE_CL.addExternalSymbol("FLOAT-RADIX");
  public static SubLSymbol FLOAT_SIGN =
    PACKAGE_CL.addExternalSymbol("FLOAT-SIGN");
  public static SubLSymbol FLOATING_POINT_INEXACT =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INEXACT");
  public static SubLSymbol FLOATING_POINT_INVALID_OPERATION =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-INVALID-OPERATION");
  public static SubLSymbol FLOATING_POINT_OVERFLOW =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-OVERFLOW");
  public static SubLSymbol FLOATING_POINT_UNDERFLOW =
    PACKAGE_CL.addExternalSymbol("FLOATING-POINT-UNDERFLOW");
  public static SubLSymbol FLOATP =
    PACKAGE_CL.addExternalSymbol("FLOATP");
  public static SubLSymbol FLOOR =
    PACKAGE_CL.addExternalSymbol("FLOOR");
  public static SubLSymbol FMAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("FMAKUNBOUND");
  public static SubLSymbol FORCE_OUTPUT =
    PACKAGE_CL.addExternalSymbol("FORCE-OUTPUT");
  public static SubLSymbol FORMAT =
    PACKAGE_CL.addExternalSymbol("FORMAT");
  public static SubLSymbol FORMATTER =
    PACKAGE_CL.addExternalSymbol("FORMATTER");
  public static SubLSymbol FOURTH =
    PACKAGE_CL.addExternalSymbol("FOURTH");
  public static SubLSymbol FRESH_LINE =
    PACKAGE_CL.addExternalSymbol("FRESH-LINE");
  public static SubLSymbol FROUND =
    PACKAGE_CL.addExternalSymbol("FROUND");
  public static SubLSymbol FTRUNCATE =
    PACKAGE_CL.addExternalSymbol("FTRUNCATE");
  public static SubLSymbol FTYPE =
    PACKAGE_CL.addExternalSymbol("FTYPE");
  public static SubLSymbol FUNCALL =
    PACKAGE_CL.addExternalSymbol("FUNCALL");
  public static SubLSymbol FUNCTION =
    PACKAGE_CL.addExternalSymbol("FUNCTION");
  public static SubLSymbol FUNCTION_KEYWORDS =
    PACKAGE_CL.addExternalSymbol("FUNCTION-KEYWORDS");
  public static SubLSymbol FUNCTION_LAMBDA_EXPRESSION =
    PACKAGE_CL.addExternalSymbol("FUNCTION-LAMBDA-EXPRESSION");
  public static SubLSymbol FUNCTIONP =
    PACKAGE_CL.addExternalSymbol("FUNCTIONP");
  public static SubLSymbol GCD =
    PACKAGE_CL.addExternalSymbol("GCD");
  public static SubLSymbol GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("GENERIC-FUNCTION");
  public static SubLSymbol GENSYM =
    PACKAGE_CL.addExternalSymbol("GENSYM");
  public static SubLSymbol GENTEMP =
    PACKAGE_CL.addExternalSymbol("GENTEMP");
  public static SubLSymbol GET =
    PACKAGE_CL.addExternalSymbol("GET");
  public static SubLSymbol GET_DECODED_TIME =
    PACKAGE_CL.addExternalSymbol("GET-DECODED-TIME");
  public static SubLSymbol GET_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("GET-DISPATCH-MACRO-CHARACTER");
  public static SubLSymbol GET_INTERNAL_REAL_TIME =
    PACKAGE_CL.addExternalSymbol("GET-INTERNAL-REAL-TIME");
  public static SubLSymbol GET_INTERNAL_RUN_TIME =
    PACKAGE_CL.addExternalSymbol("GET-INTERNAL-RUN-TIME");
  public static SubLSymbol GET_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("GET-MACRO-CHARACTER");
  public static SubLSymbol GET_OUTPUT_STREAM_STRING =
    PACKAGE_CL.addExternalSymbol("GET-OUTPUT-STREAM-STRING");
  public static SubLSymbol GET_PROPERTIES =
    PACKAGE_CL.addExternalSymbol("GET-PROPERTIES");
  public static SubLSymbol GET_SETF_EXPANSION =
    PACKAGE_CL.addExternalSymbol("GET-SETF-EXPANSION");
  public static SubLSymbol GET_UNIVERSAL_TIME =
    PACKAGE_CL.addExternalSymbol("GET-UNIVERSAL-TIME");
  public static SubLSymbol GETF =
    PACKAGE_CL.addExternalSymbol("GETF");
  public static SubLSymbol GETHASH =
    PACKAGE_CL.addExternalSymbol("GETHASH");
  public static SubLSymbol GO =
    PACKAGE_CL.addExternalSymbol("GO");
  public static SubLSymbol GRAPHIC_CHAR_P =
    PACKAGE_CL.addExternalSymbol("GRAPHIC-CHAR-P");
  public static SubLSymbol HANDLER_BIND =
    PACKAGE_CL.addExternalSymbol("HANDLER-BIND");
  public static SubLSymbol HANDLER_CASE =
    PACKAGE_CL.addExternalSymbol("HANDLER-CASE");
  public static SubLSymbol HASH_TABLE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE");
  public static SubLSymbol HASH_TABLE_COUNT =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-COUNT");
  public static SubLSymbol HASH_TABLE_P =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-P");
  public static SubLSymbol HASH_TABLE_REHASH_SIZE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-REHASH-SIZE");
  public static SubLSymbol HASH_TABLE_REHASH_THRESHOLD =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-REHASH-THRESHOLD");
  public static SubLSymbol HASH_TABLE_SIZE =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-SIZE");
  public static SubLSymbol HASH_TABLE_TEST =
    PACKAGE_CL.addExternalSymbol("HASH-TABLE-TEST");
  public static SubLSymbol HOST_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("HOST-NAMESTRING");
  public static SubLSymbol IDENTITY =
    PACKAGE_CL.addExternalSymbol("IDENTITY");
  public static SubLSymbol IF =
    PACKAGE_CL.addExternalSymbol("IF");
  public static SubLSymbol IGNORABLE =
    PACKAGE_CL.addExternalSymbol("IGNORABLE");
  public static SubLSymbol IGNORE =
    PACKAGE_CL.addExternalSymbol("IGNORE");
  public static SubLSymbol IGNORE_ERRORS =
    PACKAGE_CL.addExternalSymbol("IGNORE-ERRORS");
  public static SubLSymbol IMAGPART =
    PACKAGE_CL.addExternalSymbol("IMAGPART");
  public static SubLSymbol IMPORT =
    PACKAGE_CL.addExternalSymbol("IMPORT");
  public static SubLSymbol IN_PACKAGE =
    PACKAGE_CL.addExternalSymbol("IN-PACKAGE");
  public static SubLSymbol INCF =
    PACKAGE_CL.addExternalSymbol("INCF");
  public static SubLSymbol INITIALIZE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("INITIALIZE-INSTANCE");
  public static SubLSymbol INLINE =
    PACKAGE_CL.addExternalSymbol("INLINE");
  public static SubLSymbol INPUT_STREAM_P =
    PACKAGE_CL.addExternalSymbol("INPUT-STREAM-P");
  public static SubLSymbol INSPECT =
    PACKAGE_CL.addExternalSymbol("INSPECT");
  public static SubLSymbol INTEGER =
    PACKAGE_CL.addExternalSymbol("INTEGER");
  public static SubLSymbol INTEGER_DECODE_FLOAT =
    PACKAGE_CL.addExternalSymbol("INTEGER-DECODE-FLOAT");
  public static SubLSymbol INTEGER_LENGTH =
    PACKAGE_CL.addExternalSymbol("INTEGER-LENGTH");
  public static SubLSymbol INTEGERP =
    PACKAGE_CL.addExternalSymbol("INTEGERP");
  public static SubLSymbol INTERACTIVE_STREAM_P =
    PACKAGE_CL.addExternalSymbol("INTERACTIVE-STREAM-P");
  public static SubLSymbol INTERN =
    PACKAGE_CL.addExternalSymbol("INTERN");
  public static SubLSymbol INTERNAL_TIME_UNITS_PER_SECOND =
    PACKAGE_CL.addExternalSymbol("INTERNAL-TIME-UNITS-PER-SECOND");
  public static SubLSymbol INTERSECTION =
    PACKAGE_CL.addExternalSymbol("INTERSECTION");
  public static SubLSymbol INVALID_METHOD_ERROR =
    PACKAGE_CL.addExternalSymbol("INVALID-METHOD-ERROR");
  public static SubLSymbol INVOKE_DEBUGGER =
    PACKAGE_CL.addExternalSymbol("INVOKE-DEBUGGER");
  public static SubLSymbol INVOKE_RESTART =
    PACKAGE_CL.addExternalSymbol("INVOKE-RESTART");
  public static SubLSymbol INVOKE_RESTART_INTERACTIVELY =
    PACKAGE_CL.addExternalSymbol("INVOKE-RESTART-INTERACTIVELY");
  public static SubLSymbol ISQRT =
    PACKAGE_CL.addExternalSymbol("ISQRT");
  public static SubLSymbol KEYWORD =
    PACKAGE_CL.addExternalSymbol("KEYWORD");
  public static SubLSymbol KEYWORDP =
    PACKAGE_CL.addExternalSymbol("KEYWORDP");
  public static SubLSymbol LABELS =
    PACKAGE_CL.addExternalSymbol("LABELS");
  public static SubLSymbol LAMBDA =
    PACKAGE_CL.addExternalSymbol("LAMBDA");
  public static SubLSymbol LAMBDA_LIST_KEYWORDS =
    PACKAGE_CL.addExternalSymbol("LAMBDA-LIST-KEYWORDS");
  public static SubLSymbol LAMBDA_PARAMETERS_LIMIT =
    PACKAGE_CL.addExternalSymbol("LAMBDA-PARAMETERS-LIMIT");
  public static SubLSymbol LAST =
    PACKAGE_CL.addExternalSymbol("LAST");
  public static SubLSymbol LCM =
    PACKAGE_CL.addExternalSymbol("LCM");
  public static SubLSymbol LDB =
    PACKAGE_CL.addExternalSymbol("LDB");
  public static SubLSymbol LDB_TEST =
    PACKAGE_CL.addExternalSymbol("LDB-TEST");
  public static SubLSymbol LDIFF =
    PACKAGE_CL.addExternalSymbol("LDIFF");
  public static SubLSymbol LEAST_NEGATIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-DOUBLE-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-LONG-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_NORMALIZED_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-DOUBLE-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_NORMALIZED_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-LONG-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_NORMALIZED_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-SHORT-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_NORMALIZED_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-NORMALIZED-SINGLE-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-SHORT-FLOAT");
  public static SubLSymbol LEAST_NEGATIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-NEGATIVE-SINGLE-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-DOUBLE-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-LONG-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_NORMALIZED_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-DOUBLE-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_NORMALIZED_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-LONG-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_NORMALIZED_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-SHORT-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_NORMALIZED_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-NORMALIZED-SINGLE-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-SHORT-FLOAT");
  public static SubLSymbol LEAST_POSITIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("LEAST-POSITIVE-SINGLE-FLOAT");
  public static SubLSymbol LENGTH =
    PACKAGE_CL.addExternalSymbol("LENGTH");
  public static SubLSymbol LET =
    PACKAGE_CL.addExternalSymbol("LET");
  public static SubLSymbol LET_STAR =
    PACKAGE_CL.addExternalSymbol("LET*");
  public static SubLSymbol LISP_IMPLEMENTATION_TYPE =
    PACKAGE_CL.addExternalSymbol("LISP-IMPLEMENTATION-TYPE");
  public static SubLSymbol LISP_IMPLEMENTATION_VERSION =
    PACKAGE_CL.addExternalSymbol("LISP-IMPLEMENTATION-VERSION");
  public static SubLSymbol LIST =
    PACKAGE_CL.addExternalSymbol("LIST");
  public static SubLSymbol LIST_STAR =
    PACKAGE_CL.addExternalSymbol("LIST*");
  public static SubLSymbol LIST_ALL_PACKAGES =
    PACKAGE_CL.addExternalSymbol("LIST-ALL-PACKAGES");
  public static SubLSymbol LIST_LENGTH =
    PACKAGE_CL.addExternalSymbol("LIST-LENGTH");
  public static SubLSymbol LISTEN =
    PACKAGE_CL.addExternalSymbol("LISTEN");
  public static SubLSymbol LISTP =
    PACKAGE_CL.addExternalSymbol("LISTP");
  public static SubLSymbol LOAD =
    PACKAGE_CL.addExternalSymbol("LOAD");
  public static SubLSymbol LOAD_LOGICAL_PATHNAME_TRANSLATIONS =
    PACKAGE_CL.addExternalSymbol("LOAD-LOGICAL-PATHNAME-TRANSLATIONS");
  public static SubLSymbol LOAD_TIME_VALUE =
    PACKAGE_CL.addExternalSymbol("LOAD-TIME-VALUE");
  public static SubLSymbol LOCALLY =
    PACKAGE_CL.addExternalSymbol("LOCALLY");
  public static SubLSymbol LOG =
    PACKAGE_CL.addExternalSymbol("LOG");
  public static SubLSymbol LOGAND =
    PACKAGE_CL.addExternalSymbol("LOGAND");
  public static SubLSymbol LOGANDC1 =
    PACKAGE_CL.addExternalSymbol("LOGANDC1");
  public static SubLSymbol LOGANDC2 =
    PACKAGE_CL.addExternalSymbol("LOGANDC2");
  public static SubLSymbol LOGBITP =
    PACKAGE_CL.addExternalSymbol("LOGBITP");
  public static SubLSymbol LOGCOUNT =
    PACKAGE_CL.addExternalSymbol("LOGCOUNT");
  public static SubLSymbol LOGEQV =
    PACKAGE_CL.addExternalSymbol("LOGEQV");
  public static SubLSymbol LOGICAL_PATHNAME =
    PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME");
  public static SubLSymbol LOGICAL_PATHNAME_TRANSLATIONS =
    PACKAGE_CL.addExternalSymbol("LOGICAL-PATHNAME-TRANSLATIONS");
  public static SubLSymbol LOGIOR =
    PACKAGE_CL.addExternalSymbol("LOGIOR");
  public static SubLSymbol LOGNAND =
    PACKAGE_CL.addExternalSymbol("LOGNAND");
  public static SubLSymbol LOGNOR =
    PACKAGE_CL.addExternalSymbol("LOGNOR");
  public static SubLSymbol LOGNOT =
    PACKAGE_CL.addExternalSymbol("LOGNOT");
  public static SubLSymbol LOGORC1 =
    PACKAGE_CL.addExternalSymbol("LOGORC1");
  public static SubLSymbol LOGORC2 =
    PACKAGE_CL.addExternalSymbol("LOGORC2");
  public static SubLSymbol LOGTEST =
    PACKAGE_CL.addExternalSymbol("LOGTEST");
  public static SubLSymbol LOGXOR =
    PACKAGE_CL.addExternalSymbol("LOGXOR");
  public static SubLSymbol LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT");
  public static SubLSymbol LONG_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT-EPSILON");
  public static SubLSymbol LONG_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("LONG-FLOAT-NEGATIVE-EPSILON");
  public static SubLSymbol LONG_SITE_NAME =
    PACKAGE_CL.addExternalSymbol("LONG-SITE-NAME");
  public static SubLSymbol LOOP =
    PACKAGE_CL.addExternalSymbol("LOOP");
  public static SubLSymbol LOOP_FINISH =
    PACKAGE_CL.addExternalSymbol("LOOP-FINISH");
  public static SubLSymbol LOWER_CASE_P =
    PACKAGE_CL.addExternalSymbol("LOWER-CASE-P");
  public static SubLSymbol MACHINE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("MACHINE-INSTANCE");
  public static SubLSymbol MACHINE_TYPE =
    PACKAGE_CL.addExternalSymbol("MACHINE-TYPE");
  public static SubLSymbol MACHINE_VERSION =
    PACKAGE_CL.addExternalSymbol("MACHINE-VERSION");
  public static SubLSymbol MACRO_FUNCTION =
    PACKAGE_CL.addExternalSymbol("MACRO-FUNCTION");
  public static SubLSymbol MACROEXPAND =
    PACKAGE_CL.addExternalSymbol("MACROEXPAND");
  public static SubLSymbol MACROEXPAND_1 =
    PACKAGE_CL.addExternalSymbol("MACROEXPAND-1");
  public static SubLSymbol MACROLET =
    PACKAGE_CL.addExternalSymbol("MACROLET");
  public static SubLSymbol MAKE_ARRAY =
    PACKAGE_CL.addExternalSymbol("MAKE-ARRAY");
  public static SubLSymbol MAKE_BROADCAST_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-BROADCAST-STREAM");
  public static SubLSymbol MAKE_CONCATENATED_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-CONCATENATED-STREAM");
  public static SubLSymbol MAKE_CONDITION =
    PACKAGE_CL.addExternalSymbol("MAKE-CONDITION");
  public static SubLSymbol MAKE_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("MAKE-DISPATCH-MACRO-CHARACTER");
  public static SubLSymbol MAKE_ECHO_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-ECHO-STREAM");
  public static SubLSymbol MAKE_HASH_TABLE =
    PACKAGE_CL.addExternalSymbol("MAKE-HASH-TABLE");
  public static SubLSymbol MAKE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("MAKE-INSTANCE");
  public static SubLSymbol MAKE_INSTANCES_OBSOLETE =
    PACKAGE_CL.addExternalSymbol("MAKE-INSTANCES-OBSOLETE");
  public static SubLSymbol MAKE_LIST =
    PACKAGE_CL.addExternalSymbol("MAKE-LIST");
  public static SubLSymbol MAKE_LOAD_FORM =
    PACKAGE_CL.addExternalSymbol("MAKE-LOAD-FORM");
  public static SubLSymbol MAKE_LOAD_FORM_SAVING_SLOTS =
    PACKAGE_CL.addExternalSymbol("MAKE-LOAD-FORM-SAVING-SLOTS");
  public static SubLSymbol MAKE_METHOD =
    PACKAGE_CL.addExternalSymbol("MAKE-METHOD");
  public static SubLSymbol MAKE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("MAKE-PACKAGE");
  public static SubLSymbol MAKE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("MAKE-PATHNAME");
  public static SubLSymbol MAKE_RANDOM_STATE =
    PACKAGE_CL.addExternalSymbol("MAKE-RANDOM-STATE");
  public static SubLSymbol MAKE_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("MAKE-SEQUENCE");
  public static SubLSymbol MAKE_STRING =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING");
  public static SubLSymbol MAKE_STRING_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING-INPUT-STREAM");
  public static SubLSymbol MAKE_STRING_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-STRING-OUTPUT-STREAM");
  public static SubLSymbol MAKE_SYMBOL =
    PACKAGE_CL.addExternalSymbol("MAKE-SYMBOL");
  public static SubLSymbol MAKE_SYNONYM_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-SYNONYM-STREAM");
  public static SubLSymbol MAKE_TWO_WAY_STREAM =
    PACKAGE_CL.addExternalSymbol("MAKE-TWO-WAY-STREAM");
  public static SubLSymbol MAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("MAKUNBOUND");
  public static SubLSymbol MAP =
    PACKAGE_CL.addExternalSymbol("MAP");
  public static SubLSymbol MAP_INTO =
    PACKAGE_CL.addExternalSymbol("MAP-INTO");
  public static SubLSymbol MAPC =
    PACKAGE_CL.addExternalSymbol("MAPC");
  public static SubLSymbol MAPCAN =
    PACKAGE_CL.addExternalSymbol("MAPCAN");
  public static SubLSymbol MAPCAR =
    PACKAGE_CL.addExternalSymbol("MAPCAR");
  public static SubLSymbol MAPCON =
    PACKAGE_CL.addExternalSymbol("MAPCON");
  public static SubLSymbol MAPHASH =
    PACKAGE_CL.addExternalSymbol("MAPHASH");
  public static SubLSymbol MAPL =
    PACKAGE_CL.addExternalSymbol("MAPL");
  public static SubLSymbol MAPLIST =
    PACKAGE_CL.addExternalSymbol("MAPLIST");
  public static SubLSymbol MASK_FIELD =
    PACKAGE_CL.addExternalSymbol("MASK-FIELD");
  public static SubLSymbol MAX =
    PACKAGE_CL.addExternalSymbol("MAX");
  public static SubLSymbol MEMBER =
    PACKAGE_CL.addExternalSymbol("MEMBER");
  public static SubLSymbol MEMBER_IF =
    PACKAGE_CL.addExternalSymbol("MEMBER-IF");
  public static SubLSymbol MEMBER_IF_NOT =
    PACKAGE_CL.addExternalSymbol("MEMBER-IF-NOT");
  public static SubLSymbol MERGE =
    PACKAGE_CL.addExternalSymbol("MERGE");
  public static SubLSymbol MERGE_PATHNAMES =
    PACKAGE_CL.addExternalSymbol("MERGE-PATHNAMES");
  public static SubLSymbol METHOD =
    PACKAGE_CL.addExternalSymbol("METHOD");
  public static SubLSymbol METHOD_COMBINATION =
    PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION");
  public static SubLSymbol METHOD_COMBINATION_ERROR =
    PACKAGE_CL.addExternalSymbol("METHOD-COMBINATION-ERROR");
  public static SubLSymbol METHOD_QUALIFIERS =
    PACKAGE_CL.addExternalSymbol("METHOD-QUALIFIERS");
  public static SubLSymbol MIN =
    PACKAGE_CL.addExternalSymbol("MIN");
  public static SubLSymbol MINUSP =
    PACKAGE_CL.addExternalSymbol("MINUSP");
  public static SubLSymbol MISMATCH =
    PACKAGE_CL.addExternalSymbol("MISMATCH");
  public static SubLSymbol MOD =
    PACKAGE_CL.addExternalSymbol("MOD");
  public static SubLSymbol MOST_NEGATIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-DOUBLE-FLOAT");
  public static SubLSymbol MOST_NEGATIVE_FIXNUM =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-FIXNUM");
  public static SubLSymbol MOST_NEGATIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-LONG-FLOAT");
  public static SubLSymbol MOST_NEGATIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-SHORT-FLOAT");
  public static SubLSymbol MOST_NEGATIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-NEGATIVE-SINGLE-FLOAT");
  public static SubLSymbol MOST_POSITIVE_DOUBLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-DOUBLE-FLOAT");
  public static SubLSymbol MOST_POSITIVE_FIXNUM =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-FIXNUM");
  public static SubLSymbol MOST_POSITIVE_LONG_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-LONG-FLOAT");
  public static SubLSymbol MOST_POSITIVE_SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-SHORT-FLOAT");
  public static SubLSymbol MOST_POSITIVE_SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("MOST-POSITIVE-SINGLE-FLOAT");
  public static SubLSymbol MUFFLE_WARNING =
    PACKAGE_CL.addExternalSymbol("MUFFLE-WARNING");
  public static SubLSymbol MULTIPLE_VALUE_BIND =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-BIND");
  public static SubLSymbol MULTIPLE_VALUE_CALL =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-CALL");
  public static SubLSymbol MULTIPLE_VALUE_LIST =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-LIST");
  public static SubLSymbol MULTIPLE_VALUE_PROG1 =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-PROG1");
  public static SubLSymbol MULTIPLE_VALUE_SETQ =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUE-SETQ");
  public static SubLSymbol MULTIPLE_VALUES_LIMIT =
    PACKAGE_CL.addExternalSymbol("MULTIPLE-VALUES-LIMIT");
  public static SubLSymbol NAME_CHAR =
    PACKAGE_CL.addExternalSymbol("NAME-CHAR");
  public static SubLSymbol NAMESTRING =
    PACKAGE_CL.addExternalSymbol("NAMESTRING");
  public static SubLSymbol NBUTLAST =
    PACKAGE_CL.addExternalSymbol("NBUTLAST");
  public static SubLSymbol NCONC =
    PACKAGE_CL.addExternalSymbol("NCONC");
  public static SubLSymbol NEXT_METHOD_P =
    PACKAGE_CL.addExternalSymbol("NEXT-METHOD-P");
  // NIL is a special case.
  //     public static Symbol NIL =
  //         PACKAGE_CL.addExternalSymbol("NIL");
  public static SubLSymbol NINTERSECTION =
    PACKAGE_CL.addExternalSymbol("NINTERSECTION");
  public static SubLSymbol NINTH =
    PACKAGE_CL.addExternalSymbol("NINTH");
  public static SubLSymbol NO_APPLICABLE_METHOD =
    PACKAGE_CL.addExternalSymbol("NO-APPLICABLE-METHOD");
  public static SubLSymbol NO_NEXT_METHOD =
    PACKAGE_CL.addExternalSymbol("NO-NEXT-METHOD");
  public static SubLSymbol NOT =
    PACKAGE_CL.addExternalSymbol("NOT");
  public static SubLSymbol NOTANY =
    PACKAGE_CL.addExternalSymbol("NOTANY");
  public static SubLSymbol NOTEVERY =
    PACKAGE_CL.addExternalSymbol("NOTEVERY");
  public static SubLSymbol NOTINLINE =
    PACKAGE_CL.addExternalSymbol("NOTINLINE");
  public static SubLSymbol NRECONC =
    PACKAGE_CL.addExternalSymbol("NRECONC");
  public static SubLSymbol NREVERSE =
    PACKAGE_CL.addExternalSymbol("NREVERSE");
  public static SubLSymbol NSET_DIFFERENCE =
    PACKAGE_CL.addExternalSymbol("NSET-DIFFERENCE");
  public static SubLSymbol NSET_EXCLUSIVE_OR =
    PACKAGE_CL.addExternalSymbol("NSET-EXCLUSIVE-OR");
  public static SubLSymbol NSTRING_CAPITALIZE =
    PACKAGE_CL.addExternalSymbol("NSTRING-CAPITALIZE");
  public static SubLSymbol NSTRING_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("NSTRING-DOWNCASE");
  public static SubLSymbol NSTRING_UPCASE =
    PACKAGE_CL.addExternalSymbol("NSTRING-UPCASE");
  public static SubLSymbol NSUBLIS =
    PACKAGE_CL.addExternalSymbol("NSUBLIS");
  public static SubLSymbol NSUBST =
    PACKAGE_CL.addExternalSymbol("NSUBST");
  public static SubLSymbol NSUBST_IF =
    PACKAGE_CL.addExternalSymbol("NSUBST-IF");
  public static SubLSymbol NSUBST_IF_NOT =
    PACKAGE_CL.addExternalSymbol("NSUBST-IF-NOT");
  public static SubLSymbol NSUBSTITUTE =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE");
  public static SubLSymbol NSUBSTITUTE_IF =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE-IF");
  public static SubLSymbol NSUBSTITUTE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("NSUBSTITUTE-IF-NOT");
  public static SubLSymbol NTH =
    PACKAGE_CL.addExternalSymbol("NTH");
  public static SubLSymbol NTH_VALUE =
    PACKAGE_CL.addExternalSymbol("NTH-VALUE");
  public static SubLSymbol NTHCDR =
    PACKAGE_CL.addExternalSymbol("NTHCDR");
  public static SubLSymbol NULL =
    PACKAGE_CL.addExternalSymbol("NULL");
  public static SubLSymbol NUMBER =
    PACKAGE_CL.addExternalSymbol("NUMBER");
  public static SubLSymbol NUMBERP =
    PACKAGE_CL.addExternalSymbol("NUMBERP");
  public static SubLSymbol NUMERATOR =
    PACKAGE_CL.addExternalSymbol("NUMERATOR");
  public static SubLSymbol NUNION =
    PACKAGE_CL.addExternalSymbol("NUNION");
  public static SubLSymbol ODDP =
    PACKAGE_CL.addExternalSymbol("ODDP");
  public static SubLSymbol OPEN =
    PACKAGE_CL.addExternalSymbol("OPEN");
  public static SubLSymbol OPEN_STREAM_P =
    PACKAGE_CL.addExternalSymbol("OPEN-STREAM-P");
  public static SubLSymbol OPTIMIZE =
    PACKAGE_CL.addExternalSymbol("OPTIMIZE");
  public static SubLSymbol OR =
    PACKAGE_CL.addExternalSymbol("OR");
  public static SubLSymbol OTHERWISE =
    PACKAGE_CL.addExternalSymbol("OTHERWISE");
  public static SubLSymbol OUTPUT_STREAM_P =
    PACKAGE_CL.addExternalSymbol("OUTPUT-STREAM-P");
  public static SubLSymbol PACKAGE =
    PACKAGE_CL.addExternalSymbol("PACKAGE");
  public static SubLSymbol PACKAGE_ERROR =
    PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR");
  public static SubLSymbol PACKAGE_ERROR_PACKAGE =
    PACKAGE_CL.addExternalSymbol("PACKAGE-ERROR-PACKAGE");
  public static SubLSymbol PACKAGE_NAME =
    PACKAGE_CL.addExternalSymbol("PACKAGE-NAME");
  public static SubLSymbol PACKAGE_NICKNAMES =
    PACKAGE_CL.addExternalSymbol("PACKAGE-NICKNAMES");
  public static SubLSymbol PACKAGE_SHADOWING_SYMBOLS =
    PACKAGE_CL.addExternalSymbol("PACKAGE-SHADOWING-SYMBOLS");
  public static SubLSymbol PACKAGE_USE_LIST =
    PACKAGE_CL.addExternalSymbol("PACKAGE-USE-LIST");
  public static SubLSymbol PACKAGE_USED_BY_LIST =
    PACKAGE_CL.addExternalSymbol("PACKAGE-USED-BY-LIST");
  public static SubLSymbol PACKAGEP =
    PACKAGE_CL.addExternalSymbol("PACKAGEP");
  public static SubLSymbol PAIRLIS =
    PACKAGE_CL.addExternalSymbol("PAIRLIS");
  public static SubLSymbol PARSE_ERROR =
    PACKAGE_CL.addExternalSymbol("PARSE-ERROR");
  public static SubLSymbol PARSE_INTEGER =
    PACKAGE_CL.addExternalSymbol("PARSE-INTEGER");
  public static SubLSymbol PARSE_NAMESTRING =
    PACKAGE_CL.addExternalSymbol("PARSE-NAMESTRING");
  public static SubLSymbol PATHNAME =
    PACKAGE_CL.addExternalSymbol("PATHNAME");
  public static SubLSymbol PATHNAME_DEVICE =
    PACKAGE_CL.addExternalSymbol("PATHNAME-DEVICE");
  public static SubLSymbol PATHNAME_DIRECTORY =
    PACKAGE_CL.addExternalSymbol("PATHNAME-DIRECTORY");
  public static SubLSymbol PATHNAME_HOST =
    PACKAGE_CL.addExternalSymbol("PATHNAME-HOST");
  public static SubLSymbol PATHNAME_MATCH_P =
    PACKAGE_CL.addExternalSymbol("PATHNAME-MATCH-P");
  public static SubLSymbol PATHNAME_NAME =
    PACKAGE_CL.addExternalSymbol("PATHNAME-NAME");
  public static SubLSymbol PATHNAME_TYPE =
    PACKAGE_CL.addExternalSymbol("PATHNAME-TYPE");
  public static SubLSymbol PATHNAME_VERSION =
    PACKAGE_CL.addExternalSymbol("PATHNAME-VERSION");
  public static SubLSymbol PATHNAMEP =
    PACKAGE_CL.addExternalSymbol("PATHNAMEP");
  public static SubLSymbol PEEK_CHAR =
    PACKAGE_CL.addExternalSymbol("PEEK-CHAR");
  public static SubLSymbol PHASE =
    PACKAGE_CL.addExternalSymbol("PHASE");
  public static SubLSymbol PI =
    PACKAGE_CL.addExternalSymbol("PI");
  public static SubLSymbol PLUSP =
    PACKAGE_CL.addExternalSymbol("PLUSP");
  public static SubLSymbol POP =
    PACKAGE_CL.addExternalSymbol("POP");
  public static SubLSymbol POSITION =
    PACKAGE_CL.addExternalSymbol("POSITION");
  public static SubLSymbol POSITION_IF =
    PACKAGE_CL.addExternalSymbol("POSITION-IF");
  public static SubLSymbol POSITION_IF_NOT =
    PACKAGE_CL.addExternalSymbol("POSITION-IF-NOT");
  public static SubLSymbol PPRINT =
    PACKAGE_CL.addExternalSymbol("PPRINT");
  public static SubLSymbol PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("PPRINT-DISPATCH");
  public static SubLSymbol PPRINT_EXIT_IF_LIST_EXHAUSTED =
    PACKAGE_CL.addExternalSymbol("PPRINT-EXIT-IF-LIST-EXHAUSTED");
  public static SubLSymbol PPRINT_FILL =
    PACKAGE_CL.addExternalSymbol("PPRINT-FILL");
  public static SubLSymbol PPRINT_INDENT =
    PACKAGE_CL.addExternalSymbol("PPRINT-INDENT");
  public static SubLSymbol PPRINT_LINEAR =
    PACKAGE_CL.addExternalSymbol("PPRINT-LINEAR");
  public static SubLSymbol PPRINT_LOGICAL_BLOCK =
    PACKAGE_CL.addExternalSymbol("PPRINT-LOGICAL-BLOCK");
  public static SubLSymbol PPRINT_NEWLINE =
    PACKAGE_CL.addExternalSymbol("PPRINT-NEWLINE");
  public static SubLSymbol PPRINT_POP =
    PACKAGE_CL.addExternalSymbol("PPRINT-POP");
  public static SubLSymbol PPRINT_TAB =
    PACKAGE_CL.addExternalSymbol("PPRINT-TAB");
  public static SubLSymbol PPRINT_TABULAR =
    PACKAGE_CL.addExternalSymbol("PPRINT-TABULAR");
  public static SubLSymbol PRIN1 =
    PACKAGE_CL.addExternalSymbol("PRIN1");
  public static SubLSymbol PRIN1_TO_STRING =
    PACKAGE_CL.addExternalSymbol("PRIN1-TO-STRING");
  public static SubLSymbol PRINC =
    PACKAGE_CL.addExternalSymbol("PRINC");
  public static SubLSymbol PRINC_TO_STRING =
    PACKAGE_CL.addExternalSymbol("PRINC-TO-STRING");
  public static SubLSymbol PRINT =
    PACKAGE_CL.addExternalSymbol("PRINT");
  public static SubLSymbol PRINT_NOT_READABLE =
    PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE");
  public static SubLSymbol PRINT_NOT_READABLE_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-NOT-READABLE-OBJECT");
  public static SubLSymbol PRINT_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-OBJECT");
  public static SubLSymbol PRINT_UNREADABLE_OBJECT =
    PACKAGE_CL.addExternalSymbol("PRINT-UNREADABLE-OBJECT");
  public static SubLSymbol PROBE_FILE =
    PACKAGE_CL.addExternalSymbol("PROBE-FILE");
  public static SubLSymbol PROCLAIM =
    PACKAGE_CL.addExternalSymbol("PROCLAIM");
  public static SubLSymbol PROG =
    PACKAGE_CL.addExternalSymbol("PROG");
  public static SubLSymbol PROG_STAR =
    PACKAGE_CL.addExternalSymbol("PROG*");
  public static SubLSymbol PROG1 =
    PACKAGE_CL.addExternalSymbol("PROG1");
  public static SubLSymbol PROG2 =
    PACKAGE_CL.addExternalSymbol("PROG2");
  public static SubLSymbol PROGN =
    PACKAGE_CL.addExternalSymbol("PROGN");
  public static SubLSymbol PROGRAM_ERROR =
    PACKAGE_CL.addExternalSymbol("PROGRAM-ERROR");
  public static SubLSymbol PROGV =
    PACKAGE_CL.addExternalSymbol("PROGV");
  public static SubLSymbol PROVIDE =
    PACKAGE_CL.addExternalSymbol("PROVIDE");
  public static SubLSymbol PSETF =
    PACKAGE_CL.addExternalSymbol("PSETF");
  public static SubLSymbol PSETQ =
    PACKAGE_CL.addExternalSymbol("PSETQ");
  public static SubLSymbol PUSH =
    PACKAGE_CL.addExternalSymbol("PUSH");
  public static SubLSymbol PUSHNEW =
    PACKAGE_CL.addExternalSymbol("PUSHNEW");
  public static SubLSymbol QUOTE =
    PACKAGE_CL.addExternalSymbol("QUOTE");
  public static SubLSymbol RANDOM =
    PACKAGE_CL.addExternalSymbol("RANDOM");
  public static SubLSymbol RANDOM_STATE =
    PACKAGE_CL.addExternalSymbol("RANDOM-STATE");
  public static SubLSymbol RANDOM_STATE_P =
    PACKAGE_CL.addExternalSymbol("RANDOM-STATE-P");
  public static SubLSymbol RASSOC =
    PACKAGE_CL.addExternalSymbol("RASSOC");
  public static SubLSymbol RASSOC_IF =
    PACKAGE_CL.addExternalSymbol("RASSOC-IF");
  public static SubLSymbol RASSOC_IF_NOT =
    PACKAGE_CL.addExternalSymbol("RASSOC-IF-NOT");
  public static SubLSymbol RATIO =
    PACKAGE_CL.addExternalSymbol("RATIO");
  public static SubLSymbol RATIONAL =
    PACKAGE_CL.addExternalSymbol("RATIONAL");
  public static SubLSymbol RATIONALIZE =
    PACKAGE_CL.addExternalSymbol("RATIONALIZE");
  public static SubLSymbol RATIONALP =
    PACKAGE_CL.addExternalSymbol("RATIONALP");
  public static SubLSymbol READ =
    PACKAGE_CL.addExternalSymbol("READ");
  public static SubLSymbol READ_BYTE =
    PACKAGE_CL.addExternalSymbol("READ-BYTE");
  public static SubLSymbol READ_CHAR =
    PACKAGE_CL.addExternalSymbol("READ-CHAR");
  public static SubLSymbol READ_CHAR_NO_HANG =
    PACKAGE_CL.addExternalSymbol("READ-CHAR-NO-HANG");
  public static SubLSymbol READ_DELIMITED_LIST =
    PACKAGE_CL.addExternalSymbol("READ-DELIMITED-LIST");
  public static SubLSymbol READ_FROM_STRING =
    PACKAGE_CL.addExternalSymbol("READ-FROM-STRING");
  public static SubLSymbol READ_LINE =
    PACKAGE_CL.addExternalSymbol("READ-LINE");
  public static SubLSymbol READ_PRESERVING_WHITESPACE =
    PACKAGE_CL.addExternalSymbol("READ-PRESERVING-WHITESPACE");
  public static SubLSymbol READ_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("READ-SEQUENCE");
  public static SubLSymbol READER_ERROR =
    PACKAGE_CL.addExternalSymbol("READER-ERROR");
  public static SubLSymbol READTABLE =
    PACKAGE_CL.addExternalSymbol("READTABLE");
  public static SubLSymbol READTABLE_CASE =
    PACKAGE_CL.addExternalSymbol("READTABLE-CASE");
  public static SubLSymbol READTABLEP =
    PACKAGE_CL.addExternalSymbol("READTABLEP");
  public static SubLSymbol REAL =
    PACKAGE_CL.addExternalSymbol("REAL");
  public static SubLSymbol REALP =
    PACKAGE_CL.addExternalSymbol("REALP");
  public static SubLSymbol REALPART =
    PACKAGE_CL.addExternalSymbol("REALPART");
  public static SubLSymbol REDUCE =
    PACKAGE_CL.addExternalSymbol("REDUCE");
  public static SubLSymbol REINITIALIZE_INSTANCE =
    PACKAGE_CL.addExternalSymbol("REINITIALIZE-INSTANCE");
  public static SubLSymbol REM =
    PACKAGE_CL.addExternalSymbol("REM");
  public static SubLSymbol REMF =
    PACKAGE_CL.addExternalSymbol("REMF");
  public static SubLSymbol REMHASH =
    PACKAGE_CL.addExternalSymbol("REMHASH");
  public static SubLSymbol REMOVE =
    PACKAGE_CL.addExternalSymbol("REMOVE");
  public static SubLSymbol REMOVE_DUPLICATES =
    PACKAGE_CL.addExternalSymbol("REMOVE-DUPLICATES");
  public static SubLSymbol REMOVE_IF =
    PACKAGE_CL.addExternalSymbol("REMOVE-IF");
  public static SubLSymbol REMOVE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("REMOVE-IF-NOT");
  public static SubLSymbol REMOVE_METHOD =
    PACKAGE_CL.addExternalSymbol("REMOVE-METHOD");
  public static SubLSymbol REMPROP =
    PACKAGE_CL.addExternalSymbol("REMPROP");
  public static SubLSymbol RENAME_FILE =
    PACKAGE_CL.addExternalSymbol("RENAME-FILE");
  public static SubLSymbol RENAME_PACKAGE =
    PACKAGE_CL.addExternalSymbol("RENAME-PACKAGE");
  public static SubLSymbol REPLACE =
    PACKAGE_CL.addExternalSymbol("REPLACE");
  public static SubLSymbol REQUIRE =
    PACKAGE_CL.addExternalSymbol("REQUIRE");
  public static SubLSymbol REST =
    PACKAGE_CL.addExternalSymbol("REST");
  public static SubLSymbol RESTART =
    PACKAGE_CL.addExternalSymbol("RESTART");
  public static SubLSymbol RESTART_BIND =
    PACKAGE_CL.addExternalSymbol("RESTART-BIND");
  public static SubLSymbol RESTART_CASE =
    PACKAGE_CL.addExternalSymbol("RESTART-CASE");
  public static SubLSymbol RESTART_NAME =
    PACKAGE_CL.addExternalSymbol("RESTART-NAME");
  public static SubLSymbol RETURN =
    PACKAGE_CL.addExternalSymbol("RETURN");
  public static SubLSymbol RETURN_FROM =
    PACKAGE_CL.addExternalSymbol("RETURN-FROM");
  public static SubLSymbol REVAPPEND =
    PACKAGE_CL.addExternalSymbol("REVAPPEND");
  public static SubLSymbol REVERSE =
    PACKAGE_CL.addExternalSymbol("REVERSE");
  public static SubLSymbol ROOM =
    PACKAGE_CL.addExternalSymbol("ROOM");
  public static SubLSymbol ROTATEF =
    PACKAGE_CL.addExternalSymbol("ROTATEF");
  public static SubLSymbol ROUND =
    PACKAGE_CL.addExternalSymbol("ROUND");
  public static SubLSymbol ROW_MAJOR_AREF =
    PACKAGE_CL.addExternalSymbol("ROW-MAJOR-AREF");
  public static SubLSymbol RPLACA =
    PACKAGE_CL.addExternalSymbol("RPLACA");
  public static SubLSymbol RPLACD =
    PACKAGE_CL.addExternalSymbol("RPLACD");
  public static SubLSymbol SAFETY =
    PACKAGE_CL.addExternalSymbol("SAFETY");
  public static SubLSymbol SATISFIES =
    PACKAGE_CL.addExternalSymbol("SATISFIES");
  public static SubLSymbol SBIT =
    PACKAGE_CL.addExternalSymbol("SBIT");
  public static SubLSymbol SCALE_FLOAT =
    PACKAGE_CL.addExternalSymbol("SCALE-FLOAT");
  public static SubLSymbol SCHAR =
    PACKAGE_CL.addExternalSymbol("SCHAR");
  public static SubLSymbol SEARCH =
    PACKAGE_CL.addExternalSymbol("SEARCH");
  public static SubLSymbol SECOND =
    PACKAGE_CL.addExternalSymbol("SECOND");
  public static SubLSymbol SEQUENCE =
    PACKAGE_CL.addExternalSymbol("SEQUENCE");
  public static SubLSymbol SERIOUS_CONDITION =
    PACKAGE_CL.addExternalSymbol("SERIOUS-CONDITION");
  public static SubLSymbol SET =
    PACKAGE_CL.addExternalSymbol("SET");
  public static SubLSymbol SET_DIFFERENCE =
    PACKAGE_CL.addExternalSymbol("SET-DIFFERENCE");
  public static SubLSymbol SET_DISPATCH_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("SET-DISPATCH-MACRO-CHARACTER");
  public static SubLSymbol SET_EXCLUSIVE_OR =
    PACKAGE_CL.addExternalSymbol("SET-EXCLUSIVE-OR");
  public static SubLSymbol SET_MACRO_CHARACTER =
    PACKAGE_CL.addExternalSymbol("SET-MACRO-CHARACTER");
  public static SubLSymbol SET_PPRINT_DISPATCH =
    PACKAGE_CL.addExternalSymbol("SET-PPRINT-DISPATCH");
  public static SubLSymbol SET_SYNTAX_FROM_CHAR =
    PACKAGE_CL.addExternalSymbol("SET-SYNTAX-FROM-CHAR");
  public static SubLSymbol SETF =
    PACKAGE_CL.addExternalSymbol("SETF");
  public static SubLSymbol SETQ =
    PACKAGE_CL.addExternalSymbol("SETQ");
  public static SubLSymbol SEVENTH =
    PACKAGE_CL.addExternalSymbol("SEVENTH");
  public static SubLSymbol SHADOW =
    PACKAGE_CL.addExternalSymbol("SHADOW");
  public static SubLSymbol SHADOWING_IMPORT =
    PACKAGE_CL.addExternalSymbol("SHADOWING-IMPORT");
  public static SubLSymbol SHARED_INITIALIZE =
    PACKAGE_CL.addExternalSymbol("SHARED-INITIALIZE");
  public static SubLSymbol SHIFTF =
    PACKAGE_CL.addExternalSymbol("SHIFTF");
  public static SubLSymbol SHORT_FLOAT =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT");
  public static SubLSymbol SHORT_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT-EPSILON");
  public static SubLSymbol SHORT_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("SHORT-FLOAT-NEGATIVE-EPSILON");
  public static SubLSymbol SHORT_SITE_NAME =
    PACKAGE_CL.addExternalSymbol("SHORT-SITE-NAME");
  public static SubLSymbol SIGNAL =
    PACKAGE_CL.addExternalSymbol("SIGNAL");
  public static SubLSymbol SIGNED_BYTE =
    PACKAGE_CL.addExternalSymbol("SIGNED-BYTE");
  public static SubLSymbol SIGNUM =
    PACKAGE_CL.addExternalSymbol("SIGNUM");
  public static SubLSymbol SIMPLE_ARRAY =
    PACKAGE_CL.addExternalSymbol("SIMPLE-ARRAY");
  public static SubLSymbol SIMPLE_BASE_STRING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BASE-STRING");
  public static SubLSymbol SIMPLE_BIT_VECTOR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR");
  public static SubLSymbol SIMPLE_BIT_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-BIT-VECTOR-P");
  public static SubLSymbol SIMPLE_CONDITION =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION");
  public static SubLSymbol SIMPLE_CONDITION_FORMAT_ARGUMENTS =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION-FORMAT-ARGUMENTS");
  public static SubLSymbol SIMPLE_CONDITION_FORMAT_CONTROL =
    PACKAGE_CL.addExternalSymbol("SIMPLE-CONDITION-FORMAT-CONTROL");
  public static SubLSymbol SIMPLE_ERROR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-ERROR");
  public static SubLSymbol SIMPLE_STRING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-STRING");
  public static SubLSymbol SIMPLE_STRING_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-STRING-P");
  public static SubLSymbol SIMPLE_TYPE_ERROR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-TYPE-ERROR");
  public static SubLSymbol SIMPLE_VECTOR =
    PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR");
  public static SubLSymbol SIMPLE_VECTOR_P =
    PACKAGE_CL.addExternalSymbol("SIMPLE-VECTOR-P");
  public static SubLSymbol SIMPLE_WARNING =
    PACKAGE_CL.addExternalSymbol("SIMPLE-WARNING");
  public static SubLSymbol SIN =
    PACKAGE_CL.addExternalSymbol("SIN");
  public static SubLSymbol SINGLE_FLOAT =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT");
  public static SubLSymbol SINGLE_FLOAT_EPSILON =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT-EPSILON");
  public static SubLSymbol SINGLE_FLOAT_NEGATIVE_EPSILON =
    PACKAGE_CL.addExternalSymbol("SINGLE-FLOAT-NEGATIVE-EPSILON");
  public static SubLSymbol SINH =
    PACKAGE_CL.addExternalSymbol("SINH");
  public static SubLSymbol SIXTH =
    PACKAGE_CL.addExternalSymbol("SIXTH");
  public static SubLSymbol SLEEP =
    PACKAGE_CL.addExternalSymbol("SLEEP");
  public static SubLSymbol SLOT_BOUNDP =
    PACKAGE_CL.addExternalSymbol("SLOT-BOUNDP");
  public static SubLSymbol SLOT_EXISTS_P =
    PACKAGE_CL.addExternalSymbol("SLOT-EXISTS-P");
  public static SubLSymbol SLOT_MAKUNBOUND =
    PACKAGE_CL.addExternalSymbol("SLOT-MAKUNBOUND");
  public static SubLSymbol SLOT_MISSING =
    PACKAGE_CL.addExternalSymbol("SLOT-MISSING");
  public static SubLSymbol SLOT_UNBOUND =
    PACKAGE_CL.addExternalSymbol("SLOT-UNBOUND");
  public static SubLSymbol SLOT_VALUE =
    PACKAGE_CL.addExternalSymbol("SLOT-VALUE");
  public static SubLSymbol SOFTWARE_TYPE =
    PACKAGE_CL.addExternalSymbol("SOFTWARE-TYPE");
  public static SubLSymbol SOFTWARE_VERSION =
    PACKAGE_CL.addExternalSymbol("SOFTWARE-VERSION");
  public static SubLSymbol SOME =
    PACKAGE_CL.addExternalSymbol("SOME");
  public static SubLSymbol SORT =
    PACKAGE_CL.addExternalSymbol("SORT");
  public static SubLSymbol SPACE =
    PACKAGE_CL.addExternalSymbol("SPACE");
  public static SubLSymbol SPECIAL =
    PACKAGE_CL.addExternalSymbol("SPECIAL");
  public static SubLSymbol SPECIAL_OPERATOR_P =
    PACKAGE_CL.addExternalSymbol("SPECIAL-OPERATOR-P");
  public static SubLSymbol SPEED =
    PACKAGE_CL.addExternalSymbol("SPEED");
  public static SubLSymbol SQRT =
    PACKAGE_CL.addExternalSymbol("SQRT");
  public static SubLSymbol STABLE_SORT =
    PACKAGE_CL.addExternalSymbol("STABLE-SORT");
  public static SubLSymbol STANDARD =
    PACKAGE_CL.addExternalSymbol("STANDARD");
  public static SubLSymbol STANDARD_CHAR =
    PACKAGE_CL.addExternalSymbol("STANDARD-CHAR");
  public static SubLSymbol STANDARD_CHAR_P =
    PACKAGE_CL.addExternalSymbol("STANDARD-CHAR-P");
  public static SubLSymbol STANDARD_CLASS =
    PACKAGE_CL.addExternalSymbol("STANDARD-CLASS");
  public static SubLSymbol STANDARD_GENERIC_FUNCTION =
    PACKAGE_CL.addExternalSymbol("STANDARD-GENERIC-FUNCTION");
  public static SubLSymbol STANDARD_METHOD =
    PACKAGE_CL.addExternalSymbol("STANDARD-METHOD");
  public static SubLSymbol STANDARD_OBJECT =
    PACKAGE_CL.addExternalSymbol("STANDARD-OBJECT");
  public static SubLSymbol STEP =
    PACKAGE_CL.addExternalSymbol("STEP");
  public static SubLSymbol STORAGE_CONDITION =
    PACKAGE_CL.addExternalSymbol("STORAGE-CONDITION");
  public static SubLSymbol STORE_VALUE =
    PACKAGE_CL.addExternalSymbol("STORE-VALUE");
  public static SubLSymbol STREAM =
    PACKAGE_CL.addExternalSymbol("STREAM");
  public static SubLSymbol STREAM_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("STREAM-ELEMENT-TYPE");
  public static SubLSymbol STREAM_ERROR =
    PACKAGE_CL.addExternalSymbol("STREAM-ERROR");
  public static SubLSymbol STREAM_ERROR_STREAM =
    PACKAGE_CL.addExternalSymbol("STREAM-ERROR-STREAM");
  public static SubLSymbol STREAM_EXTERNAL_FORMAT =
    PACKAGE_CL.addExternalSymbol("STREAM-EXTERNAL-FORMAT");
  public static SubLSymbol STREAMP =
    PACKAGE_CL.addExternalSymbol("STREAMP");
  public static SubLSymbol STRING =
    PACKAGE_CL.addExternalSymbol("STRING");
  public static SubLSymbol STRING_CAPITALIZE =
    PACKAGE_CL.addExternalSymbol("STRING-CAPITALIZE");
  public static SubLSymbol STRING_DOWNCASE =
    PACKAGE_CL.addExternalSymbol("STRING-DOWNCASE");
  public static SubLSymbol STRING_EQUAL =
    PACKAGE_CL.addExternalSymbol("STRING-EQUAL");
  public static SubLSymbol STRING_GREATERP =
    PACKAGE_CL.addExternalSymbol("STRING-GREATERP");
  public static SubLSymbol STRING_LEFT_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-LEFT-TRIM");
  public static SubLSymbol STRING_LESSP =
    PACKAGE_CL.addExternalSymbol("STRING-LESSP");
  public static SubLSymbol STRING_NOT_EQUAL =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-EQUAL");
  public static SubLSymbol STRING_NOT_GREATERP =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-GREATERP");
  public static SubLSymbol STRING_NOT_LESSP =
    PACKAGE_CL.addExternalSymbol("STRING-NOT-LESSP");
  public static SubLSymbol STRING_RIGHT_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-RIGHT-TRIM");
  public static SubLSymbol STRING_STREAM =
    PACKAGE_CL.addExternalSymbol("STRING-STREAM");
  public static SubLSymbol STRING_TRIM =
    PACKAGE_CL.addExternalSymbol("STRING-TRIM");
  public static SubLSymbol STRING_UPCASE =
    PACKAGE_CL.addExternalSymbol("STRING-UPCASE");
  public static SubLSymbol STRING_NE =
    PACKAGE_CL.addExternalSymbol("STRING/=");
  public static SubLSymbol STRING_LT =
    PACKAGE_CL.addExternalSymbol("STRING<");
  public static SubLSymbol STRING_LE =
    PACKAGE_CL.addExternalSymbol("STRING<=");
  public static SubLSymbol STRING_EQUALS =
    PACKAGE_CL.addExternalSymbol("STRING=");
  public static SubLSymbol STRING_GT =
    PACKAGE_CL.addExternalSymbol("STRING>");
  public static SubLSymbol STRING_GE =
    PACKAGE_CL.addExternalSymbol("STRING>=");
  public static SubLSymbol STRINGP =
    PACKAGE_CL.addExternalSymbol("STRINGP");
  public static SubLSymbol STRUCTURE =
    PACKAGE_CL.addExternalSymbol("STRUCTURE");
  public static SubLSymbol STRUCTURE_CLASS =
    PACKAGE_CL.addExternalSymbol("STRUCTURE-CLASS");
  public static SubLSymbol STRUCTURE_OBJECT =
    PACKAGE_CL.addExternalSymbol("STRUCTURE-OBJECT");
  public static SubLSymbol STYLE_WARNING =
    PACKAGE_CL.addExternalSymbol("STYLE-WARNING");
  public static SubLSymbol SUBLIS =
    PACKAGE_CL.addExternalSymbol("SUBLIS");
  public static SubLSymbol SUBSEQ =
    PACKAGE_CL.addExternalSymbol("SUBSEQ");
  public static SubLSymbol SUBSETP =
    PACKAGE_CL.addExternalSymbol("SUBSETP");
  public static SubLSymbol SUBST =
    PACKAGE_CL.addExternalSymbol("SUBST");
  public static SubLSymbol SUBST_IF =
    PACKAGE_CL.addExternalSymbol("SUBST-IF");
  public static SubLSymbol SUBST_IF_NOT =
    PACKAGE_CL.addExternalSymbol("SUBST-IF-NOT");
  public static SubLSymbol SUBSTITUTE =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE");
  public static SubLSymbol SUBSTITUTE_IF =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE-IF");
  public static SubLSymbol SUBSTITUTE_IF_NOT =
    PACKAGE_CL.addExternalSymbol("SUBSTITUTE-IF-NOT");
  public static SubLSymbol SUBTYPEP =
    PACKAGE_CL.addExternalSymbol("SUBTYPEP");
  public static SubLSymbol SVREF =
    PACKAGE_CL.addExternalSymbol("SVREF");
  public static SubLSymbol SXHASH =
    PACKAGE_CL.addExternalSymbol("SXHASH");
  public static SubLSymbol SYMBOL =
    PACKAGE_CL.addExternalSymbol("SYMBOL");
  public static SubLSymbol SYMBOL_FUNCTION =
    PACKAGE_CL.addExternalSymbol("SYMBOL-FUNCTION");
  public static SubLSymbol SYMBOL_MACROLET =
    PACKAGE_CL.addExternalSymbol("SYMBOL-MACROLET");
  public static SubLSymbol SYMBOL_NAME =
    PACKAGE_CL.addExternalSymbol("SYMBOL-NAME");
  public static SubLSymbol SYMBOL_PACKAGE =
    PACKAGE_CL.addExternalSymbol("SYMBOL-PACKAGE");
  public static SubLSymbol SYMBOL_PLIST =
    PACKAGE_CL.addExternalSymbol("SYMBOL-PLIST");
  public static SubLSymbol SYMBOL_VALUE =
    PACKAGE_CL.addExternalSymbol("SYMBOL-VALUE");
  public static SubLSymbol SYMBOLP =
    PACKAGE_CL.addExternalSymbol("SYMBOLP");
  public static SubLSymbol SYNONYM_STREAM =
    PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM");
  public static SubLSymbol SYNONYM_STREAM_SYMBOL =
    PACKAGE_CL.addExternalSymbol("SYNONYM-STREAM-SYMBOL");
  public static SubLSymbol T =
    PACKAGE_CL.addExternalSymbol("T");
  public static SubLSymbol TAGBODY =
    PACKAGE_CL.addExternalSymbol("TAGBODY");
  public static SubLSymbol TAILP =
    PACKAGE_CL.addExternalSymbol("TAILP");
  public static SubLSymbol TAN =
    PACKAGE_CL.addExternalSymbol("TAN");
  public static SubLSymbol TANH =
    PACKAGE_CL.addExternalSymbol("TANH");
  public static SubLSymbol TENTH =
    PACKAGE_CL.addExternalSymbol("TENTH");
  public static SubLSymbol TERPRI =
    PACKAGE_CL.addExternalSymbol("TERPRI");
  public static SubLSymbol THE =
    PACKAGE_CL.addExternalSymbol("THE");
  public static SubLSymbol THIRD =
    PACKAGE_CL.addExternalSymbol("THIRD");
  public static SubLSymbol THROW =
    PACKAGE_CL.addExternalSymbol("THROW");
  public static SubLSymbol TIME =
    PACKAGE_CL.addExternalSymbol("TIME");
  public static SubLSymbol TRACE =
    PACKAGE_CL.addExternalSymbol("TRACE");
  public static SubLSymbol TRANSLATE_LOGICAL_PATHNAME =
    PACKAGE_CL.addExternalSymbol("TRANSLATE-LOGICAL-PATHNAME");
  public static SubLSymbol TRANSLATE_PATHNAME =
    PACKAGE_CL.addExternalSymbol("TRANSLATE-PATHNAME");
  public static SubLSymbol TREE_EQUAL =
    PACKAGE_CL.addExternalSymbol("TREE-EQUAL");
  public static SubLSymbol TRUENAME =
    PACKAGE_CL.addExternalSymbol("TRUENAME");
  public static SubLSymbol TRUNCATE =
    PACKAGE_CL.addExternalSymbol("TRUNCATE");
  public static SubLSymbol TWO_WAY_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM");
  public static SubLSymbol TWO_WAY_STREAM_INPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM-INPUT-STREAM");
  public static SubLSymbol TWO_WAY_STREAM_OUTPUT_STREAM =
    PACKAGE_CL.addExternalSymbol("TWO-WAY-STREAM-OUTPUT-STREAM");
  public static SubLSymbol TYPE =
    PACKAGE_CL.addExternalSymbol("TYPE");
  public static SubLSymbol TYPE_ERROR =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR");
  public static SubLSymbol TYPE_ERROR_DATUM =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR-DATUM");
  public static SubLSymbol TYPE_ERROR_EXPECTED_TYPE =
    PACKAGE_CL.addExternalSymbol("TYPE-ERROR-EXPECTED-TYPE");
  public static SubLSymbol TYPE_OF =
    PACKAGE_CL.addExternalSymbol("TYPE-OF");
  public static SubLSymbol TYPECASE =
    PACKAGE_CL.addExternalSymbol("TYPECASE");
  public static SubLSymbol TYPEP =
    PACKAGE_CL.addExternalSymbol("TYPEP");
  public static SubLSymbol UNBOUND_SLOT =
    PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT");
  public static SubLSymbol UNBOUND_SLOT_INSTANCE =
    PACKAGE_CL.addExternalSymbol("UNBOUND-SLOT-INSTANCE");
  public static SubLSymbol UNBOUND_VARIABLE =
    PACKAGE_CL.addExternalSymbol("UNBOUND-VARIABLE");
  public static SubLSymbol UNDEFINED_FUNCTION =
    PACKAGE_CL.addExternalSymbol("UNDEFINED-FUNCTION");
  public static SubLSymbol UNEXPORT =
    PACKAGE_CL.addExternalSymbol("UNEXPORT");
  public static SubLSymbol UNINTERN =
    PACKAGE_CL.addExternalSymbol("UNINTERN");
  public static SubLSymbol UNION =
    PACKAGE_CL.addExternalSymbol("UNION");
  public static SubLSymbol UNLESS =
    PACKAGE_CL.addExternalSymbol("UNLESS");
  public static SubLSymbol UNREAD_CHAR =
    PACKAGE_CL.addExternalSymbol("UNREAD-CHAR");
  public static SubLSymbol UNSIGNED_BYTE =
    PACKAGE_CL.addExternalSymbol("UNSIGNED-BYTE");
  public static SubLSymbol UNTRACE =
    PACKAGE_CL.addExternalSymbol("UNTRACE");
  public static SubLSymbol UNUSE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("UNUSE-PACKAGE");
  public static SubLSymbol UNWIND_PROTECT =
    PACKAGE_CL.addExternalSymbol("UNWIND-PROTECT");
  public static SubLSymbol UPDATE_INSTANCE_FOR_DIFFERENT_CLASS =
    PACKAGE_CL.addExternalSymbol("UPDATE-INSTANCE-FOR-DIFFERENT-CLASS");
  public static SubLSymbol UPDATE_INSTANCE_FOR_REDEFINED_CLASS =
    PACKAGE_CL.addExternalSymbol("UPDATE-INSTANCE-FOR-REDEFINED-CLASS");
  public static SubLSymbol UPGRADED_ARRAY_ELEMENT_TYPE =
    PACKAGE_CL.addExternalSymbol("UPGRADED-ARRAY-ELEMENT-TYPE");
  public static SubLSymbol UPGRADED_COMPLEX_PART_TYPE =
    PACKAGE_CL.addExternalSymbol("UPGRADED-COMPLEX-PART-TYPE");
  public static SubLSymbol UPPER_CASE_P =
    PACKAGE_CL.addExternalSymbol("UPPER-CASE-P");
  public static SubLSymbol USE_PACKAGE =
    PACKAGE_CL.addExternalSymbol("USE-PACKAGE");
  public static SubLSymbol USE_VALUE =
    PACKAGE_CL.addExternalSymbol("USE-VALUE");
  public static SubLSymbol USER_HOMEDIR_PATHNAME =
    PACKAGE_CL.addExternalSymbol("USER-HOMEDIR-PATHNAME");
  public static SubLSymbol VALUES =
    PACKAGE_CL.addExternalSymbol("VALUES");
  public static SubLSymbol VALUES_LIST =
    PACKAGE_CL.addExternalSymbol("VALUES-LIST");
  public static SubLSymbol VARIABLE =
    PACKAGE_CL.addExternalSymbol("VARIABLE");
  public static SubLSymbol VECTOR =
    PACKAGE_CL.addExternalSymbol("VECTOR");
  public static SubLSymbol VECTOR_POP =
    PACKAGE_CL.addExternalSymbol("VECTOR-POP");
  public static SubLSymbol VECTOR_PUSH =
    PACKAGE_CL.addExternalSymbol("VECTOR-PUSH");
  public static SubLSymbol VECTOR_PUSH_EXTEND =
    PACKAGE_CL.addExternalSymbol("VECTOR-PUSH-EXTEND");
  public static SubLSymbol VECTORP =
    PACKAGE_CL.addExternalSymbol("VECTORP");
  public static SubLSymbol WARN =
    PACKAGE_CL.addExternalSymbol("WARN");
  public static SubLSymbol WARNING =
    PACKAGE_CL.addExternalSymbol("WARNING");
  public static SubLSymbol WHEN =
    PACKAGE_CL.addExternalSymbol("WHEN");
  public static SubLSymbol WILD_PATHNAME_P =
    PACKAGE_CL.addExternalSymbol("WILD-PATHNAME-P");
  public static SubLSymbol WITH_ACCESSORS =
    PACKAGE_CL.addExternalSymbol("WITH-ACCESSORS");
  public static SubLSymbol WITH_COMPILATION_UNIT =
    PACKAGE_CL.addExternalSymbol("WITH-COMPILATION-UNIT");
  public static SubLSymbol WITH_CONDITION_RESTARTS =
    PACKAGE_CL.addExternalSymbol("WITH-CONDITION-RESTARTS");
  public static SubLSymbol WITH_HASH_TABLE_ITERATOR =
    PACKAGE_CL.addExternalSymbol("WITH-HASH-TABLE-ITERATOR");
  public static SubLSymbol WITH_INPUT_FROM_STRING =
    PACKAGE_CL.addExternalSymbol("WITH-INPUT-FROM-STRING");
  public static SubLSymbol WITH_OPEN_FILE =
    PACKAGE_CL.addExternalSymbol("WITH-OPEN-FILE");
  public static SubLSymbol WITH_OPEN_STREAM =
    PACKAGE_CL.addExternalSymbol("WITH-OPEN-STREAM");
  public static SubLSymbol WITH_OUTPUT_TO_STRING =
    PACKAGE_CL.addExternalSymbol("WITH-OUTPUT-TO-STRING");
  public static SubLSymbol WITH_PACKAGE_ITERATOR =
    PACKAGE_CL.addExternalSymbol("WITH-PACKAGE-ITERATOR");
  public static SubLSymbol WITH_SIMPLE_RESTART =
    PACKAGE_CL.addExternalSymbol("WITH-SIMPLE-RESTART");
  public static SubLSymbol WITH_SLOTS =
    PACKAGE_CL.addExternalSymbol("WITH-SLOTS");
  public static SubLSymbol WITH_STANDARD_IO_SYNTAX =
    PACKAGE_CL.addExternalSymbol("WITH-STANDARD-IO-SYNTAX");
  public static SubLSymbol WRITE =
    PACKAGE_CL.addExternalSymbol("WRITE");
  public static SubLSymbol WRITE_BYTE =
    PACKAGE_CL.addExternalSymbol("WRITE-BYTE");
  public static SubLSymbol WRITE_CHAR =
    PACKAGE_CL.addExternalSymbol("WRITE-CHAR");
  public static SubLSymbol WRITE_LINE =
    PACKAGE_CL.addExternalSymbol("WRITE-LINE");
  public static SubLSymbol WRITE_SEQUENCE =
    PACKAGE_CL.addExternalSymbol("WRITE-SEQUENCE");
  public static SubLSymbol WRITE_STRING =
    PACKAGE_CL.addExternalSymbol("WRITE-STRING");
  public static SubLSymbol WRITE_TO_STRING =
    PACKAGE_CL.addExternalSymbol("WRITE-TO-STRING");
  public static SubLSymbol Y_OR_N_P =
    PACKAGE_CL.addExternalSymbol("Y-OR-N-P");
  public static SubLSymbol YES_OR_NO_P =
    PACKAGE_CL.addExternalSymbol("YES-OR-NO-P");
  public static SubLSymbol ZEROP =
    PACKAGE_CL.addExternalSymbol("ZEROP");
  // End of CL symbols.

  // Extensions.
  public static SubLSymbol MOST_POSITIVE_JAVA_LONG =
    PACKAGE_EXT.addExternalSymbol("MOST-POSITIVE-JAVA-LONG");
  public static SubLSymbol MOST_NEGATIVE_JAVA_LONG=
    PACKAGE_EXT.addExternalSymbol("MOST-NEGATIVE-JAVA-LONG");
  public static SubLSymbol JAVA_COMPILED_FUNCTION =
  	PACKAGE_EXT.addExternalSymbol("JAVA-COMPILED-FUNCTION");
  public static SubLSymbol SINGLE_FLOAT_POSITIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-POSITIVE-INFINITY");
  public static SubLSymbol SINGLE_FLOAT_NEGATIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("SINGLE-FLOAT-NEGATIVE-INFINITY");
  public static SubLSymbol DOUBLE_FLOAT_POSITIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-POSITIVE-INFINITY");
  public static SubLSymbol DOUBLE_FLOAT_NEGATIVE_INFINITY =
    PACKAGE_EXT.addExternalSymbol("DOUBLE-FLOAT-NEGATIVE-INFINITY");
  public static SubLSymbol STYLE_WARN =
    PACKAGE_EXT.addExternalSymbol("STYLE-WARN");
  public static SubLSymbol MEMQ =
    PACKAGE_EXT.addExternalSymbol("MEMQ");
  public static SubLSymbol MEMQL =
    PACKAGE_EXT.addExternalSymbol("MEMQL");
  public static SubLSymbol NIL_VECTOR =
    PACKAGE_EXT.addExternalSymbol("NIL-VECTOR");
  public static SubLSymbol COMPILER_ERROR =
    PACKAGE_EXT.addExternalSymbol("COMPILER-ERROR");
  public static SubLSymbol COMPILER_UNSUPPORTED_FEATURE_ERROR =
    PACKAGE_EXT.addExternalSymbol("COMPILER-UNSUPPORTED-FEATURE-ERROR");
  public static SubLSymbol MAILBOX =
    PACKAGE_EXT.addExternalSymbol("MAILBOX");
  public static SubLSymbol MUTEX =
    PACKAGE_EXT.addExternalSymbol("MUTEX");
  public static SubLSymbol THREAD =
    PACKAGE_EXT.addExternalSymbol("THREAD");
  public static SubLSymbol SUPPRESS_COMPILER_WARNINGS =
    PACKAGE_EXT.addExternalSymbol("*SUPPRESS-COMPILER-WARNINGS*");
  public static SubLSymbol NEQ =
    PACKAGE_EXT.addExternalSymbol("NEQ");
  public static SubLSymbol ADJOIN_EQL =
    PACKAGE_EXT.addExternalSymbol("ADJOIN-EQL");
  public static SubLSymbol CHARACTER_DESIGNATOR =
    PACKAGE_EXT.addExternalSymbol("CHARACTER-DESIGNATOR");
  public static SubLSymbol INTERRUPT_LISP =
    PACKAGE_EXT.addExternalSymbol("INTERRUPT-LISP");
  public static SubLSymbol GETENV =
    PACKAGE_EXT.addExternalSymbol("GETENV");
  public static SubLSymbol MACROEXPAND_ALL =
    PACKAGE_EXT.addExternalSymbol("MACROEXPAND-ALL");
  public static SubLSymbol LOAD_TRUENAME_FASL =
    PACKAGE_EXT.addExternalSymbol("*LOAD-TRUENAME-FASL*");
  public static SubLSymbol SLIME_INPUT_STREAM =
    PACKAGE_EXT.addExternalSymbol("SLIME-INPUT-STREAM");
  public static SubLSymbol SLIME_OUTPUT_STREAM =
    PACKAGE_EXT.addExternalSymbol("SLIME-OUTPUT-STREAM");

  // MOP.
  public static SubLSymbol STANDARD_READER_METHOD =
    PACKAGE_MOP.addExternalSymbol("STANDARD-READER-METHOD");

  // Java interface.
  public static SubLSymbol JAVA_EXCEPTION =
    PACKAGE_JAVA.addExternalSymbol("JAVA-EXCEPTION");
  public static SubLSymbol JAVA_EXCEPTION_CAUSE =
    PACKAGE_JAVA.addExternalSymbol("JAVA-EXCEPTION-CAUSE");
  public static SubLSymbol JAVA_OBJECT =
    PACKAGE_JAVA.addExternalSymbol("JAVA-OBJECT");
  public static SubLSymbol JAVA_CLASS =
	    PACKAGE_JAVA.addExternalSymbol("JAVA-CLASS");
  public static SubLSymbol JCALL =
    PACKAGE_JAVA.addExternalSymbol("JCALL");
  public static SubLSymbol JCALL_RAW =
    PACKAGE_JAVA.addExternalSymbol("JCALL-RAW");
  public static SubLSymbol JCLASS =
    PACKAGE_JAVA.addExternalSymbol("JCLASS");
  public static SubLSymbol JCLASS_NAME =
    PACKAGE_JAVA.addExternalSymbol("JCLASS-NAME");
  public static SubLSymbol JCLASS_OF =
    PACKAGE_JAVA.addExternalSymbol("JCLASS-OF");
  public static SubLSymbol JMETHOD_RETURN_TYPE =
    PACKAGE_JAVA.addExternalSymbol("JMETHOD-RETURN-TYPE");

  // External symbols in SYSTEM package.
  public static SubLSymbol _ENABLE_AUTOCOMPILE_ =
    PACKAGE_SYS.addExternalSymbol("*ENABLE-AUTOCOMPILE*");
  public static SubLSymbol AUTOCOMPILE =
    PACKAGE_SYS.addExternalSymbol("AUTOCOMPILE");
  public static SubLSymbol ENVIRONMENT =
    PACKAGE_SYS.addExternalSymbol("ENVIRONMENT");
  public static SubLSymbol FORWARD_REFERENCED_CLASS =
    PACKAGE_SYS.addExternalSymbol("FORWARD-REFERENCED-CLASS");
  public static SubLSymbol CLASS_BYTES =
    PACKAGE_SYS.addExternalSymbol("CLASS-BYTES");
  public static SubLSymbol _CLASS_SLOTS =
    PACKAGE_SYS.addExternalSymbol("%CLASS-SLOTS");
  public static SubLSymbol LAYOUT =
    PACKAGE_SYS.addExternalSymbol("LAYOUT");
  public static SubLSymbol NAMED_LAMBDA =
    PACKAGE_SYS.addExternalSymbol("NAMED-LAMBDA");
  public static SubLSymbol OUTPUT_OBJECT =
    PACKAGE_SYS.addExternalSymbol("OUTPUT-OBJECT");
  public static SubLSymbol SET_CLASS_SLOTS =
    PACKAGE_SYS.addExternalSymbol("SET-CLASS-SLOTS");
  public static SubLSymbol SETF_FUNCTION =
    PACKAGE_SYS.addExternalSymbol("SETF-FUNCTION");
  public static SubLSymbol SETF_INVERSE =
    PACKAGE_SYS.addExternalSymbol("SETF-INVERSE");
  public static SubLSymbol SLOT_DEFINITION =
    PACKAGE_SYS.addExternalSymbol("SLOT-DEFINITION");
  public static SubLSymbol _SLOT_DEFINITION_NAME =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-NAME");
  public static SubLSymbol _SLOT_DEFINITION_INITARGS =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-INITARGS");
  public static SubLSymbol _SLOT_DEFINITION_INITFUNCTION =
    PACKAGE_SYS.addExternalSymbol("%SLOT-DEFINITION-INITFUNCTION");
  public static SubLSymbol _DOCUMENTATION =
    PACKAGE_SYS.addExternalSymbol("%DOCUMENTATION");
  public static SubLSymbol STD_SLOT_BOUNDP =
    PACKAGE_SYS.addExternalSymbol("STD-SLOT-BOUNDP");
  public static SubLSymbol STD_SLOT_VALUE =
    PACKAGE_SYS.addExternalSymbol("STD-SLOT-VALUE");
  public static SubLSymbol SET_STD_SLOT_VALUE =
    PACKAGE_SYS.addExternalSymbol("SET-STD-SLOT-VALUE");
  public static SubLSymbol SUBCLASSP =
    PACKAGE_SYS.addExternalSymbol("SUBCLASSP");
  public static SubLSymbol GETHASH1 =
    PACKAGE_SYS.addExternalSymbol("GETHASH1");
  public static SubLSymbol PUTHASH =
    PACKAGE_SYS.addExternalSymbol("PUTHASH");
  public static SubLSymbol UNDEFINED_FUNCTION_CALLED =
    PACKAGE_SYS.addExternalSymbol("UNDEFINED-FUNCTION-CALLED");
  public static SubLSymbol SET_CHAR =
    PACKAGE_SYS.addExternalSymbol("SET-CHAR");
  public static SubLSymbol SET_SCHAR =
    PACKAGE_SYS.addExternalSymbol("SET-SCHAR");

  // Internal symbols in SYSTEM package.
  public static SubLSymbol BACKQUOTE_MACRO =
    PACKAGE_SYS.addInternalSymbol("BACKQUOTE-MACRO");
  public static SubLSymbol CASE_FROB_STREAM =
    PACKAGE_SYS.addInternalSymbol("CASE-FROB-STREAM");
  public static SubLSymbol CAUSE =
    PACKAGE_SYS.addInternalSymbol("CAUSE");
  public static SubLSymbol COMMA_MACRO =
    PACKAGE_SYS.addInternalSymbol("COMMA-MACRO");
  public static SubLSymbol DATUM =
    PACKAGE_SYS.addInternalSymbol("DATUM");
  public static SubLSymbol DEFTYPE_DEFINITION =
    PACKAGE_SYS.addInternalSymbol("DEFTYPE-DEFINITION");
  public static SubLSymbol EXPECTED_TYPE =
    PACKAGE_SYS.addInternalSymbol("EXPECTED-TYPE");
  public static SubLSymbol FORMAT_ARGUMENTS =
    PACKAGE_SYS.addInternalSymbol("FORMAT-ARGUMENTS");
  public static SubLSymbol FORMAT_CONTROL =
    PACKAGE_SYS.addInternalSymbol("FORMAT-CONTROL");
  public static SubLSymbol FSET =
    PACKAGE_SYS.addInternalSymbol("FSET");
  public static SubLSymbol FUNCTION_PRELOAD =
    PACKAGE_SYS.addInternalSymbol("FUNCTION-PRELOAD");
  public static SubLSymbol INSTANCE =
    PACKAGE_SYS.addInternalSymbol("INSTANCE");
  public static SubLSymbol MACROEXPAND_MACRO =
    PACKAGE_SYS.addInternalSymbol("MACROEXPAND-MACRO");
  public static SubLSymbol MAKE_FUNCTION_PRELOADING_CONTEXT =
    PACKAGE_SYS.addInternalSymbol("MAKE-FUNCTION-PRELOADING-CONTEXT");
  public static SubLSymbol NAME =
    PACKAGE_SYS.addInternalSymbol("NAME");
  public static SubLSymbol OBJECT =
    PACKAGE_SYS.addInternalSymbol("OBJECT");
  public static SubLSymbol OPERANDS =
    PACKAGE_SYS.addInternalSymbol("OPERANDS");
  public static SubLSymbol OPERATION =
    PACKAGE_SYS.addInternalSymbol("OPERATION");
  public static SubLSymbol PROXY_PRELOADED_FUNCTION =
    PACKAGE_SYS.addInternalSymbol("PROXY-PRELOADED-FUNCTION");
  public static SubLSymbol _SOURCE =
    PACKAGE_SYS.addInternalSymbol("%SOURCE");
  public static SubLSymbol SOCKET_STREAM =
    PACKAGE_SYS.addInternalSymbol("SOCKET-STREAM");
  public static SubLSymbol STRING_INPUT_STREAM =
    PACKAGE_SYS.addInternalSymbol("STRING-INPUT-STREAM");
  public static SubLSymbol STRING_OUTPUT_STREAM =
    PACKAGE_SYS.addInternalSymbol("STRING-OUTPUT-STREAM");
  public static SubLSymbol SYSTEM_STREAM =
    PACKAGE_SYS.addInternalSymbol("SYSTEM-STREAM");
  public static SubLSymbol STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("STACK-FRAME");
  public static SubLSymbol LISP_STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("LISP-STACK-FRAME");
  public static SubLSymbol JAVA_STACK_FRAME =
    PACKAGE_SYS.addInternalSymbol("JAVA-STACK-FRAME");

  // CDR6
  public static SubLSymbol _INSPECTOR_HOOK_ =
    PACKAGE_EXT.addExternalSymbol("*INSPECTOR-HOOK*");

  public static SubLSymbol COMPILER_LET=
    PACKAGE_LISP.addExternalSymbol("COMPILER-LET");
}
