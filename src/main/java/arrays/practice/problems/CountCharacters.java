package arrays.practice.problems;

public class CountCharacters {
	
	public static String countCharacters(String s) {
		if(s.length() == 0) {
			return "";
		}
		int i = 0, j = 0;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		while(j < ch.length) {
			if(ch[i] == ch[j]) {
				count += 1;
				j++;
			}
			else if(ch[i] != ch[j]) {
				sb.append(ch[i]);
				sb.append(count);
				count = 0;
				i = j;
			}
			
		}
		sb.append(ch[i]);
		sb.append(count);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccaad";
		System.out.println(countCharacters(s));
      //  String out = "a3b2c2a2d1";

	}

}
