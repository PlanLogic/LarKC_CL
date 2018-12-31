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
	private OutputStream outStream;

	private OutputStreamWriter outWriter;

	private Writer bufferedWriter;

	private boolean freshLine;

	SubLOutputTextStreamImpl(int initialByteSizeForString) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.APPEND_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
		this.freshLine = true;
		this.outStream = new ByteArrayOutputStream(initialByteSizeForString);
		this.outWriter = new OutputStreamWriter(this.outStream, SubLStream.DEFAULT_CHARSET);
		this.bufferedWriter = this.outWriter;
	}

	SubLOutputTextStreamImpl(OutputStream outStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.freshLine = true;
		this.outStream = outStream;
		this.outWriter = new OutputStreamWriter(outStream, SubLStream.DEFAULT_CHARSET);
		this.bufferedWriter = this.outWriter;
	}

	SubLOutputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, ifExists, ifNotExists);
		this.freshLine = true;
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		super.close();
		try {
			if (this.bufferedWriter != null) {
				try {
					this.bufferedWriter.flush();
				} catch (Exception ex) {
				}
				this.bufferedWriter.close();
				this.outStream = null;
				this.outWriter = null;
				this.bufferedWriter = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof SubLOutputTextStreamImpl))
			return false;
		SubLOutputTextStreamImpl imp2 = (SubLOutputTextStreamImpl) obj;
		return this.outStream == imp2.outStream;
	}

	public void flush() {
		this.ensureOpen("FLUSH");
		if (this.shouldParentDoWork()) {
			super.flush();
			return;
		}
		try {
			this.bufferedWriter.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	public boolean freshLine() {
		return this.freshLine;
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	public String getStringOutput() {
		if (!this.isStringOutputStream())
			Errors.error("Can't get the stream string output for non-string streams.");
		this.ensureOpen("GET-STRING-OUTPUT");
		ByteArrayOutputStream byteStream = (ByteArrayOutputStream) this.outStream;
		try {
			this.flush();
			String result = byteStream.toString(SubLStream.DEFAULT_CHARSET.name());
			byteStream.reset();
			return result;
		} catch (Exception e) {
			return Errors.error("Unsupported charset: " + SubLStream.DEFAULT_CHARSET, e).getString();
		}
	}

	public boolean isStringOutputStream() {
		return this.outStream != null && this.outStream instanceof ByteArrayOutputStream;
	}

	public SubLOutputTextStream toOutputBinaryStream() {
		return this;
	}

	public SubLOutputStream toOutputStream() {
		return this;
	}

	public SubLOutputTextStream toOutputTextStream() {
		return this;
	}

	public void write(byte[] b) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b, off, len);
		else
			try {
				this.outStream.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void write(int b) {
		this.ensureOpen("WRITE");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.outStream.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.write(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeChar(char b) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.write(b);
		else
			try {
				this.bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.writeChar(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeChar(char[] b) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.writeChar(b);
		else
			try {
				this.bufferedWriter.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.writeChar(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeChar(char[] b, int off, int len) {
		this.ensureOpen("WRITE-CHAR");
		if (this.shouldParentDoWork())
			super.writeChar(b, off, len);
		else
			try {
				this.bufferedWriter.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeChar(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeNewline() {
		this.writeString(this.getNewline());
		this.freshLine = true;
	}

	public void writeString(String str) {
		this.ensureOpen("WRITE-STRING");
		if (this.shouldParentDoWork())
			super.write(str);
		else
			try {
				this.bufferedWriter.write(str);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < str.length())
					this.writeString(str, ioe.bytesTransferred, str.length() - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}

	public void writeString(String str, int off, int len) {
		this.ensureOpen("WRITE-STRING");
		if (this.shouldParentDoWork())
			super.write(str, off, len);
		else
			try {
				this.bufferedWriter.write(str, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeString(str, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		this.freshLine = false;
	}
}
