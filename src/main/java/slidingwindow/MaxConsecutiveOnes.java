package slidingwindow;

public class MaxConsecutiveOnes {
	
	//https://leetcode.com/problems/max-consecutive-ones-iii/

	public static int bruteForceApproach(int[] nums, int k) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++){
			int kCount = 0, count = 0;
			for(int j = i; j < nums.length; j++){
				if(nums[j] == 1){
					count++;
				}
				else if(kCount < k && nums[j] == 0){
					count++;
					kCount++;
				}
				else{
					break;
				}
			}
			max = Math.max(count, max);
		}
		return max;
	}
	
	 /*
    1) First navigate the loop from 0 to n-1
    2) if the value is zero for right variable increment zero count
    3) Once the zero count is greater than given k, increment the left pointer once it has reached zero, de
    crement zero count until zero count equal to given k
    4) Find the max by using right - left + 1
    */

    public int longestOnes(int[] nums, int k) {
        int left = 0, zeroCount = 0, max = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
        }
        max = Math.max(max, right - left + 1);
    }
    return max;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
