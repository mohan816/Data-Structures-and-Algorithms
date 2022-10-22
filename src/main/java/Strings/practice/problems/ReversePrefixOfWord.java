package Strings.practice.problems;

public class ReversePrefixOfWord {
	
	//Positive - > String s = "abcdefd";char ch = 'd';
	//Negative- > No target character
	//Edge - > Empty String
	//https://leetcode.com/problems/reverse-prefix-of-word/description/
	/*
	 * 1) Convert it into character array
	 * 2) Create two variables an both starts with index 0.
	 * 3) check the target character is there in the array, if it is there go to that character and get the index
	 * 4) If it is not there then use break statement.
	 * 5) If it is there one variable starts with index 0 and the other one with j value..Swap both i and j..Increment i and decrement j
	 * 6) Once i crossed j or equals then come out of while loop
	 * 7) Create an empty string and append all the characters
	 */
	
	//Time Complexity - > O(n)
	 public static String reversePrefix(String word, char ch) {
		 //Converting to character array
	        char[] c = word.toCharArray();
	        int i = 0, j = 0;
	        //checking target character is there in the array
	        while(j < c.length){
	            if(c[j] == ch){
	                break;
	            }
	            else{
	                j++;
	            }
	        }
	        //if j crossed is length means there is no target character..So returning the string as it is.
	        if(j > word.length()-1){
	            return word;
	        }
	        //this loop will run array contains targeted character. Already j is there in the target character position.
	        while(i < j){
	           char dummy = c[i];
	           c[i] = c[j];
	           c[j] = dummy;
	           i++;
	           j--;
	        }
	        //adding character array values to string
	        String result = "";
	        for(int k = 0; k < c.length; k++){
	            result = result + c[k];
	        }
	        //returning the string
	        return result;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefd";
		char ch = 'd';
		String result = reversePrefix(s,ch);
		System.out.println(result);
		
		
		

	}

}
