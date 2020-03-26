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
		for (int i = 0; i < nums.length; i += 2) {
			i = ignoreRepeats(i, nums);
			evenIndexTimes += nums[i];
		}
		for (int i = 1; i < nums.length; i += 2) {
			i = ignoreRepeats(i, nums);
			oddIndexTimes += nums[i];
		}
		return evenIndexTimes > oddIndexTimes ? evenIndexTimes : oddIndexTimes;
	}

	private int ignoreRepeats(int i, int[] nums) {
		if (i < 1 || i >= nums.length) {
			return i;
		}
		while ((i < nums.length && nums[i - 1] == nums[i])
				|| (i < (nums.length - 1) && nums[i] == nums[i + 1])) {
			++i;
		}
		if (i > 1 && i < nums.length
				&& nums[i - 2] == nums[i - 1]
				&& nums[i - 1] > nums[i]) {
			--i;
		}
		i = i >= nums.length ? (nums.length - 1) : i;
		return i;
	}

}
