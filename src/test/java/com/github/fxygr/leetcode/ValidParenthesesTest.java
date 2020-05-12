package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 20. Valid Parentheses
 * 20. 有效的括号
 *
 * @author FXYGR @date 2020-05-12
 */
public class ValidParenthesesTest {

	@InjectMocks
	private ValidParentheses validParentheses;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isValid() {
		String s = "";
		boolean isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);

		s = "[]";
		isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);

		s = "{}";
		isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);

		s = "()";
		isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);

		s = "()[]{}";
		isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);

		s = "(]";
		isValidParentheses = isValid(s);
		assertFalse(isValidParentheses);

		s = "([)]";
		isValidParentheses = isValid(s);
		assertFalse(isValidParentheses);

		s = "{[]}";
		isValidParentheses = isValid(s);
		assertTrue(isValidParentheses);
	}

	private boolean isValid(String s) {
		System.out.println("Input: " + s);

		boolean isValidParentheses = validParentheses.isValid(s);

		System.out.println("Output: " + isValidParentheses);
		System.out.println();
		return isValidParentheses;
	}

}
