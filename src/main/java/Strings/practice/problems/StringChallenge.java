package Strings.practice.problems;

import java.util.ArrayList;

public class StringChallenge {
	
	public static boolean stringChallenge(String str1, String str2) {
		ArrayList<Character> al = new ArrayList<>();
		for(int i = 0; i < str2.length(); i++)
			al.add(str2.charAt(i));
		for(int i = 0; i < str1.length(); i++) {
             if(al.contains(str1.charAt(i))) {
            	 char ch = str1.charAt(i);
            	 al.remove(new Character(str1.charAt(i)));
             }
				
		}
		System.out.println(al.size());
		if(al.size() == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(stringChallenge("lllll","hello"));
       System.out.println(stringChallenge("edorc","coder"));
	}
}
