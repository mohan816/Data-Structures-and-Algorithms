package searching.binarysearch;

public class Count1sInSortedArray {
	
	public static int countNumberOfOnes(int[] arr) {
		int start = 0, end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if(mid == 0) {
				if(arr[mid] == 1)
					return arr.length;
				else
					return 0;
			}
			else if(arr[mid] < arr.length - 1) {
			if(arr[mid] == 0 && arr[mid + 1] == 1)
				return (arr.length - 1) - mid;
			else if(arr[mid] == 1 && arr[mid - 1] == 0)
				return arr.length - 1 - mid + 1;
			else if(arr[mid] == 1 && arr[mid - 1] == 1)
				end = mid - 1;
			else if(arr[mid] == 0 && arr[mid + 1] == 0)
				start = mid + 1; 
			}
			else
				if(mid == arr.length - 1 && arr[mid] == 1)
					return 1;
				else
					return 0;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countNumberOfOnes(new int[] {1,1,1,1}));

	}

}
