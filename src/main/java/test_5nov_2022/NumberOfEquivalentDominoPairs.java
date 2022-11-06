package test_5nov_2022;

public class NumberOfEquivalentDominoPairs {
	
	//Brute force approach
	//https://leetcode.com/problems/number-of-equivalent-domino-pairs/
	
	public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        for(int i = 0; i < dominoes.length - 1; i++){
            for(int j = i + 1; j < dominoes.length; j++){
                 if((dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) || (dominoes[i][0] == dominoes[j][1] && dominoes[i][1] == dominoes[j][0])){
                     count++;
                 }
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]] Output: 3 */
		 
		 

	}

}
