package Strings.practice.problems;

public class ReverseEachWord {
	//Positive - > String s = "Let's take LeetCode contest
	//Negative - > null string
	//edge - > String with only one word
	
	/*
	 * 1) split if the space occurs
	 * 2) reverse from first word last index..COntinue until splitted length
	 */
	//https://leetcode.com/problems/reverse-words-in-a-string-iii/
	//Time Complexity - O(n^2) space O(n)
	public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitted = s.split(" ");
        for(int i = splitted.length - 1; i >= 0; i--){
               sb.append(splitted[i]+" ");
        }
        return sb.toString().trim();
        
    }
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString().trim();
	}
	/*
	 * 1) Convert a string to char array
	 * 2) create two pointers, once if you encountered the space call the reverse method
	 */
	 
	public static String reverseEachWord(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = 0;
		while(j < ch.length) {
			if(ch[j] == ' ') {
				reverse(ch, i, j-1);
				i = j + 1;
			}
			j++;
		}
		reverse(ch, i, j-1);
		StringBuilder sb = new StringBuilder();
		sb.append(ch);
		return sb.toString();
	}
	
	public static void reverse(char[] ch, int i, int j) {
		while(i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		String s = "Let's Nohan";
		String result = reverseWords(s);
=======
		String s = "Mohan Rajan Natarajan Rani";
		//String result = reverseWords(s);
		String result = reverseEachWord(s);
>>>>>>> f89aa65d0ee2304f4313b154ee331bcfa0613882
		System.out.println(result);
	}

}
