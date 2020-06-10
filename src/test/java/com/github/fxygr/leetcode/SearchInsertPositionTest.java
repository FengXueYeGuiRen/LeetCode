package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 35. Search Insert Position
 * 35. 搜索插入位置
 *
 * @author FXYGR @date 2020-06-10
 */
public class SearchInsertPositionTest {

	@InjectMocks
	private SearchInsertPosition searchInsertPosition;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void searchInsert() {
		int[] nums = new int[]{1, 3, 5, 6};
		int target = 0;
		int index = searchInsert(nums, target);
		assertEquals(0, index);
	}

	private int searchInsert(int[] nums, int target) {
		System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);

		int index = searchInsertPosition.searchInsert(nums, target);

		System.out.println("Output: " + index);
		System.out.println();
		return index;
	}

}
