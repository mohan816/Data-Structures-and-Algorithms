package slidingwindow;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
public class DifferenceBetweenHighestAndLowest {
	
	public static int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int pointer = k;
        while(pointer <= nums.length){
            int highest = nums[pointer - 1];
            int lowest = nums[pointer - k];
            min = Math.min(min, highest-lowest);
            pointer++;

        }

     return min;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {87063,61094,44530,21297,95857,93551,9918};
		int k = 6;
		int result = minimumDifference(arr, 6);
		System.out.println(result);
		

	}

}
