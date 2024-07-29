package slidingwindow;

public class MaximumOfKConsecutiveElements {
	

	/*
	 * 1) First find the sum of first k elements and put in the maxSum Variable
	 * 2) Then iterate the loop start with k index, add the index value with sum and minus i - k
	 * 3) Then Use Math.max function to find the maximum sum and return the max sum after the end of the loop.
	 */
	
	public static int maxSum(int[] a, int k) {
		if(k > a.length)
			return -1;
		int sum = 0, maxSum = 0;
		for(int i = 0; i < k; i++) {
			sum += a[i];
		}
		maxSum = sum;
		for(int i = k; i < a.length; i++) {
			 sum = sum - a[i - k] + a[i];
			 maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Maximum sum is "+ maxSum(new int[] {1,8,30,-5,20,7}, 3));
	}

}
