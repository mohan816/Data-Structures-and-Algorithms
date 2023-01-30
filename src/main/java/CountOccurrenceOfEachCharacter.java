import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountOccurrenceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "automation";
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			//m.put(s.charAt(i),m.getOrDefault(s.charAt(i), 0)+1);
			if(m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			}
			else {
				m.put(s.charAt(i), 1);
			}
		}
		System.out.println(m);

	}

}
