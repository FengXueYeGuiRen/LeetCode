package com.github.fxygr.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * 面试题57 - II. 和为s的连续正数序列
 * (https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)
 *
 * @author FXYGR @date 2020-03-06
 */
public class ContinuousSequence {

	public int[][] findContinuousSequence(int target) {
		List<int[]> sequences = new LinkedList();

		int mid = target / 2;
		int[] sequence;
		for (int lo = 1; lo < mid; lo++) {
			int hi = lo;

			int currentSum = lo;
			while (currentSum < target) {
				currentSum += ++hi;
			}
			while (currentSum > target) {
				currentSum -= lo++;
			}
			if (currentSum == target) {
				sequence = new int[(hi - lo) + 1];
				sequences.add(sequence);
				for (int i = sequence.length - 1; hi >= lo; --i) {
					sequence[i] = hi--;
				}
			}
		}
		return sequences.toArray(new int[sequences.size()][]);
	}

}
