package com.github.fxygr.leetcode;

/**
 * Definition for singly-linked list.
 *
 * @author FXYGR @date 2020-02-24
 */
public class ListNode {

	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public static ListNode build(int[] nums) {
		if (nums == null || nums.length < 1) {
			return null;
		}
		ListNode head = new ListNode(nums[0]);

		ListNode currentNode = head;
		for (int i = 1; i < nums.length; ++i) {
			currentNode.next = new ListNode(nums[i]);
			currentNode = currentNode.next;
		}
		return head;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (ListNode node = this; node != null; node = node.getNext()) {
			if (node != this) {
				sb.append(" -> ");
			}
			sb.append(node.getVal());
		}
		return sb.toString();
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
