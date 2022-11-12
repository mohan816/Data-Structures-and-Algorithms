package hashing;

import java.util.HashSet;
import java.util.Set;

public class Nov11_MaximumNumberOfWordsYouCanType {
	
	/*
    1) Add brokenLetters in set
    2) Split the text string using spaces. get the length of each word and iterate it, if the letter in each word is present in the set then it is not possible to type so break the loop, if the letter is not there then increase the count. 
    */
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> s = new HashSet<Character>();
        for(int i = 0; i < brokenLetters.length(); i++){
            s.add(brokenLetters.charAt(i));
        }
        String[] words = text.split(" ");
        int count = 0;
        for(int i = 0; i < words.length; i++){
            int len = words[i].length();
            boolean flag = false;
            for(int j = 0; j < len; j++){
                if(s.contains(words[i].charAt(j))){
                    flag = true;
                    break;
                }
            }
        if(flag == false){
            count++;
        }
        }
       
        return count;
    }

	public static void main(String[] args) {
		/*
		 * Example 1:

Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
Example 2:

Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
Example 3:

Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.
		 */
		// TODO Auto-generated method stub

	}

}
