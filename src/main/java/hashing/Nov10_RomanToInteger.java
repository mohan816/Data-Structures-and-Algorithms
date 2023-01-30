package hashing;

import java.util.HashMap;

public class Nov10_RomanToInteger {
	
	 /*
    1) Add all the roman symbols and the values to the map
    2) Create two variables one is for storing the count and the other one is for iteration
    3) if i + 1 is greater than i then, minus i + 1 with i and increment the i by 2
    4) If i is equal or greater than i + 1 then add i to the count
    5) if i is equal to s.length()-1 add this to count
    6) Finally, return the count.
    */
    public int romanToInt(String s) {
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int total = 0, i = 0;
    while(i < s.length()){
        if(i == s.length() - 1){
            total = total + map.get(s.charAt(i));
            i++;
        }
        else if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))){
            total = total + map.get(s.charAt(i));
            i++;
        }
        else{
            total = total + (map.get(s.charAt(i + 1)) - map.get(s.charAt(i)));
            i = i + 2;
        }
    }
    return total;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Example 1:

			Input: s = "III"
			Output: 3
			Explanation: III = 3.
			Example 2:

			Input: s = "LVIII"
			Output: 58
			Explanation: L = 50, V= 5, III = 3.
			Example 3:

			Input: s = "MCMXCIV"
			Output: 1994
			Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/

	}

}
