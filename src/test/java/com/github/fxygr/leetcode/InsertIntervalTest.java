package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 57. Insert Interval
 * 57. 插入区间
 *
 * @author FXYGR @date 2019-12-17
 */
public class InsertIntervalTest {

	@InjectMocks
	private InsertInterval insertInterval;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void insert() {
		int[][] intervals = {};
		int[] newInterval = {};
		int[][] results = insert(intervals, newInterval);
		assertArrayEquals(intervals, results);

		intervals = null;
		newInterval = null;
		results = insert(intervals, newInterval);
		assertArrayEquals(intervals, results);

		intervals = new int[][]{{1, 3}, {6, 9}};
		newInterval = new int[]{2, 5};
		results = insert(intervals, newInterval);
		assertArrayEquals(new int[][]{{1, 5}, {6, 9}}, results);

		intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
		newInterval = new int[]{4, 8};
		results = insert(intervals, newInterval);
		assertArrayEquals(new int[][]{{1, 2}, {3, 10}, {12, 16}}, results);

		intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
		newInterval = new int[0];
		results = insert(intervals, newInterval);
		assertArrayEquals(intervals, results);

		intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
		newInterval = null;
		results = insert(intervals, newInterval);
		assertArrayEquals(intervals, results);

		intervals = new int[0][0];
		newInterval = new int[]{4, 8};
		results = insert(intervals, newInterval);
		assertArrayEquals(new int[][]{{4, 8}}, results);

		intervals = null;
		newInterval = new int[]{4, 8};
		insert(intervals, newInterval);
		assertArrayEquals(new int[][]{{4, 8}}, results);
	}

	private int[][] insert(int[][] intervals, int[] newInterval) {
		print(intervals, "Input: intervals = ");
		if (newInterval == null) {
			System.out.println("newInterval = " + newInterval);
		} else if (newInterval.length < 1) {
			System.out.println("newInterval = []");
		} else {
			System.out.println(
					"newInterval = [" + newInterval[0] + ", " + newInterval[1] + "]");
		}
		System.out.println(
				"newInterval = [" + (
						newInterval == null || newInterval.length < 1
								? ""
								: (newInterval[0] + ", " + newInterval[1])
				) + "]");
		int[][] results = insertInterval.insert(intervals, newInterval);

		print(results, "Output: ");
		System.out.println();
		return results;
	}

	private void print(int[][] intervals, String prefix) {
		System.out.print(prefix);
		if (intervals == null) {
			System.out.println(intervals);
			return;
		}
		if (intervals.length < 1) {
			System.out.println("[]");
			return;
		}
		for (int[] interval : intervals) {
			System.out.print("[" + interval[0] + ", " + interval[1] + "]");
		}
		System.out.println();
	}

}
