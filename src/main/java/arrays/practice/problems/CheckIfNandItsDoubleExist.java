package arrays.practice.problems;

public class CheckIfNandItsDoubleExist {
	
	 /*constraints i and both indices are not same
    then start i = 0 and j = i + 1
    first take arr[i] == 2 * arr[j] - > if matches true
    else take arr[j] == 2 * arr[i] - > if matches true

    */
    public static boolean checkIfExist(int[] arr) {
      for(int i = 0; i < arr.length - 1; i++){
          for(int j = i + 1; j < arr.length; j++){
              if(arr[i] == 2 * arr[j]){
                  return true;
              }
              else if(arr[j] == 2 * arr[i]){
                  return true;
              }
              }
          }
           return false;
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,5,3};
		System.out.println(checkIfExist(arr));

	}

}
