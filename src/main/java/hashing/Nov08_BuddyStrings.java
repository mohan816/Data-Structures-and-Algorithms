package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Nov08_BuddyStrings {
	
	/*
    1) if both string lengths are not equal return false
    2) if both string contents are equal put them in set and if the set size is less than string length return true
    3) if both string contents are not equal but the lengths are equal then create the array list, iterate the strings if the characters are not matching at particular index add that index position to the set.
    4) ArrayList size should be equal to 2  && s.charAt(al.get(0)) == goal.charAt(al.get(1) && s.charAt(al.get(1) == goal.charAt(al.get(0)), then return it else return false.
    */
   
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        HashSet<Character> hs = new HashSet<Character>();
        if(s.equals(goal)){
        for(int i = 0; i < s.length(); i++)
            hs.add(s.charAt(i));
        if(hs.size() < s.length())
         return true;
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(s.length() == goal.length() && !s.equals(goal)){
         for(int i = 0; i < s.length(); i++){
             if(s.charAt(i) != goal.charAt(i))
             al.add(i);
         }
         if(al.size() == 2 && s.charAt(al.get(0)) == goal.charAt(al.get(1)) && s.   charAt(al.get(1)) == goal.charAt(al.get(0)))
         return true;
        }
       return false;
        }
	
	 /*
    1) Compare two string lengths, if they are not equal return false
    2) Put two strings in the map and compare those are equal, if equal return true, else return false
    */
    public boolean buddyStringsBruteForce(String s, String goal) {
        //If lengths are not matching return false
        if(s.length() != goal.length()){
            return false;
        }
        //to check both strings are having equal frequency
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> gMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
             sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
             gMap.put(goal.charAt(i), gMap.getOrDefault(goal.charAt(i), 0) + 1);
        }
        //if the maps are not matching return false
        if(!sMap.equals(gMap))
            return false;
        //if maps are equal but the replacement of character is more than 2 return false
        //if the replacement characters are more than 0 and less or equal to 2 return true;
        else if(sMap.equals(gMap)){
            int count = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != goal.charAt(i))
                    count++;
                    if(count > 2){
                        return false;
                    }
                }
                if(count > 0 && count <=2){
                    return true;
                }
            }
            //Maps are equal and all the characters are in same position of each string and the     frequency of any character is greater than 1, then return true.
            if(sMap.equals(gMap)){
               for(Map.Entry<Character, Integer> m : sMap.entrySet()){
                    if(m.getValue() > 1){
                        return true;
                    }
            }
            }
          return false;  
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
		 */

	}

}
