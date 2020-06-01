package com.github.fxygr.leetcode;

/**
 * 226. Invert Binary Tree
 * (https://leetcode.com/problems/invert-binary-tree/)
 * 226. 翻转二叉树
 *
 * @author FXYGR @date 2020-06-01
 */
public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}
		invertChildren(root);

		root.left = invertTree(root.left);
		root.right = invertTree(root.right);
		return root;
	}

	private TreeNode invertChildren(TreeNode node) {
		TreeNode n = node.left;
		node.left = node.right;
		node.right = n;

		return node;
	}

}
