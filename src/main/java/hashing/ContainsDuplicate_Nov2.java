package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ContainsDuplicate_Nov2 {
	
		 /*
	    1) Create an empty map, And create an ArrayList and add all the array values
	    2) then check whether the map contains array value if it contains then take value and substract with i.
	    3) If the value is greater than, update the i value to the key
	    4) If it is equal or less then return true
	    */
	    public static boolean containsNearbyDuplicate(int[] nums, int k) {
	         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	         ArrayList<Integer> al = new ArrayList<Integer>();
	         for(int i = 0; i < nums.length; i++){
	             al.add(nums[i]);
	         }
	       //int j = 0;
	        for(int i = 0; i < al.size(); i++){
	            if(map.containsKey(al.get(i))){
	              if((Math.abs(map.get(al.get(i)) - i)) <= k){
	                  return true;
	              }
	              map.put(al.get(i), i);
	            }  
	              else{
	            	  map.put(al.get(i), i);
	                }
	            }
	        return false;    
	        }
       

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,264,10,11,264,12,13,14};
		boolean res = containsNearbyDuplicate(nums,5);
		System.out.println(res);

	}

}
