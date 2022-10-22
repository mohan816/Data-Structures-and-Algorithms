package arrays.practice.problems;

public class IntersectionOfTwoArrays {
	
	//https://leetcode.com/problems/intersection-of-two-arrays/
	//O(n^2)
	 public int[] intersection(int[] nums1, int[] nums2) {

	        //removing duplicates in first array
	        for(int i = 0; i < nums1.length - 1; i++){
	            if(nums1[i] == Integer.MIN_VALUE){
	                continue;
	            }
	            for(int j = i + 1 ; j <nums1.length; j++){
	                if(nums1[i] == nums1[j]){
	                    nums1[j] = Integer.MIN_VALUE;
	                }
	            }
	        }
	         //removing duplicates in second array
	        for(int i = 0; i < nums2.length - 1; i++){
	            if(nums2[i] == Integer.MIN_VALUE){
	                continue;
	            }
	            for(int j = i + 1 ; j <nums2.length; j++){
	                if(nums2[i] == nums2[j]){
	                    nums2[j] = Integer.MIN_VALUE;
	                }
	            }
	        }
	        //finding intersection between both the arrays
	        int count = 0;
	        for(int i = 0; i < nums1.length; i++){
	            if(nums1[i] == Integer.MIN_VALUE){
	                continue;
	            }
	            for(int j = 0; j < nums2.length; j++){
	                if(nums1[i] == nums2[j]){
	                    count++;
	                    break;
	                }
	            }
	        }
	       // System.out.println(count);
	        int[] finalArray = new int[count];
	        int k = 0;
	        for(int i = 0; i < nums1.length; i++){
	            if(nums1[i] == Integer.MIN_VALUE){
	                continue;
	            }
	            for(int j = 0; j < nums2.length; j++){
	                if(nums1[i] == nums2[j]){
	                    finalArray[k] = nums1[i];
	                    k++;
	                    break;
	                }
	            }
	        }

	       return finalArray; 
	    }

}
/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2] */
