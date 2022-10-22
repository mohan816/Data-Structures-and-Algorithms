package Strings.practice.problems;

public class ReverseOnlyLetters {
	
	//Positive - > String s = "a-bC-dEf-ghIj";
	//Edge - > Empty String
	//Negative - > No Alphabets
	//https://leetcode.com/problems/reverse-only-letters/
	/*
	 * 1) Convert String into Character array
	 * 2) Create two pointers, One starts with index 0 and other one with last index
	 * 3) Use while loop, if i >= j then terminate the loop
	 * 4) Use 4 condition 1) true true 2) false true 3) true false 4) false false
	 * 5) Create one empty string and append the values
	 */

	public static String reverseOnlyLetters(String s) {
		//converting it to character array
		char[] c = s.toCharArray();
		int i = 0, j = c.length-1;
		//Ascii vlaues of english letters starts from 65 to 122
		while(i < j){
			if((c[i] >= 65 && c[i] <= 122) && (c[j] >= 65 && c[j] <= 122)){
				char ch = c[i];
				c[i] = c[j];
				c[j] = ch;
				i++;
				j--;
			}
			else if(!(c[i] >= 65 && c[i] <= 122) && (c[j] >= 65 && c[j] <= 122)){
				i++;
			}
			else if((c[i] >= 65 && c[i] <= 122) && !(c[j] >= 65 && c[j] <= 122)){
				j--;
			}
			else{
				i++;
				j--;
			}
		}
		String result = "";
		for(int k = 0; k < c.length; k++){
			result = result + c[k];
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "a-bC-dEf-ghIj";
		String s = "Test1ng-Leet=code-Q!";
		String result = reverseOnlyLetters(s);
		System.out.println(result);
	}

}
