package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_query_processing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_query_processing";
    public static final String myFingerPrint = "f8f53045aeeafcdeaddea67cba8f502db08030efcc5dfbd12ea3b9c20c456fdb";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 1506L)
    private static SubLSymbol $query_processing_microseconds$;
    private static final SubLObject $const0$QueryProcessingRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$1200;
    private static final SubLSymbol $kw3$IGNORE;
    private static final SubLObject $const4$VariableFn;
    private static final SubLObject $const5$noNotableInstances;
    private static final SubLObject $const6$QuantityVariableFn;
    private static final SubLObject $const7$CardinalityOfFn;
    private static final SubLObject $const8$extentCardinality;
    private static final SubLObject $const9$TheSetOf;
    private static final SubLObject $const10$and;
    private static final SubLObject $const11$isa;
    private static final SubLList $list12;
    private static final SubLString $str13$__QuantityVariableFn;
    private static final SubLObject $const14$is_Underspecified;
    private static final SubLString $str15$CardinalityOfFn__QP__1;
    private static final SubLString $str16$CardinalityOfFn_2;
    private static final SubLObject $const17$implies;
    private static final SubLObject $const18$genls;
    private static final SubLString $str19$VariableFn_specs;
    private static final SubLString $str20$VariableFn_instances;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 1565L)
    public static SubLObject query_processing_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_query_processing.$query_processing_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 1865L)
    public static SubLObject query_proc_check_expression(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_query_processing.NIL != clauses.clauses_p(expression) && reformulator_module_query_processing.NIL != list_utilities.singletonP(expression) && reformulator_module_query_processing.NIL != clause_utilities.pos_atomic_cnf_p(expression.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 2036L)
    public static SubLObject query_processing_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        final SubLObject asent = (reformulator_module_query_processing.NIL != query_proc_check_expression(expression)) ? clause_utilities.gaf_cnf_literal(expression.first()) : expression;
        if (reformulator_module_query_processing.NIL != el_utilities.el_formula_p(asent)) {
            SubLObject matchP = (SubLObject)reformulator_module_query_processing.NIL;
            final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_query_processing.$kw3$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)reformulator_module_query_processing.NIL, rest = args; reformulator_module_query_processing.NIL == matchP && reformulator_module_query_processing.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                if (reformulator_module_query_processing.NIL != query_proc_variable_fn_expressionP(arg, mt)) {
                    matchP = (SubLObject)reformulator_module_query_processing.T;
                }
            }
            return matchP;
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 2642L)
    public static SubLObject query_proc_variable_fn_expressionP(final SubLObject subexpression, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_query_processing.NIL != query_proc_variable_fn_expression_specsP(subexpression, mt) || reformulator_module_query_processing.NIL != query_proc_variable_fn_expression_instancesP(subexpression, mt) || reformulator_module_query_processing.NIL != query_proc_quantity_variable_fn_exprP(subexpression, mt) || reformulator_module_query_processing.NIL != query_proc_cardinality_of_fn_exprP(subexpression, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 2985L)
    public static SubLObject query_proc_variable_fn_expression_specsP(final SubLObject subexpression, final SubLObject mt) {
        if (reformulator_module_query_processing.NIL != el_utilities.el_formula_p(subexpression) && reformulator_module_query_processing.NIL != el_utilities.formula_arityE(subexpression, (SubLObject)reformulator_module_query_processing.TWO_INTEGER, (SubLObject)reformulator_module_query_processing.UNPROVIDED)) {
            final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
            final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
            if (!reformulator_module_query_processing.$const4$VariableFn.eql(function_expr)) {
                return (SubLObject)reformulator_module_query_processing.NIL;
            }
            if (reformulator_module_query_processing.NIL != fort_types_interface.isa_collectionP(coll_arg, mt) && reformulator_module_query_processing.NIL != list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(reformulator_module_query_processing.$const5$noNotableInstances, coll_arg), mt, (SubLObject)reformulator_module_query_processing.UNPROVIDED, (SubLObject)reformulator_module_query_processing.UNPROVIDED))) {
                return (SubLObject)reformulator_module_query_processing.T;
            }
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 3673L)
    public static SubLObject query_proc_variable_fn_expression_instancesP(final SubLObject subexpression, final SubLObject mt) {
        if (reformulator_module_query_processing.NIL != el_utilities.el_formula_p(subexpression) && reformulator_module_query_processing.NIL != el_utilities.formula_arityE(subexpression, (SubLObject)reformulator_module_query_processing.TWO_INTEGER, (SubLObject)reformulator_module_query_processing.UNPROVIDED)) {
            final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
            final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
            if (!reformulator_module_query_processing.$const4$VariableFn.eql(function_expr)) {
                return (SubLObject)reformulator_module_query_processing.NIL;
            }
            if (reformulator_module_query_processing.NIL != fort_types_interface.isa_collectionP(coll_arg, mt) && reformulator_module_query_processing.NIL == list_utilities.sublisp_boolean(backward.removal_ask((SubLObject)ConsesLow.list(reformulator_module_query_processing.$const5$noNotableInstances, coll_arg), mt, (SubLObject)reformulator_module_query_processing.UNPROVIDED, (SubLObject)reformulator_module_query_processing.UNPROVIDED))) {
                return (SubLObject)reformulator_module_query_processing.T;
            }
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 4377L)
    public static SubLObject query_proc_quantity_variable_fn_exprP(final SubLObject subexpression, final SubLObject mt) {
        if (reformulator_module_query_processing.NIL == el_utilities.el_formula_p(subexpression) || reformulator_module_query_processing.NIL == el_utilities.formula_arityE(subexpression, (SubLObject)reformulator_module_query_processing.TWO_INTEGER, (SubLObject)reformulator_module_query_processing.UNPROVIDED)) {
            return (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
        final SubLObject coll_arg = cycl_utilities.formula_arg2(subexpression, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        if (reformulator_module_query_processing.$const6$QuantityVariableFn.eql(function_expr)) {
            return (SubLObject)reformulator_module_query_processing.T;
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 4903L)
    public static SubLObject query_proc_cardinality_of_fn_exprP(final SubLObject subexpression, final SubLObject mt) {
        if (reformulator_module_query_processing.NIL == el_utilities.el_formula_p(subexpression) || reformulator_module_query_processing.NIL == el_utilities.formula_arityE(subexpression, (SubLObject)reformulator_module_query_processing.ONE_INTEGER, (SubLObject)reformulator_module_query_processing.UNPROVIDED)) {
            return (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLObject function_expr = cycl_utilities.formula_operator(subexpression);
        final SubLObject coll_arg = cycl_utilities.formula_arg1(subexpression, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        if (reformulator_module_query_processing.$const7$CardinalityOfFn.eql(function_expr)) {
            return (SubLObject)reformulator_module_query_processing.T;
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 5415L)
    public static SubLObject query_processing_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_query_processing.NIL != query_proc_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = (SubLObject)reformulator_module_query_processing.NIL;
            SubLObject justification = (SubLObject)reformulator_module_query_processing.T;
            if (reformulator_module_query_processing.NIL != el_utilities.el_formula_p(asent)) {
                SubLObject argnum = (SubLObject)reformulator_module_query_processing.ZERO_INTEGER;
                final SubLObject args = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_query_processing.$kw3$IGNORE);
                SubLObject rest;
                SubLObject arg;
                SubLObject new_sentence_$1;
                SubLObject justification_$2;
                SubLObject new_sentence_$2;
                SubLObject justification_$3;
                SubLObject new_sentence_$3;
                SubLObject justification_$4;
                SubLObject new_sentence_$4;
                SubLObject justification_$5;
                for (rest = (SubLObject)reformulator_module_query_processing.NIL, rest = args; reformulator_module_query_processing.NIL == new_sentence && reformulator_module_query_processing.NIL != rest; rest = rest.rest()) {
                    arg = rest.first();
                    argnum = Numbers.add(argnum, (SubLObject)reformulator_module_query_processing.ONE_INTEGER);
                    if (reformulator_module_query_processing.NIL != query_proc_variable_fn_expression_specsP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$1 = query_proc_variable_fn_specs_reformulate(asent, argnum, mt, settings, original_clause);
                        justification_$2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$1;
                        justification = justification_$2;
                    }
                    else if (reformulator_module_query_processing.NIL != query_proc_variable_fn_expression_instancesP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$2 = query_proc_variable_fn_instances_reformulate(asent, argnum, mt, settings, original_clause);
                        justification_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$2;
                        justification = justification_$3;
                    }
                    else if (reformulator_module_query_processing.NIL != query_proc_quantity_variable_fn_exprP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$3 = query_proc_quantity_variable_fn_reformulate(asent, argnum, mt, settings, original_clause);
                        justification_$4 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$3;
                        justification = justification_$4;
                    }
                    else if (reformulator_module_query_processing.NIL != query_proc_cardinality_of_fn_exprP(arg, mt)) {
                        thread.resetMultipleValues();
                        new_sentence_$4 = query_proc_cardinality_of_fn_reformulate(asent, argnum, mt, settings, original_clause);
                        justification_$5 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_sentence = new_sentence_$4;
                        justification = justification_$5;
                    }
                }
            }
            return Values.values((SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
        }
        return Values.values(expression, (SubLObject)reformulator_module_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 6750L)
    public static SubLObject query_proc_quantity_variable_fn_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_query_processing.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLObject asent = conses_high.copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg2(arg, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
        return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.listS(reformulator_module_query_processing.$const8$extentCardinality, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const9$TheSetOf, new_var, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const10$and, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const11$isa, new_var, col), subsentence)), (SubLObject)reformulator_module_query_processing.$list12)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_query_processing.$str13$__QuantityVariableFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 7592L)
    public static SubLObject query_proc_cardinality_of_fn_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_query_processing.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLObject asent = conses_high.copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = cycl_utilities.formula_arg1(arg, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
        final SubLObject new_set_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent, subsentence), (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        if (!pred.eql(reformulator_module_query_processing.$const14$is_Underspecified) || !argnum.numE((SubLObject)reformulator_module_query_processing.ONE_INTEGER) || reformulator_module_query_processing.NIL == fort_types_interface.isa_collectionP(col, mt)) {
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_query_processing.$const10$and, subsentence, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const8$extentCardinality, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const9$TheSetOf, new_set_var, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const11$isa, new_set_var, col)), new_var))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_query_processing.$str16$CardinalityOfFn_2));
        }
        final SubLObject result = reformulator_module_quantifier_processing_3.quantproc_3_reformulate_cardinality_of_fn(asent, argnum, mt, settings, original_clause);
        if (reformulator_module_query_processing.NIL != result) {
            return Values.values(result.first(), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_query_processing.$str15$CardinalityOfFn__QP__1));
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 8815L)
    public static SubLObject query_proc_variable_fn_specs_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_query_processing.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject variable_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject el_var = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, asent), (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, new_var, asent);
        return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_query_processing.$const10$and, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const17$implies, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const11$isa, new_var, el_var), subsentence), (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const18$genls, el_var, col))), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_query_processing.$str19$VariableFn_specs));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-query-processing.lisp", position = 9770L)
    public static SubLObject query_proc_variable_fn_instances_reformulate(final SubLObject expression, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_query_processing.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = conses_high.copy_tree(expression);
        final SubLObject arg = cycl_utilities.formula_arg(asent, argnum, (SubLObject)reformulator_module_query_processing.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        final SubLObject variable_fn = el_utilities.unmake_binary_formula(arg);
        final SubLObject el_var = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject subsentence = el_utilities.replace_formula_arg(argnum, el_var, asent);
        if (reformulator_module_query_processing.NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            return Values.values(el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_query_processing.$const10$and, (SubLObject)ConsesLow.list(reformulator_module_query_processing.$const11$isa, el_var, col), subsentence)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_query_processing.$str20$VariableFn_instances));
        }
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    public static SubLObject declare_reformulator_module_query_processing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_processing_cost_estimate", "QUERY-PROCESSING-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_check_expression", "QUERY-PROC-CHECK-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_processing_expression_required", "QUERY-PROCESSING-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_variable_fn_expressionP", "QUERY-PROC-VARIABLE-FN-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_variable_fn_expression_specsP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-SPECS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_variable_fn_expression_instancesP", "QUERY-PROC-VARIABLE-FN-EXPRESSION-INSTANCES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_quantity_variable_fn_exprP", "QUERY-PROC-QUANTITY-VARIABLE-FN-EXPR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_cardinality_of_fn_exprP", "QUERY-PROC-CARDINALITY-OF-FN-EXPR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_processing_reformulate", "QUERY-PROCESSING-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_quantity_variable_fn_reformulate", "QUERY-PROC-QUANTITY-VARIABLE-FN-REFORMULATE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_cardinality_of_fn_reformulate", "QUERY-PROC-CARDINALITY-OF-FN-REFORMULATE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_variable_fn_specs_reformulate", "QUERY-PROC-VARIABLE-FN-SPECS-REFORMULATE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_query_processing", "query_proc_variable_fn_instances_reformulate", "QUERY-PROC-VARIABLE-FN-INSTANCES-REFORMULATE", 4, 1, false);
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    public static SubLObject init_reformulator_module_query_processing_file() {
        reformulator_module_query_processing.$query_processing_microseconds$ = SubLFiles.deflexical("*QUERY-PROCESSING-MICROSECONDS*", (SubLObject)reformulator_module_query_processing.$int2$1200);
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    public static SubLObject setup_reformulator_module_query_processing_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_query_processing.$const0$QueryProcessingRLModule, (SubLObject)reformulator_module_query_processing.$list1);
        return (SubLObject)reformulator_module_query_processing.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_module_query_processing_file();
    }
    
    public void initializeVariables() {
        init_reformulator_module_query_processing_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_module_query_processing_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_query_processing();
        reformulator_module_query_processing.$query_processing_microseconds$ = null;
        $const0$QueryProcessingRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QueryProcessingRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("QUERY-PROCESSING-EXPRESSION-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("QUERY-PROCESSING-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("QUERY-PROCESSING-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Reformulates #$VariableFn expressions so that queries search for bindings of the appropriate type."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$contains-Underspecified (#$VariableFn ?WHICH-THING #$DNAMolecule)\n    #$Ribose)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$and\n     (#$genls ?WHICH-THING #$DNAMolecule)\n     (#$implies\n      (#$isa ?X ?WHICH-THING)\n      (#$contains-Underspecified ?WHICH-THING #$Ribose)))") });
        $int2$1200 = SubLObjectFactory.makeInteger(1200);
        $kw3$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const4$VariableFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariableFn"));
        $const5$noNotableInstances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("noNotableInstances"));
        $const6$QuantityVariableFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantityVariableFn"));
        $const7$CardinalityOfFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardinalityOfFn"));
        $const8$extentCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extentCardinality"));
        $const9$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const10$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const11$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CARDIN"));
        $str13$__QuantityVariableFn = SubLObjectFactory.makeString("#$QuantityVariableFn");
        $const14$is_Underspecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("is-Underspecified"));
        $str15$CardinalityOfFn__QP__1 = SubLObjectFactory.makeString("CardinalityOfFn (QP) 1");
        $str16$CardinalityOfFn_2 = SubLObjectFactory.makeString("CardinalityOfFn 2");
        $const17$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const18$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str19$VariableFn_specs = SubLObjectFactory.makeString("VariableFn specs");
        $str20$VariableFn_instances = SubLObjectFactory.makeString("VariableFn instances");
    }
}

/*

	Total time: 52 ms
	
*/