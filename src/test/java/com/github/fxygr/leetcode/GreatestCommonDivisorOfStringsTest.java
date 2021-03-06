package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1071. Greatest Common Divisor of Strings
 * 1071. 字符串的最大公因子
 *
 * @author FXYGR @date 2020-03-12
 */
public class GreatestCommonDivisorOfStringsTest {

	@InjectMocks
	private GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void gcdOfStrings() {
		String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
		String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
		String gcdOfStrings = gcdOfStrings(str1, str2);
		assertEquals("TAUXX", gcdOfStrings);

		str1 = "ABCABC";
		str2 = "ABC";
		gcdOfStrings = gcdOfStrings(str1, str2);
		assertEquals("ABC", gcdOfStrings);

		str1 = "ABABAB";
		str2 = "ABAB";
		gcdOfStrings = gcdOfStrings(str1, str2);
		assertEquals("AB", gcdOfStrings);

		str1 = "LEET";
		str2 = "CODE";
		gcdOfStrings = gcdOfStrings(str1, str2);
		assertEquals("", gcdOfStrings);
	}

	private String gcdOfStrings(String str1, String str2) {
		System.out.println("Input: str1 = " + str1 + ", str2 = " + str2);

		String gcdOfStrings = greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2);

		System.out.println("Output: " + gcdOfStrings);
		System.out.println();
		return gcdOfStrings;
	}

}
