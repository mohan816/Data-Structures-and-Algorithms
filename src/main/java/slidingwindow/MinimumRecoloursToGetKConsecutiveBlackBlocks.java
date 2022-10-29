package slidingwindow;

//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

public class MinimumRecoloursToGetKConsecutiveBlackBlocks {
	
	public int minimumRecolors(String blocks, int k) {
	     int pointer = 0, count = 0, min = Integer.MAX_VALUE;
	     while(pointer < k){
	         if(blocks.charAt(pointer++) == 'W'){
	             count++;
	         }
	     }
	         min = count; 
	       // pointer = pointer + 1 - k;
	     // System.out.print(pointer);
	      while(pointer < blocks.length()){
	       if(blocks.charAt(pointer - k) == 'W'){
	           count--;
	       }
	       if(blocks.charAt(pointer++) == 'W'){
	           count++;
	       }
	        min = Math.min(min,count);
	    }
	         return min;
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
