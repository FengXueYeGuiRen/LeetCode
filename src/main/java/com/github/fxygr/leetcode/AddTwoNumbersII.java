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
		if (isBlank(s)) {
			return null;
		}
		ListNode dummyHead = new ListNode(0);

		ListNode currentNode = dummyHead;
		for (int i = 0; i < s.length(); ++i) {
			currentNode.next = new ListNode(Integer.parseInt(s.substring(i, i + 1)));
			currentNode = currentNode.next;
		}
		return dummyHead.next;
	}

	private String addTwoStrings(String s1, String s2) {
		StringBuilder sb = new StringBuilder();

		int carry = 0;

		String substring1, substring2;
		while (true) {
			substring1 = substring(s1);
			s1 = subtractLast(s1, substring1);

			substring2 = substring(s2);
			s2 = subtractLast(s2, substring2);

			if (isBlank(substring1) && isBlank(substring2)) {
				break;
			}
			int sum = addTwoStrings(substring1, substring2, carry);

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

	private int addTwoStrings(String s1, String s2, int carry) {
		int addend1 = parseInt(s1);
		int addend2 = parseInt(s2);
		if (addend1 < 0 && addend2 < 0) {
			return 0;
		}
		if (addend1 < 0) {
			addend1 = 0;
		}
		if (addend2 < 0) {
			addend2 = 0;
		}
		return addend1 + addend2 + carry;
	}

	private int parseInt(String s) {
		if (isBlank(s)) {
			return Integer.MIN_VALUE;
		}
		return Integer.parseInt(s);
	}

	private String substring(String s) {
		int beginIndex = substringBeginIndex(s);
		return s.substring(beginIndex);
	}

	private int substringBeginIndex(String s) {
		if (isBlank(s)) {
			return 0;
		}
		return s.length() <= DIGITS ? 0 : s.length() - DIGITS;
	}

	private String subtractLast(String source, String substring) {
		if (source.length() >= substring.length()) {
			source = source.substring(0, source.length() - substring.length());
		}
		return source;
	}

	private String parseString(ListNode listNode) {
		StringBuilder s = new StringBuilder();
		for (ListNode l = listNode; l != null; l = l.next) {
			s.append(l.val);
		}
		return s.toString().trim();
	}

	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

}
