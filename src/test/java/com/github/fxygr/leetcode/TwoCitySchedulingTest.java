package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1029. Two City Scheduling
 * 1029. 两地调度
 *
 * @author FXYGR @date 2020-06-03
 */
public class TwoCitySchedulingTest {

	@InjectMocks
	private TwoCityScheduling twoCityScheduling;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void twoCitySchedCost() {
		int[][] costs = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
		int cost = twoCitySchedCost(costs);
		assertEquals(110, cost);
	}

	private int twoCitySchedCost(int[][] costs) {
		StdOut.println(costs, "Input: ");

		int cost = twoCityScheduling.twoCitySchedCost(costs);

		System.out.println("Output: " + cost);
		System.out.println();
		return cost;
	}

}
