package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Nov08_TownJudge {
	
	//https://leetcode.com/problems/find-the-town-judge/submissions/841773422/
		
		/*
	    1) Create a set and add all the values of zeroth index of each array(people)
	    2) Create a map and add all the values of 1st index of each array(judge)
	    3) Key which is there in map, it's frequency should match with n - 1, beacuse except him. others trust judge and also key which is there in map should not present in the set, if this condition satisfies, then return the judge, else return -1
	    */
	   
	    public int findJudge(int n, int[][] trust) {
	        if(n == 1){
	            return 1;
	        }
	        HashSet<Integer> hs = new HashSet<Integer>();
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i = 0; i < trust.length; i++){
	            hs.add(trust[i][0]);
	            map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
	        }
	        for(Integer k : map.keySet()){
	        if(map.get(k) == n - 1 && !hs.contains(k))
	            return k;
	        }
	     return -1;   
	    }
	

public static void main(String[] args) {
	/*Example 1:
     Input: n = 2, trust = [[1,2]]
		Output: 2
		
		Example 2:
        Input: n = 3, trust = [[1,3],[2,3]]
        Output: 3
		
		Example 3:

		Input: n = 3, trust = [[1,3],[2,3],[3,1]]
		Output: -1
	*/	 
}
}
