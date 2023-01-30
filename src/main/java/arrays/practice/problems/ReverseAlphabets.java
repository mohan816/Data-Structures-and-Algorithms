package arrays.practice.problems;

public class ReverseAlphabets {
	
	public static String Alphabets(String s) {
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		 int[] count = new int[26];
		 for(int i = 0; i < ch.length; i++)
			 count[ch[i] - 97]++;
		    int total = 0;
		 for(int i = 25; i >= 0; i--) {
			 if(total < 4 && count[i] >= 1) {
				 sb.append((char)(i + 97));
				 sb.append(" ");
				 total++;
			 }
		 }
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "zaklmop";
        System.out.println(Alphabets(s));
	}

}
