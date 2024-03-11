import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArithmeticProgression {
	
	/*
	 * Given : In the series of numbers they have given 2nd and 3rd number in the question, and also the length of the series
	 * Expected : We need to find the number which is present on the given length, 
	 * For example if the length is 4, we need to find the number which will be present in the 4th position
	 * 
	 * Example :  _ 2 3 _ (Total length 4, we need to find the number which is present on 4 th postion)
	 * 
	 */
	
	public static int arithmeticProgression(int input1, int input2, int input3) {
		//We need to find the difference of input1 and input2
		
		int difference = input2 - input1;
		//We got the difference, if we need to find the first digit, then do input1-difference
		
		int firstDigit = input1 - difference;
		
		//to find the last digit, Multiply the length with difference, and subtract the value by 1
		int lastDigit = (difference * input3) - 1;
		
		System.out.println(lastDigit);
		// 1 2 3 4 (Expected Series)
		return lastDigit;
	}
	
	/*    1
	    2 * 2
	  3 * 3 * 3 */
	public static int[] replaceValue(int[] arr) {
		int[] answer = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int result = arr[temp];
			answer[i] = arr[result];
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
	

	public static void main(String[] args) {
		replaceValue(new int[] {3,2,0,1});
	}
	

}
