package arrays.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	
	//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

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
	public static int[] sum(int[] arr, int target) {
		if(arr.length < 2)
			return new int[0];
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(target - arr[i])) {
				result[0] = map.get(target - arr[i]);
			    result[1] = i;
			    break;
			}
			else
				map.put(arr[i], i);
			  
		}
		return result;
	}
		

	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int target = 18;

		int[] resultArray = sum(arr, target);
		for(int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i]+" ");
		}

	}

}
