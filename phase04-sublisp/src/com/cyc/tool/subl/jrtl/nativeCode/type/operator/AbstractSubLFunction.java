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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public  abstract class AbstractSubLFunction extends AbstractSubLOperator implements SubLFunction, CommonSymbols {
  //// Constructors
  AbstractSubLFunction(SubLSymbol functionSymbol) {
    super(functionSymbol);
  }
  AbstractSubLFunction(SubLSymbol functionSymbol,
    int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    super(functionSymbol);
    assert(requiredArgCount >= 0);
    assert(optionalArgCount >= 0);
    this.requiredArgCount = requiredArgCount;
    this.optionalArgCount = optionalArgCount;
    this.allowsRest = allowsRest;
  }
  //// Public Area
  public SubLSymbol getType(){ 
    return Types.$dtp_function$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.FIVE_INTEGER;
  }
  public SubLFunction getFunc() {
    return this;
  }
  public SubLObject funcall(SubLObject[] incomingArgs) {
    Object[] evaluatedArgs = null;
    SubLObject[] evaluatedRestArgs = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      int actualArity = incomingArgs.length;
      int applyArity = applyArity();
      boolean allowsRest = allowsRest();
       // ensure arity is appropriate
      if (actualArity < getRequiredArgCount()) {
        Errors.error(this + " called with too few arguments: " + incomingArgs);
      }
      if ((actualArity > applyArity)  && (!allowsRest)) {
        Errors.error(this + " called with too many arguments: " + incomingArgs);
      }
      // deal with regular and rest args
      evaluatedArgs = resourcer.acquireObjectArray(applyArity + (allowsRest ? 1 : 0));
      evaluatedRestArgs = resourcer.acquireSubLObjectArray(actualArity - applyArity);
      int i = 0, argIndex = 0, restArgIndex = 0;
      for (; i < actualArity;i++) { 
        if (i < applyArity) {
          evaluatedArgs[argIndex++] = incomingArgs[i];
        } else {
          evaluatedRestArgs[restArgIndex++] = incomingArgs[i];
        }
      }
      // fill in unprovided optional args with UNPROVIDED
      for (; argIndex < applyArity; argIndex++) { evaluatedArgs[argIndex] = UNPROVIDED; }
      // don't forget to add the actual rest arg
      if (allowsRest) { evaluatedArgs[argIndex] = evaluatedRestArgs; }
      // call the function now
      return apply(evaluatedArgs); 
    } finally {
      resourcer.releaseObjectArray(evaluatedArgs);
      resourcer.releaseSubLObjectArray(evaluatedRestArgs);
    }
  }
  public String toString() {
    SubLSymbol functionSymbol = getFunctionSymbol();
    if (functionSymbol != null) {
      return "#<Function " + functionSymbol + ">";
    } else {
      return super.toString();
    }
  }
  public int getRequiredArgCount() {
    return requiredArgCount;
  }
  public int getOptionalArgCount() {
    return optionalArgCount;
  }
  public boolean allowsRest() {
    return allowsRest;
  }
  public static String FUNCTION_TYPE_NAME = "FUNCTION";
  public String toTypeName() {
    return FUNCTION_TYPE_NAME;
  }
  /**
   * @param operator This is only passed in so that human-readable error
   * strings can be produced.
   */
  public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
    int actualArity = form.rest().size();
    if (form.rest().last(0) != NIL) {
      Errors.error("Invalid attempt to dynamically evaluate an expression conatiaining an improper list: " + form);
    }
    //final SubLSymbol funcSym = form.first().toSymbol();
    SubLObject curArg = form;
    if (actualArity < 6) {
      switch (actualArity) {
        case 0:
          return Functions.funcall(this);
        case 1:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env));
        case 2:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env));
        case 3:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env));
        case 4:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env));
        case 5:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env));
      }
    } else {
      Resourcer resourcer = Resourcer.getInstance();
      SubLObject[] args = null;
      try {
        args = resourcer.acquireSubLObjectArray(actualArity);
        for (int i = 0, size = args.length; i < size; i++) {
          args[i] = (curArg = curArg.rest()).first().eval(env);
        }
        return Functions.funcall(this, args);
      } finally {
        resourcer.releaseObjectArray(args);
      }
    }
    return null;
  }
  public SubLObject apply(SubLCons arg1, SubLEnvironment env) {
    return Functions.funcall(this, arg1, env);
  }
  
  public ZeroArityFunction getZeroArityFunction() {
    if ((zeroArityFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      zeroArityFunction = FixedArityFunctor.makeInstanceDirect(0,ZeroArityFunction.class,this);
    }
    return zeroArityFunction;
  }
  public void setZeroArityFunction(ZeroArityFunction f) {
    zeroArityFunction = f;
  }
  public UnaryFunction getUnaryFunction() {
    if ((unaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      unaryFunction = FixedArityFunctor.makeInstanceDirect(1,UnaryFunction.class,this);
    }
    return unaryFunction;
  }
  public void setUnaryFunction(UnaryFunction f) {
    unaryFunction = f;
  }
  public BinaryFunction getBinaryFunction() {
    if ((binaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) { 
      binaryFunction = FixedArityFunctor.makeInstanceDirect(2,BinaryFunction.class,this);
    }
    return binaryFunction;
  }
  public void setBinaryFunction(BinaryFunction f) {
    binaryFunction = f;
  }
  public TernaryFunction getTernaryFunction() {
    if ((ternaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      return ternaryFunction = FixedArityFunctor.makeInstanceDirect(3,TernaryFunction.class,this);
    }
    return ternaryFunction;
  }
  public void setTernaryFunction(TernaryFunction f) {
    ternaryFunction = f;
  }
  public QuataryFunction getQuataryFunction() {
    if ((quarternaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      quarternaryFunction = FixedArityFunctor.makeInstanceDirect(4,QuataryFunction.class,this);
    }
    return quarternaryFunction;
  }
  public void setQuataryFunction(QuataryFunction f) {
    quarternaryFunction = f;
  }
  public QuintaryFunction getQuintaryFunction() {
    if ((quintenaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      quintenaryFunction = FixedArityFunctor.makeInstanceDirect(5,QuintaryFunction.class,this);
    }
    return quintenaryFunction;
  }
  public void setQuintaryFunction(QuintaryFunction f) {
    quintenaryFunction = f;
  }
  //// Protected Area
  //// Private Area
  //// Internal Rep
  protected int requiredArgCount;
  protected int optionalArgCount;
  protected boolean allowsRest;
  private ZeroArityFunction zeroArityFunction;
  private UnaryFunction unaryFunction;
  private BinaryFunction binaryFunction;
  private TernaryFunction ternaryFunction;
  private QuataryFunction quarternaryFunction;
  private QuintaryFunction quintenaryFunction;
}
