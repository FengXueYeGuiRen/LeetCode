package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 75. Sort Colors
 * (https://leetcode.com/problems/sort-colors/)
 * 75. 颜色分类
 *
 * @author FXYGR @date 2019-12-18
 */
public class SortColorsTest {

	@InjectMocks
	private SortColors sortColors;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void sortColors() {
		int[] nums = {};
		sortColors(nums);

		nums = null;
		sortColors(nums);

		nums = new int[]{2, 0, 2, 1, 1, 0};
		sortColors(nums);
	}

	private void sortColors(int[] nums) {
		println(nums, "Input: ");
		sortColors.sortColors(nums);
		println(nums, "Output: ");
	}

	private void println(int[] nums, String prefix) {
		System.out.print(prefix);
		if (nums == null || nums.length < 1) {
			System.out.println(nums);
			return;
		}
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
