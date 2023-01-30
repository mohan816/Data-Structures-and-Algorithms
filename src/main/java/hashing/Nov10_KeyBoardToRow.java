package hashing;

import java.util.ArrayList;

public class Nov10_KeyBoardToRow {
	
	/*
    1)Create three variables to store the strings
    2)Create three count variables for each row
    3)if count is equal to the words[i].length() them add it to the String[], finally
    return the result.
    */
    
    public String[] findWords(String[] words) {
        String s1 = "QWERTYUIOPqwertyuiop";
        String s2 = "ASDFGHJKLasdfghjkl";
        String s3 = "ZXCVBNMzxcvbnm";
        ArrayList<String> al = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){
            int count1 = 0, count2 = 0, count3 = 0, len = words[i].length();
            for(int j = 0; j < len; j++){
                if(s1.contains(Character.toString(words[i].charAt(j))))
                count1++;
                else if(s2.contains(Character.toString(words[i].charAt(j))))
                count2++;
                else if(s3.contains(Character.toString(words[i].charAt(j))))
                count3++;
                if(count1 == len || count2 == len || count3 == len)
                al.add(words[i]);
}
        }
           return al.toArray(new String[al.size()]);
    }

	public static void main(String[] args) {
		/*
		 * Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:

Input: words = ["omk"]
Output: []

Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
		 */

	}

}
