package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
/*
 * 1) 
 * 2) 
 */

public class Nov02_SubstringSize3 {
	
	public static int countGoodSubstrings(String s) {
		if(s.length() == 1 || s.length() == 2){
            return 0;
        }
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < 3; i++)
           map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        if(map.size() == 3)
            count++;
        int j = 0;
        for(int i = 3; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
            if(map.get(s.charAt(j)) > 1)
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
            else
                map.remove(s.charAt(j));
            if(map.size() == 3)
                 count++;
            j++;
        }
        return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aababcabc";
	int result = countGoodSubstrings(s);
		

	}

}
