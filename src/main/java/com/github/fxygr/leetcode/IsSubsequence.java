package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 392. Is Subsequence
 * (https://leetcode.com/problems/is-subsequence/)
 * 392. 判断子序列
 *
 * @author FXYGR @date 2020-06-09
 */
public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		if (StringUtils.isBlank(s) || StringUtils.isBlank(t)) {
			return false;
		}
		int sIndex = 0, tIndex = 0;
		for (; sIndex < s.length() && tIndex < t.length(); ++tIndex) {
			if (s.charAt(sIndex) == t.charAt(tIndex)) {
				++sIndex;
			}
		}
		return sIndex == s.length();
	}

}
