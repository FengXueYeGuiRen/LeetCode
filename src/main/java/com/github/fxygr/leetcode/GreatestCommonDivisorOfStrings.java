package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 1071. Greatest Common Divisor of Strings
 * (https://leetcode.com/problems/greatest-common-divisor-of-strings/)
 * 1071. 字符串的最大公因子
 * (https://leetcode-cn.com/problems/greatest-common-divisor-of-strings/)
 *
 * @author FXYGR @date 2020-03-12
 */
public class GreatestCommonDivisorOfStrings {

	public String gcdOfStrings(String str1, String str2) {
		if (StringUtils.isBlank(str1)
				|| StringUtils.isBlank(str2)
				|| str1.charAt(0) != str2.charAt(0)) {
			return "";
		}
		if (str1.equals(str2)) {
			return str1;
		}
		String gcdOfStrings;
		int cd = Math.min(str1.length(), str2.length());
		for (; cd > 0; --cd) {
			if (str1.length() % cd != 0 || str2.length() % cd != 0) {
				continue;
			}
			//  common divisor
			gcdOfStrings = str1.substring(0, cd);

			if (isGcdOfStrings(str1, gcdOfStrings)
					&& isGcdOfStrings(str2, gcdOfStrings)) {
				return gcdOfStrings;
			}
		}
		return "";
	}

	private boolean isGcdOfStrings(String str, String gcdOfStrings) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() / gcdOfStrings.length(); ++i) {
			sb.append(gcdOfStrings);
		}
		return sb.toString().equals(str);
	}

}
