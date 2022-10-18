package Strings.practice.problems;

public class MergeStringsAlternatively {
	
	/*
	 * 1) first start from string1 as outer loop and string 2 as inner loop...If string 1is
	 * greater than also we can  append all the characters to the merge string with the help of that loop.
	 * 2) If string2 is greater than, we need to find difference between two strings
	 * and we need to subtract string2 length with difference...Then start another loop with
	 * the the value of string2 length - difference until string2.length()
	 */
	
public static String mergeAlternately(String word1, String word2) {
        
        String s3 = "";
        int i = 0;
        for(; i < word1.length(); i++){
            s3 = s3 + word1.charAt(i);
            if(i < word2.length()){
             for(int j = i; j <= i; j++){
             s3 = s3 + word2.charAt(j);
            }
    }
            
        }
       /* if(word1.length() > word2.length()){
            int index = 0;
            index = word1.length() - word2.length();
            for(int i = index; i < word1.length(); i++ ){
                s3 = s3 + word1.charAt(i);
            }
        }
        */
        
        if(word2.length() > word1.length()){
			/*
			 * int difference = word2.length() - word1.length(); int index = word2.length()
			 * - difference;
			 */
            for(int k =  i; k < word2.length(); k++){
                s3 = s3 + word2.charAt(k);
            }
            
        }
        return s3;
}
public static void main(String[] args) {
	String s1 = "abc";
	String s2 = "abcd";
	String s3 = mergeAlternately(s1, s2);
	System.out.println(s3);
	
	
}

}
