package com.github.fxygr.leetcode;

import java.util.Arrays;

/**
 * 792. Number of Matching Subsequences
 * (https://leetcode.com/problems/number-of-matching-subsequences/)
 * 792. 匹配子序列的单词数
 * <p>
 * {@link IsSubsequence}
 *
 * @author FXYGR @date 2020-06-09
 */
public class NumberOfMatchingSubsequences {

	private IsSubsequence isSubsequence;

	public NumberOfMatchingSubsequences() {
		isSubsequence = new IsSubsequence();
	}

	public int numMatchingSubseq(String S, String[] words) {
		if (words == null || words.length < 1) {
			return 0;
		}
		Arrays.sort(words);

		int matchingNum = 0;
		String preWord = "";
		boolean preMatching = false;
		for (String word : words) {
			if (word.equals(preWord) && !preMatching) {
				continue;
			}
			preMatching = false;
			if (word.equals(preWord)
					|| isSubsequence.isSubsequence(word, S)) {
				++matchingNum;
				preMatching = true;
			}
			preWord = word;
		}
		return matchingNum;
	}

}
