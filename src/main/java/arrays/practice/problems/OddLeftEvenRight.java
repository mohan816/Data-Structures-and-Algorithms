package arrays.practice.problems;

import java.util.Arrays;

public class OddLeftEvenRight {

	public static void keepPostions(int[] arr) {
		int evenCount = 0, oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				evenCount = evenCount + 1;
			else
				oddCount = oddCount + 1;
			}
		int[] output = new int[arr.length];
		    evenCount = oddCount; oddCount = 0;
		    for(int i = 0; i < arr.length; i++) {
		    	if(arr[i] % 2 == 0) 
		    		output[evenCount++] = arr[i];
		    	else
		    		output[oddCount++] = arr[i];
		    		
		    }
		    System.out.println(Arrays.toString(output));
		
		}
	
	   public static void optimizedSolution(int[] arr) {
		   int oddPostion = 0, evenPosition = arr.length-1;
		   int i = 0, j = arr.length-1;
		   int[] output = new int[arr.length];
		   while(i < arr.length && j > -1) {
			   if(arr[i] % 2 != 0)
				   output[oddPostion++] = arr[i];
			   if(arr[j] % 2 == 0)
				   output[evenPosition--] = arr[j];
			   i++; j--;
		   }
		   System.out.println(Arrays.toString(output));
	   }

		public static void main(String[] args) {
			int[] arr = {20, 30, 40, 1};
			//keepPostions(arr);
			optimizedSolution(new int[] {1,2,3,4,5,6,7,8,9});

		}

	}
