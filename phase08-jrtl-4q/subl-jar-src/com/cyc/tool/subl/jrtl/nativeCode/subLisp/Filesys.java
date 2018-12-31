//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.FileSystem;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Filesys extends SubLTrampolineFile {
	public static SubLObject canonical_null_file_stream_path() {
		return Filesys.$canonical_null_file_stream_path$.getValue();
	}

	public static SubLObject construct_filename(SubLObject directory_list, SubLObject filename, SubLObject extension,
			SubLObject relativeP) {
		SubLList directoryListTyped = directory_list.toList();
		String filenameTyped = filename == CommonSymbols.NIL ? "" : filename.getString();
		if (extension == CommonSymbols.UNPROVIDED)
			extension = CommonSymbols.NIL;
		String extensionTyped = extension == CommonSymbols.NIL ? null : extension.getString();
		if (relativeP == CommonSymbols.UNPROVIDED)
			relativeP = CommonSymbols.NIL;
		boolean isRelative = relativeP != CommonSymbols.NIL;
		String result = FileSystem.constructFileName(directoryListTyped, filenameTyped, extensionTyped, isRelative);
		return SubLObjectFactory.makeString(result);
	}

	public static SubLObject copy_file(SubLObject oldFileName, SubLObject newFileName) {
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			inChannel = new FileInputStream(oldFileName.toStr().getString()).getChannel();
			outChannel = new FileOutputStream(newFileName.toStr().getString()).getChannel();
			int maxCount = 536838144;
			for (long size = inChannel.size(), position = 0L; position < size; position += inChannel
					.transferTo(position, 536838144L, outChannel)) {
			}
		} catch (IOException e) {
			throw SubLObjectFactory.makeException("Unable to copy file:\n" + oldFileName + "\nto:\n" + newFileName, e);
		} finally {
			if (inChannel != null)
				try {
					inChannel.close();
				} catch (Exception ex) {
				}
			if (outChannel != null)
				try {
					outChannel.close();
				} catch (Exception ex2) {
				}
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject delete_directory(SubLObject directory_name, SubLObject recursiveP) {
		directory_name = pathname_designator_pathname(directory_name);
		String directoryNameTyped = directory_name.getString();
		if (recursiveP == CommonSymbols.UNPROVIDED)
			recursiveP = CommonSymbols.NIL;
		boolean deleteRecursively = recursiveP != CommonSymbols.NIL;
		boolean result = FileSystem.deleteDirectory(directoryNameTyped, deleteRecursively);
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject delete_file(SubLObject filename) {
		filename = pathname_designator_pathname(filename);
		String filenameTyped = filename.getString();
		boolean result = FileSystem.deleteFile(filenameTyped);
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject directory(SubLObject directory_name, SubLObject include_directory) {
		directory_name = pathname_designator_pathname(directory_name);
		String directoryNameTyped = directory_name.getString();
		if (include_directory == CommonSymbols.UNPROVIDED)
			include_directory = CommonSymbols.NIL;
		boolean includeDirectory = include_directory != CommonSymbols.NIL;
		ArrayList directoryContents = FileSystem.getDirectoryContents(directoryNameTyped, includeDirectory);
		return SubLObjectFactory.makeList(directoryContents);
	}

	public static SubLObject directory_p(SubLObject pathspec) {
		if (pathspec.isString()) {
			try {
				pathspec = pathname_designator_pathname(pathspec);
			} catch (RuntimeException re) {
				return CommonSymbols.NIL;
			}
			String pathspecTyped = pathspec.getString();
			boolean result = FileSystem.isDirectory(pathspecTyped);
			return SubLObjectFactory.makeBoolean(result);
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject file_author(SubLObject filename) {
		filename = pathname_designator_pathname(filename);
		String filenameTyped = filename.getString();
		return CommonSymbols.NIL;
	}

	public static SubLObject file_write_date(SubLObject filename) {
		filename = pathname_designator_pathname(filename);
		String filenameTyped = filename.getString();
		long modificationTime = FileSystem.fileModificationTime(filenameTyped);
		SubLObject result = Time.unixTimeToUniversalTime(modificationTime);
		return result;
	}

	public static SubLObject make_directory(SubLObject directory_name, SubLObject path, SubLObject mode) {
		directory_name = pathname_designator_pathname(directory_name);
		if (path == CommonSymbols.UNPROVIDED)
			path = CommonSymbols.NIL;
		if (mode == CommonSymbols.UNPROVIDED)
			mode = CommonSymbols.NIL;
		String directoryNameTyped = directory_name.getString();
		String pathTyped = path == CommonSymbols.NIL ? System.getProperty("user.dir") : path.getString();
		boolean result = FileSystem.makeDirectory(pathTyped, directoryNameTyped);
		return result ? directory_name : CommonSymbols.NIL;
	}

	public static SubLObject probe_file(SubLObject filename) {
		filename = pathname_designator_pathname(filename);
		String filenameTyped = filename.getString();
		String result = FileSystem.fileExists(filenameTyped);
		if (result == null)
			return CommonSymbols.NIL;
		return SubLObjectFactory.makeString(result);
	}

	public static SubLObject rename_file(SubLObject filename, SubLObject new_name) {
		filename = pathname_designator_pathname(filename);
		String filenameTyped = filename.getString();
		new_name = pathname_designator_pathname(new_name);
		String newNameTyped = new_name.getString();
		Object[] results = FileSystem.renameFile(filenameTyped, newNameTyped);
		if (Boolean.TRUE.equals(results[0]))
			return Values.values(new_name, SubLObjectFactory.makeString(results[1].toString()),
					SubLObjectFactory.makeString(results[2].toString()));
		return Errors.error("Could not rename " + results[1] + " to " + results[2]);
	}

	static SubLObject guessCanonicalNullFileStreamPath() {
		return SubLObjectFactory.makeString("/dev/null");
	}

	static SubLObject pathname_designator_pathname(SubLObject pathspec) {
		return SubLObjectFactory.makeString(pathspec.getFileDesignator());
	}

	public static SubLFile me;
	public static SubLSymbol $canonical_null_file_stream_path$;
	public static SubLSymbol $file_buffer_size$;
	static {
		me = new Filesys();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Filesys.me, "construct_filename", "CONSTRUCT-FILENAME", 2, 2, false);
		SubLFiles.declareFunction(Filesys.me, "delete_directory", "DELETE-DIRECTORY", 1, 1, false);
		SubLFiles.declareFunction(Filesys.me, "delete_file", "DELETE-FILE", 1, 0, false);
		SubLFiles.declareFunction(Filesys.me, "directory", "DIRECTORY", 1, 1, false);
		SubLFiles.declareFunction(Filesys.me, "directory_p", "DIRECTORY-P", 1, 0, false);
		SubLFiles.declareFunction(Filesys.me, "file_author", "FILE-AUTHOR", 1, 0, false);
		SubLFiles.declareFunction(Filesys.me, "file_write_date", "FILE-WRITE-DATE", 1, 0, false);
		SubLFiles.declareFunction(Filesys.me, "make_directory", "MAKE-DIRECTORY", 1, 2, false);
		SubLFiles.declareFunction(Filesys.me, "probe_file", "PROBE-FILE", 1, 0, false);
		SubLFiles.declareFunction(Filesys.me, "rename_file", "RENAME-FILE", 2, 0, false);
		SubLFiles.declareFunction(Filesys.me, "copy_file", "COPY-FILE", 2, 0, false);
		SubLFiles.declareFunction(Filesys.me, "canonical_null_file_stream_path", "CANONICAL-NULL-FILE-STREAM-PATH", 0,
				0, false);
	}

	@Override
	public void initializeVariables() {
		Filesys.$canonical_null_file_stream_path$ = SubLFiles.defconstant(Filesys.me,
				"*CANONICAL-NULL-FILE-STREAM-PATH*", guessCanonicalNullFileStreamPath());
		Filesys.$file_buffer_size$ = SubLFiles.defvar(Filesys.me, "*FILE-BUFFER-SIZE*",
				SubLObjectFactory.makeInteger(16384));
	}

	@Override
	public void runTopLevelForms() {
	}
}
