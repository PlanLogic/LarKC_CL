package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deduction_handles extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.deduction_handles";
    public static final String myFingerPrint = "e3494013c220626c570895576bf8e411fc6fd905caf261c043eb0351a2040670";
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 1234L)
    private static SubLSymbol $deduction_from_id$;
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 5892L)
    private static SubLSymbol $new_deduction_id_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLSymbol $dtp_deduction$;
    private static final SubLSymbol $sym0$_DEDUCTION_FROM_ID_;
    private static final SubLSymbol $sym1$DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION;
    private static final SubLList $list2;
    private static final SubLString $str3$mapping_Cyc_deductions;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$D_ID;
    private static final SubLSymbol $sym8$D_HANDLE;
    private static final SubLSymbol $sym9$DO_ID_INDEX;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$PROGRESS_MESSAGE;
    private static final SubLSymbol $kw12$ORDERED;
    private static final SubLSymbol $sym13$CLET;
    private static final SubLSymbol $sym14$RESOLVE_DEDUCTION_ID_VALUE_PAIR;
    private static final SubLSymbol $sym15$DO_DEDUCTIONS;
    private static final SubLString $str16$Iterate_over_all_HL_deduction_dat;
    private static final SubLSymbol $kw17$PAGED_OUT;
    private static final SubLSymbol $sym18$DO_DEDUCTIONS_TABLE;
    private static final SubLSymbol $sym19$NEW_DEDUCTIONS_TABLE_ENTRY_;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$CREATE_DEDUCTION_DUMP_ID_TABLE;
    private static final SubLSymbol $sym22$WITH_DEDUCTION_DUMP_ID_TABLE;
    private static final SubLSymbol $sym23$DEDUCTION_COUNT;
    private static final SubLString $str24$Return_the_total_number_of_deduct;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$_NEW_DEDUCTION_ID_THRESHOLD_;
    private static final SubLSymbol $kw27$DENSE;
    private static final SubLSymbol $kw28$ALL;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$ITERATOR;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$DO_ITERATOR;
    private static final SubLString $str33$Determining_maximum_deduction_ID;
    private static final SubLSymbol $sym34$STRINGP;
    private static final SubLSymbol $kw35$SKIP;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$THRESHOLD;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
    private static final SubLSymbol $sym41$START;
    private static final SubLSymbol $sym42$DO_KB_SUID_TABLE_STARTING_AT_ID;
    private static final SubLSymbol $sym43$DEDUCTION;
    private static final SubLSymbol $sym44$DEDUCTION_P;
    private static final SubLInteger $int45$144;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$PRINT_DEDUCTION;
    private static final SubLSymbol $sym51$DEDUCTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$D_ID;
    private static final SubLSymbol $sym54$_CSETF_D_ID;
    private static final SubLSymbol $kw55$ID;
    private static final SubLString $str56$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw57$BEGIN;
    private static final SubLSymbol $sym58$MAKE_DEDUCTION;
    private static final SubLSymbol $kw59$SLOT;
    private static final SubLSymbol $kw60$END;
    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_METHOD;
    private static final SubLString $str62$_The_CFASL_invalid_deduction_;
    private static final SubLInteger $int63$786;
    private static final SubLSymbol $sym64$SXHASH_DEDUCTION_METHOD;
    private static final SubLList $list65;
    private static final SubLString $str66$Return_T_iff_OBJECT_is_a_CycL_ded;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$VALID_DEDUCTION;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$VALID_SUPPORT_;
    private static final SubLSymbol $sym71$INTEGERP;
    private static final SubLString $str72$Freeing_deductions;
    private static final SubLSymbol $sym73$DEDUCTION_ID;
    private static final SubLList $list74;
    private static final SubLString $str75$Return_the_id_of_DEDUCTION_;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$FIND_DEDUCTION_BY_ID;
    private static final SubLString $str78$Return_the_deduction_with_ID__or_;
    private static final SubLList $list79;
    private static final SubLList $list80;
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 1569L)
    public static SubLObject new_deductions_iterator() {
        return iteration.new_indirect_iterator(id_index.new_id_index_iterator(deduction_handles.$deduction_from_id$.getGlobalValue()), (SubLObject)deduction_handles.$sym1$DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION, (SubLObject)deduction_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 1932L)
    public static SubLObject do_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (SubLObject)(current.isCons() ? current.first() : deduction_handles.$str3$mapping_Cyc_deductions);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)deduction_handles.$list2);
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deduction_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deduction_handles.NIL;
        SubLObject current_$1 = (SubLObject)deduction_handles.NIL;
        while (deduction_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list2);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list2);
            if (deduction_handles.NIL == conses_high.member(current_$1, (SubLObject)deduction_handles.$list4, (SubLObject)deduction_handles.UNPROVIDED, (SubLObject)deduction_handles.UNPROVIDED)) {
                bad = (SubLObject)deduction_handles.T;
            }
            if (current_$1 == deduction_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deduction_handles.NIL != bad && deduction_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deduction_handles.$list2);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((deduction_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : deduction_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject d_id = (SubLObject)deduction_handles.$sym7$D_ID;
        final SubLObject d_handle = (SubLObject)deduction_handles.$sym8$D_HANDLE;
        return (SubLObject)ConsesLow.list((SubLObject)deduction_handles.$sym9$DO_ID_INDEX, (SubLObject)ConsesLow.list(new SubLObject[] { d_id, d_handle, deduction_handles.$list10, deduction_handles.$kw11$PROGRESS_MESSAGE, progress_message, deduction_handles.$kw12$ORDERED, deduction_handles.T, deduction_handles.$kw6$DONE, done }), (SubLObject)ConsesLow.listS((SubLObject)deduction_handles.$sym13$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)deduction_handles.$sym14$RESOLVE_DEDUCTION_ID_VALUE_PAIR, d_id, d_handle))), ConsesLow.append(body, (SubLObject)deduction_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 2772L)
    public static SubLObject resolve_deduction_id_value_pair(final SubLObject id, SubLObject deduction) {
        if (deduction_handles.$kw17$PAGED_OUT == deduction) {
            deduction = find_deduction_by_id(id);
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 2969L)
    public static SubLObject do_deductions_table() {
        return deduction_handles.$deduction_from_id$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 3071L)
    public static SubLObject new_new_deductions_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(id_index.new_id_index_ordered_iterator(do_deductions_table()), (SubLObject)deduction_handles.$sym19$NEW_DEDUCTIONS_TABLE_ENTRY_, (SubLObject)ConsesLow.list(new_deduction_id_threshold())), (SubLObject)deduction_handles.$sym1$DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION, (SubLObject)deduction_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 3375L)
    public static SubLObject new_deductions_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = (SubLObject)deduction_handles.NIL;
        SubLObject payload = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)deduction_handles.$list20);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)deduction_handles.$list20);
        payload = current.first();
        current = current.rest();
        if (deduction_handles.NIL == current) {
            return Numbers.numGE(id, id_threshold);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)deduction_handles.$list20);
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 3545L)
    public static SubLObject deductions_table_tuple_to_deduction(final SubLObject tuple) {
        SubLObject id = (SubLObject)deduction_handles.NIL;
        SubLObject payload = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)deduction_handles.$list20);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)deduction_handles.$list20);
        payload = current.first();
        current = current.rest();
        if (deduction_handles.NIL == current) {
            return find_deduction_by_id(id);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)deduction_handles.$list20);
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 3715L)
    public static SubLObject setup_deduction_table(final SubLObject size, final SubLObject exactP) {
        if (deduction_handles.NIL != deduction_handles.$deduction_from_id$.getGlobalValue()) {
            return (SubLObject)deduction_handles.NIL;
        }
        deduction_handles.$deduction_from_id$.setGlobalValue(id_index.new_id_index(size, (SubLObject)deduction_handles.ZERO_INTEGER));
        return (SubLObject)deduction_handles.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 3933L)
    public static SubLObject finalize_deductions(SubLObject max_deduction_id) {
        if (max_deduction_id == deduction_handles.UNPROVIDED) {
            max_deduction_id = (SubLObject)deduction_handles.NIL;
        }
        set_next_deduction_id(max_deduction_id);
        set_new_deduction_id_threshold(next_deduction_id());
        if (deduction_handles.NIL == max_deduction_id) {
            optimize_deduction_table();
            deduction_manager.optimize_deduction_content_table(new_deduction_id_threshold());
        }
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 4353L)
    public static SubLObject optimize_deduction_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index(deduction_handles.$deduction_from_id$.getGlobalValue(), (SubLObject)deduction_handles.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 4476L)
    public static SubLObject clear_deduction_table() {
        return id_index.clear_id_index(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 4564L)
    public static SubLObject create_deduction_dump_id_table() {
        return id_index.new_indirect_compact_id_index(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 4721L)
    public static SubLObject new_dense_deduction_id_index() {
        return id_index.clone_id_index(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 4922L)
    public static SubLObject deduction_count() {
        if (deduction_handles.NIL == deduction_handles.$deduction_from_id$.getGlobalValue()) {
            return (SubLObject)deduction_handles.ZERO_INTEGER;
        }
        return id_index.id_index_count(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 5292L)
    public static SubLObject lookup_deduction(final SubLObject id) {
        final SubLObject deduction = id_index.id_index_lookup(deduction_handles.$deduction_from_id$.getGlobalValue(), id, (SubLObject)deduction_handles.UNPROVIDED);
        if (deduction_handles.NIL == deduction) {
            return (SubLObject)deduction_handles.NIL;
        }
        if (deduction_handles.$kw17$PAGED_OUT == deduction) {
            return make_deduction_shell(id);
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 5804L)
    public static SubLObject next_deduction_id() {
        return id_index.id_index_next_id(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6030L)
    public static SubLObject new_deduction_id_threshold() {
        return (deduction_handles.NIL != deduction_handles.$new_deduction_id_threshold$.getGlobalValue()) ? deduction_handles.$new_deduction_id_threshold$.getGlobalValue() : deduction_manager.get_file_backed_deduction_id_threshold();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6224L)
    public static SubLObject set_new_deduction_id_threshold(final SubLObject id) {
        deduction_handles.$new_deduction_id_threshold$.setGlobalValue(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6331L)
    public static SubLObject old_deduction_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)deduction_handles.ZERO_INTEGER), id_index.id_index_old_and_new_object_counts(do_deductions_table(), new_deduction_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6530L)
    public static SubLObject new_deduction_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)deduction_handles.ONE_INTEGER), id_index.id_index_old_and_new_object_counts(do_deductions_table(), new_deduction_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6729L)
    public static SubLObject missing_old_deduction_ids() {
        final SubLObject id_limit = new_deduction_id_threshold();
        return id_index.id_index_missing_ids(deduction_handles.$deduction_from_id$.getGlobalValue(), (SubLObject)deduction_handles.$kw27$DENSE, id_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 6980L)
    public static SubLObject missing_deduction_id_set() {
        return set_utilities.construct_set_from_list(id_index.id_index_missing_ids(deduction_handles.$deduction_from_id$.getGlobalValue(), (SubLObject)deduction_handles.$kw28$ALL, (SubLObject)deduction_handles.UNPROVIDED), (SubLObject)deduction_handles.EQL, (SubLObject)deduction_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 7173L)
    public static SubLObject deleted_deduction_id_iterator() {
        return iteration.new_list_iterator(id_index.id_index_missing_ids(do_deductions_table(), (SubLObject)deduction_handles.$kw28$ALL, (SubLObject)deduction_handles.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 7352L)
    public static SubLObject do_deleted_deduction_ids(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list29);
        id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deduction_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deduction_handles.NIL;
        SubLObject current_$2 = (SubLObject)deduction_handles.NIL;
        while (deduction_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list29);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list29);
            if (deduction_handles.NIL == conses_high.member(current_$2, (SubLObject)deduction_handles.$list4, (SubLObject)deduction_handles.UNPROVIDED, (SubLObject)deduction_handles.UNPROVIDED)) {
                bad = (SubLObject)deduction_handles.T;
            }
            if (current_$2 == deduction_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deduction_handles.NIL != bad && deduction_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deduction_handles.$list29);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((deduction_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : deduction_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)deduction_handles.$sym30$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)deduction_handles.$sym13$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(iterator, (SubLObject)deduction_handles.$list31)), (SubLObject)ConsesLow.listS((SubLObject)deduction_handles.$sym32$DO_ITERATOR, (SubLObject)ConsesLow.list(id, iterator, (SubLObject)deduction_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)deduction_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 7593L)
    public static SubLObject has_new_deductionsP() {
        return Numbers.numG(next_deduction_id(), new_deduction_id_threshold());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 7694L)
    public static SubLObject set_next_deduction_id(SubLObject max_deduction_id) {
        if (max_deduction_id == deduction_handles.UNPROVIDED) {
            max_deduction_id = (SubLObject)deduction_handles.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = (SubLObject)deduction_handles.MINUS_ONE_INTEGER;
        if (deduction_handles.NIL != max_deduction_id) {
            max = max_deduction_id;
        }
        else {
            final SubLObject idx = do_deductions_table();
            final SubLObject mess = (SubLObject)deduction_handles.$str33$Determining_maximum_deduction_ID;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)deduction_handles.ZERO_INTEGER;
            assert deduction_handles.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)deduction_handles.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)deduction_handles.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)deduction_handles.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$3 = idx;
                    if (deduction_handles.NIL == id_index.id_index_objects_empty_p(idx_$3, (SubLObject)deduction_handles.$kw35$SKIP)) {
                        final SubLObject idx_$4 = idx_$3;
                        if (deduction_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$4, (SubLObject)deduction_handles.$kw35$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$4);
                            final SubLObject backwardP_var = (SubLObject)deduction_handles.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)deduction_handles.NIL, v_iteration = (SubLObject)deduction_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)deduction_handles.ONE_INTEGER)) {
                                d_id = ((deduction_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)deduction_handles.ONE_INTEGER) : v_iteration);
                                d_handle = Vectors.aref(vector_var, d_id);
                                if (deduction_handles.NIL == id_index.id_index_tombstone_p(d_handle) || deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) {
                                    if (deduction_handles.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                        d_handle = (SubLObject)deduction_handles.$kw35$SKIP;
                                    }
                                    deduction = resolve_deduction_id_value_pair(d_id, d_handle);
                                    max = Numbers.max(max, deduction_id(deduction));
                                    sofar = Numbers.add(sofar, (SubLObject)deduction_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$5 = idx_$3;
                        if (deduction_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$5) || deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$5);
                            SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$5);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$5);
                            final SubLObject v_default = (SubLObject)((deduction_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) ? deduction_handles.NIL : deduction_handles.$kw35$SKIP);
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                if (deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP) || deduction_handles.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                    final SubLObject deduction2 = resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    max = Numbers.max(max, deduction_id(deduction2));
                                    sofar = Numbers.add(sofar, (SubLObject)deduction_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                d_id2 = Numbers.add(d_id2, (SubLObject)deduction_handles.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)deduction_handles.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
        final SubLObject next_id = Numbers.add(max, (SubLObject)deduction_handles.ONE_INTEGER);
        id_index.set_id_index_next_id(deduction_handles.$deduction_from_id$.getGlobalValue(), next_id);
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 8082L)
    public static SubLObject register_deduction_id(final SubLObject deduction, final SubLObject id) {
        reset_deduction_id(deduction, id);
        id_index.id_index_enter(deduction_handles.$deduction_from_id$.getGlobalValue(), id, deduction);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 8298L)
    public static SubLObject deregister_deduction_id(final SubLObject id) {
        return id_index.id_index_remove(deduction_handles.$deduction_from_id$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 8446L)
    public static SubLObject make_deduction_id() {
        return id_index.id_index_reserve(deduction_handles.$deduction_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 8579L)
    public static SubLObject do_old_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list36);
        deduction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deduction_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deduction_handles.NIL;
        SubLObject current_$7 = (SubLObject)deduction_handles.NIL;
        while (deduction_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list36);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list36);
            if (deduction_handles.NIL == conses_high.member(current_$7, (SubLObject)deduction_handles.$list37, (SubLObject)deduction_handles.UNPROVIDED, (SubLObject)deduction_handles.UNPROVIDED)) {
                bad = (SubLObject)deduction_handles.T;
            }
            if (current_$7 == deduction_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deduction_handles.NIL != bad && deduction_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deduction_handles.$list36);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw11$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((deduction_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : deduction_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((deduction_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : deduction_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject threshold = (SubLObject)deduction_handles.$sym38$THRESHOLD;
        return (SubLObject)ConsesLow.list((SubLObject)deduction_handles.$sym13$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(threshold, (SubLObject)deduction_handles.$list39)), (SubLObject)ConsesLow.listS((SubLObject)deduction_handles.$sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, (SubLObject)ConsesLow.list(deduction, (SubLObject)deduction_handles.$list10, threshold, (SubLObject)deduction_handles.$kw11$PROGRESS_MESSAGE, progress_message, (SubLObject)deduction_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)deduction_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 9472L)
    public static SubLObject do_new_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = (SubLObject)deduction_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)deduction_handles.$list36);
        deduction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)deduction_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)deduction_handles.NIL;
        SubLObject current_$8 = (SubLObject)deduction_handles.NIL;
        while (deduction_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list36);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)deduction_handles.$list36);
            if (deduction_handles.NIL == conses_high.member(current_$8, (SubLObject)deduction_handles.$list37, (SubLObject)deduction_handles.UNPROVIDED, (SubLObject)deduction_handles.UNPROVIDED)) {
                bad = (SubLObject)deduction_handles.T;
            }
            if (current_$8 == deduction_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (deduction_handles.NIL != bad && deduction_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)deduction_handles.$list36);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw11$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((deduction_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : deduction_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)deduction_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((deduction_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : deduction_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject start = (SubLObject)deduction_handles.$sym41$START;
        return (SubLObject)ConsesLow.list((SubLObject)deduction_handles.$sym13$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start, (SubLObject)deduction_handles.$list39)), (SubLObject)ConsesLow.listS((SubLObject)deduction_handles.$sym42$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(deduction, (SubLObject)deduction_handles.$list10, start, (SubLObject)deduction_handles.$kw11$PROGRESS_MESSAGE, progress_message, (SubLObject)deduction_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)deduction_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10260L)
    public static SubLObject get_file_backed_deduction_internal_id_threshold() {
        if (deduction_handles.NIL != Filesys.directory_p(misc_utilities.generic_caches_directory())) {
            return dumper.get_exclusive_deduction_internal_id_limit_for_kb(misc_utilities.generic_caches_directory());
        }
        return (SubLObject)deduction_handles.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject deduction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_deduction(v_object, stream, (SubLObject)deduction_handles.ZERO_INTEGER);
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject deduction_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $deduction_native.class) ? deduction_handles.T : deduction_handles.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject d_id(final SubLObject v_object) {
        assert deduction_handles.NIL != deduction_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject _csetf_d_id(final SubLObject v_object, final SubLObject value) {
        assert deduction_handles.NIL != deduction_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject make_deduction(SubLObject arglist) {
        if (arglist == deduction_handles.UNPROVIDED) {
            arglist = (SubLObject)deduction_handles.NIL;
        }
        final SubLObject v_new = (SubLObject)new $deduction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)deduction_handles.NIL, next = arglist; deduction_handles.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)deduction_handles.$kw55$ID)) {
                _csetf_d_id(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)deduction_handles.$str56$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject visit_defstruct_deduction(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)deduction_handles.$kw57$BEGIN, (SubLObject)deduction_handles.$sym58$MAKE_DEDUCTION, (SubLObject)deduction_handles.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)deduction_handles.$kw59$SLOT, (SubLObject)deduction_handles.$kw55$ID, d_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)deduction_handles.$kw60$END, (SubLObject)deduction_handles.$sym58$MAKE_DEDUCTION, (SubLObject)deduction_handles.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 10881L)
    public static SubLObject visit_defstruct_object_deduction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deduction(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 11071L)
    public static SubLObject print_deduction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (deduction_handles.NIL != valid_deduction(v_object, (SubLObject)deduction_handles.UNPROVIDED)) {
            if (deduction_handles.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
                print_high.print_not_readable(v_object, stream);
            }
            else {
                print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)deduction_handles.T, (SubLObject)deduction_handles.T);
                print_high.princ(deduction_id(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)deduction_handles.NIL, (SubLObject)deduction_handles.NIL);
            }
        }
        else if (v_object.eql(cfasl_kb_methods.cfasl_invalid_deduction())) {
            PrintLow.format(stream, (SubLObject)deduction_handles.$str62$_The_CFASL_invalid_deduction_);
        }
        else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 11467L)
    public static SubLObject sxhash_deduction_method(final SubLObject v_object) {
        final SubLObject id = d_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return (SubLObject)deduction_handles.$int63$786;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 11595L)
    public static SubLObject get_deduction() {
        SubLObject deduction = (SubLObject)deduction_handles.NIL;
        deduction = make_deduction((SubLObject)deduction_handles.UNPROVIDED);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 11823L)
    public static SubLObject free_deduction(final SubLObject deduction) {
        _csetf_d_id(deduction, (SubLObject)deduction_handles.NIL);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 12116L)
    public static SubLObject valid_deduction_handleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(deduction_handles.NIL != deduction_p(v_object) && deduction_handles.NIL != deduction_handle_validP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 12353L)
    public static SubLObject valid_deduction(final SubLObject deduction, SubLObject robustP) {
        if (robustP == deduction_handles.UNPROVIDED) {
            robustP = (SubLObject)deduction_handles.NIL;
        }
        return valid_deductionP(deduction, robustP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 12498L)
    public static SubLObject valid_deductionP(final SubLObject deduction, SubLObject robustP) {
        if (robustP == deduction_handles.UNPROVIDED) {
            robustP = (SubLObject)deduction_handles.NIL;
        }
        if (deduction_handles.NIL == valid_deduction_handleP(deduction)) {
            return (SubLObject)deduction_handles.NIL;
        }
        if (deduction_handles.NIL == robustP) {
            return (SubLObject)deduction_handles.T;
        }
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        return (SubLObject)SubLObjectFactory.makeBoolean(deduction_handles.NIL != arguments.valid_supportP(deductions_high.deduction_supported_object(deduction), (SubLObject)deduction_handles.UNPROVIDED) && supports.isCons() && deduction_handles.NIL != list_utilities.every_in_list((SubLObject)deduction_handles.$sym70$VALID_SUPPORT_, supports, (SubLObject)deduction_handles.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 12934L)
    public static SubLObject mark_available_deductions(final SubLObject max_id, SubLObject deleted_set) {
        if (deleted_set == deduction_handles.UNPROVIDED) {
            deleted_set = (SubLObject)deduction_handles.NIL;
        }
        id_index.fill_id_index_dense_space(deduction_handles.$deduction_from_id$.getGlobalValue(), (SubLObject)deduction_handles.$kw17$PAGED_OUT, max_id);
        if (deduction_handles.NIL != set.set_p(deleted_set)) {
            final SubLObject set_contents_var = set.do_set_internal(deleted_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deleted_id;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)deduction_handles.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); deduction_handles.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deleted_id = set_contents.do_set_contents_next(basis_object, state);
                if (deduction_handles.NIL != set_contents.do_set_contents_element_validP(state, deleted_id)) {
                    id_index.id_index_remove(deduction_handles.$deduction_from_id$.getGlobalValue(), deleted_id);
                }
            }
        }
        return max_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 13284L)
    public static SubLObject mark_deduction_available(final SubLObject id) {
        return id_index.id_index_enter(deduction_handles.$deduction_from_id$.getGlobalValue(), id, (SubLObject)deduction_handles.$kw17$PAGED_OUT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 13393L)
    public static SubLObject make_deduction_shell(SubLObject id) {
        if (id == deduction_handles.UNPROVIDED) {
            id = (SubLObject)deduction_handles.NIL;
        }
        if (deduction_handles.NIL == id) {
            id = make_deduction_id();
        }
        assert deduction_handles.NIL != Types.integerp(id) : id;
        final SubLObject deduction = get_deduction();
        register_deduction_id(deduction, id);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 13706L)
    public static SubLObject create_sample_invalid_deduction() {
        return get_deduction();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 13843L)
    public static SubLObject free_all_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_deductions_table();
        final SubLObject mess = (SubLObject)deduction_handles.$str72$Freeing_deductions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)deduction_handles.ZERO_INTEGER;
        assert deduction_handles.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)deduction_handles.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)deduction_handles.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)deduction_handles.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$9 = idx;
                if (deduction_handles.NIL == id_index.id_index_objects_empty_p(idx_$9, (SubLObject)deduction_handles.$kw35$SKIP)) {
                    final SubLObject idx_$10 = idx_$9;
                    if (deduction_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)deduction_handles.$kw35$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                        final SubLObject backwardP_var = (SubLObject)deduction_handles.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)deduction_handles.NIL, v_iteration = (SubLObject)deduction_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)deduction_handles.ONE_INTEGER)) {
                            d_id = ((deduction_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)deduction_handles.ONE_INTEGER) : v_iteration);
                            d_handle = Vectors.aref(vector_var, d_id);
                            if (deduction_handles.NIL == id_index.id_index_tombstone_p(d_handle) || deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) {
                                if (deduction_handles.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                    d_handle = (SubLObject)deduction_handles.$kw35$SKIP;
                                }
                                deduction = resolve_deduction_id_value_pair(d_id, d_handle);
                                free_deduction(deduction);
                                sofar = Numbers.add(sofar, (SubLObject)deduction_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$11 = idx_$9;
                    if (deduction_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                        SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$11);
                        final SubLObject v_default = (SubLObject)((deduction_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP)) ? deduction_handles.NIL : deduction_handles.$kw35$SKIP);
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                            if (deduction_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)deduction_handles.$kw35$SKIP) || deduction_handles.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                final SubLObject deduction2 = resolve_deduction_id_value_pair(d_id2, d_handle2);
                                free_deduction(deduction2);
                                sofar = Numbers.add(sofar, (SubLObject)deduction_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            d_id2 = Numbers.add(d_id2, (SubLObject)deduction_handles.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)deduction_handles.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_deduction_table();
        deduction_manager.clear_deduction_content_table();
        return (SubLObject)deduction_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 14139L)
    public static SubLObject deduction_id(final SubLObject deduction) {
        enforceType(deduction, deduction_handles.$sym44$DEDUCTION_P);
        return d_id(deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 14325L)
    public static SubLObject reset_deduction_id(final SubLObject deduction, final SubLObject new_id) {
        _csetf_d_id(deduction, new_id);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 14651L)
    public static SubLObject deduction_handle_validP(final SubLObject deduction) {
        return Types.integerp(d_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/deduction-handles.lisp", position = 14993L)
    public static SubLObject find_deduction_by_id(final SubLObject id) {
        enforceType(id, deduction_handles.$sym71$INTEGERP);
        return lookup_deduction(id);
    }
    
    public static SubLObject declare_deduction_handles_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_deductions_iterator", "NEW-DEDUCTIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deduction_handles", "do_deductions", "DO-DEDUCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "resolve_deduction_id_value_pair", "RESOLVE-DEDUCTION-ID-VALUE-PAIR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "do_deductions_table", "DO-DEDUCTIONS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_new_deductions_iterator", "NEW-NEW-DEDUCTIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_deductions_table_entryP", "NEW-DEDUCTIONS-TABLE-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deductions_table_tuple_to_deduction", "DEDUCTIONS-TABLE-TUPLE-TO-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "setup_deduction_table", "SETUP-DEDUCTION-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "finalize_deductions", "FINALIZE-DEDUCTIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "optimize_deduction_table", "OPTIMIZE-DEDUCTION-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "clear_deduction_table", "CLEAR-DEDUCTION-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "create_deduction_dump_id_table", "CREATE-DEDUCTION-DUMP-ID-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_dense_deduction_id_index", "NEW-DENSE-DEDUCTION-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deduction_count", "DEDUCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "lookup_deduction", "LOOKUP-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "next_deduction_id", "NEXT-DEDUCTION-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_deduction_id_threshold", "NEW-DEDUCTION-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "set_new_deduction_id_threshold", "SET-NEW-DEDUCTION-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "old_deduction_count", "OLD-DEDUCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "new_deduction_count", "NEW-DEDUCTION-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "missing_old_deduction_ids", "MISSING-OLD-DEDUCTION-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "missing_deduction_id_set", "MISSING-DEDUCTION-ID-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deleted_deduction_id_iterator", "DELETED-DEDUCTION-ID-ITERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deduction_handles", "do_deleted_deduction_ids", "DO-DELETED-DEDUCTION-IDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "has_new_deductionsP", "HAS-NEW-DEDUCTIONS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "set_next_deduction_id", "SET-NEXT-DEDUCTION-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "register_deduction_id", "REGISTER-DEDUCTION-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deregister_deduction_id", "DEREGISTER-DEDUCTION-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "make_deduction_id", "MAKE-DEDUCTION-ID", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deduction_handles", "do_old_deductions", "DO-OLD-DEDUCTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.deduction_handles", "do_new_deductions", "DO-NEW-DEDUCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "get_file_backed_deduction_internal_id_threshold", "GET-FILE-BACKED-DEDUCTION-INTERNAL-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deduction_print_function_trampoline", "DEDUCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deduction_p", "DEDUCTION-P", 1, 0, false);
        new $deduction_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "d_id", "D-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "_csetf_d_id", "_CSETF-D-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "make_deduction", "MAKE-DEDUCTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "visit_defstruct_deduction", "VISIT-DEFSTRUCT-DEDUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "visit_defstruct_object_deduction_method", "VISIT-DEFSTRUCT-OBJECT-DEDUCTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "print_deduction", "PRINT-DEDUCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "sxhash_deduction_method", "SXHASH-DEDUCTION-METHOD", 1, 0, false);
        new $sxhash_deduction_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "get_deduction", "GET-DEDUCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "free_deduction", "FREE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "valid_deduction_handleP", "VALID-DEDUCTION-HANDLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "valid_deduction", "VALID-DEDUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "valid_deductionP", "VALID-DEDUCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "mark_available_deductions", "MARK-AVAILABLE-DEDUCTIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "mark_deduction_available", "MARK-DEDUCTION-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "make_deduction_shell", "MAKE-DEDUCTION-SHELL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "create_sample_invalid_deduction", "CREATE-SAMPLE-INVALID-DEDUCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "free_all_deductions", "FREE-ALL-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deduction_id", "DEDUCTION-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "reset_deduction_id", "RESET-DEDUCTION-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "deduction_handle_validP", "DEDUCTION-HANDLE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.deduction_handles", "find_deduction_by_id", "FIND-DEDUCTION-BY-ID", 1, 0, false);
        return (SubLObject)deduction_handles.NIL;
    }
    
    public static SubLObject init_deduction_handles_file() {
        deduction_handles.$deduction_from_id$ = SubLFiles.deflexical("*DEDUCTION-FROM-ID*", (SubLObject)((deduction_handles.NIL != Symbols.boundp((SubLObject)deduction_handles.$sym0$_DEDUCTION_FROM_ID_)) ? deduction_handles.$deduction_from_id$.getGlobalValue() : deduction_handles.NIL));
        deduction_handles.$new_deduction_id_threshold$ = SubLFiles.deflexical("*NEW-DEDUCTION-ID-THRESHOLD*", (SubLObject)((deduction_handles.NIL != Symbols.boundp((SubLObject)deduction_handles.$sym26$_NEW_DEDUCTION_ID_THRESHOLD_)) ? deduction_handles.$new_deduction_id_threshold$.getGlobalValue() : deduction_handles.NIL));
        deduction_handles.$dtp_deduction$ = SubLFiles.defconstant("*DTP-DEDUCTION*", (SubLObject)deduction_handles.$sym43$DEDUCTION);
        return (SubLObject)deduction_handles.NIL;
    }
    
    public static SubLObject setup_deduction_handles_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)deduction_handles.$sym0$_DEDUCTION_FROM_ID_);
        utilities_macros.register_cyc_api_macro((SubLObject)deduction_handles.$sym15$DO_DEDUCTIONS, (SubLObject)deduction_handles.$list2, (SubLObject)deduction_handles.$str16$Iterate_over_all_HL_deduction_dat);
        access_macros.register_macro_helper((SubLObject)deduction_handles.$sym14$RESOLVE_DEDUCTION_ID_VALUE_PAIR, (SubLObject)deduction_handles.$sym15$DO_DEDUCTIONS);
        access_macros.register_macro_helper((SubLObject)deduction_handles.$sym18$DO_DEDUCTIONS_TABLE, (SubLObject)deduction_handles.$sym15$DO_DEDUCTIONS);
        utilities_macros.note_funcall_helper_function((SubLObject)deduction_handles.$sym19$NEW_DEDUCTIONS_TABLE_ENTRY_);
        utilities_macros.note_funcall_helper_function((SubLObject)deduction_handles.$sym1$DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION);
        access_macros.register_macro_helper((SubLObject)deduction_handles.$sym21$CREATE_DEDUCTION_DUMP_ID_TABLE, (SubLObject)deduction_handles.$sym22$WITH_DEDUCTION_DUMP_ID_TABLE);
        utilities_macros.register_cyc_api_function((SubLObject)deduction_handles.$sym23$DEDUCTION_COUNT, (SubLObject)deduction_handles.NIL, (SubLObject)deduction_handles.$str24$Return_the_total_number_of_deduct, (SubLObject)deduction_handles.NIL, (SubLObject)deduction_handles.$list25);
        subl_macro_promotions.declare_defglobal((SubLObject)deduction_handles.$sym26$_NEW_DEDUCTION_ID_THRESHOLD_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)deduction_handles.$sym51$DEDUCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)deduction_handles.$list52);
        Structures.def_csetf((SubLObject)deduction_handles.$sym53$D_ID, (SubLObject)deduction_handles.$sym54$_CSETF_D_ID);
        Equality.identity((SubLObject)deduction_handles.$sym43$DEDUCTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)deduction_handles.$sym61$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)deduction_handles.$sym64$SXHASH_DEDUCTION_METHOD));
        utilities_macros.register_cyc_api_function((SubLObject)deduction_handles.$sym44$DEDUCTION_P, (SubLObject)deduction_handles.$list65, (SubLObject)deduction_handles.$str66$Return_T_iff_OBJECT_is_a_CycL_ded, (SubLObject)deduction_handles.NIL, (SubLObject)deduction_handles.$list67);
        access_macros.define_obsolete_register((SubLObject)deduction_handles.$sym68$VALID_DEDUCTION, (SubLObject)deduction_handles.$list69);
        utilities_macros.register_cyc_api_function((SubLObject)deduction_handles.$sym73$DEDUCTION_ID, (SubLObject)deduction_handles.$list74, (SubLObject)deduction_handles.$str75$Return_the_id_of_DEDUCTION_, (SubLObject)deduction_handles.$list76, (SubLObject)deduction_handles.$list25);
        utilities_macros.register_cyc_api_function((SubLObject)deduction_handles.$sym77$FIND_DEDUCTION_BY_ID, (SubLObject)deduction_handles.$list46, (SubLObject)deduction_handles.$str78$Return_the_deduction_with_ID__or_, (SubLObject)deduction_handles.$list79, (SubLObject)deduction_handles.$list80);
        return (SubLObject)deduction_handles.NIL;
    }
    
    public void declareFunctions() {
        declare_deduction_handles_file();
    }
    
    public void initializeVariables() {
        init_deduction_handles_file();
    }
    
    public void runTopLevelForms() {
        setup_deduction_handles_file();
    }
    
    static {
        me = (SubLFile)new deduction_handles();
        deduction_handles.$deduction_from_id$ = null;
        deduction_handles.$new_deduction_id_threshold$ = null;
        deduction_handles.$dtp_deduction$ = null;
        $sym0$_DEDUCTION_FROM_ID_ = SubLObjectFactory.makeSymbol("*DEDUCTION-FROM-ID*");
        $sym1$DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION = SubLObjectFactory.makeSymbol("DEDUCTIONS-TABLE-TUPLE-TO-DEDUCTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc deductions")), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str3$mapping_Cyc_deductions = SubLObjectFactory.makeString("mapping Cyc deductions");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$D_ID = SubLObjectFactory.makeUninternedSymbol("D-ID");
        $sym8$D_HANDLE = SubLObjectFactory.makeUninternedSymbol("D-HANDLE");
        $sym9$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DEDUCTIONS-TABLE"));
        $kw11$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw12$ORDERED = SubLObjectFactory.makeKeyword("ORDERED");
        $sym13$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym14$RESOLVE_DEDUCTION_ID_VALUE_PAIR = SubLObjectFactory.makeSymbol("RESOLVE-DEDUCTION-ID-VALUE-PAIR");
        $sym15$DO_DEDUCTIONS = SubLObjectFactory.makeSymbol("DO-DEDUCTIONS");
        $str16$Iterate_over_all_HL_deduction_dat = SubLObjectFactory.makeString("Iterate over all HL deduction datastructures, executing BODY within the scope of VAR.\n   VAR is a deduction.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
        $kw17$PAGED_OUT = SubLObjectFactory.makeKeyword("PAGED-OUT");
        $sym18$DO_DEDUCTIONS_TABLE = SubLObjectFactory.makeSymbol("DO-DEDUCTIONS-TABLE");
        $sym19$NEW_DEDUCTIONS_TABLE_ENTRY_ = SubLObjectFactory.makeSymbol("NEW-DEDUCTIONS-TABLE-ENTRY?");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $sym21$CREATE_DEDUCTION_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE");
        $sym22$WITH_DEDUCTION_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("WITH-DEDUCTION-DUMP-ID-TABLE");
        $sym23$DEDUCTION_COUNT = SubLObjectFactory.makeSymbol("DEDUCTION-COUNT");
        $str24$Return_the_total_number_of_deduct = SubLObjectFactory.makeString("Return the total number of deductions.");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym26$_NEW_DEDUCTION_ID_THRESHOLD_ = SubLObjectFactory.makeSymbol("*NEW-DEDUCTION-ID-THRESHOLD*");
        $kw27$DENSE = SubLObjectFactory.makeKeyword("DENSE");
        $kw28$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym30$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETED-DEDUCTION-ID-ITERATOR")));
        $sym32$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $str33$Determining_maximum_deduction_ID = SubLObjectFactory.makeString("Determining maximum deduction ID");
        $sym34$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw35$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym38$THRESHOLD = SubLObjectFactory.makeUninternedSymbol("THRESHOLD");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FILE-BACKED-DEDUCTION-INTERNAL-ID-THRESHOLD")));
        $sym40$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        $sym41$START = SubLObjectFactory.makeUninternedSymbol("START");
        $sym42$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");
        $sym43$DEDUCTION = SubLObjectFactory.makeSymbol("DEDUCTION");
        $sym44$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $int45$144 = SubLObjectFactory.makeInteger(144);
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D-ID"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-D-ID"));
        $sym50$PRINT_DEDUCTION = SubLObjectFactory.makeSymbol("PRINT-DEDUCTION");
        $sym51$DEDUCTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DEDUCTION-PRINT-FUNCTION-TRAMPOLINE");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P"));
        $sym53$D_ID = SubLObjectFactory.makeSymbol("D-ID");
        $sym54$_CSETF_D_ID = SubLObjectFactory.makeSymbol("_CSETF-D-ID");
        $kw55$ID = SubLObjectFactory.makeKeyword("ID");
        $str56$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw57$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym58$MAKE_DEDUCTION = SubLObjectFactory.makeSymbol("MAKE-DEDUCTION");
        $kw59$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw60$END = SubLObjectFactory.makeKeyword("END");
        $sym61$VISIT_DEFSTRUCT_OBJECT_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DEDUCTION-METHOD");
        $str62$_The_CFASL_invalid_deduction_ = SubLObjectFactory.makeString("<The CFASL invalid deduction>");
        $int63$786 = SubLObjectFactory.makeInteger(786);
        $sym64$SXHASH_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("SXHASH-DEDUCTION-METHOD");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str66$Return_T_iff_OBJECT_is_a_CycL_ded = SubLObjectFactory.makeString("Return T iff OBJECT is a CycL deduction.");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym68$VALID_DEDUCTION = SubLObjectFactory.makeSymbol("VALID-DEDUCTION");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-DEDUCTION?"));
        $sym70$VALID_SUPPORT_ = SubLObjectFactory.makeSymbol("VALID-SUPPORT?");
        $sym71$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str72$Freeing_deductions = SubLObjectFactory.makeString("Freeing deductions");
        $sym73$DEDUCTION_ID = SubLObjectFactory.makeSymbol("DEDUCTION-ID");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"));
        $str75$Return_the_id_of_DEDUCTION_ = SubLObjectFactory.makeString("Return the id of DEDUCTION.");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")));
        $sym77$FIND_DEDUCTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $str78$Return_the_deduction_with_ID__or_ = SubLObjectFactory.makeString("Return the deduction with ID, or NIL if not present.");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P")));
    }
    
    public static final class $deduction_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $deduction_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$deduction_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$deduction_native.class, deduction_handles.$sym43$DEDUCTION, deduction_handles.$sym44$DEDUCTION_P, deduction_handles.$list46, deduction_handles.$list47, new String[] { "$id" }, deduction_handles.$list48, deduction_handles.$list49, deduction_handles.$sym50$PRINT_DEDUCTION);
        }
    }
    
    public static final class $deduction_p$UnaryFunction extends UnaryFunction
    {
        public $deduction_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DEDUCTION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return deduction_handles.deduction_p(arg1);
        }
    }
    
    public static final class $sxhash_deduction_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_deduction_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-DEDUCTION-METHOD"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return deduction_handles.sxhash_deduction_method(arg1);
        }
    }
}

/*

	Total time: 338 ms
	
*/