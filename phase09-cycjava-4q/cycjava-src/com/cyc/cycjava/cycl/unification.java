package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.unification";
    public static final String myFingerPrint = "281a0a2414500e81a21d7cf3192908c5e306d1c9e424872abe9b6db1476891ee";
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 544L)
    public static SubLSymbol $unify_term_variable_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 841L)
    public static SubLSymbol $unify_possible_cons_function$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 907L)
    public static SubLSymbol $unify_cons_function$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 964L)
    public static SubLSymbol $unify_multipleP$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 1107L)
    public static SubLSymbol $computing_variable_mapP$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 1290L)
    public static SubLSymbol $unify_return_justificationP$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 11919L)
    public static SubLSymbol $unify_narts_with_hl_formulasP$;
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15228L)
    private static SubLSymbol $variable_base_max$;
    private static final SubLSymbol $kw0$DEFAULT;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$BINDINGS_P;
    private static final SubLSymbol $kw4$UNIFY_FAILURE;
    private static final SubLSymbol $kw5$EQUALITY;
    private static final SubLObject $const6$equals;
    private static final SubLInteger $int7$100;
    private static final SubLSymbol $sym8$VARIABLE_P;
    private static final SubLSymbol $sym9$BASE_VARIABLE_P;
    private static final SubLSymbol $sym10$VARIABLE_NON_BASE_VERSION;
    private static final SubLSymbol $sym11$NON_BASE_VARIABLE_P;
    private static final SubLSymbol $sym12$VARIABLE_BASE_VERSION;
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 1462L)
    public static SubLObject with_unifier_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)unification.$sym1$CLET, (SubLObject)unification.$list2, ConsesLow.append(body, (SubLObject)unification.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 1584L)
    public static SubLObject unify_possible(final SubLObject obj1, final SubLObject obj2) {
        return unify_possible_recursive(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 1865L)
    public static SubLObject unify_impossible(final SubLObject obj1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(unification.NIL == unify_possible_recursive(obj1, obj2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 2076L)
    public static SubLObject unify_possible_recursive(final SubLObject obj1, final SubLObject obj2) {
        if (obj1.eql(obj2)) {
            return (SubLObject)unification.T;
        }
        if (unification.NIL != variables.variable_p(obj1)) {
            return (SubLObject)unification.T;
        }
        if (unification.NIL != variables.variable_p(obj2)) {
            return (SubLObject)unification.T;
        }
        if (unification.NIL != term_variable_p(obj1) && unification.NIL != term_variable_p(obj2)) {
            return unify_possible_term_variable(obj1, obj2);
        }
        if (unification.NIL != forts.fort_p(obj1)) {
            return unify_possible_fort(obj1, obj2);
        }
        if (unification.NIL != forts.fort_p(obj2)) {
            return unify_possible_fort(obj2, obj1);
        }
        if (obj1.isCons() && obj2.isCons()) {
            return unify_possible_cons(obj1, obj2);
        }
        if (obj1.isAtom() && obj2.isAtom()) {
            return unify_possible_atom(obj1, obj2);
        }
        return (SubLObject)unification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 2938L)
    public static SubLObject unify_possible_term_variable(final SubLObject term_variable1, final SubLObject term_variable2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL == unification.$unify_term_variable_enabledP$.getDynamicValue(thread)) {
            return unify_possible_atom(term_variable1, term_variable2);
        }
        return (SubLObject)unification.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 3223L)
    public static SubLObject unify_possible_fort(final SubLObject fort1, final SubLObject obj2) {
        if (unification.NIL == obj2) {
            return (SubLObject)unification.NIL;
        }
        if (unification.NIL != constant_handles.constant_p(fort1)) {
            return unify_possible_constant(fort1, obj2);
        }
        if (unification.NIL != constant_handles.constant_p(obj2)) {
            return unify_possible_constant(obj2, fort1);
        }
        if (unification.NIL != variables.fully_bound_p(obj2) && unification.NIL != equals.equalsP(fort1, obj2, (SubLObject)unification.UNPROVIDED, (SubLObject)unification.UNPROVIDED)) {
            return (SubLObject)unification.T;
        }
        if (obj2.isCons()) {
            final SubLObject formula1 = narts_high.nart_hl_formula(fort1);
            return unify_possible_cons(formula1, obj2);
        }
        return (SubLObject)unification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 3759L)
    public static SubLObject unify_possible_constant(final SubLObject constant1, final SubLObject obj2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(unification.NIL != variables.fully_bound_p(obj2) && unification.NIL != equals.equalsP(constant1, obj2, (SubLObject)unification.UNPROVIDED, (SubLObject)unification.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 3951L)
    public static SubLObject unify_possible_cons(final SubLObject cons1, final SubLObject cons2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = unification.$unify_possible_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)unification.$kw0$DEFAULT)) {
            return unify_possible_cons_default(cons1, cons2);
        }
        return Functions.funcall(unification.$unify_possible_cons_function$.getDynamicValue(thread), cons1, cons2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 4247L)
    public static SubLObject unify_possible_cons_default(final SubLObject cons1, final SubLObject cons2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(unification.NIL != unify_possible_recursive(cons1.first(), cons2.first()) && unification.NIL != unify_possible_recursive(cons1.rest(), cons2.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 4430L)
    public static SubLObject unify_possible_atom(final SubLObject atom1, final SubLObject atom2) {
        if (atom1.isNumber() && atom2.isNumber()) {
            return arithmetic.cyc_numerically_equal(atom1, atom2);
        }
        return Equality.equal(atom1, atom2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 4705L)
    public static SubLObject unify(final SubLObject obj_trans, final SubLObject obj, SubLObject share_varsP, SubLObject justifyP) {
        if (share_varsP == unification.UNPROVIDED) {
            share_varsP = (SubLObject)unification.NIL;
        }
        if (justifyP == unification.UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unify_assuming_bindings(obj_trans, obj, share_varsP, (SubLObject)unification.NIL, justifyP);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(v_bindings, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 5920L)
    public static SubLObject unify_assuming_bindings(SubLObject obj_trans, final SubLObject obj, SubLObject share_varsP, SubLObject assume_bindings, SubLObject justifyP) {
        if (share_varsP == unification.UNPROVIDED) {
            share_varsP = (SubLObject)unification.NIL;
        }
        if (assume_bindings == unification.UNPROVIDED) {
            assume_bindings = (SubLObject)unification.NIL;
        }
        if (justifyP == unification.UNPROVIDED) {
            justifyP = unification.$unify_return_justificationP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_unification_attempt_historical_count();
        if (unification.NIL != unify_possible(obj_trans, obj)) {
            if (unification.NIL == share_varsP) {
                obj_trans = pre_unify_replace_variables(obj_trans);
            }
            SubLObject result_bindings = (SubLObject)unification.NIL;
            SubLObject justification = (SubLObject)unification.NIL;
            SubLObject successP = (SubLObject)unification.NIL;
            final SubLObject _prev_bind_0 = unification.$unify_return_justificationP$.currentBinding(thread);
            try {
                unification.$unify_return_justificationP$.bind(justifyP, thread);
                thread.resetMultipleValues();
                final SubLObject result_bindings_$1 = unify_internal(obj_trans, obj, assume_bindings);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                final SubLObject successP_$3 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                result_bindings = result_bindings_$1;
                justification = justification_$2;
                successP = successP_$3;
            }
            finally {
                unification.$unify_return_justificationP$.rebind(_prev_bind_0, thread);
            }
            if (unification.NIL != successP) {
                inference_metrics.increment_unification_success_historical_count();
                if (unification.NIL == result_bindings) {
                    return subl_promotions.values2(bindings.unification_success_token(), justification);
                }
                if (unification.NIL != set.set_p(result_bindings)) {
                    final SubLObject new_set = set.new_set(Symbols.symbol_function((SubLObject)unification.EQUAL), (SubLObject)unification.UNPROVIDED);
                    final SubLObject set_contents_var = set.do_set_internal(result_bindings);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject v_bindings;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)unification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); unification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        v_bindings = set_contents.do_set_contents_next(basis_object, state);
                        if (unification.NIL != set_contents.do_set_contents_element_validP(state, v_bindings)) {
                            assert unification.NIL != bindings.bindings_p(v_bindings) : v_bindings;
                            set.set_add(Sequences.nreverse(conses_high.copy_tree(v_bindings)), new_set);
                        }
                    }
                    return subl_promotions.values2(new_set, justification);
                }
                return subl_promotions.values2(Sequences.nreverse(conses_high.copy_tree(result_bindings)), justification);
            }
        }
        return subl_promotions.values2((SubLObject)unification.NIL, (SubLObject)unification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 7287L)
    public static SubLObject unify_internal(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_bindings = (SubLObject)unification.NIL;
        SubLObject justification = (SubLObject)unification.NIL;
        SubLObject successP = (SubLObject)unification.NIL;
        SubLObject catch_var = (SubLObject)unification.NIL;
        try {
            thread.throwStack.push(unification.$kw4$UNIFY_FAILURE);
            thread.resetMultipleValues();
            final SubLObject result_bindings_$4 = unify_recursive(obj1, obj2, v_bindings);
            final SubLObject justification_$5 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result_bindings = result_bindings_$4;
            justification = justification_$5;
            successP = (SubLObject)unification.T;
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)unification.$kw4$UNIFY_FAILURE);
        }
        finally {
            thread.throwStack.pop();
        }
        return subl_promotions.values3(result_bindings, justification, successP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 7629L)
    public static SubLObject unify_failure(final SubLObject obj1, final SubLObject obj2) {
        return Dynamic.sublisp_throw((SubLObject)unification.$kw4$UNIFY_FAILURE, (SubLObject)unification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 7807L)
    public static SubLObject unify_recursive(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL == unification.$unify_multipleP$.getDynamicValue(thread)) {
            return unify_recursive_internal(obj1, obj2, v_bindings);
        }
        if (unification.NIL == set.set_p(v_bindings)) {
            return unify_recursive_internal(obj1, obj2, v_bindings);
        }
        SubLObject ans_bindings = (SubLObject)unification.NIL;
        SubLObject some_successP = (SubLObject)unification.NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_bindings);
        SubLObject basis_object;
        SubLObject state;
        SubLObject one_bindings;
        SubLObject new_bindings;
        SubLObject justification;
        SubLObject successP;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)unification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); unification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            one_bindings = set_contents.do_set_contents_next(basis_object, state);
            if (unification.NIL != set_contents.do_set_contents_element_validP(state, one_bindings)) {
                thread.resetMultipleValues();
                new_bindings = unify_internal(obj1, obj2, one_bindings);
                justification = thread.secondMultipleValue();
                successP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (unification.NIL != successP) {
                    some_successP = (SubLObject)unification.T;
                    ans_bindings = add_bindings_to_answer(new_bindings, ans_bindings);
                }
            }
        }
        if (unification.NIL != some_successP) {
            return subl_promotions.values2(ans_bindings, (SubLObject)unification.NIL);
        }
        return unify_failure(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 8534L)
    public static SubLObject add_bindings_to_answer(final SubLObject new_bindings, SubLObject v_answer) {
        if (unification.NIL != set.set_p(new_bindings)) {
            final SubLObject set_contents_var = set.do_set_internal(new_bindings);
            SubLObject basis_object;
            SubLObject state;
            SubLObject one_new_bindings;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)unification.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); unification.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                one_new_bindings = set_contents.do_set_contents_next(basis_object, state);
                if (unification.NIL != set_contents.do_set_contents_element_validP(state, one_new_bindings)) {
                    assert unification.NIL != bindings.bindings_p(one_new_bindings) : one_new_bindings;
                    v_answer = add_bindings_to_answer(one_new_bindings, v_answer);
                }
            }
        }
        else if (unification.NIL == v_answer) {
            v_answer = new_bindings;
        }
        else if (unification.NIL != set.set_p(v_answer)) {
            set.set_add(new_bindings, v_answer);
        }
        else {
            v_answer = set_utilities.new_singleton_set(v_answer, Symbols.symbol_function((SubLObject)unification.EQUAL));
            set.set_add(new_bindings, v_answer);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 9182L)
    public static SubLObject unify_recursive_internal(final SubLObject obj1, final SubLObject obj2, final SubLObject v_bindings) {
        if (obj1.eql(obj2)) {
            return subl_promotions.values2(v_bindings, (SubLObject)unification.NIL);
        }
        if (unification.NIL != variables.variable_p(obj1)) {
            return unify_variable(obj1, obj2, v_bindings);
        }
        if (unification.NIL != variables.variable_p(obj2)) {
            return unify_variable(obj2, obj1, v_bindings);
        }
        if (unification.NIL != term_variable_p(obj1) && unification.NIL != term_variable_p(obj2)) {
            return unify_term_variable(obj1, obj2, v_bindings);
        }
        if (unification.NIL != forts.fort_p(obj1)) {
            return unify_fort(obj1, obj2, v_bindings);
        }
        if (unification.NIL != forts.fort_p(obj2)) {
            return unify_fort(obj2, obj1, v_bindings);
        }
        if (obj1.isCons() && obj2.isCons()) {
            return unify_cons(obj1, obj2, v_bindings);
        }
        if (obj1.isAtom() && obj2.isAtom()) {
            return unify_atom(obj1, obj2, v_bindings);
        }
        return unify_failure(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 10119L)
    public static SubLObject unify_variable(final SubLObject variable, final SubLObject v_object, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL != bindings.variable_bound_p(variable, v_bindings)) {
            return unify_recursive(v_object, bindings.variable_lookup(variable, v_bindings), v_bindings);
        }
        if (unification.NIL != variables.variable_p(v_object) && unification.NIL != bindings.variable_bound_p(v_object, v_bindings)) {
            return unify_variable(v_object, variable, v_bindings);
        }
        if (unification.NIL != unification_occurs_check(variable, v_object, v_bindings)) {
            return unify_failure(variable, v_object);
        }
        if (unification.NIL != unification.$computing_variable_mapP$.getDynamicValue(thread) && (unification.NIL == variables.variable_p(v_object) || SubLObjectFactory.makeBoolean(unification.NIL == base_variable_p(variable)).eql((SubLObject)SubLObjectFactory.makeBoolean(unification.NIL == base_variable_p(v_object))))) {
            return unify_failure(variable, v_object);
        }
        return subl_promotions.values2(bindings.add_variable_binding(variable, v_object, v_bindings), (SubLObject)unification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 11135L)
    public static SubLObject unify_term_variable(final SubLObject term_variable1, final SubLObject term_variable2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL == unification.$unify_term_variable_enabledP$.getDynamicValue(thread)) {
            return unify_atom(term_variable1, term_variable2, v_bindings);
        }
        if (unification.NIL != bindings.variable_bound_p(term_variable1, v_bindings)) {
            return unify_recursive(bindings.variable_lookup(term_variable1, v_bindings), term_variable2, v_bindings);
        }
        if (unification.NIL != bindings.variable_bound_p(term_variable2, v_bindings)) {
            return unify_recursive(term_variable1, bindings.variable_lookup(term_variable2, v_bindings), v_bindings);
        }
        return subl_promotions.values2(bindings.add_variable_binding(term_variable1, term_variable2, v_bindings), (SubLObject)unification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 11979L)
    public static SubLObject unify_fort(final SubLObject fort1, final SubLObject obj2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL == obj2) {
            return unify_failure(fort1, obj2);
        }
        if (unification.NIL != constant_handles.constant_p(fort1)) {
            return unify_constant(fort1, obj2, v_bindings);
        }
        if (unification.NIL != constant_handles.constant_p(obj2)) {
            return unify_constant(obj2, fort1, v_bindings);
        }
        if (unification.NIL != variables.fully_bound_p(obj2) && unification.NIL != equals.equalsP(fort1, obj2, (SubLObject)unification.UNPROVIDED, (SubLObject)unification.UNPROVIDED)) {
            return subl_promotions.values2(v_bindings, unify_possibly_justify_equals(fort1, obj2));
        }
        if (unification.NIL != unification.$unify_narts_with_hl_formulasP$.getDynamicValue(thread) && obj2.isCons()) {
            final SubLObject formula1 = narts_high.nart_hl_formula(fort1);
            return unify_cons(formula1, obj2, v_bindings);
        }
        return unify_failure(fort1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 12656L)
    public static SubLObject unify_constant(final SubLObject constant1, final SubLObject obj2, final SubLObject v_bindings) {
        if (unification.NIL != variables.fully_bound_p(obj2) && unification.NIL != equals.equalsP(constant1, obj2, (SubLObject)unification.UNPROVIDED, (SubLObject)unification.UNPROVIDED)) {
            return subl_promotions.values2(v_bindings, unify_possibly_justify_equals(constant1, obj2));
        }
        return unify_failure(constant1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 12966L)
    public static SubLObject unify_cons(final SubLObject cons1, final SubLObject cons2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = unification.$unify_cons_function$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)unification.$kw0$DEFAULT)) {
            return unify_cons_default(cons1, cons2, v_bindings);
        }
        return Functions.funcall(unification.$unify_cons_function$.getDynamicValue(thread), cons1, cons2, v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 13239L)
    public static SubLObject unify_cons_default(final SubLObject cons1, final SubLObject cons2, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject car_bindings = unify_recursive(cons1.first(), cons2.first(), v_bindings);
        final SubLObject car_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject full_bindings = unify_recursive(cons1.rest(), cons2.rest(), car_bindings);
        final SubLObject cdr_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(full_bindings, ConsesLow.append(car_justification, cdr_justification));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 13663L)
    public static SubLObject unify_atom(final SubLObject atom1, final SubLObject atom2, final SubLObject v_bindings) {
        if (atom1.isNumber() && atom2.isNumber() && unification.NIL != arithmetic.cyc_numerically_equal(atom1, atom2)) {
            return subl_promotions.values2(v_bindings, (SubLObject)unification.NIL);
        }
        if (atom1.equal(atom2)) {
            return subl_promotions.values2(v_bindings, (SubLObject)unification.NIL);
        }
        return unify_failure(atom1, atom2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 14019L)
    public static SubLObject unify_possibly_justify_equals(final SubLObject obj1, final SubLObject obj2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((unification.NIL != unification.$unify_return_justificationP$.getDynamicValue(thread)) ? ConsesLow.list(arguments.make_hl_support((SubLObject)unification.$kw5$EQUALITY, el_utilities.make_binary_formula(unification.$const6$equals, obj1, obj2), (SubLObject)unification.UNPROVIDED, (SubLObject)unification.UNPROVIDED)) : unification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 14203L)
    public static SubLObject unification_occurs_check(final SubLObject variable, final SubLObject value, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unification.NIL != control_vars.$perform_unification_occurs_check$.getDynamicValue(thread)) {
            return unification_occurs_check_recursive(variable, value, v_bindings);
        }
        return (SubLObject)unification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 14518L)
    public static SubLObject unification_occurs_check_recursive(final SubLObject variable, final SubLObject v_object, final SubLObject v_bindings) {
        if (variable.eql(v_object)) {
            return (SubLObject)unification.T;
        }
        if (unification.NIL == v_object) {
            return (SubLObject)unification.NIL;
        }
        if (v_object.isCons()) {
            SubLObject cons;
            SubLObject car;
            SubLObject cdr;
            for (cons = (SubLObject)unification.NIL, cons = v_object; !cons.isAtom(); cons = cons.rest()) {
                car = cons.first();
                if (unification.NIL != unification_occurs_check_recursive(variable, car, v_bindings)) {
                    return (SubLObject)unification.T;
                }
                cdr = cons.rest();
                if (!cdr.isList() && unification.NIL != unification_occurs_check_recursive(variable, cdr, v_bindings)) {
                    return (SubLObject)unification.T;
                }
            }
            return (SubLObject)unification.NIL;
        }
        if (unification.NIL != variables.variable_p(v_object) && unification.NIL != bindings.variable_bound_p(v_object, v_bindings)) {
            return unification_occurs_check_recursive(variable, bindings.variable_lookup(v_object, v_bindings), v_bindings);
        }
        return (SubLObject)unification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15373L)
    public static SubLObject too_many_hl_variables(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numGE(list_utilities.tree_count_if(Symbols.symbol_function((SubLObject)unification.$sym8$VARIABLE_P), v_object, (SubLObject)unification.UNPROVIDED), unification.$variable_base_max$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15487L)
    public static SubLObject base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(unification.NIL != variables.variable_p(v_object) && variables.variable_id(v_object).numL(unification.$variable_base_max$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15618L)
    public static SubLObject non_base_variable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(unification.NIL != variables.variable_p(v_object) && variables.variable_id(v_object).numGE(unification.$variable_base_max$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15754L)
    public static SubLObject variable_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert unification.NIL != variables.variable_p(variable) : variable;
        return variables.find_variable_by_id(Numbers.mod(variables.variable_id(variable), unification.$variable_base_max$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 15921L)
    public static SubLObject variable_non_base_version(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert unification.NIL != variables.variable_p(variable) : variable;
        return variables.find_variable_by_id(Numbers.add(Numbers.mod(variables.variable_id(variable), unification.$variable_base_max$.getDynamicValue(thread)), unification.$variable_base_max$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 16126L)
    public static SubLObject variable_base_inverted_version(final SubLObject variable) {
        if (unification.NIL != base_variable_p(variable)) {
            return variable_non_base_version(variable);
        }
        return variable_base_version(variable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 16382L)
    public static SubLObject non_base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)unification.$sym9$BASE_VARIABLE_P), Symbols.symbol_function((SubLObject)unification.$sym10$VARIABLE_NON_BASE_VERSION), (SubLObject)unification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 16502L)
    public static SubLObject base_variable_transform(final SubLObject v_object) {
        return transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)unification.$sym11$NON_BASE_VARIABLE_P), Symbols.symbol_function((SubLObject)unification.$sym12$VARIABLE_BASE_VERSION), (SubLObject)unification.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 16618L)
    public static SubLObject variable_base_inversion(final SubLObject v_object) {
        if (unification.NIL != variables.variable_p(v_object)) {
            return variable_base_inverted_version(v_object);
        }
        if (v_object.isAtom()) {
            return v_object;
        }
        return list_utilities.recons(variable_base_inversion(v_object.first()), variable_base_inversion(v_object.rest()), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 17098L)
    public static SubLObject pre_unify_replace_variables(final SubLObject v_object) {
        return non_base_variable_transform(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unification.lisp", position = 17198L)
    public static SubLObject term_variable_p(final SubLObject v_object) {
        return cycl_variables.el_varP(v_object);
    }
    
    public static SubLObject declare_unification_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.unification", "with_unifier_justifications", "WITH-UNIFIER-JUSTIFICATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible", "UNIFY-POSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_impossible", "UNIFY-IMPOSSIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_recursive", "UNIFY-POSSIBLE-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_term_variable", "UNIFY-POSSIBLE-TERM-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_fort", "UNIFY-POSSIBLE-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_constant", "UNIFY-POSSIBLE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_cons", "UNIFY-POSSIBLE-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_cons_default", "UNIFY-POSSIBLE-CONS-DEFAULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possible_atom", "UNIFY-POSSIBLE-ATOM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify", "UNIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_assuming_bindings", "UNIFY-ASSUMING-BINDINGS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_internal", "UNIFY-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_failure", "UNIFY-FAILURE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_recursive", "UNIFY-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "add_bindings_to_answer", "ADD-BINDINGS-TO-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_recursive_internal", "UNIFY-RECURSIVE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_variable", "UNIFY-VARIABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_term_variable", "UNIFY-TERM-VARIABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_fort", "UNIFY-FORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_constant", "UNIFY-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_cons", "UNIFY-CONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_cons_default", "UNIFY-CONS-DEFAULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_atom", "UNIFY-ATOM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unify_possibly_justify_equals", "UNIFY-POSSIBLY-JUSTIFY-EQUALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unification_occurs_check", "UNIFICATION-OCCURS-CHECK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "unification_occurs_check_recursive", "UNIFICATION-OCCURS-CHECK-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "too_many_hl_variables", "TOO-MANY-HL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "base_variable_p", "BASE-VARIABLE-P", 1, 0, false);
        new $base_variable_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "non_base_variable_p", "NON-BASE-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "variable_base_version", "VARIABLE-BASE-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "variable_non_base_version", "VARIABLE-NON-BASE-VERSION", 1, 0, false);
        new $variable_non_base_version$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "variable_base_inverted_version", "VARIABLE-BASE-INVERTED-VERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "non_base_variable_transform", "NON-BASE-VARIABLE-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "base_variable_transform", "BASE-VARIABLE-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "variable_base_inversion", "VARIABLE-BASE-INVERSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "pre_unify_replace_variables", "PRE-UNIFY-REPLACE-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unification", "term_variable_p", "TERM-VARIABLE-P", 1, 0, false);
        return (SubLObject)unification.NIL;
    }
    
    public static SubLObject init_unification_file() {
        unification.$unify_term_variable_enabledP$ = SubLFiles.defvar("*UNIFY-TERM-VARIABLE-ENABLED?*", (SubLObject)unification.T);
        unification.$unify_possible_cons_function$ = SubLFiles.defparameter("*UNIFY-POSSIBLE-CONS-FUNCTION*", (SubLObject)unification.$kw0$DEFAULT);
        unification.$unify_cons_function$ = SubLFiles.defparameter("*UNIFY-CONS-FUNCTION*", (SubLObject)unification.$kw0$DEFAULT);
        unification.$unify_multipleP$ = SubLFiles.defparameter("*UNIFY-MULTIPLE?*", (SubLObject)unification.NIL);
        unification.$computing_variable_mapP$ = SubLFiles.defparameter("*COMPUTING-VARIABLE-MAP?*", (SubLObject)unification.NIL);
        unification.$unify_return_justificationP$ = SubLFiles.defparameter("*UNIFY-RETURN-JUSTIFICATION?*", (SubLObject)unification.NIL);
        unification.$unify_narts_with_hl_formulasP$ = SubLFiles.defparameter("*UNIFY-NARTS-WITH-HL-FORMULAS?*", (SubLObject)unification.T);
        unification.$variable_base_max$ = SubLFiles.defparameter("*VARIABLE-BASE-MAX*", (SubLObject)unification.$int7$100);
        return (SubLObject)unification.NIL;
    }
    
    public static SubLObject setup_unification_file() {
        return (SubLObject)unification.NIL;
    }
    
    public void declareFunctions() {
        declare_unification_file();
    }
    
    public void initializeVariables() {
        init_unification_file();
    }
    
    public void runTopLevelForms() {
        setup_unification_file();
    }
    
    static {
        me = (SubLFile)new unification();
        unification.$unify_term_variable_enabledP$ = null;
        unification.$unify_possible_cons_function$ = null;
        unification.$unify_cons_function$ = null;
        unification.$unify_multipleP$ = null;
        unification.$computing_variable_mapP$ = null;
        unification.$unify_return_justificationP$ = null;
        unification.$unify_narts_with_hl_formulasP$ = null;
        unification.$variable_base_max$ = null;
        $kw0$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UNIFY-RETURN-JUSTIFICATION?*"), (SubLObject)unification.T));
        $sym3$BINDINGS_P = SubLObjectFactory.makeSymbol("BINDINGS-P");
        $kw4$UNIFY_FAILURE = SubLObjectFactory.makeKeyword("UNIFY-FAILURE");
        $kw5$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
        $const6$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $int7$100 = SubLObjectFactory.makeInteger(100);
        $sym8$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym9$BASE_VARIABLE_P = SubLObjectFactory.makeSymbol("BASE-VARIABLE-P");
        $sym10$VARIABLE_NON_BASE_VERSION = SubLObjectFactory.makeSymbol("VARIABLE-NON-BASE-VERSION");
        $sym11$NON_BASE_VARIABLE_P = SubLObjectFactory.makeSymbol("NON-BASE-VARIABLE-P");
        $sym12$VARIABLE_BASE_VERSION = SubLObjectFactory.makeSymbol("VARIABLE-BASE-VERSION");
    }
    
    public static final class $base_variable_p$UnaryFunction extends UnaryFunction
    {
        public $base_variable_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BASE-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return unification.base_variable_p(arg1);
        }
    }
    
    public static final class $variable_non_base_version$UnaryFunction extends UnaryFunction
    {
        public $variable_non_base_version$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("VARIABLE-NON-BASE-VERSION"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return unification.variable_non_base_version(arg1);
        }
    }
}

/*

	Total time: 226 ms
	
*/