package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.unification;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_residual_transformation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation";
    public static final String myFingerPrint = "fa0e1e7a15aad8cd93245a36348b9ef299d6a346567109369fdd5ff06ed26e01";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 912L)
    private static SubLSymbol $residual_transformation_link_motivating_object_test$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36721L)
    private static SubLSymbol $residual_transformation_proof_bubbling_triggers_additional_restrictionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36837L)
    private static SubLSymbol $residual_transformation_proof_bubbling_opens_split_linksP$;
    private static final SubLSymbol $kw0$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $sym1$MAPPED_PROBLEM_P;
    private static final SubLSymbol $sym2$JOIN_ORDERED_LINK_P;
    private static final SubLSymbol $sym3$TRANSFORMATION_LINK_P;
    private static final SubLSymbol $kw4$JOIN_ORDERED;
    private static final SubLSymbol $sym5$RESIDUAL_TRANSFORMATION_LINK_P;
    private static final SubLSymbol $kw6$TRANSFORMATION;
    private static final SubLSymbol $sym7$HL_VAR_;
    private static final SubLSymbol $sym8$PROOF_P;
    private static final SubLSymbol $sym9$SINGLE_CLAUSE_PROBLEM_QUERY_P;
    private static final SubLInteger $int10$150;
    private static final SubLSymbol $sym11$RESIDUAL_TRANSFORMATION_PROOF_P;
    private static final SubLSymbol $sym12$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT;
    private static final SubLList $list15;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 1094L)
    public static SubLObject residual_transformation_link_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_p(v_object) && inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 1268L)
    public static SubLObject find_residual_transformation_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problem) {
        return inference_datastructures_problem_link.find_problem_link_of_type_between((SubLObject)inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION, supported_problem, supporting_mapped_problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 1496L)
    public static SubLObject new_residual_transformation_link(final SubLObject supporting_mapped_problem, final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_literal_map) {
        assert inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.mapped_problem_p(supporting_mapped_problem) : supporting_mapped_problem;
        assert inference_worker_residual_transformation.NIL != inference_worker_join_ordered.join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert inference_worker_residual_transformation.NIL != inference_worker_transformation.transformation_link_p(transformation_link) : transformation_link;
        final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem(supporting_mapped_problem);
        final SubLObject rt_link = inference_datastructures_problem_link.new_problem_link((SubLObject)inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION, motivating_conjunction_problem);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(supporting_mapped_problem, rt_link);
        set_residual_transformation_link_data(rt_link, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
        inference_datastructures_problem_store.add_problem_store_complex_problem(inference_datastructures_problem_link.problem_link_store(rt_link), supporting_problem);
        inference_datastructures_problem_link.problem_link_open_all(rt_link);
        inference_worker.propagate_problem_link(rt_link);
        return rt_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 2736L)
    public static SubLObject destroy_residual_transformation_link(final SubLObject rt_link) {
        return rt_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 2886L)
    public static SubLObject destroy_join_ordered_link_wrt_residual_transformation_links(final SubLObject jo_link) {
        final SubLObject motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_residual_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rt_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state, rt_link) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION) && inference_worker_residual_transformation.NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link)) {
                inference_datastructures_problem_link.destroy_problem_link(rt_link);
            }
        }
        return jo_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 3220L)
    public static SubLObject destroy_transformation_link_wrt_residual_transformation_links(final SubLObject t_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(t_link);
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject jo_link_var;
        SubLObject jo_link_var_$1;
        SubLObject motivating_conjunction_problem;
        SubLObject set_contents_var_$2;
        SubLObject basis_object_$3;
        SubLObject state_$4;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_residual_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            jo_link_var = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state, jo_link_var) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link_var, (SubLObject)inference_worker_residual_transformation.$kw4$JOIN_ORDERED)) {
                jo_link_var_$1 = jo_link_var;
                motivating_conjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link_var_$1);
                set_contents_var_$2 = inference_datastructures_problem.problem_argument_links(motivating_conjunction_problem);
                for (basis_object_$3 = set_contents.do_set_contents_basis_object(set_contents_var_$2), state_$4 = (SubLObject)inference_worker_residual_transformation.NIL, state_$4 = set_contents.do_set_contents_initial_state(basis_object_$3, set_contents_var_$2); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object_$3, state_$4); state_$4 = set_contents.do_set_contents_update_state(state_$4)) {
                    rt_link = set_contents.do_set_contents_next(basis_object_$3, state_$4);
                    if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state_$4, rt_link) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION) && inference_worker_residual_transformation.NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link_var_$1) && inference_worker_residual_transformation.NIL != residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link)) {
                        inference_datastructures_problem_link.destroy_problem_link(rt_link);
                    }
                }
            }
        }
        return t_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 3554L)
    public static SubLObject residual_transformation_link_supporting_mapped_problem(final SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_first_supporting_mapped_problem(rt_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 3745L)
    public static SubLObject residual_transformation_link_supporting_problem(final SubLObject rt_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(residual_transformation_link_supporting_mapped_problem(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 3921L)
    public static SubLObject residual_transformation_link_supporting_variable_map(final SubLObject rt_link) {
        final SubLObject supporting_mapped_problem = residual_transformation_link_supporting_mapped_problem(rt_link);
        if (inference_worker_residual_transformation.NIL != supporting_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_variable_map(supporting_mapped_problem);
        }
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 4247L)
    public static SubLObject residual_transformation_link_motivating_join_ordered_link(final SubLObject rt_link) {
        return inference_datastructures_problem_link.problem_link_data(rt_link).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 4379L)
    public static SubLObject residual_transformation_link_motivating_transformation_link(final SubLObject rt_link) {
        return conses_high.second(inference_datastructures_problem_link.problem_link_data(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 4514L)
    public static SubLObject residual_transformation_link_conjunctive_problem_dont_care_variable_map(final SubLObject rt_link) {
        return conses_high.third(inference_datastructures_problem_link.problem_link_data(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 4660L)
    public static SubLObject residual_transformation_link_residual_conjunction_literal_map(final SubLObject rt_link) {
        return conses_high.fourth(inference_datastructures_problem_link.problem_link_data(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 4797L)
    public static SubLObject residual_transformation_link_motivated_by_link_pairP(final SubLObject rt_link, final SubLObject jo_link, final SubLObject t_link) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_residual_transformation.NIL != residual_transformation_link_motivated_by_join_ordered_linkP(rt_link, jo_link) && inference_worker_residual_transformation.NIL != residual_transformation_link_motivated_by_transformation_linkP(rt_link, t_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 5178L)
    public static SubLObject residual_transformation_link_motivated_by_join_ordered_linkP(final SubLObject rt_link, final SubLObject jo_link) {
        return Equality.eq(jo_link, residual_transformation_link_motivating_join_ordered_link(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 5462L)
    public static SubLObject residual_transformation_link_motivated_by_transformation_linkP(final SubLObject rt_link, final SubLObject t_link) {
        return Equality.eq(t_link, residual_transformation_link_motivating_transformation_link(rt_link));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 5747L)
    public static SubLObject residual_transformation_link_residual_problem(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        return inference_worker_transformation.transformation_link_supporting_problem(t_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 5971L)
    public static SubLObject residual_transformation_link_rule_assertion(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        return inference_worker_transformation.transformation_link_rule_assertion(t_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 6186L)
    public static SubLObject residual_transformation_link_bindings(final SubLObject rt_link) {
        assert inference_worker_residual_transformation.NIL != residual_transformation_link_p(rt_link) : rt_link;
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject t_bindings = inference_worker_transformation.transformation_link_bindings(t_link);
        final SubLObject rt_bindings = bindings.apply_bindings(focal_variable_map, t_bindings);
        return rt_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 6813L)
    public static SubLObject residual_transformation_link_el_bindings(final SubLObject rt_link) {
        assert inference_worker_residual_transformation.NIL != residual_transformation_link_p(rt_link) : rt_link;
        final SubLObject rule_assertion = residual_transformation_link_rule_assertion(rt_link);
        final SubLObject rule_assertion_variable_map = inference_worker_transformation.rule_assertion_variable_map(rule_assertion);
        final SubLObject hl_bindings = residual_transformation_link_bindings(rt_link);
        final SubLObject el_bindings = bindings.apply_bindings_backwards(rule_assertion_variable_map, hl_bindings);
        final SubLObject canon_el_bindings = inference_worker_transformation.canonicalize_bindings_wrt_el_vars(el_bindings);
        return canon_el_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 7384L)
    public static SubLObject set_residual_transformation_link_data(final SubLObject rt_link, final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_literal_map) {
        inference_datastructures_problem_link.set_problem_link_data(rt_link, (SubLObject)ConsesLow.list(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map));
        return rt_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 7751L)
    public static SubLObject maybe_possibly_add_residual_transformation_links_via_join_ordered_link(final SubLObject join_ordered_link) {
        if (inference_worker_residual_transformation.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(join_ordered_link))) {
            return (SubLObject)inference_worker_residual_transformation.NIL;
        }
        return possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 8075L)
    public static SubLObject maybe_possibly_add_residual_transformation_links_via_transformation_link(final SubLObject transformation_link) {
        if (inference_worker_residual_transformation.NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(transformation_link))) {
            return (SubLObject)inference_worker_residual_transformation.NIL;
        }
        if (inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link)) {
            return possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
        }
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 8467L)
    public static SubLObject possibly_add_residual_transformation_links_via_join_ordered_link(final SubLObject join_ordered_link) {
        final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
        SubLObject total = (SubLObject)inference_worker_residual_transformation.ZERO_INTEGER;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject transformation_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_residual_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            transformation_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state, transformation_link) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, (SubLObject)inference_worker_residual_transformation.$kw6$TRANSFORMATION) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link) && inference_worker_residual_transformation.NIL != possibly_add_residual_transformation_link(join_ordered_link, transformation_link)) {
                total = Numbers.add(total, (SubLObject)inference_worker_residual_transformation.ONE_INTEGER);
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 8949L)
    public static SubLObject possibly_add_residual_transformation_links_via_transformation_link(final SubLObject transformation_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
        SubLObject total = (SubLObject)inference_worker_residual_transformation.ZERO_INTEGER;
        final SubLObject problem_var = supported_problem;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        SubLObject link_var;
        SubLObject cdolist_list_var;
        SubLObject conjunct_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_residual_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, (SubLObject)inference_worker_residual_transformation.$kw4$JOIN_ORDERED)) {
                link_var = join_ordered_link;
                cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                conjunct_mapped_problem = (SubLObject)inference_worker_residual_transformation.NIL;
                conjunct_mapped_problem = cdolist_list_var.first();
                while (inference_worker_residual_transformation.NIL != cdolist_list_var) {
                    if (inference_worker_residual_transformation.NIL != inference_macros.do_problem_link_open_matchP((SubLObject)inference_worker_residual_transformation.T, link_var, conjunct_mapped_problem) && problem_var.eql(inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem)) && inference_worker_residual_transformation.NIL != possibly_add_residual_transformation_link(join_ordered_link, transformation_link)) {
                        total = Numbers.add(total, (SubLObject)inference_worker_residual_transformation.ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct_mapped_problem = cdolist_list_var.first();
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 9464L)
    public static SubLObject possibly_add_residual_transformation_link(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
        thread.resetMultipleValues();
        final SubLObject residual_conjunction_query = compute_residual_transformation_link_query(join_ordered_link, transformation_link);
        final SubLObject residual_conjunction_free_hl_vars = thread.secondMultipleValue();
        final SubLObject conjunctive_problem_dont_care_variable_map = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject residual_conjunction_mapped_problem = inference_worker.find_or_create_problem(store, residual_conjunction_query, residual_conjunction_free_hl_vars, (SubLObject)inference_worker_residual_transformation.T);
        final SubLObject residual_conjunction_literal_map = compute_residual_conjunction_literal_map(join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_mapped_problem);
        return new_residual_transformation_link(residual_conjunction_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 10675L)
    public static SubLObject compute_residual_transformation_link_query(final SubLObject join_ordered_link, final SubLObject transformation_link) {
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject residual_mapped_problem = inference_worker_transformation.transformation_link_supporting_mapped_problem(transformation_link);
        final SubLObject residual_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_mapped_problem);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject focal_free_hl_vars = rt_apply_bindings_backwards(focal_variable_map, conses_high.intersection(bindings.bindings_values(focal_variable_map), supported_problem_free_hl_vars, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED));
        final SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
        final SubLObject transformation_link_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
        final SubLObject transformation_variable_map = bindings.apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
        final SubLObject transformation_content_bindings = filter_transformation_link_bindings(transformation_link_bindings);
        final SubLObject residual_query = inference_datastructures_problem.problem_query(residual_problem);
        final SubLObject residual_free_hl_vars = conses_high.intersection(cycl_utilities.expression_gather(residual_query, (SubLObject)inference_worker_residual_transformation.$sym7$HL_VAR_, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED), bindings.apply_bindings(transformation_variable_map, focal_free_hl_vars), (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
        final SubLObject residual_query_wrt_conjunct = rt_apply_bindings(transformation_variable_map, residual_query);
        final SubLObject residual_free_hl_vars_wrt_conjunct = rt_apply_bindings(transformation_variable_map, residual_free_hl_vars);
        final SubLObject residual_query_wrt_conjunction = rt_apply_bindings(focal_variable_map, residual_query_wrt_conjunct);
        final SubLObject residual_free_hl_vars_wrt_conjunction = rt_apply_bindings(focal_variable_map, residual_free_hl_vars_wrt_conjunct);
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
        final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        final SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
        final SubLObject non_focal_free_hl_vars = rt_apply_bindings_backwards(non_focal_variable_map, supported_problem_free_hl_vars);
        final SubLObject non_focal_query_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_query);
        final SubLObject non_focal_free_hl_vars_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_free_hl_vars);
        final SubLObject residual_conjunction_query_wrt_conjunction = conjoin_problem_queries(non_focal_query_wrt_conjunction, residual_query_wrt_conjunction);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunction = conses_high.union(non_focal_free_hl_vars_wrt_conjunction, residual_free_hl_vars_wrt_conjunction, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
        final SubLObject conjunctive_problem_dont_care_variable_map = compute_conjunctive_problem_dont_care_variable_map(non_focal_variable_map, focal_variable_map, transformation_link);
        final SubLObject residual_conjunction_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, residual_conjunction_query_wrt_conjunction);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, residual_conjunction_free_hl_vars_wrt_conjunction);
        final SubLObject residual_conjunction_query_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, residual_conjunction_query_wrt_conjunction_extended);
        final SubLObject residual_conjunction_free_hl_vars_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, residual_conjunction_free_hl_vars_wrt_conjunction_extended);
        final SubLObject residual_conjunction_query_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, residual_conjunction_query_wrt_conjunct);
        final SubLObject residual_conjunction_free_hl_vars_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, residual_conjunction_free_hl_vars_wrt_conjunct);
        final SubLObject residual_conjunction_query = bindings.apply_bindings_backwards(transformation_variable_map, residual_conjunction_query_wrt_focal_restricted);
        final SubLObject residual_conjunction_free_hl_vars_raw = list_utilities.fast_remove_duplicates(bindings.apply_bindings_backwards(transformation_variable_map, residual_conjunction_free_hl_vars_wrt_focal_restricted), (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
        final SubLObject residual_conjunction_query_vars = cycl_utilities.expression_gather(residual_conjunction_query, (SubLObject)inference_worker_residual_transformation.$sym7$HL_VAR_, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
        final SubLObject residual_conjunction_free_hl_vars = variables.sort_hl_variable_list(conses_high.intersection(residual_conjunction_free_hl_vars_raw, residual_conjunction_query_vars, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED));
        return Values.values(residual_conjunction_query, residual_conjunction_free_hl_vars, conjunctive_problem_dont_care_variable_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 21634L)
    public static SubLObject compute_residual_conjunction_literal_map(final SubLObject join_ordered_link, final SubLObject transformation_link, final SubLObject conjunctive_problem_dont_care_variable_map, final SubLObject residual_conjunction_mapped_problem) {
        final SubLObject focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(join_ordered_link);
        final SubLObject residual_mapped_problem = inference_worker_transformation.transformation_link_supporting_mapped_problem(transformation_link);
        final SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        final SubLObject residual_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_mapped_problem);
        final SubLObject transformation_link_bindings = inference_worker_transformation.transformation_link_bindings(transformation_link);
        final SubLObject transformation_variable_map = bindings.apply_bindings_backwards_to_values(transformation_link_bindings, residual_variable_map);
        final SubLObject transformation_content_bindings = filter_transformation_link_bindings(transformation_link_bindings);
        final SubLObject non_focal_mapped_problem = inference_worker_join_ordered.join_ordered_link_other_mapped_problem(join_ordered_link, focal_mapped_problem);
        final SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        final SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        final SubLObject non_focal_query = inference_datastructures_problem.problem_query(non_focal_problem);
        final SubLObject non_focal_query_wrt_conjunction = rt_apply_bindings(non_focal_variable_map, non_focal_query);
        final SubLObject conjunction_query = inference_datastructures_problem.problem_query(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
        final SubLObject conjunction_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, conjunction_query);
        final SubLObject non_focal_query_wrt_conjunction_extended = rt_apply_bindings(conjunctive_problem_dont_care_variable_map, non_focal_query_wrt_conjunction);
        final SubLObject non_focal_query_wrt_conjunct = bindings.apply_bindings_backwards(focal_variable_map, non_focal_query_wrt_conjunction_extended);
        final SubLObject non_focal_query_wrt_focal_restricted = rt_apply_bindings(transformation_content_bindings, non_focal_query_wrt_conjunct);
        final SubLObject non_focal_query_wrt_residual_conjunction = bindings.apply_bindings_backwards(transformation_variable_map, non_focal_query_wrt_focal_restricted);
        final SubLObject actual_residual_conjunction_problem = inference_datastructures_problem_link.mapped_problem_problem(residual_conjunction_mapped_problem);
        final SubLObject actual_residual_conjunction_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(residual_conjunction_mapped_problem);
        final SubLObject actual_residual_conjunction_query = inference_datastructures_problem.problem_query(actual_residual_conjunction_problem);
        final SubLObject non_focal_query_wrt_actual_residual_conjunction = bindings.apply_bindings_backwards(actual_residual_conjunction_variable_map, non_focal_query_wrt_residual_conjunction);
        final SubLObject residual_conjunction_literal_map = compute_residual_conjunction_literal_map_internal(conjunction_query_wrt_conjunction_extended, non_focal_query_wrt_conjunction_extended, non_focal_query_wrt_actual_residual_conjunction, actual_residual_conjunction_query);
        return residual_conjunction_literal_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 25765L)
    public static SubLObject compute_residual_conjunction_literal_map_internal(final SubLObject conjunction_query_wrt_conjunction_extended, final SubLObject non_focal_query_wrt_conjunction_extended, final SubLObject non_focal_query_wrt_actual_residual_conjunction, final SubLObject actual_residual_conjunction_query) {
        final SubLObject conjunction_clause = conjunction_query_wrt_conjunction_extended.first();
        final SubLObject non_focal_wrt_conjunction_clause = non_focal_query_wrt_conjunction_extended.first();
        final SubLObject non_focal_wrt_residual_conjunction_clause = non_focal_query_wrt_actual_residual_conjunction.first();
        final SubLObject residual_conjunction_clause = actual_residual_conjunction_query.first();
        final SubLObject conj_pos_lits = clauses.pos_lits(conjunction_clause);
        final SubLObject nf_conj_pos_lits = clauses.pos_lits(non_focal_wrt_conjunction_clause);
        final SubLObject nf_res_conj_pos_lits = clauses.pos_lits(non_focal_wrt_residual_conjunction_clause);
        final SubLObject res_conj_pos_lits = clauses.pos_lits(residual_conjunction_clause);
        SubLObject pos_lit_map = (SubLObject)inference_worker_residual_transformation.NIL;
        SubLObject cdolist_list_var = conj_pos_lits;
        SubLObject conj_pos_lit = (SubLObject)inference_worker_residual_transformation.NIL;
        conj_pos_lit = cdolist_list_var.first();
        while (inference_worker_residual_transformation.NIL != cdolist_list_var) {
            final SubLObject conj_index = Sequences.position(conj_pos_lit, nf_conj_pos_lits, Symbols.symbol_function((SubLObject)inference_worker_residual_transformation.EQUAL), (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
            SubLObject res_conj_index = (SubLObject)inference_worker_residual_transformation.$kw6$TRANSFORMATION;
            if (inference_worker_residual_transformation.NIL != conj_index) {
                final SubLObject nf_res_conj_pos_lit = ConsesLow.nth(conj_index, nf_res_conj_pos_lits);
                res_conj_index = Sequences.position(nf_res_conj_pos_lit, res_conj_pos_lits, Symbols.symbol_function((SubLObject)inference_worker_residual_transformation.EQUAL), (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED, (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
            }
            pos_lit_map = (SubLObject)ConsesLow.cons(res_conj_index, pos_lit_map);
            cdolist_list_var = cdolist_list_var.rest();
            conj_pos_lit = cdolist_list_var.first();
        }
        pos_lit_map = Sequences.nreverse(pos_lit_map);
        final SubLObject literal_map = (SubLObject)ConsesLow.list((SubLObject)inference_worker_residual_transformation.NIL, pos_lit_map);
        return literal_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 27818L)
    public static SubLObject new_residual_transformation_proof(final SubLObject rt_link, final SubLObject subproof, final SubLObject variable_map) {
        assert inference_worker_residual_transformation.NIL != residual_transformation_link_p(rt_link) : rt_link;
        assert inference_worker_residual_transformation.NIL != inference_datastructures_proof.proof_p(subproof) : subproof;
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject t_link_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link));
        final SubLObject transformation_bindings = inference_worker_transformation.transformation_link_bindings(t_link);
        final SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
        final SubLObject residual_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject focal_bindings = inference_worker_transformation.compute_canonical_transformation_proof_bindings(t_link_variable_map, transformation_bindings, residual_bindings);
        final SubLObject focal_to_motivating_conjunction_variable_map = inference_worker_join_ordered.join_ordered_link_focal_to_supported_variable_map(jo_link);
        final SubLObject motivating_conjunction_bindings_b = bindings.transfer_variable_map_to_bindings_filtered(focal_to_motivating_conjunction_variable_map, focal_bindings);
        final SubLObject extended_extended_non_focal_bindings = residual_bindings;
        final SubLObject conjunctive_problem_dont_care_variable_map = residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link);
        final SubLObject motivating_conjunction_bindings_a = bindings.transfer_variable_map_to_bindings_backwards_filtered(conjunctive_problem_dont_care_variable_map, extended_extended_non_focal_bindings);
        final SubLObject motivating_conjunction_bindings = ConsesLow.append(motivating_conjunction_bindings_a, motivating_conjunction_bindings_b);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(motivating_conjunction_bindings);
        return inference_worker.propose_new_proof_with_bindings(rt_link, canonical_proof_bindings, (SubLObject)ConsesLow.list(subproof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 30634L)
    public static SubLObject residual_transformation_proof_rule_bindings(final SubLObject residual_transformation_proof) {
        final SubLObject rt_link = inference_datastructures_proof.proof_link(residual_transformation_proof);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject subproof = residual_transformation_proof_subproof(residual_transformation_proof);
        final SubLObject supporting_subproof_bindings = inference_datastructures_proof.proof_bindings(subproof);
        final SubLObject variable_map = residual_transformation_link_supporting_variable_map(rt_link);
        final SubLObject residual_bindings = bindings.transfer_variable_map_to_bindings_filtered(variable_map, supporting_subproof_bindings);
        final SubLObject rule_bindings = inference_worker_transformation.compute_transformation_link_rule_bindings(t_link, residual_bindings);
        return rule_bindings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 31429L)
    public static SubLObject residual_transformation_proof_motivating_transformation_link(final SubLObject residual_transformation_proof) {
        return residual_transformation_link_motivating_transformation_link(inference_datastructures_proof.proof_link(residual_transformation_proof));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 31655L)
    public static SubLObject residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map(final SubLObject rt_link) {
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(rt_link);
        final SubLObject jo_link = residual_transformation_link_motivating_join_ordered_link(rt_link);
        final SubLObject residual_conjunction_to_residual_variable_map = residual_transformation_link_supporting_variable_map(rt_link);
        final SubLObject residual_to_extended_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link));
        final SubLObject extended_focal_to_focal_variable_map = bindings.invert_bindings(inference_worker_transformation.transformation_link_bindings(t_link));
        final SubLObject focal_to_supported_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link));
        final SubLObject residual_conjunction_to_extended_focal_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_residual_variable_map, residual_to_extended_focal_variable_map);
        final SubLObject residual_conjunction_to_focal_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_extended_focal_variable_map, extended_focal_to_focal_variable_map);
        final SubLObject residual_conjunction_to_supported_variable_map = bindings.compose_bindings_filtered(residual_conjunction_to_focal_variable_map, focal_to_supported_variable_map);
        return residual_conjunction_to_supported_variable_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 33262L)
    public static SubLObject conjoin_problem_queries(final SubLObject query1, final SubLObject query2) {
        assert inference_worker_residual_transformation.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query1) : query1;
        assert inference_worker_residual_transformation.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(query2) : query2;
        final SubLObject clause1 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query1);
        final SubLObject clause2 = inference_datastructures_problem_query.sole_contextualized_clause_from_single_clause_problem_query(query2);
        return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(inference_worker_transformation.merge_dnf(clause1, clause2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 33763L)
    public static SubLObject rt_apply_bindings(final SubLObject v_bindings, final SubLObject tree) {
        return bindings.apply_bindings(v_bindings, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 33854L)
    public static SubLObject rt_apply_bindings_backwards(final SubLObject v_bindings, final SubLObject tree) {
        return bindings.apply_bindings_backwards(v_bindings, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 33965L)
    public static SubLObject compute_conjunctive_problem_dont_care_variable_map(final SubLObject non_focal_variable_map, final SubLObject focal_variable_map, final SubLObject transformation_link) {
        SubLObject conjunctive_problem_dont_care_variable_map = (SubLObject)inference_worker_residual_transformation.NIL;
        final SubLObject dont_care_vars_from_non_focal_wrt_conjunction = list_utilities.fast_set_difference(bindings.bindings_values(non_focal_variable_map), bindings.bindings_values(focal_variable_map), (SubLObject)inference_worker_residual_transformation.UNPROVIDED);
        SubLObject extended_extended_variable_number;
        final SubLObject first_available_non_base_variable_number = extended_extended_variable_number = transformation_link_first_unused_extended_var_number(transformation_link);
        SubLObject cdolist_list_var = dont_care_vars_from_non_focal_wrt_conjunction;
        SubLObject dont_care_var = (SubLObject)inference_worker_residual_transformation.NIL;
        dont_care_var = cdolist_list_var.first();
        while (inference_worker_residual_transformation.NIL != cdolist_list_var) {
            final SubLObject extended_extended_variable = variables.find_variable_by_id(extended_extended_variable_number);
            conjunctive_problem_dont_care_variable_map = bindings.add_variable_binding(dont_care_var, extended_extended_variable, conjunctive_problem_dont_care_variable_map);
            extended_extended_variable_number = Numbers.add(extended_extended_variable_number, (SubLObject)inference_worker_residual_transformation.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            dont_care_var = cdolist_list_var.first();
        }
        return conjunctive_problem_dont_care_variable_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 35025L)
    public static SubLObject transformation_link_first_unused_extended_var_number(final SubLObject transformation_link) {
        return (SubLObject)inference_worker_residual_transformation.$int10$150;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 35169L)
    public static SubLObject filter_transformation_link_bindings(final SubLObject transformation_link_bindings) {
        SubLObject supported_problem_bindings = (SubLObject)inference_worker_residual_transformation.NIL;
        SubLObject cdolist_list_var = transformation_link_bindings;
        SubLObject binding = (SubLObject)inference_worker_residual_transformation.NIL;
        binding = cdolist_list_var.first();
        while (inference_worker_residual_transformation.NIL != cdolist_list_var) {
            final SubLObject variable = bindings.variable_binding_value(binding);
            if (inference_worker_residual_transformation.NIL == unification.non_base_variable_p(variable)) {
                supported_problem_bindings = (SubLObject)ConsesLow.cons(binding, supported_problem_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Sequences.nreverse(supported_problem_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36203L)
    public static SubLObject residual_transformation_proof_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_worker_residual_transformation.NIL != inference_datastructures_proof.proof_p(v_object) && inference_worker_residual_transformation.NIL != residual_transformation_link_p(inference_datastructures_proof.proof_link(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36363L)
    public static SubLObject residual_transformation_proof_rule_assertion(final SubLObject proof) {
        final SubLObject rt_link = inference_datastructures_proof.proof_link(proof);
        return residual_transformation_link_rule_assertion(rt_link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36537L)
    public static SubLObject residual_transformation_proof_subproof(final SubLObject proof) {
        assert inference_worker_residual_transformation.NIL != residual_transformation_proof_p(proof) : proof;
        return inference_datastructures_proof.proof_first_subproof(proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 36918L)
    public static SubLObject bubble_up_proof_to_residual_transformation_link(final SubLObject conjunction_proof, final SubLObject conjunction_variable_map, final SubLObject rt_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof = new_residual_transformation_proof(rt_link, conjunction_proof, conjunction_variable_map);
        final SubLObject newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (inference_worker_residual_transformation.NIL != newP) {
            inference_worker.bubble_up_proof(proof);
        }
        else {
            inference_worker.possibly_note_proof_processed(conjunction_proof);
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 37279L)
    public static SubLObject residual_transformation_proof_abnormalP(final SubLObject residual_transformation_proof) {
        final SubLObject link = inference_datastructures_proof.proof_link(residual_transformation_proof);
        final SubLObject store = inference_datastructures_problem_link.problem_link_store(link);
        final SubLObject rule = residual_transformation_link_rule_assertion(link);
        final SubLObject t_link = residual_transformation_link_motivating_transformation_link(link);
        final SubLObject transformation_mt = inference_worker_transformation.transformation_link_transformation_mt(t_link);
        final SubLObject rule_bindings = residual_transformation_proof_rule_bindings(residual_transformation_proof);
        return abnormal.rule_bindings_abnormalP(store, rule, rule_bindings, transformation_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 37927L)
    public static SubLObject problem_is_a_residual_conjunctionP(final SubLObject problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject rt_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_worker_residual_transformation.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_worker_residual_transformation.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rt_link = set_contents.do_set_contents_next(basis_object, state);
            if (inference_worker_residual_transformation.NIL != set_contents.do_set_contents_element_validP(state, rt_link) && inference_worker_residual_transformation.NIL != inference_datastructures_problem_link.problem_link_has_typeP(rt_link, (SubLObject)inference_worker_residual_transformation.$kw0$RESIDUAL_TRANSFORMATION)) {
                return (SubLObject)inference_worker_residual_transformation.T;
            }
        }
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 38110L)
    public static SubLObject problem_store_problematic_residual_transformation_links(final SubLObject store) {
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 38245L)
    public static SubLObject problem_store_problematic_residual_transformation_link_count(final SubLObject store) {
        return Sequences.length(problem_store_problematic_residual_transformation_links(store));
    }
    
    public static SubLObject declare_inference_worker_residual_transformation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_p", "RESIDUAL-TRANSFORMATION-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "find_residual_transformation_link", "FIND-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "new_residual_transformation_link", "NEW-RESIDUAL-TRANSFORMATION-LINK", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "destroy_residual_transformation_link", "DESTROY-RESIDUAL-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "destroy_join_ordered_link_wrt_residual_transformation_links", "DESTROY-JOIN-ORDERED-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "destroy_transformation_link_wrt_residual_transformation_links", "DESTROY-TRANSFORMATION-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_supporting_mapped_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_supporting_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_supporting_variable_map", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_motivating_join_ordered_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-JOIN-ORDERED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_conjunctive_problem_dont_care_variable_map", "RESIDUAL-TRANSFORMATION-LINK-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_residual_conjunction_literal_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-LITERAL-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_motivated_by_link_pairP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-LINK-PAIR?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_motivated_by_join_ordered_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_motivated_by_transformation_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_residual_problem", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_rule_assertion", "RESIDUAL-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_bindings", "RESIDUAL-TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_el_bindings", "RESIDUAL-TRANSFORMATION-LINK-EL-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "set_residual_transformation_link_data", "SET-RESIDUAL-TRANSFORMATION-LINK-DATA", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "maybe_possibly_add_residual_transformation_links_via_join_ordered_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "maybe_possibly_add_residual_transformation_links_via_transformation_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "possibly_add_residual_transformation_links_via_join_ordered_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "possibly_add_residual_transformation_links_via_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "possibly_add_residual_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "compute_residual_transformation_link_query", "COMPUTE-RESIDUAL-TRANSFORMATION-LINK-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "compute_residual_conjunction_literal_map", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "compute_residual_conjunction_literal_map_internal", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "new_residual_transformation_proof", "NEW-RESIDUAL-TRANSFORMATION-PROOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_rule_bindings", "RESIDUAL-TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-PROOF-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-TO-MOTIVATING-CONJUNCTION-VARIABLE-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "conjoin_problem_queries", "CONJOIN-PROBLEM-QUERIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "rt_apply_bindings", "RT-APPLY-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "rt_apply_bindings_backwards", "RT-APPLY-BINDINGS-BACKWARDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "compute_conjunctive_problem_dont_care_variable_map", "COMPUTE-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "transformation_link_first_unused_extended_var_number", "TRANSFORMATION-LINK-FIRST-UNUSED-EXTENDED-VAR-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "filter_transformation_link_bindings", "FILTER-TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_p", "RESIDUAL-TRANSFORMATION-PROOF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_rule_assertion", "RESIDUAL-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_subproof", "RESIDUAL-TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "bubble_up_proof_to_residual_transformation_link", "BUBBLE-UP-PROOF-TO-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "residual_transformation_proof_abnormalP", "RESIDUAL-TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "problem_is_a_residual_conjunctionP", "PROBLEM-IS-A-RESIDUAL-CONJUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "problem_store_problematic_residual_transformation_links", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_worker_residual_transformation", "problem_store_problematic_residual_transformation_link_count", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    public static SubLObject init_inference_worker_residual_transformation_file() {
        inference_worker_residual_transformation.$residual_transformation_link_motivating_object_test$ = SubLFiles.deflexical("*RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-OBJECT-TEST*", Symbols.symbol_function((SubLObject)inference_worker_residual_transformation.EQUAL));
        inference_worker_residual_transformation.$residual_transformation_proof_bubbling_triggers_additional_restrictionsP$ = SubLFiles.defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-TRIGGERS-ADDITIONAL-RESTRICTIONS?*", (SubLObject)inference_worker_residual_transformation.NIL);
        inference_worker_residual_transformation.$residual_transformation_proof_bubbling_opens_split_linksP$ = SubLFiles.defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-OPENS-SPLIT-LINKS?*", (SubLObject)inference_worker_residual_transformation.NIL);
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    public static SubLObject setup_inference_worker_residual_transformation_file() {
        access_macros.define_obsolete_register((SubLObject)inference_worker_residual_transformation.$sym12$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, (SubLObject)inference_worker_residual_transformation.$list13);
        access_macros.define_obsolete_register((SubLObject)inference_worker_residual_transformation.$sym14$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, (SubLObject)inference_worker_residual_transformation.$list15);
        return (SubLObject)inference_worker_residual_transformation.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_worker_residual_transformation_file();
    }
    
    public void initializeVariables() {
        init_inference_worker_residual_transformation_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_worker_residual_transformation_file();
    }
    
    static {
        me = (SubLFile)new inference_worker_residual_transformation();
        inference_worker_residual_transformation.$residual_transformation_link_motivating_object_test$ = null;
        inference_worker_residual_transformation.$residual_transformation_proof_bubbling_triggers_additional_restrictionsP$ = null;
        inference_worker_residual_transformation.$residual_transformation_proof_bubbling_opens_split_linksP$ = null;
        $kw0$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $sym1$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $sym2$JOIN_ORDERED_LINK_P = SubLObjectFactory.makeSymbol("JOIN-ORDERED-LINK-P");
        $sym3$TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-P");
        $kw4$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $sym5$RESIDUAL_TRANSFORMATION_LINK_P = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");
        $kw6$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $sym7$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym8$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym9$SINGLE_CLAUSE_PROBLEM_QUERY_P = SubLObjectFactory.makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");
        $int10$150 = SubLObjectFactory.makeInteger(150);
        $sym11$RESIDUAL_TRANSFORMATION_PROOF_P = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-P");
        $sym12$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym14$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZERO"));
    }
}

/*

	Total time: 160 ms
	
*/