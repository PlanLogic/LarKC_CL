//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

public class SubLBroadcastStream extends AbstractSubLStream implements SubLOutputTextStream, SubLOutputBinaryStream {
	SubLBroadcastStream() {
		this(null);
	}

	SubLBroadcastStream(SubLOutputStream[] outStreams) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		isClosed = false;
		freshLine = true;
		if (outStreams == null)
			this.outStreams = new SubLOutputStream[0];
		else
			this.outStreams = outStreams;
	}

	public static void main(String[] args) {
	}

	private SubLOutputStream[] outStreams;
	private boolean isClosed;
	private boolean freshLine;

	@Override
	public synchronized void close() {
		isClosed = true;
	}

	@Override
	public void flush() {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				outStreams[i].flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public boolean freshLine() {
		return freshLine;
	}

	@Override
	public FileDescriptor getFD() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	@Override
	public File getFile() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	@Override
	public long getFilePointer() {
		return 0L;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public SubLList getStreams() {
		return SubLObjectFactory.makeList(outStreams);
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}

	@Override
	public boolean isRandomAccess() {
		return false;
	}

	@Override
	public long length() {
		return 0L;
	}

	@Override
	public void seek(long pos) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	@Override
	public void setLength(long newLength) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return this;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return this;
	}

	@Override
	public void write(byte[] b) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void write(byte[] b, int off, int len) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) outStreams[i]).write(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void write(int b) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char b) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputTextStream) outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputTextStream) outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputTextStream) outStreams[i]).writeChar(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeNewline() {
		this.writeString(getNewline());
		freshLine = true;
	}

	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				outStreams[i].writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public void writeString(String str) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputTextStream) outStreams[i]).writeString(str);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeString(String str, int off, int len) {
		try {
			for (int i = 0, size = outStreams.length; i < size; ++i)
				((SubLOutputTextStream) outStreams[i]).writeString(str, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}
}
