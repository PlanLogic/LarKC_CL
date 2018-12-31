/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.FileSystem;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;
import java.io.File;

//// External Imports

public  class Filesys extends SubLTrampolineFile {
  //// Constructors
  /** Creates a new instance of Filesys. */
  public Filesys() {}
  public static SubLFile me = new Filesys();
  public static SubLSymbol $canonical_null_file_stream_path$;

  //// Public Area
  public static SubLObject construct_filename(SubLObject directory_list, SubLObject filename, SubLObject extension, SubLObject relativeP) {
    SubLList directoryListTyped = directory_list.toList();
    String filenameTyped = (filename == NIL) ? "" : filename.getString();
    if (extension == UNPROVIDED) { extension = NIL; }
    String extensionTyped = (extension == NIL) ? null : extension.getString();
    if (relativeP == UNPROVIDED) { relativeP = NIL; }
    boolean isRelative = (relativeP != NIL);
    String result = FileSystem.constructFileName(directoryListTyped, filenameTyped, extensionTyped, isRelative);
    return SubLObjectFactory.makeString(result);
  }
  public static SubLObject delete_directory(SubLObject directory_name, SubLObject recursiveP) {
    directory_name = pathname_designator_pathname(directory_name);
    String directoryNameTyped = directory_name.getString();
    if (recursiveP == UNPROVIDED) { recursiveP = NIL; }
    boolean deleteRecursively = (recursiveP != NIL);
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
    if (include_directory == UNPROVIDED) { include_directory = NIL; }
    boolean includeDirectory = (include_directory != NIL);
    ArrayList directoryContents = FileSystem.getDirectoryContents(directoryNameTyped, includeDirectory);
    return SubLObjectFactory.makeList(directoryContents);
  }
  public static SubLObject directory_p(SubLObject pathspec) {
    if (pathspec.isString()) {
      try {
        pathspec = pathname_designator_pathname(pathspec);
      } catch (RuntimeException re) {
        return NIL;
      }
      String pathspecTyped = pathspec.getString();
      boolean result = FileSystem.isDirectory(pathspecTyped);
      return SubLObjectFactory.makeBoolean(result);
    } else {
      return NIL;
    }
  }
  public static SubLObject file_author(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    String filenameTyped = filename.getString();
    // @stub the Java API provides no way to get at the file's author
    return NIL;
  }
  public static SubLObject file_write_date(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    String filenameTyped = filename.getString();
    long modificationTime = FileSystem.fileModificationTime(filenameTyped);
    SubLObject result = Time.unixTimeToUniversalTime(modificationTime);
    return result;
  }
  public static SubLObject make_directory(SubLObject directory_name, SubLObject path, SubLObject mode) {
    // @todo handle streams.  make extractPath in the SubLTrampolines file
    directory_name = pathname_designator_pathname(directory_name);
    if (path == UNPROVIDED) { path = NIL; }
    if (mode == UNPROVIDED) { mode = NIL; }
    String directoryNameTyped = directory_name.getString();
    String pathTyped = (path == NIL) ? System.getProperty("user.dir") : path.getString();
    // @mode is ignored, cannot be implemented in Java
    boolean result = FileSystem.makeDirectory( pathTyped, directoryNameTyped);
    return result ? directory_name : (SubLObject)NIL;
  }
  public static SubLObject probe_file(SubLObject filename) {
    filename = pathname_designator_pathname(filename);
    String filenameTyped = filename.getString();
    String result = FileSystem.fileExists(filenameTyped);
    if (result == null) {
      return NIL;
    } else {
      return SubLObjectFactory.makeString(result);
    }
  }
  public static SubLObject rename_file(SubLObject filename, SubLObject new_name) {
    filename = pathname_designator_pathname(filename);
    String filenameTyped = filename.getString();
    new_name = pathname_designator_pathname(new_name);
    String newNameTyped = new_name.getString();
    Object[] results = FileSystem.renameFile(filenameTyped, newNameTyped);
    if (Boolean.TRUE.equals(results[0])) {
      return Values.values( new_name,
              SubLObjectFactory.makeString(results[1].toString()),
              SubLObjectFactory.makeString(results[2].toString()));
    } else {
      return Errors.error("Could not rename " + results[1] + " to " + results[2]);
    }
  }

  public static SubLObject canonical_null_file_stream_path() {
    return $canonical_null_file_stream_path$.getValue();
  }
  /*
   * this should actually be in streams-high 
   */
  static SubLObject pathname_designator_pathname(SubLObject pathspec) {
    return SubLObjectFactory.makeString(pathspec.getFileDesignator());
  }
  //// Initializers
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "construct_filename", "CONSTRUCT-FILENAME", 2, 2, false);
    SubLFiles.declareFunction(me, "delete_directory", "DELETE-DIRECTORY", 1, 1, false);
    SubLFiles.declareFunction(me, "delete_file", "DELETE-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "directory", "DIRECTORY", 1, 1, false);
    SubLFiles.declareFunction(me, "directory_p", "DIRECTORY-P", 1, 0, false);
    SubLFiles.declareFunction(me, "file_author", "FILE-AUTHOR", 1, 0, false);
    SubLFiles.declareFunction(me, "file_write_date", "FILE-WRITE-DATE", 1, 0, false);
    SubLFiles.declareFunction(me, "make_directory", "MAKE-DIRECTORY", 1, 2, false);
    SubLFiles.declareFunction(me, "probe_file", "PROBE-FILE", 1, 0, false);
    SubLFiles.declareFunction(me, "rename_file", "RENAME-FILE", 2, 0, false);
    SubLFiles.declareFunction(me, "canonical_null_file_stream_path", "CANONICAL-NULL-FILE-STREAM-PATH", 0, 0, false);
  }
  public void initializeVariables() {
    $canonical_null_file_stream_path$ 
      = SubLFiles.defconstant(me, "*CANONICAL-NULL-FILE-STREAM-PATH*",
                              guessCanonicalNullFileStreamPath());
  }
  public void runTopLevelForms() {
  }
  //// Protected Area
  //// Private Area
  static SubLObject guessCanonicalNullFileStreamPath() {
    // @rck 20070626 per APB, we dont want to return any other value as the UN*X one
    return SubLObjectFactory.makeString("/dev/null");
    /*
      // original version
      if (File.separatorChar == '/') {
        // guess that this is a UNIX-like file system
        return SubLObjectFactory.makeString("/dev/null");
      } else {
        // guess that this is a Win* file system
        return SubLObjectFactory.makeString("NUL:");
      }
    */
  }
  //// Internal Rep
  //// Main
}
