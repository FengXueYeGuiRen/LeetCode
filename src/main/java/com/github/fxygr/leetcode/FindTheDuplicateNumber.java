package com.github.fxygr.leetcode;

/**
 * 287. Find the Duplicate Number
 * (https://leetcode.com/problems/find-the-duplicate-number/)
 * 287. 寻找重复数
 *
 * @author FXYGR @date 2020-05-26
 */
public class FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {
		if (nums == null || nums.length < 1) {
			return 0;
		}
		int[] numbers = new int[nums.length];

		for (int n : nums) {
			if (numbers[n] == 1) {
				return n;
			}
			++numbers[n];
		}
		return 0;
	}

}
