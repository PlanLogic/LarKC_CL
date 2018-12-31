// 
////
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fi_edit extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.fi_edit";
    public static final String myFingerPrint = "b258f4bd806c3fdb7c2468a3218d362efa7ddec5932f13807cd41d5d0f6c8360";
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 8833L)
    public static SubLSymbol $within_fi_edit_add_old_exceptP$;
    private static final SubLSymbol $kw0$DEFAULT;
    private static final SubLSymbol $kw1$ARG_ERROR;
    private static final SubLString $str2$Expected_a_cons__got__S;
    private static final SubLString $str3$Expected__default_or__monotonic__;
    private static final SubLString $str4$Expected_a_direction__got__S;
    private static final SubLString $str5$some_old_formulas_missing___S;
    private static final SubLString $str6$unable_to_except___S;
    private static final SubLString $str7$some_new_formulas_invalid___S;
    private static final SubLString $str8$some_new_formulas_failed___S;
    private static final SubLSymbol $kw9$FI_EDIT;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$ASSERTION_P;
    private static final SubLObject $const12$except;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym18$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym19$KBEQ;
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 1032L)
    public static SubLObject new_fi_edit_int(SubLObject old_sentence, SubLObject new_sentence, SubLObject old_mt, SubLObject new_mt, SubLObject strength, SubLObject direction) {
        if (old_mt == fi_edit.UNPROVIDED) {
            old_mt = (SubLObject)fi_edit.NIL;
        }
        if (new_mt == fi_edit.UNPROVIDED) {
            new_mt = old_mt;
        }
        if (strength == fi_edit.UNPROVIDED) {
            strength = (SubLObject)fi_edit.$kw0$DEFAULT;
        }
        if (direction == fi_edit.UNPROVIDED) {
            direction = (SubLObject)fi_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.reset_fi_error_state();
        if (fi_edit.NIL == el_utilities.el_formula_p(old_sentence)) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi_edit.$kw1$ARG_ERROR, (SubLObject)fi_edit.$str2$Expected_a_cons__got__S, old_sentence));
            return (SubLObject)fi_edit.NIL;
        }
        if (fi_edit.NIL == el_utilities.el_formula_p(new_sentence)) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi_edit.$kw1$ARG_ERROR, (SubLObject)fi_edit.$str2$Expected_a_cons__got__S, new_sentence));
            return (SubLObject)fi_edit.NIL;
        }
        old_sentence = canon_tl.transform_tl_terms_to_hl(old_sentence);
        new_sentence = canon_tl.transform_tl_terms_to_hl(new_sentence);
        if (fi_edit.NIL != old_mt) {
            old_mt = canon_tl.transform_tl_terms_to_hl(old_mt);
            old_mt = fi.fi_convert_to_assert_hlmt_if_wft(old_mt);
            if (fi_edit.NIL != fi.fi_error_signaledP()) {
                return (SubLObject)fi_edit.NIL;
            }
        }
        if (fi_edit.NIL != new_mt) {
            new_mt = canon_tl.transform_tl_terms_to_hl(new_mt);
            new_mt = fi.fi_convert_to_assert_hlmt_if_wft(new_mt);
            if (fi_edit.NIL != fi.fi_error_signaledP()) {
                return (SubLObject)fi_edit.NIL;
            }
        }
        if (fi_edit.NIL == enumeration_types.el_strength_p(strength)) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi_edit.$kw1$ARG_ERROR, (SubLObject)fi_edit.$str3$Expected__default_or__monotonic__, strength));
            return (SubLObject)fi_edit.NIL;
        }
        if (fi_edit.NIL != direction && fi_edit.NIL == enumeration_types.direction_p(direction)) {
            fi.signal_fi_error((SubLObject)ConsesLow.list((SubLObject)fi_edit.$kw1$ARG_ERROR, (SubLObject)fi_edit.$str4$Expected_a_direction__got__S, direction));
            return (SubLObject)fi_edit.NIL;
        }
        thread.resetMultipleValues();
        SubLObject old_assertions = fi_edit_compute_old_assertions(old_sentence, old_mt);
        final SubLObject missing_old = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi_edit.NIL != missing_old) {
            return fi_edit_error((SubLObject)fi_edit.$str5$some_old_formulas_missing___S, missing_old);
        }
        thread.resetMultipleValues();
        final SubLObject old_excepts = fi_edit_add_old_excepts(old_assertions);
        final SubLObject invalid_excepts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi_edit.NIL != invalid_excepts) {
            fi_edit_remove_old_excepts(old_excepts);
            return fi_edit_error((SubLObject)fi_edit.$str6$unable_to_except___S, invalid_excepts);
        }
        thread.resetMultipleValues();
        final SubLObject new_canon_tuples = fi_edit_compute_new_canon_tuples(new_sentence, new_mt);
        final SubLObject invalid_new = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fi_edit.NIL != invalid_new) {
            fi_edit_remove_old_excepts(old_excepts);
            return fi_edit_error((SubLObject)fi_edit.$str7$some_new_formulas_invalid___S, invalid_new);
        }
        thread.resetMultipleValues();
        final SubLObject new_asserts = fi_edit_add_asserts(new_canon_tuples, direction, strength);
        final SubLObject new_cnfs = thread.secondMultipleValue();
        final SubLObject invalid_asserts = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (fi_edit.NIL != invalid_asserts) {
            try {
                fi_edit_remove_new_cnfs(new_cnfs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fi_edit.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    try {
                        fi_edit_remove_old_excepts(old_excepts);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fi_edit.T, thread);
                            final SubLObject _values_$2 = Values.getValuesAsVector();
                            fi_edit_remove_new_assertions(new_asserts);
                            Values.restoreValuesFromVector(_values_$2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            return fi_edit_error((SubLObject)fi_edit.$str8$some_new_formulas_failed___S, invalid_asserts);
        }
        old_assertions = fi_edit_update_old_assertions_wrt_new(old_assertions, new_asserts);
        fi_edit_remove_old_excepts(old_excepts);
        fi_edit_remove_old_assertions(old_assertions);
        fi_edit_forward_propagate_new_asserts(new_asserts);
        return Numbers.add(Sequences.length(new_asserts), Sequences.length(new_cnfs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 4358L)
    public static SubLObject fi_edit_error(final SubLObject format_string, SubLObject arg) {
        if (arg == fi_edit.UNPROVIDED) {
            arg = (SubLObject)fi_edit.NIL;
        }
        fi.signal_fi_error((SubLObject)ConsesLow.listS((SubLObject)fi_edit.$kw9$FI_EDIT, format_string, ConsesLow.append((SubLObject)((fi_edit.NIL != arg) ? ConsesLow.list(arg) : fi_edit.NIL), (SubLObject)fi_edit.NIL)));
        return (SubLObject)fi_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 4515L)
    public static SubLObject fi_edit_precanonicalize(SubLObject sentence, SubLObject mt) {
        if (mt == fi_edit.UNPROVIDED) {
            mt = (SubLObject)fi_edit.NIL;
        }
        sentence = el_utilities.make_ist_sentence(mt, sentence);
        sentence = simplifier.simplify_cycl_sentence_syntax(sentence, (SubLObject)fi_edit.UNPROVIDED);
        if (fi_edit.NIL == el_utilities.el_conjunction_p(sentence)) {
            sentence = el_utilities.make_conjunction((SubLObject)ConsesLow.list(sentence));
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 4805L)
    public static SubLObject fi_edit_canon_versions_invalidP(final SubLObject canon_versions) {
        return (SubLObject)SubLObjectFactory.makeBoolean(fi_edit.NIL == canon_versions || fi_edit.NIL != cycl_grammar.cycl_true_p(canon_versions) || fi_edit.NIL != cycl_grammar.cycl_false_p(canon_versions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 4978L)
    public static SubLObject canonicalize_fi_assert_sentence(final SubLObject sentence, SubLObject mt) {
        if (mt == fi_edit.UNPROVIDED) {
            mt = (SubLObject)fi_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject canon_versions = (fi_edit.NIL != fi.$assume_assert_sentence_is_wfP$.getDynamicValue(thread)) ? czer_main.canonicalize_wf_assert_sentence(sentence, mt) : czer_main.canonicalize_assert_sentence(sentence, mt);
        SubLObject canon_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_mt = fi.fi_convert_to_assert_hlmt(canon_mt);
        return Values.values(canon_versions, canon_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 5443L)
    public static SubLObject fi_edit_compute_old_assertions(final SubLObject sentence, SubLObject mt) {
        if (mt == fi_edit.UNPROVIDED) {
            mt = (SubLObject)fi_edit.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_sentence_conjuction = fi_edit_precanonicalize(sentence, mt);
        final SubLObject ist_sentences = cycl_utilities.el_formula_args(ist_sentence_conjuction, (SubLObject)fi_edit.UNPROVIDED);
        SubLObject all_old_assertions = (SubLObject)fi_edit.NIL;
        SubLObject missing_old_subsentences = (SubLObject)fi_edit.NIL;
        SubLObject cdolist_list_var = ist_sentences;
        SubLObject ist_sentence = (SubLObject)fi_edit.NIL;
        ist_sentence = cdolist_list_var.first();
        while (fi_edit.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject canon_versions = fi.canonicalize_fi_unassert_sentence(ist_sentence, mt);
            SubLObject canonical_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            canonical_mt = fi.fi_convert_to_assert_hlmt(canonical_mt);
            thread.resetMultipleValues();
            final SubLObject old_assertions = fi_edit_compute_old_assertions_from_canon_versions(canon_versions, canonical_mt);
            final SubLObject some_missingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$3 = old_assertions;
            SubLObject old_assertion = (SubLObject)fi_edit.NIL;
            old_assertion = cdolist_list_var_$3.first();
            while (fi_edit.NIL != cdolist_list_var_$3) {
                all_old_assertions = (SubLObject)ConsesLow.cons(old_assertion, all_old_assertions);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                old_assertion = cdolist_list_var_$3.first();
            }
            if (fi_edit.NIL != some_missingP) {
                missing_old_subsentences = (SubLObject)ConsesLow.cons(ist_sentence, missing_old_subsentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ist_sentence = cdolist_list_var.first();
        }
        all_old_assertions = Sequences.nreverse(all_old_assertions);
        missing_old_subsentences = Sequences.nreverse(missing_old_subsentences);
        return Values.values(all_old_assertions, missing_old_subsentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 6540L)
    public static SubLObject fi_edit_compute_old_assertions_from_canon_versions(final SubLObject canon_versions, final SubLObject canonical_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject old_assertions = (SubLObject)fi_edit.NIL;
        SubLObject some_missingP = (SubLObject)fi_edit.NIL;
        if (fi_edit.NIL == canon_versions || fi_edit.NIL != cycl_grammar.cycl_true_p(canon_versions) || fi_edit.NIL != cycl_grammar.cycl_false_p(canon_versions)) {
            some_missingP = (SubLObject)fi_edit.T;
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(canonical_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = canon_versions;
                SubLObject canon_version = (SubLObject)fi_edit.NIL;
                canon_version = cdolist_list_var.first();
                while (fi_edit.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = canon_version;
                    SubLObject cnf = (SubLObject)fi_edit.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi_edit.$list10);
                    cnf = current.first();
                    current = current.rest();
                    final SubLObject variable_map = (SubLObject)(current.isCons() ? current.first() : fi_edit.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi_edit.$list10);
                    current = current.rest();
                    final SubLObject query_free_vars = (SubLObject)(current.isCons() ? current.first() : fi_edit.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)fi_edit.$list10);
                    current = current.rest();
                    if (fi_edit.NIL == current) {
                        final SubLObject old_assertion = kb_indexing.find_assertion(cnf, canonical_mt);
                        if (fi_edit.NIL != old_assertion && fi_edit.NIL != assertions_high.asserted_assertionP(old_assertion)) {
                            old_assertions = (SubLObject)ConsesLow.cons(old_assertion, old_assertions);
                        }
                        else {
                            some_missingP = (SubLObject)fi_edit.T;
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi_edit.$list10);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    canon_version = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(Sequences.nreverse(old_assertions), some_missingP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 7323L)
    public static SubLObject fi_edit_compute_new_canon_tuples(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_sentence_conjuction = fi_edit_precanonicalize(sentence, mt);
        final SubLObject ist_sentences = cycl_utilities.el_formula_args(ist_sentence_conjuction, (SubLObject)fi_edit.UNPROVIDED);
        SubLObject new_canon_tuples = (SubLObject)fi_edit.NIL;
        SubLObject invalid_new_subsentences = (SubLObject)fi_edit.NIL;
        SubLObject cdolist_list_var = ist_sentences;
        SubLObject ist_sentence = (SubLObject)fi_edit.NIL;
        ist_sentence = cdolist_list_var.first();
        while (fi_edit.NIL != cdolist_list_var) {
            if (fi_edit.NIL == cycl_grammar.cycl_true_p(ist_sentence)) {
                thread.resetMultipleValues();
                final SubLObject inner_sentence = czer_utilities.unwrap_if_ist(ist_sentence, mt, (SubLObject)fi_edit.UNPROVIDED);
                final SubLObject inner_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject canon_versions = canonicalize_fi_assert_sentence(inner_sentence, inner_mt);
                final SubLObject canonical_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (fi_edit.NIL != fi_edit_canon_versions_invalidP(canon_versions)) {
                    invalid_new_subsentences = (SubLObject)ConsesLow.cons(ist_sentence, invalid_new_subsentences);
                }
                else {
                    final SubLObject canon_tuple = (SubLObject)ConsesLow.list(canon_versions, canonical_mt);
                    new_canon_tuples = (SubLObject)ConsesLow.cons(canon_tuple, new_canon_tuples);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ist_sentence = cdolist_list_var.first();
        }
        new_canon_tuples = Sequences.nreverse(new_canon_tuples);
        invalid_new_subsentences = Sequences.nreverse(invalid_new_subsentences);
        return Values.values(new_canon_tuples, invalid_new_subsentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 8351L)
    public static SubLObject fi_edit_add_old_excepts(final SubLObject old_assertions) {
        SubLObject old_excepts = (SubLObject)fi_edit.NIL;
        SubLObject invalid_excepts = (SubLObject)fi_edit.NIL;
        SubLObject cdolist_list_var = old_assertions;
        SubLObject old_assertion = (SubLObject)fi_edit.NIL;
        old_assertion = cdolist_list_var.first();
        while (fi_edit.NIL != cdolist_list_var) {
            final SubLObject old_except = fi_edit_add_old_except(old_assertion);
            if (fi_edit.NIL != old_except) {
                old_excepts = (SubLObject)ConsesLow.cons(old_except, old_excepts);
            }
            else {
                invalid_excepts = (SubLObject)ConsesLow.cons(old_assertion, invalid_excepts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_assertion = cdolist_list_var.first();
        }
        old_excepts = Sequences.nreverse(old_excepts);
        invalid_excepts = Sequences.nreverse(invalid_excepts);
        return Values.values(old_excepts, invalid_excepts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 9050L)
    public static SubLObject fi_edit_add_old_except(final SubLObject old_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fi_edit.NIL != assertion_handles.assertion_p(old_assertion) : old_assertion;
        final SubLObject mt = assertions_high.assertion_mt(old_assertion);
        final SubLObject except_sentence = el_utilities.make_unary_formula(fi_edit.$const12$except, old_assertion);
        final SubLObject v_properties = (SubLObject)fi_edit.$list13;
        SubLObject old_except = (SubLObject)fi_edit.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = fi_edit.$within_fi_edit_add_old_exceptP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)fi_edit.NIL, thread);
            fi_edit.$within_fi_edit_add_old_exceptP$.bind((SubLObject)fi_edit.T, thread);
            if (fi_edit.NIL != cyc_kernel.cyc_assert_wff(except_sentence, mt, v_properties)) {
                old_except = kb_indexing.find_gaf(except_sentence, mt);
            }
        }
        finally {
            fi_edit.$within_fi_edit_add_old_exceptP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        if (fi_edit.NIL != assertion_handles.assertion_p(old_except)) {
            return old_except;
        }
        return (SubLObject)fi_edit.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 9675L)
    public static SubLObject fi_edit_add_asserts(final SubLObject canon_tuples, SubLObject direction, final SubLObject strength) {
        SubLObject assertions_found_or_created = (SubLObject)fi_edit.NIL;
        SubLObject cnfs_otherwise_asserted = (SubLObject)fi_edit.NIL;
        SubLObject invalid_witness = (SubLObject)fi_edit.NIL;
        fi.set_fi_last_assertions_asserted((SubLObject)fi_edit.NIL);
        if (fi_edit.NIL == invalid_witness) {
            SubLObject csome_list_var = canon_tuples;
            SubLObject canon_tuple = (SubLObject)fi_edit.NIL;
            canon_tuple = csome_list_var.first();
            while (fi_edit.NIL == invalid_witness && fi_edit.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = canon_tuple;
                SubLObject canon_versions = (SubLObject)fi_edit.NIL;
                SubLObject canon_mt = (SubLObject)fi_edit.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi_edit.$list14);
                canon_versions = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi_edit.$list14);
                canon_mt = current.first();
                current = current.rest();
                if (fi_edit.NIL == current) {
                    if (fi_edit.NIL == invalid_witness) {
                        SubLObject csome_list_var_$4 = canon_versions;
                        SubLObject canon_version = (SubLObject)fi_edit.NIL;
                        canon_version = csome_list_var_$4.first();
                        while (fi_edit.NIL == invalid_witness && fi_edit.NIL != csome_list_var_$4) {
                            SubLObject current_$6;
                            final SubLObject datum_$5 = current_$6 = canon_version;
                            SubLObject cnf = (SubLObject)fi_edit.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)fi_edit.$list15);
                            cnf = current_$6.first();
                            current_$6 = current_$6.rest();
                            final SubLObject variable_map = (SubLObject)(current_$6.isCons() ? current_$6.first() : fi_edit.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(current_$6, datum_$5, (SubLObject)fi_edit.$list15);
                            final SubLObject rest;
                            current_$6 = (rest = current_$6.rest());
                            if (fi_edit.NIL == direction) {
                                direction = fi.fi_cnf_default_direction(cnf);
                            }
                            final SubLObject assertion = hl_storage_modules.hl_assert(cnf, canon_mt, strength, direction, variable_map);
                            if (fi_edit.NIL == assertion) {
                                invalid_witness = canon_version;
                            }
                            else if (fi_edit.NIL != assertion_handles.assertion_p(assertion)) {
                                assertions_found_or_created = (SubLObject)ConsesLow.cons(assertion, assertions_found_or_created);
                            }
                            else {
                                final SubLObject cnf_tuple = (SubLObject)ConsesLow.list(cnf, canon_mt);
                                cnfs_otherwise_asserted = (SubLObject)ConsesLow.cons(cnf_tuple, cnfs_otherwise_asserted);
                            }
                            csome_list_var_$4 = csome_list_var_$4.rest();
                            canon_version = csome_list_var_$4.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi_edit.$list14);
                }
                csome_list_var = csome_list_var.rest();
                canon_tuple = csome_list_var.first();
            }
        }
        assertions_found_or_created = Sequences.nreverse(assertions_found_or_created);
        cnfs_otherwise_asserted = Sequences.nreverse(cnfs_otherwise_asserted);
        return Values.values(assertions_found_or_created, cnfs_otherwise_asserted, invalid_witness);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 11049L)
    public static SubLObject fi_edit_remove_new_cnfs(final SubLObject new_cnf_tuples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)fi_edit.ZERO_INTEGER;
        SubLObject cdolist_list_var = new_cnf_tuples;
        SubLObject cnf_tuple = (SubLObject)fi_edit.NIL;
        cnf_tuple = cdolist_list_var.first();
        while (fi_edit.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cnf_tuple;
            SubLObject cnf = (SubLObject)fi_edit.NIL;
            SubLObject mt = (SubLObject)fi_edit.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi_edit.$list16);
            cnf = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fi_edit.$list16);
            mt = current.first();
            current = current.rest();
            if (fi_edit.NIL == current) {
                SubLObject ignore_errors_tag = (SubLObject)fi_edit.NIL;
                try {
                    thread.throwStack.push(fi_edit.$kw17$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)fi_edit.$sym18$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            hl_storage_modules.hl_unassert(cnf, mt);
                            total = Numbers.add(total, (SubLObject)fi_edit.ONE_INTEGER);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)fi_edit.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)fi_edit.$kw17$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fi_edit.$list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cnf_tuple = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 11291L)
    public static SubLObject fi_edit_remove_new_assertions(final SubLObject new_assertions) {
        return hl_unassert_all_assertions(new_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 11408L)
    public static SubLObject fi_edit_update_old_assertions_wrt_new(SubLObject old_assertions, final SubLObject new_asserts) {
        final SubLObject preserved_assertions = keyhash_utilities.fast_intersection(old_assertions, new_asserts, (SubLObject)fi_edit.UNPROVIDED, (SubLObject)fi_edit.UNPROVIDED, (SubLObject)fi_edit.UNPROVIDED);
        if (fi_edit.NIL != preserved_assertions) {
            old_assertions = list_utilities.fast_set_difference(old_assertions, preserved_assertions, Symbols.symbol_function((SubLObject)fi_edit.$sym19$KBEQ));
        }
        return old_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 11818L)
    public static SubLObject fi_edit_remove_old_excepts(final SubLObject old_excepts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)fi_edit.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)fi_edit.NIL, thread);
            result = hl_unassert_all_assertions(old_excepts);
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 12088L)
    public static SubLObject fi_edit_remove_old_assertions(final SubLObject old_assertions) {
        return hl_unassert_all_assertions(old_assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 12205L)
    public static SubLObject hl_unassert_all_assertions(final SubLObject assertions) {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)fi_edit.NIL;
        assertion = cdolist_list_var.first();
        while (fi_edit.NIL != cdolist_list_var) {
            hl_storage_modules.hl_unassert(assertions_high.assertion_cnf(assertion), assertions_high.assertion_mt(assertion));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Sequences.length(assertions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fi-edit.lisp", position = 12396L)
    public static SubLObject fi_edit_forward_propagate_new_asserts(final SubLObject new_asserts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject deductions_found_or_created = (SubLObject)fi_edit.NIL;
        if (fi_edit.NIL == fi.fi_error_signaledP()) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_control_vars.$forward_inference_forbidden_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(hl_prototypes.hl_prototype_allowed_forward_rules(new_asserts), thread);
                kb_control_vars.$forward_inference_forbidden_rules$.bind(hl_prototypes.hl_prototype_forbidden_forward_rules(new_asserts), thread);
                deductions_found_or_created = forward.perform_forward_inference();
            }
            finally {
                kb_control_vars.$forward_inference_forbidden_rules$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
            }
            fi.perform_assert_post_processing(new_asserts, deductions_found_or_created);
        }
        return Sequences.length(deductions_found_or_created);
    }
    
    public static SubLObject declare_fi_edit_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "new_fi_edit_int", "NEW-FI-EDIT-INT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_error", "FI-EDIT-ERROR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_precanonicalize", "FI-EDIT-PRECANONICALIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_canon_versions_invalidP", "FI-EDIT-CANON-VERSIONS-INVALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "canonicalize_fi_assert_sentence", "CANONICALIZE-FI-ASSERT-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_compute_old_assertions", "FI-EDIT-COMPUTE-OLD-ASSERTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_compute_old_assertions_from_canon_versions", "FI-EDIT-COMPUTE-OLD-ASSERTIONS-FROM-CANON-VERSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_compute_new_canon_tuples", "FI-EDIT-COMPUTE-NEW-CANON-TUPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_add_old_excepts", "FI-EDIT-ADD-OLD-EXCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_add_old_except", "FI-EDIT-ADD-OLD-EXCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_add_asserts", "FI-EDIT-ADD-ASSERTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_remove_new_cnfs", "FI-EDIT-REMOVE-NEW-CNFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_remove_new_assertions", "FI-EDIT-REMOVE-NEW-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_update_old_assertions_wrt_new", "FI-EDIT-UPDATE-OLD-ASSERTIONS-WRT-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_remove_old_excepts", "FI-EDIT-REMOVE-OLD-EXCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_remove_old_assertions", "FI-EDIT-REMOVE-OLD-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "hl_unassert_all_assertions", "HL-UNASSERT-ALL-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fi_edit", "fi_edit_forward_propagate_new_asserts", "FI-EDIT-FORWARD-PROPAGATE-NEW-ASSERTS", 1, 0, false);
        return (SubLObject)fi_edit.NIL;
    }
    
    public static SubLObject init_fi_edit_file() {
        fi_edit.$within_fi_edit_add_old_exceptP$ = SubLFiles.defparameter("*WITHIN-FI-EDIT-ADD-OLD-EXCEPT?*", (SubLObject)fi_edit.NIL);
        return (SubLObject)fi_edit.NIL;
    }
    
    public static SubLObject setup_fi_edit_file() {
        return (SubLObject)fi_edit.NIL;
    }
    
    public void declareFunctions() {
        declare_fi_edit_file();
    }
    
    public void initializeVariables() {
        init_fi_edit_file();
    }
    
    public void runTopLevelForms() {
        setup_fi_edit_file();
    }
    
    static {
        me = (SubLFile)new fi_edit();
        fi_edit.$within_fi_edit_add_old_exceptP$ = null;
        $kw0$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw1$ARG_ERROR = SubLObjectFactory.makeKeyword("ARG-ERROR");
        $str2$Expected_a_cons__got__S = SubLObjectFactory.makeString("Expected a cons, got ~S");
        $str3$Expected__default_or__monotonic__ = SubLObjectFactory.makeString("Expected :default or :monotonic, got ~S");
        $str4$Expected_a_direction__got__S = SubLObjectFactory.makeString("Expected a direction, got ~S");
        $str5$some_old_formulas_missing___S = SubLObjectFactory.makeString("some old formulas missing: ~S");
        $str6$unable_to_except___S = SubLObjectFactory.makeString("unable to except: ~S");
        $str7$some_new_formulas_invalid___S = SubLObjectFactory.makeString("some new formulas invalid: ~S");
        $str8$some_new_formulas_failed___S = SubLObjectFactory.makeString("some new formulas failed: ~S");
        $kw9$FI_EDIT = SubLObjectFactory.makeKeyword("FI-EDIT");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FREE-VARS"));
        $sym11$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $const12$except = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("except"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANON-VERSIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CANON-MT"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $kw17$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym18$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym19$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
    }
}
