package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 41. First Missing Positive
 * 41. 缺失的第一个正数
 *
 * @author FXYGR @date 2020-05-27
 */
public class FirstMissingPositiveTest {

	@InjectMocks
	private FirstMissingPositive firstMissingPositive;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void firstMissingPositive() {
		int[] nums = new int[]{1, 2, 0};
		int missingPositive = firstMissingPositive(nums);
		assertEquals(3, missingPositive);

		nums = new int[]{3, 4, -1, 1};
		missingPositive = firstMissingPositive(nums);
		assertEquals(2, missingPositive);

		nums = new int[]{7, 8, 9, 11, 12};
		missingPositive = firstMissingPositive(nums);
		assertEquals(1, missingPositive);
	}

	private int firstMissingPositive(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));
		int missingPositive = firstMissingPositive.firstMissingPositive(nums);

		System.out.println("Output: " + missingPositive);
		System.out.println();
		return missingPositive;
	}

}
