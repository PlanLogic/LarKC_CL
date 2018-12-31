//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLStream extends AbstractSubLObject implements SubLStream {
	public AbstractSubLStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		isInteractive = false;
		newline = SubLStream.DEFAULT_NEWLINE;
		isClosed = false;
		inputIndex = 0L;
		init(elementType, direction, ifExists, ifNotExists);
	}

	protected SubLSymbol elementType;
	protected SubLSymbol direction;
	protected SubLSymbol ifExists;
	protected SubLSymbol ifNotExists;
	protected boolean isInteractive;
	protected String newline;
	private volatile boolean isClosed;
	private long inputIndex;

	private void init(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		this.elementType = elementType;
		if (elementType != CommonSymbols.TEXT_KEYWORD && elementType != CommonSymbols.BINARY_KEYWORD)
			Errors.error("Invalid stream element type: " + elementType);
		if ((this.direction = direction) != CommonSymbols.INPUT_KEYWORD && direction != CommonSymbols.OUTPUT_KEYWORD
				&& direction != CommonSymbols.IO_KEYWORD && direction != CommonSymbols.PROBE_KEYWORD)
			Errors.error("Invalid stream direction: " + direction);
		if ((this.ifExists = ifExists) != CommonSymbols.ERROR_KEYWORD && ifExists != CommonSymbols.NEW_VERSION_KEYWORD
				&& ifExists != CommonSymbols.RENAME_AND_DELETE_KEYWORD && ifExists != CommonSymbols.OVERWRITE_KEYWORD
				&& ifExists != CommonSymbols.APPEND_KEYWORD && ifExists != CommonSymbols.SUPERSEDE_KEYWORD
				&& ifExists != CommonSymbols.NIL)
			Errors.error("Invalid stream if-exists parameter: " + ifExists);
		if ((this.ifNotExists = ifNotExists) != CommonSymbols.ERROR_KEYWORD
				&& ifNotExists != CommonSymbols.CREATE_KEYWORD && ifNotExists != CommonSymbols.NIL)
			Errors.error("Invalid stream if-not-exists parameter: " + ifNotExists);
		if (ifExists == CommonSymbols.RENAME_AND_DELETE_KEYWORD)
			Errors.error("Streams implementation does not currently support :rename-and-delete.");
		if (direction == CommonSymbols.PROBE_KEYWORD)
			Errors.error("Streams implementation does not currently support :probe.");
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public void close() {
		isClosed = true;
	}

	public void ensureOpen() {
		if (isClosed())
			Errors.error("Can't perform operation on closed stream: " + this);
	}

	public void ensureOpen(String operation) {
		if (isClosed())
			Errors.error("Can't perform " + operation + " on closed stream: " + this);
	}

	@Override
	public SubLSymbol getDirection() {
		return direction;
	}

	@Override
	public SubLSymbol getElementType() {
		return elementType;
	}

	@Override
	public String getFileDesignator() {
		if (!isRandomAccess())
			Errors.error("Invalid pathname designator: " + this + ".");
		File file = getFile();
		if (file == null)
			Errors.error("Invalid pathname designator: " + this + ".");
		return file.getAbsolutePath();
	}

	@Override
	public long getFlushCount() {
		Errors.unimplementedMethod("getFlushCount");
		return -1L;
	}

	public long getInputIndex() {
		return inputIndex;
	}

	@Override
	public String getNewline() {
		return newline;
	}

	@Override
	public SubLList getStreams() {
		return CommonSymbols.NIL;
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		Errors.error(this + " is not of type: SYNONYM-STREAM.");
		return null;
	}

	public String getStringOutput() {
		return Errors.error("Can't get the stream string output for non-string streams.").getString();
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_stream$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FORTY_FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return 0;
		return 0;
	}

	@Override
	public SubLSymbol ifExists() {
		return ifExists;
	}

	@Override
	public SubLSymbol ifNotExists() {
		return ifNotExists;
	}

	@Override
	public boolean isAlien() {
		return false;
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
	public boolean isClosed() {
		return isClosed;
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
	public boolean isInteractive() {
		return isInteractive;
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
	public boolean isMemoryMapped() {
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
		return false;
	}

	@Override
	public boolean isStream() {
		return true;
	}

	@Override
	public boolean isString() {
		return false;
	}

	public boolean isStringOutputStream() {
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
		return false;
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		isInteractive = newValue;
	}

	@Override
	public void setNewline(String newline) {
		this.newline = newline;
	}

	@Override
	public String toString() {
		return "#<STREAM " + elementType + " " + direction + (isClosed() ? " CLOSED" : " OPEN") + " @ " + superHash()
				+ ">";
	}

	@Override
	public String toTypeName() {
		return "STREAM";
	}

	protected void incrementInputIndex(long incAmount) {
		inputIndex += incAmount;
	}

	protected void setInputIndex(long newIndex) {
		inputIndex = newIndex;
	}
}
