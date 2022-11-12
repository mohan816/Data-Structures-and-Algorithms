package kadane.algorithm;



public class LargestSubArraySum {
	/*
	 * 1) Assign arr[0] as max and arr[0] as final result
	 * 2) start the loop from index 1 to upto arr.length-1
	 * 3) Use Math.max function to get max value from current arr index value and current arr index value + previous index value
	 * 4) Use Math.max function to to store final result when comparing both max and result values.
	 */
	
	private static int largestSubArraySum(int[] arr) {
		int max = arr[0];
		int finalResult = arr[0];
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(max + arr[i], arr[i]);
			finalResult = Math.max(max, finalResult);
		}
		return finalResult;
	}

	public static void main(String[] args) {
		int[] arr = {-10, -100, -1, -2000, -3};
		int result = largestSubArraySum(arr);
		System.out.println(result);

	}

}
