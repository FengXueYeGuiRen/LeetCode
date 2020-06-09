package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1431. Kids With the Greatest Number of Candies
 * 1431. 拥有最多糖果的孩子
 *
 * @author FXYGR @date 2020-06-09
 */
public class KidsWithTheGreatestNumberOfCandiesTest {

	@InjectMocks
	private KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void kidsWithCandies() {
		int[] candies = new int[]{2, 3, 5, 1, 3};
		int extraCandies = 3;
		List<Boolean> kindWithCandies = kidsWithCandies(candies, extraCandies);
		assertEquals(
				Arrays.asList(new Boolean[]{true, true, true, false, true}),
				kindWithCandies);

		candies = new int[]{4, 2, 1, 1, 2};
		extraCandies = 1;
		kindWithCandies = kidsWithCandies(candies, extraCandies);
		assertEquals(
				Arrays.asList(new Boolean[]{true, false, false, false, false}),
				kindWithCandies);
	}

	private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		System.out.println(
				"Input: candies = " + Arrays.toString(candies) + ", extraCandies = " + extraCandies);

		List<Boolean> kidsWithCandies =
				kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

		System.out.println("Output: " + kidsWithCandies);
		System.out.println();
		return kidsWithCandies;
	}

}
