package com.github.fxygr.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 41. First Missing Positive
 * (https://leetcode.com/problems/first-missing-positive/)
 * 41. 缺失的第一个正数
 *
 * @author FXYGR @date 2020-05-26
 */
public class FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {
		Set<Integer> sets = new HashSet<>();
		for (int n : nums) {
			sets.add(n);
		}
		for (int i = 1; ; ++i) {
			if (sets.contains(i)) {
				continue;
			}
			return i;
		}
	}

}
