package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 7. Reverse Integer
 * 7. 整数反转
 *
 * @author FXYGR @date 2020-05-28
 */
public class ReverseIntegerTest {

	@InjectMocks
	private ReverseInteger reverseInteger;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reverse() {
		int integer = 1534236469;
		int reverse = reverse(integer);
		assertEquals(0, reverse);

		integer = 123;
		reverse = reverse(integer);
		assertEquals(321, reverse);

		integer = -123;
		reverse = reverse(integer);
		assertEquals(-321, reverse);

		integer = 120;
		reverse = reverse(integer);
		assertEquals(21, reverse);
	}

	private int reverse(int x) {
		System.out.println("Input: " + x);

		int reverse = reverseInteger.reverse(x);

		System.out.println("Output: " + reverse);
		System.out.println();
		return reverse;
	}

}
