package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nov09_UnCommonWordsFromTwoSentences {
	
	 /*
    1) Split both the array
    2) Add the string and its frequencies in map
    3) If the map frequency is less than 2, then add it to the string and return the result.
    */
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] splitted1 = s1.split(" ");
        String[] splitted2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        int i = 0, j = 0;
        while(i < splitted1.length || j < splitted2.length){
            if(i < splitted1.length){
             map.put(splitted1[i], map.getOrDefault(splitted1[i], 0) + 1);
             i++;
        }
            if(j < splitted2.length){
            map.put(splitted2[j], map.getOrDefault(splitted2[j], 0) + 1);
             j++;
            }
        }
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() < 2)
                al.add(m.getKey());
        }
        String[] resultArray = new String[al.size()];
        for(int k = 0; k < resultArray.length; k++){
            resultArray[k] = al.get(k);
        }
            
        return resultArray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
		 */

	}

}
