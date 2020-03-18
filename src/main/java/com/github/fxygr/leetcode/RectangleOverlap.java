package com.github.fxygr.leetcode;

/**
 * 836. Rectangle Overlap
 * (https://leetcode.com/problems/rectangle-overlap/)
 * 836. 矩形重叠
 * (https://leetcode-cn.com/problems/rectangle-overlap/)
 *
 * @author FXYGR @date 2020-03-18
 */
public class RectangleOverlap {

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		return ((rec1[0] <= rec2[0]) && (rec2[0] < rec1[2])
				|| (rec2[0] <= rec1[0]) && (rec1[0] < rec2[2]))
				&&
				//  y
				((rec1[1] <= rec2[1]) && (rec2[1] < rec1[3])
						|| (rec2[1] <= rec1[1]) && (rec1[1] < rec2[3]));
	}

}
