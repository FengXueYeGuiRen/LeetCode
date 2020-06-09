package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 792. Number of Matching Subsequences
 * 792. 匹配子序列的单词数
 *
 * @author FXYGR @date 2020-06-09
 */
public class NumberOfMatchingSubsequencesTest {

	@InjectMocks
	private NumberOfMatchingSubsequences numberOfMatchingSubsequences;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void numMatchingSubseq() {
		String S = "abcde";
		String[] words = new String[]{"a", "bb", "acd", "ace"};
		int matchingNum = numMatchingSubseq(S, words);
		assertEquals(3, matchingNum);
	}

	private int numMatchingSubseq(String S, String[] words) {
		System.out.println("Input: S = " + S + ", words = " + Arrays.toString(words));

		int matchingNum = numberOfMatchingSubsequences.numMatchingSubseq(S, words);

		System.out.println("Output: " + matchingNum);
		System.out.println();
		return matchingNum;
	}

}
