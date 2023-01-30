package arrays.practice.problems;

public class GivenSum {

	public static int[] sum(int[] arr, int sum){
		int left = 0,count = 0;
		int[] a = new int[0];
		for(int i = 0; i < arr.length; i++){
			count = count + arr[i];
			while(count > sum){
				count = count - arr[left];
				left++;
			}
			if(count == sum){
				a = new int[i + 1 - left];
				int k = 0;
				while(left <= i){
					a[k] = arr[left];
					k++;
					left++;
				}
				break;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] arr = {11, 9, 8, 7,13, 5, 17};
		int[] a = sum(arr, 25);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
