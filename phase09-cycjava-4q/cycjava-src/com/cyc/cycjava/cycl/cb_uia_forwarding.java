package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_uia_forwarding extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_uia_forwarding";
    public static final String myFingerPrint = "8b9d81308d84621cc60b22e15899ce1a37a3b5ddea59b2e84c0b53776718691b";
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1259L)
    public static SubLSymbol $forwarding_machine_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1624L)
    public static SubLSymbol $forwarding_base_port$;
    private static final SubLString $str0$_Forwarding_;
    private static final SubLString $str1$cb_uia_forwarding_handler;
    private static final SubLSymbol $kw2$CB_UIA_FORWARDING;
    private static final SubLSymbol $sym3$CB_LINK_CB_UIA_FORWARDING;
    private static final SubLSymbol $kw4$UIA_FORWARDING;
    private static final SubLString $str5$Forwarding;
    private static final SubLString $str6$Specify_forwarding_port_that_conn;
    private static final SubLSymbol $kw7$MAIN;
    private static final SubLSymbol $sym8$CB_LINK_UIA_FORWARDING;
    private static final SubLSymbol $sym9$_FORWARDING_MACHINE_NAME_;
    private static final SubLString $str10$unknown;
    private static final SubLSymbol $sym11$_FORWARDING_BASE_PORT_;
    private static final SubLString $str12$Set_forwarding_descriptor;
    private static final SubLSymbol $sym13$SET_FORWARDING_MACHINE_NAME_AND_BASE_PORT_INTERNAL;
    private static final SubLString $str14$_;
    private static final SubLString $str15$forwarding_machine;
    private static final SubLString $str16$forwarding_port;
    private static final SubLString $str17$global;
    private static final SubLString $str18$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str19$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw20$UNINITIALIZED;
    private static final SubLString $str21$Set_Forwarding_Parameters;
    private static final SubLString $str22$Machine__;
    private static final SubLString $str23$Port__;
    private static final SubLSymbol $sym24$CB_UIA_HANDLE_FORWARDING_INFO;
    private static final SubLSymbol $kw25$HTML_HANDLER;
    private static final SubLSymbol $sym26$CB_UIA_HANDLE_FORWARDING_DEFAULT_INFO;
    private static final SubLString $str27$Forwarding_Parameters;
    private static final SubLString $str28$cb_uia_handle_forwarding_info;
    private static final SubLString $str29$_Specify_the_machine_name_and_bas;
    private static final SubLInteger $int30$40;
    private static final SubLString $str31$Base_Port__;
    private static final SubLString $str32$Set_for_all_users__including_Java;
    private static final SubLString $str33$Beware_of_using_this_option_on_sh;
    private static final SubLString $str34$Submit;
    private static final SubLString $str35$cb_uia_handle_forwarding_default_;
    private static final SubLString $str36$Default;
    private static final SubLSymbol $sym37$CB_UIA_FORWARDING_HANDLER;
    private static final SubLSymbol $sym38$WITH_MACHINE_AND_BASE_PORT_FORWARDING;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw42$MACHINE;
    private static final SubLString $str43$localhost;
    private static final SubLSymbol $kw44$BASE_PORT;
    private static final SubLInteger $int45$3600;
    private static final SubLSymbol $sym46$CLET;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 788L)
    public static SubLObject cb_link_cb_uia_forwarding(SubLObject target, SubLObject linktext) {
        if (target == cb_uia_forwarding.UNPROVIDED) {
            target = (SubLObject)cb_uia_forwarding.NIL;
        }
        if (linktext == cb_uia_forwarding.UNPROVIDED) {
            linktext = (SubLObject)cb_uia_forwarding.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_uia_forwarding.NIL == linktext) {
            linktext = (SubLObject)cb_uia_forwarding.$str0$_Forwarding_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str1$cb_uia_forwarding_handler);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
        if (cb_uia_forwarding.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_uia_forwarding.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1145L)
    public static SubLObject cb_link_uia_forwarding(SubLObject linktext) {
        if (linktext == cb_uia_forwarding.UNPROVIDED) {
            linktext = (SubLObject)cb_uia_forwarding.NIL;
        }
        return cb_utilities.cb_link((SubLObject)cb_uia_forwarding.$kw2$CB_UIA_FORWARDING, (SubLObject)cb_uia_forwarding.$kw7$MAIN, linktext, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1406L)
    public static SubLObject get_forwarding_machine_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_uia_forwarding.NIL == cb_uia_forwarding.$forwarding_machine_name$.getDynamicValue(thread)) {
            cb_uia_forwarding.$forwarding_machine_name$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name((SubLObject)cb_uia_forwarding.$str10$unknown)), thread);
        }
        return cb_uia_forwarding.$forwarding_machine_name$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1739L)
    public static SubLObject get_forwarding_base_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_uia_forwarding.NIL == cb_uia_forwarding.$forwarding_base_port$.getDynamicValue(thread)) {
            cb_uia_forwarding.$forwarding_base_port$.setDynamicValue(system_parameters.$base_tcp_port$.getDynamicValue(thread), thread);
        }
        return cb_uia_forwarding.$forwarding_base_port$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 1901L)
    public static SubLObject set_forwarding_machine_name_and_base_port(final SubLObject machine, final SubLObject port, final SubLObject globalP) {
        if (cb_uia_forwarding.NIL != globalP) {
            subl_promotions.make_process_with_args((SubLObject)cb_uia_forwarding.$str12$Set_forwarding_descriptor, (SubLObject)cb_uia_forwarding.$sym13$SET_FORWARDING_MACHINE_NAME_AND_BASE_PORT_INTERNAL, (SubLObject)ConsesLow.list(machine, port));
        }
        set_forwarding_machine_name_and_base_port_internal(machine, port);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 3122L)
    public static SubLObject set_forwarding_machine_name_and_base_port_internal(final SubLObject machine, final SubLObject port) {
        cb_uia_forwarding.$forwarding_machine_name$.setDynamicValue(machine);
        cb_uia_forwarding.$forwarding_base_port$.setDynamicValue(port);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 3290L)
    public static SubLObject cb_uia_handle_forwarding_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject machine = Strings.string_trim((SubLObject)cb_uia_forwarding.$str14$_, html_utilities.html_extract_input((SubLObject)cb_uia_forwarding.$str15$forwarding_machine, args));
        final SubLObject port = string_utilities.string_to_integer(html_utilities.html_extract_input((SubLObject)cb_uia_forwarding.$str16$forwarding_port, args));
        final SubLObject global = list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_uia_forwarding.$str17$global, args));
        set_forwarding_machine_name_and_base_port(machine, port, global);
        html_utilities.html_markup((SubLObject)cb_uia_forwarding.$str18$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_uia_forwarding.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.$str19$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_uia_forwarding.$kw20$UNINITIALIZED) ? ConsesLow.list(cb_uia_forwarding.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str21$Set_Forwarding_Parameters);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str22$Machine__);
            html_utilities.html_princ(string_utilities.to_string(machine));
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str23$Port__);
            html_utilities.html_princ(string_utilities.to_string(port));
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 4034L)
    public static SubLObject cb_uia_handle_forwarding_default_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_uia_forwarding.$forwarding_machine_name$.setDynamicValue(Environment.get_network_name(Environment.get_machine_name((SubLObject)cb_uia_forwarding.$str10$unknown)), thread);
        cb_uia_forwarding.$forwarding_base_port$.setDynamicValue(system_parameters.$base_tcp_port$.getDynamicValue(thread), thread);
        return cb_uia_forwarding_handler(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 4296L)
    public static SubLObject cb_uia_forwarding_handler(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_uia_forwarding.$str18$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_uia_forwarding.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.$str19$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_uia_forwarding.$kw20$UNINITIALIZED) ? ConsesLow.list(cb_uia_forwarding.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str27$Forwarding_Parameters);
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            if (cb_uia_forwarding.NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_uia_forwarding.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)cb_uia_forwarding.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_hidden_input((SubLObject)cb_uia_forwarding.$str28$cb_uia_handle_forwarding_info, (SubLObject)cb_uia_forwarding.T, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str29$_Specify_the_machine_name_and_bas);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_uia_forwarding.FOUR_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_uia_forwarding.FIVE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str22$Machine__);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_text_input((SubLObject)cb_uia_forwarding.$str15$forwarding_machine, get_forwarding_machine_name(), (SubLObject)cb_uia_forwarding.$int30$40);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str31$Base_Port__);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_text_input((SubLObject)cb_uia_forwarding.$str16$forwarding_port, get_forwarding_base_port(), (SubLObject)cb_uia_forwarding.$int30$40);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str32$Set_for_all_users__including_Java);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_checkbox_input((SubLObject)cb_uia_forwarding.$str17$global, (SubLObject)cb_uia_forwarding.NIL, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_uia_forwarding.$str33$Beware_of_using_this_option_on_sh);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_submit_input((SubLObject)cb_uia_forwarding.$str34$Submit, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                html_utilities.html_markup((SubLObject)cb_uia_forwarding.FIVE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            if (cb_uia_forwarding.NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
            _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_uia_forwarding.T, thread);
                html_macros.$within_html_form$.bind((SubLObject)cb_uia_forwarding.T, thread);
                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                html_utilities.html_hidden_input((SubLObject)cb_uia_forwarding.$str35$cb_uia_handle_forwarding_default_, (SubLObject)cb_uia_forwarding.T, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_utilities.html_submit_input((SubLObject)cb_uia_forwarding.$str36$Default, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED);
                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
            }
            finally {
                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_uia_forwarding.ONE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_uia_forwarding.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_uia_forwarding.UNPROVIDED);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-uia-forwarding.lisp", position = 5710L)
    public static SubLObject with_machine_and_base_port_forwarding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_uia_forwarding.$list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)cb_uia_forwarding.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_uia_forwarding.NIL;
        SubLObject current_$3 = (SubLObject)cb_uia_forwarding.NIL;
        while (cb_uia_forwarding.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_uia_forwarding.$list39);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_uia_forwarding.$list39);
            if (cb_uia_forwarding.NIL == conses_high.member(current_$3, (SubLObject)cb_uia_forwarding.$list40, (SubLObject)cb_uia_forwarding.UNPROVIDED, (SubLObject)cb_uia_forwarding.UNPROVIDED)) {
                bad = (SubLObject)cb_uia_forwarding.T;
            }
            if (current_$3 == cb_uia_forwarding.$kw41$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_uia_forwarding.NIL != bad && cb_uia_forwarding.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_uia_forwarding.$list39);
        }
        final SubLObject machine_tail = cdestructuring_bind.property_list_member((SubLObject)cb_uia_forwarding.$kw42$MACHINE, current);
        final SubLObject machine = (SubLObject)((cb_uia_forwarding.NIL != machine_tail) ? conses_high.cadr(machine_tail) : cb_uia_forwarding.$str43$localhost);
        final SubLObject base_port_tail = cdestructuring_bind.property_list_member((SubLObject)cb_uia_forwarding.$kw44$BASE_PORT, current);
        final SubLObject base_port = (SubLObject)((cb_uia_forwarding.NIL != base_port_tail) ? conses_high.cadr(base_port_tail) : cb_uia_forwarding.$int45$3600);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)cb_uia_forwarding.$sym46$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_uia_forwarding.$sym9$_FORWARDING_MACHINE_NAME_, machine), (SubLObject)ConsesLow.list((SubLObject)cb_uia_forwarding.$sym11$_FORWARDING_BASE_PORT_, base_port)), ConsesLow.append(body, (SubLObject)cb_uia_forwarding.NIL));
    }
    
    public static SubLObject declare_cb_uia_forwarding_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "cb_link_cb_uia_forwarding", "CB-LINK-CB-UIA-FORWARDING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "cb_link_uia_forwarding", "CB-LINK-UIA-FORWARDING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "get_forwarding_machine_name", "GET-FORWARDING-MACHINE-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "get_forwarding_base_port", "GET-FORWARDING-BASE-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "set_forwarding_machine_name_and_base_port", "SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "set_forwarding_machine_name_and_base_port_internal", "SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "cb_uia_handle_forwarding_info", "CB-UIA-HANDLE-FORWARDING-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "cb_uia_handle_forwarding_default_info", "CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_uia_forwarding", "cb_uia_forwarding_handler", "CB-UIA-FORWARDING-HANDLER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_uia_forwarding", "with_machine_and_base_port_forwarding", "WITH-MACHINE-AND-BASE-PORT-FORWARDING");
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    public static SubLObject init_cb_uia_forwarding_file() {
        cb_uia_forwarding.$forwarding_machine_name$ = SubLFiles.defparameter("*FORWARDING-MACHINE-NAME*", (SubLObject)cb_uia_forwarding.NIL);
        cb_uia_forwarding.$forwarding_base_port$ = SubLFiles.defparameter("*FORWARDING-BASE-PORT*", (SubLObject)cb_uia_forwarding.NIL);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    public static SubLObject setup_cb_uia_forwarding_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_uia_forwarding.$kw2$CB_UIA_FORWARDING, (SubLObject)cb_uia_forwarding.$sym3$CB_LINK_CB_UIA_FORWARDING, (SubLObject)cb_uia_forwarding.TWO_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_uia_forwarding.$kw4$UIA_FORWARDING, (SubLObject)cb_uia_forwarding.$str5$Forwarding, (SubLObject)cb_uia_forwarding.$str5$Forwarding, (SubLObject)cb_uia_forwarding.$str6$Specify_forwarding_port_that_conn);
        cb_utilities.setup_cb_link_method((SubLObject)cb_uia_forwarding.$kw4$UIA_FORWARDING, (SubLObject)cb_uia_forwarding.$sym8$CB_LINK_UIA_FORWARDING, (SubLObject)cb_uia_forwarding.ONE_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_uia_forwarding.$sym9$_FORWARDING_MACHINE_NAME_);
        utilities_macros.register_html_state_variable((SubLObject)cb_uia_forwarding.$sym11$_FORWARDING_BASE_PORT_);
        html_macros.note_cgi_handler_function((SubLObject)cb_uia_forwarding.$sym24$CB_UIA_HANDLE_FORWARDING_INFO, (SubLObject)cb_uia_forwarding.$kw25$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_uia_forwarding.$sym26$CB_UIA_HANDLE_FORWARDING_DEFAULT_INFO, (SubLObject)cb_uia_forwarding.$kw25$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_uia_forwarding.$sym37$CB_UIA_FORWARDING_HANDLER, (SubLObject)cb_uia_forwarding.$kw25$HTML_HANDLER);
        access_macros.register_external_symbol((SubLObject)cb_uia_forwarding.$sym38$WITH_MACHINE_AND_BASE_PORT_FORWARDING);
        return (SubLObject)cb_uia_forwarding.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_uia_forwarding_file();
    }
    
    public void initializeVariables() {
        init_cb_uia_forwarding_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_uia_forwarding_file();
    }
    
    static {
        me = (SubLFile)new cb_uia_forwarding();
        cb_uia_forwarding.$forwarding_machine_name$ = null;
        cb_uia_forwarding.$forwarding_base_port$ = null;
        $str0$_Forwarding_ = SubLObjectFactory.makeString("[Forwarding]");
        $str1$cb_uia_forwarding_handler = SubLObjectFactory.makeString("cb-uia-forwarding-handler");
        $kw2$CB_UIA_FORWARDING = SubLObjectFactory.makeKeyword("CB-UIA-FORWARDING");
        $sym3$CB_LINK_CB_UIA_FORWARDING = SubLObjectFactory.makeSymbol("CB-LINK-CB-UIA-FORWARDING");
        $kw4$UIA_FORWARDING = SubLObjectFactory.makeKeyword("UIA-FORWARDING");
        $str5$Forwarding = SubLObjectFactory.makeString("Forwarding");
        $str6$Specify_forwarding_port_that_conn = SubLObjectFactory.makeString("Specify forwarding port that connnects to Cyc server.");
        $kw7$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $sym8$CB_LINK_UIA_FORWARDING = SubLObjectFactory.makeSymbol("CB-LINK-UIA-FORWARDING");
        $sym9$_FORWARDING_MACHINE_NAME_ = SubLObjectFactory.makeSymbol("*FORWARDING-MACHINE-NAME*");
        $str10$unknown = SubLObjectFactory.makeString("unknown");
        $sym11$_FORWARDING_BASE_PORT_ = SubLObjectFactory.makeSymbol("*FORWARDING-BASE-PORT*");
        $str12$Set_forwarding_descriptor = SubLObjectFactory.makeString("Set forwarding descriptor");
        $sym13$SET_FORWARDING_MACHINE_NAME_AND_BASE_PORT_INTERNAL = SubLObjectFactory.makeSymbol("SET-FORWARDING-MACHINE-NAME-AND-BASE-PORT-INTERNAL");
        $str14$_ = SubLObjectFactory.makeString(" ");
        $str15$forwarding_machine = SubLObjectFactory.makeString("forwarding-machine");
        $str16$forwarding_port = SubLObjectFactory.makeString("forwarding-port");
        $str17$global = SubLObjectFactory.makeString("global");
        $str18$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str19$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw20$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str21$Set_Forwarding_Parameters = SubLObjectFactory.makeString("Set Forwarding Parameters");
        $str22$Machine__ = SubLObjectFactory.makeString("Machine: ");
        $str23$Port__ = SubLObjectFactory.makeString("Port: ");
        $sym24$CB_UIA_HANDLE_FORWARDING_INFO = SubLObjectFactory.makeSymbol("CB-UIA-HANDLE-FORWARDING-INFO");
        $kw25$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym26$CB_UIA_HANDLE_FORWARDING_DEFAULT_INFO = SubLObjectFactory.makeSymbol("CB-UIA-HANDLE-FORWARDING-DEFAULT-INFO");
        $str27$Forwarding_Parameters = SubLObjectFactory.makeString("Forwarding Parameters");
        $str28$cb_uia_handle_forwarding_info = SubLObjectFactory.makeString("cb-uia-handle-forwarding-info");
        $str29$_Specify_the_machine_name_and_bas = SubLObjectFactory.makeString(" Specify the machine name and base port number that will be doing the forwarding to the Cyc server (or the Cyc server machine itself and the server's base port number if not port forwarding).");
        $int30$40 = SubLObjectFactory.makeInteger(40);
        $str31$Base_Port__ = SubLObjectFactory.makeString("Base Port: ");
        $str32$Set_for_all_users__including_Java = SubLObjectFactory.makeString("Set for all users, including Java applications?  ");
        $str33$Beware_of_using_this_option_on_sh = SubLObjectFactory.makeString("Beware of using this option on shared images.");
        $str34$Submit = SubLObjectFactory.makeString("Submit");
        $str35$cb_uia_handle_forwarding_default_ = SubLObjectFactory.makeString("cb-uia-handle-forwarding-default-info");
        $str36$Default = SubLObjectFactory.makeString("Default");
        $sym37$CB_UIA_FORWARDING_HANDLER = SubLObjectFactory.makeSymbol("CB-UIA-FORWARDING-HANDLER");
        $sym38$WITH_MACHINE_AND_BASE_PORT_FORWARDING = SubLObjectFactory.makeSymbol("WITH-MACHINE-AND-BASE-PORT-FORWARDING");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeString("localhost")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-PORT"), (SubLObject)SubLObjectFactory.makeInteger(3600))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("BASE-PORT"));
        $kw41$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw42$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $str43$localhost = SubLObjectFactory.makeString("localhost");
        $kw44$BASE_PORT = SubLObjectFactory.makeKeyword("BASE-PORT");
        $int45$3600 = SubLObjectFactory.makeInteger(3600);
        $sym46$CLET = SubLObjectFactory.makeSymbol("CLET");
    }
}

/*

	Total time: 127 ms
	
*/