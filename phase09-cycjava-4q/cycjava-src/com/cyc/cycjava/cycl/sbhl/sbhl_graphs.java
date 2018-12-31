package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.kb_storage_logging;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.file_vector_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.file_vector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_graphs extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_graphs";
    public static final String myFingerPrint = "76e981aba1a0b3ec9ef5be18955f17dffcc6831e162872d756153175e40433be";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1123L)
    private static SubLSymbol $sbhl_graph_equality_test$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1447L)
    public static SubLSymbol $sbhl_backing_file_vector$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1626L)
    public static SubLSymbol $sbhl_backing_file_vector_caches_for_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1784L)
    public static SubLSymbol $sbhl_backing_file_vector_cache_size_percentage$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1949L)
    public static SubLSymbol $sbhl_backing_file_vector_cache_minimum_size$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2160L)
    public static SubLSymbol $sbhl_backing_file_vector_cache_gather_cache_metricsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2328L)
    public static SubLSymbol $sbhl_file_vector_data_stream_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2594L)
    public static SubLSymbol $sbhl_backing_file_vector_cache_constructor$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 9970L)
    private static SubLSymbol $override_sbhl_isa_module_with_kb_lookupP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 17099L)
    public static SubLSymbol $default_number_of_concurrent_readers$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 17239L)
    public static SubLSymbol $default_number_of_terms_checked$;
    private static final SubLSymbol $sym0$_SBHL_BACKING_FILE_VECTOR_;
    private static final SubLSymbol $sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_;
    private static final SubLInteger $int2$100;
    private static final SubLSymbol $sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_;
    private static final SubLString $str4$SBHL_File_Vector_Data_Stream_lock;
    private static final SubLSymbol $sym5$NEW_METERED_PREALLOCATED_CACHE;
    private static final SubLString $str6$sbhl_module_graphs;
    private static final SubLString $str7$cfasl;
    private static final SubLString $str8$sbhl_module_graphs_index;
    private static final SubLSymbol $kw9$INITIALIZED;
    private static final SubLSymbol $kw10$UNINITIALIZED;
    private static final SubLSymbol $sym11$CACHE_STRATEGY_OR_SYMBOL_P;
    private static final SubLSymbol $sym12$SBHL_MODULE_P;
    private static final SubLSymbol $kw13$ERROR;
    private static final SubLString $str14$_A_is_not_a__A;
    private static final SubLSymbol $sym15$SBHL_DIRECTION_LINK_P;
    private static final SubLSymbol $kw16$CERROR;
    private static final SubLString $str17$continue_anyway;
    private static final SubLSymbol $kw18$WARN;
    private static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLSymbol $sym20$SBHL_NODE_OBJECT_P;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw24$MODULE;
    private static final SubLSymbol $kw25$DONE;
    private static final SubLSymbol $sym26$MAP;
    private static final SubLSymbol $sym27$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$WITH_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$CLET;
    private static final SubLSymbol $sym32$GET_SBHL_GRAPH;
    private static final SubLSymbol $sym33$DO_FILE_VECTOR_BACKED_MAP;
    private static final SubLList $list34;
    private static final SubLString $str35$Capacity______Hits____Misses__Sma;
    private static final SubLString $str36$_________________________________;
    private static final SubLSymbol $sym37$FORT__;
    private static final SubLString $str38$___A;
    private static final SubLList $list39;
    private static final SubLString $str40$_6_A__9_A__9_A__;
    private static final SubLString $str41$___;
    private static final SubLString $str42$_6_d__9_d__9_d_____A__;
    private static final SubLString $str43$___;
    private static final SubLString $str44$;
    private static final SubLInteger $int45$500;
    private static final SubLString $str46$Concurrent_Reads_Stress_Test_Prob;
    private static final SubLString $str47$Concurrent_SBHL_Reader_;
    private static final SubLSymbol $sym48$STRESS_TEST_READ_RANDOMLY_FROM_SBHL;
    private static final SubLFloat $float49$0_1;
    private static final SubLSymbol $sym50$VALID_PROCESS_P;
    private static final SubLSymbol $sym51$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLObject $const52$Individual;
    private static final SubLString $str53$Concurrent_Cache_Strategy_Stress_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$STRESS_TEST_CHECK_SAME_SPECS;
    private static final SubLObject $const56$InferencePSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 824L)
    public static SubLObject optimize_sbhl_store() {
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 971L)
    public static SubLObject sbhl_graph_object_p(final SubLObject v_object) {
        return Types.hash_table_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1235L)
    public static SubLObject make_new_sbhl_graph() {
        return Hashtables.make_hash_table((SubLObject)sbhl_graphs.ZERO_INTEGER, sbhl_graphs.$sbhl_graph_equality_test$.getGlobalValue(), (SubLObject)sbhl_graphs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 1333L)
    public static SubLObject clear_sbhl_graph(final SubLObject v_graph) {
        Hashtables.clrhash(v_graph);
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 2815L)
    public static SubLObject initialize_sbhl_graph_caches() {
        final SubLObject data_file = misc_utilities.get_hl_store_cache_filename((SubLObject)sbhl_graphs.$str6$sbhl_module_graphs, (SubLObject)sbhl_graphs.$str7$cfasl);
        final SubLObject index_file = misc_utilities.get_hl_store_cache_filename((SubLObject)sbhl_graphs.$str8$sbhl_module_graphs_index, (SubLObject)sbhl_graphs.$str7$cfasl);
        if (sbhl_graphs.NIL != Filesys.probe_file(data_file) && sbhl_graphs.NIL != Filesys.probe_file(index_file)) {
            initialize_sbhl_graph_caches_file_vector(data_file, index_file);
            return (SubLObject)sbhl_graphs.$kw9$INITIALIZED;
        }
        return (SubLObject)sbhl_graphs.$kw10$UNINITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 3240L)
    public static SubLObject initialize_sbhl_graph_caches_file_vector(final SubLObject data_file, final SubLObject index_file) {
        SubLObject release = (SubLObject)sbhl_graphs.NIL;
        try {
            release = Locks.seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            if (sbhl_graphs.NIL != file_vector.file_vector_p(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue())) {
                file_vector.close_file_vector(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
            }
            sbhl_graphs.$sbhl_backing_file_vector$.setGlobalValue(file_vector.new_file_vector(data_file, index_file, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED));
            sbhl_enable_memory_mapping();
        }
        finally {
            if (sbhl_graphs.NIL != release) {
                Locks.release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 3703L)
    public static SubLObject sbhl_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        SubLObject release = (SubLObject)sbhl_graphs.NIL;
        try {
            release = Locks.seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector.file_vector_change_stream_buffer_sizes(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size);
        }
        finally {
            if (sbhl_graphs.NIL != release) {
                Locks.release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 4082L)
    public static SubLObject sbhl_enable_memory_mapping() {
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        SubLObject release = (SubLObject)sbhl_graphs.NIL;
        try {
            release = Locks.seize_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            result = file_vector.file_vector_enable_memory_mapping(sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
        }
        finally {
            if (sbhl_graphs.NIL != release) {
                Locks.release_lock(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 4307L)
    public static SubLObject new_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, SubLObject capacity) {
        if (capacity == sbhl_graphs.UNPROVIDED) {
            capacity = (SubLObject)sbhl_graphs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cache_capacity = (sbhl_graphs.NIL != subl_promotions.non_negative_integer_p(capacity)) ? capacity : cache_capacity_for_cache_strategy_for_sbhl_module(sbhl_module);
        final SubLObject cache_strategy = Functions.funcall(sbhl_graphs.$sbhl_backing_file_vector_cache_constructor$.getGlobalValue(), cache_capacity);
        if (sbhl_graphs.NIL != sbhl_graphs.$sbhl_backing_file_vector_cache_gather_cache_metricsP$.getDynamicValue(thread)) {
            cache_utilities.cache_strategy_gather_metrics(cache_strategy);
        }
        return cache_strategy;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 4909L)
    public static SubLObject get_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        SubLObject v_cache = list_utilities.alist_lookup_without_values(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
        if (sbhl_graphs.NIL == v_cache) {
            v_cache = new_cache_strategy_for_sbhl_module(sbhl_module, (SubLObject)sbhl_graphs.UNPROVIDED);
            set_cache_strategy_for_sbhl_module(sbhl_module, v_cache);
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 5394L)
    public static SubLObject set_cache_strategy_for_sbhl_module(final SubLObject sbhl_module, final SubLObject cache_strategy) {
        assert sbhl_graphs.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.setGlobalValue(list_utilities.alist_enter(sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue(), sbhl_module, cache_strategy, (SubLObject)sbhl_graphs.UNPROVIDED));
        return sbhl_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 5731L)
    public static SubLObject cache_capacity_for_cache_strategy_for_sbhl_module(final SubLObject sbhl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_graph = sbhl_module_vars.get_sbhl_module_graph(sbhl_module);
        final SubLObject graph_size = map_utilities.map_size(v_graph);
        final SubLObject estimated_cache_size = Numbers.integerDivide(Numbers.multiply(graph_size, sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$.getDynamicValue(thread)), (SubLObject)sbhl_graphs.$int2$100);
        return Numbers.max(sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$.getDynamicValue(thread), estimated_cache_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 6262L)
    public static SubLObject initialize_sbhl_graph_caches_during_load_kb(final SubLObject data_file, final SubLObject index_file) {
        return initialize_sbhl_graph_caches_file_vector(data_file, index_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 6499L)
    public static SubLObject sbhl_graph_completely_cachedP() {
        return (SubLObject)sbhl_graphs.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 6600L)
    public static SubLObject get_sbhl_module_caching_ratio(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_graphs.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph(module);
        thread.resetMultipleValues();
        final SubLObject paged_in = file_vector_utilities.file_vector_backed_map_cache_ratio(v_graph);
        final SubLObject paged_out = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(paged_in, Numbers.add(paged_in, paged_out));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 7002L)
    public static SubLObject get_sbhl_modules_caching_ratios() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_paged_in = (SubLObject)sbhl_graphs.ZERO_INTEGER;
        SubLObject sum_total = (SubLObject)sbhl_graphs.ZERO_INTEGER;
        SubLObject results = (SubLObject)sbhl_graphs.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject sbhl_module = (SubLObject)sbhl_graphs.NIL;
        sbhl_module = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            final SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(sbhl_module);
            thread.resetMultipleValues();
            final SubLObject paged_in = get_sbhl_module_caching_ratio(sbhl_module);
            final SubLObject total = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_paged_in = Numbers.add(total_paged_in, paged_in);
            sum_total = Numbers.add(sum_total, total);
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(predicate, paged_in, total), results);
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_module = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(results), total_paged_in, sum_total);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 7833L)
    public static SubLObject get_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_graphs.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_get(v_graph, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), v_cache, node, (SubLObject)sbhl_graphs.UNPROVIDED);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 8470L)
    public static SubLObject put_sbhl_graph_link_into_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_graphs.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_put(v_graph, v_cache, node, value);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 8958L)
    public static SubLObject remove_sbhl_graph_link_from_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_graphs.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_remove(v_graph, v_cache, node, (SubLObject)sbhl_graphs.UNPROVIDED);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 9470L)
    public static SubLObject touch_sbhl_link_graph(final SubLObject node, final SubLObject v_graph, final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_graphs.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            result = file_vector_utilities.file_vector_backed_map_wX_cache_touch(v_graph, v_cache, node, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue());
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 10239L)
    public static SubLObject get_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_graphs.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_graphs.NIL;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sbhl_graphs.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                result = get_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (sbhl_graphs.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 11431L)
    public static SubLObject set_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_graphs.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_graphs.NIL == sbhl_links.sbhl_direction_link_p(direction_link)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_graphs.$kw13$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, direction_link, (SubLObject)sbhl_graphs.$sym15$SBHL_DIRECTION_LINK_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw16$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, direction_link, (SubLObject)sbhl_graphs.$sym15$SBHL_DIRECTION_LINK_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw18$WARN)) {
                Errors.warn((SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, direction_link, (SubLObject)sbhl_graphs.$sym15$SBHL_DIRECTION_LINK_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, direction_link, (SubLObject)sbhl_graphs.$sym15$SBHL_DIRECTION_LINK_P);
            }
        }
        if (sbhl_graphs.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_graphs.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_graphs.$kw13$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw16$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw18$WARN)) {
                Errors.warn((SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P);
            }
        }
        assert sbhl_graphs.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sbhl_graphs.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                put_sbhl_graph_link_into_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module), direction_link);
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (sbhl_graphs.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 12032L)
    public static SubLObject touch_sbhl_graph_link(final SubLObject node, final SubLObject direction_link, final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_graphs.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_graphs.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_graphs.$kw13$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw16$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_graphs.ONE_INTEGER, (SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_graphs.$kw18$WARN)) {
                Errors.warn((SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_graphs.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_graphs.$str17$continue_anyway, (SubLObject)sbhl_graphs.$str14$_A_is_not_a__A, node, (SubLObject)sbhl_graphs.$sym20$SBHL_NODE_OBJECT_P);
            }
        }
        assert sbhl_graphs.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sbhl_graphs.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(kb_storage_logging.add_kb_storage_logging_add_tag(logging_tag_for_module(module)), thread);
                touch_sbhl_link_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            if (sbhl_graphs.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 12657L)
    public static SubLObject logging_tag_for_module(final SubLObject module) {
        return constants_high.constant_name(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 12767L)
    public static SubLObject remove_sbhl_graph_link(final SubLObject node, final SubLObject module) {
        assert sbhl_graphs.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = (SubLObject)sbhl_graphs.NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            remove_sbhl_graph_link_from_graph(node, sbhl_module_utilities.get_sbhl_graph(module), get_cache_strategy_for_sbhl_module(module));
        }
        finally {
            if (sbhl_graphs.NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 13108L)
    public static SubLObject do_sbhl_graph_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_graphs.NIL;
        SubLObject link_var = (SubLObject)sbhl_graphs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list21);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list21);
        link_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_graphs.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_graphs.NIL;
        SubLObject current_$1 = (SubLObject)sbhl_graphs.NIL;
        while (sbhl_graphs.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_graphs.$list21);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_graphs.$list21);
            if (sbhl_graphs.NIL == conses_high.member(current_$1, (SubLObject)sbhl_graphs.$list22, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED)) {
                bad = (SubLObject)sbhl_graphs.T;
            }
            if (current_$1 == sbhl_graphs.$kw23$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_graphs.NIL != bad && sbhl_graphs.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_graphs.$list21);
        }
        final SubLObject module_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_graphs.$kw24$MODULE, current);
        final SubLObject module = (SubLObject)((sbhl_graphs.NIL != module_tail) ? conses_high.cadr(module_tail) : sbhl_graphs.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_graphs.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((sbhl_graphs.NIL != done_tail) ? conses_high.cadr(done_tail) : sbhl_graphs.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject map = (SubLObject)sbhl_graphs.$sym26$MAP;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_graphs.$sym27$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, (SubLObject)sbhl_graphs.$list28, (SubLObject)ConsesLow.list((SubLObject)sbhl_graphs.$sym29$WITH_CFASL_COMMON_SYMBOLS_SIMPLE, (SubLObject)sbhl_graphs.$list30, (SubLObject)ConsesLow.list((SubLObject)sbhl_graphs.$sym31$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(map, (SubLObject)ConsesLow.list((SubLObject)sbhl_graphs.$sym32$GET_SBHL_GRAPH, module))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_graphs.$sym33$DO_FILE_VECTOR_BACKED_MAP, (SubLObject)ConsesLow.list(node_var, link_var, map, (SubLObject)sbhl_graphs.$sym0$_SBHL_BACKING_FILE_VECTOR_, (SubLObject)sbhl_graphs.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)sbhl_graphs.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 13764L)
    public static SubLObject swap_in_all_graph_links(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), thread);
            cfasl.$cfasl_common_symbols$.bind((SubLObject)sbhl_graphs.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            final SubLObject map = sbhl_module_utilities.get_sbhl_graph(module);
            SubLObject link = (SubLObject)sbhl_graphs.NIL;
            final SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)sbhl_graphs.NIL; sbhl_graphs.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_graphs.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sbhl_graphs.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject node = (SubLObject)sbhl_graphs.NIL;
                    SubLObject impl_value = (SubLObject)sbhl_graphs.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list34);
                    node = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list34);
                    impl_value = current.first();
                    current = current.rest();
                    if (sbhl_graphs.NIL == current) {
                        if (sbhl_graphs.NIL == file_vector_utilities.file_vector_reference_p(impl_value) || sbhl_graphs.NIL == file_vector_utilities.file_vector_reference_deletedP(impl_value)) {
                            link = file_vector_utilities.file_vector_backed_map_wX_cache_get(map, sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue(), (SubLObject)sbhl_graphs.NIL, node, (SubLObject)sbhl_graphs.UNPROVIDED);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_graphs.$list34);
                    }
                }
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_2, thread);
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 13907L)
    public static SubLObject swap_out_all_pristine_graph_links(final SubLObject module) {
        file_vector_utilities.swap_out_all_pristine_file_vector_backed_map_objects(sbhl_module_utilities.get_sbhl_graph(module));
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 14066L)
    public static SubLObject swap_out_all_pristine_sbhl_module_graph_links() {
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject sbhl_module = (SubLObject)sbhl_graphs.NIL;
        sbhl_module = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = (SubLObject)sbhl_graphs.NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                swap_out_all_pristine_graph_links(sbhl_module);
            }
            finally {
                if (sbhl_graphs.NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_module = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_graphs.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 14276L)
    public static SubLObject get_sbhl_module_cache_strategy_metrics(final SubLObject module) {
        final SubLObject cache_strategy = get_cache_strategy_for_sbhl_module(module);
        if (sbhl_graphs.NIL != cache_utilities.cache_strategy_keeps_metrics_p(cache_strategy)) {
            return cache_utilities.cache_strategy_get_metrics(cache_strategy);
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 14619L)
    public static SubLObject get_all_sbhl_module_cache_strategy_metrics() {
        SubLObject all_metrics = (SubLObject)sbhl_graphs.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_module_list();
        SubLObject module = (SubLObject)sbhl_graphs.NIL;
        module = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            final SubLObject metrics = get_sbhl_module_cache_strategy_metrics(module);
            if (sbhl_graphs.NIL != cache_utilities.cache_metrics_p(metrics)) {
                all_metrics = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sbhl_module_vars.get_sbhl_module_link_pred(module), metrics), all_metrics);
            }
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_metrics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 15049L)
    public static SubLObject get_sbhl_module_cache_strategy_information(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = sbhl_module_vars.get_sbhl_module_link_pred(module);
        final SubLObject cache_strategy = get_cache_strategy_for_sbhl_module(module);
        if (sbhl_graphs.NIL == cache_utilities.cache_strategy_p(cache_strategy)) {
            return Values.values(predicate, (SubLObject)sbhl_graphs.MINUS_ONE_INTEGER, (SubLObject)sbhl_graphs.MINUS_ONE_INTEGER, (SubLObject)sbhl_graphs.MINUS_ONE_INTEGER, (SubLObject)sbhl_graphs.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject cache_capacity = cache_utilities.gather_cache_strategy_information(cache_strategy);
        final SubLObject hits = thread.secondMultipleValue();
        final SubLObject misses = thread.thirdMultipleValue();
        final SubLObject cache_too_small_p = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(predicate, cache_capacity, hits, misses, cache_too_small_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 15551L)
    public static SubLObject show_all_sbhl_module_cache_strategies() {
        final SubLObject sbhl_modules = sbhl_module_vars.get_sbhl_module_list();
        final SubLObject info = dictionary.new_dictionary((SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED);
        SubLObject pred_list = (SubLObject)sbhl_graphs.NIL;
        SubLObject max_name_length = (SubLObject)sbhl_graphs.ZERO_INTEGER;
        SubLObject cdolist_list_var = sbhl_modules;
        SubLObject module = (SubLObject)sbhl_graphs.NIL;
        module = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            final SubLObject module_info = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sbhl_module_cache_strategy_information(module)));
            final SubLObject predicate = module_info.first();
            map_utilities.map_put(info, predicate, module_info);
            pred_list = (SubLObject)ConsesLow.cons(predicate, pred_list);
            max_name_length = Numbers.max(max_name_length, Sequences.length(kb_paths.fort_name(predicate)));
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        string_utilities.indent((SubLObject)sbhl_graphs.T, max_name_length);
        PrintLow.format((SubLObject)sbhl_graphs.T, (SubLObject)sbhl_graphs.$str35$Capacity______Hits____Misses__Sma);
        string_utilities.indent((SubLObject)sbhl_graphs.T, max_name_length);
        PrintLow.format((SubLObject)sbhl_graphs.T, (SubLObject)sbhl_graphs.$str36$_________________________________);
        pred_list = (cdolist_list_var = Sort.sort(pred_list, (SubLObject)sbhl_graphs.$sym37$FORT__, (SubLObject)sbhl_graphs.UNPROVIDED));
        SubLObject predicate2 = (SubLObject)sbhl_graphs.NIL;
        predicate2 = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            final SubLObject module_info = map_utilities.map_get(info, predicate2, (SubLObject)sbhl_graphs.UNPROVIDED);
            PrintLow.format((SubLObject)sbhl_graphs.T, (SubLObject)sbhl_graphs.$str38$___A, predicate2);
            string_utilities.indent((SubLObject)sbhl_graphs.T, Numbers.subtract(max_name_length, Sequences.length(kb_paths.fort_name(predicate2))));
            SubLObject current;
            final SubLObject datum = current = module_info;
            SubLObject predicate_again = (SubLObject)sbhl_graphs.NIL;
            SubLObject capacity = (SubLObject)sbhl_graphs.NIL;
            SubLObject hits = (SubLObject)sbhl_graphs.NIL;
            SubLObject misses = (SubLObject)sbhl_graphs.NIL;
            SubLObject too_small_p = (SubLObject)sbhl_graphs.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list39);
            predicate_again = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list39);
            capacity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list39);
            hits = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list39);
            misses = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_graphs.$list39);
            too_small_p = current.first();
            current = current.rest();
            if (sbhl_graphs.NIL == current) {
                if (capacity.isNegative()) {
                    PrintLow.format((SubLObject)sbhl_graphs.T, (SubLObject)sbhl_graphs.$str40$_6_A__9_A__9_A__, new SubLObject[] { sbhl_graphs.$str41$___, sbhl_graphs.$str41$___, sbhl_graphs.$str41$___ });
                }
                else {
                    PrintLow.format((SubLObject)sbhl_graphs.T, (SubLObject)sbhl_graphs.$str42$_6_d__9_d__9_d_____A__, new SubLObject[] { capacity, hits, misses, (sbhl_graphs.NIL != too_small_p) ? sbhl_graphs.$str43$___ : sbhl_graphs.$str44$ });
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_graphs.$list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate2 = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 17300L)
    public static SubLObject stress_test_sbhl_graph_concurrent_swapping(SubLObject checker_count, SubLObject term_count) {
        if (checker_count == sbhl_graphs.UNPROVIDED) {
            checker_count = sbhl_graphs.$default_number_of_concurrent_readers$.getGlobalValue();
        }
        if (term_count == sbhl_graphs.UNPROVIDED) {
            term_count = sbhl_graphs.$default_number_of_terms_checked$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue((SubLObject)sbhl_graphs.$str46$Concurrent_Reads_Stress_Test_Prob);
        SubLObject checkers = (SubLObject)sbhl_graphs.NIL;
        SubLObject issue_list = (SubLObject)sbhl_graphs.NIL;
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = (SubLObject)sbhl_graphs.NIL, i = (SubLObject)sbhl_graphs.ZERO_INTEGER; i.numL(checker_count); i = Numbers.add(i, (SubLObject)sbhl_graphs.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)sbhl_graphs.$str47$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)sbhl_graphs.ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, (SubLObject)sbhl_graphs.$sym48$STRESS_TEST_READ_RANDOMLY_FROM_SBHL, (SubLObject)ConsesLow.list(term_count, problem_queue));
            Threads.sleep((SubLObject)sbhl_graphs.$float49$0_1);
            checkers = (SubLObject)ConsesLow.cons(checker, checkers);
        }
        while (Sequences.position_if((SubLObject)sbhl_graphs.$sym50$VALID_PROCESS_P, checkers, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)sbhl_graphs.ONE_INTEGER);
        }
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = (SubLObject)ConsesLow.cons(process_utilities.ipc_dequeue(problem_queue, (SubLObject)sbhl_graphs.UNPROVIDED), issue_list);
        }
        if (sbhl_graphs.NIL != list_utilities.sublisp_boolean(issue_list)) {
            swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 18698L)
    public static SubLObject stress_test_read_randomly_from_sbhl(final SubLObject term_count, final SubLObject problem_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        SubLObject curr_term;
        SubLObject error_message;
        SubLObject _prev_bind_0;
        for (i = (SubLObject)sbhl_graphs.NIL, i = (SubLObject)sbhl_graphs.ZERO_INTEGER; i.numL(term_count); i = Numbers.add(i, (SubLObject)sbhl_graphs.ONE_INTEGER)) {
            curr_term = constants_high.random_constant((SubLObject)sbhl_graphs.UNPROVIDED);
            error_message = (SubLObject)sbhl_graphs.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)sbhl_graphs.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        isa.isa_in_any_mtP(curr_term, sbhl_graphs.$const52$Individual);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sbhl_graphs.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (error_message.isString()) {
                process_utilities.ipc_enqueue((SubLObject)ConsesLow.cons(curr_term, error_message), problem_queue, (SubLObject)sbhl_graphs.UNPROVIDED);
            }
        }
        return (SubLObject)sbhl_graphs.$kw25$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 19088L)
    public static SubLObject stress_test_sbhl_graph_concurrent_cache_strategy_update(SubLObject checker_count) {
        if (checker_count == sbhl_graphs.UNPROVIDED) {
            checker_count = sbhl_graphs.$default_number_of_concurrent_readers$.getGlobalValue();
        }
        final SubLObject problem_queue = process_utilities.new_ipc_queue((SubLObject)sbhl_graphs.$str53$Concurrent_Cache_Strategy_Stress_);
        SubLObject checkers = (SubLObject)sbhl_graphs.NIL;
        SubLObject issue_list = (SubLObject)sbhl_graphs.NIL;
        final SubLObject term_list = (SubLObject)sbhl_graphs.$list54;
        final SubLObject process_args = (SubLObject)ConsesLow.list(checker_count, term_list, problem_queue);
        SubLObject i;
        SubLObject name;
        SubLObject checker;
        for (i = (SubLObject)sbhl_graphs.NIL, i = (SubLObject)sbhl_graphs.ZERO_INTEGER; i.numL(checker_count); i = Numbers.add(i, (SubLObject)sbhl_graphs.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)sbhl_graphs.$str47$Concurrent_SBHL_Reader_, format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)sbhl_graphs.ONE_INTEGER, i)));
            checker = subl_promotions.make_process_with_args(name, (SubLObject)sbhl_graphs.$sym55$STRESS_TEST_CHECK_SAME_SPECS, process_args);
            Threads.sleep((SubLObject)sbhl_graphs.$float49$0_1);
            checkers = (SubLObject)ConsesLow.cons(checker, checkers);
        }
        while (Sequences.position_if((SubLObject)sbhl_graphs.$sym50$VALID_PROCESS_P, checkers, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED, (SubLObject)sbhl_graphs.UNPROVIDED).isNumber()) {
            Threads.sleep((SubLObject)sbhl_graphs.ONE_INTEGER);
        }
        while (process_utilities.ipc_current_queue_size(problem_queue).isPositive()) {
            issue_list = (SubLObject)ConsesLow.cons(process_utilities.ipc_dequeue(problem_queue, (SubLObject)sbhl_graphs.UNPROVIDED), issue_list);
        }
        if (sbhl_graphs.NIL != list_utilities.sublisp_boolean(issue_list)) {
            swap_out_all_pristine_sbhl_module_graph_links();
        }
        return issue_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-graphs.lisp", position = 20309L)
    public static SubLObject stress_test_check_same_specs(final SubLObject attempts, final SubLObject term_list, final SubLObject problem_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problems = (SubLObject)sbhl_graphs.NIL;
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = (SubLObject)sbhl_graphs.NIL;
        v_term = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            SubLObject count;
            SubLObject error_message;
            SubLObject _prev_bind_0;
            for (count = (SubLObject)sbhl_graphs.NIL, count = (SubLObject)sbhl_graphs.ZERO_INTEGER; count.numL(attempts); count = Numbers.add(count, (SubLObject)sbhl_graphs.ONE_INTEGER)) {
                error_message = (SubLObject)sbhl_graphs.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sbhl_graphs.$sym51$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            genls.all_specs(v_term, sbhl_graphs.$const56$InferencePSC, (SubLObject)sbhl_graphs.UNPROVIDED);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sbhl_graphs.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString()) {
                    problems = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, count, error_message), problems);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = Sequences.nreverse(problems);
        SubLObject problem = (SubLObject)sbhl_graphs.NIL;
        problem = cdolist_list_var.first();
        while (sbhl_graphs.NIL != cdolist_list_var) {
            process_utilities.ipc_enqueue(problem, problem_queue, (SubLObject)sbhl_graphs.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_graphs.$kw25$DONE;
    }
    
    public static SubLObject declare_sbhl_graphs_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "optimize_sbhl_store", "OPTIMIZE-SBHL-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "sbhl_graph_object_p", "SBHL-GRAPH-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "make_new_sbhl_graph", "MAKE-NEW-SBHL-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "clear_sbhl_graph", "CLEAR-SBHL-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "initialize_sbhl_graph_caches", "INITIALIZE-SBHL-GRAPH-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "initialize_sbhl_graph_caches_file_vector", "INITIALIZE-SBHL-GRAPH-CACHES-FILE-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "sbhl_change_stream_buffer_sizes", "SBHL-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "sbhl_enable_memory_mapping", "SBHL-ENABLE-MEMORY-MAPPING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "new_cache_strategy_for_sbhl_module", "NEW-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_cache_strategy_for_sbhl_module", "GET-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "set_cache_strategy_for_sbhl_module", "SET-CACHE-STRATEGY-FOR-SBHL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "cache_capacity_for_cache_strategy_for_sbhl_module", "CACHE-CAPACITY-FOR-CACHE-STRATEGY-FOR-SBHL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "initialize_sbhl_graph_caches_during_load_kb", "INITIALIZE-SBHL-GRAPH-CACHES-DURING-LOAD-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "sbhl_graph_completely_cachedP", "SBHL-GRAPH-COMPLETELY-CACHED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_module_caching_ratio", "GET-SBHL-MODULE-CACHING-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_modules_caching_ratios", "GET-SBHL-MODULES-CACHING-RATIOS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_graph_link_from_graph", "GET-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "put_sbhl_graph_link_into_graph", "PUT-SBHL-GRAPH-LINK-INTO-GRAPH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "remove_sbhl_graph_link_from_graph", "REMOVE-SBHL-GRAPH-LINK-FROM-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "touch_sbhl_link_graph", "TOUCH-SBHL-LINK-GRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_graph_link", "GET-SBHL-GRAPH-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "set_sbhl_graph_link", "SET-SBHL-GRAPH-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "touch_sbhl_graph_link", "TOUCH-SBHL-GRAPH-LINK", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "logging_tag_for_module", "LOGGING-TAG-FOR-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "remove_sbhl_graph_link", "REMOVE-SBHL-GRAPH-LINK", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "do_sbhl_graph_links", "DO-SBHL-GRAPH-LINKS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "swap_in_all_graph_links", "SWAP-IN-ALL-GRAPH-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "swap_out_all_pristine_graph_links", "SWAP-OUT-ALL-PRISTINE-GRAPH-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "swap_out_all_pristine_sbhl_module_graph_links", "SWAP-OUT-ALL-PRISTINE-SBHL-MODULE-GRAPH-LINKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_module_cache_strategy_metrics", "GET-SBHL-MODULE-CACHE-STRATEGY-METRICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_all_sbhl_module_cache_strategy_metrics", "GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "get_sbhl_module_cache_strategy_information", "GET-SBHL-MODULE-CACHE-STRATEGY-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "show_all_sbhl_module_cache_strategies", "SHOW-ALL-SBHL-MODULE-CACHE-STRATEGIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "stress_test_sbhl_graph_concurrent_swapping", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-SWAPPING", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "stress_test_read_randomly_from_sbhl", "STRESS-TEST-READ-RANDOMLY-FROM-SBHL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "stress_test_sbhl_graph_concurrent_cache_strategy_update", "STRESS-TEST-SBHL-GRAPH-CONCURRENT-CACHE-STRATEGY-UPDATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_graphs", "stress_test_check_same_specs", "STRESS-TEST-CHECK-SAME-SPECS", 3, 0, false);
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    public static SubLObject init_sbhl_graphs_file() {
        sbhl_graphs.$sbhl_graph_equality_test$ = SubLFiles.deflexical("*SBHL-GRAPH-EQUALITY-TEST*", Symbols.symbol_function((SubLObject)sbhl_graphs.EQL));
        sbhl_graphs.$sbhl_backing_file_vector$ = SubLFiles.deflexical("*SBHL-BACKING-FILE-VECTOR*", (SubLObject)((sbhl_graphs.NIL != Symbols.boundp((SubLObject)sbhl_graphs.$sym0$_SBHL_BACKING_FILE_VECTOR_)) ? sbhl_graphs.$sbhl_backing_file_vector$.getGlobalValue() : sbhl_graphs.NIL));
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$ = SubLFiles.deflexical("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*", (SubLObject)((sbhl_graphs.NIL != Symbols.boundp((SubLObject)sbhl_graphs.$sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_)) ? sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$.getGlobalValue() : sbhl_graphs.NIL));
        sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$ = SubLFiles.defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-SIZE-PERCENTAGE*", (SubLObject)sbhl_graphs.TWO_INTEGER);
        sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$ = SubLFiles.defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-MINIMUM-SIZE*", (SubLObject)sbhl_graphs.$int2$100);
        sbhl_graphs.$sbhl_backing_file_vector_cache_gather_cache_metricsP$ = SubLFiles.defparameter("*SBHL-BACKING-FILE-VECTOR-CACHE-GATHER-CACHE-METRICS?*", (SubLObject)sbhl_graphs.T);
        sbhl_graphs.$sbhl_file_vector_data_stream_lock$ = SubLFiles.deflexical("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*", (sbhl_graphs.NIL != Symbols.boundp((SubLObject)sbhl_graphs.$sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_)) ? sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue() : Locks.make_lock((SubLObject)sbhl_graphs.$str4$SBHL_File_Vector_Data_Stream_lock));
        sbhl_graphs.$sbhl_backing_file_vector_cache_constructor$ = SubLFiles.deflexical("*SBHL-BACKING-FILE-VECTOR-CACHE-CONSTRUCTOR*", (SubLObject)sbhl_graphs.$sym5$NEW_METERED_PREALLOCATED_CACHE);
        sbhl_graphs.$override_sbhl_isa_module_with_kb_lookupP$ = SubLFiles.defparameter("*OVERRIDE-SBHL-ISA-MODULE-WITH-KB-LOOKUP?*", (SubLObject)sbhl_graphs.NIL);
        sbhl_graphs.$default_number_of_concurrent_readers$ = SubLFiles.deflexical("*DEFAULT-NUMBER-OF-CONCURRENT-READERS*", (SubLObject)sbhl_graphs.TWENTY_INTEGER);
        sbhl_graphs.$default_number_of_terms_checked$ = SubLFiles.deflexical("*DEFAULT-NUMBER-OF-TERMS-CHECKED*", (SubLObject)sbhl_graphs.$int45$500);
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    public static SubLObject setup_sbhl_graphs_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_graphs.$sym0$_SBHL_BACKING_FILE_VECTOR_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_graphs.$sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_graphs.$sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_);
        return (SubLObject)sbhl_graphs.NIL;
    }
    
    public void declareFunctions() {
        declare_sbhl_graphs_file();
    }
    
    public void initializeVariables() {
        init_sbhl_graphs_file();
    }
    
    public void runTopLevelForms() {
        setup_sbhl_graphs_file();
    }
    
    static {
        me = (SubLFile)new sbhl_graphs();
        sbhl_graphs.$sbhl_graph_equality_test$ = null;
        sbhl_graphs.$sbhl_backing_file_vector$ = null;
        sbhl_graphs.$sbhl_backing_file_vector_caches_for_modules$ = null;
        sbhl_graphs.$sbhl_backing_file_vector_cache_size_percentage$ = null;
        sbhl_graphs.$sbhl_backing_file_vector_cache_minimum_size$ = null;
        sbhl_graphs.$sbhl_backing_file_vector_cache_gather_cache_metricsP$ = null;
        sbhl_graphs.$sbhl_file_vector_data_stream_lock$ = null;
        sbhl_graphs.$sbhl_backing_file_vector_cache_constructor$ = null;
        sbhl_graphs.$override_sbhl_isa_module_with_kb_lookupP$ = null;
        sbhl_graphs.$default_number_of_concurrent_readers$ = null;
        sbhl_graphs.$default_number_of_terms_checked$ = null;
        $sym0$_SBHL_BACKING_FILE_VECTOR_ = SubLObjectFactory.makeSymbol("*SBHL-BACKING-FILE-VECTOR*");
        $sym1$_SBHL_BACKING_FILE_VECTOR_CACHES_FOR_MODULES_ = SubLObjectFactory.makeSymbol("*SBHL-BACKING-FILE-VECTOR-CACHES-FOR-MODULES*");
        $int2$100 = SubLObjectFactory.makeInteger(100);
        $sym3$_SBHL_FILE_VECTOR_DATA_STREAM_LOCK_ = SubLObjectFactory.makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*");
        $str4$SBHL_File_Vector_Data_Stream_lock = SubLObjectFactory.makeString("SBHL File Vector Data Stream lock");
        $sym5$NEW_METERED_PREALLOCATED_CACHE = SubLObjectFactory.makeSymbol("NEW-METERED-PREALLOCATED-CACHE");
        $str6$sbhl_module_graphs = SubLObjectFactory.makeString("sbhl-module-graphs");
        $str7$cfasl = SubLObjectFactory.makeString("cfasl");
        $str8$sbhl_module_graphs_index = SubLObjectFactory.makeString("sbhl-module-graphs-index");
        $kw9$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $kw10$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym11$CACHE_STRATEGY_OR_SYMBOL_P = SubLObjectFactory.makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");
        $sym12$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $kw13$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str14$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym15$SBHL_DIRECTION_LINK_P = SubLObjectFactory.makeSymbol("SBHL-DIRECTION-LINK-P");
        $kw16$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str17$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw18$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str19$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $sym20$SBHL_NODE_OBJECT_P = SubLObjectFactory.makeSymbol("SBHL-NODE-OBJECT-P");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw23$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw24$MODULE = SubLObjectFactory.makeKeyword("MODULE");
        $kw25$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym26$MAP = SubLObjectFactory.makeUninternedSymbol("MAP");
        $sym27$WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = SubLObjectFactory.makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-FILE-VECTOR-DATA-STREAM-LOCK*"));
        $sym29$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE"));
        $sym31$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym32$GET_SBHL_GRAPH = SubLObjectFactory.makeSymbol("GET-SBHL-GRAPH");
        $sym33$DO_FILE_VECTOR_BACKED_MAP = SubLObjectFactory.makeSymbol("DO-FILE-VECTOR-BACKED-MAP");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("IMPL-VALUE"));
        $str35$Capacity______Hits____Misses__Sma = SubLObjectFactory.makeString("Capacity      Hits    Misses  Small?~%");
        $str36$_________________________________ = SubLObjectFactory.makeString("------------------------------------~%");
        $sym37$FORT__ = SubLObjectFactory.makeSymbol("FORT-<");
        $str38$___A = SubLObjectFactory.makeString("~&~A");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-AGAIN"), (SubLObject)SubLObjectFactory.makeSymbol("CAPACITY"), (SubLObject)SubLObjectFactory.makeSymbol("HITS"), (SubLObject)SubLObjectFactory.makeSymbol("MISSES"), (SubLObject)SubLObjectFactory.makeSymbol("TOO-SMALL-P"));
        $str40$_6_A__9_A__9_A__ = SubLObjectFactory.makeString("~6,A ~9,A ~9,A~%");
        $str41$___ = SubLObjectFactory.makeString("---");
        $str42$_6_d__9_d__9_d_____A__ = SubLObjectFactory.makeString("~6,d ~9,d ~9,d    ~A~%");
        $str43$___ = SubLObjectFactory.makeString("!!!");
        $str44$ = SubLObjectFactory.makeString("");
        $int45$500 = SubLObjectFactory.makeInteger(500);
        $str46$Concurrent_Reads_Stress_Test_Prob = SubLObjectFactory.makeString("Concurrent Reads Stress Test Problems");
        $str47$Concurrent_SBHL_Reader_ = SubLObjectFactory.makeString("Concurrent SBHL Reader ");
        $sym48$STRESS_TEST_READ_RANDOMLY_FROM_SBHL = SubLObjectFactory.makeSymbol("STRESS-TEST-READ-RANDOMLY-FROM-SBHL");
        $float49$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $sym50$VALID_PROCESS_P = SubLObjectFactory.makeSymbol("VALID-PROCESS-P");
        $sym51$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $const52$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $str53$Concurrent_Cache_Strategy_Stress_ = SubLObjectFactory.makeString("Concurrent Cache Strategy Stress Test Problems");
        $list54 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organism")));
        $sym55$STRESS_TEST_CHECK_SAME_SPECS = SubLObjectFactory.makeSymbol("STRESS-TEST-CHECK-SAME-SPECS");
        $const56$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
    }
}

/*

	Total time: 287 ms
	
*/