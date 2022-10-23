package arrays.practice.problems;

public class CountEqualAndDivisiblePairsInAnArray {
	
	//https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/
	/*
	 * 1) Create a local count variable o count the pairs
	 * 2) Create nested for loop to check the condition, If it matches increase count by 1
	 */
//Time Complexity - > O(n^2) space - > O(1)
	public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && i * j % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
