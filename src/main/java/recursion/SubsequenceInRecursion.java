package recursion;

public class SubsequenceInRecursion {
	    
	public static boolean isSubsequence(String s1, String s2) {
		if(s2.length() == 1) {
			if(s1.charAt(0) == s2.charAt(0))
				   return true;
			return false;
		}
		else if(s1.length() == 1 && s2.length() > 1 )
			return false;
		
		  if(s1.charAt(0) == s2.charAt(0))
			  return isSubsequence(s1.substring(1), s2.substring(1));
		  else
			  return isSubsequence(s1.substring(1), s2);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(isSubsequence("ABCD", "DC"));
	}

}
