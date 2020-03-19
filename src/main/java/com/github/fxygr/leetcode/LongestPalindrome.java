package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

import java.util.Arrays;

/**
 * 409. Longest Palindrome
 * (https://leetcode.com/problems/longest-palindrome/)
 * 409. 最长回文串
 * (https://leetcode-cn.com/problems/longest-palindrome/)
 *
 * @author FXYGR @date 2020-03-19
 */
public class LongestPalindrome {

	public int longestPalindrome(String s) {
		if (StringUtils.isBlank(s)) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		int nonPalindromeCharCount = 0;

		char[] chars = s.toCharArray();
		Arrays.sort(chars);

		int currentCharCount = 1;
		for (int i = 1; i <= s.length(); ++i) {
			if (i < s.length() && chars[i] == chars[i - 1]) {
				++currentCharCount;
				continue;
			}
			//  chars[i] != chars[i - 1]
			if (currentCharCount % 2 != 0) {
				nonPalindromeCharCount += (currentCharCount % 2);
			}
			currentCharCount = 1;
		}
		return s.length() - (nonPalindromeCharCount >= 1 ? (nonPalindromeCharCount - 1) : 0);
	}

}
