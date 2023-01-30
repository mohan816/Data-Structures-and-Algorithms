package java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNumberOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(100, 25, 3, 7, 0, 17, 27, 34 , 56, 78));
		 List<Integer> collect = al.stream().filter(a -> a % 2 == 0).sorted().collect(Collectors.toList());
		 Collections.reverse(collect);
		 System.out.println(collect);
		 
		 List<String> result = Stream.of("Mohan","Rajan","Kishore","Poovarasan").filter(i -> i.length() > 7).sorted().map(a -> a.toUpperCase()).collect(Collectors.toList());
		 System.out.println(result);
	}

}
