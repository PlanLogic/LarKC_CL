// 
// 

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;

import org.jpl7.Term;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync.IPrologifiable;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertions_low extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.assertions_low";
    public static final String myFingerPrint = "9610a4129c9be7b648aa4fdfcfdef33cb47007a418cf48afc3f5a671521c6abe";
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLSymbol $dtp_assertion_content$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1856L)
    private static SubLSymbol $default_assertion_flags$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18523L)
    private static SubLSymbol $assertion_flags_gaf_byte$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18806L)
    private static SubLSymbol $assertion_flags_direction_byte$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 19105L)
    private static SubLSymbol $assertion_flags_tv_byte$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 20248L)
    private static SubLSymbol $rule_set$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 20442L)
    private static SubLSymbol $prefer_rule_set_over_flagsP$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 20739L)
    private static SubLSymbol $estimated_assertions_per_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 29169L)
    private static SubLSymbol $non_true_assertion_tv_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 29485L)
    private static SubLSymbol $prefer_non_true_set_over_flagsP$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 29837L)
    private static SubLSymbol $estimated_assertions_per_non_true$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 52982L)
    private static SubLSymbol $dependent_deduction_table$;
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 53067L)
    private static SubLSymbol $dependent_assertion_table$;
    private static final SubLSymbol $sym0$ASSERTION_CONTENT;
    private static final SubLSymbol $sym1$ASSERTION_CONTENT_P;
    private static final SubLInteger $int2$148;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$AS_CONTENT_FORMULA_DATA;
    private static final SubLSymbol $sym11$_CSETF_AS_CONTENT_FORMULA_DATA;
    private static final SubLSymbol $sym12$AS_CONTENT_MT;
    private static final SubLSymbol $sym13$_CSETF_AS_CONTENT_MT;
    private static final SubLSymbol $sym14$AS_CONTENT_FLAGS;
    private static final SubLSymbol $sym15$_CSETF_AS_CONTENT_FLAGS;
    private static final SubLSymbol $sym16$AS_CONTENT_ARGUMENTS;
    private static final SubLSymbol $sym17$_CSETF_AS_CONTENT_ARGUMENTS;
    private static final SubLSymbol $sym18$AS_CONTENT_PLIST;
    private static final SubLSymbol $sym19$_CSETF_AS_CONTENT_PLIST;
    private static final SubLSymbol $kw20$FORMULA_DATA;
    private static final SubLSymbol $kw21$MT;
    private static final SubLSymbol $kw22$FLAGS;
    private static final SubLSymbol $kw23$ARGUMENTS;
    private static final SubLSymbol $kw24$PLIST;
    private static final SubLString $str25$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw26$BEGIN;
    private static final SubLSymbol $sym27$MAKE_ASSERTION_CONTENT;
    private static final SubLSymbol $kw28$SLOT;
    private static final SubLSymbol $kw29$END;
    private static final SubLSymbol $sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD;
    private static final SubLSymbol $kw31$DEPENDENTS;
    private static final SubLSymbol $kw32$INDEX;
    private static final SubLSymbol $kw33$TRUE;
    private static final SubLSymbol $sym34$ASSERTION_P;
    private static final SubLString $str35$_a__assertion___a__has_null_flags;
    private static final SubLSymbol $kw36$VARIABLE_NAMES;
    private static final SubLInteger $int37$256;
    private static final SubLString $str38$Unexpected_formula_data_type___S;
    private static final SubLSymbol $sym39$_RULE_SET_;
    private static final SubLSymbol $sym40$_PREFER_RULE_SET_OVER_FLAGS__;
    private static final SubLInteger $int41$60;
    private static final SubLSymbol $sym42$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str43$mapping_Cyc_assertions;
    private static final SubLSymbol $sym44$STRINGP;
    private static final SubLSymbol $kw45$SKIP;
    private static final SubLSymbol $sym46$CNF_P;
    private static final SubLSymbol $sym47$KEYHASH_P;
    private static final SubLString $str48$Rebuilding_the_Rule_Set;
    private static final SubLSymbol $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym52$CSETQ;
    private static final SubLString $str53$_A;
    private static final SubLSymbol $sym54$_NON_TRUE_ASSERTION_TV_CACHE_;
    private static final SubLSymbol $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__;
    private static final SubLInteger $int56$1983;
    private static final SubLList $list57;
    private static final SubLString $str58$Rebuilding_the_non_true_assertion;
    private static final SubLSymbol $sym59$LISTP;
    private static final SubLSymbol $sym60$NON_DOTTED_LIST_P;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym63$_OPTIONAL;
    private static final SubLSymbol $kw64$ASSERT_INFO;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$VALID_ARGUMENT;
    private static final SubLSymbol $kw67$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym68$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw69$FORWARD;
    private static final SubLString $str70$Unexpected_formula_data_hook___S;
    private static final SubLSymbol $sym71$SET_CONTENTS_P;
    private static final SubLSymbol $sym72$ARGUMENT_P;
    private static final SubLSymbol $sym73$DEDUCTION_P;
    private static final SubLSymbol $sym74$TRUE;
    private static final SubLSymbol $sym75$RULE_ASSERTION_;
    private static final SubLSymbol $sym76$GAF_ASSERTION_;
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject assertion_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)assertions_low.ZERO_INTEGER);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject assertion_content_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $assertion_content_native.class) ? assertions_low.T : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject as_content_formula_data(final SubLObject v_object) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject as_content_mt(final SubLObject v_object) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject as_content_flags(final SubLObject v_object) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject as_content_arguments(final SubLObject v_object) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject as_content_plist(final SubLObject v_object) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject _csetf_as_content_formula_data(final SubLObject v_object, final SubLObject value) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject _csetf_as_content_mt(final SubLObject v_object, final SubLObject value) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject _csetf_as_content_flags(final SubLObject v_object, final SubLObject value) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject _csetf_as_content_arguments(final SubLObject v_object, final SubLObject value) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject _csetf_as_content_plist(final SubLObject v_object, final SubLObject value) {
        assert assertions_low.NIL != assertion_content_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject make_assertion_content(SubLObject arglist) {
        if (arglist == assertions_low.UNPROVIDED) {
            arglist = (SubLObject)assertions_low.NIL;
        }
        final SubLObject v_new = (SubLObject)new $assertion_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)assertions_low.NIL, next = arglist; assertions_low.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)assertions_low.$kw20$FORMULA_DATA)) {
                _csetf_as_content_formula_data(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)assertions_low.$kw21$MT)) {
                _csetf_as_content_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)assertions_low.$kw22$FLAGS)) {
                _csetf_as_content_flags(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)assertions_low.$kw23$ARGUMENTS)) {
                _csetf_as_content_arguments(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)assertions_low.$kw24$PLIST)) {
                _csetf_as_content_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)assertions_low.$str25$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject visit_defstruct_assertion_content(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw26$BEGIN, (SubLObject)assertions_low.$sym27$MAKE_ASSERTION_CONTENT, (SubLObject)assertions_low.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw28$SLOT, (SubLObject)assertions_low.$kw20$FORMULA_DATA, as_content_formula_data(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw28$SLOT, (SubLObject)assertions_low.$kw21$MT, as_content_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw28$SLOT, (SubLObject)assertions_low.$kw22$FLAGS, as_content_flags(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw28$SLOT, (SubLObject)assertions_low.$kw23$ARGUMENTS, as_content_arguments(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw28$SLOT, (SubLObject)assertions_low.$kw24$PLIST, as_content_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)assertions_low.$kw29$END, (SubLObject)assertions_low.$sym27$MAKE_ASSERTION_CONTENT, (SubLObject)assertions_low.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1508L)
    public static SubLObject visit_defstruct_object_assertion_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_assertion_content(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 1923L)
    public static SubLObject create_assertion_content(final SubLObject mt) {
        SubLObject assertion_content = (SubLObject)assertions_low.NIL;
        assertion_content = make_assertion_content((SubLObject)assertions_low.UNPROVIDED);
        _csetf_as_content_formula_data(assertion_content, (SubLObject)assertions_low.NIL);
        _csetf_as_content_mt(assertion_content, mt);
        _csetf_as_content_flags(assertion_content, assertions_low.$default_assertion_flags$.getGlobalValue());
        _csetf_as_content_arguments(assertion_content, (SubLObject)assertions_low.NIL);
        _csetf_as_content_plist(assertion_content, (SubLObject)assertions_low.NIL);
        return assertion_content;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 2454L)
    public static SubLObject destroy_assertion_content(final SubLObject id) {
        final SubLObject assertion_content = assertion_manager.lookup_assertion_content(id);
        if (assertions_low.NIL != assertion_content_p(assertion_content)) {
            assertion_manager.deregister_assertion_content(id);
            _csetf_as_content_formula_data(assertion_content, (SubLObject)assertions_low.NIL);
            _csetf_as_content_mt(assertion_content, (SubLObject)assertions_low.NIL);
            _csetf_as_content_flags(assertion_content, (SubLObject)assertions_low.NIL);
            _csetf_as_content_arguments(assertion_content, (SubLObject)assertions_low.NIL);
            _csetf_as_content_plist(assertion_content, (SubLObject)assertions_low.NIL);
            return (SubLObject)assertions_low.T;
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 2995L)
    public static SubLObject lookup_assertion_formula_data(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return (SubLObject)((assertions_low.NIL != contents) ? as_content_formula_data(contents) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 3176L)
    public static SubLObject lookup_assertion_mt(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return (SubLObject)((assertions_low.NIL != contents) ? as_content_mt(contents) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 3323L)
    public static SubLObject lookup_assertion_flags(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return (SubLObject)((assertions_low.NIL != contents) ? as_content_flags(contents) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 3476L)
    public static SubLObject lookup_assertion_arguments(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return (SubLObject)((assertions_low.NIL != contents) ? as_content_arguments(contents) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 3637L)
    public static SubLObject lookup_assertion_plist(final SubLObject id) {
        final SubLObject contents = assertion_manager.lookup_assertion_content(id);
        return (SubLObject)((assertions_low.NIL != contents) ? as_content_plist(contents) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 3790L)
    public static SubLObject set_assertion_formula_data(final SubLObject id, final SubLObject new_formula_data) {
        _csetf_as_content_formula_data(assertion_manager.lookup_assertion_content(id), new_formula_data);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 4002L)
    public static SubLObject set_assertion_flags(final SubLObject id, final SubLObject new_flags) {
        _csetf_as_content_flags(assertion_manager.lookup_assertion_content(id), new_flags);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 4174L)
    public static SubLObject set_assertion_arguments(final SubLObject id, final SubLObject new_arguments) {
        _csetf_as_content_arguments(assertion_manager.lookup_assertion_content(id), new_arguments);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 4362L)
    public static SubLObject set_assertion_plist(final SubLObject id, final SubLObject new_plist) {
        _csetf_as_content_plist(assertion_manager.lookup_assertion_content(id), new_plist);
        assertion_manager.mark_assertion_content_as_muted(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 4534L)
    public static SubLObject dump_assertion_content(final SubLObject assertion, final SubLObject stream) {
        cfasl.cfasl_output(assertion_formula_data(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_mt(assertion), stream);
        cfasl.cfasl_output(assertion_flags(assertion), stream);
        cfasl.cfasl_output(assertions_high.assertion_arguments(assertion), stream);
        cfasl.cfasl_output(assertion_plist_for_dumping(assertion), stream);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 5070L)
    public static SubLObject assertion_plist_for_dumping(final SubLObject assertion) {
        SubLObject result_plist = (SubLObject)assertions_low.NIL;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = (SubLObject)assertions_low.NIL, remainder = assertion_plist(assertion); assertions_low.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (property == assertions_low.$kw31$DEPENDENTS) {
                result_plist = conses_high.putf(result_plist, property, set_contents.set_contents_element_list(value));
            }
            else if (property != assertions_low.$kw32$INDEX) {
                result_plist = conses_high.putf(result_plist, property, value);
            }
        }
        return result_plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 5616L)
    public static SubLObject load_assertion_content(final SubLObject assertion, final SubLObject stream) {
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject formula_data = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        final SubLObject mt = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        final SubLObject flags = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        final SubLObject v_arguments = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        final SubLObject plist = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        load_assertion_content_int(id, formula_data, mt, flags, v_arguments, plist);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 6140L)
    public static SubLObject load_assertion_content_int(final SubLObject id, final SubLObject formula_data, final SubLObject mt, final SubLObject flags, final SubLObject v_arguments, final SubLObject plist) {
        final SubLObject assertion_content = create_assertion_content(mt);
        _csetf_as_content_formula_data(assertion_content, formula_data);
        _csetf_as_content_flags(assertion_content, flags);
        _csetf_as_content_arguments(assertion_content, v_arguments);
        _csetf_as_content_plist(assertion_content, plist);
        assertion_manager.register_assertion_content(id, assertion_content);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 6613L)
    public static SubLObject assertion_cnf_internal(final SubLObject assertion) {
        final SubLObject hl_cnf = assertion_hl_cnf(assertion);
        if (assertions_low.NIL != clause_strucs.clause_struc_p(hl_cnf)) {
            return clause_strucs.clause_struc_cnf(hl_cnf);
        }
        return hl_cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 7055L)
    public static SubLObject possibly_assertion_cnf_internal(final SubLObject assertion) {
        return (SubLObject)((assertions_low.NIL != valid_assertion_with_contentP(assertion)) ? assertion_cnf_internal(assertion) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 7348L)
    public static SubLObject assertion_mt_internal(final SubLObject assertion) {
        return lookup_assertion_mt(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 7581L)
    public static SubLObject assertion_gaf_hl_formula_internal(final SubLObject assertion) {
        if (assertions_low.NIL == assertion_gaf_p(assertion)) {
            return (SubLObject)assertions_low.NIL;
        }
        final SubLObject formula_data = assertion_formula_data(assertion);
        if (assertions_low.NIL != clause_strucs.clause_struc_p(formula_data)) {
            return cnf_to_gaf_formula(clause_strucs.clause_struc_cnf(formula_data));
        }
        return formula_data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 8032L)
    public static SubLObject assertion_cons_internal(final SubLObject assertion) {
        return (assertions_low.NIL != assertion_gaf_p(assertion)) ? assertions_high.assertion_gaf_hl_formula(assertion) : assertion_cnf_internal(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 8338L)
    public static SubLObject assertion_direction_internal(final SubLObject assertion) {
        return enumeration_types.decode_direction(assertion_flags_direction_code(assertion_flags(assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 8624L)
    public static SubLObject assertion_truth_internal(final SubLObject assertion) {
        if (assertions_low.NIL == use_non_true_assertion_tv_cacheP()) {
            return enumeration_types.tv_truth(assertion_tv_internal(assertion));
        }
        final SubLObject possible_non_true_tv = assertion_non_true_tv(assertion);
        if (assertions_low.NIL != possible_non_true_tv) {
            return enumeration_types.tv_truth(possible_non_true_tv);
        }
        return (SubLObject)assertions_low.$kw33$TRUE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 9067L)
    public static SubLObject assertion_strength_internal(final SubLObject assertion) {
        return enumeration_types.tv_strength(assertion_tv(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 9304L)
    public static SubLObject assertion_tv(final SubLObject assertion) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertions_low.NIL != use_non_true_assertion_tv_cacheP()) {
            final SubLObject possible_non_true_tv = assertion_non_true_tv(assertion);
            if (assertions_low.NIL != possible_non_true_tv) {
                return possible_non_true_tv;
            }
        }
        return assertion_tv_internal(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 9756L)
    public static SubLObject assertion_tv_internal(final SubLObject assertion) {
        final SubLObject flags = assertion_flags(assertion);
        if (assertions_low.NIL == flags) {
            Errors.error((SubLObject)assertions_low.$str35$_a__assertion___a__has_null_flags, assertion, assertion_handles.assertion_id(assertion));
        }
        return enumeration_types.decode_tv(assertion_flags_tv_code(flags));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 10017L)
    public static SubLObject assertion_variable_names_internal(final SubLObject assertion) {
        return get_assertion_prop(assertion, (SubLObject)assertions_low.$kw36$VARIABLE_NAMES, (SubLObject)assertions_low.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 10335L)
    public static SubLObject asserted_by_internal(final SubLObject assertion) {
        return (SubLObject)((assertions_low.NIL != assertions_high.asserted_assertionP(assertion)) ? assert_info_who(assertion_assert_info(assertion)) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 10613L)
    public static SubLObject asserted_when_internal(final SubLObject assertion) {
        return (SubLObject)((assertions_low.NIL != assertions_high.asserted_assertionP(assertion)) ? assert_info_when(assertion_assert_info(assertion)) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 10896L)
    public static SubLObject asserted_why_internal(final SubLObject assertion) {
        return (SubLObject)((assertions_low.NIL != assertions_high.asserted_assertionP(assertion)) ? assert_info_why(assertion_assert_info(assertion)) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 11176L)
    public static SubLObject asserted_second_internal(final SubLObject assertion) {
        return (SubLObject)((assertions_low.NIL != assertions_high.asserted_assertionP(assertion)) ? assert_info_second(assertion_assert_info(assertion)) : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 11465L)
    public static SubLObject assertion_arguments_internal(final SubLObject assertion) {
        return lookup_assertion_arguments(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 11719L)
    public static SubLObject assertion_dependents_internal(final SubLObject assertion) {
        SubLObject dependents = get_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS, (SubLObject)assertions_low.UNPROVIDED);
        if (dependents.isList() && assertions_low.NIL != list_utilities.lengthG(dependents, (SubLObject)assertions_low.$int37$256, (SubLObject)assertions_low.UNPROVIDED)) {
            dependents = keyhash_utilities.keyhash_list_elements(set_contents.set_contents_element_list(dependents), (SubLObject)assertions_low.EQL, (SubLObject)assertions_low.UNPROVIDED);
            set_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS, dependents);
        }
        return dependents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 12382L)
    public static SubLObject assertion_dependent_count_internal(final SubLObject assertion) {
        return set_contents.set_contents_size(get_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS, (SubLObject)assertions_low.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 12587L)
    public static SubLObject assertion_has_dependents_p_internal(final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL == set_contents.set_contents_emptyP(get_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS, (SubLObject)assertions_low.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 12781L)
    public static SubLObject assertion_formula_data(final SubLObject assertion) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return lookup_assertion_formula_data(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 13295L)
    public static SubLObject reset_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        set_assertion_formula_data(assertion_handles.assertion_id(assertion), new_formula_data);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 13813L)
    public static SubLObject assertion_hl_cnf(final SubLObject assertion) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject formula_data = assertion_formula_data(assertion);
        if (assertions_low.NIL != clause_strucs.clause_struc_p(formula_data)) {
            return formula_data;
        }
        if (assertions_low.NIL == formula_data) {
            return formula_data;
        }
        if (assertions_low.NIL == assertion_gaf_p(assertion)) {
            return formula_data;
        }
        return gaf_formula_to_cnf(formula_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 14512L)
    public static SubLObject update_assertion_formula_data(final SubLObject assertion, final SubLObject new_formula_data) {
        if (assertions_low.NIL != clause_strucs.clause_struc_p(new_formula_data)) {
            reset_assertion_clause_struc(assertion, new_formula_data);
        }
        else if (assertions_low.NIL == new_formula_data) {
            annihilate_assertion_formula_data(assertion);
        }
        else if (assertions_low.NIL != clauses.cnf_p(new_formula_data)) {
            reset_assertion_cnf(assertion, new_formula_data);
        }
        else {
            if (assertions_low.NIL == el_utilities.el_formula_p(new_formula_data)) {
                Errors.error((SubLObject)assertions_low.$str38$Unexpected_formula_data_type___S, new_formula_data);
                return (SubLObject)assertions_low.NIL;
            }
            reset_assertion_gaf_formula(assertion, new_formula_data);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 15451L)
    public static SubLObject assertion_clause_struc(final SubLObject assertion) {
        final SubLObject formula_data = assertion_formula_data(assertion);
        return (SubLObject)((assertions_low.NIL != clause_strucs.clause_struc_p(formula_data)) ? formula_data : assertions_low.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 15856L)
    public static SubLObject reset_assertion_cnf(final SubLObject assertion, final SubLObject new_cnf) {
        final SubLObject gafP = determine_cnf_gaf_p(new_cnf);
        reset_assertion_formula_data(assertion, (assertions_low.NIL != gafP) ? cnf_to_gaf_formula(new_cnf) : new_cnf);
        set_assertion_gaf_p(assertion, gafP);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 16321L)
    public static SubLObject reset_assertion_clause_struc(final SubLObject assertion, final SubLObject new_clause_struc) {
        final SubLObject new_hl_cnf = clause_strucs.clause_struc_cnf(new_clause_struc);
        reset_assertion_formula_data(assertion, new_clause_struc);
        if (assertions_low.NIL == new_hl_cnf) {
            return annihilate_assertion_formula_data(assertion);
        }
        recompute_assertion_gaf_p(assertion);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 16833L)
    public static SubLObject reset_assertion_gaf_formula(final SubLObject assertion, final SubLObject new_gaf_formula) {
        reset_assertion_formula_data(assertion, new_gaf_formula);
        set_assertion_gaf_p(assertion, (SubLObject)assertions_low.T);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 17192L)
    public static SubLObject annihilate_assertion_formula_data(final SubLObject assertion) {
        reset_assertion_formula_data(assertion, (SubLObject)assertions_low.NIL);
        set_assertion_gaf_p(assertion, (SubLObject)assertions_low.T);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 17476L)
    public static SubLObject assertion_flags(final SubLObject assertion) {
        final SubLObject flags = lookup_assertion_flags(assertion_handles.assertion_id(assertion));
        return flags;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18134L)
    public static SubLObject reset_assertion_flags(final SubLObject assertion, final SubLObject new_flags) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject flags = assertion_flags(assertion);
        if (!flags.eql(new_flags)) {
            set_assertion_flags(assertion_handles.assertion_id(assertion), new_flags);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18598L)
    public static SubLObject assertion_flags_gaf_code(final SubLObject flags) {
        return bytes.ldb(assertions_low.$assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18695L)
    public static SubLObject set_assertion_flags_gaf_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, assertions_low.$assertion_flags_gaf_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18873L)
    public static SubLObject assertion_flags_direction_code(final SubLObject flags) {
        return bytes.ldb(assertions_low.$assertion_flags_direction_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 18982L)
    public static SubLObject set_assertion_flags_direction_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, assertions_low.$assertion_flags_direction_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 19165L)
    public static SubLObject assertion_flags_tv_code(final SubLObject flags) {
        return bytes.ldb(assertions_low.$assertion_flags_tv_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 19260L)
    public static SubLObject set_assertion_flags_tv_code(final SubLObject flags, final SubLObject code) {
        return bytes.dpb(code, assertions_low.$assertion_flags_tv_byte$.getGlobalValue(), flags);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 19369L)
    public static SubLObject assertion_flags_gaf_p(final SubLObject assertion) {
        return Numbers.oddp(assertion_flags(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 19927L)
    public static SubLObject set_assertion_flags_gaf_p(final SubLObject assertion, final SubLObject gafP) {
        final SubLObject gaf_code = number_utilities.encode_boolean(gafP);
        if (assertions_low.NIL != gaf_code) {
            reset_assertion_flags(assertion, set_assertion_flags_gaf_code(assertion_flags(assertion), gaf_code));
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 20614L)
    public static SubLObject use_rule_setP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL != assertions_low.$prefer_rule_set_over_flagsP$.getGlobalValue() && assertions_low.NIL != assertions_low.$rule_set$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 20821L)
    public static SubLObject setup_rule_set(final SubLObject estimated_assertion_size) {
        assert assertions_low.NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) : estimated_assertion_size;
        final SubLObject estimated_rule_count = Numbers.ceiling(Numbers.divide(estimated_assertion_size, assertions_low.$estimated_assertions_per_rule$.getGlobalValue()), (SubLObject)assertions_low.UNPROVIDED);
        assertions_low.$rule_set$.setGlobalValue(keyhash.new_keyhash(estimated_rule_count, Symbols.symbol_function((SubLObject)assertions_low.EQL)));
        return (SubLObject)assertions_low.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 21422L)
    public static SubLObject kb_rule_set() {
        return assertions_low.$rule_set$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 21513L)
    public static SubLObject assertion_gaf_p(final SubLObject assertion) {
        if (assertions_low.NIL != use_rule_setP() && assertions_low.NIL != assertion_manager.assertion_content_cachable_p(assertion)) {
            if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
                return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL == Hashtables.gethash_without_values(assertion, assertions_low.$rule_set$.getGlobalValue(), (SubLObject)assertions_low.NIL));
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL == keyhash.getkeyhash(assertion, assertions_low.$rule_set$.getGlobalValue()));
        }
        else {
            if (assertions_low.NIL != assertion_handles.assertion_has_contentP(assertion)) {
                return assertion_flags_gaf_p(assertion);
            }
            return (SubLObject)assertions_low.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 22080L)
    public static SubLObject assertion_rule_p(final SubLObject assertion) {
        if (assertions_low.NIL != use_rule_setP() && assertions_low.NIL != assertion_manager.assertion_content_cachable_p(assertion)) {
            if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
                return Hashtables.gethash_without_values(assertion, assertions_low.$rule_set$.getGlobalValue(), (SubLObject)assertions_low.NIL);
            }
            return keyhash.getkeyhash(assertion, assertions_low.$rule_set$.getGlobalValue());
        }
        else {
            if (assertions_low.NIL != assertion_handles.assertion_has_contentP(assertion)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL == assertion_flags_gaf_p(assertion));
            }
            return (SubLObject)assertions_low.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 22628L)
    public static SubLObject rule_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertions_low.NIL != keyhash.keyhash_p(assertions_low.$rule_set$.getGlobalValue())) {
            return keyhash.keyhash_count(assertions_low.$rule_set$.getGlobalValue());
        }
        if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
            return Hashtables.hash_table_count(assertions_low.$rule_set$.getGlobalValue());
        }
        SubLObject count = (SubLObject)assertions_low.ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertions_low.$str43$mapping_Cyc_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertions_low.ZERO_INTEGER;
        assert assertions_low.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertions_low.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertions_low.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertions_low.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$1 = idx;
                if (assertions_low.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)assertions_low.$kw45$SKIP)) {
                    final SubLObject idx_$2 = idx_$1;
                    if (assertions_low.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                        final SubLObject backwardP_var = (SubLObject)assertions_low.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertions_low.NIL, v_iteration = (SubLObject)assertions_low.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertions_low.ONE_INTEGER)) {
                            a_id = ((assertions_low.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertions_low.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertions_low.NIL == id_index.id_index_tombstone_p(a_handle) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                                if (assertions_low.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertions_low.$kw45$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertions_low.NIL != assertion_rule_p(ass)) {
                                    count = Numbers.add(count, (SubLObject)assertions_low.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$3 = idx_$1;
                    if (assertions_low.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$3);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$3);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$3);
                        final SubLObject v_default = (SubLObject)((assertions_low.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) ? assertions_low.NIL : assertions_low.$kw45$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP) || assertions_low.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertions_low.NIL != assertion_rule_p(ass2)) {
                                    count = Numbers.add(count, (SubLObject)assertions_low.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertions_low.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 23042L)
    public static SubLObject gaf_count() {
        return Numbers.subtract(assertion_handles.assertion_count(), rule_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 23249L)
    public static SubLObject set_assertion_gaf_p(final SubLObject assertion, final SubLObject gafP) {
        if (assertions_low.NIL != keyhash.keyhash_p(assertions_low.$rule_set$.getGlobalValue())) {
            if (assertions_low.NIL != gafP) {
                keyhash.remkeyhash(assertion, assertions_low.$rule_set$.getGlobalValue());
            }
            else {
                keyhash.setkeyhash(assertion, assertions_low.$rule_set$.getGlobalValue());
            }
        }
        else if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
            if (assertions_low.NIL != gafP) {
                Hashtables.remhash(assertion, assertions_low.$rule_set$.getGlobalValue());
            }
            else {
                Hashtables.sethash(assertion, assertions_low.$rule_set$.getGlobalValue(), (SubLObject)assertions_low.T);
            }
        }
        return set_assertion_flags_gaf_p(assertion, gafP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 23831L)
    public static SubLObject possibly_rule_set_delete(final SubLObject assertion) {
        if (assertions_low.NIL != keyhash.keyhash_p(assertions_low.$rule_set$.getGlobalValue())) {
            if (assertions_low.NIL != assertion_rule_p(assertion)) {
                return keyhash.remkeyhash(assertion, assertions_low.$rule_set$.getGlobalValue());
            }
        }
        else if (assertions_low.$rule_set$.getGlobalValue().isHashtable() && assertions_low.NIL != assertion_rule_p(assertion)) {
            return Hashtables.remhash(assertion, assertions_low.$rule_set$.getGlobalValue());
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 24126L)
    public static SubLObject recompute_assertion_gaf_p(final SubLObject assertion) {
        final SubLObject formula_data = assertion_formula_data(assertion);
        SubLObject gafP = (SubLObject)assertions_low.NIL;
        if (assertions_low.NIL != clause_strucs.clause_struc_p(formula_data)) {
            gafP = determine_cnf_gaf_p(clause_strucs.clause_struc_cnf(formula_data));
        }
        else if (assertions_low.NIL != clauses.cnf_p(formula_data)) {
            gafP = determine_cnf_gaf_p(formula_data);
        }
        else {
            gafP = (SubLObject)assertions_low.T;
        }
        return set_assertion_gaf_p(assertion, gafP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 24837L)
    public static SubLObject determine_cnf_gaf_p(final SubLObject cnf) {
        assert assertions_low.NIL != clauses.cnf_p(cnf) : cnf;
        return clauses.gaf_cnfP(cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 25036L)
    public static SubLObject dump_rule_set_to_stream(final SubLObject stream) {
        SubLObject rule_set = assertions_low.$rule_set$.getGlobalValue();
        if (rule_set.isHashtable()) {
            rule_set = keyhash_utilities.hashtable_to_keyhash(rule_set);
        }
        assert assertions_low.NIL != keyhash.keyhash_p(rule_set) : rule_set;
        return cfasl.cfasl_output(rule_set, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 25483L)
    public static SubLObject load_rule_set_from_stream(final SubLObject stream) {
        final SubLObject rule_set = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        assert assertions_low.NIL != keyhash.keyhash_p(rule_set) : rule_set;
        assertions_low.$rule_set$.setGlobalValue(rule_set);
        return rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 25947L)
    public static SubLObject rebuild_rule_set() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        setup_rule_set(assertion_handles.assertion_count());
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertions_low.$str48$Rebuilding_the_Rule_Set;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertions_low.ZERO_INTEGER;
        assert assertions_low.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertions_low.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertions_low.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertions_low.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$5 = idx;
                if (assertions_low.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)assertions_low.$kw45$SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (assertions_low.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = (SubLObject)assertions_low.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject rule;
                        SubLObject message_var;
                        SubLObject was_appendingP;
                        SubLObject _prev_bind_0_$7;
                        SubLObject _prev_bind_0_$8;
                        SubLObject _values;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertions_low.NIL, v_iteration = (SubLObject)assertions_low.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertions_low.ONE_INTEGER)) {
                            a_id = ((assertions_low.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertions_low.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertions_low.NIL == id_index.id_index_tombstone_p(a_handle) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                                if (assertions_low.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertions_low.$kw45$SKIP;
                                }
                                rule = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                message_var = (SubLObject)assertions_low.NIL;
                                was_appendingP = Eval.eval((SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                Eval.eval((SubLObject)assertions_low.$list50);
                                try {
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)assertions_low.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                if (assertions_low.NIL != assertion_handles.assertion_handle_validP(rule) && assertions_low.NIL == assertion_flags_gaf_p(rule)) {
                                                    if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
                                                        Hashtables.sethash(rule, assertions_low.$rule_set$.getGlobalValue(), (SubLObject)assertions_low.T);
                                                    }
                                                    else {
                                                        keyhash.setkeyhash(rule, assertions_low.$rule_set$.getGlobalValue());
                                                    }
                                                }
                                            }
                                            catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, (SubLObject)assertions_low.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var) {
                                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                finally {
                                    _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                                        _values = Values.getValuesAsVector();
                                        Eval.eval((SubLObject)ConsesLow.list((SubLObject)assertions_low.$sym52$CSETQ, (SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                                if (message_var.isString()) {
                                    Errors.warn((SubLObject)assertions_low.$str53$_A, message_var);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if (assertions_low.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                        final SubLObject v_default = (SubLObject)((assertions_low.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) ? assertions_low.NIL : assertions_low.$kw45$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP) || assertions_low.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject rule2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                SubLObject message_var2 = (SubLObject)assertions_low.NIL;
                                final SubLObject was_appendingP2 = Eval.eval((SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                Eval.eval((SubLObject)assertions_low.$list50);
                                try {
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)assertions_low.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                if (assertions_low.NIL != assertion_handles.assertion_handle_validP(rule2) && assertions_low.NIL == assertion_flags_gaf_p(rule2)) {
                                                    if (assertions_low.$rule_set$.getGlobalValue().isHashtable()) {
                                                        Hashtables.sethash(rule2, assertions_low.$rule_set$.getGlobalValue(), (SubLObject)assertions_low.T);
                                                    }
                                                    else {
                                                        keyhash.setkeyhash(rule2, assertions_low.$rule_set$.getGlobalValue());
                                                    }
                                                }
                                            }
                                            catch (Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, (SubLObject)assertions_low.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var2) {
                                        message_var2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        Eval.eval((SubLObject)ConsesLow.list((SubLObject)assertions_low.$sym52$CSETQ, (SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2));
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                if (message_var2.isString()) {
                                    Errors.warn((SubLObject)assertions_low.$str53$_A, message_var2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertions_low.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 26432L)
    public static SubLObject gaf_formula_to_cnf(final SubLObject gaf) {
        return clause_utilities.make_gaf_cnf(gaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 26666L)
    public static SubLObject cnf_to_gaf_formula(final SubLObject cnf) {
        return clause_utilities.gaf_cnf_literal(cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 26975L)
    public static SubLObject kb_set_assertion_direction_internal(final SubLObject assertion, final SubLObject new_direction) {
        if (assertions_low.NIL != assertions_high.gaf_assertionP(assertion)) {
            reset_assertion_direction(assertion, new_direction);
        }
        else {
            kb_indexing.remove_assertion_indices(assertion, (SubLObject)assertions_low.UNPROVIDED);
            reset_assertion_direction(assertion, new_direction);
            kb_indexing.add_assertion_indices(assertion, (SubLObject)assertions_low.UNPROVIDED);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 27491L)
    public static SubLObject reset_assertion_direction(final SubLObject assertion, final SubLObject new_direction) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject direction_code = enumeration_types.encode_direction(new_direction);
        if (assertions_low.NIL != direction_code) {
            reset_assertion_flags(assertion, set_assertion_flags_direction_code(assertion_flags(assertion), direction_code));
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 27896L)
    public static SubLObject reset_assertion_tv(final SubLObject assertion, final SubLObject new_tv) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject tv_code = enumeration_types.encode_tv(new_tv);
        if (assertions_low.NIL != tv_code) {
            reset_assertion_flags(assertion, set_assertion_flags_tv_code(assertion_flags(assertion), tv_code));
        }
        set_assertion_non_true_cache_tv(assertion, new_tv);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 28442L)
    public static SubLObject reset_assertion_truth(final SubLObject assertion, final SubLObject new_truth) {
        final SubLObject existing_strength = assertions_high.assertion_strength(assertion);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(new_truth, existing_strength);
        return reset_assertion_tv(assertion, new_tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 28804L)
    public static SubLObject reset_assertion_strength(final SubLObject assertion, final SubLObject new_strength) {
        final SubLObject existing_truth = assertions_high.assertion_truth(assertion);
        final SubLObject new_tv = enumeration_types.tv_from_truth_strength(existing_truth, new_strength);
        return reset_assertion_tv(assertion, new_tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 29670L)
    public static SubLObject use_non_true_assertion_tv_cacheP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL != assertions_low.$prefer_non_true_set_over_flagsP$.getGlobalValue() && assertions_low.NIL != assertions_low.$non_true_assertion_tv_cache$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 29925L)
    public static SubLObject setup_non_true_assertion_tv_cache(final SubLObject estimated_assertion_size) {
        assert assertions_low.NIL != subl_promotions.non_negative_integer_p(estimated_assertion_size) : estimated_assertion_size;
        final SubLObject estimated_non_true_count = Numbers.ceiling(Numbers.divide(estimated_assertion_size, assertions_low.$estimated_assertions_per_non_true$.getGlobalValue()), (SubLObject)assertions_low.UNPROVIDED);
        assertions_low.$non_true_assertion_tv_cache$.setGlobalValue(Hashtables.make_hash_table(estimated_non_true_count, Symbols.symbol_function((SubLObject)assertions_low.EQL), (SubLObject)assertions_low.$list57));
        return (SubLObject)assertions_low.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 30468L)
    public static SubLObject kb_non_true_assertion_tv_cache() {
        return assertions_low.$non_true_assertion_tv_cache$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 30572L)
    public static SubLObject assertion_true_p(final SubLObject assertion) {
        if (assertions_low.NIL != use_non_true_assertion_tv_cacheP() && assertions_low.NIL != assertion_manager.assertion_content_cachable_p(assertion)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL == Hashtables.gethash_without_values(assertion, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), (SubLObject)assertions_low.UNPROVIDED));
        }
        if (assertions_low.NIL != assertion_handles.assertion_has_contentP(assertion)) {
            return Equality.eq((SubLObject)assertions_low.$kw33$TRUE, enumeration_types.tv_truth(assertion_tv_internal(assertion)));
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 31102L)
    public static SubLObject assertion_non_true_tv(final SubLObject assertion) {
        if (assertions_low.NIL != use_non_true_assertion_tv_cacheP() && assertions_low.NIL != assertion_manager.assertion_content_cachable_p(assertion)) {
            return Hashtables.gethash(assertion, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), (SubLObject)assertions_low.UNPROVIDED);
        }
        if (assertions_low.NIL != assertion_handles.assertion_has_contentP(assertion)) {
            final SubLObject tv = assertion_tv_internal(assertion);
            return (SubLObject)((assertions_low.$kw33$TRUE == enumeration_types.tv_truth(tv)) ? assertions_low.NIL : tv);
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 31646L)
    public static SubLObject non_true_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertions_low.$non_true_assertion_tv_cache$.getGlobalValue().isHashtable()) {
            return Hashtables.hash_table_count(assertions_low.$non_true_assertion_tv_cache$.getGlobalValue());
        }
        SubLObject count = (SubLObject)assertions_low.ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)assertions_low.$str43$mapping_Cyc_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)assertions_low.ZERO_INTEGER;
        assert assertions_low.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertions_low.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertions_low.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertions_low.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$13 = idx;
                if (assertions_low.NIL == id_index.id_index_objects_empty_p(idx_$13, (SubLObject)assertions_low.$kw45$SKIP)) {
                    final SubLObject idx_$14 = idx_$13;
                    if (assertions_low.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                        final SubLObject backwardP_var = (SubLObject)assertions_low.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertions_low.NIL, v_iteration = (SubLObject)assertions_low.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertions_low.ONE_INTEGER)) {
                            a_id = ((assertions_low.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertions_low.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (assertions_low.NIL == id_index.id_index_tombstone_p(a_handle) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                                if (assertions_low.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)assertions_low.$kw45$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (assertions_low.NIL != assertion_non_true_tv(ass)) {
                                    count = Numbers.add(count, (SubLObject)assertions_low.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$15 = idx_$13;
                    if (assertions_low.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$15);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$15);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$15);
                        final SubLObject v_default = (SubLObject)((assertions_low.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) ? assertions_low.NIL : assertions_low.$kw45$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP) || assertions_low.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (assertions_low.NIL != assertion_non_true_tv(ass2)) {
                                    count = Numbers.add(count, (SubLObject)assertions_low.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)assertions_low.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 32056L)
    public static SubLObject true_assertion_count() {
        return Numbers.subtract(assertion_handles.assertion_count(), non_true_assertion_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 32289L)
    public static SubLObject set_assertion_non_true_cache_tv(final SubLObject assertion, final SubLObject tv) {
        if (assertions_low.NIL != use_non_true_assertion_tv_cacheP()) {
            if (assertions_low.NIL != enumeration_types.tv_trueP(tv)) {
                Hashtables.remhash(assertion, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue());
            }
            else {
                Hashtables.sethash(assertion, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), tv);
            }
        }
        return tv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 32809L)
    public static SubLObject possibly_non_true_assertion_tv_cache_delete(final SubLObject assertion) {
        if (assertions_low.NIL != assertion_non_true_tv(assertion)) {
            return Hashtables.remhash(assertion, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue());
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 32987L)
    public static SubLObject dump_non_true_assertion_tv_cache_to_stream(final SubLObject stream) {
        return cfasl.cfasl_output(assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 33283L)
    public static SubLObject load_non_true_assertion_tv_cache_from_stream(final SubLObject stream) {
        final SubLObject non_true_assertion_tv_cache = cfasl.cfasl_input(stream, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED);
        if (non_true_assertion_tv_cache.isHashtable()) {
            assertions_low.$non_true_assertion_tv_cache$.setGlobalValue(non_true_assertion_tv_cache);
            return non_true_assertion_count();
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 33744L)
    public static SubLObject rebuild_non_true_assertion_tv_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        setup_non_true_assertion_tv_cache(assertion_handles.assertion_count());
        final SubLObject old_prefer_non_true_set_over_flagsP = assertions_low.$prefer_non_true_set_over_flagsP$.getGlobalValue();
        try {
            assertions_low.$prefer_non_true_set_over_flagsP$.setGlobalValue((SubLObject)assertions_low.NIL);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)assertions_low.$str58$Rebuilding_the_non_true_assertion;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)assertions_low.ZERO_INTEGER;
            assert assertions_low.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)assertions_low.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)assertions_low.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)assertions_low.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$17 = idx;
                    if (assertions_low.NIL == id_index.id_index_objects_empty_p(idx_$17, (SubLObject)assertions_low.$kw45$SKIP)) {
                        final SubLObject idx_$18 = idx_$17;
                        if (assertions_low.NIL == id_index.id_index_dense_objects_empty_p(idx_$18, (SubLObject)assertions_low.$kw45$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$18);
                            final SubLObject backwardP_var = (SubLObject)assertions_low.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject a;
                            SubLObject message_var;
                            SubLObject was_appendingP;
                            SubLObject _prev_bind_0_$19;
                            SubLObject _prev_bind_0_$20;
                            SubLObject _values;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)assertions_low.NIL, v_iteration = (SubLObject)assertions_low.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)assertions_low.ONE_INTEGER)) {
                                a_id = ((assertions_low.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)assertions_low.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (assertions_low.NIL == id_index.id_index_tombstone_p(a_handle) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                                    if (assertions_low.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)assertions_low.$kw45$SKIP;
                                    }
                                    a = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    message_var = (SubLObject)assertions_low.NIL;
                                    was_appendingP = Eval.eval((SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                    Eval.eval((SubLObject)assertions_low.$list50);
                                    try {
                                        try {
                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)assertions_low.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if (assertions_low.NIL != assertion_handles.assertion_handle_validP(a) && assertions_low.NIL == assertion_utilities.true_assertionP(a)) {
                                                        Hashtables.sethash(a, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal(a));
                                                    }
                                                }
                                                catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, (SubLObject)assertions_low.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                    finally {
                                        _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                                            _values = Values.getValuesAsVector();
                                            Eval.eval((SubLObject)ConsesLow.list((SubLObject)assertions_low.$sym52$CSETQ, (SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    }
                                    if (message_var.isString()) {
                                        Errors.warn((SubLObject)assertions_low.$str53$_A, message_var);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$19 = idx_$17;
                        if (assertions_low.NIL == id_index.id_index_sparse_objects_empty_p(idx_$19) || assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$19);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$19);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$19);
                            final SubLObject v_default = (SubLObject)((assertions_low.NIL != id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP)) ? assertions_low.NIL : assertions_low.$kw45$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (assertions_low.NIL == id_index.id_index_skip_tombstones_p((SubLObject)assertions_low.$kw45$SKIP) || assertions_low.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject a2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    SubLObject message_var2 = (SubLObject)assertions_low.NIL;
                                    final SubLObject was_appendingP2 = Eval.eval((SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                    Eval.eval((SubLObject)assertions_low.$list50);
                                    try {
                                        try {
                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$21 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)assertions_low.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    if (assertions_low.NIL != assertion_handles.assertion_handle_validP(a2) && assertions_low.NIL == assertion_utilities.true_assertionP(a2)) {
                                                        Hashtables.sethash(a2, assertions_low.$non_true_assertion_tv_cache$.getGlobalValue(), assertion_tv_internal(a2));
                                                    }
                                                }
                                                catch (Throwable catch_var2) {
                                                    Errors.handleThrowable(catch_var2, (SubLObject)assertions_low.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$21, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var2) {
                                            message_var2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            Eval.eval((SubLObject)ConsesLow.list((SubLObject)assertions_low.$sym52$CSETQ, (SubLObject)assertions_low.$sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2));
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                    if (message_var2.isString()) {
                                        Errors.warn((SubLObject)assertions_low.$str53$_A, message_var2);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)assertions_low.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)assertions_low.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)assertions_low.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                assertions_low.$prefer_non_true_set_over_flagsP$.setGlobalValue(old_prefer_non_true_set_over_flagsP);
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 34499L)
    public static SubLObject assertion_plist(final SubLObject assertion) {
        return lookup_assertion_plist(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 34857L)
    public static SubLObject reset_assertion_plist(final SubLObject assertion, final SubLObject plist) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_low.NIL != Types.listp(plist) : plist;
        set_assertion_plist(assertion_handles.assertion_id(assertion), plist);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 35105L)
    public static SubLObject get_assertion_prop(final SubLObject assertion, final SubLObject indicator, SubLObject v_default) {
        if (v_default == assertions_low.UNPROVIDED) {
            v_default = (SubLObject)assertions_low.NIL;
        }
        return conses_high.getf(assertion_plist(assertion), indicator, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 35243L)
    public static SubLObject set_assertion_prop(final SubLObject assertion, final SubLObject indicator, final SubLObject value) {
        final SubLObject old_plist = assertion_plist(assertion);
        final SubLObject new_plist = conses_high.putf(old_plist, indicator, value);
        reset_assertion_plist(assertion, new_plist);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 35472L)
    public static SubLObject rem_assertion_prop(final SubLObject assertion, final SubLObject indicator) {
        final SubLObject old_plist = assertion_plist(assertion);
        final SubLObject new_plist = conses_high.remf(old_plist, indicator);
        reset_assertion_plist(assertion, new_plist);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 35689L)
    public static SubLObject reset_assertion_variable_names(final SubLObject assertion, final SubLObject new_variable_names) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_low.NIL != list_utilities.non_dotted_list_p(new_variable_names) : new_variable_names;
        SubLObject cdolist_list_var = new_variable_names;
        SubLObject elem = (SubLObject)assertions_low.NIL;
        elem = cdolist_list_var.first();
        while (assertions_low.NIL != cdolist_list_var) {
            assert assertions_low.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (assertions_low.NIL != new_variable_names) {
            set_assertion_prop(assertion, (SubLObject)assertions_low.$kw36$VARIABLE_NAMES, new_variable_names);
        }
        else {
            rem_assertion_prop(assertion, (SubLObject)assertions_low.$kw36$VARIABLE_NAMES);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 36259L)
    public static SubLObject does_assertion_have_meta_assertionsP(final SubLObject assertion) {
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 36487L)
    public static SubLObject all_meta_assertions_for_assertion(final SubLObject assertion) {
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 36698L)
    public static SubLObject assertion_index(final SubLObject assertion) {
        return kb_indexing_datastructures.assertion_indexing_store_get(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 36963L)
    public static SubLObject assertion_index_swapped_inP(final SubLObject assertion) {
        return (SubLObject)assertions_low.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 37234L)
    public static SubLObject reset_assertion_index(final SubLObject assertion, final SubLObject new_index) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (new_index.eql(kb_indexing_datastructures.new_simple_index())) {
            kb_indexing_datastructures.assertion_indexing_store_remove(assertion);
        }
        else {
            kb_indexing_datastructures.assertion_indexing_store_set(assertion, new_index);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 37702L)
    public static SubLObject clear_assertion_index(final SubLObject assertion) {
        return reset_assertion_index(assertion, kb_indexing_datastructures.new_simple_index());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 38001L)
    public static SubLObject destructure_assert_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject who = (SubLObject)assertions_low.NIL;
        SubLObject when = (SubLObject)assertions_low.NIL;
        SubLObject why = (SubLObject)assertions_low.NIL;
        SubLObject second = (SubLObject)assertions_low.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
        who = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
        when = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
        why = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
        second = current.first();
        current = current.rest();
        if (assertions_low.NIL == current) {
            current = temp;
            SubLObject assert_info = (SubLObject)assertions_low.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)assertions_low.$list61);
            assert_info = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)assertions_low.$sym62$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list((SubLObject)assertions_low.$sym63$_OPTIONAL, who, when, why, second), assert_info, ConsesLow.append(body, (SubLObject)assertions_low.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_low.$list61);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 38201L)
    public static SubLObject assertion_assert_info(final SubLObject assertion) {
        final SubLObject assert_info = get_assertion_prop(assertion, (SubLObject)assertions_low.$kw64$ASSERT_INFO, (SubLObject)assertions_low.UNPROVIDED);
        if (assertions_low.NIL != assert_info) {
            return assert_info;
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 38551L)
    public static SubLObject reset_assertion_assert_info(final SubLObject assertion, final SubLObject new_info) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertions_low.NIL != new_info) {
            set_assertion_prop(assertion, (SubLObject)assertions_low.$kw64$ASSERT_INFO, new_info);
        }
        else {
            rem_assertion_prop(assertion, (SubLObject)assertions_low.$kw64$ASSERT_INFO);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 39012L)
    public static SubLObject asserted_assertion_timestampedP(final SubLObject assertion) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (assertions_low.NIL != assertions_high.asserted_assertionP(assertion)) {
            return list_utilities.sublisp_boolean(assertion_assert_info(assertion));
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 39342L)
    public static SubLObject make_assert_info(SubLObject who, SubLObject when, SubLObject why, SubLObject second) {
        if (who == assertions_low.UNPROVIDED) {
            who = (SubLObject)assertions_low.NIL;
        }
        if (when == assertions_low.UNPROVIDED) {
            when = (SubLObject)assertions_low.NIL;
        }
        if (why == assertions_low.UNPROVIDED) {
            why = (SubLObject)assertions_low.NIL;
        }
        if (second == assertions_low.UNPROVIDED) {
            second = (SubLObject)assertions_low.NIL;
        }
        if (assertions_low.NIL != second) {
            return (SubLObject)ConsesLow.list(who, when, why, second);
        }
        if (assertions_low.NIL != why) {
            return (SubLObject)ConsesLow.list(who, when, why);
        }
        if (assertions_low.NIL != when) {
            return (SubLObject)ConsesLow.list(who, when);
        }
        if (assertions_low.NIL != who) {
            return (SubLObject)ConsesLow.list(who);
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 39724L)
    public static SubLObject assert_info_who(final SubLObject assert_info) {
        return assert_info.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 39948L)
    public static SubLObject assert_info_when(final SubLObject assert_info) {
        return conses_high.second(assert_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 40175L)
    public static SubLObject assert_info_why(final SubLObject assert_info) {
        return conses_high.third(assert_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 40399L)
    public static SubLObject assert_info_second(final SubLObject assert_info) {
        return conses_high.fourth(assert_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 40630L)
    public static SubLObject set_assertion_asserted_by(final SubLObject assertion, final SubLObject assertor) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject when = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject why = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject second = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        if (assertions_low.NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(assertor, when, why, second));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_low.$list65);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 41026L)
    public static SubLObject set_assertion_asserted_when(final SubLObject assertion, final SubLObject universal_date) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject when = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject why = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject second = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        if (assertions_low.NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, universal_date, why, second));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_low.$list65);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 41439L)
    public static SubLObject set_assertion_asserted_why(final SubLObject assertion, final SubLObject reason) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject when = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject why = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject second = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        if (assertions_low.NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, when, reason, second));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_low.$list65);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 41833L)
    public static SubLObject set_assertion_asserted_second(final SubLObject assertion, final SubLObject universal_second) {
        SubLObject current;
        final SubLObject datum = current = assertion_assert_info(assertion);
        final SubLObject who = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject when = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject why = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        final SubLObject second = (SubLObject)(current.isCons() ? current.first() : assertions_low.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)assertions_low.$list65);
        current = current.rest();
        if (assertions_low.NIL == current) {
            return reset_assertion_assert_info(assertion, make_assert_info(who, when, why, universal_second));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)assertions_low.$list65);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 42256L)
    public static SubLObject valid_assertion_robustP(final SubLObject assertion) {
        if (assertions_low.NIL != assertion_handles.assertion_p(assertion) && assertions_low.NIL != assertion_handles.valid_assertionP(assertion, (SubLObject)assertions_low.UNPROVIDED)) {
            final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
            final SubLObject dependents = assertions_high.assertion_dependents(assertion);
            final SubLObject vnames = assertion_variable_names_internal(assertion);
            final SubLObject index = assertion_index(assertion);
            return (SubLObject)SubLObjectFactory.makeBoolean(assertions_low.NIL != hlmt.valid_hlmt_p(assertion_mt_internal(assertion), (SubLObject)assertions_low.UNPROVIDED) && assertions_low.NIL != enumeration_types.tv_p(assertion_tv(assertion)) && v_arguments.isCons() && assertions_low.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)assertions_low.$sym66$VALID_ARGUMENT), v_arguments, (SubLObject)assertions_low.UNPROVIDED) && assertions_low.NIL != set_contents.set_contents_p(dependents) && assertions_low.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)assertions_low.$sym66$VALID_ARGUMENT), set_contents.set_contents_element_list(dependents), (SubLObject)assertions_low.UNPROVIDED) && vnames.isList() && assertions_low.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)assertions_low.$sym44$STRINGP), vnames, (SubLObject)assertions_low.UNPROVIDED) && assertions_low.NIL != enumeration_types.direction_p(assertions_high.assertion_direction(assertion)) && assertions_low.NIL != kb_indexing_datastructures.index_installed_p(index));
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 43426L)
    public static SubLObject valid_assertion_with_contentP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = assertion_handles.assertion_id(assertion);
        SubLObject content = (SubLObject)assertions_low.NIL;
        SubLObject ignore_errors_tag = (SubLObject)assertions_low.NIL;
        try {
            thread.throwStack.push(assertions_low.$kw67$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)assertions_low.$sym68$IGNORE_ERRORS_HANDLER), thread);
                try {
                    content = assertion_manager.lookup_assertion_content(id);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)assertions_low.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)assertions_low.$kw67$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return list_utilities.sublisp_boolean(content);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 43804L)
    public static SubLObject kb_create_assertion_kb_store(final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        SubLObject assertion = kb_indexing.find_assertion_internal(cnf, mt);
        if (assertions_low.NIL != assertion) {
            return assertion_handles.assertion_id(assertion);
        }
        final SubLObject internal_id = assertion_handles.make_assertion_id();
        assertion = assertion_handles.make_assertion_shell(internal_id);
        kb_create_assertion_int(assertion, internal_id, cnf, mt, variable_names, direction, truth, strength, asserted_argument);
        return internal_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 44744L)
    public static SubLObject kb_create_assertion_int(final SubLObject assertion, final SubLObject internal_id, final SubLObject cnf, final SubLObject mt, final SubLObject variable_names, final SubLObject direction, final SubLObject truth, final SubLObject strength, final SubLObject asserted_argument) {
        final SubLObject assertion_content = create_assertion_content(mt);
        assertion_manager.register_assertion_content(internal_id, assertion_content);
        reset_assertion_variable_names(assertion, variable_names);
        reset_assertion_tv(assertion, enumeration_types.tv_from_truth_strength(truth, strength));
        final SubLObject formula_data_hook = find_cnf_formula_data_hook(cnf);
        connect_assertion(assertion, formula_data_hook);
        kb_set_assertion_direction_internal(assertion, direction);
        if (assertions_low.NIL != asserted_argument) {
            add_new_assertion_argument(assertion, asserted_argument);
        }
        if (direction == assertions_low.$kw69$FORWARD) {
            forward.queue_forward_assertion(assertion);
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 45631L)
    public static SubLObject kb_create_assertion_cyc(final SubLObject internal_id) {
        final SubLObject assertion = assertion_handles.find_assertion_by_id(internal_id);
        return (assertions_low.NIL != assertion) ? assertion : assertion_handles.make_assertion_shell(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 45939L)
    public static SubLObject find_cnf_formula_data_hook(final SubLObject cnf) {
        if (assertions_low.NIL != clauses.gaf_cnfP(cnf)) {
            return find_gaf_formula_hook(clause_utilities.gaf_cnf_literal(cnf));
        }
        return find_hl_cnf_hook(cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 46903L)
    public static SubLObject find_hl_cnf_hook(final SubLObject cnf) {
        final SubLObject assertion = kb_indexing.find_assertion_any_mt(cnf);
        if (assertions_low.NIL != assertion) {
            final SubLObject clause_struc = assertion_clause_struc(assertion);
            return (assertions_low.NIL != clause_struc) ? clause_struc : assertion;
        }
        return cnf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 47158L)
    public static SubLObject find_gaf_formula_hook(final SubLObject gaf) {
        final SubLObject assertion = kb_indexing.find_gaf_any_mt(gaf);
        if (assertions_low.NIL != assertion) {
            final SubLObject clause_struc = assertion_clause_struc(assertion);
            return (assertions_low.NIL != clause_struc) ? clause_struc : assertion;
        }
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 47408L)
    public static SubLObject connect_assertion(final SubLObject assertion, final SubLObject formula_data_hook) {
        connect_assertion_formula_data(assertion, formula_data_hook);
        kb_indexing.add_assertion_indices(assertion, (SubLObject)assertions_low.UNPROVIDED);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 47663L)
    public static SubLObject connect_assertion_formula_data(final SubLObject assertion, final SubLObject formula_data_hook) {
        SubLObject formula_data = formula_data_hook;
        if (assertions_low.NIL != clause_strucs.clause_struc_p(formula_data_hook)) {
            clause_strucs.add_clause_struc_assertion(formula_data_hook, assertion);
        }
        else if (assertions_low.NIL != assertion_handles.assertion_p(formula_data_hook)) {
            final SubLObject cnf = assertions_high.assertion_cnf(formula_data_hook);
            final SubLObject new_clause_struc = clause_strucs.create_clause_struc(cnf);
            clause_strucs.add_clause_struc_assertion(new_clause_struc, formula_data_hook);
            clause_strucs.add_clause_struc_assertion(new_clause_struc, assertion);
            formula_data = new_clause_struc;
            reset_assertion_clause_struc(formula_data_hook, formula_data);
        }
        else if (assertions_low.NIL == clauses.cnf_p(formula_data_hook)) {
            if (assertions_low.NIL == el_utilities.el_formula_p(formula_data_hook)) {
                Errors.error((SubLObject)assertions_low.$str70$Unexpected_formula_data_hook___S, formula_data_hook);
                return (SubLObject)assertions_low.NIL;
            }
        }
        update_assertion_formula_data(assertion, formula_data);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 49043L)
    public static SubLObject kb_remove_assertion_internal(final SubLObject assertion) {
        final SubLObject id = assertion_handles.assertion_id(assertion);
        disconnect_assertion(assertion);
        destroy_assertion_content(id);
        assertion_handles.deregister_assertion_id(id);
        assertion_handles.free_assertion(assertion);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 49538L)
    public static SubLObject reconnect_assertion(final SubLObject assertion, final SubLObject new_cnf) {
        disconnect_assertion(assertion);
        final SubLObject hl_cnf_hook = find_hl_cnf_hook(new_cnf);
        connect_assertion(assertion, hl_cnf_hook);
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 49946L)
    public static SubLObject disconnect_assertion(final SubLObject assertion) {
        kb_indexing.remove_assertion_indices(assertion, (SubLObject)assertions_low.UNPROVIDED);
        disconnect_assertion_formula_data(assertion);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 50328L)
    public static SubLObject disconnect_assertion_formula_data(final SubLObject assertion) {
        final SubLObject clause_struc = assertion_clause_struc(assertion);
        if (assertions_low.NIL != clause_struc) {
            clause_strucs.remove_clause_struc_assertion(clause_struc, assertion);
        }
        annihilate_assertion_formula_data(assertion);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 50605L)
    public static SubLObject add_new_assertion_argument(final SubLObject assertion, final SubLObject new_argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), (SubLObject)ConsesLow.cons(new_argument, assertions_high.assertion_arguments(assertion)));
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 51198L)
    public static SubLObject remove_assertion_argument(final SubLObject assertion, final SubLObject argument) {
        set_assertion_arguments(assertion_handles.assertion_id(assertion), list_utilities.delete_first(argument, assertions_high.assertion_arguments(assertion), (SubLObject)assertions_low.UNPROVIDED));
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 51526L)
    public static SubLObject reset_assertion_dependents(final SubLObject assertion, final SubLObject new_dependents) {
        assert assertions_low.NIL != set_contents.set_contents_p(new_dependents) : new_dependents;
        if (assertions_low.NIL != new_dependents) {
            set_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS, new_dependents);
        }
        else {
            rem_assertion_prop(assertion, (SubLObject)assertions_low.$kw31$DEPENDENTS);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 52022L)
    public static SubLObject add_assertion_dependent(final SubLObject assertion, final SubLObject argument) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_low.NIL != arguments.argument_p(argument) : argument;
        reset_assertion_dependents(assertion, set_contents.set_contents_add(argument, assertion_dependents_internal(assertion), (SubLObject)assertions_low.UNPROVIDED));
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 52495L)
    public static SubLObject remove_assertion_dependent(final SubLObject assertion, final SubLObject argument) {
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert assertions_low.NIL != arguments.argument_p(argument) : argument;
        reset_assertion_dependents(assertion, set_contents.set_contents_delete(argument, assertion_dependents_internal(assertion), (SubLObject)assertions_low.UNPROVIDED));
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 53122L)
    public static SubLObject assertion_dependencies(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert assertions_low.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject assertions = (SubLObject)assertions_low.NIL;
        SubLObject deductions = (SubLObject)assertions_low.NIL;
        final SubLObject dependent_count = set_contents.set_contents_size(assertion_dependents_internal(assertion));
        final SubLObject _prev_bind_0 = assertions_low.$dependent_assertion_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = assertions_low.$dependent_deduction_table$.currentBinding(thread);
        try {
            assertions_low.$dependent_assertion_table$.bind(Hashtables.make_hash_table(Numbers.integerDivide(dependent_count, (SubLObject)assertions_low.TWO_INTEGER), (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED), thread);
            assertions_low.$dependent_deduction_table$.bind(Hashtables.make_hash_table(dependent_count, (SubLObject)assertions_low.UNPROVIDED, (SubLObject)assertions_low.UNPROVIDED), thread);
            mark_dependent_assertion(assertion);
            assertions = assertions_low.$dependent_assertion_table$.getDynamicValue(thread);
            deductions = assertions_low.$dependent_deduction_table$.getDynamicValue(thread);
        }
        finally {
            assertions_low.$dependent_deduction_table$.rebind(_prev_bind_2, thread);
            assertions_low.$dependent_assertion_table$.rebind(_prev_bind_0, thread);
        }
        return Values.values(assertions, deductions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 53900L)
    public static SubLObject mark_dependent_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (assertions_low.NIL == Hashtables.gethash(assertion, assertions_low.$dependent_assertion_table$.getDynamicValue(thread), (SubLObject)assertions_low.UNPROVIDED)) {
            Hashtables.sethash(assertion, assertions_low.$dependent_assertion_table$.getDynamicValue(thread), (SubLObject)assertions_low.T);
            final SubLObject set_contents_var = assertion_dependents_internal(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)assertions_low.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); assertions_low.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (assertions_low.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    mark_dependent_deduction(deduction);
                }
            }
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 54268L)
    public static SubLObject mark_dependent_deduction(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert assertions_low.NIL != deduction_handles.deduction_p(deduction) : deduction;
        if (assertions_low.NIL == Hashtables.gethash(deduction, assertions_low.$dependent_deduction_table$.getDynamicValue(thread), (SubLObject)assertions_low.UNPROVIDED)) {
            Hashtables.sethash(deduction, assertions_low.$dependent_deduction_table$.getDynamicValue(thread), (SubLObject)assertions_low.T);
            final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
            if (assertions_low.NIL != assertion_handles.assertion_p(supported_object)) {
                SubLObject witness = (SubLObject)assertions_low.NIL;
                if (assertions_low.NIL == witness) {
                    SubLObject csome_list_var = assertion_arguments_internal(supported_object);
                    SubLObject argument = (SubLObject)assertions_low.NIL;
                    argument = csome_list_var.first();
                    while (assertions_low.NIL == witness && assertions_low.NIL != csome_list_var) {
                        if (assertions_low.NIL != arguments.belief_p(argument) || assertions_low.NIL == Hashtables.gethash(deduction, assertions_low.$dependent_deduction_table$.getDynamicValue(thread), (SubLObject)assertions_low.UNPROVIDED)) {
                            witness = argument;
                        }
                        csome_list_var = csome_list_var.rest();
                        argument = csome_list_var.first();
                    }
                }
                if (assertions_low.NIL == witness) {
                    mark_dependent_assertion(supported_object);
                }
            }
            else if (assertions_low.NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {}
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 55328L)
    public static SubLObject verify_assertion_content_table(SubLObject repairP) {
        if (repairP == assertions_low.UNPROVIDED) {
            repairP = (SubLObject)assertions_low.NIL;
        }
        return assertion_manager.verify_assertion_content_table_int((SubLObject)assertions_low.$sym1$ASSERTION_CONTENT_P, repairP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 55606L)
    public static SubLObject random_assertion_internal(SubLObject test) {
        if (test == assertions_low.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)assertions_low.$sym74$TRUE);
        }
        if (assertion_handles.assertion_count().numG((SubLObject)assertions_low.ZERO_INTEGER)) {
            final SubLObject max_id = assertion_handles.next_assertion_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = (SubLObject)assertions_low.NIL; assertions_low.NIL == v_answer; v_answer = candidate) {
                candidate = assertion_handles.find_assertion_by_id(random.random(max_id));
                if (assertions_low.NIL != candidate && assertions_low.NIL != Functions.funcall(test, candidate)) {}
            }
            return v_answer;
        }
        return (SubLObject)assertions_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 56001L)
    public static SubLObject random_rule_internal() {
        final SubLObject rule_set = kb_rule_set();
        if (assertions_low.NIL != keyhash.keyhash_p(rule_set)) {
            return keyhash.keyhash_random_key(rule_set);
        }
        return assertions_high.random_assertion(Symbols.symbol_function((SubLObject)assertions_low.$sym75$RULE_ASSERTION_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/assertions-low.lisp", position = 56269L)
    public static SubLObject random_gaf_internal() {
        return assertions_high.random_assertion(Symbols.symbol_function((SubLObject)assertions_low.$sym76$GAF_ASSERTION_));
    }
    
    public static SubLObject declare_assertions_low_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_content_print_function_trampoline", "ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_content_p", "ASSERTION-CONTENT-P", 1, 0, false);
        new $assertion_content_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "as_content_formula_data", "AS-CONTENT-FORMULA-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "as_content_mt", "AS-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "as_content_flags", "AS-CONTENT-FLAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "as_content_arguments", "AS-CONTENT-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "as_content_plist", "AS-CONTENT-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "_csetf_as_content_formula_data", "_CSETF-AS-CONTENT-FORMULA-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "_csetf_as_content_mt", "_CSETF-AS-CONTENT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "_csetf_as_content_flags", "_CSETF-AS-CONTENT-FLAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "_csetf_as_content_arguments", "_CSETF-AS-CONTENT-ARGUMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "_csetf_as_content_plist", "_CSETF-AS-CONTENT-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "make_assertion_content", "MAKE-ASSERTION-CONTENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "visit_defstruct_assertion_content", "VISIT-DEFSTRUCT-ASSERTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "visit_defstruct_object_assertion_content_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "create_assertion_content", "CREATE-ASSERTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "destroy_assertion_content", "DESTROY-ASSERTION-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "lookup_assertion_formula_data", "LOOKUP-ASSERTION-FORMULA-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "lookup_assertion_mt", "LOOKUP-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "lookup_assertion_flags", "LOOKUP-ASSERTION-FLAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "lookup_assertion_arguments", "LOOKUP-ASSERTION-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "lookup_assertion_plist", "LOOKUP-ASSERTION-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_formula_data", "SET-ASSERTION-FORMULA-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_flags", "SET-ASSERTION-FLAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_arguments", "SET-ASSERTION-ARGUMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_plist", "SET-ASSERTION-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "dump_assertion_content", "DUMP-ASSERTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_plist_for_dumping", "ASSERTION-PLIST-FOR-DUMPING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "load_assertion_content", "LOAD-ASSERTION-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "load_assertion_content_int", "LOAD-ASSERTION-CONTENT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_cnf_internal", "ASSERTION-CNF-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "possibly_assertion_cnf_internal", "POSSIBLY-ASSERTION-CNF-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_mt_internal", "ASSERTION-MT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_gaf_hl_formula_internal", "ASSERTION-GAF-HL-FORMULA-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_cons_internal", "ASSERTION-CONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_direction_internal", "ASSERTION-DIRECTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_truth_internal", "ASSERTION-TRUTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_strength_internal", "ASSERTION-STRENGTH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_tv", "ASSERTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_tv_internal", "ASSERTION-TV-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_variable_names_internal", "ASSERTION-VARIABLE-NAMES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "asserted_by_internal", "ASSERTED-BY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "asserted_when_internal", "ASSERTED-WHEN-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "asserted_why_internal", "ASSERTED-WHY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "asserted_second_internal", "ASSERTED-SECOND-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_arguments_internal", "ASSERTION-ARGUMENTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_dependents_internal", "ASSERTION-DEPENDENTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_dependent_count_internal", "ASSERTION-DEPENDENT-COUNT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_has_dependents_p_internal", "ASSERTION-HAS-DEPENDENTS-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_formula_data", "ASSERTION-FORMULA-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_formula_data", "RESET-ASSERTION-FORMULA-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_hl_cnf", "ASSERTION-HL-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "update_assertion_formula_data", "UPDATE-ASSERTION-FORMULA-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_clause_struc", "ASSERTION-CLAUSE-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_cnf", "RESET-ASSERTION-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_clause_struc", "RESET-ASSERTION-CLAUSE-STRUC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_gaf_formula", "RESET-ASSERTION-GAF-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "annihilate_assertion_formula_data", "ANNIHILATE-ASSERTION-FORMULA-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_flags", "ASSERTION-FLAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_flags", "RESET-ASSERTION-FLAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_flags_gaf_code", "ASSERTION-FLAGS-GAF-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_flags_gaf_code", "SET-ASSERTION-FLAGS-GAF-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_flags_direction_code", "ASSERTION-FLAGS-DIRECTION-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_flags_direction_code", "SET-ASSERTION-FLAGS-DIRECTION-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_flags_tv_code", "ASSERTION-FLAGS-TV-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_flags_tv_code", "SET-ASSERTION-FLAGS-TV-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_flags_gaf_p", "ASSERTION-FLAGS-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_flags_gaf_p", "SET-ASSERTION-FLAGS-GAF-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "use_rule_setP", "USE-RULE-SET?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "setup_rule_set", "SETUP-RULE-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_rule_set", "KB-RULE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_gaf_p", "ASSERTION-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_rule_p", "ASSERTION-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "rule_count", "RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "gaf_count", "GAF-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_gaf_p", "SET-ASSERTION-GAF-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "possibly_rule_set_delete", "POSSIBLY-RULE-SET-DELETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "recompute_assertion_gaf_p", "RECOMPUTE-ASSERTION-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "determine_cnf_gaf_p", "DETERMINE-CNF-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "dump_rule_set_to_stream", "DUMP-RULE-SET-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "load_rule_set_from_stream", "LOAD-RULE-SET-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "rebuild_rule_set", "REBUILD-RULE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "gaf_formula_to_cnf", "GAF-FORMULA-TO-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "cnf_to_gaf_formula", "CNF-TO-GAF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_set_assertion_direction_internal", "KB-SET-ASSERTION-DIRECTION-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_direction", "RESET-ASSERTION-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_tv", "RESET-ASSERTION-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_truth", "RESET-ASSERTION-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_strength", "RESET-ASSERTION-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "use_non_true_assertion_tv_cacheP", "USE-NON-TRUE-ASSERTION-TV-CACHE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "setup_non_true_assertion_tv_cache", "SETUP-NON-TRUE-ASSERTION-TV-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_non_true_assertion_tv_cache", "KB-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_true_p", "ASSERTION-TRUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_non_true_tv", "ASSERTION-NON-TRUE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "non_true_assertion_count", "NON-TRUE-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "true_assertion_count", "TRUE-ASSERTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_non_true_cache_tv", "SET-ASSERTION-NON-TRUE-CACHE-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "possibly_non_true_assertion_tv_cache_delete", "POSSIBLY-NON-TRUE-ASSERTION-TV-CACHE-DELETE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "dump_non_true_assertion_tv_cache_to_stream", "DUMP-NON-TRUE-ASSERTION-TV-CACHE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "load_non_true_assertion_tv_cache_from_stream", "LOAD-NON-TRUE-ASSERTION-TV-CACHE-FROM-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "rebuild_non_true_assertion_tv_cache", "REBUILD-NON-TRUE-ASSERTION-TV-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_plist", "ASSERTION-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_plist", "RESET-ASSERTION-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "get_assertion_prop", "GET-ASSERTION-PROP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_prop", "SET-ASSERTION-PROP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "rem_assertion_prop", "REM-ASSERTION-PROP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_variable_names", "RESET-ASSERTION-VARIABLE-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "does_assertion_have_meta_assertionsP", "DOES-ASSERTION-HAVE-META-ASSERTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "all_meta_assertions_for_assertion", "ALL-META-ASSERTIONS-FOR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_index", "ASSERTION-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_index_swapped_inP", "ASSERTION-INDEX-SWAPPED-IN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_index", "RESET-ASSERTION-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "clear_assertion_index", "CLEAR-ASSERTION-INDEX", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.assertions_low", "destructure_assert_info", "DESTRUCTURE-ASSERT-INFO");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_assert_info", "ASSERTION-ASSERT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_assert_info", "RESET-ASSERTION-ASSERT-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "asserted_assertion_timestampedP", "ASSERTED-ASSERTION-TIMESTAMPED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "make_assert_info", "MAKE-ASSERT-INFO", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assert_info_who", "ASSERT-INFO-WHO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assert_info_when", "ASSERT-INFO-WHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assert_info_why", "ASSERT-INFO-WHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assert_info_second", "ASSERT-INFO-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_asserted_by", "SET-ASSERTION-ASSERTED-BY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_asserted_when", "SET-ASSERTION-ASSERTED-WHEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_asserted_why", "SET-ASSERTION-ASSERTED-WHY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "set_assertion_asserted_second", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "valid_assertion_robustP", "VALID-ASSERTION-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "valid_assertion_with_contentP", "VALID-ASSERTION-WITH-CONTENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_create_assertion_kb_store", "KB-CREATE-ASSERTION-KB-STORE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_create_assertion_int", "KB-CREATE-ASSERTION-INT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_create_assertion_cyc", "KB-CREATE-ASSERTION-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "find_cnf_formula_data_hook", "FIND-CNF-FORMULA-DATA-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "find_hl_cnf_hook", "FIND-HL-CNF-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "find_gaf_formula_hook", "FIND-GAF-FORMULA-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "connect_assertion", "CONNECT-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "connect_assertion_formula_data", "CONNECT-ASSERTION-FORMULA-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "kb_remove_assertion_internal", "KB-REMOVE-ASSERTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reconnect_assertion", "RECONNECT-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "disconnect_assertion", "DISCONNECT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "disconnect_assertion_formula_data", "DISCONNECT-ASSERTION-FORMULA-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "add_new_assertion_argument", "ADD-NEW-ASSERTION-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "remove_assertion_argument", "REMOVE-ASSERTION-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "reset_assertion_dependents", "RESET-ASSERTION-DEPENDENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "add_assertion_dependent", "ADD-ASSERTION-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "remove_assertion_dependent", "REMOVE-ASSERTION-DEPENDENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "assertion_dependencies", "ASSERTION-DEPENDENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "mark_dependent_assertion", "MARK-DEPENDENT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "mark_dependent_deduction", "MARK-DEPENDENT-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "verify_assertion_content_table", "VERIFY-ASSERTION-CONTENT-TABLE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "random_assertion_internal", "RANDOM-ASSERTION-INTERNAL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "random_rule_internal", "RANDOM-RULE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.assertions_low", "random_gaf_internal", "RANDOM-GAF-INTERNAL", 0, 0, false);
        return (SubLObject)assertions_low.NIL;
    }
    
    public static SubLObject init_assertions_low_file() {
        assertions_low.$dtp_assertion_content$ = SubLFiles.defconstant("*DTP-ASSERTION-CONTENT*", (SubLObject)assertions_low.$sym0$ASSERTION_CONTENT);
        assertions_low.$default_assertion_flags$ = SubLFiles.deflexical("*DEFAULT-ASSERTION-FLAGS*", (SubLObject)assertions_low.ZERO_INTEGER);
        assertions_low.$assertion_flags_gaf_byte$ = SubLFiles.defconstant("*ASSERTION-FLAGS-GAF-BYTE*", bytes.sublisp_byte((SubLObject)assertions_low.ONE_INTEGER, (SubLObject)assertions_low.ZERO_INTEGER));
        assertions_low.$assertion_flags_direction_byte$ = SubLFiles.defconstant("*ASSERTION-FLAGS-DIRECTION-BYTE*", bytes.sublisp_byte((SubLObject)assertions_low.TWO_INTEGER, (SubLObject)assertions_low.ONE_INTEGER));
        assertions_low.$assertion_flags_tv_byte$ = SubLFiles.defconstant("*ASSERTION-FLAGS-TV-BYTE*", bytes.sublisp_byte((SubLObject)assertions_low.THREE_INTEGER, (SubLObject)assertions_low.THREE_INTEGER));
        assertions_low.$rule_set$ = SubLFiles.deflexical("*RULE-SET*", (SubLObject)((assertions_low.NIL != Symbols.boundp((SubLObject)assertions_low.$sym39$_RULE_SET_)) ? assertions_low.$rule_set$.getGlobalValue() : assertions_low.NIL));
        assertions_low.$prefer_rule_set_over_flagsP$ = SubLFiles.deflexical("*PREFER-RULE-SET-OVER-FLAGS?*", (SubLObject)((assertions_low.NIL != Symbols.boundp((SubLObject)assertions_low.$sym40$_PREFER_RULE_SET_OVER_FLAGS__)) ? assertions_low.$prefer_rule_set_over_flagsP$.getGlobalValue() : assertions_low.T));
        assertions_low.$estimated_assertions_per_rule$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-RULE*", (SubLObject)assertions_low.$int41$60);
        assertions_low.$non_true_assertion_tv_cache$ = SubLFiles.deflexical("*NON-TRUE-ASSERTION-TV-CACHE*", (SubLObject)((assertions_low.NIL != Symbols.boundp((SubLObject)assertions_low.$sym54$_NON_TRUE_ASSERTION_TV_CACHE_)) ? assertions_low.$non_true_assertion_tv_cache$.getGlobalValue() : assertions_low.NIL));
        assertions_low.$prefer_non_true_set_over_flagsP$ = SubLFiles.deflexical("*PREFER-NON-TRUE-SET-OVER-FLAGS?*", (SubLObject)((assertions_low.NIL != Symbols.boundp((SubLObject)assertions_low.$sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__)) ? assertions_low.$prefer_non_true_set_over_flagsP$.getGlobalValue() : assertions_low.T));
        assertions_low.$estimated_assertions_per_non_true$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-NON-TRUE*", (SubLObject)assertions_low.$int56$1983);
        assertions_low.$dependent_deduction_table$ = SubLFiles.defparameter("*DEPENDENT-DEDUCTION-TABLE*", (SubLObject)assertions_low.NIL);
        assertions_low.$dependent_assertion_table$ = SubLFiles.defparameter("*DEPENDENT-ASSERTION-TABLE*", (SubLObject)assertions_low.NIL);
        $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__.setValue(T);
        return (SubLObject)assertions_low.NIL;
    }
    
    public static SubLObject setup_assertions_low_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), assertions_low.$dtp_assertion_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)assertions_low.$sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)assertions_low.$list9);
        Structures.def_csetf((SubLObject)assertions_low.$sym10$AS_CONTENT_FORMULA_DATA, (SubLObject)assertions_low.$sym11$_CSETF_AS_CONTENT_FORMULA_DATA);
        Structures.def_csetf((SubLObject)assertions_low.$sym12$AS_CONTENT_MT, (SubLObject)assertions_low.$sym13$_CSETF_AS_CONTENT_MT);
        Structures.def_csetf((SubLObject)assertions_low.$sym14$AS_CONTENT_FLAGS, (SubLObject)assertions_low.$sym15$_CSETF_AS_CONTENT_FLAGS);
        Structures.def_csetf((SubLObject)assertions_low.$sym16$AS_CONTENT_ARGUMENTS, (SubLObject)assertions_low.$sym17$_CSETF_AS_CONTENT_ARGUMENTS);
        Structures.def_csetf((SubLObject)assertions_low.$sym18$AS_CONTENT_PLIST, (SubLObject)assertions_low.$sym19$_CSETF_AS_CONTENT_PLIST);
        Equality.identity((SubLObject)assertions_low.$sym0$ASSERTION_CONTENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), assertions_low.$dtp_assertion_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)assertions_low.$sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)assertions_low.$sym39$_RULE_SET_);
        subl_macro_promotions.declare_defglobal((SubLObject)assertions_low.$sym40$_PREFER_RULE_SET_OVER_FLAGS__);
        subl_macro_promotions.declare_defglobal((SubLObject)assertions_low.$sym54$_NON_TRUE_ASSERTION_TV_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)assertions_low.$sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__);
        return (SubLObject)assertions_low.NIL;
    }
    
    public void declareFunctions() {
        declare_assertions_low_file();
    }
    
    public void initializeVariables() {
        init_assertions_low_file();
    }
    
    public void runTopLevelForms() {
        setup_assertions_low_file();
    }
    
    static {
        me = (SubLFile)new assertions_low();
        assertions_low.$dtp_assertion_content$ = null;
        assertions_low.$default_assertion_flags$ = null;
        assertions_low.$assertion_flags_gaf_byte$ = null;
        assertions_low.$assertion_flags_direction_byte$ = null;
        assertions_low.$assertion_flags_tv_byte$ = null;
        assertions_low.$rule_set$ = null;
        assertions_low.$prefer_rule_set_over_flagsP$ = null;
        assertions_low.$estimated_assertions_per_rule$ = null;
        assertions_low.$non_true_assertion_tv_cache$ = null;
        assertions_low.$prefer_non_true_set_over_flagsP$ = null;
        assertions_low.$estimated_assertions_per_non_true$ = null;
        assertions_low.$dependent_deduction_table$ = null;
        assertions_low.$dependent_assertion_table$ = null;
        $sym0$ASSERTION_CONTENT = SubLObjectFactory.makeSymbol("ASSERTION-CONTENT");
        $sym1$ASSERTION_CONTENT_P = SubLObjectFactory.makeSymbol("ASSERTION-CONTENT-P");
        $int2$148 = SubLObjectFactory.makeInteger(148);
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORMULA-DATA"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("FLAGS"), (SubLObject)SubLObjectFactory.makeKeyword("ARGUMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AS-CONTENT-FORMULA-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("AS-CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("AS-CONTENT-FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("AS-CONTENT-ARGUMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("AS-CONTENT-PLIST"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-FLAGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-PLIST"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$ASSERTION_CONTENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ASSERTION-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-CONTENT-P"));
        $sym10$AS_CONTENT_FORMULA_DATA = SubLObjectFactory.makeSymbol("AS-CONTENT-FORMULA-DATA");
        $sym11$_CSETF_AS_CONTENT_FORMULA_DATA = SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-FORMULA-DATA");
        $sym12$AS_CONTENT_MT = SubLObjectFactory.makeSymbol("AS-CONTENT-MT");
        $sym13$_CSETF_AS_CONTENT_MT = SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-MT");
        $sym14$AS_CONTENT_FLAGS = SubLObjectFactory.makeSymbol("AS-CONTENT-FLAGS");
        $sym15$_CSETF_AS_CONTENT_FLAGS = SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-FLAGS");
        $sym16$AS_CONTENT_ARGUMENTS = SubLObjectFactory.makeSymbol("AS-CONTENT-ARGUMENTS");
        $sym17$_CSETF_AS_CONTENT_ARGUMENTS = SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-ARGUMENTS");
        $sym18$AS_CONTENT_PLIST = SubLObjectFactory.makeSymbol("AS-CONTENT-PLIST");
        $sym19$_CSETF_AS_CONTENT_PLIST = SubLObjectFactory.makeSymbol("_CSETF-AS-CONTENT-PLIST");
        $kw20$FORMULA_DATA = SubLObjectFactory.makeKeyword("FORMULA-DATA");
        $kw21$MT = SubLObjectFactory.makeKeyword("MT");
        $kw22$FLAGS = SubLObjectFactory.makeKeyword("FLAGS");
        $kw23$ARGUMENTS = SubLObjectFactory.makeKeyword("ARGUMENTS");
        $kw24$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $str25$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw26$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym27$MAKE_ASSERTION_CONTENT = SubLObjectFactory.makeSymbol("MAKE-ASSERTION-CONTENT");
        $kw28$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw29$END = SubLObjectFactory.makeKeyword("END");
        $sym30$VISIT_DEFSTRUCT_OBJECT_ASSERTION_CONTENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ASSERTION-CONTENT-METHOD");
        $kw31$DEPENDENTS = SubLObjectFactory.makeKeyword("DEPENDENTS");
        $kw32$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw33$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym34$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str35$_a__assertion___a__has_null_flags = SubLObjectFactory.makeString("~a (assertion #~a) has null flags");
        $kw36$VARIABLE_NAMES = SubLObjectFactory.makeKeyword("VARIABLE-NAMES");
        $int37$256 = SubLObjectFactory.makeInteger(256);
        $str38$Unexpected_formula_data_type___S = SubLObjectFactory.makeString("Unexpected formula-data type: ~S");
        $sym39$_RULE_SET_ = SubLObjectFactory.makeSymbol("*RULE-SET*");
        $sym40$_PREFER_RULE_SET_OVER_FLAGS__ = SubLObjectFactory.makeSymbol("*PREFER-RULE-SET-OVER-FLAGS?*");
        $int41$60 = SubLObjectFactory.makeInteger(60);
        $sym42$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str43$mapping_Cyc_assertions = SubLObjectFactory.makeString("mapping Cyc assertions");
        $sym44$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw45$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym46$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $sym47$KEYHASH_P = SubLObjectFactory.makeSymbol("KEYHASH-P");
        $str48$Rebuilding_the_Rule_Set = SubLObjectFactory.makeString("Rebuilding the Rule Set");
        $sym49$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)assertions_low.NIL);
        $sym51$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym52$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str53$_A = SubLObjectFactory.makeString("~A");
        $sym54$_NON_TRUE_ASSERTION_TV_CACHE_ = SubLObjectFactory.makeSymbol("*NON-TRUE-ASSERTION-TV-CACHE*");
        $sym55$_PREFER_NON_TRUE_SET_OVER_FLAGS__ = SubLObjectFactory.makeSymbol("*PREFER-NON-TRUE-SET-OVER-FLAGS?*");
        $int56$1983 = SubLObjectFactory.makeInteger(1983);
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WEAK-KEYS"), (SubLObject)assertions_low.T);
        $str58$Rebuilding_the_non_true_assertion = SubLObjectFactory.makeString("Rebuilding the non-true assertion cache");
        $sym59$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym60$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHO"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WHY"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND")), (SubLObject)SubLObjectFactory.makeSymbol("ASSERT-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym62$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym63$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $kw64$ASSERT_INFO = SubLObjectFactory.makeKeyword("ASSERT-INFO");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHO"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WHY"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND"));
        $sym66$VALID_ARGUMENT = SubLObjectFactory.makeSymbol("VALID-ARGUMENT");
        $kw67$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym68$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw69$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str70$Unexpected_formula_data_hook___S = SubLObjectFactory.makeString("Unexpected formula data hook: ~S");
        $sym71$SET_CONTENTS_P = SubLObjectFactory.makeSymbol("SET-CONTENTS-P");
        $sym72$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $sym73$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym74$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym75$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $sym76$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
    }
    
    public static final class $assertion_content_native extends SubLStructNative implements IPrologifiable
    {
        public SubLObject $formula_data;
        public SubLObject $mt;
        public SubLObject $flags;
        public SubLObject $arguments;
        public SubLObject $plist;
        public static final SubLStructDeclNative structDecl;
        
        public $assertion_content_native() {
            this.$formula_data = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$flags = (SubLObject)CommonSymbols.NIL;
            this.$arguments = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$assertion_content_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$formula_data;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$flags;
        }
        
        public SubLObject getField5() {
            return this.$arguments;
        }
        
        public SubLObject getField6() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$formula_data = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$flags = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$arguments = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$assertion_content_native.class, 
            		assertions_low.$sym0$ASSERTION_CONTENT, assertions_low.$sym1$ASSERTION_CONTENT_P, assertions_low.$list3, assertions_low.$list4, new String[] { "$formula_data", "$mt", "$flags", "$arguments", "$plist" }, assertions_low.$list5, assertions_low.$list6, assertions_low.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }

		public Term toProlog() {
			// TODO Auto-generated method stub
			return PrologSync.toProlog("assertion_content",this);
		}
    }
    
    public static final class $assertion_content_p$UnaryFunction extends UnaryFunction
    {
        public $assertion_content_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASSERTION-CONTENT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return assertions_low.assertion_content_p(arg1);
        }
    }
}
