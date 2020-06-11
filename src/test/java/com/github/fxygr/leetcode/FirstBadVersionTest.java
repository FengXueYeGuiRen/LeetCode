package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 278. First Bad Version
 * 278. 第一个错误的版本
 *
 * @author FXYGR @date 2020-06-11
 */
public class FirstBadVersionTest {

	@InjectMocks
	private FirstBadVersion firstBadVersion;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void firstBadVersion() {
		int n = 5;
		int firstBV = firstBadVersion(n);
		assertEquals(firstBadVersion.getBadVersion(), firstBV);
	}

	private int firstBadVersion(int n) {
		System.out.println("Input: " + n);

		int firstBV = firstBadVersion.firstBadVersion(n);

		System.out.println("Output: " + firstBV);
		System.out.println();
		return firstBV;
	}

}
