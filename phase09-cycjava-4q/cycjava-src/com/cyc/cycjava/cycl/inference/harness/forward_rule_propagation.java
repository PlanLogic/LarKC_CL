package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.kb_hl_supports_high;
import com.cyc.cycjava.cycl.kb_hl_support_handles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward_rule_propagation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation";
    public static final String myFingerPrint = "4645cb8f47c66914087d89fa25a4bad6224917b2991e9cdd25ec7882bcb9b431";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3791L)
    public static SubLSymbol $forward_trigger_lazy_iteration_threshold$;
    private static final SubLObject $const0$InferencePSC;
    private static final SubLSymbol $sym1$RULE_ASSERTION_;
    private static final SubLSymbol $sym2$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str3$Triggering_rule_against__A__S_sup;
    private static final SubLSymbol $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym7$CSETQ;
    private static final SubLString $str8$_A;
    private static final SubLSymbol $sym9$ASSERTION_P;
    private static final SubLSymbol $kw10$FORWARD;
    private static final SubLSymbol $sym11$QUEUE_P;
    private static final SubLString $str12$time_to_use_a_real_query_iterator;
    private static final SubLString $str13$Determining_trigger_GAFs_for_;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$NULL;
    private static final SubLSymbol $sym16$FIRST_GAF_IN_SUPPORTS;
    private static final SubLSymbol $sym17$KBEQ;
    private static final SubLSymbol $kw18$POS;
    private static final SubLSymbol $kw19$ALL;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$JOIN_ORDERED;
    private static final SubLSymbol $sym22$TACTIC_HL_MODULE_NAME;
    private static final SubLSymbol $kw23$SPLIT;
    private static final SubLString $str24$Can_t_determine_trigger_asent_for;
    private static final SubLString $str25$Can_t_determine_trigger_asent_for;
    private static final SubLString $str26$Can_t_create_inference_to_determi;
    private static final SubLInteger $int27$100;
    private static final SubLObject $const28$evaluate;
    private static final SubLObject $const29$BaseKB;
    private static final SubLSymbol $sym30$EQUALS_EL_;
    private static final SubLSymbol $sym31$GAF_ASSERTION_;
    private static final SubLSymbol $sym32$HL_SUPPORT_P;
    private static final SubLSymbol $kw33$ISA;
    private static final SubLList $list34;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 1342L)
    public static SubLObject forward_propagate_rule_via_trigger_gafs(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward_rule_propagation.UNPROVIDED) {
            propagation_mt = forward_rule_propagation.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_rule_propagation.NIL != assertions_high.rule_assertionP(rule) : rule;
        possibly_change_assertion_direction_to_forward_without_repropagation(rule);
        final SubLObject rule_string = format_cycl_expression.format_cycl_expression_to_string(assertions_high.assertion_ist_formula(rule), (SubLObject)forward_rule_propagation.UNPROVIDED);
        final SubLObject before_dependents = assertions_high.assertion_dependent_count(rule);
        SubLObject sofar = (SubLObject)forward_rule_propagation.ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject iterator = new_forward_rule_trigger_gaf_iterator(rule, propagation_mt);
        final SubLObject total = thread.secondMultipleValue();
        final SubLObject focal_asent = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        assert forward_rule_propagation.NIL != subl_promotions.non_negative_integer_p(total) : total;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)forward_rule_propagation.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)forward_rule_propagation.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)forward_rule_propagation.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(PrintLow.format((SubLObject)forward_rule_propagation.NIL, (SubLObject)forward_rule_propagation.$str3$Triggering_rule_against__A__S_sup, new SubLObject[] { total, focal_asent, rule_string }));
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)forward_rule_propagation.NIL; forward_rule_propagation.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(forward_rule_propagation.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject trigger_gaf = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (forward_rule_propagation.NIL != valid) {
                        SubLObject message_var = (SubLObject)forward_rule_propagation.NIL;
                        final SubLObject was_appendingP = Eval.eval((SubLObject)forward_rule_propagation.$sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                        Eval.eval((SubLObject)forward_rule_propagation.$list5);
                        try {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)forward_rule_propagation.$sym6$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)forward_rule_propagation.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                Eval.eval((SubLObject)ConsesLow.list((SubLObject)forward_rule_propagation.$sym7$CSETQ, (SubLObject)forward_rule_propagation.$sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        if (message_var.isString()) {
                            Errors.warn((SubLObject)forward_rule_propagation.$str8$_A, message_var);
                        }
                        sofar = Numbers.add(sofar, (SubLObject)forward_rule_propagation.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject after_dependents = assertions_high.assertion_dependent_count(rule);
        final SubLObject new_dependents = Numbers.subtract(after_dependents, before_dependents);
        return Values.values(new_dependents, sofar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 2650L)
    public static SubLObject possibly_change_assertion_direction_to_forward_without_repropagation(final SubLObject assertion) {
        assert forward_rule_propagation.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (forward_rule_propagation.NIL == assertions_high.forward_assertionP(assertion)) {
            assertions_interface.kb_set_assertion_direction(assertion, (SubLObject)forward_rule_propagation.$kw10$FORWARD);
            return assertions_high.forward_assertionP(assertion);
        }
        return (SubLObject)forward_rule_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 2922L)
    public static SubLObject repropagate_trigger_gaf_against_rule(final SubLObject trigger_gaf, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward_rule_propagation.NIL;
        final SubLObject _prev_bind_0 = forward.$forward_inference_shares_same_problem_storeP$.currentBinding(thread);
        try {
            forward.$forward_inference_shares_same_problem_storeP$.bind((SubLObject)forward_rule_propagation.NIL, thread);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert forward_rule_propagation.NIL != queues.queue_p(environment) : environment;
            final SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_rule_propagation.NIL, thread);
                try {
                    result = forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        forward.clear_current_forward_problem_store();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            forward.$forward_inference_shares_same_problem_storeP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3264L)
    public static SubLObject forward_rule_trigger_gafs(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward_rule_propagation.UNPROVIDED) {
            propagation_mt = forward_rule_propagation.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_rule_propagation.NIL != assertions_high.rule_assertionP(rule) : rule;
        thread.resetMultipleValues();
        final SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
        final SubLObject estimated_children = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (forward_rule_propagation.NIL != focal_asent) {
            return forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
        }
        return (SubLObject)forward_rule_propagation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3962L)
    public static SubLObject new_forward_rule_trigger_gaf_iterator(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward_rule_propagation.UNPROVIDED) {
            propagation_mt = forward_rule_propagation.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_rule_propagation.NIL != assertions_high.rule_assertionP(rule) : rule;
        thread.resetMultipleValues();
        final SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
        final SubLObject estimated_children = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (forward_rule_propagation.NIL == focal_asent) {
            return iteration.new_list_iterator((SubLObject)forward_rule_propagation.NIL);
        }
        if (!forward_rule_propagation.$forward_trigger_lazy_iteration_threshold$.getGlobalValue().isNumber() || estimated_children.numLE(forward_rule_propagation.$forward_trigger_lazy_iteration_threshold$.getGlobalValue())) {
            final SubLObject trigger_gafs = forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
            return Values.values(iteration.new_list_iterator(trigger_gafs), Sequences.length(trigger_gafs), focal_asent);
        }
        return Errors.error((SubLObject)forward_rule_propagation.$str12$time_to_use_a_real_query_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 4658L)
    public static SubLObject forward_rule_trigger_gafs_int(final SubLObject focal_asent, final SubLObject propagation_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_result = (SubLObject)forward_rule_propagation.NIL;
        SubLObject trigger_gafs = (SubLObject)forward_rule_propagation.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
        try {
            utilities_macros.$noting_progress_delayed_mode_seconds$.bind((SubLObject)forward_rule_propagation.TWO_INTEGER, thread);
            utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate((SubLObject)forward_rule_propagation.$str13$Determining_trigger_GAFs_for_, format_nil.format_nil_s_no_copy(focal_asent)), thread);
            final SubLObject str = Sequences.cconcatenate((SubLObject)forward_rule_propagation.$str13$Determining_trigger_GAFs_for_, format_nil.format_nil_s_no_copy(focal_asent));
            final SubLObject _prev_bind_0_$6 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)forward_rule_propagation.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)forward_rule_propagation.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)forward_rule_propagation.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)forward_rule_propagation.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((forward_rule_propagation.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : forward_rule_propagation.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject environment = forward.get_forward_inference_environment();
                assert forward_rule_propagation.NIL != queues.queue_p(environment) : environment;
                final SubLObject _prev_bind_0_$7 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                    utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_rule_propagation.NIL, thread);
                    try {
                        final SubLObject overriding_query_properties = (SubLObject)forward_rule_propagation.$list14;
                        final SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
                        query_result = inference_kernel.new_cyc_query(focal_asent, propagation_mt, query_properties);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            forward.clear_current_forward_problem_store();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$8, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$7, thread);
                }
                final SubLObject raw_trigger_gafs = Sequences.remove_if((SubLObject)forward_rule_propagation.$sym15$NULL, Mapping.mapcar(Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym16$FIRST_GAF_IN_SUPPORTS), query_result), (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED);
                trigger_gafs = assertion_utilities.sort_assertions(list_utilities.fast_delete_duplicates(raw_trigger_gafs, Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym17$KBEQ), (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED));
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$7, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return trigger_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 5470L)
    public static SubLObject forward_rule_trigger_asent(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward_rule_propagation.UNPROVIDED) {
            propagation_mt = forward_rule_propagation.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_rule_propagation.NIL != assertions_high.rule_assertionP(rule) : rule;
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject neg_lits = clauses.neg_lits(cnf);
        SubLObject trigger_asent = (SubLObject)forward_rule_propagation.NIL;
        SubLObject estimated_children = (SubLObject)forward_rule_propagation.NIL;
        if (forward_rule_propagation.NIL != neg_lits) {
            if (forward_rule_propagation.NIL != list_utilities.singletonP(neg_lits)) {
                trigger_asent = neg_lits.first();
                estimated_children = inference_utilities.literal_removal_cost(trigger_asent, (SubLObject)forward_rule_propagation.$kw18$POS, propagation_mt, (SubLObject)forward_rule_propagation.$kw19$ALL);
            }
            else {
                final SubLObject environment = forward.get_forward_inference_environment();
                assert forward_rule_propagation.NIL != queues.queue_p(environment) : environment;
                final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                try {
                    kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                    utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_rule_propagation.NIL, thread);
                    try {
                        final SubLObject query_dnf = clauses.make_dnf((SubLObject)forward_rule_propagation.NIL, obfuscate_non_trigger_literal_lits(neg_lits, rule, propagation_mt));
                        final SubLObject overriding_query_properties = (SubLObject)forward_rule_propagation.$list20;
                        final SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(), overriding_query_properties);
                        SubLObject inference = (SubLObject)forward_rule_propagation.NIL;
                        try {
                            inference = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)forward_rule_propagation.TWO_INTEGER), inference_kernel.new_cyc_query_from_dnf(query_dnf, propagation_mt, (SubLObject)forward_rule_propagation.NIL, query_properties));
                            if (forward_rule_propagation.NIL != inference) {
                                final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
                                final SubLObject root_problem = inference_datastructures_inference.inference_root_problem(inference);
                                final SubLObject executed_tactics = inference_datastructures_problem.problem_executed_tactics(root_problem);
                                final SubLObject join_ordered_tactic = Sequences.find((SubLObject)forward_rule_propagation.$kw21$JOIN_ORDERED, executed_tactics, Symbols.symbol_function((SubLObject)forward_rule_propagation.EQ), Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym22$TACTIC_HL_MODULE_NAME), (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED);
                                if (forward_rule_propagation.NIL != join_ordered_tactic) {
                                    final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_focal_problem(join_ordered_tactic);
                                    final SubLObject productivity = inference_worker.simple_problem_estimated_total_global_productivity(focal_problem, strategy);
                                    trigger_asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(focal_problem);
                                    estimated_children = inference_datastructures_enumerated_types.number_of_children_for_productivity(productivity);
                                }
                                else if (forward_rule_propagation.NIL != Sequences.find((SubLObject)forward_rule_propagation.$kw23$SPLIT, executed_tactics, Symbols.symbol_function((SubLObject)forward_rule_propagation.EQ), Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym22$TACTIC_HL_MODULE_NAME), (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED)) {
                                    Errors.warn((SubLObject)forward_rule_propagation.$str24$Can_t_determine_trigger_asent_for, el_utilities.sefify(rule));
                                }
                                else {
                                    Errors.warn((SubLObject)forward_rule_propagation.$str25$Can_t_determine_trigger_asent_for, el_utilities.sefify(rule));
                                }
                            }
                            else {
                                Errors.warn((SubLObject)forward_rule_propagation.$str26$Can_t_create_inference_to_determi, el_utilities.sefify(rule));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (forward_rule_propagation.NIL != inference) {}
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_rule_propagation.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            forward.clear_current_forward_problem_store();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
                    kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Values.values(trigger_asent, estimated_children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 8146L)
    public static SubLObject obfuscate_non_trigger_literal_lits(final SubLObject lits, final SubLObject rule, final SubLObject propagation_mt) {
        final SubLObject non_trigger_literals = inference_worker_transformation.forward_rule_non_trigger_literals(rule, propagation_mt);
        SubLObject n = (SubLObject)forward_rule_propagation.$int27$100;
        SubLObject result = (SubLObject)forward_rule_propagation.NIL;
        SubLObject cdolist_list_var = lits;
        SubLObject lit = (SubLObject)forward_rule_propagation.NIL;
        lit = cdolist_list_var.first();
        while (forward_rule_propagation.NIL != cdolist_list_var) {
            if (forward_rule_propagation.NIL == kb_utilities.kbeq(forward_rule_propagation.$const28$evaluate, el_utilities.literal_predicate(lit, (SubLObject)forward_rule_propagation.UNPROVIDED)) && (forward_rule_propagation.NIL != kb_accessors.not_assertible_predicateP(el_utilities.literal_predicate(lit, (SubLObject)forward_rule_propagation.UNPROVIDED), forward_rule_propagation.$const29$BaseKB) || (forward_rule_propagation.NIL != subl_promotions.memberP(lit, non_trigger_literals, Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym30$EQUALS_EL_), (SubLObject)forward_rule_propagation.UNPROVIDED) && forward_rule_propagation.NIL == variables.variable_p(el_utilities.literal_arg0(lit, (SubLObject)forward_rule_propagation.UNPROVIDED))))) {
                result = (SubLObject)ConsesLow.cons(el_utilities.replace_formula_arg((SubLObject)forward_rule_propagation.ZERO_INTEGER, variables.get_variable(n), lit), result);
                n = Numbers.add(n, (SubLObject)forward_rule_propagation.ONE_INTEGER);
            }
            else {
                result = (SubLObject)ConsesLow.cons(lit, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 9013L)
    public static SubLObject forward_rule_initial_fanout(final SubLObject rule, SubLObject propagation_mt) {
        if (propagation_mt == forward_rule_propagation.UNPROVIDED) {
            propagation_mt = forward_rule_propagation.$const0$InferencePSC;
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)forward_rule_propagation.ONE_INTEGER), forward_rule_trigger_asent(rule, propagation_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 9181L)
    public static SubLObject first_gaf_in_supports(final SubLObject supports) {
        SubLObject result = Sequences.find_if(Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym31$GAF_ASSERTION_), supports, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED, (SubLObject)forward_rule_propagation.UNPROVIDED);
        if (forward_rule_propagation.NIL == result && forward_rule_propagation.NIL != list_utilities.singletonP(supports)) {
            final SubLObject justification = hl_supports.hl_justify(supports.first());
            if (forward_rule_propagation.NIL != list_utilities.singletonP(justification) && forward_rule_propagation.NIL != assertions_high.gaf_assertionP(justification.first())) {
                result = justification.first();
            }
        }
        if (forward_rule_propagation.NIL == result) {
            final SubLObject v_hl_supports = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)forward_rule_propagation.$sym32$HL_SUPPORT_P), supports, (SubLObject)forward_rule_propagation.UNPROVIDED);
            SubLObject isa_hl_supports = (SubLObject)forward_rule_propagation.NIL;
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject hl_support = (SubLObject)forward_rule_propagation.NIL;
            hl_support = cdolist_list_var.first();
            while (forward_rule_propagation.NIL != cdolist_list_var) {
                if (forward_rule_propagation.$kw33$ISA == arguments.hl_support_module(hl_support)) {
                    isa_hl_supports = (SubLObject)ConsesLow.cons(hl_support, isa_hl_supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hl_support = cdolist_list_var.first();
            }
            if (forward_rule_propagation.NIL != list_utilities.singletonP(isa_hl_supports)) {
                final SubLObject isa_hl_support = isa_hl_supports.first();
                SubLObject isa_assertions = (SubLObject)forward_rule_propagation.NIL;
                SubLObject cdolist_list_var2 = (forward_rule_propagation.NIL != kb_hl_support_handles.kb_hl_support_p(isa_hl_support)) ? kb_hl_supports_high.kb_hl_support_justification(isa_hl_support) : hl_supports.hl_justify(isa_hl_support);
                SubLObject support = (SubLObject)forward_rule_propagation.NIL;
                support = cdolist_list_var2.first();
                while (forward_rule_propagation.NIL != cdolist_list_var2) {
                    if (forward_rule_propagation.NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(support, (SubLObject)forward_rule_propagation.$list34)) {
                        isa_assertions = (SubLObject)ConsesLow.cons(support, isa_assertions);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    support = cdolist_list_var2.first();
                }
                if (forward_rule_propagation.NIL != list_utilities.singletonP(isa_assertions)) {
                    result = isa_assertions.first();
                }
            }
        }
        return result;
    }
    
    public static SubLObject declare_forward_rule_propagation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "forward_propagate_rule_via_trigger_gafs", "FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "possibly_change_assertion_direction_to_forward_without_repropagation", "POSSIBLY-CHANGE-ASSERTION-DIRECTION-TO-FORWARD-WITHOUT-REPROPAGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "repropagate_trigger_gaf_against_rule", "REPROPAGATE-TRIGGER-GAF-AGAINST-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "forward_rule_trigger_gafs", "FORWARD-RULE-TRIGGER-GAFS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "new_forward_rule_trigger_gaf_iterator", "NEW-FORWARD-RULE-TRIGGER-GAF-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "forward_rule_trigger_gafs_int", "FORWARD-RULE-TRIGGER-GAFS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "forward_rule_trigger_asent", "FORWARD-RULE-TRIGGER-ASENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "obfuscate_non_trigger_literal_lits", "OBFUSCATE-NON-TRIGGER-LITERAL-LITS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "forward_rule_initial_fanout", "FORWARD-RULE-INITIAL-FANOUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation", "first_gaf_in_supports", "FIRST-GAF-IN-SUPPORTS", 1, 0, false);
        return (SubLObject)forward_rule_propagation.NIL;
    }
    
    public static SubLObject init_forward_rule_propagation_file() {
        forward_rule_propagation.$forward_trigger_lazy_iteration_threshold$ = SubLFiles.deflexical("*FORWARD-TRIGGER-LAZY-ITERATION-THRESHOLD*", (SubLObject)forward_rule_propagation.NIL);
        return (SubLObject)forward_rule_propagation.NIL;
    }
    
    public static SubLObject setup_forward_rule_propagation_file() {
        return (SubLObject)forward_rule_propagation.NIL;
    }
    
    public void declareFunctions() {
        declare_forward_rule_propagation_file();
    }
    
    public void initializeVariables() {
        init_forward_rule_propagation_file();
    }
    
    public void runTopLevelForms() {
        setup_forward_rule_propagation_file();
    }
    
    static {
        me = (SubLFile)new forward_rule_propagation();
        forward_rule_propagation.$forward_trigger_lazy_iteration_threshold$ = null;
        $const0$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym1$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym2$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str3$Triggering_rule_against__A__S_sup = SubLObjectFactory.makeString("Triggering rule against ~A ~S support~:p: ~A");
        $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)forward_rule_propagation.NIL);
        $sym6$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym7$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str8$_A = SubLObjectFactory.makeString("~A");
        $sym9$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw10$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym11$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $str12$time_to_use_a_real_query_iterator = SubLObjectFactory.makeString("time to use a real query iterator here");
        $str13$Determining_trigger_GAFs_for_ = SubLObjectFactory.makeString("Determining trigger GAFs for ");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"));
        $sym15$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym16$FIRST_GAF_IN_SUPPORTS = SubLObjectFactory.makeSymbol("FIRST-GAF-IN-SUPPORTS");
        $sym17$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $kw18$POS = SubLObjectFactory.makeKeyword("POS");
        $kw19$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)forward_rule_propagation.T, (SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)forward_rule_propagation.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE")), (SubLObject)SubLObjectFactory.makeKeyword("JOIN"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-PRED-UNBOUND"))));
        $kw21$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $sym22$TACTIC_HL_MODULE_NAME = SubLObjectFactory.makeSymbol("TACTIC-HL-MODULE-NAME");
        $kw23$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $str24$Can_t_determine_trigger_asent_for = SubLObjectFactory.makeString("Can't determine trigger asent for rule with split antecedent: ~S");
        $str25$Can_t_determine_trigger_asent_for = SubLObjectFactory.makeString("Can't determine trigger asent for rule: ~S");
        $str26$Can_t_create_inference_to_determi = SubLObjectFactory.makeString("Can't create inference to determine trigger asent for rule: ~S");
        $int27$100 = SubLObjectFactory.makeInteger(100);
        $const28$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $const29$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym30$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $sym31$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym32$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $kw33$ISA = SubLObjectFactory.makeKeyword("ISA");
        $list34 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
    }
}

/*

	Total time: 265 ms
	
*/