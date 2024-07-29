package stacks;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static void balencedParenthesis(String s) {
		if(s.charAt(0) == ')')
			return;
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
				stack.push(s.charAt(i));
			else if(stack.pop() != '(') {
				System.out.println("Not a Valid Parenthesis");
				   break;
		}	
		}
		if(stack.isEmpty()) {
			System.out.println("It is a Valid Parenthesis");
		}
		else
			System.out.println("It is not a Valid Parenthesis");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(())";
		balencedParenthesis(s);

	}

}
