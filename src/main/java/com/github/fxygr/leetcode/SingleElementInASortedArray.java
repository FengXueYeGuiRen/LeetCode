package com.github.fxygr.leetcode;

/**
 * 540. Single Element in a Sorted Array
 * (https://leetcode.com/problems/single-element-in-a-sorted-array/)
 * 540. 有序数组中的单一元素
 *
 * @author FXYGR @date 2020-05-12
 */
public class SingleElementInASortedArray {

	public int singleNonDuplicate(int[] nums) {
		if (nums == null || nums.length < 1) {
			return Integer.MIN_VALUE;
		}
		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1]) {
				return nums[i];
			}
		}
		return nums[nums.length - 1];
	}

}
