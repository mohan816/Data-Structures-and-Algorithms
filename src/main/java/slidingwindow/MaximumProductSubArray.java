package slidingwindow;

public class MaximumProductSubArray {
	
	/*
    1) first assign index 0 value as min, max and result
    2) start the loop from index 1 to arr.length - 1
    3) Using temp variable store the max value, because we are calculating max value in the next step
    so max value got updated, if we dont use temp variable then we will get incorrect result.
    4) Calculate the max and min value, because we are looking for maximum product sub array
    5) if the max value is greater than result, then update the result with the help of max value
    */
    public static int maxProduct(int[] arr) {

        int min = arr[0], max = arr[0], result = arr[0]; // 4 -5 3 -1
        for(int i = 1; i < arr.length; i++){
            int temp = max;                                                  // -20, -20 , -5   max = -5, min = -20, -15, 3 -10 4 
        max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
        min = Math.min(Math.min(temp * arr[i], min * arr[i]),arr[i]);
        if(max > result){
            result = max;
        }
        }
       return result;
     }
   //  1 2 3 4 5 6 7
    //Brute force approach O(n^2)
    public static int maxProductBruteForceApproach(int[] nums) {
		int res = nums[0];
	      // int product = nums[0];
	       for(int i = 0; i < nums.length; i++){
	         int product = 1;
	           for(int j = i; j < nums.length; j++){
	               product *= nums[j];
	                   res = Math.max(res, product);
	           }
	       }
	       return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,-5,3,-1};       
				                        
		System.out.println(maxProduct(arr));

	}

}
