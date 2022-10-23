package arrays.practice.problems;

public class ThreeConsecutiveElements {

	/*
	 * //Positive - > {1,5,2,3,7,1}, edge - > all the values are same in array,
	 * negative - > if array length is 0, return no values Pseudo code 1) Declare
	 * highest value variable with min int value 2) Declare three variable for
	 * pointers 3) assign index value like 0, 1, 2 4) Apply condition like third
	 * variable less than arr.length in while loop 5) compare three index array
	 * value with highest variable, if those are greater assign it highest variable,
	 * else increment i, j ,k (three pointers) by 1 6) Finally return the result
	 */

	// Time Complexity O(n), space complexity - O(1)
	public static int threeConsecutiveElements(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int i = 0, j = 1, k = 2;
		while (k < arr.length) {
			if (arr[i] + arr[j] + arr[k] > highest) {
				highest = arr[i] + arr[j] + arr[k];
				i++;
				j++;
				k++;
			} else {
				i++;
				j++;
				k++;
			}
		}
		return highest;
	}
	
	//consecutive elements add pananum
	public static int kConsecutiveElements(int[] arr, int k) {
		int highest = Integer.MIN_VALUE;
		int pointer = 0, sum = 0;
		while(pointer < k - 1) {
			sum = sum + arr[pointer];
			pointer++;
		}
		while(pointer < arr.length) {
			sum = sum + arr[pointer++];
			highest = Math.max(highest, sum);
			sum -= arr[pointer - k];
			
		}
		return highest;
	}
	
	 public double findMaxAverageSDET(int[] nums, int k) {
	        int Max=Integer.MIN_VALUE,pointer=0;
	        float sum=0,maximumAverage=0;
	        while(pointer<k-1){
	            sum=sum+nums[pointer++];
	        }
	        while(pointer<nums.length){
	            sum=sum+nums[pointer];
	            sum=(sum/k);
	            maximumAverage=Math.max(maximumAverage,sum);
	            sum=nums[pointer-k+1];
	            pointer++;
	        }
	        return Double.valueOf(maximumAverage);
	    }
	
	 public static double findMaxAverage(int[] nums, int k) {
	        double highest = Integer.MIN_VALUE;
			int i = 0, j = 0, l = 0;
	        double sum = 0;
			while(j < nums.length) {
				while(l < k && j < nums.length) {
					sum = sum + nums[j];
					j++;
					l++;
				}
				 sum = sum / k;
				if(sum > highest) {
					//System.out.println(sum);
					highest = sum;
				}
				sum = 0;
				l = 0;
				if(j > nums.length - 1) {
					return highest;
				}
				i++;
				j = i;
			}
	        return highest;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,1,3,3};
		int k = 4;
		double result = kConsecutiveElements(arr, k);
		System.out.println("Highest three consecutive value is " + result);

	}

}
