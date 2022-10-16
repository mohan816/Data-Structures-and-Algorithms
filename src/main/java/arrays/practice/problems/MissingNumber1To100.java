package arrays.practice.problems;

public class MissingNumber1To100 {
	
	
	
	public static void missingNumbers(int[] arr) {
		//This code will work if the given array is in ascending order
		int i = 1, j = 100, start = 0, end = arr.length - 1;
		while(i <= j) {
			if(arr[start] == i && arr[end] == j) {
				start++;
				end--;
				i++;
				j--;
			}
			else if(arr[start] == i && arr[end] != j) {
				System.out.println(j+" ");
				j--;
				i++;
				start++;
			}
			else if(arr[start] != i && arr[end] !=j) {
				System.out.println(i+" "+j+" ");
				i++;
				j--;
			}
			else {
				System.out.println(i+" ");
				i++;
				j--;
				end--;
			}
		}
	}
	
	public static void missingNumbersA(int[] arr) {
		System.out.println("Missing Numbers are : ");
		for(int i = 1; i <= 100; i++) {
			int count = 0;
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[j] == i) {
					 count++;
				 }
			 }
			 if(count == 0) {
				 System.out.println(i);
			 }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20, 30, 40, 50, 60, 70, 80, 90, 100};
		missingNumbers(arr);
		

	}

}
