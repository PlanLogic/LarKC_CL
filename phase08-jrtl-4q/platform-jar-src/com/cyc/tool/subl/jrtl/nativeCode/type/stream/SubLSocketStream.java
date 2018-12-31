//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class SubLSocketStream extends SubLInOutTextStreamImpl implements SubLOutputBinaryStream, SubLInputBinaryStream {
	public static void main(String[] args) {
	}

	private Socket socket;

	private String host;

	/** Creates a new instance of SubLSocketStream. */
	SubLSocketStream(Socket socket) {
		this.socket = socket;
		this.host = socket.getInetAddress().getCanonicalHostName();
		try {
			socket.setSoLinger(true, 50);
			socket.setReceiveBufferSize(1024 * 1024 * 4);
			socket.setTcpNoDelay(true);
			socket.setSoTimeout(250);
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + socket + ".", ioe);
		}
		this.init();
	}

	SubLSocketStream(String host, int port, int timeout) {
		if (port < 0 || port >= 65536)
			Errors.error("Got invalid port number: " + port);
		try {
			this.host = host;
			SocketAddress sockAddr = new InetSocketAddress(host, port);
			(this.socket = new Socket()).connect(sockAddr, timeout);
			this.socket.setSoLinger(true, 50);
			this.socket.setReceiveBufferSize(1024 * 1024 * 4);
			this.socket.setTcpNoDelay(true);
			this.socket.setSoTimeout(250);
		} catch (UnknownHostException uhe) {
			Errors.error("Got unknown host: " + host, uhe);
		} catch (IOException ioe) {
			Errors.error("Unable to open socket " + host + "@" + port + ".", ioe);
		}
		this.init();
	}

	public synchronized void close() {
		if (this.isClosed())
			return;
		try {
			if (this.socket != null) {
				try {
					if (!this.socket.isInputShutdown())
						this.socket.shutdownInput();
				} catch (Exception ex) {
				}
				try {
					if (!this.socket.isOutputShutdown())
						this.socket.shutdownOutput();
				} catch (Exception ex2) {
				}
				this.socket.close();
				this.socket = null;
			}
		} catch (IOException ex3) {
		}
		super.close();
	}

	protected void init() {
		try {
			this.inStream = SubLStreamFactory.makeInputTextStream(this.socket);
			this.outStream = SubLStreamFactory.makeOutputTextStream(this.socket.getOutputStream());
		} catch (IOException ioe) {
			Errors.error("Error trying to establish socket input/output streams.", ioe);
		}
	}

	public String toString() {
		return "#<SOCKET-STREAM " + this.host + ":"
				+ (this.socket == null ? "INVALID SOCKET" : "" + this.socket.getPort())
				+ (this.isClosed() ? " CLOSED" : " OPEN") + " @ " + this.superHash() + ">";
	}
}
