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

package  com.cyc.tool.subl.jrtl.nativeCode.type.operator;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import java.util.ArrayList;

public  class SubLInterpretedFunction extends AbstractSubLFunction implements SubLFunction {
  //// Constructors
  SubLInterpretedFunction(SubLCons form, SubLEnvironment env) {
    this(form, env, null);
  }
  /**
   * Creates a new instance of SubLInterpretedFunction.
   */
  SubLInterpretedFunction(SubLCons form, SubLEnvironment env, SubLSymbol functionSymbol) {
    super(functionSymbol);
    this.form = form;
    if (!isPossiblyLambdaExpression(form, functionSymbol == null)) {
      throw new InvalidSubLExpressionException("Got invalid interpreted function definition: " + form);
    }
    if (form.size() >= 2) {
      argDesc = new FunctionArgListDescription((SubLObject)form.get(1));
    } else {
      argDesc = new FunctionArgListDescription(NIL);
    }
    requiredArgCount = argDesc.getRequiredArgCount();
    optionalArgCount = argDesc.getOptionalArgCount();
    allowsRest = argDesc.allowsRest();
    if (form.size() >= 3) {
      body = form.cddr();
      if (!body.isCons()) {
        throw new InvalidSubLExpressionException("Got invalid body for interpreted function: " + body);
      }
      body = SubLObjectFactory.makeCons(PROGN, body);
    } else {
      body = NIL;
    }
    this.env = env;
    if (functionSymbol != null) { // don't crash on lambdas
      functionSymbol.setFunction(this);
    }
  }
  //// Public Area
  public String toString() {
    SubLSymbol functionSymbol = getFunctionSymbol();
    if (functionSymbol != null) {
      return "#<Interpreted Function " + functionSymbol + ">";
    } else {
      return super.toString();
    }
  }
  
  public boolean isInterpreted() { return true; }
  public static boolean isPossiblyLambdaExpression(SubLObject exp, boolean checkForLambda) {
    if (!exp.isCons()) { return false; }
    SubLCons cons = exp.toCons();
    int size = cons.size();
    if (size < 2) { return false; }
    if (!checkForLambda) { return true; }
    SubLObject possibleLamdaSymbol = (SubLObject)cons.get(0);
    return isLambdaSymbol(possibleLamdaSymbol);
  }
  public static boolean isLambdaSymbol(SubLObject obj) {
    return (obj == CommonSymbols.LAMBDA_SYMBOL);
  }
  public SubLObject apply(Object[] args) {
    SubLEnvironment oldEnv = SubLEnvironment.currentEnvironment();
    SubLEnvironment newEnv = env.extend();
    SubLObject result = NIL;
    ArrayList oldDynamicValues = null;
    try {
      oldDynamicValues = argDesc.expandArgBindings(args, newEnv);
      body.eval(newEnv);
    } catch (CatchableThrow ct) {
      result = Dynamic.handleCatchableThrow(ct, RETURN_TAG);   
    } finally {
      SubLSpecialOperatorDeclarations.possiblyRebindDynamics(oldDynamicValues);
      newEnv.unextend();
      SubLEnvironment.setCurrentEnvironment(oldEnv);
    }
    Values.setFirstMultipleValue(result);
    return result;
  }
  public int applyArity() {
    return getRequiredArgCount() + getOptionalArgCount();
  }
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return this;
  }
  public static String LAMBDA_FUNCTION_TYPE_NAME = "INTERPRETED-FUNCTION";
  public String toTypeName() {
    return LAMBDA_FUNCTION_TYPE_NAME;
  }
  public SubLList getArglist() {
    Errors.unimplementedMethod("SubLInterpretedFunction.getArglist()");
    return NIL;
  }
  public boolean isSpecial() { return false; }
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
  public boolean isFunction() { return true; }
  public boolean isFunctionSpec() { return true; }
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
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return form.hashCode(currentDepth + 1);
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
//// Internal Rep
  private SubLList form;
  private FunctionArgListDescription argDesc;
  private SubLObject body;
  private SubLEnvironment env;
//// Main
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
}
