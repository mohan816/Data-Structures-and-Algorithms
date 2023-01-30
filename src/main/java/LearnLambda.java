import java.util.TreeSet;
import java.util.stream.Stream;

public class LearnLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1,2,3).forEach(Main::printNumber);
}
	public static void printNumber(int n) {
		System.out.println(n);
	}
	}


