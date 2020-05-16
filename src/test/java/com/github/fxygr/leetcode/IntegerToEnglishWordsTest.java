package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 273. Integer to English Words
 * 273. 整数转换英文表示
 *
 * @author FXYGR @date 2020-05-16
 */
public class IntegerToEnglishWordsTest {

	@InjectMocks
	private IntegerToEnglishWords integerToEnglishWords;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void numberToWords() {
		int num = 12345;
		String englishWords = numberToWords(num);
		assertEquals("Twelve Thousand Three Hundred Forty Five", englishWords);

		num = 123;
		englishWords = numberToWords(num);
		assertEquals("One Hundred Twenty Three", englishWords);
	}

	private String numberToWords(int num) {
		System.out.println("Input: " + num);

		String englishWords = integerToEnglishWords.numberToWords(num);

		System.out.println("Output: " + englishWords);
		System.out.println();
		return englishWords;
	}

}
