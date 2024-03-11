package arrays.practice.problems;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static void firstNonRepeating(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			map.put(Character.toLowerCase(s.charAt(i)), map.getOrDefault(Character.toLowerCase(s.charAt(i)), 0)+1);
		}
		for(int i = 0; i < s.length(); i++) {
			if(map.get(Character.toLowerCase(s.charAt(i))) == 1) {
				System.out.println(s.charAt(i));
			     break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       firstNonRepeating("Testing");
	}

}
