import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveConsecutiveElements {
	
	/*
	 * Input: (red,red,blue, blue,green,green,orange, orange,orange,green,blue,red)

Output: []

Limit = 3
              1) Start a iteration from index 1, once it crossed the length, print the arraylist
              2) Create Variable count and assign it value to 1, if the  index of i-1 is matching with i, then increase the count
              check the count is matching with limit, if it matches then remove three elements and reassign i to 1 and count to 1
              3) if the index i - 1 is not matching then re-initialize the value of count to 1.
	 */
	public static void removeElements(List<String> a,int limit) {
		int count = 1, i = 1;
		for(i = 1; i < a.size(); i++) {
			//System.out.println(a.size());
			if(a.get(i).equals(a.get(i-1))) {
				count++;
				if(count == limit) {
					for(int j = i; j >= i - (limit - 1); j--)
						a.remove(j);
					count = 1;
					i = 0;
				}
			}
			else {
				count = 1;
			}
		}
		String s = "-1";
		System.out.println(Integer.parseInt(s));
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		//red,red,blue, blue,green,green,orange, orange,orange,green,blue,red
		a.add("red");
		a.add("red");
		a.add("blue");
		a.add("blue");
		a.add("green");
		a.add("green");
		a.add("orange");
		a.add("orange");
		a.add("orange");
		a.add("green");
		a.add("blue");
		a.add("red");
		removeElements(a,3);

	}

}
