package hashing;

import java.util.ArrayList;

/*https://leetcode.com/problems/jewels-and-stones/description/
 * 1) 1) convert jewels into char array
 * 2) add all the converted characters to array list
 * 3) iterate the stones and check those stones are there in array list, If it is there increase the count
 */

public class JewelsAndStones_Nov3 {
	
	public static int numJewelsInStones(String jewels, String stones) {
	    char[] ch = jewels.toCharArray();
	    int count = 0;
	    ArrayList<Character> al = new ArrayList<Character>();
	    for(int i = 0; i < ch.length; i++){
	        al.add(ch[i]);
	    }
	    for(int i = 0; i < stones.length(); i++){
	        if(al.contains(stones.charAt(i))){
	            count++;
	        }
	    }
	    return count;    
	    }

	public static void main(String[] args) {
		//Input: jewels = "aA", stones = "aAAbbbb"
		//Output: 3

	}

}
