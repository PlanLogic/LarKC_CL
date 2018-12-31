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

package  com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.io.File;

//// Internal Imports

//// External Imports

public  abstract class AbstractSubLStream extends AbstractSubLObject implements SubLStream {
	// common lisp additions
	final public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  public AbstractSubLStream(SubLSymbol elementType, SubLSymbol direction,
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    init(elementType, direction, ifExists, ifNotExists);
  }
  //// Public Area
  /** Method created to avoid instanceof tests */
  public String getFileDesignator() {
    if (!isRandomAccess()) {
      Errors.error("Invalid pathname designator: " + this + ".");
    }
    File file = getFile();
    if (file == null) {
      Errors.error("Invalid pathname designator: " + this + ".");
    }
    return file.getAbsolutePath();
  }
  public SubLList getStreams() {
    return NIL;
  }
  public SubLSymbol getStreamSymbol() {
    Errors.error(this + " is not of type: SYNONYM-STREAM.");
    return null;
  }
  public String toTypeName() {
    return STREAM_TYPE_NAME;
  }
  public String toString() {
    return "#<STREAM " + elementType + " " + direction + (isClosed() ? " CLOSED" : " OPEN") + " @ " + superHash() + ">";
  }
  public SubLSymbol getElementType() {
    return elementType;
  }
  public SubLSymbol getDirection() {
    return direction;
  }
  public SubLSymbol ifExists() {
    return ifExists;
  }
  public SubLSymbol ifNotExists() {
    return ifNotExists;
  }
  public boolean isInteractive() {
    return isInteractive;
  }
  public void setIsInteractive(boolean newValue) {
    this.isInteractive = newValue;
  }
  public String getNewline() {
    return newline;
  }
  public void setNewline(String newline) {
    this.newline = newline;
  }
  public void close() {
    isClosed = true;
  } 
  public boolean isClosed() {
    return isClosed;
  }

  public long getFlushCount() {
    Errors.unimplementedMethod("getFlushCount");
    return -1;
  }
  //// Protected Area
  //// Private Area
  private void init(SubLSymbol elementType, SubLSymbol direction,
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    this.elementType = elementType;
    if ((elementType != TEXT_KEYWORD) && (elementType != BINARY_KEYWORD)) {
      Errors.error("Invalid stream element type: " + elementType);
    }
    this.direction = direction;
    if ((direction != INPUT_KEYWORD) && (direction != OUTPUT_KEYWORD)
        && (direction != IO_KEYWORD) && (direction != PROBE_KEYWORD)) {
      Errors.error("Invalid stream direction: " + direction);
    }
    this.ifExists = ifExists;
    if ((ifExists != ERROR_KEYWORD) && (ifExists != NEW_VERSION_KEYWORD)
        && (ifExists != RENAME_AND_DELETE_KEYWORD) && (ifExists != OVERWRITE_KEYWORD)
        && (ifExists != APPEND_KEYWORD) && (ifExists != SUPERSEDE_KEYWORD) && (ifExists != NIL)) {
      Errors.error("Invalid stream if-exists parameter: " + ifExists);
    }
    this.ifNotExists = ifNotExists;
    if (((ifNotExists != ERROR_KEYWORD) && (ifNotExists != CREATE_KEYWORD)) && (ifNotExists != NIL)) {
      Errors.error("Invalid stream if-not-exists parameter: " + ifNotExists);
    }
    if (ifExists == RENAME_AND_DELETE_KEYWORD) {
      Errors.error("Streams implementation does not currently support :rename-and-delete.");
    }
    if (direction == PROBE_KEYWORD) {
      Errors.error("Streams implementation does not currently support :probe.");
    }
  }
  public boolean isStringOutputStream() {
    return false;
  }
  public String getStringOutput() {
    return Errors.error("Can't get the stream string output for non-string streams.").getString();
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return 0; // @hack
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public void ensureOpen() {
    if (isClosed()) {
      Errors.error("Can't perform operation on closed stream: " + this);
    }
  }
  public void ensureOpen(String operation) {
    if (isClosed()) {
      Errors.error("Can't perform " + operation + " on closed stream: " + this);
    }
  }
  public long getInputIndex() {
    return inputIndex;
  }
  protected void setInputIndex(long newIndex) {
    inputIndex = newIndex;
  }
  protected void incrementInputIndex(long incAmount) {
    inputIndex += incAmount;
  }
  public boolean canFastHash() {
    return true;
  }
  public SubLSymbol getType(){ 
    return Types.$dtp_stream$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_HUNDRED_FORTY_FOUR_INTEGER;
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return false; }
  public boolean isKeyword() { return false; }
  public boolean isAtom() { return true; }
  public boolean isCons() { return false; }
  public boolean isList() { return false; }
  public boolean isSequence() { return false; }
  public boolean isNumber() { return false; }
  public boolean isFixnum() { return false; }
  public boolean isBignum() { return false; }
  public boolean isIntBignum() { return false; }
  public boolean isLongBignum() { return false; }
  public boolean isBigIntegerBignum() { return false; }
  public boolean isInteger() { return false; }
  public boolean isDouble() { return false; }
  public boolean isChar() { return false; }
  public boolean isString() { return false; }
  public boolean isVector() { return false; }
  public boolean isFunction() { return false; }
  public boolean isFunctionSpec() { return false; }
  public boolean isMacroOperator() { return false; }
  public boolean isHashtable() { return false; }
  public boolean isProcess() { return false; }
  public boolean isLock() { return false; }
  public boolean isReadWriteLock() { return false; }
  public boolean isStructure() { return false; }
  public boolean isStream() { return true; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  //// Internal Rep
  protected SubLSymbol elementType;
  protected SubLSymbol direction;
  protected SubLSymbol ifExists;
  protected SubLSymbol ifNotExists;
  protected boolean isInteractive = false;
  protected String newline = DEFAULT_NEWLINE;
  private volatile boolean isClosed = false;
  private long inputIndex = 0;
  //// Main
}
