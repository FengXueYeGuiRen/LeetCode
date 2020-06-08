package com.github.fxygr.leetcode;

/**
 * 231. Power of Two
 * (https://leetcode.com/problems/power-of-two/)
 * 231. 2的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		}
		for (int i = 1; i <= n; i *= 2) {
			if (i == n) {
				return true;
			}
		}
		return false;
	}

}
