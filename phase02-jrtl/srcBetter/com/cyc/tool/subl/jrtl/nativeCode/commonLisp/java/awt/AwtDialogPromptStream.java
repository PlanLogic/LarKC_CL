package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.awt;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.DialogPromptStream;

public class AwtDialogPromptStream extends DialogPromptStream {

	Dialog dialog = new Dialog((Frame) null, true);
	private Label prompt = new Label();
	private TextField input = new TextField(32);

	public AwtDialogPromptStream() {
		this("Prompt");
	}

	public AwtDialogPromptStream(String title) {
		super();
		this.dialog.setTitle(title);
		Panel tmpPanel = new Panel();
		tmpPanel.add(this.prompt);
		tmpPanel.add(this.input);
		this.dialog.add(tmpPanel);
		JButton okBtn = new JButton("Ok");
		okBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				synchronized (AwtDialogPromptStream.this.dialog) {
					AwtDialogPromptStream.this.dialog.dispose();
				}
			}
		});
		tmpPanel = new Panel(new FlowLayout());
		tmpPanel.add(okBtn);
		this.dialog.add(tmpPanel, BorderLayout.SOUTH);
	}

	protected void closeDialog() {
		this.dialog.dispose();
	}

	protected String readInputFromModalDialog(String promptText) {
		this.prompt.setText(promptText);
		this.dialog.pack();
		this.dialog.setVisible(true);
		return this.input.getText();
	}

}
