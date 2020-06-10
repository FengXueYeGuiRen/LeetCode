package com.github.fxygr.leetcode.search;

/**
 * binary search(二分查找)
 *
 * @author FXYGR @date 2020-06-10
 */
public class BinarySearch {

	public static int search(int[] a, int target) {
		int lo = 0;
		int hi = a.length - 1;

		int mid;
		while (lo <= hi) {
			mid = (lo + hi) / 2;

			if (target < a[mid]) {
				hi = mid - 1;
				continue;
			}
			if (target > a[mid]) {
				lo = mid + 1;
				continue;
			}// target == a[mid]
			return mid;
		}
		return -1;
	}

}
