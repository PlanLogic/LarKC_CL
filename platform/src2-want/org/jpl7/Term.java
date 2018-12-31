package org.jpl7;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.jpl7.fli.DoubleHolder;
import org.jpl7.fli.Int64Holder;
import org.jpl7.fli.IntHolder;
import org.jpl7.fli.Prolog;
import org.jpl7.fli.StringHolder;
import org.jpl7.fli.term_t;

/**
 * Term is the abstract base class for Compound, Atom, Variable, Integer and
 * Float, which comprise a Java-oriented concrete syntax for Prolog. You cannot
 * create instances of Term directly; rather, you should create instances of
 * Term's concrete subclasses. Alternatively, use textToTerm() to construct a
 * Term from its conventional Prolog source text representation.
 *
 * <hr>
 * Copyright (C) 2004 Paul Singleton
 * <p>
 * Copyright (C) 1998 Fred Dushin
 * <p>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * <ol>
 * <li>Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * <li>Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * </ol>
 *
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * <hr>
 *
 * @author Fred Dushin <fadushin@syr.edu>
 * @version $Revision$
 */
abstract public class Term {

	//abstract public Object tag;

	abstract public Object toJavaObject();

	abstract public String toString();

	/**
	 * returns the i-th (1+) argument of a Term; defined only for Compound (and
	 * hence Atom); throws a JPLException for other Term subclasses
	 *
	 * @return the i-th argument of a (Compound) Term
	 */
	abstract public Term arg(int i); // overridden in Compound

	/**
	 * returns, as a Term[], the arguments of a Compound returns an empty Term[]
	 * from an Atom, Integer or Float throws a JPLException from a Variable
	 *
	 * @return the arguments of a Compound as a Term[
	 */
	abstract public Term[] args(); // overridden in Compound

	//abstract public String atomType(); // overridden in Atom

	/**
	 * Tests whether this Term's functor has (String) 'name' and 'arity' Returns
	 * false if called inappropriately
	 *
	 * @return whether this Term's functor has (String) 'name' and 'arity'
	 */
	abstract public boolean hasFunctor(String name, int arity); // overridden in Compound

	/**
	 * Tests whether this Term's functor has (int) 'name' and 'arity' Returns
	 * false if called inappropriately
	 *
	 * @return whether this Term's functor has (int) 'name' and 'arity'
	 */
	///abstract public boolean hasFunctor(int value, int arity);

	/**
	 * Tests whether this Term's functor has (double) 'name' and 'arity' Returns
	 * false if called inappropriately
	 *
	 * @return whether this Term's functor has (double) 'name' and 'arity'
	 */
	//abstract public boolean hasFunctor(double value, int arity);

	/**
	 * returns, as a String, the name of a Compound, Atom or Variable throws a
	 * JPLException from an Integer or Float
	 *
	 * @return the name of a Compound, Atom or Variable
	 */
	abstract public String name(); // overridden in Compound, Variable
	// throw new JPLException("name() is undefined for " +
	// this.prologTypeName());
	// };

	/**
	 * returns, as an int, the arity of a Compound, Atom, Integer or Float;
	 * throws a JPLException from a Variable
	 *
	 * @return the arity of a Compound, Atom, Integer or Float
	 */
	abstract public int arity(); // overridden in Compound, Variable

	/**
	 * returns the value (as an int) of an Integer or Float throws a
	 * JPLException from a Compound, Atom or Variable
	 *
	 * @return the value (as an int) of an Integer or Float
	 */
	abstract public int intValue();

	/**
	 * returns the value (as a long) of an Integer or Float throws a
	 * JPLException from a Compound, Atom or Variable
	 *
	 * @return the value (as a long) of an Integer or Float
	 */
	abstract public long longValue();

	/**
	 * returns the value (as a float) of an Integer or Float throws a
	 * JPLException from a Compound, Atom or Variable
	 *
	 * @return the value (as a float) of an Integer or Float
	 */
	abstract public float floatValue();

	/**
	 * returns the value (as a java.math.BigInteger) of an Integer; throws a
	 * JPLException from a Compound, Atom, Float or Variable
	 *
	 * @return the value (as a java.math.BigInteger) of an Integer; throws a
	 *         JPLException from a Compound, Atom, Float or Variable
	 */
	abstract public BigInteger bigIntegerValue();

	/**
	 * returns the value (as a double) of an Integer or Float throws a
	 * JPLException from any other subclass
	 *
	 * @return the value (as an double) of an Integer or Float
	 */
	abstract public double doubleValue();

	/**
	 * returns the type of this term, as one of org.jpl7.fli.Prolog.COMPOUND,
	 * .ATOM, .VARIABLE, .INTEGER, .FLOAT etc
	 *
	 * @return the type of this term, as one of org.jpl7.fli.Prolog.COMPOUND,
	 *         .ATOM, .VARIABLE, .INTEGER, .FLOAT etc
	 */
	abstract public int prologType();

	/**
	 * returns the name of the type of this term, as one of "Compound", "Atom",
	 * "Variable", "Integer", "Float" etc
	 *
	 * @return the name of the type of this term, as one of "Compound", "Atom",
	 *         "Variable", "Integer", "Float" etc
	 */
	abstract public String prologTypeName();

	/**
	 * whether this Term is an Atom (of some kind)
	 *
	 * @return whether this Term is an Atom (of some kind)
	 */
	abstract public boolean isAtom();

	/**
	 * whether this Term is an Integer whose value is too big to represent as a
	 * long
	 *
	 * @return whether this Term is an Integer whose value is too big to
	 *         represent as a long
	 */
	abstract public boolean isBigInteger();

	/**
	 * whether this Term represents a compound term
	 *
	 * @return whether this Term represents a compound atom
	 */
	abstract public boolean isCompound();

	/**
	 * whether this Term represents a float
	 *
	 * @return whether this Term represents a float
	 */
	abstract public boolean isFloat();

	/**
	 * whether this Term represents an integer
	 *
	 * @return whether this Term represents an integer
	 */
	abstract public boolean isInteger();

	/**
	 * whether this Term is a variable
	 *
	 * @return whether this Term is a variable
	 */
	abstract public boolean isVariable();

	/**
	 * whether this Term denotes (syntax-specifically) an empty list
	 *
	 * @return whether this Term denotes (syntax-specifically) an empty list
	 */
	abstract public boolean isListNil();

	/**
	 * whether this Term denotes (syntax-specifically) a list pair
	 *
	 * @return whether this Term denotes (syntax-specifically) a list pair
	 */
	abstract public boolean isListPair();

	/**
	 * whether this Term is a 'jfalse' structure, i.e. @(false)
	 *
	 * @return whether this Term is a 'jfalse' structure, i.e. @(false)
	 */
	abstract public boolean isJFalse();

	/**
	 * whether this Term is a 'jnull' structure, i.e. @(null)
	 *
	 * @return whether this Term is a 'jnull' structure, i.e. @(null)
	 */
	abstract public boolean isJNull();

	/**
	 * whether this Term is a 'jobject' structure, i.e. @(Tag)
	 *
	 * @return whether this Term is a 'jobject' structure, i.e. @(Tag)
	 */
	abstract public boolean isJObject();

	/**
	 * whether this Term is a 'jref' structure, i.e. @(Tag) or @(null)
	 *
	 * @return whether this Term is a 'jref' structure, i.e. @(Tag) or @(null)
	 */
	abstract public boolean isJRef(); // overridden in Compound, where it might sometimes
								// be true

	/**
	 * whether this Term is a 'jtrue' structure, i.e. @(true)
	 *
	 * @return whether this Term is a 'jtrue' structure, i.e. @(true)
	 */
	abstract public boolean isJTrue(); // overridden in Compound, where it might
								// sometimes be true

	/**
	 * whether this Term is a 'jvoid' structure, i.e. @(void)
	 *
	 * @return whether this Term is a 'jvoid' structure, i.e. @(void)
	 */
	abstract public boolean isJVoid(); // overridden in Compound, where it might
								// sometimes be true

	// abstract public Object jrefToObject();
	abstract public Object jrefToObject();

	/**
	 * the length of this list, iff it is one, else an exception is thrown
	 *
	 * @throws JPLException
	 * @return the length (as an int) of this list, iff it is one
	 */
	abstract public int listLength();

	/**
	 * returns an array of terms which are the successive members of this list,
	 * if it is a list, else throws an exception
	 *
	 * @throws JPLException
	 * @return an array of terms which are the successive members of this list,
	 *         if it is a list
	 */
	abstract public Term[] toTermArray();

	// /**
	// * Returns a debug-friendly representation of a Term
	// *
	// * @return a debug-friendly representation of a Term
	// * @deprecated
	// */
	// abstract public String debugString();

	// /**
	// * Returns a debug-friendly representation of a list of Terms
	// *
	// * @return a debug-friendly representation of a list of Terms
	// * @deprecated
	// */
	// abstract public static String debugString(Term arg[]) {
	// String s = "[";
	// for (int i = 0; i < arg.length; ++i) {
	// s += arg[i].debugString();
	// if (i != arg.length - 1) {
	// s += ", ";
	// }
	// }
	// return s + "]";
	// }

	// ==================================================================/
	// Converting JPL Terms to Prolog terms
	//
	// To convert a Term to a term_t, we need to traverse the Term
	// structure and build a corresponding Prolog term_t object.
	// There are some issues:
	//
	// - Prolog term_ts rely on the *consecutive* nature of term_t
	// references. In particular, to build a compound structure
	// in the Prolog FLI, one must *first* determine the arity of the
	// compound, create a *sequence* of term_t references, and then
	// put atoms, functors, etc. into those term references. We
	// do this in these methods by first determining the arity of the
	// Compound, and then by "put"-ing a type into a term_t.
	// The "put" method is implemented differently in each of Term's
	// five subclasses.
	//
	// - What if we are trying to make a term_t from a Term, but the
	// Term has several same-named Variables? We want
	// to ensure that one Prolog variable will be created and shared, or else
	// queries will give incorrect answers. We thus pass a Map
	// (var_table) through these methods. The table contains term_t
	// instances, keyed on Variable names.
	// ==================================================================/

	abstract public void put(term_t term);

	/**
	 * Cache the reference to the Prolog term_t here.
	 *
	 * @param varnames_to_vars
	 *            A Map from variable names to JPL Variables.
	 * @param term
	 *            A (previously created) term_t which is to be put with a Prolog
	 *            term-type appropriate to the Term type (e.g., Atom, Variable,
	 *            Compound, etc.) on which the method is invoked.)
	 */
	abstract void put(Map<String, term_t> varnames_to_vars, term_t term);

	/**
	 * This method calls from_term_t on each term in the n consecutive term_ts.
	 * A temporary term_t "holder" (byref) structure must be created in order to
	 * extract type information from the Prolog engine.
	 *
	 * @param vars_to_Vars
	 *            A Map from Prolog variables to org.jpl7.Variable instances
	 * @param n
	 *            The number of consecutive term_ts
	 * @param term0
	 *            The 0th term_t (structure); subsequent term_ts are not
	 *            structures.
	 * @return An array of converted Terms
	 */
	/*
	 * protected static Term[] from_term_ts(Map vars_to_Vars, int n, term_t
	 * term0) {
	 *
	 * // create an (uninitialised) array of n Term references Term[] terms =
	 * new Term[n];
	 *
	 * // for each term_t (from 0...n-1), create a term_t // (temporary)
	 * structure and dispatch the translation // to a Term to the static
	 * from_term_t method of the Term // class. This will perform (Prolog) type
	 * analysis on the // term_t and call the appropriate static method to
	 * create // a Term of the right type (e.g., Atom, Variable, List, etc.) //
	 * long ith_term_t = term0.value; for (int i = 0; i < n; ++i, ++ith_term_t)
	 * { term_t term = new term_t(); term.value = ith_term_t;
	 *
	 * terms[i] = Term.from_term_t(vars_to_Vars, term); }
	 *
	 * return terms; }
	 */

	/**
	 * create and return a org.jpl7.Term representation of the given Prolog term
	 *
	 * @param vars_to_Vars
	 *            A Map from Prolog variables to org.jpl7.Variable instances
	 * @param term
	 *            The Prolog term (in a term_t holder) to convert
	 * @return The converted Term subclass instance.
	 */
	// ==================================================================/
	// Computing Substitutions
	//
	// Once a solution has been found, the Prolog term_t references
	// will have been instantiated and will refer to new terms. To compute
	// a substitution, we traverse the (original) Term structure, looking
	// at the term_t reference in the Term. The only case we really care
	// about is if the (original) Term is a Variable; if so, the term_t
	// back in the Prolog engine may be instantiated (non Variable parts
	// of the original Term cannot change or become uninstantiated). In
	// this case, we can store this term in a Map, keyed by the
	// Variable with which the term was unified.
	// ==================================================================/

	/**
	 * This method computes a substitution from a Term. The bindings Map stores
	 * Terms, keyed by names of Variables. Thus, a substitution is as it is in
	 * mathematical logic, a sequence of the form \sigma = {t_0/x_0, ...,
	 * t_n/x_n}. Once the substitution is computed, the substitution should
	 * satisfy
	 *
	 * \sigma T = t
	 *
	 * where T is the Term from which the substitution is computed, and t is the
	 * term_t which results from the Prolog query.
	 * <p>
	 *
	 * A second Map, vars, is required; this table holds the Variables that
	 * occur (thus far) in the unified term. The Variable instances in this
	 * table are guaranteed to be unique and are keyed on Strings which are
	 * Prolog internal representations of the variables.
	 *
	 * @param bindings
	 *            table holding Term substitutions, keyed on names of Variables.
	 * @param vars
	 *            A Map holding the Variables that occur thus far in the term;
	 *            keyed by internal (Prolog) string rep.
	 */
	abstract public void getSubst(Map<String, Term> varnames_to_Terms, Map<term_t, Variable> vars_to_Vars); // overridden
																							// in
																							// Compound,
																							// Variable

	abstract public Term putParams(Term[] args);

	abstract public Term putParams1(IntHolder next, Term[] ps);

	abstract public Object getTag();
	abstract public void setTag(Object obj);

}
