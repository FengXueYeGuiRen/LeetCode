package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 322. 零钱兑换
 *
 * @author FXYGR @date 2020-03-08
 */
public class CoinChangeTest {

	@InjectMocks
	private CoinChange coinChange;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void coinChange() {
		int[] coins = {186, 419, 83, 408};
		int amount = 6249;
		int count = coinChange(coins, amount);
		assertEquals(-1, count);

		coins = new int[]{2, 5, 10, 1};
		amount = 27;
		count = coinChange(coins, amount);
		assertEquals(4, count);

		coins = new int[]{2, 5, 10, 1};
		amount = 29;
		count = coinChange(coins, amount);
		assertEquals(5, count);

		coins = new int[]{1, 2, 5};
		amount = 0;
		count = coinChange(coins, amount);
		assertEquals(0, count);

		coins = new int[]{1, 2, 5};
		amount = 1;
		count = coinChange(coins, amount);
		assertEquals(1, count);

		coins = new int[]{1, 2, 5};
		amount = 2;
		count = coinChange(coins, amount);
		assertEquals(1, count);

		coins = new int[]{1, 2, 5};
		amount = 3;
		count = coinChange(coins, amount);
		assertEquals(2, count);

		coins = new int[]{1, 2, 5};
		amount = 4;
		count = coinChange(coins, amount);
		assertEquals(2, count);

		coins = new int[]{1, 2, 5};
		amount = 5;
		count = coinChange(coins, amount);
		assertEquals(1, count);

		coins = new int[]{1, 2, 5};
		amount = 6;
		count = coinChange(coins, amount);
		assertEquals(2, count);

		coins = new int[]{1, 2, 5};
		amount = 7;
		count = coinChange(coins, amount);
		assertEquals(2, count);

		coins = new int[]{1, 2, 5};
		amount = 8;
		count = coinChange(coins, amount);
		assertEquals(3, count);

		coins = new int[]{1, 2, 5};
		amount = 9;
		count = coinChange(coins, amount);
		assertEquals(3, count);

		coins = new int[]{1, 2, 5};
		amount = 10;
		count = coinChange(coins, amount);
		assertEquals(2, count);

		coins = new int[]{1, 2, 5};
		amount = 11;
		count = coinChange(coins, amount);
		assertEquals(3, count);

		coins = new int[]{1, 2, 5};
		amount = 12;
		count = coinChange(coins, amount);
		assertEquals(3, count);

		coins = new int[]{1, 2, 5};
		amount = 13;
		count = coinChange(coins, amount);
		assertEquals(4, count);

		coins = new int[]{2};
		amount = 1;
		count = coinChange(coins, amount);
		assertEquals(-1, count);

		coins = new int[]{2};
		amount = 2;
		count = coinChange(coins, amount);
		assertEquals(1, count);

		coins = new int[]{2};
		amount = 3;
		count = coinChange(coins, amount);
		assertEquals(-1, count);
	}

	private int coinChange(int[] coins, int amount) {
		System.out.println("Input: coins = " + Arrays.toString(coins) + ", amount = " + amount);

		int count = coinChange.coinChange(coins, amount);
		System.out.println("Output: " + count);
		System.out.println();
		return count;
	}

}
