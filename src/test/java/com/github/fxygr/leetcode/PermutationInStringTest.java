package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 567. Permutation in String
 * 567. 字符串的排列
 *
 * @author FXYGR @date 2020-05-18
 */
public class PermutationInStringTest {

	@InjectMocks
	private PermutationInString permutationInString;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void checkInclusion() {
		String s1 = "adc";
		String s2 = "dcda";
		boolean inclusion = checkInclusion(s1, s2);
		assertTrue(inclusion);

		s1 = "ab";
		s2 = "eidbaooo";
		inclusion = checkInclusion(s1, s2);
		assertTrue(inclusion);

		s1 = "ab";
		s2 = "eidboaoo";
		inclusion = checkInclusion(s1, s2);
		assertFalse(inclusion);
	}

	private boolean checkInclusion(String s1, String s2) {
		System.out.println("Input: s1 = " + s1 + ", s2 = " + s2);

		boolean inclusion = permutationInString.checkInclusion(s1, s2);

		System.out.println("Output: " + inclusion);
		System.out.println();
		return inclusion;
	}

}
