package arrays.practice.problems;

/*// Positive - > int[] a = {1, 3, 4, 5, 7, 9, 1, 0, -1};
 * Negative - > No pairs
 * edge - > suppose if an array is empty
 * 
 * PseudoCode : 
 * Create an inner for loop..
 * Compare outer and inner for loop vlaues if matches with x then return it
 */
//Time Compexity O(n^2), space O(1)
public class AllPairs {
	
	public static void allPairs(int[] arr, int x) {
		if(arr.length == 0) {
			System.out.println("Array is empty");
	        return;
		}
		System.out.println("Pairs are :");
		//Time Complexity O(n^2)
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == x) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 7, 9, 1, 0, -1};
		allPairs(a, 4);

	}

}
