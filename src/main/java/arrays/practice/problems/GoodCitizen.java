package arrays.practice.problems;

public class GoodCitizen {
	
	public int solve(int N, int[] Behaviour) {
		int count = 0;
		if(N == 1)
			return 1;
		if(Behaviour[0] > (0 + Behaviour[1])/2) {
			count++;
		}
		if(Behaviour[Behaviour.length - 1] > (Behaviour[Behaviour.length - 2] + 0)/2) {
			count++;
		}
		for(int i = 1; i < Behaviour.length - 1; i++) {
			if(Behaviour[i] > (Behaviour[i + 1] + Behaviour[i - 1])/2) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
