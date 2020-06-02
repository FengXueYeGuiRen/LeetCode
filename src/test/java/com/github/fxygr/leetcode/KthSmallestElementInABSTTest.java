package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 230. Kth Smallest Element in a BST
 * 230. 二叉搜索树中第K小的元素
 *
 * @author FXYGR @date 2020-05-20
 */
public class KthSmallestElementInABSTTest {

	@InjectMocks
	private KthSmallestElementInABST kthSmallestElementInABST;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void kthSmallest() {
		Integer[] nums = new Integer[]{5, 3, 6, 2, 4, null, null, 1};
		TreeNode root = createBST(nums);

		int k = 3;
		int kthSmallestElement = kthSmallest(root, k);
		assertEquals(3, kthSmallestElement);


		nums = new Integer[]{3, null, 4};
		root = createBST(nums);

		k = 2;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(4, kthSmallestElement);

		k = 1;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(3, kthSmallestElement);


		nums = new Integer[]{3, 1, 4, null, 2};
		root = createBST(nums);

		k = 3;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(3, kthSmallestElement);

		k = 2;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(2, kthSmallestElement);

		k = 1;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(1, kthSmallestElement);
	}

	private TreeNode createBST(Integer[] nums) {
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

	private int kthSmallest(TreeNode root, int k) {
		System.out.println("Input: root = " + root + ", k = " + k);

		int kthSmallestElement = kthSmallestElementInABST.kthSmallest(root, k);

		System.out.println("Output: " + kthSmallestElement);
		System.out.println();
		return kthSmallestElement;
	}

}
