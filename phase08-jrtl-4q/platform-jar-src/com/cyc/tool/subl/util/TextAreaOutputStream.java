//
//
package com.cyc.tool.subl.util;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class TextAreaOutputStream extends OutputStream {
	public static void main(String[] args) {
	}

	private JTextArea textArea;

	private JScrollPane scrollPane;
	private boolean isScolledToBottom;

	public TextAreaOutputStream(JTextArea textArea, JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
		this.textArea = textArea;
	}

	private boolean isScolledToBottom() {
		JScrollBar sb = this.scrollPane.getVerticalScrollBar();
		int currentValue = sb.getValue();
		int maxValue = sb.getMaximum();
		int extent = sb.getVisibleAmount();
		boolean isAtBottom = currentValue >= maxValue - extent;
		// if (!isAtBottom)int i = 0;
		return isAtBottom;
	}

	private void scrollTextAreaToBottom() {
		JScrollBar sb = this.scrollPane.getVerticalScrollBar();
		sb.setValue(sb.getMaximum());
	}

	public void write(byte[] b, int off, int len) throws IOException {
		this.isScolledToBottom = true;
		try {
			SwingUtilities.invokeAndWait(new SafeRunnable() {

				public void safeRun() {
					TextAreaOutputStream.this.isScolledToBottom = TextAreaOutputStream.this.isScolledToBottom();
				}
			});
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		} catch (Exception e) {
			Errors.handleError("Error while scrolling GUI read/eval loop panel.", e);
		}
		if (b == null)
			throw new NullPointerException();
		if (off < 0 || off > b.length || len < 0 || off + len > b.length || off + len < 0)
			throw new IndexOutOfBoundsException();
		if (len == 0)
			return;
		this.textArea.append(new String(b, off, len));
		if (this.isScolledToBottom)
			SwingUtilities.invokeLater(new SafeRunnable() {

				public void safeRun() {
					TextAreaOutputStream.this.scrollTextAreaToBottom();
				}
			});
	}

	public void write(int b) throws IOException {
		this.textArea.append(String.valueOf((char) b));
	}
}
