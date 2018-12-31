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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public  class SubLArrayList extends AbstractSubLList implements SubLCons, SubLList {
  //// Constructors
  /* WARNING: never use this without putting something in it
     @todo eliminate this empty constructor */
  SubLArrayList() {
    this.theList = new ArrayList<SubLObject>();
  }
  SubLArrayList(int capacity) {
    this.theList = new ArrayList<SubLObject>(capacity);
  }
  SubLArrayList(int capacity, SubLObject defaultObject) {
    this.theList = new ArrayList<SubLObject>(capacity);
    for (int i = 0; i < capacity; i++) {
      theList.add(defaultObject);
    }
  }
  SubLArrayList(SubLObject first, SubLObject rest) {
    this.theList = new ArrayList<SubLObject>();
    theList.add(first);
    setRest(rest);
  }
  /** Creates a new instance of SubLList. */
  SubLArrayList(ArrayList<SubLObject> theList, boolean reuseArray) {
    if (reuseArray) {
      this.theList = theList;
    } else {
      this.theList = (ArrayList<SubLObject>)theList.clone();
    }
  }
  //// Public Area
  // SubLObject methods
  public Object clone() {
    return makeCopy();
  }
  public SubLObject makeCopy() {
    Object[] newItems = theList.toArray();
    ArrayList<SubLObject> newArrayList = new ArrayList(Arrays.asList(newItems));
    SubLList newList = SubLObjectFactory.makeList_Dangerous(newArrayList);
    //newList.rootList = rootList; @todo this should go away
    newList.setDottedElement(dottedElement);
    return newList;
  }
  public SubLObject makeDeepCopy() {
    Errors.unimplementedMethod("SubLArrayList.makeDeepCopy()");
    return null;
  }
  public SubLList member(SubLObject item, BinaryFunction test) {
    SubLObject currentItem = null;
    SubLList result = SubLNil.NIL;
    SubLListListIterator iter = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter = resourcer.acquireSubLListListIterator(this);
      for (int i = 0; iter.hasNext(); i++) {
        currentItem = iter.nextSubLObject();
        if (SubLNil.NIL != test.processItem(item, currentItem)) {
          result = iter.previousSubSeq().toList();
          break;
        }
      }
    } finally {
      resourcer.releaseSubLListListIterator(iter);
    }
    return result;
  }
  public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
    if (key == IDENTITY_UNARY_FUNC) {
      return member(item, test);
    }
    SubLObject currentItem = null;
    SubLList result = SubLNil.NIL;
    SubLListListIterator iter = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter = resourcer.acquireSubLListListIterator(this);
      for (int i = 0; iter.hasNext(); i++) {
        currentItem = iter.nextSubLObject();
        if (SubLNil.NIL != test.processItem(item, key.processItem(currentItem))) {
          result = iter.previousSubSeq().toList();
          break;
        }
      }
    } finally {
      resourcer.releaseSubLListListIterator(iter);
    }
    return result;
  }
  // SubLList methods
  public SubLObject first() {
    if (theList.size() == 0) {
      new Exception().printStackTrace();
    }
    return (SubLObject)theList.get(0);
  }
  public SubLObject rest() {
    if (size() == 1) { return getDottedElement(); }
    return makeNthCdr(1);
  }
  public SubLObject last(int n) {
    if (n < 0) { 
      Errors.error("Got bad value to function 'last': " + n);
    }
    if (n == 0) {
      return getDottedElement();
    }
    return nthCdr(size() - n);
  }
  public SubLObject setDottedElement(SubLObject dottedElement) {
    if (dottedElement.isCons()) {
      SubLListListIterator iter = null;
      Resourcer resourcer = Resourcer.getInstance();
      try {
        iter = resourcer.acquireSubLListListIterator(dottedElement.toList());
        while (iter.hasNext() && (!iter.isNextImproperElement())) {
          addItem(iter.next());
        }
        if (iter.isNextImproperElement()) {
          this.dottedElement = iter.getDottedElement();
        }
      } finally {
        resourcer.releaseSubLListListIterator(iter);
      }
    } else {
      this.dottedElement = dottedElement;
    }
    return this;
  }
  public SubLObject getDottedElement() {
    return dottedElement;
  }

  /**
   * Returns the number of elements in this list.  If this list contains
   * more than <tt>Integer.MAX_VALUE</tt> elements, returns
   * <tt>Integer.MAX_VALUE</tt>.
   *
   * @return the number of elements in this list.
   */
  public int size() { return theList.size(); }
  /**
   * Returns <tt>true</tt> if this list contains no elements.
   *
   * @return <tt>true</tt> if this list contains no elements.
   */
  public boolean isEmpty() { 
    return size() <= 0; 
  }
  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence.  Obeys the general contract of the
   * <tt>Collection.toArray</tt> method.
   *
   * @return an array containing all of the elements in this list in proper
   *	       sequence.
   * @see Arrays#asList(Object[])
   */
  public Object[] toArray() {
    if (getDottedElement() != SubLNil.NIL) {
      Errors.error("Unable to convert inproper lists to arrays: " + this);
    }
    return theList.toArray();
  }
  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence; the runtime type of the returned array is that of the
   * specified array.  Obeys the general contract of the
   * <tt>Collection.toArray(Object[])</tt> method.
   *
   * @param a the array into which the elements of this list are to
   *		be stored, if it is big enough; otherwise, a new array of the
   * 		same runtime type is allocated for this purpose.
   * @return  an array containing the elements of this list.
   *
   * @throws ArrayStoreException if the runtime type of the specified array
   * 		  is not a supertype of the runtime type of every element in
   * 		  this list.
   * @throws NullPointerException if the specified array is <tt>null</tt>.
   */
  public Object[] toArray(Object a[]) {
    if (getDottedElement() != SubLNil.NIL) {
      Errors.error("Unable to convert inproper lists to arrays: " + this);
    }
    return theList.toArray(a);
  }
  /**
   * Removes all of the elements from this list (optional operation).  This
   * list will be empty after this call returns (unless it throws an
   * exception).
   *
   * @throws UnsupportedOperationException if the <tt>clear</tt> method is
   * 		  not supported by this list.
   */
  public void clear() { theList.clear(); }
  // Positional Access Operations
  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of element to return.
   * @return the element at the specified position in this list.
   *
   * @throws IndexOutOfBoundsException if the index is out of range (index
   * 		  &lt; 0 || index &gt;= size()).
   */
  public SubLObject get(int index) { return (SubLObject)theList.get(index); }
  public SubLList addItem(SubLObject item) {
    theList.add(item);
    return this;
  }
  /**
   * Replaces the element at the specified position in this list with the
   * specified element (optional operation).
   *
   * @param index index of element to replace.
   * @param element element to be stored at the specified position.
   * @return the element previously at the specified position.
   *
   * @throws UnsupportedOperationException if the <tt>set</tt> method is not
   *		  supported by this list.
   * @throws    ClassCastException if the class of the specified element
   * 		  prevents it from being added to this list.
   * @throws    NullPointerException if the specified element is null and
   *            this list does not support null elements.
   * @throws    IllegalArgumentException if some aspect of the specified
   *		  element prevents it from being added to this list.
   * @throws    IndexOutOfBoundsException if the index is out of range
   *		  (index &lt; 0 || index &gt;= size()).
   */
  public void set(int index, SubLObject element) {
    if (element == null) {
      throw new InvalidSubLExpressionException("Invalid attempt to add an invalid item to a LIST: " + element);
    }
    theList.set(index, element);
  }
  public SubLObject[] toSubLObjectArray() {
    if (!isProper()) {
      Errors.error("Can't convert an inproper list to array.");
    }
    return (SubLObject[])theList.toArray(new SubLObject[size()]);
  }
  // Utilities
  public SubLObject nth(int index) {
    if (index < 0 ) { Errors.error("Got invalid index to nth: " + index); }
    int size = size();
    SubLObject dottedElement = getDottedElement();
    if (index == size) {
      if (!dottedElement.isList()) {
        Errors.error("Unable to find element " + index + " in list: " + this);
      }
      return dottedElement.toList().first();
    } else if (index > size) {
      if (dottedElement == SubLNil.NIL) { return SubLNil.NIL; }
      Errors.error("Unable to find element " + index + " in list: " + this);
    }
    return (SubLObject)theList.get(index);
  }
  public SubLObject nthCdr(int index) {
    return Errors.error("This shouldn't be possible.");
    /*if (index == 0) { return this; }
    if (index < 0) {
      throw new InvalidSubLExpressionException("Got invalid nthcdr index: " + index);
    }
    SubLObject dottedElement = getDottedElement();
    int size = size();
    if (index == size()) {
      return dottedElement;
    }
    if (index > size) {
      if (dottedElement == SubLNil.NIL) { return SubLNil.NIL; }
      throw new InvalidSubLExpressionException("Unable to take the cdr of: " + dottedElement);
    }
    return makeNthCdr(index);*/
  }
  public int listLength() {
    Errors.unimplementedMethod("listLength");
    return -1;
  }
  public int consLength() {
    return size();
  }
  public SubLList lastCons() {
    return Errors.unimplementedMethod("lastCons").toList();
  }
  public SubLList append(SubLList list, boolean isReverse) {
    return Errors.unimplementedMethod("append").toList();
  }
  public SubLList copyList() {
    return makeCopy().toList();
  }
  public SubLList copyTree() {
    return Errors.unimplementedMethod("copyTree").toList();
  }
  public SubLList treeEqual(SubLList tree1, SubLList tree2) {
    return Errors.unimplementedMethod("treeEqual").toList();
  }
  public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
    return Errors.unimplementedMethod("treeEqual").toList();
  }
  public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
    return Errors.unimplementedMethod("concatenate").toList();
  }
  public SubLCons push(SubLObject item) {
    add(0, item);
    return this;
  }
  public SubLCons pushNew(SubLObject item) {
    if (positionOf(item) < 0) {
      return push(item);
    }
    return this;
  }
  public SubLCons pushNew(SubLObject item, BinaryFunction test) {
    if (positionOf(item, test) < 0) {
      return push(item);
    }
    return this;
  }
  public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
    if (positionOf(item, test, key) < 0) {
      return push(item);
    }
    return this;
  }
  public SubLObject pop() {
    SubLObject result = (SubLObject)remove(0);
    return this;
  }
  public SubLList allElementsButLast(int howMany, boolean isDestructive) {
    return Errors.unimplementedMethod("allElementsButLast").toList();
  }
  public SubLList listPrefix(SubLList postFix) {
    return Errors.unimplementedMethod("listPrefix").toList();
  }
  
  // sustitutions
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
    return Errors.unimplementedMethod("substituteFromAList").toList();
  }
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
    return Errors.unimplementedMethod("substituteFromAList").toList();
  }
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("substituteFromAList").toList();
  }
  
  // as sets
  public SubLList memberIf(BinaryFunction test) {
    return Errors.unimplementedMethod("memberIf").toList();
  }
  public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("memberIf").toList();
  }
  public boolean isSubList(SubLList sublist) {
    Errors.unimplementedMethod("isSubList");
    return false;
  }
  public SubLList adjoin(SubLObject item) {
    return Errors.unimplementedMethod("adjoin").toList();
  }
  public SubLList adjoin(SubLObject item, BinaryFunction test) {
    return Errors.unimplementedMethod("adjoin").toList();
  }
  public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("adjoin").toList();
  }
  public SubLList union(SubLList item, boolean isDestructive) {
    return Errors.unimplementedMethod("union").toList();
  }
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
    return Errors.unimplementedMethod("union").toList();
  }
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("union").toList();
  }
  public SubLList intersection(SubLList item, boolean isDestructive) {
    return Errors.unimplementedMethod("intersection").toList();
  }
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
    return Errors.unimplementedMethod("intersection").toList();
  }
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("intersection").toList();
  }
  public SubLList setDifference(SubLList item, boolean isDestructive) {
    return Errors.unimplementedMethod("setDifference").toList();
  }
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
    return Errors.unimplementedMethod("setDifference").toList();
  }
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("setDifference").toList();
  }
  public SubLList setXor(SubLList item, boolean isDestructive) {
    return Errors.unimplementedMethod("setXor").toList();
  }
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
    return Errors.unimplementedMethod("setXor").toList();
  }
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    return Errors.unimplementedMethod("setXor").toList();
  }
  public boolean isSubSet(SubLList list) {
    Errors.unimplementedMethod("isSubSet");
    return false;
  }
  public boolean isProper() {
    return (getDottedElement() == SubLNil.NIL);
  }
  // destructive modification primitives
  
  public SubLCons setNth(SubLObject item,  int index) {
    set(index, item);
    return this;
  }
  public SubLCons setFirst(SubLObject first) {
    if (size() == 0) {
      theList.add(first);
      return this;
    }
    setNth(first, 0);
    return this;
  }
  public SubLCons setRest(SubLObject rest) {
    try {
      if (size() > 1) {
        SubLObject first = first();
        theList.clear();
        theList.add(first);
      }
      if (!rest.isCons()) {
        setDottedElement(rest);
      } else {
        SubLCons cons = rest.toCons();
        setDottedElement(cons.getDottedElement());
        for (int i = 0, size = cons.size(); i < size; i++) {
          theList.add(cons.get(i));
        }
      }
      return this;
    } catch (Exception e) {
      return Errors.error("Error making cons.", e).toCons();
    }
  }
  public SubLSequence sort(boolean isDestructive, BinaryFunction pred,
    UnaryFunction key) {
    if (!isProper()) {
      Errors.error("Can't sort improper list.");
    }
    if (this.size() == 1) {
      if (isDestructive) {
        return this;
      } else {
        return makeCopy().toSeq();
      }
    }
    Object[] seq = toArray();
    if (key == IDENTITY_UNARY_FUNC) {
      Arrays.sort(seq, new ComparatorIdentityKey<Object>(pred));  //@todo get rid of new
    } else {
      Arrays.sort(seq, new ComparatorGenericKey<Object>(pred, key));  //@todo get rid of new
    }
    if (isDestructive) {
      theList = new ArrayList(Arrays.asList(seq));
      //@todo maintain cdr list!!!! -APB
      return this;
    } else {
      return SubLObjectFactory.makeList(seq);
    }
  }
  public SubLSequence subSeq(int start, int end) {
    return subSeq(this, start, end);
  }
  public SubLSequence reverse(boolean isDestructive) {
    return reverse(this, isDestructive);
  }
  public SubLSequence concatenate(SubLObject[] sequences) {
    return concatenate(this, sequences);
  }
  public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return positionOf(this, item, test, key, start, end);
  }
  public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return positionOfIf(this, test, key, start, end);
  }
  public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return find(this, item, test, key, start, end);
  }
  public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return findIf(this, test, key, start, end);
  }
  public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
    SubLSequence result = replace(this, seq, start1, end1, start2, end2);
    return isEmpty() ? SubLNil.NIL : result;
  }
  public SubLSequence fill(SubLObject item, int start, int end) {
    return fill(this, item, start, end);
  }
  public SubLSequence removeDuplicates(boolean isDestructive, 
      BinaryFunction test, UnaryFunction key, int start, int end) {
    SubLSequence result = removeDuplicates(this, isDestructive, test, key, start, end);
    return isEmpty() ? SubLNil.NIL : result;
  }
  public SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
    SubLSequence result = removeDuplicatesFast(this, test, start, end);
    return isEmpty() ? SubLNil.NIL : result;
  }
  public SubLSequence remove(SubLObject item, boolean isDestructive,
      BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    SubLSequence result = remove(this, item, isDestructive, test, key, start, end, count);
    return isEmpty() ? SubLNil.NIL : result;
  }
  public SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
      UnaryFunction key, int start, int end, int count) {
    SubLSequence result = removeIf(this, test, isDestructive, key, start, end, count);
    return isEmpty() ? SubLNil.NIL : result;
  }
  public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
    return reduce(this, func, start, end, initialValue);
  }
  public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
      BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    return substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
  }
  public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive,
      UnaryFunction key, int start, int end, int count) {
    return substituteIf(this, newItem, test, isDestructive, key, start, end, count);
  }
  public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return count(this, item, test, key, start, end);
  }
  public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return countIf(this, test, key, start, end);
  }
  public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
      UnaryFunction key, int start1, int end1, int start2, int end2) {
    return indexOfMismatch(this, otherSeq, test, key, start1, start2, end1, end2);
  }
  public int search(SubLSequence otherSeq, BinaryFunction test,
      UnaryFunction key, int start1, int end1, int start2, int end2) {
    return search(this, otherSeq, test, key, start1, start2, end1, end2);
  }
 
  //// Protected Area
  //// Private Area
  private SubLObject makeNthCdr(int n) {
    return Errors.error("This shouldn't be possible.");
    /*if (n == 0) { return this; };
    if (rootList != null) {
      return rootList.makeNthCdr(n + rootList.cdrs.indexOf(this));
    }
    SubLObject cdr = null;
    if ((cdrs != null) && (cdrs.size()) > n) {
      cdr  = (SubLObject)cdrs.get(n);
      if (cdr != null) { return cdr; }
    } else {
      if (cdrs == null) { cdrs = new ArrayList(size()); }
      while (cdrs.size() <= n) { cdrs.add(null); }
    }
    cdr = (SubLObject)subList(n, size());
    cdrs.set(n, cdr);
    return cdr;*/
  }
  public SubLSequence delete(int startIndex, int endIndexExclusive) {
    if ((endIndexExclusive - startIndex) == 1) {
      theList.remove(startIndex);
    } else {
      theList.subList(startIndex, endIndexExclusive).clear();
    }
    if (theList.size() == 0) { return SubLNil.NIL; }
    return this;
  }
  public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
    int size = newBuf.size();
    ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
    for (int i = 0; i < size; i++) {
      theBuf.add((SubLObject)newBuf.get(i));
    }
    SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
    return result;
  }
  public SubLList asConsList() { 
    SubLObject curCdr = getDottedElement();
    SubLObject curCar = null;
    for (int i = size() - 1; i >= 0; i--) {
      curCar = get(i);
      curCdr = new SubLConsPair(curCar, curCdr);
    }
    return curCdr.toList(); 
  }
  public SubLList asArrayList() { 
    return this; 
  }
  public boolean isArrayBased() { 
    return true; 
  }
  public boolean canFastHash() {
    return false;
  }
  public SubLSymbol getType(){ 
    return Types.$dtp_cons$;
  }
  public SubLFixnum getTypeCode() {
    return CommonSymbols.FOUR_INTEGER;
  }
  /** Method created to avoid casting */
  public SubLCons toCons() { // SubLCons
    return this;
  }
  public boolean isNil() { return false; }
  public boolean isBoolean() { return false; }
  public boolean isSymbol() { return false; }
  public boolean isKeyword() { return false; }
  public boolean isAtom() { return false; }
  public boolean isCons() { return true; }
  public boolean isList() { return true; }
  public boolean isSequence() { return true; }
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
  public boolean isFunction() { return false; }
  public boolean isFunctionSpec() { return false; }
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
  //// Internal Rep
  private List<SubLObject> theList;
  private SubLObject dottedElement = SubLNil.NIL;
  //private SubLArrayList rootList = null; // @todo adios this
  //protected ArrayList cdrs; // @todo adios this
}

