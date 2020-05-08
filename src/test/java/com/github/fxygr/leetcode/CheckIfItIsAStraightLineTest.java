package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

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
		int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
		boolean isStraightLine = checkStraightLine(coordinates);
		assertTrue(isStraightLine);
	}

	private boolean checkStraightLine(int[][] coordinates) {
		System.out.println("Input: " + Arrays.toString(coordinates));

		boolean isStraightLine = checkIfItIsAStraightLine.checkStraightLine(coordinates);

		System.out.println("Output: " + isStraightLine);
		System.out.println();
		return isStraightLine;
	}

}
