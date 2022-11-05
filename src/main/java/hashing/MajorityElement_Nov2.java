package hashing;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityElement_Nov2 {
	
	/*
    1) create an HashMap add the key and it's frequency'
    2) if the frequency is greater than n/2 then return the key
    */
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Entry<Integer, Integer> n : map.entrySet()){
            if(n.getValue() > nums.length/2){
                return n.getKey();
            }
        }
        return 0;
    }

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2};
		int result = majorityElement(arr);
		System.out.println(arr);

	}

}
