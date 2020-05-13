package com.github.fxygr.leetcode;

/**
 * 19. Remove Nth Node From End of List
 * (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 * 19. 删除链表的倒数第N个节点
 *
 * @author FXYGR @date 2020-05-13
 */
public class RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n < 1) {
			return head;
		}
		int size = 0;
		ListNode node = head;
		for (; node != null; node = node.next) {
			++size;
		}
		if (n > size) {
			return head;
		}
		if (size == n) {
			return head.next;
		}
		node = head;
		for (; size > (n + 1); --size) {
			node = node.next;
		}
		if (node.next != null) {
			node.next = node.next.next;
		}
		return head;
	}

}
