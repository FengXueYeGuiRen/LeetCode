package com.github.fxygr.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * (https://leetcode.com/problems/binary-tree-preorder-traversal/)
 * 144. 二叉树的前序遍历
 *
 * @author FXYGR @date 2020-06-19
 */
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<Integer> preorderTraversals = new LinkedList<>();

		preorderTraversal(root, preorderTraversals);

		return preorderTraversals;
	}

	private List<Integer> preorderTraversal(
			TreeNode root, List<Integer> preorderTraversals) {
		if (root == null) {
			return preorderTraversals;
		}
		preorderTraversals.add(root.val);

		preorderTraversal(root.left, preorderTraversals);

		preorderTraversal(root.right, preorderTraversals);

		return preorderTraversals;
	}

}
