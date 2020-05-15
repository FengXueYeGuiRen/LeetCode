package com.github.fxygr.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 12. Integer to Roman
 * (https://leetcode.com/problems/integer-to-roman/)
 * 12. 整数转罗马数字
 *
 * @author FXYGR @date 2020-05-15
 */
public class IntegerToRoman {

	private static final Map<Integer, String> NUM_ROMAN_MAP =
			new HashMap<>();

	static {
		NUM_ROMAN_MAP.put(1, "I");
		NUM_ROMAN_MAP.put(5, "V");
		NUM_ROMAN_MAP.put(10, "X");
		NUM_ROMAN_MAP.put(50, "L");
		NUM_ROMAN_MAP.put(100, "C");
		NUM_ROMAN_MAP.put(500, "D");
		NUM_ROMAN_MAP.put(1000, "M");

		NUM_ROMAN_MAP.put(4, "IV");
		NUM_ROMAN_MAP.put(9, "IX");
		NUM_ROMAN_MAP.put(40, "XL");
		NUM_ROMAN_MAP.put(90, "XC");
		NUM_ROMAN_MAP.put(400, "CD");
		NUM_ROMAN_MAP.put(900, "CM");
	}

	public String intToRoman(int num) {
		StringBuilder roman = new StringBuilder();

		int number = num, times = 1;
		for (; number > 0; number /= 10, times *= 10) {
			int digit = number % 10;

			if (NUM_ROMAN_MAP.containsKey(digit * times)) {
				roman.insert(0, NUM_ROMAN_MAP.get(digit * times));
				continue;
			}
			roman.insert(0, digitToRoman(digit, times));
		}
		return roman.toString();
	}

	private String digitToRoman(int digit, int times) {
		if (digit == 0) {
			return "";
		}
		if (NUM_ROMAN_MAP.containsKey(digit)) {
			return NUM_ROMAN_MAP.get(digit);
		}
		int integer = digit * times;

		return digitToRoman(integer - times, times) + NUM_ROMAN_MAP.get(times);
	}

}
