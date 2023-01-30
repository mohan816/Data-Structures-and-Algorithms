package recursion;

public class SumOfDigits {
	
	static int output = 0;
	
	public static int sumOfDigits(int n) {
		if(n == 0)
			 return 0;
		output += n % 10;
		int out = sumOfDigits(n/10);
		return output;
	}
	
	static int count = 0;
	public static int countChars(String s) {  // bbbb
		if(s.length() == 2) {
			return 0;
		}
		//System.out.println();
		if(s.charAt(0) == s.charAt(2)) {
			count++;
		}
		countChars(s.substring(1));
		return count;
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
		System.out.println(countChars("bbbb"));
		System.out.println(countCharsSliding("babababab"));

	}

}
