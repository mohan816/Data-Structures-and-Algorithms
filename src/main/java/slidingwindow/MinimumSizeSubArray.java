package slidingwindow;

public class MinimumSizeSubArray {
	
	 public static int minSubArrayLen(int target, int[] nums) {
	        //ArrayList<Integer> al = new ArrayList<Integer>();
	      //  Arrays.sort(nums);		        //ArrayList<Integer> al = new ArrayList<Integer>();
		      //  Arrays.sort(nums);
		 //https://leetcode.com/problems/minimum-size-subarray-sum/submissions/828718784/
		     int min = Integer.MAX_VALUE;
		     int i = 0, j = 0, sum = 0;
		     //Start the first loop from index 0 to length-1
		            for(i = 0; i < nums.length; i++){
		                sum += nums[i];
		                //if sum is greater or equal then enter into this loop
		                while(sum >= target){
		                	//finding the minimum length
		                   min = Math.min(min, i - j + 1);
		                   //reducing the values from 0th index and increasing it by 1
		                   sum -= nums[j++];
		                }
		            }
		           if(min == Integer.MAX_VALUE)
		                 return 0;
		                return min;
		    }
	 
        public static void main(String[] args) {
		int[] a = {2,3,1,2,4,3};
		int result = minSubArrayLen(7,a);
		System.out.println(result);
		}

}
