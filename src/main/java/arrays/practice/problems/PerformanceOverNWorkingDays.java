package arrays.practice.problems;

public class PerformanceOverNWorkingDays {
	
	public static int solve(int N, int[] workload) {
		int result = 0, max = 0;
		for(int i = 0; i < workload.length; i++) {
			if(workload[i] > 6) {
				result++;
			}
			else {
				max = Math.max(max,result);
				result = 0;
			}
		}
		return Math.max(max, result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(solve(12, new int[] {2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10, 2, 7, 7, 7, 7, 7, 11, 2, 3, 4}));
	}

}
