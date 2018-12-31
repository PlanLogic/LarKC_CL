package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subcollection_unwindings_wff extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subcollection_unwindings_wff";
    public static final String myFingerPrint = "77e33bbe5ff606b5408836a519e352825d7826fb4ed2eeb39856428176fc0337";
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 973L)
    public static SubLSymbol $scg_wff_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1141L)
    private static SubLSymbol $scg_sentence_variable_type_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1277L)
    private static SubLSymbol $scg_sentence_variable_genl_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1356L)
    private static SubLSymbol $scg_wff_memoization_state$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$UNINITIALIZED;
    private static final SubLSymbol $sym2$_EXIT;
    private static final SubLFloat $float3$0_99;
    private static final SubLFloat $float4$0_01;
    private static final SubLSymbol $sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS;
    private static final SubLInteger $int6$8192;
    private static final SubLSymbol $sym7$CDR;
    private static final SubLSymbol $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_;
    private static final SubLSymbol $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_;
    private static final SubLSymbol $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_;
    private static final SubLSymbol $sym11$SCG_WFF_TERM_ISA_CONSTRAINTS;
    private static final SubLSymbol $sym12$SCG_WFF_TERM_GENL_CONSTRAINTS;
    private static final SubLSymbol $sym13$EL_VAR_;
    private static final SubLString $str14$VAR;
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1429L)
    public static SubLObject scg_sentence_wffP(final SubLObject sentence, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.currentBinding(thread);
        final SubLObject _prev_bind_2 = subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.currentBinding(thread);
        try {
            subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.bind((SubLObject)subcollection_unwindings_wff.NIL, thread);
            subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.bind((SubLObject)subcollection_unwindings_wff.NIL, thread);
            return scg_sentence_unwinding_wffP(sentence, mt);
        }
        finally {
            subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.rebind(_prev_bind_2, thread);
            subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1660L)
    public static SubLObject implausible_scg_unwindingP(final SubLObject unwinding, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(subcollection_unwindings_wff.NIL == scg_sentence_wffP(unwinding, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 1792L)
    public static SubLObject scg_sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        if (v_properties == subcollection_unwindings_wff.UNPROVIDED) {
            v_properties = (SubLObject)subcollection_unwindings_wff.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)subcollection_unwindings_wff.NIL;
        final SubLObject local_state = subcollection_unwindings_wff.$scg_wff_memoization_state$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject unwound_sentence = subcollection_unwinder.scg_subcol_expand_signature(sentence);
                final SubLObject fast_wff_result = scg_sentence_wffP(unwound_sentence, mt);
                result = (SubLObject)((subcollection_unwindings_wff.NIL != fast_wff_result) ? subcollection_unwindings_wff.$float3$0_99 : subcollection_unwindings_wff.$float4$0_01);
                subcollection_unwindings_wff.$scg_wff_memoization_state$.setDynamicValue(memoization_state.current_memoization_state(), thread);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subcollection_unwindings_wff.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 2274L)
    public static SubLObject scg_sentence_unwinding_wffP(final SubLObject unwound_sentence, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        if (subcollection_unwindings_wff.NIL != el_utilities.el_existential_p(unwound_sentence)) {
            return scg_sentence_unwinding_wffP(cycl_utilities.formula_arg2(unwound_sentence, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), mt);
        }
        if (subcollection_unwindings_wff.NIL != el_utilities.el_conjunction_p(unwound_sentence)) {
            return scg_wff_check_sentence_constraints(unwound_sentence.rest(), mt);
        }
        return scg_wff_check_sentence_constraints((SubLObject)ConsesLow.list(unwound_sentence), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 2688L)
    public static SubLObject scg_wff_note_var_isa_constraints(final SubLObject variable, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_cell = conses_high.assoc(variable, subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.EQUAL), (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL != var_cell) {
            ConsesLow.rplacd(var_cell, conses_high.union(constraints, var_cell.rest(), Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.EQUAL), (SubLObject)subcollection_unwindings_wff.UNPROVIDED));
        }
        else {
            subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.setDynamicValue(conses_high.acons(variable, constraints, subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 3153L)
    public static SubLObject scg_wff_note_var_genl_constraints(final SubLObject variable, final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_cell = conses_high.assoc(variable, subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.EQUAL), (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL != var_cell) {
            ConsesLow.rplacd(var_cell, conses_high.union(constraints, var_cell.rest(), Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.EQUAL), (SubLObject)subcollection_unwindings_wff.UNPROVIDED));
        }
        else {
            subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.setDynamicValue(conses_high.acons(variable, constraints, subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 3619L)
    public static SubLObject scg_wff_sort_type_constraints_internal(final SubLObject constraints) {
        return kb_utilities.sort_terms(constraints, (SubLObject)subcollection_unwindings_wff.T, (SubLObject)subcollection_unwindings_wff.T, (SubLObject)subcollection_unwindings_wff.T, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 3619L)
    public static SubLObject scg_wff_sort_type_constraints(final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_sort_type_constraints_internal(constraints);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.ONE_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_sort_type_constraints_internal(constraints)));
            memoization_state.caching_state_put(caching_state, constraints, results, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 3909L)
    public static SubLObject scg_wff_check_sentence_constraints(final SubLObject literals, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = literals;
        SubLObject literal = (SubLObject)subcollection_unwindings_wff.NIL;
        literal = cdolist_list_var.first();
        while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
            if (subcollection_unwindings_wff.NIL == scg_wff_literal_type_constraints_okP(literal, (SubLObject)subcollection_unwindings_wff.UNPROVIDED)) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        SubLObject constraints = Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.$sym7$CDR), subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$.getDynamicValue(thread));
        SubLObject cdolist_list_var2;
        constraints = (cdolist_list_var2 = Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS), constraints));
        SubLObject constraint_list = (SubLObject)subcollection_unwindings_wff.NIL;
        constraint_list = cdolist_list_var2.first();
        while (subcollection_unwindings_wff.NIL != cdolist_list_var2) {
            if (subcollection_unwindings_wff.NIL != scg_wff_type_constraints_disjointP(genls.min_cols(constraint_list, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), (SubLObject)subcollection_unwindings_wff.UNPROVIDED)) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint_list = cdolist_list_var2.first();
        }
        constraints = Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.$sym7$CDR), subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$.getDynamicValue(thread));
        constraints = (cdolist_list_var2 = Mapping.mapcar(Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS), constraints));
        constraint_list = (SubLObject)subcollection_unwindings_wff.NIL;
        constraint_list = cdolist_list_var2.first();
        while (subcollection_unwindings_wff.NIL != cdolist_list_var2) {
            if (subcollection_unwindings_wff.NIL != scg_wff_type_constraints_disjointP(genls.min_cols(constraint_list, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), (SubLObject)subcollection_unwindings_wff.UNPROVIDED)) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            constraint_list = cdolist_list_var2.first();
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 5680L)
    public static SubLObject scg_wff_type_constraints_disjointP_internal(final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        return (SubLObject)((subcollection_unwindings_wff.NIL != disjoint_with.any_disjoint_collection_pair(constraints, mt)) ? subcollection_unwindings_wff.T : subcollection_unwindings_wff.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 5680L)
    public static SubLObject scg_wff_type_constraints_disjointP(final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_type_constraints_disjointP_internal(constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, (SubLObject)subcollection_unwindings_wff.TWO_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)subcollection_unwindings_wff.NIL;
            collision = cdolist_list_var.first();
            while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (subcollection_unwindings_wff.NIL != cached_args && subcollection_unwindings_wff.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_type_constraints_disjointP_internal(constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(constraints, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 5892L)
    public static SubLObject scg_wff_term_isa_constraints_okP_internal(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var = constraints;
        SubLObject argn_constraint = (SubLObject)subcollection_unwindings_wff.NIL;
        argn_constraint = cdolist_list_var.first();
        while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
            if (subcollection_unwindings_wff.NIL == isa.isaP(v_term, argn_constraint, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED) && (subcollection_unwindings_wff.NIL == cycl_grammar.cycl_unrepresented_term_p(v_term) || subcollection_unwindings_wff.NIL == at_defns.isa_via_defnsP(v_term, argn_constraint, mt))) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argn_constraint = cdolist_list_var.first();
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 5892L)
    public static SubLObject scg_wff_term_isa_constraints_okP(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_term_isa_constraints_okP_internal(v_term, constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, (SubLObject)subcollection_unwindings_wff.THREE_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)subcollection_unwindings_wff.NIL;
            collision = cdolist_list_var.first();
            while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraints.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (subcollection_unwindings_wff.NIL != cached_args && subcollection_unwindings_wff.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_term_isa_constraints_okP_internal(v_term, constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, constraints, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6390L)
    public static SubLObject scg_wff_term_genl_constraints_okP_internal(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var = constraints;
        SubLObject argn_constraint = (SubLObject)subcollection_unwindings_wff.NIL;
        argn_constraint = cdolist_list_var.first();
        while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
            if (subcollection_unwindings_wff.NIL != cycl_grammar.cycl_unrepresented_term_p(v_term) || subcollection_unwindings_wff.NIL == genls.genlP(v_term, argn_constraint, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED)) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            argn_constraint = cdolist_list_var.first();
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6390L)
    public static SubLObject scg_wff_term_genl_constraints_okP(final SubLObject v_term, final SubLObject constraints, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_term_genl_constraints_okP_internal(v_term, constraints, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, (SubLObject)subcollection_unwindings_wff.THREE_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, constraints, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)subcollection_unwindings_wff.NIL;
            collision = cdolist_list_var.first();
            while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (constraints.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (subcollection_unwindings_wff.NIL != cached_args && subcollection_unwindings_wff.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_term_genl_constraints_okP_internal(v_term, constraints, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, constraints, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6700L)
    public static SubLObject scg_wff_term_isa_constraints_internal(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        return genls.min_cols(at_var_types.neg_lit_variable_isa_constraints(v_term, literal, mt), mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6700L)
    public static SubLObject scg_wff_term_isa_constraints(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_term_isa_constraints_internal(v_term, literal, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym11$SCG_WFF_TERM_ISA_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym11$SCG_WFF_TERM_ISA_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.THREE_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym11$SCG_WFF_TERM_ISA_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, literal, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)subcollection_unwindings_wff.NIL;
            collision = cdolist_list_var.first();
            while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (subcollection_unwindings_wff.NIL != cached_args && subcollection_unwindings_wff.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_term_isa_constraints_internal(v_term, literal, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, literal, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6889L)
    public static SubLObject scg_wff_term_genl_constraints_internal(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        return genls.min_cols(at_var_types.neg_lit_variable_genl_constraints(v_term, literal, mt), mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 6889L)
    public static SubLObject scg_wff_term_genl_constraints(final SubLObject v_term, final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)subcollection_unwindings_wff.NIL;
        if (subcollection_unwindings_wff.NIL == v_memoization_state) {
            return scg_wff_term_genl_constraints_internal(v_term, literal, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym12$SCG_WFF_TERM_GENL_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (subcollection_unwindings_wff.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)subcollection_unwindings_wff.$sym12$SCG_WFF_TERM_GENL_CONSTRAINTS, (SubLObject)subcollection_unwindings_wff.THREE_INTEGER, (SubLObject)subcollection_unwindings_wff.$int6$8192, (SubLObject)subcollection_unwindings_wff.EQUAL, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)subcollection_unwindings_wff.$sym12$SCG_WFF_TERM_GENL_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, literal, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)subcollection_unwindings_wff.NIL;
            collision = cdolist_list_var.first();
            while (subcollection_unwindings_wff.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (subcollection_unwindings_wff.NIL != cached_args && subcollection_unwindings_wff.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scg_wff_term_genl_constraints_internal(v_term, literal, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, literal, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 7157L)
    public static SubLObject scg_wff_canonicalize_variables(final SubLObject v_term, final SubLObject literal) {
        final SubLObject vars = list_utilities.tree_gather(literal, Symbols.symbol_function((SubLObject)subcollection_unwindings_wff.$sym13$EL_VAR_), (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        SubLObject canon_vars = (SubLObject)subcollection_unwindings_wff.NIL;
        SubLObject list_var = (SubLObject)subcollection_unwindings_wff.NIL;
        SubLObject var = (SubLObject)subcollection_unwindings_wff.NIL;
        SubLObject counter = (SubLObject)subcollection_unwindings_wff.NIL;
        list_var = vars;
        var = list_var.first();
        for (counter = (SubLObject)subcollection_unwindings_wff.ZERO_INTEGER; subcollection_unwindings_wff.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), counter = Numbers.add((SubLObject)subcollection_unwindings_wff.ONE_INTEGER, counter)) {
            canon_vars = (SubLObject)ConsesLow.cons(reader.bq_cons(var, cycl_variables.make_el_var(Sequences.cconcatenate((SubLObject)subcollection_unwindings_wff.$str14$VAR, format_nil.format_nil_d_no_copy(counter)))), canon_vars);
        }
        return reader.bq_cons(conses_high.sublis(canon_vars, v_term, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), conses_high.sublis(canon_vars, literal, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subcollection-unwindings-wff.lisp", position = 7558L)
    public static SubLObject scg_wff_literal_type_constraints_okP(final SubLObject literal, SubLObject mt) {
        if (mt == subcollection_unwindings_wff.UNPROVIDED) {
            mt = subcollection_unwindings_wff.$scg_wff_mt$.getDynamicValue();
        }
        if (subcollection_unwindings_wff.NIL != wff_utilities.non_wf_fort_p(literal)) {
            return (SubLObject)subcollection_unwindings_wff.NIL;
        }
        final SubLObject predicate = el_utilities.literal_predicate(literal, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        final SubLObject args = el_utilities.literal_args(literal, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject argnum;
        SubLObject argn;
        SubLObject canon_term_and_literal;
        SubLObject argn_isa_constraints;
        SubLObject argn_genl_constraints;
        for (cdotimes_end_var = Sequences.length(args), i = (SubLObject)subcollection_unwindings_wff.NIL, i = (SubLObject)subcollection_unwindings_wff.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)subcollection_unwindings_wff.ONE_INTEGER)) {
            argnum = number_utilities.f_1X(i);
            argn = el_utilities.literal_arg(literal, argnum, (SubLObject)subcollection_unwindings_wff.UNPROVIDED);
            canon_term_and_literal = scg_wff_canonicalize_variables(argn, literal);
            argn_isa_constraints = scg_wff_term_isa_constraints(canon_term_and_literal.first(), canon_term_and_literal.rest(), mt);
            argn_genl_constraints = scg_wff_term_genl_constraints(canon_term_and_literal.first(), canon_term_and_literal.rest(), mt);
            if (subcollection_unwindings_wff.NIL != kb_accessors.function_to_arg_termP(predicate)) {
                argn_isa_constraints = ConsesLow.nconc(argn_isa_constraints, kb_accessors.result_isa(predicate, mt));
            }
            if (subcollection_unwindings_wff.NIL == cycl_variables.el_varP(argn) && subcollection_unwindings_wff.NIL == cycl_grammar.cycl_unrepresented_term_p(argn) && subcollection_unwindings_wff.NIL == scg_wff_literal_type_constraints_okP(argn, mt)) {
                return (SubLObject)subcollection_unwindings_wff.NIL;
            }
            if (subcollection_unwindings_wff.NIL != cycl_variables.el_varP(argn)) {
                if (subcollection_unwindings_wff.NIL != argn_isa_constraints) {
                    scg_wff_note_var_isa_constraints(argn, argn_isa_constraints);
                }
                if (subcollection_unwindings_wff.NIL != argn_genl_constraints) {
                    scg_wff_note_var_genl_constraints(argn, argn_genl_constraints);
                }
            }
            else {
                if (subcollection_unwindings_wff.NIL != argn_isa_constraints && subcollection_unwindings_wff.NIL == scg_wff_term_isa_constraints_okP(argn, argn_isa_constraints, mt)) {
                    if (subcollection_unwindings_wff.NIL != cycl_grammar.cycl_unrepresented_term_p(argn)) {
                        return (SubLObject)subcollection_unwindings_wff.NIL;
                    }
                    if (subcollection_unwindings_wff.NIL != scg_wff_type_constraints_disjointP(genls.min_cols(conses_high.union(argn_isa_constraints, isa.isa(argn, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), mt)) {
                        return (SubLObject)subcollection_unwindings_wff.NIL;
                    }
                }
                if (subcollection_unwindings_wff.NIL != argn_genl_constraints && subcollection_unwindings_wff.NIL == scg_wff_term_genl_constraints_okP(argn, argn_genl_constraints, mt)) {
                    if (subcollection_unwindings_wff.NIL != cycl_grammar.cycl_unrepresented_term_p(argn)) {
                        return (SubLObject)subcollection_unwindings_wff.NIL;
                    }
                    if (subcollection_unwindings_wff.NIL != scg_wff_type_constraints_disjointP(genls.min_cols(conses_high.union(argn_genl_constraints, genls.genls(argn, mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), mt, (SubLObject)subcollection_unwindings_wff.UNPROVIDED), mt)) {
                        return (SubLObject)subcollection_unwindings_wff.NIL;
                    }
                }
            }
        }
        return (SubLObject)subcollection_unwindings_wff.T;
    }
    
    public static SubLObject declare_subcollection_unwindings_wff_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_sentence_wffP", "SCG-SENTENCE-WFF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "implausible_scg_unwindingP", "IMPLAUSIBLE-SCG-UNWINDING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_sentence_plausibility_factor", "SCG-SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_sentence_unwinding_wffP", "SCG-SENTENCE-UNWINDING-WFF?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_note_var_isa_constraints", "SCG-WFF-NOTE-VAR-ISA-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_note_var_genl_constraints", "SCG-WFF-NOTE-VAR-GENL-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_sort_type_constraints_internal", "SCG-WFF-SORT-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_sort_type_constraints", "SCG-WFF-SORT-TYPE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_check_sentence_constraints", "SCG-WFF-CHECK-SENTENCE-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_type_constraints_disjointP_internal", "SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_type_constraints_disjointP", "SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_isa_constraints_okP_internal", "SCG-WFF-TERM-ISA-CONSTRAINTS-OK?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_isa_constraints_okP", "SCG-WFF-TERM-ISA-CONSTRAINTS-OK?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_genl_constraints_okP_internal", "SCG-WFF-TERM-GENL-CONSTRAINTS-OK?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_genl_constraints_okP", "SCG-WFF-TERM-GENL-CONSTRAINTS-OK?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_isa_constraints_internal", "SCG-WFF-TERM-ISA-CONSTRAINTS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_isa_constraints", "SCG-WFF-TERM-ISA-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_genl_constraints_internal", "SCG-WFF-TERM-GENL-CONSTRAINTS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_term_genl_constraints", "SCG-WFF-TERM-GENL-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_canonicalize_variables", "SCG-WFF-CANONICALIZE-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subcollection_unwindings_wff", "scg_wff_literal_type_constraints_okP", "SCG-WFF-LITERAL-TYPE-CONSTRAINTS-OK?", 1, 1, false);
        return (SubLObject)subcollection_unwindings_wff.NIL;
    }
    
    public static SubLObject init_subcollection_unwindings_wff_file() {
        subcollection_unwindings_wff.$scg_wff_mt$ = SubLFiles.defparameter("*SCG-WFF-MT*", (SubLObject)subcollection_unwindings_wff.$list0);
        subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$ = SubLFiles.defparameter("*SCG-SENTENCE-VARIABLE-TYPE-CONSTRAINTS*", (SubLObject)subcollection_unwindings_wff.$kw1$UNINITIALIZED);
        subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$ = SubLFiles.defparameter("*SCG-SENTENCE-VARIABLE-GENL-CONSTRAINTS*", (SubLObject)subcollection_unwindings_wff.$kw1$UNINITIALIZED);
        subcollection_unwindings_wff.$scg_wff_memoization_state$ = SubLFiles.defvar("*SCG-WFF-MEMOIZATION-STATE*", memoization_state.create_memoization_state((SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED, (SubLObject)subcollection_unwindings_wff.UNPROVIDED));
        return (SubLObject)subcollection_unwindings_wff.NIL;
    }
    
    public static SubLObject setup_subcollection_unwindings_wff_file() {
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS);
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_);
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_);
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_);
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym11$SCG_WFF_TERM_ISA_CONSTRAINTS);
        memoization_state.note_memoized_function((SubLObject)subcollection_unwindings_wff.$sym12$SCG_WFF_TERM_GENL_CONSTRAINTS);
        return (SubLObject)subcollection_unwindings_wff.NIL;
    }
    
    public void declareFunctions() {
        declare_subcollection_unwindings_wff_file();
    }
    
    public void initializeVariables() {
        init_subcollection_unwindings_wff_file();
    }
    
    public void runTopLevelForms() {
        setup_subcollection_unwindings_wff_file();
    }
    
    static {
        me = (SubLFile)new subcollection_unwindings_wff();
        subcollection_unwindings_wff.$scg_wff_mt$ = null;
        subcollection_unwindings_wff.$scg_sentence_variable_type_constraints$ = null;
        subcollection_unwindings_wff.$scg_sentence_variable_genl_constraints$ = null;
        subcollection_unwindings_wff.$scg_wff_memoization_state$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlausibilityQueryMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $kw1$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym2$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $float3$0_99 = (SubLFloat)SubLObjectFactory.makeDouble(0.99);
        $float4$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $sym5$SCG_WFF_SORT_TYPE_CONSTRAINTS = SubLObjectFactory.makeSymbol("SCG-WFF-SORT-TYPE-CONSTRAINTS");
        $int6$8192 = SubLObjectFactory.makeInteger(8192);
        $sym7$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym8$SCG_WFF_TYPE_CONSTRAINTS_DISJOINT_ = SubLObjectFactory.makeSymbol("SCG-WFF-TYPE-CONSTRAINTS-DISJOINT?");
        $sym9$SCG_WFF_TERM_ISA_CONSTRAINTS_OK_ = SubLObjectFactory.makeSymbol("SCG-WFF-TERM-ISA-CONSTRAINTS-OK?");
        $sym10$SCG_WFF_TERM_GENL_CONSTRAINTS_OK_ = SubLObjectFactory.makeSymbol("SCG-WFF-TERM-GENL-CONSTRAINTS-OK?");
        $sym11$SCG_WFF_TERM_ISA_CONSTRAINTS = SubLObjectFactory.makeSymbol("SCG-WFF-TERM-ISA-CONSTRAINTS");
        $sym12$SCG_WFF_TERM_GENL_CONSTRAINTS = SubLObjectFactory.makeSymbol("SCG-WFF-TERM-GENL-CONSTRAINTS");
        $sym13$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $str14$VAR = SubLObjectFactory.makeString("VAR");
    }
}

/*

	Total time: 157 ms
	
*/