package hashing;

import java.util.HashMap;

public class TwoSumSorted_Oct30 {
	
	public int[] twoSum(int[] numbers, int target) {
	       int[] result = new int[2];
	       HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	       for(int i = 0; i < numbers.length; i++){
	           if(map.containsKey(target-numbers[i])){
	                result[0] = map.get(target-numbers[i]) + 1;
	                result[1] = i + 1;
	           }
	           else{
	               map.put(numbers[i],i);
	           }
	       }
	        return result;
	    }
	public static void main(String[] args) {
		
		//Input: numbers = [2,7,11,15], target = 9
				//Output: [1,2]
	}

}
