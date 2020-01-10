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

	private int maximumGap;
	private int[] numbers;

	public int maximumGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		numbers = new int[nums.length];
		mergeSort(nums, 0, nums.length - 1);
		return maximumGap;
	}

	private int[] mergeSort(int[] nums, int lo, int hi) {
		if (lo == hi) {
			return nums;
		}
		int mid = (hi - lo) / 2;
		mergeSort(nums, lo, mid);
		mergeSort(nums, mid + 1, hi);

		return merge(nums, lo, mid, hi);
	}

	private int[] merge(int[] nums, int lo, int mid, int hi) {
		int left = lo, right = mid + 1;
		while (left <= mid && right <= hi) {
			if (nums[left] < nums[right]) {
				numbers[left++] = nums[left];
			} else if (nums[left] > nums[right]) {
				numbers[right++] = nums[right];
			} else {
				numbers[left++] = nums[left];
				numbers[right++] = nums[right];
			}
		}
		while (left <= mid) {
			numbers[left++] = nums[left];
		}
		while (right <= hi) {
			numbers[right++] = nums[right];
		}
		for (int i = lo; i <= hi; ++i) {
			nums[i] = numbers[i];
			if (i > 0) {
				maximumGap = Math.max(nums[i] - nums[i - 1], maximumGap);
			}
		}
		return nums;
	}

}
