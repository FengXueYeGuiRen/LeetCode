package com.github.fxygr.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1029. Two City Scheduling
 * (https://leetcode.com/problems/two-city-scheduling/)
 * 1029. 两地调度
 *
 * @author FXYGR @date 2020-06-03
 */
public class TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {
		int cost = 0;

		Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] a1, int[] a2) {
				return Integer.compare(Math.abs(a2[0] - a2[1]), Math.abs(a1[0] - a1[1]));
			}
		});
		int aCount = 0, bCount = 0;
		int n = costs.length / 2;
		for (int i = 0; i < costs.length; ++i) {
			if (aCount >= n || bCount >= n) {
				int j = aCount < bCount ? 0 : 1;
				cost += costs[i][j];

				continue;
			}// aCount < n && bCount < n
			if (costs[i][0] < costs[i][1]) {
				cost += costs[i][0];
				++aCount;

				continue;
			}// costs[i][0] > costs[i][1]
			cost += costs[i][1];
			++bCount;
		}
		return cost;
	}

}
