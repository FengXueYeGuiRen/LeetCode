package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 13. Roman to Integer
 * 13. 罗马数字转整数
 *
 * @author FXYGR @date 2020-05-14
 */
public class RomanToIntegerTest {

	@InjectMocks
	private RomanToInteger romanToInteger;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void romanToInt() {
	}

	private int romanToInt(String s) {
		System.out.println("Input: " + s);

		int integer = romanToInteger.romanToInt(s);

		System.out.println("Output: " + integer);
		System.out.println();
		return integer;
	}

}
