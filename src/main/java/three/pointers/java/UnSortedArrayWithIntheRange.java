package three.pointers.java;

import java.util.Arrays;

public class UnSortedArrayWithIntheRange {
	/*
	 * You have an unsorted array of integers and a function
string getCategory(integer), which deterministically returns 1 of three possible strings: "low", "medium", or "high", depending on the input integer. You need to output an array with all the "low" numbers at the bottom, all the "medium" numbers in the middle, and all the "high" numbers at the top. This is basically a partial sort. Within each category, the order of the numbers does not matter.

For example, you might be give the array [5,7,2,9,1,14,12,10,5,3].
For input integers 1 - 3, getCategory(integer) returns "low", for 4 - 10 it returns "medium," and for 11 - 15 it returns "high".

You could output an array (or modify the given array) that looks like this: [3,1,2,5,5,9,7,10,14,12]
	 */
	
	public static int[] unsortedArray(int[] nums) {
		int low = 0, middle = 0, high = nums.length - 1;
		while(middle <= high) {
			 if(getCategory(nums[middle]).equalsIgnoreCase("Low")) {
				int temp = nums[middle];
				nums[middle] = nums[low];
				nums[low] = temp;
				low++;
				//middle++;
			}
			 else if(getCategory(nums[middle]).equalsIgnoreCase("Middle")) {
				 middle++;
			 }
			 else {
				 int temp = nums[middle];
				 nums[middle] = nums[high];
				 nums[high] = temp;
				 high--;
			 }
			
		}
		
		return nums;
	}
	
	public static String getCategory(int n) {
		if(n <= 3) {
			return "Low";
		}
		else if(n >= 4 && n <= 10) {
			return "Middle";
		}
		else {
			return "High";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,2,9,1,14,12,10,5,3};
		int[] result = unsortedArray(arr);
		System.out.println(Arrays.toString(result));
		

	}

}
