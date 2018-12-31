package com.netbreeze.swing;

import javax.swing.*;
import java.awt.*;
import java.beans.*;
import java.lang.reflect.*;
import java.awt.event.*;
import java.util.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;

import org.apache.log4j.*;
import org.logicmoo.bb.BeansContext;

public class SmallBeanView extends BeanView implements PropertyChangeListener, MouseListener, ActionListener, DragGestureListener, Transferable, DragSourceListener {
  private final static Color selectedColor = Color.blue;
  private final static Color normalColor = Color.black;
  private static Category cat = Category.getInstance(SmallBeanView.class);

  boolean showPropButton;
  boolean showIcon;
  boolean showLabel;
  BeansContext context;

  //Invisible panel in front that captures menu events and drag/drop events
  JPanel frontGlass;

  JLabel label;
  IconView iconView;
  JButton propButton;
  JButton removeButton;

  Collection parent;
  RemoveListener removeListener;

  DragSource dragSource;

  public SmallBeanView(Object bean, boolean showLabel, boolean showIcon, boolean showPropButton) {
    this(SwingEnvironment.getBeansContext(), bean, showLabel, showIcon, showPropButton);
  }

  /**
   * @param parent if a parent is provided, a "remove" button will be added allowing you to remove this bean from the given collection
   */
  public SmallBeanView(BeansContext context, Object bean, boolean showLabel, boolean showIcon, boolean showPropButton, Collection parent) {
    super(bean);
    this.context = context;
    this.showLabel = showLabel;
    this.showIcon = showIcon;
    this.showPropButton = showPropButton;
    this.parent = parent;
    initGUI();
    this.addMouseListener(this);
    //bean.addPropertyChangeListener(this);
    checkColor();

    dragSource = new DragSource();
    dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_MOVE, this);
  }

  public SmallBeanView(BeansContext context, Object bean, boolean showLabel, boolean showIcon, boolean showPropButton) {
    this(context, bean, showLabel, showIcon, showPropButton, null);
  }
  public SmallBeanView(Object bean) {
    this(bean, true, true, true);
  }

  public void setRemoveListener(RemoveListener l) {
    this.removeListener = l;
  }

  public void propertyChange(PropertyChangeEvent evt) {
    if (label != null) {
      if (context == null) {
        label.setText(getBean().toString());
      } else {
        label.setText(context.getBeanName(getBean()));
      }
    }
    checkColor();
  }

  private void checkColor() {
    //if (getBean().isSelected()) {
    //  label.setForeground(selectedColor);
    //} else {
    if (label != null) {
      label.setForeground(normalColor);
    }
    //}
  }

  public void mouseClicked(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    } else {
     /* try {
        bowl.setSelected(getBean());
      } catch (Exception err) {}*/
    }
  }
  public void mousePressed(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    } else {
    }
  }

  public void mouseReleased(MouseEvent e) {
    if (e.isPopupTrigger()) {
      showMenu(e.getX() + 5, e.getY() + 5);
    }
  }

  public void mouseEntered(MouseEvent e) {
    //label.setForeground(Color.blue);
  }
  public void mouseExited(MouseEvent e) {
    //label.setForeground(Color.black);
  }

  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == propButton) {
      if (context != null) {
        try {
          context.showBeanDetails(getBean());
        } catch (Throwable err) {
          context.showError("An error occurred while creating an interface for " + getBean(), err);
        }
      }
    } else if (evt.getSource() == removeButton) {
      parent.remove(getBean());
      if (removeListener != null) {
        removeListener.beanRemoved(getBean(), parent);
      }
    }
  }

//==== Drag/drop methods ==========================

  public void dragGestureRecognized( DragGestureEvent event) {
    cat.debug("source dragGestureRecognized");
    dragSource.startDrag (event, DragSource.DefaultMoveDrop, this, this);
  }

  public DataFlavor[] getTransferDataFlavors() {
    try {
      return new DataFlavor[] {
        new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType)
      };
    } catch (ClassNotFoundException err) {
      cat.error("An error occurred", err);
      return new DataFlavor[0];
    }
  }

  public boolean isDataFlavorSupported(DataFlavor flavor) {
    return flavor.getMimeType().equals(DataFlavor.javaJVMLocalObjectMimeType);
  }

  public Object getTransferData(DataFlavor flavor)
                       throws UnsupportedFlavorException {
    return getBean();
  }

  public void dragEnter(DragSourceDragEvent dsde) {
  }

  public void dragOver(DragSourceDragEvent dsde) {
  }

  public void dropActionChanged(DragSourceDragEvent dsde) {
  }

  public void dragExit(DragSourceEvent dse) {
  }

  public void dragDropEnd(DragSourceDropEvent dsde) {
  }

//=================================================================

  protected void beanChanged(Object oldBean, Object newBean) {
    removeAll();
    initGUI();
  }

  private void showMenu(int x, int y) {
    Object bean = getBean();
    if (!bean.getClass().isPrimitive()) {
      BeanPopupMenu menu = new BeanPopupMenu(context, getBean());
      frontGlass.add(menu);
      menu.show(frontGlass, x, y);
    }
  }


  private void initGUI() {
    setLayout(new OverlayLayout(this));

    JPanel panel = new JPanel();
    frontGlass = new JPanel();
    frontGlass.setOpaque(false);

    panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    Object bean = getBean();
    if (bean != null) {
      if (showIcon) {
        try {
          BeanInfo info = Introspector.getBeanInfo(bean.getClass());
          Image image = info.getIcon(BeanInfo.ICON_COLOR_16x16);
          if (image != null) {
            JLabel label = new JLabel(new ImageIcon(image));
            panel.add(label);
          }
        } catch (IntrospectionException err) {
        }
        //iconView = new IconView(bean.getIcon());
        //add(iconView);
      }
      if (showLabel) {
        if (context == null) {
          label = new JLabel(bean.toString());
        } else {
          label = new JLabel(context.getBeanName(bean));
        }
        panel.add(label);
      }
      if (showPropButton && !bean.getClass().isPrimitive()) {
        propButton = new PropertyButton();
        panel.add(propButton);
        propButton.addActionListener(this);
      }
      if (parent != null) {
        removeButton = new RemoveButton();
        panel.add(removeButton);
        removeButton.addActionListener(this);
      }
    } else {
      panel.add(new JLabel("null"));
    }
    add(frontGlass);
    add(panel);
  }


  class PropertyButton extends JButton {
    public PropertyButton() {
      super();
      try {
        setIcon(new ImageIcon(SmallBeanView.class.getResource("PropertyButton.gif")));
      } catch (Throwable err) {
        setText("...");
      }
      //setFont(new Font("Serif", Font.PLAIN, 8));
      setToolTipText("Open a property window for this object");
    }

    public Dimension getPreferredSize() {
      return new Dimension(16,16);
    }
    public Dimension getMinimumSize() {
      return getPreferredSize();
    }
  }

  class RemoveButton extends JButton {
    public RemoveButton() {
      super();
      try {
        setIcon(new ImageIcon(SmallBeanView.class.getResource("RemoveButton.gif")));
      } catch (Throwable err) {
        setText("x");
        setForeground(Color.red);
      }
      //setFont(new Font("Serif", Font.PLAIN, 8));
      setToolTipText("Removes this object from its parent collection");
    }

    public Dimension getPreferredSize() {
      return new Dimension(16,16);
    }
    public Dimension getMinimumSize() {
      return getPreferredSize();
    }
  }

  public interface RemoveListener {
    public void beanRemoved(Object bean, Collection parent);
  }
}
