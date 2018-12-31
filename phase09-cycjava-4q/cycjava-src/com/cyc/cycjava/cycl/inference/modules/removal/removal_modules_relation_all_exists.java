package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_relation_all_exists extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists";
    public static final String myFingerPrint = "bdd842ab2577440d9d870e89fe38912d01a981d1ba0ef01115c02bac94187c3a";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3179L)
    private static SubLSymbol $estimated_per_collection_relation_all_exists_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 4183L)
    private static SubLSymbol $relation_all_exists_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 4439L)
    public static SubLSymbol $relation_all_exists_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 7260L)
    private static SubLSymbol $default_relation_all_exists_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 10336L)
    private static SubLSymbol $minimum_relation_all_exists_unify_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16463L)
    private static SubLSymbol $estimated_per_collection_relation_exists_all_count$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 17467L)
    private static SubLSymbol $relation_exists_all_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 17723L)
    public static SubLSymbol $relation_exists_all_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 20591L)
    private static SubLSymbol $default_relation_exists_all_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 23615L)
    private static SubLSymbol $minimum_relation_exists_all_unify_cost$;
    private static final SubLSymbol $kw0$RELATION_ALL_EXISTS_POS;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$PREFERRED;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$DISPREFERRED;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLObject $const9$relationAllExists;
    private static final SubLObject $const10$isa;
    private static final SubLObject $const11$RelationAllExistsFn;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_RELATION_ALL_EXISTS_DEFINING_MT_;
    private static final SubLObject $const14$BaseKB;
    private static final SubLSymbol $kw15$CODE;
    private static final SubLSymbol $kw16$TRUE_MON;
    private static final SubLSymbol $kw17$REMOVAL_RELATION_ALL_EXISTS_PRUNE;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$DEP_COL;
    private static final SubLSymbol $sym22$IND_COL;
    private static final SubLSymbol $sym23$RAE_PRED;
    private static final SubLSymbol $sym24$RAE_TERM;
    private static final SubLSymbol $sym25$TERM;
    private static final SubLSymbol $sym26$PREDICATE;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$POS;
    private static final SubLSymbol $kw29$GAF_ARG;
    private static final SubLSymbol $kw30$GAF;
    private static final SubLSymbol $kw31$PREDICATE_EXTENT;
    private static final SubLSymbol $kw32$OVERLAP;
    private static final SubLSymbol $kw33$REMOVAL_RELATION_ALL_EXISTS_CHECK;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$ISA;
    private static final SubLSymbol $kw36$TRUE;
    private static final SubLSymbol $kw37$REMOVAL_RELATION_ALL_EXISTS_UNIFY;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$RELATION_EXISTS_ALL_POS;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLObject $const42$relationExistsAll;
    private static final SubLObject $const43$RelationExistsAllFn;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$_RELATION_EXISTS_ALL_DEFINING_MT_;
    private static final SubLSymbol $kw46$REMOVAL_RELATION_EXISTS_ALL_PRUNE;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$REA_PRED;
    private static final SubLSymbol $sym51$REA_TERM;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$REMOVAL_RELATION_EXISTS_ALL_CHECK;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$REMOVAL_RELATION_EXISTS_ALL_UNIFY;
    private static final SubLList $list56;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 874L)
    public static SubLObject sbhl_isa_source_object_p(final SubLObject v_object) {
        return el_utilities.possibly_fo_represented_term_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 1653L)
    public static SubLObject relation_all_exists_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (removal_modules_relation_all_exists.NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL == removal_relation_all_exists_required(asent, (SubLObject)removal_modules_relation_all_exists.T)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list2)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list4)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw5$DISPREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list6)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list7)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list8)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw5$DISPREFERRED;
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 2495L)
    public static SubLObject removal_some_relation_all_exists_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == removal_modules_relation_all_exists.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, removal_modules_relation_all_exists.$const9$relationAllExists, mt, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 2754L)
    public static SubLObject removal_some_relation_all_exists_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == removal_modules_relation_all_exists.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != forts.fort_p(collection) && removal_modules_relation_all_exists.NIL != somewhere_cache.some_pred_assertion_somewhereP(removal_modules_relation_all_exists.$const9$relationAllExists, collection, (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, removal_modules_relation_all_exists.$const9$relationAllExists, mt, (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3036L)
    public static SubLObject relation_all_exists_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, removal_modules_relation_all_exists.$const9$relationAllExists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3320L)
    public static SubLObject relation_all_exists_collection_cost_estimate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.multiply(removal_modules_relation_all_exists.$estimated_per_collection_relation_all_exists_count$.getGlobalValue(), control_vars.$average_all_isa_count$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3498L)
    public static SubLObject removal_relation_all_exists_required(final SubLObject asent, final SubLObject require_new_terms_allowedP) {
        if (removal_modules_relation_all_exists.NIL != require_new_terms_allowedP && removal_modules_relation_all_exists.NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_relation_all_exists.$const10$isa.eql(predicate) || removal_modules_relation_all_exists.NIL == hl_supports.hl_predicate_p(predicate)) && (removal_modules_relation_all_exists.NIL == require_new_terms_allowedP || removal_modules_relation_all_exists.NIL != removal_modules_termofunit.skolemization_allowed(removal_modules_relation_all_exists.$const11$RelationAllExistsFn)) && removal_modules_relation_all_exists.NIL != removal_some_relation_all_exists_for_predicate(predicate, (SubLObject)removal_modules_relation_all_exists.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 4522L)
    public static SubLObject make_relation_all_exists_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw15$CODE, removal_modules_relation_all_exists.$relation_all_exists_rule$.getGlobalValue(), removal_modules_relation_all_exists.$relation_all_exists_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_relation_all_exists.$kw16$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 4679L)
    public static SubLObject make_relation_all_exists_term(final SubLObject v_object, final SubLObject predicate, final SubLObject indep_col, final SubLObject dep_col) {
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const11$RelationAllExistsFn, v_object, predicate, indep_col, dep_col));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 5345L)
    public static SubLObject removal_relation_all_exists_prune(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_relation_all_exists.$list19, asent)) {
            final SubLObject pattern = (SubLObject)removal_modules_relation_all_exists.$list20;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_relation_all_exists.NIL != success) {
                final SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym21$DEP_COL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym22$IND_COL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject rae_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym23$RAE_PRED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject rae_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym24$RAE_TERM, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym25$TERM, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym26$PREDICATE, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                if (!rae_pred.eql(predicate)) {
                    return (SubLObject)removal_modules_relation_all_exists.T;
                }
                if (removal_modules_relation_all_exists.NIL == unification.unify_possible(rae_term, v_term)) {
                    return (SubLObject)removal_modules_relation_all_exists.T;
                }
            }
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_relation_all_exists.$list27, asent)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return (SubLObject)removal_modules_relation_all_exists.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 6238L)
    public static SubLObject removal_relation_all_exists_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != removal_relation_all_exists_required(asent, (SubLObject)removal_modules_relation_all_exists.NIL)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject functor = el_utilities.unmake_quaternary_formula(arg2);
            final SubLObject v_term = thread.secondMultipleValue();
            final SubLObject pred = thread.thirdMultipleValue();
            final SubLObject indep_col = thread.fourthMultipleValue();
            final SubLObject dep_col = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(pred.eql(cycl_utilities.atomic_sentence_predicate(asent)) && arg1.equal(v_term));
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 7364L)
    public static SubLObject removal_relation_all_exists_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject functor = el_utilities.unmake_quaternary_formula(arg2);
        final SubLObject v_term = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject indep_col = thread.fourthMultipleValue();
        final SubLObject dep_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rae_sentence = el_utilities.list_to_elf((SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const9$relationAllExists, pred, indep_col, dep_col));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rae_sentence, (SubLObject)removal_modules_relation_all_exists.$kw28$POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw29$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$1 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_relation_all_exists.NIL != argnum) {
                if (removal_modules_relation_all_exists.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_relation_all_exists.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                        if (removal_modules_relation_all_exists.NIL != valid_$4) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_relation_all_exists.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$3 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$3) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                        if (removal_modules_relation_all_exists.NIL != valid_$5) {
                                            removal_relation_all_exists_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_relation_all_exists.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_relation_all_exists.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$4 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$5 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                    if (removal_modules_relation_all_exists.NIL != valid_$6) {
                                        removal_relation_all_exists_check_expand_internal(asent, assertion);
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$1, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$1, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_relation_all_exists.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$5 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$6 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$5) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion));
                                    if (removal_modules_relation_all_exists.NIL != valid_$7) {
                                        removal_relation_all_exists_check_expand_internal(asent, assertion);
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw31$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_relation_all_exists.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_relation_all_exists.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_relation_all_exists.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_relation_all_exists.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$6 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$7 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$6) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                    final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(assertion2));
                                    if (removal_modules_relation_all_exists.NIL != valid_$8) {
                                        removal_relation_all_exists_check_expand_internal(asent, assertion2);
                                    }
                                    done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$8);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw32$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_relation_all_exists.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_relation_all_exists.NIL != cdolist_list_var) {
                if (removal_modules_relation_all_exists.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS) || removal_modules_relation_all_exists.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS))) {
                    removal_relation_all_exists_check_expand_internal(asent, assertion3);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 8749L)
    public static SubLObject removal_relation_all_exists_check_expand_internal(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (removal_modules_relation_all_exists.NIL != el_utilities.formula_arityE(gaf_formula, (SubLObject)removal_modules_relation_all_exists.THREE_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
                final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = el_utilities.unmake_quaternary_formula(arg2);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject indep_col = thread.fourthMultipleValue();
                final SubLObject dep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject relation_all_exists = el_utilities.unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                final SubLObject gaf_pred = thread.secondMultipleValue();
                final SubLObject gaf_indep_col = thread.thirdMultipleValue();
                final SubLObject gaf_dep_col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (pred.eql(gaf_pred) && indep_col.equal(gaf_indep_col) && dep_col.equal(gaf_dep_col) && removal_modules_relation_all_exists.NIL != isa.isaP(v_term, indep_col, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
                    final SubLObject rule_support = make_relation_all_exists_support();
                    final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw35$ISA, (SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const10$isa, v_term, indep_col), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                    final SubLObject more_supports = (SubLObject)ConsesLow.list(rule_support, isa_support);
                    backward.removal_add_node(assertion, (SubLObject)removal_modules_relation_all_exists.NIL, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 9785L)
    public static SubLObject removal_relation_all_exists_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != removal_relation_all_exists_required(asent, (SubLObject)removal_modules_relation_all_exists.T)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            return sbhl_isa_source_object_p(arg1);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 10440L)
    public static SubLObject removal_relation_all_exists_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_exists_predicate_cost_estimate(predicate);
        final SubLObject adjusted_predicate_cost_estimate = Numbers.round(Numbers.sqrt(predicate_cost_estimate), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        return Numbers.max(removal_modules_relation_all_exists.$minimum_relation_all_exists_unify_cost$.getGlobalValue(), adjusted_predicate_cost_estimate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 11044L)
    public static SubLObject removal_relation_all_exists_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_exists_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_all_exists_collection_cost_estimate(v_term);
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = removal_modules_relation_all_exists.$const9$relationAllExists;
            if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                while (removal_modules_relation_all_exists.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_relation_all_exists.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, (SubLObject)removal_modules_relation_all_exists.$kw36$TRUE, (SubLObject)removal_modules_relation_all_exists.NIL);
                            SubLObject done_var_$18 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            final SubLObject token_var_$19 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            while (removal_modules_relation_all_exists.NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                if (removal_modules_relation_all_exists.NIL != valid_$20) {
                                    removal_relation_all_exists_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$20);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all_exists.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                }
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_term, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            SubLObject collection = (SubLObject)removal_modules_relation_all_exists.NIL;
            collection = cdolist_list_var.first();
            while (removal_modules_relation_all_exists.NIL != cdolist_list_var) {
                if (removal_modules_relation_all_exists.NIL != removal_some_relation_all_exists_for_collection(collection, (SubLObject)removal_modules_relation_all_exists.NIL)) {
                    final SubLObject pred_var2 = removal_modules_relation_all_exists.$const9$relationAllExists;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_relation_all_exists.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, (SubLObject)removal_modules_relation_all_exists.$kw36$TRUE, (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$19 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$20 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$19) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$20);
                                        final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(assertion2));
                                        if (removal_modules_relation_all_exists.NIL != valid_$21) {
                                            removal_relation_all_exists_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$21);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all_exists.T);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 12865L)
    public static SubLObject removal_relation_all_exists_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg2(assertion);
        if (removal_modules_relation_all_exists.NIL == isa.isaP(arg1, collection, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return removal_relation_all_exists_unify_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 13288L)
    public static SubLObject removal_relation_all_exists_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return removal_relation_all_exists_unify_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 13674L)
    public static SubLObject removal_relation_all_exists_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            final SubLObject indep_col = assertions_high.gaf_arg2(assertion);
            final SubLObject dep_col = assertions_high.gaf_arg3(assertion);
            final SubLObject exists_term = make_relation_all_exists_term(v_term, predicate, indep_col, dep_col);
            if (removal_modules_relation_all_exists.NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg2, exists_term, (SubLObject)removal_modules_relation_all_exists.T, (SubLObject)removal_modules_relation_all_exists.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_relation_all_exists.NIL != v_bindings) {
                    final SubLObject rule_support = make_relation_all_exists_support();
                    final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw35$ISA, (SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const10$isa, v_term, indep_col), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                    final SubLObject more_supports = ConsesLow.append((SubLObject)ConsesLow.list(rule_support, isa_support), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 15016L)
    public static SubLObject relation_exists_all_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (removal_modules_relation_all_exists.NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL == removal_relation_exists_all_required(asent, (SubLObject)removal_modules_relation_all_exists.T)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list2)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list41)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw5$DISPREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list7)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list6)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw3$PREFERRED;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.formula_matches_pattern(asent, (SubLObject)removal_modules_relation_all_exists.$list8)) {
            return (SubLObject)removal_modules_relation_all_exists.$kw5$DISPREFERRED;
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 15858L)
    public static SubLObject removal_some_relation_exists_all_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == removal_modules_relation_all_exists.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, removal_modules_relation_all_exists.$const42$relationExistsAll, mt, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16117L)
    public static SubLObject removal_some_relation_exists_all_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == removal_modules_relation_all_exists.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, removal_modules_relation_all_exists.$const42$relationExistsAll, mt, (SubLObject)removal_modules_relation_all_exists.THREE_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16319L)
    public static SubLObject relation_exists_all_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, removal_modules_relation_all_exists.$const42$relationExistsAll);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16604L)
    public static SubLObject relation_exists_all_collection_cost_estimate(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.multiply(removal_modules_relation_all_exists.$estimated_per_collection_relation_exists_all_count$.getGlobalValue(), control_vars.$average_all_isa_count$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16782L)
    public static SubLObject removal_relation_exists_all_required(final SubLObject asent, final SubLObject require_new_terms_allowedP) {
        if (removal_modules_relation_all_exists.NIL != require_new_terms_allowedP && removal_modules_relation_all_exists.NIL == removal_module_utilities.current_query_allows_new_termsP()) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_relation_all_exists.$const10$isa.eql(predicate) || removal_modules_relation_all_exists.NIL == hl_supports.hl_predicate_p(predicate)) && (removal_modules_relation_all_exists.NIL == require_new_terms_allowedP || removal_modules_relation_all_exists.NIL != removal_modules_termofunit.skolemization_allowed(removal_modules_relation_all_exists.$const43$RelationExistsAllFn)) && removal_modules_relation_all_exists.NIL != removal_some_relation_exists_all_for_predicate(predicate, (SubLObject)removal_modules_relation_all_exists.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 17806L)
    public static SubLObject make_relation_exists_all_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw15$CODE, removal_modules_relation_all_exists.$relation_exists_all_rule$.getGlobalValue(), removal_modules_relation_all_exists.$relation_exists_all_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_relation_all_exists.$kw16$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 17963L)
    public static SubLObject make_relation_exists_all_term(final SubLObject v_object, final SubLObject predicate, final SubLObject dep_col, final SubLObject indep_col) {
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const43$RelationExistsAllFn, v_object, predicate, dep_col, indep_col));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 18629L)
    public static SubLObject removal_relation_exists_all_prune(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_relation_all_exists.$list48, asent)) {
            final SubLObject pattern = (SubLObject)removal_modules_relation_all_exists.$list49;
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_relation_all_exists.NIL != success) {
                final SubLObject dep_col = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym21$DEP_COL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject ind_col = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym22$IND_COL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject rea_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym50$REA_PRED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject rea_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym51$REA_TERM, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym25$TERM, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                final SubLObject predicate = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_relation_all_exists.$sym26$PREDICATE, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                if (!rea_pred.eql(predicate)) {
                    return (SubLObject)removal_modules_relation_all_exists.T;
                }
                if (removal_modules_relation_all_exists.NIL == unification.unify_possible(rea_term, v_term)) {
                    return (SubLObject)removal_modules_relation_all_exists.T;
                }
            }
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != formula_pattern_match.pattern_matches_formula((SubLObject)removal_modules_relation_all_exists.$list52, asent)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return (SubLObject)removal_modules_relation_all_exists.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 19531L)
    public static SubLObject removal_relation_exists_all_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != removal_relation_exists_all_required(asent, (SubLObject)removal_modules_relation_all_exists.NIL)) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            if (removal_modules_relation_all_exists.NIL != sbhl_isa_source_object_p(arg2)) {
                final SubLObject arg3 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = el_utilities.unmake_quaternary_formula(arg3);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject dep_col = thread.fourthMultipleValue();
                final SubLObject indep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                return (SubLObject)SubLObjectFactory.makeBoolean(pred.eql(cycl_utilities.atomic_sentence_predicate(asent)) && arg2.equal(v_term));
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 20695L)
    public static SubLObject removal_relation_exists_all_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject functor = el_utilities.unmake_quaternary_formula(arg1);
        final SubLObject v_term = thread.secondMultipleValue();
        final SubLObject pred = thread.thirdMultipleValue();
        final SubLObject dep_col = thread.fourthMultipleValue();
        final SubLObject indep_col = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject rea_sentence = el_utilities.list_to_elf((SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const42$relationExistsAll, pred, dep_col, indep_col));
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(rea_sentence, (SubLObject)removal_modules_relation_all_exists.$kw28$POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw29$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term_$24 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_relation_all_exists.NIL != argnum) {
                if (removal_modules_relation_all_exists.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_relation_all_exists.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$25 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$26 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$25) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                        final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                                        if (removal_modules_relation_all_exists.NIL != valid_$27) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$27);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_relation_all_exists.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$26 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$27 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$26) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                        final SubLObject valid_$28 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$27.eql(assertion));
                                        if (removal_modules_relation_all_exists.NIL != valid_$28) {
                                            removal_relation_exists_all_check_expand_internal(asent, assertion);
                                        }
                                        done_var_$26 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$28);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_relation_all_exists.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_relation_all_exists.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$27 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$28 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$27) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                                    final SubLObject valid_$29 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$28.eql(assertion));
                                    if (removal_modules_relation_all_exists.NIL != valid_$29) {
                                        removal_relation_exists_all_check_expand_internal(asent, assertion);
                                    }
                                    done_var_$27 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$29);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term_$24, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term_$24, (SubLObject)removal_modules_relation_all_exists.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_relation_all_exists.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$28 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$29 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$28) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(assertion));
                                    if (removal_modules_relation_all_exists.NIL != valid_$30) {
                                        removal_relation_exists_all_check_expand_internal(asent, assertion);
                                    }
                                    done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$30);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw31$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_relation_all_exists.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_relation_all_exists.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_relation_all_exists.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_relation_all_exists.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                    while (removal_modules_relation_all_exists.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_relation_all_exists.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS), (SubLObject)removal_modules_relation_all_exists.NIL);
                                SubLObject done_var_$29 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                final SubLObject token_var_$30 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                while (removal_modules_relation_all_exists.NIL == done_var_$29) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$30);
                                    final SubLObject valid_$31 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$30.eql(assertion2));
                                    if (removal_modules_relation_all_exists.NIL != valid_$31) {
                                        removal_relation_exists_all_check_expand_internal(asent, assertion2);
                                    }
                                    done_var_$29 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$31);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all_exists.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_relation_all_exists.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_relation_all_exists.$kw32$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_relation_all_exists.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_relation_all_exists.NIL != cdolist_list_var) {
                if (removal_modules_relation_all_exists.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS) || removal_modules_relation_all_exists.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_relation_all_exists.$kw28$POS))) {
                    removal_relation_exists_all_check_expand_internal(asent, assertion3);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 22055L)
    public static SubLObject removal_relation_exists_all_check_expand_internal(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (removal_modules_relation_all_exists.NIL != el_utilities.formula_arityE(gaf_formula, (SubLObject)removal_modules_relation_all_exists.THREE_INTEGER, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
                final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject functor = el_utilities.unmake_quaternary_formula(arg1);
                final SubLObject v_term = thread.secondMultipleValue();
                final SubLObject pred = thread.thirdMultipleValue();
                final SubLObject dep_col = thread.fourthMultipleValue();
                final SubLObject indep_col = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject relation_exists_all = el_utilities.unmake_ternary_formula(assertions_high.gaf_formula(assertion));
                final SubLObject gaf_pred = thread.secondMultipleValue();
                final SubLObject gaf_dep_col = thread.thirdMultipleValue();
                final SubLObject gaf_indep_col = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (pred.eql(gaf_pred) && indep_col.equal(gaf_indep_col) && dep_col.equal(gaf_dep_col) && removal_modules_relation_all_exists.NIL != isa.isaP(v_term, indep_col, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
                    final SubLObject rule_support = make_relation_exists_all_support();
                    final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw35$ISA, (SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const10$isa, v_term, indep_col), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                    final SubLObject more_supports = (SubLObject)ConsesLow.list(rule_support, isa_support);
                    backward.removal_add_node(assertion, (SubLObject)removal_modules_relation_all_exists.NIL, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 23091L)
    public static SubLObject removal_relation_exists_all_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        if (removal_modules_relation_all_exists.NIL != removal_relation_exists_all_required(asent, (SubLObject)removal_modules_relation_all_exists.T)) {
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            return sbhl_isa_source_object_p(arg2);
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 23719L)
    public static SubLObject removal_relation_exists_all_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_exists_all_predicate_cost_estimate(predicate);
        final SubLObject adjusted_predicate_cost_estimate = Numbers.round(Numbers.sqrt(predicate_cost_estimate), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        return Numbers.max(removal_modules_relation_all_exists.$minimum_relation_exists_all_unify_cost$.getGlobalValue(), adjusted_predicate_cost_estimate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 24321L)
    public static SubLObject removal_relation_exists_all_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all_exists.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_exists_all_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_exists_all_collection_cost_estimate(v_term);
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = removal_modules_relation_all_exists.$const42$relationExistsAll;
            if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_relation_all_exists.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_relation_all_exists.NIL;
                while (removal_modules_relation_all_exists.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_relation_all_exists.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all_exists.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, (SubLObject)removal_modules_relation_all_exists.$kw36$TRUE, (SubLObject)removal_modules_relation_all_exists.NIL);
                            SubLObject done_var_$41 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            final SubLObject token_var_$42 = (SubLObject)removal_modules_relation_all_exists.NIL;
                            while (removal_modules_relation_all_exists.NIL == done_var_$41) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                                final SubLObject valid_$43 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$42.eql(assertion));
                                if (removal_modules_relation_all_exists.NIL != valid_$43) {
                                    removal_relation_exists_all_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$41 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$43);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all_exists.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_relation_all_exists.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid);
                }
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_term, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            SubLObject collection = (SubLObject)removal_modules_relation_all_exists.NIL;
            collection = cdolist_list_var.first();
            while (removal_modules_relation_all_exists.NIL != cdolist_list_var) {
                if (removal_modules_relation_all_exists.NIL != removal_some_relation_exists_all_for_collection(collection, (SubLObject)removal_modules_relation_all_exists.NIL)) {
                    final SubLObject pred_var2 = removal_modules_relation_all_exists.$const42$relationExistsAll;
                    if (removal_modules_relation_all_exists.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)removal_modules_relation_all_exists.THREE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)removal_modules_relation_all_exists.THREE_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                        while (removal_modules_relation_all_exists.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_relation_all_exists.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_relation_all_exists.$kw30$GAF, (SubLObject)removal_modules_relation_all_exists.$kw36$TRUE, (SubLObject)removal_modules_relation_all_exists.NIL);
                                    SubLObject done_var_$42 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    final SubLObject token_var_$43 = (SubLObject)removal_modules_relation_all_exists.NIL;
                                    while (removal_modules_relation_all_exists.NIL == done_var_$42) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$43);
                                        final SubLObject valid_$44 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$43.eql(assertion2));
                                        if (removal_modules_relation_all_exists.NIL != valid_$44) {
                                            removal_relation_exists_all_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$42 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid_$44);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all_exists.T);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_relation_all_exists.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all_exists.NIL == valid2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 26094L)
    public static SubLObject removal_relation_exists_all_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg3(assertion);
        if (removal_modules_relation_all_exists.NIL == isa.isaP(v_object, collection, (SubLObject)removal_modules_relation_all_exists.NIL, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED)) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return removal_relation_exists_all_unify_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 26523L)
    public static SubLObject removal_relation_exists_all_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return (SubLObject)removal_modules_relation_all_exists.NIL;
        }
        return removal_relation_exists_all_unify_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 26909L)
    public static SubLObject removal_relation_exists_all_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_relation_all_exists.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            final SubLObject v_term = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
            final SubLObject dep_col = assertions_high.gaf_arg2(assertion);
            final SubLObject indep_col = assertions_high.gaf_arg3(assertion);
            final SubLObject exists_term = make_relation_exists_all_term(v_term, predicate, dep_col, indep_col);
            if (removal_modules_relation_all_exists.NIL != function_terms.within_term_functional_complexity_cutoffP(exists_term)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, exists_term, (SubLObject)removal_modules_relation_all_exists.T, (SubLObject)removal_modules_relation_all_exists.T);
                final SubLObject unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_relation_all_exists.NIL != v_bindings) {
                    final SubLObject rule_support = make_relation_exists_all_support();
                    final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_relation_all_exists.$kw35$ISA, (SubLObject)ConsesLow.list(removal_modules_relation_all_exists.$const10$isa, v_term, indep_col), (SubLObject)removal_modules_relation_all_exists.UNPROVIDED, (SubLObject)removal_modules_relation_all_exists.UNPROVIDED);
                    final SubLObject more_supports = ConsesLow.append((SubLObject)ConsesLow.list(rule_support, isa_support), unify_justification);
                    backward.removal_add_node(assertion, v_bindings, more_supports);
                }
            }
        }
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    public static SubLObject declare_removal_modules_relation_all_exists_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "sbhl_isa_source_object_p", "SBHL-ISA-SOURCE-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_all_exists_pos_preference", "RELATION-ALL-EXISTS-POS-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_some_relation_all_exists_for_predicate", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_some_relation_all_exists_for_collection", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_all_exists_predicate_cost_estimate", "RELATION-ALL-EXISTS-PREDICATE-COST-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_all_exists_collection_cost_estimate", "RELATION-ALL-EXISTS-COLLECTION-COST-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_required", "REMOVAL-RELATION-ALL-EXISTS-REQUIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "make_relation_all_exists_support", "MAKE-RELATION-ALL-EXISTS-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "make_relation_all_exists_term", "MAKE-RELATION-ALL-EXISTS-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_prune", "REMOVAL-RELATION-ALL-EXISTS-PRUNE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_check_required", "REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_check_expand", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_check_expand_internal", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_required", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED", 1, 1, false);
        new $removal_relation_all_exists_unify_required$UnaryFunction();
        new $removal_relation_all_exists_unify_required$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_cost", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_via_predicate_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_via_collection_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_all_exists_unify_expand_guts", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_exists_all_pos_preference", "RELATION-EXISTS-ALL-POS-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_some_relation_exists_all_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_some_relation_exists_all_for_collection", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_exists_all_predicate_cost_estimate", "RELATION-EXISTS-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "relation_exists_all_collection_cost_estimate", "RELATION-EXISTS-ALL-COLLECTION-COST-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_required", "REMOVAL-RELATION-EXISTS-ALL-REQUIRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "make_relation_exists_all_support", "MAKE-RELATION-EXISTS-ALL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "make_relation_exists_all_term", "MAKE-RELATION-EXISTS-ALL-TERM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_prune", "REMOVAL-RELATION-EXISTS-ALL-PRUNE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_check_required", "REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_check_expand", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_check_expand_internal", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_required", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED", 1, 1, false);
        new $removal_relation_exists_all_unify_required$UnaryFunction();
        new $removal_relation_exists_all_unify_required$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_cost", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_via_collection_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_exists", "removal_relation_exists_all_unify_expand_guts", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND-GUTS", 2, 0, false);
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    public static SubLObject init_removal_modules_relation_all_exists_file() {
        removal_modules_relation_all_exists.$estimated_per_collection_relation_all_exists_count$ = SubLFiles.deflexical("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*", (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER);
        removal_modules_relation_all_exists.$relation_all_exists_rule$ = SubLFiles.deflexical("*RELATION-ALL-EXISTS-RULE*", el_utilities.list_to_elf((SubLObject)removal_modules_relation_all_exists.$list12));
        removal_modules_relation_all_exists.$relation_all_exists_defining_mt$ = SubLFiles.deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", (removal_modules_relation_all_exists.NIL != Symbols.boundp((SubLObject)removal_modules_relation_all_exists.$sym13$_RELATION_ALL_EXISTS_DEFINING_MT_)) ? removal_modules_relation_all_exists.$relation_all_exists_defining_mt$.getGlobalValue() : removal_modules_relation_all_exists.$const14$BaseKB);
        removal_modules_relation_all_exists.$default_relation_all_exists_check_cost$ = SubLFiles.deflexical("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_relation_all_exists.$minimum_relation_all_exists_unify_cost$ = SubLFiles.deflexical("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_relation_all_exists.$estimated_per_collection_relation_exists_all_count$ = SubLFiles.deflexical("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*", (SubLObject)removal_modules_relation_all_exists.TWO_INTEGER);
        removal_modules_relation_all_exists.$relation_exists_all_rule$ = SubLFiles.deflexical("*RELATION-EXISTS-ALL-RULE*", el_utilities.list_to_elf((SubLObject)removal_modules_relation_all_exists.$list44));
        removal_modules_relation_all_exists.$relation_exists_all_defining_mt$ = SubLFiles.deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", (removal_modules_relation_all_exists.NIL != Symbols.boundp((SubLObject)removal_modules_relation_all_exists.$sym45$_RELATION_EXISTS_ALL_DEFINING_MT_)) ? removal_modules_relation_all_exists.$relation_exists_all_defining_mt$.getGlobalValue() : removal_modules_relation_all_exists.$const14$BaseKB);
        removal_modules_relation_all_exists.$default_relation_exists_all_check_cost$ = SubLFiles.deflexical("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        removal_modules_relation_all_exists.$minimum_relation_exists_all_unify_cost$ = SubLFiles.deflexical("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    public static SubLObject setup_removal_modules_relation_all_exists_file() {
        preference_modules.inference_preference_module((SubLObject)removal_modules_relation_all_exists.$kw0$RELATION_ALL_EXISTS_POS, (SubLObject)removal_modules_relation_all_exists.$list1);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_relation_all_exists.$sym13$_RELATION_ALL_EXISTS_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_relation_all_exists.$sym13$_RELATION_ALL_EXISTS_DEFINING_MT_, removal_modules_relation_all_exists.$const9$relationAllExists);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw17$REMOVAL_RELATION_ALL_EXISTS_PRUNE, (SubLObject)removal_modules_relation_all_exists.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw33$REMOVAL_RELATION_ALL_EXISTS_CHECK, (SubLObject)removal_modules_relation_all_exists.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw37$REMOVAL_RELATION_ALL_EXISTS_UNIFY, (SubLObject)removal_modules_relation_all_exists.$list38);
        preference_modules.inference_preference_module((SubLObject)removal_modules_relation_all_exists.$kw39$RELATION_EXISTS_ALL_POS, (SubLObject)removal_modules_relation_all_exists.$list40);
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_relation_all_exists.$sym45$_RELATION_EXISTS_ALL_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_relation_all_exists.$sym45$_RELATION_EXISTS_ALL_DEFINING_MT_, removal_modules_relation_all_exists.$const42$relationExistsAll);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw46$REMOVAL_RELATION_EXISTS_ALL_PRUNE, (SubLObject)removal_modules_relation_all_exists.$list47);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw53$REMOVAL_RELATION_EXISTS_ALL_CHECK, (SubLObject)removal_modules_relation_all_exists.$list54);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all_exists.$kw55$REMOVAL_RELATION_EXISTS_ALL_UNIFY, (SubLObject)removal_modules_relation_all_exists.$list56);
        return (SubLObject)removal_modules_relation_all_exists.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_relation_all_exists_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_relation_all_exists_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_relation_all_exists_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_relation_all_exists();
        removal_modules_relation_all_exists.$estimated_per_collection_relation_all_exists_count$ = null;
        removal_modules_relation_all_exists.$relation_all_exists_rule$ = null;
        removal_modules_relation_all_exists.$relation_all_exists_defining_mt$ = null;
        removal_modules_relation_all_exists.$default_relation_all_exists_check_cost$ = null;
        removal_modules_relation_all_exists.$minimum_relation_all_exists_unify_cost$ = null;
        removal_modules_relation_all_exists.$estimated_per_collection_relation_exists_all_count$ = null;
        removal_modules_relation_all_exists.$relation_exists_all_rule$ = null;
        removal_modules_relation_all_exists.$relation_exists_all_defining_mt$ = null;
        removal_modules_relation_all_exists.$default_relation_exists_all_check_cost$ = null;
        removal_modules_relation_all_exists.$minimum_relation_exists_all_unify_cost$ = null;
        $kw0$RELATION_ALL_EXISTS_POS = SubLObjectFactory.makeKeyword("RELATION-ALL-EXISTS-POS");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION-ALL-EXISTS-POS-PREFERENCE"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $kw3$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")));
        $kw5$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $const9$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const11$RelationAllExistsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn"));
        $list12 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"))));
        $sym13$_RELATION_ALL_EXISTS_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*RELATION-ALL-EXISTS-DEFINING-MT*");
        $const14$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw15$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw16$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw17$REMOVAL_RELATION_ALL_EXISTS_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-PRUNE");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-PRUNE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_relation_all_exists.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString(""), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RAE-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RAE-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("IND-COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DEP-COL"))));
        $sym21$DEP_COL = SubLObjectFactory.makeSymbol("DEP-COL");
        $sym22$IND_COL = SubLObjectFactory.makeSymbol("IND-COL");
        $sym23$RAE_PRED = SubLObjectFactory.makeSymbol("RAE-PRED");
        $sym24$RAE_TERM = SubLObjectFactory.makeSymbol("RAE-TERM");
        $sym25$TERM = SubLObjectFactory.makeSymbol("TERM");
        $sym26$PREDICATE = SubLObjectFactory.makeSymbol("PREDICATE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw28$POS = SubLObjectFactory.makeKeyword("POS");
        $kw29$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw30$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw31$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw32$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw33$REMOVAL_RELATION_ALL_EXISTS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_relation_all_exists.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <object>\n  (#$RelationAllExistsFn <object> <predicate> <indep-col> <dep-col>)) \nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>)\nand  (#$isa <object> <indep-col>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$grandfathers #$AbrahamLincoln \n  (#$RelationAllExistsFn #$AbrahamLincoln #$grandfathers #$Animal #$MaleAnimal))\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });
        $kw35$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw36$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw37$REMOVAL_RELATION_ALL_EXISTS_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_relation_all_exists.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationAllExistsFn")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <object> <not fully-bound>)\nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>) \nand (#$isa <object> <indep-col>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$grandfathers #$AbrahamLincoln ?RELATIVE)\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)") });
        $kw39$RELATION_EXISTS_ALL_POS = SubLObjectFactory.makeKeyword("RELATION-EXISTS-ALL-POS");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RELATION-EXISTS-ALL-POS-PREFERENCE"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"));
        $const42$relationExistsAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll"));
        $const43$RelationExistsAllFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn"));
        $list44 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationExistsAll")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?DEP-COL"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEP-COL")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM")));
        $sym45$_RELATION_EXISTS_ALL_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*RELATION-EXISTS-ALL-DEFINING-MT*");
        $kw46$REMOVAL_RELATION_EXISTS_ALL_PRUNE = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-ALL-PRUNE");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-PRUNE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_relation_all_exists.ZERO_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString(""), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REA-TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("REA-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DEP-COL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("IND-COL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")));
        $sym50$REA_PRED = SubLObjectFactory.makeSymbol("REA-PRED");
        $sym51$REA_TERM = SubLObjectFactory.makeSymbol("REA-TERM");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")));
        $kw53$REMOVAL_RELATION_EXISTS_ALL_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_relation_all_exists.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> (#$RelationExistsAllFn <object> <predicate> <dep-col> <indep-col>) <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$citizens (#$RelationExistsAllFn #$AbrahamLincoln #$citizens #$Country #$Person)\n  #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });
        $kw55$REMOVAL_RELATION_EXISTS_ALL_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY");
        $list56 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_relation_all_exists.TWO_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAT"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationExistsAllFn")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <not fully-bound> <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$citizens ?WHERE #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)") });
    }
    
    public static final class $removal_relation_all_exists_unify_required$UnaryFunction extends UnaryFunction
    {
        public $removal_relation_all_exists_unify_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_relation_all_exists.removal_relation_all_exists_unify_required(arg1, (SubLObject)$removal_relation_all_exists_unify_required$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_relation_all_exists_unify_required$BinaryFunction extends BinaryFunction
    {
        public $removal_relation_all_exists_unify_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_relation_all_exists.removal_relation_all_exists_unify_required(arg1, arg2);
        }
    }
    
    public static final class $removal_relation_exists_all_unify_required$UnaryFunction extends UnaryFunction
    {
        public $removal_relation_exists_all_unify_required$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_relation_all_exists.removal_relation_exists_all_unify_required(arg1, (SubLObject)$removal_relation_exists_all_unify_required$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_relation_exists_all_unify_required$BinaryFunction extends BinaryFunction
    {
        public $removal_relation_exists_all_unify_required$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_relation_all_exists.removal_relation_exists_all_unify_required(arg1, arg2);
        }
    }
}

/*

	Total time: 749 ms
	
*/