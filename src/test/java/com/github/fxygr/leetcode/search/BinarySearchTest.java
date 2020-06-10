package com.github.fxygr.leetcode.search;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * binary search(二分查找)
 *
 * @author FXYGR @date 2020-06-10
 */
public class BinarySearchTest {

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void search() {
		int[] a = new int[]{1, 3, 5, 6};
		int target = 1;
		int index = search(a, target);
		assertEquals(0, index);

		a = new int[]{1, 3, 5, 6};
		target = 3;
		index = search(a, target);
		assertEquals(1, index);

		a = new int[]{1, 3, 5, 6};
		target = 5;
		index = search(a, target);
		assertEquals(2, index);

		a = new int[]{1, 3, 5, 6};
		target = 6;
		index = search(a, target);
		assertEquals(3, index);

		a = new int[]{1, 3, 5, 6};
		target = 0;
		index = search(a, target);
		assertEquals(-1, index);

		a = new int[]{1, 3, 5, 6};
		target = 2;
		index = search(a, target);
		assertEquals(-1, index);

		a = new int[]{1, 3, 5, 6};
		target = 4;
		index = search(a, target);
		assertEquals(-1, index);

		a = new int[]{1, 3, 5, 6};
		target = 7;
		index = search(a, target);
		assertEquals(-1, index);
	}

	private int search(int[] a, int target) {
		System.out.println("Input: a = " + Arrays.toString(a) + ", target = " + target);

		int index = BinarySearch.search(a, target);

		System.out.println("Output: " + index);
		System.out.println();
		return index;
	}

}
