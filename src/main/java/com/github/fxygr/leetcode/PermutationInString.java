package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 567. Permutation in String
 * (https://leetcode.com/problems/permutation-in-string/)
 * 567. 字符串的排列
 *
 * @author FXYGR @date 2020-05-18
 */
public class PermutationInString {

	public boolean checkInclusion(String s1, String s2) {
		if (StringUtils.isBlank(s1) || StringUtils.isBlank(s2)) {
			return false;
		}
		Set<Character> s1Set = toSet(s1);
		int s1SetSize = s1Set.size();
		for (int i = 0; i < s2.length(); ++i) {
			if (s1Set.contains(s2.charAt(i))) {
				s1Set.remove(s2.charAt(i));
				continue;
			}//  !s1Set.contains(s2.charAt(i))
			if (s1Set.size() != s1SetSize) {
				s1Set = toSet(s1);
			}
		}
		return s1Set.isEmpty();
	}

	private Set<Character> toSet(String s) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); ++i) {
			set.add(s.charAt(i));
		}
		return set;
	}

}
