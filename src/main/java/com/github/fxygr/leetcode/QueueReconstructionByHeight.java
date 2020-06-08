package com.github.fxygr.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 406. Queue Reconstruction by Height
 * (https://leetcode.com/problems/queue-reconstruction-by-height/)
 * 406. 根据身高重建队列
 *
 * @author FXYGR @date 2020-06-06
 */
public class QueueReconstructionByHeight {

	public int[][] reconstructQueue(int[][] people) {
		if (people == null || people.length < 1) {
			return people;
		}
		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] p1, int[] p2) {
				int compare = Integer.compare(p1[1], p2[1]);
				if (compare != 0) {
					return compare;
				}// compare == 0
				return Integer.compare(p1[0], p2[0]);
			}
		});
		sort(people);
		return people;
	}

	private int[][] sort(int[][] people) {
		for (int k = 2; k < people.length; ++k) {
			for (int i = k, j = k; j < people.length; ++j) {
				int[] peopleJ = people[j];
				if (i == j && peopleJ[1] == k) {
					++i;
					continue;
				}
				if (peopleJ[1] == k) {
					int z = j;
					while (z > i) {
						people[z] = people[--z];
					}
					people[i] = peopleJ;
					++i;
				}
			}
		}
		return people;
	}

}
