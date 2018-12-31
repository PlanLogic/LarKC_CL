package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_uri extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_uri";
    public static final String myFingerPrint = "e5cb04645e2689d3aa7447d823ce935aa3b9c6f9f8ba0baafc30e5708ce47298";
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 859L)
    private static SubLSymbol $rdf_uri_standard_connectors$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 922L)
    private static SubLSymbol $rdf_uri_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1737L)
    private static SubLSymbol $rdf_find_base_uri_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1891L)
    private static SubLSymbol $get_rdf_uri_internal_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLSymbol $dtp_rdf_uri$;
    private static final SubLList $list0;
    private static final SubLString $str1$RDF_URI_Lock;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLSymbol $sym3$VALID_URI_CONNECTOR_P;
    private static final SubLString $str4$_;
    private static final SubLString $str5$_;
    private static final SubLSymbol $sym6$RDF_FIND_BASE_URI;
    private static final SubLSymbol $sym7$_RDF_FIND_BASE_URI_CACHING_STATE_;
    private static final SubLSymbol $sym8$GET_RDF_URI_INTERNAL;
    private static final SubLSymbol $sym9$_GET_RDF_URI_INTERNAL_CACHING_STATE_;
    private static final SubLSymbol $sym10$RDF_URI_P;
    private static final SubLSymbol $sym11$RDF_URI;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$PRINT_RDF_URI;
    private static final SubLSymbol $sym17$RDF_URI_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$RDF_URI_STRUCT_BASE_URI;
    private static final SubLSymbol $sym20$_CSETF_RDF_URI_STRUCT_BASE_URI;
    private static final SubLSymbol $sym21$RDF_URI_STRUCT_CONNECTOR;
    private static final SubLSymbol $sym22$_CSETF_RDF_URI_STRUCT_CONNECTOR;
    private static final SubLSymbol $sym23$RDF_URI_STRUCT_LOCAL_PART;
    private static final SubLSymbol $sym24$_CSETF_RDF_URI_STRUCT_LOCAL_PART;
    private static final SubLSymbol $kw25$BASE_URI;
    private static final SubLSymbol $kw26$CONNECTOR;
    private static final SubLSymbol $kw27$LOCAL_PART;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_RDF_URI;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_RDF_URI_METHOD;
    private static final SubLString $str34$_RDF_URI__A;
    private static final SubLSymbol $sym35$URI_P;
    private static final SubLSymbol $sym36$RDF_URI_UTF8_STRING;
    private static final SubLSymbol $sym37$SXHASH_RDF_URI_METHOD;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 986L)
    public static SubLObject get_rdf_uri(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == rdf_uri.UNPROVIDED) {
            connector = (SubLObject)rdf_uri.NIL;
        }
        if (local_part == rdf_uri.UNPROVIDED) {
            local_part = (SubLObject)rdf_uri.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rdf_uri.NIL != Types.stringp(base_uri) : base_uri;
        if (rdf_uri.NIL != connector && !rdf_uri.assertionsDisabledInClass && rdf_uri.NIL == valid_uri_connector_p(connector)) {
            throw new AssertionError(connector);
        }
        if (rdf_uri.NIL != local_part && !rdf_uri.assertionsDisabledInClass && rdf_uri.NIL == Types.stringp(local_part)) {
            throw new AssertionError(local_part);
        }
        if (rdf_uri.NIL == connector && rdf_uri.NIL == local_part) {
            if (rdf_uri.NIL != string_utilities.starts_with(base_uri, (SubLObject)rdf_uri.$str4$_) && rdf_uri.NIL != string_utilities.ends_with(base_uri, (SubLObject)rdf_uri.$str5$_, (SubLObject)rdf_uri.UNPROVIDED)) {
                base_uri = Sequences.subseq(base_uri, (SubLObject)rdf_uri.ONE_INTEGER, Numbers.subtract(Sequences.length(base_uri), (SubLObject)rdf_uri.ONE_INTEGER));
            }
            thread.resetMultipleValues();
            final SubLObject nbase = parse_uri(base_uri);
            final SubLObject nconnector = thread.secondMultipleValue();
            final SubLObject nlocal_part = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (rdf_uri.NIL != nbase) {
                base_uri = rdf_find_base_uri(nbase);
                connector = nconnector;
                local_part = nlocal_part;
            }
        }
        SubLObject uri = (SubLObject)rdf_uri.NIL;
        SubLObject release = (SubLObject)rdf_uri.NIL;
        try {
            release = Locks.seize_lock(rdf_uri.$rdf_uri_lock$.getGlobalValue());
            uri = get_rdf_uri_internal(base_uri, connector, local_part);
        }
        finally {
            if (rdf_uri.NIL != release) {
                Locks.release_lock(rdf_uri.$rdf_uri_lock$.getGlobalValue());
            }
        }
        return uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1737L)
    public static SubLObject clear_rdf_find_base_uri() {
        final SubLObject cs = rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue();
        if (rdf_uri.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_uri.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1737L)
    public static SubLObject remove_rdf_find_base_uri(final SubLObject base_uri) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(base_uri), (SubLObject)rdf_uri.UNPROVIDED, (SubLObject)rdf_uri.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1737L)
    public static SubLObject rdf_find_base_uri_internal(final SubLObject base_uri) {
        return base_uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1737L)
    public static SubLObject rdf_find_base_uri(final SubLObject base_uri) {
        SubLObject caching_state = rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue();
        if (rdf_uri.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_uri.$sym6$RDF_FIND_BASE_URI, (SubLObject)rdf_uri.$sym7$_RDF_FIND_BASE_URI_CACHING_STATE_, (SubLObject)rdf_uri.NIL, (SubLObject)rdf_uri.EQUAL, (SubLObject)rdf_uri.ONE_INTEGER, (SubLObject)rdf_uri.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, base_uri, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdf_find_base_uri_internal(base_uri)));
            memoization_state.caching_state_put(caching_state, base_uri, results, (SubLObject)rdf_uri.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1891L)
    public static SubLObject clear_get_rdf_uri_internal() {
        final SubLObject cs = rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue();
        if (rdf_uri.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rdf_uri.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1891L)
    public static SubLObject remove_get_rdf_uri_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        return memoization_state.caching_state_remove_function_results_with_args(rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(base_uri, connector, local_part), (SubLObject)rdf_uri.UNPROVIDED, (SubLObject)rdf_uri.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1891L)
    public static SubLObject get_rdf_uri_internal_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        return new_rdf_uri(base_uri, connector, local_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 1891L)
    public static SubLObject get_rdf_uri_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        SubLObject caching_state = rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue();
        if (rdf_uri.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rdf_uri.$sym8$GET_RDF_URI_INTERNAL, (SubLObject)rdf_uri.$sym9$_GET_RDF_URI_INTERNAL_CACHING_STATE_, (SubLObject)rdf_uri.NIL, (SubLObject)rdf_uri.EQUAL, (SubLObject)rdf_uri.THREE_INTEGER, (SubLObject)rdf_uri.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(base_uri, connector, local_part);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rdf_uri.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rdf_uri.NIL;
            collision = cdolist_list_var.first();
            while (rdf_uri.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (base_uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (connector.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (rdf_uri.NIL != cached_args && rdf_uri.NIL == cached_args.rest() && local_part.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_rdf_uri_internal_internal(base_uri, connector, local_part)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(base_uri, connector, local_part));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 2052L)
    public static SubLObject parse_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_uri = (SubLObject)((rdf_uri.NIL != web_utilities.uri_p(uri, (SubLObject)rdf_uri.UNPROVIDED)) ? uri : rdf_uri.NIL);
        SubLObject local_part = (SubLObject)rdf_uri.NIL;
        thread.resetMultipleValues();
        final SubLObject connector_pos = find_rdf_uri_standard_connector(uri);
        final SubLObject connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rdf_uri.NIL != connector_pos) {
            base_uri = string_utilities.substring(uri, (SubLObject)rdf_uri.ZERO_INTEGER, connector_pos);
            local_part = string_utilities.substring(uri, number_utilities.f_1X(connector_pos), (SubLObject)rdf_uri.UNPROVIDED);
        }
        return Values.values(base_uri, connector, local_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 2419L)
    public static SubLObject rdf_uri_starts_withP(final SubLObject v_rdf_uri, final SubLObject prefix) {
        assert rdf_uri.NIL != rdf_uri_p(v_rdf_uri) : v_rdf_uri;
        assert rdf_uri.NIL != Types.stringp(prefix) : prefix;
        if (rdf_uri.NIL != string_utilities.starts_with(rdf_uri_base_uri(v_rdf_uri), prefix)) {
            return (SubLObject)rdf_uri.T;
        }
        if (rdf_uri.NIL != list_utilities.greater_length_p(prefix, rdf_uri_base_uri(v_rdf_uri)) && rdf_uri.NIL != string_utilities.starts_with(rdf_uri_utf8_string(v_rdf_uri), prefix)) {
            return (SubLObject)rdf_uri.T;
        }
        return (SubLObject)rdf_uri.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 2763L)
    public static SubLObject rdf_uri_equal_p(final SubLObject uri1, final SubLObject uri2) {
        assert rdf_uri.NIL != rdf_uri_p(uri1) : uri1;
        assert rdf_uri.NIL != rdf_uri_p(uri2) : uri2;
        return Equality.equal(rdf_uri_utf8_string(uri1), rdf_uri_utf8_string(uri2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 2948L)
    public static SubLObject rdf_uri_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        assert rdf_uri.NIL != rdf_uri_p(v_rdf_uri) : v_rdf_uri;
        assert rdf_uri.NIL != Types.stringp(uri) : uri;
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_uri.NIL != rdf_uri_length_matchesP(v_rdf_uri, uri) && rdf_uri.NIL != rdf_uri_base_matchesP(v_rdf_uri, uri) && rdf_uri.NIL != rdf_uri_connector_matchesP(v_rdf_uri, uri) && rdf_uri.NIL != rdf_uri_local_part_matchesP(v_rdf_uri, uri));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 3249L)
    public static SubLObject rdf_uri_cyc_string(final SubLObject v_rdf_uri) {
        final SubLObject utf8 = rdf_uri_utf8_string(v_rdf_uri);
        return (rdf_uri.NIL != unicode_strings.ascii_string_p(utf8)) ? utf8 : unicode_nauts.non_ascii_string_to_unicode(utf8);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 3438L)
    public static SubLObject rdf_namespace_uri_with_local_partP(final SubLObject v_rdf_uri, final SubLObject local_part) {
        assert rdf_uri.NIL != rdf_uri_p(v_rdf_uri) : v_rdf_uri;
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_uri_connector(v_rdf_uri).eql((SubLObject)Characters.CHAR_hash) && rdf_uri_local_part(v_rdf_uri).equal(local_part) && rdf_uri.NIL != list_utilities.lengthE(rdf_uri_base_uri(v_rdf_uri), number_utilities.f_1_(Sequences.length(rdf_utilities.rdf_namespace())), (SubLObject)rdf_uri.UNPROVIDED) && rdf_uri.NIL != string_utilities.starts_with(rdf_utilities.rdf_namespace(), rdf_uri_base_uri(v_rdf_uri)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 3790L)
    public static SubLObject find_rdf_uri_standard_connector(final SubLObject string) {
        SubLObject cdolist_list_var = rdf_uri.$rdf_uri_standard_connectors$.getGlobalValue();
        SubLObject standard_connector = (SubLObject)rdf_uri.NIL;
        standard_connector = cdolist_list_var.first();
        while (rdf_uri.NIL != cdolist_list_var) {
            final SubLObject connector_pos = list_utilities.position_from_end(standard_connector, string, (SubLObject)rdf_uri.UNPROVIDED, (SubLObject)rdf_uri.UNPROVIDED, (SubLObject)rdf_uri.UNPROVIDED, (SubLObject)rdf_uri.UNPROVIDED);
            if (rdf_uri.NIL != connector_pos) {
                return Values.values(connector_pos, standard_connector);
            }
            cdolist_list_var = cdolist_list_var.rest();
            standard_connector = cdolist_list_var.first();
        }
        return Values.values((SubLObject)rdf_uri.NIL, (SubLObject)rdf_uri.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject rdf_uri_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_rdf_uri(v_object, stream, (SubLObject)rdf_uri.ZERO_INTEGER);
        return (SubLObject)rdf_uri.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject rdf_uri_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rdf_uri_native.class) ? rdf_uri.T : rdf_uri.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject rdf_uri_struct_base_uri(final SubLObject v_object) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject rdf_uri_struct_connector(final SubLObject v_object) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject rdf_uri_struct_local_part(final SubLObject v_object) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject _csetf_rdf_uri_struct_base_uri(final SubLObject v_object, final SubLObject value) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject _csetf_rdf_uri_struct_connector(final SubLObject v_object, final SubLObject value) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject _csetf_rdf_uri_struct_local_part(final SubLObject v_object, final SubLObject value) {
        assert rdf_uri.NIL != rdf_uri_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject make_rdf_uri(SubLObject arglist) {
        if (arglist == rdf_uri.UNPROVIDED) {
            arglist = (SubLObject)rdf_uri.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rdf_uri_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rdf_uri.NIL, next = arglist; rdf_uri.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rdf_uri.$kw25$BASE_URI)) {
                _csetf_rdf_uri_struct_base_uri(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rdf_uri.$kw26$CONNECTOR)) {
                _csetf_rdf_uri_struct_connector(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rdf_uri.$kw27$LOCAL_PART)) {
                _csetf_rdf_uri_struct_local_part(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rdf_uri.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject visit_defstruct_rdf_uri(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rdf_uri.$kw29$BEGIN, (SubLObject)rdf_uri.$sym30$MAKE_RDF_URI, (SubLObject)rdf_uri.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rdf_uri.$kw31$SLOT, (SubLObject)rdf_uri.$kw25$BASE_URI, rdf_uri_struct_base_uri(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rdf_uri.$kw31$SLOT, (SubLObject)rdf_uri.$kw26$CONNECTOR, rdf_uri_struct_connector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rdf_uri.$kw31$SLOT, (SubLObject)rdf_uri.$kw27$LOCAL_PART, rdf_uri_struct_local_part(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rdf_uri.$kw32$END, (SubLObject)rdf_uri.$sym30$MAKE_RDF_URI, (SubLObject)rdf_uri.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4293L)
    public static SubLObject visit_defstruct_object_rdf_uri_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rdf_uri(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4522L)
    public static SubLObject print_rdf_uri(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rdf_uri.$str34$_RDF_URI__A, rdf_uri_struct_base_uri(v_object));
        if (rdf_uri.NIL != rdf_uri_struct_connector(v_object)) {
            print_high.princ(rdf_uri_struct_connector(v_object), stream);
            print_high.princ(rdf_uri_struct_local_part(v_object), stream);
        }
        print_high.princ((SubLObject)rdf_uri.$str5$_, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 4853L)
    public static SubLObject new_rdf_uri_from_two_parts(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject base_uri = rdf_uri_parts_from_two_parts(start, end);
        final SubLObject connector = thread.secondMultipleValue();
        final SubLObject local_part = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return get_rdf_uri(base_uri, connector, local_part);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 5087L)
    public static SubLObject rdf_uri_parts_from_two_parts(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject connector_pos = find_rdf_uri_standard_connector(end);
        SubLObject connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (rdf_uri.ZERO_INTEGER.eql(connector_pos)) {
            return Values.values(start, connector, string_utilities.substring(end, (SubLObject)rdf_uri.ONE_INTEGER, (SubLObject)rdf_uri.UNPROVIDED));
        }
        if (rdf_uri.NIL != connector_pos) {
            final SubLObject base_uri = Sequences.cconcatenate(start, string_utilities.substring(end, (SubLObject)rdf_uri.ZERO_INTEGER, connector_pos));
            final SubLObject local_part = string_utilities.substring(end, number_utilities.f_1X(connector_pos), (SubLObject)rdf_uri.UNPROVIDED);
            return Values.values(base_uri, connector, local_part);
        }
        thread.resetMultipleValues();
        connector_pos = find_rdf_uri_standard_connector(start);
        connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (connector.eql(string_utilities.last_char(start))) {
            return Values.values(string_utilities.remove_last_char(start, (SubLObject)rdf_uri.UNPROVIDED), connector, end);
        }
        if (rdf_uri.NIL != connector_pos) {
            final SubLObject base_uri = string_utilities.substring(start, (SubLObject)rdf_uri.ZERO_INTEGER, connector_pos);
            final SubLObject local_part = Sequences.cconcatenate(string_utilities.substring(start, number_utilities.f_1X(connector_pos), (SubLObject)rdf_uri.UNPROVIDED), end);
            return Values.values(base_uri, connector, local_part);
        }
        thread.resetMultipleValues();
        final SubLObject base_uri2 = parse_uri(Sequences.cconcatenate(start, end));
        connector = thread.secondMultipleValue();
        final SubLObject local_part2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(base_uri2, connector, local_part2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 6100L)
    public static SubLObject resolve_rdf_uri(final SubLObject base_uri, final SubLObject relative_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_base_uri = web_utilities.canonicalize_relative_uri(base_uri, relative_uri);
        final SubLObject new_local_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return new_rdf_uri_from_two_parts(new_base_uri, new_local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 6338L)
    public static SubLObject new_rdf_uri(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        assert rdf_uri.NIL != web_utilities.uri_p(base_uri, (SubLObject)rdf_uri.UNPROVIDED) : base_uri;
        if (rdf_uri.NIL != local_part && !rdf_uri.assertionsDisabledInClass && rdf_uri.NIL == Types.stringp(local_part)) {
            throw new AssertionError(local_part);
        }
        if (rdf_uri.NIL != connector && !rdf_uri.assertionsDisabledInClass && rdf_uri.NIL == valid_uri_connector_p(connector)) {
            throw new AssertionError(connector);
        }
        final SubLObject uri_struct = make_rdf_uri((SubLObject)rdf_uri.UNPROVIDED);
        _csetf_rdf_uri_struct_base_uri(uri_struct, base_uri);
        if (rdf_uri.NIL != connector) {
            if (connector.isString() && rdf_uri.NIL != list_utilities.lengthE(connector, (SubLObject)rdf_uri.ONE_INTEGER, (SubLObject)rdf_uri.UNPROVIDED)) {
                _csetf_rdf_uri_struct_connector(uri_struct, string_utilities.first_char(connector));
            }
            else {
                _csetf_rdf_uri_struct_connector(uri_struct, connector);
            }
            _csetf_rdf_uri_struct_local_part(uri_struct, local_part);
        }
        return uri_struct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 6983L)
    public static SubLObject valid_uri_connector_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() || v_object.isString());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 7090L)
    public static SubLObject rdf_uri_base_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rdf_uri.NIL != string_utilities.substring_matchP(uri, rdf_uri_struct_base_uri(v_rdf_uri), (SubLObject)rdf_uri.ZERO_INTEGER, (SubLObject)rdf_uri.UNPROVIDED) && (rdf_uri.NIL != rdf_uri_struct_connector(v_rdf_uri) || rdf_uri_struct_base_uri(v_rdf_uri).equal(uri)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 7335L)
    public static SubLObject rdf_uri_connector_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        final SubLObject connector = rdf_uri_struct_connector(v_rdf_uri);
        if (rdf_uri.NIL == connector) {
            return (SubLObject)rdf_uri.T;
        }
        if (connector.isChar()) {
            return Equality.eql(connector, Strings.sublisp_char(uri, Sequences.length(rdf_uri_struct_base_uri(v_rdf_uri))));
        }
        return string_utilities.substring_matchP(uri, connector, Sequences.length(rdf_uri_struct_base_uri(v_rdf_uri)), (SubLObject)rdf_uri.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 7705L)
    public static SubLObject rdf_uri_local_part_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        return string_utilities.ends_with(uri, rdf_uri_struct_local_part(v_rdf_uri), (SubLObject)rdf_uri.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 7825L)
    public static SubLObject rdf_uri_length_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        final SubLObject connector_length = (SubLObject)(rdf_uri_struct_connector(v_rdf_uri).isChar() ? rdf_uri.ONE_INTEGER : Sequences.length(rdf_uri_struct_connector(v_rdf_uri)));
        return list_utilities.lengthE(uri, Numbers.add(Sequences.length(rdf_uri_struct_base_uri(v_rdf_uri)), connector_length, Sequences.length(rdf_uri_struct_local_part(v_rdf_uri))), (SubLObject)rdf_uri.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8156L)
    public static SubLObject rdf_uri_utf8_string_internal(final SubLObject uri) {
        assert rdf_uri.NIL != rdf_uri_p(uri) : uri;
        final SubLObject base = rdf_uri_struct_base_uri(uri);
        return (rdf_uri.NIL != rdf_uri_struct_connector(uri)) ? Sequences.cconcatenate(format_nil.format_nil_a_no_copy(base), new SubLObject[] { format_nil.format_nil_a_no_copy(rdf_uri_struct_connector(uri)), format_nil.format_nil_a_no_copy(rdf_uri_struct_local_part(uri)) }) : string_utilities.copy_string(base);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8156L)
    public static SubLObject rdf_uri_utf8_string(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rdf_uri.NIL;
        if (rdf_uri.NIL == v_memoization_state) {
            return rdf_uri_utf8_string_internal(uri);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rdf_uri.$sym36$RDF_URI_UTF8_STRING, (SubLObject)rdf_uri.UNPROVIDED);
        if (rdf_uri.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rdf_uri.$sym36$RDF_URI_UTF8_STRING, (SubLObject)rdf_uri.ONE_INTEGER, (SubLObject)rdf_uri.NIL, (SubLObject)rdf_uri.EQUAL, (SubLObject)rdf_uri.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rdf_uri.$sym36$RDF_URI_UTF8_STRING, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, uri, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rdf_uri_utf8_string_internal(uri)));
            memoization_state.caching_state_put(caching_state, uri, results, (SubLObject)rdf_uri.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8497L)
    public static SubLObject rdf_uri_base_uri(final SubLObject uri) {
        assert rdf_uri.NIL != rdf_uri_p(uri) : uri;
        return rdf_uri_struct_base_uri(uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8607L)
    public static SubLObject rdf_uri_connector(final SubLObject uri) {
        assert rdf_uri.NIL != rdf_uri_p(uri) : uri;
        return rdf_uri_struct_connector(uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8719L)
    public static SubLObject rdf_uri_base_and_connector(final SubLObject uri) {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(rdf_uri_base_uri(uri)), format_nil.format_nil_a_no_copy(rdf_uri_connector(uri)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8847L)
    public static SubLObject rdf_uri_local_part(final SubLObject uri) {
        assert rdf_uri.NIL != rdf_uri_p(uri) : uri;
        return rdf_uri_struct_local_part(uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 8961L)
    public static SubLObject sxhash_rdf_uri_method(final SubLObject v_object) {
        return sxhash_rdf_uri(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-uri.lisp", position = 9055L)
    public static SubLObject sxhash_rdf_uri(final SubLObject uri) {
        return Numbers.logxor(new SubLObject[] { Sxhash.sxhash(rdf_uri_struct_base_uri(uri)), Sxhash.sxhash(rdf_uri_struct_connector(uri)), Sxhash.sxhash(rdf_uri_struct_local_part(uri)) });
    }
    
    public static SubLObject declare_rdf_uri_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "get_rdf_uri", "GET-RDF-URI", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "clear_rdf_find_base_uri", "CLEAR-RDF-FIND-BASE-URI", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "remove_rdf_find_base_uri", "REMOVE-RDF-FIND-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_find_base_uri_internal", "RDF-FIND-BASE-URI-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_find_base_uri", "RDF-FIND-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "clear_get_rdf_uri_internal", "CLEAR-GET-RDF-URI-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "remove_get_rdf_uri_internal", "REMOVE-GET-RDF-URI-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "get_rdf_uri_internal_internal", "GET-RDF-URI-INTERNAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "get_rdf_uri_internal", "GET-RDF-URI-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "parse_uri", "PARSE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_starts_withP", "RDF-URI-STARTS-WITH?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_equal_p", "RDF-URI-EQUAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_matchesP", "RDF-URI-MATCHES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_cyc_string", "RDF-URI-CYC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_namespace_uri_with_local_partP", "RDF-NAMESPACE-URI-WITH-LOCAL-PART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "find_rdf_uri_standard_connector", "FIND-RDF-URI-STANDARD-CONNECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_print_function_trampoline", "RDF-URI-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_p", "RDF-URI-P", 1, 0, false);
        new $rdf_uri_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_struct_base_uri", "RDF-URI-STRUCT-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_struct_connector", "RDF-URI-STRUCT-CONNECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_struct_local_part", "RDF-URI-STRUCT-LOCAL-PART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "_csetf_rdf_uri_struct_base_uri", "_CSETF-RDF-URI-STRUCT-BASE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "_csetf_rdf_uri_struct_connector", "_CSETF-RDF-URI-STRUCT-CONNECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "_csetf_rdf_uri_struct_local_part", "_CSETF-RDF-URI-STRUCT-LOCAL-PART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "make_rdf_uri", "MAKE-RDF-URI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "visit_defstruct_rdf_uri", "VISIT-DEFSTRUCT-RDF-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "visit_defstruct_object_rdf_uri_method", "VISIT-DEFSTRUCT-OBJECT-RDF-URI-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "print_rdf_uri", "PRINT-RDF-URI", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "new_rdf_uri_from_two_parts", "NEW-RDF-URI-FROM-TWO-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_parts_from_two_parts", "RDF-URI-PARTS-FROM-TWO-PARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "resolve_rdf_uri", "RESOLVE-RDF-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "new_rdf_uri", "NEW-RDF-URI", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "valid_uri_connector_p", "VALID-URI-CONNECTOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_base_matchesP", "RDF-URI-BASE-MATCHES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_connector_matchesP", "RDF-URI-CONNECTOR-MATCHES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_local_part_matchesP", "RDF-URI-LOCAL-PART-MATCHES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_length_matchesP", "RDF-URI-LENGTH-MATCHES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_utf8_string_internal", "RDF-URI-UTF8-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_utf8_string", "RDF-URI-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_base_uri", "RDF-URI-BASE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_connector", "RDF-URI-CONNECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_base_and_connector", "RDF-URI-BASE-AND-CONNECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "rdf_uri_local_part", "RDF-URI-LOCAL-PART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "sxhash_rdf_uri_method", "SXHASH-RDF-URI-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rdf.rdf_uri", "sxhash_rdf_uri", "SXHASH-RDF-URI", 1, 0, false);
        return (SubLObject)rdf_uri.NIL;
    }
    
    public static SubLObject init_rdf_uri_file() {
        rdf_uri.$rdf_uri_standard_connectors$ = SubLFiles.deflexical("*RDF-URI-STANDARD-CONNECTORS*", (SubLObject)rdf_uri.$list0);
        rdf_uri.$rdf_uri_lock$ = SubLFiles.deflexical("*RDF-URI-LOCK*", Locks.make_lock((SubLObject)rdf_uri.$str1$RDF_URI_Lock));
        rdf_uri.$rdf_find_base_uri_caching_state$ = SubLFiles.deflexical("*RDF-FIND-BASE-URI-CACHING-STATE*", (SubLObject)rdf_uri.NIL);
        rdf_uri.$get_rdf_uri_internal_caching_state$ = SubLFiles.deflexical("*GET-RDF-URI-INTERNAL-CACHING-STATE*", (SubLObject)rdf_uri.NIL);
        rdf_uri.$dtp_rdf_uri$ = SubLFiles.defconstant("*DTP-RDF-URI*", (SubLObject)rdf_uri.$sym11$RDF_URI);
        return (SubLObject)rdf_uri.NIL;
    }
    
    public static SubLObject setup_rdf_uri_file() {
        memoization_state.note_globally_cached_function((SubLObject)rdf_uri.$sym6$RDF_FIND_BASE_URI);
        memoization_state.note_globally_cached_function((SubLObject)rdf_uri.$sym8$GET_RDF_URI_INTERNAL);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), Symbols.symbol_function((SubLObject)rdf_uri.$sym17$RDF_URI_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rdf_uri.$list18);
        Structures.def_csetf((SubLObject)rdf_uri.$sym19$RDF_URI_STRUCT_BASE_URI, (SubLObject)rdf_uri.$sym20$_CSETF_RDF_URI_STRUCT_BASE_URI);
        Structures.def_csetf((SubLObject)rdf_uri.$sym21$RDF_URI_STRUCT_CONNECTOR, (SubLObject)rdf_uri.$sym22$_CSETF_RDF_URI_STRUCT_CONNECTOR);
        Structures.def_csetf((SubLObject)rdf_uri.$sym23$RDF_URI_STRUCT_LOCAL_PART, (SubLObject)rdf_uri.$sym24$_CSETF_RDF_URI_STRUCT_LOCAL_PART);
        Equality.identity((SubLObject)rdf_uri.$sym11$RDF_URI);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), Symbols.symbol_function((SubLObject)rdf_uri.$sym33$VISIT_DEFSTRUCT_OBJECT_RDF_URI_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)rdf_uri.$sym16$PRINT_RDF_URI);
        memoization_state.note_memoized_function((SubLObject)rdf_uri.$sym36$RDF_URI_UTF8_STRING);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), Symbols.symbol_function((SubLObject)rdf_uri.$sym37$SXHASH_RDF_URI_METHOD));
        return (SubLObject)rdf_uri.NIL;
    }
    
    public void declareFunctions() {
        declare_rdf_uri_file();
    }
    
    public void initializeVariables() {
        init_rdf_uri_file();
    }
    
    public void runTopLevelForms() {
        setup_rdf_uri_file();
    }
    
    static {
        me = (SubLFile)new rdf_uri();
        rdf_uri.$rdf_uri_standard_connectors$ = null;
        rdf_uri.$rdf_uri_lock$ = null;
        rdf_uri.$rdf_find_base_uri_caching_state$ = null;
        rdf_uri.$get_rdf_uri_internal_caching_state$ = null;
        rdf_uri.$dtp_rdf_uri$ = null;
        $list0 = ConsesLow.list((SubLObject)Characters.CHAR_hash, (SubLObject)Characters.CHAR_slash);
        $str1$RDF_URI_Lock = SubLObjectFactory.makeString("RDF URI Lock");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym3$VALID_URI_CONNECTOR_P = SubLObjectFactory.makeSymbol("VALID-URI-CONNECTOR-P");
        $str4$_ = SubLObjectFactory.makeString("<");
        $str5$_ = SubLObjectFactory.makeString(">");
        $sym6$RDF_FIND_BASE_URI = SubLObjectFactory.makeSymbol("RDF-FIND-BASE-URI");
        $sym7$_RDF_FIND_BASE_URI_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RDF-FIND-BASE-URI-CACHING-STATE*");
        $sym8$GET_RDF_URI_INTERNAL = SubLObjectFactory.makeSymbol("GET-RDF-URI-INTERNAL");
        $sym9$_GET_RDF_URI_INTERNAL_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-RDF-URI-INTERNAL-CACHING-STATE*");
        $sym10$RDF_URI_P = SubLObjectFactory.makeSymbol("RDF-URI-P");
        $sym11$RDF_URI = SubLObjectFactory.makeSymbol("RDF-URI");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-URI"), (SubLObject)SubLObjectFactory.makeSymbol("CONNECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-PART"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BASE-URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("LOCAL-PART"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-BASE-URI"), (SubLObject)SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-CONNECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-LOCAL-PART"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-BASE-URI"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-CONNECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-LOCAL-PART"));
        $sym16$PRINT_RDF_URI = SubLObjectFactory.makeSymbol("PRINT-RDF-URI");
        $sym17$RDF_URI_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RDF-URI-PRINT-FUNCTION-TRAMPOLINE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RDF-URI-P"));
        $sym19$RDF_URI_STRUCT_BASE_URI = SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-BASE-URI");
        $sym20$_CSETF_RDF_URI_STRUCT_BASE_URI = SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-BASE-URI");
        $sym21$RDF_URI_STRUCT_CONNECTOR = SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-CONNECTOR");
        $sym22$_CSETF_RDF_URI_STRUCT_CONNECTOR = SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-CONNECTOR");
        $sym23$RDF_URI_STRUCT_LOCAL_PART = SubLObjectFactory.makeSymbol("RDF-URI-STRUCT-LOCAL-PART");
        $sym24$_CSETF_RDF_URI_STRUCT_LOCAL_PART = SubLObjectFactory.makeSymbol("_CSETF-RDF-URI-STRUCT-LOCAL-PART");
        $kw25$BASE_URI = SubLObjectFactory.makeKeyword("BASE-URI");
        $kw26$CONNECTOR = SubLObjectFactory.makeKeyword("CONNECTOR");
        $kw27$LOCAL_PART = SubLObjectFactory.makeKeyword("LOCAL-PART");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_RDF_URI = SubLObjectFactory.makeSymbol("MAKE-RDF-URI");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_RDF_URI_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-URI-METHOD");
        $str34$_RDF_URI__A = SubLObjectFactory.makeString("<RDF-URI ~A");
        $sym35$URI_P = SubLObjectFactory.makeSymbol("URI-P");
        $sym36$RDF_URI_UTF8_STRING = SubLObjectFactory.makeSymbol("RDF-URI-UTF8-STRING");
        $sym37$SXHASH_RDF_URI_METHOD = SubLObjectFactory.makeSymbol("SXHASH-RDF-URI-METHOD");
    }
    
    public static final class $rdf_uri_native extends SubLStructNative
    {
        public SubLObject $base_uri;
        public SubLObject $connector;
        public SubLObject $local_part;
        private static final SubLStructDeclNative structDecl;
        
        public $rdf_uri_native() {
            this.$base_uri = (SubLObject)CommonSymbols.NIL;
            this.$connector = (SubLObject)CommonSymbols.NIL;
            this.$local_part = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rdf_uri_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$base_uri;
        }
        
        public SubLObject getField3() {
            return this.$connector;
        }
        
        public SubLObject getField4() {
            return this.$local_part;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$base_uri = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$connector = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$local_part = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rdf_uri_native.class, rdf_uri.$sym11$RDF_URI, rdf_uri.$sym10$RDF_URI_P, rdf_uri.$list12, rdf_uri.$list13, new String[] { "$base_uri", "$connector", "$local_part" }, rdf_uri.$list14, rdf_uri.$list15, rdf_uri.$sym16$PRINT_RDF_URI);
        }
    }
    
    public static final class $rdf_uri_p$UnaryFunction extends UnaryFunction
    {
        public $rdf_uri_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RDF-URI-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_uri.rdf_uri_p(arg1);
        }
    }
}

/*

	Total time: 173 ms
	 synthetic 
*/