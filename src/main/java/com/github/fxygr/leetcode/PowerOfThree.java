package com.github.fxygr.leetcode;

/**
 * 326. Power of Three
 * (https://leetcode.com/problems/power-of-three/)
 * 326. 3的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
		if (n < 3) {
			return false;
		}
		for (int i = n; i > 2; i /= 3) {
			if (i % 3 != 0) {
				return false;
			}
		}
		return true;
	}

}
