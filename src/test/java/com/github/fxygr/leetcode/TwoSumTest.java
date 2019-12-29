package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1. Two Sum
 * 1. 两数之和
 *
 * @author FXYGR @date 2019-12-29
 */
public class TwoSumTest {

	@InjectMocks
	private TwoSum twoSum;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void twoSum() {
		int[] nums = {3, 3};
		int[] results = twoSum(nums, 6);
		assertArrayEquals(new int[]{0, 1}, results);
		System.out.println();

		nums = new int[]{3, 2, 4};
		results = twoSum(nums, 6);
		assertArrayEquals(new int[]{1, 2}, results);
		System.out.println();

		nums = new int[]{2, 7, 11, 15};
		results = twoSum(nums, 9);
		assertArrayEquals(new int[]{0, 1}, results);
		System.out.println();

		nums = new int[0];
		results = twoSum(nums, 9);
		assertArrayEquals(nums, results);
		System.out.println();

		nums = null;
		results = twoSum(nums, 9);
		assertArrayEquals(nums, results);
		System.out.println();
	}

	private int[] twoSum(int[] nums, int target) {
		println(nums, "Input: nums = ");
		System.out.println("\ttarget = " + target);
		int[] results = twoSum.twoSum(nums, target);
		println(results, "Output: ");
		return results;
	}

	private void println(int[] nums, String prefix) {
		System.out.print(prefix);
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

}
