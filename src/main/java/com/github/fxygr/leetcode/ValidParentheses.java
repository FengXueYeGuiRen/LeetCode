package com.github.fxygr.leetcode;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * (https://leetcode.com/problems/valid-parentheses/)
 * 20. 有效的括号
 *
 * @author FXYGR @date 2020-05-12
 */
public class ValidParentheses {

	public static final Character ROUND_BRACKETS_LEFT = '(', ROUND_BRACKETS_RIGHT = ')';
	public static final Character CURLY_BRACKETS_LEFT = '{', CURLY_BRACKETS_RIGHT = '}';
	public static final Character SQUARE_BRACKETS_LEFT = '[', SQUARE_BRACKETS_RIGHT = ']';

	public boolean isValid(String s) {
		if (s == null || s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();

		Character ch;
		for (int i = 0; i < s.length(); ++i) {
			ch = s.charAt(i);
			if (isLeft(ch)) {
				stack.push(ch);
				continue;
			}
			//  ch == ')' || ch == '}' || ch == ']'
			if (stack.empty()) {
				continue;
			}
			Character c = stack.pop();
			if (isBrackets(c, ch)) {
				continue;
			}
			return false;
		}
		return stack.empty();
	}

	private boolean isLeft(Character ch) {
		return ch != null &&
				(ROUND_BRACKETS_LEFT.equals(ch)
						|| CURLY_BRACKETS_LEFT.equals(ch)
						|| SQUARE_BRACKETS_LEFT.equals(ch)
				);
	}

	private boolean isBrackets(Character left, Character right) {
		return isRoundBrackets(left, right)
				|| isCurlyBrackets(left, right)
				|| isSquareBrackets(left, right);
	}

	private boolean isRoundBrackets(Character left, Character right) {
		return left != null && right != null
				&& ROUND_BRACKETS_LEFT.equals(left)
				&& ROUND_BRACKETS_RIGHT.equals(right);
	}

	private boolean isCurlyBrackets(Character left, Character right) {
		return left != null && right != null
				&& CURLY_BRACKETS_LEFT.equals(left)
				&& CURLY_BRACKETS_RIGHT.equals(right);
	}

	private boolean isSquareBrackets(Character left, Character right) {
		return left != null && right != null
				&& SQUARE_BRACKETS_LEFT.equals(left)
				&& SQUARE_BRACKETS_RIGHT.equals(right);
	}

}
