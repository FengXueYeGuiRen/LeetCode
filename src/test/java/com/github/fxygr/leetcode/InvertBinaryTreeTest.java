package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 226. Invert Binary Tree
 * 226. 翻转二叉树
 *
 * @author FXYGR @date 2020-06-01
 */
public class InvertBinaryTreeTest {

	@InjectMocks
	private InvertBinaryTree invertBinaryTree;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void invertTree() {

		/**
		 *      4
		 *    /   \
		 *   2     7
		 *  / \   / \
		 * 1   3 6   9
		 */
		int[] nums = new int[]{4, 2, 1, 3, 7, 6, 9};
		int[] results = invertTree(nums);
		assertArrayEquals(new int[]{4, 7, 9, 6, 2, 3, 1}, results);
	}

	private TreeNode createBinaryTree(int[] nums) {
		int i = 0;

		TreeNode root = new TreeNode(nums[i++]);

		while (i < nums.length) {
			addNode4BinaryTree(i++, root);
		}
		return root;
	}

	private TreeNode addNode4BinaryTree(int num, TreeNode root) {
		if (root == null) {
			return new TreeNode(num);
		}
		TreeNode currentNode = root;
		if (root.left != null && num < root.left.val) {
			currentNode.left = addNode4BinaryTree(num, currentNode.left);
			return root;
		}
		if (root.right != null && num > root.right.val) {
			currentNode.right = addNode4BinaryTree(num, currentNode.right);
			return root;
		}
		return root;
	}

	private int[] dlr(TreeNode root, int length) {
		int[] nums = new int[length];

		dlr(root, nums, 0);

		return nums;
	}

	private int dlr(TreeNode root, int[] nums, int index) {
		if (root == null) {
			return index;
		}
		nums[index++] = root.val;

		index = dlr(root.left, nums, index);
		index = dlr(root.right, nums, index);
		return index;
	}

	private int[] invertTree(int[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		TreeNode root = createBinaryTree(nums);
		root = invertTree(root);

		int[] results = dlr(root, nums.length);

		System.out.println("Output: " + Arrays.toString(results));
		System.out.println();
		return results;
	}

	private TreeNode invertTree(TreeNode root) {
		root = invertBinaryTree.invertTree(root);
		return root;
	}

}
