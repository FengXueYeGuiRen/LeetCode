package com.github.fxygr.leetcode;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * (https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)
 * 1008. 先序遍历构造二叉树
 * (https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/)
 *
 * @author FXYGR @date 2020-04-21
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {

	public TreeNode bstFromPreorder(int[] preorder) {
		if (preorder == null || preorder.length < 1) {
			return null;
		}
		int i = 0;
		TreeNode root = new TreeNode(preorder[i++]);
		while (i < preorder.length) {
			addBinarySearchTreeNode(preorder[i++], root);
		}
		return root;
	}

	private TreeNode addBinarySearchTreeNode(int val, TreeNode binarySearchTree) {
		if (binarySearchTree == null) {
			return new TreeNode(val);
		}
		if (val < binarySearchTree.val) {
			binarySearchTree.left = addBinarySearchTreeNode(val, binarySearchTree.left);
		}
		if (val > binarySearchTree.val) {
			binarySearchTree.right = addBinarySearchTreeNode(val, binarySearchTree.right);
		}
		return binarySearchTree;
	}

}
