package slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllAnagramsInAString {

	public List<Integer> findAnagramsOptimized(String s, String p) {
		if(s.length() < p.length()){
			return new ArrayList<>();
		}
		//Create two separate hash maps to store their respective characters and values
		HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> pMap = new HashMap<Character,Integer>();
		//Storing the characters in each map upto p.length()
		for(int i = 0; i < p.length(); i++){
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
		}
		//initializing left = 0, to store the index to the arraylist
		int left = 0, right = p.length();
		ArrayList<Integer> al = new ArrayList<Integer>();
		//right should be less than s.length()
		while(right < s.length()){
			//comparing each maps if they match add the index value to the list
			if(sMap.equals(pMap))
				al.add(left);
			//Adding the right character
			sMap.put(s.charAt(right), sMap.getOrDefault(s.charAt(right),0)+1);
			//removing the left side character in the window
			if(sMap.get(s.charAt(left)) == 1)
				sMap.remove(s.charAt(left));
			else
				sMap.put(s.charAt(left), sMap.get(s.charAt(left)) - 1);
			left++;
			right++;

		}
		if(sMap.equals(pMap)){
			al.add(left);
		}
		return al;
	}

	public static List<Integer> findAnagrams(String s, String p) {
		int i = 0;

		ArrayList<Integer> al = new ArrayList<Integer>();
		int len = s.length() - p.length();
		while(i < len + 1){
			int a = 0;
			int[] count = new int[26];
			for(int j = i; j < i + p.length(); j++){
				count[s.charAt(j) - 'a']++;
				count[p.charAt(a) - 'a']--;
				a++;
			}
			boolean flag = false;
			int c = 0;
			for(int k = i; k < i + p.length(); k++){
				if(count[s.charAt(k) - 'a'] == 0 && count[p.charAt(c) - 'a'] == 0){
					c++;
					continue;
				}
				else{
					flag = true;
					break;
				}
			}
			if(flag == false){
				al.add(i);
			}
			i++;
		}

		return al; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		List<Integer> result = findAnagrams(s,p);
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}


	}

}
