//
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.util.SubLFiles;

public class SubLNil extends AbstractSubLList implements SubLList, SubLSymbol, SubLBoolean {
	public static boolean toBool(SubLObject object) {
		return object != SubLNil.NIL;
	}

	public static String NIL_SYMBOL_NAME = "NIL";
	public static SubLString NIL_SYMBOL_NAME_SUBLSTRING;
	public static SubLNil NIL;
	public static String NIL_TYPE_NAME;
	private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;
	private static List<SubLObject> EMPTY_LIST;
	static {
		NIL_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString("NIL");
		NIL = new SubLNil();
		SubLNil.NIL_TYPE_NAME = "NIL";
		EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
		EMPTY_LIST = Collections.unmodifiableList(new ArrayList<SubLObject>());
	}

	@Override
	public SubLList addItem(SubLObject item) {
		return SubLObjectFactory.makeList(1, item);
	}

	@Override
	public SubLList asArrayList() {
		return this;
	}

	@Override
	public SubLList asConsList() {
		return this;
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't bind NIL.");
	}

	@Override
	public void bind(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't bind NIL.");
	}

	@Override
	public boolean boundp() {
		return true;
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public Object clone() {
		return this;
	}

	@Override
	public SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	@Override
	public SubLObject currentBinding(SubLThread thread) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (startIndex == endIndexExclusive)
			return this;
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this;
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return SubLNil.NIL;
	}

	@Override
	public boolean fboundp() {
		return false;
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject first() {
		return SubLNil.NIL;
	}

	@Override
	public void forceGlobalValue(SubLObject newValue) {
		Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	@Override
	public SubLObject get(int index) {
		return SubLNil.NIL;
	}

	@Override
	public int getBindingId() {
		return Integer.MIN_VALUE;
	}

	@Override
	public SubLObject getDottedElement() {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject getDynamicValue() {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return this;
	}

	@Override
	public SubLObject getDynamicValue(SubLThread thread) {
		return this;
	}

	@Override
	public SubLObject getGlobalValue() {
		return SubLNil.NIL;
	}

	@Override
	public String getName() {
		return "NIL";
	}

	@Override
	public SubLPackage getPackage() {
		return SubLPackage.SUBLISP_PACKAGE;
	}

	@Override
	public SubLList getPlist() {
		Errors.unimplementedMethod("SubLNil.getPlist");
		return null;
	}

	@Override
	public SubLObject getProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.getProperty");
		return null;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return StreamsLow.$terminal_io$.getValue().getStream(true);
	}

	@Override
	public SubLString getSubLName() {
		return SubLNil.NIL_SYMBOL_NAME_SUBLSTRING;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	@Override
	public SubLObject getValue() {
		return SubLNil.NIL;
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		if (otherSeq == this)
			return -3;
		return 0;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isArrayBased() {
		return true;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return true;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isConstantSymbol() {
		return true;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isDynamic() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGlobal() {
		return true;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return true;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return true;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return true;
	}

	@Override
	public boolean isUndeclared() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public SubLObject last(int n) {
		if (n > 1)
			Errors.error("Can't take the last n items of NIL: " + n);
		return SubLNil.NIL;
	}

	@Override
	public SubLObject makeCopy() {
		return this;
	}

	@Override
	public SubLObject makeDeepCopy() {
		return this;
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		int size = newBuf.size();
		ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
		for (int i = 0; i < size; ++i)
			theBuf.add(newBuf.get(i));
		SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
		return result;
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test) {
		return this;
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this;
	}

	@Override
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return otherSeq;
	}

	public int mismatch(SubLSequence seq2, int start1, int end1, int start2, int end2) {
		Errors.unimplementedMethod("SubLNil.mismatch()");
		return -1;
	}

	public SubLObject nth(int index) {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject nthCdr(int index) {
		return SubLNil.NIL;
	}

	@Override
	public SubLObject pop() {
		return Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	@Override
	public SubLCons push(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Can't rebind NIL.");
	}

	@Override
	public void rebind(SubLObject oldValue, SubLThread thread) {
		Errors.error("Can't rebind NIL.");
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		if (start != 0)
			Errors.error("Invalid start argument " + start);
		else if (end != Integer.MAX_VALUE && start != end)
			Errors.error("Invalid end argument " + end);
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return SubLNil.NIL;
	}

	@Override
	public void removeProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.removeProperty");
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int count) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public SubLObject rest() {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		return SubLNil.NIL;
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return -2;
	}

	@Override
	public void set(int index, SubLObject item) {
		Errors.error("Nil is immutable.");
	}

	@Override
	public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
	}

	@Override
	public void setConstantValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public SubLObject setDottedElement(SubLObject dottedElement) {
		return Errors.error("NIL is immutable.");
	}

	@Override
	public void setDynamicValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't change the value of NIL.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't change the value of NIL.");
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	@Override
	public void setFunction(SubLOperator func) {
		Errors.error("Can't define a method for NIL.");
	}

	@Override
	public void setGlobalValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public void setPackage(SubLPackage thePackage) {
		Errors.error("Can't set package on NIL.");
	}

	@Override
	public void setProperty(SubLObject indicator, SubLObject value) {
		Errors.unimplementedMethod("SubLNil.setProperty");
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	@Override
	public void setValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public int size(int max) {
		return 0;
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return SubLNil.NIL;
	}

	@Override
	public Object[] toArray() {
		return SubLNil.EMPTY_LIST.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return a;
	}

	@Override
	public boolean toBoolean() {
		return false;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputBinaryStream();
	}

	@Override
	public SubLInputStream toInputStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputStream();
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputTextStream();
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputBinaryStream();
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputTextStream();
	}

	@Override
	public String toString() {
		return "NIL";
	}

	@Override
	public SubLObject[] toSubLObjectArray() {
		return SubLNil.EMPTY_SUBL_OBJECT_ARRAY;
	}

	@Override
	public SubLSymbol toSymbol() {
		return this;
	}

	@Override
	public String toTypeName() {
		return SubLNil.NIL_TYPE_NAME;
	}
}
