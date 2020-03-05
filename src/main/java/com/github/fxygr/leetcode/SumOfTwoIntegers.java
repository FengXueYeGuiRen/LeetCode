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
		int result = a ^ b;

		int pre, carry = a & b;
		while (carry != 0) {
			pre = result;
			carry <<= 1;

			result ^= carry;
			carry &= pre;
		}
		return result;
	}

}
