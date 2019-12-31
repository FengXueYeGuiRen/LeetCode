package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.List;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * description
 *
 * @author FXYGR @date 2019-12-31
 */
public class ThreeSumTest {

	@InjectMocks
	private ThreeSum threeSum;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void threeSum() {
		int[] nums = {8, 5, 12, 3, -2, -13, -8, -9, -8, 10, -10, -10, -14, -5, -1, -8, -7, -12, 4, 4, 10, -8, 0, -3, 4, 11, -9, -2, -7, -2, 3, -14, -12, 1, -4, -6, 3, 3, 0, 2, -9, -2, 7, -8, 0, 14, -1, 8, -13, 10, -11, 4, -13, -4, -14, -1, -8, -7, 12, -8, 6, 0, -15, 2, 8, -4, 11, -4, -15, -12, 5, -9, 1, -2, -10, -14, -11, 4, 1, 13, -1, -3, 3, -7, 9, -4, 7, 8, 4, 4, 8, -12, 12, 8, 5, 5, 12, -7, 9, 4, -12, -1, 2, 5, 4, 7, -2, 8, -12, -15, -1, 2, -11};
		threeSum(nums);
		StdOut.println();

		nums = new int[]{-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
		threeSum(nums);
		StdOut.println();

		nums = new int[]{-1, 0, 1, 0};
		threeSum(nums);
		StdOut.println();

		nums = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
		threeSum(nums);
		StdOut.println();

		nums = new int[]{-1, 0, 1, 2, -1, -4};
		threeSum(nums);
		StdOut.println();

		nums = new int[0];
		threeSum(nums);
		StdOut.println();

		nums = null;
		threeSum(nums);
		StdOut.println();
	}

	public List<List<Integer>> threeSum(int[] nums) {
		StdOut.println(nums, "Input");
		List<List<Integer>> results = threeSum.threeSum(nums);
		StdOut.println(results, "Output");
		return results;
	}

}