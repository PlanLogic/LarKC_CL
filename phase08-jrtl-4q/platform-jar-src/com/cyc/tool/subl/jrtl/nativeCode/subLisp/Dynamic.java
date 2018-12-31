//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Dynamic extends SubLTrampolineFile {
	public static SubLFile me;

	static {
		Dynamic.me = new Dynamic();
	}

	public static void bind(SubLSymbol symbol, SubLObject newValue) {
		symbol.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
	}

	public static void bind_dynamic_vars(SubLObject variables, SubLObject values) {
		SubLList variablesTyped = variables.toList();
		SubLList valuesTyped = values.toList();
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(variablesTyped);
			iter2 = resourcer.acquireSubLListListIterator(valuesTyped);
			while (iter.hasNext() && iter2.hasNext())
				Dynamic.bind(iter.nextSubLObject().toSymbol(), iter2.nextSubLObject());
			while (iter.hasNext())
				Dynamic.bind(iter.nextSubLObject().toSymbol(), SubLSymbol.UNBOUND);
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
	}

	public static SubLObject currentBinding(SubLSymbol symbol) {
		return symbol.currentBinding(SubLProcess.currentSubLThread().bindingsList);
	}

	public static ArrayList<SubLObject> extract_dynamic_values(SubLObject variables) {
		SubLThread $thread = SubLProcess.currentSubLThread();
		SubLObject[] $bindings = $thread.bindingsList;
		ArrayList<SubLObject> oldValues = new ArrayList<SubLObject>();
		for (SubLObject cur = variables; cur != CommonSymbols.NIL; cur = cur.rest()) {
			SubLSymbol sym = cur.first().toSymbol();
			if (!sym.isDynamic())
				Errors.error("Unable to get dynamic value for non-dynamic variable: " + sym + ".");
			oldValues.add(sym.getDynamicValue($bindings));
		}
		return oldValues;
	}

	public static SubLObject getResult(CatchableThrow ct) {
		return ct.getResult();
	}

	public static SubLObject getTarget(CatchableThrow ct) {
		return ct.getTarget();
	}

	public static SubLObject handleCatchableThrow(CatchableThrow ct, SubLObject target) {
		if (Dynamic.getTarget(ct) == target)
			return Dynamic.getResult(ct);
		throw ct;
	}

	public static SubLObject possibly_throw(SubLObject tag, SubLObject result) {
		CatchableThrow.throwToCatch(tag, result, false);
		return null;
	}

	public static void rebind(SubLSymbol symbol, SubLObject oldValue) {
		symbol.rebind(oldValue, SubLProcess.currentSubLThread().bindingsList);
	}

	public static void rebind_dynamic_vars(SubLObject variables, ArrayList oldValues) {
		SubLList variablesTyped = variables.toList();
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(variablesTyped);
			int oldIndex = 0;
			SubLSymbol variable = null;
			while (iter.hasNext()) {
				variable = iter.nextSubLObject().toSymbol();
				Dynamic.rebind(variable, (SubLObject) oldValues.get(oldIndex++));
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
	}

	public static SubLObject sublisp_throw(SubLObject tag, SubLObject result) {
		CatchableThrow.throwToCatch(tag, result, true);
		return null;
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Dynamic.me, "sublisp_throw", "THROW", 2, 0, false);
		SubLFiles.declareFunction(Dynamic.me, "possibly_throw", "POSSIBLY-THROW", 2, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}