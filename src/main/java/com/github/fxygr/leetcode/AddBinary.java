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
		StringBuilder sb = new StringBuilder();

		short aShort, bShort, carry = '0', sum;
		int aIndex = a.length() - 1, bIndex = b.length() - 1;
		while (aIndex >= 0 || bIndex >= 0) {
			aShort = (short) (aIndex < 0 ? '0' : a.charAt(aIndex--));
			bShort = (short) (bIndex < 0 ? '0' : b.charAt(bIndex--));

			sum = (short) (aShort ^ bShort ^ carry);

			carry = (short) ((aShort & bShort) | ((aShort ^ bShort) & carry));

			sb.append((char) sum);
		}
		if (carry != (short) '0') {
			sb.append((char) carry);
		}
		return sb.reverse().toString();
	}

	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

}
