package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface ISubLInchworm{
	 
  SubLObject eval(SubLEnvironment env) 
  throws InvalidSubLExpressionException;
  
  boolean eql(SubLObject obj);
  boolean equal(SubLObject obj);
  boolean equalp(SubLObject obj);
  
  int hashCode(int currentDepth);
  
  String toTypeName();
  
  boolean canFastHash();
  
  int superHash();
  
  void checkType(SubLSymbol predicate) throws SubLException;
  void enforceType(SubLSymbol predicate) throws SubLException;
  void checkTypeInternal(SubLSymbol predicate) throws SubLException;
  void enforceTypeInternal(SubLSymbol predicate) throws SubLException;
  
  SubLSymbol getType();
  SubLFixnum getTypeCode();
  
  Object clone();
  SubLObject makeCopy();
  SubLObject makeDeepCopy();
  
  /** Functions created to avoid casting */
  int getNumSize();
  SubLObject inc();
  SubLObject dec();
  SubLObject add(SubLObject num);
  SubLObject sub(SubLObject num);
  SubLObject mult(SubLObject num);
  SubLObject currentBinding(SubLObject[] bindings);
  void bind(SubLObject newValue, SubLObject[] bindings);
  void rebind(SubLObject oldValue, SubLObject[] bindings);
  SubLObject getHT(SubLObject obj); // SubLHashTable
  SubLObject put(SubLObject key, SubLObject value); // SubLHashTable
  SubLObject removeHT(SubLObject obj); // SubLHashTable
  boolean hasKey(SubLObject obj); // SubLKeyhash
  void addKey(SubLObject key); // SubLKeyhash
  boolean remKey(SubLObject obj); // SubLKeyhash
  int size(); // SubLSequence
  SubLObject get(int index); // SubLSequence
  SubLCharacter getCharacter(int index); // SubLString
  void set(int index, SubLObject val); // SubLSequence
  SubLSequence reverse(boolean isDestructive); // SubLSequence
  boolean numL(SubLObject x); // SubLNumber
  boolean numLE(SubLObject x); // SubLNumber
  boolean numG(SubLObject x); // SubLNumber
  boolean numGE(SubLObject x); // SubLNumber
  boolean numE(SubLObject x); // SubLNumber
  boolean isPositive(); // SubLNumber
  boolean isNegative(); // SubLNumber
  boolean isZero(); // SubLNumber
  int intValue(); // SubLNumber
  long longValue(); // SubLNumber
  double doubleValue(); // SubLNumber
  BigInteger bigIntegerValue(); // SubLNumber
  SubLObject rest(); // SubLList
  SubLObject first(); // SubLList
  SubLCons setFirst(SubLObject first); // SubLList
  SubLCons setRest(SubLObject rest); // SubLList
  SubLList asConsList(); // SubLList
  SubLList asArrayList(); // SubLList
  boolean isArrayBased(); // SubLList
  SubLObject last(int i); // SubLList
  SubLObject nthCdr(int index); // SubLList
  String getString(); // SubLString
  SubLObject getField(int fieldNum); // SubLStruct
  void setField(int fieldNum, SubLObject value); // SubLStruct
  SubLStream getStream(boolean followSynonymStream); // SubLStream
  SubLInputStream toInputStream(); // SubLStream
  SubLInputTextStream toInputTextStream(); // SubLStream
  SubLInputBinaryStream toInputBinaryStream(); // SubLStream
  SubLOutputStream toOutputStream(); // SubLStream
  SubLOutputTextStream toOutputTextStream(); // SubLStream
  SubLOutputBinaryStream toOutputBinaryStream(); // SubLStream
  SubLFunction getFunc(); // SubLFunction
  SubLPackage toPackage(); // SubLPackage
  SubLStruct toStruct(); // SubLPackage
  SubLVector toVect(); // SubLPackage
  SubLSymbol toSymbol(); //SubLSymbol
  SubLList toList(); //SubLList
  SubLSequence toSeq(); //SubLSequence
  SubLCharacter toChar(); // SubLCharacter
  SubLGuid toGuid(); // SubLGuid
  SubLSemaphore toSemaphore(); // SubLSemaphore
  SubLString toStr(); // SubLString
  SubLMacro toMacro(); // SubLMacro
  SubLEnvironment toEnv(); // SubLEnvironment
  SubLCons toCons(); // SubLCons
  SubLNumber toNumber(); // SubLNumber
  SubLProcess toProcess(); // SubLProcess
  SubLLock toLock(); // SubLLock
  SubLReadWriteLock toReadWriteLock(); // SubLReadWriteLock
  SubLInteger toInteger(); // SubLInteger
  SubLFixnum toFixnum(); // SubLInteger
  SubLDoubleFloat toDouble(); //SubLDoubleFloat
  SubLHashtable toHashtable(); //SubLHashtable
  SubLHashtableIterator toHashtableIterator(); //SubLHashtableIterator
  SubLKeyhash toKeyhash(); //SubLKeyhash
  SubLKeyhashIterator toKeyhashIterator(); //SubLKeyhashIterator
  SubLRegexPattern toRegexPattern(); //SubLRegexPattern
  String getFileDesignator(); 
  char charValue(); // SubLCharacter
  SubLObject second();
  SubLObject third();
  SubLObject fourth();
  SubLObject fifth();
  SubLObject sixth();
  SubLObject seventh();
  SubLObject eighth();
  SubLObject ninth();
  SubLObject tenth();
  SubLObject getField0();  //struct
  SubLObject setField0(SubLObject newVal);  //struct
  SubLObject getField1();  //struct
  SubLObject setField1(SubLObject newVal);  //struct
  SubLObject getField2();  //struct
  SubLObject setField2(SubLObject newVal);  //struct
  SubLObject getField3();  //struct
  SubLObject setField3(SubLObject newVal);  //struct
  SubLObject getField4();  //struct
  SubLObject setField4(SubLObject newVal);  //struct
  SubLObject getField5();  //struct
  SubLObject setField5(SubLObject newVal);  //struct
  SubLObject getField6();  //struct
  SubLObject setField6(SubLObject newVal);  //struct
  SubLObject getField7();  //struct
  SubLObject setField7(SubLObject newVal);  //struct
  SubLObject getField8();  //struct
  SubLObject setField8(SubLObject newVal);  //struct
  SubLObject getField9();  //struct
  SubLObject setField9(SubLObject newVal);  //struct
  SubLObject getField10();  //struct
  SubLObject setField10(SubLObject newVal);  //struct
  SubLObject getField11();  //struct
  SubLObject setField11(SubLObject newVal);  //struct
  SubLObject getField12();  //struct
  SubLObject setField12(SubLObject newVal);  //struct
  SubLObject getField13();  //struct
  SubLObject setField13(SubLObject newVal);  //struct
  SubLObject getField14();  //struct
  SubLObject setField14(SubLObject newVal);  //struct
  SubLObject getField15();  //struct
  SubLObject setField15(SubLObject newVal);  //struct
  SubLObject getField16();  //struct
  SubLObject setField16(SubLObject newVal);  //struct
  SubLObject getField17();  //struct
  SubLObject setField17(SubLObject newVal);  //struct
  SubLObject getField18();  //struct
  SubLObject setField18(SubLObject newVal);  //struct
  SubLObject getField19();  //struct
  SubLObject setField19(SubLObject newVal);  //struct
  SubLObject getField20();  //struct
  SubLObject setField20(SubLObject newVal);  //struct
  
  boolean isNil();
  boolean isBoolean();
  boolean isSymbol();
  boolean isKeyword();
  boolean isAtom();
  boolean isCons();
  boolean isList();
  boolean isSequence();
  boolean isNumber();
  boolean isFixnum();
  boolean isBignum();
  boolean isIntBignum();
  boolean isLongBignum();
  boolean isBigIntegerBignum();
  boolean isInteger();
  boolean isDouble();
  boolean isChar();
  boolean isString();
  boolean isVector();
  boolean isFunction();
  boolean isFunctionSpec();
  boolean isMacroOperator();
  boolean isHashtable();
  boolean isProcess();
  boolean isLock();
  boolean isReadWriteLock();
  boolean isStructure();
  boolean isStream();
  boolean isPackage();
  boolean isError();
  boolean isGuid();
  boolean isSemaphore();
  boolean isEnvironment();
  boolean isHashtableIterator();
  boolean isRegexPattern();
  boolean isKeyhash();
  boolean isKeyhashIterator();
  
  
  //@ todo this should be a symbol and looked up dynamically??? --APB
//  public static boolean DO_CHECK_TYPES = false;
//  public static boolean DO_PARANOID_TYPE_CHECKING = false;
//  
//  
//  public static int MAX_HASH_LENGTH = 8;
//  public static int MAX_HASH_DEPTH = 8;
//  public static int DEFAULT_EXCEEDED_HASH_VALUE = 0;

}
