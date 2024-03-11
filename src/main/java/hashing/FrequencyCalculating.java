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
			if(count[s.charAt(i) - 'a'] != 0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*#Day2 of #100daysofcodechallenge 



		It's one of the famous interview question which we can expect in the interview for QA or SDET role in the product based companies



		Anagram: 

		One string contains the characters of another string and only the order of characters can be different.



		Ex: String s1 = "tea";

		      String s2 = "eat";

		    output: Anagram*/



		
		    String s1 = "tea";

		    String s2 = "eay";

		if(s1.length() != s2.length()){

		      System.out.println("It's not an Anagram");

		      return;

		}

		   int[] count = new int[26];

		   for(int i = 0; i < s1.length(); i++){

		     count[s1.charAt(i) - 'a']++;

		     count[s2.charAt(i) - 'a']--;

		    }

		   for(int i = 0; i < s1.length(); i++){

		     if(count[s1.charAt(i) - 'a'] != 0){

		     System.out.println("It is not an angram");

		     return;

		}

		}

		    System.out.println("It is an Anagram");

		}

		}
