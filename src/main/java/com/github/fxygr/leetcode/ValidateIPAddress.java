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
		String[] nums = ip.split(DOTS_4_IPv4);
		for (int i = 0; i < nums.length; ++i) {
			if (StringUtils.isBlank(nums[i])) {
				return false;
			}
			if (nums[i].compareTo("0") < 0
					|| nums[i].compareTo("255") > 0) {
				return false;
			}
			if (nums[i].length() > 1 && nums[i].startsWith("0")) {
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
		for (String digit : hexadecimalDigits) {
			if (StringUtils.isBlank(digit)) {
				return false;
			}
			if (digit == "00"
					|| digit == "000"
					|| digit == "0000") {
				return false;
			}
		}
		return true;
	}

}
