package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 541. Reverse String II
 * 541. 反转字符串 II
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseStringIITest {

	@InjectMocks
	private ReverseStringII reverseStringII;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reverseStr() {
	}

	private String reverseStr(String s, int k) {
		System.out.println("Input: s = " + s + ", k = " + k);

		String reverse = reverseStringII.reverseStr(s, k);

		System.out.println("Output: " + reverse);
		System.out.println();
		return reverse;
	}

}
