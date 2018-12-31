//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public class SubLVector extends AbstractSubLArraySequence implements SubLSequence, CommonSymbols {
	public SubLVector(int length) {
		this(length, CommonSymbols.NIL);
	}

	public SubLVector(int length, SubLObject value) {
		size = 0;
		Arrays.fill(vect = new SubLObject[length], value);
		size = vect.length;
	}

	public SubLVector(List<SubLObject> list) {
		this(list.toArray(new SubLObject[list.size()]));
	}

	SubLVector(SubLObject[] vect) {
		size = 0;
		this.vect = vect;
		size = vect.length;
	}

	private SubLObject[] vect;
	private int size;
	private static int SXHASH_TYPE_SPEC_PRIME_VECTOR = 199;
	public static String VECTOR_TYPE_NAME;
	public static SubLVector EMPTY_VECTOR;
	static {
		SubLVector.VECTOR_TYPE_NAME = "VECTOR";
		EMPTY_VECTOR = new SubLVector(0);
	}

	@Override
	public boolean canFastHash() {
		return false;
	}

	@Override
	public Object clone() {
		return makeCopy();
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		for (int i = endIndexExclusive, j = startIndex; i < size; ++i, ++j)
			vect[j] = vect[i];
		for (int i = size - deleteCount; i < size; ++i)
			vect[i] = null;
		size -= deleteCount;
		return this;
	}

	@Override
	public boolean equalp(SubLObject obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!obj.isVector())
			return false;
		SubLVector otherVect = obj.toVect();
		if (size != otherVect.size)
			return false;
		for (int i = 0; i < size; ++i)
			if (!vect[i].equalp(otherVect.vect[i]))
				return false;
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isVector())
			return false;
		SubLVector otherVect = sublObj.toVect();
		if (size != otherVect.size)
			return false;
		for (int i = 0; i < size; ++i)
			if (!vect[i].equals(otherVect.vect[i]))
				return false;
		return true;
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		if (end < 0)
			return this;
		if (start < 0)
			start = 0;
		if (end > this.size())
			end = this.size();
		Arrays.fill(vect, start, end, item);
		return this;
	}

	@Override
	public SubLObject get(int i) {
		return vect[i];
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_vector$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_THREE_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth >= 8)
			return 0;
		int compositeHash = 199;
		int compositeState = 4;
		for (int i = 0; i < size && i < 8; ++i) {
			int partHash = vect[i].hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
		}
		return compositeHash;
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

	public boolean isEmpty() {
		return size == 0;
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
		return false;
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
		return true;
	}

	@Override
	public SubLObject makeCopy() {
		return new SubLVector((SubLObject[]) this.toArray(new SubLObject[size]));
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLVector.makeDeepCopy()");
		return null;
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		return new SubLVector(newBuf.toArray(new SubLObject[newBuf.size()]));
	}

	@Override
	public void set(int i, SubLObject obj) {
		vect[i] = obj;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public int size(int max) {
		return size;
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLVector result = isDestructive ? this : makeCopy().toVect();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(result.vect, new ComparatorIdentityKey<Object>(pred));
		else
			Arrays.sort(result.vect, new ComparatorGenericKey<Object>(pred, key));
		return result;
	}

	@Override
	public Object[] toArray() {
		return vect;
	}

	@Override
	public Object[] toArray(Object[] obj) {
		for (int i = 0, size1 = obj.length < size ? obj.length : size; i < size1; ++i)
			obj[i] = vect[i];
		return obj;
	}

	public List<SubLObject> toListOfSubLObjects() {
		List<SubLObject> result = new ArrayList<SubLObject>(vect.length);
		for (int i = 0, realSize = vect.length; i < realSize; ++i)
			result.add(vect[i]);
		return result;
	}

	@Override
	public String toString() {
		if (PrintLow.shouldPrintAtCurrentLevel()) {
			SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
			try {
				StringBuilder buf = new StringBuilder("#(");
				boolean checkLength = PrintLow.controlPrintLength();
				int printLength = PrintLow.maxPrintLength();
				int counter = 0;
				boolean terminatedEarly = false;
				for (int i = 0; i < size; ++i) {
					buf.append(vect[i]);
					if (checkLength && ++counter >= printLength) {
						buf.append(" ... ");
						terminatedEarly = true;
						break;
					}
					if (i < size - 1)
						buf.append(" ");
				}
				buf.append(")");
				return buf.toString();
			} finally {
				PrintLow.maybeDecreasePrintLevel(oldLevel);
			}
		}
		return "#( # )";
	}

	@Override
	public String toTypeName() {
		return SubLVector.VECTOR_TYPE_NAME;
	}

	@Override
	public SubLVector toVect() {
		return this;
	}
}
