package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
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
		String romanNumeral = "III";
		int integer = romanToInt(romanNumeral);
		assertEquals(3, integer);

		romanNumeral = "IV";
		integer = romanToInt(romanNumeral);
		assertEquals(4, integer);

		romanNumeral = "IX";
		integer = romanToInt(romanNumeral);
		assertEquals(9, integer);

		romanNumeral = "MCMXCIV";
		integer = romanToInt(romanNumeral);
		assertEquals(1994, integer);
	}

	private int romanToInt(String s) {
		System.out.println("Input: " + s);

		int integer = romanToInteger.romanToInt(s);

		System.out.println("Output: " + integer);
		System.out.println();
		return integer;
	}

}
