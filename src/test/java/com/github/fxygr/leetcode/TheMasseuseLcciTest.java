package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 面试题 17.16. 按摩师
 *
 * @author FXYGR @date 2020-03-24
 */
public class TheMasseuseLcciTest {

	@InjectMocks
	private TheMasseuseLcci theMasseuseLcci;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void massage() {
		int[] nums = new int[]{0, 0, 0};
		int times = massage(nums);
		assertEquals(0, times);

		nums = new int[]{0, 0};
		times = massage(nums);
		assertEquals(0, times);

		nums = new int[]{1, 2, 3, 1};
		times = massage(nums);
		assertEquals(4, times);

		nums = new int[]{2, 7, 9, 3, 1};
		times = massage(nums);
		assertEquals(12, times);

		nums = new int[]{2, 1, 4, 5, 3, 1, 1, 3};
		times = massage(nums);
		assertEquals(12, times);

		nums = new int[]{2, 1, 4, 5, 3, 1, 1, 1, 3};
		times = massage(nums);
		assertEquals(12, times);
	}

	private int massage(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		int times = theMasseuseLcci.massage(nums);

		System.out.println("Output: " + times);
		System.out.println();
		return times;
	}

}
