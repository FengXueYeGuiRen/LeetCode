package com.github.fxygr.leetcode;

/**
 * 2. Add Two Numbers
 * (https://leetcode.com/problems/add-two-numbers/)
 * 2. 两数相加
 * (https://leetcode-cn.com/problems/add-two-numbers/)
 *
 * @author FXYGR @date 2020-02-24
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode root = null;
		ListNode currentNode = root;

		int carry = 0;

		ListNode addend1 = l1, addend2 = l2;
		while (addend1 != null || addend2 != null) {

			Sum sum = add(addend1, addend2, carry);
			carry = sum.getCarry();

			if (root == null) {
				currentNode = root = sum.getNode();
			} else {
				currentNode.setNext(sum.getNode());
				currentNode = currentNode.getNext();
			}

			addend1 = (addend1 == null) ? null : addend1.getNext();
			addend2 = (addend2 == null) ? null : addend2.getNext();
		}
		if (carry != 0) {
			currentNode.setNext(new ListNode(carry));
		}
		return root;
	}

	private Sum add(ListNode addend1, ListNode addend2, int carry) {
		int i1 = addend1 == null ? 0 : addend1.getVal();
		int i2 = addend2 == null ? 0 : addend2.getVal();

		int sum = add(i1, i2, carry);

		return new Sum(new ListNode(sum % 10), sum / 10);
	}

	private int add(int addend1, int addend2, int carry) {
		return addend1 + addend2 + carry;
	}

	private class Sum {
		private ListNode node;
		private int carry;

		public Sum(ListNode node, int carry) {
			this.node = node;
			this.carry = carry;
		}

		public ListNode getNode() {
			return node;
		}

		public int getCarry() {
			return carry;
		}

	}

}
