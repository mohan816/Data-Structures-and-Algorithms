package arrays.practice.problems;

import java.util.Stack;

public class PallindromeUsingStack {
	
	public static boolean pallindromeUsingStack(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		int i = 0, j = ch.length-1;
		while(i < j) {
			st.push(ch[i]);
			if(st.peek() != ch[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaa";
		boolean b = pallindromeUsingStack(s);
		System.out.println(b);

	}

}
