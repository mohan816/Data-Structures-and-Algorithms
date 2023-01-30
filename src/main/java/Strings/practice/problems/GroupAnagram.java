package Strings.practice.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.InputArraySorted;

public class GroupAnagram {
	/*
	 * 1) Create a Map with arguments of String and List<String>
	 * 2) Get each string value from the array and convert it into char Array and then sort it and convert it to
	 * String
	 * 3) Check the sorted String is there in the key of map, If it is there then add the Unsorted String to
	 * the Map
	 * 4) If it is not there create a List<String> then add it to the map
	 * 5) Finally Print the Map
	 */
	public static List<List<String>> groupAnagram(String[] a) {
		 Map<String, List<String>> map = new HashMap<>();
		 for(int i = 0; i < a.length; i++) {
			 StringBuffer sb = new StringBuffer();
			 //System.out.println(a[i]);
			 char[] ch = a[i].toCharArray();
			 Arrays.sort(ch);
			 String string = sb.append(ch).toString();
			  if(map.containsKey(string)) {
				  List<String> list = map.get(string);
				  list.add(a[i]);
				  map.put(string,list);
			  }
			  else {
				  List<String> list = new ArrayList<String>();
				  list.add(a[i]);
				  map.put(string, list);
			  }
		 }
		 List<List<String>> ls = new ArrayList<List<String>>();
		 for(Map.Entry<String, List<String>> m: map.entrySet()) {
			ls.add(m.getValue());
		 }
		   return ls;
		
	}
	public static void main(String[] args) {
		System.out.println(groupAnagram(new String[] {"eat","tea","tan","ate","nat","bat"}));
	}

}
