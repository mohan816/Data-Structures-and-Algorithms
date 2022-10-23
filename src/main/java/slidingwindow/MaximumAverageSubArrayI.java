package slidingwindow;

/*
1) Use two while loops
2) first while loop upto k -1, and add the values to the sum and increment it
3) In second while loop, pointer < arr.length
4) add sum and divide by k, compare with max value, after that remove first index postion value in the sum
*/

public class MaximumAverageSubArrayI {
	
	public static double findMaxAverage(int[] nums, int k) {
        double highest = Integer.MIN_VALUE; 
        int pointer = 0;
        double sum = 0;
        while(pointer < k - 1){
            sum = sum + nums[pointer++];
        }
        while(pointer < nums.length){
            sum = sum + nums[pointer++];
            double average = sum / k;
            highest = Math.max(highest, average);
            sum -= nums[pointer - k];
        }
       return highest;
    }
   public static void main(String[] args) {
	   int[] arr = {1,12,-5,-6,50,3};
	   int k = 4;
	   double result = findMaxAverage(arr, k);
	   System.out.println(result);
   }

}
