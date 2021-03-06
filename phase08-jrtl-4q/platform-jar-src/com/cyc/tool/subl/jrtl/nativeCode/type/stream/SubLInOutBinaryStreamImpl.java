//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInOutBinaryStreamImpl extends AbstractSubLBinaryStream
		implements SubLInOutBinaryStream, SubLInputBinaryStream, SubLOutputBinaryStream, CommonSymbols {
	private SubLInputBinaryStream inStream;

	private SubLOutputBinaryStream outStream;

	SubLInOutBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.BINARY_KEYWORD, CommonSymbols.IO_KEYWORD, ifExists, ifNotExists);
		this.init();
	}

	SubLInOutBinaryStreamImpl(SubLInputBinaryStream inStream, SubLOutputBinaryStream outStream) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.IO_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.inStream = inStream;
		this.outStream = outStream;
		if (inStream == null || outStream == null)
			Errors.error("Unable to create in/out stream.");
		this.init();
	}

	public synchronized void close() {
		this.ensureOpen("close");
		if (this.shouldParentDoWork()) {
			super.close();
			return;
		}
		if (this.isClosed())
			return;
		super.close();
		try {
			if (this.inStream != null) {
				this.inStream.close();
				this.inStream = null;
			}
			if (this.outStream != null) {
				this.outStream.close();
				this.outStream = null;
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	public void flush() {
		this.ensureOpen("flush");
		if (this.shouldParentDoWork()) {
			super.flush();
			return;
		}
		this.toOutputBinaryStream().flush();
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	private void init() {
		if (this.isRandomAccess())
			return;
	}

	public long numBytesAvailable() {
		this.ensureOpen("numBytesAvailable");
		if (this.shouldParentDoWork())
			return super.numBytesAvailable();
		return this.toInputBinaryStream().numBytesAvailable();
	}

	public int read() {
		this.ensureOpen("read");
		if (this.shouldParentDoWork())
			return super.read();
		return this.toInputBinaryStream().read();
	}

	public int read(byte[] b) {
		this.ensureOpen("read");
		if (this.shouldParentDoWork())
			return super.read(b);
		return this.toInputBinaryStream().read(b);
	}

	public int read(byte[] b, int off, int len) {
		this.ensureOpen("read");
		if (this.shouldParentDoWork())
			return super.read(b, off, len);
		return this.toInputBinaryStream().read(b, off, len);
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		this.ensureOpen("readByteSequenceToString");
		if (this.shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		return this.toInputBinaryStream().getStream(true).toInputBinaryStream()
				.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	public int readByteSequenceToString(SubLString str) {
		this.ensureOpen("readByteSequenceToString");
		if (this.shouldParentDoWork())
			return super.readByteSequenceToString(str);
		return this.toInputBinaryStream().readByteSequenceToString(str);
	}

	public long skip(long n) {
		this.ensureOpen("skip");
		if (this.shouldParentDoWork())
			return super.skip(n);
		return this.toInputBinaryStream().skip(n);
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.inStream;
	}

	public SubLInputStream toInputStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.inStream;
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.outStream;
	}

	public SubLOutputStream toOutputStream() {
		if (this.shouldParentDoWork())
			return this;
		return this.outStream;
	}

	public void unread(int c) {
		this.ensureOpen("unread");
		if (this.shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		this.toInputBinaryStream().unread(c);
	}

	public void write(byte[] b) {
		this.ensureOpen("write");
		if (this.shouldParentDoWork()) {
			super.write(b);
			return;
		}
		this.toOutputBinaryStream().write(b);
	}

	public void write(byte[] b, int off, int len) {
		this.ensureOpen("write");
		if (this.shouldParentDoWork()) {
			super.write(b, off, len);
			return;
		}
		this.toOutputBinaryStream().write(b, off, len);
	}

	public void write(int b) {
		this.ensureOpen("write");
		if (this.shouldParentDoWork()) {
			super.write(b);
			return;
		}
		this.toOutputBinaryStream().write(b);
	}

	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		this.ensureOpen("readByteSequenceToString");
		if (this.shouldParentDoWork())
			super.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		else
			this.toOutputBinaryStream().getStream(true).toOutputBinaryStream()
					.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
	}
}
