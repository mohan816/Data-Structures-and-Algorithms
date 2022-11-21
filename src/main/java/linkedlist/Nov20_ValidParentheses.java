package linkedlist;

import java.util.Stack;

public class Nov20_ValidParentheses {
	//https://leetcode.com/problems/valid-parentheses/description/
	
	public boolean isValid(String s) {
	       Stack<Character> st = new Stack<Character>();
	       for(int i = 0; i < s.length(); i++){
	           if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
	                  st.push(s.charAt(i));
	            else if(!st.isEmpty()){
	            if(s.charAt(i) == ')' && (char)st.peek() == '(')
	                st.pop();
	            else if(s.charAt(i) == ')' && (char)st.peek() != '(')
	                st.push(s.charAt(i));
	            else if(s.charAt(i) == '}' && (char)st.peek() == '{')
	                st.pop();
	            else if(s.charAt(i) == '}' && (char)st.peek() != '{')
	                st.push(s.charAt(i));
	            else if(s.charAt(i) == ']' && (char)st.peek() == '[')
	                st.pop();
	            else if(s.charAt(i) == ']' && (char)st.peek() != '[')
	                st.push(s.charAt(i));
	            }
	            else
	                st.push(s.charAt(i));
	            }
	           // System.out.println(st);
	            return st.isEmpty();
	       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
		 */

	}

}
