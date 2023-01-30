package Strings.practice.problems;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PallindromicSubString {
    
	//PseudoCode
	/*
	 * 1) Created two pointers left and right for moving left and right in the string respectively
	 * 2) In the for loop condition I have mentioned i to travel upto i < 2 * str.length(), because I am diving the i / 2 and assign
	 * it to left, At one point the left pointer need to point the last index value, so for that reason I have taken the condition like that.
	 *  
	 */
	public static void isPallindromicSubString(String str) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		int left = 0, right = 0;
		int i = 0;
		for(i = 0; i < 2 * str.length(); i++) {
			left = i/2;
		    right = left + i%2;
		while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
				set.add(str.substring(left, right + 1));
				right++;
				left--;
			}
	}
		System.out.println(set);
		}
		


public static void main(String[] args) {
	isPallindromicSubString("aaabbads");

}

}
