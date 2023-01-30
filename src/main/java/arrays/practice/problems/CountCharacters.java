package arrays.practice.problems;

public class CountCharacters {



	public static String countingSequence(String s){
		int i = 0, j = 0, count = 0;
		StringBuffer sb = new StringBuffer();
		while(j < s.length()){
			if(s.charAt(i) == s.charAt(j)){
				count++;
				j++;
			}
			else{
				sb.append(s.charAt(i));
				sb.append(count);
				count = 0;
				i = j;
			}
		}
		sb.append(s.charAt(i));
		sb.append(count);
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countingSequence("aaaAbbbccdaa"));
		>>>>>>> f89aa65d0ee2304f4313b154ee331bcfa0613882

	}

}
