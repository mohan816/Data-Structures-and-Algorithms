package recursion;

public class CountDigits {
	
	public static int count(int n) {
		if(n < 10) {
			return 1;
		}
		int smallerOutput = count(n/10);
		int output = smallerOutput + 1;
		return output;
   
	}
	
	public static int count1(int n) {
		if(n == 0)
			return 0;
		int smallerOutput = count1(n/10);
		int output = 1 + smallerOutput;
		return output;
	}

	public static void main(String[] args) {
		System.out.println(count1(4005));
	}

}
