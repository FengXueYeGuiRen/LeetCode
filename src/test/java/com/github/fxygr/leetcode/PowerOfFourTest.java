package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 326. Power of Four
 * 326. 4的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfFourTest {

	@InjectMocks
	private PowerOfFour powerOfFour;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isPowerOfFour() {
		int n = 16;
		boolean isPowerOfFour = isPowerOfFour(n);
		assertTrue(isPowerOfFour);

		n = 5;
		isPowerOfFour = isPowerOfFour(n);
		assertFalse(isPowerOfFour);

		n = 4;
		isPowerOfFour = isPowerOfFour(n);
		assertTrue(isPowerOfFour);

		n = 3;
		isPowerOfFour = isPowerOfFour(n);
		assertFalse(isPowerOfFour);

		n = 2;
		isPowerOfFour = isPowerOfFour(n);
		assertFalse(isPowerOfFour);

		n = 1;
		isPowerOfFour = isPowerOfFour(n);
		assertTrue(isPowerOfFour);

		n = 0;
		isPowerOfFour = isPowerOfFour(n);
		assertFalse(isPowerOfFour);
	}

	private boolean isPowerOfFour(int n) {
		System.out.println("Input: " + n);

		boolean isPowerOfFour = powerOfFour.isPowerOfFour(n);

		System.out.println("Output: " + isPowerOfFour);
		System.out.println();
		return isPowerOfFour;
	}

}
