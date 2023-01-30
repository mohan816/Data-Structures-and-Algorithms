
public class StringAddNumbersOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//254abc568def7282";
		//Output = 254+568+7282=8104

		/*
		 * 1) If the ascii value of character is  <= 57, then append that character to the string
		 * buffer
		 * 2) If the ascii value is not in between >= 48 and <= 57 then the string buffer is not empty convert it into 
		 * integer and add the value to the count variable. And make the string buffer to null
		 * 3)Once at the end of the loop, return the total count
		 */
		String s = "254abc568def7282";
		char[] ch = s.toCharArray();
		int count = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] < 58) {
				sb.append(ch[i]);
			}
			else {
				if(sb.length() != 0)
					count = count + Integer.parseInt(sb.toString());
				sb = new StringBuffer();
			}
		}
		if(sb.length() != 0)
			count = count + Integer.parseInt(sb.toString());
		System.out.println(count);
	}

}

