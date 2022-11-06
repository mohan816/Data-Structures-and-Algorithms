package test_5nov_2022;

import java.util.HashSet;

public class LongestSubString {

	//https://leetcode.com/problems/longest-substring-without-repeating-characters/
	
    public int lengthOfLongestSubstring(String s) {
    	//if the string length is 1 return 1
        if(s.length() == 1){
            return 1;
        }
         int max = 0, j = 0;
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++){
        	//Once we find the duplicates, remove all the characters upto duplicate
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
                 //j++;  
            }
            //If the character is not there in the set then add it to the set
            hs.add(s.charAt(i));
            //each time compare with max, if max is less than the size the update max with size
           if(hs.size() > max) {
               max = hs.size();
           }     
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: s = "abcabcbb"
         Output: 3
         Explanation: The answer is "abc", with the length of 3.
		 */

	}

}
