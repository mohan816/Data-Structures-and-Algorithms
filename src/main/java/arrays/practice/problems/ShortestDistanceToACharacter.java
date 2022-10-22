package arrays.practice.problems;

public class ShortestDistanceToACharacter {

	// https://leetcode.com/problems/shortest-distance-to-a-character/

	/*
    1) need two pointers, both are starting at index 0
    2) if both are matching then, second pointer - first pointer , add the value to array, then increment second pointer to next position.
    3) if elements are not matching with target, then move second pointer to until target element. then end pointer - start pointer...incement start by 1 upto both are at same index.
    while(firstpointer < arr.length)
    positive - > given string with multiple values with target matching
    negative - > given string but values are not matching with target
    edge - string length is 1 and not matching return empty array
           string length is 1 and  matching return zero.
	 */
             //Time Complexity - > O(n)
	public static int[] shortestToChar(String s, char c) {
		int i = 0, eIndex = Integer.MIN_VALUE/2;
		int[] res = new int[s.length()];
		while(i < s.length()) {
			if(s.charAt(i) == c) {
				eIndex = i;
			}
			res[i] = i - eIndex;
			i++;
		}
		int j = s.length() - 1;
		int eIndexFromRight = Integer.MAX_VALUE/2;
		while(j >= 0) {
			if(s.charAt(j) == c) {
				eIndexFromRight = j;
			}
			res[j] = Math.min(res[j], eIndexFromRight - j);
			j--;
		}
		return res;

	}
	public static void main(String[] args) {
		String s = "loveleetcode"; 
		char ch = 'e';
		int[] result = shortestToChar(s,ch);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}
}

