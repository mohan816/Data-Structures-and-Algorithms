package hashing;

import java.util.HashSet;

public class Nov09_FairCandySwap {
	
	 /*
    1) Count total number of candies having by both bob and alice
    2) Find their difference and divide it by 2 then store it in variable called avg, the person with more chocolate need to give more candies to 
    other person.
    3) Add the candies of alices to set
    4) Iterate bob, and check bob[k] + avg is there in the set, if it is there, then add bob[k] + avg to res[0] and bob[k] to res[1]
    
    */
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceCount = 0, bobCount = 0;
        int i = 0, j = 0;
        while(i < aliceSizes.length || j < bobSizes.length){
            if(i < aliceSizes.length){
                aliceCount = aliceCount + aliceSizes[i];
                i++;
            }
            if(j < bobSizes.length){
            bobCount = bobCount + bobSizes[j];
            j++;
            }
        }
        int[] result = new int[2];
        int avg = (aliceCount - bobCount) / 2;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int k = 0; k < aliceSizes.length; k++){
            hs.add(aliceSizes[k]);
        }
        for(int k = 0; k < bobSizes.length; k++){
            if(hs.contains(bobSizes[k] + avg)){
                    result[0] = bobSizes[k] + avg;
                    result[1] = bobSizes[k];
                    return result;
                }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]

Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]

Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
		 */

	}

}
