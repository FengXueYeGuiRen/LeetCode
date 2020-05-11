package com.github.fxygr.leetcode;

/**
 * 633. Sum of Square Numbers
 * (https://leetcode.com/problems/sum-of-square-numbers/)
 * 633. 平方数之和
 *
 * @author FXYGR @date 2020-05-09
 */
public class SumOfSquareNumbers {

	public boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}
		if (c == 0) {
			return true;
		}
		int maxA = c / 3;
		if (c < 9) {
			maxA = c / 2;
		}
		for (long a = 0; ; ++a) {
			long aa = a * a;
			if (a > maxA || aa >= c) {
				break;
			}
			long bb = c - aa;
			double b = Math.sqrt(bb);
			if (b == (int) b) {
				return true;
			}
		}
		return false;
	}

}
