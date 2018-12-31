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
	public static String STRING_TYPE_NAME = "STRING";

	public static int UPCHAR_OFFSET = -32;

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

	private SubLString(char[] chars) {
		this.buf = null;
		this.string = null;
		this.hash = 0;
		this.buf = chars;
	}

	private SubLString(char[] chars, int length) {
		this.buf = null;
		this.string = null;
		this.hash = 0;
		if (chars.length < length)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, 0, this.buf = new char[length], 0, length);
	}

	private SubLString(char[] chars, int start, int end) {
		this.buf = null;
		this.string = null;
		this.hash = 0;
		int size = end - start;
		if (chars.length < size)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, start, this.buf = new char[size], 0, size);
	}

	SubLString(int length, char defaultChar) {
		this.buf = null;
		this.string = null;
		this.hash = 0;
		if (length < 0)
			Errors.error("Attempt to create string with negative size: " + length);
		Arrays.fill(this.buf = new char[length], defaultChar);
	}

	SubLString(String str) {
		this.buf = null;
		this.string = null;
		this.hash = 0;
		if (str == null)
			str = "";
		this.buf = null;
		this.string = str;
	}

	private int calCharsToTrim(SubLSequence charsToTrim, boolean atStart) {
		int result = 0;
		if (atStart)
			for (int i = 0, size = this.size(); i < size
					&& charsToTrim.positionOf(SubLCharacter.charArray[this.charAt(i)]) >= 0; ++i)
				++result;
		else
			for (int i = this.size() - 1; i >= 0
					&& charsToTrim.positionOf(SubLCharacter.charArray[this.charAt(i)]) >= 0; --i)
				++result;
		return result;
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLString capitalize(boolean isDestructive) {
		return this.capitalize(isDestructive, 0, this.size());
	}

	public SubLString capitalize(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
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

	public char charAt(int index) {
		if (this.buf == null)
			return this.string.charAt(index);
		return this.buf[index];
	}

	public Object clone() {
		return this.makeCopy();
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
					&& SubLCharacter.caseInsensitiveConvert(this.charAt(curIndex1)) == SubLCharacter
							.caseInsensitiveConvert(compareString.charAt(curIndex2))) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		else
			while (curIndex1 < fin1 && curIndex2 < fin2 && this.charAt(curIndex1) == compareString.charAt(curIndex2)) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		if (curIndex1 != fin1 && curIndex2 != fin2) {
			if (!compareDesc.compare(this.charAt(curIndex1), compareString.charAt(curIndex2)))
				answer = -1;
		} else
			answer = compareDesc.process(answer, fin1 - curIndex1, fin2 - curIndex2);
		return answer >= 0 ? answer + start1 : answer;
	}

	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		int size = this.internalSize();
		if (this.buf == null)
			this.buf = this.string.toCharArray();
		for (int i = endIndexExclusive, j = startIndex; i < size; ++i, ++j)
			this.buf[j] = this.buf[i];
		size -= deleteCount;
		char[] oldbuf = this.buf;
		System.arraycopy(oldbuf, 0, this.buf = new char[size], 0, size);
		this.setMutated();
		return this;
	}

	public boolean equal(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = this.internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (this.charAt(i) != other.charAt(i))
				return false;
		return true;
	}

	public boolean equalp(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = this.internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (Character.toUpperCase(this.charAt(i)) != Character.toUpperCase(other.charAt(i)))
				return false;
		return true;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof CharSequence))
			return false;
		CharSequence obj2 = (CharSequence) obj;
		if (this.length() != obj2.length())
			return false;
		for (int i = 0, size = obj2.length(); i < size; ++i)
			if (this.charAt(i) != obj2.charAt(i))
				return false;
		return true;
	}

	public SubLObject get(int index) {
		return SubLCharacter.charArray[this.charAt(index)];
	}

	public char getChar(int index) {
		return this.charAt(index);
	}

	public SubLCharacter getCharacter(int index) {
		return SubLCharacter.charArray[this.charAt(index)];
	}

	public String getFileDesignator() {
		return this.getString();
	}

	public String getString() {
		if (this.string == null)
			this.string = new String(this.buf, 0, this.buf.length);
		return this.string;
	}

	public SubLSymbol getType() {
		return Types.$dtp_string$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_TWO_INTEGER;
	}

	public int hashCode(int currentDepth) {
		int h = this.hash;
		if (h == 0) {
			for (int i = 0, curSize = this.size(); i < curSize; ++i) {
				char curChar = this.charAt(i);
				h = 31 * h + (curChar >= 'a' && curChar <= 'z' ? curChar - 32 : curChar);
			}
			this.hash = h;
		}
		return h;
	}

	private int internalSize() {
		if (this.buf == null)
			return this.string.length();
		return this.buf.length;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isArrayBased() {
		return true;
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
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return true;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return true;
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

	public SubLString leftTrim(SubLSequence charsToTrim) {
		int trimCount = this.calCharsToTrim(charsToTrim, true);
		return new SubLString(this.toCharArray(), trimCount, this.size());
	}

	public int length() {
		return this.internalSize();
	}

	public SubLObject makeCopy() {
		return new SubLString(this.getString());
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLString.makeDeepCopy()");
		return null;
	}

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
		int trimCount = this.calCharsToTrim(charsToTrim, false);
		return new SubLString(this.toCharArray(), 0, this.size() - trimCount);
	}

	public void set(int index, char newVal) {
		this.setChar(index, newVal);
	}

	public void set(int index, SubLObject newVal) {
		this.setChar(index, newVal.charValue());
	}

	public void setChar(int index, char newChar) {
		if (this.buf == null)
			this.buf = this.string.toCharArray();
		this.buf[index] = newChar;
		this.setMutated();
	}

	public void setInternal(int index, char newVal) {
		this.setChar(index, newVal);
	}

	public void setMutated() {
		this.string = null;
		this.hash = 0;
	}

	public int size() {
		return this.internalSize();
	}

	public int size(int max) {
		return this.internalSize();
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLCharacter[] chars = (SubLCharacter[]) this.toArray();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(chars, new ComparatorIdentityKey<Object>(pred));
		else
			Arrays.sort(chars, new ComparatorGenericKey<Object>(pred, key));
		if (this.buf == null)
			this.buf = new char[chars.length];
		for (int i = 0, size = chars.length; i < size; ++i)
			this.buf[i] = chars[i].getChar();
		this.setMutated();
		return this;
	}

	public SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		int size = this.length();
		if (end > size)
			end = size;
		if (start >= end)
			return SubLObjectFactory.makeString("");
		char[] charArray = new char[end - start];
		this.getString().getChars(start, end, charArray, 0);
		return SubLObjectFactory.makeString(new String(charArray));
	}

	public CharSequence subSequence(int start, int end) {
		return this.subSeq(start, end).toStr();
	}

	public Object[] toArray() {
		return this.toArray(new SubLCharacter[this.internalSize()]);
	}

	public Object[] toArray(Object[] a) {
		int size = this.internalSize();
		if (a.length < size)
			Errors.error("Unable to duplicate string.");
		for (int i = 0; i < size; ++i)
			a[i] = this.getCharacter(i);
		return a;
	}

	public char[] toCharArray() {
		if (this.buf == null)
			this.buf = this.string.toCharArray();
		return this.buf;
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputBinaryStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLInputStream toInputStream() {
		return this.toInputTextStream();
	}

	public SubLInputTextStream toInputTextStream() {
		if ("/dev/null".equals(this.getString()))
			SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputTextStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLString toLowerCase() {
		String str = this.getString();
		return SubLObjectFactory.makeString(str.toLowerCase());
	}

	public SubLString toLowerCase(boolean isDestructive) {
		return this.toLowerCase(isDestructive, 0, this.size());
	}

	public SubLString toLowerCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toLowerCase(this.charAt(i)));
		return result;
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputBinaryStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLOutputStream toOutputStream() {
		return this.toOutputTextStream();
	}

	public SubLOutputTextStream toOutputTextStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputTextStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLString toStr() {
		return this;
	}

	public String toString() {
		return "\"" + SubLString.escapeDoubleQuotes(this.getString()) + "\"";
	}

	public String toTypeName() {
		return "STRING";
	}

	public SubLString toUpperCase() {
		String str = this.getString();
		return SubLObjectFactory.makeString(str.toUpperCase());
	}

	public SubLString toUpperCase(boolean isDestructive) {
		return this.toUpperCase(isDestructive, 0, this.size());
	}

	public SubLString toUpperCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toUpperCase(this.charAt(i)));
		return result;
	}

	public SubLString trim(SubLSequence charsToTrim) {
		int startTrimCount = this.calCharsToTrim(charsToTrim, true);
		if (startTrimCount == this.size())
			return SubLObjectFactory.makeString("");
		int endTrimCount = this.calCharsToTrim(charsToTrim, false);
		int size = this.size();
		SubLString result = new SubLString(this.toCharArray(), startTrimCount, size - endTrimCount);
		return result;
	}
}
