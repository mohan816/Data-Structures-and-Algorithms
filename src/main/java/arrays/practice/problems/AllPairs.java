package arrays.practice.problems;

import java.util.ArrayList;
import java.util.List;

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
	
	public static void pairsAll(int[] arr, int x) {
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
	
	//Time & Space complexity O(n)
	public static ArrayList<List<Integer>> allPairs(int[] a, int target){
		   ArrayList<List<Integer>> listOfPairs = new ArrayList<List<Integer>>();
		   ArrayList<Integer> al = new ArrayList<>();
		   for(int i = 0; i < a.length; i++) {
			   if(al.contains(target - a[i])) {
				   ArrayList<Integer> pair = new ArrayList<>();
				   pair.add(target-a[i]);
				   pair.add(a[i]);
				   listOfPairs.add(pair);
			   }
			   al.add(a[i]);  
		   }
		   return listOfPairs;
	}

	public static void main(String[] args) {
		int[] a = {9, 5, 14, 3, 1, 15, 6};
		ArrayList<List<Integer>> listOfPairs = allPairs(a, 20);
		for(int i = 0; i < listOfPairs.size(); i++) {
                 System.out.println(listOfPairs.get(i));
	}
	}

}
