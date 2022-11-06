package test_5nov_2022;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
	
	//https://leetcode.com/problems/first-unique-character-in-a-string/
	public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //Add all the characters to the map with the frequency
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        //checking the first character with the frequency of 1 and returning it's index
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        //If there is no characters with the frequency 1 then return -1
        return -1;
    }

	public static void main(String[] args) {
		/*
		 * Input: s = "loveleetcode"
           Output: 2
		 */

	}

}
