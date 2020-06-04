package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 557. Reverse Words in a String III
 * 557. 反转字符串中的单词 III
 *
 * @author FXYGR @date 2020-06-04
 */
public class ReverseWordsInAStringIIITest {

	@InjectMocks
	private ReverseWordsInAStringIII reverseWordsInAStringIII;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reverseWords() {
		String s = "Let's take LeetCode contest";
		String reverse = reverseWords(s);
		assertEquals("s'teL ekat edoCteeL tsetnoc", reverse);
	}

	private String reverseWords(String s) {
		System.out.println("Input: " + s);

		String reverse = reverseWordsInAStringIII.reverseWords(s);

		System.out.println("Output: " + reverse);
		System.out.println();
		return reverse;
	}

}
