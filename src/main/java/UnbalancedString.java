import java.util.Stack;

public class UnbalancedString {
	
	public static boolean balancedString(String s){
		Stack<Character> s1 = new Stack<Character>();
		if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']')
		      return false;
		for(int i = 0; i < s.length(); i++){
		   if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
		       s1.push(s.charAt(i));
			   
		   else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
		            if(s.charAt(i) == '}' && s1.pop() != '{')
					           return false;
					else if(s.charAt(i) == ')' && s1.pop() != '(')
					           return false;
					else if(s.charAt(i) == ']' && s1.pop() != '[')
					           return false;
			}
					
		}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "{[[[[(())]]]]}";
		String s = "{[[[[(({))]]]]}";
        System.out.println(balancedString(s));

	}

}
