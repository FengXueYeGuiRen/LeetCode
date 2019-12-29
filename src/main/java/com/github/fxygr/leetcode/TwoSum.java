package com.github.fxygr.leetcode;

import java.util.Arrays;
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
		Map<Integer, Integer> numIndexMap = trans(nums);

		int[] results = new int[nums.length];
		int resultsIndex = -1;

		int m, n;
		for (int i = 0; i < nums.length; ++i) {
			m = nums[i];
			n = target - m;

			numIndexMap.remove(m, i);
			if (numIndexMap.containsKey(n)) {
				results[++resultsIndex] = i;
				results[++resultsIndex] = numIndexMap.remove(n);

				continue;
			}
		}
		return Arrays.copyOf(results, resultsIndex + 1);
	}

	private Map<Integer, Integer> trans(int[] nums) {
		Map<Integer, Integer> numIndexMap =
				new HashMap<>(nums.length * 2);
		for (int i = 0; i < nums.length; ++i) {
			numIndexMap.put(nums[i], i);
		}
		return numIndexMap;
	}

}
