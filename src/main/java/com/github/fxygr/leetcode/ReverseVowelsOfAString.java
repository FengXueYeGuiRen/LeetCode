package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

import java.util.HashSet;

/**
 * 345. Reverse Vowels of a String
 * (https://leetcode.com/problems/reverse-vowels-of-a-string/)
 * 345. 反转字符串中的元音字母
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseVowelsOfAString {

	private static final HashSet<Character> VOWELS = new HashSet<>();

	static {
		VOWELS.add('a');
		VOWELS.add('A');
		VOWELS.add('o');
		VOWELS.add('O');
		VOWELS.add('e');
		VOWELS.add('E');
		VOWELS.add('i');
		VOWELS.add('I');
		VOWELS.add('u');
		VOWELS.add('U');
	}

	public String reverseVowels(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		char[] chars = s.trim().toCharArray();
		char temp;
		for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
			while (i < j && !VOWELS.contains(chars[i])) {
				++i;
			}
			while (i < j && !VOWELS.contains(chars[j])) {
				--j;
			}
			if (i >= j) {
				break;
			}
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return String.valueOf(chars);
	}

}
