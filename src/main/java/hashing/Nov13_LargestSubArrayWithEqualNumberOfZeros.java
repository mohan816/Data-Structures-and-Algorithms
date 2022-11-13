package hashing;

import java.util.HashMap;

public class Nov13_LargestSubArrayWithEqualNumberOfZeros {
	
	/*https://leetcode.com/problems/contiguous-array/
    1) Change all the zeros to -1 
    2) Add all the values to prefix_sum variable
    3) prefix_sum == 0 - > means equal number of zeros and 1 so add it to res
    4) if map is not having the prefix sum and the prefix sum is not zero then add the ith index to the value of map
    5) if map contains prefix_sum in keys, then get the get the value of it and minus it with i and compare with res, which is having the maximum length keep it as res.
    */
    public int findMaxLength(int[] arr) {

        int prefix_Sum = 0, res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0)
				arr[i] = -1;
			prefix_Sum += arr[i];
			if(prefix_Sum == 0)
				res = i + 1;
			if(!map.containsKey(prefix_Sum) && prefix_Sum != 0)
				map.put(prefix_Sum, i);
			else if(map.containsKey(prefix_Sum))
				res = Math.max(res, i - map.get(prefix_Sum));
			}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
