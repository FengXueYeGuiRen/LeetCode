package com.github.fxygr.leetcode;

/**
 * 面试题59 - II. 队列的最大值
 * (https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/)
 *
 * @author FXYGR @date 2020-03-07
 */
public class MaxQueue {

	private int maxVal = -1;
	private ListNode head = null;
	private ListNode tail = head;

	public MaxQueue() {
	}

	public int max_value() {
		return maxVal;
	}

	public void push_back(int value) {
		ListNode node = new ListNode(value);
		if (tail == null) {
			head = tail = node;
			maxVal = value;
			return;
		}
		tail.next = node;
		tail = node;

		updateMaxVal(value);
	}

	public int pop_front() {
		if (head == null) {
			return -1;
		}
		int popingVal = head.val;

		head = head.next;
		if (head == null) {
			tail = null;
			maxVal = -1;
			return popingVal;
		}
		if (popingVal == maxVal) {
			updateMaxVal();
		}
		return popingVal;
	}

	private void updateMaxVal() {
		if (head == null) {
			maxVal = -1;
			return;
		}
		maxVal = head.val;
		for (ListNode node = head.next; node != null; node = node.next) {
			maxVal = Math.max(node.val, maxVal);
		}
	}

	private void updateMaxVal(int value) {
		if (value > maxVal) {
			maxVal = value;
		}
	}

}
