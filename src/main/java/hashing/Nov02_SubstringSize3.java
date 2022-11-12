package hashing;

import java.util.ArrayList;
import java.util.HashSet;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
/*
 * 1) Create an array list add each characters once it reached 3 size
 * 2) Put it in hash set if the size is 3 increase the count.
 */

public class Nov02_SubstringSize3 {
	
	public static int countGoodSubstrings(String s) {
        if(s.length() == 1 || s.length() == 2){
            return 0;
        }
        char[] c = s.toCharArray();
        ArrayList<Character> h = new ArrayList<Character>();
        int start = 0, count = 0;
        for(int i = 0; i < 3; i++){
            h.add(c[i]);
        }
        HashSet<Character> hs = new HashSet<Character>(h);
        if(hs.size() == 3){
            count++;
        }
        for(int i = 3; i < c.length; i++){
             h.remove(start);
            // start++;
             if(h.add(c[i])){
                HashSet<Character> hs1 = new HashSet<Character>(h);
                if(hs1.size() == 3)
                  count++;
             }
    }
return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aababcabc";
	int result = countGoodSubstrings(s);
		

	}

}
