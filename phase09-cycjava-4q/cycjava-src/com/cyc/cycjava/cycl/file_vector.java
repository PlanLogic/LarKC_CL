package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_vector extends SubLTranslatedFile
{
    public static final SubLFile me = new file_vector();
    public static final String myName = "com.cyc.cycjava.cycl.file_vector";
    public static final String myFingerPrint = "919d8aec2e2bd23ef0fcb67835d72ee80b26c98a28299f76efa22b0e8bed648c";
    public static SubLSymbol $dtp_fvector$ = null;
    public static SubLSymbol $default_file_vector_data_stream_buffer_size$ = null;
    public static SubLSymbol $default_file_vector_index_stream_buffer_size$ = null;
    public static SubLSymbol $max_4byte_integer$ = null;
    public static SubLSymbol $max_8byte_integer$ = null;
    public static SubLSymbol $memory_map_chunk_size$ = null;
    private static final SubLSymbol $sym0$FVECTOR = SubLObjectFactory.makeSymbol("FVECTOR");
    private static final SubLSymbol $sym1$FVECTOR_P = SubLObjectFactory.makeSymbol("FVECTOR-P");
    private static final SubLList $list2 = ConsesLow.list(SubLObjectFactory.makeSymbol("DATA-STREAM"), SubLObjectFactory.makeSymbol("INDEX-STREAM"), SubLObjectFactory.makeSymbol("WIDE-MARK"));
    private static final SubLList $list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("DATA-STREAM"), SubLObjectFactory.makeKeyword("INDEX-STREAM"), SubLObjectFactory.makeKeyword("WIDE-MARK"));
    private static final SubLList $list4 = ConsesLow.list(SubLObjectFactory.makeSymbol("FVECTOR-DATA-STREAM"), SubLObjectFactory.makeSymbol("FVECTOR-INDEX-STREAM"), SubLObjectFactory.makeSymbol("FVECTOR-WIDE-MARK"));
    private static final SubLList $list5 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-DATA-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-INDEX-STREAM"), SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-WIDE-MARK"));
    private static final SubLSymbol $sym6$PRINT_FVECTOR = SubLObjectFactory.makeSymbol("PRINT-FVECTOR");
    private static final SubLSymbol $sym7$FVECTOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FVECTOR-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("FVECTOR-P"));
    private static final SubLSymbol $sym9$FVECTOR_DATA_STREAM = SubLObjectFactory.makeSymbol("FVECTOR-DATA-STREAM");
    private static final SubLSymbol $sym10$_CSETF_FVECTOR_DATA_STREAM = SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-DATA-STREAM");
    private static final SubLSymbol $sym11$FVECTOR_INDEX_STREAM = SubLObjectFactory.makeSymbol("FVECTOR-INDEX-STREAM");
    private static final SubLSymbol $sym12$_CSETF_FVECTOR_INDEX_STREAM = SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-INDEX-STREAM");
    private static final SubLSymbol $sym13$FVECTOR_WIDE_MARK = SubLObjectFactory.makeSymbol("FVECTOR-WIDE-MARK");
    private static final SubLSymbol $sym14$_CSETF_FVECTOR_WIDE_MARK = SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-WIDE-MARK");
    private static final SubLSymbol $kw15$DATA_STREAM = SubLObjectFactory.makeKeyword("DATA-STREAM");
    private static final SubLSymbol $kw16$INDEX_STREAM = SubLObjectFactory.makeKeyword("INDEX-STREAM");
    private static final SubLSymbol $kw17$WIDE_MARK = SubLObjectFactory.makeKeyword("WIDE-MARK");
    private static final SubLString $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
    private static final SubLSymbol $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
    private static final SubLSymbol $sym20$MAKE_FVECTOR = SubLObjectFactory.makeSymbol("MAKE-FVECTOR");
    private static final SubLSymbol $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
    private static final SubLSymbol $kw22$END = SubLObjectFactory.makeKeyword("END");
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_FVECTOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FVECTOR-METHOD");
    private static final SubLString $str24$_wide__ = SubLObjectFactory.makeString("(wide) ");
    private static final SubLString $str25$Data__ = SubLObjectFactory.makeString("Data: ");
    private static final SubLString $str26$_Index__ = SubLObjectFactory.makeString(" Index: ");
    private static final SubLInteger $int27$1024 = SubLObjectFactory.makeInteger(1024);
    private static final SubLInteger $int28$256 = SubLObjectFactory.makeInteger(256);
    private static final SubLSymbol $kw29$INPUT = SubLObjectFactory.makeKeyword("INPUT");
    private static final SubLString $str30$Invalid_data_filename__A_ = SubLObjectFactory.makeString("Invalid data filename ~A.");
    private static final SubLString $str31$Invalid_index_filename__A_ = SubLObjectFactory.makeString("Invalid index filename ~A.");
    private static final SubLSymbol $kw32$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
    private static final SubLSymbol $kw33$IO = SubLObjectFactory.makeKeyword("IO");
    private static final SubLSymbol $kw34$IF_EXISTS = SubLObjectFactory.makeKeyword("IF-EXISTS");
    private static final SubLSymbol $kw35$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
    private static final SubLSymbol $kw36$IF_DOES_NOT_EXIST = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
    private static final SubLSymbol $kw37$ERROR = SubLObjectFactory.makeKeyword("ERROR");
    private static final SubLSymbol $kw38$ELEMENT_TYPE = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
    private static final SubLSymbol $kw39$BINARY = SubLObjectFactory.makeKeyword("BINARY");
    private static final SubLSymbol $sym40$FILE_VECTOR_P = SubLObjectFactory.makeSymbol("FILE-VECTOR-P");
    private static final SubLString $str41$Cannot_clone__A__This_method_is_c = SubLObjectFactory.makeString("Cannot clone ~A: This method is currently not implemented.");
    private static final SubLString $str42$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    private static final SubLSymbol $sym43$FVECTOR_RAW_BYTE_SIZE_TO_LENGTH = SubLObjectFactory.makeSymbol("FVECTOR-RAW-BYTE-SIZE-TO-LENGTH");
    private static final SubLSymbol $kw44$TEST = SubLObjectFactory.makeKeyword("TEST");
    private static final SubLSymbol $kw45$OWNER = SubLObjectFactory.makeKeyword("OWNER");
    private static final SubLSymbol $kw46$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
    private static final SubLSymbol $kw47$KB = SubLObjectFactory.makeKeyword("KB");
    private static final SubLSymbol $kw48$TINY = SubLObjectFactory.makeKeyword("TINY");
    private static final SubLSymbol $kw49$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
    private static final SubLList $list50;
    private static final SubLInteger $int51$4294967295 = SubLObjectFactory.makeInteger("4294967295");
    private static final SubLInteger $int52$18446744073709551615 = SubLObjectFactory.makeInteger("18446744073709551615");
    private static final SubLString $str53$Invalid_state_transition____FILE_ = SubLObjectFactory.makeString("Invalid state transition -- FILE-VECTOR ~A is neither wide nor narrow?");
    private static final SubLSymbol $sym54$WIDE_FVECTOR_INDEX_TO_FILE_POSITION = SubLObjectFactory.makeSymbol("WIDE-FVECTOR-INDEX-TO-FILE-POSITION");
    private static final SubLList $list55;
    private static final SubLList $list56 = ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("INDEX-SPOT"), SubLObjectFactory.makeSymbol("DATA-SPOT"));
    private static final SubLList $list57 = ConsesLow.list(SubLObjectFactory.makeKeyword("INDEX-SPOT"), SubLObjectFactory.makeKeyword("DATA-SPOT"));
    private static final SubLSymbol $kw58$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
    private static final SubLSymbol $kw59$INDEX_SPOT = SubLObjectFactory.makeKeyword("INDEX-SPOT");
    private static final SubLSymbol $kw60$DATA_SPOT = SubLObjectFactory.makeKeyword("DATA-SPOT");
    private static final SubLList $list61 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FVECTOR"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("INDEX")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym62$MEMENTO = SubLObjectFactory.makeUninternedSymbol("MEMENTO");
    private static final SubLSymbol $sym63$CLET = SubLObjectFactory.makeSymbol("CLET");
    private static final SubLSymbol $sym64$BEGIN_FILE_VECTOR_EXCURSION = SubLObjectFactory.makeSymbol("BEGIN-FILE-VECTOR-EXCURSION");
    private static final SubLSymbol $sym65$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
    private static final SubLSymbol $sym66$PROGN = SubLObjectFactory.makeSymbol("PROGN");
    private static final SubLSymbol $sym67$END_FILE_VECTOR_EXCURSION = SubLObjectFactory.makeSymbol("END-FILE-VECTOR-EXCURSION");
    private static final SubLList $list68 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FVECTOR"), SubLObjectFactory.makeSymbol("DATA-FILE"), SubLObjectFactory.makeSymbol("INDEX-FILE")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym69$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    private static final SubLSymbol $sym70$NEW_FILE_VECTOR = SubLObjectFactory.makeSymbol("NEW-FILE-VECTOR");
    private static final SubLList $list71 = ConsesLow.list(SubLObjectFactory.makeKeyword("OUTPUT"), SubLObjectFactory.makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"), SubLObjectFactory.makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"));
    private static final SubLSymbol $sym72$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
    private static final SubLSymbol $sym73$CLOSE_FILE_VECTOR = SubLObjectFactory.makeSymbol("CLOSE-FILE-VECTOR");
    private static final SubLList $list74 = ConsesLow.list(SubLObjectFactory.makeKeyword("INPUT"));
    private static final SubLSymbol $sym75$FVECTOR_INDEX_ITERATOR_DONE = SubLObjectFactory.makeSymbol("FVECTOR-INDEX-ITERATOR-DONE");
    private static final SubLSymbol $sym76$FVECTOR_INDEX_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FVECTOR-INDEX-ITERATOR-NEXT");
    private static final SubLList $list77 = ConsesLow.list(SubLObjectFactory.makeSymbol("FVECTOR"), SubLObjectFactory.makeSymbol("CURRENT"), SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("TUPLE"));
    private static final SubLSymbol $sym78$GATHER_FILE_VECTOR_STATISTICS_FOR_FILENAMES = SubLObjectFactory.makeSymbol("GATHER-FILE-VECTOR-STATISTICS-FOR-FILENAMES");
    private static final SubLSymbol $kw79$ENABLE_MEMORY_MAPPING = SubLObjectFactory.makeKeyword("ENABLE-MEMORY-MAPPING");
    private static final SubLSymbol $sym80$GATHER_FILE_VECTOR_STATISTICS = SubLObjectFactory.makeSymbol("GATHER-FILE-VECTOR-STATISTICS");
    private static final SubLSymbol $kw81$INDEX_ENTRIES = SubLObjectFactory.makeKeyword("INDEX-ENTRIES");
    private static final SubLSymbol $kw82$DATA_BYTES = SubLObjectFactory.makeKeyword("DATA-BYTES");
    private static final SubLList $list83 = ConsesLow.list(SubLObjectFactory.makeKeyword("REVERSAL"), SubLObjectFactory.makeKeyword("TOMBSTONE"));
    private static final SubLSymbol $kw84$TOMBSTONE = SubLObjectFactory.makeKeyword("TOMBSTONE");
    private static final SubLSymbol $kw85$REVERSAL = SubLObjectFactory.makeKeyword("REVERSAL");
    private static final SubLSymbol $sym86$FILE_VECTOR_STATS_INDICATE_DENSE_INDEX_SPACE_ = SubLObjectFactory.makeSymbol("FILE-VECTOR-STATS-INDICATE-DENSE-INDEX-SPACE?");
    private static final SubLSymbol $sym87$FILE_VECTOR_MEMORY_MAP_FOR_FILES = SubLObjectFactory.makeSymbol("FILE-VECTOR-MEMORY-MAP-FOR-FILES");
    private static final SubLInteger $int88$1000000 = SubLObjectFactory.makeInteger(0xf4240);
    private static final SubLSymbol $sym89$FILE_VECTOR_MEMORY_MAP = SubLObjectFactory.makeSymbol("FILE-VECTOR-MEMORY-MAP");
    private static final SubLSymbol $kw90$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
    private static final SubLList $list91 = ConsesLow.cons(SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("ADDRESS"));
    private static final SubLSymbol $sym92$FVECT_MEM_MAP_ = SubLObjectFactory.makeSymbol("FVECT-MEM-MAP<");
    private static final SubLList $list93 = ConsesLow.cons(SubLObjectFactory.makeSymbol("ADDRESS"), SubLObjectFactory.makeSymbol("INDEX"));
    private static final SubLList $list94 = ConsesLow.cons(SubLObjectFactory.makeSymbol("ADDRESS-A"), SubLObjectFactory.makeSymbol("INDEX-A"));
    private static final SubLList $list95 = ConsesLow.cons(SubLObjectFactory.makeSymbol("ADDRESS-B"), SubLObjectFactory.makeSymbol("INDEX-B"));
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
    private static final SubLString $str98$Data_Address__A_is_past_the_end_o = SubLObjectFactory.makeString("Data Address ~A is past the end of the data stream (~A) of ~A.");
    private static final SubLString $str99$After__A_iterations__we_did_not_q = SubLObjectFactory.makeString("After ~A iterations, we did not quiesce when searching for ~A in [0,~A)");
    private static final SubLString $str100$Whoa___A_is_neither______or___to_ = SubLObjectFactory.makeString("Whoa, ~A is neither <, > or = to ~A???");
    private static final SubLString $str101$Widening_ = SubLObjectFactory.makeString("Widening ");
    private static final SubLString $str102$_entries_in_at_index_ = SubLObjectFactory.makeString(" entries in at index ");
    private static final SubLString $str103$_to_ = SubLObjectFactory.makeString(" to ");
    private static final SubLString $str104$____ = SubLObjectFactory.makeString(" ...");
    private static final SubLString $str105$_entries_absolutely_in_ = SubLObjectFactory.makeString(" entries absolutely in ");
    private static final SubLSymbol $sym106$RECOVER_NARROW_FILE_VECTOR_INDEX = SubLObjectFactory.makeSymbol("RECOVER-NARROW-FILE-VECTOR-INDEX");
    private static final SubLString $str107$_entries_from_ = SubLObjectFactory.makeString(" entries from ");
    private static final SubLString $str108$_____ = SubLObjectFactory.makeString(" ....");
    private static final SubLInteger $int109$32 = SubLObjectFactory.makeInteger(32);
    private static final SubLString $str110$Writing_wide_mark_ = SubLObjectFactory.makeString("Writing wide-mark ");
    private static final SubLSymbol $sym111$RECOVER_WIDE_FILE_VECTOR_MARK = SubLObjectFactory.makeSymbol("RECOVER-WIDE-FILE-VECTOR-MARK");
    private static final SubLSymbol $sym112$TEST_FILE_VECTOR_WRITING_AND_POSITIONING = SubLObjectFactory.makeSymbol("TEST-FILE-VECTOR-WRITING-AND-POSITIONING");
    private static final SubLList $list113;
    private static final SubLString $str114$_tmp_ = SubLObjectFactory.makeString("/tmp/");
    private static final SubLSymbol $kw115$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
    private static final SubLSymbol $sym116$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    private static final SubLSymbol $sym117$TEST_WIDE_FILE_VECTOR_WRITING_AND_POSITIONING = SubLObjectFactory.makeSymbol("TEST-WIDE-FILE-VECTOR-WRITING-AND-POSITIONING");
    private static final SubLList $list118;
    private static final SubLString $str119$A__A_entry_file_with_a_wide_mark_ = SubLObjectFactory.makeString("A ~A entry file with a wide-mark at ~A should be ~A bytes long, not ~A bytes.");
    private static final SubLString $str120$The_index_file_should_be_have_a_l = SubLObjectFactory.makeString("The index file should be have a length of ~A, not of ~A.");
    private static final SubLString $str121$We_are_loading_a_wide_file_vector = SubLObjectFactory.makeString("We are loading a wide file vector but it looks narrow?");
    private static final SubLString $str122$We_expected_a_wide_mark_of__A_but = SubLObjectFactory.makeString("We expected a wide mark of ~A but got ~A instead.");
    private static final SubLString $str123$The_next_index_is_supposed_to_be_ = SubLObjectFactory.makeString("The next index is supposed to be ~A, but it is ~A.");
    private static final SubLString $str124$Position_ = SubLObjectFactory.makeString("Position ");
    private static final SubLString $str125$On_step___A__the_iteration_result = SubLObjectFactory.makeString("On step #~A, the iteration result was no longer valid.");
    private static final SubLList $list126 = ConsesLow.cons(SubLObjectFactory.makeSymbol("ACTUAL-INDEX"), SubLObjectFactory.makeSymbol("ACTUAL-ADDRESS"));
    private static final SubLString $str127$The_expected_index__A_was_____act = SubLObjectFactory.makeString("The expected index ~A was =/= actual index ~A.");
    private static final SubLString $str128$The_expected_address__A_was_____a = SubLObjectFactory.makeString("The expected address ~A was =/= actual address ~A.");
//    static final boolean assertionsDisabledInClass = !com/cyc/cycjava/cycl/file_vector.desiredAssertionStatus();

    static 
    {
        $list50 = ConsesLow.list(ConsesLow.list(ConsesLow.list(FOUR_INTEGER), ONE_INTEGER), ConsesLow.list(ConsesLow.list(EIGHT_INTEGER), TWO_INTEGER), ConsesLow.list(ConsesLow.list(TWELVE_INTEGER), THREE_INTEGER), ConsesLow.list(ConsesLow.list(SIXTEEN_INTEGER), FOUR_INTEGER), ConsesLow.list(ConsesLow.list(FOUR_INTEGER, TWO_INTEGER), ONE_INTEGER), ConsesLow.list(ConsesLow.list(EIGHT_INTEGER, TWO_INTEGER), TWO_INTEGER), ConsesLow.list(ConsesLow.list(SIXTEEN_INTEGER, TWO_INTEGER), THREE_INTEGER), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(24), TWO_INTEGER), FOUR_INTEGER));
        $list55 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ZERO_INTEGER, TWO_INTEGER), ZERO_INTEGER), ConsesLow.list(ConsesLow.list(ONE_INTEGER, TWO_INTEGER), FOUR_INTEGER), ConsesLow.list(ConsesLow.list(TWO_INTEGER, TWO_INTEGER), EIGHT_INTEGER), ConsesLow.list(ConsesLow.list(THREE_INTEGER, TWO_INTEGER), SIXTEEN_INTEGER), ConsesLow.list(ConsesLow.list(FOUR_INTEGER, TWO_INTEGER), SubLObjectFactory.makeInteger(24)));
        $list96 = ConsesLow.list(ConsesLow.list(ConsesLow.list(NIL, NIL), T), ConsesLow.list(ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeInteger(62), ZERO_INTEGER), NIL), T), ConsesLow.list(ConsesLow.list(NIL, ConsesLow.cons(SubLObjectFactory.makeInteger(62), ZERO_INTEGER)), NIL), ConsesLow.list(ConsesLow.list(ConsesLow.cons(ZERO_INTEGER, ONE_INTEGER), ConsesLow.cons(ZERO_INTEGER, TWO_INTEGER)), T), ConsesLow.list(ConsesLow.list(ConsesLow.cons(ZERO_INTEGER, THREE_INTEGER), ConsesLow.cons(ZERO_INTEGER, TWO_INTEGER)), NIL), ConsesLow.list(ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeInteger(80), THREE_INTEGER), ConsesLow.cons(SubLObjectFactory.makeInteger(90), FOUR_INTEGER)), T), ConsesLow.list(ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeInteger(90), FOUR_INTEGER), ConsesLow.cons(SubLObjectFactory.makeInteger(80), THREE_INTEGER)), NIL));
        $list113 = ConsesLow.list(ConsesLow.list(ConsesLow.list(TEN_INTEGER), TEN_INTEGER), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(23)), SubLObjectFactory.makeInteger(23)));
        $list118 = ConsesLow.list(ConsesLow.list(ConsesLow.list(TEN_INTEGER, FIVE_INTEGER), TEN_INTEGER), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(23), TEN_INTEGER), SubLObjectFactory.makeInteger(23)), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(25), ZERO_INTEGER), SubLObjectFactory.makeInteger(25)));
    }


    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject fvector_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fvector(v_object, stream, (SubLObject)file_vector.ZERO_INTEGER);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject fvector_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fvector_native.class) ? file_vector.T : file_vector.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject fvector_data_stream(final SubLObject v_object) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject fvector_index_stream(final SubLObject v_object) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject fvector_wide_mark(final SubLObject v_object) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject _csetf_fvector_data_stream(final SubLObject v_object, final SubLObject value) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject _csetf_fvector_index_stream(final SubLObject v_object, final SubLObject value) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject _csetf_fvector_wide_mark(final SubLObject v_object, final SubLObject value) {
        assert file_vector.NIL != fvector_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject make_fvector(SubLObject arglist) {
        if (arglist == file_vector.UNPROVIDED) {
            arglist = (SubLObject)file_vector.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fvector_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_vector.NIL, next = arglist; file_vector.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_vector.$kw15$DATA_STREAM)) {
                _csetf_fvector_data_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_vector.$kw16$INDEX_STREAM)) {
                _csetf_fvector_index_stream(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_vector.$kw17$WIDE_MARK)) {
                _csetf_fvector_wide_mark(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_vector.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject visit_defstruct_fvector(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector.$kw19$BEGIN, (SubLObject)file_vector.$sym20$MAKE_FVECTOR, (SubLObject)file_vector.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector.$kw21$SLOT, (SubLObject)file_vector.$kw15$DATA_STREAM, fvector_data_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector.$kw21$SLOT, (SubLObject)file_vector.$kw16$INDEX_STREAM, fvector_index_stream(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector.$kw21$SLOT, (SubLObject)file_vector.$kw17$WIDE_MARK, fvector_wide_mark(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector.$kw22$END, (SubLObject)file_vector.$sym20$MAKE_FVECTOR, (SubLObject)file_vector.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 2790L)
    public static SubLObject visit_defstruct_object_fvector_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fvector(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 3029L)
    public static SubLObject print_fvector(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)file_vector.T, (SubLObject)file_vector.T);
            if (file_vector.NIL != wide_file_vectorP(v_object)) {
                streams_high.write_string((SubLObject)file_vector.$str24$_wide__, stream, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)file_vector.$str25$Data__, stream, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
            print_high.princ(fvector_data_stream(v_object), stream);
            streams_high.write_string((SubLObject)file_vector.$str26$_Index__, stream, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
            print_high.princ(fvector_index_stream(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)file_vector.NIL, (SubLObject)file_vector.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 3414L)
    public static SubLObject new_fvector(final SubLObject data_stream, final SubLObject index_stream, SubLObject wide_mark) {
        if (wide_mark == file_vector.UNPROVIDED) {
            wide_mark = (SubLObject)file_vector.NIL;
        }
        final SubLObject fvector = make_fvector((SubLObject)file_vector.UNPROVIDED);
        _csetf_fvector_data_stream(fvector, data_stream);
        _csetf_fvector_index_stream(fvector, index_stream);
        _csetf_fvector_wide_mark(fvector, wide_mark);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 3707L)
    public static SubLObject get_file_vector_wide_mark(final SubLObject fvector) {
        return fvector_wide_mark(fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 3797L)
    public static SubLObject specify_file_vector_wide_mark(final SubLObject fvector, final SubLObject wide_mark) {
        _csetf_fvector_wide_mark(fvector, wide_mark);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 4065L)
    public static SubLObject file_vector_p(final SubLObject v_object) {
        return fvector_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 4471L)
    public static SubLObject new_file_vector(final SubLObject data_filename, final SubLObject index_filename, SubLObject direction, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
        if (direction == file_vector.UNPROVIDED) {
            direction = (SubLObject)file_vector.$kw29$INPUT;
        }
        if (data_stream_buffer_size == file_vector.UNPROVIDED) {
            data_stream_buffer_size = file_vector.$default_file_vector_data_stream_buffer_size$.getGlobalValue();
        }
        if (index_stream_buffer_size == file_vector.UNPROVIDED) {
            index_stream_buffer_size = file_vector.$default_file_vector_index_stream_buffer_size$.getGlobalValue();
        }
        if (enable_memory_mappingP == file_vector.UNPROVIDED) {
            enable_memory_mappingP = (SubLObject)file_vector.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data_stream = (SubLObject)file_vector.NIL;
        SubLObject index_stream = (SubLObject)file_vector.NIL;
        SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(data_stream_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            data_stream = compatibility.open_binary(data_filename, direction);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector.NIL == streams_high.open_stream_p(data_stream)) {
            Errors.error(Errors.error((SubLObject)file_vector.$str30$Invalid_data_filename__A_, data_filename));
        }
        _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(index_stream_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            index_stream = compatibility.open_binary(index_filename, direction);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector.NIL == streams_high.open_stream_p(index_stream)) {
            Errors.error(Errors.error((SubLObject)file_vector.$str31$Invalid_index_filename__A_, index_filename));
        }
        final SubLObject fv = create_file_vector(data_stream, index_stream);
        if (file_vector.NIL != enable_memory_mappingP) {
            file_vector_enable_memory_mapping(fv);
        }
        return fv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 5515L)
    public static SubLObject open_file_vector_for_rewrite(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
        if (data_stream_buffer_size == file_vector.UNPROVIDED) {
            data_stream_buffer_size = file_vector.$default_file_vector_data_stream_buffer_size$.getGlobalValue();
        }
        if (index_stream_buffer_size == file_vector.UNPROVIDED) {
            index_stream_buffer_size = file_vector.$default_file_vector_index_stream_buffer_size$.getGlobalValue();
        }
        if (enable_memory_mappingP == file_vector.UNPROVIDED) {
            enable_memory_mappingP = (SubLObject)file_vector.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data_stream = (SubLObject)file_vector.NIL;
        SubLObject index_stream = (SubLObject)file_vector.NIL;
        SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(data_stream_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            data_stream = StreamsLow.open(data_filename, new SubLObject[] { file_vector.$kw32$DIRECTION, file_vector.$kw33$IO, file_vector.$kw34$IF_EXISTS, file_vector.$kw35$OVERWRITE, file_vector.$kw36$IF_DOES_NOT_EXIST, file_vector.$kw37$ERROR, file_vector.$kw38$ELEMENT_TYPE, file_vector.$kw39$BINARY });
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector.NIL == streams_high.open_stream_p(data_stream)) {
            Errors.error(Errors.error((SubLObject)file_vector.$str30$Invalid_data_filename__A_, data_filename));
        }
        _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(index_stream_buffer_size, thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            index_stream = StreamsLow.open(index_filename, new SubLObject[] { file_vector.$kw32$DIRECTION, file_vector.$kw33$IO, file_vector.$kw34$IF_EXISTS, file_vector.$kw35$OVERWRITE, file_vector.$kw36$IF_DOES_NOT_EXIST, file_vector.$kw37$ERROR, file_vector.$kw38$ELEMENT_TYPE, file_vector.$kw39$BINARY });
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector.NIL == streams_high.open_stream_p(index_stream)) {
            Errors.error(Errors.error((SubLObject)file_vector.$str31$Invalid_index_filename__A_, index_filename));
        }
        final SubLObject fv = create_file_vector(data_stream, index_stream);
        if (file_vector.NIL != enable_memory_mappingP) {
            file_vector_enable_memory_mapping(fv);
        }
        final SubLObject wide_mark = possibly_load_file_vector_wide_mark(wide_mark_filename);
        if (file_vector.NIL != list_utilities.sublisp_boolean(wide_mark)) {
            specify_file_vector_wide_mark(fv, wide_mark);
        }
        return fv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 7135L)
    public static SubLObject open_file_vector_for_append(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
        if (data_stream_buffer_size == file_vector.UNPROVIDED) {
            data_stream_buffer_size = file_vector.$default_file_vector_data_stream_buffer_size$.getGlobalValue();
        }
        if (index_stream_buffer_size == file_vector.UNPROVIDED) {
            index_stream_buffer_size = file_vector.$default_file_vector_index_stream_buffer_size$.getGlobalValue();
        }
        if (enable_memory_mappingP == file_vector.UNPROVIDED) {
            enable_memory_mappingP = (SubLObject)file_vector.NIL;
        }
        final SubLObject v_file_vector = open_file_vector_for_rewrite(data_filename, index_filename, wide_mark_filename, data_stream_buffer_size, index_stream_buffer_size, enable_memory_mappingP);
        compatibility.set_file_position(get_file_vector_data_stream(v_file_vector), (SubLObject)file_vector.$kw22$END);
        compatibility.set_file_position(get_file_vector_index_stream(v_file_vector), (SubLObject)file_vector.$kw22$END);
        return v_file_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 8013L)
    public static SubLObject new_wide_input_file_vector(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
        if (data_stream_buffer_size == file_vector.UNPROVIDED) {
            data_stream_buffer_size = file_vector.$default_file_vector_data_stream_buffer_size$.getGlobalValue();
        }
        if (index_stream_buffer_size == file_vector.UNPROVIDED) {
            index_stream_buffer_size = file_vector.$default_file_vector_index_stream_buffer_size$.getGlobalValue();
        }
        if (enable_memory_mappingP == file_vector.UNPROVIDED) {
            enable_memory_mappingP = (SubLObject)file_vector.NIL;
        }
        final SubLObject wide_mark = possibly_load_file_vector_wide_mark(wide_mark_filename);
        final SubLObject fvector = new_file_vector(data_filename, index_filename, (SubLObject)file_vector.$kw29$INPUT, data_stream_buffer_size, index_stream_buffer_size, enable_memory_mappingP);
        if (file_vector.NIL != list_utilities.sublisp_boolean(wide_mark)) {
            specify_file_vector_wide_mark(fvector, wide_mark);
        }
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 8844L)
    public static SubLObject create_file_vector(final SubLObject data_stream, final SubLObject index_stream) {
        return new_fvector(data_stream, index_stream, (SubLObject)file_vector.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 9009L)
    public static SubLObject create_wide_file_vector(final SubLObject data_stream, final SubLObject index_stream, final SubLObject wide_mark) {
        return specify_file_vector_wide_mark(create_file_vector(data_stream, index_stream), wide_mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 9235L)
    public static SubLObject load_file_vector_wide_mark(final SubLObject wide_mark_filename) {
        final SubLObject wide_mark = cfasl_utilities.cfasl_load(wide_mark_filename);
        return wide_mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 9406L)
    public static SubLObject possibly_load_file_vector_wide_mark(final SubLObject wide_mark_filename) {
        if (file_vector.NIL != Filesys.probe_file(wide_mark_filename)) {
            return load_file_vector_wide_mark(wide_mark_filename);
        }
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 9595L)
    public static SubLObject save_file_vector_wide_mark(final SubLObject wide_mark, final SubLObject wide_mark_filename) {
        cfasl_utilities.cfasl_save_externalized(wide_mark, wide_mark_filename);
        return wide_mark;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 9811L)
    public static SubLObject persist_file_vector_wide_mark(final SubLObject fvector, final SubLObject wide_mark_filename) {
        enforceType(fvector, file_vector.$sym40$FILE_VECTOR_P);
        return save_file_vector_wide_mark(get_file_vector_wide_mark(fvector), wide_mark_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 10027L)
    public static SubLObject clone_file_vector(final SubLObject fvector) {
        return Errors.error((SubLObject)file_vector.$str41$Cannot_clone__A__This_method_is_c, fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 10386L)
    public static SubLObject close_file_vector(final SubLObject fvector) {
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        final SubLObject data_stream = fvector_data_stream(fvector);
        if (file_vector.NIL != streams_high.open_stream_p(data_stream)) {
            streams_high.close(data_stream, (SubLObject)file_vector.UNPROVIDED);
        }
        _csetf_fvector_data_stream(fvector, (SubLObject)file_vector.NIL);
        final SubLObject index_stream = fvector_index_stream(fvector);
        if (file_vector.NIL != streams_high.open_stream_p(index_stream)) {
            streams_high.close(index_stream, (SubLObject)file_vector.UNPROVIDED);
        }
        _csetf_fvector_index_stream(fvector, (SubLObject)file_vector.NIL);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 10897L)
    public static SubLObject file_vector_change_stream_buffer_sizes(final SubLObject v_file_vector, final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        _csetf_fvector_data_stream(v_file_vector, file_utilities.change_file_stream_buffer_size(fvector_data_stream(v_file_vector), data_stream_buffer_size));
        _csetf_fvector_index_stream(v_file_vector, file_utilities.change_file_stream_buffer_size(fvector_index_stream(v_file_vector), index_stream_buffer_size));
        return v_file_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 11331L)
    public static SubLObject file_vector_enable_memory_mapping(final SubLObject v_file_vector) {
        _csetf_fvector_data_stream(v_file_vector, file_utilities.enable_file_stream_memory_mapping(fvector_data_stream(v_file_vector)));
        _csetf_fvector_index_stream(v_file_vector, file_utilities.enable_file_stream_memory_mapping(fvector_index_stream(v_file_vector)));
        return v_file_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 11668L)
    public static SubLObject file_vector_memory_mappedP(final SubLObject v_file_vector) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector.NIL != file_utilities.file_stream_memory_mappedP(fvector_data_stream(v_file_vector)) && file_vector.NIL != file_utilities.file_stream_memory_mappedP(fvector_index_stream(v_file_vector)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 11883L)
    public static SubLObject get_file_vector_data_stream(final SubLObject fvector) {
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        return fvector_data_stream(fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 12063L)
    public static SubLObject get_file_vector_index_stream(final SubLObject fvector) {
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        return fvector_index_stream(fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 12250L)
    public static SubLObject wide_file_vectorP(final SubLObject fvector) {
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        return list_utilities.sublisp_boolean(get_file_vector_wide_mark(fvector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 12440L)
    public static SubLObject narrow_file_vectorP(final SubLObject fvector) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector.NIL == wide_file_vectorP(fvector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 12577L)
    public static SubLObject file_vector_length(final SubLObject fvector) {
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        return file_vector_length_from_index_stream(fvector_index_stream(fvector), get_file_vector_wide_mark(fvector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 12851L)
    public static SubLObject file_vector_length_from_index(final SubLObject index_filename) {
        return file_vector_length_from_index_int(index_filename, (SubLObject)file_vector.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 13075L)
    public static SubLObject wide_file_vector_length_from_index(final SubLObject index_filename, final SubLObject wide_mark_filename) {
        final SubLObject wide_mark = load_file_vector_wide_mark(wide_mark_filename);
        return file_vector_length_from_index_int(index_filename, wide_mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 13305L)
    public static SubLObject file_vector_length_from_index_int(final SubLObject index_filename, final SubLObject wide_mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector.NIL == Filesys.probe_file(index_filename)) {
            Errors.error((SubLObject)file_vector.$str31$Invalid_index_filename__A_, index_filename);
        }
        SubLObject length = (SubLObject)file_vector.NIL;
        SubLObject stream = (SubLObject)file_vector.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                stream = compatibility.open_binary(index_filename, (SubLObject)file_vector.$kw29$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, index_filename);
            }
            final SubLObject index_stream = stream;
            length = file_vector_length_from_index_stream(index_stream, wide_mark);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 13666L)
    public static SubLObject file_vector_length_from_index_stream(final SubLObject index_stream, final SubLObject wide_mark) {
        final SubLObject bytes = streams_high.file_length(index_stream);
        return fvector_raw_byte_size_to_length(bytes, wide_mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 13852L)
    public static SubLObject file_vector_data_size(final SubLObject fvector) {
        return file_vector_data_size_from_data_stream(fvector_data_stream(fvector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 14044L)
    public static SubLObject file_vector_data_size_from_filename(final SubLObject data_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector.NIL == Filesys.probe_file(data_filename)) {
            Errors.error((SubLObject)file_vector.$str30$Invalid_data_filename__A_, data_filename);
        }
        SubLObject length = (SubLObject)file_vector.NIL;
        SubLObject stream = (SubLObject)file_vector.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                stream = compatibility.open_binary(data_filename, (SubLObject)file_vector.$kw29$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, data_filename);
            }
            final SubLObject data_stream = stream;
            length = file_vector_data_size_from_data_stream(data_stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 14381L)
    public static SubLObject file_vector_data_size_from_data_stream(final SubLObject data_stream) {
        return streams_high.file_length(data_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 14488L)
    public static SubLObject file_vector_next_index(final SubLObject fvector) {
        return fvector_raw_byte_size_to_length(streams_high.file_position(fvector_index_stream(fvector), (SubLObject)file_vector.UNPROVIDED), get_file_vector_wide_mark(fvector));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 14853L)
    public static SubLObject fvector_raw_byte_size_to_length(final SubLObject bytes, SubLObject wide_mark) {
        if (wide_mark == file_vector.UNPROVIDED) {
            wide_mark = (SubLObject)file_vector.NIL;
        }
        if (file_vector.NIL == wide_mark) {
            return Numbers.integerDivide(bytes, (SubLObject)file_vector.FOUR_INTEGER);
        }
        final SubLObject bytes_of_narrow_part = Numbers.multiply(wide_mark, (SubLObject)file_vector.FOUR_INTEGER);
        if (bytes.numE(bytes_of_narrow_part)) {
            return wide_mark;
        }
        if (bytes.numL(bytes_of_narrow_part)) {
            return fvector_raw_byte_size_to_length(bytes, (SubLObject)file_vector.UNPROVIDED);
        }
        final SubLObject bytes_of_wide_part = Numbers.subtract(bytes, bytes_of_narrow_part);
        final SubLObject length_of_wide_part = Numbers.integerDivide(bytes_of_wide_part, (SubLObject)file_vector.EIGHT_INTEGER);
        return Numbers.add(wide_mark, length_of_wide_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 16237L)
    public static SubLObject position_file_vector(final SubLObject fvector, SubLObject index) {
        if (index == file_vector.UNPROVIDED) {
            index = (SubLObject)file_vector.NIL;
        }
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        final SubLObject data_stream = fvector_data_stream(fvector);
        final SubLObject data_address = read_file_vector_index_entry(fvector, index);
        compatibility.set_file_position(data_stream, data_address);
        return data_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 16865L)
    public static SubLObject position_file_vector_index_for_update(final SubLObject fvector, final SubLObject index) {
        final SubLObject address = read_file_vector_index_entry(fvector, index);
        position_file_vector_index(fvector, index);
        return address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 17327L)
    public static SubLObject position_file_vector_index(final SubLObject fvector, final SubLObject index) {
        final SubLObject index_stream = fvector_index_stream(fvector);
        SubLObject index_address = (SubLObject)file_vector.NIL;
        if (file_vector.NIL != narrow_file_vectorP(fvector)) {
            index_address = Numbers.multiply(index, (SubLObject)file_vector.FOUR_INTEGER);
        }
        else if (file_vector.NIL != wide_file_vectorP(fvector)) {
            final SubLObject wide_mark = get_file_vector_wide_mark(fvector);
            index_address = wide_fvector_index_to_file_position(index, wide_mark);
        }
        else {
            Errors.error((SubLObject)file_vector.$str53$Invalid_state_transition____FILE_, fvector);
        }
        compatibility.set_file_position(index_stream, index_address);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 18089L)
    public static SubLObject read_file_vector_index_entry(final SubLObject fvector, SubLObject index) {
        if (index == file_vector.UNPROVIDED) {
            index = (SubLObject)file_vector.NIL;
        }
        final SubLObject index_stream = fvector_index_stream(fvector);
        final SubLObject wide_mark = get_file_vector_wide_mark(fvector);
        SubLObject data_address = (SubLObject)file_vector.NIL;
        if (file_vector.NIL != subl_promotions.non_negative_integer_p(index)) {
            position_file_vector_index(fvector, index);
        }
        else if (file_vector.NIL != wide_file_vectorP(fvector)) {
            index = fvector_file_position_to_index(streams_high.file_position(index_stream, (SubLObject)file_vector.UNPROVIDED), wide_mark);
        }
        data_address = ((file_vector.NIL == wide_mark || file_vector.NIL == index || index.numL(wide_mark)) ? file_hash_table.read_fht_uint4(index_stream) : file_hash_table.read_fht_uint8(index_stream));
        return data_address;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 19106L)
    public static SubLObject wide_fvector_index_to_file_position(final SubLObject index, final SubLObject wide_mark) {
        if (index.numLE(wide_mark)) {
            return Numbers.multiply(index, (SubLObject)file_vector.FOUR_INTEGER);
        }
        final SubLObject narrow_part = Numbers.multiply(wide_mark, (SubLObject)file_vector.FOUR_INTEGER);
        final SubLObject nth_wide = Numbers.subtract(index, wide_mark);
        final SubLObject wide_part = Numbers.multiply(nth_wide, (SubLObject)file_vector.EIGHT_INTEGER);
        return Numbers.add(narrow_part, wide_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 19653L)
    public static SubLObject fvector_file_position_to_index(final SubLObject index, SubLObject wide_mark) {
        if (wide_mark == file_vector.UNPROVIDED) {
            wide_mark = (SubLObject)file_vector.NIL;
        }
        return fvector_raw_byte_size_to_length(index, wide_mark);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 19809L)
    public static SubLObject begin_file_vector_excursion(final SubLObject fvector, SubLObject index) {
        if (index == file_vector.UNPROVIDED) {
            index = (SubLObject)file_vector.NIL;
        }
        final SubLObject index_spot = compatibility.get_file_position(fvector_index_stream(fvector));
        final SubLObject data_spot = compatibility.get_file_position(fvector_data_stream(fvector));
        position_file_vector_index(fvector, index);
        return fvector_make_memento(index_spot, data_spot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 20901L)
    public static SubLObject end_file_vector_excursion(final SubLObject fvector, final SubLObject memento) {
        SubLObject allow_other_keys_p = (SubLObject)file_vector.NIL;
        SubLObject rest = memento;
        SubLObject bad = (SubLObject)file_vector.NIL;
        SubLObject current_$1 = (SubLObject)file_vector.NIL;
        while (file_vector.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, memento, (SubLObject)file_vector.$list56);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, memento, (SubLObject)file_vector.$list56);
            if (file_vector.NIL == conses_high.member(current_$1, (SubLObject)file_vector.$list57, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED)) {
                bad = (SubLObject)file_vector.T;
            }
            if (current_$1 == file_vector.$kw58$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_vector.NIL != bad && file_vector.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(memento, (SubLObject)file_vector.$list56);
        }
        final SubLObject index_spot_tail = cdestructuring_bind.property_list_member((SubLObject)file_vector.$kw59$INDEX_SPOT, memento);
        final SubLObject index_spot = (SubLObject)((file_vector.NIL != index_spot_tail) ? conses_high.cadr(index_spot_tail) : file_vector.NIL);
        final SubLObject data_spot_tail = cdestructuring_bind.property_list_member((SubLObject)file_vector.$kw60$DATA_SPOT, memento);
        final SubLObject data_spot = (SubLObject)((file_vector.NIL != data_spot_tail) ? conses_high.cadr(data_spot_tail) : file_vector.NIL);
        compatibility.set_file_position(fvector_index_stream(fvector), index_spot);
        compatibility.set_file_position(fvector_data_stream(fvector), data_spot);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 21255L)
    public static SubLObject fvector_make_memento(final SubLObject index_spot, final SubLObject data_spot) {
        return (SubLObject)ConsesLow.list((SubLObject)file_vector.$kw59$INDEX_SPOT, index_spot, (SubLObject)file_vector.$kw60$DATA_SPOT, data_spot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 21415L)
    public static SubLObject with_file_vector_excursion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fvector = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list61);
        fvector = current.first();
        current = current.rest();
        final SubLObject index = (SubLObject)(current.isCons() ? current.first() : file_vector.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)file_vector.$list61);
        current = current.rest();
        if (file_vector.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject memento = (SubLObject)file_vector.$sym62$MEMENTO;
            return (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym63$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(memento, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym64$BEGIN_FILE_VECTOR_EXCURSION, fvector, index))), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym65$CUNWIND_PROTECT, reader.bq_cons((SubLObject)file_vector.$sym66$PROGN, ConsesLow.append(body, (SubLObject)file_vector.NIL)), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym67$END_FILE_VECTOR_EXCURSION, fvector, memento)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector.$list61);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 21824L)
    public static SubLObject with_output_to_file_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fvector = (SubLObject)file_vector.NIL;
        SubLObject data_file = (SubLObject)file_vector.NIL;
        SubLObject index_file = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        fvector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        data_file = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        index_file = current.first();
        current = current.rest();
        if (file_vector.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym63$CLET, (SubLObject)ConsesLow.list(fvector), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym65$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym66$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym69$CSETQ, fvector, (SubLObject)ConsesLow.listS((SubLObject)file_vector.$sym70$NEW_FILE_VECTOR, data_file, index_file, (SubLObject)file_vector.$list71)), reader.bq_cons((SubLObject)file_vector.$sym66$PROGN, ConsesLow.append(body, (SubLObject)file_vector.NIL))), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym72$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym40$FILE_VECTOR_P, fvector), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym73$CLOSE_FILE_VECTOR, fvector))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector.$list68);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 22662L)
    public static SubLObject update_file_vector_index(final SubLObject fvector) {
        streams_high.force_output(fvector_data_stream(fvector));
        return update_file_vector_index_linear(fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 22814L)
    public static SubLObject update_file_vector_index_linear(final SubLObject fvector) {
        final SubLObject data_stream = fvector_data_stream(fvector);
        final SubLObject address = streams_high.file_position(data_stream, (SubLObject)file_vector.UNPROVIDED);
        write_file_vector_index_entry(fvector, address);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 23392L)
    public static SubLObject overwrite_file_vector_index(final SubLObject fvector) {
        final SubLObject index_stream = fvector_index_stream(fvector);
        update_file_vector_index_linear(fvector);
        streams_high.force_output(index_stream);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 23601L)
    public static SubLObject write_file_vector_index_entry(final SubLObject fvector, final SubLObject address) {
        final SubLObject index_stream = fvector_index_stream(fvector);
        if (file_vector.NIL != narrow_file_vectorP(fvector)) {
            if (address.numL(file_vector.$max_4byte_integer$.getGlobalValue())) {
                file_hash_table.write_fht_uint4(index_stream, address);
                return fvector;
            }
            final SubLObject index_file_pos = streams_high.file_position(index_stream, (SubLObject)file_vector.UNPROVIDED);
            final SubLObject wide_mark = fvector_file_position_to_index(index_file_pos, (SubLObject)file_vector.NIL);
            specify_file_vector_wide_mark(fvector, wide_mark);
            file_hash_table.write_fht_uint8(index_stream, address);
            return fvector;
        }
        else {
            if (file_vector.NIL != wide_file_vectorP(fvector)) {
                final SubLObject wide_mark2 = get_file_vector_wide_mark(fvector);
                final SubLObject index_file_pos2 = streams_high.file_position(index_stream, (SubLObject)file_vector.UNPROVIDED);
                final SubLObject index = fvector_raw_byte_size_to_length(index_file_pos2, wide_mark2);
                if (index.numL(wide_mark2)) {
                    file_hash_table.write_fht_uint4(index_stream, address);
                }
                else {
                    file_hash_table.write_fht_uint8(index_stream, address);
                }
                return fvector;
            }
            Errors.error((SubLObject)file_vector.$str53$Invalid_state_transition____FILE_, fvector);
            return (SubLObject)file_vector.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 24913L)
    public static SubLObject place_file_vector_index_tombstone(final SubLObject fvector) {
        place_file_vector_index_tombstone_linear(fvector);
        streams_high.force_output(fvector_index_stream(fvector));
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 25090L)
    public static SubLObject place_file_vector_index_tombstone_linear(final SubLObject fvector) {
        write_file_vector_index_entry(fvector, (SubLObject)file_vector.ZERO_INTEGER);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 25217L)
    public static SubLObject with_input_from_file_vector(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fvector = (SubLObject)file_vector.NIL;
        SubLObject data_file = (SubLObject)file_vector.NIL;
        SubLObject index_file = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        fvector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        data_file = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list68);
        index_file = current.first();
        current = current.rest();
        if (file_vector.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym63$CLET, (SubLObject)ConsesLow.list(fvector), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym65$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym66$PROGN, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym69$CSETQ, fvector, (SubLObject)ConsesLow.listS((SubLObject)file_vector.$sym70$NEW_FILE_VECTOR, data_file, index_file, (SubLObject)file_vector.$list74)), reader.bq_cons((SubLObject)file_vector.$sym66$PROGN, ConsesLow.append(body, (SubLObject)file_vector.NIL))), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym72$PWHEN, (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym40$FILE_VECTOR_P, fvector), (SubLObject)ConsesLow.list((SubLObject)file_vector.$sym73$CLOSE_FILE_VECTOR, fvector))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector.$list68);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 25855L)
    public static SubLObject new_file_vector_index_iterator(final SubLObject fvector) {
        return iteration.new_iterator(make_file_vector_index_iterator_state(fvector), (SubLObject)file_vector.$sym75$FVECTOR_INDEX_ITERATOR_DONE, (SubLObject)file_vector.$sym76$FVECTOR_INDEX_ITERATOR_NEXT, (SubLObject)file_vector.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 26340L)
    public static SubLObject make_file_vector_index_iterator_state(final SubLObject fvector) {
        final SubLObject size = file_vector_length(fvector);
        final SubLObject current = (SubLObject)file_vector.ZERO_INTEGER;
        final SubLObject tuple = (SubLObject)ConsesLow.cons((SubLObject)file_vector.MINUS_ONE_INTEGER, (SubLObject)file_vector.MINUS_ONE_INTEGER);
        return (SubLObject)ConsesLow.list(fvector, current, size, tuple);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 26549L)
    public static SubLObject fvector_index_iterator_done(final SubLObject state) {
        SubLObject fvector = (SubLObject)file_vector.NIL;
        SubLObject current_$2 = (SubLObject)file_vector.NIL;
        SubLObject size = (SubLObject)file_vector.NIL;
        SubLObject tuple = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector.$list77);
        fvector = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        current_$2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        size = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        tuple = current.first();
        current = current.rest();
        if (file_vector.NIL == current) {
            return Numbers.numLE(size, current_$2);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector.$list77);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 26724L)
    public static SubLObject fvector_index_iterator_next(final SubLObject state) {
        SubLObject fvector = (SubLObject)file_vector.NIL;
        SubLObject current_$3 = (SubLObject)file_vector.NIL;
        SubLObject size = (SubLObject)file_vector.NIL;
        SubLObject tuple = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector.$list77);
        fvector = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        current_$3 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        size = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector.$list77);
        tuple = current.first();
        current = current.rest();
        if (file_vector.NIL == current) {
            final SubLObject address = read_file_vector_index_entry(fvector, current_$3);
            ConsesLow.rplaca(tuple, current_$3);
            ConsesLow.rplacd(tuple, address);
            ConsesLow.set_nth((SubLObject)file_vector.ONE_INTEGER, state, Numbers.add(current_$3, (SubLObject)file_vector.ONE_INTEGER));
            return Values.values(tuple, state);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector.$list77);
        return (SubLObject)file_vector.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 27325L)
    public static SubLObject gather_file_vector_statistics_for_filenames(final SubLObject data_filename, final SubLObject index_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fvector = (SubLObject)file_vector.NIL;
        SubLObject stats = (SubLObject)file_vector.NIL;
        try {
            final SubLObject bufsiz = file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread);
            fvector = new_file_vector(data_filename, index_filename, (SubLObject)file_vector.$kw29$INPUT, bufsiz, bufsiz, (SubLObject)file_vector.$kw79$ENABLE_MEMORY_MAPPING);
            stats = gather_file_vector_statistics(fvector);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (file_vector.NIL != file_vector_p(fvector)) {
                    close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return stats;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 27889L)
    public static SubLObject gather_file_vector_statistics(final SubLObject fvector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = file_vector_length(fvector);
        final SubLObject size = file_vector_data_size(fvector);
        final SubLObject fv_it = new_file_vector_index_iterator(fvector);
        SubLObject prev = (SubLObject)file_vector.ZERO_INTEGER;
        final SubLObject stats = dictionary.new_dictionary((SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
        map_utilities.map_put(stats, (SubLObject)file_vector.$kw81$INDEX_ENTRIES, count);
        map_utilities.map_put(stats, (SubLObject)file_vector.$kw82$DATA_BYTES, size);
        SubLObject cdolist_list_var = (SubLObject)file_vector.$list83;
        SubLObject tag = (SubLObject)file_vector.NIL;
        tag = cdolist_list_var.first();
        while (file_vector.NIL != cdolist_list_var) {
            map_utilities.map_put(stats, tag, (SubLObject)file_vector.ZERO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tag = cdolist_list_var.first();
        }
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector.NIL; file_vector.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject tuple = iteration.iteration_next(fv_it);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector.NIL != valid) {
                final SubLObject address = tuple.rest();
                if (address.isZero()) {
                    map_utilities.map_increment(stats, (SubLObject)file_vector.$kw84$TOMBSTONE, (SubLObject)file_vector.UNPROVIDED);
                }
                else if (prev.numG(address)) {
                    map_utilities.map_increment(stats, (SubLObject)file_vector.$kw85$REVERSAL, (SubLObject)file_vector.UNPROVIDED);
                }
                prev = address;
            }
        }
        return stats;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 28781L)
    public static SubLObject file_vector_stats_indicate_dense_index_spaceP(final SubLObject stats) {
        return (SubLObject)SubLObjectFactory.makeBoolean(map_utilities.map_get(stats, (SubLObject)file_vector.$kw85$REVERSAL, (SubLObject)file_vector.MINUS_ONE_INTEGER).isZero() && map_utilities.map_get(stats, (SubLObject)file_vector.$kw84$TOMBSTONE, (SubLObject)file_vector.MINUS_ONE_INTEGER).isZero());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 29151L)
    public static SubLObject file_vector_memory_map_for_files(final SubLObject data_filename, final SubLObject index_filename, final SubLObject memmap_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fvector = (SubLObject)file_vector.NIL;
        try {
            final SubLObject bufsiz = file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread);
            fvector = new_file_vector(data_filename, index_filename, (SubLObject)file_vector.$kw29$INPUT, bufsiz, bufsiz, (SubLObject)file_vector.$kw79$ENABLE_MEMORY_MAPPING);
            file_vector_memory_map(fvector, memmap_file);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (file_vector.NIL != file_vector_p(fvector)) {
                    close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return memmap_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 29979L)
    public static SubLObject file_vector_memory_map(final SubLObject fvector, final SubLObject memmap_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_vector.NIL;
            try {
                final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                    stream = compatibility.open_binary(memmap_file, (SubLObject)file_vector.$kw90$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, memmap_file);
                }
                final SubLObject sm = stream;
                final SubLObject map_buffer = Vectors.make_vector(file_vector.$memory_map_chunk_size$.getGlobalValue(), (SubLObject)file_vector.UNPROVIDED);
                final SubLObject fv_it = new_file_vector_index_iterator(fvector);
                SubLObject bufinx = (SubLObject)file_vector.ZERO_INTEGER;
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)file_vector.NIL; file_vector.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject tuple = iteration.iteration_next(fv_it);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (file_vector.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject index = (SubLObject)file_vector.NIL;
                        SubLObject address = (SubLObject)file_vector.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list91);
                        index = current.first();
                        current = (address = current.rest());
                        Vectors.set_aref(map_buffer, bufinx, (SubLObject)ConsesLow.cons(address, index));
                        bufinx = Numbers.add(bufinx, (SubLObject)file_vector.ONE_INTEGER);
                        if (!bufinx.numL(Sequences.length(map_buffer))) {
                            fvectmemmap_flush_buffer(sm, map_buffer, bufinx);
                            bufinx = (SubLObject)file_vector.ZERO_INTEGER;
                        }
                    }
                }
                fvectmemmap_flush_buffer(sm, map_buffer, bufinx);
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return memmap_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 30913L)
    public static SubLObject fvectmemmap_flush_buffer(final SubLObject sm, final SubLObject map_buffer, final SubLObject bufinx) {
        for (SubLObject padinx = bufinx; padinx.numL(Sequences.length(map_buffer)); padinx = Numbers.add(padinx, (SubLObject)file_vector.ONE_INTEGER)) {
            Vectors.set_aref(map_buffer, padinx, (SubLObject)file_vector.NIL);
        }
        Sort.sort(map_buffer, (SubLObject)file_vector.$sym92$FVECT_MEM_MAP_, (SubLObject)file_vector.UNPROVIDED);
        SubLObject i;
        SubLObject current;
        SubLObject datum;
        SubLObject address;
        SubLObject index;
        for (i = (SubLObject)file_vector.NIL, i = (SubLObject)file_vector.ZERO_INTEGER; i.numL(bufinx); i = Numbers.add(i, (SubLObject)file_vector.ONE_INTEGER)) {
            datum = (current = Vectors.aref(map_buffer, i));
            address = (SubLObject)file_vector.NIL;
            index = (SubLObject)file_vector.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list93);
            address = current.first();
            current = (index = current.rest());
            file_hash_table.write_fht_uint8(sm, address);
            file_hash_table.write_fht_uint4(sm, index);
        }
        return sm;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 31476L)
    public static SubLObject fvect_mem_mapL(final SubLObject entry_a, final SubLObject entry_b) {
        if (file_vector.NIL == entry_a) {
            return Types.sublisp_null(entry_b);
        }
        if (file_vector.NIL == entry_b) {
            return (SubLObject)file_vector.T;
        }
        SubLObject address_a = (SubLObject)file_vector.NIL;
        SubLObject index_a = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(entry_a, entry_a, (SubLObject)file_vector.$list94);
        address_a = entry_a.first();
        final SubLObject current = index_a = entry_a.rest();
        SubLObject address_b = (SubLObject)file_vector.NIL;
        SubLObject index_b = (SubLObject)file_vector.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(entry_b, entry_b, (SubLObject)file_vector.$list95);
        address_b = entry_b.first();
        final SubLObject current_$7 = index_b = entry_b.rest();
        if (address_a.isZero() && address_b.isZero()) {
            return Numbers.numL(index_a, index_b);
        }
        return Numbers.numL(address_a, address_b);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 32447L)
    public static SubLObject find_file_vector_data_address_in_index(final SubLObject fvector, final SubLObject data_address) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector.NIL != file_vector_p(fvector) : fvector;
        assert file_vector.NIL != subl_promotions.non_negative_integer_p(data_address) : data_address;
        final SubLObject max_data_position = streams_high.file_length(get_file_vector_data_stream(fvector));
        if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !data_address.numLE(max_data_position)) {
            Errors.error((SubLObject)file_vector.$str98$Data_Address__A_is_past_the_end_o, data_address, max_data_position, fvector);
        }
        final SubLObject max_loop = Numbers.multiply((SubLObject)file_vector.TWO_INTEGER, Numbers.log(data_address, (SubLObject)file_vector.TWO_INTEGER));
        SubLObject curr_loop = (SubLObject)file_vector.ZERO_INTEGER;
        SubLObject min_index = (SubLObject)file_vector.ZERO_INTEGER;
        SubLObject max_index = file_vector_length(fvector);
        while (min_index.numL(max_index)) {
            if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !curr_loop.numL(max_loop)) {
                Errors.error((SubLObject)file_vector.$str99$After__A_iterations__we_did_not_q, curr_loop, data_address, max_data_position);
            }
            final SubLObject curr = Numbers.integerDivide(Numbers.add(max_index, min_index), (SubLObject)file_vector.TWO_INTEGER);
            final SubLObject address = read_file_vector_index_entry(fvector, curr);
            if (data_address.numE(address)) {
                return Values.values(curr, address, curr, address);
            }
            if (data_address.numL(address)) {
                max_index = curr;
            }
            else if (data_address.numG(address)) {
                min_index = Numbers.add(curr, (SubLObject)file_vector.ONE_INTEGER);
            }
            else {
                Errors.error((SubLObject)file_vector.$str100$Whoa___A_is_neither______or___to_, data_address, address);
            }
            curr_loop = Numbers.add(curr_loop, (SubLObject)file_vector.ONE_INTEGER);
        }
        if (min_index.numG(max_index)) {
            final SubLObject swap_var = min_index;
            min_index = max_index;
            max_index = swap_var;
        }
        return Values.values(min_index, read_file_vector_index_entry(fvector, min_index), max_index, read_file_vector_index_entry(fvector, max_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 34252L)
    public static SubLObject widen_file_vector_index_at_mark(final SubLObject old_index_filename, final SubLObject new_index_filename, final SubLObject wide_mark_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject wide_mark = load_file_vector_wide_mark(wide_mark_filename);
        final SubLObject entries = file_vector_length_from_index(old_index_filename);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_vector.NIL;
            try {
                final SubLObject _prev_bind_0_$8 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                    stream = compatibility.open_binary(old_index_filename, (SubLObject)file_vector.$kw29$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$8, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, old_index_filename);
                }
                final SubLObject old = stream;
                SubLObject stream_$9 = (SubLObject)file_vector.NIL;
                try {
                    final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                        stream_$9 = compatibility.open_binary(new_index_filename, (SubLObject)file_vector.$kw90$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
                    }
                    if (!stream_$9.isStream()) {
                        Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, new_index_filename);
                    }
                    final SubLObject v_new = stream_$9;
                    final SubLObject msg = Sequences.cconcatenate((SubLObject)file_vector.$str101$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), file_vector.$str102$_entries_in_at_index_, format_nil.format_nil_a_no_copy(old_index_filename), file_vector.$str103$_to_, format_nil.format_nil_a_no_copy(wide_mark), file_vector.$str104$____ });
                    final SubLObject _prev_bind_0_$10 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$12 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind(msg, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(entries, thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_vector.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_vector.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject i;
                            SubLObject address;
                            for (i = (SubLObject)file_vector.NIL, i = (SubLObject)file_vector.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)file_vector.ONE_INTEGER)) {
                                address = file_hash_table.read_fht_uint4(old);
                                if (i.numL(wide_mark)) {
                                    file_hash_table.write_fht_uint4(v_new, address);
                                }
                                else {
                                    file_hash_table.write_fht_uint8(v_new, address);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_vector.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$12, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream_$9.isStream()) {
                            streams_high.close(stream_$9, (SubLObject)file_vector.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return new_index_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 35565L)
    public static SubLObject widen_file_vector_index(final SubLObject new_index_filename, final SubLObject new_wide_mark, final SubLObject old_index_filename, SubLObject old_wide_mark) {
        if (old_wide_mark == file_vector.UNPROVIDED) {
            old_wide_mark = (SubLObject)file_vector.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entries = (file_vector.NIL != old_wide_mark) ? wide_file_vector_length_from_index(old_index_filename, old_wide_mark) : file_vector_length_from_index(old_index_filename);
        SubLObject wide_mark = (SubLObject)file_vector.NIL;
        if (old_wide_mark.isString() && file_vector.NIL != Filesys.probe_file(old_wide_mark)) {
            wide_mark = load_file_vector_wide_mark(old_wide_mark);
        }
        else {
            wide_mark = Numbers.add((SubLObject)file_vector.ONE_INTEGER, entries);
        }
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_vector.NIL;
            try {
                final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                    stream = compatibility.open_binary(old_index_filename, (SubLObject)file_vector.$kw29$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, old_index_filename);
                }
                final SubLObject old = stream;
                SubLObject stream_$17 = (SubLObject)file_vector.NIL;
                try {
                    final SubLObject _prev_bind_0_$17 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                        stream_$17 = compatibility.open_binary(new_index_filename, (SubLObject)file_vector.$kw90$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$17, thread);
                    }
                    if (!stream_$17.isStream()) {
                        Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, new_index_filename);
                    }
                    final SubLObject v_new = stream_$17;
                    final SubLObject msg = Sequences.cconcatenate((SubLObject)file_vector.$str101$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), file_vector.$str105$_entries_absolutely_in_, format_nil.format_nil_a_no_copy(old_index_filename), file_vector.$str103$_to_, format_nil.format_nil_a_no_copy(new_index_filename), file_vector.$str104$____ });
                    final SubLObject _prev_bind_0_$18 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind(msg, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(entries, thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_vector.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_vector.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject i;
                            SubLObject address;
                            for (i = (SubLObject)file_vector.NIL, i = (SubLObject)file_vector.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)file_vector.ONE_INTEGER)) {
                                address = (i.numL(wide_mark) ? file_hash_table.read_fht_uint4(old) : file_hash_table.read_fht_uint8(old));
                                file_hash_table.write_fht_uint8(v_new, address);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_vector.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$20, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream_$17.isStream()) {
                            streams_high.close(stream_$17, (SubLObject)file_vector.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        save_file_vector_wide_mark((SubLObject)file_vector.ZERO_INTEGER, new_wide_mark);
        return new_index_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 36984L)
    public static SubLObject recover_narrow_file_vector_index(final SubLObject old_index_filename, final SubLObject new_index_filename, final SubLObject wide_mark_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_vector.NIL;
            try {
                final SubLObject _prev_bind_0_$24 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                    stream = compatibility.open_binary(old_index_filename, (SubLObject)file_vector.$kw29$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$24, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, old_index_filename);
                }
                final SubLObject old = stream;
                SubLObject stream_$25 = (SubLObject)file_vector.NIL;
                try {
                    final SubLObject _prev_bind_0_$25 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                        stream_$25 = compatibility.open_binary(new_index_filename, (SubLObject)file_vector.$kw90$OUTPUT);
                    }
                    finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$25, thread);
                    }
                    if (!stream_$25.isStream()) {
                        Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, new_index_filename);
                    }
                    final SubLObject v_new = stream_$25;
                    final SubLObject entries = fvector_raw_byte_size_to_length(streams_high.file_length(old), (SubLObject)file_vector.UNPROVIDED);
                    SubLObject previous = (SubLObject)file_vector.MINUS_ONE_INTEGER;
                    SubLObject missing = (SubLObject)file_vector.ZERO_INTEGER;
                    final SubLObject message = Sequences.cconcatenate((SubLObject)file_vector.$str101$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), file_vector.$str107$_entries_from_, format_nil.format_nil_a_no_copy(old_index_filename), file_vector.$str103$_to_, format_nil.format_nil_a_no_copy(new_index_filename), file_vector.$str108$_____ });
                    SubLObject wide_mark = (SubLObject)file_vector.NIL;
                    final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$28 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind(message, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(entries, thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)file_vector.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)file_vector.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject i;
                            SubLObject current;
                            SubLObject address;
                            for (i = (SubLObject)file_vector.NIL, i = (SubLObject)file_vector.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)file_vector.ONE_INTEGER)) {
                                current = file_hash_table.read_fht_uint4(old);
                                if (current.numL(previous)) {
                                    if (file_vector.NIL == list_utilities.sublisp_boolean(wide_mark)) {
                                        wide_mark = i;
                                    }
                                    missing = Numbers.add(missing, Numbers.expt((SubLObject)file_vector.TWO_INTEGER, (SubLObject)file_vector.$int109$32));
                                }
                                address = Numbers.add(current, missing);
                                if (file_vector.NIL == wide_mark) {
                                    file_hash_table.write_fht_uint4(v_new, address);
                                }
                                else {
                                    file_hash_table.write_fht_uint8(v_new, address);
                                }
                                previous = current;
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)file_vector.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$28, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$26, thread);
                    }
                    final SubLObject str;
                    final SubLObject message_$30 = str = Sequences.cconcatenate((SubLObject)file_vector.$str110$Writing_wide_mark_, new SubLObject[] { format_nil.format_nil_a_no_copy(wide_mark), file_vector.$str103$_to_, format_nil.format_nil_a_no_copy(wide_mark_filename), file_vector.$str108$_____ });
                    final SubLObject _prev_bind_0_$28 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$29 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)file_vector.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((file_vector.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_vector.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        save_file_vector_wide_mark(wide_mark, wide_mark_filename);
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_14, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_13, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_12, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$28, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (stream_$25.isStream()) {
                            streams_high.close(stream_$25, (SubLObject)file_vector.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return wide_mark_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 39174L)
    public static SubLObject recover_wide_file_vector_mark(final SubLObject old_index_filename, final SubLObject wide_mark_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject previous = (SubLObject)file_vector.MINUS_ONE_INTEGER;
        SubLObject index = (SubLObject)file_vector.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)file_vector.NIL;
            try {
                final SubLObject _prev_bind_0_$35 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                    stream = compatibility.open_binary(old_index_filename, (SubLObject)file_vector.$kw29$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$35, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, old_index_filename);
                }
                for (SubLObject s = stream, curr = file_hash_table.read_fht_uint4(s); previous.numL(curr); previous = curr, curr = file_hash_table.read_fht_uint4(s), index = Numbers.add(index, (SubLObject)file_vector.ONE_INTEGER)) {}
            }
            finally {
                final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        final SubLObject wide_mark = index;
        final SubLObject str;
        final SubLObject message = str = Sequences.cconcatenate((SubLObject)file_vector.$str110$Writing_wide_mark_, new SubLObject[] { format_nil.format_nil_a_no_copy(wide_mark), file_vector.$str103$_to_, format_nil.format_nil_a_no_copy(wide_mark_filename), file_vector.$str108$_____ });
        final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)file_vector.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)file_vector.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((file_vector.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : file_vector.T), thread);
            utilities_macros.noting_progress_preamble(str);
            save_file_vector_wide_mark(wide_mark, wide_mark_filename);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_10, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_9, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_8, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
        }
        return wide_mark_filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 40248L)
    public static SubLObject test_file_vector_writing_and_positioning(final SubLObject count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = file_utilities.make_temp_filename((SubLObject)file_vector.$str114$_tmp_);
        try {
            final SubLObject index_file = file_utilities.make_temp_filename((SubLObject)file_vector.$str114$_tmp_);
            try {
                test_file_vector_writing_and_positioning_internal(data_file, index_file, count, (SubLObject)file_vector.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    SubLObject ignore_errors_tag = (SubLObject)file_vector.NIL;
                    try {
                        thread.throwStack.push(file_vector.$kw115$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector.$sym116$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)file_vector.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_vector.$kw115$IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag2 = (SubLObject)file_vector.NIL;
                try {
                    thread.throwStack.push(file_vector.$kw115$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$38 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector.$sym116$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(data_file);
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)file_vector.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$38, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)file_vector.$kw115$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 40664L)
    public static SubLObject test_wide_file_vector_writing_and_positioning(final SubLObject count, final SubLObject wide_mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject wide_mark_file = file_utilities.make_temp_filename((SubLObject)file_vector.$str114$_tmp_);
        try {
            save_file_vector_wide_mark(wide_mark, wide_mark_file);
            final SubLObject index_file = file_utilities.make_temp_filename((SubLObject)file_vector.$str114$_tmp_);
            try {
                final SubLObject data_file = file_utilities.make_temp_filename((SubLObject)file_vector.$str114$_tmp_);
                try {
                    test_file_vector_writing_and_positioning_internal(data_file, index_file, count, wide_mark);
                    final SubLObject estimate = Numbers.add(Numbers.multiply((SubLObject)file_vector.FOUR_INTEGER, wide_mark), Numbers.multiply((SubLObject)file_vector.EIGHT_INTEGER, Numbers.subtract(count, wide_mark)));
                    SubLObject actual = (SubLObject)file_vector.NIL;
                    SubLObject stream = (SubLObject)file_vector.NIL;
                    try {
                        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector.NIL, thread);
                            stream = compatibility.open_binary(index_file, (SubLObject)file_vector.$kw29$INPUT);
                        }
                        finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)file_vector.$str42$Unable_to_open__S, index_file);
                        }
                        final SubLObject index_stream = stream;
                        actual = streams_high.file_length(index_stream);
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)file_vector.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                    if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !estimate.numE(actual)) {
                        Errors.error((SubLObject)file_vector.$str119$A__A_entry_file_with_a_wide_mark_, new SubLObject[] { count, wide_mark, estimate, actual });
                    }
                    final SubLObject length = wide_file_vector_length_from_index(index_file, wide_mark_file);
                    if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !count.numE(length)) {
                        Errors.error((SubLObject)file_vector.$str120$The_index_file_should_be_have_a_l);
                    }
                    final SubLObject fvector = new_wide_input_file_vector(data_file, index_file, wide_mark_file, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
                    if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector.NIL == wide_file_vectorP(fvector)) {
                        Errors.error((SubLObject)file_vector.$str121$We_are_loading_a_wide_file_vector);
                    }
                    if (file_vector.NIL != narrow_file_vectorP(fvector)) {
                        Errors.error((SubLObject)file_vector.$str121$We_are_loading_a_wide_file_vector);
                    }
                    if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !wide_mark.numE(get_file_vector_wide_mark(fvector))) {
                        Errors.error((SubLObject)file_vector.$str122$We_expected_a_wide_mark_of__A_but, wide_mark, get_file_vector_wide_mark(fvector));
                    }
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        SubLObject ignore_errors_tag = (SubLObject)file_vector.NIL;
                        try {
                            thread.throwStack.push(file_vector.$kw115$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector.$sym116$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    Filesys.delete_file(data_file);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)file_vector.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_vector.$kw115$IGNORE_ERRORS_TARGET);
                            thread.throwStack.pop();
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    SubLObject ignore_errors_tag2 = (SubLObject)file_vector.NIL;
                    try {
                        thread.throwStack.push(file_vector.$kw115$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$40 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector.$sym116$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            }
                            catch (Throwable catch_var2) {
                                Errors.handleThrowable(catch_var2, (SubLObject)file_vector.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var2) {
                        ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)file_vector.$kw115$IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag3 = (SubLObject)file_vector.NIL;
                try {
                    thread.throwStack.push(file_vector.$kw115$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$41 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector.$sym116$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(wide_mark_file);
                        }
                        catch (Throwable catch_var3) {
                            Errors.handleThrowable(catch_var3, (SubLObject)file_vector.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$41, thread);
                    }
                }
                catch (Throwable ccatch_env_var3) {
                    ignore_errors_tag3 = Errors.handleThrowable(ccatch_env_var3, (SubLObject)file_vector.$kw115$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector.lisp", position = 42313L)
    public static SubLObject test_file_vector_writing_and_positioning_internal(final SubLObject data_file, final SubLObject index_file, final SubLObject count, final SubLObject wide_mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject addresses = (SubLObject)file_vector.NIL;
        SubLObject fvector = (SubLObject)file_vector.NIL;
        try {
            fvector = new_file_vector(data_file, index_file, (SubLObject)file_vector.$kw90$OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), (SubLObject)file_vector.UNPROVIDED);
            if (file_vector.NIL != list_utilities.sublisp_boolean(wide_mark)) {
                specify_file_vector_wide_mark(fvector, wide_mark);
            }
            final SubLObject data_stream = get_file_vector_data_stream(fvector);
            SubLObject i;
            SubLObject next_index;
            for (i = (SubLObject)file_vector.NIL, i = (SubLObject)file_vector.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)file_vector.ONE_INTEGER)) {
                next_index = file_vector_next_index(fvector);
                if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !i.numE(next_index)) {
                    Errors.error(Errors.error((SubLObject)file_vector.$str123$The_next_index_is_supposed_to_be_, i, next_index));
                }
                update_file_vector_index_linear(fvector);
                cfasl.cfasl_output(Sequences.cconcatenate((SubLObject)file_vector.$str124$Position_, format_nil.format_nil_a_no_copy(i)), data_stream);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (file_vector.NIL != file_vector_p(fvector)) {
                    close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        addresses = Sequences.nreverse(addresses);
        fvector = (SubLObject)file_vector.NIL;
        try {
            fvector = new_file_vector(data_file, index_file, (SubLObject)file_vector.$kw29$INPUT, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED, (SubLObject)file_vector.UNPROVIDED);
            if (file_vector.NIL != list_utilities.sublisp_boolean(wide_mark)) {
                specify_file_vector_wide_mark(fvector, wide_mark);
            }
            final SubLObject iterator = new_file_vector_index_iterator(fvector);
            SubLObject list_var = (SubLObject)file_vector.NIL;
            SubLObject expected_address = (SubLObject)file_vector.NIL;
            SubLObject expected_index = (SubLObject)file_vector.NIL;
            list_var = addresses;
            expected_address = list_var.first();
            for (expected_index = (SubLObject)file_vector.ZERO_INTEGER; file_vector.NIL != list_var; list_var = list_var.rest(), expected_address = list_var.first(), expected_index = Numbers.add((SubLObject)file_vector.ONE_INTEGER, expected_index)) {
                thread.resetMultipleValues();
                final SubLObject tuple = iteration.iteration_next(iterator);
                final SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (file_vector.NIL == validP) {
                    Errors.error((SubLObject)file_vector.$str125$On_step___A__the_iteration_result, expected_index);
                }
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject actual_index = (SubLObject)file_vector.NIL;
                SubLObject actual_address = (SubLObject)file_vector.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector.$list126);
                actual_index = current.first();
                current = (actual_address = current.rest());
                if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !actual_index.numE(expected_index)) {
                    Errors.error((SubLObject)file_vector.$str127$The_expected_index__A_was_____act, expected_index, actual_index);
                }
                if (file_vector.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_address.numE(actual_address)) {
                    Errors.error((SubLObject)file_vector.$str128$The_expected_address__A_was_____a, expected_address, actual_address);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (file_vector.NIL != file_vector_p(fvector)) {
                    close_file_vector(fvector);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }
    
    public static SubLObject declare_file_vector_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_print_function_trampoline", "FVECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_p", "FVECTOR-P", 1, 0, false);
        new $fvector_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_data_stream", "FVECTOR-DATA-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_index_stream", "FVECTOR-INDEX-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_wide_mark", "FVECTOR-WIDE-MARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "_csetf_fvector_data_stream", "_CSETF-FVECTOR-DATA-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "_csetf_fvector_index_stream", "_CSETF-FVECTOR-INDEX-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "_csetf_fvector_wide_mark", "_CSETF-FVECTOR-WIDE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "make_fvector", "MAKE-FVECTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "visit_defstruct_fvector", "VISIT-DEFSTRUCT-FVECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "visit_defstruct_object_fvector_method", "VISIT-DEFSTRUCT-OBJECT-FVECTOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "print_fvector", "PRINT-FVECTOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "new_fvector", "NEW-FVECTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "get_file_vector_wide_mark", "GET-FILE-VECTOR-WIDE-MARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "specify_file_vector_wide_mark", "SPECIFY-FILE-VECTOR-WIDE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_p", "FILE-VECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "new_file_vector", "NEW-FILE-VECTOR", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "open_file_vector_for_rewrite", "OPEN-FILE-VECTOR-FOR-REWRITE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "open_file_vector_for_append", "OPEN-FILE-VECTOR-FOR-APPEND", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "new_wide_input_file_vector", "NEW-WIDE-INPUT-FILE-VECTOR", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "create_file_vector", "CREATE-FILE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "create_wide_file_vector", "CREATE-WIDE-FILE-VECTOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "load_file_vector_wide_mark", "LOAD-FILE-VECTOR-WIDE-MARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "possibly_load_file_vector_wide_mark", "POSSIBLY-LOAD-FILE-VECTOR-WIDE-MARK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "save_file_vector_wide_mark", "SAVE-FILE-VECTOR-WIDE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "persist_file_vector_wide_mark", "PERSIST-FILE-VECTOR-WIDE-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "clone_file_vector", "CLONE-FILE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "close_file_vector", "CLOSE-FILE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_change_stream_buffer_sizes", "FILE-VECTOR-CHANGE-STREAM-BUFFER-SIZES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_enable_memory_mapping", "FILE-VECTOR-ENABLE-MEMORY-MAPPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_memory_mappedP", "FILE-VECTOR-MEMORY-MAPPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "get_file_vector_data_stream", "GET-FILE-VECTOR-DATA-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "get_file_vector_index_stream", "GET-FILE-VECTOR-INDEX-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "wide_file_vectorP", "WIDE-FILE-VECTOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "narrow_file_vectorP", "NARROW-FILE-VECTOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_length", "FILE-VECTOR-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_length_from_index", "FILE-VECTOR-LENGTH-FROM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "wide_file_vector_length_from_index", "WIDE-FILE-VECTOR-LENGTH-FROM-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_length_from_index_int", "FILE-VECTOR-LENGTH-FROM-INDEX-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_length_from_index_stream", "FILE-VECTOR-LENGTH-FROM-INDEX-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_data_size", "FILE-VECTOR-DATA-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_data_size_from_filename", "FILE-VECTOR-DATA-SIZE-FROM-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_data_size_from_data_stream", "FILE-VECTOR-DATA-SIZE-FROM-DATA-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_next_index", "FILE-VECTOR-NEXT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_raw_byte_size_to_length", "FVECTOR-RAW-BYTE-SIZE-TO-LENGTH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "position_file_vector", "POSITION-FILE-VECTOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "position_file_vector_index_for_update", "POSITION-FILE-VECTOR-INDEX-FOR-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "position_file_vector_index", "POSITION-FILE-VECTOR-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "read_file_vector_index_entry", "READ-FILE-VECTOR-INDEX-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "wide_fvector_index_to_file_position", "WIDE-FVECTOR-INDEX-TO-FILE-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_file_position_to_index", "FVECTOR-FILE-POSITION-TO-INDEX", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "begin_file_vector_excursion", "BEGIN-FILE-VECTOR-EXCURSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "end_file_vector_excursion", "END-FILE-VECTOR-EXCURSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_make_memento", "FVECTOR-MAKE-MEMENTO", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector", "with_file_vector_excursion", "WITH-FILE-VECTOR-EXCURSION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector", "with_output_to_file_vector", "WITH-OUTPUT-TO-FILE-VECTOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "update_file_vector_index", "UPDATE-FILE-VECTOR-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "update_file_vector_index_linear", "UPDATE-FILE-VECTOR-INDEX-LINEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "overwrite_file_vector_index", "OVERWRITE-FILE-VECTOR-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "write_file_vector_index_entry", "WRITE-FILE-VECTOR-INDEX-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "place_file_vector_index_tombstone", "PLACE-FILE-VECTOR-INDEX-TOMBSTONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "place_file_vector_index_tombstone_linear", "PLACE-FILE-VECTOR-INDEX-TOMBSTONE-LINEAR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector", "with_input_from_file_vector", "WITH-INPUT-FROM-FILE-VECTOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "new_file_vector_index_iterator", "NEW-FILE-VECTOR-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "make_file_vector_index_iterator_state", "MAKE-FILE-VECTOR-INDEX-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_index_iterator_done", "FVECTOR-INDEX-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvector_index_iterator_next", "FVECTOR-INDEX-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "gather_file_vector_statistics_for_filenames", "GATHER-FILE-VECTOR-STATISTICS-FOR-FILENAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "gather_file_vector_statistics", "GATHER-FILE-VECTOR-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_stats_indicate_dense_index_spaceP", "FILE-VECTOR-STATS-INDICATE-DENSE-INDEX-SPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_memory_map_for_files", "FILE-VECTOR-MEMORY-MAP-FOR-FILES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "file_vector_memory_map", "FILE-VECTOR-MEMORY-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvectmemmap_flush_buffer", "FVECTMEMMAP-FLUSH-BUFFER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "fvect_mem_mapL", "FVECT-MEM-MAP<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "find_file_vector_data_address_in_index", "FIND-FILE-VECTOR-DATA-ADDRESS-IN-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "widen_file_vector_index_at_mark", "WIDEN-FILE-VECTOR-INDEX-AT-MARK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "widen_file_vector_index", "WIDEN-FILE-VECTOR-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "recover_narrow_file_vector_index", "RECOVER-NARROW-FILE-VECTOR-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "recover_wide_file_vector_mark", "RECOVER-WIDE-FILE-VECTOR-MARK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "test_file_vector_writing_and_positioning", "TEST-FILE-VECTOR-WRITING-AND-POSITIONING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "test_wide_file_vector_writing_and_positioning", "TEST-WIDE-FILE-VECTOR-WRITING-AND-POSITIONING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector", "test_file_vector_writing_and_positioning_internal", "TEST-FILE-VECTOR-WRITING-AND-POSITIONING-INTERNAL", 4, 0, false);
        return (SubLObject)file_vector.NIL;
    }
    
    public static SubLObject init_file_vector_file() {
        file_vector.$dtp_fvector$ = SubLFiles.defconstant("*DTP-FVECTOR*", (SubLObject)file_vector.$sym0$FVECTOR);
        file_vector.$default_file_vector_data_stream_buffer_size$ = SubLFiles.defconstant("*DEFAULT-FILE-VECTOR-DATA-STREAM-BUFFER-SIZE*", (SubLObject)file_vector.$int27$1024);
        file_vector.$default_file_vector_index_stream_buffer_size$ = SubLFiles.defconstant("*DEFAULT-FILE-VECTOR-INDEX-STREAM-BUFFER-SIZE*", (SubLObject)file_vector.$int28$256);
        file_vector.$max_4byte_integer$ = SubLFiles.defconstant("*MAX-4BYTE-INTEGER*", (SubLObject)file_vector.$int51$4294967295);
        file_vector.$max_8byte_integer$ = SubLFiles.defconstant("*MAX-8BYTE-INTEGER*", (SubLObject)file_vector.$int52$18446744073709551615);
        file_vector.$memory_map_chunk_size$ = SubLFiles.deflexical("*MEMORY-MAP-CHUNK-SIZE*", (SubLObject)file_vector.$int88$1000000);
        return (SubLObject)file_vector.NIL;
    }
    
    public static SubLObject setup_file_vector_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_vector.$dtp_fvector$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector.$sym7$FVECTOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_vector.$list8);
        Structures.def_csetf((SubLObject)file_vector.$sym9$FVECTOR_DATA_STREAM, (SubLObject)file_vector.$sym10$_CSETF_FVECTOR_DATA_STREAM);
        Structures.def_csetf((SubLObject)file_vector.$sym11$FVECTOR_INDEX_STREAM, (SubLObject)file_vector.$sym12$_CSETF_FVECTOR_INDEX_STREAM);
        Structures.def_csetf((SubLObject)file_vector.$sym13$FVECTOR_WIDE_MARK, (SubLObject)file_vector.$sym14$_CSETF_FVECTOR_WIDE_MARK);
        Equality.identity((SubLObject)file_vector.$sym0$FVECTOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_vector.$dtp_fvector$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector.$sym23$VISIT_DEFSTRUCT_OBJECT_FVECTOR_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)file_vector.$sym43$FVECTOR_RAW_BYTE_SIZE_TO_LENGTH, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector.$kw44$TEST, file_vector.NIL, file_vector.$kw45$OWNER, file_vector.NIL, file_vector.$kw46$CLASSES, file_vector.NIL, file_vector.$kw47$KB, file_vector.$kw48$TINY, file_vector.$kw49$WORKING_, file_vector.T }), (SubLObject)file_vector.$list50);
        generic_testing.define_test_case_table_int((SubLObject)file_vector.$sym54$WIDE_FVECTOR_INDEX_TO_FILE_POSITION, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector.$kw44$TEST, file_vector.NIL, file_vector.$kw45$OWNER, file_vector.NIL, file_vector.$kw46$CLASSES, file_vector.NIL, file_vector.$kw47$KB, file_vector.$kw48$TINY, file_vector.$kw49$WORKING_, file_vector.T }), (SubLObject)file_vector.$list55);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym78$GATHER_FILE_VECTOR_STATISTICS_FOR_FILENAMES);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym80$GATHER_FILE_VECTOR_STATISTICS);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym86$FILE_VECTOR_STATS_INDICATE_DENSE_INDEX_SPACE_);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym87$FILE_VECTOR_MEMORY_MAP_FOR_FILES);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym89$FILE_VECTOR_MEMORY_MAP);
        utilities_macros.note_funcall_helper_function((SubLObject)file_vector.$sym92$FVECT_MEM_MAP_);
        generic_testing.define_test_case_table_int((SubLObject)file_vector.$sym92$FVECT_MEM_MAP_, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector.$kw44$TEST, file_vector.NIL, file_vector.$kw45$OWNER, file_vector.NIL, file_vector.$kw46$CLASSES, file_vector.NIL, file_vector.$kw47$KB, file_vector.$kw48$TINY, file_vector.$kw49$WORKING_, file_vector.T }), (SubLObject)file_vector.$list96);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym106$RECOVER_NARROW_FILE_VECTOR_INDEX);
        access_macros.register_external_symbol((SubLObject)file_vector.$sym111$RECOVER_WIDE_FILE_VECTOR_MARK);
        generic_testing.define_test_case_table_int((SubLObject)file_vector.$sym112$TEST_FILE_VECTOR_WRITING_AND_POSITIONING, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector.$kw44$TEST, file_vector.EQL, file_vector.$kw45$OWNER, file_vector.NIL, file_vector.$kw46$CLASSES, file_vector.NIL, file_vector.$kw47$KB, file_vector.$kw48$TINY, file_vector.$kw49$WORKING_, file_vector.T }), (SubLObject)file_vector.$list113);
        generic_testing.define_test_case_table_int((SubLObject)file_vector.$sym117$TEST_WIDE_FILE_VECTOR_WRITING_AND_POSITIONING, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector.$kw44$TEST, file_vector.EQL, file_vector.$kw45$OWNER, file_vector.NIL, file_vector.$kw46$CLASSES, file_vector.NIL, file_vector.$kw47$KB, file_vector.$kw48$TINY, file_vector.$kw49$WORKING_, file_vector.T }), (SubLObject)file_vector.$list118);
        return (SubLObject)file_vector.NIL;
    }
    
    public void declareFunctions() {
        declare_file_vector_file();
    }
    
    public void initializeVariables() {
        init_file_vector_file();
    }
    
    public void runTopLevelForms() {
        setup_file_vector_file();
    }
    
    
    public static final class $fvector_native extends SubLStructNative
    {
        public SubLObject $data_stream;
        public SubLObject $index_stream;
        public SubLObject $wide_mark;
        private static final SubLStructDeclNative structDecl;
        
        public $fvector_native() {
            this.$data_stream = (SubLObject)CommonSymbols.NIL;
            this.$index_stream = (SubLObject)CommonSymbols.NIL;
            this.$wide_mark = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fvector_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$data_stream;
        }
        
        public SubLObject getField3() {
            return this.$index_stream;
        }
        
        public SubLObject getField4() {
            return this.$wide_mark;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$data_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$index_stream = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$wide_mark = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fvector_native.class, file_vector.$sym0$FVECTOR, file_vector.$sym1$FVECTOR_P, file_vector.$list2, file_vector.$list3, new String[] { "$data_stream", "$index_stream", "$wide_mark" }, file_vector.$list4, file_vector.$list5, file_vector.$sym6$PRINT_FVECTOR);
        }
    }
    
    public static final class $fvector_p$UnaryFunction extends UnaryFunction
    {
        public $fvector_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FVECTOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return file_vector.fvector_p(arg1);
        }
    }
}

/*

	Total time: 1065 ms
	
*/