package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 56. Merge Intervals
 * 56. 合并区间
 *
 * @author FXYGR @date 2019-12-10
 */
public class MergeIntervalsTest {

	@InjectMocks
	private MergeIntervals mergeIntervals;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void merge() {
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		print(intervals, "start: ");

		intervals = merge(intervals);
		//  {{1, 6}, {8, 10}, {15, 18}}
		assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, intervals);

		intervals = new int[][]{{1, 4}, {4, 5}};
		intervals = merge(intervals);
		//  {{1, 5}}
		assertArrayEquals(new int[][]{{1, 5}}, intervals);

		intervals = new int[][]{};
		intervals = merge(intervals);
		//  {}
		assertArrayEquals(new int[][]{}, intervals);

		intervals = new int[][]{{1, 4}, {0, 4}};
		intervals = merge(intervals);
		//  {{0, 4}}
		assertArrayEquals(new int[][]{{0, 4}}, intervals);

		intervals = new int[][]{{1, 4}, {0, 0}};
		intervals = merge(intervals);
		//  {{0, 0}, {1, 4}}
		assertArrayEquals(new int[][]{{0, 0}, {1, 4}}, intervals);

		intervals = new int[][]{{3, 3}, {0, 1}, {0, 0}};
		intervals = merge(intervals);
		//  {{0, 1}, {3, 3}}
		assertArrayEquals(new int[][]{{0, 1}, {3, 3}}, intervals);

		intervals = new int[][]{{5, 6}, {1, 2}, {2, 4}, {5, 5}, {5, 5}, {3, 3}};
		int[][] results = merge(intervals);
		//  {{1, 4}, {5, 6}}
		assertArrayEquals(new int[][]{{1, 4}, {5, 6}}, results);

		print(intervals, "end: ");
	}

	private int[][] merge(int[][] intervals) {
		print(intervals, "Input");
		intervals = mergeIntervals.merge(intervals);
		print(intervals, "Output");
		System.out.println();
		return intervals;
	}

	private int[][] mergeByArrayList(int[][] intervals) {
		print(intervals, "Input");
		intervals = mergeIntervals.mergeByArrayList(intervals);
		print(intervals, "Output");
		System.out.println();
		return intervals;
	}

	private void print(int[][] intervals, String prefix) {
		System.out.print(prefix + ": ");
		for (int[] interval : intervals) {
			System.out.print("[" + interval[0] + ", " + interval[1] + "]");
		}
		System.out.println();
	}

	@Test
	public void mergeByArrayList() {
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		print(intervals, "start: ");

		intervals = mergeByArrayList(intervals);
		//  {{1, 6}, {8, 10}, {15, 18}}
		assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, intervals);

		intervals = new int[][]{{1, 4}, {4, 5}};
		intervals = mergeByArrayList(intervals);
		//  {{1, 5}}
		assertArrayEquals(new int[][]{{1, 5}}, intervals);

		intervals = new int[][]{};
		intervals = mergeByArrayList(intervals);
		//  {}
		assertArrayEquals(new int[][]{}, intervals);

		intervals = new int[][]{{1, 4}, {0, 4}};
		intervals = mergeByArrayList(intervals);
		//  {{0, 4}}
		assertArrayEquals(new int[][]{{0, 4}}, intervals);

		intervals = new int[][]{{1, 4}, {0, 0}};
		intervals = mergeByArrayList(intervals);
		//  {{0, 0}, {1, 4}}
		assertArrayEquals(new int[][]{{0, 0}, {1, 4}}, intervals);

		intervals = new int[][]{{3, 3}, {0, 1}, {0, 0}};
		intervals = mergeByArrayList(intervals);
		//  {{0, 1}, {3, 3}}
		assertArrayEquals(new int[][]{{0, 1}, {3, 3}}, intervals);

		intervals = new int[][]{{5, 6}, {1, 2}, {2, 4}, {5, 5}, {5, 5}, {3, 3}};
		int[][] results = mergeByArrayList(intervals);
		//  {{1, 4}, {5, 6}}
		assertArrayEquals(new int[][]{{1, 4}, {5, 6}}, results);

		print(intervals, "end: ");
	}

}