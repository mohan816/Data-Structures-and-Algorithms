package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SourceAndDestination_Oct31 {
	
	//https://leetcode.com/problems/destination-city/description/
	/*
	 * 1) Navigate to list of list and add source to key and destination to value
	 * 2) then compare which destination value is not there in the key, if the destination value is not there in the key, then return it.
	 */
	
	public static String destCity(List<List<String>> paths) {
        Map<String,String> map = new HashMap<String,String>();
        for(int i = 0; i < paths.size(); i++){
            for(int j = 1; j < paths.get(i).size(); j++)
                  map.put(paths.get(i).get(0),paths.get(i).get(1));
            }
            for(Map.Entry<String,String> c : map.entrySet())
             if(!map.containsKey(c.getValue())){
                 return c.getValue();
             }
             return "";
        }

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(Arrays.asList("London","NewYork"),Arrays.asList("NewYork","Lima"),Arrays.asList("Lima","Sao Paulo"));
		String result = destCity(list);
		System.out.println(result);
		

	}

}
