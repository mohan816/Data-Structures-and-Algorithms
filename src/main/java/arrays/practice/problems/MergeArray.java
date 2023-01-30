package arrays.practice.problems;

import java.util.Arrays;

public class MergeArray {
	
/*	PseudoCode :

		1) Compare each elements in the array whichever smaller put in the first index and increase the index
		2) Once I crossed is length and j is not crossed then add remaining j array to the result array, same for i array

		positive : {1, 2, 3, 0, 0, 0}, {2, 5,6}
		edge : array with size 1 and size 0
		negative : Arrays are having same value */
	
	public static void mergeArray(int[] arr1, int m, int[] arr2, int n){
		int i = m - 1, j = n - 1, k = arr1.length-1;
		while(i >= 0 && j >= 0) {
			if(arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				i--;
				k--;
			}
			else {
				arr1[k] = arr2[j];
				j--;
				k--;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,5,6};
		mergeArray(arr1, 3, arr2, 3);
		System.out.println(Arrays.toString(arr1));

	}

}
