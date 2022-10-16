package arrays.practice.problems;

import java.util.Arrays;

public class TwoSum {

	public static int[] twoSum(int[] arr, int target) {
		int[] a = new int[2];
		if(arr.length == 0 && arr.length == 1) {
			return new int[0];
		}
		//System.out.println(target);
	     //Arrays.sort(arr);
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					a[0] = i;
					a[1] = j;

				}
				/*
				 * else if(arr[i] + arr[j] > target) { break; }
				 */
				}
				 
			}
		return a;
		}
		

	public static void main(String[] args) {
		int[] arr = {1};
		int target = 8;

		int[] resultArray = twoSum(arr, target);
		for(int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]+" ");
		}

	}

}
