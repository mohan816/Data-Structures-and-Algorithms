package arrays.practice.problems;

public class ShortestDistanceToACharacter {
	

    /*
    1) need two pointers, both are starting at index 0
    2) if both are matching then, second pointer - first pointer , add the value to array, then increment second pointer to next position.
    3) if elements are not matching with target, then move second pointer to until target element. then end pointer - start pointer...incement start by 1 upto both are at same index.
    while(firstpointer < arr.length)
    positive - > given string with multiple values with target matching
    negative - > given string but values are not matching with target
    edge - string length is 1 and not matching return empty array
           string length is 1 and  matching return zero.
    */

    public int[] shortestToChar(String s, char c) {
       if(s.length() == 1 && s.charAt(0) != c){
           return new int[0];
       }
       else if(s.length() == 1 && s.charAt(0) == c){
           int[] arr = {0};
           return arr;
       }
       else{
           int firstPointer = 0, secondPointer = 0;
           int[] arr = new int[s.length()];
           int j = 0;
           while(firstPointer < s.length() && secondPointer < s.length()){
                 if(s.charAt(firstPointer) == c && s.charAt(secondPointer) == c){
                    arr[j] = secondPointer - firstPointer;
                    j++;
                    firstPointer++;
                    secondPointer++;
                 }
                 else if(s.charAt(firstPointer) != c && s.charAt(secondPointer) != c){
                     secondPointer++;
                 }
                 else if(s.charAt(firstPointer) != c && s.charAt(secondPointer) == c){
                     arr[j] = secondPointer - firstPointer;
                     j++;
                     firstPointer++;
                 }

                 }
                 return arr;
           }
       }
    public static void main(String[] args) {
    	String s = "loveleetcode"; 
    	char ch = 'e';
    	
    }
}
        
