package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class interval_span extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.interval_span";
    public static final String myFingerPrint = "82aad11c0bab3c336c532662773a6b0b1d86464ee7e192386c2c8066741d3c8d";
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLSymbol $dtp_interval_span$;
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1685L)
    private static SubLSymbol $interval_span_table$;
    private static final SubLSymbol $sym0$INTERVAL_SPAN;
    private static final SubLSymbol $sym1$INTERVAL_SPAN_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_INTERVAL_SPAN;
    private static final SubLSymbol $sym7$INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$INT_SPAN_START;
    private static final SubLSymbol $sym10$_CSETF_INT_SPAN_START;
    private static final SubLSymbol $sym11$INT_SPAN_END;
    private static final SubLSymbol $sym12$_CSETF_INT_SPAN_END;
    private static final SubLSymbol $kw13$START;
    private static final SubLSymbol $kw14$END;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_INTERVAL_SPAN;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $sym19$VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD;
    private static final SubLString $str20$_INTERVAL_SPAN___S__S__;
    private static final SubLSymbol $sym21$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str22$_a_is_not_greater_than_or_equal_t;
    private static final SubLString $str23$Interval_Span_Test_Category;
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject interval_span_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_interval_span(v_object, stream, (SubLObject)interval_span.ZERO_INTEGER);
        return (SubLObject)interval_span.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject interval_span_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $interval_span_native.class) ? interval_span.T : interval_span.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject int_span_start(final SubLObject v_object) {
        assert interval_span.NIL != interval_span_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject int_span_end(final SubLObject v_object) {
        assert interval_span.NIL != interval_span_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject _csetf_int_span_start(final SubLObject v_object, final SubLObject value) {
        assert interval_span.NIL != interval_span_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject _csetf_int_span_end(final SubLObject v_object, final SubLObject value) {
        assert interval_span.NIL != interval_span_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject make_interval_span(SubLObject arglist) {
        if (arglist == interval_span.UNPROVIDED) {
            arglist = (SubLObject)interval_span.NIL;
        }
        final SubLObject v_new = (SubLObject)new $interval_span_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)interval_span.NIL, next = arglist; interval_span.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)interval_span.$kw13$START)) {
                _csetf_int_span_start(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)interval_span.$kw14$END)) {
                _csetf_int_span_end(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)interval_span.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject visit_defstruct_interval_span(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)interval_span.$kw16$BEGIN, (SubLObject)interval_span.$sym17$MAKE_INTERVAL_SPAN, (SubLObject)interval_span.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)interval_span.$kw18$SLOT, (SubLObject)interval_span.$kw13$START, int_span_start(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)interval_span.$kw18$SLOT, (SubLObject)interval_span.$kw14$END, int_span_end(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)interval_span.$kw14$END, (SubLObject)interval_span.$sym17$MAKE_INTERVAL_SPAN, (SubLObject)interval_span.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1392L)
    public static SubLObject visit_defstruct_object_interval_span_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_interval_span(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1504L)
    public static SubLObject print_interval_span(final SubLObject span, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)interval_span.$str20$_INTERVAL_SPAN___S__S__, int_span_start(span), int_span_end(span));
        return span;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 1801L)
    public static SubLObject lookup_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject start_spans = dictionary.dictionary_lookup(interval_span.$interval_span_table$.getGlobalValue(), start, (SubLObject)interval_span.NIL);
        return (SubLObject)((interval_span.NIL != dictionary.dictionary_p(start_spans)) ? dictionary.dictionary_lookup_without_values(start_spans, end, (SubLObject)interval_span.NIL) : interval_span.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 2033L)
    public static SubLObject new_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject span = make_interval_span((SubLObject)ConsesLow.list((SubLObject)interval_span.$kw13$START, start, (SubLObject)interval_span.$kw14$END, end));
        final SubLObject start_spans = dictionary.dictionary_lookup_without_values(interval_span.$interval_span_table$.getGlobalValue(), start, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)interval_span.EQL), (SubLObject)interval_span.UNPROVIDED));
        dictionary.dictionary_enter(start_spans, end, span);
        dictionary.dictionary_enter(interval_span.$interval_span_table$.getGlobalValue(), start, start_spans);
        return span;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 2384L)
    public static SubLObject get_interval_span(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert interval_span.NIL != subl_promotions.non_negative_integer_p(start) : start;
        assert interval_span.NIL != subl_promotions.non_negative_integer_p(end) : end;
        if (interval_span.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !end.numGE(start)) {
            Errors.error((SubLObject)interval_span.$str22$_a_is_not_greater_than_or_equal_t, end, start);
        }
        final SubLObject existing = lookup_interval_span(start, end);
        if (interval_span.NIL != existing) {
            return existing;
        }
        return new_interval_span(start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 2811L)
    public static SubLObject interval_span_start(final SubLObject v_interval_span) {
        assert interval_span.NIL != interval_span_p(v_interval_span) : v_interval_span;
        return int_span_start(v_interval_span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 3018L)
    public static SubLObject interval_span_end(final SubLObject v_interval_span) {
        assert interval_span.NIL != interval_span_p(v_interval_span) : v_interval_span;
        return int_span_end(v_interval_span);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 3219L)
    public static SubLObject interval_span_length(final SubLObject v_interval_span) {
        assert interval_span.NIL != interval_span_p(v_interval_span) : v_interval_span;
        return Numbers.subtract(int_span_end(v_interval_span), int_span_start(v_interval_span));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 3583L)
    public static SubLObject interval_span_G(final SubLObject span1, final SubLObject span2) {
        assert interval_span.NIL != interval_span_p(span1) : span1;
        assert interval_span.NIL != interval_span_p(span2) : span2;
        return Numbers.numG(interval_span_length(span1), interval_span_length(span2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 3826L)
    public static SubLObject interval_span_L(final SubLObject span1, final SubLObject span2) {
        assert interval_span.NIL != interval_span_p(span1) : span1;
        assert interval_span.NIL != interval_span_p(span2) : span2;
        return Numbers.numL(interval_span_length(span1), interval_span_length(span2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 4070L)
    public static SubLObject interval_span_precedesP(final SubLObject span1, final SubLObject span2) {
        assert interval_span.NIL != interval_span_p(span1) : span1;
        assert interval_span.NIL != interval_span_p(span2) : span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return (SubLObject)SubLObjectFactory.makeBoolean(start1.numL(start2) || (start1.numE(start2) && end1.numL(end2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 4547L)
    public static SubLObject interval_span_subsumesP(final SubLObject span1, final SubLObject span2) {
        assert interval_span.NIL != interval_span_p(span1) : span1;
        assert interval_span.NIL != interval_span_p(span2) : span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return (SubLObject)SubLObjectFactory.makeBoolean(start1.numLE(start2) && end1.numGE(end2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/interval-span.lisp", position = 4957L)
    public static SubLObject interval_span_overlapsP(final SubLObject span1, final SubLObject span2) {
        assert interval_span.NIL != interval_span_p(span1) : span1;
        assert interval_span.NIL != interval_span_p(span2) : span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return (SubLObject)SubLObjectFactory.makeBoolean((start2.numLE(end1) && start2.numGE(start1)) || (end2.numLE(end1) && end2.numGE(start1)) || (start1.numLE(end2) && start1.numGE(start2)) || (end1.numLE(end2) && end1.numGE(start2)));
    }
    
    public static SubLObject declare_interval_span_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_p", "INTERVAL-SPAN-P", 1, 0, false);
        new $interval_span_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "int_span_start", "INT-SPAN-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "int_span_end", "INT-SPAN-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "visit_defstruct_interval_span", "VISIT-DEFSTRUCT-INTERVAL-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "visit_defstruct_object_interval_span_method", "VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.interval_span", "interval_span_overlapsP", "INTERVAL-SPAN-OVERLAPS?", 2, 0, false);
        return (SubLObject)interval_span.NIL;
    }
    
    public static SubLObject init_interval_span_file() {
        interval_span.$dtp_interval_span$ = SubLFiles.defconstant("*DTP-INTERVAL-SPAN*", (SubLObject)interval_span.$sym0$INTERVAL_SPAN);
        interval_span.$interval_span_table$ = SubLFiles.deflexical("*INTERVAL-SPAN-TABLE*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)interval_span.EQL), (SubLObject)interval_span.UNPROVIDED));
        return (SubLObject)interval_span.NIL;
    }
    
    public static SubLObject setup_interval_span_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), interval_span.$dtp_interval_span$.getGlobalValue(), Symbols.symbol_function((SubLObject)interval_span.$sym7$INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)interval_span.$list8);
        Structures.def_csetf((SubLObject)interval_span.$sym9$INT_SPAN_START, (SubLObject)interval_span.$sym10$_CSETF_INT_SPAN_START);
        Structures.def_csetf((SubLObject)interval_span.$sym11$INT_SPAN_END, (SubLObject)interval_span.$sym12$_CSETF_INT_SPAN_END);
        Equality.identity((SubLObject)interval_span.$sym0$INTERVAL_SPAN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), interval_span.$dtp_interval_span$.getGlobalValue(), Symbols.symbol_function((SubLObject)interval_span.$sym19$VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD));
        sunit_external.define_test_category((SubLObject)interval_span.$str23$Interval_Span_Test_Category, (SubLObject)interval_span.UNPROVIDED);
        return (SubLObject)interval_span.NIL;
    }
    
    public void declareFunctions() {
        declare_interval_span_file();
    }
    
    public void initializeVariables() {
        init_interval_span_file();
    }
    
    public void runTopLevelForms() {
        setup_interval_span_file();
    }
    
    static {
        me = (SubLFile)new interval_span();
        interval_span.$dtp_interval_span$ = null;
        interval_span.$interval_span_table$ = null;
        $sym0$INTERVAL_SPAN = SubLObjectFactory.makeSymbol("INTERVAL-SPAN");
        $sym1$INTERVAL_SPAN_P = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INT-SPAN-START"), (SubLObject)SubLObjectFactory.makeSymbol("INT-SPAN-END"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INT-SPAN-START"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INT-SPAN-END"));
        $sym6$PRINT_INTERVAL_SPAN = SubLObjectFactory.makeSymbol("PRINT-INTERVAL-SPAN");
        $sym7$INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL-SPAN-P"));
        $sym9$INT_SPAN_START = SubLObjectFactory.makeSymbol("INT-SPAN-START");
        $sym10$_CSETF_INT_SPAN_START = SubLObjectFactory.makeSymbol("_CSETF-INT-SPAN-START");
        $sym11$INT_SPAN_END = SubLObjectFactory.makeSymbol("INT-SPAN-END");
        $sym12$_CSETF_INT_SPAN_END = SubLObjectFactory.makeSymbol("_CSETF-INT-SPAN-END");
        $kw13$START = SubLObjectFactory.makeKeyword("START");
        $kw14$END = SubLObjectFactory.makeKeyword("END");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_INTERVAL_SPAN = SubLObjectFactory.makeSymbol("MAKE-INTERVAL-SPAN");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $sym19$VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD");
        $str20$_INTERVAL_SPAN___S__S__ = SubLObjectFactory.makeString("<INTERVAL-SPAN (~S ~S)>");
        $sym21$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str22$_a_is_not_greater_than_or_equal_t = SubLObjectFactory.makeString("~a is not greater than or equal to ~a");
        $str23$Interval_Span_Test_Category = SubLObjectFactory.makeString("Interval Span Test Category");
    }
    
    public static final class $interval_span_native extends SubLStructNative
    {
        public SubLObject $start;
        public SubLObject $end;
        private static final SubLStructDeclNative structDecl;
        
        public $interval_span_native() {
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$interval_span_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$start;
        }
        
        public SubLObject getField3() {
            return this.$end;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$interval_span_native.class, interval_span.$sym0$INTERVAL_SPAN, interval_span.$sym1$INTERVAL_SPAN_P, interval_span.$list2, interval_span.$list3, new String[] { "$start", "$end" }, interval_span.$list4, interval_span.$list5, interval_span.$sym6$PRINT_INTERVAL_SPAN);
        }
    }
    
    public static final class $interval_span_p$UnaryFunction extends UnaryFunction
    {
        public $interval_span_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INTERVAL-SPAN-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return interval_span.interval_span_p(arg1);
        }
    }
}

/*

	Total time: 129 ms
	
*/