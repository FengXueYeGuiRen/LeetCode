package com.github.fxygr.leetcode;

/**
 * 1103. Distribute Candies to People
 * (https://leetcode.com/problems/distribute-candies-to-people/)
 * 1103. 分糖果 II
 * (https://leetcode-cn.com/problems/distribute-candies-to-people/)
 *
 * @author FXYGR @date 2020-03-05
 */
public class DistributeCandiesToPeople {

	public int[] distributeCandies(int candies, int num_people) {
		int[] results = new int[num_people];

		int remains = candies;
		int peopleIndex = 0;

		for (int distributes = 1; distributes < remains; ++distributes) {

			results[peopleIndex % num_people] += distributes;
			++peopleIndex;

			remains -= distributes;
		}
		if (remains > 0) {
			results[peopleIndex % num_people] += remains;
		}
		return results;
	}

}
