package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 541. Reverse String II
 * (https://leetcode.com/problems/reverse-string-ii/)
 * 541. 反转字符串 II
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseStringII {

	public String reverseStr(String s, int k) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i += 2 * k) {
			int j = i, z = j + k;

			z = z < s.length() ? z : (s.length() - 1);
			char temp;
			for (; j < s.length(); ++j, --z) {
				temp = chars[i];
				chars[i] = chars[j];
				chars[j] = temp;
			}
		}
		return String.valueOf(chars);
	}

}
