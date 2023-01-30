package three.pointers.java;

public class Sort012 {
	
	/*
	 * Test Data - > Positive 1,2,0,1,2
	 * Edge - > array with length 1
	 * Negative - > 0,1,1,2,2
	 * Pseudocode :
	 * intialize three pointers low = index 0, Middle = index 0, High = arr.length-1
	 * Start low and middle with zeroth index and high pointer in the last index
	 * if middle points value of high then swap both and decrement high by 1
	 * if middle points value of low then swap each and increment both low and high by 1
	 * if middle points value of middle then increment it by 1
	 * once middle crossed high, then break the loop
	 * 
	 */
	private static int[] sort012(int[] arr) {
		if(arr.length == 0) {
			return new int[0];
		}
		else if(arr.length == 1) {
			return arr;
		}
		else {
			int low = 0, middle = 0, high = arr.length-1;
			while(middle <= high) {
				if(arr[middle] == 0) {
					int temp = arr[middle];
					arr[middle] = arr[low];
					arr[low] = temp;
					low++;
					middle++;
				}
				else if(arr[middle] == 1) {
					middle++;
				}
				else if(arr[middle] == 2) {
					int temp = arr[middle];
					arr[middle] = arr[high];
					arr[high] = temp;
					high--;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {2,0,2,1};
		int[] result = sort012(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
