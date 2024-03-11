import java.util.HashSet;
import java.util.Set;

public class GCD {
	public static void isGcdOrNot(int[] arr) {
		int gcd = arr[0];
		for (int i = 1; i < arr.length; i++) {
			gcd = gcd(gcd, arr[i]);
		}
		if (gcd >= 1) {
			System.out.println("YES");
			return;
		}
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int pairGcd = gcd(arr[i], arr[j]);
				if (pairGcd > 1) {
					set1.add(arr[i]);
					set1.add(arr[j]);
				} else {
					set2.add(arr[i]);
					set2.add(arr[j]);
				}
				if (set1.size() == arr.length / 2 && set2.size() == arr.length / 2) {
					System.out.println("YES");
					return;
				}

			}
		}
		System.out.println("NO");
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void pixels(int n) {
		int diff = Integer.MAX_VALUE, firstIndex = 0, lastIndex = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				int j = n / i;
				if(j < i) {
					System.out.println(firstIndex+" "+lastIndex);
					return;
				}
				if(j - i < diff) {
					diff = j - i;
					firstIndex = i;
					lastIndex = j;
				}
			}
		}
		System.out.println(firstIndex+" "+lastIndex);
	}


	public static void main(String[] args) {
		//isGcdOrNot(new int[] {8,10,24,20,45,30});
        pixels(999999);
	}

}
