package com.github.fxygr.leetcode;

/**
 * 371. Sum of Two Integers
 * (https://leetcode.com/problems/sum-of-two-integers/)
 * 371. 两整数之和
 * (https://leetcode-cn.com/problems/sum-of-two-integers/)
 *
 * @author FXYGR @date 2020-03-03
 */
public class SumOfTwoIntegers {

	public int getSum(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		String as = Integer.toBinaryString(a);
		String bs = Integer.toBinaryString(b);

		String sum = new AddBinary().addBinary(as, bs);

		return parseInt(sum);
	}

	private int parseInt(String binary) {
		int integer = 0;
		int length = binary.length();

		int least = length >= Integer.SIZE ? 0 : -1;
		for (int i = length - 1; i > least; --i) {
			integer += Short.parseShort(String.valueOf(binary.charAt(i))) * Math.pow(2, length - 1 - i);
		}
		if (length >= Integer.SIZE && binary.charAt(length - Integer.SIZE) == '1') {
			integer = -integer;
		}
		return integer;
	}

}
