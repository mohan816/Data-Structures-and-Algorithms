package arrays.practice.problems;

public class HappyNumber {
	
	/*// Positive - > 19
	 *Negative - > 2
	 
	 * if we square 1 and 7, then we will get 1 as result..If we square other digits from 1 to 7,we wont get 1 if we square we will get same number again
	 */
	
	//https://leetcode.com/problems/happy-number/
	//Time complexity O(n), space O(1)
	 public static boolean isHappy(int n) {
	        //using recursion
	        if(n == 1 || n == 7){
	            return true;
	        }
	        else if(n < 10){
	            return false;
	        }
	        int toStore = 0;
	        while(n > 0){
	            int r = n % 10;
	            toStore = toStore + (r * r);
	            n = n / 10;
	              }
	        boolean b = isHappy(toStore);
	        return b;
			/*
			 * if(b) { return true; } else { return false; }
			 */
	        
	         
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 19;
    boolean b = isHappy(8);
    System.out.println(b);
	}

}
