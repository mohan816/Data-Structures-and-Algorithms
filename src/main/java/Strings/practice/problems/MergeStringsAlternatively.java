package Strings.practice.problems;

public class MergeStringsAlternatively {

	//Positive - > String s1 = "abc"; String s2 = "abc";
	//edge - > String s1 = "abc", String s2 = "abcdedfg";
	//negative - > if string 1 or string 2 is null

	/* https://leetcode.com/problems/merge-strings-alternately/
	 * 1) first start from string1 as outer loop and string 2 as inner loop...If string 1 is
	 * greater than also we can  append all the characters to the merge string with the help of that loop.
	 * 2) If string2 is greater than start with the value of i in second loop and append it to newly
	 * created string
	 * the the value of string2 length - difference until string2.length()
	 */

	//Time COmplexity - O(n^2) O(n) - > space
	public static String mergeAlternately(String word1, String word2) {

		StringBuffer sb = new StringBuffer();
		int i = 0;
		for(; i < word1.length() && i < word2.length(); i++){
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));

		}
		if(word2.length() > word1.length()){
			while(i < word2.length())
				sb.append(word2.charAt(i++));
		}
		else {
			while(i < word1.length())
				sb.append(word1.charAt(i++));
			/*
			 * int difference = word2.length() - word1.length(); int index = word2.length()
			 * - difference;
			 */


		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abcd";
		String s3 = mergeAlternately(s1, s2);
		System.out.println(s3);


	}

}
