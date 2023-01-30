public interface Maths1 {
	
	double calculate(int a);
	default double sqrt(int a) {
		return Math.sqrt(a);
	}

}

