package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_parse_trees extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees";
    public static final String myFingerPrint = "9f565b442a3b0b3ed575ceaa015b115bd791e90c12afc699b0c5b238d9fff842";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 895L)
    private static SubLSymbol $predicates_to_parse_tree_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1498L)
    private static SubLSymbol $predicates_with_parse_tree_support_in_some_mt_caching_state$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT;
    private static final SubLSymbol $sym2$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const3$InferencePSC;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$DEPTH;
    private static final SubLSymbol $kw6$STACK;
    private static final SubLSymbol $kw7$QUEUE;
    private static final SubLSymbol $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw9$ERROR;
    private static final SubLString $str10$_A_is_not_a__A;
    private static final SubLSymbol $sym11$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw12$CERROR;
    private static final SubLString $str13$continue_anyway;
    private static final SubLSymbol $kw14$WARN;
    private static final SubLString $str15$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const16$genlPreds;
    private static final SubLString $str17$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str18$attempting_to_bind_direction_link;
    private static final SubLString $str19$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_;
    private static final SubLSymbol $sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT;
    private static final SubLSymbol $kw22$NODES;
    private static final SubLSymbol $kw23$SUPPORTS;
    private static final SubLList $list24;
    private static final SubLObject $const25$True_JustificationTruth;
    private static final SubLSymbol $kw26$METHOD;
    private static final SubLSymbol $kw27$TYPE_CHECK;
    private static final SubLSymbol $kw28$PARSE_TREE;
    private static final SubLSymbol $kw29$REMOVAL_PARSE_TREE_RELATION_POS;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND;
    private static final SubLList $list32;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1498L)
    public static SubLObject clear_predicates_with_parse_tree_support_in_some_mt() {
        final SubLObject cs = removal_modules_parse_trees.$predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue();
        if (removal_modules_parse_trees.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)removal_modules_parse_trees.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1498L)
    public static SubLObject remove_predicates_with_parse_tree_support_in_some_mt() {
        return memoization_state.caching_state_remove_function_results_with_args(removal_modules_parse_trees.$predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(removal_modules_parse_trees.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1498L)
    public static SubLObject predicates_with_parse_tree_support_in_some_mt_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_parse_trees.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_parse_trees.$sym2$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_parse_trees.$const3$InferencePSC, thread);
            SubLObject cdolist_list_var = removal_modules_parse_trees.$predicates_to_parse_tree_methods$.getGlobalValue();
            SubLObject cons = (SubLObject)removal_modules_parse_trees.NIL;
            cons = cdolist_list_var.first();
            while (removal_modules_parse_trees.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pred = (SubLObject)removal_modules_parse_trees.NIL;
                SubLObject value = (SubLObject)removal_modules_parse_trees.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_parse_trees.$list4);
                pred = current.first();
                current = (value = current.rest());
                final SubLObject node_var = pred;
                final SubLObject deck_type = (SubLObject)removal_modules_parse_trees.$kw7$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)removal_modules_parse_trees.NIL;
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)removal_modules_parse_trees.NIL;
                        final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_parse_trees.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_parse_trees.NIL != tv_var) ? removal_modules_parse_trees.$sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_parse_trees.NIL != tv_var && removal_modules_parse_trees.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_parse_trees.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw9$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_parse_trees.ONE_INTEGER, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw12$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_parse_trees.ONE_INTEGER, (SubLObject)removal_modules_parse_trees.$str13$continue_anyway, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw14$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_parse_trees.$str15$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_parse_trees.$str13$continue_anyway, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_parse_trees.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds), thread);
                                if (removal_modules_parse_trees.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_parse_trees.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_parse_trees.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_parse_trees.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$9 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$9;
                                            final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (removal_modules_parse_trees.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                    final SubLObject item_var = genl_pred;
                                                    if (removal_modules_parse_trees.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)removal_modules_parse_trees.EQL), Symbols.symbol_function((SubLObject)removal_modules_parse_trees.IDENTITY))) {
                                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                                    }
                                                }
                                                SubLObject cdolist_list_var_$11;
                                                final SubLObject accessible_modules = cdolist_list_var_$11 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds));
                                                SubLObject module_var = (SubLObject)removal_modules_parse_trees.NIL;
                                                module_var = cdolist_list_var_$11.first();
                                                while (removal_modules_parse_trees.NIL != cdolist_list_var_$11) {
                                                    final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_parse_trees.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_parse_trees.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$9);
                                                        if (removal_modules_parse_trees.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED));
                                                            if (removal_modules_parse_trees.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED));
                                                                if (removal_modules_parse_trees.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_parse_trees.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_parse_trees.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$15;
                                                                                for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_parse_trees.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_parse_trees.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (removal_modules_parse_trees.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_parse_trees.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_parse_trees.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (removal_modules_parse_trees.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)removal_modules_parse_trees.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (removal_modules_parse_trees.NIL != csome_list_var) {
                                                                                                    if (removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_parse_trees.$str17$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_parse_trees.FIVE_INTEGER, (SubLObject)removal_modules_parse_trees.$str18$attempting_to_bind_direction_link, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_parse_trees.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$12;
                                                            final SubLObject new_list = cdolist_list_var_$12 = ((removal_modules_parse_trees.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)removal_modules_parse_trees.NIL;
                                                            generating_fn = cdolist_list_var_$12.first();
                                                            while (removal_modules_parse_trees.NIL != cdolist_list_var_$12) {
                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (removal_modules_parse_trees.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_parse_trees.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_parse_trees.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (removal_modules_parse_trees.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)removal_modules_parse_trees.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (removal_modules_parse_trees.NIL != csome_list_var2) {
                                                                            if (removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_parse_trees.$str17$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                                }
                                                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                                                generating_fn = cdolist_list_var_$12.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                    module_var = cdolist_list_var_$11.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_parse_trees.TWO_INTEGER, (SubLObject)removal_modules_parse_trees.$str19$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED)), (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_parse_trees.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1498L)
    public static SubLObject predicates_with_parse_tree_support_in_some_mt() {
        SubLObject caching_state = removal_modules_parse_trees.$predicates_with_parse_tree_support_in_some_mt_caching_state$.getGlobalValue();
        if (removal_modules_parse_trees.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)removal_modules_parse_trees.$sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT, (SubLObject)removal_modules_parse_trees.$sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_, (SubLObject)removal_modules_parse_trees.NIL, (SubLObject)removal_modules_parse_trees.EQL, (SubLObject)removal_modules_parse_trees.ZERO_INTEGER, (SubLObject)removal_modules_parse_trees.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)removal_modules_parse_trees.$sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(predicates_with_parse_tree_support_in_some_mt_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 1865L)
    public static SubLObject predicate_with_parse_tree_support_p(final SubLObject v_object) {
        SubLObject ans = (SubLObject)removal_modules_parse_trees.NIL;
        if (removal_modules_parse_trees.NIL != subl_promotions.memberP(v_object, predicates_with_parse_tree_support_in_some_mt(), (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject pred;
            SubLObject value;
            for (rest = (SubLObject)removal_modules_parse_trees.NIL, rest = removal_modules_parse_trees.$predicates_to_parse_tree_methods$.getGlobalValue(); removal_modules_parse_trees.NIL == ans && removal_modules_parse_trees.NIL != rest; rest = rest.rest()) {
                cons = rest.first();
                datum = (current = cons);
                pred = (SubLObject)removal_modules_parse_trees.NIL;
                value = (SubLObject)removal_modules_parse_trees.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_parse_trees.$list4);
                pred = current.first();
                current = (value = current.rest());
                if (removal_modules_parse_trees.NIL != genl_predicates.spec_predicateP(v_object, pred, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                    ans = (SubLObject)removal_modules_parse_trees.T;
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2170L)
    public static SubLObject predicate_with_parse_tree_direct_support_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(removal_modules_parse_trees.$predicates_to_parse_tree_methods$.getGlobalValue(), v_object, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2330L)
    public static SubLObject removal_parse_tree_relation_answer_list(final SubLObject asent) {
        return removal_parse_tree_relation_int(asent, (SubLObject)removal_modules_parse_trees.$kw22$NODES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2453L)
    public static SubLObject parse_tree_relation_supports(final SubLObject asent) {
        return removal_parse_tree_relation_int(asent, (SubLObject)removal_modules_parse_trees.$kw23$SUPPORTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 2568L)
    public static SubLObject removal_parse_tree_relation_int(final SubLObject asent, final SubLObject return_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_parse_trees.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
        SubLObject original_pred = (SubLObject)removal_modules_parse_trees.NIL;
        SubLObject node = (SubLObject)removal_modules_parse_trees.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_parse_trees.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_parse_trees.$list24);
        original_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_parse_trees.$list24);
        node = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_parse_trees.$list24);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_parse_trees.NIL == current) {
            final SubLObject root_node = parsing_utilities.syntactic_node_root_node(node);
            if (removal_modules_parse_trees.NIL != parsing_utilities.phrasal_nodeP(root_node)) {
                final SubLObject trees_to_nodes = dictionary.new_dictionary((SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                final SubLObject big_parse_tree = parsing_utilities.construct_subl_parse_tree_from_syntactic_node(root_node, trees_to_nodes);
                final SubLObject v_parse_tree = parse_tree_for_syntactic_node(node, trees_to_nodes);
                final SubLObject node_var = original_pred;
                final SubLObject deck_type = (SubLObject)removal_modules_parse_trees.$kw7$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)removal_modules_parse_trees.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = removal_modules_parse_trees.$const25$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_parse_trees.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_parse_trees.NIL != tv_var) ? removal_modules_parse_trees.$sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_parse_trees.NIL != tv_var && removal_modules_parse_trees.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_parse_trees.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw9$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_parse_trees.ONE_INTEGER, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw12$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_parse_trees.ONE_INTEGER, (SubLObject)removal_modules_parse_trees.$str13$continue_anyway, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_parse_trees.$kw14$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_parse_trees.$str15$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_parse_trees.$str13$continue_anyway, (SubLObject)removal_modules_parse_trees.$str10$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_parse_trees.$sym11$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_parse_trees.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds), thread);
                                if (removal_modules_parse_trees.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_parse_trees.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(original_pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_parse_trees.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(original_pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_parse_trees.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$26 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject pred = node_var_$26;
                                            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (removal_modules_parse_trees.NIL == inverseP && removal_modules_parse_trees.NIL != predicate_with_parse_tree_direct_support_p(pred)) {
                                                    final SubLObject plist = list_utilities.alist_lookup_without_values(removal_modules_parse_trees.$predicates_to_parse_tree_methods$.getGlobalValue(), pred, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                    final SubLObject method = conses_high.getf(plist, (SubLObject)removal_modules_parse_trees.$kw26$METHOD, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                    final SubLObject type_check = conses_high.getf(plist, (SubLObject)removal_modules_parse_trees.$kw27$TYPE_CHECK, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                    final SubLObject result = (SubLObject)((removal_modules_parse_trees.NIL != Functions.funcall(type_check, v_parse_tree)) ? apply_parse_tree_removal_method(v_parse_tree, method) : removal_modules_parse_trees.NIL);
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject results = cdolist_list_var = (SubLObject)(result.isList() ? result : ConsesLow.list(result));
                                                    SubLObject one_result = (SubLObject)removal_modules_parse_trees.NIL;
                                                    one_result = cdolist_list_var.first();
                                                    while (removal_modules_parse_trees.NIL != cdolist_list_var) {
                                                        final SubLObject answer_node = syntactic_node_for_parse_tree(one_result, trees_to_nodes);
                                                        if (removal_modules_parse_trees.NIL != unification_utilities.term_unify(answer_node, arg2, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                            if (return_type.eql((SubLObject)removal_modules_parse_trees.$kw22$NODES)) {
                                                                ans = (SubLObject)ConsesLow.cons(answer_node, ans);
                                                            }
                                                            else if (return_type.eql((SubLObject)removal_modules_parse_trees.$kw23$SUPPORTS)) {
                                                                if (!pred.eql(original_pred)) {
                                                                    ans = (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(pred, original_pred), ans);
                                                                }
                                                                final SubLObject support_formula = el_utilities.make_binary_formula(pred, node, answer_node);
                                                                ans = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_parse_trees.$kw28$PARSE_TREE, support_formula, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED), ans);
                                                            }
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        one_result = cdolist_list_var.first();
                                                    }
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_parse_trees.$const16$genlPreds));
                                                SubLObject module_var = (SubLObject)removal_modules_parse_trees.NIL;
                                                module_var = cdolist_list_var2.first();
                                                while (removal_modules_parse_trees.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_parse_trees.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_parse_trees.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node_$30 = function_terms.naut_to_nart(node_var_$26);
                                                        if (removal_modules_parse_trees.NIL != sbhl_link_vars.sbhl_node_object_p(node_$30)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_$30, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED));
                                                            if (removal_modules_parse_trees.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED));
                                                                if (removal_modules_parse_trees.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_parse_trees.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_parse_trees.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$32;
                                                                                for (iteration_state_$32 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_parse_trees.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$32); iteration_state_$32 = dictionary_contents.do_dictionary_contents_next(iteration_state_$32)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$32);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_parse_trees.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (removal_modules_parse_trees.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_parse_trees.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_parse_trees.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (removal_modules_parse_trees.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)removal_modules_parse_trees.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (removal_modules_parse_trees.NIL != csome_list_var) {
                                                                                                    if (removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_parse_trees.$str17$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$32);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_parse_trees.FIVE_INTEGER, (SubLObject)removal_modules_parse_trees.$str18$attempting_to_bind_direction_link, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_parse_trees.NIL != obsolete.cnat_p(node_$30, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$34;
                                                            final SubLObject new_list = cdolist_list_var_$34 = ((removal_modules_parse_trees.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)removal_modules_parse_trees.NIL;
                                                            generating_fn = cdolist_list_var_$34.first();
                                                            while (removal_modules_parse_trees.NIL != cdolist_list_var_$34) {
                                                                final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node_$30);
                                                                    if (removal_modules_parse_trees.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_parse_trees.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_parse_trees.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (removal_modules_parse_trees.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)removal_modules_parse_trees.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (removal_modules_parse_trees.NIL != csome_list_var2) {
                                                                            if (removal_modules_parse_trees.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_parse_trees.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_parse_trees.$str17$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$27, thread);
                                                                }
                                                                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                                generating_fn = cdolist_list_var_$34.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var = cdolist_list_var2.first();
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$23, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$25, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_parse_trees.TWO_INTEGER, (SubLObject)removal_modules_parse_trees.$str19$Node__a_does_not_pass_sbhl_type_t, original_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_parse_trees.UNPROVIDED)), (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_parse_trees.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_parse_trees.$list24);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4218L)
    public static SubLObject apply_parse_tree_removal_method(final SubLObject v_parse_tree, final SubLObject method) {
        return methods.funcall_instance_method_with_0_args(v_parse_tree, method);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4320L)
    public static SubLObject syntactic_node_for_parse_tree(final SubLObject v_parse_tree, final SubLObject trees_to_nodes) {
        return dictionary.dictionary_lookup_without_values(trees_to_nodes, v_parse_tree, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-parse-trees.lisp", position = 4465L)
    public static SubLObject parse_tree_for_syntactic_node(final SubLObject syntactic_node, final SubLObject trees_to_nodes) {
        return dictionary_utilities.dictionary_reverse_lookup(trees_to_nodes, syntactic_node, (SubLObject)removal_modules_parse_trees.UNPROVIDED);
    }
    
    public static SubLObject declare_removal_modules_parse_trees_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "clear_predicates_with_parse_tree_support_in_some_mt", "CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "remove_predicates_with_parse_tree_support_in_some_mt", "REMOVE-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "predicates_with_parse_tree_support_in_some_mt_internal", "PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "predicates_with_parse_tree_support_in_some_mt", "PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "predicate_with_parse_tree_support_p", "PREDICATE-WITH-PARSE-TREE-SUPPORT-P", 1, 0, false);
        new $predicate_with_parse_tree_support_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "predicate_with_parse_tree_direct_support_p", "PREDICATE-WITH-PARSE-TREE-DIRECT-SUPPORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "removal_parse_tree_relation_answer_list", "REMOVAL-PARSE-TREE-RELATION-ANSWER-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "parse_tree_relation_supports", "PARSE-TREE-RELATION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "removal_parse_tree_relation_int", "REMOVAL-PARSE-TREE-RELATION-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "apply_parse_tree_removal_method", "APPLY-PARSE-TREE-REMOVAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "syntactic_node_for_parse_tree", "SYNTACTIC-NODE-FOR-PARSE-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_parse_trees", "parse_tree_for_syntactic_node", "PARSE-TREE-FOR-SYNTACTIC-NODE", 2, 0, false);
        return (SubLObject)removal_modules_parse_trees.NIL;
    }
    
    public static SubLObject init_removal_modules_parse_trees_file() {
        removal_modules_parse_trees.$predicates_to_parse_tree_methods$ = SubLFiles.deflexical("*PREDICATES-TO-PARSE-TREE-METHODS*", (SubLObject)removal_modules_parse_trees.$list0);
        removal_modules_parse_trees.$predicates_with_parse_tree_support_in_some_mt_caching_state$ = SubLFiles.deflexical("*PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-CACHING-STATE*", (SubLObject)removal_modules_parse_trees.NIL);
        return (SubLObject)removal_modules_parse_trees.NIL;
    }
    
    public static SubLObject setup_removal_modules_parse_trees_file() {
        memoization_state.note_globally_cached_function((SubLObject)removal_modules_parse_trees.$sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT);
        inference_modules.inference_removal_module((SubLObject)removal_modules_parse_trees.$kw29$REMOVAL_PARSE_TREE_RELATION_POS, (SubLObject)removal_modules_parse_trees.$list30);
        preference_modules.inference_preference_module((SubLObject)removal_modules_parse_trees.$kw31$PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND, (SubLObject)removal_modules_parse_trees.$list32);
        return (SubLObject)removal_modules_parse_trees.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_parse_trees_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_parse_trees_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_parse_trees_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_parse_trees();
        removal_modules_parse_trees.$predicates_to_parse_tree_methods$ = null;
        removal_modules_parse_trees.$predicates_with_parse_tree_support_in_some_mt_caching_state$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticVerbalPhraseNodeSubjectNode")), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-CHECK"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticVerbalPhraseNodeObjectNodes")), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-CHECK"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeSyntacticHead")), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-CHECK"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticVerbalPhraseNodeIndirectObjectNode")), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-CHECK"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticVerbalPhraseNodeDirectObjectNode")), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECT-OBJECT"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-CHECK"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-PHRASE-TREE-P")));
        $sym1$PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT = SubLObjectFactory.makeSymbol("PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT");
        $sym2$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const3$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list4 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("VALUE"));
        $kw5$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw6$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw7$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym8$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw9$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str10$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym11$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw12$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str13$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw14$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str15$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const16$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str17$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str18$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str19$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym20$_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-CACHING-STATE*");
        $sym21$CLEAR_PREDICATES_WITH_PARSE_TREE_SUPPORT_IN_SOME_MT = SubLObjectFactory.makeSymbol("CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT");
        $kw22$NODES = SubLObjectFactory.makeKeyword("NODES");
        $kw23$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const25$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $kw26$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw27$TYPE_CHECK = SubLObjectFactory.makeKeyword("TYPE-CHECK");
        $kw28$PARSE_TREE = SubLObjectFactory.makeKeyword("PARSE-TREE");
        $kw29$REMOVAL_PARSE_TREE_RELATION_POS = SubLObjectFactory.makeKeyword("REMOVAL-PARSE-TREE-RELATION-POS");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-WITH-PARSE-TREE-SUPPORT-P")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-PARSE-TREE-RELATION-ANSWER-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("PARSE-TREE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("((:test predicate-with-parse-tree-support-p) :fully-bound :anything)") });
        $kw31$PARSE_TREE_REQUIRE_ARG1_FULLY_BOUND = SubLObjectFactory.makeKeyword("PARSE-TREE-REQUIRE-ARG1-FULLY-BOUND");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-WITH-PARSE-TREE-SUPPORT-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MUST-BIND-ARG1"));
    }
    
    public static final class $predicate_with_parse_tree_support_p$UnaryFunction extends UnaryFunction
    {
        public $predicate_with_parse_tree_support_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-WITH-PARSE-TREE-SUPPORT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_parse_trees.predicate_with_parse_tree_support_p(arg1);
        }
    }
}

/*

	Total time: 795 ms
	
*/