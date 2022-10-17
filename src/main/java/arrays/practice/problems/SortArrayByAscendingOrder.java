package arrays.practice.problems;

import java.util.Arrays;

public class SortArrayByAscendingOrder {
	
	/*
	 * Positive = {90, 23, 5, 109, 12, 22, 67, 34};
	 * negative = {};
	 * edge = already sorted array
	 * 
	 */
	
	public static void sortArrayAscending(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i], index = 0;
			for(int j = i + 1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
				//index = j;
			}
			if(arr[i] != min) {
				int temp = arr[i];
				arr[i] = min;
				arr[index] = temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static void addEachNumber(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j <= i + 1; j++) {
				int temp = arr[i] + arr[j];
				System.out.print(temp+" ");
			}
		}
	}
	
	public static void addThreeNumber(int[] arr) {
		for(int i = 0; i < arr.length - 2; i++) {
			int temp = arr[i];
			for(int j = i + 1; j <= i + 2; j++) {
				temp = temp + arr[j];
			}
						
				System.out.print(temp+" ");
			}
	}
	
	/*
	 * positive - > array with different values
	 * negative - > array with empty or single value
	 * edge - > array with same value for n times.
	 */
	
	public static void reverseArray(int[] arr) {
		int start = 0, end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 10, 23, 40};
		//sortArrayAscending(arr);
		reverseArray(arr);

	}

}
