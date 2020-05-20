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
		TreeNode root = new TreeNode(3);
		root.right = new TreeNode(4);

		int k = 2;
		int kthSmallestElement = kthSmallest(root, k);
		assertEquals(4, kthSmallestElement);

		k = 1;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(3, kthSmallestElement);


		root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);

		k = 3;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(4, kthSmallestElement);

		k = 2;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(3, kthSmallestElement);

		k = 1;
		kthSmallestElement = kthSmallest(root, k);
		assertEquals(1, kthSmallestElement);
	}

	private int kthSmallest(TreeNode root, int k) {
		System.out.println("Input: root = " + root + ", k = " + k);

		int kthSmallestElement = kthSmallestElementInABST.kthSmallest(root, k);

		System.out.println("Output: " + kthSmallestElement);
		System.out.println();
		return kthSmallestElement;
	}

}
