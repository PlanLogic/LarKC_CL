package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_indexing_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_indexing_datastructures";
    public static final String myFingerPrint = "e8f08cd71b799a01c1c993fee3c39f69d7eed19f87ee6b582ea29ae21b0b6838";
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 1640L)
    private static SubLSymbol $assertion_indexing_store$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2493L)
    private static SubLSymbol $meta_assertion_frequency$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6007L)
    private static SubLSymbol $unindexed_syntax_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19980L)
    public static SubLSymbol $current_complex_index_term$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 20329L)
    public static SubLSymbol $current_complex_index_keys$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 20621L)
    public static SubLSymbol $current_complex_index_keys_in_orderP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 32336L)
    public static SubLSymbol $changed_index_entry_hints$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 36389L)
    public static SubLSymbol $final_topn_index_cutoff_size$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 46973L)
    public static SubLSymbol $ordered_final_index_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 58530L)
    public static SubLSymbol $final_sharded_index_shard_size$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 80651L)
    public static SubLSymbol $recent_final_topn_indices$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 81270L)
    public static SubLSymbol $with_final_topn_index_tracking$;
    private static final SubLSymbol $sym0$_ASSERTION_INDEXING_STORE_;
    private static final SubLFloat $float1$0_05;
    private static final SubLInteger $int2$64;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $kw7$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym8$PROGRESS_MESSAGE_VAR;
    private static final SubLSymbol $sym9$CLET;
    private static final SubLSymbol $sym10$DO_ASSERTIONS_WITH_META_ASSERTIONS;
    private static final SubLSymbol $sym11$SOFAR;
    private static final SubLSymbol $sym12$TOTAL;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym16$CINC;
    private static final SubLSymbol $sym17$NOTE_PERCENT_PROGRESS;
    private static final SubLSymbol $sym18$DO_ITERATOR;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$INDEXED_TERM_P;
    private static final SubLList $list23;
    private static final SubLString $str24$Returns_T_iff_OBJECT_is_an_indexe;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLString $str27$mapping_Cyc_indexed_terms;
    private static final SubLSymbol $sym28$PROGN;
    private static final SubLSymbol $sym29$DO_FORTS;
    private static final SubLSymbol $sym30$FORMAT;
    private static final SubLString $str31$_A__forts_;
    private static final SubLSymbol $sym32$DO_ASSERTIONS;
    private static final SubLString $str33$_A__assertions_;
    private static final SubLSymbol $sym34$DO_KB_UNREPRESENTED_TERMS;
    private static final SubLString $str35$_A__unrepresented_terms_;
    private static final SubLString $str36$_S_is_not_indexed;
    private static final SubLSymbol $sym37$INDEXING_LEAF_INSTALLED_P;
    private static final SubLSymbol $sym38$SIMPLE_INDEXED_TERM_P;
    private static final SubLSymbol $sym39$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST;
    private static final SubLSymbol $sym40$DO_SIMPLE_INDEX;
    private static final SubLSymbol $sym41$SIMPLE_INDEX_P;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$_CURRENT_COMPLEX_INDEX_TERM_;
    private static final SubLSymbol $sym44$_CURRENT_COMPLEX_INDEX_KEYS_;
    private static final SubLSymbol $sym45$COMPLEX_INDEX_P;
    private static final SubLSymbol $sym46$_EXIT;
    private static final SubLString $str47$_s_is_not_a_SUBINDEX_P;
    private static final SubLSymbol $sym48$INTERMEDIATE_INDEX_P;
    private static final SubLString $str49$Cannot_reserve_a_TOP_N_index_for_;
    private static final SubLString $str50$Cannot_merge__A_onto__A__incommen;
    private static final SubLString $str51$Dont_know_how_to_merge_sub_index_;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$INDEX;
    private static final SubLSymbol $sym55$PWHEN;
    private static final SubLSymbol $sym56$DO_INTERMEDIATE_INDEX_VALID_INDEX_P;
    private static final SubLSymbol $sym57$DO_MAP;
    private static final SubLSymbol $sym58$INTERMEDIATE_INDEX_MAP;
    private static final SubLSymbol $sym59$DO_INTERMEDIATE_INDEX;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$_CHANGED_INDEX_ENTRY_HINTS_;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$INDEX;
    private static final SubLSymbol $sym64$KEY_SET;
    private static final SubLSymbol $sym65$CMULTIPLE_VALUE_SETQ;
    private static final SubLSymbol $sym66$SEGREGATE_INDEX_CHANGES_AND_PRISTINES;
    private static final SubLSymbol $sym67$CSOME;
    private static final SubLSymbol $sym68$INTERMEDIATE_INDEX_LOOKUP;
    private static final SubLSymbol $sym69$DO_CHANGED_INTERMEDIATE_INDEX;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$SUBINDEX_P;
    private static final SubLSymbol $sym72$_FINAL_TOPN_INDEX_CUTOFF_SIZE_;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$FINAL_INDEX_P;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$INDEX;
    private static final SubLSymbol $sym80$PCOND;
    private static final SubLSymbol $sym81$NULL;
    private static final SubLSymbol $sym82$FINAL_UNIFIED_INDEX_P;
    private static final SubLSymbol $sym83$DO_FINAL_UNIFIED_INDEX_INTERNAL;
    private static final SubLSymbol $sym84$FINAL_SHARDED_INDEX_P;
    private static final SubLSymbol $sym85$DO_FINAL_SHARDED_INDEX_INTERNAL;
    private static final SubLSymbol $sym86$FINAL_TOPN_INDEX_P;
    private static final SubLSymbol $sym87$DO_FINAL_TOPN_INDEX_INTERNAL;
    private static final SubLSymbol $sym88$ENFORCE_TYPE;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$INDEX;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$DO_ORDERED_FINAL_UNIFIED_INDEX_INTERNAL;
    private static final SubLSymbol $sym93$DO_ORDERED_FINAL_SHARDED_INDEX_INTERNAL;
    private static final SubLSymbol $sym94$DO_ORDERED_FINAL_TOPN_INDEX_INTERNAL;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$DO_SET;
    private static final SubLSymbol $sym97$FINAL_UNIFIED_INDEX_SET;
    private static final SubLSymbol $sym98$LEAF_ITEMS;
    private static final SubLSymbol $sym99$SET_ELEMENT_LIST;
    private static final SubLSymbol $sym100$CSETQ;
    private static final SubLSymbol $sym101$SORT_ASSERTIONS;
    private static final SubLSymbol $sym102$DO_FINAL_UNIFIED_INDEX;
    private static final SubLSymbol $sym103$_FINAL_SHARDED_INDEX_SHARD_SIZE_;
    private static final SubLInteger $int104$1000;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$IGNORED_KEY;
    private static final SubLSymbol $sym108$SHARD;
    private static final SubLSymbol $sym109$FINAL_SHARDED_INDEX_SHARD_MAP;
    private static final SubLSymbol $sym110$IGNORE;
    private static final SubLSymbol $sym111$SHARD_KEY_LIST;
    private static final SubLSymbol $sym112$KEY;
    private static final SubLSymbol $sym113$SHARD;
    private static final SubLSymbol $sym114$SHARD_CONTENTS;
    private static final SubLSymbol $sym115$SORT;
    private static final SubLSymbol $sym116$MAP_KEYS;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$MAP_GET;
    private static final SubLSymbol $sym119$ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS;
    private static final SubLSymbol $sym120$DO_VECTOR;
    private static final SubLSymbol $sym121$ASSERTION_P;
    private static final SubLSymbol $sym122$POSSIBLE_ASSERTION_;
    private static final SubLString $str123$Index_count_was__A__yet_we_copied;
    private static final SubLSymbol $sym124$_;
    private static final SubLSymbol $sym125$INDEXING_LEAF_SUID;
    private static final SubLString $str126$Implementation_error__shard_count;
    private static final SubLSymbol $kw127$SWAPPED_OUT;
    private static final SubLSymbol $kw128$COMPACT;
    private static final SubLString $str129$Shard_count_of__A_does_not_match_;
    private static final SubLString $str130$Shard_key___A_is_wrong____we_expe;
    private static final SubLList $list131;
    private static final SubLString $str132$Shard_with_max_ID__A_contains_lea;
    private static final SubLString $str133$We_expected_to_find__A_leaves__bu;
    private static final SubLSymbol $sym134$FINAL_SHARDED_INDEX_SET;
    private static final SubLSymbol $sym135$DO_FINAL_SHARDED_INDEX;
    private static final SubLList $list136;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str141$__Creating_empty_TOP_N_index__A_o;
    private static final SubLString $str142$Upgrading_index__A_on__A___A_item;
    private static final SubLSymbol $sym143$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str144$Final_Top_N_index_iterator_for__A;
    private static final SubLString $str145$_A__;
    private static final SubLSymbol $sym146$ASSERTION_MATCHES_FINAL_TOPN_INDEXKEY_PATH_;
    private static final SubLSymbol $kw147$SIMPLE_MATCH_FUNCTION;
    private static final SubLString $str148$No_match_function_available_for_d;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$NEW_FINAL_TOPN_INDEX_ITERATOR;
    private static final SubLSymbol $sym151$NEW_ORDERED_FINAL_TOPN_INDEX_ITERATOR;
    private static final SubLList $list152;
    private static final SubLString $str153$Could_not_merge_final_indices__A_;
    private static final SubLString $str154$Merging_indices__A_on__A___A_item;
    private static final SubLList $list155;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 989L)
    public static SubLObject setup_indexing_tables(final SubLObject estimated_size) {
        final SubLObject estimated_assertion_count = Numbers.multiply((SubLObject)kb_indexing_datastructures.TEN_INTEGER, estimated_size);
        assertion_indexing_store_initialize(estimated_assertion_count);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 1771L)
    public static SubLObject assertion_indexing_store() {
        return kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2012L)
    public static SubLObject assertions_with_meta_assertions_count() {
        return Hashtables.hash_table_count(kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2213L)
    public static SubLObject assertion_indexing_store_reset(final SubLObject store) {
        kb_indexing_datastructures.$assertion_indexing_store$.setGlobalValue(store);
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2750L)
    public static SubLObject assertion_indexing_store_initial_size(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == kb_indexing_datastructures.UNPROVIDED) {
            estimated_assertion_count = (SubLObject)kb_indexing_datastructures.NIL;
        }
        if (kb_indexing_datastructures.NIL != estimated_assertion_count) {
            return Numbers.round(Numbers.multiply(estimated_assertion_count, kb_indexing_datastructures.$meta_assertion_frequency$.getGlobalValue()), (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        if (kb_indexing_datastructures.NIL != control_vars.kb_loaded()) {
            return Numbers.round(Numbers.multiply(assertion_handles.assertion_count(), kb_indexing_datastructures.$meta_assertion_frequency$.getGlobalValue()), (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        return (SubLObject)kb_indexing_datastructures.$int2$64;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3063L)
    public static SubLObject assertion_indexing_store_initialize(SubLObject estimated_assertion_count) {
        if (estimated_assertion_count == kb_indexing_datastructures.UNPROVIDED) {
            estimated_assertion_count = (SubLObject)kb_indexing_datastructures.NIL;
        }
        final SubLObject initial_size = assertion_indexing_store_initial_size(estimated_assertion_count);
        assertion_indexing_store_reset(Hashtables.make_hash_table(initial_size, Symbols.symbol_function((SubLObject)kb_indexing_datastructures.EQL), (SubLObject)kb_indexing_datastructures.UNPROVIDED));
        return kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3534L)
    public static SubLObject clear_assertion_indexing() {
        return clear_assertion_indexing_store();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3623L)
    public static SubLObject clear_assertion_indexing_store() {
        return Hashtables.clrhash(kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3722L)
    public static SubLObject assertion_indexing_store_get(final SubLObject assertion) {
        return Hashtables.gethash_without_values(assertion, kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue(), new_simple_index());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4269L)
    public static SubLObject assertion_indexing_store_remove(final SubLObject assertion) {
    	PrologSync.bp();
        return Hashtables.remhash(assertion, kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4522L)
    public static SubLObject assertion_indexing_store_set(final SubLObject assertion, final SubLObject index) {
        if (index.eql(new_simple_index())) {
            return assertion_indexing_store_remove(assertion);
        }
        PrologSync.bp();
        return Hashtables.sethash(assertion, kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue(), index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4904L)
    public static SubLObject do_assertions_with_meta_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list3);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$1 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list3);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list3);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$1, (SubLObject)kb_indexing_datastructures.$list4, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$1 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list3);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw7$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_indexing_datastructures.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = (SubLObject)kb_indexing_datastructures.$sym8$PROGRESS_MESSAGE_VAR;
            ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(progress_message_var, progress_message)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym10$DO_ASSERTIONS_WITH_META_ASSERTIONS, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done, (SubLObject)kb_indexing_datastructures.$kw7$PROGRESS_MESSAGE, progress_message_var), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)));
        }
        if (kb_indexing_datastructures.NIL != progress_message) {
            final SubLObject sofar = (SubLObject)kb_indexing_datastructures.$sym11$SOFAR;
            final SubLObject total = (SubLObject)kb_indexing_datastructures.$sym12$TOTAL;
            return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(total, (SubLObject)kb_indexing_datastructures.$list13), reader.bq_cons(sofar, (SubLObject)kb_indexing_datastructures.$list14)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym15$NOTING_PERCENT_PROGRESS, progress_message, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym10$DO_ASSERTIONS_WITH_META_ASSERTIONS, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym16$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym17$NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym18$DO_ITERATOR, (SubLObject)ConsesLow.list(assertion_var, (SubLObject)kb_indexing_datastructures.$list19, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 5824L)
    public static SubLObject new_assertions_with_meta_assertions_iterator() {
        return iteration.new_hash_table_keys_iterator(kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6377L)
    public static SubLObject unindexed_syntax_constants() {
        return kb_indexing_datastructures.$unindexed_syntax_constants$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6593L)
    public static SubLObject unindexed_syntax_constant_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, kb_indexing_datastructures.$unindexed_syntax_constants$.getGlobalValue(), (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6924L)
    public static SubLObject indexed_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != cycl_utilities.reified_term_p(v_object) || kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 7203L)
    public static SubLObject indexed_unrepresented_term_p(final SubLObject v_object) {
        return cycl_grammar.cycl_unrepresented_term_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 7522L)
    public static SubLObject valid_indexed_termP(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != forts.fort_p(v_object)) {
            return forts.valid_fortP(v_object);
        }
        if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_object)) {
            return assertion_handles.valid_assertionP(v_object, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_object)) {
            return (SubLObject)kb_indexing_datastructures.T;
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 8039L)
    public static SubLObject valid_indexed_term_robustP(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != forts.fort_p(v_object)) {
            return forts.valid_fort_robustP(v_object);
        }
        if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_object)) {
            return assertions_low.valid_assertion_robustP(v_object);
        }
        if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_object)) {
            return (SubLObject)kb_indexing_datastructures.T;
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 8647L)
    public static SubLObject invalid_indexed_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != indexed_term_p(v_object) && kb_indexing_datastructures.NIL == valid_indexed_termP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 8987L)
    public static SubLObject invalid_indexed_term_robustP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != indexed_term_p(v_object) && kb_indexing_datastructures.NIL == valid_indexed_term_robustP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 9414L)
    public static SubLObject sort_of_indexed_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != indexed_term_p(v_object) || kb_indexing_datastructures.NIL != hlmt.hlmt_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 9602L)
    public static SubLObject fully_indexed_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != indexed_term_p(v_object) && kb_indexing_datastructures.NIL == unindexed_syntax_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 9891L)
    public static SubLObject valid_fully_indexed_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != valid_indexed_termP(v_object) && kb_indexing_datastructures.NIL == unindexed_syntax_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 10211L)
    public static SubLObject do_indexed_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list26);
        var = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : kb_indexing_datastructures.$str27$mapping_Cyc_indexed_terms);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)kb_indexing_datastructures.$list26);
        current = current.rest();
        if (kb_indexing_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym28$PROGN, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym29$DO_FORTS, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym30$FORMAT, (SubLObject)kb_indexing_datastructures.NIL, (SubLObject)kb_indexing_datastructures.$str31$_A__forts_, message)), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym32$DO_ASSERTIONS, (SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym30$FORMAT, (SubLObject)kb_indexing_datastructures.NIL, (SubLObject)kb_indexing_datastructures.$str33$_A__assertions_, message)), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym34$DO_KB_UNREPRESENTED_TERMS, (SubLObject)ConsesLow.list(var, (SubLObject)kb_indexing_datastructures.$kw7$PROGRESS_MESSAGE, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym30$FORMAT, (SubLObject)kb_indexing_datastructures.NIL, (SubLObject)kb_indexing_datastructures.$str35$_A__unrepresented_terms_, message)), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list26);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 10840L)
    public static SubLObject index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != simple_index_p(v_object) || kb_indexing_datastructures.NIL != complex_index_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 11883L)
    public static SubLObject index_installed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != simple_index_p(v_object)) {
            return simple_index_installed_p(v_object);
        }
        if (kb_indexing_datastructures.NIL != complex_index_p(v_object)) {
            return complex_index_installed_p(v_object);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12226L)
    public static SubLObject index_not_hosed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != simple_index_p(v_object)) {
            return simple_index_not_hosed_p(v_object);
        }
        if (kb_indexing_datastructures.NIL != complex_index_p(v_object)) {
            return complex_index_not_hosed_p(v_object);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12571L)
    public static SubLObject index_leaves(final SubLObject index) {
        if (kb_indexing_datastructures.NIL != simple_index_p(index)) {
            return simple_index_leaves(index);
        }
        return complex_index_leaves(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12852L)
    public static SubLObject index_leaf_count(final SubLObject index) {
        if (kb_indexing_datastructures.NIL != simple_index_p(index)) {
            return simple_index_leaf_count(index);
        }
        return complex_index_leaf_count(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13135L)
    public static SubLObject term_index(final SubLObject v_term) {
        if (kb_indexing_datastructures.NIL != constant_handles.constant_p(v_term)) {
            if (kb_indexing_datastructures.NIL != constant_handles.valid_constantP(v_term, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                return constants_low.constant_index(v_term);
            }
        }
        else if (kb_indexing_datastructures.NIL != nart_handles.nart_p(v_term)) {
            if (kb_indexing_datastructures.NIL != nart_handles.valid_nartP(v_term, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                return narts_low.nart_index(v_term);
            }
        }
        else {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_term)) {
                return assertions_low.assertion_index(v_term);
            }
            if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_term)) {
                return unrepresented_terms.unrepresented_term_index(v_term);
            }
            if (kb_indexing_datastructures.NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                return auxiliary_indexing.get_auxiliary_index(v_term);
            }
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13774L)
    public static SubLObject term_index_swapped_inP(final SubLObject v_term) {
        if (kb_indexing_datastructures.NIL != constant_handles.constant_p(v_term)) {
            if (kb_indexing_datastructures.NIL != constant_handles.valid_constantP(v_term, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                return constants_low.constant_index_swapped_inP(v_term);
            }
        }
        else if (kb_indexing_datastructures.NIL != nart_handles.nart_p(v_term)) {
            if (kb_indexing_datastructures.NIL != nart_handles.valid_nartP(v_term, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                return narts_low.nart_index_swapped_inP(v_term);
            }
        }
        else {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_term)) {
                return assertions_low.assertion_index_swapped_inP(v_term);
            }
            if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_term)) {
                return unrepresented_terms.unrepresented_term_index_swapped_inP(v_term);
            }
            if (kb_indexing_datastructures.NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                return auxiliary_indexing.auxiliary_index_swapped_inP(v_term);
            }
        }
        return (SubLObject)kb_indexing_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 14404L)
    public static SubLObject reset_term_index(final SubLObject v_term, final SubLObject index) {
        if (kb_indexing_datastructures.NIL != forts.fort_p(v_term)) {
            forts.reset_fort_index(v_term, index);
        }
        else if (kb_indexing_datastructures.NIL == hlmt.hlmt_p(v_term)) {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_term)) {
                assertions_low.reset_assertion_index(v_term, index);
            }
            else if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_term)) {
                unrepresented_terms.reset_unrepresented_term_index(v_term, index, (SubLObject)kb_indexing_datastructures.T);
            }
            else if (kb_indexing_datastructures.NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                auxiliary_indexing.reset_auxiliary_index(v_term, index);
            }
            else {
                Errors.error((SubLObject)kb_indexing_datastructures.$str36$_S_is_not_indexed, v_term);
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 15083L)
    public static SubLObject clear_term_index(final SubLObject v_term) {
        if (kb_indexing_datastructures.NIL != forts.fort_p(v_term)) {
            forts.clear_fort_index(v_term);
        }
        else if (kb_indexing_datastructures.NIL == hlmt.hlmt_p(v_term)) {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(v_term)) {
                assertions_low.clear_assertion_index(v_term);
            }
            else if (kb_indexing_datastructures.NIL != indexed_unrepresented_term_p(v_term)) {
                unrepresented_terms.clear_unrepresented_term_index(v_term);
            }
            else if (kb_indexing_datastructures.NIL != auxiliary_indexing.auxiliary_index_p(v_term)) {
                auxiliary_indexing.clear_auxiliary_index(v_term);
            }
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 15592L)
    public static SubLObject free_index(final SubLObject index) {
        if (kb_indexing_datastructures.NIL != simple_index_p(index)) {
            return free_simple_index(index);
        }
        if (kb_indexing_datastructures.NIL != complex_index_p(index)) {
            return free_complex_index(index);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 15830L)
    public static SubLObject free_term_index(final SubLObject v_term) {
        free_index(term_index(v_term));
        reset_term_index(v_term, new_simple_index());
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16154L)
    public static SubLObject simple_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && kb_indexing_datastructures.NIL == complex_index_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16529L)
    public static SubLObject simple_index_installed_p(final SubLObject v_object) {
        return simple_index_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16742L)
    public static SubLObject simple_index_not_hosed_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != simple_index_p(v_object) && kb_indexing_datastructures.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)kb_indexing_datastructures.$sym37$INDEXING_LEAF_INSTALLED_P), v_object, (SubLObject)kb_indexing_datastructures.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17019L)
    public static SubLObject simple_indexed_term_p(final SubLObject v_term) {
        return simple_index_p(term_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17235L)
    public static SubLObject new_simple_index() {
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17457L)
    public static SubLObject simple_index_leaves(final SubLObject simple_index) {
        return simple_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17669L)
    public static SubLObject simple_index_leaf_count(final SubLObject simple_index) {
        return Sequences.length(simple_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17884L)
    public static SubLObject simple_index_memberP(final SubLObject simple_index, final SubLObject leaf) {
        return subl_promotions.memberP(leaf, simple_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18104L)
    public static SubLObject simple_num_index(final SubLObject v_term) {
        assert kb_indexing_datastructures.NIL != simple_indexed_term_p(v_term) : v_term;
        return simple_index_leaf_count(term_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18380L)
    public static SubLObject simple_term_assertion_list(final SubLObject v_term) {
        assert kb_indexing_datastructures.NIL != simple_indexed_term_p(v_term) : v_term;
        return simple_index_leaves(term_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18755L)
    public static SubLObject do_simple_index_term_assertion_list(final SubLObject v_term) {
        return simple_term_assertion_list(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18904L)
    public static SubLObject reset_term_simple_index(final SubLObject v_term, final SubLObject simple_index) {
        assert kb_indexing_datastructures.NIL != simple_index_p(simple_index) : simple_index;
        return reset_term_index(v_term, simple_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19196L)
    public static SubLObject simple_index_insert(final SubLObject simple_index, final SubLObject leaf) {
        if (kb_indexing_datastructures.NIL != simple_index_memberP(simple_index, leaf)) {
            return simple_index;
        }
        return (SubLObject)ConsesLow.cons(leaf, simple_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19491L)
    public static SubLObject simple_index_delete(final SubLObject simple_index, final SubLObject leaf) {
        if (kb_indexing_datastructures.NIL != simple_index_memberP(simple_index, leaf)) {
            return list_utilities.delete_first(leaf, simple_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        return simple_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19794L)
    public static SubLObject free_simple_index(final SubLObject simple_index) {
        return simple_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 21126L)
    public static SubLObject with_current_complex_index_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_term = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject keys = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list42);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list42);
        keys = current.first();
        current = current.rest();
        if (kb_indexing_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym43$_CURRENT_COMPLEX_INDEX_TERM_, v_term), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym44$_CURRENT_COMPLEX_INDEX_KEYS_, keys)), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list42);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 21423L)
    public static SubLObject current_complex_index_keys() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_indexing_datastructures.$current_complex_index_keys$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 21566L)
    public static SubLObject copy_current_complex_index_keys() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL != kb_indexing_datastructures.$current_complex_index_keys_in_orderP$.getDynamicValue(thread)) {
            return conses_high.copy_list(kb_indexing_datastructures.$current_complex_index_keys$.getDynamicValue(thread));
        }
        return Sequences.reverse(kb_indexing_datastructures.$current_complex_index_keys$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 21917L)
    public static SubLObject current_complex_index_term() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return kb_indexing_datastructures.$current_complex_index_term$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22060L)
    public static SubLObject complex_index_keys_defined_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Types.consp(kb_indexing_datastructures.$current_complex_index_keys$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22223L)
    public static SubLObject complex_index_p(final SubLObject v_object) {
        return subindex_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22426L)
    public static SubLObject complex_index_installed_p(final SubLObject v_object) {
        return subindex_installed_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22647L)
    public static SubLObject complex_index_not_hosed_p(final SubLObject v_object) {
        return subindex_not_hosed_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22868L)
    public static SubLObject complex_indexed_term_p(final SubLObject v_term) {
        return complex_index_p(term_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23087L)
    public static SubLObject complex_index_leaves(final SubLObject complex_index) {
        return subindex_leaves(complex_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23321L)
    public static SubLObject complex_index_leaf_count(final SubLObject complex_index) {
        return subindex_leaf_count(complex_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23553L)
    public static SubLObject complex_index_lookup(final SubLObject complex_index, final SubLObject key) {
        return subindex_lookup(complex_index, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23830L)
    public static SubLObject term_complex_index_lookup(final SubLObject v_term, final SubLObject key) {
        final SubLObject index = term_index(v_term);
        if (kb_indexing_datastructures.NIL == index) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        assert kb_indexing_datastructures.NIL != complex_index_p(index) : index;
        return complex_index_lookup(index, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24219L)
    public static SubLObject initialize_term_complex_index(final SubLObject v_term) {
        return initialize_term_subindex(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24549L)
    public static SubLObject merge_complex_indices(final SubLObject complex_base, final SubLObject complex_augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_indexing_datastructures.$current_complex_index_keys$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_indexing_datastructures.$current_complex_index_keys_in_orderP$.currentBinding(thread);
        try {
            kb_indexing_datastructures.$current_complex_index_keys$.bind((SubLObject)kb_indexing_datastructures.NIL, thread);
            kb_indexing_datastructures.$current_complex_index_keys_in_orderP$.bind((SubLObject)kb_indexing_datastructures.NIL, thread);
            return merge_sub_indices(complex_base, complex_augment);
        }
        finally {
            kb_indexing_datastructures.$current_complex_index_keys_in_orderP$.rebind(_prev_bind_2, thread);
            kb_indexing_datastructures.$current_complex_index_keys$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24839L)
    public static SubLObject term_complex_index_set(final SubLObject v_term, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_indexing_datastructures.NIL != value && kb_indexing_datastructures.NIL == subindex_p(value)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str47$_s_is_not_a_SUBINDEX_P, value);
        }
        final SubLObject index = term_index(v_term);
        if (kb_indexing_datastructures.NIL != value && !kb_indexing_datastructures.assertionsDisabledSynth && kb_indexing_datastructures.NIL == intermediate_index_p(index)) {
            throw new AssertionError(index);
        }
        if (kb_indexing_datastructures.NIL != index) {
            intermediate_index_set(index, key, value);
        }
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 25453L)
    public static SubLObject term_complex_index_delete_key(final SubLObject v_term, final SubLObject key) {
        final SubLObject index = term_index(v_term);
        if (kb_indexing_datastructures.NIL != index) {
            intermediate_index_delete_key(index, key);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 25863L)
    public static SubLObject reserve_final_topn_index_for_term(final SubLObject v_term, final SubLObject keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = term_index(v_term);
        final SubLObject key_count = Sequences.length(keys);
        SubLObject key_history = (SubLObject)kb_indexing_datastructures.NIL;
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_indexing_datastructures.NIL == complex_index_p(index)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str49$Cannot_reserve_a_TOP_N_index_for_, v_term);
        }
        SubLObject list_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject key_number = (SubLObject)kb_indexing_datastructures.NIL;
        list_var = keys;
        key = list_var.first();
        for (key_number = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER; kb_indexing_datastructures.NIL != list_var; list_var = list_var.rest(), key = list_var.first(), key_number = Numbers.add((SubLObject)kb_indexing_datastructures.ONE_INTEGER, key_number)) {
            key_history = ConsesLow.nconc(key_history, (SubLObject)ConsesLow.list(key));
            if (Numbers.add((SubLObject)kb_indexing_datastructures.ONE_INTEGER, key_number).numL(key_count)) {
                index = intermediate_index_lookup_or_create_intermediate(index, key, key_history);
            }
            else {
                intermediate_index_set(index, key, new_final_topn_index(v_term, keys, (SubLObject)kb_indexing_datastructures.ZERO_INTEGER));
            }
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 26679L)
    public static SubLObject free_complex_index(final SubLObject complex_index) {
        return free_subindex(complex_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 26839L)
    public static SubLObject subindex_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != intermediate_index_p(v_object) || kb_indexing_datastructures.NIL != final_index_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27143L)
    public static SubLObject subindex_installed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(v_object)) {
            return intermediate_index_installed_p(v_object);
        }
        if (kb_indexing_datastructures.NIL != final_index_p(v_object)) {
            return final_index_installed_p(v_object);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27495L)
    public static SubLObject subindex_not_hosed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(v_object)) {
            return intermediate_index_not_hosed_p(v_object);
        }
        if (kb_indexing_datastructures.NIL != final_index_p(v_object)) {
            return final_index_not_hosed_p(v_object);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27847L)
    public static SubLObject subindex_lookup(final SubLObject subindex, final SubLObject key) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(subindex)) {
            return intermediate_index_lookup(subindex, key);
        }
        if (kb_indexing_datastructures.NIL != final_index_memberP(subindex, key)) {
            return key;
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 28251L)
    public static SubLObject subindex_leaves(final SubLObject subindex) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaves(subindex);
        }
        return final_index_leaves(subindex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 28590L)
    public static SubLObject subindex_leaf_count(final SubLObject subindex) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(subindex)) {
            return intermediate_index_leaf_count(subindex);
        }
        return final_index_leaf_count(subindex);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 28980L)
    public static SubLObject initialize_term_subindex(final SubLObject v_term) {
        return initialize_term_intermediate_index(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 29395L)
    public static SubLObject free_subindex(final SubLObject subindex) {
        if (kb_indexing_datastructures.NIL != intermediate_index_p(subindex)) {
            return free_intermediate_index(subindex);
        }
        if (kb_indexing_datastructures.NIL != final_index_p(subindex)) {
            return free_final_index(subindex);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 29656L)
    public static SubLObject merge_sub_indices(final SubLObject subindex_base, final SubLObject subindex_augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL != intermediate_index_p(subindex_base)) {
            if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_indexing_datastructures.NIL == intermediate_index_p(subindex_augment)) {
                Errors.error((SubLObject)kb_indexing_datastructures.$str50$Cannot_merge__A_onto__A__incommen, subindex_augment, subindex_base);
            }
            return merge_intermediate_indices(subindex_base, subindex_augment);
        }
        if (kb_indexing_datastructures.NIL != final_index_p(subindex_base)) {
            if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_indexing_datastructures.NIL == final_index_p(subindex_augment)) {
                Errors.error((SubLObject)kb_indexing_datastructures.$str50$Cannot_merge__A_onto__A__incommen, subindex_augment, subindex_base);
            }
            return merge_final_indices(subindex_base, subindex_augment);
        }
        return Errors.error((SubLObject)kb_indexing_datastructures.$str51$Dont_know_how_to_merge_sub_index_, subindex_base, subindex_augment);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 30393L)
    public static SubLObject intermediate_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().isInteger() && kb_indexing_datastructures.NIL != map_utilities.map_p(v_object.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 30762L)
    public static SubLObject intermediate_index_installed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL == intermediate_index_p(v_object)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        return (SubLObject)kb_indexing_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 31034L)
    public static SubLObject intermediate_index_not_hosed_p(final SubLObject v_object) {
        if (kb_indexing_datastructures.NIL == intermediate_index_p(v_object)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        return (SubLObject)kb_indexing_datastructures.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 31317L)
    public static SubLObject new_intermediate_index(final SubLObject test_function) {
        return (SubLObject)ConsesLow.cons((SubLObject)kb_indexing_datastructures.ZERO_INTEGER, dictionary.new_dictionary(test_function, (SubLObject)kb_indexing_datastructures.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 31437L)
    public static SubLObject clone_intermediate_index(final SubLObject intermediate_index) {
        final SubLObject index_test = map_utilities.map_test(intermediate_index_map(intermediate_index));
        return (SubLObject)ConsesLow.cons(intermediate_index_leaf_count(intermediate_index), dictionary.new_dictionary(index_test, (SubLObject)kb_indexing_datastructures.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 31736L)
    public static SubLObject do_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject subindex_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject intermediate_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list52);
        key_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list52);
        subindex_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list52);
        intermediate_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$2 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list52);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list52);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$2, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$2 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list52);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject index = (SubLObject)kb_indexing_datastructures.$sym54$INDEX;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, intermediate_index)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym55$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym56$DO_INTERMEDIATE_INDEX_VALID_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym57$DO_MAP, (SubLObject)ConsesLow.list(key_var, subindex_var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym58$INTERMEDIATE_INDEX_MAP, index), (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 32206L)
    public static SubLObject do_intermediate_index_valid_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 32521L)
    public static SubLObject capture_changed_index_entry_hints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_set = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list60);
        v_set = current.first();
        current = current.rest();
        if (kb_indexing_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym61$_CHANGED_INDEX_ENTRY_HINTS_, v_set)), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list60);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 32725L)
    public static SubLObject do_changed_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject subindex_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject intermediate_index = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject unchanged_part = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list62);
        key_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list62);
        subindex_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list62);
        intermediate_index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list62);
        unchanged_part = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$3 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list62);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list62);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$3, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$3 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list62);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject index = (SubLObject)kb_indexing_datastructures.$sym63$INDEX;
        final SubLObject key_set = (SubLObject)kb_indexing_datastructures.$sym64$KEY_SET;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, intermediate_index)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym55$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym56$DO_INTERMEDIATE_INDEX_VALID_INDEX_P, index), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list(key_set), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym65$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(key_set, unchanged_part), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym66$SEGREGATE_INDEX_CHANGES_AND_PRISTINES, index)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym67$CSOME, (SubLObject)ConsesLow.list(key_var, key_set, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(subindex_var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym68$INTERMEDIATE_INDEX_LOOKUP, index, key_var))), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 33517L)
    public static SubLObject segregate_index_changes_and_pristines(final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unchanged_index = clone_intermediate_index(index);
        thread.resetMultipleValues();
        final SubLObject key_set = map_utilities.map_change_set(intermediate_index_map(index), intermediate_index_map(unchanged_index));
        final SubLObject delete_hints = thread.secondMultipleValue();
        final SubLObject edit_hints = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (kb_indexing_datastructures.NIL != set.set_p(kb_indexing_datastructures.$changed_index_entry_hints$.getDynamicValue(thread))) {
            set_utilities.set_add_all(delete_hints, kb_indexing_datastructures.$changed_index_entry_hints$.getDynamicValue(thread));
            set_utilities.set_add_all(edit_hints, kb_indexing_datastructures.$changed_index_entry_hints$.getDynamicValue(thread));
        }
        return Values.values(key_set, unchanged_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 34092L)
    public static SubLObject intermediate_index_lookup(final SubLObject intermediate_index, final SubLObject key) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        final SubLObject map = intermediate_index_map(intermediate_index);
        return map_utilities.map_get_without_values(map, key, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 34495L)
    public static SubLObject intermediate_index_keys(final SubLObject intermediate_index) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        return map_utilities.map_keys(intermediate_index_map(intermediate_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 34861L)
    public static SubLObject intermediate_index_leaf_count(final SubLObject intermediate_index) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        return intermediate_index.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 35238L)
    public static SubLObject intermediate_index_leaves(final SubLObject intermediate_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        SubLObject leaves = (SubLObject)kb_indexing_datastructures.NIL;
        if (kb_indexing_datastructures.NIL != do_intermediate_index_valid_index_p(intermediate_index)) {
            final SubLObject iterator = map_utilities.new_map_iterator(intermediate_index_map(intermediate_index));
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (kb_indexing_datastructures.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
                    SubLObject subindex = (SubLObject)kb_indexing_datastructures.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list70);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list70);
                    subindex = current.first();
                    current = current.rest();
                    if (kb_indexing_datastructures.NIL == current) {
                        SubLObject cdolist_list_var = subindex_leaves(subindex);
                        SubLObject leaf = (SubLObject)kb_indexing_datastructures.NIL;
                        leaf = cdolist_list_var.first();
                        while (kb_indexing_datastructures.NIL != cdolist_list_var) {
                            leaves = (SubLObject)ConsesLow.cons(leaf, leaves);
                            cdolist_list_var = cdolist_list_var.rest();
                            leaf = cdolist_list_var.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list70);
                    }
                }
            }
        }
        return Sequences.nreverse(leaves);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 35724L)
    public static SubLObject intermediate_index_set(final SubLObject intermediate_index, final SubLObject key, final SubLObject value) {
        assert kb_indexing_datastructures.NIL != subindex_p(value) : value;
        intermediate_index_map_set(intermediate_index, key, value);
        return intermediate_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 36086L)
    public static SubLObject intermediate_index_replace_map(final SubLObject intermediate_index, final SubLObject new_map) {
        ConsesLow.rplacd(intermediate_index, new_map);
        return intermediate_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 36259L)
    public static SubLObject intermediate_index_touch(final SubLObject intermediate_index, final SubLObject key) {
        return intermediate_index_map_touch(intermediate_index, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 36565L)
    public static SubLObject use_final_topn_indicesP() {
        return subl_promotions.non_negative_integer_p(kb_indexing_datastructures.$final_topn_index_cutoff_size$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 36676L)
    public static SubLObject upgrade_final_indexP(final SubLObject subindex) {
        if (kb_indexing_datastructures.NIL != final_topn_index_p(subindex)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != use_final_topn_indicesP() && kb_indexing_datastructures.$final_topn_index_cutoff_size$.getGlobalValue().numL(final_index_leaf_count(subindex)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 37008L)
    public static SubLObject upgrade_combined_indices_to_final_indexP(final SubLObject subindex_base, final SubLObject subindex_augment) {
        if (kb_indexing_datastructures.NIL != final_topn_index_p(subindex_base) || kb_indexing_datastructures.NIL != final_topn_index_p(subindex_augment)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != use_final_topn_indicesP() && kb_indexing_datastructures.$final_topn_index_cutoff_size$.getGlobalValue().numL(Numbers.add(final_index_leaf_count(subindex_base), final_index_leaf_count(subindex_augment))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 37581L)
    public static SubLObject intermediate_index_insert(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        return intermediate_index_insert_int(intermediate_index, keys, leaf, (SubLObject)kb_indexing_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 37994L)
    public static SubLObject intermediate_index_insert_int(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf, final SubLObject key_history) {
        SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest_keys = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(keys, keys, (SubLObject)kb_indexing_datastructures.$list73);
        key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        if (kb_indexing_datastructures.NIL != rest_keys) {
            final SubLObject new_key_history = ConsesLow.nconc(key_history, (SubLObject)ConsesLow.list(key));
            final SubLObject subindex = intermediate_index_lookup_or_create_intermediate(intermediate_index, key, new_key_history);
            if (kb_indexing_datastructures.NIL != intermediate_index_insert_int(subindex, rest_keys, leaf, new_key_history)) {
                intermediate_index_touch(intermediate_index, key);
                intermediate_index_leaf_count_inc(intermediate_index, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
                return (SubLObject)kb_indexing_datastructures.T;
            }
        }
        else {
            SubLObject subindex2 = intermediate_index_lookup_or_create_final(intermediate_index, key);
            if (kb_indexing_datastructures.NIL != upgrade_final_indexP(subindex2)) {
                subindex2 = upgrade_final_index(subindex2);
                intermediate_index_set(intermediate_index, key, subindex2);
            }
            final SubLObject old_count = final_index_leaf_count(subindex2);
            final_index_insert(subindex2, leaf);
            final SubLObject new_count = final_index_leaf_count(subindex2);
            if (!old_count.numE(new_count)) {
                intermediate_index_touch(intermediate_index, key);
                intermediate_index_leaf_count_inc(intermediate_index, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
                return (SubLObject)kb_indexing_datastructures.T;
            }
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 39468L)
    public static SubLObject intermediate_index_delete(final SubLObject intermediate_index, final SubLObject keys, final SubLObject leaf) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest_keys = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(keys, keys, (SubLObject)kb_indexing_datastructures.$list73);
        key = keys.first();
        final SubLObject current = rest_keys = keys.rest();
        SubLObject result = (SubLObject)kb_indexing_datastructures.NIL;
        final SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (kb_indexing_datastructures.NIL != subindex) {
            if (kb_indexing_datastructures.NIL != rest_keys) {
                result = intermediate_index_delete(subindex, rest_keys, leaf);
                if (kb_indexing_datastructures.NIL != result) {
                    intermediate_index_touch(intermediate_index, key);
                    intermediate_index_leaf_count_inc(intermediate_index, (SubLObject)kb_indexing_datastructures.MINUS_ONE_INTEGER);
                }
            }
            else {
                assert kb_indexing_datastructures.NIL != final_index_p(subindex) : subindex;
                final SubLObject old_count = final_index_leaf_count(subindex);
                final_index_delete(subindex, leaf);
                final SubLObject new_count = final_index_leaf_count(subindex);
                if (!old_count.numE(new_count)) {
                    intermediate_index_touch(intermediate_index, key);
                    intermediate_index_leaf_count_inc(intermediate_index, (SubLObject)kb_indexing_datastructures.MINUS_ONE_INTEGER);
                    result = (SubLObject)kb_indexing_datastructures.T;
                }
            }
            if (kb_indexing_datastructures.ZERO_INTEGER.numE(subindex_leaf_count(subindex))) {
                intermediate_index_delete_key(intermediate_index, key);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 40926L)
    public static SubLObject intermediate_index_delete_key(final SubLObject intermediate_index, final SubLObject key) {
        intermediate_index_map_delete_key(intermediate_index, key);
        return intermediate_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 41290L)
    public static SubLObject merge_intermediate_indices(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_count = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject base_map = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(base, base, (SubLObject)kb_indexing_datastructures.$list75);
        base_count = base.first();
        final SubLObject current = base_map = base.rest();
        SubLObject augment_count = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject augment_map = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(augment, augment, (SubLObject)kb_indexing_datastructures.$list76);
        augment_count = augment.first();
        final SubLObject current_$5 = augment_map = augment.rest();
        final SubLObject iterator = map_utilities.new_map_iterator(augment_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_indexing_datastructures.NIL != valid) {
                SubLObject current_$6;
                final SubLObject datum_$6 = current_$6 = var;
                SubLObject aug_key = (SubLObject)kb_indexing_datastructures.NIL;
                SubLObject aug_index = (SubLObject)kb_indexing_datastructures.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$6, (SubLObject)kb_indexing_datastructures.$list77);
                aug_key = current_$6.first();
                current_$6 = current_$6.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$6, (SubLObject)kb_indexing_datastructures.$list77);
                aug_index = current_$6.first();
                current_$6 = current_$6.rest();
                if (kb_indexing_datastructures.NIL == current_$6) {
                    if (kb_indexing_datastructures.NIL != map_utilities.map_has_keyP(base_map, aug_key)) {
                        final SubLObject _prev_bind_0 = kb_indexing_datastructures.$current_complex_index_keys$.currentBinding(thread);
                        try {
                            kb_indexing_datastructures.$current_complex_index_keys$.bind((SubLObject)ConsesLow.cons(aug_key, kb_indexing_datastructures.$current_complex_index_keys$.getDynamicValue(thread)), thread);
                            final SubLObject best_index = merge_sub_indices(map_utilities.map_get(base_map, aug_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED), aug_index);
                            map_utilities.map_put(base_map, aug_key, best_index);
                        }
                        finally {
                            kb_indexing_datastructures.$current_complex_index_keys$.rebind(_prev_bind_0, thread);
                        }
                    }
                    else {
                        map_utilities.map_put(base_map, aug_key, aug_index);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)kb_indexing_datastructures.$list77);
                }
            }
        }
        base_count = Numbers.add(base_count, augment_count);
        ConsesLow.set_nth((SubLObject)kb_indexing_datastructures.ZERO_INTEGER, base, base_count);
        return base;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 42194L)
    public static SubLObject initialize_term_intermediate_index(final SubLObject v_term) {
        return reset_term_index(v_term, new_intermediate_index(Symbols.symbol_function((SubLObject)kb_indexing_datastructures.EQ)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 42623L)
    public static SubLObject free_intermediate_index(final SubLObject intermediate_index) {
        return map_utilities.map_remove_all(intermediate_index_map(intermediate_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 42829L)
    public static SubLObject intermediate_index_leaf_count_reset(final SubLObject intermediate_index, final SubLObject new_count) {
        return ConsesLow.rplaca(intermediate_index, new_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 43162L)
    public static SubLObject intermediate_index_leaf_count_inc(final SubLObject intermediate_index, final SubLObject delta) {
        final SubLObject old_count = intermediate_index_leaf_count(intermediate_index);
        final SubLObject new_count = Numbers.add(old_count, delta);
        intermediate_index_leaf_count_reset(intermediate_index, new_count);
        return intermediate_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 43447L)
    public static SubLObject intermediate_index_lookup_or_create_intermediate(final SubLObject intermediate_index, final SubLObject key, final SubLObject key_history) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        final SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (kb_indexing_datastructures.NIL != subindex) {
            return subindex;
        }
        final SubLObject equality_test = kb_indexing_declarations.index_equality_test_for_keys(key_history);
        final SubLObject subindex2 = new_intermediate_index(equality_test);
        intermediate_index_set(intermediate_index, key, subindex2);
        return subindex2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 44148L)
    public static SubLObject intermediate_index_lookup_or_create_final(final SubLObject intermediate_index, final SubLObject key) {
        assert kb_indexing_datastructures.NIL != intermediate_index_p(intermediate_index) : intermediate_index;
        SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if (kb_indexing_datastructures.NIL != subindex) {
            return subindex;
        }
        subindex = new_final_index();
        intermediate_index_set(intermediate_index, key, subindex);
        return subindex;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 44553L)
    public static SubLObject intermediate_index_map(final SubLObject intermediate_index) {
        return intermediate_index.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 44772L)
    public static SubLObject intermediate_index_map_set(final SubLObject intermediate_index, final SubLObject key, final SubLObject value) {
        assert kb_indexing_datastructures.NIL != subindex_p(value) : value;
        return map_utilities.map_put(intermediate_index_map(intermediate_index), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 44952L)
    public static SubLObject intermediate_index_map_delete_key(final SubLObject intermediate_index, final SubLObject key) {
        return map_utilities.map_remove(intermediate_index_map(intermediate_index), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 45098L)
    public static SubLObject intermediate_index_map_touch(final SubLObject intermediate_index, final SubLObject key) {
        return map_utilities.map_touch(intermediate_index_map(intermediate_index), key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 45238L)
    public static SubLObject final_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != final_unified_index_p(v_object) || kb_indexing_datastructures.NIL != final_sharded_index_p(v_object) || kb_indexing_datastructures.NIL != final_topn_index_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 45613L)
    public static SubLObject final_index_installed_p(final SubLObject v_object) {
        return final_index_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 45823L)
    public static SubLObject final_index_not_hosed_p(final SubLObject v_object) {
        return final_index_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 46043L)
    public static SubLObject new_final_index() {
        return new_final_unified_index();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 46162L)
    public static SubLObject do_final_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        final_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$8 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list78);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list78);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$8, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$8 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list78);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject index = (SubLObject)kb_indexing_datastructures.$sym79$INDEX;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, final_index)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym80$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym81$NULL, index)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym82$FINAL_UNIFIED_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym83$DO_FINAL_UNIFIED_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym84$FINAL_SHARDED_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym85$DO_FINAL_SHARDED_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym86$FINAL_TOPN_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym87$DO_FINAL_TOPN_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.T, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym88$ENFORCE_TYPE, index, (SubLObject)kb_indexing_datastructures.$list89))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 47130L)
    public static SubLObject do_ordered_final_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list78);
        final_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$9 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list78);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list78);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$9, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$9 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list78);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject index = (SubLObject)kb_indexing_datastructures.$sym90$INDEX;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index, final_index)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)kb_indexing_datastructures.$list91, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym80$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym81$NULL, index)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym82$FINAL_UNIFIED_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym92$DO_ORDERED_FINAL_UNIFIED_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym84$FINAL_SHARDED_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym93$DO_ORDERED_FINAL_SHARDED_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym86$FINAL_TOPN_INDEX_P, index), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym94$DO_ORDERED_FINAL_TOPN_INDEX_INTERNAL, (SubLObject)ConsesLow.list(leaf_var, index, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.T, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym88$ENFORCE_TYPE, index, (SubLObject)kb_indexing_datastructures.$list89)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 48038L)
    public static SubLObject final_index_leaf_count(final SubLObject final_index) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaf_count(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaf_count(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaf_count(final_index);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 48659L)
    public static SubLObject final_index_leaves(final SubLObject final_index) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaves(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaves(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaves(final_index);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 49235L)
    public static SubLObject final_index_memberP(final SubLObject final_index, final SubLObject leaf) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_memberP(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_memberP(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_memberP(final_index, leaf);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 49780L)
    public static SubLObject final_index_arbitrary_leaf(final SubLObject final_index) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_arbitrary_leaf(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_arbitrary_leaf(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_arbitrary_leaf(final_index);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 50445L)
    public static SubLObject final_index_leaves_reset(final SubLObject final_index, final SubLObject new_leaves) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_leaves_reset(final_index, new_leaves);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_leaves_reset(final_index, new_leaves);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_leaves_reset(final_index, new_leaves);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 51148L)
    public static SubLObject final_index_insert(final SubLObject final_index, final SubLObject leaf) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_insert(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_insert(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_insert(final_index, leaf);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 51843L)
    public static SubLObject final_index_delete(final SubLObject final_index, final SubLObject leaf) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return final_unified_index_delete(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return final_sharded_index_delete(final_index, leaf);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_topn_index_delete(final_index, leaf);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 52538L)
    public static SubLObject new_final_index_base_iterator(final SubLObject final_index) {
        if (kb_indexing_datastructures.NIL != final_unified_index_p(final_index)) {
            return new_final_unified_index_iterator(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_sharded_index_p(final_index)) {
            return new_final_sharded_index_iterator(final_index);
        }
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return new_final_topn_index_iterator(final_index);
        }
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 53099L)
    public static SubLObject free_final_index(final SubLObject final_index) {
        return final_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 53281L)
    public static SubLObject final_unified_index_p(final SubLObject v_object) {
        return set.set_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 53852L)
    public static SubLObject final_unified_index_installed_p(final SubLObject v_object) {
        return final_unified_index_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 54086L)
    public static SubLObject final_unified_index_not_hosed_p(final SubLObject v_object) {
        return final_unified_index_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 54330L)
    public static SubLObject new_final_unified_index() {
        return set.new_set((SubLObject)kb_indexing_datastructures.EQL, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 54413L)
    public static SubLObject do_final_unified_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_unified_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        final_unified_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$10 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list95);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list95);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$10, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$10 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list95);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym96$DO_SET, (SubLObject)ConsesLow.list(leaf_var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym97$FINAL_UNIFIED_INDEX_SET, final_unified_index), (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 54825L)
    public static SubLObject do_ordered_final_unified_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_unified_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list95);
        final_unified_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$11 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list95);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list95);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$11, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$11 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list95);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject leaf_items = (SubLObject)kb_indexing_datastructures.$sym98$LEAF_ITEMS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(leaf_items, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym99$SET_ELEMENT_LIST, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym97$FINAL_UNIFIED_INDEX_SET, final_unified_index)))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym100$CSETQ, leaf_items, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym101$SORT_ASSERTIONS, leaf_items)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym67$CSOME, (SubLObject)ConsesLow.list(leaf_var, leaf_items, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 55266L)
    public static SubLObject final_unified_index_leaf_count(final SubLObject final_unified_index) {
        return set.set_size(final_unified_index_set(final_unified_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 55626L)
    public static SubLObject final_unified_index_leaves(final SubLObject final_unified_index) {
        return set.set_element_list(final_unified_index_set(final_unified_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 55953L)
    public static SubLObject final_unified_index_memberP(final SubLObject final_unified_index, final SubLObject leaf) {
        return set.set_memberP(leaf, final_unified_index_set(final_unified_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 56231L)
    public static SubLObject final_unified_index_arbitrary_leaf(final SubLObject final_unified_index) {
        return set_utilities.set_arbitrary_element(final_unified_index_set(final_unified_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 56644L)
    public static SubLObject final_unified_index_leaves_reset(final SubLObject final_unified_index, final SubLObject new_leaves) {
        final SubLObject v_set = final_unified_index_set(final_unified_index);
        set.clear_set(v_set);
        SubLObject cdolist_list_var = new_leaves;
        SubLObject leaf = (SubLObject)kb_indexing_datastructures.NIL;
        leaf = cdolist_list_var.first();
        while (kb_indexing_datastructures.NIL != cdolist_list_var) {
            set.set_add(leaf, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            leaf = cdolist_list_var.first();
        }
        return final_unified_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 57047L)
    public static SubLObject final_unified_index_insert(final SubLObject final_unified_index, final SubLObject leaf) {
        set.set_add(leaf, final_unified_index_set(final_unified_index));
        return final_unified_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 57402L)
    public static SubLObject final_unified_index_delete(final SubLObject final_unified_index, final SubLObject leaf) {
        set.set_remove(leaf, final_unified_index_set(final_unified_index));
        return final_unified_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 57760L)
    public static SubLObject final_unified_index_is_shardableP(final SubLObject final_unified_index) {
        return final_index_set_is_shardableP(final_unified_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 57896L)
    public static SubLObject new_final_unified_index_iterator(final SubLObject final_unified_index) {
        return set.new_set_iterator(final_unified_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 58032L)
    public static SubLObject free_final_unified_index(final SubLObject final_unified_index) {
        return final_unified_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 58246L)
    public static SubLObject final_unified_index_set(final SubLObject final_unified_index) {
        return final_unified_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 59483L)
    public static SubLObject final_index_set_is_shardableP(final SubLObject v_set) {
        return Numbers.numGE(set.set_size(v_set), kb_indexing_datastructures.$final_sharded_index_shard_size$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 59597L)
    public static SubLObject new_final_sharded_index(final SubLObject index_count, final SubLObject keys, final SubLObject shard_map) {
        return (SubLObject)ConsesLow.list(index_count, keys, shard_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 59726L)
    public static SubLObject finshard_index_leaf_count(final SubLObject index) {
        return index.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 59868L)
    public static SubLObject set_finshard_index_leaf_count(final SubLObject index, final SubLObject count) {
        ConsesLow.set_nth((SubLObject)kb_indexing_datastructures.ZERO_INTEGER, index, count);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 59970L)
    public static SubLObject finshard_index_keys(final SubLObject index) {
        return conses_high.second(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60091L)
    public static SubLObject set_finshard_index_keys(final SubLObject index, final SubLObject new_keys) {
        ConsesLow.set_nth((SubLObject)kb_indexing_datastructures.ONE_INTEGER, index, new_keys);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60193L)
    public static SubLObject finshard_index_map(final SubLObject index) {
        return conses_high.third(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60339L)
    public static SubLObject set_finshard_index_map(final SubLObject index, final SubLObject new_map) {
        ConsesLow.set_nth((SubLObject)kb_indexing_datastructures.TWO_INTEGER, index, new_map);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60438L)
    public static SubLObject final_sharded_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != list_utilities.proper_list_p(v_object) && kb_indexing_datastructures.NIL != subl_promotions.non_negative_integer_p(finshard_index_leaf_count(v_object)) && finshard_index_keys(v_object).isVector() && kb_indexing_datastructures.NIL != map_utilities.map_p(finshard_index_map(v_object)) && kb_indexing_datastructures.NIL == conses_high.fourth(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60785L)
    public static SubLObject final_sharded_index_empty_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL != final_sharded_index_p(v_object) && kb_indexing_datastructures.NIL != map_utilities.map_empty_p(finshard_index_map(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 60985L)
    public static SubLObject final_sharded_index_leaf_count(final SubLObject final_sharded_index) {
        return finshard_index_leaf_count(final_sharded_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 61336L)
    public static SubLObject final_sharded_index_leaves(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject leaf_count = finshard_index_leaf_count(final_sharded_index);
        SubLObject cursor;
        final SubLObject leaves = cursor = (SubLObject)ConsesLow.make_list(leaf_count, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(finshard_index_map(final_sharded_index));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_indexing_datastructures.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
                SubLObject shard = (SubLObject)kb_indexing_datastructures.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list105);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list105);
                shard = current.first();
                current = current.rest();
                if (kb_indexing_datastructures.NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            ConsesLow.rplaca(cursor, leaf);
                            cursor = cursor.rest();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list105);
                }
            }
        }
        return leaves;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 62011L)
    public static SubLObject final_sharded_index_memberP(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject shard = finshard_index_find_shard(final_sharded_index, leaf);
        if (kb_indexing_datastructures.NIL != set.set_p(shard)) {
            return set.set_memberP(leaf, shard);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 62363L)
    public static SubLObject finshard_index_find_shard(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        if (kb_indexing_datastructures.NIL != subl_promotions.non_negative_integer_p(key_index)) {
            final SubLObject keys = finshard_index_keys(final_sharded_index);
            final SubLObject covering_key = Vectors.aref(keys, key_index);
            return map_utilities.map_get(finshard_index_map(final_sharded_index), covering_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 62883L)
    public static SubLObject finshard_index_find_shard_key_index(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject leaf_suid = indexing_leaf_suid(leaf);
        SubLObject right_wall = Numbers.subtract(Sequences.length(keys), (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
        final SubLObject max_shard_suid = Vectors.aref(keys, right_wall);
        if (max_shard_suid.numL(leaf_suid)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        SubLObject left_wall = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER;
        while (left_wall.numLE(right_wall)) {
            final SubLObject mid = Numbers.integerDivide(Numbers.add(left_wall, right_wall), (SubLObject)kb_indexing_datastructures.TWO_INTEGER);
            final SubLObject mid_shard_suid = Vectors.aref(keys, mid);
            if (mid_shard_suid.numL(leaf_suid)) {
                left_wall = Numbers.add((SubLObject)kb_indexing_datastructures.ONE_INTEGER, mid);
            }
            else {
                if (!mid_shard_suid.numG(leaf_suid)) {
                    return mid;
                }
                right_wall = Numbers.subtract(mid, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
            }
        }
        return (SubLObject)(left_wall.numL(Sequences.length(keys)) ? left_wall : kb_indexing_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 64253L)
    public static SubLObject final_sharded_index_arbitrary_leaf(final SubLObject final_sharded_index) {
        if (kb_indexing_datastructures.NIL != final_sharded_index_empty_p(final_sharded_index)) {
            return (SubLObject)kb_indexing_datastructures.NIL;
        }
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject leaf_key = map_utilities.map_arbitrary_key(shard_map, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        final SubLObject leaf = set_utilities.set_arbitrary_element(map_utilities.map_get(shard_map, leaf_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED));
        return leaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 64916L)
    public static SubLObject do_final_sharded_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_sharded_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        final_sharded_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$12 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list106);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list106);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$12, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$12 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list106);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject ignored_key = (SubLObject)kb_indexing_datastructures.$sym107$IGNORED_KEY;
        final SubLObject shard = (SubLObject)kb_indexing_datastructures.$sym108$SHARD;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym57$DO_MAP, (SubLObject)ConsesLow.list(ignored_key, shard, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym109$FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index), (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym110$IGNORE, ignored_key), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym96$DO_SET, (SubLObject)ConsesLow.list(leaf_var, shard, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 65462L)
    public static SubLObject do_ordered_final_sharded_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_sharded_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list106);
        final_sharded_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$13 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list106);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list106);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$13, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$13 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list106);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject shard_key_list = (SubLObject)kb_indexing_datastructures.$sym111$SHARD_KEY_LIST;
        final SubLObject key = (SubLObject)kb_indexing_datastructures.$sym112$KEY;
        final SubLObject shard = (SubLObject)kb_indexing_datastructures.$sym113$SHARD;
        final SubLObject shard_contents = (SubLObject)kb_indexing_datastructures.$sym114$SHARD_CONTENTS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(shard_key_list, (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym115$SORT, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym116$MAP_KEYS, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym109$FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index)), (SubLObject)kb_indexing_datastructures.$list117)), (SubLObject)ConsesLow.list(shard_contents)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym67$CSOME, (SubLObject)ConsesLow.list(key, shard_key_list, done), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(shard, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym118$MAP_GET, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym109$FINAL_SHARDED_INDEX_SHARD_MAP, final_sharded_index), key))), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym100$CSETQ, shard_contents, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym119$ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS, shard, shard_contents)), (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym120$DO_VECTOR, (SubLObject)ConsesLow.list(leaf_var, shard_contents, (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym55$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym121$ASSERTION_P, leaf_var), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 66482L)
    public static SubLObject final_sharded_index_shard_map(final SubLObject final_sharded_index) {
        return finshard_index_map(final_sharded_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 66666L)
    public static SubLObject ordered_final_sharded_index_extract_contents(final SubLObject shard, SubLObject contents) {
        SubLObject contents_size = (SubLObject)(contents.isVector() ? kb_indexing_datastructures.ZERO_INTEGER : Sequences.length(contents));
        final SubLObject shard_size = set.set_size(shard);
        if (contents_size.numL(shard_size)) {
            contents_size = shard_size;
            contents = Vectors.make_vector(shard_size, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        SubLObject index = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal(shard);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, item)) {
                Vectors.set_aref(contents, index, item);
                index = Numbers.add(index, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
            }
        }
        while (index.numL(contents_size)) {
            Vectors.set_aref(contents, index, (SubLObject)kb_indexing_datastructures.NIL);
            index = Numbers.add(index, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
        }
        Sort.sort(contents, (SubLObject)kb_indexing_datastructures.$sym122$POSSIBLE_ASSERTION_, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        return contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 67511L)
    public static SubLObject possible_assertionL(final SubLObject a1, final SubLObject a2) {
        if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(a1)) {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(a2)) {
                return assertion_handles.assertion_id(a1).numL(assertion_handles.assertion_id(a2)) ? a1 : a2;
            }
            return a1;
        }
        else {
            if (kb_indexing_datastructures.NIL != assertion_handles.assertion_p(a2)) {
                return a2;
            }
            return a1;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 67862L)
    public static SubLObject increment_finshard_index_leaf_count(final SubLObject index, SubLObject amount) {
        if (amount == kb_indexing_datastructures.UNPROVIDED) {
            amount = (SubLObject)kb_indexing_datastructures.ONE_INTEGER;
        }
        set_finshard_index_leaf_count(index, Numbers.add(finshard_index_leaf_count(index), amount));
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 68095L)
    public static SubLObject decrement_finshard_index_leaf_count(final SubLObject index, SubLObject amount) {
        if (amount == kb_indexing_datastructures.UNPROVIDED) {
            amount = (SubLObject)kb_indexing_datastructures.ONE_INTEGER;
        }
        set_finshard_index_leaf_count(index, Numbers.subtract(finshard_index_leaf_count(index), amount));
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 68314L)
    public static SubLObject append_finshard_index_keys(final SubLObject index, final SubLObject new_key) {
        final SubLObject bigger_keys = vector_utilities.extend_vector(finshard_index_keys(index), (SubLObject)kb_indexing_datastructures.ONE_INTEGER, new_key);
        set_finshard_index_keys(index, bigger_keys);
        return bigger_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 68524L)
    public static SubLObject final_sharded_index_leaves_reset(final SubLObject final_sharded_index, final SubLObject new_leaves) {
        final SubLObject new_index = create_final_sharded_index(new_leaves);
        set_finshard_index_leaf_count(final_sharded_index, finshard_index_leaf_count(new_index));
        set_finshard_index_keys(final_sharded_index, finshard_index_keys(new_index));
        set_finshard_index_map(final_sharded_index, finshard_index_map(new_index));
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 69119L)
    public static SubLObject final_sharded_index_insert(final SubLObject final_sharded_index, final SubLObject leaf) {
        return final_sharded_index_insert_internal(final_sharded_index, leaf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 69393L)
    public static SubLObject final_sharded_index_insert_internal(final SubLObject final_sharded_index, final SubLObject leaf) {
        SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        if (kb_indexing_datastructures.NIL != shard_key_index) {
            final SubLObject shard_key = Vectors.aref(keys, shard_key_index);
            map_utilities.map_touch(shard_map, shard_key);
            return final_sharded_index_insert_into_shard(final_sharded_index, leaf, map_utilities.map_get(shard_map, shard_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED));
        }
        final SubLObject right_wall = Numbers.subtract(Sequences.length(keys), (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
        final SubLObject last_key = Vectors.aref(keys, right_wall);
        final SubLObject shard = map_utilities.map_get(shard_map, last_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        final SubLObject new_key = indexing_leaf_suid(leaf);
        if (kb_indexing_datastructures.NIL != final_index_set_is_shardableP(shard)) {
            final SubLObject new_shard = new_final_unified_index();
            keys = append_finshard_index_keys(final_sharded_index, new_key);
            map_utilities.map_put(shard_map, new_key, new_shard);
            return final_sharded_index_insert_into_shard(final_sharded_index, leaf, new_shard);
        }
        map_utilities.map_remove(shard_map, last_key);
        map_utilities.map_put(shard_map, new_key, shard);
        Vectors.set_aref(keys, right_wall, new_key);
        return final_sharded_index_insert_into_shard(final_sharded_index, leaf, shard);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 71690L)
    public static SubLObject final_sharded_index_insert_into_shard(final SubLObject final_sharded_index, final SubLObject leaf, final SubLObject shard) {
        final SubLObject pre_size = set.set_size(shard);
        set.set_add(leaf, shard);
        if (!pre_size.numE(set.set_size(shard))) {
            increment_finshard_index_leaf_count(final_sharded_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        }
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 71979L)
    public static SubLObject final_sharded_index_delete(final SubLObject final_sharded_index, final SubLObject leaf) {
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_key_index = finshard_index_find_shard_key_index(final_sharded_index, leaf);
        final SubLObject shard_key = (SubLObject)((kb_indexing_datastructures.NIL != shard_key_index) ? Vectors.aref(keys, shard_key_index) : kb_indexing_datastructures.NIL);
        final SubLObject shard = map_utilities.map_get(shard_map, shard_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        if (kb_indexing_datastructures.NIL != set.set_p(shard)) {
            final SubLObject pre_size = set.set_size(shard);
            set.set_remove(leaf, shard);
            if (!pre_size.numE(set.set_size(shard))) {
                map_utilities.map_touch(shard_map, shard_key);
                decrement_finshard_index_leaf_count(final_sharded_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
            }
        }
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 73291L)
    public static SubLObject reshard_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject leaf_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject leaves = Vectors.make_vector(leaf_count, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        SubLObject cursor = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(finshard_index_map(final_sharded_index));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_indexing_datastructures.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)kb_indexing_datastructures.NIL;
                SubLObject shard = (SubLObject)kb_indexing_datastructures.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list105);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list105);
                shard = current.first();
                current = current.rest();
                if (kb_indexing_datastructures.NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            Vectors.set_aref(leaves, cursor, leaf);
                            cursor = Numbers.add(cursor, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list105);
                }
            }
        }
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !cursor.numE(leaf_count)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str123$Index_count_was__A__yet_we_copied, leaf_count, cursor);
        }
        return ncreate_final_sharded_index(leaves);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 73992L)
    public static SubLObject convert_final_simple_index_to_sharded_index(final SubLObject final_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_set = final_unified_index_set(final_index);
        final SubLObject leaf_count = set.set_size(index_set);
        final SubLObject leaves = Vectors.make_vector(leaf_count, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        SubLObject cursor = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER;
        final SubLObject set_contents_var = set.do_set_internal(index_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject leaf;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            leaf = set_contents.do_set_contents_next(basis_object, state);
            if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                Vectors.set_aref(leaves, cursor, leaf);
                cursor = Numbers.add(cursor, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
            }
        }
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !cursor.numE(leaf_count)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str123$Index_count_was__A__yet_we_copied, leaf_count, cursor);
        }
        return ncreate_final_sharded_index(leaves);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 74608L)
    public static SubLObject create_final_sharded_index(final SubLObject leaves) {
        return ncreate_final_sharded_index(list_utilities.list2vector(leaves));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 74888L)
    public static SubLObject ncreate_final_sharded_index(final SubLObject leaves) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordered_leaves = Sort.sort(leaves, (SubLObject)kb_indexing_datastructures.$sym124$_, (SubLObject)kb_indexing_datastructures.$sym125$INDEXING_LEAF_SUID);
        final SubLObject index_count = Sequences.length(ordered_leaves);
        final SubLObject shard_count = Numbers.ceiling(index_count, kb_indexing_datastructures.$final_sharded_index_shard_size$.getGlobalValue());
        final SubLObject shard_map = dictionary.new_dictionary((SubLObject)kb_indexing_datastructures.EQL, shard_count);
        SubLObject shard = new_final_unified_index();
        SubLObject last_leaf = (SubLObject)kb_indexing_datastructures.NIL;
        for (SubLObject sequence_var = ordered_leaves, end_index = (SubLObject)(sequence_var.isList() ? kb_indexing_datastructures.NIL : Sequences.length(sequence_var)), element_num = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); kb_indexing_datastructures.NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
            final SubLObject leaf = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
            set.set_add(leaf, shard);
            if (kb_indexing_datastructures.NIL != final_index_set_is_shardableP(shard)) {
                final SubLObject leaf_suid = indexing_leaf_suid(leaf);
                map_utilities.map_put(shard_map, leaf_suid, shard);
                shard = new_final_unified_index();
            }
            last_leaf = leaf;
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            element_num = Numbers.add(element_num, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
        }
        if (kb_indexing_datastructures.NIL == set.set_emptyP(shard)) {
            final SubLObject leaf_suid2 = indexing_leaf_suid(last_leaf);
            map_utilities.map_put(shard_map, leaf_suid2, shard);
        }
        final SubLObject keys = Sort.sort(list_utilities.list2vector(map_utilities.map_keys(shard_map)), (SubLObject)kb_indexing_datastructures.$sym124$_, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        final SubLObject key_count = Sequences.length(keys);
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !key_count.numE(shard_count)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str126$Implementation_error__shard_count, shard_count, key_count);
        }
        return new_final_sharded_index(index_count, keys, shard_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 76251L)
    public static SubLObject reorganize_modified_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLObject index_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject keys = Sequences.copy_seq(finshard_index_keys(final_sharded_index));
        final SubLObject old_shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_map = dictionary.new_dictionary((SubLObject)kb_indexing_datastructures.EQL, map_utilities.map_size(old_shard_map));
        SubLObject cdolist_list_var;
        final SubLObject changed_keys = cdolist_list_var = map_utilities.map_change_set(old_shard_map, shard_map);
        SubLObject changed_key = (SubLObject)kb_indexing_datastructures.NIL;
        changed_key = cdolist_list_var.first();
        while (kb_indexing_datastructures.NIL != cdolist_list_var) {
            final SubLObject changed_value = map_utilities.map_get(old_shard_map, changed_key, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
            map_utilities.map_put(shard_map, changed_key, changed_value);
            cdolist_list_var = cdolist_list_var.rest();
            changed_key = cdolist_list_var.first();
        }
        return new_final_sharded_index(index_count, keys, shard_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 77202L)
    public static SubLObject final_sharded_index_to_fvector_backed_sharded_index(final SubLObject final_sharded_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject paged_map = file_vector_utilities.convert_map_to_file_vector_backed_map(finshard_index_map(final_sharded_index), fvector, (SubLObject)kb_indexing_datastructures.$kw127$SWAPPED_OUT, (SubLObject)kb_indexing_datastructures.$kw128$COMPACT);
        final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(paged_map, indexical);
        set_finshard_index_map(final_sharded_index, backed_map);
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 77707L)
    public static SubLObject update_fvector_backed_final_sharded_index(final SubLObject final_sharded_index, final SubLObject fvector, final SubLObject indexical) {
        final SubLObject paged_map = file_vector_utilities.upgrade_map_to_file_vector_backed_map(finshard_index_map(final_sharded_index), fvector, (SubLObject)kb_indexing_datastructures.$kw127$SWAPPED_OUT);
        final SubLObject backed_map = file_vector_utilities.new_indexical_backed_map(paged_map, indexical);
        set_finshard_index_map(final_sharded_index, backed_map);
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 78115L)
    public static SubLObject validate_final_sharded_index(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject leaf_count = final_sharded_index_leaf_count(final_sharded_index);
        final SubLObject keys = finshard_index_keys(final_sharded_index);
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        final SubLObject shard_count = map_utilities.map_size(shard_map);
        final SubLObject keys_lenght = Sequences.length(keys);
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !shard_count.numE(keys_lenght)) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str129$Shard_count_of__A_does_not_match_, shard_count, keys_lenght);
        }
        SubLObject test_keys = map_utilities.map_keys(shard_map);
        test_keys = Sort.sort(test_keys, (SubLObject)kb_indexing_datastructures.$sym124$_, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        SubLObject i;
        SubLObject expected_key;
        SubLObject actual_key;
        for (i = (SubLObject)kb_indexing_datastructures.NIL, i = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER; i.numL(shard_count); i = Numbers.add(i, (SubLObject)kb_indexing_datastructures.ONE_INTEGER)) {
            expected_key = Sequences.elt(test_keys, i);
            actual_key = Sequences.elt(keys, i);
            if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_key.numE(actual_key)) {
                Errors.error((SubLObject)kb_indexing_datastructures.$str130$Shard_key___A_is_wrong____we_expe, i, expected_key, actual_key);
            }
        }
        final SubLObject iterator = map_utilities.new_map_iterator(shard_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_indexing_datastructures.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject max_suid = (SubLObject)kb_indexing_datastructures.NIL;
                SubLObject shard = (SubLObject)kb_indexing_datastructures.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list131);
                max_suid = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list131);
                shard = current.first();
                current = current.rest();
                if (kb_indexing_datastructures.NIL == current) {
                    final SubLObject set_contents_var = set.do_set_internal(shard);
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject leaf;
                    SubLObject leaf_suid;
                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        leaf = set_contents.do_set_contents_next(basis_object, state);
                        if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                            leaf_suid = indexing_leaf_suid(leaf);
                            if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !leaf_suid.numLE(max_suid)) {
                                Errors.error((SubLObject)kb_indexing_datastructures.$str132$Shard_with_max_ID__A_contains_lea, max_suid, leaf, leaf_suid);
                            }
                            leaf_count = Numbers.subtract(leaf_count, (SubLObject)kb_indexing_datastructures.ONE_INTEGER);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list131);
                }
            }
        }
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !leaf_count.isZero()) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str133$We_expected_to_find__A_leaves__bu, final_sharded_index_leaf_count(final_sharded_index), leaf_count);
        }
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 79765L)
    public static SubLObject new_final_sharded_index_iterator(final SubLObject final_sharded_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject shard_map = finshard_index_map(final_sharded_index);
        SubLObject iterators = (SubLObject)kb_indexing_datastructures.NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(shard_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_indexing_datastructures.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject max_suid = (SubLObject)kb_indexing_datastructures.NIL;
                SubLObject shard = (SubLObject)kb_indexing_datastructures.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list131);
                max_suid = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list131);
                shard = current.first();
                current = current.rest();
                if (kb_indexing_datastructures.NIL == current) {
                    iterators = (SubLObject)ConsesLow.cons(set.new_set_iterator(shard), iterators);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list131);
                }
            }
        }
        return iteration.new_iterator_iterator(iterators);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 80153L)
    public static SubLObject free_final_sharded_index(final SubLObject final_sharded_index) {
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 80367L)
    public static SubLObject final_sharded_index_set(final SubLObject final_sharded_index) {
        return final_sharded_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 81394L)
    public static SubLObject with_final_topn_index_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list136);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject newbies = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list136);
        newbies = current.first();
        current = current.rest();
        if (kb_indexing_datastructures.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)kb_indexing_datastructures.$list137, reader.bq_cons((SubLObject)kb_indexing_datastructures.$sym28$PROGN, ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL)), (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym100$CSETQ, newbies, (SubLObject)kb_indexing_datastructures.$list138));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list136);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 81762L)
    public static SubLObject without_final_topn_index_tracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym9$CLET, (SubLObject)kb_indexing_datastructures.$list139, ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 81939L)
    public static SubLObject possibly_note_new_final_topn_index(final SubLObject v_term, final SubLObject key_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL != kb_indexing_datastructures.$with_final_topn_index_tracking$.getDynamicValue(thread)) {
            kb_indexing_datastructures.$recent_final_topn_indices$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(v_term, key_path), kb_indexing_datastructures.$recent_final_topn_indices$.getDynamicValue(thread)), thread);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 82125L)
    public static SubLObject final_topn_index_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && kb_indexing_datastructures.NIL != list_utilities.lengthE(v_object, (SubLObject)kb_indexing_datastructures.THREE_INTEGER, (SubLObject)kb_indexing_datastructures.UNPROVIDED) && kb_indexing_datastructures.NIL != subl_promotions.non_negative_integer_p(v_object.first()) && kb_indexing_datastructures.NIL != indexed_term_p(conses_high.second(v_object)) && conses_high.third(v_object).isCons());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 82492L)
    public static SubLObject final_topn_index_count(final SubLObject final_topn_index) {
        return ConsesLow.nth((SubLObject)kb_indexing_datastructures.ZERO_INTEGER, final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 82627L)
    public static SubLObject set_final_topn_index_count(final SubLObject final_topn_index, final SubLObject number) {
        enforceType(number, kb_indexing_datastructures.$sym140$NON_NEGATIVE_INTEGER_P);
        ConsesLow.set_nth((SubLObject)kb_indexing_datastructures.ZERO_INTEGER, final_topn_index, number);
        return final_topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 82809L)
    public static SubLObject inc_final_topn_index_count(final SubLObject final_topn_index, SubLObject offset) {
        if (offset == kb_indexing_datastructures.UNPROVIDED) {
            offset = (SubLObject)kb_indexing_datastructures.ONE_INTEGER;
        }
        set_final_topn_index_count(final_topn_index, Numbers.add(offset, final_topn_index_count(final_topn_index)));
        return final_topn_index_count(final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83089L)
    public static SubLObject dec_final_topn_index_count(final SubLObject final_topn_index, SubLObject offset) {
        if (offset == kb_indexing_datastructures.UNPROVIDED) {
            offset = (SubLObject)kb_indexing_datastructures.ONE_INTEGER;
        }
        return inc_final_topn_index_count(final_topn_index, Numbers.minus(offset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83283L)
    public static SubLObject final_topn_index_term(final SubLObject final_topn_index) {
        return ConsesLow.nth((SubLObject)kb_indexing_datastructures.ONE_INTEGER, final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83375L)
    public static SubLObject final_topn_index_key_path(final SubLObject final_topn_index) {
        return ConsesLow.nth((SubLObject)kb_indexing_datastructures.TWO_INTEGER, final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83471L)
    public static SubLObject final_topn_index_installed_p(final SubLObject final_topn_index) {
        return final_topn_index_p(final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83716L)
    public static SubLObject final_topn_index_not_hosed_p(final SubLObject final_topn_index) {
        return final_topn_index_p(final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 83971L)
    public static SubLObject new_final_topn_index(final SubLObject v_term, final SubLObject key_path, SubLObject count) {
        if (count == kb_indexing_datastructures.UNPROVIDED) {
            count = (SubLObject)kb_indexing_datastructures.ZERO_INTEGER;
        }
        final SubLObject topn_index = (SubLObject)ConsesLow.list(count, v_term, key_path);
        if (count.isZero()) {
            Errors.warn((SubLObject)kb_indexing_datastructures.$str141$__Creating_empty_TOP_N_index__A_o, key_path, v_term);
        }
        possibly_note_new_final_topn_index(v_term, key_path);
        return topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 84352L)
    public static SubLObject upgrade_final_index(final SubLObject final_index) {
        enforceType(final_index, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
        if (kb_indexing_datastructures.NIL != final_topn_index_p(final_index)) {
            return final_index;
        }
        final SubLObject v_term = current_complex_index_term();
        final SubLObject key_path = copy_current_complex_index_keys();
        final SubLObject count = final_index_leaf_count(final_index);
        Errors.warn((SubLObject)kb_indexing_datastructures.$str142$Upgrading_index__A_on__A___A_item, key_path, v_term, count);
        return new_final_topn_index(v_term, key_path, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 84953L)
    public static SubLObject new_final_topn_index_iterator(final SubLObject final_topn_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject msg = (SubLObject)kb_indexing_datastructures.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_indexing_datastructures.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Errors.error((SubLObject)kb_indexing_datastructures.$str144$Final_Top_N_index_iterator_for__A, final_topn_index);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_indexing_datastructures.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        Errors.warn((SubLObject)kb_indexing_datastructures.$str145$_A__, msg);
        return iteration.new_filter_iterator(assertion_handles.new_assertions_iterator(), (SubLObject)kb_indexing_datastructures.$sym146$ASSERTION_MATCHES_FINAL_TOPN_INDEXKEY_PATH_, final_topn_index_iterator_build_filter_args(final_topn_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 85464L)
    public static SubLObject final_topn_index_iterator_build_filter_args(final SubLObject final_topn_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = final_topn_index_term(final_topn_index);
        final SubLObject keys = final_topn_index_key_path(final_topn_index);
        final SubLObject top_key = keys.first();
        final SubLObject index = kb_indexing_declarations.find_index_by_top_level_key(top_key);
        final SubLObject subkeys = keys.rest();
        final SubLObject matcher_fn = kb_indexing_declarations.get_index_prop(index, (SubLObject)kb_indexing_datastructures.$kw147$SIMPLE_MATCH_FUNCTION);
        if (kb_indexing_datastructures.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !matcher_fn.isFunctionSpec()) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str148$No_match_function_available_for_d, keys, v_term);
        }
        final SubLObject args = (SubLObject)ConsesLow.cons(v_term, subkeys);
        return (SubLObject)ConsesLow.list(matcher_fn, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 86187L)
    public static SubLObject assertion_matches_final_topn_indexkey_pathP(final SubLObject assertion, final SubLObject matcher_fn, final SubLObject args) {
        return Functions.apply(matcher_fn, assertion, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 86383L)
    public static SubLObject new_ordered_final_topn_index_iterator(final SubLObject final_topn_index) {
        return new_final_topn_index_iterator(final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 86605L)
    public static SubLObject do_final_topn_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_topn_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        final_topn_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$14 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list149);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list149);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$14, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$14 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list149);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym18$DO_ITERATOR, (SubLObject)ConsesLow.list(leaf_var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym150$NEW_FINAL_TOPN_INDEX_ITERATOR, final_topn_index), (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 86865L)
    public static SubLObject do_ordered_final_topn_index_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject leaf_var = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject final_topn_index = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        leaf_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list149);
        final_topn_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject current_$15 = (SubLObject)kb_indexing_datastructures.NIL;
        while (kb_indexing_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list149);
            current_$15 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_indexing_datastructures.$list149);
            if (kb_indexing_datastructures.NIL == conses_high.member(current_$15, (SubLObject)kb_indexing_datastructures.$list53, (SubLObject)kb_indexing_datastructures.UNPROVIDED, (SubLObject)kb_indexing_datastructures.UNPROVIDED)) {
                bad = (SubLObject)kb_indexing_datastructures.T;
            }
            if (current_$15 == kb_indexing_datastructures.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_indexing_datastructures.NIL != bad && kb_indexing_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list149);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_indexing_datastructures.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((kb_indexing_datastructures.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_indexing_datastructures.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_indexing_datastructures.$sym18$DO_ITERATOR, (SubLObject)ConsesLow.list(leaf_var, (SubLObject)ConsesLow.list((SubLObject)kb_indexing_datastructures.$sym151$NEW_ORDERED_FINAL_TOPN_INDEX_ITERATOR, final_topn_index), (SubLObject)kb_indexing_datastructures.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)kb_indexing_datastructures.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 87150L)
    public static SubLObject final_topn_index_leaf_count(final SubLObject final_topn_index) {
        return final_topn_index_count(final_topn_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 87411L)
    public static SubLObject final_topn_index_leaves(final SubLObject final_topn_index) {
        return iteration.iterator_value_list(new_final_topn_index_iterator(final_topn_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 87679L)
    public static SubLObject final_topn_index_memberP(final SubLObject final_topn_index, final SubLObject leaf) {
        SubLObject current;
        final SubLObject datum = current = final_topn_index_iterator_build_filter_args(final_topn_index);
        SubLObject matcher_fn = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject args = (SubLObject)kb_indexing_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list152);
        matcher_fn = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list152);
        args = current.first();
        current = current.rest();
        if (kb_indexing_datastructures.NIL == current) {
            return assertion_matches_final_topn_indexkey_pathP(leaf, matcher_fn, args);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list152);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 88066L)
    public static SubLObject final_topn_index_arbitrary_leaf(final SubLObject final_topn_index) {
        return iteration.iteration_next(new_final_topn_index_iterator(final_topn_index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 88341L)
    public static SubLObject final_topn_index_leaves_reset(final SubLObject final_topn_index, final SubLObject new_leaves) {
        set_final_topn_index_count(final_topn_index, Sequences.length(new_leaves));
        return final_topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 88732L)
    public static SubLObject final_topn_index_insert(final SubLObject final_topn_index, final SubLObject leaf) {
        inc_final_topn_index_count(final_topn_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        return final_topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 89092L)
    public static SubLObject final_topn_index_delete(final SubLObject final_topn_index, final SubLObject leaf) {
        dec_final_topn_index_count(final_topn_index, (SubLObject)kb_indexing_datastructures.UNPROVIDED);
        return final_topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 89452L)
    public static SubLObject free_final_topn_index(final SubLObject final_topn_index) {
        return final_topn_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 89654L)
    public static SubLObject indexing_leaf_p(final SubLObject v_object) {
        return assertion_handles.assertion_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 90072L)
    public static SubLObject indexing_leaf_installed_p(final SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, (SubLObject)kb_indexing_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 90289L)
    public static SubLObject indexing_leaf_not_hosed_p(final SubLObject v_object) {
        return assertions_high.valid_assertion(v_object, (SubLObject)kb_indexing_datastructures.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 90504L)
    public static SubLObject indexing_leaf_suid(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL == api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue(thread)) {
            return assertion_handles.assertion_id(v_object);
        }
        return Functions.funcall(api_control_vars.$cfasl_assertion_handle_func$.getDynamicValue(thread), v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 90760L)
    public static SubLObject merge_final_indices(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_index = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject msg = (SubLObject)kb_indexing_datastructures.NIL;
        SubLObject flippedP = (SubLObject)kb_indexing_datastructures.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_indexing_datastructures.$sym143$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (final_index_leaf_count(base).numL(final_index_leaf_count(augment))) {
                        best_index = merge_final_indices_internal(augment, base);
                        flippedP = (SubLObject)kb_indexing_datastructures.T;
                    }
                    else {
                        best_index = merge_final_indices_internal(base, augment);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_indexing_datastructures.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (msg.isString()) {
            Errors.error((SubLObject)kb_indexing_datastructures.$str153$Could_not_merge_final_indices__A_, (kb_indexing_datastructures.NIL != flippedP) ? augment : base, (kb_indexing_datastructures.NIL != flippedP) ? base : augment, msg);
        }
        return best_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 91632L)
    public static SubLObject merge_final_indices_internal(final SubLObject base, final SubLObject augment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing_datastructures.NIL != final_topn_index_p(base)) {
            inc_final_topn_index_count(base, final_index_leaf_count(augment));
            return base;
        }
        if (kb_indexing_datastructures.NIL != upgrade_combined_indices_to_final_indexP(base, augment)) {
            final SubLObject v_term = current_complex_index_term();
            final SubLObject key_path = copy_current_complex_index_keys();
            final SubLObject base_count = final_index_leaf_count(base);
            final SubLObject augment_count = final_index_leaf_count(augment);
            final SubLObject total_count = Numbers.add(base_count, augment_count);
            Errors.warn((SubLObject)kb_indexing_datastructures.$str154$Merging_indices__A_on__A___A_item, new SubLObject[] { key_path, v_term, base_count, augment_count });
            return new_final_topn_index(v_term, key_path, total_count);
        }
        if (kb_indexing_datastructures.NIL != augment) {
            if (kb_indexing_datastructures.NIL != final_unified_index_p(augment)) {
                final SubLObject set_var = final_unified_index_set(augment);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject leaf;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_indexing_datastructures.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    leaf = set_contents.do_set_contents_next(basis_object, state);
                    if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state, leaf)) {
                        final_index_insert(base, leaf);
                    }
                }
            }
            else if (kb_indexing_datastructures.NIL != final_sharded_index_p(augment)) {
                final SubLObject iterator = map_utilities.new_map_iterator(final_sharded_index_shard_map(augment));
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_indexing_datastructures.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject ignored_key = (SubLObject)kb_indexing_datastructures.NIL;
                        SubLObject shard = (SubLObject)kb_indexing_datastructures.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list155);
                        ignored_key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_indexing_datastructures.$list155);
                        shard = current.first();
                        current = current.rest();
                        if (kb_indexing_datastructures.NIL == current) {
                            final SubLObject set_contents_var2 = set.do_set_internal(shard);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject leaf2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_indexing_datastructures.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_indexing_datastructures.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                leaf2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (kb_indexing_datastructures.NIL != set_contents.do_set_contents_element_validP(state2, leaf2)) {
                                    final_index_insert(base, leaf2);
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_indexing_datastructures.$list155);
                        }
                    }
                }
            }
            else if (kb_indexing_datastructures.NIL != final_topn_index_p(augment)) {
                final SubLObject iterator_var = new_final_topn_index_iterator(augment);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_indexing_datastructures.NIL; kb_indexing_datastructures.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_indexing_datastructures.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject leaf3 = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_indexing_datastructures.NIL != valid) {
                        final_index_insert(base, leaf3);
                    }
                }
            }
            else {
                enforceType(augment, kb_indexing_datastructures.$sym74$FINAL_INDEX_P);
            }
        }
        return base;
    }
    
    public static SubLObject declare_kb_indexing_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "setup_indexing_tables", "SETUP-INDEXING-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store", "ASSERTION-INDEXING-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertions_with_meta_assertions_count", "ASSERTIONS-WITH-META-ASSERTIONS-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_reset", "ASSERTION-INDEXING-STORE-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_initial_size", "ASSERTION-INDEXING-STORE-INITIAL-SIZE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_initialize", "ASSERTION-INDEXING-STORE-INITIALIZE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "clear_assertion_indexing", "CLEAR-ASSERTION-INDEXING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "clear_assertion_indexing_store", "CLEAR-ASSERTION-INDEXING-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_get", "ASSERTION-INDEXING-STORE-GET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_remove", "ASSERTION-INDEXING-STORE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_indexing_store_set", "ASSERTION-INDEXING-STORE-SET", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_assertions_with_meta_assertions", "DO-ASSERTIONS-WITH-META-ASSERTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_assertions_with_meta_assertions_iterator", "NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "unindexed_syntax_constants", "UNINDEXED-SYNTAX-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "unindexed_syntax_constant_p", "UNINDEXED-SYNTAX-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexed_term_p", "INDEXED-TERM-P", 1, 0, false);
        new $indexed_term_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexed_unrepresented_term_p", "INDEXED-UNREPRESENTED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "valid_indexed_termP", "VALID-INDEXED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "valid_indexed_term_robustP", "VALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "invalid_indexed_termP", "INVALID-INDEXED-TERM?", 1, 0, false);
        new $invalid_indexed_termP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "invalid_indexed_term_robustP", "INVALID-INDEXED-TERM-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "sort_of_indexed_term_p", "SORT-OF-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "fully_indexed_term_p", "FULLY-INDEXED-TERM-P", 1, 0, false);
        new $fully_indexed_term_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "valid_fully_indexed_term_p", "VALID-FULLY-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_indexed_terms", "DO-INDEXED-TERMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "index_p", "INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "index_installed_p", "INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "index_not_hosed_p", "INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "index_leaves", "INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "index_leaf_count", "INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "term_index", "TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "term_index_swapped_inP", "TERM-INDEX-SWAPPED-IN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "reset_term_index", "RESET-TERM-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "clear_term_index", "CLEAR-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_index", "FREE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_term_index", "FREE-TERM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_p", "SIMPLE-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_installed_p", "SIMPLE-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_not_hosed_p", "SIMPLE-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_indexed_term_p", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_simple_index", "NEW-SIMPLE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_leaves", "SIMPLE-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_leaf_count", "SIMPLE-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_memberP", "SIMPLE-INDEX-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_num_index", "SIMPLE-NUM-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_term_assertion_list", "SIMPLE-TERM-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_simple_index_term_assertion_list", "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "reset_term_simple_index", "RESET-TERM-SIMPLE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_insert", "SIMPLE-INDEX-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "simple_index_delete", "SIMPLE-INDEX-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_simple_index", "FREE-SIMPLE-INDEX", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "with_current_complex_index_path", "WITH-CURRENT-COMPLEX-INDEX-PATH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "current_complex_index_keys", "CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "copy_current_complex_index_keys", "COPY-CURRENT-COMPLEX-INDEX-KEYS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "current_complex_index_term", "CURRENT-COMPLEX-INDEX-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_keys_defined_p", "COMPLEX-INDEX-KEYS-DEFINED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_p", "COMPLEX-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_installed_p", "COMPLEX-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_not_hosed_p", "COMPLEX-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_indexed_term_p", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_leaves", "COMPLEX-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_leaf_count", "COMPLEX-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "complex_index_lookup", "COMPLEX-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "term_complex_index_lookup", "TERM-COMPLEX-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "initialize_term_complex_index", "INITIALIZE-TERM-COMPLEX-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "merge_complex_indices", "MERGE-COMPLEX-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "term_complex_index_set", "TERM-COMPLEX-INDEX-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "term_complex_index_delete_key", "TERM-COMPLEX-INDEX-DELETE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "reserve_final_topn_index_for_term", "RESERVE-FINAL-TOPN-INDEX-FOR-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_complex_index", "FREE-COMPLEX-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_p", "SUBINDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_installed_p", "SUBINDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_not_hosed_p", "SUBINDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_lookup", "SUBINDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_leaves", "SUBINDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "subindex_leaf_count", "SUBINDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "initialize_term_subindex", "INITIALIZE-TERM-SUBINDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_subindex", "FREE-SUBINDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "merge_sub_indices", "MERGE-SUB-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_p", "INTERMEDIATE-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_installed_p", "INTERMEDIATE-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_not_hosed_p", "INTERMEDIATE-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_intermediate_index", "NEW-INTERMEDIATE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "clone_intermediate_index", "CLONE-INTERMEDIATE-INDEX", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_intermediate_index", "DO-INTERMEDIATE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_intermediate_index_valid_index_p", "DO-INTERMEDIATE-INDEX-VALID-INDEX-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "capture_changed_index_entry_hints", "CAPTURE-CHANGED-INDEX-ENTRY-HINTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_changed_intermediate_index", "DO-CHANGED-INTERMEDIATE-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "segregate_index_changes_and_pristines", "SEGREGATE-INDEX-CHANGES-AND-PRISTINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_lookup", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_keys", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_leaf_count", "INTERMEDIATE-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_leaves", "INTERMEDIATE-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_set", "INTERMEDIATE-INDEX-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_replace_map", "INTERMEDIATE-INDEX-REPLACE-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_touch", "INTERMEDIATE-INDEX-TOUCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "use_final_topn_indicesP", "USE-FINAL-TOPN-INDICES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "upgrade_final_indexP", "UPGRADE-FINAL-INDEX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "upgrade_combined_indices_to_final_indexP", "UPGRADE-COMBINED-INDICES-TO-FINAL-INDEX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_insert", "INTERMEDIATE-INDEX-INSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_insert_int", "INTERMEDIATE-INDEX-INSERT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_delete", "INTERMEDIATE-INDEX-DELETE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_delete_key", "INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "merge_intermediate_indices", "MERGE-INTERMEDIATE-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "initialize_term_intermediate_index", "INITIALIZE-TERM-INTERMEDIATE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_intermediate_index", "FREE-INTERMEDIATE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_leaf_count_reset", "INTERMEDIATE-INDEX-LEAF-COUNT-RESET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_leaf_count_inc", "INTERMEDIATE-INDEX-LEAF-COUNT-INC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_lookup_or_create_intermediate", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-INTERMEDIATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_lookup_or_create_final", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-FINAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_map", "INTERMEDIATE-INDEX-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_map_set", "INTERMEDIATE-INDEX-MAP-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_map_delete_key", "INTERMEDIATE-INDEX-MAP-DELETE-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "intermediate_index_map_touch", "INTERMEDIATE-INDEX-MAP-TOUCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_p", "FINAL-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_installed_p", "FINAL-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_not_hosed_p", "FINAL-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_index", "NEW-FINAL-INDEX", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_final_index", "DO-FINAL-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_ordered_final_index", "DO-ORDERED-FINAL-INDEX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_leaf_count", "FINAL-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_leaves", "FINAL-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_memberP", "FINAL-INDEX-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_arbitrary_leaf", "FINAL-INDEX-ARBITRARY-LEAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_leaves_reset", "FINAL-INDEX-LEAVES-RESET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_insert", "FINAL-INDEX-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_delete", "FINAL-INDEX-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_index_base_iterator", "NEW-FINAL-INDEX-BASE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_final_index", "FREE-FINAL-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_p", "FINAL-UNIFIED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_installed_p", "FINAL-UNIFIED-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_not_hosed_p", "FINAL-UNIFIED-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_unified_index", "NEW-FINAL-UNIFIED-INDEX", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_final_unified_index_internal", "DO-FINAL-UNIFIED-INDEX-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_ordered_final_unified_index_internal", "DO-ORDERED-FINAL-UNIFIED-INDEX-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_leaf_count", "FINAL-UNIFIED-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_leaves", "FINAL-UNIFIED-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_memberP", "FINAL-UNIFIED-INDEX-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_arbitrary_leaf", "FINAL-UNIFIED-INDEX-ARBITRARY-LEAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_leaves_reset", "FINAL-UNIFIED-INDEX-LEAVES-RESET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_insert", "FINAL-UNIFIED-INDEX-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_delete", "FINAL-UNIFIED-INDEX-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_is_shardableP", "FINAL-UNIFIED-INDEX-IS-SHARDABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_unified_index_iterator", "NEW-FINAL-UNIFIED-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_final_unified_index", "FREE-FINAL-UNIFIED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_unified_index_set", "FINAL-UNIFIED-INDEX-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_index_set_is_shardableP", "FINAL-INDEX-SET-IS-SHARDABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_sharded_index", "NEW-FINAL-SHARDED-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "finshard_index_leaf_count", "FINSHARD-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "set_finshard_index_leaf_count", "SET-FINSHARD-INDEX-LEAF-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "finshard_index_keys", "FINSHARD-INDEX-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "set_finshard_index_keys", "SET-FINSHARD-INDEX-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "finshard_index_map", "FINSHARD-INDEX-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "set_finshard_index_map", "SET-FINSHARD-INDEX-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_p", "FINAL-SHARDED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_empty_p", "FINAL-SHARDED-INDEX-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_leaf_count", "FINAL-SHARDED-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_leaves", "FINAL-SHARDED-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_memberP", "FINAL-SHARDED-INDEX-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "finshard_index_find_shard", "FINSHARD-INDEX-FIND-SHARD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "finshard_index_find_shard_key_index", "FINSHARD-INDEX-FIND-SHARD-KEY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_arbitrary_leaf", "FINAL-SHARDED-INDEX-ARBITRARY-LEAF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_final_sharded_index_internal", "DO-FINAL-SHARDED-INDEX-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_ordered_final_sharded_index_internal", "DO-ORDERED-FINAL-SHARDED-INDEX-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_shard_map", "FINAL-SHARDED-INDEX-SHARD-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "ordered_final_sharded_index_extract_contents", "ORDERED-FINAL-SHARDED-INDEX-EXTRACT-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "possible_assertionL", "POSSIBLE-ASSERTION<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "increment_finshard_index_leaf_count", "INCREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "decrement_finshard_index_leaf_count", "DECREMENT-FINSHARD-INDEX-LEAF-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "append_finshard_index_keys", "APPEND-FINSHARD-INDEX-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_leaves_reset", "FINAL-SHARDED-INDEX-LEAVES-RESET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_insert", "FINAL-SHARDED-INDEX-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_insert_internal", "FINAL-SHARDED-INDEX-INSERT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_insert_into_shard", "FINAL-SHARDED-INDEX-INSERT-INTO-SHARD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_delete", "FINAL-SHARDED-INDEX-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "reshard_final_sharded_index", "RESHARD-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "convert_final_simple_index_to_sharded_index", "CONVERT-FINAL-SIMPLE-INDEX-TO-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "create_final_sharded_index", "CREATE-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "ncreate_final_sharded_index", "NCREATE-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "reorganize_modified_final_sharded_index", "REORGANIZE-MODIFIED-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_to_fvector_backed_sharded_index", "FINAL-SHARDED-INDEX-TO-FVECTOR-BACKED-SHARDED-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "update_fvector_backed_final_sharded_index", "UPDATE-FVECTOR-BACKED-FINAL-SHARDED-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "validate_final_sharded_index", "VALIDATE-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_sharded_index_iterator", "NEW-FINAL-SHARDED-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_final_sharded_index", "FREE-FINAL-SHARDED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_sharded_index_set", "FINAL-SHARDED-INDEX-SET", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "with_final_topn_index_tracking", "WITH-FINAL-TOPN-INDEX-TRACKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "without_final_topn_index_tracking", "WITHOUT-FINAL-TOPN-INDEX-TRACKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "possibly_note_new_final_topn_index", "POSSIBLY-NOTE-NEW-FINAL-TOPN-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_p", "FINAL-TOPN-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_count", "FINAL-TOPN-INDEX-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "set_final_topn_index_count", "SET-FINAL-TOPN-INDEX-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "inc_final_topn_index_count", "INC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "dec_final_topn_index_count", "DEC-FINAL-TOPN-INDEX-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_term", "FINAL-TOPN-INDEX-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_key_path", "FINAL-TOPN-INDEX-KEY-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_installed_p", "FINAL-TOPN-INDEX-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_not_hosed_p", "FINAL-TOPN-INDEX-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_topn_index", "NEW-FINAL-TOPN-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "upgrade_final_index", "UPGRADE-FINAL-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_final_topn_index_iterator", "NEW-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_iterator_build_filter_args", "FINAL-TOPN-INDEX-ITERATOR-BUILD-FILTER-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "assertion_matches_final_topn_indexkey_pathP", "ASSERTION-MATCHES-FINAL-TOPN-INDEXKEY-PATH?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "new_ordered_final_topn_index_iterator", "NEW-ORDERED-FINAL-TOPN-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_final_topn_index_internal", "DO-FINAL-TOPN-INDEX-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_indexing_datastructures", "do_ordered_final_topn_index_internal", "DO-ORDERED-FINAL-TOPN-INDEX-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_leaf_count", "FINAL-TOPN-INDEX-LEAF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_leaves", "FINAL-TOPN-INDEX-LEAVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_memberP", "FINAL-TOPN-INDEX-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_arbitrary_leaf", "FINAL-TOPN-INDEX-ARBITRARY-LEAF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_leaves_reset", "FINAL-TOPN-INDEX-LEAVES-RESET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_insert", "FINAL-TOPN-INDEX-INSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "final_topn_index_delete", "FINAL-TOPN-INDEX-DELETE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "free_final_topn_index", "FREE-FINAL-TOPN-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexing_leaf_p", "INDEXING-LEAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexing_leaf_installed_p", "INDEXING-LEAF-INSTALLED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexing_leaf_not_hosed_p", "INDEXING-LEAF-NOT-HOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "indexing_leaf_suid", "INDEXING-LEAF-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "merge_final_indices", "MERGE-FINAL-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_indexing_datastructures", "merge_final_indices_internal", "MERGE-FINAL-INDICES-INTERNAL", 2, 0, false);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    public static SubLObject init_kb_indexing_datastructures_file() {
        kb_indexing_datastructures.$assertion_indexing_store$ = SubLFiles.deflexical("*ASSERTION-INDEXING-STORE*", (SubLObject)((kb_indexing_datastructures.NIL != Symbols.boundp((SubLObject)kb_indexing_datastructures.$sym0$_ASSERTION_INDEXING_STORE_)) ? kb_indexing_datastructures.$assertion_indexing_store$.getGlobalValue() : kb_indexing_datastructures.NIL));
        kb_indexing_datastructures.$meta_assertion_frequency$ = SubLFiles.deflexical("*META-ASSERTION-FREQUENCY*", (SubLObject)kb_indexing_datastructures.$float1$0_05);
        kb_indexing_datastructures.$unindexed_syntax_constants$ = SubLFiles.deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", (SubLObject)kb_indexing_datastructures.$list21);
        kb_indexing_datastructures.$current_complex_index_term$ = SubLFiles.defparameter("*CURRENT-COMPLEX-INDEX-TERM*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$current_complex_index_keys$ = SubLFiles.defparameter("*CURRENT-COMPLEX-INDEX-KEYS*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$current_complex_index_keys_in_orderP$ = SubLFiles.defparameter("*CURRENT-COMPLEX-INDEX-KEYS-IN-ORDER?*", (SubLObject)kb_indexing_datastructures.T);
        kb_indexing_datastructures.$changed_index_entry_hints$ = SubLFiles.defparameter("*CHANGED-INDEX-ENTRY-HINTS*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$final_topn_index_cutoff_size$ = SubLFiles.deflexical("*FINAL-TOPN-INDEX-CUTOFF-SIZE*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$ordered_final_index_resource$ = SubLFiles.defparameter("*ORDERED-FINAL-INDEX-RESOURCE*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$final_sharded_index_shard_size$ = SubLFiles.deflexical("*FINAL-SHARDED-INDEX-SHARD-SIZE*", (SubLObject)((kb_indexing_datastructures.NIL != Symbols.boundp((SubLObject)kb_indexing_datastructures.$sym103$_FINAL_SHARDED_INDEX_SHARD_SIZE_)) ? kb_indexing_datastructures.$final_sharded_index_shard_size$.getGlobalValue() : kb_indexing_datastructures.$int104$1000));
        kb_indexing_datastructures.$recent_final_topn_indices$ = SubLFiles.defparameter("*RECENT-FINAL-TOPN-INDICES*", (SubLObject)kb_indexing_datastructures.NIL);
        kb_indexing_datastructures.$with_final_topn_index_tracking$ = SubLFiles.defparameter("*WITH-FINAL-TOPN-INDEX-TRACKING*", (SubLObject)kb_indexing_datastructures.NIL);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    public static SubLObject setup_kb_indexing_datastructures_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)kb_indexing_datastructures.$sym0$_ASSERTION_INDEXING_STORE_);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym20$NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR, (SubLObject)kb_indexing_datastructures.$sym10$DO_ASSERTIONS_WITH_META_ASSERTIONS);
        utilities_macros.register_cyc_api_function((SubLObject)kb_indexing_datastructures.$sym22$INDEXED_TERM_P, (SubLObject)kb_indexing_datastructures.$list23, (SubLObject)kb_indexing_datastructures.$str24$Returns_T_iff_OBJECT_is_an_indexe, (SubLObject)kb_indexing_datastructures.NIL, (SubLObject)kb_indexing_datastructures.$list25);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym39$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, (SubLObject)kb_indexing_datastructures.$sym40$DO_SIMPLE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym56$DO_INTERMEDIATE_INDEX_VALID_INDEX_P, (SubLObject)kb_indexing_datastructures.$sym59$DO_INTERMEDIATE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym66$SEGREGATE_INDEX_CHANGES_AND_PRISTINES, (SubLObject)kb_indexing_datastructures.$sym69$DO_CHANGED_INTERMEDIATE_INDEX);
        access_macros.register_external_symbol((SubLObject)kb_indexing_datastructures.$sym72$_FINAL_TOPN_INDEX_CUTOFF_SIZE_);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym58$INTERMEDIATE_INDEX_MAP, (SubLObject)kb_indexing_datastructures.$sym59$DO_INTERMEDIATE_INDEX);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym97$FINAL_UNIFIED_INDEX_SET, (SubLObject)kb_indexing_datastructures.$sym102$DO_FINAL_UNIFIED_INDEX);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_indexing_datastructures.$sym103$_FINAL_SHARDED_INDEX_SHARD_SIZE_);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym109$FINAL_SHARDED_INDEX_SHARD_MAP, (SubLObject)kb_indexing_datastructures.$sym85$DO_FINAL_SHARDED_INDEX_INTERNAL);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym119$ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS, (SubLObject)kb_indexing_datastructures.$sym85$DO_FINAL_SHARDED_INDEX_INTERNAL);
        access_macros.register_macro_helper((SubLObject)kb_indexing_datastructures.$sym134$FINAL_SHARDED_INDEX_SET, (SubLObject)kb_indexing_datastructures.$sym135$DO_FINAL_SHARDED_INDEX);
        return (SubLObject)kb_indexing_datastructures.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_indexing_datastructures_file();
    }
    
    public void initializeVariables() {
        init_kb_indexing_datastructures_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_indexing_datastructures_file();
    }
    
    static {
        me = (SubLFile)new kb_indexing_datastructures();
        kb_indexing_datastructures.$assertion_indexing_store$ = null;
        kb_indexing_datastructures.$meta_assertion_frequency$ = null;
        kb_indexing_datastructures.$unindexed_syntax_constants$ = null;
        kb_indexing_datastructures.$current_complex_index_term$ = null;
        kb_indexing_datastructures.$current_complex_index_keys$ = null;
        kb_indexing_datastructures.$current_complex_index_keys_in_orderP$ = null;
        kb_indexing_datastructures.$changed_index_entry_hints$ = null;
        kb_indexing_datastructures.$final_topn_index_cutoff_size$ = null;
        kb_indexing_datastructures.$ordered_final_index_resource$ = null;
        kb_indexing_datastructures.$final_sharded_index_shard_size$ = null;
        kb_indexing_datastructures.$recent_final_topn_indices$ = null;
        kb_indexing_datastructures.$with_final_topn_index_tracking$ = null;
        $sym0$_ASSERTION_INDEXING_STORE_ = SubLObjectFactory.makeSymbol("*ASSERTION-INDEXING-STORE*");
        $float1$0_05 = (SubLFloat)SubLObjectFactory.makeDouble(0.05);
        $int2$64 = SubLObjectFactory.makeInteger(64);
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw7$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym8$PROGRESS_MESSAGE_VAR = SubLObjectFactory.makeUninternedSymbol("PROGRESS-MESSAGE-VAR");
        $sym9$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym10$DO_ASSERTIONS_WITH_META_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS-WITH-META-ASSERTIONS");
        $sym11$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym12$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS-WITH-META-ASSERTIONS-COUNT")));
        $list14 = ConsesLow.list((SubLObject)kb_indexing_datastructures.ZERO_INTEGER);
        $sym15$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym16$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym17$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $sym18$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR"));
        $sym20$NEW_ASSERTIONS_WITH_META_ASSERTIONS_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR");
        $list21 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")));
        $sym22$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str24$Returns_T_iff_OBJECT_is_an_indexe = SubLObjectFactory.makeString("Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc indexed terms"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str27$mapping_Cyc_indexed_terms = SubLObjectFactory.makeString("mapping Cyc indexed terms");
        $sym28$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym29$DO_FORTS = SubLObjectFactory.makeSymbol("DO-FORTS");
        $sym30$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str31$_A__forts_ = SubLObjectFactory.makeString("~A (forts)");
        $sym32$DO_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-ASSERTIONS");
        $str33$_A__assertions_ = SubLObjectFactory.makeString("~A (assertions)");
        $sym34$DO_KB_UNREPRESENTED_TERMS = SubLObjectFactory.makeSymbol("DO-KB-UNREPRESENTED-TERMS");
        $str35$_A__unrepresented_terms_ = SubLObjectFactory.makeString("~A (unrepresented terms)");
        $str36$_S_is_not_indexed = SubLObjectFactory.makeString("~S is not indexed");
        $sym37$INDEXING_LEAF_INSTALLED_P = SubLObjectFactory.makeSymbol("INDEXING-LEAF-INSTALLED-P");
        $sym38$SIMPLE_INDEXED_TERM_P = SubLObjectFactory.makeSymbol("SIMPLE-INDEXED-TERM-P");
        $sym39$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = SubLObjectFactory.makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");
        $sym40$DO_SIMPLE_INDEX = SubLObjectFactory.makeSymbol("DO-SIMPLE-INDEX");
        $sym41$SIMPLE_INDEX_P = SubLObjectFactory.makeSymbol("SIMPLE-INDEX-P");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("KEYS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym43$_CURRENT_COMPLEX_INDEX_TERM_ = SubLObjectFactory.makeSymbol("*CURRENT-COMPLEX-INDEX-TERM*");
        $sym44$_CURRENT_COMPLEX_INDEX_KEYS_ = SubLObjectFactory.makeSymbol("*CURRENT-COMPLEX-INDEX-KEYS*");
        $sym45$COMPLEX_INDEX_P = SubLObjectFactory.makeSymbol("COMPLEX-INDEX-P");
        $sym46$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str47$_s_is_not_a_SUBINDEX_P = SubLObjectFactory.makeString("~s is not a SUBINDEX-P");
        $sym48$INTERMEDIATE_INDEX_P = SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-P");
        $str49$Cannot_reserve_a_TOP_N_index_for_ = SubLObjectFactory.makeString("Cannot reserve a TOP-N index for ~A if that term is not complexly indexed.~%");
        $str50$Cannot_merge__A_onto__A__incommen = SubLObjectFactory.makeString("Cannot merge ~A onto ~A, incommensurate.~%");
        $str51$Dont_know_how_to_merge_sub_index_ = SubLObjectFactory.makeString("Dont know how to merge sub-index ~A and ~A.~%");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym54$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym55$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym56$DO_INTERMEDIATE_INDEX_VALID_INDEX_P = SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX-VALID-INDEX-P");
        $sym57$DO_MAP = SubLObjectFactory.makeSymbol("DO-MAP");
        $sym58$INTERMEDIATE_INDEX_MAP = SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-MAP");
        $sym59$DO_INTERMEDIATE_INDEX = SubLObjectFactory.makeSymbol("DO-INTERMEDIATE-INDEX");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$_CHANGED_INDEX_ENTRY_HINTS_ = SubLObjectFactory.makeSymbol("*CHANGED-INDEX-ENTRY-HINTS*");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("UNCHANGED-PART"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym63$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym64$KEY_SET = SubLObjectFactory.makeUninternedSymbol("KEY-SET");
        $sym65$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $sym66$SEGREGATE_INDEX_CHANGES_AND_PRISTINES = SubLObjectFactory.makeSymbol("SEGREGATE-INDEX-CHANGES-AND-PRISTINES");
        $sym67$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym68$INTERMEDIATE_INDEX_LOOKUP = SubLObjectFactory.makeSymbol("INTERMEDIATE-INDEX-LOOKUP");
        $sym69$DO_CHANGED_INTERMEDIATE_INDEX = SubLObjectFactory.makeSymbol("DO-CHANGED-INTERMEDIATE-INDEX");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SUBINDEX"));
        $sym71$SUBINDEX_P = SubLObjectFactory.makeSymbol("SUBINDEX-P");
        $sym72$_FINAL_TOPN_INDEX_CUTOFF_SIZE_ = SubLObjectFactory.makeSymbol("*FINAL-TOPN-INDEX-CUTOFF-SIZE*");
        $list73 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REST-KEYS"));
        $sym74$FINAL_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-INDEX-P");
        $list75 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BASE-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MAP"));
        $list76 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-MAP"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUG-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("AUG-INDEX"));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym79$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym80$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym81$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym82$FINAL_UNIFIED_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-UNIFIED-INDEX-P");
        $sym83$DO_FINAL_UNIFIED_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-FINAL-UNIFIED-INDEX-INTERNAL");
        $sym84$FINAL_SHARDED_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-SHARDED-INDEX-P");
        $sym85$DO_FINAL_SHARDED_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-FINAL-SHARDED-INDEX-INTERNAL");
        $sym86$FINAL_TOPN_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-TOPN-INDEX-P");
        $sym87$DO_FINAL_TOPN_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-FINAL-TOPN-INDEX-INTERNAL");
        $sym88$ENFORCE_TYPE = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINAL-INDEX-P"));
        $sym90$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ORDERED-FINAL-INDEX-RESOURCE*"));
        $sym92$DO_ORDERED_FINAL_UNIFIED_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-ORDERED-FINAL-UNIFIED-INDEX-INTERNAL");
        $sym93$DO_ORDERED_FINAL_SHARDED_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-ORDERED-FINAL-SHARDED-INDEX-INTERNAL");
        $sym94$DO_ORDERED_FINAL_TOPN_INDEX_INTERNAL = SubLObjectFactory.makeSymbol("DO-ORDERED-FINAL-TOPN-INDEX-INTERNAL");
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-UNIFIED-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym96$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $sym97$FINAL_UNIFIED_INDEX_SET = SubLObjectFactory.makeSymbol("FINAL-UNIFIED-INDEX-SET");
        $sym98$LEAF_ITEMS = SubLObjectFactory.makeUninternedSymbol("LEAF-ITEMS");
        $sym99$SET_ELEMENT_LIST = SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST");
        $sym100$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym101$SORT_ASSERTIONS = SubLObjectFactory.makeSymbol("SORT-ASSERTIONS");
        $sym102$DO_FINAL_UNIFIED_INDEX = SubLObjectFactory.makeSymbol("DO-FINAL-UNIFIED-INDEX");
        $sym103$_FINAL_SHARDED_INDEX_SHARD_SIZE_ = SubLObjectFactory.makeSymbol("*FINAL-SHARDED-INDEX-SHARD-SIZE*");
        $int104$1000 = SubLObjectFactory.makeInteger(1000);
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SHARD"));
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-SHARDED-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym107$IGNORED_KEY = SubLObjectFactory.makeUninternedSymbol("IGNORED-KEY");
        $sym108$SHARD = SubLObjectFactory.makeUninternedSymbol("SHARD");
        $sym109$FINAL_SHARDED_INDEX_SHARD_MAP = SubLObjectFactory.makeSymbol("FINAL-SHARDED-INDEX-SHARD-MAP");
        $sym110$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym111$SHARD_KEY_LIST = SubLObjectFactory.makeUninternedSymbol("SHARD-KEY-LIST");
        $sym112$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym113$SHARD = SubLObjectFactory.makeUninternedSymbol("SHARD");
        $sym114$SHARD_CONTENTS = SubLObjectFactory.makeUninternedSymbol("SHARD-CONTENTS");
        $sym115$SORT = SubLObjectFactory.makeSymbol("SORT");
        $sym116$MAP_KEYS = SubLObjectFactory.makeSymbol("MAP-KEYS");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("<")));
        $sym118$MAP_GET = SubLObjectFactory.makeSymbol("MAP-GET");
        $sym119$ORDERED_FINAL_SHARDED_INDEX_EXTRACT_CONTENTS = SubLObjectFactory.makeSymbol("ORDERED-FINAL-SHARDED-INDEX-EXTRACT-CONTENTS");
        $sym120$DO_VECTOR = SubLObjectFactory.makeSymbol("DO-VECTOR");
        $sym121$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym122$POSSIBLE_ASSERTION_ = SubLObjectFactory.makeSymbol("POSSIBLE-ASSERTION<");
        $str123$Index_count_was__A__yet_we_copied = SubLObjectFactory.makeString("Index count was ~A, yet we copied ~A items.");
        $sym124$_ = SubLObjectFactory.makeSymbol("<");
        $sym125$INDEXING_LEAF_SUID = SubLObjectFactory.makeSymbol("INDEXING-LEAF-SUID");
        $str126$Implementation_error__shard_count = SubLObjectFactory.makeString("Implementation error: shard count of ~A does not match keys length of ~A.");
        $kw127$SWAPPED_OUT = SubLObjectFactory.makeKeyword("SWAPPED-OUT");
        $kw128$COMPACT = SubLObjectFactory.makeKeyword("COMPACT");
        $str129$Shard_count_of__A_does_not_match_ = SubLObjectFactory.makeString("Shard count of ~A does not match keys length of ~A.");
        $str130$Shard_key___A_is_wrong____we_expe = SubLObjectFactory.makeString("Shard key #~A is wrong -- we expected ~A, but got ~A.");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("SHARD"));
        $str132$Shard_with_max_ID__A_contains_lea = SubLObjectFactory.makeString("Shard with max ID ~A contains leaf ~A with ID ~A.");
        $str133$We_expected_to_find__A_leaves__bu = SubLObjectFactory.makeString("We expected to find ~A leaves, but the count was off by ~A.");
        $sym134$FINAL_SHARDED_INDEX_SET = SubLObjectFactory.makeSymbol("FINAL-SHARDED-INDEX-SET");
        $sym135$DO_FINAL_SHARDED_INDEX = SubLObjectFactory.makeSymbol("DO-FINAL-SHARDED-INDEX");
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEWBIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RECENT-FINAL-TOPN-INDICES*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITH-FINAL-TOPN-INDEX-TRACKING*"), (SubLObject)kb_indexing_datastructures.T));
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("*RECENT-FINAL-TOPN-INDICES*")));
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITH-FINAL-TOPN-INDEX-TRACKING*")));
        $sym140$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str141$__Creating_empty_TOP_N_index__A_o = SubLObjectFactory.makeString("~&Creating empty TOP-N index ~A on ~A.~%");
        $str142$Upgrading_index__A_on__A___A_item = SubLObjectFactory.makeString("Upgrading index ~A on ~A (~A items) to TOP-N index.~%");
        $sym143$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str144$Final_Top_N_index_iterator_for__A = SubLObjectFactory.makeString("Final Top-N index iterator for ~A requested.~%");
        $str145$_A__ = SubLObjectFactory.makeString("~A~%");
        $sym146$ASSERTION_MATCHES_FINAL_TOPN_INDEXKEY_PATH_ = SubLObjectFactory.makeSymbol("ASSERTION-MATCHES-FINAL-TOPN-INDEXKEY-PATH?");
        $kw147$SIMPLE_MATCH_FUNCTION = SubLObjectFactory.makeKeyword("SIMPLE-MATCH-FUNCTION");
        $str148$No_match_function_available_for_d = SubLObjectFactory.makeString("No match function available for description ~S on ~S.~%");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FINAL-TOPN-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym150$NEW_FINAL_TOPN_INDEX_ITERATOR = SubLObjectFactory.makeSymbol("NEW-FINAL-TOPN-INDEX-ITERATOR");
        $sym151$NEW_ORDERED_FINAL_TOPN_INDEX_ITERATOR = SubLObjectFactory.makeSymbol("NEW-ORDERED-FINAL-TOPN-INDEX-ITERATOR");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MATCHER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str153$Could_not_merge_final_indices__A_ = SubLObjectFactory.makeString("Could not merge final indices ~A and ~A.~%~A~%");
        $str154$Merging_indices__A_on__A___A_item = SubLObjectFactory.makeString("Merging indices ~A on ~A (~A items and ~A) into TOP-N index.~%");
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("IGNORED-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("SHARD"));
    }
    
    public static final class $indexed_term_p$UnaryFunction extends UnaryFunction
    {
        public $indexed_term_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INDEXED-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_indexing_datastructures.indexed_term_p(arg1);
        }
    }
    
    public static final class $invalid_indexed_termP$UnaryFunction extends UnaryFunction
    {
        public $invalid_indexed_termP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-INDEXED-TERM?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_indexing_datastructures.invalid_indexed_termP(arg1);
        }
    }
    
    public static final class $fully_indexed_term_p$UnaryFunction extends UnaryFunction
    {
        public $fully_indexed_term_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FULLY-INDEXED-TERM-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return kb_indexing_datastructures.fully_indexed_term_p(arg1);
        }
    }
}

/*

	Total time: 750 ms
	 synthetic 
*/