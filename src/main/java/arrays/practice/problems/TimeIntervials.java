package arrays.practice.problems;

public class TimeIntervials {

	public static boolean timeInterval(int[][] a) {

		for(int i = 0; i < a.length; i++) {
			int firstIndexStartDate = a[i][0], firstIndexEndDate = a[i][1]; 
			for(int j = i + 1; j < a.length; j++) {
				if((a[j][0] < firstIndexStartDate && a[j][0] < firstIndexEndDate) && (a[j][1] < firstIndexStartDate && a[j][1] < firstIndexEndDate)) {
					continue;
				}
				else if((a[j][0] > firstIndexStartDate && a[j][0] > firstIndexEndDate) && (a[j][1] > firstIndexStartDate && a[j][1] > firstIndexEndDate)) {
					continue;
				}
				else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(timeInterval(new int[][] {{0,30},{5,10},{15,20}}));
		System.out.println(timeInterval(new int[][] {{7,10},{2,4}}));
		System.out.println(timeInterval(new int[][] {{2,4},{2,4}}));
		System.out.println(timeInterval(new int[][] {{0,5},{5,6}}));
	}

}
