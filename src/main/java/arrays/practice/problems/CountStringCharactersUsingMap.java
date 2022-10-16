package arrays.practice.problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountStringCharactersUsingMap {

	public static void countCharacters(String s) {

        //counting number of times each character present in the string and assign it to map
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		int min = 1, max = Integer.MIN_VALUE;
		System.out.println("Minimum characters are ");
		for (Entry<Character, Integer> ch : map.entrySet()) {
			if(min == ch.getValue()) {
				System.out.println(ch.getKey()+" "+ch.getValue());
			}
			else if(max < ch.getValue()) {
				max = ch.getValue();
			}
		}
		System.out.println("Maximum character is ");
		for (Entry<Character, Integer> ch : map.entrySet()) {
			if(max == ch.getValue()) {
				System.out.println(ch.getKey()+" "+ch.getValue());
			}
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Grass is greener on the other side";
		countCharacters( s.replaceAll(" ", ""));
	}

}
