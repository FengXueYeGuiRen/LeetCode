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
		if (!ip.contains(DOTS_4_IPv4)) {
			return false;
		}
		String[] nums = ip.split("\\" + DOTS_4_IPv4);
		if (nums.length != GROUPS_4_IPv4) {
			return false;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (StringUtils.isBlank(nums[i])) {
				return false;
			}
			if (nums[i].length() > 1
					&& nums[i].startsWith("0")) {
				return false;
			}
			int num = Integer.parseInt(nums[i]);
			if (i == 0 && num == 0) {
				return false;
			}
			if (num < 0 || num > 255) {
				return false;
			}
		}
		return true;
	}

	private boolean isValidIPv6(String ip) {
		if (!ip.contains(COLONS_4_IPv6)) {
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
			if ("00".equals(digit)
					|| "000".equals(digit)
					|| "0000".equals(digit)) {
				return false;
			}
		}
		return true;
	}

}
