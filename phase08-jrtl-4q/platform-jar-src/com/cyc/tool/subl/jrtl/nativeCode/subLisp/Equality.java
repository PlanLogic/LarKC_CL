//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Equality implements SubLFile {
	public static Equality me;

	static {
		Equality.me = new Equality();
	}

	public static SubLObject eq(SubLObject x, SubLObject y) {
		if (x == y)
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject eql(SubLObject x, SubLObject y) {
		if (x.eql(y))
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject equal(SubLObject x, SubLObject y) {
		if (x.equal(y))
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject equalp(SubLObject x, SubLObject y) {
		if (x.equalp(y))
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject identity(SubLObject object) {
		return object;
	}

	public static SubLObject pointer(SubLObject object) {
		return SubLObjectFactory.makeInteger(object.hashCode());
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Equality.me, "eq", "EQ", 2, 0, false);
		SubLFiles.declareFunction(Equality.me, "eql", "EQL", 2, 0, false);
		SubLFiles.declareFunction(Equality.me, "equal", "EQUAL", 2, 0, false);
		SubLFiles.declareFunction(Equality.me, "equalp", "EQUALP", 2, 0, false);
		SubLFiles.declareFunction(Equality.me, "identity", "IDENTITY", 1, 0, false);
		SubLFiles.declareFunction(Equality.me, "pointer", "POINTER", 1, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}
