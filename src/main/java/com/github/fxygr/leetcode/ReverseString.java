package com.github.fxygr.leetcode;

/**
 * 344. Reverse String
 * (https://leetcode.com/problems/reverse-string/)
 * 344. 反转字符串
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseString {

	public void reverseString(char[] s) {
		if (s == null || s.length < 1) {
			return;
		}
		char temp;
		for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}

}
