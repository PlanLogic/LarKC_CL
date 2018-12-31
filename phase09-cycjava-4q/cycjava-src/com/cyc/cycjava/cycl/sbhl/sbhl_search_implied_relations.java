package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_search_implied_relations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations";
    public static final String myFingerPrint = "0bda550147e5bedd93df5433259921dfa108d26107441a2332dc934eadb91172";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 15618L)
    private static SubLSymbol $use_fast_sbhl_sibling_disjoint_any_boolean_fnP$;
    private static final SubLSymbol $sym0$SBHL_MODULE_P;
    private static final SubLObject $const1$genls;
    private static final SubLSymbol $sym2$ALL_SDC;
    private static final SubLSymbol $sym3$MAX_SDC;
    private static final SubLSymbol $sym4$SDC_;
    private static final SubLSymbol $sym5$ANY_SDC_WRT_;
    private static final SubLSymbol $sym6$ANY_SDC_ANY_;
    private static final SubLSymbol $sym7$WHY_SDC_;
    private static final SubLSymbol $sym8$SBHL_GATHER_ALL_DISJOINS;
    private static final SubLObject $const9$True_JustificationTruth;
    private static final SubLSymbol $kw10$OLD;
    private static final SubLSymbol $kw11$RESOURCE;
    private static final SubLSymbol $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw13$ERROR;
    private static final SubLString $str14$_A_is_not_a__A;
    private static final SubLSymbol $sym15$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw16$CERROR;
    private static final SubLString $str17$continue_anyway;
    private static final SubLSymbol $kw18$WARN;
    private static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str20$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str21$attempting_to_bind_direction_link;
    private static final SubLString $str22$Method_only_valid_for_simple_and_;
    private static final SubLSymbol $kw23$BOOLEAN;
    private static final SubLSymbol $sym24$SBHL_NODE_IS_GOAL_NODE;
    private static final SubLObject $const25$negationInverse;
    private static final SubLSymbol $sym26$SBHL_NODE_MARKED_AS_GOAL_NODE;
    private static final SubLSymbol $sym27$SBHL_PREDICATE_RELATION_P;
    private static final SubLString $str28$Method_only_valid_for_disjoins_mo;
    private static final SubLString $str29$Boolean_methods_using_ALL_are_cur;
    private static final SubLSymbol $sym30$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P;
    private static final SubLSymbol $sym31$SBHL_IMPLIED_FALSE_INVERSE_RELATION_P;
    private static final SubLSymbol $sym32$SBHL_IMPLIED_DISJOINS_RELATION_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 989L)
    public static SubLObject get_sbhl_sibling_disjoint_closure_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym2$ALL_SDC;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 1356L)
    public static SubLObject sbhl_all_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_closure_fn = get_sbhl_sibling_disjoint_closure_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_closure_fn) {
            result = Functions.funcall(sd_closure_fn, node, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 1741L)
    public static SubLObject get_sbhl_sibling_disjoint_max_nodes_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym3$MAX_SDC;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2031L)
    public static SubLObject sbhl_max_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_max_fn = get_sbhl_sibling_disjoint_max_nodes_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_max_fn) {
            result = Functions.funcall(sd_max_fn, node, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2406L)
    public static SubLObject get_sbhl_sibling_disjoint_boolean_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym4$SDC_;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2750L)
    public static SubLObject sbhl_sibling_disjoint_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_boolean_fn) {
            result = Functions.funcall(sd_boolean_fn, node1, node2, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 3150L)
    public static SubLObject get_sbhl_sibling_disjoint_any_boolean_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym5$ANY_SDC_WRT_;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 3447L)
    public static SubLObject sbhl_any_with_sibling_disjoint_relation_p(final SubLObject module, final SubLObject nodes1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_any_boolean_fn = get_sbhl_sibling_disjoint_any_boolean_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_any_boolean_fn) {
            result = Functions.funcall(sd_any_boolean_fn, nodes1, node2, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 3874L)
    public static SubLObject get_sbhl_sibling_disjoint_any_boolean_any_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym6$ANY_SDC_ANY_;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 4175L)
    public static SubLObject sbhl_sibling_disjoint_relation_between_any_p(final SubLObject module, final SubLObject nodes1, final SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_any_boolean_any_fn = get_sbhl_sibling_disjoint_any_boolean_any_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_any_boolean_any_fn) {
            result = Functions.funcall(sd_any_boolean_any_fn, nodes1, nodes2, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 4623L)
    public static SubLObject get_sbhl_sibling_disjoint_justification_fn(final SubLObject module) {
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
        if (pcase_var.eql(sbhl_search_implied_relations.$const1$genls)) {
            return (SubLObject)sbhl_search_implied_relations.$sym7$WHY_SDC_;
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 4937L)
    public static SubLObject sbhl_sibling_disjoint_justification(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_just_fn) {
            result = Functions.funcall(sd_just_fn, node1, node2, mt);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 5337L)
    public static SubLObject sbhl_disjoins_of_backward_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_mapping_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.bind(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                            sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                            try {
                                result = sbhl_search_methods.sbhl_gather_all_backward_true_nodes(module, node, (SubLObject)sbhl_search_implied_relations.$sym8$SBHL_GATHER_ALL_DISJOINS, mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                            }
                            finally {
                                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_4, thread);
                            sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$sbhl_mapping_marking_space$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 5872L)
    public static SubLObject sbhl_gather_all_disjoins(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module());
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
        final SubLObject _prev_bind_7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
        final SubLObject _prev_bind_8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_truth$.bind(sbhl_search_implied_relations.$const9$True_JustificationTruth, thread);
            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED)), thread);
            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
            final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_gather_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                    final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$11 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                    final SubLObject _prev_bind_4_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = (SubLObject)sbhl_search_implied_relations.NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            final SubLObject _prev_bind_0_$9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$11 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_mapping_marking_space$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.$sbhl_mapping_gather_marking_space$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(node);
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2_$11, thread);
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$10, thread);
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            if (sbhl_search_implied_relations.NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    }
                    finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$12, thread);
                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$11, thread);
                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$10, thread);
                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$9, thread);
                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$8, thread);
                    }
                    if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$7, thread);
                }
                if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_8, thread);
            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_7, thread);
            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_6, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 6255L)
    public static SubLObject sbhl_all_sibling_disjoint_nodes_of_backward_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject cdolist_list_var = backward_nodes;
        SubLObject back_node = (SubLObject)sbhl_search_implied_relations.NIL;
        back_node = cdolist_list_var.first();
        while (sbhl_search_implied_relations.NIL != cdolist_list_var) {
            result = ConsesLow.append(sbhl_all_sibling_disjoint_nodes(module, back_node, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            back_node = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(result, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 6741L)
    public static SubLObject sbhl_disjoins_of_tt_closure(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject link_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$18 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = tv;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((sbhl_search_implied_relations.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_search_implied_relations.NIL != tv_var) ? sbhl_search_implied_relations.$sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (sbhl_search_implied_relations.NIL != tv_var && sbhl_search_implied_relations.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw13$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw16$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str17$continue_anyway, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw18$WARN)) {
                            Errors.warn((SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)sbhl_search_implied_relations.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)sbhl_search_implied_relations.$str17$continue_anyway, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind(sbhl_search_implied_relations.$const9$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$20 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$29 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = (SubLObject)sbhl_search_implied_relations.NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                            SubLObject module_var = (SubLObject)sbhl_search_implied_relations.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (sbhl_search_implied_relations.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sbhl_search_implied_relations.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sbhl_search_implied_relations.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node_$34 = function_terms.naut_to_nart(node);
                                                    if (sbhl_search_implied_relations.NIL != sbhl_link_vars.sbhl_node_object_p(node_$34)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$34, sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED));
                                                        if (sbhl_search_implied_relations.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED));
                                                            if (sbhl_search_implied_relations.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_search_implied_relations.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$35 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (sbhl_search_implied_relations.NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                        final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                            SubLObject iteration_state_$37;
                                                                            for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_search_implied_relations.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv_$38 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_$38)) {
                                                                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv_$38, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (sbhl_search_implied_relations.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject link_node;
                                                                                            SubLObject _prev_bind_0_$26;
                                                                                            SubLObject _prev_bind_0_$27;
                                                                                            SubLObject _prev_bind_1_$22;
                                                                                            SubLObject _prev_bind_2_$21;
                                                                                            SubLObject _prev_bind_3_$30;
                                                                                            SubLObject _prev_bind_4_$31;
                                                                                            SubLObject _prev_bind_0_$28;
                                                                                            SubLObject _values;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                                                                    _prev_bind_0_$26 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                                        try {
                                                                                                            _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                            _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                            _prev_bind_2_$21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                            _prev_bind_3_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                            _prev_bind_4_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                                                sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                                sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node);
                                                                                                            }
                                                                                                            finally {
                                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$31, thread);
                                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$30, thread);
                                                                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$21, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                                                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$27, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                                                                                _values = Values.getValuesAsVector();
                                                                                                                link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                                Values.restoreValuesFromVector(_values);
                                                                                                            }
                                                                                                            finally {
                                                                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$26, thread);
                                                                                                    }
                                                                                                    result = ConsesLow.append(link_disjoins, result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject link_node2 = (SubLObject)sbhl_search_implied_relations.NIL;
                                                                                            link_node2 = csome_list_var.first();
                                                                                            while (sbhl_search_implied_relations.NIL != csome_list_var) {
                                                                                                final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                                    try {
                                                                                                        final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_3_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_4_$32 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                                            sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node2);
                                                                                                        }
                                                                                                        finally {
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$32, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$31, thread);
                                                                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$22, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$23, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$30, thread);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                                                                            final SubLObject _values2 = Values.getValuesAsVector();
                                                                                                            link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                                            Values.restoreValuesFromVector(_values2);
                                                                                                        }
                                                                                                        finally {
                                                                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$29, thread);
                                                                                                }
                                                                                                result = ConsesLow.append(link_disjoins, result);
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.FIVE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str21$attempting_to_bind_direction_link, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (sbhl_search_implied_relations.NIL != obsolete.cnat_p(node_$34, (SubLObject)sbhl_search_implied_relations.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$54;
                                                        final SubLObject new_list = cdolist_list_var_$54 = ((sbhl_search_implied_relations.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)sbhl_search_implied_relations.NIL;
                                                        generating_fn = cdolist_list_var_$54.first();
                                                        while (sbhl_search_implied_relations.NIL != cdolist_list_var_$54) {
                                                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node_$34);
                                                                if (sbhl_search_implied_relations.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject link_node3;
                                                                    SubLObject _prev_bind_0_$33;
                                                                    SubLObject _prev_bind_0_$34;
                                                                    SubLObject _prev_bind_1_$24;
                                                                    SubLObject _prev_bind_2_$23;
                                                                    SubLObject _prev_bind_3_$32;
                                                                    SubLObject _prev_bind_4_$33;
                                                                    SubLObject _prev_bind_0_$35;
                                                                    SubLObject _values3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sbhl_search_implied_relations.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state2, link_node3)) {
                                                                            _prev_bind_0_$33 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                try {
                                                                                    _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                    _prev_bind_1_$24 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                    _prev_bind_2_$23 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                    _prev_bind_3_$32 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    _prev_bind_4_$33 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                        sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node3);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$33, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$32, thread);
                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$23, thread);
                                                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$24, thread);
                                                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$34, thread);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                                                        _values3 = Values.getValuesAsVector();
                                                                                        link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                        Values.restoreValuesFromVector(_values3);
                                                                                    }
                                                                                    finally {
                                                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$33, thread);
                                                                            }
                                                                            result = ConsesLow.append(link_disjoins, result);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject link_node4 = (SubLObject)sbhl_search_implied_relations.NIL;
                                                                    link_node4 = csome_list_var2.first();
                                                                    while (sbhl_search_implied_relations.NIL != csome_list_var2) {
                                                                        final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                            try {
                                                                                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_3_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_4_$34 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                                                    sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                                                                                    sbhl_search_utilities.sbhl_sweep_step_disjoins_and_sweep_again(link_node4);
                                                                                }
                                                                                finally {
                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$34, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$33, thread);
                                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$24, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$25, thread);
                                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                                                    final SubLObject _values4 = Values.getValuesAsVector();
                                                                                    link_disjoins = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                                    Values.restoreValuesFromVector(_values4);
                                                                                }
                                                                                finally {
                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$36, thread);
                                                                        }
                                                                        result = ConsesLow.append(link_disjoins, result);
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$32, thread);
                                                            }
                                                            cdolist_list_var_$54 = cdolist_list_var_$54.rest();
                                                            generating_fn = cdolist_list_var_$54.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$23, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                    finally {
                                        if (sbhl_search_implied_relations.NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$30, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$29, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$20, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$20, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$21, thread);
                                }
                                if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$19, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$18, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$17, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$16, thread);
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 7518L)
    public static SubLObject sbhl_all_sibling_disjoint_nodes_of_tt(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject cdolist_list_var = tt_nodes;
        SubLObject tt_node = (SubLObject)sbhl_search_implied_relations.NIL;
        tt_node = cdolist_list_var.first();
        while (sbhl_search_implied_relations.NIL != cdolist_list_var) {
            result = ConsesLow.append(sbhl_all_sibling_disjoint_nodes(sbhl_module_utilities.get_sbhl_transfers_through_module(module), tt_node, mt, tv), result);
            cdolist_list_var = cdolist_list_var.rest();
            tt_node = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(result, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 8005L)
    public static SubLObject sbhl_tt_closure_of_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_module_utilities.get_sbhl_transfers_through_module(module));
        final SubLObject all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(disjoins_module, node, mt, tv);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_disjoins, mt, tv);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 8541L)
    public static SubLObject sbhl_all_tt_nodes_of_sibling_disjoint_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject all_sibling_disjoins = sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        result = sbhl_search_methods.sbhl_union_all_backward_true_nodes(module, all_sibling_disjoins, mt, tv);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 8997L)
    public static SubLObject sbhl_all_implied_forward_false_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                SubLObject false_closure = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject disjoins_of_all_specs = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject sibling_disjoint_nodes = (SubLObject)sbhl_search_implied_relations.NIL;
                false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                disjoins_of_all_specs = sbhl_disjoins_of_backward_closure(module, node, mt, tv);
                sibling_disjoint_nodes = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_all_sibling_disjoint_nodes_of_backward_closure(module, node, mt, tv));
                result = ConsesLow.append(false_closure, disjoins_of_all_specs, sibling_disjoint_nodes);
            }
            else if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                SubLObject false_closure = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject disjoins_of_tt = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject sibling_disjoins_of_tt = (SubLObject)sbhl_search_implied_relations.NIL;
                false_closure = sbhl_search_methods.sbhl_all_forward_false_nodes(module, node, mt, tv);
                disjoins_of_tt = sbhl_disjoins_of_tt_closure(module, node, mt, tv);
                sibling_disjoins_of_tt = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_all_sibling_disjoint_nodes_of_tt(module, node, mt, tv));
                result = ConsesLow.append(false_closure, disjoins_of_tt, sibling_disjoins_of_tt);
            }
            else {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 10478L)
    public static SubLObject sbhl_all_implied_backward_false_nodes(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
                SubLObject false_closure = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject all_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject sibling_disjoint_nodes = (SubLObject)sbhl_search_implied_relations.NIL;
                false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                all_disjoins = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_utilities.get_sbhl_disjoins_module(sbhl_search_vars.get_sbhl_search_module()), node, mt, tv);
                sibling_disjoint_nodes = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_all_sibling_disjoint_nodes(module, node, mt, tv));
                result = ConsesLow.append(false_closure, all_disjoins, sibling_disjoint_nodes);
            }
            else if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
                SubLObject false_closure = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject tt_of_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
                SubLObject tt_of_sibling_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
                false_closure = sbhl_search_methods.sbhl_all_backward_false_nodes(module, node, mt, tv);
                tt_of_disjoins = sbhl_tt_closure_of_disjoins(module, node, mt, tv);
                tt_of_sibling_disjoins = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_all_tt_nodes_of_sibling_disjoint_nodes(module, node, mt, tv));
                result = ConsesLow.append(false_closure, tt_of_disjoins, tt_of_sibling_disjoins);
            }
            else {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 11942L)
    public static SubLObject sbhl_all_implied_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
        SubLObject disjoin_nodes = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject sibling_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
        disjoin_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes(module, node, mt, tv);
        sibling_disjoins = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv));
        return conses_high.nunion(disjoin_nodes, sibling_disjoins, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 12491L)
    public static SubLObject sbhl_implied_max_disjoins(final SubLObject module, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
        SubLObject max_disjoin_nodes = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject max_sibling_disjoins = (SubLObject)sbhl_search_implied_relations.NIL;
        max_disjoin_nodes = sbhl_search_methods.sbhl_max_true_disjoins(module, node, mt, tv);
        max_sibling_disjoins = (SubLObject)((sbhl_search_implied_relations.NIL != sdc.ignoring_sdcP()) ? sbhl_search_implied_relations.NIL : sbhl_max_sibling_disjoint_nodes(tt_module, node, mt, tv));
        return sbhl_search_methods.sbhl_max_nodes(tt_module, ConsesLow.nconc(max_disjoin_nodes, max_sibling_disjoins), mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 13099L)
    public static SubLObject sbhl_disjoins_relation_with_backward_nodes_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != disjoins_module) {
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
                sbhl_search_vars.$sbhl_search_type$.bind((SubLObject)sbhl_search_implied_relations.$kw23$BOOLEAN, thread);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$72 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    final SubLObject tv_var = tv;
                    final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((sbhl_search_implied_relations.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sbhl_search_implied_relations.NIL != tv_var) ? sbhl_search_implied_relations.$sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (sbhl_search_implied_relations.NIL != tv_var && sbhl_search_implied_relations.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw13$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw16$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str17$continue_anyway, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)sbhl_search_implied_relations.$kw18$WARN)) {
                                Errors.warn((SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)sbhl_search_implied_relations.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)sbhl_search_implied_relations.$str17$continue_anyway, (SubLObject)sbhl_search_implied_relations.$str14$_A_is_not_a__A, tv_var, (SubLObject)sbhl_search_implied_relations.$sym15$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_truth$.bind(sbhl_search_implied_relations.$const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_implied_relations.UNPROVIDED)), thread);
                            final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                            final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind((source == sbhl_search_implied_relations.$kw10$OLD) ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                    final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_finishedP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                        SubLObject needs_to_releaseP = (SubLObject)sbhl_search_implied_relations.NIL;
                                        try {
                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                            final SubLObject premarkingP = sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p();
                                            SubLObject goal_fn = (SubLObject)sbhl_search_implied_relations.$sym24$SBHL_NODE_IS_GOAL_NODE;
                                            SubLObject goal_space = sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                                            if (sbhl_search_implied_relations.NIL != premarkingP) {
                                                final SubLObject _prev_bind_0_$76 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)(sbhl_module_utilities.get_sbhl_link_pred(sbhl_search_vars.get_sbhl_search_module()).eql(sbhl_search_implied_relations.$const25$negationInverse) ? sbhl_search_implied_relations.T : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    sbhl_marking_methods.sbhl_premark_gather_nodes(not_node);
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$75, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                goal_fn = (SubLObject)sbhl_search_implied_relations.$sym26$SBHL_NODE_MARKED_AS_GOAL_NODE;
                                                goal_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                                            }
                                            final SubLObject _prev_bind_0_$77 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$75 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                            final SubLObject _prev_bind_3_$84 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                                            final SubLObject _prev_bind_4_$85 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                                            final SubLObject _prev_bind_5_$92 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.bind(goal_fn, thread);
                                                sbhl_search_vars.$sbhl_goal_node$.bind(not_node, thread);
                                                sbhl_marking_vars.$sbhl_goal_space$.bind(goal_space, thread);
                                                sbhl_search_vars.$sbhl_result$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                                                try {
                                                    final SubLObject _prev_bind_0_$78 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        try {
                                                            sbhl_search_utilities.sbhl_check_disjoins_of_all_backward_nodes(node);
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$79, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_$78, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_search_implied_relations.T, thread);
                                                        final SubLObject _values2 = Values.getValuesAsVector();
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        Values.restoreValuesFromVector(_values2);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$80, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_5_$92, thread);
                                                sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_4_$85, thread);
                                                sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3_$84, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_$75, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$77, thread);
                                            }
                                        }
                                        finally {
                                            if (sbhl_search_implied_relations.NIL != needs_to_releaseP) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$84, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$83, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$74, thread);
                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$75, thread);
                                    }
                                    if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                }
                                finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$74, thread);
                                }
                                if (source == sbhl_search_implied_relations.$kw11$RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            }
                            finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                            }
                        }
                        finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$73, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$72, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$72, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$71, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$72, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$71, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$70, thread);
                }
            }
            finally {
                sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_6, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 13762L)
    public static SubLObject sbhl_disjoins_with_tt_nodes_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(disjoins_module, link_nodes, not_node, mt, tv);
        if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) {
            sbhl_search_vars.sbhl_justification_behavior_defaults_old();
            final SubLObject link_node = conses_high.second(sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread).first().first());
            sbhl_search_vars.$sbhl_justification_result$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sbhl_module_vars.get_sbhl_module_link_pred(module), node, link_node), (sbhl_search_implied_relations.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), (sbhl_search_implied_relations.NIL != tv) ? sbhl_search_vars.sbhl_true_tv(tv) : sbhl_search_vars.sbhl_search_true_tv()), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 14696L)
    public static SubLObject sbhl_sibling_disjoint_with_backward_nodes_justification(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_just_fn) {
            final SubLObject backward_nodes = set.set_or_list_to_list(sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv));
            SubLObject disjointP = (SubLObject)sbhl_search_implied_relations.NIL;
            if (sbhl_search_implied_relations.NIL == disjointP) {
                SubLObject csome_list_var = (SubLObject)ConsesLow.cons(node, backward_nodes);
                SubLObject back_node = (SubLObject)sbhl_search_implied_relations.NIL;
                back_node = csome_list_var.first();
                while (sbhl_search_implied_relations.NIL == disjointP && sbhl_search_implied_relations.NIL != csome_list_var) {
                    result = Functions.funcall(sd_just_fn, back_node, not_node, mt);
                    if (sbhl_search_implied_relations.NIL != result) {
                        if (!node.eql(back_node)) {
                            result = ConsesLow.nconc(sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym27$SBHL_PREDICATE_RELATION_P, module, back_node, node, mt, tv, (SubLObject)sbhl_search_implied_relations.NIL, (SubLObject)sbhl_search_implied_relations.T), result);
                        }
                        sbhl_search_vars.sbhl_justification_assembled();
                        disjointP = (SubLObject)sbhl_search_implied_relations.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    back_node = csome_list_var.first();
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 15693L)
    public static SubLObject sbhl_sibling_disjoint_relation_with_backward_nodes_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
        final SubLObject sd_any_boolean_fn = get_sbhl_sibling_disjoint_any_boolean_fn(module);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sd_boolean_fn) {
            final SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
            SubLObject disjointP = (SubLObject)sbhl_search_implied_relations.NIL;
            if (sbhl_search_implied_relations.NIL != sbhl_search_implied_relations.$use_fast_sbhl_sibling_disjoint_any_boolean_fnP$.getDynamicValue(thread) && sbhl_search_implied_relations.NIL != sd_any_boolean_fn) {
                if (sbhl_search_implied_relations.NIL != Functions.funcall(sd_any_boolean_fn, backward_nodes, not_node, mt)) {
                    result = (SubLObject)sbhl_search_implied_relations.T;
                }
            }
            else {
                final SubLObject sol = backward_nodes;
                if (sbhl_search_implied_relations.NIL != set.set_p(sol)) {
                    final SubLObject set_contents_var = set.do_set_internal(sol);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject back_node;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == disjointP && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        back_node = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, back_node)) {
                            result = Functions.funcall(sd_boolean_fn, back_node, not_node, mt);
                            if (sbhl_search_implied_relations.NIL != result) {
                                disjointP = (SubLObject)sbhl_search_implied_relations.T;
                            }
                        }
                    }
                }
                else if (sol.isList()) {
                    if (sbhl_search_implied_relations.NIL == disjointP) {
                        SubLObject csome_list_var = sol;
                        SubLObject back_node2 = (SubLObject)sbhl_search_implied_relations.NIL;
                        back_node2 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == disjointP && sbhl_search_implied_relations.NIL != csome_list_var) {
                            result = Functions.funcall(sd_boolean_fn, back_node2, not_node, mt);
                            if (sbhl_search_implied_relations.NIL != result) {
                                disjointP = (SubLObject)sbhl_search_implied_relations.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            back_node2 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 16616L)
    public static SubLObject sbhl_sibling_disjoint_relation_tt_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject sol = link_nodes;
        if (sbhl_search_implied_relations.NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link_node = set_contents.do_set_contents_next(basis_object, state);
                if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                    result = Functions.funcall(sd_boolean_fn, link_node, not_node, mt);
                }
            }
        }
        else if (sol.isList()) {
            if (sbhl_search_implied_relations.NIL == result) {
                SubLObject csome_list_var;
                SubLObject link_node2;
                for (csome_list_var = sol, link_node2 = (SubLObject)sbhl_search_implied_relations.NIL, link_node2 = csome_list_var.first(); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var; result = Functions.funcall(sd_boolean_fn, link_node2, not_node, mt), csome_list_var = csome_list_var.rest(), link_node2 = csome_list_var.first()) {}
            }
        }
        else {
            Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 17249L)
    public static SubLObject sbhl_sibling_disjoint_tt_justification(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        final SubLObject sd_just_fn = get_sbhl_sibling_disjoint_justification_fn(tt_module);
        final SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        SubLObject justification = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        final SubLObject sol = link_nodes;
        if (sbhl_search_implied_relations.NIL != set.set_p(sol)) {
            final SubLObject set_contents_var = set.do_set_internal(sol);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link_node;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == justification && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link_node = set_contents.do_set_contents_next(basis_object, state);
                if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                    justification = Functions.funcall(sd_just_fn, link_node, not_node, mt);
                    if (sbhl_search_implied_relations.NIL != justification) {
                        result = ConsesLow.nconc(sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym27$SBHL_PREDICATE_RELATION_P, module, node, link_node, mt, tv, (SubLObject)sbhl_search_implied_relations.NIL, (SubLObject)sbhl_search_implied_relations.T), justification);
                        sbhl_search_vars.sbhl_justification_assembled();
                    }
                }
            }
        }
        else if (sol.isList()) {
            if (sbhl_search_implied_relations.NIL == justification) {
                SubLObject csome_list_var = sol;
                SubLObject link_node2 = (SubLObject)sbhl_search_implied_relations.NIL;
                link_node2 = csome_list_var.first();
                while (sbhl_search_implied_relations.NIL == justification && sbhl_search_implied_relations.NIL != csome_list_var) {
                    justification = Functions.funcall(sd_just_fn, link_node2, not_node, mt);
                    if (sbhl_search_implied_relations.NIL != justification) {
                        result = ConsesLow.nconc(sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym27$SBHL_PREDICATE_RELATION_P, module, node, link_node2, mt, tv, (SubLObject)sbhl_search_implied_relations.NIL, (SubLObject)sbhl_search_implied_relations.T), justification);
                        sbhl_search_vars.sbhl_justification_assembled();
                    }
                    csome_list_var = csome_list_var.rest();
                    link_node2 = csome_list_var.first();
                }
            }
        }
        else {
            Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 18000L)
    public static SubLObject sbhl_argumentation_false_predicate_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_search_implied_relations.NIL != sbhl_search_methods.sbhl_predicate_relation_p(module, node, not_node, mt, tv)) {
            return (SubLObject)sbhl_search_implied_relations.NIL;
        }
        return sbhl_implied_false_predicate_relation_p(module, node, not_node, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 18561L)
    public static SubLObject sbhl_implied_false_predicate_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject coerced_tv = tv;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_false_tv_p(tv)) {
            coerced_tv = sbhl_search_vars.sbhl_opposite_tv(tv);
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_disjoins_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
            }
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        result = sbhl_sibling_disjoint_with_backward_nodes_justification(module, node, not_node, mt, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                    }
                    finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    result = sbhl_sibling_disjoint_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
                }
            }
            return result;
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, not_node, mt, coerced_tv);
            }
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        result = sbhl_sibling_disjoint_tt_justification(module, node, not_node, mt, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                    }
                    finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    result = sbhl_sibling_disjoint_relation_tt_p(module, node, not_node, mt, coerced_tv);
                }
            }
            return result;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 20510L)
    public static SubLObject sbhl_implied_false_inverse_relation_p(final SubLObject module, final SubLObject node, final SubLObject not_node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, node, not_node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_search_methods.sbhl_disjoins_relation_p(module, node, not_node, mt, tv);
            }
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        result = sbhl_sibling_disjoint_justification(module, node, not_node, mt, tv);
                    }
                    finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    result = sbhl_sibling_disjoint_relation_p(module, node, not_node, mt, tv);
                }
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_search_vars.sbhl_justification_assembled();
                }
            }
            return result;
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_disjoins_with_tt_nodes_relation_p(module, not_node, node, mt, tv);
            }
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        result = sbhl_sibling_disjoint_tt_justification(module, not_node, node, mt, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                    }
                    finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    result = sbhl_sibling_disjoint_relation_tt_p(module, not_node, node, mt, tv);
                }
            }
            return result;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 22398L)
    public static SubLObject sbhl_implied_disjoins_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_predicate_relation_p(module, node1, node2, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)) && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_justification_search_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind((SubLObject)sbhl_search_implied_relations.NIL, thread);
                        result = sbhl_sibling_disjoint_justification(tt_module, node1, node2, mt, tv);
                    }
                    finally {
                        sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                    }
                }
                else {
                    result = sbhl_sibling_disjoint_relation_p(tt_module, node1, node2, mt, tv);
                }
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_search_vars.sbhl_justification_assembled();
                }
                return result;
            }
        }
        else {
            sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str28$Method_only_valid_for_disjoins_mo, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 23389L)
    public static SubLObject sbhl_any_with_implied_false_inverse_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_search_methods.sbhl_any_with_disjoins_relation_p(module, nodes, node, mt, tv);
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                result = sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
            }
            return result;
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node2, mt, tv);
                            if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == result) {
                        SubLObject csome_list_var = nodes;
                        SubLObject node3 = (SubLObject)sbhl_search_implied_relations.NIL;
                        node3 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node3, mt, tv);
                            if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                            csome_list_var = csome_list_var.rest();
                            node3 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_sibling_disjoint_relation_tt_p(module, node, node2, mt, tv);
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject node3;
                        for (csome_list_var = nodes, node3 = (SubLObject)sbhl_search_implied_relations.NIL, node3 = csome_list_var.first(); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var; result = sbhl_sibling_disjoint_relation_tt_p(module, node, node3, mt, tv), csome_list_var = csome_list_var.rest(), node3 = csome_list_var.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
            }
        }
        else {
            sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 25023L)
    public static SubLObject sbhl_implied_false_predicate_relation_with_any_p(final SubLObject module, final SubLObject node, final SubLObject nodes, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_search_methods.sbhl_disjoins_relation_with_any_p(module, node, nodes, mt, tv);
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                result = sbhl_any_with_sibling_disjoint_relation_p(module, nodes, node, mt, tv);
            }
            return result;
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_false_predicate_relation_with_any_p(module, node, nodes, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node2, mt, tv);
                            if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == result) {
                        SubLObject csome_list_var = nodes;
                        SubLObject node3 = (SubLObject)sbhl_search_implied_relations.NIL;
                        node3 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var) {
                            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, node3, mt, tv);
                            if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                                result = sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread);
                            }
                            csome_list_var = csome_list_var.rest();
                            node3 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_sibling_disjoint_relation_tt_p(module, node, node2, mt, tv);
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject node3;
                        for (csome_list_var = nodes, node3 = (SubLObject)sbhl_search_implied_relations.NIL, node3 = csome_list_var.first(); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var; result = sbhl_sibling_disjoint_relation_tt_p(module, node, node3, mt, tv), csome_list_var = csome_list_var.rest(), node3 = csome_list_var.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
            }
        }
        else {
            sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 26579L)
    public static SubLObject sbhl_all_with_implied_false_inverse_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        SubLObject doneP = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_simple_module_p(module)) {
            result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                result = sbhl_search_methods.sbhl_all_with_disjoins_relation_p(module, nodes, node, mt, tv);
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != set.set_p(node)) {
                    final SubLObject set_contents_var = set.do_set_internal(node);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2) && sbhl_search_implied_relations.NIL == sbhl_sibling_disjoint_relation_p(module, node2, node, mt, tv)) {
                            doneP = (SubLObject)sbhl_search_implied_relations.T;
                        }
                    }
                }
                else if (node.isList()) {
                    if (sbhl_search_implied_relations.NIL == doneP) {
                        SubLObject csome_list_var = node;
                        SubLObject node3 = (SubLObject)sbhl_search_implied_relations.NIL;
                        node3 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL != csome_list_var) {
                            if (sbhl_search_implied_relations.NIL == sbhl_sibling_disjoint_relation_p(module, node3, node, mt, tv)) {
                                doneP = (SubLObject)sbhl_search_implied_relations.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            node3 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, node);
                }
                result = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_implied_relations.NIL == doneP);
            }
            return result;
        }
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)) {
            result = sbhl_search_methods.sbhl_all_with_false_inverse_relation_p(module, nodes, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && (sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() || sbhl_search_implied_relations.NIL == sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))) {
                if (sbhl_search_implied_relations.NIL != sbhl_search_vars.sbhl_justification_search_p()) {
                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str29$Boolean_methods_using_ALL_are_cur, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
                }
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2) && sbhl_search_implied_relations.NIL == sbhl_disjoins_with_tt_nodes_relation_p(module, node2, node, mt, tv)) {
                            doneP = (SubLObject)sbhl_search_implied_relations.T;
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == doneP) {
                        SubLObject csome_list_var = nodes;
                        SubLObject node3 = (SubLObject)sbhl_search_implied_relations.NIL;
                        node3 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL != csome_list_var) {
                            if (sbhl_search_implied_relations.NIL == sbhl_disjoins_with_tt_nodes_relation_p(module, node3, node, mt, tv)) {
                                doneP = (SubLObject)sbhl_search_implied_relations.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            node3 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
                result = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_implied_relations.NIL == doneP);
            }
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2) && sbhl_search_implied_relations.NIL == sbhl_sibling_disjoint_relation_tt_p(module, node2, node, mt, tv)) {
                            doneP = (SubLObject)sbhl_search_implied_relations.T;
                        }
                    }
                }
                else if (nodes.isList()) {
                    if (sbhl_search_implied_relations.NIL == doneP) {
                        SubLObject csome_list_var = nodes;
                        SubLObject node3 = (SubLObject)sbhl_search_implied_relations.NIL;
                        node3 = csome_list_var.first();
                        while (sbhl_search_implied_relations.NIL == doneP && sbhl_search_implied_relations.NIL != csome_list_var) {
                            if (sbhl_search_implied_relations.NIL == sbhl_sibling_disjoint_relation_tt_p(module, node3, node, mt, tv)) {
                                doneP = (SubLObject)sbhl_search_implied_relations.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            node3 = csome_list_var.first();
                        }
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes);
                }
                result = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_implied_relations.NIL == doneP);
            }
            return result;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str22$Method_only_valid_for_simple_and_, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 28407L)
    public static SubLObject sbhl_any_with_implied_disjoins_relation_p(final SubLObject module, final SubLObject nodes, final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(module, nodes, node, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes, node, mt, tv);
            }
            return result;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str28$Method_only_valid_for_disjoins_mo, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 29119L)
    public static SubLObject sbhl_implied_disjoins_relation_between_any_p(final SubLObject module, final SubLObject nodes1, final SubLObject nodes2, SubLObject mt, SubLObject tv) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_search_implied_relations.NIL;
        if (sbhl_search_implied_relations.NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
            result = sbhl_search_methods.sbhl_predicate_relation_between_any_p(module, nodes1, nodes2, mt, tv);
            if (sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == sbhl_search_vars.sbhl_justification_search_p() && sbhl_search_implied_relations.NIL == sdc.ignoring_sdcP()) {
                final SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
                if (sbhl_search_implied_relations.NIL != set.set_p(nodes2)) {
                    final SubLObject set_contents_var = set.do_set_internal(nodes2);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node2;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_search_implied_relations.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        node2 = set_contents.do_set_contents_next(basis_object, state);
                        if (sbhl_search_implied_relations.NIL != set_contents.do_set_contents_element_validP(state, node2)) {
                            result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes1, node2, mt, tv);
                        }
                    }
                }
                else if (nodes2.isList()) {
                    if (sbhl_search_implied_relations.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject node3;
                        for (csome_list_var = nodes2, node3 = (SubLObject)sbhl_search_implied_relations.NIL, node3 = csome_list_var.first(); sbhl_search_implied_relations.NIL == result && sbhl_search_implied_relations.NIL != csome_list_var; result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes1, node3, mt, tv), csome_list_var = csome_list_var.rest(), node3 = csome_list_var.first()) {}
                    }
                }
                else {
                    Errors.error((SubLObject)sbhl_search_implied_relations.$str20$_A_is_neither_SET_P_nor_LISTP_, nodes2);
                }
            }
            return result;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_implied_relations.ONE_INTEGER, (SubLObject)sbhl_search_implied_relations.$str28$Method_only_valid_for_disjoins_mo, module, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED, (SubLObject)sbhl_search_implied_relations.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 29897L)
    public static SubLObject why_sbhl_implied_false_predicate_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (behavior == sbhl_search_implied_relations.UNPROVIDED) {
            behavior = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym30$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P, module, node1, node2, mt, tv, behavior, (SubLObject)sbhl_search_implied_relations.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 30252L)
    public static SubLObject why_sbhl_implied_false_inverse_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (behavior == sbhl_search_implied_relations.UNPROVIDED) {
            behavior = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym31$SBHL_IMPLIED_FALSE_INVERSE_RELATION_P, module, node1, node2, mt, tv, behavior, (SubLObject)sbhl_search_implied_relations.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 30563L)
    public static SubLObject why_sbhl_implied_disjoins_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == sbhl_search_implied_relations.UNPROVIDED) {
            mt = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (tv == sbhl_search_implied_relations.UNPROVIDED) {
            tv = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        if (behavior == sbhl_search_implied_relations.UNPROVIDED) {
            behavior = (SubLObject)sbhl_search_implied_relations.NIL;
        }
        assert sbhl_search_implied_relations.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_search_utilities.sbhl_handle_justification((SubLObject)sbhl_search_implied_relations.$sym32$SBHL_IMPLIED_DISJOINS_RELATION_P, module, node1, node2, mt, tv, behavior, (SubLObject)sbhl_search_implied_relations.NIL);
    }
    
    public static SubLObject declare_sbhl_search_implied_relations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_closure_fn", "GET-SBHL-SIBLING-DISJOINT-CLOSURE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_sibling_disjoint_nodes", "SBHL-ALL-SIBLING-DISJOINT-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_max_nodes_fn", "GET-SBHL-SIBLING-DISJOINT-MAX-NODES-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_max_sibling_disjoint_nodes", "SBHL-MAX-SIBLING-DISJOINT-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-BOOLEAN-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_relation_p", "SBHL-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_any_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_any_with_sibling_disjoint_relation_p", "SBHL-ANY-WITH-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_any_boolean_any_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-ANY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_relation_between_any_p", "SBHL-SIBLING-DISJOINT-RELATION-BETWEEN-ANY-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "get_sbhl_sibling_disjoint_justification_fn", "GET-SBHL-SIBLING-DISJOINT-JUSTIFICATION-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_justification", "SBHL-SIBLING-DISJOINT-JUSTIFICATION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_disjoins_of_backward_closure", "SBHL-DISJOINS-OF-BACKWARD-CLOSURE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_gather_all_disjoins", "SBHL-GATHER-ALL-DISJOINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_sibling_disjoint_nodes_of_backward_closure", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-BACKWARD-CLOSURE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_disjoins_of_tt_closure", "SBHL-DISJOINS-OF-TT-CLOSURE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_sibling_disjoint_nodes_of_tt", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-TT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_tt_closure_of_disjoins", "SBHL-TT-CLOSURE-OF-DISJOINS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_tt_nodes_of_sibling_disjoint_nodes", "SBHL-ALL-TT-NODES-OF-SIBLING-DISJOINT-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_implied_forward_false_nodes", "SBHL-ALL-IMPLIED-FORWARD-FALSE-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_implied_backward_false_nodes", "SBHL-ALL-IMPLIED-BACKWARD-FALSE-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_implied_disjoins", "SBHL-ALL-IMPLIED-DISJOINS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_max_disjoins", "SBHL-IMPLIED-MAX-DISJOINS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_disjoins_relation_with_backward_nodes_p", "SBHL-DISJOINS-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_disjoins_with_tt_nodes_relation_p", "SBHL-DISJOINS-WITH-TT-NODES-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_with_backward_nodes_justification", "SBHL-SIBLING-DISJOINT-WITH-BACKWARD-NODES-JUSTIFICATION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_relation_with_backward_nodes_p", "SBHL-SIBLING-DISJOINT-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_relation_tt_p", "SBHL-SIBLING-DISJOINT-RELATION-TT-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_sibling_disjoint_tt_justification", "SBHL-SIBLING-DISJOINT-TT-JUSTIFICATION", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_argumentation_false_predicate_relation_p", "SBHL-ARGUMENTATION-FALSE-PREDICATE-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_false_predicate_relation_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_false_inverse_relation_p", "SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_disjoins_relation_p", "SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_any_with_implied_false_inverse_relation_p", "SBHL-ANY-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_false_predicate_relation_with_any_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_all_with_implied_false_inverse_relation_p", "SBHL-ALL-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_any_with_implied_disjoins_relation_p", "SBHL-ANY-WITH-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "sbhl_implied_disjoins_relation_between_any_p", "SBHL-IMPLIED-DISJOINS-RELATION-BETWEEN-ANY-P", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "why_sbhl_implied_false_predicate_relation_p", "WHY-SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "why_sbhl_implied_false_inverse_relation_p", "WHY-SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations", "why_sbhl_implied_disjoins_relation_p", "WHY-SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 3, false);
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    public static SubLObject init_sbhl_search_implied_relations_file() {
        sbhl_search_implied_relations.$use_fast_sbhl_sibling_disjoint_any_boolean_fnP$ = SubLFiles.defparameter("*USE-FAST-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN?*", (SubLObject)sbhl_search_implied_relations.T);
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    public static SubLObject setup_sbhl_search_implied_relations_file() {
        return (SubLObject)sbhl_search_implied_relations.NIL;
    }
    
    public void declareFunctions() {
        declare_sbhl_search_implied_relations_file();
    }
    
    public void initializeVariables() {
        init_sbhl_search_implied_relations_file();
    }
    
    public void runTopLevelForms() {
        setup_sbhl_search_implied_relations_file();
    }
    
    static {
        me = (SubLFile)new sbhl_search_implied_relations();
        sbhl_search_implied_relations.$use_fast_sbhl_sibling_disjoint_any_boolean_fnP$ = null;
        $sym0$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $const1$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym2$ALL_SDC = SubLObjectFactory.makeSymbol("ALL-SDC");
        $sym3$MAX_SDC = SubLObjectFactory.makeSymbol("MAX-SDC");
        $sym4$SDC_ = SubLObjectFactory.makeSymbol("SDC?");
        $sym5$ANY_SDC_WRT_ = SubLObjectFactory.makeSymbol("ANY-SDC-WRT?");
        $sym6$ANY_SDC_ANY_ = SubLObjectFactory.makeSymbol("ANY-SDC-ANY?");
        $sym7$WHY_SDC_ = SubLObjectFactory.makeSymbol("WHY-SDC?");
        $sym8$SBHL_GATHER_ALL_DISJOINS = SubLObjectFactory.makeSymbol("SBHL-GATHER-ALL-DISJOINS");
        $const9$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $kw10$OLD = SubLObjectFactory.makeKeyword("OLD");
        $kw11$RESOURCE = SubLObjectFactory.makeKeyword("RESOURCE");
        $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw13$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str14$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym15$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw16$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str17$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw18$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str19$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str20$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str21$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str22$Method_only_valid_for_simple_and_ = SubLObjectFactory.makeString("Method only valid for simple and transfer-through modules, not ~a");
        $kw23$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $sym24$SBHL_NODE_IS_GOAL_NODE = SubLObjectFactory.makeSymbol("SBHL-NODE-IS-GOAL-NODE");
        $const25$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $sym26$SBHL_NODE_MARKED_AS_GOAL_NODE = SubLObjectFactory.makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");
        $sym27$SBHL_PREDICATE_RELATION_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-RELATION-P");
        $str28$Method_only_valid_for_disjoins_mo = SubLObjectFactory.makeString("Method only valid for disjoins modules, not ~a");
        $str29$Boolean_methods_using_ALL_are_cur = SubLObjectFactory.makeString("Boolean methods using ALL are currently unsupported for justifications.");
        $sym30$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P = SubLObjectFactory.makeSymbol("SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P");
        $sym31$SBHL_IMPLIED_FALSE_INVERSE_RELATION_P = SubLObjectFactory.makeSymbol("SBHL-IMPLIED-FALSE-INVERSE-RELATION-P");
        $sym32$SBHL_IMPLIED_DISJOINS_RELATION_P = SubLObjectFactory.makeSymbol("SBHL-IMPLIED-DISJOINS-RELATION-P");
    }
}

/*

	Total time: 1636 ms
	
*/