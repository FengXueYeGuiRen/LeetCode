package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 345. Reverse Vowels of a String
 * 345. 反转字符串中的元音字母
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseVowelsOfAStringTest {

	@InjectMocks
	private ReverseVowelsOfAString reverseVowelsOfAString;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reverseVowels() {
		String s = "leetcode";
		String reverse = reverseVowels(s);
		assertEquals("leotcede", reverse);

		s = "hello";
		reverse = reverseVowels(s);
		assertEquals("holle", reverse);
	}

	private String reverseVowels(String s) {
		System.out.println("Input: " + s);

		String reverse = reverseVowelsOfAString.reverseVowels(s);

		System.out.println("Output: " + reverse);
		System.out.println();
		return reverse;
	}

}
