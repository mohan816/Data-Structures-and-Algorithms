
public class SecondMax {
	
	public static int secondMax(int[] arr) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
		     if(arr[i] > firstMax){
		         secondMax = firstMax;
		          firstMax = arr[i];
		}
		    else if(arr[i] > secondMax){
		      secondMax = arr[i];
		}
		}
		  return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
