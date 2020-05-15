package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 12. Integer to Roman
 * 12. 整数转罗马数字
 *
 * @author FXYGR @date 2020-05-15
 */
public class IntegerToRomanTest {

	@InjectMocks
	private IntegerToRoman integerToRoman;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void intToRoman() {
		int num = 20;
		String roman = intToRoman(num);
		assertEquals("XX", roman);

		num = 30;
		roman = intToRoman(num);
		assertEquals("XXX", roman);

		num = 1994;
		roman = intToRoman(num);
		assertEquals("MCMXCIV", roman);

		num = 58;
		roman = intToRoman(num);
		assertEquals("LVIII", roman);

		num = 9;
		roman = intToRoman(num);
		assertEquals("IX", roman);

		num = 4;
		roman = intToRoman(num);
		assertEquals("IV", roman);

		num = 3;
		roman = intToRoman(num);
		assertEquals("III", roman);

		num = 2;
		roman = intToRoman(num);
		assertEquals("II", roman);

		num = 1;
		roman = intToRoman(num);
		assertEquals("I", roman);
	}

	private String intToRoman(int num) {
		System.out.println("Input: " + num);

		String roman = integerToRoman.intToRoman(num);

		System.out.println("Output: " + roman);
		System.out.println();
		return roman;
	}

}
