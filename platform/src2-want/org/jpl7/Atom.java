package org.jpl7;

import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.jpl7.fli.Prolog;
import org.jpl7.fli.StringHolder;
import org.jpl7.fli.term_t;

/**
 * Atom is a specialised Compound with zero arguments, representing a Prolog
 * atom with the same name. An Atom is constructed with a String parameter (its
 * name, unquoted), which cannot thereafter be changed.
 *
 * <pre>
 * Atom a = new Atom(&quot;hello&quot;);
 * </pre>
 *
 * An Atom can be used (and re-used) as an argument of Compound Terms. Two Atom
 * instances are equal (by equals()) iff they have equal names.
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
 * @see org.jpl7.Term
 * @see org.jpl7.Compound
 */
public class Atom extends StringHolder { // was extends Compound

	/**
	 * the name of this Compound
	 */
	// protected final String name;

	// protected final
	private String type; // should this be private?

	@Override
	public Object toJavaObject() {

		if (type.equals("string"))
			return name();
		if (value.equals("[]"))
			return Lisp.NIL;
		if (value.equals("T"))
			return Lisp.T;
		return this;// name();
	}

	/**
	 * @param name
	 *            the Atom's name (unquoted)
	 */
	public Atom(String name) {
		// if (name == null) {
		// throw new JPLException("cannot construct with null name");
		// } else {
		this.value = name;
		this.type = "text";
		// }
	}

	public Atom(String name, String type) {
		// if (name == null) {
		// throw new JPLException("cannot construct with null name");
		// } else if (type == null) {
		// throw new JPLException("cannot construct with null type");
		// } else {
		this.value = name;
		this.type = type;
		// }
	}

	/**
	 * the (zero) arguments of an Atom, as a (zero-length) Term[]
	 *
	 * @return the (zero) arguments of an Atom, as a (zero-length) Term[]
	 */
	public Term[] args() {
		return new Term[] {};
	}

	// public final String atomType() {
	// return this.type;
	// }

	/**
	 * Two Atoms are equal if they are identical (same object) or their
	 * respective names and blobTypes are equal
	 *
	 * @param obj
	 *            the Object to compare (not necessarily another Atom)
	 * @return true if the Object satisfies the above condition
	 */
	public boolean equals(Object obj) {
		return (this == obj
				|| obj instanceof Atom && value.equals(((Atom) obj).value) && type.equals(((Atom) obj).type));
	}

	/**
	 * Tests whether this Compound's functor has (String) 'name' and 'arity'.
	 *
	 * @return whether this Compound's functor has (String) 'name' and 'arity'
	 */
	public boolean hasFunctor(String name, int arity) {
		return name.equals(this.value) && arity == 0;
	}

	/**
	 * whether this Term denotes (syntax-specifically) an empty list
	 */
	public boolean isListNil() {
		return this.equals(JPL.LIST_NIL);
	}

	/**
	 * the name (unquoted) of this Compound
	 *
	 * @return the name (unquoted) of this Compound
	 */
	public String name() {
		return value;
	}

	/**
	 * To put an Atom in a term, we create a sequence of term_t references from
	 * the Term.terms_to_term_ts() method, and then use the
	 * Prolog.cons_functor_v() method to create a Prolog compound term.
	 *
	 * @param varnames_to_vars
	 *            A Map from variable names to Prolog variables
	 * @param term
	 *            A (previously created) term_t which is to be set to a Prolog
	 *            term corresponding to the Term subtype (Atom, Variable,
	 *            Compound, etc.) on which the method is invoked.
	 */
	public void put(Map<String, term_t> varnames_to_vars, term_t term) {
		if (this.equals(JPL.LIST_NIL)) {
			Prolog.put_nil(term);
		} else {
			Term[] args = new Term[] {};
			Prolog.cons_functor_v(term, Prolog.new_functor(Prolog.new_atom(value), args.length),
					ATerm.putTerms(varnames_to_vars, args));
		}
	}

	/**
	 * an Atom's name is quoted if it is not a simple identifier.
	 *
	 * @return string representation of an Atom
	 */
	public String toString() {
		String value = this.value;
		value = value.replace("\\", "\\\\"); //
		value = value.replace("\n", "\\\n");
		value = value.replace("\r", "\\\r");
		value = value.replace("\t", "\\\t");

		if ("string".equals(type))
			return "\"" + value.replace("\"", "\\\"") + "\"";

		return (JPL.isSimpleName(value) ? value : "'" + value.replace("'", "\\'") + "'");
	}

	/**
	 * returns the type of this term, as "Prolog.ATOM"
	 *
	 * @return the type of this term, as "Prolog.ATOM"
	 */
	public int prologType() {
		return Prolog.ATOM;
	}

	/**
	 * returns the name of the type of this term, as "Atom"
	 *
	 * @return the name of the type of this term, as "Atom"
	 */
	public String prologTypeName() { // overrides same in jpl.Term
		return type;//atomType();
	}

}
