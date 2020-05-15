package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

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
	}

	private String intToRoman(int num) {
		System.out.println("Input: " + num);

		String roman = integerToRoman.intToRoman(num);

		System.out.println("Output: " + roman);
		System.out.println();
		return roman;
	}

}
