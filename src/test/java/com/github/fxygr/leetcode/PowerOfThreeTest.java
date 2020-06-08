package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 326. Power of Three
 * 326. 3的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfThreeTest {

	@InjectMocks
	private PowerOfThree powerOfThree;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isPowerOfThree() {
		int n = 6;
		boolean isPowerOfThree = isPowerOfThree(n);
		assertFalse(isPowerOfThree);

		n = 1;
		isPowerOfThree = isPowerOfThree(n);
		assertTrue(isPowerOfThree);

		n = 2;
		isPowerOfThree = isPowerOfThree(n);
		assertFalse(isPowerOfThree);

		n = 27;
		isPowerOfThree = isPowerOfThree(n);
		assertTrue(isPowerOfThree);

		n = 0;
		isPowerOfThree = isPowerOfThree(n);
		assertFalse(isPowerOfThree);

		n = 9;
		isPowerOfThree = isPowerOfThree(n);
		assertTrue(isPowerOfThree);

		n = 45;
		isPowerOfThree = isPowerOfThree(n);
		assertFalse(isPowerOfThree);
	}

	private boolean isPowerOfThree(int n) {
		System.out.println("Input: " + n);

		boolean isPowerOfThree = powerOfThree.isPowerOfThree(n);

		System.out.println("Output: " + isPowerOfThree);
		System.out.println();
		return isPowerOfThree;
	}

}
