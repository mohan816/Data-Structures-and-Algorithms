package kadane.algorithm;

public class MinimumContiguousSubArraySum {
	
	/*
	 * 1) Assign arr[0] as min and arr[0] as final result
	 * 2) start the loop from index 1 to upto arr.length-1
	 * 3) Use Math.min function to get min value from current arr index value and current arr index value + previous index value
	 * 4) Use Math.min function to to store final result when comparing both min and final result values.
	 */
	
	private static int minimumSubArraySum(int[] arr) {
		int min = arr[0];
		int finalResult = arr[0];
		for(int i = 1; i < arr.length; i++) {
			min = Math.min(min + arr[i], arr[i]);
			finalResult = Math.min(min, finalResult);
		}
		return finalResult;
	}

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int result = minimumSubArraySum(arr);
		System.out.println(result);

	}

}

