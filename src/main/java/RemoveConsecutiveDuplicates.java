import java.util.Arrays;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,10,20,20,30,30,40,40};
		int index = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[index - 1])
				arr[index++] = arr[i];
		}
		System.out.println(Arrays.toString(arr));

	}

}
