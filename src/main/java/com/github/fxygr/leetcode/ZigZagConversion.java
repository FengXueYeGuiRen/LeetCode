package com.github.fxygr.leetcode;

/**
 * 6. ZigZag Conversion
 * (https://leetcode.com/problems/zigzag-conversion/)
 * 6. Z 字形变换
 *
 * @author FXYGR @date 2020-06-05
 */
public class ZigZagConversion {

	public String convert(String s, int numRows) {
		StringBuilder[] sbs = new StringBuilder[numRows];
		for (int i = 0; i < numRows; ++i) {
			sbs[i] = new StringBuilder();
		}

		for (int i = 0; i < s.length(); ) {
			int j = 0;
			for (; j < numRows && i < s.length(); ++j) {
				sbs[j].append(s.charAt(i++));
			}
			for (j = numRows - 2; j > 0 && i < s.length(); --j) {
				sbs[j].append(s.charAt(i++));
			}
		}
		for (int i = 1; i < sbs.length; ++i) {
			sbs[0].append(sbs[i]);
		}
		return sbs[0].toString();
	}

}
