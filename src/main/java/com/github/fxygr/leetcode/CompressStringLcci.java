package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

/**
 * 面试题 01.06. 字符串压缩
 * (https://leetcode-cn.com/problems/compress-string-lcci/)
 *
 * @author FXYGR @date 2020-03-16
 */
public class CompressStringLcci {

	public String compressString(String s) {
		if (StringUtils.isBlank(s)) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));

		short count = 1;
		int i = 1;
		for (; i < s.length(); ++i) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				count = 1;
				sb.append(count);

				continue;
			}
			++count;
			if (count == 1) {
				sb.append(s.charAt(i));
			}
			continue;
		}
		sb.append(count);
		return sb.length() < s.length() ? sb.toString() : s;
	}

}
