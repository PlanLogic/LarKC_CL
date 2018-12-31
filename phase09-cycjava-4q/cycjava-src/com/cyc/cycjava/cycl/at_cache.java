package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_cache";
    public static final String myFingerPrint = "b0dc0201e0d64d34c8816fc7a97b0222523e786fe29bae26f8216c2e0fea54a7";
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 1585L)
    public static SubLSymbol $arg_type_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 1808L)
    private static SubLSymbol $arg_type_cache_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 2114L)
    private static SubLSymbol $arg_type_cache_preds_reversed$;
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 2201L)
    private static SubLSymbol $arg_type_cache_initializedP$;
    private static final SubLSymbol $sym0$_ARG_TYPE_CACHE_;
    private static final SubLInteger $int1$1024;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_ARG_TYPE_CACHE_INITIALIZED__;
    private static final SubLObject $const4$argsIsa;
    private static final SubLObject $const5$argAndRestIsa;
    private static final SubLObject $const6$argAndRestGenl;
    private static final SubLObject $const7$argsQuotedIsa;
    private static final SubLObject $const8$argAndRestQuotedIsa;
    private static final SubLList $list9;
    private static final SubLObject $const10$UniversalVocabularyMt;
    private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const12$EverythingPSC;
    private static final SubLObject $const13$Relation;
    private static final SubLObject $const14$isa;
    private static final SubLSymbol $kw15$BREADTH;
    private static final SubLSymbol $kw16$QUEUE;
    private static final SubLSymbol $kw17$STACK;
    private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw19$ERROR;
    private static final SubLString $str20$_A_is_not_a__A;
    private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw22$CERROR;
    private static final SubLString $str23$continue_anyway;
    private static final SubLSymbol $kw24$WARN;
    private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str27$attempting_to_bind_direction_link;
    private static final SubLList $list28;
    private static final SubLString $str29$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $kw30$GAF;
    private static final SubLSymbol $kw31$TRUE;
    private static final SubLSymbol $sym32$CYC_ADD_TO_ARG_TYPE_CACHE;
    private static final SubLSymbol $sym33$CYC_REMOVE_FROM_ARG_TYPE_CACHE;
    private static final SubLSymbol $sym34$GAF_ASSERTION_;
    private static final SubLSymbol $sym35$ARG_TYPE_CACHED_PRED_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 2010L)
    public static SubLObject arg_type_cached_pred_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, at_cache.$arg_type_cache_preds$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_cache.EQL), (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 2256L)
    public static SubLObject some_args_isa_assertion_somewhereP(final SubLObject relation) {
        return somewhere_cache.some_pred_assertion_somewhereP(at_cache.$const4$argsIsa, relation, (SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3003L)
    public static SubLObject some_arg_and_rest_isa_assertion_somewhereP(final SubLObject relation) {
        return somewhere_cache.some_pred_assertion_somewhereP(at_cache.$const5$argAndRestIsa, relation, (SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3142L)
    public static SubLObject some_arg_and_rest_genl_assertion_somewhereP(final SubLObject relation) {
        return somewhere_cache.some_pred_assertion_somewhereP(at_cache.$const6$argAndRestGenl, relation, (SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3283L)
    public static SubLObject some_args_quoted_isa_assertion_somewhereP(final SubLObject relation) {
        return somewhere_cache.some_pred_assertion_somewhereP(at_cache.$const7$argsQuotedIsa, relation, (SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3421L)
    public static SubLObject some_arg_and_rest_quoted_isa_assertion_somewhereP(final SubLObject relation) {
        return somewhere_cache.some_pred_assertion_somewhereP(at_cache.$const8$argAndRestQuotedIsa, relation, (SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3573L)
    public static SubLObject cached_arg_isas_in_mt(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == at_cache.UNPROVIDED) {
            mt = (SubLObject)at_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)at_cache.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = cached_arg_isas_in_relevant_mts(relation, argnum);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 3899L)
    public static SubLObject cached_arg_isas_in_relevant_mts(final SubLObject relation, final SubLObject argnum) {
        final SubLObject argnum_table = at_cache_lookup_argnum_table(relation);
        final SubLObject collection_table = ConsesLow.nth(number_utilities.f_1_(argnum), argnum_table);
        return at_cache_relevant_collections(collection_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 4143L)
    public static SubLObject at_cache_relevant_collections(final SubLObject collection_table) {
        SubLObject cols = (SubLObject)at_cache.NIL;
        if (at_cache.NIL == forts.fort_p(collection_table)) {
            SubLObject cdolist_list_var = collection_table;
            SubLObject entry = (SubLObject)at_cache.NIL;
            entry = cdolist_list_var.first();
            while (at_cache.NIL != cdolist_list_var) {
                if (at_cache.NIL == forts.fort_p(entry)) {
                    SubLObject current;
                    final SubLObject datum = current = entry;
                    SubLObject col = (SubLObject)at_cache.NIL;
                    SubLObject mts = (SubLObject)at_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_cache.$list9);
                    col = current.first();
                    current = (mts = current.rest());
                    SubLObject relevant_col = (SubLObject)at_cache.NIL;
                    if (at_cache.NIL == relevant_col) {
                        SubLObject csome_list_var = mts;
                        SubLObject mt = (SubLObject)at_cache.NIL;
                        mt = csome_list_var.first();
                        while (at_cache.NIL == relevant_col && at_cache.NIL != csome_list_var) {
                            if (at_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                relevant_col = col;
                            }
                            csome_list_var = csome_list_var.rest();
                            mt = csome_list_var.first();
                        }
                    }
                    final SubLObject var = relevant_col;
                    if (at_cache.NIL != var) {
                        cols = (SubLObject)ConsesLow.cons(var, cols);
                    }
                }
                else {
                    final SubLObject col2 = entry;
                    if (at_cache.NIL != mt_relevance_macros.relevant_mtP(at_cache.$const10$UniversalVocabularyMt)) {
                        cols = (SubLObject)ConsesLow.cons(col2, cols);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        else if (at_cache.NIL != mt_relevance_macros.relevant_mtP(at_cache.$const10$UniversalVocabularyMt)) {
            cols = (SubLObject)ConsesLow.cons(collection_table, cols);
        }
        return Sequences.nreverse(cols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 5002L)
    public static SubLObject at_cache_lookup_argnum_table(final SubLObject relation) {
        return Hashtables.gethash_without_values(relation, at_cache.$arg_type_cache$.getGlobalValue(), (SubLObject)at_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 5119L)
    public static SubLObject initialize_at_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)at_cache.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_cache.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_cache.$const12$EverythingPSC, thread);
            final SubLObject node_var = at_cache.$const13$Relation;
            final SubLObject _prev_bind_0_$1 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = (SubLObject)at_cache.$kw17$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)at_cache.NIL;
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((at_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((at_cache.NIL != tv_var) ? at_cache.$sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (at_cache.NIL != tv_var && at_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && at_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)at_cache.$kw19$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)at_cache.$sym21$SBHL_TRUE_TV_P, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)at_cache.$kw22$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)at_cache.ONE_INTEGER, (SubLObject)at_cache.$str23$continue_anyway, (SubLObject)at_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)at_cache.$sym21$SBHL_TRUE_TV_P, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)at_cache.$kw24$WARN)) {
                                        Errors.warn((SubLObject)at_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)at_cache.$sym21$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)at_cache.$str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)at_cache.$str23$continue_anyway, (SubLObject)at_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)at_cache.$sym21$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_cache.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)), thread);
                                    if (at_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || at_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)at_cache.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$3, (SubLObject)at_cache.UNPROVIDED);
                                            while (at_cache.NIL != node_var_$3) {
                                                final SubLObject tt_node_var = node_var_$3;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa));
                                                SubLObject module_var = (SubLObject)at_cache.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (at_cache.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (at_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED));
                                                            if (at_cache.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED));
                                                                if (at_cache.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); at_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (at_cache.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$15;
                                                                                for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); at_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (at_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (at_cache.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject reln;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (at_cache.NIL != set_contents.do_set_contents_element_validP(state, reln) && at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (at_cache.NIL != forts.fort_p(reln)) {
                                                                                                            at_cache_initialize_relation(reln);
                                                                                                            count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject reln2 = (SubLObject)at_cache.NIL;
                                                                                                reln2 = csome_list_var.first();
                                                                                                while (at_cache.NIL != csome_list_var) {
                                                                                                    if (at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (at_cache.NIL != forts.fort_p(reln2)) {
                                                                                                            at_cache_initialize_relation(reln2);
                                                                                                            count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    reln2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)at_cache.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                                                                sbhl_paranoia.sbhl_error((SubLObject)at_cache.FIVE_INTEGER, (SubLObject)at_cache.$str27$attempting_to_bind_direction_link, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED);
                                                            }
                                                            if (at_cache.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)at_cache.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (at_cache.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)at_cache.NIL;
                                                                    SubLObject mt2 = (SubLObject)at_cache.NIL;
                                                                    SubLObject tv2 = (SubLObject)at_cache.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_cache.$list28);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_cache.$list28);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_cache.$list28);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (at_cache.NIL == current) {
                                                                        if (at_cache.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (at_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (at_cache.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject reln;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)at_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); at_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                reln = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (at_cache.NIL != set_contents.do_set_contents_element_validP(state, reln) && at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (at_cache.NIL != forts.fort_p(reln)) {
                                                                                                        at_cache_initialize_relation(reln);
                                                                                                        count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$19 = sol;
                                                                                            SubLObject reln2 = (SubLObject)at_cache.NIL;
                                                                                            reln2 = csome_list_var_$19.first();
                                                                                            while (at_cache.NIL != csome_list_var_$19) {
                                                                                                if (at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(reln2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (at_cache.NIL != forts.fort_p(reln2)) {
                                                                                                        at_cache_initialize_relation(reln2);
                                                                                                        count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$19 = csome_list_var_$19.rest();
                                                                                                reln2 = csome_list_var_$19.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)at_cache.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)at_cache.$list28);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (at_cache.NIL != obsolete.cnat_p(node, (SubLObject)at_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$20;
                                                            final SubLObject new_list = cdolist_list_var_$20 = ((at_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)at_cache.NIL;
                                                            generating_fn = cdolist_list_var_$20.first();
                                                            while (at_cache.NIL != cdolist_list_var_$20) {
                                                                final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (at_cache.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject reln3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)at_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); at_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            reln3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (at_cache.NIL != set_contents.do_set_contents_element_validP(state2, reln3) && at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (at_cache.NIL != forts.fort_p(reln3)) {
                                                                                    at_cache_initialize_relation(reln3);
                                                                                    count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject reln4 = (SubLObject)at_cache.NIL;
                                                                        reln4 = csome_list_var3.first();
                                                                        while (at_cache.NIL != csome_list_var3) {
                                                                            if (at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(reln4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (at_cache.NIL != forts.fort_p(reln4)) {
                                                                                    at_cache_initialize_relation(reln4);
                                                                                    count = Numbers.add(count, (SubLObject)at_cache.ONE_INTEGER);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            reln4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)at_cache.$str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                                                }
                                                                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                                                generating_fn = cdolist_list_var_$20.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(at_cache.$const14$isa)));
                                                SubLObject module_var2 = (SubLObject)at_cache.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (at_cache.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((at_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(at_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$3);
                                                        if (at_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED));
                                                            if (at_cache.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED));
                                                                if (at_cache.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); at_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (at_cache.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$16;
                                                                                for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); at_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (at_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (at_cache.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)at_cache.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); at_cache.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (at_cache.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)at_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)at_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)at_cache.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (at_cache.NIL != csome_list_var4) {
                                                                                                    if (at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)at_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)at_cache.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)at_cache.$str26$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)at_cache.FIVE_INTEGER, (SubLObject)at_cache.$str27$attempting_to_bind_direction_link, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (at_cache.NIL != obsolete.cnat_p(node2, (SubLObject)at_cache.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$21;
                                                            final SubLObject new_list2 = cdolist_list_var_$21 = ((at_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)at_cache.NIL;
                                                            generating_fn2 = cdolist_list_var_$21.first();
                                                            while (at_cache.NIL != cdolist_list_var_$21) {
                                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (at_cache.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)at_cache.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); at_cache.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (at_cache.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)at_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)at_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)at_cache.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (at_cache.NIL != csome_list_var5) {
                                                                            if (at_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)at_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)at_cache.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)at_cache.$str26$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                }
                                                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                generating_fn2 = cdolist_list_var_$21.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$3 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)at_cache.TWO_INTEGER, (SubLObject)at_cache.$str29$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)at_cache.UNPROVIDED)), (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_cache.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)at_cache.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        note_at_cache_initialized();
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 5423L)
    public static SubLObject at_cache_use_possibleP(final SubLObject constraint_pred, final SubLObject argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(at_cache.NIL != at_cache.$arg_type_cache_initializedP$.getGlobalValue() && at_cache.NIL != arg_type_cached_argnum_p(argnum) && at_cache.NIL != arg_type_cached_pred_p(constraint_pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 5706L)
    public static SubLObject arg_type_cached_argnum_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isInteger() && v_object.numGE((SubLObject)at_cache.ONE_INTEGER) && v_object.numLE((SubLObject)at_cache.SIX_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 5845L)
    public static SubLObject at_cache_initialize_relation(final SubLObject relation) {
        final SubLObject max_argnum = max_constrained_argnum(relation);
        final SubLObject argnum_table = at_cache_initialize_argnum_table(relation, max_argnum);
        at_cache_set_argnum_table(relation, argnum_table);
        return argnum_table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 6110L)
    public static SubLObject at_cache_initialize_argnum_table(final SubLObject relation, final SubLObject max_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject argnum_list = (SubLObject)at_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)at_cache.$sym11$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(at_cache.$const12$EverythingPSC, thread);
            SubLObject cdolist_list_var = at_cache.$arg_type_cache_preds$.getGlobalValue();
            SubLObject constraint_pred = (SubLObject)at_cache.NIL;
            constraint_pred = cdolist_list_var.first();
            while (at_cache.NIL != cdolist_list_var) {
                final SubLObject argnum = constrained_argnum(constraint_pred);
                if (argnum.numLE(max_argnum)) {
                    final SubLObject col_alist = at_cache_initialize_collection_table(relation, constraint_pred);
                    argnum_list = (SubLObject)ConsesLow.cons(col_alist, argnum_list);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        argnum_list = Sequences.nreverse(argnum_list);
        return argnum_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 6573L)
    public static SubLObject at_cache_initialize_collection_table(final SubLObject relation, final SubLObject constraint_pred) {
        SubLObject collection_alist = (SubLObject)at_cache.NIL;
        if (at_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)at_cache.ONE_INTEGER, constraint_pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)at_cache.ONE_INTEGER, constraint_pred);
            SubLObject done_var = (SubLObject)at_cache.NIL;
            final SubLObject token_var = (SubLObject)at_cache.NIL;
            while (at_cache.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (at_cache.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)at_cache.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_cache.$kw30$GAF, (SubLObject)at_cache.$kw31$TRUE, (SubLObject)at_cache.NIL);
                        SubLObject done_var_$31 = (SubLObject)at_cache.NIL;
                        final SubLObject token_var_$32 = (SubLObject)at_cache.NIL;
                        while (at_cache.NIL == done_var_$31) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                            final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(ass));
                            if (at_cache.NIL != valid_$33 && at_cache.NIL != kb_accessors.assertion_still_thereP(ass, (SubLObject)at_cache.$kw31$TRUE)) {
                                final SubLObject col = assertions_high.gaf_arg2(ass);
                                final SubLObject mt = assertions_high.assertion_mt(ass);
                                if (at_cache.NIL != forts.fort_p(col)) {
                                    collection_alist = list_utilities.alist_push(collection_alist, col, mt, Symbols.symbol_function((SubLObject)at_cache.EQL));
                                }
                            }
                            done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(at_cache.NIL == valid_$33);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)at_cache.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (at_cache.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_cache.NIL == valid);
            }
        }
        SubLObject cons;
        SubLObject entry;
        SubLObject current;
        SubLObject datum;
        SubLObject col2;
        SubLObject mts;
        for (cons = (SubLObject)at_cache.NIL, cons = collection_alist; !cons.isAtom(); cons = cons.rest()) {
            entry = cons.first();
            datum = (current = entry);
            col2 = (SubLObject)at_cache.NIL;
            mts = (SubLObject)at_cache.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)at_cache.$list9);
            col2 = current.first();
            current = (mts = current.rest());
            if (at_cache.NIL != list_utilities.singletonP(mts) && at_cache.$const10$UniversalVocabularyMt.eql(mts.first())) {
                ConsesLow.rplaca(cons, col2);
            }
        }
        if (at_cache.NIL != list_utilities.singletonP(collection_alist) && at_cache.NIL != forts.fort_p(collection_alist.first())) {
            collection_alist = collection_alist.first();
        }
        return collection_alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 7826L)
    public static SubLObject at_cache_set_argnum_table(final SubLObject relation, final SubLObject argnum_table) {
        return Hashtables.sethash(relation, at_cache.$arg_type_cache$.getGlobalValue(), argnum_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 7951L)
    public static SubLObject max_constrained_argnum(final SubLObject relation) {
        SubLObject max_argnum = (SubLObject)at_cache.NIL;
        SubLObject cdolist_list_var = at_cache.$arg_type_cache_preds_reversed$.getGlobalValue();
        SubLObject constraint_pred = (SubLObject)at_cache.NIL;
        constraint_pred = cdolist_list_var.first();
        while (at_cache.NIL != cdolist_list_var) {
            final SubLObject pred_var = constraint_pred;
            if (at_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)at_cache.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)at_cache.ONE_INTEGER, pred_var);
                SubLObject done_var = max_argnum;
                final SubLObject token_var = (SubLObject)at_cache.NIL;
                while (at_cache.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (at_cache.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)at_cache.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)at_cache.$kw30$GAF, (SubLObject)at_cache.$kw31$TRUE, (SubLObject)at_cache.NIL);
                            SubLObject done_var_$34 = max_argnum;
                            final SubLObject token_var_$35 = (SubLObject)at_cache.NIL;
                            while (at_cache.NIL == done_var_$34) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(ass));
                                if (at_cache.NIL != valid_$36) {
                                    max_argnum = constrained_argnum(constraint_pred);
                                }
                                done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(at_cache.NIL == valid_$36 || at_cache.NIL != max_argnum);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)at_cache.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (at_cache.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(at_cache.NIL == valid || at_cache.NIL != max_argnum);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint_pred = cdolist_list_var.first();
        }
        return (SubLObject)((at_cache.NIL != max_argnum) ? max_argnum : at_cache.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 8333L)
    public static SubLObject constrained_argnum(final SubLObject constraint_pred) {
        return kb_accessors.isa_pred_arg(constraint_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 8427L)
    public static SubLObject cyc_add_to_arg_type_cache(final SubLObject argument, final SubLObject assertion) {
        return cyc_update_arg_type_cache(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 8600L)
    public static SubLObject cyc_remove_from_arg_type_cache(final SubLObject argument, final SubLObject assertion) {
        return cyc_update_arg_type_cache(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 8743L)
    public static SubLObject cyc_update_arg_type_cache(final SubLObject gaf) {
        assert at_cache.NIL != assertions_high.gaf_assertionP(gaf) : gaf;
        final SubLObject arg_isa_pred = assertions_high.gaf_predicate(gaf);
        assert at_cache.NIL != arg_type_cached_pred_p(arg_isa_pred) : arg_isa_pred;
        final SubLObject relation = assertions_high.gaf_arg1(gaf);
        if (at_cache.NIL != forts.fort_p(relation)) {
            at_cache_initialize_relation(relation);
            return (SubLObject)at_cache.T;
        }
        return (SubLObject)at_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-cache.lisp", position = 9059L)
    public static SubLObject note_at_cache_initialized() {
        at_cache.$arg_type_cache_initializedP$.setGlobalValue((SubLObject)at_cache.T);
        return (SubLObject)at_cache.T;
    }
    
    public static SubLObject declare_at_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "arg_type_cached_pred_p", "ARG-TYPE-CACHED-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "some_args_isa_assertion_somewhereP", "SOME-ARGS-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "some_arg_and_rest_isa_assertion_somewhereP", "SOME-ARG-AND-REST-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "some_arg_and_rest_genl_assertion_somewhereP", "SOME-ARG-AND-REST-GENL-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "some_args_quoted_isa_assertion_somewhereP", "SOME-ARGS-QUOTED-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "some_arg_and_rest_quoted_isa_assertion_somewhereP", "SOME-ARG-AND-REST-QUOTED-ISA-ASSERTION-SOMEWHERE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "cached_arg_isas_in_mt", "CACHED-ARG-ISAS-IN-MT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "cached_arg_isas_in_relevant_mts", "CACHED-ARG-ISAS-IN-RELEVANT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_relevant_collections", "AT-CACHE-RELEVANT-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_lookup_argnum_table", "AT-CACHE-LOOKUP-ARGNUM-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "initialize_at_cache", "INITIALIZE-AT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_use_possibleP", "AT-CACHE-USE-POSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "arg_type_cached_argnum_p", "ARG-TYPE-CACHED-ARGNUM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_initialize_relation", "AT-CACHE-INITIALIZE-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_initialize_argnum_table", "AT-CACHE-INITIALIZE-ARGNUM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_initialize_collection_table", "AT-CACHE-INITIALIZE-COLLECTION-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "at_cache_set_argnum_table", "AT-CACHE-SET-ARGNUM-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "max_constrained_argnum", "MAX-CONSTRAINED-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "constrained_argnum", "CONSTRAINED-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "cyc_add_to_arg_type_cache", "CYC-ADD-TO-ARG-TYPE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "cyc_remove_from_arg_type_cache", "CYC-REMOVE-FROM-ARG-TYPE-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "cyc_update_arg_type_cache", "CYC-UPDATE-ARG-TYPE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_cache", "note_at_cache_initialized", "NOTE-AT-CACHE-INITIALIZED", 0, 0, false);
        return (SubLObject)at_cache.NIL;
    }
    
    public static SubLObject init_at_cache_file() {
        at_cache.$arg_type_cache$ = SubLFiles.deflexical("*ARG-TYPE-CACHE*", (at_cache.NIL != Symbols.boundp((SubLObject)at_cache.$sym0$_ARG_TYPE_CACHE_)) ? at_cache.$arg_type_cache$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)at_cache.$int1$1024, (SubLObject)at_cache.UNPROVIDED, (SubLObject)at_cache.UNPROVIDED));
        at_cache.$arg_type_cache_preds$ = SubLFiles.deflexical("*ARG-TYPE-CACHE-PREDS*", (SubLObject)at_cache.$list2);
        at_cache.$arg_type_cache_preds_reversed$ = SubLFiles.deflexical("*ARG-TYPE-CACHE-PREDS-REVERSED*", Sequences.reverse(at_cache.$arg_type_cache_preds$.getGlobalValue()));
        at_cache.$arg_type_cache_initializedP$ = SubLFiles.deflexical("*ARG-TYPE-CACHE-INITIALIZED?*", (SubLObject)((at_cache.NIL != Symbols.boundp((SubLObject)at_cache.$sym3$_ARG_TYPE_CACHE_INITIALIZED__)) ? at_cache.$arg_type_cache_initializedP$.getGlobalValue() : at_cache.NIL));
        return (SubLObject)at_cache.NIL;
    }
    
    public static SubLObject setup_at_cache_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)at_cache.$sym0$_ARG_TYPE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)at_cache.$sym3$_ARG_TYPE_CACHE_INITIALIZED__);
        utilities_macros.register_kb_function((SubLObject)at_cache.$sym32$CYC_ADD_TO_ARG_TYPE_CACHE);
        utilities_macros.register_kb_function((SubLObject)at_cache.$sym33$CYC_REMOVE_FROM_ARG_TYPE_CACHE);
        return (SubLObject)at_cache.NIL;
    }
    
    public void declareFunctions() {
        declare_at_cache_file();
    }
    
    public void initializeVariables() {
        init_at_cache_file();
    }
    
    public void runTopLevelForms() {
        setup_at_cache_file();
    }
    
    static {
        me = (SubLFile)new at_cache();
        at_cache.$arg_type_cache$ = null;
        at_cache.$arg_type_cache_preds$ = null;
        at_cache.$arg_type_cache_preds_reversed$ = null;
        at_cache.$arg_type_cache_initializedP$ = null;
        $sym0$_ARG_TYPE_CACHE_ = SubLObjectFactory.makeSymbol("*ARG-TYPE-CACHE*");
        $int1$1024 = SubLObjectFactory.makeInteger(1024);
        $list2 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Isa")));
        $sym3$_ARG_TYPE_CACHE_INITIALIZED__ = SubLObjectFactory.makeSymbol("*ARG-TYPE-CACHE-INITIALIZED?*");
        $const4$argsIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa"));
        $const5$argAndRestIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestIsa"));
        $const6$argAndRestGenl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestGenl"));
        $const7$argsQuotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa"));
        $const8$argAndRestQuotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa"));
        $list9 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("MTS"));
        $const10$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym11$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const12$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const13$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $const14$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw15$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw16$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw17$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw19$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str20$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym21$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw22$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str23$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw24$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str25$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str26$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str27$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str29$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $kw30$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw31$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym32$CYC_ADD_TO_ARG_TYPE_CACHE = SubLObjectFactory.makeSymbol("CYC-ADD-TO-ARG-TYPE-CACHE");
        $sym33$CYC_REMOVE_FROM_ARG_TYPE_CACHE = SubLObjectFactory.makeSymbol("CYC-REMOVE-FROM-ARG-TYPE-CACHE");
        $sym34$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym35$ARG_TYPE_CACHED_PRED_P = SubLObjectFactory.makeSymbol("ARG-TYPE-CACHED-PRED-P");
    }
}

/*

	Total time: 1081 ms
	
*/