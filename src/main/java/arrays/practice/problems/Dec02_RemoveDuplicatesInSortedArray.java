package arrays.practice.problems;

import java.util.Arrays;

public class Dec02_RemoveDuplicatesInSortedArray {
	/*
	 * 1) Create a variable temp and assign value as 1 to it.
	 * 2) Create a for loop and start with index 1
	 * 3) if(arr[temp - 1] != arr[i])
	 * 4) arr[temp] = arr[i];
	 * temp++;
	 * */
	 
	
	public static void removeDuplicates(int[] arr) {
		int temp = 1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[temp -1] != arr[i]) {
				arr[temp] = arr[i];
				temp++;	
			}
		}
		System.out.println(Arrays.toString(arr));	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 20,20,30,30,30,50,50}; 
		removeDuplicates(arr);
		//i = 1 -> 20, arr[temp] = arr[i]; temp++; 
		//o/p - > 10, 20, 30,

	}

}
