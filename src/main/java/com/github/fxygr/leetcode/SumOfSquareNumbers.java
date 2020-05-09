package com.github.fxygr.leetcode;

/**
 * 633. Sum of Square Numbers
 * (https://leetcode.com/problems/sum-of-square-numbers/)
 * 633. 平方数之和
 *
 * @author FXYGR @date 2020-05-09
 */
public class SumOfSquareNumbers {

	private ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();

	public boolean judgeSquareSum(int c) {
		if (c < 0) {
			return false;
		}
		if (c == 0) {
			return true;
		}
		int aa = c / 2;
		for (int i = 0; i <= aa; ++i) {
			int a = i * i;
			int bSquare = c - a;
			boolean isBPerfectSquare = validPerfectSquare.isPerfectSquare(bSquare);
			if (isBPerfectSquare) {
				return isBPerfectSquare;
			}
		}
		return false;
	}

}
