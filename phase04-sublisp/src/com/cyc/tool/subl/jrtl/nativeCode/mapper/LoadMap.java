/* $Id: LoadMap.java 126867 2009-01-20 19:22:58Z aldag $
 *
 * Copyright (c) 2009 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.tool.subl.jrtl.nativeCode.mapper;

import com.cyc.tool.subl.jrtl.nativeCode.mapper.Snapshot.SnapShootingListener;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public  class LoadMap {

  private LoadMap() {
    this.entries = newPackageEntries();
  }

  static public LoadMap newLoadMap() {
    return new LoadMap();
  }

  static public LoadMap load(InputStream in) throws IOException {
    ObjectInputStream ois = new ObjectInputStream(in);
    try {
      LoadMap loadMap = new LoadMap();
      VersionTuple version = readHeader(ois);
      unpickle(ois, loadMap, version);
      return loadMap;
    } finally {
      // @note dont close the stream, will close the underlying stream
      // ois.close();
    }
  }

  /**
   * Obtain a connector that gives modification access to this load map
   * via the snap shooting listener interface.
   * @see Snapshot
   * @return A snop shooting listener connected to this load map.
   */
  public SnapShootingListener getListener() {
    return new SnapShootingListener() {

      
      public void noteSymbol(String pkgName, String symbolName, SubLObject filePosition) {
        try {
          Long position = Long.valueOf(filePosition.longValue());
          noteSymbolEntry(pkgName, symbolName, position);
        } catch (Exception xcpt) {
          skippedSymbol(pkgName, symbolName, xcpt);
        }
      }

      
      public void skippedSymbol(String pkgName, String symbolName, Exception xcpt) {
      }
    };
  }

  /**
   * Serialization method for the load map.
   * @param out
   * @throws java.io.IOException
   */
  public void save(OutputStream out) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(out);
    try {
      writeCurrentHeader(oos);
      pickle(oos, this, CURRENT_VERSION);
      oos.flush();
    } finally {
      // @note dont close the stream, will close the underlying stream
      // out.close
    }
  }
  /**
   * markers for the load map file representation
   */
  static private String MAGIC_BYTES = "LoadMap";
  static private String COPYRIGHT_NOTICE = "(C)opyright by Cycorp Inc -- Use is Subject to License Terms";

  /**
   * Trampoline for writing the current header
   * @param oos the object stream to write to
   * @throws java.io.IOException
   */
  static private void writeCurrentHeader(ObjectOutputStream oos) throws IOException {
    writeHeader(oos, CURRENT_VERSION);
  }

  /**
   * Helper method for writing a load map header
   * @param oos the object stream
   * @param version the version of the output format
   * @throws java.io.IOException
   */
  static private void writeHeader(ObjectOutputStream oos, VersionTuple version) throws IOException {
    oos.writeUTF(MAGIC_BYTES);
    writeVersion(oos, version);
    oos.writeUTF(COPYRIGHT_NOTICE);
  }

  /**
   * Helper method for writing a version tuple
   * @param oos the object output stream
   * @param version the version tuple to write
   * @throws java.io.IOException
   */
  static private void writeVersion(ObjectOutputStream oos, VersionTuple version) throws IOException {
    oos.writeInt(version.majorVersion);
    oos.writeInt(version.minorVersion);
  }
  /**
   * the current version, as integers and as a version tuple
   */
  static public int MAJOR_VERSION = 1;
  static public int MINOR_VERSION = 0;
  private static VersionTuple CURRENT_VERSION = new VersionTuple(MAJOR_VERSION, MINOR_VERSION);

  /**
   * A helper class that represents a version tuple
   */
  private static class VersionTuple {

    private VersionTuple(int major, int minor) {
      minorVersion = minor;
      majorVersion = major;
    }

    public int hashCode() {
      return 37 * majorVersion + minorVersion;
    }

    public boolean equals(Object other) {
      if (other != null) {
        if (other instanceof VersionTuple) {
          VersionTuple otherTuple = (VersionTuple) other;
          return otherTuple.majorVersion == majorVersion && otherTuple.minorVersion == minorVersion;
        }
      }
      return false;
    }

    public String toString() {
      return "[Version " + majorVersion + "." + minorVersion + "]";
    }
    int majorVersion;
    int minorVersion;
  }

  private interface Pickler {

    void serialize(ObjectOutputStream oos, LoadMap loadMap) throws IOException;

    void populate(ObjectInputStream ois, LoadMap loadMap) throws IOException, ClassNotFoundException;
  }

  static private void pickle(ObjectOutputStream oos, LoadMap loadMap, VersionTuple tuple) throws IOException {
    Pickler pickler = picklers.get(tuple);
    if (pickler == null) {
      throw new IOException("Version " + tuple + " not supported");
    }
    pickler.serialize(oos, loadMap);
  }

  static private void unpickle(ObjectInputStream ois, LoadMap loadMap, VersionTuple tuple) throws IOException {
    Pickler pickler = picklers.get(tuple);
    if (pickler == null) {
      throw new IOException("Version " + tuple + " not supported");
    }
    try {
      pickler.populate(ois, loadMap);
    } catch (ClassNotFoundException xcpt) {
      throw new IOException("Could not populate map due to missing class.", xcpt);
    }
  }
  private static Map<VersionTuple, Pickler> picklers = new HashMap<VersionTuple, Pickler>();

  {
    picklers.put(new VersionTuple(1, 0), new Pickler() {

      private String PACKAGE_NAME_SENTINEL = "";
      private String SYMBOL_NAME_SENTINEL = "";
      private Long FILE_POSITION_SENTINEL = Long.valueOf(-1L);

      /**
       * This serializer uses a symbolic rather than an implementation approach
       * @todo rewrite once a better incremental iterator or visitor is available
       */
      
      public void serialize(ObjectOutputStream oos, LoadMap loadMap) throws IOException {
        for (String pkgName : entries.keySet()) {
          Map<String, Long> symbolEntries = entries.get(pkgName);
          for (String symbolName : symbolEntries.keySet()) {
            Long position = symbolEntries.get(symbolName);
            serializeSymbol(oos, pkgName, symbolName, position);
          }
        }
        // use a sentinel approach
        serializeSentinel(oos);
      }

      private void serializeSentinel(ObjectOutputStream oos) throws IOException {
        serializeSymbol(oos, PACKAGE_NAME_SENTINEL, SYMBOL_NAME_SENTINEL, FILE_POSITION_SENTINEL);
      }

      private void serializeSymbol(ObjectOutputStream oos, String pkgName, String symbolName, Long position) throws IOException {
        oos.writeUTF(pkgName);
        oos.writeUTF(symbolName);
        oos.writeLong(position.longValue());
      }

      private boolean isSentinel(String pkgName, String symbolName, Long position) {
        return FILE_POSITION_SENTINEL.equals(position) && SYMBOL_NAME_SENTINEL.equals(symbolName) && PACKAGE_NAME_SENTINEL.equals(pkgName);
      }

      
      public void populate(ObjectInputStream ois, LoadMap loadMap) throws IOException, ClassNotFoundException {
        boolean done = false;
        while (!done) {
          String pkgName = ois.readUTF();
          String symbolName = ois.readUTF();
          Long position = Long.valueOf(ois.readLong());
          done = isSentinel(pkgName, symbolName, position);
          if (!done) {
            loadMap.noteSymbolEntry(pkgName, symbolName, position);
          }
        }
      }
    });
  }

  /**
   * A helper method that reads the header of an object input stream
   * representation of the load map.
   * @param ois
   * @return VersionTuple a tuple of version information to help choose
   * the correct loader
   * @throws java.io.IOException
   */
  static private VersionTuple readHeader(ObjectInputStream ois) throws IOException {
    String magicBytes = ois.readUTF();
    if (MAGIC_BYTES.equals(magicBytes)) {
      int major = ois.readInt();
      int minor = ois.readInt();
      String copyRightNotice = ois.readUTF();
      if (COPYRIGHT_NOTICE.equals(copyRightNotice)) {
        return new VersionTuple(major, minor);
      } else {
        throw new IOException("Invalid format: expected copyright notice, got " + copyRightNotice);
      }
    } else {
      throw new IOException("Invalid format: expected magic bytes, got " + magicBytes);
    }
  }

  /**
   * Helper wrapper around lookup(String pkgName, String symbolName) that
   * is more SubL-like in its data types expected.
   * @param symbol
   * @return either an NON-NEGATIVE-INTEGER-P for the file position or NIL
   * if the entry was not found
   */
  public SubLObject lookup(SubLSymbol symbol) {
    String pkgName = symbol.getPackage().getName();
    String symName = symbol.getName();
    Long position = lookup(pkgName, symName);
    if (position == null) {
      return CommonSymbols.NIL;
    } else {
      return SubLObjectFactory.makeInteger(position.longValue());
    }
  }

  /**
   * Resolve a symbol to its load map file position.
   * @param pkgName the name of the package under which the object was indexed
   * @param symbolName the name of symbol under which the object was indexed
   * @return the file position object
   */
  public Long lookup(String pkgName, String symbolName) {
    return lookupSymbolEntry(pkgName, symbolName);
  }

  /**
   * factory method for allocating the package level of the load map
   * @return the map for mapping package name to its load map entries
   */
  protected Map<String, Map<String, Long>> newPackageEntries() {
    return new HashMap<String, Map<String, Long>>();
  }

  /**
   * factory method for allocating the symbol level entries of the
   * load map
   * @return the symbol level mapping for entries
   */
  protected Map<String, Long> newSymbolEntries() {
    return new HashMap<String, Long>();
  }

  /**
   * Add an entry to the load map
   * @param pkgName the name of the package under which to index it
   * @param symbolName the name of the symbol under which to index it
   * @param filePosition the file position under which to index it
   */
  protected void noteSymbolEntry(String pkgName, String symbolName, Long filePosition) {
    synchronized (entries) {
      Map<String, Long> symbolEntries = entries.get(pkgName);
      if (symbolEntries == null) {
        symbolEntries = newSymbolEntries();
        entries.put(pkgName, symbolEntries);
      }
      symbolEntries.put(symbolName, filePosition);
    }
  }

  /**
   * Resolve an entry against a populated load map.
   * @param pkgName the name of the package
   * @param symbolName the name of the symbol
   * @return either the file position as a Long or <tt>null</tt> if no such
   * entry was found
   */
  protected Long lookupSymbolEntry(String pkgName, String symbolName) {
    synchronized (entries) {
      Map<String, Long> symbolEntries = entries.get(pkgName);
      if (symbolEntries != null) {
        return symbolEntries.get(symbolName);
      }
    }
    return null;
  }

  public Iterator<LoadMapEntry> iterator() {
    List<LoadMapEntry> mapEntries = new ArrayList<LoadMapEntry>();
    for (String pkgName : entries.keySet()) {
      Map<String, Long> symbolEntries = entries.get(pkgName);
      for (String symbolName : symbolEntries.keySet()) {
        Long position = symbolEntries.get(symbolName);
        mapEntries.add( new LoadMapEntry(pkgName, symbolName, position));
      }
    }
    return mapEntries.iterator();
  }

  static public class LoadMapEntry {

    private LoadMapEntry(String pkgName, String symbolName, Long position) {
      this.pkgName = pkgName;
      this.symbolName = symbolName;
      this.position = position;
    }
    public String pkgName;
    public String symbolName;
    public Long position;
  }
  /**
   * the entries in the load map, mapping package names to
   * maps of symbo names to file positions
   */
  private Map<String, Map<String, Long>> entries;

  static public void main(String[] args) {

    String mapFile = "/tmp/kbless-state.cfasl.map";

    try {
      InputStream in = new BufferedInputStream(new FileInputStream(mapFile));
      LoadMap loadMap = LoadMap.load(in);
      Iterator<LoadMapEntry> entryIterator = loadMap.iterator();
      while (entryIterator.hasNext()) {
        LoadMapEntry entry = entryIterator.next();
        System.out.println(";;; writing " + entry.pkgName + "::" + entry.symbolName + " at " + entry.position);
      }      
      in.close();
    } catch (Exception xcpt) {
      xcpt.printStackTrace();
      System.exit(-1);
    }

  }
}
