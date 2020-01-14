package com.github.fxygr.leetcode;

/**
 * 164. Maximum Gap
 * (https://leetcode.com/problems/maximum-gap/)
 * 164. 最大间距
 * (https://leetcode-cn.com/problems/maximum-gap/)
 *
 * @author FXYGR @date 2020-01-09
 */
public class MaximumGap {

	private int[] numbers;

	public int maximumGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		numbers = new int[nums.length];

		nums = mergeSort(nums, 0, nums.length - 1);

		int maximumGap = 0;
		for (int i = 1; i < nums.length; ++i) {
			maximumGap = Math.max(nums[i] - nums[i - 1], maximumGap);
		}
		return maximumGap;
	}

	private int[] mergeSort(int[] nums, int lo, int hi) {
		if (lo >= hi) {
			return nums;
		}
		int mid = (hi + lo) / 2;
		nums = mergeSort(nums, lo, mid);
		nums = mergeSort(nums, mid + 1, hi);
		if (nums[mid] < nums[mid + 1]) {
			return nums;
		}
		return merge(nums, lo, mid, hi);
	}

	private int[] merge(int[] nums, int lo, int mid, int hi) {
		int left = lo, right = mid + 1, i = lo;
		while (left <= mid && right <= hi) {
			if (nums[left] < nums[right]) {
				numbers[i++] = nums[left++];
			} else if (nums[left] > nums[right]) {
				numbers[i++] = nums[right++];
			} else {
				numbers[i++] = nums[left++];
				numbers[i++] = nums[right++];
			}
		}
		while (left <= mid) {
			numbers[i++] = nums[left++];
		}
		while (right <= hi) {
			numbers[i++] = nums[right++];
		}
		for (i = lo; i <= hi; ++i) {
			nums[i] = numbers[i];
		}
		return nums;
	}

}
