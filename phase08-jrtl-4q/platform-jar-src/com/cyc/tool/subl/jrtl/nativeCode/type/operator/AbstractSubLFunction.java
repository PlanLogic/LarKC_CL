//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLFunction extends AbstractSubLOperator implements SubLFunction, CommonSymbols {
	public static String FUNCTION_TYPE_NAME;

	static {
		AbstractSubLFunction.FUNCTION_TYPE_NAME = "FUNCTION";
	}

	protected int requiredArgCount;
	protected int optionalArgCount;
	protected boolean allowsRest;
	private ZeroArityFunction zeroArityFunction;
	private UnaryFunction unaryFunction;
	private BinaryFunction binaryFunction;
	private TernaryFunction ternaryFunction;
	private QuataryFunction quaternaryFunction;
	private QuintaryFunction quintaryFunction;

	AbstractSubLFunction(SubLSymbol functionSymbol) {
		super(functionSymbol);
	}

	AbstractSubLFunction(SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount, boolean allowsRest) {
		super(functionSymbol);
		assert requiredArgCount >= 0;
		assert optionalArgCount >= 0;
		this.requiredArgCount = requiredArgCount;
		this.optionalArgCount = optionalArgCount;
		this.allowsRest = allowsRest;
	}

	public boolean allowsRest() {
		return this.allowsRest;
	}

	public SubLObject apply(SubLCons arg1, SubLEnvironment env) {
		return Functions.funcall(this, arg1, env);
	}

	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
		int actualArity = form.rest().size();
		if (form.rest().last(0) != CommonSymbols.NIL)
			Errors.error(
					"Invalid attempt to dynamically evaluate an expression conatiaining an improper list: " + form);
		SubLObject curArg = form;
		if (actualArity < 6)
			switch (actualArity) {
			case 0:
				return Functions.funcall(this);
			case 1:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env));
			case 2:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env));
			case 3:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env));
			case 4:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env));
			case 5:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env));
			}
		else {
			Resourcer resourcer = Resourcer.getInstance();
			SubLObject[] args = null;
			try {
				args = resourcer.acquireSubLObjectArray(actualArity);
				for (int i = 0, size = args.length; i < size; ++i)
					args[i] = (curArg = curArg.rest()).first().eval(env);
				return Functions.funcall(this, args);
			} finally {
				resourcer.releaseObjectArray(args);
			}
		}
		return null;
	}

	public SubLObject funcall(SubLObject[] incomingArgs) {
		Object[] evaluatedArgs = null;
		SubLObject[] evaluatedRestArgs = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			int actualArity = incomingArgs.length;
			int applyArity = this.applyArity();
			boolean allowsRest = this.allowsRest();
			if (actualArity < this.getRequiredArgCount())
				Errors.error(this + " called with too few arguments: " + incomingArgs);
			if (actualArity > applyArity && !allowsRest)
				Errors.error(this + " called with too many arguments: " + incomingArgs);
			evaluatedArgs = resourcer.acquireObjectArray(applyArity + (allowsRest ? 1 : 0));
			evaluatedRestArgs = resourcer.acquireSubLObjectArray(actualArity - applyArity);
			int i = 0;
			int argIndex = 0;
			int restArgIndex = 0;
			while (i < actualArity) {
				if (i < applyArity)
					evaluatedArgs[argIndex++] = incomingArgs[i];
				else
					evaluatedRestArgs[restArgIndex++] = incomingArgs[i];
				++i;
			}
			while (argIndex < applyArity) {
				evaluatedArgs[argIndex] = CommonSymbols.UNPROVIDED;
				++argIndex;
			}
			if (allowsRest)
				evaluatedArgs[argIndex] = evaluatedRestArgs;
			return this.apply(evaluatedArgs);
		} finally {
			resourcer.releaseObjectArray(evaluatedArgs);
			resourcer.releaseSubLObjectArray(evaluatedRestArgs);
		}
	}

	public BinaryFunction getBinaryFunction() {
		if (this.binaryFunction == null)
			this.binaryFunction = FixedArityFunctor.makeInstanceDirect(2, BinaryFunction.class, this);
		return this.binaryFunction;
	}

	public SubLFunction getFunc() {
		return this;
	}

	public int getOptionalArgCount() {
		return this.optionalArgCount;
	}

	public QuataryFunction getQuataryFunction() {
		if (this.quaternaryFunction == null)
			this.quaternaryFunction = FixedArityFunctor.makeInstanceDirect(4, QuataryFunction.class, this);
		return this.quaternaryFunction;
	}

	public QuintaryFunction getQuintaryFunction() {
		if (this.quintaryFunction == null)
			this.quintaryFunction = FixedArityFunctor.makeInstanceDirect(5, QuintaryFunction.class, this);
		return this.quintaryFunction;
	}

	public int getRequiredArgCount() {
		return this.requiredArgCount;
	}

	public TernaryFunction getTernaryFunction() {
		if (this.ternaryFunction == null)
			return this.ternaryFunction = FixedArityFunctor.makeInstanceDirect(3, TernaryFunction.class, this);
		return this.ternaryFunction;
	}

	public SubLSymbol getType() {
		return Types.$dtp_function$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.FIVE_INTEGER;
	}

	public UnaryFunction getUnaryFunction() {
		if (this.unaryFunction == null)
			this.unaryFunction = FixedArityFunctor.makeInstanceDirect(1, UnaryFunction.class, this);
		return this.unaryFunction;
	}

	public ZeroArityFunction getZeroArityFunction() {
		if (this.zeroArityFunction == null)
			this.zeroArityFunction = FixedArityFunctor.makeInstanceDirect(0, ZeroArityFunction.class, this);
		return this.zeroArityFunction;
	}

	public void setBinaryFunction(BinaryFunction f) {
		this.binaryFunction = f;
	}

	public void setQuataryFunction(QuataryFunction f) {
		this.quaternaryFunction = f;
	}

	public void setQuintaryFunction(QuintaryFunction f) {
		this.quintaryFunction = f;
	}

	public void setTernaryFunction(TernaryFunction f) {
		this.ternaryFunction = f;
	}

	public void setUnaryFunction(UnaryFunction f) {
		this.unaryFunction = f;
	}

	public void setZeroArityFunction(ZeroArityFunction f) {
		this.zeroArityFunction = f;
	}

	public String toString() {
		SubLSymbol functionSymbol = this.getFunctionSymbol();
		if (functionSymbol != null)
			return "#<Function " + functionSymbol + ">";
		return super.toString();
	}

	public String toTypeName() {
		return AbstractSubLFunction.FUNCTION_TYPE_NAME;
	}
}
