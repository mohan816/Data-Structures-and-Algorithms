package arrays.practice.problems;

import java.util.Arrays;

//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

public class LargestPositiveIntegerExistsWithNegative {
	
	public int findMaxK(int[] nums) {
        //Sorting the array to get the values in ascending order
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        //one pointer starts with 0 and other one is starts with length - 1
        while(i <= j){
        	//Multiplying the negative value with -1, then it will become positive and comparing
            if((-1 * nums[i]) == nums[j]){
                return nums[j];
                //break;
            }
            else if((-1 * nums[i]) > nums[j]){
                   i++;;
            }
            else if((-1 * nums[i]) < nums[j]){
                j--;
            }
            else{
               return -1;
            }
        }
        return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
