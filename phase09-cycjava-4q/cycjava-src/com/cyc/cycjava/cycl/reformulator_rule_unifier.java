package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_rule_unifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_rule_unifier";
    public static final String myFingerPrint = "f5907a5ce2a6bea2d1cce92e61443055d92b4cafd6c4a4fdffb7f9af50033654";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 27868L)
    private static SubLSymbol $reformulator_removal_only_ask_inference_parameters$;
    private static final SubLObject $const0$ReformulatorRuleUnifier;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$KB;
    private static final SubLSymbol $sym3$REFORMULATOR_MATCH_EXPRESSION;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLSymbol $kw5$NO_SEARCH;
    private static final SubLInteger $int6$64;
    private static final SubLObject $const7$notAssertible;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const9$ReformulationBackwardDirection;
    private static final SubLObject $const10$expansion;
    private static final SubLObject $const11$expansionAxiom;
    private static final SubLSymbol $sym12$CAR;
    private static final SubLSymbol $sym13$CDR;
    private static final SubLObject $const14$ReformulationNeitherDirection;
    private static final SubLSymbol $sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT;
    private static final SubLSymbol $kw16$FALSE;
    private static final SubLSymbol $sym17$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $kw18$NONE;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$ARITY;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$ALL;
    private static final SubLSymbol $sym23$NEITHER_DIRECTION_;
    private static final SubLSymbol $sym24$SECOND;
    private static final SubLSymbol $kw25$REMOVAL_ONLY_ASK;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$REFORMULATOR_REMOVAL_ONLY_ASK;
    private static final SubLSymbol $kw28$MAX_TIME;
    private static final SubLInteger $int29$256;
    private static final SubLSymbol $sym30$FORT__;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 1634L)
    public static SubLObject rru_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 1760L)
    public static SubLObject rru_reformulate_expression(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLObject usable_unassociated_rules = find_usable_unassociated_rules_cached(settings, mt);
        return reformulator_match_expression(expression, mt, settings, usable_unassociated_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 2055L)
    public static SubLObject reformulation_cost_estimate(final SubLObject expression, SubLObject mt, SubLObject reformulator_modes, SubLObject meta_predicates) {
        if (mt == reformulator_rule_unifier.UNPROVIDED) {
            mt = (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (reformulator_modes == reformulator_rule_unifier.UNPROVIDED) {
            reformulator_modes = (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (meta_predicates == reformulator_rule_unifier.UNPROVIDED) {
            meta_predicates = (SubLObject)reformulator_rule_unifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_rule_unifier.NIL == reformulator_datastructures.reformulator_initializedP()) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        SubLObject result = (SubLObject)reformulator_rule_unifier.ZERO_INTEGER;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (reformulator_rule_unifier.NIL == reformulator_modes) {
                reformulator_modes = reformulator_datastructures.default_reformulator_mode_precedence(mt);
            }
            if (reformulator_rule_unifier.NIL != reformulator_modes) {
                final SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
                SubLObject cdolist_list_var;
                final SubLObject reformulator_rules_to_use = cdolist_list_var = find_kb_reformulator_rules_to_use(expression, expression_forts, mt, (SubLObject)reformulator_rule_unifier.NIL, reformulator_modes, (SubLObject)reformulator_rule_unifier.$kw2$KB, meta_predicates);
                SubLObject rr = (SubLObject)reformulator_rule_unifier.NIL;
                rr = cdolist_list_var.first();
                while (reformulator_rule_unifier.NIL != cdolist_list_var) {
                    if (reformulator_rule_unifier.NIL != reformulator_rule_accessible_from_mtP(rr, mt)) {
                        final SubLObject direction_to_use = direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
                        if (reformulator_rule_unifier.NIL != reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
                            result = Numbers.add(result, (SubLObject)reformulator_rule_unifier.ONE_INTEGER);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rr = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 3081L)
    public static SubLObject reformulator_match_expression_internal(final SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject usable_unassociated_rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression_forts = reformulator_rule_unifier_datastructures.reformulator_relevant_forts(expression);
        final SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
        final SubLObject explicit_reformulator_rules = reformulator_datastructures.get_reformulator_rules(settings);
        final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
        final SubLObject search_strategy = reformulator_datastructures.get_search_strategy(settings);
        final SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
        final SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
        final SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
        SubLObject kb_reformulator_rules_to_use = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject reformulator_rules_in_order = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject all_reformulator_rules_to_use = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject justification = (SubLObject)reformulator_rule_unifier.NIL;
        if (use_kb_reformulator_rulesP == reformulator_rule_unifier.$kw4$TRUE) {
            kb_reformulator_rules_to_use = find_kb_reformulator_rules_to_use(expression, expression_forts, mt, skip_assertions, reformulator_modes, wff_degree, meta_predicates);
            reformulator_rules_in_order = order_reformulator_rules(ConsesLow.append(explicit_reformulator_rules, kb_reformulator_rules_to_use), expression, expression_forts, mt, reformulator_modes);
            all_reformulator_rules_to_use = ((reformulator_rule_unifier.NIL != forts.fort_p(expression)) ? reformulator_rules_in_order : ConsesLow.append(reformulator_rules_in_order, usable_unassociated_rules));
        }
        else {
            all_reformulator_rules_to_use = order_reformulator_rules(explicit_reformulator_rules, expression, expression_forts, mt, reformulator_modes);
        }
        final SubLObject pcase_var = search_strategy;
        if (pcase_var.eql((SubLObject)reformulator_rule_unifier.$kw5$NO_SEARCH)) {
            thread.resetMultipleValues();
            final SubLObject result_$1 = reformulator_match_expression_no_search(all_reformulator_rules_to_use, expression, expression_forts, mt, settings, reformulator_modes, wff_degree);
            final SubLObject justification_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = result_$1;
            justification = justification_$2;
        }
        if (reformulator_rule_unifier.NIL != result) {
            return Values.values(result, justification);
        }
        return Values.values(expression, (SubLObject)reformulator_rule_unifier.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 3081L)
    public static SubLObject reformulator_match_expression(final SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject usable_unassociated_rules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == v_memoization_state) {
            return reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym3$REFORMULATOR_MATCH_EXPRESSION, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (reformulator_rule_unifier.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_rule_unifier.$sym3$REFORMULATOR_MATCH_EXPRESSION, (SubLObject)reformulator_rule_unifier.FOUR_INTEGER, (SubLObject)reformulator_rule_unifier.$int6$64, (SubLObject)reformulator_rule_unifier.EQUAL, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym3$REFORMULATOR_MATCH_EXPRESSION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, mt, settings, usable_unassociated_rules);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_rule_unifier.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_rule_unifier.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (settings.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (reformulator_rule_unifier.NIL != cached_args && reformulator_rule_unifier.NIL == cached_args.rest() && usable_unassociated_rules.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(reformulator_match_expression_internal(expression, mt, settings, usable_unassociated_rules)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, mt, settings, usable_unassociated_rules));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 6660L)
    public static SubLObject reformulator_match_expression_no_search(final SubLObject reformulator_rules, final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject settings, final SubLObject reformulator_modes, final SubLObject wff_degree) {
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject justification = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == result) {
            SubLObject csome_list_var = reformulator_rules;
            SubLObject rr = (SubLObject)reformulator_rule_unifier.NIL;
            rr = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var) {
                result = reformulator_rule_unify_if_possible(expression, expression_forts, rr, mt, settings, reformulator_modes, wff_degree);
                if (reformulator_rule_unifier.NIL != result) {
                    justification = (SubLObject)ConsesLow.cons(find_justification_for_reformulator_rule(rr), justification);
                }
                csome_list_var = csome_list_var.rest();
                rr = csome_list_var.first();
            }
        }
        return Values.values(result, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 7618L)
    public static SubLObject reformulator_rule_target_is_nonassertibleP(final SubLObject rr, final SubLObject direction, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
        final SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
        SubLObject dontassertP = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL != reformulator_rule_from_expansion_axiomP(rr) && reformulator_rule_unifier.NIL == dontassertP) {
            SubLObject csome_list_var = templ_forts;
            SubLObject afort = (SubLObject)reformulator_rule_unifier.NIL;
            afort = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == dontassertP && reformulator_rule_unifier.NIL != csome_list_var) {
                if (reformulator_rule_unifier.NIL != somewhere_cache.some_pred_assertion_somewhereP(reformulator_rule_unifier.$const7$notAssertible, afort, (SubLObject)reformulator_rule_unifier.ONE_INTEGER, (SubLObject)reformulator_rule_unifier.UNPROVIDED)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_rule_unifier.$sym8$RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        if (reformulator_rule_unifier.NIL != list_utilities.sublisp_boolean(kb_mapping_utilities.fpred_value(afort, reformulator_rule_unifier.$const7$notAssertible, (SubLObject)reformulator_rule_unifier.ONE_INTEGER, (SubLObject)reformulator_rule_unifier.ONE_INTEGER, (SubLObject)reformulator_rule_unifier.UNPROVIDED))) {
                            dontassertP = (SubLObject)reformulator_rule_unifier.T;
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                csome_list_var = csome_list_var.rest();
                afort = csome_list_var.first();
            }
        }
        return dontassertP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 8320L)
    public static SubLObject reformulator_rule_contracts_el_relationP(final SubLObject rr, final SubLObject direction, final SubLObject mt) {
        final SubLObject target = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction);
        final SubLObject templ_forts = reformulator_rule_unifier_datastructures.reformulator_template_forts(target);
        SubLObject expansion_relation = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject contracting_el_relationP = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL != reformulator_rule_from_expansion_axiomP(rr)) {
            final SubLObject expression = reformulator_rule_unifier_datastructures.reformulator_template_expression(target);
            if (reformulator_rule_unifier.NIL != kb_utilities.kbeq(reformulator_rule_unifier.$const9$ReformulationBackwardDirection, direction) && reformulator_rule_unifier.NIL != clause_utilities.pos_atomic_clauses_p(expression)) {
                expansion_relation = clause_utilities.atomic_clauses_predicate(expression);
            }
            else {
                expansion_relation = cycl_utilities.formula_arg1(reformulator_hub.hl_formula_for_reformulator_rule(rr), (SubLObject)reformulator_rule_unifier.UNPROVIDED);
            }
            if (reformulator_rule_unifier.NIL != subl_promotions.memberP(expansion_relation, templ_forts, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED) && reformulator_rule_unifier.NIL != fort_types_interface.isa_el_relationP(expansion_relation, mt)) {
                contracting_el_relationP = (SubLObject)reformulator_rule_unifier.T;
            }
        }
        return contracting_el_relationP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 9374L)
    public static SubLObject reformulator_rule_from_expansion_axiomP(final SubLObject rr) {
        final SubLObject reformulation_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_rule_unifier.NIL != kb_utilities.kbeq(reformulation_pred, reformulator_rule_unifier.$const10$expansion) || reformulator_rule_unifier.NIL != kb_utilities.kbeq(reformulation_pred, reformulator_rule_unifier.$const11$expansionAxiom));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 9606L)
    public static SubLObject reformulator_rule_unify_if_possible(final SubLObject expression, final SubLObject expression_forts, final SubLObject rr, final SubLObject mt, final SubLObject settings, final SubLObject reformulator_modes, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction_to_use = direction_to_apply_reformulator_rule(rr, mt, reformulator_modes);
        if (reformulator_rule_unifier.NIL == direction_to_use) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (reformulator_rule_unifier.NIL == reformulation_possible_with_source_rtP(expression, expression_forts, rr, direction_to_use)) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (reformulator_rule_unifier.NIL != reformulator_rule_target_is_nonassertibleP(rr, direction_to_use, mt)) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (reformulator_rule_unifier.NIL != reformulator_rule_contracts_el_relationP(rr, direction_to_use, mt)) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject unify_result = reformulator_rule_unify(expression, rr, mt, direction_to_use, wff_degree);
        final SubLObject czer_bindings = thread.secondMultipleValue();
        final SubLObject unify_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (reformulator_rule_unifier.NIL != unify_result && reformulator_rule_unifier.NIL != reformulation_preconditions_metP(expression, rr, mt, unify_result, czer_bindings, unify_bindings, settings, direction_to_use)) {
            return unify_result;
        }
        return (SubLObject)reformulator_rule_unifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 10659L)
    public static SubLObject reformulator_rule_unify(SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject direction_to_use, final SubLObject wff_degree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source_expr = reformulator_rule_unifier_datastructures.reformulator_template_expression(reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use));
        final SubLObject shared_var_bindings = reformulator_rule_unifier_datastructures.reformulator_rule_source_shared_var_bindings(rr, direction_to_use);
        final SubLObject source_clausesP = clauses.clauses_p(source_expr);
        SubLObject unify_bindings = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject result_expr = (SubLObject)reformulator_rule_unifier.NIL;
        final SubLObject _prev_bind_0 = reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.currentBinding(thread);
        try {
            reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            expression = reformulator_rule_unifier_datastructures.reformulator_dwim_skolems(expression);
            unify_bindings = reformulator_unify(expression, source_expr, clauses.clauses_p(expression), source_clausesP);
            if (reformulator_rule_unifier.NIL != unify_bindings) {
                final SubLObject target_rt = reformulator_rule_unifier_datastructures.reformulator_rule_target_rt(rr, direction_to_use);
                SubLObject target_expr = reformulator_rule_unifier_datastructures.reformulator_template_el_var_expression(target_rt);
                target_expr = conses_high.nsublis(shared_var_bindings, target_expr, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                target_expr = conses_high.nsublis(unify_bindings, target_expr, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                target_expr = reformulator_rule_unifier_datastructures.reformulator_undwim_skolems(target_expr);
                target_expr = (result_expr = reformulator_rule_unifier_datastructures.rru_clean_up_skolem_function_fns(target_expr));
            }
        }
        finally {
            reformulator_rule_unifier_datastructures.$reformulator_skolem_dwimming_space$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result_expr, shared_var_bindings, unify_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 11908L)
    public static SubLObject reformulator_unify(final SubLObject expr1, final SubLObject expr2, final SubLObject expr1_clausesP, final SubLObject expr2_clausesP) {
        if (!expr1_clausesP.eql(expr2_clausesP)) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        result = ((reformulator_rule_unifier.NIL != expr1_clausesP) ? unification_utilities.unify_clauses(expr1, expr2, (SubLObject)reformulator_rule_unifier.NIL, (SubLObject)reformulator_rule_unifier.UNPROVIDED).first() : unification.unify(expr1, expr2, (SubLObject)reformulator_rule_unifier.NIL, (SubLObject)reformulator_rule_unifier.UNPROVIDED));
        if (reformulator_rule_unifier.NIL != el_var_bindings_consistentP(expr1, expr2, result)) {
            return result;
        }
        return (SubLObject)reformulator_rule_unifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 12380L)
    public static SubLObject el_var_bindings_consistentP(final SubLObject expr1, final SubLObject expr2, final SubLObject v_bindings) {
        SubLObject el_var_bindings = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject hl_var_bindings = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)reformulator_rule_unifier.NIL;
        binding = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL != cycl_variables.el_varP(binding.first())) {
                el_var_bindings = (SubLObject)ConsesLow.cons(binding, el_var_bindings);
            }
            else {
                hl_var_bindings = (SubLObject)ConsesLow.cons(binding, hl_var_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject new_expr1 = conses_high.sublis(hl_var_bindings, expr1, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        final SubLObject new_expr2 = conses_high.sublis(hl_var_bindings, expr2, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        SubLObject cdolist_list_var2 = el_var_bindings;
        SubLObject binding2 = (SubLObject)reformulator_rule_unifier.NIL;
        binding2 = cdolist_list_var2.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var2) {
            final SubLObject el_var_1 = binding2.first();
            final SubLObject el_var_2 = binding2.rest();
            if (reformulator_rule_unifier.NIL != el_var_binding_inconsistentP(new_expr1, new_expr2, el_var_1, el_var_2)) {
                return (SubLObject)reformulator_rule_unifier.NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            binding2 = cdolist_list_var2.first();
        }
        if (reformulator_rule_unifier.NIL != list_utilities.duplicatesP(el_var_bindings, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQUAL), Symbols.symbol_function((SubLObject)reformulator_rule_unifier.$sym12$CAR)) || reformulator_rule_unifier.NIL != list_utilities.duplicatesP(el_var_bindings, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQUAL), Symbols.symbol_function((SubLObject)reformulator_rule_unifier.$sym13$CDR))) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        return (SubLObject)reformulator_rule_unifier.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 13261L)
    public static SubLObject el_var_binding_inconsistentP(final SubLObject expr1, final SubLObject expr2, final SubLObject el_var_1, final SubLObject el_var_2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_rule_unifier.NIL != cycl_utilities.expression_find(el_var_1, expr2, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED) || reformulator_rule_unifier.NIL != cycl_utilities.expression_find(el_var_2, expr1, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 13587L)
    public static SubLObject car_hl_variable_p(final SubLObject cons) {
        return cycl_grammar.hl_variable_p(cons.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 13665L)
    public static SubLObject find_justification_for_reformulator_rule(final SubLObject rr) {
        final SubLObject result = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        return (reformulator_rule_unifier.NIL != result) ? result : rr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 13815L)
    public static SubLObject direction_to_apply_reformulator_rule(final SubLObject rr, final SubLObject mt, final SubLObject reformulator_modes) {
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == result) {
            SubLObject csome_list_var;
            SubLObject mode;
            for (csome_list_var = reformulator_modes, mode = (SubLObject)reformulator_rule_unifier.NIL, mode = csome_list_var.first(); reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var; result = direction_to_use_for_mode_in_mt(rr, mt, mode), csome_list_var = csome_list_var.rest(), mode = csome_list_var.first()) {}
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 14286L)
    public static SubLObject direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        SubLObject result = explicit_direction_to_use_for_mode_in_mt(rr, mt, mode);
        if (reformulator_rule_unifier.NIL == result) {
            result = default_direction_to_use_for_mode_in_mt(rr, mt, mode);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 14783L)
    public static SubLObject explicit_direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        final SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rr));
        return find_usable_direction_for_mode(rule_directions_for_mode, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 15026L)
    public static SubLObject default_direction_to_use_for_mode_in_mt(final SubLObject rr, final SubLObject mt, final SubLObject mode) {
        final SubLObject default_directions = default_mode_directions_for_reformulator_rule(rr, mode);
        return find_usable_direction_for_mode(default_directions, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 15251L)
    public static SubLObject find_usable_direction_for_mode(final SubLObject rule_directions_for_mode, final SubLObject mt) {
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == result) {
            SubLObject csome_list_var = rule_directions_for_mode;
            SubLObject direction_struct = (SubLObject)reformulator_rule_unifier.NIL;
            direction_struct = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var) {
                if (reformulator_rule_unifier.NIL == neither_directionP(direction_struct) && reformulator_rule_unifier.NIL != reformulation_direction_accessible_from_mtP(direction_struct, mt)) {
                    result = direction_struct_direction(direction_struct);
                }
                csome_list_var = csome_list_var.rest();
                direction_struct = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 15638L)
    public static SubLObject default_mode_directions_for_reformulator_rule(final SubLObject rr, final SubLObject mode) {
        final SubLObject rule_pred = reformulator_rule_unifier_datastructures.reformulator_rule_rule_pred(rr);
        final SubLObject default_directions = reformulator_datastructures.mode_directions_for_pred(rule_pred, mode, reformulator_datastructures.default_reformulation_directions_in_modes_for_preds());
        return default_directions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 15934L)
    public static SubLObject neither_directionP(final SubLObject direction_struct) {
        return kb_utilities.kbeq(direction_struct_direction(direction_struct), reformulator_rule_unifier.$const14$ReformulationNeitherDirection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 16084L)
    public static SubLObject reformulation_direction_accessible_from_mtP(final SubLObject direction_struct, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(direction_struct_mt(direction_struct));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 16303L)
    public static SubLObject direction_struct_direction(final SubLObject direction_struct) {
        return direction_struct.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 16401L)
    public static SubLObject direction_struct_mt(final SubLObject direction_struct) {
        return conses_high.second(direction_struct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 16493L)
    public static SubLObject find_kb_reformulator_rules_to_use(final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject skip_assertions, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        SubLObject all_rules = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL != constant_handles.constant_p(expression)) {
            all_rules = Hashtables.gethash(expression, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        }
        else if (reformulator_rule_unifier.NIL != nart_handles.nart_p(expression)) {
            all_rules = Hashtables.gethash(expression, reformulator_rule_unifier_datastructures.nart_reformulator_rule_table(), (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        }
        else {
            SubLObject cdolist_list_var = expression_forts;
            SubLObject fort = (SubLObject)reformulator_rule_unifier.NIL;
            fort = cdolist_list_var.first();
            while (reformulator_rule_unifier.NIL != cdolist_list_var) {
                all_rules = conses_high.union(all_rules, Hashtables.gethash(fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), (SubLObject)reformulator_rule_unifier.UNPROVIDED), (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var = all_rules;
        SubLObject rule = (SubLObject)reformulator_rule_unifier.NIL;
        rule = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL == subl_promotions.memberP(rule, skip_assertions, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED)) {
                final SubLObject rr = Hashtables.gethash(rule, reformulator_rule_unifier_datastructures.reformulator_rules(), (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                if (reformulator_rule_unifier.NIL != reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates)) {
                    result = (SubLObject)ConsesLow.cons(rr, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 17815L)
    public static SubLObject find_usable_unassociated_rules_cached(final SubLObject settings, final SubLObject mt) {
        final SubLObject use_kb_reformulator_rulesP = reformulator_datastructures.get_use_kb_reformulator_rulesP(settings);
        final SubLObject skip_assertions = reformulator_datastructures.get_reformulator_rule_skip_assertions(settings);
        final SubLObject reformulator_modes = reformulator_datastructures.get_reformulator_modes(settings, mt);
        final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement(settings);
        final SubLObject meta_predicates = reformulator_datastructures.get_reformulator_meta_predicates(settings);
        return find_usable_unassociated_rules_cached_int(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 18405L)
    public static SubLObject find_usable_unassociated_rules_cached_int_internal(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        return find_usable_unassociated_rules(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 18405L)
    public static SubLObject find_usable_unassociated_rules_cached_int(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == v_memoization_state) {
            return find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (reformulator_rule_unifier.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_rule_unifier.$sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, (SubLObject)reformulator_rule_unifier.SIX_INTEGER, (SubLObject)reformulator_rule_unifier.NIL, (SubLObject)reformulator_rule_unifier.EQUAL, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_rule_unifier.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_rule_unifier.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (use_kb_reformulator_rulesP.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (skip_assertions.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (reformulator_modes.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (wff_degree.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (reformulator_rule_unifier.NIL != cached_args && reformulator_rule_unifier.NIL == cached_args.rest() && meta_predicates.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_usable_unassociated_rules_cached_int_internal(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(use_kb_reformulator_rulesP, skip_assertions, mt, reformulator_modes, wff_degree, meta_predicates));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 18763L)
    public static SubLObject find_usable_unassociated_rules(final SubLObject use_kb_reformulator_rulesP, final SubLObject skip_assertions, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        if (reformulator_rule_unifier.$kw16$FALSE == use_kb_reformulator_rulesP) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.unassociated_reformulator_rules();
        SubLObject rr = (SubLObject)reformulator_rule_unifier.NIL;
        rr = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL == subl_promotions.memberP(reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr), skip_assertions, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED) && reformulator_rule_unifier.NIL != reformulator_rule_usableP(rr, mt, reformulator_modes, wff_degree, meta_predicates)) {
                result = (SubLObject)ConsesLow.cons(rr, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rr = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 19404L)
    public static SubLObject reformulator_rule_usableP(final SubLObject rr, final SubLObject mt, final SubLObject reformulator_modes, final SubLObject wff_degree, final SubLObject meta_predicates) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_rule_unifier.NIL != reformulator_rule_compatible_in_wff_degree(rr, wff_degree) && reformulator_rule_unifier.NIL != reformulator_rule_accessible_from_mtP(rr, mt) && reformulator_rule_unifier.NIL != reformulator_rule_has_necessary_meta_predicateP(rr, meta_predicates) && reformulator_rule_unifier.NIL != reformulator_rule_usable_in_any_modeP(rr, reformulator_modes, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 19892L)
    public static SubLObject find_all_superiors_for_forts(final SubLObject expression_forts, final SubLObject mt) {
        SubLObject all_forts = expression_forts;
        SubLObject cdolist_list_var = expression_forts;
        SubLObject fort = (SubLObject)reformulator_rule_unifier.NIL;
        fort = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL != fort_types_interface.predicate_in_any_mtP(fort)) {
                SubLObject cdolist_list_var_$3 = genl_predicates.all_genl_predicates(fort, mt, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                SubLObject each_genl_pred = (SubLObject)reformulator_rule_unifier.NIL;
                each_genl_pred = cdolist_list_var_$3.first();
                while (reformulator_rule_unifier.NIL != cdolist_list_var_$3) {
                    final SubLObject item_var = each_genl_pred;
                    if (reformulator_rule_unifier.NIL == conses_high.member(item_var, all_forts, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQL), Symbols.symbol_function((SubLObject)reformulator_rule_unifier.IDENTITY))) {
                        all_forts = (SubLObject)ConsesLow.cons(item_var, all_forts);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    each_genl_pred = cdolist_list_var_$3.first();
                }
            }
            else if (reformulator_rule_unifier.NIL != fort_types_interface.collection_in_any_mtP(fort)) {
                SubLObject cdolist_list_var_$4 = genls.all_genls_in_mt(fort, mt);
                SubLObject each_genl = (SubLObject)reformulator_rule_unifier.NIL;
                each_genl = cdolist_list_var_$4.first();
                while (reformulator_rule_unifier.NIL != cdolist_list_var_$4) {
                    final SubLObject item_var = each_genl;
                    if (reformulator_rule_unifier.NIL == conses_high.member(item_var, all_forts, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQL), Symbols.symbol_function((SubLObject)reformulator_rule_unifier.IDENTITY))) {
                        all_forts = (SubLObject)ConsesLow.cons(item_var, all_forts);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    each_genl = cdolist_list_var_$4.first();
                }
            }
            else if (reformulator_rule_unifier.NIL != fort_types_interface.mt_in_any_mtP(fort)) {
                SubLObject cdolist_list_var_$5 = genl_mts.all_genl_mts(fort, mt, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                SubLObject each_genl_mt = (SubLObject)reformulator_rule_unifier.NIL;
                each_genl_mt = cdolist_list_var_$5.first();
                while (reformulator_rule_unifier.NIL != cdolist_list_var_$5) {
                    final SubLObject item_var = each_genl_mt;
                    if (reformulator_rule_unifier.NIL == conses_high.member(item_var, all_forts, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQL), Symbols.symbol_function((SubLObject)reformulator_rule_unifier.IDENTITY))) {
                        all_forts = (SubLObject)ConsesLow.cons(item_var, all_forts);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    each_genl_mt = cdolist_list_var_$5.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        }
        return all_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 20527L)
    public static SubLObject order_reformulator_rules(final SubLObject reformulator_rules, final SubLObject expression, final SubLObject expression_forts, final SubLObject mt, final SubLObject reformulator_modes) {
        final SubLObject primary_mode = reformulator_datastructures.reformulator_primary_mode(reformulator_modes);
        final SubLObject secondary_mode = reformulator_datastructures.reformulator_secondary_mode(reformulator_modes);
        final SubLObject tertiary_mode = reformulator_datastructures.reformulator_tertiary_mode(reformulator_modes);
        SubLObject best = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject better = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject good = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject bad = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject worse = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject cdolist_list_var = reformulator_rules;
        SubLObject rule = (SubLObject)reformulator_rule_unifier.NIL;
        rule = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL != reformulator_rule_in_mtP(rule, mt) && reformulator_rule_unifier.NIL != reformulator_rule_mentions_all_expression_fortsP(rule, expression_forts)) {
                if (reformulator_rule_unifier.NIL != reformulator_rule_usable_in_modeP(rule, primary_mode, mt)) {
                    best = (SubLObject)ConsesLow.cons(rule, best);
                }
                else if (reformulator_rule_unifier.NIL != reformulator_rule_usable_in_modeP(rule, secondary_mode, mt)) {
                    better = (SubLObject)ConsesLow.cons(rule, better);
                }
                else if (reformulator_rule_unifier.NIL != reformulator_rule_usable_in_modeP(rule, tertiary_mode, mt)) {
                    good = (SubLObject)ConsesLow.cons(rule, good);
                }
                else {
                    bad = (SubLObject)ConsesLow.cons(rule, bad);
                }
            }
            else {
                worse = (SubLObject)ConsesLow.cons(rule, worse);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        }
        return ConsesLow.nconc(new SubLObject[] { best, better, good, bad, worse });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 21793L)
    public static SubLObject reformulator_rule_accessible_from_mtP(final SubLObject rr, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 21981L)
    public static SubLObject reformulator_rule_in_mtP(final SubLObject rr, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)reformulator_rule_unifier.$sym17$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            result = mt_relevance_macros.relevant_mtP(reformulator_rule_unifier_datastructures.reformulator_rule_mt(rr));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 22152L)
    public static SubLObject reformulator_rule_mentions_all_expression_fortsP(final SubLObject rr, final SubLObject v_forts) {
        SubLObject result = (SubLObject)reformulator_rule_unifier.T;
        SubLObject flag = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == flag) {
            SubLObject csome_list_var = v_forts;
            SubLObject fort = (SubLObject)reformulator_rule_unifier.NIL;
            fort = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == flag && reformulator_rule_unifier.NIL != csome_list_var) {
                if (reformulator_rule_unifier.NIL == reformulator_hub.reformulator_rule_mentions_fortP(rr, fort)) {
                    result = (SubLObject)reformulator_rule_unifier.NIL;
                    flag = (SubLObject)reformulator_rule_unifier.T;
                }
                csome_list_var = csome_list_var.rest();
                fort = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 22408L)
    public static SubLObject reformulator_rule_compatible_in_wff_degree(final SubLObject rule, final SubLObject wff_degree) {
        final SubLObject rule_wff_degree = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree(rule);
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (wff_degree.eql((SubLObject)reformulator_rule_unifier.$kw18$NONE)) {
            result = (SubLObject)reformulator_rule_unifier.T;
        }
        else if (wff_degree.eql((SubLObject)reformulator_rule_unifier.$kw2$KB)) {
            result = conses_high.member(rule_wff_degree, (SubLObject)reformulator_rule_unifier.$list19, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        }
        else if (wff_degree.eql((SubLObject)reformulator_rule_unifier.$kw20$ARITY)) {
            result = conses_high.member(rule_wff_degree, (SubLObject)reformulator_rule_unifier.$list21, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        }
        else if (wff_degree.eql((SubLObject)reformulator_rule_unifier.$kw22$ALL)) {
            result = Equality.eq(rule_wff_degree, (SubLObject)reformulator_rule_unifier.$kw22$ALL);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 22858L)
    public static SubLObject reformulator_rule_usable_in_any_modeP(final SubLObject rule, final SubLObject reformulator_modes, final SubLObject mt) {
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == result) {
            SubLObject csome_list_var;
            SubLObject mode;
            for (csome_list_var = reformulator_modes, mode = (SubLObject)reformulator_rule_unifier.NIL, mode = csome_list_var.first(); reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var; result = reformulator_rule_usable_in_modeP(rule, mode, mt), csome_list_var = csome_list_var.rest(), mode = csome_list_var.first()) {}
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 23260L)
    public static SubLObject reformulator_rule_usable_in_modeP(final SubLObject rule, final SubLObject mode, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_directions_for_mode = reformulator_rule_unifier_datastructures.directions_for_mode(mode, reformulator_rule_unifier_datastructures.reformulator_rule_directions(rule));
        final SubLObject effective_default_directions_for_mode = default_mode_directions_in_effect(rule, mode, mt, rule_directions_for_mode);
        final SubLObject neither_directions_for_mode = list_utilities.delete_if_not((SubLObject)reformulator_rule_unifier.$sym23$NEITHER_DIRECTION_, ConsesLow.append(rule_directions_for_mode, effective_default_directions_for_mode), (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        final SubLObject neither_mts = Mapping.mapcar(Symbols.symbol_function((SubLObject)reformulator_rule_unifier.$sym24$SECOND), neither_directions_for_mode);
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL != neither_mts) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if (reformulator_rule_unifier.NIL == result) {
                    SubLObject csome_list_var;
                    SubLObject neither_mt;
                    for (csome_list_var = neither_mts, neither_mt = (SubLObject)reformulator_rule_unifier.NIL, neither_mt = csome_list_var.first(); reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var; result = mt_relevance_macros.relevant_mtP(neither_mt), csome_list_var = csome_list_var.rest(), neither_mt = csome_list_var.first()) {}
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_rule_unifier.NIL == result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 24057L)
    public static SubLObject default_mode_directions_in_effect(final SubLObject rule, final SubLObject mode, final SubLObject mt, final SubLObject rule_directions_for_mode) {
        final SubLObject default_directions = default_mode_directions_for_reformulator_rule(rule, mode);
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject cdolist_list_var = default_directions;
        SubLObject default_direction_struct = (SubLObject)reformulator_rule_unifier.NIL;
        default_direction_struct = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            if (reformulator_rule_unifier.NIL == default_reformulation_direction_in_mode_overriddenP(default_direction_struct, mt, rule_directions_for_mode)) {
                result = (SubLObject)ConsesLow.cons(default_direction_struct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            default_direction_struct = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 24612L)
    public static SubLObject default_reformulation_direction_in_mode_overriddenP(final SubLObject default_direction_struct, final SubLObject mt, final SubLObject explicit_directions_for_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_mt = direction_struct_mt(default_direction_struct);
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == result) {
            SubLObject csome_list_var = explicit_directions_for_mode;
            SubLObject explicit_direction_struct = (SubLObject)reformulator_rule_unifier.NIL;
            explicit_direction_struct = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == result && reformulator_rule_unifier.NIL != csome_list_var) {
                if (reformulator_rule_unifier.NIL != reformulation_direction_accessible_from_mtP(explicit_direction_struct, mt)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                        result = (SubLObject)SubLObjectFactory.makeBoolean(reformulator_rule_unifier.NIL != mt_relevance_macros.relevant_mtP(default_mt) && reformulator_rule_unifier.NIL != mt_relevance_macros.relevant_mtP(direction_struct_mt(explicit_direction_struct)));
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                csome_list_var = csome_list_var.rest();
                explicit_direction_struct = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 25266L)
    public static SubLObject reformulator_rule_has_necessary_meta_predicateP(final SubLObject rr, final SubLObject meta_predicates) {
        if (reformulator_rule_unifier.NIL == meta_predicates) {
            return (SubLObject)reformulator_rule_unifier.T;
        }
        final SubLObject rr_ass = reformulator_rule_unifier_datastructures.reformulator_rule_assertion(rr);
        SubLObject foundP = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == rr_ass) {
            return (SubLObject)reformulator_rule_unifier.NIL;
        }
        if (reformulator_rule_unifier.NIL == foundP) {
            SubLObject csome_list_var = assertion_utilities.all_meta_assertions(rr_ass);
            SubLObject ass = (SubLObject)reformulator_rule_unifier.NIL;
            ass = csome_list_var.first();
            while (reformulator_rule_unifier.NIL == foundP && reformulator_rule_unifier.NIL != csome_list_var) {
                if (reformulator_rule_unifier.NIL != assertions_high.gaf_assertionP(ass) && reformulator_rule_unifier.NIL != conses_high.member(assertions_high.gaf_arg0(ass), meta_predicates, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED)) {
                    foundP = (SubLObject)reformulator_rule_unifier.T;
                }
                csome_list_var = csome_list_var.rest();
                ass = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 25676L)
    public static SubLObject reformulation_preconditions_metP(final SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject unify_result, final SubLObject czer_bindings, final SubLObject unify_bindings, final SubLObject settings, final SubLObject reformulation_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject precondition_checking = reformulator_datastructures.get_precondition_checking(settings);
        SubLObject cdolist_list_var = reformulator_rule_unifier_datastructures.reformulator_rule_preconditions(rr);
        SubLObject precondition_struct = (SubLObject)reformulator_rule_unifier.NIL;
        precondition_struct = cdolist_list_var.first();
        while (reformulator_rule_unifier.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject precondition_direction = unfold_precondition_struct(precondition_struct);
            final SubLObject precondition = thread.secondMultipleValue();
            final SubLObject precondition_mt = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (reformulator_rule_unifier.NIL != reformulation_precondition_right_directionP(precondition_direction, reformulation_direction) && reformulator_rule_unifier.NIL != reformulation_precondition_accessible_from_mtP(precondition_mt, mt) && reformulator_rule_unifier.NIL == reformulation_precondition_metP(precondition, expression, rr, mt, unify_result, czer_bindings, unify_bindings, precondition_checking, settings)) {
                return (SubLObject)reformulator_rule_unifier.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            precondition_struct = cdolist_list_var.first();
        }
        return (SubLObject)reformulator_rule_unifier.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 27043L)
    public static SubLObject reformulation_precondition_accessible_from_mtP(final SubLObject precondition_mt, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)reformulator_rule_unifier.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            result = mt_relevance_macros.relevant_mtP(precondition_mt);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 27241L)
    public static SubLObject reformulation_precondition_metP(final SubLObject precondition, final SubLObject expression, final SubLObject rr, final SubLObject mt, final SubLObject unify_result, final SubLObject czer_bindings, final SubLObject unify_bindings, final SubLObject precondition_checking, final SubLObject settings) {
        final SubLObject askable_precondition = conses_high.nsublis(unify_bindings, conses_high.sublis(czer_bindings, precondition, (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED), (SubLObject)reformulator_rule_unifier.UNPROVIDED, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        SubLObject provenP = (SubLObject)reformulator_rule_unifier.NIL;
        if (precondition_checking.eql((SubLObject)reformulator_rule_unifier.$kw25$REMOVAL_ONLY_ASK)) {
            provenP = reformulator_removal_only_ask(askable_precondition, mt, settings);
        }
        return provenP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 27986L)
    public static SubLObject reformulator_removal_only_ask_internal(final SubLObject askable_precondition, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ask_result = (SubLObject)reformulator_rule_unifier.NIL;
        SubLObject reformulator_removal_only_ask_inference_parameters = reformulator_rule_unifier.$reformulator_removal_only_ask_inference_parameters$.getGlobalValue();
        final SubLObject max_time = reformulator_datastructures.get_max_time(settings);
        if (reformulator_rule_unifier.NIL != max_time) {
            reformulator_removal_only_ask_inference_parameters = ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)reformulator_rule_unifier.$kw28$MAX_TIME, Numbers.floor(max_time, (SubLObject)reformulator_rule_unifier.UNPROVIDED)), reformulator_removal_only_ask_inference_parameters);
        }
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding(thread);
        try {
            control_vars.$within_assert$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)reformulator_rule_unifier.T, thread);
            wff_utilities.$check_arityP$.bind((SubLObject)reformulator_rule_unifier.NIL, thread);
            if (reformulator_rule_unifier.NIL != el_utilities.closedP(askable_precondition, (SubLObject)reformulator_rule_unifier.UNPROVIDED) && reformulator_rule_unifier.NIL != collection_defns.cycl_sentence_askableP(askable_precondition)) {
                if (reformulator_rule_unifier.NIL != backward.closed_conjunctive_cycl_sentence_p(askable_precondition)) {
                    ask_result = backward.closed_conjunctive_removal_ask(askable_precondition, (reformulator_rule_unifier.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)reformulator_rule_unifier.UNPROVIDED);
                }
                else {
                    ask_result = cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(askable_precondition, (reformulator_rule_unifier.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread), reformulator_removal_only_ask_inference_parameters));
                }
            }
        }
        finally {
            wff_utilities.$check_arityP$.rebind(_prev_bind_12, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
            control_vars.$within_assert$.rebind(_prev_bind_0, thread);
        }
        return ask_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 27986L)
    public static SubLObject reformulator_removal_only_ask(final SubLObject askable_precondition, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)reformulator_rule_unifier.NIL;
        if (reformulator_rule_unifier.NIL == v_memoization_state) {
            return reformulator_removal_only_ask_internal(askable_precondition, mt, settings);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym27$REFORMULATOR_REMOVAL_ONLY_ASK, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (reformulator_rule_unifier.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)reformulator_rule_unifier.$sym27$REFORMULATOR_REMOVAL_ONLY_ASK, (SubLObject)reformulator_rule_unifier.THREE_INTEGER, (SubLObject)reformulator_rule_unifier.$int29$256, (SubLObject)reformulator_rule_unifier.EQUAL, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)reformulator_rule_unifier.$sym27$REFORMULATOR_REMOVAL_ONLY_ASK, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(askable_precondition, mt, settings);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)reformulator_rule_unifier.NIL;
            collision = cdolist_list_var.first();
            while (reformulator_rule_unifier.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (askable_precondition.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (reformulator_rule_unifier.NIL != cached_args && reformulator_rule_unifier.NIL == cached_args.rest() && settings.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(reformulator_removal_only_ask_internal(askable_precondition, mt, settings)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(askable_precondition, mt, settings));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29060L)
    public static SubLObject reformulation_precondition_right_directionP(final SubLObject precondition_direction, final SubLObject reformulation_direction) {
        return kb_utilities.kbeq(precondition_direction, reformulation_direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29233L)
    public static SubLObject unfold_precondition_struct(final SubLObject precondition_struct) {
        final SubLObject precondition_direction = precondition_struct_direction(precondition_struct);
        final SubLObject precondition = precondition_struct_precondition(precondition_struct);
        final SubLObject precondition_mt = precondition_struct_mt(precondition_struct);
        return Values.values(precondition_direction, precondition, precondition_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29597L)
    public static SubLObject precondition_struct_direction(final SubLObject precondition_struct) {
        return precondition_struct.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29703L)
    public static SubLObject precondition_struct_precondition(final SubLObject precondition_struct) {
        return conses_high.second(precondition_struct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29815L)
    public static SubLObject precondition_struct_mt(final SubLObject precondition_struct) {
        return conses_high.third(precondition_struct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 29916L)
    public static SubLObject reformulation_possible_with_source_rtP(final SubLObject expression, final SubLObject expression_forts, final SubLObject rr, final SubLObject direction_to_use) {
        final SubLObject rule_source_rt = reformulator_rule_unifier_datastructures.reformulator_rule_source_rt(rr, direction_to_use);
        return reformulation_possibleP(expression, expression_forts, rule_source_rt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier.lisp", position = 30505L)
    public static SubLObject reformulation_possibleP(final SubLObject expression, final SubLObject expression_forts, final SubLObject rt) {
        return list_utilities.sorted_subsetp(reformulator_rule_unifier_datastructures.reformulator_template_forts(rt), expression_forts, Symbols.symbol_function((SubLObject)reformulator_rule_unifier.EQL), (SubLObject)reformulator_rule_unifier.$sym30$FORT__, (SubLObject)reformulator_rule_unifier.UNPROVIDED);
    }
    
    public static SubLObject declare_reformulator_rule_unifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "rru_cost_estimate", "RRU-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "rru_reformulate_expression", "RRU-REFORMULATE-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_cost_estimate", "REFORMULATION-COST-ESTIMATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_match_expression_internal", "REFORMULATOR-MATCH-EXPRESSION-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_match_expression", "REFORMULATOR-MATCH-EXPRESSION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_match_expression_no_search", "REFORMULATOR-MATCH-EXPRESSION-NO-SEARCH", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_target_is_nonassertibleP", "REFORMULATOR-RULE-TARGET-IS-NONASSERTIBLE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_contracts_el_relationP", "REFORMULATOR-RULE-CONTRACTS-EL-RELATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_from_expansion_axiomP", "REFORMULATOR-RULE-FROM-EXPANSION-AXIOM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_unify_if_possible", "REFORMULATOR-RULE-UNIFY-IF-POSSIBLE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_unify", "REFORMULATOR-RULE-UNIFY", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_unify", "REFORMULATOR-UNIFY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "el_var_bindings_consistentP", "EL-VAR-BINDINGS-CONSISTENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "el_var_binding_inconsistentP", "EL-VAR-BINDING-INCONSISTENT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "car_hl_variable_p", "CAR-HL-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_justification_for_reformulator_rule", "FIND-JUSTIFICATION-FOR-REFORMULATOR-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "direction_to_apply_reformulator_rule", "DIRECTION-TO-APPLY-REFORMULATOR-RULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "direction_to_use_for_mode_in_mt", "DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "explicit_direction_to_use_for_mode_in_mt", "EXPLICIT-DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "default_direction_to_use_for_mode_in_mt", "DEFAULT-DIRECTION-TO-USE-FOR-MODE-IN-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_usable_direction_for_mode", "FIND-USABLE-DIRECTION-FOR-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "default_mode_directions_for_reformulator_rule", "DEFAULT-MODE-DIRECTIONS-FOR-REFORMULATOR-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "neither_directionP", "NEITHER-DIRECTION?", 1, 0, false);
        new $neither_directionP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_direction_accessible_from_mtP", "REFORMULATION-DIRECTION-ACCESSIBLE-FROM-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "direction_struct_direction", "DIRECTION-STRUCT-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "direction_struct_mt", "DIRECTION-STRUCT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_kb_reformulator_rules_to_use", "FIND-KB-REFORMULATOR-RULES-TO-USE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_usable_unassociated_rules_cached", "FIND-USABLE-UNASSOCIATED-RULES-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_usable_unassociated_rules_cached_int_internal", "FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_usable_unassociated_rules_cached_int", "FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_usable_unassociated_rules", "FIND-USABLE-UNASSOCIATED-RULES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_usableP", "REFORMULATOR-RULE-USABLE?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "find_all_superiors_for_forts", "FIND-ALL-SUPERIORS-FOR-FORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "order_reformulator_rules", "ORDER-REFORMULATOR-RULES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_accessible_from_mtP", "REFORMULATOR-RULE-ACCESSIBLE-FROM-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_in_mtP", "REFORMULATOR-RULE-IN-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_mentions_all_expression_fortsP", "REFORMULATOR-RULE-MENTIONS-ALL-EXPRESSION-FORTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_compatible_in_wff_degree", "REFORMULATOR-RULE-COMPATIBLE-IN-WFF-DEGREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_usable_in_any_modeP", "REFORMULATOR-RULE-USABLE-IN-ANY-MODE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_usable_in_modeP", "REFORMULATOR-RULE-USABLE-IN-MODE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "default_mode_directions_in_effect", "DEFAULT-MODE-DIRECTIONS-IN-EFFECT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "default_reformulation_direction_in_mode_overriddenP", "DEFAULT-REFORMULATION-DIRECTION-IN-MODE-OVERRIDDEN?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_rule_has_necessary_meta_predicateP", "REFORMULATOR-RULE-HAS-NECESSARY-META-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_preconditions_metP", "REFORMULATION-PRECONDITIONS-MET?", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_precondition_accessible_from_mtP", "REFORMULATION-PRECONDITION-ACCESSIBLE-FROM-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_precondition_metP", "REFORMULATION-PRECONDITION-MET?", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_removal_only_ask_internal", "REFORMULATOR-REMOVAL-ONLY-ASK-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulator_removal_only_ask", "REFORMULATOR-REMOVAL-ONLY-ASK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_precondition_right_directionP", "REFORMULATION-PRECONDITION-RIGHT-DIRECTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "unfold_precondition_struct", "UNFOLD-PRECONDITION-STRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "precondition_struct_direction", "PRECONDITION-STRUCT-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "precondition_struct_precondition", "PRECONDITION-STRUCT-PRECONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "precondition_struct_mt", "PRECONDITION-STRUCT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_possible_with_source_rtP", "REFORMULATION-POSSIBLE-WITH-SOURCE-RT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_rule_unifier", "reformulation_possibleP", "REFORMULATION-POSSIBLE?", 3, 0, false);
        return (SubLObject)reformulator_rule_unifier.NIL;
    }
    
    public static SubLObject init_reformulator_rule_unifier_file() {
        reformulator_rule_unifier.$reformulator_removal_only_ask_inference_parameters$ = SubLFiles.defconstant("*REFORMULATOR-REMOVAL-ONLY-ASK-INFERENCE-PARAMETERS*", (SubLObject)reformulator_rule_unifier.$list26);
        return (SubLObject)reformulator_rule_unifier.NIL;
    }
    
    public static SubLObject setup_reformulator_rule_unifier_file() {
        reformulator_module_harness.declare_rl_module(reformulator_rule_unifier.$const0$ReformulatorRuleUnifier, (SubLObject)reformulator_rule_unifier.$list1);
        memoization_state.note_memoized_function((SubLObject)reformulator_rule_unifier.$sym3$REFORMULATOR_MATCH_EXPRESSION);
        memoization_state.note_memoized_function((SubLObject)reformulator_rule_unifier.$sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT);
        memoization_state.note_memoized_function((SubLObject)reformulator_rule_unifier.$sym27$REFORMULATOR_REMOVAL_ONLY_ASK);
        return (SubLObject)reformulator_rule_unifier.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_rule_unifier_file();
    }
    
    public void initializeVariables() {
        init_reformulator_rule_unifier_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_rule_unifier_file();
    }
    
    static {
        me = (SubLFile)new reformulator_rule_unifier();
        reformulator_rule_unifier.$reformulator_removal_only_ask_inference_parameters$ = null;
        $const0$ReformulatorRuleUnifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorRuleUnifier"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("RRU-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("RRU-REFORMULATE-EXPRESSION"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("The fallback mechanism for the reformulator.\n    Unifies the input expression with applicable reformulator rules."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$implies (#$isa ?X #$Dog) (#$isa ?X #$Animal))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$genls #$Dog #$Animal)") });
        $kw2$KB = SubLObjectFactory.makeKeyword("KB");
        $sym3$REFORMULATOR_MATCH_EXPRESSION = SubLObjectFactory.makeSymbol("REFORMULATOR-MATCH-EXPRESSION");
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw5$NO_SEARCH = SubLObjectFactory.makeKeyword("NO-SEARCH");
        $int6$64 = SubLObjectFactory.makeInteger(64);
        $const7$notAssertible = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertible"));
        $sym8$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const9$ReformulationBackwardDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulationBackwardDirection"));
        $const10$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $const11$expansionAxiom = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansionAxiom"));
        $sym12$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym13$CDR = SubLObjectFactory.makeSymbol("CDR");
        $const14$ReformulationNeitherDirection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulationNeitherDirection"));
        $sym15$FIND_USABLE_UNASSOCIATED_RULES_CACHED_INT = SubLObjectFactory.makeSymbol("FIND-USABLE-UNASSOCIATED-RULES-CACHED-INT");
        $kw16$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym17$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $kw18$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $kw20$ARITY = SubLObjectFactory.makeKeyword("ARITY");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARITY"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $kw22$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym23$NEITHER_DIRECTION_ = SubLObjectFactory.makeSymbol("NEITHER-DIRECTION?");
        $sym24$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $kw25$REMOVAL_ONLY_ASK = SubLObjectFactory.makeKeyword("REMOVAL-ONLY-ASK");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)reformulator_rule_unifier.ONE_INTEGER);
        $sym27$REFORMULATOR_REMOVAL_ONLY_ASK = SubLObjectFactory.makeSymbol("REFORMULATOR-REMOVAL-ONLY-ASK");
        $kw28$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int29$256 = SubLObjectFactory.makeInteger(256);
        $sym30$FORT__ = SubLObjectFactory.makeSymbol("FORT-<");
    }
    
    public static final class $neither_directionP$UnaryFunction extends UnaryFunction
    {
        public $neither_directionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NEITHER-DIRECTION?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return reformulator_rule_unifier.neither_directionP(arg1);
        }
    }
}

/*

	Total time: 205 ms
	
*/