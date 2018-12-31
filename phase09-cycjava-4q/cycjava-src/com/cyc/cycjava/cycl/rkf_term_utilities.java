package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_term_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_term_utilities";
    public static final String myFingerPrint = "d1087eea3a94dbdd3f449d049e426e0e05402951ac33d83e391a9f663fb2546f";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 963L)
    public static SubLSymbol $rkf_name_prefix$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 1015L)
    public static SubLSymbol $rkf_name_suffix$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 8458L)
    private static SubLSymbol $rkf_terms_created_accumulator$;
    private static final SubLString $str0$RKF_;
    private static final SubLString $str1$;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLSymbol $sym4$_RKF_NAME_PREFIX_;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$_RKF_NAME_SUFFIX_;
    private static final SubLSymbol $sym7$CREATE_NEW_CONSTANT;
    private static final SubLSymbol $sym8$STRINGP;
    private static final SubLSymbol $sym9$LISTP;
    private static final SubLSymbol $sym10$POSSIBLY_MT_P;
    private static final SubLString $str11$Number;
    private static final SubLObject $const12$isa;
    private static final SubLObject $const13$genls;
    private static final SubLSymbol $kw14$UPCASE;
    private static final SubLSymbol $sym15$HLMT_P;
    private static final SubLObject $const16$termDependsOn;
    private static final SubLString $str17$Couldn_t_create_new_instance_of__;
    private static final SubLList $list18;
    private static final SubLString $str19$constantNameAutoGeneratedFromColl;
    private static final SubLObject $const20$BaseKB;
    private static final SubLList $list21;
    private static final SubLString $str22$Scenario;
    private static final SubLSymbol $sym23$FORT_P;
    private static final SubLString $str24$_instance;
    private static final SubLSymbol $sym25$RKF_INSTANTIATE_REFERENCE_P;
    private static final SubLObject $const26$SomeFn;
    private static final SubLSymbol $sym27$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym28$RKF_TERMS_CREATED_HARVESTER;
    private static final SubLSymbol $sym29$RKF_TERMS_CREATED_IN_TEMPORAL_ORDER;
    private static final SubLObject $const30$IntermediateVocabTerm;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 1061L)
    public static SubLObject with_rkf_name_prefix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_term_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefix = (SubLObject)rkf_term_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_term_utilities.$list2);
        prefix = current.first();
        current = current.rest();
        if (rkf_term_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_term_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_term_utilities.$sym4$_RKF_NAME_PREFIX_, prefix)), ConsesLow.append(body, (SubLObject)rkf_term_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_term_utilities.$list2);
        return (SubLObject)rkf_term_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 1189L)
    public static SubLObject with_rkf_name_suffix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_term_utilities.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject suffix = (SubLObject)rkf_term_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_term_utilities.$list5);
        suffix = current.first();
        current = current.rest();
        if (rkf_term_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_term_utilities.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_term_utilities.$sym6$_RKF_NAME_SUFFIX_, suffix)), ConsesLow.append(body, (SubLObject)rkf_term_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_term_utilities.$list5);
        return (SubLObject)rkf_term_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 1317L)
    public static SubLObject create_new_constant(SubLObject name, final SubLObject isas, final SubLObject v_genls, SubLObject elmt, SubLObject prefix, SubLObject html_state, SubLObject initial_case, SubLObject nowP, SubLObject assume_wffP) {
        if (prefix == rkf_term_utilities.UNPROVIDED) {
            prefix = (SubLObject)rkf_term_utilities.$str1$;
        }
        if (html_state == rkf_term_utilities.UNPROVIDED) {
            html_state = (SubLObject)rkf_term_utilities.NIL;
        }
        if (initial_case == rkf_term_utilities.UNPROVIDED) {
            initial_case = (SubLObject)rkf_term_utilities.T;
        }
        if (nowP == rkf_term_utilities.UNPROVIDED) {
            nowP = (SubLObject)rkf_term_utilities.NIL;
        }
        if (assume_wffP == rkf_term_utilities.UNPROVIDED) {
            assume_wffP = (SubLObject)rkf_term_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_term_utilities.NIL != Types.stringp(name) : name;
        assert rkf_term_utilities.NIL != Types.stringp(prefix) : prefix;
        assert rkf_term_utilities.NIL != Types.listp(isas) : isas;
        assert rkf_term_utilities.NIL != Types.listp(v_genls) : v_genls;
        assert rkf_term_utilities.NIL != hlmt.possibly_mt_p(elmt) : elmt;
        if (rkf_term_utilities.NIL != Characters.digit_char_p(string_utilities.first_char(name), (SubLObject)rkf_term_utilities.UNPROVIDED)) {
            name = Sequences.cconcatenate((SubLObject)rkf_term_utilities.$str11$Number, name);
        }
        elmt = hlmt_czer.coerce_to_hlmt(elmt);
        SubLObject constant = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_name_prefix$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_name_prefix$.bind(prefix, thread);
            constant = rkf_create(name, (SubLObject)rkf_term_utilities.NIL, (SubLObject)rkf_term_utilities.NIL, (SubLObject)rkf_term_utilities.NIL, initial_case);
        }
        finally {
            rkf_term_utilities.$rkf_name_prefix$.rebind(_prev_bind_0, thread);
        }
        if (rkf_term_utilities.NIL != html_state) {
            final SubLObject state_var = html_kernel.html_machine_state(html_state);
            final SubLObject lock_var = html_kernel.html_machine_state_lock(state_var);
            SubLObject v_variables = (SubLObject)rkf_term_utilities.NIL;
            SubLObject values = (SubLObject)rkf_term_utilities.NIL;
            SubLObject release = (SubLObject)rkf_term_utilities.NIL;
            try {
                release = Locks.seize_lock(lock_var);
                v_variables = html_kernel.html_machine_state_variables(state_var);
                values = html_kernel.html_machine_state_values(state_var);
            }
            finally {
                if (rkf_term_utilities.NIL != release) {
                    Locks.release_lock(lock_var);
                }
            }
            final SubLObject cprogv_var = v_variables;
            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
            try {
                Dynamic.bind_dynamic_vars(cprogv_var, values);
                if (rkf_term_utilities.NIL != Eval.constantp(constant, (SubLObject)rkf_term_utilities.UNPROVIDED)) {
                    cb_tools.cb_add_to_constant_history(constant);
                }
                else {
                    cb_tools.cb_add_to_nat_history(constant);
                }
                html_kernel.snapshot_html_state(state_var);
            }
            finally {
                Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
            }
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = (SubLObject)rkf_term_utilities.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_term_utilities.NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_term_utilities.$const12$isa, constant, v_isa), elmt, nowP, assume_wffP);
            api_widgets.recheck_collection_instances_cooccurence_cache(v_isa, elmt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)rkf_term_utilities.NIL;
        genl = cdolist_list_var.first();
        while (rkf_term_utilities.NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_term_utilities.$const13$genls, constant, genl), elmt, nowP, assume_wffP);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 2749L)
    public static SubLObject rkf_create(final SubLObject preferred_phrase, SubLObject dependent_mt, SubLObject prefix, SubLObject suffix, SubLObject initial_case) {
        if (dependent_mt == rkf_term_utilities.UNPROVIDED) {
            dependent_mt = (SubLObject)rkf_term_utilities.NIL;
        }
        if (prefix == rkf_term_utilities.UNPROVIDED) {
            prefix = (SubLObject)rkf_term_utilities.NIL;
        }
        if (suffix == rkf_term_utilities.UNPROVIDED) {
            suffix = (SubLObject)rkf_term_utilities.NIL;
        }
        if (initial_case == rkf_term_utilities.UNPROVIDED) {
            initial_case = (SubLObject)rkf_term_utilities.$kw14$UPCASE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_term_utilities.NIL != Types.stringp(preferred_phrase) : preferred_phrase;
        final SubLObject name = rkf_suggest_constant_name(preferred_phrase, prefix, suffix, initial_case);
        SubLObject new_term = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)rkf_term_utilities.NIL, thread);
            new_term = ke.ke_create(name);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (rkf_term_utilities.NIL != new_term) {
            rkf_event_dispatcher.rkf_post_create_term_event(new_term, (SubLObject)rkf_term_utilities.UNPROVIDED);
            if (rkf_term_utilities.NIL != dependent_mt) {
                rkf_mark_term_as_contextual(new_term, dependent_mt);
            }
        }
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 3454L)
    public static SubLObject rkf_mark_term_as_contextual(final SubLObject v_term, final SubLObject dependent_mt) {
        assert rkf_term_utilities.NIL != hlmt.hlmt_p(dependent_mt) : dependent_mt;
        rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_term_utilities.$const16$termDependsOn, v_term, dependent_mt), dependent_mt, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 3645L)
    public static SubLObject rkf_find_or_create(final SubLObject preferred_phrase, SubLObject dependent_mt, SubLObject prefix, SubLObject suffix) {
        if (dependent_mt == rkf_term_utilities.UNPROVIDED) {
            dependent_mt = (SubLObject)rkf_term_utilities.NIL;
        }
        if (prefix == rkf_term_utilities.UNPROVIDED) {
            prefix = (SubLObject)rkf_term_utilities.NIL;
        }
        if (suffix == rkf_term_utilities.UNPROVIDED) {
            suffix = (SubLObject)rkf_term_utilities.NIL;
        }
        assert rkf_term_utilities.NIL != Types.stringp(preferred_phrase) : preferred_phrase;
        final SubLObject potential_term = fi.fi_find_int(Sequences.cconcatenate((SubLObject)rkf_term_utilities.$str0$RKF_, preferred_phrase));
        if (rkf_term_utilities.NIL != potential_term) {
            return potential_term;
        }
        return rkf_create(preferred_phrase, dependent_mt, prefix, suffix, (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 4128L)
    public static SubLObject rkf_re_create(final SubLObject preferred_phrase, final SubLObject external_id, SubLObject dependent_mt) {
        if (dependent_mt == rkf_term_utilities.UNPROVIDED) {
            dependent_mt = (SubLObject)rkf_term_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_term_utilities.NIL != Types.stringp(preferred_phrase) : preferred_phrase;
        final SubLObject name = rkf_suggest_constant_name(preferred_phrase, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
        SubLObject new_term = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)rkf_term_utilities.NIL, thread);
            new_term = ke.ke_create_from_serialization(name, external_id);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (rkf_term_utilities.NIL != new_term) {
            rkf_event_dispatcher.rkf_post_create_term_event(new_term, (SubLObject)rkf_term_utilities.UNPROVIDED);
            if (rkf_term_utilities.NIL != dependent_mt) {
                rkf_mark_term_as_contextual(new_term, dependent_mt);
            }
        }
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 4757L)
    public static SubLObject rkf_create_instance_now(final SubLObject collection, SubLObject isa_mt) {
        if (isa_mt == rkf_term_utilities.UNPROVIDED) {
            isa_mt = mt_vars.$default_assert_mt$.getGlobalValue();
        }
        final SubLObject name = rkf_new_constant_name_from_collection(collection);
        final SubLObject constant = ke.ke_create_now(name, (SubLObject)rkf_term_utilities.UNPROVIDED);
        if (rkf_term_utilities.NIL == constant_handles.valid_constantP(constant, (SubLObject)rkf_term_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)rkf_term_utilities.$str17$Couldn_t_create_new_instance_of__, collection, constant);
        }
        if (rkf_term_utilities.NIL != el_utilities.specs_fn_naut_p(collection)) {
            rkf_assertion_utilities.rkf_assert_now((SubLObject)ConsesLow.listS(rkf_term_utilities.$const12$isa, constant, (SubLObject)rkf_term_utilities.$list18), isa_mt);
            rkf_assertion_utilities.rkf_assert_now((SubLObject)ConsesLow.list(rkf_term_utilities.$const13$genls, constant, el_utilities.specs_fn_arg(collection)), isa_mt);
        }
        else {
            rkf_assertion_utilities.rkf_assert_now((SubLObject)ConsesLow.list(rkf_term_utilities.$const12$isa, constant, collection), isa_mt);
        }
        final SubLObject pred = constants_high.find_constant((SubLObject)rkf_term_utilities.$str19$constantNameAutoGeneratedFromColl);
        if (rkf_term_utilities.NIL != pred) {
            rkf_assertion_utilities.rkf_assert_now(el_utilities.make_ternary_formula(pred, constant, collection, name), rkf_term_utilities.$const20$BaseKB);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 5552L)
    public static SubLObject rkf_new_constant_name_from_collection(final SubLObject collection) {
        final SubLObject initial_name = string_utilities.make_valid_constant_name(pph_main.generate_phrase(collection, (SubLObject)rkf_term_utilities.$list21, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED), (SubLObject)rkf_term_utilities.UNPROVIDED);
        final SubLObject name = constant_completion_high.uniquify_constant_name(initial_name, (SubLObject)rkf_term_utilities.UNPROVIDED);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 5794L)
    public static SubLObject rkf_scenario_create(SubLObject string) {
        if (string == rkf_term_utilities.UNPROVIDED) {
            string = (SubLObject)rkf_term_utilities.$str22$Scenario;
        }
        return rkf_create(string, (SubLObject)rkf_term_utilities.NIL, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 6085L)
    public static SubLObject rkf_suggest_constant_name(final SubLObject string, SubLObject prefix_param, SubLObject suffix_param, SubLObject initial_case) {
        if (prefix_param == rkf_term_utilities.UNPROVIDED) {
            prefix_param = (SubLObject)rkf_term_utilities.NIL;
        }
        if (suffix_param == rkf_term_utilities.UNPROVIDED) {
            suffix_param = (SubLObject)rkf_term_utilities.NIL;
        }
        if (initial_case == rkf_term_utilities.UNPROVIDED) {
            initial_case = (SubLObject)rkf_term_utilities.$kw14$UPCASE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefix = (rkf_term_utilities.NIL != prefix_param) ? prefix_param : rkf_term_utilities.$rkf_name_prefix$.getDynamicValue(thread);
        final SubLObject suffix = (rkf_term_utilities.NIL != suffix_param) ? suffix_param : rkf_term_utilities.$rkf_name_suffix$.getDynamicValue(thread);
        return constants_high.suggest_constant_name(string, prefix, suffix, initial_case, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 6406L)
    public static SubLObject rkf_kill(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_term_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject ans = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)rkf_term_utilities.NIL, thread);
            rkf_event_dispatcher.rkf_post_kill_term_event(fort, (SubLObject)rkf_term_utilities.UNPROVIDED);
            ans = ke.ke_kill(fort);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 6641L)
    public static SubLObject rkf_kill_now(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_term_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject ans = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)rkf_term_utilities.NIL, thread);
            rkf_event_dispatcher.rkf_post_kill_term_event(fort, (SubLObject)rkf_term_utilities.UNPROVIDED);
            ans = ke.ke_kill_now(fort);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 6847L)
    public static SubLObject rkf_instantiate(final SubLObject collection, SubLObject interaction_mt) {
        if (interaction_mt == rkf_term_utilities.UNPROVIDED) {
            interaction_mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        assert rkf_term_utilities.NIL != forts.fort_p(collection) : collection;
        final SubLObject name = rkf_suggest_instance_name(collection);
        final SubLObject v_term = rkf_create(name, interaction_mt, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
        rkf_assertion_utilities.rkf_assert((SubLObject)ConsesLow.list(rkf_term_utilities.$const12$isa, v_term, collection), interaction_mt, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 7195L)
    public static SubLObject rkf_suggest_instance_name(final SubLObject collection) {
        assert rkf_term_utilities.NIL != forts.fort_p(collection) : collection;
        return constant_completion_high.uniquify_constant_name(Sequences.cconcatenate(prove.suggest_string_from_fort_el_formula(collection), (SubLObject)rkf_term_utilities.$str24$_instance), (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 7487L)
    public static SubLObject rkf_gather_instantiate_references(final SubLObject formula) {
        return list_utilities.tree_gather(formula, Symbols.symbol_function((SubLObject)rkf_term_utilities.$sym25$RKF_INSTANTIATE_REFERENCE_P), Symbols.symbol_function((SubLObject)rkf_term_utilities.EQUAL), (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 7813L)
    public static SubLObject rkf_instantiate_reference_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_term_utilities.NIL != list_utilities.proper_list_p(obj) && rkf_term_utilities.TWO_INTEGER.numE(Sequences.length(obj)) && rkf_term_utilities.$const26$SomeFn.eql(obj.first()) && rkf_term_utilities.NIL != forts.fort_p(conses_high.second(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 7999L)
    public static SubLObject rkf_subst_instantiate_reference(final SubLObject v_term, final SubLObject instantiate, final SubLObject formula) {
        return conses_high.subst(v_term, instantiate, formula, Symbols.symbol_function((SubLObject)rkf_term_utilities.EQUAL), (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 8230L)
    public static SubLObject rkf_term_defined_in_mtP(final SubLObject v_term, final SubLObject mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(rkf_term_utilities.$const16$termDependsOn, v_term, mt), mt, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 8638L)
    public static SubLObject rkf_terms_created_in_interaction_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = (SubLObject)rkf_term_utilities.NIL;
        final SubLObject _prev_bind_0 = rkf_term_utilities.$rkf_terms_created_accumulator$.currentBinding(thread);
        try {
            rkf_term_utilities.$rkf_terms_created_accumulator$.bind((SubLObject)rkf_term_utilities.NIL, thread);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_term_utilities.$sym27$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_mt_contents((SubLObject)rkf_term_utilities.$sym28$RKF_TERMS_CREATED_HARVESTER, mt, (SubLObject)rkf_term_utilities.UNPROVIDED, (SubLObject)rkf_term_utilities.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
            }
            terms = rkf_term_utilities.$rkf_terms_created_accumulator$.getDynamicValue(thread);
        }
        finally {
            rkf_term_utilities.$rkf_terms_created_accumulator$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(terms, (SubLObject)rkf_term_utilities.$sym29$RKF_TERMS_CREATED_IN_TEMPORAL_ORDER, (SubLObject)rkf_term_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 8953L)
    public static SubLObject rkf_terms_created_harvester(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_term_utilities.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject predicate = assertions_high.gaf_arg0(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (rkf_term_utilities.NIL != forts.fort_p(predicate) && rkf_term_utilities.NIL != genl_predicates.genl_predP(predicate, rkf_term_utilities.$const16$termDependsOn, mt, (SubLObject)rkf_term_utilities.UNPROVIDED) && mt.eql(assertions_high.gaf_arg2(assertion))) {
                final SubLObject item_var;
                final SubLObject v_term = item_var = assertions_high.gaf_arg1(assertion);
                if (rkf_term_utilities.NIL == conses_high.member(item_var, rkf_term_utilities.$rkf_terms_created_accumulator$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)rkf_term_utilities.EQL), Symbols.symbol_function((SubLObject)rkf_term_utilities.IDENTITY))) {
                    rkf_term_utilities.$rkf_terms_created_accumulator$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, rkf_term_utilities.$rkf_terms_created_accumulator$.getDynamicValue(thread)), thread);
                }
            }
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 9357L)
    public static SubLObject rkf_terms_created_in_temporal_order(final SubLObject term_a, final SubLObject term_b) {
        final SubLObject time_a = bookkeeping_store.creation_time(term_a, (SubLObject)rkf_term_utilities.UNPROVIDED);
        final SubLObject second_a = bookkeeping_store.creation_second(term_a, (SubLObject)rkf_term_utilities.UNPROVIDED);
        final SubLObject time_b = bookkeeping_store.creation_time(term_b, (SubLObject)rkf_term_utilities.UNPROVIDED);
        final SubLObject second_b = bookkeeping_store.creation_second(term_b, (SubLObject)rkf_term_utilities.UNPROVIDED);
        if (rkf_term_utilities.NIL != list_utilities.safe_L(time_a, time_b)) {
            return (SubLObject)rkf_term_utilities.T;
        }
        if (rkf_term_utilities.NIL != list_utilities.safe_G(time_a, time_b)) {
            return (SubLObject)rkf_term_utilities.NIL;
        }
        if (rkf_term_utilities.NIL != list_utilities.safe_L(second_a, second_b)) {
            return (SubLObject)rkf_term_utilities.T;
        }
        if (rkf_term_utilities.NIL != list_utilities.safe_G(second_a, second_b)) {
            return (SubLObject)rkf_term_utilities.NIL;
        }
        return (SubLObject)rkf_term_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-term-utilities.lisp", position = 9899L)
    public static SubLObject intermediate_vocab_termP(final SubLObject v_term) {
        return (SubLObject)((rkf_term_utilities.NIL != forts.fort_p(v_term)) ? isa.isa_in_any_mtP(v_term, rkf_term_utilities.$const30$IntermediateVocabTerm) : rkf_term_utilities.NIL);
    }
    
    public static SubLObject declare_rkf_term_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_term_utilities", "with_rkf_name_prefix", "WITH-RKF-NAME-PREFIX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_term_utilities", "with_rkf_name_suffix", "WITH-RKF-NAME-SUFFIX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "create_new_constant", "CREATE-NEW-CONSTANT", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_create", "RKF-CREATE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_mark_term_as_contextual", "RKF-MARK-TERM-AS-CONTEXTUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_find_or_create", "RKF-FIND-OR-CREATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_re_create", "RKF-RE-CREATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_create_instance_now", "RKF-CREATE-INSTANCE-NOW", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_new_constant_name_from_collection", "RKF-NEW-CONSTANT-NAME-FROM-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_scenario_create", "RKF-SCENARIO-CREATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_suggest_constant_name", "RKF-SUGGEST-CONSTANT-NAME", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_kill", "RKF-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_kill_now", "RKF-KILL-NOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_instantiate", "RKF-INSTANTIATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_suggest_instance_name", "RKF-SUGGEST-INSTANCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_gather_instantiate_references", "RKF-GATHER-INSTANTIATE-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_instantiate_reference_p", "RKF-INSTANTIATE-REFERENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_subst_instantiate_reference", "RKF-SUBST-INSTANTIATE-REFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_term_defined_in_mtP", "RKF-TERM-DEFINED-IN-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_terms_created_in_interaction_mt", "RKF-TERMS-CREATED-IN-INTERACTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_terms_created_harvester", "RKF-TERMS-CREATED-HARVESTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "rkf_terms_created_in_temporal_order", "RKF-TERMS-CREATED-IN-TEMPORAL-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_term_utilities", "intermediate_vocab_termP", "INTERMEDIATE-VOCAB-TERM?", 1, 0, false);
        return (SubLObject)rkf_term_utilities.NIL;
    }
    
    public static SubLObject init_rkf_term_utilities_file() {
        rkf_term_utilities.$rkf_name_prefix$ = SubLFiles.defparameter("*RKF-NAME-PREFIX*", (SubLObject)rkf_term_utilities.$str0$RKF_);
        rkf_term_utilities.$rkf_name_suffix$ = SubLFiles.defparameter("*RKF-NAME-SUFFIX*", (SubLObject)rkf_term_utilities.$str1$);
        rkf_term_utilities.$rkf_terms_created_accumulator$ = SubLFiles.defparameter("*RKF-TERMS-CREATED-ACCUMULATOR*", (SubLObject)rkf_term_utilities.NIL);
        return (SubLObject)rkf_term_utilities.NIL;
    }
    
    public static SubLObject setup_rkf_term_utilities_file() {
        access_macros.register_external_symbol((SubLObject)rkf_term_utilities.$sym7$CREATE_NEW_CONSTANT);
        return (SubLObject)rkf_term_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_term_utilities_file();
    }
    
    public void initializeVariables() {
        init_rkf_term_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_term_utilities_file();
    }
    
    static {
        me = (SubLFile)new rkf_term_utilities();
        rkf_term_utilities.$rkf_name_prefix$ = null;
        rkf_term_utilities.$rkf_name_suffix$ = null;
        rkf_term_utilities.$rkf_terms_created_accumulator$ = null;
        $str0$RKF_ = SubLObjectFactory.makeString("RKF-");
        $str1$ = SubLObjectFactory.makeString("");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym4$_RKF_NAME_PREFIX_ = SubLObjectFactory.makeSymbol("*RKF-NAME-PREFIX*");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUFFIX")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$_RKF_NAME_SUFFIX_ = SubLObjectFactory.makeSymbol("*RKF-NAME-SUFFIX*");
        $sym7$CREATE_NEW_CONSTANT = SubLObjectFactory.makeSymbol("CREATE-NEW-CONSTANT");
        $sym8$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym9$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym10$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $str11$Number = SubLObjectFactory.makeString("Number");
        $const12$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const13$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw14$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
        $sym15$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $const16$termDependsOn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termDependsOn"));
        $str17$Couldn_t_create_new_instance_of__ = SubLObjectFactory.makeString("Couldn't create new instance of ~S. Got ~S");
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $str19$constantNameAutoGeneratedFromColl = SubLObjectFactory.makeString("constantNameAutoGeneratedFromCollection");
        $const20$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list21 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $str22$Scenario = SubLObjectFactory.makeString("Scenario");
        $sym23$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str24$_instance = SubLObjectFactory.makeString("-instance");
        $sym25$RKF_INSTANTIATE_REFERENCE_P = SubLObjectFactory.makeSymbol("RKF-INSTANTIATE-REFERENCE-P");
        $const26$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $sym27$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym28$RKF_TERMS_CREATED_HARVESTER = SubLObjectFactory.makeSymbol("RKF-TERMS-CREATED-HARVESTER");
        $sym29$RKF_TERMS_CREATED_IN_TEMPORAL_ORDER = SubLObjectFactory.makeSymbol("RKF-TERMS-CREATED-IN-TEMPORAL-ORDER");
        $const30$IntermediateVocabTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntermediateVocabTerm"));
    }
}

/*

	Total time: 114 ms
	
*/