package com.github.fxygr.leetcode;

/**
 * 1232. Check If It Is a Straight Line
 * (https://leetcode.com/problems/check-if-it-is-a-straight-line/)
 * 1232. 缀点成线
 *
 * @author FXYGR @date 2020-05-08
 */
public class CheckIfItIsAStraightLine {

	public boolean checkStraightLine(int[][] coordinates) {
		if (coordinates == null || coordinates.length < 1) {
			return false;
		}
		int i = 0;
		double slope = ((double) (coordinates[i][1])) - coordinates[i++][0];
		for (; i < coordinates.length; ++i) {
			double currentSlope = ((double) (coordinates[i][1])) - coordinates[i][0];
			if (Double.compare(currentSlope, slope) != 0) {
				return false;
			}
		}
		return true;
	}

}
