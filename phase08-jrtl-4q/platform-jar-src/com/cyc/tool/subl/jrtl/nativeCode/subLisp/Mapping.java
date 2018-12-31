//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Mapping extends SubLTrampolineFile {
	public static SubLFile me;

	static {
		Mapping.me = new Mapping();
	}

	public static SubLObject mapc(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return list.toList().mapcar(function.getFunc(), moreLists, false);
	}

	public static SubLObject mapcan(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Functions.apply(CommonSymbols.NCONC, Mapping.mapcar(function, list, moreLists).toList(),
				Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapcar(SubLObject functionSpec, SubLObject list) {
		return Mapping.mapcar(functionSpec, list, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapcar(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return list.toList().mapcar(function.getFunc(), moreLists, true);
	}

	public static SubLObject mapcon(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Functions.apply(CommonSymbols.NCONC, Mapping.maplist(function, list, moreLists).toList(),
				Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapl(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Errors.unimplementedMethod("Mapping.mapl()");
	}

	public static SubLObject maplist(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Errors.unimplementedMethod("Mapping.maplist()");
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Mapping.me, "mapc", "MAPC", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcan", "MAPCAN", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcar", "MAPCAR", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcon", "MAPCON", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapl", "MAPL", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "maplist", "MAPLIST", 2, 0, true);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}
