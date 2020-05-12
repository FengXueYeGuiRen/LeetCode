package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 169. Majority Element
 * 169. 多数元素
 *
 * @author FXYGR @date 2020-05-06
 */
public class MajorityElementTest {

	@InjectMocks
	private MajorityElement majorityElement;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void majorityElement() {
		int[] nums = {3, 2, 3};
		int majority = majorityElement(nums);
		assertEquals(3, majority);

		nums = new int[]{2, 2, 1, 1, 1, 2, 2};
		majority = majorityElement(nums);
		assertEquals(2, majority);
	}

	private int majorityElement(int[] nums) {
		StdOut.println(nums, "Input: ");
		int majority = majorityElement.majorityElement(nums);

		System.out.println("Output: " + majority);
		System.out.println();
		return majority;
	}

}
