package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

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
	}

	private int kthSmallest(TreeNode root, int k) {
		System.out.println("Input: root = " + root + ", k = " + k);

		int kthSmallestElement = kthSmallestElementInABST.kthSmallest(root, k);

		System.out.println("Output: " + kthSmallestElement);
		System.out.println();
		return kthSmallestElement;
	}

}
