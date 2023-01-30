package Strings.practice.problems;

import java.util.Arrays;
import java.util.HashSet;

public class ShortestDistanceToACharacter {
	//Positive - > String s = "loveleetcode";char c = 'e';
	//Negative - > No target character
	//Edge - > Empty String
	
	/*  Forward direction
	 * 1) Convert String into empty array
	 * 2) Assign int min/2 value to eindex
	 * 3) Create an Array with String length
	 * 4) Start the for loop from index 0 upto length-1, if e is there assign its index value to eIndex variable.
	 * 5) store it in array i - eIndex
	 * 
	 * Backward Direction
	 * 1) Assign int max/2 value to eIndex
	 * 2) Start the for loop from index length-1 to 0, if e is there assign its index value to eIndex variable.
	 * 3) Use Math.min function(If the value is greater in array replace it with current value else leave as it is),
	 */
	
	//Time Complexity - O(n), space O(n)
	public static void shortestDistance(String s, char c) {
		//int a = - 10;
		//int b = 2;
		//System.out.println(a/b);
		char[] strch = s.toCharArray();
	    int eIndex = Integer.MIN_VALUE/2;
	    System.out.println(eIndex);
	    int[] res = new int[strch.length];

	    for (int i = 0; i < strch.length; i++) {
	        if (strch[i] == c) {
	            eIndex = i;
	        }
	        res[i] = i - eIndex;
	    }
	    System.out.println(Arrays.toString(res));
	    eIndex = Integer.MAX_VALUE/2;
	    for (int i = strch.length - 1; i >= 0; i--) {
	        if (strch[i] == c) {
	            eIndex = i;
	        }
	        res[i] = Math.min(eIndex - i, res[i]);
	    }
	    System.out.println(Arrays.toString(res));
	    
	   // return res;
	}
	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		shortestDistance(s,c);
	}
	

}
