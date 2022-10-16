package arrays.practice.problems;

import java.util.Arrays;

public class SortArrayByParity {
	
	/*
	 * create new array of size nums.length
	 * push even values to front and once completed then push the odd values to next
	 * 
	 */
	
	 public static int[] sortArrayByParityWithoutMod(int[] nums) {
	        int[] arr = new int[nums.length];
	        int j = 0;
	        for(int i = 0; i < nums.length; i++){
	        	int a = nums[i] / 2;
	            if(a * 2 == nums[i]){
	                arr[j] = nums[i];
	                nums[i] = 0;
	                j++;
	            }
	        }
	        for(int i = 0; i < nums.length; i++){
	           if(nums[i] != 0){
	               arr[j] = nums[i];
	               j++;
	           }
	          
	        }
	         return arr;
	    }
	 
	 public static int[] sortArrayByParityWithMod(int[] nums) {
	        int[] arr = new int[nums.length];
	        int j = 0;
	        for(int i = 0; i < nums.length; i++){
	        	//int a = nums[i] / 2;
	            if(nums[i] %2 == 0){
	                arr[j] = nums[i];
	                nums[i] = 0;
	                j++;
	            }
	        }
	        for(int i = 0; i < nums.length; i++){
	           if(nums[i] != 0){
	               arr[j] = nums[i];
	               j++;
	           }
	          
	        }
	         return arr;
	    }
	 
	 public static int[] sortArrayTwoPointer(int[] nums) {
		 int start = 0, end = nums.length - 1;
		 while(start < end) {
			 if(nums[start] % 2 == 0 && nums[end] %2 != 0) {
				 start++;
				 end--;
			 }
			 else if(nums[start] % 2 != 0 && nums[end] % 2 == 0) {
				 int temp = nums[start];
				 nums[start] = nums[end];
				 nums[end] = temp;
				 start++;
				 end--;
			 }
			 else if(nums[start] % 2 == 0 && nums[end] % 2 == 0) {
				 start++;
			 }
			 else if(nums[start] % 2 != 0 && nums[end] % 2 != 0) {
				 end--;
			 }
			 
		 }
		 return nums;
	 }
	 
	 public static int[] sortArray(int[] nums) {
		 int[] eArr = new int[nums.length];
		 int[] oArr = new int[nums.length];
		 int j = 0, x = 0;

		   for(int i = 0; i< nums.length; i++){
		    if(nums[i]%2 == 0){
		       eArr[j]  = nums[i]; 
		       j++;
		 } 
		    }

		 for(int i = 0; i< nums.length; i++){
		    if(nums[i] %2 != 0){
		       oArr[x]  = nums[i];  
		       x++;
		 }
		    }
		  
		// j += 1;
		 
		 int startFromZero = 0;
		 while( j < eArr.length){
			 
		  eArr[j] = oArr[startFromZero];
		  startFromZero++;
		  j++;

		 }

		 System.out.println(Arrays.toString(eArr));
		  return eArr;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] nums = {3,1,2,4};
		 int[] arr = sortArray(nums);
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		 }
		  
		// int[] arr =  sortArrayTwoPointer(nums);
		// System.out.println(Arrays.toString(arr));
		 
			/*
			 * for(int i = 0; i < arr.length; i++) { System.out.print(arr[i]+" "); }
			 */
	
		   		}

	}

