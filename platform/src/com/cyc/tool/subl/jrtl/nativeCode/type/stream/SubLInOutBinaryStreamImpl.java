//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.math.BigDecimal;

import static org.armedbear.lisp.Keyword.*;

import java.math.BigInteger;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.TwoWayStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInOutBinaryStreamImpl extends AbstractSubLBinaryStream
		implements SubLInOutBinaryStream, SubLInputBinaryStream, SubLOutputBinaryStream {
	SubLInOutBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, BINARY_KEYWORD,  Keyword.IO,  ifExists, ifNotExists);
		init();
	}

	@Override
	public String printObjectImpl() {
		String st = super.printObject();
		return st;
	}

	SubLInOutBinaryStreamImpl(SubLInputBinaryStream inStream, SubLOutputBinaryStream outStream) {
		super(BINARY_KEYWORD, IO_KEYWORD, ERROR_KEYWORD,
				ERROR_KEYWORD);
		this.inStream = inStream;
		this.outStream = outStream;
		if (inStream == null || outStream == null)
			Errors.error("Unable to create in/out stream.");
		init();
	}

	private SubLInputBinaryStream inStream;
	private SubLOutputBinaryStream outStream;

	private void init() {
		if (isRandomAccess())
			return;
	}

	@Override
	public synchronized void close() {
		this.ensureOpen("close");
		if (shouldParentDoWork()) {
			super.close();
			return;
		}
		if (isClosed())
			return;
		super.close();
		try {
			if (inStream != null) {
				inStream.close();
				inStream = null;
			}
			if (outStream != null) {
				outStream.close();
				outStream = null;
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}


	@Override
	public void flush() {
		this.ensureOpen("flush");
		if (shouldParentDoWork()) {
			super.flush();
			return;
		}
		toOutputBinaryStream().flush();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public long numBytesAvailable() {
		this.ensureOpen("numBytesAvailable");
		if (shouldParentDoWork())
			return super.numBytesAvailable();
		return toInputBinaryStream().numBytesAvailable();
	}

	@Override
	public int read() {
		this.ensureOpen("read");
		if (shouldParentDoWork())
			return super.read();
		return toInputBinaryStream().read();
	}

	@Override
	public int read(byte[] b) {
		this.ensureOpen("read");
		if (shouldParentDoWork())
			return super.read(b);
		return toInputBinaryStream().read(b);
	}

	@Override
	public int read(byte[] b, int off, int len) {
		this.ensureOpen("read");
		if (shouldParentDoWork())
			return super.read(b, off, len);
		return toInputBinaryStream().read(b, off, len);
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		this.ensureOpen("readByteSequenceToString");
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		return toInputBinaryStream().getStream(true).toInputBinaryStream()
				.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		this.ensureOpen("readByteSequenceToString");
		if (shouldParentDoWork())
			return super.readByteSequenceToString(str);
		return toInputBinaryStream().readByteSequenceToString(str);
	}

	@Override
	public long skip(long n) {
		this.ensureOpen("skip");
		if (shouldParentDoWork())
			return super.skip(n);
		return toInputBinaryStream().skip(n);
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLInputBinaryStream) inStream;
	}

	@Override
	public SubLInputStream toInputStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLInputStream) inStream;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLOutputBinaryStream) outStream;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLOutputStream) outStream;
	}

	@Override
	public void unread(int c) {
		this.ensureOpen("unread");
		if (shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		toInputBinaryStream().unread(c);
	}

	@Override
	public void write(byte[] b) {
		this.ensureOpen("write");
		if (shouldParentDoWork()) {
			super.write(b);
			return;
		}
		toOutputBinaryStream().write(b);
	}

	@Override
	public void write(byte[] b, int off, int len) {
		this.ensureOpen("write");
		if (shouldParentDoWork()) {
			super.write(b, off, len);
			return;
		}
		toOutputBinaryStream().write(b, off, len);
	}

	@Override
	public void write(int b) {
		this.ensureOpen("write");
		if (shouldParentDoWork()) {
			super.write(b);
			return;
		}
		toOutputBinaryStream().write(b);
	}

	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		this.ensureOpen("readByteSequenceToString");
		if (shouldParentDoWork())
			super.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		else
			toOutputBinaryStream().getStream(true).toOutputBinaryStream().writePositiveIntegerAsByteSequence(integer,
					bytesInInteger, useNetworkByteOrder);
	}

}