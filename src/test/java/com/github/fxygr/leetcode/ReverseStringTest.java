package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 344. Reverse String
 * 344. 反转字符串
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseStringTest {

	@InjectMocks
	private ReverseString reverseString;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reverseString() {
		char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
		reverseString(s);
		assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, s);

		s = new char[]{'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
	}

	private void reverseString(char[] s) {
		System.out.println("Input: " + Arrays.toString(s));

		reverseString.reverseString(s);

		System.out.println("Output: " + Arrays.toString(s));
		System.out.println();
	}

}
