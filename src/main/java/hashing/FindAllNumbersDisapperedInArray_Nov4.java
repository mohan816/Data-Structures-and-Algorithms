package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisapperedInArray_Nov4 {
	
	//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	/*
	 * 1) Add all the numbers from the array to the HashSet
	 * 2) Create an array list to return, but it size should be nums.length-hs.size()
	 * 3) If both the length are equal which means there is no disappeared elements
	 * 4) iterate another loop from 1 to length of array and check the value which is not there in the set then add that value to the list.
	 * 5) Finally, return the list
	 */
	public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        ArrayList<Integer> al = new ArrayList<Integer>(nums.length - hs.size());
        if(nums.length == hs.size()){
            return al;
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Input: nums = [4,3,2,7,8,2,3,1]
				Output: [5,6]*/

	}

}
