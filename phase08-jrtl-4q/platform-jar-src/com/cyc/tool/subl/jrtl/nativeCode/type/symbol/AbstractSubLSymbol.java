//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.util.LinkedHashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;

public abstract class AbstractSubLSymbol extends AbstractSubLObject implements SubLSymbol {
	private static int MAX_CANONICALIZER_CACHE_SIZE = 5000;

	private static SubLString GENTEMP_PREFIX;

	private static SubLString GENSYM_PREFIX;

	private static Map<String, String> symbolCanonicalizerCache;

	private static char[] printableNonStandardSymbolChars;

	static {
		GENTEMP_PREFIX = SubLObjectFactory.makeString("T");
		GENSYM_PREFIX = SubLObjectFactory.makeString("G");
		symbolCanonicalizerCache = new LinkedHashMap<String, String>(5001, 0.75f, true) {

			public boolean removeEldestEntry(Map.Entry eldest) {
				return this.size() > 5000;
			}
		};
		printableNonStandardSymbolChars = new char[] { '#', ':', ';', '|', '\"', '\'', '`', ',', '(', ')', '\\' };
	}

	public static String canonicalizeName(String name) {
		String canonicalizedName = AbstractSubLSymbol.symbolCanonicalizerCache.get(name);
		if (canonicalizedName != null)
			return canonicalizedName;
		canonicalizedName = name;
		if (!doesSymbolNameNeedQuotes(canonicalizedName)) {
			AbstractSubLSymbol.symbolCanonicalizerCache.put(name, canonicalizedName.toUpperCase());
			return canonicalizedName;
		}
		boolean hasQuotes;
		boolean hasExplicitQuotes = hasQuotes = canonicalizedName.charAt(0) == '|';
		if (canonicalizedName.indexOf(92) >= 0) {
			char[] origChars = canonicalizedName.toCharArray();
			char curChar = '\uffff';
			char prevChar = '\uffff';
			int newSize = 0;
			for (int i = 0, size = origChars.length; i < size; ++i) {
				curChar = origChars[i];
				if (prevChar != '\\')
					origChars[newSize++] = Character.toUpperCase(curChar);
				else {
					origChars[newSize - 1] = curChar;
					if (!isConstituentUpperCaseChar(curChar) && !hasQuotes)
						hasQuotes = true;
				}
				prevChar = curChar;
			}
			canonicalizedName = new String(origChars, 0, newSize);
		} else if (!hasExplicitQuotes)
			canonicalizedName = canonicalizedName.toUpperCase();
		if (hasQuotes && !hasExplicitQuotes)
			canonicalizedName = "|" + canonicalizedName + "|";
		if (hasQuotes) {
			String innerName = canonicalizedName.substring(1, canonicalizedName.length() - 1);
			if (!doesSymbolNameNeedQuotes(innerName))
				canonicalizedName = innerName;
		}
		AbstractSubLSymbol.symbolCanonicalizerCache.put(name, canonicalizedName);
		return canonicalizedName;
	}

	public static boolean doesSymbolNameNeedQuotes(String symbolName) {
		for (int i = 0, size = symbolName.length(); i < size; ++i) {
			char curChar = symbolName.charAt(i);
			if (!isConstituentUpperCaseChar(curChar))
				return true;
		}
		return false;
	}

	public static SubLObject gensym(SubLObject val) {
		StringBuilder buf = new StringBuilder();
		if (val == SubLNil.NIL) {
			buf.append(AbstractSubLSymbol.GENSYM_PREFIX.getString());
			buf.append(Symbols.$gensym_counter$.getValue().intValue());
			Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
		} else if (val.isString()) {
			buf.append(val.getString());
			buf.append(Symbols.$gensym_counter$.getValue().intValue());
			Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
		} else if (val.isFixnum()) {
			buf.append(AbstractSubLSymbol.GENSYM_PREFIX.getString());
			buf.append(val.intValue());
			Symbols.$gensym_counter$.setValue(val);
		} else
			Errors.error("Invalid argument to gensym -- exptected NIL, a string or a fixnum.\n Got: " + val + ".");
		SubLSymbol symbol = SubLObjectFactory.makeUninternedSymbol(buf.toString());
		return symbol;
	}

	public static synchronized SubLObject gentemp(SubLObject prefix, SubLPackage thePackage) {
		SubLString prefixTyped = prefix == SubLNil.NIL ? AbstractSubLSymbol.GENTEMP_PREFIX : prefix.toStr();
		int counterVal = Symbols.$gentemp_counter$.getValue().intValue();
		String pre = prefixTyped.getString();
		SubLSymbol symbol = null;
		String curSymbolName;
		do
			curSymbolName = pre + counterVal++;
		while (null != (symbol = thePackage.retrieveSymbol(SubLObjectFactory.makeString(curSymbolName))));
		Symbols.$gentemp_counter$.setValue(SubLObjectFactory.makeInteger(counterVal));
		return SubLObjectFactory.makeSymbol(curSymbolName, thePackage);
	}

	private static CharSequence getSymbolStringRep(String str, boolean isSpecial) {
		if (isSpecial)
			new StringBuilder(124).append(str.contains("|") ? str.replaceAll("|", "\\|") : str).append('|').toString();
		return str.contains("|") ? str.replaceAll("|", "\\|") : str;
	}

	public static boolean isConstituentChar(char curChar) {
		if (curChar <= ' ' || curChar >= '\u007f')
			return false;
		for (int j = 0, size2 = AbstractSubLSymbol.printableNonStandardSymbolChars.length; j < size2; ++j)
			if (curChar == AbstractSubLSymbol.printableNonStandardSymbolChars[j])
				return false;
		return true;
	}

	public static boolean isConstituentUpperCaseChar(char curChar) {
		return isConstituentChar(curChar) && (curChar < 'a' || curChar > 'z');
	}

	private int hashCode;
	protected volatile SubLObject value;
	private SubLPackage thePackage;
	private SubLString symbolName;
	private boolean isSpecialSymbolName;
	private boolean hasCheckedSymbolStatus;
	protected SubLOperator operator;
	private volatile SubLList plist;

	AbstractSubLSymbol(SubLString symbolName, SubLPackage thePackage) {
		hashCode = -1;
		value = SubLSymbol.UNBOUND;
		isSpecialSymbolName = false;
		hasCheckedSymbolStatus = false;
		plist = SubLNil.NIL;
		this.thePackage = thePackage;
		this.symbolName = symbolName;
		hashCode = (thePackage == null ? 0 : thePackage.hashCode()) ^ symbolName.hashCode();
		if (thePackage == SubLPackage.KEYWORD_PACKAGE && !this.isKeyword())
			Errors.error("Got invalid keyword: '" + thePackage + ":" + symbolName + "'");
	}

	public boolean boundp() {
		return value != SubLSymbol.UNBOUND || thePackage == SubLPackage.KEYWORD_PACKAGE;
	}

	public boolean canFastHash() {
		return true;
	}

	public Object clone() {
		return this;
	}

	public boolean fboundp() {
		return operator != SubLSymbol.UNBOUND;
	}

	public void forceGlobalValue(SubLObject newValue) {
		value = newValue;
	}

	protected SubLSymbol getBindingType() {
		return CommonSymbols.LEXICAL;
	}

	public SubLFunction getFunc() {
		if (operator == SubLSymbol.UNBOUND)
			Errors.error(this + " is not fboundp.");
		return operator.getFunc();
	}

	public SubLOperator getFunction() {
		if (operator == SubLSymbol.UNBOUND)
			Errors.error(this + " is not fboundp.");
		return operator;
	}

	public String getName() {
		return symbolName.getString();
	}

	public SubLPackage getPackage() {
		return thePackage;
	}

	private CharSequence getPackageName() {
		return thePackage == null ? "#" : thePackage.getName();
	}

	private CharSequence getPackageNamePrecise() {
		return getPackageName();
	}

	public SubLList getPlist() {
		return plist;
	}

	public SubLObject getProperty(SubLObject indicator) {
		SubLList thePlist = plist;
		synchronized (thePlist) {
			return thePlist.getf(indicator, null);
		}
	}

	public SubLStream getStream(boolean followSynonymStream) {
		Errors.error("SubLSymbol " + this + " is not a stream");
		return null;
	}

	public SubLString getSubLName() {
		return symbolName;
	}

	private CharSequence getSymbolName() {
		return getSymbolStringRep(getName(), isSpecialSymbol(getName()));
	}

	private CharSequence getSymbolNamePrecise() {
		return getSymbolStringRep(getName(), isSpecialSymbol(getName()));
	}

	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	public int hashCode(int currentDepth) {
		return hashCode;
	}

	public abstract boolean isDynamic();

	private boolean isSpecialSymbol(CharSequence str) {
		if (hasCheckedSymbolStatus) {
			return isSpecialSymbolName;
		}
		for (int i = 0, size = str.length(); i < size; ++i) {
			char curChar = str.charAt(i);
			if ((i == 0) && (curChar == '?')) {
				int j = 0;
			}
			if ((curChar == '#') || (curChar == '\"') || (curChar == '\'') || (curChar == '(') || (curChar == ')')
					|| (curChar == ',') || (curChar == ';') || (curChar == '\\') || (curChar == '`')) {
				boolean b = true;
				hasCheckedSymbolStatus = b;
				return isSpecialSymbolName = b;
			}
			if (Character.isWhitespace(curChar)) {
				boolean b2 = true;
				hasCheckedSymbolStatus = b2;
				return isSpecialSymbolName = b2;
			}
			if (Character.isLetter(curChar) && Character.isLowerCase(curChar)) {
				boolean b3 = true;
				hasCheckedSymbolStatus = b3;
				return isSpecialSymbolName = b3;
			}
		}
		hasCheckedSymbolStatus = true;
		return isSpecialSymbolName = false;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public String possiblyToFullString() {
		SubLPackage pack = getPackage();
		if (pack == null)
			return getSymbolNamePrecise().toString();
		boolean isInPackage = SubLPackage.getCurrentPackage() == pack;
		boolean isExported = pack.isExported(this);
		if (!isInPackage)
			for (SubLList cur = SubLPackage.getCurrentPackage().getUsesPackagesList(); cur != SubLNil.NIL; cur = cur
					.rest().toList())
				if (cur.first().toPackage().isExported(this)) {
					isInPackage = true;
					isExported = true;
					break;
				}
		if (isInPackage)
			return getSymbolNamePrecise().toString();
		if (isExported)
			return getPackageNamePrecise() + ":" + getSymbolNamePrecise();
		return getPackageNamePrecise() + ":" + ":" + getSymbolNamePrecise();
	}

	public void removeProperty(SubLObject indicator) {
		SubLList thePlist = plist;
		synchronized (thePlist) {
			plist = thePlist.remf(indicator);
		}
	}

	public void setConstantValue(SubLObject value) {
		Errors.error("Can't set the value of a constant symbol: " + this);
	}

	public void setFunction(SubLOperator func) {
		operator = func;
	}

	public void setPackage(SubLPackage thePackage) {
		this.thePackage = thePackage;
	}

	public void setProperty(SubLObject indicator, SubLObject value) {
		SubLList thePlist = plist;
		synchronized (thePlist) {
			plist = thePlist.putf(indicator, value);
		}
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		return getStream(false).toInputBinaryStream();
	}

	public SubLInputStream toInputStream() {
		return getStream(false).toInputStream();
	}

	public SubLInputTextStream toInputTextStream() {
		return getStream(false).toInputTextStream();
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		return getStream(false).toOutputBinaryStream();
	}

	public SubLOutputStream toOutputStream() {
		return getStream(false).toOutputStream();
	}

	public SubLOutputTextStream toOutputTextStream() {
		return getStream(false).toOutputTextStream();
	}

	public String toString() {
		if (this.isKeyword())
			return ":" + getSymbolNamePrecise();
		SubLPackage pack = null;
		try {
			pack = SubLPackage.getCurrentPackage();
		} catch (Exception e) {
			return getPackageNamePrecise() + ":" + ":" + getSymbolNamePrecise();
		}
		if (pack == null)
			return "#:" + getSymbolNamePrecise();
		if (pack.retrieveSymbol(getSubLName()) == null)
			return getPackageNamePrecise() + ":" + ":" + getSymbolNamePrecise();
		return possiblyToFullString().toString();
	}
}
