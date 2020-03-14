package com.github.fxygr.leetcode.utils;

/**
 * description
 *
 * @author FXYGR @date 2020-03-02
 */
public class StringUtils {

	public static boolean isNotBlank(String s) {
		return !isBlank(s);
	}

	public static boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

}
