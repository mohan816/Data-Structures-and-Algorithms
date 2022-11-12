package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Nov03_UniqueMorseCode {
	
	//https://leetcode.com/problems/unique-morse-code-words/description/
	/*
	 * 1) Add all the alphabets and their respective codes in map
	 * 2) iterate through each words, and add all the respective words characters to the set
	 * 3) Finally return the set size
	 */

	public static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
        HashSet<String> hs = new HashSet<String>();
        //ArrayList<String> al = new ArrayList<String>();
        for(int i = 0; i < words.length; i++){
            String s = "";
                for(int j = 0; j < words[i].length(); j++){
                       s = s + map.get(words[i].charAt(j));
                }
               // al.add(s.trim());
                hs.add(s.trim());
            }
           // System.out.println(al);
        return hs.size();
    }
	
	//Another method
	public static int uniqueMorseRepresentations_AnotherSolution(String[] words) {
	String[] alphabet = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-.."
            ,"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    Set<String> uniqueRepresentations = new HashSet<>();
    
    for (String word : words) {
        StringBuilder newWord = new StringBuilder();
        for (char character : word.toCharArray()) 
            newWord.append(alphabet[character - 'a']);
        
        uniqueRepresentations.add(newWord.toString());
    }
    return uniqueRepresentations.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
