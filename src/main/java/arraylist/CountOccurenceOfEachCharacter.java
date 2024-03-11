package arraylist;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfEachCharacter {
	
	public static void countCharacter(String s) {
		HashMap<Character, Integer> hs = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(hs.containsKey(s.charAt(i))) {
				hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
			}
			else {
				hs.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> h: hs.entrySet()) {
			System.out.println("CHaracter is "+h.getKey()+" and the count is "+h.getValue());
		}
	}

	public static void main(String[] args) {
		
       countCharacter("Mohanrajan");
	}

}
