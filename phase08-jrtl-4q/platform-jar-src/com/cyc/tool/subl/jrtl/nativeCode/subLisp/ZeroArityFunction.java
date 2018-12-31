//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class ZeroArityFunction extends FixedArityFunctor implements CommonSymbols {
	private static class NConcZeroArityFunction extends ZeroArityFunction {
		public NConcZeroArityFunction() {
			super(CommonSymbols.NCONC.getFunc());
		}

		public SubLObject processItem() {
			return CommonSymbols.NIL;
		}
	}

	private static class VectorZeroArityFunction extends ZeroArityFunction {
		public VectorZeroArityFunction() {
			super(CommonSymbols.VECTOR.getFunc());
		}

		public SubLObject processItem() {
			return Vectors.vector(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		}
	}

	public static ZeroArityFunction NCONC_ZERO_ARITY_FUNC;

	public static ZeroArityFunction VECTOR_ZERO_ARITY_FUNC;

	static {
		ZeroArityFunction.NCONC_ZERO_ARITY_FUNC = new NConcZeroArityFunction();
		ZeroArityFunction.VECTOR_ZERO_ARITY_FUNC = new VectorZeroArityFunction();
	}

	public static void initialize() {
	}

	public static ZeroArityFunction makeInstance(SubLFunction function) {
		ZeroArityFunction result = function.getZeroArityFunction();
		if (result == null)
			result = new ZeroArityFunction(function) {

				public SubLObject processItem() {
					return this.func.funcall(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
				}
			};
		return result;
	}

	public static ZeroArityFunction makeInstance(SubLSymbol symbol) {
		return ZeroArityFunction.makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;

	protected ZeroArityFunction(SubLFunction func) {
		(this.func = func).setZeroArityFunction(this);
	}

	public SubLFunction getFunction() {
		return this.func;
	}

	public abstract SubLObject processItem();
}
