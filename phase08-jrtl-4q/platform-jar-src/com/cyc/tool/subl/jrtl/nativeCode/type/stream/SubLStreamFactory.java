//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStreamFactory implements CommonSymbols {
	public static int INITIAL_STRING_STREAM_SIZE = 256;

	public static SubLInputTextStream NULL_IN_STREAM;

	public static SubLBroadcastStream NULL_OUT_STREAM;

	static {
		SubLStreamFactory.NULL_IN_STREAM = SubLStreamFactory.makeStringInputStream("");
		SubLStreamFactory.NULL_OUT_STREAM = SubLStreamFactory.makeBroadcastStream();
	}

	public static void main(String[] args) {
	}

	public static SubLBroadcastStream makeBroadcastStream() {
		return SubLStreamFactory.makeBroadcastStream(CommonSymbols.NIL);
	}

	public static SubLBroadcastStream makeBroadcastStream(SubLList streamList) {
		SubLOutputStream[] streams = new SubLOutputStream[streamList.size()];
		int i = 0;
		for (SubLObject cur = streamList; cur != SubLNil.NIL; cur = cur.rest())
			streams[i++] = cur.first().toOutputStream();
		SubLBroadcastStream result = new SubLBroadcastStream(streams);
		return result;
	}

	public static SubLStream makeFileStream(String fileName, SubLSymbol direction, SubLSymbol elementType,
			SubLSymbol ifExists, SubLSymbol ifNotExists, SubLObject externalFormat) {
		try {
			if (direction == CommonSymbols.INPUT_KEYWORD) {
				if (elementType == CommonSymbols.BINARY_KEYWORD)
					return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (elementType == CommonSymbols.TEXT_KEYWORD)
					return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
			} else if (direction == CommonSymbols.OUTPUT_KEYWORD) {
				if (elementType == CommonSymbols.BINARY_KEYWORD)
					return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (elementType == CommonSymbols.TEXT_KEYWORD)
					return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
			} else if (direction == CommonSymbols.IO_KEYWORD) {
				if (elementType == CommonSymbols.BINARY_KEYWORD)
					return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (elementType == CommonSymbols.TEXT_KEYWORD)
					return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
			}
		} catch (SubLStreamNilException ssne) {
			return null;
		}
		return Errors.error("Can't open stream " + fileName + ".").getStream(false);
	}

	public static SubLInOutBinaryStream makeInOutBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInOutBinaryStream makeInOutBinaryStream(SubLInputBinaryStream inStream,
			SubLOutputBinaryStream outStream) {
		return new SubLInOutBinaryStreamImpl(inStream, outStream);
	}

	public static SubLInOutTextStream makeInOutTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInOutTextStream makeInOutTextStream(SubLInputTextStream inStream,
			SubLOutputTextStream outStream) {
		return new SubLInOutTextStreamImpl(inStream, outStream);
	}

	public static SubLInputBinaryStream makeInputBinaryStream(InputStream stream) {
		return new SubLInputBinaryStreamImpl(stream);
	}

	public static SubLInputBinaryStream makeInputBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInputTextStream makeInputTextStream(InputStream stream) {
		return new SubLInputTextStreamImpl(stream);
	}

	public static SubLInputTextStream makeInputTextStream(Socket socket) {
		return new SubLInputTextStreamImpl(socket);
	}

	public static SubLInputTextStream makeInputTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLOutputBinaryStream makeOutputBinaryStream(OutputStream stream) {
		return new SubLOutputBinaryStreamImpl(stream);
	}

	public static SubLOutputBinaryStream makeOutputBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLOutputTextStream makeOutputTextStream(OutputStream stream) {
		return new SubLOutputTextStreamImpl(stream);
	}

	public static SubLOutputTextStream makeOutputTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLSocketStream makeSocketStream(Socket socket) {
		return new SubLSocketStream(socket);
	}

	public static SubLSocketStream makeSocketStream(String host, int port) {
		return new SubLSocketStream(host, port);
	}
	public static SubLSocketStream makeSocketStream(String host, int port, int timeout) {
		return new SubLSocketStream(host, port, timeout);
	}

	public static SubLInputTextStream makeStringInputStream(String str) {
		return SubLStreamFactory.makeStringInputStream(str, 0, str.length());
	}

	public static SubLInputTextStream makeStringInputStream(String str, int start, int end) {
		try {
			ByteBuffer byteBuffer = ByteBuffer.wrap(str.substring(start, end).getBytes("ISO-8859-1"));
			SubLInputTextStream result = new SubLInputTextStreamImpl(byteBuffer, start);
			return result;
		} catch (Exception e) {
			return Errors.error("Unable to create string input stream.", e).toInputTextStream();
		}
	}

	public static SubLOutputTextStream makeStringOutputStream() {
		return SubLStreamFactory.makeStringOutputStream(256);
	}

	public static SubLOutputTextStream makeStringOutputStream(int initialSize) {
		SubLOutputTextStream result = new SubLOutputTextStreamImpl(initialSize);
		return result;
	}

	public static SubLSynonymStream makeSynonymStream(SubLSymbol streamSymbol) {
		return new SubLSynonymStream(streamSymbol);
	}

	public static SubLSynonymStream makeUnclosableSynonymStream(SubLSymbol streamSymbol) {
		return new SubLSynonymStream(streamSymbol) {

			public void close() {
				Errors.error("Illegal attempt to close a system stream: " + this);
			}
		};
	}
}
