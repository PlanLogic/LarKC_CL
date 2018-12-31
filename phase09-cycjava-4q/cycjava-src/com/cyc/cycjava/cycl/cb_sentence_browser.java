package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_sentence_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_sentence_browser";
    public static final String myFingerPrint = "be9bca7e3451b03f76e53060dbbb6d2599aa013cff92503695ef68b0d49e88cd";
    private static final SubLList $list0;
    private static final SubLString $str1$Could_not_determine_a_sentence_fr;
    private static final SubLSymbol $sym2$CB_SENTENCE;
    private static final SubLSymbol $kw3$HTML_HANDLER;
    private static final SubLObject $const4$ist;
    private static final SubLString $str5$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str6$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw7$UNINITIALIZED;
    private static final SubLString $str8$CycL_Sentence;
    private static final SubLString $str9$Mt___;
    private static final SubLSymbol $kw10$RED;
    private static final SubLString $str11$Sentence_Not_Well_formed__;
    private static final SubLString $str12$EL_Sentence___;
    private static final SubLString $str13$HL_Sentence___;
    private static final SubLString $str14$English_Translation___;
    private static final SubLSymbol $kw15$NL;
    private static final SubLSymbol $kw16$SENTENCE;
    private static final SubLSymbol $kw17$SILK;
    private static final SubLString $str18$_in_;
    private static final SubLSymbol $kw19$CB_SENTENCE;
    private static final SubLString $str20$cb_sentence_html;
    private static final SubLSymbol $kw21$SHOW_ENGLISH_FOR_CYCL_SENTENCE;
    private static final SubLSymbol $kw22$SHOW_EL_VERSION_OF_SENTENCE;
    private static final SubLSymbol $kw23$ASSERT_SIMILAR_SENTENCE;
    private static final SubLSymbol $kw24$EDIT_SENTENCE;
    private static final SubLSymbol $kw25$UNASSERT_SENTENCE;
    private static final SubLSymbol $kw26$SENTENCE_QUERY_SIMILAR;
    private static final SubLSymbol $kw27$CLONE_SENTENCE;
    private static final SubLSymbol $kw28$JUSTIFY_SENTENCE;
    private static final SubLString $str29$_Show_English_;
    private static final SubLSymbol $kw30$MAIN;
    private static final SubLString $str31$cb_sentence_with_show_english__a;
    private static final SubLSymbol $sym32$CB_LINK_SHOW_ENGLISH_FOR_CYCL_SENTENCE;
    private static final SubLSymbol $sym33$CB_SENTENCE_WITH_SHOW_ENGLISH;
    private static final SubLString $str34$_EL_Formula_;
    private static final SubLString $str35$cb_sentence_with_show_el_formula_;
    private static final SubLSymbol $sym36$CB_LINK_SHOW_EL_VERSION_OF_SENTENCE;
    private static final SubLSymbol $sym37$CB_SENTENCE_WITH_SHOW_EL_FORMULA;
    private static final SubLString $str38$_WFF_Check_;
    private static final SubLString $str39$cb_wff_check_sentence__A;
    private static final SubLSymbol $kw40$WFF_CHECK_SENTENCE;
    private static final SubLSymbol $sym41$CB_LINK_WFF_CHECK_SENTENCE;
    private static final SubLList $list42;
    private static final SubLString $str43$_a_does_not_specify_a_CycL_senten;
    private static final SubLSymbol $sym44$CB_WFF_CHECK_SENTENCE;
    private static final SubLString $str45$cb_wff_check_forward_placement_se;
    private static final SubLSymbol $kw46$WFF_CHECK_FORWARD_PLACEMENT_SENTENCE;
    private static final SubLSymbol $sym47$CB_LINK_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$_EXIT;
    private static final SubLSymbol $sym50$CB_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE;
    private static final SubLString $str51$_Assert_Similar_;
    private static final SubLSymbol $kw52$SELF;
    private static final SubLString $str53$cb_assert_similar_sentence__a;
    private static final SubLSymbol $sym54$CB_LINK_ASSERT_SIMILAR_SENTENCE;
    private static final SubLString $str55$the_Cyc_KB_editing_facilities;
    private static final SubLSymbol $kw56$SIMILAR;
    private static final SubLSymbol $sym57$CB_ASSERT_SIMILAR_SENTENCE;
    private static final SubLString $str58$_Edit_;
    private static final SubLString $str59$cb_edit_sentence__a;
    private static final SubLSymbol $sym60$CB_LINK_EDIT_SENTENCE;
    private static final SubLSymbol $sym61$CB_EDIT_SENTENCE;
    private static final SubLString $str62$_Unassert_;
    private static final SubLString $str63$cb_unassert_sentence__a;
    private static final SubLSymbol $sym64$CB_LINK_UNASSERT_SENTENCE;
    private static final SubLString $str65$Unassert;
    private static final SubLSymbol $sym66$CB_UNASSERT_SENTENCE;
    private static final SubLSymbol $sym67$POSSIBLY_SENTENCE_P;
    private static final SubLString $str68$_Query_Similar_;
    private static final SubLString $str69$cb_sentence_query_similar__A;
    private static final SubLSymbol $sym70$CB_LINK_SENTENCE_QUERY_SIMILAR;
    private static final SubLString $str71$That_sentence_is_not_available_;
    private static final SubLSymbol $sym72$CB_SENTENCE_QUERY_SIMILAR;
    private static final SubLString $str73$_Clone_;
    private static final SubLString $str74$cb_clone_sentence__a;
    private static final SubLSymbol $sym75$CB_LINK_CLONE_SENTENCE;
    private static final SubLSymbol $sym76$CB_CLONE_SENTENCE;
    private static final SubLString $str77$Clone_CycL_Sentence;
    private static final SubLSymbol $kw78$CB_CYC;
    private static final SubLSymbol $kw79$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw80$SHA1;
    private static final SubLString $str81$yui_skin_sam;
    private static final SubLString $str82$reloadFrameButton;
    private static final SubLString $str83$button;
    private static final SubLString $str84$reload;
    private static final SubLString $str85$Refresh_Frames;
    private static final SubLString $str86$post;
    private static final SubLString $str87$cb_handle_clone_sentence;
    private static final SubLString $str88$clone_form;
    private static final SubLString $str89$Reset_Values;
    private static final SubLString $str90$Clone;
    private static final SubLString $str91$clone;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$CB_HANDLE_CLONE_SENTENCE;
    private static final SubLSymbol $sym95$STRINGP;
    private static final SubLString $str96$Bad_sentence__probably_due_to_a_m;
    private static final SubLString $str97$CycL_Sentence_not_Well_Formed;
    private static final SubLString $str98$Back;
    private static final SubLString $str99$Sentence___;
    private static final SubLString $str100$Diagnosis___;
    private static final SubLString $str101$This_is_not_a_syntactically_well_;
    private static final SubLString $str102$_________cycdoc_ref_cycl_syntax_h;
    private static final SubLString $str103$Syntax_of_CycL;
    private static final SubLString $str104$_document_;
    private static final SubLString $str105$_Justify_;
    private static final SubLString $str106$cb_justify_sentence__a;
    private static final SubLSymbol $sym107$CB_LINK_JUSTIFY_SENTENCE;
    private static final SubLSymbol $sym108$CB_JUSTIFY_SENTENCE;
    private static final SubLSymbol $kw109$SKSI;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 602L)
    public static SubLObject cb_sentence(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list0);
        id_string = args.first();
        SubLObject current = args.rest();
        final SubLObject justifyP = (SubLObject)(current.isCons() ? current.first() : cb_sentence_browser.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_sentence_browser.$list0);
        current = current.rest();
        if (cb_sentence_browser.NIL == current) {
            final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
            if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                return cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str1$Could_not_determine_a_sentence_fr, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            final SubLObject v_assert = czer_meta.find_assertion_cycl(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL != assertion_handles.assertion_p(v_assert)) {
                cb_tools.cb_rem_from_sentence_history(sentence);
                cb_assertion_browser.cb_assertion_internal(v_assert);
            }
            else {
                cb_sentence_internal(sentence, (SubLObject)cb_sentence_browser.NIL, justifyP);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list0);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 1161L)
    public static SubLObject cb_sentence_internal(final SubLObject sentence, SubLObject mt, SubLObject justifyP) {
        if (mt == cb_sentence_browser.UNPROVIDED) {
            mt = (SubLObject)cb_sentence_browser.NIL;
        }
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
            final SubLObject new_mt = el_utilities.designated_mt(sentence);
            final SubLObject subsentence = el_utilities.designated_sentence(sentence);
            return cb_sentence_internal(subsentence, new_mt, justifyP);
        }
        return cb_sentence_internal_guts(sentence, mt, justifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 1506L)
    public static SubLObject cb_sentence_internal_guts(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_tools.cb_add_to_sentence_history(el_utilities.make_el_formula(cb_sentence_browser.$const4$ist, (SubLObject)ConsesLow.list(mt, sentence), (SubLObject)cb_sentence_browser.UNPROVIDED));
        html_utilities.html_markup((SubLObject)cb_sentence_browser.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_sentence_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str6$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_sentence_browser.$kw7$UNINITIALIZED) ? ConsesLow.list(cb_sentence_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str8$CycL_Sentence);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_sentence_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_sentence_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_sentence_browser.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_sentence_browser.$str8$CycL_Sentence);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_sentence_browser.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        cb_sentence_toolbar(sentence, mt, justifyP);
                        html_utilities.html_hr((SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        cb_sentence_info(sentence, mt, justifyP);
                        cb_sentence_diagnostics(sentence, mt);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 2091L)
    public static SubLObject cb_sentence_info(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        if (cb_sentence_browser.NIL != mt) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str9$Mt___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_form(mt, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        cb_sentence_show_variants(sentence, mt, justifyP);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 2331L)
    public static SubLObject cb_sentence_diagnostics(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL != cb_parameters.$cb_a_perform_access_diagnostics$.getDynamicValue(thread)) {
            cb_sentence_access_diagnostics(sentence, mt);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 2533L)
    public static SubLObject cb_sentence_access_diagnostics(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_problem = (SubLObject)cb_sentence_browser.NIL;
        if (cb_sentence_browser.NIL == wff.el_wffP(sentence, mt, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
            some_problem = (SubLObject)cb_sentence_browser.T;
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind((SubLObject)cb_sentence_browser.T, thread);
                final SubLObject color_val = (SubLObject)cb_sentence_browser.$kw10$RED;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_sentence_browser.NIL != color_val) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_val));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_sentence_browser.$str11$Sentence_Not_Well_formed__);
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                wff.explain_why_not_wff(sentence, mt, html_macros.$html_stream$.getDynamicValue(thread));
            }
            finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        }
        return some_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 2903L)
    public static SubLObject cb_sentence_show_variants(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL != cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread)) {
            final SubLObject el_sentence = cycl_utilities.hl_to_el(sentence);
            if (cb_sentence_browser.NIL == cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread) || !fi.assertion_expand(narts_high.nart_expand(el_sentence)).equal(fi.assertion_expand(narts_high.nart_expand(sentence)))) {
                html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str12$EL_Sentence___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                cb_show_sentence(el_sentence, mt, justifyP);
                html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
        }
        if (cb_sentence_browser.NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str13$HL_Sentence___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            cb_show_sentence(sentence, mt, justifyP);
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        if (cb_sentence_browser.NIL != cb_parameters.$cb_a_show_english$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str14$English_Translation___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding(thread);
            try {
                control_vars.$cb_major_presentation_language$.bind((SubLObject)cb_sentence_browser.$kw15$NL, thread);
                cb_show_sentence_readably(sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.T, justifyP);
            }
            finally {
                control_vars.$cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 3899L)
    public static SubLObject cb_show_sentence(final SubLObject sentence, SubLObject mt, SubLObject justifyP) {
        if (mt == cb_sentence_browser.UNPROVIDED) {
            mt = (SubLObject)cb_sentence_browser.NIL;
        }
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLObject ist_sentence = (SubLObject)ConsesLow.list(cb_sentence_browser.$const4$ist, mt, sentence);
        cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw16$SENTENCE, ist_sentence, justifyP, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_utilities.cb_form(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 4101L)
    public static SubLObject cb_show_sentence_readably(final SubLObject sentence, final SubLObject mt, SubLObject wrap, SubLObject include_mtP, SubLObject justifyP) {
        if (wrap == cb_sentence_browser.UNPROVIDED) {
            wrap = cb_parameters.$cb_c_wrap_assertions$.getDynamicValue();
        }
        if (include_mtP == cb_sentence_browser.UNPROVIDED) {
            include_mtP = (SubLObject)cb_sentence_browser.T;
        }
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ist_sentence = (SubLObject)ConsesLow.list(cb_sentence_browser.$const4$ist, mt, sentence);
        cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw16$SENTENCE, ist_sentence, justifyP, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)cb_sentence_browser.$kw15$NL)) {
            cb_utilities.cb_show_sentence_in_nl(sentence, mt);
            return sentence;
        }
        if (pcase_var.eql((SubLObject)cb_sentence_browser.$kw17$SILK)) {
            Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-SUPPORT-SENTENCE-IN-SILK"), sentence);
            if (cb_sentence_browser.NIL != include_mtP) {
                html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str18$_in_);
                Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CB-SHOW-TERM-IN-SILK"), mt);
            }
            return sentence;
        }
        if (cb_sentence_browser.NIL != wrap) {
            cb_utilities.cb_form(sentence, (SubLObject)cb_sentence_browser.ZERO_INTEGER, (SubLObject)cb_sentence_browser.T);
            if (cb_sentence_browser.NIL != mt && cb_sentence_browser.NIL != include_mtP) {
                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str18$_in_);
                cb_utilities.cb_form(mt, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
        }
        else {
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_utilities.cb_form(sentence, (SubLObject)cb_sentence_browser.ZERO_INTEGER, (SubLObject)cb_sentence_browser.NIL);
            if (cb_sentence_browser.NIL != mt && cb_sentence_browser.NIL != include_mtP) {
                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str18$_in_);
                cb_utilities.cb_form(mt, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 5067L)
    public static SubLObject sentence_modification_permittedP(final SubLObject sentence, final SubLObject mt) {
        if (cb_sentence_browser.NIL != subl_promotions.memberP(cycl_utilities.formula_operator(sentence), bookkeeping_store.bookkeeping_predicates_for_hl_store(), (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
            return (SubLObject)cb_sentence_browser.NIL;
        }
        if (cb_sentence_browser.NIL != sksi_kb_accessors.sksi_content_mt_p(mt) && cb_sentence_browser.NIL != sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt) && cb_sentence_browser.NIL == sksi_kb_accessors.modifiable_sk_source_in_any_mt_p(sksi_kb_accessors.content_mt_sk_source_in_any_mt(mt))) {
            return (SubLObject)cb_sentence_browser.NIL;
        }
        return (SubLObject)cb_sentence_browser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 5575L)
    public static SubLObject cb_sentence_toolbar(final SubLObject sentence, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == cb_sentence_browser.UNPROVIDED) {
            justifyP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL != el_utilities.possibly_sentence_p(sentence)) {
            final SubLObject ist_sentence = (SubLObject)ConsesLow.list(cb_sentence_browser.$const4$ist, mt, sentence);
            final SubLObject non_modifiable_via_fiP = (SubLObject)SubLObjectFactory.makeBoolean(cb_sentence_browser.NIL == sentence_modification_permittedP(sentence, mt));
            cb_utilities.cb_help_preamble((SubLObject)cb_sentence_browser.$kw19$CB_SENTENCE, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL == cb_parameters.$cb_a_show_english$.getDynamicValue(thread)) {
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw21$SHOW_ENGLISH_FOR_CYCL_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            if (cb_sentence_browser.NIL == cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread)) {
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw22$SHOW_EL_VERSION_OF_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread)) {
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw23$ASSERT_SIMILAR_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw24$EDIT_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.NIL, non_modifiable_via_fiP, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw25$UNASSERT_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.NIL, non_modifiable_via_fiP, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw26$SENTENCE_QUERY_SIMILAR, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw27$CLONE_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL != justifyP) {
                cb_utilities.cb_link((SubLObject)cb_sentence_browser.$kw28$JUSTIFY_SENTENCE, ist_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
            }
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 6862L)
    public static SubLObject cb_link_show_english_for_cycl_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str29$_Show_English_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw30$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str31$cb_sentence_with_show_english__a, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 7178L)
    public static SubLObject cb_sentence_with_show_english(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_english$.currentBinding(thread);
        try {
            cb_parameters.$cb_a_show_english$.bind((SubLObject)cb_sentence_browser.T, thread);
            cb_sentence(args);
        }
        finally {
            cb_parameters.$cb_a_show_english$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 7308L)
    public static SubLObject cb_link_show_el_version_of_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str34$_EL_Formula_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw30$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str35$cb_sentence_with_show_el_formula_, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 7587L)
    public static SubLObject cb_sentence_with_show_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_el_formula$.currentBinding(thread);
        try {
            cb_parameters.$cb_a_show_el_formula$.bind((SubLObject)cb_sentence_browser.T, thread);
            cb_sentence(args);
        }
        finally {
            cb_parameters.$cb_a_show_el_formula$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 7723L)
    public static SubLObject cb_link_wff_check_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str38$_WFF_Check_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw30$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str39$cb_wff_check_sentence__A, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 8055L)
    public static SubLObject cb_wff_check_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_sentence_browser.NIL == current) {
            final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
            SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
            if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str43$_a_does_not_specify_a_CycL_senten, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            if (cb_sentence_browser.NIL != cb_parameters.$cb_default_mt$.getDynamicValue(thread)) {
                mt = cb_parameters.$cb_default_mt$.getDynamicValue(thread);
            }
            SubLObject mt_to_diagnose = mt;
            SubLObject sentence_to_diagnose = sentence;
            if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
                mt_to_diagnose = el_utilities.designated_mt(sentence);
                sentence_to_diagnose = el_utilities.designated_sentence(sentence);
            }
            return cb_assertion_editor.cb_wff_check_sentence_int(sentence_to_diagnose, mt_to_diagnose, (SubLObject)cb_sentence_browser.T, (SubLObject)cb_sentence_browser.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 8699L)
    public static SubLObject cb_link_wff_check_forward_placement_sentence(final SubLObject sentence, final SubLObject rule, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str38$_WFF_Check_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw30$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str45$cb_wff_check_forward_placement_se, cb_parameters.cb_glob_id(sentence), assertion_handles.assertion_id(rule));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 9152L)
    public static SubLObject cb_wff_check_forward_placement_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        SubLObject rule_id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list48);
        id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_sentence_browser.$list48);
        rule_id_string = current.first();
        current = current.rest();
        if (cb_sentence_browser.NIL == current) {
            final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
            final SubLObject rule = cb_utilities.cb_guess_assertion(rule_id_string);
            SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
            if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str43$_a_does_not_specify_a_CycL_senten, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            if (cb_sentence_browser.NIL != cb_parameters.$cb_default_mt$.getDynamicValue(thread)) {
                mt = cb_parameters.$cb_default_mt$.getDynamicValue(thread);
            }
            SubLObject mt_to_diagnose = mt;
            SubLObject sentence_to_diagnose = sentence;
            if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
                mt_to_diagnose = el_utilities.designated_mt(sentence);
                sentence_to_diagnose = el_utilities.designated_sentence(sentence);
            }
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = forward.$forward_inference_rule$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(list_utilities.sublisp_boolean(rule), thread);
                forward.$forward_inference_rule$.bind(rule, thread);
                return cb_assertion_editor.cb_wff_check_sentence_int(sentence_to_diagnose, mt_to_diagnose, (SubLObject)cb_sentence_browser.T, (SubLObject)cb_sentence_browser.T);
            }
            finally {
                forward.$forward_inference_rule$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list48);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 9973L)
    public static SubLObject cb_link_assert_similar_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str51$_Assert_Similar_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str53$cb_assert_similar_sentence__a, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 10340L)
    public static SubLObject cb_assert_similar_sentence(final SubLObject args) {
        if (cb_sentence_browser.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_sentence_browser.$str55$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (cb_sentence_browser.NIL == current) {
                final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
                if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                    cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str43$_a_does_not_specify_a_CycL_senten, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    return (SubLObject)cb_sentence_browser.NIL;
                }
                cb_assertion_editor.cb_assert_internal((SubLObject)cb_sentence_browser.$kw56$SIMILAR, (SubLObject)cb_sentence_browser.NIL, sentence, (SubLObject)cb_sentence_browser.T);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            }
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 10768L)
    public static SubLObject cb_link_edit_sentence(final SubLObject sentence, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        if (disabledP == cb_sentence_browser.UNPROVIDED) {
            disabledP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str58$_Edit_;
        }
        if (cb_sentence_browser.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str59$cb_edit_sentence__a, cb_parameters.cb_glob_id(sentence));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 11135L)
    public static SubLObject cb_edit_sentence(final SubLObject args) {
        if (cb_sentence_browser.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_sentence_browser.$str55$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (cb_sentence_browser.NIL == current) {
                final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
                if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                    cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str43$_a_does_not_specify_a_CycL_senten, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    return (SubLObject)cb_sentence_browser.NIL;
                }
                cb_assertion_editor.cb_assert_internal((SubLObject)cb_sentence_browser.$kw24$EDIT_SENTENCE, (SubLObject)cb_sentence_browser.NIL, sentence, (SubLObject)cb_sentence_browser.T);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            }
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 11559L)
    public static SubLObject cb_link_unassert_sentence(final SubLObject sentence, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        if (disabledP == cb_sentence_browser.UNPROVIDED) {
            disabledP = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str62$_Unassert_;
        }
        if (cb_sentence_browser.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str63$cb_unassert_sentence__a, cb_parameters.cb_glob_id(sentence));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            if (cb_sentence_browser.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 11953L)
    public static SubLObject cb_unassert_sentence(final SubLObject args) {
        if (cb_sentence_browser.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_sentence_browser.$str55$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
            id_string = args.first();
            final SubLObject current = args.rest();
            if (cb_sentence_browser.NIL == current) {
                final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
                if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
                    cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str43$_a_does_not_specify_a_CycL_senten, id_string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    return (SubLObject)cb_sentence_browser.NIL;
                }
                if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
                    cb_tools.cb_rem_from_sentence_history(sentence);
                    ke.ke_unassert(cycl_utilities.formula_arg2(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED), cycl_utilities.formula_arg1(sentence, (SubLObject)cb_sentence_browser.UNPROVIDED));
                    cb_assertion_editor.cb_note_edit_change((SubLObject)cb_sentence_browser.$str65$Unassert, (SubLObject)cb_sentence_browser.T, (SubLObject)cb_sentence_browser.TWO_INTEGER, (SubLObject)cb_sentence_browser.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            }
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 12521L)
    public static SubLObject cb_link_sentence_query_similar(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_sentence_browser.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str68$_Query_Similar_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str69$cb_sentence_query_similar__A, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 12919L)
    public static SubLObject cb_sentence_query_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_sentence_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            return (SubLObject)cb_sentence_browser.NIL;
        }
        SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
        if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
            return cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str71$That_sentence_is_not_available_, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        SubLObject mt = (cb_sentence_browser.NIL != cb_parameters.$cb_default_mt$.getDynamicValue(thread)) ? cb_parameters.$cb_default_mt$.getDynamicValue(thread) : mt_vars.$default_ask_mt$.getGlobalValue();
        thread.resetMultipleValues();
        final SubLObject sentence_$5 = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject mt_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$5;
        mt = mt_$6;
        return cb_query.cb_similar_query(sentence, mt, (SubLObject)cb_sentence_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 13360L)
    public static SubLObject cb_link_clone_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_sentence_browser.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str73$_Clone_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str74$cb_clone_sentence__a, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 13717L)
    public static SubLObject cb_clone_sentence(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_sentence_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            return (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
        if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
            return cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str71$That_sentence_is_not_available_, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        return cb_clone_sentence_int(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 14011L)
    public static SubLObject cb_clone_sentence_int(final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_sentence_browser.$str77$Clone_CycL_Sentence;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_sentence_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_sentence_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_sentence_browser.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_sentence_browser.$kw7$UNINITIALIZED) ? ConsesLow.list(cb_sentence_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_sentence_browser.$kw78$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_sentence_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_sentence_browser.$kw79$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_sentence_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_sentence_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_sentence_browser.$str81$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_sentence_browser.$str82$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str83$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str84$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str85$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            if (cb_sentence_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_sentence_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_sentence_browser.$str86$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        if (cb_sentence_browser.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_sentence_browser.$str87$cb_handle_clone_sentence, (SubLObject)cb_sentence_browser.T, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            SubLObject sentence = input_sentence;
                            SubLObject mt = (cb_sentence_browser.NIL != cb_parameters.$cb_default_mt$.getDynamicValue(thread)) ? cb_parameters.$cb_default_mt$.getDynamicValue(thread) : mt_vars.$default_clone_mt$.getGlobalValue();
                            if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(input_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
                                sentence = el_utilities.designated_sentence(input_sentence);
                                mt = el_utilities.designated_mt(input_sentence);
                            }
                            html_utilities.html_target_definition((SubLObject)cb_sentence_browser.$str88$clone_form);
                            html_utilities.html_reset_input((SubLObject)cb_sentence_browser.$str89$Reset_Values);
                            html_utilities.html_indent((SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_sentence_browser.$str90$Clone, (SubLObject)cb_sentence_browser.$str91$clone, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(sentence, (SubLObject)cb_sentence_browser.$list92);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 14937L)
    public static SubLObject cb_handle_clone_sentence(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_sentence_browser.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_sentence_browser.$list93);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_sentence_browser.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        SubLObject errorP = (SubLObject)cb_sentence_browser.NIL;
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)cb_sentence_browser.NIL, thread);
            if (cb_sentence_browser.NIL == cycl_grammar.cycl_sentence_p(sentence)) {
                cb_explain_why_not_syntactically_wff(sentence);
                errorP = (SubLObject)cb_sentence_browser.T;
            }
        }
        finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        if (cb_sentence_browser.NIL != errorP) {
            return (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLObject sentence_to_view = (SubLObject)((cb_sentence_browser.NIL != hlmt.hlmt_p(mt)) ? ConsesLow.list(cb_sentence_browser.$const4$ist, mt, sentence) : sentence);
        return cb_sentence((SubLObject)ConsesLow.list(string_utilities.str(cb_parameters.cb_glob_id(sentence_to_view))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 15742L)
    public static SubLObject cb_extract_cycl_sentence_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_sentence_browser.NIL != Types.stringp(string) : string;
        final SubLObject sentence = reader.read_from_string_ignoring_errors(string, (SubLObject)cb_sentence_browser.NIL, (SubLObject)cb_sentence_browser.NIL, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        SubLObject errorP = (SubLObject)cb_sentence_browser.NIL;
        if (cb_sentence_browser.NIL == sentence) {
            cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str96$Bad_sentence__probably_due_to_a_m, string, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
            return (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLObject _prev_bind_0 = cycl_grammar.$grammar_uses_kbP$.currentBinding(thread);
        try {
            cycl_grammar.$grammar_uses_kbP$.bind((SubLObject)cb_sentence_browser.NIL, thread);
            if (cb_sentence_browser.NIL == cycl_grammar.cycl_sentence_p(sentence)) {
                cb_explain_why_not_syntactically_wff(sentence);
                errorP = (SubLObject)cb_sentence_browser.T;
            }
        }
        finally {
            cycl_grammar.$grammar_uses_kbP$.rebind(_prev_bind_0, thread);
        }
        if (cb_sentence_browser.NIL != errorP) {
            return (SubLObject)cb_sentence_browser.NIL;
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 16459L)
    public static SubLObject cb_explain_why_not_syntactically_wff(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_sentence_browser.$str97$CycL_Sentence_not_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_sentence_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str5$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_sentence_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_sentence_browser.$str6$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_sentence_browser.$kw7$UNINITIALIZED) ? ConsesLow.list(cb_sentence_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_sentence_browser.$kw78$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_sentence_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_sentence_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_sentence_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_sentence_browser.$str81$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_sentence_browser.$str82$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str83$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.$str84$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str85$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            if (cb_sentence_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_sentence_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_sentence_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_sentence_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)cb_sentence_browser.$kw52$SELF, (SubLObject)cb_sentence_browser.$str98$Back);
                            html_utilities.html_newline((SubLObject)cb_sentence_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_sentence_browser.$str99$Sentence___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                            cb_utilities.cb_form(sentence, (SubLObject)cb_sentence_browser.ZERO_INTEGER, (SubLObject)cb_sentence_browser.T);
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$17 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)cb_sentence_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str100$Diagnosis___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str101$This_is_not_a_syntactically_well_);
                                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_sentence_browser.$str102$_________cycdoc_ref_cycl_syntax_h);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_sentence_browser.$str103$Syntax_of_CycL);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_sentence_browser.$str104$_document_);
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 17101L)
    public static SubLObject cb_link_justify_sentence(final SubLObject sentence, SubLObject linktext) {
        if (linktext == cb_sentence_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_sentence_browser.NIL != el_utilities.possibly_sentence_p(sentence) : sentence;
        if (cb_sentence_browser.NIL == linktext) {
            linktext = (SubLObject)cb_sentence_browser.$str105$_Justify_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_sentence_browser.$kw52$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.$str106$cb_justify_sentence__a, cb_parameters.cb_glob_id(sentence));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        if (cb_sentence_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_sentence_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_sentence_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 17436L)
    public static SubLObject cb_justify_sentence(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_sentence_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_sentence_browser.$list42);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_sentence_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_sentence_browser.$list42);
            return (SubLObject)cb_sentence_browser.NIL;
        }
        final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id_string);
        if (cb_sentence_browser.NIL == el_utilities.possibly_sentence_p(sentence)) {
            return cb_utilities.cb_error((SubLObject)cb_sentence_browser.$str71$That_sentence_is_not_available_, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED, (SubLObject)cb_sentence_browser.UNPROVIDED);
        }
        return cb_justify_sentence_int(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-sentence-browser.lisp", position = 17734L)
    public static SubLObject cb_justify_sentence_int(final SubLObject input_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_sentence_browser.NIL != el_utilities.ist_sentence_p(input_sentence, (SubLObject)cb_sentence_browser.UNPROVIDED)) {
            final SubLObject sentence = el_utilities.designated_sentence(input_sentence);
            final SubLObject mt = el_utilities.designated_mt(input_sentence);
            SubLObject justification = (SubLObject)cb_sentence_browser.NIL;
            cb_show_sentence_readably(sentence, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_sentence_browser.T, (SubLObject)cb_sentence_browser.T);
            html_utilities.html_newline((SubLObject)cb_sentence_browser.UNPROVIDED);
            justification = sksi_hl_support_utilities.sksi_justify_int(sentence, mt);
            return cb_assertion_browser.cb_hl_support_justify_int((SubLObject)cb_sentence_browser.$kw109$SKSI, justification);
        }
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    public static SubLObject declare_cb_sentence_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence", "CB-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_internal", "CB-SENTENCE-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_internal_guts", "CB-SENTENCE-INTERNAL-GUTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_info", "CB-SENTENCE-INFO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_diagnostics", "CB-SENTENCE-DIAGNOSTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_access_diagnostics", "CB-SENTENCE-ACCESS-DIAGNOSTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_show_variants", "CB-SENTENCE-SHOW-VARIANTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_show_sentence", "CB-SHOW-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_show_sentence_readably", "CB-SHOW-SENTENCE-READABLY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "sentence_modification_permittedP", "SENTENCE-MODIFICATION-PERMITTED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_toolbar", "CB-SENTENCE-TOOLBAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_show_english_for_cycl_sentence", "CB-LINK-SHOW-ENGLISH-FOR-CYCL-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_with_show_english", "CB-SENTENCE-WITH-SHOW-ENGLISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_show_el_version_of_sentence", "CB-LINK-SHOW-EL-VERSION-OF-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_with_show_el_formula", "CB-SENTENCE-WITH-SHOW-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_wff_check_sentence", "CB-LINK-WFF-CHECK-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_wff_check_sentence", "CB-WFF-CHECK-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_wff_check_forward_placement_sentence", "CB-LINK-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_wff_check_forward_placement_sentence", "CB-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_assert_similar_sentence", "CB-LINK-ASSERT-SIMILAR-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_assert_similar_sentence", "CB-ASSERT-SIMILAR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_edit_sentence", "CB-LINK-EDIT-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_edit_sentence", "CB-EDIT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_unassert_sentence", "CB-LINK-UNASSERT-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_unassert_sentence", "CB-UNASSERT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_sentence_query_similar", "CB-LINK-SENTENCE-QUERY-SIMILAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_sentence_query_similar", "CB-SENTENCE-QUERY-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_clone_sentence", "CB-LINK-CLONE-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_clone_sentence", "CB-CLONE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_clone_sentence_int", "CB-CLONE-SENTENCE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_handle_clone_sentence", "CB-HANDLE-CLONE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_extract_cycl_sentence_from_string", "CB-EXTRACT-CYCL-SENTENCE-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_explain_why_not_syntactically_wff", "CB-EXPLAIN-WHY-NOT-SYNTACTICALLY-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_link_justify_sentence", "CB-LINK-JUSTIFY-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_justify_sentence", "CB-JUSTIFY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_sentence_browser", "cb_justify_sentence_int", "CB-JUSTIFY-SENTENCE-INT", 1, 0, false);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    public static SubLObject init_cb_sentence_browser_file() {
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    public static SubLObject setup_cb_sentence_browser_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym2$CB_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_sentence_browser.$kw19$CB_SENTENCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_sentence_browser.$str20$cb_sentence_html, (SubLObject)cb_sentence_browser.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw21$SHOW_ENGLISH_FOR_CYCL_SENTENCE, (SubLObject)cb_sentence_browser.$sym32$CB_LINK_SHOW_ENGLISH_FOR_CYCL_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym33$CB_SENTENCE_WITH_SHOW_ENGLISH, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw22$SHOW_EL_VERSION_OF_SENTENCE, (SubLObject)cb_sentence_browser.$sym36$CB_LINK_SHOW_EL_VERSION_OF_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym37$CB_SENTENCE_WITH_SHOW_EL_FORMULA, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw40$WFF_CHECK_SENTENCE, (SubLObject)cb_sentence_browser.$sym41$CB_LINK_WFF_CHECK_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym44$CB_WFF_CHECK_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw46$WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, (SubLObject)cb_sentence_browser.$sym47$CB_LINK_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, (SubLObject)cb_sentence_browser.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym50$CB_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw23$ASSERT_SIMILAR_SENTENCE, (SubLObject)cb_sentence_browser.$sym54$CB_LINK_ASSERT_SIMILAR_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym57$CB_ASSERT_SIMILAR_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw24$EDIT_SENTENCE, (SubLObject)cb_sentence_browser.$sym60$CB_LINK_EDIT_SENTENCE, (SubLObject)cb_sentence_browser.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym61$CB_EDIT_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw25$UNASSERT_SENTENCE, (SubLObject)cb_sentence_browser.$sym64$CB_LINK_UNASSERT_SENTENCE, (SubLObject)cb_sentence_browser.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym66$CB_UNASSERT_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw26$SENTENCE_QUERY_SIMILAR, (SubLObject)cb_sentence_browser.$sym70$CB_LINK_SENTENCE_QUERY_SIMILAR, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym72$CB_SENTENCE_QUERY_SIMILAR, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw27$CLONE_SENTENCE, (SubLObject)cb_sentence_browser.$sym75$CB_LINK_CLONE_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym76$CB_CLONE_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym94$CB_HANDLE_CLONE_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_sentence_browser.$kw28$JUSTIFY_SENTENCE, (SubLObject)cb_sentence_browser.$sym107$CB_LINK_JUSTIFY_SENTENCE, (SubLObject)cb_sentence_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_sentence_browser.$sym108$CB_JUSTIFY_SENTENCE, (SubLObject)cb_sentence_browser.$kw3$HTML_HANDLER);
        return (SubLObject)cb_sentence_browser.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_sentence_browser_file();
    }
    
    public void initializeVariables() {
        init_cb_sentence_browser_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_sentence_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_sentence_browser();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFY?"));
        $str1$Could_not_determine_a_sentence_fr = SubLObjectFactory.makeString("Could not determine a sentence from ~a");
        $sym2$CB_SENTENCE = SubLObjectFactory.makeSymbol("CB-SENTENCE");
        $kw3$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $const4$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str5$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str6$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw7$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str8$CycL_Sentence = SubLObjectFactory.makeString("CycL Sentence");
        $str9$Mt___ = SubLObjectFactory.makeString("Mt : ");
        $kw10$RED = SubLObjectFactory.makeKeyword("RED");
        $str11$Sentence_Not_Well_formed__ = SubLObjectFactory.makeString("Sentence Not Well-formed :");
        $str12$EL_Sentence___ = SubLObjectFactory.makeString("EL Sentence : ");
        $str13$HL_Sentence___ = SubLObjectFactory.makeString("HL Sentence : ");
        $str14$English_Translation___ = SubLObjectFactory.makeString("English Translation : ");
        $kw15$NL = SubLObjectFactory.makeKeyword("NL");
        $kw16$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw17$SILK = SubLObjectFactory.makeKeyword("SILK");
        $str18$_in_ = SubLObjectFactory.makeString(" in ");
        $kw19$CB_SENTENCE = SubLObjectFactory.makeKeyword("CB-SENTENCE");
        $str20$cb_sentence_html = SubLObjectFactory.makeString("cb-sentence.html");
        $kw21$SHOW_ENGLISH_FOR_CYCL_SENTENCE = SubLObjectFactory.makeKeyword("SHOW-ENGLISH-FOR-CYCL-SENTENCE");
        $kw22$SHOW_EL_VERSION_OF_SENTENCE = SubLObjectFactory.makeKeyword("SHOW-EL-VERSION-OF-SENTENCE");
        $kw23$ASSERT_SIMILAR_SENTENCE = SubLObjectFactory.makeKeyword("ASSERT-SIMILAR-SENTENCE");
        $kw24$EDIT_SENTENCE = SubLObjectFactory.makeKeyword("EDIT-SENTENCE");
        $kw25$UNASSERT_SENTENCE = SubLObjectFactory.makeKeyword("UNASSERT-SENTENCE");
        $kw26$SENTENCE_QUERY_SIMILAR = SubLObjectFactory.makeKeyword("SENTENCE-QUERY-SIMILAR");
        $kw27$CLONE_SENTENCE = SubLObjectFactory.makeKeyword("CLONE-SENTENCE");
        $kw28$JUSTIFY_SENTENCE = SubLObjectFactory.makeKeyword("JUSTIFY-SENTENCE");
        $str29$_Show_English_ = SubLObjectFactory.makeString("[Show English]");
        $kw30$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str31$cb_sentence_with_show_english__a = SubLObjectFactory.makeString("cb-sentence-with-show-english&~a");
        $sym32$CB_LINK_SHOW_ENGLISH_FOR_CYCL_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-ENGLISH-FOR-CYCL-SENTENCE");
        $sym33$CB_SENTENCE_WITH_SHOW_ENGLISH = SubLObjectFactory.makeSymbol("CB-SENTENCE-WITH-SHOW-ENGLISH");
        $str34$_EL_Formula_ = SubLObjectFactory.makeString("[EL Formula]");
        $str35$cb_sentence_with_show_el_formula_ = SubLObjectFactory.makeString("cb-sentence-with-show-el-formula&~a");
        $sym36$CB_LINK_SHOW_EL_VERSION_OF_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-EL-VERSION-OF-SENTENCE");
        $sym37$CB_SENTENCE_WITH_SHOW_EL_FORMULA = SubLObjectFactory.makeSymbol("CB-SENTENCE-WITH-SHOW-EL-FORMULA");
        $str38$_WFF_Check_ = SubLObjectFactory.makeString("[WFF-Check]");
        $str39$cb_wff_check_sentence__A = SubLObjectFactory.makeString("cb-wff-check-sentence&~A");
        $kw40$WFF_CHECK_SENTENCE = SubLObjectFactory.makeKeyword("WFF-CHECK-SENTENCE");
        $sym41$CB_LINK_WFF_CHECK_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-WFF-CHECK-SENTENCE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"));
        $str43$_a_does_not_specify_a_CycL_senten = SubLObjectFactory.makeString("~a does not specify a CycL sentence");
        $sym44$CB_WFF_CHECK_SENTENCE = SubLObjectFactory.makeSymbol("CB-WFF-CHECK-SENTENCE");
        $str45$cb_wff_check_forward_placement_se = SubLObjectFactory.makeString("cb-wff-check-forward-placement-sentence&~A&~A");
        $kw46$WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = SubLObjectFactory.makeKeyword("WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");
        $sym47$CB_LINK_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ID-STRING"));
        $sym49$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym50$CB_WFF_CHECK_FORWARD_PLACEMENT_SENTENCE = SubLObjectFactory.makeSymbol("CB-WFF-CHECK-FORWARD-PLACEMENT-SENTENCE");
        $str51$_Assert_Similar_ = SubLObjectFactory.makeString("[Assert Similar]");
        $kw52$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str53$cb_assert_similar_sentence__a = SubLObjectFactory.makeString("cb-assert-similar-sentence&~a");
        $sym54$CB_LINK_ASSERT_SIMILAR_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-SIMILAR-SENTENCE");
        $str55$the_Cyc_KB_editing_facilities = SubLObjectFactory.makeString("the Cyc KB editing facilities");
        $kw56$SIMILAR = SubLObjectFactory.makeKeyword("SIMILAR");
        $sym57$CB_ASSERT_SIMILAR_SENTENCE = SubLObjectFactory.makeSymbol("CB-ASSERT-SIMILAR-SENTENCE");
        $str58$_Edit_ = SubLObjectFactory.makeString("[Edit]");
        $str59$cb_edit_sentence__a = SubLObjectFactory.makeString("cb-edit-sentence&~a");
        $sym60$CB_LINK_EDIT_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-EDIT-SENTENCE");
        $sym61$CB_EDIT_SENTENCE = SubLObjectFactory.makeSymbol("CB-EDIT-SENTENCE");
        $str62$_Unassert_ = SubLObjectFactory.makeString("[Unassert]");
        $str63$cb_unassert_sentence__a = SubLObjectFactory.makeString("cb-unassert-sentence&~a");
        $sym64$CB_LINK_UNASSERT_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-UNASSERT-SENTENCE");
        $str65$Unassert = SubLObjectFactory.makeString("Unassert");
        $sym66$CB_UNASSERT_SENTENCE = SubLObjectFactory.makeSymbol("CB-UNASSERT-SENTENCE");
        $sym67$POSSIBLY_SENTENCE_P = SubLObjectFactory.makeSymbol("POSSIBLY-SENTENCE-P");
        $str68$_Query_Similar_ = SubLObjectFactory.makeString("[Query Similar]");
        $str69$cb_sentence_query_similar__A = SubLObjectFactory.makeString("cb-sentence-query-similar&~A");
        $sym70$CB_LINK_SENTENCE_QUERY_SIMILAR = SubLObjectFactory.makeSymbol("CB-LINK-SENTENCE-QUERY-SIMILAR");
        $str71$That_sentence_is_not_available_ = SubLObjectFactory.makeString("That sentence is not available.");
        $sym72$CB_SENTENCE_QUERY_SIMILAR = SubLObjectFactory.makeSymbol("CB-SENTENCE-QUERY-SIMILAR");
        $str73$_Clone_ = SubLObjectFactory.makeString("[Clone]");
        $str74$cb_clone_sentence__a = SubLObjectFactory.makeString("cb-clone-sentence&~a");
        $sym75$CB_LINK_CLONE_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-CLONE-SENTENCE");
        $sym76$CB_CLONE_SENTENCE = SubLObjectFactory.makeSymbol("CB-CLONE-SENTENCE");
        $str77$Clone_CycL_Sentence = SubLObjectFactory.makeString("Clone CycL Sentence");
        $kw78$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw79$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw80$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str81$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str82$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str83$button = SubLObjectFactory.makeString("button");
        $str84$reload = SubLObjectFactory.makeString("reload");
        $str85$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str86$post = SubLObjectFactory.makeString("post");
        $str87$cb_handle_clone_sentence = SubLObjectFactory.makeString("cb-handle-clone-sentence");
        $str88$clone_form = SubLObjectFactory.makeString("clone-form");
        $str89$Reset_Values = SubLObjectFactory.makeString("Reset Values");
        $str90$Clone = SubLObjectFactory.makeString("Clone");
        $str91$clone = SubLObjectFactory.makeString("clone");
        $list92 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_sentence_browser.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $sym94$CB_HANDLE_CLONE_SENTENCE = SubLObjectFactory.makeSymbol("CB-HANDLE-CLONE-SENTENCE");
        $sym95$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str96$Bad_sentence__probably_due_to_a_m = SubLObjectFactory.makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $str97$CycL_Sentence_not_Well_Formed = SubLObjectFactory.makeString("CycL Sentence not Well-Formed");
        $str98$Back = SubLObjectFactory.makeString("Back");
        $str99$Sentence___ = SubLObjectFactory.makeString("Sentence : ");
        $str100$Diagnosis___ = SubLObjectFactory.makeString("Diagnosis : ");
        $str101$This_is_not_a_syntactically_well_ = SubLObjectFactory.makeString("This is not a syntactically well-formed CycL sentence.  Please refer to the ");
        $str102$_________cycdoc_ref_cycl_syntax_h = SubLObjectFactory.makeString("../../../cycdoc/ref/cycl-syntax.html#sentences");
        $str103$Syntax_of_CycL = SubLObjectFactory.makeString("Syntax of CycL");
        $str104$_document_ = SubLObjectFactory.makeString(" document.");
        $str105$_Justify_ = SubLObjectFactory.makeString("[Justify]");
        $str106$cb_justify_sentence__a = SubLObjectFactory.makeString("cb-justify-sentence&~a");
        $sym107$CB_LINK_JUSTIFY_SENTENCE = SubLObjectFactory.makeSymbol("CB-LINK-JUSTIFY-SENTENCE");
        $sym108$CB_JUSTIFY_SENTENCE = SubLObjectFactory.makeSymbol("CB-JUSTIFY-SENTENCE");
        $kw109$SKSI = SubLObjectFactory.makeKeyword("SKSI");
    }
}

/*

	Total time: 408 ms
	
*/