package Strings.practice.problems;

public class CheckIsPallindrome {
	
	public static int checkPallindrome(String s) {
		int i = 0, j = s.length()-1, count = 0;
		while(i <= j) {
			if(s.charAt(i) == s.charAt(j) && i < j) {
				count = count + 2;
				i++;
				j--;
			}
			else if(s.charAt(i) == s.charAt(j) && i == j) {
				count++;
				i++;
				j--;
			}
			else {
				return - 1;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MOHAN";
		int result = checkPallindrome(s);
		if(result == s.length()) {
			System.out.println("It is a pallindrome");
		}
		else {
            System.out.println("Not a pallindrome");
	}

}
}
