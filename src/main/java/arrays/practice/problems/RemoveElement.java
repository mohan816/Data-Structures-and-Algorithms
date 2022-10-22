package arrays.practice.problems;

public class RemoveElement {
	
	/*  https://leetcode.com/problems/remove-element/
	 * positive - > Array with more than one values
	 * edge - > All values matching with target.
	 * negative - > array with one value and that one is not matching with target -> return 1
	 * - > array with one value and that one is matching with target - > return 0
	 * Pointers start = 0 and end = arr.length - 1
	 * then four conditions
	 * 1) true true -> incerment count, reduce end--
	 * 2) true false -> increment count + 1 and swap , start++, end--;
	 * 3) false false - > end--
	 * 4) false true - > count++ and  end--
	 */
	
	 public static int removeElement(int[] nums, int val) {

	        if(nums.length == 1 && nums[0] == val){
	            return 0;
	        }
	        else if(nums.length == 1 && nums[0] != val){
	            return 1;
	        }
	     else {
	int count = 0, start = 0, end = nums.length - 1;
	       while(start <= end){
	            if(nums[start] != val && nums[end] == val){
	                   count++;
	                   end--;
	            }
	            else if(nums[start] == val && nums[end] != val){
	                count++;
	                nums[start] = nums[end];
	                start++;
	                end--;
	            }
	            else if(nums[start] == val && nums[end] == val){
	                count++;
	                end--;
	            }
	            else if(nums[start] != val && nums[end] != val){
	            	//count++;
	                start++;
	            }
	       }
	        return nums.length - count;
	}
	        
	       
	        
	    }
	 //optimized solution
	 public static int removeElementOptimized(int[] arr, int a) {
		 
		 int i = 0, j = arr.length-1;
		 int count = 0;
		 while(i <= j) {
			 if(arr[i] != a) {
				 count++;
				 i++;
			 }
			 else if(arr[i] == a) {
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 j--;
			 }
		 }
		 
		 return count;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,2,3,0,4,2};
		//int a = removeElement(arr, 2);
		int count = removeElementOptimized(arr, 2);
		System.out.println(count);
		

	}

}
