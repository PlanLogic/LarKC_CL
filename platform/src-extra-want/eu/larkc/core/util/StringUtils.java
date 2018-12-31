package eu.larkc.core.util;

import java.util.Iterator;

public class StringUtils {

	/**
	 * Joins iterable objects into a String
	 * @param <T>
	 * @param objs iterable objects to join
	 * @param delimiter the join delimiter, eg ", "
	 */
	public static <T> String join(final Iterable<T> objs, final String delimiter) {
		Iterator<T> iter = objs.iterator();
		if (!iter.hasNext())
			return "";
		StringBuffer buffer = new StringBuffer(String.valueOf(iter.next()));
		while (iter.hasNext())
			buffer.append(delimiter).append(String.valueOf(iter.next()));
		return buffer.toString();
	}

}
