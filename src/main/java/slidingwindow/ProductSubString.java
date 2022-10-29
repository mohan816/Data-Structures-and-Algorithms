package slidingwindow;

//https://leetcode.com/problems/subarray-product-less-than-k/

public class ProductSubString {
	
	public static int productSubString(int[] arr, int k) {
		int product = 1, count = 0, start = 0, j = 0;
		if(k == 0) {
			return 0;
		}
		while(start < arr.length) {
			product *= arr[j];
			while(product >= k && start < arr.length) {
				start = start + 1;
				if(start == arr.length) {
					break;
				}
				product = 1;
				j = start;
				product *= arr[j];
			}
			if(product < k) {
				count++;
				j++;
			}
			if(j == arr.length) {
				start = start + 1;
				j = start;
				product = 1;
			}
		}
		return count;
		
	}
	//Optimized solution , Returning number of sub arrays which is having product less than k
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1){
            return 0;
        }
        int left = 0,prod = 1,count = 0;
        for(int right = 0; right < nums.length; right++){
            prod = prod * nums[right];
            while(prod >= k){
                prod = prod/nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
	}

	public static void main(String[] args) {
		int[] arr = {57,44,92,28,66,60,37,33,52,38,29,76,8,75,22};
		int result = numSubarrayProductLessThanK(arr,100);
		System.out.println(result);

	}

}
