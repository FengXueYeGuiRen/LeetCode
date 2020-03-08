package com.github.fxygr.leetcode;

import java.util.Arrays;

/**
 * 322. Coin Change
 * (https://leetcode.com/problems/coin-change/)
 * 322. 零钱兑换
 * (https://leetcode-cn.com/problems/coin-change/)
 *
 * @author FXYGR @date 2020-03-08
 */
public class CoinChange {

	public int coinChange(int[] coins, int amount) {
		if (amount == 0) {
			return 0;
		}
		int[] counts = new int[coins.length];
		Arrays.sort(coins);

		int remain = Integer.MAX_VALUE;
		int leastCount = amount / coins[0];
		for (int i = 0; i <= leastCount; ++i) {
			remain = amount;
			for (int j = coins.length - 1; j >= 0; --j) {
				counts[j] = remain / coins[j];
				counts[j] = counts[j] < i ? 0 : counts[j] - i;

				remain -= counts[j] * coins[j];
				if (remain == 0) {
					break;
				}
			}
			if (remain == 0) {
				break;
			}
		}
		if (remain != 0) {
			return -1;
		}
		int count = 0;
		for (int c : counts) {
			count += c;
		}
		System.out.println(Arrays.toString(coins) + ": " + Arrays.toString(counts));
		return count;
	}

}
