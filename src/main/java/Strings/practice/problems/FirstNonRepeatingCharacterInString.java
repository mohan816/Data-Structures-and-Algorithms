package Strings.practice.problems;

/*
 * Problem Statement: We have to return the index of the first left most 
 * non repeating character in a String.
 * Pseudocode:
 * 1) Create the count array of size 256, iterate the String
 *    and increment the count array by 1 in the respective index position
 *    (ASCII value of the character)
 * 2) Iterate the String and check whether the value is 1 in the index 
 *    position(ASCII value of the character) in the count array
 *    and return the index position of the character in a String
 * 3) If all the characters in the String are duplicate then return -1.
 *   
 */

public class FirstNonRepeatingCharacterInString {
	
	public static int leftMostNonRepeatingCharacter(String s) {
		int[] count = new int[256];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i)] == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s = "aabble";
          System.out.println("Output is " + leftMostNonRepeatingCharacter(s));
	}

}
