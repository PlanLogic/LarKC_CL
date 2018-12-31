//
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class conses_high extends SubLTranslatedFile {
	public static class $union$BinaryFunction extends BinaryFunction {
		public $union$BinaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("UNION"));
		}

		public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
			return conses_high.union(arg1, arg2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
	}

	public static SubLFile me;

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high";

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLSymbol $sublis_watermark$;

	private static SubLList $list0;

	private static SubLSymbol $sym1$LISTP;

	private static SubLList $list2;

	private static SubLList $list3;

	private static SubLSymbol $sym4$FUNCTION_SPEC_P;

	private static SubLList $list5;

	private static SubLList $list6;

	private static SubLList $list7;

	private static SubLList $list8;

	private static SubLList $list9;

	private static SubLSymbol $sym10$FIXNUMP;

	private static SubLString $str11$_S_must_be_a_non_negative_integer;

	private static SubLList $list12;

	private static SubLString $str13$COPY_LIST_called_on_a_circular_li;

	private static SubLList $list14;

	private static SubLString $str15$COPY_ALIST_called_on_a_circular_l;

	private static SubLList $list16;

	private static SubLString $str17$COPY_TREE_called_on_a_circular_li;

	private static SubLList $list18;

	private static SubLList $list19;

	private static SubLList $list20;

	private static SubLList $list21;

	private static SubLList $list22;

	private static SubLList $list23;

	private static SubLList $list24;

	private static SubLList $list25;

	private static SubLInteger $int26$68;

	private static SubLList $list27;

	private static SubLList $list28;

	private static SubLList $list29;

	private static SubLList $list30;

	private static SubLList $list31;

	private static SubLList $list32;

	private static SubLList $list33;

	private static SubLList $list34;

	private static SubLList $list35;

	private static SubLList $list36;

	private static SubLList $list37;

	private static SubLList $list38;

	private static SubLList $list39;

	private static SubLList $list40;

	private static SubLList $list41;

	private static SubLList $list42;

	private static SubLList $list43;

	private static SubLList $list44;

	private static SubLList $list45;

	private static SubLList $list46;

	private static SubLList $list47;

	private static SubLList $list48;

	private static SubLList $list49;

	private static SubLList $list50;

	private static SubLList $list51;

	private static SubLString $str52$PAIRLIS_was_called_with_lists_of_;

	private static SubLList $list53;

	private static SubLList $list54;

	private static SubLList $list55;

	private static SubLList $list56;

	private static SubLList $list57;

	private static SubLList $list58;

	private static SubLString $str59$LAST_called_with_negative_index_o;

	private static SubLList $list60;

	private static SubLString $str61$NBUTLAST_called_with_negative_ind;

	private static SubLString $str62$NBUTLAST_called_on_circular_list;

	static {
		conses_high.me = new conses_high();
		conses_high.$sublis_watermark$ = null;
		conses_high.$list0 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_RECONS"), SubLObjectFactory.makeSymbol("_NCONS"));
		conses_high.$sym1$LISTP = SubLObjectFactory.makeSymbol("LISTP");
		conses_high.$list2 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("CAAR"), SubLObjectFactory.makeSymbol("CADR"),
				SubLObjectFactory.makeSymbol("CDAR"), SubLObjectFactory.makeSymbol("CDDR"));
		conses_high.$list3 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("TREE-EQUAL"));
		conses_high.$sym4$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
		conses_high.$list5 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("ENDP"));
		conses_high.$list6 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("LIST-LENGTH"));
		conses_high.$list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("SECOND"),
				SubLObjectFactory.makeSymbol("THIRD"), SubLObjectFactory.makeSymbol("FOURTH"),
				SubLObjectFactory.makeSymbol("FIFTH"), SubLObjectFactory.makeSymbol("SIXTH"),
				SubLObjectFactory.makeSymbol("SEVENTH"), SubLObjectFactory.makeSymbol("EIGHTH"),
				SubLObjectFactory.makeSymbol("NINTH"), SubLObjectFactory.makeSymbol("TENTH") });
		conses_high.$list8 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("REST"));
		conses_high.$list9 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NTHCDR"));
		conses_high.$sym10$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
		conses_high.$str11$_S_must_be_a_non_negative_integer = SubLObjectFactory
				.makeString("~S must be a non-negative integer");
		conses_high.$list12 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("COPY-LIST"));
		conses_high.$str13$COPY_LIST_called_on_a_circular_li = SubLObjectFactory
				.makeString("COPY-LIST called on a circular list");
		conses_high.$list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("COPY-ALIST"));
		conses_high.$str15$COPY_ALIST_called_on_a_circular_l = SubLObjectFactory
				.makeString("COPY-ALIST called on a circular list");
		conses_high.$list16 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("COPY-TREE"));
		conses_high.$str17$COPY_TREE_called_on_a_circular_li = SubLObjectFactory
				.makeString("COPY-TREE called on a circular list");
		conses_high.$list18 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("REVAPPEND"));
		conses_high.$list19 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NRECONC"));
		conses_high.$list20 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("LDIFF"));
		conses_high.$list21 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("SUBST"));
		conses_high.$list22 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("SUBST-IF"));
		conses_high.$list23 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NSUBST"));
		conses_high.$list24 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NSUBST-IF"));
		conses_high.$list25 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("SUBLIS"));
		conses_high.$int26$68 = SubLObjectFactory.makeInteger(68);
		conses_high.$list27 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NSUBLIS"));
		conses_high.$list28 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("MEMBER"));
		conses_high.$list29 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_MEMBER-2"), SubLObjectFactory.makeSymbol("_MEMBER-3"),
				SubLObjectFactory.makeSymbol("_MEMBER-4"));
		conses_high.$list30 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("MEMBER-IF"));
		conses_high.$list31 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_MEMBER-IF-2"), SubLObjectFactory.makeSymbol("_MEMBER-IF-3"));
		conses_high.$list32 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("TAILP"));
		conses_high.$list33 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("ADJOIN"));
		conses_high.$list34 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("UNION"));
		conses_high.$list35 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_UNION-2"), SubLObjectFactory.makeSymbol("_UNION-3"),
				SubLObjectFactory.makeSymbol("_UNION-4"));
		conses_high.$list36 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NUNION"));
		conses_high.$list37 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_NUNION-2"), SubLObjectFactory.makeSymbol("_NUNION-3"),
				SubLObjectFactory.makeSymbol("_NUNION-4"));
		conses_high.$list38 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("INTERSECTION"));
		conses_high.$list39 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_INTERSECTION-2"), SubLObjectFactory.makeSymbol("_INTERSECTION-3"),
				SubLObjectFactory.makeSymbol("_INTERSECTION-4"));
		conses_high.$list40 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NINTERSECTION"));
		conses_high.$list41 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_NINTERSECTION-2"), SubLObjectFactory.makeSymbol("_NINTERSECTION-3"),
				SubLObjectFactory.makeSymbol("_NINTERSECTION-4"));
		conses_high.$list42 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("SET-DIFFERENCE"));
		conses_high.$list43 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_SET-DIFFERENCE-2"), SubLObjectFactory.makeSymbol("_SET-DIFFERENCE-3"),
				SubLObjectFactory.makeSymbol("_SET-DIFFERENCE-4"));
		conses_high.$list44 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("NSET-DIFFERENCE"));
		conses_high.$list45 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_NSET-DIFFERENCE-2"), SubLObjectFactory.makeSymbol("_NSET-DIFFERENCE-3"),
				SubLObjectFactory.makeSymbol("_NSET-DIFFERENCE-4"));
		conses_high.$list46 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("SET-EXCLUSIVE-OR"));
		conses_high.$list47 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("NSET-EXCLUSIVE-OR"));
		conses_high.$list48 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("SUBSETP"));
		conses_high.$list49 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_SUBSETP-2"), SubLObjectFactory.makeSymbol("_SUBSETP-3"),
				SubLObjectFactory.makeSymbol("_SUBSETP-4"));
		conses_high.$list50 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("ACONS"));
		conses_high.$list51 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("PAIRLIS"));
		conses_high.$str52$PAIRLIS_was_called_with_lists_of_ = SubLObjectFactory
				.makeString("PAIRLIS was called with lists of different lengths");
		conses_high.$list53 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("ASSOC"));
		conses_high.$list54 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_ASSOC-2"), SubLObjectFactory.makeSymbol("_ASSOC-3"),
				SubLObjectFactory.makeSymbol("_ASSOC-4"));
		conses_high.$list55 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("ASSOC-IF"));
		conses_high.$list56 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("RASSOC"));
		conses_high.$list57 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("_RASSOC-2"), SubLObjectFactory.makeSymbol("_RASSOC-3"),
				SubLObjectFactory.makeSymbol("_RASSOC-4"));
		conses_high.$list58 = ConsesLow.list(SubLObjectFactory.makeSymbol("NOTINLINE"),
				SubLObjectFactory.makeSymbol("RASSOC-IF"));
		conses_high.$str59$LAST_called_with_negative_index_o = SubLObjectFactory
				.makeString("LAST called with negative index of ~S");
		conses_high.$list60 = ConsesLow.list(SubLObjectFactory.makeSymbol("INLINE"),
				SubLObjectFactory.makeSymbol("BUTLAST"));
		conses_high.$str61$NBUTLAST_called_with_negative_ind = SubLObjectFactory
				.makeString("NBUTLAST called with negative index of ~S");
		conses_high.$str62$NBUTLAST_called_on_circular_list = SubLObjectFactory
				.makeString("NBUTLAST called on circular list");
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _assoc_2(SubLObject item, SubLObject alist) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && item.eql(entry.first()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _assoc_3(SubLObject item, SubLObject alist, SubLObject test) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, item, entry.first()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _assoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry
					&& CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, entry.first())))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _cons_length(SubLObject list) {
		assert CommonSymbols.NIL != Types.listp(list) : list;
		if (CommonSymbols.NIL == list)
			return CommonSymbols.ZERO_INTEGER;
		if (list.rest().isAtom())
			return CommonSymbols.ONE_INTEGER;
		SubLObject slow;
		SubLObject fast;
		SubLObject length;
		for (slow = CommonSymbols.NIL, fast = CommonSymbols.NIL, length = CommonSymbols.NIL, slow = list
				.rest(), fast = conses_high.cddr(list), length = CommonSymbols.TWO_INTEGER; !fast.eql(slow); slow = slow
						.rest(), fast = conses_high
								.cddr(fast), length = Numbers.add(CommonSymbols.TWO_INTEGER, length)) {
			if (fast.isAtom())
				return length;
			if (fast.rest().isAtom())
				return Numbers.add(CommonSymbols.ONE_INTEGER, length);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _intersection_2(SubLObject list1, SubLObject list2) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != conses_high._member_2(item, list2))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _intersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != conses_high._member_3(item, list2, test))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _intersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list2, test, key))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _member_2(SubLObject item, SubLObject list) {
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
			if (item.eql(rest.first()))
				return rest;
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _member_3(SubLObject item, SubLObject list, SubLObject test) {
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
			if (CommonSymbols.NIL != Functions.funcall(test, item, rest.first()))
				return rest;
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _member_4(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
			if (CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, rest.first())))
				return rest;
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _member_if_2(SubLObject test, SubLObject list) {
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
			if (CommonSymbols.NIL != Functions.funcall(test, rest.first()))
				return rest;
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _member_if_3(SubLObject test, SubLObject list, SubLObject key) {
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
			if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, rest.first())))
				return rest;
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _ncons(SubLObject car, SubLObject cdr, SubLObject cons) {
		if (!car.eql(cons.first()))
			ConsesLow.rplaca(cons, car);
		if (!cdr.eql(cons.rest()))
			ConsesLow.rplacd(cons, cdr);
		return cons;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nintersection_2(SubLObject list1, SubLObject list2) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != conses_high._member_2(item, list2))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = answer.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL != conses_high._member_2(item2, list2))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nintersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != conses_high._member_3(item, list2, test))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = answer.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL != conses_high._member_3(item2, list2, test))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nintersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list2, test, key))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = back.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item2), list2, test, key))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nset_difference_2(SubLObject list1, SubLObject list2) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL == conses_high._member_2(item, list2))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = back.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL == conses_high._member_2(item2, list2))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nset_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = back.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL == conses_high._member_3(item2, list2, test))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nset_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject item = CommonSymbols.NIL;
		rest = list1;
		item = rest.first();
		while (CommonSymbols.NIL == answer && CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
				answer = rest;
			rest = rest.rest();
			item = rest.first();
		}
		if (CommonSymbols.NIL == answer)
			return CommonSymbols.NIL;
		SubLObject back = answer;
		SubLObject next = CommonSymbols.NIL;
		SubLObject item2 = CommonSymbols.NIL;
		next = back.rest();
		item2 = next.first();
		while (CommonSymbols.NIL != next) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item2), list2, test, key))
				back = next;
			else
				ConsesLow.rplacd(back, next.rest());
			next = next.rest();
			item2 = next.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsublis_2(SubLObject alist, SubLObject tree) {
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && entry.first().eql(tree))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		SubLObject tree_cons = CommonSymbols.NIL;
		SubLObject tree_car = CommonSymbols.NIL;
		SubLObject tree_cdr = CommonSymbols.NIL;
		tree_cons = tree;
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
		while (CommonSymbols.NIL != tree_cons) {
			ConsesLow.rplaca(tree_cons, conses_high._nsublis_2(alist, tree_car));
			if (!tree_cdr.isList()) {
				ConsesLow.rplacd(tree_cons, conses_high._nsublis_2(alist, tree_cdr));
				return tree;
			}
			tree_cons = tree_cons.rest();
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
		}
		return tree;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		SubLObject tree_cons = CommonSymbols.NIL;
		SubLObject tree_car = CommonSymbols.NIL;
		SubLObject tree_cdr = CommonSymbols.NIL;
		tree_cons = tree;
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
		while (CommonSymbols.NIL != tree_cons) {
			ConsesLow.rplaca(tree_cons, conses_high._nsublis_3(alist, tree_car, test));
			if (!tree_cdr.isList()) {
				ConsesLow.rplacd(tree_cons, conses_high._nsublis_3(alist, tree_cdr, test));
				return tree;
			}
			tree_cons = tree_cons.rest();
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
		}
		return tree;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		SubLObject tree_key = Functions.funcall(key, tree);
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree_key))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		SubLObject tree_cons = CommonSymbols.NIL;
		SubLObject tree_car = CommonSymbols.NIL;
		SubLObject tree_cdr = CommonSymbols.NIL;
		tree_cons = tree;
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
		while (CommonSymbols.NIL != tree_cons) {
			ConsesLow.rplaca(tree_cons, conses_high._nsublis_4(alist, tree_car, test, key));
			if (!tree_cdr.isList()) {
				ConsesLow.rplacd(tree_cons, conses_high._nsublis_4(alist, tree_cdr, test, key));
				return tree;
			}
			tree_cons = tree_cons.rest();
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
		}
		return tree;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsubst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
		if (old.eql(tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._nsubst_3(v_new, old, tree_car);
		SubLObject new_cdr = conses_high._nsubst_3(v_new, old, tree_cdr);
		return conses_high._ncons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsubst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._nsubst_4(v_new, old, tree_car, test);
		SubLObject new_cdr = conses_high._nsubst_4(v_new, old, tree_cdr, test);
		return conses_high._ncons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsubst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._nsubst_5(v_new, old, tree_car, test, key);
		SubLObject new_cdr = conses_high._nsubst_5(v_new, old, tree_cdr, test, key);
		return conses_high._ncons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsubst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
		if (CommonSymbols.NIL != Functions.funcall(test, tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._nsubst_if_3(v_new, test, tree_car);
		SubLObject new_cdr = conses_high._nsubst_if_3(v_new, test, tree_cdr);
		return conses_high._ncons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nsubst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, tree)))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._nsubst_if_4(v_new, test, tree_car, key);
		SubLObject new_cdr = conses_high._nsubst_if_4(v_new, test, tree_cdr, key);
		return conses_high._ncons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nunion_2(SubLObject list1, SubLObject list2) {
		SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_2(item, list1)) {
				runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
				runner = runner.rest();
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nunion_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_3(item, list1, test)) {
				runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
				runner = runner.rest();
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _nunion_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list1, test, key)) {
				runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
				runner = runner.rest();
			}
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _rassoc_2(SubLObject item, SubLObject alist) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && item.eql(entry.rest()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _rassoc_3(SubLObject item, SubLObject alist, SubLObject test) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, item, entry.rest()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _rassoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry
					&& CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, entry.rest())))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _recons(SubLObject car, SubLObject cdr, SubLObject cons) {
		if (car.eql(cons.first()) && cdr.eql(cons.rest()))
			return cons;
		return ConsesLow.cons(car, cdr);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _set_difference_2(SubLObject list1, SubLObject list2) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_2(item, list2))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _set_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _set_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject answer = CommonSymbols.NIL;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _sublis_2(SubLObject alist, SubLObject tree) {
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && entry.first().eql(tree))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		if (tree.isCons() && conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			tree_cons = new_tree;
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
			while (CommonSymbols.NIL != tree_cons) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_2(alist, tree_car));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_2(alist, tree_cdr));
					return new_tree;
				}
				tree_cons = tree_cons.rest();
				tree_car = tree_cons.first();
				tree_cdr = tree_cons.rest();
			}
			return new_tree;
		}
		SubLObject tree_car2 = tree.first();
		SubLObject tree_cdr2 = tree.rest();
		SubLObject new_car = conses_high._sublis_2(alist, tree_car2);
		SubLObject new_cdr = conses_high._sublis_2(alist, tree_cdr2);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _sublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		if (tree.isCons() && conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			tree_cons = new_tree;
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
			while (CommonSymbols.NIL != tree_cons) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_3(alist, tree_car, test));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_3(alist, tree_cdr, test));
					return new_tree;
				}
				tree_cons = tree_cons.rest();
				tree_car = tree_cons.first();
				tree_cdr = tree_cons.rest();
			}
			return new_tree;
		}
		SubLObject tree_car2 = tree.first();
		SubLObject tree_cdr2 = tree.rest();
		SubLObject new_car = conses_high._sublis_3(alist, tree_car2, test);
		SubLObject new_cdr = conses_high._sublis_3(alist, tree_cdr2, test);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _sublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		SubLObject tree_key = Functions.funcall(key, tree);
		SubLObject cdolist_list_var = alist;
		SubLObject entry = CommonSymbols.NIL;
		entry = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree_key))
				return entry.rest();
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		if (tree.isAtom())
			return tree;
		if (tree.isCons() && conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			tree_cons = new_tree;
			tree_car = tree_cons.first();
			tree_cdr = tree_cons.rest();
			while (CommonSymbols.NIL != tree_cons) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_4(alist, tree_car, test, key));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_4(alist, tree_cdr, test, key));
					return new_tree;
				}
				tree_cons = tree_cons.rest();
				tree_car = tree_cons.first();
				tree_cdr = tree_cons.rest();
			}
			return new_tree;
		}
		SubLObject tree_car2 = tree.first();
		SubLObject tree_cdr2 = tree.rest();
		SubLObject new_car = conses_high._sublis_4(alist, tree_car2, test, key);
		SubLObject new_cdr = conses_high._sublis_4(alist, tree_cdr2, test, key);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subsetp_2(SubLObject list1, SubLObject list2) {
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_2(item, list2))
				return CommonSymbols.NIL;
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subsetp_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
				return CommonSymbols.NIL;
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subsetp_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
				return CommonSymbols.NIL;
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
		if (old.eql(tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._subst_3(v_new, old, tree_car);
		SubLObject new_cdr = conses_high._subst_3(v_new, old, tree_cdr);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._subst_4(v_new, old, tree_car, test);
		SubLObject new_cdr = conses_high._subst_4(v_new, old, tree_cdr, test);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._subst_5(v_new, old, tree_car, test, key);
		SubLObject new_cdr = conses_high._subst_5(v_new, old, tree_cdr, test, key);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
		if (CommonSymbols.NIL != Functions.funcall(test, tree))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._subst_if_3(v_new, test, tree_car);
		SubLObject new_cdr = conses_high._subst_if_3(v_new, test, tree_cdr);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _subst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, tree)))
			return v_new;
		if (tree.isAtom())
			return tree;
		SubLObject tree_car = tree.first();
		SubLObject tree_cdr = tree.rest();
		SubLObject new_car = conses_high._subst_if_4(v_new, test, tree_car, key);
		SubLObject new_cdr = conses_high._subst_if_4(v_new, test, tree_cdr, key);
		return conses_high._recons(new_car, new_cdr, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _tree_equal_2(SubLObject tree1, SubLObject tree2) {
		if (tree1.isAtom() && tree2.isAtom())
			return Equality.eql(tree1, tree2);
		if (tree1.isCons() && tree2.isCons()) {
			SubLObject rest_tree1;
			SubLObject rest_tree2;
			for (rest_tree1 = CommonSymbols.NIL, rest_tree2 = CommonSymbols.NIL, rest_tree1 = tree1, rest_tree2 = tree2; !rest_tree1
					.isAtom() && !rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_2(rest_tree1.first(),
							rest_tree2.first()); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
			}
			return SubLObjectFactory.makeBoolean(rest_tree1.isAtom() && rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_2(rest_tree1, rest_tree2));
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _tree_equal_3(SubLObject tree1, SubLObject tree2, SubLObject test) {
		if (tree1.isAtom() && tree2.isAtom())
			return Functions.funcall(test, tree1, tree2);
		if (tree1.isCons() && tree2.isCons()) {
			SubLObject rest_tree1;
			SubLObject rest_tree2;
			for (rest_tree1 = CommonSymbols.NIL, rest_tree2 = CommonSymbols.NIL, rest_tree1 = tree1, rest_tree2 = tree2; !rest_tree1
					.isAtom() && !rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_3(rest_tree1.first(), rest_tree2.first(),
							test); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
			}
			return SubLObjectFactory.makeBoolean(rest_tree1.isAtom() && rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_3(rest_tree1, rest_tree2, test));
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _union_2(SubLObject list1, SubLObject list2) {
		SubLObject answer = list1;
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_2(item, answer))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _union_3(SubLObject list1, SubLObject list2, SubLObject test) {
		SubLObject answer = list1;
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_3(item, answer, test))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject _union_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		SubLObject answer = list1;
		SubLObject cdolist_list_var = list2;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), answer, test, key))
				answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject acons(SubLObject key, SubLObject datum, SubLObject alist) {
		return ConsesLow.cons(ConsesLow.cons(key, datum), alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject adjoin(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list) : list;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list)
			return ConsesLow.cons(item, CommonSymbols.NIL);
		if (!key.eql(Symbols.symbol_function(CommonSymbols.IDENTITY)))
			return CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list, test, key) ? list
					: ConsesLow.cons(item, list);
		if (!test.eql(Symbols.symbol_function(CommonSymbols.EQL)))
			return CommonSymbols.NIL != conses_high._member_3(item, list, test) ? list : ConsesLow.cons(item, list);
		return CommonSymbols.NIL != conses_high._member_2(item, list) ? list : ConsesLow.cons(item, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject assoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(alist) : alist;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._assoc_4(item, alist, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._assoc_3(item, alist, test);
		return conses_high._assoc_2(item, alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject assoc_if(SubLObject predicate, SubLObject alist) {
		assert CommonSymbols.NIL != Types.function_spec_p(predicate) : predicate;
		assert CommonSymbols.NIL != Types.listp(alist) : alist;
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(predicate, entry.first()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 73038L)
	public static SubLObject butlast(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		return conses_high.ldiff(list, conses_high.last(list, n));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject caar(SubLObject list) {
		return list.first().first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject cadr(SubLObject list) {
		return list.rest().first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject cdar(SubLObject list) {
		return list.first().rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject cddr(SubLObject list) {
		return list.rest().rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 71563L)
	public static SubLObject circular_list_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(
				object.isCons() && CommonSymbols.NIL == conses_high.last(object, CommonSymbols.UNPROVIDED));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject copy_alist(SubLObject list) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == list)
			return list;
		SubLObject length = conses_high._cons_length(list);
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !length.isInteger())
			Errors.error(conses_high.$str15$COPY_ALIST_called_on_a_circular_l);
		SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
		SubLObject new_rest = CommonSymbols.NIL;
		SubLObject old_rest = CommonSymbols.NIL;
		SubLObject old_item = CommonSymbols.NIL;
		new_rest = new_list;
		old_rest = list;
		old_item = old_rest.first();
		while (old_rest.rest().isCons()) {
			if (old_item.isCons())
				ConsesLow.rplaca(new_rest, conses_high.copy_list(old_item));
			else
				ConsesLow.rplaca(new_rest, old_item);
			new_rest = new_rest.rest();
			old_rest = old_rest.rest();
			old_item = old_rest.first();
		}
		if (old_item.isCons())
			ConsesLow.rplaca(new_rest, conses_high.copy_list(old_item));
		else
			ConsesLow.rplaca(new_rest, old_item);
		if (CommonSymbols.NIL != old_rest.rest())
			ConsesLow.rplacd(new_rest, old_rest.rest());
		return new_list;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject copy_list(SubLObject list) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		SubLObject length = conses_high._cons_length(list);
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !length.isInteger())
			Errors.error(conses_high.$str13$COPY_LIST_called_on_a_circular_li);
		SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
		SubLObject new_rest = CommonSymbols.NIL;
		SubLObject old_rest = CommonSymbols.NIL;
		SubLObject old_item = CommonSymbols.NIL;
		new_rest = new_list;
		old_rest = list;
		old_item = old_rest.first();
		while (old_rest.rest().isCons()) {
			ConsesLow.rplaca(new_rest, old_item);
			new_rest = new_rest.rest();
			old_rest = old_rest.rest();
			old_item = old_rest.first();
		}
		ConsesLow.rplaca(new_rest, old_item);
		if (CommonSymbols.NIL != old_rest.rest())
			ConsesLow.rplacd(new_rest, old_rest.rest());
		return new_list;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject copy_tree(SubLObject object) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (object.isAtom())
			return object;
		SubLObject length = conses_high._cons_length(object);
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !length.isInteger())
			Errors.error(conses_high.$str17$COPY_TREE_called_on_a_circular_li);
		SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
		SubLObject new_rest = CommonSymbols.NIL;
		SubLObject old_rest = CommonSymbols.NIL;
		SubLObject old_item = CommonSymbols.NIL;
		new_rest = new_list;
		old_rest = object;
		old_item = old_rest.first();
		while (old_rest.rest().isCons()) {
			ConsesLow.rplaca(new_rest, conses_high.copy_tree(old_item));
			new_rest = new_rest.rest();
			old_rest = old_rest.rest();
			old_item = old_rest.first();
		}
		ConsesLow.rplaca(new_rest, conses_high.copy_tree(old_item));
		if (CommonSymbols.NIL != old_rest.rest())
			ConsesLow.rplacd(new_rest, conses_high.copy_tree(old_rest.rest()));
		return new_list;
	}

	public static SubLObject declare_conses_high_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_recons", "_RECONS", 3,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_ncons", "_NCONS", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_cons_length",
				"_CONS-LENGTH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "caar", "CAAR", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "cadr", "CADR", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "cdar", "CDAR", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "cddr", "CDDR", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_tree_equal_2",
				"_TREE-EQUAL-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_tree_equal_3",
				"_TREE-EQUAL-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "tree_equal",
				"TREE-EQUAL", 2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "endp", "ENDP", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "list_length",
				"LIST-LENGTH", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "first", "FIRST", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "second", "SECOND", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "third", "THIRD", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "fourth", "FOURTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "fifth", "FIFTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "sixth", "SIXTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "seventh", "SEVENTH", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "eighth", "EIGHTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "ninth", "NINTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "tenth", "TENTH", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "rest", "REST", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nthcdr", "NTHCDR", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "copy_list", "COPY-LIST",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "copy_alist",
				"COPY-ALIST", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "copy_tree", "COPY-TREE",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "revappend", "REVAPPEND",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nreconc", "NRECONC", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "ldiff", "LDIFF", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subst_3", "_SUBST-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subst_4", "_SUBST-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subst_5", "_SUBST-5",
				5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "subst", "SUBST", 3, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subst_if_3",
				"_SUBST-IF-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subst_if_4",
				"_SUBST-IF-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "subst_if", "SUBST-IF",
				3, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsubst_3", "_NSUBST-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsubst_4", "_NSUBST-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsubst_5", "_NSUBST-5",
				5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nsubst", "NSUBST", 3, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsubst_if_3",
				"_NSUBST-IF-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsubst_if_4",
				"_NSUBST-IF-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nsubst_if", "NSUBST-IF",
				3, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_sublis_2", "_SUBLIS-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_sublis_3", "_SUBLIS-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_sublis_4", "_SUBLIS-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "sublis", "SUBLIS", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsublis_2",
				"_NSUBLIS-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsublis_3",
				"_NSUBLIS-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nsublis_4",
				"_NSUBLIS-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nsublis", "NSUBLIS", 2,
				2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_member_2", "_MEMBER-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_member_3", "_MEMBER-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_member_4", "_MEMBER-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "member", "MEMBER", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_member_if_2",
				"_MEMBER-IF-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_member_if_3",
				"_MEMBER-IF-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "member_if", "MEMBER-IF",
				2, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "tailp", "TAILP", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "adjoin", "ADJOIN", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_union_2", "_UNION-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_union_3", "_UNION-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_union_4", "_UNION-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "union", "UNION", 2, 2,
				false);
		new $union$BinaryFunction();
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nunion_2", "_NUNION-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nunion_3", "_NUNION-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nunion_4", "_NUNION-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nunion", "NUNION", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_intersection_2",
				"_INTERSECTION-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_intersection_3",
				"_INTERSECTION-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_intersection_4",
				"_INTERSECTION-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "intersection",
				"INTERSECTION", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nintersection_2",
				"_NINTERSECTION-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nintersection_3",
				"_NINTERSECTION-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nintersection_4",
				"_NINTERSECTION-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nintersection",
				"NINTERSECTION", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_set_difference_2",
				"_SET-DIFFERENCE-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_set_difference_3",
				"_SET-DIFFERENCE-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_set_difference_4",
				"_SET-DIFFERENCE-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "set_difference",
				"SET-DIFFERENCE", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nset_difference_2",
				"_NSET-DIFFERENCE-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nset_difference_3",
				"_NSET-DIFFERENCE-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_nset_difference_4",
				"_NSET-DIFFERENCE-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nset_difference",
				"NSET-DIFFERENCE", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "set_exclusive_or",
				"SET-EXCLUSIVE-OR", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nset_exclusive_or",
				"NSET-EXCLUSIVE-OR", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subsetp_2",
				"_SUBSETP-2", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subsetp_3",
				"_SUBSETP-3", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_subsetp_4",
				"_SUBSETP-4", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "subsetp", "SUBSETP", 2,
				2, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "acons", "ACONS", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "pairlis", "PAIRLIS", 2,
				1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_assoc_2", "_ASSOC-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_assoc_3", "_ASSOC-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_assoc_4", "_ASSOC-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "assoc", "ASSOC", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "assoc_if", "ASSOC-IF",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_rassoc_2", "_RASSOC-2",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_rassoc_3", "_RASSOC-3",
				3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "_rassoc_4", "_RASSOC-4",
				4, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "rassoc", "RASSOC", 2, 2,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "rassoc_if", "RASSOC-IF",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "getf", "GETF", 2, 1,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "putf", "PUTF", 3, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "remf", "REMF", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "last", "LAST", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "circular_list_p",
				"CIRCULAR-LIST-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "non_circular_list_p",
				"NON-CIRCULAR-LIST-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "butlast", "BUTLAST", 1,
				1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high", "nbutlast", "NBUTLAST",
				1, 1, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject eighth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.SEVEN_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject endp(SubLObject object) {
		assert CommonSymbols.NIL != Types.listp(object) : object;
		return Types.sublisp_null(object);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject fifth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.FOUR_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject first(SubLObject list) {
		return list.first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject fourth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.THREE_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 69392L)
	public static SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		SubLObject next = CommonSymbols.NIL;
		SubLObject key = CommonSymbols.NIL;
		next = plist;
		key = next.first();
		while (CommonSymbols.NIL != next) {
			if (indicator.eql(key))
				return conses_high.cadr(next);
			next = conses_high.cddr(next);
			key = next.first();
		}
		return v_default;
	}

	public static SubLObject init_conses_high_file() {
		conses_high.$sublis_watermark$ = SubLFiles.deflexical("*SUBLIS-WATERMARK*", conses_high.$int26$68);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject intersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._intersection_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._intersection_3(list1, list2, test);
		return conses_high._intersection_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 70660L)
	public static SubLObject last(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.listp(list) : list;
		assert CommonSymbols.NIL != Types.fixnump(n) : n;
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && n.isNegative())
			Errors.error(conses_high.$str59$LAST_called_with_negative_index_o, n);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		SubLObject seeker_start = list;
		SubLObject circular_seeker = CommonSymbols.NIL;
		SubLObject i;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			if (!seeker_start.isCons())
				return list;
			seeker_start = seeker_start.rest();
		}
		circular_seeker = seeker_start;
		SubLObject seeker;
		SubLObject back;
		for (seeker = CommonSymbols.NIL, back = CommonSymbols.NIL, seeker = seeker_start, back = list; seeker
				.isCons(); seeker = seeker.rest(), back = back.rest())
			if (circular_seeker.isCons()) {
				circular_seeker = circular_seeker.rest();
				if (circular_seeker.isCons()) {
					circular_seeker = circular_seeker.rest();
					if (circular_seeker.eql(back))
						return CommonSymbols.NIL;
				}
			}
		return back;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject ldiff(SubLObject list, SubLObject sublist) {
		assert CommonSymbols.NIL != Types.listp(list) : list;
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		if (list.eql(sublist))
			return CommonSymbols.NIL;
		SubLObject builder;
		SubLObject answer = builder = ConsesLow.cons(list.first(), CommonSymbols.NIL);
		SubLObject temp = CommonSymbols.NIL;
		for (list = list.rest(); !list.eql(sublist) && list.isCons(); list = list.rest()) {
			temp = ConsesLow.cons(list.first(), CommonSymbols.NIL);
			builder = ConsesLow.rplacd(builder, temp);
			builder = builder.rest();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject list_length(SubLObject list) {
		assert CommonSymbols.NIL != Types.listp(list) : list;
		if (CommonSymbols.NIL == list)
			return CommonSymbols.ZERO_INTEGER;
		if (CommonSymbols.NIL == list.rest())
			return CommonSymbols.ONE_INTEGER;
		SubLObject slow;
		SubLObject fast;
		SubLObject length;
		for (slow = CommonSymbols.NIL, fast = CommonSymbols.NIL, length = CommonSymbols.NIL, slow = list
				.rest(), fast = conses_high.cddr(list), length = CommonSymbols.TWO_INTEGER; !fast.eql(slow); slow = slow
						.rest(), fast = conses_high
								.cddr(fast), length = Numbers.add(CommonSymbols.TWO_INTEGER, length)) {
			if (CommonSymbols.NIL == fast)
				return length;
			if (CommonSymbols.NIL == fast.rest())
				return Numbers.add(CommonSymbols.ONE_INTEGER, length);
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject member(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list) : list;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._member_4(item, list, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._member_3(item, list, test);
		return conses_high._member_2(item, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject member_if(SubLObject test, SubLObject list, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list) : list;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._member_if_3(test, list, key);
		return conses_high._member_if_2(test, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 73114L)
	public static SubLObject nbutlast(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.listp(list) : list;
		assert CommonSymbols.NIL != Types.fixnump(n) : n;
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && n.isNegative())
			Errors.error(conses_high.$str61$NBUTLAST_called_with_negative_ind, n);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		SubLObject seeker_start = list;
		SubLObject circular_seeker = CommonSymbols.NIL;
		SubLObject i;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			if (!seeker_start.isCons())
				return CommonSymbols.NIL;
			seeker_start = seeker_start.rest();
		}
		if (!seeker_start.isCons())
			return CommonSymbols.NIL;
		seeker_start = circular_seeker = seeker_start.rest();
		SubLObject seeker;
		SubLObject back;
		for (seeker = CommonSymbols.NIL, back = CommonSymbols.NIL, seeker = seeker_start, back = list; seeker
				.isCons(); seeker = seeker.rest(), back = back.rest())
			if (circular_seeker.isCons()) {
				circular_seeker = circular_seeker.rest();
				if (circular_seeker.isCons()) {
					circular_seeker = circular_seeker.rest();
					if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
							&& circular_seeker.eql(back))
						Errors.error(conses_high.$str62$NBUTLAST_called_on_circular_list);
				}
			}
		ConsesLow.rplacd(back, CommonSymbols.NIL);
		return list;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nintersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nintersection_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._nintersection_3(list1, list2, test);
		return conses_high._nintersection_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject ninth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.EIGHT_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 72813L)
	public static SubLObject non_circular_list_p(SubLObject object) {
		return SubLObjectFactory
				.makeBoolean(object.isList() && CommonSymbols.NIL == conses_high.circular_list_p(object));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nreconc(SubLObject list1, SubLObject list2) {
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		if (CommonSymbols.NIL == list2)
			return Sequences.nreverse(list1);
		if (CommonSymbols.NIL == list1)
			return list2;
		SubLObject next = list1.rest();
		SubLObject temp = CommonSymbols.NIL;
		list1 = ConsesLow.rplacd(list1, list2);
		while (next.isCons()) {
			temp = next.rest();
			list1 = ConsesLow.rplacd(next, list1);
			next = temp;
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nset_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL == list2)
			return list1;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nset_difference_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._nset_difference_3(list1, list2, test);
		return conses_high._nset_difference_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nset_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		return ConsesLow.nconc(conses_high.set_difference(list1, list2, test, key),
				conses_high.set_difference(list2, list1, test, key));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nsublis_4(alist, tree, test, key);
		if (CommonSymbols.NIL == alist)
			return tree;
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._nsublis_3(alist, tree, test);
		return conses_high._nsublis_2(alist, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nsubst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nsubst_5(v_new, old, tree, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._nsubst_4(v_new, old, tree, test);
		return conses_high._nsubst_3(v_new, old, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nsubst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nsubst_if_4(v_new, test, tree, key);
		return conses_high._nsubst_if_3(v_new, test, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nthcdr(SubLObject n, SubLObject list) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.fixnump(n) : n;
		assert CommonSymbols.NIL != Types.listp(list) : list;
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && n.isNegative())
			Errors.error(conses_high.$str11$_S_must_be_a_non_negative_integer, n);
		SubLObject i;
		for (i = CommonSymbols.NIL, i = CommonSymbols.ZERO_INTEGER; i
				.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
			if (CommonSymbols.NIL == list)
				return CommonSymbols.NIL;
			list = list.rest();
		}
		return list;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject nunion(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return list2;
		if (CommonSymbols.NIL == list2)
			return list1;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._nunion_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._nunion_3(list1, list2, test);
		return conses_high._nunion_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject pairlis(SubLObject keys, SubLObject data, SubLObject alist) {
		if (alist == CommonSymbols.UNPROVIDED)
			alist = CommonSymbols.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		assert CommonSymbols.NIL != Types.listp(keys) : keys;
		assert CommonSymbols.NIL != Types.listp(data) : data;
		SubLObject rest_keys;
		SubLObject rest_data;
		for (rest_keys = CommonSymbols.NIL, rest_data = CommonSymbols.NIL, rest_keys = keys, rest_data = data; CommonSymbols.NIL != rest_keys
				&& CommonSymbols.NIL != rest_data; rest_keys = rest_keys.rest(), rest_data = rest_data.rest())
			alist = conses_high.acons(rest_keys.first(), rest_data.first(), alist);
		if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (CommonSymbols.NIL != rest_keys || CommonSymbols.NIL != rest_data))
			Errors.error(conses_high.$str52$PAIRLIS_was_called_with_lists_of_);
		return alist;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 69776L)
	public static SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value) {
		SubLObject back = CommonSymbols.NIL;
		SubLObject next = CommonSymbols.NIL;
		SubLObject key = CommonSymbols.NIL;
		back = CommonSymbols.NIL;
		next = plist;
		key = next.first();
		while (CommonSymbols.NIL != next) {
			if (indicator.eql(key)) {
				ConsesLow.rplaca(next.rest(), value);
				return plist;
			}
			back = next.rest();
			next = conses_high.cddr(next);
			key = next.first();
		}
		if (CommonSymbols.NIL != back) {
			ConsesLow.rplacd(back, ConsesLow.list(indicator, value));
			return plist;
		}
		return ConsesLow.listS(indicator, value, plist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject rassoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(alist) : alist;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._rassoc_4(item, alist, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._rassoc_3(item, alist, test);
		return conses_high._rassoc_2(item, alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject rassoc_if(SubLObject predicate, SubLObject alist) {
		assert CommonSymbols.NIL != Types.function_spec_p(predicate) : predicate;
		assert CommonSymbols.NIL != Types.listp(alist) : alist;
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		SubLObject rest = CommonSymbols.NIL;
		SubLObject entry = CommonSymbols.NIL;
		rest = alist;
		entry = rest.first();
		while (CommonSymbols.NIL != rest) {
			if (CommonSymbols.NIL != entry && CommonSymbols.NIL != Functions.funcall(predicate, entry.rest()))
				return entry;
			rest = rest.rest();
			entry = rest.first();
		}
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 70244L)
	public static SubLObject remf(SubLObject plist, SubLObject indicator) {
		SubLObject back = CommonSymbols.NIL;
		SubLObject next = CommonSymbols.NIL;
		SubLObject key = CommonSymbols.NIL;
		back = CommonSymbols.NIL;
		next = plist;
		key = next.first();
		while (CommonSymbols.NIL != next)
			if (indicator.eql(key)) {
				if (CommonSymbols.NIL != back) {
					ConsesLow.rplacd(back, conses_high.cddr(next));
					return plist;
				}
				return conses_high.cddr(next);
			} else {
				back = next.rest();
				next = conses_high.cddr(next);
				key = next.first();
			}
		return plist;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject rest(SubLObject list) {
		return list.rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject revappend(SubLObject list1, SubLObject list2) {
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		if (CommonSymbols.NIL == list2)
			return Sequences.reverse(list1);
		if (CommonSymbols.NIL == list1)
			return list2;
		SubLObject answer = list2;
		SubLObject cdolist_list_var = list1;
		SubLObject item = CommonSymbols.NIL;
		item = cdolist_list_var.first();
		while (CommonSymbols.NIL != cdolist_list_var) {
			answer = ConsesLow.cons(item, answer);
			cdolist_list_var = cdolist_list_var.rest();
			item = cdolist_list_var.first();
		}
		return answer;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject second(SubLObject list) {
		return conses_high.cadr(list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject set_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		if (CommonSymbols.NIL == list2)
			return list1;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._set_difference_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._set_difference_3(list1, list2, test);
		return conses_high._set_difference_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject set_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		return ConsesLow.append(conses_high.set_difference(list1, list2, test, key),
				conses_high.set_difference(list2, list1, test, key));
	}

	public static SubLObject setup_conses_high_file() {
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list0);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list2);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list3);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list5);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list6);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list7);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list8);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list9);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list12);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list14);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list16);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list18);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list19);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list20);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list21);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list22);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list23);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list24);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list25);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list27);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list28);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list29);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list30);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list31);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list32);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list33);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list34);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list35);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list36);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list37);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list38);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list39);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list40);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list41);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list42);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list43);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list44);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list45);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list46);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list47);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list48);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list49);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list50);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list51);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list53);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list54);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list55);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list56);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list57);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list58);
		SubLSpecialOperatorDeclarations.proclaim(conses_high.$list60);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject seventh(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.SIX_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject sixth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.FIVE_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject sublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._sublis_4(alist, tree, test, key);
		if (CommonSymbols.NIL == alist)
			return tree;
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._sublis_3(alist, tree, test);
		return conses_high._sublis_2(alist, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject subsetp(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.T;
		if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._subsetp_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._subsetp_3(list1, list2, test);
		return conses_high._subsetp_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject subst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._subst_5(v_new, old, tree, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._subst_4(v_new, old, tree, test);
		return conses_high._subst_3(v_new, old, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject subst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._subst_if_4(v_new, test, tree, key);
		return conses_high._subst_if_3(v_new, test, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject tailp(SubLObject sublist, SubLObject list) {
		assert CommonSymbols.NIL != Types.listp(list) : list;
		SubLObject rest;
		for (rest = CommonSymbols.NIL, rest = list; !rest.isAtom(); rest = rest.rest())
			if (sublist.eql(rest))
				return CommonSymbols.T;
		return Equality.eql(sublist, rest);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject tenth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.NINE_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject third(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.TWO_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject tree_equal(SubLObject tree1, SubLObject tree2, SubLObject test) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._tree_equal_3(tree1, tree2, test);
		return conses_high._tree_equal_2(tree1, tree2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1939L)
	public static SubLObject union(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		assert CommonSymbols.NIL != Types.listp(list1) : list1;
		assert CommonSymbols.NIL != Types.listp(list2) : list2;
		assert CommonSymbols.NIL != Types.function_spec_p(test) : test;
		assert CommonSymbols.NIL != Types.function_spec_p(key) : key;
		if (CommonSymbols.NIL == list1)
			return list2;
		if (CommonSymbols.NIL == list2)
			return list1;
		if (!Symbols.symbol_function(CommonSymbols.IDENTITY).eql(key))
			return conses_high._union_4(list1, list2, test, key);
		if (!Symbols.symbol_function(CommonSymbols.EQL).eql(test))
			return conses_high._union_3(list1, list2, test);
		return conses_high._union_2(list1, list2);
	}

	public void declareFunctions() {
		conses_high.declare_conses_high_file();
	}

	public void initializeVariables() {
		conses_high.init_conses_high_file();
	}

	public void runTopLevelForms() {
		conses_high.setup_conses_high_file();
	}
}
