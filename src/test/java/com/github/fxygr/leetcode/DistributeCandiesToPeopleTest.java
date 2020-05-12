package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1103. Distribute Candies to People
 * 1103. 分糖果 II
 *
 * @author FXYGR @date 2020-03-05
 */
public class DistributeCandiesToPeopleTest {

	@InjectMocks
	private DistributeCandiesToPeople distributeCandiesToPeople;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void distributeCandies() {
		int candies = 7;
		int num_people = 4;
		int[] results = distributeCandies(candies, num_people);
		assertEquals(num_people, results.length);
		assertTrue(Arrays.equals(new int[]{1, 2, 3, 1}, results));

		candies = 10;
		num_people = 3;
		results = distributeCandies(candies, num_people);
		assertEquals(num_people, results.length);
		assertTrue(Arrays.equals(new int[]{5, 2, 3}, results));
	}

	private int[] distributeCandies(int candies, int num_people) {
		System.out.println("Input: candies = " + candies + ", num_people = " + num_people);

		int[] results = distributeCandiesToPeople.distributeCandies(candies, num_people);

		StdOut.println(results, "Output: ");
		System.out.println();
		return results;
	}

}
