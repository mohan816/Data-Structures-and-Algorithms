package test_5nov_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindingAllAnagramsInAString {
	
	//https://leetcode.com/problems/find-all-anagrams-in-a-string/
	
	 public List<Integer> findAnagrams(String s, String p) {
	        if(s.length() < p.length()){
	            return new ArrayList<>();
	        }
	        //Create two separate hash maps to store their respective characters and values
	        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> pMap = new HashMap<Character,Integer>();
	        //Storing the characters in each map upto p.length()
	        for(int i = 0; i < p.length(); i++){
	             sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
	             pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
	        }
	        //initializing left = 0, to store the index to the arraylist
	        int left = 0, right = p.length();
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        //right should be less than s.length()
	        while(right < s.length()){
	            //comparing each maps if they match add the index value to the list
	            if(sMap.equals(pMap))
	             al.add(left);
	             //Adding the right character
	             sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right),0)+1);
	             //removing the left side character in the window
	             if(sMap.get(s.charAt(left)) == 1)
	             sMap.remove(s.charAt(left));
	             else
	             sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);
	             left++;
	             right++;

	        }
	        if(sMap.equals(pMap)){
	            al.add(left);
	        }
	        return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * inputs s = "cbaebabacd", p = ""abc"
		 * 
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
		 */

	}

}
