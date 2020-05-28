package com.github.fxygr.leetcode;

/**
 * 7. Reverse Integer
 * (https://leetcode.com/problems/reverse-integer/)
 * 7. 整数反转
 *
 * @author FXYGR @date 2020-05-28
 */
public class ReverseInteger {

	public int reverse(int x) {
		if (x > -10 && x < 10) {
			return x;
		}
		StringBuilder reverse = new StringBuilder();
		if (x < 0) {
			reverse.append("-");
		}
		int naturalNumber = Math.abs(x);
		for (; naturalNumber > 0; naturalNumber /= 10) {
			reverse.append(naturalNumber % 10);
		}
		int integer = Integer.parseInt(reverse.toString());
		return integer;
	}

}
