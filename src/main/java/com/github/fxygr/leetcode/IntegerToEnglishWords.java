package com.github.fxygr.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 273. Integer to English Words
 * (https://leetcode.com/problems/integer-to-english-words/)
 * 273. 整数转换英文表示
 *
 * @author FXYGR @date 2020-05-16
 */
public class IntegerToEnglishWords {

	private static final Map<Integer, String> INTEGER_ENGLISH_MAP = new HashMap<>();
	private static final Map<Integer, String> TIMES_PLACE_MAP = new HashMap<>();

	static {
		TIMES_PLACE_MAP.put(100, "Hundred");
		TIMES_PLACE_MAP.put(1000, "Thousand");
		TIMES_PLACE_MAP.put(1000000, "Million");
		TIMES_PLACE_MAP.put(1000000000, "Billion");


		INTEGER_ENGLISH_MAP.put(0, "Zero");
		INTEGER_ENGLISH_MAP.put(1, "One");
		INTEGER_ENGLISH_MAP.put(2, "Two");
		INTEGER_ENGLISH_MAP.put(3, "Three");
		INTEGER_ENGLISH_MAP.put(4, "Four");
		INTEGER_ENGLISH_MAP.put(5, "Five");
		INTEGER_ENGLISH_MAP.put(6, "Six");
		INTEGER_ENGLISH_MAP.put(7, "Seven");
		INTEGER_ENGLISH_MAP.put(8, "Eight");
		INTEGER_ENGLISH_MAP.put(9, "Nine");

		INTEGER_ENGLISH_MAP.put(11, "Eleven");
		INTEGER_ENGLISH_MAP.put(12, "Twelve");
		INTEGER_ENGLISH_MAP.put(13, "Thirteen");
		INTEGER_ENGLISH_MAP.put(14, "Fourteen");
		INTEGER_ENGLISH_MAP.put(15, "Fifteen");
		INTEGER_ENGLISH_MAP.put(16, "Sixteen");
		INTEGER_ENGLISH_MAP.put(17, "Seventeen");
		INTEGER_ENGLISH_MAP.put(18, "Eighteen");
		INTEGER_ENGLISH_MAP.put(19, "Nineteen");

		INTEGER_ENGLISH_MAP.put(10, "Ten");
		INTEGER_ENGLISH_MAP.put(20, "Twenty");
		INTEGER_ENGLISH_MAP.put(30, "Thirty");
		INTEGER_ENGLISH_MAP.put(40, "Forty");
		INTEGER_ENGLISH_MAP.put(50, "Fifty");
		INTEGER_ENGLISH_MAP.put(60, "Sixty");
		INTEGER_ENGLISH_MAP.put(70, "Seventy");
		INTEGER_ENGLISH_MAP.put(80, "Eighty");
		INTEGER_ENGLISH_MAP.put(90, "Ninety");
	}

	public String numberToWords(int num) {
		if (INTEGER_ENGLISH_MAP.containsKey(num)) {
			return INTEGER_ENGLISH_MAP.get(num);
		}
		StringBuilder englishWords = new StringBuilder();

		int number = num, times = 1;
		int hundreds;
		for (; number > 0; number /= 1000, times *= 1000) {
			hundreds = number % 1000;

			if (TIMES_PLACE_MAP.containsKey(times)) {
				englishWords.insert(0, " " + TIMES_PLACE_MAP.get(times));
			}
			englishWords.insert(0, hundreds2Words(hundreds));
		}
		return englishWords.toString().trim();
	}

	private String hundreds2Words(int num) {
		if (num <= 0) {
			return "";
		}
		if (INTEGER_ENGLISH_MAP.containsKey(num)) {
			return " " + INTEGER_ENGLISH_MAP.get(num);
		}
		StringBuilder englishWords = new StringBuilder();

		int number = num, times = 1;
		int digit;
		for (; number > 0; number /= 10, times *= 10) {
			digit = number % 10;
			if (digit == 0) {
				continue;
			}
			//  tens place
			if (digit == 1 && times == 10) {
				englishWords.delete(0, englishWords.length());
				englishWords.append(" ").append(INTEGER_ENGLISH_MAP.get(num % 100));
				continue;
			}
			if (TIMES_PLACE_MAP.containsKey(times)) {
				englishWords.insert(0, " " + TIMES_PLACE_MAP.get(times));
			}
			if (INTEGER_ENGLISH_MAP.containsKey(digit * times)) {
				englishWords.insert(0, " " + INTEGER_ENGLISH_MAP.get(digit * times));
			} else {
				englishWords.insert(0, " " + INTEGER_ENGLISH_MAP.get(digit));
			}
		}
		return englishWords.toString();
	}

}
