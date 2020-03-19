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
		int longestOdd = 0;
		char[] chars = s.toCharArray();
		Arrays.sort(chars);

		char currentChar = chars[0];
		int currentCharCount = 1;
		for (int i = 1; i < s.length(); ++i) {
			if (chars[i] == currentChar) {
				++currentCharCount;
				continue;
			}
			if (currentCharCount % 2 != 0 && currentCharCount > longestOdd) {
				longestPalindrome += (longestOdd / 2) * 2;
				longestOdd = currentCharCount;
			} else {
				longestPalindrome += (currentCharCount / 2) * 2;
			}
			currentChar = chars[i];
			currentCharCount = 1;
		}
		if (currentCharCount % 2 != 0 && currentCharCount > longestOdd) {
			longestPalindrome += (longestOdd / 2) * 2;
			longestOdd = currentCharCount;
		} else {
			longestPalindrome += (currentCharCount / 2) * 2;
		}
		return longestPalindrome + (longestOdd >= 1 ? longestOdd : 0);
	}

}
