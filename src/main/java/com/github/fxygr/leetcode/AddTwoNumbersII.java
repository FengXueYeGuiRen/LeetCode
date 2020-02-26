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

	private static final int DIGITS = 8;

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

		String s = addTwoStrings(s1, s2);

		return parseListNode(s);
	}

	private ListNode parseListNode(String s) {
		ListNode dummyHead = new ListNode(0);

		ListNode currentNode = dummyHead;
		for (int i = 0; i < s.length(); ++i) {
			currentNode.setNext(new ListNode(Integer.parseInt(s.substring(i, i + 1))));
			currentNode = currentNode.getNext();
		}
		return dummyHead.getNext();
	}

	private String addTwoStrings(String s1, String s2) {
		StringBuilder sb = new StringBuilder();

		String substring1, substring2;

		int addend1, addend2;

		int carry = 0;
		while (true) {
			substring1 = substring(s1);
			if (s1.length() >= substring1.length()) {
				s1 = s1.substring(0, s1.length() - substring1.length());
			}
			substring2 = substring(s2);
			if (s2.length() >= substring2.length()) {
				s2 = s2.substring(0, s2.length() - substring2.length());
			}
			addend1 = parseInt(substring1);
			addend2 = parseInt(substring2);
			if (addend1 < 0 && addend2 < 0) {
				break;
			}
			addend1 = addend1 < 0 ? 0 : addend1;
			addend2 = addend2 < 0 ? 0 : addend2;

			int sum = addend1 + addend2 + carry;

			int maxDigits = Math.max(substring1.length(), substring2.length());
			carry = sum / (int) Math.pow(10, maxDigits);

			String s = String.format("%0" + maxDigits + "d", sum);
			if (s.length() > maxDigits) {
				s = s.substring(s.length() - maxDigits);
			}
			sb.insert(0, s);
		}
		if (carry > 0) {
			sb.insert(0, carry);
		}
		return sb.toString();
	}

	private int parseInt(String s) {
		if (s == null || "".equals(s.trim())) {
			return Integer.MIN_VALUE;
		}
		return Integer.parseInt(s);
	}

	private String substring(String s) {
		int beginIndex = substringBeginIndex(s);
		return s.substring(beginIndex);
	}

	private int substringBeginIndex(String s) {
		if (s == null) {
			return 0;
		}
		return s.length() <= DIGITS ? 0 : s.length() - DIGITS;
	}

	private String parseString(ListNode listNode) {
		StringBuilder s = new StringBuilder();
		for (ListNode l = listNode; l != null; l = l.getNext()) {
			s.append(l.getVal());
		}
		return s.toString().trim();
	}

}
