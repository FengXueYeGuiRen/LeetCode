package com.github.fxygr.leetcode;

import java.util.List;

/**
 * description
 *
 * @author FXYGR @date 2019-12-31
 */
public class StdOut {

	public static void println() {
		System.out.println();
	}

	public static void println(int[] nums, String prefix) {
		System.out.print(prefix + ": ");
		if (nums == null) {
			System.out.println(nums);
			return;
		}
		System.out.print("[");
		for (int i = 0; i < nums.length; ++i) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}
		System.out.println("]");
	}

	public static void println(
			List lists, String prefix) {
		System.out.println(prefix + ": " + lists);
	}

}
