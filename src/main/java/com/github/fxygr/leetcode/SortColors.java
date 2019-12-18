package com.github.fxygr.leetcode;

/**
 * 75. Sort Colors
 * (https://leetcode.com/problems/sort-colors/)
 * 75. 颜色分类
 * (https://leetcode-cn.com/problems/sort-colors/)
 *
 * @author FXYGR @date 2019-12-18
 */
public class SortColors {

	public void sortColors(int[] nums) {
		if (nums == null || nums.length < 1) {
			return;
		}
		quick3waySort(nums, 0, nums.length - 1);
	}

	/**
	 * 三向切分快速排序
	 *
	 * @param nums
	 * @param lo
	 * @param hi
	 */
	private void quick3waySort(int[] nums, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int lt = lo, i = lo + 1, gt = hi;
		int num = nums[lo];
		int cmp;
		while (i <= gt) {
			cmp = Integer.compare(nums[i], num);
			if (cmp < 0) {
				exch(nums, lt++, i++);
			} else if (cmp > 0) {
				exch(nums, i, gt--);
			} else {
				++i;
			}
		}
		//  left
		quick3waySort(nums, lo, lt - 1);
		//  right
		quick3waySort(nums, gt + 1, hi);
	}

	private void quickSort(int[] nums, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int i = partition(nums, lo, hi);
		//  left
		quickSort(nums, lo, i - 1);
		//  right
		quickSort(nums, i + 1, hi);
	}

	private int partition(int[] nums, int lo, int hi) {
		int i = lo, j = hi + 1;

		int num = nums[lo];
		while (true) {
			while (i < j - 1 && less(nums[++i], num)) {
			}
			while (j >= i && less(num, nums[--j])) {
			}
			if (i >= j) {
				break;
			}
			exch(nums, i, j);
		}
		exch(nums, lo, j);
		return j;
	}

	private boolean less(int i, int j) {
		return i < j;
	}

	private void exch(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
