package arrays.practice.problems;

public class DuplicateNumberInArray {

	//Time Complexity O(n^2)
	public static void duplicateInArray(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			if(arr[i] != Integer.MIN_VALUE) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
						if(count <= 1) {
							System.out.print(arr[i]+" ");
						}
						arr[j] = Integer.MIN_VALUE;
						//break;
					}	
				}
			}
			
		}
		//System.out.println("Mohan");
	}
	//Time Complexity is O(n^2)
	public static void multipleDuplicates(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			if(arr[i] != Integer.MIN_VALUE) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
						if(count > 1) {
							System.out.print(arr[i]+" ");
						}
						arr[j] = Integer.MIN_VALUE;
						//break;
					}	
				}
			}
			
		}
	}
	public static void main(String[] args) {
	int[] arr = { 1, 1, 7, 3, 7, 3, 1, 10};
	multipleDuplicates(arr);

	}

}
