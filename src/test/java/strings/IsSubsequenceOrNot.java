package strings;

public class IsSubsequenceOrNot {
	
	public static boolean isSubsequenceOrNot(String s1, String s2) {
		int i = s1.length() - 1;
		for(int j = s2.length() - 1; j >= 0; j--) {
			while(i >= 0) {
				if(s1.charAt(i) == s2.charAt(j)){
					i--;
					break;
				}
				i--;
				if(i == -1)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequenceOrNot("ABCD", "AD"));

	}

}
