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
		String s1 = parseString(l1);
		String s2 = parseString(l2);

		int[] sum = addStrings(s1, s2);

		return parseListNode(sum);
	}

	private ListNode parseListNode(int[] nums) {
		ListNode dummyHead = new ListNode(0);

		ListNode currentNode = dummyHead;
		int i = nums.length - 1;
		if (nums[i] < 1) {
			--i;
		}
		for (; i >= 0; --i) {
			currentNode.next = new ListNode(nums[i]);
			currentNode = currentNode.next;
		}
		return dummyHead.next;
	}

	private int[] addStrings(String num1, String num2) {
		int maxDigits = Math.max(num1.length(), num2.length());
		int[] sums = new int[maxDigits + 1];

		int num1Index = num1.length() - 1;
		int num2Index = num2.length() - 1;

		int carry = 0, i = 0;

		int addend1, addend2;
		for (; i <= maxDigits; ++i) {
			addend1 = num1Index < 0 ? 0 : Character.getNumericValue(num1.charAt(num1Index--));
			addend2 = num2Index < 0 ? 0 : Character.getNumericValue(num2.charAt(num2Index--));

			int sum = addend1 + addend2 + carry;
			carry = sum / 10;

			sums[i] = sum % 10;
		}
		if (carry > 0) {
			sums[i] = carry;
		}
		return sums;
	}

	private String parseString(ListNode listNode) {
		if (listNode == null) {
			return "";
		}
		StringBuilder s = new StringBuilder();
		for (ListNode l = listNode; l != null; l = l.next) {
			s.append(l.val);
		}
		return s.toString().trim();
	}

}
