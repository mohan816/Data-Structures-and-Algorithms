package hashing;

public class Nov13_MaximumAscendingSubArraySum {
	
	/*
    1) Assign zeroth index value to sum variable at first and also assign zeroth index value to max variable
    2) iterate the loop from index 1 and compare whether previous index is lesser than the current index. if it is lesser add it to the sum and compare with max, whichever is maximum assign it to max variable
    3) if arr[i] is lesser than arr[i - 1], then assign arr[i] value to sum.
    */
    public int maxAscendingSum(int[] arr) {
        int sum = arr[0], max = arr[0];
        for(int i = 1; i < arr.length; i++){
              if(arr[i] > arr[i - 1]){
              sum += arr[i];
               max = Math.max(max,sum);
              }
              else
               sum = arr[i];
        }
       return max; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:

Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:

Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
		 */

	}

}
