package searching.binarysearch;

public class IndexOfLastOccurenceInSorted {

	
	public static int indexOfLastOccurence(int[] arr, int x) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] < x)
				start = mid + 1;
			else if(arr[mid] > x)
				end = mid - 1;
			else
				if(mid == arr.length - 1 || arr[mid] != arr[mid + 1])
						return mid;
				else
					start = mid + 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 20, 20, 30, 30};
		int x = 30;
	   System.out.println("last index ocurrence of "+x+" is "+indexOfLastOccurence(arr, x));

	}

}
