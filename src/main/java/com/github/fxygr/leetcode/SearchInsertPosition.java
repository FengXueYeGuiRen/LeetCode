package com.github.fxygr.leetcode;

/**
 * 35. Search Insert Position
 * (https://leetcode.com/problems/search-insert-position/)
 * 35. 搜索插入位置
 *
 * @author FXYGR @date 2020-06-10
 */
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length < 1) {
			return -1;
		}
		return binarySearch(nums, 0, nums.length - 1, target);
	}

	private int binarySearch(
			int[] nums, int lo, int hi, int target) {
		if (lo >= hi) {
			if (target < nums[lo]) {
				return lo <= 0 ? lo : lo - 1;
			}
			if (target > nums[lo]) {
				return hi + 1;
			}
			return hi;
		}
		int mid = (lo + hi) / 2;
		if (target < nums[mid]) {
			return binarySearch(nums, lo, mid - 1, target);
		}
		if (target > nums[mid]) {
			return binarySearch(nums, mid + 1, hi, target);
		}
		return mid;
	}

}
