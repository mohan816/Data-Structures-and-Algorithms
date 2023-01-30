package arrays.practice.problems;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	
	//https://leetcode.com/problems/intersection-of-two-arrays/
	//O(n^2) space - O(n)
	 public int[] intersection(int[] nums1, int[] nums2) {
		 ArrayList<Integer> al = new ArrayList<>();
	        HashSet<Integer> hs = new HashSet<Integer>();
	        HashSet<Integer> hs1 = new HashSet<Integer>();
	        for(int i = 0; i < nums1.length; i++)
	              hs.add(nums1[i]);
	        for(int i = 0; i < nums2.length; i++)
	              hs1.add(nums2[i]);
	        for(int a : hs){
	            if(hs1.contains(a))
	                al.add(a);
	        }
	        int[] arr = new int[al.size()];
	        for(int i = 0; i < al.size(); i++)
	            arr[i] = al.get(i);
	        return arr;
	      
	        }

	    }
/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2] */
