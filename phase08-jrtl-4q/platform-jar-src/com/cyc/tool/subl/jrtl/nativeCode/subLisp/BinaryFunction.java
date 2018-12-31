//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class BinaryFunction extends FixedArityFunctor implements CommonSymbols {
	private static class AssembleFixnumsToIntegerBinaryFunction extends BinaryFunction {
		public AssembleFixnumsToIntegerBinaryFunction() {
			super(CommonSymbols.ASSEMBLE_FIXNUMS_TO_INTEGER.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize1;
			args[0] = obj2;
			return Numbers.assemble_fixnums_to_integer(obj1, args);
		}
	}

	private static class CandBinaryFunction extends BinaryFunction {
		public CandBinaryFunction() {
			super(CommonSymbols.CAND.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cand(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CcatchBinaryFunction extends BinaryFunction {
		public CcatchBinaryFunction() {
			super(CommonSymbols.CCATCH.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.ccatch(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdecBinaryFunction extends BinaryFunction {
		public CdecBinaryFunction() {
			super(CommonSymbols.CDEC.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdec(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoAllSymbolsBinaryFunction extends BinaryFunction {
		public CdoAllSymbolsBinaryFunction() {
			super(CommonSymbols.CDO_ALL_SYMBOLS.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdo_all_symbols(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoBinaryFunction extends BinaryFunction {
		public CdoBinaryFunction() {
			super(CommonSymbols.CDO.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdo(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoExternalSymbolsBinaryFunction extends BinaryFunction {
		public CdoExternalSymbolsBinaryFunction() {
			super(CommonSymbols.CDO_EXTERNAL_SYMBOLS.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdo_external_symbols(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoHashBinaryFunction extends BinaryFunction {
		public CdoHashBinaryFunction() {
			super(CommonSymbols.CDOHASH.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdohash(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoListBinaryFunction extends BinaryFunction {
		public CdoListBinaryFunction() {
			super(CommonSymbols.CDOLIST.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdolist(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoSymbolsBinaryFunction extends BinaryFunction {
		public CdoSymbolsBinaryFunction() {
			super(CommonSymbols.CDO_SYMBOLS.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdo_symbols(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CdoTimesBinaryFunction extends BinaryFunction {
		public CdoTimesBinaryFunction() {
			super(CommonSymbols.CDOTIMES.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cdotimes(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CharEFunction extends BinaryFunction {
		public CharEFunction() {
			super(CommonSymbols.CHAR_E_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charE(obj1, obj2);
		}
	}

	private static class CharEqualFunction extends BinaryFunction {
		public CharEqualFunction() {
			super(CommonSymbols.CHAR_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_equal(obj1, obj2);
		}
	}

	private static class CharGEFunction extends BinaryFunction {
		public CharGEFunction() {
			super(CommonSymbols.CHAR_GTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charGE(obj1, obj2);
		}
	}

	private static class CharGFunction extends BinaryFunction {
		public CharGFunction() {
			super(CommonSymbols.CHAR_GT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charG(obj1, obj2);
		}
	}

	private static class CharGreaterThanFunction extends BinaryFunction {
		public CharGreaterThanFunction() {
			super(CommonSymbols.CHAR_GREATER_THAN_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_greaterp(obj1, obj2);
		}
	}

	private static class CharGreaterThanOrEqualFunction extends BinaryFunction {
		public CharGreaterThanOrEqualFunction() {
			super(CommonSymbols.CHAR_GREATER_THAN_OR_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_not_lessp(obj1, obj2);
		}
	}

	private static class CharLEFunction extends BinaryFunction {
		public CharLEFunction() {
			super(CommonSymbols.CHAR_LTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charLE(obj1, obj2);
		}
	}

	private static class CharLessThanFunction extends BinaryFunction {
		public CharLessThanFunction() {
			super(CommonSymbols.CHAR_LESS_THAN_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_lessp(obj1, obj2);
		}
	}

	private static class CharLessThanOrEqualFunction extends BinaryFunction {
		public CharLessThanOrEqualFunction() {
			super(CommonSymbols.CHAR_LESS_THAN_OR_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_not_greaterp(obj1, obj2);
		}
	}

	private static class CharLFunction extends BinaryFunction {
		public CharLFunction() {
			super(CommonSymbols.CHAR_LT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charL(obj1, obj2);
		}
	}

	private static class CharNEFunction extends BinaryFunction {
		public CharNEFunction() {
			super(CommonSymbols.CHAR_NE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.charNE(obj1, obj2);
		}
	}

	private static class CharNotEqualFunction extends BinaryFunction {
		public CharNotEqualFunction() {
			super(CommonSymbols.CHAR_NOT_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Characters.char_not_equal(obj1, obj2);
		}
	}

	private static class CheckTypeBinaryFunction extends BinaryFunction {
		public CheckTypeBinaryFunction() {
			super(CommonSymbols.CHECK_TYPE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.check_type(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CincBinaryFunction extends BinaryFunction {
		public CincBinaryFunction() {
			super(CommonSymbols.CINC.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cinc(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CletBinaryFunction extends BinaryFunction {
		public CletBinaryFunction() {
			super(CommonSymbols.CLET.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.clet(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CmultipleValuebindBinaryFunction extends BinaryFunction {
		public CmultipleValuebindBinaryFunction() {
			super(CommonSymbols.CMULTIPLE_VALUE_BIND.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cmultiple_value_bind(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class ConsBinaryFunction extends BinaryFunction {
		public ConsBinaryFunction() {
			super(CommonSymbols.CONS.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLObjectFactory.makeCons(obj1, obj2);
		}
	}

	private static class CorBinaryFunction extends BinaryFunction {
		public CorBinaryFunction() {
			super(CommonSymbols.COR.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cor(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CpopBinaryFunction extends BinaryFunction {
		public CpopBinaryFunction() {
			super(CommonSymbols.CPOP.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cpop(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CprogvBinaryFunction extends BinaryFunction {
		public CprogvBinaryFunction() {
			super(CommonSymbols.CPROGV.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cprogv(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CpushBinaryFunction extends BinaryFunction {
		public CpushBinaryFunction() {
			super(CommonSymbols.CPUSH.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cpush(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CpushNewBinaryFunction extends BinaryFunction {
		public CpushNewBinaryFunction() {
			super(CommonSymbols.CPUSHNEW.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cpushnew(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CsetfBinaryFunction extends BinaryFunction {
		public CsetfBinaryFunction() {
			super(CommonSymbols.CSETF.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.csetf(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CsetqBinaryFunction extends BinaryFunction {
		public CsetqBinaryFunction() {
			super(CommonSymbols.CSETQ.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.csetq(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CsomeBinaryFunction extends BinaryFunction {
		public CsomeBinaryFunction() {
			super(CommonSymbols.CSOME.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.csome(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CtimeBinaryFunction extends BinaryFunction {
		public CtimeBinaryFunction() {
			super(CommonSymbols.CTIME.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.ctime(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CunwindProtectBinaryFunction extends BinaryFunction {
		public CunwindProtectBinaryFunction() {
			super(CommonSymbols.CUNWIND_PROTECT.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cunwind_protect(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class CvsIdBinaryFunction extends BinaryFunction {
		public CvsIdBinaryFunction() {
			super(CommonSymbols.CVS_ID.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.cvs_id(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DeclaimBinaryFunction extends BinaryFunction {
		public DeclaimBinaryFunction() {
			super(CommonSymbols.DECLAIM.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.declaim(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DeclareBinaryFunction extends BinaryFunction {
		public DeclareBinaryFunction() {
			super(CommonSymbols.DECLARE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.declare(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefConstantBinaryFunction extends BinaryFunction {
		public DefConstantBinaryFunction() {
			super(CommonSymbols.DEFCONSTANT.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.defconstant(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefineBinaryFunction extends BinaryFunction {
		public DefineBinaryFunction() {
			super(CommonSymbols.DEFINE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.define(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefLexicalBinaryFunction extends BinaryFunction {
		public DefLexicalBinaryFunction() {
			super(CommonSymbols.DEFLEXICAL.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.deflexical(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefMacroBinaryFunction extends BinaryFunction {
		public DefMacroBinaryFunction() {
			super(CommonSymbols.DEFMACRO.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.defmacro(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefParameterBinaryFunction extends BinaryFunction {
		public DefParameterBinaryFunction() {
			super(CommonSymbols.DEFPARAMETER.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.defparameter(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class DefVarBinaryFunction extends BinaryFunction {
		public DefVarBinaryFunction() {
			super(CommonSymbols.DEFVAR.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.defvar(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class EnforceMustBinaryFunction extends BinaryFunction {
		public EnforceMustBinaryFunction() {
			super(CommonSymbols.ENFORCE_MUST.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.enforce_must(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class EnforceTypeBinaryFunction extends BinaryFunction {
		public EnforceTypeBinaryFunction() {
			super(CommonSymbols.ENFORCE_TYPE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.enforce_type(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class EqFunction extends BinaryFunction {
		public EqFunction() {
			super(CommonSymbols.EQ.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			if (obj1 == obj2)
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class EqlFunction extends BinaryFunction {
		public EqlFunction() {
			super(CommonSymbols.EQL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			if (obj1.eql(obj2))
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class EqualFunction extends BinaryFunction {
		public EqualFunction() {
			super(CommonSymbols.EQUAL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			if (obj1.equal(obj2))
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class EqualpFunction extends BinaryFunction {
		public EqualpFunction() {
			super(CommonSymbols.EQUALP.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			if (obj1.equalp(obj2))
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class FifBinaryFunction extends BinaryFunction {
		public FifBinaryFunction() {
			super(CommonSymbols.FIF.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.fif(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class FunctionBinaryFunction extends BinaryFunction {
		public FunctionBinaryFunction() {
			super(CommonSymbols.FUNCTION.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.function(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class FunlessBinaryFunction extends BinaryFunction {
		public FunlessBinaryFunction() {
			super(CommonSymbols.FUNLESS.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.funless(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class FwhenBinaryFunction extends BinaryFunction {
		public FwhenBinaryFunction() {
			super(CommonSymbols.FWHEN.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.fwhen(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class ListBinaryFunction extends BinaryFunction {
		public ListBinaryFunction() {
			super(CommonSymbols.LIST.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return ConsesLow.list(obj1, obj2);
		}
	}

	private static class MultipleValueListBinaryFunction extends BinaryFunction {
		public MultipleValueListBinaryFunction() {
			super(CommonSymbols.MULTIPLE_VALUE_LIST.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.multiple_value_list(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class MustBinaryFunction extends BinaryFunction {
		public MustBinaryFunction() {
			super(CommonSymbols.MUST.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.must(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class NthValueBinaryFunction extends BinaryFunction {
		public NthValueBinaryFunction() {
			super(CommonSymbols.NTH_VALUE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.nth_value(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class NumEFilterFunction extends BinaryFunction {
		public NumEFilterFunction() {
			super(CommonSymbols.NUM_E_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numE(obj1, obj2);
		}
	}

	private static class NumEFunction extends BinaryFunction {
		public NumEFunction() {
			super(CommonSymbols.NUM_E_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numE(obj1, obj2);
		}
	}

	private static class NumGEFilterFunction extends BinaryFunction {
		public NumGEFilterFunction() {
			super(CommonSymbols.NUM_GTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numGE(obj1, obj2);
		}
	}

	private static class NumGEFunction extends BinaryFunction {
		public NumGEFunction() {
			super(CommonSymbols.NUM_GTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numGE(obj1, obj2);
		}
	}

	private static class NumGFilterFunction extends BinaryFunction {
		public NumGFilterFunction() {
			super(CommonSymbols.NUM_GT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numG(obj1, obj2);
		}
	}

	private static class NumGFunction extends BinaryFunction {
		public NumGFunction() {
			super(CommonSymbols.NUM_GT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numG(obj1, obj2);
		}
	}

	private static class NumLEFilterFunction extends BinaryFunction {
		public NumLEFilterFunction() {
			super(CommonSymbols.NUM_LTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numLE(obj1, obj2);
		}
	}

	private static class NumLEFunction extends BinaryFunction {
		public NumLEFunction() {
			super(CommonSymbols.NUM_LTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numLE(obj1, obj2);
		}
	}

	private static class NumLFilterFunction extends BinaryFunction {
		public NumLFilterFunction() {
			super(CommonSymbols.NUM_LT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numL(obj1, obj2);
		}
	}

	private static class NumLFunction extends BinaryFunction {
		public NumLFunction() {
			super(CommonSymbols.NUM_LT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numL(obj1, obj2);
		}
	}

	private static class NumNEFilterFunction extends BinaryFunction {
		public NumNEFilterFunction() {
			super(CommonSymbols.NUM_NE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numNE(obj1, obj2);
		}
	}

	private static class NumNEFunction extends BinaryFunction {
		public NumNEFunction() {
			super(CommonSymbols.NUM_NE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Numbers.numNE(obj1, obj2);
		}
	}

	private static class PcaseBinaryFunction extends BinaryFunction {
		public PcaseBinaryFunction() {
			super(CommonSymbols.PCASE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.pcase(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class PcondBinaryFunction extends BinaryFunction {
		public PcondBinaryFunction() {
			super(CommonSymbols.PCOND.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.pcond(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class PifBinaryFunction extends BinaryFunction {
		public PifBinaryFunction() {
			super(CommonSymbols.PIF.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.pif(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class PrognBinaryFunction extends BinaryFunction {
		public PrognBinaryFunction() {
			super(CommonSymbols.PROGN.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.progn(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class PunlessBinaryFunction extends BinaryFunction {
		public PunlessBinaryFunction() {
			super(CommonSymbols.PUNLESS.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.punless(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class PwhenBinaryFunction extends BinaryFunction {
		public PwhenBinaryFunction() {
			super(CommonSymbols.PWHEN.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.pwhen(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class QuoteBinaryFunction extends BinaryFunction {
		public QuoteBinaryFunction() {
			super(CommonSymbols.QUOTE.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.quote(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class RetBinaryFunction extends BinaryFunction {
		public RetBinaryFunction() {
			super(CommonSymbols.RET.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.ret(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class StringEFilterFunction extends BinaryFunction {
		public StringEFilterFunction() {
			super(CommonSymbols.STRING_E_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringE(obj1, obj2);
		}
	}

	private static class StringEFunction extends BinaryFunction {
		public StringEFunction() {
			super(CommonSymbols.STRING_E_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringE(obj1, obj2);
		}
	}

	private static class StringEqualFunction extends BinaryFunction {
		public StringEqualFunction() {
			super(CommonSymbols.STRING_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_equal(obj1, obj2);
		}
	}

	private static class StringGEFilterFunction extends BinaryFunction {
		public StringGEFilterFunction() {
			super(CommonSymbols.STRING_GTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringGE(obj1, obj2);
		}
	}

	private static class StringGEFunction extends BinaryFunction {
		public StringGEFunction() {
			super(CommonSymbols.STRING_GTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringGE(obj1, obj2);
		}
	}

	private static class StringGFilterFunction extends BinaryFunction {
		public StringGFilterFunction() {
			super(CommonSymbols.STRING_GT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringG(obj1, obj2);
		}
	}

	private static class StringGFunction extends BinaryFunction {
		public StringGFunction() {
			super(CommonSymbols.STRING_GT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringG(obj1, obj2);
		}
	}

	private static class StringGreaterThanFunction extends BinaryFunction {
		public StringGreaterThanFunction() {
			super(CommonSymbols.STRING_GREATER_THAN_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_greaterp(obj1, obj2);
		}
	}

	private static class StringGreaterThanOrEqualFunction extends BinaryFunction {
		public StringGreaterThanOrEqualFunction() {
			super(CommonSymbols.STRING_GREATER_THAN_OR_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_not_lessp(obj1, obj2);
		}
	}

	private static class StringLEFilterFunction extends BinaryFunction {
		public StringLEFilterFunction() {
			super(CommonSymbols.STRING_LTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringLE(obj1, obj2);
		}
	}

	private static class StringLEFunction extends BinaryFunction {
		public StringLEFunction() {
			super(CommonSymbols.STRING_LTE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringLE(obj1, obj2);
		}
	}

	private static class StringLessThanFunction extends BinaryFunction {
		public StringLessThanFunction() {
			super(CommonSymbols.STRING_LESS_THAN_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_lessp(obj1, obj2);
		}
	}

	private static class StringLessThanOrEqualFunction extends BinaryFunction {
		public StringLessThanOrEqualFunction() {
			super(CommonSymbols.STRING_LESS_THAN_OR_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_not_greaterp(obj1, obj2);
		}
	}

	private static class StringLFilterFunction extends BinaryFunction {
		public StringLFilterFunction() {
			super(CommonSymbols.STRING_LT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringL(obj1, obj2);
		}
	}

	private static class StringLFunction extends BinaryFunction {
		public StringLFunction() {
			super(CommonSymbols.STRING_LT_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringL(obj1, obj2);
		}
	}

	private static class StringNEFunction extends BinaryFunction {
		public StringNEFunction() {
			super(CommonSymbols.STRING_NE_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.stringNE(obj1, obj2);
		}
	}

	private static class StringNotEqualFunction extends BinaryFunction {
		public StringNotEqualFunction() {
			super(CommonSymbols.STRING_NOT_EQUAL_SYMBOL.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return Strings.string_not_equal(obj1, obj2);
		}
	}

	private static class ValuesBinaryFunction extends BinaryFunction {
		public ValuesBinaryFunction() {
			super(CommonSymbols.VALUES.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLProcess.currentSubLThread().values(obj1, obj2);
		}
	}

	private static class WithErrorHandlerBinaryFunction extends BinaryFunction {
		public WithErrorHandlerBinaryFunction() {
			super(CommonSymbols.WITH_ERROR_HANDLER.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.with_error_handler(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class WithStaticAreaBinaryFunction extends BinaryFunction {
		public WithStaticAreaBinaryFunction() {
			super(CommonSymbols.WITH_STATIC_AREA.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.with_static_area(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class WithThreadPrivateAreaBinaryFunction extends BinaryFunction {
		public WithThreadPrivateAreaBinaryFunction() {
			super(CommonSymbols.WITH_THREAD_PRIVATE_AREA.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.with_thread_private_area(obj1.toCons(), obj2.toEnv());
		}
	}

	private static class WithWorkingAreaBinaryFunction extends BinaryFunction {
		public WithWorkingAreaBinaryFunction() {
			super(CommonSymbols.WITH_WORKING_AREA.getFunction().toSpecialOperator().getEvaluationFunction());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
			return SubLSpecialOperatorDeclarations.with_working_area(obj1.toCons(), obj2.toEnv());
		}
	}

	public static BinaryFunction CONS_BINARY_FUNC;

	public static BinaryFunction LIST_BINARY_FUNC;

	public static BinaryFunction EQ_TEST;

	public static BinaryFunction EQL_TEST;

	public static BinaryFunction EQUAL_TEST;
	public static BinaryFunction EQUALP_TEST;
	public static BinaryFunction NUM_E_TEST;
	public static BinaryFunction NUM_NE_TEST;
	public static BinaryFunction NUM_L_TEST;
	public static BinaryFunction NUM_LE_TEST;
	public static BinaryFunction NUM_G_TEST;
	public static BinaryFunction NUM_GE_TEST;
	public static BinaryFunction STRING_EQUAL_TEST;
	public static BinaryFunction STRING_NOT_EQUAL_TEST;
	public static BinaryFunction STRING_LESS_THAN_TEST;
	public static BinaryFunction STRING_LESS_THAN_OR_EQUAL_TEST;
	public static BinaryFunction STRING_GREATER_THAN_TEST;
	public static BinaryFunction STRING_GREATER_THAN_OR_EQUAL_TEST;
	public static BinaryFunction STRING_E_TEST;
	public static BinaryFunction STRING_NE_TEST;
	public static BinaryFunction STRING_L_TEST;
	public static BinaryFunction STRING_LE_TEST;
	public static BinaryFunction STRING_G_TEST;
	public static BinaryFunction STRING_GE_TEST;
	public static BinaryFunction CHAR_EQUAL_TEST;
	public static BinaryFunction CHAR_NOT_EQUAL_TEST;
	public static BinaryFunction CHAR_LESS_THAN_TEST;
	public static BinaryFunction CHAR_LESS_THAN_OR_EQUAL_TEST;
	public static BinaryFunction CHAR_GREATER_THAN_TEST;
	public static BinaryFunction CHAR_GREATER_THAN_OR_EQUAL_TEST;
	public static BinaryFunction CHAR_E_TEST;
	public static BinaryFunction CHAR_NE_TEST;
	public static BinaryFunction CHAR_L_TEST;
	public static BinaryFunction CHAR_LE_TEST;
	public static BinaryFunction CHAR_G_TEST;
	public static BinaryFunction CHAR_GE_TEST;
	public static BinaryFunction ASSEMBLE_FIXNUMS_TO_INTEGER_BINARY_FUNC;
	public static BinaryFunction VALUES_BINARY_FUNC;
	public static BinaryFunction DEFINE_BINARY_FUNC;
	public static BinaryFunction DEFMACRO_BINARY_FUNC;
	public static BinaryFunction DEFCONSTANT_BINARY_FUNC;
	public static BinaryFunction DEFPARAMETER_BINARY_FUNC;
	public static BinaryFunction DEFVAR_BINARY_FUNC;
	public static BinaryFunction DEFLEXICAL_BINARY_FUNC;
	public static BinaryFunction PROGN_BINARY_FUNC;
	public static BinaryFunction PIF_BINARY_FUNC;
	public static BinaryFunction PWHEN_BINARY_FUNC;
	public static BinaryFunction PUNLESS_BINARY_FUNC;
	public static BinaryFunction PCOND_BINARY_FUNC;
	public static BinaryFunction PCASE_BINARY_FUNC;
	public static BinaryFunction CSETQ_BINARY_FUNC;
	public static BinaryFunction CSETF_BINARY_FUNC;
	public static BinaryFunction CINC_BINARY_FUNC;
	public static BinaryFunction CDEC_BINARY_FUNC;
	public static BinaryFunction CPUSH_BINARY_FUNC;
	public static BinaryFunction CPUSHNEW_BINARY_FUNC;
	public static BinaryFunction CPOP_BINARY_FUNC;
	public static BinaryFunction CLET_BINARY_FUNC;
	public static BinaryFunction CPROGV_BINARY_FUNC;
	public static BinaryFunction CMULTIPLE_VALUE_BIND_BINARY_FUNC;
	public static BinaryFunction MULTIPLE_VALUE_LIST_BINARY_FUNC;
	public static BinaryFunction NTH_VALUE_BINARY_FUNC;
	public static BinaryFunction CDO_BINARY_FUNC;
	public static BinaryFunction CDOTIMES_BINARY_FUNC;
	public static BinaryFunction CDOLIST_BINARY_FUNC;
	public static BinaryFunction CSOME_BINARY_FUNC;
	public static BinaryFunction CDOHASH_BINARY_FUNC;
	public static BinaryFunction CDO_SYMBOLS_BINARY_FUNC;
	public static BinaryFunction CDO_ALL_SYMBOLS_BINARY_FUNC;
	public static BinaryFunction CDO_EXTERNAL_SYMBOLS_BINARY_FUNC;
	public static BinaryFunction CCATCH_BINARY_FUNC;
	public static BinaryFunction CUNWIND_PROTECT_BINARY_FUNC;
	public static BinaryFunction CTIME_BINARY_FUNC;
	public static BinaryFunction RET_BINARY_FUNC;
	public static BinaryFunction ENFORCE_TYPE_BINARY_FUNC;
	public static BinaryFunction CHECK_TYPE_BINARY_FUNC;
	public static BinaryFunction ENFORCE_MUST_BINARY_FUNC;
	public static BinaryFunction MUST_BINARY_FUNC;
	public static BinaryFunction CAND_BINARY_FUNC;
	public static BinaryFunction COR_BINARY_FUNC;
	public static BinaryFunction FIF_BINARY_FUNC;
	public static BinaryFunction FWHEN_BINARY_FUNC;
	public static BinaryFunction FUNLESS_BINARY_FUNC;
	public static BinaryFunction CVS_ID_BINARY_FUNC;
	public static BinaryFunction DECLARE_BINARY_FUNC;
	public static BinaryFunction DECLAIM_BINARY_FUNC;
	public static BinaryFunction QUOTE_BINARY_FUNC;
	public static BinaryFunction FUNCTION_BINARY_FUNC;
	public static BinaryFunction WITH_ERROR_HANDLER_BINARY_FUNC;
	public static BinaryFunction WITH_STATIC_AREA_BINARY_FUNC;
	public static BinaryFunction WITH_THREAD_PRIVATE_AREA_BINARY_FUNC;
	public static BinaryFunction WITH_WORKING_AREA_BINARY_FUNC;
	private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;
	static {
		BinaryFunction.CONS_BINARY_FUNC = new ConsBinaryFunction();
		BinaryFunction.LIST_BINARY_FUNC = new ListBinaryFunction();
		BinaryFunction.EQ_TEST = new EqFunction();
		BinaryFunction.EQL_TEST = new EqlFunction();
		BinaryFunction.EQUAL_TEST = new EqualFunction();
		BinaryFunction.EQUALP_TEST = new EqualpFunction();
		BinaryFunction.NUM_E_TEST = new NumEFunction();
		BinaryFunction.NUM_NE_TEST = new NumNEFunction();
		BinaryFunction.NUM_L_TEST = new NumLFunction();
		BinaryFunction.NUM_LE_TEST = new NumLEFunction();
		BinaryFunction.NUM_G_TEST = new NumGFunction();
		BinaryFunction.NUM_GE_TEST = new NumGEFunction();
		BinaryFunction.STRING_EQUAL_TEST = new StringEqualFunction();
		BinaryFunction.STRING_NOT_EQUAL_TEST = new StringNotEqualFunction();
		BinaryFunction.STRING_LESS_THAN_TEST = new StringLessThanFunction();
		BinaryFunction.STRING_LESS_THAN_OR_EQUAL_TEST = new StringLessThanOrEqualFunction();
		BinaryFunction.STRING_GREATER_THAN_TEST = new StringGreaterThanFunction();
		BinaryFunction.STRING_GREATER_THAN_OR_EQUAL_TEST = new StringGreaterThanOrEqualFunction();
		BinaryFunction.STRING_E_TEST = new StringEFunction();
		BinaryFunction.STRING_NE_TEST = new StringNEFunction();
		BinaryFunction.STRING_L_TEST = new StringLFunction();
		BinaryFunction.STRING_LE_TEST = new StringLEFunction();
		BinaryFunction.STRING_G_TEST = new StringGFunction();
		BinaryFunction.STRING_GE_TEST = new StringGEFunction();
		BinaryFunction.CHAR_EQUAL_TEST = new CharEqualFunction();
		BinaryFunction.CHAR_NOT_EQUAL_TEST = new CharNotEqualFunction();
		BinaryFunction.CHAR_LESS_THAN_TEST = new CharLessThanFunction();
		BinaryFunction.CHAR_LESS_THAN_OR_EQUAL_TEST = new CharLessThanOrEqualFunction();
		BinaryFunction.CHAR_GREATER_THAN_TEST = new CharGreaterThanFunction();
		BinaryFunction.CHAR_GREATER_THAN_OR_EQUAL_TEST = new CharGreaterThanOrEqualFunction();
		BinaryFunction.CHAR_E_TEST = new CharEFunction();
		BinaryFunction.CHAR_NE_TEST = new CharNEFunction();
		BinaryFunction.CHAR_L_TEST = new CharLFunction();
		BinaryFunction.CHAR_LE_TEST = new CharLEFunction();
		BinaryFunction.CHAR_G_TEST = new CharGFunction();
		BinaryFunction.CHAR_GE_TEST = new CharGEFunction();
		BinaryFunction.ASSEMBLE_FIXNUMS_TO_INTEGER_BINARY_FUNC = new AssembleFixnumsToIntegerBinaryFunction();
		BinaryFunction.VALUES_BINARY_FUNC = new ValuesBinaryFunction();
		BinaryFunction.DEFINE_BINARY_FUNC = new DefineBinaryFunction();
		BinaryFunction.DEFMACRO_BINARY_FUNC = new DefMacroBinaryFunction();
		BinaryFunction.DEFCONSTANT_BINARY_FUNC = new DefConstantBinaryFunction();
		BinaryFunction.DEFPARAMETER_BINARY_FUNC = new DefParameterBinaryFunction();
		BinaryFunction.DEFVAR_BINARY_FUNC = new DefVarBinaryFunction();
		BinaryFunction.DEFLEXICAL_BINARY_FUNC = new DefLexicalBinaryFunction();
		BinaryFunction.PROGN_BINARY_FUNC = new PrognBinaryFunction();
		BinaryFunction.PIF_BINARY_FUNC = new PifBinaryFunction();
		BinaryFunction.PWHEN_BINARY_FUNC = new PwhenBinaryFunction();
		BinaryFunction.PUNLESS_BINARY_FUNC = new PunlessBinaryFunction();
		BinaryFunction.PCOND_BINARY_FUNC = new PcondBinaryFunction();
		BinaryFunction.PCASE_BINARY_FUNC = new PcaseBinaryFunction();
		BinaryFunction.CSETQ_BINARY_FUNC = new CsetqBinaryFunction();
		BinaryFunction.CSETF_BINARY_FUNC = new CsetfBinaryFunction();
		BinaryFunction.CINC_BINARY_FUNC = new CincBinaryFunction();
		BinaryFunction.CDEC_BINARY_FUNC = new CdecBinaryFunction();
		BinaryFunction.CPUSH_BINARY_FUNC = new CpushBinaryFunction();
		BinaryFunction.CPUSHNEW_BINARY_FUNC = new CpushNewBinaryFunction();
		BinaryFunction.CPOP_BINARY_FUNC = new CpopBinaryFunction();
		BinaryFunction.CLET_BINARY_FUNC = new CletBinaryFunction();
		BinaryFunction.CPROGV_BINARY_FUNC = new CprogvBinaryFunction();
		BinaryFunction.CMULTIPLE_VALUE_BIND_BINARY_FUNC = new CmultipleValuebindBinaryFunction();
		BinaryFunction.MULTIPLE_VALUE_LIST_BINARY_FUNC = new MultipleValueListBinaryFunction();
		BinaryFunction.NTH_VALUE_BINARY_FUNC = new NthValueBinaryFunction();
		BinaryFunction.CDO_BINARY_FUNC = new CdoBinaryFunction();
		BinaryFunction.CDOTIMES_BINARY_FUNC = new CdoTimesBinaryFunction();
		BinaryFunction.CDOLIST_BINARY_FUNC = new CdoListBinaryFunction();
		BinaryFunction.CSOME_BINARY_FUNC = new CsomeBinaryFunction();
		BinaryFunction.CDOHASH_BINARY_FUNC = new CdoHashBinaryFunction();
		BinaryFunction.CDO_SYMBOLS_BINARY_FUNC = new CdoSymbolsBinaryFunction();
		BinaryFunction.CDO_ALL_SYMBOLS_BINARY_FUNC = new CdoAllSymbolsBinaryFunction();
		BinaryFunction.CDO_EXTERNAL_SYMBOLS_BINARY_FUNC = new CdoExternalSymbolsBinaryFunction();
		BinaryFunction.CCATCH_BINARY_FUNC = new CcatchBinaryFunction();
		BinaryFunction.CUNWIND_PROTECT_BINARY_FUNC = new CunwindProtectBinaryFunction();
		BinaryFunction.CTIME_BINARY_FUNC = new CtimeBinaryFunction();
		BinaryFunction.RET_BINARY_FUNC = new RetBinaryFunction();
		BinaryFunction.ENFORCE_TYPE_BINARY_FUNC = new EnforceTypeBinaryFunction();
		BinaryFunction.CHECK_TYPE_BINARY_FUNC = new CheckTypeBinaryFunction();
		BinaryFunction.ENFORCE_MUST_BINARY_FUNC = new EnforceMustBinaryFunction();
		BinaryFunction.MUST_BINARY_FUNC = new MustBinaryFunction();
		BinaryFunction.CAND_BINARY_FUNC = new CandBinaryFunction();
		BinaryFunction.COR_BINARY_FUNC = new CorBinaryFunction();
		BinaryFunction.FIF_BINARY_FUNC = new FifBinaryFunction();
		BinaryFunction.FWHEN_BINARY_FUNC = new FwhenBinaryFunction();
		BinaryFunction.FUNLESS_BINARY_FUNC = new FunlessBinaryFunction();
		BinaryFunction.CVS_ID_BINARY_FUNC = new CvsIdBinaryFunction();
		BinaryFunction.DECLARE_BINARY_FUNC = new DeclareBinaryFunction();
		BinaryFunction.DECLAIM_BINARY_FUNC = new DeclaimBinaryFunction();
		BinaryFunction.QUOTE_BINARY_FUNC = new QuoteBinaryFunction();
		BinaryFunction.FUNCTION_BINARY_FUNC = new FunctionBinaryFunction();
		BinaryFunction.WITH_ERROR_HANDLER_BINARY_FUNC = new WithErrorHandlerBinaryFunction();
		BinaryFunction.WITH_STATIC_AREA_BINARY_FUNC = new WithStaticAreaBinaryFunction();
		BinaryFunction.WITH_THREAD_PRIVATE_AREA_BINARY_FUNC = new WithThreadPrivateAreaBinaryFunction();
		BinaryFunction.WITH_WORKING_AREA_BINARY_FUNC = new WithWorkingAreaBinaryFunction();
		Resourcer.getInstance();
		BinaryFunction.EMPTY_SUBL_OBJECT_ARRAY = Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
	}

	public static void initialize() {
	}

	public static BinaryFunction makeInstance(SubLFunction function) {
		BinaryFunction result = function.getBinaryFunction();
		if (result == null)
			result = new BinaryFunction(function) {

				public SubLObject processItem(SubLObject obj1, SubLObject obj2) {
					SubLObject[] args = null;
					Resourcer resourcer = Resourcer.getInstance();
					try {
						args = resourcer.acquireSubLObjectArray(2);
						args[0] = obj1;
						args[1] = obj2;
						return this.func.funcall(args);
					} finally {
						resourcer.releaseSubLObjectArray(args);
					}
				}
			};
		return result;
	}

	public static BinaryFunction makeInstance(SubLSymbol symbol) {
		return BinaryFunction.makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;

	protected BinaryFunction(SubLFunction func) {
		(this.func = func).setBinaryFunction(this);
	}

	public SubLFunction getFunction() {
		return this.func.getFunc();
	}

	public abstract SubLObject processItem(SubLObject p0, SubLObject p1);
}
