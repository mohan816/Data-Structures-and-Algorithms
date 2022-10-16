package arrays.practice.problems;

import java.util.Arrays;

public class sortArrayEvenOddInPos {
	
	/*
	 * Create a new array with size of nums.length
	 * create two varaibles one for even position and the other for odd position
	 * if we mod the value aand it is equal to zero push it even position and increment even position by 2
	 * if it not zero, then push it odd pos and add 2 to odd pos variable
	 * return newly created array
	 */

	
		// TODO Auto-generated method stub
		
		public static int[] sortArrayByParityII(int[] nums){
	        int[] arr = new int[nums.length];
	        int even = 0, odd = 1;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] %2 == 0){
	                arr[even] = nums[i];
	                even = even + 2;
	            }
	            else{
	                arr[odd] = nums[i];
	                odd = odd + 2;
	            }
	        }
	        return arr;
	    }
		
		public static void main(String[] args) {
			int[] arr = {4, 2, 5, 7};
			int[] sortedInRespectivePositions = sortArrayByParityII(arr);
			System.out.println(Arrays.toString(sortedInRespectivePositions));

	}	

}
