package com.cyc.cycjava.cycl.nl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subcollection_unwinder;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_scg extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl.removal_modules_scg";
    public static final String myFingerPrint = "924dd601ec858157a405c0f735c7ba2965edf57116dd77b93443aa22f3f02796";
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 5078L)
    private static SubLSymbol $scg_parse_removal_clear_cachesP$;
    private static final SubLObject $const0$scgParse;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_SCG_PARSE;
    private static final SubLList $list3;
    private static final SubLObject $const4$scgParse_Partial;
    private static final SubLSymbol $kw5$REMOVAL_SCG_PARSE_PARTIAL;
    private static final SubLList $list6;
    private static final SubLObject $const7$scgParse_Sentence;
    private static final SubLSymbol $kw8$REMOVAL_SCG_PARSE_SENTENCE;
    private static final SubLList $list9;
    private static final SubLObject $const10$scgParse_Term;
    private static final SubLSymbol $kw11$REMOVAL_SCG_PARSE_TERM;
    private static final SubLList $list12;
    private static final SubLObject $const13$scgParse_Partial_Sentence;
    private static final SubLSymbol $kw14$REMOVAL_SCG_PARSE_PARTIAL_SENTENCE;
    private static final SubLList $list15;
    private static final SubLObject $const16$scgParse_Partial_Term;
    private static final SubLSymbol $kw17$REMOVAL_SCG_PARSE_PARTIAL_TERM;
    private static final SubLList $list18;
    private static final SubLInteger $int19$1000;
    private static final SubLSymbol $kw20$CLEAR_CACHES_;
    private static final SubLSymbol $kw21$COMPLETE_MATCHES_ONLY_;
    private static final SubLSymbol $kw22$MAX_TIME;
    private static final SubLSymbol $kw23$NONE;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$SENTENCE;
    private static final SubLSymbol $kw26$TERM;
    private static final SubLSymbol $kw27$OPAQUE;
    private static final SubLObject $const28$salientURL;
    private static final SubLObject $const29$URLFn;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLObject $const34$unwindingOfSubcollectionExpressio;
    private static final SubLSymbol $kw35$REMOVAL_UNWINDING_OF_SUBCOLLECTION_EXPRESSION;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$NART_P;
    private static final SubLSymbol $sym38$NART_EL_FORMULA;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 5152L)
    public static SubLObject removal_scg_parse_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_scg.UNPROVIDED) {
            sense = (SubLObject)removal_modules_scg.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject parse_string_arg = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_scg.UNPROVIDED);
        final SubLObject parse_result_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_scg.UNPROVIDED);
        final SubLObject complete_matches_onlyP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_scg.NIL == scg_parse_pred_partialP(pred));
        final SubLObject partial_parse_offset_arg = (SubLObject)((removal_modules_scg.NIL != complete_matches_onlyP) ? removal_modules_scg.NIL : cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_scg.UNPROVIDED));
        final SubLObject partial_parse_length_arg = (SubLObject)((removal_modules_scg.NIL != complete_matches_onlyP) ? removal_modules_scg.NIL : cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_scg.UNPROVIDED));
        final SubLObject restricted_result_type = scg_parse_pred_restriction_type(pred);
        final SubLObject remaining_time = (SubLObject)((removal_modules_scg.NIL != inference_macros.current_controlling_inference()) ? inference_datastructures_inference.inference_remaining_time(inference_macros.current_controlling_inference(), (SubLObject)removal_modules_scg.UNPROVIDED) : removal_modules_scg.NIL);
        final SubLObject max_time_msec = (SubLObject)((removal_modules_scg.NIL != remaining_time) ? Numbers.multiply(remaining_time, (SubLObject)removal_modules_scg.$int19$1000) : removal_modules_scg.NIL);
        SubLObject params = (SubLObject)ConsesLow.list((SubLObject)removal_modules_scg.$kw20$CLEAR_CACHES_, removal_modules_scg.$scg_parse_removal_clear_cachesP$.getDynamicValue(thread), (SubLObject)removal_modules_scg.$kw21$COMPLETE_MATCHES_ONLY_, complete_matches_onlyP);
        if (removal_modules_scg.NIL != max_time_msec) {
            params = conses_high.putf(params, (SubLObject)removal_modules_scg.$kw22$MAX_TIME, max_time_msec);
        }
        if (parse_string_arg.isString()) {
            thread.resetMultipleValues();
            final SubLObject parses = scg_api.scg_parse(parse_string_arg, params);
            final SubLObject url = thread.secondMultipleValue();
            final SubLObject matched_strings = thread.thirdMultipleValue();
            final SubLObject matched_string_offsets = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            SubLObject parse = (SubLObject)removal_modules_scg.NIL;
            SubLObject parse_$1 = (SubLObject)removal_modules_scg.NIL;
            SubLObject matched_string = (SubLObject)removal_modules_scg.NIL;
            SubLObject matched_string_$2 = (SubLObject)removal_modules_scg.NIL;
            SubLObject matched_offset = (SubLObject)removal_modules_scg.NIL;
            SubLObject matched_offset_$3 = (SubLObject)removal_modules_scg.NIL;
            parse = parses;
            parse_$1 = parse.first();
            matched_string = matched_strings;
            matched_string_$2 = matched_string.first();
            matched_offset = matched_string_offsets;
            matched_offset_$3 = matched_offset.first();
            while (removal_modules_scg.NIL != matched_offset || removal_modules_scg.NIL != matched_string || removal_modules_scg.NIL != parse) {
                final SubLObject matched_length = Sequences.length(matched_string_$2);
                if (restricted_result_type != removal_modules_scg.$kw23$NONE && removal_modules_scg.NIL != el_utilities.el_formula_with_any_of_operators_p(parse_$1, (SubLObject)removal_modules_scg.$list24) && removal_modules_scg.NIL != el_utilities.el_binary_formula_p(parse_$1)) {
                    parse_$1 = ((removal_modules_scg.NIL != cycl_variables.cyc_varP(cycl_utilities.el_formula_arg1(parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED))) ? cycl_utilities.el_formula_arg2(parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED) : ((removal_modules_scg.NIL != cycl_variables.cyc_varP(cycl_utilities.el_formula_arg2(parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED))) ? cycl_utilities.el_formula_arg1(parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED) : parse_$1));
                }
                SubLObject abort_due_to_type_mismatchP = (SubLObject)removal_modules_scg.NIL;
                if (restricted_result_type == removal_modules_scg.$kw25$SENTENCE && removal_modules_scg.NIL == el_grammar.el_sentence_p(parse_$1)) {
                    abort_due_to_type_mismatchP = (SubLObject)removal_modules_scg.T;
                }
                if (restricted_result_type == removal_modules_scg.$kw26$TERM && removal_modules_scg.NIL != el_grammar.el_sentence_p(parse_$1)) {
                    abort_due_to_type_mismatchP = (SubLObject)removal_modules_scg.T;
                }
                if (removal_modules_scg.NIL == abort_due_to_type_mismatchP && removal_modules_scg.NIL != unification.unify_possible(parse_result_arg, parse_$1) && (removal_modules_scg.NIL != complete_matches_onlyP || (removal_modules_scg.NIL != unification.unify_possible(partial_parse_offset_arg, matched_offset_$3) && removal_modules_scg.NIL != unification.unify_possible(partial_parse_length_arg, matched_length)))) {
                    SubLObject v_bindings = (removal_modules_scg.NIL != complete_matches_onlyP) ? unification_utilities.term_unify(parse_result_arg, parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED) : ConsesLow.nconc(unification_utilities.term_unify(parse_result_arg, parse_$1, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED), unification_utilities.term_unify(partial_parse_offset_arg, matched_offset_$3, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED), unification_utilities.term_unify(partial_parse_length_arg, matched_length, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED));
                    if (removal_modules_scg.NIL == scg_parse_pred_uses_legacy_incorrect_non_quotingP(pred)) {
                        SubLObject new_bindings = (SubLObject)removal_modules_scg.NIL;
                        SubLObject cdolist_list_var = v_bindings;
                        SubLObject binding = (SubLObject)removal_modules_scg.NIL;
                        binding = cdolist_list_var.first();
                        while (removal_modules_scg.NIL != cdolist_list_var) {
                            new_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), (removal_modules_scg.NIL != cycl_grammar.cycl_unrepresented_term_p(bindings.variable_binding_value(binding))) ? bindings.variable_binding_value(binding) : el_utilities.possibly_quote(bindings.variable_binding_value(binding))), new_bindings);
                            cdolist_list_var = cdolist_list_var.rest();
                            binding = cdolist_list_var.first();
                        }
                        v_bindings = new_bindings;
                    }
                    final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
                    final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_scg.$kw27$OPAQUE, sentence, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED);
                    final SubLObject url_support = arguments.make_hl_support((SubLObject)removal_modules_scg.$kw27$OPAQUE, el_utilities.make_formula(removal_modules_scg.$const28$salientURL, (SubLObject)ConsesLow.list(matched_string_$2, (SubLObject)ConsesLow.list(removal_modules_scg.$const29$URLFn, url)), (SubLObject)removal_modules_scg.UNPROVIDED), (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED);
                    backward.removal_add_node(hl_support, v_bindings, (SubLObject)ConsesLow.list(url_support));
                }
                parse = parse.rest();
                parse_$1 = parse.first();
                matched_string = matched_string.rest();
                matched_string_$2 = matched_string.first();
                matched_offset = matched_offset.rest();
                matched_offset_$3 = matched_offset.first();
            }
        }
        return (SubLObject)removal_modules_scg.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 9936L)
    public static SubLObject scg_parse_pred_uses_legacy_incorrect_non_quotingP(final SubLObject pred) {
        return (SubLObject)removal_modules_scg.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 10328L)
    public static SubLObject scg_parse_pred_partialP(final SubLObject pred) {
        return list_utilities.member_kbeqP(pred, (SubLObject)removal_modules_scg.$list30);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 10479L)
    public static SubLObject scg_parse_pred_restriction_type(final SubLObject pred) {
        return (SubLObject)((removal_modules_scg.NIL != list_utilities.member_kbeqP(pred, (SubLObject)removal_modules_scg.$list31)) ? removal_modules_scg.$kw23$NONE : ((removal_modules_scg.NIL != list_utilities.member_kbeqP(pred, (SubLObject)removal_modules_scg.$list32)) ? removal_modules_scg.$kw26$TERM : ((removal_modules_scg.NIL != list_utilities.member_kbeqP(pred, (SubLObject)removal_modules_scg.$list33)) ? removal_modules_scg.$kw25$SENTENCE : removal_modules_scg.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/removal-modules-scg.lisp", position = 11799L)
    public static SubLObject removal_unwinding_of_subcollection_expression_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_scg.UNPROVIDED) {
            sense = (SubLObject)removal_modules_scg.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_nested_arg = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_scg.UNPROVIDED);
        final SubLObject raw_unwound_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_scg.UNPROVIDED);
        thread.resetMultipleValues();
        SubLObject nested_arg = el_utilities.possibly_unquote_closed_formula(raw_nested_arg);
        final SubLObject nested_arg_quotedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        nested_arg = cycl_utilities.expression_transform(nested_arg, (SubLObject)removal_modules_scg.$sym37$NART_P, (SubLObject)removal_modules_scg.$sym38$NART_EL_FORMULA, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject unwound_arg = el_utilities.possibly_unquote_closed_formula(raw_unwound_arg);
        final SubLObject unwound_arg_quotedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject raw_unwound_answer = subcollection_unwinder.scg_subcl_expand_signature_int(nested_arg);
        final SubLObject unwound_answer = el_utilities.possibly_quote_open_formula(raw_unwound_answer, unwound_arg_quotedP);
        final SubLObject v_bindings = unification_utilities.term_unify(unwound_arg, unwound_answer, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED);
        final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
        final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_scg.$kw27$OPAQUE, sentence, (SubLObject)removal_modules_scg.UNPROVIDED, (SubLObject)removal_modules_scg.UNPROVIDED);
        backward.removal_add_node(hl_support, v_bindings, (SubLObject)removal_modules_scg.UNPROVIDED);
        return (SubLObject)removal_modules_scg.NIL;
    }
    
    public static SubLObject declare_removal_modules_scg_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.removal_modules_scg", "removal_scg_parse_expand", "REMOVAL-SCG-PARSE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.removal_modules_scg", "scg_parse_pred_uses_legacy_incorrect_non_quotingP", "SCG-PARSE-PRED-USES-LEGACY-INCORRECT-NON-QUOTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.removal_modules_scg", "scg_parse_pred_partialP", "SCG-PARSE-PRED-PARTIAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.removal_modules_scg", "scg_parse_pred_restriction_type", "SCG-PARSE-PRED-RESTRICTION-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.removal_modules_scg", "removal_unwinding_of_subcollection_expression_expand", "REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_scg.NIL;
    }
    
    public static SubLObject init_removal_modules_scg_file() {
        removal_modules_scg.$scg_parse_removal_clear_cachesP$ = SubLFiles.defparameter("*SCG-PARSE-REMOVAL-CLEAR-CACHES?*", (SubLObject)removal_modules_scg.T);
        return (SubLObject)removal_modules_scg.NIL;
    }
    
    public static SubLObject setup_removal_modules_scg_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const0$scgParse);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const0$scgParse, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw2$REMOVAL_SCG_PARSE, (SubLObject)removal_modules_scg.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const4$scgParse_Partial);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const4$scgParse_Partial, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw5$REMOVAL_SCG_PARSE_PARTIAL, (SubLObject)removal_modules_scg.$list6);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const7$scgParse_Sentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const7$scgParse_Sentence, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw8$REMOVAL_SCG_PARSE_SENTENCE, (SubLObject)removal_modules_scg.$list9);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const10$scgParse_Term);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const10$scgParse_Term, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw11$REMOVAL_SCG_PARSE_TERM, (SubLObject)removal_modules_scg.$list12);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const13$scgParse_Partial_Sentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const13$scgParse_Partial_Sentence, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw14$REMOVAL_SCG_PARSE_PARTIAL_SENTENCE, (SubLObject)removal_modules_scg.$list15);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const16$scgParse_Partial_Term);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const16$scgParse_Partial_Term, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw17$REMOVAL_SCG_PARSE_PARTIAL_TERM, (SubLObject)removal_modules_scg.$list18);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_scg.$const34$unwindingOfSubcollectionExpressio);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_scg.$kw1$POS, removal_modules_scg.$const34$unwindingOfSubcollectionExpressio, (SubLObject)removal_modules_scg.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_scg.$kw35$REMOVAL_UNWINDING_OF_SUBCOLLECTION_EXPRESSION, (SubLObject)removal_modules_scg.$list36);
        return (SubLObject)removal_modules_scg.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_scg_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_scg_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_scg_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_scg();
        removal_modules_scg.$scg_parse_removal_clear_cachesP$ = null;
        $const0$scgParse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_SCG_PARSE = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse \"some clouds in the sky\" ?PARSE))") });
        $const4$scgParse_Partial = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial"));
        $kw5$REMOVAL_SCG_PARSE_PARTIAL = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE-PARTIAL");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse-Partial <fully-bound-p> <anything> <anything> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse-Partial \"some clouds in the sky\" ?INTERP ?OFFSET ?LENGTH))") });
        $const7$scgParse_Sentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Sentence"));
        $kw8$REMOVAL_SCG_PARSE_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE-SENTENCE");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Sentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Sentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse-Sentence <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse-Sentence \"some clouds in the sky\" ?PARSE))") });
        $const10$scgParse_Term = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Term"));
        $kw11$REMOVAL_SCG_PARSE_TERM = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE-TERM");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Term")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Term")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse-Term <fully-bound-p> <anything>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse-Term \"some clouds in the sky\" ?PARSE))") });
        $const13$scgParse_Partial_Sentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Sentence"));
        $kw14$REMOVAL_SCG_PARSE_PARTIAL_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE-PARTIAL-SENTENCE");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Sentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Sentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse-Partial-Sentence <fully-bound-p> <anything> <anything> <anything>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse-Partial-Sentence \"some clouds in the sky\" ?INTERP ?OFFSET ?LENGTH))") });
        $const16$scgParse_Partial_Term = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Term"));
        $kw17$REMOVAL_SCG_PARSE_PARTIAL_TERM = SubLObjectFactory.makeKeyword("REMOVAL-SCG-PARSE-PARTIAL-TERM");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Term")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Term")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SCG-PARSE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$scgParse-Partial-Term <fully-bound-p> <anything> <anything> <anything>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$scgParse-Partial-Term \"some clouds in the sky\" ?INTERP ?LENGTH ?OFFSET)") });
        $int19$1000 = SubLObjectFactory.makeInteger(1000);
        $kw20$CLEAR_CACHES_ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $kw21$COMPLETE_MATCHES_ONLY_ = SubLObjectFactory.makeKeyword("COMPLETE-MATCHES-ONLY?");
        $kw22$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw23$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list24 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols")));
        $kw25$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw26$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw27$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const28$salientURL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientURL"));
        $const29$URLFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URLFn"));
        $list30 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Sentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Term")));
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial")));
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Term")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Term")));
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Sentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scgParse-Partial-Sentence")));
        $const34$unwindingOfSubcollectionExpressio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unwindingOfSubcollectionExpression"));
        $kw35$REMOVAL_UNWINDING_OF_SUBCOLLECTION_EXPRESSION = SubLObjectFactory.makeKeyword("REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unwindingOfSubcollectionExpression")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unwindingOfSubcollectionExpression")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_scg.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-UNWINDING-OF-SUBCOLLECTION-EXPRESSION-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$unwindingOfSubcollectionExpression <fully-bound-p> <anything>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(unwindingOfSubcollectionExpression \n  (SubcollectionOfWithRelationToTypeFn FlashMobPerformance movementCoordinatedWith (MusicOfFn JohnPhilipSousa-Composer))\n  (Quote (and (isa ?X FlashMobPerformance) (isa ?Y (MusicOfFn JohnPhilipSousa-Composer)) (movementCoordinatedWith ?X ?Y))))") });
        $sym37$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym38$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
    }
}

/*

	Total time: 83 ms
	
*/