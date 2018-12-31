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
	public static String NIL_SYMBOL_NAME = "NIL";

	public static SubLString NIL_SYMBOL_NAME_SUBLSTRING;
	public static SubLNil NIL;
	public static String NIL_TYPE_NAME;
	private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;
	private static List<SubLObject> EMPTY_LIST;
	static {
		SubLNil.NIL_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString("NIL");
		SubLNil.NIL = new SubLNil();
		SubLNil.NIL_TYPE_NAME = "NIL";
		SubLNil.EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
		SubLNil.EMPTY_LIST = Collections.unmodifiableList(new ArrayList<SubLObject>());
	}

	public static boolean toBool(SubLObject object) {
		return object != SubLNil.NIL;
	}

	public SubLList addItem(SubLObject item) {
		return SubLObjectFactory.makeList(1, item);
	}

	public SubLList asArrayList() {
		return this;
	}

	public SubLList asConsList() {
		return this;
	}

	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't bind NIL.");
	}

	public void bind(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't bind NIL.");
	}

	public boolean boundp() {
		return true;
	}

	public boolean canFastHash() {
		return true;
	}

	public Object clone() {
		return this;
	}

	public SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	public SubLObject currentBinding(SubLObject[] bindings) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	public SubLObject currentBinding(SubLThread thread) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (startIndex == endIndexExclusive)
			return this;
		return Errors.error("NIL is immutable.").toSeq();
	}

	public boolean equals(Object obj) {
		return obj == this;
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return SubLNil.NIL;
	}

	public boolean fboundp() {
		return false;
	}

	public SubLSequence fill(SubLObject item, int start, int end) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return SubLNil.NIL;
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return SubLNil.NIL;
	}

	public SubLObject first() {
		return SubLNil.NIL;
	}

	public void forceGlobalValue(SubLObject newValue) {
		Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	public SubLObject get(int index) {
		return SubLNil.NIL;
	}

	public int getBindingId() {
		return Integer.MIN_VALUE;
	}

	public SubLObject getDottedElement() {
		return SubLNil.NIL;
	}

	public SubLObject getDynamicValue() {
		return SubLNil.NIL;
	}

	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return this;
	}

	public SubLObject getDynamicValue(SubLThread thread) {
		return this;
	}

	public SubLObject getGlobalValue() {
		return SubLNil.NIL;
	}

	public String getName() {
		return "NIL";
	}

	public SubLPackage getPackage() {
		return SubLPackage.SUBLISP_PACKAGE;
	}

	public SubLList getPlist() {
		Errors.unimplementedMethod("SubLNil.getPlist");
		return null;
	}

	public SubLObject getProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.getProperty");
		return null;
	}

	public SubLStream getStream(boolean followSynonymStream) {
		return StreamsLow.$terminal_io$.getValue().getStream(true);
	}

	public SubLString getSubLName() {
		return SubLNil.NIL_SYMBOL_NAME_SUBLSTRING;
	}

	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	public SubLObject getValue() {
		return SubLNil.NIL;
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		if (otherSeq == this)
			return -3;
		return 0;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isArrayBased() {
		return true;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return true;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isConstantSymbol() {
		return true;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isDynamic() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGlobal() {
		return true;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return true;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return true;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return true;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return true;
	}

	public boolean isUndeclared() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject last(int n) {
		if (n > 1)
			Errors.error("Can't take the last n items of NIL: " + n);
		return SubLNil.NIL;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		int size = newBuf.size();
		ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
		for (int i = 0; i < size; ++i)
			theBuf.add(newBuf.get(i));
		SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
		return result;
	}

	public SubLList member(SubLObject item, BinaryFunction test) {
		return this;
	}

	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this;
	}

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

	public SubLObject nthCdr(int index) {
		return SubLNil.NIL;
	}

	public SubLObject pop() {
		return Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	public SubLCons push(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	public SubLCons pushNew(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Can't rebind NIL.");
	}

	public void rebind(SubLObject oldValue, SubLThread thread) {
		Errors.error("Can't rebind NIL.");
	}

	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return SubLNil.NIL;
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		if (start != 0)
			Errors.error("Invalid start argument " + start);
		else if (end != Integer.MAX_VALUE && start != end)
			Errors.error("Invalid end argument " + end);
		return SubLNil.NIL;
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return SubLNil.NIL;
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return SubLNil.NIL;
	}

	public void removeProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.removeProperty");
	}

	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int count) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	public SubLObject rest() {
		return SubLNil.NIL;
	}

	public SubLSequence reverse(boolean isDestructive) {
		return SubLNil.NIL;
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return -2;
	}

	public void set(int index, SubLObject item) {
		Errors.error("Nil is immutable.");
	}

	public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
	}

	public void setConstantValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	public SubLObject setDottedElement(SubLObject dottedElement) {
		return Errors.error("NIL is immutable.");
	}

	public void setDynamicValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't change the value of NIL.");
	}

	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't change the value of NIL.");
	}

	public SubLCons setFirst(SubLObject first) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	public void setFunction(SubLOperator func) {
		Errors.error("Can't define a method for NIL.");
	}

	public void setGlobalValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	public void setPackage(SubLPackage thePackage) {
		Errors.error("Can't set package on NIL.");
	}

	public void setProperty(SubLObject indicator, SubLObject value) {
		Errors.unimplementedMethod("SubLNil.setProperty");
	}

	public SubLCons setRest(SubLObject rest) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	public void setValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	public int size() {
		return 0;
	}

	public int size(int max) {
		return 0;
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		return SubLNil.NIL;
	}

	public SubLSequence subSeq(int start, int end) {
		return SubLNil.NIL;
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return SubLNil.NIL;
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return SubLNil.NIL;
	}

	public Object[] toArray() {
		return SubLNil.EMPTY_LIST.toArray();
	}

	public Object[] toArray(Object[] a) {
		return a;
	}

	public boolean toBoolean() {
		return false;
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputBinaryStream();
	}

	public SubLInputStream toInputStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputStream();
	}

	public SubLInputTextStream toInputTextStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputTextStream();
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputBinaryStream();
	}

	public SubLOutputStream toOutputStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputStream();
	}

	public SubLOutputTextStream toOutputTextStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputTextStream();
	}

	public String toString() {
		return "NIL";
	}

	public SubLObject[] toSubLObjectArray() {
		return SubLNil.EMPTY_SUBL_OBJECT_ARRAY;
	}

	public SubLSymbol toSymbol() {
		return this;
	}

	public String toTypeName() {
		return SubLNil.NIL_TYPE_NAME;
	}
}
