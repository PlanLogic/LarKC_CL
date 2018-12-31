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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

public  abstract class UnaryFunction extends FixedArityFunctor implements CommonSymbols {
  //// Constructors 
  protected UnaryFunction(SubLFunction func) {
    this.func = func;
    func.setUnaryFunction(this);
  }
  //// Public Area
  public static UnaryFunction makeInstance(SubLSymbol symbol) {
    return makeInstance(symbol.getFunc());
  }
  public static UnaryFunction makeInstance(SubLFunction function) {
    UnaryFunction result = function.getUnaryFunction();
    if (result == null) {
      //System.out.println("Creating slow UnaryFunction for: " + function);
      result = new UnaryFunction(function) {
        public SubLObject processItem(SubLObject obj) {
          SubLObject[] args = null;
          Resourcer resourcer = Resourcer.getInstance();
          try {
            args = resourcer.acquireSubLObjectArray(1);
            args[0] = obj;
            return func.funcall(args);
          } finally {
            resourcer.releaseSubLObjectArray(args);
          }
        }
      };
    }
    return result;
  }
  public abstract SubLObject processItem(SubLObject obj);
  public SubLFunction getFunction() { return func; }
  public static UnaryFunction IDENTITY_UNARY_FUNC = new IdentityUnaryFunction();
  public static UnaryFunction NULL_UNARY_FUNC = new NullUnaryFunction();
  public static UnaryFunction BOOLEANP_UNARY_FUNC = new BooleanpUnaryFunction();
  public static UnaryFunction SYMBOLP_UNARY_FUNC = new SymbolpUnaryFunction();
  public static UnaryFunction ATOM_UNARY_FUNC = new AtomUnaryFunction();
  public static UnaryFunction CONSP_UNARY_FUNC = new ConspUnaryFunction();
  public static UnaryFunction LISTP_UNARY_FUNC = new ListpUnaryFunction();
  public static UnaryFunction SEQUENCEP_UNARY_FUNC = new SequencepUnaryFunction();
  public static UnaryFunction NUMBERP_UNARY_FUNC = new NumberpUnaryFunction();
  public static UnaryFunction FIXNUM_UNARY_FUNC = new FixnumpUnaryFunction();
  public static UnaryFunction BIGNUM_UNARY_FUNC = new BignumpUnaryFunction();
  public static UnaryFunction SHORT_BIGNUM_UNARY_FUNC = new ShortBignumpUnaryFunction();
  public static UnaryFunction MEDIUM_BIGNUM_UNARY_FUNC = new MediumBignumpUnaryFunction();
  public static UnaryFunction LONG_BIGNUM_UNARY_FUNC = new LongBignumpUnaryFunction();
  public static UnaryFunction INTEGERP_UNARY_FUNC = new IntegerpUnaryFunction();
  public static UnaryFunction FLOATP_UNARY_FUNC = new FloatpUnaryFunction();
  public static UnaryFunction CHARACTERP_UNARY_FUNC = new CharacterpUnaryFunction();
  public static UnaryFunction STRINGP_UNARY_FUNC = new StringpUnaryFunction();
  public static UnaryFunction VECTORP_UNARY_FUNC = new VectorpUnaryFunction();
  public static UnaryFunction FUNCTIONP_UNARY_FUNC = new FunctionpUnaryFunction();
  public static UnaryFunction FUNCTION_SPEC_P_UNARY_FUNC = new FunctionspecpUnaryFunction();
  public static UnaryFunction PROCESSP_UNARY_FUNC = new ProcesspUnaryFunction();
  public static UnaryFunction LOCK_P_UNARY_FUNC = new LockpUnaryFunction();
  public static UnaryFunction HASH_TABLE_P_UNARY_FUNC = new HashtablepUnaryFunction();
  public static UnaryFunction STRUCTURE_P_UNARY_FUNC = new StructurepUnaryFunction();
  public static UnaryFunction HASH_TABLE_ITERATOR_P_UNARY_FUNC = new HashtableIteratorpUnaryFunction();
  public static UnaryFunction STREAM_P_UNARY_FUNC = new StreampUnaryFunction();
  public static UnaryFunction INPUT_STREAM_P_UNARY_FUNC = new InputStreampUnaryFunction();
  public static UnaryFunction OUTPUT_STREAM_P_UNARY_FUNC = new OutputStreampUnaryFunction();
  public static UnaryFunction CAR_UNARY_FUNC = new CarUnaryFunction();
  public static UnaryFunction CDR_UNARY_FUNC = new CdrUnaryFunction();
  public static UnaryFunction FIRST_UNARY_FUNC = new FirstUnaryFunction();
  public static UnaryFunction SECOND_UNARY_FUNC = new SecondUnaryFunction();
  public static UnaryFunction GUID_P_UNARY_FUNC = new GuidpUnaryFunction();
  public static UnaryFunction KEYWORDP_UNARY_FUNC = new KeywordpUnaryFunction();
  public static UnaryFunction REVERSE_UNARY_FUNC = new ReverseUnaryFunction();
  public static UnaryFunction NREVERSE_UNARY_FUNC = new NReverseUnaryFunction();
  public static UnaryFunction EVAL_UNARY_FUNC = new EvalUnaryFunction();
  public static UnaryFunction NCONC_UNARY_FUNC = new NconcUnaryFunction();
  public static UnaryFunction CAAR_UNARY_FUNC = new CaarUnaryFunction();
  public static UnaryFunction CADR_UNARY_FUNC = new CadrUnaryFunction();
  public static UnaryFunction VALUES_UNARY_FUNC = new ValuesUnaryFunction();
  public static UnaryFunction TRUE_UNARY_FUNC = new TrueUnaryFunction();
  public static UnaryFunction SYMBOL_FUNCTION_UNARY_FUNC = new SymbolFunctionUnaryFunction();
  public static UnaryFunction LIST_UNARY_FUNC = new ListUnaryFunction();
  public static UnaryFunction CNOT_UNARY_FUNC = new CnotUnaryFunction();
  public static void initialize() {} //this is for side effects of initializing statics
  //// Internal Rep
  private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = Resourcer.getInstance().EMPTY_SUBL_OBJECT_ARRAY;
  protected SubLFunction func;
          
  private static class IdentityUnaryFunction extends UnaryFunction {
    public IdentityUnaryFunction() {
      super(IDENTITY.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj;
    }
  };
  private static class NullUnaryFunction extends UnaryFunction {
    public NullUnaryFunction() {
      super(NULL.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return (obj == NIL) ? (SubLBoolean)T : NIL;
//      if (obj == NIL) { return T; }
//      return NIL;
    }
  };
  private static class BooleanpUnaryFunction extends UnaryFunction {
    public BooleanpUnaryFunction() {
      super(BOOLEANP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isBoolean() ? RET_T : NIL;
    }
  };
  private static class SymbolpUnaryFunction extends UnaryFunction {
    public SymbolpUnaryFunction() {
      super(SYMBOLP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isSymbol() ? (SubLBoolean)T : NIL;
//      if (obj.isSymbol()) { return T; }
//      return NIL;
    }
  };
  private static class KeywordpUnaryFunction extends UnaryFunction {
    public KeywordpUnaryFunction() {
      super(KEYWORDP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isKeyword() ? (SubLBoolean)T : NIL;
//      if (obj.isKeyword()) { return T; }
//      return NIL;
    }
  };
  private static class AtomUnaryFunction extends UnaryFunction {
    public AtomUnaryFunction() {
      super(ATOM.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isAtom() ? (SubLBoolean)T : NIL;
//      if (obj.isAtom()) { return T; }
//      return NIL;
    }
  };
  private static class ConspUnaryFunction extends UnaryFunction {
    public ConspUnaryFunction() {
      super(CONSP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isCons() ? (SubLBoolean)T : NIL;
//      if (obj.isCons()) { return T; }
//      return NIL;
    }
  };
  private static class ListpUnaryFunction extends UnaryFunction {
    public ListpUnaryFunction() {
      super(LISTP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isList() ? (SubLBoolean)T : NIL;
//      if (obj.isList()) { return T; }
//      return NIL;
    }
  };
  private static class SequencepUnaryFunction extends UnaryFunction {
    public SequencepUnaryFunction() {
      super(SEQUENCEP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isSequence() ? (SubLBoolean)T : NIL;
//      if (obj.isSequence()) { return T; }
//      return NIL;
    }
  };
  private static class NumberpUnaryFunction extends UnaryFunction {
    public NumberpUnaryFunction() {
      super(NUMBERP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isNumber() ? (SubLBoolean)T : NIL;
//      if (obj.isNumber()) { return T; }
//      return NIL;
    }
  };
  private static class FixnumpUnaryFunction extends UnaryFunction {
    public FixnumpUnaryFunction() {
      super(FIXNUMP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isFixnum() ? (SubLBoolean)T : NIL;
//      if (obj.isFixnum()) { return T; }
//      return NIL;
    }
  };
  private static class BignumpUnaryFunction extends UnaryFunction {
    public BignumpUnaryFunction() {
      super(BIGNUMP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isBignum()) { return T; }
//      return NIL;
    }
  };
  private static class ShortBignumpUnaryFunction extends UnaryFunction {
    public ShortBignumpUnaryFunction() {
      super(SHORT_BIGNUM_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isIntBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isIntBignum()) { return T; }
//      return NIL;
    }
  };
  private static class MediumBignumpUnaryFunction extends UnaryFunction {
    public MediumBignumpUnaryFunction() {
      super(MEDIUM_BIGNUM_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isLongBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isLongBignum()) { return T; }
//      return NIL;
    }
  };
  private static class LongBignumpUnaryFunction extends UnaryFunction {
    public LongBignumpUnaryFunction() {
      super(LONG_BIGNUM_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isBigIntegerBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isBigIntegerBignum()) { return T; }
//      return NIL;
    }
  };
  private static class IntegerpUnaryFunction extends UnaryFunction {
    public IntegerpUnaryFunction() {
      super(INTEGERP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isInteger() ? (SubLBoolean)T : NIL;
//      if (obj.isInteger()) { return T; }
//      return NIL;
    }
  };
  private static class FloatpUnaryFunction extends UnaryFunction {
    public FloatpUnaryFunction() {
      super(FLOATP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isDouble() ? (SubLBoolean)T : NIL;
//      if (obj.isDouble()) { return T; }
//      return NIL;
    }
  };
  private static class CharacterpUnaryFunction extends UnaryFunction {
    public CharacterpUnaryFunction() {
      super(CHARACTERP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isChar() ? (SubLBoolean)T : NIL;
//      if (obj.isChar()) { return T; }
//      return NIL;
    }
  };
  private static class StringpUnaryFunction extends UnaryFunction {
    public StringpUnaryFunction() {
      super(STRINGP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isString() ? (SubLBoolean)T : NIL;
//      if (obj.isString()) { return T; }
//      return NIL;
    }
  };
  private static class VectorpUnaryFunction extends UnaryFunction {
    public VectorpUnaryFunction() {
      super(VECTORP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isVector() ? (SubLBoolean)T : NIL;
//      if (obj.isVector()) { return T; }
//      return NIL;
    }
  };
  private static class FunctionpUnaryFunction extends UnaryFunction {
    public FunctionpUnaryFunction() {
      super(FUNCTIONP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isFunction() ? (SubLBoolean)T : NIL;
//      if (obj.isFunction()) { return T; }
//      return NIL;
    }
  };
  private static class FunctionspecpUnaryFunction extends UnaryFunction {
    public FunctionspecpUnaryFunction() {
      super(FUNCTION_SPEC_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isFunctionSpec() ? (SubLBoolean)T : NIL;
//      if (obj.isFunctionSpec()) { return T; }
//      return NIL;
    }
  }
  private static class HashtablepUnaryFunction extends UnaryFunction {
    public HashtablepUnaryFunction() {
      super(HASH_TABLE_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isHashtable() ? (SubLBoolean)T : NIL;
//      if (obj.isHashtable()) { return T; }
//      return NIL;
    }
  };
  private static class ProcesspUnaryFunction extends UnaryFunction {
    public ProcesspUnaryFunction() {
      super(PROCESSP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isProcess() ? (SubLBoolean)T : NIL;
//      if (obj.isProcess()) { return T; }
//      return NIL;
    }
  };
  private static class LockpUnaryFunction extends UnaryFunction {
    public LockpUnaryFunction() {
      super(LOCK_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isLock() ? (SubLBoolean)T : NIL;
//      if (obj.isLock()) { return T; }
//      return NIL;
    }
  };
  private static class HashtableIteratorpUnaryFunction extends UnaryFunction {
    public HashtableIteratorpUnaryFunction() {
      super(HASH_TABLE_ITERATOR_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      if (obj.isHashtableIterator()) { return T; }
      return NIL;
    }
  };
  private static class StructurepUnaryFunction extends UnaryFunction {
    public StructurepUnaryFunction() {
      super(STRUCTURE_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isStructure() ? (SubLBoolean)T : NIL;
//      if (obj.isStructure()) { return T; }
//      return NIL;
    }
  };
  private static class StreampUnaryFunction extends UnaryFunction {
    public StreampUnaryFunction() {
      super(STREAMP.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.isStream() ? (SubLBoolean)T : NIL;
//      if (obj.isStream()) { return T; }
//      return NIL;
    }
  };
  private static class InputStreampUnaryFunction extends UnaryFunction {
    public InputStreampUnaryFunction() {
      super(INPUT_STREAM_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return streams_high.input_stream_p(obj);
    }
  };
  private static class OutputStreampUnaryFunction extends UnaryFunction {
    public OutputStreampUnaryFunction() {
      super(OUTPUT_STREAM_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return streams_high.output_stream_p(obj);
    }
  };
  private static class CarUnaryFunction extends UnaryFunction {
    public CarUnaryFunction() {
      super(CAR.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.first();
    }
  };
  private static class CdrUnaryFunction extends UnaryFunction {
    public CdrUnaryFunction() {
      super(CDR.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.rest();
    }
  };
  private static class FirstUnaryFunction extends UnaryFunction {
    public FirstUnaryFunction() {
      super(FIRST.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.first();
    }
  };
  private static class SecondUnaryFunction extends UnaryFunction {
    public SecondUnaryFunction() {
      super(SECOND.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.second();
    }
  };
  private static class GuidpUnaryFunction extends UnaryFunction {
    public GuidpUnaryFunction() {
      super(GUID_P.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      if (obj.isGuid()) { return T; }
      return NIL;
    }
  };
  private static class ReverseUnaryFunction extends UnaryFunction {
    public ReverseUnaryFunction() {
      super(REVERSE.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.reverse(false);
    }
  };
  private static class NReverseUnaryFunction extends UnaryFunction {
    public NReverseUnaryFunction() {
      super(NREVERSE.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.reverse(true);
    }
  };
  private static class EvalUnaryFunction extends UnaryFunction {
    public EvalUnaryFunction() {
      super(EVAL.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.eval(SubLEnvironment.currentEnvironment());
    }
  };
  private static class NconcUnaryFunction extends UnaryFunction {
    public NconcUnaryFunction() {
      super(NCONC.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj;
    }
  };
  private static class CaarUnaryFunction extends UnaryFunction {
    public CaarUnaryFunction() {
      super(CAAR.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.toList().caar();
    }
  };
  private static class CadrUnaryFunction extends UnaryFunction {
    public CadrUnaryFunction() {
      super(CADR.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return obj.toList().cadr();
    }
  };
  private static class ValuesUnaryFunction extends UnaryFunction {
    public ValuesUnaryFunction() {
      super(VALUES.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return Values.values(obj);
    }
  };
  private static class TrueUnaryFunction extends UnaryFunction {
    public TrueUnaryFunction() {
      super(TRUE.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return T;
    }
  };
  private static class SymbolFunctionUnaryFunction extends UnaryFunction {
    public SymbolFunctionUnaryFunction() {
      super(SYMBOL_FUNCTION.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return Symbols.symbol_function(obj);
    }
  };
  private static class ListUnaryFunction extends UnaryFunction {
    public ListUnaryFunction() {
      super(LIST.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return ConsesLow.list(obj);
    }
  };
  private static class CnotUnaryFunction extends UnaryFunction {
    public CnotUnaryFunction() {
      super(CNOT.getFunc());
    }
    public SubLObject processItem(SubLObject obj) {
      return SubLSpecialOperatorDeclarations.cnot(obj);
    }
  };
}
