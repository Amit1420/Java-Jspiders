package com.amit.stringprogramspack;

import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		System.out.println(isBalanced("[{()}]"));
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else if (c == ']' || c == '}' || c == ')') {
				if (stack.isEmpty() || !isPair(stack.pop(), c))
					return false;
			}
		}
		return stack.isEmpty();
	}

	static boolean isPair(char c1, char c2) {
		if ((c1 == '[' && c2 == ']'))
			return true;
		if (c1 == '{' && c2 == '}')
			return true;
		if (c1 == '(' && c2 == ')')
			return true;
		return false;
	}
}
