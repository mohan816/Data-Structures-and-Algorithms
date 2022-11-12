package hashing;

import java.util.HashSet;

public class Nov03_NumberOfArithmeticTriplets {
	
	//https://leetcode.com/problems/number-of-arithmetic-triplets/
	/*
	 * 1) First add all the values to the the hashset
	 * 2) Iterate from each value of nums and check nums[j] + diff && nums[j] + 2 * diff is there in hash set, if it is there increase the count.
	 */
	
	public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        for(int j = 0; j < nums.length; j++){
            if(hs.contains(nums[j] + diff) && hs.contains(nums[j] + 2 * diff)){
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Input: nums = [0,1,4,6,7,10], diff = 3
				Output: 2
				Explanation:
				(1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
				(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3.*/

	}

}
