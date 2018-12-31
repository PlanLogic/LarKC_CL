package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_transcript_tracing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_transcript_tracing";
    public static final String myFingerPrint = "a6c4a6a59dc6f19e381e90321e1470c1e5f35b6dea46699f3e55b8400bcbeb84";
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 927L)
    public static SubLSymbol $hl_quotify_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 1244L)
    private static SubLSymbol $within_hl_evalP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 2627L)
    public static SubLSymbol $hlt_include_constant_external_idsP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 8751L)
    public static SubLSymbol $hlt_trace_streams$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9102L)
    private static SubLSymbol $hlt_trace_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9398L)
    public static SubLSymbol $hlt_format_operationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 29708L)
    public static SubLSymbol $hlt_constant_id_map$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 30075L)
    public static SubLSymbol $hlt_constant_list$;
    private static final SubLInteger $int0$256;
    private static final SubLSymbol $kw1$HL_UNQUOTIFY_FAILURE;
    private static final SubLString $str2$HL_Lookup_failure_with____S;
    private static final SubLSymbol $sym3$VALUES;
    private static final SubLString $str4$HL_Lookup_failure_with___S;
    private static final SubLSymbol $sym5$HL_KB_OBJECT_P;
    private static final SubLSymbol $sym6$HL_QUOTIFY_CONS_METHOD;
    private static final SubLSymbol $sym7$LIST;
    private static final SubLSymbol $sym8$HL_QUOTIFY;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$LIST_;
    private static final SubLSymbol $sym11$HL_QUOTIFY_CONSTANT_METHOD;
    private static final SubLSymbol $sym12$HL_FIND_CONSTANT;
    private static final SubLSymbol $sym13$HL_QUOTIFY_NART_METHOD;
    private static final SubLSymbol $sym14$HL_FIND_NART;
    private static final SubLSymbol $sym15$HL_QUOTIFY_VARIABLE_METHOD;
    private static final SubLSymbol $sym16$HL_VAR;
    private static final SubLSymbol $sym17$HL_QUOTIFY_ASSERTION_METHOD;
    private static final SubLSymbol $sym18$HL_FIND_GAF;
    private static final SubLSymbol $sym19$HL_FIND_RULE;
    private static final SubLSymbol $sym20$HL_QUOTIFY_DEDUCTION_METHOD;
    private static final SubLSymbol $sym21$HL_FIND_DEDUCTION;
    private static final SubLSymbol $kw22$TRUE;
    private static final SubLString $str23$Circular_KB_HL_Support_dependency;
    private static final SubLSymbol $sym24$HL_QUOTIFY_KB_HL_SUPPORT_METHOD;
    private static final SubLSymbol $sym25$HL_FIND_KB_HL_SUPPORT;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$HL_RESOLVE_RECURSIVE;
    private static final SubLSymbol $kw28$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym29$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym30$_HLT_TRACE_LOCK_;
    private static final SubLString $str31$HLT_trace;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$STREAM_VAR;
    private static final SubLSymbol $sym34$CLET;
    private static final SubLSymbol $sym35$WITH_HL_TRANSCRIPT_TRACE_TO_STREAM;
    private static final SubLSymbol $sym36$PROGN;
    private static final SubLSymbol $sym37$_HLT_TRACE_STREAMS_;
    private static final SubLSymbol $sym38$CONS;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$FORCE_OUTPUT;
    private static final SubLSymbol $sym41$REMOVE;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$FILENAME_VAR;
    private static final SubLSymbol $sym44$WITH_HL_TRANSCRIPT_TRACE_TO_FILE;
    private static final SubLSymbol $sym45$STREAM;
    private static final SubLSymbol $sym46$CUNWIND_PROTECT;
    private static final SubLSymbol $sym47$WITH_STREAM_BUFFER_SIZE;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$CSETQ;
    private static final SubLSymbol $sym50$ENSURE_PRIVATE_STREAM;
    private static final SubLSymbol $sym51$OPEN_TEXT;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$PUNLESS;
    private static final SubLSymbol $sym54$STREAMP;
    private static final SubLSymbol $sym55$ERROR;
    private static final SubLString $str56$Unable_to_open__S;
    private static final SubLSymbol $sym57$PWHEN;
    private static final SubLSymbol $sym58$CLOSE;
    private static final SubLSymbol $sym59$STRINGP;
    private static final SubLSymbol $kw60$OUTPUT;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $kw63$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw64$STREAM;
    private static final SubLSymbol $kw65$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw66$DONE;
    private static final SubLSymbol $sym67$FILENAME_VAR;
    private static final SubLSymbol $sym68$DO_HL_TRANSCRIPT_TRACE;
    private static final SubLSymbol $sym69$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym70$IN_STREAM_VAR;
    private static final SubLSymbol $sym71$WITH_PRIVATE_TEXT_FILE;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$ENABLE_FILE_STREAM_MEMORY_MAPPING;
    private static final SubLSymbol $sym74$TOTAL;
    private static final SubLSymbol $sym75$SOFAR;
    private static final SubLSymbol $sym76$FILE_LENGTH;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$CHECK_TYPE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym81$GET_FILE_POSITION;
    private static final SubLSymbol $sym82$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym83$LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION;
    private static final SubLSymbol $sym84$WHILE;
    private static final SubLSymbol $sym85$CAND;
    private static final SubLSymbol $sym86$CNOT;
    private static final SubLSymbol $kw87$EOF;
    private static final SubLSymbol $kw88$UNINITIALIZED;
    private static final SubLSymbol $sym89$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw90$WARN;
    private static final SubLString $str91$Loading_HL_transcript_Trace_;
    private static final SubLSymbol $kw92$INPUT;
    private static final SubLSymbol $sym93$LOAD_HL_TRANSCRIPT_TRACE_ORIGINAL;
    private static final SubLList $list94;
    private static final SubLSymbol $kw95$IGNORE;
    private static final SubLString $str96$operation__S___S___A;
    private static final SubLSymbol $kw97$ERROR;
    private static final SubLString $str98$unexpected_error_mode__S;
    private static final SubLString $str99$Analyzing_HL_transcript_Trace_;
    private static final SubLSymbol $sym100$_;
    private static final SubLSymbol $sym101$CDR;
    private static final SubLSymbol $kw102$TOTAL;
    private static final SubLSymbol $sym103$CONSTANT_P;
    private static final SubLSymbol $sym104$HLT_FIND_OR_CREATE;
    private static final SubLSymbol $sym105$HLT_FIND_OR_CREATE_NART;
    private static final SubLSymbol $sym106$ASSERTION_P;
    private static final SubLSymbol $sym107$HLT_FIND_OR_CREATE_ASSERTION;
    private static final SubLSymbol $sym108$POSSIBLY_SENTENCE_P;
    private static final SubLSymbol $sym109$POSSIBLY_HLMT_P;
    private static final SubLSymbol $kw110$MONOTONIC;
    private static final SubLSymbol $kw111$BACKWARD;
    private static final SubLSymbol $sym112$HLT_ASSERT;
    private static final SubLSymbol $sym113$HLT_TIMESTAMP_ASSERTION;
    private static final SubLSymbol $sym114$KB_HL_SUPPORT_P;
    private static final SubLSymbol $sym115$HLT_FIND_OR_CREATE_KB_HL_SUPPORT;
    private static final SubLSymbol $sym116$DEDUCTION_P;
    private static final SubLSymbol $sym117$HLT_FIND_OR_CREATE_DEDUCTION;
    private static final SubLSymbol $sym118$HLT_ADD_SKOLEM_DEFN;
    private static final SubLSymbol $sym119$HLT_REMOVE_CONSTANT;
    private static final SubLSymbol $sym120$NART_P;
    private static final SubLSymbol $sym121$HLT_REMOVE_NART;
    private static final SubLSymbol $sym122$HLT_UNASSERT;
    private static final SubLSymbol $sym123$HLT_REMOVE_ASSERTION;
    private static final SubLSymbol $sym124$HLT_REMOVE_DEDUCTION;
    private static final SubLSymbol $sym125$HLT_MERGE;
    private static final SubLSymbol $sym126$HLT_RENAME;
    private static final SubLSymbol $sym127$LISTP;
    private static final SubLSymbol $sym128$HLT_RENAME_VARIABLES;
    private static final SubLString $str129$Could_not_open_an_input_stream_fo;
    private static final SubLInteger $int130$100;
    private static final SubLString $str131$_HL_CONSTANT_LIST_RESET___;
    private static final SubLString $str132$_HL_CONSTANT_LIST_APPEND__S__S__S;
    private static final SubLSymbol $sym133$OPERATOR_IS_HL_FIND_CONSTANT;
    private static final SubLSymbol $sym134$TRANSFORM_HL_FIND_CONSTANT_ONLY;
    private static final SubLString $str135$_S__;
    private static final SubLSymbol $sym136$GATHER_ALL_CONSTANTS_IN_HL_FORM;
    private static final SubLSymbol $sym137$HLFC;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 927L)
    public static SubLObject hl_quotify(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue());
        if (hl_transcript_tracing.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return list_utilities.quotify(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 1290L)
    public static SubLObject within_hl_evalP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hl_transcript_tracing.$within_hl_evalP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 1355L)
    public static SubLObject hl_eval(final SubLObject hl_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subform = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        try {
            thread.throwStack.push(hl_transcript_tracing.$kw1$HL_UNQUOTIFY_FAILURE);
            final SubLObject _prev_bind_0 = hl_transcript_tracing.$within_hl_evalP$.currentBinding(thread);
            try {
                hl_transcript_tracing.$within_hl_evalP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                result = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(eval_in_api.cyc_api_eval(hl_form)));
            }
            finally {
                hl_transcript_tracing.$within_hl_evalP$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            subform = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcript_tracing.$kw1$HL_UNQUOTIFY_FAILURE);
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcript_tracing.NIL != subform) {
            return Errors.error((SubLObject)hl_transcript_tracing.$str2$HL_Lookup_failure_with____S, hl_resolve(subform));
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym3$VALUES), result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 1682L)
    public static SubLObject hl_eval_error(final SubLObject subform) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hl_transcript_tracing.NIL != hl_transcript_tracing.$within_hl_evalP$.getDynamicValue(thread)) {
            return Dynamic.sublisp_throw((SubLObject)hl_transcript_tracing.$kw1$HL_UNQUOTIFY_FAILURE, subform);
        }
        return Errors.error((SubLObject)hl_transcript_tracing.$str4$HL_Lookup_failure_with___S, hl_resolve(subform));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 1872L)
    public static SubLObject hl_quotify_cons_method(final SubLObject v_object) {
        if (hl_transcript_tracing.NIL != list_utilities.tree_find_if((SubLObject)hl_transcript_tracing.$sym5$HL_KB_OBJECT_P, v_object, (SubLObject)hl_transcript_tracing.UNPROVIDED)) {
            return hl_quotify_list_careful(v_object);
        }
        return list_utilities.quotify(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 2048L)
    public static SubLObject hl_kb_object_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_transcript_tracing.NIL != constant_handles.constant_p(v_object) || hl_transcript_tracing.NIL != nart_handles.nart_p(v_object) || hl_transcript_tracing.NIL != variables.variable_p(v_object) || hl_transcript_tracing.NIL != assertion_handles.assertion_p(v_object) || hl_transcript_tracing.NIL != deduction_handles.deduction_p(v_object) || hl_transcript_tracing.NIL != kb_hl_support_handles.kb_hl_support_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 2258L)
    public static SubLObject hl_quotify_list_careful(final SubLObject list) {
        if (hl_transcript_tracing.NIL != list_utilities.proper_list_p(list)) {
            return reader.bq_cons((SubLObject)hl_transcript_tracing.$sym7$LIST, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym8$HL_QUOTIFY), list), (SubLObject)hl_transcript_tracing.NIL));
        }
        final SubLObject butlast = conses_high.butlast(list, (SubLObject)hl_transcript_tracing.UNPROVIDED);
        final SubLObject last_cons = conses_high.last(list, (SubLObject)hl_transcript_tracing.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = last_cons;
        SubLObject pre_dotted = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject dotted = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list9);
        pre_dotted = current.first();
        current = (dotted = current.rest());
        return reader.bq_cons((SubLObject)hl_transcript_tracing.$sym10$LIST_, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym8$HL_QUOTIFY), butlast), (SubLObject)ConsesLow.list(hl_quotify(pre_dotted), hl_quotify(dotted))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 2700L)
    public static SubLObject hl_quotify_constant_method(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = constants_high.constant_name(v_object);
        final SubLObject external_id = (SubLObject)((hl_transcript_tracing.NIL != hl_transcript_tracing.$hlt_include_constant_external_idsP$.getDynamicValue(thread)) ? constants_high.constant_external_id(v_object) : hl_transcript_tracing.NIL);
        return hl_quotify_constant_int(name, external_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 2943L)
    public static SubLObject hl_quotify_constant_int(final SubLObject name, final SubLObject external_id) {
        return (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym12$HL_FIND_CONSTANT, hl_quotify(name), ConsesLow.append((SubLObject)((hl_transcript_tracing.NIL != external_id) ? ConsesLow.list(hl_quotify(external_id)) : hl_transcript_tracing.NIL), (SubLObject)hl_transcript_tracing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 3112L)
    public static SubLObject hl_find_constant(final SubLObject name, SubLObject external_id) {
        if (external_id == hl_transcript_tracing.UNPROVIDED) {
            external_id = (SubLObject)hl_transcript_tracing.NIL;
        }
        SubLObject constant = (hl_transcript_tracing.NIL != external_id) ? constants_high.find_constant_by_external_id(external_id) : constants_high.find_constant(name);
        if (hl_transcript_tracing.NIL != constant_handles.constant_p(constant)) {
            return constant;
        }
        constant = hl_transcripts.hlt_find_or_create_missing_constant(name, external_id);
        if (hl_transcript_tracing.NIL != constant_handles.constant_p(constant)) {
            return constant;
        }
        return hl_eval_error(hl_quotify_constant_int(name, external_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 3531L)
    public static SubLObject hl_quotify_nart_method(final SubLObject v_object) {
        final SubLObject canonical_naut = narts_high.nart_hl_formula(v_object);
        return hl_quotify_nart_int(canonical_naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 3685L)
    public static SubLObject hl_quotify_nart_int(final SubLObject canonical_naut) {
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym14$HL_FIND_NART, hl_quotify(canonical_naut));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 3795L)
    public static SubLObject hl_find_nart(final SubLObject canonical_naut) {
        SubLObject nart = narts_high.find_nart(canonical_naut);
        if (hl_transcript_tracing.NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        nart = hl_transcripts.hlt_find_or_create_missing_nart(canonical_naut);
        if (hl_transcript_tracing.NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        return hl_eval_error(hl_quotify_nart_int(canonical_naut));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4099L)
    public static SubLObject hl_quotify_variable_method(final SubLObject v_object) {
        final SubLObject id = variables.variable_id(v_object);
        return hl_quotify_variable_int(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4237L)
    public static SubLObject hl_quotify_variable_int(final SubLObject id) {
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym16$HL_VAR, id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4306L)
    public static SubLObject hl_var(final SubLObject id) {
        final SubLObject variable = variables.get_variable(id);
        if (hl_transcript_tracing.NIL != variables.variable_p(variable)) {
            return variable;
        }
        return hl_eval_error(hl_quotify_variable_int(id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4472L)
    public static SubLObject hl_quotify_assertion_method(final SubLObject v_object) {
        if (hl_transcript_tracing.NIL != assertions_high.gaf_assertionP(v_object)) {
            return hl_quotify_gaf(v_object);
        }
        return hl_quotify_rule(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4644L)
    public static SubLObject hl_quotify_gaf(final SubLObject gaf) {
        final SubLObject hl_formula = assertions_high.gaf_hl_formula(gaf);
        final SubLObject mt = assertions_high.assertion_mt(gaf);
        return hl_quotify_gaf_int(hl_formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4813L)
    public static SubLObject hl_quotify_rule(final SubLObject v_object) {
        final SubLObject cnf = assertions_high.assertion_cnf(v_object);
        final SubLObject mt = assertions_high.assertion_mt(v_object);
        return hl_quotify_rule_int(cnf, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 4966L)
    public static SubLObject hl_quotify_gaf_int(final SubLObject hl_formula, final SubLObject mt) {
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym18$HL_FIND_GAF, hl_quotify(hl_formula), hl_quotify(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 5088L)
    public static SubLObject hl_quotify_rule_int(final SubLObject cnf, final SubLObject mt) {
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym19$HL_FIND_RULE, hl_quotify(cnf), hl_quotify(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 5198L)
    public static SubLObject hl_find_gaf(final SubLObject gaf_formula, final SubLObject mt) {
        SubLObject gaf = kb_indexing.find_gaf(gaf_formula, mt);
        if (hl_transcript_tracing.NIL != assertion_handles.assertion_p(gaf)) {
            return gaf;
        }
        gaf = hl_transcripts.hlt_find_or_create_missing_gaf(gaf_formula, mt);
        if (hl_transcript_tracing.NIL != assertion_handles.assertion_p(gaf)) {
            return gaf;
        }
        return hl_eval_error(hl_quotify_gaf_int(gaf_formula, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 5511L)
    public static SubLObject hl_find_rule(final SubLObject cnf, final SubLObject mt) {
        SubLObject rule = kb_indexing.find_assertion(cnf, mt);
        if (hl_transcript_tracing.NIL != assertion_handles.assertion_p(rule)) {
            return rule;
        }
        rule = hl_transcripts.hlt_find_or_create_missing_rule(cnf, mt);
        if (hl_transcript_tracing.NIL != assertion_handles.assertion_p(rule)) {
            return rule;
        }
        return hl_eval_error(hl_quotify_rule_int(cnf, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 5806L)
    public static SubLObject hl_quotify_deduction_method(final SubLObject v_object) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(v_object);
        final SubLObject supports = deductions_high.deduction_supports(v_object);
        final SubLObject truth = deductions_high.deduction_truth(v_object);
        final SubLObject v_bindings = deductions_high.deduction_bindings(v_object);
        final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(v_object);
        return hl_quotify_deduction_int(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 6314L)
    public static SubLObject hl_quotify_deduction_int(final SubLObject supported_object, final SubLObject supports, final SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (v_bindings == hl_transcript_tracing.UNPROVIDED) {
            v_bindings = (SubLObject)hl_transcript_tracing.NIL;
        }
        if (pragmatic_support_mts == hl_transcript_tracing.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_transcript_tracing.NIL;
        }
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym21$HL_FIND_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports), hl_quotify(truth), hl_quotify(v_bindings), hl_quotify(pragmatic_support_mts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 6604L)
    public static SubLObject hl_find_deduction(final SubLObject supported_object, final SubLObject supports, SubLObject truth, SubLObject v_bindings, SubLObject pragmatic_support_mts) {
        if (truth == hl_transcript_tracing.UNPROVIDED) {
            truth = (SubLObject)hl_transcript_tracing.$kw22$TRUE;
        }
        if (v_bindings == hl_transcript_tracing.UNPROVIDED) {
            v_bindings = (SubLObject)hl_transcript_tracing.NIL;
        }
        if (pragmatic_support_mts == hl_transcript_tracing.UNPROVIDED) {
            pragmatic_support_mts = (SubLObject)hl_transcript_tracing.NIL;
        }
        SubLObject deduction = deductions_high.find_deduction(supported_object, supports, truth);
        if (hl_transcript_tracing.NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        deduction = hl_transcripts.hlt_find_or_create_missing_deduction(supported_object, supports, truth, v_bindings, pragmatic_support_mts);
        if (hl_transcript_tracing.NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        return hl_eval_error(hl_quotify_deduction_int(supported_object, supports, truth, v_bindings, pragmatic_support_mts));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 7155L)
    public static SubLObject hl_quotify_kb_hl_support_method(final SubLObject v_object) {
        final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(v_object);
        if (v_object.eql(hl_support)) {
            Errors.error((SubLObject)hl_transcript_tracing.$str23$Circular_KB_HL_Support_dependency);
        }
        return hl_quotify_kb_hl_support_int(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 7430L)
    public static SubLObject hl_quotify_kb_hl_support_int(final SubLObject hl_support) {
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym25$HL_FIND_KB_HL_SUPPORT, hl_quotify(hl_support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 7550L)
    public static SubLObject hl_find_kb_hl_support(final SubLObject hl_support) {
        SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
        if (hl_transcript_tracing.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
            return kb_hl_support;
        }
        kb_hl_support = hl_transcripts.hlt_find_or_create_missing_kb_hl_support(hl_support);
        if (hl_transcript_tracing.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support)) {
            return kb_hl_support;
        }
        return hl_quotify_kb_hl_support_int(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 7938L)
    public static SubLObject hl_resolve(final SubLObject hl_op) {
        if (hl_op.isAtom() || hl_transcript_tracing.NIL != list_utilities.quote_form_p(hl_op)) {
            return hl_op;
        }
        SubLObject operator = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject args = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(hl_op, hl_op, (SubLObject)hl_transcript_tracing.$list26);
        operator = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        args = Mapping.mapcar((SubLObject)hl_transcript_tracing.$sym27$HL_RESOLVE_RECURSIVE, args);
        return (SubLObject)ConsesLow.cons(operator, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 8356L)
    public static SubLObject hl_resolve_recursive(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (form.isAtom() || hl_transcript_tracing.NIL != list_utilities.quote_form_p(form)) {
            return form;
        }
        SubLObject resolved = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject validP = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject ignore_errors_tag = (SubLObject)hl_transcript_tracing.NIL;
        try {
            thread.throwStack.push(hl_transcript_tracing.$kw28$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym29$IGNORE_ERRORS_HANDLER), thread);
                try {
                    resolved = hl_eval(form);
                    validP = (SubLObject)hl_transcript_tracing.T;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_transcript_tracing.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcript_tracing.$kw28$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcript_tracing.NIL != validP) {
            return resolved;
        }
        SubLObject operator = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject args = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)hl_transcript_tracing.$list26);
        operator = form.first();
        final SubLObject current = args = form.rest();
        args = Mapping.mapcar((SubLObject)hl_transcript_tracing.$sym27$HL_RESOLVE_RECURSIVE, args);
        return (SubLObject)ConsesLow.cons(operator, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9024L)
    public static SubLObject hlt_trace_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9165L)
    public static SubLObject hlt_trace_op(final SubLObject hl_op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_tracedP = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject release = (SubLObject)hl_transcript_tracing.NIL;
        try {
            release = Locks.seize_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            SubLObject cdolist_list_var = hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread);
            SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
            stream = cdolist_list_var.first();
            while (hl_transcript_tracing.NIL != cdolist_list_var) {
                hlt_trace_op_internal(hl_op, stream);
                some_tracedP = (SubLObject)hl_transcript_tracing.T;
                cdolist_list_var = cdolist_list_var.rest();
                stream = cdolist_list_var.first();
            }
        }
        finally {
            if (hl_transcript_tracing.NIL != release) {
                Locks.release_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            }
        }
        return some_tracedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9447L)
    public static SubLObject hlt_trace_op_internal(final SubLObject hl_op, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_length$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
            print_high.$print_level$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
            if (hl_transcript_tracing.NIL != hl_transcript_tracing.$hlt_format_operationsP$.getDynamicValue(thread)) {
                format_cycl_expression.format_cycl_expression(hl_op, stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            }
            else {
                final SubLObject _prev_bind_0_$1 = print_high.$print_pretty$.currentBinding(thread);
                try {
                    print_high.$print_pretty$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    streams_high.terpri(stream);
                    print_high.prin1(hl_op, stream);
                }
                finally {
                    print_high.$print_pretty$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_2, thread);
            print_high.$print_length$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hl_transcript_tracing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 9791L)
    public static SubLObject with_hl_transcript_trace_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list32);
        stream = current.first();
        current = current.rest();
        if (hl_transcript_tracing.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcript_tracing.$list32);
            return (SubLObject)hl_transcript_tracing.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (!stream.isAtom()) {
            final SubLObject stream_var = (SubLObject)hl_transcript_tracing.$sym33$STREAM_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(stream_var, stream)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym35$WITH_HL_TRANSCRIPT_TRACE_TO_STREAM, (SubLObject)ConsesLow.list(stream_var), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym36$PROGN, (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym37$_HLT_TRACE_STREAMS_, (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym38$CONS, stream, (SubLObject)hl_transcript_tracing.$list39))), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym40$FORCE_OUTPUT, stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 10166L)
    public static SubLObject without_hl_transcript_trace_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list32);
        stream = current.first();
        current = current.rest();
        if (hl_transcript_tracing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym36$PROGN, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym40$FORCE_OUTPUT, stream), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym37$_HLT_TRACE_STREAMS_, (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym41$REMOVE, stream, (SubLObject)hl_transcript_tracing.$list39))), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcript_tracing.$list32);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 10432L)
    public static SubLObject with_hl_transcript_trace_to_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list42);
        filename = current.first();
        current = current.rest();
        if (hl_transcript_tracing.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcript_tracing.$list42);
            return (SubLObject)hl_transcript_tracing.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (!filename.isAtom()) {
            final SubLObject filename_var = (SubLObject)hl_transcript_tracing.$sym43$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym44$WITH_HL_TRANSCRIPT_TRACE_TO_FILE, (SubLObject)ConsesLow.list(filename_var), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)));
        }
        final SubLObject stream = (SubLObject)hl_transcript_tracing.$sym45$STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list(stream), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym46$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym36$PROGN, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym47$WITH_STREAM_BUFFER_SIZE, (SubLObject)hl_transcript_tracing.$list48, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym49$CSETQ, stream, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym50$ENSURE_PRIVATE_STREAM, (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym51$OPEN_TEXT, filename, (SubLObject)hl_transcript_tracing.$list52)))), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym53$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym54$STREAMP, stream), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym55$ERROR, (SubLObject)hl_transcript_tracing.$str56$Unable_to_open__S, filename)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym35$WITH_HL_TRANSCRIPT_TRACE_TO_STREAM, (SubLObject)ConsesLow.list(stream), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL))), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym57$PWHEN, stream, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym40$FORCE_OUTPUT, stream), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym58$CLOSE, stream))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 11188L)
    public static SubLObject start_hl_transcript_trace_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcript_tracing.NIL != Types.stringp(filename) : filename;
        SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            stream = compatibility.open_text(filename, (SubLObject)hl_transcript_tracing.$kw60$OUTPUT);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        if (stream.isStream()) {
            SubLObject release = (SubLObject)hl_transcript_tracing.NIL;
            try {
                release = Locks.seize_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
                hl_transcript_tracing.$hlt_trace_streams$.setDynamicValue((SubLObject)ConsesLow.cons(stream, hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread)), thread);
            }
            finally {
                if (hl_transcript_tracing.NIL != release) {
                    Locks.release_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
                }
            }
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 11612L)
    public static SubLObject stop_all_hl_transcript_traces_to_files() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        SubLObject streams = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject release = (SubLObject)hl_transcript_tracing.NIL;
        try {
            release = Locks.seize_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            streams = hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread);
        }
        finally {
            if (hl_transcript_tracing.NIL != release) {
                Locks.release_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            }
        }
        SubLObject cdolist_list_var = streams;
        SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
        stream = cdolist_list_var.first();
        while (hl_transcript_tracing.NIL != cdolist_list_var) {
            stop_hl_transcript_trace_to_file(stream);
            total = Numbers.add(total, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            stream = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 11898L)
    public static SubLObject stop_hl_transcript_trace_to_file(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcript_tracing.NIL != Types.streamp(stream) : stream;
        try {
            SubLObject release = (SubLObject)hl_transcript_tracing.NIL;
            try {
                release = Locks.seize_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
                hl_transcript_tracing.$hlt_trace_streams$.setDynamicValue(list_utilities.delete_first(stream, hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)hl_transcript_tracing.EQ)), thread);
            }
            finally {
                if (hl_transcript_tracing.NIL != release) {
                    Locks.release_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.force_output(stream);
                streams_high.close(stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 12198L)
    public static SubLObject flush_hl_transcript_trace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        SubLObject release = (SubLObject)hl_transcript_tracing.NIL;
        try {
            release = Locks.seize_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            SubLObject cdolist_list_var = hl_transcript_tracing.$hlt_trace_streams$.getDynamicValue(thread);
            SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
            stream = cdolist_list_var.first();
            while (hl_transcript_tracing.NIL != cdolist_list_var) {
                streams_high.force_output(stream);
                total = Numbers.add(total, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                stream = cdolist_list_var.first();
            }
        }
        finally {
            if (hl_transcript_tracing.NIL != release) {
                Locks.release_lock(hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue());
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 12403L)
    public static SubLObject do_hl_transcript_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_op_var = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject filename = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list61);
        hl_op_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_transcript_tracing.$list61);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject current_$2 = (SubLObject)hl_transcript_tracing.NIL;
        while (hl_transcript_tracing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcript_tracing.$list61);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hl_transcript_tracing.$list61);
            if (hl_transcript_tracing.NIL == conses_high.member(current_$2, (SubLObject)hl_transcript_tracing.$list62, (SubLObject)hl_transcript_tracing.UNPROVIDED, (SubLObject)hl_transcript_tracing.UNPROVIDED)) {
                bad = (SubLObject)hl_transcript_tracing.T;
            }
            if (current_$2 == hl_transcript_tracing.$kw63$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hl_transcript_tracing.NIL != bad && hl_transcript_tracing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_transcript_tracing.$list61);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcript_tracing.$kw64$STREAM, current);
        final SubLObject stream = (SubLObject)((hl_transcript_tracing.NIL != stream_tail) ? conses_high.cadr(stream_tail) : hl_transcript_tracing.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcript_tracing.$kw65$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((hl_transcript_tracing.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : hl_transcript_tracing.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hl_transcript_tracing.$kw66$DONE, current);
        final SubLObject done = (SubLObject)((hl_transcript_tracing.NIL != done_tail) ? conses_high.cadr(done_tail) : hl_transcript_tracing.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!filename.isAtom()) {
            final SubLObject filename_var = (SubLObject)hl_transcript_tracing.$sym67$FILENAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym68$DO_HL_TRANSCRIPT_TRACE, (SubLObject)ConsesLow.list(hl_op_var, filename_var, (SubLObject)hl_transcript_tracing.$kw65$PROGRESS_MESSAGE, progress_message, (SubLObject)hl_transcript_tracing.$kw66$DONE, done), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = (SubLObject)hl_transcript_tracing.$sym69$PROGRESS_MESSAGE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym68$DO_HL_TRANSCRIPT_TRACE, (SubLObject)ConsesLow.list(hl_op_var, filename, (SubLObject)hl_transcript_tracing.$kw65$PROGRESS_MESSAGE, progress_message_var, (SubLObject)hl_transcript_tracing.$kw66$DONE, done), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL)));
        }
        if (hl_transcript_tracing.NIL == stream) {
            final SubLObject in_stream_var = (SubLObject)hl_transcript_tracing.$sym70$IN_STREAM_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym47$WITH_STREAM_BUFFER_SIZE, (SubLObject)hl_transcript_tracing.$list48, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym71$WITH_PRIVATE_TEXT_FILE, (SubLObject)ConsesLow.listS(in_stream_var, filename, (SubLObject)hl_transcript_tracing.$list72), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym49$CSETQ, in_stream_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym73$ENABLE_FILE_STREAM_MEMORY_MAPPING, in_stream_var)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym68$DO_HL_TRANSCRIPT_TRACE, (SubLObject)ConsesLow.list(hl_op_var, filename, (SubLObject)hl_transcript_tracing.$kw64$STREAM, in_stream_var, (SubLObject)hl_transcript_tracing.$kw65$PROGRESS_MESSAGE, progress_message, (SubLObject)hl_transcript_tracing.$kw66$DONE, done), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL))));
        }
        if (hl_transcript_tracing.NIL != progress_message) {
            final SubLObject total = (SubLObject)hl_transcript_tracing.$sym74$TOTAL;
            final SubLObject sofar = (SubLObject)hl_transcript_tracing.$sym75$SOFAR;
            return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym76$FILE_LENGTH, stream)), reader.bq_cons(sofar, (SubLObject)hl_transcript_tracing.$list77)), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym78$CHECK_TYPE, progress_message, (SubLObject)hl_transcript_tracing.$list79), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym80$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym68$DO_HL_TRANSCRIPT_TRACE, (SubLObject)ConsesLow.list(hl_op_var, filename, (SubLObject)hl_transcript_tracing.$kw64$STREAM, stream, (SubLObject)hl_transcript_tracing.$kw65$PROGRESS_MESSAGE, (SubLObject)hl_transcript_tracing.NIL, (SubLObject)hl_transcript_tracing.$kw66$DONE, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym49$CSETQ, sofar, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym81$GET_FILE_POSITION, stream)), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym82$NOTE_PERCENT_PROGRESS, sofar, total), ConsesLow.append(body, (SubLObject)hl_transcript_tracing.NIL))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym34$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(hl_op_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym83$LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION, stream))), (SubLObject)ConsesLow.listS((SubLObject)hl_transcript_tracing.$sym84$WHILE, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym85$CAND, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym86$CNOT, done), (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym86$CNOT, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.EQ, (SubLObject)hl_transcript_tracing.$kw87$EOF, hl_op_var))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym49$CSETQ, hl_op_var, (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym83$LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION, stream))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 14471L)
    public static SubLObject load_one_hl_transcript_trace_operation(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject hl_op = (SubLObject)hl_transcript_tracing.$kw88$UNINITIALIZED;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)hl_transcript_tracing.$sym89$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    hl_op = reader.read(stream, (SubLObject)hl_transcript_tracing.NIL, (SubLObject)hl_transcript_tracing.$kw87$EOF, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_transcript_tracing.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_transcript_tracing.NIL != error_message) {
            return (SubLObject)hl_transcript_tracing.$kw87$EOF;
        }
        return hl_op;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 14751L)
    public static SubLObject load_hl_transcript_trace(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == hl_transcript_tracing.UNPROVIDED) {
            error_mode = (SubLObject)hl_transcript_tracing.$kw90$WARN;
        }
        return load_hl_transcript_trace_original(filename, error_mode);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 15175L)
    public static SubLObject load_hl_transcript_trace_refactored(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == hl_transcript_tracing.UNPROVIDED) {
            error_mode = (SubLObject)hl_transcript_tracing.$kw90$WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = Sequences.cconcatenate((SubLObject)hl_transcript_tracing.$str91$Loading_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
        SubLObject total_ops = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        SubLObject success_ops = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
            try {
                final SubLObject _prev_bind_0_$3 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)hl_transcript_tracing.$kw92$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$3, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcript_tracing.$str56$Unable_to_open__S, filename);
                }
                SubLObject in_stream_var = stream;
                in_stream_var = file_utilities.enable_file_stream_memory_mapping(in_stream_var);
                final SubLObject total = streams_high.file_length(in_stream_var);
                SubLObject sofar = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
                assert hl_transcript_tracing.NIL != Types.stringp(message) : message;
                final SubLObject _prev_bind_0_$4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_2_$6 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcript_tracing.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(message);
                        for (SubLObject hl_op = load_one_hl_transcript_trace_operation(in_stream_var); hl_transcript_tracing.$kw87$EOF != hl_op; hl_op = load_one_hl_transcript_trace_operation(in_stream_var)) {
                            sofar = compatibility.get_file_position(in_stream_var);
                            utilities_macros.note_percent_progress(sofar, total);
                            if (hl_transcript_tracing.NIL != process_hl_transcript_trace_operation(hl_op, error_mode, total_ops)) {
                                success_ops = Numbers.add(success_ops, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                            }
                            total_ops = Numbers.add(total_ops, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$6, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$5, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(success_ops, Numbers.subtract(total_ops, success_ops));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 15832L)
    public static SubLObject load_hl_transcript_trace_original(final SubLObject filename, SubLObject error_mode) {
        if (error_mode == hl_transcript_tracing.UNPROVIDED) {
            error_mode = (SubLObject)hl_transcript_tracing.$kw90$WARN;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_ops = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        SubLObject success_ops = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        SubLObject file_size = (SubLObject)hl_transcript_tracing.NIL;
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
            try {
                final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)hl_transcript_tracing.$kw92$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcript_tracing.$str56$Unable_to_open__S, filename);
                }
                SubLObject stream_$10 = stream;
                stream_$10 = file_utilities.enable_file_stream_memory_mapping(stream_$10);
                file_size = streams_high.file_length(stream_$10);
                final SubLObject message = Sequences.cconcatenate((SubLObject)hl_transcript_tracing.$str91$Loading_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
                final SubLObject _prev_bind_0_$10 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcript_tracing.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(message);
                        SubLObject hl_op = load_one_hl_transcript_trace_operation(stream_$10);
                        SubLObject sofar = streams_high.file_position(stream_$10, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                        while (hl_op != hl_transcript_tracing.$kw87$EOF) {
                            utilities_macros.note_percent_progress(sofar, file_size);
                            if (hl_transcript_tracing.NIL != process_hl_transcript_trace_operation(hl_op, error_mode, total_ops)) {
                                success_ops = Numbers.add(success_ops, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                            }
                            total_ops = Numbers.add(total_ops, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                            hl_op = load_one_hl_transcript_trace_operation(stream_$10);
                            sofar = streams_high.file_position(stream_$10, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
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
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_1_$12, thread);
                    kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$10, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return Values.values(success_ops, Numbers.subtract(total_ops, success_ops));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 16958L)
    public static SubLObject process_hl_transcript_trace_operation(final SubLObject hl_op, final SubLObject error_mode, final SubLObject total_ops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = (SubLObject)hl_transcript_tracing.NIL;
        if (error_mode.eql((SubLObject)hl_transcript_tracing.$kw95$IGNORE)) {
            SubLObject ignore_errors_tag = (SubLObject)hl_transcript_tracing.NIL;
            try {
                thread.throwStack.push(hl_transcript_tracing.$kw28$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym29$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        process_hl_transcript_trace_operation_int(hl_op);
                        success = (SubLObject)hl_transcript_tracing.T;
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)hl_transcript_tracing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)hl_transcript_tracing.$kw28$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else if (error_mode.eql((SubLObject)hl_transcript_tracing.$kw90$WARN)) {
            SubLObject error_message = (SubLObject)hl_transcript_tracing.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)hl_transcript_tracing.$sym89$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        process_hl_transcript_trace_operation_int(hl_op);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)hl_transcript_tracing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (hl_transcript_tracing.NIL != error_message) {
                Errors.warn((SubLObject)hl_transcript_tracing.$str96$operation__S___S___A, total_ops, hl_resolve(hl_op), error_message);
            }
            else {
                success = (SubLObject)hl_transcript_tracing.T;
            }
        }
        else if (error_mode.eql((SubLObject)hl_transcript_tracing.$kw97$ERROR)) {
            process_hl_transcript_trace_operation_int(hl_op);
            success = (SubLObject)hl_transcript_tracing.T;
        }
        else {
            Errors.error((SubLObject)hl_transcript_tracing.$str98$unexpected_error_mode__S, error_mode);
        }
        return success;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 17661L)
    public static SubLObject process_hl_transcript_trace_operation_int(final SubLObject hl_op) {
        return hl_eval(hl_op);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 17827L)
    public static SubLObject analyze_hl_transcript_trace(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcript_tracing.NIL != Types.stringp(filename) : filename;
        final SubLObject message = Sequences.cconcatenate((SubLObject)hl_transcript_tracing.$str99$Analyzing_HL_transcript_Trace_, format_nil.format_nil_a_no_copy(filename));
        final SubLObject operation_count_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_transcript_tracing.EQ), (SubLObject)hl_transcript_tracing.TEN_INTEGER);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
            try {
                final SubLObject _prev_bind_0_$15 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)hl_transcript_tracing.$kw92$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$15, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)hl_transcript_tracing.$str56$Unable_to_open__S, filename);
                }
                SubLObject in_stream_var = stream;
                in_stream_var = file_utilities.enable_file_stream_memory_mapping(in_stream_var);
                final SubLObject total = streams_high.file_length(in_stream_var);
                SubLObject sofar = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
                assert hl_transcript_tracing.NIL != Types.stringp(message) : message;
                final SubLObject _prev_bind_0_$16 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$17 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)hl_transcript_tracing.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(message);
                        for (SubLObject hl_op = load_one_hl_transcript_trace_operation(in_stream_var); hl_transcript_tracing.$kw87$EOF != hl_op; hl_op = load_one_hl_transcript_trace_operation(in_stream_var)) {
                            sofar = compatibility.get_file_position(in_stream_var);
                            utilities_macros.note_percent_progress(sofar, total);
                            analyze_one_hl_transcript_trace_operation(hl_op, operation_count_map);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$17, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        SubLObject analysis_alist = dictionary_utilities.dictionary_to_alist(operation_count_map);
        analysis_alist = Sort.sort(analysis_alist, Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym100$_), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym101$CDR));
        return list_utilities.alist_to_plist(analysis_alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 18671L)
    public static SubLObject analyze_one_hl_transcript_trace_operation(final SubLObject hl_op, final SubLObject operation_count_map) {
        final SubLObject operator = hl_op.first();
        dictionary_utilities.dictionary_increment(operation_count_map, operator, (SubLObject)hl_transcript_tracing.UNPROVIDED);
        dictionary_utilities.dictionary_increment(operation_count_map, (SubLObject)hl_transcript_tracing.$kw102$TOTAL, (SubLObject)hl_transcript_tracing.UNPROVIDED);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 18919L)
    public static SubLObject note_hlt_find_or_create(final SubLObject constant) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != constant_handles.constant_p(constant) : constant;
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym104$HLT_FIND_OR_CREATE, hl_quotify(name), hl_quotify(external_id));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 19621L)
    public static SubLObject note_hlt_find_or_create_nart(final SubLObject canonical_naut) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym105$HLT_FIND_OR_CREATE_NART, hl_quotify(canonical_naut));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 19950L)
    public static SubLObject note_hlt_find_or_create_assertion(final SubLObject assertion) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject var_names = assertions_high.assertion_variable_names(assertion);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym107$HLT_FIND_OR_CREATE_ASSERTION, hl_quotify(cnf), hl_quotify(mt), hl_quotify(var_names), hl_quotify(direction), hl_quotify(truth), hl_quotify(strength), hl_quotify(asserted_argument));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 20811L)
    public static SubLObject note_hlt_assert(final SubLObject assertion) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            final SubLObject sentence = canon_tl.assertion_tl_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            final SubLObject bookkeeping_info = cyc_bookkeeping.assertion_bookkeeping_info(assertion);
            result = note_hlt_assert_sentence(sentence, mt, strength, direction, bookkeeping_info);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 21515L)
    public static SubLObject note_hlt_assert_bookkeeping_sentence(final SubLObject sentence, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
            assert hl_transcript_tracing.NIL != hlmt.possibly_hlmt_p(mt) : mt;
            final SubLObject strength = (SubLObject)hl_transcript_tracing.$kw110$MONOTONIC;
            final SubLObject direction = (SubLObject)hl_transcript_tracing.$kw111$BACKWARD;
            final SubLObject bookkeeping_info = (SubLObject)hl_transcript_tracing.NIL;
            result = note_hlt_assert_sentence(sentence, mt, strength, direction, bookkeeping_info);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 22048L)
    public static SubLObject note_hlt_assert_sentence(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject bookkeeping_info) {
        final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym112$HLT_ASSERT, hl_quotify(sentence), hl_quotify(mt), hl_quotify(strength), hl_quotify(direction), hl_quotify(bookkeeping_info));
        return hlt_trace_op(hl_op);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 22341L)
    public static SubLObject note_hlt_timestamp_assertion(final SubLObject assertion) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            final SubLObject who = assertions_high.asserted_by(assertion);
            final SubLObject when = assertions_high.asserted_when(assertion);
            final SubLObject why = assertions_high.asserted_why(assertion);
            final SubLObject second = assertions_high.asserted_second(assertion);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym113$HLT_TIMESTAMP_ASSERTION, hl_quotify(assertion), hl_quotify(who), hl_quotify(when), hl_quotify(why), hl_quotify(second));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 22978L)
    public static SubLObject note_hlt_find_or_create_kb_hl_support(final SubLObject kb_hl_support) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != kb_hl_support_handles.kb_hl_support_p(kb_hl_support) : kb_hl_support;
            final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(kb_hl_support);
            final SubLObject justification = kb_hl_supports_high.kb_hl_support_justification(kb_hl_support);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym115$HLT_FIND_OR_CREATE_KB_HL_SUPPORT, hl_quotify(hl_support), hl_quotify(justification));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 23549L)
    public static SubLObject note_hlt_find_or_create_deduction(final SubLObject deduction) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != deduction_handles.deduction_p(deduction) : deduction;
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            if (hl_transcript_tracing.NIL != assertion_handles.assertion_p(supported_object)) {
                final SubLObject supports = deductions_high.deduction_supports(deduction);
                final SubLObject truth = deductions_high.deduction_truth(deduction);
                final SubLObject v_bindings = deductions_high.deduction_bindings(deduction);
                final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(deduction);
                final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym117$HLT_FIND_OR_CREATE_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports), hl_quotify(truth), hl_quotify(v_bindings), hl_quotify(pragmatic_support_mts));
                result = hlt_trace_op(hl_op);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 24496L)
    public static SubLObject note_hlt_add_skolem_defn(final SubLObject sk_defn, final SubLObject key) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym118$HLT_ADD_SKOLEM_DEFN, hl_quotify(sk_defn), hl_quotify(key));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 24781L)
    public static SubLObject hlt_add_skolem_defn(final SubLObject sk_defn, final SubLObject key) {
        return skolems.add_skolem_defn(sk_defn, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 24912L)
    public static SubLObject note_hlt_remove_constant(final SubLObject constant) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != constant_handles.constant_p(constant) : constant;
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym119$HLT_REMOVE_CONSTANT, hl_quotify(constant));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 25297L)
    public static SubLObject note_hlt_remove_nart(final SubLObject nart) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != nart_handles.nart_p(nart) : nart;
            final SubLObject canonical_naut = narts_high.nart_hl_formula(nart);
            if (hl_transcript_tracing.NIL != canonical_naut) {
                final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym121$HLT_REMOVE_NART, hl_quotify(canonical_naut));
                result = hlt_trace_op(hl_op);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 25704L)
    public static SubLObject hlt_remove_nart(final SubLObject canonical_naut) {
        final SubLObject nart = narts_high.find_nart(canonical_naut);
        if (hl_transcript_tracing.NIL != nart_handles.nart_p(nart)) {
            return fi.fi_kill_int(nart);
        }
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 25859L)
    public static SubLObject note_hlt_unassert(final SubLObject assertion) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            result = note_hlt_unassert_sentence(sentence, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 26253L)
    public static SubLObject note_hlt_unassert_bookkeeping_sentence(final SubLObject sentence, final SubLObject mt) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
            assert hl_transcript_tracing.NIL != hlmt.possibly_hlmt_p(mt) : mt;
            result = note_hlt_unassert_sentence(sentence, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 26624L)
    public static SubLObject note_hlt_unassert_sentence(final SubLObject sentence, final SubLObject mt) {
        final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym122$HLT_UNASSERT, hl_quotify(sentence), hl_quotify(mt));
        return hlt_trace_op(hl_op);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 26802L)
    public static SubLObject note_hlt_remove_assertion(final SubLObject assertion) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            final SubLObject sentence = ke.ke_assertion_find_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym123$HLT_REMOVE_ASSERTION, hl_quotify(sentence), hl_quotify(mt));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 27283L)
    public static SubLObject note_hlt_remove_deduction(final SubLObject deduction) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != deduction_handles.deduction_p(deduction) : deduction;
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            final SubLObject supports = deductions_high.deduction_supports(deduction);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym124$HLT_REMOVE_DEDUCTION, hl_quotify(supported_object), hl_quotify(supports));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 27806L)
    public static SubLObject hlt_remove_deduction(final SubLObject supported_object, final SubLObject supports) {
        final SubLObject deduction = deductions_high.find_deduction(supported_object, supports, (SubLObject)hl_transcript_tracing.UNPROVIDED);
        if (hl_transcript_tracing.NIL != deduction_handles.deduction_p(deduction)) {
            return tms.tms_remove_deduction(deduction);
        }
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 28061L)
    public static SubLObject hlt_merge(final SubLObject kill_term, final SubLObject keep_term) {
        return keep_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 28298L)
    public static SubLObject note_hlt_rename(final SubLObject constant, final SubLObject new_name) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != constant_handles.constant_p(constant) : constant;
            assert hl_transcript_tracing.NIL != Types.stringp(new_name) : new_name;
            final SubLObject external_id = constants_high.constant_external_id(constant);
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym126$HLT_RENAME, hl_quotify(external_id), hl_quotify(new_name));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 28778L)
    public static SubLObject hlt_rename(SubLObject constant, final SubLObject new_name) {
        if (hl_transcript_tracing.NIL == constant_handles.constant_p(constant)) {
            constant = constants_high.find_constant_by_external_id(constant);
        }
        return fi.fi_rename_int(constant, new_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 29060L)
    public static SubLObject note_hlt_rename_variables(final SubLObject assertion, final SubLObject new_variable_names) {
        SubLObject result = (SubLObject)hl_transcript_tracing.NIL;
        if (hl_transcript_tracing.NIL != hlt_trace_enabledP()) {
            assert hl_transcript_tracing.NIL != assertion_handles.assertion_p(assertion) : assertion;
            assert hl_transcript_tracing.NIL != Types.listp(new_variable_names) : new_variable_names;
            final SubLObject hl_op = (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym128$HLT_RENAME_VARIABLES, hl_quotify(assertion), hl_quotify(new_variable_names));
            result = hlt_trace_op(hl_op);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 29526L)
    public static SubLObject hlt_rename_variables(final SubLObject assertion, final SubLObject new_variable_names) {
        return assertions_interface.kb_set_assertion_variable_names(assertion, new_variable_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 30157L)
    public static SubLObject compress_hl_transcript_trace(final SubLObject input_filename, final SubLObject output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert hl_transcript_tracing.NIL != Types.stringp(input_filename) : input_filename;
        assert hl_transcript_tracing.NIL != Types.stringp(output_filename) : output_filename;
        SubLObject stream = (SubLObject)hl_transcript_tracing.NIL;
        try {
            stream = compatibility.open_text(input_filename, (SubLObject)hl_transcript_tracing.$kw92$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)hl_transcript_tracing.$str56$Unable_to_open__S, input_filename);
            }
            final SubLObject in = stream;
            if (!in.isStream()) {
                Errors.error((SubLObject)hl_transcript_tracing.$str129$Could_not_open_an_input_stream_fo, input_filename);
            }
            final SubLObject out = compatibility.open_text(output_filename, (SubLObject)hl_transcript_tracing.$kw60$OUTPUT);
            SubLObject done = (SubLObject)hl_transcript_tracing.NIL;
            SubLObject hl_op = (SubLObject)hl_transcript_tracing.NIL;
            final SubLObject _prev_bind_0 = hl_transcript_tracing.$hlt_constant_id_map$.currentBinding(thread);
            try {
                hl_transcript_tracing.$hlt_constant_id_map$.bind(Hashtables.make_hash_table((SubLObject)hl_transcript_tracing.$int130$100, Symbols.symbol_function((SubLObject)hl_transcript_tracing.EQUALP), (SubLObject)hl_transcript_tracing.UNPROVIDED), thread);
                SubLObject next_id = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
                final SubLObject _prev_bind_0_$20 = print_high.$print_pretty$.currentBinding(thread);
                try {
                    print_high.$print_pretty$.bind((SubLObject)hl_transcript_tracing.NIL, thread);
                    PrintLow.format(out, (SubLObject)hl_transcript_tracing.$str131$_HL_CONSTANT_LIST_RESET___);
                    while (hl_transcript_tracing.NIL == done) {
                        hl_op = load_one_hl_transcript_trace_operation(in);
                        SubLObject cdolist_list_var = Sequences.remove_duplicates(gather_all_constants_in_hl_form(hl_op), Symbols.symbol_function((SubLObject)hl_transcript_tracing.EQUALP), (SubLObject)hl_transcript_tracing.UNPROVIDED, (SubLObject)hl_transcript_tracing.UNPROVIDED, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                        SubLObject hl_id = (SubLObject)hl_transcript_tracing.NIL;
                        hl_id = cdolist_list_var.first();
                        while (hl_transcript_tracing.NIL != cdolist_list_var) {
                            if (hl_transcript_tracing.NIL == Hashtables.gethash(conses_high.third(hl_id), hl_transcript_tracing.$hlt_constant_id_map$.getDynamicValue(thread), (SubLObject)hl_transcript_tracing.UNPROVIDED)) {
                                Hashtables.sethash(conses_high.third(hl_id), hl_transcript_tracing.$hlt_constant_id_map$.getDynamicValue(thread), next_id);
                                PrintLow.format(out, (SubLObject)hl_transcript_tracing.$str132$_HL_CONSTANT_LIST_APPEND__S__S__S, new SubLObject[] { next_id, conses_high.second(hl_id), conses_high.third(hl_id) });
                                next_id = Numbers.add(next_id, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            hl_id = cdolist_list_var.first();
                        }
                        transform_list_utilities.ntransform(hl_op, Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym133$OPERATOR_IS_HL_FIND_CONSTANT), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym134$TRANSFORM_HL_FIND_CONSTANT_ONLY), (SubLObject)hl_transcript_tracing.UNPROVIDED, (SubLObject)hl_transcript_tracing.UNPROVIDED, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                        if (hl_op == hl_transcript_tracing.$kw87$EOF) {
                            done = (SubLObject)hl_transcript_tracing.T;
                        }
                        else {
                            PrintLow.format(out, (SubLObject)hl_transcript_tracing.$str135$_S__, hl_op);
                        }
                    }
                    streams_high.close(out, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                }
                finally {
                    print_high.$print_pretty$.rebind(_prev_bind_0_$20, thread);
                }
            }
            finally {
                hl_transcript_tracing.$hlt_constant_id_map$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_transcript_tracing.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)hl_transcript_tracing.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 31660L)
    public static SubLObject gather_all_constants_in_hl_form(final SubLObject hl_op) {
        if (hl_op.isAtom()) {
            return (SubLObject)hl_transcript_tracing.NIL;
        }
        SubLObject constants = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject operator = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject args = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(hl_op, hl_op, (SubLObject)hl_transcript_tracing.$list26);
        operator = hl_op.first();
        final SubLObject current = args = hl_op.rest();
        if (operator == hl_transcript_tracing.$sym12$HL_FIND_CONSTANT) {
            return (SubLObject)ConsesLow.list(hl_op);
        }
        if (args.isList()) {
            SubLObject cdolist_list_var;
            final SubLObject nested_elements = cdolist_list_var = Mapping.mapcar((SubLObject)hl_transcript_tracing.$sym136$GATHER_ALL_CONSTANTS_IN_HL_FORM, args);
            SubLObject element = (SubLObject)hl_transcript_tracing.NIL;
            element = cdolist_list_var.first();
            while (hl_transcript_tracing.NIL != cdolist_list_var) {
                constants = ConsesLow.append(constants, element);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
        }
        return constants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 33136L)
    public static SubLObject operator_is_hl_find_constant(final SubLObject form) {
        if (form.isAtom()) {
            return (SubLObject)hl_transcript_tracing.NIL;
        }
        SubLObject operator = (SubLObject)hl_transcript_tracing.NIL;
        SubLObject args = (SubLObject)hl_transcript_tracing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)hl_transcript_tracing.$list26);
        operator = form.first();
        final SubLObject current = args = form.rest();
        return Equality.eq(operator, (SubLObject)hl_transcript_tracing.$sym12$HL_FIND_CONSTANT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 33812L)
    public static SubLObject transform_hl_find_constant_only(final SubLObject hl_find_constant_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.list((SubLObject)hl_transcript_tracing.$sym137$HLFC, Hashtables.gethash(conses_high.third(hl_find_constant_form), hl_transcript_tracing.$hlt_constant_id_map$.getDynamicValue(thread), (SubLObject)hl_transcript_tracing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 34484L)
    public static SubLObject hl_constant_list_reset() {
        hl_transcript_tracing.$hlt_constant_list$.setDynamicValue((SubLObject)hl_transcript_tracing.NIL);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 34716L)
    public static SubLObject hl_constant_list_append(final SubLObject hlts_id, final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hl_transcript_tracing.$hlt_constant_list$.setDynamicValue(ConsesLow.append(hl_transcript_tracing.$hlt_constant_list$.getDynamicValue(thread), (SubLObject)ConsesLow.list(hl_find_constant(name, external_id))), thread);
        if (!Sequences.length(hl_transcript_tracing.$hlt_constant_list$.getDynamicValue(thread)).eql(Numbers.subtract(hlts_id, (SubLObject)hl_transcript_tracing.ONE_INTEGER))) {}
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 35264L)
    public static SubLObject hlfc(final SubLObject hlts_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ConsesLow.nth(hlts_id, hl_transcript_tracing.$hlt_constant_list$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 35415L)
    public static SubLObject count_new_constants() {
        SubLObject count = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject start = constant_handles.new_constant_suid_threshold();
        final SubLObject table_var = constant_handles.do_constants_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)hl_transcript_tracing.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index.id_index_lookup(table_var, id, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            if (hl_transcript_tracing.NIL != obj) {
                count = Numbers.add(count, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 35754L)
    public static SubLObject count_new_narts() {
        SubLObject count = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject start = nart_handles.new_nart_id_threshold();
        final SubLObject table_var = nart_handles.do_narts_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)hl_transcript_tracing.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index.id_index_lookup(table_var, id, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            if (hl_transcript_tracing.NIL != obj) {
                count = Numbers.add(count, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 35881L)
    public static SubLObject count_new_assertions() {
        SubLObject count = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        final SubLObject table_var = assertion_handles.do_assertions_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)hl_transcript_tracing.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index.id_index_lookup(table_var, id, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            if (hl_transcript_tracing.NIL != obj) {
                count = Numbers.add(count, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 36018L)
    public static SubLObject count_new_deductions() {
        SubLObject count = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject table_var = deduction_handles.do_deductions_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)hl_transcript_tracing.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index.id_index_lookup(table_var, id, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            if (hl_transcript_tracing.NIL != obj) {
                count = Numbers.add(count, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 36155L)
    public static SubLObject count_new_kb_hl_supports() {
        SubLObject count = (SubLObject)hl_transcript_tracing.ZERO_INTEGER;
        final SubLObject table_var = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject obj;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)hl_transcript_tracing.NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            obj = id_index.id_index_lookup(table_var, id, (SubLObject)hl_transcript_tracing.UNPROVIDED);
            if (hl_transcript_tracing.NIL != obj) {
                count = Numbers.add(count, (SubLObject)hl_transcript_tracing.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-transcript-tracing.lisp", position = 36300L)
    public static SubLObject count_new_kb_objects() {
        return Numbers.add(new SubLObject[] { count_new_constants(), count_new_narts(), count_new_assertions(), count_new_deductions(), count_new_kb_hl_supports() });
    }
    
    public static SubLObject declare_hl_transcript_tracing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify", "HL-QUOTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "within_hl_evalP", "WITHIN-HL-EVAL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_eval", "HL-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_eval_error", "HL-EVAL-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_cons_method", "HL-QUOTIFY-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_kb_object_p", "HL-KB-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_list_careful", "HL-QUOTIFY-LIST-CAREFUL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_constant_method", "HL-QUOTIFY-CONSTANT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_constant_int", "HL-QUOTIFY-CONSTANT-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_constant", "HL-FIND-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_nart_method", "HL-QUOTIFY-NART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_nart_int", "HL-QUOTIFY-NART-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_nart", "HL-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_variable_method", "HL-QUOTIFY-VARIABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_variable_int", "HL-QUOTIFY-VARIABLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_var", "HL-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_assertion_method", "HL-QUOTIFY-ASSERTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_gaf", "HL-QUOTIFY-GAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_rule", "HL-QUOTIFY-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_gaf_int", "HL-QUOTIFY-GAF-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_rule_int", "HL-QUOTIFY-RULE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_gaf", "HL-FIND-GAF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_rule", "HL-FIND-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_deduction_method", "HL-QUOTIFY-DEDUCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_deduction_int", "HL-QUOTIFY-DEDUCTION-INT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_deduction", "HL-FIND-DEDUCTION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_kb_hl_support_method", "HL-QUOTIFY-KB-HL-SUPPORT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_quotify_kb_hl_support_int", "HL-QUOTIFY-KB-HL-SUPPORT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_find_kb_hl_support", "HL-FIND-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_resolve", "HL-RESOLVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_resolve_recursive", "HL-RESOLVE-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_trace_enabledP", "HLT-TRACE-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_trace_op", "HLT-TRACE-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_trace_op_internal", "HLT-TRACE-OP-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcript_tracing", "with_hl_transcript_trace_to_stream", "WITH-HL-TRANSCRIPT-TRACE-TO-STREAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcript_tracing", "without_hl_transcript_trace_to_stream", "WITHOUT-HL-TRANSCRIPT-TRACE-TO-STREAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcript_tracing", "with_hl_transcript_trace_to_file", "WITH-HL-TRANSCRIPT-TRACE-TO-FILE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "start_hl_transcript_trace_to_file", "START-HL-TRANSCRIPT-TRACE-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "stop_all_hl_transcript_traces_to_files", "STOP-ALL-HL-TRANSCRIPT-TRACES-TO-FILES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "stop_hl_transcript_trace_to_file", "STOP-HL-TRANSCRIPT-TRACE-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "flush_hl_transcript_trace", "FLUSH-HL-TRANSCRIPT-TRACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_transcript_tracing", "do_hl_transcript_trace", "DO-HL-TRANSCRIPT-TRACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "load_one_hl_transcript_trace_operation", "LOAD-ONE-HL-TRANSCRIPT-TRACE-OPERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "load_hl_transcript_trace", "LOAD-HL-TRANSCRIPT-TRACE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "load_hl_transcript_trace_refactored", "LOAD-HL-TRANSCRIPT-TRACE-REFACTORED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "load_hl_transcript_trace_original", "LOAD-HL-TRANSCRIPT-TRACE-ORIGINAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "process_hl_transcript_trace_operation", "PROCESS-HL-TRANSCRIPT-TRACE-OPERATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "process_hl_transcript_trace_operation_int", "PROCESS-HL-TRANSCRIPT-TRACE-OPERATION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "analyze_hl_transcript_trace", "ANALYZE-HL-TRANSCRIPT-TRACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "analyze_one_hl_transcript_trace_operation", "ANALYZE-ONE-HL-TRANSCRIPT-TRACE-OPERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_find_or_create", "NOTE-HLT-FIND-OR-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_find_or_create_nart", "NOTE-HLT-FIND-OR-CREATE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_find_or_create_assertion", "NOTE-HLT-FIND-OR-CREATE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_assert", "NOTE-HLT-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_assert_bookkeeping_sentence", "NOTE-HLT-ASSERT-BOOKKEEPING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_assert_sentence", "NOTE-HLT-ASSERT-SENTENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_timestamp_assertion", "NOTE-HLT-TIMESTAMP-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_find_or_create_kb_hl_support", "NOTE-HLT-FIND-OR-CREATE-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_find_or_create_deduction", "NOTE-HLT-FIND-OR-CREATE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_add_skolem_defn", "NOTE-HLT-ADD-SKOLEM-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_add_skolem_defn", "HLT-ADD-SKOLEM-DEFN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_remove_constant", "NOTE-HLT-REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_remove_nart", "NOTE-HLT-REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_remove_nart", "HLT-REMOVE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_unassert", "NOTE-HLT-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_unassert_bookkeeping_sentence", "NOTE-HLT-UNASSERT-BOOKKEEPING-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_unassert_sentence", "NOTE-HLT-UNASSERT-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_remove_assertion", "NOTE-HLT-REMOVE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_remove_deduction", "NOTE-HLT-REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_remove_deduction", "HLT-REMOVE-DEDUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_merge", "HLT-MERGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_rename", "NOTE-HLT-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_rename", "HLT-RENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "note_hlt_rename_variables", "NOTE-HLT-RENAME-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlt_rename_variables", "HLT-RENAME-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "compress_hl_transcript_trace", "COMPRESS-HL-TRANSCRIPT-TRACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "gather_all_constants_in_hl_form", "GATHER-ALL-CONSTANTS-IN-HL-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "operator_is_hl_find_constant", "OPERATOR-IS-HL-FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "transform_hl_find_constant_only", "TRANSFORM-HL-FIND-CONSTANT-ONLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_constant_list_reset", "HL-CONSTANT-LIST-RESET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hl_constant_list_append", "HL-CONSTANT-LIST-APPEND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "hlfc", "HLFC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_constants", "COUNT-NEW-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_narts", "COUNT-NEW-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_assertions", "COUNT-NEW-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_deductions", "COUNT-NEW-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_kb_hl_supports", "COUNT-NEW-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_transcript_tracing", "count_new_kb_objects", "COUNT-NEW-KB-OBJECTS", 0, 0, false);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    public static SubLObject init_hl_transcript_tracing_file() {
        hl_transcript_tracing.$hl_quotify_method_table$ = SubLFiles.deflexical("*HL-QUOTIFY-METHOD-TABLE*", Vectors.make_vector((SubLObject)hl_transcript_tracing.$int0$256, (SubLObject)hl_transcript_tracing.NIL));
        hl_transcript_tracing.$within_hl_evalP$ = SubLFiles.defparameter("*WITHIN-HL-EVAL?*", (SubLObject)hl_transcript_tracing.NIL);
        hl_transcript_tracing.$hlt_include_constant_external_idsP$ = SubLFiles.defvar("*HLT-INCLUDE-CONSTANT-EXTERNAL-IDS?*", (SubLObject)hl_transcript_tracing.T);
        hl_transcript_tracing.$hlt_trace_streams$ = SubLFiles.defvar("*HLT-TRACE-STREAMS*", (SubLObject)hl_transcript_tracing.NIL);
        hl_transcript_tracing.$hlt_trace_lock$ = SubLFiles.deflexical("*HLT-TRACE-LOCK*", (hl_transcript_tracing.NIL != Symbols.boundp((SubLObject)hl_transcript_tracing.$sym30$_HLT_TRACE_LOCK_)) ? hl_transcript_tracing.$hlt_trace_lock$.getGlobalValue() : Locks.make_lock((SubLObject)hl_transcript_tracing.$str31$HLT_trace));
        hl_transcript_tracing.$hlt_format_operationsP$ = SubLFiles.defvar("*HLT-FORMAT-OPERATIONS?*", (SubLObject)hl_transcript_tracing.NIL);
        hl_transcript_tracing.$hlt_constant_id_map$ = SubLFiles.defparameter("*HLT-CONSTANT-ID-MAP*", (SubLObject)hl_transcript_tracing.NIL);
        hl_transcript_tracing.$hlt_constant_list$ = SubLFiles.defparameter("*HLT-CONSTANT-LIST*", (SubLObject)hl_transcript_tracing.NIL);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    public static SubLObject setup_hl_transcript_tracing_file() {
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym6$HL_QUOTIFY_CONS_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym11$HL_QUOTIFY_CONSTANT_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym13$HL_QUOTIFY_NART_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym15$HL_QUOTIFY_VARIABLE_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym17$HL_QUOTIFY_ASSERTION_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym20$HL_QUOTIFY_DEDUCTION_METHOD));
        Structures.register_method(hl_transcript_tracing.$hl_quotify_method_table$.getGlobalValue(), kb_hl_support_handles.$dtp_kb_hl_support$.getGlobalValue(), Symbols.symbol_function((SubLObject)hl_transcript_tracing.$sym24$HL_QUOTIFY_KB_HL_SUPPORT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)hl_transcript_tracing.$sym30$_HLT_TRACE_LOCK_);
        access_macros.define_obsolete_register((SubLObject)hl_transcript_tracing.$sym93$LOAD_HL_TRANSCRIPT_TRACE_ORIGINAL, (SubLObject)hl_transcript_tracing.$list94);
        access_macros.define_obsolete_register((SubLObject)hl_transcript_tracing.$sym125$HLT_MERGE, (SubLObject)hl_transcript_tracing.NIL);
        return (SubLObject)hl_transcript_tracing.NIL;
    }
    
    public void declareFunctions() {
        declare_hl_transcript_tracing_file();
    }
    
    public void initializeVariables() {
        init_hl_transcript_tracing_file();
    }
    
    public void runTopLevelForms() {
        setup_hl_transcript_tracing_file();
    }
    
    static {
        me = (SubLFile)new hl_transcript_tracing();
        hl_transcript_tracing.$hl_quotify_method_table$ = null;
        hl_transcript_tracing.$within_hl_evalP$ = null;
        hl_transcript_tracing.$hlt_include_constant_external_idsP$ = null;
        hl_transcript_tracing.$hlt_trace_streams$ = null;
        hl_transcript_tracing.$hlt_trace_lock$ = null;
        hl_transcript_tracing.$hlt_format_operationsP$ = null;
        hl_transcript_tracing.$hlt_constant_id_map$ = null;
        hl_transcript_tracing.$hlt_constant_list$ = null;
        $int0$256 = SubLObjectFactory.makeInteger(256);
        $kw1$HL_UNQUOTIFY_FAILURE = SubLObjectFactory.makeKeyword("HL-UNQUOTIFY-FAILURE");
        $str2$HL_Lookup_failure_with____S = SubLObjectFactory.makeString("HL Lookup failure with:~%~S");
        $sym3$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $str4$HL_Lookup_failure_with___S = SubLObjectFactory.makeString("HL Lookup failure with: ~S");
        $sym5$HL_KB_OBJECT_P = SubLObjectFactory.makeSymbol("HL-KB-OBJECT-P");
        $sym6$HL_QUOTIFY_CONS_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-CONS-METHOD");
        $sym7$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym8$HL_QUOTIFY = SubLObjectFactory.makeSymbol("HL-QUOTIFY");
        $list9 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRE-DOTTED"), (SubLObject)SubLObjectFactory.makeSymbol("DOTTED"));
        $sym10$LIST_ = SubLObjectFactory.makeSymbol("LIST*");
        $sym11$HL_QUOTIFY_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-CONSTANT-METHOD");
        $sym12$HL_FIND_CONSTANT = SubLObjectFactory.makeSymbol("HL-FIND-CONSTANT");
        $sym13$HL_QUOTIFY_NART_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-NART-METHOD");
        $sym14$HL_FIND_NART = SubLObjectFactory.makeSymbol("HL-FIND-NART");
        $sym15$HL_QUOTIFY_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-VARIABLE-METHOD");
        $sym16$HL_VAR = SubLObjectFactory.makeSymbol("HL-VAR");
        $sym17$HL_QUOTIFY_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-ASSERTION-METHOD");
        $sym18$HL_FIND_GAF = SubLObjectFactory.makeSymbol("HL-FIND-GAF");
        $sym19$HL_FIND_RULE = SubLObjectFactory.makeSymbol("HL-FIND-RULE");
        $sym20$HL_QUOTIFY_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-DEDUCTION-METHOD");
        $sym21$HL_FIND_DEDUCTION = SubLObjectFactory.makeSymbol("HL-FIND-DEDUCTION");
        $kw22$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str23$Circular_KB_HL_Support_dependency = SubLObjectFactory.makeString("Circular KB HL Support dependency!");
        $sym24$HL_QUOTIFY_KB_HL_SUPPORT_METHOD = SubLObjectFactory.makeSymbol("HL-QUOTIFY-KB-HL-SUPPORT-METHOD");
        $sym25$HL_FIND_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("HL-FIND-KB-HL-SUPPORT");
        $list26 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym27$HL_RESOLVE_RECURSIVE = SubLObjectFactory.makeSymbol("HL-RESOLVE-RECURSIVE");
        $kw28$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym29$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym30$_HLT_TRACE_LOCK_ = SubLObjectFactory.makeSymbol("*HLT-TRACE-LOCK*");
        $str31$HLT_trace = SubLObjectFactory.makeString("HLT trace");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym33$STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("STREAM-VAR");
        $sym34$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym35$WITH_HL_TRANSCRIPT_TRACE_TO_STREAM = SubLObjectFactory.makeSymbol("WITH-HL-TRANSCRIPT-TRACE-TO-STREAM");
        $sym36$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym37$_HLT_TRACE_STREAMS_ = SubLObjectFactory.makeSymbol("*HLT-TRACE-STREAMS*");
        $sym38$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HLT-TRACE-STREAMS*"));
        $sym40$FORCE_OUTPUT = SubLObjectFactory.makeSymbol("FORCE-OUTPUT");
        $sym41$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym43$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym44$WITH_HL_TRANSCRIPT_TRACE_TO_FILE = SubLObjectFactory.makeSymbol("WITH-HL-TRANSCRIPT-TRACE-TO-FILE");
        $sym45$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym46$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym47$WITH_STREAM_BUFFER_SIZE = SubLObjectFactory.makeSymbol("WITH-STREAM-BUFFER-SIZE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"));
        $sym49$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym50$ENSURE_PRIVATE_STREAM = SubLObjectFactory.makeSymbol("ENSURE-PRIVATE-STREAM");
        $sym51$OPEN_TEXT = SubLObjectFactory.makeSymbol("OPEN-TEXT");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OUTPUT"));
        $sym53$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym54$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym55$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str56$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym57$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym58$CLOSE = SubLObjectFactory.makeSymbol("CLOSE");
        $sym59$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw60$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-OP-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw63$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw64$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $kw65$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw66$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym67$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
        $sym68$DO_HL_TRANSCRIPT_TRACE = SubLObjectFactory.makeSymbol("DO-HL-TRANSCRIPT-TRACE");
        $sym69$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym70$IN_STREAM_VAR = SubLObjectFactory.makeUninternedSymbol("IN-STREAM-VAR");
        $sym71$WITH_PRIVATE_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym73$ENABLE_FILE_STREAM_MEMORY_MAPPING = SubLObjectFactory.makeSymbol("ENABLE-FILE-STREAM-MEMORY-MAPPING");
        $sym74$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym75$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym76$FILE_LENGTH = SubLObjectFactory.makeSymbol("FILE-LENGTH");
        $list77 = ConsesLow.list((SubLObject)hl_transcript_tracing.ZERO_INTEGER);
        $sym78$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym80$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym81$GET_FILE_POSITION = SubLObjectFactory.makeSymbol("GET-FILE-POSITION");
        $sym82$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym83$LOAD_ONE_HL_TRANSCRIPT_TRACE_OPERATION = SubLObjectFactory.makeSymbol("LOAD-ONE-HL-TRANSCRIPT-TRACE-OPERATION");
        $sym84$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym85$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym86$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $kw87$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw88$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym89$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw90$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str91$Loading_HL_transcript_Trace_ = SubLObjectFactory.makeString("Loading HL transcript Trace ");
        $kw92$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym93$LOAD_HL_TRANSCRIPT_TRACE_ORIGINAL = SubLObjectFactory.makeSymbol("LOAD-HL-TRANSCRIPT-TRACE-ORIGINAL");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOAD-HL-TRANSCRIPT-TRACE-REFACTORED"));
        $kw95$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str96$operation__S___S___A = SubLObjectFactory.makeString("operation ~S~%~S~%~A");
        $kw97$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str98$unexpected_error_mode__S = SubLObjectFactory.makeString("unexpected error mode ~S");
        $str99$Analyzing_HL_transcript_Trace_ = SubLObjectFactory.makeString("Analyzing HL transcript Trace ");
        $sym100$_ = SubLObjectFactory.makeSymbol(">");
        $sym101$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw102$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $sym103$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym104$HLT_FIND_OR_CREATE = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE");
        $sym105$HLT_FIND_OR_CREATE_NART = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-NART");
        $sym106$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym107$HLT_FIND_OR_CREATE_ASSERTION = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-ASSERTION");
        $sym108$POSSIBLY_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P");
        $sym109$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $kw110$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw111$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $sym112$HLT_ASSERT = SubLObjectFactory.makeSymbol("HLT-ASSERT");
        $sym113$HLT_TIMESTAMP_ASSERTION = SubLObjectFactory.makeSymbol("HLT-TIMESTAMP-ASSERTION");
        $sym114$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $sym115$HLT_FIND_OR_CREATE_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-KB-HL-SUPPORT");
        $sym116$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym117$HLT_FIND_OR_CREATE_DEDUCTION = SubLObjectFactory.makeSymbol("HLT-FIND-OR-CREATE-DEDUCTION");
        $sym118$HLT_ADD_SKOLEM_DEFN = SubLObjectFactory.makeSymbol("HLT-ADD-SKOLEM-DEFN");
        $sym119$HLT_REMOVE_CONSTANT = SubLObjectFactory.makeSymbol("HLT-REMOVE-CONSTANT");
        $sym120$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym121$HLT_REMOVE_NART = SubLObjectFactory.makeSymbol("HLT-REMOVE-NART");
        $sym122$HLT_UNASSERT = SubLObjectFactory.makeSymbol("HLT-UNASSERT");
        $sym123$HLT_REMOVE_ASSERTION = SubLObjectFactory.makeSymbol("HLT-REMOVE-ASSERTION");
        $sym124$HLT_REMOVE_DEDUCTION = SubLObjectFactory.makeSymbol("HLT-REMOVE-DEDUCTION");
        $sym125$HLT_MERGE = SubLObjectFactory.makeSymbol("HLT-MERGE");
        $sym126$HLT_RENAME = SubLObjectFactory.makeSymbol("HLT-RENAME");
        $sym127$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym128$HLT_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("HLT-RENAME-VARIABLES");
        $str129$Could_not_open_an_input_stream_fo = SubLObjectFactory.makeString("Could not open an input stream for ~S.");
        $int130$100 = SubLObjectFactory.makeInteger(100);
        $str131$_HL_CONSTANT_LIST_RESET___ = SubLObjectFactory.makeString("(HL-CONSTANT-LIST-RESET)~%");
        $str132$_HL_CONSTANT_LIST_APPEND__S__S__S = SubLObjectFactory.makeString("(HL-CONSTANT-LIST-APPEND ~S ~S ~S)~%");
        $sym133$OPERATOR_IS_HL_FIND_CONSTANT = SubLObjectFactory.makeSymbol("OPERATOR-IS-HL-FIND-CONSTANT");
        $sym134$TRANSFORM_HL_FIND_CONSTANT_ONLY = SubLObjectFactory.makeSymbol("TRANSFORM-HL-FIND-CONSTANT-ONLY");
        $str135$_S__ = SubLObjectFactory.makeString("~S~%");
        $sym136$GATHER_ALL_CONSTANTS_IN_HL_FORM = SubLObjectFactory.makeSymbol("GATHER-ALL-CONSTANTS-IN-HL-FORM");
        $sym137$HLFC = SubLObjectFactory.makeSymbol("HLFC");
    }
}

/*

	Total time: 590 ms
	
*/