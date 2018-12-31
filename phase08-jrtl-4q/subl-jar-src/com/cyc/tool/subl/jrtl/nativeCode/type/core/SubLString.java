//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Arrays;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public class SubLString extends AbstractSubLArraySequence implements SubLObject, SubLSequence, Cloneable, CharSequence {
	private SubLString(char[] chars) {
		buf = null;
		string = null;
		hash = 0;
		buf = chars;
	}

	private SubLString(char[] chars, int length) {
		buf = null;
		string = null;
		hash = 0;
		if (chars.length < length)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, 0, buf = new char[length], 0, length);
	}

	private SubLString(char[] chars, int start, int end) {
		buf = null;
		string = null;
		hash = 0;
		int size = end - start;
		if (chars.length < size)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, start, buf = new char[size], 0, size);
	}

	SubLString(int length, char defaultChar) {
		buf = null;
		string = null;
		hash = 0;
		if (length < 0)
			Errors.error("Attempt to create string with negative size: " + length);
		Arrays.fill(buf = new char[length], defaultChar);
	}

	SubLString(String str) {
		buf = null;
		string = null;
		hash = 0;
		if (str == null)
			str = "";
		buf = null;
		string = str;
	}

	public static String convertSubLStringToJavaString(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		result = result.replaceAll("\\$", "\\\\\\$");
		return result;
	}

	public static String escapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		return result.replaceAll("\\\"", "\\\\\\\"");
	}

	public static String unescapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\\\\"", "\\\"");
		return result.replaceAll("\\\\\\\\", "\\\\");
	}

	private char[] buf;
	private String string;
	int hash;
	public static String STRING_TYPE_NAME = "STRING";
	public static int UPCHAR_OFFSET = -32;

	private int calCharsToTrim(SubLSequence charsToTrim, boolean atStart) {
		int result = 0;
		if (atStart)
			for (int i = 0, size = this.size(); i < size
					&& charsToTrim.positionOf(SubLCharacter.charArray[charAt(i)]) >= 0; ++i)
				++result;
		else
			for (int i = this.size() - 1; i >= 0
					&& charsToTrim.positionOf(SubLCharacter.charArray[charAt(i)]) >= 0; --i)
				++result;
		return result;
	}

	private int internalSize() {
		if (buf == null)
			return string.length();
		return buf.length;
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	public SubLString capitalize(boolean isDestructive) {
		return this.capitalize(isDestructive, 0, this.size());
	}

	public SubLString capitalize(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		boolean lastWasAlphNumeric = false;
		for (int i = start; i < end; ++i) {
			if (lastWasAlphNumeric)
				result.setChar(i, Character.toLowerCase(result.charAt(i)));
			else
				result.setChar(i, Character.toUpperCase(result.charAt(i)));
			lastWasAlphNumeric = Character.isLetterOrDigit(result.charAt(i));
		}
		return result;
	}

	@Override
	public char charAt(int index) {
		if (buf == null)
			return string.charAt(index);
		return buf[index];
	}

	@Override
	public Object clone() {
		return makeCopy();
	}

	public int compare(SubLString compareString, SubLCharacter.CharCompareDesc compareDesc, int start1, int start2,
			int end1, int end2) {
		int curIndex1;
		start1 = curIndex1 = start1 < 0 ? 0 : start1;
		int curIndex2;
		start2 = curIndex2 = start2 < 0 ? 0 : start2;
		int size = this.size();
		int compareSize = compareString.internalSize();
		int fin1 = end1 > size ? size : end1;
		int fin2 = end2 > compareSize ? compareSize : end2;
		if (fin1 < 0)
			fin1 = size;
		if (fin2 < 0)
			fin2 = compareSize;
		int answer = 0;
		if (!compareDesc.isCaseSensitive())
			while (curIndex1 < fin1 && curIndex2 < fin2
					&& SubLCharacter.caseInsensitiveConvert(charAt(curIndex1)) == SubLCharacter
							.caseInsensitiveConvert(compareString.charAt(curIndex2))) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		else
			while (curIndex1 < fin1 && curIndex2 < fin2 && charAt(curIndex1) == compareString.charAt(curIndex2)) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		if (curIndex1 != fin1 && curIndex2 != fin2) {
			if (!compareDesc.compare(charAt(curIndex1), compareString.charAt(curIndex2)))
				answer = -1;
		} else
			answer = compareDesc.process(answer, fin1 - curIndex1, fin2 - curIndex2);
		return answer >= 0 ? answer + start1 : answer;
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		int size = internalSize();
		if (buf == null)
			buf = string.toCharArray();
		for (int i = endIndexExclusive, j = startIndex; i < size; ++i, ++j)
			buf[j] = buf[i];
		size -= deleteCount;
		char[] oldbuf = buf;
		System.arraycopy(oldbuf, 0, buf = new char[size], 0, size);
		setMutated();
		return this;
	}

	@Override
	public boolean equal(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (charAt(i) != other.charAt(i))
				return false;
		return true;
	}

	@Override
	public boolean equalp(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (Character.toUpperCase(charAt(i)) != Character.toUpperCase(other.charAt(i)))
				return false;
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof CharSequence))
			return false;
		CharSequence obj2 = (CharSequence) obj;
		if (length() != obj2.length())
			return false;
		for (int i = 0, size = obj2.length(); i < size; ++i)
			if (charAt(i) != obj2.charAt(i))
				return false;
		return true;
	}

	@Override
	public SubLObject get(int index) {
		return SubLCharacter.charArray[charAt(index)];
	}

	public char getChar(int index) {
		return charAt(index);
	}

	@Override
	public SubLCharacter getCharacter(int index) {
		return SubLCharacter.charArray[charAt(index)];
	}

	@Override
	public String getFileDesignator() {
		return getString();
	}

	@Override
	public String getString() {
		if (string == null)
			string = new String(buf, 0, buf.length);
		return string;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_string$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_TWO_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		int h = hash;
		if (h == 0) {
			for (int i = 0, curSize = this.size(); i < curSize; ++i) {
				char curChar = charAt(i);
				h = 31 * h + (curChar >= 'a' && curChar <= 'z' ? curChar - 32 : curChar);
			}
			hash = h;
		}
		return h;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isArrayBased() {
		return true;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return true;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return true;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	public SubLString leftTrim(SubLSequence charsToTrim) {
		int trimCount = calCharsToTrim(charsToTrim, true);
		return new SubLString(toCharArray(), trimCount, this.size());
	}

	@Override
	public int length() {
		return internalSize();
	}

	@Override
	public SubLObject makeCopy() {
		return new SubLString(getString());
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLString.makeDeepCopy()");
		return null;
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		int size = newBuf.size();
		char[] theBuff = new char[size];
		for (int i = 0; i < size; ++i) {
			SubLObject obj = (SubLObject) newBuf.get(i);
			theBuff[i] = obj.charValue();
		}
		return new SubLString(theBuff);
	}

	public SubLString rightTrim(SubLSequence charsToTrim) {
		int trimCount = calCharsToTrim(charsToTrim, false);
		return new SubLString(toCharArray(), 0, this.size() - trimCount);
	}

	public void set(int index, char newVal) {
		setChar(index, newVal);
	}

	@Override
	public void set(int index, SubLObject newVal) {
		setChar(index, newVal.charValue());
	}

	public void setChar(int index, char newChar) {
		if (buf == null)
			buf = string.toCharArray();
		buf[index] = newChar;
		setMutated();
	}

	public void setInternal(int index, char newVal) {
		setChar(index, newVal);
	}

	public void setMutated() {
		string = null;
		hash = 0;
	}

	@Override
	public int size() {
		return internalSize();
	}

	@Override
	public int size(int max) {
		return internalSize();
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLCharacter[] chars = (SubLCharacter[]) this.toArray();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(chars, new ComparatorIdentityKey<Object>(pred));
		else
			Arrays.sort(chars, new ComparatorGenericKey<Object>(pred, key));
		if (buf == null)
			buf = new char[chars.length];
		for (int i = 0, size = chars.length; i < size; ++i)
			buf[i] = chars[i].getChar();
		setMutated();
		return this;
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		int size = length();
		if (end > size)
			end = size;
		if (start >= end)
			return SubLObjectFactory.makeString("");
		char[] charArray = new char[end - start];
		getString().getChars(start, end, charArray, 0);
		return SubLObjectFactory.makeString(new String(charArray));
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return this.subSeq(start, end).toStr();
	}

	@Override
	public Object[] toArray() {
		return this.toArray(new SubLCharacter[internalSize()]);
	}

	@Override
	public Object[] toArray(Object[] a) {
		int size = internalSize();
		if (a.length < size)
			Errors.error("Unable to duplicate string.");
		for (int i = 0; i < size; ++i)
			a[i] = getCharacter(i);
		return a;
	}

	public char[] toCharArray() {
		if (buf == null)
			buf = string.toCharArray();
		return buf;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		if ("/dev/null".equals(getString()))
			return SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputBinaryStream(getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public SubLInputStream toInputStream() {
		return toInputTextStream();
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		if ("/dev/null".equals(getString()))
			SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputTextStream(getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLString toLowerCase() {
		String str = getString();
		return SubLObjectFactory.makeString(str.toLowerCase());
	}

	public SubLString toLowerCase(boolean isDestructive) {
		return this.toLowerCase(isDestructive, 0, this.size());
	}

	public SubLString toLowerCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toLowerCase(charAt(i)));
		return result;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if ("/dev/null".equals(getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputBinaryStream(getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return toOutputTextStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		if ("/dev/null".equals(getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputTextStream(getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public SubLString toStr() {
		return this;
	}

	@Override
	public String toString() {
		return "\"" + escapeDoubleQuotes(getString()) + "\"";
	}

	@Override
	public String toTypeName() {
		return "STRING";
	}

	public SubLString toUpperCase() {
		String str = getString();
		return SubLObjectFactory.makeString(str.toUpperCase());
	}

	public SubLString toUpperCase(boolean isDestructive) {
		return this.toUpperCase(isDestructive, 0, this.size());
	}

	public SubLString toUpperCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toUpperCase(charAt(i)));
		return result;
	}

	public SubLString trim(SubLSequence charsToTrim) {
		int startTrimCount = calCharsToTrim(charsToTrim, true);
		if (startTrimCount == this.size())
			return SubLObjectFactory.makeString("");
		int endTrimCount = calCharsToTrim(charsToTrim, false);
		int size = this.size();
		SubLString result = new SubLString(toCharArray(), startTrimCount, size - endTrimCount);
		return result;
	}
}
