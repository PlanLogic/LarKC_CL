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
	public static void main(String[] args) {
	}

	private SubLOutputStream[] outStreams;

	private boolean isClosed;

	private boolean freshLine;

	SubLBroadcastStream() {
		this(null);
	}

	SubLBroadcastStream(SubLOutputStream[] outStreams) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		this.isClosed = false;
		this.freshLine = true;
		if (outStreams == null)
			this.outStreams = new SubLOutputStream[0];
		else
			this.outStreams = outStreams;
	}

	public synchronized void close() {
		this.isClosed = true;
	}

	public void flush() {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				this.outStreams[i].flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public boolean freshLine() {
		return this.freshLine;
	}

	public FileDescriptor getFD() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	public File getFile() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	public long getFilePointer() {
		return 0L;
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public SubLList getStreams() {
		return SubLObjectFactory.makeList(this.outStreams);
	}

	public boolean isClosed() {
		return this.isClosed;
	}

	public boolean isRandomAccess() {
		return false;
	}

	public long length() {
		return 0L;
	}

	public void seek(long pos) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	public void setLength(long newLength) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this;
	}

	public SubLOutputStream toOutputStream() {
		return this;
	}

	public SubLOutputTextStream toOutputTextStream() {
		return this;
	}

	public void write(byte[] b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void write(byte[] b, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void write(int b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputBinaryStream) this.outStreams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeChar(char b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeChar(char[] b) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeChar(char[] b, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputTextStream) this.outStreams[i]).writeChar(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeNewline() {
		this.writeString(this.getNewline());
		this.freshLine = true;
	}

	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				this.outStreams[i].writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public void writeString(String str) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputTextStream) this.outStreams[i]).writeString(str);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}

	public void writeString(String str, int off, int len) {
		try {
			for (int i = 0, size = this.outStreams.length; i < size; ++i)
				((SubLOutputTextStream) this.outStreams[i]).writeString(str, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		this.freshLine = false;
	}
}
