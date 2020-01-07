package com.github.fxygr.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. Two Sum II - Input array is sorted
 * (https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 * 167. 两数之和 II - 输入有序数组
 * (https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/)
 * <p>
 * {@link TwoSum}
 *
 * @author FXYGR @date 2020-01-06
 */
public class TwoSumII {

	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length < 2) {
			return numbers;
		}
		Map<Integer, Integer> numberOrderMap =
				new HashMap<>(numbers.length * 2);

		int m, n;
		for (int i = 0; i < numbers.length; ++i) {
			m = numbers[i];
			n = target - m;

			if (numberOrderMap.containsKey(n)) {
				return new int[]{numberOrderMap.get(n), i + 1};
			}
			numberOrderMap.put(m, i + 1);
		}
		return new int[0];
	}

}
