package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 468. Validate IP Address
 * (https://leetcode.com/problems/validate-ip-address/)
 * 468. 验证IP地址
 *
 * @author FXYGR @date 2020-06-16
 */
public class ValidateIPAddress {

	static final String IPv4 = "IPv4";
	static final String IPv6 = "IPv6";
	static final String NEITHER = "Neither";

	private static final String DOTS_4_IPv4 = ".";
	private static final String COLONS_4_IPv6 = ":";

	private static final int GROUPS_4_IPv4 = 4;
	private static final int GROUPS_4_IPv6 = 8;

	public String validIPAddress(String IP) {
		if (StringUtils.isBlank(IP)) {
			return NEITHER;
		}
		if (isValidIPv4(IP)) {
			return IPv4;
		}
		if (isValidIPv6(IP)) {
			return IPv6;
		}
		return NEITHER;
	}

	private boolean isValidIPv4(String ip) {
		if (!ip.contains(DOTS_4_IPv4)
				|| ip.startsWith(DOTS_4_IPv4)
				|| ip.startsWith("0")
				|| ip.endsWith(DOTS_4_IPv4)) {
			return false;
		}
		String[] nums = ip.split("\\" + DOTS_4_IPv4);
		if (nums.length != GROUPS_4_IPv4) {
			return false;
		}
		for (String num : nums) {
			if (StringUtils.isBlank(num)) {
				return false;
			}
			if (num.startsWith("0")) {
				return false;
			}
			int n;
			try {
				n = Integer.parseInt(num);
			} catch (NumberFormatException e) {
				return false;
			}
			if (num.startsWith("-") || num.startsWith("+")
					|| n < 0 || n > 255) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidIPv6(String ip) {
		if (!ip.contains(COLONS_4_IPv6)
				|| ip.startsWith(COLONS_4_IPv6)
				|| ip.endsWith(COLONS_4_IPv6)) {
			return false;
		}
		String[] hexadecimalDigits = ip.split(COLONS_4_IPv6);
		if (hexadecimalDigits.length != GROUPS_4_IPv6) {
			return false;
		}
		for (String digit : hexadecimalDigits) {
			if (StringUtils.isBlank(digit)) {
				return false;
			}
			if (digit.length() > 4) {
				return false;
			}
			for (char ch : digit.toCharArray()) {
				if ((ch >= '0' && ch <= '9')
						|| (ch >= 'a' && ch <= 'f')
						|| (ch >= 'A' && ch <= 'F')) {
					continue;
				}
				return false;
			}
		}
		return true;
	}

}
