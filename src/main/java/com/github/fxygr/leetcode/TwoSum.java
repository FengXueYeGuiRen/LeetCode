package com.github.fxygr.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * (https://leetcode.com/problems/two-sum/)
 * 1. 两数之和
 * (https://leetcode-cn.com/problems/two-sum/)
 *
 * @author FXYGR @date 2019-12-29
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 1) {
			return nums;
		}
		Map<Integer, Integer> numIndexMap =
				new HashMap<>(nums.length * 2);

		int m, n;
		for (int i = 0; i < nums.length; ++i) {
			m = nums[i];
			n = target - m;

			if (numIndexMap.containsKey(n)) {
				return new int[]{numIndexMap.get(n), i};
			}
			numIndexMap.put(m, i);
		}
		return new int[0];
	}

}
