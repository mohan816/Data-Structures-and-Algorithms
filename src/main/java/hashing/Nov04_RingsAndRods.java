package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Nov04_RingsAndRods {
	
	//https://leetcode.com/problems/rings-and-rods/
	
	public static int countPoints(String rings) {

        int count = 0;
        //Converting it into character array
        char[] c = rings.toCharArray();
        //to store the rods and set of rings
        HashMap<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();
        for(int i = 1; i < c.length; i = i + 2){
            if(map.containsKey(c[i])){
           //If the rod is already there, then get its value and store it hash set and add the new ring
           HashSet<Character> hs = new HashSet<Character>();
           hs.addAll(map.get(c[i]));
           hs.add(c[i - 1]);
            map.put(c[i], hs);
            }
            
            else{
            	//First time we are adding the rod and the ring
                HashSet<Character> hs = new HashSet<>();
                hs.add((c[i - 1]));
                map.put(c[i], hs);
            }
        }
        //getting the size of each rod, if it is three then increment the count by 1.
        for(Map.Entry<Character, Set<Character>> ch : map.entrySet()){
            if(ch.getValue().size() == 3){
                count++;
            }
        }
     return count;
    }
	/*
	 * 1) three arrays of size 10 for three colours
	 * 2) if the colour is found then increment the respective index position of the colour
	 * 3) iterate three arrays and check the respective indexes have the values, if they have incremnet the count.
	 */
	public static int countPointsUsingArrays(String rings) {
		int[] r = new int[10];
		int[] b = new int[10];
		int[] g = new int[10];
		for(int i = 1; i < rings.length(); i = i + 2) {
			if(rings.charAt(i - 1) == 'B') {
				b[rings.charAt(i) - 48]++;
			}
			else if(rings.charAt(i - 1) == 'G') {
				g[rings.charAt(i) - 48]++;
			}
			else {
				r[rings.charAt(i) - 48]++;
			}
		}
		int count = 0;
		for(int i = 0; i < 10; i++) {
			if(r[i] > 0 && b[i] > 0 && g[i] > 0) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		

	     String rings = "B0B6G0R6R0R6G9";
	     int result = countPointsUsingArrays(rings);
	     System.out.println(result);
	     
		 /*
Output: 1
Explanation: 
- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
- The rod labeled 6 holds 3 rings, but it only has red and blue.
- The rod labeled 9 holds only a green ring.
Thus, the number of rods with all three colors is 1.
		 */

	}

}
