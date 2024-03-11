import java.util.*;

public class CountOccurence {
	
	public static void countOccurence(String s){
		HashMap<Character, Integer> hs = new HashMap<>();
		for(int i = 0; i < s.length(); i++){
		     if(hs.containsKey(s.charAt(i))){
		       hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
		    }
		     else{
		      hs.put(s.charAt(i), 1);
		     }
		}
		    LinkedHashMap<Character,Integer> lm = new LinkedHashMap<>();
		     while(hs.size() > 0){
		        int count = Integer.MIN_VALUE;
		        Character ch = '0', ch1 = '0';
		    for(Map.Entry<Character,Integer> h: hs.entrySet()){
		         if(h.getValue() > 1 && count < h.getValue()) {
		              count = h.getValue();
		              ch = h.getKey(); 
		          }
		         else if(h.getValue() == 1)
		        	  ch1 = h.getKey();
		   }
		    if(ch != '0') {
		    lm.put(ch,count);
		    }
		    hs.remove(ch);
		    hs.remove(ch1);
	}
		     System.out.println(lm);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     countOccurence("Mohanrajan");
	}

}
