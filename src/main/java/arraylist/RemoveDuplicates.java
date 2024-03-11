package arraylist;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] arr) {
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		for(int a: hs) {
			System.out.print(a+" ");
		}
		
	}

	public static void main(String[] args) {
		removeDuplicates(new int[] {10, 20, 30, 40, 10, 20,30});

	}

}
