package Strings.practice.problems;

import java.util.Arrays;

public class ShortestDistanceToACharacter {
	
	public static void shortestDistance(String s, char c) {
		//int a = - 10;
		//int b = 2;
		//System.out.println(a/b);
		char[] strch = s.toCharArray();
	    int eIndex = Integer.MIN_VALUE;
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
