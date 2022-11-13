package hashing;

public class Nov13_MaximumSubArray {
	
	/*https://leetcode.com/problems/maximum-subarray/
    1) Create two variables one is to find max values and other is to return the result.
    2) Assue nums[0] as max and result, start the loop from 1st index
    3) return the result
    */
    public int maxSubArray(int[] nums) {
        int max = nums[0], res = nums[0];
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max + nums[i], nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
 Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
Input: nums = [1]
Output: 1

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
		 */

	}

}
