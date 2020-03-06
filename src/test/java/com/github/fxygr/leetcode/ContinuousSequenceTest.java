package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 面试题57 - II. 和为s的连续正数序列
 *
 * @author FXYGR @date 2020-03-06
 */
public class ContinuousSequenceTest {

	@InjectMocks
	private ContinuousSequence continuousSequence;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void findContinuousSequence() {
		int target = 1;
		int[][] sequences = findContinuousSequence(target);
		assertEquals(0, sequences.length);

		target = (int) Math.pow(10, 5);
		sequences = findContinuousSequence(target);
		assertEquals(5, sequences.length);

		target = 9;
		sequences = findContinuousSequence(target);
		assertEquals(2, sequences.length);

		target = 15;
		sequences = findContinuousSequence(target);
		assertEquals(3, sequences.length);
	}

	private int[][] findContinuousSequence(int target) {
		System.out.println("Input: " + target);
		int[][] sequences = continuousSequence.findContinuousSequence(target);
		System.out.println("Output: ");
		for (int[] sequence : sequences) {
			System.out.println(Arrays.toString(sequence));
		}
		System.out.println();
		return sequences;
	}

}
