//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.UUID;

public class SubLGuid extends AbstractSubLObject implements SubLObject, Comparable<SubLGuid> {
	public static String GUID_TYPE_NAME = "GUID";

	protected static int compareTimeVersionedGUIDs(UUID guid1, UUID guid2) {
		int var1 = guid1.variant();
		int var2 = guid2.variant();
		if (var1 != var2)
			return var1 > var2 ? 1 : -1;
		int seq1 = guid1.clockSequence();
		int seq2 = guid2.clockSequence();
		if (seq1 != seq2)
			return seq1 > seq2 ? 1 : -1;
		long stamp1 = guid1.timestamp();
		long stamp2 = guid2.timestamp();
		if (stamp1 != stamp2)
			return stamp1 > stamp2 ? 1 : -1;
		long node1 = guid1.node();
		long node2 = guid2.node();
		if (node1 != node2)
			return node1 > node2 ? 1 : -1;
		return 0;
	}

	private static long guidLSB(SubLVector data) {
		long lsb = 0L;
		assert data.size() == 16;
		for (int i = 8; i < 16; ++i)
			lsb = lsb << 8 | (byte) data.get(i).toInteger().intValue() & 0xFF;
		return lsb;
	}

	private static long guidMSB(SubLVector data) {
		long msb = 0L;
		assert data.size() == 16;
		for (int i = 0; i < 8; ++i)
			msb = msb << 8 | (byte) data.get(i).toInteger().intValue() & 0xFF;
		return msb;
	}

	public static boolean isGuidString(String string) {
		boolean isValid = false;
		try {
			UUID testUUID = UUID.fromString(string);
			isValid = true;
		} catch (Exception ex) {
		}
		return isValid;
	}

	private UUID guid;

	private String guidString;

	SubLGuid() {
		this(UUID.randomUUID());
	}

	SubLGuid(String guidString) {
		this(UUID.fromString(guidString), guidString);
	}

	SubLGuid(SubLVector data) {
		this(new UUID(SubLGuid.guidMSB(data), SubLGuid.guidLSB(data)));
	}

	SubLGuid(UUID guid) {
		this(guid, guid.toString());
	}

	SubLGuid(UUID guid, String guidString) {
		this.guid = guid;
		this.guidString = guidString;
	}

	public boolean canFastHash() {
		return true;
	}

	public int compareTo(SubLGuid obj) {
		if (obj == null)
			throw new NullPointerException();
		int thisVersion = this.guid.version();
		int otherVersion = obj.getNativeGuid().version();
		if (thisVersion != otherVersion)
			return thisVersion > otherVersion ? 1 : -1;
		if (this.guid.version() == 1)
			return SubLGuid.compareTimeVersionedGUIDs(this.guid, obj.getNativeGuid());
		if (this.guid.version() == 4)
			return this.stringRepresentation().compareTo(obj.stringRepresentation());
		return this.guid.compareTo(obj.getNativeGuid());
	}

	public boolean equalp(SubLObject obj) {
		return obj != null && (obj == this || obj.isGuid() && this.compareTo(obj.toGuid()) == 0);
	}

	public boolean equals(Object obj) {
		return obj != null && (obj == this || obj instanceof SubLGuid && this.compareTo((SubLGuid) obj) == 0);
	}

	public void fillByteVector(SubLVector byteVector) {
		assert byteVector.size() == 16;
		long msb = this.guid.getMostSignificantBits();
		for (int i = 7; i >= 0; --i) {
			int nextByte = (int) msb & 0xFF;
			SubLInteger nextSubLByte = SubLNumberFactory.makeSmallInteger(nextByte);
			byteVector.set(i, nextSubLByte);
			msb >>= 8;
		}
		long lsb = this.guid.getLeastSignificantBits();
		for (int j = 15; j >= 8; --j) {
			int nextByte2 = (int) lsb & 0xFF;
			SubLInteger nextSubLByte2 = SubLNumberFactory.makeSmallInteger(nextByte2);
			byteVector.set(j, nextSubLByte2);
			lsb >>= 8;
		}
	}

	public SubLString getGuidString() {
		return SubLObjectFactory.makeString(this.stringRepresentation());
	}

	public UUID getNativeGuid() {
		return this.guid;
	}

	public SubLSymbol getType() {
		return Types.$dtp_guid$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.ONE_HUNDRED_TWENTY_SEVEN_INTEGER;
	}

	public int hashCode(int depth) {
		return this.guid.hashCode();
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
		return true;
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

	public String stringRepresentation() {
		return this.guidString;
	}

	public SubLGuid toGuid() {
		return this;
	}

	public String toString() {
		return "#G\"" + this.stringRepresentation() + "\"";
	}

	public String toTypeName() {
		return "GUID";
	}
}
