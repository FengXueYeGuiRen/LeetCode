package com.github.fxygr.leetcode;

/**
 * 701. Insert into a Binary Search Tree
 * (https://leetcode.com/problems/insert-into-a-binary-search-tree/)
 * 701. 二叉搜索树中的插入操作
 *
 * @author FXYGR @date 2020-06-01
 */
public class InsertIntoABinarySearchTree {

	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val < root.val) {
			root.left = insertIntoBST(root.left, val);
			return root;
		}
		if (val > root.val) {
			root.right = insertIntoBST(root.right, val);
			return root;
		}
		return root;
	}

}
