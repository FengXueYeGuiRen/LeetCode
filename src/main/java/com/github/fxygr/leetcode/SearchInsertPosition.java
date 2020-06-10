package com.github.fxygr.leetcode;

/**
 * 35. Search Insert Position
 * (https://leetcode.com/problems/search-insert-position/)
 * 35. 搜索插入位置
 *
 * @author FXYGR @date 2020-06-10
 */
public class SearchInsertPosition {

	private int[] sortedNums;
	private int targetValue;

	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length < 1) {
			return -1;
		}
		sortedNums = nums;
		targetValue = target;
		return binarySearch(0, nums.length - 1);
	}

	private int binarySearch(int lo, int hi) {
		if (lo >= hi) {
			if (targetValue > sortedNums[lo]) {
				return lo + 1;
			}
			return lo;
		}// lo < hi
		int mid = (lo + hi) / 2;
		if (targetValue == sortedNums[mid]) {
			return mid;
		}
		if (targetValue < sortedNums[mid]) {
			hi = mid - 1;
		}
		if (targetValue > sortedNums[mid]) {
			lo = mid + 1;
		}
		return binarySearch(lo, hi);
	}

}
