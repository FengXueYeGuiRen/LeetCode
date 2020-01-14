package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 164. Maximum Gap
 * 164. 最大间距
 *
 * @author FXYGR @date 2020-01-10
 */
public class MaximumGapTest {

	@InjectMocks
	private MaximumGap maximumGap;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void maximumGap() {
		int[] nums = new int[]{100, 3, 2, 1};
		int maxGap = maximumGap(nums);
		assertEquals(97, maxGap);

		nums = new int[]{3, 6, 9, 1};
		maxGap = maximumGap(nums);
		assertEquals(3, maxGap);

		nums = new int[]{};
		maxGap = maximumGap(nums);
		assertEquals(0, maxGap);

		nums = new int[0];
		maxGap = maximumGap(nums);
		assertEquals(0, maxGap);

		nums = null;
		maxGap = maximumGap(nums);
		assertEquals(0, maxGap);
	}

	private int maximumGap(int[] nums) {
		StdOut.println(nums, "Input");
		int maxGap = maximumGap.maximumGap(nums);
		StdOut.println(nums, "Input(ordered)");
		StdOut.println(maxGap, "Output");
		return maxGap;
	}

}
