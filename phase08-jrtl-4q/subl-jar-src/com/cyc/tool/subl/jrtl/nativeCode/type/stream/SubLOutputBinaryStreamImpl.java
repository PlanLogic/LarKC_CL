//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLOutputBinaryStreamImpl extends AbstractSubLBinaryStream
		implements SubLOutputBinaryStream, CommonSymbols {
	SubLOutputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol elementType, SubLSymbol direction,
			SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		outStream = new FileOutputStream(fileDesc);
		bufferedOutStream = new BufferedOutputStream(outStream);
		init();
	}

	SubLOutputBinaryStreamImpl(OutputStream outStream) {
		super(CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.outStream = outStream;
		bufferedOutStream = new BufferedOutputStream(outStream);
		init();
	}

	SubLOutputBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.BINARY_KEYWORD, CommonSymbols.OUTPUT_KEYWORD, ifExists, ifNotExists);
		init();
	}

	private OutputStream outStream;
	private BufferedOutputStream bufferedOutStream;

	private void init() {
		if (isRandomAccess())
			return;
	}

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		try {
			if (bufferedOutStream != null) {
				try {
					bufferedOutStream.flush();
				} catch (Exception ex) {
				}
				bufferedOutStream.close();
				outStream = null;
				bufferedOutStream = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		} finally {
			super.close();
		}
	}

	@Override
	public void flush() {
		this.ensureOpen("FLUSH");
		if (isRandomAccess()) {
			super.flush();
			return;
		}
		try {
			outStream.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
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
	public void write(byte[] b) {
		this.ensureOpen("WRITE");
		if (isRandomAccess()) {
			super.write(b);
			return;
		}
		try {
			outStream.write(b);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < b.length)
				this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	@Override
	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (isRandomAccess()) {
			super.write(b, off, len);
			return;
		}
		try {
			outStream.write(b, off, len);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < len)
				this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	@Override
	public void write(int b) {
		this.ensureOpen("WRITE");
		if (isRandomAccess()) {
			super.write(b);
			return;
		}
		try {
			outStream.write(b);
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			if (ioe.bytesTransferred < 1)
				this.write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}
}
