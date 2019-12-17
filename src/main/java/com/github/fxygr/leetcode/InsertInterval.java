package com.github.fxygr.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. Insert Interval
 * (https://leetcode.com/problems/insert-interval/)
 * 57. 插入区间
 * (https://leetcode-cn.com/problems/insert-interval/)
 *
 * @author FXYGR @date 2019-12-16
 */
public class InsertInterval {

	public int[][] insert(int[][] intervals, int[] newInterval) {
		if (newInterval == null || newInterval.length < 1) {
			return intervals;
		}
		//  newInterval.length >= 1
		if (intervals == null || intervals.length < 1 || intervals[0].length < 1) {
			return new int[][]{newInterval};
		}
		int resultsSize;

		int insertIndex = binarySearch(newInterval[0], intervals);
		resultsSize = insertIndex < 1 ? 0 : insertIndex - 1;

		List<int[]> mergeds = new ArrayList<>((intervals.length - insertIndex) / 2);
		int mergedEndIndex = merge(mergeds, newInterval, intervals, insertIndex);

		resultsSize += mergeds.size();
		resultsSize += intervals.length - mergedEndIndex;

		int[][] results = new int[resultsSize][intervals[0].length];
		int resultsIndex = 0;
		for (int i = 0; i < insertIndex - 1; ++i) {
			results[resultsIndex][0] = intervals[i][0];
			results[resultsIndex++][1] = intervals[i][1];
		}
		for (int[] interval : mergeds) {
			results[resultsIndex][0] = interval[0];
			results[resultsIndex++][1] = interval[1];
		}
		for (int i = mergedEndIndex; i < intervals.length; ++i) {
			results[resultsIndex][0] = intervals[i][0];
			results[resultsIndex++][1] = intervals[i][1];
		}
		return results;
	}

	private int merge(List<int[]> mergings, int[] mergingInterval,
	                  int[][] intervals, int insertIndex) {
		int i = insertIndex - 1;

		int left, right;
		//  insertIndex < 1
		if (insertIndex > 0) {
			left = intervals[i][0];
			right = intervals[i][1];
			if (right >= mergingInterval[0]) {
				//  overlapping
				right = Math.max(mergingInterval[1], right);
			} else {
				mergings.add(new int[]{left, right});
				left = mergingInterval[0];
				right = mergingInterval[1];
			}
		} else {//  insertIndex == 0
			left = mergingInterval[0];
			right = mergingInterval[1];
		}
		for (++i; i < intervals.length; ++i) {
			if (right >= intervals[i][0]) {
				//  overlapping
				right = Math.max(intervals[i][1], right);
				continue;
			}
			break;
		}
		mergings.add(new int[]{left, right});
		return i;
	}

	/**
	 * 二分查找
	 *
	 * @param key
	 * @param intervals
	 * @return
	 */
	private int binarySearch(int key, int[][] intervals) {
		int index = 0;

		int lo = 0, hi = intervals.length - 1;

		int mid;
		int midKey;

		while (lo <= hi) {
			mid = (lo + hi) / 2;
			midKey = intervals[mid][0];
			if (key < midKey) {
				hi = mid - 1;
				continue;
			}
			if (key > midKey) {
				index = lo = mid + 1;
				continue;
			}
			//  key == intervals[mid][0]
			index = mid;
			break;
		}
		return index;
	}

}
