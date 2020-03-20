package com.github.fxygr.leetcode;

/**
 * 300. Longest Increasing Subsequence
 * (https://leetcode.com/problems/longest-increasing-subsequence/)
 * 300. 最长上升子序列
 * (https://leetcode-cn.com/problems/longest-increasing-subsequence/)
 *
 * @author FXYGR @date 2020-03-14
 */
public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length < 1) {
			return 0;
		}
		int lengthOfLIS = 0, currentLength;
		int currentNum;
		for (int i = 0; i < nums.length; ++i) {
			currentLength = 1;
			currentNum = nums[i];
			for (int j = i + 1; j < nums.length; ++j) {
				if (nums[j] > currentNum) {
					++currentLength;
					currentNum = nums[j];
				}
			}
			if (currentLength > lengthOfLIS) {
				lengthOfLIS = currentLength;
			}
		}
		return lengthOfLIS;
	}

}
