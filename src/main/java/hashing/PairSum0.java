package hashing;

import java.util.HashMap;

public class PairSum0 {
	/*
	 * 1) Create a HashMap of type integer,integer
	 * 2) Iterate the array and check the pair of current value is there in the map, if it is there get its value and add it to count
	 * 3) Then, add the current index array and the frequency to the map.
	 * 4) Finally return the count
	 */
	
	public static int pairSum(int[] input) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count = 0;
		for(int i = 0; i < input.length; i++){
		if(map.containsKey(-(input[i])))
		       count += map.get(-(input[i]));
		map.put(input[i], map.getOrDefault(input[i], 0) +1);
		}
return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2, -12, 2, 11, 12, -2, 1, -2, 2, -11, 12, 2, 6};
		int result = pairSum(a);
		System.out.println(result);

	}

}
