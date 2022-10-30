package three.pointers.java;

public class Sort210 {
	
	/*
	 * Test Data - > Positive 1,2,0,1,2
	 * Edge - > array with length 1
	 * Negative - > 2,2,1,1,0
	 * Pseudocode :
	 * intialize three pointers High = index 0, Middle = index 0, Low = arr.length-1
	 * Start high and middle with zeroth index and low pointer in the last index
	 * if middle points the value of high then swap both and increment each by 1
	 * if middle points the value of low then swap each and decrement low by 1
	 * if middle points the value of middle then increment it by 1
	 * once middle crossed the low, then break the loop
	 * 
	 */
	private static int[] sort210(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		else if(arr.length == 0) {
			return new int[0];
		}
		else {
			int high = 0, middle = 0, low = arr.length-1;
			while(middle <= low) {
				if(arr[middle] == 1) {
					middle++;
				}
				else if(arr[middle] == 0) {
					int temp = arr[middle];
					arr[middle] = arr[low];
					arr[low] = temp;
					low--;
				}
				else if(arr[middle] == 2) {
					int temp = arr[middle];
					arr[middle] = arr[high];
					arr[high] = temp;
					high++;
					middle++;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,0,1,2};
		int[] result = sort210(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
