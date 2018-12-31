package com.cyc.cycjava.cycl.butler;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class external_rule_reviewer_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities";
    public static final String myFingerPrint = "fb9cdeefc649aaa3fdc10e51f8798e2f0b21c58cfa96e5827520d683a00ce308";
    private static final SubLFloat $float0$0_5;
    private static final SubLObject $const1$suggestedRule;
    private static final SubLObject $const2$SuggestedRulesMt;
    private static final SubLSymbol $sym3$ASSERTION_FORMULA;
    private static final SubLSymbol $sym4$CADR;
    private static final SubLSymbol $sym5$EL_IMPLICATION_P;
    private static final SubLList $list6;
    private static final SubLString $str7$If_;
    private static final SubLString $str8$__;
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1075L)
    public static SubLObject get_random_rule() {
        if (external_rule_reviewer_utilities.NIL != number_utilities.true_with_probability((SubLObject)external_rule_reviewer_utilities.$float0$0_5)) {
            return (SubLObject)external_rule_reviewer_utilities.NIL;
        }
        Threads.sleep((SubLObject)external_rule_reviewer_utilities.TWO_INTEGER);
        final SubLObject assertions = kb_mapping.gather_predicate_extent_index(external_rule_reviewer_utilities.$const1$suggestedRule, external_rule_reviewer_utilities.$const2$SuggestedRulesMt, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED);
        final SubLObject assertion_lists = Mapping.mapcar((SubLObject)external_rule_reviewer_utilities.$sym3$ASSERTION_FORMULA, assertions);
        final SubLObject rules = Mapping.mapcar((SubLObject)external_rule_reviewer_utilities.$sym4$CADR, assertion_lists);
        return list_utilities.random_element(rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1533L)
    public static SubLObject random_rule_validP(final SubLObject rule) {
        Threads.sleep((SubLObject)external_rule_reviewer_utilities.TWO_INTEGER);
        return number_utilities.true_with_probability((SubLObject)external_rule_reviewer_utilities.$float0$0_5);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/butler/external-rule-reviewer-utilities.lisp", position = 1693L)
    public static SubLObject get_rule_synopsis(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert external_rule_reviewer_utilities.NIL != el_utilities.el_implication_p(rule) : rule;
        SubLObject result = (SubLObject)external_rule_reviewer_utilities.NIL;
        final SubLObject first_clause = (external_rule_reviewer_utilities.NIL != conses_high.member(list_utilities.caadr(rule), (SubLObject)external_rule_reviewer_utilities.$list6, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED)) ? conses_high.cadr(conses_high.cadr(rule)) : conses_high.cadr(rule);
        final SubLObject _prev_bind_0 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_quantify_varsP$.bind((SubLObject)external_rule_reviewer_utilities.NIL, thread);
            final SubLObject text = pph_main.generate_text(first_clause, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED, (SubLObject)external_rule_reviewer_utilities.UNPROVIDED);
            final SubLObject synopsis = result = Sequences.cconcatenate((SubLObject)external_rule_reviewer_utilities.$str7$If_, new SubLObject[] { text, external_rule_reviewer_utilities.$str8$__ });
        }
        finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_external_rule_reviewer_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities", "get_random_rule", "GET-RANDOM-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities", "random_rule_validP", "RANDOM-RULE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.external_rule_reviewer_utilities", "get_rule_synopsis", "GET-RULE-SYNOPSIS", 1, 0, false);
        return (SubLObject)external_rule_reviewer_utilities.NIL;
    }
    
    public static SubLObject init_external_rule_reviewer_utilities_file() {
        return (SubLObject)external_rule_reviewer_utilities.NIL;
    }
    
    public static SubLObject setup_external_rule_reviewer_utilities_file() {
        return (SubLObject)external_rule_reviewer_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_external_rule_reviewer_utilities_file();
    }
    
    public void initializeVariables() {
        init_external_rule_reviewer_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_external_rule_reviewer_utilities_file();
    }
    
    static {
        me = (SubLFile)new external_rule_reviewer_utilities();
        $float0$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $const1$suggestedRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suggestedRule"));
        $const2$SuggestedRulesMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuggestedRulesMt"));
        $sym3$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym4$CADR = SubLObjectFactory.makeSymbol("CADR");
        $sym5$EL_IMPLICATION_P = SubLObjectFactory.makeSymbol("EL-IMPLICATION-P");
        $list6 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")));
        $str7$If_ = SubLObjectFactory.makeString("If ");
        $str8$__ = SubLObjectFactory.makeString("..");
    }
}

/*

	Total time: 79 ms
	
*/