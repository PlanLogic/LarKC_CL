
package com.netbreeze.swing;

import javax.swing.*;
import javax.swing.event.*;

import org.logicmoo.bb.BeansContext;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.*;
import java.lang.reflect.*;

/**
 * A GUI component showing all the static methods of a given class and controls
 * for providing parameters, executing the methods, and manipulating the result
 *
 * @author Henrik Kniberg
 */
public class StaticMethodsPanel extends JPanel implements ActionListener, ListSelectionListener {
	BeansContext context;
	Class cls;

	StaticMethodList methodList;
	MethodParametersPanel paramPanel;
	JButton executeButton;
	JSplitPane splitter;
	MethodResultPanel resultPanel;

	public StaticMethodsPanel(Class cls) throws Exception {
		this(SwingEnvironment.getBeansContext(), cls);
	}

	public StaticMethodsPanel(BeansContext context, Class cls) throws Exception {
		this.context = context;
		this.cls = cls;
		initGUI();
	}

	public void valueChanged(ListSelectionEvent e) {
		Method current = methodList.getSelectedMethod();

		paramPanel.setMethod(current);
		resultPanel.setVisible(current != null);
		if (current != null)
			resultPanel.setResultType(current.getReturnType());
	}

	private void executeMethod(Method method) throws Exception {
		if (method != null) {
			Object[] params = paramPanel.getValues();
			Object returnValue = method.invoke(cls, params);
			resultPanel.setResultValue(returnValue);
		}
	}

	private void initGUI() throws Exception {
		paramPanel = new MethodParametersPanel();
		methodList = new StaticMethodList(cls);
		resultPanel = new MethodResultPanel();

		executeButton = new JButton("Execute method");
		executeButton.addActionListener(this);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout(10, 10));
		bottomPanel.add("West", executeButton);
		bottomPanel.add("Center", resultPanel);

		JScrollPane scroller = new JScrollPane(methodList);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		splitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, scroller, paramPanel);

		setLayout(new BorderLayout());
		add("Center", splitter);
		add("South", bottomPanel);
		methodList.addListSelectionListener(this);
	}

	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == executeButton) {
			Method method = methodList.getSelectedMethod();
			if (method != null) {
				try {
					executeMethod(method);
				} catch (InvocationTargetException err) {
					if (context == null) {
						new ErrorDialog(err.getTargetException()).show();
					} else {
						context.showError(null, err.getTargetException());
					}
				} catch (Throwable err) {
					if (context == null) {
						new ErrorDialog(err).show();
					} else {
						context.showError(null, err);
					}
				}
			}
		}
	}
}
