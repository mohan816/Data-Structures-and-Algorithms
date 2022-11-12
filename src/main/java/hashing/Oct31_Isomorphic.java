package hashing;

import java.util.HashMap;
import java.util.Map;

public class Oct31_Isomorphic {
	
	//https://leetcode.com/problems/isomorphic-strings/description/
	/*
	 * 1) If the map is empty put first character of string s to key and first character string t to value
	 * 2) If the map is not empty check the character from string s is already there in the key if it is already there then the value must match with
	 * character which we are going to insert from string t. else return false
	 * 3) If the key from string s which we are going to put to the map is not there in key, then the check the value which we are going to put is already
	 * there in the map, if it is there then return false.
	 */
	
	public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<Character,Character>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
               if(map.get(s.charAt(i)) != t.charAt(i))
                   return false;
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                   map.put(s.charAt(i),t.charAt(i)); 
            }
                   
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Output: true, Input: s = "egg", t = "add"
		//Output: false, Input : s = "foo", t = "bar"
		//Output: true, Input : s = "Paper", t = "title"
		String s = "egg", t = "add";
		boolean b = isIsomorphic(s,t);
		System.out.println(b);

	}

}
