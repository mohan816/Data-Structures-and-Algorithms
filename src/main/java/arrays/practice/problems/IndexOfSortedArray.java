package arrays.practice.problems;

public class IndexOfSortedArray {
	/*
	 * 1)Iterate the array and if the target is found return the index, else return -1;
	 * 2)Create a for loop and iterate
	 * Test data :
	 * Positive {1,2,4,9,8} target 9
	 * negative {1,2,3,4,5} target 9
	 * edge {9,9,9,9} target 9
	 */
	
	public static int getIndex(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
	/*
	 * 1) create three pointers, start = 0, end = arr.length-1, mid = start+end/2;
	 * 2) find the mid position and assign it to mid variable
	 * 3) if index value of mid is equal to target return mid
	 * 4) if greater end = mid -1
	 * 5) if lesser start = mid + 1
	 * 6) if start and end crossed return -1;
	 */
	public static int getIndexBinarySearch(int[] arr, int target) {
		
		int start = 0, end = arr.length-1, mid = (start+end)/2;
		while(start <= end) {
			//System.out.println("a");
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] > target) {
				end = mid - 1;
				mid = (start + end)/2;
			}
				
			else {
				start = mid + 1;
				mid = (start + end)/2;
			}
	}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5, 9};
		int target = 9;
		
		System.out.println(getIndexBinarySearch(arr,target));
		

	}

}
