package com.github.fxygr.leetcode;

/**
 * 326. Power of Four
 * (https://leetcode.com/problems/power-of-four/)
 * 326. 4的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfFour {

	public boolean isPowerOfFour(int n) {
		if (n < 1) {
			return false;
		}
		for (int i = n; i > 1; i /= 4) {
			if (i % 4 != 0) {
				return false;
			}
		}
		return true;
	}

}
