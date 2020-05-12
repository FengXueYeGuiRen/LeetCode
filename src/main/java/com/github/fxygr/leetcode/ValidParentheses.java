package com.github.fxygr.leetcode;

import com.github.fxygr.leetcode.utils.StringUtils;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * (https://leetcode.com/problems/valid-parentheses/)
 * 20. 有效的括号
 *
 * @author FXYGR @date 2020-05-12
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		if (StringUtils.isBlank(s)
				|| s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		Character ch;
		for (int i = 0; i < s.length(); ++i) {
			ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			}
			//  ch == ')' || ch == '}' || ch == ']'
			Character c = stack.pop();
			if ((ch == ')' && c == '(')
					|| (ch == '}' && c == '{')
					|| (ch == ']' && c == '[')) {
				continue;
			}
			return false;
		}
		return stack.empty();
	}

}
