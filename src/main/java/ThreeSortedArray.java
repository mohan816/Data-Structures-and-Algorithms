import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ThreeSortedArray {
	
	public static int[] sortedArray(int[] arr1, int[] arr2, int[] arr3) {
		int size = Math.max(arr3.length,Math.max(arr1.length, arr2.length));
		//System.out.println(size);
		ArrayList<Integer> al = new ArrayList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < size; i++) {
			if(arr1.length > i) {
				map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
			}
			if(arr2.length > i) {
				map.put(arr2[i], map.getOrDefault(arr2[i],0)+1);
			}
			if(arr3.length > i) {
				map.put(arr3[i], map.getOrDefault(arr3[i],0)+1);
			}
		}
		//System.out.println(map);
		for(Map.Entry<Integer, Integer> hs : map.entrySet()) {
			if(hs.getValue() == 3) {
				al.add(hs.getKey());
			}
		}
		int[] a = new int[al.size()];
		for(int i = 0; i < al.size(); i++) {
			a[i] = al.get(i);
		}
		return a;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = sortedArray(new int[] {1,2,3,4,5}, new int[] {1,2,5,7,9}, new int[] {1,3,4,5,7,8});
		System.out.println(Arrays.toString(a));
		/*
		 * for(int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		
		/*Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 
		return a sorted array of only the integers that appeared in all three arrays.
		Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
		Output: [1,5]*/

	}

}
