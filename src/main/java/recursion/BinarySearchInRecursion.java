package recursion;

public class BinarySearchInRecursion{
    
	public static boolean isBinarySearch(int[] a, int start, int end, int val) {
		      if(start > end)
		    	  return false;
		      int mid = (start + end)/2;
		      if(a[mid] == val)
		    	  return true;
		      else if(a[mid] > val)
		    	  return isBinarySearch(a, start, mid - 1, val);
		      else
		    	  return isBinarySearch(a, mid + 1, end, val);
		    	 
	}
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7,8};
		System.out.println(isBinarySearch(arr, 0, arr.length-1, 10));
	}
}
