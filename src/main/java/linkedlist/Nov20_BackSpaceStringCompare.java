package linkedlist;

import java.util.LinkedList;

public class Nov20_BackSpaceStringCompare {
	//https://leetcode.com/problems/backspace-string-compare/description/
	
	public boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }
    public LinkedList<Character> backSpace(String s){
        char[] ch = s.toCharArray();
        LinkedList<Character> ls = new LinkedList<>();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '#'){
                if(!ls.isEmpty())
                  ls.removeLast();
                   }
            else
            ls.add(ch[i]);
        }
        return ls;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
		 */

	}

}
