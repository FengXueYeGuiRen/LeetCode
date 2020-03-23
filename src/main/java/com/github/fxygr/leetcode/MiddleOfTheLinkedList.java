package com.github.fxygr.leetcode;

/**
 * 876. Middle of the Linked List
 * (https://leetcode.com/problems/middle-of-the-linked-list/)
 * 876. 链表的中间结点
 * (https://leetcode-cn.com/problems/middle-of-the-linked-list/)
 *
 * @author FXYGR @date 2020-03-23
 */
public class MiddleOfTheLinkedList {

	public ListNode middleNode(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		int length = 0;
		for (ListNode node = head; node != null; node = node.next) {
			++length;
		}

		ListNode middleNode = head;
		for (int i = 1; i <= (length / 2); ++i) {
			middleNode = middleNode.next;
		}
		return middleNode;
	}

}
