package com.github.fxygr.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * 1008. Construct Binary Search Tree from Preorder Traversal
 * 1008. 先序遍历构造二叉树
 *
 * @author FXYGR @date 2020-04-21
 */
public class ConstructBinarySearchTreeFromPreorderTraversalTest {

	@InjectMocks
	private ConstructBinarySearchTreeFromPreorderTraversal constructBinarySearchTreeFromPreorderTraversal;

	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}

	@Test
	public void bstFromPreorder() {
		int[] preorder = {8, 5, 1, 7, 10, 12};
		Integer[] bfsVals = bstFromPreorder(preorder);
		assertEquals(new Integer[]{8, 5, 10, 1, 7, null, 12}, bfsVals);
	}

	private Integer[] bstFromPreorder(int[] preorder) {
		StdOut.println(preorder, "Input: ");

		TreeNode binarySearchTree = constructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(preorder);
		Integer[] bfsVals = breadthFirstSearch(binarySearchTree, preorder.length);

		StdOut.println(bfsVals, "Output: ");
		System.out.println();
		return bfsVals;
	}

	private Integer[] breadthFirstSearch(TreeNode binarySearchTree, int length) {
		if (binarySearchTree == null) {
			return null;
		}
		List<Integer> bfs = new ArrayList<>();
		bfs.add(binarySearchTree.val);

		breadthFirstSearch(binarySearchTree, bfs);

		return bfs.toArray(new Integer[bfs.size()]);
	}

	private List<Integer> breadthFirstSearch(TreeNode binarySearchTree,
	                                         List<Integer> bfsVals) {
		if (binarySearchTree == null
				|| (binarySearchTree.left == null && binarySearchTree.right == null)) {
			return bfsVals;
		}
		if (binarySearchTree.left != null) {
			bfsVals.add(binarySearchTree.left.val);
		}
		if (binarySearchTree.right != null) {
			if (binarySearchTree.left == null) {
				bfsVals.add(null);
			}
			bfsVals.add(binarySearchTree.right.val);
		}
		breadthFirstSearch(binarySearchTree.left, bfsVals);
		breadthFirstSearch(binarySearchTree.right, bfsVals);

		return bfsVals;
	}

}
