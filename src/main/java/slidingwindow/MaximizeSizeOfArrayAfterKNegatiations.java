package slidingwindow;

import java.util.TreeSet;

public class MaximizeSizeOfArrayAfterKNegatiations {

	public static int largestSumAfterKNegations(int[] nums, int k) {
		int kCount = 0, sum = 0;
        while(kCount < k){
            int min = nums[0], index = 0;
            for(int i = 1; i < nums.length; i++){
                if(min > nums[i]){
                    min = nums[i];
                    index = i;
                }
            }
            nums[index] = -nums[index];
            kCount++;
        }
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-2,-3};
		int result = largestSumAfterKNegations(arr, 4);
		System.out.println(result);
	}

}
