package searching.binarysearch;

public class CountOccurencesInSortedArray {
	
	//Time Complexity O(logn)
	public static int firstOccurrence(int[] arr, int ele) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] < ele)
				start = mid + 1;
			else if(arr[mid] > ele)
				end = mid - 1;
			else
				if(mid == 0 || arr[mid] != arr[mid - 1])
					  return mid;
				else
					end = mid - 1;
		}
		 return -1;
	}
	
	//Time Complexity O(logn)
	public static int lastOccurrence(int[] arr, int ele) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] < ele)
				start = mid + 1;
			else if(arr[mid] > ele)
				end = mid - 1;
			else
				if(mid == arr.length - 1 || arr[mid] != arr[mid + 1])
					return mid;
				else
					start = mid + 1;
				
		}
		return -1;
	}
	
	//Time complexity O(logn), Because the time complexity of both first & last Occurrence is O(logn)
	/*
	 * 1) First have to find the first occurrence index
	 * 2) Second find the last occurrence index
	 * 3) Subtract lastIndex - firstIndex then add 1 to it, to get the total number of elements
	 */
	public static int countNumberOfOccurrences(int[] arr, int ele) {
		int firstIndex = firstOccurrence(arr, ele);
		if(firstIndex == -1)
			return 0;
		int lastIndex = lastOccurrence(arr, ele);
		return lastIndex - firstIndex + 1;
		
	}
	public static void main(String[] args) {
		int[] arr = {20,20,20,20,20,20};
		int ele = 30;
		// TODO Auto-generated method stub
		System.out.println("Number of occurrences are "+ countNumberOfOccurrences(arr, ele));

	}

}
