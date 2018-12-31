package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_non_wff;
import com.cyc.cycjava.cycl.inference.modules.transformation_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.cycjava.cycl.arg_type;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.clause_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker";
    public static final String myFingerPrint = "cafa6617e8e7236cc812046e709e55621786ba9a9aad0bbd8ee52f8b0cf7ca71";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1785L)
    public static SubLSymbol $currently_considered_tactic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2374L)
    public static SubLSymbol $currently_executing_tactics$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3631L)
    public static SubLSymbol $currently_active_problem$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4925L)
    public static SubLSymbol $currently_active_problem_store$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14087L)
    public static SubLSymbol $asent_of_currently_executing_tactic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14182L)
    public static SubLSymbol $mt_of_currently_executing_tactic$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19342L)
    public static SubLSymbol $consider_variable_count_of_focal_problems_for_tactic_literals_score_method$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51233L)
    public static SubLSymbol $eager_proof_validationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51519L)
    public static SubLSymbol $proof_circularity_detection_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55296L)
    private static SubLSymbol $circular_proof_max_depth_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59432L)
    private static SubLSymbol $process_motivated_transformation_link_proofsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 61168L)
    private static SubLSymbol $find_proof_bindings_optimization_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72907L)
    public static SubLSymbol $proof_bubbling_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73036L)
    public static SubLSymbol $max_proof_bubbling_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78612L)
    private static SubLSymbol $within_abnormality_checkingP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104485L)
    public static SubLSymbol $disable_link_propagationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124726L)
    private static SubLSymbol $bubble_up_proofs_through_closed_split_linksP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 129902L)
    public static SubLSymbol $reconsidering_set_asidesP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 172019L)
    private static SubLSymbol $always_consider_deepP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196592L)
    public static SubLSymbol $problem_store_prune_reports$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202958L)
    private static SubLSymbol $possibly_propagate_problem_indestructible_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 221320L)
    private static SubLSymbol $processed_proofs_retain_one_proofP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLSymbol $sym2$_CURRENTLY_CONSIDERED_TACTIC_;
    private static final SubLSymbol $sym3$TACTIC_P;
    private static final SubLSymbol $sym4$START_TIME;
    private static final SubLSymbol $sym5$_CURRENTLY_EXECUTING_TACTICS_;
    private static final SubLSymbol $sym6$CONS;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$CUNWIND_PROTECT;
    private static final SubLSymbol $sym9$PROGN;
    private static final SubLSymbol $sym10$PWHEN;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$CSETQ;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES;
    private static final SubLSymbol $sym15$_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_CURRENTLY_ACTIVE_PROBLEM_;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_;
    private static final SubLSymbol $sym23$PROBLEM_P;
    private static final SubLString $str24$_a_was_not_an__unexamined_problem;
    private static final SubLString $str25$_a_was__unexamined_but_somehow_go;
    private static final SubLSymbol $kw26$TACTICAL;
    private static final SubLSymbol $kw27$SKIP;
    private static final SubLSymbol $kw28$POS;
    private static final SubLSymbol $kw29$NEG;
    private static final SubLSymbol $kw30$REMOVAL_CONJUNCTIVE;
    private static final SubLSymbol $kw31$COMPLETE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$STRATEGY_P;
    private static final SubLSymbol $kw34$NON_DISCARDED;
    private static final SubLString $str35$unexpected_tactic__S;
    private static final SubLString $str36$Tried_to_recursively_execute__a;
    private static final SubLString $str37$Tried_to_execute_a_tactic_that_wa;
    private static final SubLSymbol $kw38$INFERENCE;
    private static final SubLString $str39$unexpected_tactic__s;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_;
    private static final SubLSymbol $sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_;
    private static final SubLString $str43$Got_a_literal_level_tactic__s_tha;
    private static final SubLString $str44$Unexpected_multiple_clause_tactic;
    private static final SubLString $str45$Unexpected_multiple_literal_tacti;
    private static final SubLString $str46$Unexpected_structural_multiple_li;
    private static final SubLString $str47$Unexpected_meta_structural_multip;
    private static final SubLString $str48$unexpected_connected_conjunction_;
    private static final SubLString $str49$unexpected_connected_conjunction_;
    private static final SubLSymbol $kw50$EXPONENTIAL;
    private static final SubLSymbol $kw51$SQUARE;
    private static final SubLSymbol $kw52$DOUBLE;
    private static final SubLString $str53$unexpected_disjunctive_link__s;
    private static final SubLString $str54$_s_was_not_a_logical_link_with_un;
    private static final SubLSymbol $kw55$SPLIT;
    private static final SubLSymbol $kw56$JOIN_ORDERED;
    private static final SubLSymbol $kw57$UNION;
    private static final SubLSymbol $kw58$JOIN;
    private static final SubLString $str59$Unexpected_logical_tactic_module_;
    private static final SubLString $str60$Join_tactics_like__S_do_not_have_;
    private static final SubLSymbol $sym61$STRUCTURAL_PROOF_P;
    private static final SubLString $str62$_a_is_not_a_CONTENT_LINK_P;
    private static final SubLSymbol $sym63$CONTENT_TACTIC_P;
    private static final SubLString $str64$Unexpected_content_tactic__S;
    private static final SubLString $str65$Unexpected_removal_tactic__S;
    private static final SubLSymbol $kw66$REMOVAL;
    private static final SubLSymbol $kw67$RESTRICTION;
    private static final SubLSymbol $sym68$CONJUNCTIVE_REMOVAL_TACTIC_P;
    private static final SubLSymbol $sym69$TRANSFORMATION_TACTIC_P;
    private static final SubLSymbol $kw70$TRANSFORMATION;
    private static final SubLSymbol $sym71$REWRITE_TACTIC_P;
    private static final SubLSymbol $kw72$REWRITE;
    private static final SubLSymbol $sym73$META_REMOVAL_TACTIC_P;
    private static final SubLSymbol $sym74$STRATEGIC_CONTEXT_P;
    private static final SubLSymbol $kw75$PREFERRED;
    private static final SubLSymbol $kw76$GENERALIZED_REMOVAL;
    private static final SubLSymbol $kw77$POSSIBLE;
    private static final SubLSymbol $kw78$DISPREFERRED;
    private static final SubLSymbol $kw79$GROSSLY_DISPREFERRED;
    private static final SubLSymbol $kw80$DISALLOWED;
    private static final SubLSymbol $kw81$DOOMED;
    private static final SubLString $str82$Unexpected_preference_level__s;
    private static final SubLSymbol $kw83$CONNECTED_CONJUNCTION;
    private static final SubLSymbol $kw84$STRUCTURAL;
    private static final SubLSymbol $kw85$LOGICAL;
    private static final SubLSymbol $kw86$IMPOSSIBLE;
    private static final SubLSymbol $kw87$STRUCTURAL_CONJUNCTIVE;
    private static final SubLSymbol $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_;
    private static final SubLSymbol $kw89$NONE;
    private static final SubLSymbol $kw90$MINIMAL;
    private static final SubLSymbol $kw91$ALL;
    private static final SubLSymbol $kw92$ARG_TYPE;
    private static final SubLString $str93$Unexpected_intermediate_step_vali;
    private static final SubLList $list94;
    private static final SubLString $str95$Didn_t_expect_to_bubble_up_a_proo;
    private static final SubLString $str96$Unexpected_link_type_for_link__a;
    private static final SubLSymbol $sym97$PROOF_REJECTED_;
    private static final SubLString $str98$propose_new_proof_with_bindings__;
    private static final SubLSymbol $kw99$REJECTED_SUBPROOF;
    private static final SubLSymbol $sym100$PROOF_P;
    private static final SubLInteger $int101$300;
    private static final SubLSymbol $kw102$CIRCULAR;
    private static final SubLSymbol $kw103$ILL_FORMED;
    private static final SubLSymbol $kw104$NON_ABDUCIBLE_RULE;
    private static final SubLSymbol $kw105$MODUS_TOLLENS_WITH_NON_WFF;
    private static final SubLSymbol $kw106$PROVEN;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$PROBLEM_LINK_TO_GOAL_P;
    private static final SubLString $str109$expected_a_variable_map_to_be_nul;
    private static final SubLSymbol $sym110$VARIABLE__;
    private static final SubLSymbol $sym111$VARIABLE_BINDING_VARIABLE;
    private static final SubLList $list112;
    private static final SubLString $str113$Found_a_triplicate_binding_for__s;
    private static final SubLString $str114$Could_not_find_two_values_in__s_w;
    private static final SubLSymbol $sym115$BINDINGS_P;
    private static final SubLInteger $int116$100;
    private static final SubLSymbol $kw117$MAX_PROOF_BUBBLING_DEPTH;
    private static final SubLSymbol $kw118$ANSWER;
    private static final SubLSymbol $sym119$VARIABLE_MAP_P;
    private static final SubLSymbol $kw120$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $kw121$DISJUNCTIVE_ASSUMPTION;
    private static final SubLString $str122$can_t_handle_bubbling_up_proofs_p;
    private static final SubLSymbol $kw123$EXCEPTED_ASSERTION;
    private static final SubLSymbol $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS;
    private static final SubLSymbol $sym125$GENERALIZED_TRANSFORMATION_PROOF_P;
    private static final SubLString $str126$generalized_transformation_proof_;
    private static final SubLString $str127$Invalid_sense__s;
    private static final SubLSymbol $kw128$UNEXAMINED;
    private static final SubLString $str129$Tried_to_make__a_pending_but_it_s;
    private static final SubLSymbol $kw130$INTUITIVE;
    private static final SubLSymbol $kw131$UNDETERMINED;
    private static final SubLSymbol $sym132$UNION_LINK_P;
    private static final SubLString $str133$Uninteresting_problem_status_chan;
    private static final SubLSymbol $kw134$SUBSTRATEGY_PROBLEM_STATUS_CHANGE;
    private static final SubLString $str135$possible_problem_with_no_tactics_;
    private static final SubLSymbol $kw136$NEW;
    private static final SubLSymbol $kw137$UNEXAMINED_GOOD;
    private static final SubLSymbol $kw138$UNEXAMINED_NO_GOOD;
    private static final SubLSymbol $kw139$EXAMINED;
    private static final SubLSymbol $kw140$EXAMINED_GOOD;
    private static final SubLSymbol $kw141$EXAMINED_NO_GOOD;
    private static final SubLSymbol $kw142$PENDING;
    private static final SubLSymbol $kw143$POSSIBLE_GOOD;
    private static final SubLSymbol $kw144$PENDING_GOOD;
    private static final SubLSymbol $kw145$PENDING_NO_GOOD;
    private static final SubLSymbol $kw146$FINISHED;
    private static final SubLSymbol $kw147$FINISHED_GOOD;
    private static final SubLSymbol $kw148$FINISHED_NO_GOOD;
    private static final SubLString $str149$Problem__a_attempted_to_change_st;
    private static final SubLString $str150$new_problem_cannot_become_good_ye;
    private static final SubLString $str151$unknown_problem_status__a;
    private static final SubLString $str152$problem_status__a_cannot_become_u;
    private static final SubLString $str153$problem_of_status__a_cannot_be_ex;
    private static final SubLSymbol $kw154$POSSIBLE_NO_GOOD;
    private static final SubLString $str155$problem_of_status__a_cannot_be_ma;
    private static final SubLString $str156$problem_of_status__a_cannot_be_pe;
    private static final SubLString $str157$problem_of_status__a_cannot_be_fi;
    private static final SubLString $str158$unexpected_link_type__S;
    private static final SubLSymbol $kw159$PROBLEM_NO_GOOD;
    private static final SubLSymbol $kw160$CONJUNCTIVE;
    private static final SubLSymbol $kw161$CONTENT;
    private static final SubLString $str162$Unexpected_status__s;
    private static final SubLSymbol $kw163$FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL;
    private static final SubLSymbol $kw164$PENDING_COMPLETE;
    private static final SubLSymbol $kw165$PENDING_PREFERRED;
    private static final SubLSymbol $kw166$NO_GOOD_SPLIT_LINK;
    private static final SubLSymbol $kw167$NO_GOOD_PREFERRED_JO_LINK;
    private static final SubLSymbol $kw168$NO_GOOD_JOIN_LINK;
    private static final SubLSymbol $kw169$NO_GOOD_UNION_LINKS;
    private static final SubLString $str170$Can_t_bind_;
    private static final SubLSymbol $sym171$VARIABLE_P;
    private static final SubLString $str172$__previously_was_;
    private static final SubLString $str173$_due_to_;
    private static final SubLString $str174$_;
    private static final SubLSymbol $kw175$SIMPLIFICATION;
    private static final SubLList $list176;
    private static final SubLSymbol $kw177$ANYTHING;
    private static final SubLList $list178;
    private static final SubLSymbol $sym179$FILTER_PROOF_SPECS_OF_TYPE;
    private static final SubLSymbol $sym180$PUNLESS;
    private static final SubLSymbol $sym181$NULL;
    private static final SubLSymbol $sym182$JOIN_ORDERED_PROOF_SPEC_P;
    private static final SubLSymbol $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P;
    private static final SubLSymbol $sym184$RESTRICTION_PROOF_SPEC_P;
    private static final SubLSymbol $sym185$SPLIT_PROOF_SPEC_P;
    private static final SubLSymbol $sym186$JOIN_PROOF_SPEC_P;
    private static final SubLSymbol $sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P;
    private static final SubLSymbol $sym188$TRANSFORMATION_PROOF_SPEC_P;
    private static final SubLSymbol $sym189$UNION_PROOF_SPEC_P;
    private static final SubLString $str190$Time_to_handle__S_propagation;
    private static final SubLList $list191;
    private static final SubLString $str192$Propagating_bogus_proof_spec__A_d;
    private static final SubLSymbol $kw193$EQUAL;
    private static final SubLSymbol $kw194$CZER_EQUAL;
    private static final SubLSymbol $sym195$_PROBLEM_STORE_PRUNE_REPORTS_;
    private static final SubLString $str196$__pruned__a_problems____a_____a__;
    private static final SubLSymbol $sym197$_;
    private static final SubLSymbol $sym198$PROBLEM_MIN_DEPTH;
    private static final SubLSymbol $kw199$UNINITIALIZED;
    private static final SubLString $str200$destroying_in_progress_tactic__a;
    private static final SubLList $list201;
    private static final SubLList $list202;
    private static final SubLSymbol $sym203$_;
    private static final SubLSymbol $sym204$PROBLEM_LINK_SUID;
    private static final SubLSymbol $sym205$PROBLEM_SUID;
    private static final SubLSymbol $sym206$CONJUNCTIVE_REMOVAL_PROOF_P;
    private static final SubLSymbol $sym207$PROOF_SUID;
    private static final SubLSymbol $sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_;
    private static final SubLSymbol $sym209$SPLIT_LINK_P;
    private static final SubLList $list210;
    private static final SubLSymbol $kw211$DO_HASH_TABLE;
    private static final SubLSymbol $sym212$PROBLEM_STORE_P;
    private static final SubLSymbol $sym213$SET_SIZE;
    private static final SubLSymbol $sym214$PROOF_PRUNABLE_;
    private static final SubLString $str215$_a_was_not_a_problem_p_or_problem;
    private static final SubLString $str216$__prunables___s__;
    private static final SubLString $str217$Unexpected_problem_store_object__;
    private static final SubLList $list218;
    private static final SubLSymbol $sym219$TACTICALLY_FINISHED_PROBLEM_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 1972L)
    public static SubLObject currently_considered_tactic() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker.$currently_considered_tactic$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2149L)
    public static SubLObject within_tactic_consideration(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list0);
        tactic = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym2$_CURRENTLY_CONSIDERED_TACTIC_, tactic)), ConsesLow.append(body, (SubLObject)inference_worker.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2477L)
    public static SubLObject currently_executing_tactic() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker.$currently_executing_tactics$.getDynamicValue(thread).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2651L)
    public static SubLObject currently_executing_tactics() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.find_all_if((SubLObject)inference_worker.$sym3$TACTIC_P, inference_worker.$currently_executing_tactics$.getDynamicValue(thread), (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 2764L)
    public static SubLObject within_tactic_execution(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list0);
        tactic = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject start_time = (SubLObject)inference_worker.$sym4$START_TIME;
        return (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym5$_CURRENTLY_EXECUTING_TACTICS_, (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym6$CONS, tactic, (SubLObject)inference_worker.$list7)), start_time), (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym8$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym9$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym10$PWHEN, (SubLObject)inference_worker.$list11, (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym12$CSETQ, start_time, (SubLObject)inference_worker.$list13)), ConsesLow.append(body, (SubLObject)inference_worker.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym10$PWHEN, (SubLObject)inference_worker.$list11, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym15$_, (SubLObject)inference_worker.$list16, start_time)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3410L)
    public static SubLObject currently_executing_hl_module() {
        final SubLObject tactic = currently_executing_tactic();
        if (inference_worker.NIL != tactic) {
            return inference_datastructures_tactic.tactic_hl_module(tactic);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 3688L)
    public static SubLObject currently_active_problem() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tactic = currently_executing_tactic();
        if (inference_worker.NIL != tactic) {
            return inference_datastructures_tactic.tactic_problem(tactic);
        }
        return inference_worker.$currently_active_problem$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4017L)
    public static SubLObject within_problem_consideration(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject problem = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list17);
        problem = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym1$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym18$_CURRENTLY_ACTIVE_PROBLEM_, problem), (SubLObject)inference_worker.$list19), ConsesLow.append(body, (SubLObject)inference_worker.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4473L)
    public static SubLObject currently_active_problem_query() {
        final SubLObject current_problem = currently_active_problem();
        if (inference_worker.NIL != inference_datastructures_problem.problem_p(current_problem)) {
            return inference_datastructures_problem.problem_query(current_problem);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4667L)
    public static SubLObject with_problem_store_tactical_evaluation_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject store = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list20);
        store = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym21$_NEGATION_BY_FAILURE_, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_, store))), ConsesLow.append(body, (SubLObject)inference_worker.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 4988L)
    public static SubLObject currently_active_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = currently_active_problem();
        if (inference_worker.NIL != problem) {
            return inference_datastructures_problem.problem_store(problem);
        }
        return inference_worker.$currently_active_problem_store$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 5289L)
    public static SubLObject currently_active_problem_store_creation_time() {
        final SubLObject problem_store = currently_active_problem_store();
        return (SubLObject)((inference_worker.NIL != problem_store) ? inference_datastructures_problem_store.problem_store_creation_time(problem_store) : inference_worker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 5610L)
    public static SubLObject determine_new_tactics(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            Errors.error((SubLObject)inference_worker.$str24$_a_was_not_an__unexamined_problem, problem);
        }
        if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL != inference_datastructures_problem.problem_tactics(problem)) {
            Errors.error((SubLObject)inference_worker.$str25$_a_was__unexamined_but_somehow_go, problem);
        }
        final SubLObject _prev_bind_0 = inference_worker.$currently_active_problem$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_worker.$currently_executing_tactics$.currentBinding(thread);
        try {
            inference_worker.$currently_active_problem$.bind(problem, thread);
            inference_worker.$currently_executing_tactics$.bind((SubLObject)inference_worker.NIL, thread);
            if (inference_worker.NIL != inference_datastructures_problem.single_clause_problem_p(problem)) {
                final SubLObject clause = inference_datastructures_problem.problem_sole_clause(problem);
                determine_new_tactics_for_dnf_clause(problem, clause);
            }
            else {
                final SubLObject query = inference_datastructures_problem.problem_query(problem);
                determine_new_tactics_for_disjunction(problem, query);
            }
            note_problem_examined(problem);
            discard_all_impossible_possible_tactics(problem);
            consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.T);
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$1 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, strategy, (SubLObject)inference_worker.T);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$2 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, strategy2, (SubLObject)inference_worker.T);
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
        }
        finally {
            inference_worker.$currently_executing_tactics$.rebind(_prev_bind_2, thread);
            inference_worker.$currently_active_problem$.rebind(_prev_bind_0, thread);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7024L)
    public static SubLObject determine_new_tactics_for_dnf_clause(final SubLObject problem, final SubLObject dnf_clause) {
        if (inference_worker.NIL != clause_utilities.pos_atomic_clause_p(dnf_clause)) {
            return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), (SubLObject)inference_worker.$kw28$POS);
        }
        if (inference_worker.NIL != clause_utilities.neg_atomic_clause_p(dnf_clause)) {
            return determine_new_tactics_for_literal(problem, clause_utilities.atomic_clause_asent(dnf_clause), (SubLObject)inference_worker.$kw29$NEG);
        }
        return determine_new_tactics_for_multiple_literals(problem, dnf_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7446L)
    public static SubLObject determine_new_tactics_for_disjunction(final SubLObject problem, final SubLObject query) {
        return inference_worker_union.determine_new_union_tactics(problem, query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 7608L)
    public static SubLObject determine_new_tactics_for_multiple_literals(final SubLObject problem, final SubLObject dnf_clause) {
        inference_worker_removal.determine_new_conjunctive_removal_tactics(problem, dnf_clause);
        if (inference_worker.NIL != inference_worker_split.all_literals_connected_by_shared_varsP(dnf_clause)) {
            return determine_new_connected_conjunction_tactics(problem, dnf_clause);
        }
        if (inference_worker.NIL != inference_worker_split.meta_split_tactics_enabledP()) {
            return inference_worker_split.determine_new_meta_split_tactics(problem, dnf_clause);
        }
        return inference_worker_split.determine_new_split_tactics(problem, dnf_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8102L)
    public static SubLObject determine_new_connected_conjunction_tactics(final SubLObject problem, final SubLObject dnf_clause) {
        if (inference_worker.NIL == problem_has_a_complete_conjunctive_removal_tacticP(problem)) {
            inference_worker_join_ordered.determine_new_join_ordered_tactics(problem, dnf_clause);
            inference_worker_join.determine_new_join_tactics(problem, dnf_clause);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8520L)
    public static SubLObject problem_has_a_complete_conjunctive_removal_tacticP(final SubLObject problem) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_worker.$kw30$REMOVAL_CONJUNCTIVE) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, (SubLObject)inference_worker.$kw31$COMPLETE)) {
                return (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 8714L)
    public static SubLObject determine_new_tactics_for_literal(final SubLObject problem, final SubLObject contextualized_asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt = (SubLObject)inference_worker.NIL;
        SubLObject asent = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)inference_worker.$list32);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)inference_worker.$list32);
        asent = current.first();
        current = current.rest();
        if (inference_worker.NIL == current) {
            if (inference_worker.NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    inference_worker_removal.determine_new_literal_removal_tactics(problem, asent, sense);
                    if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_rewrite_allowedP(inference_datastructures_problem.problem_store(problem))) {
                        inference_worker_rewrite.determine_new_literal_rewrite_tactics(problem, asent, sense, (SubLObject)inference_worker.UNPROVIDED);
                    }
                    if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
                        inference_worker_transformation.add_tactic_to_determine_new_literal_transformation_tactics(problem, asent, sense, mt);
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)inference_worker.$list32);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9424L)
    public static SubLObject possibly_compute_strategic_properties_of_problem_tactics(final SubLObject problem, final SubLObject strategy) {
        assert inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        if (inference_worker.NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)) {
            strategy_compute_strategic_properties_of_problem_tactics(strategy, problem);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 9902L)
    public static SubLObject strategy_compute_strategic_properties_of_problem_tactics(final SubLObject strategy, final SubLObject problem) {
        return compute_strategic_properties_of_problem_tactics(problem, strategy, (SubLObject)inference_worker.$kw34$NON_DISCARDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10167L)
    public static SubLObject compute_strategic_properties_of_problem_tactics(final SubLObject problem, final SubLObject strategy, SubLObject status) {
        if (status == inference_worker.UNPROVIDED) {
            status = (SubLObject)inference_worker.NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, status)) {
                possibly_compute_strategic_properties_of_tactic(tactic, strategy);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10408L)
    public static SubLObject possibly_compute_strategic_properties_of_tactic(final SubLObject tactic, final SubLObject strategy) {
        if (inference_worker.NIL == strategy_chooses_not_to_examine_tacticP(strategy, tactic)) {
            inference_tactician.strategy_note_new_tactic(strategy, tactic);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10621L)
    public static SubLObject strategy_chooses_not_to_examine_tacticP(final SubLObject strategy, final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == inference_tactician_strategic_uninterestingness.strategy_admits_tactic_wrt_proof_specP(strategy, tactic) || inference_worker.NIL == inference_tactician_strategic_uninterestingness.strategy_allows_use_of_tactic_hl_moduleP(strategy, tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 10967L)
    public static SubLObject default_compute_strategic_properties_of_tactic(final SubLObject strategy, final SubLObject tactic) {
        if (inference_worker.NIL != inference_worker_split.split_tactic_p(tactic)) {
            final SubLObject supporting_problem = inference_worker_split.find_split_tactic_supporting_problem(tactic);
            return inference_worker_split.compute_strategic_properties_of_split_tactic(tactic, supporting_problem, strategy);
        }
        if (inference_worker.NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return inference_worker_split.compute_strategic_properties_of_meta_split_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_union.union_tactic_p(tactic)) {
            final SubLObject disjunct_index = inference_worker_union.union_tactic_disjunct_index(tactic);
            return inference_worker_union.compute_strategic_properties_of_union_tactic(tactic, disjunct_index, strategy);
        }
        if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.compute_strategic_properties_of_join_ordered_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.compute_strategic_properties_of_join_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
            return inference_worker_transformation.compute_strategic_properties_of_transformation_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_transformation.meta_transformation_tactic_p(tactic)) {
            return inference_worker_transformation.compute_strategic_properties_of_meta_transformation_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_removal.removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_removal_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_removal.meta_removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_meta_removal_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_tactic_p(tactic)) {
            return inference_worker_rewrite.compute_strategic_properties_of_rewrite_tactic(tactic, strategy);
        }
        if (inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return inference_worker_removal.compute_strategic_properties_of_conjunctive_removal_tactic(tactic, strategy);
        }
        Errors.error((SubLObject)inference_worker.$str35$unexpected_tactic__S, tactic);
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 12730L)
    public static SubLObject execute_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && tactic.eql(currently_executing_tactic())) {
            Errors.error((SubLObject)inference_worker.$str36$Tried_to_recursively_execute__a, tactic);
        }
        if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL == inference_datastructures_tactic.tactic_possibleP(tactic)) {
            Errors.error((SubLObject)inference_worker.$str37$Tried_to_execute_a_tactic_that_wa, tactic);
        }
        final SubLObject last_metric_type = hl_macros.$forward_inference_metric_last_metric_type$.getDynamicValue(thread);
        final SubLObject last_metric = hl_macros.$forward_inference_metric_last_metric$.getDynamicValue(thread);
        final SubLObject last_gaf = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.getDynamicValue(thread);
        final SubLObject last_rule = hl_macros.$forward_inference_metric_last_forward_inference_rule$.getDynamicValue(thread);
        if (inference_worker.NIL != last_metric_type && inference_worker.NIL != last_metric) {
            inference_metrics.increment_forward_inference_metrics(last_metric_type, last_metric, last_gaf, last_rule, (SubLObject)inference_worker.ZERO_INTEGER);
        }
        final SubLObject _prev_bind_0 = hl_macros.$forward_inference_metric_last_metric_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = hl_macros.$forward_inference_metric_last_metric$.currentBinding(thread);
        final SubLObject _prev_bind_3 = hl_macros.$forward_inference_metric_last_forward_inference_gaf$.currentBinding(thread);
        final SubLObject _prev_bind_4 = hl_macros.$forward_inference_metric_last_forward_inference_rule$.currentBinding(thread);
        try {
            hl_macros.$forward_inference_metric_last_metric_type$.bind((SubLObject)inference_worker.$kw38$INFERENCE, thread);
            hl_macros.$forward_inference_metric_last_metric$.bind(inference_datastructures_tactic.tactic_hl_module_name(tactic), thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.bind((SubLObject)inference_worker.NIL, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.bind((SubLObject)inference_worker.NIL, thread);
            try {
                final SubLObject _prev_bind_0_$3 = inference_worker.$currently_executing_tactics$.currentBinding(thread);
                try {
                    inference_worker.$currently_executing_tactics$.bind((SubLObject)ConsesLow.cons(tactic, inference_worker.$currently_executing_tactics$.getDynamicValue(thread)), thread);
                    SubLObject start_time = (SubLObject)inference_worker.NIL;
                    try {
                        if (inference_worker.NIL != inference_metrics.any_inference_gathers_hl_module_timesP((SubLObject)inference_worker.UNPROVIDED)) {
                            start_time = inference_datastructures_inference.inference_time_so_far(inference_macros.current_controlling_inference(), (SubLObject)inference_worker.NIL);
                        }
                        inference_datastructures_tactic.note_tactic_most_recent_executed(tactic);
                        if (inference_worker.NIL != single_literal_tactic_p(tactic)) {
                            execute_literal_level_tactic(tactic);
                        }
                        else if (inference_worker.NIL != generalized_conjunctive_tactic_p(tactic)) {
                            execute_multiple_literal_tactic(tactic);
                        }
                        else if (inference_worker.NIL != disjunctive_tactic_p(tactic)) {
                            execute_multiple_clause_tactic(tactic);
                        }
                        else {
                            Errors.error((SubLObject)inference_worker.$str39$unexpected_tactic__s, tactic);
                        }
                        possibly_note_tactic_finished(tactic);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (inference_worker.NIL != inference_metrics.any_inference_gathers_hl_module_timesP((SubLObject)inference_worker.UNPROVIDED)) {
                                inference_metrics.possibly_update_hl_module_times(Numbers.subtract(inference_datastructures_inference.inference_time_so_far(inference_macros.current_controlling_inference(), (SubLObject)inference_worker.NIL), start_time));
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    inference_worker.$currently_executing_tactics$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    inference_metrics.increment_forward_inference_metrics((SubLObject)inference_worker.$kw38$INFERENCE, inference_datastructures_tactic.tactic_hl_module_name(tactic), (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            hl_macros.$forward_inference_metric_last_forward_inference_rule$.rebind(_prev_bind_4, thread);
            hl_macros.$forward_inference_metric_last_forward_inference_gaf$.rebind(_prev_bind_3, thread);
            hl_macros.$forward_inference_metric_last_metric$.rebind(_prev_bind_2, thread);
            hl_macros.$forward_inference_metric_last_metric_type$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13561L)
    public static SubLObject possibly_execute_tactic(final SubLObject tactic) {
        if (inference_worker.NIL != inference_datastructures_tactic.tactic_possibleP(tactic)) {
            execute_tactic(tactic);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 13761L)
    public static SubLObject possibly_note_tactic_finished(final SubLObject tactic) {
        if (inference_worker.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
            return (SubLObject)inference_worker.NIL;
        }
        note_tactic_finished(tactic);
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14246L)
    public static SubLObject within_single_literal_tactic_with_asent_and_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list40);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = (SubLObject)inference_worker.NIL;
        SubLObject mt = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list40);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list40);
        mt = current.first();
        current = current.rest();
        if (inference_worker.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_, asent), (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_, mt)), ConsesLow.append(body, (SubLObject)inference_worker.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list40);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14463L)
    public static SubLObject asent_of_currently_executing_tactic() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker.$asent_of_currently_executing_tactic$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14632L)
    public static SubLObject mt_of_currently_executing_tactic() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker.$mt_of_currently_executing_tactic$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 14795L)
    public static SubLObject single_literal_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic) || inference_worker.NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic) || inference_worker.NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic) || inference_worker.NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15049L)
    public static SubLObject execute_literal_level_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        thread.resetMultipleValues();
        final SubLObject mt = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(query);
        final SubLObject asent = thread.secondMultipleValue();
        final SubLObject sense = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0 = inference_worker.$asent_of_currently_executing_tactic$.currentBinding(thread);
        final SubLObject _prev_bind_2 = inference_worker.$mt_of_currently_executing_tactic$.currentBinding(thread);
        try {
            inference_worker.$asent_of_currently_executing_tactic$.bind(asent, thread);
            inference_worker.$mt_of_currently_executing_tactic$.bind(mt, thread);
            if (inference_worker.NIL != inference_worker_removal.literal_level_removal_tactic_p(tactic)) {
                inference_worker_removal.execute_literal_level_removal_tactic(tactic, mt, asent, sense);
            }
            else if (inference_worker.NIL != inference_worker_removal.literal_level_meta_removal_tactic_p(tactic)) {
                inference_worker_removal.execute_literal_level_meta_removal_tactic(tactic, mt, asent, sense);
            }
            else if (inference_worker.NIL != inference_worker_transformation.literal_level_transformation_tactic_p(tactic)) {
                inference_worker_transformation.execute_literal_level_transformation_tactic(tactic, mt, asent, sense);
            }
            else if (inference_worker.NIL != inference_worker_rewrite.literal_level_rewrite_tactic_p(tactic)) {
                inference_worker_rewrite.execute_literal_level_rewrite_tactic(tactic, mt, asent);
            }
            else {
                Errors.error((SubLObject)inference_worker.$str43$Got_a_literal_level_tactic__s_tha, tactic);
            }
        }
        finally {
            inference_worker.$mt_of_currently_executing_tactic$.rebind(_prev_bind_2, thread);
            inference_worker.$asent_of_currently_executing_tactic$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 15949L)
    public static SubLObject literal_level_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == conjunctive_tactic_p(tactic) && inference_worker.NIL == disjunctive_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16124L)
    public static SubLObject execute_multiple_clause_tactic(final SubLObject tactic) {
        if (inference_worker.NIL != inference_worker_union.union_tactic_p(tactic)) {
            return inference_worker_union.execute_union_tactic(tactic);
        }
        Errors.error((SubLObject)inference_worker.$str44$Unexpected_multiple_clause_tactic, inference_datastructures_tactic.tactic_hl_module(tactic));
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16350L)
    public static SubLObject execute_multiple_literal_tactic(final SubLObject tactic) {
        if (inference_worker.NIL != structural_tactic_p(tactic)) {
            return execute_structural_multiple_literal_tactic(tactic);
        }
        if (inference_worker.NIL != meta_structural_tactic_p(tactic)) {
            return execute_meta_structural_multiple_literal_tactic(tactic);
        }
        if (inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(tactic)) {
            return inference_worker_removal.execute_conjunctive_removal_tactic(tactic);
        }
        Errors.error((SubLObject)inference_worker.$str45$Unexpected_multiple_literal_tacti, inference_datastructures_tactic.tactic_hl_module(tactic));
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 16850L)
    public static SubLObject execute_structural_multiple_literal_tactic(final SubLObject tactic) {
        if (inference_worker.NIL != inference_worker_split.split_tactic_p(tactic)) {
            return inference_worker_split.execute_split_tactic(tactic);
        }
        if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.execute_join_ordered_tactic(tactic);
        }
        if (inference_worker.NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.execute_join_tactic(tactic);
        }
        Errors.error((SubLObject)inference_worker.$str46$Unexpected_structural_multiple_li, inference_datastructures_tactic.tactic_hl_module(tactic));
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17272L)
    public static SubLObject execute_meta_structural_multiple_literal_tactic(final SubLObject tactic) {
        if (inference_worker.NIL != inference_worker_split.meta_split_tactic_p(tactic)) {
            return inference_datastructures_tactic.tactic_in_progress_next(tactic);
        }
        Errors.error((SubLObject)inference_worker.$str47$Unexpected_meta_structural_multip, inference_datastructures_tactic.tactic_hl_module(tactic));
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17600L)
    public static SubLObject connected_conjunction_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(v_object) || inference_worker.NIL != inference_worker_join.join_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17743L)
    public static SubLObject connected_conjunction_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_join_ordered.join_ordered_tactic_p(v_object) || inference_worker.NIL != inference_worker_join.join_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 17876L)
    public static SubLObject connected_conjunction_link_tactic(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_tactic(link);
        }
        if (inference_worker.NIL != inference_worker_join.join_link_p(link)) {
            return inference_worker_join.join_link_tactic(link);
        }
        return Errors.error((SubLObject)inference_worker.$str48$unexpected_connected_conjunction_, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18187L)
    public static SubLObject connected_conjunction_tactic_link(final SubLObject tactic) {
        if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
            return inference_worker_join_ordered.join_ordered_tactic_link(tactic);
        }
        if (inference_worker.NIL != inference_worker_join.join_tactic_p(tactic)) {
            return inference_worker_join.join_tactic_link(tactic);
        }
        return Errors.error((SubLObject)inference_worker.$str49$unexpected_connected_conjunction_, tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18516L)
    public static SubLObject conjunctive_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_split.split_link_p(v_object) || inference_worker.NIL != connected_conjunction_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18644L)
    public static SubLObject logical_conjunctive_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_split.split_tactic_p(v_object) || inference_worker.NIL != connected_conjunction_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18785L)
    public static SubLObject conjunctive_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != logical_conjunctive_tactic_p(v_object) || inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 18930L)
    public static SubLObject meta_conjunctive_tactic_p(final SubLObject v_object) {
        return inference_worker_split.meta_split_tactic_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19034L)
    public static SubLObject generalized_conjunctive_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != conjunctive_tactic_p(v_object) || inference_worker.NIL != meta_conjunctive_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19180L)
    public static SubLObject generalized_logical_conjunctive_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != logical_conjunctive_tactic_p(v_object) || inference_worker.NIL != meta_conjunctive_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 19747L)
    public static SubLObject connected_conjunction_tactic_literals_score(final SubLObject conjunction_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == inference_worker_join_ordered.join_ordered_tactic_p(conjunction_tactic)) {
            return (SubLObject)inference_worker.ONE_INTEGER;
        }
        final SubLObject literal_count = clause_utilities.clause_literal_count(inference_worker_join_ordered.join_ordered_tactic_focal_supporting_problem_spec(conjunction_tactic));
        if (literal_count.numG((SubLObject)inference_worker.ONE_INTEGER)) {
            return literal_count;
        }
        if (inference_worker.NIL == inference_worker.$consider_variable_count_of_focal_problems_for_tactic_literals_score_method$.getDynamicValue(thread)) {
            return (SubLObject)inference_worker.ONE_INTEGER;
        }
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_tactic_focal_problem(conjunction_tactic);
        final SubLObject variable_count = Sequences.length(inference_datastructures_problem.problem_variables(focal_problem));
        final SubLObject pcase_var = inference_worker.$consider_variable_count_of_focal_problems_for_tactic_literals_score_method$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)inference_worker.$kw50$EXPONENTIAL)) {
            return Numbers.expt((SubLObject)inference_worker.TWO_INTEGER, variable_count);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw51$SQUARE)) {
            return Numbers.add((SubLObject)inference_worker.ONE_INTEGER, Numbers.multiply(variable_count, variable_count));
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw52$DOUBLE)) {
            return Numbers.add(variable_count, variable_count);
        }
        return variable_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21029L)
    public static SubLObject disjunctive_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_union.union_link_p(v_object) || inference_worker.NIL != inference_worker_union.disjunctive_assumption_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21173L)
    public static SubLObject logical_disjunctive_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_union.union_tactic_p(v_object) || inference_worker.NIL != inference_worker_union.disjunctive_assumption_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21315L)
    public static SubLObject disjunctive_tactic_p(final SubLObject v_object) {
        return logical_disjunctive_tactic_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21471L)
    public static SubLObject disjunctive_link_tactic(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_union.union_link_p(link)) {
            return inference_worker_union.union_link_tactic(link);
        }
        return Errors.error((SubLObject)inference_worker.$str53$unexpected_disjunctive_link__s, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21682L)
    public static SubLObject logical_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != conjunctive_link_p(v_object) || inference_worker.NIL != disjunctive_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21813L)
    public static SubLObject logical_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != logical_conjunctive_tactic_p(v_object) || inference_worker.NIL != logical_disjunctive_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 21954L)
    public static SubLObject logical_link_with_unique_tactic_p(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != connected_conjunction_link_p(link) || inference_worker.NIL != inference_worker_union.union_link_p(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22090L)
    public static SubLObject logical_tactic_with_unique_lookahead_problem_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != logical_tactic_p(tactic) && inference_worker.NIL == inference_worker_join.join_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22243L)
    public static SubLObject logical_link_unique_tactic(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_tactic(link);
        }
        if (inference_worker.NIL != inference_worker_join.join_link_p(link)) {
            return inference_worker_join.join_link_tactic(link);
        }
        if (inference_worker.NIL != inference_worker_union.union_link_p(link)) {
            return inference_worker_union.union_link_tactic(link);
        }
        return Errors.error((SubLObject)inference_worker.$str54$_s_was_not_a_logical_link_with_un, link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 22568L)
    public static SubLObject logical_tactic_link(final SubLObject logical_tactic) {
        final SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
        if (pcase_var.eql((SubLObject)inference_worker.$kw55$SPLIT)) {
            return inference_worker_split.split_tactic_link(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_link(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw57$UNION)) {
            return inference_worker_union.union_tactic_link(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw58$JOIN)) {
            return inference_worker_join.join_tactic_link(logical_tactic);
        }
        return Errors.error((SubLObject)inference_worker.$str59$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23101L)
    public static SubLObject logical_tactic_lookahead_problem(final SubLObject logical_tactic) {
        final SubLObject pcase_var = inference_datastructures_tactic.tactic_hl_module_name(logical_tactic);
        if (pcase_var.eql((SubLObject)inference_worker.$kw55$SPLIT)) {
            return inference_worker_split.split_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
            return inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw57$UNION)) {
            return inference_worker_union.union_tactic_lookahead_problem(logical_tactic);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw58$JOIN)) {
            return Errors.error((SubLObject)inference_worker.$str60$Join_tactics_like__S_do_not_have_, logical_tactic);
        }
        return Errors.error((SubLObject)inference_worker.$str59$Unexpected_logical_tactic_module_, inference_datastructures_tactic.tactic_hl_module(logical_tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23757L)
    public static SubLObject logical_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker.NIL != logical_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 23877L)
    public static SubLObject structural_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != logical_link_p(v_object) || inference_worker.NIL != inference_worker_restriction.restriction_link_p(v_object) || inference_worker.NIL != inference_worker_answer.answer_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24044L)
    public static SubLObject structural_tactic_p(final SubLObject tactic) {
        return logical_tactic_p(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24246L)
    public static SubLObject meta_structural_tactic_p(final SubLObject tactic) {
        return meta_conjunctive_tactic_p(tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24355L)
    public static SubLObject generalized_structural_tactic_p(final SubLObject tactic) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != structural_tactic_p(tactic) || inference_worker.NIL != meta_structural_tactic_p(tactic));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24498L)
    public static SubLObject structural_tactic_lookahead_problem(final SubLObject structural_tactic) {
        return logical_tactic_lookahead_problem(structural_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24636L)
    public static SubLObject structural_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker.NIL != structural_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24762L)
    public static SubLObject structural_proof_type(final SubLObject structural_proof) {
        assert inference_worker.NIL != structural_proof_p(structural_proof) : structural_proof;
        return inference_datastructures_problem_link.problem_link_type(inference_datastructures_proof.proof_link(structural_proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 24932L)
    public static SubLObject content_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_removal.removal_link_p(v_object) || inference_worker.NIL != inference_worker_transformation.transformation_link_p(v_object) || inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(v_object) || inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25136L)
    public static SubLObject content_tactic_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_removal.generalized_removal_tactic_p(v_object) || inference_worker.NIL != inference_worker_transformation.transformation_tactic_p(v_object) || inference_worker.NIL != inference_worker_rewrite.rewrite_tactic_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25348L)
    public static SubLObject content_proof_p(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_proof.proof_p(proof) && inference_worker.NIL != content_link_p(inference_datastructures_proof.proof_link(proof)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 25465L)
    public static SubLObject content_link_supports(final SubLObject content_link) {
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_supports(content_link);
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_supports(content_link);
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_supports(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_supports(content_link);
        }
        Errors.error((SubLObject)inference_worker.$str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 26057L)
    public static SubLObject content_link_tactic(final SubLObject content_link) {
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_tactic(content_link);
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_tactic(content_link);
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_tactic(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_tactic(content_link);
        }
        Errors.error((SubLObject)inference_worker.$str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 26638L)
    public static SubLObject content_link_hl_module(final SubLObject content_link) {
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(content_link)) {
            return inference_worker_removal.removal_link_hl_module(content_link);
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_hl_module(content_link);
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(content_link)) {
            return inference_worker_transformation.transformation_link_hl_module(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(content_link));
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(content_link)) {
            return inference_worker_rewrite.rewrite_link_hl_module(content_link);
        }
        Errors.error((SubLObject)inference_worker.$str62$_a_is_not_a_CONTENT_LINK_P, content_link);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 27237L)
    public static SubLObject content_proof_hl_module(final SubLObject proof) {
        final SubLObject link = inference_datastructures_proof.proof_link(proof);
        final SubLObject hl_module = content_link_hl_module(link);
        return hl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 27433L)
    public static SubLObject content_tactic_actual_productivity(final SubLObject content_tactic) {
        assert inference_worker.NIL != content_tactic_p(content_tactic) : content_tactic;
        if (inference_worker.NIL != inference_datastructures_tactic.tactic_discardedP(content_tactic)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        if (inference_worker.NIL != inference_worker_removal.removal_tactic_p(content_tactic)) {
            return removal_tactic_actual_productivity(content_tactic);
        }
        if (inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(content_tactic)) {
            return conjunctive_removal_tactic_actual_productivity(content_tactic);
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_tactic_p(content_tactic)) {
            return transformation_tactic_actual_productivity(content_tactic);
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_tactic_p(content_tactic)) {
            return rewrite_tactic_actual_productivity(content_tactic);
        }
        if (inference_worker.NIL != inference_worker_removal.meta_removal_tactic_p(content_tactic)) {
            return meta_removal_tactic_actual_productivity(content_tactic);
        }
        return Errors.error((SubLObject)inference_worker.$str64$Unexpected_content_tactic__S, content_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 28406L)
    public static SubLObject removal_tactic_actual_productivity(final SubLObject removal_tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        if (inference_worker.NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
            return single_literal_removal_tactic_actual_productivity(removal_tactic);
        }
        return Errors.error((SubLObject)inference_worker.$str65$Unexpected_removal_tactic__S, removal_tactic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 28751L)
    public static SubLObject single_literal_removal_tactic_actual_productivity(final SubLObject removal_tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(removal_tactic);
        final SubLObject store = inference_datastructures_tactic.tactic_store(removal_tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(removal_tactic);
        SubLObject children = (SubLObject)inference_worker.ZERO_INTEGER;
        if (inference_worker.NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject removal_link;
            SubLObject candidate_hl_module;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                removal_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, removal_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link, (SubLObject)inference_worker.$kw66$REMOVAL)) {
                    candidate_hl_module = inference_worker_removal.removal_link_hl_module(removal_link);
                    if (candidate_hl_module.eql(hl_module)) {
                        children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                    }
                }
            }
        }
        else if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject supporting_problem;
            SubLObject set_contents_var_$6;
            SubLObject basis_object_$7;
            SubLObject state_$8;
            SubLObject removal_link2;
            SubLObject candidate_hl_module2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)inference_worker.$kw67$RESTRICTION)) {
                    supporting_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    set_contents_var_$6 = inference_datastructures_problem.problem_argument_links(supporting_problem);
                    for (basis_object_$7 = set_contents.do_set_contents_basis_object(set_contents_var_$6), state_$8 = (SubLObject)inference_worker.NIL, state_$8 = set_contents.do_set_contents_initial_state(basis_object_$7, set_contents_var_$6); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$7, state_$8); state_$8 = set_contents.do_set_contents_update_state(state_$8)) {
                        removal_link2 = set_contents.do_set_contents_next(basis_object_$7, state_$8);
                        if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$8, removal_link2) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link2, (SubLObject)inference_worker.$kw66$REMOVAL)) {
                            candidate_hl_module2 = inference_worker_removal.removal_link_hl_module(removal_link2);
                            if (candidate_hl_module2.eql(hl_module)) {
                                children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                            }
                        }
                    }
                }
            }
        }
        else {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject removal_link;
            SubLObject candidate_hl_module;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                removal_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, removal_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(removal_link, (SubLObject)inference_worker.$kw66$REMOVAL)) {
                    candidate_hl_module = inference_worker_removal.removal_link_hl_module(removal_link);
                    if (candidate_hl_module.eql(hl_module)) {
                        children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                    }
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 30240L)
    public static SubLObject conjunctive_removal_tactic_actual_productivity(final SubLObject conjunctive_removal_tactic) {
        assert inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(conjunctive_removal_tactic) : conjunctive_removal_tactic;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(conjunctive_removal_tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(conjunctive_removal_tactic);
        SubLObject children = (SubLObject)inference_worker.ZERO_INTEGER;
        if (inference_worker.NIL != inference_datastructures_problem.closed_problem_p(problem)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject cr_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                cr_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, cr_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(cr_link, (SubLObject)inference_worker.$kw30$REMOVAL_CONJUNCTIVE) && hl_module.eql(inference_worker_removal.removal_link_hl_module(cr_link))) {
                    children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                }
            }
        }
        else {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject restricted_problem;
            SubLObject set_contents_var_$9;
            SubLObject basis_object_$10;
            SubLObject state_$11;
            SubLObject cr_link2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)inference_worker.$kw67$RESTRICTION)) {
                    restricted_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    set_contents_var_$9 = inference_datastructures_problem.problem_argument_links(restricted_problem);
                    for (basis_object_$10 = set_contents.do_set_contents_basis_object(set_contents_var_$9), state_$11 = (SubLObject)inference_worker.NIL, state_$11 = set_contents.do_set_contents_initial_state(basis_object_$10, set_contents_var_$9); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$10, state_$11); state_$11 = set_contents.do_set_contents_update_state(state_$11)) {
                        cr_link2 = set_contents.do_set_contents_next(basis_object_$10, state_$11);
                        if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$11, cr_link2) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(cr_link2, (SubLObject)inference_worker.$kw30$REMOVAL_CONJUNCTIVE) && hl_module.eql(inference_worker_removal.removal_link_hl_module(cr_link2))) {
                            children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 31392L)
    public static SubLObject transformation_tactic_actual_productivity(final SubLObject transformation_tactic) {
        assert inference_worker.NIL != inference_worker_transformation.transformation_tactic_p(transformation_tactic) : transformation_tactic;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
        final SubLObject hl_module = inference_datastructures_tactic.tactic_hl_module(transformation_tactic);
        final SubLObject rule = inference_worker_transformation.transformation_tactic_rule(transformation_tactic);
        SubLObject children = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)inference_worker.$kw70$TRANSFORMATION) && hl_module.eql(inference_worker_transformation.transformation_link_hl_module(transformation_link)) && rule.eql(inference_worker_transformation.transformation_link_rule_assertion(transformation_link))) {
                children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32065L)
    public static SubLObject rewrite_tactic_actual_productivity(final SubLObject rewrite_tactic) {
        assert inference_worker.NIL != inference_worker_rewrite.rewrite_tactic_p(rewrite_tactic) : rewrite_tactic;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(rewrite_tactic);
        SubLObject children = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rewrite_link;
        SubLObject candidate_tactic;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rewrite_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, rewrite_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rewrite_link, (SubLObject)inference_worker.$kw72$REWRITE)) {
                candidate_tactic = inference_worker_rewrite.rewrite_link_tactic(rewrite_link);
                if (candidate_tactic.eql(rewrite_tactic)) {
                    children = Numbers.add(children, (SubLObject)inference_worker.ONE_INTEGER);
                }
            }
        }
        return inference_datastructures_enumerated_types.productivity_for_number_of_children(children);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32511L)
    public static SubLObject meta_removal_tactic_actual_productivity(final SubLObject meta_removal_tactic) {
        assert inference_worker.NIL != inference_worker_removal.meta_removal_tactic_p(meta_removal_tactic) : meta_removal_tactic;
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(meta_removal_tactic);
        return inference_datastructures_problem.problem_total_actual_removal_productivity(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 32768L)
    public static SubLObject simple_problem_estimated_total_global_productivity(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        final SubLObject already_proven_productivity = inference_datastructures_enumerated_types.productivity_for_number_of_children(inference_datastructures_problem.problem_proven_proof_count(problem));
        final SubLObject to_be_proven_productivity = estimated_global_productivity_of_problem_possible_tactics(problem, strategic_context);
        final SubLObject total_productivity = inference_datastructures_enumerated_types.productivity_X(already_proven_productivity, to_be_proven_productivity);
        return total_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 33412L)
    public static SubLObject estimated_global_productivity_of_problem_possible_tactics(final SubLObject problem, final SubLObject strategic_context) {
        final SubLObject removal_completeness = problem_generalized_removal_completeness(problem, strategic_context);
        final SubLObject structural_preference_level = problem_structural_preference_level(problem, strategic_context);
        final SubLObject estimated_removal_productivity = estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness(problem, removal_completeness, strategic_context);
        final SubLObject estimated_global_structural_productivity = estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level(problem, structural_preference_level, strategic_context);
        if (inference_worker.$kw31$COMPLETE != removal_completeness && inference_worker.$kw75$PREFERRED != structural_preference_level) {
            return inference_datastructures_enumerated_types.productivity_X(estimated_removal_productivity, estimated_global_structural_productivity);
        }
        if (inference_worker.$kw31$COMPLETE != removal_completeness && inference_worker.$kw75$PREFERRED == structural_preference_level) {
            return estimated_global_structural_productivity;
        }
        if (inference_worker.$kw31$COMPLETE == removal_completeness && inference_worker.$kw75$PREFERRED != structural_preference_level) {
            return estimated_removal_productivity;
        }
        if (inference_worker.$kw31$COMPLETE != removal_completeness || inference_worker.$kw75$PREFERRED != structural_preference_level) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_datastructures_enumerated_types.productivity_L(estimated_removal_productivity, estimated_global_structural_productivity)) {
            return estimated_removal_productivity;
        }
        return estimated_global_structural_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 35248L)
    public static SubLObject estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness(final SubLObject problem, final SubLObject completeness, final SubLObject strategic_context) {
        SubLObject total_estimated_removal_productivity = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_worker.$kw76$GENERALIZED_REMOVAL) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_worker.$kw77$POSSIBLE) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, completeness) && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                total_estimated_removal_productivity = inference_datastructures_enumerated_types.productivity_X(total_estimated_removal_productivity, inference_datastructures_tactic.tactic_productivity(tactic));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_estimated_removal_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 35878L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level(final SubLObject problem, final SubLObject preference_level, final SubLObject strategic_context) {
        if (preference_level.eql((SubLObject)inference_worker.$kw75$PREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_preferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql((SubLObject)inference_worker.$kw78$DISPREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql((SubLObject)inference_worker.$kw79$GROSSLY_DISPREFERRED)) {
            return estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics(problem, strategic_context);
        }
        if (preference_level.eql((SubLObject)inference_worker.$kw80$DISALLOWED) || preference_level.eql((SubLObject)inference_worker.$kw81$DOOMED)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        Errors.error((SubLObject)inference_worker.$str82$Unexpected_preference_level__s, preference_level);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 36614L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_preferred_tactics(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != problem_doomed_due_to_lookahead_removal_completenessP(problem, strategic_context)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        SubLObject total_global_structural_productivity = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject tactic = inference_tactician.select_best_tactic_for_problem(problem, strategic_context, (SubLObject)inference_worker.$kw77$POSSIBLE, (SubLObject)inference_worker.$kw31$COMPLETE, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw83$CONNECTED_CONJUNCTION);
        if (inference_worker.NIL != tactic) {
            total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
        }
        tactic = inference_tactician.select_best_tactic_for_problem(problem, strategic_context, (SubLObject)inference_worker.$kw77$POSSIBLE, (SubLObject)inference_worker.$kw31$COMPLETE, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw55$SPLIT);
        if (inference_worker.NIL != tactic) {
            total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
        }
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic2 = (SubLObject)inference_worker.NIL;
        tactic2 = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic2, (SubLObject)inference_worker.$kw84$STRUCTURAL) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic2, (SubLObject)inference_worker.$kw77$POSSIBLE) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic2, (SubLObject)inference_worker.$kw75$PREFERRED) && inference_worker.NIL == conjunctive_tactic_p(tactic2)) {
                total_global_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_global_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic2, strategic_context));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic2 = cdolist_list_var.first();
        }
        return total_global_structural_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38350L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics(final SubLObject problem, final SubLObject strategic_context) {
        return estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(problem, strategic_context, (SubLObject)inference_worker.$kw78$DISPREFERRED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38613L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics(final SubLObject problem, final SubLObject strategic_context) {
        return estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(problem, strategic_context, (SubLObject)inference_worker.$kw79$GROSSLY_DISPREFERRED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 38892L)
    public static SubLObject estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics(final SubLObject problem, final SubLObject strategic_context, final SubLObject preference_level) {
        if (inference_worker.NIL != problem_doomed_due_to_lookahead_removal_completenessP(problem, strategic_context)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        SubLObject total_non_preferred_structural_productivity = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_worker.$kw84$STRUCTURAL) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_worker.$kw77$POSSIBLE) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic, preference_level)) {
                total_non_preferred_structural_productivity = inference_datastructures_enumerated_types.productivity_X(total_non_preferred_structural_productivity, inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategic_context));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return total_non_preferred_structural_productivity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 39830L)
    public static SubLObject problem_doomed_due_to_lookahead_removal_completenessP(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject logical_tactic = (SubLObject)inference_worker.NIL;
        logical_tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(logical_tactic, (SubLObject)inference_worker.$kw85$LOGICAL) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(logical_tactic, (SubLObject)inference_worker.$kw34$NON_DISCARDED)) {
                if (inference_worker.NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
                    thread.resetMultipleValues();
                    final SubLObject first_lookahead_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
                    final SubLObject second_lookahead_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (inference_worker.NIL != problem_doomed_due_to_removal_completenessP(first_lookahead_problem, strategic_context) || inference_worker.NIL != problem_doomed_due_to_removal_completenessP(second_lookahead_problem, strategic_context)) {
                        return (SubLObject)inference_worker.T;
                    }
                }
                else {
                    final SubLObject lookahead_problem = logical_tactic_lookahead_problem(logical_tactic);
                    if (inference_worker.NIL != problem_doomed_due_to_removal_completenessP(lookahead_problem, strategic_context)) {
                        return (SubLObject)inference_worker.T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 40972L)
    public static SubLObject problem_doomed_due_to_removal_completenessP(final SubLObject problem, final SubLObject strategic_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == good_problem_p(problem, strategic_context) && inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_worker.$kw76$GENERALIZED_REMOVAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41222L)
    public static SubLObject problem_structural_preference_level(final SubLObject problem, final SubLObject strategic_context) {
        return problem_preference_level_int(problem, (SubLObject)inference_worker.$kw84$STRUCTURAL, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41521L)
    public static SubLObject logical_link_generalized_removal_completeness(final SubLObject logical_link, final SubLObject strategic_context) {
        final SubLObject tactic = logical_link_unique_tactic(logical_link);
        return logical_tactic_generalized_removal_completeness(tactic, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 41765L)
    public static SubLObject logical_tactic_generalized_removal_completeness(final SubLObject logical_tactic, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            thread.resetMultipleValues();
            final SubLObject first_problem = inference_worker_join.join_tactic_lookahead_problems(logical_tactic);
            final SubLObject second_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject first_completeness = problem_generalized_removal_completeness(first_problem, strategic_context);
            final SubLObject second_completeness = problem_generalized_removal_completeness(second_problem, strategic_context);
            return inference_datastructures_enumerated_types.min2_completeness(first_completeness, second_completeness);
        }
        return problem_generalized_removal_completeness(logical_tactic_lookahead_problem(logical_tactic), strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 42417L)
    public static SubLObject problem_generalized_removal_completeness(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        SubLObject max_completeness = (SubLObject)inference_worker.$kw86$IMPOSSIBLE;
        SubLObject max_possible_completeness_foundP;
        SubLObject rest;
        SubLObject tactic;
        SubLObject tactic_completeness;
        for (max_possible_completeness_foundP = (SubLObject)inference_worker.NIL, rest = (SubLObject)inference_worker.NIL, rest = inference_datastructures_problem.problem_tactics(problem); inference_worker.NIL == max_possible_completeness_foundP && inference_worker.NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, (SubLObject)inference_worker.$kw76$GENERALIZED_REMOVAL) && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                tactic_completeness = inference_datastructures_strategy.tactic_strategic_completeness(tactic, strategic_context);
                if (inference_worker.NIL != inference_datastructures_enumerated_types.completeness_G(tactic_completeness, max_completeness)) {
                    max_completeness = tactic_completeness;
                    if (max_completeness == inference_worker.$kw31$COMPLETE) {
                        max_possible_completeness_foundP = (SubLObject)inference_worker.T;
                    }
                }
            }
        }
        if (inference_worker.$kw31$COMPLETE != max_completeness && inference_worker.NIL != strategic_context && inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_removal_tacticP(problem, strategic_context)) {
            max_completeness = (SubLObject)inference_worker.$kw31$COMPLETE;
        }
        return max_completeness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 43794L)
    public static SubLObject problem_preference_level_int(final SubLObject problem, final SubLObject type, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        determine_strategic_status_wrt(problem, strategic_context);
        SubLObject max_preference_level = (SubLObject)inference_worker.$kw80$DISALLOWED;
        SubLObject max_possible_preference_level_foundP;
        SubLObject rest;
        SubLObject tactic;
        SubLObject tactic_preference_level;
        for (max_possible_preference_level_foundP = (SubLObject)inference_worker.NIL, rest = (SubLObject)inference_worker.NIL, rest = inference_datastructures_problem.problem_tactics(problem); inference_worker.NIL == max_possible_preference_level_foundP && inference_worker.NIL != rest; rest = rest.rest()) {
            tactic = rest.first();
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL == inference_tactician_strategic_uninterestingness.simple_strategy_chooses_to_ignore_tacticP(strategic_context, tactic))) {
                tactic_preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(tactic, strategic_context);
                if (inference_worker.NIL != preference_modules.preference_level_G(tactic_preference_level, max_preference_level)) {
                    max_preference_level = tactic_preference_level;
                    if (max_preference_level == inference_worker.$kw75$PREFERRED) {
                        max_possible_preference_level_foundP = (SubLObject)inference_worker.T;
                    }
                }
            }
        }
        return max_preference_level;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 44674L)
    public static SubLObject discard_all_other_possible_connected_conjunction_tactics(final SubLObject tactic) {
        if (inference_worker.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            discard_possible_tactics_int(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw83$CONNECTED_CONJUNCTION, tactic, (SubLObject)inference_worker.NIL);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 45288L)
    public static SubLObject possibly_discard_all_other_possible_structural_conjunctive_tactics(final SubLObject tactic) {
        if (inference_worker.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic))) {
            discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 45800L)
    public static SubLObject discard_all_other_possible_structural_conjunctive_tactics(final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        discard_possible_tactics_int(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw87$STRUCTURAL_CONJUNCTIVE, tactic, (SubLObject)inference_worker.NIL);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46030L)
    public static SubLObject problem_link_can_have_proofsP(final SubLObject link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == inference_worker_answer.answer_link_p(link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46462L)
    public static SubLObject intermediate_proof_step_valid_memoizedP_internal(final SubLObject asent, final SubLObject mt, final SubLObject intermediate_step_validation_level) {
        return intermediate_proof_step_validP(asent, mt, intermediate_step_validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46462L)
    public static SubLObject intermediate_proof_step_valid_memoizedP(final SubLObject asent, final SubLObject mt, final SubLObject intermediate_step_validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL == v_memoization_state) {
            return intermediate_proof_step_valid_memoizedP_internal(asent, mt, intermediate_step_validation_level);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker.$sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, (SubLObject)inference_worker.UNPROVIDED);
        if (inference_worker.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker.$sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, (SubLObject)inference_worker.THREE_INTEGER, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.EQUAL, (SubLObject)inference_worker.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker.$sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(asent, mt, intermediate_step_validation_level);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_worker.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_worker.NIL;
            collision = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (inference_worker.NIL != cached_args && inference_worker.NIL == cached_args.rest() && intermediate_step_validation_level.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(intermediate_proof_step_valid_memoizedP_internal(asent, mt, intermediate_step_validation_level)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, mt, intermediate_step_validation_level));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 46670L)
    public static SubLObject intermediate_proof_step_validP(final SubLObject asent, final SubLObject mt, final SubLObject intermediate_step_validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_worker.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (intermediate_step_validation_level.eql((SubLObject)inference_worker.$kw89$NONE)) {
                result = (SubLObject)inference_worker.T;
            }
            else if (intermediate_step_validation_level.eql((SubLObject)inference_worker.$kw90$MINIMAL)) {
                result = (SubLObject)inference_worker.T;
            }
            else if (intermediate_step_validation_level.eql((SubLObject)inference_worker.$kw91$ALL)) {
                result = arg_type.semantically_valid_literalP(asent, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
            }
            else if (intermediate_step_validation_level.eql((SubLObject)inference_worker.$kw92$ARG_TYPE)) {
                result = removal_modules_admitted_formula.inference_admitted_sentence(asent, (SubLObject)inference_worker.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)inference_worker.$str93$Unexpected_intermediate_step_vali, intermediate_step_validation_level);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 47254L)
    public static SubLObject intermediate_proof_validP(final SubLObject proof) {
        final SubLObject link = inference_datastructures_proof.proof_link(proof);
        final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        return intermediate_proof_valid_intP(link, proof_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 47449L)
    public static SubLObject intermediate_proof_valid_intP(final SubLObject link, final SubLObject proof_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject intermediate_step_validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
        if (inference_worker.$kw89$NONE == intermediate_step_validation_level) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != intermediate_proof_valid_due_to_structureP(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != content_link_p(link) && inference_worker.NIL == intermediate_proof_supports_validP(link, intermediate_step_validation_level)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.$kw90$MINIMAL == intermediate_step_validation_level) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != intermediate_proof_content_link_validP(link)) {
            return (SubLObject)inference_worker.T;
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
        final SubLObject proven_query = bindings.apply_bindings(proof_bindings, supported_query);
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            SubLObject invalidP;
            SubLObject rest;
            SubLObject contextualized_clause;
            SubLObject proven_sense;
            SubLObject index_var;
            SubLObject cdolist_list_var;
            SubLObject contextualized_asent;
            SubLObject current;
            SubLObject datum;
            SubLObject proven_mt;
            SubLObject proven_asent;
            for (invalidP = (SubLObject)inference_worker.NIL, rest = (SubLObject)inference_worker.NIL, rest = proven_query; inference_worker.NIL == invalidP && inference_worker.NIL != rest; rest = rest.rest()) {
                contextualized_clause = rest.first();
                proven_sense = (SubLObject)inference_worker.$kw29$NEG;
                index_var = (SubLObject)inference_worker.ZERO_INTEGER;
                cdolist_list_var = clauses.neg_lits(contextualized_clause);
                contextualized_asent = (SubLObject)inference_worker.NIL;
                contextualized_asent = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    datum = (current = contextualized_asent);
                    proven_mt = (SubLObject)inference_worker.NIL;
                    proven_asent = (SubLObject)inference_worker.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list94);
                    proven_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list94);
                    proven_asent = current.first();
                    current = current.rest();
                    if (inference_worker.NIL == current) {
                        invalidP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == intermediate_proof_asent_validP(proven_mt, proven_asent, proven_sense, intermediate_step_validation_level));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list94);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)inference_worker.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
                proven_sense = (SubLObject)inference_worker.$kw28$POS;
                index_var = (SubLObject)inference_worker.ZERO_INTEGER;
                cdolist_list_var = clauses.pos_lits(contextualized_clause);
                contextualized_asent = (SubLObject)inference_worker.NIL;
                contextualized_asent = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    datum = (current = contextualized_asent);
                    proven_mt = (SubLObject)inference_worker.NIL;
                    proven_asent = (SubLObject)inference_worker.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list94);
                    proven_mt = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list94);
                    proven_asent = current.first();
                    current = current.rest();
                    if (inference_worker.NIL == current) {
                        invalidP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == intermediate_proof_asent_validP(proven_mt, proven_asent, proven_sense, intermediate_step_validation_level));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list94);
                    }
                    index_var = Numbers.add(index_var, (SubLObject)inference_worker.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    contextualized_asent = cdolist_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == invalidP);
        }
        thread.resetMultipleValues();
        final SubLObject proven_mt2 = inference_datastructures_problem_query.mt_asent_sense_from_singleton_query(proven_query);
        final SubLObject proven_asent2 = thread.secondMultipleValue();
        final SubLObject proven_sense2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return intermediate_proof_asent_validP(proven_mt2, proven_asent2, proven_sense2, intermediate_step_validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 48964L)
    public static SubLObject intermediate_proof_asent_validP(final SubLObject mt, final SubLObject asent, final SubLObject sense, final SubLObject intermediate_step_validation_level) {
        return intermediate_proof_step_valid_memoizedP(asent, mt, intermediate_step_validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 49270L)
    public static SubLObject intermediate_proof_valid_due_to_structureP(final SubLObject link) {
        if (inference_worker.NIL != conjunctive_link_p(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_answer.answer_link_p(link)) {
            Errors.error((SubLObject)inference_worker.$str95$Didn_t_expect_to_bubble_up_a_proo, link);
        }
        else {
            if (inference_worker.NIL != disjunctive_link_p(link)) {
                return (SubLObject)inference_worker.T;
            }
            if (inference_worker.NIL != content_link_p(link)) {
                return (SubLObject)inference_worker.NIL;
            }
            Errors.error((SubLObject)inference_worker.$str96$Unexpected_link_type_for_link__a, link);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 49997L)
    public static SubLObject intermediate_proof_supports_validP(final SubLObject link, final SubLObject intermediate_step_validation_level) {
        SubLObject cdolist_list_var;
        final SubLObject supports = cdolist_list_var = content_link_supports(link);
        SubLObject support = (SubLObject)inference_worker.NIL;
        support = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL == hl_supports.hl_validate(support, intermediate_step_validation_level)) {
                return (SubLObject)inference_worker.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 50308L)
    public static SubLObject intermediate_proof_content_link_validP(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(link)) {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            final SubLObject supported_query = inference_datastructures_problem.problem_query(supported_problem);
            if (inference_worker.NIL != clause_utilities.pos_atomic_clauses_p(supported_query)) {
                final SubLObject supports = inference_worker_removal.removal_link_supports(link);
                if (inference_worker.NIL == list_utilities.singletonP(supports)) {
                    return (SubLObject)inference_worker.NIL;
                }
            }
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(link)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return (SubLObject)inference_worker.NIL;
        }
        Errors.error((SubLObject)inference_worker.$str96$Unexpected_link_type_for_link__a, link);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 51791L)
    public static SubLObject propose_new_proof_with_bindings(final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject existing_proof = (SubLObject)inference_worker.NIL;
        existing_proof = find_proof(link, proof_bindings, subproofs);
        if (inference_worker.NIL != existing_proof) {
            return Values.values(existing_proof, (SubLObject)inference_worker.NIL);
        }
        final SubLObject new_proof = inference_datastructures_proof.new_proof_with_bindings(link, proof_bindings, subproofs);
        proof_propagate_non_explananatory_subproofs(new_proof);
        final SubLObject validP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == inference_worker.$eager_proof_validationP$.getDynamicValue(thread) || inference_worker.NIL != intermediate_proof_validP(new_proof));
        if (inference_worker.NIL == validP) {
            reject_proof_due_to_ill_formedness(new_proof);
        }
        else if (inference_worker.NIL != Sequences.find_if((SubLObject)inference_worker.$sym97$PROOF_REJECTED_, subproofs, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED)) {
            if (inference_worker.NIL != control_vars.$inference_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)inference_worker.$str98$propose_new_proof_with_bindings__, Sequences.find_if((SubLObject)inference_worker.$sym97$PROOF_REJECTED_, subproofs, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED), new_proof);
            }
            reject_proof(new_proof, (SubLObject)inference_worker.$kw99$REJECTED_SUBPROOF);
        }
        else if (inference_worker.NIL != inference_worker.$proof_circularity_detection_enabledP$.getDynamicValue(thread) && inference_worker.NIL != proof_circularP(new_proof)) {
            reject_proof_due_to_circularity(new_proof);
        }
        else {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (inference_worker.NIL != inference_abduction_utilities.reject_proof_due_to_non_abducible_ruleP(link, supported_problem, subproofs)) {
                reject_proof_due_to_non_abducible_rule(new_proof);
            }
            else if (inference_worker.NIL != transformation_modules.modus_tollens_transformation_proof_p(new_proof) && inference_worker.NIL != removal_modules_non_wff.proof_has_some_non_wff_subproofP(new_proof)) {
                reject_proof_due_to_modus_tollens_with_non_wff(new_proof);
            }
            else {
                consider_that_problem_could_be_good(supported_problem);
                consider_that_subproofs_may_be_unprocessed(new_proof);
            }
        }
        return Values.values(new_proof, validP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 54404L)
    public static SubLObject proof_propagate_non_explananatory_subproofs(final SubLObject proof) {
        assert inference_worker.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject store = inference_datastructures_proof.proof_store(proof);
        SubLObject total = (SubLObject)inference_worker.ZERO_INTEGER;
        if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store) && inference_worker.NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$12 = proof_non_explanatory_subproofs(subproof);
                SubLObject non_explanatory_subproof = (SubLObject)inference_worker.NIL;
                non_explanatory_subproof = cdolist_list_var_$12.first();
                while (inference_worker.NIL != cdolist_list_var_$12) {
                    total = Numbers.add(total, (SubLObject)inference_worker.ONE_INTEGER);
                    inference_datastructures_problem_store.proof_note_non_explanatory_subproof(proof, non_explanatory_subproof);
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    non_explanatory_subproof = cdolist_list_var_$12.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (inference_worker.NIL != inference_worker_transformation.generalized_transformation_proof_p(proof)) {
                SubLObject cdolist_list_var2;
                final SubLObject non_explanatory_subproofs = cdolist_list_var2 = compute_generalized_transformation_proof_non_explanatory_subproofs(proof);
                SubLObject non_explanatory_subproof2 = (SubLObject)inference_worker.NIL;
                non_explanatory_subproof2 = cdolist_list_var2.first();
                while (inference_worker.NIL != cdolist_list_var2) {
                    total = Numbers.add(total, (SubLObject)inference_worker.ONE_INTEGER);
                    inference_datastructures_problem_store.proof_note_non_explanatory_subproof(proof, non_explanatory_subproof2);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    non_explanatory_subproof2 = cdolist_list_var2.first();
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55439L)
    public static SubLObject proof_circularP(final SubLObject proof) {
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_worker.NIL;
        subproof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != proof_circular_wrtP(subproof, proof, (SubLObject)inference_worker.ZERO_INTEGER)) {
                return (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 55909L)
    public static SubLObject proof_circular_wrtP(final SubLObject proof, final SubLObject candidate_circular_proof, final SubLObject depth) {
        if (depth.numG(inference_worker.$circular_proof_max_depth_cutoff$.getGlobalValue())) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != proofs_share_problem_and_bindingsP(proof, candidate_circular_proof)) {
            return (SubLObject)inference_worker.T;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_worker.NIL;
        subproof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != proof_circular_wrtP(subproof, candidate_circular_proof, number_utilities.f_1X(depth))) {
                return (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56396L)
    public static SubLObject proofs_share_problem_and_bindingsP(final SubLObject proof1, final SubLObject proof2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_proof.proof_supported_problem(proof1).eql(inference_datastructures_proof.proof_supported_problem(proof2)) && inference_worker.NIL != proof_bindings_equalP(inference_datastructures_proof.proof_bindings(proof1), inference_datastructures_proof.proof_bindings(proof2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56723L)
    public static SubLObject proofs_share_problem_and_bindings_and_direct_supportsP(final SubLObject proof1, final SubLObject proof2) {
        return inference_datastructures_proof.proof_equalP(proof1, proof2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56851L)
    public static SubLObject reject_proof_due_to_circularity(final SubLObject proof) {
        reject_proof(proof, (SubLObject)inference_worker.$kw102$CIRCULAR);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 56958L)
    public static SubLObject reject_proof_due_to_ill_formedness(final SubLObject proof) {
        reject_proof(proof, (SubLObject)inference_worker.$kw103$ILL_FORMED);
        proof_note_proven_query_no_good_due_to_ill_formedness(proof);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57134L)
    public static SubLObject reject_proof_due_to_non_abducible_rule(final SubLObject proof) {
        reject_proof(proof, (SubLObject)inference_worker.$kw104$NON_ABDUCIBLE_RULE);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57258L)
    public static SubLObject reject_proof_due_to_modus_tollens_with_non_wff(final SubLObject proof) {
        reject_proof(proof, (SubLObject)inference_worker.$kw105$MODUS_TOLLENS_WITH_NON_WFF);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57396L)
    public static SubLObject reject_proof(final SubLObject proof, final SubLObject reject_reason) {
        if (inference_worker.NIL == inference_datastructures_proof.proof_rejectedP(proof)) {
            inference_datastructures_proof.proof_note_rejected(proof, reject_reason);
            propagate_proof_rejected(proof);
        }
        consider_that_problem_could_no_longer_be_good(inference_datastructures_proof.proof_supported_problem(proof));
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57666L)
    public static SubLObject propagate_proof_rejected(final SubLObject proof) {
        SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
        SubLObject dependent_proof = (SubLObject)inference_worker.NIL;
        dependent_proof = csome_list_var.first();
        while (inference_worker.NIL != csome_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, (SubLObject)inference_worker.$kw106$PROVEN)) {
                reject_proof(dependent_proof, (SubLObject)inference_worker.$kw99$REJECTED_SUBPROOF);
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 57863L)
    public static SubLObject proof_note_proven_query_no_good_due_to_ill_formedness(final SubLObject rejected_proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_proof.proof_store(rejected_proof);
        final SubLObject proven_query = proof_proven_query(rejected_proof);
        final SubLObject free_hl_vars = variables.sort_hl_variable_list_memoized(bindings.bindings_variables(inference_datastructures_proof.proof_bindings(rejected_proof)));
        final SubLObject mapped_problem = find_problem(store, proven_query, free_hl_vars);
        if (inference_worker.NIL != mapped_problem) {
            final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            if (inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
                final SubLObject status_var = (SubLObject)inference_worker.$kw106$PROVEN;
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject proof_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var = proof_list;
                    SubLObject proof = (SubLObject)inference_worker.NIL;
                    proof = cdolist_list_var.first();
                    while (inference_worker.NIL != cdolist_list_var) {
                        if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                            reject_proof(proof, (SubLObject)inference_worker.$kw103$ILL_FORMED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        proof = cdolist_list_var.first();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                problem_force_no_goodness(problem);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59075L)
    public static SubLObject problem_force_no_goodness(final SubLObject problem) {
        return make_problem_no_good(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59184L)
    public static SubLObject possibly_note_proof_processed(final SubLObject proof) {
        assert inference_worker.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        final SubLObject store = inference_datastructures_proof.proof_store(proof);
        if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) {
            possibly_note_proof_processed_int(proof);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 59654L)
    public static SubLObject possibly_note_proof_processed_int(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_proof.valid_proof_p(proof) && inference_worker.NIL == inference_datastructures_proof.proof_processedP(proof) && inference_worker.NIL != all_dependent_proofs_are_processedP(proof)) {
            inference_datastructures_proof.note_proof_processed(proof);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                possibly_note_proof_processed_int(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (inference_worker.NIL != inference_worker.$process_motivated_transformation_link_proofsP$.getDynamicValue(thread)) {
                final SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
                if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(rt_link)) {
                    final SubLObject t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link);
                    SubLObject cdolist_list_var2 = inference_datastructures_problem_link.problem_link_proofs(t_link);
                    SubLObject proof_$13 = (SubLObject)inference_worker.NIL;
                    proof_$13 = cdolist_list_var2.first();
                    while (inference_worker.NIL != cdolist_list_var2) {
                        if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof_$13, (SubLObject)inference_worker.NIL)) {
                            possibly_note_proof_processed_int(proof_$13);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        proof_$13 = cdolist_list_var2.first();
                    }
                }
            }
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60437L)
    public static SubLObject consider_that_subproofs_may_be_unprocessed(final SubLObject new_proof) {
        final SubLObject store = inference_datastructures_proof.proof_store(new_proof);
        if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_allows_proof_processingP(store)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(new_proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_datastructures_proof.proof_processedP(subproof)) {
                    inference_datastructures_proof.note_proof_unprocessed(subproof);
                    consider_that_subproofs_may_be_unprocessed(subproof);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return new_proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 60858L)
    public static SubLObject all_dependent_proofs_are_processedP(final SubLObject proof) {
        SubLObject witness = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL == witness) {
            SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
            SubLObject dependent_proof = (SubLObject)inference_worker.NIL;
            dependent_proof = csome_list_var.first();
            while (inference_worker.NIL == witness && inference_worker.NIL != csome_list_var) {
                if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, (SubLObject)inference_worker.NIL) && inference_worker.NIL == inference_datastructures_proof.proof_processedP(dependent_proof)) {
                    witness = dependent_proof;
                }
                csome_list_var = csome_list_var.rest();
                dependent_proof = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 61295L)
    public static SubLObject find_proof(final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_worker.$find_proof_bindings_optimization_enabledP$.getDynamicValue(thread)) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            if (inference_worker.NIL != inference_datastructures_inference.inference_problem_store_privateP(inference) && inference_worker.NIL != inference_datastructures_inference.inference_unique_wrt_bindingsP(inference) && (inference_worker.NIL == inference_worker_transformation.generalized_transformation_link_p(link) || inference_worker.NIL != inference_worker_transformation.generalized_transformation_link_unaffected_by_exceptionsP(link))) {
                final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                SubLObject cdolist_list_var;
                final SubLObject candidate_proofs = cdolist_list_var = inference_datastructures_problem.problem_proofs_lookup(supported_problem, proof_bindings);
                SubLObject candidate_proof = (SubLObject)inference_worker.NIL;
                candidate_proof = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL == inference_datastructures_proof.proof_rejectedP(candidate_proof)) {
                        return candidate_proof;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate_proof = cdolist_list_var.first();
                }
            }
        }
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != problem_is_the_root_problem_of_some_inferenceP(currently_active_problem()) && inference_worker.NIL != inference_datastructures_inference.inference_unique_wrt_proofsP(inference_macros.current_controlling_inference())) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject candidate_proofs2 = inference_datastructures_problem.problem_proofs_lookup(supported_problem2, proof_bindings);
        if (inference_worker.NIL != candidate_proofs2) {
            final SubLObject direct_supports = inference_datastructures_proof.proof_spec_direct_supports(link, subproofs);
            SubLObject cdolist_list_var = candidate_proofs2;
            SubLObject proof = (SubLObject)inference_worker.NIL;
            proof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != conjunctive_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs) || inference_worker.NIL != residual_transformation_proof_subsumes_conjunctive_proof_specP(proof, link, proof_bindings, subproofs) || inference_worker.NIL != inference_datastructures_proof.proof_matches_specificationP(proof, supported_problem2, proof_bindings, direct_supports)) {
                    return proof;
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 63573L)
    public static SubLObject conjunctive_proof_subsumes_conjunctive_proof_specP(final SubLObject proof, final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(proof, link, proof_bindings, subproofs) || inference_worker.NIL != split_proof_subsumes_split_proof_specP(proof, link, proof_bindings, subproofs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 63885L)
    public static SubLObject connected_conjunction_proof_subsumes_connected_conjunction_proof_specP(final SubLObject proof, final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_join_ordered.connected_conjunction_proof_p(proof) && inference_worker.NIL != connected_conjunction_link_p(link) && inference_worker.NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function((SubLObject)inference_worker.EQ)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64263L)
    public static SubLObject split_proof_subsumes_split_proof_specP(final SubLObject proof, final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_split.split_proof_p(proof) && inference_worker.NIL != inference_worker_split.split_link_p(link) && inference_worker.NIL != list_utilities.sets_equalP(inference_datastructures_proof.proof_direct_subproofs(proof), subproofs, Symbols.symbol_function((SubLObject)inference_worker.EQ)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64577L)
    public static SubLObject residual_transformation_proof_subsumes_conjunctive_proof_specP(final SubLObject proof, final SubLObject link, final SubLObject proof_bindings, final SubLObject subproofs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof) && inference_worker.NIL != conjunctive_link_p(link) && inference_worker.NIL != residual_transformation_proof_subsumes_conjunctive_proof_specP_int(proof, link, proof_bindings, subproofs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 64894L)
    public static SubLObject residual_transformation_proof_subsumes_conjunctive_proof_specP_int(final SubLObject rt_proof, final SubLObject c_link, final SubLObject c_proof_bindings, final SubLObject c_subproofs) {
        SubLObject subsumedP = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL != proof_bindings_equalP(inference_datastructures_proof.proof_bindings(rt_proof), c_proof_bindings) && inference_worker.NIL == subsumedP) {
            SubLObject csome_list_var = c_subproofs;
            SubLObject c_transformation_subproof = (SubLObject)inference_worker.NIL;
            c_transformation_subproof = csome_list_var.first();
            while (inference_worker.NIL == subsumedP && inference_worker.NIL != csome_list_var) {
                if (inference_worker.NIL != inference_worker_transformation.transformation_proof_p(c_transformation_subproof) && inference_worker.NIL == subsumedP) {
                    SubLObject csome_list_var_$14 = c_subproofs;
                    SubLObject c_restriction_subproof = (SubLObject)inference_worker.NIL;
                    c_restriction_subproof = csome_list_var_$14.first();
                    while (inference_worker.NIL == subsumedP && inference_worker.NIL != csome_list_var_$14) {
                        if (inference_worker.NIL != inference_worker_restriction.restriction_proof_p(c_restriction_subproof)) {
                            final SubLObject c_transformation_supporting_subproof = inference_worker_transformation.transformation_proof_subproof(c_transformation_subproof);
                            final SubLObject rt_c_subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(rt_proof);
                            if (inference_worker.NIL != inference_worker_join_ordered.connected_conjunction_proof_p(rt_c_subproof)) {
                                SubLObject current;
                                final SubLObject datum = current = inference_datastructures_proof.proof_direct_subproofs(rt_c_subproof);
                                SubLObject rt_c_first_subproof = (SubLObject)inference_worker.NIL;
                                SubLObject rt_c_second_subproof = (SubLObject)inference_worker.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list107);
                                rt_c_first_subproof = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list107);
                                rt_c_second_subproof = current.first();
                                current = current.rest();
                                if (inference_worker.NIL == current) {
                                    if ((rt_c_first_subproof.eql(c_transformation_supporting_subproof) && rt_c_second_subproof.eql(c_restriction_subproof)) || (rt_c_second_subproof.eql(c_transformation_supporting_subproof) && rt_c_first_subproof.eql(c_restriction_subproof))) {
                                        subsumedP = rt_proof;
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list107);
                                }
                            }
                        }
                        csome_list_var_$14 = csome_list_var_$14.rest();
                        c_restriction_subproof = csome_list_var_$14.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                c_transformation_subproof = csome_list_var.first();
            }
        }
        return subsumedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67005L)
    public static SubLObject new_goal_proof(final SubLObject goal_link) {
        assert inference_worker.NIL != inference_datastructures_problem_link.problem_link_to_goal_p(goal_link) : goal_link;
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(goal_link)) {
            return inference_worker_removal.new_removal_proof(goal_link);
        }
        return inference_worker_transformation.new_transformation_proof(goal_link, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67314L)
    public static SubLObject proof_proven_query(final SubLObject proof) {
        final SubLObject problem_query = inference_datastructures_proof.proof_supported_problem_query(proof);
        final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings(proof);
        final SubLObject proven_query = bindings.apply_bindings(proof_bindings, problem_query);
        return proven_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67644L)
    public static SubLObject proof_proven_sentence(final SubLObject proof) {
        return inference_czer.problem_query_formula(proof_proven_query(proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 67798L)
    public static SubLObject proof_bindings_from_constituents(final SubLObject local_bindings, final SubLObject sub_bindings, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == sub_bindings) {
            if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL != variable_map) {
                Errors.error((SubLObject)inference_worker.$str109$expected_a_variable_map_to_be_nul);
            }
            return local_bindings;
        }
        final SubLObject localized_sub_bindings = bindings.transfer_variable_map_to_bindings(variable_map, sub_bindings);
        final SubLObject grounded_local_bindings = bindings.apply_bindings_to_values(localized_sub_bindings, local_bindings);
        SubLObject complete_local_bindings = ConsesLow.nconc(localized_sub_bindings, grounded_local_bindings);
        complete_local_bindings = ncanonicalize_proof_bindings(complete_local_bindings);
        return complete_local_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69026L)
    public static SubLObject ncanonicalize_proof_bindings_int(final SubLObject proof_bindings) {
        final SubLObject sorted_bindings = Sort.sort(proof_bindings, (SubLObject)inference_worker.$sym110$VARIABLE__, (SubLObject)inference_worker.$sym111$VARIABLE_BINDING_VARIABLE);
        return list_utilities.delete_duplicates_sorted(sorted_bindings, Symbols.symbol_function((SubLObject)inference_worker.EQUAL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69309L)
    public static SubLObject ncanonicalize_proof_bindings(final SubLObject proof_bindings) {
        if (inference_worker.NIL != list_utilities.singletonP(proof_bindings)) {
            return proof_bindings;
        }
        return ncanonicalize_proof_bindings_int(proof_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69516L)
    public static SubLObject canonicalize_proof_bindings(final SubLObject proof_bindings) {
        if (inference_worker.NIL != proof_bindings_canonicalP(proof_bindings)) {
            return proof_bindings;
        }
        return ncanonicalize_proof_bindings(conses_high.copy_list(proof_bindings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 69903L)
    public static SubLObject proof_bindings_canonicalP(final SubLObject proof_bindings) {
        return proof_bindings_canonicalP_recursive(proof_bindings, (SubLObject)inference_worker.MINUS_ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70030L)
    public static SubLObject proof_bindings_canonicalP_recursive(final SubLObject proof_bindings, final SubLObject last_id) {
        if (inference_worker.NIL == proof_bindings) {
            return (SubLObject)inference_worker.T;
        }
        final SubLObject next_id = variables.variable_id(bindings.variable_binding_variable(proof_bindings.first()));
        if (next_id.numLE(last_id)) {
            return (SubLObject)inference_worker.NIL;
        }
        return proof_bindings_canonicalP_recursive(proof_bindings.rest(), next_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70362L)
    public static SubLObject proof_bindings_equalP(final SubLObject proof_bindings1, final SubLObject proof_bindings2) {
        return Equality.equal(proof_bindings1, proof_bindings2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 70531L)
    public static SubLObject unify_all_equal_bindings(final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_bindings = (SubLObject)inference_worker.NIL;
        final SubLObject duplicate_bindings = list_utilities.duplicates(v_bindings, Symbols.symbol_function((SubLObject)inference_worker.EQL), Symbols.symbol_function((SubLObject)inference_worker.$sym111$VARIABLE_BINDING_VARIABLE));
        SubLObject cdolist_list_var;
        final SubLObject duplicate_variables = cdolist_list_var = list_utilities.fast_delete_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_worker.$sym111$VARIABLE_BINDING_VARIABLE), duplicate_bindings), (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
        SubLObject variable = (SubLObject)inference_worker.NIL;
        variable = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject first_value = two_values_in_bindings_with_same_variable(v_bindings, variable);
            final SubLObject second_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject value_unify_results = unification.unify(first_value, second_value, (SubLObject)inference_worker.T, (SubLObject)inference_worker.UNPROVIDED);
            final SubLObject value_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_worker.NIL == bindings.unification_success_token_p(value_unify_results)) {
                new_bindings = ConsesLow.append(value_unify_results, new_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return new_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 71491L)
    public static SubLObject two_values_in_bindings_with_same_variable(final SubLObject v_bindings, final SubLObject variable) {
        SubLObject first_value = (SubLObject)inference_worker.NIL;
        SubLObject second_value = (SubLObject)inference_worker.NIL;
        SubLObject first_value_foundP = (SubLObject)inference_worker.NIL;
        SubLObject second_value_foundP = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)inference_worker.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject binding_variable = (SubLObject)inference_worker.NIL;
            SubLObject binding_value = (SubLObject)inference_worker.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list112);
            binding_variable = current.first();
            current = (binding_value = current.rest());
            if (variable.eql(binding_variable)) {
                if (inference_worker.NIL == first_value_foundP && inference_worker.NIL == second_value_foundP) {
                    first_value = binding_value;
                    first_value_foundP = (SubLObject)inference_worker.T;
                }
                else if (inference_worker.NIL == second_value_foundP) {
                    second_value = binding_value;
                    second_value_foundP = (SubLObject)inference_worker.T;
                }
                else {
                    Errors.error((SubLObject)inference_worker.$str113$Found_a_triplicate_binding_for__s, variable, v_bindings);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (inference_worker.NIL != first_value_foundP && inference_worker.NIL != second_value_foundP) {
            return Values.values(first_value, second_value);
        }
        Errors.error((SubLObject)inference_worker.$str114$Could_not_find_two_values_in__s_w, v_bindings, variable);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72515L)
    public static SubLObject all_bindings_ground_outP(final SubLObject v_bindings) {
        assert inference_worker.NIL != bindings.bindings_p(v_bindings) : v_bindings;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)inference_worker.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL == binding_ground_outP(binding)) {
                return (SubLObject)inference_worker.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 72773L)
    public static SubLObject binding_ground_outP(final SubLObject binding) {
        final SubLObject value = bindings.variable_binding_value(binding);
        return variables.fully_bound_p(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73158L)
    public static SubLObject bubble_up_proof(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.$proof_bubbling_depth$.getDynamicValue(thread).numG(inference_worker.$max_proof_bubbling_depth$.getGlobalValue())) {
            reject_proof(proof, (SubLObject)inference_worker.$kw117$MAX_PROOF_BUBBLING_DEPTH);
        }
        else {
            final SubLObject _prev_bind_0 = inference_worker.$proof_bubbling_depth$.currentBinding(thread);
            try {
                inference_worker.$proof_bubbling_depth$.bind(number_utilities.f_1X(inference_worker.$proof_bubbling_depth$.getDynamicValue(thread)), thread);
                final SubLObject supported_problem = inference_datastructures_proof.proof_supported_problem(proof);
                bubble_up_proof_from_problem(proof, supported_problem);
            }
            finally {
                inference_worker.$proof_bubbling_depth$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73636L)
    public static SubLObject bubble_up_proof_from_problem(final SubLObject proof, final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                bubble_up_proof_to_link(proof, dependent_link);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 73820L)
    public static SubLObject bubble_up_proof_to_link(final SubLObject proof, final SubLObject dependent_link) {
        if (inference_worker.NIL != inference_datastructures_proof.proof_provenP(proof)) {
            final SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
            if (pcase_var.eql((SubLObject)inference_worker.$kw118$ANSWER)) {
                final SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
                propagate_proof_to_inference(proof, inference);
            }
            else {
                final SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(dependent_link);
                SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, dependent_link, supporting_mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem))) {
                        bubble_up_proof_to_link_via_mapped_problem(proof, dependent_link, supporting_mapped_problem);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 75001L)
    public static SubLObject bubble_up_proof_to_link_via_mapped_problem(final SubLObject proof, final SubLObject dependent_link, final SubLObject mapped_problem) {
        if (inference_worker.NIL != link_permits_proof_propagationP(dependent_link, mapped_problem)) {
            final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            bubble_up_proof_to_link_via_variable_map(proof, variable_map, dependent_link);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 75645L)
    public static SubLObject bubble_up_proof_to_link_via_variable_map(final SubLObject proof, final SubLObject variable_map, final SubLObject dependent_link) {
        assert inference_worker.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        assert inference_worker.NIL != bindings.variable_map_p(variable_map) : variable_map;
        final SubLObject pcase_var = inference_datastructures_problem_link.problem_link_type(dependent_link);
        if (pcase_var.eql((SubLObject)inference_worker.$kw70$TRANSFORMATION)) {
            inference_worker_transformation.bubble_up_proof_to_transformation_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw72$REWRITE)) {
            inference_worker_rewrite.bubble_up_proof_to_rewrite_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
            inference_worker_join_ordered.bubble_up_proof_to_join_ordered_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw58$JOIN)) {
            inference_worker_join.bubble_up_proof_to_join_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw55$SPLIT)) {
            inference_worker_split.bubble_up_proof_to_split_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw67$RESTRICTION)) {
            inference_worker_restriction.bubble_up_proof_to_restriction_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw120$RESIDUAL_TRANSFORMATION)) {
            inference_worker_residual_transformation.bubble_up_proof_to_residual_transformation_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw57$UNION)) {
            inference_worker_union.bubble_up_proof_to_union_link(proof, variable_map, dependent_link);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw121$DISJUNCTIVE_ASSUMPTION)) {
            Errors.error((SubLObject)inference_worker.$str122$can_t_handle_bubbling_up_proofs_p);
        }
        else if (pcase_var.eql((SubLObject)inference_worker.$kw118$ANSWER)) {
            final SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(dependent_link);
            propagate_proof_to_inference(proof, inference);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 77522L)
    public static SubLObject perform_lazy_proof_rejection(final SubLObject proof, final SubLObject inference) {
        if (inference_worker.NIL != inference_datastructures_inference.inference_allow_abnormality_checkingP(inference)) {
            reject_abnormal_subproofs(proof);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78338L)
    public static SubLObject proof_consistent_with_mt_assumptionsP(final SubLObject proof) {
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78702L)
    public static SubLObject within_abnormality_checkingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_worker.$within_abnormality_checkingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 78792L)
    public static SubLObject reject_abnormal_subproofs(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == inference_datastructures_proof.proof_provenP(proof)) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject _prev_bind_0 = inference_worker.$within_abnormality_checkingP$.currentBinding(thread);
        try {
            inference_worker.$within_abnormality_checkingP$.bind((SubLObject)inference_worker.T, thread);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                reject_abnormal_subproofs(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            final SubLObject justification = (SubLObject)((inference_worker.NIL != inference_worker_transformation.transformation_proof_p(proof)) ? inference_worker_transformation.transformation_proof_abnormalP(proof) : ((inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) ? inference_worker_residual_transformation.residual_transformation_proof_abnormalP(proof) : inference_worker.NIL));
            if (inference_worker.NIL != justification) {
                reject_proof_due_to_abnormality(proof, justification);
            }
            if (inference_worker.NIL != ((inference_worker.NIL != abnormal.abnormality_except_support_enabledP()) ? inference_worker_transformation.proof_depends_on_excepted_assertionP(proof) : inference_worker.NIL)) {
                reject_proof(proof, (SubLObject)inference_worker.$kw123$EXCEPTED_ASSERTION);
            }
        }
        finally {
            inference_worker.$within_abnormality_checkingP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 79799L)
    public static SubLObject reject_proof_due_to_abnormality(final SubLObject proof, final SubLObject justification) {
        return reject_proof(proof, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80041L)
    public static SubLObject inference_proof_non_explanatory_subproofs(final SubLObject inference, final SubLObject proof) {
        final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        if (inference_worker.NIL != inference_worker_answer.answer_link_supporting_problem_wholly_explanatoryP(answer_link)) {
            return proof_non_explanatory_subproofs(proof);
        }
        return cached_inference_proof_non_explanatory_subproofs(inference, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80739L)
    public static SubLObject cached_inference_proof_non_explanatory_subproofs_internal(final SubLObject inference, final SubLObject proof) {
        final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        SubLObject all_non_explanatory_subproofs = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = proof_non_explanatory_subproofs(proof);
        SubLObject non_explanatory_content_proof = (SubLObject)inference_worker.NIL;
        non_explanatory_content_proof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            final SubLObject item_var = non_explanatory_content_proof;
            if (inference_worker.NIL == conses_high.member(item_var, all_non_explanatory_subproofs, Symbols.symbol_function((SubLObject)inference_worker.EQ), Symbols.symbol_function((SubLObject)inference_worker.IDENTITY))) {
                all_non_explanatory_subproofs = (SubLObject)ConsesLow.cons(item_var, all_non_explanatory_subproofs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            non_explanatory_content_proof = cdolist_list_var.first();
        }
        if (inference_worker.NIL == inference_worker_answer.answer_link_supporting_problem_wholly_explanatoryP(answer_link)) {
            final SubLObject proven_non_explanatory_subquery = inference_proof_proven_non_explanatory_subquery(inference, proof);
            SubLObject cdolist_list_var2;
            final SubLObject non_explanatory_subproofs = cdolist_list_var2 = compute_non_explanatory_subproofs(proof, proven_non_explanatory_subquery);
            SubLObject non_explanatory_subproof = (SubLObject)inference_worker.NIL;
            non_explanatory_subproof = cdolist_list_var2.first();
            while (inference_worker.NIL != cdolist_list_var2) {
                final SubLObject item_var2 = non_explanatory_subproof;
                if (inference_worker.NIL == conses_high.member(item_var2, all_non_explanatory_subproofs, Symbols.symbol_function((SubLObject)inference_worker.EQ), Symbols.symbol_function((SubLObject)inference_worker.IDENTITY))) {
                    all_non_explanatory_subproofs = (SubLObject)ConsesLow.cons(item_var2, all_non_explanatory_subproofs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                non_explanatory_subproof = cdolist_list_var2.first();
            }
        }
        return Sequences.nreverse(all_non_explanatory_subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 80739L)
    public static SubLObject cached_inference_proof_non_explanatory_subproofs(final SubLObject inference, final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL == v_memoization_state) {
            return cached_inference_proof_non_explanatory_subproofs_internal(inference, proof);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)inference_worker.$sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, (SubLObject)inference_worker.UNPROVIDED);
        if (inference_worker.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)inference_worker.$sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, (SubLObject)inference_worker.TWO_INTEGER, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.EQ, (SubLObject)inference_worker.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)inference_worker.$sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(inference, proof);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)inference_worker.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)inference_worker.NIL;
            collision = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (inference.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inference_worker.NIL != cached_args && inference_worker.NIL == cached_args.rest() && proof.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_inference_proof_non_explanatory_subproofs_internal(inference, proof)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(inference, proof));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 81866L)
    public static SubLObject proof_non_explanatory_subproofs(final SubLObject proof) {
        SubLObject subproofs = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL != inference_datastructures_proof.proof_has_subproofsP(proof)) {
            final SubLObject store = inference_datastructures_proof.proof_store(proof);
            if (inference_worker.NIL != inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_possibleP(store)) {
                subproofs = inference_datastructures_problem_store.problem_store_proof_non_explanatory_subproofs(store, proof);
            }
        }
        return subproofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 82199L)
    public static SubLObject compute_generalized_transformation_proof_non_explanatory_subproofs(final SubLObject proof) {
        assert inference_worker.NIL != inference_worker_transformation.generalized_transformation_proof_p(proof) : proof;
        SubLObject subproofs = (SubLObject)inference_worker.NIL;
        final SubLObject transformation_link = inference_worker_transformation.generalized_transformation_proof_transformation_link(proof);
        if (inference_worker.NIL == inference_worker_transformation.transformation_link_supporting_problem_wholly_explanatoryP(transformation_link)) {
            final SubLObject proven_non_explanatory_subquery = generalized_transformation_proof_proven_non_explanatory_subquery(proof);
            subproofs = compute_non_explanatory_subproofs(proof, proven_non_explanatory_subquery);
        }
        return subproofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 82794L)
    public static SubLObject inference_proof_proven_non_explanatory_subquery(final SubLObject inference, final SubLObject proof) {
        final SubLObject non_explanatory_subquery = inference_datastructures_inference.inference_non_explanatory_subquery(inference);
        final SubLObject answer_link = inference_datastructures_inference.inference_root_link(inference);
        final SubLObject variable_map = inference_datastructures_problem_link.problem_link_sole_supporting_variable_map(answer_link);
        final SubLObject proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, inference_datastructures_proof.proof_bindings(proof));
        final SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(proof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 83379L)
    public static SubLObject generalized_transformation_proof_proven_non_explanatory_subquery(final SubLObject proof) {
        if (inference_worker.NIL != inference_worker_transformation.transformation_proof_p(proof)) {
            return transformation_proof_proven_non_explanatory_subquery(proof);
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_proof_p(proof)) {
            return residual_transformation_proof_proven_non_explanatory_subquery(proof);
        }
        return Errors.error((SubLObject)inference_worker.$str126$generalized_transformation_proof_, proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 83795L)
    public static SubLObject transformation_proof_proven_non_explanatory_subquery(final SubLObject proof) {
        final SubLObject transformation_link = inference_datastructures_proof.proof_link(proof);
        final SubLObject subproof = inference_worker_transformation.transformation_proof_subproof(proof);
        final SubLObject subproof_bindings = (SubLObject)((inference_worker.NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : inference_worker.NIL);
        final SubLObject non_explanatory_subquery = inference_worker_transformation.transformation_link_non_explanatory_subquery(transformation_link);
        final SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(subproof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 84346L)
    public static SubLObject residual_transformation_proof_proven_non_explanatory_subquery(final SubLObject proof) {
        final SubLObject transformation_link = inference_worker_residual_transformation.residual_transformation_proof_motivating_transformation_link(proof);
        final SubLObject subproof = inference_worker_residual_transformation.residual_transformation_proof_subproof(proof);
        final SubLObject subproof_bindings = (SubLObject)((inference_worker.NIL != subproof) ? inference_datastructures_proof.proof_bindings(subproof) : inference_worker.NIL);
        final SubLObject non_explanatory_subquery = inference_worker_transformation.transformation_link_non_explanatory_subquery(transformation_link);
        final SubLObject proven_non_explanatory_subquery = bindings.apply_bindings(subproof_bindings, non_explanatory_subquery);
        return proven_non_explanatory_subquery;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 84965L)
    public static SubLObject compute_non_explanatory_subproofs(final SubLObject proof, final SubLObject proven_non_explanatory_query) {
        SubLObject non_explanatory_subproofs = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_worker.NIL;
        subproof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            non_explanatory_subproofs = non_explanatory_subproofs_recursive(subproof, proven_non_explanatory_query, non_explanatory_subproofs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return Sequences.nreverse(non_explanatory_subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 85481L)
    public static SubLObject non_explanatory_subproofs_recursive(final SubLObject proof, final SubLObject proven_non_explanatory_query, SubLObject non_explanatory_subproofs) {
        if (inference_worker.NIL == list_utilities.member_eqP(proof, non_explanatory_subproofs)) {
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                non_explanatory_subproofs = non_explanatory_subproofs_recursive(subproof, proven_non_explanatory_query, non_explanatory_subproofs);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
            if (inference_worker.NIL != non_explanatory_proofP(proof, proven_non_explanatory_query)) {
                non_explanatory_subproofs = (SubLObject)ConsesLow.cons(proof, non_explanatory_subproofs);
            }
        }
        return non_explanatory_subproofs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86000L)
    public static SubLObject non_explanatory_proofP(final SubLObject proof, final SubLObject proven_non_explanatory_query) {
        SubLObject cdolist_list_var;
        final SubLObject proof_proven_query = cdolist_list_var = proof_proven_query(proof);
        SubLObject clause = (SubLObject)inference_worker.NIL;
        clause = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            SubLObject index_var = (SubLObject)inference_worker.ZERO_INTEGER;
            SubLObject cdolist_list_var_$15 = clauses.neg_lits(clause);
            SubLObject contextualized_asent = (SubLObject)inference_worker.NIL;
            contextualized_asent = cdolist_list_var_$15.first();
            while (inference_worker.NIL != cdolist_list_var_$15) {
                final SubLObject sense = (SubLObject)inference_worker.$kw29$NEG;
                if (inference_worker.NIL == non_explanatory_asentP(contextualized_asent, sense, proven_non_explanatory_query)) {
                    return (SubLObject)inference_worker.NIL;
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_worker.ONE_INTEGER);
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                contextualized_asent = cdolist_list_var_$15.first();
            }
            index_var = (SubLObject)inference_worker.ZERO_INTEGER;
            SubLObject cdolist_list_var_$16 = clauses.pos_lits(clause);
            contextualized_asent = (SubLObject)inference_worker.NIL;
            contextualized_asent = cdolist_list_var_$16.first();
            while (inference_worker.NIL != cdolist_list_var_$16) {
                final SubLObject sense = (SubLObject)inference_worker.$kw28$POS;
                if (inference_worker.NIL == non_explanatory_asentP(contextualized_asent, sense, proven_non_explanatory_query)) {
                    return (SubLObject)inference_worker.NIL;
                }
                index_var = Numbers.add(index_var, (SubLObject)inference_worker.ONE_INTEGER);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                contextualized_asent = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86461L)
    public static SubLObject non_explanatory_asentP(final SubLObject candidate_asent, final SubLObject sense, final SubLObject proven_non_explanatory_query) {
        SubLObject cdolist_list_var = proven_non_explanatory_query;
        SubLObject proven_clause = (SubLObject)inference_worker.NIL;
        proven_clause = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.$kw28$POS == sense) {
                SubLObject cdolist_list_var_$17 = clauses.pos_lits(proven_clause);
                SubLObject proven_asent = (SubLObject)inference_worker.NIL;
                proven_asent = cdolist_list_var_$17.first();
                while (inference_worker.NIL != cdolist_list_var_$17) {
                    if (candidate_asent.equal(proven_asent)) {
                        return (SubLObject)inference_worker.T;
                    }
                    cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                    proven_asent = cdolist_list_var_$17.first();
                }
            }
            else if (inference_worker.$kw29$NEG == sense) {
                SubLObject cdolist_list_var_$18 = clauses.neg_lits(proven_clause);
                SubLObject proven_asent = (SubLObject)inference_worker.NIL;
                proven_asent = cdolist_list_var_$18.first();
                while (inference_worker.NIL != cdolist_list_var_$18) {
                    if (candidate_asent.equal(proven_asent)) {
                        return (SubLObject)inference_worker.T;
                    }
                    cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                    proven_asent = cdolist_list_var_$18.first();
                }
            }
            else {
                Errors.error((SubLObject)inference_worker.$str127$Invalid_sense__s, sense);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proven_clause = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 86902L)
    public static SubLObject explanatory_asentP(final SubLObject candidate_asent, final SubLObject sense, final SubLObject proven_explanatory_query) {
        SubLObject cdolist_list_var = proven_explanatory_query;
        SubLObject proven_clause = (SubLObject)inference_worker.NIL;
        proven_clause = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.$kw28$POS == sense) {
                SubLObject cdolist_list_var_$19 = clauses.pos_lits(proven_clause);
                SubLObject proven_asent = (SubLObject)inference_worker.NIL;
                proven_asent = cdolist_list_var_$19.first();
                while (inference_worker.NIL != cdolist_list_var_$19) {
                    if (candidate_asent.equal(proven_asent)) {
                        return (SubLObject)inference_worker.T;
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    proven_asent = cdolist_list_var_$19.first();
                }
            }
            else if (inference_worker.$kw29$NEG == sense) {
                SubLObject cdolist_list_var_$20 = clauses.neg_lits(proven_clause);
                SubLObject proven_asent = (SubLObject)inference_worker.NIL;
                proven_asent = cdolist_list_var_$20.first();
                while (inference_worker.NIL != cdolist_list_var_$20) {
                    if (candidate_asent.equal(proven_asent)) {
                        return (SubLObject)inference_worker.T;
                    }
                    cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                    proven_asent = cdolist_list_var_$20.first();
                }
            }
            else {
                Errors.error((SubLObject)inference_worker.$str127$Invalid_sense__s, sense);
            }
            cdolist_list_var = cdolist_list_var.rest();
            proven_clause = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 87328L)
    public static SubLObject note_tactic_finished(final SubLObject tactic) {
        if (inference_worker.NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
            inference_datastructures_tactic.note_tactic_executed(tactic);
            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_tactic.tactic_problem(tactic));
            if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_tactic_p(tactic)) {
                final SubLObject lookahead_problem = inference_worker_join_ordered.join_ordered_tactic_lookahead_problem(tactic);
                if (inference_worker.NIL != inference_datastructures_problem.tactically_finished_problem_p(lookahead_problem) && inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(lookahead_problem, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.UNPROVIDED)) {
                    discard_all_other_possible_structural_conjunctive_tactics(tactic);
                }
            }
            if (inference_worker.NIL != inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
                if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem) && inference_worker.NIL == inference_datastructures_problem.tactically_pending_problem_p(problem)) {
                    note_problem_pending(problem, (SubLObject)inference_worker.$kw26$TACTICAL);
                }
                consider_that_problem_could_be_finished(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.T);
                if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.UNPROVIDED)) {
                    consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.T);
                }
            }
            final SubLObject prob = problem;
            final SubLObject store = inference_datastructures_problem.problem_store(prob);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$21 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$21, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$21);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_tactician.strategy_note_tactic_finished(strategy, tactic);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$22 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$22)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$22);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_tactician.strategy_note_tactic_finished(strategy2, tactic);
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
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 88986L)
    public static SubLObject consider_strategic_ramifications_of_possibly_executed_tactic(final SubLObject strategy, final SubLObject tactic) {
        if (inference_worker.NIL != inference_datastructures_tactic.tactic_executedP(tactic)) {
            consider_strategic_ramifications_of_executed_tactic(strategy, tactic);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89278L)
    public static SubLObject consider_strategic_ramifications_of_executed_tactic(final SubLObject strategy, final SubLObject tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        if (inference_worker.NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)) {
            possibly_note_problem_pending(problem, strategy);
            consider_that_problem_could_be_finished(problem, (SubLObject)inference_worker.NIL, strategy, (SubLObject)inference_worker.T);
            if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategy, (SubLObject)inference_worker.UNPROVIDED)) {
                consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, strategy, (SubLObject)inference_worker.T);
            }
        }
        return tactic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 89768L)
    public static SubLObject note_problem_created(final SubLObject problem) {
        change_and_propagate_problem_status(problem, (SubLObject)inference_worker.$kw128$UNEXAMINED, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90117L)
    public static SubLObject possibly_reactivate_problem(final SubLObject strategy, final SubLObject problem) {
        return possibly_activate_problem(strategy, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 90295L)
    public static SubLObject possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        final SubLObject really_relevantP = inference_tactician.strategy_possibly_activate_problem(strategy, problem);
        if (inference_worker.NIL != really_relevantP) {
            inference_datastructures_strategy.strategy_note_problem_active(strategy, problem);
            final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
            inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
                    propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                    inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link_wrt_inference(argument_link, inference);
                    propagate_proof_spec(argument_link);
                }
            }
        }
        return really_relevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 91561L)
    public static SubLObject determine_strategic_status_wrt(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
            if (inference_worker.NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
                determine_new_tactics(problem);
            }
            if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
                possibly_compute_strategic_properties_of_problem_tactics(problem, strategic_context);
                possibly_note_problem_strategically_examined(problem, strategic_context);
                possibly_note_problem_strategically_possible(problem, strategic_context);
                consider_that_problem_could_be_strategically_pending_wrt(problem, strategic_context);
                return inference_datastructures_strategy.problem_strategic_status(problem, strategic_context);
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 92544L)
    public static SubLObject note_problem_examined(final SubLObject problem) {
        final SubLObject old_status = inference_datastructures_problem.problem_status(problem);
        final SubLObject new_status = examined_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$23 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$23, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$23);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    possibly_note_problem_strategically_examined(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$24 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$24)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$24);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    possibly_note_problem_strategically_examined(problem, strategy2);
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
        if (inference_worker.NIL == inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
            if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
                note_problem_possible(problem);
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 93154L)
    public static SubLObject possibly_note_problem_strategically_examined(final SubLObject problem, final SubLObject strategy) {
        if (inference_worker.NIL == inference_datastructures_problem.tactically_unexamined_problem_p(problem) && inference_worker.NIL != inference_datastructures_strategy.strategically_unexamined_problem_p(problem, strategy)) {
            final SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
            final SubLObject new_strategic_status = examined_version_of_problem_status(old_strategic_status);
            change_and_propagate_problem_status(problem, new_strategic_status, (SubLObject)inference_worker.NIL, strategy);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 93637L)
    public static SubLObject note_problem_possible(final SubLObject problem) {
        final SubLObject old_status = inference_datastructures_problem.problem_status(problem);
        final SubLObject new_status = possible_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw26$TACTICAL);
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$25 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$25, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$25);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    possibly_note_problem_strategically_possible(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$26 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$26)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$26);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    possibly_note_problem_strategically_possible(problem, strategy2);
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
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94018L)
    public static SubLObject possibly_note_problem_strategically_possible(final SubLObject problem, final SubLObject strategy) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategically_examined_problem_p(problem, strategy)) {
            if (inference_worker.NIL == inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem) && inference_worker.NIL == inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategy)) {
                note_problem_strategically_possible(problem, strategy);
            }
            else {
                note_problem_pending(problem, strategy);
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94500L)
    public static SubLObject note_problem_strategically_unexamined(final SubLObject problem, final SubLObject strategy) {
        final SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
        final SubLObject new_strategic_status = unexamined_version_of_problem_status(old_strategic_status);
        change_and_propagate_problem_status(problem, new_strategic_status, (SubLObject)inference_worker.NIL, strategy);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 94844L)
    public static SubLObject note_problem_strategically_possible(final SubLObject problem, final SubLObject strategy) {
        final SubLObject old_strategic_status = inference_datastructures_strategy.problem_raw_strategic_status(problem, strategy);
        final SubLObject new_strategic_status = possible_version_of_problem_status(old_strategic_status);
        change_and_propagate_problem_status(problem, new_strategic_status, (SubLObject)inference_worker.NIL, strategy);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95184L)
    public static SubLObject possibly_note_problem_pending(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL != possible_problem_p(problem, strategic_context)) {
            return note_problem_pending(problem, strategic_context);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 95555L)
    public static SubLObject note_problem_pending(final SubLObject problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) && inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL == inference_datastructures_problem.problem_no_tactics_possibleP(problem)) {
            Errors.error((SubLObject)inference_worker.$str129$Tried_to_make__a_pending_but_it_s, problem);
        }
        final SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        final SubLObject new_status = pending_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, (SubLObject)inference_worker.NIL, strategic_context);
        consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, strategic_context, (SubLObject)inference_worker.T);
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_inference.inference_note_problem_pending(inference_datastructures_strategy.strategy_inference(strategic_context), problem);
        }
        else {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$27 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$27, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        possibly_note_problem_pending(problem, strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$28 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$28)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$28);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        possibly_note_problem_pending(problem, strategy2);
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
        }
        return new_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 96546L)
    public static SubLObject possibly_note_problem_finished(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL != pending_problem_p(problem, strategic_context)) {
            return note_problem_finished(problem, strategic_context);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97183L)
    public static SubLObject note_problem_finished(final SubLObject problem, final SubLObject strategic_context) {
        final SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        final SubLObject new_status = finished_version_of_problem_status(old_status);
        change_and_propagate_problem_status(problem, new_status, (SubLObject)inference_worker.NIL, strategic_context);
        consider_ramifications_of_problem_finished(problem, strategic_context);
        return new_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 97780L)
    public static SubLObject consider_ramifications_of_problem_finished(final SubLObject problem, final SubLObject strategic_context) {
        consider_that_problem_could_be_no_good(problem, (SubLObject)inference_worker.NIL, strategic_context, (SubLObject)inference_worker.T);
        possibly_propagate_problem_finished(problem, strategic_context);
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            strategy_note_problem_finished(strategic_context, problem);
        }
        else {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject supported_problem;
            SubLObject set_contents_var_$29;
            SubLObject basis_object_$30;
            SubLObject state_$31;
            SubLObject jo_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, (SubLObject)inference_worker.$kw67$RESTRICTION)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                    set_contents_var_$29 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                    for (basis_object_$30 = set_contents.do_set_contents_basis_object(set_contents_var_$29), state_$31 = (SubLObject)inference_worker.NIL, state_$31 = set_contents.do_set_contents_initial_state(basis_object_$30, set_contents_var_$29); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$30, state_$31); state_$31 = set_contents.do_set_contents_update_state(state_$31)) {
                        jo_link = set_contents.do_set_contents_next(basis_object_$30, state_$31);
                        if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$31, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                            inference_worker_join_ordered.note_restricted_non_focal_finished(jo_link, restriction_link);
                        }
                    }
                }
            }
            if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_worker.UNPROVIDED)) {
                set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject join_ordered_link;
                SubLObject tactic;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_openP(join_ordered_link)) {
                        tactic = inference_worker_join_ordered.join_ordered_link_tactic(join_ordered_link);
                        if (inference_worker.NIL != tactic) {
                            discard_all_other_possible_structural_conjunctive_tactics(tactic);
                        }
                    }
                }
            }
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$32 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$32, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$32);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    SubLObject inference_var;
                    SubLObject set_var;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject strategy;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var2 = set.do_set_internal(set_var);
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy)) {
                                        if (inference_worker.NIL != finished_problem_p(problem, strategy)) {
                                            consider_ramifications_of_problem_finished(problem, strategy);
                                        }
                                        else {
                                            possibly_note_problem_finished(problem, strategy);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$33 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$33)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$33);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var3 = set.do_set_internal(set_var2);
                                SubLObject basis_object3;
                                SubLObject state3;
                                SubLObject strategy2;
                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)inference_worker.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object3, state3);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state3, strategy2)) {
                                        if (inference_worker.NIL != finished_problem_p(problem, strategy2)) {
                                            consider_ramifications_of_problem_finished(problem, strategy2);
                                        }
                                        else {
                                            possibly_note_problem_finished(problem, strategy2);
                                        }
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
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 99307L)
    public static SubLObject possibly_propagate_problem_finished(final SubLObject problem, final SubLObject strategic_context) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject mapped_problem;
        SubLObject supported_problem;
        SubLObject set_contents_var_$34;
        SubLObject basis_object_$35;
        SubLObject state_$36;
        SubLObject jo_link;
        SubLObject conjunction_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                mapped_problem = (SubLObject)inference_worker.NIL;
                mapped_problem = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link_var, mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(mapped_problem))) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                        if (inference_worker.NIL != supported_problem && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(supported_problem, strategic_context))) {
                            consider_that_problem_could_be_finished(supported_problem, (SubLObject)inference_worker.NIL, strategic_context, (SubLObject)inference_worker.T);
                            if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(dependent_link)) {
                                set_contents_var_$34 = inference_datastructures_problem.problem_dependent_links(supported_problem);
                                for (basis_object_$35 = set_contents.do_set_contents_basis_object(set_contents_var_$34), state_$36 = (SubLObject)inference_worker.NIL, state_$36 = set_contents.do_set_contents_initial_state(basis_object_$35, set_contents_var_$34); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$35, state_$36); state_$36 = set_contents.do_set_contents_update_state(state_$36)) {
                                    jo_link = set_contents.do_set_contents_next(basis_object_$35, state_$36);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$36, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_openP(jo_link)) {
                                        conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                                        consider_that_problem_could_be_finished(conjunction_problem, (SubLObject)inference_worker.NIL, strategic_context, (SubLObject)inference_worker.T);
                                    }
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100517L)
    public static SubLObject strategy_note_problem_finished(final SubLObject strategic_context, final SubLObject problem) {
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100688L)
    public static SubLObject note_argument_link_added(final SubLObject link) {
        final SubLObject prob;
        final SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$37 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$37, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$37);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_argument_link_added(strategy, link);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$38 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$38)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$38);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_argument_link_added(strategy2, link);
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
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 100970L)
    public static SubLObject note_goal_link_added(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject goal_proof = new_goal_proof(link);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker.NIL != newP) {
            bubble_up_proof(goal_proof);
        }
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101154L)
    public static SubLObject strategic_context_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_strategy.strategy_p(v_object) || inference_worker.$kw26$TACTICAL == v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101344L)
    public static SubLObject strategic_context_suid(final SubLObject v_object) {
        if (inference_worker.$kw26$TACTICAL == v_object) {
            return (SubLObject)inference_worker.MINUS_ONE_INTEGER;
        }
        return inference_datastructures_strategy.strategy_suid(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101478L)
    public static SubLObject find_strategic_context_by_id(final SubLObject store, final SubLObject strategic_context_suid) {
        if (inference_worker.MINUS_ONE_INTEGER.eql(strategic_context_suid)) {
            return (SubLObject)inference_worker.$kw26$TACTICAL;
        }
        return inference_datastructures_problem_store.find_strategy_by_id(store, strategic_context_suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101685L)
    public static SubLObject find_strategic_context_by_ids(final SubLObject store_suid, final SubLObject strategic_context_suid) {
        if (inference_worker.MINUS_ONE_INTEGER.eql(strategic_context_suid)) {
            return (SubLObject)inference_worker.$kw26$TACTICAL;
        }
        return inference_datastructures_problem_store.find_strategy_by_ids(store_suid, strategic_context_suid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 101904L)
    public static SubLObject strategic_context_may_modify_its_problem_storeP(final SubLObject strategic_context) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.$kw26$TACTICAL == strategic_context || inference_worker.NIL != inference_datastructures_inference.inference_problem_store_privateP(inference_datastructures_strategy.strategy_inference(strategic_context)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102260L)
    public static SubLObject no_good_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_no_good_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_no_good_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102490L)
    public static SubLObject neutral_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_neutral_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_neutral_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102720L)
    public static SubLObject good_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        return problem_goodP(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 102844L)
    public static SubLObject examined_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_examined_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_examined_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103077L)
    public static SubLObject possible_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_possible_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103310L)
    public static SubLObject pending_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_pending_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_pending_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103540L)
    public static SubLObject finished_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_finished_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_finished_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 103773L)
    public static SubLObject potentially_possible_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_potentially_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_potentially_possible_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104042L)
    public static SubLObject not_potentially_possible_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            return inference_datastructures_strategy.strategically_not_potentially_possible_problem_p(problem, strategic_context);
        }
        return inference_datastructures_problem.tactically_not_potentially_possible_problem_p(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 104323L)
    public static SubLObject totally_finished_problem_p(final SubLObject problem, final SubLObject strategic_context) {
        return finished_problem_p(problem, inference_tactician.controlling_strategic_context(strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 105455L)
    public static SubLObject propagate_problem_link(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == inference_worker.$disable_link_propagationP$.getDynamicValue(thread)) {
            propagate_min_proof_depth_via_link(link);
            propagate_min_transformation_depth_via_link(link);
            inference_min_transformation_depth.propagate_min_transformation_depth_signature_via_link(link);
            propagate_strategy_activity(link);
            propagate_inference_relevance(link);
            note_argument_link_added(link);
            propagate_proofs(link);
            propagate_proof_spec(link);
            return link;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 106253L)
    public static SubLObject propagate_proofs(final SubLObject link) {
        if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_to_goal_p(link)) {
            note_goal_link_added(link);
        }
        else {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != link_permits_proof_propagationP(link, supporting_mapped_problem)) {
                    SubLObject cdolist_list_var_$39 = Sequences.nreverse(inference_datastructures_problem.all_problem_proofs(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), (SubLObject)inference_worker.$kw106$PROVEN));
                    SubLObject proof = (SubLObject)inference_worker.NIL;
                    proof = cdolist_list_var_$39.first();
                    while (inference_worker.NIL != cdolist_list_var_$39) {
                        if (inference_worker.NIL != inference_datastructures_proof.valid_proof_p(proof) && inference_worker.NIL != inference_datastructures_proof.proof_provenP(proof)) {
                            bubble_up_proof_to_link_via_variable_map(proof, inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem), link);
                        }
                        cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                        proof = cdolist_list_var_$39.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107267L)
    public static SubLObject repropagate_newly_opened_link(final SubLObject link, final SubLObject mapped_supporting_problem) {
        propagate_strategy_activity(link);
        propagate_inference_relevance(link);
        propagate_proofs(link);
        propagate_proof_spec(link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107637L)
    public static SubLObject problem_link_open_and_repropagate_sole_supporting_mapped_problem(final SubLObject link) {
        return problem_link_open_and_repropagate_index(link, (SubLObject)inference_worker.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 107786L)
    public static SubLObject problem_link_open_and_repropagate_index(final SubLObject link, final SubLObject index) {
        inference_datastructures_problem_link.problem_link_open_index(link, index);
        final SubLObject supporting_mapped_problem = inference_datastructures_problem_link.problem_link_find_supporting_mapped_problem_by_index(link, index);
        repropagate_newly_opened_link(link, supporting_mapped_problem);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108083L)
    public static SubLObject problem_link_open_and_repropagate_supporting_mapped_problem(final SubLObject link, final SubLObject supporting_mapped_problem) {
        inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(link, supporting_mapped_problem);
        repropagate_newly_opened_link(link, supporting_mapped_problem);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108353L)
    public static SubLObject problem_link_open_and_repropagate_all(final SubLObject link) {
        inference_datastructures_problem_link.problem_link_open_all(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                repropagate_newly_opened_link(link, supporting_mapped_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 108609L)
    public static SubLObject propagate_answer_link(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
        propagate_proof_spec_via_answer_link(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, (SubLObject)inference_worker.ZERO_INTEGER);
                if (inference_worker.NIL == inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
                    inference_datastructures_problem.set_problem_min_transformation_depth(supporting_problem, inference, (SubLObject)inference_worker.ZERO_INTEGER);
                }
                inference_datastructures_problem.set_root_problem_min_transformation_depth_signature(supporting_problem, inference);
                final SubLObject status_var = (SubLObject)inference_worker.$kw106$PROVEN;
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(supporting_problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject proof_list = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$40 = proof_list;
                    SubLObject proof = (SubLObject)inference_worker.NIL;
                    proof = cdolist_list_var_$40.first();
                    while (inference_worker.NIL != cdolist_list_var_$40) {
                        if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                            propagate_proof_to_inference(proof, inference);
                        }
                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                        proof = cdolist_list_var_$40.first();
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject cdolist_list_var_$41 = inference_strategist.inference_initial_relevant_strategies(inference);
                SubLObject strategy = (SubLObject)inference_worker.NIL;
                strategy = cdolist_list_var_$41.first();
                while (inference_worker.NIL != cdolist_list_var_$41) {
                    maybe_possibly_activate_problem(strategy, supporting_problem);
                    cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                    strategy = cdolist_list_var_$41.first();
                }
                possibly_note_problem_relevant(inference, supporting_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        inference_worker_answer.note_answer_link_propagated(link);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 109810L)
    public static SubLObject possibly_propagate_answer_link(final SubLObject link) {
        if (inference_worker.NIL == inference_worker_answer.answer_link_propagatedP(link)) {
            propagate_answer_link(link);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110023L)
    public static SubLObject propagate_proof_to_inference(final SubLObject proof, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_worker.$eager_proof_validationP$.getDynamicValue(thread) || inference_worker.NIL != proof_tree_validP(proof)) {
            inference_strategist.inference_note_proof(inference, proof);
            consider_closing_answer_link(inference_datastructures_inference.inference_root_link(inference));
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110470L)
    public static SubLObject consider_closing_answer_link(final SubLObject answer_link) {
        final SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
        final SubLObject should_closeP = inference_deems_answer_link_should_be_closedP(inference, answer_link);
        if (inference_worker.NIL != should_closeP) {
            close_answer_link(answer_link);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 110856L)
    public static SubLObject inference_deems_answer_link_should_be_closedP(final SubLObject inference, final SubLObject answer_link) {
        final SubLObject root_mapped_problem = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(answer_link);
        final SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(root_mapped_problem);
        final SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy) && inference_worker.NIL == inference_tactician_strategic_uninterestingness.strategy_has_enough_proofs_for_problemP(strategy, root_problem)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111410L)
    public static SubLObject close_answer_link(final SubLObject answer_link) {
        inference_datastructures_problem_link.problem_link_close_sole_supporting_mapped_problem(answer_link);
        inference_datastructures_inference.clear_inference_relevant_problems(inference_worker_answer.answer_link_supported_inference(answer_link));
        return answer_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111632L)
    public static SubLObject proof_tree_validP(final SubLObject proof) {
        if (inference_worker.$kw89$NONE == inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(inference_datastructures_proof.proof_store(proof))) {
            return (SubLObject)inference_worker.T;
        }
        return recursive_proof_tree_validP(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 111918L)
    public static SubLObject recursive_proof_tree_validP(final SubLObject proof) {
        final SubLObject validP = intermediate_proof_validP(proof);
        if (inference_worker.NIL == validP) {
            reject_proof_due_to_ill_formedness(proof);
            return (SubLObject)inference_worker.NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
        SubLObject subproof = (SubLObject)inference_worker.NIL;
        subproof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL == recursive_proof_tree_validP(subproof)) {
                return (SubLObject)inference_worker.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 112315L)
    public static SubLObject depth_L(final SubLObject depth1, final SubLObject depth2) {
        if (inference_worker.NIL == subl_promotions.non_negative_integer_p(depth1)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != subl_promotions.non_negative_integer_p(depth2)) {
            return Numbers.numL(depth1, depth2);
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 112708L)
    public static SubLObject depth_LE(final SubLObject depth1, final SubLObject depth2) {
        if (inference_worker.NIL == subl_promotions.non_negative_integer_p(depth1)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != subl_promotions.non_negative_integer_p(depth2)) {
            return Numbers.numLE(depth1, depth2);
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113107L)
    public static SubLObject propagate_min_proof_depth_via_link(final SubLObject link) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$42 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$42, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$42);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        propagate_min_proof_depth_via_link_wrt_inference(link, inference);
                    }
                }
            }
            final SubLObject idx_$43 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$43)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$43);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_proof_depth_via_link_wrt_inference(link, inference2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 113363L)
    public static SubLObject propagate_min_proof_depth_via_link_wrt_inference(final SubLObject link, final SubLObject inference) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject parent_depth = inference_datastructures_problem.problem_min_proof_depth(supported_problem, inference);
        if (inference_worker.NIL != subl_promotions.non_negative_integer_p(parent_depth)) {
            SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link);
            if (inference_worker.ONE_INTEGER.numE(supporting_problem_count) && inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                supporting_problem_count = (SubLObject)inference_worker.TWO_INTEGER;
            }
            if (supporting_problem_count.isPositive()) {
                final SubLObject content_increment = (SubLObject)((inference_worker.NIL != content_link_p(link)) ? inference_worker.ONE_INTEGER : inference_worker.ZERO_INTEGER);
                final SubLObject sibling_increment = number_utilities.f_1_(supporting_problem_count);
                final SubLObject increment = Numbers.add(content_increment, sibling_increment);
                final SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        final SubLObject child_depth = inference_datastructures_problem.problem_min_proof_depth(supporting_problem, inference);
                        if (inference_worker.NIL != proof_depth_L(propagated_child_depth, child_depth)) {
                            inference_datastructures_problem.set_problem_min_proof_depth(supporting_problem, inference, propagated_child_depth);
                            final SubLObject prob = supporting_problem;
                            final SubLObject store = inference_datastructures_problem.problem_store(prob);
                            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                                final SubLObject idx_$44 = idx;
                                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$44, (SubLObject)inference_worker.$kw27$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$44);
                                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject inference_$45;
                                    SubLObject inference_var;
                                    SubLObject set_var;
                                    SubLObject set_contents_var;
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject strategy;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                                        inference_$45 = Vectors.aref(vector_var, id);
                                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference_$45) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference_$45)) {
                                                inference_$45 = (SubLObject)inference_worker.$kw27$SKIP;
                                            }
                                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_$45)) {
                                                inference_var = inference_$45;
                                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                                set_contents_var = set.do_set_internal(set_var);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(supporting_problem, strategy);
                                                        inference_datastructures_strategy.set_problem_recompute_set_aside(supporting_problem, strategy);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                final SubLObject idx_$45 = idx;
                                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$45)) {
                                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$45);
                                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                                    SubLObject inference_$46 = (SubLObject)inference_worker.NIL;
                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                    try {
                                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                            id2 = Hashtables.getEntryKey(cdohash_entry);
                                            inference_$46 = Hashtables.getEntryValue(cdohash_entry);
                                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference_$46)) {
                                                final SubLObject inference_var2 = inference_$46;
                                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject strategy2;
                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(supporting_problem, strategy2);
                                                        inference_datastructures_strategy.set_problem_recompute_set_aside(supporting_problem, strategy2);
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
                            final SubLObject set_contents_var3 = inference_datastructures_problem.problem_argument_links(supporting_problem);
                            SubLObject basis_object3;
                            SubLObject state3;
                            SubLObject argument_link;
                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)inference_worker.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                argument_link = set_contents.do_set_contents_next(basis_object3, state3);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state3, argument_link)) {
                                    propagate_min_proof_depth_via_link_wrt_inference(argument_link, inference);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115245L)
    public static SubLObject proof_depth_L(final SubLObject depth1, final SubLObject depth2) {
        return depth_L(depth1, depth2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115327L)
    public static SubLObject problem_strictly_within_max_proof_depthP(final SubLObject inference, final SubLObject problem) {
        final SubLObject max_proof_depth = inference_datastructures_inference.inference_max_proof_depth(inference);
        if (inference_worker.NIL != max_proof_depth) {
            final SubLObject proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
            if (proof_depth.isNumber() && inference_worker.NIL == proof_depth_L(proof_depth, max_proof_depth)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 115807L)
    public static SubLObject propagate_min_transformation_depth_via_link(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(inference_datastructures_problem_link.problem_link_store(link));
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$48 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$48, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$48);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        propagate_min_transformation_depth_via_link_wrt_inference(link, inference);
                    }
                }
            }
            final SubLObject idx_$49 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$49)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$49);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        propagate_min_transformation_depth_via_link_wrt_inference(link, inference2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 116170L)
    public static SubLObject propagate_min_transformation_depth_via_link_wrt_inference(final SubLObject link, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_problem.$problem_min_transformation_depth_from_signature_enabledP$.getDynamicValue(thread)) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject parent_depth = inference_datastructures_problem.problem_min_transformation_depth(supported_problem, inference);
        if (inference_worker.NIL != subl_promotions.non_negative_integer_p(parent_depth) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(link)) {
            final SubLObject increment = transformation_depth_increment(link, inference);
            if (inference_worker.NIL != subl_promotions.non_negative_integer_p(increment)) {
                final SubLObject propagated_child_depth = Numbers.add(parent_depth, increment);
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                        final SubLObject child_depth = inference_datastructures_problem.problem_min_transformation_depth(supporting_problem, inference);
                        if (inference_worker.NIL != transformation_depth_L(propagated_child_depth, child_depth)) {
                            inference_datastructures_problem.set_problem_min_transformation_depth(supporting_problem, inference, propagated_child_depth);
                            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supporting_problem);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject argument_link;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                argument_link = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                                    propagate_min_transformation_depth_via_link_wrt_inference(argument_link, inference);
                                }
                            }
                            if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
                                final SubLObject supported_problem_$50 = inference_datastructures_problem_link.problem_link_supported_problem(link);
                                final SubLObject set_contents_var2 = inference_datastructures_problem.problem_dependent_links(supported_problem_$50);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject jo_link_var;
                                SubLObject jo_link_var_$51;
                                SubLObject motivating_conjunction_problem;
                                SubLObject set_contents_var_$52;
                                SubLObject basis_object_$53;
                                SubLObject state_$54;
                                SubLObject rt_link;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    jo_link_var = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, jo_link_var) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                                        jo_link_var_$51 = jo_link_var;
                                        motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$51);
                                        set_contents_var_$52 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                                        for (basis_object_$53 = set_contents.do_set_contents_basis_object(set_contents_var_$52), state_$54 = (SubLObject)inference_worker.NIL, state_$54 = set_contents.do_set_contents_initial_state(basis_object_$53, set_contents_var_$52); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$53, state_$54); state_$54 = set_contents.do_set_contents_update_state(state_$54)) {
                                            rt_link = set_contents.do_set_contents_next(basis_object_$53, state_$54);
                                            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$54, rt_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker.$kw120$RESIDUAL_TRANSFORMATION) && inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$51) && inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_motivated_by_transformation_linkP(rt_link, link)) {
                                                propagate_min_transformation_depth_via_link_wrt_inference(rt_link, inference);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 117830L)
    public static SubLObject clear_uninterestingness_cache_wrt_transformation(final SubLObject problem, final SubLObject inference) {
        final SubLObject controlling_strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        if (inference_worker.NIL != balancing_tactician.balancing_tactician_p(controlling_strategy)) {
            final SubLObject t_strategy = balancing_tactician.balancing_tactician_transformation_substrategy(controlling_strategy);
            inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, t_strategy);
            inference_datastructures_strategy.set_problem_recompute_set_aside(problem, t_strategy);
            SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
            SubLObject transformation_tactic = (SubLObject)inference_worker.NIL;
            transformation_tactic = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(transformation_tactic, (SubLObject)inference_worker.$kw70$TRANSFORMATION)) {
                    inference_datastructures_strategy.set_tactic_recompute_thrown_away(transformation_tactic, t_strategy);
                    inference_datastructures_strategy.set_tactic_recompute_set_aside(transformation_tactic, t_strategy);
                }
                cdolist_list_var = cdolist_list_var.rest();
                transformation_tactic = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118503L)
    public static SubLObject transformation_depth_L(final SubLObject depth1, final SubLObject depth2) {
        return depth_L(depth1, depth2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118594L)
    public static SubLObject transformation_depth_LE(final SubLObject depth1, final SubLObject depth2) {
        return depth_LE(depth1, depth2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 118687L)
    public static SubLObject problem_strictly_within_max_transformation_depthP(final SubLObject inference, final SubLObject problem) {
        final SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        if (inference_worker.NIL != max_transformation_depth) {
            final SubLObject transformation_depth = inference_datastructures_problem.problem_min_transformation_depth(problem, inference);
            if (transformation_depth.isNumber() && inference_worker.NIL == transformation_depth_L(transformation_depth, max_transformation_depth)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119265L)
    public static SubLObject problem_transformation_allowed_wrt_max_transformation_depthP(final SubLObject inference, final SubLObject problem) {
        return problem_strictly_within_max_transformation_depthP(inference, problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 119550L)
    public static SubLObject logical_tactic_transformation_allowed_wrt_max_transformation_depthP(final SubLObject inference, final SubLObject logical_tactic) {
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(logical_tactic);
        if (inference_worker.NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference, problem)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_worker_join.join_tactic_p(logical_tactic)) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject max_transformation_depth = inference_datastructures_inference.inference_max_transformation_depth(inference);
        if (inference_worker.NIL == max_transformation_depth) {
            return (SubLObject)inference_worker.T;
        }
        if (max_transformation_depth.isZero()) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject transformation_depth = inference_min_transformation_depth.logical_tactic_lookahead_min_transformation_depth(logical_tactic, inference);
        if (!transformation_depth.isNumber()) {
            return (SubLObject)inference_worker.T;
        }
        return transformation_depth_L(transformation_depth, max_transformation_depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 120843L)
    public static SubLObject transformation_depth_increment(final SubLObject link, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
            return (SubLObject)inference_worker.ONE_INTEGER;
        }
        if (inference_worker.NIL == inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        if (inference_worker.$kw130$INTUITIVE == inference_datastructures_problem.$transformation_depth_computation$.getDynamicValue(thread)) {
            return (SubLObject)inference_worker.ONE_INTEGER;
        }
        final SubLObject parent_depth = inference_datastructures_problem.problem_min_transformation_depth(inference_datastructures_problem_link.problem_link_supported_problem(link), inference);
        final SubLObject motivating_t_link = inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(link);
        final SubLObject transformed_literal_depth = inference_datastructures_problem.problem_min_transformation_depth(inference_datastructures_problem_link.problem_link_supported_problem(motivating_t_link), inference);
        if (inference_worker.NIL == subl_promotions.non_negative_integer_p(transformed_literal_depth)) {
            return (SubLObject)inference_worker.$kw131$UNDETERMINED;
        }
        if (transformed_literal_depth.numL(parent_depth)) {
            return (SubLObject)inference_worker.ZERO_INTEGER;
        }
        return Numbers.subtract(number_utilities.f_1X(transformed_literal_depth), parent_depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 121800L)
    public static SubLObject problem_has_been_transformedP(final SubLObject problem, final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_worker.NIL;
        final SubLObject _prev_bind_0 = inference_datastructures_problem.$transformation_depth_computation$.currentBinding(thread);
        try {
            inference_datastructures_problem.$transformation_depth_computation$.bind((SubLObject)inference_worker.$kw130$INTUITIVE, thread);
            result = subl_promotions.positive_integer_p(inference_datastructures_problem.problem_min_transformation_depth(problem, inference));
        }
        finally {
            inference_datastructures_problem.$transformation_depth_computation$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122061L)
    public static SubLObject propagate_strategy_activity(final SubLObject link) {
        final SubLObject prob;
        final SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(link);
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$55 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$55, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$55);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                SubLObject cdolist_list_var;
                SubLObject supporting_mapped_problem;
                SubLObject supporting_problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                                    supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                                    supporting_mapped_problem = cdolist_list_var.first();
                                    while (inference_worker.NIL != cdolist_list_var) {
                                        if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != link_permits_activity_propagationP(link, supporting_mapped_problem)) {
                                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                            maybe_possibly_activate_problem(strategy, supporting_problem);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        supporting_mapped_problem = cdolist_list_var.first();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$56 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$56)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$56);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject cdolist_list_var2;
                            SubLObject supporting_mapped_problem2;
                            SubLObject supporting_problem2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    cdolist_list_var2 = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
                                    supporting_mapped_problem2 = (SubLObject)inference_worker.NIL;
                                    supporting_mapped_problem2 = cdolist_list_var2.first();
                                    while (inference_worker.NIL != cdolist_list_var2) {
                                        if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem2) && inference_worker.NIL != link_permits_activity_propagationP(link, supporting_mapped_problem2)) {
                                            supporting_problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                                            maybe_possibly_activate_problem(strategy2, supporting_problem2);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        supporting_mapped_problem2 = cdolist_list_var2.first();
                                    }
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
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 122597L)
    public static SubLObject maybe_possibly_activate_problem(final SubLObject strategy, final SubLObject problem) {
        if (inference_worker.NIL == inference_datastructures_strategy.problem_active_in_strategyP(problem, strategy) && inference_worker.NIL != possibly_activate_problem(strategy, problem)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_strategy_activity(argument_link);
                }
            }
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123095L)
    public static SubLObject link_permits_activity_propagationP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123269L)
    public static SubLObject propagate_inference_relevance(final SubLObject link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                propagate_relevance_to_supporting_problem(supported_problem, supporting_problem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 123762L)
    public static SubLObject propagate_relevance_to_supporting_problem(final SubLObject problem, final SubLObject supporting_problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$57 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$57, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$57);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            possibly_note_problem_relevant(inference, supporting_problem);
                        }
                    }
                }
            }
            final SubLObject idx_$58 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$58)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$58);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            possibly_note_problem_relevant(inference2, supporting_problem);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124062L)
    public static SubLObject possibly_note_problem_relevant(final SubLObject inference, final SubLObject problem) {
        if (inference_worker.NIL == inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
            inference_datastructures_inference.add_inference_relevant_problem(inference, problem);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(argument_link)) {
                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away_wrt_all_relevant_strategies(inference_datastructures_problem_link.problem_link_sole_supporting_problem(argument_link));
                    }
                    propagate_inference_relevance(argument_link);
                }
            }
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124585L)
    public static SubLObject link_permits_relevance_propagationP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 124821L)
    public static SubLObject link_permits_proof_propagationP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem) || (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link) && inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(link) && inference_worker.NIL != inference_datastructures_problem_link.mapped_problem_equal(supporting_mapped_problem, inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(link))) || (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link) && inference_worker.NIL != Sequences.find_if((SubLObject)inference_worker.$sym132$UNION_LINK_P, inference_datastructures_problem.problem_all_dependent_links(inference_datastructures_problem_link.problem_link_supported_problem(link)), (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED)) || (inference_worker.NIL != inference_worker.$bubble_up_proofs_through_closed_split_linksP$.getDynamicValue(thread) && inference_worker.NIL != inference_worker_split.split_link_p(link)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 125713L)
    public static SubLObject consider_that_mapped_problem_could_be_irrelevant(final SubLObject mapped_problem, final SubLObject dependent_link) {
        if (inference_worker.NIL != link_permits_relevance_propagationP(dependent_link, mapped_problem)) {
            final SubLObject prob;
            final SubLObject problem = prob = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            final SubLObject store = inference_datastructures_problem.problem_store(prob);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$59 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$59, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$59);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                            }
                        }
                    }
                }
                final SubLObject idx_$60 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$60)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$60);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference2);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 126265L)
    public static SubLObject consider_that_problem_could_be_irrelevant_to_inference(final SubLObject problem, final SubLObject inference) {
        if (inference_worker.NIL != problem_irrelevant_to_inferenceP(problem, inference)) {
            maybe_make_problem_irrelevant_to_inference(inference, problem);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 126514L)
    public static SubLObject problem_irrelevant_to_inferenceP(final SubLObject problem, final SubLObject inference) {
        if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_closedP(inference_datastructures_inference.inference_root_link(inference))) {
            return (SubLObject)inference_worker.T;
        }
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject supporting_mapped_problem;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                link_var = dependent_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                supporting_mapped_problem = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link_var, supporting_mapped_problem) && problem.eql(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem)) && inference_worker.NIL != link_permits_relevance_propagationP(dependent_link, supporting_mapped_problem)) {
                        if (inference_worker.NIL != inference_worker_answer.answer_link_p(dependent_link)) {
                            if (inference.eql(inference_datastructures_problem_link.problem_link_supported_inference(dependent_link))) {
                                return (SubLObject)inference_worker.NIL;
                            }
                        }
                        else {
                            supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference)) {
                                return (SubLObject)inference_worker.NIL;
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    supporting_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 127626L)
    public static SubLObject maybe_make_problem_irrelevant_to_inference(final SubLObject inference, final SubLObject problem) {
        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
            make_problem_irrelevant_to_inference(inference, problem);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                    propagate_inference_irrelevance(inference, argument_link);
                }
            }
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128115L)
    public static SubLObject make_problem_irrelevant_to_inference(final SubLObject inference, final SubLObject problem) {
        inference_datastructures_inference.remove_inference_relevant_problem(inference, problem);
        final SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                if (inference_worker.NIL != inference_datastructures_strategy.problem_set_aside_in_strategyP(problem, strategy)) {
                    inference_datastructures_strategy.strategy_clear_problem_set_aside(strategy, problem);
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128594L)
    public static SubLObject propagate_inference_irrelevance(final SubLObject inference, final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != link_permits_relevance_propagationP(link, supporting_mapped_problem)) {
                consider_that_problem_could_be_irrelevant_to_inference(inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem), inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 128960L)
    public static SubLObject problem_raw_tactical_or_strategic_status(final SubLObject problem, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        return (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) ? inference_datastructures_strategy.problem_raw_strategic_status(problem, strategic_context) : inference_datastructures_problem.problem_status(problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 129410L)
    public static SubLObject set_problem_raw_tactical_or_strategic_status(final SubLObject problem, final SubLObject strategic_context, final SubLObject status) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_strategy.set_problem_raw_strategic_status(problem, strategic_context, status);
        }
        else {
            inference_datastructures_problem.set_problem_status(problem, status);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 130101L)
    public static SubLObject change_and_propagate_problem_status(final SubLObject problem, final SubLObject new_status, final SubLObject consider_deepP, final SubLObject strategic_context) {
        final SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
        if (old_status.eql(new_status)) {
            Errors.error((SubLObject)inference_worker.$str133$Uninteresting_problem_status_chan, problem, old_status, new_status);
        }
        else {
            change_and_propagate_problem_status_int(problem, old_status, new_status, consider_deepP, strategic_context);
        }
        if (inference_worker.NIL != inference_tactician.substrategyP(strategic_context)) {
            inference_datastructures_strategy.controlling_strategy_callback(strategic_context, (SubLObject)inference_worker.$kw134$SUBSTRATEGY_PROBLEM_STATUS_CHANGE, problem, old_status, new_status, (SubLObject)inference_worker.UNPROVIDED);
        }
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategic_context);
            inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategic_context);
            inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategic_context);
            inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategic_context);
        }
        else {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$61 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$61, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$61);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                inference_var = inference;
                                set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                set_contents_var = set.do_set_internal(set_var);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    strategy = set_contents.do_set_contents_next(basis_object, state);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategy);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategy);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$62 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$62)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$62);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                final SubLObject inference_var2 = inference2;
                                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject strategy2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                        inference_datastructures_strategy.set_problem_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_thrown_away(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_recompute_set_aside(problem, strategy2);
                                        inference_datastructures_strategy.set_problem_tactics_recompute_set_aside(problem, strategy2);
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
        }
        if (inference_worker.NIL != problem && inference_worker.NIL != inference_datastructures_problem.problem_has_no_tacticsP(problem) && inference_worker.NIL != possible_problem_p(problem, strategic_context)) {
            Errors.error((SubLObject)inference_worker.$str135$possible_problem_with_no_tactics_, problem, strategic_context);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 132239L)
    public static SubLObject change_and_propagate_problem_status_int(final SubLObject problem, final SubLObject old_status, final SubLObject new_status, final SubLObject consider_deepP, final SubLObject strategic_context) {
        if (old_status.eql((SubLObject)inference_worker.$kw136$NEW)) {
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw138$UNEXAMINED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                return problem;
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw138$UNEXAMINED_NO_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.NIL);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
            if (new_status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.increment_good_problem_historical_count();
                }
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.increment_no_good_problem_historical_count();
                }
                consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw77$POSSIBLE)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.NIL);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw77$POSSIBLE)) {
            if (new_status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw77$POSSIBLE)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
            if (new_status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw146$FINISHED)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.NIL);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw146$FINISHED)) {
            if (new_status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.increment_good_problem_historical_count();
                }
                return set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.increment_no_good_problem_historical_count();
                }
                consider_that_supported_problems_could_be_no_good(problem, consider_deepP, strategic_context);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw146$FINISHED)) {
                set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
                if (inference_worker.$kw26$TACTICAL == strategic_context) {
                    inference_metrics.decrement_good_problem_historical_count();
                }
                consider_that_problem_could_be_no_good(problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                return problem;
            }
            if (new_status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        else if (old_status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
            if (new_status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.NIL);
            }
            if (new_status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
                return set_problem_raw_status_if_strategic(problem, strategic_context, old_status, new_status, (SubLObject)inference_worker.T);
            }
        }
        return prohibited_problem_status_change_error(problem, old_status, new_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141048L)
    public static SubLObject set_problem_raw_status_if_strategic(final SubLObject problem, final SubLObject strategic_context, final SubLObject old_status, final SubLObject new_status, final SubLObject error_unless_reconsidering_set_asidesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context) && (inference_worker.NIL == error_unless_reconsidering_set_asidesP || inference_worker.NIL != inference_worker.$reconsidering_set_asidesP$.getDynamicValue(thread))) {
            set_problem_raw_tactical_or_strategic_status(problem, strategic_context, new_status);
        }
        else {
            prohibited_problem_status_change_error(problem, old_status, new_status);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141597L)
    public static SubLObject prohibited_problem_status_change_error(final SubLObject problem, final SubLObject old_status, final SubLObject new_status) {
        Errors.error((SubLObject)inference_worker.$str149$Problem__a_attempted_to_change_st, problem, old_status, new_status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 141820L)
    public static SubLObject consider_that_problem_could_be_good(final SubLObject problem) {
        if (inference_worker.NIL == inference_datastructures_problem.tactically_good_problem_p(problem) && inference_worker.NIL != problem_goodP(problem)) {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$78 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$78, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$78);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference);
                            }
                        }
                    }
                }
                final SubLObject idx_$79 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$79)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$79);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                consider_that_problem_could_be_irrelevant_to_inference(problem, inference2);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142402L)
    public static SubLObject problem_goodP(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_problem.valid_problem_p(problem) && inference_worker.NIL != inference_datastructures_problem.problem_has_some_proven_proofP(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 142592L)
    public static SubLObject good_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD) || status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD) || status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD) || status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD) || status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
            return status;
        }
        if (status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
            return (SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
            return (SubLObject)inference_worker.$kw140$EXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw77$POSSIBLE)) {
            return (SubLObject)inference_worker.$kw143$POSSIBLE_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
            return (SubLObject)inference_worker.$kw144$PENDING_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw146$FINISHED)) {
            return (SubLObject)inference_worker.$kw147$FINISHED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw138$UNEXAMINED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw140$EXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw144$PENDING_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw147$FINISHED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw136$NEW)) {
            Errors.error((SubLObject)inference_worker.$str150$new_problem_cannot_become_good_ye);
        }
        else {
            Errors.error((SubLObject)inference_worker.$str151$unknown_problem_status__a, status);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 143408L)
    public static SubLObject unexamined_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD) || status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD) || status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD) || status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD)) {
            return (SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED) || status.eql((SubLObject)inference_worker.$kw77$POSSIBLE) || status.eql((SubLObject)inference_worker.$kw142$PENDING) || status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD) || status.eql((SubLObject)inference_worker.$kw146$FINISHED) || status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw128$UNEXAMINED;
        }
        Errors.error((SubLObject)inference_worker.$str152$problem_status__a_cannot_become_u, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 143782L)
    public static SubLObject examined_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED) || status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD) || status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
            return status;
        }
        if (status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
            return (SubLObject)inference_worker.$kw139$EXAMINED;
        }
        if (status.eql((SubLObject)inference_worker.$kw137$UNEXAMINED_GOOD)) {
            return (SubLObject)inference_worker.$kw140$EXAMINED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw138$UNEXAMINED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD;
        }
        Errors.error((SubLObject)inference_worker.$str153$problem_of_status__a_cannot_be_ex, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144151L)
    public static SubLObject possible_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw77$POSSIBLE) || status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD) || status.eql((SubLObject)inference_worker.$kw154$POSSIBLE_NO_GOOD)) {
            return status;
        }
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
            return (SubLObject)inference_worker.$kw77$POSSIBLE;
        }
        if (status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
            return (SubLObject)inference_worker.$kw143$POSSIBLE_GOOD;
        }
        Errors.error((SubLObject)inference_worker.$str155$problem_of_status__a_cannot_be_ma, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144468L)
    public static SubLObject pending_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw142$PENDING) || status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD) || status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
            return status;
        }
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
            return (SubLObject)inference_worker.$kw142$PENDING;
        }
        if (status.eql((SubLObject)inference_worker.$kw140$EXAMINED_GOOD)) {
            return (SubLObject)inference_worker.$kw144$PENDING_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw145$PENDING_NO_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw77$POSSIBLE)) {
            return (SubLObject)inference_worker.$kw142$PENDING;
        }
        if (status.eql((SubLObject)inference_worker.$kw143$POSSIBLE_GOOD)) {
            return (SubLObject)inference_worker.$kw144$PENDING_GOOD;
        }
        Errors.error((SubLObject)inference_worker.$str156$problem_of_status__a_cannot_be_pe, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 144905L)
    public static SubLObject finished_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw146$FINISHED) || status.eql((SubLObject)inference_worker.$kw147$FINISHED_GOOD) || status.eql((SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD)) {
            return status;
        }
        if (status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
            return (SubLObject)inference_worker.$kw146$FINISHED;
        }
        if (status.eql((SubLObject)inference_worker.$kw144$PENDING_GOOD)) {
            return (SubLObject)inference_worker.$kw147$FINISHED_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw145$PENDING_NO_GOOD)) {
            return (SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD;
        }
        Errors.error((SubLObject)inference_worker.$str157$problem_of_status__a_cannot_be_fi, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145265L)
    public static SubLObject consider_that_problem_could_no_longer_be_good(final SubLObject problem) {
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145490L)
    public static SubLObject consider_that_problem_could_be_finished(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL != problem_could_be_finishedP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            possibly_note_problem_finished(problem, strategic_context);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 145894L)
    public static SubLObject problem_could_be_finishedP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        if (inference_worker.NIL != pending_problem_p(problem, strategic_context)) {
            SubLObject unfinishedP = (SubLObject)inference_worker.NIL;
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == unfinishedP && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_worker.NIL != problem_link_openableP(link, strategic_context)) {
                    unfinishedP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == problem_link_could_be_finishedP(link, strategic_context, consider_transformation_tacticsP));
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == unfinishedP);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 147237L)
    public static SubLObject problem_link_openableP(final SubLObject link, final SubLObject strategic_context) {
        if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_openP(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != logical_link_with_unique_tactic_p(link)) {
            final SubLObject tactic = logical_link_unique_tactic(link);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_tactic.tactic_possibleP(tactic) && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL == inference_tactician_strategic_uninterestingness.strategy_chooses_to_ignore_tacticP(strategic_context, tactic, (SubLObject)inference_worker.UNPROVIDED)));
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 147629L)
    public static SubLObject problem_link_could_be_finishedP(final SubLObject link, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        if (inference_worker.NIL != inference_worker_restriction.simplification_link_p(link)) {
            return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
        }
        if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(link)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
            if (inference_worker.NIL == consider_transformation_tacticsP) {
                return (SubLObject)inference_worker.T;
            }
            return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
        }
        else {
            if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(link)) {
                return finished_problem_p(inference_datastructures_problem_link.problem_link_sole_supporting_problem(link), strategic_context);
            }
            if (inference_worker.NIL != inference_worker_split.split_link_p(link)) {
                return split_link_could_be_finishedP(link, strategic_context);
            }
            if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
                return inference_worker_join_ordered.join_ordered_link_could_be_finishedP(link, strategic_context);
            }
            if (inference_worker.NIL != inference_worker_join.join_link_p(link)) {
                return join_link_could_be_finishedP(link, strategic_context);
            }
            if (inference_worker.NIL != inference_worker_union.union_link_p(link)) {
                return union_link_could_be_finishedP(link, strategic_context);
            }
            return Errors.error((SubLObject)inference_worker.$str158$unexpected_link_type__S, link);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 148701L)
    public static SubLObject split_link_could_be_finishedP(final SubLObject split_link, final SubLObject strategic_context) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, split_link, supporting_mapped_problem)) {
                final SubLObject conjunct_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                if (inference_worker.NIL != no_good_problem_p(conjunct_problem, strategic_context)) {
                    return (SubLObject)inference_worker.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        SubLObject unfinishedP;
        SubLObject rest;
        SubLObject supporting_mapped_problem2;
        SubLObject conjunct_problem2;
        SubLObject variable_map2;
        for (unfinishedP = (SubLObject)inference_worker.NIL, rest = (SubLObject)inference_worker.NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link); inference_worker.NIL == unfinishedP && inference_worker.NIL != rest; rest = rest.rest()) {
            supporting_mapped_problem2 = rest.first();
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, split_link, supporting_mapped_problem2)) {
                conjunct_problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                variable_map2 = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem2);
                unfinishedP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == finished_problem_p(conjunct_problem2, strategic_context));
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == unfinishedP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 149403L)
    public static SubLObject join_link_could_be_finishedP(final SubLObject j_link, final SubLObject strategic_context) {
        final SubLObject first_problem = inference_worker_join.join_link_first_problem(j_link);
        final SubLObject second_problem = inference_worker_join.join_link_second_problem(j_link);
        if (inference_worker.NIL != no_good_problem_p(first_problem, strategic_context) || inference_worker.NIL != no_good_problem_p(second_problem, strategic_context)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != finished_problem_p(first_problem, strategic_context) && inference_worker.NIL != finished_problem_p(second_problem, strategic_context)) {
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150069L)
    public static SubLObject union_link_could_be_finishedP(final SubLObject u_link, final SubLObject strategic_context) {
        final SubLObject disjunct_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(u_link);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != no_good_problem_p(disjunct_problem, strategic_context) || inference_worker.NIL != finished_problem_p(disjunct_problem, strategic_context));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150397L)
    public static SubLObject consider_that_problem_could_be_no_good(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        if (inference_worker.$kw26$TACTICAL == strategic_context) {
            return default_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
        }
        return inference_tactician.strategy_consider_that_problem_could_be_no_good(strategic_context, problem, consider_deepP, consider_transformation_tacticsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 150871L)
    public static SubLObject default_consider_that_problem_could_be_no_good(final SubLObject strategic_context, final SubLObject problem, final SubLObject consider_deepP, final SubLObject consider_transformation_tacticsP) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL == inference_datastructures_problem.tactically_good_problem_p(problem) && inference_worker.NIL == no_good_problem_p(problem, strategic_context) && inference_worker.NIL != unsatisfiable_problemP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            make_problem_no_good(problem, consider_deepP, strategic_context);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 151803L)
    public static SubLObject note_tactic_doomed(final SubLObject tactic, final SubLObject strategic_context) {
        return make_problem_no_good(inference_datastructures_tactic.tactic_problem(tactic), (SubLObject)inference_worker.NIL, strategic_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 151946L)
    public static SubLObject make_problem_no_good(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context)) {
            possibly_note_problem_pending(problem, strategic_context);
        }
        else {
            discard_all_possible_tactics(problem);
        }
        if (inference_worker.$kw26$TACTICAL == strategic_context) {
            final SubLObject store = inference_datastructures_problem.problem_store(problem);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
            if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject idx_$80 = idx;
                if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$80, (SubLObject)inference_worker.$kw27$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$80);
                    final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject inference;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                        id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                        inference = Vectors.aref(vector_var, id);
                        if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                            if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                inference = (SubLObject)inference_worker.$kw27$SKIP;
                            }
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                maybe_make_problem_irrelevant_to_inference(inference, problem);
                            }
                        }
                    }
                }
                final SubLObject idx_$81 = idx;
                if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$81)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$81);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject inference2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            inference2 = Hashtables.getEntryValue(cdohash_entry);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                maybe_make_problem_irrelevant_to_inference(inference2, problem);
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        if (inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_worker.NIL != strategic_context_may_modify_its_problem_storeP(strategic_context)) {
            final SubLObject status_var = (SubLObject)inference_worker.$kw106$PROVEN;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = proof_list;
                SubLObject proof = (SubLObject)inference_worker.NIL;
                proof = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                        reject_proof(proof, (SubLObject)inference_worker.$kw159$PROBLEM_NO_GOOD);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    proof = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        if (inference_worker.NIL == no_good_problem_p(problem, strategic_context)) {
            final SubLObject old_status = problem_raw_tactical_or_strategic_status(problem, strategic_context);
            final SubLObject new_status = no_good_version_of_problem_status(old_status);
            change_and_propagate_problem_status(problem, new_status, consider_deepP, strategic_context);
            if (inference_worker.$kw26$TACTICAL == strategic_context) {
                possibly_note_eager_pruning_problem(problem);
            }
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, (SubLObject)inference_worker.$kw160$CONJUNCTIVE) && (inference_worker.NIL == inference_datastructures_strategy.strategy_p(strategic_context) || inference_worker.NIL == connected_conjunction_link_p(link) || inference_worker.NIL == good_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(link), (SubLObject)inference_worker.$kw26$TACTICAL))) {
                    make_problem_no_good(inference_datastructures_problem_link.problem_link_supported_problem(link), consider_deepP, strategic_context);
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 153678L)
    public static SubLObject discard_all_possible_tactics(final SubLObject problem) {
        return discard_possible_tactics_int(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 153804L)
    public static SubLObject discard_all_impossible_possible_tactics(final SubLObject problem) {
        discard_possible_tactics_int(problem, (SubLObject)inference_worker.$kw86$IMPOSSIBLE, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw161$CONTENT, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
        if (inference_worker.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem.problem_store(problem))) {
            discard_possible_tactics_int(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw80$DISALLOWED, (SubLObject)inference_worker.$kw85$LOGICAL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
            discard_possible_tactics_int(problem, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.$kw81$DOOMED, (SubLObject)inference_worker.$kw85$LOGICAL, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 154377L)
    public static SubLObject discard_possible_tactics_int(final SubLObject problem, final SubLObject completeness, final SubLObject preference_level, final SubLObject type, final SubLObject tactic_to_not_discard, final SubLObject productivity) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = (SubLObject)inference_worker.NIL;
        tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, type) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, (SubLObject)inference_worker.$kw77$POSSIBLE) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_completeness_match(tactic, completeness) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_preference_level_match(tactic, preference_level) && inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_productivity_match(tactic, productivity) && !tactic.eql(tactic_to_not_discard)) {
                inference_datastructures_tactic.note_tactic_discarded(tactic);
                if (inference_worker.NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                    final SubLObject store = inference_datastructures_problem.problem_store(problem);
                    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                    if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
                        final SubLObject idx_$82 = idx;
                        if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$82, (SubLObject)inference_worker.$kw27$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$82);
                            final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                                id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                                inference = Vectors.aref(vector_var, id);
                                if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                    if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                                        inference = (SubLObject)inference_worker.$kw27$SKIP;
                                    }
                                    if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                                        inference_var = inference;
                                        set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                        set_contents_var = set.do_set_internal(set_var);
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            strategy = set_contents.do_set_contents_next(basis_object, state);
                                            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                                inference_tactician.strategy_note_tactic_discarded(strategy, tactic);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$83 = idx;
                        if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$83)) {
                            final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$83);
                            SubLObject id2 = (SubLObject)inference_worker.NIL;
                            SubLObject inference2 = (SubLObject)inference_worker.NIL;
                            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                            try {
                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                    inference2 = Hashtables.getEntryValue(cdohash_entry);
                                    if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                                        final SubLObject inference_var2 = inference2;
                                        final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                        final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject strategy2;
                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                            strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                                inference_tactician.strategy_note_tactic_discarded(strategy2, tactic);
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
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        if (inference_worker.NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && inference_worker.NIL == inference_datastructures_problem.problem_has_possible_tacticsP(problem)) {
            note_problem_pending(problem, (SubLObject)inference_worker.$kw26$TACTICAL);
        }
        consider_that_problem_could_be_strategically_pending(problem);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155130L)
    public static SubLObject consider_that_problem_could_be_strategically_pending(final SubLObject problem) {
        if (problem.eql(currently_active_problem())) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$84 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$84, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$84);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    consider_that_problem_could_be_strategically_pending_wrt(problem, strategy);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$85 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$85)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$85);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    consider_that_problem_could_be_strategically_pending_wrt(problem, strategy2);
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
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155471L)
    public static SubLObject consider_that_problem_could_be_strategically_pending_wrt(final SubLObject problem, final SubLObject strategy) {
        inference_tactician.strategy_consider_that_problem_could_be_strategically_pending(strategy, problem);
        if (inference_worker.NIL != inference_datastructures_strategy.strategically_possible_problem_p(problem, strategy) && inference_worker.NIL != inference_tactician.strategy_no_possible_strategems_for_problemP(strategy, problem)) {
            possibly_note_problem_pending(problem, strategy);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 155860L)
    public static SubLObject consider_that_supported_problems_could_be_no_good(final SubLObject supporting_problem, final SubLObject consider_deepP, final SubLObject strategic_context) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supporting_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_inference;
        SubLObject supported_problem;
        SubLObject non_focal_problem;
        SubLObject set_contents_var_$86;
        SubLObject basis_object_$87;
        SubLObject state_$88;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                if (inference_worker.NIL != inference_worker_answer.answer_link_p(link)) {
                    supported_inference = inference_datastructures_problem_link.problem_link_supported_inference(link);
                    inference_strategist.inference_note_no_good(supported_inference);
                }
                else if (inference_worker.NIL != inference_worker_union.union_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (inference_worker.NIL != all_no_good_union_argument_linksP(supported_problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T)) {
                        consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                    }
                }
                else if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                }
                else if (inference_worker.NIL != inference_worker_rewrite.rewrite_link_p(link)) {
                    supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                }
                else if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(link)) {
                    non_focal_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    set_contents_var_$86 = inference_datastructures_problem.problem_dependent_links(non_focal_problem);
                    for (basis_object_$87 = set_contents.do_set_contents_basis_object(set_contents_var_$86), state_$88 = (SubLObject)inference_worker.NIL, state_$88 = set_contents.do_set_contents_initial_state(basis_object_$87, set_contents_var_$86); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$87, state_$88); state_$88 = set_contents.do_set_contents_update_state(state_$88)) {
                        join_ordered_link = set_contents.do_set_contents_next(basis_object_$87, state_$88);
                        if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$88, join_ordered_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP(link, join_ordered_link)) {
                            consider_that_problem_could_be_no_good(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link), consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                        }
                    }
                }
                else {
                    if (inference_worker.$kw26$TACTICAL == strategic_context && inference_worker.NIL != inference_worker_split.split_link_p(link)) {
                        inference_worker_split.close_split_link(link);
                    }
                    if (inference_worker.NIL != link_permits_no_good_propagation_to_supported_problemsP(link)) {
                        supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                        consider_that_problem_could_be_no_good(supported_problem, consider_deepP, strategic_context, (SubLObject)inference_worker.T);
                    }
                }
            }
        }
        return supporting_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 157727L)
    public static SubLObject no_good_version_of_problem_status(final SubLObject status) {
        if (status.eql((SubLObject)inference_worker.$kw146$FINISHED)) {
            return (SubLObject)inference_worker.$kw148$FINISHED_NO_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw142$PENDING)) {
            return (SubLObject)inference_worker.$kw145$PENDING_NO_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw139$EXAMINED)) {
            return (SubLObject)inference_worker.$kw141$EXAMINED_NO_GOOD;
        }
        if (status.eql((SubLObject)inference_worker.$kw128$UNEXAMINED)) {
            return (SubLObject)inference_worker.$kw138$UNEXAMINED_NO_GOOD;
        }
        Errors.error((SubLObject)inference_worker.$str162$Unexpected_status__s, status);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 158048L)
    public static SubLObject unsatisfiable_problemP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        SubLObject result = (SubLObject)inference_worker.$kw131$UNDETERMINED;
        if (inference_worker.NIL != good_problem_p(problem, strategic_context)) {
            result = (SubLObject)inference_worker.NIL;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
            result = (SubLObject)inference_worker.NIL;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) {
            result = inference_datastructures_problem.closed_problem_p(problem);
        }
        else if (inference_worker.NIL != problem_doomedP(problem, strategic_context)) {
            result = (SubLObject)inference_worker.$kw81$DOOMED;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.single_literal_problem_p(problem) && inference_worker.NIL != problem_has_some_open_obviously_neutral_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.NIL;
        }
        else if (inference_worker.NIL != finished_problem_p(problem, strategic_context) && (inference_worker.NIL != inference_datastructures_problem.closed_problem_p(problem) || inference_worker.NIL == inference_datastructures_problem.single_literal_problem_p(problem))) {
            result = (SubLObject)inference_worker.$kw163$FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL;
        }
        else if (inference_worker.NIL != pending_problem_p(problem, strategic_context) && inference_worker.NIL != inference_tactician_strategic_uninterestingness.problem_has_executed_a_complete_tacticP(problem, strategic_context, (SubLObject)inference_worker.$kw76$GENERALIZED_REMOVAL) && inference_worker.NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw164$PENDING_COMPLETE;
        }
        else if (inference_worker.NIL != pending_problem_p(problem, strategic_context) && inference_worker.$kw75$PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(problem, strategic_context, inference_datastructures_problem.problem_variables(problem)) && inference_worker.NIL == inference_tactician_strategic_uninterestingness.problem_has_relevant_supporting_problemP(problem, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw165$PENDING_PREFERRED;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, (SubLObject)inference_worker.$kw55$SPLIT) && inference_worker.NIL != some_no_good_split_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw166$NO_GOOD_SPLIT_LINK;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != some_no_good_preferred_join_ordered_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw167$NO_GOOD_PREFERRED_JO_LINK;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, (SubLObject)inference_worker.$kw58$JOIN) && inference_worker.NIL != some_no_good_join_argument_linkP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw168$NO_GOOD_JOIN_LINK;
        }
        else if (inference_worker.NIL != inference_datastructures_problem.tactically_pending_problem_p(problem) && inference_worker.NIL != inference_datastructures_problem.problem_has_argument_link_of_typeP(problem, (SubLObject)inference_worker.$kw57$UNION) && inference_worker.NIL != all_no_good_union_argument_linksP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
            result = (SubLObject)inference_worker.$kw169$NO_GOOD_UNION_LINKS;
        }
        else if (inference_worker.NIL != inference_worker_restriction.problem_has_a_simplificationP(problem)) {
            result = all_no_good_simplification_linksP(problem, consider_deepP, strategic_context, consider_transformation_tacticsP);
        }
        else {
            result = (SubLObject)inference_worker.NIL;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 164003L)
    public static SubLObject problem_doomedP(final SubLObject problem, final SubLObject strategic_context) {
        SubLObject found_doomed_jo_tacticP = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject jo_tactic = (SubLObject)inference_worker.NIL;
        jo_tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(jo_tactic, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != preference_modules.disallowed_or_doomed_preference_level_p(inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context))) {
                final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
                if (inference_worker.NIL != jo_link) {
                    final SubLObject focal_shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
                    final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
                    final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
                    final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
                    final SubLObject shared_vars = bindings.apply_bindings(focal_variable_map, focal_shared_vars);
                    final SubLObject bindable_vars = compute_shared_vars_that_are_actually_bindable(shared_vars, problem, strategic_context, jo_tactic);
                    final SubLObject focal_bindable_vars = bindings.apply_bindings_backwards(focal_variable_map, bindable_vars);
                    if (!shared_vars.equal(bindable_vars) && inference_worker.NIL != preference_modules.doomed_preference_level_p(inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, focal_bindable_vars))) {
                        final SubLObject old_reason = (strategic_context == inference_worker.$kw26$TACTICAL) ? inference_datastructures_tactic.tactic_preference_level_justification(jo_tactic) : inference_datastructures_strategy.tactic_strategic_preference_level_justification(jo_tactic, strategic_context);
                        final SubLObject doom_reason = Sequences.cconcatenate((SubLObject)inference_worker.$str170$Can_t_bind_, format_nil.format_nil_a_no_copy(bindings.apply_bindings(focal_variable_map, conses_high.set_difference(list_utilities.tree_gather(inference_datastructures_problem.problem_query(inference_worker_join_ordered.join_ordered_tactic_focal_problem(jo_tactic)), Symbols.symbol_function((SubLObject)inference_worker.$sym171$VARIABLE_P), (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED), focal_bindable_vars, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED))));
                        final SubLObject new_reason = old_reason.isString() ? Sequences.cconcatenate(format_nil.format_nil_a_no_copy(doom_reason), new SubLObject[] { inference_worker.$str172$__previously_was_, format_nil.format_nil_a_no_copy(inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context)), inference_worker.$str173$_due_to_, format_nil.format_nil_s_no_copy(old_reason), inference_worker.$str174$_ }) : doom_reason;
                        if (strategic_context == inference_worker.$kw26$TACTICAL) {
                            inference_datastructures_tactic.set_tactic_preference_level(jo_tactic, (SubLObject)inference_worker.$kw81$DOOMED, new_reason);
                        }
                        else {
                            inference_datastructures_strategy.set_tactic_strategic_preference_level(jo_tactic, strategic_context, (SubLObject)inference_worker.$kw81$DOOMED, new_reason);
                        }
                        found_doomed_jo_tacticP = (SubLObject)inference_worker.T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            jo_tactic = cdolist_list_var.first();
        }
        return found_doomed_jo_tacticP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 166862L)
    public static SubLObject compute_shared_vars_that_are_actually_bindable(final SubLObject shared_vars, final SubLObject problem, final SubLObject strategic_context, final SubLObject jo_tactic) {
        SubLObject bindable_vars = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = shared_vars;
        SubLObject var = (SubLObject)inference_worker.NIL;
        var = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != shared_var_actually_bindableP(var, problem, strategic_context, jo_tactic)) {
                bindable_vars = (SubLObject)ConsesLow.cons(var, bindable_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return Sequences.nreverse(bindable_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 167309L)
    public static SubLObject shared_var_actually_bindableP(final SubLObject var, final SubLObject problem, final SubLObject strategic_context, final SubLObject jo_tactic) {
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject sibling_jo_tactic = (SubLObject)inference_worker.NIL;
        sibling_jo_tactic = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.do_problem_tactics_type_match(sibling_jo_tactic, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && !jo_tactic.eql(sibling_jo_tactic) && inference_worker.NIL != join_ordered_tactic_has_a_chance_at_binding_varP(sibling_jo_tactic, var, strategic_context)) {
                return (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling_jo_tactic = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 167735L)
    public static SubLObject join_ordered_tactic_has_a_chance_at_binding_varP(final SubLObject jo_tactic, final SubLObject var, final SubLObject strategic_context) {
        final SubLObject jo_link = inference_worker_join_ordered.join_ordered_tactic_link(jo_tactic);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        final SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject focal_var = bindings.apply_bindings_backwards(focal_variable_map, var);
        final SubLObject focal_query = inference_datastructures_problem.problem_query(focal_problem);
        if (inference_worker.NIL == list_utilities.tree_find(focal_var, focal_query, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED)) {
            return (SubLObject)inference_worker.NIL;
        }
        final SubLObject preference_level = inference_datastructures_strategy.tactic_strategic_preference_level(jo_tactic, strategic_context);
        if (inference_worker.NIL != preference_modules.doomed_preference_level_p(preference_level)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != preference_modules.disallowed_preference_level_p(preference_level)) {
            final SubLObject shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(jo_link);
            final SubLObject gordian_vars = Sequences.remove(focal_var, shared_vars, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == preference_modules.doomed_preference_level_p(inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, gordian_vars)));
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 169441L)
    public static SubLObject all_no_good_simplification_linksP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject simp_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            simp_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, simp_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(simp_link, (SubLObject)inference_worker.$kw175$SIMPLIFICATION) && inference_worker.NIL == problem_link_no_goodP(simp_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 169781L)
    public static SubLObject problem_has_some_open_obviously_neutral_argument_linkP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link) && (inference_worker.NIL != consider_transformation_tacticsP || inference_worker.NIL == inference_worker_transformation.generalized_transformation_link_p(argument_link)) && (inference_worker.NIL == consider_deepP || inference_worker.NIL == problem_link_interesting_when_considered_deepP(argument_link)) && inference_worker.NIL != problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(argument_link, strategic_context)) {
                return (SubLObject)inference_worker.T;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 170350L)
    public static SubLObject some_no_good_split_argument_linkP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject split_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            split_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, split_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(split_link, (SubLObject)inference_worker.$kw55$SPLIT) && inference_worker.NIL != problem_link_no_goodP(split_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return (SubLObject)inference_worker.T;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 170683L)
    public static SubLObject some_no_good_preferred_join_ordered_argument_linkP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        SubLObject focal_problem;
        SubLObject shared_vars;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != problem_link_no_goodP(join_ordered_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                focal_problem = inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link));
                shared_vars = inference_worker_join_ordered.focal_vars_shared_by_non_focal(join_ordered_link);
                if (inference_worker.$kw75$PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_vars)) {
                    return (SubLObject)inference_worker.T;
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 171349L)
    public static SubLObject some_no_good_join_argument_linkP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, join_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_link, (SubLObject)inference_worker.$kw58$JOIN) && inference_worker.NIL != problem_link_no_goodP(join_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return (SubLObject)inference_worker.T;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 171678L)
    public static SubLObject all_no_good_union_argument_linksP(final SubLObject problem, final SubLObject consider_deepP, final SubLObject strategic_context, final SubLObject consider_transformation_tacticsP) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject argument_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            argument_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(argument_link, (SubLObject)inference_worker.$kw57$UNION) && inference_worker.NIL == problem_link_no_goodP(argument_link, consider_deepP, strategic_context, consider_transformation_tacticsP)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 172071L)
    public static SubLObject problem_link_no_goodP(final SubLObject link, final SubLObject consider_deepP, final SubLObject strategic_context, SubLObject consider_transformation_tacticsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        if (inference_worker.NIL != consider_transformation_tacticsP && inference_worker.NIL != inference_datastructures_strategy.strategy_p(strategic_context) && inference_worker.NIL == problem_transformation_allowed_wrt_max_transformation_depthP(inference_datastructures_strategy.strategy_inference(strategic_context), inference_datastructures_problem_link.problem_link_supported_problem(link))) {
            consider_transformation_tacticsP = (SubLObject)inference_worker.NIL;
        }
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (inference_worker.NIL != no_good_problem_p(supporting_problem, strategic_context)) {
                    return (SubLObject)inference_worker.T;
                }
                if (inference_worker.NIL == consider_transformation_tacticsP && inference_worker.NIL != unsatisfiable_problem_ignoring_transformation_tacticsP(supporting_problem, strategic_context)) {
                    return (SubLObject)inference_worker.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        if ((inference_worker.NIL != consider_deepP || inference_worker.NIL != inference_worker.$always_consider_deepP$.getDynamicValue(thread)) && inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            return inference_worker_join_ordered.join_ordered_link_no_goodP(link, (SubLObject)inference_worker.NIL, strategic_context);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 173509L)
    public static SubLObject unsatisfiable_problem_ignoring_transformation_tacticsP(final SubLObject problem, final SubLObject strategic_context) {
        return unsatisfiable_problemP(problem, (SubLObject)inference_worker.NIL, strategic_context, (SubLObject)inference_worker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 173776L)
    public static SubLObject problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP(final SubLObject link, final SubLObject strategic_context) {
        assert inference_worker.NIL != strategic_context_p(strategic_context) : strategic_context;
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (inference_worker.NIL != neutral_problem_p(supporting_problem, strategic_context)) {
                    return (SubLObject)inference_worker.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 174292L)
    public static SubLObject problem_link_has_some_open_obviously_good_supporting_mapped_problemP(final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
        SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem)) {
                final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                if (inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(supporting_problem)) {
                    return (SubLObject)inference_worker.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            supporting_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 174724L)
    public static SubLObject problem_link_interesting_when_considered_deepP(final SubLObject link) {
        return inference_worker_join_ordered.join_ordered_link_p(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 175052L)
    public static SubLObject restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP(final SubLObject restriction_link, final SubLObject join_ordered_link) {
        final SubLObject restricted_non_focal_analogue = inference_worker_join_ordered.corresponding_restricted_non_focal_problem(restriction_link, join_ordered_link);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != restricted_non_focal_analogue && inference_worker.NIL != inference_datastructures_problem.tactically_no_good_problem_p(restricted_non_focal_analogue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 175605L)
    public static SubLObject problem_link_no_good_wrt_dependent_join_ordered_linkP(final SubLObject argument_link, final SubLObject join_ordered_link, final SubLObject consider_deepP, final SubLObject strategic_context) {
        if (inference_worker.NIL != problem_link_no_goodP(argument_link, consider_deepP, strategic_context, (SubLObject)inference_worker.T)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(argument_link)) {
            return restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP(argument_link, join_ordered_link);
        }
        if (inference_worker.NIL != inference_worker_removal.removal_link_p(argument_link)) {
            SubLObject at_least_one_restricted_non_focalP = (SubLObject)inference_worker.NIL;
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(argument_link);
            SubLObject proof = (SubLObject)inference_worker.NIL;
            proof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, (SubLObject)inference_worker.$kw106$PROVEN)) {
                    final SubLObject restricted_non_focal = inference_worker_join_ordered.join_ordered_link_triggered_restricted_non_focal(join_ordered_link, proof);
                    if (inference_worker.NIL != restricted_non_focal) {
                        at_least_one_restricted_non_focalP = (SubLObject)inference_worker.T;
                        if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(restricted_non_focal)) {
                            return (SubLObject)inference_worker.NIL;
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
            return at_least_one_restricted_non_focalP;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 176668L)
    public static SubLObject link_permits_no_good_propagation_to_supported_problemsP(final SubLObject link) {
        return list_utilities.member_eqP(inference_datastructures_problem_link.problem_link_type(link), (SubLObject)inference_worker.$list176);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 176821L)
    public static SubLObject propagate_proof_spec_via_answer_link(final SubLObject answer_link) {
        final SubLObject inference = inference_worker_answer.answer_link_supported_inference(answer_link);
        final SubLObject supporting_problem = inference_worker_answer.answer_link_supporting_problem(answer_link);
        final SubLObject inference_var = inference;
        final SubLObject set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        SubLObject proof_spec;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            strategy = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                proof_spec = inference_datastructures_strategy.strategy_proof_spec(strategy);
                if (inference_worker.$kw177$ANYTHING != proof_spec) {
                    strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy, proof_spec, answer_link, supporting_problem);
                }
            }
        }
        return answer_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 177348L)
    public static SubLObject propagate_proof_spec(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_answer.answer_link_p(link)) {
            return propagate_proof_spec_via_answer_link(link);
        }
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
        if (inference_worker.NIL != problem_has_some_proof_spec_to_propagateP(supported_problem)) {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem) && inference_worker.NIL != link_permits_proof_spec_propagationP(link, supporting_mapped_problem)) {
                    final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    propagate_proof_spec_to_supporting_problem_via_link(supported_problem, link, supporting_problem);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 177985L)
    public static SubLObject problem_has_some_proof_spec_to_propagateP(final SubLObject problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$89 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$89, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$89);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_problem_proof_spec(strategy, problem)) {
                                    return (SubLObject)inference_worker.T;
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$90 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$90)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$90);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy2) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_problem_proof_spec(strategy2, problem)) {
                                    return (SubLObject)inference_worker.T;
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
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 178256L)
    public static SubLObject propagate_proof_spec_to_supporting_problem_via_link(final SubLObject problem, final SubLObject link, final SubLObject supporting_problem) {
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$91 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$91, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$91);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
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
                SubLObject proof_spec;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, strategy) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy)) {
                                    proof_spec = inference_datastructures_strategy.strategy_problem_proof_spec(strategy, problem);
                                    if (inference_worker.$kw177$ANYTHING != proof_spec) {
                                        strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy, proof_spec, link, supporting_problem);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$92 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$92)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$92);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            SubLObject proof_spec2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && inference_worker.$kw177$ANYTHING != inference_datastructures_strategy.strategy_proof_spec(strategy2)) {
                                    proof_spec2 = inference_datastructures_strategy.strategy_problem_proof_spec(strategy2, problem);
                                    if (inference_worker.$kw177$ANYTHING != proof_spec2) {
                                        strategy_propagate_proof_spec_to_supporting_problem_via_link(strategy2, proof_spec2, link, supporting_problem);
                                    }
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
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 178835L)
    public static SubLObject with_proof_spec_of_appropriate_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list178);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject typed_proof_spec = (SubLObject)inference_worker.NIL;
        SubLObject proof_spec = (SubLObject)inference_worker.NIL;
        SubLObject proof_spec_type_p = (SubLObject)inference_worker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list178);
        typed_proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list178);
        proof_spec = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list178);
        proof_spec_type_p = current.first();
        current = current.rest();
        if (inference_worker.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(typed_proof_spec, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym179$FILTER_PROOF_SPECS_OF_TYPE, proof_spec, proof_spec_type_p))), (SubLObject)ConsesLow.listS((SubLObject)inference_worker.$sym180$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)inference_worker.$sym181$NULL, typed_proof_spec), ConsesLow.append(body, (SubLObject)inference_worker.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list178);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 179104L)
    public static SubLObject strategy_propagate_proof_spec_to_supporting_problem_via_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (inference_worker.NIL != inference_worker_answer.answer_link_p(link)) {
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, proof_spec);
        }
        else if (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link)) {
            SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym182$JOIN_ORDERED_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_join_ordered_proof_spec_via_join_ordered_link(strategy, typed_proof_spec, link, supporting_problem);
            }
            typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_residual_transformation_proof_spec_via_join_ordered_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym184$RESTRICTION_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_restriction_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != inference_worker_split.split_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym185$SPLIT_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_split_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != inference_worker_join.join_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym186$JOIN_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_join_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != conjunctive_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_conjunctive_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != inference_worker_restriction.simplification_link_p(link)) {
            propagate_proof_spec_via_simplification_link(strategy, proof_spec, link, supporting_problem);
        }
        else if (inference_worker.NIL != inference_worker_transformation.transformation_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym188$TRANSFORMATION_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_transformation_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else if (inference_worker.NIL != inference_worker_residual_transformation.residual_transformation_link_p(link)) {
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_residual_transformation_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        else {
            if (inference_worker.NIL == inference_worker_union.union_link_p(link)) {
                return Errors.error((SubLObject)inference_worker.$str190$Time_to_handle__S_propagation, inference_datastructures_problem_link.problem_link_type(link));
            }
            final SubLObject typed_proof_spec = inference_proof_spec.filter_proof_specs_of_type(proof_spec, (SubLObject)inference_worker.$sym189$UNION_PROOF_SPEC_P);
            if (inference_worker.NIL != typed_proof_spec) {
                propagate_proof_spec_via_union_link(strategy, typed_proof_spec, link, supporting_problem);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181739L)
    public static SubLObject link_permits_proof_spec_propagationP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 181879L)
    public static SubLObject proof_spec_of_appropriate_typeP(final SubLObject proof_spec, final SubLObject proof_spec_type_p) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_proof_spec.filter_proof_specs_of_type(proof_spec, proof_spec_type_p));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182041L)
    public static SubLObject strategy_propagate_problem_proof_spec(final SubLObject strategy, final SubLObject problem, final SubLObject proof_spec) {
        final SubLObject updatedP = inference_datastructures_strategy.strategy_note_problem_proof_spec(strategy, problem, proof_spec);
        if (inference_worker.NIL != updatedP) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    propagate_proof_spec(link);
                }
            }
        }
        return updatedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182330L)
    public static SubLObject propagate_join_ordered_proof_spec_via_join_ordered_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (inference_worker.NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = (SubLObject)inference_worker.NIL;
            disjunct = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                propagate_join_ordered_proof_spec_via_join_ordered_link_int(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        }
        else {
            propagate_join_ordered_proof_spec_via_join_ordered_link_int(strategy, proof_spec, link, supporting_problem);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 182628L)
    public static SubLObject propagate_join_ordered_proof_spec_via_join_ordered_link_int(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (supporting_problem.eql(inference_worker_join_ordered.join_ordered_link_focal_problem(link))) {
            final SubLObject focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_focal_proof_spec(proof_spec);
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(focal_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, focal_proof_spec);
            }
        }
        if (supporting_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_problem(link))) {
            final SubLObject non_focal_proof_spec = inference_proof_spec.join_ordered_proof_spec_non_focal_proof_spec(proof_spec);
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(non_focal_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, non_focal_proof_spec);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 183456L)
    public static SubLObject propagate_proof_spec_via_union_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (supporting_problem.eql(inference_worker_union.union_link_supporting_problem(link))) {
            final SubLObject disjunct_proof_spec = inference_proof_spec.union_proof_spec_disjunct_proof_spec(proof_spec);
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(disjunct_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, disjunct_proof_spec);
                return disjunct_proof_spec;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 183931L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_join_ordered_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (inference_worker.NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = (SubLObject)inference_worker.NIL;
            disjunct = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                propagate_residual_transformation_proof_spec_via_join_ordered_link_int(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        }
        else {
            propagate_residual_transformation_proof_spec_via_join_ordered_link_int(strategy, proof_spec, link, supporting_problem);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 184331L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_join_ordered_link_int(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        final SubLObject join_ordered_proof_spec = inference_proof_spec.join_ordered_proof_spec_from_residual_transformation_proof_spec(proof_spec);
        return propagate_join_ordered_proof_spec_via_join_ordered_link(strategy, join_ordered_proof_spec, link, supporting_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 184705L)
    public static SubLObject propagate_proof_spec_via_restriction_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        final SubLObject restricted_proof_spec = inference_proof_spec.restriction_proof_spec_restricted_proof_spec(proof_spec);
        if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(restricted_proof_spec, supporting_problem)) {
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, restricted_proof_spec);
            return restricted_proof_spec;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 185276L)
    public static SubLObject propagate_proof_spec_via_split_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        final SubLObject split_sub_proof_specs = inference_proof_spec.split_proof_spec_sub_proof_specs(proof_spec);
        SubLObject propagated_proof_spec = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = split_sub_proof_specs;
        SubLObject split_sub_proof_spec = (SubLObject)inference_worker.NIL;
        split_sub_proof_spec = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(split_sub_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, split_sub_proof_spec);
                propagated_proof_spec = split_sub_proof_spec;
            }
            cdolist_list_var = cdolist_list_var.rest();
            split_sub_proof_spec = cdolist_list_var.first();
        }
        return propagated_proof_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 185827L)
    public static SubLObject propagate_proof_spec_via_join_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sub_proof_specs = (SubLObject)((inference_worker.NIL != inference_proof_spec.or_pattern_p(proof_spec)) ? proof_spec.rest() : ConsesLow.list(proof_spec));
        SubLObject useful_proof_spec_parts = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = sub_proof_specs;
        SubLObject sub_proof_spec = (SubLObject)inference_worker.NIL;
        sub_proof_spec = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = sub_proof_spec;
            SubLObject join_part = (SubLObject)inference_worker.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list191);
            join_part = current.first();
            final SubLObject joined_parts;
            current = (joined_parts = current.rest());
            if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.$kw58$JOIN != join_part) {
                Errors.error((SubLObject)inference_worker.$str192$Propagating_bogus_proof_spec__A_d, sub_proof_spec, link);
            }
            SubLObject cdolist_list_var_$93 = joined_parts;
            SubLObject joined_part = (SubLObject)inference_worker.NIL;
            joined_part = cdolist_list_var_$93.first();
            while (inference_worker.NIL != cdolist_list_var_$93) {
                final SubLObject literal_spec = inference_proof_spec.proof_spec_literal_spec(joined_part);
                if (inference_worker.NIL != list_utilities.sublisp_boolean(literal_spec)) {
                    if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.literal_spec_admits_single_literal_problemP(literal_spec, supporting_problem)) {
                        useful_proof_spec_parts = (SubLObject)ConsesLow.cons(joined_part, useful_proof_spec_parts);
                    }
                }
                else {
                    useful_proof_spec_parts = (SubLObject)ConsesLow.cons(joined_part, useful_proof_spec_parts);
                }
                cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                joined_part = cdolist_list_var_$93.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_proof_spec = cdolist_list_var.first();
        }
        if (inference_worker.NIL != list_utilities.sublisp_boolean(useful_proof_spec_parts)) {
            final SubLObject useful_proof_spec = inference_proof_spec.merge_proof_specs(useful_proof_spec_parts);
            strategy_propagate_problem_proof_spec(strategy, supporting_problem, useful_proof_spec);
        }
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 186989L)
    public static SubLObject propagate_proof_spec_via_conjunctive_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187180L)
    public static SubLObject propagate_proof_spec_via_simplification_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187373L)
    public static SubLObject propagate_proof_spec_via_transformation_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (inference_worker.NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = (SubLObject)inference_worker.NIL;
            disjunct = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                propagate_transformation_proof_spec_via_transformation_link(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        }
        else {
            propagate_transformation_proof_spec_via_transformation_link(strategy, proof_spec, link, supporting_problem);
        }
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 187665L)
    public static SubLObject propagate_transformation_proof_spec_via_transformation_link(final SubLObject strategy, final SubLObject transformation_proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        assert inference_worker.NIL != inference_proof_spec.transformation_proof_spec_p(transformation_proof_spec) : transformation_proof_spec;
        final SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(link);
        final SubLObject rule_spec = inference_proof_spec.transformation_proof_spec_rule(transformation_proof_spec);
        if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.rule_spec_admits_rule(rule_spec, rule)) {
            final SubLObject transformed_proof_spec = inference_proof_spec.transformation_proof_spec_supporting_proof_spec(transformation_proof_spec);
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(transformed_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, transformed_proof_spec);
                return transformed_proof_spec;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 188409L)
    public static SubLObject propagate_proof_spec_via_residual_transformation_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        if (inference_worker.NIL != inference_proof_spec.or_pattern_p(proof_spec)) {
            SubLObject cdolist_list_var = proof_spec.rest();
            SubLObject disjunct = (SubLObject)inference_worker.NIL;
            disjunct = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                propagate_residual_transformation_proof_spec_via_residual_transformation_link(strategy, disjunct, link, supporting_problem);
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            }
        }
        else {
            propagate_residual_transformation_proof_spec_via_residual_transformation_link(strategy, proof_spec, link, supporting_problem);
        }
        return strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 188728L)
    public static SubLObject propagate_residual_transformation_proof_spec_via_residual_transformation_link(final SubLObject strategy, final SubLObject proof_spec, final SubLObject link, final SubLObject supporting_problem) {
        assert inference_worker.NIL != inference_proof_spec.residual_transformation_proof_spec_p(proof_spec) : proof_spec;
        final SubLObject rule = inference_worker_residual_transformation.residual_transformation_link_rule_assertion(link);
        final SubLObject rule_spec = inference_proof_spec.residual_transformation_proof_spec_rule(proof_spec);
        if (inference_worker.NIL != inference_tactician_strategic_uninterestingness.rule_spec_admits_rule(rule_spec, rule)) {
            final SubLObject transformed_proof_spec = inference_proof_spec.residual_transformation_proof_spec_supporting_proof_spec(proof_spec);
            if (inference_worker.NIL != inference_proof_spec.proof_spec_possibly_admits_problemP(transformed_proof_spec, supporting_problem)) {
                strategy_propagate_problem_proof_spec(strategy, supporting_problem, transformed_proof_spec);
                return transformed_proof_spec;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 189466L)
    public static SubLObject find_problem(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject problem = find_problem_int(store, query, free_hl_vars, (SubLObject)inference_worker.NIL);
        final SubLObject problem_variable_map = thread.secondMultipleValue();
        final SubLObject canonical_query = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker.NIL != problem) {
            final SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, problem_variable_map);
            return mapped_problem;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 190343L)
    public static SubLObject find_or_create_problem(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars, SubLObject complexP) {
        if (complexP == inference_worker.UNPROVIDED) {
            complexP = (SubLObject)inference_worker.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.inference_possibly_update_tick_indexed_progress_data(inference_macros.current_controlling_inference());
        thread.resetMultipleValues();
        SubLObject problem = find_problem_int(store, query, free_hl_vars, complexP);
        final SubLObject problem_variable_map = thread.secondMultipleValue();
        final SubLObject canonical_query = thread.thirdMultipleValue();
        final SubLObject canonical_free_hl_vars = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker.NIL == problem) {
            problem = inference_datastructures_problem.new_problem(store, canonical_query, canonical_free_hl_vars);
        }
        return inference_datastructures_problem_link.new_mapped_problem(problem, problem_variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 191879L)
    public static SubLObject find_problem_int(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars, final SubLObject complexP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
        if (pcase_var.eql((SubLObject)inference_worker.$kw193$EQUAL)) {
            final SubLObject problem = inference_datastructures_problem_store.find_problem_by_query(store, query, free_hl_vars);
            final SubLObject problem_variable_map = (SubLObject)inference_worker.NIL;
            return subl_promotions.values4(problem, problem_variable_map, query, free_hl_vars);
        }
        if (pcase_var.eql((SubLObject)inference_worker.$kw194$CZER_EQUAL)) {
            thread.resetMultipleValues();
            final SubLObject canonical_query = inference_czer.canonicalize_problem_query(query);
            final SubLObject canonical_variable_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject canonical_free_hl_vars = variables.sort_hl_variable_list_memoized(bindings.apply_bindings_backwards(canonical_variable_map, free_hl_vars));
            final SubLObject problem2 = inference_datastructures_problem_store.find_problem_by_query(store, canonical_query, canonical_free_hl_vars);
            if (inference_worker.NIL == problem2 && inference_worker.NIL != complexP) {
                thread.resetMultipleValues();
                final SubLObject complex_problem = inference_datastructures_problem_store.problem_store_find_complex_problem_query(store, canonical_query, canonical_free_hl_vars);
                final SubLObject complex_variable_map = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (inference_worker.NIL != complex_problem) {
                    final SubLObject complex_query = inference_datastructures_problem.problem_query(complex_problem);
                    final SubLObject final_variable_map = bindings.compose_bindings(complex_variable_map, canonical_variable_map);
                    return subl_promotions.values4(complex_problem, final_variable_map, complex_query, canonical_free_hl_vars);
                }
            }
            return subl_promotions.values4(problem2, canonical_variable_map, canonical_query, canonical_free_hl_vars);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 193649L)
    public static SubLObject find_or_create_problem_from_contextualized_asent_sense(final SubLObject store, final SubLObject contextualized_asent, final SubLObject sense, final SubLObject free_hl_vars) {
        final SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        return find_or_create_problem(store, query, free_hl_vars, (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194039L)
    public static SubLObject find_or_create_problem_from_contextualized_clause(final SubLObject store, final SubLObject contextualized_clause, final SubLObject free_hl_vars) {
        final SubLObject query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_clause);
        return find_or_create_problem(store, query, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query), (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194444L)
    public static SubLObject find_or_create_problem_from_subclause_spec(final SubLObject store, final SubLObject contextualized_clause, final SubLObject subclause_spec, final SubLObject free_hl_vars) {
        final SubLObject query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(contextualized_clause, subclause_spec);
        return find_or_create_problem(store, query, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query), (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 194896L)
    public static SubLObject find_or_create_problem_without_subclause_spec(final SubLObject store, final SubLObject contextualized_clause, final SubLObject subclause_spec, final SubLObject free_hl_vars) {
        final SubLObject query_without = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(contextualized_clause, subclause_spec);
        return find_or_create_problem(store, query_without, variables.sorted_hl_variables_in_expressions_intersection(free_hl_vars, query_without), (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 195382L)
    public static SubLObject find_or_create_root_problem_and_link(final SubLObject inference) {
        final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject hl_query = inference_datastructures_inference.inference_hl_query(inference);
        final SubLObject free_hl_vars = inference_datastructures_inference.inference_free_hl_vars(inference);
        final SubLObject mapped_root_problem = find_or_create_root_problem(store, hl_query, free_hl_vars);
        new_root_answer_link(inference, mapped_root_problem);
        return mapped_root_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 195899L)
    public static SubLObject new_root_answer_link(final SubLObject inference, final SubLObject mapped_root_problem) {
        final SubLObject link = inference_worker_answer.new_answer_link(inference);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(mapped_root_problem, link);
        final SubLObject root_problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_root_problem);
        inference_datastructures_problem_store.add_problem_store_historical_root_problem(inference_datastructures_problem.problem_store(root_problem), root_problem);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196459L)
    public static SubLObject find_or_create_root_problem(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars) {
        return find_or_create_problem(store, query, free_hl_vars, (SubLObject)inference_worker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 196771L)
    public static SubLObject prune_problem_store(final SubLObject store, SubLObject consider_deepP) {
        if (consider_deepP == inference_worker.UNPROVIDED) {
            consider_deepP = (SubLObject)inference_worker.T;
        }
        final SubLObject old_problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
        final SubLObject old_tactic_count = inference_datastructures_problem_store.problem_store_tactic_count(store);
        recompute_destructible_problems(store, consider_deepP);
        SubLObject destroyed_problem_count = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject destroyed_tactic_count = (SubLObject)inference_worker.ZERO_INTEGER;
        destroyed_problem_count = destroy_destructible_problems(store);
        destroyed_tactic_count = destroy_discarded_tactics(store);
        if (inference_worker.NIL != inference_worker.$problem_store_prune_reports$.getGlobalValue()) {
            final SubLObject new_problem_count = inference_datastructures_problem_store.problem_store_problem_count(store);
            final SubLObject new_tactic_count = inference_datastructures_problem_store.problem_store_tactic_count(store);
            if (inference_worker.NIL != subl_promotions.positive_integer_p(destroyed_problem_count) || inference_worker.NIL != subl_promotions.positive_integer_p(destroyed_tactic_count)) {
                format_nil.force_format((SubLObject)inference_worker.T, (SubLObject)inference_worker.$str196$__pruned__a_problems____a_____a__, destroyed_problem_count, old_problem_count, new_problem_count, destroyed_tactic_count, old_tactic_count, new_tactic_count, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
            }
        }
        inference_datastructures_problem_store.possibly_optimize_problem_store(store);
        return Numbers.add(destroyed_problem_count, destroyed_tactic_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 198005L)
    public static SubLObject destroy_discarded_tactics(final SubLObject store) {
        SubLObject tactic_count = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject link_count = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$94 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$94, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$94);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject cdolist_list_var;
                SubLObject tactic;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.valid_problem_p(problem)) {
                            cdolist_list_var = inference_datastructures_problem.problem_discarded_tactics(problem);
                            tactic = (SubLObject)inference_worker.NIL;
                            tactic = cdolist_list_var.first();
                            while (inference_worker.NIL != cdolist_list_var) {
                                link = (SubLObject)((inference_worker.NIL != connected_conjunction_tactic_p(tactic)) ? connected_conjunction_tactic_link(tactic) : inference_worker.NIL);
                                if (inference_worker.NIL != link && inference_worker.NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
                                    inference_datastructures_problem_link.destroy_problem_link(link);
                                    link_count = Numbers.add(link_count, (SubLObject)inference_worker.ONE_INTEGER);
                                }
                                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
                                tactic_count = Numbers.add(tactic_count, (SubLObject)inference_worker.ONE_INTEGER);
                                cdolist_list_var = cdolist_list_var.rest();
                                tactic = cdolist_list_var.first();
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$95 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$95)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$95);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.valid_problem_p(problem2)) {
                            SubLObject cdolist_list_var2 = inference_datastructures_problem.problem_discarded_tactics(problem2);
                            SubLObject tactic2 = (SubLObject)inference_worker.NIL;
                            tactic2 = cdolist_list_var2.first();
                            while (inference_worker.NIL != cdolist_list_var2) {
                                final SubLObject link2 = (SubLObject)((inference_worker.NIL != connected_conjunction_tactic_p(tactic2)) ? connected_conjunction_tactic_link(tactic2) : inference_worker.NIL);
                                if (inference_worker.NIL != link2 && inference_worker.NIL != inference_datastructures_problem_link.problem_link_closedP(link2)) {
                                    inference_datastructures_problem_link.destroy_problem_link(link2);
                                    link_count = Numbers.add(link_count, (SubLObject)inference_worker.ONE_INTEGER);
                                }
                                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic2);
                                tactic_count = Numbers.add(tactic_count, (SubLObject)inference_worker.ONE_INTEGER);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                tactic2 = cdolist_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Values.values(tactic_count, link_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199205L)
    public static SubLObject tactic_thrown_away_and_privateP(final SubLObject tactic, final SubLObject empowered_balancing_tactician) {
        if (inference_worker.NIL != empowered_balancing_tactician) {
            return inference_tactician_strategic_uninterestingness.strategy_chooses_to_throw_away_tacticP(empowered_balancing_tactician, tactic, (SubLObject)inference_worker.NIL, (SubLObject)inference_worker.NIL);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199430L)
    public static SubLObject destroy_destructible_problems(final SubLObject store) {
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
        final SubLObject destructible_problems = problem_store_janitor_destructible_problem_list(janitor);
        inference_datastructures_problem_store.reset_problem_store_janitor(store);
        SubLObject cdolist_list_var = destructible_problems;
        SubLObject problem = (SubLObject)inference_worker.NIL;
        problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return Sequences.length(destructible_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 199862L)
    public static SubLObject recompute_destructible_problems(final SubLObject store, SubLObject consider_deepP) {
        if (consider_deepP == inference_worker.UNPROVIDED) {
            consider_deepP = (SubLObject)inference_worker.T;
        }
        inference_datastructures_problem_store.reset_problem_store_janitor(store);
        final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
        if (inference_worker.NIL != consider_deepP) {
            consider_deep_no_goodness(janitor);
        }
        inference_datastructures_problem_store.problem_store_janitor_note_unstale(janitor);
        compute_indestructible_problems_from_inferences(janitor);
        compute_indestructible_problems_due_to_proofs(janitor);
        compute_indestructible_problems_due_to_strategic_activity(janitor);
        compute_indestructible_problems_due_to_potentially_useful_transformation_link(janitor);
        note_all_root_problems_indestructible(janitor);
        return inference_datastructures_problem_store.problem_store_janitor_destructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 200565L)
    public static SubLObject consider_deep_no_goodness(final SubLObject janitor) {
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject old_no_good_count = inference_datastructures_problem_store.problem_store_no_good_problem_count(store);
        compute_problem_store_min_depth_index(store);
        SubLObject all_problems = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$96 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$96, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$96);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        all_problems = (SubLObject)ConsesLow.cons(problem, all_problems);
                    }
                }
            }
            final SubLObject idx_$97 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$97)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$97);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        all_problems = (SubLObject)ConsesLow.cons(problem2, all_problems);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        SubLObject cdolist_list_var;
        all_problems = (cdolist_list_var = Sort.sort(all_problems, Symbols.symbol_function((SubLObject)inference_worker.$sym197$_), (SubLObject)inference_worker.$sym198$PROBLEM_MIN_DEPTH));
        SubLObject problem3 = (SubLObject)inference_worker.NIL;
        problem3 = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            consider_that_problem_could_be_no_good(problem3, (SubLObject)inference_worker.T, (SubLObject)inference_worker.$kw26$TACTICAL, (SubLObject)inference_worker.T);
            cdolist_list_var = cdolist_list_var.rest();
            problem3 = cdolist_list_var.first();
        }
        final SubLObject new_no_good_count = inference_datastructures_problem_store.problem_store_no_good_problem_count(store);
        return Numbers.subtract(new_no_good_count, old_no_good_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 201531L)
    public static SubLObject compute_problem_store_min_depth_index(final SubLObject store) {
        inference_datastructures_problem_store.reset_problem_store_min_depth_index(store);
        final SubLObject todo_queue = queues.create_queue((SubLObject)inference_worker.UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$98 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$98, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$98);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_has_answer_link_p(problem) || inference_worker.NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem)) {
                            inference_datastructures_problem.set_problem_min_depth(problem, (SubLObject)inference_worker.ZERO_INTEGER);
                            queues.enqueue(problem, todo_queue);
                        }
                    }
                }
            }
            final SubLObject idx_$99 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$99)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$99);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_has_answer_link_p(problem2) || inference_worker.NIL == inference_datastructures_problem.problem_has_dependent_link_p(problem2)) {
                            inference_datastructures_problem.set_problem_min_depth(problem2, (SubLObject)inference_worker.ZERO_INTEGER);
                            queues.enqueue(problem2, todo_queue);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        while (inference_worker.NIL == queues.queue_empty_p(todo_queue)) {
            final SubLObject problem3 = queues.dequeue(todo_queue);
            final SubLObject depth = inference_datastructures_problem.problem_min_depth(problem3);
            final SubLObject new_supporting_depth = number_utilities.f_1X(depth);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem3);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            SubLObject supporting_depth;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (inference_worker.NIL != cdolist_list_var) {
                        if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            supporting_depth = inference_datastructures_problem.problem_min_depth(supporting_problem);
                            if (inference_worker.$kw131$UNDETERMINED == supporting_depth || new_supporting_depth.numL(supporting_depth)) {
                                inference_datastructures_problem.set_problem_min_depth(supporting_problem, new_supporting_depth);
                                queues.enqueue(supporting_problem, todo_queue);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 202580L)
    public static SubLObject compute_indestructible_problems_from_inferences(final SubLObject janitor) {
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$100 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$100, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$100);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        possibly_propagate_problem_indestructible(root_problem);
                    }
                }
            }
            final SubLObject idx_$101 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$101)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$101);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        possibly_propagate_problem_indestructible(root_problem2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_destructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 203079L)
    public static SubLObject possibly_propagate_problem_indestructible(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = inference_worker.$possibly_propagate_problem_indestructible_stack$.currentBinding(thread);
        try {
            inference_worker.$possibly_propagate_problem_indestructible_stack$.bind((SubLObject)inference_worker.NIL, thread);
            possibly_propagate_problem_indestructible_int(problem);
        }
        finally {
            inference_worker.$possibly_propagate_problem_indestructible_stack$.rebind(_prev_bind_0, thread);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 203292L)
    public static SubLObject possibly_propagate_problem_indestructible_int(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == inference_datastructures_problem.problem_indestructibleP(problem)) {
            final SubLObject _prev_bind_0 = inference_worker.$possibly_propagate_problem_indestructible_stack$.currentBinding(thread);
            try {
                inference_worker.$possibly_propagate_problem_indestructible_stack$.bind((SubLObject)ConsesLow.cons(problem, inference_worker.$possibly_propagate_problem_indestructible_stack$.getDynamicValue(thread)), thread);
                possibly_note_problem_indestructible(problem);
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject argument_link;
                SubLObject link_var;
                SubLObject cdolist_list_var;
                SubLObject supporting_mapped_problem;
                SubLObject subproblem;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    argument_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, argument_link)) {
                        link_var = argument_link;
                        cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                        supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                        supporting_mapped_problem = cdolist_list_var.first();
                        while (inference_worker.NIL != cdolist_list_var) {
                            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link_var, supporting_mapped_problem) && inference_worker.NIL == compute_problem_link_destructibleP(argument_link)) {
                                subproblem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                                if (inference_worker.NIL == list_utilities.member_eqP(subproblem, inference_worker.$possibly_propagate_problem_indestructible_stack$.getDynamicValue(thread))) {
                                    possibly_propagate_problem_indestructible_int(subproblem);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            supporting_mapped_problem = cdolist_list_var.first();
                        }
                    }
                }
            }
            finally {
                inference_worker.$possibly_propagate_problem_indestructible_stack$.rebind(_prev_bind_0, thread);
            }
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204114L)
    public static SubLObject possibly_note_problem_indestructible(final SubLObject problem) {
        if (inference_worker.NIL != problem_should_be_indestructibleP(problem)) {
            inference_datastructures_problem.note_problem_indestructible(problem);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204301L)
    public static SubLObject compute_problem_link_destructibleP(final SubLObject link) {
        if (inference_worker.NIL != problem_link_closed_foreverP(link)) {
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204441L)
    public static SubLObject problem_link_closed_foreverP(final SubLObject link) {
        if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_closedP(link)) {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_problem.tactically_examined_problem_p(supported_problem) || inference_worker.NIL != inference_datastructures_problem.tactically_pending_problem_p(supported_problem) || inference_worker.NIL != inference_datastructures_problem.tactically_finished_problem_p(supported_problem));
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 204911L)
    public static SubLObject problem_link_closed_forever_wrt_supporting_mapped_problemP(final SubLObject link, final SubLObject supporting_mapped_problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != problem_link_closed_foreverP(link) || (inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_p(link) && supporting_mapped_problem.eql(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(link))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 205197L)
    public static SubLObject problem_should_be_indestructibleP(final SubLObject problem) {
        if (inference_worker.NIL == inference_datastructures_problem.tactically_no_good_problem_p(problem) && inference_worker.NIL == variant_problemP(problem)) {
            return (SubLObject)inference_worker.T;
        }
        if (inference_worker.NIL != inference_worker_residual_transformation.problem_is_a_residual_conjunctionP(problem)) {
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 205777L)
    public static SubLObject variant_problemP(final SubLObject problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_datastructures_problem.problem_proof_count(problem, (SubLObject)inference_worker.$kw106$PROVEN).isZero() && (inference_worker.NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) || (inference_worker.NIL != inference_datastructures_problem.tactically_possible_problem_p(problem) && inference_worker.NIL != inference_datastructures_problem.problem_has_no_tacticsP(problem))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206278L)
    public static SubLObject problem_store_janitor_destructible_problem_list(final SubLObject janitor) {
        SubLObject destructible_problems = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(inference_datastructures_problem_store.problem_store_janitor_store(janitor));
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$102 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$102, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$102);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_destructibleP(problem)) {
                            destructible_problems = (SubLObject)ConsesLow.cons(problem, destructible_problems);
                        }
                    }
                }
            }
            final SubLObject idx_$103 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$103)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$103);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_destructibleP(problem2)) {
                            destructible_problems = (SubLObject)ConsesLow.cons(problem2, destructible_problems);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        destructible_problems = Sequences.nreverse(destructible_problems);
        return destructible_problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206608L)
    public static SubLObject note_all_root_problems_indestructible(final SubLObject janitor) {
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$104 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$104, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$104);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        inference_datastructures_problem.note_problem_indestructible(root_problem);
                    }
                }
            }
            final SubLObject idx_$105 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$105)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$105);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        inference_datastructures_problem.note_problem_indestructible(root_problem2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 206964L)
    public static SubLObject compute_indestructible_problems_due_to_proofs(final SubLObject janitor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$106 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$106, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$106);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                SubLObject root_problem;
                SubLObject status_var;
                SubLObject iteration_state;
                SubLObject v_bindings;
                SubLObject proof_list;
                SubLObject cdolist_list_var;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        root_problem = inference_datastructures_inference.inference_root_problem(inference);
                        if (inference_worker.NIL != root_problem) {
                            status_var = (SubLObject)inference_worker.$kw106$PROVEN;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(root_problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                proof_list = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cdolist_list_var = proof_list;
                                proof = (SubLObject)inference_worker.NIL;
                                proof = cdolist_list_var.first();
                                while (inference_worker.NIL != cdolist_list_var) {
                                    if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                                        propagate_proof_indestructibility(proof);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    proof = cdolist_list_var.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            final SubLObject idx_$107 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$107)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$107);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject root_problem2 = inference_datastructures_inference.inference_root_problem(inference2);
                        if (inference_worker.NIL != root_problem2) {
                            final SubLObject status_var2 = (SubLObject)inference_worker.$kw106$PROVEN;
                            SubLObject iteration_state2;
                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(root_problem2)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                final SubLObject proof_list2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject cdolist_list_var2 = proof_list2;
                                SubLObject proof2 = (SubLObject)inference_worker.NIL;
                                proof2 = cdolist_list_var2.first();
                                while (inference_worker.NIL != cdolist_list_var2) {
                                    if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof2, status_var2)) {
                                        propagate_proof_indestructibility(proof2);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    proof2 = cdolist_list_var2.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 207473L)
    public static SubLObject propagate_proof_indestructibility(final SubLObject proof) {
        if (inference_worker.NIL == inference_datastructures_proof.proof_indestructibleP(proof)) {
            final SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
            inference_datastructures_problem.note_problem_indestructible(problem);
            SubLObject cdolist_list_var = inference_datastructures_proof.proof_direct_subproofs(proof);
            SubLObject subproof = (SubLObject)inference_worker.NIL;
            subproof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                propagate_proof_indestructibility(subproof);
                cdolist_list_var = cdolist_list_var.rest();
                subproof = cdolist_list_var.first();
            }
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 207790L)
    public static SubLObject compute_indestructible_problems_due_to_strategic_activity(final SubLObject janitor) {
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$108 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$108, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$108);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != inference_datastructures_problem.problem_active_in_some_strategyP(problem)) {
                            inference_datastructures_problem.note_problem_indestructible(problem);
                        }
                    }
                }
            }
            final SubLObject idx_$109 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$109)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$109);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != inference_datastructures_problem.problem_active_in_some_strategyP(problem2)) {
                            inference_datastructures_problem.note_problem_indestructible(problem2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        final SubLObject current_tactic = currently_executing_tactic();
        if (inference_worker.NIL != current_tactic && store.eql(inference_datastructures_tactic.tactic_store(current_tactic))) {
            inference_datastructures_problem.note_problem_indestructible(inference_datastructures_tactic.tactic_problem(current_tactic));
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 208442L)
    public static SubLObject compute_indestructible_problems_due_to_potentially_useful_transformation_link(final SubLObject janitor) {
        final SubLObject store = inference_datastructures_problem_store.problem_store_janitor_store(janitor);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$110 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$110, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$110);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                SubLObject problem_has_potentially_useful_transformation_linkP;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject t_link;
                SubLObject problem_t_link_supported_problem;
                SubLObject set_contents_var_$111;
                SubLObject basis_object_$112;
                SubLObject state_$113;
                SubLObject jo_link;
                SubLObject problem_jo_link_supported_problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(problem) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        problem_has_potentially_useful_transformation_linkP = (SubLObject)inference_worker.NIL;
                        set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == problem_has_potentially_useful_transformation_linkP && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            t_link = set_contents.do_set_contents_next(basis_object, state);
                            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, t_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(t_link, (SubLObject)inference_worker.$kw70$TRANSFORMATION)) {
                                problem_t_link_supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
                                set_contents_var_$111 = inference_datastructures_problem.problem_dependent_links(problem_t_link_supported_problem);
                                for (basis_object_$112 = set_contents.do_set_contents_basis_object(set_contents_var_$111), state_$113 = (SubLObject)inference_worker.NIL, state_$113 = set_contents.do_set_contents_initial_state(basis_object_$112, set_contents_var_$111); inference_worker.NIL == problem_has_potentially_useful_transformation_linkP && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$112, state_$113); state_$113 = set_contents.do_set_contents_update_state(state_$113)) {
                                    jo_link = set_contents.do_set_contents_next(basis_object_$112, state_$113);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$113, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                                        problem_jo_link_supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
                                        if (inference_worker.NIL == inference_datastructures_problem.tactically_finished_problem_p(problem_jo_link_supported_problem)) {
                                            problem_has_potentially_useful_transformation_linkP = (SubLObject)inference_worker.T;
                                        }
                                    }
                                }
                            }
                        }
                        if (inference_worker.NIL != problem_has_potentially_useful_transformation_linkP) {
                            inference_datastructures_problem.note_problem_indestructible(problem);
                        }
                    }
                }
            }
            final SubLObject idx_$111 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$111)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$111);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject problem2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject problem_has_potentially_useful_transformation_linkP2 = (SubLObject)inference_worker.NIL;
                        final SubLObject set_contents_var2 = inference_datastructures_problem.problem_dependent_links(problem2);
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject t_link2;
                        SubLObject problem_t_link_supported_problem2;
                        SubLObject set_contents_var_$112;
                        SubLObject basis_object_$113;
                        SubLObject state_$114;
                        SubLObject jo_link2;
                        SubLObject problem_jo_link_supported_problem2;
                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)inference_worker.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); inference_worker.NIL == problem_has_potentially_useful_transformation_linkP2 && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                            t_link2 = set_contents.do_set_contents_next(basis_object2, state2);
                            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state2, t_link2) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(t_link2, (SubLObject)inference_worker.$kw70$TRANSFORMATION)) {
                                problem_t_link_supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(t_link2);
                                set_contents_var_$112 = inference_datastructures_problem.problem_dependent_links(problem_t_link_supported_problem2);
                                for (basis_object_$113 = set_contents.do_set_contents_basis_object(set_contents_var_$112), state_$114 = (SubLObject)inference_worker.NIL, state_$114 = set_contents.do_set_contents_initial_state(basis_object_$113, set_contents_var_$112); inference_worker.NIL == problem_has_potentially_useful_transformation_linkP2 && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object_$113, state_$114); state_$114 = set_contents.do_set_contents_update_state(state_$114)) {
                                    jo_link2 = set_contents.do_set_contents_next(basis_object_$113, state_$114);
                                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state_$114, jo_link2) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link2, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                                        problem_jo_link_supported_problem2 = inference_datastructures_problem_link.problem_link_supported_problem(jo_link2);
                                        if (inference_worker.NIL == inference_datastructures_problem.tactically_finished_problem_p(problem_jo_link_supported_problem2)) {
                                            problem_has_potentially_useful_transformation_linkP2 = (SubLObject)inference_worker.T;
                                        }
                                    }
                                }
                            }
                        }
                        if (inference_worker.NIL != problem_has_potentially_useful_transformation_linkP2) {
                            inference_datastructures_problem.note_problem_indestructible(problem2);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 209786L)
    public static SubLObject possibly_prune_processed_problems(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_pruned = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject space_var = inference_datastructures_problem_store.problem_store_sbhl_resource_space(store);
                final SubLObject _prev_bind_0_$118 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(space_var, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)inference_worker.T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject root_proofs = inference_datastructures_problem_store.problem_store_all_processed_proofs(store);
                        final SubLObject _prev_bind_0_$119 = inference_datastructures_problem_store.$problem_store_modification_permittedP$.currentBinding(thread);
                        try {
                            inference_datastructures_problem_store.$problem_store_modification_permittedP$.bind((SubLObject)inference_worker.T, thread);
                            SubLObject cdolist_list_var = root_proofs;
                            SubLObject root_proof = (SubLObject)inference_worker.NIL;
                            root_proof = cdolist_list_var.first();
                            while (inference_worker.NIL != cdolist_list_var) {
                                inference_datastructures_problem_store.problem_store_note_proof_unprocessed(store, root_proof);
                                thread.resetMultipleValues();
                                final SubLObject pruned_link_count = possibly_prune_wrt_conjunctive_removal(root_proof);
                                final SubLObject pruned_problem_count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                total_pruned = Numbers.add(total_pruned, pruned_link_count);
                                total_pruned = Numbers.add(total_pruned, pruned_problem_count);
                                cdolist_list_var = cdolist_list_var.rest();
                                root_proof = cdolist_list_var.first();
                            }
                        }
                        finally {
                            inference_datastructures_problem_store.$problem_store_modification_permittedP$.rebind(_prev_bind_0_$119, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$120 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            space_var = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$118, thread);
                }
                inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store, space_var);
            }
            finally {
                final SubLObject _prev_bind_0_$121 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_worker.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$121, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return total_pruned;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 210854L)
    public static SubLObject possibly_prune_wrt_conjunctive_removal(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject links = prunable_objects_wrt_conjunctive_removal(proof);
        final SubLObject focal_problems = thread.secondMultipleValue();
        final SubLObject non_focal_problems = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)inference_worker.NIL;
        link = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            inference_datastructures_problem_link.destroy_problem_link(link);
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        cdolist_list_var = focal_problems;
        SubLObject problem = (SubLObject)inference_worker.NIL;
        problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        cdolist_list_var = non_focal_problems;
        problem = (SubLObject)inference_worker.NIL;
        problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$122 = inference_datastructures_problem.problem_tactics(problem);
            SubLObject tactic = (SubLObject)inference_worker.NIL;
            tactic = cdolist_list_var_$122.first();
            while (inference_worker.NIL != cdolist_list_var_$122) {
                if (inference_worker.NIL != inference_datastructures_tactic.tactic_in_progressP(tactic)) {
                    Errors.warn((SubLObject)inference_worker.$str200$destroying_in_progress_tactic__a, tactic);
                }
                cdolist_list_var_$122 = cdolist_list_var_$122.rest();
                tactic = cdolist_list_var_$122.first();
            }
            inference_datastructures_problem.destroy_problem(problem);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return Values.values(Sequences.length(links), Numbers.add(Sequences.length(focal_problems), Sequences.length(non_focal_problems)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 211585L)
    public static SubLObject prunable_objects_wrt_conjunctive_removal(final SubLObject proof) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof_tuples = compute_conjunctive_removal_proof_tuples(proof);
        SubLObject prunable_conjunctive_removal_links = set_contents.new_set_contents((SubLObject)inference_worker.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_worker.EQ));
        SubLObject prunable_conjunctive_removal_problems = set_contents.new_set_contents((SubLObject)inference_worker.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_worker.EQ));
        SubLObject prunable_restricted_non_focal_problems = set_contents.new_set_contents((SubLObject)inference_worker.ZERO_INTEGER, Symbols.symbol_function((SubLObject)inference_worker.EQ));
        SubLObject cdolist_list_var = proof_tuples;
        SubLObject proof_tuple = (SubLObject)inference_worker.NIL;
        proof_tuple = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = proof_tuple;
            SubLObject conjunctive_removal_proof = (SubLObject)inference_worker.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list201);
            conjunctive_removal_proof = current.first();
            final SubLObject join_ordered_proofs;
            current = (join_ordered_proofs = current.rest());
            if (inference_worker.NIL == join_ordered_proofs) {
                thread.resetMultipleValues();
                final SubLObject prunable_conjunctive_removal_links_$123 = update_prunable_conjunctive_removal_objects(conjunctive_removal_proof, prunable_conjunctive_removal_links, prunable_conjunctive_removal_problems);
                final SubLObject prunable_conjunctive_removal_problems_$124 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                prunable_conjunctive_removal_links = prunable_conjunctive_removal_links_$123;
                prunable_conjunctive_removal_problems = prunable_conjunctive_removal_problems_$124;
            }
            SubLObject cdolist_list_var_$125 = join_ordered_proofs;
            SubLObject join_ordered_proof = (SubLObject)inference_worker.NIL;
            join_ordered_proof = cdolist_list_var_$125.first();
            while (inference_worker.NIL != cdolist_list_var_$125) {
                SubLObject current_$127;
                final SubLObject datum_$126 = current_$127 = inference_datastructures_proof.proof_direct_subproofs(join_ordered_proof);
                SubLObject focal_proof = (SubLObject)inference_worker.NIL;
                SubLObject non_focal_proof = (SubLObject)inference_worker.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, (SubLObject)inference_worker.$list202);
                focal_proof = current_$127.first();
                current_$127 = current_$127.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$127, datum_$126, (SubLObject)inference_worker.$list202);
                non_focal_proof = current_$127.first();
                current_$127 = current_$127.rest();
                if (inference_worker.NIL == current_$127) {
                    final SubLObject restricted_non_focal_proof = inference_datastructures_proof.proof_sole_subproof(non_focal_proof);
                    final SubLObject restricted_non_focal_problem = inference_datastructures_proof.proof_supported_problem(restricted_non_focal_proof);
                    final SubLObject proof_subproblems = (SubLObject)ConsesLow.listS(restricted_non_focal_problem, inference_datastructures_problem.all_problem_argument_problems(inference_datastructures_proof.proof_supported_problem(non_focal_proof)));
                    if (inference_worker.NIL == inference_datastructures_problem.any_problem_has_an_in_progress_tacticP(proof_subproblems)) {
                        thread.resetMultipleValues();
                        final SubLObject prunable_conjunctive_removal_links_$124 = update_prunable_conjunctive_removal_objects(conjunctive_removal_proof, prunable_conjunctive_removal_links, prunable_conjunctive_removal_problems);
                        final SubLObject prunable_conjunctive_removal_problems_$125 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        prunable_conjunctive_removal_links = prunable_conjunctive_removal_links_$124;
                        prunable_conjunctive_removal_problems = prunable_conjunctive_removal_problems_$125;
                        if (inference_worker.ONE_INTEGER.numE(inference_datastructures_problem.problem_dependent_link_count(restricted_non_focal_problem))) {
                            final SubLObject isolated_problems = isolated_problem_subset(proof_subproblems);
                            final SubLObject isolated_finished_problems = finished_problem_subset(isolated_problems);
                            prunable_restricted_non_focal_problems = set_contents.set_contents_add(restricted_non_focal_problem, prunable_restricted_non_focal_problems, Symbols.symbol_function((SubLObject)inference_worker.EQ));
                            SubLObject cdolist_list_var_$126 = isolated_finished_problems;
                            SubLObject problem = (SubLObject)inference_worker.NIL;
                            problem = cdolist_list_var_$126.first();
                            while (inference_worker.NIL != cdolist_list_var_$126) {
                                prunable_restricted_non_focal_problems = set_contents.set_contents_add(problem, prunable_restricted_non_focal_problems, Symbols.symbol_function((SubLObject)inference_worker.EQ));
                                cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                                problem = cdolist_list_var_$126.first();
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$126, (SubLObject)inference_worker.$list202);
                }
                cdolist_list_var_$125 = cdolist_list_var_$125.rest();
                join_ordered_proof = cdolist_list_var_$125.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof_tuple = cdolist_list_var.first();
        }
        final SubLObject removal_links = Sort.sort(set_contents.set_contents_element_list(prunable_conjunctive_removal_links), Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym204$PROBLEM_LINK_SUID));
        final SubLObject removal_problems = Sort.sort(set_contents.set_contents_element_list(prunable_conjunctive_removal_problems), Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym205$PROBLEM_SUID));
        final SubLObject restricted_non_focal_problems = Sort.sort(set_contents.set_contents_element_list(prunable_restricted_non_focal_problems), Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym205$PROBLEM_SUID));
        return Values.values(removal_links, removal_problems, restricted_non_focal_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 214582L)
    public static SubLObject update_prunable_conjunctive_removal_objects(final SubLObject conjunctive_removal_proof, SubLObject prunable_links, SubLObject prunable_problems) {
        final SubLObject removal_link = inference_datastructures_proof.proof_link(conjunctive_removal_proof);
        if (inference_worker.NIL != inference_datastructures_proof.proof_bindings(conjunctive_removal_proof)) {
            prunable_links = set_contents.set_contents_add(removal_link, prunable_links, Symbols.symbol_function((SubLObject)inference_worker.EQ));
        }
        else {
            final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(removal_link);
            if (inference_worker.NIL != inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem)) {
                prunable_problems = set_contents.set_contents_add(supported_problem, prunable_problems, Symbols.symbol_function((SubLObject)inference_worker.EQ));
            }
        }
        return Values.values(prunable_links, prunable_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 215183L)
    public static SubLObject compute_conjunctive_removal_proof_tuples(final SubLObject proof) {
        SubLObject tuples = (SubLObject)inference_worker.NIL;
        if (inference_worker.NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            final SubLObject all_subproofs = inference_datastructures_proof.all_proof_subproofs(proof);
            final SubLObject conjunctive_removal_proofs = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)inference_worker.$sym206$CONJUNCTIVE_REMOVAL_PROOF_P), all_subproofs, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
            if (inference_worker.NIL != conjunctive_removal_proofs) {
                SubLObject cdolist_list_var = conjunctive_removal_proofs;
                SubLObject conjunctive_removal_proof = (SubLObject)inference_worker.NIL;
                conjunctive_removal_proof = cdolist_list_var.first();
                while (inference_worker.NIL != cdolist_list_var) {
                    SubLObject join_ordered_proofs = (SubLObject)inference_worker.NIL;
                    SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(conjunctive_removal_proof);
                    SubLObject join_ordered_proof = (SubLObject)inference_worker.NIL;
                    join_ordered_proof = csome_list_var.first();
                    while (inference_worker.NIL != csome_list_var) {
                        if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(join_ordered_proof, (SubLObject)inference_worker.NIL) && inference_worker.NIL != inference_worker_join_ordered.join_ordered_proof_p(join_ordered_proof) && inference_worker.NIL != list_utilities.member_eqP(join_ordered_proof, all_subproofs)) {
                            SubLObject current;
                            final SubLObject datum = current = inference_datastructures_proof.proof_direct_subproofs(join_ordered_proof);
                            SubLObject focal_proof = (SubLObject)inference_worker.NIL;
                            SubLObject non_focal_proof = (SubLObject)inference_worker.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list202);
                            focal_proof = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list202);
                            non_focal_proof = current.first();
                            current = current.rest();
                            if (inference_worker.NIL == current) {
                                if (conjunctive_removal_proof.eql(focal_proof) && inference_worker.NIL != inference_worker_restriction.restriction_proof_p(non_focal_proof) && inference_worker.NIL != list_utilities.member_eqP(non_focal_proof, all_subproofs)) {
                                    final SubLObject item_var = join_ordered_proof;
                                    if (inference_worker.NIL == conses_high.member(item_var, join_ordered_proofs, Symbols.symbol_function((SubLObject)inference_worker.EQ), Symbols.symbol_function((SubLObject)inference_worker.IDENTITY))) {
                                        join_ordered_proofs = (SubLObject)ConsesLow.cons(item_var, join_ordered_proofs);
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list202);
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        join_ordered_proof = csome_list_var.first();
                    }
                    join_ordered_proofs = Sort.sort(join_ordered_proofs, Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym207$PROOF_SUID));
                    final SubLObject tuple = (SubLObject)ConsesLow.listS(conjunctive_removal_proof, join_ordered_proofs);
                    tuples = (SubLObject)ConsesLow.cons(tuple, tuples);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunctive_removal_proof = cdolist_list_var.first();
                }
                tuples = Sequences.nreverse(tuples);
            }
        }
        return tuples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 216750L)
    public static SubLObject isolated_problem_subset(final SubLObject problems) {
        SubLObject isolated_problems = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = problems;
        SubLObject candidate_problem = (SubLObject)inference_worker.NIL;
        candidate_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != problem_isolated_wrt_problemsP(candidate_problem, problems)) {
                isolated_problems = (SubLObject)ConsesLow.cons(candidate_problem, isolated_problems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_problem = cdolist_list_var.first();
        }
        return Sequences.nreverse(isolated_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217038L)
    public static SubLObject problem_isolated_wrt_problemsP(final SubLObject candidate_problem, final SubLObject problems) {
        SubLObject witness = (SubLObject)inference_worker.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(candidate_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject dependent_link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == witness && inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            dependent_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
                if (inference_worker.NIL == list_utilities.member_eqP(supported_problem, problems)) {
                    witness = supported_problem;
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217413L)
    public static SubLObject finished_problem_subset(final SubLObject problems) {
        final SubLObject unfinished_problems = Mapping.mapcar((SubLObject)inference_worker.$sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_, problems);
        return list_utilities.fast_set_difference(problems, unfinished_problems, Symbols.symbol_function((SubLObject)inference_worker.EQ));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 217742L)
    public static SubLObject possibly_note_eager_pruning_problem(final SubLObject problem) {
        return (SubLObject)inference_worker.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 218149L)
    public static SubLObject possibly_prune_processed_proofs(final SubLObject store) {
        problem_store_compute_proof_keeping_problems(store);
        final SubLObject removal_strategies = problem_store_removal_strategies(store);
        final SubLObject processed_objects = problem_store_all_processed_objects(store, removal_strategies);
        SubLObject pruned_object_count = (SubLObject)inference_worker.ZERO_INTEGER;
        SubLObject cdolist_list_var = processed_objects;
        SubLObject v_object = (SubLObject)inference_worker.NIL;
        v_object = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != possibly_prune_processed_object(v_object)) {
                pruned_object_count = Numbers.add(pruned_object_count, (SubLObject)inference_worker.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        return pruned_object_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 218602L)
    public static SubLObject problem_store_all_processed_objects(final SubLObject store, final SubLObject removal_strategies) {
        final SubLObject processed_proofs = inference_datastructures_problem_store.problem_store_processed_proofs(store);
        SubLObject candidate_problems = set.set_element_list(inference_datastructures_problem_store.problem_store_potentially_processed_problems(store));
        SubLObject candidate_links = (SubLObject)inference_worker.NIL;
        final SubLObject set_contents_var = set.do_set_internal(processed_proofs);
        SubLObject basis_object;
        SubLObject state;
        SubLObject proof;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            proof = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, proof)) {
                candidate_problems = (SubLObject)ConsesLow.cons(inference_datastructures_proof.proof_supported_problem(proof), candidate_problems);
                candidate_links = (SubLObject)ConsesLow.cons(inference_datastructures_proof.proof_link(proof), candidate_links);
            }
        }
        candidate_problems = Sort.sort(candidate_problems, Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym205$PROBLEM_SUID));
        candidate_links = Sort.sort(candidate_links, Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym204$PROBLEM_LINK_SUID));
        SubLObject processed_problems = (SubLObject)inference_worker.NIL;
        SubLObject processed_links = (SubLObject)inference_worker.NIL;
        SubLObject last_seen = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = candidate_problems;
        SubLObject problem = (SubLObject)inference_worker.NIL;
        problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (!problem.eql(last_seen)) {
                last_seen = problem;
                if (inference_worker.NIL != problem_processedP(problem, removal_strategies)) {
                    processed_problems = (SubLObject)ConsesLow.cons(problem, processed_problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        cdolist_list_var = candidate_links;
        SubLObject link = (SubLObject)inference_worker.NIL;
        link = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (!link.eql(last_seen)) {
                last_seen = link;
                if (inference_worker.NIL != link_processedP(link)) {
                    processed_links = (SubLObject)ConsesLow.cons(link, processed_links);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return ConsesLow.nconc(Sequences.nreverse(processed_problems), Sequences.nreverse(processed_links));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 219865L)
    public static SubLObject problem_processedP(final SubLObject problem, final SubLObject removal_strategies) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_worker.NIL != problem_has_no_motivation_other_than_removalP(problem) && inference_worker.NIL != problem_not_in_progress_wrt_removalP(problem, removal_strategies) && inference_worker.NIL != all_problem_proofs_are_processedP(problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220166L)
    public static SubLObject link_processedP(final SubLObject link) {
        return all_link_proofs_are_processedP(link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220253L)
    public static SubLObject possibly_prune_processed_object(final SubLObject v_object) {
        if (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object)) {
            if (inference_worker.NIL != prunable_processed_problemP(v_object)) {
                inference_datastructures_problem.destroy_problem(v_object);
                return (SubLObject)inference_worker.T;
            }
        }
        else if (inference_worker.NIL != prunable_processed_linkP(v_object)) {
            inference_datastructures_problem_link.destroy_problem_link(v_object);
            return (SubLObject)inference_worker.T;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220519L)
    public static SubLObject problem_is_the_root_problem_of_some_inferenceP(final SubLObject problem) {
        return inference_datastructures_problem.problem_has_dependent_link_of_typeP(problem, (SubLObject)inference_worker.$kw118$ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 220658L)
    public static SubLObject consider_pruning_ramifications_of_ignored_strategem(final SubLObject strategy, final SubLObject strategem) {
        if (inference_worker.NIL != inference_worker_removal.conjunctive_removal_tactic_p(strategem) && inference_worker.NIL != inference_datastructures_tactic.tactic_executedP(strategem) && inference_worker.NIL == inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_tactic.tactic_store(strategem))) {
            final SubLObject problem = inference_datastructures_tactic.tactic_problem(strategem);
            if (inference_worker.NIL != inference_datastructures_problem.tactically_good_problem_p(problem) && inference_worker.NIL != inference_datastructures_problem.tactically_finished_problem_p(problem) && inference_worker.NIL == problem_is_the_root_problem_of_some_inferenceP(problem) && inference_worker.NIL == Sequences.find_if((SubLObject)inference_worker.$sym209$SPLIT_LINK_P, inference_datastructures_problem.problem_all_dependent_links(problem), (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED)) {
                inference_datastructures_problem.destroy_problem(problem);
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 221383L)
    public static SubLObject prunable_processed_problemP(final SubLObject problem) {
        if (inference_worker.ONE_INTEGER.numE(inference_datastructures_problem.problem_dependent_link_count(problem)) && inference_worker.NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem)) {
            final SubLObject restriction_link = inference_datastructures_problem.problem_sole_dependent_link(problem);
            if (inference_worker.NIL != inference_worker_restriction.restriction_link_p(restriction_link)) {
                final SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
                SubLObject has_a_siblingP = (SubLObject)inference_worker.NIL;
                if (inference_datastructures_problem.problem_dependent_link_count(unrestricted_problem).numE((SubLObject)inference_worker.ONE_INTEGER) && inference_worker.NIL != inference_worker_transformation.transformation_link_p(inference_datastructures_problem.problem_sole_dependent_link(unrestricted_problem)) && inference_worker.NIL != inference_datastructures_problem.problem_has_an_in_progress_complete_removal_tacticP(unrestricted_problem, (SubLObject)inference_worker.$kw26$TACTICAL)) {
                    return (SubLObject)inference_worker.T;
                }
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(unrestricted_problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject jo_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    jo_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                        if (inference_worker.NIL == has_a_siblingP && inference_worker.NIL != restricted_non_focal_with_siblingP(jo_link, restriction_link)) {
                            has_a_siblingP = (SubLObject)inference_worker.T;
                        }
                        if (inference_worker.NIL != restricted_focal_with_siblingP(jo_link, unrestricted_problem)) {
                            has_a_siblingP = (SubLObject)inference_worker.T;
                            if (inference_worker.NIL != corresponding_restricted_non_focal_unfinishedP(restriction_link, jo_link)) {
                                return (SubLObject)inference_worker.NIL;
                            }
                        }
                    }
                }
                return has_a_siblingP;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 222677L)
    public static SubLObject all_dependent_proofs_have_siblingsP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject only_childP = (SubLObject)inference_worker.NIL;
        final SubLObject status_var = (SubLObject)inference_worker.$kw106$PROVEN;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_worker.NIL == only_childP && inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject rest;
            SubLObject proof;
            for (rest = (SubLObject)inference_worker.NIL, rest = proof_list; inference_worker.NIL == only_childP && inference_worker.NIL != rest; rest = rest.rest()) {
                proof = rest.first();
                if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var)) {
                    only_childP = (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == all_dependent_proofs_have_siblings_int(proof));
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == only_childP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223081L)
    public static SubLObject all_dependent_proofs_have_siblings_int(final SubLObject proof) {
        if (inference_datastructures_problem.problem_proof_count(inference_datastructures_proof.proof_supported_problem(proof), (SubLObject)inference_worker.UNPROVIDED).numL((SubLObject)inference_worker.TWO_INTEGER)) {
            return (SubLObject)inference_worker.NIL;
        }
        SubLObject csome_list_var = inference_datastructures_proof.proof_dependents(proof);
        SubLObject dependent_proof = (SubLObject)inference_worker.NIL;
        dependent_proof = csome_list_var.first();
        while (inference_worker.NIL != csome_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(dependent_proof, (SubLObject)inference_worker.NIL) && inference_worker.NIL == all_dependent_proofs_have_siblings_int(dependent_proof)) {
                return (SubLObject)inference_worker.NIL;
            }
            csome_list_var = csome_list_var.rest();
            dependent_proof = csome_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223381L)
    public static SubLObject restricted_non_focal_with_siblingP(final SubLObject jo_link, final SubLObject restriction_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_worker_join_ordered.join_ordered_link_restricted_non_focal_linkP(jo_link, restriction_link) && (inference_worker.NIL == inference_worker.$processed_proofs_retain_one_proofP$.getDynamicValue(thread) || inference_worker_join_ordered.join_ordered_link_restricted_non_focal_count(jo_link).numGE((SubLObject)inference_worker.TWO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 223673L)
    public static SubLObject restricted_focal_with_siblingP(final SubLObject jo_link, final SubLObject unrestricted_problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(unrestricted_problem.eql(inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link)) && (inference_worker.NIL == inference_worker.$processed_proofs_retain_one_proofP$.getDynamicValue(thread) || inference_worker.NIL != join_ordered_link_restricted_focal_countGE(jo_link, (SubLObject)inference_worker.TWO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 224000L)
    public static SubLObject corresponding_restricted_non_focal_unfinishedP(final SubLObject link, final SubLObject jo_link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(link);
        SubLObject trigger_proof = (SubLObject)inference_worker.NIL;
        trigger_proof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(trigger_proof, (SubLObject)inference_worker.$kw106$PROVEN)) {
                final SubLObject non_focal_restriction_link = inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(jo_link, trigger_proof);
                if (inference_worker.NIL != inference_datastructures_problem_link.valid_problem_link_p(non_focal_restriction_link)) {
                    final SubLObject restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem(non_focal_restriction_link);
                    if (inference_worker.NIL == inference_datastructures_problem.tactically_finished_problem_p(restricted_non_focal)) {
                        return (SubLObject)inference_worker.T;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            trigger_proof = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 224562L)
    public static SubLObject prunable_processed_linkP(final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL != inference_datastructures_problem_link.valid_problem_link_p(link) && inference_worker.NIL != inference_worker_removal.removal_link_p(link)) {
            final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
            if (inference_worker.NIL == problem_is_reused_interestinglyP(problem) && inference_worker.NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem) && (inference_worker.NIL == inference_worker.$processed_proofs_retain_one_proofP$.getDynamicValue(thread) || inference_worker.NIL == link_has_all_the_proofsP(link))) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject jo_link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    jo_link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED) && inference_worker.NIL != corresponding_restricted_non_focal_unfinishedP(link, jo_link)) {
                        return (SubLObject)inference_worker.NIL;
                    }
                }
                return (SubLObject)inference_worker.T;
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 225257L)
    public static SubLObject problem_is_reused_interestinglyP(final SubLObject problem) {
        SubLObject the_only_supported_problem = (SubLObject)inference_worker.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject supported_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (inference_worker.NIL != supported_problem && !supported_problem.eql(the_only_supported_problem)) {
                    if (inference_worker.NIL != the_only_supported_problem) {
                        return (SubLObject)inference_worker.T;
                    }
                    the_only_supported_problem = supported_problem;
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 225661L)
    public static SubLObject link_has_all_the_proofsP(final SubLObject link) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(inference_datastructures_problem_link.problem_link_supported_problem(link));
        SubLObject basis_object;
        SubLObject state;
        SubLObject sibling_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            sibling_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, sibling_link) && !link.eql(sibling_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_some_proofP(sibling_link, (SubLObject)inference_worker.$kw106$PROVEN)) {
                return (SubLObject)inference_worker.NIL;
            }
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226005L)
    public static SubLObject join_ordered_link_restricted_focal_count(final SubLObject jo_link) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        SubLObject total = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject r_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            r_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, r_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(r_link, (SubLObject)inference_worker.$kw67$RESTRICTION)) {
                total = Numbers.add(total, (SubLObject)inference_worker.ONE_INTEGER);
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226312L)
    public static SubLObject join_ordered_link_restricted_focal_countGE(final SubLObject jo_link, final SubLObject n) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(jo_link);
        SubLObject total = (SubLObject)inference_worker.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject r_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            r_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, r_link) && inference_datastructures_problem_link.problem_link_type(r_link) == inference_worker.$kw67$RESTRICTION) {
                total = Numbers.add(total, (SubLObject)inference_worker.ONE_INTEGER);
                if (n.isNumber() && total.numGE(n)) {
                    return total;
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226695L)
    public static SubLObject all_problem_proofs_are_processedP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject status_var = (SubLObject)inference_worker.$kw106$PROVEN;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = proof_list;
            SubLObject proof = (SubLObject)inference_worker.NIL;
            proof = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, status_var) && inference_worker.NIL == inference_datastructures_proof.proof_processedP(proof)) {
                    return (SubLObject)inference_worker.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 226934L)
    public static SubLObject all_link_proofs_are_processedP(final SubLObject link) {
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_proofs(link);
        SubLObject proof = (SubLObject)inference_worker.NIL;
        proof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_problem.proof_has_statusP(proof, (SubLObject)inference_worker.$kw106$PROVEN) && inference_worker.NIL == inference_datastructures_proof.proof_processedP(proof)) {
                return (SubLObject)inference_worker.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 227169L)
    public static SubLObject problem_has_no_motivation_other_than_removalP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject has_some_motivation_other_than_removalP = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$131 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$131, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$131);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                final SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((inference_worker.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)inference_worker.ONE_INTEGER), (SubLObject)inference_worker.MINUS_ONE_INTEGER, (SubLObject)inference_worker.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)inference_worker.ZERO_INTEGER, length, (SubLObject)inference_worker.ONE_INTEGER));
                SubLObject start = (SubLObject)inference_worker.NIL;
                SubLObject end = (SubLObject)inference_worker.NIL;
                SubLObject delta = (SubLObject)inference_worker.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                delta = current.first();
                current = current.rest();
                if (inference_worker.NIL == current) {
                    if (inference_worker.NIL == has_some_motivation_other_than_removalP) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = (SubLObject)inference_worker.NIL, id = start; inference_worker.NIL == has_some_motivation_other_than_removalP && inference_worker.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = (SubLObject)inference_worker.$kw27$SKIP;
                                }
                                if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy) && inference_worker.NIL == balancing_tactician.balancing_tactician_p(strategy) && inference_worker.NIL == removal_tactician.removal_strategy_p(strategy)) {
                                    has_some_motivation_other_than_removalP = (SubLObject)inference_worker.T;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list210);
                }
            }
            final SubLObject idx_$132 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$132) && inference_worker.NIL == has_some_motivation_other_than_removalP) {
                SubLObject catch_var = (SubLObject)inference_worker.NIL;
                try {
                    thread.throwStack.push(inference_worker.$kw211$DO_HASH_TABLE);
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$132);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(has_some_motivation_other_than_removalP);
                            if (inference_worker.NIL != inference_datastructures_problem.problem_relevant_to_strategyP(problem, strategy2) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2) && inference_worker.NIL == balancing_tactician.balancing_tactician_p(strategy2) && inference_worker.NIL == removal_tactician.removal_strategy_p(strategy2)) {
                                has_some_motivation_other_than_removalP = (SubLObject)inference_worker.T;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_worker.$kw211$DO_HASH_TABLE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL == has_some_motivation_other_than_removalP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 227819L)
    public static SubLObject problem_finished_wrt_removalP(final SubLObject problem, final SubLObject removal_strategies) {
        SubLObject prunableP = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var = removal_strategies;
        SubLObject strategy = (SubLObject)inference_worker.NIL;
        strategy = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != finished_problem_p(problem, strategy)) {
                prunableP = (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategy = cdolist_list_var.first();
        }
        return prunableP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228199L)
    public static SubLObject problem_store_removal_strategies(final SubLObject store) {
        SubLObject result = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$133 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$133, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$133);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != removal_tactician.removal_strategy_p(strategy)) {
                            result = (SubLObject)ConsesLow.cons(strategy, result);
                        }
                    }
                }
            }
            final SubLObject idx_$134 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$134)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$134);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != removal_tactician.removal_strategy_p(strategy2)) {
                            result = (SubLObject)ConsesLow.cons(strategy2, result);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228429L)
    public static SubLObject problem_is_a_new_rootP(final SubLObject problem, final SubLObject new_root_strategies) {
        SubLObject cdolist_list_var = new_root_strategies;
        SubLObject strategy = (SubLObject)inference_worker.NIL;
        strategy = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                return (SubLObject)inference_worker.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            strategy = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228697L)
    public static SubLObject problem_store_new_root_strategies(final SubLObject store) {
        SubLObject result = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$135 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$135, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$135);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject strategy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    strategy = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                            strategy = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        if (inference_worker.NIL != new_root_tactician.new_root_strategy_p(strategy)) {
                            result = (SubLObject)ConsesLow.cons(strategy, result);
                        }
                    }
                }
            }
            final SubLObject idx_$136 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$136)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$136);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        strategy2 = Hashtables.getEntryValue(cdohash_entry);
                        if (inference_worker.NIL != new_root_tactician.new_root_strategy_p(strategy2)) {
                            result = (SubLObject)ConsesLow.cons(strategy2, result);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 228929L)
    public static SubLObject note_problem_dirty(final SubLObject problem) {
        return inference_datastructures_problem_store.remove_problem_wrt_reuse(inference_datastructures_problem.problem_store(problem), problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229045L)
    public static SubLObject problem_cleanP(final SubLObject problem) {
        return Equality.eq(problem, inference_datastructures_problem_store.find_problem_by_query(inference_datastructures_problem.problem_store(problem), inference_datastructures_problem.problem_query(problem), inference_datastructures_problem.problem_free_hl_vars(problem)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229214L)
    public static SubLObject problem_has_any_new_root_motivationP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$137 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$137, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$137);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                final SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((inference_worker.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)inference_worker.ONE_INTEGER), (SubLObject)inference_worker.MINUS_ONE_INTEGER, (SubLObject)inference_worker.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)inference_worker.ZERO_INTEGER, length, (SubLObject)inference_worker.ONE_INTEGER));
                SubLObject start = (SubLObject)inference_worker.NIL;
                SubLObject end = (SubLObject)inference_worker.NIL;
                SubLObject delta = (SubLObject)inference_worker.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                delta = current.first();
                current = current.rest();
                if (inference_worker.NIL == current) {
                    if (inference_worker.NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = (SubLObject)inference_worker.NIL, id = start; inference_worker.NIL == witness && inference_worker.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = (SubLObject)inference_worker.$kw27$SKIP;
                                }
                                if (inference_worker.NIL != new_root_tactician.new_root_strategy_p(strategy) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list210);
                }
            }
            final SubLObject idx_$138 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$138) && inference_worker.NIL == witness) {
                SubLObject catch_var = (SubLObject)inference_worker.NIL;
                try {
                    thread.throwStack.push(inference_worker.$kw211$DO_HASH_TABLE);
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$138);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (inference_worker.NIL != new_root_tactician.new_root_strategy_p(strategy2) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_worker.$kw211$DO_HASH_TABLE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229577L)
    public static SubLObject problem_has_any_transformation_motivationP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$139 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$139, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$139);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                final SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((inference_worker.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)inference_worker.ONE_INTEGER), (SubLObject)inference_worker.MINUS_ONE_INTEGER, (SubLObject)inference_worker.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)inference_worker.ZERO_INTEGER, length, (SubLObject)inference_worker.ONE_INTEGER));
                SubLObject start = (SubLObject)inference_worker.NIL;
                SubLObject end = (SubLObject)inference_worker.NIL;
                SubLObject delta = (SubLObject)inference_worker.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                delta = current.first();
                current = current.rest();
                if (inference_worker.NIL == current) {
                    if (inference_worker.NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = (SubLObject)inference_worker.NIL, id = start; inference_worker.NIL == witness && inference_worker.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = (SubLObject)inference_worker.$kw27$SKIP;
                                }
                                if (inference_worker.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list210);
                }
            }
            final SubLObject idx_$140 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$140) && inference_worker.NIL == witness) {
                SubLObject catch_var = (SubLObject)inference_worker.NIL;
                try {
                    thread.throwStack.push(inference_worker.$kw211$DO_HASH_TABLE);
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$140);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (inference_worker.NIL != transformation_tactician_datastructures.transformation_strategy_p(strategy2) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_worker.$kw211$DO_HASH_TABLE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 229919L)
    public static SubLObject problem_has_any_removal_motivationP(final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        SubLObject witness = (SubLObject)inference_worker.NIL;
        final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$141 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$141, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$141);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                final SubLObject length = Sequences.length(vector_var);
                SubLObject current;
                final SubLObject datum = current = (SubLObject)((inference_worker.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)inference_worker.ONE_INTEGER), (SubLObject)inference_worker.MINUS_ONE_INTEGER, (SubLObject)inference_worker.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)inference_worker.ZERO_INTEGER, length, (SubLObject)inference_worker.ONE_INTEGER));
                SubLObject start = (SubLObject)inference_worker.NIL;
                SubLObject end = (SubLObject)inference_worker.NIL;
                SubLObject delta = (SubLObject)inference_worker.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                start = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                end = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_worker.$list210);
                delta = current.first();
                current = current.rest();
                if (inference_worker.NIL == current) {
                    if (inference_worker.NIL == witness) {
                        SubLObject end_var;
                        SubLObject id;
                        SubLObject strategy;
                        for (end_var = end, id = (SubLObject)inference_worker.NIL, id = start; inference_worker.NIL == witness && inference_worker.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                            strategy = Vectors.aref(vector_var, id);
                            if (inference_worker.NIL == id_index.id_index_tombstone_p(strategy) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                                if (inference_worker.NIL != id_index.id_index_tombstone_p(strategy)) {
                                    strategy = (SubLObject)inference_worker.$kw27$SKIP;
                                }
                                if (inference_worker.NIL != removal_tactician.removal_strategy_p(strategy) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy)) {
                                    witness = strategy;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_worker.$list210);
                }
            }
            final SubLObject idx_$142 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$142) && inference_worker.NIL == witness) {
                SubLObject catch_var = (SubLObject)inference_worker.NIL;
                try {
                    thread.throwStack.push(inference_worker.$kw211$DO_HASH_TABLE);
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$142);
                    SubLObject id2 = (SubLObject)inference_worker.NIL;
                    SubLObject strategy2 = (SubLObject)inference_worker.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            strategy2 = Hashtables.getEntryValue(cdohash_entry);
                            subl_macros.do_hash_table_done_check(witness);
                            if (inference_worker.NIL != removal_tactician.removal_strategy_p(strategy2) && inference_worker.NIL != inference_datastructures_strategy.problem_motivatedP(problem, strategy2)) {
                                witness = strategy2;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_worker.$kw211$DO_HASH_TABLE);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
        }
        return witness;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 230247L)
    public static SubLObject problem_store_possibly_redundant_proof_sets(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_worker.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject redundant_proof_candidates = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_worker.EQUAL), (SubLObject)inference_worker.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject proofs = cdolist_list_var = inference_datastructures_problem_store.problem_store_all_proofs(store);
        SubLObject proof = (SubLObject)inference_worker.NIL;
        proof = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            final SubLObject problem = inference_datastructures_proof.proof_supported_problem(proof);
            final SubLObject v_bindings = inference_datastructures_proof.proof_bindings(proof);
            final SubLObject key = (SubLObject)ConsesLow.list(problem, v_bindings);
            final SubLObject supports = inference_datastructures_proof.all_proof_supports(proof);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(inference_datastructures_problem.problem_proof_bindings_index(problem)); inference_worker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject v_bindings_$143 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject proof_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var_$144 = proof_list;
                SubLObject sibling_proof = (SubLObject)inference_worker.NIL;
                sibling_proof = cdolist_list_var_$144.first();
                while (inference_worker.NIL != cdolist_list_var_$144) {
                    final SubLObject sibling_bindings = inference_datastructures_proof.proof_bindings(sibling_proof);
                    if (v_bindings.equal(sibling_bindings) && !proof.eql(sibling_proof)) {
                        final SubLObject sibling_supports = inference_datastructures_proof.all_proof_supports(sibling_proof);
                        if (inference_worker.NIL != arguments.justification_equal(supports, sibling_supports)) {
                            SubLObject redundancy_set = dictionary.dictionary_lookup(redundant_proof_candidates, key, (SubLObject)inference_worker.NIL);
                            if (inference_worker.NIL == redundancy_set) {
                                redundancy_set = set.new_set(Symbols.symbol_function((SubLObject)inference_worker.EQ), (SubLObject)inference_worker.UNPROVIDED);
                            }
                            set.set_add(proof, redundancy_set);
                            set.set_add(sibling_proof, redundancy_set);
                            dictionary.dictionary_enter(redundant_proof_candidates, key, redundancy_set);
                        }
                    }
                    cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                    sibling_proof = cdolist_list_var_$144.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
        }
        return dictionary.dictionary_values(redundant_proof_candidates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 231576L)
    public static SubLObject problem_store_all_possibly_redundant_proofs(final SubLObject store) {
        final SubLObject all_proofs = set.new_set(Symbols.symbol_function((SubLObject)inference_worker.EQ), (SubLObject)inference_worker.UNPROVIDED);
        SubLObject cdolist_list_var = problem_store_possibly_redundant_proof_sets(store);
        SubLObject proof_set = (SubLObject)inference_worker.NIL;
        proof_set = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(proof_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject proof;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                proof = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, proof)) {
                    set.set_add(proof, all_proofs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof_set = cdolist_list_var.first();
        }
        return Sort.sort(set.set_element_list(all_proofs), Symbols.symbol_function((SubLObject)inference_worker.$sym203$_), Symbols.symbol_function((SubLObject)inference_worker.$sym207$PROOF_SUID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 231982L)
    public static SubLObject problem_store_possibly_redundant_proof_count(final SubLObject store) {
        return number_utilities.summation(Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_worker.$sym213$SET_SIZE), problem_store_possibly_redundant_proof_sets(store)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 232214L)
    public static SubLObject possibly_prune_proof_tree(final SubLObject proof) {
        final SubLObject root_proofs = compute_root_proofs(proof);
        if (inference_worker.NIL != list_utilities.every_in_list((SubLObject)inference_worker.$sym214$PROOF_PRUNABLE_, root_proofs, (SubLObject)inference_worker.UNPROVIDED)) {
            return prune_starting_from_root_proofs(root_proofs);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 233089L)
    public static SubLObject compute_root_proofs(final SubLObject proof) {
        final SubLObject frontier_proofs = set_utilities.construct_set_from_list((SubLObject)ConsesLow.list(proof), Symbols.symbol_function((SubLObject)inference_worker.EQ), (SubLObject)inference_worker.UNPROVIDED);
        final SubLObject root_proofs = set.new_set(Symbols.symbol_function((SubLObject)inference_worker.EQ), (SubLObject)inference_worker.UNPROVIDED);
        while (inference_worker.NIL == set.set_emptyP(frontier_proofs)) {
            SubLObject cdolist_list_var = set.set_element_list(frontier_proofs);
            SubLObject proof_$145 = (SubLObject)inference_worker.NIL;
            proof_$145 = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                set.set_remove(proof_$145, frontier_proofs);
                final SubLObject direct_dependent_proofs = direct_dependent_proofs_including_split_restrictions(proof_$145);
                if (inference_worker.NIL != direct_dependent_proofs) {
                    set_utilities.set_add_all(frontier_proofs, direct_dependent_proofs);
                }
                else {
                    set.set_add(proof_$145, root_proofs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof_$145 = cdolist_list_var.first();
            }
        }
        return set.set_element_list(root_proofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 234496L)
    public static SubLObject direct_dependent_proofs_including_split_restrictions(final SubLObject proof) {
        final SubLObject dependent_proofs = inference_datastructures_proof.proof_dependent_proofs(proof, (SubLObject)inference_worker.UNPROVIDED);
        return (inference_worker.NIL != dependent_proofs) ? dependent_proofs : all_triggered_restricted_non_focal_links(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 234872L)
    public static SubLObject all_triggered_restricted_non_focal_links(final SubLObject proof) {
        SubLObject result = (SubLObject)inference_worker.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(inference_datastructures_proof.proof_supported_problem(proof));
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, jo_link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, (SubLObject)inference_worker.$kw56$JOIN_ORDERED)) {
                result = (SubLObject)ConsesLow.cons(inference_worker_join_ordered.join_ordered_link_triggered_restriction_link(jo_link, proof), result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 235358L)
    public static SubLObject proof_prunableP(final SubLObject proof) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != inference_datastructures_proof.proof_processedP(proof) && inference_worker.NIL == inference_datastructures_problem_store.proof_keeping_problemP(inference_datastructures_proof.proof_supported_problem(proof)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 235510L)
    public static SubLObject prune_starting_from_root_proofs(final SubLObject root_proofs) {
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 237662L)
    public static SubLObject prune_entire_problem_store(final SubLObject store) {
        final SubLObject objects = ConsesLow.append(inference_datastructures_problem_store.problem_store_all_problems(store), inference_datastructures_problem_store.problem_store_all_problem_links(store));
        final SubLObject removal_strategies = problem_store_removal_strategies(store);
        return prune_problem_store_objects(objects, removal_strategies);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238009L)
    public static SubLObject prune_problem_store_below(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL == inference_datastructures_problem.problem_p(v_object) && inference_worker.NIL == inference_datastructures_problem_link.problem_link_p(v_object)) {
            Errors.error((SubLObject)inference_worker.$str215$_a_was_not_a_problem_p_or_problem, v_object);
        }
        final SubLObject store = (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object)) ? inference_datastructures_problem.problem_store(v_object) : inference_datastructures_problem_link.problem_link_store(v_object);
        final SubLObject removal_strategies = problem_store_removal_strategies(store);
        return prune_problem_store_objects(all_problem_store_objects_below(v_object), removal_strategies);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238429L)
    public static SubLObject all_problem_store_objects_below(final SubLObject v_object) {
        final SubLObject result = set.new_set(Symbols.symbol_function((SubLObject)inference_worker.EQL), (SubLObject)inference_worker.UNPROVIDED);
        add_all_problem_store_objects_below_recursive(v_object, result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 238607L)
    public static SubLObject add_all_problem_store_objects_below_recursive(final SubLObject v_object, final SubLObject v_set) {
        if (inference_worker.NIL != set.set_memberP(v_object, v_set)) {
            return (SubLObject)inference_worker.NIL;
        }
        if (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object)) {
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(v_object);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    add_all_problem_store_objects_below_recursive(link, v_set);
                }
            }
        }
        else {
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(v_object);
            SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, v_object, supporting_mapped_problem)) {
                    final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    add_all_problem_store_objects_below_recursive(problem, v_set);
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 239098L)
    public static SubLObject prune_problem_store_objects(final SubLObject objects, final SubLObject removal_strategies) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = (SubLObject)inference_worker.NIL;
        v_object = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_worker.NIL == inference_datastructures_problem.problem_p(v_object) && inference_worker.NIL == inference_datastructures_problem_link.problem_link_p(v_object)) {
                Errors.error((SubLObject)inference_worker.$str215$_a_was_not_a_problem_p_or_problem, v_object);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        }
        final SubLObject v_object2 = objects.first();
        final SubLObject store = (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object2)) ? inference_datastructures_problem.problem_store(v_object2) : inference_datastructures_problem_link.problem_link_store(v_object2);
        problem_store_compute_proof_keeping_problems(store);
        SubLObject prunables = (SubLObject)inference_worker.NIL;
        SubLObject cdolist_list_var2 = objects;
        SubLObject v_object_$146 = (SubLObject)inference_worker.NIL;
        v_object_$146 = cdolist_list_var2.first();
        while (inference_worker.NIL != cdolist_list_var2) {
            if (inference_worker.NIL != prunable_problem_store_objectP(v_object_$146, removal_strategies)) {
                prunables = (SubLObject)ConsesLow.cons(v_object_$146, prunables);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_object_$146 = cdolist_list_var2.first();
        }
        PrintLow.format((SubLObject)inference_worker.T, (SubLObject)inference_worker.$str216$__prunables___s__, prunables);
        cdolist_list_var2 = prunables;
        SubLObject prunable = (SubLObject)inference_worker.NIL;
        prunable = cdolist_list_var2.first();
        while (inference_worker.NIL != cdolist_list_var2) {
            prune_problem_store_object(prunable);
            cdolist_list_var2 = cdolist_list_var2.rest();
            prunable = cdolist_list_var2.first();
        }
        return Sequences.length(prunables);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 239802L)
    public static SubLObject prunable_problem_store_objectP(final SubLObject v_object, final SubLObject removal_strategies) {
        if (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object)) {
            return prunable_problemP(v_object, removal_strategies);
        }
        if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            return prunable_problem_linkP(v_object);
        }
        Errors.error((SubLObject)inference_worker.$str217$Unexpected_problem_store_object__, v_object);
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240107L)
    public static SubLObject prunable_problemP(final SubLObject problem, final SubLObject removal_strategies) {
        if (inference_worker.NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem) && inference_worker.NIL != problem_has_no_motivation_other_than_removalP(problem) && inference_worker.NIL != problem_not_in_progress_wrt_removalP(problem, removal_strategies)) {
            return (SubLObject)inference_worker.NIL;
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240393L)
    public static SubLObject prunable_problem_linkP(final SubLObject link) {
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240479L)
    public static SubLObject problem_not_in_progress_wrt_removalP(final SubLObject problem, final SubLObject removal_strategies) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker.NIL != list_utilities.member_eqP(inference_datastructures_problem.problem_tactical_status(problem), (SubLObject)inference_worker.$list218) || inference_worker.NIL != problem_finished_wrt_removalP(problem, removal_strategies));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240731L)
    public static SubLObject prune_problem_store_object(final SubLObject v_object) {
        if (inference_worker.NIL != inference_datastructures_problem.problem_p(v_object)) {
            inference_datastructures_problem.destroy_problem(v_object);
        }
        else if (inference_worker.NIL != inference_datastructures_problem_link.problem_link_p(v_object)) {
            inference_datastructures_problem_link.destroy_problem_link(v_object);
        }
        else {
            Errors.error((SubLObject)inference_worker.$str217$Unexpected_problem_store_object__, v_object);
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 240981L)
    public static SubLObject problem_store_compute_proof_keeping_problems(final SubLObject store) {
        inference_datastructures_problem_store.clear_problem_store_proof_keeping_problems(store);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (inference_worker.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_worker.$kw27$SKIP)) {
            final SubLObject idx_$147 = idx;
            if (inference_worker.NIL == id_index.id_index_dense_objects_empty_p(idx_$147, (SubLObject)inference_worker.$kw27$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$147);
                final SubLObject backwardP_var = (SubLObject)inference_worker.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject inference;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_worker.NIL, v_iteration = (SubLObject)inference_worker.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_worker.ONE_INTEGER)) {
                    id = ((inference_worker.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_worker.ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (inference_worker.NIL == id_index.id_index_tombstone_p(inference) || inference_worker.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_worker.$kw27$SKIP)) {
                        if (inference_worker.NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = (SubLObject)inference_worker.$kw27$SKIP;
                        }
                        inference_compute_proof_keeping_problems(inference);
                    }
                }
            }
            final SubLObject idx_$148 = idx;
            if (inference_worker.NIL == id_index.id_index_sparse_objects_empty_p(idx_$148)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$148);
                SubLObject id2 = (SubLObject)inference_worker.NIL;
                SubLObject inference2 = (SubLObject)inference_worker.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_compute_proof_keeping_problems(inference2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 241732L)
    public static SubLObject inference_compute_proof_keeping_problems(final SubLObject inference) {
        return compute_proof_keeping_problems_recursive(inference_datastructures_inference.inference_root_problem(inference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 241889L)
    public static SubLObject compute_proof_keeping_problems_recursive(final SubLObject problem) {
        if (inference_worker.NIL != inference_datastructures_problem_store.unknown_proof_keeping_problemP(problem)) {
            inference_datastructures_problem_store.note_not_proof_keeping_problem(problem);
            if (inference_worker.NIL == inference_datastructures_problem.tactically_finished_problem_p(problem)) {
                final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    link = set_contents.do_set_contents_next(basis_object, state);
                    if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                        compute_proof_keeping_links_recursive(link);
                    }
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 242559L)
    public static SubLObject compute_proof_keeping_links_recursive(final SubLObject link) {
        if (inference_worker.NIL != inference_worker_split.split_link_p(link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_openP(link) && inference_worker.NIL != cartesian_split_linkP(link)) {
            final SubLObject non_proof_keeping_problem = choose_split_link_non_proof_keeping_problem(link);
            SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem = (SubLObject)inference_worker.NIL;
            supporting_mapped_problem = cdolist_list_var.first();
            while (inference_worker.NIL != cdolist_list_var) {
                if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem)) {
                    final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                    final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                    if (problem.eql(non_proof_keeping_problem)) {
                        inference_datastructures_problem_store.note_not_proof_keeping_problem(problem);
                        compute_proof_keeping_problems_recursive(problem);
                    }
                    else {
                        note_and_propagate_proof_keeping_problem(problem, link);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                supporting_mapped_problem = cdolist_list_var.first();
            }
        }
        else if (inference_worker.NIL != inference_worker_join.join_link_p(link) && inference_worker.NIL != inference_datastructures_problem_link.problem_link_openP(link)) {
            final SubLObject proof_keeping_problem = inference_worker_join.join_link_first_problem(link);
            final SubLObject non_proof_keeping_problem2 = inference_worker_join.join_link_second_problem(link);
            inference_datastructures_problem_store.note_not_proof_keeping_problem(non_proof_keeping_problem2);
            compute_proof_keeping_problems_recursive(non_proof_keeping_problem2);
            note_and_propagate_proof_keeping_problem(proof_keeping_problem, link);
        }
        else {
            SubLObject cdolist_list_var2 = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link);
            SubLObject supporting_mapped_problem2 = (SubLObject)inference_worker.NIL;
            supporting_mapped_problem2 = cdolist_list_var2.first();
            while (inference_worker.NIL != cdolist_list_var2) {
                if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link, supporting_mapped_problem2)) {
                    final SubLObject problem2 = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem2);
                    final SubLObject variable_map2 = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem2);
                    compute_proof_keeping_problems_recursive(problem2);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                supporting_mapped_problem2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 244414L)
    public static SubLObject cartesian_split_linkP(final SubLObject split_link) {
        final SubLObject bal_strat = inference_datastructures_problem_store.problem_store_unique_balancing_tactician(inference_datastructures_problem_link.problem_link_store(split_link));
        if (inference_worker.NIL == bal_strat) {
            return (SubLObject)inference_worker.T;
        }
        final SubLObject r_strats = (SubLObject)((inference_worker.NIL != striping_tactician.striping_tactician_p(bal_strat)) ? striping_tactician.striping_tactician_removal_substrategies(bal_strat) : ConsesLow.list(balancing_tactician.balancing_tactician_sole_removal_substrategy(bal_strat)));
        SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        SubLObject conjunct_mapped_problem = (SubLObject)inference_worker.NIL;
        conjunct_mapped_problem = cdolist_list_var.first();
        while (inference_worker.NIL != cdolist_list_var) {
            if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, split_link, conjunct_mapped_problem)) {
                final SubLObject split_tactic = inference_worker_split.split_link_tactic(split_link, conjunct_mapped_problem);
                if (inference_worker.NIL == split_tactic) {
                    return (SubLObject)inference_worker.T;
                }
                SubLObject cdolist_list_var_$149 = r_strats;
                SubLObject r_strat = (SubLObject)inference_worker.NIL;
                r_strat = cdolist_list_var_$149.first();
                while (inference_worker.NIL != cdolist_list_var_$149) {
                    if (inference_worker.NIL != number_utilities.potentially_infinite_integer_G(inference_datastructures_strategy.tactic_strategic_productivity(split_tactic, r_strat), (SubLObject)inference_worker.$int116$100)) {
                        return (SubLObject)inference_worker.T;
                    }
                    cdolist_list_var_$149 = cdolist_list_var_$149.rest();
                    r_strat = cdolist_list_var_$149.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct_mapped_problem = cdolist_list_var.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 245585L)
    public static SubLObject choose_split_link_non_proof_keeping_problem(final SubLObject split_link) {
        final SubLObject open_problems = inference_worker_split.split_link_supporting_problems_with_variables(split_link);
        final SubLObject pcase_var = list_utilities.count_if_not((SubLObject)inference_worker.$sym219$TACTICALLY_FINISHED_PROBLEM_P, open_problems, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
        if (pcase_var.eql((SubLObject)inference_worker.ONE_INTEGER)) {
            return list_utilities.find_if_not((SubLObject)inference_worker.$sym219$TACTICALLY_FINISHED_PROBLEM_P, open_problems, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED, (SubLObject)inference_worker.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)inference_worker.ZERO_INTEGER)) {
            return open_problems.first();
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 246086L)
    public static SubLObject note_and_propagate_proof_keeping_problem(final SubLObject problem, final SubLObject reason) {
        return note_and_propagate_proof_keeping_problem_recursive(problem, reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker.lisp", position = 246238L)
    public static SubLObject note_and_propagate_proof_keeping_problem_recursive(final SubLObject problem, final SubLObject reason) {
        if (inference_worker.NIL == inference_datastructures_problem_store.proof_keeping_problemP(problem)) {
            inference_datastructures_problem_store.note_proof_keeping_problem(problem, reason);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject link_var;
            SubLObject cdolist_list_var;
            SubLObject supporting_mapped_problem;
            SubLObject supporting_problem;
            SubLObject variable_map;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (inference_worker.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    link_var = link;
                    cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                    supporting_mapped_problem = (SubLObject)inference_worker.NIL;
                    supporting_mapped_problem = cdolist_list_var.first();
                    while (inference_worker.NIL != cdolist_list_var) {
                        if (inference_worker.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker.NIL, link_var, supporting_mapped_problem)) {
                            supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
                            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
                            note_and_propagate_proof_keeping_problem_recursive(supporting_problem, reason);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        supporting_mapped_problem = cdolist_list_var.first();
                    }
                }
            }
        }
        return (SubLObject)inference_worker.NIL;
    }
    
    public static SubLObject declare_inference_worker_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_considered_tactic", "CURRENTLY-CONSIDERED-TACTIC", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "within_tactic_consideration", "WITHIN-TACTIC-CONSIDERATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_executing_tactic", "CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_executing_tactics", "CURRENTLY-EXECUTING-TACTICS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "within_tactic_execution", "WITHIN-TACTIC-EXECUTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_executing_hl_module", "CURRENTLY-EXECUTING-HL-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_active_problem", "CURRENTLY-ACTIVE-PROBLEM", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "within_problem_consideration", "WITHIN-PROBLEM-CONSIDERATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_active_problem_query", "CURRENTLY-ACTIVE-PROBLEM-QUERY", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "with_problem_store_tactical_evaluation_properties", "WITH-PROBLEM-STORE-TACTICAL-EVALUATION-PROPERTIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_active_problem_store", "CURRENTLY-ACTIVE-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "currently_active_problem_store_creation_time", "CURRENTLY-ACTIVE-PROBLEM-STORE-CREATION-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_tactics", "DETERMINE-NEW-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_tactics_for_dnf_clause", "DETERMINE-NEW-TACTICS-FOR-DNF-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_tactics_for_disjunction", "DETERMINE-NEW-TACTICS-FOR-DISJUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_tactics_for_multiple_literals", "DETERMINE-NEW-TACTICS-FOR-MULTIPLE-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_connected_conjunction_tactics", "DETERMINE-NEW-CONNECTED-CONJUNCTION-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_a_complete_conjunctive_removal_tacticP", "PROBLEM-HAS-A-COMPLETE-CONJUNCTIVE-REMOVAL-TACTIC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_new_tactics_for_literal", "DETERMINE-NEW-TACTICS-FOR-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_compute_strategic_properties_of_problem_tactics", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategy_compute_strategic_properties_of_problem_tactics", "STRATEGY-COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_strategic_properties_of_problem_tactics", "COMPUTE-STRATEGIC-PROPERTIES-OF-PROBLEM-TACTICS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_compute_strategic_properties_of_tactic", "POSSIBLY-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategy_chooses_not_to_examine_tacticP", "STRATEGY-CHOOSES-NOT-TO-EXAMINE-TACTIC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "default_compute_strategic_properties_of_tactic", "DEFAULT-COMPUTE-STRATEGIC-PROPERTIES-OF-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_tactic", "EXECUTE-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_execute_tactic", "POSSIBLY-EXECUTE-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_tactic_finished", "POSSIBLY-NOTE-TACTIC-FINISHED", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "within_single_literal_tactic_with_asent_and_mt", "WITHIN-SINGLE-LITERAL-TACTIC-WITH-ASENT-AND-MT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "asent_of_currently_executing_tactic", "ASENT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "mt_of_currently_executing_tactic", "MT-OF-CURRENTLY-EXECUTING-TACTIC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "single_literal_tactic_p", "SINGLE-LITERAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_literal_level_tactic", "EXECUTE-LITERAL-LEVEL-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "literal_level_tactic_p", "LITERAL-LEVEL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_multiple_clause_tactic", "EXECUTE-MULTIPLE-CLAUSE-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_multiple_literal_tactic", "EXECUTE-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_structural_multiple_literal_tactic", "EXECUTE-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "execute_meta_structural_multiple_literal_tactic", "EXECUTE-META-STRUCTURAL-MULTIPLE-LITERAL-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_link_p", "CONNECTED-CONJUNCTION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_tactic_p", "CONNECTED-CONJUNCTION-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_link_tactic", "CONNECTED-CONJUNCTION-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_tactic_link", "CONNECTED-CONJUNCTION-TACTIC-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "conjunctive_link_p", "CONJUNCTIVE-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_conjunctive_tactic_p", "LOGICAL-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "conjunctive_tactic_p", "CONJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "meta_conjunctive_tactic_p", "META-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "generalized_conjunctive_tactic_p", "GENERALIZED-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "generalized_logical_conjunctive_tactic_p", "GENERALIZED-LOGICAL-CONJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_tactic_literals_score", "CONNECTED-CONJUNCTION-TACTIC-LITERALS-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "disjunctive_link_p", "DISJUNCTIVE-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_disjunctive_tactic_p", "LOGICAL-DISJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "disjunctive_tactic_p", "DISJUNCTIVE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "disjunctive_link_tactic", "DISJUNCTIVE-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_link_p", "LOGICAL-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_p", "LOGICAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_link_with_unique_tactic_p", "LOGICAL-LINK-WITH-UNIQUE-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_with_unique_lookahead_problem_p", "LOGICAL-TACTIC-WITH-UNIQUE-LOOKAHEAD-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_link_unique_tactic", "LOGICAL-LINK-UNIQUE-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_link", "LOGICAL-TACTIC-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_lookahead_problem", "LOGICAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_proof_p", "LOGICAL-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "structural_link_p", "STRUCTURAL-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "structural_tactic_p", "STRUCTURAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "meta_structural_tactic_p", "META-STRUCTURAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "generalized_structural_tactic_p", "GENERALIZED-STRUCTURAL-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "structural_tactic_lookahead_problem", "STRUCTURAL-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "structural_proof_p", "STRUCTURAL-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "structural_proof_type", "STRUCTURAL-PROOF-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_link_p", "CONTENT-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_tactic_p", "CONTENT-TACTIC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_proof_p", "CONTENT-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_link_supports", "CONTENT-LINK-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_link_tactic", "CONTENT-LINK-TACTIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_link_hl_module", "CONTENT-LINK-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_proof_hl_module", "CONTENT-PROOF-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "content_tactic_actual_productivity", "CONTENT-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "removal_tactic_actual_productivity", "REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "single_literal_removal_tactic_actual_productivity", "SINGLE-LITERAL-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "conjunctive_removal_tactic_actual_productivity", "CONJUNCTIVE-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "transformation_tactic_actual_productivity", "TRANSFORMATION-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "rewrite_tactic_actual_productivity", "REWRITE-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "meta_removal_tactic_actual_productivity", "META-REMOVAL-TACTIC-ACTUAL-PRODUCTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "simple_problem_estimated_total_global_productivity", "SIMPLE-PROBLEM-ESTIMATED-TOTAL-GLOBAL-PRODUCTIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_productivity_of_problem_possible_tactics", "ESTIMATED-GLOBAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_generalized_removal_productivity_of_problem_possible_tactics_with_completeness", "ESTIMATED-GENERALIZED-REMOVAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-COMPLETENESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_structural_productivity_of_problem_possible_tactics_with_preference_level", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-TACTICS-WITH-PREFERENCE-LEVEL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_structural_productivity_of_problem_possible_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-PREFERRED-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_structural_productivity_of_problem_possible_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-DISPREFERRED-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_structural_productivity_of_problem_possible_grossly_dispreferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-GROSSLY-DISPREFERRED-TACTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "estimated_global_structural_productivity_of_problem_possible_non_preferred_tactics", "ESTIMATED-GLOBAL-STRUCTURAL-PRODUCTIVITY-OF-PROBLEM-POSSIBLE-NON-PREFERRED-TACTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_doomed_due_to_lookahead_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-LOOKAHEAD-REMOVAL-COMPLETENESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_doomed_due_to_removal_completenessP", "PROBLEM-DOOMED-DUE-TO-REMOVAL-COMPLETENESS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_structural_preference_level", "PROBLEM-STRUCTURAL-PREFERENCE-LEVEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_link_generalized_removal_completeness", "LOGICAL-LINK-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_generalized_removal_completeness", "LOGICAL-TACTIC-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_generalized_removal_completeness", "PROBLEM-GENERALIZED-REMOVAL-COMPLETENESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_preference_level_int", "PROBLEM-PREFERENCE-LEVEL-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "discard_all_other_possible_connected_conjunction_tactics", "DISCARD-ALL-OTHER-POSSIBLE-CONNECTED-CONJUNCTION-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_discard_all_other_possible_structural_conjunctive_tactics", "POSSIBLY-DISCARD-ALL-OTHER-POSSIBLE-STRUCTURAL-CONJUNCTIVE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "discard_all_other_possible_structural_conjunctive_tactics", "DISCARD-ALL-OTHER-POSSIBLE-STRUCTURAL-CONJUNCTIVE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_can_have_proofsP", "PROBLEM-LINK-CAN-HAVE-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_step_valid_memoizedP_internal", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_step_valid_memoizedP", "INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_step_validP", "INTERMEDIATE-PROOF-STEP-VALID?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_validP", "INTERMEDIATE-PROOF-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_valid_intP", "INTERMEDIATE-PROOF-VALID-INT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_asent_validP", "INTERMEDIATE-PROOF-ASENT-VALID?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_valid_due_to_structureP", "INTERMEDIATE-PROOF-VALID-DUE-TO-STRUCTURE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_supports_validP", "INTERMEDIATE-PROOF-SUPPORTS-VALID?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "intermediate_proof_content_link_validP", "INTERMEDIATE-PROOF-CONTENT-LINK-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propose_new_proof_with_bindings", "PROPOSE-NEW-PROOF-WITH-BINDINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_propagate_non_explananatory_subproofs", "PROOF-PROPAGATE-NON-EXPLANANATORY-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_circularP", "PROOF-CIRCULAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_circular_wrtP", "PROOF-CIRCULAR-WRT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proofs_share_problem_and_bindingsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proofs_share_problem_and_bindings_and_direct_supportsP", "PROOFS-SHARE-PROBLEM-AND-BINDINGS-AND-DIRECT-SUPPORTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof_due_to_circularity", "REJECT-PROOF-DUE-TO-CIRCULARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof_due_to_ill_formedness", "REJECT-PROOF-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof_due_to_non_abducible_rule", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof_due_to_modus_tollens_with_non_wff", "REJECT-PROOF-DUE-TO-MODUS-TOLLENS-WITH-NON-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof", "REJECT-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_rejected", "PROPAGATE-PROOF-REJECTED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_note_proven_query_no_good_due_to_ill_formedness", "PROOF-NOTE-PROVEN-QUERY-NO-GOOD-DUE-TO-ILL-FORMEDNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_force_no_goodness", "PROBLEM-FORCE-NO-GOODNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_proof_processed", "POSSIBLY-NOTE-PROOF-PROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_proof_processed_int", "POSSIBLY-NOTE-PROOF-PROCESSED-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_subproofs_may_be_unprocessed", "CONSIDER-THAT-SUBPROOFS-MAY-BE-UNPROCESSED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_dependent_proofs_are_processedP", "ALL-DEPENDENT-PROOFS-ARE-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_proof", "FIND-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "conjunctive_proof_subsumes_conjunctive_proof_specP", "CONJUNCTIVE-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "connected_conjunction_proof_subsumes_connected_conjunction_proof_specP", "CONNECTED-CONJUNCTION-PROOF-SUBSUMES-CONNECTED-CONJUNCTION-PROOF-SPEC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "split_proof_subsumes_split_proof_specP", "SPLIT-PROOF-SUBSUMES-SPLIT-PROOF-SPEC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "residual_transformation_proof_subsumes_conjunctive_proof_specP", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "residual_transformation_proof_subsumes_conjunctive_proof_specP_int", "RESIDUAL-TRANSFORMATION-PROOF-SUBSUMES-CONJUNCTIVE-PROOF-SPEC?-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "new_goal_proof", "NEW-GOAL-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_proven_query", "PROOF-PROVEN-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_proven_sentence", "PROOF-PROVEN-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_bindings_from_constituents", "PROOF-BINDINGS-FROM-CONSTITUENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "ncanonicalize_proof_bindings_int", "NCANONICALIZE-PROOF-BINDINGS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "ncanonicalize_proof_bindings", "NCANONICALIZE-PROOF-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "canonicalize_proof_bindings", "CANONICALIZE-PROOF-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_bindings_canonicalP", "PROOF-BINDINGS-CANONICAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_bindings_canonicalP_recursive", "PROOF-BINDINGS-CANONICAL?-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_bindings_equalP", "PROOF-BINDINGS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "unify_all_equal_bindings", "UNIFY-ALL-EQUAL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "two_values_in_bindings_with_same_variable", "TWO-VALUES-IN-BINDINGS-WITH-SAME-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_bindings_ground_outP", "ALL-BINDINGS-GROUND-OUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "binding_ground_outP", "BINDING-GROUND-OUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "bubble_up_proof", "BUBBLE-UP-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "bubble_up_proof_from_problem", "BUBBLE-UP-PROOF-FROM-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "bubble_up_proof_to_link", "BUBBLE-UP-PROOF-TO-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "bubble_up_proof_to_link_via_mapped_problem", "BUBBLE-UP-PROOF-TO-LINK-VIA-MAPPED-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "bubble_up_proof_to_link_via_variable_map", "BUBBLE-UP-PROOF-TO-LINK-VIA-VARIABLE-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "perform_lazy_proof_rejection", "PERFORM-LAZY-PROOF-REJECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_consistent_with_mt_assumptionsP", "PROOF-CONSISTENT-WITH-MT-ASSUMPTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "within_abnormality_checkingP", "WITHIN-ABNORMALITY-CHECKING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_abnormal_subproofs", "REJECT-ABNORMAL-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "reject_proof_due_to_abnormality", "REJECT-PROOF-DUE-TO-ABNORMALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "inference_proof_non_explanatory_subproofs", "INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "cached_inference_proof_non_explanatory_subproofs_internal", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "cached_inference_proof_non_explanatory_subproofs", "CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_non_explanatory_subproofs", "PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_generalized_transformation_proof_non_explanatory_subproofs", "COMPUTE-GENERALIZED-TRANSFORMATION-PROOF-NON-EXPLANATORY-SUBPROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "inference_proof_proven_non_explanatory_subquery", "INFERENCE-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "generalized_transformation_proof_proven_non_explanatory_subquery", "GENERALIZED-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "transformation_proof_proven_non_explanatory_subquery", "TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "residual_transformation_proof_proven_non_explanatory_subquery", "RESIDUAL-TRANSFORMATION-PROOF-PROVEN-NON-EXPLANATORY-SUBQUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_non_explanatory_subproofs", "COMPUTE-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "non_explanatory_subproofs_recursive", "NON-EXPLANATORY-SUBPROOFS-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "non_explanatory_proofP", "NON-EXPLANATORY-PROOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "non_explanatory_asentP", "NON-EXPLANATORY-ASENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "explanatory_asentP", "EXPLANATORY-ASENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_tactic_finished", "NOTE-TACTIC-FINISHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_strategic_ramifications_of_possibly_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-POSSIBLY-EXECUTED-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_strategic_ramifications_of_executed_tactic", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-EXECUTED-TACTIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_created", "NOTE-PROBLEM-CREATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_reactivate_problem", "POSSIBLY-REACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_activate_problem", "POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "determine_strategic_status_wrt", "DETERMINE-STRATEGIC-STATUS-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_examined", "NOTE-PROBLEM-EXAMINED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_strategically_examined", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-EXAMINED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_possible", "NOTE-PROBLEM-POSSIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_strategically_possible", "POSSIBLY-NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_strategically_unexamined", "NOTE-PROBLEM-STRATEGICALLY-UNEXAMINED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_strategically_possible", "NOTE-PROBLEM-STRATEGICALLY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_pending", "POSSIBLY-NOTE-PROBLEM-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_pending", "NOTE-PROBLEM-PENDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_finished", "POSSIBLY-NOTE-PROBLEM-FINISHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_finished", "NOTE-PROBLEM-FINISHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_ramifications_of_problem_finished", "CONSIDER-RAMIFICATIONS-OF-PROBLEM-FINISHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_propagate_problem_finished", "POSSIBLY-PROPAGATE-PROBLEM-FINISHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategy_note_problem_finished", "STRATEGY-NOTE-PROBLEM-FINISHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_argument_link_added", "NOTE-ARGUMENT-LINK-ADDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_goal_link_added", "NOTE-GOAL-LINK-ADDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategic_context_p", "STRATEGIC-CONTEXT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategic_context_suid", "STRATEGIC-CONTEXT-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_strategic_context_by_id", "FIND-STRATEGIC-CONTEXT-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_strategic_context_by_ids", "FIND-STRATEGIC-CONTEXT-BY-IDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategic_context_may_modify_its_problem_storeP", "STRATEGIC-CONTEXT-MAY-MODIFY-ITS-PROBLEM-STORE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "no_good_problem_p", "NO-GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "neutral_problem_p", "NEUTRAL-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "good_problem_p", "GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "examined_problem_p", "EXAMINED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possible_problem_p", "POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "pending_problem_p", "PENDING-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "finished_problem_p", "FINISHED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "potentially_possible_problem_p", "POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "not_potentially_possible_problem_p", "NOT-POTENTIALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "totally_finished_problem_p", "TOTALLY-FINISHED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_problem_link", "PROPAGATE-PROBLEM-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proofs", "PROPAGATE-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "repropagate_newly_opened_link", "REPROPAGATE-NEWLY-OPENED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_open_and_repropagate_sole_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SOLE-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_open_and_repropagate_index", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_open_and_repropagate_supporting_mapped_problem", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_open_and_repropagate_all", "PROBLEM-LINK-OPEN-AND-REPROPAGATE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_answer_link", "PROPAGATE-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_propagate_answer_link", "POSSIBLY-PROPAGATE-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_to_inference", "PROPAGATE-PROOF-TO-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_closing_answer_link", "CONSIDER-CLOSING-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "inference_deems_answer_link_should_be_closedP", "INFERENCE-DEEMS-ANSWER-LINK-SHOULD-BE-CLOSED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "close_answer_link", "CLOSE-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_tree_validP", "PROOF-TREE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "recursive_proof_tree_validP", "RECURSIVE-PROOF-TREE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "depth_L", "DEPTH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "depth_LE", "DEPTH-<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_min_proof_depth_via_link", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_min_proof_depth_via_link_wrt_inference", "PROPAGATE-MIN-PROOF-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_depth_L", "PROOF-DEPTH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_strictly_within_max_proof_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-PROOF-DEPTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_min_transformation_depth_via_link", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_min_transformation_depth_via_link_wrt_inference", "PROPAGATE-MIN-TRANSFORMATION-DEPTH-VIA-LINK-WRT-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "clear_uninterestingness_cache_wrt_transformation", "CLEAR-UNINTERESTINGNESS-CACHE-WRT-TRANSFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "transformation_depth_L", "TRANSFORMATION-DEPTH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "transformation_depth_LE", "TRANSFORMATION-DEPTH-<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_strictly_within_max_transformation_depthP", "PROBLEM-STRICTLY-WITHIN-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_transformation_allowed_wrt_max_transformation_depthP", "PROBLEM-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "logical_tactic_transformation_allowed_wrt_max_transformation_depthP", "LOGICAL-TACTIC-TRANSFORMATION-ALLOWED-WRT-MAX-TRANSFORMATION-DEPTH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "transformation_depth_increment", "TRANSFORMATION-DEPTH-INCREMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_been_transformedP", "PROBLEM-HAS-BEEN-TRANSFORMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_strategy_activity", "PROPAGATE-STRATEGY-ACTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "maybe_possibly_activate_problem", "MAYBE-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_permits_activity_propagationP", "LINK-PERMITS-ACTIVITY-PROPAGATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_inference_relevance", "PROPAGATE-INFERENCE-RELEVANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_relevance_to_supporting_problem", "PROPAGATE-RELEVANCE-TO-SUPPORTING-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_relevant", "POSSIBLY-NOTE-PROBLEM-RELEVANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_permits_relevance_propagationP", "LINK-PERMITS-RELEVANCE-PROPAGATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_permits_proof_propagationP", "LINK-PERMITS-PROOF-PROPAGATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_mapped_problem_could_be_irrelevant", "CONSIDER-THAT-MAPPED-PROBLEM-COULD-BE-IRRELEVANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_irrelevant_to_inference", "CONSIDER-THAT-PROBLEM-COULD-BE-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_irrelevant_to_inferenceP", "PROBLEM-IRRELEVANT-TO-INFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "maybe_make_problem_irrelevant_to_inference", "MAYBE-MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "make_problem_irrelevant_to_inference", "MAKE-PROBLEM-IRRELEVANT-TO-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_inference_irrelevance", "PROPAGATE-INFERENCE-IRRELEVANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_raw_tactical_or_strategic_status", "PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "set_problem_raw_tactical_or_strategic_status", "SET-PROBLEM-RAW-TACTICAL-OR-STRATEGIC-STATUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "change_and_propagate_problem_status", "CHANGE-AND-PROPAGATE-PROBLEM-STATUS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "change_and_propagate_problem_status_int", "CHANGE-AND-PROPAGATE-PROBLEM-STATUS-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "set_problem_raw_status_if_strategic", "SET-PROBLEM-RAW-STATUS-IF-STRATEGIC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prohibited_problem_status_change_error", "PROHIBITED-PROBLEM-STATUS-CHANGE-ERROR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_good", "CONSIDER-THAT-PROBLEM-COULD-BE-GOOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_goodP", "PROBLEM-GOOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "good_version_of_problem_status", "GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "unexamined_version_of_problem_status", "UNEXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "examined_version_of_problem_status", "EXAMINED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possible_version_of_problem_status", "POSSIBLE-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "pending_version_of_problem_status", "PENDING-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "finished_version_of_problem_status", "FINISHED-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_no_longer_be_good", "CONSIDER-THAT-PROBLEM-COULD-NO-LONGER-BE-GOOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_finished", "CONSIDER-THAT-PROBLEM-COULD-BE-FINISHED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_could_be_finishedP", "PROBLEM-COULD-BE-FINISHED?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_openableP", "PROBLEM-LINK-OPENABLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_could_be_finishedP", "PROBLEM-LINK-COULD-BE-FINISHED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "split_link_could_be_finishedP", "SPLIT-LINK-COULD-BE-FINISHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "join_link_could_be_finishedP", "JOIN-LINK-COULD-BE-FINISHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "union_link_could_be_finishedP", "UNION-LINK-COULD-BE-FINISHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_no_good", "CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "default_consider_that_problem_could_be_no_good", "DEFAULT-CONSIDER-THAT-PROBLEM-COULD-BE-NO-GOOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_tactic_doomed", "NOTE-TACTIC-DOOMED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "make_problem_no_good", "MAKE-PROBLEM-NO-GOOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "discard_all_possible_tactics", "DISCARD-ALL-POSSIBLE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "discard_all_impossible_possible_tactics", "DISCARD-ALL-IMPOSSIBLE-POSSIBLE-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "discard_possible_tactics_int", "DISCARD-POSSIBLE-TACTICS-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_strategically_pending", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_problem_could_be_strategically_pending_wrt", "CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-PENDING-WRT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_that_supported_problems_could_be_no_good", "CONSIDER-THAT-SUPPORTED-PROBLEMS-COULD-BE-NO-GOOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "no_good_version_of_problem_status", "NO-GOOD-VERSION-OF-PROBLEM-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "unsatisfiable_problemP", "UNSATISFIABLE-PROBLEM?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_doomedP", "PROBLEM-DOOMED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_shared_vars_that_are_actually_bindable", "COMPUTE-SHARED-VARS-THAT-ARE-ACTUALLY-BINDABLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "shared_var_actually_bindableP", "SHARED-VAR-ACTUALLY-BINDABLE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "join_ordered_tactic_has_a_chance_at_binding_varP", "JOIN-ORDERED-TACTIC-HAS-A-CHANCE-AT-BINDING-VAR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_no_good_simplification_linksP", "ALL-NO-GOOD-SIMPLIFICATION-LINKS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_some_open_obviously_neutral_argument_linkP", "PROBLEM-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-ARGUMENT-LINK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "some_no_good_split_argument_linkP", "SOME-NO-GOOD-SPLIT-ARGUMENT-LINK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "some_no_good_preferred_join_ordered_argument_linkP", "SOME-NO-GOOD-PREFERRED-JOIN-ORDERED-ARGUMENT-LINK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "some_no_good_join_argument_linkP", "SOME-NO-GOOD-JOIN-ARGUMENT-LINK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_no_good_union_argument_linksP", "ALL-NO-GOOD-UNION-ARGUMENT-LINKS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_no_goodP", "PROBLEM-LINK-NO-GOOD?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "unsatisfiable_problem_ignoring_transformation_tacticsP", "UNSATISFIABLE-PROBLEM-IGNORING-TRANSFORMATION-TACTICS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_has_some_open_obviously_neutral_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-NEUTRAL-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_has_some_open_obviously_good_supporting_mapped_problemP", "PROBLEM-LINK-HAS-SOME-OPEN-OBVIOUSLY-GOOD-SUPPORTING-MAPPED-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_interesting_when_considered_deepP", "PROBLEM-LINK-INTERESTING-WHEN-CONSIDERED-DEEP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "restricted_focal_problem_has_a_no_good_restricted_non_focal_analogueP", "RESTRICTED-FOCAL-PROBLEM-HAS-A-NO-GOOD-RESTRICTED-NON-FOCAL-ANALOGUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_no_good_wrt_dependent_join_ordered_linkP", "PROBLEM-LINK-NO-GOOD-WRT-DEPENDENT-JOIN-ORDERED-LINK?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_permits_no_good_propagation_to_supported_problemsP", "LINK-PERMITS-NO-GOOD-PROPAGATION-TO-SUPPORTED-PROBLEMS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_answer_link", "PROPAGATE-PROOF-SPEC-VIA-ANSWER-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec", "PROPAGATE-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_some_proof_spec_to_propagateP", "PROBLEM-HAS-SOME-PROOF-SPEC-TO-PROPAGATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_to_supporting_problem_via_link", "PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_worker", "with_proof_spec_of_appropriate_type", "WITH-PROOF-SPEC-OF-APPROPRIATE-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategy_propagate_proof_spec_to_supporting_problem_via_link", "STRATEGY-PROPAGATE-PROOF-SPEC-TO-SUPPORTING-PROBLEM-VIA-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_permits_proof_spec_propagationP", "LINK-PERMITS-PROOF-SPEC-PROPAGATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_spec_of_appropriate_typeP", "PROOF-SPEC-OF-APPROPRIATE-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "strategy_propagate_problem_proof_spec", "STRATEGY-PROPAGATE-PROBLEM-PROOF-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_join_ordered_proof_spec_via_join_ordered_link", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_join_ordered_proof_spec_via_join_ordered_link_int", "PROPAGATE-JOIN-ORDERED-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_union_link", "PROPAGATE-PROOF-SPEC-VIA-UNION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_residual_transformation_proof_spec_via_join_ordered_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_residual_transformation_proof_spec_via_join_ordered_link_int", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-JOIN-ORDERED-LINK-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_restriction_link", "PROPAGATE-PROOF-SPEC-VIA-RESTRICTION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_split_link", "PROPAGATE-PROOF-SPEC-VIA-SPLIT-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_join_link", "PROPAGATE-PROOF-SPEC-VIA-JOIN-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_conjunctive_link", "PROPAGATE-PROOF-SPEC-VIA-CONJUNCTIVE-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_simplification_link", "PROPAGATE-PROOF-SPEC-VIA-SIMPLIFICATION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_transformation_proof_spec_via_transformation_link", "PROPAGATE-TRANSFORMATION-PROOF-SPEC-VIA-TRANSFORMATION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_spec_via_residual_transformation_link", "PROPAGATE-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_residual_transformation_proof_spec_via_residual_transformation_link", "PROPAGATE-RESIDUAL-TRANSFORMATION-PROOF-SPEC-VIA-RESIDUAL-TRANSFORMATION-LINK", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_problem", "FIND-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_problem", "FIND-OR-CREATE-PROBLEM", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_problem_int", "FIND-PROBLEM-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_problem_from_contextualized_asent_sense", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-ASENT-SENSE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_problem_from_contextualized_clause", "FIND-OR-CREATE-PROBLEM-FROM-CONTEXTUALIZED-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_problem_from_subclause_spec", "FIND-OR-CREATE-PROBLEM-FROM-SUBCLAUSE-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_problem_without_subclause_spec", "FIND-OR-CREATE-PROBLEM-WITHOUT-SUBCLAUSE-SPEC", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_root_problem_and_link", "FIND-OR-CREATE-ROOT-PROBLEM-AND-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "new_root_answer_link", "NEW-ROOT-ANSWER-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "find_or_create_root_problem", "FIND-OR-CREATE-ROOT-PROBLEM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_problem_store", "PRUNE-PROBLEM-STORE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "destroy_discarded_tactics", "DESTROY-DISCARDED-TACTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "tactic_thrown_away_and_privateP", "TACTIC-THROWN-AWAY-AND-PRIVATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "destroy_destructible_problems", "DESTROY-DESTRUCTIBLE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "recompute_destructible_problems", "RECOMPUTE-DESTRUCTIBLE-PROBLEMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_deep_no_goodness", "CONSIDER-DEEP-NO-GOODNESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_problem_store_min_depth_index", "COMPUTE-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_indestructible_problems_from_inferences", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-FROM-INFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_propagate_problem_indestructible", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_propagate_problem_indestructible_int", "POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_problem_indestructible", "POSSIBLY-NOTE-PROBLEM-INDESTRUCTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_problem_link_destructibleP", "COMPUTE-PROBLEM-LINK-DESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_closed_foreverP", "PROBLEM-LINK-CLOSED-FOREVER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_link_closed_forever_wrt_supporting_mapped_problemP", "PROBLEM-LINK-CLOSED-FOREVER-WRT-SUPPORTING-MAPPED-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_should_be_indestructibleP", "PROBLEM-SHOULD-BE-INDESTRUCTIBLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "variant_problemP", "VARIANT-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_janitor_destructible_problem_list", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_all_root_problems_indestructible", "NOTE-ALL-ROOT-PROBLEMS-INDESTRUCTIBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_indestructible_problems_due_to_proofs", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "propagate_proof_indestructibility", "PROPAGATE-PROOF-INDESTRUCTIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_indestructible_problems_due_to_strategic_activity", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-STRATEGIC-ACTIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_indestructible_problems_due_to_potentially_useful_transformation_link", "COMPUTE-INDESTRUCTIBLE-PROBLEMS-DUE-TO-POTENTIALLY-USEFUL-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_prune_processed_problems", "POSSIBLY-PRUNE-PROCESSED-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_prune_wrt_conjunctive_removal", "POSSIBLY-PRUNE-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_objects_wrt_conjunctive_removal", "PRUNABLE-OBJECTS-WRT-CONJUNCTIVE-REMOVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "update_prunable_conjunctive_removal_objects", "UPDATE-PRUNABLE-CONJUNCTIVE-REMOVAL-OBJECTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_conjunctive_removal_proof_tuples", "COMPUTE-CONJUNCTIVE-REMOVAL-PROOF-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "isolated_problem_subset", "ISOLATED-PROBLEM-SUBSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_isolated_wrt_problemsP", "PROBLEM-ISOLATED-WRT-PROBLEMS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "finished_problem_subset", "FINISHED-PROBLEM-SUBSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_note_eager_pruning_problem", "POSSIBLY-NOTE-EAGER-PRUNING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_prune_processed_proofs", "POSSIBLY-PRUNE-PROCESSED-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_all_processed_objects", "PROBLEM-STORE-ALL-PROCESSED-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_processedP", "PROBLEM-PROCESSED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_processedP", "LINK-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_prune_processed_object", "POSSIBLY-PRUNE-PROCESSED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_is_the_root_problem_of_some_inferenceP", "PROBLEM-IS-THE-ROOT-PROBLEM-OF-SOME-INFERENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "consider_pruning_ramifications_of_ignored_strategem", "CONSIDER-PRUNING-RAMIFICATIONS-OF-IGNORED-STRATEGEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_processed_problemP", "PRUNABLE-PROCESSED-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_dependent_proofs_have_siblingsP", "ALL-DEPENDENT-PROOFS-HAVE-SIBLINGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_dependent_proofs_have_siblings_int", "ALL-DEPENDENT-PROOFS-HAVE-SIBLINGS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "restricted_non_focal_with_siblingP", "RESTRICTED-NON-FOCAL-WITH-SIBLING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "restricted_focal_with_siblingP", "RESTRICTED-FOCAL-WITH-SIBLING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "corresponding_restricted_non_focal_unfinishedP", "CORRESPONDING-RESTRICTED-NON-FOCAL-UNFINISHED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_processed_linkP", "PRUNABLE-PROCESSED-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_is_reused_interestinglyP", "PROBLEM-IS-REUSED-INTERESTINGLY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "link_has_all_the_proofsP", "LINK-HAS-ALL-THE-PROOFS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "join_ordered_link_restricted_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-FOCAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "join_ordered_link_restricted_focal_countGE", "JOIN-ORDERED-LINK-RESTRICTED-FOCAL-COUNT>=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_problem_proofs_are_processedP", "ALL-PROBLEM-PROOFS-ARE-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_link_proofs_are_processedP", "ALL-LINK-PROOFS-ARE-PROCESSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_no_motivation_other_than_removalP", "PROBLEM-HAS-NO-MOTIVATION-OTHER-THAN-REMOVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_finished_wrt_removalP", "PROBLEM-FINISHED-WRT-REMOVAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_removal_strategies", "PROBLEM-STORE-REMOVAL-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_is_a_new_rootP", "PROBLEM-IS-A-NEW-ROOT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_new_root_strategies", "PROBLEM-STORE-NEW-ROOT-STRATEGIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_problem_dirty", "NOTE-PROBLEM-DIRTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_cleanP", "PROBLEM-CLEAN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_any_new_root_motivationP", "PROBLEM-HAS-ANY-NEW-ROOT-MOTIVATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_any_transformation_motivationP", "PROBLEM-HAS-ANY-TRANSFORMATION-MOTIVATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_has_any_removal_motivationP", "PROBLEM-HAS-ANY-REMOVAL-MOTIVATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_possibly_redundant_proof_sets", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_all_possibly_redundant_proofs", "PROBLEM-STORE-ALL-POSSIBLY-REDUNDANT-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_possibly_redundant_proof_count", "PROBLEM-STORE-POSSIBLY-REDUNDANT-PROOF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "possibly_prune_proof_tree", "POSSIBLY-PRUNE-PROOF-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_root_proofs", "COMPUTE-ROOT-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "direct_dependent_proofs_including_split_restrictions", "DIRECT-DEPENDENT-PROOFS-INCLUDING-SPLIT-RESTRICTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_triggered_restricted_non_focal_links", "ALL-TRIGGERED-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "proof_prunableP", "PROOF-PRUNABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_starting_from_root_proofs", "PRUNE-STARTING-FROM-ROOT-PROOFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_entire_problem_store", "PRUNE-ENTIRE-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_problem_store_below", "PRUNE-PROBLEM-STORE-BELOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "all_problem_store_objects_below", "ALL-PROBLEM-STORE-OBJECTS-BELOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "add_all_problem_store_objects_below_recursive", "ADD-ALL-PROBLEM-STORE-OBJECTS-BELOW-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_problem_store_objects", "PRUNE-PROBLEM-STORE-OBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_problem_store_objectP", "PRUNABLE-PROBLEM-STORE-OBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_problemP", "PRUNABLE-PROBLEM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prunable_problem_linkP", "PRUNABLE-PROBLEM-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_not_in_progress_wrt_removalP", "PROBLEM-NOT-IN-PROGRESS-WRT-REMOVAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "prune_problem_store_object", "PRUNE-PROBLEM-STORE-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "problem_store_compute_proof_keeping_problems", "PROBLEM-STORE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "inference_compute_proof_keeping_problems", "INFERENCE-COMPUTE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_proof_keeping_problems_recursive", "COMPUTE-PROOF-KEEPING-PROBLEMS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "compute_proof_keeping_links_recursive", "COMPUTE-PROOF-KEEPING-LINKS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "cartesian_split_linkP", "CARTESIAN-SPLIT-LINK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "choose_split_link_non_proof_keeping_problem", "CHOOSE-SPLIT-LINK-NON-PROOF-KEEPING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_and_propagate_proof_keeping_problem", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker", "note_and_propagate_proof_keeping_problem_recursive", "NOTE-AND-PROPAGATE-PROOF-KEEPING-PROBLEM-RECURSIVE", 2, 0, false);
        return (SubLObject)inference_worker.NIL;
    }
    
    public static SubLObject init_inference_worker_file() {
        inference_worker.$currently_considered_tactic$ = SubLFiles.defparameter("*CURRENTLY-CONSIDERED-TACTIC*", (SubLObject)inference_worker.NIL);
        inference_worker.$currently_executing_tactics$ = SubLFiles.defparameter("*CURRENTLY-EXECUTING-TACTICS*", (SubLObject)inference_worker.NIL);
        inference_worker.$currently_active_problem$ = SubLFiles.defparameter("*CURRENTLY-ACTIVE-PROBLEM*", (SubLObject)inference_worker.NIL);
        inference_worker.$currently_active_problem_store$ = SubLFiles.defparameter("*CURRENTLY-ACTIVE-PROBLEM-STORE*", (SubLObject)inference_worker.NIL);
        inference_worker.$asent_of_currently_executing_tactic$ = SubLFiles.defparameter("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*", (SubLObject)inference_worker.NIL);
        inference_worker.$mt_of_currently_executing_tactic$ = SubLFiles.defparameter("*MT-OF-CURRENTLY-EXECUTING-TACTIC*", (SubLObject)inference_worker.NIL);
        inference_worker.$consider_variable_count_of_focal_problems_for_tactic_literals_score_method$ = SubLFiles.defparameter("*CONSIDER-VARIABLE-COUNT-OF-FOCAL-PROBLEMS-FOR-TACTIC-LITERALS-SCORE-METHOD*", (SubLObject)inference_worker.$kw50$EXPONENTIAL);
        inference_worker.$eager_proof_validationP$ = SubLFiles.defparameter("*EAGER-PROOF-VALIDATION?*", (SubLObject)inference_worker.NIL);
        inference_worker.$proof_circularity_detection_enabledP$ = SubLFiles.defparameter("*PROOF-CIRCULARITY-DETECTION-ENABLED?*", (SubLObject)inference_worker.T);
        inference_worker.$circular_proof_max_depth_cutoff$ = SubLFiles.deflexical("*CIRCULAR-PROOF-MAX-DEPTH-CUTOFF*", (SubLObject)inference_worker.$int101$300);
        inference_worker.$process_motivated_transformation_link_proofsP$ = SubLFiles.defparameter("*PROCESS-MOTIVATED-TRANSFORMATION-LINK-PROOFS?*", (SubLObject)inference_worker.T);
        inference_worker.$find_proof_bindings_optimization_enabledP$ = SubLFiles.defparameter("*FIND-PROOF-BINDINGS-OPTIMIZATION-ENABLED?*", (SubLObject)inference_worker.T);
        inference_worker.$proof_bubbling_depth$ = SubLFiles.defparameter("*PROOF-BUBBLING-DEPTH*", (SubLObject)inference_worker.ZERO_INTEGER);
        inference_worker.$max_proof_bubbling_depth$ = SubLFiles.deflexical("*MAX-PROOF-BUBBLING-DEPTH*", (SubLObject)inference_worker.$int116$100);
        inference_worker.$within_abnormality_checkingP$ = SubLFiles.defparameter("*WITHIN-ABNORMALITY-CHECKING?*", (SubLObject)inference_worker.NIL);
        inference_worker.$disable_link_propagationP$ = SubLFiles.defparameter("*DISABLE-LINK-PROPAGATION?*", (SubLObject)inference_worker.NIL);
        inference_worker.$bubble_up_proofs_through_closed_split_linksP$ = SubLFiles.defparameter("*BUBBLE-UP-PROOFS-THROUGH-CLOSED-SPLIT-LINKS?*", (SubLObject)inference_worker.T);
        inference_worker.$reconsidering_set_asidesP$ = SubLFiles.defparameter("*RECONSIDERING-SET-ASIDES?*", (SubLObject)inference_worker.NIL);
        inference_worker.$always_consider_deepP$ = SubLFiles.defparameter("*ALWAYS-CONSIDER-DEEP?*", (SubLObject)inference_worker.NIL);
        inference_worker.$problem_store_prune_reports$ = SubLFiles.deflexical("*PROBLEM-STORE-PRUNE-REPORTS*", (SubLObject)((inference_worker.NIL != Symbols.boundp((SubLObject)inference_worker.$sym195$_PROBLEM_STORE_PRUNE_REPORTS_)) ? inference_worker.$problem_store_prune_reports$.getGlobalValue() : inference_worker.NIL));
        inference_worker.$possibly_propagate_problem_indestructible_stack$ = SubLFiles.defparameter("*POSSIBLY-PROPAGATE-PROBLEM-INDESTRUCTIBLE-STACK*", (SubLObject)inference_worker.$kw199$UNINITIALIZED);
        inference_worker.$processed_proofs_retain_one_proofP$ = SubLFiles.defparameter("*PROCESSED-PROOFS-RETAIN-ONE-PROOF?*", (SubLObject)inference_worker.T);
        return (SubLObject)inference_worker.NIL;
    }
    
    public static SubLObject setup_inference_worker_file() {
        memoization_state.note_memoized_function((SubLObject)inference_worker.$sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_);
        memoization_state.note_memoized_function((SubLObject)inference_worker.$sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_worker.$sym195$_PROBLEM_STORE_PRUNE_REPORTS_);
        return (SubLObject)inference_worker.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_file();
    }
    
    static {
        me = (SubLFile)new inference_worker();
        inference_worker.$currently_considered_tactic$ = null;
        inference_worker.$currently_executing_tactics$ = null;
        inference_worker.$currently_active_problem$ = null;
        inference_worker.$currently_active_problem_store$ = null;
        inference_worker.$asent_of_currently_executing_tactic$ = null;
        inference_worker.$mt_of_currently_executing_tactic$ = null;
        inference_worker.$consider_variable_count_of_focal_problems_for_tactic_literals_score_method$ = null;
        inference_worker.$eager_proof_validationP$ = null;
        inference_worker.$proof_circularity_detection_enabledP$ = null;
        inference_worker.$circular_proof_max_depth_cutoff$ = null;
        inference_worker.$process_motivated_transformation_link_proofsP$ = null;
        inference_worker.$find_proof_bindings_optimization_enabledP$ = null;
        inference_worker.$proof_bubbling_depth$ = null;
        inference_worker.$max_proof_bubbling_depth$ = null;
        inference_worker.$within_abnormality_checkingP$ = null;
        inference_worker.$disable_link_propagationP$ = null;
        inference_worker.$bubble_up_proofs_through_closed_split_linksP$ = null;
        inference_worker.$reconsidering_set_asidesP$ = null;
        inference_worker.$always_consider_deepP$ = null;
        inference_worker.$problem_store_prune_reports$ = null;
        inference_worker.$possibly_propagate_problem_indestructible_stack$ = null;
        inference_worker.$processed_proofs_retain_one_proofP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TACTIC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym2$_CURRENTLY_CONSIDERED_TACTIC_ = SubLObjectFactory.makeSymbol("*CURRENTLY-CONSIDERED-TACTIC*");
        $sym3$TACTIC_P = SubLObjectFactory.makeSymbol("TACTIC-P");
        $sym4$START_TIME = SubLObjectFactory.makeUninternedSymbol("START-TIME");
        $sym5$_CURRENTLY_EXECUTING_TACTICS_ = SubLObjectFactory.makeSymbol("*CURRENTLY-EXECUTING-TACTICS*");
        $sym6$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENTLY-EXECUTING-TACTICS*"));
        $sym8$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym9$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym10$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-INFERENCE-GATHERS-HL-MODULE-TIMES?"));
        $sym12$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TIME-SO-FAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE")), (SubLObject)inference_worker.NIL));
        $sym14$POSSIBLY_UPDATE_HL_MODULE_TIMES = SubLObjectFactory.makeSymbol("POSSIBLY-UPDATE-HL-MODULE-TIMES");
        $sym15$_ = SubLObjectFactory.makeSymbol("-");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TIME-SO-FAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE")), (SubLObject)inference_worker.NIL);
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym18$_CURRENTLY_ACTIVE_PROBLEM_ = SubLObjectFactory.makeSymbol("*CURRENTLY-ACTIVE-PROBLEM*");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENTLY-EXECUTING-TACTICS*"), (SubLObject)inference_worker.NIL));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym21$_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("*NEGATION-BY-FAILURE*");
        $sym22$PROBLEM_STORE_NEGATION_BY_FAILURE_ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-NEGATION-BY-FAILURE?");
        $sym23$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $str24$_a_was_not_an__unexamined_problem = SubLObjectFactory.makeString("~a was not an :unexamined problem, so cannot determine its tactics");
        $str25$_a_was__unexamined_but_somehow_go = SubLObjectFactory.makeString("~a was :unexamined but somehow got some tactics already.");
        $kw26$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $kw27$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $kw28$POS = SubLObjectFactory.makeKeyword("POS");
        $kw29$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw30$REMOVAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("REMOVAL-CONJUNCTIVE");
        $kw31$COMPLETE = SubLObjectFactory.makeKeyword("COMPLETE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $sym33$STRATEGY_P = SubLObjectFactory.makeSymbol("STRATEGY-P");
        $kw34$NON_DISCARDED = SubLObjectFactory.makeKeyword("NON-DISCARDED");
        $str35$unexpected_tactic__S = SubLObjectFactory.makeString("unexpected tactic ~S");
        $str36$Tried_to_recursively_execute__a = SubLObjectFactory.makeString("Tried to recursively execute ~a");
        $str37$Tried_to_execute_a_tactic_that_wa = SubLObjectFactory.makeString("Tried to execute a tactic that was not possible: ~s");
        $kw38$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $str39$unexpected_tactic__s = SubLObjectFactory.makeString("unexpected tactic ~s");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym41$_ASENT_OF_CURRENTLY_EXECUTING_TACTIC_ = SubLObjectFactory.makeSymbol("*ASENT-OF-CURRENTLY-EXECUTING-TACTIC*");
        $sym42$_MT_OF_CURRENTLY_EXECUTING_TACTIC_ = SubLObjectFactory.makeSymbol("*MT-OF-CURRENTLY-EXECUTING-TACTIC*");
        $str43$Got_a_literal_level_tactic__s_tha = SubLObjectFactory.makeString("Got a literal-level tactic ~s that was neither a transformation nor a removal nor a rewrite");
        $str44$Unexpected_multiple_clause_tactic = SubLObjectFactory.makeString("Unexpected multiple clause tactic module ~a");
        $str45$Unexpected_multiple_literal_tacti = SubLObjectFactory.makeString("Unexpected multiple literal tactic module ~a");
        $str46$Unexpected_structural_multiple_li = SubLObjectFactory.makeString("Unexpected structural multiple literal tactic module ~a");
        $str47$Unexpected_meta_structural_multip = SubLObjectFactory.makeString("Unexpected meta-structural multiple literal tactic module ~a");
        $str48$unexpected_connected_conjunction_ = SubLObjectFactory.makeString("unexpected connected conjunction link ~s");
        $str49$unexpected_connected_conjunction_ = SubLObjectFactory.makeString("unexpected connected conjunction tactic ~s");
        $kw50$EXPONENTIAL = SubLObjectFactory.makeKeyword("EXPONENTIAL");
        $kw51$SQUARE = SubLObjectFactory.makeKeyword("SQUARE");
        $kw52$DOUBLE = SubLObjectFactory.makeKeyword("DOUBLE");
        $str53$unexpected_disjunctive_link__s = SubLObjectFactory.makeString("unexpected disjunctive link ~s");
        $str54$_s_was_not_a_logical_link_with_un = SubLObjectFactory.makeString("~s was not a logical-link-with-unique-tactic-p");
        $kw55$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw56$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw57$UNION = SubLObjectFactory.makeKeyword("UNION");
        $kw58$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $str59$Unexpected_logical_tactic_module_ = SubLObjectFactory.makeString("Unexpected logical tactic module ~S");
        $str60$Join_tactics_like__S_do_not_have_ = SubLObjectFactory.makeString("Join tactics like ~S do not have a unique lookahead problem.");
        $sym61$STRUCTURAL_PROOF_P = SubLObjectFactory.makeSymbol("STRUCTURAL-PROOF-P");
        $str62$_a_is_not_a_CONTENT_LINK_P = SubLObjectFactory.makeString("~a is not a CONTENT-LINK-P");
        $sym63$CONTENT_TACTIC_P = SubLObjectFactory.makeSymbol("CONTENT-TACTIC-P");
        $str64$Unexpected_content_tactic__S = SubLObjectFactory.makeString("Unexpected content tactic ~S");
        $str65$Unexpected_removal_tactic__S = SubLObjectFactory.makeString("Unexpected removal tactic ~S");
        $kw66$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw67$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $sym68$CONJUNCTIVE_REMOVAL_TACTIC_P = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-TACTIC-P");
        $sym69$TRANSFORMATION_TACTIC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-TACTIC-P");
        $kw70$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym71$REWRITE_TACTIC_P = SubLObjectFactory.makeSymbol("REWRITE-TACTIC-P");
        $kw72$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $sym73$META_REMOVAL_TACTIC_P = SubLObjectFactory.makeSymbol("META-REMOVAL-TACTIC-P");
        $sym74$STRATEGIC_CONTEXT_P = SubLObjectFactory.makeSymbol("STRATEGIC-CONTEXT-P");
        $kw75$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $kw76$GENERALIZED_REMOVAL = SubLObjectFactory.makeKeyword("GENERALIZED-REMOVAL");
        $kw77$POSSIBLE = SubLObjectFactory.makeKeyword("POSSIBLE");
        $kw78$DISPREFERRED = SubLObjectFactory.makeKeyword("DISPREFERRED");
        $kw79$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $kw80$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $kw81$DOOMED = SubLObjectFactory.makeKeyword("DOOMED");
        $str82$Unexpected_preference_level__s = SubLObjectFactory.makeString("Unexpected preference-level ~s");
        $kw83$CONNECTED_CONJUNCTION = SubLObjectFactory.makeKeyword("CONNECTED-CONJUNCTION");
        $kw84$STRUCTURAL = SubLObjectFactory.makeKeyword("STRUCTURAL");
        $kw85$LOGICAL = SubLObjectFactory.makeKeyword("LOGICAL");
        $kw86$IMPOSSIBLE = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $kw87$STRUCTURAL_CONJUNCTIVE = SubLObjectFactory.makeKeyword("STRUCTURAL-CONJUNCTIVE");
        $sym88$INTERMEDIATE_PROOF_STEP_VALID_MEMOIZED_ = SubLObjectFactory.makeSymbol("INTERMEDIATE-PROOF-STEP-VALID-MEMOIZED?");
        $kw89$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw90$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw91$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw92$ARG_TYPE = SubLObjectFactory.makeKeyword("ARG-TYPE");
        $str93$Unexpected_intermediate_step_vali = SubLObjectFactory.makeString("Unexpected intermediate step validation level ~s");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROVEN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PROVEN-ASENT"));
        $str95$Didn_t_expect_to_bubble_up_a_proo = SubLObjectFactory.makeString("Didn't expect to bubble up a proof to the answer link ~s");
        $str96$Unexpected_link_type_for_link__a = SubLObjectFactory.makeString("Unexpected link type for link ~a");
        $sym97$PROOF_REJECTED_ = SubLObjectFactory.makeSymbol("PROOF-REJECTED?");
        $str98$propose_new_proof_with_bindings__ = SubLObjectFactory.makeString("propose-new-proof-with-bindings: called with rejected subproof ~S for proof ~S");
        $kw99$REJECTED_SUBPROOF = SubLObjectFactory.makeKeyword("REJECTED-SUBPROOF");
        $sym100$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $int101$300 = SubLObjectFactory.makeInteger(300);
        $kw102$CIRCULAR = SubLObjectFactory.makeKeyword("CIRCULAR");
        $kw103$ILL_FORMED = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $kw104$NON_ABDUCIBLE_RULE = SubLObjectFactory.makeKeyword("NON-ABDUCIBLE-RULE");
        $kw105$MODUS_TOLLENS_WITH_NON_WFF = SubLObjectFactory.makeKeyword("MODUS-TOLLENS-WITH-NON-WFF");
        $kw106$PROVEN = SubLObjectFactory.makeKeyword("PROVEN");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RT-C-FIRST-SUBPROOF"), (SubLObject)SubLObjectFactory.makeSymbol("RT-C-SECOND-SUBPROOF"));
        $sym108$PROBLEM_LINK_TO_GOAL_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-TO-GOAL-P");
        $str109$expected_a_variable_map_to_be_nul = SubLObjectFactory.makeString("expected a variable map to be null because the sub-bindings were null");
        $sym110$VARIABLE__ = SubLObjectFactory.makeSymbol("VARIABLE-<");
        $sym111$VARIABLE_BINDING_VARIABLE = SubLObjectFactory.makeSymbol("VARIABLE-BINDING-VARIABLE");
        $list112 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BINDING-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-VALUE"));
        $str113$Found_a_triplicate_binding_for__s = SubLObjectFactory.makeString("Found a triplicate binding for ~s in ~s and expected only a duplicate");
        $str114$Could_not_find_two_values_in__s_w = SubLObjectFactory.makeString("Could not find two values in ~s with variable ~s");
        $sym115$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $int116$100 = SubLObjectFactory.makeInteger(100);
        $kw117$MAX_PROOF_BUBBLING_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-BUBBLING-DEPTH");
        $kw118$ANSWER = SubLObjectFactory.makeKeyword("ANSWER");
        $sym119$VARIABLE_MAP_P = SubLObjectFactory.makeSymbol("VARIABLE-MAP-P");
        $kw120$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $kw121$DISJUNCTIVE_ASSUMPTION = SubLObjectFactory.makeKeyword("DISJUNCTIVE-ASSUMPTION");
        $str122$can_t_handle_bubbling_up_proofs_p = SubLObjectFactory.makeString("can't handle bubbling up proofs past disjunctive assumption links yet");
        $kw123$EXCEPTED_ASSERTION = SubLObjectFactory.makeKeyword("EXCEPTED-ASSERTION");
        $sym124$CACHED_INFERENCE_PROOF_NON_EXPLANATORY_SUBPROOFS = SubLObjectFactory.makeSymbol("CACHED-INFERENCE-PROOF-NON-EXPLANATORY-SUBPROOFS");
        $sym125$GENERALIZED_TRANSFORMATION_PROOF_P = SubLObjectFactory.makeSymbol("GENERALIZED-TRANSFORMATION-PROOF-P");
        $str126$generalized_transformation_proof_ = SubLObjectFactory.makeString("generalized transformation proof of unexpected type: ~s");
        $str127$Invalid_sense__s = SubLObjectFactory.makeString("Invalid sense ~s");
        $kw128$UNEXAMINED = SubLObjectFactory.makeKeyword("UNEXAMINED");
        $str129$Tried_to_make__a_pending_but_it_s = SubLObjectFactory.makeString("Tried to make ~a pending but it still had possible tactics");
        $kw130$INTUITIVE = SubLObjectFactory.makeKeyword("INTUITIVE");
        $kw131$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $sym132$UNION_LINK_P = SubLObjectFactory.makeSymbol("UNION-LINK-P");
        $str133$Uninteresting_problem_status_chan = SubLObjectFactory.makeString("Uninteresting problem status change for ~a: ~a -> ~a");
        $kw134$SUBSTRATEGY_PROBLEM_STATUS_CHANGE = SubLObjectFactory.makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
        $str135$possible_problem_with_no_tactics_ = SubLObjectFactory.makeString("possible problem with no tactics: ~a");
        $kw136$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw137$UNEXAMINED_GOOD = SubLObjectFactory.makeKeyword("UNEXAMINED-GOOD");
        $kw138$UNEXAMINED_NO_GOOD = SubLObjectFactory.makeKeyword("UNEXAMINED-NO-GOOD");
        $kw139$EXAMINED = SubLObjectFactory.makeKeyword("EXAMINED");
        $kw140$EXAMINED_GOOD = SubLObjectFactory.makeKeyword("EXAMINED-GOOD");
        $kw141$EXAMINED_NO_GOOD = SubLObjectFactory.makeKeyword("EXAMINED-NO-GOOD");
        $kw142$PENDING = SubLObjectFactory.makeKeyword("PENDING");
        $kw143$POSSIBLE_GOOD = SubLObjectFactory.makeKeyword("POSSIBLE-GOOD");
        $kw144$PENDING_GOOD = SubLObjectFactory.makeKeyword("PENDING-GOOD");
        $kw145$PENDING_NO_GOOD = SubLObjectFactory.makeKeyword("PENDING-NO-GOOD");
        $kw146$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $kw147$FINISHED_GOOD = SubLObjectFactory.makeKeyword("FINISHED-GOOD");
        $kw148$FINISHED_NO_GOOD = SubLObjectFactory.makeKeyword("FINISHED-NO-GOOD");
        $str149$Problem__a_attempted_to_change_st = SubLObjectFactory.makeString("Problem ~a attempted to change status from ~s to ~s, which is prohibited.");
        $str150$new_problem_cannot_become_good_ye = SubLObjectFactory.makeString("new problem cannot become good yet");
        $str151$unknown_problem_status__a = SubLObjectFactory.makeString("unknown problem status ~a");
        $str152$problem_status__a_cannot_become_u = SubLObjectFactory.makeString("problem status ~a cannot become unexamined");
        $str153$problem_of_status__a_cannot_be_ex = SubLObjectFactory.makeString("problem of status ~a cannot be examined");
        $kw154$POSSIBLE_NO_GOOD = SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD");
        $str155$problem_of_status__a_cannot_be_ma = SubLObjectFactory.makeString("problem of status ~a cannot be made possible");
        $str156$problem_of_status__a_cannot_be_pe = SubLObjectFactory.makeString("problem of status ~a cannot be pending");
        $str157$problem_of_status__a_cannot_be_fi = SubLObjectFactory.makeString("problem of status ~a cannot be finished");
        $str158$unexpected_link_type__S = SubLObjectFactory.makeString("unexpected link type ~S");
        $kw159$PROBLEM_NO_GOOD = SubLObjectFactory.makeKeyword("PROBLEM-NO-GOOD");
        $kw160$CONJUNCTIVE = SubLObjectFactory.makeKeyword("CONJUNCTIVE");
        $kw161$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str162$Unexpected_status__s = SubLObjectFactory.makeString("Unexpected status ~s");
        $kw163$FINISHED_CLOSED_SINGLE_LITERAL_OR_FINISHED_MULTI_LITERAL = SubLObjectFactory.makeKeyword("FINISHED-CLOSED-SINGLE-LITERAL-OR-FINISHED-MULTI-LITERAL");
        $kw164$PENDING_COMPLETE = SubLObjectFactory.makeKeyword("PENDING-COMPLETE");
        $kw165$PENDING_PREFERRED = SubLObjectFactory.makeKeyword("PENDING-PREFERRED");
        $kw166$NO_GOOD_SPLIT_LINK = SubLObjectFactory.makeKeyword("NO-GOOD-SPLIT-LINK");
        $kw167$NO_GOOD_PREFERRED_JO_LINK = SubLObjectFactory.makeKeyword("NO-GOOD-PREFERRED-JO-LINK");
        $kw168$NO_GOOD_JOIN_LINK = SubLObjectFactory.makeKeyword("NO-GOOD-JOIN-LINK");
        $kw169$NO_GOOD_UNION_LINKS = SubLObjectFactory.makeKeyword("NO-GOOD-UNION-LINKS");
        $str170$Can_t_bind_ = SubLObjectFactory.makeString("Can't bind ");
        $sym171$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $str172$__previously_was_ = SubLObjectFactory.makeString(" (previously was ");
        $str173$_due_to_ = SubLObjectFactory.makeString(" due to ");
        $str174$_ = SubLObjectFactory.makeString(")");
        $kw175$SIMPLIFICATION = SubLObjectFactory.makeKeyword("SIMPLIFICATION");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPLIT"), (SubLObject)SubLObjectFactory.makeKeyword("JOIN-ORDERED"));
        $kw177$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPED-PROOF-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-SPEC-TYPE-P")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym179$FILTER_PROOF_SPECS_OF_TYPE = SubLObjectFactory.makeSymbol("FILTER-PROOF-SPECS-OF-TYPE");
        $sym180$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym181$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym182$JOIN_ORDERED_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("JOIN-ORDERED-PROOF-SPEC-P");
        $sym183$RESIDUAL_TRANSFORMATION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-SPEC-P");
        $sym184$RESTRICTION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("RESTRICTION-PROOF-SPEC-P");
        $sym185$SPLIT_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("SPLIT-PROOF-SPEC-P");
        $sym186$JOIN_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("JOIN-PROOF-SPEC-P");
        $sym187$CONJUNCTIVE_REMOVAL_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-SPEC-P");
        $sym188$TRANSFORMATION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-PROOF-SPEC-P");
        $sym189$UNION_PROOF_SPEC_P = SubLObjectFactory.makeSymbol("UNION-PROOF-SPEC-P");
        $str190$Time_to_handle__S_propagation = SubLObjectFactory.makeString("Time to handle ~S propagation");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JOIN-PART"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("JOINED-PARTS"));
        $str192$Propagating_bogus_proof_spec__A_d = SubLObjectFactory.makeString("Propagating bogus proof spec ~A down join link ~A.");
        $kw193$EQUAL = SubLObjectFactory.makeKeyword("EQUAL");
        $kw194$CZER_EQUAL = SubLObjectFactory.makeKeyword("CZER-EQUAL");
        $sym195$_PROBLEM_STORE_PRUNE_REPORTS_ = SubLObjectFactory.makeSymbol("*PROBLEM-STORE-PRUNE-REPORTS*");
        $str196$__pruned__a_problems____a_____a__ = SubLObjectFactory.makeString("~&pruned ~a problems: (~a -> ~a), ~a tactics: (~a -> ~a)~%");
        $sym197$_ = SubLObjectFactory.makeSymbol(">");
        $sym198$PROBLEM_MIN_DEPTH = SubLObjectFactory.makeSymbol("PROBLEM-MIN-DEPTH");
        $kw199$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str200$destroying_in_progress_tactic__a = SubLObjectFactory.makeString("destroying in-progress tactic ~a");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-PROOF"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("JOIN-ORDERED-PROOFS"));
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCAL-PROOF"), (SubLObject)SubLObjectFactory.makeSymbol("NON-FOCAL-PROOF"));
        $sym203$_ = SubLObjectFactory.makeSymbol("<");
        $sym204$PROBLEM_LINK_SUID = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUID");
        $sym205$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
        $sym206$CONJUNCTIVE_REMOVAL_PROOF_P = SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-PROOF-P");
        $sym207$PROOF_SUID = SubLObjectFactory.makeSymbol("PROOF-SUID");
        $sym208$PROBLEM_HAS_AN_IN_PROGRESS_TACTIC_ = SubLObjectFactory.makeSymbol("PROBLEM-HAS-AN-IN-PROGRESS-TACTIC?");
        $sym209$SPLIT_LINK_P = SubLObjectFactory.makeSymbol("SPLIT-LINK-P");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw211$DO_HASH_TABLE = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $sym212$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $sym213$SET_SIZE = SubLObjectFactory.makeSymbol("SET-SIZE");
        $sym214$PROOF_PRUNABLE_ = SubLObjectFactory.makeSymbol("PROOF-PRUNABLE?");
        $str215$_a_was_not_a_problem_p_or_problem = SubLObjectFactory.makeString("~a was not a problem-p or problem-link-p");
        $str216$__prunables___s__ = SubLObjectFactory.makeString("~%prunables: ~s~%");
        $str217$Unexpected_problem_store_object__ = SubLObjectFactory.makeString("Unexpected problem store object ~s");
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNEXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("EXAMINED"), (SubLObject)SubLObjectFactory.makeKeyword("FINISHED"));
        $sym219$TACTICALLY_FINISHED_PROBLEM_P = SubLObjectFactory.makeSymbol("TACTICALLY-FINISHED-PROBLEM-P");
    }
}

/*

	Total time: 2318 ms
	
*/