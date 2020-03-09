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
		for (int i = 0; i < prices.length; ++i) {
			int greaterPrice = prices[i];
			for (int j = i + 1; j < prices.length; ++j) {
				greaterPrice = Math.max(prices[j], greaterPrice);
			}
			maxProfit = Math.max(greaterPrice - prices[i], maxProfit);
		}
		return maxProfit < 0 ? 0 : maxProfit;
	}

}
