package Strings.practice.problems;

public class LongestPallindromicSubString {

	/*create an empty string
	 * for loop for upto length-1
	 * inner loop upto length - i
	 * substring j, j + i + 1
	 * store substring in local variable, the first one is empty assign to it
	 * check the substring is pallindrome if it is pallindrome check the length of the first created string, if the sub
	 * string is greater then assign it to the result string
	 * finally return result string
	 */

	//Bruteforce approach
	public static String longestPalindrome(String s) {
		if(s.length() == 1){
			return s;
		}
		String result = "";
		for(int i = 0; i <= s.length()-1; i++){
			for(int j = 0; j < s.length()-i; j++){
				String sub = s.substring(j, j + i + 1);
				if(result.isEmpty()){
					result = sub;

				}
				else{
					int k = 0, l = sub.length()-1;
					while(k <= l){
						if(sub.charAt(k) == sub.charAt(l)){
							k++;
							l--;
						}
						else{
							break;
						}
						if(k > l){
							if(result.length() < sub.length()){
								result = sub;
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	/*
    1) Take two variables one is for left navigation and the other one is for right navigation
    2) Start the loop from index 0 upto 2 * length of string
    3) Inside for loop, use while loop to navigate left and back.
    4) If both values are same, take the substring
    5) return the largest pallindromic substring
    */
	public static String longestPallindromeOptimized(String s) {
		 String max = "";
	        for(int i = 0; i < 2 * s.length(); i++){
	            int left = i/2, right = left + i % 2;
	            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
	                    String sub = s.substring(left,right+1);
	                           if(max.length() < sub.length()){
	                                 max = sub;
	                    }
	                left--;
	                right++;
	                    }     
	                }
	                
	  return max;
		
	}

	public static void main(String[] args) {

		String s = "aaaaaaaaaaaaaaaabbbbbbccccccccc";
		String result = longestPallindromeOptimized(s);
		System.out.println("longest substrig is "+result);

	}

}
