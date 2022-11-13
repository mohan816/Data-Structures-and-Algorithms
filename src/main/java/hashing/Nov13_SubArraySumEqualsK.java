package hashing;

import java.util.HashMap;

public class Nov13_SubArraySumEqualsK {
	
	 /*https://leetcode.com/problems/subarray-sum-equals-k/
    1) declare two variables prefix_sum and for count
    2) if prefix_Sum == k, increase the count
    3) if map containsKey prefix_sum - k, then get it's value and add it to the count
    4) Add the prefix sum to the map, if it is already there increase there value by 1
    5) Finally return the count.
    */
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int pre_sum = 0, count = 0;
        if(nums.length == 1 && nums[0] != k)
        return 0;
        else if(nums.length == 1 && nums[0] == k)
        return 1;
        for(int i = 0; i < nums.length; i++){
            pre_sum += nums[i];
            if(pre_sum == k)
            count++;
            if(map.containsKey(pre_sum - k))
            count = count + map.get(pre_sum - k);
            map.put(pre_sum, map.getOrDefault(pre_sum, 0) + 1);
            
           
        }
      return count; 
}

	public static void main(String[] args) {
		/*
		 * Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
		 */

	}

}
