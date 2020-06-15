package com.github.fxygr.leetcode;

/**
 * 700. Search in a Binary Search Tree
 * (https://leetcode.com/problems/search-in-a-binary-search-tree/)
 * 700. 二叉搜索树中的搜索
 *
 * @author FXYGR @date 2020-06-15
 */
public class SearchInABinarySearchTree {

	public TreeNode searchBST(TreeNode root, int val) {
		TreeNode node = root;
		while (node != null) {
			if (node.val == val) {
				return node;
			}
			if (node.val < val) {
				node = node.right;
				continue;
			}// root.val > val
			node = node.left;
		}
		return null;
	}

}
