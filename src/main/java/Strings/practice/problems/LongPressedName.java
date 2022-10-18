package Strings.practice.problems;

public class LongPressedName {

	public static boolean isLongPressedName(String name, String typed) {

		//removing consecutive duplicates
		int i = 0, j = 0;
		String stringWithoutDuplicates = ""+typed.charAt(i);
		while(j < typed.length()){
			if(typed.charAt(i) == typed.charAt(j)){
				j++;
			}
			else{
				stringWithoutDuplicates = stringWithoutDuplicates + typed.charAt(j);
				i = j;
			}
		}
		System.out.println(stringWithoutDuplicates);
		//comparing two strings each index

		if(name.equals(stringWithoutDuplicates)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		String name = "saeed", typed = "ssaaed";
		boolean result = isLongPressedName(name,typed);
		System.out.println(result);

	}

}
