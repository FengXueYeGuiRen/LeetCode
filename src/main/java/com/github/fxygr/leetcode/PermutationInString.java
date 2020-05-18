package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 567. Permutation in String
 * (https://leetcode.com/problems/permutation-in-string/)
 * 567. 字符串的排列
 *
 * @author FXYGR @date 2020-05-18
 */
public class PermutationInString {

	public boolean checkInclusion(String s1, String s2) {
		if (StringUtils.isBlank(s1)
				|| StringUtils.isBlank(s2)
				|| s1.length() > s2.length()) {
			return false;
		}
		String s1s = s1;

		int preInclusionIndex = -1;
		for (int i = 0; i < s2.length(); ++i) {
			if (s1s.isEmpty()) {
				return true;
			}
			if (s1s.contains("" + s2.charAt(i))) {
				s1s = s1s.replaceFirst("" + s2.charAt(i), "");
				if (preInclusionIndex < 0) {
					preInclusionIndex = i;
				}
				continue;
			}//  !s1Set.contains(s2.charAt(i))
			if (s1s.length() != s1.length()) {
				s1s = s1;

				i = preInclusionIndex;
				preInclusionIndex = -1;
			}
		}
		return s1s.isEmpty();
	}

}
