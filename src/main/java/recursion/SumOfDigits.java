package recursion;

public class SumOfDigits {
	
	
	public static int sumOfDigits(int n) {
		if(n < 10)
			return n;
		int output = n % 10 + sumOfDigits(n / 10);
		return output;
	}
	
	public static int countChars(String s) {  // bbbb
		if(s.length() == 1)
			 return 1;
	    return 1 + countChars(s.substring(1));
		
	}
	//countChars slidingWindow
	public static int countCharsSliding(String s) {
		int count = 0;
		for(int i = 0; i < s.length() - 2; i++) {
			if(s.charAt(i) == s.charAt(i + 2))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(123456789));
		System.out.println(countChars("bbbbcdefgh"));
		System.out.println(countCharsSliding("babababab"));

	}

}
