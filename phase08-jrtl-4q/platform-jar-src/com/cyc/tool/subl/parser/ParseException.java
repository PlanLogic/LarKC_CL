//
//
package com.cyc.tool.subl.parser;

public class ParseException extends RuntimeException {
	protected boolean specialConstructor;

	public Token currentToken;

	public int[][] expectedTokenSequences;

	public String[] tokenImage;
	protected String eol;

	public ParseException() {
		this.eol = System.getProperty("line.separator", "\n");
		this.specialConstructor = false;
	}

	public ParseException(String message) {
		super(message);
		this.eol = System.getProperty("line.separator", "\n");
		this.specialConstructor = false;
	}

	public ParseException(Token currentTokenVal, int[][] expectedTokenSequencesVal, String[] tokenImageVal) {
		super("");
		this.eol = System.getProperty("line.separator", "\n");
		this.specialConstructor = true;
		this.currentToken = currentTokenVal;
		this.expectedTokenSequences = expectedTokenSequencesVal;
		this.tokenImage = tokenImageVal;
	}

	protected String add_escapes(String str) {
		StringBuilder retval = new StringBuilder();
		for (int i = 0; i < str.length(); ++i)
			switch (str.charAt(i)) {
			case '\0':
				break;
			case '\b':
				retval.append("\\b");
				break;
			case '\t':
				retval.append("\\t");
				break;
			case '\n':
				retval.append("\\n");
				break;
			case '\f':
				retval.append("\\f");
				break;
			case '\r':
				retval.append("\\r");
				break;
			case '\"':
				retval.append("\\\"");
				break;
			case '\'':
				retval.append("\\'");
				break;
			case '\\':
				retval.append("\\\\");
				break;
			default: {
				char ch;
				if ((ch = str.charAt(i)) < ' ' || ch > '~') {
					String s = "0000" + Integer.toString(ch, 16);
					retval.append("\\u" + s.substring(s.length() - 4, s.length()));
					break;
				}
				retval.append(ch);
				break;
			}
			}
		return retval.toString();
	}

	public String getMessage() {
		if (!this.specialConstructor)
			return super.getMessage();
		String expected = "";
		int maxSize = 0;
		for (int i = 0; i < this.expectedTokenSequences.length; ++i) {
			if (maxSize < this.expectedTokenSequences[i].length)
				maxSize = this.expectedTokenSequences[i].length;
			for (int j = 0; j < this.expectedTokenSequences[i].length; ++j)
				expected = expected + this.tokenImage[this.expectedTokenSequences[i][j]] + " ";
			if (this.expectedTokenSequences[i][this.expectedTokenSequences[i].length - 1] != 0)
				expected += "...";
			expected = expected + this.eol + "    ";
		}
		String retval = "Encountered \"";
		Token tok = this.currentToken.next;
		for (int k = 0; k < maxSize; ++k) {
			if (k != 0)
				retval += " ";
			if (tok.kind == 0) {
				retval += this.tokenImage[0];
				break;
			}
			retval += this.add_escapes(tok.image);
			tok = tok.next;
		}
		retval = retval + "\" at line " + this.currentToken.next.beginLine + ", column "
				+ this.currentToken.next.beginColumn + "." + this.eol;
		if (this.expectedTokenSequences.length == 1)
			retval = retval + "Was expecting:" + this.eol + "    ";
		else
			retval = retval + "Was expecting one of:" + this.eol + "    ";
		retval += expected;
		return retval;
	}
}
