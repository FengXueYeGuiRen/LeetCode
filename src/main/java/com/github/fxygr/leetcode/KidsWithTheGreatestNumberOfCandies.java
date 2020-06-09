package com.github.fxygr.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1431. Kids With the Greatest Number of Candies
 * (https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
 * 1431. 拥有最多糖果的孩子
 *
 * @author FXYGR @date 2020-06-09
 */
public class KidsWithTheGreatestNumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		if (candies == null || candies.length < 1 || extraCandies < 1) {
			return Collections.emptyList();
		}

		List<Boolean> kidsWithCandies = new ArrayList<>(candies.length);

		int greatestCandies = greatestCandies(candies);

		for (int i = 0; i < candies.length; ++i) {
			if (candies[i] + extraCandies >= greatestCandies) {
				kidsWithCandies.add(true);
				continue;
			}
			kidsWithCandies.add(false);
		}
		return kidsWithCandies;
	}

	private int greatestCandies(int[] candies) {
		int i = 0;
		int greatestCandies = candies[i++];
		for (; i < candies.length; ++i) {
			if (candies[i] > greatestCandies) {
				greatestCandies = candies[i];
			}
		}
		return greatestCandies;
	}

}
