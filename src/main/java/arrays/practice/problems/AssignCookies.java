package arrays.practice.problems;

import java.util.Arrays;

public class AssignCookies {
	
	 /*
	  * Pseudo Code : 
     1) Sort both the arrays
     2) we need to compare both the array index value, if second array index value is greater or equal then we need to add count++, else increase second array by index 1
      do it for upto the end..if any one crossed the length, return count.

    edge - > both are not matching return 0
    positive - >  Input: g = [1,2,3], s = [1,1]
    negative - > child greed factors are greater than cookies
    */
    public int findContentChildren(int[] g, int[] s) {
       int count = 0;
       if(s.length == 0 || g.length == 0){
           return 0;
       }
       //Time Complexity O(nlogn + mlogm)
       Arrays.sort(g);
       Arrays.sort(s);
       int i = 0, j = 0;
       while(i < g.length && j < s.length){
           if(g[i] <= s[j]){
               count++;
               j++;
               i++;
           }
           else if(g[i] > s[j]){
               j++;
           }
       }
       return count; 
    }


}
/*
 * Input: g = [1,2,3], s = [1,1]
Output: 1
 * 
 */
