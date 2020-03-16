package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 面试题 01.06. 字符串压缩
 *
 * @author FXYGR @date 2020-03-16
 */
public class CompressStringLcciTest {

	@InjectMocks
	private CompressStringLcci compressStringLcci;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void compressString() {
		String s = "aabcccccaaa";
		String compressStr = compressString(s);
		assertEquals("a2b1c5a3", compressStr);

		s = "abbccd";
		compressStr = compressString(s);
		assertEquals("abbccd", compressStr);
	}

	private String compressString(String s) {
		System.out.println("Input: " + s);

		String compressStr = compressStringLcci.compressString(s);

		System.out.println("Output: " + compressStr);
		return compressStr;
	}

}
