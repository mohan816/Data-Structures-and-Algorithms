package arrays.practice.problems;

public class FactorialNumbersWithinGivenNumber {
	
	public static void givenFactorial(int n) {
		System.out.println("Factorial Numbers between the given numbers are :");
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			//int fact = 1;
			   System.out.println(fact);
				fact += fact * i;
			if(fact > n)
				return;
			//System.out.println(fact);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       givenFactorial(100);
	}

}
