package com.github.fxygr.leetcode;

/**
 * 121. Best Time to Buy and Sell Stock
 * (https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 * 121. 买卖股票的最佳时机
 * (https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)
 *
 * @author FXYGR @date 2020-03-09
 */
public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 0) {
			return 0;
		}
		int maxProfit = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] <= minPrice) {
				minPrice = prices[i];
				continue;
			}
			maxProfit = Math.max(prices[i] - minPrice, maxProfit);
		}
		return maxProfit < 0 ? 0 : maxProfit;
	}

}
