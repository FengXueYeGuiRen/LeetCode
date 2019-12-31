package com.github.fxygr.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
		if (nums == null || nums.length < 1) {
			return Collections.emptyList();
		}
		int resultsSize = (nums.length / 3) + 1;
		List<List<Integer>> results =
				new ArrayList<>(resultsSize);
		HashSet<Integer> hashSet = new HashSet<>(resultsSize * 2);
		for (int i = 0; i < nums.length - 2; ++i) {
			for (int j = i + 1; j < nums.length - 1; ++j) {
				for (int z = j + 1; z < nums.length; ++z) {
					Integer hash =
							Integer.hashCode(nums[i])
									^ Integer.hashCode(nums[j])
									^ Integer.hashCode(nums[z]);
					if (!hashSet.contains(hash)
							&& nums[i] + nums[j] + nums[z] == SUM) {
						results.add(newList(nums[i], nums[j], nums[z]));
						hashSet.add(hash);
					}
				}
			}
		}
		return results;
	}

	List<Integer> newList(
			Integer i, Integer j, Integer z) {
		List<Integer> list =
				new ArrayList<>(3);
		list.add(i);
		list.add(j);
		list.add(z);

		return list;
	}

}
