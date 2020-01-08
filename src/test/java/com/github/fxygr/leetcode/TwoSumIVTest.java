package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.github.fxygr.leetcode.TwoSumIV.TreeNode;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 653. Two Sum IV - Input is a BST
 * 653. 两数之和 IV - 输入 BST
 *
 * @author FXYGR @date 2020-01-07
 */
public class TwoSumIVTest {

	@InjectMocks
	private TwoSumIV twoSumIV;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void twoSum() {
		Integer[] nums = {2, 0, 3, -4, 1};
		boolean result = twoSum(nums, -1);
		assertTrue(result);

		nums = new Integer[]{5, 3, 6, 2, 4, null, 7};
		result = twoSum(nums, 9);
		assertTrue(result);

		nums = new Integer[]{5, 3, 6, 2, 4, null, 7};
		result = twoSum(nums, 28);
		assertFalse(result);
	}

	private boolean twoSum(Integer[] nums, int target) {
		StdOut.println(nums, "Input: nums = ");
		StdOut.println("\ttarget = " + target);
		boolean result = twoSumIV.findTarget(createTree(nums), target);
		StdOut.println(result, "Output: ");
		StdOut.println();
		return result;
	}

	private TreeNode createTree(Integer[] nums) {
		if (nums == null || nums.length < 1) {
			return null;
		}
		int i = 0;
		TreeNode root = newNode(nums[i++]);

		Queue<TreeNode> treeNodeQueue = new ArrayDeque<>(nums.length);
		treeNodeQueue.offer(root);

		while (i < nums.length) {
			TreeNode node = treeNodeQueue.poll();

			TreeNode newNode = newNode(nums[i++]);
			if (newNode != null) {
				node.setLeft(newNode);
				treeNodeQueue.offer(node.getLeft());
			}
			if (i >= nums.length) {
				break;
			}
			newNode = newNode(nums[i++]);
			if (newNode != null) {
				node.setRight(newNode);
				treeNodeQueue.offer(node.getRight());
			}
		}
		return root;
	}

	private TreeNode newNode(Integer num) {
		if (num == null) {
			return null;
		}
		return new TreeNode(num);
	}

}
