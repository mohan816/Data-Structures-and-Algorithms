package linkedlist;

import java.util.ArrayList;
import java.util.Stack;

public class Nov20_BaseBallGame {
	
	//https://leetcode.com/problems/baseball-game/description/
	
	public int calPoints(String[] o) {

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < o.length; i++){
            if(!st.isEmpty()){
              if(o[i].equals("+") && st.size() >= 2){
                int count = 0, k = 0;
                ArrayList<Integer> ls = new ArrayList<Integer>();
                while(k < 2){
                  int a = st.pop();
                  count = count +  a;
                  ls.add(a);
                  k++;
                }
                st.push(ls.get(1));
                st.push(ls.get(0));
                st.push(count);
            }
              else if(o[i].equals("C"))
                st.pop();
              else if(o[i].equals("D"))
                st.push(2 * st.peek());
              else
                st.push(Integer.parseInt(o[i]));
            }
            else if(!o[i].equals("+") || !o[i].equals("C") || !o[i].equals("D"))
                st.push(Integer.parseInt(o[i]));
        }
        int count = 0;
        while(!st.isEmpty()){
           count += st.pop();
        }
       return count; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
		 */

	}

}
