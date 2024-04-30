package fractions;

public class FractionUse {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(12, 3);
		f1.print();
		Fraction f2 = new Fraction(14, 7);
		f2.print();
		//f1.multiply(f2);
		//f2.add(f1);
		f1.divide(f2);
	}

}
