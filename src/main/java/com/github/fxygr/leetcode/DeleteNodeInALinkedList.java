package com.github.fxygr.leetcode;

/**
 * 237. Delete Node in a Linked List
 * (https://leetcode.com/problems/delete-node-in-a-linked-list/)
 * 237. 删除链表中的节点
 *
 * @author FXYGR @date 2020-06-02
 */
public class DeleteNodeInALinkedList {

	public void deleteNode(ListNode node) {
		if (node == null) {
			return;
		}
		if (node.next == null) {
			node = null;
			return;
		}
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
