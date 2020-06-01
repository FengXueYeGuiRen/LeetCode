package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 9. Palindrome Number
 * 9. 回文数
 *
 * @author FXYGR @date 2020-06-01
 */
public class PalindromeNumberTest {

	@InjectMocks
	private PalindromeNumber palindromeNumber;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isPalindrome() {
		int num = 121;
		boolean isPalindrome = isPalindrome(num);
		assertTrue(isPalindrome);

		num = -121;
		isPalindrome = isPalindrome(num);
		assertFalse(isPalindrome);

		num = 10;
		isPalindrome = isPalindrome(num);
		assertFalse(isPalindrome);
	}

	private boolean isPalindrome(int x) {
		System.out.println("Input: " + x);

		boolean isPalindrome = palindromeNumber.isPalindrome(x);

		System.out.println("Output: " + isPalindrome);
		System.out.println();
		return isPalindrome;
	}

}
