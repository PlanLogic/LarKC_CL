/*
	LarKC
 */
package eu.larkc.core.query;

import java.util.Arrays;
import java.util.List;

public class KeywordQueryImpl implements KeywordQuery {

	private final List<String> mKeywords;
	private static final long serialVersionUID = 1L;

	public KeywordQueryImpl(String... keywords) {
		mKeywords = Arrays.asList(keywords);
	}

	public List<String> getKeywords() {
		return mKeywords;
	}

	public String toString() {
		return mKeywords.toString();
	}
}
