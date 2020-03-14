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
		String gcdOfStrings = str1;
		String greater = str2;
		if (str1.length() > str2.length()) {
			gcdOfStrings = str2;
			greater = str1;
		}
		for (int i = 0; i < greater.length(); ) {
			int j = 0;
			while (j < gcdOfStrings.length() && i < greater.length()) {
				if (gcdOfStrings.charAt(j++) != greater.charAt(i++)) {
					return "";
				}
			}
			if (j < gcdOfStrings.length()) {
				return gcdOfStrings.substring(0, j);
			}
		}
		return gcdOfStrings;
	}

}
