//
//
package com.cyc.tool.subl.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ASCII_CharStream {
	public static boolean staticFlag = false;

	int bufsize;

	int available;

	int tokenBegin;

	public int bufpos;
	private int[] bufline;
	private int[] bufcolumn;
	private int column;
	private int line;
	private boolean prevCharIsCR;
	private boolean prevCharIsLF;
	private Reader inputStream;
	private char[] buffer;
	private int maxNextCharInd;
	private int inBuf;

	public ASCII_CharStream(InputStream dstream, int startline, int startcolumn) {
		this(dstream, startline, startcolumn, 4096);
	}

	public ASCII_CharStream(InputStream dstream, int startline, int startcolumn, int buffersize) {
		this(new InputStreamReader(dstream), startline, startcolumn, 4096);
	}

	public ASCII_CharStream(Reader dstream, int startline, int startcolumn) {
		this(dstream, startline, startcolumn, 4096);
	}

	public ASCII_CharStream(Reader dstream, int startline, int startcolumn, int buffersize) {
		this.bufpos = -1;
		this.column = 0;
		this.line = 1;
		this.prevCharIsCR = false;
		this.prevCharIsLF = false;
		this.maxNextCharInd = 0;
		this.inBuf = 0;
		this.inputStream = dstream;
		this.line = startline;
		this.column = startcolumn - 1;
		this.bufsize = buffersize;
		this.available = buffersize;
		this.buffer = new char[buffersize];
		this.bufline = new int[buffersize];
		this.bufcolumn = new int[buffersize];
	}

	public void adjustBeginLineColumn(int newLine, int newCol) {
		int start = this.tokenBegin;
		int len;
		if (this.bufpos >= this.tokenBegin)
			len = this.bufpos - this.tokenBegin + this.inBuf + 1;
		else
			len = this.bufsize - this.tokenBegin + this.bufpos + 1 + this.inBuf;
		int i = 0;
		int j = 0;
		int k = 0;
		int nextColDiff = 0;
		int columnDiff = 0;
		while (i < len && this.bufline[j = start % this.bufsize] == this.bufline[k = ++start % this.bufsize]) {
			this.bufline[j] = newLine;
			nextColDiff = columnDiff + this.bufcolumn[k] - this.bufcolumn[j];
			this.bufcolumn[j] = newCol + columnDiff;
			columnDiff = nextColDiff;
			++i;
		}
		if (i < len) {
			this.bufline[j] = newLine++;
			this.bufcolumn[j] = newCol + columnDiff;
			while (i++ < len)
				if (this.bufline[j = start % this.bufsize] != this.bufline[++start % this.bufsize])
					this.bufline[j] = newLine++;
				else
					this.bufline[j] = newLine;
		}
		this.line = this.bufline[j];
		this.column = this.bufcolumn[j];
	}

	public void backup(int amount) {
		this.inBuf += amount;
		int bufpos = this.bufpos - amount;
		this.bufpos = bufpos;
		if (bufpos < 0)
			this.bufpos += this.bufsize;
	}

	public char BeginToken() throws IOException {
		this.tokenBegin = -1;
		char c = this.readChar();
		this.tokenBegin = this.bufpos;
		return c;
	}

	public void Done() {
		this.buffer = null;
		this.bufline = null;
		this.bufcolumn = null;
	}

	private void ExpandBuff(boolean wrapAround) {
		char[] newbuffer = new char[this.bufsize + 2048];
		int[] newbufline = new int[this.bufsize + 2048];
		int[] newbufcolumn = new int[this.bufsize + 2048];
		try {
			if (wrapAround) {
				System.arraycopy(this.buffer, this.tokenBegin, newbuffer, 0, this.bufsize - this.tokenBegin);
				System.arraycopy(this.buffer, 0, newbuffer, this.bufsize - this.tokenBegin, this.bufpos);
				this.buffer = newbuffer;
				System.arraycopy(this.bufline, this.tokenBegin, newbufline, 0, this.bufsize - this.tokenBegin);
				System.arraycopy(this.bufline, 0, newbufline, this.bufsize - this.tokenBegin, this.bufpos);
				this.bufline = newbufline;
				System.arraycopy(this.bufcolumn, this.tokenBegin, newbufcolumn, 0, this.bufsize - this.tokenBegin);
				System.arraycopy(this.bufcolumn, 0, newbufcolumn, this.bufsize - this.tokenBegin, this.bufpos);
				this.bufcolumn = newbufcolumn;
				int n = this.bufpos + this.bufsize - this.tokenBegin;
				this.bufpos = n;
				this.maxNextCharInd = n;
			} else {
				System.arraycopy(this.buffer, this.tokenBegin, newbuffer, 0, this.bufsize - this.tokenBegin);
				this.buffer = newbuffer;
				System.arraycopy(this.bufline, this.tokenBegin, newbufline, 0, this.bufsize - this.tokenBegin);
				this.bufline = newbufline;
				System.arraycopy(this.bufcolumn, this.tokenBegin, newbufcolumn, 0, this.bufsize - this.tokenBegin);
				this.bufcolumn = newbufcolumn;
				int n2 = this.bufpos - this.tokenBegin;
				this.bufpos = n2;
				this.maxNextCharInd = n2;
			}
		} catch (Throwable t) {
			throw new Error(t.getMessage());
		}
		this.bufsize += 2048;
		this.available = this.bufsize;
		this.tokenBegin = 0;
	}

	private void FillBuff() throws IOException {
		if (this.maxNextCharInd == this.available)
			if (this.available == this.bufsize) {
				if (this.tokenBegin > 2048) {
					boolean b = false;
					this.maxNextCharInd = b ? 1 : 0;
					this.bufpos = b ? 1 : 0;
					this.available = this.tokenBegin;
				} else if (this.tokenBegin < 0) {
					boolean b2 = false;
					this.maxNextCharInd = b2 ? 1 : 0;
					this.bufpos = b2 ? 1 : 0;
				} else
					this.ExpandBuff(false);
			} else if (this.available > this.tokenBegin)
				this.available = this.bufsize;
			else if (this.tokenBegin - this.available < 2048)
				this.ExpandBuff(true);
			else
				this.available = this.tokenBegin;
		try {
			int i;
			if ((i = this.inputStream.read(this.buffer, this.maxNextCharInd,
					this.available - this.maxNextCharInd)) == -1) {
				this.inputStream.close();
				throw new IOException();
			}
			this.maxNextCharInd += i;
		} catch (IOException e) {
			--this.bufpos;
			this.backup(0);
			if (this.tokenBegin == -1)
				this.tokenBegin = this.bufpos;
			throw e;
		}
	}

	public int getBeginColumn() {
		return this.bufcolumn[this.tokenBegin];
	}

	public int getBeginLine() {
		return this.bufline[this.tokenBegin];
	}

	public int getColumn() {
		return this.bufcolumn[this.bufpos];
	}

	public int getEndColumn() {
		return this.bufcolumn[this.bufpos];
	}

	public int getEndLine() {
		return this.bufline[this.bufpos];
	}

	public String GetImage() {
		if (this.bufpos >= this.tokenBegin)
			return new String(this.buffer, this.tokenBegin, this.bufpos - this.tokenBegin + 1);
		return new String(this.buffer, this.tokenBegin, this.bufsize - this.tokenBegin)
				+ new String(this.buffer, 0, this.bufpos + 1);
	}

	public int getLine() {
		return this.bufline[this.bufpos];
	}

	public char[] GetSuffix(int len) {
		char[] ret = new char[len];
		if (this.bufpos + 1 >= len)
			System.arraycopy(this.buffer, this.bufpos - len + 1, ret, 0, len);
		else {
			System.arraycopy(this.buffer, this.bufsize - (len - this.bufpos - 1), ret, 0, len - this.bufpos - 1);
			System.arraycopy(this.buffer, 0, ret, len - this.bufpos - 1, this.bufpos + 1);
		}
		return ret;
	}

	public char readChar() throws IOException {
		if (this.inBuf > 0) {
			--this.inBuf;
			return (char) ('\u00ff' & this.buffer[this.bufpos == this.bufsize - 1 ? (this.bufpos = 0) : ++this.bufpos]);
		}
		if (++this.bufpos >= this.maxNextCharInd)
			this.FillBuff();
		char c = (char) ('\u00ff' & this.buffer[this.bufpos]);
		this.UpdateLineColumn(c);
		return c;
	}

	public void ReInit(InputStream dstream, int startline, int startcolumn) {
		this.ReInit(dstream, startline, startcolumn, 4096);
	}

	public void ReInit(InputStream dstream, int startline, int startcolumn, int buffersize) {
		this.ReInit(new InputStreamReader(dstream), startline, startcolumn, 4096);
	}

	public void ReInit(Reader dstream, int startline, int startcolumn) {
		this.ReInit(dstream, startline, startcolumn, 4096);
	}

	public void ReInit(Reader dstream, int startline, int startcolumn, int buffersize) {
		this.inputStream = dstream;
		this.line = startline;
		this.column = startcolumn - 1;
		if (this.buffer == null || buffersize != this.buffer.length) {
			this.bufsize = buffersize;
			this.available = buffersize;
			this.buffer = new char[buffersize];
			this.bufline = new int[buffersize];
			this.bufcolumn = new int[buffersize];
		}
		boolean b = false;
		this.prevCharIsCR = b;
		this.prevCharIsLF = b;
		boolean tokenBegin = false;
		this.maxNextCharInd = tokenBegin ? 1 : 0;
		this.inBuf = tokenBegin ? 1 : 0;
		this.tokenBegin = tokenBegin ? 1 : 0;
		this.bufpos = -1;
	}

	private void UpdateLineColumn(char c) {
		++this.column;
		if (this.prevCharIsLF) {
			this.prevCharIsLF = false;
			int line = this.line;
			int column = 1;
			this.column = column;
			this.line = line + column;
		} else if (this.prevCharIsCR) {
			this.prevCharIsCR = false;
			if (c == '\n')
				this.prevCharIsLF = true;
			else {
				int line2 = this.line;
				int column2 = 1;
				this.column = column2;
				this.line = line2 + column2;
			}
		}
		switch (c) {
		case '\r':
			this.prevCharIsCR = true;
			break;
		case '\n':
			this.prevCharIsLF = true;
			break;
		case '\t':
			--this.column;
			this.column += 8 - (this.column & 0x7);
			break;
		}
		this.bufline[this.bufpos] = this.line;
		this.bufcolumn[this.bufpos] = this.column;
	}
}
