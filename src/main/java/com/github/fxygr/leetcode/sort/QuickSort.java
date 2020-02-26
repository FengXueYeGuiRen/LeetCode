package com.github.fxygr.leetcode.sort;

/**
 * quick sort(快速排序)
 *
 * @author FXYGR @date 2020-02-26
 */
public class QuickSort {

	public static void sort(Comparable[] a) {
		if (a == null || a.length < 1) {
			return;
		}
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int i = partition(a, lo, hi);

		sort(a, lo, i - 1);
		sort(a, i + 1, hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo + 1, j = hi;
		Comparable temp = a[lo];
		while (true) {
			while (i <= hi && a[i].compareTo(temp) <= 0) {
				++i;
			}
			while (j > lo && temp.compareTo(a[j]) < 0) {
				--j;
			}
			if (i >= j) {
				break;
			}
			exch(a, i++, j--);
		}
		exch(a, lo, j);
		return j;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
