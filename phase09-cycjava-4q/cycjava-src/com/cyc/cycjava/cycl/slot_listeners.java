package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class slot_listeners extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.slot_listeners";
    public static final String myFingerPrint = "8c9e62e466ab9e99c7423993df16a3f7a6cfd2629db56512b6775c2408d403b4";
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1219L)
    private static SubLSymbol $slot_listeners_slot_trigger_types$;
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1306L)
    private static SubLSymbol $slot_listeners_registry_types$;
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1408L)
    private static SubLSymbol $slot_listeners_valid_demon_types$;
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 5079L)
    public static SubLSymbol $active_slot_listener$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$VALUE;
    private static final SubLSymbol $kw4$RANGE;
    private static final SubLSymbol $kw5$ENUM;
    private static final SubLString $str6$Cannot_fire_slot_listeners_of_slo;
    private static final SubLString $str7$_S_is_not_a_valid_registry_type_;
    private static final SubLSymbol $kw8$SLOT_GETTER_REGISTRY;
    private static final SubLSymbol $kw9$SLOT_SETTER_REGISTRY;
    private static final SubLString $str10$Cannot_add_a_slot_listener_to_ill;
    private static final SubLSymbol $sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT;
    private static final SubLString $str12$Cannot_add_listener__S_of_instanc;
    private static final SubLSymbol $kw13$GET;
    private static final SubLSymbol $kw14$SET;
    private static final SubLString $str15$Cannot_add_a_slot_listener_to_inv;
    private static final SubLString $str16$_S_is_not_a_valid_slot_listener_t;
    private static final SubLString $str17$Slot_listener_functions_and_metho;
    private static final SubLString $str18$Slot_listener_targets_must_be_val;
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1479L)
    public static SubLObject slot_listeners_valid_slot_trigger_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((slot_listeners.NIL != conses_high.member(v_object, slot_listeners.$slot_listeners_slot_trigger_types$.getDynamicValue(thread), (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED)) ? slot_listeners.T : slot_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1621L)
    public static SubLObject slot_listeners_valid_slot_registry_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((slot_listeners.NIL != conses_high.member(v_object, slot_listeners.$slot_listeners_registry_types$.getDynamicValue(thread), (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED)) ? slot_listeners.T : slot_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1760L)
    public static SubLObject slot_listeners_valid_demon_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((slot_listeners.NIL != conses_high.member(v_object, slot_listeners.$slot_listeners_valid_demon_types$.getDynamicValue(thread), (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED)) ? slot_listeners.T : slot_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 1894L)
    public static SubLObject slot_listeners_add_registry(final SubLObject instance_to_modify, final SubLObject registry_type) {
        if (slot_listeners.NIL != subloop_structures.instance_p(instance_to_modify)) {
            final SubLObject new_slot_listener_registry = subloop_structures.make_slot_listener_registry((SubLObject)slot_listeners.UNPROVIDED);
            final SubLObject v_class_$1;
            final SubLObject v_class = v_class_$1 = subloop_structures.instance_class(instance_to_modify);
            final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class_$1);
            final SubLObject slot_listener_registry = new_slot_listener_registry;
            SubLObject instance_$2 = subloop_structures.slr_instance(slot_listener_registry);
            SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            try {
                instance_$2 = instance_to_modify;
                slot_count = Sequences.length(compiled_instance_slot_access_alist);
                if (slot_count.numG((SubLObject)slot_listeners.ZERO_INTEGER)) {
                    listeners_vector = Vectors.make_vector(slot_count, (SubLObject)slot_listeners.UNPROVIDED);
                    SubLObject index;
                    for (index = (SubLObject)slot_listeners.NIL, index = (SubLObject)slot_listeners.ZERO_INTEGER; index.numL(slot_count); index = Numbers.add(index, (SubLObject)slot_listeners.ONE_INTEGER)) {
                        Vectors.set_aref(listeners_vector, index, (SubLObject)slot_listeners.NIL);
                    }
                }
                else {
                    listeners_vector = (SubLObject)slot_listeners.NIL;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)slot_listeners.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_slr_instance(slot_listener_registry, instance_$2);
                    subloop_structures._csetf_slr_slot_count(slot_listener_registry, slot_count);
                    subloop_structures._csetf_slr_listeners_vector(slot_listener_registry, listeners_vector);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            instances.instance_set_property(instance_to_modify, registry_type, new_slot_listener_registry);
            return new_slot_listener_registry;
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 2682L)
    public static SubLObject slot_listeners_get_registry(final SubLObject instance, final SubLObject registry_type) {
        if (slot_listeners.NIL != subloop_structures.instance_p(instance)) {
            return classes.classes_getf(subloop_structures.instance_plist(instance), registry_type);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 2865L)
    public static SubLObject slot_listeners_value_trigger_type(final SubLObject value_trigger) {
        if (slot_listeners.NIL == value_trigger) {
            return (SubLObject)slot_listeners.NIL;
        }
        if (value_trigger.isCons()) {
            return value_trigger.first();
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 3044L)
    public static SubLObject slot_listeners_value_trigger_value(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == slot_listeners.$kw3$VALUE) {
            return value_trigger.rest();
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 3227L)
    public static SubLObject slot_listeners_value_trigger_range(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == slot_listeners.$kw4$RANGE) {
            final SubLObject range = value_trigger.rest();
            return Values.values(range.first(), range.rest());
        }
        return Values.values((SubLObject)slot_listeners.NIL, (SubLObject)slot_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 3479L)
    public static SubLObject slot_listeners_value_trigger_enum(final SubLObject value_trigger) {
        if (slot_listeners_value_trigger_type(value_trigger) == slot_listeners.$kw5$ENUM) {
            return value_trigger.rest();
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 3660L)
    public static SubLObject slot_listeners_slot_listener_match_p(final SubLObject slot_listener, final SubLObject target_slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject slot_name = subloop_structures.sl_slot_name(slot_listener);
        final SubLObject value_trigger = subloop_structures.sl_value_trigger(slot_listener);
        if (!slot_name.eql(target_slot_name)) {
            return (SubLObject)slot_listeners.NIL;
        }
        final SubLObject pcase_var = slot_listeners_value_trigger_type(value_trigger);
        if (pcase_var.eql((SubLObject)slot_listeners.NIL)) {
            return (SubLObject)slot_listeners.T;
        }
        if (pcase_var.eql((SubLObject)slot_listeners.$kw3$VALUE)) {
            return Equality.equal(slot_listeners_value_trigger_value(value_trigger), target_slot_value);
        }
        if (pcase_var.eql((SubLObject)slot_listeners.$kw4$RANGE)) {
            thread.resetMultipleValues();
            final SubLObject low_bound = slot_listeners_value_trigger_range(value_trigger);
            final SubLObject upper_bound = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values_are_strings = (SubLObject)SubLObjectFactory.makeBoolean(low_bound.isString() && upper_bound.isString() && target_slot_value.isString());
            final SubLObject values_are_numbers = (SubLObject)SubLObjectFactory.makeBoolean(low_bound.isNumber() && upper_bound.isNumber() && target_slot_value.isNumber());
            final SubLObject values_are_characters = (SubLObject)SubLObjectFactory.makeBoolean(low_bound.isChar() && upper_bound.isChar() && target_slot_value.isChar());
            if (slot_listeners.NIL != values_are_strings) {
                return (SubLObject)SubLObjectFactory.makeBoolean(slot_listeners.NIL != Strings.stringGE(target_slot_value, low_bound, (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED) && slot_listeners.NIL != Strings.stringLE(target_slot_value, upper_bound));
            }
            if (slot_listeners.NIL != values_are_numbers) {
                return (SubLObject)SubLObjectFactory.makeBoolean(target_slot_value.numGE(low_bound) && target_slot_value.numLE(upper_bound));
            }
            if (slot_listeners.NIL != values_are_characters) {
                return (SubLObject)SubLObjectFactory.makeBoolean(slot_listeners.NIL != Characters.charGE(target_slot_value, low_bound) && slot_listeners.NIL != Characters.charLE(target_slot_value, upper_bound));
            }
            return (SubLObject)slot_listeners.NIL;
        }
        else {
            if (pcase_var.eql((SubLObject)slot_listeners.$kw5$ENUM)) {
                final SubLObject v_enum = slot_listeners_value_trigger_enum(value_trigger);
                return (SubLObject)((slot_listeners.NIL != conses_high.member(target_slot_value, v_enum, Symbols.symbol_function((SubLObject)slot_listeners.EQUAL), (SubLObject)slot_listeners.UNPROVIDED)) ? slot_listeners.T : slot_listeners.NIL);
            }
            return (SubLObject)slot_listeners.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 5216L)
    public static SubLObject slot_listeners_fire_slot_listener(final SubLObject slot_listener, final SubLObject instance, final SubLObject target_slot_value) {
        final SubLObject functional_type = subloop_structures.sl_functional_type(slot_listener);
        final SubLObject isa_method = subloop_structures.sl_isa_method(slot_listener);
        final SubLObject target_instance = subloop_structures.sl_target_instance(slot_listener);
        if (slot_listeners.NIL != isa_method) {
            if (slot_listeners.NIL != functional_type && slot_listeners.NIL != target_instance) {
                return methods.funcall_instance_method_with_2_args(target_instance, functional_type, instance, target_slot_value);
            }
        }
        else if (slot_listeners.NIL != functional_type) {
            if (slot_listeners.NIL != target_instance) {
                return Functions.funcall(functional_type, target_instance, instance, target_slot_value);
            }
            return Functions.funcall(functional_type, instance, target_slot_value);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 5726L)
    public static SubLObject slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(final SubLObject registry, final SubLObject slot_name, final SubLObject slot_index, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject instance = subloop_structures.slr_instance(registry);
        final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(registry);
        SubLObject cdolist_list_var;
        final SubLObject listeners_at_index = cdolist_list_var = Vectors.aref(listeners_vector, slot_index);
        SubLObject listener = (SubLObject)slot_listeners.NIL;
        listener = cdolist_list_var.first();
        while (slot_listeners.NIL != cdolist_list_var) {
            if (slot_listeners.NIL != slot_listeners_slot_listener_match_p(listener, slot_name, target_slot_value)) {
                final SubLObject _prev_bind_0 = slot_listeners.$active_slot_listener$.currentBinding(thread);
                try {
                    slot_listeners.$active_slot_listener$.bind(listener, thread);
                    slot_listeners_fire_slot_listener(listener, instance, target_slot_value);
                }
                finally {
                    slot_listeners.$active_slot_listener$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        }
        return (SubLObject)slot_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 6236L)
    public static SubLObject slot_listeners_fast_fire_all_slot_listeners(final SubLObject instance, final SubLObject registry_type, final SubLObject slot_name, final SubLObject slot_index, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_listeners_valid_slot_registry_type_p(registry_type)) {
            Errors.error((SubLObject)slot_listeners.$str7$_S_is_not_a_valid_registry_type_, registry_type);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, registry_type);
        if (slot_listeners.NIL != registry) {
            slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
            return (SubLObject)slot_listeners.T;
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 6854L)
    public static SubLObject slot_listeners_fire_all_get_slot_listeners(final SubLObject instance, final SubLObject slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
        if (slot_listeners.NIL != registry) {
            SubLObject slot_index = (SubLObject)slot_listeners.NIL;
            final SubLObject v_class = subloop_structures.instance_class(instance);
            final SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
            if (slot_listeners.NIL != association) {
                slot_index = slots.slot_index(association);
            }
            if (slot_listeners.NIL != slot_index) {
                slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
                return (SubLObject)slot_listeners.T;
            }
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 7572L)
    public static SubLObject slot_listeners_fire_all_set_slot_listeners(final SubLObject instance, final SubLObject slot_name, final SubLObject target_slot_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str6$Cannot_fire_slot_listeners_of_slo, slot_name, instance);
        }
        final SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
        if (slot_listeners.NIL != registry) {
            SubLObject slot_index = (SubLObject)slot_listeners.NIL;
            final SubLObject v_class = subloop_structures.instance_class(instance);
            final SubLObject association = slots.slot_assoc(slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
            if (slot_listeners.NIL != association) {
                slot_index = slots.slot_index(association);
            }
            if (slot_listeners.NIL != slot_index) {
                slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value(registry, slot_name, slot_index, target_slot_value);
                return (SubLObject)slot_listeners.T;
            }
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 8290L)
    public static SubLObject slot_listeners_new_slot_listener_internal(final SubLObject slot_listener_registry, final SubLObject new_demon_type, final SubLObject new_slot_name, final SubLObject new_slot_index, final SubLObject new_function, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject new_value_trigger_type, SubLObject low_bound_value_or_values, SubLObject new_upper_bound) {
        if (low_bound_value_or_values == slot_listeners.UNPROVIDED) {
            low_bound_value_or_values = (SubLObject)slot_listeners.NIL;
        }
        if (new_upper_bound == slot_listeners.UNPROVIDED) {
            new_upper_bound = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)slot_listeners.NIL;
        final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
        final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
        try {
            if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!new_slot_index.numGE((SubLObject)slot_listeners.ZERO_INTEGER) || !new_slot_index.numL(slot_count))) {
                Errors.error((SubLObject)slot_listeners.$str10$Cannot_add_a_slot_listener_to_ill, new_slot_name, new_target_instance);
            }
            final SubLObject listener_list = Vectors.aref(listeners_vector, new_slot_index);
            SubLObject redundant_listener = (SubLObject)slot_listeners.NIL;
            try {
                thread.throwStack.push(slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT);
                SubLObject cdolist_list_var = listener_list;
                SubLObject listener = (SubLObject)slot_listeners.NIL;
                listener = cdolist_list_var.first();
                while (slot_listeners.NIL != cdolist_list_var) {
                    final SubLObject slot_listener = listener;
                    final SubLObject slot_name = subloop_structures.sl_slot_name(slot_listener);
                    final SubLObject demon_type = subloop_structures.sl_demon_type(slot_listener);
                    final SubLObject value_trigger = subloop_structures.sl_value_trigger(slot_listener);
                    final SubLObject functional_type = subloop_structures.sl_functional_type(slot_listener);
                    final SubLObject isa_method = subloop_structures.sl_isa_method(slot_listener);
                    final SubLObject target_instance = subloop_structures.sl_target_instance(slot_listener);
                    if (slot_name.eql(new_slot_name) && slot_listeners.NIL != ((slot_listeners.NIL != isa_method) ? Equality.eq(functional_type, new_method) : Equality.eq(functional_type, new_function)) && target_instance.eql(new_target_instance) && new_demon_type.eql(demon_type)) {
                        final SubLObject value_trigger_type = slot_listeners_value_trigger_type(value_trigger);
                        if (value_trigger_type.eql(new_value_trigger_type)) {
                            final SubLObject pcase_var = value_trigger_type;
                            if (pcase_var.eql((SubLObject)slot_listeners.NIL)) {
                                if (slot_listeners.NIL == low_bound_value_or_values) {
                                    Dynamic.sublisp_throw((SubLObject)slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, (SubLObject)slot_listeners.T);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)slot_listeners.$kw3$VALUE)) {
                                if (slot_listeners_value_trigger_value(value_trigger).equal(low_bound_value_or_values)) {
                                    Dynamic.sublisp_throw((SubLObject)slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, (SubLObject)slot_listeners.T);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)slot_listeners.$kw4$RANGE)) {
                                thread.resetMultipleValues();
                                final SubLObject low_bound = slot_listeners_value_trigger_range(value_trigger);
                                final SubLObject upper_bound = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (low_bound.equal(low_bound_value_or_values) && upper_bound.equal(new_upper_bound)) {
                                    Dynamic.sublisp_throw((SubLObject)slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, (SubLObject)slot_listeners.T);
                                }
                            }
                            else if (pcase_var.eql((SubLObject)slot_listeners.$kw5$ENUM)) {
                                final SubLObject enumeration = slot_listeners_value_trigger_enum(value_trigger);
                                if (slot_listeners.NIL != conses_high.set_difference(enumeration, low_bound_value_or_values, Symbols.symbol_function((SubLObject)slot_listeners.EQUAL), (SubLObject)slot_listeners.UNPROVIDED) || slot_listeners.NIL != conses_high.set_difference(low_bound_value_or_values, enumeration, Symbols.symbol_function((SubLObject)slot_listeners.EQUAL), (SubLObject)slot_listeners.UNPROVIDED)) {
                                    Dynamic.sublisp_throw((SubLObject)slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT, (SubLObject)slot_listeners.T);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                }
            }
            catch (Throwable ccatch_env_var) {
                redundant_listener = Errors.handleThrowable(ccatch_env_var, (SubLObject)slot_listeners.$sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT);
            }
            finally {
                thread.throwStack.pop();
            }
            if (slot_listeners.NIL == redundant_listener) {
                final SubLObject slot_listener2;
                final SubLObject new_listener = slot_listener2 = subloop_structures.make_slot_listener((SubLObject)slot_listeners.UNPROVIDED);
                SubLObject slot_name2 = subloop_structures.sl_slot_name(slot_listener2);
                SubLObject demon_type2 = subloop_structures.sl_demon_type(slot_listener2);
                SubLObject value_trigger2 = subloop_structures.sl_value_trigger(slot_listener2);
                SubLObject functional_type2 = subloop_structures.sl_functional_type(slot_listener2);
                SubLObject isa_method2 = subloop_structures.sl_isa_method(slot_listener2);
                SubLObject target_instance2 = subloop_structures.sl_target_instance(slot_listener2);
                try {
                    slot_name2 = new_slot_name;
                    demon_type2 = new_demon_type;
                    if (new_value_trigger_type == slot_listeners.$kw4$RANGE) {
                        value_trigger2 = (SubLObject)ConsesLow.listS((SubLObject)slot_listeners.$kw4$RANGE, low_bound_value_or_values, new_upper_bound);
                    }
                    else {
                        value_trigger2 = (SubLObject)ConsesLow.cons(new_value_trigger_type, low_bound_value_or_values);
                    }
                    if (slot_listeners.NIL != new_function) {
                        functional_type2 = new_function;
                        isa_method2 = (SubLObject)((slot_listeners.NIL != target_instance2) ? slot_listeners.T : slot_listeners.NIL);
                    }
                    else if (slot_listeners.NIL != new_method) {
                        functional_type2 = new_method;
                        isa_method2 = (SubLObject)slot_listeners.T;
                    }
                    target_instance2 = new_target_instance;
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)slot_listeners.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        subloop_structures._csetf_sl_slot_name(slot_listener2, slot_name2);
                        subloop_structures._csetf_sl_demon_type(slot_listener2, demon_type2);
                        subloop_structures._csetf_sl_value_trigger(slot_listener2, value_trigger2);
                        subloop_structures._csetf_sl_functional_type(slot_listener2, functional_type2);
                        subloop_structures._csetf_sl_isa_method(slot_listener2, isa_method2);
                        subloop_structures._csetf_sl_target_instance(slot_listener2, target_instance2);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                Vectors.set_aref(listeners_vector, new_slot_index, (SubLObject)ConsesLow.cons(new_listener, listener_list));
                result = new_listener;
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)slot_listeners.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                subloop_structures._csetf_slr_slot_count(slot_listener_registry, slot_count);
                subloop_structures._csetf_slr_listeners_vector(slot_listener_registry, listeners_vector);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 11271L)
    public static SubLObject slot_listeners_new_slot_listener_method_internal(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_demon_type, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject new_value_trigger_type, SubLObject low_bound_value_or_values, SubLObject new_upper_bound) {
        if (low_bound_value_or_values == slot_listeners.UNPROVIDED) {
            low_bound_value_or_values = (SubLObject)slot_listeners.NIL;
        }
        if (new_upper_bound == slot_listeners.UNPROVIDED) {
            new_upper_bound = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject slot_index = (SubLObject)slot_listeners.NIL;
        SubLObject resolved_method = (SubLObject)slot_listeners.NIL;
        SubLObject v_class = subloop_structures.instance_class(new_instance);
        final SubLObject slot_association = slots.slot_assoc(new_slot_name, subloop_structures.class_compiled_instance_slot_access_alist(v_class));
        if (slot_listeners.NIL != slot_association) {
            slot_index = slots.slot_index(slot_association);
        }
        v_class = subloop_structures.instance_class(new_target_instance);
        final SubLObject method_association = methods.method_assoc(new_method, subloop_structures.class_compiled_instance_method_access_alist(v_class));
        if (slot_listeners.NIL != method_association) {
            resolved_method = subloop_structures.method_function_name(method_association);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_index) {
            Errors.error((SubLObject)slot_listeners.$str12$Cannot_add_listener__S_of_instanc, new SubLObject[] { new_method, new_target_instance, new_slot_name, new_instance });
        }
        return (slot_listeners.NIL != resolved_method) ? slot_listeners_new_slot_listener_internal(slot_listener_registry, new_demon_type, new_slot_name, slot_index, resolved_method, (SubLObject)slot_listeners.NIL, new_target_instance, new_value_trigger_type, low_bound_value_or_values, new_upper_bound) : slot_listeners_new_slot_listener_internal(slot_listener_registry, new_demon_type, new_slot_name, slot_index, (SubLObject)slot_listeners.NIL, new_method, new_target_instance, new_value_trigger_type, low_bound_value_or_values, new_upper_bound);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 12740L)
    public static SubLObject slot_listeners_new_get_slot_listener_method_generic(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw13$GET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.NIL, (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 13049L)
    public static SubLObject slot_listeners_new_get_slot_listener_method_by_value(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw13$GET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw3$VALUE, target_value, (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 13389L)
    public static SubLObject slot_listeners_new_get_slot_listener_method_by_range(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value_lower_bound, final SubLObject target_value_upper_bound) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw13$GET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw4$RANGE, target_value_lower_bound, target_value_upper_bound);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 13810L)
    public static SubLObject slot_listeners_new_get_slot_listener_method_by_enum(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_enumeration) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw13$GET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw5$ENUM, conses_high.copy_list(target_enumeration), (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 14179L)
    public static SubLObject slot_listeners_new_set_slot_listener_method_generic(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw14$SET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.NIL, (SubLObject)slot_listeners.UNPROVIDED, (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 14488L)
    public static SubLObject slot_listeners_new_set_slot_listener_method_by_value(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw14$SET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw3$VALUE, target_value, (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 14828L)
    public static SubLObject slot_listeners_new_set_slot_listener_method_by_range(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_value_lower_bound, final SubLObject target_value_upper_bound) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw14$SET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw4$RANGE, target_value_lower_bound, target_value_upper_bound);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 15249L)
    public static SubLObject slot_listeners_new_set_slot_listener_method_by_enum(final SubLObject slot_listener_registry, final SubLObject new_instance, final SubLObject new_slot_name, final SubLObject new_method, final SubLObject new_target_instance, final SubLObject target_enumeration) {
        return slot_listeners_new_slot_listener_method_internal(slot_listener_registry, new_instance, (SubLObject)slot_listeners.$kw14$SET, new_slot_name, new_method, new_target_instance, (SubLObject)slot_listeners.$kw5$ENUM, conses_high.copy_list(target_enumeration), (SubLObject)slot_listeners.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 15618L)
    public static SubLObject add_generic_slot_listener(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method) {
        if (target_instance_if_method == slot_listeners.UNPROVIDED) {
            target_instance_if_method = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_listeners_valid_demon_type_p(type)) {
            Errors.error((SubLObject)slot_listeners.$str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !function_or_method.isSymbol()) {
            Errors.error((SubLObject)slot_listeners.$str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL != target_instance_if_method && slot_listeners.NIL == subloop_structures.instance_p(target_instance_if_method)) {
            Errors.error((SubLObject)slot_listeners.$str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql((SubLObject)slot_listeners.$kw13$GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_generic(registry, instance, slot, function_or_method, target_instance_if_method);
        }
        if (type.eql((SubLObject)slot_listeners.$kw14$SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_generic(registry, instance, slot, function_or_method, target_instance_if_method);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 17001L)
    public static SubLObject add_generic_slot_listener_stimulated_by_value(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject trigger_value) {
        if (target_instance_if_method == slot_listeners.UNPROVIDED) {
            target_instance_if_method = (SubLObject)slot_listeners.NIL;
        }
        if (trigger_value == slot_listeners.UNPROVIDED) {
            trigger_value = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_listeners_valid_demon_type_p(type)) {
            Errors.error((SubLObject)slot_listeners.$str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !function_or_method.isSymbol()) {
            Errors.error((SubLObject)slot_listeners.$str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL != target_instance_if_method && slot_listeners.NIL == subloop_structures.instance_p(target_instance_if_method)) {
            Errors.error((SubLObject)slot_listeners.$str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql((SubLObject)slot_listeners.$kw13$GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_value(registry, instance, slot, function_or_method, target_instance_if_method, trigger_value);
        }
        if (type.eql((SubLObject)slot_listeners.$kw14$SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_value(registry, instance, slot, function_or_method, target_instance_if_method, trigger_value);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 18449L)
    public static SubLObject add_generic_slot_listener_stimulated_by_range(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject lower_bound, SubLObject upper_bound) {
        if (target_instance_if_method == slot_listeners.UNPROVIDED) {
            target_instance_if_method = (SubLObject)slot_listeners.NIL;
        }
        if (lower_bound == slot_listeners.UNPROVIDED) {
            lower_bound = (SubLObject)slot_listeners.NIL;
        }
        if (upper_bound == slot_listeners.UNPROVIDED) {
            upper_bound = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_listeners_valid_demon_type_p(type)) {
            Errors.error((SubLObject)slot_listeners.$str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !function_or_method.isSymbol()) {
            Errors.error((SubLObject)slot_listeners.$str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL != target_instance_if_method && slot_listeners.NIL == subloop_structures.instance_p(target_instance_if_method)) {
            Errors.error((SubLObject)slot_listeners.$str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql((SubLObject)slot_listeners.$kw13$GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_range(registry, instance, slot, function_or_method, target_instance_if_method, lower_bound, upper_bound);
        }
        if (type.eql((SubLObject)slot_listeners.$kw14$SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_range(registry, instance, slot, function_or_method, target_instance_if_method, lower_bound, upper_bound);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 19952L)
    public static SubLObject add_generic_slot_listener_stimulated_by_enum(final SubLObject instance, final SubLObject slot, final SubLObject type, final SubLObject function_or_method, SubLObject target_instance_if_method, SubLObject v_enum) {
        if (target_instance_if_method == slot_listeners.UNPROVIDED) {
            target_instance_if_method = (SubLObject)slot_listeners.NIL;
        }
        if (v_enum == slot_listeners.UNPROVIDED) {
            v_enum = (SubLObject)slot_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error((SubLObject)slot_listeners.$str15$Cannot_add_a_slot_listener_to_inv, instance);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL == slot_listeners_valid_demon_type_p(type)) {
            Errors.error((SubLObject)slot_listeners.$str16$_S_is_not_a_valid_slot_listener_t, type);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !function_or_method.isSymbol()) {
            Errors.error((SubLObject)slot_listeners.$str17$Slot_listener_functions_and_metho, function_or_method);
        }
        if (slot_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && slot_listeners.NIL != target_instance_if_method && slot_listeners.NIL == subloop_structures.instance_p(target_instance_if_method)) {
            Errors.error((SubLObject)slot_listeners.$str18$Slot_listener_targets_must_be_val, target_instance_if_method);
        }
        if (type.eql((SubLObject)slot_listeners.$kw13$GET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            }
            return slot_listeners_new_get_slot_listener_method_by_enum(registry, instance, slot, function_or_method, target_instance_if_method, v_enum);
        }
        if (type.eql((SubLObject)slot_listeners.$kw14$SET)) {
            SubLObject registry = slot_listeners_get_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            if (slot_listeners.NIL == registry) {
                registry = slot_listeners_add_registry(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return slot_listeners_new_set_slot_listener_method_by_enum(registry, instance, slot, function_or_method, target_instance_if_method, v_enum);
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 21370L)
    public static SubLObject slot_listeners_before_removal_hook(final SubLObject slot_listener) {
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 21502L)
    public static SubLObject slot_listeners_remove_all_slot_listeners_internal(final SubLObject instance, final SubLObject registry_key) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (slot_listeners.NIL != registry) {
            SubLObject listeners = (SubLObject)slot_listeners.NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = (SubLObject)slot_listeners.NIL, index = (SubLObject)slot_listeners.ZERO_INTEGER; index.numL(slot_count); index = Numbers.add(index, (SubLObject)slot_listeners.ONE_INTEGER)) {
                listeners = (cdolist_list_var = Vectors.aref(listeners_vector, index));
                listener = (SubLObject)slot_listeners.NIL;
                listener = cdolist_list_var.first();
                while (slot_listeners.NIL != cdolist_list_var) {
                    slot_listeners_before_removal_hook(listener);
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                }
                Vectors.set_aref(listeners_vector, index, (SubLObject)slot_listeners.NIL);
            }
        }
        return (SubLObject)slot_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 21990L)
    public static SubLObject slot_listeners_remove_all_slot_listeners_with_target(final SubLObject instance, final SubLObject registry_key, final SubLObject target) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (slot_listeners.NIL != registry) {
            SubLObject matched_listeners = (SubLObject)slot_listeners.NIL;
            SubLObject not_matched_listeners = (SubLObject)slot_listeners.NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject match_list;
            SubLObject not_match_list;
            SubLObject next_cons_var;
            SubLObject sublist;
            SubLObject element;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = (SubLObject)slot_listeners.NIL, index = (SubLObject)slot_listeners.ZERO_INTEGER; index.numL(slot_count); index = Numbers.add(index, (SubLObject)slot_listeners.ONE_INTEGER)) {
                match_list = (SubLObject)slot_listeners.NIL;
                not_match_list = (SubLObject)slot_listeners.NIL;
                next_cons_var = (SubLObject)slot_listeners.NIL;
                sublist = (SubLObject)slot_listeners.NIL;
                element = (SubLObject)slot_listeners.NIL;
                sublist = Vectors.aref(listeners_vector, index);
                element = sublist.first();
                while (slot_listeners.NIL != sublist) {
                    next_cons_var = sublist.rest();
                    if (subloop_structures.sl_target_instance(element).eql(target)) {
                        ConsesLow.rplacd(sublist, match_list);
                        match_list = sublist;
                    }
                    else {
                        ConsesLow.rplacd(sublist, not_match_list);
                        not_match_list = sublist;
                    }
                    sublist = next_cons_var;
                    element = sublist.first();
                }
                matched_listeners = Sequences.nreverse(match_list);
                not_matched_listeners = Sequences.nreverse(not_match_list);
                Vectors.set_aref(listeners_vector, index, not_matched_listeners);
                cdolist_list_var = matched_listeners;
                listener = (SubLObject)slot_listeners.NIL;
                listener = cdolist_list_var.first();
                while (slot_listeners.NIL != cdolist_list_var) {
                    slot_listeners_before_removal_hook(listener);
                    cdolist_list_var = cdolist_list_var.rest();
                    listener = cdolist_list_var.first();
                }
            }
        }
        return (SubLObject)slot_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 22649L)
    public static SubLObject slot_listeners_remove_all_slot_listeners_with_target_and_slot(final SubLObject instance, final SubLObject registry_key, final SubLObject target, final SubLObject slot) {
        final SubLObject registry = slot_listeners_get_registry(instance, registry_key);
        if (slot_listeners.NIL != registry) {
            SubLObject matched_listeners = (SubLObject)slot_listeners.NIL;
            SubLObject matched_listeners_with_slot = (SubLObject)slot_listeners.NIL;
            SubLObject matched_listeners_without_slot = (SubLObject)slot_listeners.NIL;
            SubLObject not_matched_listeners = (SubLObject)slot_listeners.NIL;
            final SubLObject slot_listener_registry = registry;
            final SubLObject slot_count = subloop_structures.slr_slot_count(slot_listener_registry);
            final SubLObject listeners_vector = subloop_structures.slr_listeners_vector(slot_listener_registry);
            SubLObject index;
            SubLObject match_list;
            SubLObject not_match_list;
            SubLObject next_cons_var;
            SubLObject sublist;
            SubLObject element;
            SubLObject cdolist_list_var;
            SubLObject listener;
            for (index = (SubLObject)slot_listeners.NIL, index = (SubLObject)slot_listeners.ZERO_INTEGER; index.numL(slot_count); index = Numbers.add(index, (SubLObject)slot_listeners.ONE_INTEGER)) {
                match_list = (SubLObject)slot_listeners.NIL;
                not_match_list = (SubLObject)slot_listeners.NIL;
                next_cons_var = (SubLObject)slot_listeners.NIL;
                sublist = (SubLObject)slot_listeners.NIL;
                element = (SubLObject)slot_listeners.NIL;
                sublist = Vectors.aref(listeners_vector, index);
                element = sublist.first();
                while (slot_listeners.NIL != sublist) {
                    next_cons_var = sublist.rest();
                    if (subloop_structures.sl_target_instance(element).eql(target)) {
                        ConsesLow.rplacd(sublist, match_list);
                        match_list = sublist;
                    }
                    else {
                        ConsesLow.rplacd(sublist, not_match_list);
                        not_match_list = sublist;
                    }
                    sublist = next_cons_var;
                    element = sublist.first();
                }
                matched_listeners = Sequences.nreverse(match_list);
                not_matched_listeners = Sequences.nreverse(not_match_list);
                if (slot_listeners.NIL != matched_listeners) {
                    match_list = (SubLObject)slot_listeners.NIL;
                    not_match_list = (SubLObject)slot_listeners.NIL;
                    next_cons_var = (SubLObject)slot_listeners.NIL;
                    sublist = (SubLObject)slot_listeners.NIL;
                    element = (SubLObject)slot_listeners.NIL;
                    sublist = matched_listeners;
                    element = sublist.first();
                    while (slot_listeners.NIL != sublist) {
                        next_cons_var = sublist.rest();
                        if (subloop_structures.sl_slot_name(element).eql(slot)) {
                            ConsesLow.rplacd(sublist, match_list);
                            match_list = sublist;
                        }
                        else {
                            ConsesLow.rplacd(sublist, not_match_list);
                            not_match_list = sublist;
                        }
                        sublist = next_cons_var;
                        element = sublist.first();
                    }
                    matched_listeners_with_slot = Sequences.nreverse(match_list);
                    matched_listeners_without_slot = Sequences.nreverse(not_match_list);
                    Vectors.set_aref(listeners_vector, index, ConsesLow.nconc(not_matched_listeners, matched_listeners_without_slot));
                    cdolist_list_var = matched_listeners_with_slot;
                    listener = (SubLObject)slot_listeners.NIL;
                    listener = cdolist_list_var.first();
                    while (slot_listeners.NIL != cdolist_list_var) {
                        slot_listeners_before_removal_hook(listener);
                        cdolist_list_var = cdolist_list_var.rest();
                        listener = cdolist_list_var.first();
                    }
                }
                else {
                    Vectors.set_aref(listeners_vector, index, not_matched_listeners);
                }
            }
        }
        return (SubLObject)slot_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 23698L)
    public static SubLObject slot_listeners_remove_all_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == slot_listeners.UNPROVIDED) {
            target = (SubLObject)slot_listeners.NIL;
        }
        if (slot == slot_listeners.UNPROVIDED) {
            slot = (SubLObject)slot_listeners.NIL;
        }
        if (slot_listeners.NIL != subloop_structures.instance_p(instance)) {
            if (slot_listeners.NIL != target) {
                if (slot_listeners.NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY, target, slot);
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY, target, slot);
                }
                else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY, target);
                    slot_listeners_remove_all_slot_listeners_with_target(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY, target);
                }
            }
            else {
                slot_listeners_remove_all_slot_listeners_internal(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
                slot_listeners_remove_all_slot_listeners_internal(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return (SubLObject)slot_listeners.T;
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 24509L)
    public static SubLObject slot_listeners_remove_all_get_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == slot_listeners.UNPROVIDED) {
            target = (SubLObject)slot_listeners.NIL;
        }
        if (slot == slot_listeners.UNPROVIDED) {
            slot = (SubLObject)slot_listeners.NIL;
        }
        if (slot_listeners.NIL != subloop_structures.instance_p(instance)) {
            if (slot_listeners.NIL != target) {
                if (slot_listeners.NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY, target, slot);
                }
                else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY, target);
                }
            }
            else {
                slot_listeners_remove_all_slot_listeners_internal(instance, (SubLObject)slot_listeners.$kw8$SLOT_GETTER_REGISTRY);
            }
            return (SubLObject)slot_listeners.T;
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/slot-listeners.lisp", position = 25001L)
    public static SubLObject slot_listeners_remove_all_set_slot_listeners(final SubLObject instance, SubLObject target, SubLObject slot) {
        if (target == slot_listeners.UNPROVIDED) {
            target = (SubLObject)slot_listeners.NIL;
        }
        if (slot == slot_listeners.UNPROVIDED) {
            slot = (SubLObject)slot_listeners.NIL;
        }
        if (slot_listeners.NIL != subloop_structures.instance_p(instance)) {
            if (slot_listeners.NIL != target) {
                if (slot_listeners.NIL != slot) {
                    slot_listeners_remove_all_slot_listeners_with_target_and_slot(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY, target, slot);
                }
                else {
                    slot_listeners_remove_all_slot_listeners_with_target(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY, target);
                }
            }
            else {
                slot_listeners_remove_all_slot_listeners_internal(instance, (SubLObject)slot_listeners.$kw9$SLOT_SETTER_REGISTRY);
            }
            return (SubLObject)slot_listeners.T;
        }
        return (SubLObject)slot_listeners.NIL;
    }
    
    public static SubLObject declare_slot_listeners_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_valid_slot_trigger_type_p", "SLOT-LISTENERS-VALID-SLOT-TRIGGER-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_valid_slot_registry_type_p", "SLOT-LISTENERS-VALID-SLOT-REGISTRY-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_valid_demon_type_p", "SLOT-LISTENERS-VALID-DEMON-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_add_registry", "SLOT-LISTENERS-ADD-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_get_registry", "SLOT-LISTENERS-GET-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_value_trigger_type", "SLOT-LISTENERS-VALUE-TRIGGER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_value_trigger_value", "SLOT-LISTENERS-VALUE-TRIGGER-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_value_trigger_range", "SLOT-LISTENERS-VALUE-TRIGGER-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_value_trigger_enum", "SLOT-LISTENERS-VALUE-TRIGGER-ENUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_slot_listener_match_p", "SLOT-LISTENERS-SLOT-LISTENER-MATCH-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_fire_slot_listener", "SLOT-LISTENERS-FIRE-SLOT-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_fast_fire_all_slot_listeners_stimulated_by_value", "SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS-STIMULATED-BY-VALUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_fast_fire_all_slot_listeners", "SLOT-LISTENERS-FAST-FIRE-ALL-SLOT-LISTENERS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_fire_all_get_slot_listeners", "SLOT-LISTENERS-FIRE-ALL-GET-SLOT-LISTENERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_fire_all_set_slot_listeners", "SLOT-LISTENERS-FIRE-ALL-SET-SLOT-LISTENERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_slot_listener_internal", "SLOT-LISTENERS-NEW-SLOT-LISTENER-INTERNAL", 8, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_slot_listener_method_internal", "SLOT-LISTENERS-NEW-SLOT-LISTENER-METHOD-INTERNAL", 7, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_get_slot_listener_method_generic", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-GENERIC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_get_slot_listener_method_by_value", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-VALUE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_get_slot_listener_method_by_range", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-RANGE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_get_slot_listener_method_by_enum", "SLOT-LISTENERS-NEW-GET-SLOT-LISTENER-METHOD-BY-ENUM", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_set_slot_listener_method_generic", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-GENERIC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_set_slot_listener_method_by_value", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-VALUE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_set_slot_listener_method_by_range", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-RANGE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_new_set_slot_listener_method_by_enum", "SLOT-LISTENERS-NEW-SET-SLOT-LISTENER-METHOD-BY-ENUM", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "add_generic_slot_listener", "ADD-GENERIC-SLOT-LISTENER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "add_generic_slot_listener_stimulated_by_value", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-VALUE", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "add_generic_slot_listener_stimulated_by_range", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-RANGE", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "add_generic_slot_listener_stimulated_by_enum", "ADD-GENERIC-SLOT-LISTENER-STIMULATED-BY-ENUM", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_before_removal_hook", "SLOT-LISTENERS-BEFORE-REMOVAL-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_slot_listeners_internal", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_slot_listeners_with_target", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-WITH-TARGET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_slot_listeners_with_target_and_slot", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS-WITH-TARGET-AND-SLOT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-SLOT-LISTENERS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_get_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-GET-SLOT-LISTENERS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.slot_listeners", "slot_listeners_remove_all_set_slot_listeners", "SLOT-LISTENERS-REMOVE-ALL-SET-SLOT-LISTENERS", 1, 2, false);
        return (SubLObject)slot_listeners.NIL;
    }
    
    public static SubLObject init_slot_listeners_file() {
        slot_listeners.$slot_listeners_slot_trigger_types$ = SubLFiles.defparameter("*SLOT-LISTENERS-SLOT-TRIGGER-TYPES*", (SubLObject)slot_listeners.$list0);
        slot_listeners.$slot_listeners_registry_types$ = SubLFiles.defparameter("*SLOT-LISTENERS-REGISTRY-TYPES*", (SubLObject)slot_listeners.$list1);
        slot_listeners.$slot_listeners_valid_demon_types$ = SubLFiles.defparameter("*SLOT-LISTENERS-VALID-DEMON-TYPES*", (SubLObject)slot_listeners.$list2);
        slot_listeners.$active_slot_listener$ = SubLFiles.defparameter("*ACTIVE-SLOT-LISTENER*", (SubLObject)slot_listeners.NIL);
        return (SubLObject)slot_listeners.NIL;
    }
    
    public static SubLObject setup_slot_listeners_file() {
        return (SubLObject)slot_listeners.NIL;
    }
    
    public void declareFunctions() {
        declare_slot_listeners_file();
    }
    
    public void initializeVariables() {
        init_slot_listeners_file();
    }
    
    public void runTopLevelForms() {
        setup_slot_listeners_file();
    }
    
    static {
        me = (SubLFile)new slot_listeners();
        slot_listeners.$slot_listeners_slot_trigger_types$ = null;
        slot_listeners.$slot_listeners_registry_types$ = null;
        slot_listeners.$slot_listeners_valid_demon_types$ = null;
        slot_listeners.$active_slot_listener$ = null;
        $list0 = ConsesLow.list((SubLObject)slot_listeners.NIL, (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("RANGE"), (SubLObject)SubLObjectFactory.makeKeyword("ENUM"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SLOT-GETTER-REGISTRY"), (SubLObject)SubLObjectFactory.makeKeyword("SLOT-SETTER-REGISTRY"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SET"), (SubLObject)SubLObjectFactory.makeKeyword("GET"));
        $kw3$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw4$RANGE = SubLObjectFactory.makeKeyword("RANGE");
        $kw5$ENUM = SubLObjectFactory.makeKeyword("ENUM");
        $str6$Cannot_fire_slot_listeners_of_slo = SubLObjectFactory.makeString("Cannot fire slot listeners of slot ~S of illegal instance ~S.");
        $str7$_S_is_not_a_valid_registry_type_ = SubLObjectFactory.makeString("~S is not a valid registry type.");
        $kw8$SLOT_GETTER_REGISTRY = SubLObjectFactory.makeKeyword("SLOT-GETTER-REGISTRY");
        $kw9$SLOT_SETTER_REGISTRY = SubLObjectFactory.makeKeyword("SLOT-SETTER-REGISTRY");
        $str10$Cannot_add_a_slot_listener_to_ill = SubLObjectFactory.makeString("Cannot add a slot listener to illegal slot ~S of instance ~S");
        $sym11$SLOT_LISTENERS_NEW_SLOT_LISTENER_INTERNAL_REDUNDANT = SubLObjectFactory.makeSymbol("SLOT-LISTENERS-NEW-SLOT-LISTENER-INTERNAL-REDUNDANT");
        $str12$Cannot_add_listener__S_of_instanc = SubLObjectFactory.makeString("Cannot add listener ~S of instance ~S to slot ~S of instance ~S.");
        $kw13$GET = SubLObjectFactory.makeKeyword("GET");
        $kw14$SET = SubLObjectFactory.makeKeyword("SET");
        $str15$Cannot_add_a_slot_listener_to_inv = SubLObjectFactory.makeString("Cannot add a slot listener to invalid instance ~S.");
        $str16$_S_is_not_a_valid_slot_listener_t = SubLObjectFactory.makeString("~S is not a valid slot listener type.");
        $str17$Slot_listener_functions_and_metho = SubLObjectFactory.makeString("Slot listener functions and methods must be symbols.  ~S is not a symbol.");
        $str18$Slot_listener_targets_must_be_val = SubLObjectFactory.makeString("Slot listener targets must be valid instances.  ~S is not a valid instance.");
    }
}

/*

	Total time: 297 ms
	
*/