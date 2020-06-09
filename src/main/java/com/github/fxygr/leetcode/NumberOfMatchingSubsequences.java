package com.github.fxygr.leetcode;

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
		int matchingNum = 0;
		for (String word : words) {
			if (isSubsequence.isSubsequence(word, S)) {
				++matchingNum;
			}
		}
		return matchingNum;
	}

}
