package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class AllAnagramsInAString {
	
	public static List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int len = s.length() - p.length();
        while(i < len + 1){
        	int a = 0;
        	int[] count = new int[26];
              for(int j = i; j < i + p.length(); j++){
              count[s.charAt(j) - 'a']++;
              count[p.charAt(a) - 'a']--;
              a++;
              }
               boolean flag = false;
               int c = 0;
               for(int k = i; k < i + p.length(); k++){
                   if(count[s.charAt(k) - 'a'] == 0 && count[p.charAt(c) - 'a'] == 0){
                	   c++;
                       continue;
                   }
                   else{
                       flag = true;
                       break;
                   }
               }
               if(flag == false){
                      al.add(i);
               }
               i++;
        }
        
       return al; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		List<Integer> result = findAnagrams(s,p);
		

	}

}
