import java.util.ArrayList;
import java.util.List;

public class GroupAllAnagrams {
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> al = new ArrayList<List<String>>();
	        for(int i = 0; i < strs.length; i++){
	            if(strs[i] == "-1")
	                 continue;
	            ArrayList<String> al1 = new ArrayList<String>();
	            al1.add(strs[i]);
	            char[] ch = strs[i].toCharArray();
	            int count[] = new int[26];
	            int j = 0;
	            while(j < ch.length){
	                count[ch[j] - 'a']++;
	                j++;
	            }
	              for(int k = i + 1; k < strs.length; k++){
	            	  if(strs[k] =="-1")
	            		  continue;
	                  char[] ch1 = strs[k].toCharArray();
	                  int count1[] = new int[26];
	                  int l = 0;
	               while(l < ch1.length){
	                count1[ch1[l] - 'a']++;
	                l++;
	            }
	            boolean flag = false;
	             for(int m = 0; m < count.length; m++){
	            	 int a = 99;
	                    if(count[m] != count1[m]){
	                          flag = true;
	                          break;
	                    }
	             }
	             if(flag == false){
	                 al1.add(strs[k]);
	                 strs[k] = "-1";
	             }
	        }
	        al.add(al1);
	       // System.out.print(al1);
	       // System.out.println(al);
	        }
	        System.out.println(al);
	        return al;
	    }

	public static void main(String[] args) {
		
       // groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        //groupAnagrams(new String[] {"a"});
        groupAnagrams(new String[] {""});

	}

}
