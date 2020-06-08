package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 231. Power of Two
 * 231. 2的幂
 *
 * @author FXYGR @date 2020-06-08
 */
public class PowerOfTwoTest {

	@InjectMocks
	private PowerOfTwo powerOfTwo;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isPowerOfTwo() {
		int n = 218;
		boolean isPowerOfTwo = isPowerOfTwo(n);
		assertFalse(isPowerOfTwo);

		n = 16;
		isPowerOfTwo = isPowerOfTwo(n);
		assertTrue(isPowerOfTwo);

		n = 4;
		isPowerOfTwo = isPowerOfTwo(n);
		assertTrue(isPowerOfTwo);

		n = 3;
		isPowerOfTwo = isPowerOfTwo(n);
		assertFalse(isPowerOfTwo);

		n = 2;
		isPowerOfTwo = isPowerOfTwo(n);
		assertTrue(isPowerOfTwo);

		n = 1;
		isPowerOfTwo = isPowerOfTwo(n);
		assertTrue(isPowerOfTwo);
	}

	private boolean isPowerOfTwo(int n) {
		System.out.println("Input: " + n);

		boolean isPowerOfTwo = powerOfTwo.isPowerOfTwo(n);

		System.out.println("Output: " + isPowerOfTwo);
		System.out.println();
		return isPowerOfTwo;
	}

}
