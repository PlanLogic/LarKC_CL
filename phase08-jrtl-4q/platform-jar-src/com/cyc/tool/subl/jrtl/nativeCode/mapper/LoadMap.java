//
//
package com.cyc.tool.subl.jrtl.nativeCode.mapper;

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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LoadMap {
	public static class LoadMapEntry {
		public String pkgName;

		public String symbolName;
		public Long position;

		private LoadMapEntry(String pkgName, String symbolName, Long position) {
			this.pkgName = pkgName;
			this.symbolName = symbolName;
			this.position = position;
		}
	}

	private interface Pickler {
		void populate(ObjectInputStream p0, LoadMap p1) throws IOException, ClassNotFoundException;

		void serialize(ObjectOutputStream p0, LoadMap p1) throws IOException;
	}

	private static class VersionTuple {
		int majorVersion;

		int minorVersion;

		private VersionTuple(int major, int minor) {
			this.minorVersion = minor;
			this.majorVersion = major;
		}

		public boolean equals(Object other) {
			if (other != null && other instanceof VersionTuple) {
				VersionTuple otherTuple = (VersionTuple) other;
				return otherTuple.majorVersion == this.majorVersion && otherTuple.minorVersion == this.minorVersion;
			}
			return false;
		}

		public int hashCode() {
			return 37 * this.majorVersion + this.minorVersion;
		}

		public String toString() {
			return "[Version " + this.majorVersion + "." + this.minorVersion + "]";
		}
	}

	private static String MAGIC_BYTES = "LoadMap";

	private static String COPYRIGHT_NOTICE = "(C)opyright by Cycorp Inc -- Use is Subject to License Terms";

	public static int MAJOR_VERSION = 1;

	public static int MINOR_VERSION = 0;

	private static VersionTuple CURRENT_VERSION;

	private static Map<VersionTuple, Pickler> picklers;

	static {
		LoadMap.CURRENT_VERSION = new VersionTuple(1, 0);
		LoadMap.picklers = new HashMap<VersionTuple, Pickler>();
	}

	public static LoadMap load(InputStream in) throws IOException {
		ObjectInputStream ois = new ObjectInputStream(in);
		try {
			LoadMap loadMap = new LoadMap();
			VersionTuple version = LoadMap.readHeader(ois);
			LoadMap.unpickle(ois, loadMap, version);
			return loadMap;
		} finally {
		}
	}

	public static void main(String[] args) {
		String mapFile = "/tmp/kbless-state.cfasl.map";
		try {
			InputStream in = new BufferedInputStream(new FileInputStream("/tmp/kbless-state.cfasl.map"));
			LoadMap loadMap = LoadMap.load(in);
			for (LoadMapEntry entry : (Iterable<LoadMapEntry>) loadMap)
				System.out.println(";;; writing " + entry.pkgName + "::" + entry.symbolName + " at " + entry.position);
			in.close();
		} catch (Exception xcpt) {
			xcpt.printStackTrace();
			System.exit(-1);
		}
	}

	public static LoadMap newLoadMap() {
		return new LoadMap();
	}

	private static void pickle(ObjectOutputStream oos, LoadMap loadMap, VersionTuple tuple) throws IOException {
		Pickler pickler = LoadMap.picklers.get(tuple);
		if (pickler == null)
			throw new IOException("Version " + tuple + " not supported");
		pickler.serialize(oos, loadMap);
	}

	private static VersionTuple readHeader(ObjectInputStream ois) throws IOException {
		String magicBytes = ois.readUTF();
		if (!"LoadMap".equals(magicBytes))
			throw new IOException("Invalid format: expected magic bytes, got " + magicBytes);
		int major = ois.readInt();
		int minor = ois.readInt();
		String copyRightNotice = ois.readUTF();
		if ("(C)opyright by Cycorp Inc -- Use is Subject to License Terms".equals(copyRightNotice))
			return new VersionTuple(major, minor);
		throw new IOException("Invalid format: expected copyright notice, got " + copyRightNotice);
	}

	private static void unpickle(ObjectInputStream ois, LoadMap loadMap, VersionTuple tuple) throws IOException {
		Pickler pickler = LoadMap.picklers.get(tuple);
		if (pickler == null)
			throw new IOException("Version " + tuple + " not supported");
		try {
			pickler.populate(ois, loadMap);
		} catch (ClassNotFoundException xcpt) {
			throw new IOException("Could not populate map due to missing class.", xcpt);
		}
	}

	private static void writeCurrentHeader(ObjectOutputStream oos) throws IOException {
		LoadMap.writeHeader(oos, LoadMap.CURRENT_VERSION);
	}

	private static void writeHeader(ObjectOutputStream oos, VersionTuple version) throws IOException {
		oos.writeUTF("LoadMap");
		LoadMap.writeVersion(oos, version);
		oos.writeUTF("(C)opyright by Cycorp Inc -- Use is Subject to License Terms");
	}

	private static void writeVersion(ObjectOutputStream oos, VersionTuple version) throws IOException {
		oos.writeInt(version.majorVersion);
		oos.writeInt(version.minorVersion);
	}

	private Map<String, Map<String, Long>> entries;

	private LoadMap() {
		LoadMap.picklers.put(new VersionTuple(1, 0), new Pickler() {
			private String PACKAGE_NAME_SENTINEL = "";
			private String SYMBOL_NAME_SENTINEL = "";
			private Long FILE_POSITION_SENTINEL = -1L;

			private boolean isSentinel(String pkgName, String symbolName, Long position) {
				return this.FILE_POSITION_SENTINEL.equals(position) && "".equals(symbolName) && "".equals(pkgName);
			}

			public void populate(ObjectInputStream ois, LoadMap loadMap) throws IOException, ClassNotFoundException {
				boolean done = false;
				while (!done) {
					String pkgName = ois.readUTF();
					String symbolName = ois.readUTF();
					Long position = ois.readLong();
					done = this.isSentinel(pkgName, symbolName, position);
					if (!done)
						loadMap.noteSymbolEntry(pkgName, symbolName, position);
				}
			}

			public void serialize(ObjectOutputStream oos, LoadMap loadMap) throws IOException {
				for (String pkgName : LoadMap.this.entries.keySet()) {
					Map<String, Long> symbolEntries = LoadMap.this.entries.get(pkgName);
					for (String symbolName : symbolEntries.keySet()) {
						Long position = symbolEntries.get(symbolName);
						this.serializeSymbol(oos, pkgName, symbolName, position);
					}
				}
				this.serializeSentinel(oos);
			}

			private void serializeSentinel(ObjectOutputStream oos) throws IOException {
				this.serializeSymbol(oos, "", "", this.FILE_POSITION_SENTINEL);
			}

			private void serializeSymbol(ObjectOutputStream oos, String pkgName, String symbolName, Long position)
					throws IOException {
				oos.writeUTF(pkgName);
				oos.writeUTF(symbolName);
				oos.writeLong(position);
			}
		});
		this.entries = this.newPackageEntries();
	}

	public Snapshot.SnapShootingListener getListener() {
		return new Snapshot.SnapShootingListener() {

			public void noteSymbol(String pkgName, String symbolName, SubLObject filePosition) {
				try {
					Long position = filePosition.longValue();
					LoadMap.this.noteSymbolEntry(pkgName, symbolName, position);
				} catch (Exception xcpt) {
					this.skippedSymbol(pkgName, symbolName, SubLNil.NIL, xcpt);
				}
			}

			public void skippedSymbol(String pkgName, String symbolName, SubLSymbol type, Exception xcpt) {
			}

			public void skippedSymbol(String pkgName, String symbolName, SubLSymbol type, StackOverflowError err) {
			}

			public void skippedSymbol(String pkgName, String symbolName, SubLSymbol type, String errmsg) {
			}
		};
	}

	public Iterator<LoadMapEntry> iterator() {
		List<LoadMapEntry> mapEntries = new ArrayList<LoadMapEntry>();
		for (String pkgName : this.entries.keySet()) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			for (String symbolName : symbolEntries.keySet()) {
				Long position = symbolEntries.get(symbolName);
				mapEntries.add(new LoadMapEntry(pkgName, symbolName, position));
			}
		}
		return mapEntries.iterator();
	}

	public Long lookup(String pkgName, String symbolName) {
		return this.lookupSymbolEntry(pkgName, symbolName);
	}

	public SubLObject lookup(SubLSymbol symbol) {
		String pkgName = symbol.getPackage().getName();
		String symName = symbol.getName();
		Long position = this.lookup(pkgName, symName);
		if (position == null)
			return CommonSymbols.NIL;
		return SubLObjectFactory.makeInteger(position);
	}

	protected Long lookupSymbolEntry(String pkgName, String symbolName) {
		synchronized (this.entries) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			if (symbolEntries != null)
				return symbolEntries.get(symbolName);
		}
		return null;
	}

	protected Map<String, Map<String, Long>> newPackageEntries() {
		return new HashMap<String, Map<String, Long>>();
	}

	protected Map<String, Long> newSymbolEntries() {
		return new HashMap<String, Long>();
	}

	protected void noteSymbolEntry(String pkgName, String symbolName, Long filePosition) {
		synchronized (this.entries) {
			Map<String, Long> symbolEntries = this.entries.get(pkgName);
			if (symbolEntries == null) {
				symbolEntries = this.newSymbolEntries();
				this.entries.put(pkgName, symbolEntries);
			}
			symbolEntries.put(symbolName, filePosition);
		}
	}

	public void save(OutputStream out) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(out);
		try {
			LoadMap.writeCurrentHeader(oos);
			LoadMap.pickle(oos, this, LoadMap.CURRENT_VERSION);
			oos.flush();
		} finally {
		}
	}
}
