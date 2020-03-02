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
		short[] chars = new short[maxLength + 1];

		int aIndex = a.length() - 1, bIndex = b.length() - 1;
		short aShort, bShort, carry = '0';
		short[] sums;
		for (int i = 0; i <= maxLength; ++i) {
			aShort = (short) (aIndex < 0 ? '0' : a.charAt(aIndex--));
			bShort = (short) (bIndex < 0 ? '0' : b.charAt(bIndex--));

			sums = add(aShort, bShort, carry);
			carry = sums[0];

			chars[i] = sums[1];
		}
		return parseString(chars);
	}

	private boolean isBlank(String s) {
		return s == null || "".equals(s.trim());
	}

	private String parseString(short[] nums) {
		StringBuilder sb = new StringBuilder();
		int i = nums.length - 1;
		if (nums[i] == '0') {
			--i;
		}
		for (; i >= 0; --i) {
			sb.append((char) nums[i]);
		}
		return sb.toString();
	}

	private short[] add(short ch1, short ch2, short carry) {
		short[] chars = new short[]{(short) (ch1 & ch2), (short) (ch1 ^ ch2)};

		chars[0] |= (short) (chars[1] & carry);
		chars[1] ^= carry;

		return chars;
	}

}
