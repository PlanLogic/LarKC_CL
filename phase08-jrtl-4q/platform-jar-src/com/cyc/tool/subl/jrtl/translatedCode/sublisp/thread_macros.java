//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class thread_macros extends SubLTranslatedFile {
	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros";

	private static SubLList $list0;

	private static SubLList $list1;

	private static SubLSymbol $kw2$ALLOW_OTHER_KEYS;

	private static SubLSymbol $kw3$WHOSTATE;
	private static SubLString $str4$Seize_lock;
	private static SubLString $str5$WHOSTATE;
	private static SubLSymbol $sym6$CLET;
	private static SubLString $str7$LOCK;
	private static SubLString $str8$RELEASE;
	private static SubLList $list9;
	private static SubLSymbol $sym10$IGNORE;
	private static SubLSymbol $sym11$CUNWIND_PROTECT;
	private static SubLSymbol $sym12$PROGN;
	private static SubLSymbol $sym13$CSETQ;
	private static SubLSymbol $sym14$SEIZE_LOCK;
	private static SubLSymbol $sym15$PWHEN;
	private static SubLSymbol $sym16$RELEASE_LOCK;
	static {
		thread_macros.me = new thread_macros();
		thread_macros.$list0 = ConsesLow.list(
				ConsesLow.list(SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("&KEY"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("WHOSTATE"),
								SubLObjectFactory.makeString("Seize lock"))),
				SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		thread_macros.$list1 = ConsesLow.list(SubLObjectFactory.makeKeyword("WHOSTATE"));
		thread_macros.$kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
		thread_macros.$kw3$WHOSTATE = SubLObjectFactory.makeKeyword("WHOSTATE");
		thread_macros.$str4$Seize_lock = SubLObjectFactory.makeString("Seize lock");
		thread_macros.$str5$WHOSTATE = SubLObjectFactory.makeString("WHOSTATE");
		thread_macros.$sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
		thread_macros.$str7$LOCK = SubLObjectFactory.makeString("LOCK");
		thread_macros.$str8$RELEASE = SubLObjectFactory.makeString("RELEASE");
		thread_macros.$list9 = ConsesLow.list(CommonSymbols.NIL);
		thread_macros.$sym10$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
		thread_macros.$sym11$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
		thread_macros.$sym12$PROGN = SubLObjectFactory.makeSymbol("PROGN");
		thread_macros.$sym13$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
		thread_macros.$sym14$SEIZE_LOCK = SubLObjectFactory.makeSymbol("SEIZE-LOCK");
		thread_macros.$sym15$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
		thread_macros.$sym16$RELEASE_LOCK = SubLObjectFactory.makeSymbol("RELEASE-LOCK");
	}

	public static SubLObject declare_thread_macros_file() {
		SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros", "with_lock_held",
				"WITH-LOCK-HELD");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.thread_macros",
				"with_lock_held_internal", "WITH-LOCK-HELD-INTERNAL", 3, 0, false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_thread_macros_file() {
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_thread_macros_file() {
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 709L)
	public static SubLObject with_lock_held(SubLObject macroform, SubLObject environment) {
		SubLObject current;
		SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
		SubLObject temp = current.rest();
		current = current.first();
		SubLObject lock = CommonSymbols.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, thread_macros.$list0);
		lock = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = CommonSymbols.NIL;
		SubLObject rest = current;
		SubLObject bad = CommonSymbols.NIL;
		SubLObject current_$1 = CommonSymbols.NIL;
		while (CommonSymbols.NIL != rest) {
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
			current_$1 = rest.first();
			rest = rest.rest();
			cdestructuring_bind.destructuring_bind_must_consp(rest, datum, thread_macros.$list0);
			if (CommonSymbols.NIL == conses_high.member(current_$1, thread_macros.$list1, CommonSymbols.UNPROVIDED,
					CommonSymbols.UNPROVIDED))
				bad = CommonSymbols.T;
			if (current_$1 == thread_macros.$kw2$ALLOW_OTHER_KEYS)
				allow_other_keys_p = rest.first();
			rest = rest.rest();
		}
		if (CommonSymbols.NIL != bad && CommonSymbols.NIL == allow_other_keys_p)
			cdestructuring_bind.cdestructuring_bind_error(datum, thread_macros.$list0);
		SubLObject whostate_tail = cdestructuring_bind.property_list_member(thread_macros.$kw3$WHOSTATE, current);
		SubLObject whostate = CommonSymbols.NIL != whostate_tail ? conses_high.cadr(whostate_tail)
				: thread_macros.$str4$Seize_lock;
		SubLObject body;
		current = body = temp;
		return thread_macros.with_lock_held_internal(lock, whostate, body);
	}

	@SubL(source = "sublisp/thread-macros.lisp", position = 1088L)
	public static SubLObject with_lock_held_internal(SubLObject lock, SubLObject whostate, SubLObject body) {
		if (!whostate.isAtom()) {
			SubLObject whostate_var = Symbols.make_symbol(thread_macros.$str5$WHOSTATE);
			return ConsesLow.list(thread_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(whostate_var, whostate)),
					thread_macros.with_lock_held_internal(lock, whostate_var, body));
		}
		if (!lock.isAtom()) {
			SubLObject lock_var = Symbols.make_symbol(thread_macros.$str7$LOCK);
			return ConsesLow.list(thread_macros.$sym6$CLET, ConsesLow.list(ConsesLow.list(lock_var, lock)),
					thread_macros.with_lock_held_internal(lock_var, whostate, body));
		}
		SubLObject release_var = Symbols.make_symbol(thread_macros.$str8$RELEASE);
		return ConsesLow.listS(thread_macros.$sym6$CLET,
				ConsesLow.list(reader.bq_cons(release_var, thread_macros.$list9)),
				ConsesLow.append(CommonSymbols.NIL != whostate
						? ConsesLow.list(
								ConsesLow.list(thread_macros.$sym10$IGNORE, whostate))
						: CommonSymbols.NIL,
						ConsesLow.list(ConsesLow.list(thread_macros.$sym11$CUNWIND_PROTECT,
								ConsesLow.listS(thread_macros.$sym12$PROGN,
										ConsesLow.list(thread_macros.$sym13$CSETQ, release_var,
												ConsesLow.list(thread_macros.$sym14$SEIZE_LOCK, lock)),
										ConsesLow.append(body, CommonSymbols.NIL)),
								ConsesLow.list(thread_macros.$sym15$PWHEN, release_var,
										ConsesLow.list(thread_macros.$sym16$RELEASE_LOCK, lock))))));
	}

	public void declareFunctions() {
		thread_macros.declare_thread_macros_file();
	}

	public void initializeVariables() {
		thread_macros.init_thread_macros_file();
	}

	public void runTopLevelForms() {
		thread_macros.setup_thread_macros_file();
	}
}
