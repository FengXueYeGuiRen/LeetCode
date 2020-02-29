package com.github.fxygr.leetcode;

/**
 * 67. Add Binary
 * (https://leetcode.com/problems/add-binary/)
 * 67. 二进制求和
 * (https://leetcode-cn.com/problems/add-binary/)
 *
 * @author FXYGR @date 2020-02-29
 */
public class AddBinary {

	public String addBinary(String a, String b) {
		if (isBlank(a)) {
			return b;
		}
		if (isBlank(b)) {
			return a;
		}
		int maxLength = Math.max(a.length(), b.length());
		char[] chars = new char[maxLength + 1];

		int aIndex = a.length() - 1, bIndex = b.length() - 1;
		char aChar, bChar, carry = '0';
		char[] sums;
		for (int i = 0; i <= maxLength; ++i) {
			aChar = aIndex < 0 ? '0' : a.charAt(aIndex--);
			bChar = bIndex < 0 ? '0' : b.charAt(bIndex--);

			sums = add(aChar, bChar, carry);
			carry = sums[0];

			chars[i] = sums[1];
		}
		return parseString(chars);
	}

	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

	private String parseString(char[] nums) {
		StringBuilder sb = new StringBuilder();
		int i = nums.length - 1;
		if (nums[i] == '0') {
			--i;
		}
		for (; i >= 0; --i) {
			sb.append(nums[i]);
		}
		return sb.toString();
	}

	private char[] add(char ch1, char ch2, char carry) {
		char[] chars = null;
		if (ch1 != ch2) {
			chars = new char[]{'0', '1'};
		} else if (ch1 == '0') {
			chars = new char[]{'0', '0'};
		} else if (ch1 == '1') {
			chars = new char[]{'1', '0'};
		}
		if (chars[1] != carry) {
			chars[1] = '1';
		} else if (carry == '1') {
			chars[0] = '1';
			chars[1] = '0';
		}
		return chars;
	}

}
