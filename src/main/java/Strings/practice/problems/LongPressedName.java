package Strings.practice.problems;

public class LongPressedName {
	//Edge - > name = "rick", typed = "kcir";
	//Positive - > name - > rick, typed - > rickkkkkkk
	//negative - > name length is not equal to typed length
	
	/*
	 * https://leetcode.com/problems/long-pressed-name/submissions/825118386/
	 * 1)Compare first index value of both strings if the values are same keep it in temp.
	 * 
	 * 2)Proceed further if the value of second string not same, compare whether it is matching
	 * with temp..if it matches increment second string index by 1 else return false.
	 * 3) After completion of while loop, if j is not equal to second string length,
	 * navigate to second while increment j and comapre the value with temp..if it not matches
	 * return false..else increment j upto string length...
	 * 4) Finally compare both i and j are equal to it respective string lengths..if yes 
	 * return true..else return false. 
	 * 
	 */
             //Time complexity - > O(n + m)
	public static boolean isLongPressedName(String name, String typed) {

		int i = 0, j = 0;
        char temp = '\u0000';
        //verifying the first letter
        if(name.charAt(i) != typed.charAt(j)) {
        	return false;
        }
        //comparing each string index values 
        while(i < name.length() && j < typed.length()){
           if(name.charAt(i) == typed.charAt(j)){
               temp = name.charAt(i);
               i++;
               j++;
           }
           else if(name.charAt(i) != typed.charAt(j) && typed.charAt(j) == temp){
               j++;
           }
            else{
                    return false;
                }
               
        }
        //if j is not equal to typed length...enter into this while loop
         while(j < typed.length()){
                    if(typed.charAt(j) == temp){
                        j++;
                    }
                    else{
                        return false;
                    }
                }
                //If both lengths are matching return true else return false
                if(i == name.length() && j == name.length()){
                    return true;
                }
                else{
                    return false;
                }
    }

	public static void main(String[] args) {

		String name = "rick", typed = "kcir";
		boolean result = isLongPressedName(name,typed);
		System.out.println(result);

	}

}
