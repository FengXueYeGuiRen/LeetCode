package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 144. Binary Tree Preorder Traversal
 * 144. 二叉树的前序遍历
 *
 * @author FXYGR @date 2020-06-19
 */
public class BinaryTreePreorderTraversalTest {

	@InjectMocks
	private BinaryTreePreorderTraversal binaryTreePreorderTraversal;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void preorderTraversal() {
		Integer[] nums = new Integer[]{1, null, 2, 3};
		Integer[] preorderTraversals =
				preorderTraversal(nums);
		assertArrayEquals(new Integer[]{1, 2, 3}, preorderTraversals);
	}

	private TreeNode createBT(Integer[] nums) {
		TreeNode root = null;
		InsertIntoABinarySearchTree treeNode = new InsertIntoABinarySearchTree();
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != null) {
				root = treeNode.insertIntoBST(root, nums[i]);
			}
		}
		return root;
	}

	private Integer[] preorderTraversal(Integer[] nums) {
		System.out.println("Input: " + Arrays.toString(nums));

		TreeNode root = createBT(nums);
		List<Integer> preorderTraversals =
				preorderTraversal(root);

		System.out.println("Output: " + preorderTraversals);
		System.out.println();
		return preorderTraversals.toArray(
				new Integer[preorderTraversals.size()]);
	}

	private List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> preorderTraversals =
				binaryTreePreorderTraversal.preorderTraversal(root);
		return preorderTraversals;
	}

}
