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
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
