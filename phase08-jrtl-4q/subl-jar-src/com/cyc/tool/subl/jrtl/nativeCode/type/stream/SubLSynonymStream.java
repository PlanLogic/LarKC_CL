//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLSynonymStream extends AbstractSubLStream {
	SubLSynonymStream(SubLSymbol streamSymbol) {
		super(CommonSymbols.TEXT_KEYWORD, streamSymbol.getValue().getStream(true).getDirection(),
				CommonSymbols.ERROR_KEYWORD, CommonSymbols.ERROR_KEYWORD);
		this.streamSymbol = streamSymbol;
	}

	private SubLSymbol streamSymbol;

	@Override
	public SubLSymbol getDirection() {
		return getStream(true).getDirection();
	}

	@Override
	public SubLSymbol getElementType() {
		return getStream(true).getElementType();
	}

	@Override
	public FileDescriptor getFD() {
		return getStream(true).getFD();
	}

	@Override
	public File getFile() {
		return getStream(true).getFile();
	}

	@Override
	public long getFilePointer() {
		return getStream(true).getFilePointer();
	}

	@Override
	public String getNewline() {
		return getStream(true).getNewline();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		if (!followSynonymStream)
			return this;
		try {
			SubLStream result;
			for (result = streamSymbol.getValue()
					.getStream(true); result instanceof SubLSynonymStream; result = ((SubLSynonymStream) result)
							.getStreamSymbol().getValue().getStream(true)) {
			}
			return result;
		} catch (Exception e) {
			return this;
		}
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		return streamSymbol;
	}

	@Override
	public SubLSymbol ifExists() {
		return getStream(true).ifExists();
	}

	@Override
	public SubLSymbol ifNotExists() {
		return getStream(true).ifNotExists();
	}

	@Override
	public boolean isInteractive() {
		return getStream(true).isInteractive();
	}

	@Override
	public boolean isRandomAccess() {
		return getStream(true).isRandomAccess();
	}

	@Override
	public long length() {
		return getStream(true).length();
	}

	@Override
	public void seek(long pos) {
		getStream(true).seek(pos);
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		getStream(true).setIsInteractive(newValue);
	}

	@Override
	public void setLength(long newLength) {
		getStream(true).setLength(newLength);
	}

	@Override
	public void setNewline(String newline) {
		getStream(true).setNewline(newline);
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return getStream(true).toInputBinaryStream();
	}

	@Override
	public SubLInputStream toInputStream() {
		return getStream(true).toInputStream();
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return getStream(true).toInputTextStream();
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return getStream(true).toOutputBinaryStream();
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return getStream(true).toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return getStream(true).toOutputTextStream();
	}
}
