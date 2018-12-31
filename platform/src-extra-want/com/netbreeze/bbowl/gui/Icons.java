package com.netbreeze.bbowl.gui;

import javax.swing.*;
import com.netbreeze.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

import org.apache.log4j.*;

public class Icons {
  static Category cat = Category.getInstance(Icon.class);

  static Icon saveBowl = new DummyIcon();
  static Icon saveBowlAs = new DummyIcon();
  static Icon newBowl = new DummyIcon();
  static Icon openBowl = new DummyIcon();
  static Icon recentFile = new DummyIcon();
  static Icon about = new DummyIcon();

  static Icon addToBowl = new DummyIcon();
  static Icon removeFromBowl = new DummyIcon();
  static Icon viewBean = new DummyIcon();
  static Icon properties = new DummyIcon();

  static Icon mainFrame = new DummyIcon();

  private Icons() {
  }

  static {
    saveBowl = loadIcon("saveBowl.gif");
    saveBowlAs = loadIcon("saveBowlAs.gif");
    newBowl = loadIcon("newBowl.gif");
    openBowl = loadIcon("openBowl.gif");
    recentFile = loadIcon("recentFile.gif");
    about = loadIcon("about.gif");
    addToBowl = loadIcon("addToBowl.gif");
    removeFromBowl = loadIcon("removeFromBowl.gif");
    viewBean = loadIcon("viewBean.gif");
    properties = loadIcon("properties.gif");
    mainFrame = loadIcon("mainFrame.gif");
  }

  static Image loadImage(String filename) {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Image i = null;
    try {
      i = tk.getImage(Icons.class.getResource("icons/" + filename));
    } catch (Exception err) {
      cat.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
    }
    return i;
  }

  static Icon loadIcon(String filename) {
    try {
      return new ImageIcon(Icons.class.getResource("icons/" + filename));
    } catch (Exception err) {
      cat.warn("Warning - icon '" + filename + "' could not be loaded: " + err, err);
      return new DummyIcon();
    }
  }

  static class DummyIcon implements Icon, java.io.Serializable {
    public int getIconWidth() {
      return 16;
    }

    public int getIconHeight() {
      return 16;
    }

    public void paintIcon(Component c,
                                Graphics g,
                                int x,
                                int y) {
      g.setColor(Color.blue);
      g.setFont(new Font("serif", Font.BOLD, 12));
      g.drawString("?", x, y + 12);
    }
  }

}