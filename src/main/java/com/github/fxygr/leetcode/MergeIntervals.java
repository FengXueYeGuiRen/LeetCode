package com.github.fxygr.leetcode;

import java.util.Arrays;
import java.util.Comparator;

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
		if (intervals == null || intervals.length <= 0) {
			return new int[][]{};
		}
		sort(intervals);

		int[][] results = new int[intervals.length][intervals[0].length];
		int resultIndex = 0;

		results[resultIndex][0] = intervals[0][0];
		results[resultIndex][1] = intervals[0][1];

		for (int i = 1; i < intervals.length; ++i) {
			if (results[resultIndex][1] >= intervals[i][0]) {
				if (results[resultIndex][1] < intervals[i][1]) {
					results[resultIndex][1] = intervals[i][1];
				}
				continue;
			}
			results[++resultIndex][0] = intervals[i][0];
			results[resultIndex][1] = intervals[i][1];
		}
		return Arrays.copyOf(results, resultIndex + 1);
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
