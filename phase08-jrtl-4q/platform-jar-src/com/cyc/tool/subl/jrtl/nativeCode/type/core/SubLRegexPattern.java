//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLRegexPattern extends AbstractSubLObject implements SubLObject, CommonSymbols {
	public static String REGEX_PATTERN_NAME = "REGEX-PATTERN";

	private static int REGEX_COMPOPT_ANCHORED = 16;
	private static int REGEX_COMPOPT_CASELESS = 1;
	private static int REGEX_COMPOPT_DOLLAR_END_ONLY = 32;
	private static int REGEX_COMPOPT_DOTALL = 4;
	private static int REGEX_COMPOPT_EXTEND = 8;
	private static int REGEX_COMPOPT_MULTILINE = 2;
	private static int REGEX_COMPOPT_EXTRA = 64;
	private static int REGEX_COMPOPT_UNGREEDY = 512;
	private static int REGEX_COMPOPT_UTF8 = 2048;
	private static int REGEX_COMPOPT_NO_AUTO_CAPTURE = 4096;
	private static int REGEX_COMPOPT_NO_UTF8_CHECK = 8192;
	private String patternStr;
	private Pattern pattern;
	private Matcher matcher;

	public SubLRegexPattern(String patternStr, int options) {
		int newOptions = 0;
		if ((options & 0x10) != 0x0)
			Errors.error("*regex-comopt-anchored* is not supported.");
		if ((options & 0x1) != 0x0)
			newOptions |= 0x2;
		if ((options & 0x20) != 0x0)
			Errors.error("*regex-compopt-dollar-endonly* is not supported.");
		if ((options & 0x4) != 0x0)
			newOptions |= 0x20;
		if ((options & 0x8) != 0x0)
			newOptions |= 0x4;
		if ((options & 0x2) != 0x0)
			newOptions |= 0x8;
		if ((options & 0x40) != 0x0)
			Errors.error("*regex-compopt-extra* is not supported.");
		if ((options & 0x200) != 0x0)
			Errors.error("*regex-compopt-ungreedy* is not supported.");
		if ((options & 0x800) != 0x0) {
		}
		if ((options & 0x1000) != 0x0)
			Errors.error("*regex-compopt-no-auto-capture* is not supported.");
		if ((options & 0x2000) != 0x0)
			Errors.error("*regex-compopt-no-utf8-check* is not supported.");
		this.patternStr = patternStr;
		this.pattern = Pattern.compile(patternStr, newOptions);
		this.matcher = this.pattern.matcher("");
	}

	public boolean canFastHash() {
		return true;
	}

	public ArrayList<String> getAllMatches(CharSequence str, int options, int maxNumMatches) {
		if (options != 0)
			Errors.error("No options supported on regex match under this implementation.");
		this.matcher.reset(str);
		ArrayList<String> result = new ArrayList<String>();
		int nFound = 0;
		while (nFound < maxNumMatches && this.matcher.find()) {
			int start = this.matcher.start();
			int end = this.matcher.end();
			result.add(str.subSequence(start, end).toString());
			++nFound;
			for (int i = 1, size = this.matcher.groupCount(); i <= size && nFound < maxNumMatches; ++nFound, ++i) {
				start = this.matcher.start(i);
				end = this.matcher.end(i);
				result.add(str.subSequence(start, end).toString());
			}
		}
		return result;
	}

	public ArrayList<Integer> getAllMatchesOffsets(CharSequence str, int options, int maxNumMatches) {
		if (options != 0)
			Errors.error("No options supported on regex match under this implementation.");
		this.matcher.reset(str);
		ArrayList<Integer> result = new ArrayList<Integer>();
		int nFound = 0;
		if (nFound < maxNumMatches && this.matcher.find()) {
			int start = this.matcher.start();
			int end = this.matcher.end();
			result.add(new Integer(start));
			result.add(new Integer(end));
			++nFound;
			for (int i = 1, size = this.matcher.groupCount(); i <= size && nFound < maxNumMatches; ++nFound, ++i) {
				start = this.matcher.start(i);
				end = this.matcher.end(i);
				result.add(new Integer(start));
				result.add(new Integer(end));
			}
		}
		return result;
	}

	public SubLSymbol getType() {
		return Types.$dtp_alien$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTEEN_INTEGER;
	}

	public int hashCode(int depth) {
		return super.superHash();
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return true;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLRegexPattern toRegexPattern() {
		return this;
	}

	public String toString() {
		return new String(
				"<#" + this.toTypeName() + " pattern: \"" + this.patternStr + "\" @" + this.hashCode(0) + ">");
	}

	public String toTypeName() {
		return "REGEX-PATTERN";
	}
}
