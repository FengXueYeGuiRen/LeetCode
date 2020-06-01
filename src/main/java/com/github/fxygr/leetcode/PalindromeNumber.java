package com.github.fxygr.leetcode;

/**
 * 9. Palindrome Number
 * (https://leetcode.com/problems/palindrome-number/)
 * 9. 回文数
 *
 * @author FXYGR @date 2020-06-01
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		String integer = Integer.toString(x);

		int i = 0, j = integer.length() - 1;
		for (; i <= j; ++i, --j) {
			if (integer.charAt(i) != integer.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
