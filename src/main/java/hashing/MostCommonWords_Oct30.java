package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/most-common-word
/*
 * 1) Remove all the special characters with space and convert it lowerCase
 * 2) Split the paragraph string using " "
 * 3) Add all the banned words to the set
 * 4) if word array word is there in set or empty string is there in word array, dont count it
 * 5) if it is not there in set and not an empty and count, return the count with highest value
 */

public class MostCommonWords_Oct30 {
	
	public static String mostCommonWord(String paragraph, String[] banned) {

	       int max = Integer.MIN_VALUE;
		String strOutput = "";

		String para = paragraph.replaceAll("[!?',;.]", " ").toLowerCase();
		String[] word = para.split(" ");
		System.out.println("word initial "+ Arrays.toString(word));

		Set<String> set = new HashSet<String>();  //O[N] for contains in set
		for (int i = 0; i < banned.length; i++) {
			set.add(banned[i]);
		}

		HashMap <String,Integer> map = new HashMap<String,Integer>();

		for (int i = 0; i < word.length; i++) {
			if(!set.contains(word[i]) && !word[i].equals("")) {
				map.put(word[i],map.getOrDefault(word[i], 0)+1);
				if(map.get(word[i] ) > max) {
					max = map.get(word[i]);
					strOutput = word[i];
				}
			}
			//max = Math.max(max, map.get(word[i]));
			


		}
		//System.out.println(strOutput);
		return strOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
		//Output: "ball"
		

	}

}
