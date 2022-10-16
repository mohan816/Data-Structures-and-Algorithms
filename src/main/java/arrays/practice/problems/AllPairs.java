package arrays.practice.problems;

public class AllPairs {
	
	public static void allPairs(int[] arr, int x) {
		System.out.println("Pairs are :");
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == x) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 4, 5, 7, 9, 1, 0, -1};
		allPairs(a, 4);

	}

}
