package arrays.practice.problems;

public class SmallAndLargeInUnsortedArray {
	
	public static void smallAndLargestNumbers(int[] arr) {
		int count = 0;
		int smallest = arr[0], largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			count++;
			if(arr[i] > largest) {
				largest = arr[i];
			}
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest Number is "+smallest);
		System.out.println("Largest Number is "+largest);
		
	}
	
	public static String reverseString(String a) {
		String b ="";
		for(int i = a.length() - 1; i >= 0; i--) {
			
			b = b + a.charAt(i);
			
		}
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
    int[] a = {0, -1, -5, -10, -100};
    //smallAndLargestNumbers(a);
    String s = "Mohan";
    reverseString(s);

	}

}
