package arrays.practice.problems;

import java.util.Arrays;

public class MergeSortedArray {
	//https://leetcode.com/problems/merge-sorted-array/description/
	/*
	 * 1) Insert second array starts with index 0 to first array from m position in firstArray
	 * 2) Use Arrays.sort()
	 * 
	 * 
	 */
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       //(nlogn)
        int i = m, j = 0;
        while(i < nums1.length){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
       
        }

	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int m = 3, n = 3;
		merge(nums1,m,nums2,n);
		
		
				//Output: [1,2,2,3,5,6]
		     }
		// TODO Auto-generated method stub

	}

