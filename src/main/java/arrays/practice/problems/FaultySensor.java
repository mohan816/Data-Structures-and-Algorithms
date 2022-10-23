package arrays.practice.problems;

public class FaultySensor {
	
	/*
	 * https://leetcode.ca/all/1826.html#:~:text=An%20experiment%20is%20being%20conducted,collected%20by%20the%20two%20sensors
	 * positve - > sensor1 = [2,3,4,5], sensor2 = [2,1,3,4]
	 * negative - > [2,2,2,2,2], sensor2 = [2,2,2,2,5]
	 * edge - [2,2,2,2,2], sensor2 = [2,2,2,2,2]
	 * 1) if i and j of respective arrays are matching then increase i  and j by 1.
	 * 2) if both are not matching then check i and j are equal to respective arrays.length - 1..If it is true then return -1
	 * 3) If both are not matching, i and j are not equal to respective arrays.length..then store those values in respective index mismatch vaiables
	 * 4) then increase i + 1 and check that value is equal to s2(second sensor stored value in index mismatch variable, then return 2, follow the
	 * same for next condition and check return 1
	 */
	
	public static int faultySensor(int[] sensor1, int[] sensor2) {
		 //two pointers
		int i = 0, j = 0;
		//index mismatch then to store
		int s1 = 0, s2 = 0;
		
		//Time Complexity : O(n), space : O(1)
		
		while(i < sensor1.length && j < sensor2.length) {
			if(sensor1[i] == sensor2[j]) {
				i++;
				j++;
			}
			else if(sensor1[i] != sensor2[j] && i == sensor1.length - 1 && j == sensor2.length - 1) {
				return -1;
				
			}
			else if(sensor1[i] != sensor2[j]) {
				s1 = sensor1[i]; 
				s2 = sensor2[j];
				if(sensor1[i + 1] == s2) {
					return 2;
				}
				else {
					return 1;
				}
				
			}
		}
	     return -1;
		
	}

	public static void main(String[] args) {
		//int[] sensor1 = {2,2,2,2,2};
		//int[] sensor2 = {2,2,2,2,5};
		
		int[] sensor1 = {2,3,2,2,3,2};
		int[] sensor2 = {2,3,2,3,2,7};
		
		int result = faultySensor(sensor1, sensor2);
		System.out.println("defect  array is " + result);
		

	}

}
