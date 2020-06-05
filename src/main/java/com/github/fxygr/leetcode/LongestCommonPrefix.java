package com.github.fxygr.leetcode;

/**
 * 14. Longest Common Prefix
 * (https://leetcode.com/problems/longest-common-prefix/)
 * 14. 最长公共前缀
 *
 * @author FXYGR @date 2020-06-05
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length < 1) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; ; ++i) {
			if (i >= strs[0].length()) {
				break;
			}
			boolean isSame = true;
			for (int j = 1; j < strs.length; ++j) {
				if (i >= strs[j].length()
						|| strs[0].charAt(i) != strs[j].charAt(i)) {
					isSame = false;
					break;
				}
			}
			if (!isSame) {
				break;
			}
			sb.append(strs[0].charAt(i));
		}
		return sb.toString();
	}

}
