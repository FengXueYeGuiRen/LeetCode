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
		if (n <= 0) {
			return false;
		}
		for (int i = n; i > 1; i /= 2) {
			if (i % 2 != 0) {
				return false;
			}
		}
		return true;
	}

}
