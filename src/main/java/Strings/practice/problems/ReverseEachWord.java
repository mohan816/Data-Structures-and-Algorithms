package Strings.practice.problems;

public class ReverseEachWord {
	//Positive - > String s = "Let's take LeetCode contest
	//Negative - > null string
	//edge - > String with only one word
	
	/*
	 * 1) split if the space occurs
	 * 2) reverse from first word last index..COntinue until splitted length
	 */
	//https://leetcode.com/problems/reverse-words-in-a-string-iii/
	//Time Complexity - O(n^2) space O(n)
	public static String reverseWords(String s) {
        String result = "";
        String[] splitted = s.split(" ");
        for(int i = 0; i < splitted.length; i++){
            for(int j = splitted[i].length() - 1; j >= 0; j--){
                result = result + splitted[i].charAt(j);
            }
            result = result + " ";
        }
        return result.trim();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's Nohan";
		String result = reverseWords(s);
		System.out.println(result);
		

	}

}
