//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class SubLSymbolFactory {
	public static SubLSymbol makeKeyword(String symbolName) {
		SubLSymbol result = makeSymbol(symbolName, SubLPackage.KEYWORD_PACKAGE);
		return result;
	}

	public static SubLSymbol makeKeyword(SubLString symbolName) {
		SubLSymbol result = makeSymbol(symbolName, SubLPackage.KEYWORD_PACKAGE);
		return result;
	}

	public static SubLPackage makePackage(SubLString name, SubLList usedPackagesList, SubLList nickNames) {
		return new SubLPackage(name, usedPackagesList, nickNames);
	}

	public static SubLPackageIterator makePackageIterator(SubLPackage thePackage) {
		return new SubLPackageIterator(thePackage);
	}

	public static SubLSymbol makeSymbol(String symbolName) {
		SubLSymbol result = makeSymbol(symbolName, SubLPackage.getCurrentPackage());
		return result;
	}

	public static SubLSymbol makeSymbol(String symbolName, String packageName) {
		if (packageName == null)
			return makeSymbol(symbolName, (SubLPackage) null);
		packageName = AbstractSubLSymbol.canonicalizeName(packageName);
		SubLPackage thePackage = SubLPackage.findPackageNamed(packageName);
		if (thePackage == null)
			Errors.error("Unkown package: " + packageName + ".");
		SubLSymbol result = makeSymbol(symbolName, thePackage);
		return result;
	}

	public static SubLSymbol makeSymbol(String symbolName, SubLPackage thePackage) {
		if (thePackage == null)
			return new SubLSymbolImpl(symbolName, thePackage);
		return thePackage.intern(SubLObjectFactory.makeString(symbolName), false);
	}

	public static SubLSymbol makeSymbol(SubLString symbolName) {
		SubLSymbol result = makeSymbol(symbolName, SubLPackage.getCurrentPackage());
		return result;
	}

	public static SubLSymbol makeSymbol(SubLString symbolName, SubLPackage thePackage) {
		if (thePackage == null)
			return new SubLSymbolImpl(symbolName, thePackage);
		return thePackage.intern(symbolName, false);
	}

	public static SubLSymbol makeUninternedSymbol(String symbolName) {
		SubLSymbol result = makeSymbol(SubLObjectFactory.makeString(symbolName), null);
		return result;
	}

	public static SubLSymbol makeUninternedSymbol(SubLString symbolName) {
		SubLSymbol result = makeSymbol(symbolName, null);
		return result;
	}
}
