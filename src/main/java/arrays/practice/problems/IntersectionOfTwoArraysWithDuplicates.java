package arrays.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysWithDuplicates {
	
	/* https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
	 1) sort both the arrays
	 2) use two pointer compare both the values
	 */
	
	//Time Complexity - > O(n^2)
	
	public static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
	
		//sorting the arrays
		//O(nums1lognums1 + nums2Lognums2)
	 Arrays.sort(nums1);
     Arrays.sort(nums2);
     ArrayList ls = new ArrayList();
     int i = 0, j = 0;
     //comparing the values
     while(i < nums1.length && j < nums2.length){
         if(nums1[i] == nums2[j]){
             ls.add(nums1[i]);
             i++;
             j++;
         }
         else if(nums1[i] > nums2[j]){
             j++;;
         }
         else if(nums1[i] < nums2[j]){
             i++;
         }
     }
     int resultArray[] = new int[ls.size()];
     int k = 0;
     for(int l = 0; l < ls.size(); l++){
       //  System.out.println(ls.get(l));
       resultArray[k] = (Integer)ls.get(l);
       k++;
     }
     return resultArray;
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
