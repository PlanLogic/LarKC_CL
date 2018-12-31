package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class convert_partitions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.convert_partitions";
    public static final String myFingerPrint = "cf2df32958564b35000f1e738d3046b7ea54dfcf2b9f0b4b02e1d0fd52f90546";
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 651L)
    private static SubLSymbol $convert_partition_source_format$;
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 715L)
    private static SubLSymbol $convert_partition_target_format$;
    private static final SubLString $str0$2_0;
    private static final SubLString $str1$2_1;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLSymbol $kw3$INPUT;
    private static final SubLString $str4$Unable_to_open__S;
    private static final SubLSymbol $kw5$OUTPUT;
    private static final SubLSymbol $sym6$ATOM;
    private static final SubLSymbol $sym7$INTEGERP;
    private static final SubLString $str8$partition_format_is__A__not__A;
    private static final SubLList $list9;
    private static final SubLString $str10$converting_partition_constant_she;
    private static final SubLSymbol $kw11$EOF;
    
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 778L)
    public static SubLObject convert_partition(final SubLObject in_file, final SubLObject out_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert convert_partitions.NIL != Types.stringp(in_file) : in_file;
        assert convert_partitions.NIL != Types.stringp(out_file) : out_file;
        SubLObject success = (SubLObject)convert_partitions.NIL;
        if (convert_partitions.NIL != Filesys.probe_file(in_file)) {
            SubLObject stream = (SubLObject)convert_partitions.NIL;
            try {
                stream = compatibility.open_binary(in_file, (SubLObject)convert_partitions.$kw3$INPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)convert_partitions.$str4$Unable_to_open__S, in_file);
                }
                final SubLObject in_stream = stream;
                SubLObject stream_$1 = (SubLObject)convert_partitions.NIL;
                try {
                    stream_$1 = compatibility.open_binary(out_file, (SubLObject)convert_partitions.$kw5$OUTPUT);
                    if (!stream_$1.isStream()) {
                        Errors.error((SubLObject)convert_partitions.$str4$Unable_to_open__S, out_file);
                    }
                    final SubLObject out_stream = stream_$1;
                    final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                    try {
                        cfasl.$cfasl_common_symbols$.bind((SubLObject)convert_partitions.NIL, thread);
                        cfasl.cfasl_set_common_symbols(convert_partition_info(in_stream, out_stream));
                        convert_partition_constant_shells(in_stream, out_stream);
                    }
                    finally {
                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                    convert_partition_remainder(in_stream, out_stream);
                    success = (SubLObject)convert_partitions.T;
                }
                finally {
                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)convert_partitions.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (stream_$1.isStream()) {
                            streams_high.close(stream_$1, (SubLObject)convert_partitions.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)convert_partitions.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)convert_partitions.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 1330L)
    public static SubLObject convert_partition_info(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject copyright_notice = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject format = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject system = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject patch_level = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject date = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        assert convert_partitions.NIL != Types.stringp(copyright_notice) : copyright_notice;
        assert convert_partitions.NIL != Types.atom(format) : format;
        assert convert_partitions.NIL != Types.integerp(system) : system;
        assert convert_partitions.NIL != Types.integerp(patch_level) : patch_level;
        assert convert_partitions.NIL != Types.integerp(date) : date;
        if (!format.equal(convert_partitions.$convert_partition_source_format$.getDynamicValue(thread))) {
            Errors.error((SubLObject)convert_partitions.$str8$partition_format_is__A__not__A, format, convert_partitions.$convert_partition_source_format$.getDynamicValue(thread));
        }
        SubLObject current;
        final SubLObject datum = current = system_info.cyc_revision_numbers();
        SubLObject system_number = (SubLObject)convert_partitions.NIL;
        SubLObject patch_number = (SubLObject)convert_partitions.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)convert_partitions.$list9);
        system_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)convert_partitions.$list9);
        patch_number = current.first();
        final SubLObject rest;
        current = (rest = current.rest());
        final SubLObject special_objects = partitions.load_partition_special_objects(in_stream);
        cfasl.cfasl_output(misc_utilities.copyright_notice(), out_stream);
        cfasl.cfasl_output(convert_partitions.$convert_partition_target_format$.getDynamicValue(thread), out_stream);
        cfasl.cfasl_output(system_number, out_stream);
        cfasl.cfasl_output(patch_number, out_stream);
        cfasl.cfasl_output(numeric_date_utilities.get_universal_date((SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED), out_stream);
        dumper.dump_special_objects_internal(special_objects, out_stream);
        return special_objects;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 2476L)
    public static SubLObject convert_partition_constant_shells(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        partitions.load_partition_section_marker(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        partitions.dump_partition_section_marker(out_stream);
        final SubLObject total = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        assert convert_partitions.NIL != Types.integerp(total) : total;
        cfasl.cfasl_output(total, out_stream);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)convert_partitions.$str10$converting_partition_constant_she, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(total, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)convert_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)convert_partitions.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)convert_partitions.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)convert_partitions.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                for (i = (SubLObject)convert_partitions.NIL, i = (SubLObject)convert_partitions.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)convert_partitions.ONE_INTEGER)) {
                    convert_partition_constant_shell(in_stream, out_stream);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)convert_partitions.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)convert_partitions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
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
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)convert_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 2898L)
    public static SubLObject convert_partition_constant_shell(final SubLObject in_stream, final SubLObject out_stream) {
        final SubLObject internal_id = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject name = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        final SubLObject scopeP = cfasl.cfasl_input(in_stream, (SubLObject)convert_partitions.UNPROVIDED, (SubLObject)convert_partitions.UNPROVIDED);
        assert convert_partitions.NIL != Types.integerp(internal_id) : internal_id;
        final SubLObject external_id = constants_high.make_constant_legacy_guid(internal_id);
        cfasl.cfasl_output(internal_id, out_stream);
        cfasl.cfasl_output(name, out_stream);
        cfasl.cfasl_output(external_id, out_stream);
        cfasl.cfasl_output(scopeP, out_stream);
        return (SubLObject)convert_partitions.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/convert-partitions.lisp", position = 3374L)
    public static SubLObject convert_partition_remainder(final SubLObject in_stream, final SubLObject out_stream) {
        SubLObject v_byte;
        for (v_byte = (SubLObject)convert_partitions.NIL, v_byte = streams_high.read_byte(in_stream, (SubLObject)convert_partitions.NIL, (SubLObject)convert_partitions.$kw11$EOF); v_byte != convert_partitions.$kw11$EOF; v_byte = streams_high.read_byte(in_stream, (SubLObject)convert_partitions.NIL, (SubLObject)convert_partitions.$kw11$EOF)) {
            streams_high.write_byte(v_byte, out_stream);
        }
        return (SubLObject)convert_partitions.NIL;
    }
    
    public static SubLObject declare_convert_partitions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.convert_partitions", "convert_partition", "CONVERT-PARTITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.convert_partitions", "convert_partition_info", "CONVERT-PARTITION-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.convert_partitions", "convert_partition_constant_shells", "CONVERT-PARTITION-CONSTANT-SHELLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.convert_partitions", "convert_partition_constant_shell", "CONVERT-PARTITION-CONSTANT-SHELL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.convert_partitions", "convert_partition_remainder", "CONVERT-PARTITION-REMAINDER", 2, 0, false);
        return (SubLObject)convert_partitions.NIL;
    }
    
    public static SubLObject init_convert_partitions_file() {
        convert_partitions.$convert_partition_source_format$ = SubLFiles.defparameter("*CONVERT-PARTITION-SOURCE-FORMAT*", (SubLObject)convert_partitions.$str0$2_0);
        convert_partitions.$convert_partition_target_format$ = SubLFiles.defparameter("*CONVERT-PARTITION-TARGET-FORMAT*", (SubLObject)convert_partitions.$str1$2_1);
        return (SubLObject)convert_partitions.NIL;
    }
    
    public static SubLObject setup_convert_partitions_file() {
        return (SubLObject)convert_partitions.NIL;
    }
    
    public void declareFunctions() {
        declare_convert_partitions_file();
    }
    
    public void initializeVariables() {
        init_convert_partitions_file();
    }
    
    public void runTopLevelForms() {
        setup_convert_partitions_file();
    }
    
    static {
        me = (SubLFile)new convert_partitions();
        convert_partitions.$convert_partition_source_format$ = null;
        convert_partitions.$convert_partition_target_format$ = null;
        $str0$2_0 = SubLObjectFactory.makeString("2.0");
        $str1$2_1 = SubLObjectFactory.makeString("2.1");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw3$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str4$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw5$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym6$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym7$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str8$partition_format_is__A__not__A = SubLObjectFactory.makeString("partition format is ~A, not ~A");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PATCH-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $str10$converting_partition_constant_she = SubLObjectFactory.makeString("converting partition constant shells");
        $kw11$EOF = SubLObjectFactory.makeKeyword("EOF");
    }
}

/*

	Total time: 203 ms
	
*/