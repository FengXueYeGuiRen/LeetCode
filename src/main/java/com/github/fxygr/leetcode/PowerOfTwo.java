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
		if (n == 1 || n == 2 || n == 4) {
			return true;
		}
		for (int i = 2; i < n / 2; i *= 2) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}

}
