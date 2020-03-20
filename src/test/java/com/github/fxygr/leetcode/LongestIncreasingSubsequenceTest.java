package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 300. Longest Increasing Subsequence
 * 300. 最长上升子序列
 *
 * @author FXYGR @date 2020-03-20
 */
public class LongestIncreasingSubsequenceTest {

	@InjectMocks
	private LongestIncreasingSubsequence longestIncreasingSubsequence;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void lengthOfLIS() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		int lengthOfLIS = lengthOfLIS(nums);
		assertEquals(4, lengthOfLIS);
	}

	private int lengthOfLIS(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		int lengthOfLIS = longestIncreasingSubsequence.lengthOfLIS(nums);

		System.out.println("Output: " + lengthOfLIS);
		System.out.println();
		return lengthOfLIS;
	}
}