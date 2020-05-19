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

	private Map<Character, Integer> s1CharacterFrequencyMap;

	public boolean checkInclusion(String s1, String s2) {
		if (StringUtils.isBlank(s1)
				|| StringUtils.isBlank(s2)
				|| s1.length() > s2.length()) {
			return false;
		}
		Map<Character, Integer> s1Map = toMap(s1);
		int s1MapValues = s1.length();

		int preInclusionIndex = -1;
		boolean inclusion = false;
		for (int i = 0; i < s2.length(); ++i) {
			if (s1MapValues == 0) {
				return true;
			}
			Integer value = s1Map.get(s2.charAt(i));
			if (value != null && value > 0) {
				s1Map.put(s2.charAt(i), s1Map.get(s2.charAt(i)) - 1);
				--s1MapValues;

				if (!inclusion) {
					preInclusionIndex = i;
					inclusion = true;
				}
				continue;
			}//  !s1Map.containsKey(s2.charAt(i))
			if (s1MapValues != s1.length()) {
				s1Map = toMap(s1);
				s1MapValues = s1.length();

				i = preInclusionIndex;
				inclusion = false;
			}
		}
		return s1MapValues == 0;
	}

	private Map<Character, Integer> toMap(String s) {
		if (s1CharacterFrequencyMap != null) {
			return new HashMap<>(s1CharacterFrequencyMap);
		}// s1CharacterFrequencyMap == null
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); ++i) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		s1CharacterFrequencyMap = new HashMap<>(map);
		return map;
	}

}
