

package com.netbreeze.swing;

import javax.swing.*;

import com.netbreeze.util.*;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import org.apache.log4j.*;

public class NumberField extends JPanel implements ActionListener, KeyListener, FocusListener {
  static Category cat = Category.getInstance(NumberField.class);

	/**
	* Property constant (used in PropertyChangeEvents)
	*/
	public static final String VALUE = "value";


  Number smallIncrement = new Integer(1);
  Number largeIncrement = new Integer(10);

  boolean scroller = false;
  ScrollButtonPanel scrollPanel;
  Number value;
  Number defaultValue;
  Class type;
  JTextField textfield;

	PropertyChangeSupport propSupport = new PropertyChangeSupport(this);
  VetoableChangeSupport vetoSupport = new VetoableChangeSupport(this);

  public NumberField() {
    this(Double.class, new Integer(0), true);
  }

	public NumberField(Class type, Number value, boolean scroller) {
    //if (!type.isInstance(value))
    //  throw new IllegalArgumentException(value + " is not an instance of " + type + "!");
		this.scroller = scroller;
    this.type = type;
		init();
    if (value == null)
      defaultValue = convertNumberType(new Integer(0), type);
    else
  		defaultValue = convertNumberType(value, type);
    try {
  		restoreDefault();
    } catch (Exception err) {
      cat.error("Initialization of NumberField failed!", err);
    }
		updateLayout();
	}

	/**
	* All PropertyChangeListeners will receive property change events
	* when the date changes.
	*/
	public void addPropertyChangeListener(PropertyChangeListener p) {
		propSupport.addPropertyChangeListener(p);
	}

	public void removePropertyChangeListener(PropertyChangeListener p) {
		propSupport.removePropertyChangeListener(p);
	}

  public void addVetoableChangeListener(VetoableChangeListener v) {
    vetoSupport.addVetoableChangeListener(v);
  }

  public void removeVetoableChangeListener(VetoableChangeListener v) {
    vetoSupport.removeVetoableChangeListener(v);
  }

	/**
	* Restores the default value
	*/
	public void restoreDefault() throws Exception {
    setValue(defaultValue);
	}

	/**
	* Sets a new value
	*/
	public void setValue(Number newValue) throws Exception {
    if (newValue == null) {
      setValue(defaultValue);
    } else {
    	Number oldValue = value;
      if (!type.isInstance(newValue))
        throw new IllegalArgumentException(newValue + " is not an instance of " + type + "!");
      if (!Utility.isEqual(oldValue, newValue)) {
        vetoSupport.fireVetoableChange(VALUE, oldValue, newValue);
    		value = newValue;
  			displayValue();
    		propSupport.firePropertyChange(VALUE, oldValue, newValue);
      }
    }
	}

	public Number getValue(){
		return value;
	}

	/**
	* True if a scroller is currently displayed
	*/
	public boolean getScroller() {
		return scroller;
	}

	/**
	* Event handling routine
	*/
	public void actionPerformed(ActionEvent e) {
		if (textfield.isEditable() && e.getSource() == scrollPanel) {
			if (e.getID() == ScrollButtonPanel.DECREMENT)
				sub1();
			else if (e.getID() == ScrollButtonPanel.INCREMENT)
				add1();
		} else if (e.getSource() == textfield) {
      readValue();
    }
	}

	/**
	* Event handling routine
	*/
	public void focusGained(FocusEvent evt) {
	}

	/**
	* Event handling routine
	*/
	public void focusLost(FocusEvent evt) {
    readValue();
	}

  private void readValue() {
		String entry = textfield.getText();
    try {
    	if (entry.equals("") || entry == null) {
        setValue(defaultValue);
    	} else {
        Number newValue;
        if (type == Integer.class)
				  newValue = Integer.valueOf(entry);
        else if (type == Double.class)
				  newValue = Double.valueOf(entry);
        else if (type == Long.class)
				  newValue = Long.valueOf(entry);
        else if (type == Float.class)
				  newValue = Float.valueOf(entry);
        else if (type == Byte.class)
				  newValue = Byte.valueOf(entry);
        else if (type == Short.class)
				  newValue = Short.valueOf(entry);
        else
          throw new Exception("Invalid number class: " + type);
        setValue(newValue);
      }
    } catch (Exception err) {
				displayValue();
		}
  }

	/**
	* Event handling routine
	*/
	public void keyPressed(KeyEvent e) {
		if (textfield.isEditable()) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				add1();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				sub1();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_PAGE_UP) {
				add10();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_PAGE_DOWN) {
				sub10();
				e.consume();
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				displayValue();
				e.consume();
			} else if (Character.isLetter(e.getKeyChar())) {
				e.consume();
			}
		}
	}

	/**
	* Event handling routine
	*/
	public void keyReleased(KeyEvent e) {
	}

	/**
	* Event handling routine
	*/
	public void keyTyped(KeyEvent e) {
	}

	/**
	* Sets whether this DateField should be editable or not.
	*/
	public void setEditable(boolean b) {
		textfield.setEditable(b);
    scrollPanel.setEnabled(b);
	}

  public boolean isEditable() {
    return textfield.isEditable();
  }

	void sub1() {
    try {
      setValue(add(getValue(), new Integer(-1)));
    } catch (Exception err) {
    }
	}

	void add1() {
    try {
      setValue(add(getValue(), new Integer(1)));
    } catch (Exception err) {
    }
	}

  void sub10() {
    try {
      setValue(add(getValue(), new Integer(-10)));
    } catch (Exception err) {
    }
	}

	void add10() {
    try {
      setValue(add(getValue(), new Integer(10)));
    } catch (Exception err) {
    }
	}


	void displayValue() {
    textfield.setText("" + value);
	}

	void init() {
		textfield = new JTextField(10);
    scrollPanel = new ScrollButtonPanel(textfield);
		displayValue();

    scrollPanel.addActionListener(this);
		scrollPanel.getDecButton().addKeyListener(this);
		scrollPanel.getIncButton().addKeyListener(this);
    textfield.addKeyListener(this);
		textfield.addFocusListener(this);
    textfield.addActionListener(this);
	}

	void updateLayout() {
		removeAll();
    setLayout(new BorderLayout());
		add("Center", textfield);

		if (scroller) {
      add("East", scrollPanel);
		}
	}

  private static Number convertNumberType(Number n, Class type) {
    if (type.isInstance(n)) {
      return n;
    } else {
      if (type == Integer.class) {
        return new Integer(n.intValue());
      } else if (type == Long.class) {
        return new Long(n.longValue());
      } else if (type == Float.class) {
        return new Float(n.floatValue());
      } else if (type == Short.class) {
        return new Short((short) (n.shortValue()));
      } else if (type == Double.class) {
        return new Double(n.doubleValue());
      } else if (type == Byte.class) {
        return new Byte((byte) (n.byteValue()));
      } else {
        throw new IllegalArgumentException("Invalid number class: " + type);
      }
    }
  }

  private static Number add(Number a, Number b) {
    Class type = a.getClass();
    if (type == Integer.class) {
      return new Integer(a.intValue() + b.intValue());
    } else if (type == Long.class) {
      return new Long(a.longValue() + b.longValue());
    } else if (type == Float.class) {
      return new Float(a.floatValue() + b.floatValue());
    } else if (type == Short.class) {
      return new Short((short) (a.shortValue() + b.shortValue()));
    } else if (type == Double.class) {
      return new Double(a.doubleValue() + b.doubleValue());
    } else if (type == Byte.class) {
      return new Byte((byte) (a.byteValue() + b.byteValue()));
    } else {
      throw new IllegalArgumentException("Invalid number class: " + type);
    }
  }


	/*public static void main(String args[]) {
    try {
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.metal.MetalLookAndFeel");
    } catch (Exception err) {
      err.printStackTrace();
    }
		JFrame f = new JFrame("Test");
    f.getContentPane().setLayout(new VerticalLayout());
		f.getContentPane().setBackground(SystemColor.control);
		DateField field = new DateField(new java.util.Date(), true);
    NumberField intField = new NumberField(8, true);
    Font font = new Font("SansSerif", Font.PLAIN, 24);
    f.getContentPane().setFont(font);
    //intField.setFont(font);
		f.getContentPane().add(intField);
    f.getContentPane().add(field);
		f.pack();
		f.show();
		intField.setEditable(true);

	}*/

}

