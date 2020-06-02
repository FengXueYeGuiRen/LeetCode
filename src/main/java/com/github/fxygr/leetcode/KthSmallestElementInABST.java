package com.github.fxygr.leetcode;

/**
 * 230. Kth Smallest Element in a BST
 * (https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
 * 230. 二叉搜索树中第K小的元素
 *
 * @author FXYGR @date 2020-05-20
 */
public class KthSmallestElementInABST {

	private int kth;
	private int kthSmallestElement;

	private int index = 0;

	public int kthSmallest(TreeNode root, int k) {
		if (root == null || k < 1) {
			return Integer.MIN_VALUE;
		}
		index = 0;
		kth = k;
		kthSmallestElement = Integer.MIN_VALUE;

		kthSmallest(root);
		return kthSmallestElement;
	}

	private void kthSmallest(TreeNode root) {
		if (root == null) {
			return;
		}
		//  left
		kthSmallest(root.left);
		//  root
		++index;
		if (index == kth && kthSmallestElement == Integer.MIN_VALUE) {
			kthSmallestElement = root.val;
			return;
		}
		//  right
		kthSmallest(root.right);
	}

}
