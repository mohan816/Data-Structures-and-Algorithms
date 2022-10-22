package Strings.practice.problems;

import java.util.HashSet;

public class VowelsNameReverse {
	//Positive - > "leetcode";
	//Edge - > Empty String
	//Negative - No Vowles
	/*
	 * 1) Convert it into character array
	 * 2) Create two variables i and j starts with 0 and length-1 respectively
	 * 3) Create a HashSet and add all the the vowels both upper and lower case letters
	 * 4) create a while loop , if i >= j then terminate the while loop.
	 * 5) create four conditions 1)Both vowel 2) i is vowel & j is not vowel 3) i is not vowel and j is vowel 4) both are not vowel
	 * 6) Create an empty string and append all the characters and return the string
	 */
	//https://leetcode.com/problems/reverse-vowels-of-a-string/	
      //Time Complexity - O(n)
	public static String reverseVowels(String s) {
		// String result = s;
		char[] c =  s.toCharArray();
		int j = c.length-1, i = 0;
		HashSet<Character> set = new HashSet<Character>();
		set.add('A');
		set.add('I');
		set.add('E');
		set.add('O');
		set.add('U');
		set.add('a');
		set.add('i');
		set.add('e');
		set.add('o');
		set.add('u');
		
		while(i < j) {
			//Non vowel 
			if(!set.contains(c[i]) && !set.contains(c[j])){
				i++;
				j--;
			}
			//both vowel
			else if(set.contains(c[i]) && set.contains(c[j])) {
				char ch = c[i];
				c[i] = c[j];
				c[j] = ch;
				i++;
				j--;
			}
			//i is vowel && j is not vowel
			else if(set.contains(c[i]) && !set.contains(c[j])) {
				j--;
				
			}
			//i is not vowel and j is vowel
			else {
				i++;
			}
			
		}
			
		String result = "";
		for(int k = 0; k < c.length; k++){
			result = result + c[k];
		
	}
		return result;
	}
	public static void main(String[] args) {
		String s = "leetcode";
		String result = reverseVowels(s);
		System.out.println(result);
	}


}

