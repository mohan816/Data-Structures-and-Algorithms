
public class ReturnVowels {
	
	public static String returnVowels(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++) {
			if(isVowel(s.charAt(i)))
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I'
				|| ch == 'E' || ch == 'O' || ch == 'U';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Hello";
        System.out.println(returnVowels(s));
	}

}
