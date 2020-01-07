package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * description
 *
 * @author FXYGR @date 2020-01-07
 */
public class TwoSumIITest {

	@InjectMocks
	private TwoSumII twoSumII;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void twoSum() {
		int[] nums = {3, 3};
		int[] results = twoSum(nums, 6);
		assertArrayEquals(new int[]{1, 2}, results);

		nums = new int[]{2, 3, 4};
		results = twoSum(nums, 6);
		assertArrayEquals(new int[]{1, 3}, results);

		nums = new int[]{2, 7, 11, 15};
		results = twoSum(nums, 9);
		assertArrayEquals(new int[]{1, 2}, results);

		nums = new int[0];
		results = twoSum(nums, 9);
		assertArrayEquals(nums, results);

		nums = null;
		results = twoSum(nums, 9);
		assertArrayEquals(nums, results);
	}

	private int[] twoSum(int[] nums, int target) {
		StdOut.println(nums, "Input: nums = ");
		StdOut.println("\ttarget = " + target);
		int[] results = twoSumII.twoSum(nums, target);
		StdOut.println(results, "Output: ");
		StdOut.println();
		return results;
	}

}
