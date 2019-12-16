package com.github.fxygr.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56. Merge Intervals
 * (https://leetcode.com/problems/merge-intervals/)
 * 56. 合并区间
 * (https://leetcode-cn.com/problems/merge-intervals/)
 *
 * @author FXYGR @date 2019-12-10
 */
public class MergeIntervals {

	public int[][] merge(int[][] intervals) {
		if (intervals == null || intervals.length <= 1) {
			return intervals;
		}
		sort(intervals);

		int[][] results = new int[intervals.length][intervals[0].length];
		int resultIndex = 0;

		results[resultIndex][0] = intervals[0][0];
		results[resultIndex][1] = intervals[0][1];

		for (int i = 1; i < intervals.length; ++i) {
			//  overlapping
			if (results[resultIndex][1] >= intervals[i][0]) {
				//  right
				results[resultIndex][1] =
						Integer.max(results[resultIndex][1], intervals[i][1]);
				continue;
			}
			//  non-overlapping
			//  left
			results[++resultIndex][0] = intervals[i][0];
			//  right
			results[resultIndex][1] = intervals[i][1];
		}
		return Arrays.copyOf(results, resultIndex + 1);
	}

	private void sort(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] i1, int[] i2) {
				return Integer.compare(i1[0], i2[0]);
			}
		});
	}

	public int[][] mergeByArrayList(int[][] intervals) {
		if (intervals == null || intervals.length <= 1) {
			return intervals;
		}
		sort(intervals);

		List<int[]> list = new ArrayList<>(intervals.length * (2 / 3));

		int left, right;
		for (int i = 0; i < intervals.length; ++i) {
			left = intervals[i][0];
			right = intervals[i][1];
			//  overlapping
			while (i < (intervals.length - 1) && right >= intervals[i + 1][0]) {
				right = Integer.max(right, intervals[++i][1]);
			}
			list.add(new int[]{left, right});
		}
		return list.toArray(new int[list.size()][intervals[0].length]);
	}

}
