package arrays.practice.problems;

//https://leetcode.com/problems/number-of-arithmetic-triplets/description/

public class NumberOfArithmeticTriplets {
	
	public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i = 0; i <= nums.length - 3; i++){
            for(int j = i + 1; j <= nums.length - 2; j++){
                for(int k = j + 1; k <= nums.length - 1; k++){
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		int[] nums = {0,1,4,6,7,10};
		int diff = 3;
		System.out.println(arithmeticTriplets(nums,diff));
		//System.out.println(result);

	}

}
