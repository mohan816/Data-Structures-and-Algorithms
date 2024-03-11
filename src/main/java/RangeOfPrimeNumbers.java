import java.util.Scanner;

public class RangeOfPrimeNumbers {
	
	
	public static void rangePrime(int n) {
		System.out.println("Prime Numbers are ");
		for(int i = 1; i < n; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		rangePrime(sn.nextInt());

	}

}
