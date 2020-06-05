package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 14. Longest Common Prefix
 * 14. 最长公共前缀
 *
 * @author FXYGR @date 2020-06-05
 */
public class LongestCommonPrefixTest {

	@InjectMocks
	private LongestCommonPrefix longestCommonPrefix;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void longestCommonPrefix() {
		String[] strs = new String[]{"flower", "flow", "flight"};
		String longestPrefix = longestCommonPrefix(strs);
		assertEquals("fl", longestPrefix);

		strs = new String[]{"dog", "racecar", "car"};
		longestPrefix = longestCommonPrefix(strs);
		assertEquals("", longestPrefix);
	}

	private String longestCommonPrefix(String[] strs) {
		System.out.println("Input: " + Arrays.toString(strs));

		String longestPrefix = longestCommonPrefix.longestCommonPrefix(strs);

		System.out.println("Output: " + longestPrefix);
		System.out.println();
		return longestPrefix;
	}

}
