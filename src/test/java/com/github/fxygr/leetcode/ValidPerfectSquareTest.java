package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 367. Valid Perfect Square
 * 367. 有效的完全平方数
 *
 * @author FXYGR @date 2020-05-09
 */
public class ValidPerfectSquareTest {

	@InjectMocks
	private ValidPerfectSquare validPerfectSquare;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isPerfectSquare() {
		int num = 4;
		boolean isPerfectSquare = isPerfectSquare(num);
		assertTrue(isPerfectSquare);

		num = 9;
		isPerfectSquare = isPerfectSquare(num);
		assertTrue(isPerfectSquare);

		num = 1;
		isPerfectSquare = isPerfectSquare(num);
		assertTrue(isPerfectSquare);

		num = 16;
		isPerfectSquare = isPerfectSquare(num);
		assertTrue(isPerfectSquare);

		num = 14;
		isPerfectSquare = isPerfectSquare(num);
		assertFalse(isPerfectSquare);
	}

	private boolean isPerfectSquare(int num) {
		System.out.println("Input: " + num);
		boolean isPerfectSquare = validPerfectSquare.isPerfectSquare(num);

		System.out.println("Output: " + isPerfectSquare);
		System.out.println();
		return isPerfectSquare;
	}

}
