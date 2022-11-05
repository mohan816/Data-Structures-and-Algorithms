package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class FindCommonCharacters_Nov1 {
	
	/*
    1) Create an array list to store the string values
    2) create a map to store the elements of first string in words array
    3) Create another map to store the common characters
    5) add it to the list and return the list
    */
    public static ArrayList<String> commonChars(String[] words) {
       ArrayList<String> al = new ArrayList<String>();
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for(int i = 0; i < words[0].length(); i++){
           map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i),0)+1);
       }
       for(int i = 1; i < words.length; i++){
           HashMap<Character,Integer> dummyMap = new HashMap<Character,Integer>();
           for(int j = 0; j < words[i].length(); j++){
               if(map.containsKey(words[i].charAt(j))){
                   dummyMap.put(words[i].charAt(j), Math.min(map.get(words[i].charAt(j)),dummyMap.getOrDefault(words[i].charAt(j),0)+1));
               }
           }
            map = dummyMap;
       }
      
       for(Entry<Character,Integer> ch : map.entrySet()){
           for(int i = 0; i < ch.getValue(); i++){
               al.add(ch.getKey().toString());
           }
       }
       return al; 
    }
 

	public static void main(String[] args) {
		String[] words = {"bella","label","roller"};
		ArrayList<String> al = commonChars(words);
		//output - . "e", "l","l"
		

	}

}
