package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 274. H-Index
 * 274. H 指数
 *
 * @author FXYGR @date 2020-06-18
 */
public class HIndexTest {

	@InjectMocks
	private HIndex hIndex;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void hIndex() {
		int[] citations = new int[]{3, 0, 6, 1, 5};
		int h = hIndex(citations);
		assertEquals(3, h);
	}

	private int hIndex(int[] citations) {
		System.out.println("Input: " + Arrays.toString(citations));

		int h = hIndex.hIndex(citations);

		System.out.println("Output: " + h);
		System.out.println();
		return h;
	}

}
