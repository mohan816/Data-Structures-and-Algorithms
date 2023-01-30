package arrays.practice.problems;

import java.util.Arrays;

public class SortingBruteForceApproach {
	
	//Selection Sort - Ascending
	//Time Complexity O(n^2)
	/*
	 * 1) At each inner loop iteration we need to find the small value index
	 * 2) After each iteration of inner loop, swap with the help of index
	 * 3) One condition is if the index is equal with i, then dont swap..Because i is holding the index of small value only and already it is in the order.
	 */
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = arr[i], index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Selection Sort -Descending 
	//Time Complexity O(n^2)
	public static void sort1(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int max = arr[i], index = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
					index = j;
				}
			}
			if(index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Bubble sort
	 //Time Complexity - > O(n^2)
	/*
	 * 1) Iterate the first for loop less than length - 1
	 * 2) Start the second for loop from 0 to arr.length - 1 - i, because once we kept the largest value at the last index, then no need to travel till the last
	 * from next iterations
	 * 3) if arr[j] is greater than arr[j + 1], then swap else simply continue
	 * 4) Finally return the result.
	 */
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {    // 10 2 60 1        1 2 10 60
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Bubble Sort - > Descending
	public static void bubbleSort1(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	
	//Time Complexity O(n ^ 2)
	/*
	 * Comapre the adjacent values if arr[j] > arr[j + 1], then swap
	 * Go to inner for loop until the small value reaches their respective position
	 */
	public static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {                           
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				for(int j = i; j >= 1; j--) {
					if(arr[j] < arr[j - 1]) {
						int temp1 = arr[j];
						arr[j] = arr[j - 1];
						arr[j -1] = temp1;
					}
					else {
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Inertion sort - Descending
	public static void insertionSort1(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				for(int j = i; j >= 1; j--) {
					if(arr[j] > arr[j - 1]) {
						int temp1 = arr[j];
						arr[j] = arr[j - 1];
						arr[j -1] = temp1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {125, -1, -1, 1000, -1000, 0, 0};  // 0, 1 125
      // sort(arr);
       //sort1(arr);
		insertionSort(arr);
	}

}
