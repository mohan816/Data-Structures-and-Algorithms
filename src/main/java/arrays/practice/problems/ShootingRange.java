package arrays.practice.problems;

import java.util.ArrayList;

public class ShootingRange {
	
	public static int shootingRange1(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			al.add(i);
		}
		System.out.println(al);
		int count = 0;
		while(al.size() >= 2) {
			for(int j = 0; j < al.size(); j++) {
				count += al.get(j);
				
				System.out.println(al.get(j));
				al.remove(al.get(j));
			}
			
		}
		System.out.println(count);
		return count;
	}
	
	public static long shootingRange(long n) {
		if(n == 1)
			return 1;
	     int number = 2, result = 2;
	     while(number < n) {
	    	 number = number * 2;
	    	 if(number < n)
	    		 result = number;
	     }
	     long sum = 0;
	     for(int i = 1; i <= n; i++) {
	    	 sum += i;
	     }
	     System.out.println(sum - result);
	     return sum - result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shootingRange(7);

	}

}
