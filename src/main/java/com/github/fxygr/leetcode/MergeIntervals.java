package com.github.fxygr.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 56. Merge Intervals(https://leetcode.com/problems/merge-intervals/)
 * 56. 合并区间(https://leetcode-cn.com/problems/merge-intervals/)
 *
 * @author FXYGR @date 2019-12-10
 */
public class MergeIntervals {

	public int[][] merge(int[][] intervals) {
		if (intervals == null || intervals.length <= 0) {
			return intervals;
		}
		sort(intervals);

		int[][] resultIntervals = new int[intervals.length][intervals[0].length];
		int resultIntervalIndex = 0;

		boolean overlapped = false;

		for (int i = 0; i < intervals.length; ++i) {
			if (!overlapped) {
				resultIntervals[resultIntervalIndex][0] = intervals[i][0];
			}
			if (intervals[i][0] < resultIntervals[resultIntervalIndex][0]) {
				resultIntervals[resultIntervalIndex][0] = intervals[i][0];
			}
			if (i == intervals.length - 1) {
				if (intervals[i][1] > resultIntervals[resultIntervalIndex][1]) {
					resultIntervals[resultIntervalIndex][1] = intervals[i][1];
				}
				++resultIntervalIndex;
				break;
			}
			if (intervals[i][1] >= intervals[i + 1][0]
					|| resultIntervals[resultIntervalIndex][1] >= intervals[i + 1][0]) {
				if (intervals[i][1] > resultIntervals[resultIntervalIndex][1]) {
					resultIntervals[resultIntervalIndex][1] = intervals[i][1];
				}
				if (intervals[i + 1][1] > resultIntervals[resultIntervalIndex][1]) {
					resultIntervals[resultIntervalIndex][1] = intervals[i + 1][1];
				}
				overlapped = true;
				continue;
			}
			if (intervals[i][1] > resultIntervals[resultIntervalIndex][1]) {
				resultIntervals[resultIntervalIndex][1] = intervals[i][1];
			}
			++resultIntervalIndex;
			overlapped = false;
		}
		return Arrays.copyOf(resultIntervals, resultIntervalIndex);
	}

	private void sort(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] i1, int[] i2) {
				int cmp = i1[0] - i2[0];
				if (cmp == 0) {
					return i1[1] - i2[1];
				}
				return cmp;
			}
		});
	}

}
