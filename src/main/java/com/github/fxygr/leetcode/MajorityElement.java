package com.github.fxygr.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * (https://leetcode.com/problems/majority-element/)
 * 169. 多数元素
 *
 * @author FXYGR @date 2020-05-06
 */
public class MajorityElement {

	public int majorityElement(int[] nums) {
		if (nums == null || nums.length < 1) {
			return 0;
		}
		int majorityElement = Integer.MIN_VALUE;
		int majorityElementTimes = 0;
		Map<Integer, Integer> numTimesMap = new LinkedHashMap<>();
		for (int num : nums) {
			int times = 0;
			if (numTimesMap.containsKey(num)) {
				times = numTimesMap.get(num);
			}
			numTimesMap.put(num, ++times);
			if (times > majorityElementTimes) {
				majorityElementTimes = times;
				majorityElement = num;
			}
		}
		return majorityElement;
	}

}
