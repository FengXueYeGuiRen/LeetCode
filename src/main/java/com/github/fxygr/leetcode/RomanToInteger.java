package com.github.fxygr.leetcode;

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
			int endIndex = i + 2;
			endIndex = endIndex >= s.length() ? s.length() : endIndex;

			int romanNumeral = romanNumeralToInt(s.substring(i, endIndex));
			if (romanNumeral > 0) {
				integer += romanNumeral;
				i = endIndex;
				continue;
			}
			integer += romanSymbolToInt(s.charAt(i++));
		}
		return integer;
	}

	private int romanNumeralToInt(String romanNumeral) {
		int integer;
		switch (romanNumeral) {
			case "IV":
				integer = 4;
				break;
			case "IX":
				integer = 9;
				break;
			case "XL":
				integer = 40;
				break;
			case "XC":
				integer = 90;
				break;
			case "CD":
				integer = 400;
				break;
			case "CM":
				integer = 900;
				break;
			default:
				integer = 0;
				break;
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
