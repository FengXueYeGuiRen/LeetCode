package com.github.fxygr.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 15. 3Sum
 * (https://leetcode.com/problems/3sum/)
 * 15. 三数之和
 * (https://leetcode-cn.com/problems/3sum/)
 *
 * @author FXYGR @date 2019-12-30
 */
public class ThreeSum {

	private static int SUM = 0;

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 2) {
			return Collections.emptyList();
		}
		Arrays.sort(nums);

		int resultsSize = (nums.length / 3) + 1;
		List<List<Integer>> results =
				new ArrayList<>(resultsSize);

		for (int i = 0; i < nums.length - 2; ++i) {
			if (nums[i] > SUM) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int j = i + 1, k = nums.length - 1;
			int sum;
			while (j < k) {
				sum = nums[i] + nums[j] + nums[k];
				if (sum < SUM) {
					++j;
					continue;
				}
				if (sum > SUM) {
					--k;
					continue;
				}
				//  sum == SUM
				results.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				while (j < k && nums[j] == nums[j - 1]) {
					++j;
				}
				while (j < k && k < nums.length - 1 && nums[k] == nums[k + 1]) {
					--k;
				}
			}
		}
		return results;
	}

}
