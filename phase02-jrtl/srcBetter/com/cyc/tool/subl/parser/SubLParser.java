/* Generated By:JavaCC: Do not edit this line. SubLParser.java */
package com.cyc.tool.subl.parser;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLQuote;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

/**
 * <P>
 * This class implements a parser for the SubL grammar. This file was
 * automatically generated with javacc based on the file: "subl.jj". The SubL
 * parser files can be regenerated by calling: /opt/local/pkg/JavaCC/bin/javacc
 * subl.jj JavaCC 3.2 was used in the creation of the source files.
 *
 * Note: SubL supports these built-in Common Lisp datatypes: Numbers (fixnum,
 * double), Symbols, Lists, Vector, Character, Strings, Hashtables, Stream,
 * Function, Packages(limited support: ), Structures SubL does not support these
 * Common Lisp datatypes: Readtables, Multi-dimensional arrays, Pathnames,
 * Random-states, Lambda-Expressions or Closures
 *
 * @version $Id: SubLParser.java 127267 2009-02-26 22:38:02Z tbrussea $
 * @author Tony Brusseau
 *
 *         <p>
 *         Copyright 2005-6 Cycorp, Inc., use controled by license terms only.
 */
public class SubLParser implements CommonSymbols, SubLParserConstants {

	/**
	 * The parser program.
	 *
	 * @param args
	 *            currently ignored.
	 */
	public static void main(String[] args) {
		SubLParser parser = new SubLParser(System.in);
		try {
			parser.termList(true, true);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private String currentPackage = "SUBLISP";

	public SubLParserTokenManager token_source;

	ASCII_CharStream jj_input_stream;

	public Token token, jj_nt;

	private int jj_ntk;

	private int jj_gen;

	private int[] jj_la1 = new int[26];

	private int[] jj_la1_0 = { 0x6e0067ea, 0x2000000, 0x47c0, 0x2000000, 0x2000000, 0x2000000, 0x2000000, 0x2000000,
			0x2000000, 0x47c0, 0x6e00202a, 0x2000000, 0x800, 0x2000000, 0x2000000, 0x6e002008, 0x0, 0xc000000,
			0x6c000000, 0x8, 0x8, 0x8, 0x2008, 0x0, 0x2000000, 0x2000000, };

	private int[] jj_la1_1 = { 0x4c06, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x0, 0x4c06, 0x0, 0x0, 0x0, 0x0, 0x4c06,
			0x4800, 0x0, 0x0, 0x0, 0x0, 0x0, 0x4800, 0x6, 0x0, 0x0, };

	private java.util.Vector<int[]> jj_expentries = new java.util.Vector<int[]>();

	private int[] jj_expentry;

	private int jj_kind = -1;

	public SubLParser(java.io.InputStream stream) {
		this.jj_input_stream = new ASCII_CharStream(stream, 1, 1);
		this.token_source = new SubLParserTokenManager(this.jj_input_stream);
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public SubLParser(java.io.Reader stream) {
		this.jj_input_stream = new ASCII_CharStream(stream, 1, 1);
		this.token_source = new SubLParserTokenManager(this.jj_input_stream);
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public SubLParser(SubLParserTokenManager tm) {
		this.token_source = tm;
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public SubLObject atom(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLObject atom;
		this.eatWhiteSpace(eatInitialWS);
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case WS:
		case NAMED_CHARACTER:
		case CHARACTER:
			atom = this.character(false, false);
			break;
		case STRING:
			atom = this.string(false, false);
			break;
		case FLOAT1:
		case FLOAT2:
		case DECIMAL_INTEGER:
		case BASED_INTEGER:
			atom = this.number(false, false);
			break;
		case PACKAGE_SEPARATOR:
		case UNINTERNED_SYMBOL_PREFIX:
		case CASE_SENSITIVE_SUBL_SYMBOL_NAME:
		case SUBL_SYMBOL_NAME:
			atom = this.symbol(false, false);
			break;
		default:
			this.jj_la1[15] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		this.eof(requireEOF);
		{
			if (true)
				return atom;
		}
		throw new Error("Missing return statement in function");
	}

	public SubLCharacter character(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLCharacter val = null;
		Token t = null;
		this.eatWhiteSpace(eatInitialWS);
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case NAMED_CHARACTER:
			t = this.jj_consume_token(SubLParserConstants.NAMED_CHARACTER);
			val = SubLObjectFactory.makeChar(t.image);
			break;
		case CHARACTER:
			t = this.jj_consume_token(SubLParserConstants.CHARACTER);
			val = SubLObjectFactory.makeChar(t.image);
			break;
		default:
			this.jj_la1[23] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		this.eof(requireEOF);
		{
			if (true)
				return val;
		}
		throw new Error("Missing return statement in function");
	}

	public void disable_tracing() {
	}

	public void eatWhiteSpace(boolean shouldEatWS) throws ParseException {
		if (!shouldEatWS)
			if (true)
				return;
		label_13: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case WS:
				;
				break;
			default:
				this.jj_la1[24] = this.jj_gen;
				break label_13;
			}
			this.jj_consume_token(SubLParserConstants.WS);
		}
	}

	public void enable_tracing() {
	}

	public void eof(boolean requireEOF) throws ParseException {
		if (!requireEOF)
			if (true)
				return;
		label_14: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case WS:
				;
				break;
			default:
				this.jj_la1[25] = this.jj_gen;
				break label_14;
			}
			this.jj_consume_token(SubLParserConstants.WS);
		}
		this.jj_consume_token(0);
	}

	public SubLList form(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList result = null;
		SubLList contents = null;
		SubLObject dottedItem = null;
		this.eatWhiteSpace(eatInitialWS);
		this.jj_consume_token(SubLParserConstants.OPEN_PAREN);
		contents = this.termList(false, true);
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case DOT:
			this.jj_consume_token(SubLParserConstants.DOT);
			label_10: while (true) {
				this.jj_consume_token(SubLParserConstants.WS);
				switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
				case WS:
					;
					break;
				default:
					this.jj_la1[11] = this.jj_gen;
					break label_10;
				}
			}
			dottedItem = this.term(false, false);
			break;
		default:
			this.jj_la1[12] = this.jj_gen;
			;
		}
		label_11: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case WS:
				;
				break;
			default:
				this.jj_la1[13] = this.jj_gen;
				break label_11;
			}
			this.jj_consume_token(SubLParserConstants.WS);
		}
		this.jj_consume_token(SubLParserConstants.CLOSE_PAREN);
		result = contents;
		this.eof(requireEOF);
		if (contents != null && dottedItem != null)
			contents.setDottedElement(dottedItem);
		if (result.size() == 0)
			if (true)
				return CommonSymbols.NIL;
		{
			if (true)
				return result;
		}
		throw new Error("Missing return statement in function");
	}

	public ParseException generateParseException() {
		this.jj_expentries.removeAllElements();
		boolean[] la1tokens = new boolean[47];
		for (int i = 0; i < 47; i++)
			la1tokens[i] = false;
		if (this.jj_kind >= 0) {
			la1tokens[this.jj_kind] = true;
			this.jj_kind = -1;
		}
		for (int i = 0; i < 26; i++)
			if (this.jj_la1[i] == this.jj_gen)
				for (int j = 0; j < 32; j++) {
					if ((this.jj_la1_0[i] & 1 << j) != 0)
						la1tokens[j] = true;
					if ((this.jj_la1_1[i] & 1 << j) != 0)
						la1tokens[32 + j] = true;
				}
		for (int i = 0; i < 47; i++)
			if (la1tokens[i]) {
				this.jj_expentry = new int[1];
				this.jj_expentry[0] = i;
				this.jj_expentries.addElement(this.jj_expentry);
			}
		int[][] exptokseq = new int[this.jj_expentries.size()][];
		for (int i = 0; i < this.jj_expentries.size(); i++)
			exptokseq[i] = this.jj_expentries.elementAt(i);
		return new ParseException(this.token, exptokseq, SubLParserConstants.tokenImage);
	}

	public Token getNextToken() {
		if (this.token.next != null)
			this.token = this.token.next;
		else
			this.token = this.token.next = this.token_source.getNextToken();
		this.jj_ntk = -1;
		this.jj_gen++;
		return this.token;
	}

	public Token getToken(int index) {
		Token t = this.token;
		for (int i = 0; i < index; i++)
			if (t.next != null)
				t = t.next;
			else
				t = t.next = this.token_source.getNextToken();
		return t;
	}

	private Token jj_consume_token(int kind) throws ParseException {
		Token oldToken;
		if ((oldToken = this.token).next != null)
			this.token = this.token.next;
		else
			this.token = this.token.next = this.token_source.getNextToken();
		this.jj_ntk = -1;
		if (this.token.kind == kind) {
			this.jj_gen++;
			return this.token;
		}
		this.token = oldToken;
		this.jj_kind = kind;
		throw this.generateParseException();
	}

	private int jj_ntk() {
		if ((this.jj_nt = this.token.next) == null)
			return this.jj_ntk = (this.token.next = this.token_source.getNextToken()).kind;
		else
			return this.jj_ntk = this.jj_nt.kind;
	}

	public SubLList manageQuote(SubLQuote quoteType, SubLList currentQuotes) throws ParseException {
		currentQuotes = currentQuotes.push(quoteType);
		{
			if (true)
				return currentQuotes;
		}
		throw new Error("Missing return statement in function");
	}

	public SubLNumber number(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLNumber val = null;
		Token t = null;
		String baseOrFPStr = "";
		this.eatWhiteSpace(eatInitialWS);
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case DECIMAL_INTEGER:
			t = this.jj_consume_token(SubLParserConstants.DECIMAL_INTEGER);
			val = SubLObjectFactory.makeIntegralNumber(t.image.startsWith("+") ? t.image.substring(1) : t.image, 10);
			break;
		case BASED_INTEGER:
			t = this.jj_consume_token(SubLParserConstants.BASED_INTEGER);
			val = SubLObjectFactory.makeBasedIntegralNumber(t.image);
			break;
		case FLOAT1:
		case FLOAT2:
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case FLOAT1:
				t = this.jj_consume_token(SubLParserConstants.FLOAT1);
				break;
			case FLOAT2:
				t = this.jj_consume_token(SubLParserConstants.FLOAT2);
				break;
			default:
				this.jj_la1[17] = this.jj_gen;
				this.jj_consume_token(-1);
				throw new ParseException();
			}
			baseOrFPStr = t.image.toLowerCase();
			val = SubLObjectFactory.makeDouble(t.image.toLowerCase().replaceAll("\\p{Alpha}", "e"));
			break;
		default:
			this.jj_la1[18] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		this.eof(requireEOF);
		{
			if (true)
				return val;
		}
		throw new Error("Missing return statement in function");
	}

	public SubLObject processQuotes(SubLObject quotedObject, SubLList quoteList) throws ParseException {
		SubLList result = null;
		SubLList currentQuote = SubLNil.NIL;
		SubLQuote theQuote = null;
		if (quoteList == SubLNil.NIL)
			if (true)
				return quotedObject;
		if (quoteList.size() == 1) {
			theQuote = (SubLQuote) quoteList.first();
			if (theQuote == SubLQuote.FUNCTION_QUOTE_SYMBOL && !quotedObject.isSymbol())
				if (true)
					throw new ParseException("Got invalid quote: " + theQuote + " for term: " + quotedObject);
			quoteList = quoteList.push(quotedObject);
			quoteList = quoteList.reverse(true).toList();
			{
				if (true)
					return quoteList;
			}
		}
		result = SubLObjectFactory.makeCons(quotedObject, SubLNil.NIL);
		for (int i = 0, size = quoteList.size(); i < size; i++) {
			theQuote = (SubLQuote) quoteList.get(i);
			result = SubLObjectFactory.makeCons(result, result);
		}
		{
			if (true)
				return result;
		}
		throw new Error("Missing return statement in function");
	}

	public void ReInit(java.io.InputStream stream) {
		this.jj_input_stream.ReInit(stream, 1, 1);
		this.token_source.ReInit(this.jj_input_stream);
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public void ReInit(java.io.Reader stream) {
		this.jj_input_stream.ReInit(stream, 1, 1);
		this.token_source.ReInit(this.jj_input_stream);
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public void ReInit(SubLParserTokenManager tm) {
		this.token_source = tm;
		this.token = new Token();
		this.jj_ntk = -1;
		this.jj_gen = 0;
		for (int i = 0; i < 26; i++)
			this.jj_la1[i] = -1;
	}

	public SubLString string(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		Token t = null;
		this.eatWhiteSpace(eatInitialWS);
		t = this.jj_consume_token(SubLParserConstants.STRING);
		this.eof(requireEOF);
		{
			if (true)
				return SubLObjectFactory.makeString(t.image.substring(1, t.image.length() - 1));
		}
		throw new Error("Missing return statement in function");
	}

	public SubLSymbol symbol(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		Token t = null;
		String symbolOrPackageName = SubLPackage.KEYWORD_PACKAGE.getName();
		String symName = "";
		boolean isInterned = true;
		SubLSymbol symbol = null;
		this.eatWhiteSpace(eatInitialWS);
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case UNINTERNED_SYMBOL_PREFIX:
			this.jj_consume_token(SubLParserConstants.UNINTERNED_SYMBOL_PREFIX);
			symbolOrPackageName = this.symbolName();
			isInterned = false;
			break;
		case PACKAGE_SEPARATOR:
			this.jj_consume_token(SubLParserConstants.PACKAGE_SEPARATOR);
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case PACKAGE_SEPARATOR:
				this.jj_consume_token(SubLParserConstants.PACKAGE_SEPARATOR);
				break;
			default:
				this.jj_la1[19] = this.jj_gen;
				;
			}
			symName = this.symbolName();
			break;
		case CASE_SENSITIVE_SUBL_SYMBOL_NAME:
		case SUBL_SYMBOL_NAME:
			symbolOrPackageName = this.symbolName();
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case PACKAGE_SEPARATOR:
				this.jj_consume_token(SubLParserConstants.PACKAGE_SEPARATOR);
				switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
				case PACKAGE_SEPARATOR:
					this.jj_consume_token(SubLParserConstants.PACKAGE_SEPARATOR);
					break;
				default:
					this.jj_la1[20] = this.jj_gen;
					;
				}
				symName = this.symbolName();
				break;
			default:
				this.jj_la1[21] = this.jj_gen;
				;
			}
			break;
		default:
			this.jj_la1[22] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		if (symName == null || "".equals(symName))
			symbol = SubLObjectFactory.makeSymbol(symbolOrPackageName,
					isInterned ? SubLPackage.getCurrentPackage() : null);
		else
			symbol = SubLObjectFactory.makeSymbol(symName, symbolOrPackageName);
		this.eof(requireEOF);
		{
			if (true)
				return symbol;
		}
		throw new Error("Missing return statement in function");
	}

	// internal use only
	public String symbolName() throws ParseException {
		String val = null;
		Token t = null;
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case SUBL_SYMBOL_NAME:
			t = this.jj_consume_token(SubLParserConstants.SUBL_SYMBOL_NAME);
			val = t.image;
			break;
		case CASE_SENSITIVE_SUBL_SYMBOL_NAME:
			t = this.jj_consume_token(SubLParserConstants.CASE_SENSITIVE_SUBL_SYMBOL_NAME);
			val = t.image;
			break;
		default:
			this.jj_la1[16] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		if (val == null || val.equals("")) {
			if (true)
				return this.currentPackage;
		} else if (true)
			return val;
		throw new Error("Missing return statement in function");
	}

	public SubLObject term(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLObject curTerm = null;
		SubLList currentQuotes = SubLNil.NIL;
		boolean doReadTimeEvaluation = false;
		this.eatWhiteSpace(eatInitialWS);
		label_3: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case FUNCTION_QUOTE:
			case QUOTE_CHAR:
			case BACK_QUOTE:
			case SPLICING_UNQUOTE:
			case UNQUOTE:
			case READ_TIME_EVALUATION:
				;
				break;
			default:
				this.jj_la1[2] = this.jj_gen;
				break label_3;
			}
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case QUOTE_CHAR:
				this.jj_consume_token(SubLParserConstants.QUOTE_CHAR);
				label_4: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[3] = this.jj_gen;
						break label_4;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				currentQuotes = this.manageQuote(SubLQuote.QUOTE_SYMBOL, currentQuotes);
				break;
			case BACK_QUOTE:
				this.jj_consume_token(SubLParserConstants.BACK_QUOTE);
				label_5: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[4] = this.jj_gen;
						break label_5;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				currentQuotes = this.manageQuote(SubLQuote.BACK_QUOTE_SYMBOL, currentQuotes);
				break;
			case FUNCTION_QUOTE:
				this.jj_consume_token(SubLParserConstants.FUNCTION_QUOTE);
				label_6: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[5] = this.jj_gen;
						break label_6;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				currentQuotes = this.manageQuote(SubLQuote.FUNCTION_QUOTE_SYMBOL, currentQuotes);
				break;
			case SPLICING_UNQUOTE:
				this.jj_consume_token(SubLParserConstants.SPLICING_UNQUOTE);
				label_7: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[6] = this.jj_gen;
						break label_7;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				currentQuotes = this.manageQuote(SubLQuote.SPLICING_UNQUOTE_SYMBOL, currentQuotes);
				break;
			case UNQUOTE:
				this.jj_consume_token(SubLParserConstants.UNQUOTE);
				label_8: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[7] = this.jj_gen;
						break label_8;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				currentQuotes = this.manageQuote(SubLQuote.UNQUOTE_SYMBOL, currentQuotes);
				break;
			case READ_TIME_EVALUATION:
				this.jj_consume_token(SubLParserConstants.READ_TIME_EVALUATION);
				label_9: while (true) {
					switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
					case WS:
						;
						break;
					default:
						this.jj_la1[8] = this.jj_gen;
						break label_9;
					}
					this.jj_consume_token(SubLParserConstants.WS);
				}
				doReadTimeEvaluation = true;
				break;
			default:
				this.jj_la1[9] = this.jj_gen;
				this.jj_consume_token(-1);
				throw new ParseException();
			}
		}
		switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
		case OPEN_PAREN:
		case WS:
			curTerm = this.form(false, false);
			break;
		case VECTOR_PREFIX:
			curTerm = this.vector(false, false);
			break;
		case PACKAGE_SEPARATOR:
		case UNINTERNED_SYMBOL_PREFIX:
		case FLOAT1:
		case FLOAT2:
		case DECIMAL_INTEGER:
		case BASED_INTEGER:
		case NAMED_CHARACTER:
		case CHARACTER:
		case STRING:
		case CASE_SENSITIVE_SUBL_SYMBOL_NAME:
		case SUBL_SYMBOL_NAME:
			curTerm = this.atom(false, false);
			break;
		default:
			this.jj_la1[10] = this.jj_gen;
			this.jj_consume_token(-1);
			throw new ParseException();
		}
		this.eof(requireEOF);
		SubLObject result = this.processQuotes(curTerm, currentQuotes);
		{
			if (true)
				return doReadTimeEvaluation ? result.eval(SubLEnvironment.currentEnvironment()) : result;
		}
		throw new Error("Missing return statement in function");
	}

	/********************* Parser ********************/
	public SubLList termList(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList val = CommonSymbols.NIL;
		SubLObject curTerm = null;
		boolean shouldFeaturizeOut = false;
		this.eatWhiteSpace(eatInitialWS);
		label_1: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case OPEN_PAREN:
			case PACKAGE_SEPARATOR:
			case VECTOR_PREFIX:
			case FUNCTION_QUOTE:
			case QUOTE_CHAR:
			case BACK_QUOTE:
			case SPLICING_UNQUOTE:
			case UNQUOTE:
			case UNINTERNED_SYMBOL_PREFIX:
			case READ_TIME_EVALUATION:
			case WS:
			case FLOAT1:
			case FLOAT2:
			case DECIMAL_INTEGER:
			case BASED_INTEGER:
			case NAMED_CHARACTER:
			case CHARACTER:
			case STRING:
			case CASE_SENSITIVE_SUBL_SYMBOL_NAME:
			case SUBL_SYMBOL_NAME:
				;
				break;
			default:
				this.jj_la1[0] = this.jj_gen;
				break label_1;
			}
			curTerm = this.term(false, false);
			val = SubLObjectFactory.makeCons(curTerm, val);
			label_2: while (true) {
				switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
				case WS:
					;
					break;
				default:
					this.jj_la1[1] = this.jj_gen;
					break label_2;
				}
				this.jj_consume_token(SubLParserConstants.WS);
			}
		}
		this.eof(requireEOF);
		{
			if (true)
				return val.toList().reverse(true).toList();
		}
		throw new Error("Missing return statement in function");
	}

	public SubLVector vector(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList result = null;
		this.eatWhiteSpace(eatInitialWS);
		this.jj_consume_token(SubLParserConstants.VECTOR_PREFIX);
		result = this.termList(false, true);
		label_12: while (true) {
			switch (this.jj_ntk == -1 ? this.jj_ntk() : this.jj_ntk) {
			case WS:
				;
				break;
			default:
				this.jj_la1[14] = this.jj_gen;
				break label_12;
			}
			this.jj_consume_token(SubLParserConstants.WS);
		}
		this.jj_consume_token(SubLParserConstants.CLOSE_PAREN);
		this.eof(requireEOF);
		{
			if (true)
				return SubLObjectFactory.makeVector(result);
		}
		throw new Error("Missing return statement in function");
	}

}
