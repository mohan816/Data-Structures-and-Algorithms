package Strings.practice.problems;

public class ImplementStrStr{
	
	//function to locate the first occurrence of String x in  String s
	
	/*
	 * 1) Iterate the String s from index 0 < s.length() - x.length() - 1
	 * 2) if the character in the String s1 matches with
	 *    0th index character in String x, then iterate 
	 *    String s from that matches character index to
	 *    matches character index + x.length() - 1
	 * 3) if the variable k value is equal to x.length() then return i,
	 *    else assign k = 0, then continue the loop.
	 * 4) else return -1
	 *  
	 */
	  public static int firstOccurrence(String s, String x) {
		  int k = 0;
		  for(int i = 0; i < s.length() - x.length() - 1; i++) {
			  if(s.charAt(i) == x.charAt(0)) {
				  for(int j = i; j < i + x.length(); j++) {
					  if(s.charAt(j) == x.charAt(k))
						     k++;
				  }
				  if(k == x.length())
					  return i;
				  else
					  k = 0;
			  }
		  }
		  return -1;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Occurrence Index is "+ firstOccurrence("ababaaaaaa", "abaa"));

	}

}
