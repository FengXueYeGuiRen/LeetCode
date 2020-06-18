package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 275. H-Index II
 * 275. H 指数 II
 *
 * @author FXYGR @date 2020-06-18
 */
public class HIndexIITest {

	@InjectMocks
	private HIndexII hIndexII;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void hIndex() {
		int[] citations = new int[]{2, 7, 9, 3, 1};
		int h = hIndex(citations);
		assertEquals(3, h);

		citations = new int[]{1, 7, 9, 2};
		h = hIndex(citations);
		assertEquals(2, h);

		citations = new int[]{1, 2, 100};
		h = hIndex(citations);
		assertEquals(2, h);

		citations = new int[]{11, 15};
		h = hIndex(citations);
		assertEquals(2, h);

		citations = new int[]{0};
		h = hIndex(citations);
		assertEquals(0, h);

		citations = new int[]{100};
		h = hIndex(citations);
		assertEquals(1, h);

		citations = new int[]{3, 0, 6, 1, 5};
		h = hIndex(citations);
		assertEquals(3, h);

		citations = new int[]{0, 1, 3, 5, 6};
		h = hIndex(citations);
		assertEquals(3, h);
	}

	private int hIndex(int[] citations) {
		System.out.println("Input: " + Arrays.toString(citations));

		int h = hIndexII.hIndex(citations);

		System.out.println("Output: " + h);
		System.out.println();
		return h;
	}

}
