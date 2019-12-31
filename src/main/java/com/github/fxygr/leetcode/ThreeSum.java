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
		HashSet<String> hashSet = new HashSet<>(resultsSize);
		for (int i = 0; i < nums.length - 2; ++i) {
			Integer x = nums[i];
			for (int j = i + 1; j < nums.length - 1; ++j) {
				Integer y = nums[j];
				for (int k = j + 1; k < nums.length; ++k) {
					Integer z = nums[k];

					String hash = hash(x, y, z);
					if (!hashSet.contains(hash)
							&& x + y + z == SUM) {
						results.add(newList(x, y, z));

						hashSet.add(hash);
					}
				}
			}
		}
		return results;
	}

	private String hash(
			Integer x, Integer y, Integer z) {
		if (x > y) {
			Integer t = x;
			x = y;
			y = t;
		}
		if (z < x) {
			return "" + z + x + y;
		} else if (z < y) {
			return "" + x + z + y;
		}
		return "" + x + y + z;
	}

	private List<Integer> newList(
			Integer i, Integer j, Integer k) {
		List<Integer> list =
				new ArrayList<>(3);
		list.add(i);
		list.add(j);
		list.add(k);

		return list;
	}

}
