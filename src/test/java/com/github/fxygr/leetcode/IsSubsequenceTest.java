package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 392. Is Subsequence
 * 392. 判断子序列
 *
 * @author FXYGR @date 2020-06-09
 */
public class IsSubsequenceTest {

	@InjectMocks
	private IsSubsequence isSubsequence;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isSubsequence() {
		String s = "abc";
		String t = "ahbgdc";
		boolean isSub = isSubsequence(s, t);
		assertTrue(isSub);

		s = "axc";
		t = "ahbgdc";
		isSub = isSubsequence(s, t);
		assertFalse(isSub);
	}

	private boolean isSubsequence(String s, String t) {
		System.out.println("Input: s = " + s + ", t = " + t);

		boolean isSub = isSubsequence.isSubsequence(s, t);

		System.out.println("Output: " + isSub);
		System.out.println();
		return isSub;
	}

}
