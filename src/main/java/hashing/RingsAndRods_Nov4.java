package hashing;

import java.util.HashMap;
import java.util.Map;

public class RingsAndRods_Nov4 {
	
	//https://leetcode.com/problems/rings-and-rods/
	
	public int countPoints(String rings) {
	     int count = 0;
		    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		    for(int i = 0; i < rings.length(); i = i + 2){
		    	map.put(rings.charAt(i + 1) - '0', map.getOrDefault(rings.charAt(i + 1) - '0', 0)+rings.charAt(i));
		    }
		    for(int i = 0; i < 10; i++){
		        if(map.containsKey(i)) {
		        	if( map.get(i) % 219 == 0)
		            count++;
		        }
		    }
		     return count;  
		    }

	public static void main(String[] args) {
		/*
		 * Input: rings = "B0B6G0R6R0R6G9"
Output: 1
Explanation: 
- The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
- The rod labeled 6 holds 3 rings, but it only has red and blue.
- The rod labeled 9 holds only a green ring.
Thus, the number of rods with all three colors is 1.
		 */

	}

}
