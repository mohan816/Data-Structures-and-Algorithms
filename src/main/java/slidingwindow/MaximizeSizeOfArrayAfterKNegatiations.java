package slidingwindow;

import java.util.TreeSet;

public class MaximizeSizeOfArrayAfterKNegatiations {

	public static int largestSumAfterKNegations(int[] nums, int k) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i = 0; i < nums.length; i++){
			ts.add(nums[i]);
		}
		int kCount = 0;
		while(kCount < k) {
			for(int num : ts){
				ts.add(-(num));
				ts.remove(num);
				kCount++;
				if(kCount >= k) {
					break;
				}
			}
		}
		
		int sum = 0;
		for(int num : ts){
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-2,-3};
		int result = largestSumAfterKNegations(arr, 4);
		System.out.println(result);
	}

}
