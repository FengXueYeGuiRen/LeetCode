package com.github.fxygr.leetcode;

/**
 * 415. Add Strings
 * (https://leetcode.com/problems/add-strings/)
 * 415. 字符串相加
 * (https://leetcode-cn.com/problems/add-strings/)
 *
 * @author FXYGR @date 2020-02-27
 */
public class AddStrings {

	public String addStrings(String num1, String num2) {
		if (isBlank(num1) && isBlank(num2)) {
			return null;
		}
		if (isBlank(num1)) {
			return num2;
		}
		if (isBlank(num2)) {
			return num1;
		}
		int maxLength = Math.max(num1.length(), num2.length());
		int[] sums = new int[maxLength + 1];

		int i = 0, carry = 0;

		int num1Index = num1.length() - 1, num2Index = num2.length() - 1;
		int addend1, addend2, sum;
		for (; i < sums.length; ++i) {
			addend1 = num1Index < 0 ? 0 : num1.charAt(num1Index--) - '0';
			addend2 = num2Index < 0 ? 0 : num2.charAt(num2Index--) - '0';

			sum = addend1 + addend2 + carry;
			carry = sum / 10;

			sums[i] = sum % 10;
		}
		if (carry > 0) {
			sums[i] = carry;
		}
		return parseString(sums);
	}

	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

	private String parseString(int[] nums) {
		StringBuilder sb = new StringBuilder();
		int i = nums.length - 1;
		if (nums[i] < 1) {
			--i;
		}
		for (; i >= 0; --i) {
			sb.append(nums[i]);
		}
		return sb.toString();
	}

}
