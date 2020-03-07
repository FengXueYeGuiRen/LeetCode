package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 面试题59 - II. 队列的最大值
 *
 * @author FXYGR @date 2020-03-07
 */
public class MaxQueueTest {

	private MaxQueue maxQueue;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void maxQueue() {
		String[] methods = new String[]{"MaxQueue", "max_value", "pop_front", "max_value", "push_back", "max_value", "pop_front", "max_value", "pop_front", "push_back", "pop_front"};
		int[][] params = new int[][]{new int[0], new int[0], new int[0], new int[0], new int[]{46}, new int[0], new int[0], new int[0], new int[0], new int[]{868}, new int[0]};
		Integer[] results = maxQueue(methods, params);
		assertTrue(Arrays.equals(new Integer[]{null, -1, -1, -1, null, 46, 46, -1, -1, null, 868}, results));

		methods = new String[]{"MaxQueue", "pop_front", "pop_front", "pop_front", "pop_front", "pop_front", "push_back", "max_value", "push_back", "max_value"};
		params = new int[][]{new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[]{15}, new int[0], new int[]{9}, new int[0]};
		results = maxQueue(methods, params);
		assertTrue(Arrays.equals(new Integer[]{null, -1, -1, -1, -1, -1, null, 15, null, 15}, results));

		methods = new String[]{"MaxQueue", "push_back", "push_back", "max_value", "pop_front", "max_value"};
		params = new int[][]{new int[0], new int[]{1}, new int[]{2}, new int[0], new int[0], new int[0]};
		results = maxQueue(methods, params);
		assertTrue(Arrays.equals(new Integer[]{null, null, null, 2, 1, 2}, results));

		methods = new String[]{"MaxQueue", "pop_front", "max_value"};
		params = new int[][]{new int[0], new int[0], new int[0]};
		results = maxQueue(methods, params);
		assertTrue(Arrays.equals(new Integer[]{null, -1, -1}, results));
	}

	private Integer[] maxQueue(String[] methods, int[][] params) {
		System.out.println("Input: " + Arrays.toString(methods));
		System.out.print("[");
		for (int[] param : params) {
			System.out.print(Arrays.toString(param));
		}
		System.out.println("]");

		maxQueue = new MaxQueue();

		Integer[] results = new Integer[methods.length];
		Integer result;
		for (int i = 0; i < methods.length; ++i) {
			result = maxQueue(methods[i], params[i]);
			results[i] = result;
		}
		StdOut.println(results, "Output: ");
		System.out.println();
		return results;
	}

	private Integer maxQueue(String methodName, int[] param) {
		Integer result = null;
		switch (methodName) {
			case "MaxQueue":
				break;
			case "push_back":
				maxQueue.push_back(param[0]);
				break;
			case "max_value":
				result = maxQueue.max_value();
				break;
			case "pop_front":
				result = maxQueue.pop_front();
				break;
			default:
				result = null;
		}
		return result;
	}

}
