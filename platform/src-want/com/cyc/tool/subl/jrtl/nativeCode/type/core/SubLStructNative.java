//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.Field;
import java.util.Hashtable;

import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Layout;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Symbol;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct {

	public static class JavaObjectStructDecl extends SubLStructDecl {
		public JavaObjectStructDecl(Class structClass, SubLSymbol structName, SubLSymbol testFunction,
				SubLSymbol[] slotNames, SubLSymbol[] slotKeywordNames, String[] actualFieldNames,
				SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol printFunction, SubLSymbol hashFunction,
				boolean isInterned) {
			super(structName, getterNames, setterNames, slotKeywordNames, printFunction, hashFunction, testFunction,
					isInterned);
			this.structClass = structClass;
			declaredFieldNameToFieldHash = new Hashtable();
			this.actualFieldNames = actualFieldNames;
			int size = actualFieldNames.length;
			fieldDecls = new Field[size];
			try {
				for (int i = 0; i < size; ++i)
					fieldDecls[i] = structClass.getDeclaredField(this.actualFieldNames[i]);
			} catch (Exception e) {
				Errors.error("Got invalid struct field declaration.", e);
			}
			structNameStr = structName.getName();
		}

		@Override
		public int getFieldCount()
		{
			return fieldDecls.length;
		}

//		public JavaObjectStructDecl(Class klazz, String symbolName) {
//			this((Class) klazz, SubLSymbolFactory.makeSymbol(symbolName),
//					SubLObjectFactory.makeSymbol(symbolName + "-P"),
//					ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("SUID"),
//							(SubLObject) SubLObjectFactory.makeSymbol("NAME")),
//					ConsesLow.list((SubLObject) SubLObjectFactory.makeKeyword("SUID"),
//							(SubLObject) SubLObjectFactory.makeKeyword("NAME")),
//					new String[] { "$suid", "$name" },
//					ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("C-SUID"),
//							(SubLObject) SubLObjectFactory.makeSymbol("C-NAME")),
//					ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("_CSETF-C-SUID"),
//							(SubLObject) SubLObjectFactory.makeSymbol("_CSETF-C-NAME")),
//					SubLObjectFactory.makeSymbol("PRINT-" + symbolName));
//			// symbolName = symbolName.toUpperCase();
//			// this.klazz = klazz;
//			structNameStr = symbolName;
//		}

		private Field[] fieldDecls;
		private Class structClass;
		private String[] actualFieldNames;
		private Hashtable declaredFieldNameToFieldHash;

		public Field getFieldDecl(int i) {
			return fieldDecls[i];
		}

		public void setFieldFromName(SubLSymbol declaredFieldName, SubLObject value) {
			Field field = (Field) declaredFieldNameToFieldHash.get(declaredFieldName);
			if (field == null)
				Errors.error("Can't find field: " + declaredFieldName + " on object: " + this + ".");
			try {
				field.set(this, value);
			} catch (Exception e) {
				Errors.error("Unable to set field on: " + this + ".", e);
			}
		}

		final String structNameStr;

		public final class $_print_function_trampoline$BinaryFunction extends BinaryFunction {
			public $_print_function_trampoline$BinaryFunction() {
				super(SubLTranslatedFile.extractFunctionNamed(structNameStr + "-PRINT-FUNCTION-TRAMPOLINE"));
			}

			public SubLObject processItem(final SubLObject v_object, final SubLObject stream) {
				compatibility.default_struct_print_function(v_object, stream, (SubLObject) ZERO_INTEGER);
				return (SubLObject) NIL;
			}
		}

		public final class $_p$UnaryFunction extends UnaryFunction {
			public $_p$UnaryFunction() {
				super(SubLTranslatedFile.extractFunctionNamed(structNameStr + "-P"));
			}

			public SubLObject processItem(final SubLObject arg1) {
				final Object o = getObject(arg1);
				return structClass.isInstance(o) ? T : NIL;
			}
		}

		public final class $sxhash__method$UnaryFunction extends UnaryFunction {
			public $sxhash__method$UnaryFunction() {
				super(SubLTranslatedFile.extractFunctionNamed("SXHASH-" + structNameStr + "-METHOD"));
			}

			public SubLObject processItem(final SubLObject arg1) {
				final Object o = getObject(arg1);
				return Fixnum.getInstance(o.hashCode());
			}
		}

		public Object getObject(SubLObject arg1) {
			return ((LispObject) arg1).javaInstance();
		}

	}

	protected SubLStructNative() {
	}

	@Override
	public void setSlots(LispObject[] tempSlots) {
		SubLStructDecl structDecl = getStructDecl();
		int fieldCount = structDecl.getFieldCount();
		LispObject[] slots = new LispObject[fieldCount];
		int slotNumber = 0;
		for (int i = 2; i < fieldCount; i++, slotNumber++)
			setField(i, slots[slotNumber]);

	}

	@Override
	public int getFieldCount()
	{
		return getStructDecl().getFieldCount();
	}

	@Override
	public LispObject[] getSlots() {
		Errors.warn("SublStructNative.getSlots()");
		SubLStructDecl structDecl = getStructDecl();
		int fieldCount = structDecl.getFieldCount();
		LispObject[] slots = new LispObject[fieldCount];
		int slotNumber = 0;
		for (int i = 2; i < fieldCount; i++, slotNumber++)
			slots[slotNumber] = (LispObject) getField(i);
		return slots;
	}

	public String printObjectImpl() {
		try {
			return print_high.princ_to_string(this).getStringValue();
		} catch (Throwable e) {
			if (false)
				return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
			return "#<" + typeOf() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
		}
	}

	protected SubLStructNative(SubLObject initValues) {
		if (initValues == null || initValues == SubLNil.NIL || initValues == CommonSymbols.UNPROVIDED)
			return;
		SubLObject next = SubLNil.NIL;
		SubLStructDeclNative structDecl = (SubLStructDeclNative) getStructDecl();
		for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next)) {
			SubLObject currentField = ConsesLow.car(next);
			SubLObject currentValue = conses_high.cadr(next);
			structDecl.setFieldFromName(currentField.toSymbol(), currentValue);
		}
	}

	@Override
	public int hashCode(int currentDepth) {
		return Sxhash.sxhash(this).intValue();
	}

	@Override
	public boolean canFastHash() {
		SubLStructDecl structDecl = getStructDecl();
		return structDecl != null && structDecl.isInterned;
	}

	@Override
	public void clear() {
		SubLStructDecl structDecl = getStructDecl();
		for (int size = structDecl.getFieldCount(), i = 0; i < size; ++i)
			this.setField(i, SubLNil.NIL);
	}

	@Override
	public SubLObject getField(int fieldNum) {
		if (fieldNum == 0)
			return SubLNumberFactory.makeInteger(getFieldCount());
		if (fieldNum == 1)
			return getName();
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try {
			return (SubLObject) field.get(this);
		} catch (IllegalAccessException iae) {
			return Errors.error("Unable to set table value", iae);
		}
	}

	@Override
	public LispObject classOf() {
		Symbol name = (Symbol) typeOf();
		// The proper name of a class is "a symbol that names the class whose
		// name is that symbol".
		if (name != NIL && name != UNBOUND_VALUE) {
			// TYPE-OF.9
			final LispObject c2 = LispClass.findClass(name, false);
			if (c2 != null) {
				return c2;
			}

		}
		// TODO Auto-generated method stub
		if (true)
			Errors.unimplementedMethod("Auto-generated method stub:  SubLStructInterpreted.classOf");
		return null;
	}

	@Override
	public Layout updateLayout() {
		// TODO Auto-generated method stub
		if (true)
			Errors.unimplementedMethod("Auto-generated method stub:  StandardObject.updateLayout");
		return null;
	}

	@Override
	public LispObject typeOf() {
		return (LispObject) getName();
	}

	@Override
	public SubLObject getField0() {
		return SubLNumberFactory.makeInteger(getFieldCount());
	}

	@Override
	public SubLObject getField1() {
		return getName();
	}

	@Override
	public SubLSymbol getName() {
		return getStructDecl().getStructName();
	}

	@Override
	public boolean isStructure() {
		return true;
	}

	@Override
	public void setField(int fieldNum, SubLObject value) {
		if (fieldNum == 0)
			Errors.unimplementedMethod("SublStructNative.setField(0)");
		if (fieldNum == 1)
			Errors.unimplementedMethod("SublStructNative.setField(1)");
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try {
			field.set(this, value);
		} catch (IllegalAccessException iae) {
			Errors.error("Unable to set table value", iae);
		}

		fieldNum += 2;

		if (fieldNum == getFieldCount()) {
			PrologSync.checkReady(this);
		}
	}

	@Override
	public SubLObject setField0(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField0()");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject setField1(SubLObject newVal) {
		Errors.unimplementedMethod("SublStructNative.setField1()");
		return SubLNil.NIL;
	}

	@Override
	public void setName(SubLSymbol name) {
		getStructDecl().setStructName(name);
	}

	public boolean structures_bag_p() {
		return true;
	}

	@Override
	abstract public SubLStructDecl getStructDecl();
}
