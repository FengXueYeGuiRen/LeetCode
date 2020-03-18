package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 836. Rectangle Overlap
 * 836. 矩形重叠
 *
 * @author FXYGR @date 2020-03-18
 */
public class RectangleOverlapTest {

	@InjectMocks
	private RectangleOverlap rectangleOverlap;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void isRectangleOverlap() {
		int[] rec1 = {0, 0, 2, 2};
		int[] rec2 = {1, 1, 3, 3};
		boolean isOverlap = isRectangleOverlap(rec1, rec2);
		assertTrue(isOverlap);

		rec1 = new int[]{0, 0, 2, 2};
		rec2 = new int[]{0, 0, 2, 2};
		isOverlap = isRectangleOverlap(rec1, rec2);
		assertTrue(isOverlap);

		rec1 = new int[]{1, 1, 3, 3};
		rec2 = new int[]{1, 1, 3, 3};
		isOverlap = isRectangleOverlap(rec1, rec2);
		assertTrue(isOverlap);

		rec1 = new int[]{0, 0, 1, 1};
		rec2 = new int[]{1, 0, 2, 1};
		isOverlap = isRectangleOverlap(rec1, rec2);
		assertFalse(isOverlap);
	}

	private boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		System.out.println("Input: rec1 = " + Arrays.toString(rec1) + ", rec2 = " + Arrays.toString(rec2));

		boolean isOverlap = rectangleOverlap.isRectangleOverlap(rec1, rec2);

		System.out.println("Output: " + isOverlap);
		System.out.println();
		return isOverlap;
	}

}
