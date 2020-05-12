package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1232. Check If It Is a Straight Line
 * 1232. 缀点成线
 *
 * @author FXYGR @date 2020-05-08
 */
public class CheckIfItIsAStraightLineTest {

	@InjectMocks
	private CheckIfItIsAStraightLine checkIfItIsAStraightLine;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void checkStraightLine() {
		int[][] coordinates = new int[][]{{-3, -2}, {-1, -2}, {2, -2}, {-2, -2}, {0, -2}};
		boolean isStraightLine = checkStraightLine(coordinates);
		assertTrue(isStraightLine);

		coordinates = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
		isStraightLine = checkStraightLine(coordinates);
		assertTrue(isStraightLine);

		coordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
		isStraightLine = checkStraightLine(coordinates);
		assertFalse(isStraightLine);
	}

	private boolean checkStraightLine(int[][] coordinates) {
		StdOut.println(coordinates, "Input: ");

		boolean isStraightLine = checkIfItIsAStraightLine.checkStraightLine(coordinates);

		System.out.println("Output: " + isStraightLine);
		System.out.println();
		return isStraightLine;
	}

}
