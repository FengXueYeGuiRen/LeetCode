package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * (https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)
 * 1160. 拼写单词
 * (https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/)
 *
 * @author FXYGR @date 2020-03-17
 */
public class FindWordsThatCanBeFormedByCharacters {

	public int countCharacters(String[] words, String chars) {
		if (words == null
				|| words.length < 1
				|| StringUtils.isBlank(chars)) {
			return 0;
		}
		int count = 0;
		for (String word : words) {
			boolean canBeFormedByChars = true;
			String chs = chars;
			for (char ch : word.toCharArray()) {
				int index = chs.indexOf(String.valueOf(ch));
				if (index == -1) {
					canBeFormedByChars = false;
					break;
				}
				chs = chs.replaceFirst(String.valueOf(ch), "");
				canBeFormedByChars = true;
			}
			if (canBeFormedByChars) {
				System.out.print(word + " ");
				count += word.length();
			}
		}
		return count;
	}

}
