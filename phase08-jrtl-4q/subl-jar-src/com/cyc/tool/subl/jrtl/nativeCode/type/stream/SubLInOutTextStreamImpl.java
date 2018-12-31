//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInOutTextStreamImpl extends AbstractSubLTextStream
		implements SubLInOutTextStream, SubLOutputTextStream, SubLInputTextStream, CommonSymbols {
	protected SubLInOutTextStreamImpl() {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		freshLine = false;
	}

	SubLInOutTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, ifExists, ifNotExists);
		freshLine = false;
	}

	SubLInOutTextStreamImpl(SubLInputTextStream inStream, SubLOutputTextStream outStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.IO_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		freshLine = false;
		this.inStream = inStream;
		this.outStream = outStream;
		if (inStream == null || outStream == null)
			Errors.error("Unable to create in/out stream.");
	}

	protected SubLInputTextStream inStream;
	protected SubLOutputTextStream outStream;
	private boolean freshLine;

	@Override
	public synchronized void close() {
		if (shouldParentDoWork()) {
			super.close();
			return;
		}
		if (isClosed())
			return;
		super.close();
		try {
			try {
				if (outStream != null)
					outStream.close();
			} finally {
				if (inStream != null)
					inStream.close();
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public void flush() {
		if (shouldParentDoWork()) {
			super.flush();
			return;
		}
		toOutputTextStream().flush();
	}

	@Override
	public boolean freshLine() {
		if (shouldParentDoWork())
			return freshLine;
		return toOutputTextStream().freshLine();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		return toInputBinaryStream().readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		if (shouldParentDoWork())
			return super.readByteSequenceToString(str);
		return toInputBinaryStream().readByteSequenceToString(str);
	}

	@Override
	public int readChar() {
		if (shouldParentDoWork())
			return super.readChar();
		return toInputTextStream().readChar();
	}

	@Override
	public int readChar(char[] b) {
		if (shouldParentDoWork())
			return super.readChar(b);
		return toInputTextStream().readChar(b);
	}

	@Override
	public int readChar(char[] b, int off, int len) {
		if (shouldParentDoWork())
			return super.readChar(b, off, len);
		return toInputTextStream().readChar(b, off, len);
	}

	@Override
	public boolean ready() {
		if (shouldParentDoWork())
			return super.ready();
		return toInputTextStream().ready();
	}

	@Override
	public long skip(long n) {
		if (shouldParentDoWork())
			return super.skip(n);
		return toInputTextStream().skip(n);
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return inStream;
	}

	@Override
	public SubLInputStream toInputStream() {
		if (shouldParentDoWork())
			return this;
		return inStream;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		if (shouldParentDoWork())
			return this;
		return inStream;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return outStream;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		if (shouldParentDoWork())
			return this;
		return outStream;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		if (shouldParentDoWork())
			return this;
		return outStream;
	}

	@Override
	public void unread(int c) {
		if (shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		toInputTextStream().unread(c);
	}

	@Override
	public void writeChar(char b) {
		if (shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		toOutputTextStream().writeChar(b);
	}

	@Override
	public void writeChar(char[] b) {
		if (shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		toOutputTextStream().writeChar(b);
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		if (shouldParentDoWork()) {
			super.writeChar(b, off, len);
			return;
		}
		toOutputTextStream().writeChar(b, off, len);
	}

	@Override
	public void writeNewline() {
		if (shouldParentDoWork()) {
			super.write(getNewline());
			return;
		}
		toOutputTextStream().writeNewline();
	}

	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			super.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		toOutputBinaryStream().writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
	}

	@Override
	public void writeString(String str) {
		if (shouldParentDoWork()) {
			super.write(str);
			return;
		}
		toOutputTextStream().writeString(str);
	}

	@Override
	public void writeString(String str, int off, int len) {
		if (shouldParentDoWork()) {
			super.write(str, off, len);
			return;
		}
		toOutputTextStream().writeString(str, off, len);
	}
}
