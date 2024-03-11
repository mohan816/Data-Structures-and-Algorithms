package Strings.practice.problems;

/*Check String s2 is subsequence of s1
We have to remove zero or more characters in the String s1 without changing it's order and check s1 equals s2*/


public class SubsequenceOrNot{

	public static boolean isSubsequenceOrNot(String s1, String s2) {
	      int i = 0, j = 0;
	      while(i < s1.length() && j < s2.length()) {
	    	  if(s1.charAt(i) == s2.charAt(j)) {
	    		  i++;
	    		  j++;
	    	  }
	    	  else
	    		  i++;
	      }
	      if(j == s2.length())
	    	  return true;
	    return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequenceOrNot("AEDJ", "AED"));

	}

}
