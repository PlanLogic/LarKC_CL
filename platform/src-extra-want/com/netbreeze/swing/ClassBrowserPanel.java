package com.netbreeze.swing;

import javax.swing.*;

import org.logicmoo.bb.BeansContext;

import java.awt.*;
import java.awt.event.*;
import com.netbreeze.swing.*;
import com.netbreeze.util.Utility;

/**
 * A GUI component that lets you select any class and browse
 * its constructors, static methods, etc.
 *
 * @author Henrk Kniberg
 */
public class ClassBrowserPanel extends JPanel implements ActionListener {
  BeansContext context;

  JTextField text;
  JButton okButton;
  JPanel topPanel = new JPanel();
  JPanel classPanel = new JPanel();

  public ClassBrowserPanel(BeansContext context) {
    this.context = context;
    initGUI();
  }

  public ClassBrowserPanel() {
    this(SwingEnvironment.getBeansContext());
  }

  private void initGUI() {
    Container content = this;
    content.setLayout(new BorderLayout());

    text = new JTextField(10);
    text.addActionListener(this);
    okButton = new JButton("Browse this class");
    okButton.addActionListener(this);

    JPanel textPanel = new JPanel();
    textPanel.setLayout(new BorderLayout());
    textPanel.add("Center", text);
    textPanel.add("East", okButton);

    topPanel.setLayout(new VerticalLayout());
    topPanel.add(new JLabel("Enter the complete classname:"));
    topPanel.add(textPanel);

    classPanel.setLayout(new BorderLayout());

    content.add("North", topPanel);
    content.add("Center", classPanel);

    //setSize(300, 200);
  }

  public void actionPerformed(ActionEvent evt) {
    showClass();
  }

  /**
   * Shows the currently select class now,
   * or shows an error if something went wrong.
   */
  private void showClass() {
    classPanel.removeAll();
    try {
      Class cl = Class.forName(text.getText());
      LargeBeanView view = new LargeBeanView(context, cl);
      classPanel.add("Center", view);
    } catch (Exception err) {
      classPanel.add("Center", new JLabel(err.toString()));
    }
  }
}
