//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLOutputTextStreamImpl extends AbstractSubLTextStream implements SubLOutputTextStream, CommonSymbols {
	SubLOutputTextStreamImpl(int initialByteSizeForString) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.APPEND_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		freshLine = true;
		outStream = new ByteArrayOutputStream(initialByteSizeForString);
		outWriter = new OutputStreamWriter(outStream, SubLStream.DEFAULT_CHARSET);
		bufferedWriter = outWriter;
	}

	SubLOutputTextStreamImpl(OutputStream outStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		freshLine = true;
		this.outStream = outStream;
		outWriter = new OutputStreamWriter(outStream, SubLStream.DEFAULT_CHARSET);
		bufferedWriter = outWriter;
	}

	SubLOutputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, ifExists, ifNotExists);
		freshLine = true;
	}

	private OutputStream outStream;
	private OutputStreamWriter outWriter;
	private Writer bufferedWriter;
	private boolean freshLine;

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		super.close();
		try {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.flush();
				} catch (Exception ex) {
				}
				bufferedWriter.close();
				outStream = null;
				outWriter = null;
				bufferedWriter = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof SubLOutputTextStreamImpl))
			return false;
		SubLOutputTextStreamImpl imp2 = (SubLOutputTextStreamImpl) obj;
		return outStream == imp2.outStream;
	}

	@Override
	public void flush() {
		this.ensureOpen("FLUSH");
		if (shouldParentDoWork()) {
			super.flush();
			return;
		}
		try {
			bufferedWriter.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public boolean freshLine() {
		return freshLine;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public String getStringOutput() {
		if (!isStringOutputStream())
			Errors.error("Can't get the stream string output for non-string streams.");
		this.ensureOpen("GET-STRING-OUTPUT");
		ByteArrayOutputStream byteStream = (ByteArrayOutputStream) outStream;
		try {
			this.flush();
			String result = byteStream.toString(SubLStream.DEFAULT_CHARSET.name());
			byteStream.reset();
			return result;
		} catch (Exception e) {
			return Errors.error("Unsupported charset: " + SubLStream.DEFAULT_CHARSET, e).getString();
		}
	}

	@Override
	public boolean isStringOutputStream() {
		return outStream != null && outStream instanceof ByteArrayOutputStream;
	}

	@Override
	public SubLOutputTextStream toOutputBinaryStream() {
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
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b, off, len);
		else
			try {
				outStream.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void write(int b) {
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.write(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char b) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.writeChar(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.writeChar(b);
		else
			try {
				bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.writeChar(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.writeChar(b, off, len);
		else
			try {
				bufferedWriter.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeChar(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
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
	public void writeString(String str) {
		this.ensureOpen("WRITE-STRING");
		if (shouldParentDoWork())
			super.write(str);
		else
			try {
				bufferedWriter.write(str);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < str.length())
					this.writeString(str, ioe.bytesTransferred, str.length() - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeString(String str, int off, int len) {
		this.ensureOpen("WRITE-STRING");
		if (shouldParentDoWork())
			super.write(str, off, len);
		else
			try {
				bufferedWriter.write(str, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeString(str, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}
}
