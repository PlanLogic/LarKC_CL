//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInputTextStreamImpl extends AbstractSubLTextStream implements SubLInputTextStream, CommonSymbols {
	public SubLInputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
		inStream = new FileInputStream(fileDesc);
		bufferedStream = new BufferedInputStream(inStream);
		pbInStream = new PushbackInputStream(bufferedStream);
	}

	SubLInputTextStreamImpl(ByteBuffer byteBuffer) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.byteBuffer = byteBuffer;
	}

	SubLInputTextStreamImpl(ByteBuffer byteBuffer, int start) {
		this(byteBuffer);
		if (start > 0)
			setInputIndex(start);
	}

	SubLInputTextStreamImpl(InputStream inStream) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.inStream = inStream;
		bufferedStream = new BufferedInputStream(inStream);
		pbInStream = new PushbackInputStream(bufferedStream);
	}

	SubLInputTextStreamImpl(InputStream inStream, int start) {
		this(inStream);
		setInputIndex(start);
	}

	SubLInputTextStreamImpl(Socket socket) {
		super(CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, CommonSymbols.ERROR_KEYWORD,
				CommonSymbols.ERROR_KEYWORD);
		this.socket = socket;
		try {
			inStream = socket.getInputStream();
		} catch (IOException ioe) {
			Errors.error("Unable to open stream for socket; " + socket, ioe);
		}
		bufferedStream = new BufferedInputStream(inStream);
		pbInStream = new PushbackInputStream(bufferedStream);
	}

	SubLInputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, CommonSymbols.TEXT_KEYWORD, CommonSymbols.INPUT_KEYWORD, ifExists, ifNotExists);
	}

	private Socket socket;
	private InputStream inStream;
	private BufferedInputStream bufferedStream;
	private PushbackInputStream pbInStream;

	private boolean isSocketConnectionDead() {
		if (socket == null)
			return false;
		try {
			socket.sendUrgentData(32);
		} catch (Exception ex) {
			return true;
		}
		return false;
	}

	private int socketRead() {
		while (!isClosed())
			try {
				int curByte = pbInStream.read();
				if (curByte >= 0)
					incrementInputIndex(1L);
				return curByte;
			} catch (SocketTimeoutException ste) {
				Threads.possiblyHandleInterrupts(true);
			} catch (IOException ioe) {
				return -1;
			} catch (Exception e) {
				Errors.error("Unable to read character from stream: " + this, e);
			}
		return -1;
	}

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		super.close();
		try {
			if (pbInStream != null) {
				pbInStream.close();
				inStream = null;
				bufferedStream = null;
				pbInStream = null;
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public int read() {
		if (shouldParentDoWork())
			return super.read();
		this.ensureOpen("READ");
		if (socket != null)
			return socketRead();
		boolean ready = false;
		while (!isClosed()) {
			try {
				ready = pbInStream.available() > 0;
			} catch (Exception e) {
				return -1;
			}
			if (ready)
				try {
					int result = pbInStream.read();
					if (result >= 0)
						incrementInputIndex(1L);
					return result;
				} catch (Exception e) {
					Errors.error("Unable to read character from stream: " + this, e);
					continue;
				}
			try {
				Threads.possiblyHandleInterrupts(true);
				Thread.currentThread();
				Thread.sleep(5L);
			} catch (InterruptedException ie) {
				Threads.possiblyHandleInterrupts(false);
			}
			if (isClosed())
				return -1;
		}
		return -1;
	}

	@Override
	public int read(byte[] b) {
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
	}

	@Override
	public int read(byte[] b, int off, int len) {
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[], off, len)");
		return -1;
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		this.ensureOpen("READ-BYTES-SEQUENCE-TO-POSITIVE-INTEGER");
		if (bytesInInteger > 8 || bytesInInteger < 0)
			Errors.error("Bytes in integer is too large: " + bytesInInteger);
		long result = 0L;
		long curChar = -1L;
		if (useNetworkByteOrder)
			for (int i = (bytesInInteger - 1) * 8; i >= 0; i -= 8) {
				curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		else
			for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
				curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		return result;
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		if (shouldParentDoWork())
			return super.readByteSequenceToString(str);
		int curChar = 1;
		this.ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
		for (int i = 0, size = str.size(); i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				return -1;
			str.set(i, (char) curChar);
		}
		return curChar;
	}

	@Override
	public int readChar() {
		return this.read();
	}

	@Override
	public int readChar(char[] b) {
		this.ensureOpen("READ-CHAR");
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
	}

	@Override
	public int readChar(char[] b, int off, int len) {
		int curChar = -1;
		int i = off;
		for (int size = off + len; i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				break;
			b[i] = (char) curChar;
		}
		return i;
	}

	@Override
	public boolean ready() {
		if (shouldParentDoWork())
			return super.ready();
		this.ensureOpen("READY");
		try {
			return pbInStream.available() > 0;
		} catch (Exception e) {
			Errors.error("Error on stream: " + this);
			return false;
		}
	}

	@Override
	public long skip(long n) {
		if (shouldParentDoWork())
			return super.skip(n);
		this.ensureOpen("SKIP");
		try {
			long result = pbInStream.skip(n);
			if (result >= 0L)
				incrementInputIndex(result);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to skip characters.", e);
			return -1L;
		}
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return this;
	}

	@Override
	public SubLInputStream toInputStream() {
		return this;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return this;
	}

	@Override
	public void unread(int c) {
		if (shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		this.ensureOpen("UNREAD");
		try {
			pbInStream.unread(c);
			incrementInputIndex(-1L);
		} catch (Exception e) {
			Errors.error("Unable to unread character from stream.", e);
		}
	}
}
