package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
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

public final class cycl_query_specification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycl_query_specification";
    public static final String myFingerPrint = "5bcc59b1155323309bef237d991dfec19427d9a46fb6b946d15cd6604c30d1f8";
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLSymbol $dtp_cycl_query_specification$;
    private static final SubLSymbol $sym0$CYCL_QUERY_SPECIFICATION;
    private static final SubLSymbol $sym1$CYCL_QUERY_SPECIFICATION_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CYCL_QUERY_SPECIFICATION_PRINT;
    private static final SubLSymbol $sym7$CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$CYCL_QUERY_SPEC_CYCL_ID;
    private static final SubLSymbol $sym10$_CSETF_CYCL_QUERY_SPEC_CYCL_ID;
    private static final SubLSymbol $sym11$CYCL_QUERY_SPEC_FORMULA;
    private static final SubLSymbol $sym12$_CSETF_CYCL_QUERY_SPEC_FORMULA;
    private static final SubLSymbol $sym13$CYCL_QUERY_SPEC_MT;
    private static final SubLSymbol $sym14$_CSETF_CYCL_QUERY_SPEC_MT;
    private static final SubLSymbol $sym15$CYCL_QUERY_SPEC_COMMENT;
    private static final SubLSymbol $sym16$_CSETF_CYCL_QUERY_SPEC_COMMENT;
    private static final SubLSymbol $sym17$CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS;
    private static final SubLSymbol $sym18$_CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS;
    private static final SubLSymbol $sym19$CYCL_QUERY_SPEC_BACK_CHAINING;
    private static final SubLSymbol $sym20$_CSETF_CYCL_QUERY_SPEC_BACK_CHAINING;
    private static final SubLSymbol $sym21$CYCL_QUERY_SPEC_TIME_CUTOFF_SECS;
    private static final SubLSymbol $sym22$_CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS;
    private static final SubLSymbol $sym23$CYCL_QUERY_SPEC_MAX_DEPTH;
    private static final SubLSymbol $sym24$_CSETF_CYCL_QUERY_SPEC_MAX_DEPTH;
    private static final SubLSymbol $sym25$CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF;
    private static final SubLSymbol $sym26$_CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF;
    private static final SubLSymbol $sym27$CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE;
    private static final SubLSymbol $sym28$_CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE;
    private static final SubLSymbol $sym29$CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $sym30$_CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $sym31$CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS;
    private static final SubLSymbol $sym32$_CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS;
    private static final SubLSymbol $sym33$CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $sym34$_CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $sym35$CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING;
    private static final SubLSymbol $sym36$_CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING;
    private static final SubLSymbol $sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA;
    private static final SubLSymbol $sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR;
    private static final SubLSymbol $kw39$CYCL_ID;
    private static final SubLSymbol $kw40$FORMULA;
    private static final SubLSymbol $kw41$MT;
    private static final SubLSymbol $kw42$COMMENT;
    private static final SubLSymbol $kw43$MAX_NUMBER_OF_RESULTS;
    private static final SubLSymbol $kw44$BACK_CHAINING;
    private static final SubLSymbol $kw45$TIME_CUTOFF_SECS;
    private static final SubLSymbol $kw46$MAX_DEPTH;
    private static final SubLSymbol $kw47$REMOVAL_COST_CUTOFF;
    private static final SubLSymbol $kw48$ENABLE_NEGATION_BY_FAILURE;
    private static final SubLSymbol $kw49$ENABLE_HL_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $kw50$ENABLE_CACHE_BACKWARDS_QUERY_RESULTS;
    private static final SubLSymbol $kw51$ENABLE_UNBOUND_PREDICATE_BACKCHAINING;
    private static final SubLSymbol $kw52$ENABLE_SEMANTIC_PRUNING;
    private static final SubLSymbol $kw53$ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS;
    private static final SubLString $str54$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw55$BEGIN;
    private static final SubLSymbol $sym56$MAKE_CYCL_QUERY_SPECIFICATION;
    private static final SubLSymbol $kw57$SLOT;
    private static final SubLSymbol $kw58$END;
    private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD;
    private static final SubLString $str60$___Acycl_query_specification___;
    private static final SubLString $str61$_Acycl_id____A__;
    private static final SubLString $str62$_Aformula___A__;
    private static final SubLString $str63$_Amt___S__;
    private static final SubLString $str64$_Acomment___A__;
    private static final SubLString $str65$_Amax_number_of_results___A__;
    private static final SubLString $str66$_Aback_chaining___A__;
    private static final SubLString $str67$_Atime_cutoff_secs___A__;
    private static final SubLString $str68$_Amax_depth___A__;
    private static final SubLString $str69$_Aremoval_cost_cutoff___A__;
    private static final SubLString $str70$_Aenable_negation_by_failure___A_;
    private static final SubLString $str71$_Aenable_hl_predicate_backchainin;
    private static final SubLString $str72$_Aenable_cache_backwards_query_re;
    private static final SubLString $str73$_Aenable_unbound_predicate_backch;
    private static final SubLString $str74$_Aenable_semantic_pruning___A__;
    private static final SubLString $str75$_Aenable_consideration_of_disjunc;
    private static final SubLInteger $int76$30;
    private static final SubLInteger $int77$10000;
    private static final SubLObject $const78$InferenceFormulaParameter;
    private static final SubLObject $const79$InferenceMicrotheoryParameter;
    private static final SubLObject $const80$InferenceMaxAnswersParameter;
    private static final SubLObject $const81$InferenceMaxTransformationStepsPa;
    private static final SubLObject $const82$InferenceMaxTimeParameter;
    private static final SubLObject $const83$InferenceMaxProofDepthParameter;
    private static final SubLObject $const84$InferenceAllowUnboundPredicateTra;
    private static final SubLObject $const85$InferenceProductivityLimitParamet;
    private static final SubLObject $const86$InferenceEnableConsiderDisjunctiv;
    private static final SubLObject $const87$InferenceEnableSemanticPruningPar;
    private static final SubLObject $const88$InferenceCacheInferenceResultsPar;
    private static final SubLObject $const89$InferenceAllowHLPredicateTransfor;
    private static final SubLObject $const90$InferenceNegationByFailureParamet;
    private static final SubLObject $const91$comment;
    private static final SubLSymbol $sym92$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym93$MICROTHEORY_P;
    private static final SubLList $list94;
    private static final SubLObject $const95$softwareParameterValueInSpecifica;
    private static final SubLSymbol $sym96$_PARAM;
    private static final SubLSymbol $sym97$_VAL;
    private static final SubLList $list98;
    private static final SubLSymbol $kw99$CONDITIONAL_SENTENCE_;
    private static final SubLSymbol $kw100$ALLOW_HL_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw101$NEGATION_BY_FAILURE_;
    private static final SubLSymbol $kw102$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_;
    private static final SubLSymbol $kw103$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw104$MAX_PROOF_DEPTH;
    private static final SubLSymbol $kw105$RETURN;
    private static final SubLSymbol $kw106$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw107$PRODUCTIVITY_LIMIT;
    private static final SubLSymbol $kw108$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw109$HL;
    private static final SubLSymbol $kw110$CACHE_INFERENCE_RESULTS_;
    private static final SubLSymbol $kw111$MAX_TIME;
    private static final SubLSymbol $kw112$MAX_NUMBER;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        cycl_query_specification_print(v_object, stream, (SubLObject)cycl_query_specification.ZERO_INTEGER);
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_specification_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cycl_query_specification_native.class) ? cycl_query_specification.T : cycl_query_specification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_cycl_id(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_formula(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_mt(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_comment(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_max_number_of_results(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_back_chaining(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_time_cutoff_secs(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_max_depth(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_removal_cost_cutoff(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_negation_by_failure(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_hl_predicate_backchaining(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_cache_backwards_query_results(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_unbound_predicate_backchaining(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_semantic_pruning(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(final SubLObject v_object) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_cycl_id(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_formula(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_mt(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_comment(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_max_number_of_results(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_back_chaining(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_time_cutoff_secs(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_max_depth(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_removal_cost_cutoff(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_negation_by_failure(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_hl_predicate_backchaining(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_cache_backwards_query_results(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_semantic_pruning(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(final SubLObject v_object, final SubLObject value) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject make_cycl_query_specification(SubLObject arglist) {
        if (arglist == cycl_query_specification.UNPROVIDED) {
            arglist = (SubLObject)cycl_query_specification.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cycl_query_specification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cycl_query_specification.NIL, next = arglist; cycl_query_specification.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cycl_query_specification.$kw39$CYCL_ID)) {
                _csetf_cycl_query_spec_cycl_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw40$FORMULA)) {
                _csetf_cycl_query_spec_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw41$MT)) {
                _csetf_cycl_query_spec_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw42$COMMENT)) {
                _csetf_cycl_query_spec_comment(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw43$MAX_NUMBER_OF_RESULTS)) {
                _csetf_cycl_query_spec_max_number_of_results(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw44$BACK_CHAINING)) {
                _csetf_cycl_query_spec_back_chaining(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw45$TIME_CUTOFF_SECS)) {
                _csetf_cycl_query_spec_time_cutoff_secs(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw46$MAX_DEPTH)) {
                _csetf_cycl_query_spec_max_depth(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw47$REMOVAL_COST_CUTOFF)) {
                _csetf_cycl_query_spec_removal_cost_cutoff(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw48$ENABLE_NEGATION_BY_FAILURE)) {
                _csetf_cycl_query_spec_enable_negation_by_failure(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw49$ENABLE_HL_PREDICATE_BACKCHAINING)) {
                _csetf_cycl_query_spec_enable_hl_predicate_backchaining(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw50$ENABLE_CACHE_BACKWARDS_QUERY_RESULTS)) {
                _csetf_cycl_query_spec_enable_cache_backwards_query_results(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw51$ENABLE_UNBOUND_PREDICATE_BACKCHAINING)) {
                _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw52$ENABLE_SEMANTIC_PRUNING)) {
                _csetf_cycl_query_spec_enable_semantic_pruning(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cycl_query_specification.$kw53$ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS)) {
                _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cycl_query_specification.$str54$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject visit_defstruct_cycl_query_specification(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw55$BEGIN, (SubLObject)cycl_query_specification.$sym56$MAKE_CYCL_QUERY_SPECIFICATION, (SubLObject)cycl_query_specification.FIFTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw39$CYCL_ID, cycl_query_spec_cycl_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw40$FORMULA, cycl_query_spec_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw41$MT, cycl_query_spec_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw42$COMMENT, cycl_query_spec_comment(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw43$MAX_NUMBER_OF_RESULTS, cycl_query_spec_max_number_of_results(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw44$BACK_CHAINING, cycl_query_spec_back_chaining(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw45$TIME_CUTOFF_SECS, cycl_query_spec_time_cutoff_secs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw46$MAX_DEPTH, cycl_query_spec_max_depth(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw47$REMOVAL_COST_CUTOFF, cycl_query_spec_removal_cost_cutoff(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw48$ENABLE_NEGATION_BY_FAILURE, cycl_query_spec_enable_negation_by_failure(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw49$ENABLE_HL_PREDICATE_BACKCHAINING, cycl_query_spec_enable_hl_predicate_backchaining(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw50$ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, cycl_query_spec_enable_cache_backwards_query_results(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw51$ENABLE_UNBOUND_PREDICATE_BACKCHAINING, cycl_query_spec_enable_unbound_predicate_backchaining(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw52$ENABLE_SEMANTIC_PRUNING, cycl_query_spec_enable_semantic_pruning(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw57$SLOT, (SubLObject)cycl_query_specification.$kw53$ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS, cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cycl_query_specification.$kw58$END, (SubLObject)cycl_query_specification.$sym56$MAKE_CYCL_QUERY_SPECIFICATION, (SubLObject)cycl_query_specification.FIFTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 1604L)
    public static SubLObject visit_defstruct_object_cycl_query_specification_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cycl_query_specification(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 3166L)
    public static SubLObject cycl_query_specification_cycl_id(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_cycl_id(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 3346L)
    public static SubLObject cycl_query_specification_formula(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_formula(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 3526L)
    public static SubLObject cycl_query_specification_mt(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_mt(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 3696L)
    public static SubLObject cycl_query_specification_comment(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_comment(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 3876L)
    public static SubLObject cycl_query_specification_max_number_of_results(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_max_number_of_results(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 4091L)
    public static SubLObject cycl_query_specification_back_chaining(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_back_chaining(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 4283L)
    public static SubLObject cycl_query_specification_time_cutoff_secs(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_time_cutoff_secs(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 4481L)
    public static SubLObject cycl_query_specification_max_depth(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_max_depth(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 4665L)
    public static SubLObject cycl_query_specification_conditional_sentenceP(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        final SubLObject formula = cycl_query_spec_formula(cycl_query);
        final SubLObject conditional_sentenceP = inference_strategist.inference_conditional_sentence_p(formula);
        return conditional_sentenceP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 5114L)
    public static SubLObject cycl_query_specification_removal_cost_cutoff(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_removal_cost_cutoff(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 5318L)
    public static SubLObject cycl_query_specification_enable_negation_by_failure(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_negation_by_failure(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 5543L)
    public static SubLObject cycl_query_specification_enable_hl_predicate_backchaining(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_hl_predicate_backchaining(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 5780L)
    public static SubLObject cycl_query_specification_enable_cache_backwards_query_results(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_cache_backwards_query_results(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 6034L)
    public static SubLObject cycl_query_specification_enable_unbound_predicate_backchaining(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_unbound_predicate_backchaining(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 6289L)
    public static SubLObject cycl_query_specification_enable_semantic_pruning(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_semantic_pruning(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 6508L)
    public static SubLObject cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(final SubLObject cycl_query) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(cycl_query) : cycl_query;
        return cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(cycl_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 6782L)
    public static SubLObject cycl_query_specification_copy(final SubLObject query) {
        final SubLObject result = make_cycl_query_specification((SubLObject)cycl_query_specification.UNPROVIDED);
        _csetf_cycl_query_spec_cycl_id(result, cycl_query_specification_cycl_id(query));
        _csetf_cycl_query_spec_formula(result, cycl_query_specification_formula(query));
        _csetf_cycl_query_spec_mt(result, cycl_query_specification_mt(query));
        _csetf_cycl_query_spec_comment(result, cycl_query_specification_comment(query));
        _csetf_cycl_query_spec_max_number_of_results(result, cycl_query_specification_max_number_of_results(query));
        _csetf_cycl_query_spec_back_chaining(result, cycl_query_specification_back_chaining(query));
        _csetf_cycl_query_spec_time_cutoff_secs(result, cycl_query_specification_time_cutoff_secs(query));
        _csetf_cycl_query_spec_max_depth(result, cycl_query_specification_max_depth(query));
        _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, cycl_query_specification_enable_unbound_predicate_backchaining(query));
        _csetf_cycl_query_spec_removal_cost_cutoff(result, cycl_query_specification_removal_cost_cutoff(query));
        _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query));
        _csetf_cycl_query_spec_enable_semantic_pruning(result, cycl_query_specification_enable_semantic_pruning(query));
        _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, cycl_query_spec_enable_cache_backwards_query_results(query));
        _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, cycl_query_specification_enable_hl_predicate_backchaining(query));
        _csetf_cycl_query_spec_enable_negation_by_failure(result, cycl_query_specification_enable_negation_by_failure(query));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 8959L)
    public static SubLObject cycl_query_specification_print(final SubLObject query_spec, final SubLObject stream, final SubLObject depth) {
        final SubLObject indent1 = Strings.make_string(depth, (SubLObject)cycl_query_specification.UNPROVIDED);
        final SubLObject indent2 = Strings.make_string(Numbers.add(depth, (SubLObject)cycl_query_specification.THREE_INTEGER), (SubLObject)cycl_query_specification.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str60$___Acycl_query_specification___, indent1);
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str61$_Acycl_id____A__, indent2, cycl_query_specification_cycl_id(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str62$_Aformula___A__, indent2, cycl_query_specification_formula(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str63$_Amt___S__, indent2, cycl_query_specification_mt(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str64$_Acomment___A__, indent2, cycl_query_specification_comment(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str65$_Amax_number_of_results___A__, indent2, cycl_query_specification_max_number_of_results(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str66$_Aback_chaining___A__, indent2, cycl_query_specification_back_chaining(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str67$_Atime_cutoff_secs___A__, indent2, cycl_query_specification_time_cutoff_secs(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str68$_Amax_depth___A__, indent2, cycl_query_specification_max_depth(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str69$_Aremoval_cost_cutoff___A__, indent2, cycl_query_specification_removal_cost_cutoff(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str70$_Aenable_negation_by_failure___A_, indent2, cycl_query_specification_enable_negation_by_failure(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str71$_Aenable_hl_predicate_backchainin, indent2, cycl_query_specification_enable_hl_predicate_backchaining(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str72$_Aenable_cache_backwards_query_re, indent2, cycl_query_specification_enable_cache_backwards_query_results(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str73$_Aenable_unbound_predicate_backch, indent2, cycl_query_specification_enable_unbound_predicate_backchaining(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str74$_Aenable_semantic_pruning___A__, indent2, cycl_query_specification_enable_semantic_pruning(query_spec));
        PrintLow.format(stream, (SubLObject)cycl_query_specification.$str75$_Aenable_consideration_of_disjunc, indent2, cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec));
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 11253L)
    public static SubLObject cycl_query_specification_new() {
        final SubLObject result = make_cycl_query_specification((SubLObject)cycl_query_specification.UNPROVIDED);
        _csetf_cycl_query_spec_max_number_of_results(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_back_chaining(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_time_cutoff_secs(result, (SubLObject)cycl_query_specification.$int76$30);
        _csetf_cycl_query_spec_max_depth(result, (SubLObject)cycl_query_specification.TWENTY_INTEGER);
        _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_removal_cost_cutoff(result, (SubLObject)cycl_query_specification.$int77$10000);
        _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_enable_semantic_pruning(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_enable_cache_backwards_query_results(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_enable_hl_predicate_backchaining(result, (SubLObject)cycl_query_specification.NIL);
        _csetf_cycl_query_spec_enable_negation_by_failure(result, (SubLObject)cycl_query_specification.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 12303L)
    public static SubLObject cycl_query_specification_assign_param(final SubLObject query_spec, final SubLObject param, final SubLObject val) {
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const78$InferenceFormulaParameter)) {
            _csetf_cycl_query_spec_formula(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const79$InferenceMicrotheoryParameter)) {
            _csetf_cycl_query_spec_mt(query_spec, (cycl_query_specification.NIL != function_terms.nat_formula_p(val)) ? narts_high.nart_substitute(val) : val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const80$InferenceMaxAnswersParameter)) {
            _csetf_cycl_query_spec_max_number_of_results(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const81$InferenceMaxTransformationStepsPa)) {
            _csetf_cycl_query_spec_back_chaining(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const82$InferenceMaxTimeParameter)) {
            if (cycl_query_specification.NIL != nart_handles.nart_p(val)) {
                _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(narts_high.nart_el_formula(val), (SubLObject)cycl_query_specification.UNPROVIDED));
            }
            else if (cycl_query_specification.NIL != el_utilities.possibly_naut_p(val)) {
                _csetf_cycl_query_spec_time_cutoff_secs(query_spec, cycl_utilities.formula_arg1(val, (SubLObject)cycl_query_specification.UNPROVIDED));
            }
            else {
                _csetf_cycl_query_spec_time_cutoff_secs(query_spec, val);
            }
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const83$InferenceMaxProofDepthParameter)) {
            _csetf_cycl_query_spec_max_depth(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const84$InferenceAllowUnboundPredicateTra)) {
            _csetf_cycl_query_spec_enable_unbound_predicate_backchaining(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const85$InferenceProductivityLimitParamet)) {
            _csetf_cycl_query_spec_removal_cost_cutoff(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const86$InferenceEnableConsiderDisjunctiv)) {
            _csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const87$InferenceEnableSemanticPruningPar)) {
            _csetf_cycl_query_spec_enable_semantic_pruning(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const88$InferenceCacheInferenceResultsPar)) {
            _csetf_cycl_query_spec_enable_cache_backwards_query_results(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const89$InferenceAllowHLPredicateTransfor)) {
            _csetf_cycl_query_spec_enable_hl_predicate_backchaining(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const90$InferenceNegationByFailureParamet)) {
            _csetf_cycl_query_spec_enable_negation_by_failure(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        if (cycl_query_specification.NIL != kb_utilities.kbeq(param, cycl_query_specification.$const91$comment)) {
            _csetf_cycl_query_spec_comment(query_spec, val);
            return (SubLObject)cycl_query_specification.NIL;
        }
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 14919L)
    public static SubLObject cycl_query_specification_get(final SubLObject constant_id, SubLObject mt) {
        if (mt == cycl_query_specification.UNPROVIDED) {
            mt = (SubLObject)cycl_query_specification.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycl_query_specification.NIL != cycl_grammar.cycl_denotational_term_p(constant_id) : constant_id;
        if (cycl_query_specification.NIL != mt && !cycl_query_specification.assertionsDisabledSynth && cycl_query_specification.NIL == fort_types_interface.microtheory_p(mt)) {
            throw new AssertionError(mt);
        }
        final SubLObject result = cycl_query_specification_new();
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            _csetf_cycl_query_spec_cycl_id(result, constant_id);
            thread.resetMultipleValues();
            SubLObject values = fi.fi_ask_int((SubLObject)ConsesLow.listS(cycl_query_specification.$const91$comment, constant_id, (SubLObject)cycl_query_specification.$list94), mt, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED);
            SubLObject v_answer = thread.secondMultipleValue();
            SubLObject reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (values != cycl_query_specification.NIL) {
                final SubLObject comment_str = values.first().first().rest();
                cycl_query_specification_assign_param(result, cycl_query_specification.$const91$comment, comment_str);
            }
            thread.resetMultipleValues();
            values = fi.fi_ask_int((SubLObject)ConsesLow.list(cycl_query_specification.$const95$softwareParameterValueInSpecifica, (SubLObject)cycl_query_specification.$sym96$_PARAM, (SubLObject)cycl_query_specification.$sym97$_VAL, constant_id), mt, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED, (SubLObject)cycl_query_specification.UNPROVIDED);
            v_answer = thread.secondMultipleValue();
            reason = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = values;
            SubLObject binding = (SubLObject)cycl_query_specification.NIL;
            binding = cdolist_list_var.first();
            while (cycl_query_specification.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = binding;
                SubLObject param = (SubLObject)cycl_query_specification.NIL;
                SubLObject val = (SubLObject)cycl_query_specification.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_query_specification.$list98);
                param = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycl_query_specification.$list98);
                val = current.first();
                current = current.rest();
                if (cycl_query_specification.NIL == current) {
                    param = param.rest();
                    val = val.rest();
                    cycl_query_specification_assign_param(result, param, val);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cycl_query_specification.$list98);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 16314L)
    public static SubLObject cycl_query_specification_ask_int(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycl_query_specification.NIL != cycl_query_specification_p(query_spec) : query_spec;
        SubLObject values = (SubLObject)cycl_query_specification.NIL;
        SubLObject v_answer = (SubLObject)cycl_query_specification.NIL;
        SubLObject reason = (SubLObject)cycl_query_specification.NIL;
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            control_vars.$negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            control_vars.$hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            control_vars.$cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            control_vars.$unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            control_vars.$removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            thread.resetMultipleValues();
            final SubLObject values_$1 = fi.fi_ask_int(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            final SubLObject v_answer_$2 = thread.secondMultipleValue();
            final SubLObject reason_$3 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            values = values_$1;
            v_answer = v_answer_$2;
            reason = reason_$3;
        }
        finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            control_vars.$removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_3, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return Values.values(values, v_answer, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 18246L)
    public static SubLObject cycl_query_specification_ask(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycl_query_specification.NIL != cycl_query_specification_p(query_spec) : query_spec;
        SubLObject result = (SubLObject)cycl_query_specification.NIL;
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            control_vars.$negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            control_vars.$hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            control_vars.$cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            control_vars.$unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            control_vars.$removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            if (cycl_query_specification.NIL != cycl_query_specification_formula(query_spec)) {
                result = fi.fi_ask(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            control_vars.$removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_3, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 19998L)
    public static SubLObject cycl_query_specification_set_mt(final SubLObject query, final SubLObject new_mt) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(query) : query;
        assert cycl_query_specification.NIL != fort_types_interface.microtheory_p(new_mt) : new_mt;
        _csetf_cycl_query_spec_mt(query, new_mt);
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 20221L)
    public static SubLObject cycl_query_specification_new_query_from_old(final SubLObject old_query, final SubLObject new_formula, final SubLObject new_mt) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(old_query) : old_query;
        final SubLObject new_query = cycl_query_specification_copy(old_query);
        if (cycl_query_specification.NIL != new_formula) {
            _csetf_cycl_query_spec_formula(new_query, new_formula);
        }
        if (cycl_query_specification.NIL != new_mt) {
            _csetf_cycl_query_spec_mt(new_query, new_mt);
        }
        return new_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 20626L)
    public static SubLObject cycl_query_specification_rkf_ask(final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycl_query_specification.NIL != cycl_query_specification_p(query_spec) : query_spec;
        SubLObject result = (SubLObject)cycl_query_specification.NIL;
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$hl_failure_backchaining$.currentBinding(thread);
        final SubLObject _prev_bind_3 = control_vars.$cache_inference_results$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$unbound_rule_backchain_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_6 = control_vars.$removal_cost_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            control_vars.$negation_by_failure$.bind(cycl_query_specification_enable_negation_by_failure(query_spec), thread);
            control_vars.$hl_failure_backchaining$.bind(cycl_query_specification_enable_hl_predicate_backchaining(query_spec), thread);
            control_vars.$cache_inference_results$.bind(cycl_query_specification_enable_cache_backwards_query_results(query_spec), thread);
            control_vars.$unbound_rule_backchain_enabled$.bind(cycl_query_specification_enable_unbound_predicate_backchaining(query_spec), thread);
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            control_vars.$removal_cost_cutoff$.bind(cycl_query_specification_removal_cost_cutoff(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            if (cycl_query_specification.NIL != cycl_query_specification_formula(query_spec)) {
                result = rkf_query_utilities.rkf_query(cycl_query_specification_formula(query_spec), cycl_query_specification_mt(query_spec), cycl_query_specification_back_chaining(query_spec), cycl_query_specification_max_number_of_results(query_spec), cycl_query_specification_time_cutoff_secs(query_spec), cycl_query_specification_max_depth(query_spec));
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_7, thread);
            control_vars.$removal_cost_cutoff$.rebind(_prev_bind_6, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_5, thread);
            control_vars.$unbound_rule_backchain_enabled$.rebind(_prev_bind_4, thread);
            control_vars.$cache_inference_results$.rebind(_prev_bind_3, thread);
            control_vars.$hl_failure_backchaining$.rebind(_prev_bind_2, thread);
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 22351L)
    public static SubLObject new_continuable_inference_from_cycl_query_spec(final SubLObject query_spec) {
        assert cycl_query_specification.NIL != cycl_query_specification_p(query_spec) : query_spec;
        final SubLObject sentence = cycl_query_spec_formula(query_spec);
        final SubLObject mt = cycl_query_spec_mt(query_spec);
        final SubLObject query_properties = static_query_properties_from_cycl_query_spec(query_spec);
        return inference_kernel.new_continuable_inference(sentence, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 22809L)
    public static SubLObject continue_cycl_query_spec_inference(final SubLObject query_spec, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cycl_query_specification.NIL != cycl_query_specification_p(query_spec) : query_spec;
        SubLObject result = (SubLObject)cycl_query_specification.NIL;
        final SubLObject query_properties = dynamic_query_properties_from_cycl_query_spec(query_spec);
        final SubLObject _prev_bind_0 = backward.$transformation_semantic_pruning_enabled$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
        try {
            backward.$transformation_semantic_pruning_enabled$.bind(cycl_query_specification_enable_semantic_pruning(query_spec), thread);
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind(cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations(query_spec), thread);
            result = inference_kernel.continue_inference(inference, query_properties);
        }
        finally {
            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_2, thread);
            backward.$transformation_semantic_pruning_enabled$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 23419L)
    public static SubLObject static_query_properties_from_cycl_query_spec(final SubLObject query_spec) {
        final SubLObject hl_pred_transformationP = cycl_query_spec_enable_hl_predicate_backchaining(query_spec);
        final SubLObject unbound_pred_transformationP = cycl_query_spec_enable_unbound_predicate_backchaining(query_spec);
        final SubLObject negation_by_failureP = cycl_query_spec_enable_negation_by_failure(query_spec);
        final SubLObject conditional_sentenceP = cycl_query_specification_conditional_sentenceP(query_spec);
        return (SubLObject)ConsesLow.list((SubLObject)cycl_query_specification.$kw99$CONDITIONAL_SENTENCE_, conditional_sentenceP, (SubLObject)cycl_query_specification.$kw100$ALLOW_HL_PREDICATE_TRANSFORMATION_, hl_pred_transformationP, (SubLObject)cycl_query_specification.$kw101$NEGATION_BY_FAILURE_, negation_by_failureP, (SubLObject)cycl_query_specification.$kw102$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, unbound_pred_transformationP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycl-query-specification.lisp", position = 24191L)
    public static SubLObject dynamic_query_properties_from_cycl_query_spec(final SubLObject query_spec) {
        final SubLObject max_backchain = cycl_query_spec_back_chaining(query_spec);
        final SubLObject max_depth = cycl_query_spec_max_depth(query_spec);
        final SubLObject removal_cost_cutoff = cycl_query_specification_removal_cost_cutoff(query_spec);
        final SubLObject productivity_limit = ask_utilities.productivity_limit_from_removal_cost_cutoff(removal_cost_cutoff);
        final SubLObject cache_resultsP = cycl_query_spec_enable_cache_backwards_query_results(query_spec);
        final SubLObject time = cycl_query_spec_time_cutoff_secs(query_spec);
        final SubLObject number = cycl_query_spec_max_number_of_results(query_spec);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cycl_query_specification.$kw103$MAX_TRANSFORMATION_DEPTH, max_backchain, cycl_query_specification.$kw104$MAX_PROOF_DEPTH, max_depth, cycl_query_specification.$kw105$RETURN, cycl_query_specification.$kw106$BINDINGS_AND_SUPPORTS, cycl_query_specification.$kw107$PRODUCTIVITY_LIMIT, productivity_limit, cycl_query_specification.$kw108$ANSWER_LANGUAGE, cycl_query_specification.$kw109$HL, cycl_query_specification.$kw110$CACHE_INFERENCE_RESULTS_, cache_resultsP, cycl_query_specification.$kw111$MAX_TIME, time, cycl_query_specification.$kw112$MAX_NUMBER, number });
    }
    
    public static SubLObject declare_cycl_query_specification_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_print_function_trampoline", "CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_p", "CYCL-QUERY-SPECIFICATION-P", 1, 0, false);
        new $cycl_query_specification_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_cycl_id", "CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_formula", "CYCL-QUERY-SPEC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_mt", "CYCL-QUERY-SPEC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_comment", "CYCL-QUERY-SPEC-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_max_number_of_results", "CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_back_chaining", "CYCL-QUERY-SPEC-BACK-CHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_time_cutoff_secs", "CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_max_depth", "CYCL-QUERY-SPEC-MAX-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_removal_cost_cutoff", "CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_negation_by_failure", "CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_hl_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_cache_backwards_query_results", "CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_semantic_pruning", "CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_cycl_id", "_CSETF-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_formula", "_CSETF-CYCL-QUERY-SPEC-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_mt", "_CSETF-CYCL-QUERY-SPEC-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_comment", "_CSETF-CYCL-QUERY-SPEC-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_max_number_of_results", "_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_back_chaining", "_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_time_cutoff_secs", "_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_max_depth", "_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_removal_cost_cutoff", "_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_negation_by_failure", "_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_hl_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_cache_backwards_query_results", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_unbound_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_semantic_pruning", "_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "_csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "make_cycl_query_specification", "MAKE-CYCL-QUERY-SPECIFICATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "visit_defstruct_cycl_query_specification", "VISIT-DEFSTRUCT-CYCL-QUERY-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "visit_defstruct_object_cycl_query_specification_method", "VISIT-DEFSTRUCT-OBJECT-CYCL-QUERY-SPECIFICATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_cycl_id", "CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_formula", "CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_mt", "CYCL-QUERY-SPECIFICATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_comment", "CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_max_number_of_results", "CYCL-QUERY-SPECIFICATION-MAX-NUMBER-OF-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_back_chaining", "CYCL-QUERY-SPECIFICATION-BACK-CHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_time_cutoff_secs", "CYCL-QUERY-SPECIFICATION-TIME-CUTOFF-SECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_max_depth", "CYCL-QUERY-SPECIFICATION-MAX-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_conditional_sentenceP", "CYCL-QUERY-SPECIFICATION-CONDITIONAL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_removal_cost_cutoff", "CYCL-QUERY-SPECIFICATION-REMOVAL-COST-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_negation_by_failure", "CYCL-QUERY-SPECIFICATION-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_hl_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_cache_backwards_query_results", "CYCL-QUERY-SPECIFICATION-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_semantic_pruning", "CYCL-QUERY-SPECIFICATION-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPECIFICATION-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_copy", "CYCL-QUERY-SPECIFICATION-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_print", "CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_new", "CYCL-QUERY-SPECIFICATION-NEW", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_assign_param", "CYCL-QUERY-SPECIFICATION-ASSIGN-PARAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_get", "CYCL-QUERY-SPECIFICATION-GET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_ask_int", "CYCL-QUERY-SPECIFICATION-ASK-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_ask", "CYCL-QUERY-SPECIFICATION-ASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_set_mt", "CYCL-QUERY-SPECIFICATION-SET-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_new_query_from_old", "CYCL-QUERY-SPECIFICATION-NEW-QUERY-FROM-OLD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "cycl_query_specification_rkf_ask", "CYCL-QUERY-SPECIFICATION-RKF-ASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "new_continuable_inference_from_cycl_query_spec", "NEW-CONTINUABLE-INFERENCE-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "continue_cycl_query_spec_inference", "CONTINUE-CYCL-QUERY-SPEC-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "static_query_properties_from_cycl_query_spec", "STATIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cycl_query_specification", "dynamic_query_properties_from_cycl_query_spec", "DYNAMIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    public static SubLObject init_cycl_query_specification_file() {
        cycl_query_specification.$dtp_cycl_query_specification$ = SubLFiles.defconstant("*DTP-CYCL-QUERY-SPECIFICATION*", (SubLObject)cycl_query_specification.$sym0$CYCL_QUERY_SPECIFICATION);
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    public static SubLObject setup_cycl_query_specification_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cycl_query_specification.$dtp_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function((SubLObject)cycl_query_specification.$sym7$CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cycl_query_specification.$list8);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym9$CYCL_QUERY_SPEC_CYCL_ID, (SubLObject)cycl_query_specification.$sym10$_CSETF_CYCL_QUERY_SPEC_CYCL_ID);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym11$CYCL_QUERY_SPEC_FORMULA, (SubLObject)cycl_query_specification.$sym12$_CSETF_CYCL_QUERY_SPEC_FORMULA);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym13$CYCL_QUERY_SPEC_MT, (SubLObject)cycl_query_specification.$sym14$_CSETF_CYCL_QUERY_SPEC_MT);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym15$CYCL_QUERY_SPEC_COMMENT, (SubLObject)cycl_query_specification.$sym16$_CSETF_CYCL_QUERY_SPEC_COMMENT);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym17$CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, (SubLObject)cycl_query_specification.$sym18$_CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym19$CYCL_QUERY_SPEC_BACK_CHAINING, (SubLObject)cycl_query_specification.$sym20$_CSETF_CYCL_QUERY_SPEC_BACK_CHAINING);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym21$CYCL_QUERY_SPEC_TIME_CUTOFF_SECS, (SubLObject)cycl_query_specification.$sym22$_CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym23$CYCL_QUERY_SPEC_MAX_DEPTH, (SubLObject)cycl_query_specification.$sym24$_CSETF_CYCL_QUERY_SPEC_MAX_DEPTH);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym25$CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF, (SubLObject)cycl_query_specification.$sym26$_CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym27$CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, (SubLObject)cycl_query_specification.$sym28$_CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym29$CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, (SubLObject)cycl_query_specification.$sym30$_CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym31$CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, (SubLObject)cycl_query_specification.$sym32$_CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym33$CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, (SubLObject)cycl_query_specification.$sym34$_CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym35$CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING, (SubLObject)cycl_query_specification.$sym36$_CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING);
        Structures.def_csetf((SubLObject)cycl_query_specification.$sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, (SubLObject)cycl_query_specification.$sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
        Equality.identity((SubLObject)cycl_query_specification.$sym0$CYCL_QUERY_SPECIFICATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cycl_query_specification.$dtp_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function((SubLObject)cycl_query_specification.$sym59$VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD));
        return (SubLObject)cycl_query_specification.NIL;
    }
    
    public void declareFunctions() {
        declare_cycl_query_specification_file();
    }
    
    public void initializeVariables() {
        init_cycl_query_specification_file();
    }
    
    public void runTopLevelForms() {
        setup_cycl_query_specification_file();
    }
    
    static {
        me = (SubLFile)new cycl_query_specification();
        cycl_query_specification.$dtp_cycl_query_specification$ = null;
        $sym0$CYCL_QUERY_SPECIFICATION = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION");
        $sym1$CYCL_QUERY_SPECIFICATION_P = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CYCL-ID"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("MAX-NUMBER-OF-RESULTS"), SubLObjectFactory.makeSymbol("BACK-CHAINING"), SubLObjectFactory.makeSymbol("TIME-CUTOFF-SECS"), SubLObjectFactory.makeSymbol("MAX-DEPTH"), SubLObjectFactory.makeSymbol("REMOVAL-COST-CUTOFF"), SubLObjectFactory.makeSymbol("ENABLE-NEGATION-BY-FAILURE"), SubLObjectFactory.makeSymbol("ENABLE-HL-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), SubLObjectFactory.makeSymbol("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("ENABLE-SEMANTIC-PRUNING"), SubLObjectFactory.makeSymbol("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CYCL-ID"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("MAX-NUMBER-OF-RESULTS"), SubLObjectFactory.makeKeyword("BACK-CHAINING"), SubLObjectFactory.makeKeyword("TIME-CUTOFF-SECS"), SubLObjectFactory.makeKeyword("MAX-DEPTH"), SubLObjectFactory.makeKeyword("REMOVAL-COST-CUTOFF"), SubLObjectFactory.makeKeyword("ENABLE-NEGATION-BY-FAILURE"), SubLObjectFactory.makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), SubLObjectFactory.makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeKeyword("ENABLE-SEMANTIC-PRUNING"), SubLObjectFactory.makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-CYCL-ID"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-FORMULA"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MT"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-COMMENT"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS") });
        $sym6$CYCL_QUERY_SPECIFICATION_PRINT = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT");
        $sym7$CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-P"));
        $sym9$CYCL_QUERY_SPEC_CYCL_ID = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-CYCL-ID");
        $sym10$_CSETF_CYCL_QUERY_SPEC_CYCL_ID = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID");
        $sym11$CYCL_QUERY_SPEC_FORMULA = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-FORMULA");
        $sym12$_CSETF_CYCL_QUERY_SPEC_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA");
        $sym13$CYCL_QUERY_SPEC_MT = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MT");
        $sym14$_CSETF_CYCL_QUERY_SPEC_MT = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT");
        $sym15$CYCL_QUERY_SPEC_COMMENT = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-COMMENT");
        $sym16$_CSETF_CYCL_QUERY_SPEC_COMMENT = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT");
        $sym17$CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");
        $sym18$_CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");
        $sym19$CYCL_QUERY_SPEC_BACK_CHAINING = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING");
        $sym20$_CSETF_CYCL_QUERY_SPEC_BACK_CHAINING = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING");
        $sym21$CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");
        $sym22$_CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");
        $sym23$CYCL_QUERY_SPEC_MAX_DEPTH = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH");
        $sym24$_CSETF_CYCL_QUERY_SPEC_MAX_DEPTH = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH");
        $sym25$CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");
        $sym26$_CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");
        $sym27$CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");
        $sym28$_CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");
        $sym29$CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");
        $sym30$_CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");
        $sym31$CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
        $sym32$_CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
        $sym33$CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
        $sym34$_CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
        $sym35$CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");
        $sym36$_CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");
        $sym37$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA = SubLObjectFactory.makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
        $sym38$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR = SubLObjectFactory.makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
        $kw39$CYCL_ID = SubLObjectFactory.makeKeyword("CYCL-ID");
        $kw40$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw41$MT = SubLObjectFactory.makeKeyword("MT");
        $kw42$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw43$MAX_NUMBER_OF_RESULTS = SubLObjectFactory.makeKeyword("MAX-NUMBER-OF-RESULTS");
        $kw44$BACK_CHAINING = SubLObjectFactory.makeKeyword("BACK-CHAINING");
        $kw45$TIME_CUTOFF_SECS = SubLObjectFactory.makeKeyword("TIME-CUTOFF-SECS");
        $kw46$MAX_DEPTH = SubLObjectFactory.makeKeyword("MAX-DEPTH");
        $kw47$REMOVAL_COST_CUTOFF = SubLObjectFactory.makeKeyword("REMOVAL-COST-CUTOFF");
        $kw48$ENABLE_NEGATION_BY_FAILURE = SubLObjectFactory.makeKeyword("ENABLE-NEGATION-BY-FAILURE");
        $kw49$ENABLE_HL_PREDICATE_BACKCHAINING = SubLObjectFactory.makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING");
        $kw50$ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = SubLObjectFactory.makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
        $kw51$ENABLE_UNBOUND_PREDICATE_BACKCHAINING = SubLObjectFactory.makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
        $kw52$ENABLE_SEMANTIC_PRUNING = SubLObjectFactory.makeKeyword("ENABLE-SEMANTIC-PRUNING");
        $kw53$ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS = SubLObjectFactory.makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
        $str54$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw55$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym56$MAKE_CYCL_QUERY_SPECIFICATION = SubLObjectFactory.makeSymbol("MAKE-CYCL-QUERY-SPECIFICATION");
        $kw57$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw58$END = SubLObjectFactory.makeKeyword("END");
        $sym59$VISIT_DEFSTRUCT_OBJECT_CYCL_QUERY_SPECIFICATION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCL-QUERY-SPECIFICATION-METHOD");
        $str60$___Acycl_query_specification___ = SubLObjectFactory.makeString("~%~Acycl-query-specification:~%");
        $str61$_Acycl_id____A__ = SubLObjectFactory.makeString("~Acycl-id:  ~A~%");
        $str62$_Aformula___A__ = SubLObjectFactory.makeString("~Aformula: ~A~%");
        $str63$_Amt___S__ = SubLObjectFactory.makeString("~Amt: ~S~%");
        $str64$_Acomment___A__ = SubLObjectFactory.makeString("~Acomment: ~A~%");
        $str65$_Amax_number_of_results___A__ = SubLObjectFactory.makeString("~Amax-number-of-results: ~A~%");
        $str66$_Aback_chaining___A__ = SubLObjectFactory.makeString("~Aback-chaining: ~A~%");
        $str67$_Atime_cutoff_secs___A__ = SubLObjectFactory.makeString("~Atime-cutoff-secs: ~A~%");
        $str68$_Amax_depth___A__ = SubLObjectFactory.makeString("~Amax-depth: ~A~%");
        $str69$_Aremoval_cost_cutoff___A__ = SubLObjectFactory.makeString("~Aremoval-cost-cutoff: ~A~%");
        $str70$_Aenable_negation_by_failure___A_ = SubLObjectFactory.makeString("~Aenable-negation-by-failure: ~A~%");
        $str71$_Aenable_hl_predicate_backchainin = SubLObjectFactory.makeString("~Aenable-hl-predicate-backchaining: ~A~%");
        $str72$_Aenable_cache_backwards_query_re = SubLObjectFactory.makeString("~Aenable-cache-backwards-query-results: ~A~%");
        $str73$_Aenable_unbound_predicate_backch = SubLObjectFactory.makeString("~Aenable-unbound-predicate-backchaining: ~A~%");
        $str74$_Aenable_semantic_pruning___A__ = SubLObjectFactory.makeString("~Aenable-semantic-pruning: ~A~%");
        $str75$_Aenable_consideration_of_disjunc = SubLObjectFactory.makeString("~Aenable-consideration-of-disjunctive-temporal-relations: ~A~%~%");
        $int76$30 = SubLObjectFactory.makeInteger(30);
        $int77$10000 = SubLObjectFactory.makeInteger(10000);
        $const78$InferenceFormulaParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceFormulaParameter"));
        $const79$InferenceMicrotheoryParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMicrotheoryParameter"));
        $const80$InferenceMaxAnswersParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMaxAnswersParameter"));
        $const81$InferenceMaxTransformationStepsPa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMaxTransformationStepsParameter"));
        $const82$InferenceMaxTimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMaxTimeParameter"));
        $const83$InferenceMaxProofDepthParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceMaxProofDepthParameter"));
        $const84$InferenceAllowUnboundPredicateTra = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceAllowUnboundPredicateTransformationParameter"));
        $const85$InferenceProductivityLimitParamet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceProductivityLimitParameter"));
        $const86$InferenceEnableConsiderDisjunctiv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceEnableConsiderDisjunctiveTemporalRelationsParameter"));
        $const87$InferenceEnableSemanticPruningPar = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceEnableSemanticPruningParameter"));
        $const88$InferenceCacheInferenceResultsPar = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceCacheInferenceResultsParameter"));
        $const89$InferenceAllowHLPredicateTransfor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceAllowHLPredicateTransformationParameter"));
        $const90$InferenceNegationByFailureParamet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceNegationByFailureParameter"));
        $const91$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $sym92$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $sym93$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COMMENT"));
        $const95$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("softwareParameterValueInSpecification"));
        $sym96$_PARAM = SubLObjectFactory.makeSymbol("?PARAM");
        $sym97$_VAL = SubLObjectFactory.makeSymbol("?VAL");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAM"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"));
        $kw99$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $kw100$ALLOW_HL_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $kw101$NEGATION_BY_FAILURE_ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $kw102$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $kw103$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw104$MAX_PROOF_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $kw105$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw106$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw107$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $kw108$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw109$HL = SubLObjectFactory.makeKeyword("HL");
        $kw110$CACHE_INFERENCE_RESULTS_ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $kw111$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw112$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
    }
    
    public static final class $cycl_query_specification_native extends SubLStructNative
    {
        public SubLObject $cycl_id;
        public SubLObject $formula;
        public SubLObject $mt;
        public SubLObject $comment;
        public SubLObject $max_number_of_results;
        public SubLObject $back_chaining;
        public SubLObject $time_cutoff_secs;
        public SubLObject $max_depth;
        public SubLObject $removal_cost_cutoff;
        public SubLObject $enable_negation_by_failure;
        public SubLObject $enable_hl_predicate_backchaining;
        public SubLObject $enable_cache_backwards_query_results;
        public SubLObject $enable_unbound_predicate_backchaining;
        public SubLObject $enable_semantic_pruning;
        public SubLObject $enable_consideration_of_disjunctive_temporal_relations;
        private static final SubLStructDeclNative structDecl;
        
        public $cycl_query_specification_native() {
            this.$cycl_id = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$max_number_of_results = (SubLObject)CommonSymbols.NIL;
            this.$back_chaining = (SubLObject)CommonSymbols.NIL;
            this.$time_cutoff_secs = (SubLObject)CommonSymbols.NIL;
            this.$max_depth = (SubLObject)CommonSymbols.NIL;
            this.$removal_cost_cutoff = (SubLObject)CommonSymbols.NIL;
            this.$enable_negation_by_failure = (SubLObject)CommonSymbols.NIL;
            this.$enable_hl_predicate_backchaining = (SubLObject)CommonSymbols.NIL;
            this.$enable_cache_backwards_query_results = (SubLObject)CommonSymbols.NIL;
            this.$enable_unbound_predicate_backchaining = (SubLObject)CommonSymbols.NIL;
            this.$enable_semantic_pruning = (SubLObject)CommonSymbols.NIL;
            this.$enable_consideration_of_disjunctive_temporal_relations = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cycl_query_specification_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl_id;
        }
        
        public SubLObject getField3() {
            return this.$formula;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$comment;
        }
        
        public SubLObject getField6() {
            return this.$max_number_of_results;
        }
        
        public SubLObject getField7() {
            return this.$back_chaining;
        }
        
        public SubLObject getField8() {
            return this.$time_cutoff_secs;
        }
        
        public SubLObject getField9() {
            return this.$max_depth;
        }
        
        public SubLObject getField10() {
            return this.$removal_cost_cutoff;
        }
        
        public SubLObject getField11() {
            return this.$enable_negation_by_failure;
        }
        
        public SubLObject getField12() {
            return this.$enable_hl_predicate_backchaining;
        }
        
        public SubLObject getField13() {
            return this.$enable_cache_backwards_query_results;
        }
        
        public SubLObject getField14() {
            return this.$enable_unbound_predicate_backchaining;
        }
        
        public SubLObject getField15() {
            return this.$enable_semantic_pruning;
        }
        
        public SubLObject getField16() {
            return this.$enable_consideration_of_disjunctive_temporal_relations;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl_id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$formula = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$max_number_of_results = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$back_chaining = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$time_cutoff_secs = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$max_depth = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$removal_cost_cutoff = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$enable_negation_by_failure = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$enable_hl_predicate_backchaining = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$enable_cache_backwards_query_results = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$enable_unbound_predicate_backchaining = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$enable_semantic_pruning = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$enable_consideration_of_disjunctive_temporal_relations = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cycl_query_specification_native.class, cycl_query_specification.$sym0$CYCL_QUERY_SPECIFICATION, cycl_query_specification.$sym1$CYCL_QUERY_SPECIFICATION_P, cycl_query_specification.$list2, cycl_query_specification.$list3, new String[] { "$cycl_id", "$formula", "$mt", "$comment", "$max_number_of_results", "$back_chaining", "$time_cutoff_secs", "$max_depth", "$removal_cost_cutoff", "$enable_negation_by_failure", "$enable_hl_predicate_backchaining", "$enable_cache_backwards_query_results", "$enable_unbound_predicate_backchaining", "$enable_semantic_pruning", "$enable_consideration_of_disjunctive_temporal_relations" }, cycl_query_specification.$list4, cycl_query_specification.$list5, cycl_query_specification.$sym6$CYCL_QUERY_SPECIFICATION_PRINT);
        }
    }
    
    public static final class $cycl_query_specification_p$UnaryFunction extends UnaryFunction
    {
        public $cycl_query_specification_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-QUERY-SPECIFICATION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cycl_query_specification.cycl_query_specification_p(arg1);
        }
    }
}

/*

	Total time: 290 ms
	 synthetic 
*/