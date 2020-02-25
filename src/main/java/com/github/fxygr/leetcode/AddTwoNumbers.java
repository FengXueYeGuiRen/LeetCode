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
		ListNode dummyHead = new ListNode(0);
		ListNode currentNode = dummyHead;

		int carry = 0;

		ListNode addend1 = l1, addend2 = l2;
		while (addend1 != null || addend2 != null) {
			int i1 = addend1 == null ? 0 : addend1.getVal();
			int i2 = addend2 == null ? 0 : addend2.getVal();

			int sum = i1 + i2 + carry;
			carry = sum / 10;

			currentNode.setNext(new ListNode(sum % 10));
			currentNode = currentNode.getNext();

			if (addend1 != null) {
				addend1 = addend1.getNext();
			}
			if (addend2 != null) {
				addend2 = addend2.getNext();
			}
		}
		if (carry != 0) {
			currentNode.setNext(new ListNode(carry));
		}
		return dummyHead.getNext();
	}

}
