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
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
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