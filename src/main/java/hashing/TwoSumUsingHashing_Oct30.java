package hashing;

import java.util.HashMap;
import java.util.Map.Entry;

//https://leetcode.com/problems/two-sum/

public class TwoSumUsingHashing_Oct30 {
	
	 public static int[] twoSum(int[] nums, int target) {
	        int[] a = new int[2];
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(target-nums[i])){
	                a[0] = map.get(target-nums[i]);
	                a[1] = i;
	            }
	            else{
	                map.put(nums[i], i);
	            }
	        }
	       return a; 
	    }

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[] result = twoSum(arr,9);
		//output = 0,1

	}

}
