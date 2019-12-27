package com.github.fxygr.leetcode;

/**
 * 147. Insertion Sort List
 * (https://leetcode.com/problems/insertion-sort-list/)
 * 147. 对链表进行插入排序
 * (https://leetcode-cn.com/problems/insertion-sort-list/)
 *
 * @author FXYGR @date 2019-12-19
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		return insertionSort(head);
	}

	private ListNode insertionSort(ListNode head) {
		ListNode previous = head, current = previous.next, next;
		for (; current != null; current = next) {
			next = current.next;

			if (current.val < head.val) {
				previous.next = next;

				current.next = head;
				head = current;
				continue;
			}
			for (ListNode node = head; node != current; node = node.next) {
				if (current.val >= node.val && current.val < node.next.val) {
					previous.next = next;

					current.next = node.next;
					node.next = current;
					break;
				}
			}
			if (previous.next != next) {
				previous = previous.next;
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
