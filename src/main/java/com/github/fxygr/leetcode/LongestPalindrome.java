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
		int longestPalindrome = 0;
		boolean hasOdd = false;

		char[] chars = s.toCharArray();
		Arrays.sort(chars);

		int currentCharCount = 1;
		for (int i = 1; i <= s.length(); ++i) {
			if (i < s.length() && chars[i] == chars[i - 1]) {
				++currentCharCount;
				continue;
			}
			//  chars[i] != chars[i - 1]
			longestPalindrome += (currentCharCount / 2) * 2;
			if (!hasOdd && currentCharCount % 2 != 0) {
				hasOdd = true;
			}
			currentCharCount = 1;
		}
		return longestPalindrome + (hasOdd ? 1 : 0);
	}

}
