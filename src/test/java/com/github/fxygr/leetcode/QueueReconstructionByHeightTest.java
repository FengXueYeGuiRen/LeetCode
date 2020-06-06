package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StdOut;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

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
	}

	private int[][] reconstructQueue(int[][] people) {
		StdOut.println(people, "Input: ");

		int[][] result = queueReconstructionByHeight.reconstructQueue(people);

		StdOut.println(people, "Output: ");
		return result;
	}

}
