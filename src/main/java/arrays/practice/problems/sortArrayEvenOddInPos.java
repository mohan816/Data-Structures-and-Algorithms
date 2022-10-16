package arrays.practice.problems;

import java.util.Arrays;

public class sortArrayEvenOddInPos {

	
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
