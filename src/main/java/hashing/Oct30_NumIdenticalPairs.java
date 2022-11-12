package hashing;

import java.util.HashMap;

public class Oct30_NumIdenticalPairs {
	//https://leetcode.com/problems/number-of-good-pairs
	
	//Brute force approach
	public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                while(map.get(nums[i]) > 1){
                    count += map.get(nums[i]) - 1;
                    map.put(nums[i], map.get(nums[i]) - 1);
                }
            }
        }
        return count;
        }
	
	//optimized solution
	/*
	 * If the key is not there then add the key to the map with the value of 1
	 * If the key is there add the value to the count variable and increment the value by 1 and put it into the map again
	 * Finally return the count.
	 */
	public static int numIdenticalPairsOp(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
        if(map.containsKey(nums[i])){
           count += map.get(nums[i]);
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        else{
            map.put(nums[i], 1);
        }
        
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input: nums = [1,2,3,1,1,3]
				Output: 4
				Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/
		int[] nums = {1,2,3,1,1,3};
		int res = numIdenticalPairsOp(nums);

	}

}
