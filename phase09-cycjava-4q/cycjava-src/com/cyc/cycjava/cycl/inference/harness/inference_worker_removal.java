package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
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
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_natfunction;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_asserted_formula;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_isa;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.inference.modules.removal.meta_removal_modules;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conjunctive_pruning;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_removal extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_removal";
    public static final String myFingerPrint = "1c41b8ebe528cf780646364a11ff99bd687f290e3192801352d3dff9709a21a2";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLSymbol $dtp_removal_link_data$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19297L)
    private static SubLSymbol $conjunctive_removal_tactic_expand_results_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21434L)
    private static SubLSymbol $conjunctive_removal_suppress_split_justificationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21760L)
    public static SubLSymbol $conjunctive_removal_optimize_when_no_justificationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54076L)
    private static SubLSymbol $removal_tactic_iteration_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54337L)
    private static SubLSymbol $removal_tactic_expand_results_queue$;
    private static final SubLSymbol $sym0$REMOVAL_LINK_DATA;
    private static final SubLSymbol $sym1$REMOVAL_LINK_DATA_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$REMOV_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE;
    private static final SubLSymbol $sym11$REMOV_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym12$_CSETF_REMOV_LINK_DATA_BINDINGS;
    private static final SubLSymbol $sym13$REMOV_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS;
    private static final SubLSymbol $kw15$HL_MODULE;
    private static final SubLSymbol $kw16$BINDINGS;
    private static final SubLSymbol $kw17$SUPPORTS;
    private static final SubLString $str18$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw19$BEGIN;
    private static final SubLSymbol $sym20$MAKE_REMOVAL_LINK_DATA;
    private static final SubLSymbol $kw21$SLOT;
    private static final SubLSymbol $kw22$END;
    private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD;
    private static final SubLSymbol $sym24$PROBLEM_P;
    private static final SubLSymbol $kw25$REMOVAL;
    private static final SubLSymbol $kw26$FREE;
    private static final SubLSymbol $sym27$REMOVAL_LINK_P;
    private static final SubLSymbol $sym28$HL_MODULE_P;
    private static final SubLSymbol $sym29$BINDING_LIST_P;
    private static final SubLSymbol $sym30$HL_JUSTIFICATION_P;
    private static final SubLSymbol $kw31$RESTRICTION;
    private static final SubLSymbol $kw32$SPLIT;
    private static final SubLSymbol $kw33$REMOVAL_CONJUNCTIVE;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_;
    private static final SubLSymbol $kw36$ALL;
    private static final SubLSymbol $kw37$INFERENCE;
    private static final SubLString $str38$_s_stated_its_applicability_to_th;
    private static final SubLSymbol $kw39$SKIP;
    private static final SubLSymbol $kw40$TACTICAL;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE;
    private static final SubLSymbol $sym43$HL_VAR_;
    private static final SubLSymbol $kw44$CONJUNCTIVE_REMOVAL_EXPAND;
    private static final SubLSymbol $kw45$INFERENCE_PROOF_SPEC;
    private static final SubLString $str46$Problem_reuse_assumptions_were_vi;
    private static final SubLString $str47$Couldn_t_find_the_right_conjuncti;
    private static final SubLSymbol $kw48$NEG;
    private static final SubLSymbol $kw49$POS;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$SKSI;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$STORE_VAR;
    private static final SubLSymbol $sym54$CLET;
    private static final SubLSymbol $sym55$_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $kw57$META_REMOVAL;
    private static final SubLSymbol $sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED;
    private static final SubLSymbol $sym59$_EXIT;
    private static final SubLSymbol $sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED;
    private static final SubLSymbol $sym61$REMOVAL_ABDUCTION_POS_REQUIRED;
    private static final SubLSymbol $sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED;
    private static final SubLSymbol $sym63$REMOVAL_FCP_CHECK_REQUIRED;
    private static final SubLSymbol $sym64$REMOVAL_ISA_DEFN_POS_REQUIRED;
    private static final SubLSymbol $sym65$REMOVAL_TVA_CHECK_REQUIRED;
    private static final SubLSymbol $sym66$REMOVAL_TVA_UNIFY_REQUIRED;
    private static final SubLSymbol $sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND;
    private static final SubLSymbol $sym68$REMOVAL_EVAL_EXPAND;
    private static final SubLSymbol $sym69$REMOVAL_EVALUATE_BIND_EXPAND;
    private static final SubLSymbol $sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND;
    private static final SubLSymbol $sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND;
    private static final SubLSymbol $sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND;
    private static final SubLSymbol $sym73$REMOVAL_NAT_FORMULA_EXPAND;
    private static final SubLSymbol $sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND;
    private static final SubLSymbol $sym75$REMOVAL_NAT_LOOKUP_EXPAND;
    private static final SubLSymbol $sym76$REMOVAL_REFLEXIVE_ON_EXPAND;
    private static final SubLSymbol $sym77$REMOVAL_TVA_CHECK_EXPAND;
    private static final SubLSymbol $kw78$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES;
    private static final SubLSymbol $kw79$NOT;
    private static final SubLSymbol $kw80$MODULE_SUBTYPE;
    private static final SubLSymbol $sym81$FIRST;
    private static final SubLString $str82$For_sentence_____S__Maximum_HL_Mo;
    private static final SubLSymbol $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT;
    private static final SubLSymbol $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$TACTIC_VAR;
    private static final SubLSymbol $sym87$WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLSymbol $sym88$_INFERENCE_EXPAND_HL_MODULE_;
    private static final SubLSymbol $sym89$TACTIC_HL_MODULE;
    private static final SubLSymbol $sym90$_INFERENCE_EXPAND_SENSE_;
    private static final SubLSymbol $sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS;
    private static final SubLSymbol $sym92$TACTIC_STORE;
    private static final SubLSymbol $kw93$REMOVAL_OUTPUT_GENERATE;
    private static final SubLSymbol $sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE;
    private static final SubLSymbol $kw95$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR;
    private static final SubLSymbol $sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS;
    private static final SubLSymbol $kw97$REMOVAL_EXPAND;
    private static final SubLList $list98;
    private static final SubLString $str99$Ignoring_result_from__S_due_to_op;
    private static final SubLSymbol $sym100$PRODUCTIVITY__;
    private static final SubLSymbol $sym101$TACTIC_PRODUCTIVITY;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$ITERATOR;
    private static final SubLSymbol $sym104$PIF;
    private static final SubLSymbol $sym105$ITERATOR_P;
    private static final SubLSymbol $sym106$CUNWIND_PROTECT;
    private static final SubLSymbol $sym107$DO_ITERATOR;
    private static final SubLSymbol $sym108$ITERATION_FINALIZE;
    private static final SubLSymbol $sym109$DO_LIST;
    private static final SubLSymbol $kw110$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR;
    private static final SubLSymbol $kw111$HANDLE_ONE_OUTPUT_GENERATE_RESULT;
    private static final SubLList $list112;
    private static final SubLSymbol $kw113$TRUE;
    private static final SubLString $str114$unknown_thing_to_do_in_the_HL_mod;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject removal_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)inference_worker_removal.ZERO_INTEGER);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject removal_link_data_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $removal_link_data_native.class) ? inference_worker_removal.T : inference_worker_removal.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject remov_link_data_hl_module(final SubLObject v_object) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject remov_link_data_bindings(final SubLObject v_object) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject remov_link_data_supports(final SubLObject v_object) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject _csetf_remov_link_data_hl_module(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject _csetf_remov_link_data_bindings(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject _csetf_remov_link_data_supports(final SubLObject v_object, final SubLObject value) {
        assert inference_worker_removal.NIL != removal_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject make_removal_link_data(SubLObject arglist) {
        if (arglist == inference_worker_removal.UNPROVIDED) {
            arglist = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject v_new = (SubLObject)new $removal_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_worker_removal.NIL, next = arglist; inference_worker_removal.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_worker_removal.$kw15$HL_MODULE)) {
                _csetf_remov_link_data_hl_module(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_removal.$kw16$BINDINGS)) {
                _csetf_remov_link_data_bindings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_worker_removal.$kw17$SUPPORTS)) {
                _csetf_remov_link_data_supports(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_worker_removal.$str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject visit_defstruct_removal_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_removal.$kw19$BEGIN, (SubLObject)inference_worker_removal.$sym20$MAKE_REMOVAL_LINK_DATA, (SubLObject)inference_worker_removal.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_removal.$kw21$SLOT, (SubLObject)inference_worker_removal.$kw15$HL_MODULE, remov_link_data_hl_module(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_removal.$kw21$SLOT, (SubLObject)inference_worker_removal.$kw16$BINDINGS, remov_link_data_bindings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_removal.$kw21$SLOT, (SubLObject)inference_worker_removal.$kw17$SUPPORTS, remov_link_data_supports(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_worker_removal.$kw22$END, (SubLObject)inference_worker_removal.$sym20$MAKE_REMOVAL_LINK_DATA, (SubLObject)inference_worker_removal.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1243L)
    public static SubLObject visit_defstruct_object_removal_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_link_data(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 1758L)
    public static SubLObject new_removal_link(final SubLObject problem, final SubLObject hl_module, final SubLObject removal_bindings, final SubLObject supports) {
        assert inference_worker_removal.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject removal_link = new_removal_link_int(problem, hl_module, removal_bindings, supports);
        inference_worker.propagate_problem_link(removal_link);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2173L)
    public static SubLObject new_removal_link_int(final SubLObject problem, final SubLObject hl_module, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject removal_link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_removal.$kw25$REMOVAL, problem);
        new_removal_link_data(removal_link);
        set_removal_link_hl_module(removal_link, hl_module);
        set_removal_link_bindings(removal_link, removal_bindings);
        set_removal_link_supports(removal_link, supports);
        inference_datastructures_problem.index_problem_argument_link(problem, removal_link);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2781L)
    public static SubLObject new_removal_link_data(final SubLObject removal_link) {
        final SubLObject data = make_removal_link_data((SubLObject)inference_worker_removal.UNPROVIDED);
        inference_datastructures_problem_link.set_problem_link_data(removal_link, data);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 2946L)
    public static SubLObject destroy_removal_link(final SubLObject removal_link) {
        inference_datastructures_problem.deindex_problem_argument_link(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), removal_link);
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_hl_module(data, (SubLObject)inference_worker_removal.$kw26$FREE);
        _csetf_remov_link_data_bindings(data, (SubLObject)inference_worker_removal.$kw26$FREE);
        _csetf_remov_link_data_supports(data, (SubLObject)inference_worker_removal.$kw26$FREE);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3376L)
    public static SubLObject removal_link_hl_module(final SubLObject removal_link) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_hl_module(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3583L)
    public static SubLObject removal_link_bindings(final SubLObject removal_link) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_bindings(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 3959L)
    public static SubLObject removal_link_supports(final SubLObject removal_link) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        return remov_link_data_supports(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4152L)
    public static SubLObject set_removal_link_hl_module(final SubLObject removal_link, final SubLObject hl_module) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        assert inference_worker_removal.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_hl_module(data, hl_module);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4441L)
    public static SubLObject set_removal_link_bindings(final SubLObject removal_link, final SubLObject v_bindings) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        assert inference_worker_removal.NIL != bindings.binding_list_p(v_bindings) : v_bindings;
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
        _csetf_remov_link_data_bindings(data, v_bindings);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 4716L)
    public static SubLObject set_removal_link_supports(final SubLObject removal_link, final SubLObject supports) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        assert inference_worker_removal.NIL != arguments.hl_justification_p(supports) : supports;
        if (inference_worker_removal.NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem_link.problem_link_store(removal_link))) {
            final SubLObject data = inference_datastructures_problem_link.problem_link_data(removal_link);
            _csetf_remov_link_data_supports(data, supports);
        }
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 5090L)
    public static SubLObject removal_link_tactic(final SubLObject removal_link) {
        assert inference_worker_removal.NIL != removal_link_p(removal_link) : removal_link;
        final SubLObject hl_module = removal_link_hl_module(removal_link);
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(removal_link);
        if (inference_worker_removal.NIL != inference_modules.removal_module_p(hl_module)) {
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject candidate_tactic = (SubLObject)inference_worker_removal.NIL;
            candidate_tactic = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                if (inference_worker_removal.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic, (SubLObject)inference_worker_removal.$kw25$REMOVAL) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic).eql(hl_module)) {
                    return candidate_tactic;
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate_tactic = cdolist_list_var.first();
            }
            if (inference_worker_removal.NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store) && inference_worker_removal.NIL != inference_datastructures_problem.closed_problem_p(problem)) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject restriction_link;
                SubLObject unrestricted_problem;
                SubLObject cdolist_list_var2;
                SubLObject candidate_tactic2;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    restriction_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && inference_worker_removal.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)inference_worker_removal.$kw31$RESTRICTION)) {
                        unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                        cdolist_list_var2 = inference_datastructures_problem.problem_tactics(unrestricted_problem);
                        candidate_tactic2 = (SubLObject)inference_worker_removal.NIL;
                        candidate_tactic2 = cdolist_list_var2.first();
                        while (inference_worker_removal.NIL != cdolist_list_var2) {
                            if (inference_worker_removal.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, (SubLObject)inference_worker_removal.$kw25$REMOVAL) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                                return candidate_tactic2;
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            candidate_tactic2 = cdolist_list_var2.first();
                        }
                    }
                }
            }
        }
        else {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject cdolist_list_var2;
            SubLObject candidate_tactic2;
            SubLObject split_link;
            SubLObject split_problem;
            SubLObject set_contents_var_$1;
            SubLObject basis_object_$2;
            SubLObject state_$3;
            SubLObject restriction_link2;
            SubLObject unrestricted_problem2;
            SubLObject cdolist_list_var3;
            SubLObject candidate_tactic3;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                split_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, split_link) && inference_worker_removal.NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, (SubLObject)inference_worker_removal.$kw32$SPLIT)) {
                    split_problem = inference_datastructures_problem_link.problem_link_supported_problem(split_link);
                    cdolist_list_var2 = inference_datastructures_problem.problem_tactics(split_problem);
                    candidate_tactic2 = (SubLObject)inference_worker_removal.NIL;
                    candidate_tactic2 = cdolist_list_var2.first();
                    while (inference_worker_removal.NIL != cdolist_list_var2) {
                        if (inference_worker_removal.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic2, (SubLObject)inference_worker_removal.$kw33$REMOVAL_CONJUNCTIVE) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic2).eql(hl_module)) {
                            return candidate_tactic2;
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        candidate_tactic2 = cdolist_list_var2.first();
                    }
                    set_contents_var_$1 = inference_datastructures_problem.problem_dependent_links(split_problem);
                    for (basis_object_$2 = set_contents.do_set_contents_basis_object(set_contents_var_$1), state_$3 = (SubLObject)inference_worker_removal.NIL, state_$3 = set_contents.do_set_contents_initial_state(basis_object_$2, set_contents_var_$1); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object_$2, state_$3); state_$3 = set_contents.do_set_contents_update_state(state_$3)) {
                        restriction_link2 = set_contents.do_set_contents_next(basis_object_$2, state_$3);
                        if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state_$3, restriction_link2) && inference_worker_removal.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link2, (SubLObject)inference_worker_removal.$kw31$RESTRICTION)) {
                            unrestricted_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link2);
                            cdolist_list_var3 = inference_datastructures_problem.problem_tactics(unrestricted_problem2);
                            candidate_tactic3 = (SubLObject)inference_worker_removal.NIL;
                            candidate_tactic3 = cdolist_list_var3.first();
                            while (inference_worker_removal.NIL != cdolist_list_var3) {
                                if (inference_worker_removal.NIL != inference_datastructures_problem.do_problem_tactics_type_match(candidate_tactic3, (SubLObject)inference_worker_removal.$kw33$REMOVAL_CONJUNCTIVE) && inference_datastructures_tactic.tactic_hl_module(candidate_tactic3).eql(hl_module)) {
                                    return candidate_tactic3;
                                }
                                cdolist_list_var3 = cdolist_list_var3.rest();
                                candidate_tactic3 = cdolist_list_var3.first();
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7594L)
    public static SubLObject removal_link_data_equals_specP(final SubLObject removal_link, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject link_removal_bindings = removal_link_bindings(removal_link);
        final SubLObject link_supports = removal_link_supports(removal_link);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_bindings.equal(link_removal_bindings) && inference_worker_removal.NIL != arguments.justification_equal(supports, link_supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 7939L)
    public static SubLObject generalized_removal_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != removal_tactic_p(v_object) || inference_worker_removal.NIL != conjunctive_removal_tactic_p(v_object) || inference_worker_removal.NIL != meta_removal_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8236L)
    public static SubLObject conjunctive_removal_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_tactic.tactic_p(tactic) && inference_worker_removal.$kw33$REMOVAL_CONJUNCTIVE == inference_datastructures_tactic.tactic_type(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8407L)
    public static SubLObject conjunctive_removal_link_p(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != removal_link_p(link) && inference_worker_removal.NIL != inference_modules.conjunctive_removal_module_p(removal_link_hl_module(link)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8562L)
    public static SubLObject conjunctive_removal_proof_p(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_proof.proof_p(proof) && inference_worker_removal.NIL != conjunctive_removal_link_p(inference_datastructures_proof.proof_link(proof)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 8700L)
    public static SubLObject determine_new_conjunctive_removal_tactics(final SubLObject problem, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_removal.NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        SubLObject supplanted_hl_modules = (SubLObject)inference_worker_removal.NIL;
        SubLObject tactic_specs = (SubLObject)inference_worker_removal.NIL;
        SubLObject exclusive_foundP = (SubLObject)inference_worker_removal.NIL;
        final SubLObject common_mt = inference_czer.contextualized_dnf_clause_common_mt(dnf_clause);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(common_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject hl_modules = determine_applicable_conjunctive_removal_modules(dnf_clause);
            hl_modules = sort_applicable_conjunctive_removal_modules_by_priority(hl_modules);
            if (inference_worker_removal.NIL == exclusive_foundP) {
                SubLObject csome_list_var = hl_modules;
                SubLObject hl_module = (SubLObject)inference_worker_removal.NIL;
                hl_module = csome_list_var.first();
                while (inference_worker_removal.NIL == exclusive_foundP && inference_worker_removal.NIL != csome_list_var) {
                    if (inference_worker_removal.NIL == supplanted_hl_modules || inference_worker_removal.NIL == conses_high.member(hl_module, supplanted_hl_modules, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED)) {
                        final SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
                        if (inference_worker_removal.NIL == exclusive_func || (exclusive_func.isFunctionSpec() && inference_worker_removal.NIL != Functions.funcall(exclusive_func, dnf_clause))) {
                            if (inference_worker_removal.NIL != exclusive_func) {
                                thread.resetMultipleValues();
                                final SubLObject exclusive_foundP_$4 = update_supplanted_modules_wrt_tactic_specs(hl_module, tactic_specs, supplanted_hl_modules);
                                final SubLObject tactic_specs_$5 = thread.secondMultipleValue();
                                final SubLObject supplanted_hl_modules_$6 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                exclusive_foundP = exclusive_foundP_$4;
                                tactic_specs = tactic_specs_$5;
                                supplanted_hl_modules = supplanted_hl_modules_$6;
                            }
                            final SubLObject cost = inference_modules.hl_module_clause_cost(hl_module, dnf_clause);
                            if (inference_worker_removal.NIL != cost) {
                                final SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                                final SubLObject completeness = inference_modules.hl_module_clause_completeness(hl_module, dnf_clause);
                                final SubLObject tactic_spec = (SubLObject)ConsesLow.list(hl_module, productivity, completeness);
                                tactic_specs = (SubLObject)ConsesLow.cons(tactic_spec, tactic_specs);
                            }
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    hl_module = csome_list_var.first();
                }
            }
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec2 = (SubLObject)inference_worker_removal.NIL;
            tactic_spec2 = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = tactic_spec2;
                SubLObject hl_module2 = (SubLObject)inference_worker_removal.NIL;
                SubLObject productivity2 = (SubLObject)inference_worker_removal.NIL;
                SubLObject completeness2 = (SubLObject)inference_worker_removal.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
                hl_module2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
                productivity2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
                completeness2 = current.first();
                current = current.rest();
                if (inference_worker_removal.NIL == current) {
                    new_conjunctive_removal_tactic(problem, hl_module2, productivity2, completeness2);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list34);
                }
                cdolist_list_var = cdolist_list_var.rest();
                tactic_spec2 = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10568L)
    public static SubLObject sort_applicable_conjunctive_removal_modules_by_priority(final SubLObject hl_modules) {
        return Sort.sort(hl_modules, (SubLObject)inference_worker_removal.$sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_, (SubLObject)inference_worker_removal.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 10995L)
    public static SubLObject conjunctive_removal_module_priorityL(final SubLObject hl_module1, final SubLObject hl_module2) {
        if (inference_worker_removal.NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1) && inference_worker_removal.NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2)) {
            return (SubLObject)inference_worker_removal.T;
        }
        if (inference_worker_removal.NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module2) && inference_worker_removal.NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module1)) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        if (inference_worker_removal.NIL != simplification_modules.simplification_module_p(hl_module1) && inference_worker_removal.NIL == simplification_modules.simplification_module_p(hl_module2)) {
            return (SubLObject)inference_worker_removal.T;
        }
        if (inference_worker_removal.NIL != simplification_modules.simplification_module_p(hl_module2) && inference_worker_removal.NIL == simplification_modules.simplification_module_p(hl_module1)) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        return (SubLObject)inference_worker_removal.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 11527L)
    public static SubLObject determine_applicable_conjunctive_removal_modules(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause);
        SubLObject applicable_modules = (SubLObject)inference_worker_removal.NIL;
        final SubLObject allowed_modules_spec = (SubLObject)((inference_worker_removal.NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : inference_worker_removal.$kw36$ALL);
        final SubLObject set_var = inference_modules.removal_modules_conjunctive();
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        SubLObject _prev_bind_0;
        SubLObject cdolist_list_var;
        SubLObject new_subclause_specs;
        SubLObject subclause_spec;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, hl_module) && (inference_worker_removal.NIL == some_backchain_requiredP || inference_worker_removal.NIL != removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module) || (inference_worker_removal.NIL != inference_worker_restriction.$simplification_tactics_execute_early_and_pass_down_transformation_motivationP$.getDynamicValue(thread) && inference_worker_removal.NIL != simplification_modules.simplification_module_p(hl_module))) && inference_worker_removal.NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec)) {
                _prev_bind_0 = sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.currentBinding(thread);
                try {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.bind((SubLObject)inference_worker_removal.T, thread);
                    if (inference_worker_removal.NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                        new_subclause_specs = (cdolist_list_var = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause));
                        subclause_spec = (SubLObject)inference_worker_removal.NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (inference_worker_removal.NIL != cdolist_list_var) {
                            if (inference_worker_removal.NIL != clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                applicable_modules = (SubLObject)ConsesLow.cons(hl_module, applicable_modules);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return applicable_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 13071L)
    public static SubLObject motivated_multi_literal_subclause_specs(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subclause_specs = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(contextualized_dnf_clause)) {
            final SubLObject mt_var;
            final SubLObject common_mt = mt_var = inference_czer.contextualized_dnf_clause_common_mt(contextualized_dnf_clause);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject set_var = inference_modules.removal_modules_conjunctive();
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject hl_module;
                SubLObject cdolist_list_var;
                SubLObject new_subclause_specs;
                SubLObject subclause_spec;
                SubLObject item_var;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    hl_module = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, hl_module) && inference_worker_removal.NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_module_p(hl_module) && inference_worker_removal.NIL == simplification_modules.simplification_module_p(hl_module) && inference_worker_removal.NIL != inference_modules.hl_module_direction_relevantP(hl_module)) {
                        new_subclause_specs = (cdolist_list_var = hl_module_applicable_subclause_specs(hl_module, contextualized_dnf_clause));
                        subclause_spec = (SubLObject)inference_worker_removal.NIL;
                        subclause_spec = cdolist_list_var.first();
                        while (inference_worker_removal.NIL != cdolist_list_var) {
                            if (inference_worker_removal.NIL == clause_utilities.total_subclause_specP(subclause_spec, contextualized_dnf_clause)) {
                                item_var = subclause_spec;
                                if (inference_worker_removal.NIL == conses_high.member(item_var, subclause_specs, Symbols.symbol_function((SubLObject)inference_worker_removal.EQUAL), Symbols.symbol_function((SubLObject)inference_worker_removal.IDENTITY))) {
                                    subclause_specs = (SubLObject)ConsesLow.cons(item_var, subclause_specs);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subclause_spec = cdolist_list_var.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(subclause_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 14105L)
    public static SubLObject hl_module_applicable_subclause_specs(final SubLObject hl_module, final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject allowed_modules_spec = (SubLObject)((inference_worker_removal.NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_allowed_modules(inference_macros.current_controlling_inference()) : inference_worker_removal.$kw36$ALL);
        if (inference_worker_removal.NIL == inference_modules.hl_module_allowed_by_allowed_modules_specP(hl_module, allowed_modules_spec)) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject every_predicates = cdolist_list_var = inference_modules.hl_module_every_predicates(hl_module);
        SubLObject predicate = (SubLObject)inference_worker_removal.NIL;
        predicate = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            if (inference_worker_removal.NIL == inference_datastructures_problem_query.contextualized_clause_has_literal_with_predicateP(contextualized_dnf_clause, predicate)) {
                return (SubLObject)inference_worker_removal.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        SubLObject subclause_specs = (SubLObject)inference_worker_removal.NIL;
        final SubLObject applicability_pattern = inference_modules.hl_module_applicability_pattern(hl_module);
        if (inference_worker_removal.NIL != applicability_pattern) {
            subclause_specs = formula_pattern_match.pattern_transform_formula(applicability_pattern, contextualized_dnf_clause, (SubLObject)inference_worker_removal.UNPROVIDED);
        }
        else {
            final SubLObject applicability_method = inference_modules.hl_module_applicability_func(hl_module);
            if (applicability_method.isFunctionSpec()) {
                final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
                final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
                final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
                final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
                if (inference_worker_removal.NIL != last_metric_type && inference_worker_removal.NIL != last_metric) {
                    inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)inference_worker_removal.ZERO_INTEGER);
                }
                final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
                final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
                final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
                final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
                try {
                    hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)inference_worker_removal.$kw37$INFERENCE, thread);
                    hl_macros.$forward_inference_metric_last_metric$.bind(applicability_method, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)inference_worker_removal.NIL, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)inference_worker_removal.NIL, thread);
                    try {
                        subclause_specs = Functions.funcall(applicability_method, contextualized_dnf_clause);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_removal.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            inference_metrics.increment_forward_inference_metrics((SubLObject)inference_worker_removal.$kw37$INFERENCE, applicability_method, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                }
                finally {
                    hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
                    hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
                    hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
                    hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
                }
            }
        }
        SubLObject cdolist_list_var2 = subclause_specs;
        SubLObject subclause_spec = (SubLObject)inference_worker_removal.NIL;
        subclause_spec = cdolist_list_var2.first();
        while (inference_worker_removal.NIL != cdolist_list_var2) {
            if (inference_worker_removal.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_removal.NIL == clause_utilities.multi_literal_subclause_specP(subclause_spec)) {
                Errors.error((SubLObject)inference_worker_removal.$str38$_s_stated_its_applicability_to_th, hl_module, subclause_spec);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            subclause_spec = cdolist_list_var2.first();
        }
        return subclause_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 15681L)
    public static SubLObject new_conjunctive_removal_tactic(final SubLObject problem, final SubLObject hl_module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, (SubLObject)inference_worker_removal.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, (SubLObject)inference_worker_removal.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_removal.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
            final SubLObject idx_$8 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_dense_objects_empty_p(idx_$8, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
                final SubLObject backwardP_var = (SubLObject)inference_worker_removal.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_removal.NIL, v_iteration = (SubLObject)inference_worker_removal.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER)) {
                    id = ((inference_worker_removal.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_removal.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                        if (inference_worker_removal.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_removal.$kw39$SKIP;
                        }
                        if (inference_worker_removal.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$9 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_sparse_objects_empty_p(idx_$9)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$9);
                SubLObject id2 = (SubLObject)inference_worker_removal.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_removal.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_removal.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_removal.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 16049L)
    public static SubLObject compute_strategic_properties_of_conjunctive_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 16181L)
    public static SubLObject execute_conjunctive_removal_tactic(final SubLObject tactic) {
        if (inference_worker_removal.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            inference_datastructures_tactic.tactic_in_progress_next(tactic);
        }
        else {
            final SubLObject progress_iterator = maybe_make_conjunctive_removal_tactic_progress_iterator(tactic);
            if (inference_worker_removal.NIL != inference_datastructures_tactic.valid_tactic_p(tactic) && inference_worker_removal.NIL != inference_tactician_strategic_uninterestingness.tactic_completeP(tactic, (SubLObject)inference_worker_removal.$kw40$TACTICAL)) {
                inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
            }
            if (inference_worker_removal.NIL != progress_iterator) {
                if (progress_iterator.isList()) {
                    SubLObject cdolist_list_var = progress_iterator;
                    SubLObject execution_result = (SubLObject)inference_worker_removal.NIL;
                    execution_result = cdolist_list_var.first();
                    while (inference_worker_removal.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = execution_result;
                        SubLObject removal_bindings = (SubLObject)inference_worker_removal.NIL;
                        SubLObject justifications = (SubLObject)inference_worker_removal.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list41);
                        removal_bindings = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list41);
                        justifications = current.first();
                        current = current.rest();
                        if (inference_worker_removal.NIL == current) {
                            handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list41);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        execution_result = cdolist_list_var.first();
                    }
                }
                else {
                    inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                }
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 17230L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_iterator(final SubLObject tactic) {
        return (inference_worker_removal.NIL != inference_modules.hl_module_expand_iterative_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) ? maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic) : maybe_make_conjunctive_removal_tactic_progress_expand_iterator(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 17554L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator(final SubLObject tactic) {
        final SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject pattern = inference_modules.hl_module_expand_iterative_pattern(hl_module);
        final SubLObject iterator = formula_pattern_match.pattern_transform_formula(pattern, contextualized_dnf_clause, (SubLObject)inference_worker_removal.UNPROVIDED);
        if (inference_worker_removal.NIL != iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, iterator);
            return new_conjunctive_removal_tactic_progress_expand_iterative_iterator(tactic, iterator);
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 18196L)
    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterative_iterator(final SubLObject tactic, final SubLObject output_iterator) {
        return inference_datastructures_tactic.new_tactic_progress_iterator((SubLObject)inference_worker_removal.$kw42$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE, tactic, output_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 18405L)
    public static SubLObject handle_one_conjunctive_removal_tactic_expand_iterative_result(final SubLObject tactic, final SubLObject output_iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_worker_removal.NIL;
        thread.resetMultipleValues();
        final SubLObject raw_output = iteration.iteration_next(output_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != validP) {
            SubLObject current;
            final SubLObject datum = current = raw_output;
            SubLObject removal_bindings = (SubLObject)inference_worker_removal.NIL;
            SubLObject justifications = (SubLObject)inference_worker_removal.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list41);
            removal_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list41);
            justifications = current.first();
            current = current.rest();
            if (inference_worker_removal.NIL == current) {
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(inference_datastructures_problem.problem_query(inference_datastructures_tactic.tactic_problem(tactic)), (SubLObject)inference_worker_removal.$sym43$HL_VAR_, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED);
                SubLObject var = (SubLObject)inference_worker_removal.NIL;
                var = cdolist_list_var.first();
                while (inference_worker_removal.NIL != cdolist_list_var) {
                    if (inference_worker_removal.NIL == bindings.variable_lookup(var, removal_bindings)) {
                        removal_bindings = bindings.add_dont_care_variable_binding(var, removal_bindings);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    var = cdolist_list_var.first();
                }
                result = handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list41);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 19416L)
    public static SubLObject maybe_make_conjunctive_removal_tactic_progress_expand_iterator(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject contextualized_dnf_clause = inference_datastructures_tactic.tactic_problem_sole_clause(tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        final SubLObject expand_pattern = inference_modules.hl_module_expand_pattern(hl_module);
        final SubLObject expand_function = (SubLObject)((inference_worker_removal.NIL != expand_pattern) ? inference_worker_removal.NIL : inference_modules.hl_module_expand_func(hl_module));
        SubLObject expand_results = (SubLObject)inference_worker_removal.NIL;
        final SubLObject _prev_bind_0 = inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.bind((SubLObject)inference_worker_removal.NIL, thread);
            if (inference_worker_removal.NIL != expand_pattern) {
                formula_pattern_match.pattern_transform_formula(expand_pattern, contextualized_dnf_clause, (SubLObject)inference_worker_removal.UNPROVIDED);
            }
            else if (expand_function.isFunctionSpec()) {
                Functions.funcall(expand_function, contextualized_dnf_clause);
            }
            if (inference_worker_removal.NIL != inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread);
            }
        }
        finally {
            inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        final SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (inference_worker_removal.NIL != list_utilities.lengthGE(expand_results, inference_worker_removal.$removal_tactic_iteration_threshold$.getDynamicValue(thread), (SubLObject)inference_worker_removal.UNPROVIDED)) {
            expand_results = new_conjunctive_removal_tactic_progress_expand_iterator(tactic, expand_results);
        }
        return expand_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 20662L)
    public static SubLObject new_conjunctive_removal_tactic_progress_expand_iterator(final SubLObject tactic, final SubLObject results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator((SubLObject)inference_worker_removal.$kw44$CONJUNCTIVE_REMOVAL_EXPAND, tactic, results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 20835L)
    public static SubLObject conjunctive_removal_callback(SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_bindings, justifications), inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 21115L)
    public static SubLObject handle_one_conjunctive_removal_tactic_expand_result(final SubLObject tactic, final SubLObject expand_result) {
        SubLObject removal_bindings = (SubLObject)inference_worker_removal.NIL;
        SubLObject justifications = (SubLObject)inference_worker_removal.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(expand_result, expand_result, (SubLObject)inference_worker_removal.$list41);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, expand_result, (SubLObject)inference_worker_removal.$list41);
        justifications = current.first();
        current = current.rest();
        if (inference_worker_removal.NIL == current) {
            return handle_one_conjunctive_removal_tactic_result(tactic, removal_bindings, justifications);
        }
        cdestructuring_bind.cdestructuring_bind_error(expand_result, (SubLObject)inference_worker_removal.$list41);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 22022L)
    public static SubLObject conjunctive_removal_suppress_split_justificationP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_removal.NIL != inference_worker_removal.$conjunctive_removal_suppress_split_justificationP$.getDynamicValue(thread)) {
            final SubLObject inf = inference_macros.current_controlling_inference();
            final SubLObject metrics = inference_datastructures_inference.inference_metrics_template(inf);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL == Sequences.find((SubLObject)inference_worker_removal.$kw45$INFERENCE_PROOF_SPEC, metrics, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED));
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 22460L)
    public static SubLObject handle_one_conjunctive_removal_tactic_result(final SubLObject tactic, final SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(tactic, (SubLObject)inference_worker_removal.ONE_INTEGER);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject compute_answersP = inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem.problem_store(problem));
        if (inference_worker_removal.NIL == justifications) {
            return maybe_new_simplification_link(problem, tactic, removal_bindings);
        }
        if (inference_worker_removal.NIL != inference_worker_removal.$conjunctive_removal_optimize_when_no_justificationsP$.getDynamicValue(thread) && inference_worker_removal.NIL == compute_answersP) {
            return maybe_new_removal_link(problem, tactic, removal_bindings, (SubLObject)inference_worker_removal.NIL);
        }
        if (inference_worker_removal.NIL != conjunctive_removal_suppress_split_justificationP()) {
            SubLObject supports = (SubLObject)inference_worker_removal.NIL;
            if (justifications.isList()) {
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = (SubLObject)inference_worker_removal.NIL;
                justification = cdolist_list_var.first();
                while (inference_worker_removal.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$10 = justification;
                    SubLObject support = (SubLObject)inference_worker_removal.NIL;
                    support = cdolist_list_var_$10.first();
                    while (inference_worker_removal.NIL != cdolist_list_var_$10) {
                        supports = (SubLObject)ConsesLow.cons(support, supports);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        support = cdolist_list_var_$10.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
            }
            if (inference_worker_removal.NIL == removal_bindings) {
                return maybe_new_removal_link(problem, tactic, removal_bindings, supports);
            }
            return maybe_new_restriction_and_removal_link(problem, tactic, removal_bindings, supports);
        }
        else {
            if (inference_worker_removal.NIL == removal_bindings) {
                return maybe_new_split_and_removal_links(problem, tactic, justifications);
            }
            return maybe_new_restriction_split_and_removal_links(problem, tactic, removal_bindings, justifications);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 23849L)
    public static SubLObject maybe_new_simplification_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings) {
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, (SubLObject)inference_worker_removal.NIL, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 24132L)
    public static SubLObject maybe_new_restriction_split_and_removal_links(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject justifications) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        final SubLObject restricted_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem);
        final SubLObject reordered_justifications = reorder_conjunctive_removal_justifications(justifications, problem, removal_bindings, restricted_problem);
        maybe_new_split_and_removal_links(restricted_problem, tactic, reordered_justifications);
        final SubLObject restriction_link = inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, (SubLObject)inference_worker_removal.NIL, tactic);
        final SubLObject restricted_mapped_problem_from_link = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link);
        if (inference_worker_removal.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_removal.NIL == inference_datastructures_problem_link.mapped_problem_equal(restricted_mapped_problem_from_link, restricted_mapped_problem)) {
            Errors.error((SubLObject)inference_worker_removal.$str46$Problem_reuse_assumptions_were_vi, restricted_mapped_problem_from_link, restricted_mapped_problem);
        }
        return restriction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 25310L)
    public static SubLObject reorder_conjunctive_removal_justifications(final SubLObject justifications, final SubLObject unrestricted_problem, final SubLObject restriction_bindings, final SubLObject restricted_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unrestricted_clause = inference_datastructures_problem.problem_sole_clause(unrestricted_problem);
        final SubLObject actual_restricted_clause = inference_datastructures_problem.problem_sole_clause(restricted_problem);
        final SubLObject expected_restricted_clause = bindings.apply_bindings(restriction_bindings, unrestricted_clause);
        if (actual_restricted_clause.equal(expected_restricted_clause)) {
            return justifications;
        }
        SubLObject reordered_justifications = (SubLObject)inference_worker_removal.NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(actual_restricted_clause);
        SubLObject actual_asent = (SubLObject)inference_worker_removal.NIL;
        actual_asent = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            SubLObject expected_clause_index = (SubLObject)inference_worker_removal.ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = (SubLObject)inference_worker_removal.NIL, rest = (SubLObject)inference_worker_removal.NIL, rest = clauses.neg_lits(expected_restricted_clause); inference_worker_removal.NIL == foundP && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = ConsesLow.nth(expected_clause_index, justifications);
                    reordered_justifications = (SubLObject)ConsesLow.cons(justification, reordered_justifications);
                    foundP = (SubLObject)inference_worker_removal.T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, (SubLObject)inference_worker_removal.ONE_INTEGER);
            }
            for (rest = (SubLObject)inference_worker_removal.NIL, rest = clauses.pos_lits(expected_restricted_clause); inference_worker_removal.NIL == foundP && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = ConsesLow.nth(expected_clause_index, justifications);
                    reordered_justifications = (SubLObject)ConsesLow.cons(justification, reordered_justifications);
                    foundP = (SubLObject)inference_worker_removal.T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, (SubLObject)inference_worker_removal.ONE_INTEGER);
            }
            if (inference_worker_removal.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_removal.NIL == foundP) {
                Errors.error((SubLObject)inference_worker_removal.$str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(actual_restricted_clause);
        actual_asent = (SubLObject)inference_worker_removal.NIL;
        actual_asent = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            SubLObject expected_clause_index = (SubLObject)inference_worker_removal.ZERO_INTEGER;
            SubLObject foundP;
            SubLObject rest;
            SubLObject expected_asent;
            SubLObject justification;
            for (foundP = (SubLObject)inference_worker_removal.NIL, rest = (SubLObject)inference_worker_removal.NIL, rest = clauses.neg_lits(expected_restricted_clause); inference_worker_removal.NIL == foundP && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = ConsesLow.nth(expected_clause_index, justifications);
                    reordered_justifications = (SubLObject)ConsesLow.cons(justification, reordered_justifications);
                    foundP = (SubLObject)inference_worker_removal.T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, (SubLObject)inference_worker_removal.ONE_INTEGER);
            }
            for (rest = (SubLObject)inference_worker_removal.NIL, rest = clauses.pos_lits(expected_restricted_clause); inference_worker_removal.NIL == foundP && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                expected_asent = rest.first();
                if (expected_asent.equal(actual_asent)) {
                    justification = ConsesLow.nth(expected_clause_index, justifications);
                    reordered_justifications = (SubLObject)ConsesLow.cons(justification, reordered_justifications);
                    foundP = (SubLObject)inference_worker_removal.T;
                }
                expected_clause_index = Numbers.add(expected_clause_index, (SubLObject)inference_worker_removal.ONE_INTEGER);
            }
            if (inference_worker_removal.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker_removal.NIL == foundP) {
                Errors.error((SubLObject)inference_worker_removal.$str47$Couldn_t_find_the_right_conjuncti, actual_asent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            actual_asent = cdolist_list_var.first();
        }
        reordered_justifications = Sequences.nreverse(reordered_justifications);
        return reordered_justifications;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 26650L)
    public static SubLObject maybe_new_split_and_removal_links(final SubLObject problem, final SubLObject tactic, SubLObject justifications) {
        final SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(problem);
        if (inference_worker_removal.NIL != clauses.atomic_clause_p(dnf_clause)) {
            maybe_new_removal_link(problem, tactic, (SubLObject)inference_worker_removal.NIL, justifications.first());
        }
        else {
            final SubLObject split_link = inference_worker_split.maybe_new_split_link(problem, dnf_clause);
            inference_worker.problem_link_open_and_repropagate_all(split_link);
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = (SubLObject)inference_worker_removal.NIL;
            contextualized_asent = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                final SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, (SubLObject)inference_worker_removal.$kw48$NEG, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = (SubLObject)inference_worker_removal.NIL;
            contextualized_asent = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                final SubLObject literal_supports = justifications.first();
                justifications = justifications.rest();
                maybe_new_removal_link_for_split_link(split_link, tactic, contextualized_asent, (SubLObject)inference_worker_removal.$kw49$POS, literal_supports);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 27664L)
    public static SubLObject maybe_new_removal_link_for_split_link(final SubLObject split_link, final SubLObject tactic, final SubLObject contextualized_asent, final SubLObject sense, final SubLObject literal_supports) {
        final SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        final SubLObject literal_problem = inference_datastructures_problem_link.find_closed_supporting_problem_by_query(split_link, query);
        return maybe_new_removal_link(literal_problem, tactic, (SubLObject)inference_worker_removal.NIL, literal_supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 28040L)
    public static SubLObject executed_conjunctive_removal_problems(final SubLObject store, SubLObject module_subtype) {
        if (module_subtype == inference_worker_removal.UNPROVIDED) {
            module_subtype = (SubLObject)inference_worker_removal.NIL;
        }
        SubLObject problems = (SubLObject)inference_worker_removal.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker_removal.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
            final SubLObject idx_$11 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_dense_objects_empty_p(idx_$11, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$11);
                final SubLObject backwardP_var = (SubLObject)inference_worker_removal.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject witness;
                SubLObject rest;
                SubLObject tactic;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_removal.NIL, v_iteration = (SubLObject)inference_worker_removal.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER)) {
                    id = ((inference_worker_removal.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker_removal.NIL == id_index.id_index_tombstone_p(problem) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                        if (inference_worker_removal.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker_removal.$kw39$SKIP;
                        }
                        for (witness = (SubLObject)inference_worker_removal.NIL, rest = (SubLObject)inference_worker_removal.NIL, rest = inference_datastructures_problem.problem_tactics(problem); inference_worker_removal.NIL == witness && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                            tactic = rest.first();
                            if (inference_worker_removal.NIL != executed_conjunctive_removal_tactic_p(tactic) && (inference_worker_removal.NIL == module_subtype || inference_worker_removal.NIL != list_utilities.member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic))))) {
                                witness = tactic;
                            }
                        }
                        if (inference_worker_removal.NIL != witness) {
                            problems = (SubLObject)ConsesLow.cons(problem, problems);
                        }
                    }
                }
            }
            final SubLObject idx_$12 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_sparse_objects_empty_p(idx_$12) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$12);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$12);
                final SubLObject end_id = id_index.id_index_next_id(idx_$12);
                final SubLObject v_default = (SubLObject)((inference_worker_removal.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) ? inference_worker_removal.NIL : inference_worker_removal.$kw39$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP) || inference_worker_removal.NIL == id_index.id_index_tombstone_p(problem2)) {
                        SubLObject witness2;
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (witness2 = (SubLObject)inference_worker_removal.NIL, rest2 = (SubLObject)inference_worker_removal.NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); inference_worker_removal.NIL == witness2 && inference_worker_removal.NIL != rest2; rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if (inference_worker_removal.NIL != executed_conjunctive_removal_tactic_p(tactic2) && (inference_worker_removal.NIL == module_subtype || inference_worker_removal.NIL != list_utilities.member_eqP(module_subtype, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2))))) {
                                witness2 = tactic2;
                            }
                        }
                        if (inference_worker_removal.NIL != witness2) {
                            problems = (SubLObject)ConsesLow.cons(problem2, problems);
                        }
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_worker_removal.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 28660L)
    public static SubLObject problem_store_has_some_executed_sksi_conjunctive_removal_problemP(final SubLObject store) {
        SubLObject witness = (SubLObject)inference_worker_removal.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker_removal.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
            final SubLObject idx_$13 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_dense_objects_empty_p(idx_$13, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$13);
                final SubLObject backwardP_var = (SubLObject)inference_worker_removal.NIL;
                final SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((inference_worker_removal.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)inference_worker_removal.ONE_INTEGER), (SubLObject)inference_worker_removal.MINUS_ONE_INTEGER, (SubLObject)inference_worker_removal.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)inference_worker_removal.ZERO_INTEGER, length, (SubLObject)inference_worker_removal.ONE_INTEGER));
                SubLObject start = (SubLObject)inference_worker_removal.NIL;
                SubLObject end = (SubLObject)inference_worker_removal.NIL;
                SubLObject delta = (SubLObject)inference_worker_removal.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list50);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list50);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list50);
                delta = current.first();
                current = current.rest();
                if (inference_worker_removal.NIL == current) {
                    if (inference_worker_removal.NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject problem;
                        SubLObject rest;
                        SubLObject tactic;
                        for (end_var = end, id = (SubLObject)inference_worker_removal.NIL, id = start; inference_worker_removal.NIL == witness && inference_worker_removal.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            problem = Vectors.aref(vector_var, id);
                            if (inference_worker_removal.NIL == id_index.id_index_tombstone_p(problem) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                                if (inference_worker_removal.NIL != id_index.id_index_tombstone_p(problem)) {
                                    problem = (SubLObject)inference_worker_removal.$kw39$SKIP;
                                }
                                for (rest = (SubLObject)inference_worker_removal.NIL, rest = inference_datastructures_problem.problem_tactics(problem); inference_worker_removal.NIL == witness && inference_worker_removal.NIL != rest; rest = rest.rest()) {
                                    tactic = rest.first();
                                    if (inference_worker_removal.NIL != executed_conjunctive_removal_tactic_p(tactic) && inference_worker_removal.NIL != list_utilities.member_eqP((SubLObject)inference_worker_removal.$kw51$SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic)))) {
                                        witness = tactic;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list50);
                }
            }
            final SubLObject idx_$14 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_sparse_objects_empty_p(idx_$14) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$14);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$14);
                final SubLObject end_id = id_index.id_index_next_id(idx_$14);
                final SubLObject v_default = (SubLObject)((inference_worker_removal.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) ? inference_worker_removal.NIL : inference_worker_removal.$kw39$SKIP);
                while (id2.numL(end_id) && inference_worker_removal.NIL == witness) {
                    final SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP) || inference_worker_removal.NIL == id_index.id_index_tombstone_p(problem2)) {
                        SubLObject rest2;
                        SubLObject tactic2;
                        for (rest2 = (SubLObject)inference_worker_removal.NIL, rest2 = inference_datastructures_problem.problem_tactics(problem2); inference_worker_removal.NIL == witness && inference_worker_removal.NIL != rest2; rest2 = rest2.rest()) {
                            tactic2 = rest2.first();
                            if (inference_worker_removal.NIL != executed_conjunctive_removal_tactic_p(tactic2) && inference_worker_removal.NIL != list_utilities.member_eqP((SubLObject)inference_worker_removal.$kw51$SKSI, inference_modules.hl_module_subtypes(inference_datastructures_tactic.tactic_hl_module(tactic2)))) {
                                witness = tactic2;
                            }
                        }
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_worker_removal.ONE_INTEGER);
                }
            }
        }
        return witness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29143L)
    public static SubLObject executed_conjunctive_removal_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != conjunctive_removal_tactic_p(tactic) && (inference_worker_removal.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic) || inference_worker_removal.NIL != inference_datastructures_tactic.tactic_executedP(tactic)) && inference_worker_removal.NIL == inference_worker_restriction.simplification_tactic_p(tactic) && inference_worker_removal.NIL == removal_modules_conjunctive_pruning.conjunctive_pruning_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29474L)
    public static SubLObject with_problem_store_removal_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject store = (SubLObject)inference_worker_removal.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list52);
        store = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject store_var = (SubLObject)inference_worker_removal.$sym53$STORE_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_worker_removal.$sym54$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(store_var, store), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym55$_NEGATION_BY_FAILURE_, (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_, store_var))), ConsesLow.append(body, (SubLObject)inference_worker_removal.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29849L)
    public static SubLObject meta_removal_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_removal.$kw57$META_REMOVAL == inference_datastructures_tactic.tactic_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 29976L)
    public static SubLObject compute_strategic_properties_of_meta_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return compute_strategic_properties_of_removal_tactic(tactic, strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30180L)
    public static SubLObject removal_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_removal.$kw25$REMOVAL == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30339L)
    public static SubLObject removal_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_tactic.tactic_p(v_object) && inference_worker_removal.$kw25$REMOVAL == inference_datastructures_tactic.tactic_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30456L)
    public static SubLObject removal_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_removal.NIL != removal_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30573L)
    public static SubLObject removal_module_exclusive_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 30898L)
    public static SubLObject removal_module_required_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (inference_worker_removal.NIL != last_metric_type && inference_worker_removal.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)inference_worker_removal.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)inference_worker_removal.$kw37$INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(func, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)inference_worker_removal.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)inference_worker_removal.NIL, thread);
            try {
                if (func.eql((SubLObject)inference_worker_removal.$sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED)) {
                    return meta_removal_modules.meta_removal_completely_decidable_pos_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED)) {
                    return meta_removal_modules.meta_removal_completely_enumerable_pos_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym61$REMOVAL_ABDUCTION_POS_REQUIRED)) {
                    return removal_modules_abduction.removal_abduction_pos_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED)) {
                    return removal_modules_function_corresponding_predicate.removal_evaluatable_fcp_unify_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym63$REMOVAL_FCP_CHECK_REQUIRED)) {
                    return removal_modules_function_corresponding_predicate.removal_fcp_check_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym64$REMOVAL_ISA_DEFN_POS_REQUIRED)) {
                    return removal_modules_isa.removal_isa_defn_pos_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym65$REMOVAL_TVA_CHECK_REQUIRED)) {
                    return removal_modules_tva_lookup.removal_tva_check_required(asent, sense);
                }
                if (func.eql((SubLObject)inference_worker_removal.$sym66$REMOVAL_TVA_UNIFY_REQUIRED)) {
                    return removal_modules_tva_lookup.removal_tva_unify_required(asent, sense);
                }
                return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_removal.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)inference_worker_removal.$kw37$INFERENCE, func, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 31996L)
    public static SubLObject removal_module_expand_func_funcall(final SubLObject func, final SubLObject asent, final SubLObject sense) {
        if (func.eql((SubLObject)inference_worker_removal.$sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND)) {
            return removal_modules_asserted_formula.removal_asserted_term_sentences_arg_index_unify_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym68$REMOVAL_EVAL_EXPAND)) {
            return removal_modules_evaluation.removal_eval_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym69$REMOVAL_EVALUATE_BIND_EXPAND)) {
            return removal_modules_evaluate.removal_evaluate_bind_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND)) {
            return removal_modules_isa.removal_isa_collection_check_neg_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND)) {
            return removal_modules_isa.removal_isa_collection_check_pos_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND)) {
            return removal_modules_natfunction.removal_nat_argument_lookup_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym73$REMOVAL_NAT_FORMULA_EXPAND)) {
            return removal_modules_termofunit.removal_nat_formula_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND)) {
            return removal_modules_natfunction.removal_nat_function_lookup_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym75$REMOVAL_NAT_LOOKUP_EXPAND)) {
            return removal_modules_termofunit.removal_nat_lookup_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym76$REMOVAL_REFLEXIVE_ON_EXPAND)) {
            return removal_modules_reflexive_on.removal_reflexive_on_expand(asent, sense);
        }
        if (func.eql((SubLObject)inference_worker_removal.$sym77$REMOVAL_TVA_CHECK_EXPAND)) {
            return removal_modules_tva_lookup.removal_tva_check_expand(asent, sense);
        }
        return eval_in_api.possibly_cyc_api_funcall_2(func, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33244L)
    public static SubLObject determine_new_literal_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_removal.NIL == inference_datastructures_problem_store.problem_store_removal_allowedP(inference_datastructures_problem.problem_store(problem))) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject tactics = (SubLObject)inference_worker_removal.NIL;
        final SubLObject store_var = store;
        final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
        try {
            control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
            determine_new_literal_simple_removal_tactics(problem, asent, sense);
            determine_new_literal_meta_removal_tactics(problem, asent, sense);
        }
        finally {
            control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
        }
        return tactics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 33870L)
    public static SubLObject determine_new_literal_meta_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLObject hl_modules = literal_meta_removal_candidate_hl_modules(asent, sense);
        return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 34233L)
    public static SubLObject determine_new_literal_simple_removal_tactics(final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_removal.NIL != control_vars.$external_inference_enabled$.getDynamicValue(thread) && inference_worker_removal.NIL != inference_modules.some_external_removal_modulesP()) {
            final SubLObject external_tactics = determine_new_removal_tactics_from_hl_modules(inference_modules.removal_modules_external(), problem, asent, sense);
            if (inference_worker_removal.NIL != external_tactics) {
                return external_tactics;
            }
        }
        final SubLObject hl_modules = literal_simple_removal_candidate_hl_modules(asent, sense);
        return determine_new_removal_tactics_from_hl_modules(hl_modules, problem, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 35152L)
    public static SubLObject literal_removal_options(final SubLObject asent, final SubLObject sense, SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == inference_worker_removal.UNPROVIDED) {
            allowed_modules_spec = (SubLObject)inference_worker_removal.$kw36$ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker_removal.NIL != control_vars.$external_inference_enabled$.getDynamicValue(thread) && inference_worker_removal.NIL != inference_modules.some_external_removal_modulesP()) {
            final SubLObject external_tactic_specs = determine_new_removal_tactic_specs_from_hl_modules(inference_modules.removal_modules_external(), asent, sense);
            if (inference_worker_removal.NIL != external_tactic_specs) {
                return external_tactic_specs;
            }
        }
        final SubLObject hl_modules = literal_removal_options_hl_modules(asent, sense, allowed_modules_spec);
        return determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36053L)
    public static SubLObject literal_removal_options_hl_modules(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLObject candidate_hl_modules = literal_removal_options_candidate_hl_modules(asent, sense, allowed_modules_spec);
        return filter_modules_wrt_allowed_modules_spec(candidate_hl_modules, allowed_modules_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36356L)
    public static SubLObject filter_modules_wrt_allowed_modules_spec(final SubLObject candidate_hl_modules, final SubLObject allowed_modules_spec) {
        SubLObject hl_modules = (SubLObject)inference_worker_removal.NIL;
        if (allowed_modules_spec == inference_worker_removal.$kw36$ALL) {
            hl_modules = candidate_hl_modules;
        }
        else {
            SubLObject cdolist_list_var = candidate_hl_modules;
            SubLObject module = (SubLObject)inference_worker_removal.NIL;
            module = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                if (inference_worker_removal.NIL != inference_modules.hl_module_allowed_by_allowed_modules_specP(module, allowed_modules_spec) || inference_worker_removal.NIL != inference_modules.hl_module_exclusive_func(module)) {
                    hl_modules = (SubLObject)ConsesLow.cons(module, hl_modules);
                }
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            }
            hl_modules = Sequences.nreverse(hl_modules);
        }
        return hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 36914L)
    public static SubLObject literal_removal_options_candidate_hl_modules(final SubLObject asent, final SubLObject sense, final SubLObject allowed_modules_spec) {
        if (allowed_modules_spec == inference_worker_removal.$kw36$ALL) {
            return literal_simple_removal_candidate_hl_modules(asent, sense);
        }
        if (inference_worker_removal.NIL != inference_modules.simple_allowed_modules_spec_p(allowed_modules_spec)) {
            return inference_modules.get_modules_from_simple_allowed_modules_spec(allowed_modules_spec);
        }
        return literal_simple_removal_candidate_hl_modules(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 37337L)
    public static SubLObject hl_module_applicable_to_asentP(final SubLObject hl_module, final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != inference_modules.hl_module_predicate_relevant_p(hl_module, cycl_utilities.atomic_sentence_predicate(asent)) && inference_worker_removal.NIL != inference_modules.hl_module_arity_relevant_p(hl_module, asent) && inference_worker_removal.NIL != inference_modules.hl_module_required_pattern_matched_p(hl_module, asent) && inference_worker_removal.NIL != inference_modules.hl_module_required_mt_relevantP(hl_module) && inference_worker_removal.NIL != inference_modules.hl_module_direction_relevantP(hl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 37802L)
    public static SubLObject determine_new_removal_tactics_from_hl_modules(final SubLObject hl_modules, final SubLObject problem, final SubLObject asent, final SubLObject sense) {
        SubLObject cdolist_list_var;
        final SubLObject tactic_specs = cdolist_list_var = determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
        SubLObject tactic_spec = (SubLObject)inference_worker_removal.NIL;
        tactic_spec = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = (SubLObject)inference_worker_removal.NIL;
            SubLObject productivity = (SubLObject)inference_worker_removal.NIL;
            SubLObject completeness = (SubLObject)inference_worker_removal.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
            productivity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list34);
            completeness = current.first();
            current = current.rest();
            if (inference_worker_removal.NIL == current) {
                new_removal_tactic(problem, hl_module, productivity, completeness);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list34);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 38396L)
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules(final SubLObject hl_modules, final SubLObject asent, final SubLObject sense) {
        return hl_module_guts((SubLObject)inference_worker_removal.$kw78$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES, hl_modules, asent, sense, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 38759L)
    public static SubLObject determine_new_removal_tactic_specs_from_hl_modules_guts(final SubLObject candidate_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLObject applicable_hl_modules = determine_applicable_hl_modules_for_asent(candidate_hl_modules, asent, sense);
        final SubLObject tactic_specs = compute_tactic_specs_for_asent(applicable_hl_modules, asent, sense);
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 39439L)
    public static SubLObject determine_applicable_hl_modules_for_asent(final SubLObject candidate_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supplanted_hl_modules = (SubLObject)inference_worker_removal.NIL;
        SubLObject applicable_hl_modules = (SubLObject)inference_worker_removal.NIL;
        SubLObject totally_exclusive_foundP = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = (SubLObject)inference_worker_removal.NIL;
            hl_module = csome_list_var.first();
            while (inference_worker_removal.NIL == totally_exclusive_foundP && inference_worker_removal.NIL != csome_list_var) {
                if (inference_worker_removal.NIL == inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$16 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$17 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$18 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$16;
                    applicable_hl_modules = applicable_hl_modules_$17;
                    supplanted_hl_modules = supplanted_hl_modules_$18;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            }
        }
        if (inference_worker_removal.NIL == totally_exclusive_foundP) {
            SubLObject csome_list_var = candidate_hl_modules;
            SubLObject hl_module = (SubLObject)inference_worker_removal.NIL;
            hl_module = csome_list_var.first();
            while (inference_worker_removal.NIL == totally_exclusive_foundP && inference_worker_removal.NIL != csome_list_var) {
                if (inference_worker_removal.NIL != inference_modules.hl_module_exclusive_func(hl_module)) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$17 = update_applicable_hl_modules(hl_module, asent, sense, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$18 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$19 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$17;
                    applicable_hl_modules = applicable_hl_modules_$18;
                    supplanted_hl_modules = supplanted_hl_modules_$19;
                }
                csome_list_var = csome_list_var.rest();
                hl_module = csome_list_var.first();
            }
        }
        return applicable_hl_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 40649L)
    public static SubLObject update_applicable_hl_modules(final SubLObject hl_module, final SubLObject asent, final SubLObject sense, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject totally_exclusive_foundP = (SubLObject)inference_worker_removal.NIL;
        if ((inference_worker_removal.NIL == supplanted_hl_modules || inference_worker_removal.NIL == list_utilities.member_eqP(hl_module, supplanted_hl_modules)) && inference_worker_removal.NIL != hl_module_applicable_to_asentP(hl_module, asent)) {
            final SubLObject exclusive_func = inference_modules.hl_module_exclusive_func(hl_module);
            if (inference_worker_removal.NIL == exclusive_func || (inference_worker_removal.NIL != eval_in_api.possibly_cyc_api_function_spec_p(exclusive_func) && inference_worker_removal.NIL != removal_module_exclusive_func_funcall(exclusive_func, asent, sense))) {
                if (inference_worker_removal.NIL != exclusive_func) {
                    thread.resetMultipleValues();
                    final SubLObject totally_exclusive_foundP_$22 = update_supplanted_hl_modules(hl_module, applicable_hl_modules, supplanted_hl_modules);
                    final SubLObject applicable_hl_modules_$23 = thread.secondMultipleValue();
                    final SubLObject supplanted_hl_modules_$24 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    totally_exclusive_foundP = totally_exclusive_foundP_$22;
                    applicable_hl_modules = applicable_hl_modules_$23;
                    supplanted_hl_modules = supplanted_hl_modules_$24;
                }
                final SubLObject required_func = inference_modules.hl_module_required_func(hl_module);
                if (inference_worker_removal.NIL == required_func || (inference_worker_removal.NIL != eval_in_api.possibly_cyc_api_function_spec_p(required_func) && inference_worker_removal.NIL != removal_module_required_func_funcall(required_func, asent, sense))) {
                    applicable_hl_modules = (SubLObject)ConsesLow.cons(hl_module, applicable_hl_modules);
                }
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 42308L)
    public static SubLObject update_supplanted_hl_modules(final SubLObject hl_module, SubLObject applicable_hl_modules, SubLObject supplanted_hl_modules) {
        final SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = (SubLObject)inference_worker_removal.NIL;
        final SubLObject pcase_var = supplants_info;
        if (pcase_var.eql((SubLObject)inference_worker_removal.$kw36$ALL)) {
            applicable_hl_modules = (SubLObject)inference_worker_removal.NIL;
            totally_exclusive_foundP = (SubLObject)inference_worker_removal.T;
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject newly_supplanted_hl_module_patterns = cdolist_list_var = supplants_info;
            SubLObject supplanted_hl_module_pattern = (SubLObject)inference_worker_removal.NIL;
            supplanted_hl_module_pattern = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                if (supplanted_hl_module_pattern.isCons()) {
                    SubLObject patterns = (SubLObject)ConsesLow.list(supplanted_hl_module_pattern);
                    SubLObject negateP = (SubLObject)inference_worker_removal.NIL;
                    SubLObject pattern = (SubLObject)inference_worker_removal.NIL;
                    while (inference_worker_removal.NIL != patterns) {
                        pattern = patterns.first();
                        patterns = patterns.rest();
                        final SubLObject directive = pattern.first();
                        final SubLObject rest = pattern.rest();
                        final SubLObject pcase_var_$25 = directive;
                        if (pcase_var_$25.eql((SubLObject)inference_worker_removal.$kw79$NOT)) {
                            negateP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL == negateP);
                            patterns = (SubLObject)ConsesLow.cons(rest.first(), patterns);
                        }
                        else {
                            if (!pcase_var_$25.eql((SubLObject)inference_worker_removal.$kw80$MODULE_SUBTYPE)) {
                                continue;
                            }
                            final SubLObject subtype = rest.first();
                            SubLObject cdolist_list_var_$26;
                            final SubLObject newly_supplanted_hl_modules = cdolist_list_var_$26 = applicable_hl_modules;
                            SubLObject supplanted_hl_module = (SubLObject)inference_worker_removal.NIL;
                            supplanted_hl_module = cdolist_list_var_$26.first();
                            while (inference_worker_removal.NIL != cdolist_list_var_$26) {
                                if ((inference_worker_removal.NIL == negateP && inference_worker_removal.NIL != list_utilities.member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module))) || (inference_worker_removal.NIL != negateP && inference_worker_removal.NIL == list_utilities.member_eqP(subtype, inference_modules.hl_module_subtypes(supplanted_hl_module)))) {
                                    applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module, applicable_hl_modules, Symbols.symbol_function((SubLObject)inference_worker_removal.EQ));
                                }
                                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                supplanted_hl_module = cdolist_list_var_$26.first();
                            }
                        }
                    }
                }
                else {
                    final SubLObject item_var;
                    final SubLObject supplanted_hl_module2 = item_var = inference_modules.find_hl_module_by_name(supplanted_hl_module_pattern);
                    if (inference_worker_removal.NIL == conses_high.member(item_var, supplanted_hl_modules, Symbols.symbol_function((SubLObject)inference_worker_removal.EQ), Symbols.symbol_function((SubLObject)inference_worker_removal.IDENTITY))) {
                        supplanted_hl_modules = (SubLObject)ConsesLow.cons(item_var, supplanted_hl_modules);
                    }
                    if (inference_worker_removal.NIL != list_utilities.member_eqP(supplanted_hl_module2, applicable_hl_modules)) {
                        applicable_hl_modules = list_utilities.delete_first(supplanted_hl_module2, applicable_hl_modules, Symbols.symbol_function((SubLObject)inference_worker_removal.EQ));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_hl_module_pattern = cdolist_list_var.first();
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, applicable_hl_modules, supplanted_hl_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 44574L)
    public static SubLObject update_supplanted_modules_wrt_tactic_specs(final SubLObject hl_module, SubLObject existing_tactic_specs, SubLObject supplanted_modules) {
        final SubLObject supplants_info = inference_modules.hl_module_supplants_info(hl_module);
        SubLObject totally_exclusive_foundP = (SubLObject)inference_worker_removal.NIL;
        final SubLObject pcase_var = supplants_info;
        if (pcase_var.eql((SubLObject)inference_worker_removal.$kw36$ALL)) {
            existing_tactic_specs = (SubLObject)inference_worker_removal.NIL;
            totally_exclusive_foundP = (SubLObject)inference_worker_removal.T;
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject newly_supplanted_module_names = cdolist_list_var = supplants_info;
            SubLObject supplanted_module_name = (SubLObject)inference_worker_removal.NIL;
            supplanted_module_name = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                final SubLObject supplanted_module = inference_modules.find_hl_module_by_name(supplanted_module_name);
                supplanted_modules = (SubLObject)ConsesLow.cons(supplanted_module, supplanted_modules);
                SubLObject supplanted_tactic_spec = Sequences.find(supplanted_module, existing_tactic_specs, Symbols.symbol_function((SubLObject)inference_worker_removal.EQ), Symbols.symbol_function((SubLObject)inference_worker_removal.$sym81$FIRST), (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED);
                if (inference_worker_removal.NIL != supplanted_tactic_spec) {
                    existing_tactic_specs = list_utilities.delete_first(supplanted_tactic_spec, existing_tactic_specs, Symbols.symbol_function((SubLObject)inference_worker_removal.EQUAL));
                    supplanted_tactic_spec = (SubLObject)inference_worker_removal.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                supplanted_module_name = cdolist_list_var.first();
            }
        }
        return subl_promotions.values3(totally_exclusive_foundP, existing_tactic_specs, supplanted_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 45919L)
    public static SubLObject compute_tactic_specs_for_asent(final SubLObject applicable_hl_modules, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tactic_specs = (SubLObject)inference_worker_removal.NIL;
        SubLObject cdolist_list_var = applicable_hl_modules;
        SubLObject hl_module = (SubLObject)inference_worker_removal.NIL;
        hl_module = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            final SubLObject cost = inference_modules.hl_module_cost(hl_module, asent, sense);
            if (inference_worker_removal.NIL != cost) {
                if (inference_worker_removal.NIL != control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread) && inference_worker_removal.NIL != variables.fully_bound_p(asent) && cost.numG(control_vars.$maximum_hl_module_check_cost$.getDynamicValue(thread))) {
                    Errors.error((SubLObject)inference_worker_removal.$str82$For_sentence_____S__Maximum_HL_Mo, asent, hl_module, cost);
                }
                final SubLObject productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(cost);
                final SubLObject completeness = inference_modules.hl_module_completeness(hl_module, asent, (SubLObject)inference_worker_removal.UNPROVIDED);
                final SubLObject tactic_spec = (SubLObject)ConsesLow.list(hl_module, productivity, completeness);
                tactic_specs = (SubLObject)ConsesLow.cons(tactic_spec, tactic_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        }
        return tactic_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 46647L)
    public static SubLObject literal_simple_removal_candidate_hl_modules(final SubLObject asent, final SubLObject sense) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_worker_removal.NIL != forts.fort_p(predicate)) {
            return literal_removal_candidate_hl_modules_for_predicate_with_sense(predicate, sense);
        }
        return inference_modules.generic_removal_modules_for_sense(sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 46949L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense(final SubLObject predicate, final SubLObject sense) {
        final SubLObject inference = inference_macros.current_controlling_inference();
        if (inference_worker_removal.NIL != inference && inference_worker_removal.NIL != inference_datastructures_inference.inference_problem_store_privateP(inference)) {
            final SubLObject allowed_modules_spec = inference_datastructures_inference.inference_allowed_modules(inference);
            return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, allowed_modules_spec);
        }
        return literal_removal_candidate_hl_modules_for_predicate_with_sense_int(predicate, sense, (SubLObject)inference_worker_removal.$kw36$ALL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47461L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(final SubLObject predicate, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLObject predicate_specific_removal_modules = inference_modules.removal_modules_specific_for_sense(predicate, sense);
        final SubLObject universal_removal_modules = inference_modules.removal_modules_universal_for_predicate_and_sense(predicate, sense);
        SubLObject v_modules = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL != inference_modules.solely_specific_removal_module_predicateP(predicate)) {
            v_modules = ConsesLow.nconc(predicate_specific_removal_modules, universal_removal_modules);
        }
        else {
            v_modules = ConsesLow.nconc(predicate_specific_removal_modules, inference_modules.generic_removal_modules_for_sense(sense), universal_removal_modules);
        }
        v_modules = filter_modules_wrt_allowed_modules_spec(v_modules, allowed_modules_spec);
        return v_modules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 47461L)
    public static SubLObject literal_removal_candidate_hl_modules_for_predicate_with_sense_int(final SubLObject predicate, final SubLObject sense, final SubLObject allowed_modules_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL == v_memoization_state) {
            return literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker_removal.$sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, (SubLObject)inference_worker_removal.UNPROVIDED);
        if (inference_worker_removal.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker_removal.$sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, (SubLObject)inference_worker_removal.THREE_INTEGER, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.EQL, (SubLObject)inference_worker_removal.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker_removal.$sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, sense, allowed_modules_spec);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_worker_removal.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_worker_removal.NIL;
            collision = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sense.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inference_worker_removal.NIL != cached_args && inference_worker_removal.NIL == cached_args.rest() && allowed_modules_spec.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal(predicate, sense, allowed_modules_spec)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, sense, allowed_modules_spec));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48404L)
    public static SubLObject literal_meta_removal_candidate_hl_modules(final SubLObject asent, final SubLObject sense) {
        if (sense == inference_worker_removal.$kw48$NEG) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (inference_worker_removal.NIL != forts.fort_p(predicate)) {
            return literal_meta_removal_candidate_hl_modules_for_predicate(predicate);
        }
        return inference_modules.meta_removal_module_list();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48770L)
    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate_internal(final SubLObject predicate) {
        SubLObject v_meta_removal_modules = (SubLObject)inference_worker_removal.NIL;
        SubLObject cdolist_list_var = inference_modules.meta_removal_modules();
        SubLObject meta_removal_module = (SubLObject)inference_worker_removal.NIL;
        meta_removal_module = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            if (inference_worker_removal.NIL != inference_modules.predicate_uses_meta_removal_moduleP(predicate, meta_removal_module)) {
                v_meta_removal_modules = (SubLObject)ConsesLow.cons(meta_removal_module, v_meta_removal_modules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_removal_module = cdolist_list_var.first();
        }
        return Sequences.nreverse(v_meta_removal_modules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 48770L)
    public static SubLObject literal_meta_removal_candidate_hl_modules_for_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL == v_memoization_state) {
            return literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker_removal.$sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, (SubLObject)inference_worker_removal.UNPROVIDED);
        if (inference_worker_removal.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker_removal.$sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, (SubLObject)inference_worker_removal.ONE_INTEGER, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.EQUAL, (SubLObject)inference_worker_removal.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker_removal.$sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(literal_meta_removal_candidate_hl_modules_for_predicate_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)inference_worker_removal.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49155L)
    public static SubLObject literal_level_removal_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != removal_tactic_p(tactic) && inference_worker_removal.NIL != inference_worker.literal_level_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49291L)
    public static SubLObject literal_level_meta_removal_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL != meta_removal_tactic_p(tactic) && inference_worker_removal.NIL != inference_worker.literal_level_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49437L)
    public static SubLObject new_removal_tactic(final SubLObject problem, final SubLObject hl_module, final SubLObject productivity, final SubLObject completeness) {
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, hl_module, (SubLObject)inference_worker_removal.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_productivity(tactic, productivity, (SubLObject)inference_worker_removal.UNPROVIDED);
        inference_datastructures_tactic.set_tactic_completeness(tactic, completeness);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker_removal.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
            final SubLObject idx_$27 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_dense_objects_empty_p(idx_$27, (SubLObject)inference_worker_removal.$kw39$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                final SubLObject backwardP_var = (SubLObject)inference_worker_removal.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject inference_var;
                SubLObject set_var;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker_removal.NIL, v_iteration = (SubLObject)inference_worker_removal.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER)) {
                    id = ((inference_worker_removal.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker_removal.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker_removal.NIL == id_index.id_index_tombstone_p(inference) || inference_worker_removal.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker_removal.$kw39$SKIP)) {
                        if (inference_worker_removal.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker_removal.$kw39$SKIP;
                        }
                        if (inference_worker_removal.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_removal.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$28 = idx;
            if (inference_worker_removal.NIL == id_index.id_index_sparse_objects_empty_p(idx_$28)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$28);
                SubLObject id2 = (SubLObject)inference_worker_removal.NIL;
                SubLObject inference2 = (SubLObject)inference_worker_removal.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker_removal.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker_removal.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker_removal.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker_removal.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 49858L)
    public static SubLObject compute_strategic_properties_of_removal_tactic(final SubLObject tactic, final SubLObject strategy) {
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50125L)
    public static SubLObject with_removal_tactic_execution_assumptions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tactic = (SubLObject)inference_worker_removal.NIL;
        SubLObject mt = (SubLObject)inference_worker_removal.NIL;
        SubLObject sense = (SubLObject)inference_worker_removal.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list85);
        tactic = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list85);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list85);
        sense = current.first();
        current = current.rest();
        if (inference_worker_removal.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tactic_var = (SubLObject)inference_worker_removal.$sym86$TACTIC_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym54$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tactic_var, tactic)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym87$WITH_INFERENCE_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym54$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym88$_INFERENCE_EXPAND_HL_MODULE_, (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym89$TACTIC_HL_MODULE, tactic_var)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym90$_INFERENCE_EXPAND_SENSE_, sense)), (SubLObject)ConsesLow.listS((SubLObject)inference_worker_removal.$sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS, (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym92$TACTIC_STORE, tactic_var), ConsesLow.append(body, (SubLObject)inference_worker_removal.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list85);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 50621L)
    public static SubLObject execute_literal_level_removal_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = backward.$inference_expand_hl_module$.currentBinding(thread);
        final SubLObject _prev_bind_5 = backward.$inference_expand_sense$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(tactic), thread);
            backward.$inference_expand_sense$.bind(sense, thread);
            final SubLObject store_var = inference_datastructures_tactic.tactic_store(tactic);
            final SubLObject _prev_bind_0_$29 = control_vars.$negation_by_failure$.currentBinding(thread);
            try {
                control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                if (inference_worker_removal.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    inference_datastructures_tactic.tactic_in_progress_next(tactic);
                }
                else {
                    final SubLObject progress_iterator = maybe_make_removal_tactic_progress_iterator(tactic, asent, sense);
                    if (inference_worker_removal.NIL != progress_iterator) {
                        if (progress_iterator.isList()) {
                            SubLObject cdolist_list_var = progress_iterator;
                            SubLObject execution_result = (SubLObject)inference_worker_removal.NIL;
                            execution_result = cdolist_list_var.first();
                            while (inference_worker_removal.NIL != cdolist_list_var) {
                                handle_one_removal_tactic_expand_result(tactic, execution_result);
                                cdolist_list_var = cdolist_list_var.rest();
                                execution_result = cdolist_list_var.first();
                            }
                        }
                        else {
                            inference_datastructures_tactic.note_tactic_progress_iterator(tactic, progress_iterator);
                        }
                    }
                }
            }
            finally {
                control_vars.$negation_by_failure$.rebind(_prev_bind_0_$29, thread);
            }
        }
        finally {
            backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
            backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 51509L)
    public static SubLObject maybe_make_removal_tactic_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        if (inference_worker_removal.NIL != inference_modules.hl_module_output_generate_pattern(inference_datastructures_tactic.tactic_hl_module(tactic))) {
            return maybe_make_removal_tactic_output_generate_progress_iterator(tactic, asent);
        }
        return maybe_make_removal_tactic_expand_results_progress_iterator(tactic, asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 51924L)
    public static SubLObject maybe_make_removal_tactic_output_generate_progress_iterator(final SubLObject tactic, final SubLObject cycl_input_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        thread.resetMultipleValues();
        final SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        final SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != output_iterator) {
            inference_datastructures_tactic.possibly_update_tactic_productivity_from_iterator(tactic, output_iterator);
            return new_removal_tactic_output_generate_progress_iterator(tactic, output_iterator, encoded_bindings);
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52593L)
    public static SubLObject new_removal_tactic_output_generate_progress_iterator(final SubLObject tactic, final SubLObject output_iterator, final SubLObject encoded_bindings) {
        return inference_datastructures_tactic.new_tactic_progress_iterator((SubLObject)inference_worker_removal.$kw93$REMOVAL_OUTPUT_GENERATE, tactic, (SubLObject)ConsesLow.list(output_iterator, encoded_bindings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 52817L)
    public static SubLObject handle_one_removal_tactic_output_generate_result(final SubLObject removal_tactic, final SubLObject output_iterator, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_worker_removal.NIL;
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        final SubLObject cycl_input_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
        thread.resetMultipleValues();
        final SubLObject raw_output = iteration.iteration_next(output_iterator);
        final SubLObject validP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != validP) {
            final SubLObject _prev_bind_0 = backward.$removal_add_node_method$.currentBinding(thread);
            try {
                backward.$removal_add_node_method$.bind((SubLObject)inference_worker_removal.$sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE, thread);
                inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, (SubLObject)inference_worker_removal.UNPROVIDED);
                result = handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
            }
            finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 53617L)
    public static SubLObject handle_removal_add_node_for_output_generate(SubLObject removal_bindings, final SubLObject supports) {
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        final SubLObject removal_tactic = inference_worker.currently_executing_tactic();
        return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 54403L)
    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = hl_module_guts((SubLObject)inference_worker_removal.$kw95$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR, tactic, asent, sense, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED);
        final SubLObject new_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(Sequences.length(expand_results));
        inference_datastructures_tactic.update_tactic_productivity(tactic, new_productivity);
        if (inference_worker_removal.NIL != list_utilities.lengthGE(expand_results, inference_worker_removal.$removal_tactic_iteration_threshold$.getDynamicValue(thread), (SubLObject)inference_worker_removal.UNPROVIDED)) {
            expand_results = new_removal_tactic_expand_results_progress_iterator(tactic, expand_results);
        }
        return expand_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 55156L)
    public static SubLObject maybe_make_removal_tactic_expand_results_progress_iterator_guts(final SubLObject tactic, final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expand_results = (SubLObject)inference_worker_removal.NIL;
        final SubLObject _prev_bind_0 = inference_worker_removal.$removal_tactic_expand_results_queue$.currentBinding(thread);
        try {
            inference_worker_removal.$removal_tactic_expand_results_queue$.bind((SubLObject)inference_worker_removal.NIL, thread);
            final SubLObject _prev_bind_0_$30 = backward.$removal_add_node_method$.currentBinding(thread);
            try {
                backward.$removal_add_node_method$.bind((SubLObject)inference_worker_removal.$sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS, thread);
                final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
                final SubLObject pattern = inference_modules.hl_module_expand_pattern(hl_module);
                if (inference_worker_removal.NIL != pattern) {
                    formula_pattern_match.pattern_transform_formula(pattern, asent, (SubLObject)inference_worker_removal.UNPROVIDED);
                }
                else {
                    final SubLObject function = inference_modules.hl_module_expand_func(hl_module);
                    if (inference_worker_removal.NIL != eval_in_api.possibly_cyc_api_function_spec_p(function)) {
                        removal_module_expand_func_funcall(function, asent, sense);
                    }
                }
            }
            finally {
                backward.$removal_add_node_method$.rebind(_prev_bind_0_$30, thread);
            }
            if (inference_worker_removal.NIL != inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread)) {
                expand_results = Sequences.nreverse(inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread));
            }
        }
        finally {
            inference_worker_removal.$removal_tactic_expand_results_queue$.rebind(_prev_bind_0, thread);
        }
        return expand_results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56074L)
    public static SubLObject handle_removal_add_node_for_expand_results(SubLObject removal_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        removal_bindings = bindings.inference_simplify_unification_bindings(removal_bindings);
        inference_worker_removal.$removal_tactic_expand_results_queue$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(removal_bindings, supports), inference_worker_removal.$removal_tactic_expand_results_queue$.getDynamicValue(thread)), thread);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56482L)
    public static SubLObject new_removal_tactic_expand_results_progress_iterator(final SubLObject tactic, final SubLObject expand_results) {
        return inference_datastructures_tactic.new_tactic_progress_iterator((SubLObject)inference_worker_removal.$kw97$REMOVAL_EXPAND, tactic, expand_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 56653L)
    public static SubLObject handle_one_removal_tactic_expand_result(final SubLObject removal_tactic, final SubLObject expand_result) {
        SubLObject removal_bindings = (SubLObject)inference_worker_removal.NIL;
        SubLObject supports = (SubLObject)inference_worker_removal.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(expand_result, expand_result, (SubLObject)inference_worker_removal.$list98);
        removal_bindings = expand_result.first();
        SubLObject current = expand_result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, expand_result, (SubLObject)inference_worker_removal.$list98);
        supports = current.first();
        current = current.rest();
        if (inference_worker_removal.NIL == current) {
            inference_datastructures_tactic.decrement_tactic_productivity_for_number_of_children(removal_tactic, (SubLObject)inference_worker_removal.UNPROVIDED);
            return handle_one_removal_tactic_result(removal_tactic, removal_bindings, supports);
        }
        cdestructuring_bind.cdestructuring_bind_error(expand_result, (SubLObject)inference_worker_removal.$list98);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 57026L)
    public static SubLObject handle_one_removal_tactic_result(final SubLObject removal_tactic, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject result = (SubLObject)inference_worker_removal.NIL;
        if (inference_worker_removal.NIL == variables.fully_bound_p(supports)) {
            control_vars.inference_warn((SubLObject)inference_worker_removal.$str99$Ignoring_result_from__S_due_to_op, inference_datastructures_tactic.tactic_hl_module(removal_tactic), (SubLObject)inference_worker_removal.UNPROVIDED);
        }
        else {
            thread.resetMultipleValues();
            final SubLObject mt = inference_datastructures_problem.mt_asent_sense_from_single_literal_problem(problem);
            final SubLObject asent = thread.secondMultipleValue();
            final SubLObject sense = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = backward.$inference_expand_hl_module$.currentBinding(thread);
            final SubLObject _prev_bind_5 = backward.$inference_expand_sense$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                backward.$inference_expand_hl_module$.bind(inference_datastructures_tactic.tactic_hl_module(removal_tactic), thread);
                backward.$inference_expand_sense$.bind(sense, thread);
                final SubLObject store_var = inference_datastructures_tactic.tactic_store(removal_tactic);
                final SubLObject _prev_bind_0_$31 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind(inference_datastructures_problem_store.problem_store_negation_by_failureP(store_var), thread);
                    if (inference_worker_removal.NIL != removal_bindings && inference_worker_removal.NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) {
                        result = maybe_new_restriction_and_removal_link(problem, removal_tactic, removal_bindings, supports);
                    }
                    else {
                        result = maybe_new_removal_link(problem, removal_tactic, removal_bindings, supports);
                    }
                }
                finally {
                    control_vars.$negation_by_failure$.rebind(_prev_bind_0_$31, thread);
                }
            }
            finally {
                backward.$inference_expand_sense$.rebind(_prev_bind_5, thread);
                backward.$inference_expand_hl_module$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 58133L)
    public static SubLObject maybe_new_restriction_and_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject supports) {
        final SubLObject restricted_mapped_problem = inference_worker_join_ordered.find_or_create_restricted_problem(problem, removal_bindings);
        maybe_new_removal_link(inference_datastructures_problem_link.mapped_problem_problem(restricted_mapped_problem), tactic, (SubLObject)inference_worker_removal.NIL, supports);
        return inference_worker_restriction.maybe_new_restriction_link(problem, restricted_mapped_problem, removal_bindings, (SubLObject)inference_worker_removal.NIL, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 58589L)
    public static SubLObject maybe_new_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject removal_bindings, final SubLObject supports) {
        assert inference_worker_removal.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(tactic);
        if (inference_worker_removal.NIL == inference_datastructures_problem.tactically_good_problem_p(problem)) {
            return new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        if (inference_worker_removal.NIL != removal_tactic_p(tactic) && inference_worker_removal.NIL == inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(inference_datastructures_problem.problem_store(problem))) {
            return new_removal_link(problem, hl_module, removal_bindings, supports);
        }
        final SubLObject existing_link = find_removal_link(problem, tactic, removal_bindings, supports);
        if (inference_worker_removal.NIL != inference_datastructures_problem_link.problem_link_p(existing_link)) {
            return existing_link;
        }
        return new_removal_link(problem, hl_module, removal_bindings, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60087L)
    public static SubLObject find_removal_link(final SubLObject problem, final SubLObject tactic, final SubLObject v_bindings, final SubLObject supports) {
        final SubLObject candidate_argument_links = inference_datastructures_problem.problem_argument_links_lookup(problem, v_bindings);
        if (inference_worker_removal.NIL != candidate_argument_links) {
            SubLObject cdolist_list_var = candidate_argument_links;
            SubLObject link = (SubLObject)inference_worker_removal.NIL;
            link = cdolist_list_var.first();
            while (inference_worker_removal.NIL != cdolist_list_var) {
                if (inference_worker_removal.NIL != removal_link_p(link) && tactic.eql(removal_link_tactic(link)) && inference_worker_removal.NIL != removal_link_data_equals_specP(link, v_bindings, supports)) {
                    return link;
                }
                cdolist_list_var = cdolist_list_var.rest();
                link = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60503L)
    public static SubLObject new_removal_proof(final SubLObject removal_link) {
        final SubLObject removal_bindings = removal_link_bindings(removal_link);
        return inference_worker.propose_new_proof_with_bindings(removal_link, removal_bindings, (SubLObject)inference_worker_removal.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 60763L)
    public static SubLObject execute_literal_level_meta_removal_tactic(final SubLObject tactic, final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLObject strategy = inference_macros.current_controlling_strategy();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject removal_tactics = inference_datastructures_problem.problem_possible_removal_tactics(problem);
        SubLObject cdolist_list_var;
        removal_tactics = (cdolist_list_var = Sort.sort(removal_tactics, Symbols.symbol_function((SubLObject)inference_worker_removal.$sym100$PRODUCTIVITY__), Symbols.symbol_function((SubLObject)inference_worker_removal.$sym101$TACTIC_PRODUCTIVITY)));
        SubLObject other_tactic = (SubLObject)inference_worker_removal.NIL;
        other_tactic = cdolist_list_var.first();
        while (inference_worker_removal.NIL != cdolist_list_var) {
            if (!tactic.eql(other_tactic) && inference_worker_removal.NIL == inference_datastructures_tactic.abductive_tacticP(other_tactic)) {
                while (inference_worker_removal.NIL != inference_datastructures_tactic.tactic_possibleP(other_tactic)) {
                    inference_tactician.strategy_execute_tactic(strategy, other_tactic);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 61771L)
    public static SubLObject inference_remove_check_default(final SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == inference_worker_removal.UNPROVIDED) {
            sense = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        final SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, (SubLObject)inference_worker_removal.NIL);
        final SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            final SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            final SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_worker_removal.NIL != inference_output_checker(hl_module, raw_input, encoded_bindings)) {
                thread.resetMultipleValues();
                final SubLObject support = inference_support_constructor(hl_module, cycl_input_asent, encoded_bindings);
                final SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                backward.removal_add_node(support, (SubLObject)inference_worker_removal.NIL, more_supports);
            }
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63392L)
    public static SubLObject do_all_legacy_inference_outputs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject raw_output = (SubLObject)inference_worker_removal.NIL;
        SubLObject raw_output_iterator = (SubLObject)inference_worker_removal.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list102);
        raw_output = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker_removal.$list102);
        raw_output_iterator = current.first();
        current = current.rest();
        if (inference_worker_removal.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject iterator = (SubLObject)inference_worker_removal.$sym103$ITERATOR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym54$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, raw_output_iterator)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym104$PIF, (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym105$ITERATOR_P, iterator), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym106$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)inference_worker_removal.$sym107$DO_ITERATOR, (SubLObject)ConsesLow.list(raw_output, iterator), ConsesLow.append(body, (SubLObject)inference_worker_removal.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_worker_removal.$sym108$ITERATION_FINALIZE, iterator)), (SubLObject)ConsesLow.listS((SubLObject)inference_worker_removal.$sym109$DO_LIST, (SubLObject)ConsesLow.list(raw_output, iterator), ConsesLow.append(body, (SubLObject)inference_worker_removal.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker_removal.$list102);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 63851L)
    public static SubLObject inference_remove_unify_default(final SubLObject cycl_input_asent, SubLObject sense) {
        if (sense == inference_worker_removal.UNPROVIDED) {
            sense = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_module = inference_current_hl_module();
        thread.resetMultipleValues();
        final SubLObject output_iterator = maybe_make_inference_output_iterator(hl_module, cycl_input_asent);
        final SubLObject encoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != output_iterator) {
            final SubLObject iterator = output_iterator;
            if (inference_worker_removal.NIL != iteration.iterator_p(iterator)) {
                try {
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)inference_worker_removal.NIL; inference_worker_removal.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_removal.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject raw_output = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (inference_worker_removal.NIL != valid) {
                            handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker_removal.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        iteration.iteration_finalize(iterator);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            else {
                SubLObject cdolist_list_var = iterator;
                SubLObject raw_output = (SubLObject)inference_worker_removal.NIL;
                raw_output = cdolist_list_var.first();
                while (inference_worker_removal.NIL != cdolist_list_var) {
                    handle_one_output_generate_result(cycl_input_asent, hl_module, raw_output, encoded_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    raw_output = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64498L)
    public static SubLObject maybe_make_inference_output_iterator(final SubLObject hl_module, final SubLObject cycl_input_asent) {
        return hl_module_guts((SubLObject)inference_worker_removal.$kw110$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, cycl_input_asent, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED, (SubLObject)inference_worker_removal.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 64674L)
    public static SubLObject maybe_make_inference_output_iterator_guts(final SubLObject hl_module, final SubLObject cycl_input_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl_input = inference_input_extractor(hl_module, cycl_input_asent, (SubLObject)inference_worker_removal.NIL);
        final SubLObject extracted_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != inference_input_verifier(hl_module, cycl_input)) {
            thread.resetMultipleValues();
            final SubLObject raw_input = inference_input_encoder(hl_module, cycl_input, extracted_bindings);
            final SubLObject encoded_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject output_iterator = inference_output_generator(hl_module, raw_input, encoded_bindings);
            return subl_promotions.values2(output_iterator, encoded_bindings);
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 65220L)
    public static SubLObject handle_one_output_generate_result(final SubLObject cycl_input_asent, final SubLObject hl_module, final SubLObject raw_output, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject successP = hl_module_guts((SubLObject)inference_worker_removal.$kw111$HANDLE_ONE_OUTPUT_GENERATE_RESULT, cycl_input_asent, hl_module, raw_output, encoded_bindings, (SubLObject)inference_worker_removal.UNPROVIDED);
        final SubLObject support = thread.secondMultipleValue();
        final SubLObject unify_bindings = thread.thirdMultipleValue();
        final SubLObject more_supports = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != successP) {
            return backward.removal_add_node(support, unify_bindings, more_supports);
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 65643L)
    public static SubLObject handle_one_output_generate_result_guts(final SubLObject cycl_input_asent, final SubLObject hl_module, final SubLObject raw_output, final SubLObject encoded_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl_output = inference_output_decoder(hl_module, raw_output, encoded_bindings);
        final SubLObject decoded_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_removal.NIL != inference_output_verifier(hl_module, cycl_output)) {
            thread.resetMultipleValues();
            final SubLObject cycl_output_asent = inference_output_constructor(hl_module, cycl_output, decoded_bindings);
            final SubLObject constructed_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject unify_bindings = unification_utilities.term_unify(cycl_input_asent, cycl_output_asent, (SubLObject)inference_worker_removal.T, (SubLObject)inference_worker_removal.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_worker_removal.NIL != unify_bindings) {
                thread.resetMultipleValues();
                final SubLObject support = inference_support_constructor(hl_module, cycl_output_asent, constructed_bindings);
                final SubLObject more_supports = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return subl_promotions.values4((SubLObject)inference_worker_removal.T, support, unify_bindings, ConsesLow.append(more_supports, unify_justification));
            }
        }
        return subl_promotions.values4((SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL, (SubLObject)inference_worker_removal.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66493L)
    public static SubLObject inference_current_hl_module() {
        return backward.inference_expand_hl_module();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66679L)
    public static SubLObject inference_current_sense() {
        return backward.inference_expand_sense();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 66857L)
    public static SubLObject inference_input_extractor(final SubLObject hl_module, final SubLObject cycl_input_asent, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_input_extract_pattern(hl_module);
        return formula_pattern_match.pattern_transform_formula(pattern, cycl_input_asent, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67111L)
    public static SubLObject inference_input_verifier(final SubLObject hl_module, final SubLObject cycl_input) {
        final SubLObject pattern = inference_modules.hl_module_input_verify_pattern(hl_module);
        return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_input);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67334L)
    public static SubLObject inference_input_encoder(final SubLObject hl_module, final SubLObject cycl_input, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_input_encode_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, cycl_input, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67568L)
    public static SubLObject inference_output_checker(final SubLObject hl_module, final SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_check_pattern(hl_module);
        if (inference_worker_removal.NIL == pattern) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        return list_utilities.sublisp_boolean(output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 67904L)
    public static SubLObject inference_output_generator(final SubLObject hl_module, final SubLObject raw_input, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_generate_pattern(hl_module);
        if (inference_worker_removal.NIL == pattern) {
            return (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject output = pattern_match.pattern_transform_tree(pattern, raw_input, v_bindings);
        if (inference_worker_removal.NIL != iteration.iterator_p(output)) {
            return output;
        }
        if (output.isList()) {
            return iteration.new_list_iterator(output);
        }
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 68486L)
    public static SubLObject inference_output_decoder(final SubLObject hl_module, final SubLObject raw_output, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_decode_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, raw_output, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 68724L)
    public static SubLObject inference_output_verifier(final SubLObject hl_module, final SubLObject cycl_output) {
        final SubLObject pattern = inference_modules.hl_module_output_verify_pattern(hl_module);
        return formula_pattern_match.pattern_matches_formula_without_bindings(pattern, cycl_output);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 69002L)
    public static SubLObject inference_output_constructor(final SubLObject hl_module, final SubLObject cycl_output, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLObject pattern = inference_modules.hl_module_output_construct_pattern(hl_module);
        return pattern_match.pattern_transform_tree(pattern, cycl_output, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 69255L)
    public static SubLObject inference_support_constructor(final SubLObject hl_module, final SubLObject cycl_output_asent, SubLObject v_bindings) {
        if (v_bindings == inference_worker_removal.UNPROVIDED) {
            v_bindings = (SubLObject)inference_worker_removal.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject support_sense = inference_current_sense();
        final SubLObject support_sentence = el_utilities.asent_and_sense_to_literal(cycl_output_asent, support_sense);
        final SubLObject support_mt = inference_modules.hl_module_support_mt_result(hl_module);
        final SubLObject pattern = inference_modules.hl_module_support_pattern(hl_module);
        if (inference_worker_removal.NIL != pattern) {
            SubLObject current;
            final SubLObject datum = current = formula_pattern_match.pattern_transform_formula(pattern, cycl_output_asent, v_bindings);
            final SubLObject support = (SubLObject)(current.isCons() ? current.first() : inference_worker_removal.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_worker_removal.$list112);
            final SubLObject more_supports;
            current = (more_supports = current.rest());
            return subl_promotions.values2(support, more_supports);
        }
        final SubLObject support_func = inference_modules.hl_module_support_func(hl_module);
        if (inference_worker_removal.NIL != eval_in_api.possibly_cyc_api_function_spec_p(support_func)) {
            thread.resetMultipleValues();
            final SubLObject support2 = eval_in_api.possibly_cyc_api_funcall_2(support_func, support_sentence, support_mt);
            final SubLObject more_supports2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return subl_promotions.values2(support2, more_supports2);
        }
        final SubLObject support_module = inference_modules.hl_module_support_module(hl_module);
        final SubLObject support_strength = inference_modules.hl_module_support_strength(hl_module);
        final SubLObject support_tv = enumeration_types.tv_from_truth_strength((SubLObject)inference_worker_removal.$kw113$TRUE, support_strength);
        final SubLObject support3 = arguments.make_hl_support(support_module, support_sentence, support_mt, support_tv);
        final SubLObject more_supports3 = (SubLObject)inference_worker_removal.NIL;
        return subl_promotions.values2(support3, more_supports3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-removal.lisp", position = 70746L)
    public static SubLObject hl_module_guts(final SubLObject type, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == inference_worker_removal.UNPROVIDED) {
            arg1 = (SubLObject)inference_worker_removal.NIL;
        }
        if (arg2 == inference_worker_removal.UNPROVIDED) {
            arg2 = (SubLObject)inference_worker_removal.NIL;
        }
        if (arg3 == inference_worker_removal.UNPROVIDED) {
            arg3 = (SubLObject)inference_worker_removal.NIL;
        }
        if (arg4 == inference_worker_removal.UNPROVIDED) {
            arg4 = (SubLObject)inference_worker_removal.NIL;
        }
        if (arg5 == inference_worker_removal.UNPROVIDED) {
            arg5 = (SubLObject)inference_worker_removal.NIL;
        }
        if (type.eql((SubLObject)inference_worker_removal.$kw78$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES)) {
            return determine_new_removal_tactic_specs_from_hl_modules_guts(arg1, arg2, arg3);
        }
        if (type.eql((SubLObject)inference_worker_removal.$kw95$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR)) {
            return maybe_make_removal_tactic_expand_results_progress_iterator_guts(arg1, arg2, arg3);
        }
        if (type.eql((SubLObject)inference_worker_removal.$kw111$HANDLE_ONE_OUTPUT_GENERATE_RESULT)) {
            return handle_one_output_generate_result_guts(arg1, arg2, arg3, arg4);
        }
        if (type.eql((SubLObject)inference_worker_removal.$kw110$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR)) {
            return maybe_make_inference_output_iterator_guts(arg1, arg2);
        }
        Errors.error((SubLObject)inference_worker_removal.$str114$unknown_thing_to_do_in_the_HL_mod, type);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    public static SubLObject declare_inference_worker_removal_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_data_print_function_trampoline", "REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_data_p", "REMOVAL-LINK-DATA-P", 1, 0, false);
        new $removal_link_data_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "remov_link_data_hl_module", "REMOV-LINK-DATA-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "remov_link_data_bindings", "REMOV-LINK-DATA-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "remov_link_data_supports", "REMOV-LINK-DATA-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "_csetf_remov_link_data_hl_module", "_CSETF-REMOV-LINK-DATA-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "_csetf_remov_link_data_bindings", "_CSETF-REMOV-LINK-DATA-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "_csetf_remov_link_data_supports", "_CSETF-REMOV-LINK-DATA-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "make_removal_link_data", "MAKE-REMOVAL-LINK-DATA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "visit_defstruct_removal_link_data", "VISIT-DEFSTRUCT-REMOVAL-LINK-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "visit_defstruct_object_removal_link_data_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_link", "NEW-REMOVAL-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_link_int", "NEW-REMOVAL-LINK-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_link_data", "NEW-REMOVAL-LINK-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "destroy_removal_link", "DESTROY-REMOVAL-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_hl_module", "REMOVAL-LINK-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_bindings", "REMOVAL-LINK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_supports", "REMOVAL-LINK-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "set_removal_link_hl_module", "SET-REMOVAL-LINK-HL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "set_removal_link_bindings", "SET-REMOVAL-LINK-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "set_removal_link_supports", "SET-REMOVAL-LINK-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_tactic", "REMOVAL-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_data_equals_specP", "REMOVAL-LINK-DATA-EQUALS-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "generalized_removal_tactic_p", "GENERALIZED-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_tactic_p", "CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_link_p", "CONJUNCTIVE-REMOVAL-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_proof_p", "CONJUNCTIVE-REMOVAL-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_conjunctive_removal_tactics", "DETERMINE-NEW-CONJUNCTIVE-REMOVAL-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "sort_applicable_conjunctive_removal_modules_by_priority", "SORT-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES-BY-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_module_priorityL", "CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_applicable_conjunctive_removal_modules", "DETERMINE-APPLICABLE-CONJUNCTIVE-REMOVAL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "motivated_multi_literal_subclause_specs", "MOTIVATED-MULTI-LITERAL-SUBCLAUSE-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "hl_module_applicable_subclause_specs", "HL-MODULE-APPLICABLE-SUBCLAUSE-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_conjunctive_removal_tactic", "NEW-CONJUNCTIVE-REMOVAL-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "compute_strategic_properties_of_conjunctive_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-CONJUNCTIVE-REMOVAL-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "execute_conjunctive_removal_tactic", "EXECUTE-CONJUNCTIVE-REMOVAL-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_conjunctive_removal_tactic_progress_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_conjunctive_removal_tactic_progress_expand_iterative_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_conjunctive_removal_tactic_progress_expand_iterative_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATIVE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_conjunctive_removal_tactic_expand_iterative_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-ITERATIVE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_conjunctive_removal_tactic_progress_expand_iterator", "MAYBE-MAKE-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_conjunctive_removal_tactic_progress_expand_iterator", "NEW-CONJUNCTIVE-REMOVAL-TACTIC-PROGRESS-EXPAND-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_callback", "CONJUNCTIVE-REMOVAL-CALLBACK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_conjunctive_removal_tactic_expand_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "conjunctive_removal_suppress_split_justificationP", "CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_conjunctive_removal_tactic_result", "HANDLE-ONE-CONJUNCTIVE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_simplification_link", "MAYBE-NEW-SIMPLIFICATION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_restriction_split_and_removal_links", "MAYBE-NEW-RESTRICTION-SPLIT-AND-REMOVAL-LINKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "reorder_conjunctive_removal_justifications", "REORDER-CONJUNCTIVE-REMOVAL-JUSTIFICATIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_split_and_removal_links", "MAYBE-NEW-SPLIT-AND-REMOVAL-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_removal_link_for_split_link", "MAYBE-NEW-REMOVAL-LINK-FOR-SPLIT-LINK", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "executed_conjunctive_removal_problems", "EXECUTED-CONJUNCTIVE-REMOVAL-PROBLEMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "problem_store_has_some_executed_sksi_conjunctive_removal_problemP", "PROBLEM-STORE-HAS-SOME-EXECUTED-SKSI-CONJUNCTIVE-REMOVAL-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "executed_conjunctive_removal_tactic_p", "EXECUTED-CONJUNCTIVE-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "with_problem_store_removal_assumptions", "WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "meta_removal_tactic_p", "META-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "compute_strategic_properties_of_meta_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-REMOVAL-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_link_p", "REMOVAL-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_tactic_p", "REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_proof_p", "REMOVAL-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_module_exclusive_func_funcall", "REMOVAL-MODULE-EXCLUSIVE-FUNC-FUNCALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_module_required_func_funcall", "REMOVAL-MODULE-REQUIRED-FUNC-FUNCALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "removal_module_expand_func_funcall", "REMOVAL-MODULE-EXPAND-FUNC-FUNCALL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_literal_removal_tactics", "DETERMINE-NEW-LITERAL-REMOVAL-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_literal_meta_removal_tactics", "DETERMINE-NEW-LITERAL-META-REMOVAL-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_literal_simple_removal_tactics", "DETERMINE-NEW-LITERAL-SIMPLE-REMOVAL-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_options", "LITERAL-REMOVAL-OPTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_options_hl_modules", "LITERAL-REMOVAL-OPTIONS-HL-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "filter_modules_wrt_allowed_modules_spec", "FILTER-MODULES-WRT-ALLOWED-MODULES-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_options_candidate_hl_modules", "LITERAL-REMOVAL-OPTIONS-CANDIDATE-HL-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "hl_module_applicable_to_asentP", "HL-MODULE-APPLICABLE-TO-ASENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_removal_tactics_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTICS-FROM-HL-MODULES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_removal_tactic_specs_from_hl_modules", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_new_removal_tactic_specs_from_hl_modules_guts", "DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES-GUTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "determine_applicable_hl_modules_for_asent", "DETERMINE-APPLICABLE-HL-MODULES-FOR-ASENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "update_applicable_hl_modules", "UPDATE-APPLICABLE-HL-MODULES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "update_supplanted_hl_modules", "UPDATE-SUPPLANTED-HL-MODULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "update_supplanted_modules_wrt_tactic_specs", "UPDATE-SUPPLANTED-MODULES-WRT-TACTIC-SPECS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "compute_tactic_specs_for_asent", "COMPUTE-TACTIC-SPECS-FOR-ASENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_simple_removal_candidate_hl_modules", "LITERAL-SIMPLE-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_candidate_hl_modules_for_predicate_with_sense", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_candidate_hl_modules_for_predicate_with_sense_int_internal", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_removal_candidate_hl_modules_for_predicate_with_sense_int", "LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_meta_removal_candidate_hl_modules", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_meta_removal_candidate_hl_modules_for_predicate_internal", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_meta_removal_candidate_hl_modules_for_predicate", "LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_level_removal_tactic_p", "LITERAL-LEVEL-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "literal_level_meta_removal_tactic_p", "LITERAL-LEVEL-META-REMOVAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_tactic", "NEW-REMOVAL-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "compute_strategic_properties_of_removal_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-REMOVAL-TACTIC", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "with_removal_tactic_execution_assumptions", "WITH-REMOVAL-TACTIC-EXECUTION-ASSUMPTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "execute_literal_level_removal_tactic", "EXECUTE-LITERAL-LEVEL-REMOVAL-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_removal_tactic_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_removal_tactic_output_generate_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_tactic_output_generate_progress_iterator", "NEW-REMOVAL-TACTIC-OUTPUT-GENERATE-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_removal_tactic_output_generate_result", "HANDLE-ONE-REMOVAL-TACTIC-OUTPUT-GENERATE-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_removal_add_node_for_output_generate", "HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_removal_tactic_expand_results_progress_iterator", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_removal_tactic_expand_results_progress_iterator_guts", "MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR-GUTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_removal_add_node_for_expand_results", "HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_tactic_expand_results_progress_iterator", "NEW-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_removal_tactic_expand_result", "HANDLE-ONE-REMOVAL-TACTIC-EXPAND-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_removal_tactic_result", "HANDLE-ONE-REMOVAL-TACTIC-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_restriction_and_removal_link", "MAYBE-NEW-RESTRICTION-AND-REMOVAL-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_new_removal_link", "MAYBE-NEW-REMOVAL-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "find_removal_link", "FIND-REMOVAL-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "new_removal_proof", "NEW-REMOVAL-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "execute_literal_level_meta_removal_tactic", "EXECUTE-LITERAL-LEVEL-META-REMOVAL-TACTIC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_remove_check_default", "INFERENCE-REMOVE-CHECK-DEFAULT", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "do_all_legacy_inference_outputs", "DO-ALL-LEGACY-INFERENCE-OUTPUTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_remove_unify_default", "INFERENCE-REMOVE-UNIFY-DEFAULT", 1, 1, false);
        new $inference_remove_unify_default$UnaryFunction();
        new $inference_remove_unify_default$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_inference_output_iterator", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "maybe_make_inference_output_iterator_guts", "MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_output_generate_result", "HANDLE-ONE-OUTPUT-GENERATE-RESULT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "handle_one_output_generate_result_guts", "HANDLE-ONE-OUTPUT-GENERATE-RESULT-GUTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_current_hl_module", "INFERENCE-CURRENT-HL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_current_sense", "INFERENCE-CURRENT-SENSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_input_extractor", "INFERENCE-INPUT-EXTRACTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_input_verifier", "INFERENCE-INPUT-VERIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_input_encoder", "INFERENCE-INPUT-ENCODER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_output_checker", "INFERENCE-OUTPUT-CHECKER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_output_generator", "INFERENCE-OUTPUT-GENERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_output_decoder", "INFERENCE-OUTPUT-DECODER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_output_verifier", "INFERENCE-OUTPUT-VERIFIER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_output_constructor", "INFERENCE-OUTPUT-CONSTRUCTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "inference_support_constructor", "INFERENCE-SUPPORT-CONSTRUCTOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_removal", "hl_module_guts", "HL-MODULE-GUTS", 1, 5, false);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    public static SubLObject init_inference_worker_removal_file() {
        inference_worker_removal.$dtp_removal_link_data$ = SubLFiles.defconstant("*DTP-REMOVAL-LINK-DATA*", (SubLObject)inference_worker_removal.$sym0$REMOVAL_LINK_DATA);
        inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", (SubLObject)inference_worker_removal.NIL);
        inference_worker_removal.$conjunctive_removal_suppress_split_justificationP$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?*", (SubLObject)inference_worker_removal.T);
        inference_worker_removal.$conjunctive_removal_optimize_when_no_justificationsP$ = SubLFiles.defparameter("*CONJUNCTIVE-REMOVAL-OPTIMIZE-WHEN-NO-JUSTIFICATIONS?*", (SubLObject)inference_worker_removal.T);
        inference_worker_removal.$removal_tactic_iteration_threshold$ = SubLFiles.defparameter("*REMOVAL-TACTIC-ITERATION-THRESHOLD*", (SubLObject)inference_worker_removal.TWO_INTEGER);
        inference_worker_removal.$removal_tactic_expand_results_queue$ = SubLFiles.defparameter("*REMOVAL-TACTIC-EXPAND-RESULTS-QUEUE*", (SubLObject)inference_worker_removal.NIL);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    public static SubLObject setup_inference_worker_removal_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_worker_removal.$dtp_removal_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_removal.$sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_worker_removal.$list8);
        Structures.def_csetf((SubLObject)inference_worker_removal.$sym9$REMOV_LINK_DATA_HL_MODULE, (SubLObject)inference_worker_removal.$sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE);
        Structures.def_csetf((SubLObject)inference_worker_removal.$sym11$REMOV_LINK_DATA_BINDINGS, (SubLObject)inference_worker_removal.$sym12$_CSETF_REMOV_LINK_DATA_BINDINGS);
        Structures.def_csetf((SubLObject)inference_worker_removal.$sym13$REMOV_LINK_DATA_SUPPORTS, (SubLObject)inference_worker_removal.$sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS);
        Equality.identity((SubLObject)inference_worker_removal.$sym0$REMOVAL_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_removal.$dtp_removal_link_data$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_worker_removal.$sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD));
        memoization_state.note_memoized_function((SubLObject)inference_worker_removal.$sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT);
        memoization_state.note_memoized_function((SubLObject)inference_worker_removal.$sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE);
        return (SubLObject)inference_worker_removal.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_removal_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_removal_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_removal_file();
    }
    
    static {
        me = (SubLFile)new inference_worker_removal();
        inference_worker_removal.$dtp_removal_link_data$ = null;
        inference_worker_removal.$conjunctive_removal_tactic_expand_results_queue$ = null;
        inference_worker_removal.$conjunctive_removal_suppress_split_justificationP$ = null;
        inference_worker_removal.$conjunctive_removal_optimize_when_no_justificationsP$ = null;
        inference_worker_removal.$removal_tactic_iteration_threshold$ = null;
        inference_worker_removal.$removal_tactic_expand_results_queue$ = null;
        $sym0$REMOVAL_LINK_DATA = SubLObjectFactory.makeSymbol("REMOVAL-LINK-DATA");
        $sym1$REMOVAL_LINK_DATA_P = SubLObjectFactory.makeSymbol("REMOVAL-LINK-DATA-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HL-MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-SUPPORTS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$REMOVAL_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOVAL-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-LINK-DATA-P"));
        $sym9$REMOV_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-HL-MODULE");
        $sym10$_CSETF_REMOV_LINK_DATA_HL_MODULE = SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-HL-MODULE");
        $sym11$REMOV_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-BINDINGS");
        $sym12$_CSETF_REMOV_LINK_DATA_BINDINGS = SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-BINDINGS");
        $sym13$REMOV_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("REMOV-LINK-DATA-SUPPORTS");
        $sym14$_CSETF_REMOV_LINK_DATA_SUPPORTS = SubLObjectFactory.makeSymbol("_CSETF-REMOV-LINK-DATA-SUPPORTS");
        $kw15$HL_MODULE = SubLObjectFactory.makeKeyword("HL-MODULE");
        $kw16$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw17$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $str18$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw19$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym20$MAKE_REMOVAL_LINK_DATA = SubLObjectFactory.makeSymbol("MAKE-REMOVAL-LINK-DATA");
        $kw21$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw22$END = SubLObjectFactory.makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_REMOVAL_LINK_DATA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-LINK-DATA-METHOD");
        $sym24$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $kw25$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw26$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym27$REMOVAL_LINK_P = SubLObjectFactory.makeSymbol("REMOVAL-LINK-P");
        $sym28$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $sym29$BINDING_LIST_P = SubLObjectFactory.makeSymbol("BINDING-LIST-P");
        $sym30$HL_JUSTIFICATION_P = SubLObjectFactory.makeSymbol("HL-JUSTIFICATION-P");
        $kw31$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw32$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw33$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETENESS"));
        $sym35$CONJUNCTIVE_REMOVAL_MODULE_PRIORITY_ = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-PRIORITY<");
        $kw36$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw37$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $str38$_s_stated_its_applicability_to_th = SubLObjectFactory.makeString("~s stated its applicability to the subclause spec ~s, which does not specify more than one literal.\nConjunctive removal modules must apply to more than one literal in the clause.");
        $kw39$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw40$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATIONS"));
        $kw42$CONJUNCTIVE_REMOVAL_EXPAND_ITERATIVE = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND-ITERATIVE");
        $sym43$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $kw44$CONJUNCTIVE_REMOVAL_EXPAND = SubLObjectFactory.makeKeyword("CONJUNCTIVE-REMOVAL-EXPAND");
        $kw45$INFERENCE_PROOF_SPEC = SubLObjectFactory.makeKeyword("INFERENCE-PROOF-SPEC");
        $str46$Problem_reuse_assumptions_were_vi = SubLObjectFactory.makeString("Problem reuse assumptions were violated: ~a did not equal ~a");
        $str47$Couldn_t_find_the_right_conjuncti = SubLObjectFactory.makeString("Couldn't find the right conjunctive removal justification for ~S");
        $kw48$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw49$POS = SubLObjectFactory.makeKeyword("POS");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw51$SKSI = SubLObjectFactory.makeKeyword("SKSI");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym53$STORE_VAR = SubLObjectFactory.makeUninternedSymbol("STORE-VAR");
        $sym54$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym55$_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("*NEGATION-BY-FAILURE*");
        $sym56$PROBLEM_STORE_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $kw57$META_REMOVAL = SubLObjectFactory.makeKeyword("META-REMOVAL");
        $sym58$META_REMOVAL_COMPLETELY_DECIDABLE_POS_REQUIRED = SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETELY-DECIDABLE-POS-REQUIRED");
        $sym59$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym60$META_REMOVAL_COMPLETELY_ENUMERABLE_POS_REQUIRED = SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETELY-ENUMERABLE-POS-REQUIRED");
        $sym61$REMOVAL_ABDUCTION_POS_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-ABDUCTION-POS-REQUIRED");
        $sym62$REMOVAL_EVALUATABLE_FCP_UNIFY_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED");
        $sym63$REMOVAL_FCP_CHECK_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-FCP-CHECK-REQUIRED");
        $sym64$REMOVAL_ISA_DEFN_POS_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED");
        $sym65$REMOVAL_TVA_CHECK_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-REQUIRED");
        $sym66$REMOVAL_TVA_UNIFY_REQUIRED = SubLObjectFactory.makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED");
        $sym67$REMOVAL_ASSERTED_TERM_SENTENCES_ARG_INDEX_UNIFY_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-TERM-SENTENCES-ARG-INDEX-UNIFY-EXPAND");
        $sym68$REMOVAL_EVAL_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-EVAL-EXPAND");
        $sym69$REMOVAL_EVALUATE_BIND_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-EVALUATE-BIND-EXPAND");
        $sym70$REMOVAL_ISA_COLLECTION_CHECK_NEG_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND");
        $sym71$REMOVAL_ISA_COLLECTION_CHECK_POS_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND");
        $sym72$REMOVAL_NAT_ARGUMENT_LOOKUP_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-NAT-ARGUMENT-LOOKUP-EXPAND");
        $sym73$REMOVAL_NAT_FORMULA_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-NAT-FORMULA-EXPAND");
        $sym74$REMOVAL_NAT_FUNCTION_LOOKUP_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-NAT-FUNCTION-LOOKUP-EXPAND");
        $sym75$REMOVAL_NAT_LOOKUP_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND");
        $sym76$REMOVAL_REFLEXIVE_ON_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND");
        $sym77$REMOVAL_TVA_CHECK_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-TVA-CHECK-EXPAND");
        $kw78$DETERMINE_NEW_REMOVAL_TACTIC_SPECS_FROM_HL_MODULES = SubLObjectFactory.makeKeyword("DETERMINE-NEW-REMOVAL-TACTIC-SPECS-FROM-HL-MODULES");
        $kw79$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw80$MODULE_SUBTYPE = SubLObjectFactory.makeKeyword("MODULE-SUBTYPE");
        $sym81$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str82$For_sentence_____S__Maximum_HL_Mo = SubLObjectFactory.makeString("For sentence :~%~S~%Maximum HL Module check cost exceeded by ~A (~A).");
        $sym83$LITERAL_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE_WITH_SENSE_INT = SubLObjectFactory.makeSymbol("LITERAL-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE-WITH-SENSE-INT");
        $sym84$LITERAL_META_REMOVAL_CANDIDATE_HL_MODULES_FOR_PREDICATE = SubLObjectFactory.makeSymbol("LITERAL-META-REMOVAL-CANDIDATE-HL-MODULES-FOR-PREDICATE");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym86$TACTIC_VAR = SubLObjectFactory.makeUninternedSymbol("TACTIC-VAR");
        $sym87$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $sym88$_INFERENCE_EXPAND_HL_MODULE_ = SubLObjectFactory.makeSymbol("*INFERENCE-EXPAND-HL-MODULE*");
        $sym89$TACTIC_HL_MODULE = SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE");
        $sym90$_INFERENCE_EXPAND_SENSE_ = SubLObjectFactory.makeSymbol("*INFERENCE-EXPAND-SENSE*");
        $sym91$WITH_PROBLEM_STORE_REMOVAL_ASSUMPTIONS = SubLObjectFactory.makeSymbol("WITH-PROBLEM-STORE-REMOVAL-ASSUMPTIONS");
        $sym92$TACTIC_STORE = SubLObjectFactory.makeSymbol("TACTIC-STORE");
        $kw93$REMOVAL_OUTPUT_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-OUTPUT-GENERATE");
        $sym94$HANDLE_REMOVAL_ADD_NODE_FOR_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-OUTPUT-GENERATE");
        $kw95$MAYBE_MAKE_REMOVAL_TACTIC_EXPAND_RESULTS_PROGRESS_ITERATOR = SubLObjectFactory.makeKeyword("MAYBE-MAKE-REMOVAL-TACTIC-EXPAND-RESULTS-PROGRESS-ITERATOR");
        $sym96$HANDLE_REMOVAL_ADD_NODE_FOR_EXPAND_RESULTS = SubLObjectFactory.makeSymbol("HANDLE-REMOVAL-ADD-NODE-FOR-EXPAND-RESULTS");
        $kw97$REMOVAL_EXPAND = SubLObjectFactory.makeKeyword("REMOVAL-EXPAND");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $str99$Ignoring_result_from__S_due_to_op = SubLObjectFactory.makeString("Ignoring result from ~S due to open supports");
        $sym100$PRODUCTIVITY__ = SubLObjectFactory.makeSymbol("PRODUCTIVITY-<");
        $sym101$TACTIC_PRODUCTIVITY = SubLObjectFactory.makeSymbol("TACTIC-PRODUCTIVITY");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-OUTPUT-ITERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym103$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym104$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym105$ITERATOR_P = SubLObjectFactory.makeSymbol("ITERATOR-P");
        $sym106$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym107$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym108$ITERATION_FINALIZE = SubLObjectFactory.makeSymbol("ITERATION-FINALIZE");
        $sym109$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $kw110$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = SubLObjectFactory.makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
        $kw111$HANDLE_ONE_OUTPUT_GENERATE_RESULT = SubLObjectFactory.makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-SUPPORTS"));
        $kw113$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str114$unknown_thing_to_do_in_the_HL_mod = SubLObjectFactory.makeString("unknown thing to do in the HL module guts: ~s");
    }
    
    public static final class $removal_link_data_native extends SubLStructNative
    {
        public SubLObject $hl_module;
        public SubLObject $bindings;
        public SubLObject $supports;
        private static final SubLStructDeclNative structDecl;
        
        public $removal_link_data_native() {
            this.$hl_module = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$removal_link_data_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hl_module;
        }
        
        public SubLObject getField3() {
            return this.$bindings;
        }
        
        public SubLObject getField4() {
            return this.$supports;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$supports = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$removal_link_data_native.class, inference_worker_removal.$sym0$REMOVAL_LINK_DATA, inference_worker_removal.$sym1$REMOVAL_LINK_DATA_P, inference_worker_removal.$list2, inference_worker_removal.$list3, new String[] { "$hl_module", "$bindings", "$supports" }, inference_worker_removal.$list4, inference_worker_removal.$list5, inference_worker_removal.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $removal_link_data_p$UnaryFunction extends UnaryFunction
    {
        public $removal_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LINK-DATA-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_removal.removal_link_data_p(arg1);
        }
    }
    
    public static final class $inference_remove_unify_default$UnaryFunction extends UnaryFunction
    {
        public $inference_remove_unify_default$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_removal.inference_remove_unify_default(arg1, (SubLObject)$inference_remove_unify_default$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $inference_remove_unify_default$BinaryFunction extends BinaryFunction
    {
        public $inference_remove_unify_default$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-REMOVE-UNIFY-DEFAULT"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return inference_worker_removal.inference_remove_unify_default(arg1, arg2);
        }
    }
}

/*

	Total time: 693 ms
	
*/