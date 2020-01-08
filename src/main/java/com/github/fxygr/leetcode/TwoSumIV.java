package com.github.fxygr.leetcode;

import java.util.HashSet;

/**
 * 653. Two Sum IV - Input is a BST
 * (https://leetcode.com/problems/two-sum-iv-input-is-a-bst/)
 * 653. 两数之和 IV - 输入 BST
 * (https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/)
 * <p>
 * {@link TwoSumII}
 *
 * @author FXYGR @date 2020-01-07
 */
public class TwoSumIV {

	private int target;
	private HashSet<Integer> numbers;

	public boolean findTarget(TreeNode root, int target) {
		if (root == null
				|| (root.left == null && root.right == null)) {
			return false;
		}
		this.target = target;
		numbers = new HashSet<>();

		return find(root);
	}

	private boolean find(TreeNode node) {
		if (node == null) {
			return false;
		}
		int m = node.val;
		int n = target - m;
		if (numbers.contains(n)) {
			return true;
		}
		numbers.add(m);
		//  left
		boolean result = find(node.left);
		//  right
		if (!result) {
			result = find(node.right);
		}
		return result;
	}

	/**
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public TreeNode getLeft() {
			return left;
		}

		public void setLeft(TreeNode left) {
			this.left = left;
		}

		public TreeNode getRight() {
			return right;
		}

		public void setRight(TreeNode right) {
			this.right = right;
		}

	}

}
