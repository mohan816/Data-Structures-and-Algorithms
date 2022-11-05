package hashing;

import java.util.HashMap;
import java.util.Map;

public class RingsAndRods {
	
	public static int countPoints(String rings) {
	    int count = 0;
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i < rings.length(); i = i + 2){
	    	map.put(rings.charAt(i + 1) - '0', map.getOrDefault(rings.charAt(i + 1) - '0', 0)+rings.charAt(i));
	    }
	    for(int i = 0; i < 10; i++){
	        if(map.containsKey(i)) {
	        	if(map.get(i) == 219)
	            count++;
	        }
	    }
	     return count;  
	    }

	public static void main(String[] args) {
		String s = "B0B6G0R6R0R6G9";
		int count = countPoints(s);
		System.out.println(count);
		

	}

}
