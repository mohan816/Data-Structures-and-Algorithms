package hashing;

public class FrequencyCalculating {
	
	
	public static boolean isAnagram(String s, String s1) {
		if(s.length() != s1.length()) {
			return false;
		}
		
		int[] count = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[s1.charAt(i) - 'a']--;
		}
		for(int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i) - 'a'] > 0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s = "anagram";
  String t = "anagram";
 boolean b = isAnagram(s,t);
 System.out.println(b);
		  
	}

}
