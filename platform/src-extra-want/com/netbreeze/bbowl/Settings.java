

package com.netbreeze.bbowl;
import java.io.*;
import java.util.*;

/**
 * Contains settings for the bean bowl application
 *
 * @author Henrik Kniberg
 */
public class Settings implements java.io.Serializable {
  private final static String FILENAME = "beanbowlSettings.ser";
  private final static int RECENT_FILE_COUNT = 5;
  transient static Settings settings;

  public List recentFiles;

  private Settings() {
    recentFiles = new LinkedList();
  }

  public static void addRecentFile(File file) {
    if (file != null && !settings.recentFiles.contains(file)) {
      settings.recentFiles.add(0, file);
    }
    while(settings.recentFiles.size() > 5) {
      settings.recentFiles.remove(4);
    }
  }

  public static Iterator getRecentFiles() {
    return settings.recentFiles.iterator();
  }

  static {
    if (getFile().exists()) {
      try {
        loadFromFile();
      } catch (Exception err) {
        System.err.println("Warning - settings could not be loaded: " + err.getMessage());
        settings = new Settings();
      }
    } else {
      settings = new Settings();
    }
  }

  protected void finalize() {
    try {
      saveToFile();
    } catch (Exception err) {
      System.err.println("Warning - settings could not be saved: " + err.getMessage());
    }
  }

  public static void loadFromFile() throws Exception {
    InputStream fileIn = new FileInputStream(getFile());
	  ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	  settings = (Settings) (objectIn.readObject());
    objectIn.close();
    fileIn.close();
  }

  public static void saveToFile() throws Exception {
    FileOutputStream fileOut = new FileOutputStream(getFile());
    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
    objectOut.writeObject(settings);
    objectOut.close();
    fileOut.close();
  }

  private static File getFile() {
    File homeDir = new File(System.getProperties().getProperty("user.home"));
    return new File(homeDir, FILENAME);
  }

}
