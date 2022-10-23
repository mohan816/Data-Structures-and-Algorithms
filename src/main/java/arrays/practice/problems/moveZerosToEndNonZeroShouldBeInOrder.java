package arrays.practice.problems;

import java.util.Arrays;

// i) https://leetcode.com/problems/move-zeroes/

public class moveZerosToEndNonZeroShouldBeInOrder {
	
	public static void moveZeroes(int[] arr) {

        /*
        Initalize two variable one is at position zero and other one is at postion one
        if var1 value is zero and var2 value is non zero, then swap both and increment both the position to +1.
        if val1 value is zero and val2 value is zero, incement val2 + 1
        if both are not equal to zero val2+1
        if val1 value is not zero and val2 value is zero, val1+1
        positive - {0,1,0,3,12}
        nagative - all are non zero
        edge - {1,1,1,0,0}
        */
        int i = 0, j = 1;
        //O(n^2) space O(1)
        while(i < arr.length && j < arr.length){
            if(arr[i] == 0 && arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }
            else if(arr[i] != 0 && arr[j] != 0){
                j++;
            }
            else if(arr[i] !=0 && arr[j] == 0){
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
	}

}
