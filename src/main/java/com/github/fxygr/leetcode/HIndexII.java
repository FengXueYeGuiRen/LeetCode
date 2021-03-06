package com.github.fxygr.leetcode;

/**
 * 275. H-Index II
 * (https://leetcode.com/problems/h-index-ii/)
 * 275. H 指数 II
 *
 * @author FXYGR @date 2020-06-18
 */
public class HIndexII {

	public int hIndex(int[] citations) {
		if (citations == null
				|| citations.length < 1) {
			return 0;
		}
		if (citations.length < 2) {
			if (citations[0] < 1) {
				return 0;
			}
			return 1;
		}
		int average = average(citations);
		int h = (
				average <= citations.length / 2
						? average
						: citations.length / 2);
		average = h;

		while (true) {
			while (isHIndex(h, citations)) {
				++h;
			}
			if (h != average) {
				return --h;
			}
			h = average - 1;
			while (isHIndex(h, citations)) {
				--h;
			}
			if (h != average) {
				return ++h;
			}
		}
	}

	private boolean isHIndex(int h, int[] citations) {
		int atLeastH = 0, noMoreThanH = 0;
		for (int citation : citations) {
			if (citation >= h) {
				++atLeastH;
			}
			if (citation <= h) {
				++noMoreThanH;
			}
		}
		return atLeastH >= h;
	}

	private int average(int[] citations) {
		int average = 0;
		for (int citation : citations) {
			average += citation;
		}
		average /= citations.length;
		return average;
	}

}
