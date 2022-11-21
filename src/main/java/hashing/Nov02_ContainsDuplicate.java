package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Nov02_ContainsDuplicate {
	
		 /*//https://leetcode.com/problems/contains-duplicate-ii/
	    1) Create an empty map
	    2) then check whether the map contains array value if it contains then get that value and minus with i if it is less then return true
	    3) If the value is greater than, update the i value to the ke
	    */
	    public static boolean containsNearbyDuplicate(int[] nums, int k) {
	    	 HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	         //int j = 0;
	          for(int i = 0; i < nums.length; i++){
	              if(map.containsKey(nums[i])){
	                if((Math.abs(map.get(nums[i]) - i)) <= k)
	                    return true;
	              }
	                map.put(nums[i], i);
	              }
	          return false;    
	          }   
       

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,264,10,11,264,12,13,14};
		boolean res = containsNearbyDuplicate(nums,5);
		System.out.println(res);

	}

}
