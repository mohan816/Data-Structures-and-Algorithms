package slidingwindow;

import java.util.HashSet;

public class VowelsInSubStringK {
	/*
	 * 1) first while iterate upto k - 1, if vowels is there count it
	 * 2) second while loop pointer should be less than string length
	 * 3) pointer - k, if it is the vowel reduce count, then check pointer contains vowels if it is vowel then increase count...continue same process upto length() -1
	 */
	
	public static int vowelsMaxInSubstring(String s, int k) {
		HashSet<Character> c = new HashSet<>();
		c.add('A');
		c.add('I');
		c.add('E');
		c.add('O');
		c.add('U');
		c.add('a');
		c.add('i');
		c.add('e');
		c.add('o');
		c.add('u');
		
		int pointer = 0, count = 0, max = Integer.MIN_VALUE;
		while(pointer < k) {
			if(c.contains(s.charAt(pointer))) {
				count++;
				pointer++;
			}
			pointer++;
		}
		max = count;
		while(pointer < s.length()) {
			if(c.contains(s.charAt(pointer-k))) {
				count--;
			}
			if(c.contains(s.charAt(pointer))){
				count++;
			}
			pointer++;
			max = Math.max(max, count);
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "workaattech";
		int k = 3;
		int result = vowelsMaxInSubstring(s,3);
		System.out.println("Maximun number of count is " +result);
		
		

	}

}
