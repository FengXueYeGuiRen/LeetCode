package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 700. Search in a Binary Search Tree
 * 700. 二叉搜索树中的搜索
 *
 * @author FXYGR @date 2020-06-15
 */
public class SearchInABinarySearchTreeTest {

	@InjectMocks
	private SearchInABinarySearchTree searchInABinarySearchTree;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void searchBST() {
		int[] nums = new int[]{4, 2, 1, 3, 7};
		int val = 2;
		int[] results = searchBST(nums, val);
		assertArrayEquals(new int[]{2, 1, 3, 0, 0}, results);
	}

	private TreeNode createBST(int[] nums) {
		TreeNode root = null;
		InsertIntoABinarySearchTree tree = new InsertIntoABinarySearchTree();
		for (Integer num : nums) {
			if (num == null) {
				continue;
			}
			root = tree.insertIntoBST(root, num);
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

	private int[] searchBST(int[] nums, int val) {
		System.out.println("Input: nums = " + Arrays.toString(nums) + ", val = " + val);

		TreeNode root = createBST(nums);

		TreeNode node = searchBST(root, val);
		int[] results = dlr(node, nums.length);

		System.out.println("Output: " + Arrays.toString(results));
		System.out.println();
		return results;
	}

	private TreeNode searchBST(TreeNode root, int val) {
		return searchInABinarySearchTree.searchBST(root, val);
	}

}
