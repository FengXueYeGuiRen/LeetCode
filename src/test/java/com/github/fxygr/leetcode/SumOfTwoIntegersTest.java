package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 371. Sum of Two Integers
 * 371. 两整数之和
 *
 * @author FXYGR @date 2020-03-03
 */
public class SumOfTwoIntegersTest {

	@InjectMocks
	private SumOfTwoIntegers sumOfTwoIntegers;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void getSum() {
		int a = 1, b = 2;
		int sum = getSum(a, b);
		assertEquals(3, sum);

		a = -2;
		b = 3;
		sum = getSum(a, b);
		assertEquals(1, sum);

		a = 0;
		b = 0;
		sum = getSum(a, b);
		assertEquals(0, sum);
	}

	public int getSum(int a, int b) {
		System.out.println("Input: " + a + " + " + b);

		int sum = sumOfTwoIntegers.getSum(a, b);

		System.out.println("Output: " + sum);
		System.out.println();
		return sum;
	}

}
