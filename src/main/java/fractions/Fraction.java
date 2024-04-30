package fractions;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void simplify() {
		int gcd = 1;
		int small = Math.min(numerator, denominator);
		for(int i = 2; i <= small; i++) {
			if(numerator % i == 0 && denominator % i == 0)
				gcd = i;
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public void increment() {
		numerator = numerator + denominator;
	}
	
	public void print() {
		System.out.println(numerator+"/"+denominator);
	}
	
	public void add(Fraction f2) {
		//First fraction is the fraction on which function is called
		//Second fraction is passed as argument
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
		print();
	}
	
	public void subtract(Fraction f2) {
		this.numerator = this.numerator * f2.denominator -this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
		print();
	}
	
	public void multiply(Fraction f2) {
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		//mplify();
		print();
	}
	
	public void divide(Fraction f2) {
		this.numerator = this.numerator * f2.denominator;
		this.denominator = this.denominator * f2.numerator;
		simplify();
		print();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
		int denominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(numerator, denominator);
		return f3;
	}

}
