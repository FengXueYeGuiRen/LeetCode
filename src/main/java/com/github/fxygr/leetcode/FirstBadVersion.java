package com.github.fxygr.leetcode;

import java.util.Random;

/**
 * 278. First Bad Version
 * (https://leetcode.com/problems/first-bad-version/)
 * 278. 第一个错误的版本
 *
 * @author FXYGR @date 2020-06-10
 */
public class FirstBadVersion {

	private int badVersion;

	public int firstBadVersion(int n) {
		if (n < 0) {
			return n;
		}
		badVersion = new Random().nextInt(n);
		return binarySearch(0, n);
	}

	public int getBadVersion() {
		return badVersion;
	}

	private int binarySearch(int lo, int hi) {
		if (lo > hi) {
			return -1;
		}
		int mid = (lo + hi) / 2;
		if (isBadVersion(mid)) {
			return mid;
		}
		int index = binarySearch(mid + 1, hi);
		if (index > -1) {
			return index;
		}
		return binarySearch(lo, mid - 1);
	}

	private boolean isBadVersion(int version) {
		return version == badVersion;
	}

}
