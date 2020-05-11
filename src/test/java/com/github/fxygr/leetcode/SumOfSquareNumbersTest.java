package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 633. Sum of Square Numbers
 * 633. 平方数之和
 *
 * @author FXYGR @date 2020-05-09
 */
public class SumOfSquareNumbersTest {

	@InjectMocks
	private SumOfSquareNumbers sumOfSquareNumbers;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void judgeSquareSum() {
		int c = 2147483645;
		boolean isSquareSum = judgeSquareSum(c);
		assertFalse(isSquareSum);

		c = 2147483646;
		isSquareSum = judgeSquareSum(c);
		assertFalse(isSquareSum);

		c = 12132321;
		isSquareSum = judgeSquareSum(c);
		assertFalse(isSquareSum);

		c = 999999999;
		isSquareSum = judgeSquareSum(c);
		assertFalse(isSquareSum);

		c = 0;
		isSquareSum = judgeSquareSum(c);
		assertTrue(isSquareSum);

		c = 4;
		isSquareSum = judgeSquareSum(c);
		assertTrue(isSquareSum);

		c = 5;
		isSquareSum = judgeSquareSum(c);
		assertTrue(isSquareSum);

		c = 3;
		isSquareSum = judgeSquareSum(c);
		assertFalse(isSquareSum);
	}

	private boolean judgeSquareSum(int c) {
		System.out.println("Input: " + c);
		boolean isSquareSum = sumOfSquareNumbers.judgeSquareSum(c);

		System.out.println("Output: " + isSquareSum);
		System.out.println();
		return isSquareSum;
	}

}
