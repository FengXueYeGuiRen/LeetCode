package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 557. Reverse Words in a String III
 * (https://leetcode.com/problems/reverse-words-in-a-string-iii/)
 * 557. 反转字符串中的单词 III
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseWordsInAStringIII {

	private static final char CHAR_BLANK = ' ';

	public String reverseWords(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		char[] chars = s.trim().toCharArray();
		for (int i = 0; i < s.length(); ) {
			int j = i;
			while (j < s.length() && chars[j] != CHAR_BLANK) {
				++j;
			}
			char temp;
			for (int k = j - 1; i <= k; ++i, --k) {
				temp = chars[i];
				chars[i] = chars[k];
				chars[k] = temp;
			}
			i = j + 1;
		}
		return String.valueOf(chars);
	}

}
