package Strings.practice.problems;

import java.util.Scanner;

/*
 * Anagram: Frequency of characters in both the string must be same
 */

public class IsAnagram {
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		int[] arr = new int[128];
		for(int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)]++;
			arr[s2.charAt(i)]--;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)
				return false;
		}

		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String");
		String s2 = sc.nextLine();
		System.out.println(isAnagram(s1, s2));
	}
}
