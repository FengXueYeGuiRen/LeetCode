package com.github.fxygr.leetcode;

/**
 * 367. Valid Perfect Square
 * (https://leetcode.com/problems/valid-perfect-square/)
 * 367. 有效的完全平方数
 *
 * @author FXYGR @date 2020-05-09
 */
public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {
		if (num < 2) {
			return false;
		}
		for (int n = num; n > 1; n /= 2) {
			if (n % 2 != 0) {
				return false;
			}
		}
		return true;
	}

}
