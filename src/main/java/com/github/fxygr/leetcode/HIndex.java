package com.github.fxygr.leetcode;

/**
 * 274. H-Index
 * (https://leetcode.com/problems/h-index/)
 * 274. H 指数
 *
 * @author FXYGR @date 2020-06-18
 */
public class HIndex {

	public int hIndex(int[] citations) {
		int average = average(citations);
		int h = average;

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
