package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

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
		Map<Character, Integer> s1Map = toMap(s1);

		int preInclusionIndex = -1;
		for (int i = 0; i < s2.length(); ++i) {
			if (s1Map.isEmpty()) {
				return true;
			}
			if (s1Map.containsKey(s2.charAt(i))) {
				s1Map.put(s2.charAt(i), s1Map.get(s2.charAt(i)) - 1);
				if (s1Map.get(s2.charAt(i)) < 1) {
					s1Map.remove(s2.charAt(i));
				}
				if (preInclusionIndex < 0) {
					preInclusionIndex = i;
				}
				continue;
			}//  !s1Map.containsKey(s2.charAt(i))
			if (s1Map.size() != s1.length()) {
				s1Map = toMap(s1);

				i = preInclusionIndex;
				preInclusionIndex = -1;
			}
		}
		return s1Map.isEmpty();
	}

	private Map<Character, Integer> toMap(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}

}
