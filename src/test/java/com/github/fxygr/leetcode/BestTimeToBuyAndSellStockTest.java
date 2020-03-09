package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 121. Best Time to Buy and Sell Stock
 * 121. 买卖股票的最佳时机
 *
 * @author FXYGR @date 2020-03-09
 */
public class BestTimeToBuyAndSellStockTest {

	@InjectMocks
	private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void maxProfit() {
		int[] prices = {2, 4, 1};
		int profit = maxProfit(prices);
		assertEquals(2, profit);

		prices = new int[]{7, 1, 5, 3, 6, 4};
		profit = maxProfit(prices);
		assertEquals(5, profit);

		prices = new int[]{7, 6, 4, 3, 1};
		profit = maxProfit(prices);
		assertEquals(0, profit);
	}

	private int maxProfit(int[] prices) {
		System.out.println("Input: " + Arrays.toString(prices));
		int profit = bestTimeToBuyAndSellStock.maxProfit(prices);
		System.out.println("Output: " + profit);
		System.out.println();
		return profit;
	}

}
