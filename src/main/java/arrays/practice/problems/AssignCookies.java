package arrays.practice.problems;

import java.util.Arrays;

public class AssignCookies {
	
	 /*
    Sort both the arrays
    we need compare both the array index value, if second array index value is greater or equal then we need to add count++, else increase second array by index 1
    do it for upto the end..if any one crossed the length, return count.

    edge - > both are not matching return 0
    */
    public int findContentChildren(int[] g, int[] s) {
       int count = 0;
       if(s.length == 0 || g.length == 0){
           return 0;
       }
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
