//
//
package com.cyc.tool.subl.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.JTextComponent;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLCommandHistory;
import com.cyc.tool.subl.util.TextAreaInputStream;
import com.cyc.tool.subl.util.TextAreaOutputStream;

public class SubLReaderPanel extends JPanel {
	class RedoAction extends AbstractAction {
		public RedoAction() {
			super("Redo");
			this.setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				SubLReaderPanel.this.undo.redo();
			} catch (CannotRedoException ex) {
				System.out.println("Unable to redo: " + ex);
				ex.printStackTrace();
			}
			this.updateRedoState();
			SubLReaderPanel.this.undoAction.updateUndoState();
		}

		protected void updateRedoState() {
			if (SubLReaderPanel.this.undo.canRedo()) {
				this.setEnabled(true);
				this.putValue("Name", SubLReaderPanel.this.undo.getRedoPresentationName());
			} else {
				this.setEnabled(false);
				this.putValue("Name", "Redo");
			}
		}
	}

	protected class SubLReaderUndoableEditListener implements UndoableEditListener {

		public void undoableEditHappened(UndoableEditEvent e) {
			SubLReaderPanel.this.undo.addEdit(e.getEdit());
			SubLReaderPanel.this.undoAction.updateUndoState();
			SubLReaderPanel.this.redoAction.updateRedoState();
		}
	}

	class UndoAction extends AbstractAction {
		public UndoAction() {
			super("Undo");
			this.setEnabled(false);
		}

		public void actionPerformed(ActionEvent e) {
			try {
				SubLReaderPanel.this.undo.undo();
			} catch (CannotUndoException ex) {
				Errors.handleError("Unable to undo in read-eval loop GUI.", ex);
			}
			this.updateUndoState();
			SubLReaderPanel.this.redoAction.updateRedoState();
		}

		protected void updateUndoState() {
			if (SubLReaderPanel.this.undo.canUndo()) {
				this.setEnabled(true);
				this.putValue("Name", SubLReaderPanel.this.undo.getUndoPresentationName());
			} else {
				this.setEnabled(false);
				this.putValue("Name", "Undo");
			}
		}
	}

	private static JFrame mainFrame;

	private static SubLReaderPanel mainReaderPanel;

	private static Robot robot;
	static {
		try {
			SubLReaderPanel.robot = new Robot();
		} catch (Exception e) {
			Errors.handleError("Unable to create UI robot.", e);
		}
	}

	public static SubLReader startReadloopWindow() {
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		SubLReaderPanel mainReaderPanel = new SubLReaderPanel(env);
		JFrame mainFrame = new JFrame("SubL Interpreter");
		mainFrame.setContentPane(mainReaderPanel);
		mainFrame.setSize(700, 850);
		mainFrame.validate();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension curSize = mainFrame.getSize();
		mainFrame.setLocation(screenSize.width / 2 - curSize.width / 2, screenSize.height / 2 - curSize.height / 2);
		mainFrame.setVisible(true);
		return mainReaderPanel.getReader();
	}

	private SubLEnvironment env;
	private int historyNum;
	private SubLCommandHistory history;
	private InputStream inStream;
	private OutputStream outStream;
	private SubLReader sublReader;
	private UndoAction undoAction;
	private RedoAction redoAction;
	private UndoManager undo;
	private HashMap actions;
	private JButton ClearEntryButton;
	private JButton clearButton;
	private JButton downButton;
	private JButton enterButton;
	private JPanel entryButtonPanel;
	private JPanel entryEditorPanel;
	private JLabel entryLabel;
	private JPanel entryPanel;
	private JScrollPane entryScrollPane;
	private JTextArea entryTextArea;
	private JPanel entryTopPanel;
	private JButton findButton;
	private JButton historyGotoButton;
	private JLabel historyGotoLabel;
	private JPanel historyGotoPanel;
	private JTextField historyGotoTextField;
	private JButton loadFileButton;
	private JSplitPane mainSplitPane;
	private JButton quitButton;
	private JPanel resultBottomPanel;
	private JLabel resultsLabel;
	private JPanel resultsPanel;
	private JScrollPane resultsScrollPane;
	private JTextArea resultsTextArea;
	private JPanel resultsTopPanel;
	private JButton upButton;
	private JProgressBar workingProgressBar;

	public SubLReaderPanel(SubLEnvironment env) {
		this.historyNum = 1;
		this.history = new SubLCommandHistory();
		this.undoAction = new UndoAction();
		this.redoAction = new RedoAction();
		this.undo = new UndoManager();
		this.initComponents();
		this.init(env);
		try {
			this.inStream = new TextAreaInputStream(this.entryTextArea);
			this.outStream = new TextAreaOutputStream(this.resultsTextArea, this.resultsScrollPane);
			this.sublReader = new SubLReader(true, this.inStream, this.outStream) {

				protected void setIsBusy(boolean isBusy) {
					super.isBusy();
					SubLReaderPanel.this.workingProgressBar.setIndeterminate(isBusy);
					SubLReaderPanel.this.enterButton.setEnabled(!this.isBusy());
					SubLReaderPanel.this.loadFileButton.setEnabled(!this.isBusy());
				}

				public void writeCommand(String command) {
					System.out.print(command);
					System.out.flush();
				}

				public void writePrompt(String prompt) {
					super.writePrompt(prompt);
					SubLReaderPanel.this.entryLabel.setText(prompt);
				}

				public void writeResults(String results) {
					super.writeResults(results);
					SubLReaderPanel.this.scrollEntryTextAreaToBottom();
				}
			};
		} catch (Exception e) {
			Errors.error("Can't create read loop UI.", e);
		}
	}

	protected void addBindings(InputMap inputMap) {
		KeyStroke key = KeyStroke.getKeyStroke(66, 2);
		inputMap.put(key, "caret-backward");
		key = KeyStroke.getKeyStroke(70, 2);
		inputMap.put(key, "caret-forward");
		key = KeyStroke.getKeyStroke(80, 2);
		inputMap.put(key, "caret-up");
		key = KeyStroke.getKeyStroke(78, 2);
		inputMap.put(key, "caret-down");
		key = KeyStroke.getKeyStroke(69, 2);
		inputMap.put(key, "caret-end-line");
		key = KeyStroke.getKeyStroke(65, 2);
		inputMap.put(key, "caret-begin-line");
		key = KeyStroke.getKeyStroke(68, 2);
		inputMap.put(key, "delete-next");
		key = KeyStroke.getKeyStroke(65, 8);
		inputMap.put(key, "select-all");
		key = KeyStroke.getKeyStroke(88, 2);
		inputMap.put(key, "cut-to-clipboard");
		key = KeyStroke.getKeyStroke(67, 2);
		inputMap.put(key, "copy-to-clipboard");
		key = KeyStroke.getKeyStroke(86, 2);
		inputMap.put(key, "paste-from-clipboard");
		key = KeyStroke.getKeyStroke(90, 2);
		inputMap.put(key, this.undoAction);
		key = KeyStroke.getKeyStroke(89, 2);
		inputMap.put(key, this.redoAction);
	}

	private void clearButtonActionPerformed(ActionEvent evt) {
	}

	private void ClearEntryButtonActionPerformed(ActionEvent evt) {
		this.entryTextArea.setText("");
		this.entryTextArea.grabFocus();
	}

	private void createActionTable(JTextComponent textComponent) {
		this.actions = new HashMap();
		Action[] actionsArray = textComponent.getActions();
		for (int i = 0; i < actionsArray.length; ++i) {
			Action a = actionsArray[i];
			this.actions.put(a.getValue("Name"), a);
		}
	}

	protected JMenu createEditMenu() {
		JMenu menu = new JMenu("Edit");
		menu.add(this.undoAction);
		menu.add(this.redoAction);
		menu.addSeparator();
		menu.add(this.getActionByName("cut-to-clipboard"));
		menu.add(this.getActionByName("copy-to-clipboard"));
		menu.add(this.getActionByName("paste-from-clipboard"));
		menu.addSeparator();
		menu.add(this.getActionByName("select-all"));
		return menu;
	}

	private void downButtonActionPerformed(ActionEvent evt) {
	}

	private void enterButtonActionPerformed(ActionEvent evt) {
		this.forceEvaluation();
		this.entryTextArea.grabFocus();
	}

	private void findButtonActionPerformed(ActionEvent evt) {
	}

	private void forceEvaluation() {
		this.entryTextArea.grabFocus();
		this.entryTextArea.setCaretPosition(this.entryTextArea.getText().length());
		this.entryTextArea.setSelectionStart(0);
		this.entryTextArea.setSelectionEnd(0);
		SubLReaderPanel.robot.keyPress(10);
		SubLReaderPanel.robot.keyRelease(10);
	}

	private Action getActionByName(String name) {
		return (Action) this.actions.get(name);
	}

	public SubLReader getReader() {
		return this.sublReader;
	}

	private void historyGotoButtonActionPerformed(ActionEvent evt) {
	}

	private void historyGotoTextFieldActionPerformed(ActionEvent evt) {
	}

	private void init(SubLEnvironment env) {
		this.entryTextArea.setTabSize(2);
		this.resultsTextArea.setTabSize(2);
		this.entryTextArea.getDocument().addUndoableEditListener(new SubLReaderUndoableEditListener());
		this.createActionTable(this.entryTextArea);
		this.addBindings(this.entryTextArea.getInputMap());
		this.env = env;
		this.findButton.setEnabled(false);
		this.historyGotoTextField.setEnabled(false);
		this.historyGotoLabel.setEnabled(false);
		this.historyGotoButton.setEnabled(false);
		this.upButton.setEnabled(false);
		this.downButton.setEnabled(false);
		this.loadFileButton.setEnabled(true);
		this.entryTextArea.grabFocus();
	}

	private void initComponents() {
		this.mainSplitPane = new JSplitPane();
		this.resultsPanel = new JPanel();
		this.resultsScrollPane = new JScrollPane();
		this.resultsTextArea = new JTextArea();
		this.resultsTopPanel = new JPanel();
		this.resultsLabel = new JLabel();
		this.resultBottomPanel = new JPanel();
		this.workingProgressBar = new JProgressBar();
		this.clearButton = new JButton();
		this.findButton = new JButton();
		this.historyGotoPanel = new JPanel();
		this.historyGotoLabel = new JLabel();
		this.historyGotoTextField = new JTextField();
		this.historyGotoButton = new JButton();
		this.upButton = new JButton();
		this.downButton = new JButton();
		this.entryPanel = new JPanel();
		this.entryButtonPanel = new JPanel();
		this.enterButton = new JButton();
		this.ClearEntryButton = new JButton();
		this.loadFileButton = new JButton();
		this.quitButton = new JButton();
		this.entryEditorPanel = new JPanel();
		this.entryScrollPane = new JScrollPane();
		this.entryTextArea = new JTextArea();
		this.entryTopPanel = new JPanel();
		this.entryLabel = new JLabel();
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.setPreferredSize(new Dimension(700, 900));
		this.mainSplitPane.setDividerLocation(200);
		this.mainSplitPane.setOrientation(0);
		this.mainSplitPane.setOneTouchExpandable(true);
		this.resultsPanel.setLayout(new BorderLayout());
		this.resultsTextArea.setEditable(false);
		this.resultsTextArea.setFont(new Font("Monospaced", 0, 12));
		this.resultsTextArea.setMargin(new Insets(7, 7, 7, 7));
		this.resultsScrollPane.setViewportView(this.resultsTextArea);
		this.resultsPanel.add(this.resultsScrollPane, "Center");
		this.resultsTopPanel.setLayout(new FlowLayout(0));
		this.resultsLabel.setFont(new Font("DialogInput", 1, 12));
		this.resultsLabel.setText("Results:");
		this.resultsTopPanel.add(this.resultsLabel);
		this.resultsPanel.add(this.resultsTopPanel, "North");
		this.resultBottomPanel.setLayout(new FlowLayout(2, 15, 5));
		this.resultBottomPanel.add(this.workingProgressBar);
		this.clearButton.setMnemonic('a');
		this.clearButton.setText("Clear");
		this.clearButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.clearButtonActionPerformed(evt);
			}
		});
		this.resultBottomPanel.add(this.clearButton);
		this.findButton.setMnemonic('F');
		this.findButton.setText("Find");
		this.findButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.findButtonActionPerformed(evt);
			}
		});
		this.resultBottomPanel.add(this.findButton);
		this.historyGotoPanel.setBorder(BorderFactory.createEtchedBorder(0));
		this.historyGotoLabel.setLabelFor(this.historyGotoTextField);
		this.historyGotoLabel.setText("Go to: ");
		this.historyGotoPanel.add(this.historyGotoLabel);
		this.historyGotoTextField.setColumns(5);
		this.historyGotoTextField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.historyGotoTextFieldActionPerformed(evt);
			}
		});
		this.historyGotoPanel.add(this.historyGotoTextField);
		this.historyGotoButton.setMnemonic('g');
		this.historyGotoButton.setText("Go");
		this.historyGotoButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.historyGotoButtonActionPerformed(evt);
			}
		});
		this.historyGotoPanel.add(this.historyGotoButton);
		this.resultBottomPanel.add(this.historyGotoPanel);
		this.upButton.setMnemonic('u');
		this.upButton.setText("Up");
		this.upButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.upButtonActionPerformed(evt);
			}
		});
		this.resultBottomPanel.add(this.upButton);
		this.downButton.setMnemonic('d');
		this.downButton.setText("Down");
		this.downButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.downButtonActionPerformed(evt);
			}
		});
		this.resultBottomPanel.add(this.downButton);
		this.resultsPanel.add(this.resultBottomPanel, "South");
		this.mainSplitPane.setBottomComponent(this.resultsPanel);
		this.entryPanel.setLayout(new BorderLayout());
		this.entryButtonPanel.setLayout(new FlowLayout(2, 15, 5));
		this.enterButton.setMnemonic('e');
		this.enterButton.setText("Evaluate");
		this.enterButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.enterButtonActionPerformed(evt);
			}
		});
		this.entryButtonPanel.add(this.enterButton);
		this.ClearEntryButton.setMnemonic('C');
		this.ClearEntryButton.setText("Clear");
		this.ClearEntryButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.ClearEntryButtonActionPerformed(evt);
			}
		});
		this.entryButtonPanel.add(this.ClearEntryButton);
		this.loadFileButton.setMnemonic('l');
		this.loadFileButton.setText("Load");
		this.loadFileButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.loadFileButtonActionPerformed(evt);
			}
		});
		this.entryButtonPanel.add(this.loadFileButton);
		this.quitButton.setMnemonic('q');
		this.quitButton.setText("Quit");
		this.quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				SubLReaderPanel.this.quitButtonActionPerformed(evt);
			}
		});
		this.entryButtonPanel.add(this.quitButton);
		this.entryPanel.add(this.entryButtonPanel, "South");
		this.entryEditorPanel.setLayout(new BorderLayout());
		this.entryTextArea.setFont(new Font("Monospaced", 0, 12));
		this.entryTextArea.setMargin(new Insets(7, 7, 7, 7));
		this.entryScrollPane.setViewportView(this.entryTextArea);
		this.entryEditorPanel.add(this.entryScrollPane, "Center");
		this.entryPanel.add(this.entryEditorPanel, "Center");
		this.entryTopPanel.setLayout(new FlowLayout(0));
		this.entryLabel.setFont(new Font("DialogInput", 1, 12));
		this.entryLabel.setText("Enter:");
		this.entryTopPanel.add(this.entryLabel);
		this.entryPanel.add(this.entryTopPanel, "North");
		this.mainSplitPane.setTopComponent(this.entryPanel);
		this.add(this.mainSplitPane, "Center");
	}

	private void loadFile() {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(SubLReaderPanel.mainFrame);
		if (returnVal == 0) {
			String fileName = chooser.getSelectedFile().getAbsolutePath();
			String command = "(load \"" + fileName + "\")";
			this.entryTextArea.setText(command);
			this.forceEvaluation();
		}
	}

	private void loadFileButtonActionPerformed(ActionEvent evt) {
		this.loadFile();
		this.entryTextArea.grabFocus();
	}

	private void quitButtonActionPerformed(ActionEvent evt) {
		this.verifyQuit();
	}

	private void resetUIAfterProcessing() {
		Runnable runnable = new SafeRunnable() {

			public void safeRun() {
				SubLReaderPanel.this.resultsTextArea
						.setCaretPosition(SubLReaderPanel.this.resultsTextArea.getText().length());
				SubLReaderPanel.this.enterButton.setEnabled(true);
				SubLReaderPanel.this.entryTextArea.setEnabled(true);
				SubLReaderPanel.this.entryTextArea.setText("");
				SubLReaderPanel.this.entryTextArea.grabFocus();
			}
		};
		SwingUtilities.invokeLater(runnable);
	}

	public void scrollEntryTextAreaToBottom() {
		JScrollBar sb = this.entryScrollPane.getVerticalScrollBar();
		sb.setValue(sb.getMaximum());
	}

	private void upButtonActionPerformed(ActionEvent evt) {
	}

	private void verifyQuit() {
		int result = JOptionPane.showConfirmDialog(SubLReaderPanel.mainReaderPanel,
				"Do you want to quit the application?", "Quit?", 0, 3);
		if (result == 0)
			SubLMain.me.doSystemCleanupAndExit(0);
	}
}
