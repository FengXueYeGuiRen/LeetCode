package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 540. Single Element in a Sorted Array
 * 540. 有序数组中的单一元素
 *
 * @author FXYGR @date 2020-05-12
 */
public class SingleElementInASortedArrayTest {

	@InjectMocks
	private SingleElementInASortedArray singleElementInASortedArray;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void singleNonDuplicate() {
		int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
		int singleElement = singleNonDuplicate(nums);
		assertEquals(2, singleElement);

		nums = new int[]{3, 3, 7, 7, 10, 11, 11};
		singleElement = singleNonDuplicate(nums);
		assertEquals(10, singleElement);
	}

	private int singleNonDuplicate(int[] nums) {
		StdOut.println(nums, "Input: ");
		int singleElement = singleElementInASortedArray.singleNonDuplicate(nums);

		System.out.println("Output: " + singleElement);
		System.out.println();
		return singleElement;
	}

}
