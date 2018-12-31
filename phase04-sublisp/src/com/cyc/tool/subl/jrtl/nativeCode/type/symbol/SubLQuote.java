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

package  com.cyc.tool.subl.jrtl.nativeCode.type.symbol;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.util.SubLFiles.*;

//// External Imports

/**
 * <P>SubLQuote is designed to to be a temporary hack until we
 * get the JRTL bootstrapped, then it should be removed.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date December 10, 2005, 7:44 PM
 * @version $Id: SubLQuote.java 126764 2009-01-07 22:27:23Z tbrussea $
 */
final public class SubLQuote extends AbstractSubLObject implements SubLObject, SubLSymbol {
	// common lisp additions
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  /** Creates a new instance of SubLQuote. */
  // @todo swap packageName, symbolName arg order
  private SubLQuote(String packageName, String symbolName, String alternateRep) {
    symbol = SubLObjectFactory.makeSymbol(symbolName, packageName);
    alternateSymbol = SubLObjectFactory.makeSymbol(alternateRep, packageName);
  }
  //// Public Area
  public SubLSymbol getType(){ 
    return Types.$dtp_symbol$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.TWO_INTEGER;
  }
  public static SubLQuote QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "QUOTE", "'");
  public static SubLQuote BACK_QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "BACKQUOTE", "`");
  public static SubLQuote UNQUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "UNQUOTE", ",");
  public static SubLQuote SPLICING_UNQUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "SPLICING-UNQUOTE", ",@");
  public static SubLQuote FUNCTION_QUOTE_SYMBOL =
      new SubLQuote("SUBLISP", "FUNCTION", "#'");
  
  /** Method created to avoid casting */
  public SubLSymbol toSymbol() {
    return symbol;
  }
  public static String uniqueQuoteName(String packageName, String symbolName, String alternateRep) {
    String lookupName = packageName + ":" + symbolName + " (" + alternateRep + ")";
    return lookupName;
  }
  public int getBindingId() {
    return symbol.getBindingId();
  }
  public SubLObject currentBinding(SubLObject[] bindings) {
    return symbol.currentBinding(bindings);
  }
  public void bind(SubLObject newValue, SubLObject[] bindings) {
    symbol.bind(newValue, bindings);
  }
  public void rebind(SubLObject oldValue, SubLObject[] bindings) {
    symbol.rebind(oldValue, bindings);
  }
  public SubLObject currentBinding(SubLThread thread) {
    return symbol.currentBinding(thread);
  }
  public void bind(SubLObject newValue, SubLThread thread) {
    symbol.bind(newValue, thread);
  }
  public void rebind(SubLObject oldValue, SubLThread thread) {
    symbol.rebind(oldValue, thread);
  }
  public SubLPackage getPackage() {
    return symbol.getPackage();
  }
  public String getName() {
    return symbol.getName();
  }
  public SubLString getSubLName() {
    return symbol.getSubLName();
  }
  public boolean fboundp() {
    return symbol.fboundp();
  }
  public boolean boundp() {
    return symbol.boundp();
  }
  public boolean isDynamic() {
    return symbol.isDynamic();
  }
  public boolean isGlobal() {
    return symbol.isGlobal();
  }
  public boolean isUndeclared() {
    return symbol.isUndeclared();
  }
  public boolean isConstantSymbol() {
    return symbol.isConstantSymbol();
  }

  public SubLSymbol getSymbol() {
    return symbol;
  }
  public boolean canFastHash() {
    return true;
  }
  public SubLOperator getFunction() {
    return symbol.getFunction();
  }
  public SubLFunction getFunc() {
    return symbol.getFunc();
  }
  public SubLObject getValue() {
    return symbol.getValue();
  }
 
  public SubLObject getDynamicValue(SubLObject[] bindings) {
    return symbol.getDynamicValue(bindings);
  }
  public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
    symbol.setDynamicValue(newValue, bindings);
  }
 
  public SubLObject getDynamicValue(SubLThread thread) {
    return symbol.getDynamicValue(thread);
  }
  public void setDynamicValue(SubLObject newValue, SubLThread thread) {
    symbol.setDynamicValue(newValue, thread);
  }
  public SubLObject getDynamicValue() {
    return symbol.getDynamicValue();
  }
  public void setDynamicValue(SubLObject value) {
    symbol.setDynamicValue(value);
  }
  public SubLObject getGlobalValue() {
    return symbol.getGlobalValue();
  }
  public void setGlobalValue(SubLObject value) {
    symbol.setGlobalValue(value);
  }
  public void setConstantValue(SubLObject value) {
    symbol.setConstantValue(value);
  }
  public SubLList getPlist() {
    return symbol.getPlist();
  }
  public void setPackage(SubLPackage thePackage) {
    Errors.error("Can't set package on symbol: " + getName());
  }
  public void setFunction(SubLOperator func) {
    symbol.setFunction(func);
  }
  public void setValue(SubLObject value) {
    symbol.setValue(value);
  }
  public void setProperty(SubLObject indicator, SubLObject value) {
    symbol.setProperty(indicator, value);
  }
  public void removeProperty(SubLObject indicator) {
    symbol.removeProperty(indicator);
  }
  public SubLObject getProperty(SubLObject indicator) {
    return symbol.getProperty(indicator);
  }
  public SubLSymbol getAlternateSymbol() {
    return alternateSymbol;
  }
  public Object clone() {
    return this;
  }
  public SubLObject makeCopy() {
    return this;
  }
  public SubLObject makeDeepCopy() {
    return this;
  }
  public String toString() {
    return symbol.toString();
  }
  public boolean equals(Object obj) {
    return symbol.equals(obj);
  }
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    throw new InvalidSubLExpressionException("Error: Attempt to take the "
        + "value of the unbound variable '" + this + "'.");
  }
  public static String QUOTE_TYPE_NAME = "QUOTE";
  public String toTypeName() {
    return QUOTE_TYPE_NAME;
  }
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return symbol.hashCode(currentDepth + 1);
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  public void forceGlobalValue(SubLObject newValue) {
    symbol.forceGlobalValue(newValue);
  }
  public void setAccessMode(VariableAccessMode accessMode) {
    symbol.setAccessMode(accessMode);
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return true; }
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
  public boolean isStream() { return false; }
  public boolean isPackage() { return false; }
  public boolean isError() { return false; }
  public boolean isGuid() { return false; }
  public boolean isSemaphore() { return false; }
  public boolean isEnvironment() { return false; }
  public boolean isHashtableIterator() { return false; }
  public boolean isRegexPattern() { return false; }
  public boolean isKeyhash() { return false; }
  public boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  //// Private Area
  //// Internal Rep
  private SubLSymbol symbol;
  private SubLSymbol alternateSymbol;
}
