package arrays.practice.problems;

public class CountStringCharacters {
	
	public static void countCharacters(String s) {
		
		int[] count = new int[256];
		//Time COmplexity O(n)
		for(int i = 0; i < s.length(); i++) {
			//System.out.println(count[i]);
			count[s.charAt(i)]++;
		}
		
		int min = 1, max = Integer.MIN_VALUE;
		System.out.println("Minimum characters ");
		for(int i = 0; i < s.length(); i++) {
			//System.out.println(count[s.charAt(i)]);
			if(count[s.charAt(i)] == 1) {
				System.out.print(s.charAt(i)+" ");
			}
			if(count[s.charAt(i)] > max) {
				max = count[s.charAt(i)];
				
			}
		}
		//System.out.println(max);
		System.out.println();
		//int count1 = 0;
		for(int i = 0; i < s.length(); i++) {
			//if(count1 == 0) {
				if(max == count[s.charAt(i)]) {
					//count1++;
					System.out.println("Max character " +s.charAt(i));
					break;
				}
				
			}
			
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "Grass is greener on the other side";
   
    countCharacters( s.replaceAll(" ", ""));
	}

}
