package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 287. Find the Duplicate Number
 * 287. 寻找重复数
 *
 * @author FXYGR @date 2020-05-26
 */
public class FindTheDuplicateNumberTest {

	@InjectMocks
	private FindTheDuplicateNumber findTheDuplicateNumber;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void findDuplicate() {
		int[] nums = new int[]{1, 3, 4, 2, 2};
		int duplicateNumber = findDuplicate(nums);
		assertEquals(2, duplicateNumber);

		nums = new int[]{3, 1, 3, 4, 2};
		duplicateNumber = findDuplicate(nums);
		assertEquals(3, duplicateNumber);
	}

	private int findDuplicate(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		int duplicateNumber = findTheDuplicateNumber.findDuplicate(nums);

		System.out.println("Output: " + duplicateNumber);
		System.out.println();
		return duplicateNumber;
	}

}
