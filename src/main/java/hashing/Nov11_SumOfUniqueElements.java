package hashing;

import java.util.HashMap;
import java.util.Map;

public class Nov11_SumOfUniqueElements {
	
	 /*
    1) Add it in map, get the frequency, if the frequency is one add it to count variable and return count
    */
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                count = count + m.getKey();
            }
        }
       return count; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
		 */

	}

}
