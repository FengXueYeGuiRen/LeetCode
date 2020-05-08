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
		double lastY = (double) (coordinates[coordinates.length - 1][1]);
		int lastX = coordinates[coordinates.length - 1][0];

		double slope = (lastY - coordinates[i][1]) / (lastX - coordinates[i++][0]);
		slope = Math.abs(slope);

		for (; i < coordinates.length - 1; ++i) {
			double currentSlope = (lastY - coordinates[i][1]) / (lastX - coordinates[i][0]);
			currentSlope = Math.abs(currentSlope);

			if (Double.compare(currentSlope, slope) != 0) {
				return false;
			}
		}
		return true;
	}

}
