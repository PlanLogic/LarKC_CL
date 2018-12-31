package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_disambiguation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_disambiguation";
    public static final String myFingerPrint = "877785be1dc6549f0e64b3b337579ed5b2d9c14ba6ddda9ff6e06fa3a6958d61";
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 6020L)
    private static SubLSymbol $pph_disambiguation_demerit_cutoff$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$OUTPUT_LISTS;
    private static final SubLSymbol $sym2$DUPE_INDEX_LIST;
    private static final SubLSymbol $sym3$DUPE_INDEX_LISTS;
    private static final SubLSymbol $sym4$DUPE_OBJECTS;
    private static final SubLSymbol $sym5$NEW_PRECISION;
    private static final SubLSymbol $sym6$NEW_OUTPUT_LIST;
    private static final SubLSymbol $sym7$OLIST;
    private static final SubLSymbol $sym8$ABORT_;
    private static final SubLSymbol $sym9$WITH_PPH_MEMOIZATION;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$REMEMBERING_PPH_AMBIGUOUS_STRINGS;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$CSOME_NUMBERED;
    private static final SubLSymbol $sym15$NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION;
    private static final SubLSymbol $sym16$PIF;
    private static final SubLSymbol $sym17$PPH_PHRASE_OUTPUT_LIST_P;
    private static final SubLSymbol $sym18$CPUSH;
    private static final SubLSymbol $sym19$CSETQ;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$PROGN;
    private static final SubLSymbol $sym23$NREVERSE;
    private static final SubLSymbol $sym24$PPH_FIND_DUPLICATES;
    private static final SubLSymbol $sym25$CDOLIST;
    private static final SubLSymbol $sym26$PPH_DISAMBIGUATION_NOTE;
    private static final SubLString $str27$__Working_on_dupe_list___S__;
    private static final SubLSymbol $sym28$PPH_DEREFERENCE_INDEXES;
    private static final SubLSymbol $sym29$NTH;
    private static final SubLString $str30$__Trying_to_reparaphrase__S___;
    private static final SubLSymbol $sym31$PPH_PRECISION_FOR_OBJECT;
    private static final SubLSymbol $sym32$NEW_DEMERIT_CUTOFF;
    private static final SubLSymbol $sym33$PPH_DEMERIT_CUTOFF_FROM_OLIST;
    private static final SubLSymbol $sym34$PUNLESS;
    private static final SubLList $list35;
    private static final SubLString $str36$__Trying_targeted_precision__S_fo;
    private static final SubLSymbol $sym37$WITH_PARAPHRASE_PRECISION;
    private static final SubLSymbol $sym38$WITH_PPH_DEMERIT_CUTOFF;
    private static final SubLList $list39;
    private static final SubLString $str40$__New_paraphrase_with_precision__;
    private static final SubLSymbol $sym41$PWHEN;
    private static final SubLSymbol $sym42$CAND;
    private static final SubLSymbol $sym43$LISTP;
    private static final SubLSymbol $sym44$FIMPLIES;
    private static final SubLSymbol $sym45$PPH_OUTPUT_LIST__;
    private static final SubLString $str46$__Trying_full_precision_for__S;
    private static final SubLSymbol $sym47$WITH_PRECISE_PARAPHRASE_ON;
    private static final SubLString $str48$__New_paraphrase_with_full_precis;
    private static final SubLSymbol $sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_;
    private static final SubLString $str50$__Changing_output_list_for__S_fro;
    private static final SubLSymbol $sym51$SET_NTH;
    private static final SubLSymbol $sym52$PPH_POSSIBLY_ADD_REFERENCE_MARKER;
    private static final SubLSymbol $sym53$APPEND;
    private static final SubLSymbol $sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED;
    private static final SubLSymbol $sym55$PPH_GET_TAGLESS_STRINGS;
    private static final SubLSymbol $sym56$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS;
    private static final SubLSymbol $kw57$DENOTS_UNKNOWN;
    private static final SubLSymbol $sym58$PPH_DUPLICATE_STRINGS_;
    private static final SubLString $str59$___S_is_a_duplicate_of__S___;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$IGNOREME;
    private static final SubLSymbol $kw62$ANY;
    private static final SubLObject $const63$Noun;
    private static final SubLObject $const64$Adjective;
    private static final SubLString $str65$_PPH_error_level_;
    private static final SubLString $str66$__;
    private static final SubLString $str67$Can_t_add_disambiguation_string__;
    private static final SubLSymbol $sym68$GEOGRAPHICAL_REGION_IN_ANY_MT_;
    private static final SubLObject $const69$Agent_Generic;
    private static final SubLObject $const70$alias;
    private static final SubLString $str71$__aka__;
    private static final SubLString $str72$__;
    private static final SubLSymbol $kw73$WHEN_NECESSARY;
    private static final SubLSymbol $kw74$TOP_LEVEL;
    private static final SubLSymbol $kw75$TEXT;
    private static final SubLSymbol $sym76$PPH_PRECISION_P;
    private static final SubLString $str77$__;
    private static final SubLString $str78$_;
    private static final SubLSymbol $kw79$ALL;
    private static final SubLSymbol $sym80$PPH_INSTANCE_;
    private static final SubLSymbol $sym81$PPH_SPEC_;
    private static final SubLObject $const82$terseDisambiguationString;
    private static final SubLSymbol $sym83$_STRING;
    private static final SubLList $list84;
    private static final SubLString $str85$Can_t_disambiguate_javalist_____S;
    private static final SubLString $str86$Reparaphrasing____S_due_to_ambigu;
    private static final SubLString $str87$Failed_to_disambiguate__S_;
    private static final SubLString $str88$Disambiguated____S___to__S;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 1118L)
    public static SubLObject paraphrase_with_disambiguation_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_var = (SubLObject)pph_disambiguation.NIL;
        SubLObject i = (SubLObject)pph_disambiguation.NIL;
        SubLObject objects = (SubLObject)pph_disambiguation.NIL;
        SubLObject ans = (SubLObject)pph_disambiguation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list0);
        object_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list0);
        i = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list0);
        objects = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list0);
        ans = current.first();
        current = current.rest();
        if (pph_disambiguation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject output_lists = (SubLObject)pph_disambiguation.$sym1$OUTPUT_LISTS;
            final SubLObject dupe_index_list = (SubLObject)pph_disambiguation.$sym2$DUPE_INDEX_LIST;
            final SubLObject dupe_index_lists = (SubLObject)pph_disambiguation.$sym3$DUPE_INDEX_LISTS;
            final SubLObject dupe_objects = (SubLObject)pph_disambiguation.$sym4$DUPE_OBJECTS;
            final SubLObject new_precision = (SubLObject)pph_disambiguation.$sym5$NEW_PRECISION;
            final SubLObject new_output_list = (SubLObject)pph_disambiguation.$sym6$NEW_OUTPUT_LIST;
            final SubLObject olist = (SubLObject)pph_disambiguation.$sym7$OLIST;
            final SubLObject abortP = (SubLObject)pph_disambiguation.$sym8$ABORT_;
            return (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym9$WITH_PPH_MEMOIZATION, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(output_lists, (SubLObject)pph_disambiguation.$list11), reader.bq_cons(abortP, (SubLObject)pph_disambiguation.$list11)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym12$REMEMBERING_PPH_AMBIGUOUS_STRINGS, (SubLObject)pph_disambiguation.$list13, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym14$CSOME_NUMBERED, (SubLObject)ConsesLow.list(object_var, i, objects, abortP), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(olist, ConsesLow.append(body, (SubLObject)pph_disambiguation.NIL))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym15$NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, i, olist), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym16$PIF, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym17$PPH_PHRASE_OUTPUT_LIST_P, olist), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym18$CPUSH, olist, output_lists), (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.$sym19$CSETQ, abortP, (SubLObject)pph_disambiguation.$list20)))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym16$PIF, abortP, (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.$sym19$CSETQ, ans, (SubLObject)pph_disambiguation.$list21), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym22$PROGN, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym19$CSETQ, output_lists, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym23$NREVERSE, output_lists)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dupe_index_lists, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym24$PPH_FIND_DUPLICATES, output_lists))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym25$CDOLIST, (SubLObject)ConsesLow.list(dupe_index_list, dupe_index_lists), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.TWO_INTEGER, (SubLObject)pph_disambiguation.$str27$__Working_on_dupe_list___S__, dupe_index_list), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dupe_objects, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym28$PPH_DEREFERENCE_INDEXES, dupe_index_list, objects))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym25$CDOLIST, (SubLObject)ConsesLow.list(i, dupe_index_list), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(object_var, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym29$NTH, i, objects))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.ONE_INTEGER, (SubLObject)pph_disambiguation.$str30$__Trying_to_reparaphrase__S___, object_var), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym10$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_precision, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym31$PPH_PRECISION_FOR_OBJECT, object_var, dupe_objects)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym32$NEW_DEMERIT_CUTOFF, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym33$PPH_DEMERIT_CUTOFF_FROM_OLIST, i, output_lists)), reader.bq_cons(new_output_list, (SubLObject)pph_disambiguation.$list11)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym34$PUNLESS, (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.EQUAL, new_precision, (SubLObject)pph_disambiguation.$list35), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.TWO_INTEGER, (SubLObject)pph_disambiguation.$str36$__Trying_targeted_precision__S_fo, new_precision, object_var), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym37$WITH_PARAPHRASE_PRECISION, new_precision, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym38$WITH_PPH_DEMERIT_CUTOFF, (SubLObject)pph_disambiguation.$list39, (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.$sym19$CSETQ, new_output_list, ConsesLow.append(body, (SubLObject)pph_disambiguation.NIL)))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.TWO_INTEGER, (SubLObject)pph_disambiguation.$str40$__New_paraphrase_with_precision__, new_precision, object_var, new_output_list)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym41$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym42$CAND, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym43$LISTP, new_precision), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym44$FIMPLIES, new_output_list, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym45$PPH_OUTPUT_LIST__, new_output_list, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym29$NTH, i, output_lists)))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.TWO_INTEGER, (SubLObject)pph_disambiguation.$str46$__Trying_full_precision_for__S, object_var), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym47$WITH_PRECISE_PARAPHRASE_ON, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym38$WITH_PPH_DEMERIT_CUTOFF, (SubLObject)pph_disambiguation.$list39, (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.$sym19$CSETQ, new_output_list, ConsesLow.append(body, (SubLObject)pph_disambiguation.NIL)))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.TWO_INTEGER, (SubLObject)pph_disambiguation.$str48$__New_paraphrase_with_full_precis, object_var, new_output_list)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym41$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_, new_output_list, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym29$NTH, i, output_lists), object_var), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.ONE_INTEGER, (SubLObject)pph_disambiguation.$str50$__Changing_output_list_for__S_fro, object_var, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym29$NTH, i, output_lists), new_output_list), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym51$SET_NTH, i, output_lists, new_output_list), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym15$NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, i, new_output_list)))))))), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym25$CDOLIST, (SubLObject)ConsesLow.list(object_var, objects), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym52$PPH_POSSIBLY_ADD_REFERENCE_MARKER, object_var)), (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym19$CSETQ, ans, (SubLObject)ConsesLow.list((SubLObject)pph_disambiguation.$sym53$APPEND, ans, output_lists)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_disambiguation.$list0);
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 4825L)
    public static SubLObject remembering_pph_ambiguous_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_p(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 4930L)
    public static SubLObject make_incremental_pph_disambiguation_result(final SubLObject i, final SubLObject output_list) {
        return (SubLObject)ConsesLow.cons(i, output_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 5036L)
    public static SubLObject incremental_pph_disambiguation_result_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && pph_disambiguation.NIL != subl_promotions.non_negative_integer_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 5176L)
    public static SubLObject incremental_pph_disambiguation_result_index(final SubLObject result) {
        return result.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 5267L)
    public static SubLObject incremental_pph_disambiguation_result_output_list(final SubLObject result) {
        return conses_high.copy_list(result.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 5376L)
    public static SubLObject pph_disambiguation_note(final SubLObject level, final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == pph_disambiguation.UNPROVIDED) {
            arg1 = (SubLObject)pph_disambiguation.NIL;
        }
        if (arg2 == pph_disambiguation.UNPROVIDED) {
            arg2 = (SubLObject)pph_disambiguation.NIL;
        }
        if (arg3 == pph_disambiguation.UNPROVIDED) {
            arg3 = (SubLObject)pph_disambiguation.NIL;
        }
        if (pph_disambiguation.NIL != pph_error.pph_trace_level_exceeds_minimumP(level)) {
            format_nil.force_format((SubLObject)pph_disambiguation.T, format_string, arg1, arg2, arg3, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        }
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 5581L)
    public static SubLObject note_pph_output_list_for_disambiguation(final SubLObject i, final SubLObject output_list) {
        utilities_macros.add_result_to_partial_results_accumulator(make_incremental_pph_disambiguation_result(i, output_list));
        return output_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 6148L)
    public static SubLObject pph_demerit_cutoff_from_olist(final SubLObject index, final SubLObject output_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject olist = ConsesLow.nth(index, output_lists);
        final SubLObject ans = (pph_disambiguation.NIL != string_utilities.non_empty_stringP(pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_disambiguation.NIL))) ? pph_disambiguation.$pph_disambiguation_demerit_cutoff$.getDynamicValue(thread) : number_utilities.positive_infinity();
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 6685L)
    public static SubLObject pph_new_olist_better_than_oldP(final SubLObject new_output_list, final SubLObject old_output_list, final SubLObject v_term) {
        if (pph_disambiguation.NIL != pph_vars.pph_failure_is_an_option_p() && pph_disambiguation.NIL == pph_utilities.pph_string_ok_for_termP(pph_phrase.pph_phrase_output_list_string(old_output_list, (SubLObject)pph_disambiguation.NIL), v_term)) {
            return (SubLObject)pph_disambiguation.T;
        }
        if (new_output_list.isCons() && pph_disambiguation.NIL != string_utilities.non_empty_stringP(pph_phrase.pph_phrase_output_list_string(new_output_list, (SubLObject)pph_disambiguation.NIL)) && pph_disambiguation.NIL == pph_output_list_E(new_output_list, old_output_list)) {
            return (SubLObject)pph_disambiguation.T;
        }
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 7274L)
    public static SubLObject pph_output_list_E(final SubLObject olist1, final SubLObject olist2) {
        SubLObject equalP = (SubLObject)pph_disambiguation.NIL;
        if (pph_disambiguation.NIL != list_utilities.same_length_p(olist1, olist2)) {
            SubLObject differentP = (SubLObject)pph_disambiguation.NIL;
            if (pph_disambiguation.NIL == differentP) {
                SubLObject item1 = (SubLObject)pph_disambiguation.NIL;
                SubLObject item1_$1 = (SubLObject)pph_disambiguation.NIL;
                SubLObject item2 = (SubLObject)pph_disambiguation.NIL;
                SubLObject item2_$2 = (SubLObject)pph_disambiguation.NIL;
                item1 = olist1;
                item1_$1 = item1.first();
                item2 = olist2;
                item2_$2 = item2.first();
                while (pph_disambiguation.NIL == differentP && (pph_disambiguation.NIL != item2 || pph_disambiguation.NIL != item1)) {
                    if (!pph_data_structures.pph_phrase_output_item_string(item1_$1).equal(pph_data_structures.pph_phrase_output_item_string(item2_$2))) {
                        differentP = (SubLObject)pph_disambiguation.T;
                    }
                    item1 = item1.rest();
                    item1_$1 = item1.first();
                    item2 = item2.rest();
                    item2_$2 = item2.first();
                }
            }
            equalP = (SubLObject)SubLObjectFactory.makeBoolean(pph_disambiguation.NIL == differentP);
        }
        return equalP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 7793L)
    public static SubLObject pph_dereference_indexes(final SubLObject index_list, final SubLObject all_objects) {
        SubLObject objects = (SubLObject)pph_disambiguation.NIL;
        SubLObject cdolist_list_var = index_list;
        SubLObject index = (SubLObject)pph_disambiguation.NIL;
        index = cdolist_list_var.first();
        while (pph_disambiguation.NIL != cdolist_list_var) {
            objects = (SubLObject)ConsesLow.cons(ConsesLow.nth(index, all_objects), objects);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        }
        return Sequences.nreverse(objects);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 8107L)
    public static SubLObject pph_get_tagless_strings(final SubLObject output_lists) {
        return Mapping.mapcar((SubLObject)pph_disambiguation.$sym56$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, output_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 8347L)
    public static SubLObject pph_find_duplicates(final SubLObject output_lists) {
        final SubLObject non_nils = Sequences.remove((SubLObject)pph_disambiguation.NIL, output_lists, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        SubLObject strings = Mapping.mapcar((SubLObject)pph_disambiguation.$sym56$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, non_nils);
        SubLObject dupe_lists = (SubLObject)pph_disambiguation.NIL;
        final SubLObject remember_ambiguous_stringsP = remembering_pph_ambiguous_stringsP();
        SubLObject curr_string;
        SubLObject curr_index;
        SubLObject curr_dupe_indexes;
        SubLObject curr_olist;
        SubLObject curr_cycl;
        SubLObject list_var;
        SubLObject other_string;
        SubLObject offset;
        SubLObject other_olist;
        SubLObject other_cycl;
        for (curr_string = (SubLObject)pph_disambiguation.NIL, curr_index = (SubLObject)pph_disambiguation.NIL, curr_string = strings.first(), curr_index = (SubLObject)pph_disambiguation.ZERO_INTEGER; pph_disambiguation.NIL != curr_string; curr_string = strings.first(), curr_index = number_utilities.f_1X(curr_index)) {
            curr_dupe_indexes = (SubLObject)pph_disambiguation.NIL;
            curr_olist = ConsesLow.nth(curr_index, non_nils);
            curr_cycl = (SubLObject)((pph_disambiguation.NIL != list_utilities.singletonP(curr_olist)) ? pph_data_structures.pph_phrase_output_item_cycl(curr_olist.first()) : pph_disambiguation.NIL);
            list_var = (SubLObject)pph_disambiguation.NIL;
            other_string = (SubLObject)pph_disambiguation.NIL;
            offset = (SubLObject)pph_disambiguation.NIL;
            list_var = strings;
            other_string = list_var.first();
            for (offset = (SubLObject)pph_disambiguation.ZERO_INTEGER; pph_disambiguation.NIL != list_var; list_var = list_var.rest(), other_string = list_var.first(), offset = Numbers.add((SubLObject)pph_disambiguation.ONE_INTEGER, offset)) {
                if (offset.isPositive() && pph_disambiguation.NIL == cycl_variables.el_varP(curr_cycl) && pph_disambiguation.NIL != pph_duplicate_stringsP(curr_string, other_string)) {
                    if (pph_disambiguation.NIL != remember_ambiguous_stringsP) {
                        pph_note_ambiguous_string(curr_string, curr_cycl);
                        other_olist = ConsesLow.nth(offset, output_lists);
                        if (pph_disambiguation.NIL != list_utilities.singletonP(other_olist)) {
                            other_cycl = pph_data_structures.pph_phrase_output_item_cycl(other_olist.first());
                            pph_note_ambiguous_string(curr_string, other_cycl);
                        }
                    }
                    curr_dupe_indexes = (SubLObject)ConsesLow.cons(Numbers.add(curr_index, offset), curr_dupe_indexes);
                }
            }
            if (pph_disambiguation.NIL != curr_dupe_indexes) {
                dupe_lists = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(curr_index, Sequences.nreverse(curr_dupe_indexes)), dupe_lists);
            }
            strings = strings.rest();
        }
        dupe_lists = Sequences.nreverse(dupe_lists);
        return dupe_lists;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 9866L)
    public static SubLObject pph_note_ambiguous_string(SubLObject string, SubLObject denot) {
        if (denot == pph_disambiguation.UNPROVIDED) {
            denot = (SubLObject)pph_disambiguation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        string = pph_string.pph_string_canonicalize(string);
        final SubLObject existing_known_denots = dictionary.dictionary_lookup_without_values(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, (SubLObject)pph_disambiguation.NIL);
        if (pph_disambiguation.NIL != denot && existing_known_denots.isList()) {
            dictionary_utilities.dictionary_pushnew(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, denot, Symbols.symbol_function((SubLObject)pph_disambiguation.EQUAL), (SubLObject)pph_disambiguation.UNPROVIDED);
        }
        else if (pph_disambiguation.NIL != denot) {
            dictionary.dictionary_enter(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, (SubLObject)ConsesLow.list(denot));
        }
        else if (pph_disambiguation.NIL == existing_known_denots) {
            dictionary.dictionary_enter(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, (SubLObject)pph_disambiguation.$kw57$DENOTS_UNKNOWN);
        }
        return pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 10475L)
    public static SubLObject pph_string_ambiguous_p(final SubLObject string) {
        return list_utilities.non_empty_list_p(pph_known_denots_of_ambiguous_string(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 10600L)
    public static SubLObject pph_known_denots_of_ambiguous_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_result = (SubLObject)((pph_disambiguation.NIL != remembering_pph_ambiguous_stringsP()) ? dictionary.dictionary_lookup_without_values(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), pph_string.pph_string_canonicalize(string), (SubLObject)pph_disambiguation.NIL) : pph_disambiguation.NIL);
        return (SubLObject)(lookup_result.isList() ? lookup_result : pph_disambiguation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 10899L)
    public static SubLObject pph_unambiguous_string_p(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && pph_disambiguation.NIL == pph_string_ambiguous_p(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 11030L)
    public static SubLObject pph_output_item_ambiguous_p(final SubLObject output_item) {
        return pph_string_ambiguous_p(pph_data_structures.pph_phrase_output_item_string(output_item));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 11169L)
    public static SubLObject pph_duplicate_stringsP(final SubLObject string1, final SubLObject string2) {
        final SubLObject conservativeP = (SubLObject)pph_disambiguation.NIL;
        final SubLObject duplicateP = (pph_disambiguation.NIL != conservativeP) ? ((pph_disambiguation.NIL != list_utilities.greater_length_p(string2, string1)) ? string_utilities.substringP(string1, string2, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED) : string_utilities.substringP(string2, string1, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED)) : Equality.equal(string1, string2);
        if (pph_disambiguation.NIL != duplicateP && pph_disambiguation.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_disambiguation.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_disambiguation.T, (SubLObject)pph_disambiguation.$str59$___S_is_a_duplicate_of__S___, string1, string2, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        }
        return duplicateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 11752L)
    public static SubLObject paraphrase_with_disambiguation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_var = (SubLObject)pph_disambiguation.NIL;
        SubLObject objects = (SubLObject)pph_disambiguation.NIL;
        SubLObject ans = (SubLObject)pph_disambiguation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list60);
        object_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list60);
        objects = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_disambiguation.$list60);
        ans = current.first();
        current = current.rest();
        if (pph_disambiguation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject ignoreme = (SubLObject)pph_disambiguation.$sym61$IGNOREME;
            return (SubLObject)ConsesLow.listS((SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED, (SubLObject)ConsesLow.list(object_var, ignoreme, objects, ans), ConsesLow.append(body, (SubLObject)pph_disambiguation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_disambiguation.$list60);
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 12318L)
    public static SubLObject pph_category_ok_for_parenthetical_disambiguationP(final SubLObject cat) {
        if (pph_disambiguation.$kw62$ANY == cat) {
            return (SubLObject)pph_disambiguation.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_disambiguation.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(cat, (SubLObject)pph_disambiguation.UNPROVIDED), pph_disambiguation.$const63$Noun, (SubLObject)pph_disambiguation.UNPROVIDED) || pph_disambiguation.NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(cat, (SubLObject)pph_disambiguation.UNPROVIDED), pph_disambiguation.$const64$Adjective, (SubLObject)pph_disambiguation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 12664L)
    public static SubLObject pph_possibly_add_disambiguation_string(final SubLObject output_item, final SubLObject category) {
        if (pph_disambiguation.NIL == category) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_disambiguation.$str65$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_disambiguation.ONE_INTEGER), pph_disambiguation.$str66$__, format_nil.format_nil_a_no_copy((SubLObject)pph_disambiguation.$str67$Can_t_add_disambiguation_string__) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(output_item));
        }
        final SubLObject string = pph_data_structures.pph_phrase_output_item_string(output_item);
        final SubLObject v_term = pph_data_structures.pph_phrase_output_item_cycl(output_item);
        if (pph_disambiguation.NIL != pph_parenthetical_disambiguations_allowed_for_string_for_termP(string, v_term)) {
            final SubLObject other_denots = pph_denots_to_disambiguate(string, v_term, category);
            SubLObject disambiguatedP = (SubLObject)pph_disambiguation.NIL;
            if (pph_disambiguation.NIL != pph_parenthetical_disambiguation_requestedP() || pph_disambiguation.NIL != other_denots) {
                final SubLObject clarification_string = pph_clarification_string(v_term);
                if (clarification_string.isString()) {
                    disambiguatedP = pph_add_disambiguation_string(clarification_string, output_item);
                }
                if (pph_disambiguation.NIL == disambiguatedP) {
                    final SubLObject clarification_terms = pph_clarification_terms_wrt(v_term, other_denots, (SubLObject)pph_disambiguation.UNPROVIDED);
                    if (pph_disambiguation.NIL == disambiguatedP) {
                        SubLObject csome_list_var = clarification_terms;
                        SubLObject genl = (SubLObject)pph_disambiguation.NIL;
                        genl = csome_list_var.first();
                        while (pph_disambiguation.NIL == disambiguatedP && pph_disambiguation.NIL != csome_list_var) {
                            if (pph_disambiguation.NIL == pph_bad_disambiguatorP(genl, other_denots)) {
                                disambiguatedP = pph_add_disambiguation_string(genl, output_item);
                            }
                            csome_list_var = csome_list_var.rest();
                            genl = csome_list_var.first();
                        }
                    }
                    if (pph_disambiguation.NIL == disambiguatedP && pph_disambiguation.NIL == list_utilities.empty_list_p(clarification_terms)) {
                        pph_add_disambiguation_string(clarification_terms.first(), output_item);
                    }
                }
            }
        }
        return output_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 13965L)
    public static SubLObject pph_clarification_terms_wrt(final SubLObject v_term, final SubLObject other_denots, SubLObject mt) {
        if (mt == pph_disambiguation.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return clarification_terms_wrt(v_term, other_denots, (SubLObject)pph_disambiguation.THREE_INTEGER, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 14121L)
    public static SubLObject clarification_terms_wrt(final SubLObject v_term, final SubLObject other_denots, SubLObject number, SubLObject mt) {
        if (number == pph_disambiguation.UNPROVIDED) {
            number = (SubLObject)pph_disambiguation.THREE_INTEGER;
        }
        if (mt == pph_disambiguation.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject terms = (pph_disambiguation.NIL != fort_types_interface.geographical_region_in_any_mtP(v_term) && pph_disambiguation.NIL != clarify_region_via_superregionP(v_term, other_denots)) ? rkf_concept_clarifier.rkf_region_clarification(v_term, mt) : pph_utilities.pph_salient_generalizations(v_term, number, mt, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        final SubLObject number_found = Sequences.length(terms);
        if (pph_disambiguation.NIL == list_utilities.empty_list_p(terms)) {
            SubLObject doomed = (SubLObject)pph_disambiguation.NIL;
            SubLObject cdolist_list_var = other_denots;
            SubLObject other_denot = (SubLObject)pph_disambiguation.NIL;
            other_denot = cdolist_list_var.first();
            while (pph_disambiguation.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = terms;
                SubLObject v_term_$4 = (SubLObject)pph_disambiguation.NIL;
                v_term_$4 = cdolist_list_var_$3.first();
                while (pph_disambiguation.NIL != cdolist_list_var_$3) {
                    if (pph_disambiguation.NIL != pph_utilities.pph_isaP(other_denot, v_term_$4, (SubLObject)pph_disambiguation.UNPROVIDED) || pph_disambiguation.NIL != pph_utilities.pph_genlP(other_denot, v_term_$4, (SubLObject)pph_disambiguation.UNPROVIDED)) {
                        doomed = (SubLObject)ConsesLow.cons(v_term_$4, doomed);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    v_term_$4 = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_denot = cdolist_list_var.first();
            }
            cdolist_list_var = doomed;
            SubLObject v_term_$5 = (SubLObject)pph_disambiguation.NIL;
            v_term_$5 = cdolist_list_var.first();
            while (pph_disambiguation.NIL != cdolist_list_var) {
                terms = Sequences.delete(v_term_$5, terms, Symbols.symbol_function((SubLObject)pph_disambiguation.EQUAL), (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term_$5 = cdolist_list_var.first();
            }
        }
        if (pph_disambiguation.NIL != list_utilities.empty_list_p(terms) && number_found.numGE(number)) {
            return clarification_terms_wrt(v_term, other_denots, Numbers.multiply((SubLObject)pph_disambiguation.TWO_INTEGER, number), mt);
        }
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 15157L)
    public static SubLObject clarify_region_via_superregionP(final SubLObject region, final SubLObject distractors) {
        final SubLObject distractor_regions = list_utilities.remove_if_not((SubLObject)pph_disambiguation.$sym68$GEOGRAPHICAL_REGION_IN_ANY_MT_, distractors, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        SubLObject ans = (SubLObject)pph_disambiguation.NIL;
        if (pph_disambiguation.NIL != distractor_regions) {
            if (pph_disambiguation.NIL != pph_types.pph_cityP(region)) {
                SubLObject non_city = (SubLObject)pph_disambiguation.NIL;
                if (pph_disambiguation.NIL == non_city) {
                    SubLObject csome_list_var = distractor_regions;
                    SubLObject distractor_region = (SubLObject)pph_disambiguation.NIL;
                    distractor_region = csome_list_var.first();
                    while (pph_disambiguation.NIL == non_city && pph_disambiguation.NIL != csome_list_var) {
                        if (pph_disambiguation.NIL == fort_types_interface.city_in_any_mtP(distractor_region)) {
                            non_city = distractor_region;
                        }
                        csome_list_var = csome_list_var.rest();
                        distractor_region = csome_list_var.first();
                    }
                }
                if (pph_disambiguation.NIL == non_city) {
                    ans = (SubLObject)pph_disambiguation.T;
                }
            }
            else if (pph_disambiguation.NIL != fort_types_interface.country_in_any_mtP(region)) {
                SubLObject non_country = (SubLObject)pph_disambiguation.NIL;
                if (pph_disambiguation.NIL == non_country) {
                    SubLObject csome_list_var = distractor_regions;
                    SubLObject distractor_region = (SubLObject)pph_disambiguation.NIL;
                    distractor_region = csome_list_var.first();
                    while (pph_disambiguation.NIL == non_country && pph_disambiguation.NIL != csome_list_var) {
                        if (pph_disambiguation.NIL == fort_types_interface.country_in_any_mtP(distractor_region)) {
                            non_country = distractor_region;
                        }
                        csome_list_var = csome_list_var.rest();
                        distractor_region = csome_list_var.first();
                    }
                }
                if (pph_disambiguation.NIL == non_country) {
                    ans = (SubLObject)pph_disambiguation.T;
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 16021L)
    public static SubLObject pph_possibly_add_alias(final SubLObject v_term, final SubLObject string) {
        SubLObject new_string = string_utilities.copy_string(string);
        if (pph_disambiguation.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_disambiguation.UNPROVIDED) && pph_disambiguation.NIL != pph_parenthetical_disambiguations_allowed_at_allP() && string.isString() && pph_disambiguation.NIL != kb_indexing_datastructures.indexed_term_p(v_term) && pph_disambiguation.NIL != pph_utilities.pph_isaP(v_term, pph_disambiguation.$const69$Agent_Generic, (SubLObject)pph_disambiguation.UNPROVIDED)) {
            SubLObject alias = (SubLObject)pph_disambiguation.NIL;
            if (pph_disambiguation.NIL == alias) {
                SubLObject csome_list_var;
                SubLObject alias_assertion;
                SubLObject this_alias;
                for (csome_list_var = pph_methods_lexicon.pph_lexifications_for_term(v_term, genl_predicates.all_spec_preds(pph_disambiguation.$const70$alias, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED), (SubLObject)pph_disambiguation.UNPROVIDED), alias_assertion = (SubLObject)pph_disambiguation.NIL, alias_assertion = csome_list_var.first(); pph_disambiguation.NIL == alias && pph_disambiguation.NIL != csome_list_var; this_alias = (alias = assertions_high.gaf_arg2(alias_assertion)), csome_list_var = csome_list_var.rest(), alias_assertion = csome_list_var.first()) {}
            }
            if (alias.isString()) {
                new_string = Sequences.cconcatenate(new_string, new SubLObject[] { pph_disambiguation.$str71$__aka__, alias, pph_disambiguation.$str72$__ });
            }
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 16673L)
    public static SubLObject pph_denots_to_disambiguate(final SubLObject string, final SubLObject v_term, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject other_denots = Sequences.remove(v_term, pph_known_denots_of_ambiguous_string(string), Symbols.symbol_function((SubLObject)pph_disambiguation.EQUAL), (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        if (pph_disambiguation.NIL != pph_parenthetical_disambiguations_allowed_for_string_for_termP(string, v_term) && pph_disambiguation.NIL != pph_category_ok_for_parenthetical_disambiguationP(category)) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                SubLObject cdolist_list_var = pph_utilities.pph_denots_of_string(string, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
                SubLObject denot = (SubLObject)pph_disambiguation.NIL;
                denot = cdolist_list_var.first();
                while (pph_disambiguation.NIL != cdolist_list_var) {
                    if (!denot.equal(v_term) && pph_disambiguation.NIL == subl_promotions.memberP(denot, other_denots, (SubLObject)pph_disambiguation.EQUAL, (SubLObject)pph_disambiguation.UNPROVIDED)) {
                        other_denots = (SubLObject)ConsesLow.cons(denot, other_denots);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                }
            }
            finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return other_denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 17312L)
    public static SubLObject pph_parenthetical_disambiguations_allowed_for_string_for_termP(final SubLObject string, final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_disambiguation.NIL != pph_parenthetical_disambiguations_allowed_at_allP() && string.isString() && pph_disambiguation.NIL != ((pph_disambiguation.NIL != cycl_variables.el_varP(v_term)) ? SubLObjectFactory.makeBoolean(pph_disambiguation.NIL != pph_variable_handling.pph_var_type(v_term) && pph_disambiguation.NIL == pph_variable_handling.pph_var_registered_as_defaultP(v_term)) : cycl_grammar.cycl_denotational_term_p(v_term)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 17641L)
    public static SubLObject pph_parenthetical_disambiguations_allowed_at_allP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$use_parenthetical_disambiguationsP$.getDynamicValue(thread).eql((SubLObject)pph_disambiguation.$kw73$WHEN_NECESSARY) && pph_disambiguation.NIL != pph_utilities.pph_top_level_preciseP()) {
            return (SubLObject)pph_disambiguation.T;
        }
        if (pph_disambiguation.NIL != pph_parenthetical_disambiguation_requestedP()) {
            return (SubLObject)pph_disambiguation.T;
        }
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 17913L)
    public static SubLObject pph_parenthetical_disambiguation_requestedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_vars.current_generation_level().numLE((SubLObject)pph_disambiguation.ONE_INTEGER) && pph_vars.$use_parenthetical_disambiguationsP$.getDynamicValue(thread).eql((SubLObject)pph_disambiguation.$kw74$TOP_LEVEL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 18087L)
    public static SubLObject pph_add_disambiguation_string(final SubLObject genl, final SubLObject output_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genl_paraphrase = (SubLObject)(genl.isString() ? genl : pph_disambiguation.NIL);
        SubLObject modifiedP = (SubLObject)pph_disambiguation.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind((SubLObject)pph_disambiguation.$kw75$TEXT, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind((SubLObject)pph_disambiguation.NIL, thread);
            assert pph_disambiguation.NIL != pph_utilities.pph_precision_p((SubLObject)pph_disambiguation.NIL) : pph_disambiguation.NIL;
            final SubLObject _prev_bind_0_$6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind((SubLObject)pph_disambiguation.NIL, thread);
                if (pph_disambiguation.NIL != genl && pph_disambiguation.NIL == genl_paraphrase) {
                    final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
                    final SubLObject nl_preds = (SubLObject)((pph_disambiguation.NIL != agr_pred) ? ConsesLow.list(agr_pred) : pph_disambiguation.NIL);
                    final SubLObject _prev_bind_0_$7 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_disambiguation.TWO_INTEGER, thread);
                        genl_paraphrase = pph_main.pph_phrase_generate_string_from_cycl(genl, nl_preds, (SubLObject)pph_disambiguation.UNPROVIDED);
                    }
                    finally {
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        if (genl_paraphrase.isString()) {
            final SubLObject parenthetical = Sequences.cconcatenate((SubLObject)pph_disambiguation.$str77$__, new SubLObject[] { genl_paraphrase, pph_disambiguation.$str78$_ });
            if (pph_disambiguation.NIL == string_utilities.substringP(parenthetical, pph_data_structures.pph_phrase_output_item_string(output_item), (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED)) {
                pph_data_structures.pph_phrase_output_item_suffix_string(output_item, parenthetical);
                modifiedP = (SubLObject)pph_disambiguation.T;
            }
        }
        return modifiedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 19042L)
    public static SubLObject pph_bad_disambiguatorP(final SubLObject genl, final SubLObject other_denots) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = (SubLObject)pph_disambiguation.NIL;
        if (pph_disambiguation.NIL == abortP) {
            SubLObject csome_list_var = other_denots;
            SubLObject other_denot = (SubLObject)pph_disambiguation.NIL;
            other_denot = csome_list_var.first();
            while (pph_disambiguation.NIL == abortP && pph_disambiguation.NIL != csome_list_var) {
                if (pph_disambiguation.NIL != ((pph_disambiguation.NIL != fort_types_interface.collection_in_any_mtP(other_denot)) ? pph_utilities.pph_genlP(other_denot, genl, pph_vars.$pph_domain_mt$.getDynamicValue(thread)) : pph_utilities.pph_isaP(other_denot, genl, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                    abortP = (SubLObject)pph_disambiguation.T;
                }
                csome_list_var = csome_list_var.rest();
                other_denot = csome_list_var.first();
            }
        }
        return abortP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 19475L)
    public static SubLObject pph_disambiguating_generalizations(final SubLObject objects, SubLObject mt) {
        if (mt == pph_disambiguation.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_disambiguation.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = (SubLObject)pph_disambiguation.NIL;
            v_object = cdolist_list_var.first();
            while (pph_disambiguation.NIL != cdolist_list_var) {
                SubLObject disambiguating_generalization = (SubLObject)pph_disambiguation.NIL;
                final SubLObject all_generalizations = pph_utilities.pph_salient_generalizations(v_object, (SubLObject)pph_disambiguation.$kw79$ALL, mt, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
                final SubLObject other_objects = Sequences.remove(v_object, objects, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
                if (pph_disambiguation.NIL == disambiguating_generalization) {
                    SubLObject csome_list_var = all_generalizations;
                    SubLObject generalization = (SubLObject)pph_disambiguation.NIL;
                    generalization = csome_list_var.first();
                    while (pph_disambiguation.NIL == disambiguating_generalization && pph_disambiguation.NIL != csome_list_var) {
                        if (pph_disambiguation.NIL == Sequences.find(generalization, other_objects, (SubLObject)pph_disambiguation.$sym80$PPH_INSTANCE_, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED) && pph_disambiguation.NIL == Sequences.find(generalization, other_objects, (SubLObject)pph_disambiguation.$sym81$PPH_SPEC_, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED)) {
                            disambiguating_generalization = generalization;
                        }
                        csome_list_var = csome_list_var.rest();
                        generalization = csome_list_var.first();
                    }
                }
                if (pph_disambiguation.NIL == disambiguating_generalization) {
                    disambiguating_generalization = all_generalizations.first();
                }
                ans = (SubLObject)ConsesLow.cons(disambiguating_generalization, ans);
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            }
            ans = Sequences.nreverse(ans);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 20475L)
    public static SubLObject pph_clarification_string(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_disambiguation.NIL != forts.fort_p(v_term) && pph_disambiguation.NIL != somewhere_cache.some_pred_assertion_somewhereP(pph_disambiguation.$const82$terseDisambiguationString, v_term, (SubLObject)pph_disambiguation.ONE_INTEGER, (SubLObject)pph_disambiguation.UNPROVIDED)) ? pph_utilities.pph_ask_variable((SubLObject)pph_disambiguation.$sym83$_STRING, (SubLObject)ConsesLow.listS(pph_disambiguation.$const82$terseDisambiguationString, v_term, (SubLObject)pph_disambiguation.$list84), pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_disambiguation.NIL, (SubLObject)pph_disambiguation.ONE_INTEGER).first() : pph_disambiguation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-disambiguation.lisp", position = 20842L)
    public static SubLObject pph_try_to_clarify_javalist(final SubLObject javalist, final SubLObject force, final SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == pph_disambiguation.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_disambiguation.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = pph_utilities.pph_javalist_string(javalist);
        final SubLObject pph_item = pph_utilities.pph_item_from_javalist(javalist);
        final SubLObject v_term = (SubLObject)((pph_disambiguation.NIL != pph_item) ? pph_data_structures.pph_phrase_output_item_cycl(pph_item) : pph_disambiguation.NIL);
        final SubLObject category = pph_utilities.pph_np_category();
        if (pph_disambiguation.NIL == pph_item) {
            Errors.warn((SubLObject)pph_disambiguation.$str85$Can_t_disambiguate_javalist_____S, javalist);
            return javalist;
        }
        assert pph_disambiguation.NIL != pph_utilities.pph_precision_p((SubLObject)pph_disambiguation.T) : pph_disambiguation.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_disambiguation.T, thread);
            pph_vars.$pph_ambiguous_strings$.bind((pph_disambiguation.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_disambiguation.EQUALP), (SubLObject)pph_disambiguation.UNPROVIDED), thread);
            pph_possibly_add_disambiguation_string(pph_item, category);
        }
        finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        if (pph_disambiguation.NIL != pph_unambiguous_string_p(pph_data_structures.pph_phrase_output_item_string(pph_item))) {
            return pph_utilities.pph_output_list_to_javalist((SubLObject)ConsesLow.list(pph_item));
        }
        if (pph_disambiguation.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_disambiguation.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_disambiguation.T, (SubLObject)pph_disambiguation.$str86$Reparaphrasing____S_due_to_ambigu, v_term, string, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        }
        pph_note_ambiguous_string(string, v_term);
        final SubLObject new_string = pph_main.generate_text_wXsentential_force_no_checks(v_term, force, nl_preds, language_mt, domain_mt, (SubLObject)pph_disambiguation.$kw75$TEXT, (SubLObject)pph_disambiguation.UNPROVIDED);
        if (pph_disambiguation.NIL == pph_unambiguous_string_p(new_string)) {
            if (pph_disambiguation.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_disambiguation.ONE_INTEGER) && pph_disambiguation.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_disambiguation.$str87$Failed_to_disambiguate__S_, v_term);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return javalist;
        }
        if (pph_disambiguation.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_disambiguation.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_disambiguation.T, (SubLObject)pph_disambiguation.$str88$Disambiguated____S___to__S, v_term, new_string, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED, (SubLObject)pph_disambiguation.UNPROVIDED);
        }
        return pph_utilities.new_pph_javalist(new_string, (SubLObject)ConsesLow.list(pph_utilities.new_pph_javalist_item(new_string, v_term, pph_data_structures.pph_phrase_output_item_arg_position(pph_item), pph_data_structures.pph_phrase_output_item_html_open_tag(pph_item), pph_data_structures.pph_phrase_output_item_html_close_tag(pph_item), (SubLObject)pph_disambiguation.ZERO_INTEGER)));
    }
    
    public static SubLObject declare_pph_disambiguation_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_disambiguation", "paraphrase_with_disambiguation_numbered", "PARAPHRASE-WITH-DISAMBIGUATION-NUMBERED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "remembering_pph_ambiguous_stringsP", "REMEMBERING-PPH-AMBIGUOUS-STRINGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "make_incremental_pph_disambiguation_result", "MAKE-INCREMENTAL-PPH-DISAMBIGUATION-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "incremental_pph_disambiguation_result_p", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "incremental_pph_disambiguation_result_index", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "incremental_pph_disambiguation_result_output_list", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-OUTPUT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_disambiguation_note", "PPH-DISAMBIGUATION-NOTE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "note_pph_output_list_for_disambiguation", "NOTE-PPH-OUTPUT-LIST-FOR-DISAMBIGUATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_demerit_cutoff_from_olist", "PPH-DEMERIT-CUTOFF-FROM-OLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_new_olist_better_than_oldP", "PPH-NEW-OLIST-BETTER-THAN-OLD?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_output_list_E", "PPH-OUTPUT-LIST-=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_dereference_indexes", "PPH-DEREFERENCE-INDEXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_get_tagless_strings", "PPH-GET-TAGLESS-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_find_duplicates", "PPH-FIND-DUPLICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_note_ambiguous_string", "PPH-NOTE-AMBIGUOUS-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_string_ambiguous_p", "PPH-STRING-AMBIGUOUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_known_denots_of_ambiguous_string", "PPH-KNOWN-DENOTS-OF-AMBIGUOUS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_unambiguous_string_p", "PPH-UNAMBIGUOUS-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_output_item_ambiguous_p", "PPH-OUTPUT-ITEM-AMBIGUOUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_duplicate_stringsP", "PPH-DUPLICATE-STRINGS?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_disambiguation", "paraphrase_with_disambiguation", "PARAPHRASE-WITH-DISAMBIGUATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_category_ok_for_parenthetical_disambiguationP", "PPH-CATEGORY-OK-FOR-PARENTHETICAL-DISAMBIGUATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_possibly_add_disambiguation_string", "PPH-POSSIBLY-ADD-DISAMBIGUATION-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_clarification_terms_wrt", "PPH-CLARIFICATION-TERMS-WRT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "clarification_terms_wrt", "CLARIFICATION-TERMS-WRT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "clarify_region_via_superregionP", "CLARIFY-REGION-VIA-SUPERREGION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_possibly_add_alias", "PPH-POSSIBLY-ADD-ALIAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_denots_to_disambiguate", "PPH-DENOTS-TO-DISAMBIGUATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_parenthetical_disambiguations_allowed_for_string_for_termP", "PPH-PARENTHETICAL-DISAMBIGUATIONS-ALLOWED-FOR-STRING-FOR-TERM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_parenthetical_disambiguations_allowed_at_allP", "PPH-PARENTHETICAL-DISAMBIGUATIONS-ALLOWED-AT-ALL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_parenthetical_disambiguation_requestedP", "PPH-PARENTHETICAL-DISAMBIGUATION-REQUESTED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_add_disambiguation_string", "PPH-ADD-DISAMBIGUATION-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_bad_disambiguatorP", "PPH-BAD-DISAMBIGUATOR?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_disambiguating_generalizations", "PPH-DISAMBIGUATING-GENERALIZATIONS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_clarification_string", "PPH-CLARIFICATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_disambiguation", "pph_try_to_clarify_javalist", "PPH-TRY-TO-CLARIFY-JAVALIST", 3, 2, false);
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    public static SubLObject init_pph_disambiguation_file() {
        pph_disambiguation.$pph_disambiguation_demerit_cutoff$ = SubLFiles.defparameter("*PPH-DISAMBIGUATION-DEMERIT-CUTOFF*", (SubLObject)pph_disambiguation.TWO_INTEGER);
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    public static SubLObject setup_pph_disambiguation_file() {
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym26$PPH_DISAMBIGUATION_NOTE, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym15$NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym33$PPH_DEMERIT_CUTOFF_FROM_OLIST, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym45$PPH_OUTPUT_LIST__, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym28$PPH_DEREFERENCE_INDEXES, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym55$PPH_GET_TAGLESS_STRINGS, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym24$PPH_FIND_DUPLICATES, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        access_macros.register_macro_helper((SubLObject)pph_disambiguation.$sym58$PPH_DUPLICATE_STRINGS_, (SubLObject)pph_disambiguation.$sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        return (SubLObject)pph_disambiguation.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_disambiguation_file();
    }
    
    public void initializeVariables() {
        init_pph_disambiguation_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_disambiguation_file();
    }
    
    static {
        me = (SubLFile)new pph_disambiguation();
        pph_disambiguation.$pph_disambiguation_demerit_cutoff$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("ANS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$OUTPUT_LISTS = SubLObjectFactory.makeUninternedSymbol("OUTPUT-LISTS");
        $sym2$DUPE_INDEX_LIST = SubLObjectFactory.makeUninternedSymbol("DUPE-INDEX-LIST");
        $sym3$DUPE_INDEX_LISTS = SubLObjectFactory.makeUninternedSymbol("DUPE-INDEX-LISTS");
        $sym4$DUPE_OBJECTS = SubLObjectFactory.makeUninternedSymbol("DUPE-OBJECTS");
        $sym5$NEW_PRECISION = SubLObjectFactory.makeUninternedSymbol("NEW-PRECISION");
        $sym6$NEW_OUTPUT_LIST = SubLObjectFactory.makeUninternedSymbol("NEW-OUTPUT-LIST");
        $sym7$OLIST = SubLObjectFactory.makeUninternedSymbol("OLIST");
        $sym8$ABORT_ = SubLObjectFactory.makeUninternedSymbol("ABORT?");
        $sym9$WITH_PPH_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION");
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)pph_disambiguation.NIL);
        $sym12$REMEMBERING_PPH_AMBIGUOUS_STRINGS = SubLObjectFactory.makeSymbol("REMEMBERING-PPH-AMBIGUOUS-STRINGS");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-DISAMBIGUATION-NOTE"), (SubLObject)pph_disambiguation.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~&Trying default precision: ~S.~%"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-CURRENT-PRECISION")));
        $sym14$CSOME_NUMBERED = SubLObjectFactory.makeSymbol("CSOME-NUMBERED");
        $sym15$NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION = SubLObjectFactory.makeSymbol("NOTE-PPH-OUTPUT-LIST-FOR-DISAMBIGUATION");
        $sym16$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym17$PPH_PHRASE_OUTPUT_LIST_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-P");
        $sym18$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym19$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list20 = ConsesLow.list((SubLObject)pph_disambiguation.T);
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FAILURE"));
        $sym22$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym23$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym24$PPH_FIND_DUPLICATES = SubLObjectFactory.makeSymbol("PPH-FIND-DUPLICATES");
        $sym25$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym26$PPH_DISAMBIGUATION_NOTE = SubLObjectFactory.makeSymbol("PPH-DISAMBIGUATION-NOTE");
        $str27$__Working_on_dupe_list___S__ = SubLObjectFactory.makeString("~&Working on dupe list: ~S~%");
        $sym28$PPH_DEREFERENCE_INDEXES = SubLObjectFactory.makeSymbol("PPH-DEREFERENCE-INDEXES");
        $sym29$NTH = SubLObjectFactory.makeSymbol("NTH");
        $str30$__Trying_to_reparaphrase__S___ = SubLObjectFactory.makeString("~&Trying to reparaphrase ~S.~%");
        $sym31$PPH_PRECISION_FOR_OBJECT = SubLObjectFactory.makeSymbol("PPH-PRECISION-FOR-OBJECT");
        $sym32$NEW_DEMERIT_CUTOFF = SubLObjectFactory.makeSymbol("NEW-DEMERIT-CUTOFF");
        $sym33$PPH_DEMERIT_CUTOFF_FROM_OLIST = SubLObjectFactory.makeSymbol("PPH-DEMERIT-CUTOFF-FROM-OLIST");
        $sym34$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-CURRENT-PRECISION")));
        $str36$__Trying_targeted_precision__S_fo = SubLObjectFactory.makeString("~&Trying targeted precision ~S for ~S");
        $sym37$WITH_PARAPHRASE_PRECISION = SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-PRECISION");
        $sym38$WITH_PPH_DEMERIT_CUTOFF = SubLObjectFactory.makeSymbol("WITH-PPH-DEMERIT-CUTOFF");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEMERIT-CUTOFF"));
        $str40$__New_paraphrase_with_precision__ = SubLObjectFactory.makeString("~&New paraphrase with precision ~S for ~S:~% ~S");
        $sym41$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym42$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym43$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym44$FIMPLIES = SubLObjectFactory.makeSymbol("FIMPLIES");
        $sym45$PPH_OUTPUT_LIST__ = SubLObjectFactory.makeSymbol("PPH-OUTPUT-LIST-=");
        $str46$__Trying_full_precision_for__S = SubLObjectFactory.makeString("~&Trying full precision for ~S");
        $sym47$WITH_PRECISE_PARAPHRASE_ON = SubLObjectFactory.makeSymbol("WITH-PRECISE-PARAPHRASE-ON");
        $str48$__New_paraphrase_with_full_precis = SubLObjectFactory.makeString("~&New paraphrase with full precision for ~S:~% ~S");
        $sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_ = SubLObjectFactory.makeSymbol("PPH-NEW-OLIST-BETTER-THAN-OLD?");
        $str50$__Changing_output_list_for__S_fro = SubLObjectFactory.makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");
        $sym51$SET_NTH = SubLObjectFactory.makeSymbol("SET-NTH");
        $sym52$PPH_POSSIBLY_ADD_REFERENCE_MARKER = SubLObjectFactory.makeSymbol("PPH-POSSIBLY-ADD-REFERENCE-MARKER");
        $sym53$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym54$PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED = SubLObjectFactory.makeSymbol("PARAPHRASE-WITH-DISAMBIGUATION-NUMBERED");
        $sym55$PPH_GET_TAGLESS_STRINGS = SubLObjectFactory.makeSymbol("PPH-GET-TAGLESS-STRINGS");
        $sym56$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS");
        $kw57$DENOTS_UNKNOWN = SubLObjectFactory.makeKeyword("DENOTS-UNKNOWN");
        $sym58$PPH_DUPLICATE_STRINGS_ = SubLObjectFactory.makeSymbol("PPH-DUPLICATE-STRINGS?");
        $str59$___S_is_a_duplicate_of__S___ = SubLObjectFactory.makeString("~&~S is a duplicate of ~S.~%");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECTS"), (SubLObject)SubLObjectFactory.makeSymbol("ANS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$IGNOREME = SubLObjectFactory.makeUninternedSymbol("IGNOREME");
        $kw62$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const63$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const64$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $str65$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str66$__ = SubLObjectFactory.makeString(") ");
        $str67$Can_t_add_disambiguation_string__ = SubLObjectFactory.makeString("Can't add disambiguation string. Null category for ~S");
        $sym68$GEOGRAPHICAL_REGION_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");
        $const69$Agent_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agent-Generic"));
        $const70$alias = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("alias"));
        $str71$__aka__ = SubLObjectFactory.makeString(" (aka \"");
        $str72$__ = SubLObjectFactory.makeString("\")");
        $kw73$WHEN_NECESSARY = SubLObjectFactory.makeKeyword("WHEN-NECESSARY");
        $kw74$TOP_LEVEL = SubLObjectFactory.makeKeyword("TOP-LEVEL");
        $kw75$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $sym76$PPH_PRECISION_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $str77$__ = SubLObjectFactory.makeString(" (");
        $str78$_ = SubLObjectFactory.makeString(")");
        $kw79$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym80$PPH_INSTANCE_ = SubLObjectFactory.makeSymbol("PPH-INSTANCE?");
        $sym81$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $const82$terseDisambiguationString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("terseDisambiguationString"));
        $sym83$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"));
        $str85$Can_t_disambiguate_javalist_____S = SubLObjectFactory.makeString("Can't disambiguate javalist:~% ~S");
        $str86$Reparaphrasing____S_due_to_ambigu = SubLObjectFactory.makeString("Reparaphrasing~% ~S due to ambiguous string~% ~S.");
        $str87$Failed_to_disambiguate__S_ = SubLObjectFactory.makeString("Failed to disambiguate ~S.");
        $str88$Disambiguated____S___to__S = SubLObjectFactory.makeString("Disambiguated~% ~S~% to ~S");
    }
}

/*

	Total time: 226 ms
	
*/