package arrays.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysWithDuplicates {
	
	/* https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
	 1) sort both the arrays
	 2) use two pointer compare both the values
	 */
	
	//Time Complexity - > O(n^2)
	
	public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
	
		//sorting the arrays
		//O(n) space O(n)
		ArrayList<Integer> al = new ArrayList<Integer>();
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i < nums1.length; i++)
	       map.put(nums1[i], map.getOrDefault(nums1[i], 0) +1);
	    for(int i = 0; i < nums2.length; i++){
	        if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
	            al.add(nums2[i]);
	            map.put(nums2[i], map.get(nums2[i]) - 1);
	        }
	    }
	    int[] res = new int[al.size()];
	    for(int i = 0; i < res.length; i++)
	        res[i] = al.get(i);
	     return res; 
 }
	public static void main(String[] args) {
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		//output[4,9]
		int[] result = intersectionOfTwoArrays(nums1,nums2);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
	}

}
