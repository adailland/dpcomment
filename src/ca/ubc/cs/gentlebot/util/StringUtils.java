package ca.ubc.cs.gentlebot.util;

import java.util.ArrayList;

public class StringUtils {

	/**
	 * Flatten a list of strings to a single string.
	 * 
	 * @param content
	 *            a list of strings, each one representing a line in the comment
	 * @return currently, the entire comment as one single string
	 */
	public static String flatten(ArrayList<String> content) {
		return content.stream().reduce("", (s1, s2) -> s1 + System.lineSeparator() + s2);

	}

}
