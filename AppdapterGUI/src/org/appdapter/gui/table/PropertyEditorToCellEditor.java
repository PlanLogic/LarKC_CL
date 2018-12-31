/**
 * L2FProd.com Common Components 7.3 License.
 *
 * Copyright 2005-2007 L2FProd.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.appdapter.gui.table;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.table.TableCellEditor;
import javax.swing.text.JTextComponent;
import javax.swing.tree.TreeCellEditor;

import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.trigger.TriggerMouseAdapter;

/**
 * Allows to use any PropertyEditor as a Table or Tree cell editor. <br>
 */
public class PropertyEditorToCellEditor extends AbstractCellEditor implements TableCellEditor, TreeCellEditor, CellEditorComponent {

	protected PropertyEditor editor;
	protected int clickCountToStart = 1;
	private Component custComponent;
	private Component hookTo;

	class CommitEditing implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stopCellEditing();
		}
	}

	class CancelEditing implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			PropertyEditorToCellEditor.this.cancelCellEditing();
		}
	}

	/**
	 * Select all text when focus gained, deselect when focus lost.
	 */
	class SelectOnFocus implements FocusListener {
		public void focusGained(final FocusEvent e) {
			if (!(e.getSource() instanceof JTextField))
				return;
			Utility.invokeLater(new Runnable() {
				public void run() {
					((JTextField) e.getSource()).selectAll();
				}
			});
		}

		public void focusLost(final FocusEvent e) {
			if (!(e.getSource() instanceof JTextField))
				return;
			Utility.invokeLater(new Runnable() {
				public void run() {
					((JTextField) e.getSource()).select(0, 0);
				}
			});
		}
	}

	public PropertyEditorToCellEditor(PropertyEditor editor) {
		this.editor = editor;
		this.custComponent = editor.getCustomEditor();
		if (custComponent == null) {
			Utility.bug("no custom editor for " + editor);
		}
		hookTo = custComponent;
		TriggerMouseAdapter.installMouseAdapter(custComponent);
		if (hookTo instanceof JPanel) {
			JPanel panel = (JPanel) custComponent;
			for (Component c : panel.getComponents()) {
				if (c instanceof JTextField) {
					hookTo = c;
					break;
				}
			}
		}
		if (hookTo instanceof JTextField) {
			JTextField field = (JTextField) hookTo;
			TriggerMouseAdapter.installMouseAdapter(hookTo);
			field.addFocusListener(new SelectOnFocus());
			field.addActionListener(new CommitEditing());
			field.registerKeyboardAction(new CancelEditing(), KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_FOCUSED);
		} else {
			if (hookTo instanceof JTextComponent) {

			}
		}

		// when the editor notifies a change, commit the changes
		editor.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				stopCellEditing();
			}
		});
	}

	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row) {
		return getEditor(value);
	}

	public Component getTableCellEditorComponent(JTable table, Object value, boolean selected, int row, int column) {
		return getEditor(value);
	}

	public void setClickCountToStart(int count) {
		clickCountToStart = count;
	}

	public int getClickCountToStart() {
		return clickCountToStart;
	}

	public Object getCellEditorValue() {
		return editor.getValue();
	}

	public boolean isCellEditable(EventObject event) {
		if (event instanceof MouseEvent) {
			return ((MouseEvent) event).getClickCount() >= clickCountToStart;
		}
		return true;
	}

	public boolean shouldSelectCell(EventObject event) {
		return true;
	}

	public boolean stopCellEditing() {
		fireEditingStopped();
		return true;
	}

	public void cancelCellEditing() {
		fireEditingCanceled();
	}

	private Component getEditor(Object value) {
		editor.setValue(value);

		final Component cellEditor = editor.getCustomEditor();

		// request focus later so the editor can be used to enter value as soon as
		// made visible
		Utility.invokeLater(new Runnable() {
			public void run() {
				cellEditor.requestFocus();
			}
		});

		return cellEditor;
	}

	@Override public TreeCellEditor getTreeCellEditor() {
		return this;
	}

	@Override public TableCellEditor getCellEditor() {
		return this;
	}

	@Override public Component getCustomEditor() {
		return editor.getCustomEditor();
	}

	@Override public Object getValue() {
		return editor.getValue();
	}

}