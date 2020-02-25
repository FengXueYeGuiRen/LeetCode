package com.github.fxygr.leetcode;

/**
 * 445. Add Two Numbers II
 * (https://leetcode.com/problems/add-two-numbers-ii/)
 * 445. 两数相加 II
 * (https://leetcode-cn.com/problems/add-two-numbers-ii/)
 *
 * @author FXYGR @date 2020-02-25
 */
public class AddTwoNumbersII {

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
		String s1 = transfer(l1);
		String s2 = transfer(l2);

		Long addend1 = Long.valueOf(s1);
		Long addend2 = Long.valueOf(s2);

		Long sum = addend1 + addend2;

		String s = String.valueOf(sum);
		ListNode dummyHead = new ListNode(0);
		ListNode currentNode = dummyHead;
		for (int i = 0; i < s.length(); ++i) {
			currentNode.setNext(new ListNode(Integer.parseInt(s.substring(i, i + 1))));
			currentNode = currentNode.getNext();
		}
		return dummyHead.getNext();
	}

	private String transfer(ListNode listNode) {
		StringBuilder s = new StringBuilder();
		for (ListNode l = listNode; l != null; l = l.getNext()) {
			s.append(l.getVal());
		}
		return s.toString();
	}

}
