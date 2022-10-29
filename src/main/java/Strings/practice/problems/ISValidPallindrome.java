package Strings.practice.problems;

public class ISValidPallindrome {
	
	//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
	//https://leetcode.com/problems/valid-palindrome-ii/
	//s = "aba", s = "abca", s = "abc"
	
	public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }
    
    /* Check is s[i...j] is palindrome. */
    private static boolean isPalindrome(String s, int i, int j) {
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }

	public static void main(String[] args) {
		String s = "aaab";
		boolean b = validPalindrome(s);
		System.out.println(b);

	}

}
