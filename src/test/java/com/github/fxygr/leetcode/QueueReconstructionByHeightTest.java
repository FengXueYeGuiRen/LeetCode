package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 406. Queue Reconstruction by Height
 * 406. 根据身高重建队列
 *
 * @author FXYGR @date 2020-06-06
 */
public class QueueReconstructionByHeightTest {

	@InjectMocks
	private QueueReconstructionByHeight queueReconstructionByHeight;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void reconstructQueue() {
		int[][] people = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
		int[][] result = reconstructQueue(people);
		assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}}, result);
	}

	private int[][] reconstructQueue(int[][] people) {
		StdOut.println(people, "Input: ");

		int[][] result = queueReconstructionByHeight.reconstructQueue(people);

		StdOut.println(people, "Output: ");
		return result;
	}

}
