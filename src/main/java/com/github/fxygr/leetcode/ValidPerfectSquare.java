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
		if (num < 1) {
			return false;
		}
		if (num == 1 || num == 2 || num == 4) {
			return true;
		}
		for (int i = num / 3; i > 0; --i) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}

}
