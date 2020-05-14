package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 13. Roman to Integer
 * (https://leetcode.com/problems/roman-to-integer/)
 * 13. 罗马数字转整数
 *
 * @author FXYGR @date 2020-05-14
 */
public class RomanToInteger {

	public int romanToInt(String s) {
		int integer = 0;
		for (int i = 0; i < s.length(); ) {
			integer += romanNumeralToInt(s.substring(i, (i + 1) == s.length() ? i : ++i));

			i = (i++ < s.length()) ? i : (s.length() - 1);
		}
		return integer;
	}

	private int romanNumeralToInt(String romanNumeral) {
		if (StringUtils.isBlank(romanNumeral)) {
			return 0;
		}
		int integer;
		switch (romanNumeral) {
			case "IV":
				integer = 5;
				break;
			case "IX":
				integer = 9;
				break;
			case "XL":
				integer = 50;
				break;
			case "XC":
				integer = 90;
				break;
			case "CD":
				integer = 500;
				break;
			case "CM":
				integer = 900;
				break;
			default:
				integer = romanSymbolToInt(romanNumeral.charAt(0));
				if (romanNumeral.length() > 1) {
					integer += romanSymbolToInt(romanNumeral.charAt(1));
				}
		}
		return integer;
	}

	private int romanSymbolToInt(char ch) {
		int integer = 0;
		switch (ch) {
			case 'I':
				integer = 1;
				break;
			case 'V':
				integer = 5;
				break;
			case 'X':
				integer = 10;
				break;
			case 'L':
				integer = 50;
				break;
			case 'C':
				integer = 100;
				break;
			case 'D':
				integer = 500;
				break;
			case 'M':
				integer = 1000;
				break;
		}
		return integer;
	}

}
