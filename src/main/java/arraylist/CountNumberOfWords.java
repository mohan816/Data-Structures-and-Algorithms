package arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountNumberOfWords {
	
	static class Pair{
		int min;
		int max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,3,4,5};
       int n = 5;
       Pair p = getMinMax(arr,n);
       System.out.println(p.min+" "+p.max);
       
	}
	static Pair getMinMax(int[] arr, int n) {
		
		int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		CountNumberOfWords.Pair p = new CountNumberOfWords.Pair();
		p.min = min;
		p.max = max;
		return p;
	}

}
