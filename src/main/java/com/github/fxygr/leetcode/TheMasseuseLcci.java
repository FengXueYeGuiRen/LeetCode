package com.github.fxygr.leetcode;

/**
 * 面试题 17.16. 按摩师
 * (https://leetcode-cn.com/problems/the-masseuse-lcci/)
 *
 * @author FXYGR @date 2020-03-24
 */
public class TheMasseuseLcci {

	public int massage(int[] nums) {
		if (nums == null || nums.length < 1) {
			return 0;
		}
		int evenIndexTimes = 0, oddIndexTimes = 0;
		for (int i = 1; i <= nums.length; i = i + 2) {
			evenIndexTimes += nums[i - 1];
			if (i < nums.length) {
				oddIndexTimes += nums[i];
			}
		}
		return evenIndexTimes > oddIndexTimes ? evenIndexTimes : oddIndexTimes;
	}

}
