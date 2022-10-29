package test;

public class SumOfTwoNoZero {
	
	class Solution {

	    /*
	    Test data - Edge - > 2
	    positive - > 11
	    PseudoCode :
	    1) The number should be greater than 2, if it is 2 return 1, 1
	    2) The second number should not divde by 10,
	    3) Assume first number always 2
	    */
	    public int[] getNoZeroIntegers(int n) {
	        int[] result = new int[2];
	        if(n == 2){
	        result[0] = 1;
	         result[1] = 1;
	        }
	        else{
	              int secondNumber = n - 2;
	            if(secondNumber / 10 > 100){
	                secondNumber = 999;
	            }
	            else if(secondNumber%10 == 1){
	                secondNumber = secondNumber - 1;
	            }
	            if(secondNumber == 999){
	                for(int i = 0; i < n; i++){
	                    
	                }
	            }
	           result[1] = secondNumber;
	        }
	        return result;   
	    }
	}

}
