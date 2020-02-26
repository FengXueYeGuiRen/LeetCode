package com.github.fxygr.leetcode.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * quick sort(快速排序)
 *
 * @author FXYGR @date 2020-02-26
 */
public class QuickSortTest {

	@Test
	public void sort() {
		sort(null);

		Integer[] a = {};
		sort(a);

		a = new Integer[]{9, 0, 8, 11, 7, 22, 0, 33, 5, 44, 4, 55, 3, 66, 2, 77, 1, 88, 0, 99, 88};
		sort(a);
	}

	private void sort(Comparable[] a) {
		System.out.println("Soruces: " + Arrays.toString(a));

		QuickSort.sort(a);

		System.out.println("Targets: " + Arrays.toString(a));
		System.out.println();
	}

}
