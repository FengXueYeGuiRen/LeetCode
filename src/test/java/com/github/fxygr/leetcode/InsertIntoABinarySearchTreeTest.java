package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 701. Insert into a Binary Search Tree
 * 701. 二叉搜索树中的插入操作
 *
 * @author FXYGR @date 2020-06-01
 */
public class InsertIntoABinarySearchTreeTest {

	@InjectMocks
	private InsertIntoABinarySearchTree insertIntoABinarySearchTree;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void insertIntoBST() {
		/**
		 *         4
		 *        / \
		 *       2   7
		 *      / \
		 *     1   3
		 */
		int[] nums = new int[]{4, 2, 1, 3, 7};
		int val = 5;
		int[] results = insertIntoBST(nums, val);
		assertArrayEquals(new int[]{4, 2, 1, 3, 7, 5}, results);
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

	private TreeNode createBST(int[] nums) {
		TreeNode root = null;
		for (int i = 0; i < nums.length; ++i) {
			root = insertIntoBST(root, nums[i]);
		}
		return root;
	}

	private int[] insertIntoBST(int[] nums, int val) {
		System.out.println("Input: val = " + val + ", nums = " + Arrays.toString(nums));

		TreeNode root = createBST(nums);
		insertIntoBST(root, val);

		int[] results = dlr(root, nums.length + 1);

		System.out.println("Output: " + Arrays.toString(results));
		System.out.println();
		return results;
	}

	private TreeNode insertIntoBST(TreeNode root, int val) {
		return insertIntoABinarySearchTree.insertIntoBST(root, val);
	}

}
