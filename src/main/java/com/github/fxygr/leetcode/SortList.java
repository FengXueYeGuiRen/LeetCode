package com.github.fxygr.leetcode;

/**
 * 148. Sort List
 * (https://leetcode.com/problems/sort-list/)
 * 148. 排序链表
 * (https://leetcode-cn.com/problems/sort-list/)
 *
 * @author FXYGR @date 2019-12-18
 */
public class SortList {

	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		head = sort(head);
		return head;
	}

	private ListNode sort(ListNode head) {
		ListNode current = head.next, next;
		head.next = null;
		for (; current != null; current = next) {
			next = current.next;
			head = merge(current, head);
		}
		return head;
	}

	private ListNode merge(ListNode node, ListNode head) {
		node.next = null;
		if (node.val < head.val) {
			node.next = head;
			head = node;
			return head;
		}
		ListNode current = head, next;
		for (; current != null; current = next) {
			next = current.next;
			if (next == null) {
				current.next = node;
				break;
			}
			if (node.val >= current.val && node.val < next.val) {
				current.next = node;
				node.next = next;
				break;
			}
		}
		return head;
	}

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		private int val;
		private ListNode next;

		ListNode(int x) {
			val = x;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

	}

}
